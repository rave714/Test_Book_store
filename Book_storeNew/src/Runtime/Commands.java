package Runtime;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Commands {
	public void open(WebDriver driver, String url) {
	  	try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void click(WebDriver driver, By locator) {
	  	try {
			WebElement element = driver.findElement(locator);
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void type(WebDriver driver, By locator, String value) {
	  	try {
			WebElement element = driver.findElement(locator);
			element.clear();
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void select(WebDriver driver, String locator, String value) {	
	  	try {
			WebElement element = driver.findElement(By.xpath(locator));
			new Select(element).selectByVisibleText(value);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void verifyByText(WebDriver driver, By locator, String expectedText) {
	  	try {
			WebElement element = driver.findElement(locator);
			assertEquals(element.getText(), expectedText);
		} catch (Exception e) {
			e.printStackTrace();
		}  

	}
	
}
