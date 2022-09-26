package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/meghamapalagama/eclipse-workspace/"
				+ "express_maven_bdd-project/src/main/java/com/qa/feature/expressbdd.feature",
        glue= {"com/qa/stepDefinition"},
        format= {"pretty", "html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
        monochrome = true,
        strict = true,
        dryRun = false
        )

public class TestRunner {

}
