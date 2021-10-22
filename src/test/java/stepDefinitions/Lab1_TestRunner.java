package stepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"./src/test/resources/resources/LoginTest.feature"},glue= {"stepDefinitions"},
plugin = {"pretty", "html:target/cucumber-html-report"})

//plugin = {"pretty", "Json:target/JsonReport/report.json"}
//plugin = {"pretty", "JUnit:target/JUnitReports/reports.xml"})

public class Lab1_TestRunner {

}
