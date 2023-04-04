package authorization;

import io.restassured.RestAssured;

public class OAuth2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String token = "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";
		RestAssured.given().auth().oauth2(token).
		when().get("https://api.github.com/user/repos").prettyPrint();
	}

}
