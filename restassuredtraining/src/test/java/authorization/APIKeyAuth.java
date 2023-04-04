package authorization;

import io.restassured.RestAssured;

public class APIKeyAuth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.given().
		queryParam("q", "Salem").queryParam("appid", "dc610b9df229aed378a8182cc5f344c7").
		when().get("https://api.openweathermap.org/data/2.5/weather").
		prettyPrint();
	}

}
