package RunnerClass;


import base.Driver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/vahit.peker/NAU-GROUP-PROJECT1/src/test/java/FeaturesFiles/admissions.feature",
        tags = "@test1",
        glue= "AdmissionsStepDef")

public class AdmissionsRunner {
}
