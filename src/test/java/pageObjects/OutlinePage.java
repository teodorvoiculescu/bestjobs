package pageObjects;

import org.openqa.selenium.WebDriver;
import steps.Hook;

public class OutlinePage extends Hook {

    public static String getTitle() {
        return driver.getTitle();
    }
}
