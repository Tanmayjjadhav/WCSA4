package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NikeLoginPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.nike.com/in/member/profile/login?continueUrl=https://www.nike.com/in/");
		
		Thread.sleep(4000);
		//driver.findElement(By.id("499fbb11-e149-4fc8-81d9-281c791830ab")).sendKeys("abcd@123");
		  driver.findElement(By.cssSelector("input[id='e0ed19e1-fdf9-4468-8d6e-f643e6e03403']")).sendKeys("pqrs@123");
		//driver.findElement(By.id("28279ae1-2569-4d70-980d-e280d7d00c7f")).sendKeys("123xyz");
		  Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='a0c3675b-de87-4fc8-8267-6ce3d64248fd']")).sendKeys("123456");
		Thread.sleep(2000);
		//driver.findElement(By.id("17536db7-056d-40e9-a2e2-8b1a2d7bf749")).click();
        driver.findElement(By.cssSelector("input[id='83312046-18cf-4329-82c2-2a02711515d2']")).click();
}
}
