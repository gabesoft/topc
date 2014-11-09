package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class HexagonalSumsTest {
  HexagonalSums hexagonalsums = new HexagonalSums();

  @Test
  public void case1() {
    int N = 26;
    assertEquals(6, hexagonalsums.minLength(N));
  }

  @Test
  public void case2() {
    int N = 130;
    assertEquals(5, hexagonalsums.minLength(N));
  }

  @Test
  public void case3() {
    int N = 146858;
    assertEquals(4, hexagonalsums.minLength(N));
  }

  @Test
  public void case4() {
    int N = 999999;
    assertEquals(3, hexagonalsums.minLength(N));
  }

  @Test
  public void case5() {
    int N = 1000000;
    assertEquals(2, hexagonalsums.minLength(N));
  }

  @Test
  public void case6() {
    int N = 145530;
    assertEquals(1, hexagonalsums.minLength(N));
  }

  @Test
  public void case7() {
    int N = 6;
    assertEquals(1, hexagonalsums.minLength(N));
  }

  @Test
  public void case8() {
    int N = 7;
    assertEquals(2, hexagonalsums.minLength(N));
  }

  @Test
  public void case9() {
    int N = 8;
    assertEquals(3, hexagonalsums.minLength(N));
  }

  @Test
  public void case10() {
    int N = 9;
    assertEquals(4, hexagonalsums.minLength(N));
  }

  @Test
  public void case11() {
    int N = 10;
    assertEquals(5, hexagonalsums.minLength(N));
  }

  @Test
  public void case12() {
    int N = 11;
    assertEquals(6, hexagonalsums.minLength(N));
  }

  @Test
  public void case13() {
    int N = 12;
    assertEquals(2, hexagonalsums.minLength(N));
  }

  @Test
  public void case14() {
    int N = 13;
    assertEquals(3, hexagonalsums.minLength(N));
  }

  @Test
  public void case15() {
    int N = 14;
    assertEquals(4, hexagonalsums.minLength(N));
  }

  @Test
  public void case16() {
    int N = 15;
    assertEquals(1, hexagonalsums.minLength(N));
  }

  @Test
  public void case17() {
    int N = 16;
    assertEquals(2, hexagonalsums.minLength(N));
  }

  @Test
  public void case18() {
    int N = 146859;
    assertEquals(2, hexagonalsums.minLength(N));
  }

  @Test
  public void case19() {
    int N = 20;
    assertEquals(5, hexagonalsums.minLength(N));
  }

  @Test
  public void case20() {
    int N = 25;
    assertEquals(5, hexagonalsums.minLength(N));
  }

  @Test
  public void case21() {
    int N = 38;
    assertEquals(5, hexagonalsums.minLength(N));
  }

  @Test
  public void case22() {
    int N = 39;
    assertEquals(5, hexagonalsums.minLength(N));
  }

  @Test
  public void case23() {
    int N = 54;
    assertEquals(5, hexagonalsums.minLength(N));
  }

  @Test
  public void case24() {
    int N = 65;
    assertEquals(5, hexagonalsums.minLength(N));
  }

  @Test
  public void case25() {
    int N = 70;
    assertEquals(5, hexagonalsums.minLength(N));
  }

  @Test
  public void case26() {
    int N = 114;
    assertEquals(5, hexagonalsums.minLength(N));
  }

  @Test
  public void case27() {
    int N = 1;
    assertEquals(1, hexagonalsums.minLength(N));
  }

  @Test
  public void case28() {
    int N = 999998;
    assertEquals(3, hexagonalsums.minLength(N));
  }

  @Test
  public void case29() {
    int N = 999997;
    assertEquals(3, hexagonalsums.minLength(N));
  }

  @Test
  public void case30() {
    int N = 999996;
    assertEquals(3, hexagonalsums.minLength(N));
  }

  @Test
  public void case31() {
    int N = 999995;
    assertEquals(3, hexagonalsums.minLength(N));
  }

  @Test
  public void case32() {
    int N = 123456;
    assertEquals(2, hexagonalsums.minLength(N));
  }

  @Test
  public void case33() {
    int N = 1326;
    assertEquals(1, hexagonalsums.minLength(N));
  }

  @Test
  public void case34() {
    int N = 2;
    assertEquals(2, hexagonalsums.minLength(N));
  }

  @Test
  public void case35() {
    int N = 3;
    assertEquals(3, hexagonalsums.minLength(N));
  }

  @Test
  public void case36() {
    int N = 4;
    assertEquals(4, hexagonalsums.minLength(N));
  }

  @Test
  public void case37() {
    int N = 5;
    assertEquals(5, hexagonalsums.minLength(N));
  }

  @Test
  public void case38() {
    int N = 666;
    assertEquals(2, hexagonalsums.minLength(N));
  }

  @Test
  public void case39() {
    int N = 19900;
    assertEquals(1, hexagonalsums.minLength(N));
  }

  @Test
  public void case40() {
    int N = 79800;
    assertEquals(1, hexagonalsums.minLength(N));
  }

  @Test
  public void case41() {
    int N = 719400;
    assertEquals(1, hexagonalsums.minLength(N));
  }

  @Test
  public void case42() {
    int N = 998992;
    assertEquals(2, hexagonalsums.minLength(N));
  }

  @Test
  public void case43() {
    int N = 1000000;
    assertEquals(2, hexagonalsums.minLength(N));
  }

  @Test
  public void case44() {
    int N = 45637;
    assertEquals(3, hexagonalsums.minLength(N));
  }

  @Test
  public void case45() {
    int N = 999998;
    assertEquals(3, hexagonalsums.minLength(N));
  }

  @Test
  public void case46() {
    int N = 26;
    assertEquals(6, hexagonalsums.minLength(N));
  }

  @Test
  public void case47() {
    int N = 999999;
    assertEquals(3, hexagonalsums.minLength(N));
  }

  @Test
  public void case48() {
    int N = 1111;
    assertEquals(3, hexagonalsums.minLength(N));
  }

  @Test
  public void case49() {
    int N = 190;
    assertEquals(1, hexagonalsums.minLength(N));
  }

  @Test
  public void case50() {
    int N = 18;
    assertEquals(3, hexagonalsums.minLength(N));
  }

  @Test
  public void case51() {
    int N = 997560;
    assertEquals(2, hexagonalsums.minLength(N));
  }

  @Test
  public void case52() {
    int N = 2;
    assertEquals(2, hexagonalsums.minLength(N));
  }

  @Test
  public void case53() {
    int N = 1;
    assertEquals(1, hexagonalsums.minLength(N));
  }

}
