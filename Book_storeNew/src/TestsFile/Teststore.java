package TestsFile;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.Homepage;
import utils.Helper;


public class Teststore extends Helper {
	

	 
	        @Test
	    	public void test001() throws IOException {
	    		Homepage newHome = new Homepage();
	    		
	    		//newHome.navigateHomepage(driver, expectedValue);
	    	newHome.navigateHomepage(driver,"https://www.sarasavi.lk/");
	    	newHome.homepage_verifyFlightDetails(driver, "New Products");
	    		
	    		
	    		
	    		//newtourFlight.newtours_verifyFlightDetails(driver, expectedValue);
	        
	        

	    }
		/*
		 * @Test(priority=0)
		 * 
		 * public void test_Home_Page_Appear_Correct(){
		 * 
		 * //Create Login Page object
		 * 
		 * objhomepage = new Homepage(driver);
		 * 
		 * //Verify login page title
		 * 
		 * String HomePageTitle = objhomepage.getHomePagetext();
		 * Assert.assertTrue(HomePageTitle("New Products"));
		 * 
		 * //login to application //Verify home page
		 * 
		 * 
		 * 
		 * }
		 */
}