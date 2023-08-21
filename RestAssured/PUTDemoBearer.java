package com.simplilearn.RestassuredDemo;

import java.util.HashMap;

import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PUTDemoBearer {
	
	HashMap<String, String> map = new HashMap<String, String>();
	
	@BeforeMethod
	public void createPayload() {
		map.put("name", "mansion house");
		map.put("email", "mansion554466@gmail.com");
		map.put("gender", "male");
		map.put("status", "active");
		RestAssured.baseURI = "https://gorest.co.in/";
		RestAssured.basePath = "/public/v2/users/4495001";
	}
	
	@Test
	public void updateResource() {
		Response response = RestAssured
			.given()
				.contentType("application/json")
				.body(map)
				.header("Authorization", "Bearer 43674c55655e79bda7931a29976eedcc058aeb97cfe165adcff747b040ebf41b")
			.when()
				.put()
			.then()
				.extract().response();
		
		JsonPath jsonPath = response.jsonPath();
		Assert.assertTrue(jsonPath.get("name").toString().equals("mansion house"));
	}
}
