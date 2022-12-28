package actionsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("http://desktop-k0cq021/login.do");
		 
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		 driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		 
		 
		 driver.findElement(By.xpath("//a[.='Login']")).click();// by using text.
		
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[contains(@class,'content administration')]")).click();
		 driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
		 driver.findElement(By.xpath("//input[contains(@id,'uploadNewLogoOption')]")).click();
		 
		 WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		    Thread.sleep(2000);
		    // target.click();
		 
		      Actions act = new Actions(driver);
		       // to perform double click action
		      // act.doubleClick(target).perform();
		 
		 
		 
		 
		 
	}

}
