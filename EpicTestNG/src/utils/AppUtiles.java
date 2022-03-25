package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AppUtiles {

	public static WebDriver driver;
	public static String url="http://10.10.3.1/EPIQ100BL_TST/Pages/";
	
	
	@BeforeSuite
	public  void launchApp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(url);
	
	}
	 
	
	@AfterSuite

	public  void closeApp()
	{
		driver.close();
	}

}
