package jsonschemavalidation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion.VersionFlag;
import com.networknt.schema.ValidationMessage;

import groovyjarjarantlr4.v4.misc.EscapeSequenceParsing.Result;

public class JsonSchemaValidationNetworkNT {

	@Test
	public void JsonSchemaValidatorUsingNetworkNT() throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		JsonSchemaFactory factory = JsonSchemaFactory.getInstance(VersionFlag.V4);
		
		File inputJson = new File("src/test/resources/input.json");
		InputStream schemaJson = new FileInputStream("src/test/resources/schema.json");
		
		JsonNode jsonNode = mapper.readTree(inputJson);
		
		JsonSchema schema = factory.getSchema(schemaJson);
		
		Set<ValidationMessage> result = schema.validate(jsonNode);
		
		if(result.isEmpty()) {
			System.out.println("No Validation errors");
		}else {
			for (ValidationMessage validationMessage : result) {
				System.out.println(validationMessage);
			}
		}
	}
}
