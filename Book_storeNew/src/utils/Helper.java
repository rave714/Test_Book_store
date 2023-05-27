package utils;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

public class Helper {

	protected WebDriver driver;

	@BeforeMethod
	public void beforeMethod() throws Exception {

		String os = System.getProperty("os.name").toLowerCase();
		File driverFile;

		if (os.contains("win")) {
			
			ChromeOptions options = new ChromeOptions();
		    options.addArguments("--remote-allow-origins=*");
		    driver = new ChromeDriver(options);
		  
		;
		} else if (os.contains("mac")) {
			throw new Exception("Operating system not yet supported");
		
			
		}

		
		//driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new WebDriverWait(driver, Duration.ofSeconds(40));
		
		
		
		driver.manage().window().maximize();
		
		driver.quit();
	}

}
