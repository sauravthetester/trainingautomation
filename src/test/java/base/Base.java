package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	
	public static WebDriver driver = null;
	
	public void initializeBrowserAndLaunchWebsite()
	{
		// Chrome browser launch
		ChromeOptions options = new ChromeOptions();	// To provide chrome customization
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);	// Open google chrome
		
		// implicit wait = 5 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.in/");			// Open a website
	}

}
