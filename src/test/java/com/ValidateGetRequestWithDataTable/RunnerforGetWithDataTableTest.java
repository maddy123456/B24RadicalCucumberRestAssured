package com.ValidateGetRequestWithDataTable;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src/test/resources/com/ValidateGetRequestWithDataTable/ValidateGetWithDataTable.feature" },     
                 glue = { "com.ValidateGetRequestWithDataTable" },
		// dryRun=false,
		// monochrome=true,
	       plugin = { "pretty", "html:target/cucumber-htmlreport.html", "json:target/cucumber-report12311.json",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/ExtentReport1.html" })

public class RunnerforGetWithDataTableTest {

}
