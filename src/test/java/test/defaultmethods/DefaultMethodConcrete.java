package test.defaultmethods;

import org.testng.annotations.Test;

/**
 * This class is used to test invocation of methods on classes that inherit
 * default methods from an interface.
 *
 * @author ronald.d.rogers@gmail.com
 */
public class DefaultMethodConcrete implements DefaultMethodInterface {
  private static boolean concreteTest1Ran = false;
  private static boolean concreteTest2Ran = false;
  private static boolean concreteTest3Ran = true;
  private static boolean concreteTest4Ran = true;
  private static boolean interfaceTest1Ran = false;
  private static boolean interfaceTest2Ran = true;

  @Override
  public void setInterfaceTest1Ran(boolean ran) {
    interfaceTest1Ran = ran;
  }

  @Override
  public void setInterfaceTest2Ran(boolean ran) {
    interfaceTest2Ran = ran;
  }

  public static void reset() {
    concreteTest1Ran = false;
    concreteTest2Ran = false;
    concreteTest3Ran = true;
    concreteTest4Ran = true;
    interfaceTest1Ran = false;
    interfaceTest2Ran = true;
  }

  @Test(groups = { "group1" })
  public void concreteShouldRun1() {
    concreteTest1Ran = true;
  }

  @Test(groups = { "group1" })
  public void concreteShouldRun2() {
    concreteTest2Ran = true;
  }

  @Test
  public void concreteShouldNotRun1() {
    concreteTest3Ran = false;
  }

  @Test
  public void concreateShouldNotRun2() {
    concreteTest4Ran = false;
  }

  public static void verify() {
    assert
    concreteTest1Ran
    && concreteTest2Ran
    && concreteTest3Ran
    && concreteTest4Ran
    && interfaceTest1Ran
    && interfaceTest2Ran:
      "All booleans should be true: "
      + concreteTest1Ran + " "
      + concreteTest2Ran + " "
      + concreteTest3Ran + " "
      + concreteTest4Ran + " "
      + interfaceTest1Ran + " "
      + interfaceTest2Ran;
  }
  static private void ppp(String s) {
    System.out.println("[DefaultMethodConcrete] " + s);
  }

}
