package testngDataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FbloginTest 
{
  @Test (dataProvider = "FbTestData", dataProviderClass = testngDataProvider.Fblogin.class)
  public void fbloginData(String un, String pass) throws InterruptedException 
  {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\My Pc\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.facebook.com/");
	  
	  Thread.sleep(2000);
	  
	 driver.findElement(By.name("email")).sendKeys(un);
	 
	 driver.findElement(By.name("pass")).sendKeys(pass);
  }
}

