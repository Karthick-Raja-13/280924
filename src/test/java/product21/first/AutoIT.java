package product21.first;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoIT {
@Test
public void upload() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\product21\\src\\test\\resources\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://easyupload.io/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@class='dz-button']")).click();
	Thread.sleep(Duration.ofSeconds(2));
	Runtime.getRuntime().exec("C:\\Users\\Admin\\eclipse-workspace\\product21\\src\\test\\resources\\executables\\fileupload.exe");
}
}
