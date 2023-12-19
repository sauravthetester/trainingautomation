package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.Base;
import pom.HomePage;
import utilities.CommonActions;

public class TestCases extends Base{
	
	Base base=null;
	
	@BeforeMethod
	public void setUp()
	{
		base = new Base();
		base.initializeBrowserAndLaunchWebsite();
	}
	
	@Test(priority=1)
	public void amazonVerifyEnglishLanguageSelected() throws InterruptedException
	{
		CommonActions.waitForElementToBeClickable(driver, HomePage.getSearchInput(), 30);
		CommonActions.jsExecuteScroll(driver, HomePage.getLanguageSelectionFooter());
		
		Thread.sleep(5000);
		
		WebElement language = driver.findElement(By.xpath(HomePage.getLanguage()));
		WebElement countryNameInFooter = driver.findElement(By.xpath(HomePage.getCountryNameInFooter()));
		
		String languageSelected = language.getText();
		
		Assert.assertEquals(languageSelected, "English");
		Assert.assertTrue(countryNameInFooter.isDisplayed());
		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

	
}
