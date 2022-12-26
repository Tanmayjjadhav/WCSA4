package qsp;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.msedg.driver","./drivers/msedgdriver.exe");
		new EdgeDriver();
	}

}
