package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		//driver.findElement(By.cssSelector("button[class^='oxd-but']")).click();// shortcut of cssSelector by using ^ [intial attribute value]
		
		driver.findElement(By.cssSelector("button[class$=' orangehrm-login-button']")).click();//shortcut of cssSelector by using $ [ending attribute value]
		//driver.findElement(By.cssSelector("button[class*='oxd-button--']")).click();// shortcut of cssSelector by using * [in between]

	}


}
