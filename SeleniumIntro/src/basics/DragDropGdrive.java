package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropGdrive {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "B://chromedriver.exe");
			WebDriver dr = new ChromeDriver();
			dr.get("https://accounts.google.com/ServiceLogin?service=wise&passive=true&continue=http://drive.google.com/?utm_source=en_US&utm_medium=button&utm_campaign=web&utm_content=gotodrive&usp=gtd&ltmpl=drive#identifier");
			dr.manage().window().maximize();
			dr.findElement(By.xpath("//*[@id='Email']")).sendKeys("bonnymartyn99@gmail.com");
			dr.findElement(By.xpath("//*[@id='next']")).click();
			dr.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			dr.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("Nevergiveup99!");
			dr.findElement(By.xpath("//*[@id='signIn']")).click();
			Actions act = new Actions(dr);
			WebElement drag = dr.findElement(By.xpath("//*[@id=':1q.0B4TfToSEi4_gWklzcVp3RlRGRmc']/div[2]/div[3]/div/div[2]/div[1]"));
			WebElement drop=dr.findElement(By.xpath("//*[@id=':1q.0B4TfToSEi4_gckhKUkZBRmxFdjg']/div[2]/div[3]/div[2]/span"));
			act.dragAndDrop(drag, drop).build().perform();

		}

	}


