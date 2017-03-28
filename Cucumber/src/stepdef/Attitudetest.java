package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Attitudetest {
	
	/*@Given("^I work ([^\"]*)$")
	public void ln(String str){
		if(str.equals("Latenights"))
		{
			System.out.println("latenights automated");
		}
		
		if(str.equals("in mornings"))
		{
			System.out.println("mornings automated");
		}
	}
	
	@When("^I meet ([^\"]*)$")
	public void Imeet(String str){
		if(str.equals("watchman"))
		{
			System.out.println("watchman automates");
		}
		
		if(str.equals("boy"))
		{
			System.out.println("boy automates");
		}
	}
	
	@Then("^I ([^\"]*) him$")
	public void grt(String str)
	{
		if(str.equals("greet"))
		{
			System.out.println("greet automates");
		}
		
		if(str.equals("dontgreet"))
		{
			System.out.println("dontgreet automates");
		}
	}*/
	 
	 WebDriver driver = null; 
		
	   @Given("^I have open the browser$") 
	   public void openBrowser() { 
		   System.setProperty("webdriver.gecko.driver","B:\\geckdriver.exe");
		   driver = new FirefoxDriver(); 
	   } 
		
	   @When("^I open Facebook website$") 
	   public void goToFacebook() { 
	      driver.navigate().to("https://www.facebook.com/"); 
	   } 
		
	   @Then("^Login button should exits$") 
	   public void loginButton() { 
	      if(driver.findElement(By.id("u_0_v")).isEnabled()) { 
	         System.out.println("Test 1 Pass"); 
	      } else { 
	         System.out.println("Test 1 Fail"); 
	      } 
	      driver.close(); 
	   } 
}
