package testNGparallelExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg2 {
  @Test
  public void m2() {
	  Reporter.log("m2 method",true);
  }
}
