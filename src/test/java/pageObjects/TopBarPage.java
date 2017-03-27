package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import steps.Hook;

public class TopBarPage extends Hook {

    public static WebElement getNewJobButton(){
        return driver.findElement(By.xpath(BestJobsHelper.getLocatorFromFile("top-bar-new-job")));
    }

    public static WebElement getEmployersButton(){
        return driver.findElement(By.xpath(BestJobsHelper.getLocatorFromFile("top-bar-employers")));
    }

    public static WebElement getRegisterButton(){
        return driver.findElement(By.xpath(BestJobsHelper.getLocatorFromFile("top-bar-register")));
    }
    public static WebElement getLoginButton(){
        return driver.findElement(By.xpath(BestJobsHelper.getLocatorFromFile("top-bar-login")));
    }
}
