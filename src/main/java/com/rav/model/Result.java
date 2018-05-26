package com.rav.model;

import java.util.ArrayList;
import java.util.List;

public class Result {
	private String value;
	private List<Restaurant> restaurants = new ArrayList<>();

	public Result() {
	}

	public Result(String value, List<Restaurant> restaurants) {
		super();
		this.value = value;
		this.restaurants = restaurants;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public List<Restaurant> getRestaurants() {
		return restaurants;
	}

	public void setRestaurants(List<Restaurant> restaurant) {
		this.restaurants = restaurant;
	}

	 public void addRestaurant(Restaurant Restaurant) {
	        this.restaurants.add(Restaurant);
	}
}
