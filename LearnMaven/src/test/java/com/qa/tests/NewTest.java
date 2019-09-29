package com.qa.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class NewTest {
	WebDriver driver;
	  @BeforeClass
	  public void driverInitialization() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\amarp\\OneDrive\\Documents\\Automation payal\\chromedriver_win32-74\\chromedriver.exe");
		  driver=new ChromeDriver();
	  }

  @Test
  public void openGmail() {
	  driver.get("https://accounts.google.com/servicelogin");
	  System.out.println("Gmail page is open");
  }
 

}
