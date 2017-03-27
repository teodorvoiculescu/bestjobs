package steps;

import actions.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pageObjects.BestJobsHelper;

public class LoginStepsDefs {

    @Given("^I am on mainpage with title: \"([^\"]*)\"$")
    public void iAmOnMainpageWithTitle(String title) {
        Assert.assertTrue("Title does not match", title.equalsIgnoreCase(OutlineActions.getSiteTitle()));
        BestJobsHelper.sleep(2500);

    }

    @And("^I click on enter account link$")
    public void iClickOnEnterAccountLink() {
        BestJobsHelper.sleep(1500);
      //  BestJobsHelper.waitUntilXpathElementIsVisible(Hook.getDriver(),"top-bar-login",20);
        TopBarActions.click_login_button();
        BestJobsHelper.sleep(1500);

    }

    @Then("^I enter username : \"([^\"]*)\"$")
    public void iEnterUsername(String username) {
        BestJobsHelper.sleep(1500);
        LoginActions.enter_username(username);
        BestJobsHelper.sleep(1500);

    }

    @And("^I enter password : \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        BestJobsHelper.sleep(1500);
        LoginActions.enter_password(password);
        BestJobsHelper.sleep(1500);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        BestJobsHelper.sleep(1500);
        LoginActions.click_login_button();
        BestJobsHelper.sleep(1500);
    }

    @Then("^I should be logged in$")
    public void iShouldBeLoggedIn() {
        BestJobsHelper.waitUntilXpathElementIsVisible(Hook.getDriver(),"dropdown",20);
        BestJobsHelper.sleep(2500);
        BestJobsTopBarActions.click_account_dropwdown();
        BestJobsHelper.sleep(2500);
    }

    @Then("^I log out$")
    public void iLogOut() {
        BestJobsHelper.waitUntilXpathElementIsVisible(Hook.getDriver(),"dropdown",20);
        BestJobsHelper.sleep(1500);
        BestJobsTopBarActions.click_account_dropwdown();
        BestJobsHelper.sleep(1500);
        AccountDropDownActions.logout();
        BestJobsHelper.sleep(1500);
    }

//    @And("^I click on \"([^\"]*)\" link$")
//    public void iClickOnLink(String link) {
//        BestJobsHelper.sleep(2500);
//        if (TopBarActions.get_login_button_text().equalsIgnoreCase(link)) {
//            TopBarActions.click_login_button();
//            BestJobsHelper.sleep(2500);
//        }
//    }
}
