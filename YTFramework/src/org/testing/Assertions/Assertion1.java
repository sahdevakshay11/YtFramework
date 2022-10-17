package org.testing.Assertions;


public class Assertion1 {

	public static void assert1(String actual,String expected){
		
	
	if(actual.equals(expected)){
		
		System.out.println("acutal is same as expected");
		
		}
	else{
		System.out.println("acutal is Not same as expectedd");
	}
	}
}



// Assert.assertEquals(driver.getCurrentUrl(), expectedURL);  // hard assertion used in tc1 