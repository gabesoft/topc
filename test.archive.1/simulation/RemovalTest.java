package topc.test.simulation;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.simulation.*;

public class RemovalTest {
  Removal removal = new Removal();

  @Test
  public void case1() {
    int n = 8;
    int k = 3;
    String[] remove = { "3-4", "4-5" };
    assertEquals(5, removal.finalPos(n, k, remove));
  }

  @Test
  public void case2() {
    int n = 100;
    int k = 13;
    String[] remove = { "19-50", "19-50", "19-19" };
    assertEquals(13, removal.finalPos(n, k, remove));
  }

  @Test
  public void case3() {
    int n = 100;
    int k = 39;
    String[] remove = { "19-50", "19-50", "19-19" };
    assertEquals(-1, removal.finalPos(n, k, remove));
  }

  @Test
  public void case4() {
    int n = 2000000000;
    int k = 2000000000;
    String[] remove = { "1-1" };
    assertEquals(-1, removal.finalPos(n, k, remove));
  }

  @Test
  public void case5() {
    int n = 2000000000;
    int k = 1999999999;
    String[] remove = { "1-1" };
    assertEquals(2000000000, removal.finalPos(n, k, remove));
  }

  @Test
  public void case6() {
    int n = 2000000000;
    int k = 2000000000;
    String[] remove = { "1-1999999003" };
    assertEquals(-1, removal.finalPos(n, k, remove));
  }

