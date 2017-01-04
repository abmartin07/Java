package basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
 
public class AssertandVerify {
	@Test
	public void assertion(){
		//Instantiation of driver object. To launch Firefox browser
		System.setProperty("webdriver.gecko.driver", "B://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//To open the URL
		driver.get("http://www.facebook.com");
		//Actual title is "Software Testing Material - A site for Software Testers" 
		//We took title as "Software Testing Material" to make the test fail
		String Title = "Facebook - Log In or Sign Up";
		String GetTitle = driver.getTitle();
		System.out.println("Assertion starts here...");
		//try{ //insert try and catch method to verify so that it checks the asserted value is equal or not and then leaves it as is.
		Assert.assertEquals(Title, GetTitle);
		//}catch (Throwable t){
		System.out.println("Our title is: "+Title);
		System.out.println("Original title of the webpage is: "+GetTitle);		
	}
}
