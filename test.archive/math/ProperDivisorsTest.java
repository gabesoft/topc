package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class ProperDivisorsTest {
  ProperDivisors properdivisors = new ProperDivisors();

  @Test
  public void case1() {
    int a = 32;
    int b = 1;
    int n = 3;
    assertEquals(5, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case2() {
    int a = 1;
    int b = 12;
    int n = 2;
    assertEquals(8, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case3() {
    int a = 1000000;
    int b = 10000000;
    int n = 10;
    assertEquals(146066338, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case4() {
    int a = 1000000;
    int b = 10000000;
    int n = 5;
    assertEquals(145707011, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case5() {
    int a = 1;
    int b = 1;
    int n = 10;
    assertEquals(0, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case6() {
    int a = 1000000;
    int b = 10000000;
    int n = 2;
    assertEquals(139630317, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case7() {
    int a = 256;
    int b = 1;
    int n = 8;
    assertEquals(6, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case8() {
    int a = 76;
    int b = 241;
    int n = 7;
    assertEquals(1051, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case9() {
    int a = 25;
    int b = 481;
    int n = 5;
    assertEquals(2171, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case10() {
    int a = 77;
    int b = 237;
    int n = 2;
    assertEquals(897, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case11() {
    int a = 80;
    int b = 528;
    int n = 5;
    assertEquals(2559, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case12() {
    int a = 95;
    int b = 801;
    int n = 4;
    assertEquals(4121, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case13() {
    int a = 33;
    int b = 460;
    int n = 5;
    assertEquals(2077, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case14() {
    int a = 68;
    int b = 188;
    int n = 3;
    assertEquals(757, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case15() {
    int a = 18;
    int b = 46;
    int n = 2;
    assertEquals(108, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case16() {
    int a = 2;
    int b = 655;
    int n = 4;
    assertEquals(3000, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case17() {
    int a = 13;
    int b = 930;
    int n = 2;
    assertEquals(4147, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case18() {
    int a = 18;
    int b = 23;
    int n = 7;
    assertEquals(60, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case19() {
    int a = 33;
    int b = 645;
    int n = 5;
    assertEquals(3095, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case20() {
    int a = 56;
    int b = 34;
    int n = 9;
    assertEquals(124, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case21() {
    int a = 32;
    int b = 697;
    int n = 8;
    assertEquals(3414, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case22() {
    int a = 60;
    int b = 40;
    int n = 3;
    assertEquals(144, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case23() {
    int a = 23;
    int b = 227;
    int n = 5;
    assertEquals(883, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case24() {
    int a = 4;
    int b = 492;
    int n = 6;
    assertEquals(2166, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case25() {
    int a = 8;
    int b = 706;
    int n = 10;
    assertEquals(3378, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case26() {
    int a = 95;
    int b = 744;
    int n = 10;
    assertEquals(3839, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case27() {
    int a = 16;
    int b = 217;
    int n = 3;
    assertEquals(785, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case28() {
    int a = 33;
    int b = 669;
    int n = 9;
    assertEquals(3258, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case29() {
    int a = 2063;
    int b = 31790;
    int n = 6;
    assertEquals(278126, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case30() {
    int a = 136;
    int b = 33591;
    int n = 10;
    assertEquals(288948, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case31() {
    int a = 9715;
    int b = 57300;
    int n = 4;
    assertEquals(545073, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case32() {
    int a = 2123;
    int b = 89026;
    int n = 2;
    assertEquals(803335, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case33() {
    int a = 3772;
    int b = 17425;
    int n = 2;
    assertEquals(136822, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case34() {
    int a = 4565;
    int b = 79739;
    int n = 10;
    assertEquals(770484, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case35() {
    int a = 4854;
    int b = 37177;
    int n = 8;
    assertEquals(337520, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case36() {
    int a = 6293;
    int b = 33607;
    int n = 2;
    assertEquals(284179, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case37() {
    int a = 2612;
    int b = 79478;
    int n = 3;
    assertEquals(745659, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case38() {
    int a = 7376;
    int b = 29801;
    int n = 5;
    assertEquals(269443, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case39() {
    int a = 8342;
    int b = 97317;
    int n = 6;
    assertEquals(965666, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case40() {
    int a = 8452;
    int b = 90781;
    int n = 8;
    assertEquals(897383, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case41() {
    int a = 2915;
    int b = 49955;
    int n = 6;
    assertEquals(458682, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case42() {
    int a = 6631;
    int b = 44593;
    int n = 10;
    assertEquals(414791, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case43() {
    int a = 7520;
    int b = 20703;
    int n = 3;
    assertEquals(179741, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case44() {
    int a = 5453;
    int b = 44995;
    int n = 5;
    assertEquals(414695, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case45() {
    int a = 4715;
    int b = 73754;
    int n = 10;
    assertEquals(708291, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case46() {
    int a = 6409;
    int b = 36882;
    int n = 5;
    assertEquals(336559, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case47() {
    int a = 7303;
    int b = 87584;
    int n = 10;
    assertEquals(860793, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case48() {
    int a = 9534;
    int b = 54527;
    int n = 5;
    assertEquals(519000, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case49() {
    int a = 282499;
    int b = 2413;
    int n = 10;
    assertEquals(28239, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case50() {
    int a = 570551;
    int b = 5440141;
    int n = 7;
    assertEquals(76173349, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case51() {
    int a = 818936;
    int b = 1919226;
    int n = 4;
    assertEquals(25736733, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case52() {
    int a = 542079;
    int b = 3570232;
    int n = 7;
    assertEquals(48852298, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case53() {
    int a = 43959;
    int b = 9287861;
    int n = 2;
    assertEquals(126168618, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case54() {
    int a = 896415;
    int b = 7577294;
    int n = 3;
    assertEquals(107374885, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case55() {
    int a = 618745;
    int b = 4921657;
    int n = 2;
    assertEquals(65522750, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case56() {
    int a = 297360;
    int b = 954291;
    int n = 3;
    assertEquals(11871712, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case57() {
    int a = 698735;
    int b = 9276167;
    int n = 10;
    assertEquals(134219467, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case58() {
    int a = 438626;
    int b = 2729469;
    int n = 7;
    assertEquals(36663471, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case59() {
    int a = 506878;
    int b = 2729424;
    int n = 5;
    assertEquals(36715498, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case60() {
    int a = 566290;
    int b = 898966;
    int n = 7;
    assertEquals(11634824, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case61() {
    int a = 227177;
    int b = 7901290;
    int n = 8;
    assertEquals(111914619, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case62() {
    int a = 352823;
    int b = 4804748;
    int n = 2;
    assertEquals(63244619, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case63() {
    int a = 406067;
    int b = 449339;
    int n = 4;
    assertEquals(5573981, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case64() {
    int a = 60173;
    int b = 8645346;
    int n = 9;
    assertEquals(122474390, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case65() {
    int a = 549084;
    int b = 9278832;
    int n = 7;
    assertEquals(133777741, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case66() {
    int a = 429413;
    int b = 806914;
    int n = 8;
    assertEquals(10280643, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case67() {
    int a = 100368;
    int b = 9604230;
    int n = 4;
    assertEquals(136456858, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case68() {
    int a = 944525;
    int b = 9999760;
    int n = 7;
    assertEquals(145854621, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case69() {
    int a = 904376;
    int b = 9999520;
    int n = 5;
    assertEquals(145466065, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case70() {
    int a = 959824;
    int b = 9999764;
    int n = 2;
    assertEquals(139529868, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case71() {
    int a = 909621;
    int b = 9999473;
    int n = 5;
    assertEquals(145478423, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case72() {
    int a = 973806;
    int b = 9999200;
    int n = 4;
    assertEquals(145177767, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case73() {
    int a = 980468;
    int b = 9999541;
    int n = 5;
    assertEquals(145653011, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case74() {
    int a = 904433;
    int b = 9999813;
    int n = 3;
    assertEquals(143819454, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case75() {
    int a = 928883;
    int b = 9999955;
    int n = 2;
    assertEquals(139456772, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case76() {
    int a = 912999;
    int b = 9999346;
    int n = 4;
    assertEquals(145030855, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case77() {
    int a = 921788;
    int b = 9999071;
    int n = 2;
    assertEquals(139426278, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case78() {
    int a = 1;
    int b = 10000000;
    int n = 2;
    assertEquals(136280624, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case79() {
    int a = 1;
    int b = 10000000;
    int n = 5;
    assertEquals(142356103, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case80() {
    int a = 1;
    int b = 10000000;
    int n = 8;
    assertEquals(142684598, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case81() {
    int a = 537695;
    int b = 5376956;
    int n = 5;
    assertEquals(75009840, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case82() {
    int a = 100000;
    int b = 10000000;
    int n = 10;
    assertEquals(143276440, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case83() {
    int a = 97;
    int b = 9999999;
    int n = 3;
    assertEquals(140706252, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case84() {
    int a = 1;
    int b = 10000000;
    int n = 7;
    assertEquals(142641878, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case85() {
    int a = 1;
    int b = 10000000;
    int n = 10;
    assertEquals(142715423, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case86() {
    int a = 999999;
    int b = 9999990;
    int n = 9;
    assertEquals(146056082, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case87() {
    int a = 99999;
    int b = 999999;
    int n = 7;
    assertEquals(12296705, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case88() {
    int a = 787878;
    int b = 10000000;
    int n = 3;
    assertEquals(143524980, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case89() {
    int a = 2;
    int b = 10000000;
    int n = 6;
    assertEquals(142551958, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case90() {
    int a = 1000000;
    int b = 9999999;
    int n = 9;
    assertEquals(146056106, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case91() {
    int a = 999951;
    int b = 9188771;
    int n = 9;
    assertEquals(133621562, properdivisors.analyzeInterval(a, b, n));
  }

  @Test
  public void case92() {
    int a = 934234;
    int b = 9123756;
    int n = 9;
    assertEquals(132473466, properdivisors.analyzeInterval(a, b, n));
  }

}
