package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Runtime.Commands;

public class Homepage extends Commands {
	
	 WebDriver driver;
	

	 By homepagetopic = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div/p[1]/div/div[1]/div[1]/h2");
	

	    public void navigateHomepage(WebDriver driver, String url){

	        open(driver, url);
	        

	    }
	    
	    public void homepage_verifyFlightDetails(WebDriver driver, String expectedText) throws IOException {
			verifyByText(driver, homepagetopic, expectedText);
		}
	    

	    
	
	
}
