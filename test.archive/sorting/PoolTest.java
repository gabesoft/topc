package topc.test.sorting;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.sorting.*;

public class PoolTest {
  Pool pool = new Pool();

  @Test
  public void case1() {
    int[] triangle = { 6, 12, 14, 1, 8, 2, 11, 3, 9, 4, 7, 13, 5, 15, 10 };
    assertEquals(0, pool.rackMoves(triangle));
  }

  @Test
  public void case2() {
    int[] triangle = { 2, 10, 7, 1, 8, 12, 6, 11, 4, 9, 13, 3, 14, 15, 5 };
    assertEquals(2, pool.rackMoves(triangle));
  }

  @Test
  public void case3() {
    int[] triangle = { 8, 15, 9, 4, 10, 6, 11, 3, 14, 7, 2, 1, 13, 12, 5 };
    assertEquals(3, pool.rackMoves(triangle));
  }

  @Test
  public void case4() {
    int[] triangle = { 15, 5, 8, 13, 2, 14, 10, 3, 4, 6, 7, 9, 1, 12, 11 };
    assertEquals(4, pool.rackMoves(triangle));
  }

  @Test
  public void case5() {
    int[] triangle = { 1, 5, 15, 6, 10, 9, 11, 13, 7, 4, 3, 8, 2, 12, 14 };
    assertEquals(3, pool.rackMoves(triangle));
  }

  @Test
  public void case6() {
    int[] triangle = { 15, 4, 1, 9, 8, 14, 3, 12, 7, 11, 10, 5, 13, 2, 6 };
    assertEquals(0, pool.rackMoves(triangle));
  }

  @Test
  public void case7() {
    int[] triangle = { 11, 9, 1, 12, 8, 15, 4, 13, 5, 14, 10, 3, 6, 7, 2 };
    assertEquals(1, pool.rackMoves(triangle));
  }

  @Test
  public void case8() {
    int[] triangle = { 14, 13, 2, 10, 8, 1, 5, 11, 6, 9, 12, 4, 15, 7, 3 };
    assertEquals(1, pool.rackMoves(triangle));
  }

  @Test
  public void case9() {
    int[] triangle = { 15, 2, 7, 13, 4, 10, 3, 12, 6, 1, 11, 14, 9, 5, 8 };
    assertEquals(2, pool.rackMoves(triangle));
  }

  @Test
  public void case10() {
    int[] triangle = { 9, 4, 7, 2, 8, 14, 5, 6, 15, 1, 11, 10, 12, 3, 13 };
    assertEquals(3, pool.rackMoves(triangle));
  }

  @Test
  public void case11() {
    int[] triangle = { 14, 5, 2, 13, 8, 10, 3, 9, 7, 4, 6, 11, 15, 1, 12 };
    assertEquals(2, pool.rackMoves(triangle));
  }

  @Test
  public void case12() {
    int[] triangle = { 12, 4, 6, 2, 8, 1, 5, 10, 9, 15, 11, 3, 14, 7, 13 };
    assertEquals(2, pool.rackMoves(triangle));
  }

  @Test
  public void case13() {
    int[] triangle = { 10, 5, 14, 9, 8, 11, 7, 3, 4, 13, 2, 1, 6, 12, 15 };
    assertEquals(3, pool.rackMoves(triangle));
  }

  @Test
  public void case14() {
    int[] triangle = { 14, 3, 5, 13, 1, 4, 6, 12, 2, 10, 11, 15, 7, 8, 9 };
    assertEquals(3, pool.rackMoves(triangle));
  }

  @Test
  public void case15() {
    int[] triangle = { 6, 4, 14, 11, 15, 8, 7, 1, 10, 12, 13, 2, 9, 3, 5 };
    assertEquals(3, pool.rackMoves(triangle));
  }

  @Test
  public void case16() {
    int[] triangle = { 15, 7, 5, 12, 8, 11, 2, 13, 6, 10, 9, 1, 14, 3, 4 };
    assertEquals(0, pool.rackMoves(triangle));
  }

