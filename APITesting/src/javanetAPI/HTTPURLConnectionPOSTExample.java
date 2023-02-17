package javanetAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HTTPURLConnectionPOSTExample {
	
	public void postRequestExample() throws IOException {
		URL url = new URL("https://reqres.in/api/users");
		HttpURLConnection connection =(HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		connection.connect();
		
		String jsonBody = "{\"name\"/: \"morpheus\",\"job\": \"leader\"}";
		byte[] inputjson = jsonBody.getBytes();
		
		OutputStream outputStream = connection.getOutputStream();
		outputStream.write(inputjson);
		
		int statusCode = connection.getResponseCode();
	    String statusMessage = connection.getResponseMessage();
	    System.out.println("The Status code and message are " + statusCode + statusMessage);
	    
	    InputStream inputStream = connection.getInputStream();
	    InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
	    BufferedReader bufferReader = new BufferedReader(inputStreamReader);
	    String line;
	    StringBuffer buffer = new StringBuffer();
	    while((line = bufferReader.readLine())!=null) {
	    	buffer.append(line);
	    	System.out.println("The json response " + line);
	    }
	    
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		HTTPURLConnectionPOSTExample obj = new HTTPURLConnectionPOSTExample();
		obj.postRequestExample();
	}

}
