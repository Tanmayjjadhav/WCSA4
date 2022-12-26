package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements2Method {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		driver.switchTo().activeElement().sendKeys("poha");
        Thread.sleep(2000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='w6W7d']"));

		for(WebElement suggest:suggestions)
		{
		           String opt = suggest.getText();	
		           Thread.sleep(2000);
		           System.out.println(opt);
		}
	}

}
