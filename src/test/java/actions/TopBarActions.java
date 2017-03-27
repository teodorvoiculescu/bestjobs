package actions;

import pageObjects.TopBarPage;

public class TopBarActions {

    public static void click_login_button() {
        TopBarPage.getLoginButton().click();
    }

    public static String get_login_button_text() {
       return TopBarPage.getLoginButton().getText();
    }

    public static void click_employers_button() {
        TopBarPage.getEmployersButton().click();
    }

    public static String get_employers_button_text() {
       return TopBarPage.getEmployersButton().getText();
    }

    public static void click_newjob_button() {
        TopBarPage.getNewJobButton().click();
    }

    public static String get_newjob_button_text() {
       return TopBarPage.getNewJobButton().getText();
    }

    public static void click_register_button() {
        TopBarPage.getRegisterButton().click();
    }

    public static String get_register_button_text() {
       return TopBarPage.getRegisterButton().getText();
    }
}
