package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class FactorialGCDTest {
  FactorialGCD factorialgcd = new FactorialGCD();

  @Test
  public void case1() {
    int a = 5;
    int b = 20;
    assertEquals(20, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case2() {
    int a = 7;
    int b = 5040;
    assertEquals(5040, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case3() {
    int a = 0;
    int b = 2425;
    assertEquals(1, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case4() {
    int a = 667024;
    int b = 1;
    assertEquals(1, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case5() {
    int a = 4;
    int b = 40;
    assertEquals(8, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case6() {
    int a = 385791261;
    int b = 96343446;
    assertEquals(96343446, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case7() {
    int a = 1;
    int b = 1;
    assertEquals(1, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case8() {
    int a = 0;
    int b = 1;
    assertEquals(1, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case9() {
    int a = 0;
    int b = 2;
    assertEquals(1, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case10() {
    int a = 2097711064;
    int b = 2147483646;
    assertEquals(2147483646, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case11() {
    int a = 1023941542;
    int b = 2147443641;
    assertEquals(2147443641, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case12() {
    int a = 2147483646;
    int b = 2147483647;
    assertEquals(1, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case13() {
    int a = 2147483647;
    int b = 2147483647;
    assertEquals(2147483647, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case14() {
    int a = 0;
    int b = 2147483647;
    assertEquals(1, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case15() {
    int a = 2;
    int b = 2147483646;
    assertEquals(2, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case16() {
    int a = 29;
    int b = 1073741824;
    assertEquals(33554432, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case17() {
    int a = 30;
    int b = 1073741824;
    assertEquals(67108864, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case18() {
    int a = 31;
    int b = 1073741824;
    assertEquals(67108864, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case19() {
    int a = 32;
    int b = 1073741824;
    assertEquals(1073741824, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case20() {
    int a = 33;
    int b = 1073741824;
    assertEquals(1073741824, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case21() {
    int a = 37;
    int b = 1073741824;
    assertEquals(1073741824, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case22() {
    int a = 999999999;
    int b = 1073741824;
    assertEquals(1073741824, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case23() {
    int a = 2;
    int b = 2147483578;
    assertEquals(2, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case24() {
    int a = 0;
    int b = 2147483578;
    assertEquals(1, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case25() {
    int a = 1073741788;
    int b = 2147483578;
    assertEquals(2, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case26() {
    int a = 1073741789;
    int b = 2147483578;
    assertEquals(2147483578, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case27() {
    int a = 1073741790;
    int b = 2147483578;
    assertEquals(2147483578, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case28() {
    int a = 2073741789;
    int b = 2147483578;
    assertEquals(2147483578, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case29() {
    int a = 2;
    int b = 2147483643;
    assertEquals(1, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case30() {
    int a = 3;
    int b = 2147483643;
    assertEquals(3, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case31() {
    int a = 6;
    int b = 2147483643;
    assertEquals(3, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case32() {
    int a = 715827880;
    int b = 2147483643;
    assertEquals(3, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case33() {
    int a = 715827881;
    int b = 2147483643;
    assertEquals(2147483643, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case34() {
    int a = 1158278867;
    int b = 2147483643;
    assertEquals(2147483643, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case35() {
    int a = 715827820;
    int b = 2147483463;
    assertEquals(3, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case36() {
    int a = 715827821;
    int b = 2147483463;
    assertEquals(2147483463, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case37() {
    int a = 17;
    int b = 2147483463;
    assertEquals(3, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case38() {
    int a = 1599120045;
    int b = 1599120121;
    assertEquals(1599120121, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case39() {
    int a = 39990;
    int b = 1599120121;
    assertEquals(39989, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case40() {
    int a = 39989;
    int b = 1599120121;
    assertEquals(39989, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case41() {
    int a = 39988;
    int b = 1599120121;
    assertEquals(1, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case42() {
    int a = 79977;
    int b = 1599120121;
    assertEquals(39989, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case43() {
    int a = 79978;
    int b = 1599120121;
    assertEquals(1599120121, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case44() {
    int a = 79979;
    int b = 1599120121;
    assertEquals(1599120121, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case45() {
    int a = 39978;
    int b = 1598720231;
    assertEquals(1, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case46() {
    int a = 39979;
    int b = 1598720231;
    assertEquals(39979, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case47() {
    int a = 39988;
    int b = 1598720231;
    assertEquals(39979, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case48() {
    int a = 39989;
    int b = 1598720231;
    assertEquals(1598720231, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case49() {
    int a = 100000;
    int b = 1598720231;
    assertEquals(1598720231, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case50() {
    int a = 10;
    int b = 479001600;
    assertEquals(3628800, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case51() {
    int a = 11;
    int b = 479001600;
    assertEquals(39916800, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case52() {
    int a = 12;
    int b = 479001600;
    assertEquals(479001600, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case53() {
    int a = 13;
    int b = 479001600;
    assertEquals(479001600, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case54() {
    int a = 77;
    int b = 479001600;
    assertEquals(479001600, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case55() {
    int a = 2;
    int b = 223092870;
    assertEquals(2, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case56() {
    int a = 3;
    int b = 223092870;
    assertEquals(6, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case57() {
    int a = 4;
    int b = 223092870;
    assertEquals(6, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case58() {
    int a = 5;
    int b = 223092870;
    assertEquals(30, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case59() {
    int a = 10;
    int b = 223092870;
    assertEquals(210, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case60() {
    int a = 22;
    int b = 223092870;
    assertEquals(9699690, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case61() {
    int a = 23;
    int b = 223092870;
    assertEquals(223092870, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case62() {
    int a = 24;
    int b = 223092870;
    assertEquals(223092870, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case63() {
    int a = 223082870;
    int b = 223092870;
    assertEquals(223092870, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case64() {
    int a = 1367309;
    int b = 409896946;
    assertEquals(206, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case65() {
    int a = 9270;
    int b = 1112192814;
    assertEquals(17958, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case66() {
    int a = 28816;
    int b = 834003385;
    assertEquals(2945, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case67() {
    int a = 1602946251;
    int b = 1756164196;
    assertEquals(1756164196, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case68() {
    int a = 412402369;
    int b = 766144549;
    assertEquals(766144549, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case69() {
    int a = 1277916637;
    int b = 1424271235;
    assertEquals(1424271235, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case70() {
    int a = 37869;
    int b = 343162006;
    assertEquals(1826, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case71() {
    int a = 261617;
    int b = 1173411407;
    assertEquals(1687, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case72() {
    int a = 134882;
    int b = 734835850;
    assertEquals(2450, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case73() {
    int a = 5820691;
    int b = 739469855;
    assertEquals(5, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case74() {
    int a = 849672;
    int b = 287883921;
    assertEquals(39, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case75() {
    int a = 67640378;
    int b = 711370130;
    assertEquals(10, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case76() {
    int a = 779595530;
    int b = 717226577;
    assertEquals(717226577, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case77() {
    int a = 511837552;
    int b = 2009683795;
    assertEquals(2009683795, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case78() {
    int a = 39268;
    int b = 631653570;
    assertEquals(12330, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case79() {
    int a = 10141;
    int b = 2020659627;
    assertEquals(68901, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case80() {
    int a = 11348421;
    int b = 1848214524;
    assertEquals(156, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case81() {
    int a = 9508;
    int b = 10694961;
    assertEquals(333, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case82() {
    int a = 1876075859;
    int b = 1710011182;
    assertEquals(1710011182, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case83() {
    int a = 465961;
    int b = 444432695;
    assertEquals(245, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case84() {
    int a = 2145;
    int b = 852254625;
    assertEquals(274125, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case85() {
    int a = 136523;
    int b = 667072425;
    assertEquals(1425, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case86() {
    int a = 10295;
    int b = 648661050;
    assertEquals(13950, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case87() {
    int a = 29851743;
    int b = 822897489;
    assertEquals(3, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case88() {
    int a = 912989102;
    int b = 821367352;
    assertEquals(821367352, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case89() {
    int a = 155799738;
    int b = 1164367549;
    assertEquals(1164367549, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case90() {
    int a = 14174;
    int b = 412921215;
    assertEquals(22995, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case91() {
    int a = 42005580;
    int b = 1767621623;
    assertEquals(19, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case92() {
    int a = 1818206932;
    int b = 696456218;
    assertEquals(696456218, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case93() {
    int a = 2674;
    int b = 429771106;
    assertEquals(129958, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case94() {
    int a = 121745;
    int b = 584675662;
    assertEquals(1394, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case95() {
    int a = 4530610;
    int b = 572618429;
    assertEquals(17, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case96() {
    int a = 80865;
    int b = 2099229344;
    assertEquals(7456, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case97() {
    int a = 2936;
    int b = 206274487;
    assertEquals(1, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case98() {
    int a = 2722;
    int b = 1526721118;
    assertEquals(26, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case99() {
    int a = 57687;
    int b = 1326706560;
    assertEquals(17280, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case100() {
    int a = 85838;
    int b = 842071422;
    assertEquals(2586, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case101() {
    int a = 186767;
    int b = 1235052527;
    assertEquals(3499, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case102() {
    int a = 3235;
    int b = 49867927;
    assertEquals(15311, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case103() {
    int a = 255738;
    int b = 1023941542;
    assertEquals(1118, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case104() {
    int a = 339471874;
    int b = 202602857;
    assertEquals(202602857, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case105() {
    int a = 930600;
    int b = 1525633650;
    assertEquals(1350, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case106() {
    int a = 49710;
    int b = 600069565;
    assertEquals(2605, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case107() {
    int a = 11739903;
    int b = 126343446;
    assertEquals(6, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case108() {
    int a = 1735596738;
    int b = 243342829;
    assertEquals(243342829, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case109() {
    int a = 355913033;
    int b = 1702403026;
    assertEquals(2, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case110() {
    int a = 3205;
    int b = 284962264;
    assertEquals(8, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case111() {
    int a = 1427516445;
    int b = 182005171;
    assertEquals(182005171, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case112() {
    int a = 470;
    int b = 1911885669;
    assertEquals(603, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case113() {
    int a = 1595;
    int b = 2070709893;
    assertEquals(223209, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case114() {
    int a = 95883;
    int b = 1994106265;
    assertEquals(14935, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case115() {
    int a = 11181945;
    int b = 852484138;
    assertEquals(22, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case116() {
    int a = 500259;
    int b = 689230118;
    assertEquals(1142, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case117() {
    int a = 2250;
    int b = 1126879965;
    assertEquals(151605, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case118() {
    int a = 142292077;
    int b = 1229405945;
    assertEquals(5, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case119() {
    int a = 11032588;
    int b = 1070801962;
    assertEquals(38, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case120() {
    int a = 180419;
    int b = 1150030841;
    assertEquals(6137, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case121() {
    int a = 94240230;
    int b = 1749232153;
    assertEquals(17, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case122() {
    int a = 1592513725;
    int b = 898667024;
    assertEquals(898667024, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case123() {
    int a = 39889;
    int b = 17516151;
    assertEquals(17516151, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case124() {
    int a = 2147483641;
    int b = 2147483641;
    assertEquals(2147483641, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case125() {
    int a = 19;
    int b = 300000000;
    assertEquals(96000, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case126() {
    int a = 2147483646;
    int b = 2147483647;
    assertEquals(1, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case127() {
    int a = 2097711064;
    int b = 2147483646;
    assertEquals(2147483646, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case128() {
    int a = 2147483647;
    int b = 2147483646;
    assertEquals(2147483646, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case129() {
    int a = 2;
    int b = 2;
    assertEquals(2, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case130() {
    int a = 2147483647;
    int b = 2147483647;
    assertEquals(2147483647, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case131() {
    int a = 45;
    int b = 433465634;
    assertEquals(14, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case132() {
    int a = 2147483645;
    int b = 2147483647;
    assertEquals(1, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case133() {
    int a = 2147483625;
    int b = 85899345;
    assertEquals(85899345, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case134() {
    int a = 2436;
    int b = 2147483647;
    assertEquals(1, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case135() {
    int a = 987234323;
    int b = 2147483646;
    assertEquals(2147483646, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case136() {
    int a = 2000000010;
    int b = 2000000011;
    assertEquals(1, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case137() {
    int a = 2147483646;
    int b = 21474836;
    assertEquals(21474836, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case138() {
    int a = 1000000000;
    int b = 2038074743;
    assertEquals(1, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case139() {
    int a = 40009;
    int b = 1600720081;
    assertEquals(40009, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case140() {
    int a = 100000006;
    int b = 100000007;
    assertEquals(1, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case141() {
    int a = 2097711064;
    int b = 2147483647;
    assertEquals(1, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case142() {
    int a = 2147483646;
    int b = 22222;
    assertEquals(22222, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case143() {
    int a = 2147483646;
    int b = 1;
    assertEquals(1, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case144() {
    int a = 2147483641;
    int b = 2147483643;
    assertEquals(2147483643, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case145() {
    int a = 2147483647;
    int b = 2099999999;
    assertEquals(2099999999, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case146() {
    int a = 234534;
    int b = 33556226;
    assertEquals(33556226, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case147() {
    int a = 0;
    int b = 2;
    assertEquals(1, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case148() {
    int a = 1000099993;
    int b = 1000099993;
    assertEquals(1000099993, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case149() {
    int a = 2147483646;
    int b = 2147483646;
    assertEquals(2147483646, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case150() {
    int a = 9992;
    int b = 999010081;
    assertEquals(9991, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case151() {
    int a = 17;
    int b = 2147489;
    assertEquals(1, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case152() {
    int a = 2;
    int b = 40;
    assertEquals(2, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case153() {
    int a = 123456789;
    int b = 1147483647;
    assertEquals(1147483647, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case154() {
    int a = 14;
    int b = 17;
    assertEquals(1, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case155() {
    int a = 7;
    int b = 21;
    assertEquals(21, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case156() {
    int a = 2124483647;
    int b = 2147483647;
    assertEquals(1, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case157() {
    int a = 99999971;
    int b = 99999989;
    assertEquals(1, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case158() {
    int a = 21556233;
    int b = 1555;
    assertEquals(1555, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case159() {
    int a = 2097711064;
    int b = 2147483645;
    assertEquals(2147483645, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case160() {
    int a = 5;
    int b = 125;
    assertEquals(5, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case161() {
    int a = 2097711071;
    int b = 2097711071;
    assertEquals(2097711071, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case162() {
    int a = 1000099993;
    int b = 1000099999;
    assertEquals(1, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case163() {
    int a = 2097711070;
    int b = 2097711071;
    assertEquals(1, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case164() {
    int a = 2346;
    int b = 2147483647;
    assertEquals(1, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case165() {
    int a = 2111111064;
    int b = 2147181146;
    assertEquals(2147181146, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case166() {
    int a = 3;
    int b = 32;
    assertEquals(2, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case167() {
    int a = 2097711064;
    int b = 5;
    assertEquals(5, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case168() {
    int a = 1073741820;
    int b = 2147483647;
    assertEquals(1, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case169() {
    int a = 100000001;
    int b = 100000037;
    assertEquals(1, factorialgcd.factGCD(a, b));
  }

  @Test
  public void case170() {
    int a = 1073741717;
    int b = 1073741717;
    assertEquals(1073741717, factorialgcd.factGCD(a, b));
  }

}
