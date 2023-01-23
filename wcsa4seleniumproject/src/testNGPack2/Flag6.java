package testNGPack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
	
  @Test(groups = "FUNCTIONAL")
  public void ft1() {
	  Reporter.log("Functional Testing1",true);
  }
  
  @Test(groups = "INTEGRATION")
  public void it1()
  {
	  Reporter.log("Integration Testing1",true);
  }
  
  @Test(groups = "SYSTEM")
  public void st1()
  {
	  Reporter.log("System Testing1",true);
  }
 //-----------------------------------------------------------------------------------------
  @Test(groups = "FUNCTIONAL")
  public void ft2() {
	  Reporter.log("Functional Testing2",true);
  }
  
  @Test(groups = "INTEGRATION")
  public void it2()
  {
	  Reporter.log("Integration Testing2",true);
  }
  
  @Test(groups = "SYSTEM")
  public void st2()
  {
	  Reporter.log("System Testing2",true);
  }
  //-------------------------------------------------------------------------------------------
  @Test(groups = "FUNCTIONAL")
  public void ft3() {
	  Reporter.log("Functional Testing3",true);
  }
  
  @Test(groups = "INTEGRATION")
  public void it3()
  {
	  Reporter.log("Integration Testing3",true);
  }
  
  @Test(groups = "SYSTEM")
  public void st3()
  {
	  Reporter.log("System Testing3",true);
  }
  //----------------------------------------------------------------------------------------------
  
  @Test(groups = "FUNCTIONAL")
  public void ft4() {
	  Reporter.log("Functional Testing4",true);
  }
  
  @Test(groups = "INTEGRATION")
  public void it4()
  {
	  Reporter.log("Integration Testing4",true);
  }
  
  @Test(groups = "SYSTEM")
  public void st4()
  {
	  Reporter.log("System Testing4",true);
  }
  //---------------------------------------------------------------------------------------------
  @Test(groups = "FUNCTIONAL")
  public void ft5() {
	  Reporter.log("Functional Testing5",true);
  }
  
  @Test(groups = "INTEGRATION")
  public void it5()
  {
	  Reporter.log("Integration Testing5",true);
  }
  
  @Test(groups = "SYSTEM")
  public void st5()
  {
	  Reporter.log("System Testing5",true);
  }
  //---------------------------------------------------------------------------------------------------
  @Test(groups = "FUNCTIONAL")
  public void ft6() {
	  Reporter.log("Functional Testing6",true);
  }
  
  @Test(groups = "INTEGRATION")
  public void it6()
  {
	  Reporter.log("Integration Testing6",true);
  }
  
  @Test(groups = "SYSTEM")
  public void st6()
  {
	  Reporter.log("System Testing6",true);
  }
  
  
  
  
}
