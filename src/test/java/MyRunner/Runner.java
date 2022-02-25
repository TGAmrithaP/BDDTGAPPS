package MyRunner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Test
@CucumberOptions(features="../BDDTG/src/test/resources/Feature/LoginFeature.feature",
dryRun= false,   //Only if we want to get Only Snippet without running whole program than put as true 
glue = {"StepDefinitions"}, // its represent the package name in step definitions
monochrome = true,  //Display the console output in proper readable format
plugin = { "pretty",  "html:Reports/cucumber-pretty" }
)

public class Runner extends AbstractTestNGCucumberTests

{

}

