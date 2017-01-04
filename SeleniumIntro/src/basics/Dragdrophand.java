package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrophand {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "B://chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://jqueryui.com/resources/demos/droppable/default.html");
		Actions act = new Actions(dr);
		WebElement drag = dr.findElement(By.xpath("//*[@id='draggable']"));
		WebElement drop=dr.findElement(By.xpath(".//*[@id='droppable']"));
		act.dragAndDrop(drag, drop).build().perform();

	}

}
