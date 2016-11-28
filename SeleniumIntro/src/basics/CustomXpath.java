package basics;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomXpath {

	public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver","B:\\geckodriver.exe");
			WebDriver dr = new FirefoxDriver();
			dr.get("https://facebook.com");
			//dr.findElement(By.xpath("//input[@id='email']")).sendKeys("xyz@gmail.com");
			//dr.findElement(By.className("inputtext")).sendKeys("xyz@gmail.com");
			//dr.findElement(By.linkText("Forgot account?")).click();
			//dr.findElement(By.id("loginbutton")).click();
			//dr.findElement(By.cssSelector("[name='email'")).sendKeys("xyz@gmail.com");
			//dr.findElement(By.xpath("//input[@type='password']")).sendKeys("xxxxxxx");
			//dr.findElement(By.xpath("//input[@value='Log In']")).click();
			
		}

	}

