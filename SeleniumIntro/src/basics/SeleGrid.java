package basics;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleGrid {

	public static void main(String[] args) throws MalformedURLException {
		
		File file = new File("C:\\Users\\karthik\\Downloads\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		WebDriver dr;
		String nodeURL;
		String baseURL;
		nodeURL="http://192.168.0.9:3344/wd/hub";
		
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability(FirefoxDriver.BINARY, new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe").getAbsolutePath());
		dr = new RemoteWebDriver (new URL("http://192.168.0.9:3344/wd/hub"), capabilities);
		dr.get("http://www.google.com");
		System.out.println(dr.getTitle());
			
		
	}

}
