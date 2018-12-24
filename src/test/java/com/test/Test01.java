package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test01 {
	
	@Test
	
	public static void testBrowser()
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
	}

}
