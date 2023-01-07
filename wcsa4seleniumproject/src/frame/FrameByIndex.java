package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameByIndex {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Qspiders%20Wakad/Desktop/wcsa4/frame.html");
		
		driver.switchTo().frame(0);
		WebElement usn = driver.findElement(By.id("i1"));
		usn.sendKeys("Admin");
		WebElement password = driver.findElement(By.id("id1"));
		password.sendKeys("manager");
	}
	

}
