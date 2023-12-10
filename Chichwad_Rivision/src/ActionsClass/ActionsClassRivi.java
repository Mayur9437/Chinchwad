package ActionsClass;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassRivi 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\My Pc\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions opt =new ChromeOptions();
		
		ArrayList<String> al = new ArrayList<>();
		al.add("start-maximized");
		al.add("disable-notifications");
//		al.add("incognito");
		opt.addArguments(al);
		
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.ajio.com/");
		
		Thread.sleep(2000);
		
		WebElement easyexchange = driver.findElement(By.xpath("//span[text()='EASY EXCHANGE']"));
		Actions act = new Actions(driver);
		act.scrollToElement(easyexchange).perform();
	}
		
		
}
