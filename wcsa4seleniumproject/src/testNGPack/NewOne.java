package testNGPack;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewOne {
  @Test
  @Parameters("browser")
  public void f(String browserValue) {
	  
	  if(browserValue.equals("chrome"))
	  {
		  
	  }
  }
}
