package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class TheSumOfLuckyNumbersTest {
  TheSumOfLuckyNumbers thesumofluckynumbers = new TheSumOfLuckyNumbers();

  @Test
  public void case1() {
    int n = 11;
    assertArrayEquals(new int[] { 4, 7 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case2() {
    int n = 12;
    assertArrayEquals(new int[] { 4, 4, 4 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case3() {
    int n = 13;
    assertArrayEquals(new int[] {  }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case4() {
    int n = 100;
    assertArrayEquals(new int[] { 4, 4, 4, 44, 44 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case5() {
    int n = 1000000;
    assertArrayEquals(new int[] { 4, 4, 44444, 477774, 477774 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case6() {
    int n = 48;
    assertArrayEquals(new int[] { 4, 44 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case7() {
    int n = 1;
    assertArrayEquals(new int[] {  }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case8() {
    int n = 57;
    assertArrayEquals(new int[] { 4, 4, 7, 7, 7, 7, 7, 7, 7 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case9() {
    int n = 25;
    assertArrayEquals(new int[] { 4, 7, 7, 7 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case10() {
    int n = 69;
    assertArrayEquals(new int[] { 4, 4, 7, 7, 47 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case11() {
    int n = 3603;
    assertArrayEquals(new int[] { 444, 444, 444, 747, 747, 777 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case12() {
    int n = 3456;
    assertArrayEquals(new int[] { 444, 744, 744, 747, 777 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case13() {
    int n = 3812;
    assertArrayEquals(new int[] { 47, 747, 747, 747, 747, 777 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case14() {
    int n = 3580;
    assertArrayEquals(new int[] { 4, 474, 774, 774, 777, 777 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case15() {
    int n = 3824;
    assertArrayEquals(new int[] { 44, 744, 744, 744, 774, 774 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case16() {
    int n = 957147;
    assertArrayEquals(new int[] { 4, 4, 444, 4444, 474474, 477777 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case17() {
    int n = 951000;
    assertArrayEquals(new int[] { 444, 444, 444, 444, 474447, 474777 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case18() {
    int n = 913356;
    assertArrayEquals(new int[] { 74, 4474, 44477, 44777, 44777, 774777 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case19() {
    int n = 971124;
    assertArrayEquals(new int[] { 4, 44, 4444, 44444, 444444, 477744 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case20() {
    int n = 998368;
    assertArrayEquals(new int[] { 44, 44, 444, 4444, 44444, 474474, 474474 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case21() {
    int n = 1;
    assertArrayEquals(new int[] {  }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case22() {
    int n = 2;
    assertArrayEquals(new int[] {  }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case23() {
    int n = 3;
    assertArrayEquals(new int[] {  }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case24() {
    int n = 4;
    assertArrayEquals(new int[] { 4 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case25() {
    int n = 5;
    assertArrayEquals(new int[] {  }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case26() {
    int n = 6;
    assertArrayEquals(new int[] {  }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case27() {
    int n = 7;
    assertArrayEquals(new int[] { 7 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case28() {
    int n = 8;
    assertArrayEquals(new int[] { 4, 4 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case29() {
    int n = 9;
    assertArrayEquals(new int[] {  }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case30() {
    int n = 10;
    assertArrayEquals(new int[] {  }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case31() {
    int n = 17;
    assertArrayEquals(new int[] {  }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case32() {
    int n = 18;
    assertArrayEquals(new int[] { 4, 7, 7 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case33() {
    int n = 19;
    assertArrayEquals(new int[] { 4, 4, 4, 7 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case34() {
    int n = 20;
    assertArrayEquals(new int[] { 4, 4, 4, 4, 4 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case35() {
    int n = 21;
    assertArrayEquals(new int[] { 7, 7, 7 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case36() {
    int n = 996199;
    assertArrayEquals(new int[] { 4, 4, 44, 4474, 4474, 44474, 47474, 447474, 447777 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case37() {
    int n = 744399;
    assertArrayEquals(new int[] { 4, 4, 44, 474, 44774, 74774, 74774, 74774, 474777 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case38() {
    int n = 774099;
    assertArrayEquals(new int[] { 4, 4, 44, 474, 74474, 74774, 74774, 74774, 474777 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case39() {
    int n = 774169;
    assertArrayEquals(new int[] { 4, 4, 444, 444, 74474, 74474, 74774, 74774, 474777 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case40() {
    int n = 774199;
    assertArrayEquals(new int[] { 4, 4, 444, 474, 74474, 74474, 74774, 74774, 474777 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case41() {
    int n = 813199;
    assertArrayEquals(new int[] { 4, 4, 44, 4474, 4474, 4474, 4474, 47474, 747777 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case42() {
    int n = 813499;
    assertArrayEquals(new int[] { 4, 4, 44, 4474, 4474, 4474, 4474, 47774, 747777 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case43() {
    int n = 813799;
    assertArrayEquals(new int[] { 4, 4, 44, 4474, 4474, 4474, 4774, 47774, 747777 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case44() {
    int n = 813829;
    assertArrayEquals(new int[] { 4, 4, 74, 4474, 4474, 4474, 4774, 47774, 747777 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case45() {
    int n = 813859;
    assertArrayEquals(new int[] { 4, 444, 444, 4444, 4444, 4444, 4444, 47444, 747747 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case46() {
    int n = 813869;
    assertArrayEquals(new int[] { 4, 4, 444, 4444, 4474, 4474, 4474, 47774, 747777 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case47() {
    int n = 813899;
    assertArrayEquals(new int[] { 4, 4, 444, 4474, 4474, 4474, 4474, 47774, 747777 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case48() {
    int n = 814099;
    assertArrayEquals(new int[] { 4, 4, 44, 4474, 4474, 4774, 4774, 47774, 747777 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case49() {
    int n = 814169;
    assertArrayEquals(new int[] { 4, 4, 444, 4444, 4474, 4474, 4774, 47774, 747777 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case50() {
    int n = 814199;
    assertArrayEquals(new int[] { 4, 4, 444, 4474, 4474, 4474, 4774, 47774, 747777 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case51() {
    int n = 814499;
    assertArrayEquals(new int[] { 4, 4, 44, 74, 4474, 7474, 7474, 47474, 747477 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case52() {
    int n = 816199;
    assertArrayEquals(new int[] { 4, 4, 44, 4474, 4474, 4474, 7474, 47474, 747777 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case53() {
    int n = 816499;
    assertArrayEquals(new int[] { 4, 4, 44, 4474, 4474, 4474, 7474, 47774, 747777 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case54() {
    int n = 816899;
    assertArrayEquals(new int[] { 4, 4, 44, 44474, 74474, 74474, 74474, 74474, 474477 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case55() {
    int n = 817199;
    assertArrayEquals(new int[] { 4, 4, 44, 44474, 74474, 74474, 74474, 74474, 474777 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case56() {
    int n = 817499;
    assertArrayEquals(new int[] { 4, 4, 44, 74, 7474, 7474, 7474, 47474, 747477 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case57() {
    int n = 993199;
    assertArrayEquals(new int[] { 4, 4, 44, 4474, 4474, 44474, 44474, 447474, 447777 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case58() {
    int n = 999997;
    assertArrayEquals(new int[] { 44444, 44444, 44444, 44444, 44444, 777777 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case59() {
    int n = 999962;
    assertArrayEquals(new int[] { 44444, 477744, 477774 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case60() {
    int n = 777776;
    assertArrayEquals(new int[] { 74, 74, 74, 77, 777477 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case61() {
    int n = 77863;
    assertArrayEquals(new int[] { 4, 4, 4, 74, 77777 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case62() {
    int n = 44444;
    assertArrayEquals(new int[] { 44444 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case63() {
    int n = 895;
    assertArrayEquals(new int[] { 4, 444, 447 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case64() {
    int n = 999999;
    assertArrayEquals(new int[] { 4, 44444, 477774, 477777 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case65() {
    int n = 984576;
    assertArrayEquals(new int[] { 74, 44474, 44474, 447777, 447777 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case66() {
    int n = 987654;
    assertArrayEquals(new int[] { 44, 444, 44444, 47474, 447474, 447774 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case67() {
    int n = 989564;
    assertArrayEquals(new int[] { 444, 4444, 44444, 44744, 447744, 447744 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case68() {
    int n = 999998;
    assertArrayEquals(new int[] { 44444, 477777, 477777 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case69() {
    int n = 999897;
    assertArrayEquals(new int[] { 44, 44, 444, 44444, 477444, 477477 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case70() {
    int n = 154841;
    assertArrayEquals(new int[] { 44, 44, 44, 444, 4744, 74744, 74777 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case71() {
    int n = 888888;
    assertArrayEquals(new int[] { 444444, 444444 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case72() {
    int n = 99991;
    assertArrayEquals(new int[] { 4, 4, 4, 44, 4444, 47744, 47747 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case73() {
    int n = 121;
    assertArrayEquals(new int[] { 44, 77 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case74() {
    int n = 959791;
    assertArrayEquals(new int[] { 4, 4, 4, 444, 4444, 477444, 477447 }, thesumofluckynumbers.sum(n));
  }

  @Test
  public void case75() {
    int n = 78;
    assertArrayEquals(new int[] { 4, 74 }, thesumofluckynumbers.sum(n));
  }

}
