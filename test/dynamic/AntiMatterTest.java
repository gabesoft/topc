package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class AntiMatterTest {
  AntiMatter antimatter = new AntiMatter();

  @Test
  public void case1() {
    int[] xform = { 6, 6, 6, 6 };
    assertEquals(".00010000", antimatter.unstable(xform));
  }

  @Test
  public void case2() {
    int[] xform = { 0, 0, 0, 0 };
    assertEquals(".00010000", antimatter.unstable(xform));
  }

  @Test
  public void case3() {
    int[] xform = { 2, -3, 4, -5 };
    assertEquals("1.00000000", antimatter.unstable(xform));
  }

  @Test
  public void case4() {
    int[] xform = { 9993, -7, 743, -7 };
    assertEquals(".00400000", antimatter.unstable(xform));
  }

  @Test
  public void case5() {
    int[] xform = { -10000, 9997, 9999, 10000 };
    assertEquals("1.00000000", antimatter.unstable(xform));
  }

  @Test
  public void case6() {
    int[] xform = { -10000, 1, 1, 10000 };
    assertEquals("1.00000000", antimatter.unstable(xform));
  }

  @Test
  public void case7() {
    int[] xform = { 1, -1, 1, -1 };
    assertEquals(".50000000", antimatter.unstable(xform));
  }

  @Test
  public void case8() {
    int[] xform = { 0, 1, -1, 1 };
    assertEquals("1.00000000", antimatter.unstable(xform));
  }

  @Test
  public void case9() {
    int[] xform = { 0, 0, 0, 792 };
    assertEquals(".00126448", antimatter.unstable(xform));
  }

  @Test
  public void case10() {
    int[] xform = { -10000, -10000, -10000, -9999 };
    assertEquals("1.00000000", antimatter.unstable(xform));
  }

  @Test
  public void case11() {
    int[] xform = { 7000, 8000, 9000, 10000 };
    assertEquals(".00100000", antimatter.unstable(xform));
  }

  @Test
  public void case12() {
    int[] xform = { 7000, 8004, 9000, 10000 };
    assertEquals(".25000000", antimatter.unstable(xform));
  }

  @Test
  public void case13() {
    int[] xform = { 7000, 8004, 7000, 7000 };
    assertEquals(".00099640", antimatter.unstable(xform));
  }

  @Test
  public void case14() {
    int[] xform = { 7000, 8004, 7000, 7006 };
    assertEquals(".50000000", antimatter.unstable(xform));
  }

  @Test
  public void case15() {
    int[] xform = { -7000, -8029, -7000, 7000 };
    assertEquals(".14285716", antimatter.unstable(xform));
  }

  @Test
  public void case16() {
    int[] xform = { -72, 60, 48, -480 };
    assertEquals(".08333336", antimatter.unstable(xform));
  }

  @Test
  public void case17() {
    int[] xform = { 0, 0, 0, 792 };
    assertEquals(".00126448", antimatter.unstable(xform));
  }

  @Test
  public void case18() {
    int[] xform = { -10000, 10000, 0, 3 };
    assertEquals("1.00000000", antimatter.unstable(xform));
  }

  @Test
  public void case19() {
    int[] xform = { 0, 12, 15, 19 };
    assertEquals("1.00000000", antimatter.unstable(xform));
  }

}
