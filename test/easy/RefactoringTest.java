package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class RefactoringTest {
  Refactoring refactoring = new Refactoring();

  @Test
  public void case1() {
    int n = 24;
    assertEquals(6, refactoring.refactor(n));
  }

  @Test
  public void case2() {
    int n = 9973;
    assertEquals(0, refactoring.refactor(n));
  }

  @Test
  public void case3() {
    int n = 9240;
    assertEquals(295, refactoring.refactor(n));
  }

  @Test
  public void case4() {
    int n = 1916006400;
    assertEquals(7389115, refactoring.refactor(n));
  }

  @Test
  public void case5() {
    int n = 2000000000;
    assertEquals(36534, refactoring.refactor(n));
  }

  @Test
  public void case6() {
    int n = 1299827;
    assertEquals(0, refactoring.refactor(n));
  }

  @Test
  public void case7() {
    int n = 1945944000;
    assertEquals(5416877, refactoring.refactor(n));
  }

  @Test
  public void case8() {
    int n = 1816214400;
    assertEquals(6049130, refactoring.refactor(n));
  }

  @Test
  public void case9() {
    int n = 1556755200;
    assertEquals(6348742, refactoring.refactor(n));
  }

  @Test
  public void case10() {
    int n = 1676505600;
    assertEquals(6721611, refactoring.refactor(n));
  }

  @Test
  public void case11() {
    int n = 648281634;
    assertEquals(8154, refactoring.refactor(n));
  }

  @Test
  public void case12() {
    int n = 308897820;
    assertEquals(115499, refactoring.refactor(n));
  }

  @Test
  public void case13() {
    int n = 870882012;
    assertEquals(18101, refactoring.refactor(n));
  }

  @Test
  public void case14() {
    int n = 166742290;
    assertEquals(1314, refactoring.refactor(n));
  }

  @Test
  public void case15() {
    int n = 858986865;
    assertEquals(2568, refactoring.refactor(n));
  }

  @Test
  public void case16() {
    int n = 1892909200;
    assertEquals(164541, refactoring.refactor(n));
  }

  @Test
  public void case17() {
    int n = 1001146575;
    assertEquals(4027, refactoring.refactor(n));
  }

  @Test
  public void case18() {
    int n = 172994822;
    assertEquals(1662, refactoring.refactor(n));
  }

  @Test
  public void case19() {
    int n = 1261332765;
    assertEquals(20777, refactoring.refactor(n));
  }

  @Test
  public void case20() {
    int n = 1664874090;
    assertEquals(16600, refactoring.refactor(n));
  }

  @Test
  public void case21() {
    int n = 1882672038;
    assertEquals(10104, refactoring.refactor(n));
  }

  @Test
  public void case22() {
    int n = 1254067815;
    assertEquals(2751, refactoring.refactor(n));
  }

  @Test
  public void case23() {
    int n = 845128284;
    assertEquals(26682, refactoring.refactor(n));
  }

  @Test
  public void case24() {
    int n = 323871625;
    assertEquals(2568, refactoring.refactor(n));
  }

  @Test
  public void case25() {
    int n = 1026227202;
    assertEquals(13081, refactoring.refactor(n));
  }

  @Test
  public void case26() {
    int n = 1232137764;
    assertEquals(43491, refactoring.refactor(n));
  }

  @Test
  public void case27() {
    int n = 172389945;
    assertEquals(2609, refactoring.refactor(n));
  }

  @Test
  public void case28() {
    int n = 141526440;
    assertEquals(48033, refactoring.refactor(n));
  }

  @Test
  public void case29() {
    int n = 303753450;
    assertEquals(26682, refactoring.refactor(n));
  }

  @Test
  public void case30() {
    int n = 243053811;
    assertEquals(4027, refactoring.refactor(n));
  }

  @Test
  public void case31() {
    int n = 487166680;
    assertEquals(10104, refactoring.refactor(n));
  }

  @Test
  public void case32() {
    int n = 1233749517;
    assertEquals(1762, refactoring.refactor(n));
  }

  @Test
  public void case33() {
    int n = 214363149;
    assertEquals(1662, refactoring.refactor(n));
  }

  @Test
  public void case34() {
    int n = 1466695230;
    assertEquals(20777, refactoring.refactor(n));
  }

  @Test
  public void case35() {
    int n = 1216580469;
    assertEquals(1074, refactoring.refactor(n));
  }

  @Test
  public void case36() {
    int n = 6677;
    assertEquals(1, refactoring.refactor(n));
  }

  @Test
  public void case37() {
    int n = 9765;
    assertEquals(35, refactoring.refactor(n));
  }

  @Test
  public void case38() {
    int n = 3150;
    assertEquals(91, refactoring.refactor(n));
  }

  @Test
  public void case39() {
    int n = 5691;
    assertEquals(4, refactoring.refactor(n));
  }

  @Test
  public void case40() {
    int n = 3058;
    assertEquals(4, refactoring.refactor(n));
  }

  @Test
  public void case41() {
    int n = 1739;
    assertEquals(1, refactoring.refactor(n));
  }

  @Test
  public void case42() {
    int n = 1085;
    assertEquals(4, refactoring.refactor(n));
  }

  @Test
  public void case43() {
    int n = 8690;
    assertEquals(14, refactoring.refactor(n));
  }

  @Test
  public void case44() {
    int n = 8511;
    assertEquals(1, refactoring.refactor(n));
  }

  @Test
  public void case45() {
    int n = 7442;
    assertEquals(3, refactoring.refactor(n));
  }

  @Test
  public void case46() {
    int n = 309753417;
    assertEquals(4, refactoring.refactor(n));
  }

  @Test
  public void case47() {
    int n = 653808593;
    assertEquals(4, refactoring.refactor(n));
  }

  @Test
  public void case48() {
    int n = 158691406;
    assertEquals(1, refactoring.refactor(n));
  }

  @Test
  public void case49() {
    int n = 153198242;
    assertEquals(10, refactoring.refactor(n));
  }

  @Test
  public void case50() {
    int n = 1281921386;
    assertEquals(4, refactoring.refactor(n));
  }

  @Test
  public void case51() {
    int n = 1639953613;
    assertEquals(14, refactoring.refactor(n));
  }

  @Test
  public void case52() {
    int n = 1090148925;
    assertEquals(10, refactoring.refactor(n));
  }

  @Test
  public void case53() {
    int n = 896484375;
    assertEquals(2769, refactoring.refactor(n));
  }

  @Test
  public void case54() {
    int n = 817932128;
    assertEquals(249, refactoring.refactor(n));
  }

  @Test
  public void case55() {
    int n = 597473144;
    assertEquals(6, refactoring.refactor(n));
  }

  @Test
  public void case56() {
    int n = 931091308;
    assertEquals(35, refactoring.refactor(n));
  }

  @Test
  public void case57() {
    int n = 1002380371;
    assertEquals(1, refactoring.refactor(n));
  }

  @Test
  public void case58() {
    int n = 305297851;
    assertEquals(1, refactoring.refactor(n));
  }

  @Test
  public void case59() {
    int n = 646057128;
    assertEquals(295, refactoring.refactor(n));
  }

  @Test
  public void case60() {
    int n = 1475952148;
    assertEquals(565, refactoring.refactor(n));
  }

  @Test
  public void case61() {
    int n = 25;
    assertEquals(1, refactoring.refactor(n));
  }

  @Test
  public void case62() {
    int n = 36;
    assertEquals(8, refactoring.refactor(n));
  }

  @Test
  public void case63() {
    int n = 2;
    assertEquals(0, refactoring.refactor(n));
  }

  @Test
  public void case64() {
    int n = 3;
    assertEquals(0, refactoring.refactor(n));
  }

  @Test
  public void case65() {
    int n = 4;
    assertEquals(1, refactoring.refactor(n));
  }

  @Test
  public void case66() {
    int n = 1916006400;
    assertEquals(7389115, refactoring.refactor(n));
  }

  @Test
  public void case67() {
    int n = 1073741824;
    assertEquals(5603, refactoring.refactor(n));
  }

}