  @Test
  public void case17() {
    int[] triangle = { 15, 6, 7, 12, 8, 13, 1, 14, 10, 5, 9, 3, 11, 4, 2 };
    assertEquals(1, pool.rackMoves(triangle));
  }

  @Test
  public void case18() {
    int[] triangle = { 11, 8, 3, 14, 5, 13, 2, 9, 1, 12, 10, 6, 4, 7, 15 };
    assertEquals(2, pool.rackMoves(triangle));
  }

  @Test
  public void case19() {
    int[] triangle = { 14, 3, 1, 9, 10, 13, 6, 5, 4, 7, 12, 8, 11, 2, 15 };
    assertEquals(3, pool.rackMoves(triangle));
  }

  @Test
  public void case20() {
    int[] triangle = { 15, 7, 1, 3, 8, 11, 6, 2, 4, 5, 14, 9, 13, 12, 10 };
    assertEquals(3, pool.rackMoves(triangle));
  }

  @Test
  public void case21() {
    int[] triangle = { 12, 7, 1, 15, 9, 3, 5, 8, 13, 6, 10, 14, 11, 4, 2 };
    assertEquals(3, pool.rackMoves(triangle));
  }

  @Test
  public void case22() {
    int[] triangle = { 1, 10, 6, 15, 2, 13, 12, 9, 5, 4, 7, 8, 14, 11, 3 };
    assertEquals(4, pool.rackMoves(triangle));
  }

  @Test
  public void case23() {
    int[] triangle = { 11, 12, 2, 5, 8, 13, 3, 14, 9, 7, 10, 4, 15, 6, 1 };
    assertEquals(2, pool.rackMoves(triangle));
  }

  @Test
  public void case24() {
    int[] triangle = { 7, 4, 11, 14, 1, 3, 6, 8, 12, 5, 15, 10, 2, 9, 13 };
    assertEquals(3, pool.rackMoves(triangle));
  }

  @Test
  public void case25() {
    int[] triangle = { 14, 6, 2, 12, 8, 15, 7, 10, 13, 4, 3, 11, 9, 1, 5 };
    assertEquals(2, pool.rackMoves(triangle));
  }

  @Test
  public void case26() {
    int[] triangle = { 11, 6, 7, 10, 8, 12, 4, 9, 5, 13, 15, 3, 14, 1, 2 };
    assertEquals(0, pool.rackMoves(triangle));
  }

  @Test
  public void case27() {
    int[] triangle = { 10, 6, 1, 8, 12, 15, 3, 14, 7, 13, 11, 4, 9, 5, 2 };
    assertEquals(1, pool.rackMoves(triangle));
  }

  @Test
  public void case28() {
    int[] triangle = { 10, 2, 3, 14, 8, 15, 4, 12, 6, 9, 11, 7, 13, 1, 5 };
    assertEquals(0, pool.rackMoves(triangle));
  }

  @Test
  public void case29() {
    int[] triangle = { 10, 4, 1, 14, 8, 13, 6, 11, 7, 12, 15, 5, 2, 3, 9 };
    assertEquals(1, pool.rackMoves(triangle));
  }

  @Test
  public void case30() {
    int[] triangle = { 9, 4, 7, 13, 2, 15, 10, 14, 8, 12, 5, 6, 3, 11, 1 };
    assertEquals(3, pool.rackMoves(triangle));
  }

  @Test
  public void case31() {
    int[] triangle = { 6, 15, 2, 1, 8, 14, 5, 11, 10, 9, 13, 4, 12, 7, 3 };
    assertEquals(2, pool.rackMoves(triangle));
  }

  @Test
  public void case32() {
    int[] triangle = { 7, 1, 2, 11, 10, 15, 8, 5, 14, 9, 13, 6, 12, 4, 3 };
    assertEquals(3, pool.rackMoves(triangle));
  }

  @Test
  public void case33() {
    int[] triangle = { 13, 9, 2, 8, 4, 7, 3, 10, 6, 12, 14, 1, 15, 5, 11 };
    assertEquals(3, pool.rackMoves(triangle));
  }

  @Test
  public void case34() {
    int[] triangle = { 7, 11, 13, 1, 8, 5, 14, 10, 4, 9, 3, 12, 15, 6, 2 };
    assertEquals(3, pool.rackMoves(triangle));
  }

