package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {
	
	@FindBy(how = How.ID, using="js_consent_bar")
	public WebElement consentBar;
	
	@FindBy(how = How.CLASS_NAME, using="usp-banner")
	public WebElement selectBanner;
	
	@FindBy(how = How.CLASS_NAME, using="wsp-header js_main_header")
	public WebElement mainHeader;
	
	@FindBy(how = How.CLASS_NAME, using="main")
	public WebElement mainSection;
}
