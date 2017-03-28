package tutorial;

import org.testng.annotations.Test;

public class DependsandEnabled {
	@Test
	public void name()
	{
		System.out.println("Dependant method");
	}
	
	@Test(dependsOnMethods=("name"),alwaysRun=true) //depends on the method mentioned. always run runs the code without any exception.
	public void namee()
	{
		System.out.println("Depends on name method");
	}
	
	@Test(enabled=false)//skips this method
	public void names()
	{
		System.out.println("Skip me!");
	}
	
	@Test(timeOut=5000) //fails the test case if the test is not executed in the given time.
	public void bro()
	{
		System.out.println("Time out--> fail the test after 5 secs");
	}
	
	
}