  @Test
  public void case35() {
    int[] triangle = { 14, 11, 5, 6, 8, 10, 3, 2, 4, 7, 13, 12, 9, 15, 1 };
    assertEquals(3, pool.rackMoves(triangle));
  }

  @Test
  public void case36() {
    int[] triangle = { 11, 6, 3, 13, 8, 10, 7, 15, 2, 9, 14, 1, 12, 4, 5 };
    assertEquals(0, pool.rackMoves(triangle));
  }

  @Test
  public void case37() {
    int[] triangle = { 15, 5, 2, 13, 8, 14, 1, 3, 6, 11, 10, 12, 9, 7, 4 };
    assertEquals(1, pool.rackMoves(triangle));
  }

  @Test
  public void case38() {
    int[] triangle = { 4, 7, 6, 12, 8, 11, 5, 15, 3, 13, 10, 2, 14, 9, 1 };
    assertEquals(1, pool.rackMoves(triangle));
  }

  @Test
  public void case39() {
    int[] triangle = { 13, 4, 7, 12, 8, 9, 2, 10, 5, 15, 6, 14, 1, 11, 3 };
    assertEquals(2, pool.rackMoves(triangle));
  }

  @Test
  public void case40() {
    int[] triangle = { 15, 9, 2, 12, 8, 7, 1, 13, 6, 11, 3, 10, 14, 5, 4 };
    assertEquals(2, pool.rackMoves(triangle));
  }

  @Test
  public void case41() {
    int[] triangle = { 8, 11, 5, 7, 13, 9, 12, 14, 3, 4, 15, 1, 10, 6, 2 };
    assertEquals(3, pool.rackMoves(triangle));
  }

  @Test
  public void case42() {
    int[] triangle = { 15, 2, 6, 10, 8, 4, 3, 9, 5, 14, 12, 1, 13, 7, 11 };
    assertEquals(1, pool.rackMoves(triangle));
  }

  @Test
  public void case43() {
    int[] triangle = { 1, 8, 13, 2, 3, 11, 14, 10, 5, 12, 6, 7, 9, 15, 4 };
    assertEquals(4, pool.rackMoves(triangle));
  }

  @Test
  public void case44() {
    int[] triangle = { 3, 6, 11, 1, 2, 15, 14, 8, 7, 10, 9, 12, 13, 4, 5 };
    assertEquals(4, pool.rackMoves(triangle));
  }

  @Test
  public void case45() {
    int[] triangle = { 15, 5, 6, 2, 4, 8, 9, 7, 12, 11, 14, 13, 10, 3, 1 };
    assertEquals(4, pool.rackMoves(triangle));
  }

  @Test
  public void case46() {
    int[] triangle = { 13, 5, 1, 9, 8, 10, 3, 11, 2, 12, 15, 7, 14, 4, 6 };
    assertEquals(0, pool.rackMoves(triangle));
  }

  @Test
  public void case47() {
    int[] triangle = { 13, 6, 7, 14, 8, 11, 4, 9, 2, 15, 12, 1, 10, 3, 5 };
    assertEquals(0, pool.rackMoves(triangle));
  }

  @Test
  public void case48() {
    int[] triangle = { 12, 1, 6, 9, 8, 14, 10, 15, 2, 5, 11, 7, 13, 3, 4 };
    assertEquals(1, pool.rackMoves(triangle));
  }

  @Test
  public void case49() {
    int[] triangle = { 9, 10, 5, 14, 8, 11, 7, 12, 3, 13, 15, 1, 2, 6, 4 };
    assertEquals(1, pool.rackMoves(triangle));
  }

  @Test
  public void case50() {
    int[] triangle = { 9, 3, 14, 13, 8, 10, 1, 11, 5, 6, 12, 15, 2, 4, 7 };
    assertEquals(2, pool.rackMoves(triangle));
  }

  @Test
  public void case51() {
    int[] triangle = { 1, 4, 6, 10, 8, 15, 12, 9, 2, 11, 3, 5, 14, 13, 7 };
    assertEquals(2, pool.rackMoves(triangle));
  }

