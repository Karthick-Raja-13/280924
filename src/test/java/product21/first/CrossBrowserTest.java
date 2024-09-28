package product21.first;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CrossBrowserTest {
    private WebDriver driver;
    private String baseURL = "https://zenjadeautomation.com/software/";

    @BeforeClass
    @Test
    public void setUp() throws Exception {
        // Specify the browser you want to test
    	ChromeOptions chromeOptions = new ChromeOptions();
    	chromeOptions.setCapability("browserVersion", "129.0.6668.60");
    	chromeOptions.setCapability("platformName", "Windows");
    	chromeOptions.setCapability("se:name", "My sample test"); 
 // Change to firefox() for Firefox
        driver = new RemoteWebDriver(new URL("http://192.168.56.1:4444"), chromeOptions);
        driver.manage().window().maximize();
    }

    @Test
    public void testHomePage() {
        driver.get(baseURL);
        // Add your test assertions here
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

