package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VideoPlay {
	
	ChromeDriver driver;
	Properties pr;
    WebDriverWait wait;
	
	public VideoPlay(ChromeDriver driver,Properties pr){
		 
		 this.driver=driver;
		 this.pr=pr;
		 
	 }
	
	
public void VideoPlayClick() throws InterruptedException{
		
		Thread.sleep(5000);
		WebElement VideoPlay=driver.findElement(By.xpath(pr.getProperty("VideoPlayPath")));
		VideoPlay.click();
	}
	
	public void LikeButton() throws InterruptedException{
		
		Thread.sleep(5000);
		WebElement likeButton=driver.findElement(By.xpath(pr.getProperty("likeButtonPath")));
		likeButton.click();
	}
	
	public void PageDown() throws InterruptedException{
		
        Thread.sleep(4000);
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
	}
	
	public void SubsChannel() throws InterruptedException{
		
		Thread.sleep(4000);
		WebElement subsButton=driver.findElement(By.xpath(pr.getProperty("subsButtonPath")));
		subsButton.click();
	}
	
	
	public void Comment() throws InterruptedException{
		
		wait=new WebDriverWait(driver, 10);
		Thread.sleep(4000);
		
		WebElement commentArea= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pr.getProperty("commentAreaPath"))));
//				driver.findElement(By.xpath("//*[contains(@class,'comment-simplebox')][2]"));
		commentArea.click();
		
		WebElement Comment=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pr.getProperty("CommentPath"))));
//				driver.findElement(By.xpath("//div[contains(@aria-label,'Commenting publicly as')]"));
		Comment.click();

		Comment.sendKeys("Nice-videoo");
		
		Thread.sleep(4000);
		
		WebElement cmntbutton=driver.findElement(By.xpath(pr.getProperty("cmntbuttonPath")));
		cmntbutton.click();
		Thread.sleep(4000);
	}
	
	public void SavetobtnClick() throws InterruptedException{
		
		Thread.sleep(4000);
		WebElement savetoButton=driver.findElement(By.xpath(pr.getProperty("savetoButtonPath")));
		savetoButton.click();
		
		Thread.sleep(4000);
 		WebElement checkboxarea=driver.findElement(By.xpath(pr.getProperty("checkboxareaPath")));
 		checkboxarea.click();
 		Thread.sleep(4000);
 		
//		WebElement checkbox=driver.findElement(By.xpath("//div[@id='checkmark' and @class='hidden style-scope tp-yt-paper-checkbox']"));
//		checkbox.click();
//		WebElement Boxclosearea=driver.findElement(By.xpath("//button[@aria-label='Cancel']"));
//		Boxclosearea.click();
		
		WebElement BoxClose=driver.findElement(By.xpath(pr.getProperty("BoxClosePath")));
		Thread.sleep(3000);
		BoxClose.click();
		Thread.sleep(4000);
	}

}
