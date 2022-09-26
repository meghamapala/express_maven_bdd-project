package com.qa.pages;

import org.openqa.selenium.WebDriver;

import com.qa.utill.TestBase;

public class ViewBagPage extends TestBase{
	
	WebDriver driver;
	
	public void teardown() throws InterruptedException {
		driver.close();
    
	}
	
    }
