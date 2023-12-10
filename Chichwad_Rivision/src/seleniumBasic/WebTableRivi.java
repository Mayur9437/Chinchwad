package seleniumBasic;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableRivi 

{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\My Pc\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		System.out.println("========================================");
		
		//How to read single header data 
		
		WebElement headerData = driver.findElement(By.xpath("//table[@class=\"dataTable\"]//tr[1]/th[4]"));
		
		System.out.println(headerData.getText());
		
		System.out.println("========================================");
		
		// header contains 5 data, so vary th from 1to 5
		
		for (int i = 1; i <= 5; i++) 
		{
			WebElement newHeadData = driver.findElement(By.xpath("//table[@class=\"dataTable\"]//tr[1]/th["+i+"]"));
			System.out.print(newHeadData.getText()+" ");

		}
		
		System.out.println();
		System.out.println("========================================");
		
		
		//how to read single row data from table
		
		for (int i = 1; i <=5; i++) 
		{
			WebElement singleRowD = driver.findElement(By.xpath("//table[@class=\"dataTable\"]//tr[3]/td["+i+"]"));
			System.out.print(singleRowD.getText()+" ");
		}
		
		System.out.println();
		System.out.println("==========================================");
		
		
		//how to read all rows data from table
		
		
		for (int i = 1; i <=26; i++) 
		{
			
			//column loop
			for (int j = 1; j <=5; j++)
			{
				WebElement data2 = driver.findElement(By.xpath("//table[@class=\"dataTable\"]//tr["+i+"]/td["+j+"]"));
				System.out.print(data2.getText()+" || ");
			}
			System.out.println();
		}
		
		System.out.println("=============================================");
		
	}
}
