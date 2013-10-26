package topc.test.recursion;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.recursion.*;

public class RedundantStringsTest {
  RedundantStrings redundantstrings = new RedundantStrings();

  @Test
  public void case1() {
    int length = 60;
    assertEquals(1074793396, redundantstrings.howMany(length));
  }

  @Test
  public void case2() {
    int length = 1;
    assertEquals(0, redundantstrings.howMany(length));
  }

  @Test
  public void case3() {
    int length = 2;
    assertEquals(2, redundantstrings.howMany(length));
  }

  @Test
  public void case4() {
    int length = 4;
    assertEquals(4, redundantstrings.howMany(length));
  }

  @Test
  public void case5() {
    int length = 58;
    assertEquals(536870914, redundantstrings.howMany(length));
  }

  @Test
  public void case6() {
    int length = 59;
    assertEquals(2, redundantstrings.howMany(length));
  }

  @Test
  public void case7() {
    int length = 10;
    assertEquals(34, redundantstrings.howMany(length));
  }

  @Test
  public void case8() {
    int length = 30;
    assertEquals(33814, redundantstrings.howMany(length));
  }

  @Test
  public void case9() {
    int length = 1;
    assertEquals(0, redundantstrings.howMany(length));
  }

  @Test
  public void case10() {
    int length = 2;
    assertEquals(2, redundantstrings.howMany(length));
  }

  @Test
  public void case11() {
    int length = 3;
    assertEquals(2, redundantstrings.howMany(length));
  }

  @Test
  public void case12() {
    int length = 4;
    assertEquals(4, redundantstrings.howMany(length));
  }

  @Test
  public void case13() {
    int length = 5;
    assertEquals(2, redundantstrings.howMany(length));
  }

  @Test
  public void case14() {
    int length = 6;
    assertEquals(10, redundantstrings.howMany(length));
  }

  @Test
  public void case15() {
    int length = 7;
    assertEquals(2, redundantstrings.howMany(length));
  }

  @Test
  public void case16() {
    int length = 8;
    assertEquals(16, redundantstrings.howMany(length));
  }

  @Test
  public void case17() {
    int length = 9;
    assertEquals(8, redundantstrings.howMany(length));
  }

  @Test
  public void case18() {
    int length = 10;
    assertEquals(34, redundantstrings.howMany(length));
  }

  @Test
  public void case19() {
    int length = 11;
    assertEquals(2, redundantstrings.howMany(length));
  }

  @Test
  public void case20() {
    int length = 12;
    assertEquals(76, redundantstrings.howMany(length));
  }

  @Test
  public void case21() {
    int length = 13;
    assertEquals(2, redundantstrings.howMany(length));
  }

  @Test
  public void case22() {
    int length = 14;
    assertEquals(130, redundantstrings.howMany(length));
  }

  @Test
  public void case23() {
    int length = 15;
    assertEquals(38, redundantstrings.howMany(length));
  }

  @Test
  public void case24() {
    int length = 16;
    assertEquals(256, redundantstrings.howMany(length));
  }

  @Test
  public void case25() {
    int length = 17;
    assertEquals(2, redundantstrings.howMany(length));
  }

  @Test
  public void case26() {
    int length = 18;
    assertEquals(568, redundantstrings.howMany(length));
  }

  @Test
  public void case27() {
    int length = 19;
    assertEquals(2, redundantstrings.howMany(length));
  }

  @Test
  public void case28() {
    int length = 20;
    assertEquals(1036, redundantstrings.howMany(length));
  }

  @Test
  public void case29() {
    int length = 21;
    assertEquals(134, redundantstrings.howMany(length));
  }

  @Test
  public void case30() {
    int length = 22;
    assertEquals(2050, redundantstrings.howMany(length));
  }

  @Test
  public void case31() {
    int length = 23;
    assertEquals(2, redundantstrings.howMany(length));
  }

  @Test
  public void case32() {
    int length = 24;
    assertEquals(4336, redundantstrings.howMany(length));
  }

  @Test
  public void case33() {
    int length = 25;
    assertEquals(32, redundantstrings.howMany(length));
  }

  @Test
  public void case34() {
    int length = 26;
    assertEquals(8194, redundantstrings.howMany(length));
  }

  @Test
  public void case35() {
    int length = 27;
    assertEquals(512, redundantstrings.howMany(length));
  }

  @Test
  public void case36() {
    int length = 28;
    assertEquals(16396, redundantstrings.howMany(length));
  }

  @Test
  public void case37() {
    int length = 29;
    assertEquals(2, redundantstrings.howMany(length));
  }

  @Test
  public void case38() {
    int length = 30;
    assertEquals(33814, redundantstrings.howMany(length));
  }

