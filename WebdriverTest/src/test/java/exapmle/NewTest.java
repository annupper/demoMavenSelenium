package exapmle;
		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	private WebDriver driver;
	private String baseUrl;
	
  @Test
  public void testEasy() {
	 // System.setProperty("webdriver.gecko.driver","C:\\Users\\anna.zhuravleva\\Documents\\Alrquitectura\\WebDrivers\\Mozilla Firefox\\geckodriver.exe");

	  System.out.println("TEST");
	  baseUrl = "https://www.google.com";
	  driver.get(baseUrl);
  }
  @BeforeTest
  public void beforeTest() {
	//  System.setProperty("webdriver.chrome.driver","C:\\Users\\anna.zhuravleva\\Documents\\Alrquitectura\\WebDrivers\\Chrome Driver\\chromedriver.exe"); //my windows path
	 //System.setProperty("webdriver.chrome.driver","..//chromedriver"); //relative path windows
	 // System.setProperty("webdriver.chrome.driver","//tmp//jenkins//tools//chromedriver"); //path linux for jenkins chromedriver
	 // driver = new ChromeDriver();
	  System.out.println("Starting Before TEST");
	  DesiredCapabilities caps = new DesiredCapabilities();
caps.setJavascriptEnabled(true);                
caps.setCapability("takesScreenshot", true);  
caps.setCapability(
                        PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
                        "//usr//local//bin/phantomjs"
                    );
driver = new  PhantomJSDriver(caps);
		
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Starting After TEST");
	  driver.quit();
  }

}
