package steps;

import actions.OutlineActions;
import cucumber.api.java.en.Given;
import org.junit.Assert;

public class LoginStepsDefs {

    @Given("^I am on mainpage with title: \"([^\"]*)\"$")
    public void iAmOnMainpageWithTitle(String title) {
        Assert.assertTrue("Title does not match",title.equalsIgnoreCase(OutlineActions.getTitle()));
    }
}
