package javanetAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HTTPURLConnectionGETExample {

	public void getRequestExample() throws IOException {
		URL url = new URL("https://reqres.in/api/users/11");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("GET");
		connection.connect();
		
		int statusCode = connection.getResponseCode();
		String responseMessage = connection.getResponseMessage();
		System.out.println("The Status code is "+ statusCode + "The Status Message is "+ responseMessage);
		
		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		
		BufferedReader bufferReader = new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while((line = bufferReader.readLine())!=null) {
			buffer.append(line);
			System.out.println("The json response is "+ line);
		}
	} 
	
	public static void main(String[] args) throws IOException {
		HTTPURLConnectionGETExample obj = new HTTPURLConnectionGETExample();
		obj.getRequestExample();
	}
	
}
