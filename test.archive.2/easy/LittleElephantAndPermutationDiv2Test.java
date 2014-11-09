package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class LittleElephantAndPermutationDiv2Test {
  LittleElephantAndPermutationDiv2 littleelephantandpermutationdiv2 = new LittleElephantAndPermutationDiv2();

  @Test
  public void case1() {
    int N = 1;
    int K = 1;
    assertEquals(1L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case2() {
    int N = 2;
    int K = 1;
    assertEquals(4L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case3() {
    int N = 3;
    int K = 8;
    assertEquals(18L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case4() {
    int N = 10;
    int K = 47;
    assertEquals(13168189440000L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case5() {
    int N = 7;
    int K = 1;
    assertEquals(25401600L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case6() {
    int N = 7;
    int K = 7;
    assertEquals(25401600L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case7() {
    int N = 7;
    int K = 47;
    assertEquals(0L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case8() {
    int N = 10;
    int K = 100;
    assertEquals(0L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case9() {
    int N = 9;
    int K = 74;
    assertEquals(0L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case10() {
    int N = 9;
    int K = 65;
    assertEquals(1881169920L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case11() {
    int N = 10;
    int K = 80;
    assertEquals(52254720000L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case12() {
    int N = 10;
    int K = 70;
    assertEquals(9397924300800L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case13() {
    int N = 10;
    int K = 65;
    assertEquals(12799692057600L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case14() {
    int N = 10;
    int K = 57;
    assertEquals(13168153152000L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case15() {
    int N = 10;
    int K = 40;
    assertEquals(13168189440000L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case16() {
    int N = 10;
    int K = 47;
    assertEquals(13168189440000L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case17() {
    int N = 10;
    int K = 1;
    assertEquals(13168189440000L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case18() {
    int N = 10;
    int K = 12;
    assertEquals(13168189440000L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case19() {
    int N = 9;
    int K = 50;
    assertEquals(131413726080L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case20() {
    int N = 9;
    int K = 1;
    assertEquals(131681894400L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case21() {
    int N = 8;
    int K = 1;
    assertEquals(1625702400L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case22() {
    int N = 7;
    int K = 1;
    assertEquals(25401600L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case23() {
    int N = 6;
    int K = 1;
    assertEquals(518400L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case24() {
    int N = 5;
    int K = 1;
    assertEquals(14400L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case25() {
    int N = 4;
    int K = 1;
    assertEquals(576L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case26() {
    int N = 3;
    int K = 1;
    assertEquals(36L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case27() {
    int N = 7;
    int K = 32;
    assertEquals(24857280L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case28() {
    int N = 6;
    int K = 17;
    assertEquals(518400L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case29() {
    int N = 5;
    int K = 7;
    assertEquals(14400L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case30() {
    int N = 6;
    int K = 15;
    assertEquals(518400L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case31() {
    int N = 5;
    int K = 10;
    assertEquals(14400L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case32() {
    int N = 1;
    int K = 100;
    assertEquals(0L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case33() {
    int N = 8;
    int K = 100;
    assertEquals(0L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case34() {
    int N = 10;
    int K = 66;
    assertEquals(12496977561600L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case35() {
    int N = 10;
    int K = 89;
    assertEquals(0L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case36() {
    int N = 10;
    int K = 30;
    assertEquals(13168189440000L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case37() {
    int N = 10;
    int K = 62;
    assertEquals(13133723097600L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case38() {
    int N = 10;
    int K = 55;
    assertEquals(13168189440000L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case39() {
    int N = 10;
    int K = 99;
    assertEquals(0L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case40() {
    int N = 10;
    int K = 88;
    assertEquals(0L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case41() {
    int N = 10;
    int K = 60;
    assertEquals(13164284851200L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case42() {
    int N = 10;
    int K = 56;
    assertEquals(13168185811200L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case43() {
    int N = 10;
    int K = 11;
    assertEquals(13168189440000L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case44() {
    int N = 3;
    int K = 20;
    assertEquals(0L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case45() {
    int N = 5;
    int K = 16;
    assertEquals(14280L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case46() {
    int N = 3;
    int K = 100;
    assertEquals(0L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case47() {
    int N = 4;
    int K = 14;
    assertEquals(96L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case48() {
    int N = 2;
    int K = 4;
    assertEquals(2L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case49() {
    int N = 1;
    int K = 2;
    assertEquals(0L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case50() {
    int N = 4;
    int K = 100;
    assertEquals(0L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case51() {
    int N = 10;
    int K = 67;
    assertEquals(12033071769600L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case52() {
    int N = 4;
    int K = 12;
    assertEquals(480L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case53() {
    int N = 8;
    int K = 40;
    assertEquals(1619412480L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case54() {
    int N = 5;
    int K = 21;
    assertEquals(2400L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case55() {
    int N = 2;
    int K = 100;
    assertEquals(0L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case56() {
    int N = 5;
    int K = 17;
    assertEquals(13800L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

  @Test
  public void case57() {
    int N = 10;
    int K = 73;
    assertEquals(5323972147200L, littleelephantandpermutationdiv2.getNumber(N, K));
  }

}
