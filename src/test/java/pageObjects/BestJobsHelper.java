package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class BestJobsHelper {

    public static void waitUntilXpathElementIsVisible(WebDriver driver, String locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BestJobsHelper.getLocatorFromFile(locator))));
    }

    public static void waitUntilCssElementIsVisible(WebDriver driver, String locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(BestJobsHelper.getLocatorFromFile(locator))));
    }

    public static String getLocatorFromFile(String locator) {
        String path = System.getProperty("user.dir") + "\\src\\test\\java\\testData\\locators.properties";
        String locatorFromFile = null;
        File file = new File(path);
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
            locatorFromFile = prop.getProperty(locator);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return locatorFromFile;
    }
    public static WebElement xpath_element(WebDriver driver,String locator){
        return driver.findElement(By.xpath(BestJobsHelper.getLocatorFromFile(locator)));
    }

    public static List<WebElement> xpath_elements(WebDriver driver, String locator){
        return driver.findElements(By.xpath(BestJobsHelper.getLocatorFromFile(locator)));
    }

    public static WebElement css_element(WebDriver driver,String locator){
        return driver.findElement(By.cssSelector(BestJobsHelper.getLocatorFromFile(locator)));
    }

    public static List<WebElement> css_elements(WebDriver driver,String locator){
        return driver.findElements(By.cssSelector(BestJobsHelper.getLocatorFromFile(locator)));
    }
    public static void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
