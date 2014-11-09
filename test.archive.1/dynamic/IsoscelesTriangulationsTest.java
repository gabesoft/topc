package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class IsoscelesTriangulationsTest {
  IsoscelesTriangulations isoscelestriangulations = new IsoscelesTriangulations();

  @Test
  public void case1() {
    int n = 4;
    int k = 2;
    assertEquals(2, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case2() {
    int n = 3;
    int k = 0;
    assertEquals(0, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case3() {
    int n = 5;
    int k = 3;
    assertEquals(5, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case4() {
    int n = 6;
    int k = 2;
    assertEquals(12, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case5() {
    int n = 10;
    int k = 8;
    assertEquals(10, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case6() {
    int n = 3;
    int k = 1;
    assertEquals(1, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case7() {
    int n = 4;
    int k = 0;
    assertEquals(0, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case8() {
    int n = 4;
    int k = 1;
    assertEquals(0, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case9() {
    int n = 5;
    int k = 0;
    assertEquals(0, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case10() {
    int n = 5;
    int k = 1;
    assertEquals(0, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case11() {
    int n = 5;
    int k = 2;
    assertEquals(0, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case12() {
    int n = 6;
    int k = 4;
    assertEquals(2, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case13() {
    int n = 7;
    int k = 3;
    assertEquals(28, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case14() {
    int n = 7;
    int k = 4;
    assertEquals(14, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case15() {
    int n = 8;
    int k = 6;
    assertEquals(4, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case16() {
    int n = 8;
    int k = 4;
    assertEquals(64, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case17() {
    int n = 8;
    int k = 2;
    assertEquals(64, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case18() {
    int n = 9;
    int k = 7;
    assertEquals(9, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case19() {
    int n = 9;
    int k = 5;
    assertEquals(108, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case20() {
    int n = 9;
    int k = 4;
    assertEquals(24, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case21() {
    int n = 9;
    int k = 3;
    assertEquals(288, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case22() {
    int n = 10;
    int k = 6;
    assertEquals(140, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case23() {
    int n = 10;
    int k = 5;
    assertEquals(80, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case24() {
    int n = 10;
    int k = 4;
    assertEquals(560, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case25() {
    int n = 10;
    int k = 3;
    assertEquals(320, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case26() {
    int n = 10;
    int k = 2;
    assertEquals(320, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case27() {
    int n = 36;
    int k = 31;
    assertEquals(14496, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case28() {
    int n = 14;
    int k = 4;
    assertEquals(60928, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case29() {
    int n = 34;
    int k = 4;
    assertEquals(21406679, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case30() {
    int n = 47;
    int k = 11;
    assertEquals(105275978, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case31() {
    int n = 23;
    int k = 5;
    assertEquals(106887772, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case32() {
    int n = 26;
    int k = 8;
    assertEquals(83920238, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case33() {
    int n = 16;
    int k = 4;
    assertEquals(638976, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case34() {
    int n = 37;
    int k = 9;
    assertEquals(1198520, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case35() {
    int n = 25;
    int k = 7;
    assertEquals(65975697, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case36() {
    int n = 12;
    int k = 7;
    assertEquals(480, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case37() {
    int n = 37;
    int k = 26;
    assertEquals(65855403, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case38() {
    int n = 29;
    int k = 9;
    assertEquals(74024031, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case39() {
    int n = 19;
    int k = 3;
    assertEquals(1867776, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case40() {
    int n = 22;
    int k = 17;
    assertEquals(3696, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case41() {
    int n = 27;
    int k = 22;
    assertEquals(2232, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case42() {
    int n = 13;
    int k = 2;
    assertEquals(0, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case43() {
    int n = 31;
    int k = 1;
    assertEquals(0, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case44() {
    int n = 12;
    int k = 9;
    assertEquals(0, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case45() {
    int n = 35;
    int k = 33;
    assertEquals(0, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case46() {
    int n = 35;
    int k = 0;
    assertEquals(0, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case47() {
    int n = 50;
    int k = 9;
    assertEquals(58394758, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case48() {
    int n = 50;
    int k = 47;
    assertEquals(100, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case49() {
    int n = 50;
    int k = 21;
    assertEquals(31719829, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case50() {
    int n = 50;
    int k = 39;
    assertEquals(92087776, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case51() {
    int n = 50;
    int k = 36;
    assertEquals(15420199, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case52() {
    int n = 50;
    int k = 48;
    assertEquals(0, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case53() {
    int n = 50;
    int k = 46;
    assertEquals(1000, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case54() {
    int n = 50;
    int k = 45;
    assertEquals(16000, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case55() {
    int n = 50;
    int k = 0;
    assertEquals(0, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case56() {
    int n = 50;
    int k = 1;
    assertEquals(0, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case57() {
    int n = 50;
    int k = 2;
    assertEquals(101931970, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case58() {
    int n = 50;
    int k = 3;
    assertEquals(114751022, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case59() {
    int n = 50;
    int k = 44;
    assertEquals(226000, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case60() {
    int n = 50;
    int k = 4;
    assertEquals(11410498, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case61() {
    int n = 50;
    int k = 10;
    assertEquals(112698825, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case62() {
    int n = 50;
    int k = 7;
    assertEquals(20336526, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case63() {
    int n = 49;
    int k = 23;
    assertEquals(62241972, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case64() {
    int n = 50;
    int k = 20;
    assertEquals(28775584, isoscelestriangulations.getCount(n, k));
  }

  @Test
  public void case65() {
    int n = 50;
    int k = 25;
    assertEquals(107780782, isoscelestriangulations.getCount(n, k));
  }

}
