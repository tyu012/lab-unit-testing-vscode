package csc207.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * Tests of the sample methods.
 * 
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class SampleMethodsTests {
  /**
   * A test that should succeed.
   */
  @Test
  void sampleSuccesfulTest() {
    assertEquals(2, 2);
  } // sampleSuccessfulTest()

  /**
   * A test that should fail.
   */
  void sampleFailingTest() {
    assertEquals(2, 3);
  } // sampleFailingTest()

  public void test2() {
    assertEquals(10, 3*5, "stupid test");
  } // test2()

  @Test
  public void testC2f0() {
    assertEquals(32, SampleMethods.c2f(0), "test c2f 0");
  } // testC2f0() 

  @Test
  public void testC2f100() {
    assertEquals(212, SampleMethods.c2f(100), "test c2f 100");
  } // testC2f100()

  @Test
  public void testC2fMinus40() {
    assertEquals(-40, SampleMethods.c2f(-40), "test c2f -40");
  } // testC2fMinus40()

} // class TestSampleMethods
