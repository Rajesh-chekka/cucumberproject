 package Testrunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Ram\\eclipse-workspace\\Cucumberfw\\Feature",glue={"Stepdefinations"},
monochrome=true,
plugin = { "pretty", "html:target/cucumber-reports" },

dryRun=false // mapping between feature file and step file

)
public class Runner {

}
