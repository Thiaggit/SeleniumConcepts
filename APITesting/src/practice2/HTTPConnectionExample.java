package practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HTTPConnectionExample {

	public void getMethodEx() throws IOException {
		URL url = new URL("https://dummy.restapiexample.com/api/v1/employees");
		HttpURLConnection connection =  (HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("GET");
		connection.connect();
		
		int statusCode = connection.getResponseCode();
		String statusMessage = connection.getResponseMessage();
		
		System.out.println("The Status code is " + statusCode);
		System.out.println("The Status message is " + statusMessage);
		
		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferReader = new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while((line=bufferReader.readLine())!=null) {
			buffer.append(line);
			System.out.println("The json response is " + line);
		}
	}
	
	public void postMethodEx() throws IOException {
		URL url = new URL("https://dummy.restapiexample.com/api/v1/create");
		HttpURLConnection connection =  (HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		connection.connect();
		
		String inputJson = "{\"name\":\"test\",\"salary\":\"123\",\"age\":\"23\"}";
		byte[] jsonByte = inputJson.getBytes();
		
		OutputStream outputStream = connection.getOutputStream();
		outputStream.write(jsonByte);
		
		int statusCode = connection.getResponseCode();
		String statusMessage = connection.getResponseMessage();
		
		System.out.println("The Status code is " + statusCode);
		System.out.println("The Status message is " + statusMessage);
		
		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferReader = new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while((line=bufferReader.readLine())!=null) {
			buffer.append(line);
			System.out.println("The json response is " + line);
		}
	}
	
	public void putMethodEx() throws IOException {
		URL url = new URL("https://dummy.restapiexample.com/api/v1/update/21");
		HttpURLConnection connection =  (HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("PUT");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		connection.connect();
		
		String inputJson = "{\"name\":\"test\",\"salary\":\"123\",\"age\":\"29\"}";
		byte[] jsonByte = inputJson.getBytes();
		
		OutputStream outputStream = connection.getOutputStream();
		outputStream.write(jsonByte);
		
		int statusCode = connection.getResponseCode();
		String statusMessage = connection.getResponseMessage();
		
		System.out.println("The Status code is " + statusCode);
		System.out.println("The Status message is " + statusMessage);
		
		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferReader = new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while((line=bufferReader.readLine())!=null) {
			buffer.append(line);
			System.out.println("The json response is " + line);
		}
	}
	
	public void deleteMethodEx() throws IOException {
		URL url = new URL("https://dummy.restapiexample.com/api/v1/update/21");
		HttpURLConnection connection =  (HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("DELETE");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		connection.connect();
		
		int statusCode = connection.getResponseCode();
		String statusMessage = connection.getResponseMessage();
		
		System.out.println("The Status code is " + statusCode);
		System.out.println("The Status message is " + statusMessage);
		
		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferReader = new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while((line=bufferReader.readLine())!=null) {
			buffer.append(line);
			System.out.println("The json response is " + line);
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		HTTPConnectionExample obj = new HTTPConnectionExample();
		//obj.getMethodEx();
		//obj.postMethodEx();
		//obj.putMethodEx();
		obj.deleteMethodEx();
	}

}

