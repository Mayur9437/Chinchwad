package testngDataProvider;

import org.testng.annotations.DataProvider;

public class Fblogin 
{

	@DataProvider(name="FbTestData")
	
	public String[][] testData()
	{
		String data [] [] = {{"Mumbai","Mumbai@123"},{"Pune","Pune@123"},{"Nagpur","nagpur@123"}};
	
		return data;
	}
	
	@DataProvider(name="FbwrongData")
	public String[][] wrongTestData() 
	{
		String data [] [] = {{"Mumbai","nagpur@123"},{"Pune","Pune@123"},{"Nagpur","Mumbai@123"}};
		
		return data;
	}
	
	
	
	
	
	
	
	
}
