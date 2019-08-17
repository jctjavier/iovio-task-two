package methods;

import org.openqa.selenium.support.PageFactory;

import main.Constant;
import main.Logger;
import main.Setup;
import pageobjects.MainPage;

public class MainPageMethods {
	
	public static MainPage mainPage = PageFactory.initElements(Setup.driver, MainPage.class);
	
	/**
	 * Opens the main/welcome page for Bol.com
	 */
	public static void openMainPage() {
		Setup.driver.get("https://www.bol.com");
		verifyMainPageOpen();
	}
	
	/**
	 * Verifies the elements on the main/welcome page for Bol.com
	 */
	public static void verifyMainPageOpen() {
		
		// URL should be equal to NL, since this is the default in NL
		if (Setup.driver.getCurrentUrl().equals("https://www.bol.com/nl/")) {
			Logger.logTestScript("Verify that the correct URL is displayed.", 
					"The correct URL should be displayed.", "Correct URL was displayed", Constant.PASSED);
		} else {
			Logger.logTestScript("Verify that the correct URL is displayed.", 
					"The correct URL should be displayed.", "Correct URL was NOT displayed", Constant.FAILED);
		}
	}
}
