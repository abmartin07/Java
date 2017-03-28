package tutorial;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testng {

	@BeforeMethod //runs before every method
	public void hello()
	{
		System.out.println("Hola");
	}
	
	@AfterMethod //runs after every method
	public void Shut()
	{
		System.out.println("Shut it!!");
	}
	
	
	@BeforeTest //runs only once at the beginning of the test
	public void say()
	{
		System.out.println("Speak Spanish?");
	}
	
	@Test //doesn't need a main method to run the program. and depends based on alphabetical order of the method name
	public void Aname()
	{
		System.out.println("Amigo");
	}
	@Test
	public void Bname()
	{
		System.out.println("Primo");	
	}
	
	@AfterTest //Runs one time after all the tests have been executed.
	public void lol()
	{
		System.out.println("Okay! STOP!");
	}
	
	@Test
	@Parameters({"userid"})
	public void parametere(String Userid)
	{
		System.out.println(Userid);
	}
	
}
