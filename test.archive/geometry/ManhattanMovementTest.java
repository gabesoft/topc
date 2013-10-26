package topc.test.geometry;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.geometry.*;

public class ManhattanMovementTest {
  double DELTA = 1.0e-09;
  ManhattanMovement manhattanmovement = new ManhattanMovement();

  @Test
  public void case1() {
    int a = 1;
    int b = 2;
    int x0 = -2;
    int y0 = 3;
    assertEquals(1.5, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 1.5);
  }

  @Test
  public void case2() {
    int a = 37;
    int b = 37;
    int x0 = 42;
    int y0 = 19;
    assertEquals(60.97297297297297, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 60.97297297297297);
  }

  @Test
  public void case3() {
    int a = -100;
    int b = 0;
    int x0 = -999999;
    int y0 = 314159;
    assertEquals(999998.99, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 999998.99);
  }

  @Test
  public void case4() {
    int a = 0;
    int b = -2147483648;
    int x0 = 1;
    int y0 = 100000;
    assertEquals(100000.00000000047, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 100000.00000000047);
  }

  @Test
  public void case5() {
    int a = -2147483648;
    int b = 2147483647;
    int x0 = 2147483647;
    int y0 = 2147483647;
    assertEquals(1.0, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 1.0);
  }

  @Test
  public void case6() {
    int a = -2147483648;
    int b = 2147483647;
    int x0 = -2147483648;
    int y0 = 2147483647;
    assertEquals(4294967294.0, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 4294967294.0);
  }

  @Test
  public void case7() {
    int a = 0;
    int b = 1266607226;
    int x0 = 319501161;
    int y0 = -1683299080;
    assertEquals(1683299080.0, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 1683299080.0);
  }

  @Test
  public void case8() {
    int a = 0;
    int b = -1280895397;
    int x0 = -619845035;
    int y0 = -2129647650;
    assertEquals(2129647650.0, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 2129647650.0);
  }

  @Test
  public void case9() {
    int a = 1552476727;
    int b = 0;
    int x0 = 2113262842;
    int y0 = -506687009;
    assertEquals(2113262842.0, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 2113262842.0);
  }

  @Test
  public void case10() {
    int a = -217347990;
    int b = 1407742898;
    int x0 = -664375507;
    int y0 = 0;
    assertEquals(102576032.35422675, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 102576032.35422675);
  }

  @Test
  public void case11() {
    int a = -1113346878;
    int b = -1021908798;
    int x0 = 0;
    int y0 = -646591447;
    assertEquals(593487529.7695411, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 593487529.7695411);
  }

  @Test
  public void case12() {
    int a = 1062627157;
    int b = 1843502487;
    int x0 = -1303271978;
    int y0 = -2104708680;
    assertEquals(2855937499.3511434, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 2855937499.3511434);
  }

  @Test
  public void case13() {
    int a = 0;
    int b = -317229867;
    int x0 = 1987274807;
    int y0 = -1316239511;
    assertEquals(1316239511.0, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 1316239511.0);
  }

  @Test
  public void case14() {
    int a = 1397065508;
    int b = 0;
    int x0 = 1835962049;
    int y0 = 1922408784;
    assertEquals(1835962049.0, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 1835962049.0);
  }

  @Test
  public void case15() {
    int a = -1568147842;
    int b = 649492931;
    int x0 = -544210970;
    int y0 = 0;
    assertEquals(544210970.0, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 544210970.0);
  }

  @Test
  public void case16() {
    int a = -851399272;
    int b = 0;
    int x0 = -762401940;
    int y0 = 559901120;
    assertEquals(762401940.0, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 762401940.0);
  }

  @Test
  public void case17() {
    int a = -457189178;
    int b = 0;
    int x0 = 0;
    int y0 = 1126486756;
    assertEquals(2.187278369918021e-09, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 2.187278369918021e-09);
  }

  @Test
  public void case18() {
    int a = -169740581;
    int b = 2035575761;
    int x0 = 924505906;
    int y0 = -2073207966;
    assertEquals(2150299751.3459206, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 2150299751.3459206);
  }

  @Test
  public void case19() {
    int a = 0;
    int b = -1804341624;
    int x0 = 0;
    int y0 = -297546872;
    assertEquals(297546872.0, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 297546872.0);
  }

  @Test
  public void case20() {
    int a = 887352994;
    int b = 0;
    int x0 = -1593631248;
    int y0 = -1800776176;
    assertEquals(1593631248.0, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 1593631248.0);
  }

  @Test
  public void case21() {
    int a = 874039624;
    int b = -1736181805;
    int x0 = 109277531;
    int y0 = -2102562332;
    assertEquals(2157575517.7342486, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 2157575517.7342486);
  }

  @Test
  public void case22() {
    int a = 2126901224;
    int b = 0;
    int x0 = -1402314328;
    int y0 = -1897487320;
    assertEquals(1402314328.0, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 1402314328.0);
  }

  @Test
  public void case23() {
    int a = 1937131179;
    int b = 1069415688;
    int x0 = 0;
    int y0 = 1477380511;
    assertEquals(815605010.5106777, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 815605010.5106777);
  }

