package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class TheBrickTowerMediumDivTwoTest {
  TheBrickTowerMediumDivTwo thebricktowermediumdivtwo = new TheBrickTowerMediumDivTwo();

  @Test
  public void case1() {
    int[] heights = { 4, 7, 5 };
    assertArrayEquals(new int[] { 0, 2, 1 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case2() {
    int[] heights = { 4, 4, 4, 4, 4, 4, 4 };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 6 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case3() {
    int[] heights = { 2, 3, 3, 2 };
    assertArrayEquals(new int[] { 0, 3, 1, 2 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case4() {
    int[] heights = { 13, 32, 38, 25, 43, 47, 6 };
    assertArrayEquals(new int[] { 0, 6, 3, 1, 2, 4, 5 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case5() {
    int[] heights = { 5, 3, 4, 7, 1, 2, 6 };
    assertArrayEquals(new int[] { 0, 1, 4, 5, 2, 6, 3 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case6() {
    int[] heights = { 3, 4, 6, 7, 1, 2, 5 };
    assertArrayEquals(new int[] { 0, 4, 5, 1, 6, 2, 3 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case7() {
    int[] heights = { 7, 6, 5, 2, 4, 3, 1 };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 6, 5, 4 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case8() {
    int[] heights = { 3, 13, 28, 32, 24, 18, 23 };
    assertArrayEquals(new int[] { 0, 1, 5, 6, 4, 2, 3 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case9() {
    int[] heights = { 30, 19, 8, 13, 25, 1 };
    assertArrayEquals(new int[] { 0, 1, 2, 5, 3, 4 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case10() {
    int[] heights = { 4, 23, 38, 20 };
    assertArrayEquals(new int[] { 0, 3, 1, 2 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case11() {
    int[] heights = { 30 };
    assertArrayEquals(new int[] { 0 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case12() {
    int[] heights = { 10, 16, 47, 8 };
    assertArrayEquals(new int[] { 0, 3, 1, 2 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case13() {
    int[] heights = { 13, 32, 38, 25, 43, 47, 6 };
    assertArrayEquals(new int[] { 0, 6, 3, 1, 2, 4, 5 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case14() {
    int[] heights = { 21, 10, 43, 43, 37, 30 };
    assertArrayEquals(new int[] { 0, 1, 5, 4, 2, 3 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case15() {
    int[] heights = { 19, 37, 37, 33, 42, 36, 27 };
    assertArrayEquals(new int[] { 0, 6, 3, 5, 1, 2, 4 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case16() {
    int[] heights = { 10, 10, 46, 4 };
    assertArrayEquals(new int[] { 0, 1, 3, 2 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case17() {
    int[] heights = { 44, 6 };
    assertArrayEquals(new int[] { 0, 1 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case18() {
    int[] heights = { 44, 20, 19, 37, 14, 31, 29 };
    assertArrayEquals(new int[] { 0, 1, 2, 4, 6, 5, 3 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case19() {
    int[] heights = { 1, 2, 3, 4, 5, 6, 7 };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 6 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case20() {
    int[] heights = { 7, 6, 5, 4, 3, 2, 1 };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 6 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case21() {
    int[] heights = { 3, 13, 28, 32, 24, 18, 23 };
    assertArrayEquals(new int[] { 0, 1, 5, 6, 4, 2, 3 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case22() {
    int[] heights = { 25, 30, 8, 32, 13, 1, 19 };
    assertArrayEquals(new int[] { 0, 2, 5, 4, 6, 1, 3 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case23() {
    int[] heights = { 16, 35, 35, 22, 29, 10, 24 };
    assertArrayEquals(new int[] { 0, 5, 3, 6, 4, 1, 2 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case24() {
    int[] heights = { 45, 17, 33, 41, 17, 12, 17 };
    assertArrayEquals(new int[] { 0, 1, 4, 5, 6, 2, 3 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case25() {
    int[] heights = { 40, 29, 31, 24, 13, 12, 3 };
    assertArrayEquals(new int[] { 0, 1, 3, 4, 5, 6, 2 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case26() {
    int[] heights = { 40, 12, 22, 15, 21, 22, 17 };
    assertArrayEquals(new int[] { 0, 1, 3, 6, 4, 2, 5 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case27() {
    int[] heights = { 31, 25, 34, 40, 38, 28, 37 };
    assertArrayEquals(new int[] { 0, 1, 5, 2, 6, 4, 3 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case28() {
    int[] heights = { 30, 27, 34, 25, 32, 11, 13 };
    assertArrayEquals(new int[] { 0, 1, 3, 5, 6, 4, 2 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case29() {
    int[] heights = { 27, 25, 16, 36, 11, 46, 15 };
    assertArrayEquals(new int[] { 0, 1, 2, 4, 6, 3, 5 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case30() {
    int[] heights = { 16, 37, 3, 21, 16, 44, 18 };
    assertArrayEquals(new int[] { 0, 2, 4, 6, 3, 1, 5 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case31() {
    int[] heights = { 47, 47, 47, 47, 47, 47, 47 };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 6 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case32() {
    int[] heights = { 46, 44, 44, 46, 46, 45, 47 };
    assertArrayEquals(new int[] { 0, 1, 2, 5, 3, 4, 6 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case33() {
    int[] heights = { 47, 47, 45, 44, 47, 44, 44 };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 5, 6, 4 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case34() {
    int[] heights = { 44, 44, 46, 45, 47, 44, 47 };
    assertArrayEquals(new int[] { 0, 1, 5, 3, 2, 4, 6 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case35() {
    int[] heights = { 44, 46, 46, 46, 45, 47, 44 };
    assertArrayEquals(new int[] { 0, 6, 4, 1, 2, 3, 5 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case36() {
    int[] heights = { 8, 8, 8, 8, 8, 9, 9 };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 6 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case37() {
    int[] heights = { 9, 8, 9, 9, 9, 8 };
    assertArrayEquals(new int[] { 0, 1, 5, 2, 3, 4 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case38() {
    int[] heights = { 9, 9, 8, 9 };
    assertArrayEquals(new int[] { 0, 1, 2, 3 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case39() {
    int[] heights = { 9, 9, 9, 9 };
    assertArrayEquals(new int[] { 0, 1, 2, 3 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case40() {
    int[] heights = { 8, 8, 9, 9, 8, 9, 9 };
    assertArrayEquals(new int[] { 0, 1, 4, 2, 3, 5, 6 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case41() {
    int[] heights = { 24 };
    assertArrayEquals(new int[] { 0 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case42() {
    int[] heights = { 13 };
    assertArrayEquals(new int[] { 0 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case43() {
    int[] heights = { 24, 18 };
    assertArrayEquals(new int[] { 0, 1 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case44() {
    int[] heights = { 30, 45 };
    assertArrayEquals(new int[] { 0, 1 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case45() {
    int[] heights = { 2, 2, 1, 1, 2, 2, 3 };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 6 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case46() {
    int[] heights = { 2, 1, 3, 3, 2, 3 };
    assertArrayEquals(new int[] { 0, 1, 4, 2, 3, 5 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case47() {
    int[] heights = { 2, 2, 2, 3, 2, 3 };
    assertArrayEquals(new int[] { 0, 1, 2, 4, 3, 5 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case48() {
    int[] heights = { 13, 32, 38, 25, 43, 47, 6 };
    assertArrayEquals(new int[] { 0, 6, 3, 1, 2, 4, 5 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case49() {
    int[] heights = { 4, 7, 5 };
    assertArrayEquals(new int[] { 0, 2, 1 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case50() {
    int[] heights = { 20, 47, 10, 47, 30, 47, 1 };
    assertArrayEquals(new int[] { 0, 2, 6, 4, 1, 3, 5 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case51() {
    int[] heights = { 43, 42, 44, 42, 44, 43, 42 };
    assertArrayEquals(new int[] { 0, 1, 3, 6, 5, 2, 4 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case52() {
    int[] heights = { 3, 2, 1 };
    assertArrayEquals(new int[] { 0, 1, 2 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case53() {
    int[] heights = { 2, 3, 3, 2 };
    assertArrayEquals(new int[] { 0, 3, 1, 2 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case54() {
    int[] heights = { 3, 2, 1, 4, 5, 6 };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case55() {
    int[] heights = { 3, 4, 2, 1 };
    assertArrayEquals(new int[] { 0, 2, 3, 1 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case56() {
    int[] heights = { 4, 3, 3 };
    assertArrayEquals(new int[] { 0, 1, 2 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case57() {
    int[] heights = { 7, 6, 5, 4, 3, 2, 1 };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 6 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case58() {
    int[] heights = { 8, 5, 3, 4, 8, 5, 9 };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 5, 4, 6 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case59() {
    int[] heights = { 39, 44, 30, 19, 45, 40, 10 };
    assertArrayEquals(new int[] { 0, 2, 3, 6, 5, 1, 4 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case60() {
    int[] heights = { 2, 2, 1 };
    assertArrayEquals(new int[] { 0, 1, 2 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case61() {
    int[] heights = { 13, 32, 38, 8, 43, 47, 6 };
    assertArrayEquals(new int[] { 0, 3, 6, 1, 2, 4, 5 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case62() {
    int[] heights = { 47, 47, 1, 2, 3, 4, 5 };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 6 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case63() {
    int[] heights = { 22, 32, 12, 25, 43, 47, 6 };
    assertArrayEquals(new int[] { 0, 2, 6, 3, 1, 4, 5 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case64() {
    int[] heights = { 2, 2, 2, 1, 3, 3, 3 };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 6 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case65() {
    int[] heights = { 5, 4, 3, 2 };
    assertArrayEquals(new int[] { 0, 1, 2, 3 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case66() {
    int[] heights = { 1 };
    assertArrayEquals(new int[] { 0 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case67() {
    int[] heights = { 13, 6, 25, 32, 38, 43, 47 };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 6 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case68() {
    int[] heights = { 7, 5, 4 };
    assertArrayEquals(new int[] { 0, 1, 2 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case69() {
    int[] heights = { 4, 2, 3, 10, 46, 46, 12 };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 6, 4, 5 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case70() {
    int[] heights = { 3, 2, 1, 4 };
    assertArrayEquals(new int[] { 0, 1, 2, 3 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case71() {
    int[] heights = { 15, 14, 13, 12, 11, 10, 7 };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 6 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case72() {
    int[] heights = { 8, 5, 6, 7, 9, 10 };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case73() {
    int[] heights = { 14, 12, 6, 12, 31, 42 };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case74() {
    int[] heights = { 5 };
    assertArrayEquals(new int[] { 0 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case75() {
    int[] heights = { 4, 3, 1, 2 };
    assertArrayEquals(new int[] { 0, 1, 2, 3 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case76() {
    int[] heights = { 45, 43, 25, 17, 5, 4 };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case77() {
    int[] heights = { 4, 3, 2, 1 };
    assertArrayEquals(new int[] { 0, 1, 2, 3 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case78() {
    int[] heights = { 4, 7, 5, 2, 9, 1 };
    assertArrayEquals(new int[] { 0, 3, 5, 2, 1, 4 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case79() {
    int[] heights = { 47, 46, 46 };
    assertArrayEquals(new int[] { 0, 1, 2 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case80() {
    int[] heights = { 39, 40, 38, 41 };
    assertArrayEquals(new int[] { 0, 2, 1, 3 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case81() {
    int[] heights = { 5, 4, 3, 2, 1 };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case82() {
    int[] heights = { 30 };
    assertArrayEquals(new int[] { 0 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case83() {
    int[] heights = { 7, 5, 3 };
    assertArrayEquals(new int[] { 0, 1, 2 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case84() {
    int[] heights = { 38, 25, 13, 6, 32, 43, 46 };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 6 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case85() {
    int[] heights = { 3, 5, 4, 2, 1 };
    assertArrayEquals(new int[] { 0, 3, 4, 2, 1 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case86() {
    int[] heights = { 3, 3, 2, 2 };
    assertArrayEquals(new int[] { 0, 1, 2, 3 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case87() {
    int[] heights = { 4 };
    assertArrayEquals(new int[] { 0 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case88() {
    int[] heights = { 3, 2, 1, 2, 3 };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case89() {
    int[] heights = { 13, 6, 6, 13 };
    assertArrayEquals(new int[] { 0, 1, 2, 3 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case90() {
    int[] heights = { 3, 3, 2 };
    assertArrayEquals(new int[] { 0, 1, 2 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case91() {
    int[] heights = { 4, 7, 5, 1, 1, 1 };
    assertArrayEquals(new int[] { 0, 3, 4, 5, 2, 1 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case92() {
    int[] heights = { 40, 1, 40, 1 };
    assertArrayEquals(new int[] { 0, 1, 3, 2 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case93() {
    int[] heights = { 9, 7, 2, 2, 2 };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case94() {
    int[] heights = { 32, 13, 38, 25, 43, 47, 6 };
    assertArrayEquals(new int[] { 0, 1, 6, 3, 2, 4, 5 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case95() {
    int[] heights = { 23, 34, 12, 1, 5, 7, 18 };
    assertArrayEquals(new int[] { 0, 2, 3, 4, 5, 6, 1 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case96() {
    int[] heights = { 4, 4, 3, 3, 2, 2 };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case97() {
    int[] heights = { 5, 5, 4, 5, 6, 1, 7 };
    assertArrayEquals(new int[] { 0, 1, 2, 5, 3, 4, 6 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case98() {
    int[] heights = { 13, 32, 38, 25, 43, 6, 6 };
    assertArrayEquals(new int[] { 0, 5, 6, 3, 1, 2, 4 }, thebricktowermediumdivtwo.find(heights));
  }

  @Test
  public void case99() {
    int[] heights = { 10, 12, 11, 6, 5, 5, 5 };
    assertArrayEquals(new int[] { 0, 3, 4, 5, 6, 2, 1 }, thebricktowermediumdivtwo.find(heights));
  }

}
