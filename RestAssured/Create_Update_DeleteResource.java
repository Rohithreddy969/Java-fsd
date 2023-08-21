package com.simplilearn.RestassuredDemo;

import static org.hamcrest.Matchers.is;

import java.util.HashMap;
import java.util.UUID;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Create_Update_DeleteResource extends TestBase {
	
	HashMap<String, String> map = new HashMap<String, String>();
	UUID uuid = UUID.randomUUID();
	int id;
	Response response;
	JsonPath jsonPath;
	
	@Test(priority = 0)
	public void createPayLoad() {
		map.put("name", "blenders pride");
		map.put("email", uuid + "@gmail.com");
		map.put("gender", "male");
		map.put("status", "active");
		RestAssured.baseURI = "https://gorest.co.in";
		RestAssured.basePath = "public/v2/users";
		logger.info("Payload created");
	}
	
	@Test(priority = 1)
	public void createResource() {
		response = RestAssured
					.given()
						.contentType("application/json")
						.body(map)
						.header("Authorization", "Bearer 43674c55655e79bda7931a29976eedcc058aeb97cfe165adcff747b040ebf41b")
					.when()
						.post()
					.then()
						.log().all()
						.extract().response();
		
		jsonPath = response.jsonPath();
		id = jsonPath.get("id");
		System.out.println(id);
		logger.info("Resource created successfully");
	}
	
	@Test(priority = 2)
	public void verifyResource() {
		System.out.println("Id - " + id);
		RestAssured
				.given()
					.contentType("application/json")
					.header("Authorization", "Bearer 43674c55655e79bda7931a29976eedcc058aeb97cfe165adcff747b040ebf41b")
				.when()
					.get("https://gorest.co.in/public/v2/users/"+id)
				.then()
					.statusCode(200)
					.log().all();
		
				Assert.assertTrue(jsonPath.get("name").equals("blenders pride"));
		
	}
	
	@Test(priority = 3)
	public void updateResource() {
		map.put("name", "blenders pride s");
		map.put("email", uuid + "@gmail.com");
		map.put("gender", "male");
		map.put("status", "active");
		RestAssured.baseURI = "https://gorest.co.in";
		RestAssured.basePath = "public/v2/users/" + id;
		logger.info("Resource updated successfully");
		
		RestAssured
			.given()
				.contentType("application/json")
				.header("Authorization", "Bearer 43674c55655e79bda7931a29976eedcc058aeb97cfe165adcff747b040ebf41b")
				.body(map)
			.when()
				.put()
			.then()
				.statusCode(200)
				.log().all()
				.assertThat()
				.body("name", is("blenders pride s"));
	}
	
	@Test(priority = 4)
	public void deleteResource() {
		RestAssured.baseURI = "https://gorest.co.in";
		RestAssured.basePath = "public/v2/users/" + id;
		logger.info("Resource deleted successfully");
		
		RestAssured
			.given()
				.contentType("application/json")
				.header("Authorization", "Bearer 43674c55655e79bda7931a29976eedcc058aeb97cfe165adcff747b040ebf41b")
			.when()
				.delete()
			.then()
				.statusCode(204);
	}
	
}
