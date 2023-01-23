package testNGPack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityClass {

	@Test(priority = 3)
	public void z() {
		Reporter.log("z",true);
	}

	@Test(priority = 1)
	public void h()
	{
		Reporter.log("h",true);
	}
	
	@Test
	public void k()
	{
		Reporter.log("k",true);
	}
	
	@Test(priority = 7)
	public void m()
	{
		Reporter.log("m",true);
	}
	
	@Test
	public void b()
	{
		Reporter.log("b",true);
	}
	
	@Test(priority = 0)
	public void a()
	{
		Reporter.log("a",true);
	}
	
	@Test
	public void g()
	{
		Reporter.log("g",true);
	}
	
	@Test(priority = 2)
	public void p()
	{
		Reporter.log("p",true);
	}
	
	@Test
	public void i()
	{
		Reporter.log("i",true);
	}

}
