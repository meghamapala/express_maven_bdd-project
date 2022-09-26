package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utill.TestBase;

public class SweaterPage extends TestBase{
	
	@FindBy(css="a[aria-label='MENS SWEATERS']")
	WebElement clickonsweaterpage;
	
	public  SweaterPage() {
	PageFactory.initElements(driver, this);
	
	}
	
	public VNeckSweater openVNeckPage() {
		
		clickonsweaterpage.click();
		
		return new VNeckSweater();

}
}
