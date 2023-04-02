package ganeric;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class WorkLib extends BaseTest {
	
	
	public void activeEle(String target)
	{
		driver.switchTo().activeElement().sendKeys(target);
	}
	
	public void hitEnter() throws AWTException
	{
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public void doubleClick(WebElement target)
	{
	        Actions act = new Actions(driver);
	        act.doubleClick(target).perform();
	}
	
	public void scrollTillperticularWebElement(WebElement element)
	{
		Point loc = element.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
		
	}
	

	public void mouseHover(WebElement targetElement)
	{
		Actions act = new Actions(driver);
		act.moveToElement(targetElement).perform();
	}
	

}
