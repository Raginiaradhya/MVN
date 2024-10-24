package com.actitime.testscript;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class CustomerModule extends BaseClass {
	@Test
	public void CreateCustomer()
	{
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	
		String title = driver.getTitle();
		System.out.println(title);
	}

}
