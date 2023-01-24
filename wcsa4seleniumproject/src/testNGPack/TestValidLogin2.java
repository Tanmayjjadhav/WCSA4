package testNGPack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestValidLogin2 {
	static WebDriver driver;
	@Test
	@Parameters({"browser","Url","usn","pass"})
	public void method1(String browserValue,String url,String Username,String Password) throws InterruptedException {
		if(browserValue.equals("chrome"))
		{    
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(url);
			
			driver.findElement(By.name("username")).sendKeys(Username);
			Thread.sleep(2000);
			driver.findElement(By.name("pwd")).sendKeys(Password);
			Thread.sleep(2000);
			driver.findElement(By.id("loginButton")).click();

		}

		else if(browserValue.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(url);
			
			
			driver.findElement(By.name("username")).sendKeys(Username);
			Thread.sleep(2000);
			driver.findElement(By.name("pwd")).sendKeys(Password);
			Thread.sleep(2000);
			driver.findElement(By.id("loginButton")).click();
		}
		
		else 
		{
			Reporter.log("use correct Browser!!",true);
		}
	}
}
