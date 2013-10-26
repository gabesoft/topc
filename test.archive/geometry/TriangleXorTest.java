package topc.test.geometry;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.geometry.*;

public class TriangleXorTest {
  TriangleXor trianglexor = new TriangleXor();

  @Test
  public void case1() {
    int W = 1;
    assertEquals(0, trianglexor.theArea(W));
  }

  @Test
  public void case2() {
    int W = 2;
    assertEquals(1, trianglexor.theArea(W));
  }

  @Test
  public void case3() {
    int W = 3;
    assertEquals(1, trianglexor.theArea(W));
  }

  @Test
  public void case4() {
    int W = 4;
    assertEquals(2, trianglexor.theArea(W));
  }

  @Test
  public void case5() {
    int W = 12345;
    assertEquals(4629, trianglexor.theArea(W));
  }

  @Test
  public void case6() {
    int W = 5;
    assertEquals(2, trianglexor.theArea(W));
  }

  @Test
  public void case7() {
    int W = 6;
    assertEquals(3, trianglexor.theArea(W));
  }

  @Test
  public void case8() {
    int W = 7;
    assertEquals(2, trianglexor.theArea(W));
  }

  @Test
  public void case9() {
    int W = 8;
    assertEquals(5, trianglexor.theArea(W));
  }

  @Test
  public void case10() {
    int W = 9;
    assertEquals(3, trianglexor.theArea(W));
  }

  @Test
  public void case11() {
    int W = 10;
    assertEquals(6, trianglexor.theArea(W));
  }

  @Test
  public void case12() {
    int W = 11;
    assertEquals(4, trianglexor.theArea(W));
  }

  @Test
  public void case13() {
    int W = 12;
    assertEquals(7, trianglexor.theArea(W));
  }

  @Test
  public void case14() {
    int W = 13;
    assertEquals(5, trianglexor.theArea(W));
  }

  @Test
  public void case15() {
    int W = 126;
    assertEquals(78, trianglexor.theArea(W));
  }

  @Test
  public void case16() {
    int W = 129;
    assertEquals(48, trianglexor.theArea(W));
  }

  @Test
  public void case17() {
    int W = 247;
    assertEquals(92, trianglexor.theArea(W));
  }

  @Test
  public void case18() {
    int W = 128;
    assertEquals(80, trianglexor.theArea(W));
  }

  @Test
  public void case19() {
    int W = 192;
    assertEquals(120, trianglexor.theArea(W));
  }

  @Test
  public void case20() {
    int W = 165;
    assertEquals(62, trianglexor.theArea(W));
  }

  @Test
  public void case21() {
    int W = 181;
    assertEquals(68, trianglexor.theArea(W));
  }

  @Test
  public void case22() {
    int W = 109;
    assertEquals(41, trianglexor.theArea(W));
  }

  @Test
  public void case23() {
    int W = 239;
    assertEquals(89, trianglexor.theArea(W));
  }

  @Test
  public void case24() {
    int W = 176;
    assertEquals(110, trianglexor.theArea(W));
  }

  @Test
  public void case25() {
    int W = 62678;
    assertEquals(39173, trianglexor.theArea(W));
  }

  @Test
  public void case26() {
    int W = 52183;
    assertEquals(19568, trianglexor.theArea(W));
  }

  @Test
  public void case27() {
    int W = 54773;
    assertEquals(20540, trianglexor.theArea(W));
  }

  @Test
  public void case28() {
    int W = 50991;
    assertEquals(19121, trianglexor.theArea(W));
  }

  @Test
  public void case29() {
    int W = 61545;
    assertEquals(23079, trianglexor.theArea(W));
  }

  @Test
  public void case30() {
    int W = 67741;
    assertEquals(25403, trianglexor.theArea(W));
  }

  @Test
  public void case31() {
    int W = 55859;
    assertEquals(20947, trianglexor.theArea(W));
  }

  @Test
  public void case32() {
    int W = 68053;
    assertEquals(25520, trianglexor.theArea(W));
  }

  @Test
  public void case33() {
    int W = 57781;
    assertEquals(21668, trianglexor.theArea(W));
  }

  @Test
  public void case34() {
    int W = 50892;
    assertEquals(31807, trianglexor.theArea(W));
  }

  @Test
  public void case35() {
    int W = 70000;
    assertEquals(43750, trianglexor.theArea(W));
  }

  @Test
  public void case36() {
    int W = 69999;
    assertEquals(26249, trianglexor.theArea(W));
  }

  @Test
  public void case37() {
    int W = 69998;
    assertEquals(43748, trianglexor.theArea(W));
  }

  @Test
  public void case38() {
    int W = 69997;
    assertEquals(26249, trianglexor.theArea(W));
  }

  @Test
  public void case39() {
    int W = 69996;
    assertEquals(43747, trianglexor.theArea(W));
  }

  @Test
  public void case40() {
    int W = 69995;
    assertEquals(26248, trianglexor.theArea(W));
  }

  @Test
  public void case41() {
    int W = 69994;
    assertEquals(43746, trianglexor.theArea(W));
  }

  @Test
  public void case42() {
    int W = 69993;
    assertEquals(26247, trianglexor.theArea(W));
  }

  @Test
  public void case43() {
    int W = 9934;
    assertEquals(6208, trianglexor.theArea(W));
  }

  @Test
  public void case44() {
    int W = 27635;
    assertEquals(10363, trianglexor.theArea(W));
  }

  @Test
  public void case45() {
    int W = 37533;
    assertEquals(14075, trianglexor.theArea(W));
  }

  @Test
  public void case46() {
    int W = 66823;
    assertEquals(25058, trianglexor.theArea(W));
  }

  @Test
  public void case47() {
    int W = 46636;
    assertEquals(29147, trianglexor.theArea(W));
  }

  @Test
  public void case48() {
    int W = 59791;
    assertEquals(22421, trianglexor.theArea(W));
  }

  @Test
  public void case49() {
    int W = 20256;
    assertEquals(12660, trianglexor.theArea(W));
  }

  @Test
  public void case50() {
    int W = 11160;
    assertEquals(6975, trianglexor.theArea(W));
  }

  @Test
  public void case51() {
    int W = 44448;
    assertEquals(27780, trianglexor.theArea(W));
  }

  @Test
  public void case52() {
    int W = 48882;
    assertEquals(30551, trianglexor.theArea(W));
  }

  @Test
  public void case53() {
    int W = 38098;
    assertEquals(23811, trianglexor.theArea(W));
  }

  @Test
  public void case54() {
    int W = 17056;
    assertEquals(10660, trianglexor.theArea(W));
  }

  @Test
  public void case55() {
    int W = 63804;
    assertEquals(39877, trianglexor.theArea(W));
  }

  @Test
  public void case56() {
    int W = 66666;
    assertEquals(41666, trianglexor.theArea(W));
  }

  @Test
  public void case57() {
    int W = 29997;
    assertEquals(11249, trianglexor.theArea(W));
  }

  @Test
  public void case58() {
    int W = 69977;
    assertEquals(26241, trianglexor.theArea(W));
  }

  @Test
  public void case59() {
    int W = 1000;
    assertEquals(625, trianglexor.theArea(W));
  }

  @Test
  public void case60() {
    int W = 56789;
    assertEquals(21296, trianglexor.theArea(W));
  }

}
