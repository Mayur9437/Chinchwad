package seleniumBasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GadarReview 
{
	public static void main(String[] args) throws InterruptedException 
	{
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\My Pc\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("gadar");
		Thread.sleep(1000);
		
		List<WebElement> SearchResult = driver.findElements(By.xpath("(//ul[@class=\'G43f7e\'])[1]//li"));
		
		for (WebElement sr : SearchResult) 
		{
			System.out.println(sr.getText());
			
		}
		
		for (WebElement sr : SearchResult) 
		{
			String ExpectedResult = "gadar 2 review";
			Thread.sleep(1000);
			
			if (ExpectedResult.equals(sr.getText())) 
			{
				sr.click();
				break;
			}
			
		}
		
//		driver.close();
		
		
	}
	
	
	
	
	
	
}