  @Test
  public void case24() {
    int a = -780521089;
    int b = -45114916;
    int x0 = 300425672;
    int y0 = 1277533513;
    assertEquals(374268413.64843214, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 374268413.64843214);
  }

  @Test
  public void case25() {
    int a = -719544233;
    int b = -845290711;
    int x0 = 1369238103;
    int y0 = -840333872;
    assertEquals(325214699.3926294, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 325214699.3926294);
  }

  @Test
  public void case26() {
    int a = 1657188665;
    int b = 989362243;
    int x0 = 0;
    int y0 = 0;
    assertEquals(6.034315954001532e-10, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 6.034315954001532e-10);
  }

  @Test
  public void case27() {
    int a = 0;
    int b = -2130809015;
    int x0 = 0;
    int y0 = -514714893;
    assertEquals(514714893.0, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 514714893.0);
  }

  @Test
  public void case28() {
    int a = -411639651;
    int b = 0;
    int x0 = 727041475;
    int y0 = -1528538211;
    assertEquals(727041475.0, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 727041475.0);
  }

  @Test
  public void case29() {
    int a = 1760499823;
    int b = 1361204101;
    int x0 = 510990818;
    int y0 = -1685336722;
    assertEquals(792097786.4867821, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 792097786.4867821);
  }

  @Test
  public void case30() {
    int a = 594400399;
    int b = 711893226;
    int x0 = -1405775321;
    int y0 = -929447020;
    assertEquals(2103209293.876101, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 2103209293.876101);
  }

  @Test
  public void case31() {
    int a = 0;
    int b = -1486085067;
    int x0 = -946121651;
    int y0 = -689273609;
    assertEquals(689273609.0, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 689273609.0);
  }

  @Test
  public void case32() {
    int a = 912964595;
    int b = 972752948;
    int x0 = 0;
    int y0 = 0;
    assertEquals(1.028010248702942e-09, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 1.028010248702942e-09);
  }

  @Test
  public void case33() {
    int a = 994056210;
    int b = -1393416347;
    int x0 = 10381251;
    int y0 = 132111755;
    assertEquals(124705822.77713172, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 124705822.77713172);
  }

  @Test
  public void case34() {
    int a = 2007302364;
    int b = -308112422;
    int x0 = -1413532684;
    int y0 = 1674579412;
    assertEquals(1670573540.2836006, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 1670573540.2836006);
  }

  @Test
  public void case35() {
    int a = 565185771;
    int b = 0;
    int x0 = 1013180833;
    int y0 = 0;
    assertEquals(1013180833.0, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 1013180833.0);
  }

  @Test
  public void case36() {
    int a = -1853480675;
    int b = 1984551007;
    int x0 = -101694228;
    int y0 = 0;
    assertEquals(94977798.8533423, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 94977798.8533423);
  }

  @Test
  public void case37() {
    int a = 1535479008;
    int b = 1051733211;
    int x0 = -173568633;
    int y0 = -488466343;
    assertEquals(508145838.3621051, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 508145838.3621051);
  }

  @Test
  public void case38() {
    int a = 270737482;
    int b = 1297953176;
    int x0 = 1930820191;
    int y0 = 792132870;
    assertEquals(1194878829.077725, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 1194878829.077725);
  }

  @Test
  public void case39() {
    int a = 0;
    int b = -303512880;
    int x0 = 600120122;
    int y0 = 1874317933;
    assertEquals(1874317933.0, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 1874317933.0);
  }

  @Test
  public void case40() {
    int a = 1831418372;
    int b = 1525022416;
    int x0 = -328149196;
    int y0 = -1630067958;
    assertEquals(1685507085.1417534, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 1685507085.1417534);
  }

  @Test
  public void case41() {
    int a = 1784551678;
    int b = -1944783475;
    int x0 = 0;
    int y0 = -1520703866;
    assertEquals(1520703866.0, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 1520703866.0);
  }

  @Test
  public void case42() {
    int a = 0;
    int b = -156171033;
    int x0 = -671173395;
    int y0 = 944139506;
    assertEquals(944139506.0, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 944139506.0);
  }

  @Test
  public void case43() {
    int a = 0;
    int b = -914266118;
    int x0 = -899831263;
    int y0 = 253347829;
    assertEquals(253347829.0, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 253347829.0);
  }

  @Test
  public void case44() {
    int a = -768103699;
    int b = 1140575222;
    int x0 = 1301332296;
    int y0 = 683749690;
    assertEquals(192613508.9418782, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 192613508.9418782);
  }

  @Test
  public void case45() {
    int a = -866525973;
    int b = -1572986981;
    int x0 = 0;
    int y0 = -981092426;
    assertEquals(981092426.0, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 981092426.0);
  }

  @Test
  public void case46() {
    int a = 2095200530;
    int b = 942570169;
    int x0 = 1871234403;
    int y0 = 1323239166;
    assertEquals(2466521463.3388205, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 2466521463.3388205);
  }

