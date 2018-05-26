package com.rav.pages;

public class HomePage {
	public String content() {
		String content = "<!doctype html>\n" + 
				"<html lang=\"en\">\n" + 
				"  <head>\n" + 
				"    <!-- Required meta tags -->\n" + 
				"    <meta charset=\"utf-8\">\n" + 
				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" + 
				"\n" + 
				"    <!-- Bootstrap CSS -->\n" + 
				"    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" integrity=\"sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB\" crossorigin=\"anonymous\">\n" + 
				"\n" + 
				"    <title>Hello, world!</title>\n" + 
				"  </head>\n" + 
				"  <body>\n" + 
				"    <div class=\"jumbotron\">\n" + 
				"  <h1 class=\"display-4\">Restaurant Recommender</h1>\n" + 
				"  <p class=\"lead\">Simple expert system using drools.</p>\n" + 
				"  <hr class=\"my-4\">\n" + 
				"  <p>By Ravindu Kaluarachchi.</p>\n" + 
				" \n" + 
				"</div>\n" + 
				"\n" + 
				"<form action=\"http://localhost:8080/find\">\n" + 
				"  <div class=\"form-group\">\n" + 
				"    <label for=\"exampleInputEmail1\">Where are you?</label>\n" + 
				"    <input class=\"form-control\"   placeholder=\"Your City\" name=\"city\">\n" + 
				"  </div>\n" + 
				"  <div class=\"form-group\">\n" + 
				"    <label for=\"exampleInputEmail1\">What do you plan to eat?</label>\n" + 
				"    <input class=\"form-control\"   placeholder=\"Your City\" name=\"item\">\n" + 
				"  </div>\n" + 
				"  <div class=\"form-check\">\n" + 
				"  <input class=\"form-check-input\" type=\"radio\" name=\"deliver\" id=\"exampleRadios1\" value=\"true\" checked>\n" + 
				"  <label class=\"form-check-label\" for=\"exampleRadios1\">\n" + 
				"    Deliver\n" + 
				"  </label>\n" + 
				"  </div>\n" + 
				"  <div class=\"form-check\">\n" + 
				"  <input class=\"form-check-input\" type=\"radio\" name=\"deliver\" id=\"exampleRadios2\" value=\"false\">\n" + 
				"  <label class=\"form-check-label\" for=\"exampleRadios2\">\n" + 
				"    Dine In\n" + 
				"  </label>\n" + 
				"</div>\n" + 
				"  <button type=\"submit\" class=\"btn btn-primary btn-lg\">Find</button>\n" + 
				"</form>\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"\n" + 
				"    <!-- Optional JavaScript -->\n" + 
				"    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n" + 
				"    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n" + 
				"    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n" + 
				"    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\" integrity=\"sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T\" crossorigin=\"anonymous\"></script>\n" + 
				"  </body>\n" + 
				"</html>";
		return content;
	}
}
