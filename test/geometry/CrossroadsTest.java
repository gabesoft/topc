package topc.test.geometry;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.geometry.*;

public class CrossroadsTest {
  Crossroads crossroads = new Crossroads();

  @Test
  public void case1() {
    int[] angles = { 105, 75, 25, 120, 35, 75 };
    assertArrayEquals(new int[] { 0, 1, 5 }, crossroads.getOut(angles));
  }

  @Test
  public void case2() {
    int[] angles = { 1, 1, 1, 1, 1, 1 };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5 }, crossroads.getOut(angles));
  }

  @Test
  public void case3() {
    int[] angles = { 13 };
    assertArrayEquals(new int[] { 0 }, crossroads.getOut(angles));
  }

  @Test
  public void case4() {
    int[] angles = { 90, 123, 1, 23, 132, 11, 28, 179, 179, 77, 113, 91 };
    assertArrayEquals(new int[] { 0 }, crossroads.getOut(angles));
  }

  @Test
  public void case5() {
    int[] angles = { 179, 89, 90, 91, 1 };
    assertArrayEquals(new int[] { 0, 2, 4 }, crossroads.getOut(angles));
  }

  @Test
  public void case6() {
    int[] angles = { 89, 91 };
    assertArrayEquals(new int[] { 0 }, crossroads.getOut(angles));
  }

  @Test
  public void case7() {
    int[] angles = { 179, 178, 101, 91, 90, 89, 1 };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 6 }, crossroads.getOut(angles));
  }

  @Test
  public void case8() {
    int[] angles = { 38, 140, 152, 179, 110, 71, 48, 54, 151, 5, 68, 17, 122, 11, 2, 165, 50, 49, 106, 124, 150, 131, 87, 37, 134, 84, 83, 170, 20, 108, 69, 132, 103, 65, 28, 41, 77, 144, 93, 178, 135, 62, 31, 118 };
    assertArrayEquals(new int[] { 1, 4, 18, 22, 41 }, crossroads.getOut(angles));
  }

  @Test
  public void case9() {
    int[] angles = { 12, 126, 91, 27, 171, 26, 163, 125, 55, 77, 13, 174, 123, 28, 158, 148, 105, 35, 32, 147, 86, 132, 73, 51, 102, 136 };
    assertArrayEquals(new int[] { 1, 2, 20 }, crossroads.getOut(angles));
  }

  @Test
  public void case10() {
    int[] angles = { 86, 23, 66, 150, 7, 93, 119, 77, 19, 170, 165, 99, 62, 85, 68, 152, 57, 82, 49, 177, 54, 133, 102, 36, 137, 151, 72, 90, 160, 5, 179, 103, 10, 96, 35, 113, 118 };
    assertArrayEquals(new int[] { 5, 27 }, crossroads.getOut(angles));
  }

  @Test
  public void case11() {
    int[] angles = { 151, 23, 20, 134, 57, 169, 52, 61, 26, 132, 150 };
    assertArrayEquals(new int[] { 0, 3, 7 }, crossroads.getOut(angles));
  }

  @Test
  public void case12() {
    int[] angles = { 108, 134, 46, 26, 1, 11, 145, 153, 38, 21, 100, 3, 82, 135, 123, 98, 14, 79, 37, 125, 52, 42, 104, 96, 113, 29, 91, 173, 166, 35, 61, 32, 179, 18, 112, 17 };
    assertArrayEquals(new int[] { 0, 10, 23, 26, 35 }, crossroads.getOut(angles));
  }

  @Test
  public void case13() {
    int[] angles = { 167, 9, 161, 52, 41, 138, 74, 37, 113, 109, 81, 84, 108, 114, 154, 149, 112, 130, 102, 68, 33, 133, 100 };
    assertArrayEquals(new int[] { 0, 2, 11 }, crossroads.getOut(angles));
  }

  @Test
  public void case14() {
    int[] angles = { 44, 34, 109, 126, 105, 63, 89, 15, 133, 110, 112, 124, 145, 27, 104, 156, 164, 111, 131, 8, 120, 175, 57, 102, 55, 32, 20, 153, 134, 28, 59, 14, 115, 147, 98, 81, 74, 54, 84, 90, 58, 149, 172, 157, 130, 170 };
    assertArrayEquals(new int[] { 2, 4, 39, 40 }, crossroads.getOut(angles));
  }

  @Test
  public void case15() {
    int[] angles = { 12, 141, 94, 110, 172, 13, 157, 118 };
    assertArrayEquals(new int[] { 1, 2 }, crossroads.getOut(angles));
  }

  @Test
  public void case16() {
    int[] angles = { 19, 91, 41, 52, 165, 99, 119, 21, 89, 68, 143, 92, 69, 124, 96, 109, 71 };
    assertArrayEquals(new int[] { 1, 8, 16 }, crossroads.getOut(angles));
  }

  @Test
  public void case17() {
    int[] angles = { 127, 19 };
    assertArrayEquals(new int[] { 0, 1 }, crossroads.getOut(angles));
  }

  @Test
  public void case18() {
    int[] angles = { 155, 89, 134, 69, 141, 99, 64, 172, 113, 32, 68, 24, 171, 110, 5, 60, 11, 115, 152, 107, 130, 153, 3, 23, 127, 111, 39, 12, 31, 112, 62, 58 };
    assertArrayEquals(new int[] { 0, 1, 30, 31 }, crossroads.getOut(angles));
  }

  @Test
  public void case19() {
    int[] angles = { 119, 144, 145, 95, 110, 143, 162, 26, 113, 73, 46, 25, 154, 12, 77, 103, 55, 99, 41, 56 };
    assertArrayEquals(new int[] { 0, 3, 19 }, crossroads.getOut(angles));
  }

  @Test
  public void case20() {
    int[] angles = { 145, 25, 51, 142, 161, 134, 111 };
    assertArrayEquals(new int[] { 0, 6 }, crossroads.getOut(angles));
  }

  @Test
  public void case21() {
    int[] angles = { 154, 41, 155, 42, 45, 98, 177, 10, 15, 94, 77, 17, 47, 160, 27, 23, 167, 9, 11 };
    assertArrayEquals(new int[] { 0, 5, 9, 10, 12, 14, 15, 18 }, crossroads.getOut(angles));
  }

  @Test
  public void case22() {
    int[] angles = { 164, 72, 78, 170, 150, 96, 151, 125, 47, 1, 95, 171, 44, 105, 46, 123, 160, 2 };
    assertArrayEquals(new int[] { 0, 5, 10, 17 }, crossroads.getOut(angles));
  }

  @Test
  public void case23() {
    int[] angles = { 108, 141, 104, 26, 40, 69, 1, 75, 15, 119, 154, 12, 146, 124, 144, 95, 123, 131, 140, 6, 156, 116, 127, 16, 99, 170, 11, 50, 176, 112, 53, 166, 66, 125, 28, 44, 94, 162, 20, 80, 31, 175, 139, 38, 82, 135, 21, 73 };
    assertArrayEquals(new int[] { 0, 2, 15, 36, 44, 47 }, crossroads.getOut(angles));
  }

  @Test
  public void case24() {
    int[] angles = { 178, 7, 46, 34, 45, 28, 112, 159, 169, 36, 140, 116, 118, 163, 82, 165, 119 };
    assertArrayEquals(new int[] { 0, 6, 14 }, crossroads.getOut(angles));
  }

  @Test
  public void case25() {
    int[] angles = { 114, 102, 76, 169, 97, 104, 46, 72, 63 };
    assertArrayEquals(new int[] { 0, 1, 4, 7, 8 }, crossroads.getOut(angles));
  }

  @Test
  public void case26() {
    int[] angles = { 143, 36, 13 };
    assertArrayEquals(new int[] { 0, 1, 2 }, crossroads.getOut(angles));
  }

  @Test
  public void case27() {
    int[] angles = { 106, 13, 36, 28, 116, 82, 109, 125, 80, 123, 72, 150, 107, 171, 157, 71, 177, 34, 161, 103, 113 };
    assertArrayEquals(new int[] { 0, 5, 8 }, crossroads.getOut(angles));
  }

  @Test
  public void case28() {
    int[] angles = { 9, 52, 47, 73, 161, 128, 131, 71, 72, 162, 56, 70, 103, 64, 132, 134, 133, 25, 36, 49, 122, 164, 66, 93, 20, 163, 37, 118, 79, 124, 17, 15, 14, 5, 125, 26 };
    assertArrayEquals(new int[] { 12, 23, 28, 35 }, crossroads.getOut(angles));
  }

  @Test
  public void case29() {
    int[] angles = { 13, 121, 130, 36, 125, 111, 118, 98, 18, 9, 175, 84, 174, 131, 96, 122, 67, 70, 145, 31, 11 };
    assertArrayEquals(new int[] { 1, 5, 7, 11, 17, 19, 20 }, crossroads.getOut(angles));
  }

  @Test
  public void case30() {
    int[] angles = { 141, 39, 58, 87, 2, 79, 91, 109, 136, 72, 63, 151, 169, 112, 179, 10, 101 };
    assertArrayEquals(new int[] { 0, 6 }, crossroads.getOut(angles));
  }

  @Test
  public void case31() {
    int[] angles = { 70, 55, 51, 5, 110, 71, 4, 6, 82, 154, 168, 72, 131, 145, 157, 105, 107, 15, 143, 83, 106, 102, 147, 121, 62, 2, 48, 42, 139, 67, 156, 21, 130, 113, 161, 33, 96, 162, 140, 173, 36, 171, 152, 160 };
    assertArrayEquals(new int[] { 36, 40 }, crossroads.getOut(angles));
  }

  @Test
  public void case32() {
    int[] angles = { 34, 111, 48, 45, 132, 142, 31, 128, 87, 15, 145, 154, 23, 56, 103, 85, 137, 35, 131, 179, 3, 116, 124, 32, 13, 50, 122, 151, 100, 67, 140, 42 };
    assertArrayEquals(new int[] { 1, 8, 15, 29, 31 }, crossroads.getOut(angles));
  }

  @Test
  public void case33() {
    int[] angles = { 42, 37, 174, 51, 5, 138, 28, 9, 2, 63, 116, 62, 75, 17, 98, 126, 61, 118, 157, 96, 103, 10, 84, 47, 77, 155, 88, 16, 102, 128, 140, 153, 53 };
    assertArrayEquals(new int[] { 10, 14, 19, 26, 32 }, crossroads.getOut(angles));
  }

  @Test
  public void case34() {
    int[] angles = { 116, 134, 149, 138, 157, 163, 164, 94, 79, 20, 64, 148, 77, 31, 1, 118, 139, 12, 17, 70, 123, 145, 28, 26, 9, 62, 4, 176, 10, 115, 78, 44, 71, 141, 5, 25, 114, 99, 177, 83, 39, 54, 87, 109 };
    assertArrayEquals(new int[] { 0, 7, 42 }, crossroads.getOut(angles));
  }

  @Test
  public void case35() {
    int[] angles = { 177, 136, 28, 82, 128, 179, 139 };
    assertArrayEquals(new int[] { 0, 1, 3 }, crossroads.getOut(angles));
  }

  @Test
  public void case36() {
    int[] angles = { 112, 170, 124, 52, 102, 99, 128, 45, 98, 89, 171, 120, 138, 80, 144, 134, 178, 37, 113, 163, 106, 165, 91, 88, 81, 160, 169, 33, 46, 131, 8, 115, 7 };
    assertArrayEquals(new int[] { 0, 4, 5, 8, 9, 23, 24, 32 }, crossroads.getOut(angles));
  }

  @Test
  public void case37() {
    int[] angles = { 98, 80, 11, 179, 23, 108, 10, 31, 119, 60, 57, 118, 74, 77, 40, 122, 30, 90, 91, 144, 78, 1, 61, 68, 24, 149, 132, 160, 116 };
    assertArrayEquals(new int[] { 0, 17, 20, 23 }, crossroads.getOut(angles));
  }

  @Test
  public void case38() {
    int[] angles = { 93, 132, 172, 84, 66, 21, 162, 148, 82, 20, 156, 137, 8, 75, 168, 13, 30, 38, 106, 22, 111, 104, 124, 131, 164, 120, 54, 145, 68, 179, 139, 37, 31 };
    assertArrayEquals(new int[] { 0, 3, 8, 28, 31, 32 }, crossroads.getOut(angles));
  }

  @Test
  public void case39() {
    int[] angles = { 33, 105, 36, 172, 35, 69, 55, 22, 9, 139, 137, 158, 1, 81, 77, 144, 83, 89, 135, 43, 101 };
    assertArrayEquals(new int[] { 1, 17 }, crossroads.getOut(angles));
  }

  @Test
  public void case40() {
    int[] angles = { 166, 161, 154, 11, 88, 114 };
    assertArrayEquals(new int[] { 0, 1, 2, 4 }, crossroads.getOut(angles));
  }

  @Test
  public void case41() {
    int[] angles = { 136, 46, 163, 142, 36, 99, 10, 94, 127, 5, 132, 100, 164, 157, 143, 55, 71, 87, 117, 1, 138, 40, 28, 11, 121, 6, 62, 125, 79, 176, 114, 53, 86, 15, 19, 26, 165, 56 };
    assertArrayEquals(new int[] { 0, 5, 7, 17, 32, 37 }, crossroads.getOut(angles));
  }

  @Test
  public void case42() {
    int[] angles = { 146, 9, 43, 161, 46, 49, 38, 42, 152, 157, 159, 110, 8, 32, 33, 64, 81, 34, 112, 98 };
    assertArrayEquals(new int[] { 0, 11, 19 }, crossroads.getOut(angles));
  }

  @Test
  public void case43() {
    int[] angles = { 94, 131, 179, 174, 156, 151, 27, 68, 51, 31, 175, 133, 129, 6, 116, 146, 132, 147, 23, 117, 164, 160, 139, 81, 2, 41, 75, 29, 165, 90, 44, 136, 163, 39, 100, 145, 153, 60, 97, 178, 67, 66, 7, 101, 72, 22 };
    assertArrayEquals(new int[] { 0, 29, 44, 45 }, crossroads.getOut(angles));
  }

  @Test
  public void case44() {
    int[] angles = { 161, 37, 169, 23, 153, 80, 40, 114, 101, 112, 76, 3, 155, 26, 48, 53, 123 };
    assertArrayEquals(new int[] { 0, 5, 10 }, crossroads.getOut(angles));
  }

  @Test
  public void case45() {
    int[] angles = { 172, 109, 142, 76, 147, 133, 25, 93, 4, 2, 134, 60, 162, 83, 138, 10, 113, 5, 123, 174, 90, 127, 48, 148, 116, 107, 152, 63, 3 };
    assertArrayEquals(new int[] { 0, 1, 7, 20, 27, 28 }, crossroads.getOut(angles));
  }

  @Test
  public void case46() {
    int[] angles = { 113, 73, 69, 5, 52, 107, 159, 78, 167, 96, 2, 175, 155, 79, 126, 60, 108, 90, 101, 7, 68, 42, 168, 154, 173 };
    assertArrayEquals(new int[] { 0, 9, 17, 20, 21 }, crossroads.getOut(angles));
  }

  @Test
  public void case47() {
    int[] angles = { 105, 14, 73, 55, 90, 15, 157, 140, 168, 106, 39, 51, 101, 45, 54, 131, 156, 42, 35, 81, 160, 103, 6, 179, 11, 111, 47, 31, 21, 89, 172 };
    assertArrayEquals(new int[] { 0, 4, 29 }, crossroads.getOut(angles));
  }

  @Test
  public void case48() {
    int[] angles = { 15, 61, 51, 93 };
    assertArrayEquals(new int[] { 3 }, crossroads.getOut(angles));
  }

  @Test
  public void case49() {
    int[] angles = { 74, 166, 108, 53, 86, 72, 171, 99, 150, 143, 144, 107, 156, 57, 169, 48, 129, 23, 139, 85, 32, 5, 8, 82, 155, 25 };
    assertArrayEquals(new int[] { 4, 19, 23, 25 }, crossroads.getOut(angles));
  }

  @Test
  public void case50() {
    int[] angles = { 39, 147 };
    assertArrayEquals(new int[] { 0 }, crossroads.getOut(angles));
  }

  @Test
  public void case51() {
    int[] angles = { 140, 118, 54, 166, 151, 44, 90, 5, 14, 6, 64, 129, 74, 33, 134, 25, 11, 95, 65, 145, 29, 162, 24, 147, 45, 103, 63, 97, 120, 156, 167, 170, 19, 28, 100, 144, 161, 13, 157, 148 };
    assertArrayEquals(new int[] { 0, 1, 6 }, crossroads.getOut(angles));
  }

  @Test
  public void case52() {
    int[] angles = { 121, 81, 51, 171, 176, 131, 107, 49, 24, 36, 108, 88, 64, 42, 86, 124, 170, 43, 92, 161, 87, 59, 97, 103, 61, 63, 31, 52 };
    assertArrayEquals(new int[] { 0, 11, 20, 25, 27 }, crossroads.getOut(angles));
  }

  @Test
  public void case53() {
    int[] angles = { 166, 133, 145, 117, 123, 49, 138, 12, 130, 154, 62, 8 };
    assertArrayEquals(new int[] { 0, 1, 3, 10, 11 }, crossroads.getOut(angles));
  }

  @Test
  public void case54() {
    int[] angles = { 4, 151, 111, 97, 109, 102, 140, 115, 125, 137, 156, 29, 76, 141, 79, 8, 91, 49, 13, 44, 176, 66, 172, 155, 61 };
    assertArrayEquals(new int[] { 1, 2, 3, 16, 21, 24 }, crossroads.getOut(angles));
  }

  @Test
  public void case55() {
    int[] angles = { 52, 10, 178, 31, 13, 40, 54, 141, 117, 15, 48, 25, 39 };
    assertArrayEquals(new int[] { 8, 10, 12 }, crossroads.getOut(angles));
  }

  @Test
  public void case56() {
    int[] angles = { 140, 118, 54, 166, 151, 44, 90, 5, 14, 6, 64, 129, 74, 33, 134, 25, 11, 95, 65, 145, 29, 162, 24, 147, 45, 103, 63, 97, 120, 156, 167, 170, 19, 28, 100, 144, 161, 13, 157, 148 };
    assertArrayEquals(new int[] { 0, 1, 6 }, crossroads.getOut(angles));
  }

}
