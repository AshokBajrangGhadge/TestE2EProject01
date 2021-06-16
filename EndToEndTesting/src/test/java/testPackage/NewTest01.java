package testPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest01 {
  @Test
  public void FirstHello() {
	  System.out.println("HI........ I am first Hello");
	  System.out.println("HI........ I am first Hello");
	  System.out.println("HI........ I am first Hello");
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
