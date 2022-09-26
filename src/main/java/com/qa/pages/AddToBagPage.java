package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utill.TestBase;

public class AddToBagPage extends TestBase{
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div/section/section[1]/section/div[6]/div/div[4]/button/span")
	WebElement selectsizeandcolor;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div/section/section[1]/section/button")
	WebElement clickaddtobagbtn;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[3]/div/a")
	WebElement clickviewbagbtn;
	
	public AddToBagPage () {
		PageFactory.initElements(driver, this);
	}
	
	public ViewBagPage selectItemsInToBag() {
		selectsizeandcolor.click();
		clickaddtobagbtn.click();
		clickviewbagbtn.click();
		
		return new ViewBagPage();
	}

}
