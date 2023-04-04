package jsonpath;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.jayway.jsonpath.Criteria;
import com.jayway.jsonpath.Filter;
import com.jayway.jsonpath.JsonPath;

public class FilterAPIPredicate {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File jsonFile = new File("src/test/resources/book.json");
		
		Filter priceLessThanTen = Filter.filter(Criteria.where("price").lt(10));
		
		List<Map<String,Object>> result = JsonPath.parse(jsonFile).read("$.store.book[?]",priceLessThanTen);
		
		System.out.println(result);
	}

}
