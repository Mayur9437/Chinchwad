package policyBazaar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyprofilePage 
{

	@FindBy(xpath = "//div[@class=\"textCapitalize sc-ckVGcZ kWpXlQ\"]") private WebElement userName;
	
	
	public MyprofilePage(WebDriver driver) 
	{
	  PageFactory.initElements(driver, this);
	}
	
	public void validateUserName(String expUserName) 
	{
	    String actualUserNameString = userName.getText();
				
		if (actualUserNameString.equals(expUserName))
		{
			System.out.println("Both are matching , TC is Passed");
		}
		else
		{
			System.out.println("Both are not matching , TC is failed");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
