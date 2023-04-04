package restassuredtraining;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class RestAssuredBDD {

	@Test(enabled=false)
	public void CreateAnEmployee() {
		File jsonFile = new File("postData.json");
		RestAssured.
		given().baseUri("http://localhost:3000").
		header("Content-Type","application/json").
		body(jsonFile).
		when().
		post("/employees").
		prettyPrint();
	}

	@Test(enabled=false)
	public void GetAllEmployees() {
		RestAssured.
		given().baseUri("http://localhost:3000").
		when().
		get("/employees").prettyPrint();
	}
	
	
	
	@Test(enabled=false)
	public void CreateAnEmployeee() {
		RestAssured.given().baseUri("http://localhost:3000").header("Content-Type","application/json").body("{\r\n"
				+ "    \"first_name\": \"Jose\",\r\n"
				+ "    \"last_name\": \"Hunt\",\r\n"
				+ "    \"email\": \"Jose.Hunt@abc.com\"\r\n"
				+ "  }").when().post("/employees").prettyPrint();
	}
	
	@Test(enabled=false)
	public void UpdateAnEmployee() {
		RestAssured.given().baseUri("http://localhost:3000").header("Content-Type","application/json").body("{\r\n"
				+ "  \"first_name\": \"Lisandro\",\r\n"
				+ "  \"last_name\": \"Martinez\",\r\n"
				+ "  \"email\": \"Licha@mufc.com\",\r\n"
				+ "  \"id\": 32\r\n"
				+ "}").when().put("/employees/32").prettyPrint();
	}
	
	@Test
	public void DeleteAnEmployee() {
		RestAssured.
		given().baseUri("http://localhost:3000").
		when().delete("/employees/26").
		prettyPrint();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
