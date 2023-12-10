package policyBazaar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyBazaarPOMHomePage 
{
//	Variable Declaration
	
	@FindBy(xpath = "//a[@class='sign-in']") private WebElement signINButoonHomepage;
	
	@FindBy(xpath = "(//input[@type=\"number\"])[2]") private WebElement mobileNoField;
	
	@FindBy(xpath = "(//span[text()='Sign in with Password'])[2]") private WebElement signInWithPasswordButoon;
	
	@FindBy(xpath = "//input[@name='password']") private WebElement passwordField;
	
	@FindBy(xpath = "//span[text()='Sign in']") private WebElement signInButton;
	
	@FindBy(xpath = "//div[text()='My Account']") private WebElement myAccountButton;
	
	@FindBy(xpath = "//span[text()=' My profile ']") private WebElement myProfileButton;
		

	
//	Variable initialization
	
	public PolicyBazaarPOMHomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
//	Method

	public void clickOnsignInButoonHomepage()
	{
		signINButoonHomepage.click();
	}
	
	public void entermobileNoField(String mobnum) 
	{
		mobileNoField.sendKeys(mobnum);
	}
	
	public void clickOnsignInWithPasswordButoon()
	{
		signInWithPasswordButoon.click();
	}
	
	public void enterpasswordField(String password)
	{
		passwordField.sendKeys(password);
	}
	
	public void clickOnsignInButton() 
	{
		signInButton.click();
	}
	
	public void clickOnmyAccountButton() 	
	{
		myAccountButton.click();
	}
	
	public void clickOnmyProfileButton()
	{
		myProfileButton.click();
	}

}
