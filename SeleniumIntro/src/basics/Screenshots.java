package basics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Screenshots {

	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.gecko.driver", "B:/geckodriver.exe");
	FirefoxProfile profile = new FirefoxProfile();
	profile.setPreference( "intl.accept_languages", "es" );	//setting up language in spanish
	WebDriver dr = new FirefoxDriver(profile); //desired capabilities
		dr.get("http://www.google.com");
		File scrnsht = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrnsht, new File("B:/screenshot.jpeg"));


}}
