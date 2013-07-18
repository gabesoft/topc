package topc.test.graph;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.graph.*;

public class TransposeTest {
  Transpose transpose = new Transpose();

  @Test
  public void case1() {
    int M = 3;
    int N = 3;
    assertEquals(3, transpose.numSwaps(M, N));
  }

  @Test
  public void case2() {
    int M = 2;
    int N = 3;
    assertEquals(3, transpose.numSwaps(M, N));
  }

  @Test
  public void case3() {
    int M = 3;
    int N = 5;
    assertEquals(10, transpose.numSwaps(M, N));
  }

  @Test
  public void case4() {
    int M = 50;
    int N = 50;
    assertEquals(1225, transpose.numSwaps(M, N));
  }

  @Test
  public void case5() {
    int M = 49;
    int N = 51;
    assertEquals(2492, transpose.numSwaps(M, N));
  }

  @Test
  public void case6() {
    int M = 100;
    int N = 100;
    assertEquals(4950, transpose.numSwaps(M, N));
  }

  @Test
  public void case7() {
    int M = 1;
    int N = 1;
    assertEquals(0, transpose.numSwaps(M, N));
  }

  @Test
  public void case8() {
    int M = 1;
    int N = 2;
    assertEquals(0, transpose.numSwaps(M, N));
  }

  @Test
  public void case9() {
    int M = 2;
    int N = 1;
    assertEquals(0, transpose.numSwaps(M, N));
  }

  @Test
  public void case10() {
    int M = 2;
    int N = 2;
    assertEquals(1, transpose.numSwaps(M, N));
  }

  @Test
  public void case11() {
    int M = 1;
    int N = 100;
    assertEquals(0, transpose.numSwaps(M, N));
  }

  @Test
  public void case12() {
    int M = 100;
    int N = 1;
    assertEquals(0, transpose.numSwaps(M, N));
  }

  @Test
  public void case13() {
    int M = 99;
    int N = 100;
    assertEquals(9836, transpose.numSwaps(M, N));
  }

  @Test
  public void case14() {
    int M = 100;
    int N = 98;
    assertEquals(9484, transpose.numSwaps(M, N));
  }

  @Test
  public void case15() {
    int M = 10;
    int N = 10;
    assertEquals(45, transpose.numSwaps(M, N));
  }

  @Test
  public void case16() {
    int M = 10;
    int N = 11;
    assertEquals(107, transpose.numSwaps(M, N));
  }

  @Test
  public void case17() {
    int M = 49;
    int N = 99;
    assertEquals(4724, transpose.numSwaps(M, N));
  }

  @Test
  public void case18() {
    int M = 99;
    int N = 51;
    assertEquals(5035, transpose.numSwaps(M, N));
  }

  @Test
  public void case19() {
    int M = 35;
    int N = 45;
    assertEquals(1570, transpose.numSwaps(M, N));
  }

  @Test
  public void case20() {
    int M = 46;
    int N = 36;
    assertEquals(1640, transpose.numSwaps(M, N));
  }

  @Test
  public void case21() {
    int M = 3;
    int N = 71;
    assertEquals(205, transpose.numSwaps(M, N));
  }

  @Test
  public void case22() {
    int M = 81;
    int N = 9;
    assertEquals(480, transpose.numSwaps(M, N));
  }

  @Test
  public void case23() {
    int M = 100;
    int N = 98;
    assertEquals(9484, transpose.numSwaps(M, N));
  }

  @Test
  public void case24() {
    int M = 49;
    int N = 51;
    assertEquals(2492, transpose.numSwaps(M, N));
  }

  @Test
  public void case25() {
    int M = 1;
    int N = 7;
    assertEquals(0, transpose.numSwaps(M, N));
  }

}
