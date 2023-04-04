package restassuredtraining;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONWriting {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("Name", "Thiagarajan");
		jsonObject.put("Age", 29);
		
		JSONArray array = new JSONArray();
		array.add("Java");
		array.add("Manual");
		
		jsonObject.put("Skills", array);
		
		FileWriter writer = new FileWriter("thiagarajan.json");
		writer.write(jsonObject.toJSONString());
		writer.close();

	}

}
