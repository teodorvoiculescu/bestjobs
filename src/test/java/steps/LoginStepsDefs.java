package steps;

import actions.OutlineActions;
import actions.TopBarActions;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.BestJobsHelper;

public class LoginStepsDefs {

    @Given("^I am on mainpage with title: \"([^\"]*)\"$")
    public void iAmOnMainpageWithTitle(String title) {
        Assert.assertTrue("Title does not match", title.equalsIgnoreCase(OutlineActions.getSiteTitle()));
    }

    @And("^I click on enter account link$")
    public void iClickOnEnterAccountLink() {
        BestJobsHelper.sleep(2500);
        TopBarActions.click_login_button();
        BestJobsHelper.sleep(2500);

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
