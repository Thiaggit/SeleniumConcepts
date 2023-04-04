package jsonschemavalidation;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class JsonSchemaValidationRestAssured {

	@Test
	public void jsonSchemaValidationInClassPath() {
		File inputJson = new File("src/test/resources/input.json");

		RestAssured.given().
		baseUri("http://localhost:3000").
		header("Content-Type","application/json").
		body(inputJson).
		when().
		post("/employees").
		then().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.json"));
	}

	@Test(enabled=false)
	public void jsonSchemaValidationWithoutClassPath() {
		File inputJson = new File("src/test/resources/input.json");
		File schemaJson = new File("src/test/resources/schema.json");

		RestAssured.given().
		baseUri("http://localhost:3000").
		header("Content-Type","application/json").
		body(inputJson).
		when().
		post("/employees").
		then().body(JsonSchemaValidator.matchesJsonSchema(schemaJson));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}

}
