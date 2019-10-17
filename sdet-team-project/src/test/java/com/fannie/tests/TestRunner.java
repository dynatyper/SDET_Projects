package com.fannie.tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = {"src/main/resources/com/fannie/features"},
			glue = {"com.fannie.steps"},
			plugin = {"pretty"},
			monochrome = true,
			tags = {"@tag"}
		)

public class TestRunner {
	//No Business Logic
}
