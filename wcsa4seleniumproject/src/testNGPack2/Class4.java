package testNGPack2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class4 {
	static WebDriver driver;
	  @Test(enabled = true)
	  public void automation() 
	  {
		  System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get("https://www.google.com");
		  driver.switchTo().activeElement().sendKeys("Selenium");
		  Reporter.log("class4 method",true);
		  driver.quit();
	  }
}
