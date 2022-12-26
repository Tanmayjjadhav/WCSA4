package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Qspiders%20Wakad/Desktop/wcsa4/TextBox.html");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("automation");
		
		
	}

}
