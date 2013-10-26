package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class QuasiLatinSquaresTest {
  QuasiLatinSquares quasilatinsquares = new QuasiLatinSquares();

  @Test
  public void case1() {
    int n = 3;
    int d = 3;
    assertArrayEquals(new String[] { "0 1 2", "1 2 0", "2 0 1" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case2() {
    int n = 5;
    int d = 2;
    assertArrayEquals(new String[] { "0 0 0 0 1", "0 0 0 0 1", "0 0 0 0 1", "0 0 0 0 1", "1 1 1 1 0" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case3() {
    int n = 5;
    int d = 4;
    assertArrayEquals(new String[] { "0 0 1 2 3", "0 0 1 2 3", "1 1 0 3 2", "2 2 3 0 1", "3 3 2 1 0" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case4() {
    int n = 9;
    int d = 7;
    assertArrayEquals(new String[] { "0 0 0 1 2 3 4 5 6", "0 0 0 1 2 3 4 5 6", "0 0 0 1 2 3 4 5 6", "1 1 1 0 3 2 5 6 4", "2 2 2 3 0 1 6 4 5", "3 3 3 4 5 6 0 1 2", "4 4 4 2 6 5 1 0 3", "5 5 5 6 1 4 2 3 0", "6 6 6 5 4 0 3 2 1" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case5() {
    int n = 10;
    int d = 10;
    assertArrayEquals(new String[] { "0 1 2 3 4 5 6 7 8 9", "1 0 3 2 5 4 7 6 9 8", "2 3 0 1 6 7 8 9 4 5", "3 2 1 0 7 6 9 8 5 4", "4 5 6 7 8 9 0 1 2 3", "5 4 7 6 9 8 1 0 3 2", "6 7 8 9 2 3 4 5 0 1", "7 6 9 8 3 2 5 4 1 0", "8 9 4 5 0 1 2 3 6 7", "9 8 5 4 1 0 3 2 7 6" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case6() {
    int n = 1;
    int d = 1;
    assertArrayEquals(new String[] { "0" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case7() {
    int n = 2;
    int d = 1;
    assertArrayEquals(new String[] { "0 0", "0 0" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case8() {
    int n = 2;
    int d = 2;
    assertArrayEquals(new String[] { "0 1", "1 0" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case9() {
    int n = 4;
    int d = 3;
    assertArrayEquals(new String[] { "0 0 1 2", "0 0 1 2", "1 1 2 0", "2 2 0 1" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case10() {
    int n = 4;
    int d = 4;
    assertArrayEquals(new String[] { "0 1 2 3", "1 0 3 2", "2 3 0 1", "3 2 1 0" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case11() {
    int n = 5;
    int d = 3;
    assertArrayEquals(new String[] { "0 0 0 1 2", "0 0 0 1 2", "0 0 0 1 2", "1 1 1 2 0", "2 2 2 0 1" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case12() {
    int n = 5;
    int d = 5;
    assertArrayEquals(new String[] { 
        "0 1 2 3 4", 
        "1 0 3 4 2", 
        "2 3 4 0 1", 
        "3 4 1 2 0", 
        "4 2 0 1 3" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case13() {
    int n = 6;
    int d = 4;
    assertArrayEquals(new String[] { "0 0 0 1 2 3", "0 0 0 1 2 3", "0 0 0 1 2 3", "1 1 1 0 3 2", "2 2 2 3 0 1", "3 3 3 2 1 0" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case14() {
    int n = 6;
    int d = 6;
    assertArrayEquals(new String[] { "0 1 2 3 4 5", "1 0 3 2 5 4", "2 3 4 5 0 1", "3 2 5 4 1 0", "4 5 0 1 2 3", "5 4 1 0 3 2" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case15() {
    int n = 7;
    int d = 1;
    assertArrayEquals(new String[] { "0 0 0 0 0 0 0", "0 0 0 0 0 0 0", "0 0 0 0 0 0 0", "0 0 0 0 0 0 0", "0 0 0 0 0 0 0", "0 0 0 0 0 0 0", "0 0 0 0 0 0 0" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case16() {
    int n = 7;
    int d = 5;
    assertArrayEquals(new String[] { "0 0 0 1 2 3 4", "0 0 0 1 2 3 4", "0 0 0 1 2 3 4", "1 1 1 0 3 4 2", "2 2 2 3 4 0 1", "3 3 3 4 1 2 0", "4 4 4 2 0 1 3" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case17() {
    int n = 7;
    int d = 6;
    assertArrayEquals(new String[] { "0 0 1 2 3 4 5", "0 0 1 2 3 4 5", "1 1 0 3 2 5 4", "2 2 3 4 5 0 1", "3 3 2 5 4 1 0", "4 4 5 0 1 2 3", "5 5 4 1 0 3 2" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case18() {
    int n = 7;
    int d = 7;
    assertArrayEquals(new String[] { "0 1 2 3 4 5 6", "1 0 3 2 5 6 4", "2 3 0 1 6 4 5", "3 4 5 6 0 1 2", "4 2 6 5 1 0 3", "5 6 1 4 2 3 0", "6 5 4 0 3 2 1" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case19() {
    int n = 8;
    int d = 2;
    assertArrayEquals(new String[] { "0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 1", "1 1 1 1 1 1 1 0" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case20() {
    int n = 8;
    int d = 5;
    assertArrayEquals(new String[] { "0 0 0 0 1 2 3 4", "0 0 0 0 1 2 3 4", "0 0 0 0 1 2 3 4", "0 0 0 0 1 2 3 4", "1 1 1 1 0 3 4 2", "2 2 2 2 3 4 0 1", "3 3 3 3 4 1 2 0", "4 4 4 4 2 0 1 3" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case21() {
    int n = 8;
    int d = 6;
    assertArrayEquals(new String[] { "0 0 0 1 2 3 4 5", "0 0 0 1 2 3 4 5", "0 0 0 1 2 3 4 5", "1 1 1 0 3 2 5 4", "2 2 2 3 4 5 0 1", "3 3 3 2 5 4 1 0", "4 4 4 5 0 1 2 3", "5 5 5 4 1 0 3 2" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case22() {
    int n = 8;
    int d = 7;
    assertArrayEquals(new String[] { "0 0 1 2 3 4 5 6", "0 0 1 2 3 4 5 6", "1 1 0 3 2 5 6 4", "2 2 3 0 1 6 4 5", "3 3 4 5 6 0 1 2", "4 4 2 6 5 1 0 3", "5 5 6 1 4 2 3 0", "6 6 5 4 0 3 2 1" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case23() {
    int n = 8;
    int d = 8;
    assertArrayEquals(new String[] { "0 1 2 3 4 5 6 7", "1 0 3 2 5 4 7 6", "2 3 0 1 6 7 4 5", "3 2 1 0 7 6 5 4", "4 5 6 7 0 1 2 3", "5 4 7 6 1 0 3 2", "6 7 4 5 2 3 0 1", "7 6 5 4 3 2 1 0" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case24() {
    int n = 9;
    int d = 3;
    assertArrayEquals(new String[] { "0 0 0 0 0 0 0 1 2", "0 0 0 0 0 0 0 1 2", "0 0 0 0 0 0 0 1 2", "0 0 0 0 0 0 0 1 2", "0 0 0 0 0 0 0 1 2", "0 0 0 0 0 0 0 1 2", "0 0 0 0 0 0 0 1 2", "1 1 1 1 1 1 1 2 0", "2 2 2 2 2 2 2 0 1" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case25() {
    int n = 9;
    int d = 4;
    assertArrayEquals(new String[] { "0 0 0 0 0 0 1 2 3", "0 0 0 0 0 0 1 2 3", "0 0 0 0 0 0 1 2 3", "0 0 0 0 0 0 1 2 3", "0 0 0 0 0 0 1 2 3", "0 0 0 0 0 0 1 2 3", "1 1 1 1 1 1 0 3 2", "2 2 2 2 2 2 3 0 1", "3 3 3 3 3 3 2 1 0" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case26() {
    int n = 9;
    int d = 5;
    assertArrayEquals(new String[] { "0 0 0 0 0 1 2 3 4", "0 0 0 0 0 1 2 3 4", "0 0 0 0 0 1 2 3 4", "0 0 0 0 0 1 2 3 4", "0 0 0 0 0 1 2 3 4", "1 1 1 1 1 0 3 4 2", "2 2 2 2 2 3 4 0 1", "3 3 3 3 3 4 1 2 0", "4 4 4 4 4 2 0 1 3" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case27() {
    int n = 9;
    int d = 6;
    assertArrayEquals(new String[] { "0 0 0 0 1 2 3 4 5", "0 0 0 0 1 2 3 4 5", "0 0 0 0 1 2 3 4 5", "0 0 0 0 1 2 3 4 5", "1 1 1 1 0 3 2 5 4", "2 2 2 2 3 4 5 0 1", "3 3 3 3 2 5 4 1 0", "4 4 4 4 5 0 1 2 3", "5 5 5 5 4 1 0 3 2" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case28() {
    int n = 10;
    int d = 8;
    assertArrayEquals(new String[] { "0 0 0 1 2 3 4 5 6 7", "0 0 0 1 2 3 4 5 6 7", "0 0 0 1 2 3 4 5 6 7", "1 1 1 0 3 2 5 4 7 6", "2 2 2 3 0 1 6 7 4 5", "3 3 3 2 1 0 7 6 5 4", "4 4 4 5 6 7 0 1 2 3", "5 5 5 4 7 6 1 0 3 2", "6 6 6 7 4 5 2 3 0 1", "7 7 7 6 5 4 3 2 1 0" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case29() {
    int n = 9;
    int d = 8;
    assertArrayEquals(new String[] { "0 0 1 2 3 4 5 6 7", "0 0 1 2 3 4 5 6 7", "1 1 0 3 2 5 4 7 6", "2 2 3 0 1 6 7 4 5", "3 3 2 1 0 7 6 5 4", "4 4 5 6 7 0 1 2 3", "5 5 4 7 6 1 0 3 2", "6 6 7 4 5 2 3 0 1", "7 7 6 5 4 3 2 1 0" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case30() {
    int n = 9;
    int d = 9;
    assertArrayEquals(new String[] { "0 1 2 3 4 5 6 7 8", "1 0 3 2 5 4 7 8 6", "2 3 0 1 6 7 8 4 5", "3 2 1 0 7 8 5 6 4", "4 5 6 7 8 0 1 2 3", "5 4 7 8 0 6 2 3 1", "6 7 8 4 1 2 3 5 0", "7 8 5 6 3 1 4 0 2", "8 6 4 5 2 3 0 1 7" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case31() {
    int n = 10;
    int d = 1;
    assertArrayEquals(new String[] { "0 0 0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0 0 0" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case32() {
    int n = 10;
    int d = 2;
    assertArrayEquals(new String[] { "0 0 0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 0 0 1", "1 1 1 1 1 1 1 1 1 0" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case33() {
    int n = 10;
    int d = 3;
    assertArrayEquals(new String[] { "0 0 0 0 0 0 0 0 1 2", "0 0 0 0 0 0 0 0 1 2", "0 0 0 0 0 0 0 0 1 2", "0 0 0 0 0 0 0 0 1 2", "0 0 0 0 0 0 0 0 1 2", "0 0 0 0 0 0 0 0 1 2", "0 0 0 0 0 0 0 0 1 2", "0 0 0 0 0 0 0 0 1 2", "1 1 1 1 1 1 1 1 2 0", "2 2 2 2 2 2 2 2 0 1" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case34() {
    int n = 10;
    int d = 4;
    assertArrayEquals(new String[] { "0 0 0 0 0 0 0 1 2 3", "0 0 0 0 0 0 0 1 2 3", "0 0 0 0 0 0 0 1 2 3", "0 0 0 0 0 0 0 1 2 3", "0 0 0 0 0 0 0 1 2 3", "0 0 0 0 0 0 0 1 2 3", "0 0 0 0 0 0 0 1 2 3", "1 1 1 1 1 1 1 0 3 2", "2 2 2 2 2 2 2 3 0 1", "3 3 3 3 3 3 3 2 1 0" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case35() {
    int n = 10;
    int d = 5;
    assertArrayEquals(new String[] { "0 0 0 0 0 0 1 2 3 4", "0 0 0 0 0 0 1 2 3 4", "0 0 0 0 0 0 1 2 3 4", "0 0 0 0 0 0 1 2 3 4", "0 0 0 0 0 0 1 2 3 4", "0 0 0 0 0 0 1 2 3 4", "1 1 1 1 1 1 0 3 4 2", "2 2 2 2 2 2 3 4 0 1", "3 3 3 3 3 3 4 1 2 0", "4 4 4 4 4 4 2 0 1 3" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case36() {
    int n = 10;
    int d = 6;
    assertArrayEquals(new String[] { "0 0 0 0 0 1 2 3 4 5", "0 0 0 0 0 1 2 3 4 5", "0 0 0 0 0 1 2 3 4 5", "0 0 0 0 0 1 2 3 4 5", "0 0 0 0 0 1 2 3 4 5", "1 1 1 1 1 0 3 2 5 4", "2 2 2 2 2 3 4 5 0 1", "3 3 3 3 3 2 5 4 1 0", "4 4 4 4 4 5 0 1 2 3", "5 5 5 5 5 4 1 0 3 2" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case37() {
    int n = 10;
    int d = 7;
    assertArrayEquals(new String[] { "0 0 0 0 1 2 3 4 5 6", "0 0 0 0 1 2 3 4 5 6", "0 0 0 0 1 2 3 4 5 6", "0 0 0 0 1 2 3 4 5 6", "1 1 1 1 0 3 2 5 6 4", "2 2 2 2 3 0 1 6 4 5", "3 3 3 3 4 5 6 0 1 2", "4 4 4 4 2 6 5 1 0 3", "5 5 5 5 6 1 4 2 3 0", "6 6 6 6 5 4 0 3 2 1" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case38() {
    int n = 10;
    int d = 9;
    assertArrayEquals(new String[] { "0 0 1 2 3 4 5 6 7 8", "0 0 1 2 3 4 5 6 7 8", "1 1 0 3 2 5 4 7 8 6", "2 2 3 0 1 6 7 8 4 5", "3 3 2 1 0 7 8 5 6 4", "4 4 5 6 7 8 0 1 2 3", "5 5 4 7 8 0 6 2 3 1", "6 6 7 8 4 1 2 3 5 0", "7 7 8 5 6 3 1 4 0 2", "8 8 6 4 5 2 3 0 1 7" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case39() {
    int n = 3;
    int d = 1;
    assertArrayEquals(new String[] { "0 0 0", "0 0 0", "0 0 0" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case40() {
    int n = 3;
    int d = 2;
    assertArrayEquals(new String[] { "0 0 1", "0 0 1", "1 1 0" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case41() {
    int n = 4;
    int d = 1;
    assertArrayEquals(new String[] { "0 0 0 0", "0 0 0 0", "0 0 0 0", "0 0 0 0" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case42() {
    int n = 4;
    int d = 2;
    assertArrayEquals(new String[] { "0 0 0 1", "0 0 0 1", "0 0 0 1", "1 1 1 0" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case43() {
    int n = 5;
    int d = 1;
    assertArrayEquals(new String[] { "0 0 0 0 0", "0 0 0 0 0", "0 0 0 0 0", "0 0 0 0 0", "0 0 0 0 0" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case44() {
    int n = 6;
    int d = 1;
    assertArrayEquals(new String[] { "0 0 0 0 0 0", "0 0 0 0 0 0", "0 0 0 0 0 0", "0 0 0 0 0 0", "0 0 0 0 0 0", "0 0 0 0 0 0" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case45() {
    int n = 6;
    int d = 2;
    assertArrayEquals(new String[] { "0 0 0 0 0 1", "0 0 0 0 0 1", "0 0 0 0 0 1", "0 0 0 0 0 1", "0 0 0 0 0 1", "1 1 1 1 1 0" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case46() {
    int n = 6;
    int d = 3;
    assertArrayEquals(new String[] { "0 0 0 0 1 2", "0 0 0 0 1 2", "0 0 0 0 1 2", "0 0 0 0 1 2", "1 1 1 1 2 0", "2 2 2 2 0 1" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case47() {
    int n = 6;
    int d = 5;
    assertArrayEquals(new String[] { "0 0 1 2 3 4", "0 0 1 2 3 4", "1 1 0 3 4 2", "2 2 3 4 0 1", "3 3 4 1 2 0", "4 4 2 0 1 3" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case48() {
    int n = 7;
    int d = 2;
    assertArrayEquals(new String[] { "0 0 0 0 0 0 1", "0 0 0 0 0 0 1", "0 0 0 0 0 0 1", "0 0 0 0 0 0 1", "0 0 0 0 0 0 1", "0 0 0 0 0 0 1", "1 1 1 1 1 1 0" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case49() {
    int n = 7;
    int d = 3;
    assertArrayEquals(new String[] { "0 0 0 0 0 1 2", "0 0 0 0 0 1 2", "0 0 0 0 0 1 2", "0 0 0 0 0 1 2", "0 0 0 0 0 1 2", "1 1 1 1 1 2 0", "2 2 2 2 2 0 1" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case50() {
    int n = 7;
    int d = 4;
    assertArrayEquals(new String[] { "0 0 0 0 1 2 3", "0 0 0 0 1 2 3", "0 0 0 0 1 2 3", "0 0 0 0 1 2 3", "1 1 1 1 0 3 2", "2 2 2 2 3 0 1", "3 3 3 3 2 1 0" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case51() {
    int n = 8;
    int d = 1;
    assertArrayEquals(new String[] { "0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case52() {
    int n = 8;
    int d = 3;
    assertArrayEquals(new String[] { "0 0 0 0 0 0 1 2", "0 0 0 0 0 0 1 2", "0 0 0 0 0 0 1 2", "0 0 0 0 0 0 1 2", "0 0 0 0 0 0 1 2", "0 0 0 0 0 0 1 2", "1 1 1 1 1 1 2 0", "2 2 2 2 2 2 0 1" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case53() {
    int n = 8;
    int d = 4;
    assertArrayEquals(new String[] { "0 0 0 0 0 1 2 3", "0 0 0 0 0 1 2 3", "0 0 0 0 0 1 2 3", "0 0 0 0 0 1 2 3", "0 0 0 0 0 1 2 3", "1 1 1 1 1 0 3 2", "2 2 2 2 2 3 0 1", "3 3 3 3 3 2 1 0" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case54() {
    int n = 9;
    int d = 1;
    assertArrayEquals(new String[] { "0 0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0 0", "0 0 0 0 0 0 0 0 0" }, quasilatinsquares.makeSquare(n, d));
  }

  @Test
  public void case55() {
    int n = 9;
    int d = 2;
    assertArrayEquals(new String[] { "0 0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 0 1", "0 0 0 0 0 0 0 0 1", "1 1 1 1 1 1 1 1 0" }, quasilatinsquares.makeSquare(n, d));
  }

}
