package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class LittleElephantAndXorTest {
  LittleElephantAndXor littleelephantandxor = new LittleElephantAndXor();

  @Test
  public void case1() {
    int A = 2;
    int B = 2;
    int C = 1;
    assertEquals(5L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case2() {
    int A = 4;
    int B = 7;
    int C = 3;
    assertEquals(20L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case3() {
    int A = 10;
    int B = 10;
    int C = 5;
    assertEquals(57L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case4() {
    int A = 774;
    int B = 477;
    int C = 447;
    assertEquals(214144L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case5() {
    int A = 1000000000;
    int B = 1000000000;
    int C = 500000000;
    assertEquals(468566946385621507L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case6() {
    int A = 458795402;
    int B = 684548754;
    int C = 1;
    assertEquals(917590806L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case7() {
    int A = 1000000000;
    int B = 1000000000;
    int C = 74;
    assertEquals(75000000001L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case8() {
    int A = 1000000000;
    int B = 1000000000;
    int C = 487598545;
    assertEquals(457079997272772517L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case9() {
    int A = 1000000000;
    int B = 1000000000;
    int C = 10;
    assertEquals(11000000001L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case10() {
    int A = 1000000000;
    int B = 1000000000;
    int C = 100;
    assertEquals(101000000001L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case11() {
    int A = 1000000000;
    int B = 1000000000;
    int C = 1000;
    assertEquals(1000999750611L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case12() {
    int A = 1000000000;
    int B = 1000000000;
    int C = 1000000;
    assertEquals(999776121957507L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case13() {
    int A = 1000000000;
    int B = 1000000000;
    int C = 10000000;
    assertEquals(9977667558462723L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case14() {
    int A = 1000000000;
    int B = 999999999;
    int C = 4587455;
    assertEquals(4582484343704064L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case15() {
    int A = 999999999;
    int B = 999999997;
    int C = 1;
    assertEquals(1999999996L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case16() {
    int A = 695574;
    int B = 487545895;
    int C = 45875774;
    assertEquals(31910042195625L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case17() {
    int A = 174094883;
    int B = 455171153;
    int C = 761423222;
    assertEquals(79242969255776136L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case18() {
    int A = 685761893;
    int B = 795431234;
    int C = 411387428;
    assertEquals(259359244590272434L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case19() {
    int A = 793198651;
    int B = 286024866;
    int C = 90061390;
    assertEquals(25759797382609997L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case20() {
    int A = 344606619;
    int B = 496378830;
    int C = 135984077;
    assertEquals(46861013493396360L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case21() {
    int A = 361542098;
    int B = 372601658;
    int C = 541200147;
    assertEquals(134711185885742241L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case22() {
    int A = 71777734;
    int B = 599818267;
    int C = 38012510;
    assertEquals(2728451941242585L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case23() {
    int A = 478351202;
    int B = 640618985;
    int C = 143988088;
    assertEquals(68876875590821067L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case24() {
    int A = 783837108;
    int B = 349651100;
    int C = 484993;
    assertEquals(169578686078394L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case25() {
    int A = 553337439;
    int B = 88068199;
    int C = 282891;
    assertEquals(24913789234400L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case26() {
    int A = 781586125;
    int B = 258626540;
    int C = 182120;
    assertEquals(47101324273461L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case27() {
    int A = 762952004;
    int B = 918195326;
    int C = 677230;
    assertEquals(516694749298155L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case28() {
    int A = 419698256;
    int B = 491250840;
    int C = 799770;
    assertEquals(335662494699147L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case29() {
    int A = 357665826;
    int B = 441616336;
    int C = 825362;
    assertEquals(295204139970201L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case30() {
    int A = 862146292;
    int B = 503649294;
    int C = 596343;
    assertEquals(300348235177480L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case31() {
    int A = 581258;
    int B = 442931;
    int C = 8730383;
    assertEquals(257458211388L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case32() {
    int A = 372976;
    int B = 211326;
    int C = 1222641;
    assertEquals(78820110479L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case33() {
    int A = 400532;
    int B = 500455;
    int C = 6482169;
    assertEquals(200449143048L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case34() {
    int A = 849208;
    int B = 705674;
    int C = 9265775;
    assertEquals(599265561075L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case35() {
    int A = 830224;
    int B = 554027;
    int C = 1117301;
    assertEquals(459967896300L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case36() {
    int A = 12904;
    int B = 770894;
    int C = 4783711;
    assertEquals(9948399975L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case37() {
    int A = 450146;
    int B = 356668;
    int C = 7191628;
    assertEquals(160553480343L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case38() {
    int A = 999999999;
    int B = 1000000000;
    int C = 275484584;
    assertEquals(260607706026806697L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case39() {
    int A = 999999998;
    int B = 999999097;
    int C = 354875965;
    assertEquals(334144367716115668L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case40() {
    int A = 900000009;
    int B = 800000008;
    int C = 700000007;
    assertEquals(485941141015817970L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case41() {
    int A = 1;
    int B = 1;
    int C = 1000000000;
    assertEquals(4L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case42() {
    int A = 43214423;
    int B = 43214423;
    int C = 33434;
    assertEquals(1444684709440L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case43() {
    int A = 1000000000;
    int B = 11111111;
    int C = 11111111;
    assertEquals(123456809876544L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case44() {
    int A = 10000000;
    int B = 10000000;
    int C = 500000000;
    assertEquals(100000020000001L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case45() {
    int A = 1000000000;
    int B = 1000000000;
    int C = 1000000000;
    assertEquals(931696035385621507L, littleelephantandxor.getNumber(A, B, C));
  }

  @Test
  public void case46() {
    int A = 234543554;
    int B = 34543;
    int C = 3464562;
    assertEquals(119679864272L, littleelephantandxor.getNumber(A, B, C));
  }

}
