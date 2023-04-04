package jsonpath;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.jayway.jsonpath.JsonPath;

public class JsonPathParsingEveryTime {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File jsonFile = new File("src/test/resources/book.json");
		
		List<Object> priceList = JsonPath.read(jsonFile, "$..price");
		
		for (Object price : priceList) {
			System.out.println(price);
		}
		
		
	}

}
