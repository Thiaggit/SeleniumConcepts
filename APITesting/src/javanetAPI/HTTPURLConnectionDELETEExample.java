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

public class HTTPURLConnectionDELETEExample {
	
	public void deleteRequestExample() throws IOException {
		URL url = new URL("https://reqres.in/api/users/2YYYYYYY");
		HttpURLConnection connection =(HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("DELETE");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		connection.connect();
		
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
		HTTPURLConnectionDELETEExample obj = new HTTPURLConnectionDELETEExample();
		obj.deleteRequestExample();
	}

}
