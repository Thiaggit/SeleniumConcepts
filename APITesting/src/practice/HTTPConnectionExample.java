package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HTTPConnectionExample {

	public void getMethodEX() throws IOException {

		URL url = new URL("https://dummy.restapiexample.com/api/v1/employees");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();	

		int statusCode = connection.getResponseCode();
		String statusMessage = connection.getResponseMessage();

		System.out.println("The Status code and message are " + statusCode + statusMessage);

		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while((line=bufferedReader.readLine())!=null) {
			buffer.append(line);
			System.out.println("The json response is " + line);
		}

	}

	public void postMethodEX() throws IOException {

		URL url = new URL("https://dummy.restapiexample.com/api/v1/create");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		
		
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		connection.connect();
		
		String jsonBody = "{\"name\":\"test\",\"salary\":\"123\",\"age\":\"23\"}";
		byte[] jsonByte = jsonBody.getBytes();
		
		OutputStream outputStream = connection.getOutputStream();
		outputStream.write(jsonByte);
		
		int statusCode = connection.getResponseCode();
		String statusMessage = connection.getResponseMessage();

		System.out.println("The Status code and message are " + statusCode + statusMessage);

		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while((line=bufferedReader.readLine())!=null) {
			buffer.append(line);
			System.out.println("The json response is " + line);
		}

	}
	
	public void putMethodEX() throws IOException {

		URL url = new URL("https://dummy.restapiexample.com/api/v1/update/21");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		
		
		connection.setRequestMethod("PUT");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		connection.connect();
		
		String jsonBody = "{\"name\":\"test\",\"salary\":\"123\",\"age\":\"29\"}";
		byte[] jsonByte = jsonBody.getBytes();
		
		OutputStream outputStream = connection.getOutputStream();
		outputStream.write(jsonByte);
		
		int statusCode = connection.getResponseCode();
		String statusMessage = connection.getResponseMessage();

		System.out.println("The Status code and message are " + statusCode + statusMessage);

		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while((line=bufferedReader.readLine())!=null) {
			buffer.append(line);
			System.out.println("The json response is " + line);
		}

	}
	
	public void deleteMethodEX() throws IOException {

		URL url = new URL("https://dummy.restapiexample.com/api/v1/delete/2");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("DELETE");
		connection.connect();	

		int statusCode = connection.getResponseCode();
		String statusMessage = connection.getResponseMessage();

		System.out.println("The Status code and message are " + statusCode + statusMessage);

		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while((line=bufferedReader.readLine())!=null) {
			buffer.append(line);
			System.out.println("The json response is " + line);
		}

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		HTTPConnectionExample obj = new HTTPConnectionExample();
		//obj.getMethodEX();
		//obj.postMethodEX();
		//obj.putMethodEX();
		obj.deleteMethodEX();
	}

}
