package com.rav.main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.rav.model.Item;
import com.rav.model.Query;
import com.rav.model.Restaurant;
import com.rav.model.Result;

public class DroolsHandler {
	private static boolean skipRestaurentCsvLine1 = true;
	private static boolean skipFoodCsvLine1 = true;
	
	public List<Restaurant> handle(Query query) throws IOException {
		List<Restaurant> restaurants = new ArrayList<>();
		// List<Fact> facts = new ArrayList<>();
		List<String> cities = new ArrayList<>();

		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("restaurants.csv").getFile());
		Files.lines(file.toPath()).forEach(l -> {
			if (skipRestaurentCsvLine1) {
				skipRestaurentCsvLine1 = false;
				return;
			}
			String[] parts = l.split(",");
			if (!cities.contains(parts[0])) {
				cities.add(parts[0]);
			}
			restaurants.add(new Restaurant(parts[0], parts[1], new Boolean(parts[2]), 0));
		});

		file = new File(classLoader.getResource("food.csv").getFile());
		Files.lines(file.toPath()).forEach(l -> {
			if (skipFoodCsvLine1) {
				skipFoodCsvLine1 = false;
				return;
			}
			String[] parts = l.split(",");

			restaurants.get(restaurants.indexOf(new Restaurant(parts[0], parts[1]))).getItems()
					.add(new Item(parts[2], 0f));
			// System.out.println(restaurants.get(restaurants.indexOf(new
			// Restaurant(parts[0], parts[1]))).getItems().contains("pizza"));
		});
		List<Item> items = new ArrayList<>();
		items.add(new Item("pizza", 0f));
		System.out.println(items.contains("pizza"));

		/*
		 * cities.forEach(c -> { facts.add(new Fact(Restaurant.DELIVERY + "_" + c, c));
		 * facts.add(new Fact(Restaurant.DINE_IN + "_" + c, c)); });
		 * 
		 * restaurants.forEach(r -> { facts.add(new Fact(r.getName(), r.getDineType()));
		 * r.getItems().forEach(i -> { facts.add(new Fact(i.getName(), r.getName()));
		 * });
		 * 
		 * });
		 */

		Result result = new Result();
		// load up the knowledge base
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		final KieSession kSession = kContainer.newKieSession("ksession-rules");

		kSession.setGlobal("result", result);
		kSession.setGlobal("q", query);

		/*
		 * facts.forEach(f -> { System.out.println(f); kSession.insert(f); });
		 */

		restaurants.forEach(r -> {
			kSession.insert(r);
		});
		System.out.println("----------------------------------------");

		kSession.fireAllRules();

		restaurants.sort((r1, r2) -> r2.getRate() - r1.getRate());
		// System.out.println(result.getValue());
		restaurants.forEach(r -> {
			System.out.println(r.getName() + "," + r.getRate() + "," + r.getJustification());
		});

		return restaurants;
		/*result.getRestaurants().forEach(r -> {
			System.out.println("Result" + r.getName() + "," + r.getRate());
		});*/
	}
}
