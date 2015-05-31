package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class YahooNewsTest_2 {
  @Test
  public void ReadNews() {
	  System.out.println("IN Read News");
	  try{
	 Assert.assertEquals("Good1", "Good");
	  }catch(Throwable t){
		  System.out.println("Caught error");
	  }
	 Assert.assertTrue(1==1, "Equal");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Yahoo News test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Afte yahoo news test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Afte suite");
  }

}
