package com.PostMessageValidation;

import java.util.List;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ValidatePostMessageSD {

	@Given("post the data to create user")
	public void post_the_data_to_create_user() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("validate status code is {int}")
	public void validate_status_code_is(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("validate id created for user with non zero value")
	public void validate_id_created_for_user_with_non_zero_value() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
}
