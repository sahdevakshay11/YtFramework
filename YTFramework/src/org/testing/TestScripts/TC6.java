package org.testing.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testing.Base.BaseClass;
import org.testing.Pages.Home;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.Pages.VideoPlay;
import org.testng.annotations.*;




public class TC6 extends BaseClass {


	
		@Test
		public void WebElementLocating() throws InterruptedException{
			
			
			Login login=new Login(driver, pr);
			login.signin("DummyLogin0345", "DummyPassword0345");
			VideoPlay video=new VideoPlay(driver, pr);
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			video.VideoPlayClick();
			video.PageDown();
			video.Comment();

			Logout logout=new Logout(driver, pr);
			logout.Signout();
			
			}
		
//		@AfterMethod
//		public void BrowserClose(){
//			
////			driver.quit();
//		}
//	
}
