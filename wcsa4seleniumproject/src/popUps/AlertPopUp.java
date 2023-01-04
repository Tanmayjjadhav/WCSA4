package popUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.get("file:///C:/Users/Qspiders%20Wakad/Desktop/wcsa4/Alert2.html");

		WebElement button = driver.findElement(By.xpath("//button[.='Click me! ']"));
		button.click();

		// now switch ur control to Alert pop up

		Alert al = driver.switchTo().alert();

		// accept the Alert pop up..
		Thread.sleep(2000);
		//  al.accept();

		// dismiss the alert pop up

		// al.dismiss();

		// text of alert pop up

		String textOfAlert = al.getText();
		System.out.println(textOfAlert);

		//al.sendKeys("admin");

	}

}
