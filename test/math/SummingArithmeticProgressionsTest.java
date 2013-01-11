package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class SummingArithmeticProgressionsTest {
  SummingArithmeticProgressions summingarithmeticprogressions = new SummingArithmeticProgressions();

  @Test
  public void case1() {
    int left = 1;
    int right = 12;
    int k = 3;
    assertEquals(3, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case2() {
    int left = 1;
    int right = 10;
    int k = 2;
    assertEquals(8, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case3() {
    int left = 20;
    int right = 30;
    int k = 4;
    assertEquals(6, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case4() {
    int left = 1;
    int right = 9;
    int k = 4;
    assertEquals(0, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case5() {
    int left = 1;
    int right = 13;
    int k = 4;
    assertEquals(1, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case6() {
    int left = 1;
    int right = 1;
    int k = 2;
    assertEquals(0, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case7() {
    int left = 1;
    int right = 2;
    int k = 2;
    assertEquals(0, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case8() {
    int left = 1;
    int right = 3;
    int k = 2;
    assertEquals(1, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case9() {
    int left = 1;
    int right = 4;
    int k = 2;
    assertEquals(2, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case10() {
    int left = 1;
    int right = 5;
    int k = 2;
    assertEquals(3, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case11() {
    int left = 1;
    int right = 6;
    int k = 2;
    assertEquals(4, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case12() {
    int left = 1;
    int right = 1;
    int k = 3;
    assertEquals(0, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case13() {
    int left = 1;
    int right = 2;
    int k = 3;
    assertEquals(0, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case14() {
    int left = 1;
    int right = 3;
    int k = 3;
    assertEquals(0, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case15() {
    int left = 1;
    int right = 4;
    int k = 3;
    assertEquals(0, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case16() {
    int left = 1;
    int right = 5;
    int k = 3;
    assertEquals(0, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case17() {
    int left = 1;
    int right = 6;
    int k = 3;
    assertEquals(1, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case18() {
    int left = 1;
    int right = 7;
    int k = 3;
    assertEquals(1, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case19() {
    int left = 1;
    int right = 8;
    int k = 3;
    assertEquals(1, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case20() {
    int left = 1;
    int right = 9;
    int k = 3;
    assertEquals(2, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case21() {
    int left = 1;
    int right = 10;
    int k = 3;
    assertEquals(2, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case22() {
    int left = 1;
    int right = 11;
    int k = 3;
    assertEquals(2, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case23() {
    int left = 1;
    int right = 12;
    int k = 3;
    assertEquals(3, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case24() {
    int left = 1;
    int right = 10;
    int k = 4;
    assertEquals(1, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case25() {
    int left = 1;
    int right = 11;
    int k = 4;
    assertEquals(1, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case26() {
    int left = 1;
    int right = 12;
    int k = 4;
    assertEquals(1, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case27() {
    int left = 1;
    int right = 13;
    int k = 4;
    assertEquals(1, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case28() {
    int left = 1;
    int right = 14;
    int k = 4;
    assertEquals(2, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case29() {
    int left = 1;
    int right = 15;
    int k = 4;
    assertEquals(2, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case30() {
    int left = 1;
    int right = 16;
    int k = 4;
    assertEquals(3, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case31() {
    int left = 1;
    int right = 17;
    int k = 4;
    assertEquals(3, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case32() {
    int left = 1;
    int right = 18;
    int k = 4;
    assertEquals(4, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case33() {
    int left = 1;
    int right = 19;
    int k = 4;
    assertEquals(4, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case34() {
    int left = 1;
    int right = 10;
    int k = 5;
    assertEquals(0, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case35() {
    int left = 1;
    int right = 11;
    int k = 5;
    assertEquals(0, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case36() {
    int left = 1;
    int right = 12;
    int k = 5;
    assertEquals(0, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case37() {
    int left = 1;
    int right = 13;
    int k = 5;
    assertEquals(0, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case38() {
    int left = 1;
    int right = 14;
    int k = 5;
    assertEquals(0, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case39() {
    int left = 1;
    int right = 15;
    int k = 5;
    assertEquals(1, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case40() {
    int left = 1;
    int right = 16;
    int k = 5;
    assertEquals(1, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case41() {
    int left = 1;
    int right = 17;
    int k = 5;
    assertEquals(1, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case42() {
    int left = 1;
    int right = 18;
    int k = 5;
    assertEquals(1, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case43() {
    int left = 1;
    int right = 19;
    int k = 5;
    assertEquals(1, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case44() {
    int left = 1;
    int right = 20;
    int k = 5;
    assertEquals(2, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case45() {
    int left = 1;
    int right = 21;
    int k = 5;
    assertEquals(2, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case46() {
    int left = 1;
    int right = 22;
    int k = 5;
    assertEquals(2, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case47() {
    int left = 1;
    int right = 23;
    int k = 5;
    assertEquals(2, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case48() {
    int left = 1;
    int right = 24;
    int k = 5;
    assertEquals(2, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case49() {
    int left = 1;
    int right = 25;
    int k = 5;
    assertEquals(3, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case50() {
    int left = 1;
    int right = 26;
    int k = 5;
    assertEquals(3, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case51() {
    int left = 1;
    int right = 27;
    int k = 5;
    assertEquals(3, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case52() {
    int left = 1;
    int right = 28;
    int k = 5;
    assertEquals(3, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case53() {
    int left = 1;
    int right = 29;
    int k = 5;
    assertEquals(3, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case54() {
    int left = 1;
    int right = 1000000000;
    int k = 2;
    assertEquals(999999998, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case55() {
    int left = 1;
    int right = 1000000000;
    int k = 3;
    assertEquals(333333332, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case56() {
    int left = 1;
    int right = 1000000000;
    int k = 4;
    assertEquals(499999995, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case57() {
    int left = 14;
    int right = 14;
    int k = 5;
    assertEquals(0, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case58() {
    int left = 15;
    int right = 15;
    int k = 5;
    assertEquals(1, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case59() {
    int left = 16;
    int right = 16;
    int k = 5;
    assertEquals(0, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case60() {
    int left = 14;
    int right = 14;
    int k = 4;
    assertEquals(1, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case61() {
    int left = 15;
    int right = 15;
    int k = 4;
    assertEquals(0, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case62() {
    int left = 16;
    int right = 16;
    int k = 4;
    assertEquals(1, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case63() {
    int left = 270050871;
    int right = 477356599;
    int k = 3;
    assertEquals(69101910, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case64() {
    int left = 20;
    int right = 382167388;
    int k = 5;
    assertEquals(76433474, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case65() {
    int left = 22;
    int right = 859601633;
    int k = 4;
    assertEquals(429800806, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case66() {
    int left = 1;
    int right = 626486333;
    int k = 3;
    assertEquals(208828776, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case67() {
    int left = 6;
    int right = 10;
    int k = 4;
    assertEquals(1, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case68() {
    int left = 18;
    int right = 19;
    int k = 2;
    assertEquals(2, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case69() {
    int left = 20;
    int right = 26;
    int k = 3;
    assertEquals(2, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case70() {
    int left = 9;
    int right = 21;
    int k = 2;
    assertEquals(13, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case71() {
    int left = 83775320;
    int right = 103270600;
    int k = 5;
    assertEquals(3899057, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case72() {
    int left = 242548845;
    int right = 246930528;
    int k = 2;
    assertEquals(4381684, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case73() {
    int left = 19;
    int right = 23;
    int k = 2;
    assertEquals(5, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case74() {
    int left = 41014432;
    int right = 72180459;
    int k = 5;
    assertEquals(6233205, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case75() {
    int left = 58155282;
    int right = 180514283;
    int k = 5;
    assertEquals(24471800, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case76() {
    int left = 4;
    int right = 6;
    int k = 4;
    assertEquals(0, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case77() {
    int left = 633034921;
    int right = 805153700;
    int k = 3;
    assertEquals(57372926, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case78() {
    int left = 1;
    int right = 2;
    int k = 4;
    assertEquals(0, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case79() {
    int left = 27;
    int right = 833985333;
    int k = 4;
    assertEquals(416992653, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case80() {
    int left = 358476492;
    int right = 634066638;
    int k = 4;
    assertEquals(137795074, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case81() {
    int left = 5;
    int right = 701880154;
    int k = 3;
    assertEquals(233960050, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case82() {
    int left = 10;
    int right = 250276212;
    int k = 4;
    assertEquals(125138101, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case83() {
    int left = 546195286;
    int right = 656246848;
    int k = 2;
    assertEquals(110051563, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case84() {
    int left = 4;
    int right = 16;
    int k = 2;
    assertEquals(13, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case85() {
    int left = 9;
    int right = 676116746;
    int k = 4;
    assertEquals(338058368, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case86() {
    int left = 6;
    int right = 478091737;
    int k = 2;
    assertEquals(478091732, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case87() {
    int left = 2;
    int right = 4;
    int k = 5;
    assertEquals(0, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case88() {
    int left = 1;
    int right = 3;
    int k = 3;
    assertEquals(0, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case89() {
    int left = 6;
    int right = 13;
    int k = 3;
    assertEquals(3, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case90() {
    int left = 163039951;
    int right = 457484471;
    int k = 5;
    assertEquals(58888904, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case91() {
    int left = 11;
    int right = 21;
    int k = 3;
    assertEquals(4, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case92() {
    int left = 225235485;
    int right = 313423339;
    int k = 5;
    assertEquals(17637571, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case93() {
    int left = 16;
    int right = 184459498;
    int k = 4;
    assertEquals(92229742, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case94() {
    int left = 3;
    int right = 25;
    int k = 4;
    assertEquals(7, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case95() {
    int left = 4;
    int right = 21;
    int k = 2;
    assertEquals(18, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case96() {
    int left = 23;
    int right = 861067741;
    int k = 4;
    assertEquals(430533859, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case97() {
    int left = 8;
    int right = 10;
    int k = 4;
    assertEquals(1, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case98() {
    int left = 5;
    int right = 582354858;
    int k = 5;
    assertEquals(116470969, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case99() {
    int left = 10;
    int right = 11;
    int k = 2;
    assertEquals(2, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case100() {
    int left = 2;
    int right = 844190775;
    int k = 3;
    assertEquals(281396924, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case101() {
    int left = 7;
    int right = 12;
    int k = 5;
    assertEquals(0, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case102() {
    int left = 28;
    int right = 32719632;
    int k = 4;
    assertEquals(16359803, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case103() {
    int left = 15;
    int right = 15;
    int k = 5;
    assertEquals(1, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case104() {
    int left = 4;
    int right = 403257863;
    int k = 3;
    assertEquals(134419286, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case105() {
    int left = 280275835;
    int right = 608899014;
    int k = 5;
    assertEquals(65724636, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case106() {
    int left = 299704889;
    int right = 595092880;
    int k = 5;
    assertEquals(59077599, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case107() {
    int left = 19;
    int right = 63141083;
    int k = 5;
    assertEquals(12628213, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case108() {
    int left = 456585908;
    int right = 817933056;
    int k = 2;
    assertEquals(361347149, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case109() {
    int left = 2;
    int right = 7;
    int k = 4;
    assertEquals(0, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case110() {
    int left = 9117938;
    int right = 214465231;
    int k = 4;
    assertEquals(102673647, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case111() {
    int left = 371052252;
    int right = 528386374;
    int k = 5;
    assertEquals(31466824, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case112() {
    int left = 15;
    int right = 302385366;
    int k = 5;
    assertEquals(60477071, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case113() {
    int left = 1;
    int right = 100000;
    int k = 4;
    assertEquals(49995, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case114() {
    int left = 1;
    int right = 999999999;
    int k = 4;
    assertEquals(499999994, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case115() {
    int left = 1;
    int right = 999999999;
    int k = 5;
    assertEquals(199999997, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case116() {
    int left = 1;
    int right = 1000000000;
    int k = 5;
    assertEquals(199999998, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case117() {
    int left = 10;
    int right = 232323290;
    int k = 4;
    assertEquals(116161640, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case118() {
    int left = 20;
    int right = 1000000000;
    int k = 4;
    assertEquals(499999991, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case119() {
    int left = 11;
    int right = 1000000000;
    int k = 4;
    assertEquals(499999994, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case120() {
    int left = 1;
    int right = 10000;
    int k = 4;
    assertEquals(4995, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case121() {
    int left = 98765;
    int right = 100000000;
    int k = 4;
    assertEquals(49950618, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case122() {
    int left = 23;
    int right = 1000000000;
    int k = 3;
    assertEquals(333333326, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case123() {
    int left = 1000000000;
    int right = 1000000000;
    int k = 5;
    assertEquals(1, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case124() {
    int left = 10000320;
    int right = 23121412;
    int k = 5;
    assertEquals(2624219, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case125() {
    int left = 1;
    int right = 100000000;
    int k = 4;
    assertEquals(49999995, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case126() {
    int left = 7;
    int right = 9;
    int k = 3;
    assertEquals(1, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case127() {
    int left = 12;
    int right = 12;
    int k = 4;
    assertEquals(0, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case128() {
    int left = 1;
    int right = 654;
    int k = 4;
    assertEquals(322, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case129() {
    int left = 1;
    int right = 1;
    int k = 4;
    assertEquals(0, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case130() {
    int left = 100;
    int right = 1000000000;
    int k = 4;
    assertEquals(499999951, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case131() {
    int left = 11;
    int right = 13;
    int k = 4;
    assertEquals(0, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case132() {
    int left = 52;
    int right = 52;
    int k = 3;
    assertEquals(0, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case133() {
    int left = 1;
    int right = 10000;
    int k = 5;
    assertEquals(1998, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case134() {
    int left = 5;
    int right = 5;
    int k = 5;
    assertEquals(0, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case135() {
    int left = 10;
    int right = 10;
    int k = 4;
    assertEquals(1, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case136() {
    int left = 1;
    int right = 100;
    int k = 4;
    assertEquals(45, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case137() {
    int left = 15;
    int right = 17;
    int k = 4;
    assertEquals(1, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case138() {
    int left = 17;
    int right = 19;
    int k = 4;
    assertEquals(1, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case139() {
    int left = 1;
    int right = 30;
    int k = 5;
    assertEquals(4, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case140() {
    int left = 10;
    int right = 20;
    int k = 5;
    assertEquals(2, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case141() {
    int left = 3;
    int right = 5;
    int k = 2;
    assertEquals(3, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case142() {
    int left = 124;
    int right = 123312541;
    int k = 5;
    assertEquals(24662484, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case143() {
    int left = 16;
    int right = 17;
    int k = 3;
    assertEquals(0, summingarithmeticprogressions.howMany(left, right, k));
  }

  @Test
  public void case144() {
    int left = 6;
    int right = 6;
    int k = 5;
    assertEquals(0, summingarithmeticprogressions.howMany(left, right, k));
  }

}
