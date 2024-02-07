package csc207.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class SumTest {
  @Test
  public void testSimpleSum() {
    int[] values = { 1, 2, 3 };
    assertEquals(6, SampleMethods.sum(values), "1+2+3");
  }

  @Test
  public void testNegativeSum() {
    int[] values = {1, -2, -5};
    assertEquals(-6, SampleMethods.sum(values), "1+(-2)+(-5)");
  }

  @Test
  public void testSumOfOneValue() {
    int[] values = {9};
    assertEquals(9, SampleMethods.sum(values), "9");
  }

  @Test
  public void testExtremes() {
    int tmp = Integer.MAX_VALUE - 10;
    int[] values = { tmp, tmp, -tmp, -tmp };
    assertEquals(0, SampleMethods.sum(values), "extreme values");
  } // testExtremes
}
