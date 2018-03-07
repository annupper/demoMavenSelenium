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
	
  @Test
  public void testEasy() {
	 // System.setProperty("webdriver.gecko.driver","C:\\Users\\anna.zhuravleva\\Documents\\Alrquitectura\\WebDrivers\\Mozilla Firefox\\geckodriver.exe");
	  	
	  	String baseUrl = "https://www.google.com";
	  	driver.get(baseUrl);
  }
  @BeforeTest
  public void beforeTest() {
	  
	//  System.setProperty("webdriver.chrome.driver","C:\\Users\\anna.zhuravleva\\Documents\\Alrquitectura\\WebDrivers\\Chrome Driver\\chromedriver.exe"); //my windows path
	  System.setProperty("webdriver.chrome.driver","lib//chromedriver.exe"); //relative path
	 // System.setProperty("webdriver.chrome.driver","usr\\bin\\chromedriver.exe"); //ubuntu path
	  driver = new ChromeDriver();
	  
		
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
