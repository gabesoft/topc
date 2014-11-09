package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class TheLockDivTwoTest {
  TheLockDivTwo thelockdivtwo = new TheLockDivTwo();

  @Test
  public void case1() {
    int n = 2;
    int k = 4;
    assertEquals("10", thelockdivtwo.password(n, k));
  }

  @Test
  public void case2() {
    int n = 4;
    int k = 6;
    assertEquals("0100", thelockdivtwo.password(n, k));
  }

  @Test
  public void case3() {
    int n = 10;
    int k = 1;
    assertEquals("0000000000", thelockdivtwo.password(n, k));
  }

  @Test
  public void case4() {
    int n = 7;
    int k = 100;
    assertEquals("1100001", thelockdivtwo.password(n, k));
  }

  @Test
  public void case5() {
    int n = 10;
    int k = 597;
    assertEquals("1001010001", thelockdivtwo.password(n, k));
  }

  @Test
  public void case6() {
    int n = 10;
    int k = 15;
    assertEquals("0000001100", thelockdivtwo.password(n, k));
  }

  @Test
  public void case7() {
    int n = 10;
    int k = 621;
    assertEquals("1001101000", thelockdivtwo.password(n, k));
  }

  @Test
  public void case8() {
    int n = 8;
    int k = 249;
    assertEquals("11110110", thelockdivtwo.password(n, k));
  }

  @Test
  public void case9() {
    int n = 7;
    int k = 117;
    assertEquals("1110001", thelockdivtwo.password(n, k));
  }

  @Test
  public void case10() {
    int n = 9;
    int k = 442;
    assertEquals("110110100", thelockdivtwo.password(n, k));
  }

  @Test
  public void case11() {
    int n = 8;
    int k = 228;
    assertEquals("11100000", thelockdivtwo.password(n, k));
  }

  @Test
  public void case12() {
    int n = 1;
    int k = 1;
    assertEquals("0", thelockdivtwo.password(n, k));
  }

  @Test
  public void case13() {
    int n = 5;
    int k = 15;
    assertEquals("01100", thelockdivtwo.password(n, k));
  }

  @Test
  public void case14() {
    int n = 5;
    int k = 13;
    assertEquals("01010", thelockdivtwo.password(n, k));
  }

  @Test
  public void case15() {
    int n = 1;
    int k = 1;
    assertEquals("0", thelockdivtwo.password(n, k));
  }

  @Test
  public void case16() {
    int n = 1;
    int k = 1;
    assertEquals("0", thelockdivtwo.password(n, k));
  }

  @Test
  public void case17() {
    int n = 6;
    int k = 32;
    assertEquals("011100", thelockdivtwo.password(n, k));
  }

  @Test
  public void case18() {
    int n = 10;
    int k = 512;
    assertEquals("0111111001", thelockdivtwo.password(n, k));
  }

  @Test
  public void case19() {
    int n = 7;
    int k = 64;
    assertEquals("0111110", thelockdivtwo.password(n, k));
  }

  @Test
  public void case20() {
    int n = 8;
    int k = 128;
    assertEquals("01111010", thelockdivtwo.password(n, k));
  }

  @Test
  public void case21() {
    int n = 4;
    int k = 8;
    assertEquals("0111", thelockdivtwo.password(n, k));
  }

  @Test
  public void case22() {
    int n = 2;
    int k = 2;
    assertEquals("01", thelockdivtwo.password(n, k));
  }

  @Test
  public void case23() {
    int n = 3;
    int k = 4;
    assertEquals("010", thelockdivtwo.password(n, k));
  }

  @Test
  public void case24() {
    int n = 10;
    int k = 513;
    assertEquals("1111111001", thelockdivtwo.password(n, k));
  }

  @Test
  public void case25() {
    int n = 10;
    int k = 513;
    assertEquals("1111111001", thelockdivtwo.password(n, k));
  }

  @Test
  public void case26() {
    int n = 6;
    int k = 33;
    assertEquals("111100", thelockdivtwo.password(n, k));
  }

  @Test
  public void case27() {
    int n = 5;
    int k = 17;
    assertEquals("11101", thelockdivtwo.password(n, k));
  }

  @Test
  public void case28() {
    int n = 10;
    int k = 1024;
    assertEquals("1111111000", thelockdivtwo.password(n, k));
  }

  @Test
  public void case29() {
    int n = 7;
    int k = 128;
    assertEquals("1111010", thelockdivtwo.password(n, k));
  }

  @Test
  public void case30() {
    int n = 7;
    int k = 128;
    assertEquals("1111010", thelockdivtwo.password(n, k));
  }

  @Test
  public void case31() {
    int n = 10;
    int k = 1024;
    assertEquals("1111111000", thelockdivtwo.password(n, k));
  }

  @Test
  public void case32() {
    int n = 10;
    int k = 1;
    assertEquals("0000000000", thelockdivtwo.password(n, k));
  }

  @Test
  public void case33() {
    int n = 10;
    int k = 110;
    assertEquals("0001101011", thelockdivtwo.password(n, k));
  }

  @Test
  public void case34() {
    int n = 9;
    int k = 511;
    assertEquals("111111000", thelockdivtwo.password(n, k));
  }

  @Test
  public void case35() {
    int n = 10;
    int k = 1023;
    assertEquals("1111111111", thelockdivtwo.password(n, k));
  }

  @Test
  public void case36() {
    int n = 8;
    int k = 18;
    assertEquals("00010000", thelockdivtwo.password(n, k));
  }

  @Test
  public void case37() {
    int n = 10;
    int k = 1011;
    assertEquals("1111101110", thelockdivtwo.password(n, k));
  }

  @Test
  public void case38() {
    int n = 10;
    int k = 9;
    assertEquals("0000001111", thelockdivtwo.password(n, k));
  }

  @Test
  public void case39() {
    int n = 10;
    int k = 987;
    assertEquals("1111010100", thelockdivtwo.password(n, k));
  }

  @Test
  public void case40() {
    int n = 9;
    int k = 210;
    assertEquals("011001101", thelockdivtwo.password(n, k));
  }

  @Test
  public void case41() {
    int n = 9;
    int k = 300;
    assertEquals("100101000", thelockdivtwo.password(n, k));
  }

  @Test
  public void case42() {
    int n = 10;
    int k = 999;
    assertEquals("1111100001", thelockdivtwo.password(n, k));
  }

  @Test
  public void case43() {
    int n = 9;
    int k = 120;
    assertEquals("001110110", thelockdivtwo.password(n, k));
  }

  @Test
  public void case44() {
    int n = 1;
    int k = 2;
    assertEquals("1", thelockdivtwo.password(n, k));
  }

  @Test
  public void case45() {
    int n = 9;
    int k = 510;
    assertEquals("111111111", thelockdivtwo.password(n, k));
  }

  @Test
  public void case46() {
    int n = 4;
    int k = 5;
    assertEquals("0110", thelockdivtwo.password(n, k));
  }

}
