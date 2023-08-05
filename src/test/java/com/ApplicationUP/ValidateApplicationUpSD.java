package com.ApplicationUP;


import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ValidateApplicationUpSD {

	Response response ;
	
	@Given("hit the URI")
	public void hit_the_uri() {
	  response= RestAssured.get("https://demoqa.com/BookStore/v1/Books");
	  System.out.println("got the response");
	}

	@Then("Validate response {string} of the Application")
	public void validate_response_of_the_application(String statusCode) {
	  response.then().log().all();
	 // int AcutalStatuscode= response.getStatusCode();
	  String AcutalStatuscode= ""+response.getStatusCode()+"";
	  // int expectedStatusCode= 200;
	  Assert.assertEquals(statusCode, AcutalStatuscode); 
	 
		
	}	
}
