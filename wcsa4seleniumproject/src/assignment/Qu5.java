package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qu5 {
	
	// perform (maximize) operation in child browser...
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		
		String parentTitle = driver.getTitle();
		
		Set<String> allHandles = driver.getWindowHandles();
		{
			for(String wh:allHandles)
			{
				String currentTitle = driver.switchTo().window(wh).getTitle();
				System.out.println(currentTitle);
				
				if(!parentTitle.equals(currentTitle))
				{
					driver.manage().window().maximize();
				}
				else
				{
					driver.quit();
				}
				
			}
		}
		

}
}
