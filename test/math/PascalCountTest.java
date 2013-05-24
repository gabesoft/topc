package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class PascalCountTest {
  PascalCount pascalcount = new PascalCount();

  @Test
  public void case1a() {
    int i = 10;
    int d = 5;
    assertEquals(8, pascalcount.howMany(i, d));
  }

  @Test
  public void case1() {
    int i = 3;
    int d = 3;
    assertEquals(2, pascalcount.howMany(i, d));
  }

  @Test
  public void case2() {
    int i = 3;
    int d = 4;
    assertEquals(0, pascalcount.howMany(i, d));
  }

  @Test
  public void case3() {
    int i = 4;
    int d = 2;
    assertEquals(3, pascalcount.howMany(i, d));
  }

  @Test
  public void case4() {
    int i = 4;
    int d = 6;
    assertEquals(1, pascalcount.howMany(i, d));
  }

  @Test
  public void case5() {
    int i = 5000000;
    int d = 6;
    assertEquals(4999315, pascalcount.howMany(i, d));
  }

  @Test
  public void case6() {
    int i = 5000000;
    int d = 2;
    assertEquals(4999745, pascalcount.howMany(i, d));
  }

  @Test
  public void case7() {
    int i = 5000000;
    int d = 3;
    assertEquals(4999569, pascalcount.howMany(i, d));
  }

  @Test
  public void case8() {
    int i = 5000000;
    int d = 4;
    assertEquals(4998977, pascalcount.howMany(i, d));
  }

  @Test
  public void case9() {
    int i = 5000000;
    int d = 5;
    assertEquals(4999956, pascalcount.howMany(i, d));
  }

  @Test
  public void case10() {
    int i = 0;
    int d = 3;
    assertEquals(0, pascalcount.howMany(i, d));
  }

  @Test
  public void case11() {
    int i = 2500000;
    int d = 2;
    assertEquals(2499745, pascalcount.howMany(i, d));
  }

  @Test
  public void case12() {
    int i = 2500000;
    int d = 3;
    assertEquals(2499425, pascalcount.howMany(i, d));
  }

  @Test
  public void case13() {
    int i = 2500000;
    int d = 4;
    assertEquals(2498977, pascalcount.howMany(i, d));
  }

  @Test
  public void case14() {
    int i = 2500000;
    int d = 5;
    assertEquals(2499989, pascalcount.howMany(i, d));
  }

  @Test
  public void case15() {
    int i = 2500000;
    int d = 6;
    assertEquals(2499173, pascalcount.howMany(i, d));
  }

  @Test
  public void case16() {
    int i = 3333333;
    int d = 2;
    assertEquals(3325142, pascalcount.howMany(i, d));
  }

  @Test
  public void case17() {
    int i = 3333333;
    int d = 3;
    assertEquals(3332470, pascalcount.howMany(i, d));
  }

  @Test
  public void case18() {
    int i = 3333333;
    int d = 4;
    assertEquals(3296470, pascalcount.howMany(i, d));
  }

  @Test
  public void case19() {
    int i = 3333333;
    int d = 5;
    assertEquals(3284182, pascalcount.howMany(i, d));
  }

  @Test
  public void case20() {
    int i = 3333333;
    int d = 6;
    assertEquals(3324286, pascalcount.howMany(i, d));
  }

  @Test
  public void case21() {
    int i = 101;
    int d = 2;
    assertEquals(86, pascalcount.howMany(i, d));
  }

  @Test
  public void case22() {
    int i = 101;
    int d = 3;
    assertEquals(84, pascalcount.howMany(i, d));
  }

  @Test
  public void case23() {
    int i = 101;
    int d = 4;
    assertEquals(70, pascalcount.howMany(i, d));
  }

  @Test
  public void case24() {
    int i = 101;
    int d = 5;
    assertEquals(92, pascalcount.howMany(i, d));
  }

  @Test
  public void case25() {
    int i = 101;
    int d = 6;
    assertEquals(72, pascalcount.howMany(i, d));
  }

  @Test
  public void case26() {
    int i = 1671174;
    int d = 3;
    assertEquals(1670743, pascalcount.howMany(i, d));
  }

  @Test
  public void case27() {
    int i = 2545758;
    int d = 4;
    assertEquals(2529375, pascalcount.howMany(i, d));
  }

  @Test
  public void case28() {
    int i = 1741859;
    int d = 5;
    assertEquals(1696860, pascalcount.howMany(i, d));
  }

  @Test
  public void case29() {
    int i = 4852974;
    int d = 5;
    assertEquals(4690975, pascalcount.howMany(i, d));
  }

  @Test
  public void case30() {
    int i = 1743118;
    int d = 5;
    assertEquals(1599119, pascalcount.howMany(i, d));
  }

  @Test
  public void case31() {
    int i = 718439;
    int d = 5;
    assertEquals(684690, pascalcount.howMany(i, d));
  }

  @Test
  public void case32() {
    int i = 2199093;
    int d = 2;
    assertEquals(2198070, pascalcount.howMany(i, d));
  }

  @Test
  public void case33() {
    int i = 3675517;
    int d = 2;
    assertEquals(3671422, pascalcount.howMany(i, d));
  }

  @Test
  public void case34() {
    int i = 552351;
    int d = 5;
    assertEquals(550432, pascalcount.howMany(i, d));
  }

  @Test
  public void case35() {
    int i = 2298594;
    int d = 5;
    assertEquals(2269795, pascalcount.howMany(i, d));
  }

  @Test
  public void case36() {
    int i = 3556885;
    int d = 6;
    assertEquals(3555004, pascalcount.howMany(i, d));
  }

  @Test
  public void case37() {
    int i = 2456621;
    int d = 4;
    assertEquals(2440238, pascalcount.howMany(i, d));
  }

  @Test
  public void case38() {
    int i = 28977;
    int d = 6;
    assertEquals(28640, pascalcount.howMany(i, d));
  }

  @Test
  public void case39() {
    int i = 3056625;
    int d = 3;
    assertEquals(3050794, pascalcount.howMany(i, d));
  }

  @Test
  public void case40() {
    int i = 2892268;
    int d = 6;
    assertEquals(2886065, pascalcount.howMany(i, d));
  }

  @Test
  public void case41() {
    int i = 3249155;
    int d = 5;
    assertEquals(3233796, pascalcount.howMany(i, d));
  }

  @Test
  public void case42() {
    int i = 3969917;
    int d = 2;
    assertEquals(3953534, pascalcount.howMany(i, d));
  }

  @Test
  public void case43() {
    int i = 4599836;
    int d = 5;
    assertEquals(4484637, pascalcount.howMany(i, d));
  }

  @Test
  public void case44() {
    int i = 2774631;
    int d = 4;
    assertEquals(2756200, pascalcount.howMany(i, d));
  }

  @Test
  public void case45() {
    int i = 3044694;
    int d = 6;
    assertEquals(3031339, pascalcount.howMany(i, d));
  }

  @Test
  public void case46() {
    int i = 1626425;
    int d = 6;
    assertEquals(1623488, pascalcount.howMany(i, d));
  }

  @Test
  public void case47() {
    int i = 2541633;
    int d = 4;
    assertEquals(2540738, pascalcount.howMany(i, d));
  }

  @Test
  public void case48() {
    int i = 3788324;
    int d = 2;
    assertEquals(3786277, pascalcount.howMany(i, d));
  }

  @Test
  public void case49() {
    int i = 206421;
    int d = 6;
    assertEquals(205532, pascalcount.howMany(i, d));
  }

  @Test
  public void case50() {
    int i = 3951827;
    int d = 2;
    assertEquals(3947732, pascalcount.howMany(i, d));
  }

  @Test
  public void case51() {
    int i = 1378788;
    int d = 4;
    assertEquals(1376741, pascalcount.howMany(i, d));
  }

  @Test
  public void case52() {
    int i = 1326812;
    int d = 3;
    assertEquals(1325085, pascalcount.howMany(i, d));
  }

  @Test
  public void case53() {
    int i = 2502673;
    int d = 3;
    assertEquals(2501522, pascalcount.howMany(i, d));
  }

  @Test
  public void case54() {
    int i = 4794629;
    int d = 3;
    assertEquals(4788798, pascalcount.howMany(i, d));
  }

  @Test
  public void case55() {
    int i = 4924436;
    int d = 2;
    assertEquals(4924181, pascalcount.howMany(i, d));
  }

  @Test
  public void case56() {
    int i = 5000000;
    int d = 6;
    assertEquals(4999315, pascalcount.howMany(i, d));
  }

  @Test
  public void case57() {
    int i = 500000;
    int d = 3;
    assertEquals(484449, pascalcount.howMany(i, d));
  }

  @Test
  public void case58() {
    int i = 5000000;
    int d = 4;
    assertEquals(4998977, pascalcount.howMany(i, d));
  }

  @Test
  public void case59() {
    int i = 5000000;
    int d = 2;
    assertEquals(4999745, pascalcount.howMany(i, d));
  }

  @Test
  public void case60() {
    int i = 5000000;
    int d = 5;
    assertEquals(4999956, pascalcount.howMany(i, d));
  }

  @Test
  public void case61() {
    int i = 500000;
    int d = 4;
    assertEquals(499617, pascalcount.howMany(i, d));
  }

  @Test
  public void case62() {
    int i = 4987451;
    int d = 6;
    assertEquals(4983884, pascalcount.howMany(i, d));
  }

  @Test
  public void case63() {
    int i = 4999999;
    int d = 6;
    assertEquals(4991552, pascalcount.howMany(i, d));
  }

  @Test
  public void case64() {
    int i = 4983214;
    int d = 4;
    assertEquals(4979119, pascalcount.howMany(i, d));
  }

  @Test
  public void case65() {
    int i = 500000;
    int d = 6;
    assertEquals(484329, pascalcount.howMany(i, d));
  }

  @Test
  public void case66() {
    int i = 50000;
    int d = 5;
    assertEquals(49993, pascalcount.howMany(i, d));
  }

  @Test
  public void case67() {
    int i = 3489965;
    int d = 6;
    assertEquals(3449640, pascalcount.howMany(i, d));
  }

  @Test
  public void case68() {
    int i = 100000;
    int d = 6;
    assertEquals(99507, pascalcount.howMany(i, d));
  }

  @Test
  public void case69() {
    int i = 3;
    int d = 6;
    assertEquals(0, pascalcount.howMany(i, d));
  }

  @Test
  public void case70() {
    int i = 4987451;
    int d = 4;
    assertEquals(4980284, pascalcount.howMany(i, d));
  }

  @Test
  public void case71() {
    int i = 4;
    int d = 6;
    assertEquals(1, pascalcount.howMany(i, d));
  }

  @Test
  public void case72() {
    int i = 12;
    int d = 4;
    assertEquals(7, pascalcount.howMany(i, d));
  }

  @Test
  public void case73() {
    int i = 8;
    int d = 5;
    assertEquals(1, pascalcount.howMany(i, d));
  }

}
