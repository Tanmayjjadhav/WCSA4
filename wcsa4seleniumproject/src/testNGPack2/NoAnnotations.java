package testNGPack2;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NoAnnotations {
  @Test
  public void test() {
	  
	  Reporter.log("@Test Annotation",true);
  }
  @Test
  public void test2() {
	  
	  Reporter.log("@Test2 Annotation",true);
  }
  
  @BeforeSuite
  public void beforeSuite()
  {
	  Reporter.log("@beforeSuite Annotation",true);
  }
  
  @AfterSuite
  public void afterSuite()
  {
	  Reporter.log("@afterSuite Annotation",true);
  }
  @BeforeClass
  public void beforeClass()
  {
	  Reporter.log("@beforeClass Annotation",true);
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  Reporter.log("@beforeMethod Annotation",true);
  }
  @AfterTest
  public void afterTest()
  {
	  Reporter.log("@afterTest Annotation",true);
  }
  @AfterMethod
  public void afterMethod()
  {
	  Reporter.log("@afterMethod Annotation",true);
  }
  @BeforeTest
  public void beforeTest()
  {
	  Reporter.log("@beforeTest Annotation",true);
  }
  @AfterClass
  public void afterClass()
  {
	  Reporter.log("@afterClass Annotation",true);
  }
}
