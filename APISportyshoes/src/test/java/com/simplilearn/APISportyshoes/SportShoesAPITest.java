package com.simplilearn.APISportyshoes;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class SportShoesAPITest {
	
	Response response;
	JsonPath jsonPath;
	
	@Test(priority = 0)
	public void getProducts() {
		response = RestAssured
			.when()
				.get("http://localhost:9010/get-shoes")
			.then()
				.statusCode(200)
				.log().all()
				.extract().response();
		
		jsonPath = response.jsonPath();
		Assert.assertTrue(jsonPath.get("shoes[0].name").toString().equals("BlueWave Running Shoes"));
	}
	
	@Test(priority = 1)
	public void getRegisteredUsers() {
		response = RestAssured
				.when()
					.get("http://localhost:9010/get-users")
				.then()
					.statusCode(200)
					.log().all()
					.extract().response();
		
		jsonPath = response.jsonPath();
		Assert.assertTrue(jsonPath.get("users[0].name").toString().equals("John Watson"));
	}
	
	@Test(priority = 2)
	public void postRequest() {
		response = RestAssured
				.when()
					.post("http://localhost:9010/add-shoe?id=101&image=image_url&name=SampleShoe&category=Running&sizes=9&price=1000")
				.then()
					.statusCode(200)
					.log().all()
					.extract().response();
		
		jsonPath = response.jsonPath();
		Assert.assertTrue(jsonPath.get("message").toString().equals("SampleShoe Added Successfully."));
	}

}
