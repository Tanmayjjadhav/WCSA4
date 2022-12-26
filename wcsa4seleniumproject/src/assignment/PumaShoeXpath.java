package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
		
public class PumaShoeXpath {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwjv_ObgjOz7AhVIeYsKHYs2A40YABARGgJ0bQ&ohost=www.google.com&cid=CAASJuRoWykJ5eJWEzI-FE47BsMgTq92BIBij-PZWlyoJ4dLjXDOQ3QA&sig=AOD64_0AyuzvZdY3PK-NM-Bc5D5y-s8DfA&q&adurl&ved=2ahUKEwjh797gjOz7AhXRwIsBHaMQCV4Q0Qx6BAgKEAE");
 
		Thread.sleep(2000);
		
		driver.findElement(By.id("cookie-banner-close-btn")).click();
		
		driver.findElement(By.xpath("//h3[@class='tw-8216tu' and (@title='Softride Pro Coast Training Shoes')]")).click();
		
		
		
	
	}

}
