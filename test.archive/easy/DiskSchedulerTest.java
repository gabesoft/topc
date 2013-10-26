package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class DiskSchedulerTest {
  DiskScheduler diskscheduler = new DiskScheduler();

  @Test
  public void case1() {
    int start = 5;
    int[] sectors = { 6, 8, 65, 71 };
    assertEquals(46, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case2() {
    int start = 5;
    int[] sectors = { 55, 65, 71 };
    assertEquals(50, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case3() {
    int start = 20;
    int[] sectors = { 1, 21, 99 };
    assertEquals(23, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case4() {
    int start = 99;
    int[] sectors = { 55, 56, 61, 70, 76, 78, 80, 83, 84, 90, 1, 4, 6, 26, 27, 33, 38, 46, 47, 49 };
    assertEquals(87, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case5() {
    int start = 42;
    int[] sectors = { 10, 11, 29, 30, 34, 35, 36, 38, 40, 41, 46, 48, 65, 73, 79, 80, 85, 91, 96, 97 };
    assertEquals(89, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case6() {
    int start = 15;
    int[] sectors = { 8, 16, 18, 44, 62, 68, 78, 88, 92, 99 };
    assertEquals(77, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case7() {
    int start = 98;
    int[] sectors = { 4, 13, 16, 21, 26, 80, 81, 86, 87, 99 };
    assertEquals(64, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case8() {
    int start = 34;
    int[] sectors = { 8, 20, 27, 35, 88 };
    assertEquals(48, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case9() {
    int start = 93;
    int[] sectors = { 22, 25, 72, 12, 46, 40, 34, 45, 43, 37, 100, 24, 26, 3, 14, 7, 96, 47, 90, 30, 61, 66, 27, 94, 85, 44, 65, 74, 36, 98, 2, 80, 51, 35, 68, 79, 10, 48, 63, 15, 97, 57, 49, 20, 89, 50, 78, 91, 19 };
    assertEquals(98, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case10() {
    int start = 16;
    int[] sectors = { 12, 60, 30, 50, 69, 51, 68, 59, 22, 61, 46, 98, 54, 38, 20, 41, 18, 31, 70, 13, 5, 37, 48, 73, 58, 52, 77, 17, 23, 14, 15, 81, 96, 6, 84, 29, 36, 43, 21, 89, 79, 10, 87, 32, 66, 65, 90, 92, 67 };
    assertEquals(99, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case11() {
    int start = 27;
    int[] sectors = { 15, 6, 25, 78, 61, 26, 30, 41, 97, 2, 90, 24, 65, 7, 96, 68, 4, 52, 69, 98, 75, 21, 84, 59, 29, 74, 53, 88, 17, 89, 95, 39, 56, 81, 5, 67, 42, 82, 94, 22, 60, 18, 93, 44, 92, 91, 54, 3, 76, 51 };
    assertEquals(94, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case12() {
    int start = 96;
    int[] sectors = { 46, 56, 15, 41, 86, 64, 19, 58, 18, 97, 14, 32, 89, 54, 71, 36, 95, 20, 6, 76, 60, 12, 3, 73, 93, 55, 57, 10, 94, 77, 79, 26, 92, 9, 11, 90, 83, 27, 70, 69, 45, 63, 42, 98, 47, 62, 25, 44, 28, 51 };
    assertEquals(97, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case13() {
    int start = 64;
    int[] sectors = { 52, 27, 9, 79, 20, 15, 39, 89, 5, 96, 75, 2, 91, 18, 74, 43, 41, 30, 100, 94, 35, 65, 42, 93, 50, 72, 19, 23, 81, 4, 66, 22, 78, 88, 36, 83, 7, 26, 47, 51, 80, 21, 32, 92, 77, 24, 28, 16, 49, 90 };
    assertEquals(88, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case14() {
    int start = 79;
    int[] sectors = { 54, 42, 8, 7, 50, 9, 77, 73, 10, 4, 34, 60, 1, 100, 18, 33, 29, 52, 15, 38, 3, 35, 43, 68, 45, 30, 48, 6, 57, 46, 12, 11, 13, 2, 40, 65, 72, 32, 59, 23, 92, 31, 55, 49, 63, 58, 16, 47, 75, 67 };
    assertEquals(87, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case15() {
    int start = 44;
    int[] sectors = { 66, 5, 69, 93, 18, 90, 64, 3, 87, 63, 79, 83, 62, 14, 25, 24, 31, 70, 27, 68, 23, 20, 72, 21, 75, 6, 49, 73, 81, 60, 1, 8, 86, 77, 30, 97, 82, 55, 17, 48, 4, 45, 51, 43, 9, 28, 67, 91, 16, 54 };
    assertEquals(89, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case16() {
    int start = 71;
    int[] sectors = { 17, 82, 34, 94, 8, 29, 10, 30, 33, 48, 21, 79, 11, 80, 31, 52, 20, 85, 84, 78, 14, 27, 13, 3, 83, 73, 50, 41, 90, 100, 1, 23, 77, 39, 22, 9, 60, 40, 32, 18, 42, 35, 26, 92, 15, 7, 86, 58, 49, 76 };
    assertEquals(89, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case17() {
    int start = 46;
    int[] sectors = { 89, 100, 2, 12, 85, 10, 29, 15, 86, 98, 9, 93, 71, 27, 44, 7, 37, 70, 34, 45, 1, 67, 24, 33, 11, 25, 63, 84, 42, 28, 32, 8, 14, 39, 96, 99, 30, 64, 5, 36, 90, 66, 20, 77, 62, 16, 69, 76, 95, 23 };
    assertEquals(84, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case18() {
    int start = 2;
    int[] sectors = { 90, 27, 26, 71, 67, 28, 45, 46, 39, 47, 15, 76, 65, 81, 59, 52, 78, 86, 56, 74, 22, 12, 13, 57, 92, 41, 31, 50, 38, 14, 88, 61, 33, 21, 84, 53, 29, 85, 32, 70, 62, 49, 19, 58, 44 };
    assertEquals(90, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case19() {
    int start = 14;
    int[] sectors = { 16, 67, 34, 75, 15, 98, 53, 56, 80, 42, 82, 95, 97, 41, 72, 1, 70, 11, 57, 48, 44, 45, 61, 37, 86, 90, 99, 8, 88, 69, 4, 77, 49, 7, 65, 93, 47, 83, 51, 79, 74, 94, 85, 58, 3 };
    assertEquals(84, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case20() {
    int start = 84;
    int[] sectors = { 48, 4, 7, 41, 60, 22, 37, 23, 12, 61, 97, 100, 49, 24, 34, 6, 56, 51, 42, 14, 43, 25, 13, 3, 36, 46, 54, 26, 50, 45, 35, 88, 57, 93, 63 };
    assertEquals(79, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case21() {
    int start = 26;
    int[] sectors = { 75, 9, 20, 86, 60, 92, 52, 70, 10, 64, 14, 100, 55, 21, 4, 72, 56, 95, 13, 81, 6, 54, 97, 62, 22, 58, 82, 51, 53, 84, 17, 88, 49, 25, 16 };
    assertEquals(77, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case22() {
    int start = 83;
    int[] sectors = { 37, 21, 42, 30, 40, 43, 45, 60, 52, 69, 13, 19, 16, 39, 59, 23, 66, 32, 80, 33, 76, 25, 71, 41, 79, 64, 48, 70, 18, 20 };
    assertEquals(70, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case23() {
    int start = 41;
    int[] sectors = { 92, 1, 48, 69, 43, 47, 90, 3, 88, 84, 80, 49, 11, 59, 70, 65, 5, 85, 44, 7, 56, 62, 58, 100, 72, 94, 46, 93, 81, 15 };
    assertEquals(74, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case24() {
    int start = 46;
    int[] sectors = { 69, 97, 51, 58, 87, 10, 73, 5, 96, 4, 60, 91, 12, 63, 74, 66, 13, 80, 76, 11, 92, 79, 68, 49, 85 };
    assertEquals(67, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case25() {
    int start = 100;
    int[] sectors = { 58, 1, 24, 64, 26, 59, 33, 55, 2, 31, 61, 65, 51, 30, 22, 17, 3, 6, 5, 53, 38, 42, 15, 52, 9 };
    assertEquals(65, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case26() {
    int start = 59;
    int[] sectors = { 31, 30, 52, 13, 54, 6, 43, 5, 49, 57, 18, 99, 16, 27, 46, 20, 15, 29, 1, 38 };
    assertEquals(60, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case27() {
    int start = 56;
    int[] sectors = { 100, 75, 79, 72, 82, 87, 83, 98, 95, 3, 6, 92, 62, 60, 58, 94, 86, 78, 14, 18 };
    assertEquals(62, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case28() {
    int start = 23;
    int[] sectors = { 64, 72, 11, 61, 68, 89, 80, 2, 16, 81, 1, 3, 66, 96, 20, 87, 95, 59, 92, 90 };
    assertEquals(64, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case29() {
    int start = 64;
    int[] sectors = { 40, 19, 7, 42, 6, 17, 33, 56, 35, 2, 28, 30, 23, 60, 62, 43, 50, 11, 18, 46 };
    assertEquals(62, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case30() {
    int start = 42;
    int[] sectors = { 99, 83, 43, 57, 45, 49, 87, 77, 65, 70, 2, 1, 74, 59, 69, 53, 73, 85, 75, 52 };
    assertEquals(60, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case31() {
    int start = 72;
    int[] sectors = { 19, 82, 23, 15, 25, 73, 26, 7, 13, 22, 3, 28, 99, 20, 8, 94, 4, 78, 74, 90 };
    assertEquals(56, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case32() {
    int start = 1;
    int[] sectors = { 100 };
    assertEquals(1, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case33() {
    int start = 100;
    int[] sectors = { 1 };
    assertEquals(1, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case34() {
    int start = 56;
    int[] sectors = { 55 };
    assertEquals(1, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case35() {
    int start = 56;
    int[] sectors = { 57 };
    assertEquals(1, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case36() {
    int start = 1;
    int[] sectors = { 50 };
    assertEquals(49, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case37() {
    int start = 1;
    int[] sectors = { 51 };
    assertEquals(50, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case38() {
    int start = 1;
    int[] sectors = { 52 };
    assertEquals(49, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case39() {
    int start = 100;
    int[] sectors = { 1, 91, 20 };
    assertEquals(38, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case40() {
    int start = 1;
    int[] sectors = { 2, 3, 100 };
    assertEquals(4, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case41() {
    int start = 16;
    int[] sectors = { 55, 65, 66, 1, 100, 72, 64, 96, 18, 14, 10, 11, 17, 99 };
    assertEquals(65, diskscheduler.optimize(start, sectors));
  }

  @Test
  public void case42() {
    int start = 1;
    int[] sectors = { 2, 4, 8, 16, 95 };
    assertEquals(27, diskscheduler.optimize(start, sectors));
  }

}
