package csc207.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.abort;
import org.junit.jupiter.api.Test;

public class ExptTest {

  @Test
  public void testExpt1() {
    for (int b = 2; b < 5; b++) {
      int expected = 1;
      for (int i = 0; i <= 10; i++) {
        assertEquals(expected, SampleMethods.expt(b, i), "Exponent Test 1");
        expected = expected * b;
      } // nested for
    } // for

  } // testExpt1()

} // class ExptTest 
