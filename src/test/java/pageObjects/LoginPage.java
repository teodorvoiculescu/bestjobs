package pageObjects;

import org.openqa.selenium.WebElement;
import steps.Hook;

public class LoginPage extends Hook {
    public static WebElement get_username_field() {
        return BestJobsHelper.xpath_element(driver,"username");
    }

    public static WebElement get_password_field() {
        return BestJobsHelper.xpath_element(driver,"password");
    }

    public static WebElement get_login_button() {
       return BestJobsHelper.css_element(driver,"login-button");
    }
}
