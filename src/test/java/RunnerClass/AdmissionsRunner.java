package RunnerClass;


import base.Driver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\FutureFiles\\Admissions.feature",
                 glue= "StepDef")

public class AdmissionsRunner {
}
