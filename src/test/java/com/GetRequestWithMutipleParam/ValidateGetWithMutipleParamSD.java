package com.GetRequestWithMutipleParam;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ValidateGetWithMutipleParamSD {

	Response response ;
	@Given("hit the URI2")
	public void hit_the_uri2() {
		response= RestAssured.get("https://demoqa.com/BookStore/v1/Books");
		System.out.println("got the response"); 
	}

	@Then("validate subTitle {string} and isbn {string} and author {string} and publish_date {string} of the book")
	public void validate_sub_title_and_isbn_and_author_and_publish_date_of_the_book(String subtitle, String isbn, String author, String date) {
	 
		String dataString = response.getBody().asString();
		System.out.println("All Data ==== "+dataString);
		String actualsubTitle = response.getBody().jsonPath().getString("books[1].subTitle");
		
		//Assert.assertTrue(actualTitleString.equals(title));
		int pagesInt = response.getBody().jsonPath().getInt("books[0].pages");
		
		
	}
		
	}
	
	
	

