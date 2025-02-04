package pom;

public class HomePage {
	
	private static String searchInput = "//input[@id='twotabsearchtextbox']";
	private static String languageSelectionFooter = "//a[@id='icp-touch-link-language']";
	private static String language = "//a[@id='icp-touch-link-language']//span";
	private static String amazonLogoInFooter = "//div[contains(@class,'navFooterLinkLine')]//a[@aria-label='Amazon India Home']";    
	
	// Page factory model - @FindBy @FindAll @FindAny
	public static String getSearchInput()
	{
		return searchInput;
	}
	
	public static String getLanguageSelectionFooter()
	{
		return languageSelectionFooter;
	}
	
	public static String getLanguage()
	{
		return language;
	}
	public static String getzamazonLogoInFooter()
	{
		return amazonLogoInFooter;
	}

}
