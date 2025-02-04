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
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("start-maximized");
		//options.addArguments("incognito");
//		options.addArguments("--headless=new");
//		WebDriverManager.chromedriver().setup();
		
//		WebDriverManager
//        .chromedriver()
//        .capabilities(new ChromeOptions().addArguments("--headless=new").addArguments("--remote-allow-origins=*"))
//        .clearDriverCache()
//        .clearResolutionCache()
//        .create();
		
		
		
//		String apikey = ConfigurationManager.AppSettings["BROWSERLESS_API_KEY"];
		ChromeOptions chromeOptions = new ChromeOptions();
		// Set launch args similar to puppeteer's for best performance
		chromeOptions.addArguments("--disable-background-timer-throttling");
		chromeOptions.addArguments("--disable-backgrounding-occluded-windows");
		chromeOptions.addArguments("--disable-breakpad");
		chromeOptions.addArguments("--disable-component-extensions-with-background-pages");
		chromeOptions.addArguments("--disable-dev-shm-usage");
		chromeOptions.addArguments("--disable-extensions");
		chromeOptions.addArguments("--disable-features=TranslateUI,BlinkGenPropertyTrees");
		chromeOptions.addArguments("--disable-ipc-flooding-protection");
		chromeOptions.addArguments("--disable-renderer-backgrounding");
		chromeOptions.addArguments("--enable-features=NetworkService,NetworkServiceInProcess");
		chromeOptions.addArguments("--force-color-profile=srgb");
		chromeOptions.addArguments("--hide-scrollbars");
		chromeOptions.addArguments("--metrics-recording-only");
		chromeOptions.addArguments("--mute-audio");
		chromeOptions.addArguments("--headless");
		chromeOptions.addArguments("--no-sandbox");
		
		driver = new ChromeDriver(chromeOptions);	// Open google chrome
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		
		driver.get(Links.urlToNavigate);			// Open a website
	}

}
