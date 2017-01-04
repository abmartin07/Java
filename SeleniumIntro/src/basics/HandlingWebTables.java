package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "B://chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://only-testing-blog.blogspot.in/2013/09/test.html");
		// Get no. of rows
		int Rowcount = dr.findElements(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr")).size();
		System.out.println("Number Of Rows = "+Rowcount);
		// Get no. of cols
		int Colcount = dr.findElements(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[1]/td")).size();
		System.out.println("Number Of Columns = "+Colcount);
		// divided xpath into 3 parts to pass row and col values
		String first_part = "//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[";
		 String second_part = "]/td[";
		 String third_part = "]";
		 
		//Used for loop for number of rows.
		 for (int i=1; i<=Rowcount; i++){
		  //Used for loop for number of columns.
		 for(int j=1; j<=Colcount; j++){
		   //Prepared final xpath of specific cell as per values of i and j.
		   String final_xpath = first_part+i+second_part+j+third_part;
		   //Will retrieve value from located cell and print It.
		   String Table_data = dr.findElement(By.xpath(final_xpath)).getText();
		   System.out.print(Table_data +"  ");   
		  }
		   System.out.println("");
		   System.out.println("");  
		 } 
		 }	
		 }

