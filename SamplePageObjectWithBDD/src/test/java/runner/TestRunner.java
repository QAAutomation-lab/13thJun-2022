package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/features/VtigerLead.feature" }, // feature file or folder name
		glue = { "stepdefinitions" },
		//plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, 
		plugin = { "pretty","html:target/cucumber-reports.html", "json:json_output/cucumber.json",
						"junit:junit_xml/cucumber.xml" }, 
		monochrome = true, dryRun = false, publish = true)
public class TestRunner extends AbstractTestNGCucumberTests {

}
