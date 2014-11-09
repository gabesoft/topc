package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class ApothecaryTest {
  Apothecary apothecary = new Apothecary();

  @Test
  public void case1() {
    int W = 17;
    assertArrayEquals(new int[] { -9, -1, 27 }, apothecary.balance(W));
  }

  @Test
  public void case2() {
    int W = 1;
    assertArrayEquals(new int[] { 1 }, apothecary.balance(W));
  }

  @Test
  public void case3() {
    int W = 2016;
    assertArrayEquals(new int[] { -243, -9, 81, 2187 }, apothecary.balance(W));
  }

  @Test
  public void case4() {
    int W = 1000000;
    assertArrayEquals(new int[] { -531441, -59049, -6561, -243, -27, 1, 81, 729, 2187, 1594323 }, apothecary.balance(W));
  }

  @Test
  public void case5() {
    int W = 2;
    assertArrayEquals(new int[] { -1, 3 }, apothecary.balance(W));
  }

  @Test
  public void case6() {
    int W = 3;
    assertArrayEquals(new int[] { 3 }, apothecary.balance(W));
  }

  @Test
  public void case7() {
    int W = 4;
    assertArrayEquals(new int[] { 1, 3 }, apothecary.balance(W));
  }

  @Test
  public void case8() {
    int W = 5;
    assertArrayEquals(new int[] { -3, -1, 9 }, apothecary.balance(W));
  }

  @Test
  public void case9() {
    int W = 6;
    assertArrayEquals(new int[] { -3, 9 }, apothecary.balance(W));
  }

  @Test
  public void case10() {
    int W = 7;
    assertArrayEquals(new int[] { -3, 1, 9 }, apothecary.balance(W));
  }

  @Test
  public void case11() {
    int W = 8;
    assertArrayEquals(new int[] { -1, 9 }, apothecary.balance(W));
  }

  @Test
  public void case12() {
    int W = 9;
    assertArrayEquals(new int[] { 9 }, apothecary.balance(W));
  }

  @Test
  public void case13() {
    int W = 14;
    assertArrayEquals(new int[] { -9, -3, -1, 27 }, apothecary.balance(W));
  }

  @Test
  public void case14() {
    int W = 22;
    assertArrayEquals(new int[] { -9, 1, 3, 27 }, apothecary.balance(W));
  }

  @Test
  public void case15() {
    int W = 45;
    assertArrayEquals(new int[] { -27, -9, 81 }, apothecary.balance(W));
  }

  @Test
  public void case16() {
    int W = 84;
    assertArrayEquals(new int[] { 3, 81 }, apothecary.balance(W));
  }

  @Test
  public void case17() {
    int W = 156;
    assertArrayEquals(new int[] { -81, -9, 3, 243 }, apothecary.balance(W));
  }

  @Test
  public void case18() {
    int W = 316;
    assertArrayEquals(new int[] { -9, 1, 81, 243 }, apothecary.balance(W));
  }

  @Test
  public void case19() {
    int W = 500;
    assertArrayEquals(new int[] { -243, -9, -3, -1, 27, 729 }, apothecary.balance(W));
  }

  @Test
  public void case20() {
    int W = 911;
    assertArrayEquals(new int[] { -81, -9, -1, 3, 27, 243, 729 }, apothecary.balance(W));
  }

  @Test
  public void case21() {
    int W = 2045;
    assertArrayEquals(new int[] { -243, -9, -1, 3, 27, 81, 2187 }, apothecary.balance(W));
  }

  @Test
  public void case22() {
    int W = 4987;
    assertArrayEquals(new int[] { -2187, -81, -27, -9, 1, 729, 6561 }, apothecary.balance(W));
  }

  @Test
  public void case23() {
    int W = 21345;
    assertArrayEquals(new int[] { -729, -27, -9, -3, 243, 2187, 19683 }, apothecary.balance(W));
  }

  @Test
  public void case24() {
    int W = 69100;
    assertArrayEquals(new int[] { -6561, -2187, -729, -243, -3, 1, 9, 81, 19683, 59049 }, apothecary.balance(W));
  }

  @Test
  public void case25() {
    int W = 101010;
    assertArrayEquals(new int[] { -59049, -19683, -243, -81, 3, 729, 2187, 177147 }, apothecary.balance(W));
  }

  @Test
  public void case26() {
    int W = 278982;
    assertArrayEquals(new int[] { -177147, -59049, -19683, -2187, -729, -243, -9, 27, 6561, 531441 }, apothecary.balance(W));
  }

  @Test
  public void case27() {
    int W = 402349;
    assertArrayEquals(new int[] { -177147, -19683, -81, -9, 1, 3, 27, 2187, 6561, 59049, 531441 }, apothecary.balance(W));
  }

  @Test
  public void case28() {
    int W = 654321;
    assertArrayEquals(new int[] { -59049, -2187, -243, -81, 3, 729, 6561, 177147, 531441 }, apothecary.balance(W));
  }

  @Test
  public void case29() {
    int W = 789123;
    assertArrayEquals(new int[] { -729, -9, 3, 27, 81, 243, 2187, 19683, 59049, 177147, 531441 }, apothecary.balance(W));
  }

  @Test
  public void case30() {
    int W = 999999;
    assertArrayEquals(new int[] { -531441, -59049, -6561, -243, -27, 81, 729, 2187, 1594323 }, apothecary.balance(W));
  }

  @Test
  public void case31() {
    int W = 531441;
    assertArrayEquals(new int[] { 531441 }, apothecary.balance(W));
  }

  @Test
  public void case32() {
    int W = 803158;
    assertArrayEquals(new int[] { -531441, -177147, -59049, -19683, -6561, -243, -27, -9, -3, 1, 81, 729, 2187, 1594323 }, apothecary.balance(W));
  }

  @Test
  public void case33() {
    int W = 797189;
    assertArrayEquals(new int[] { -531441, -177147, -59049, -19683, -6561, -2187, -729, -243, -81, -9, -3, -1, 1594323 }, apothecary.balance(W));
  }

  @Test
  public void case34() {
    int W = 94;
    assertArrayEquals(new int[] { 1, 3, 9, 81 }, apothecary.balance(W));
  }

  @Test
  public void case35() {
    int W = 87629;
    assertArrayEquals(new int[] { -81, -9, -3, -1, 243, 2187, 6561, 19683, 59049 }, apothecary.balance(W));
  }

  @Test
  public void case36() {
    int W = 931112;
    assertArrayEquals(new int[] { -531441, -177147, -19683, -729, -81, -9, -1, 27, 243, 6561, 59049, 1594323 }, apothecary.balance(W));
  }

  @Test
  public void case37() {
    int W = 723243;
    assertArrayEquals(new int[] { -6561, -729, -9, 3, 81, 2187, 19683, 177147, 531441 }, apothecary.balance(W));
  }

  @Test
  public void case38() {
    int W = 2016;
    assertArrayEquals(new int[] { -243, -9, 81, 2187 }, apothecary.balance(W));
  }

  @Test
  public void case39() {
    int W = 4;
    assertArrayEquals(new int[] { 1, 3 }, apothecary.balance(W));
  }

  @Test
  public void case40() {
    int W = 1000000;
    assertArrayEquals(new int[] { -531441, -59049, -6561, -243, -27, 1, 81, 729, 2187, 1594323 }, apothecary.balance(W));
  }

  @Test
  public void case41() {
    int W = 12;
    assertArrayEquals(new int[] { 3, 9 }, apothecary.balance(W));
  }

}
