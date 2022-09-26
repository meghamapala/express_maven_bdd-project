package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utill.TestBase;

public class HomePage extends TestBase{
	
	    @FindBy(xpath="/html/body/div[3]/div/div/section[2]/button")
	    WebElement closepopup;
	
		public HomePage() {
	    PageFactory.initElements(driver, this);
		}
		
		public MensPage openMensPage(){
			closepopup.click();
		
			
			return new MensPage();
			
		}
		
     }
