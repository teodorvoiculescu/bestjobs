import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BestJobsHelper {

    public static void waitUntilXpathElementIsVisible(WebDriver driver, String locator) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public static void waitUntilCssElementIsVisible(WebDriver driver, String locator) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
    }

    public static String getLocatorFromFile(String locator) {

        String locatorFromFile = null;
        File file = new File("src\\test\\testData\\locators.properties");
        FileInputStream fileInput = null;
        try {
            fileInput = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Properties prop = new Properties();

        //load properties file
        try {
            prop.load(fileInput);
            locatorFromFile=  prop.getProperty(locator);
        } catch (IOException e) {
            e.printStackTrace();
        }

       return locatorFromFile;
    }
}
