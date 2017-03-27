package actions;
import pageObjects.AccountDropDownPage;

public class AccountDropDownActions {

    public static void logout(){
        AccountDropDownPage.get_exit().click();
    }
}
