package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class SameDigitsTest {
  SameDigits samedigits = new SameDigits();

  @Test 
  public void case1() {
      assertEquals(171, samedigits.howMany(3, 2));
  }

  @Test 
  public void case2() {
      assertEquals(23525252, samedigits.howMany(723, 38));
  }
}
