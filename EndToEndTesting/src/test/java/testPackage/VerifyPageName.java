package testPackage;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class VerifyPageName {
	WebDriver driver;
  @Test
  public void VerifyWebPageName() {
		driver.get("http://demo.guru99.com/test/guru99home/");  

		String title = driver.getTitle();	
		System.out.println("Testing for Auto Triggar Jenkin..............");
		Assert.assertTrue(title.contains("Demo Guru99 Page")); 
  }
  
  @BeforeTest
  @Parameters("Browser")
  public void beforeTest(String browser) {
	  boolean incognito=true;
	  if(browser.equalsIgnoreCase("chrome"))
	  {
	  WebDriverManager.chromedriver().setup();
		  if(incognito)
		  {
			  ChromeOptions options = new ChromeOptions();
			  options.addArguments("incognito");
			  DesiredCapabilities cap = DesiredCapabilities.chrome();
			  cap.setCapability(ChromeOptions.CAPABILITY, options);
			  driver = new ChromeDriver(cap);
		  }
		  else
		  {
			  driver = new ChromeDriver();
		  }
	  }
	  else
	  {
		  WebDriverManager.edgedriver().setup();
		  driver =  new EdgeDriver();
	  }
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
