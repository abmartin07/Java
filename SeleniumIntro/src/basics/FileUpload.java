package basics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "B://chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://www.gmail.com");
		dr.findElement(By.id("Email")).sendKeys("abmartin07");
		dr.findElement(By.id("next")).click();
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		dr.findElement(By.id("Passwd")).sendKeys("Joshua1_9");
		dr.findElement(By.id("signIn")).click();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.findElement(By.xpath("//*[@id=':il']/div/div")).click();
		dr.findElement(By.xpath("//*[@id=':p5']/div")).click();
		Runtime.getRuntime().exec("C:\\Users\\Bonny\\Desktop\\upload.exe");
		//dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//dr.findElement(By.name(name)).click();

	}

}
