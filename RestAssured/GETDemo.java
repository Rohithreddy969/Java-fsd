package com.simplilearn.RestassuredDemo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GETDemo {
	
	@Test
	public void getServerResponse() {
		RestAssured
		  .when()
			.get("https://restcountries.com/v3.1/name/India")
		  .then()
		  	.assertThat()
		  	.statusCode(200)
		  	.log().all();
	}
}
