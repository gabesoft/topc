package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class PolygonTraversal2Test {
  PolygonTraversal2 polygontraversal2 = new PolygonTraversal2();

  @Test
  public void case1() {
    int N = 5;
    int[] points = { 1, 3, 5 };
    assertEquals(1, polygontraversal2.count(N, points));
  }

  @Test
  public void case2() {
    int N = 7;
    int[] points = { 2, 4, 7 };
    assertEquals(2, polygontraversal2.count(N, points));
  }

  @Test
  public void case3() {
    int N = 7;
    int[] points = { 1, 2, 3, 4, 6, 5 };
    assertEquals(0, polygontraversal2.count(N, points));
  }

  @Test
  public void case4() {
    int N = 11;
    int[] points = { 1, 5, 10 };
    assertEquals(1412, polygontraversal2.count(N, points));
  }

  @Test
  public void case5() {
    int N = 4;
    int[] points = { 1, 3 };
    assertEquals(0, polygontraversal2.count(N, points));
  }

  @Test
  public void case6() {
    int N = 4;
    int[] points = { 1, 2, 3 };
    assertEquals(0, polygontraversal2.count(N, points));
  }

  @Test
  public void case7() {
    int N = 4;
    int[] points = { 1, 2, 4 };
    assertEquals(0, polygontraversal2.count(N, points));
  }

  @Test
  public void case8() {
    int N = 5;
    int[] points = { 1, 4 };
    assertEquals(0, polygontraversal2.count(N, points));
  }

  @Test
  public void case9() {
    int N = 5;
    int[] points = { 1, 5, 3, 2 };
    assertEquals(1, polygontraversal2.count(N, points));
  }

  @Test
  public void case10() {
    int N = 5;
    int[] points = { 5, 2, 1 };
    assertEquals(0, polygontraversal2.count(N, points));
  }

  @Test
  public void case11() {
    int N = 5;
    int[] points = { 4, 1, 5, 2 };
    assertEquals(0, polygontraversal2.count(N, points));
  }

  @Test
  public void case12() {
    int N = 6;
    int[] points = { 2, 4, 6 };
    assertEquals(1, polygontraversal2.count(N, points));
  }

  @Test
  public void case13() {
    int N = 6;
    int[] points = { 6, 5, 2 };
    assertEquals(0, polygontraversal2.count(N, points));
  }

  @Test
  public void case14() {
    int N = 6;
    int[] points = { 6, 3, 1 };
    assertEquals(1, polygontraversal2.count(N, points));
  }

  @Test
  public void case15() {
    int N = 6;
    int[] points = { 3, 4, 2, 6, 5 };
    assertEquals(1, polygontraversal2.count(N, points));
  }

  @Test
  public void case16() {
    int N = 7;
    int[] points = { 7, 1, 5, 3 };
    assertEquals(2, polygontraversal2.count(N, points));
  }

  @Test
  public void case17() {
    int N = 7;
    int[] points = { 2, 5, 1 };
    assertEquals(4, polygontraversal2.count(N, points));
  }

  @Test
  public void case18() {
    int N = 7;
    int[] points = { 1, 2, 6, 7, 3 };
    assertEquals(0, polygontraversal2.count(N, points));
  }

  @Test
  public void case19() {
    int N = 7;
    int[] points = { 1, 2, 4, 7, 6 };
    assertEquals(1, polygontraversal2.count(N, points));
  }

  @Test
  public void case20() {
    int N = 8;
    int[] points = { 3, 5, 7, 1 };
    assertEquals(6, polygontraversal2.count(N, points));
  }

  @Test
  public void case21() {
    int N = 8;
    int[] points = { 1, 2, 4, 8 };
    assertEquals(0, polygontraversal2.count(N, points));
  }

  @Test
  public void case22() {
    int N = 8;
    int[] points = { 2, 4, 1, 7 };
    assertEquals(2, polygontraversal2.count(N, points));
  }

  @Test
  public void case23() {
    int N = 8;
    int[] points = { 1, 7, 3 };
    assertEquals(2, polygontraversal2.count(N, points));
  }

  @Test
  public void case24() {
    int N = 8;
    int[] points = { 2, 5, 8, 1, 7, 3 };
    assertEquals(1, polygontraversal2.count(N, points));
  }

  @Test
  public void case25() {
    int N = 9;
    int[] points = { 1, 4, 7 };
    assertEquals(56, polygontraversal2.count(N, points));
  }

  @Test
  public void case26() {
    int N = 9;
    int[] points = { 4, 7, 2 };
    assertEquals(38, polygontraversal2.count(N, points));
  }

  @Test
  public void case27() {
    int N = 9;
    int[] points = { 1, 5, 9, 2, 6 };
    assertEquals(4, polygontraversal2.count(N, points));
  }

  @Test
  public void case28() {
    int N = 10;
    int[] points = { 1, 9, 4 };
    assertEquals(52, polygontraversal2.count(N, points));
  }

  @Test
  public void case29() {
    int N = 10;
    int[] points = { 1, 5, 8 };
    assertEquals(400, polygontraversal2.count(N, points));
  }

  @Test
  public void case30() {
    int N = 10;
    int[] points = { 1, 5, 8, 10 };
    assertEquals(116, polygontraversal2.count(N, points));
  }

  @Test
  public void case31() {
    int N = 11;
    int[] points = { 5, 6, 8, 1 };
    assertEquals(86, polygontraversal2.count(N, points));
  }

  @Test
  public void case32() {
    int N = 11;
    int[] points = { 1, 3, 11, 6 };
    assertEquals(56, polygontraversal2.count(N, points));
  }

  @Test
  public void case33() {
    int N = 11;
    int[] points = { 10, 3, 7, 1, 11 };
    assertEquals(146, polygontraversal2.count(N, points));
  }

  @Test
  public void case34() {
    int N = 11;
    int[] points = { 11, 10, 2, 3, 7, 1 };
    assertEquals(20, polygontraversal2.count(N, points));
  }

  @Test
  public void case35() {
    int N = 12;
    int[] points = { 6, 11, 12 };
    assertEquals(6100, polygontraversal2.count(N, points));
  }

  @Test
  public void case36() {
    int N = 12;
    int[] points = { 6, 11, 12, 1 };
    assertEquals(1140, polygontraversal2.count(N, points));
  }

  @Test
  public void case37() {
    int N = 12;
    int[] points = { 6, 11, 12, 1, 3 };
    assertEquals(326, polygontraversal2.count(N, points));
  }

  @Test
  public void case38() {
    int N = 12;
    int[] points = { 5, 7, 1, 9, 10 };
    assertEquals(796, polygontraversal2.count(N, points));
  }

  @Test
  public void case39() {
    int N = 12;
    int[] points = { 10, 11, 12, 3, 8, 1, 5, 2 };
    assertEquals(10, polygontraversal2.count(N, points));
  }

  @Test
  public void case40() {
    int N = 13;
    int[] points = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 12 };
    assertEquals(0, polygontraversal2.count(N, points));
  }

  @Test
  public void case41() {
    int N = 13;
    int[] points = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 10, 13 };
    assertEquals(1, polygontraversal2.count(N, points));
  }

  @Test
  public void case42() {
    int N = 13;
    int[] points = { 1, 2, 13, 4, 5, 11, 7, 8, 9, 12 };
    assertEquals(6, polygontraversal2.count(N, points));
  }

  @Test
  public void case43() {
    int N = 13;
    int[] points = { 6, 2, 12 };
    assertEquals(70168, polygontraversal2.count(N, points));
  }

  @Test
  public void case44() {
    int N = 13;
    int[] points = { 4, 1 };
    assertEquals(0, polygontraversal2.count(N, points));
  }

  @Test
  public void case45() {
    int N = 13;
    int[] points = { 13, 1 };
    assertEquals(0, polygontraversal2.count(N, points));
  }

  @Test
  public void case46() {
    int N = 13;
    int[] points = { 13, 1, 5 };
    assertEquals(0, polygontraversal2.count(N, points));
  }

  @Test
  public void case47() {
    int N = 13;
    int[] points = { 8, 6, 1, 5, 13 };
    assertEquals(1576, polygontraversal2.count(N, points));
  }

  @Test
  public void case48() {
    int N = 13;
    int[] points = { 1, 7, 11 };
    assertEquals(154108, polygontraversal2.count(N, points));
  }

  @Test
  public void case49() {
    int N = 13;
    int[] points = { 1, 6, 11 };
    assertEquals(133032, polygontraversal2.count(N, points));
  }

  @Test
  public void case50() {
    int N = 13;
    int[] points = { 7, 3, 12 };
    assertEquals(101044, polygontraversal2.count(N, points));
  }

  @Test
  public void case51() {
    int N = 6;
    int[] points = { 1, 4, 2 };
    assertEquals(1, polygontraversal2.count(N, points));
  }

  @Test
  public void case52() {
    int N = 11;
    int[] points = { 1, 5, 10 };
    assertEquals(1412, polygontraversal2.count(N, points));
  }

  @Test
  public void case53() {
    int N = 13;
    int[] points = { 7, 8, 9, 1, 2, 3, 4, 5, 10, 11, 12, 6 };
    assertEquals(1, polygontraversal2.count(N, points));
  }

  @Test
  public void case54() {
    int N = 11;
    int[] points = { 1, 3 };
    assertEquals(0, polygontraversal2.count(N, points));
  }

  @Test
  public void case55() {
    int N = 13;
    int[] points = { 12, 3, 4, 5, 6, 7, 8 };
    assertEquals(34, polygontraversal2.count(N, points));
  }

  @Test
  public void case56() {
    int N = 13;
    int[] points = { 1, 5, 10 };
    assertEquals(103784, polygontraversal2.count(N, points));
  }

  @Test
  public void case57() {
    int N = 13;
    int[] points = { 3, 7, 10 };
    assertEquals(70168, polygontraversal2.count(N, points));
  }

  @Test
  public void case58() {
    int N = 5;
    int[] points = { 2, 4 };
    assertEquals(0, polygontraversal2.count(N, points));
  }

}
