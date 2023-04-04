package jsonschemavalidation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

public class JsonSchemaValidationUsingHamcrest {

	@Test
	public void JsonSchemaValidatorwithHamcrest() throws IOException {
		File inputJson = new File("src/test/resources/input.json");
		
		String jsonContent = FileUtils.readFileToString(inputJson);
		
		File schemaJson = new File("src/test/resources/schema.json");
		
		MatcherAssert.assertThat(jsonContent, JsonSchemaValidator.matchesJsonSchema(schemaJson));
		
	}
}
