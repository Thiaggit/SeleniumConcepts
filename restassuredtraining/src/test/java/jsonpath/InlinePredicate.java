package jsonpath;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.jayway.jsonpath.JsonPath;

public class InlinePredicate {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File jsonFile = new File("src/test/resources/book.json");
		
		List<Map<String, Object>> result = JsonPath.parse(jsonFile).read("$.store.book.[?(@.price<10 && @.category=='fiction')]");
		
		System.out.println(result);
	}

}
