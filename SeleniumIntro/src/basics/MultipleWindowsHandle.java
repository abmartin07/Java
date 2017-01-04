package basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsHandle {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "B://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		//saving irctc window 
		String mainWindow = driver.getWindowHandle();
		//saving all the pop ups
		Set<String> popups = driver.getWindowHandles();
		for(String window: popups) //for-each loop
		{
		driver.switchTo().window(window);
		driver.findElement(By.xpath(".//*[@id='demon_content']/div[2]/input")).click();
		}
		driver.findElement(By.xpath(".//*[@id='loginFormId']/div[1]/div[4]/div/ul/li[4]/a")).click();
		Set<String> popup = driver.getWindowHandles();
		for(String window: popup) //for-each loop
		{
		driver.switchTo().window(window);
		System.out.println(driver.getTitle());
		}

		//switching back to main window
		driver.switchTo().window(mainWindow);
		driver.findElement(By.id("usernameId")).sendKeys("Bonny");
		driver.quit();
		
	}
	
}
