package practice;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class UnirestPractice {
	
	public void getMethodEx() throws UnirestException {
		HttpResponse<JsonNode> jsonResponse =  Unirest.get("https://dummy.restapiexample.com/api/v1/employees").asJson();
		System.out.println("The Status code is " + jsonResponse.getStatus());
		System.out.println("The Status message is " + jsonResponse.getStatusText());
		System.out.println("The json response is " + jsonResponse.getBody());
	}

	public void postMethodEx() throws UnirestException {
		HttpResponse<JsonNode> jsonResponse =  Unirest.post("https://dummy.restapiexample.com/api/v1/create").body("{\"name\": \"morpheus\",\"job\": \"leader\"}").asJson();
		System.out.println("The Status code is " + jsonResponse.getStatus());
		System.out.println("The Status message is " + jsonResponse.getStatusText());
		System.out.println("The json response is " + jsonResponse.getBody());
	}
	
	public void putMethodEx() throws UnirestException {
		HttpResponse<JsonNode> jsonResponse =  Unirest.put("https://dummy.restapiexample.com/api/v1/create").body("{\"name\": \"morpheus\",\"job\": \"leader\"}").asJson();
		System.out.println("The Status code is " + jsonResponse.getStatus());
		System.out.println("The Status message is " + jsonResponse.getStatusText());
		System.out.println("The json response is " + jsonResponse.getBody());
	}
	
	public void deleteMethodEx() throws UnirestException {
		HttpResponse<JsonNode> jsonResponse =  Unirest.delete("https://dummy.restapiexample.com/api/v1/create").body("{\"name\": \"morpheus\",\"job\": \"leader\"}").asJson();
		System.out.println("The Status code is " + jsonResponse.getStatus());
		System.out.println("The Status message is " + jsonResponse.getStatusText());
		System.out.println("The json response is " + jsonResponse.getBody());
	}
	
	public static void main(String[] args) throws UnirestException {
		// TODO Auto-generated method stub
		UnirestPractice obj = new UnirestPractice();
		obj.getMethodEx();
	}

}
