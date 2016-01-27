package test.defaultmethods;

import org.testng.annotations.Test;

public interface DefaultMethodInterface {
  public void setInterfaceTest1Ran(boolean ran);
  public void setInterfaceTest2Ran(boolean ran);

  @Test(groups = { "group1" })
  default public void interfaceShouldRun1() {
    setInterfaceTest1Ran(true);
  }

  @Test
  default public void interfaceShouldNotRun2() {
    setInterfaceTest2Ran(false);
  }

}
