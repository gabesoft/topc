package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class PrimePalindromicTest {
  PrimePalindromic primepalindromic = new PrimePalindromic();

  @Test
  public void case1() {
    int A = 2260;
    int B = 2262;
    assertEquals(1, primepalindromic.count(A, B));
  }

  @Test
  public void case2() {
    int A = 2;
    int B = 9;
    assertEquals(7, primepalindromic.count(A, B));
  }

  @Test
  public void case3() {
    int A = 2;
    int B = 100;
    assertEquals(36, primepalindromic.count(A, B));
  }

  @Test
  public void case4() {
    int A = 2;
    int B = 10000;
    assertEquals(728, primepalindromic.count(A, B));
  }

  @Test
  public void case5() {
    int A = 2;
    int B = 1000;
    assertEquals(175, primepalindromic.count(A, B));
  }

  @Test
  public void case6() {
    int A = 1001;
    int B = 2000;
    assertEquals(87, primepalindromic.count(A, B));
  }

  @Test
  public void case7() {
    int A = 2001;
    int B = 3000;
    assertEquals(74, primepalindromic.count(A, B));
  }

  @Test
  public void case8() {
    int A = 3001;
    int B = 4000;
    assertEquals(77, primepalindromic.count(A, B));
  }

  @Test
  public void case9() {
    int A = 4001;
    int B = 5000;
    assertEquals(64, primepalindromic.count(A, B));
  }

  @Test
  public void case10() {
    int A = 5001;
    int B = 6000;
    assertEquals(59, primepalindromic.count(A, B));
  }

  @Test
  public void case11() {
    int A = 6001;
    int B = 7000;
    assertEquals(56, primepalindromic.count(A, B));
  }

  @Test
  public void case12() {
    int A = 7001;
    int B = 8000;
    assertEquals(41, primepalindromic.count(A, B));
  }

  @Test
  public void case13() {
    int A = 8001;
    int B = 9000;
    assertEquals(49, primepalindromic.count(A, B));
  }

  @Test
  public void case14() {
    int A = 9001;
    int B = 10000;
    assertEquals(46, primepalindromic.count(A, B));
  }

  @Test
  public void case15() {
    int A = 2;
    int B = 2;
    assertEquals(1, primepalindromic.count(A, B));
  }

  @Test
  public void case16() {
    int A = 10000;
    int B = 10000;
    assertEquals(1, primepalindromic.count(A, B));
  }

  @Test
  public void case17() {
    int A = 18;
    int B = 9973;
    assertEquals(716, primepalindromic.count(A, B));
  }

  @Test
  public void case18() {
    int A = 123;
    int B = 7711;
    assertEquals(578, primepalindromic.count(A, B));
  }

  @Test
  public void case19() {
    int A = 1723;
    int B = 4455;
    assertEquals(197, primepalindromic.count(A, B));
  }

  @Test
  public void case20() {
    int A = 8899;
    int B = 9988;
    assertEquals(49, primepalindromic.count(A, B));
  }

  @Test
  public void case21() {
    int A = 4878;
    int B = 9951;
    assertEquals(256, primepalindromic.count(A, B));
  }

  @Test
  public void case22() {
    int A = 1111;
    int B = 9999;
    assertEquals(541, primepalindromic.count(A, B));
  }

  @Test
  public void case23() {
    int A = 8712;
    int B = 9827;
    assertEquals(51, primepalindromic.count(A, B));
  }

  @Test
  public void case24() {
    int A = 100;
    int B = 10000;
    assertEquals(693, primepalindromic.count(A, B));
  }

  @Test
  public void case25() {
    int A = 99;
    int B = 5001;
    assertEquals(443, primepalindromic.count(A, B));
  }

  @Test
  public void case26() {
    int A = 1023;
    int B = 8191;
    assertEquals(469, primepalindromic.count(A, B));
  }

  @Test
  public void case27() {
    int A = 2;
    int B = 10000;
    assertEquals(728, primepalindromic.count(A, B));
  }

  @Test
  public void case28() {
    int A = 2;
    int B = 100;
    assertEquals(36, primepalindromic.count(A, B));
  }

}
