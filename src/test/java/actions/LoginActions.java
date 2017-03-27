package actions;

import pageObjects.BestJobsTopBarPage;
import pageObjects.LoginPage;

public class LoginActions {
    public static void enter_username(String username) {
       LoginPage.get_username_field().clear();
       LoginPage.get_username_field().sendKeys(username);

    }

    public static void enter_password(String password) {
       LoginPage.get_password_field().clear();
       LoginPage.get_password_field().sendKeys(password);
    }

    public static void click_login_button() {
       LoginPage.get_login_button().click();
    }
}
