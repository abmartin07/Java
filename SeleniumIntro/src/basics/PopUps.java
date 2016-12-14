package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUps {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "B://chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		dr.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
			//switch from web view to pop up view
		System.out.println(dr.switchTo().alert().getText()); //to show text on Pop Up
		dr.switchTo().alert().accept(); //To accept the pop up
		//dr.switchTo().alert().dismiss();//To dismiss the pop up/rejectit

	}

}
