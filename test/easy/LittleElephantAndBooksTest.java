package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class LittleElephantAndBooksTest {
  LittleElephantAndBooks littleelephantandbooks = new LittleElephantAndBooks();

  @Test
  public void case1() {
    int[] pages = { 1, 2 };
    int number = 1;
    assertEquals(2, littleelephantandbooks.getNumber(pages, number));
  }

  @Test
  public void case2() {
    int[] pages = { 74, 7, 4, 47, 44 };
    int number = 3;
    assertEquals(58, littleelephantandbooks.getNumber(pages, number));
  }

  @Test
  public void case3() {
    int[] pages = { 3, 1, 9, 7, 2, 8, 6, 4, 5 };
    int number = 7;
    assertEquals(29, littleelephantandbooks.getNumber(pages, number));
  }

  @Test
  public void case4() {
    int[] pages = { 74, 86, 32, 13, 100, 67, 77 };
    int number = 2;
    assertEquals(80, littleelephantandbooks.getNumber(pages, number));
  }

  @Test
  public void case5() {
    int[] pages = { 100, 99, 98, 97 };
    int number = 3;
    assertEquals(295, littleelephantandbooks.getNumber(pages, number));
  }

  @Test
  public void case6() {
    int[] pages = { 45, 76, 97, 47, 1, 65, 46, 99, 100, 15, 7 };
    int number = 5;
    assertEquals(115, littleelephantandbooks.getNumber(pages, number));
  }

  @Test
  public void case7() {
    int[] pages = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
    int number = 16;
    assertEquals(137, littleelephantandbooks.getNumber(pages, number));
  }

  @Test
  public void case8() {
    int[] pages = { 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
    int number = 19;
    assertEquals(191, littleelephantandbooks.getNumber(pages, number));
  }

  @Test
  public void case9() {
    int[] pages = { 68, 35, 1, 70, 25, 79, 59, 63, 65, 6, 46, 82, 28, 62, 92, 96, 43, 37, 5, 3, 54, 93, 83, 22, 17, 19, 48, 27, 72, 39, 13, 100, 36, 95, 4, 12, 23, 34, 74, 42, 69, 45, 58 };
    int number = 4;
    assertEquals(14, littleelephantandbooks.getNumber(pages, number));
  }

  @Test
  public void case10() {
    int[] pages = { 24, 42, 30, 79, 17, 36, 91, 43, 89, 7, 41, 65, 49, 47, 6, 71, 51, 2, 94, 85, 55, 57, 67 };
    int number = 7;
    assertEquals(127, littleelephantandbooks.getNumber(pages, number));
  }

  @Test
  public void case11() {
    int[] pages = { 9, 45, 40, 27, 24, 38, 39, 19, 83, 30, 42, 34, 16, 59, 5, 31, 78 };
    int number = 3;
    assertEquals(33, littleelephantandbooks.getNumber(pages, number));
  }

  @Test
  public void case12() {
    int[] pages = { 87, 22, 46, 25, 73, 71, 30, 78, 74, 98, 13, 91, 62, 37, 56, 68, 75, 32, 53, 51, 42 };
    int number = 5;
    assertEquals(127, littleelephantandbooks.getNumber(pages, number));
  }

  @Test
  public void case13() {
    int[] pages = { 31, 8, 42 };
    int number = 2;
    assertEquals(50, littleelephantandbooks.getNumber(pages, number));
  }

  @Test
  public void case14() {
    int[] pages = { 58, 88, 54, 84, 46, 10, 59, 22, 89, 23, 47, 7, 31, 14, 69, 1, 92, 63, 56, 11, 60, 25, 38, 49, 96, 42, 3, 51, 37, 75, 21, 97, 100, 85, 82, 35, 19, 39, 28, 68, 29, 94, 8, 18, 15, 17, 36, 52 };
    int number = 15;
    assertEquals(217, littleelephantandbooks.getNumber(pages, number));
  }

  @Test
  public void case15() {
    int[] pages = { 20, 57, 99, 4, 25, 9, 45, 10, 90, 3, 96, 86, 94, 44, 24, 88, 15, 49, 1, 59, 19, 81, 97, 82, 58, 73, 23, 39, 93, 80, 91, 92, 16, 89, 12, 35, 56, 29, 47, 63, 87, 76, 34, 70, 43, 17, 52, 22, 100, 77 };
    int number = 12;
    assertEquals(149, littleelephantandbooks.getNumber(pages, number));
  }

  @Test
  public void case16() {
    int[] pages = { 76, 13, 1, 11, 4, 70, 62, 89, 2, 90, 56, 24, 3, 86, 83, 27, 18, 58, 33, 55, 22, 77, 30, 69, 93, 26, 35, 50, 42, 46, 61, 19, 54, 40, 80, 97, 88, 38, 67, 94, 96, 98, 17, 87, 6, 15, 72, 64, 14, 9 };
    int number = 20;
    assertEquals(332, littleelephantandbooks.getNumber(pages, number));
  }

  @Test
  public void case17() {
    int[] pages = { 14, 57, 22, 59, 47, 83, 82, 45, 97, 23, 30, 62, 36, 51, 74, 67, 60, 93, 40, 54, 25, 55, 11, 46, 50, 87, 75, 69, 19, 88, 6, 92, 3, 26, 78, 15, 35, 73, 34, 71 };
    int number = 39;
    assertEquals(1961, littleelephantandbooks.getNumber(pages, number));
  }

  @Test
  public void case18() {
    int[] pages = { 19, 78, 74, 71, 64, 69, 93, 86, 3, 81, 14, 28, 100, 26, 44, 25, 24, 73, 62, 82, 4, 33, 6, 94, 32, 43, 23, 87, 65, 1, 88, 61, 75, 36 };
    int number = 12;
    assertEquals(206, littleelephantandbooks.getNumber(pages, number));
  }

  @Test
  public void case19() {
    int[] pages = { 61, 97, 68, 86, 51, 41, 95, 96, 25, 20, 26, 77, 59, 3, 72, 67, 79, 94, 52, 85, 19, 65, 53, 1, 88, 27, 11, 58 };
    int number = 14;
    assertEquals(448, littleelephantandbooks.getNumber(pages, number));
  }

  @Test
  public void case20() {
    int[] pages = { 77, 28, 44, 59, 65, 10, 83, 87, 66, 88, 78, 75, 26, 30, 29, 24, 21, 3, 63, 97, 38, 62, 96, 61, 17, 31, 27, 12, 72, 48, 54, 91, 25, 89 };
    int number = 17;
    assertEquals(472, littleelephantandbooks.getNumber(pages, number));
  }

  @Test
  public void case21() {
    int[] pages = { 52, 63, 30, 1, 14, 59, 79, 66, 8, 78, 40, 4, 61, 58, 25, 9, 88, 2, 51, 29, 94, 85, 6, 41, 12 };
    int number = 1;
    assertEquals(2, littleelephantandbooks.getNumber(pages, number));
  }

  @Test
  public void case22() {
    int[] pages = { 57, 73, 51, 24, 86, 17, 27, 58, 38, 72, 70, 62, 97, 23, 18, 13, 42, 30, 66, 60, 33, 56, 54, 63, 85, 35, 55, 64, 8, 84, 12, 36, 68, 49, 76, 39, 43, 26, 22, 71, 6, 99 };
    int number = 17;
    assertEquals(410, littleelephantandbooks.getNumber(pages, number));
  }

  @Test
  public void case23() {
    int[] pages = { 94, 35, 38, 57, 77, 6, 63, 49, 82, 1, 14, 42, 56, 43, 12, 78, 25, 79, 53, 44, 97, 74, 41, 76, 73, 19, 11, 18 };
    int number = 2;
    assertEquals(12, littleelephantandbooks.getNumber(pages, number));
  }

  @Test
  public void case24() {
    int[] pages = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    int number = 30;
    assertEquals(466, littleelephantandbooks.getNumber(pages, number));
  }

  @Test
  public void case25() {
    int[] pages = { 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
    int number = 47;
    assertEquals(1129, littleelephantandbooks.getNumber(pages, number));
  }

  @Test
  public void case26() {
    int[] pages = { 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96 };
    int number = 30;
    assertEquals(1846, littleelephantandbooks.getNumber(pages, number));
  }

  @Test
  public void case27() {
    int[] pages = { 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 };
    int number = 25;
    assertEquals(1576, littleelephantandbooks.getNumber(pages, number));
  }

  @Test
  public void case28() {
    int[] pages = { 100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90, 89, 88, 87, 86, 85, 84, 83, 82, 81, 80, 79, 78, 77, 76, 75, 74, 73, 72, 71, 70, 69, 68, 67, 66, 65, 64, 63, 62, 61, 60, 59, 58, 57, 56, 55, 54, 53, 52, 51 };
    int number = 49;
    assertEquals(3676, littleelephantandbooks.getNumber(pages, number));
  }

  @Test
  public void case29() {
    int[] pages = { 100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90, 89, 88, 87, 86, 85, 84, 83, 82, 81, 80, 79, 78, 77, 76, 75, 74, 73, 72, 71, 70, 69, 68, 67, 66, 65, 64, 63, 62, 61, 60, 59, 58, 57, 56, 55, 54, 53, 52, 51 };
    int number = 49;
    assertEquals(3676, littleelephantandbooks.getNumber(pages, number));
  }

  @Test
  public void case30() {
    int[] pages = { 100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90, 89, 88, 87, 86, 85, 84, 83, 82, 81, 80, 79, 78, 77, 76, 75, 74, 73, 72, 71, 70, 69, 68, 67, 66, 65, 64, 63, 62, 61, 60, 59, 58, 57, 56, 55, 54, 53, 52, 51 };
    int number = 1;
    assertEquals(52, littleelephantandbooks.getNumber(pages, number));
  }

  @Test
  public void case31() {
    int[] pages = { 74, 86, 32, 13, 100, 67, 77 };
    int number = 2;
    assertEquals(80, littleelephantandbooks.getNumber(pages, number));
  }

  @Test
  public void case32() {
    int[] pages = { 3, 1, 9, 7, 2, 8, 6, 4, 5 };
    int number = 7;
    assertEquals(29, littleelephantandbooks.getNumber(pages, number));
  }

  @Test
  public void case33() {
    int[] pages = { 1, 20, 21, 22, 23, 24, 25 };
    int number = 4;
    assertEquals(65, littleelephantandbooks.getNumber(pages, number));
  }

  @Test
  public void case34() {
    int[] pages = { 74, 7, 4, 47, 44 };
    int number = 3;
    assertEquals(58, littleelephantandbooks.getNumber(pages, number));
  }

  @Test
  public void case35() {
    int[] pages = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 20, 31, 32 };
    int number = 12;
    assertEquals(88, littleelephantandbooks.getNumber(pages, number));
  }

  @Test
  public void case36() {
    int[] pages = { 1, 2, 3, 4 };
    int number = 3;
    assertEquals(7, littleelephantandbooks.getNumber(pages, number));
  }

  @Test
  public void case37() {
    int[] pages = { 1, 2, 3 };
    int number = 2;
    assertEquals(4, littleelephantandbooks.getNumber(pages, number));
  }

  @Test
  public void case38() {
    int[] pages = { 2, 4, 5, 6 };
    int number = 2;
    assertEquals(7, littleelephantandbooks.getNumber(pages, number));
  }

}
