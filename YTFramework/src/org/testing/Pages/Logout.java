package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout {
	
	ChromeDriver driver;
	Properties pr;
	public Logout(ChromeDriver driver,Properties pr){
		this.driver=driver;
		this.pr=pr;
				
	}
	
	public void Signout() throws InterruptedException{
		Thread.sleep(2000);
		WebElement singButton=driver.findElement(By.xpath(pr.getProperty("singButtonPath")));
		Thread.sleep(4000);
		singButton.click();
		
		Thread.sleep(2000);
		WebElement singout=driver.findElement(By.xpath(pr.getProperty("singoutPath")));
		Thread.sleep(1000);
		singout.click();
		Thread.sleep(3000);
		
	}

}
