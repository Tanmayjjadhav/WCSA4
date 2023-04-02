package testPack;
import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ganeric.BaseTest;
import ganeric.Flib;
import pom.HomePage;
import pom.SigninPage;

public class Test1 extends BaseTest{
  @Test
  public void validTest() throws InterruptedException, IOException, AWTException {
	  
	  Flib flib = new Flib();
	  SigninPage sp = new SigninPage(driver);
	  sp.loginOp(flib.readPropertyData(PROP_PATH, "id"),flib.readPropertyData(PROP_PATH, "password"));
	  
	  Thread.sleep(2000);
	  
	  
	  HomePage hp = new HomePage(driver);
	  Thread.sleep(2000);
      int rc = flib.getRowCount(EXCEL_PATH, "groupNames");
     
      for(int i=1;i<=rc;i++)
      {
    	  String groupName = flib.readExcelData(EXCEL_PATH,"groupNames",i, 0);
    	  hp.searchGroup(groupName);
      }
	  
	 Thread.sleep(2000);
	  hp.removeParticipants();
	  
  }
}
