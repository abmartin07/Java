package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Formsubmit {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","B://chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://spicejet.com");
		dr.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		dr.findElement(By.xpath("//a[@value='MAA']")).click();
		dr.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		dr.findElement(By.xpath("//a[@value='GOI']")).click();
		
					//Check Box-->
		dr.findElement(By.xpath("//input[@id='ct100_mainContent_chk_StudentDiscount']")).click();
		dr.findElement(By.xpath("//input[@id='ct100_mainContent_chk_StudentDiscount']")).isSelected();
			
		
			Select drop = new Select(dr.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']")));
			drop.selectByVisibleText("US Dollar(USD)");
			Select d = new Select(dr.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Adult']")));
			d.selectByIndex(3);
		
		
		
		
		
		
	}

}
