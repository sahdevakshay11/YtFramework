package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Home {
	
	ChromeDriver driver;
	Properties pr;
	
	public Home(ChromeDriver driver,Properties pr){
		this.driver=driver;
		this.pr=pr;
		
	}

	public void Explore() throws InterruptedException{
		
		Thread.sleep(5000);
		WebElement explore=driver.findElement(By.xpath(pr.getProperty("explorePath")));
		explore.click();
		Thread.sleep(4000);
		
	}
	
	public void TrendingClick(){
		
		WebElement trendClick=driver.findElement(By.xpath(pr.getProperty("trendClickPath")));
		trendClick.click();
	}
	
	public void HistoryClick() throws InterruptedException{
		
		Thread.sleep(5000);
		WebElement History=driver.findElement(By.xpath(pr.getProperty("HistoryPath")));
		History.click();
	}
	
	public void SubscriptionClick() throws InterruptedException{
		
		Thread.sleep(5000);
		WebElement Subscription=driver.findElement(By.xpath(pr.getProperty("SubscriptionPath")));
		Subscription.click();
		
	}
	
	public void LibraryClick() throws InterruptedException{
		
		WebElement libraryClick=driver.findElement(By.xpath(pr.getProperty("libraryClickPath")));
		libraryClick.click();
 		
		Thread.sleep(4000);
	}
	
}
