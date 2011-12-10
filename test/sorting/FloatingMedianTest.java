package topc.test.sorting;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.sorting.*;

public class FloatingMedianTest {
  FloatingMedian floatingmedian = new FloatingMedian();

  @Test
  public void case1() {
    int seed = 3;
    int mul = 1;
    int add = 1;
    int N = 10;
    int K = 3;
    assertEquals(60L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case2() {
    int seed = 10;
    int mul = 0;
    int add = 13;
    int N = 5;
    int K = 2;
    assertEquals(49L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case3() {
    int seed = 10;
    int mul = 0;
    int add = 7;
    int N = 5;
    int K = 2;
    assertEquals(28L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case4() {
    int seed = 4123;
    int mul = 2341;
    int add = 1231;
    int N = 7;
    int K = 3;
    assertEquals(102186L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case5() {
    int seed = 47;
    int mul = 5621;
    int add = 1;
    int N = 125000;
    int K = 1700;
    assertEquals(4040137193L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case6() {
    int seed = 47474;
    int mul = 5621;
    int add = 1;
    int N = 250000;
    int K = 5000;
    assertEquals(8024139123L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case7() {
    int seed = 1;
    int mul = 2;
    int add = 0;
    int N = 250000;
    int K = 23;
    assertEquals(80L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case8() {
    int seed = 32321;
    int mul = 46543;
    int add = 32552;
    int N = 17;
    int K = 17;
    assertEquals(25569L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case9() {
    int seed = 453;
    int mul = 2;
    int add = 64;
    int N = 351;
    int K = 349;
    assertEquals(196416L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case10() {
    int seed = 62000;
    int mul = 1;
    int add = 1;
    int N = 250000;
    int K = 4789;
    assertEquals(7643623468L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case11() {
    int seed = 59003;
    int mul = 1;
    int add = 2;
    int N = 250000;
    int K = 4948;
    assertEquals(7791440981L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case12() {
    int seed = 32000;
    int mul = 1;
    int add = 65534;
    int N = 250000;
    int K = 4877;
    assertEquals(7838388810L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case13() {
    int seed = 32312;
    int mul = 5621;
    int add = 1;
    int N = 250000;
    int K = 1;
    assertEquals(8188512824L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case14() {
    int seed = 2312;
    int mul = 5621;
    int add = 1;
    int N = 250000;
    int K = 2;
    assertEquals(5459597502L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case15() {
    int seed = 12;
    int mul = 5621;
    int add = 1;
    int N = 250000;
    int K = 3;
    assertEquals(8189672636L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case16() {
    int seed = 1342;
    int mul = 5621;
    int add = 1;
    int N = 250000;
    int K = 4;
    assertEquals(6558391466L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case17() {
    int seed = 5342;
    int mul = 5621;
    int add = 1;
    int N = 250000;
    int K = 5;
    assertEquals(8189773423L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case18() {
    int seed = 5342;
    int mul = 5621;
    int add = 1;
    int N = 250000;
    int K = 10;
    assertEquals(7445288217L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case19() {
    int seed = 5342;
    int mul = 5621;
    int add = 1;
    int N = 250000;
    int K = 470;
    assertEquals(8159311713L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case20() {
    int seed = 5342;
    int mul = 5621;
    int add = 1;
    int N = 250000;
    int K = 4700;
    assertEquals(8029389174L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case21() {
    int seed = 5342;
    int mul = 5621;
    int add = 1;
    int N = 250000;
    int K = 4999;
    assertEquals(8021974075L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case22() {
    int seed = 5342;
    int mul = 5621;
    int add = 1;
    int N = 250000;
    int K = 5000;
    assertEquals(8020332398L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case23() {
    int seed = 32312;
    int mul = 4749;
    int add = 32174;
    int N = 250000;
    int K = 1;
    assertEquals(8195130512L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case24() {
    int seed = 2312;
    int mul = 4749;
    int add = 32174;
    int N = 250000;
    int K = 2;
    assertEquals(5466685796L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case25() {
    int seed = 12;
    int mul = 4749;
    int add = 32174;
    int N = 250000;
    int K = 3;
    assertEquals(8200474426L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case26() {
    int seed = 1342;
    int mul = 4749;
    int add = 32174;
    int N = 250000;
    int K = 4;
    assertEquals(6553562754L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case27() {
    int seed = 5342;
    int mul = 4749;
    int add = 32174;
    int N = 250000;
    int K = 5;
    assertEquals(8188528886L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case28() {
    int seed = 5342;
    int mul = 4749;
    int add = 32174;
    int N = 250000;
    int K = 10;
    assertEquals(7441233970L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case29() {
    int seed = 5342;
    int mul = 4749;
    int add = 32174;
    int N = 250000;
    int K = 470;
    assertEquals(8156352552L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case30() {
    int seed = 5342;
    int mul = 4749;
    int add = 32174;
    int N = 250000;
    int K = 4700;
    assertEquals(8037125160L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case31() {
    int seed = 5342;
    int mul = 4749;
    int add = 32174;
    int N = 250000;
    int K = 4999;
    assertEquals(8029664338L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case32() {
    int seed = 5342;
    int mul = 4749;
    int add = 32174;
    int N = 250000;
    int K = 5000;
    assertEquals(8027928740L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case33() {
    int seed = 65535;
    int mul = 1;
    int add = 0;
    int N = 250000;
    int K = 1;
    assertEquals(16383750000L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case34() {
    int seed = 32321;
    int mul = 46543;
    int add = 32552;
    int N = 17;
    int K = 17;
    assertEquals(25569L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case35() {
    int seed = 32321;
    int mul = 46543;
    int add = 32552;
    int N = 250000;
    int K = 5000;
    assertEquals(8028017305L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case36() {
    int seed = 47;
    int mul = 5621;
    int add = 1;
    int N = 125000;
    int K = 1700;
    assertEquals(4040137193L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case37() {
    int seed = 65535;
    int mul = 65535;
    int add = 65535;
    int N = 250000;
    int K = 5000;
    assertEquals(0L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case38() {
    int seed = 2423;
    int mul = 2342;
    int add = 34343;
    int N = 250000;
    int K = 5000;
    assertEquals(11141910477L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case39() {
    int seed = 12;
    int mul = 347;
    int add = 6;
    int N = 250000;
    int K = 5000;
    assertEquals(8022041130L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case40() {
    int seed = 32;
    int mul = 51;
    int add = 6342;
    int N = 250000;
    int K = 1000;
    assertEquals(8159464550L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case41() {
    int seed = 123;
    int mul = 13743;
    int add = 12345;
    int N = 250000;
    int K = 5000;
    assertEquals(8021019601L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case42() {
    int seed = 65530;
    int mul = 65535;
    int add = 65535;
    int N = 250000;
    int K = 4999;
    assertEquals(8028103035L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case43() {
    int seed = 65535;
    int mul = 65535;
    int add = 0;
    int N = 2;
    int K = 1;
    assertEquals(65536L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case44() {
    int seed = 1532;
    int mul = 2354;
    int add = 4234;
    int N = 250000;
    int K = 5000;
    assertEquals(2592600582L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case45() {
    int seed = 65535;
    int mul = 65535;
    int add = 65535;
    int N = 250000;
    int K = 2500;
    assertEquals(0L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case46() {
    int seed = 32321;
    int mul = 46543;
    int add = 32551;
    int N = 240000;
    int K = 4999;
    assertEquals(7696717437L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case47() {
    int seed = 0;
    int mul = 1;
    int add = 1;
    int N = 250000;
    int K = 5000;
    assertEquals(7734014667L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case48() {
    int seed = 1337;
    int mul = 65534;
    int add = 2;
    int N = 250000;
    int K = 3;
    assertEquals(5461574920L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case49() {
    int seed = 57;
    int mul = 65501;
    int add = 50000;
    int N = 250000;
    int K = 5000;
    assertEquals(8035343957L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case50() {
    int seed = 65535;
    int mul = 65535;
    int add = 13;
    int N = 250000;
    int K = 5000;
    assertEquals(3430014L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case51() {
    int seed = 10;
    int mul = 2;
    int add = 3;
    int N = 250000;
    int K = 5000;
    assertEquals(16055650533L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case52() {
    int seed = 47;
    int mul = 5621;
    int add = 1;
    int N = 250000;
    int K = 5000;
    assertEquals(8023179659L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case53() {
    int seed = 65534;
    int mul = 65533;
    int add = 65530;
    int N = 250000;
    int K = 5000;
    assertEquals(8028296292L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case54() {
    int seed = 47;
    int mul = 5623;
    int add = 1;
    int N = 125000;
    int K = 1700;
    assertEquals(4034637764L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case55() {
    int seed = 34;
    int mul = 157;
    int add = 31;
    int N = 150000;
    int K = 5000;
    assertEquals(4751093065L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case56() {
    int seed = 1;
    int mul = 1;
    int add = 2;
    int N = 250000;
    int K = 50;
    assertEquals(7940052591L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case57() {
    int seed = 40000;
    int mul = 40000;
    int add = 40000;
    int N = 200000;
    int K = 4000;
    assertEquals(8642860096L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case58() {
    int seed = 3;
    int mul = 1;
    int add = 1;
    int N = 250000;
    int K = 5000;
    assertEquals(7734159846L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

  @Test
  public void case59() {
    int seed = 47;
    int mul = 5621;
    int add = 1;
    int N = 25000;
    int K = 5000;
    assertEquals(650821320L, floatingmedian.sumOfMedians(seed, mul, add, N, K));
  }

}
