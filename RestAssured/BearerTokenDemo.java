package com.simplilearn.RestassuredDemo;

import java.util.HashMap;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class BearerTokenDemo {
	
	HashMap<String, String> map = new HashMap<String, String>();
	
	@BeforeMethod
	public void createPayLoad() {
		map.put("name", "mansion");
		map.put("email", "mansion554466@gmail.com");
		map.put("gender", "male");
		map.put("status", "active");
		RestAssured.baseURI = "https://gorest.co.in/";
		RestAssured.basePath = "/public/v2/users";
	}
	
	@Test
	public void createResource() {
		RestAssured
			.given()
				.contentType("application/json")
				.body(map)
				.header("Authorization", "Bearer 43674c55655e79bda7931a29976eedcc058aeb97cfe165adcff747b040ebf41b")
			.when()
				.post()
			.then()
				.statusCode(201)
				.log().all();
			
	}

}
