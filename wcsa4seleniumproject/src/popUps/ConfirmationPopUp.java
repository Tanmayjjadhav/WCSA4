package popUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("file:///C:/Users/Qspiders%20Wakad/Desktop/wcsa4/confirm2.html");
		
		driver.findElement(By.xpath("//button[text()='Click me! ']")).click();
		
		Alert al = driver.switchTo().alert();
		// dismiss the pop up
		//al.dismiss();
		
		Thread.sleep(2000);
		// accept the pop up
		al.accept();
		
		String textOfConfirm = al.getText();
		System.out.println(textOfConfirm);
		
	}

}
