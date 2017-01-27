package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class yelp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "B://chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("www.yelp.com");
		dr.findElement(By.xpath("//*[@id='find_desc']")).click();
		WebElement ele = dr.findElement(By.name("Restaurant"));
		Actions act = new Actions(dr);
		act.moveToElement(ele).build().perform();

	}

}
