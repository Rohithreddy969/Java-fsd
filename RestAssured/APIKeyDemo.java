package com.simplilearn.RestassuredDemo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class APIKeyDemo {
	
	@Test
	public void getWeatherInfo() {
		RestAssured
			.given()
				.param("q", "bengaluru")
				.param("appid", "02331a88f1d5b3f8e238743f6fcfd07c")
			.when()
				.get("https://api.openweathermap.org/data/2.5/weather")
			.then()
				.statusCode(200)
				.log().all();
	}

}
