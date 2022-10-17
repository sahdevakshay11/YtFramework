package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testing.Base.BaseClass;
import org.testing.Pages.Home;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.Pages.VideoPlay;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC4 extends BaseClass{

	
@Test
public void webelementLocating() throws InterruptedException{
	

	Login login=new Login(driver, pr);
	login.signin("DummyLogin0345", "DummyPassword0345");
	VideoPlay video=new VideoPlay(driver, pr);
	video.VideoPlayClick();
	video.LikeButton();
	Logout logout=new Logout(driver, pr);
	logout.Signout();
}

//@AfterMethod
//public void BrowerClose(){
//	
//	driver.quit();
//	
//}
}
