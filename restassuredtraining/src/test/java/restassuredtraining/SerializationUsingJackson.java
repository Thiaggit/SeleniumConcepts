package restassuredtraining;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;

public class SerializationUsingJackson {

	public void Serialization() {
		List<String> skills = new ArrayList<String>();
		skills.add("java");
		skills.add("selenium");
		
		Map<String, Object> jsonObject = new HashMap<String, Object>();
		
		jsonObject.put("First_name", "Thiagarajan");
		jsonObject.put("Last_name", "Loganathan");
		jsonObject.put("Email", "thiagarajan.42@gmail.com");
		
		jsonObject.put("Skills", skills);
		
		RestAssured.given().baseUri("http://localhost:3000").header("Content-Type","application/json").body(jsonObject).log().all().
		            when().put("/employees").
		            then().log().all();		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SerializationUsingJackson obj = new SerializationUsingJackson();
		obj.Serialization();
	}

}
