package popUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();

		
		// maximize the browser without calling manage method
		
		co.addArguments("-start-maximized");
		
		
	   WebDriver driver = new ChromeDriver(co);
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get("https://www.olx.in/");
	   Thread.sleep(2000);
	   co.addArguments("--disable-notifications");
		
		
	}

}
