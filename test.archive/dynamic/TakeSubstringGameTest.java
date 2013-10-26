package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class TakeSubstringGameTest {
  TakeSubstringGame takesubstringgame = new TakeSubstringGame();

  @Test
  public void case1() {
    int n = 5;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case2() {
    int n = 10;
    assertEquals(1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case3() {
    int n = 17;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case4() {
    int n = 239;
    assertEquals(9, takesubstringgame.winningMove(n));
  }

  @Test
  public void case5() {
    int n = 566;
    assertEquals(66, takesubstringgame.winningMove(n));
  }

  @Test
  public void case6() {
    int n = 23900;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case7() {
    int n = 1;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case8() {
    int n = 2;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case9() {
    int n = 6;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case10() {
    int n = 8;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case11() {
    int n = 9;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case12() {
    int n = 11;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case13() {
    int n = 12;
    assertEquals(1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case14() {
    int n = 18;
    assertEquals(1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case15() {
    int n = 19;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case16() {
    int n = 20;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case17() {
    int n = 21;
    assertEquals(1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case18() {
    int n = 50;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case19() {
    int n = 64;
    assertEquals(4, takesubstringgame.winningMove(n));
  }

  @Test
  public void case20() {
    int n = 99;
    assertEquals(9, takesubstringgame.winningMove(n));
  }

  @Test
  public void case21() {
    int n = 100;
    assertEquals(10, takesubstringgame.winningMove(n));
  }

  @Test
  public void case22() {
    int n = 101;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case23() {
    int n = 110;
    assertEquals(1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case24() {
    int n = 131;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case25() {
    int n = 133;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case26() {
    int n = 176;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case27() {
    int n = 178;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case28() {
    int n = 200;
    assertEquals(2, takesubstringgame.winningMove(n));
  }

  @Test
  public void case29() {
    int n = 203;
    assertEquals(20, takesubstringgame.winningMove(n));
  }

  @Test
  public void case30() {
    int n = 239;
    assertEquals(9, takesubstringgame.winningMove(n));
  }

  @Test
  public void case31() {
    int n = 241;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case32() {
    int n = 243;
    assertEquals(2, takesubstringgame.winningMove(n));
  }

  @Test
  public void case33() {
    int n = 362;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case34() {
    int n = 365;
    assertEquals(3, takesubstringgame.winningMove(n));
  }

  @Test
  public void case35() {
    int n = 367;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case36() {
    int n = 369;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case37() {
    int n = 400;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case38() {
    int n = 555;
    assertEquals(55, takesubstringgame.winningMove(n));
  }

  @Test
  public void case39() {
    int n = 600;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case40() {
    int n = 987;
    assertEquals(87, takesubstringgame.winningMove(n));
  }

  @Test
  public void case41() {
    int n = 1000;
    assertEquals(100, takesubstringgame.winningMove(n));
  }

  @Test
  public void case42() {
    int n = 1098;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case43() {
    int n = 1100;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case44() {
    int n = 2007;
    assertEquals(2, takesubstringgame.winningMove(n));
  }

  @Test
  public void case45() {
    int n = 3316;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case46() {
    int n = 3323;
    assertEquals(33, takesubstringgame.winningMove(n));
  }

  @Test
  public void case47() {
    int n = 3324;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case48() {
    int n = 5660;
    assertEquals(660, takesubstringgame.winningMove(n));
  }

  @Test
  public void case49() {
    int n = 9999;
    assertEquals(999, takesubstringgame.winningMove(n));
  }

  @Test
  public void case50() {
    int n = 10000;
    assertEquals(1000, takesubstringgame.winningMove(n));
  }

  @Test
  public void case51() {
    int n = 10532;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case52() {
    int n = 26830;
    assertEquals(68, takesubstringgame.winningMove(n));
  }

  @Test
  public void case53() {
    int n = 26832;
    assertEquals(26, takesubstringgame.winningMove(n));
  }

  @Test
  public void case54() {
    int n = 26834;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case55() {
    int n = 26836;
    assertEquals(2, takesubstringgame.winningMove(n));
  }

  @Test
  public void case56() {
    int n = 26838;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case57() {
    int n = 60708;
    assertEquals(708, takesubstringgame.winningMove(n));
  }

  @Test
  public void case58() {
    int n = 100096;
    assertEquals(9, takesubstringgame.winningMove(n));
  }

  @Test
  public void case59() {
    int n = 100098;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case60() {
    int n = 100102;
    assertEquals(2, takesubstringgame.winningMove(n));
  }

  @Test
  public void case61() {
    int n = 111046;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case62() {
    int n = 111048;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case63() {
    int n = 142962;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case64() {
    int n = 142968;
    assertEquals(6, takesubstringgame.winningMove(n));
  }

  @Test
  public void case65() {
    int n = 146238;
    assertEquals(238, takesubstringgame.winningMove(n));
  }

  @Test
  public void case66() {
    int n = 147238;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case67() {
    int n = 149876;
    assertEquals(6, takesubstringgame.winningMove(n));
  }

  @Test
  public void case68() {
    int n = 173737;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case69() {
    int n = 183222;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case70() {
    int n = 239519;
    assertEquals(519, takesubstringgame.winningMove(n));
  }

  @Test
  public void case71() {
    int n = 308443;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case72() {
    int n = 341095;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case73() {
    int n = 375375;
    assertEquals(375, takesubstringgame.winningMove(n));
  }

  @Test
  public void case74() {
    int n = 398765;
    assertEquals(8765, takesubstringgame.winningMove(n));
  }

  @Test
  public void case75() {
    int n = 400000;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case76() {
    int n = 566239;
    assertEquals(66239, takesubstringgame.winningMove(n));
  }

  @Test
  public void case77() {
    int n = 700050;
    assertEquals(50, takesubstringgame.winningMove(n));
  }

  @Test
  public void case78() {
    int n = 702000;
    assertEquals(2000, takesubstringgame.winningMove(n));
  }

  @Test
  public void case79() {
    int n = 777777;
    assertEquals(77777, takesubstringgame.winningMove(n));
  }

  @Test
  public void case80() {
    int n = 800000;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case81() {
    int n = 898989;
    assertEquals(98989, takesubstringgame.winningMove(n));
  }

  @Test
  public void case82() {
    int n = 900000;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case83() {
    int n = 901010;
    assertEquals(1010, takesubstringgame.winningMove(n));
  }

  @Test
  public void case84() {
    int n = 987654;
    assertEquals(87654, takesubstringgame.winningMove(n));
  }

  @Test
  public void case85() {
    int n = 997755;
    assertEquals(97755, takesubstringgame.winningMove(n));
  }

  @Test
  public void case86() {
    int n = 999971;
    assertEquals(99971, takesubstringgame.winningMove(n));
  }

  @Test
  public void case87() {
    int n = 999996;
    assertEquals(99996, takesubstringgame.winningMove(n));
  }

  @Test
  public void case88() {
    int n = 999999;
    assertEquals(99999, takesubstringgame.winningMove(n));
  }

  @Test
  public void case89() {
    int n = 1000000;
    assertEquals(100000, takesubstringgame.winningMove(n));
  }

  @Test
  public void case90() {
    int n = 54215;
    assertEquals(4215, takesubstringgame.winningMove(n));
  }

  @Test
  public void case91() {
    int n = 979539;
    assertEquals(79539, takesubstringgame.winningMove(n));
  }

  @Test
  public void case92() {
    int n = 939959;
    assertEquals(39959, takesubstringgame.winningMove(n));
  }

  @Test
  public void case93() {
    int n = 101037;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

  @Test
  public void case94() {
    int n = 555555;
    assertEquals(55555, takesubstringgame.winningMove(n));
  }

  @Test
  public void case95() {
    int n = 999990;
    assertEquals(99990, takesubstringgame.winningMove(n));
  }

  @Test
  public void case96() {
    int n = 100001;
    assertEquals(-1, takesubstringgame.winningMove(n));
  }

}
