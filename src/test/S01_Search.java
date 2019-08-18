package test;

import org.testng.annotations.Test;

import main.BaseClass;
import main.Logger;
import methods.MainPageMethods;
import methods.SearchMethods;

/**
 * Test Cases for Search Product
 * @author jctjavier
 *
 */
public class S01_Search extends BaseClass {

	@Test (groups = { "Search" }, description = "Verify that the user is able to input and obtain correct search results")
	public void S01_01_SuccessfulSearch() {
		MainPageMethods.openMainPage();
		SearchMethods.enterSearchTerm("yoga mat");
		SearchMethods.verifySearchResults("'yoga mat' in Yogamatten");
		
		Logger.validateTestCase();
	}
}
