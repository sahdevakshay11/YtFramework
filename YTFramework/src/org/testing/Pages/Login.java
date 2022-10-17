package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	ChromeDriver driver;
	Properties pr;
	
	public Login(ChromeDriver driver,Properties pr){
		this.driver=driver;
		this.pr=pr;
		
	}
	
	public void signin(String user,String password) throws InterruptedException{
		
		Thread.sleep(500);
		WebElement SignButton=driver.findElement(By.xpath(pr.getProperty("SignButtonPath")));
		SignButton.click();
		WebElement emailtype=driver.findElement(By.xpath(pr.getProperty("emailtypePath")));
		Thread.sleep(500);
		emailtype.sendKeys(user);
		WebElement NextButton=driver.findElement(By.xpath(pr.getProperty("NextButtonPath")));
		NextButton.click();
		Thread.sleep(5000);
		WebElement passwrd=driver.findElement(By.xpath(pr.getProperty("passwrdPath")));
		
		passwrd.sendKeys(password);
		Thread.sleep(500);
		WebElement NextButton2=driver.findElement(By.xpath(pr.getProperty("NextButton2Path")));
		NextButton2.click();
		
}

}
