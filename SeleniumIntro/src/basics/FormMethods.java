package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "B://chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.makemytrip.com/flights");
				//isDisplayed Method
		System.out.println("Before clicking on the Multi city Radio Button");
		System.out.println(dr.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed());
		dr.findElement(By.xpath("//*[@id='multi_city_button']/span")).click();
		System.out.println("After clicking on the Multi city Radio Button");
		System.out.println(dr.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed());
	}

}
