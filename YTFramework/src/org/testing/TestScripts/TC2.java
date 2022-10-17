package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.BaseClass;
import org.testing.Pages.Home;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testng.annotations.*;


public class TC2 extends BaseClass {


		@Test
	public void webelementLocating() throws InterruptedException{
		
		Login login=new Login(driver, pr);
		login.signin("DummyLogin0345", "DummyPassword0345");
		Home home=new Home(driver, pr);
		home.HistoryClick();
		Logout logout=new Logout(driver, pr);
		logout.Signout();
		
	}
		
}
