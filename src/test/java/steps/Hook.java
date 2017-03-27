package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Hook {
    protected static WebDriver driver;
    private String browser = "mozilla";
    private String url = "https://www.bestjobs.eu/ro/";


    @Before
    public void openBrowser() {
        System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lulu\\IdeaProjects\\bestjobs\\browsers");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lulu\\IdeaProjects\\bestjobs\\browsers\\geckodriver.exe");

        switch (browser) {
            case "mozilla":
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                driver.get(url);
                break;
            case "chrome":
                driver = new ChromeDriver();
                driver.get(url);
            case "iexplorer":
                driver = new InternetExplorerDriver();
                driver.get(url);
        }
    }

    @After
    public void closeBrowser() {
        if (driver != null)
            driver.quit();
    }
}
