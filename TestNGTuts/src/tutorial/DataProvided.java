package tutorial;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProvided {

	@Test
	@Parameters({"userid"})
	public void parametere(String Userid)
	{
		System.out.println(Userid);
	}
	
	@Test(dataProvider="getdata")
	public void userid(String id,String pswrd, String something)
	{
		System.out.println(id);	
		System.out.println(pswrd);
		System.out.println(something);
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] obj = new Object[3][3];
		
		obj[0][0]= "Hey";
		obj[0][1]= "How";
		obj[0][2]= "are you";
		
		obj[1][0]= "1Hey";
		obj[1][1]= "1How";
		obj[1][2]= "1are you";
		
		obj[2][0]= "2Hey";
		obj[2][1]= "2How";
		obj[2][2]= "2are you";
		
		return obj;
	}
	
}
