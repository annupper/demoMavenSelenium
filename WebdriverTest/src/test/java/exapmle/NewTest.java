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

	  System.out.println("TEST");
	  
  }
  @BeforeTest
  public void beforeTest() {
	//  System.setProperty("webdriver.chrome.driver","C:\\Users\\anna.zhuravleva\\Documents\\Alrquitectura\\WebDrivers\\Chrome Driver\\chromedriver.exe"); //my windows path
	 //System.setProperty("webdriver.chrome.driver","..//chromedriver"); //relative path windows
	 // System.setProperty("webdriver.chrome.driver","//tmp//jenkins//tools//chromedriver"); //path linux for jenkins chromedriver
	 // driver = new ChromeDriver();
	  System.out.println("Starting Before TEST");
		
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Starting After TEST");
  }

}
