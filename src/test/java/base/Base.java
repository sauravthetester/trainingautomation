package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.Links;

public class Base {
	
	public static WebDriver driver = null;
	
	public void initializeBrowserAndLaunchWebsite()
	{
		// Chrome browser launch
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("start-maximized");
		//options.addArguments("incognito");
		
		driver = new ChromeDriver();	// Open google chrome
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		driver.get(Links.urlToNavigate);			// Open a website
	}

}
