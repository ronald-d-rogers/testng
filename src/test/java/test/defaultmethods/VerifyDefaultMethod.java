package test.defaultmethods;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * This class verifies that the correct methods were run
 *
 * @author ronald.d.rogers@gmail.com
 */
@Test(dependsOnGroups = { "group1" })
public class VerifyDefaultMethod {

  @BeforeSuite
  public void init() {
    DefaultMethodConcrete.reset();
  }

  @Test
  public void verify() {
    DefaultMethodConcrete.verify();
  }

}
