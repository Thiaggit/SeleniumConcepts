package authorization;

import io.restassured.RestAssured;

public class BasicAuth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.given().
		auth().basic("postman", "password").baseUri("https://postman-echo.com").
		when().get("/basic-auth").
		prettyPrint();
	}

}