  @Test
  public void case7() {
    int n = 1000000000;
    int k = 9;
    String[] remove = { "20-100", "100-200", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100" };
    assertEquals(9, removal.finalPos(n, k, remove));
  }

  @Test
  public void case8() {
    int n = 1000000000;
    int k = 30;
    String[] remove = { "20-100", "100-200", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100", "20-100" };
    assertEquals(4100, removal.finalPos(n, k, remove));
  }

  @Test
  public void case9() {
    int n = 1000000000;
    int k = 30;
    String[] remove = { "20-100", "100-200", "20-100" };
    assertEquals(293, removal.finalPos(n, k, remove));
  }

  @Test
  public void case10() {
    int n = 2000000000;
    int k = 30;
    String[] remove = { "30-100", "100-200", "20-100" };
    assertEquals(283, removal.finalPos(n, k, remove));
  }

  @Test
  public void case11() {
    int n = 2000000000;
    int k = 30;
    String[] remove = { "30-100", "100-200", "31-100" };
    assertEquals(101, removal.finalPos(n, k, remove));
  }

  @Test
  public void case12() {
    int n = 1995999999;
    int k = 1000000000;
    String[] remove = { "1000000000-1100000000", "5-100000", "17-895000000", "1000000000-1000000000" };
    assertEquals(1995099982, removal.finalPos(n, k, remove));
  }

  @Test
  public void case13() {
    int n = 2000000000;
    int k = 1000000000;
    String[] remove = { "1-1000000000", "1000000000-1000000000" };
    assertEquals(-1, removal.finalPos(n, k, remove));
  }

  @Test
  public void case14() {
    int n = 2000000000;
    int k = 1000000000;
    String[] remove = { "12-1000000010", "1000000000-1000000000" };
    assertEquals(2000000000, removal.finalPos(n, k, remove));
  }

  @Test
  public void case15() {
    int n = 700;
    int k = 500;
    String[] remove = { "3-3", "3-3", "3-3", "3-3", "3-3", "3-3", "3-3", "3-3", "3-3", "3-3", "3-3", "3-3", "3-3", "3-3", "3-3", "3-3", "3-3", "3-3", "3-3", "3-3", "3-3", "3-3", "3-3", "3-3", "3-3", "3-3", "3-3", "3-3", "3-3", "3-3" };
    assertEquals(530, removal.finalPos(n, k, remove));
  }

  @Test
  public void case16() {
    int n = 700;
    int k = 500;
    String[] remove = { "498-500", "500-503", "600-603" };
    assertEquals(507, removal.finalPos(n, k, remove));
  }

  @Test
  public void case17() {
    int n = 100;
    int k = 39;
    String[] remove = { "19-50", "19-50", "19-19" };
    assertEquals(-1, removal.finalPos(n, k, remove));
  }

  @Test
  public void case18() {
    int n = 200000000;
    int k = 19999;
    String[] remove = { "19-50", "99-500", "19-1999", "19-50", "19-50", "19-1999", "19-50", "19-50", "19-1999", "1799999-19999999" };
    assertEquals(26504, removal.finalPos(n, k, remove));
  }

  @Test
  public void case19() {
    int n = 8;
    int k = 3;
    String[] remove = { "3-4", "4-5" };
    assertEquals(5, removal.finalPos(n, k, remove));
  }

  @Test
  public void case20() {
    int n = 1999999999;
    int k = 7000;
    String[] remove = { "9-9000", "70-700000" };
    assertEquals(715923, removal.finalPos(n, k, remove));
  }

  @Test
  public void case21() {
    int n = 2000000000;
    int k = 39;
    String[] remove = { "19-50", "19-50", "19-19" };
    assertEquals(104, removal.finalPos(n, k, remove));
  }

  @Test
  public void case22() {
    int n = 2000000000;
    int k = 1;
    String[] remove = { "1-10" };
    assertEquals(11, removal.finalPos(n, k, remove));
  }

  @Test
  public void case23() {
    int n = 2000000000;
    int k = 3;
    String[] remove = { "3-4", "4-5" };
    assertEquals(5, removal.finalPos(n, k, remove));
  }

  @Test
  public void case24() {
    int n = 2000000000;
    int k = 2000000000;
    String[] remove = { "1-2000000000" };
    assertEquals(-1, removal.finalPos(n, k, remove));
  }

  @Test
  public void case25() {
    int n = 2000000000;
    int k = 1999999995;
    String[] remove = { "1999999990-1999999993" };
    assertEquals(1999999999, removal.finalPos(n, k, remove));
  }

  @Test
  public void case26() {
    int n = 2000000000;
    int k = 500000;
    String[] remove = { "2-1000000000" };
    assertEquals(1000499999, removal.finalPos(n, k, remove));
  }

  @Test
  public void case27() {
    int n = 2000000000;
    int k = 1;
    String[] remove = { "5000-500000" };
    assertEquals(1, removal.finalPos(n, k, remove));
  }

  @Test
  public void case28() {
    int n = 1999999999;
    int k = 100;
    String[] remove = { "1-2", "1-2", "1-2", "1-2", "1-2", "1-2", "1-2", "1-2", "1-2", "1-2", "1-2", "1-2", "1-2", "1-2", "1-2", "1-2", "1-2", "1-2", "1-2", "1-2", "1-2", "1-2", "1-2", "1-2", "1-2", "1-2", "1-2", "1-2", "1-2", "1-2", "1-2", "1-2", "1-2", "1-2", "1-2", "1-2", "1-2", "1-2", "1-2", "1-2", "1-2" };
    assertEquals(182, removal.finalPos(n, k, remove));
  }

  @Test
  public void case29() {
    int n = 2000000000;
    int k = 1000000000;
    String[] remove = { "1-1" };
    assertEquals(1000000001, removal.finalPos(n, k, remove));
  }

  @Test
  public void case30() {
    int n = 2000000000;
    int k = 1;
    String[] remove = { "1-1" };
    assertEquals(2, removal.finalPos(n, k, remove));
  }

  @Test
  public void case31() {
    int n = 2000000000;
    int k = 20;
    String[] remove = { "1-1000000000", "50-100000", "100-10000000", "200-1000000" };
    assertEquals(1000000020, removal.finalPos(n, k, remove));
  }

  @Test
  public void case32() {
    int n = 2000000000;
    int k = 1000000000;
    String[] remove = { "10000000-500000000" };
    assertEquals(1490000001, removal.finalPos(n, k, remove));
  }

  @Test
  public void case33() {
    int n = 2000000000;
    int k = 100000000;
    String[] remove = { "1-1000000", "1000000000-1500000000" };
    assertEquals(101000000, removal.finalPos(n, k, remove));
  }

  @Test
  public void case34() {
    int n = 8;
    int k = 3;
    String[] remove = { "4-5", "3-4" };
    assertEquals(7, removal.finalPos(n, k, remove));
  }

  @Test
  public void case35() {
    int n = 2000000000;
    int k = 45;
    String[] remove = { "8-2000", "34-234245" };
    assertEquals(236250, removal.finalPos(n, k, remove));
  }

  @Test
  public void case36() {
    int n = 200000000;
    int k = 199999;
    String[] remove = { "19-50", "99-500", "19-1999", "19-50", "19-50", "19-1999", "19-50", "19-50", "19-1999", "1799999-19999999" };
    assertEquals(206504, removal.finalPos(n, k, remove));
  }

  @Test
  public void case37() {
    int n = 2000000000;
    int k = 1999999;
    String[] remove = { "19-50", "99-500", "19-1999", "19-50", "19-50", "19-1999", "19-50", "19-50", "19-1999", "1799999-19999999" };
    assertEquals(20206505, removal.finalPos(n, k, remove));
  }

  @Test
  public void case38() {
    int n = 2000000000;
    int k = 13;
    String[] remove = { "19-50", "19-50", "19-19" };
    assertEquals(13, removal.finalPos(n, k, remove));
  }

  @Test
  public void case39() {
    int n = 8;
    int k = 2;
    String[] remove = { "3-6", "2-3" };
    assertEquals(8, removal.finalPos(n, k, remove));
  }

  @Test
  public void case40() {
    int n = 2000000000;
    int k = 1;
    String[] remove = { "5-2000000000" };
    assertEquals(1, removal.finalPos(n, k, remove));
  }

  @Test
  public void case41() {
    int n = 2000000000;
    int k = 1;
    String[] remove = { "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999", "1-39999999" };
    assertEquals(1959999952, removal.finalPos(n, k, remove));
  }

  @Test
  public void case42() {
    int n = 2000000000;
    int k = 200000000;
    String[] remove = { "1-2" };
    assertEquals(200000002, removal.finalPos(n, k, remove));
  }

  @Test
  public void case43() {
    int n = 1999999999;
    int k = 7000;
    String[] remove = { "8-80000", "1000000-1000001", "90-10000000" };
    assertEquals(10086906, removal.finalPos(n, k, remove));
  }

  @Test
  public void case44() {
    int n = 10;
    int k = 5;
    String[] remove = { "6-8", "3-4" };
    assertEquals(10, removal.finalPos(n, k, remove));
  }

  @Test
  public void case45() {
    int n = 2000000000;
    int k = 1000000000;
    String[] remove = { "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3", "1-3" };
    assertEquals(1000000150, removal.finalPos(n, k, remove));
  }

  @Test
  public void case46() {
    int n = 6;
    int k = 2;
    String[] remove = { "3-4", "2-3" };
    assertEquals(6, removal.finalPos(n, k, remove));
  }

  @Test
  public void case47() {
    int n = 10000000;
    int k = 1000;
    String[] remove = { "1000-5000", "2000-30000", "1500-2500", "100-200", "100-1500", "50000-100000" };
    assertEquals(35505, removal.finalPos(n, k, remove));
  }

  @Test
  public void case48() {
    int n = 100;
    int k = 50;
    String[] remove = { "51-56", "48-49" };
    assertEquals(58, removal.finalPos(n, k, remove));
  }

  @Test
  public void case49() {
    int n = 100;
    int k = 2;
    String[] remove = { "1-2", "3-4", "1-2", "3-4", "1-2", "3-4" };
    assertEquals(12, removal.finalPos(n, k, remove));
  }

  @Test
  public void case50() {
    int n = 50;
    int k = 8;
    String[] remove = { "4-5", "4-9", "15-18" };
    assertEquals(16, removal.finalPos(n, k, remove));
  }

  @Test
  public void case51() {
    int n = 4;
    int k = 2;
    String[] remove = { "3-3", "2-2" };
    assertEquals(4, removal.finalPos(n, k, remove));
  }

  @Test
  public void case52() {
    int n = 100;
    int k = 30;
    String[] remove = { "32-40", "32-40", "1-6" };
    assertEquals(54, removal.finalPos(n, k, remove));
  }

  @Test
  public void case53() {
    int n = 5;
    int k = 2;
    String[] remove = { "3-3", "1-1" };
    assertEquals(4, removal.finalPos(n, k, remove));
  }

  @Test
  public void case54() {
    int n = 3;
    int k = 2;
    String[] remove = { "1-1" };
    assertEquals(3, removal.finalPos(n, k, remove));
  }

  @Test
  public void case55() {
    int n = 20;
    int k = 2;
    String[] remove = { "5-10", "1-4" };
    assertEquals(12, removal.finalPos(n, k, remove));
  }

  @Test
  public void case56() {
    int n = 10000;
    int k = 99;
    String[] remove = { "100-100", "80-80", "78-78", "56-112", "12-58", "72-111", "1111-1115", "12-13", "101-110", "111-123", "105-106" };
    assertEquals(248, removal.finalPos(n, k, remove));
  }

  @Test
  public void case57() {
    int n = 3;
    int k = 2;
    String[] remove = { "2-3" };
    assertEquals(-1, removal.finalPos(n, k, remove));
  }

  @Test
  public void case58() {
    int n = 20;
    int k = 5;
    String[] remove = { "6-7", "1-4" };
    assertEquals(11, removal.finalPos(n, k, remove));
  }

  @Test
  public void case59() {
    int n = 2000000000;
    int k = 2000000000;
    String[] remove = { "1-2" };
    assertEquals(-1, removal.finalPos(n, k, remove));
  }

  @Test
  public void case60() {
    int n = 100;
    int k = 2;
    String[] remove = { "3-3", "2-4" };
    assertEquals(6, removal.finalPos(n, k, remove));
  }

  @Test
  public void case61() {
    int n = 100;
    int k = 11;
    String[] remove = { "14-15", "2-13" };
    assertEquals(25, removal.finalPos(n, k, remove));
  }

  @Test
  public void case62() {
    int n = 1999999999;
    int k = 2;
    String[] remove = { "2-3", "3-4", "4-5", "5-6", "2-3", "3-4", "4-5", "5-6", "7-1929", "393-203093", "29382-199299", "1-1", "1-1", "1-1", "1-1", "1-1", "1-1", "1-1", "1-1", "1-1", "1-1", "1-1", "1-1", "1-1", "1-1", "1-1", "1-1", "1-1", "1-1", "1-1", "1-1", "1-1", "1-1", "1-1", "1-1", "1-1", "1-1", "1-1", "1-1", "1-1", "1-1", "1-1", "1-1", "1-1", "1-1", "1-1", "1-1", "1-1", "1-1" };
    assertEquals(1979, removal.finalPos(n, k, remove));
  }

}
