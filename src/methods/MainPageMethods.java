package methods;

import org.openqa.selenium.support.PageFactory;

import main.Logger;
import main.Setup;
import main.Constant;
import pageobjects.MainPage;
import utils.ProjectConstant;

/**
 * Class for methods related to actions within the Main/Welcome Page
 * @author jctjavier
 *
 */
public class MainPageMethods {
	
	public static MainPage mainPage = PageFactory.initElements(Setup.driver, MainPage.class);
	
	/**
	 * Opens the main/welcome page for Bol.com
	 */
	public static void openMainPage() {
		Setup.driver.get(ProjectConstant.BOL_NL_URL);
		verifyMainPageOpen();
	}
	
	/**
	 * Verifies the elements on the main/welcome page for Bol.com
	 */
	public static void verifyMainPageOpen() {
		
		if (Setup.driver.getCurrentUrl().equals(ProjectConstant.BOL_NL_URL)) {
			Logger.logTestScript("Verify that the correct URL is displayed.", 
					"The correct URL should be displayed.", "Correct URL was displayed", Constant.PASSED);
		} else {
			Logger.logTestScript("Verify that the correct URL is displayed.", 
					"The correct URL should be displayed.", "Correct URL was NOT displayed", Constant.FAILED);
		}
	}
}
