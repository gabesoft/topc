package topc.test.dp;

import junit.framework.*;
import static org.junit.Assert.*;
import org.junit.Test;

import topc.dp.*;

public class ShortPalindromesTest {
  ShortPalindromes _calc = new ShortPalindromes();

  @Test
  public void case1() {
    assertEquals("ECARACE", _calc.shortest("RACE"));
  }

  @Test
  public void case2() {
    assertEquals("REDTOCPCOTDER", _calc.shortest("TOPCODER"));
  }

  @Test
  public void case3() {
    assertEquals("Q", _calc.shortest("Q"));
  }

  @Test
  public void case4() {
    assertEquals("MADAMIMADAM", _calc.shortest("MADAMIMADAM"));
  }

  @Test
  public void case5() {
    assertEquals("AFLRCAGIOEOUAEOCEGRURGECOEAUOEOIGACRLFA", _calc.shortest("ALRCAGOEUAOEURGCOEUOOIGFA"));
  }
}
