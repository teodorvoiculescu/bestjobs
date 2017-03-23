package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

/**
 * Created by Lulu on 07.03.2017.
 */
public class LoginStepDefs extends StepDefsHelper {
    public LoginStepDefs(WebDriver driver) {
        super(driver);
    }

    @Given("^I am on mainpage$")
    public void iAmOnMainpage() {

    }

    @And("^I click on \"([^\"]*)\" section$")
    public void iClickOnSection(String arg0){
    }

    @Then("^I should be on login page$")
    public void iShouldBeOnLoginPage(){

    }

    @And("^I enter email: \"([^\"]*)\"$")
    public void iEnterEmail(String arg0) {

    }
}
