package org.testing.TestScripts;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Assertions.Assertion1;
import org.testing.Base.BaseClass;
import org.testing.Pages.Home;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.ScreenshotCapture;
import org.testng.Assert;
import org.testng.annotations.*;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class TC1 extends BaseClass {
	
	

	@Test
	public void webelementLocating() throws InterruptedException, IOException{
		
//		ExtentTest test = reports.startTest("TC1");
//		test.log(LogStatus.PASS, "Status Code is matching with the expected status code");
//		test.log(LogStatus.FAIL, "Test Failed");
//
//		reports.endTest(test);
//		reports.flush();
		
		String expectedURL="https://www.youtube.com/";
		Login login=new Login(driver,pr);
//		Assert.assertEquals(driver.getCurrentUrl(), expectedURL); // hard assertion 
		Assertion1.assert1(driver.getCurrentUrl(), expectedURL);
		login.signin("DummyLogin0345", "DummyPassword0345");
		
		LogsCapture.takelog("login successfully of tc1","TC1");
		ScreenshotCapture.TakeScreenshot(driver, "F://25Dec_JavaSelenium//TakesScreenshot//first.jpg");
		Home home=new Home(driver, pr);
		home.Explore();
		home.TrendingClick();
		Logout logout=new Logout(driver, pr);
		logout.Signout();
		ScreenshotCapture.TakeScreenshot(driver, "F://25Dec_JavaSelenium//TakesScreenshot//first_2.jpg");
		LogsCapture.takelog("TC1 pass successfully", "TC1");
	}
	
	

}
