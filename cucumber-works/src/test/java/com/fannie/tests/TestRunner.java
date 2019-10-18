package com.fannie.tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = {"src/main/resources/com/fannie/features"},
			glue = {"com.fannie.steps", "com.fannie.steps.hooks"},
			plugin = {"pretty", "html:target/html-reports", "json:target/json-reports"},
			monochrome = true,
			tags = {"@smoke"}
		)

public class TestRunner {
	//No Business Logic
}
