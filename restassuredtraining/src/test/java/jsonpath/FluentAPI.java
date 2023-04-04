package jsonpath;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class FluentAPI {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File jsonFile = new File("src/test/resources/book.json");

		DocumentContext context = JsonPath.parse(jsonFile);
		
		List<Object> priceList = context.read("$..price");

		for (Object price : priceList) {
			System.out.println(price);
		}
	}
	}


