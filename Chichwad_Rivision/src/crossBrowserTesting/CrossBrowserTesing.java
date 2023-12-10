package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesing 
{
	WebDriver driver;
	@Parameters("browserName")
	@Test
  public void cbTesting(String browserName) throws InterruptedException 
  {
	  
	  if (browserName.equals("chrome")) 
	  {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\My Pc\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		  driver = new ChromeDriver();	    
	  }
	  else if (browserName.equals("edge"))
	  {
		   driver = new EdgeDriver();
	  }
	    
	  driver.manage().window().maximize();	  
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(2000);
	
//	for parallel testing in suite tag give parallel="test" & for serial testing don't use this ...   
	  
  }
}
