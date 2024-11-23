package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Commands {
	
	public static void waitForElementToBeClickable(WebDriver driver, String xpath, long secs)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(secs)); 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
	}
	
	public static void waitForElementToBeVisible(WebDriver driver, String xpath, long secs)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(secs)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}
	
	public static void jsExecuteScroll(WebDriver driver, String xpath)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(xpath)));
	}
	
	public static void waitAndClick(WebDriver driver, String xpath, long secs)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(secs)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		
		driver.findElement(By.xpath(xpath)).click();
		
		Actions act = new Actions(driver);
		act.click(driver.findElement(By.xpath(xpath)));
	}

}
