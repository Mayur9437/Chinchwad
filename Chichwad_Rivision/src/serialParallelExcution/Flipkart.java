package serialParallelExcution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipkart {
  @Test
  public void flipkartTest() throws InterruptedException 
  {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\My Pc\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	  WebDriver driver = new ChromeDriver();
	  
//	  driver.manage().window().maximize();
	  
	  Reporter.log("Opening Flipkart", true );
	  
	  driver.get("https://www.flipkart.com/");
	  
	  
  }
}
