package AcademicsStepDef;

import Pages.AcademicsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(Cucumber.class)
public class AcademicsStepDef {



        @Given("^user go to home page$")
        public void user_go_to_home_page() throws Throwable {
                AcademicsPage.go_To_HomePage ();
        }

        @When("^user click the Academics$")
        public void user_click_the_academics() throws Throwable {
        AcademicsPage.click_academics ();
        }

        @Then("^Academics page will be displayed$")
        public void academics_page_will_be_displayed() throws Throwable {
         AcademicsPage.Academics_page_will_displayed ();
                AcademicsPage.screenShot ("AcademicsPageDisplay");
        }


}