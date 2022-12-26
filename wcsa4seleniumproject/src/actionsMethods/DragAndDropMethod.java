package actionsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://demo.guru99.com/test/drag_drop.html");
		 
		 Thread.sleep(5000);
		 WebElement src = driver.findElement(By.xpath("//a[.=' BANK ']"));
		 
		 WebElement target = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		 
		 Actions act = new Actions(driver);
		 act.dragAndDrop(src, target).perform();
	}

}
