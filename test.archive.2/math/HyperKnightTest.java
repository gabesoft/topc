package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class HyperKnightTest {
  HyperKnight hyperknight = new HyperKnight();

  @Test
  public void case1() {
    int a = 2;
    int b = 1;
    int numRows = 8;
    int numColumns = 8;
    int k = 4;
    assertEquals(20L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case2() {
    int a = 3;
    int b = 2;
    int numRows = 8;
    int numColumns = 8;
    int k = 2;
    assertEquals(16L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case3() {
    int a = 1;
    int b = 3;
    int numRows = 7;
    int numColumns = 11;
    int k = 0;
    assertEquals(0L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case4() {
    int a = 3;
    int b = 2;
    int numRows = 10;
    int numColumns = 20;
    int k = 8;
    assertEquals(56L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case5() {
    int a = 1;
    int b = 4;
    int numRows = 100;
    int numColumns = 10;
    int k = 6;
    assertEquals(564L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case6() {
    int a = 2;
    int b = 3;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 8;
    assertEquals(999999988000000036L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case7() {
    int a = 2;
    int b = 3;
    int numRows = 7;
    int numColumns = 7;
    int k = 1;
    assertEquals(0L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case8() {
    int a = 2;
    int b = 3;
    int numRows = 7;
    int numColumns = 7;
    int k = 2;
    assertEquals(16L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case9() {
    int a = 2;
    int b = 3;
    int numRows = 7;
    int numColumns = 7;
    int k = 3;
    assertEquals(16L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case10() {
    int a = 2;
    int b = 3;
    int numRows = 7;
    int numColumns = 7;
    int k = 4;
    assertEquals(12L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case11() {
    int a = 2;
    int b = 3;
    int numRows = 7;
    int numColumns = 7;
    int k = 5;
    assertEquals(0L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case12() {
    int a = 2;
    int b = 3;
    int numRows = 7;
    int numColumns = 7;
    int k = 6;
    assertEquals(4L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case13() {
    int a = 2;
    int b = 3;
    int numRows = 7;
    int numColumns = 7;
    int k = 7;
    assertEquals(0L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case14() {
    int a = 2;
    int b = 3;
    int numRows = 7;
    int numColumns = 7;
    int k = 8;
    assertEquals(1L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case15() {
    int a = 499999998;
    int b = 499999999;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 0;
    assertEquals(0L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case16() {
    int a = 499999998;
    int b = 499999999;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 1;
    assertEquals(0L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case17() {
    int a = 499999998;
    int b = 499999999;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 2;
    assertEquals(999999992000000016L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case18() {
    int a = 499999998;
    int b = 499999999;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 3;
    assertEquals(3999999984L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case19() {
    int a = 499999998;
    int b = 499999999;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 4;
    assertEquals(3999999988L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case20() {
    int a = 499999998;
    int b = 499999999;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 5;
    assertEquals(0L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case21() {
    int a = 499999998;
    int b = 499999999;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 6;
    assertEquals(8L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case22() {
    int a = 499999998;
    int b = 499999999;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 7;
    assertEquals(0L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case23() {
    int a = 499999998;
    int b = 499999999;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 8;
    assertEquals(4L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case24() {
    int a = 2;
    int b = 1;
    int numRows = 20001;
    int numColumns = 1000000000;
    int k = 0;
    assertEquals(0L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case25() {
    int a = 2;
    int b = 1;
    int numRows = 20001;
    int numColumns = 1000000000;
    int k = 1;
    assertEquals(0L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case26() {
    int a = 2;
    int b = 1;
    int numRows = 20001;
    int numColumns = 1000000000;
    int k = 2;
    assertEquals(4L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case27() {
    int a = 2;
    int b = 1;
    int numRows = 20001;
    int numColumns = 1000000000;
    int k = 3;
    assertEquals(8L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case28() {
    int a = 2;
    int b = 1;
    int numRows = 20001;
    int numColumns = 1000000000;
    int k = 4;
    assertEquals(2000039990L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case29() {
    int a = 2;
    int b = 1;
    int numRows = 20001;
    int numColumns = 1000000000;
    int k = 5;
    assertEquals(0L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case30() {
    int a = 2;
    int b = 1;
    int numRows = 20001;
    int numColumns = 1000000000;
    int k = 6;
    assertEquals(2000039986L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case31() {
    int a = 2;
    int b = 1;
    int numRows = 20001;
    int numColumns = 1000000000;
    int k = 7;
    assertEquals(0L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case32() {
    int a = 2;
    int b = 1;
    int numRows = 20001;
    int numColumns = 1000000000;
    int k = 8;
    assertEquals(19996999920012L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case33() {
    int a = 10000;
    int b = 5000;
    int numRows = 20001;
    int numColumns = 1000000000;
    int k = 0;
    assertEquals(0L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case34() {
    int a = 10000;
    int b = 5000;
    int numRows = 20001;
    int numColumns = 1000000000;
    int k = 1;
    assertEquals(0L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case35() {
    int a = 10000;
    int b = 5000;
    int numRows = 20001;
    int numColumns = 1000000000;
    int k = 2;
    assertEquals(100000000L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case36() {
    int a = 10000;
    int b = 5000;
    int numRows = 20001;
    int numColumns = 1000000000;
    int k = 3;
    assertEquals(200000000L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case37() {
    int a = 10000;
    int b = 5000;
    int numRows = 20001;
    int numColumns = 1000000000;
    int k = 4;
    assertEquals(9999900010000L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case38() {
    int a = 10000;
    int b = 5000;
    int numRows = 20001;
    int numColumns = 1000000000;
    int k = 5;
    assertEquals(0L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case39() {
    int a = 10000;
    int b = 5000;
    int numRows = 20001;
    int numColumns = 1000000000;
    int k = 6;
    assertEquals(9999800010000L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case40() {
    int a = 10000;
    int b = 5000;
    int numRows = 20001;
    int numColumns = 1000000000;
    int k = 7;
    assertEquals(0L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case41() {
    int a = 10000;
    int b = 5000;
    int numRows = 20001;
    int numColumns = 1000000000;
    int k = 8;
    assertEquals(999980000L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case42() {
    int a = 1;
    int b = 2;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 0;
    assertEquals(0L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case43() {
    int a = 1;
    int b = 2;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 1;
    assertEquals(0L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case44() {
    int a = 1;
    int b = 2;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 2;
    assertEquals(4L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case45() {
    int a = 1;
    int b = 2;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 3;
    assertEquals(8L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case46() {
    int a = 1;
    int b = 2;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 4;
    assertEquals(3999999988L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case47() {
    int a = 1;
    int b = 2;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 5;
    assertEquals(0L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case48() {
    int a = 1;
    int b = 2;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 6;
    assertEquals(3999999984L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case49() {
    int a = 1;
    int b = 2;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 7;
    assertEquals(0L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case50() {
    int a = 1;
    int b = 2;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 8;
    assertEquals(999999992000000016L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case51() {
    int a = 1;
    int b = 2;
    int numRows = 1000000000;
    int numColumns = 5;
    int k = 0;
    assertEquals(0L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case52() {
    int a = 1;
    int b = 2;
    int numRows = 1000000000;
    int numColumns = 5;
    int k = 1;
    assertEquals(0L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case53() {
    int a = 1;
    int b = 2;
    int numRows = 1000000000;
    int numColumns = 5;
    int k = 2;
    assertEquals(4L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case54() {
    int a = 1;
    int b = 2;
    int numRows = 1000000000;
    int numColumns = 5;
    int k = 3;
    assertEquals(8L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case55() {
    int a = 1;
    int b = 2;
    int numRows = 1000000000;
    int numColumns = 5;
    int k = 4;
    assertEquals(1999999998L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case56() {
    int a = 1;
    int b = 2;
    int numRows = 1000000000;
    int numColumns = 5;
    int k = 5;
    assertEquals(0L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case57() {
    int a = 1;
    int b = 2;
    int numRows = 1000000000;
    int numColumns = 5;
    int k = 6;
    assertEquals(1999999994L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case58() {
    int a = 1;
    int b = 2;
    int numRows = 1000000000;
    int numColumns = 5;
    int k = 7;
    assertEquals(0L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case59() {
    int a = 1;
    int b = 2;
    int numRows = 1000000000;
    int numColumns = 5;
    int k = 8;
    assertEquals(999999996L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case60() {
    int a = 499999999;
    int b = 1;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 0;
    assertEquals(0L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case61() {
    int a = 499999999;
    int b = 1;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 1;
    assertEquals(0L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case62() {
    int a = 499999999;
    int b = 1;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 2;
    assertEquals(4L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case63() {
    int a = 499999999;
    int b = 1;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 3;
    assertEquals(3999999984L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case64() {
    int a = 499999999;
    int b = 1;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 4;
    assertEquals(999999992000000024L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case65() {
    int a = 499999999;
    int b = 1;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 5;
    assertEquals(0L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case66() {
    int a = 499999999;
    int b = 1;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 6;
    assertEquals(3999999984L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case67() {
    int a = 499999999;
    int b = 1;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 7;
    assertEquals(0L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case68() {
    int a = 499999999;
    int b = 1;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 8;
    assertEquals(4L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case69() {
    int a = 19205425;
    int b = 29027233;
    int numRows = 79816846;
    int numColumns = 73398506;
    int k = 2;
    assertEquals(1475393397722500L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case70() {
    int a = 19205425;
    int b = 29027233;
    int numRows = 79816846;
    int numColumns = 73398506;
    int k = 3;
    assertEquals(1509055975267200L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case71() {
    int a = 19205425;
    int b = 29027233;
    int numRows = 79816846;
    int numColumns = 73398506;
    int k = 4;
    assertEquals(1811160782212456L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case72() {
    int a = 19205425;
    int b = 29027233;
    int numRows = 79816846;
    int numColumns = 73398506;
    int k = 6;
    assertEquals(728904265614720L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case73() {
    int a = 19205425;
    int b = 29027233;
    int numRows = 79816846;
    int numColumns = 73398506;
    int k = 8;
    assertEquals(333922829215200L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case74() {
    int a = 36411905;
    int b = 49189985;
    int numRows = 123331332;
    int numColumns = 139724323;
    int k = 2;
    assertEquals(5303307302916100L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case75() {
    int a = 36411905;
    int b = 49189985;
    int numRows = 123331332;
    int numColumns = 139724323;
    int k = 3;
    assertEquals(3722193880339200L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case76() {
    int a = 36411905;
    int b = 49189985;
    int numRows = 123331332;
    int numColumns = 139724323;
    int k = 4;
    assertEquals(5481023866919750L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case77() {
    int a = 36411905;
    int b = 49189985;
    int numRows = 123331332;
    int numColumns = 139724323;
    int k = 6;
    assertEquals(1694263899854400L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case78() {
    int a = 36411905;
    int b = 49189985;
    int numRows = 123331332;
    int numColumns = 139724323;
    int k = 8;
    assertEquals(1031597918358786L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case79() {
    int a = 37909854;
    int b = 42557194;
    int numRows = 128417691;
    int numColumns = 92857213;
    int k = 2;
    assertEquals(5748628121205264L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case80() {
    int a = 37909854;
    int b = 42557194;
    int numRows = 128417691;
    int numColumns = 92857213;
    int k = 3;
    assertEquals(1409439847106880L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case81() {
    int a = 37909854;
    int b = 42557194;
    int numRows = 128417691;
    int numColumns = 92857213;
    int k = 4;
    assertEquals(3956693595793024L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case82() {
    int a = 5347410;
    int b = 33895789;
    int numRows = 74759886;
    int numColumns = 97588821;
    int k = 8;
    assertEquals(207636366774844L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case83() {
    int a = 42207223;
    int b = 39173184;
    int numRows = 115662001;
    int numColumns = 97975491;
    int k = 4;
    assertEquals(3547412635778884L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case84() {
    int a = 42207223;
    int b = 39173184;
    int numRows = 115662001;
    int numColumns = 97975491;
    int k = 6;
    assertEquals(271902079870800L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case85() {
    int a = 42207223;
    int b = 39173184;
    int numRows = 115662001;
    int numColumns = 97975491;
    int k = 8;
    assertEquals(423749499494975L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case86() {
    int a = 6654070;
    int b = 1356936;
    int numRows = 57822120;
    int numColumns = 24685929;
    int k = 2;
    assertEquals(7365101232384L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case87() {
    int a = 6654070;
    int b = 1356936;
    int numRows = 57822120;
    int numColumns = 24685929;
    int k = 3;
    assertEquals(57502974571392L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case88() {
    int a = 26174793;
    int b = 2712259;
    int numRows = 85355565;
    int numColumns = 96339217;
    int k = 3;
    assertEquals(509091752034448L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case89() {
    int a = 26174793;
    int b = 2712259;
    int numRows = 85355565;
    int numColumns = 96339217;
    int k = 4;
    assertEquals(2619626079170604L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case90() {
    int a = 26174793;
    int b = 2712259;
    int numRows = 85355565;
    int numColumns = 96339217;
    int k = 6;
    assertEquals(3613024234951480L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case91() {
    int a = 26174793;
    int b = 2712259;
    int numRows = 85355565;
    int numColumns = 96339217;
    int k = 8;
    assertEquals(1451920837003749L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case92() {
    int a = 38549418;
    int b = 49711042;
    int numRows = 144624062;
    int numColumns = 105034741;
    int k = 2;
    assertEquals(5944230512554896L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case93() {
    int a = 38549418;
    int b = 49711042;
    int numRows = 144624062;
    int numColumns = 105034741;
    int k = 8;
    assertEquals(253703198235546L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case94() {
    int a = 39483358;
    int b = 9722546;
    int numRows = 123397642;
    int numColumns = 96761518;
    int k = 2;
    assertEquals(378111602888464L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case95() {
    int a = 39483358;
    int b = 9722546;
    int numRows = 123397642;
    int numColumns = 96761518;
    int k = 6;
    assertEquals(3703776385142272L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case96() {
    int a = 39483358;
    int b = 9722546;
    int numRows = 123397642;
    int numColumns = 96761518;
    int k = 8;
    assertEquals(790639530846652L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case97() {
    int a = 35834099;
    int b = 7025192;
    int numRows = 73801792;
    int numColumns = 89315676;
    int k = 2;
    assertEquals(197413290547456L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case98() {
    int a = 35834099;
    int b = 7025192;
    int numRows = 73801792;
    int numColumns = 89315676;
    int k = 8;
    assertEquals(37652553175932L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case99() {
    int a = 4781822;
    int b = 9360408;
    int numRows = 54482604;
    int numColumns = 24850751;
    int k = 2;
    assertEquals(91463286558736L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case100() {
    int a = 4781822;
    int b = 9360408;
    int numRows = 54482604;
    int numColumns = 24850751;
    int k = 3;
    assertEquals(175151866109536L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case101() {
    int a = 4781822;
    int b = 9360408;
    int numRows = 54482604;
    int numColumns = 24850751;
    int k = 4;
    assertEquals(484491324356196L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case102() {
    int a = 43521866;
    int b = 5243715;
    int numRows = 101731108;
    int numColumns = 129509489;
    int k = 3;
    assertEquals(1605757716567720L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case103() {
    int a = 43521866;
    int b = 5243715;
    int numRows = 101731108;
    int numColumns = 129509489;
    int k = 4;
    assertEquals(6460256857533394L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case104() {
    int a = 43521866;
    int b = 5243715;
    int numRows = 101731108;
    int numColumns = 129509489;
    int k = 6;
    assertEquals(4375432510194166L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case105() {
    int a = 43521866;
    int b = 5243715;
    int numRows = 101731108;
    int numColumns = 129509489;
    int k = 8;
    assertEquals(623710540183632L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case106() {
    int a = 11098020;
    int b = 36554824;
    int numRows = 107799910;
    int numColumns = 74593434;
    int k = 2;
    assertEquals(492664191681600L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case107() {
    int a = 11098020;
    int b = 36554824;
    int numRows = 107799910;
    int numColumns = 74593434;
    int k = 3;
    assertEquals(2260160959424640L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case108() {
    int a = 11098020;
    int b = 36554824;
    int numRows = 107799910;
    int numColumns = 74593434;
    int k = 4;
    assertEquals(3395116095947584L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case109() {
    int a = 11098020;
    int b = 36554824;
    int numRows = 107799910;
    int numColumns = 74593434;
    int k = 6;
    assertEquals(1841751299645184L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case110() {
    int a = 18607318;
    int b = 20353033;
    int numRows = 58228002;
    int numColumns = 54010191;
    int k = 3;
    assertEquals(259864593138960L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case111() {
    int a = 18607318;
    int b = 20353033;
    int numRows = 58228002;
    int numColumns = 54010191;
    int k = 4;
    assertEquals(1159370722873696L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case112() {
    int a = 18607318;
    int b = 20353033;
    int numRows = 58228002;
    int numColumns = 54010191;
    int k = 6;
    assertEquals(107627034157230L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case113() {
    int a = 18607318;
    int b = 20353033;
    int numRows = 58228002;
    int numColumns = 54010191;
    int k = 8;
    assertEquals(233114026786000L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case114() {
    int a = 43265408;
    int b = 3290218;
    int numRows = 90125504;
    int numColumns = 103363137;
    int k = 4;
    assertEquals(6526481887540324L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case115() {
    int a = 43265408;
    int b = 3290218;
    int numRows = 90125504;
    int numColumns = 103363137;
    int k = 6;
    assertEquals(1633147131813420L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case116() {
    int a = 43265408;
    int b = 3290218;
    int numRows = 90125504;
    int numColumns = 103363137;
    int k = 8;
    assertEquals(60506942310848L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case117() {
    int a = 22620589;
    int b = 11861535;
    int numRows = 67151929;
    int numColumns = 50577031;
    int k = 2;
    assertEquals(562784050224900L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case118() {
    int a = 22620589;
    int b = 11861535;
    int numRows = 67151929;
    int numColumns = 50577031;
    int k = 3;
    assertEquals(1020951164703120L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case119() {
    int a = 22620589;
    int b = 11861535;
    int numRows = 67151929;
    int numColumns = 50577031;
    int k = 4;
    assertEquals(1109402065853944L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case120() {
    int a = 22620589;
    int b = 11861535;
    int numRows = 67151929;
    int numColumns = 50577031;
    int k = 6;
    assertEquals(586295367505232L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case121() {
    int a = 22620589;
    int b = 11861535;
    int numRows = 67151929;
    int numColumns = 50577031;
    int k = 8;
    assertEquals(116912546455603L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case122() {
    int a = 1;
    int b = 2;
    int numRows = 5;
    int numColumns = 5;
    int k = 0;
    assertEquals(0L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case123() {
    int a = 1;
    int b = 2;
    int numRows = 5;
    int numColumns = 5;
    int k = 1;
    assertEquals(0L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case124() {
    int a = 1;
    int b = 2;
    int numRows = 5;
    int numColumns = 5;
    int k = 2;
    assertEquals(4L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case125() {
    int a = 1;
    int b = 2;
    int numRows = 5;
    int numColumns = 5;
    int k = 3;
    assertEquals(8L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case126() {
    int a = 1;
    int b = 2;
    int numRows = 5;
    int numColumns = 5;
    int k = 4;
    assertEquals(8L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case127() {
    int a = 1;
    int b = 2;
    int numRows = 5;
    int numColumns = 5;
    int k = 5;
    assertEquals(0L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case128() {
    int a = 1;
    int b = 2;
    int numRows = 5;
    int numColumns = 5;
    int k = 6;
    assertEquals(4L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case129() {
    int a = 1;
    int b = 2;
    int numRows = 5;
    int numColumns = 5;
    int k = 7;
    assertEquals(0L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case130() {
    int a = 1;
    int b = 2;
    int numRows = 5;
    int numColumns = 5;
    int k = 8;
    assertEquals(1L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case131() {
    int a = 3000013;
    int b = 5000017;
    int numRows = 987654321;
    int numColumns = 123456789;
    int k = 3;
    assertEquals(48000304000416L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case132() {
    int a = 4;
    int b = 2;
    int numRows = 100;
    int numColumns = 500;
    int k = 3;
    assertEquals(32L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case133() {
    int a = 1;
    int b = 2;
    int numRows = 8;
    int numColumns = 8;
    int k = 3;
    assertEquals(8L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case134() {
    int a = 2;
    int b = 1;
    int numRows = 8;
    int numColumns = 8;
    int k = 3;
    assertEquals(8L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case135() {
    int a = 3;
    int b = 1;
    int numRows = 8;
    int numColumns = 8;
    int k = 3;
    assertEquals(16L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case136() {
    int a = 156;
    int b = 178;
    int numRows = 100000000;
    int numColumns = 100000000;
    int k = 4;
    assertEquals(62399779792L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case137() {
    int a = 2;
    int b = 3;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 3;
    assertEquals(16L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case138() {
    int a = 2;
    int b = 1;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 8;
    assertEquals(999999992000000016L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case139() {
    int a = 111111;
    int b = 1111111;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 3;
    assertEquals(888888000000L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case140() {
    int a = 2;
    int b = 1;
    int numRows = 100;
    int numColumns = 100;
    int k = 3;
    assertEquals(8L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case141() {
    int a = 2;
    int b = 3;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 4;
    assertEquals(7999999956L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case142() {
    int a = 2;
    int b = 1;
    int numRows = 5;
    int numColumns = 5;
    int k = 3;
    assertEquals(8L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case143() {
    int a = 5;
    int b = 99;
    int numRows = 1000;
    int numColumns = 1000;
    int k = 3;
    assertEquals(3760L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case144() {
    int a = 4;
    int b = 2;
    int numRows = 1000;
    int numColumns = 1000;
    int k = 3;
    assertEquals(32L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case145() {
    int a = 3;
    int b = 2;
    int numRows = 8;
    int numColumns = 8;
    int k = 3;
    assertEquals(16L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case146() {
    int a = 10;
    int b = 8;
    int numRows = 100;
    int numColumns = 100;
    int k = 4;
    assertEquals(2576L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case147() {
    int a = 50;
    int b = 40;
    int numRows = 200;
    int numColumns = 200;
    int k = 3;
    assertEquals(3200L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case148() {
    int a = 1;
    int b = 2;
    int numRows = 1000;
    int numColumns = 1000;
    int k = 8;
    assertEquals(992016L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case149() {
    int a = 10;
    int b = 7;
    int numRows = 10000;
    int numColumns = 10000;
    int k = 3;
    assertEquals(168L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case150() {
    int a = 19;
    int b = 57;
    int numRows = 200;
    int numColumns = 312;
    int k = 3;
    assertEquals(5776L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case151() {
    int a = 600000;
    int b = 500000;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 3;
    assertEquals(400000000000L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case152() {
    int a = 2;
    int b = 1;
    int numRows = 100000;
    int numColumns = 100000;
    int k = 3;
    assertEquals(8L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case153() {
    int a = 499999999;
    int b = 499999998;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 3;
    assertEquals(3999999984L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case154() {
    int a = 5;
    int b = 3;
    int numRows = 10000;
    int numColumns = 10000;
    int k = 3;
    assertEquals(48L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case155() {
    int a = 3;
    int b = 1;
    int numRows = 7;
    int numColumns = 7;
    int k = 5;
    assertEquals(0L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case156() {
    int a = 11;
    int b = 234;
    int numRows = 10000;
    int numColumns = 20000;
    int k = 3;
    assertEquals(19624L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case157() {
    int a = 1000;
    int b = 1200;
    int numRows = 100000;
    int numColumns = 120000;
    int k = 3;
    assertEquals(1600000L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case158() {
    int a = 2;
    int b = 3;
    int numRows = 8;
    int numColumns = 8;
    int k = 3;
    assertEquals(16L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case159() {
    int a = 3;
    int b = 5;
    int numRows = 100;
    int numColumns = 100;
    int k = 4;
    assertEquals(1096L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case160() {
    int a = 5;
    int b = 70;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 6;
    assertEquals(259999963600L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case161() {
    int a = 10;
    int b = 30;
    int numRows = 100;
    int numColumns = 1000;
    int k = 3;
    assertEquals(1600L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case162() {
    int a = 499999998;
    int b = 499999990;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 2;
    assertEquals(999999960000000400L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case163() {
    int a = 2;
    int b = 1;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 4;
    assertEquals(3999999988L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case164() {
    int a = 26;
    int b = 16;
    int numRows = 567;
    int numColumns = 123;
    int k = 5;
    assertEquals(0L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case165() {
    int a = 1;
    int b = 2;
    int numRows = 10;
    int numColumns = 10;
    int k = 3;
    assertEquals(8L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case166() {
    int a = 2;
    int b = 1;
    int numRows = 10;
    int numColumns = 10;
    int k = 3;
    assertEquals(8L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case167() {
    int a = 99999999;
    int b = 999999;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 4;
    assertEquals(42403996807999992L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case168() {
    int a = 23;
    int b = 4;
    int numRows = 2542;
    int numColumns = 5463;
    int k = 3;
    assertEquals(608L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case169() {
    int a = 1;
    int b = 3;
    int numRows = 7;
    int numColumns = 7;
    int k = 3;
    assertEquals(16L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case170() {
    int a = 99;
    int b = 100;
    int numRows = 100000;
    int numColumns = 100000;
    int k = 2;
    assertEquals(39204L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case171() {
    int a = 400000000;
    int b = 200000000;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 3;
    assertEquals(320000000000000000L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case172() {
    int a = 1;
    int b = 3;
    int numRows = 1000000000;
    int numColumns = 1000000000;
    int k = 4;
    assertEquals(3999999992L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case173() {
    int a = 4;
    int b = 3;
    int numRows = 14;
    int numColumns = 15;
    int k = 3;
    assertEquals(24L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case174() {
    int a = 10;
    int b = 20;
    int numRows = 100;
    int numColumns = 100;
    int k = 3;
    assertEquals(800L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

  @Test
  public void case175() {
    int a = 49999999;
    int b = 50000000;
    int numRows = 100000003;
    int numColumns = 100000007;
    int k = 4;
    assertEquals(999999984L, hyperknight.countCells(a, b, numRows, numColumns, k));
  }

}
