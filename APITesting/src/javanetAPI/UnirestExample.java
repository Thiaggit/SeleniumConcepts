package javanetAPI;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class UnirestExample {

	public void getUnirestExample() throws UnirestException {
		HttpResponse<JsonNode> jsonResponse = Unirest.get("https://reqres.in/api/users/11").asJson();

		System.out.println("The status code is "+ jsonResponse.getStatus());
		System.out.println("The status code is "+ jsonResponse.getStatusText());
		System.out.println("The status code is "+ jsonResponse.getBody());
	}

	public void postUnirestExample() throws UnirestException {
		HttpResponse<JsonNode> jsonResponse = Unirest.post("{\"name\":\"morpheus\",\"job\":\"leader\"}").asJson();

		System.out.println("The status code is "+ jsonResponse.getStatus());
		System.out.println("The status code is "+ jsonResponse.getStatusText());
		System.out.println("The status code is "+ jsonResponse.getBody());
	}

	public void putUnirestExample() throws UnirestException {
		HttpResponse<JsonNode> jsonResponse = Unirest.put("{\"name\":\"morpheus\",\"job\":\"leader\"}").asJson();

		System.out.println("The status code is "+ jsonResponse.getStatus());
		System.out.println("The status code is "+ jsonResponse.getStatusText());
		System.out.println("The status code is "+ jsonResponse.getBody());
	}

	public void deleteUnirestExample() throws UnirestException {
		HttpResponse<JsonNode> jsonResponse = Unirest.delete("https://reqres.in/api/users/11").asJson();

		System.out.println("The status code is "+ jsonResponse.getStatus());
		System.out.println("The status code is "+ jsonResponse.getStatusText());
		System.out.println("The status code is "+ jsonResponse.getBody());
	}

	public static void main(String[] args) throws UnirestException {
		// TODO Auto-generated method stub

		UnirestExample obj = new UnirestExample();
		//obj.getUnirestExample();
		//obj.postUnirestExample();
		//obj.putUnirestExample();
		obj.deleteUnirestExample();
	}

}
