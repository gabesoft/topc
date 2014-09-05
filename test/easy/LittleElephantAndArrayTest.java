package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class LittleElephantAndArrayTest {
  LittleElephantAndArray littleelephantandarray = new LittleElephantAndArray();

  @Test
  public void case1() {
    long A = 1L;
    int N = 9;
    assertEquals(1, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case2() {
    long A = 10L;
    int N = 2;
    assertEquals(15, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case3() {
    long A = 4747774L;
    int N = 1;
    assertEquals(8369, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case4() {
    long A = 6878542150015L;
    int N = 74;
    assertEquals(977836619, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case5() {
    long A = 1000000000000000L;
    int N = 100;
    assertEquals(22435455, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case6() {
    long A = 458975015421547L;
    int N = 100;
    assertEquals(959658342, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case7() {
    long A = 1L;
    int N = 0;
    assertEquals(1, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case8() {
    long A = 7L;
    int N = 100;
    assertEquals(1, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case9() {
    long A = 4584L;
    int N = 99;
    assertEquals(723792987, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case10() {
    long A = 698458458L;
    int N = 47;
    assertEquals(865110940, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case11() {
    long A = 999999L;
    int N = 100;
    assertEquals(832160019, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case12() {
    long A = 999999999999999L;
    int N = 99;
    assertEquals(726682887, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case13() {
    long A = 999999999999L;
    int N = 1;
    assertEquals(9736590, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case14() {
    long A = 174094882455171L;
    int N = 47;
    assertEquals(820811374, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case15() {
    long A = 152761423221685L;
    int N = 99;
    assertEquals(626576399, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case16() {
    long A = 761892795431233L;
    int N = 99;
    assertEquals(3096955, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case17() {
    long A = 411387427793198L;
    int N = 100;
    assertEquals(380569836, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case18() {
    long A = 650286024865090L;
    int N = 100;
    assertEquals(297459252, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case19() {
    long A = 61389344606618L;
    int N = 100;
    assertEquals(966356191, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case20() {
    long A = 49637882913598L;
    int N = 100;
    assertEquals(196396154, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case21() {
    long A = 4L;
    int N = 100;
    assertEquals(1, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case22() {
    long A = 76361542097372L;
    int N = 0;
    assertEquals(16383, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case23() {
    long A = 601657541200146L;
    int N = 7;
    assertEquals(937030068, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case24() {
    long A = 71777733599818L;
    int N = 2;
    assertEquals(109835302, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case25() {
    long A = 266038012509478L;
    int N = 1;
    assertEquals(536875419, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case26() {
    long A = 351201640618984L;
    int N = 25;
    assertEquals(801343434, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case27() {
    long A = 143988087783837L;
    int N = 97;
    assertEquals(234890512, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case28() {
    long A = 107349651099683L;
    int N = 100;
    assertEquals(476141741, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case29() {
    long A = 4849925L;
    int N = 74;
    assertEquals(236923574, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case30() {
    long A = 53337438088L;
    int N = 79;
    assertEquals(751395306, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case31() {
    long A = 6819897228L;
    int N = 100;
    assertEquals(684345262, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case32() {
    long A = 28907815861L;
    int N = 100;
    assertEquals(175903871, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case33() {
    long A = 24258626539L;
    int N = 99;
    assertEquals(649350618, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case34() {
    long A = 24618211976L;
    int N = 98;
    assertEquals(762873461, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case35() {
    long A = 295200391819L;
    int N = 100;
    assertEquals(573358811, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case36() {
    long A = 5325258677229L;
    int N = 100;
    assertEquals(184495288, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case37() {
    long A = 4196982554L;
    int N = 100;
    assertEquals(279812471, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case38() {
    long A = 9125083L;
    int N = 75;
    assertEquals(569602429, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case39() {
    long A = 99999875099999L;
    int N = 100;
    assertEquals(181093175, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case40() {
    long A = 1000000000000000L;
    int N = 2;
    assertEquals(734978268, littleelephantandarray.getNumber(A, N));
  }

  @Test
  public void case41() {
    long A = 687852150022153L;
    int N = 87;
    assertEquals(603846919, littleelephantandarray.getNumber(A, N));
  }

}
