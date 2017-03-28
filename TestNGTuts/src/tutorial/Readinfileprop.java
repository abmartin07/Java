package tutorial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;


public class Readinfileprop {
	@Test
	public void UserName() throws Exception
	{										//give the properties file location for the file input stream
		FileInputStream file = new FileInputStream("C:\\Users\\Bonny\\workspace\\TestNGTuts\\src\\datadriven.properties");
		Properties prop = new Properties(); //use the properties method from java
		prop.load(file); 					//load the property file
		
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		
	}
	
	
}
