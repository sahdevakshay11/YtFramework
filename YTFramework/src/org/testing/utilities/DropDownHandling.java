package org.testing.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {
	
	public static void dropdownwithindex(int index,WebElement element){
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	
public static void dropdownwithValue(String value,WebElement element){
		Select s=new Select(element);
		s.selectByValue(value);
				
	}

public static void dropdownwithVisibletext(String visibletext,WebElement element){
	
	Select s=new Select(element);
	s.selectByVisibleText(visibletext);
}

}
