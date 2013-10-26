package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class AvoidingProductTest {
  AvoidingProduct avoidingproduct = new AvoidingProduct();

  @Test
  public void case1() {
    int[] a = { 2, 4 };
    int n = 4;
    assertArrayEquals(new int[] { 1, 1, 3 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case2() {
    int[] a = { 1 };
    int n = 10;
    assertArrayEquals(new int[] { 2, 2, 2 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case3() {
    int[] a = { 1, 2 };
    int n = 10;
    assertArrayEquals(new int[] { 3, 3, 3 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case4() {
    int[] a = { 1, 3 };
    int n = 12;
    assertArrayEquals(new int[] { 2, 2, 2 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case5() {
    int[] a = { 1, 3 };
    int n = 13;
    assertArrayEquals(new int[] { 2, 2, 4 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case6() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    int n = 1000;
    assertArrayEquals(new int[] { 51, 51, 51 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case7() {
    int[] a = {  };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1000 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case8() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int n = 1;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case9() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int n = 2;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case10() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int n = 3;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case11() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int n = 4;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case12() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int n = 5;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case13() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int n = 6;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case14() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int n = 7;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case15() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int n = 8;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case16() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int n = 9;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case17() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int n = 10;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case18() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int n = 11;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case19() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int n = 12;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case20() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 13 };
    int n = 13;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case21() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int n = 14;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case22() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int n = 15;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case23() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int n = 16;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case24() {
    int[] a = { 17, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int n = 17;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case25() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int n = 18;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case26() {
    int[] a = { 1, 2, 19, 3, 4, 5, 6, 7, 8, 9, 10 };
    int n = 19;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case27() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int n = 20;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case28() {
    int[] a = { 1, 2, 3, 4, 5, 20, 6, 7, 8, 9, 10 };
    int n = 20;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case29() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 40 };
    int n = 40;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case30() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int n = 60;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case31() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int n = 80;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case32() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
    int n = 100;
    assertArrayEquals(new int[] { 14, 14, 14 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case33() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 20, 120, 30 };
    int n = 120;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case34() {
    int[] a = { 1, 2, 3, 4, 5, 140, 6, 7, 8, 9, 10 };
    int n = 140;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case35() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int n = 160;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case36() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int n = 180;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case37() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 50, 23, 22 };
    int n = 200;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case38() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 14 };
    int n = 220;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case39() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 60 };
    int n = 240;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case40() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
    int n = 260;
    assertArrayEquals(new int[] { 14, 14, 14 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case41() {
    int[] a = { 1, 70, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 14, 17, 16, 19, 18, 23, 31 };
    int n = 280;
    assertArrayEquals(new int[] { 12, 12, 12 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case42() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 25, 9, 10 };
    int n = 300;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case43() {
    int[] a = { 1, 2, 3, 4, 5, 6, 320, 7, 8, 9, 10, 13 };
    int n = 320;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case44() {
    int[] a = { 1, 2, 3, 38, 4, 5, 6, 7, 8, 9, 10, 11 };
    int n = 340;
    assertArrayEquals(new int[] { 12, 12, 12 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case45() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 40, 10, 11, 15, 18 };
    int n = 360;
    assertArrayEquals(new int[] { 12, 12, 12 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case46() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 42, 8, 380, 9, 10, 11, 21, 95 };
    int n = 380;
    assertArrayEquals(new int[] { 12, 12, 12 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case47() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 25, 9, 10, 11 };
    int n = 400;
    assertArrayEquals(new int[] { 12, 12, 12 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case48() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
    int n = 420;
    assertArrayEquals(new int[] { 12, 12, 12 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case49() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
    int n = 440;
    assertArrayEquals(new int[] { 12, 12, 12 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case50() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13 };
    int n = 460;
    assertArrayEquals(new int[] { 12, 12, 12 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case51() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 40, 11, 12, 16, 120 };
    int n = 480;
    assertArrayEquals(new int[] { 13, 13, 13 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case52() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20, 25 };
    int n = 500;
    assertArrayEquals(new int[] { 12, 12, 12 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case53() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
    int n = 520;
    assertArrayEquals(new int[] { 12, 12, 12 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case54() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 15 };
    int n = 540;
    assertArrayEquals(new int[] { 12, 12, 12 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case55() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 17, 16, 560 };
    int n = 560;
    assertArrayEquals(new int[] { 12, 12, 12 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case56() {
    int[] a = { 1, 2, 3, 4, 64, 5, 6, 7, 8, 9, 10, 11, 12, 13, 24 };
    int n = 580;
    assertArrayEquals(new int[] { 14, 14, 14 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case57() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 600, 10, 11 };
    int n = 600;
    assertArrayEquals(new int[] { 12, 12, 12 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case58() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 620, 17 };
    int n = 620;
    assertArrayEquals(new int[] { 12, 12, 12 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case59() {
    int[] a = { 1, 32, 2, 3, 71, 4, 64, 5, 6, 7, 8, 9, 40, 10, 11, 160, 12, 13, 18, 80, 20, 27, 26 };
    int n = 640;
    assertArrayEquals(new int[] { 14, 14, 14 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case60() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 44, 16, 660 };
    int n = 660;
    assertArrayEquals(new int[] { 12, 12, 12 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case61() {
    int[] a = { 34, 1, 2, 3, 4, 5, 6, 680, 7, 8, 9, 10, 11, 14, 17, 27 };
    int n = 680;
    assertArrayEquals(new int[] { 12, 12, 12 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case62() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 78, 10, 11 };
    int n = 700;
    assertArrayEquals(new int[] { 12, 12, 12 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case63() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 720, 29, 240, 180 };
    int n = 720;
    assertArrayEquals(new int[] { 13, 13, 13 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case64() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 185, 18, 21, 31 };
    int n = 740;
    assertArrayEquals(new int[] { 14, 14, 14 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case65() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 190 };
    int n = 760;
    assertArrayEquals(new int[] { 13, 13, 13 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case66() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 16 };
    int n = 780;
    assertArrayEquals(new int[] { 14, 14, 14 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case67() {
    int[] a = { 1, 2, 32, 3, 33, 4, 5, 6, 7, 8, 9, 10, 11, 12, 15, 18, 23 };
    int n = 800;
    assertArrayEquals(new int[] { 13, 13, 13 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case68() {
    int[] a = { 1, 2, 3, 33, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 17, 23, 91 };
    int n = 820;
    assertArrayEquals(new int[] { 14, 14, 14 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case69() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
    int n = 840;
    assertArrayEquals(new int[] { 13, 13, 13 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case70() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 43, 9, 10, 11, 12, 15, 18, 24 };
    int n = 860;
    assertArrayEquals(new int[] { 13, 13, 13 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case71() {
    int[] a = { 440, 880, 1, 2, 3, 4, 98, 5, 6, 7, 8, 9, 10, 11, 12, 16, 21, 22, 24 };
    int n = 880;
    assertArrayEquals(new int[] { 13, 13, 13 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case72() {
    int[] a = { 1, 2, 100, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 18, 900 };
    int n = 900;
    assertArrayEquals(new int[] { 13, 13, 13 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case73() {
    int[] a = { 102, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 46, 17, 26 };
    int n = 920;
    assertArrayEquals(new int[] { 13, 13, 13 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case74() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 47 };
    int n = 940;
    assertArrayEquals(new int[] { 13, 13, 13 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case75() {
    int[] a = { 1, 2, 32, 3, 4, 5, 6, 7, 8, 9, 10, 40, 11, 12, 16, 80, 23, 27 };
    int n = 960;
    assertArrayEquals(new int[] { 13, 13, 13 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case76() {
    int[] a = { 1, 35, 2, 3, 4, 39, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 49, 28 };
    int n = 980;
    assertArrayEquals(new int[] { 15, 15, 15 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case77() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 40, 10, 11, 12, 13, 16, 50, 18, 20, 24, 28 };
    int n = 1000;
    assertArrayEquals(new int[] { 14, 14, 14 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case78() {
    int[] a = { 1, 2, 10 };
    int n = 10;
    assertArrayEquals(new int[] { 3, 3, 3 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case79() {
    int[] a = { 1, 2, 3, 5 };
    int n = 30;
    assertArrayEquals(new int[] { 4, 4, 4 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case80() {
    int[] a = { 1, 2, 3 };
    int n = 50;
    assertArrayEquals(new int[] { 4, 4, 4 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case81() {
    int[] a = { 1, 2, 3, 4, 7 };
    int n = 70;
    assertArrayEquals(new int[] { 5, 5, 5 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case82() {
    int[] a = { 1, 2, 3, 4, 5 };
    int n = 90;
    assertArrayEquals(new int[] { 6, 6, 6 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case83() {
    int[] a = { 1, 2, 3, 4, 22, 110, 10, 12 };
    int n = 110;
    assertArrayEquals(new int[] { 5, 5, 5 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case84() {
    int[] a = { 1, 2, 3, 4, 5 };
    int n = 130;
    assertArrayEquals(new int[] { 6, 6, 6 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case85() {
    int[] a = { 1, 2, 3, 4, 5 };
    int n = 150;
    assertArrayEquals(new int[] { 6, 6, 6 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case86() {
    int[] a = { 17, 1, 2, 19, 3, 4, 6, 7, 43, 14 };
    int n = 170;
    assertArrayEquals(new int[] { 5, 5, 8 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case87() {
    int[] a = { 1, 2, 3, 4, 21, 38, 190, 5, 8, 95, 12 };
    int n = 190;
    assertArrayEquals(new int[] { 6, 6, 6 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case88() {
    int[] a = { 1, 2, 3, 4, 5, 6, 210 };
    int n = 210;
    assertArrayEquals(new int[] { 7, 7, 7 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case89() {
    int[] a = { 1, 2, 3, 4, 5, 7, 231, 230, 77, 9, 46, 115, 23, 58 };
    int n = 230;
    assertArrayEquals(new int[] { 6, 6, 6 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case90() {
    int[] a = { 1, 2, 3, 4, 250, 7, 8, 10, 125, 28 };
    int n = 250;
    assertArrayEquals(new int[] { 5, 6, 9 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case91() {
    int[] a = { 17, 1, 2, 3, 4, 5, 27, 45 };
    int n = 270;
    assertArrayEquals(new int[] { 6, 6, 7 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case92() {
    int[] a = { 1, 32, 2, 290, 3, 4, 5, 7, 8, 145 };
    int n = 290;
    assertArrayEquals(new int[] { 6, 6, 9 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case93() {
    int[] a = { 34, 1, 2, 3, 4, 5, 13 };
    int n = 310;
    assertArrayEquals(new int[] { 6, 6, 9 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case94() {
    int[] a = { 1, 2, 3, 4, 6, 7, 8, 11, 13 };
    int n = 330;
    assertArrayEquals(new int[] { 5, 5, 14 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case95() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 350 };
    int n = 350;
    assertArrayEquals(new int[] { 8, 8, 8 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case96() {
    int[] a = { 1, 2, 3, 4, 5, 23, 7, 10 };
    int n = 370;
    assertArrayEquals(new int[] { 6, 8, 8 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case97() {
    int[] a = { 1, 2, 3, 4, 5, 39, 6, 7, 11, 13, 390 };
    int n = 390;
    assertArrayEquals(new int[] { 8, 8, 8 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case98() {
    int[] a = { 17, 205, 410, 1, 2, 3, 4, 5, 6 };
    int n = 410;
    assertArrayEquals(new int[] { 7, 7, 8 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case99() {
    int[] a = { 1, 2, 3, 4, 5, 6, 43, 13 };
    int n = 430;
    assertArrayEquals(new int[] { 7, 7, 9 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case100() {
    int[] a = { 16, 1, 2, 18, 3, 4, 5, 8, 9, 28, 15 };
    int n = 450;
    assertArrayEquals(new int[] { 6, 7, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case101() {
    int[] a = { 16, 1, 19, 2, 3, 4, 7, 8, 13, 47 };
    int n = 470;
    assertArrayEquals(new int[] { 6, 9, 9 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case102() {
    int[] a = { 35, 1, 2, 3, 4, 5, 7, 8, 9, 41, 123 };
    int n = 490;
    assertArrayEquals(new int[] { 6, 6, 14 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case103() {
    int[] a = { 34, 85, 1, 2, 3, 4, 20, 6, 8, 10 };
    int n = 510;
    assertArrayEquals(new int[] { 5, 5, 21 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case104() {
    int[] a = { 1, 19, 2, 3, 4, 5, 6, 53, 11, 133 };
    int n = 530;
    assertArrayEquals(new int[] { 8, 8, 8 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case105() {
    int[] a = { 550, 1, 2, 3, 4, 5, 6, 7, 8, 14, 61 };
    int n = 550;
    assertArrayEquals(new int[] { 9, 9, 9 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case106() {
    int[] a = { 16, 1, 19, 2, 3, 4, 5, 7, 9, 95, 11, 12 };
    int n = 570;
    assertArrayEquals(new int[] { 6, 6, 15 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case107() {
    int[] a = { 1, 49, 2, 3, 4, 5, 6, 7, 37 };
    int n = 590;
    assertArrayEquals(new int[] { 8, 8, 9 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case108() {
    int[] a = { 17, 34, 68, 610, 1, 2, 3, 4, 5, 7, 10, 29 };
    int n = 610;
    assertArrayEquals(new int[] { 6, 8, 13 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case109() {
    int[] a = { 1, 2, 3, 4, 5, 8, 9, 13, 15, 105 };
    int n = 630;
    assertArrayEquals(new int[] { 6, 6, 17 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case110() {
    int[] a = { 1, 2, 3, 4, 5, 65, 650, 7, 163, 9, 10, 72, 18, 325, 25, 26 };
    int n = 650;
    assertArrayEquals(new int[] { 6, 8, 14 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case111() {
    int[] a = { 1, 2, 3, 4, 5, 6, 12 };
    int n = 670;
    assertArrayEquals(new int[] { 7, 7, 14 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case112() {
    int[] a = { 1, 2, 3, 4, 115, 5, 6, 23, 7, 46, 690, 345 };
    int n = 690;
    assertArrayEquals(new int[] { 8, 8, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case113() {
    int[] a = { 17, 1, 2, 3, 4, 5, 6, 8, 10 };
    int n = 710;
    assertArrayEquals(new int[] { 7, 9, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case114() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 9, 183, 73 };
    int n = 730;
    assertArrayEquals(new int[] { 8, 8, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case115() {
    int[] a = { 1, 2, 3, 4, 5, 6, 12 };
    int n = 750;
    assertArrayEquals(new int[] { 7, 7, 15 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case116() {
    int[] a = { 1, 2, 3, 4, 770, 5, 7, 8, 13, 14 };
    int n = 770;
    assertArrayEquals(new int[] { 6, 6, 21 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case117() {
    int[] a = { 1, 2, 3, 33, 4, 5, 66, 6, 7, 8, 44, 18, 22, 88 };
    int n = 790;
    assertArrayEquals(new int[] { 9, 9, 10 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case118() {
    int[] a = { 1, 2, 18, 3, 4, 5, 6, 7, 9, 10, 27 };
    int n = 810;
    assertArrayEquals(new int[] { 8, 8, 13 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case119() {
    int[] a = { 17, 1, 2, 3, 4, 5, 6, 7, 52, 8, 92 };
    int n = 830;
    assertArrayEquals(new int[] { 9, 9, 10 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case120() {
    int[] a = { 17, 1, 2, 3, 71, 4, 5, 6, 7, 142, 213, 11 };
    int n = 850;
    assertArrayEquals(new int[] { 8, 9, 12 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case121() {
    int[] a = { 1, 2, 3, 4, 5, 36, 8, 9, 10, 12, 54, 24, 31 };
    int n = 870;
    assertArrayEquals(new int[] { 6, 7, 21 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case122() {
    int[] a = { 1, 2, 32, 3, 4, 36, 6, 37, 8, 10, 890, 11, 12, 14, 17, 18, 20, 56, 89 };
    int n = 890;
    assertArrayEquals(new int[] { 5, 5, 35 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case123() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 10, 57 };
    int n = 910;
    assertArrayEquals(new int[] { 8, 8, 14 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case124() {
    int[] a = { 1, 2, 3, 4, 5, 6, 9, 12, 17, 19, 22, 26, 31 };
    int n = 930;
    assertArrayEquals(new int[] { 7, 10, 13 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case125() {
    int[] a = { 1, 2, 3, 38, 4, 5, 6, 7, 9, 79, 12, 15, 17, 19, 95 };
    int n = 950;
    assertArrayEquals(new int[] { 8, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case126() {
    int[] a = { 1, 2, 3, 4, 5, 39, 7, 8, 9, 13, 17, 16, 970, 18, 23, 27 };
    int n = 970;
    assertArrayEquals(new int[] { 6, 11, 15 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case127() {
    int[] a = { 1, 2, 3, 4, 990, 20, 5, 6, 10, 11 };
    int n = 990;
    assertArrayEquals(new int[] { 7, 8, 18 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case128() {
    int[] a = { 1, 2, 3, 4, 5, 10, 11 };
    int n = 991;
    assertArrayEquals(new int[] { 7, 7, 20 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case129() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 13 };
    int n = 991;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case130() {
    int[] a = { 1, 2, 3, 4, 991, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 28 };
    int n = 991;
    assertArrayEquals(new int[] { 17, 17, 17 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case131() {
    int[] a = { 1, 2, 3, 55, 4, 5, 7, 110, 992, 10, 15 };
    int n = 992;
    assertArrayEquals(new int[] { 6, 6, 28 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case132() {
    int[] a = { 1, 2, 3, 4, 5, 39, 66, 6, 7, 8, 110, 9, 40, 10, 11, 14, 20, 22, 25, 28 };
    int n = 992;
    assertArrayEquals(new int[] { 12, 12, 12 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case133() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 248, 992 };
    int n = 992;
    assertArrayEquals(new int[] { 14, 14, 14 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case134() {
    int[] a = { 1, 2, 18, 33, 3, 71, 4, 5, 110, 9, 10, 11 };
    int n = 993;
    assertArrayEquals(new int[] { 7, 7, 20 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case135() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 110, 9, 10, 11 };
    int n = 993;
    assertArrayEquals(new int[] { 12, 12, 12 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case136() {
    int[] a = { 1, 2, 3, 33, 4, 5, 6, 7, 8, 9, 10, 11, 12, 15, 993 };
    int n = 993;
    assertArrayEquals(new int[] { 13, 13, 13 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case137() {
    int[] a = { 1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 62 };
    int n = 994;
    assertArrayEquals(new int[] { 7, 7, 20 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case138() {
    int[] a = { 1, 2, 3, 33, 4, 5, 6, 7, 8, 9, 10, 497, 22, 994 };
    int n = 994;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case139() {
    int[] a = { 1, 2, 71, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 166, 18, 20, 249 };
    int n = 994;
    assertArrayEquals(new int[] { 13, 13, 13 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case140() {
    int[] a = { 1, 2, 3, 5, 7, 8, 111, 40, 10, 15, 50, 19, 83, 25, 62 };
    int n = 995;
    assertArrayEquals(new int[] { 4, 6, 41 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case141() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 16, 995 };
    int n = 995;
    assertArrayEquals(new int[] { 9, 9, 15 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case142() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 995, 28 };
    int n = 995;
    assertArrayEquals(new int[] { 13, 13, 13 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case143() {
    int[] a = { 1, 2, 3, 33, 4, 7, 8, 9, 10, 40, 15, 50, 18, 83, 332, 996 };
    int n = 996;
    assertArrayEquals(new int[] { 6, 6, 28 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case144() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 111, 9, 10, 11, 28 };
    int n = 996;
    assertArrayEquals(new int[] { 12, 12, 12 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case145() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 40, 10, 11, 12, 15, 50, 20, 83, 25 };
    int n = 996;
    assertArrayEquals(new int[] { 13, 13, 13 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case146() {
    int[] a = { 1, 2, 3, 4, 5, 6, 83, 7, 10, 997, 998 };
    int n = 997;
    assertArrayEquals(new int[] { 8, 9, 14 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case147() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 498, 499, 15, 997, 996, 998 };
    int n = 997;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case148() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 15, 28 };
    int n = 997;
    assertArrayEquals(new int[] { 13, 13, 13 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case149() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 9, 10, 28, 13, 15 };
    int n = 998;
    assertArrayEquals(new int[] { 8, 8, 16 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case150() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 18, 998 };
    int n = 998;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case151() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 28, 998 };
    int n = 998;
    assertArrayEquals(new int[] { 14, 14, 14 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case152() {
    int[] a = { 1, 2, 3, 4, 5, 6, 37, 7, 111, 10, 14, 50, 112, 333, 28, 999 };
    int n = 999;
    assertArrayEquals(new int[] { 8, 8, 16 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case153() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 111, 10, 12, 13, 15, 16, 21, 27, 333, 29, 28, 999 };
    int n = 999;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case154() {
    int[] a = { 1, 2, 3, 4, 5, 200, 6, 7, 8, 9, 10, 11, 12, 13, 1000, 25, 333, 999, 31, 36, 37, 42, 50, 250, 63, 62 };
    int n = 999;
    assertArrayEquals(new int[] { 14, 14, 14 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case155() {
    int[] a = { 1, 100, 2, 3, 4, 5, 6, 7, 9, 40, 10, 1000, 250, 28 };
    int n = 1000;
    assertArrayEquals(new int[] { 8, 8, 16 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case156() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 40, 11, 50, 16, 63 };
    int n = 1000;
    assertArrayEquals(new int[] { 12, 12, 12 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case157() {
    int[] a = { 1, 2, 3, 4, 200, 5, 6, 7, 8, 500, 9, 10, 11, 12, 1000 };
    int n = 1000;
    assertArrayEquals(new int[] { 13, 13, 13 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case158() {
    int[] a = { 2, 3, 4, 5, 8, 9, 10, 20, 25, 27, 37, 40, 50, 100, 111, 125, 200, 250, 333, 500, 999, 1000 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1001 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case159() {
    int[] a = { 441, 147, 63, 9, 1, 49, 21, 110, 55, 5, 22, 20, 17, 11, 111, 73, 74, 37, 109, 112, 4, 31, 32, 28, 16, 8, 108, 72, 75, 36, 18, 15, 48, 50, 24, 25, 12, 113, 107, 114, 71, 76, 38, 106, 47, 51, 115, 23, 105, 70 };
    int n = 441;
    assertArrayEquals(new int[] { 2, 3, 77 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case160() {
    int[] a = { 263, 262, 264, 131, 1, 66, 44, 33, 22, 12, 11, 29, 65, 26, 19, 13, 67, 43, 64, 45, 32, 27, 16, 15, 30, 18, 10, 8, 9, 5, 68, 34, 17, 63, 42, 21, 28, 14, 6, 69, 46, 23, 62, 31, 70, 41, 35, 20, 61, 47 };
    int n = 263;
    assertArrayEquals(new int[] { 2, 2, 71 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case161() {
    int[] a = { 352, 176, 88, 44, 32, 22, 16, 11, 351, 353, 117, 39, 27, 13, 350, 354, 175, 177, 118, 70, 59, 50, 35, 25, 14, 10, 349, 355, 71, 348, 356, 174, 178, 116, 87, 89, 58, 29, 347, 357, 119, 51, 21, 17, 346, 358, 173, 179, 345, 359 };
    int n = 352;
    assertArrayEquals(new int[] { 1, 3, 115 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case162() {
    int[] a = { 593, 592, 594, 296, 297, 198, 148, 99, 74, 66, 54, 37, 33, 27, 3, 11, 591, 595, 119, 85, 35, 5, 590, 596, 295, 298, 149, 59, 589, 597, 31, 588, 598, 294, 2, 147, 98, 7, 49, 46, 42, 28, 26, 587, 599, 586, 600, 150, 100, 75 };
    int n = 593;
    assertArrayEquals(new int[] { 1, 10, 60 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case163() {
    int[] a = { 335, 67, 334, 336, 167, 168, 112, 84, 56, 48, 42, 28, 24, 21, 14, 16, 12, 8, 333, 337, 111, 37, 332, 338, 166, 169, 83, 26, 13, 331, 339, 113, 330, 340, 165, 170, 110, 85, 66, 68, 55, 33, 34, 30, 22, 20, 17, 15, 11, 329 };
    int n = 335;
    assertArrayEquals(new int[] { 1, 1, 341 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case164() {
    int[] a = { 206, 103, 205, 207, 69, 41, 23, 204, 208, 102, 104, 68, 51, 52, 34, 26, 17, 16, 13, 203, 209, 29, 19, 202, 210, 101, 105, 70, 42, 35, 30, 21, 15, 14, 10, 7, 201, 211, 67, 200, 212, 100, 106, 50, 53, 40, 25, 20, 8, 199 };
    int n = 206;
    assertArrayEquals(new int[] { 1, 1, 213 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case165() {
    int[] a = { 961, 31, 960, 962, 480, 481, 320, 240, 192, 160, 120, 96, 80, 74, 64, 60, 20, 40, 37, 32, 48, 30, 24, 16, 15, 12, 959, 963, 321, 137, 107, 958, 964, 479, 482, 241, 957, 965, 319, 193, 87, 33, 29, 1, 239, 3, 69, 21, 23, 242 };
    int n = 961;
    assertArrayEquals(new int[] { 2, 4, 121 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case166() {
    int[] a = { 945, 315, 189, 135, 105, 63, 45, 35, 21, 27, 15, 944, 946, 472, 473, 236, 118, 86, 59, 43, 943, 947, 41, 942, 948, 471, 474, 314, 316, 237, 157, 158, 79, 941, 949, 73, 940, 950, 470, 475, 235, 188, 190, 94, 95, 50, 47, 38, 25, 19 };
    int n = 945;
    assertArrayEquals(new int[] { 1, 1, 939 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case167() {
    int[] a = { 196, 98, 49, 28, 14, 7, 195, 197, 65, 39, 15, 13, 194, 198, 97, 99, 3, 33, 22, 18, 11, 193, 199, 192, 200, 96, 100, 48, 50, 40, 6, 24, 25, 20, 16, 12, 10, 8, 191, 201, 190, 202, 95, 101, 38, 19, 189, 203, 21, 188 };
    int n = 196;
    assertArrayEquals(new int[] { 1, 1, 204 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case168() {
    int[] a = { 934, 467, 1, 17, 233, 234, 156, 117, 78, 52, 39, 13, 26, 104, 19, 155, 93, 67, 31, 62, 232, 235, 116, 94, 58, 47, 29, 103, 157, 37, 231, 236, 154, 2, 77, 44, 28, 22, 59, 7, 21, 14, 105, 5, 35, 79, 23, 102, 51, 34 };
    int n = 934;
    assertArrayEquals(new int[] { 3, 3, 106 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case169() {
    int[] a = { 216, 108, 72, 54, 36, 27, 24, 18, 12, 9, 6, 215, 217, 43, 31, 214, 218, 107, 109, 213, 219, 71, 73, 212, 220, 106, 110, 53, 55, 44, 22, 20, 11, 211, 221, 17, 210, 222, 105, 111, 70, 74, 42, 30, 21, 15, 35, 37, 14, 10 };
    int n = 216;
    assertArrayEquals(new int[] { 1, 1, 209 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case170() {
    int[] a = { 703, 37, 702, 704, 351, 352, 234, 176, 117, 88, 78, 64, 54, 44, 39, 32, 27, 22, 26, 18, 16, 13, 11, 701, 705, 235, 141, 47, 700, 706, 350, 353, 175, 140, 100, 70, 50, 35, 28, 25, 20, 14, 10, 699, 707, 233, 101, 698, 708, 349 };
    int n = 703;
    assertArrayEquals(new int[] { 1, 2, 354 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case171() {
    int[] a = { 403, 31, 402, 404, 201, 202, 134, 101, 67, 401, 405, 135, 81, 45, 27, 15, 9, 400, 406, 200, 203, 100, 80, 58, 50, 40, 29, 25, 20, 10, 16, 399, 407, 133, 57, 37, 21, 19, 398, 408, 199, 204, 136, 102, 68, 51, 34, 24, 17, 397 };
    int n = 403;
    assertArrayEquals(new int[] { 1, 1, 409 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case172() {
    int[] a = { 333, 111, 37, 332, 334, 166, 167, 83, 331, 335, 67, 330, 336, 165, 168, 110, 112, 84, 66, 55, 56, 48, 42, 33, 30, 28, 24, 22, 21, 15, 14, 16, 11, 12, 8, 329, 337, 47, 328, 338, 164, 169, 82, 26, 41, 13, 327, 339, 109, 113 };
    int n = 333;
    assertArrayEquals(new int[] { 1, 1, 326 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case173() {
    int[] a = { 812, 406, 203, 116, 58, 29, 811, 813, 271, 810, 814, 405, 407, 270, 162, 135, 90, 81, 74, 54, 45, 37, 30, 15, 27, 18, 10, 809, 815, 163, 808, 816, 404, 408, 272, 202, 204, 136, 101, 102, 68, 51, 48, 34, 24, 17, 807, 817, 269, 43 };
    int n = 812;
    assertArrayEquals(new int[] { 1, 1, 806 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case174() {
    int[] a = { 1, 250, 125, 100, 50, 25, 40, 20, 10, 111, 37, 13, 167, 249, 251, 166, 83, 67, 71, 248, 252, 168, 124, 126, 84, 72, 62, 63, 56, 42, 36, 31, 28, 24, 112, 48, 21, 18, 14, 16, 12, 165, 99, 101, 55, 45, 33, 110, 66, 30 };
    int n = 1000;
    assertArrayEquals(new int[] { 3, 15, 22 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case175() {
    int[] a = { 1, 2, 50, 25, 40, 20, 10, 111, 37, 13, 83, 67, 112, 84, 56, 48, 42, 28, 24, 21, 62, 63, 36, 31, 18, 14, 16, 12, 110, 66, 55, 30, 22, 33, 15, 23, 47, 29, 82, 41, 113, 109, 85, 68, 49, 51, 35, 34, 61, 64 };
    int n = 1000;
    assertArrayEquals(new int[] { 4, 8, 32 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case176() {
    int[] a = { 1000, 500, 250, 200, 125, 100, 50, 40, 25, 20, 10, 999, 333, 143, 111, 91, 77, 37, 13, 998, 499, 501, 334, 167, 997, 59, 996, 498, 502, 332, 249, 251, 166, 83, 995, 335, 199, 201, 67, 994, 497, 503, 142, 71, 993, 331, 53, 992, 496 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1001 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case177() {
    int[] a = { 1, 2, 5, 25, 10, 111, 37, 13, 83, 112, 84, 56, 48, 42, 28, 24, 21, 62, 63, 36, 31, 18, 14, 16, 12, 110, 55, 30, 22, 15, 23, 47, 82, 41, 113, 109, 85, 20, 35, 61, 64, 32, 114, 57, 38, 19, 108, 81, 54, 27 };
    int n = 1000;
    assertArrayEquals(new int[] { 3, 7, 49 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case178() {
    int[] a = { 1, 2, 5, 10, 111, 37, 13, 83, 112, 84, 56, 48, 42, 28, 24, 21, 62, 63, 36, 31, 18, 14, 16, 12, 110, 55, 30, 22, 15, 23, 47, 82, 41, 113, 109, 85, 20, 35, 61, 64, 32, 114, 57, 38, 19, 108, 81, 54, 27, 49 };
    int n = 1000;
    assertArrayEquals(new int[] { 3, 4, 86 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case179() {
    int[] a = { 1, 2, 5, 10, 3, 13, 62, 63, 42, 36, 31, 28, 21, 18, 24, 14, 16, 12, 15, 23, 41, 35, 20, 61, 64, 32, 19, 27, 43, 22, 11, 37, 60, 65, 40, 30, 29, 34, 17, 25, 59, 66, 44, 33, 39, 38, 26, 58, 67, 45 };
    int n = 1000;
    assertArrayEquals(new int[] { 4, 4, 57 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case180() {
    int[] a = { 1, 2, 5, 10, 3, 11, 4, 28, 24, 21, 14, 18, 16, 12, 13, 20, 19, 27, 23, 15, 29, 17, 25, 22, 26, 30, 31, 32, 33, 34, 35, 9, 36, 37, 38, 39, 40, 41, 8, 42, 43, 44, 45, 46, 7, 47, 48, 49 };
    int n = 1000;
    assertArrayEquals(new int[] { 6, 6, 6 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case181() {
    int[] a = { 1, 2, 5, 10, 3, 11, 4, 28, 24, 21, 14, 18, 16, 12, 13, 20, 19, 27, 23, 15, 29, 17, 25, 22, 26, 30, 31, 32, 33, 34, 35, 9, 36, 37, 38, 39, 40, 41, 8, 42, 43, 44, 45, 46, 7, 47, 48 };
    int n = 1000;
    assertArrayEquals(new int[] { 6, 6, 49 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case182() {
    int[] a = { 1, 15 };
    int n = 90;
    assertArrayEquals(new int[] { 2, 5, 9 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case183() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    int n = 12;
    assertArrayEquals(new int[] { 51, 51, 51 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case184() {
    int[] a = { 3, 9, 27, 37, 111, 333, 999, 1000, 2, 4, 8, 10, 20, 40, 50, 100, 200, 250, 500 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1001 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case185() {
    int[] a = { 1, 2, 3 };
    int n = 1;
    assertArrayEquals(new int[] { 4, 4, 4 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case186() {
    int[] a = { 2, 4, 5, 8, 10, 20, 25, 40, 999, 1000 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1001 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case187() {
    int[] a = { 999, 1000, 2, 4, 5, 8, 10, 20, 25, 40, 50 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1001 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case188() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    int n = 1;
    assertArrayEquals(new int[] { 51, 51, 51 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case189() {
    int[] a = { 2, 3, 4, 5, 7, 8, 9, 10, 11, 13, 20, 25, 27, 37, 40, 50, 77, 91, 100, 111, 125, 143, 200, 250, 333, 500, 999, 1000 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1001 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case190() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int n = 5;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case191() {
    int[] a = { 2, 3, 4, 5, 7, 8, 9, 10, 11, 13, 20, 25, 27, 37, 40, 50, 77, 91, 100, 111, 125, 143, 200, 250, 333, 499, 500, 998, 999, 1000 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1001 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case192() {
    int[] a = { 1000, 999, 998, 2, 500, 4, 250, 8, 125, 5, 200, 10, 100, 20, 50, 25, 40 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1001 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case193() {
    int[] a = { 1, 2 };
    int n = 1000;
    assertArrayEquals(new int[] { 4, 5, 50 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case194() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    int n = 51;
    assertArrayEquals(new int[] { 51, 51, 51 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case195() {
    int[] a = { 1 };
    int n = 1;
    assertArrayEquals(new int[] { 2, 2, 2 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case196() {
    int[] a = { 1, 2, 3, 4, 5 };
    int n = 5;
    assertArrayEquals(new int[] { 6, 6, 6 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case197() {
    int[] a = { 5, 25, 125, 2, 10, 50, 250, 4, 20, 100, 500, 8, 40, 200, 1000, 999, 998, 997 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1001 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case198() {
    int[] a = {  };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1000 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case199() {
    int[] a = { 1, 2, 3, 4, 5, 6 };
    int n = 1;
    assertArrayEquals(new int[] { 7, 7, 7 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case200() {
    int[] a = { 1, 2, 4, 6, 8, 9, 14, 15, 16 };
    int n = 136;
    assertArrayEquals(new int[] { 3, 7, 7 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case201() {
    int[] a = {  };
    int n = 997;
    assertArrayEquals(new int[] { 1, 1, 997 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case202() {
    int[] a = { 1000, 999, 200, 500, 333, 111, 9, 2, 3, 4, 5, 6, 8, 7, 10, 100, 250, 20, 50, 40, 25, 499, 249, 410 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1001 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case203() {
    int[] a = { 1, 4, 6, 8, 11, 14, 17, 20, 22, 23, 25, 26, 27, 28, 30, 33, 35, 38, 100, 103, 109, 110, 120, 130, 131, 132, 135, 140, 200, 201, 205, 210, 290, 300, 400, 433, 444, 445, 460, 490, 500, 505, 509, 510, 600, 700, 800, 850, 999, 1000 };
    int n = 990;
    assertArrayEquals(new int[] { 2, 3, 165 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case204() {
    int[] a = { 1 };
    int n = 1000;
    assertArrayEquals(new int[] { 2, 2, 250 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case205() {
    int[] a = { 10, 1000, 2, 500, 4, 5, 50, 999, 3, 111, 7, 11, 13, 6, 28, 8, 9, 14, 24, 40 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1001 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case206() {
    int[] a = { 2, 4, 5, 10, 20, 25, 40, 50, 100, 125, 200, 250, 500, 999, 1000, 3, 9, 111, 333 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1001 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case207() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    int n = 23;
    assertArrayEquals(new int[] { 51, 51, 51 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case208() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    int n = 999;
    assertArrayEquals(new int[] { 51, 51, 51 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case209() {
    int[] a = { 1, 2 };
    int n = 1;
    assertArrayEquals(new int[] { 3, 3, 3 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case210() {
    int[] a = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 25, 50, 100, 200, 500, 990, 991, 992, 993, 994, 995, 996, 997, 998, 999, 1000 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1001 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case211() {
    int[] a = { 2, 4, 5, 8, 10, 20, 25, 999, 1000 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1001 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case212() {
    int[] a = { 999, 1000, 500, 250, 125, 5, 200, 25, 10, 100, 20, 50 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1001 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case213() {
    int[] a = { 12, 23, 34, 45, 56, 67, 1 };
    int n = 1000;
    assertArrayEquals(new int[] { 2, 2, 250 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case214() {
    int[] a = { 2 };
    int n = 997;
    assertArrayEquals(new int[] { 1, 1, 997 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case215() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
    int n = 1;
    assertArrayEquals(new int[] { 21, 21, 21 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case216() {
    int[] a = { 9 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1000 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case217() {
    int[] a = { 50, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49 };
    int n = 1;
    assertArrayEquals(new int[] { 51, 51, 51 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case218() {
    int[] a = { 1, 5 };
    int n = 1000;
    assertArrayEquals(new int[] { 2, 2, 250 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case219() {
    int[] a = { 1000, 2, 4, 5, 10, 20, 999, 3, 9, 8, 25 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1001 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case220() {
    int[] a = { 2, 3, 4, 5 };
    int n = 5;
    assertArrayEquals(new int[] { 1, 1, 6 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case221() {
    int[] a = { 1000, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 999, 50 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1001 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case222() {
    int[] a = { 2, 4, 5, 8, 10, 16, 20, 25, 32, 40, 50, 100, 200, 500, 998, 999, 1000 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1001 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case223() {
    int[] a = { 1, 2, 3, 4, 5 };
    int n = 1;
    assertArrayEquals(new int[] { 6, 6, 6 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case224() {
    int[] a = { 999, 1000, 2, 4, 5, 8, 10, 20, 25 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1001 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case225() {
    int[] a = { 2, 3, 4, 5, 8, 10, 20, 25, 998, 999, 1000 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1001 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case226() {
    int[] a = { 2, 3, 4 };
    int n = 4;
    assertArrayEquals(new int[] { 1, 1, 5 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case227() {
    int[] a = { 2 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1000 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case228() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    int n = 1000;
    assertArrayEquals(new int[] { 51, 51, 51 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case229() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42 };
    int n = 15;
    assertArrayEquals(new int[] { 43, 43, 43 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case230() {
    int[] a = {  };
    int n = 1;
    assertArrayEquals(new int[] { 1, 1, 1 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case231() {
    int[] a = { 32, 31, 33, 56, 44, 43 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1000 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case232() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int n = 50;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case233() {
    int[] a = { 2, 3 };
    int n = 900;
    assertArrayEquals(new int[] { 1, 1, 900 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case234() {
    int[] a = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1000 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case235() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48 };
    int n = 913;
    assertArrayEquals(new int[] { 49, 49, 49 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case236() {
    int[] a = { 5, 25, 125, 10, 50, 250, 20, 100, 500, 40, 200, 1000, 2, 4, 8, 999, 998, 997 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1001 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case237() {
    int[] a = { 1, 2, 4, 5, 8, 10, 20, 25, 40, 50, 100, 125, 200, 500, 1000, 250, 9, 11 };
    int n = 1000;
    assertArrayEquals(new int[] { 3, 3, 111 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case238() {
    int[] a = { 1, 2, 3, 4, 5 };
    int n = 2;
    assertArrayEquals(new int[] { 6, 6, 6 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case239() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    int n = 50;
    assertArrayEquals(new int[] { 51, 51, 51 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case240() {
    int[] a = { 999, 1000, 500, 250, 125, 200, 100, 50, 25, 40, 20, 10, 5, 8, 4, 2 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1001 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case241() {
    int[] a = { 1000, 2, 4, 5, 8, 10, 50, 25, 999 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1001 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case242() {
    int[] a = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 24, 27, 28, 37, 40, 50, 111, 500, 998, 999, 1000 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1001 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case243() {
    int[] a = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99 };
    int n = 1000;
    assertArrayEquals(new int[] { 2, 2, 250 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case244() {
    int[] a = { 1000, 999, 998, 500, 250, 125, 200, 100, 50, 25, 20, 40, 10 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1001 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case245() {
    int[] a = { 1, 2, 3, 4 };
    int n = 3;
    assertArrayEquals(new int[] { 5, 5, 5 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case246() {
    int[] a = { 1, 15 };
    int n = 1000;
    assertArrayEquals(new int[] { 2, 2, 250 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case247() {
    int[] a = { 2, 3, 4, 5, 7, 8, 10, 20, 25, 40, 999, 1000 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1001 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case248() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    int n = 997;
    assertArrayEquals(new int[] { 51, 51, 51 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case249() {
    int[] a = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    int n = 107;
    assertArrayEquals(new int[] { 1, 1, 107 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case250() {
    int[] a = { 10, 50, 20, 25, 5, 2, 4, 100, 1000, 1, 3, 33, 200, 500, 40, 6, 7, 8, 9, 12, 14, 16, 18, 30, 60, 70, 80, 90, 110, 120, 130, 41, 42, 43, 44, 45, 46, 47, 48, 49, 51, 52, 53, 54, 55, 56, 57, 58 };
    int n = 1000;
    assertArrayEquals(new int[] { 11, 11, 11 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case251() {
    int[] a = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 997, 998, 999, 1000 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1001 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case252() {
    int[] a = { 2, 15 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1000 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case253() {
    int[] a = { 2, 3 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1000 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case254() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
    int n = 100;
    assertArrayEquals(new int[] { 16, 16, 16 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case255() {
    int[] a = { 2, 5, 10, 100, 20, 50, 500, 250, 4, 8, 125, 3, 111, 37, 999, 333, 1000, 40 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1001 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case256() {
    int[] a = { 1, 2, 3, 4 };
    int n = 1;
    assertArrayEquals(new int[] { 5, 5, 5 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case257() {
    int[] a = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 1000, 999, 998, 997, 996, 995, 994, 993, 992, 991, 990 };
    int n = 997;
    assertArrayEquals(new int[] { 1, 1, 1001 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case258() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    int n = 10;
    assertArrayEquals(new int[] { 51, 51, 51 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case259() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int n = 1;
    assertArrayEquals(new int[] { 10, 10, 10 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case260() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    int n = 40;
    assertArrayEquals(new int[] { 51, 51, 51 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case261() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    int n = 3;
    assertArrayEquals(new int[] { 51, 51, 51 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case262() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
    int n = 1000;
    assertArrayEquals(new int[] { 12, 12, 12 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case263() {
    int[] a = { 3, 9, 27, 81, 999, 1000, 2, 4, 5, 8, 10, 20, 25 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1001 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case264() {
    int[] a = { 2, 4, 8, 10, 20, 25, 40, 50, 100, 200, 250, 500, 125, 1000, 5, 999 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1001 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case265() {
    int[] a = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99 };
    int n = 999;
    assertArrayEquals(new int[] { 2, 2, 250 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case266() {
    int[] a = {  };
    int n = 100;
    assertArrayEquals(new int[] { 1, 1, 100 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case267() {
    int[] a = { 19, 101, 990, 11, 17, 555, 10, 29, 114, 325, 879, 998, 333, 55, 598, 15, 5, 558, 222, 9, 1, 578, 22, 99, 345, 85, 25, 80, 700, 499, 100, 1000, 2, 546, 88, 235, 777, 77, 7, 377, 645, 125, 444, 945, 66, 678, 934, 76, 766, 81 };
    int n = 998;
    assertArrayEquals(new int[] { 3, 3, 111 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case268() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
    int n = 1;
    assertArrayEquals(new int[] { 26, 26, 26 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case269() {
    int[] a = { 3, 4, 1, 2, 5, 6 };
    int n = 5;
    assertArrayEquals(new int[] { 7, 7, 7 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case270() {
    int[] a = { 1, 997 };
    int n = 997;
    assertArrayEquals(new int[] { 2, 2, 249 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case271() {
    int[] a = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 994, 995, 996, 997, 998, 999, 1000 };
    int n = 998;
    assertArrayEquals(new int[] { 1, 1, 1001 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case272() {
    int[] a = { 3, 4, 1, 2, 5, 6, 7, 8, 9, 10, 11 };
    int n = 5;
    assertArrayEquals(new int[] { 12, 12, 12 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case273() {
    int[] a = { 5, 25, 125, 10, 50, 250, 20, 100, 500, 40, 200, 998, 999, 1000 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1001 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case274() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
    int n = 10;
    assertArrayEquals(new int[] { 26, 26, 26 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case275() {
    int[] a = { 999 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1000 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case276() {
    int[] a = { 1000, 999, 998, 997, 996, 995, 994, 566, 234, 233, 111, 2, 3, 444, 555, 666, 777, 888, 902, 22, 33, 44, 55, 66, 77, 88, 99, 13, 24, 463, 574, 687, 98, 37, 58, 69, 73, 96, 933, 76, 54, 988, 65, 43, 21 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 4, 250 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case277() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    int n = 47;
    assertArrayEquals(new int[] { 51, 51, 51 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case278() {
    int[] a = { 12, 13 };
    int n = 13;
    assertArrayEquals(new int[] { 1, 1, 14 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case279() {
    int[] a = {  };
    int n = 720;
    assertArrayEquals(new int[] { 1, 1, 720 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case280() {
    int[] a = { 200, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49 };
    int n = 1000;
    assertArrayEquals(new int[] { 50, 50, 50 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case281() {
    int[] a = { 2, 4, 5, 8, 10, 20, 25, 40, 50, 100, 125, 200, 250, 500, 1000, 3, 9, 111, 333, 999, 7, 11, 13 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1001 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case282() {
    int[] a = { 2, 3, 4, 5, 8, 9, 10, 20, 25, 27, 37, 40, 50, 100, 111, 125, 200, 250, 333, 500, 999, 1000, 7, 11, 13 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1001 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case283() {
    int[] a = { 2, 4, 3 };
    int n = 4;
    assertArrayEquals(new int[] { 1, 1, 5 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case284() {
    int[] a = { 999, 5, 25, 125, 2, 10, 50, 250, 4, 20, 100, 500, 8, 40, 200, 1000 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 1, 1001 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case285() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 20, 25, 27, 37, 40, 50, 77, 91, 100, 111, 125, 143, 167, 200, 250, 333, 334, 499, 500, 501, 997, 998, 999, 1000 };
    int n = 1000;
    assertArrayEquals(new int[] { 12, 12, 12 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case286() {
    int[] a = { 1000 };
    int n = 1000;
    assertArrayEquals(new int[] { 1, 2, 500 }, avoidingproduct.getTriple(a, n));
  }

  @Test
  public void case287() {
    int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 16, 32, 64, 128, 256, 512, 11, 12, 13, 14, 15, 17, 18, 19, 20, 21, 22, 23, 34, 25, 26, 27, 28, 29, 30, 31, 51, 33, 340, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45 };
    int n = 512;
    assertArrayEquals(new int[] { 24, 24, 24 }, avoidingproduct.getTriple(a, n));
  }

}
