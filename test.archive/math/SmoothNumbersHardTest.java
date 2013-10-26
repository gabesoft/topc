package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class SmoothNumbersHardTest {
  SmoothNumbersHard smoothnumbershard = new SmoothNumbersHard();

  @Test
  public void case1() {
    int N = 10;
    int k = 3;
    assertEquals(7, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case2() {
    int N = 10;
    int k = 4;
    assertEquals(7, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case3() {
    int N = 15;
    int k = 3;
    assertEquals(8, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case4() {
    int N = 5;
    int k = 20;
    assertEquals(5, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case5() {
    int N = 5000000;
    int k = 1000;
    assertEquals(1196525, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case6() {
    int N = 1;
    int k = 1;
    assertEquals(1, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case7() {
    int N = 1;
    int k = 100;
    assertEquals(1, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case8() {
    int N = 100000;
    int k = 1;
    assertEquals(1, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case9() {
    int N = 2;
    int k = 2;
    assertEquals(2, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case10() {
    int N = 99999;
    int k = 100;
    assertEquals(17441, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case11() {
    int N = 99999;
    int k = 96;
    assertEquals(16760, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case12() {
    int N = 99999;
    int k = 97;
    assertEquals(17441, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case13() {
    int N = 96;
    int k = 97;
    assertEquals(96, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case14() {
    int N = 96;
    int k = 96;
    assertEquals(96, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case15() {
    int N = 121;
    int k = 11;
    assertEquals(61, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case16() {
    int N = 168;
    int k = 13;
    assertEquals(87, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case17() {
    int N = 50;
    int k = 7;
    assertEquals(31, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case18() {
    int N = 50000;
    int k = 10;
    assertEquals(566, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case19() {
    int N = 65536;
    int k = 2;
    assertEquals(17, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case20() {
    int N = 4999990;
    int k = 1000;
    assertEquals(1196523, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case21() {
    int N = 5000000;
    int k = 996;
    assertEquals(1192345, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case22() {
    int N = 5000000;
    int k = 997;
    assertEquals(1196525, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case23() {
    int N = 5000000;
    int k = 5;
    assertEquals(682, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case24() {
    int N = 950;
    int k = 1000;
    assertEquals(950, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case25() {
    int N = 123456;
    int k = 123;
    assertEquals(23855, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case26() {
    int N = 5000;
    int k = 1;
    assertEquals(1, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case27() {
    int N = 5000000;
    int k = 731;
    assertEquals(1015104, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case28() {
    int N = 4989898;
    int k = 1000;
    assertEquals(1194680, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case29() {
    int N = 5000000;
    int k = 500;
    assertEquals(816749, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case30() {
    int N = 4999999;
    int k = 600;
    assertEquals(903642, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case31() {
    int N = 5000000;
    int k = 343;
    assertEquals(618234, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case32() {
    int N = 5000000;
    int k = 998;
    assertEquals(1196525, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case33() {
    int N = 5000000;
    int k = 123;
    assertEquals(241786, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case34() {
    int N = 5000000;
    int k = 999;
    assertEquals(1196525, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case35() {
    int N = 5000000;
    int k = 1;
    assertEquals(1, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case36() {
    int N = 5000000;
    int k = 527;
    assertEquals(842818, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case37() {
    int N = 4987654;
    int k = 987;
    assertEquals(1185903, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case38() {
    int N = 4000000;
    int k = 33;
    assertEquals(33073, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case39() {
    int N = 5000000;
    int k = 978;
    assertEquals(1183920, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case40() {
    int N = 5000000;
    int k = 717;
    assertEquals(1004649, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case41() {
    int N = 4999678;
    int k = 675;
    assertEquals(977640, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case42() {
    int N = 4888887;
    int k = 459;
    assertEquals(756789, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case43() {
    int N = 4123654;
    int k = 123;
    assertEquals(215681, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case44() {
    int N = 4956349;
    int k = 997;
    assertEquals(1188530, smoothnumbershard.countSmoothNumbers(N, k));
  }

  @Test
  public void case45() {
    int N = 5000000;
    int k = 991;
    assertEquals(1192345, smoothnumbershard.countSmoothNumbers(N, k));
  }

}
