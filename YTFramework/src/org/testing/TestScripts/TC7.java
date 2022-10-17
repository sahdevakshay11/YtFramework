package org.testing.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testing.Base.BaseClass;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.Pages.VideoPlay;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC7 extends BaseClass {


		
		@Test
		public void WebElementLocating() throws InterruptedException{
//			wait=new WebDriverWait(driver, 10);
			
			Login login=new Login(driver, pr);
			login.signin("DummyLogin0345", "DummyPassword0345");
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			VideoPlay video=new VideoPlay(driver, pr);
			video.VideoPlayClick();
			video.SavetobtnClick();
			Logout logout=new Logout(driver, pr);
			logout.Signout();
			
			}
		
}
