package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "B://chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://echoecho.com/htmlforms10.htm");
		//dr.findElement(By.xpath("//input[@value='Butter']")).click();
		
			//To know the size of the radio buttons you use .size();
		int p=(dr.findElements(By.xpath("//input[@name='group1']")).size());
		
			//if you dont know the value, then use for loop
			//As the name attribute has the same value i.e. group1, let's use that. We set the size as an int parameter.
		
		for(int i=0;i<p;i++)
		{	
		String text= dr.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
		if(text.equals("Cheese")){
			
			dr.findElements(By.xpath("//input[@name='group1']")).get(i).click();
		}
		
		
		
		}
		
	}

}
