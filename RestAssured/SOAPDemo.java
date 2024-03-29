package com.simplilearn.RestassuredDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class SOAPDemo {
	
	@Test
	public void getCaptial() throws IOException {
		FileInputStream fis = new FileInputStream(new File("capital.xml"));
		
		RestAssured.baseURI = "http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso?WSDL";
		
		RestAssured
			.given()
				.header("Content-Type", "text/xml")
				.body(IOUtils.toString(fis, "UTF-8"))
			.when()
				.post()
			.then()
				.statusCode(200)
				.log().all();
	}

}
