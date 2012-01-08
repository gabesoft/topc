package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class PowerDigitTest {
  PowerDigit powerdigit = new PowerDigit();

  @Test
  public void case1() {
    int x = 2;
    int y = 10;
    int k = 1;
    assertEquals(2, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case2() {
    int x = 2;
    int y = 10;
    int k = 4;
    assertEquals(-1, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case3() {
    int x = 2;
    int y = 1000;
    int k = 0;
    assertEquals(6, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case4() {
    int x = 10;
    int y = 2;
    int k = 1;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case5() {
    int x = 10;
    int y = 10;
    int k = 1;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case6() {
    int x = 10000;
    int y = 10000;
    int k = 4;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case7() {
    int x = 9999;
    int y = 10000;
    int k = 4;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case8() {
    int x = 0;
    int y = 969;
    int k = 0;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case9() {
    int x = 0;
    int y = 969;
    int k = 1;
    assertEquals(-1, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case10() {
    int x = 3;
    int y = 5;
    int k = 2;
    assertEquals(2, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case11() {
    int x = 3;
    int y = 5;
    int k = 3;
    assertEquals(-1, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case12() {
    int x = 9731;
    int y = 1;
    int k = 4;
    assertEquals(-1, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case13() {
    int x = 9731;
    int y = 1;
    int k = 3;
    assertEquals(9, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case14() {
    int x = 6782;
    int y = 7891;
    int k = 0;
    assertEquals(8, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case15() {
    int x = 6782;
    int y = 5555;
    int k = 3;
    assertEquals(5, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case16() {
    int x = 1005;
    int y = 2;
    int k = 3;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case17() {
    int x = 2102;
    int y = 3360;
    int k = 1;
    assertEquals(7, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case18() {
    int x = 6951;
    int y = 8535;
    int k = 3;
    assertEquals(5, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case19() {
    int x = 5131;
    int y = 6864;
    int k = 2;
    assertEquals(7, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case20() {
    int x = 5734;
    int y = 5777;
    int k = 0;
    assertEquals(4, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case21() {
    int x = 3478;
    int y = 8042;
    int k = 4;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case22() {
    int x = 9316;
    int y = 2275;
    int k = 3;
    assertEquals(5, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case23() {
    int x = 4244;
    int y = 3862;
    int k = 2;
    assertEquals(3, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case24() {
    int x = 9982;
    int y = 4435;
    int k = 4;
    assertEquals(2, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case25() {
    int x = 9019;
    int y = 75;
    int k = 0;
    assertEquals(9, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case26() {
    int x = 6316;
    int y = 7358;
    int k = 2;
    assertEquals(6, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case27() {
    int x = 9991;
    int y = 4534;
    int k = 1;
    assertEquals(6, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case28() {
    int x = 6132;
    int y = 4186;
    int k = 2;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case29() {
    int x = 4622;
    int y = 1776;
    int k = 3;
    assertEquals(9, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case30() {
    int x = 3965;
    int y = 3532;
    int k = 4;
    assertEquals(4, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case31() {
    int x = 1776;
    int y = 7006;
    int k = 3;
    assertEquals(3, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case32() {
    int x = 475;
    int y = 7758;
    int k = 0;
    assertEquals(5, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case33() {
    int x = 5363;
    int y = 6584;
    int k = 1;
    assertEquals(6, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case34() {
    int x = 5736;
    int y = 2844;
    int k = 2;
    assertEquals(8, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case35() {
    int x = 8139;
    int y = 8268;
    int k = 4;
    assertEquals(6, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case36() {
    int x = 4768;
    int y = 2331;
    int k = 0;
    assertEquals(2, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case37() {
    int x = 7129;
    int y = 8541;
    int k = 1;
    assertEquals(2, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case38() {
    int x = 4505;
    int y = 9203;
    int k = 4;
    assertEquals(1, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case39() {
    int x = 7788;
    int y = 8919;
    int k = 1;
    assertEquals(5, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case40() {
    int x = 2188;
    int y = 8354;
    int k = 4;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case41() {
    int x = 6801;
    int y = 7403;
    int k = 2;
    assertEquals(4, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case42() {
    int x = 8307;
    int y = 6544;
    int k = 2;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case43() {
    int x = 8053;
    int y = 8470;
    int k = 3;
    assertEquals(5, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case44() {
    int x = 6886;
    int y = 6404;
    int k = 3;
    assertEquals(8, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case45() {
    int x = 1940;
    int y = 9633;
    int k = 2;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case46() {
    int x = 7734;
    int y = 6324;
    int k = 4;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case47() {
    int x = 134;
    int y = 2789;
    int k = 0;
    assertEquals(4, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case48() {
    int x = 62;
    int y = 9236;
    int k = 1;
    assertEquals(1, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case49() {
    int x = 9157;
    int y = 5789;
    int k = 0;
    assertEquals(7, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case50() {
    int x = 4148;
    int y = 5620;
    int k = 4;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case51() {
    int x = 4249;
    int y = 2810;
    int k = 1;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case52() {
    int x = 8835;
    int y = 9696;
    int k = 4;
    assertEquals(9, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case53() {
    int x = 351;
    int y = 9837;
    int k = 2;
    assertEquals(9, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case54() {
    int x = 128;
    int y = 117;
    int k = 1;
    assertEquals(8, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case55() {
    int x = 4529;
    int y = 9087;
    int k = 0;
    assertEquals(9, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case56() {
    int x = 295;
    int y = 7924;
    int k = 4;
    assertEquals(9, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case57() {
    int x = 5155;
    int y = 5512;
    int k = 3;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case58() {
    int x = 9978;
    int y = 9516;
    int k = 1;
    assertEquals(9, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case59() {
    int x = 8256;
    int y = 1522;
    int k = 4;
    assertEquals(5, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case60() {
    int x = 9234;
    int y = 8259;
    int k = 2;
    assertEquals(2, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case61() {
    int x = 8815;
    int y = 6259;
    int k = 2;
    assertEquals(3, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case62() {
    int x = 7583;
    int y = 1912;
    int k = 2;
    assertEquals(1, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case63() {
    int x = 2899;
    int y = 8961;
    int k = 4;
    assertEquals(8, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case64() {
    int x = 740;
    int y = 6987;
    int k = 0;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case65() {
    int x = 2709;
    int y = 3993;
    int k = 2;
    assertEquals(2, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case66() {
    int x = 1737;
    int y = 2278;
    int k = 4;
    assertEquals(4, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case67() {
    int x = 8395;
    int y = 9049;
    int k = 1;
    assertEquals(7, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case68() {
    int x = 5764;
    int y = 60;
    int k = 3;
    assertEquals(2, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case69() {
    int x = 7134;
    int y = 2203;
    int k = 0;
    assertEquals(4, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case70() {
    int x = 1372;
    int y = 7384;
    int k = 3;
    assertEquals(5, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case71() {
    int x = 6321;
    int y = 2500;
    int k = 1;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case72() {
    int x = 4626;
    int y = 1821;
    int k = 2;
    assertEquals(3, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case73() {
    int x = 8807;
    int y = 1085;
    int k = 1;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case74() {
    int x = 2919;
    int y = 8794;
    int k = 3;
    assertEquals(3, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case75() {
    int x = 5052;
    int y = 8938;
    int k = 0;
    assertEquals(4, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case76() {
    int x = 3023;
    int y = 2163;
    int k = 4;
    assertEquals(6, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case77() {
    int x = 7985;
    int y = 9753;
    int k = 4;
    assertEquals(4, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case78() {
    int x = 5760;
    int y = 2906;
    int k = 1;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case79() {
    int x = 2158;
    int y = 1192;
    int k = 3;
    assertEquals(6, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case80() {
    int x = 6742;
    int y = 4278;
    int k = 1;
    assertEquals(8, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case81() {
    int x = 3348;
    int y = 5573;
    int k = 4;
    assertEquals(2, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case82() {
    int x = 412;
    int y = 266;
    int k = 1;
    assertEquals(8, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case83() {
    int x = 6358;
    int y = 3077;
    int k = 2;
    assertEquals(8, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case84() {
    int x = 5917;
    int y = 7146;
    int k = 3;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case85() {
    int x = 5367;
    int y = 3800;
    int k = 3;
    assertEquals(4, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case86() {
    int x = 5853;
    int y = 1005;
    int k = 4;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case87() {
    int x = 0;
    int y = 10;
    int k = 0;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case88() {
    int x = 0;
    int y = 1;
    int k = 0;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case89() {
    int x = 0;
    int y = 10000;
    int k = 4;
    assertEquals(-1, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case90() {
    int x = 0;
    int y = 2;
    int k = 0;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case91() {
    int x = 0;
    int y = 666;
    int k = 0;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case92() {
    int x = 0;
    int y = 5;
    int k = 0;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case93() {
    int x = 0;
    int y = 10000;
    int k = 0;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case94() {
    int x = 2;
    int y = 20;
    int k = 4;
    assertEquals(4, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case95() {
    int x = 9;
    int y = 1;
    int k = 0;
    assertEquals(9, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case96() {
    int x = 0;
    int y = 100;
    int k = 0;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case97() {
    int x = 10000;
    int y = 10000;
    int k = 4;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case98() {
    int x = 10000;
    int y = 1;
    int k = 4;
    assertEquals(1, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case99() {
    int x = 0;
    int y = 1000;
    int k = 0;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case100() {
    int x = 0;
    int y = 3;
    int k = 0;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case101() {
    int x = 10;
    int y = 10000;
    int k = 1;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case102() {
    int x = 0;
    int y = 1000;
    int k = 4;
    assertEquals(-1, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case103() {
    int x = 0;
    int y = 7;
    int k = 0;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case104() {
    int x = 100;
    int y = 1;
    int k = 2;
    assertEquals(1, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case105() {
    int x = 1000;
    int y = 2;
    int k = 4;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case106() {
    int x = 9997;
    int y = 9999;
    int k = 3;
    assertEquals(3, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case107() {
    int x = 10;
    int y = 2;
    int k = 2;
    assertEquals(1, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case108() {
    int x = 10;
    int y = 1;
    int k = 1;
    assertEquals(1, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case109() {
    int x = 0;
    int y = 10;
    int k = 4;
    assertEquals(-1, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case110() {
    int x = 5330;
    int y = 6874;
    int k = 4;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case111() {
    int x = 999;
    int y = 1;
    int k = 3;
    assertEquals(-1, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case112() {
    int x = 10;
    int y = 4;
    int k = 4;
    assertEquals(1, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case113() {
    int x = 2;
    int y = 16;
    int k = 4;
    assertEquals(6, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case114() {
    int x = 1000;
    int y = 10000;
    int k = 4;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case115() {
    int x = 4847;
    int y = 9909;
    int k = 4;
    assertEquals(1, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case116() {
    int x = 10000;
    int y = 1;
    int k = 1;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case117() {
    int x = 100;
    int y = 8;
    int k = 4;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case118() {
    int x = 10;
    int y = 3;
    int k = 0;
    assertEquals(0, powerdigit.digitK(x, y, k));
  }

  @Test
  public void case119() {
    int x = 1817;
    int y = 1808;
    int k = 4;
    assertEquals(5, powerdigit.digitK(x, y, k));
  }

}
