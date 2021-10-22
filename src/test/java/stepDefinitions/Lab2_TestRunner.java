package stepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"./src/test/resources/resources/LoginTest_DataDriven.feature"},glue= {"stepDefinitions/Lab2_DataDriven.java"},
plugin = {"pretty", "html:target/cucumber-html-report"})

//plugin = {"pretty", "Json:target/JsonReport/report.json"}
//plugin = {"pretty", "JUnit:target/JUnitReports/reports.xml"})

public class Lab2_TestRunner {

}
