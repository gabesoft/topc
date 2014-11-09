package topc.test.graph;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.graph.*;

public class MultiplesWithLimitTest {
  MultiplesWithLimit multipleswithlimit = new MultiplesWithLimit();

  @Test
  public void case1() {
    int N = 8;
    int[] forbiddenDigits = { 2, 3, 4, 5, 6, 7, 8, 9 };
    assertEquals("1000", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case2() {
    int N = 9;
    int[] forbiddenDigits = { 1, 3, 4, 5, 6, 7, 8, 9 };
    assertEquals("222...222(9 digits)", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case3() {
    int N = 524;
    int[] forbiddenDigits = { 5, 2, 4 };
    assertEquals("3668", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case4() {
    int N = 10000;
    int[] forbiddenDigits = { 0 };
    assertEquals("IMPOSSIBLE", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case5() {
    int N = 1;
    int[] forbiddenDigits = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    assertEquals("IMPOSSIBLE", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case6() {
    int N = 2007;
    int[] forbiddenDigits = { 1, 2, 3, 4, 5, 6, 8, 9, 0 };
    assertEquals("777...777(666 digits)", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case7() {
    int N = 100;
    int[] forbiddenDigits = { 1, 2, 3 };
    assertEquals("400", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case8() {
    int N = 200;
    int[] forbiddenDigits = { 3, 4, 5 };
    assertEquals("200", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case9() {
    int N = 862;
    int[] forbiddenDigits = { 1, 4, 6, 7, 8 };
    assertEquals("99992", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case10() {
    int N = 7048;
    int[] forbiddenDigits = { 1, 4, 5, 6, 7, 9 };
    assertEquals("2332888", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case11() {
    int N = 4261;
    int[] forbiddenDigits = { 0, 2, 3, 5, 6, 7, 8 };
    assertEquals("9199499", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case12() {
    int N = 6867;
    int[] forbiddenDigits = { 0, 4, 5, 7 };
    assertEquals("96138", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case13() {
    int N = 9543;
    int[] forbiddenDigits = { 0, 1, 2, 3, 5, 8 };
    assertEquals("6479697", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case14() {
    int N = 7341;
    int[] forbiddenDigits = { 1, 2, 3, 5, 7, 9 };
    assertEquals("44046", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case15() {
    int N = 7008;
    int[] forbiddenDigits = { 3, 5, 6, 7, 8 };
    assertEquals("21024", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case16() {
    int N = 4064;
    int[] forbiddenDigits = { 0, 4, 5, 6, 8, 9 };
    assertEquals("337312", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case17() {
    int N = 5194;
    int[] forbiddenDigits = { 4, 5, 7 };
    assertEquals("10388", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case18() {
    int N = 4074;
    int[] forbiddenDigits = { 1, 2, 4, 5, 6 };
    assertEquals("387030", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case19() {
    int N = 8794;
    int[] forbiddenDigits = { 1, 2, 3, 5, 6, 7, 8, 9 };
    assertEquals("444...404(14 digits)", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case20() {
    int N = 9723;
    int[] forbiddenDigits = { 1, 2, 3, 8, 9 };
    assertEquals("466704", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case21() {
    int N = 1940;
    int[] forbiddenDigits = { 0, 3, 4, 8, 9 };
    assertEquals("IMPOSSIBLE", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case22() {
    int N = 824;
    int[] forbiddenDigits = { 1, 3, 4, 8, 9 };
    assertEquals("20600", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case23() {
    int N = 9799;
    int[] forbiddenDigits = { 4, 7 };
    assertEquals("19598", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case24() {
    int N = 9334;
    int[] forbiddenDigits = { 1, 2, 3, 6, 8 };
    assertEquals("700050", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case25() {
    int N = 5310;
    int[] forbiddenDigits = { 0, 1, 4, 6, 9 };
    assertEquals("IMPOSSIBLE", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case26() {
    int N = 1926;
    int[] forbiddenDigits = { 2, 4, 8, 9 };
    assertEquals("11556", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case27() {
    int N = 2421;
    int[] forbiddenDigits = { 0, 6, 8, 9 };
    assertEquals("2421", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case28() {
    int N = 1719;
    int[] forbiddenDigits = { 0, 1, 2, 4 };
    assertEquals("6876", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case29() {
    int N = 3778;
    int[] forbiddenDigits = { 2, 3, 8 };
    assertEquals("7556", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case30() {
    int N = 4990;
    int[] forbiddenDigits = { 0, 3, 8, 9 };
    assertEquals("IMPOSSIBLE", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case31() {
    int N = 5570;
    int[] forbiddenDigits = { 0, 3, 4, 7, 8, 9 };
    assertEquals("IMPOSSIBLE", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case32() {
    int N = 5334;
    int[] forbiddenDigits = { 0, 1, 2, 4, 6, 7, 8, 9 };
    assertEquals("IMPOSSIBLE", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case33() {
    int N = 4892;
    int[] forbiddenDigits = { 0, 3, 4, 9 };
    assertEquals("78272", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case34() {
    int N = 8712;
    int[] forbiddenDigits = { 0, 8, 9 };
    assertEquals("17424", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case35() {
    int N = 2568;
    int[] forbiddenDigits = { 2, 3, 4, 8, 9 };
    assertEquals("115560", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case36() {
    int N = 3432;
    int[] forbiddenDigits = { 1, 3, 5, 8 };
    assertEquals("24024", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case37() {
    int N = 2821;
    int[] forbiddenDigits = { 1, 2, 3, 4, 5, 6, 8, 9 };
    assertEquals("777...777(9 digits)", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case38() {
    int N = 7531;
    int[] forbiddenDigits = { 0, 3, 5 };
    assertEquals("67779", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case39() {
    int N = 1630;
    int[] forbiddenDigits = { 2, 5, 6, 7, 9 };
    assertEquals("11410", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case40() {
    int N = 4433;
    int[] forbiddenDigits = { 1, 2, 5, 7, 8, 9 };
    assertEquals("4433", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case41() {
    int N = 1818;
    int[] forbiddenDigits = { 0, 4, 6, 8 };
    assertEquals("7272", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case42() {
    int N = 6221;
    int[] forbiddenDigits = { 1, 4, 5, 6 };
    assertEquals("80873", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case43() {
    int N = 3516;
    int[] forbiddenDigits = { 1, 9 };
    assertEquals("7032", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case44() {
    int N = 7220;
    int[] forbiddenDigits = { 2, 3, 4, 5, 9 };
    assertEquals("101080", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case45() {
    int N = 9327;
    int[] forbiddenDigits = { 1, 3, 4, 5, 8, 9 };
    assertEquals("22767207", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case46() {
    int N = 6143;
    int[] forbiddenDigits = { 0, 3, 5, 6, 7 };
    assertEquals("18429", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case47() {
    int N = 76;
    int[] forbiddenDigits = { 1, 6, 7, 8, 9 };
    assertEquals("304", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case48() {
    int N = 5052;
    int[] forbiddenDigits = { 1, 3, 5, 6 };
    assertEquals("20208", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case49() {
    int N = 2818;
    int[] forbiddenDigits = { 0, 1, 3, 4, 5, 6, 8 };
    assertEquals("22977972", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case50() {
    int N = 4910;
    int[] forbiddenDigits = { 0, 3, 4, 5, 7, 8, 9 };
    assertEquals("IMPOSSIBLE", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case51() {
    int N = 3336;
    int[] forbiddenDigits = { 0, 1, 7, 8, 9 };
    assertEquals("3336", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case52() {
    int N = 1247;
    int[] forbiddenDigits = { 3, 5, 7, 8 };
    assertEquals("2494", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case53() {
    int N = 7268;
    int[] forbiddenDigits = { 0, 2, 3, 5 };
    assertEquals("79948", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case54() {
    int N = 2102;
    int[] forbiddenDigits = { 0, 2, 3, 4, 8, 9 };
    assertEquals("5166716", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case55() {
    int N = 7664;
    int[] forbiddenDigits = { 0, 1, 9 };
    assertEquals("7664", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case56() {
    int N = 9416;
    int[] forbiddenDigits = { 2, 6, 7 };
    assertEquals("404888", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case57() {
    int N = 2034;
    int[] forbiddenDigits = { 0, 1, 3, 5, 7, 8 };
    assertEquals("26442", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case58() {
    int N = 8490;
    int[] forbiddenDigits = { 0, 2, 3, 7, 8, 9 };
    assertEquals("IMPOSSIBLE", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case59() {
    int N = 1949;
    int[] forbiddenDigits = { 0, 1, 5, 6, 7, 9 };
    assertEquals("23388", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case60() {
    int N = 3845;
    int[] forbiddenDigits = { 1, 2, 3, 4, 6, 7, 8, 9 };
    assertEquals("500...005(12 digits)", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case61() {
    int N = 7262;
    int[] forbiddenDigits = { 5 };
    assertEquals("7262", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case62() {
    int N = 9787;
    int[] forbiddenDigits = { 1, 6, 7, 8 };
    assertEquals("342545", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case63() {
    int N = 631;
    int[] forbiddenDigits = { 0, 1, 3, 6, 8, 9 };
    assertEquals("2524", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case64() {
    int N = 2660;
    int[] forbiddenDigits = { 0, 5, 7, 8 };
    assertEquals("IMPOSSIBLE", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case65() {
    int N = 9847;
    int[] forbiddenDigits = { 0, 2, 7, 8 };
    assertEquals("19694", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case66() {
    int N = 2561;
    int[] forbiddenDigits = { 4, 6, 7, 9 };
    assertEquals("5122", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case67() {
    int N = 7011;
    int[] forbiddenDigits = { 0, 1, 2, 4, 5, 6, 7 };
    assertEquals("33393393", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case68() {
    int N = 4155;
    int[] forbiddenDigits = { 0, 1, 2, 6, 7, 8 };
    assertEquals("494445", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case69() {
    int N = 2969;
    int[] forbiddenDigits = { 3, 4, 5, 6, 9 };
    assertEquals("112822", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case70() {
    int N = 8655;
    int[] forbiddenDigits = { 0, 2, 6, 7, 9 };
    assertEquals("354855", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case71() {
    int N = 7782;
    int[] forbiddenDigits = { 3, 4, 5, 8, 9 };
    assertEquals("101166", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case72() {
    int N = 1569;
    int[] forbiddenDigits = { 0, 1, 2, 3, 6, 7 };
    assertEquals("589944", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case73() {
    int N = 268;
    int[] forbiddenDigits = { 3, 4, 5, 6, 7, 8 };
    assertEquals("9112", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case74() {
    int N = 9736;
    int[] forbiddenDigits = { 2, 3, 4, 5, 7, 8 };
    assertEquals("6669160", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case75() {
    int N = 686;
    int[] forbiddenDigits = { 1, 2, 3, 4, 5, 7 };
    assertEquals("686", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case76() {
    int N = 197;
    int[] forbiddenDigits = { 1, 2, 3 };
    assertEquals("788", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case77() {
    int N = 9316;
    int[] forbiddenDigits = { 2, 3, 4, 7, 9 };
    assertEquals("680068", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case78() {
    int N = 9646;
    int[] forbiddenDigits = { 1, 4, 8, 9 };
    assertEquals("67522", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case79() {
    int N = 1809;
    int[] forbiddenDigits = { 0, 2, 4, 5, 6, 7, 9 };
    assertEquals("3133188", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case80() {
    int N = 1752;
    int[] forbiddenDigits = { 1, 7, 8 };
    assertEquals("3504", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case81() {
    int N = 5422;
    int[] forbiddenDigits = { 0, 2, 4, 5, 8, 9 };
    assertEquals("1371766", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case82() {
    int N = 2289;
    int[] forbiddenDigits = { 1, 2, 4, 5, 8, 9 };
    assertEquals("670677", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case83() {
    int N = 471;
    int[] forbiddenDigits = { 0, 3, 4, 7, 8 };
    assertEquals("5652", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case84() {
    int N = 1083;
    int[] forbiddenDigits = { 4, 7, 8 };
    assertEquals("2166", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case85() {
    int N = 6436;
    int[] forbiddenDigits = { 3, 4, 5, 6, 7 };
    assertEquals("180208", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case86() {
    int N = 5073;
    int[] forbiddenDigits = { 0, 1, 2, 3, 6, 7, 9 };
    assertEquals("4555554", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case87() {
    int N = 263;
    int[] forbiddenDigits = { 0, 1, 2, 3, 6, 8 };
    assertEquals("4997", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case88() {
    int N = 5288;
    int[] forbiddenDigits = { 2, 3, 4, 6, 7, 9 };
    assertEquals("185080", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case89() {
    int N = 4677;
    int[] forbiddenDigits = { 0, 1, 5 };
    assertEquals("4677", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case90() {
    int N = 8681;
    int[] forbiddenDigits = { 0, 1, 4, 6, 7, 8 };
    assertEquals("3229332", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case91() {
    int N = 4309;
    int[] forbiddenDigits = { 4, 5, 7, 8, 9 };
    assertEquals("30163", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case92() {
    int N = 1227;
    int[] forbiddenDigits = { 0, 3, 4, 5, 6, 7, 8 };
    assertEquals("9112929", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case93() {
    int N = 8610;
    int[] forbiddenDigits = { 0, 1, 3, 4, 9 };
    assertEquals("IMPOSSIBLE", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case94() {
    int N = 3434;
    int[] forbiddenDigits = { 1, 2, 4, 5, 6, 8 };
    assertEquals("703970", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case95() {
    int N = 9974;
    int[] forbiddenDigits = { 0, 1, 3, 5, 8 };
    assertEquals("9974", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case96() {
    int N = 9565;
    int[] forbiddenDigits = { 2, 4, 5 };
    assertEquals("19130", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case97() {
    int N = 3904;
    int[] forbiddenDigits = { 6, 8 };
    assertEquals("3904", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case98() {
    int N = 9704;
    int[] forbiddenDigits = { 1, 2, 4, 5, 7 };
    assertEquals("698688", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case99() {
    int N = 4784;
    int[] forbiddenDigits = { 0, 1, 2, 4, 9 };
    assertEquals("368368", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case100() {
    int N = 4485;
    int[] forbiddenDigits = { 6, 9 };
    assertEquals("4485", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case101() {
    int N = 4774;
    int[] forbiddenDigits = { 3, 5, 6, 8 };
    assertEquals("4774", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case102() {
    int N = 2060;
    int[] forbiddenDigits = { 0, 1, 5, 6, 8, 9 };
    assertEquals("IMPOSSIBLE", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case103() {
    int N = 1380;
    int[] forbiddenDigits = { 1, 3, 4, 7, 8, 9 };
    assertEquals("5520", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case104() {
    int N = 4477;
    int[] forbiddenDigits = { 4, 5, 6 };
    assertEquals("17908", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case105() {
    int N = 2115;
    int[] forbiddenDigits = { 0, 1, 2, 3, 4, 5, 8, 9 };
    assertEquals("IMPOSSIBLE", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case106() {
    int N = 8757;
    int[] forbiddenDigits = { 2, 3, 6, 7, 8 };
    assertEquals("499149", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case107() {
    int N = 560;
    int[] forbiddenDigits = { 2, 6, 9 };
    assertEquals("4480", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case108() {
    int N = 262;
    int[] forbiddenDigits = { 0, 1, 2, 3, 7, 8, 9 };
    assertEquals("4454", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case109() {
    int N = 9981;
    int[] forbiddenDigits = { 0, 2, 3, 4, 5, 6, 7, 8, 9 };
    assertEquals("111...111(9972 digits)", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case110() {
    int N = 1;
    int[] forbiddenDigits = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
    assertEquals("IMPOSSIBLE", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case111() {
    int N = 1;
    int[] forbiddenDigits = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
    assertEquals("9", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case112() {
    int N = 1;
    int[] forbiddenDigits = {  };
    assertEquals("1", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case113() {
    int N = 5;
    int[] forbiddenDigits = { 5 };
    assertEquals("10", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case114() {
    int N = 4;
    int[] forbiddenDigits = { 4, 8 };
    assertEquals("12", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case115() {
    int N = 3;
    int[] forbiddenDigits = { 3, 6, 9 };
    assertEquals("12", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case116() {
    int N = 8;
    int[] forbiddenDigits = { 2, 4, 6, 8 };
    assertEquals("1000", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case117() {
    int N = 9;
    int[] forbiddenDigits = { 1, 2, 3, 4, 5, 6, 9 };
    assertEquals("77778", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case118() {
    int N = 9;
    int[] forbiddenDigits = { 1, 2, 3, 4, 5, 6, 7, 9 };
    assertEquals("888...888(9 digits)", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case119() {
    int N = 9;
    int[] forbiddenDigits = { 0, 1, 2, 3, 4, 5, 6, 7, 9 };
    assertEquals("888...888(9 digits)", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case120() {
    int N = 10000;
    int[] forbiddenDigits = {  };
    assertEquals("10000", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case121() {
    int N = 625;
    int[] forbiddenDigits = { 5 };
    assertEquals("10000", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case122() {
    int N = 999;
    int[] forbiddenDigits = { 9 };
    assertEquals("111888", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case123() {
    int N = 7999;
    int[] forbiddenDigits = { 9 };
    assertEquals("1007874", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case124() {
    int N = 9999;
    int[] forbiddenDigits = { 9 };
    assertEquals("11118888", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case125() {
    int N = 399;
    int[] forbiddenDigits = { 8, 9 };
    assertEquals("10374", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case126() {
    int N = 998;
    int[] forbiddenDigits = { 8, 9 };
    assertEquals("111776", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case127() {
    int N = 3999;
    int[] forbiddenDigits = { 8, 9 };
    assertEquals("1011747", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case128() {
    int N = 9998;
    int[] forbiddenDigits = { 8, 9 };
    assertEquals("11117776", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case129() {
    int N = 172;
    int[] forbiddenDigits = { 2, 4, 6 };
    assertEquals("11008", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case130() {
    int N = 996;
    int[] forbiddenDigits = { 2, 4, 6 };
    assertEquals("301788", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case131() {
    int N = 1992;
    int[] forbiddenDigits = { 2, 4, 6 };
    assertEquals("1770888", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case132() {
    int N = 9996;
    int[] forbiddenDigits = { 2, 4, 6 };
    assertEquals("30017988", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case133() {
    int N = 8192;
    int[] forbiddenDigits = { 2, 4, 6, 8 };
    assertEquals("100...000(14 digits)", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case134() {
    int N = 8192;
    int[] forbiddenDigits = { 1, 2, 4, 6, 8 };
    assertEquals("300...000(14 digits)", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case135() {
    int N = 8192;
    int[] forbiddenDigits = { 1, 2, 3, 4, 6, 8 };
    assertEquals("500...000(14 digits)", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case136() {
    int N = 7992;
    int[] forbiddenDigits = { 2, 3, 4, 6, 7, 8, 9 };
    assertEquals("111...000(18 digits)", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case137() {
    int N = 9999;
    int[] forbiddenDigits = { 1, 2, 3, 5, 6, 7, 9 };
    assertEquals("444...888(20 digits)", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case138() {
    int N = 7992;
    int[] forbiddenDigits = { 1, 2, 3, 4, 5, 6, 8, 9 };
    assertEquals("777...000(30 digits)", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case139() {
    int N = 9999;
    int[] forbiddenDigits = { 1, 2, 3, 4, 5, 6, 7, 9 };
    assertEquals("888...888(36 digits)", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case140() {
    int N = 9927;
    int[] forbiddenDigits = { 0, 1, 2, 3, 4, 5, 6, 7, 9 };
    assertEquals("888...888(9918 digits)", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case141() {
    int N = 9931;
    int[] forbiddenDigits = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
    assertEquals("999...999(9930 digits)", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case142() {
    int N = 9949;
    int[] forbiddenDigits = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
    assertEquals("999...999(9948 digits)", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case143() {
    int N = 9967;
    int[] forbiddenDigits = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
    assertEquals("999...999(9966 digits)", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case144() {
    int N = 8;
    int[] forbiddenDigits = { 2, 3, 4, 5, 6, 7, 8, 9 };
    assertEquals("1000", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case145() {
    int N = 524;
    int[] forbiddenDigits = { 5, 2, 4 };
    assertEquals("3668", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case146() {
    int N = 8;
    int[] forbiddenDigits = {  };
    assertEquals("8", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case147() {
    int N = 9;
    int[] forbiddenDigits = { 1, 3, 4, 5, 6, 7, 8, 9 };
    assertEquals("222...222(9 digits)", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case148() {
    int N = 8786;
    int[] forbiddenDigits = { 1, 3, 5, 6, 9 };
    assertEquals("70288", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case149() {
    int N = 8192;
    int[] forbiddenDigits = { 2, 3, 4, 5, 6, 7, 8, 9 };
    assertEquals("100...000(14 digits)", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case150() {
    int N = 1;
    int[] forbiddenDigits = {  };
    assertEquals("1", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case151() {
    int N = 4433;
    int[] forbiddenDigits = { 0, 2, 4, 6, 8, 9, 3, 5 };
    assertEquals("777...777(10 digits)", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case152() {
    int N = 9999;
    int[] forbiddenDigits = { 0, 2, 3, 4, 5, 6, 7, 8, 9 };
    assertEquals("111...111(36 digits)", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case153() {
    int N = 81;
    int[] forbiddenDigits = { 0, 1, 3, 4, 5, 6, 7, 8, 9 };
    assertEquals("222...222(81 digits)", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case154() {
    int N = 6561;
    int[] forbiddenDigits = { 1, 3, 4, 5, 6, 7, 8, 9 };
    assertEquals("200...202(13 digits)", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case155() {
    int N = 81;
    int[] forbiddenDigits = { 2, 3, 4, 5, 6, 7, 8, 9 };
    assertEquals("111...101(10 digits)", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case156() {
    int N = 9997;
    int[] forbiddenDigits = { 0, 2, 3, 4, 5, 6, 7, 8, 9 };
    assertEquals("111...111(192 digits)", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case157() {
    int N = 2121;
    int[] forbiddenDigits = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
    assertEquals("999...999(12 digits)", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case158() {
    int N = 9999;
    int[] forbiddenDigits = { 2, 3, 4, 5, 6, 7, 8, 9, 0 };
    assertEquals("111...111(36 digits)", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case159() {
    int N = 1;
    int[] forbiddenDigits = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    assertEquals("IMPOSSIBLE", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case160() {
    int N = 27;
    int[] forbiddenDigits = { 1, 3, 4, 5, 6, 7, 8, 9 };
    assertEquals("220...222(10 digits)", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case161() {
    int N = 2;
    int[] forbiddenDigits = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    assertEquals("IMPOSSIBLE", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case162() {
    int N = 2;
    int[] forbiddenDigits = { 0, 2, 3, 4, 5, 6, 7, 8, 9 };
    assertEquals("IMPOSSIBLE", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case163() {
    int N = 9;
    int[] forbiddenDigits = { 0 };
    assertEquals("9", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case164() {
    int N = 9999;
    int[] forbiddenDigits = { 9 };
    assertEquals("11118888", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case165() {
    int N = 9;
    int[] forbiddenDigits = { 1, 2, 3, 4, 5, 6, 7, 9, 0 };
    assertEquals("888...888(9 digits)", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case166() {
    int N = 6561;
    int[] forbiddenDigits = { 7 };
    assertEquals("6561", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case167() {
    int N = 9999;
    int[] forbiddenDigits = { 1, 2, 3, 5, 6, 7, 8, 9 };
    assertEquals("444...444(36 digits)", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case168() {
    int N = 5;
    int[] forbiddenDigits = { 0, 5 };
    assertEquals("IMPOSSIBLE", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case169() {
    int N = 999;
    int[] forbiddenDigits = { 1, 2, 3, 4, 5, 6 };
    assertEquals("999", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case170() {
    int N = 1;
    int[] forbiddenDigits = { 0, 1, 2, 3, 4, 5, 6, 7 };
    assertEquals("8", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case171() {
    int N = 10000;
    int[] forbiddenDigits = { 0 };
    assertEquals("IMPOSSIBLE", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case172() {
    int N = 9;
    int[] forbiddenDigits = { 0, 1, 3, 4, 5, 6, 7, 8, 9 };
    assertEquals("222...222(9 digits)", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case173() {
    int N = 99;
    int[] forbiddenDigits = { 0, 1, 3, 4, 5, 6, 7, 8, 9 };
    assertEquals("222...222(18 digits)", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case174() {
    int N = 9091;
    int[] forbiddenDigits = { 1, 4, 5, 6, 7, 8, 9, 0 };
    assertEquals("222...222(10 digits)", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case175() {
    int N = 9116;
    int[] forbiddenDigits = { 2, 3, 4, 5, 6, 7, 8, 9 };
    assertEquals("100...100(15 digits)", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

  @Test
  public void case176() {
    int N = 999;
    int[] forbiddenDigits = { 2, 3, 4, 5, 6, 7, 8, 9 };
    assertEquals("111...111(27 digits)", multipleswithlimit.minMultiples(N, forbiddenDigits));
  }

}
