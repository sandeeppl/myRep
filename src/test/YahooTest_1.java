package test;

import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class YahooTest_1 {
  @Test
  public void readMail() {
	  System.out.println("Read Mail");
  }
  
  @Test
  public void sendMail() {
	  System.out.println("Send Mail");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("IN Before Method");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("In Before test");
	  throw new SkipException("Test has been skipped");
  }

}
