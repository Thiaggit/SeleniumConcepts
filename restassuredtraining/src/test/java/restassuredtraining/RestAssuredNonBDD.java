package restassuredtraining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredNonBDD {

	@Test(enabled=false)
	public void getAllEmployees() {
		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification requestSpecification = RestAssured.given();
		Response response = requestSpecification.request(Method.GET, "employees");
		System.out.println(response.asPrettyString());
		System.out.println(response.statusLine());
	}

	@Test(enabled=false)
	public void createAnEmployee() {
		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification requestSpecification = RestAssured.given().header("Content-Type","application/json").body("{\r\n"
				+ "    \"first_name\": \"Denzel\",\r\n"
				+ "    \"last_name\": \"Eschweiler\",\r\n"
				+ "    \"email\": \"denzel@codingthesmartway.com\"\r\n"
				+ "  }");
		Response response = requestSpecification.request(Method.POST, "employees");
		System.out.println(response.asPrettyString());
		System.out.println(response.statusLine());
	}

	@Test(enabled=false)
	public void UpdateAnEmployee() {
		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification requestSpecification = RestAssured.given().header("Content-Type","application/json").body("{\r\n"
				+ "    \"first_name\": \"Marcus\",\r\n"
				+ "    \"last_name\": \"Rashford\",\r\n"
				+ "    \"email\": \"marcus.rash@mufc.com\",\r\n"
				+ "    \"id\": 7\r\n"
				+ "  }");
		Response response = requestSpecification.request(Method.PUT, "employees/7");
		System.out.println(response.asPrettyString());
		System.out.println(response.statusLine());
	}
	
	@Test
	public void deleteAnEmployee() {
		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification requestSpecification = RestAssured.given();
		Response response = requestSpecification.request(Method.DELETE,"employees/15");
		System.out.println(response.asPrettyString());
		System.out.println(response.statusLine());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub



	}

}