  @Test
  public void case52() {
    int[] triangle = { 4, 13, 6, 8, 14, 12, 2, 15, 5, 11, 9, 7, 10, 1, 3 };
    assertEquals(2, pool.rackMoves(triangle));
  }

  @Test
  public void case53() {
    int[] triangle = { 12, 2, 1, 13, 8, 3, 9, 5, 15, 10, 11, 4, 14, 6, 7 };
    assertEquals(2, pool.rackMoves(triangle));
  }

  @Test
  public void case54() {
    int[] triangle = { 15, 2, 8, 10, 1, 12, 4, 9, 11, 7, 14, 3, 6, 13, 5 };
    assertEquals(3, pool.rackMoves(triangle));
  }

  @Test
  public void case55() {
    int[] triangle = { 4, 15, 5, 6, 14, 2, 7, 11, 8, 9, 12, 3, 13, 10, 1 };
    assertEquals(4, pool.rackMoves(triangle));
  }

  @Test
  public void case56() {
    int[] triangle = { 5, 14, 9, 4, 8, 7, 15, 1, 13, 2, 6, 11, 3, 10, 12 };
    assertEquals(0, pool.rackMoves(triangle));
  }

  @Test
  public void case57() {
    int[] triangle = { 6, 15, 10, 3, 8, 1, 12, 4, 14, 2, 7, 11, 9, 13, 5 };
    assertEquals(1, pool.rackMoves(triangle));
  }

  @Test
  public void case58() {
    int[] triangle = { 3, 11, 14, 4, 8, 5, 13, 1, 12, 6, 2, 15, 7, 10, 9 };
    assertEquals(0, pool.rackMoves(triangle));
  }

  @Test
  public void case59() {
    int[] triangle = { 2, 9, 6, 4, 8, 3, 14, 5, 13, 7, 1, 11, 15, 10, 12 };
    assertEquals(1, pool.rackMoves(triangle));
  }

  @Test
  public void case60() {
    int[] triangle = { 3, 15, 12, 2, 1, 6, 13, 7, 11, 14, 8, 10, 4, 9, 5 };
    assertEquals(2, pool.rackMoves(triangle));
  }

  @Test
  public void case61() {
    int[] triangle = { 1, 11, 9, 6, 10, 3, 8, 7, 14, 2, 5, 12, 4, 15, 13 };
    assertEquals(1, pool.rackMoves(triangle));
  }

  @Test
  public void case62() {
    int[] triangle = { 4, 14, 11, 15, 8, 10, 7, 3, 9, 6, 5, 13, 1, 2, 12 };
    assertEquals(2, pool.rackMoves(triangle));
  }

  @Test
  public void case63() {
    int[] triangle = { 4, 1, 15, 6, 7, 10, 14, 5, 13, 9, 8, 3, 2, 11, 12 };
    assertEquals(3, pool.rackMoves(triangle));
  }

  @Test
  public void case64() {
    int[] triangle = { 8, 4, 9, 10, 2, 5, 11, 13, 3, 7, 6, 12, 1, 15, 14 };
    assertEquals(3, pool.rackMoves(triangle));
  }

  @Test
  public void case65() {
    int[] triangle = { 6, 11, 8, 7, 12, 15, 5, 2, 4, 10, 3, 1, 13, 9, 14 };
    assertEquals(4, pool.rackMoves(triangle));
  }

  @Test
  public void case66() {
    int[] triangle = { 2, 9, 13, 4, 8, 1, 12, 6, 14, 7, 3, 11, 5, 10, 15 };
    assertEquals(0, pool.rackMoves(triangle));
  }

  @Test
  public void case67() {
    int[] triangle = { 2, 13, 11, 5, 6, 8, 15, 3, 9, 4, 1, 10, 7, 14, 12 };
    assertEquals(1, pool.rackMoves(triangle));
  }

  @Test
  public void case68() {
    int[] triangle = { 7, 10, 4, 1, 8, 3, 9, 13, 15, 2, 5, 11, 6, 14, 12 };
    assertEquals(1, pool.rackMoves(triangle));
  }

