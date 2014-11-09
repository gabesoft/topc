package topc.test.simulation;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.simulation.*;

public class OneFightTest {
  OneFight onefight = new OneFight();

  @Test
  public void case1() {
    int[] life = { 3 };
    int[] damage = { 10 };
    int yourDamage = 2;
    assertEquals(21, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case2() {
    int[] life = { 5, 1 };
    int[] damage = { 5, 3 };
    int yourDamage = 3;
    assertEquals(19, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case3() {
    int[] life = { 1, 5 };
    int[] damage = { 3, 5 };
    int yourDamage = 3;
    assertEquals(19, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case4() {
    int[] life = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
    int[] damage = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
    int yourDamage = 100;
    assertEquals(2201, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case5() {
    int[] life = { 6, 34, 21, 79, 31, 5, 8, 23, 9, 100 };
    int[] damage = { 1, 65, 95, 32, 48, 9, 3, 13, 100, 4 };
    int yourDamage = 4;
    assertEquals(6554, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case6() {
    int[] life = { 2, 3, 4 };
    int[] damage = { 1, 1, 0 };
    int yourDamage = 3;
    assertEquals(4, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case7() {
    int[] life = { 1, 2, 3, 4, 5 };
    int[] damage = { 0, 0, 0, 2, 1 };
    int yourDamage = 1;
    assertEquals(18, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case8() {
    int[] life = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
    int[] damage = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
    int yourDamage = 1;
    assertEquals(550001, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case9() {
    int[] life = { 20, 5, 21, 29, 37, 84 };
    int[] damage = { 81, 47, 22, 88, 54, 19 };
    int yourDamage = 61;
    assertEquals(844, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case10() {
    int[] life = { 40, 64, 28, 81, 97, 17, 49, 85, 18, 29 };
    int[] damage = { 5, 45, 96, 51, 97, 97, 76, 54, 16, 51 };
    int yourDamage = 9;
    assertEquals(12917, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case11() {
    int[] life = { 16 };
    int[] damage = { 99 };
    int yourDamage = 27;
    assertEquals(100, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case12() {
    int[] life = { 46, 33, 20, 5 };
    int[] damage = { 12, 0, 82, 52 };
    int yourDamage = 86;
    assertEquals(223, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case13() {
    int[] life = { 58, 2, 34, 64, 100 };
    int[] damage = { 45, 89, 63, 28, 41 };
    int yourDamage = 64;
    assertEquals(709, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case14() {
    int[] life = { 45, 71, 64, 35, 46, 16, 78, 19, 44, 24 };
    int[] damage = { 35, 22, 74, 74, 57, 28, 63, 78, 56, 98 };
    int yourDamage = 75;
    assertEquals(2728, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case15() {
    int[] life = { 49, 26, 74, 62, 82, 84 };
    int[] damage = { 55, 35, 97, 32, 40, 64 };
    int yourDamage = 89;
    assertEquals(918, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case16() {
    int[] life = { 36, 64, 15, 89, 5, 67, 67, 27, 6, 47 };
    int[] damage = { 27, 35, 79, 14, 50, 94, 3, 30, 56, 68 };
    int yourDamage = 49;
    assertEquals(2134, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case17() {
    int[] life = { 17, 60 };
    int[] damage = { 91, 84 };
    int yourDamage = 75;
    assertEquals(260, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case18() {
    int[] life = { 75, 75, 37, 22, 34, 20, 8, 3, 7 };
    int[] damage = { 42, 83, 35, 0, 49, 95, 66, 5, 21 };
    int yourDamage = 93;
    assertEquals(1263, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case19() {
    int[] life = { 52, 62, 5, 29, 63 };
    int[] damage = { 83, 92, 69, 46, 40 };
    int yourDamage = 14;
    assertEquals(2723, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case20() {
    int[] life = { 34, 28, 63 };
    int[] damage = { 1, 50, 11 };
    int yourDamage = 27;
    assertEquals(163, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case21() {
    int[] life = { 77, 65, 86, 59, 50, 17, 71, 66, 93, 38 };
    int[] damage = { 23, 30, 78, 24, 36, 95, 79, 65, 68, 5 };
    int yourDamage = 39;
    assertEquals(3893, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case22() {
    int[] life = { 68, 8, 83, 29, 39, 76, 42 };
    int[] damage = { 22, 29, 56, 64, 81, 45, 27 };
    int yourDamage = 44;
    assertEquals(1319, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case23() {
    int[] life = { 7, 71, 67, 87, 96, 11, 93, 59, 77, 95 };
    int[] damage = { 87, 100, 72, 85, 85, 43, 34, 4, 61, 68 };
    int yourDamage = 52;
    assertEquals(4756, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case24() {
    int[] life = { 22, 95, 66, 8, 50, 68 };
    int[] damage = { 94, 94, 74, 23, 90, 13 };
    int yourDamage = 32;
    assertEquals(1994, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case25() {
    int[] life = { 77, 8, 56, 60, 46, 5, 4, 58 };
    int[] damage = { 93, 45, 1, 39, 44, 68, 87, 17 };
    int yourDamage = 100;
    assertEquals(1233, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case26() {
    int[] life = { 51, 28, 72, 24 };
    int[] damage = { 37, 38, 28, 26 };
    int yourDamage = 36;
    assertEquals(407, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case27() {
    int[] life = { 49, 26, 69, 90, 49, 17, 83, 82 };
    int[] damage = { 49, 47, 73, 43, 85, 40, 10, 46 };
    int yourDamage = 73;
    assertEquals(1586, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case28() {
    int[] life = { 52, 33, 97, 59, 44 };
    int[] damage = { 81, 74, 24, 58, 37 };
    int yourDamage = 10;
    assertEquals(3556, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case29() {
    int[] life = { 25, 2 };
    int[] damage = { 51, 27 };
    int yourDamage = 34;
    assertEquals(106, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case30() {
    int[] life = { 6 };
    int[] damage = { 3 };
    int yourDamage = 37;
    assertEquals(4, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case31() {
    int[] life = { 83, 88, 63, 91 };
    int[] damage = { 65, 49, 32, 58 };
    int yourDamage = 30;
    assertEquals(1486, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case32() {
    int[] life = { 28, 51, 70, 58, 66, 69, 89, 73, 71, 43 };
    int[] damage = { 63, 84, 37, 87, 3, 41, 60, 73, 59, 4 };
    int yourDamage = 35;
    assertEquals(4275, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case33() {
    int[] life = { 32, 38, 72, 71, 16, 68, 90, 78, 67, 45 };
    int[] damage = { 61, 95, 61, 27, 35, 64, 18, 80, 59, 64 };
    int yourDamage = 77;
    assertEquals(2760, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case34() {
    int[] life = { 74, 10, 51, 79, 59, 33 };
    int[] damage = { 31, 24, 45, 75, 70, 55 };
    int yourDamage = 21;
    assertEquals(2465, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case35() {
    int[] life = { 83, 14, 7, 16, 74, 38, 75, 66, 28 };
    int[] damage = { 33, 19, 100, 59, 99, 34, 44, 3, 77 };
    int yourDamage = 33;
    assertEquals(2539, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case36() {
    int[] life = { 79, 52, 16, 3, 61, 42 };
    int[] damage = { 87, 74, 60, 41, 60, 66 };
    int yourDamage = 78;
    assertEquals(1436, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case37() {
    int[] life = { 12, 91, 80 };
    int[] damage = { 6, 68, 52 };
    int yourDamage = 37;
    assertEquals(559, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case38() {
    int[] life = { 40, 63 };
    int[] damage = { 91, 30 };
    int yourDamage = 35;
    assertEquals(303, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case39() {
    int[] life = { 62, 30, 18, 31, 9, 65 };
    int[] damage = { 93, 88, 100, 0, 31, 29 };
    int yourDamage = 55;
    assertEquals(1007, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case40() {
    int[] life = { 66, 83, 72, 61, 31 };
    int[] damage = { 27, 53, 79, 18, 21 };
    int yourDamage = 74;
    assertEquals(559, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case41() {
    int[] life = { 67, 1, 86, 20, 24, 19, 31, 6 };
    int[] damage = { 31, 31, 4, 17, 31, 71, 12, 19 };
    int yourDamage = 1;
    assertEquals(11965, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case42() {
    int[] life = { 94, 59, 40, 36, 6 };
    int[] damage = { 97, 93, 61, 0, 78 };
    int yourDamage = 78;
    assertEquals(918, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case43() {
    int[] life = { 37, 88, 26 };
    int[] damage = { 19, 5, 57 };
    int yourDamage = 93;
    assertEquals(111, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case44() {
    int[] life = { 58, 18, 79, 74, 68, 7, 47 };
    int[] damage = { 23, 81, 85, 70, 72, 9, 20 };
    int yourDamage = 12;
    assertEquals(5031, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case45() {
    int[] life = { 81, 33, 31, 34, 68, 21 };
    int[] damage = { 76, 4, 37, 8, 90, 80 };
    int yourDamage = 100;
    assertEquals(691, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case46() {
    int[] life = { 60, 67, 50, 100, 67, 79, 39, 24 };
    int[] damage = { 32, 95, 99, 56, 64, 33, 19, 14 };
    int yourDamage = 37;
    assertEquals(2805, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case47() {
    int[] life = { 63, 89 };
    int[] damage = { 74, 94 };
    int yourDamage = 41;
    assertEquals(619, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case48() {
    int[] life = { 19, 70, 2 };
    int[] damage = { 52, 87, 2 };
    int yourDamage = 6;
    assertEquals(1635, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case49() {
    int[] life = { 68, 38, 83, 5, 4, 74, 99 };
    int[] damage = { 53, 57, 19, 73, 60, 61, 2 };
    int yourDamage = 32;
    assertEquals(1660, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case50() {
    int[] life = { 98, 99, 83, 4, 60, 99, 44 };
    int[] damage = { 92, 89, 23, 70, 5, 94, 66 };
    int yourDamage = 52;
    assertEquals(2133, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case51() {
    int[] life = { 87, 16, 92, 9, 99 };
    int[] damage = { 97, 64, 78, 66, 15 };
    int yourDamage = 27;
    assertEquals(1767, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case52() {
    int[] life = { 90, 10, 45, 60, 3, 51, 36, 36, 21, 15 };
    int[] damage = { 40, 32, 46, 51, 96, 28, 42, 5, 56, 94 };
    int yourDamage = 15;
    assertEquals(3928, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case53() {
    int[] life = { 80, 6, 64, 90, 95, 76, 84, 81 };
    int[] damage = { 95, 28, 30, 45, 44, 4, 88, 31 };
    int yourDamage = 79;
    assertEquals(2085, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case54() {
    int[] life = { 96, 14, 33, 45, 26, 16, 48 };
    int[] damage = { 50, 10, 15, 23, 20, 75, 16 };
    int yourDamage = 12;
    assertEquals(2228, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case55() {
    int[] life = { 12, 6 };
    int[] damage = { 87, 17 };
    int yourDamage = 7;
    assertEquals(226, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case56() {
    int[] life = { 30, 2, 15, 58, 7, 69, 14, 37, 35, 96 };
    int[] damage = { 22, 77, 61, 23, 40, 69, 8, 67, 34, 46 };
    int yourDamage = 50;
    assertEquals(2221, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case57() {
    int[] life = { 18, 83, 17, 60, 56, 4, 76, 71, 12, 35 };
    int[] damage = { 94, 22, 26, 51, 95, 63, 70, 98, 91, 43 };
    int yourDamage = 43;
    assertEquals(3944, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case58() {
    int[] life = { 9, 59, 78, 42, 75, 52, 97, 9, 18, 14 };
    int[] damage = { 19, 44, 90, 7, 13, 52, 38, 100, 52, 37 };
    int yourDamage = 67;
    assertEquals(2112, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case59() {
    int[] life = { 10, 11 };
    int[] damage = { 18, 20 };
    int yourDamage = 10;
    assertEquals(79, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case60() {
    int[] life = { 3, 5, 6 };
    int[] damage = { 3, 4, 5 };
    int yourDamage = 3;
    assertEquals(39, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case61() {
    int[] life = { 6, 34, 21, 79, 31, 5, 8, 23, 9, 100 };
    int[] damage = { 1, 65, 95, 32, 48, 9, 3, 13, 100, 4 };
    int yourDamage = 4;
    assertEquals(6554, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case62() {
    int[] life = { 5, 1 };
    int[] damage = { 5, 3 };
    int yourDamage = 3;
    assertEquals(19, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case63() {
    int[] life = { 100, 6, 34, 21, 79, 31, 5, 8, 23, 9 };
    int[] damage = { 1, 65, 32, 48, 95, 4, 9, 13, 3, 100 };
    int yourDamage = 4;
    assertEquals(6646, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case64() {
    int[] life = { 12, 15, 99, 13, 98 };
    int[] damage = { 1, 1, 1, 90, 1 };
    int yourDamage = 1;
    assertEquals(1611, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case65() {
    int[] life = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
    int[] damage = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
    int yourDamage = 1;
    assertEquals(550001, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case66() {
    int[] life = { 100, 95, 91, 99, 92, 93, 98, 97, 94, 96 };
    int[] damage = { 100, 99, 98, 97, 96, 95, 94, 93, 92, 91 };
    int yourDamage = 1;
    assertEquals(491152, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case67() {
    int[] life = { 1, 99 };
    int[] damage = { 1, 2 };
    int yourDamage = 2;
    assertEquals(104, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case68() {
    int[] life = { 5, 5, 5, 100 };
    int[] damage = { 100, 100, 100, 10 };
    int yourDamage = 5;
    assertEquals(831, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case69() {
    int[] life = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
    int[] damage = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
    int yourDamage = 7;
    assertEquals(82501, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case70() {
    int[] life = { 1, 100 };
    int[] damage = { 10, 20 };
    int yourDamage = 100;
    assertEquals(41, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case71() {
    int[] life = { 1, 5, 10 };
    int[] damage = { 5, 5, 19 };
    int yourDamage = 4;
    assertEquals(108, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case72() {
    int[] life = { 8, 15 };
    int[] damage = { 1, 2 };
    int yourDamage = 1;
    assertEquals(54, onefight.monsterKilling(life, damage, yourDamage));
  }

  @Test
  public void case73() {
    int[] life = { 99, 1 };
    int[] damage = { 99, 50 };
    int yourDamage = 99;
    assertEquals(200, onefight.monsterKilling(life, damage, yourDamage));
  }

}
