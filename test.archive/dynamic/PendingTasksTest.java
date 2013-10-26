package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class PendingTasksTest {
  PendingTasks pendingtasks = new PendingTasks();

  @Test
  public void case1() {
    int[] supertasks = { 4, 4, 4, 4, -1 };
    assertEquals(2, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case2() {
    int[] supertasks = { 1, 2, 3, 4, -1 };
    assertEquals(4, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case3() {
    int[] supertasks = { -1 };
    assertEquals(0, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case4() {
    int[] supertasks = { 6, 6, 6, 7, 7, 7, 8, 8, -1 };
    assertEquals(7, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case5() {
    int[] supertasks = { 3, 4, 5, 6, 6, 6, -1 };
    assertEquals(5, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case6() {
    int[] supertasks = { 13, 13, 13, 13, 14, 14, 14, 14, 12, 12, 12, 12, 15, 16, 16, 16, -1 };
    assertEquals(13, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case7() {
    int[] supertasks = { 27, 27, 27, 28, 28, 28, 29, 29, 29, 30, 30, 30, 31, 31, 31, 32, 32, 32, 33, 33, 33, 34, 34, 34, 35, 35, 35, 36, 36, 36, 37, 37, 37, 38, 38, 38, 39, 39, 39, -1 };
    assertEquals(28, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case8() {
    int[] supertasks = { 6, 7, 6, 7, 6, 7, 8, 8, -1 };
    assertEquals(7, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case9() {
    int[] supertasks = { 42, 42, 42, 42, 42, 42, 43, 43, 43, 43, 43, 43, 44, 44, 44, 44, 44, 44, 45, 45, 45, 45, 45, 45, 46, 46, 46, 46, 46, 46, 47, 47, 47, 47, 47, 47, 48, 48, 48, 48, 48, 48, 49, 49, 49, 49, 49, 49, 49, -1 };
    assertEquals(15, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case10() {
    int[] supertasks = { 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, -1 };
    assertEquals(2, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case11() {
    int[] supertasks = { 11, 5, 11, 10, 11, 9, 9, 10, 9, 11, 11, 12, -1 };
    assertEquals(12, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case12() {
    int[] supertasks = { 3, 3, 3, 4, -1 };
    assertEquals(4, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case13() {
    int[] supertasks = { 13, 13, 13, 14, 14, 14, 17, 18, 18, 18, 18, 18, 18, 20, 20, 17, 17, 22, 22, 23, 23, 23, 23, -1 };
    assertEquals(20, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case14() {
    int[] supertasks = { 12, 12, 12, 13, 13, 13, 14, 14, 14, 15, 15, 15, 16, 16, 17, 17, 19, 19, 19, -1 };
    assertEquals(17, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case15() {
    int[] supertasks = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, -1 };
    assertEquals(49, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case16() {
    int[] supertasks = { 25, 27, 24, 28, 25, 28, 26, 26, 24, 26, 24, 27, 27, 25, 28, 29, 29, 29, 30, 30, 30, 31, 31, 31, 32, 34, 33, 33, 32, 34, 35, 35, 36, 36, 37, 37, 38, 38, -1 };
    assertEquals(37, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case17() {
    int[] supertasks = { 25, 27, 24, 28, 25, 28, 26, 26, 24, 24, 24, 27, 27, 25, 28, 29, 29, 29, 30, 30, 30, 31, 31, 31, 32, 34, 33, 33, 32, 34, 35, 35, 36, 36, 37, 37, 38, 38, -1 };
    assertEquals(38, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case18() {
    int[] supertasks = { 15, 13, 15, 11, 11, 15, 15, 13, 13, 13, 19, 27, 15, 22, 19, 27, 19, 19, 19, 20, 22, 22, 23, 27, 26, 26, 27, -1 };
    assertEquals(24, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case19() {
    int[] supertasks = { 34, 4, 26, 14, 44, 28, 23, 30, 37, 41, 33, 45, 49, 17, 20, 19, 29, 30, 24, 37, 40, 25, 34, 24, 38, 46, 46, 33, 33, 49, 47, 38, 49, 47, 42, 43, 37, 41, 42, 42, 48, 46, 47, 44, 48, 47, 49, 49, 49, -1 };
    assertEquals(43, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case20() {
    int[] supertasks = { 1, 18, 5, 38, 35, 10, 7, 12, 26, 27, 37, 16, 20, 17, 20, 21, 23, 39, 28, 20, 39, 40, 39, 28, 33, 34, 33, 36, 39, 34, 40, 34, 35, 34, 39, 37, 38, 40, 40, 40, -1 };
    assertEquals(36, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case21() {
    int[] supertasks = { 1, -1 };
    assertEquals(1, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case22() {
    int[] supertasks = { 2, 15, 4, 5, 39, 31, 9, 9, 9, 17, 42, 14, 14, 39, 22, 21, 28, 39, 20, 33, 32, 22, 25, 34, 27, 26, 43, 28, 40, 32, 36, 40, 33, 42, 36, 38, 39, 38, 42, 43, 42, 43, 43, -1 };
    assertEquals(39, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case23() {
    int[] supertasks = { 26, 22, 8, 4, 8, 18, 21, 14, 34, 30, 23, 19, 42, 21, 37, 30, 17, 42, 41, 20, 27, 22, 36, 35, 44, 37, 28, 38, 42, 40, 32, 36, 36, 34, 40, 44, 43, 42, 39, 43, 43, 42, 44, 44, -1 };
    assertEquals(41, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case24() {
    int[] supertasks = { 2, 2, -1 };
    assertEquals(2, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case25() {
    int[] supertasks = { 12, 5, 20, 27, 15, 11, 10, 22, 37, 30, 13, 14, 36, 35, 16, 25, 33, 34, 20, 26, 23, 31, 27, 31, 32, 29, 34, 37, 31, 36, 33, 38, 33, 37, 37, 38, 38, 38, -1 };
    assertEquals(34, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case26() {
    int[] supertasks = { 13, 6, 4, 8, 9, 9, 8, 12, 19, 14, 13, 17, 16, 18, 16, 16, 19, 18, 19, -1 };
    assertEquals(17, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case27() {
    int[] supertasks = { 1, 11, 37, 24, 6, 28, 7, 9, 29, 14, 41, 21, 41, 28, 33, 23, 47, 35, 30, 33, 32, 36, 23, 29, 38, 39, 43, 41, 33, 30, 44, 42, 45, 36, 42, 47, 42, 43, 42, 41, 44, 46, 44, 45, 45, 46, 47, -1 };
    assertEquals(46, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case28() {
    int[] supertasks = { 1, 36, 13, 8, 8, 34, 34, 41, 23, 30, 36, 18, 18, 25, 24, 26, 31, 20, 30, 37, 25, 43, 36, 27, 34, 42, 35, 32, 44, 40, 33, 39, 36, 39, 37, 41, 41, 43, 45, 41, 43, 42, 43, 45, 45, -1 };
    assertEquals(44, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case29() {
    int[] supertasks = { 1, 5, 21, 12, 12, 13, 13, 8, 11, 15, 26, 16, 14, 18, 27, 17, 20, 18, 26, 20, 28, 24, 25, 26, 25, 27, 28, 28, -1 };
    assertEquals(26, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case30() {
    int[] supertasks = { 5, 7, 9, 4, 5, 7, 8, 9, 9, -1 };
    assertEquals(8, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case31() {
    int[] supertasks = { 25, 4, 31, 5, 6, 33, 20, 13, 13, 21, 20, 33, 16, 34, 33, 32, 22, 31, 38, 29, 29, 35, 27, 26, 31, 31, 37, 36, 30, 34, 32, 34, 35, 38, 35, 36, 38, 38, -1 };
    assertEquals(36, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case32() {
    int[] supertasks = { 3, 3, 24, 22, 29, 15, 13, 8, 14, 13, 25, 20, 15, 27, 20, 20, 24, 26, 27, 27, 28, 29, 27, 25, 27, 27, 28, 29, 29, -1 };
    assertEquals(27, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case33() {
    int[] supertasks = { 13, 2, 7, 20, 20, 13, 22, 13, 14, 11, 17, 19, 22, 22, 27, 25, 20, 23, 24, 24, 22, 25, 26, 27, 26, 27, 27, 28, -1 };
    assertEquals(28, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case34() {
    int[] supertasks = { 2, 9, 7, 7, 17, 23, 23, 10, 9, 15, 19, 28, 24, 18, 29, 23, 21, 19, 21, 23, 22, 28, 26, 27, 29, 26, 28, 29, 30, 30, -1 };
    assertEquals(29, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case35() {
    int[] supertasks = { 3, 8, 22, 10, 22, 10, 9, 9, 14, 19, 30, 25, 26, 19, 22, 30, 33, 19, 30, 26, 31, 22, 29, 29, 25, 31, 33, 29, 32, 33, 33, 33, 33, -1 };
    assertEquals(26, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case36() {
    int[] supertasks = { 20, 8, 24, 26, 7, 16, 17, 16, 25, 31, 23, 17, 32, 26, 32, 28, 30, 33, 28, 29, 31, 25, 29, 31, 28, 28, 31, 33, 31, 30, 33, 33, 33, -1 };
    assertEquals(28, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case37() {
    int[] supertasks = { 2, 4, 4, 5, 5, -1 };
    assertEquals(5, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case38() {
    int[] supertasks = { 1, 2, 4, 4, -1 };
    assertEquals(4, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case39() {
    int[] supertasks = { 2, 6, 3, 16, 8, 16, 10, 14, 15, 12, 13, 13, 13, 17, 15, 18, 18, 18, 19, -1 };
    assertEquals(19, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case40() {
    int[] supertasks = { 11, 3, 5, 8, 12, 9, 9, 12, 9, 10, 12, 12, -1 };
    assertEquals(10, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case41() {
    int[] supertasks = { 17, 2, 11, 14, 6, 10, 12, 8, 14, 12, 15, 17, 14, 16, 15, 16, 17, -1 };
    assertEquals(16, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case42() {
    int[] supertasks = { 2, 3, 6, 16, 10, 6, 14, 15, 19, 19, 17, 12, 17, 16, 17, 20, 19, 18, 20, 20, -1 };
    assertEquals(19, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case43() {
    int[] supertasks = { 10, 3, 7, 4, 9, 17, 7, 8, 15, 14, 16, 17, 13, 14, 15, 17, 17, -1 };
    assertEquals(15, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case44() {
    int[] supertasks = { 38, 12, 15, 4, 25, 7, 23, 24, 12, 10, 34, 23, 17, 20, 27, 22, 33, 22, 22, 39, 26, 26, 39, 28, 37, 26, 38, 34, 38, 30, 32, 34, 33, 40, 39, 37, 37, 40, 40, 40, -1 };
    assertEquals(34, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case45() {
    int[] supertasks = { 8, 6, 4, 8, 17, 12, 20, 9, 11, 20, 17, 13, 19, 18, 15, 17, 17, 19, 23, 23, 22, 22, 23, -1 };
    assertEquals(22, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case46() {
    int[] supertasks = { 2, 3, 3, -1 };
    assertEquals(3, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case47() {
    int[] supertasks = { 1, 2, 18, 15, 32, 27, 17, 12, 12, 35, 14, 19, 25, 15, 38, 25, 18, 23, 41, 33, 26, 25, 36, 35, 33, 28, 29, 39, 40, 31, 32, 33, 37, 40, 41, 36, 40, 41, 39, 40, 41, -1 };
    assertEquals(39, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case48() {
    int[] supertasks = { 2, 2, 7, 5, 5, 9, 13, 13, 10, 12, 12, 13, 13, -1 };
    assertEquals(11, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case49() {
    int[] supertasks = { 9, 5, 30, 29, 16, 8, 22, 11, 28, 20, 28, 24, 14, 19, 21, 29, 21, 20, 20, 22, 22, 25, 24, 30, 26, 29, 28, 28, 30, 31, 32, 32, -1 };
    assertEquals(32, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case50() {
    int[] supertasks = { 4, 15, 3, 22, 20, 7, 24, 11, 20, 21, 23, 17, 27, 15, 20, 18, 21, 21, 20, 21, 29, 26, 27, 27, 29, 26, 27, 29, 29, -1 };
    assertEquals(25, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case51() {
    int[] supertasks = { 9, 18, 27, 6, 9, 9, 19, 22, 26, 20, 30, 23, 13, 17, 17, 28, 25, 26, 32, 32, 23, 23, 32, 32, 27, 31, 28, 31, 31, 31, 32, 32, -1 };
    assertEquals(27, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case52() {
    int[] supertasks = { 1, -1 };
    assertEquals(1, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case53() {
    int[] supertasks = { 10, 22, 3, 6, 20, 18, 12, 9, 14, 19, 22, 19, 18, 24, 17, 16, 19, 24, 20, 23, 24, 22, 23, 24, -1 };
    assertEquals(22, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case54() {
    int[] supertasks = { 1, 2, 28, 12, 22, 20, 16, 26, 46, 33, 22, 29, 34, 33, 17, 38, 35, 36, 35, 35, 31, 44, 34, 43, 31, 29, 44, 36, 39, 31, 35, 45, 33, 39, 39, 41, 40, 46, 45, 40, 46, 42, 46, 45, 45, 46, -1 };
    assertEquals(43, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case55() {
    int[] supertasks = { 18, 9, 6, 6, 5, 9, 9, 20, 26, 16, 25, 19, 21, 18, 18, 20, 22, 23, 20, 24, 26, 24, 23, 27, 25, 27, 27, -1 };
    assertEquals(25, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case56() {
    int[] supertasks = { 24, 6, 3, 13, 22, 39, 7, 18, 43, 29, 44, 22, 13, 21, 32, 25, 21, 34, 40, 26, 38, 45, 34, 37, 37, 40, 38, 34, 30, 41, 43, 37, 39, 43, 39, 36, 45, 45, 42, 41, 42, 44, 43, 44, 45, -1 };
    assertEquals(41, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case57() {
    int[] supertasks = { 2, 2, 22, 18, 9, 19, 9, 18, 24, 11, 28, 27, 28, 18, 25, 27, 25, 25, 24, 23, 26, 26, 25, 28, 28, 27, 27, 28, -1 };
    assertEquals(25, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case58() {
    int[] supertasks = { 14, 6, 8, 8, 12, 12, 9, 16, 15, 13, 11, 14, 15, 15, 16, 16, -1 };
    assertEquals(15, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case59() {
    int[] supertasks = { 4, 4, 4, 4, -1 };
    assertEquals(2, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case60() {
    int[] supertasks = { 1, 2, 3, 4, -1 };
    assertEquals(4, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case61() {
    int[] supertasks = { 27, 27, 27, 28, 28, 28, 29, 29, 29, 30, 30, 30, 31, 31, 31, 32, 32, 32, 33, 33, 33, 34, 34, 34, 35, 35, 35, 36, 36, 36, 37, 37, 37, 38, 38, 38, 39, 39, 39, -1 };
    assertEquals(28, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case62() {
    int[] supertasks = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 30, 30, 30, 31, 31, 31, 32, 32, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 43, 43, 43, 43, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, -1 };
    assertEquals(35, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case63() {
    int[] supertasks = { 4, 4, 3, 4, -1 };
    assertEquals(3, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case64() {
    int[] supertasks = { 6, 6, 6, 4, 5, 10, 9, 12, 10, 11, 15, 15, 15, 15, 18, 16, 17, 23, 24, 23, 25, 27, 23, 26, 26, 29, 29, 31, 30, 35, 33, 32, 33, 35, 36, 37, 41, 38, 40, 40, 45, 42, 43, 47, 49, 49, 47, 49, 49, -1 };
    assertEquals(47, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case65() {
    int[] supertasks = { 7, 7, 3, 4, 5, 6, 7, -1 };
    assertEquals(6, pendingtasks.latestProcess(supertasks));
  }

  @Test
  public void case66() {
    int[] supertasks = { 3, 6, 6, 7, 7, 7, 8, 8, -1 };
    assertEquals(8, pendingtasks.latestProcess(supertasks));
  }

}
