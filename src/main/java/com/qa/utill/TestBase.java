package com.qa.utill;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/Users/meghamapalagama/eclipse-workspace/"
					+ "express_maven_bdd-project/src/main/java/com/qa/config/config.properties");
			prop.load(ip);
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
			
		}
		}
	
	
	public static void initialization() throws InterruptedException {
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/meghamapalagama/"
					+ "eclipse-workspace/express_maven_bdd-project/chromedriver");
			driver = new ChromeDriver();
		}
		
		else if(browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "/Users/meghamapalagama/"
					+ "eclipse-workspace/express_maven_bdd-project/geckodriver");
			driver = new FirefoxDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
		//driver.findElement(By.cssSelector("button[aria-label='Focus Close Modal']")).click();
		//Thread.sleep(2000);
		
	}
	
	public void tearDown() {
		driver.close();
	}

}
