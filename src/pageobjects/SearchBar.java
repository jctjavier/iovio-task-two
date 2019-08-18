package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Class for Search Bar elements
 * @author jctjavier
 */
public class SearchBar {
	
	@FindBy(how = How.ID, using="searchfor")
	public WebElement searchTextBox;
	
	@FindBy(how = How.XPATH, using="//*[@type='submit']")
	public WebElement submitBtn;

	
}