  @Test
  public void case39() {
    int length = 31;
    assertEquals(2, redundantstrings.howMany(length));
  }

  @Test
  public void case40() {
    int length = 32;
    assertEquals(65536, redundantstrings.howMany(length));
  }

  @Test
  public void case41() {
    int length = 33;
    assertEquals(2054, redundantstrings.howMany(length));
  }

  @Test
  public void case42() {
    int length = 34;
    assertEquals(131074, redundantstrings.howMany(length));
  }

  @Test
  public void case43() {
    int length = 35;
    assertEquals(158, redundantstrings.howMany(length));
  }

  @Test
  public void case44() {
    int length = 36;
    assertEquals(266176, redundantstrings.howMany(length));
  }

  @Test
  public void case45() {
    int length = 37;
    assertEquals(2, redundantstrings.howMany(length));
  }

  @Test
  public void case46() {
    int length = 38;
    assertEquals(524290, redundantstrings.howMany(length));
  }

  @Test
  public void case47() {
    int length = 39;
    assertEquals(8198, redundantstrings.howMany(length));
  }

  @Test
  public void case48() {
    int length = 40;
    assertEquals(1048816, redundantstrings.howMany(length));
  }

  @Test
  public void case49() {
    int length = 41;
    assertEquals(2, redundantstrings.howMany(length));
  }

  @Test
  public void case50() {
    int length = 42;
    assertEquals(2113462, redundantstrings.howMany(length));
  }

  @Test
  public void case51() {
    int length = 43;
    assertEquals(2, redundantstrings.howMany(length));
  }

  @Test
  public void case52() {
    int length = 44;
    assertEquals(4194316, redundantstrings.howMany(length));
  }

  @Test
  public void case53() {
    int length = 45;
    assertEquals(33272, redundantstrings.howMany(length));
  }

  @Test
  public void case54() {
    int length = 46;
    assertEquals(8388610, redundantstrings.howMany(length));
  }

  @Test
  public void case55() {
    int length = 47;
    assertEquals(2, redundantstrings.howMany(length));
  }

  @Test
  public void case56() {
    int length = 48;
    assertEquals(16842496, redundantstrings.howMany(length));
  }

  @Test
  public void case57() {
    int length = 49;
    assertEquals(128, redundantstrings.howMany(length));
  }

  @Test
  public void case58() {
    int length = 50;
    assertEquals(33555424, redundantstrings.howMany(length));
  }

  @Test
  public void case59() {
    int length = 51;
    assertEquals(131078, redundantstrings.howMany(length));
  }

  @Test
  public void case60() {
    int length = 52;
    assertEquals(67108876, redundantstrings.howMany(length));
  }

  @Test
  public void case61() {
    int length = 53;
    assertEquals(2, redundantstrings.howMany(length));
  }

  @Test
  public void case62() {
    int length = 54;
    assertEquals(134479360, redundantstrings.howMany(length));
  }

  @Test
  public void case63() {
    int length = 55;
    assertEquals(2078, redundantstrings.howMany(length));
  }

  @Test
  public void case64() {
    int length = 56;
    assertEquals(268435696, redundantstrings.howMany(length));
  }

  @Test
  public void case65() {
    int length = 57;
    assertEquals(524294, redundantstrings.howMany(length));
  }

  @Test
  public void case66() {
    int length = 58;
    assertEquals(536870914, redundantstrings.howMany(length));
  }

  @Test
  public void case67() {
    int length = 59;
    assertEquals(2, redundantstrings.howMany(length));
  }

  @Test
  public void case68() {
    int length = 60;
    assertEquals(1074793396, redundantstrings.howMany(length));
  }

  @Test
  public void case69() {
    int length = 55;
    assertEquals(2078, redundantstrings.howMany(length));
  }

  @Test
  public void case70() {
    int length = 60;
    assertEquals(1074793396, redundantstrings.howMany(length));
  }

  @Test
  public void case71() {
    int length = 5;
    assertEquals(2, redundantstrings.howMany(length));
  }

  @Test
  public void case72() {
    int length = 16;
    assertEquals(256, redundantstrings.howMany(length));
  }

  @Test
  public void case73() {
    int length = 30;
    assertEquals(33814, redundantstrings.howMany(length));
  }

  @Test
  public void case74() {
    int length = 9;
    assertEquals(8, redundantstrings.howMany(length));
  }

  @Test
  public void case75() {
    int length = 8;
    assertEquals(16, redundantstrings.howMany(length));
  }

  @Test
  public void case76() {
    int length = 32;
    assertEquals(65536, redundantstrings.howMany(length));
  }

}
