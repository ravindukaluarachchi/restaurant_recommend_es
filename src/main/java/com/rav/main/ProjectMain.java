package com.rav.main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.util.SystemOutLogger;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.rav.model.Item;
import com.rav.model.Query;
import com.rav.model.Restaurant;
import com.rav.model.Result;
import com.rav.pages.FindPage;
import com.rav.pages.HomePage;

public class ProjectMain extends AbstractHandler {
	

	public static void main(String[] args) throws Exception {
		Server server = new Server(8080);
		server.setHandler(new ProjectMain());

		server.start();
		server.join();

		// new Drools2().start();

	}

	public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		response.setContentType("text/html;charset=utf-8");
		response.setStatus(HttpServletResponse.SC_OK);
		baseRequest.setHandled(true);
		if(request.getRequestURI().equals("/find")) {
			Query query = new Query(request.getParameter("city"), request.getParameter("item"), new Boolean(request.getParameter("deliver")), 100.00f, 300.00f);
			System.out.println(query);
			List<Restaurant> restaurants = new DroolsHandler().handle(query);
			response.getWriter().println(new FindPage().content(restaurants));
		}else {
			response.getWriter().println(new HomePage().content());
		}
		
	}

	

}
