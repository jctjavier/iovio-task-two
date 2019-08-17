package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchResults {
	
	@FindBy(how = How.ID, using="js_listpage_objects")
	public WebElement searchResultsHeader;
	
	@FindBy(how = How.XPATH, using="//*/div[@id='js_listpage_objects']/*/h1[@data-test='page-title']")
	public WebElement searchResultsTitle;
}
