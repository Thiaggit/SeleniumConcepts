package authorization;

import io.restassured.RestAssured;

public class BearerToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String token = "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";
		RestAssured.given().
		header("Authorization", "Bearer "+ token).
		when().get("https://api.github.com/user/repos").prettyPrint();
	}

}
