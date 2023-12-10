package seleniumBasic;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionRivision
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\My Pc\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		

		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("start-maximized");
//		opt.addArguments("disable-notification");
//		opt.addArguments("incognito");
//		opt.addArguments("headless");
	
//		by using ArryLiist
		
		ArrayList<String> al = new ArrayList<>();
		al.add("start-maximized");
		al.add("disable-notifications");
		al.add("incognito");
//		al.add("headless");
		
		opt.addArguments(al);
		

		WebDriver driver = new ChromeDriver(opt);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		driver.get("https://www.ajio.com/");
		
		
	}
	
	
	
	
}
