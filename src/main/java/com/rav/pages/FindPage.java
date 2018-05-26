package com.rav.pages;

import java.util.List;

import org.drools.compiler.rule.builder.dialect.java.parser.JavaParser.formalParameter_return;

import com.rav.model.Restaurant;

public class FindPage {
	public String content(List<Restaurant> restaurants) {
		String content = "<!doctype html>\n" + "<html lang=\"en\">\n" + "  <head>\n"
				+ "    <!-- Required meta tags -->\n" + "    <meta charset=\"utf-8\">\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n"
				+ "\n" + "    <!-- Bootstrap CSS -->\n"
				+ "    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" integrity=\"sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB\" crossorigin=\"anonymous\">\n"
				+ "\n" + "    <title>Hello, world!</title>\n" + "  </head>\n" + "  <body>\n"
				+ "    <div class=\"jumbotron\">\n" + "  <h1 class=\"display-4\">Restaurant Recommender</h1>\n"
				+ "  <p class=\"lead\">Simple expert system using drools.</p>\n" + "  <hr class=\"my-4\">\n"
				+ "  <p>By Ravindu Kaluarachchi.</p>\n" + " \n" + "</div>\n" + "\n"
				+ "<h1 style=\"margin-left:5%\">We Recommend: </h1>\n"
				+ "<div class=\"list-group\" style=\"padding:5%\">\n";
		for (int i = 0; i < restaurants.size(); i++) {
			String active = "";
			if (i == 0) {
				active = "active";
			}
			content += "  <a href=\"#\" class=\"list-group-item list-group-item-action flex-column align-items-start " + active + "\">\n"
					+ "    <div class=\"d-flex w-100 justify-content-between\">\n"
					+ "      <h5 class=\"mb-1\">" + restaurants.get(i).getName() + " </h5>  \n" + "<small>" + restaurants.get(i).getCity().toUpperCase() +"</small>    \n" + "    </div>\n" + "\n"
					+ "    <p class=\"mb-1\">Reason: " + restaurants.get(i).getJustification() + "</p>\n" + "\n" + "  </a>\n";
		}
		content += "  \n" + "</div>\n" + "\n" + "\n" + "\n" + "    <!-- Optional JavaScript -->\n"
				+ "    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n"
				+ "    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n"
				+ "    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n"
				+ "    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\" integrity=\"sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T\" crossorigin=\"anonymous\"></script>\n"
				+ "  </body>\n" + "</html>";
		return content;
	}
}
