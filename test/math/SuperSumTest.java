package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class SuperSumTest {
  SuperSum supersum = new SuperSum();

  @Test
  public void case1() {
    int k = 1;
    int n = 3;
    assertEquals(6, supersum.calculate(k, n));
  }

  @Test
  public void case2() {
    int k = 2;
    int n = 3;
    assertEquals(10, supersum.calculate(k, n));
  }

  @Test
  public void case3() {
    int k = 4;
    int n = 10;
    assertEquals(2002, supersum.calculate(k, n));
  }

  @Test
  public void case4() {
    int k = 10;
    int n = 35;
    assertEquals(150595840, supersum.calculate(k, n));
  }

  @Test
  public void case5() {
    int k = 50;
    int n = 1000000000;
    assertEquals(0, supersum.calculate(k, n));
  }

  @Test
  public void case6() {
    int k = 50;
    int n = 536870911;
    assertEquals(604374384, supersum.calculate(k, n));
  }

  @Test
  public void case7() {
    int k = 1;
    int n = 1;
    assertEquals(1, supersum.calculate(k, n));
  }

  @Test
  public void case8() {
    int k = 23;
    int n = 1;
    assertEquals(1, supersum.calculate(k, n));
  }

  @Test
  public void case9() {
    int k = 50;
    int n = 1;
    assertEquals(1, supersum.calculate(k, n));
  }

  @Test
  public void case10() {
    int k = 2;
    int n = 942673158;
    assertEquals(476373970, supersum.calculate(k, n));
  }

  @Test
  public void case11() {
    int k = 30;
    int n = 300218439;
    assertEquals(826668794, supersum.calculate(k, n));
  }

  @Test
  public void case12() {
    int k = 24;
    int n = 995242181;
    assertEquals(986028885, supersum.calculate(k, n));
  }

  @Test
  public void case13() {
    int k = 37;
    int n = 287457099;
    assertEquals(116059974, supersum.calculate(k, n));
  }

  @Test
  public void case14() {
    int k = 29;
    int n = 855370135;
    assertEquals(696112017, supersum.calculate(k, n));
  }

  @Test
  public void case15() {
    int k = 25;
    int n = 447214090;
    assertEquals(223110704, supersum.calculate(k, n));
  }

  @Test
  public void case16() {
    int k = 18;
    int n = 447953543;
    assertEquals(290387742, supersum.calculate(k, n));
  }

  @Test
  public void case17() {
    int k = 28;
    int n = 64826618;
    assertEquals(223109585, supersum.calculate(k, n));
  }

  @Test
  public void case18() {
    int k = 6;
    int n = 243778003;
    assertEquals(503960484, supersum.calculate(k, n));
  }

  @Test
  public void case19() {
    int k = 24;
    int n = 857954777;
    assertEquals(206147394, supersum.calculate(k, n));
  }

  @Test
  public void case20() {
    int k = 48;
    int n = 522907414;
    assertEquals(506470000, supersum.calculate(k, n));
  }

  @Test
  public void case21() {
    int k = 16;
    int n = 936435578;
    assertEquals(831099133, supersum.calculate(k, n));
  }

  @Test
  public void case22() {
    int k = 23;
    int n = 908839793;
    assertEquals(208206642, supersum.calculate(k, n));
  }

  @Test
  public void case23() {
    int k = 38;
    int n = 314370829;
    assertEquals(660609756, supersum.calculate(k, n));
  }

  @Test
  public void case24() {
    int k = 27;
    int n = 287825870;
    assertEquals(163370456, supersum.calculate(k, n));
  }

  @Test
  public void case25() {
    int k = 28;
    int n = 540424322;
    assertEquals(499401678, supersum.calculate(k, n));
  }

  @Test
  public void case26() {
    int k = 41;
    int n = 489010739;
    assertEquals(683530101, supersum.calculate(k, n));
  }

  @Test
  public void case27() {
    int k = 39;
    int n = 961479942;
    assertEquals(213385636, supersum.calculate(k, n));
  }

  @Test
  public void case28() {
    int k = 22;
    int n = 626422230;
    assertEquals(480026326, supersum.calculate(k, n));
  }

  @Test
  public void case29() {
    int k = 17;
    int n = 622633395;
    assertEquals(692478064, supersum.calculate(k, n));
  }

  @Test
  public void case30() {
    int k = 25;
    int n = 494762552;
    assertEquals(380861548, supersum.calculate(k, n));
  }

  @Test
  public void case31() {
    int k = 44;
    int n = 510566469;
    assertEquals(331481604, supersum.calculate(k, n));
  }

  @Test
  public void case32() {
    int k = 23;
    int n = 335936101;
    assertEquals(363328533, supersum.calculate(k, n));
  }

  @Test
  public void case33() {
    int k = 46;
    int n = 478459937;
    assertEquals(417638533, supersum.calculate(k, n));
  }

  @Test
  public void case34() {
    int k = 30;
    int n = 684727825;
    assertEquals(755859442, supersum.calculate(k, n));
  }

  @Test
  public void case35() {
    int k = 28;
    int n = 372858471;
    assertEquals(968949522, supersum.calculate(k, n));
  }

  @Test
  public void case36() {
    int k = 38;
    int n = 799406312;
    assertEquals(25577541, supersum.calculate(k, n));
  }

  @Test
  public void case37() {
    int k = 34;
    int n = 491608220;
    assertEquals(924976255, supersum.calculate(k, n));
  }

  @Test
  public void case38() {
    int k = 30;
    int n = 382701630;
    assertEquals(786772275, supersum.calculate(k, n));
  }

  @Test
  public void case39() {
    int k = 28;
    int n = 619212432;
    assertEquals(745892991, supersum.calculate(k, n));
  }

  @Test
  public void case40() {
    int k = 50;
    int n = 727215824;
    assertEquals(701769601, supersum.calculate(k, n));
  }

  @Test
  public void case41() {
    int k = 38;
    int n = 587180079;
    assertEquals(124551017, supersum.calculate(k, n));
  }

  @Test
  public void case42() {
    int k = 40;
    int n = 840157131;
    assertEquals(457408577, supersum.calculate(k, n));
  }

  @Test
  public void case43() {
    int k = 28;
    int n = 820399816;
    assertEquals(265493402, supersum.calculate(k, n));
  }

  @Test
  public void case44() {
    int k = 39;
    int n = 692595081;
    assertEquals(72937484, supersum.calculate(k, n));
  }

  @Test
  public void case45() {
    int k = 25;
    int n = 657106863;
    assertEquals(272814660, supersum.calculate(k, n));
  }

  @Test
  public void case46() {
    int k = 31;
    int n = 768602901;
    assertEquals(463388295, supersum.calculate(k, n));
  }

  @Test
  public void case47() {
    int k = 28;
    int n = 587123245;
    assertEquals(748516979, supersum.calculate(k, n));
  }

  @Test
  public void case48() {
    int k = 26;
    int n = 555092218;
    assertEquals(555490779, supersum.calculate(k, n));
  }

  @Test
  public void case49() {
    int k = 44;
    int n = 660921777;
    assertEquals(762425927, supersum.calculate(k, n));
  }

  @Test
  public void case50() {
    int k = 25;
    int n = 849102920;
    assertEquals(364378679, supersum.calculate(k, n));
  }

  @Test
  public void case51() {
    int k = 26;
    int n = 974643542;
    assertEquals(3612577, supersum.calculate(k, n));
  }

  @Test
  public void case52() {
    int k = 32;
    int n = 681193967;
    assertEquals(194344069, supersum.calculate(k, n));
  }

  @Test
  public void case53() {
    int k = 49;
    int n = 830727997;
    assertEquals(786187896, supersum.calculate(k, n));
  }

  @Test
  public void case54() {
    int k = 39;
    int n = 951759070;
    assertEquals(633096638, supersum.calculate(k, n));
  }

  @Test
  public void case55() {
    int k = 49;
    int n = 934727566;
    assertEquals(278018569, supersum.calculate(k, n));
  }

  @Test
  public void case56() {
    int k = 3;
    int n = 906193706;
    assertEquals(615188860, supersum.calculate(k, n));
  }

  @Test
  public void case57() {
    int k = 47;
    int n = 994797443;
    assertEquals(147480236, supersum.calculate(k, n));
  }

  @Test
  public void case58() {
    int k = 6;
    int n = 900821360;
    assertEquals(885909623, supersum.calculate(k, n));
  }

  @Test
  public void case59() {
    int k = 36;
    int n = 910801107;
    assertEquals(698857930, supersum.calculate(k, n));
  }

  @Test
  public void case60() {
    int k = 28;
    int n = 937871575;
    assertEquals(857940348, supersum.calculate(k, n));
  }

  @Test
  public void case61() {
    int k = 4;
    int n = 930273759;
    assertEquals(696917071, supersum.calculate(k, n));
  }

  @Test
  public void case62() {
    int k = 28;
    int n = 966104095;
    assertEquals(633102118, supersum.calculate(k, n));
  }

  @Test
  public void case63() {
    int k = 45;
    int n = 950430057;
    assertEquals(795548554, supersum.calculate(k, n));
  }

  @Test
  public void case64() {
    int k = 2;
    int n = 939408767;
    assertEquals(178119175, supersum.calculate(k, n));
  }

  @Test
  public void case65() {
    int k = 44;
    int n = 988343832;
    assertEquals(392592742, supersum.calculate(k, n));
  }

  @Test
  public void case66() {
    int k = 3;
    int n = 935661721;
    assertEquals(962657968, supersum.calculate(k, n));
  }

  @Test
  public void case67() {
    int k = 48;
    int n = 936731699;
    assertEquals(626430046, supersum.calculate(k, n));
  }

  @Test
  public void case68() {
    int k = 45;
    int n = 991724535;
    assertEquals(847627269, supersum.calculate(k, n));
  }

  @Test
  public void case69() {
    int k = 1;
    int n = 908786277;
    assertEquals(195529781, supersum.calculate(k, n));
  }

  @Test
  public void case70() {
    int k = 50;
    int n = 999999956;
    assertEquals(1000000006, supersum.calculate(k, n));
  }

  @Test
  public void case71() {
    int k = 50;
    int n = 999999955;
    assertEquals(999999955, supersum.calculate(k, n));
  }

  @Test
  public void case72() {
    int k = 48;
    int n = 999999956;
    assertEquals(999998732, supersum.calculate(k, n));
  }

  @Test
  public void case73() {
    int k = 50;
    int n = 999999999;
    assertEquals(0, supersum.calculate(k, n));
  }

  @Test
  public void case74() {
    int k = 49;
    int n = 999999998;
    assertEquals(0, supersum.calculate(k, n));
  }

  @Test
  public void case75() {
    int k = 47;
    int n = 975432147;
    assertEquals(917366087, supersum.calculate(k, n));
  }

  @Test
  public void case76() {
    int k = 47;
    int n = 1000000000;
    assertEquals(0, supersum.calculate(k, n));
  }

  @Test
  public void case77() {
    int k = 50;
    int n = 599999953;
    assertEquals(408657633, supersum.calculate(k, n));
  }

  @Test
  public void case78() {
    int k = 48;
    int n = 12412424;
    assertEquals(32514911, supersum.calculate(k, n));
  }

}