  @Test
  public void case69() {
    int[] triangle = { 4, 14, 8, 12, 3, 13, 15, 1, 10, 5, 2, 11, 6, 9, 7 };
    assertEquals(3, pool.rackMoves(triangle));
  }

  @Test
  public void case70() {
    int[] triangle = { 6, 12, 10, 4, 8, 1, 2, 3, 15, 5, 7, 13, 11, 14, 9 };
    assertEquals(1, pool.rackMoves(triangle));
  }

  @Test
  public void case71() {
    int[] triangle = { 7, 15, 11, 14, 8, 4, 12, 2, 3, 6, 1, 9, 5, 13, 10 };
    assertEquals(1, pool.rackMoves(triangle));
  }

  @Test
  public void case72() {
    int[] triangle = { 11, 8, 13, 1, 12, 6, 5, 15, 10, 7, 3, 9, 2, 4, 14 };
    assertEquals(3, pool.rackMoves(triangle));
  }

  @Test
  public void case73() {
    int[] triangle = { 6, 7, 10, 4, 8, 9, 12, 1, 13, 2, 15, 14, 3, 11, 5 };
    assertEquals(2, pool.rackMoves(triangle));
  }

  @Test
  public void case74() {
    int[] triangle = { 15, 8, 11, 12, 4, 7, 9, 1, 10, 3, 13, 2, 6, 14, 5 };
    assertEquals(4, pool.rackMoves(triangle));
  }

  @Test
  public void case75() {
    int[] triangle = { 9, 4, 6, 2, 11, 13, 10, 15, 1, 12, 14, 8, 7, 3, 5 };
    assertEquals(3, pool.rackMoves(triangle));
  }

  @Test
  public void case76() {
    int[] triangle = { 6, 9, 10, 4, 8, 3, 15, 2, 14, 7, 5, 12, 1, 11, 13 };
    assertEquals(0, pool.rackMoves(triangle));
  }

  @Test
  public void case77() {
    int[] triangle = { 2, 13, 11, 5, 8, 6, 9, 7, 15, 1, 3, 14, 4, 12, 10 };
    assertEquals(0, pool.rackMoves(triangle));
  }

  @Test
  public void case78() {
    int[] triangle = { 4, 10, 13, 7, 8, 1, 12, 3, 11, 2, 6, 9, 5, 15, 14 };
    assertEquals(0, pool.rackMoves(triangle));
  }

  @Test
  public void case79() {
    int[] triangle = { 2, 1, 11, 5, 10, 6, 15, 8, 9, 4, 7, 14, 3, 12, 13 };
    assertEquals(2, pool.rackMoves(triangle));
  }

  @Test
  public void case80() {
    int[] triangle = { 3, 10, 12, 9, 8, 5, 2, 1, 14, 11, 7, 13, 4, 15, 6 };
    assertEquals(2, pool.rackMoves(triangle));
  }

  @Test
  public void case81() {
    int[] triangle = { 4, 11, 12, 7, 8, 2, 6, 5, 9, 3, 13, 1, 15, 10, 14 };
    assertEquals(2, pool.rackMoves(triangle));
  }

  @Test
  public void case82() {
    int[] triangle = { 3, 13, 15, 2, 8, 11, 9, 1, 5, 4, 7, 10, 12, 14, 6 };
    assertEquals(2, pool.rackMoves(triangle));
  }

  @Test
  public void case83() {
    int[] triangle = { 5, 12, 9, 10, 7, 3, 11, 2, 14, 8, 6, 15, 1, 13, 4 };
    assertEquals(2, pool.rackMoves(triangle));
  }

  @Test
  public void case84() {
    int[] triangle = { 4, 14, 3, 8, 2, 7, 15, 1, 6, 9, 5, 10, 11, 13, 12 };
    assertEquals(3, pool.rackMoves(triangle));
  }

  @Test
  public void case85() {
    int[] triangle = { 5, 2, 10, 3, 8, 6, 9, 4, 12, 15, 14, 11, 1, 13, 7 };
    assertEquals(2, pool.rackMoves(triangle));
  }

