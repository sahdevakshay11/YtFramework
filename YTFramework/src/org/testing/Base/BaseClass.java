package org.testing.Base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import com.relevantcodes.extentreports.ExtentReports;


public class BaseClass {

public ChromeDriver driver;
public WebDriverWait wait;
public Properties pr;
//public ExtentReports reports;
	
	@BeforeMethod
	public void BrowserLaunch() throws IOException{
		
//		 reports = new ExtentReports("F:/25Dec_JavaSelenium", false);

		System.setProperty("webdriver.chrome.driver", "../YTFramework/chromedriver.exe");
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--disable-notifications");
		 driver=new ChromeDriver(options);
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		File f=new File("../YTFramework/Objects.properties");
		FileReader fr=new FileReader(f);
		pr=new Properties();
		pr.load(fr);
	}
	
	@AfterMethod
	public void BrowerClose(){
		
		driver.quit();
		
	}
	
}
