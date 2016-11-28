package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SignIn {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","B:\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("https://facebook.com");
		dr.findElement(By.id("email")).sendKeys("xyz@gmail.com");
		dr.findElement(By.name("pass")).sendKeys("xxxxxxx");
		dr.findElement(By.xpath(".//*[@id='loginbutton']")).click();
	}

}
