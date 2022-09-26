package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utill.TestBase;

public class VNeckSweater extends TestBase{
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div/div[10]/div[1]/a/img")
	WebElement vnecksweaterpage;
	
	public VNeckSweater () {
	PageFactory.initElements(driver, this);
	
	}
	
	public AddToBagPage openVNeckPage() {
		
		vnecksweaterpage.click();
		
		return new AddToBagPage();

}

}
