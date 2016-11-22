package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserinvoking {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","B:\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://ebay.com");
		System.out.println(dr.getTitle());
		System.out.println(dr.getCurrentUrl());
		dr.close();
	}

}
