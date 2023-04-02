package ganeric;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConstant {

	protected static WebDriver driver;

	@BeforeMethod
	public void setUp() throws IOException {

		Flib flib = new Flib();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

	    String url = flib.readPropertyData(PROP_PATH, "url");
		System.setProperty(CHROME_KEY, CHROME_PATH);
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(url);

	}
}
