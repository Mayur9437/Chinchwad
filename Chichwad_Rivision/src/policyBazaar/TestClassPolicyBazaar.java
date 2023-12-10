package policyBazaar;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClassPolicyBazaar 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\My Pc\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.policybazaar.com/");
		Thread.sleep(3000);
		
		FileInputStream myfile = new FileInputStream("D:\\Class 17-SEP\\Rivision\\policyBazardemo.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		String mobnum = mySheet.getRow(1).getCell(0).getStringCellValue();
		String password = mySheet.getRow(1).getCell(1).getStringCellValue();
		String expUserName = mySheet.getRow(1).getCell(2).getStringCellValue();	
		
		PolicyBazaarPOMHomePage pb = new PolicyBazaarPOMHomePage(driver);
		Thread.sleep(2000);
		
		pb.clickOnsignInButoonHomepage();
		Thread.sleep(2000);
		
		pb.entermobileNoField(mobnum);
		Thread.sleep(1000);
		
		pb.clickOnsignInWithPasswordButoon();
		Thread.sleep(1000);
		
		pb.enterpasswordField(password);
		Thread.sleep(1000);
		
		pb.clickOnsignInButton();
		Thread.sleep(1000);
		
		pb.clickOnmyAccountButton();
		Thread.sleep(1000);
		
		pb.clickOnmyProfileButton();
		Thread.sleep(1000);
		
		Set<String> allPageId = driver.getWindowHandles();
		
		ArrayList<String> al = new ArrayList<>(allPageId);
		
		String homePageId = al.get(0);
		String profilePageId = al.get(1);
		
		Thread.sleep(1000);
		
//		Switching Window 
		
		driver.switchTo().window(profilePageId);
		Thread.sleep(1000);
		MyprofilePage profile = new MyprofilePage(driver);
		
		profile.validateUserName(expUserName);
		
	
	}
}
