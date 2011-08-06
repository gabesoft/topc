package topc.test.dp;

import java.util.*;
import junit.framework.*;
import static org.junit.Assert.*;
import org.junit.Test;

import topc.dp.*;

public class ShortPalindromesTest {
  ShortPalindromes _calc = new ShortPalindromes();

  //@Test
  public void case1() {
    assertEquals("ECARACE", _calc.shortest("RACE"));
  }

  //@Test
  public void case2() {
    assertEquals("REDTOCPCOTDER", _calc.shortest("TOPCODER"));
  }

  //@Test
  public void case3() {
    assertEquals("Q", _calc.shortest("Q"));
  }

  //@Test
  public void case4() {
    assertEquals("MADAMIMADAM", _calc.shortest("MADAMIMADAM"));
  }

  @Test
  public void case5() {
    String expected = "AFLRCAGIOEOUAEOCEGRURGECOEAUOEOIGACRLFA";
    String actual = _calc.shortest("ALRCAGOEUAOEURGCOEUOOIGFA");
    debug("expected.length()", expected.length());
    debug("actual.length()", actual.length());
    assertEquals(expected, actual);
  }

  void debug(Object...os) {
    System.out.println(Arrays.deepToString(os));
  }
}
