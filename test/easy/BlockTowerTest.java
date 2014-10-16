package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class BlockTowerTest {
  BlockTower blocktower = new BlockTower();

  @Test
  public void case1() {
    int[] blockHeights = { 4, 7 };
    assertEquals(11, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case2() {
    int[] blockHeights = { 7, 4 };
    assertEquals(7, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case3() {
    int[] blockHeights = { 7 };
    assertEquals(7, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case4() {
    int[] blockHeights = { 4 };
    assertEquals(4, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case5() {
    int[] blockHeights = { 48, 1, 50, 1, 50, 1, 48 };
    assertEquals(196, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case6() {
    int[] blockHeights = { 49, 2, 49, 2, 49 };
    assertEquals(147, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case7() {
    int[] blockHeights = { 44, 3, 44, 3, 44, 47, 2, 47, 2, 47, 2 };
    assertEquals(273, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case8() {
    int[] blockHeights = { 1, 2, 3, 4, 5 };
    assertEquals(11, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case9() {
    int[] blockHeights = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    assertEquals(30, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case10() {
    int[] blockHeights = { 2, 3, 4 };
    assertEquals(6, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case11() {
    int[] blockHeights = { 1 };
    assertEquals(1, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case12() {
    int[] blockHeights = { 50 };
    assertEquals(50, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case13() {
    int[] blockHeights = { 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
    assertEquals(675, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case14() {
    int[] blockHeights = { 50, 1, 50, 1, 50, 1, 50, 1, 50, 1, 50 };
    assertEquals(300, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case15() {
    int[] blockHeights = { 50, 1, 50, 1, 50, 1, 49, 2, 49, 2, 49, 2, 49, 2 };
    assertEquals(347, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case16() {
    int[] blockHeights = { 24, 20, 3, 9, 20, 12, 27, 16, 30, 29, 43, 8, 27, 38, 42, 1, 25, 34, 8, 23, 27, 22, 47, 39, 41, 41, 44, 12, 24, 36, 19, 37, 46, 9, 27, 22, 34, 12, 46, 41, 36, 42, 11, 45, 20, 2, 27, 46, 50, 19 };
    assertEquals(765, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case17() {
    int[] blockHeights = { 30, 14, 2, 49, 41, 50, 10, 14, 29, 34, 9, 11, 12, 16, 46, 20, 46, 48, 38, 43, 4, 39, 43, 11, 46, 10, 43, 20, 45, 12, 29, 18, 47, 41, 14, 10, 35, 10, 35, 43, 21, 22, 48, 40, 22, 3, 47, 47, 34, 13 };
    assertEquals(965, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case18() {
    int[] blockHeights = { 23, 34, 18, 1, 28, 28, 33, 35, 16, 11, 16, 15, 1, 30, 11, 28, 16, 28, 3, 10, 28, 42, 47, 44, 18, 43, 10, 14, 25, 45, 17, 11, 40, 45, 17, 25, 10, 35, 47, 17, 37, 18, 25, 14, 49, 23, 39, 3, 45, 47 };
    assertEquals(979, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case19() {
    int[] blockHeights = { 44, 29, 22, 33, 20, 2, 5, 10, 39, 43, 3, 43, 27, 27, 47, 45, 44, 22, 28, 40, 12, 24, 30, 48, 34, 35, 34, 22, 14, 4, 33, 20, 15, 50, 15, 27, 45, 6, 34, 18, 19, 17, 24, 19, 28, 19, 23, 1, 26, 34 };
    assertEquals(709, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case20() {
    int[] blockHeights = { 17, 26, 27, 10, 28, 7, 26, 14, 32, 3, 14, 20, 19, 47, 3, 42, 32, 33, 32, 24, 32, 38, 39, 10, 42, 2, 37, 10, 36, 17, 42, 49, 44, 15, 9, 43, 7, 50, 21, 21, 14, 43, 22, 26, 30, 38, 34, 5, 49, 34 };
    assertEquals(824, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case21() {
    int[] blockHeights = { 47, 32, 49, 24, 13, 32, 4, 34, 10, 14, 14, 19, 17, 18, 49, 3, 45, 2, 16, 28, 34, 21, 32, 43, 38, 31, 1, 15, 7, 3, 13, 20, 33, 12, 16, 19, 4, 49, 3, 5, 22, 35, 43, 38, 48, 43, 5, 39, 8, 29 };
    assertEquals(734, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case22() {
    int[] blockHeights = { 22, 8, 20, 32, 25, 37, 35, 47, 34, 18, 36, 6, 15, 3, 16, 25, 10, 31, 3, 36, 42, 33, 19, 8, 22, 8, 24, 43, 24, 29, 49, 23, 6, 36, 43, 2, 3, 7, 46, 4, 29, 37, 44, 28, 15, 49, 35, 36, 28, 23 };
    assertEquals(740, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case23() {
    int[] blockHeights = { 23, 38, 3, 19, 28, 40, 28, 17, 10, 33, 16, 49, 1, 50, 20, 5, 42, 2, 6, 7, 5, 25, 35, 39, 37, 44, 42, 22, 22, 6, 33, 16, 5, 42, 37, 47, 41, 16, 49, 27, 46, 14, 17, 17, 44, 20, 8, 42, 24, 34 };
    assertEquals(722, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case24() {
    int[] blockHeights = { 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };
    assertEquals(150, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case25() {
    int[] blockHeights = { 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4 };
    assertEquals(200, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case26() {
    int[] blockHeights = { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
    assertEquals(450, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case27() {
    int[] blockHeights = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
    assertEquals(500, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case28() {
    int[] blockHeights = { 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19 };
    assertEquals(950, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case29() {
    int[] blockHeights = { 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 10, 10, 27, 34, 4, 35, 38, 40, 22, 21, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
    assertEquals(1158, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case30() {
    int[] blockHeights = { 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 3, 18, 9, 45, 24, 26, 2, 5, 30, 33, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
    assertEquals(1100, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case31() {
    int[] blockHeights = { 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 34, 1, 36, 31, 13, 1, 39, 37, 11, 12, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
    assertEquals(1113, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case32() {
    int[] blockHeights = { 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 47, 35, 15, 6, 6, 22, 17, 24, 11, 48, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
    assertEquals(1106, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case33() {
    int[] blockHeights = { 31, 48 };
    assertEquals(48, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case34() {
    int[] blockHeights = { 13, 30, 12, 7 };
    assertEquals(49, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case35() {
    int[] blockHeights = { 23, 3, 24, 35, 24 };
    assertEquals(61, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case36() {
    int[] blockHeights = { 37, 24, 12, 24, 33, 50, 1, 20, 47, 24, 37, 15, 36, 42, 9, 42, 5, 42, 16, 8, 35, 23, 32 };
    assertEquals(398, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case37() {
    int[] blockHeights = { 24, 44, 31, 18, 22, 11, 26, 33, 49, 33, 13, 20, 2, 46, 27, 50, 43, 29, 44, 16, 4, 19, 29, 38 };
    assertEquals(409, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case38() {
    int[] blockHeights = { 18, 42, 41, 1, 22, 39, 35, 3, 13, 26, 43, 23, 26, 7, 28, 23, 49, 41, 14, 48, 40, 22, 19, 35, 38, 11, 6, 38, 38, 48, 19, 24, 20, 3, 15, 2 };
    assertEquals(516, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case39() {
    int[] blockHeights = { 29, 39, 46, 36, 37, 36, 20, 30, 49, 28, 30, 37, 15, 34, 35, 4, 4, 43, 35, 31, 5, 26, 3, 5, 37, 7, 26, 15, 28, 20, 13, 15, 1, 28, 1, 18, 40 };
    assertEquals(524, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case40() {
    int[] blockHeights = { 46, 14, 15, 23, 43, 15, 5, 38, 19, 20, 11, 40, 16, 6, 36, 6, 39, 48, 42, 40, 18, 21, 6, 39, 46, 38, 47, 31, 14, 29, 33, 17, 37, 33, 13, 48, 12, 41 };
    assertEquals(741, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case41() {
    int[] blockHeights = { 26, 3, 28, 18, 2, 33, 27, 47, 48, 6, 47, 18, 13, 31, 36, 24, 16, 49, 9, 21, 39, 11, 47, 38, 32, 22, 45, 14, 18, 34, 2, 33, 12, 35, 11, 47, 44, 42, 37 };
    assertEquals(656, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case42() {
    int[] blockHeights = { 2, 34, 47, 22, 45, 45, 44, 20, 24, 14, 19, 25, 41, 19, 32, 23, 47, 46, 13, 22, 24, 36, 35, 15, 15, 43, 8, 40, 39, 7, 26, 17, 49, 9, 4, 15, 22, 48, 11, 5, 37, 43, 31, 41 };
    assertEquals(772, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case43() {
    int[] blockHeights = { 16, 38, 38, 23, 37, 28, 22, 39, 26, 2, 8, 45, 2, 30, 48, 44, 25, 2, 33, 49, 22, 6, 6, 10, 35, 19, 11, 15, 2, 41, 14, 46, 24, 33, 44, 41, 38, 18, 43, 49, 36, 7, 28, 31, 15, 12, 18, 40, 33, 17 };
    assertEquals(799, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case44() {
    int[] blockHeights = { 1, 49, 1 };
    assertEquals(51, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case45() {
    int[] blockHeights = { 1, 48, 1 };
    assertEquals(49, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case46() {
    int[] blockHeights = { 2, 47, 2 };
    assertEquals(49, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case47() {
    int[] blockHeights = { 3, 30, 3 };
    assertEquals(33, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case48() {
    int[] blockHeights = { 1, 2, 1, 2, 1, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1 };
    assertEquals(19, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case49() {
    int[] blockHeights = { 2, 24, 20, 10, 22, 18, 39, 18, 46, 27 };
    assertEquals(187, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case50() {
    int[] blockHeights = { 25, 33, 18, 13, 24, 41, 4, 44, 42, 49 };
    assertEquals(181, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case51() {
    int[] blockHeights = { 42, 1, 1, 9, 48, 18, 9, 21, 4, 34 };
    assertEquals(146, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case52() {
    int[] blockHeights = { 16, 29, 50, 4, 34, 27, 10, 47, 44, 21 };
    assertEquals(199, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case53() {
    int[] blockHeights = { 36, 25, 23, 19, 49, 9, 23, 46, 32, 39 };
    assertEquals(223, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case54() {
    int[] blockHeights = { 7, 10, 30, 21, 23, 26, 1, 42, 5, 24 };
    assertEquals(132, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case55() {
    int[] blockHeights = { 7, 37, 27, 10, 50, 19, 33, 22, 26, 14 };
    assertEquals(123, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case56() {
    int[] blockHeights = { 8, 16, 9, 8, 32, 9, 37, 9, 41, 37 };
    assertEquals(197, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case57() {
    int[] blockHeights = { 43, 49, 46, 11, 5, 20, 20, 35, 21, 31 };
    assertEquals(195, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case58() {
    int[] blockHeights = { 44, 50, 22, 29, 41, 14, 34, 24, 22, 36 };
    assertEquals(246, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case59() {
    int[] blockHeights = { 44, 16, 39, 4, 42, 11, 18, 24, 26, 13 };
    assertEquals(187, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case60() {
    int[] blockHeights = { 13, 43, 34, 4, 49, 27, 5, 12, 12, 25 };
    assertEquals(162, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case61() {
    int[] blockHeights = { 5, 1, 15, 17, 17, 12, 39, 31, 37, 43 };
    assertEquals(205, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case62() {
    int[] blockHeights = { 28, 19, 40, 33, 13, 28, 4, 37, 15, 17 };
    assertEquals(183, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case63() {
    int[] blockHeights = { 19, 32, 21, 36, 22, 50, 30, 36, 29, 5 };
    assertEquals(240, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case64() {
    int[] blockHeights = { 45, 7, 8, 4, 20, 13, 26, 30, 42, 10 };
    assertEquals(140, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case65() {
    int[] blockHeights = { 2, 49, 26, 33, 46, 37, 5, 40, 21, 28 };
    assertEquals(147, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case66() {
    int[] blockHeights = { 6, 21, 48, 5, 10, 46, 38, 25, 34, 42 };
    assertEquals(224, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case67() {
    int[] blockHeights = { 19, 10, 33, 2, 27, 50, 35, 26, 18, 9 };
    assertEquals(123, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case68() {
    int[] blockHeights = { 36, 5, 49, 42 };
    assertEquals(90, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case69() {
    int[] blockHeights = { 18, 3, 9, 48, 15, 28, 45, 49, 45 };
    assertEquals(233, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case70() {
    int[] blockHeights = { 50, 27, 43, 37, 34, 33 };
    assertEquals(190, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case71() {
    int[] blockHeights = { 12, 33, 48, 13, 31 };
    assertEquals(104, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case72() {
    int[] blockHeights = { 39, 29, 33, 30, 43, 47 };
    assertEquals(191, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case73() {
    int[] blockHeights = { 15, 21, 33, 17, 11, 30, 31, 7, 2 };
    assertEquals(135, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case74() {
    int[] blockHeights = { 13, 32, 7 };
    assertEquals(39, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case75() {
    int[] blockHeights = { 34, 15, 29, 28, 30, 42, 46, 38, 2, 23, 30 };
    assertEquals(250, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case76() {
    int[] blockHeights = { 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
    assertEquals(2500, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case77() {
    int[] blockHeights = { 23, 48, 47, 38, 12, 20, 37, 31, 33, 19, 41, 42, 49, 24, 34, 15, 45, 43, 40, 46, 37, 10, 19, 49, 11, 24, 48, 7, 20, 21, 36, 31, 49, 15, 47, 7, 38, 44, 5, 20, 3, 33, 48, 19, 28, 21, 49, 43, 12, 25 };
    assertEquals(922, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case78() {
    int[] blockHeights = { 4, 7 };
    assertEquals(11, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case79() {
    int[] blockHeights = { 33, 43, 47, 22, 11, 18, 26, 9, 1, 13, 31, 13, 24, 43, 13, 36, 23, 13, 35, 29, 21, 6, 38, 43, 1, 11, 47, 2, 32, 24, 16, 41, 42, 18, 44, 9, 47, 29, 2, 28, 18, 26, 18, 47, 44, 27, 22, 45, 11, 50 };
    assertEquals(736, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case80() {
    int[] blockHeights = { 10, 7, 7, 7, 10, 7, 7, 7, 20 };
    assertEquals(52, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case81() {
    int[] blockHeights = { 44, 3, 44, 3, 44, 47, 2, 47, 2, 47, 2 };
    assertEquals(273, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case82() {
    int[] blockHeights = { 9, 8, 7, 6, 5 };
    assertEquals(21, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case83() {
    int[] blockHeights = { 1, 3, 4, 5 };
    assertEquals(9, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case84() {
    int[] blockHeights = { 1, 1, 1, 4 };
    assertEquals(4, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case85() {
    int[] blockHeights = { 7, 5, 3, 1 };
    assertEquals(16, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case86() {
    int[] blockHeights = { 4, 7, 20, 3, 3, 2, 2, 2, 3, 3, 2, 2, 2, 2 };
    assertEquals(38, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case87() {
    int[] blockHeights = { 1, 50 };
    assertEquals(50, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case88() {
    int[] blockHeights = { 1, 5, 7, 6, 45, 34, 15, 23, 34, 44, 23, 1, 1, 1, 6, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 8, 8, 8, 8, 8, 28, 30, 32, 44, 49, 48, 48, 45, 40, 40, 40, 40, 32, 30, 30, 16, 14, 14, 14, 12 };
    assertEquals(766, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case89() {
    int[] blockHeights = { 11, 6, 6, 6 };
    assertEquals(18, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case90() {
    int[] blockHeights = { 3, 3, 3, 3, 50 };
    assertEquals(50, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case91() {
    int[] blockHeights = { 1, 2, 1, 5 };
    assertEquals(8, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case92() {
    int[] blockHeights = { 48, 1, 50, 1, 50, 1, 48 };
    assertEquals(196, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case93() {
    int[] blockHeights = { 3, 5, 10 };
    assertEquals(10, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case94() {
    int[] blockHeights = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
    assertEquals(35, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case95() {
    int[] blockHeights = { 3, 4, 4, 4, 4 };
    assertEquals(16, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case96() {
    int[] blockHeights = { 15, 14, 18, 15, 24, 2, 17, 21, 19, 19, 25, 24, 1 };
    assertEquals(160, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case97() {
    int[] blockHeights = { 2, 47, 2, 48 };
    assertEquals(52, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case98() {
    int[] blockHeights = { 3, 3, 10, 3, 1, 1, 1, 1, 11, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(61, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case99() {
    int[] blockHeights = { 2, 1, 1, 1, 2 };
    assertEquals(5, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case100() {
    int[] blockHeights = { 3, 3, 3, 14 };
    assertEquals(14, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case101() {
    int[] blockHeights = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 12 };
    assertEquals(12, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case102() {
    int[] blockHeights = { 5, 4, 3, 2, 1 };
    assertEquals(9, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case103() {
    int[] blockHeights = { 5, 2, 2, 2, 2 };
    assertEquals(8, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case104() {
    int[] blockHeights = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 33, 50, 34, 45, 50, 50, 34, 23, 34, 23, 45, 23, 5, 3, 2, 6, 34, 23, 21, 22, 4, 34, 34, 34, 44, 33, 45, 45, 34, 45, 34, 42, 30, 34, 34, 45, 50, 45 };
    assertEquals(811, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case105() {
    int[] blockHeights = { 1, 1, 1, 30, 30 };
    assertEquals(60, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case106() {
    int[] blockHeights = { 44, 3, 44, 3, 44, 46, 2, 47, 2, 47, 2, 2 };
    assertEquals(274, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case107() {
    int[] blockHeights = { 2, 1, 1, 33, 40 };
    assertEquals(42, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case108() {
    int[] blockHeights = { 1, 1, 1, 1, 1, 1, 1, 2 };
    assertEquals(7, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case109() {
    int[] blockHeights = { 1, 1, 4 };
    assertEquals(4, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case110() {
    int[] blockHeights = { 2, 3, 4, 5, 6, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 40, 45, 46, 47, 48, 49 };
    assertEquals(652, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case111() {
    int[] blockHeights = { 10, 19, 10, 10 };
    assertEquals(30, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case112() {
    int[] blockHeights = { 3, 3, 4 };
    assertEquals(6, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case113() {
    int[] blockHeights = { 15, 14, 18, 15, 24, 2, 17, 21, 19, 19, 25, 24, 1, 29, 35, 18, 21, 20, 24, 29 };
    assertEquals(274, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case114() {
    int[] blockHeights = { 4, 3, 5 };
    assertEquals(12, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case115() {
    int[] blockHeights = { 31, 7, 20 };
    assertEquals(38, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case116() {
    int[] blockHeights = { 4, 6, 13, 14, 21, 23, 22, 24, 15, 18, 23, 27 };
    assertEquals(138, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case117() {
    int[] blockHeights = { 15, 14, 18, 15, 24, 2, 17, 21, 19, 19, 25, 24, 1, 29, 35, 18, 21, 20, 24, 29, 19, 22, 25, 18, 27, 28 };
    assertEquals(345, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case118() {
    int[] blockHeights = { 3, 3, 10, 3, 1, 1, 1, 1, 11, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(68, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case119() {
    int[] blockHeights = { 7, 7, 4 };
    assertEquals(14, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case120() {
    int[] blockHeights = { 4, 7, 20, 3, 3, 2, 2, 2, 3, 3, 2, 2, 2, 2, 4, 7, 20, 3, 3, 2, 2, 2, 2 };
    assertEquals(70, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case121() {
    int[] blockHeights = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(50, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case122() {
    int[] blockHeights = { 27, 23, 26 };
    assertEquals(50, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case123() {
    int[] blockHeights = { 2, 2, 2, 9, 6, 4, 3, 9, 4, 2, 2, 11 };
    assertEquals(39, blocktower.getTallest(blockHeights));
  }

  @Test
  public void case124() {
    int[] blockHeights = { 34, 37, 28, 16, 44, 36, 37, 43, 50, 22, 13, 28, 41, 10, 14, 27, 41, 27, 23, 37, 12, 19, 18, 30, 33, 31, 13, 24, 18, 36, 30, 3, 23, 9, 20, 18, 44, 7, 12, 43, 30, 24, 22, 20, 35, 38, 49, 25, 16 };
    assertEquals(752, blocktower.getTallest(blockHeights));
  }

}