  @Test
  public void case47() {
    int a = 1116085719;
    int b = 942270053;
    int x0 = 2124143449;
    int y0 = 0;
    assertEquals(2124143449.0, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 2124143449.0);
  }

  @Test
  public void case48() {
    int a = -1884084662;
    int b = 1768542953;
    int x0 = -43946883;
    int y0 = -6778570;
    assertEquals(37584009.58634381, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 37584009.58634381);
  }

  @Test
  public void case49() {
    int a = -663959488;
    int b = 571119000;
    int x0 = 655157794;
    int y0 = -530028964;
    assertEquals(1111073580.0708454, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 1111073580.0708454);
  }

  @Test
  public void case50() {
    int a = 1514025619;
    int b = -1491915732;
    int x0 = -1666374390;
    int y0 = 999601249;
    assertEquals(2651378085.046424, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 2651378085.046424);
  }

  @Test
  public void case51() {
    int a = -100;
    int b = 0;
    int x0 = -999999;
    int y0 = 314159;
    assertEquals(999998.99, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 999998.99);
  }

  @Test
  public void case52() {
    int a = 2000000000;
    int b = 2000000000;
    int x0 = 2000000000;
    int y0 = 2000000000;
    assertEquals(4000000000.0, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 4000000000.0);
  }

  @Test
  public void case53() {
    int a = 0;
    int b = 1;
    int x0 = 1;
    int y0 = 1;
    assertEquals(0.0, manhattanmovement.getDistance(a, b, x0, y0), DELTA);
  }

  @Test
  public void case54() {
    int a = -2147483648;
    int b = -2147483648;
    int x0 = 2147483647;
    int y0 = 2147483647;
    assertEquals(4294967294.0, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 4294967294.0);
  }

  @Test
  public void case55() {
    int a = 100;
    int b = -10000000;
    int x0 = 1;
    int y0 = -10000000;
    assertEquals(10000000.0000099, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 10000000.0000099);
  }

  @Test
  public void case56() {
    int a = 2;
    int b = -2;
    int x0 = 2000000000;
    int y0 = 2000000000;
    assertEquals(0.5, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 0.5);
  }

  @Test
  public void case57() {
    int a = 2147483647;
    int b = 2147483647;
    int x0 = 2147483647;
    int y0 = 2147483647;
    assertEquals(4294967294.0, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 4294967294.0);
  }

  @Test
  public void case58() {
    int a = 30000;
    int b = 30000;
    int x0 = 100000;
    int y0 = 100000;
    assertEquals(199999.99996666668, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 199999.99996666668);
  }

  @Test
  public void case59() {
    int a = 123456789;
    int b = 123456789;
    int x0 = 123456789;
    int y0 = 123456789;
    assertEquals(246913578.0, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 246913578.0);
  }

  @Test
  public void case60() {
    int a = 348736273;
    int b = 348326273;
    int x0 = 332736273;
    int y0 = 328736273;
    assertEquals(661086059.4703065, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 661086059.4703065);
  }

  @Test
  public void case61() {
    int a = -2147483648;
    int b = -2147483648;
    int x0 = 2147483647;
    int y0 = -2147483648;
    assertEquals(1.0, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 1.0);
  }

  @Test
  public void case62() {
    int a = 50000;
    int b = 50000;
    int x0 = 50000;
    int y0 = 50000;
    assertEquals(99999.99998, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 99999.99998);
  }

  @Test
  public void case63() {
    int a = 0;
    int b = -5;
    int x0 = -1;
    int y0 = -4;
    assertEquals(3.8, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 3.8);
  }

  @Test
  public void case64() {
    int a = 1;
    int b = 0;
    int x0 = 1;
    int y0 = 0;
    assertEquals(0.0, manhattanmovement.getDistance(a, b, x0, y0), DELTA);
  }

  @Test
  public void case65() {
    int a = 0;
    int b = -2147483648;
    int x0 = 1;
    int y0 = 100000;
    assertEquals(100000.00000000047, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 100000.00000000047);
  }

  @Test
  public void case66() {
    int a = 3000;
    int b = 3000;
    int x0 = 1000000;
    int y0 = 1000000;
    assertEquals(1999999.9996666666, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 1999999.9996666666);
  }

  @Test
  public void case67() {
    int a = 10;
    int b = 1;
    int x0 = 0;
    int y0 = -100;
    assertEquals(10.1, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 10.1);
  }

  @Test
  public void case68() {
    int a = 1;
    int b = 33;
    int x0 = 4;
    int y0 = 5;
    assertEquals(5.090909090909091, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 5.090909090909091);
  }

  @Test
  public void case69() {
    int a = -2147483648;
    int b = -2147483648;
    int x0 = -2147483648;
    int y0 = -2147483648;
    assertEquals(4294967296.0, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 4294967296.0);
  }

  @Test
  public void case70() {
    int a = 34534344;
    int b = 342432;
    int x0 = 10000000;
    int y0 = 45433443;
    assertEquals(10450504.134474799, manhattanmovement.getDistance(a, b, x0, y0), DELTA * 10450504.134474799);
  }

}
