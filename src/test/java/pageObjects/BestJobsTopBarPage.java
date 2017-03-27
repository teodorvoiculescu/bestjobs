package pageObjects;

import org.openqa.selenium.WebElement;
import steps.Hook;

/**
 * Created by Lulu on 27.03.2017.
 */
public class BestJobsTopBarPage extends Hook{

    public static WebElement get_account_dropdown() {
        return BestJobsHelper.xpath_element(driver,"dropdown");
    }
}
