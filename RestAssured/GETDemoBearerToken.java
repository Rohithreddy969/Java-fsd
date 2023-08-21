package com.simplilearn.RestassuredDemo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GETDemoBearerToken {
	
	@Test
	public void verifyResource() {
		RestAssured
			.given()
				.contentType("application/json")
				.header("Authorization", "Bearer 43674c55655e79bda7931a29976eedcc058aeb97cfe165adcff747b040ebf41b")
			.when()
				.get("https://gorest.co.in/public/v2/users/4495001")
			.then()
				.statusCode(200)
				.log().all();
	}

}
