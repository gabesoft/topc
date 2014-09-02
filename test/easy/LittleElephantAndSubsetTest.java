package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class LittleElephantAndSubsetTest {
  LittleElephantAndSubset littleelephantandsubset = new LittleElephantAndSubset();

  @Test
  public void case1() {
    int N = 3;
    assertEquals(7, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case2() {
    int N = 10;
    assertEquals(767, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case3() {
    int N = 47;
    assertEquals(25775, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case4() {
    int N = 4777447;
    assertEquals(66437071, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case5() {
    int N = 1000000000;
    assertEquals(88291951, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case6() {
    int N = 1;
    assertEquals(1, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case7() {
    int N = 7;
    assertEquals(127, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case8() {
    int N = 999999999;
    assertEquals(88291951, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case9() {
    int N = 100000001;
    assertEquals(82122991, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case10() {
    int N = 777777777;
    assertEquals(86769871, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case11() {
    int N = 474747474;
    assertEquals(84676111, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case12() {
    int N = 883;
    assertEquals(5821431, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case13() {
    int N = 153;
    assertEquals(613623, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case14() {
    int N = 222;
    assertEquals(844479, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case15() {
    int N = 893;
    assertEquals(5895791, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case16() {
    int N = 234;
    assertEquals(861303, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case17() {
    int N = 428;
    assertEquals(1821447, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case18() {
    int N = 651;
    assertEquals(3447559, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case19() {
    int N = 24866;
    assertEquals(27503839, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case20() {
    int N = 61390;
    assertEquals(35897155, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case21() {
    int N = 6619;
    assertEquals(17076727, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case22() {
    int N = 78830;
    assertEquals(39888079, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case23() {
    int N = 84077;
    assertEquals(41330863, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case24() {
    int N = 42098;
    assertEquals(31520311, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case25() {
    int N = 1658;
    assertEquals(8228067, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case26() {
    int N = 1200147;
    assertEquals(61613551, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case27() {
    int N = 1777734;
    assertEquals(62445391, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case28() {
    int N = 9818267;
    assertEquals(73308751, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case29() {
    int N = 8012510;
    assertEquals(70753791, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case30() {
    int N = 8351202;
    assertEquals(71294471, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case31() {
    int N = 618985;
    assertEquals(54575911, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case32() {
    int N = 3988088;
    assertEquals(65430511, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case33() {
    int N = 783837108;
    assertEquals(86806711, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case34() {
    int N = 349651100;
    assertEquals(83798083, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case35() {
    int N = 683484993;
    assertEquals(86118415, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case36() {
    int N = 553337439;
    assertEquals(85247791, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case37() {
    int N = 88068199;
    assertEquals(81049471, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case38() {
    int N = 972282891;
    assertEquals(88162951, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case39() {
    int N = 781586125;
    assertEquals(86786455, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case40() {
    int N = 258626540;
    assertEquals(83178607, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case41() {
    int N = 246182120;
    assertEquals(83080807, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case42() {
    int N = 762952004;
    assertEquals(86722729, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case43() {
    int N = 918195326;
    assertEquals(87754831, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case44() {
    int N = 258677230;
    assertEquals(83179213, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case45() {
    int N = 419698256;
    assertEquals(84332911, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case46() {
    int N = 491250840;
    assertEquals(84801167, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case47() {
    int N = 19;
    assertEquals(1791, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case48() {
    int N = 1000000;
    assertEquals(61438831, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case49() {
    int N = 13;
    assertEquals(1023, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case50() {
    int N = 100000000;
    assertEquals(82122991, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case51() {
    int N = 14;
    assertEquals(1151, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case52() {
    int N = 999999998;
    assertEquals(88291951, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case53() {
    int N = 907014377;
    assertEquals(87666991, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case54() {
    int N = 16;
    assertEquals(1407, littleelephantandsubset.getNumber(N));
  }

  @Test
  public void case55() {
    int N = 713526152;
    assertEquals(86340133, littleelephantandsubset.getNumber(N));
  }

}
