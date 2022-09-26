package com.qa.stepDefinition;

import com.qa.pages.AddToBagPage;
import com.qa.pages.HomePage;
import com.qa.pages.MensPage;
import com.qa.pages.SweaterPage;
import com.qa.pages.VNeckSweater;
import com.qa.pages.ViewBagPage;
import com.qa.utill.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageSteps extends TestBase{
	
	HomePage homepage;
	MensPage menspage;
	SweaterPage sweaterpage;
	VNeckSweater vnecksweater;
	AddToBagPage addtobagpage;
	ViewBagPage viewbagpage;
	
	
	@Given("^user open browser$")
	public void user_open_browser() throws Throwable {
		TestBase.initialization();
	    
	}

	@Then("^user able to close pop up box$")
	public void user_able_to_close_pop_up_box() throws Throwable {
		homepage = new HomePage();
		menspage=homepage.openMensPage();
	   
	}

	@Then("^home page is displayed user able to click mens page$")
	public void home_page_is_displayed_user_able_to_click_mens_page() throws Throwable {
		menspage = new MensPage();
		sweaterpage=menspage.clickSweaterPage();
	   
	}

	@Then("^user able to click on sweaters page$")
	public void user_able_to_click_on_sweaters_page() throws Throwable {
		sweaterpage = new SweaterPage();
		vnecksweater=sweaterpage.openVNeckPage();
	
	}
	
	
	
	@Then("^user able to click vnecksweater$")
	public void user_able_to_click_vnecksweater() throws Throwable {
		vnecksweater = new VNeckSweater();
		addtobagpage=vnecksweater.openVNeckPage();
	   
	}

	@Then("^user able to select size and color$")
	public void user_able_to_select_size_and_color() throws Throwable {
	    
	}

	@Then("^user able to add item to bag$")
	public void user_able_to_add_item_to_bag() throws Throwable {
	   
	}

	@Then("^user can click view bag button$")
	public void user_can_click_view_bag_button() throws Throwable {
		addtobagpage = new AddToBagPage();
		viewbagpage=addtobagpage.selectItemsInToBag();
	
	}
	
	@Then("^user can close the browser$")
	public void user_can_close_the_browser() throws Throwable {
		viewbagpage = new ViewBagPage();
		viewbagpage.tearDown();
		
	}
	
    }
