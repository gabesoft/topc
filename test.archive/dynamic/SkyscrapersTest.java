package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class SkyscrapersTest {
  Skyscrapers skyscrapers = new Skyscrapers();

  @Test
  public void case1() {
    int N = 3;
    int leftSide = 2;
    int rightSide = 2;
    assertEquals(2, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case2() {
    int N = 3;
    int leftSide = 2;
    int rightSide = 1;
    assertEquals(1, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case3() {
    int N = 5;
    int leftSide = 3;
    int rightSide = 2;
    assertEquals(18, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case4() {
    int N = 100;
    int leftSide = 2;
    int rightSide = 1;
    assertEquals(990953332, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case5() {
    int N = 100;
    int leftSide = 13;
    int rightSide = 21;
    assertEquals(492729563, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case6() {
    int N = 12;
    int leftSide = 1;
    int rightSide = 1;
    assertEquals(0, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case7() {
    int N = 8;
    int leftSide = 3;
    int rightSide = 2;
    assertEquals(4872, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case8() {
    int N = 15;
    int leftSide = 2;
    int rightSide = 1;
    assertEquals(227020758, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case9() {
    int N = 14;
    int leftSide = 2;
    int rightSide = 1;
    assertEquals(479001600, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case10() {
    int N = 12;
    int leftSide = 11;
    int rightSide = 3;
    assertEquals(0, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case11() {
    int N = 78;
    int leftSide = 44;
    int rightSide = 56;
    assertEquals(0, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case12() {
    int N = 87;
    int leftSide = 23;
    int rightSide = 11;
    assertEquals(699722100, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case13() {
    int N = 100;
    int leftSide = 99;
    int rightSide = 99;
    assertEquals(0, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case14() {
    int N = 100;
    int leftSide = 95;
    int rightSide = 4;
    assertEquals(310413463, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case15() {
    int N = 100;
    int leftSide = 49;
    int rightSide = 52;
    assertEquals(504025591, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case16() {
    int N = 67;
    int leftSide = 32;
    int rightSide = 24;
    assertEquals(905017808, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case17() {
    int N = 7;
    int leftSide = 6;
    int rightSide = 2;
    assertEquals(6, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case18() {
    int N = 9;
    int leftSide = 5;
    int rightSide = 5;
    assertEquals(70, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case19() {
    int N = 24;
    int leftSide = 18;
    int rightSide = 9;
    assertEquals(0, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case20() {
    int N = 1;
    int leftSide = 1;
    int rightSide = 1;
    assertEquals(1, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case21() {
    int N = 2;
    int leftSide = 2;
    int rightSide = 1;
    assertEquals(1, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case22() {
    int N = 72;
    int leftSide = 1;
    int rightSide = 72;
    assertEquals(1, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case23() {
    int N = 87;
    int leftSide = 87;
    int rightSide = 1;
    assertEquals(1, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case24() {
    int N = 16;
    int leftSide = 16;
    int rightSide = 1;
    assertEquals(1, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case25() {
    int N = 37;
    int leftSide = 1;
    int rightSide = 37;
    assertEquals(1, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case26() {
    int N = 29;
    int leftSide = 12;
    int rightSide = 15;
    assertEquals(269928514, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case27() {
    int N = 77;
    int leftSide = 6;
    int rightSide = 10;
    assertEquals(999993982, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case28() {
    int N = 73;
    int leftSide = 11;
    int rightSide = 2;
    assertEquals(999991807, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case29() {
    int N = 80;
    int leftSide = 30;
    int rightSide = 50;
    assertEquals(999983834, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case30() {
    int N = 95;
    int leftSide = 40;
    int rightSide = 54;
    assertEquals(999954301, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case31() {
    int N = 66;
    int leftSide = 5;
    int rightSide = 5;
    assertEquals(999953844, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case32() {
    int N = 100;
    int leftSide = 8;
    int rightSide = 7;
    assertEquals(610390291, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case33() {
    int N = 58;
    int leftSide = 32;
    int rightSide = 44;
    assertEquals(0, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case34() {
    int N = 87;
    int leftSide = 5;
    int rightSide = 13;
    assertEquals(540283095, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case35() {
    int N = 86;
    int leftSide = 12;
    int rightSide = 34;
    assertEquals(810933864, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case36() {
    int N = 78;
    int leftSide = 54;
    int rightSide = 22;
    assertEquals(185138699, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case37() {
    int N = 90;
    int leftSide = 45;
    int rightSide = 47;
    assertEquals(0, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case38() {
    int N = 90;
    int leftSide = 45;
    int rightSide = 46;
    assertEquals(722170429, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case39() {
    int N = 38;
    int leftSide = 1;
    int rightSide = 1;
    assertEquals(0, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case40() {
    int N = 87;
    int leftSide = 1;
    int rightSide = 1;
    assertEquals(0, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case41() {
    int N = 44;
    int leftSide = 34;
    int rightSide = 8;
    assertEquals(956315439, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case42() {
    int N = 71;
    int leftSide = 55;
    int rightSide = 8;
    assertEquals(329451734, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case43() {
    int N = 94;
    int leftSide = 94;
    int rightSide = 1;
    assertEquals(1, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case44() {
    int N = 87;
    int leftSide = 1;
    int rightSide = 87;
    assertEquals(1, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case45() {
    int N = 36;
    int leftSide = 13;
    int rightSide = 24;
    assertEquals(834451800, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case46() {
    int N = 12;
    int leftSide = 3;
    int rightSide = 1;
    assertEquals(10628640, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case47() {
    int N = 14;
    int leftSide = 1;
    int rightSide = 1;
    assertEquals(0, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case48() {
    int N = 9;
    int leftSide = 9;
    int rightSide = 2;
    assertEquals(0, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case49() {
    int N = 100;
    int leftSide = 24;
    int rightSide = 24;
    assertEquals(520063872, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case50() {
    int N = 100;
    int leftSide = 40;
    int rightSide = 41;
    assertEquals(911646200, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case51() {
    int N = 98;
    int leftSide = 17;
    int rightSide = 42;
    assertEquals(393135880, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case52() {
    int N = 100;
    int leftSide = 20;
    int rightSide = 23;
    assertEquals(959802400, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case53() {
    int N = 99;
    int leftSide = 50;
    int rightSide = 49;
    assertEquals(528934656, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case54() {
    int N = 100;
    int leftSide = 25;
    int rightSide = 25;
    assertEquals(848175703, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case55() {
    int N = 100;
    int leftSide = 32;
    int rightSide = 21;
    assertEquals(790323138, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case56() {
    int N = 100;
    int leftSide = 100;
    int rightSide = 1;
    assertEquals(1, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case57() {
    int N = 100;
    int leftSide = 20;
    int rightSide = 40;
    assertEquals(667870492, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case58() {
    int N = 100;
    int leftSide = 2;
    int rightSide = 2;
    assertEquals(598881956, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case59() {
    int N = 100;
    int leftSide = 23;
    int rightSide = 37;
    assertEquals(714070384, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case60() {
    int N = 100;
    int leftSide = 39;
    int rightSide = 29;
    assertEquals(550026577, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case61() {
    int N = 100;
    int leftSide = 25;
    int rightSide = 37;
    assertEquals(702363931, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case62() {
    int N = 100;
    int leftSide = 25;
    int rightSide = 61;
    assertEquals(928920281, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case63() {
    int N = 100;
    int leftSide = 50;
    int rightSide = 50;
    assertEquals(265248055, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case64() {
    int N = 100;
    int leftSide = 53;
    int rightSide = 37;
    assertEquals(403760718, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case65() {
    int N = 100;
    int leftSide = 7;
    int rightSide = 8;
    assertEquals(610390291, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case66() {
    int N = 100;
    int leftSide = 35;
    int rightSide = 35;
    assertEquals(151954186, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case67() {
    int N = 100;
    int leftSide = 20;
    int rightSide = 20;
    assertEquals(986752476, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case68() {
    int N = 100;
    int leftSide = 49;
    int rightSide = 50;
    assertEquals(658420915, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case69() {
    int N = 100;
    int leftSide = 49;
    int rightSide = 30;
    assertEquals(175486704, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case70() {
    int N = 100;
    int leftSide = 20;
    int rightSide = 29;
    assertEquals(929804441, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case71() {
    int N = 21;
    int leftSide = 8;
    int rightSide = 5;
    assertEquals(651222009, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case72() {
    int N = 100;
    int leftSide = 50;
    int rightSide = 51;
    assertEquals(769496025, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case73() {
    int N = 23;
    int leftSide = 9;
    int rightSide = 6;
    assertEquals(384590516, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case74() {
    int N = 99;
    int leftSide = 7;
    int rightSide = 7;
    assertEquals(56353603, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

  @Test
  public void case75() {
    int N = 100;
    int leftSide = 10;
    int rightSide = 10;
    assertEquals(559891373, skyscrapers.buildingCount(N, leftSide, rightSide));
  }

}
