package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utill.TestBase;

public class MensPage extends TestBase{
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[2]/nav/ol/li[2]/a")
	WebElement openmenspage;
	
	public MensPage() {
		PageFactory.initElements(driver, this);
	}
	
	public SweaterPage clickSweaterPage() {
		openmenspage.click();
		
		return new SweaterPage();
	}

}
