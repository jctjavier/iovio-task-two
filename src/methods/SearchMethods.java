package methods;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import main.Constant;
import main.Logger;
import main.Setup;
import main.Utils;
import pageobjects.SearchBar;
import pageobjects.SearchResults;

/**
 * Class for methods related to Search Product actions
 * @author jctjavier
 */
public class SearchMethods {
	
	public static SearchBar searchBarElements = PageFactory.initElements(Setup.driver, SearchBar.class); 
	public static SearchResults searchResultsElements = PageFactory.initElements(Setup.driver, SearchResults.class);
	
	/**
	 * Method to input search term into search text box, and click submit button (magnifying glass)
	 * @param searchTerm
	 */
	public static void enterSearchTerm(String searchTerm) {
		if (searchBarElements.searchTextBox.isDisplayed()) {
			Logger.logTestScript("Verify that search textbox is displayed.", 
					"Search text box should be displayed.", "Search text box was displayed", Constant.PASSED);
		} else {
			Logger.logTestScript("Verify that search textbox is displayed.", 
					"Search text box should be displayed.", "Search text box was NOT displayed", Constant.FAILED);
		}
		searchBarElements.searchTextBox.click();
		searchBarElements.searchTextBox.sendKeys(searchTerm);
		Reporter.log("Entered search term: " + searchTerm);
		searchBarElements.submitBtn.click();
		Utils.explicitWait(10);
	}
	
	/**
	 * Method to verify that the search results are correct
	 * @param searchResultTitle
	 */
	public static void verifySearchResults(String searchResultTitle) {
		if (searchResultsElements.searchResultsHeader.isDisplayed()) {
			Logger.logTestScript("Verify that search results title header is displayed.", 
					"Search results title header should be displayed.", "Search results title header was successfully displayed.", Constant.PASSED);
		} else {
			Logger.logTestScript("Verify that search results title header is displayed.", 
					"Search results title header should be displayed.", "Search results title header was NOT displayed.", Constant.FAILED);
		}
		if (searchResultsElements.searchResultsTitle.getText().equals(searchResultTitle)) {
			Logger.logTestScript("Verify that search results title is correct.", 
					"Search results title header should be correct.", "Search results title header was correct. Title was: " + searchResultsElements.searchResultsTitle.getText(), Constant.PASSED);
		} else {
			Logger.logTestScript("Verify that search results title is correct.", 
					"Search results title header should be correct.", "Search results title header was incorrect. Title was: " + searchResultsElements.searchResultsTitle.getText(), Constant.FAILED);
		}
	}
}
