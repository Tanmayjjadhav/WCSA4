package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("file:///C:/Users/Qspiders%20Wakad/Desktop/wcsa4/checkbox.html");
		 String CurrentUrl = driver.getCurrentUrl();
		 Thread.sleep(2000);
		 System.out.println(CurrentUrl);
	}

}
