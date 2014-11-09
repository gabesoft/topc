package topc.test.sorting;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.sorting.*;

public class ChessMatchupTest {
  ChessMatchup chessmatchup = new ChessMatchup();

  @Test
  public void case1() {
    int[] us = { 5, 8 };
    int[] them = { 7, 3 };
    assertEquals(4, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case2() {
    int[] us = { 7, 3 };
    int[] them = { 5, 8 };
    assertEquals(2, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case3() {
    int[] us = { 10, 5, 1 };
    int[] them = { 10, 5, 1 };
    assertEquals(4, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case4() {
    int[] us = { 1, 10, 7, 4 };
    int[] them = { 15, 3, 8, 7 };
    assertEquals(5, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case5() {
    int[] us = { 1 };
    int[] them = { 1 };
    assertEquals(1, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case6() {
    int[] us = { 1 };
    int[] them = { 2 };
    assertEquals(0, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case7() {
    int[] us = { 2 };
    int[] them = { 1 };
    assertEquals(2, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case8() {
    int[] us = { 4, 7 };
    int[] them = { 4, 6 };
    assertEquals(3, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case9() {
    int[] us = { 4, 6 };
    int[] them = { 4, 7 };
    assertEquals(2, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case10() {
    int[] us = { 5, 9 };
    int[] them = { 4, 9 };
    assertEquals(3, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case11() {
    int[] us = { 4, 9 };
    int[] them = { 5, 9 };
    assertEquals(2, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case12() {
    int[] us = { 6, 6 };
    int[] them = { 5, 6 };
    assertEquals(3, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case13() {
    int[] us = { 5, 6 };
    int[] them = { 6, 6 };
    assertEquals(1, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case14() {
    int[] us = { 6, 6 };
    int[] them = { 5, 7 };
    assertEquals(2, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case15() {
    int[] us = { 5, 7 };
    int[] them = { 6, 6 };
    assertEquals(2, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case16() {
    int[] us = { 6, 6 };
    int[] them = { 7, 8 };
    assertEquals(0, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case17() {
    int[] us = { 7, 8 };
    int[] them = { 6, 6 };
    assertEquals(4, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case18() {
    int[] us = { 6, 6 };
    int[] them = { 1, 2 };
    assertEquals(4, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case19() {
    int[] us = { 1, 2 };
    int[] them = { 6, 6 };
    assertEquals(0, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case20() {
    int[] us = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int[] them = { 5, 5, 5, 5, 5, 5, 5, 5, 5 };
    assertEquals(9, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case21() {
    int[] us = { 5, 5, 5, 5, 5, 5, 5, 5, 5 };
    int[] them = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    assertEquals(9, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case22() {
    int[] us = { 1, 2, 3, 4, 5, 6, 7, 8 };
    int[] them = { 3, 3, 4, 4, 5, 5, 6, 6 };
    assertEquals(11, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case23() {
    int[] us = { 3, 3, 4, 4, 5, 5, 6, 6 };
    int[] them = { 1, 2, 3, 4, 5, 6, 7, 8 };
    assertEquals(11, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case24() {
    int[] us = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6 };
    int[] them = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6 };
    assertEquals(20, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case25() {
    int[] us = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
    int[] them = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
    assertEquals(50, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case26() {
    int[] us = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
    int[] them = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(100, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case27() {
    int[] us = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int[] them = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
    assertEquals(0, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case28() {
    int[] us = { 31, 54, 78, 89, 55, 18, 87, 49, 55, 19, 2, 32, 71, 76, 89, 5, 8, 68, 49, 5, 25, 24, 74, 38, 29, 13, 83, 83, 83, 23, 16, 47, 12, 2, 43, 77, 67, 49, 60, 50, 48, 26, 81, 23, 30, 97, 29, 40, 11, 96 };
    int[] them = { 66, 43, 63, 11, 18, 13, 7, 80, 2, 41, 63, 93, 85, 92, 19, 25, 25, 6, 15, 21, 44, 36, 57, 58, 91, 81, 28, 16, 9, 49, 58, 57, 7, 47, 42, 9, 92, 26, 39, 48, 82, 61, 30, 64, 22, 48, 71, 52, 69, 87 };
    assertEquals(94, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case29() {
    int[] us = { 1, 2, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 1, 2, 2, 1, 1, 2, 2, 1, 2, 1, 2, 2, 1, 2, 1, 1, 1, 1, 2, 2, 2, 1, 1, 1, 1, 2, 2, 2, 2, 2, 1, 2, 1, 2, 2, 1, 1, 1 };
    int[] them = { 2, 2, 2, 1, 1, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1, 2, 2, 1, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 2, 1 };
    assertEquals(42, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case30() {
    int[] us = { 83, 91, 100, 5, 31, 58, 6, 54, 89, 91, 11, 22, 62, 41, 70, 11, 56, 64, 46, 40, 83, 70, 92, 85, 87, 85, 10, 86, 54, 4, 15, 19, 47, 15, 20, 75, 64, 98, 41, 34, 89, 26, 1, 59, 1, 32, 85, 48, 41, 94 };
    int[] them = { 162, 192, 156, 155, 171, 189, 152, 135, 191, 129, 104, 111, 144, 166, 149, 185, 192, 112, 195, 132, 111, 108, 157, 101, 128, 181, 119, 174, 161, 146, 141, 119, 125, 101, 145, 108, 109, 111, 175, 121, 191, 190, 137, 184, 170, 123, 135, 129, 122, 149 };
    assertEquals(0, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case31() {
    int[] us = { 146, 121, 187, 113, 138, 117, 175, 115, 197, 163, 189, 102, 126, 189, 134, 147, 103, 138, 115, 139, 179, 129, 194, 108, 195, 150, 156, 164, 141, 124, 103, 151, 173, 142, 128, 153, 165, 123, 180, 139, 102, 181, 129, 139, 197, 194, 169, 128, 145, 171 };
    int[] them = { 51, 83, 41, 27, 52, 51, 60, 38, 83, 87, 39, 55, 46, 66, 87, 60, 23, 7, 69, 91, 3, 8, 41, 7, 55, 19, 39, 16, 54, 20, 50, 42, 25, 25, 40, 18, 38, 70, 46, 53, 54, 69, 72, 54, 18, 77, 25, 97, 32, 27 };
    assertEquals(100, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case32() {
    int[] us = { 1000, 10, 993, 9, 8, 7, 993, 1, 1, 1, 2, 989, 12, 23, 54, 2, 46, 464, 346, 8, 6, 787, 343, 667, 97, 56, 867, 5, 98, 1, 345, 3, 4, 56, 325, 756, 672, 834, 741, 23, 6, 4, 737, 644, 34, 32, 75, 57, 222, 44 };
    int[] them = { 1000, 10, 994, 8, 8, 993, 8, 1, 2, 1, 1, 988, 23, 456, 74, 47, 457, 856, 325, 8, 47, 97, 32, 64, 86, 9, 7, 87, 7, 879, 9, 34, 23, 43, 54, 675, 345, 335, 57, 57, 346, 46, 325, 35, 665, 12, 1, 43, 765, 7 };
    assertEquals(85, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case33() {
    int[] us = { 1, 1, 1, 1, 1, 1, 10, 10, 10 };
    int[] them = { 5, 5, 5, 5, 30, 30, 30, 30, 30 };
    assertEquals(6, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case34() {
    int[] us = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 19, 19, 20, 20, 21, 21, 22, 22, 2, 3, 23, 24, 24, 25 };
    int[] them = { 3, 10, 25, 8, 22, 2, 6, 5, 10, 8, 17, 11, 11, 25, 24, 6, 18, 9, 7, 4, 25, 1, 15, 10, 11, 20, 10, 12, 6, 12, 21, 10, 23, 20, 17, 20, 23, 23, 24, 8, 7, 17, 20, 19, 17, 21, 24, 11, 4, 5 };
    assertEquals(84, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case35() {
    int[] us = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int[] them = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    assertEquals(90, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case36() {
    int[] us = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    int[] them = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    assertEquals(98, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case37() {
    int[] us = { 42, 468, 335, 501, 170, 725, 479, 359, 963, 465, 706, 146, 282, 828, 962, 492, 996, 943, 828, 437, 392, 605, 903, 154, 293, 383, 422, 717, 719, 896, 448, 727, 772, 539, 870, 913, 668, 300, 36, 895, 704, 812, 323, 334, 674, 665, 142, 712, 254, 869 };
    int[] them = { 548, 645, 663, 758, 38, 860, 724, 742, 530, 779, 317, 36, 191, 843, 289, 107, 41, 943, 265, 649, 447, 806, 891, 730, 371, 351, 7, 102, 394, 549, 630, 624, 85, 955, 757, 841, 967, 377, 932, 309, 945, 440, 627, 324, 538, 539, 119, 83, 930, 542 };
    assertEquals(94, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case38() {
    int[] us = { 10, 8, 10 };
    int[] them = { 9, 7, 10 };
    assertEquals(5, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case39() {
    int[] us = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7 };
    int[] them = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7 };
    assertEquals(76, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case40() {
    int[] us = { 655, 623, 956, 539, 359, 666, 637, 69, 496, 979, 620, 659, 158, 120, 142, 706, 860, 231, 900, 520, 259, 790, 324, 625, 944, 527, 927, 796, 843, 523, 681, 250, 734, 954, 715, 817, 628, 463, 898, 333, 315, 399, 395, 845, 423, 166, 943, 93, 491, 484 };
    int[] them = { 965, 58, 604, 794, 653, 833, 101, 437, 327, 619, 78, 825, 26, 78, 232, 436, 222, 666, 342, 652, 808, 591, 336, 65, 677, 578, 855, 685, 396, 714, 646, 864, 148, 962, 305, 761, 812, 589, 293, 387, 752, 727, 366, 39, 805, 486, 916, 352, 616, 61 };
    assertEquals(98, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case41() {
    int[] us = { 860, 860, 860, 463, 281, 586, 636, 540, 103, 573, 893, 890, 639, 45, 320, 23, 667, 305, 556, 775, 716, 630, 529, 1000, 173, 741, 174, 276, 6, 51, 724, 763, 291, 663, 401, 334, 250, 511, 710, 373, 696, 467, 449, 265, 317, 432, 92, 955, 707, 14 };
    int[] them = { 860, 860, 860, 643, 251, 874, 705, 190, 310, 9, 539, 285, 408, 615, 861, 951, 413, 319, 368, 714, 264, 688, 670, 271, 317, 43, 639, 353, 792, 872, 240, 770, 348, 2, 687, 325, 253, 750, 464, 509, 543, 704, 963, 989, 4, 998, 148, 198, 698, 899 };
    assertEquals(87, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case42() {
    int[] us = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int[] them = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(50, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case43() {
    int[] us = { 5, 1, 4, 3, 2, 10, 6, 9, 7, 8 };
    int[] them = { 10, 6, 2, 8, 7, 1, 4, 5, 3, 9 };
    assertEquals(18, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case44() {
    int[] us = { 49, 28, 70, 84, 88, 24, 6, 7, 52, 73, 87, 71, 39, 76, 6, 74, 43, 5, 71, 2, 36, 44, 45, 12, 79, 26, 83, 27, 20, 92, 31, 74, 73, 35, 96, 6, 73, 14, 41, 97, 74, 47, 3, 92, 35, 62, 27, 53, 43, 69 };
    int[] them = { 17, 89, 34, 62, 86, 98, 8, 92, 51, 86, 87, 58, 73, 58, 74, 11, 8, 75, 26, 74, 34, 97, 88, 42, 84, 35, 98, 22, 72, 20, 9, 53, 77, 76, 90, 79, 57, 81, 76, 22, 58, 99, 91, 83, 22, 36, 28, 34, 92, 29 };
    assertEquals(76, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case45() {
    int[] us = { 1, 2, 3 };
    int[] them = { 2, 1, 3 };
    assertEquals(4, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case46() {
    int[] us = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 };
    int[] them = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 };
    assertEquals(78, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case47() {
    int[] us = { 2, 3, 4, 7 };
    int[] them = { 2, 3, 4, 6 };
    assertEquals(6, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case48() {
    int[] us = { 5, 4, 3, 2, 1 };
    int[] them = { 6, 5, 4, 3, 2 };
    assertEquals(6, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case49() {
    int[] us = { 38, 89, 20, 64, 24 };
    int[] them = { 93, 50, 74, 47, 89 };
    assertEquals(4, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case50() {
    int[] us = { 2, 2, 2 };
    int[] them = { 1, 1, 1 };
    assertEquals(6, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case51() {
    int[] us = { 1, 10, 9 };
    int[] them = { 1, 8, 20 };
    assertEquals(4, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case52() {
    int[] us = { 11, 2, 4, 10, 14, 4, 3, 3, 7, 14, 5, 5, 1, 12, 1, 11, 10, 2, 12, 6, 6, 9, 2, 3, 7, 7, 6, 11, 8, 5, 2, 6, 11, 3, 9, 7, 2, 4, 10, 9, 8, 6, 2, 3, 3, 14, 6, 1, 8, 13 };
    int[] them = { 2, 14, 7, 12, 12, 4, 8, 6, 4, 13, 1, 5, 5, 12, 3, 1, 10, 2, 4, 13, 11, 1, 5, 9, 10, 5, 6, 6, 3, 8, 9, 8, 9, 4, 6, 5, 1, 11, 11, 13, 9, 9, 11, 13, 2, 13, 8, 12, 9, 11 };
    assertEquals(79, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case53() {
    int[] us = { 1, 1, 2, 2 };
    int[] them = { 1, 1, 3, 3 };
    assertEquals(4, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case54() {
    int[] us = { 1, 2, 3, 4, 5 };
    int[] them = { 6, 7, 8, 9, 10 };
    assertEquals(0, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case55() {
    int[] us = { 1, 1, 1, 1 };
    int[] them = { 1, 1, 1, 1 };
    assertEquals(4, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case56() {
    int[] us = { 16, 15, 19, 14, 18, 22, 13, 18, 13, 20, 18, 16, 15, 18, 20, 21, 22, 21, 17, 22, 13, 16, 19, 18, 20, 16, 16, 15, 20, 22, 19, 13, 13, 19, 13, 13, 15, 13, 21, 19, 20, 21, 15, 21, 21, 19, 14, 13, 13, 21 };
    int[] them = { 22, 20, 16, 13, 15, 21, 19, 16, 19, 21, 16, 20, 15, 15, 18, 14, 14, 18, 21, 17, 16, 18, 19, 21, 19, 19, 21, 19, 14, 17, 20, 20, 14, 13, 22, 17, 22, 19, 17, 17, 19, 14, 15, 21, 20, 16, 21, 18, 17, 21 };
    assertEquals(79, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case57() {
    int[] us = { 5, 4, 2, 1 };
    int[] them = { 5, 3, 2, 1 };
    assertEquals(6, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case58() {
    int[] us = { 19, 20, 21 };
    int[] them = { 19, 20, 21 };
    assertEquals(4, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case59() {
    int[] us = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int[] them = { 11, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(49, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case60() {
    int[] us = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
    int[] them = { 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
    assertEquals(19, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case61() {
    int[] us = { 1, 2, 3 };
    int[] them = { 1, 2, 3 };
    assertEquals(4, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case62() {
    int[] us = { 1, 34, 235, 23, 34, 23, 5, 235, 23, 235, 23, 5, 23, 23, 23, 3, 235, 25, 23, 235, 532, 23, 353, 23, 33, 5, 235, 325, 235, 235 };
    int[] them = { 234, 234, 5, 2, 325, 23, 235, 23, 235, 532, 235, 235, 23, 3, 235, 325, 235, 235, 325, 235, 345, 34, 345, 34, 345, 345, 23, 235, 325, 35 };
    assertEquals(33, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case63() {
    int[] us = { 1, 1, 1, 1, 1, 1, 1, 1 };
    int[] them = { 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(8, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case64() {
    int[] us = { 361, 201 };
    int[] them = { 361, 201 };
    assertEquals(2, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case65() {
    int[] us = { 1, 34, 235, 23, 34, 23, 5, 235, 23, 235, 23, 5, 23, 23, 23, 3, 235, 25, 23, 235, 532, 23, 353, 23, 33, 5, 235, 325, 235, 235 };
    int[] them = { 234, 234, 5, 1, 325, 23, 235, 23, 235, 532, 235, 235, 23, 3, 235, 325, 235, 235, 325, 235, 345, 34, 345, 34, 345, 345, 23, 235, 325, 35 };
    assertEquals(33, chessmatchup.maximumScore(us, them));
  }

  @Test
  public void case66() {
    int[] us = { 1, 1, 1, 1, 1 };
    int[] them = { 1, 1, 1, 1, 1 };
    assertEquals(5, chessmatchup.maximumScore(us, them));
  }

}
