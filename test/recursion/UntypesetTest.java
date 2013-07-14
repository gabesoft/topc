package topc.test.recursion;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.recursion.*;

public class UntypesetTest {
  Untypeset untypeset = new Untypeset();

  @Test
  public void case1() {
    String[] expression = { "2801" };
    assertEquals(2801, untypeset.evaluate(expression));
  }

  @Test
  public void case2() {
    String[] expression = { "  625       ", "------------", "        5   " };
    assertEquals(125, untypeset.evaluate(expression));
  }

  @Test
  public void case3() {
    String[] expression = { "       ", "500    ", "       ", "    +  ", "       ", "       ", "      1", "       ", "       " };
    assertEquals(501, untypeset.evaluate(expression));
  }

  @Test
  public void case4() {
    String[] expression = { "   120   ", "  -----  ", "    10   ", "---------", "    6    ", "   ---   ", "    2    " };
    assertEquals(4, untypeset.evaluate(expression));
  }

  @Test
  public void case5() {
    String[] expression = { "       24       ", " 31 + ----      ", "       12   + 16", "-----------     ", "   5 + 6        " };
    assertEquals(19, untypeset.evaluate(expression));
  }

  @Test
  public void case6() {
    String[] expression = { "3 + 4 + 6" };
    assertEquals(13, untypeset.evaluate(expression));
  }

  @Test
  public void case7() {
    String[] expression = { " 1     4     9 ", "--- + --- + ---", " 1     2     3 " };
    assertEquals(6, untypeset.evaluate(expression));
  }

  @Test
  public void case8() {
    String[] expression = { "1" };
    assertEquals(1, untypeset.evaluate(expression));
  }

  @Test
  public void case9() {
    String[] expression = { "1 + 1" };
    assertEquals(2, untypeset.evaluate(expression));
  }

  @Test
  public void case10() {
    String[] expression = { " 1 ", "---", " 1 " };
    assertEquals(1, untypeset.evaluate(expression));
  }

  @Test
  public void case11() {
    String[] expression = { " 3 + 5 ", "-------", "   2   " };
    assertEquals(4, untypeset.evaluate(expression));
  }

  @Test
  public void case12() {
    String[] expression = { "    720    ", "   -----   ", "     2     ", "  -------  ", "     3     ", " --------- ", "     4     ", "-----------", "     5     " };
    assertEquals(6, untypeset.evaluate(expression));
  }

  @Test
  public void case13() {
    String[] expression = { "    120    ", "-----------", "    24     ", " --------  ", "    12     ", "  ------   ", "     6     ", "    ---    ", "     2     " };
    assertEquals(20, untypeset.evaluate(expression));
  }

  @Test
  public void case14() {
    String[] expression = { "           100     750 + 750 + 750 + 750          ", "          ----- + -----------------------         ", "            1            1 + 3 + 2                ", "--------------------------------------------------", "     500 + 499 + 1                                ", "    ---------------          140                  ", "        49          + 48 + -------       9        ", "       ---- + 493           5 + 5       ---       ", "         7                               3        ", "  ---------------------------------- + ----- + 21 ", "     1 + 2 + 3 + 4 + 5 + 6 + 7           6        ", "    ---------------------------         ---       ", "             4999 + 1           + 4      2        ", "        1 + ---------- + 1                        ", "               1000                               " };
    assertEquals(20, untypeset.evaluate(expression));
  }

  @Test
  public void case15() {
    String[] expression = { "34      ", "        ", "        ", "        ", "        ", "        ", "        ", "        ", "        ", "        ", "        ", "        ", "        ", "        ", "        ", "   +    ", "        ", "        ", "        ", "        ", "        ", "        ", "        ", "        ", "        ", "        ", "        ", "        ", "        ", "        ", "        ", "        ", "        ", "        ", "        ", "        ", "        ", "        ", "        ", "        ", "        ", "        ", "        ", "        ", "        ", "        ", "        ", "        ", "        ", "     924" };
    assertEquals(958, untypeset.evaluate(expression));
  }

  @Test
  public void case16() {
    String[] expression = { " 1200                                             ", "--------------------------------------------------", "                                                6 " };
    assertEquals(200, untypeset.evaluate(expression));
  }

  @Test
  public void case17() {
    String[] expression = { "       52       ", "      ----      ", "        2       ", " -------------- ", "       84       ", "    --------    ", "       28       ", "     ------     ", "       35       ", "      ----      ", "       5        ", "   ----------   ", "       18       ", "    --------    ", "       60       ", "     ------     ", "       80       ", "      ----      ", "        8       ", "  ------------  ", "        7       ", "----------------", "       40       ", "    --------    ", "       36       ", "      ----      ", "        3       ", "     ------     ", "        3       ", " -------------- ", "       15       ", "  ------------  ", "       54       ", "      -----     ", "        6       ", "       ---      ", "        3       ", "     -------    ", "        3       ", "   ----------   ", "       102      ", "     ------     ", "       12       ", "      ----      ", "       6        ", "    --------    ", "       34       ", "      ----      ", "        2       " };
    assertEquals(13, untypeset.evaluate(expression));
  }

  @Test
  public void case18() {
    String[] expression = { "  20  ", " ---- ", "   2  ", "------", "  10  ", " ---- ", "   2  " };
    assertEquals(2, untypeset.evaluate(expression));
  }

  @Test
  public void case19() {
    String[] expression = { "       24       ", " 31 + ----      ", "       12   + 16", "-----------     ", "   5 + 6        " };
    assertEquals(19, untypeset.evaluate(expression));
  }

}
