package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "featureFiles/DataTableWithHeaderExamples.feature", glue = "stepDefinitions")
public class RunnerClass {

}
