package jsonpath;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;

public class JsonPathParsingOnetime {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream jsonFile = new FileInputStream("src/test/resources/book.json");

		Object parsedJson = Configuration.defaultConfiguration().jsonProvider().parse(jsonFile.readAllBytes());
		
		List<Object> priceList = JsonPath.read(parsedJson, "$..price");

		for (Object price : priceList) {
			System.out.println(price);
		}
	}

}
