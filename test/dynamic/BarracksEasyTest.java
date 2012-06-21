package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class BarracksEasyTest {
  BarracksEasy barrackseasy = new BarracksEasy();

  @Test
  public void case1() {
    int myUnits = 10;
    int barHp = 11;
    int unitsPerRound = 15;
    assertEquals(4, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case2() {
    int myUnits = 3;
    int barHp = 10;
    int unitsPerRound = 4;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case3() {
    int myUnits = 2;
    int barHp = 10;
    int unitsPerRound = 1;
    assertEquals(9, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case4() {
    int myUnits = 11;
    int barHp = 12;
    int unitsPerRound = 9;
    assertEquals(2, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case5() {
    int myUnits = 12;
    int barHp = 32;
    int unitsPerRound = 5;
    assertEquals(4, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case6() {
    int myUnits = 12;
    int barHp = 44;
    int unitsPerRound = 6;
    assertEquals(7, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case7() {
    int myUnits = 7;
    int barHp = 10;
    int unitsPerRound = 8;
    assertEquals(4, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case8() {
    int myUnits = 4;
    int barHp = 6;
    int unitsPerRound = 7;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case9() {
    int myUnits = 8;
    int barHp = 10;
    int unitsPerRound = 6;
    assertEquals(2, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case10() {
    int myUnits = 4;
    int barHp = 5;
    int unitsPerRound = 5;
    assertEquals(3, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case11() {
    int myUnits = 5;
    int barHp = 8;
    int unitsPerRound = 5;
    assertEquals(4, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case12() {
    int myUnits = 6;
    int barHp = 8;
    int unitsPerRound = 4;
    assertEquals(2, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case13() {
    int myUnits = 6;
    int barHp = 8;
    int unitsPerRound = 6;
    assertEquals(3, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case14() {
    int myUnits = 1;
    int barHp = 1;
    int unitsPerRound = 2;
    assertEquals(1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case15() {
    int myUnits = 1;
    int barHp = 1;
    int unitsPerRound = 3;
    assertEquals(1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case16() {
    int myUnits = 1;
    int barHp = 2;
    int unitsPerRound = 2;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case17() {
    int myUnits = 1;
    int barHp = 2;
    int unitsPerRound = 3;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case18() {
    int myUnits = 1;
    int barHp = 3;
    int unitsPerRound = 1;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case19() {
    int myUnits = 1;
    int barHp = 3;
    int unitsPerRound = 2;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case20() {
    int myUnits = 1;
    int barHp = 3;
    int unitsPerRound = 3;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case21() {
    int myUnits = 2;
    int barHp = 1;
    int unitsPerRound = 1;
    assertEquals(1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case22() {
    int myUnits = 2;
    int barHp = 1;
    int unitsPerRound = 2;
    assertEquals(1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case23() {
    int myUnits = 2;
    int barHp = 1;
    int unitsPerRound = 3;
    assertEquals(1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case24() {
    int myUnits = 2;
    int barHp = 2;
    int unitsPerRound = 1;
    assertEquals(1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case25() {
    int myUnits = 2;
    int barHp = 2;
    int unitsPerRound = 2;
    assertEquals(1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case26() {
    int myUnits = 2;
    int barHp = 2;
    int unitsPerRound = 3;
    assertEquals(1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case27() {
    int myUnits = 2;
    int barHp = 3;
    int unitsPerRound = 1;
    assertEquals(2, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case28() {
    int myUnits = 2;
    int barHp = 3;
    int unitsPerRound = 2;
    assertEquals(3, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case29() {
    int myUnits = 2;
    int barHp = 3;
    int unitsPerRound = 3;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case30() {
    int myUnits = 3;
    int barHp = 1;
    int unitsPerRound = 1;
    assertEquals(1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case31() {
    int myUnits = 3;
    int barHp = 1;
    int unitsPerRound = 2;
    assertEquals(1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case32() {
    int myUnits = 3;
    int barHp = 1;
    int unitsPerRound = 3;
    assertEquals(1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case33() {
    int myUnits = 3;
    int barHp = 2;
    int unitsPerRound = 1;
    assertEquals(1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case34() {
    int myUnits = 3;
    int barHp = 2;
    int unitsPerRound = 2;
    assertEquals(1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case35() {
    int myUnits = 3;
    int barHp = 2;
    int unitsPerRound = 3;
    assertEquals(1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case36() {
    int myUnits = 3;
    int barHp = 3;
    int unitsPerRound = 1;
    assertEquals(1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case37() {
    int myUnits = 3;
    int barHp = 3;
    int unitsPerRound = 2;
    assertEquals(1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case38() {
    int myUnits = 3;
    int barHp = 3;
    int unitsPerRound = 3;
    assertEquals(1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case39() {
    int myUnits = 2;
    int barHp = 50;
    int unitsPerRound = 1;
    assertEquals(49, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case40() {
    int myUnits = 10;
    int barHp = 43;
    int unitsPerRound = 8;
    assertEquals(16, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case41() {
    int myUnits = 8;
    int barHp = 35;
    int unitsPerRound = 5;
    assertEquals(10, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case42() {
    int myUnits = 12;
    int barHp = 43;
    int unitsPerRound = 9;
    assertEquals(11, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case43() {
    int myUnits = 9;
    int barHp = 43;
    int unitsPerRound = 7;
    assertEquals(17, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case44() {
    int myUnits = 6;
    int barHp = 49;
    int unitsPerRound = 1;
    assertEquals(10, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case45() {
    int myUnits = 7;
    int barHp = 31;
    int unitsPerRound = 5;
    assertEquals(13, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case46() {
    int myUnits = 11;
    int barHp = 32;
    int unitsPerRound = 9;
    assertEquals(10, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case47() {
    int myUnits = 8;
    int barHp = 21;
    int unitsPerRound = 7;
    assertEquals(11, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case48() {
    int myUnits = 4;
    int barHp = 17;
    int unitsPerRound = 3;
    assertEquals(13, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case49() {
    int myUnits = 5;
    int barHp = 22;
    int unitsPerRound = 4;
    assertEquals(17, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case50() {
    int myUnits = 6;
    int barHp = 28;
    int unitsPerRound = 4;
    assertEquals(12, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case51() {
    int myUnits = 4;
    int barHp = 45;
    int unitsPerRound = 2;
    assertEquals(22, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case52() {
    int myUnits = 9;
    int barHp = 33;
    int unitsPerRound = 8;
    assertEquals(22, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case53() {
    int myUnits = 6;
    int barHp = 37;
    int unitsPerRound = 3;
    assertEquals(12, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case54() {
    int myUnits = 4;
    int barHp = 43;
    int unitsPerRound = 2;
    assertEquals(21, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case55() {
    int myUnits = 8;
    int barHp = 44;
    int unitsPerRound = 4;
    assertEquals(10, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case56() {
    int myUnits = 5;
    int barHp = 23;
    int unitsPerRound = 4;
    assertEquals(18, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case57() {
    int myUnits = 9;
    int barHp = 43;
    int unitsPerRound = 7;
    assertEquals(17, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case58() {
    int myUnits = 22;
    int barHp = 48;
    int unitsPerRound = 21;
    assertEquals(16, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case59() {
    int myUnits = 12;
    int barHp = 49;
    int unitsPerRound = 9;
    assertEquals(13, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case60() {
    int myUnits = 50;
    int barHp = 50;
    int unitsPerRound = 50;
    assertEquals(1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case61() {
    int myUnits = 50;
    int barHp = 50;
    int unitsPerRound = 49;
    assertEquals(1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case62() {
    int myUnits = 30;
    int barHp = 30;
    int unitsPerRound = 50;
    assertEquals(1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case63() {
    int myUnits = 30;
    int barHp = 31;
    int unitsPerRound = 48;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case64() {
    int myUnits = 30;
    int barHp = 31;
    int unitsPerRound = 47;
    assertEquals(4, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case65() {
    int myUnits = 1;
    int barHp = 50;
    int unitsPerRound = 1;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case66() {
    int myUnits = 1;
    int barHp = 1;
    int unitsPerRound = 1;
    assertEquals(1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case67() {
    int myUnits = 1;
    int barHp = 2;
    int unitsPerRound = 1;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case68() {
    int myUnits = 50;
    int barHp = 1;
    int unitsPerRound = 1;
    assertEquals(1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case69() {
    int myUnits = 1;
    int barHp = 1;
    int unitsPerRound = 50;
    assertEquals(1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case70() {
    int myUnits = 1;
    int barHp = 50;
    int unitsPerRound = 50;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case71() {
    int myUnits = 50;
    int barHp = 1;
    int unitsPerRound = 50;
    assertEquals(1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case72() {
    int myUnits = 50;
    int barHp = 50;
    int unitsPerRound = 1;
    assertEquals(1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case73() {
    int myUnits = 1;
    int barHp = 31;
    int unitsPerRound = 1;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case74() {
    int myUnits = 3;
    int barHp = 4;
    int unitsPerRound = 42;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case75() {
    int myUnits = 3;
    int barHp = 4;
    int unitsPerRound = 6;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case76() {
    int myUnits = 2;
    int barHp = 3;
    int unitsPerRound = 36;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case77() {
    int myUnits = 5;
    int barHp = 37;
    int unitsPerRound = 5;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case78() {
    int myUnits = 12;
    int barHp = 13;
    int unitsPerRound = 50;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case79() {
    int myUnits = 19;
    int barHp = 23;
    int unitsPerRound = 28;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case80() {
    int myUnits = 8;
    int barHp = 37;
    int unitsPerRound = 8;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case81() {
    int myUnits = 5;
    int barHp = 6;
    int unitsPerRound = 19;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case82() {
    int myUnits = 22;
    int barHp = 35;
    int unitsPerRound = 23;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case83() {
    int myUnits = 18;
    int barHp = 36;
    int unitsPerRound = 18;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case84() {
    int myUnits = 21;
    int barHp = 22;
    int unitsPerRound = 40;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case85() {
    int myUnits = 11;
    int barHp = 12;
    int unitsPerRound = 23;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case86() {
    int myUnits = 6;
    int barHp = 7;
    int unitsPerRound = 45;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case87() {
    int myUnits = 23;
    int barHp = 36;
    int unitsPerRound = 25;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case88() {
    int myUnits = 11;
    int barHp = 24;
    int unitsPerRound = 11;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case89() {
    int myUnits = 9;
    int barHp = 36;
    int unitsPerRound = 9;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case90() {
    int myUnits = 2;
    int barHp = 12;
    int unitsPerRound = 2;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case91() {
    int myUnits = 10;
    int barHp = 26;
    int unitsPerRound = 10;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case92() {
    int myUnits = 8;
    int barHp = 9;
    int unitsPerRound = 18;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case93() {
    int myUnits = 9;
    int barHp = 11;
    int unitsPerRound = 12;
    assertEquals(4, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case94() {
    int myUnits = 34;
    int barHp = 47;
    int unitsPerRound = 42;
    assertEquals(6, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case95() {
    int myUnits = 34;
    int barHp = 48;
    int unitsPerRound = 41;
    assertEquals(6, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case96() {
    int myUnits = 32;
    int barHp = 43;
    int unitsPerRound = 40;
    assertEquals(4, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case97() {
    int myUnits = 12;
    int barHp = 17;
    int unitsPerRound = 14;
    assertEquals(4, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case98() {
    int myUnits = 14;
    int barHp = 16;
    int unitsPerRound = 20;
    assertEquals(4, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case99() {
    int myUnits = 19;
    int barHp = 21;
    int unitsPerRound = 28;
    assertEquals(4, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case100() {
    int myUnits = 32;
    int barHp = 42;
    int unitsPerRound = 41;
    assertEquals(4, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case101() {
    int myUnits = 23;
    int barHp = 31;
    int unitsPerRound = 29;
    assertEquals(5, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case102() {
    int myUnits = 30;
    int barHp = 40;
    int unitsPerRound = 38;
    assertEquals(4, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case103() {
    int myUnits = 13;
    int barHp = 16;
    int unitsPerRound = 18;
    assertEquals(5, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case104() {
    int myUnits = 34;
    int barHp = 44;
    int unitsPerRound = 45;
    assertEquals(6, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case105() {
    int myUnits = 15;
    int barHp = 23;
    int unitsPerRound = 16;
    assertEquals(4, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case106() {
    int myUnits = 14;
    int barHp = 16;
    int unitsPerRound = 20;
    assertEquals(4, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case107() {
    int myUnits = 31;
    int barHp = 42;
    int unitsPerRound = 39;
    assertEquals(5, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case108() {
    int myUnits = 34;
    int barHp = 39;
    int unitsPerRound = 50;
    assertEquals(6, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case109() {
    int myUnits = 27;
    int barHp = 32;
    int unitsPerRound = 38;
    assertEquals(4, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case110() {
    int myUnits = 30;
    int barHp = 46;
    int unitsPerRound = 32;
    assertEquals(4, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case111() {
    int myUnits = 32;
    int barHp = 38;
    int unitsPerRound = 45;
    assertEquals(4, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case112() {
    int myUnits = 22;
    int barHp = 31;
    int unitsPerRound = 26;
    assertEquals(4, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case113() {
    int myUnits = 48;
    int barHp = 49;
    int unitsPerRound = 48;
    assertEquals(3, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case114() {
    int myUnits = 45;
    int barHp = 49;
    int unitsPerRound = 45;
    assertEquals(3, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case115() {
    int myUnits = 45;
    int barHp = 49;
    int unitsPerRound = 50;
    assertEquals(3, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case116() {
    int myUnits = 49;
    int barHp = 50;
    int unitsPerRound = 47;
    assertEquals(2, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case117() {
    int myUnits = 46;
    int barHp = 47;
    int unitsPerRound = 48;
    assertEquals(3, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case118() {
    int myUnits = 45;
    int barHp = 47;
    int unitsPerRound = 45;
    assertEquals(3, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case119() {
    int myUnits = 47;
    int barHp = 48;
    int unitsPerRound = 45;
    assertEquals(2, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case120() {
    int myUnits = 45;
    int barHp = 50;
    int unitsPerRound = 46;
    assertEquals(3, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case121() {
    int myUnits = 45;
    int barHp = 48;
    int unitsPerRound = 46;
    assertEquals(3, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case122() {
    int myUnits = 48;
    int barHp = 50;
    int unitsPerRound = 48;
    assertEquals(3, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case123() {
    int myUnits = 47;
    int barHp = 49;
    int unitsPerRound = 49;
    assertEquals(3, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case124() {
    int myUnits = 45;
    int barHp = 50;
    int unitsPerRound = 50;
    assertEquals(3, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case125() {
    int myUnits = 47;
    int barHp = 50;
    int unitsPerRound = 48;
    assertEquals(3, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case126() {
    int myUnits = 49;
    int barHp = 50;
    int unitsPerRound = 48;
    assertEquals(2, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case127() {
    int myUnits = 46;
    int barHp = 48;
    int unitsPerRound = 49;
    assertEquals(3, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case128() {
    int myUnits = 45;
    int barHp = 48;
    int unitsPerRound = 49;
    assertEquals(3, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case129() {
    int myUnits = 47;
    int barHp = 48;
    int unitsPerRound = 45;
    assertEquals(2, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case130() {
    int myUnits = 47;
    int barHp = 50;
    int unitsPerRound = 49;
    assertEquals(3, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case131() {
    int myUnits = 46;
    int barHp = 49;
    int unitsPerRound = 49;
    assertEquals(3, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case132() {
    int myUnits = 47;
    int barHp = 49;
    int unitsPerRound = 48;
    assertEquals(3, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case133() {
    int myUnits = 50;
    int barHp = 27;
    int unitsPerRound = 48;
    assertEquals(1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case134() {
    int myUnits = 10;
    int barHp = 50;
    int unitsPerRound = 10;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case135() {
    int myUnits = 3;
    int barHp = 40;
    int unitsPerRound = 3;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case136() {
    int myUnits = 23;
    int barHp = 43;
    int unitsPerRound = 12;
    assertEquals(3, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case137() {
    int myUnits = 50;
    int barHp = 21;
    int unitsPerRound = 11;
    assertEquals(1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case138() {
    int myUnits = 2;
    int barHp = 50;
    int unitsPerRound = 2;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case139() {
    int myUnits = 20;
    int barHp = 40;
    int unitsPerRound = 11;
    assertEquals(4, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case140() {
    int myUnits = 10;
    int barHp = 50;
    int unitsPerRound = 2;
    assertEquals(6, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case141() {
    int myUnits = 3;
    int barHp = 20;
    int unitsPerRound = 1;
    assertEquals(10, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case142() {
    int myUnits = 20;
    int barHp = 41;
    int unitsPerRound = 21;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case143() {
    int myUnits = 3;
    int barHp = 30;
    int unitsPerRound = 1;
    assertEquals(15, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case144() {
    int myUnits = 6;
    int barHp = 50;
    int unitsPerRound = 6;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case145() {
    int myUnits = 20;
    int barHp = 50;
    int unitsPerRound = 18;
    assertEquals(12, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case146() {
    int myUnits = 30;
    int barHp = 50;
    int unitsPerRound = 29;
    assertEquals(5, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case147() {
    int myUnits = 3;
    int barHp = 4;
    int unitsPerRound = 3;
    assertEquals(3, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case148() {
    int myUnits = 10;
    int barHp = 50;
    int unitsPerRound = 5;
    assertEquals(9, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case149() {
    int myUnits = 5;
    int barHp = 11;
    int unitsPerRound = 5;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case150() {
    int myUnits = 10;
    int barHp = 11;
    int unitsPerRound = 11;
    assertEquals(3, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case151() {
    int myUnits = 19;
    int barHp = 50;
    int unitsPerRound = 14;
    assertEquals(7, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case152() {
    int myUnits = 10;
    int barHp = 50;
    int unitsPerRound = 9;
    assertEquals(37, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case153() {
    int myUnits = 19;
    int barHp = 50;
    int unitsPerRound = 15;
    assertEquals(8, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

  @Test
  public void case154() {
    int myUnits = 1;
    int barHp = 10;
    int unitsPerRound = 1;
    assertEquals(-1, barrackseasy.attack(myUnits, barHp, unitsPerRound));
  }

}
