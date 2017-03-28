package tutorial;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Annotation {

	@BeforeSuite //runs at the very beginning of the suite execution
	public void first()
	{
		System.out.println("I run first");
	}
	
	@AfterSuite //runs at the very end 
	public void last()
	{
		System.out.println("I run last");
	}
}
