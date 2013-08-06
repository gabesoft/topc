package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class HourGlassTest {
  HourGlass hourglass = new HourGlass();

  @Test
  public void case1() {
    int glass1 = 5;
    int glass2 = 7;
    assertArrayEquals(new int[] { 5, 7, 9, 10, 11, 12, 13, 14, 15, 16 }, hourglass.measurable(glass1, glass2));
  }

  @Test
  public void case2() {
    int glass1 = 13;
    int glass2 = 5;
    assertArrayEquals(new int[] { 5, 10, 13, 15, 16, 17, 18, 19, 20, 21 }, hourglass.measurable(glass1, glass2));
  }

  @Test
  public void case3() {
    int glass1 = 23;
    int glass2 = 23;
    assertArrayEquals(new int[] { 23, 46, 69, 92, 115, 138, 161, 184, 207, 230 }, hourglass.measurable(glass1, glass2));
  }

  @Test
  public void case4() {
    int glass1 = 24;
    int glass2 = 30;
    assertArrayEquals(new int[] { 24, 30, 36, 42, 48, 54, 60, 66, 72, 78 }, hourglass.measurable(glass1, glass2));
  }

  @Test
  public void case5() {
    int glass1 = 1;
    int glass2 = 50;
    assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, hourglass.measurable(glass1, glass2));
  }

  @Test
  public void case6() {
    int glass1 = 19;
    int glass2 = 6;
    assertArrayEquals(new int[] { 6, 12, 18, 19, 20, 21, 22, 23, 24, 25 }, hourglass.measurable(glass1, glass2));
  }

  @Test
  public void case7() {
    int glass1 = 27;
    int glass2 = 21;
    assertArrayEquals(new int[] { 21, 27, 33, 39, 42, 45, 48, 51, 54, 57 }, hourglass.measurable(glass1, glass2));
  }

  @Test
  public void case8() {
    int glass1 = 50;
    int glass2 = 50;
    assertArrayEquals(new int[] { 50, 100, 150, 200, 250, 300, 350, 400, 450, 500 }, hourglass.measurable(glass1, glass2));
  }

  @Test
  public void case9() {
    int glass1 = 1;
    int glass2 = 1;
    assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, hourglass.measurable(glass1, glass2));
  }

  @Test
  public void case10() {
    int glass1 = 45;
    int glass2 = 20;
    assertArrayEquals(new int[] { 20, 40, 45, 50, 55, 60, 65, 70, 75, 80 }, hourglass.measurable(glass1, glass2));
  }

  @Test
  public void case11() {
    int glass1 = 19;
    int glass2 = 8;
    assertArrayEquals(new int[] { 8, 16, 19, 22, 24, 25, 27, 28, 29, 30 }, hourglass.measurable(glass1, glass2));
  }

  @Test
  public void case12() {
    int glass1 = 50;
    int glass2 = 48;
    assertArrayEquals(new int[] { 48, 50, 52, 54, 56, 58, 60, 62, 64, 66 }, hourglass.measurable(glass1, glass2));
  }

  @Test
  public void case13() {
    int glass1 = 47;
    int glass2 = 13;
    assertArrayEquals(new int[] { 13, 26, 39, 47, 52, 55, 57, 60, 62, 63 }, hourglass.measurable(glass1, glass2));
  }

  @Test
  public void case14() {
    int glass1 = 19;
    int glass2 = 24;
    assertArrayEquals(new int[] { 19, 24, 29, 34, 38, 39, 43, 44, 48, 49 }, hourglass.measurable(glass1, glass2));
  }

  @Test
  public void case15() {
    int glass1 = 20;
    int glass2 = 23;
    assertArrayEquals(new int[] { 20, 23, 26, 29, 32, 35, 38, 40, 41, 43 }, hourglass.measurable(glass1, glass2));
  }

  @Test
  public void case16() {
    int glass1 = 8;
    int glass2 = 11;
    assertArrayEquals(new int[] { 8, 11, 14, 16, 17, 19, 20, 21, 22, 23 }, hourglass.measurable(glass1, glass2));
  }

  @Test
  public void case17() {
    int glass1 = 2;
    int glass2 = 5;
    assertArrayEquals(new int[] { 2, 4, 5, 6, 7, 8, 9, 10, 11, 12 }, hourglass.measurable(glass1, glass2));
  }

  @Test
  public void case18() {
    int glass1 = 2;
    int glass2 = 3;
    assertArrayEquals(new int[] { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 }, hourglass.measurable(glass1, glass2));
  }

  @Test
  public void case19() {
    int glass1 = 50;
    int glass2 = 17;
    assertArrayEquals(new int[] { 17, 34, 50, 51, 52, 53, 54, 55, 56, 57 }, hourglass.measurable(glass1, glass2));
  }

  @Test
  public void case20() {
    int glass1 = 10;
    int glass2 = 48;
    assertArrayEquals(new int[] { 10, 20, 30, 40, 48, 50, 52, 54, 56, 58 }, hourglass.measurable(glass1, glass2));
  }

  @Test
  public void case21() {
    int glass1 = 14;
    int glass2 = 18;
    assertArrayEquals(new int[] { 14, 18, 22, 26, 28, 30, 32, 34, 36, 38 }, hourglass.measurable(glass1, glass2));
  }

  @Test
  public void case22() {
    int glass1 = 46;
    int glass2 = 46;
    assertArrayEquals(new int[] { 46, 92, 138, 184, 230, 276, 322, 368, 414, 460 }, hourglass.measurable(glass1, glass2));
  }

  @Test
  public void case23() {
    int glass1 = 10;
    int glass2 = 14;
    assertArrayEquals(new int[] { 10, 14, 18, 20, 22, 24, 26, 28, 30, 32 }, hourglass.measurable(glass1, glass2));
  }

  @Test
  public void case24() {
    int glass1 = 19;
    int glass2 = 23;
    assertArrayEquals(new int[] { 19, 23, 27, 31, 35, 38, 39, 42, 43, 46 }, hourglass.measurable(glass1, glass2));
  }

  @Test
  public void case25() {
    int glass1 = 29;
    int glass2 = 20;
    assertArrayEquals(new int[] { 20, 29, 38, 40, 47, 49, 51, 56, 58, 60 }, hourglass.measurable(glass1, glass2));
  }

  @Test
  public void case26() {
    int glass1 = 27;
    int glass2 = 18;
    assertArrayEquals(new int[] { 18, 27, 36, 45, 54, 63, 72, 81, 90, 99 }, hourglass.measurable(glass1, glass2));
  }

  @Test
  public void case27() {
    int glass1 = 50;
    int glass2 = 41;
    assertArrayEquals(new int[] { 41, 50, 59, 68, 77, 82, 86, 91, 95, 100 }, hourglass.measurable(glass1, glass2));
  }

  @Test
  public void case28() {
    int glass1 = 48;
    int glass2 = 41;
    assertArrayEquals(new int[] { 41, 48, 55, 62, 69, 76, 82, 83, 89, 90 }, hourglass.measurable(glass1, glass2));
  }

  @Test
  public void case29() {
    int glass1 = 1;
    int glass2 = 2;
    assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, hourglass.measurable(glass1, glass2));
  }

  @Test
  public void case30() {
    int glass1 = 49;
    int glass2 = 50;
    assertArrayEquals(new int[] { 49, 50, 51, 52, 53, 54, 55, 56, 57, 58 }, hourglass.measurable(glass1, glass2));
  }

  @Test
  public void case31() {
    int glass1 = 7;
    int glass2 = 12;
    assertArrayEquals(new int[] { 7, 12, 14, 16, 17, 18, 19, 20, 21, 22 }, hourglass.measurable(glass1, glass2));
  }

  @Test
  public void case32() {
    int glass1 = 50;
    int glass2 = 17;
    assertArrayEquals(new int[] { 17, 34, 50, 51, 52, 53, 54, 55, 56, 57 }, hourglass.measurable(glass1, glass2));
  }

  @Test
  public void case33() {
    int glass1 = 13;
    int glass2 = 5;
    assertArrayEquals(new int[] { 5, 10, 13, 15, 16, 17, 18, 19, 20, 21 }, hourglass.measurable(glass1, glass2));
  }

  @Test
  public void case34() {
    int glass1 = 5;
    int glass2 = 7;
    assertArrayEquals(new int[] { 5, 7, 9, 10, 11, 12, 13, 14, 15, 16 }, hourglass.measurable(glass1, glass2));
  }

  @Test
  public void case35() {
    int glass1 = 5;
    int glass2 = 13;
    assertArrayEquals(new int[] { 5, 10, 13, 15, 16, 17, 18, 19, 20, 21 }, hourglass.measurable(glass1, glass2));
  }

}
