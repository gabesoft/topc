package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class SparseFactorialDiv2Test {
  SparseFactorialDiv2 sparsefactorialdiv2 = new SparseFactorialDiv2();

  @Test
  public void case1() {
    long lo = 4L;
    long hi = 8L;
    long divisor = 3L;
    assertEquals(3L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case2() {
    long lo = 9L;
    long hi = 11L;
    long divisor = 7L;
    assertEquals(1L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case3() {
    long lo = 1L;
    long hi = 1000000000000L;
    long divisor = 2L;
    assertEquals(999999999999L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case4() {
    long lo = 16L;
    long hi = 26L;
    long divisor = 11L;
    assertEquals(4L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case5() {
    long lo = 10000L;
    long hi = 20000L;
    long divisor = 997L;
    assertEquals(1211L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case6() {
    long lo = 123456789L;
    long hi = 987654321L;
    long divisor = 71L;
    assertEquals(438184668L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case7() {
    long lo = 1L;
    long hi = 1000000000000L;
    long divisor = 2L;
    assertEquals(999999999999L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case8() {
    long lo = 3L;
    long hi = 4L;
    long divisor = 2L;
    assertEquals(2L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case9() {
    long lo = 1L;
    long hi = 2L;
    long divisor = 2L;
    assertEquals(1L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case10() {
    long lo = 2L;
    long hi = 2L;
    long divisor = 2L;
    assertEquals(1L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case11() {
    long lo = 5L;
    long hi = 5L;
    long divisor = 2L;
    assertEquals(1L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case12() {
    long lo = 370838091663L;
    long hi = 834675418055L;
    long divisor = 2L;
    assertEquals(463837326393L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case13() {
    long lo = 1L;
    long hi = 1000000000000L;
    long divisor = 3L;
    assertEquals(666666666666L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case14() {
    long lo = 3L;
    long hi = 9L;
    long divisor = 3L;
    assertEquals(5L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case15() {
    long lo = 1L;
    long hi = 3L;
    long divisor = 3L;
    assertEquals(1L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case16() {
    long lo = 3L;
    long hi = 5L;
    long divisor = 3L;
    assertEquals(2L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case17() {
    long lo = 9L;
    long hi = 9L;
    long divisor = 3L;
    assertEquals(1L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case18() {
    long lo = 9055532301L;
    long hi = 996884473171L;
    long divisor = 3L;
    assertEquals(658552627248L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case19() {
    long lo = 1L;
    long hi = 1000000000000L;
    long divisor = 5L;
    assertEquals(599999999998L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case20() {
    long lo = 13L;
    long hi = 17L;
    long divisor = 5L;
    assertEquals(3L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case21() {
    long lo = 1L;
    long hi = 5L;
    long divisor = 5L;
    assertEquals(1L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case22() {
    long lo = 4L;
    long hi = 10L;
    long divisor = 5L;
    assertEquals(4L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case23() {
    long lo = 26L;
    long hi = 27L;
    long divisor = 5L;
    assertEquals(1L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case24() {
    long lo = 379639826536L;
    long hi = 866779149316L;
    long divisor = 5L;
    assertEquals(292283593669L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case25() {
    long lo = 1L;
    long hi = 1000000000000L;
    long divisor = 7L;
    assertEquals(571428571425L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case26() {
    long lo = 24L;
    long hi = 30L;
    long divisor = 7L;
    assertEquals(4L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case27() {
    long lo = 1L;
    long hi = 2L;
    long divisor = 7L;
    assertEquals(0L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case28() {
    long lo = 5L;
    long hi = 13L;
    long divisor = 7L;
    assertEquals(3L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case29() {
    long lo = 49L;
    long hi = 54L;
    long divisor = 7L;
    assertEquals(4L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case30() {
    long lo = 207410943772L;
    long hi = 620271392370L;
    long divisor = 7L;
    assertEquals(235920256342L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case31() {
    long lo = 1L;
    long hi = 1000000000000L;
    long divisor = 107L;
    assertEquals(504672896695L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case32() {
    long lo = 2903L;
    long hi = 4519L;
    long divisor = 107L;
    assertEquals(815L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case33() {
    long lo = 17L;
    long hi = 40L;
    long divisor = 107L;
    assertEquals(0L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case34() {
    long lo = 148L;
    long hi = 195L;
    long divisor = 107L;
    assertEquals(3L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case35() {
    long lo = 11461L;
    long hi = 11512L;
    long divisor = 107L;
    assertEquals(29L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case36() {
    long lo = 147603225663L;
    long hi = 380596911938L;
    long divisor = 107L;
    assertEquals(117585598684L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case37() {
    long lo = 1L;
    long hi = 1000000000000L;
    long divisor = 337L;
    assertEquals(501483674710L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case38() {
    long lo = 29103L;
    long hi = 86775L;
    long divisor = 337L;
    assertEquals(28919L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case39() {
    long lo = 188L;
    long hi = 247L;
    long divisor = 337L;
    assertEquals(0L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case40() {
    long lo = 394L;
    long hi = 563L;
    long divisor = 337L;
    assertEquals(8L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case41() {
    long lo = 113758L;
    long hi = 113793L;
    long divisor = 337L;
    assertEquals(15L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case42() {
    long lo = 912777978662L;
    long hi = 929259735768L;
    long divisor = 337L;
    assertEquals(8265332200L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case43() {
    long lo = 1L;
    long hi = 1000000000000L;
    long divisor = 487L;
    assertEquals(501026684047L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case44() {
    long lo = 69498L;
    long hi = 164388L;
    long divisor = 487L;
    assertEquals(47539L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case45() {
    long lo = 147L;
    long hi = 463L;
    long divisor = 487L;
    assertEquals(0L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case46() {
    long lo = 438L;
    long hi = 501L;
    long divisor = 487L;
    assertEquals(4L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case47() {
    long lo = 237238L;
    long hi = 237650L;
    long divisor = 487L;
    assertEquals(206L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case48() {
    long lo = 320625606143L;
    long hi = 400928202194L;
    long divisor = 487L;
    assertEquals(40233744226L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case49() {
    long lo = 1L;
    long hi = 1000000000000L;
    long divisor = 911L;
    assertEquals(500548812613L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case50() {
    long lo = 525413L;
    long hi = 828127L;
    long divisor = 911L;
    assertEquals(151514L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case51() {
    long lo = 236L;
    long hi = 596L;
    long divisor = 911L;
    assertEquals(0L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case52() {
    long lo = 755L;
    long hi = 1058L;
    long divisor = 911L;
    assertEquals(13L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case53() {
    long lo = 830157L;
    long hi = 830425L;
    long divisor = 911L;
    assertEquals(138L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case54() {
    long lo = 175957449324L;
    long hi = 696933000636L;
    long divisor = 911L;
    assertEquals(260773711743L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case55() {
    long lo = 1L;
    long hi = 1000000000000L;
    long divisor = 937L;
    assertEquals(500533581123L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case56() {
    long lo = 75190L;
    long hi = 132182L;
    long divisor = 937L;
    assertEquals(19509L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case57() {
    long lo = 468L;
    long hi = 736L;
    long divisor = 937L;
    assertEquals(0L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case58() {
    long lo = 829L;
    long hi = 1307L;
    long divisor = 937L;
    assertEquals(20L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case59() {
    long lo = 878427L;
    long hi = 878791L;
    long divisor = 937L;
    assertEquals(175L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case60() {
    long lo = 49404831106L;
    long hi = 726655676267L;
    long divisor = 937L;
    assertEquals(338986815769L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case61() {
    long lo = 1L;
    long hi = 1000000000000L;
    long divisor = 967L;
    assertEquals(500517023885L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case62() {
    long lo = 182310L;
    long hi = 563120L;
    long divisor = 967L;
    assertEquals(189109L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case63() {
    long lo = 284L;
    long hi = 727L;
    long divisor = 967L;
    assertEquals(0L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case64() {
    long lo = 1246L;
    long hi = 1775L;
    long divisor = 967L;
    assertEquals(12L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case65() {
    long lo = 935481L;
    long hi = 935520L;
    long divisor = 967L;
    assertEquals(17L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case66() {
    long lo = 298893793182L;
    long hi = 784617505894L;
    long divisor = 967L;
    assertEquals(243113006143L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case67() {
    long lo = 1L;
    long hi = 1000000000000L;
    long divisor = 997L;
    assertEquals(500501462850L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case68() {
    long lo = 277346L;
    long hi = 522107L;
    long divisor = 997L;
    assertEquals(122495L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case69() {
    long lo = 233L;
    long hi = 250L;
    long divisor = 997L;
    assertEquals(0L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case70() {
    long lo = 603L;
    long hi = 702L;
    long divisor = 997L;
    assertEquals(0L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case71() {
    long lo = 994083L;
    long hi = 994228L;
    long divisor = 997L;
    assertEquals(72L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case72() {
    long lo = 183635036997L;
    long hi = 394410526165L;
    long divisor = 997L;
    assertEquals(105493449447L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case73() {
    long lo = 1L;
    long hi = 999999999999L;
    long divisor = 17L;
    assertEquals(529411764688L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case74() {
    long lo = 123456789000L;
    long hi = 987654321000L;
    long divisor = 71L;
    assertEquals(438184664115L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case75() {
    long lo = 179426549L;
    long hi = 1000000000000L;
    long divisor = 997L;
    assertEquals(500411701255L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case76() {
    long lo = 10000000000L;
    long hi = 1000000000000L;
    long divisor = 2L;
    assertEquals(990000000001L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

  @Test
  public void case77() {
    long lo = 1L;
    long hi = 1000000000000L;
    long divisor = 13L;
    assertEquals(538461538452L, sparsefactorialdiv2.getCount(lo, hi, divisor));
  }

}
