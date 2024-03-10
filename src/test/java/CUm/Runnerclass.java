package CUm;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFile", glue = "StepDefination", monochrome = true, plugin = {
		"html:report/WebReport" }, tags = ("@ManojTest and @MjTest"))
public class Runnerclass {

}
