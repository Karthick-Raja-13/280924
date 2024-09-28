package product21.first;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTest {

	public static void main(String[]args){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\product21\\src\\test\\resources\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://zenjadeautomation.com/");
		driver.manage().window().maximize();
		
		WebElement enquireNow = driver.findElement(By.linkText("Enquire Now"));
		enquireNow.click();
		WebElement name = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		name.sendKeys("Zenjade");
		//driver.quit();
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
        element.click();
        
		 */
		
	}

}
