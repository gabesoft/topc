package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class FlagsTest {
  Flags flags = new Flags();

  @Test
  public void case1() {
    String numFlags = "10";
    String[] forbidden = { "0", "1 2", "1 2" };
    assertEquals(3L, flags.numStripes(numFlags, forbidden));
  }

  @Test
  public void case2() {
    String numFlags = "100";
    String[] forbidden = { "0", "1", "2" };
    assertEquals(6L, flags.numStripes(numFlags, forbidden));
  }

  @Test
  public void case3() {
    String numFlags = "93";
    String[] forbidden = { "0", "1", "2" };
    assertEquals(5L, flags.numStripes(numFlags, forbidden));
  }

  @Test
  public void case4() {
    String numFlags = "94";
    String[] forbidden = { "0", "1", "2" };
    assertEquals(6L, flags.numStripes(numFlags, forbidden));
  }

  @Test
  public void case5() {
    String numFlags = "100000000000000000";
    String[] forbidden = { "0", "1" };
    assertEquals(50000000000000000L, flags.numStripes(numFlags, forbidden));
  }

  @Test
  public void case6() {
    String numFlags = "100000000000000000";
    String[] forbidden = { "0", "1 2", "1 2" };
    assertEquals(108L, flags.numStripes(numFlags, forbidden));
  }

  @Test
  public void case7() {
    String numFlags = "10000000000000000";
    String[] forbidden = { "0 1", "0 1", "2 3 4", "2 3 4", "2 3 4" };
    assertEquals(40L, flags.numStripes(numFlags, forbidden));
  }

  @Test
  public void case8() {
    String numFlags = "10000000000000000";
    String[] forbidden = { "0 5 6 7 8 9", "1", "2", "3", "4", "0 5", "0 6", "0 7", "0 8", "0 9" };
    assertEquals(18L, flags.numStripes(numFlags, forbidden));
  }

  @Test
  public void case9() {
    String numFlags = "10000000000000000";
    String[] forbidden = { "0 1 2 3 4 5 6 7 8 9", "0 1 3 4 5 6 7 8 9", "0 2 3 4 5 6 7 8 9", "0 1 2 3 4 5 6 7 8 9", "0 1 2 3 4 5 6 7 8 9", "0 1 2 3 4 5 6 7 8 9", "0 1 2 3 4 5 6 7 8 9", "0 1 2 3 4 5 6 7 8 9", "0 1 2 3 4 5 6 7 8 9", "0 1 2 3 4 5 6 7 8 9" };
    assertEquals(4999999999999996L, flags.numStripes(numFlags, forbidden));
  }

  @Test
  public void case10() {
    String numFlags = "14";
    String[] forbidden = { "0", "1 2", "1 2" };
    assertEquals(4L, flags.numStripes(numFlags, forbidden));
  }

  @Test
  public void case11() {
    String numFlags = "13";
    String[] forbidden = { "0", "1 2", "1 2" };
    assertEquals(3L, flags.numStripes(numFlags, forbidden));
  }

  @Test
  public void case12() {
    String numFlags = "21";
    String[] forbidden = { "0", "1 2", "1 2" };
    assertEquals(4L, flags.numStripes(numFlags, forbidden));
  }

  @Test
  public void case13() {
    String numFlags = "22";
    String[] forbidden = { "0", "1 2", "1 2" };
    assertEquals(5L, flags.numStripes(numFlags, forbidden));
  }

  @Test
  public void case14() {
    String numFlags = "41";
    String[] forbidden = { "0", "1 2", "1 2", "3" };
    assertEquals(4L, flags.numStripes(numFlags, forbidden));
  }

  @Test
  public void case15() {
    String numFlags = "40";
    String[] forbidden = { "0", "1 2", "1 2", "3" };
    assertEquals(3L, flags.numStripes(numFlags, forbidden));
  }

  @Test
  public void case16() {
    String numFlags = "5";
    String[] forbidden = { "0", "1", "2", "3", "4", "5" };
    assertEquals(1L, flags.numStripes(numFlags, forbidden));
  }

  @Test
  public void case17() {
    String numFlags = "3";
    String[] forbidden = { "0", "1", "2" };
    assertEquals(1L, flags.numStripes(numFlags, forbidden));
  }

  @Test
  public void case18() {
    String numFlags = "4";
    String[] forbidden = { "0", "1", "2" };
    assertEquals(2L, flags.numStripes(numFlags, forbidden));
  }

  @Test
  public void case19() {
    String numFlags = "7";
    String[] forbidden = { "0", "1", "2", "3", "4", "5" };
    assertEquals(2L, flags.numStripes(numFlags, forbidden));
  }

  @Test
  public void case20() {
    String numFlags = "6";
    String[] forbidden = { "0", "1", "2", "3", "4", "5" };
    assertEquals(1L, flags.numStripes(numFlags, forbidden));
  }

  @Test
  public void case21() {
    String numFlags = "10";
    String[] forbidden = { "0 1", "0 1 2", "1 2 3", "2 3 4", "3 4 5", "4 5 6", "5 6 7", "6 7 8", "7 8 9", "8 9" };
    assertEquals(1L, flags.numStripes(numFlags, forbidden));
  }

  @Test
  public void case22() {
    String numFlags = "11";
    String[] forbidden = { "0 1", "0 1 2", "1 2 3", "2 3 4", "3 4 5", "4 5 6", "5 6 7", "6 7 8", "7 8 9", "8 9" };
    assertEquals(2L, flags.numStripes(numFlags, forbidden));
  }

  @Test
  public void case23() {
    String numFlags = "82";
    String[] forbidden = { "0 1", "0 1 2", "1 2 3", "2 3 4", "3 4 5", "4 5 6", "5 6 7", "6 7 8", "7 8 9", "8 9" };
    assertEquals(2L, flags.numStripes(numFlags, forbidden));
  }

  @Test
  public void case24() {
    String numFlags = "83";
    String[] forbidden = { "0 1", "0 1 2", "1 2 3", "2 3 4", "3 4 5", "4 5 6", "5 6 7", "6 7 8", "7 8 9", "8 9" };
    assertEquals(3L, flags.numStripes(numFlags, forbidden));
  }

  @Test
  public void case25() {
    String numFlags = "100000000000000000";
    String[] forbidden = { "0 1", "0 1 2", "1 2 3", "2 3 4", "3 4 5", "4 5 6", "5 6 7", "6 7 8", "7 8 9", "8 9" };
    assertEquals(20L, flags.numStripes(numFlags, forbidden));
  }

  @Test
  public void case26() {
    String numFlags = "32899482551498534";
    String[] forbidden = { "0 1", "0 1 2", "1 2 3", "2 3 4", "3 4 5", "4 5 6", "5 6 7", "6 7 8", "7 8 9", "8 9" };
    assertEquals(19L, flags.numStripes(numFlags, forbidden));
  }

  @Test
  public void case27() {
    String numFlags = "32899482551498535";
    String[] forbidden = { "0 1", "0 1 2", "1 2 3", "2 3 4", "3 4 5", "4 5 6", "5 6 7", "6 7 8", "7 8 9", "8 9" };
    assertEquals(20L, flags.numStripes(numFlags, forbidden));
  }

  @Test
  public void case28() {
    String numFlags = "10000000000000000";
    String[] forbidden = { "0 2 3", "1 2 3", "0 1 2", "0 1 3" };
    assertEquals(2500000000000000L, flags.numStripes(numFlags, forbidden));
  }

}