  @Test
  public void case86() {
    int[] triangle = { 4, 9, 13, 6, 8, 5, 14, 1, 11, 7, 2, 12, 3, 15, 10 };
    assertEquals(0, pool.rackMoves(triangle));
  }

  @Test
  public void case87() {
    int[] triangle = { 7, 9, 14, 3, 8, 6, 10, 1, 11, 4, 5, 13, 2, 12, 15 };
    assertEquals(0, pool.rackMoves(triangle));
  }

  @Test
  public void case88() {
    int[] triangle = { 6, 10, 12, 2, 7, 9, 14, 4, 11, 8, 1, 13, 5, 3, 15 };
    assertEquals(2, pool.rackMoves(triangle));
  }

  @Test
  public void case89() {
    int[] triangle = { 4, 1, 14, 5, 6, 9, 12, 3, 10, 8, 7, 13, 2, 11, 15 };
    assertEquals(2, pool.rackMoves(triangle));
  }

  @Test
  public void case90() {
    int[] triangle = { 8, 15, 14, 7, 13, 3, 9, 4, 12, 10, 2, 11, 5, 6, 1 };
    assertEquals(3, pool.rackMoves(triangle));
  }

  @Test
  public void case91() {
    int[] triangle = { 9, 13, 7, 2, 8, 11, 3, 1, 10, 12, 5, 6, 4, 15, 14 };
    assertEquals(3, pool.rackMoves(triangle));
  }

  @Test
  public void case92() {
    int[] triangle = { 1, 13, 9, 8, 2, 15, 7, 6, 11, 5, 3, 14, 4, 12, 10 };
    assertEquals(2, pool.rackMoves(triangle));
  }

  @Test
  public void case93() {
    int[] triangle = { 15, 10, 13, 2, 7, 1, 5, 6, 12, 14, 3, 9, 4, 8, 11 };
    assertEquals(3, pool.rackMoves(triangle));
  }

  @Test
  public void case94() {
    int[] triangle = { 6, 5, 9, 2, 13, 4, 7, 1, 10, 3, 12, 14, 15, 11, 8 };
    assertEquals(3, pool.rackMoves(triangle));
  }

  @Test
  public void case95() {
    int[] triangle = { 7, 11, 12, 3, 1, 10, 6, 4, 14, 2, 8, 13, 5, 15, 9 };
    assertEquals(2, pool.rackMoves(triangle));
  }

  @Test
  public void case96() {
    int[] triangle = { 5, 13, 9, 7, 8, 2, 14, 3, 15, 6, 4, 10, 1, 12, 11 };
    assertEquals(0, pool.rackMoves(triangle));
  }

  @Test
  public void case97() {
    int[] triangle = { 7, 1, 15, 3, 8, 2, 11, 4, 14, 12, 5, 10, 6, 13, 9 };
    assertEquals(1, pool.rackMoves(triangle));
  }

  @Test
  public void case98() {
    int[] triangle = { 6, 13, 9, 7, 8, 14, 10, 1, 11, 4, 3, 12, 2, 15, 5 };
    assertEquals(1, pool.rackMoves(triangle));
  }

  @Test
  public void case99() {
    int[] triangle = { 1, 11, 13, 7, 8, 12, 15, 3, 14, 5, 2, 4, 6, 10, 9 };
    assertEquals(1, pool.rackMoves(triangle));
  }

  @Test
  public void case100() {
    int[] triangle = { 7, 11, 1, 6, 8, 3, 9, 4, 12, 2, 5, 15, 10, 13, 14 };
    assertEquals(1, pool.rackMoves(triangle));
  }

  @Test
  public void case101() {
    int[] triangle = { 8, 12, 14, 1, 6, 2, 11, 3, 9, 4, 7, 13, 5, 15, 10 };
    assertEquals(1, pool.rackMoves(triangle));
  }

  @Test
  public void case102() {
    int[] triangle = { 15, 7, 6, 14, 8, 13, 5, 11, 3, 12, 10, 2, 9, 1, 4 };
    assertEquals(0, pool.rackMoves(triangle));
  }

}
