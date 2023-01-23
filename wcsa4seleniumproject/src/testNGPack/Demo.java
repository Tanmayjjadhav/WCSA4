package testNGPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void demo() 
  {
	//  System.out.println("This is method of Demo class!!");
	  Reporter.log("this is demo method!!",true);
  }
  
  @Test
  public void demo1()
  {
	  Reporter.log("This is demo1 method!!!",true);
  }
  
  @Test
  public void demo2()
  {
	int a=78;
	int b=2;
	int res=a/b;
	
	Reporter.log("This is demo2 method!!!",true);
	
  }
}
