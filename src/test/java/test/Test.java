package test;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		String searchInput = "//input[@id='twotabsearchtextbox']";

		
		String languageSelectionFooter = "//a[@id='icp-touch-link-language']";

		
		// Chrome browser launch
		ChromeOptions options = new ChromeOptions();	// To provide chrome customization
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);	// Open google chrome
		
		// implicit wait = 5 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.in/");			// Open a website
		
		
		
		
		
		
		
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(searchInput)));
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(languageSelectionFooter)));
		
		
//		driver.findElement(By.xpath(signUpWithGoogleXpath)).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String searchBtn = "//input[@id='twotabsearchtextbox']/ancestor::div[2]/following-sibling::div//input";
//		String mouseImage ="//div[@class='puisg-row']//img";
//		
//		String signUpWithGoogleXpath = "//span[text()='Sign up with Google']";
		
		
		
		
//		// Search for mouse
//		driver.findElement(By.xpath(searchInput)).sendKeys("mouse");
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15)); // 5 + 15
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(searchBtn))); // every 500ms = 1/2 sec program checks for the element
//		driver.findElement(By.xpath(searchBtn)).click();
		
		
		

	}

}
