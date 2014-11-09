package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class ChildlessNumbersTest {
  ChildlessNumbers childlessnumbers = new ChildlessNumbers();

  @Test
  public void case1() {
    int A = 4;
    int B = 7;
    assertEquals(0, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case2() {
    int A = 37;
    int B = 37;
    assertEquals(0, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case3() {
    int A = 61;
    int B = 65;
    assertEquals(3, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case4() {
    int A = 275;
    int B = 300;
    assertEquals(1, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case5() {
    int A = 999990000;
    int B = 1000000000;
    assertEquals(1950, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case6() {
    int A = 24684440;
    int B = 24694440;
    assertEquals(6504, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case7() {
    int A = 796878566;
    int B = 796888566;
    assertEquals(5990, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case8() {
    int A = 246889265;
    int B = 246899265;
    assertEquals(6714, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case9() {
    int A = 600240035;
    int B = 600250035;
    assertEquals(4015, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case10() {
    int A = 1;
    int B = 61;
    assertEquals(0, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case11() {
    int A = 123;
    int B = 1234;
    assertEquals(123, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case12() {
    int A = 351335515;
    int B = 351344526;
    assertEquals(1405, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case13() {
    int A = 528977286;
    int B = 528987005;
    assertEquals(1295, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case14() {
    int A = 528960940;
    int B = 528970618;
    assertEquals(1371, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case15() {
    int A = 565076706;
    int B = 565085728;
    assertEquals(1417, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case16() {
    int A = 442067845;
    int B = 442076950;
    assertEquals(2251, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case17() {
    int A = 961895748;
    int B = 961904910;
    assertEquals(906, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case18() {
    int A = 775735046;
    int B = 775744477;
    assertEquals(1284, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case19() {
    int A = 278346336;
    int B = 278355401;
    assertEquals(1305, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case20() {
    int A = 257178195;
    int B = 257188149;
    assertEquals(2043, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case21() {
    int A = 902190830;
    int B = 902200076;
    assertEquals(1556, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case22() {
    int A = 725290028;
    int B = 725299440;
    assertEquals(525, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case23() {
    int A = 406229757;
    int B = 406239020;
    assertEquals(889, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case24() {
    int A = 467189414;
    int B = 467199296;
    assertEquals(3084, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case25() {
    int A = 63910586;
    int B = 63919677;
    assertEquals(1442, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case26() {
    int A = 85332141;
    int B = 85341410;
    assertEquals(1097, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case27() {
    int A = 492764954;
    int B = 492774046;
    assertEquals(1438, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case28() {
    int A = 464746988;
    int B = 464756249;
    assertEquals(811, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case29() {
    int A = 603290547;
    int B = 603300358;
    assertEquals(1256, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case30() {
    int A = 296892983;
    int B = 296902676;
    assertEquals(3901, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case31() {
    int A = 803175278;
    int B = 803184488;
    assertEquals(2353, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case32() {
    int A = 214912744;
    int B = 214922399;
    assertEquals(2352, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case33() {
    int A = 340977766;
    int B = 340987588;
    assertEquals(2112, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case34() {
    int A = 414128404;
    int B = 414137473;
    assertEquals(3018, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case35() {
    int A = 761144736;
    int B = 761154271;
    assertEquals(1088, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case36() {
    int A = 451108100;
    int B = 451117100;
    assertEquals(1650, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case37() {
    int A = 997454526;
    int B = 997464025;
    assertEquals(2027, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case38() {
    int A = 407297265;
    int B = 407306442;
    assertEquals(1151, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case39() {
    int A = 770251789;
    int B = 770261612;
    assertEquals(1366, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case40() {
    int A = 527905756;
    int B = 527914777;
    assertEquals(1622, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case41() {
    int A = 202945158;
    int B = 202954504;
    assertEquals(768, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case42() {
    int A = 414612527;
    int B = 414622395;
    assertEquals(2491, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case43() {
    int A = 77452467;
    int B = 77461924;
    assertEquals(1282, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case44() {
    int A = 131739827;
    int B = 131748843;
    assertEquals(1938, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case45() {
    int A = 707390900;
    int B = 707400065;
    assertEquals(856, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case46() {
    int A = 335226580;
    int B = 335235887;
    assertEquals(1654, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case47() {
    int A = 800534669;
    int B = 800544111;
    assertEquals(2990, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case48() {
    int A = 45837515;
    int B = 45846949;
    assertEquals(1394, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case49() {
    int A = 927960385;
    int B = 927969700;
    assertEquals(1889, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case50() {
    int A = 249227989;
    int B = 249237894;
    assertEquals(3478, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case51() {
    int A = 885857927;
    int B = 885867183;
    assertEquals(1770, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case52() {
    int A = 207764884;
    int B = 207774832;
    assertEquals(3763, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case53() {
    int A = 211551607;
    int B = 211561224;
    assertEquals(3312, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case54() {
    int A = 436228931;
    int B = 436238581;
    assertEquals(936, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case55() {
    int A = 22690928;
    int B = 22700715;
    assertEquals(3556, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case56() {
    int A = 217067930;
    int B = 217077313;
    assertEquals(3535, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case57() {
    int A = 895261871;
    int B = 895271781;
    assertEquals(1362, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case58() {
    int A = 687568321;
    int B = 687577878;
    assertEquals(1558, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case59() {
    int A = 335719561;
    int B = 335728799;
    assertEquals(1395, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case60() {
    int A = 920197459;
    int B = 920207276;
    assertEquals(664, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case61() {
    int A = 887825232;
    int B = 887834270;
    assertEquals(1561, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case62() {
    int A = 808568719;
    int B = 808578169;
    assertEquals(2359, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case63() {
    int A = 971902894;
    int B = 971912231;
    assertEquals(1739, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case64() {
    int A = 139388593;
    int B = 139397863;
    assertEquals(925, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case65() {
    int A = 29377021;
    int B = 29386652;
    assertEquals(2309, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case66() {
    int A = 285595860;
    int B = 285604998;
    assertEquals(951, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case67() {
    int A = 80470052;
    int B = 80479564;
    assertEquals(3467, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case68() {
    int A = 426363320;
    int B = 426372571;
    assertEquals(2383, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case69() {
    int A = 458686126;
    int B = 458696071;
    assertEquals(825, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case70() {
    int A = 839114445;
    int B = 839123981;
    assertEquals(960, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case71() {
    int A = 22729068;
    int B = 22739067;
    assertEquals(3793, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case72() {
    int A = 90976355;
    int B = 90985904;
    assertEquals(1971, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case73() {
    int A = 594207268;
    int B = 594216282;
    assertEquals(2173, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case74() {
    int A = 452450289;
    int B = 452459927;
    assertEquals(3360, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case75() {
    int A = 926013635;
    int B = 926022710;
    assertEquals(1406, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case76() {
    int A = 460148421;
    int B = 460158182;
    assertEquals(545, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case77() {
    int A = 510547903;
    int B = 510557870;
    assertEquals(2280, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case78() {
    int A = 941340139;
    int B = 941349233;
    assertEquals(2093, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case79() {
    int A = 111473196;
    int B = 111482265;
    assertEquals(1925, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case80() {
    int A = 667187816;
    int B = 667197285;
    assertEquals(2489, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case81() {
    int A = 389177008;
    int B = 389186264;
    assertEquals(1922, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case82() {
    int A = 64545658;
    int B = 64554884;
    assertEquals(841, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case83() {
    int A = 799481524;
    int B = 799490766;
    assertEquals(4546, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case84() {
    int A = 731982026;
    int B = 731991140;
    assertEquals(1346, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case85() {
    int A = 620241859;
    int B = 620251622;
    assertEquals(1665, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case86() {
    int A = 258688078;
    int B = 258697252;
    assertEquals(1419, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case87() {
    int A = 680666105;
    int B = 680675973;
    assertEquals(1322, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case88() {
    int A = 223440998;
    int B = 223450193;
    assertEquals(1881, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case89() {
    int A = 321940804;
    int B = 321950658;
    assertEquals(1451, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case90() {
    int A = 386920061;
    int B = 386929443;
    assertEquals(1515, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case91() {
    int A = 881775038;
    int B = 881784297;
    assertEquals(1428, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case92() {
    int A = 850152307;
    int B = 850162266;
    assertEquals(862, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case93() {
    int A = 600967234;
    int B = 600976804;
    assertEquals(1538, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case94() {
    int A = 206877322;
    int B = 206887276;
    assertEquals(3209, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case95() {
    int A = 813560941;
    int B = 813570525;
    assertEquals(2158, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case96() {
    int A = 565266145;
    int B = 565275513;
    assertEquals(2238, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case97() {
    int A = 846678419;
    int B = 846688125;
    assertEquals(1748, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case98() {
    int A = 74143003;
    int B = 74152705;
    assertEquals(1750, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case99() {
    int A = 858352832;
    int B = 858362107;
    assertEquals(1697, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case100() {
    int A = 950610321;
    int B = 950619370;
    assertEquals(1056, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case101() {
    int A = 435269929;
    int B = 435279120;
    assertEquals(3562, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case102() {
    int A = 96815209;
    int B = 96824357;
    assertEquals(1466, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case103() {
    int A = 337495332;
    int B = 337504692;
    assertEquals(1436, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case104() {
    int A = 613762382;
    int B = 613771764;
    assertEquals(1986, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case105() {
    int A = 760418416;
    int B = 760427846;
    assertEquals(1692, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case106() {
    int A = 362224294;
    int B = 362233495;
    assertEquals(2314, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case107() {
    int A = 737726465;
    int B = 737736172;
    assertEquals(1340, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case108() {
    int A = 136520361;
    int B = 136529929;
    assertEquals(2399, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case109() {
    int A = 282195070;
    int B = 282204289;
    assertEquals(819, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case110() {
    int A = 902563388;
    int B = 902573199;
    assertEquals(998, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case111() {
    int A = 785765956;
    int B = 785775447;
    assertEquals(3577, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case112() {
    int A = 1;
    int B = 10000;
    assertEquals(1437, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case113() {
    int A = 966660000;
    int B = 966670000;
    assertEquals(971, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case114() {
    int A = 900000000;
    int B = 900010000;
    assertEquals(1429, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case115() {
    int A = 999990000;
    int B = 999999999;
    assertEquals(1950, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case116() {
    int A = 100000000;
    int B = 100010000;
    assertEquals(1794, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case117() {
    int A = 90000000;
    int B = 90010000;
    assertEquals(1429, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case118() {
    int A = 999999000;
    int B = 1000000000;
    assertEquals(192, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case119() {
    int A = 912335671;
    int B = 912345671;
    assertEquals(814, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case120() {
    int A = 999989876;
    int B = 999999875;
    assertEquals(1953, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case121() {
    int A = 790829357;
    int B = 790839357;
    assertEquals(2351, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case122() {
    int A = 63;
    int B = 63;
    assertEquals(1, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case123() {
    int A = 999999990;
    int B = 1000000000;
    assertEquals(1, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case124() {
    int A = 999999990;
    int B = 999999999;
    assertEquals(1, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case125() {
    int A = 10;
    int B = 10000;
    assertEquals(1437, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case126() {
    int A = 999989999;
    int B = 999999999;
    assertEquals(1950, childlessnumbers.howMany(A, B));
  }

  @Test
  public void case127() {
    int A = 981230000;
    int B = 981232981;
    assertEquals(222, childlessnumbers.howMany(A, B));
  }

}
