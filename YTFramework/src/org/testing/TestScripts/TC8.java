package org.testing.TestScripts;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testing.Base.BaseClass;
import org.testing.Pages.Home;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testng.annotations.*;


public class TC8 extends BaseClass {

//	ChromeDriver driver;
//	WebDriverWait wait;
//		
//		@BeforeMethod
//		public void BrowserLaunch(){
//			System.setProperty("webdriver.chrome.driver", "../YTFramework/chromedriver.exe");
//			ChromeOptions options=new ChromeOptions();
//			options.addArguments("--disable-notifications");
//			driver=new ChromeDriver(options);
//			driver.get("https://www.youtube.com/");
//			driver.manage().window().maximize();
//			
//		}
		
		@Test
		public void WebElementLocating() throws InterruptedException{
			
			Login login=new Login(driver, pr);
			login.signin("DummyLogin0345", "DummyPassword0345");
			
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Home home=new Home(driver, pr);
			home.LibraryClick();
			Logout logout=new Logout(driver, pr);
			logout.Signout();


			
			}
		
//		@AfterMethod
//		public void BrowserClose(){
//			
//			driver.quit();
//		}
	
}
