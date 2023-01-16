package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StaleRef {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://desktop-k0cq021/login.do");
		 
		   WebElement usn = driver.findElement(By.name("username"));
			WebElement pass = driver.findElement(By.name("pwd"));
			
			usn.sendKeys("admin");
			System.out.println(usn);
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			usn.sendKeys("admin");
			System.out.println(usn);
	}

}
