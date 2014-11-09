package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class CoinPilesTest {
  CoinPiles coinpiles = new CoinPiles();

  @Test
  public void case1() {
    int[] sizes = { 1, 2, 2, 2, 2, 3 };
    assertEquals(2, coinpiles.organize(sizes));
  }

  @Test
  public void case2() {
    int[] sizes = { 1, 1, 2, 2, 2, 3 };
    assertEquals(3, coinpiles.organize(sizes));
  }

  @Test
  public void case3() {
    int[] sizes = { 1, 2, 2, 2, 3, 4 };
    assertEquals(3, coinpiles.organize(sizes));
  }

  @Test
  public void case4() {
    int[] sizes = { 701, 701, 646, 701, 559, 559, 646, 701, 646, 881 };
    assertEquals(4, coinpiles.organize(sizes));
  }

  @Test
  public void case5() {
    int[] sizes = { 701, 701, 646, 701, 559, 559, 646, 701, 701, 881 };
    assertEquals(3, coinpiles.organize(sizes));
  }

  @Test
  public void case6() {
    int[] sizes = { 1 };
    assertEquals(1, coinpiles.organize(sizes));
  }

  @Test
  public void case7() {
    int[] sizes = { 276 };
    assertEquals(1, coinpiles.organize(sizes));
  }

  @Test
  public void case8() {
    int[] sizes = { 1000 };
    assertEquals(1, coinpiles.organize(sizes));
  }

  @Test
  public void case9() {
    int[] sizes = { 1, 1000 };
    assertEquals(1, coinpiles.organize(sizes));
  }

  @Test
  public void case10() {
    int[] sizes = { 2, 1000, 1, 999, 2 };
    assertEquals(2, coinpiles.organize(sizes));
  }

  @Test
  public void case11() {
    int[] sizes = { 276, 275 };
    assertEquals(1, coinpiles.organize(sizes));
  }

  @Test
  public void case12() {
    int[] sizes = { 276, 275, 275 };
    assertEquals(2, coinpiles.organize(sizes));
  }

  @Test
  public void case13() {
    int[] sizes = { 276, 275, 275, 275 };
    assertEquals(2, coinpiles.organize(sizes));
  }

  @Test
  public void case14() {
    int[] sizes = { 276, 277, 276, 275 };
    assertEquals(2, coinpiles.organize(sizes));
  }

  @Test
  public void case15() {
    int[] sizes = { 1000, 999, 998, 997, 996, 995, 994, 993, 992, 991, 990, 989, 988, 987, 986, 985, 984, 983, 982, 981, 980, 979, 978, 977, 976, 975, 974, 973, 972, 971, 970, 969, 968, 967, 966, 965, 964, 963, 962, 961, 960 };
    assertEquals(8, coinpiles.organize(sizes));
  }

  @Test
  public void case16() {
    int[] sizes = { 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149 };
    assertEquals(9, coinpiles.organize(sizes));
  }

  @Test
  public void case17() {
    int[] sizes = { 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 112 };
    assertEquals(2, coinpiles.organize(sizes));
  }

  @Test
  public void case18() {
    int[] sizes = { 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 111, 114, 113, 112 };
    assertEquals(4, coinpiles.organize(sizes));
  }

  @Test
  public void case19() {
    int[] sizes = { 13, 70, 70, 13, 23, 71, 6, 18, 6, 63, 63, 36, 63, 70, 23, 18, 36, 2, 21, 70, 63, 63, 6, 70, 18, 13, 1, 70, 18, 70 };
    assertEquals(7, coinpiles.organize(sizes));
  }

  @Test
  public void case20() {
    int[] sizes = { 31, 13, 35, 35, 15, 31, 55, 10, 35, 35, 35, 55, 13, 15, 55, 18, 19, 10, 55, 15, 1, 15, 18, 31, 1, 55, 19, 13, 18, 13, 35, 10, 18, 63, 31, 19, 31, 15, 13, 15, 13, 55, 64, 35, 55, 13, 31, 35 };
    assertEquals(9, coinpiles.organize(sizes));
  }

  @Test
  public void case21() {
    int[] sizes = { 66, 5, 66, 40, 43, 66, 51, 1, 43, 17, 40, 67, 2, 51, 66, 2, 5, 2, 40, 66, 40, 43, 2, 51, 66, 1, 11, 17, 2, 40, 11, 51, 51, 40, 66, 2, 40, 66, 17, 66, 43 };
    assertEquals(8, coinpiles.organize(sizes));
  }

  @Test
  public void case22() {
    int[] sizes = { 28, 5, 5, 49, 28, 49, 6, 23, 23, 1, 64, 9, 14, 23, 23, 6, 6, 6, 28, 14, 23, 28, 14, 23, 6, 48, 6, 28, 14, 23, 5, 48, 9, 14, 49, 23 };
    assertEquals(8, coinpiles.organize(sizes));
  }

  @Test
  public void case23() {
    int[] sizes = { 4, 18, 16, 23, 20, 18, 18, 20, 23, 18, 85, 12, 20, 1, 18, 4, 16, 85, 20, 18, 1, 4, 16, 86, 18, 16, 18, 4, 20, 10, 23, 20, 4, 20, 20, 4 };
    assertEquals(8, coinpiles.organize(sizes));
  }

  @Test
  public void case24() {
    int[] sizes = { 8, 71, 7, 6, 6, 71, 3, 6, 24, 24, 62, 24, 1, 6, 72, 3, 3, 7, 7, 30, 3, 7, 24, 71, 30, 6, 24, 3, 8, 7, 71, 1, 3, 71 };
    assertEquals(7, coinpiles.organize(sizes));
  }

  @Test
  public void case25() {
    int[] sizes = { 1, 28, 35, 53, 2, 2, 54, 2, 2, 28, 35, 34, 2, 53, 35, 35, 53, 2, 2, 35, 53, 28, 52, 2, 2, 2, 2, 53, 2, 2, 2, 35, 1, 28, 4, 28 };
    assertEquals(8, coinpiles.organize(sizes));
  }

  @Test
  public void case26() {
    int[] sizes = { 72, 65, 39, 42, 65, 39, 29, 16, 65, 15, 42, 39, 65, 4, 65, 16, 15, 42, 29, 42, 2, 29, 42, 42, 65, 65, 65, 65, 65, 42, 39, 29, 1, 29, 39, 39, 39, 71, 71, 29, 39 };
    assertEquals(8, coinpiles.organize(sizes));
  }

  @Test
  public void case27() {
    int[] sizes = { 1, 1, 1, 76, 76, 33, 26, 6, 77, 23, 6, 6, 6, 33, 1, 43, 23, 33, 49, 33, 23, 49, 49, 1, 7, 49, 76, 6, 49 };
    assertEquals(7, coinpiles.organize(sizes));
  }

  @Test
  public void case28() {
    int[] sizes = { 35, 15, 15, 58, 15, 15, 58, 4, 19, 9, 58, 15, 35, 35, 15, 35, 9, 15, 4, 4, 4, 43, 19, 1, 58, 9, 15, 35, 15, 1, 43, 59, 15, 58, 35, 15, 58, 43 };
    assertEquals(8, coinpiles.organize(sizes));
  }

  @Test
  public void case29() {
    int[] sizes = { 13, 17, 21, 17, 21, 4, 13, 1, 21, 17, 13, 21, 13, 13, 17, 21, 22, 17, 21, 13, 13, 17, 13, 13, 13, 13, 17, 21, 21, 13, 21, 5, 13, 13, 13, 13, 13, 5, 17, 13, 13, 13, 13, 17, 13, 13, 13, 17, 13, 21 };
    assertEquals(5, coinpiles.organize(sizes));
  }

  @Test
  public void case30() {
    int[] sizes = { 13, 13, 13, 13, 3, 15, 13, 13, 1, 13, 13, 9, 13, 13, 13, 13, 13, 13, 3, 3, 13, 3, 25, 3, 3, 13, 13, 3, 13, 13, 13, 13, 15, 26, 13, 13, 15, 3, 9, 13, 13, 3, 13, 13, 13, 15, 13, 13, 9, 13 };
    assertEquals(6, coinpiles.organize(sizes));
  }

  @Test
  public void case31() {
    int[] sizes = { 39, 67, 1, 1, 26, 19, 26, 26, 26, 39, 26, 7, 68, 26, 67, 39, 26, 67, 39, 39, 39, 39, 19, 39, 26, 32, 12, 12, 32, 36, 12, 67, 32, 1, 19, 26, 36, 39, 26, 39, 26, 39, 7, 26, 36, 32, 26, 7, 26, 1 };
    assertEquals(9, coinpiles.organize(sizes));
  }

  @Test
  public void case32() {
    int[] sizes = { 8, 30, 30, 23, 30, 7, 31, 23, 23, 23, 23, 23, 23, 8, 8, 8, 23, 8, 23, 8, 8, 30, 2, 23, 8, 10, 8, 8, 23, 23, 8, 7, 23, 30, 30, 1, 23, 23, 10, 23, 7, 8, 2, 30, 8, 23, 23, 8, 23, 10 };
    assertEquals(7, coinpiles.organize(sizes));
  }

  @Test
  public void case33() {
    int[] sizes = { 10, 11, 11, 6, 2, 11, 23, 11, 11, 11, 40, 11, 10, 10, 23, 30, 11, 23, 6, 30, 23, 11, 30, 6, 11, 1, 10, 10, 11, 23, 10, 10, 41, 23, 40, 23, 23, 40, 30, 40, 6, 23, 40, 11, 2, 40, 40, 23, 23, 11 };
    assertEquals(8, coinpiles.organize(sizes));
  }

  @Test
  public void case34() {
    int[] sizes = { 18, 8, 22, 6, 8, 8, 18, 6, 21, 21, 21, 6, 18, 18, 8, 22, 21, 5, 18, 6, 22, 18, 22, 21, 8, 8, 6, 6, 18, 6, 5, 8, 6, 18, 8, 1, 22, 8, 6, 8, 6, 6, 6, 22, 23, 6, 6, 21, 21, 6 };
    assertEquals(7, coinpiles.organize(sizes));
  }

  @Test
  public void case35() {
    int[] sizes = { 13, 50, 28, 50, 50, 50, 1, 10, 50, 10, 6, 33, 3, 50, 6, 50, 50, 10, 50, 13, 10, 6, 6, 50, 18, 10, 18, 50, 50, 3, 50, 79, 28, 50, 50, 50, 6, 18, 10, 33, 6, 3, 80, 33, 28, 6, 50, 18, 18, 10 };
    assertEquals(9, coinpiles.organize(sizes));
  }

  @Test
  public void case36() {
    int[] sizes = { 1, 19, 15, 15, 15, 4, 4, 19, 19, 19, 15, 19, 15, 24, 15, 19, 19, 15, 17, 15, 7, 19, 15, 4, 15, 4, 20, 19, 15, 4, 15, 15, 15, 15, 24, 4, 15, 19, 25, 15, 24, 15, 19, 15, 4, 15, 4, 19, 4, 4 };
    assertEquals(8, coinpiles.organize(sizes));
  }

  @Test
  public void case37() {
    int[] sizes = { 27, 27, 34, 6, 19, 27, 6, 35, 27, 34, 27, 27, 27, 15, 19, 6, 19, 34, 15, 19, 19, 15, 34, 34, 34, 15, 15, 15, 6, 6, 19, 34, 27, 27, 19, 34, 34, 1, 15, 1, 27, 34, 27, 27, 27, 15, 19, 27, 34, 15 };
    assertEquals(7, coinpiles.organize(sizes));
  }

  @Test
  public void case38() {
    int[] sizes = { 9, 9, 9, 9, 8, 3, 9, 9, 2, 9, 3, 9, 2, 9, 3, 9, 2, 9, 3, 11, 9, 3, 3, 2, 3, 9, 9, 9, 8, 9, 1, 9, 3, 9, 9, 9, 9, 9, 9, 2, 3, 9, 9, 9, 9, 9, 2, 3, 12, 3 };
    assertEquals(6, coinpiles.organize(sizes));
  }

  @Test
  public void case39() {
    int[] sizes = { 48, 251, 73, 73, 73, 251, 456, 456, 48, 456, 116, 456, 456, 251, 178, 178, 48, 456, 456, 178, 251, 456, 178, 456, 73, 488, 251, 116, 488, 488, 489, 456, 115, 456, 73, 99, 178, 73, 178, 48, 456, 116, 178, 178, 73, 116, 488, 488, 488, 251 };
    assertEquals(9, coinpiles.organize(sizes));
  }

  @Test
  public void case40() {
    int[] sizes = { 59, 135, 135, 59, 59, 230, 59, 59, 135, 231, 59, 59, 37, 59, 135, 135, 59, 135, 59, 59, 37, 59, 70, 37, 135, 135, 135, 135, 135, 37, 135, 59, 135, 59, 59, 59, 59, 135, 70, 135, 59, 37, 37, 37, 70, 59, 63, 59, 59, 70 };
    assertEquals(7, coinpiles.organize(sizes));
  }

  @Test
  public void case41() {
    int[] sizes = { 65, 346, 416, 4, 15, 65, 275, 15, 416, 416, 65, 275, 494, 416, 275, 275, 65, 416, 495, 416, 65, 65, 416, 416, 416, 65, 275, 275, 416, 416, 275, 416, 494, 67, 416, 65, 15, 416, 416, 15, 275, 416, 65, 65, 65, 275, 494, 275, 416, 416 };
    assertEquals(8, coinpiles.organize(sizes));
  }

  @Test
  public void case42() {
    int[] sizes = { 364, 41, 79, 79, 358, 361, 361, 41, 361, 41, 41, 404, 27, 404, 358, 404, 361, 361, 41, 41, 364, 79, 41, 41, 358, 358, 41, 361, 41, 254, 27, 358, 404, 364, 54, 361, 41, 404, 79, 41, 41, 361, 361, 41, 358, 27, 358, 405, 404, 358 };
    assertEquals(9, coinpiles.organize(sizes));
  }

  @Test
  public void case43() {
    int[] sizes = { 376, 331, 331, 331, 54, 54, 376, 23, 384, 331, 376, 376, 117, 376, 376, 376, 376, 54, 384, 117, 331, 54, 331, 384, 54, 384, 385, 117, 331, 331, 54, 54, 166, 376, 117, 376, 166, 54, 384, 54, 166, 331, 166, 384, 384, 384, 54, 376, 54, 384 };
    assertEquals(7, coinpiles.organize(sizes));
  }

  @Test
  public void case44() {
    int[] sizes = { 15, 15, 539, 90, 203, 539, 539, 203, 203, 203, 15, 90, 90, 203, 203, 15, 539, 55, 540, 15, 203, 539, 539, 203, 203, 203, 203, 203, 244, 55, 203, 203, 203, 203, 57, 425, 539, 203, 203, 203, 15, 203, 425, 203, 15, 539, 90, 15, 203, 203 };
    assertEquals(9, coinpiles.organize(sizes));
  }

  @Test
  public void case45() {
    int[] sizes = { 109, 422, 434, 422, 42, 434, 434, 422, 434, 422, 422, 422, 32, 422, 422, 434, 434, 422, 5, 42, 422, 381, 381, 422, 42, 434, 32, 42, 422, 434, 109, 381, 32, 434, 422, 422, 422, 32, 381, 42, 381, 434, 434, 422, 422, 434, 422, 109, 422, 477 };
    assertEquals(7, coinpiles.organize(sizes));
  }

  @Test
  public void case46() {
    int[] sizes = { 43, 574, 574, 364, 364, 364, 364, 47, 364, 574, 43, 364, 97, 574, 574, 364, 364, 364, 574, 43, 574, 574, 364, 574, 364, 574, 97, 364, 131, 574, 364, 342, 364, 649, 42, 574, 342, 574, 131, 43, 574, 364, 574, 43, 43, 43, 131, 364, 728, 97 };
    assertEquals(8, coinpiles.organize(sizes));
  }

  @Test
  public void case47() {
    int[] sizes = { 76, 236, 438, 236, 438, 236, 236, 236, 236, 18, 236, 236, 186, 236, 135, 236, 438, 236, 236, 438, 236, 236, 477, 438, 135, 186, 135, 186, 438, 236, 236, 236, 236, 76, 236, 438, 438, 76, 438, 438, 438, 236, 186, 135, 236, 438, 236, 236, 236, 438 };
    assertEquals(6, coinpiles.organize(sizes));
  }

  @Test
  public void case48() {
    int[] sizes = { 472, 168, 68, 398, 260, 696, 168, 3, 260, 472, 3, 168, 398, 3, 207, 3, 168, 3, 168, 398, 168, 68, 472, 696, 168, 207, 168, 207, 168, 68, 472, 168, 3, 59, 168, 472, 260, 398, 168, 472, 472, 207, 260, 260, 168, 3, 168, 696, 696, 697 };
    assertEquals(9, coinpiles.organize(sizes));
  }

  @Test
  public void case49() {
    int[] sizes = { 29, 153, 153, 512, 387, 353, 153, 3, 153, 512, 153, 512, 353, 115, 3, 115, 353, 512, 512, 3, 512, 115, 512, 115, 64, 3, 153, 512, 512, 512, 153, 115, 3, 512, 166, 115, 44, 513, 166, 512 };
    assertEquals(8, coinpiles.organize(sizes));
  }

  @Test
  public void case50() {
    int[] sizes = { 494, 24, 163, 359, 510, 163, 468, 218, 359, 359, 494, 359, 509, 359, 116, 163, 57, 359, 66, 494, 359, 359, 218, 163, 468, 494, 509, 163, 509, 494, 163, 163, 359, 494, 494, 494, 359, 359, 509, 509 };
    assertEquals(8, coinpiles.organize(sizes));
  }

  @Test
  public void case51() {
    int[] sizes = { 475, 525, 63, 475, 843, 296, 490, 843, 525, 266, 63, 843, 490, 63, 266, 843, 844, 296, 843, 843, 296, 475, 475, 843, 475, 63, 475, 63, 131, 161, 63, 843, 63, 490, 525, 475, 296, 475, 63, 17, 490, 475 };
    assertEquals(8, coinpiles.organize(sizes));
  }

  @Test
  public void case52() {
    int[] sizes = { 155, 155, 579, 387, 155, 579, 579, 579, 387, 192, 192, 7, 579, 155, 579, 579, 579, 192, 2, 617, 387, 7, 549, 268, 579, 192, 387, 155, 549, 155, 579, 579, 387, 155, 155, 155, 579, 155, 579, 387, 69 };
    assertEquals(8, coinpiles.organize(sizes));
  }

  @Test
  public void case53() {
    int[] sizes = { 442, 432, 26, 442, 143, 577, 51, 432, 432, 442, 217, 578, 577, 179, 315, 442, 143, 143, 315, 577, 315, 315, 315, 143, 432, 107, 577, 432, 315, 577, 432, 143, 432, 315, 315, 143, 432, 432, 315, 442, 315 };
    assertEquals(8, coinpiles.organize(sizes));
  }

  @Test
  public void case54() {
    int[] sizes = { 60, 348, 60, 18, 60, 60, 400, 38, 211, 150, 348, 348, 60, 400, 462, 60, 97, 400, 164 };
    assertEquals(5, coinpiles.organize(sizes));
  }

  @Test
  public void case55() {
    int[] sizes = { 552, 91, 302, 302, 91, 91, 91, 302, 91, 91, 552, 850, 552, 85, 91, 11, 96, 91, 534, 534, 302, 552, 302, 851, 534, 91, 90, 91, 302, 193, 302, 91, 302, 552 };
    assertEquals(7, coinpiles.organize(sizes));
  }

  @Test
  public void case56() {
    int[] sizes = { 271, 271, 156, 5, 271, 675, 675, 128, 162, 675, 596, 271, 162, 675, 596, 162, 123, 271, 123, 271, 675, 675, 123, 123, 675, 128, 596, 596, 271, 271, 596, 675, 271, 168, 675, 596, 123, 281, 271, 676 };
    assertEquals(8, coinpiles.organize(sizes));
  }

  @Test
  public void case57() {
    int[] sizes = { 372, 133, 746, 133, 745, 745, 745, 745, 372, 745, 372, 133, 310, 745, 133, 372, 372, 393, 745, 156, 310, 218, 393, 79, 310, 745, 372, 310, 745, 310, 310, 264, 310, 372, 310, 91, 372, 310, 310 };
    assertEquals(8, coinpiles.organize(sizes));
  }

  @Test
  public void case58() {
    int[] sizes = { 262, 225, 267, 225, 566, 262, 30, 262, 618, 618, 262, 339, 618, 52, 262, 618, 225, 339, 339, 225, 618, 225, 225, 618, 566, 618, 225, 52, 225, 95, 566, 566, 566, 788 };
    assertEquals(7, coinpiles.organize(sizes));
  }

  @Test
  public void case59() {
    int[] sizes = { 985, 123, 984, 160, 499, 123, 160, 984, 123, 345, 984, 499, 499, 123, 291, 123, 123, 984, 246, 984, 345, 499, 984, 345, 499, 123, 499, 984, 291, 984, 246, 5, 180, 160, 123, 123, 160, 160, 499, 160, 91, 499, 5, 246, 123, 246, 499, 160, 499, 123 };
    assertEquals(9, coinpiles.organize(sizes));
  }

  @Test
  public void case60() {
    int[] sizes = { 171, 31, 736, 142, 321, 342, 291, 736, 142, 291, 142, 342, 291, 736, 309, 291, 736, 291, 737, 321, 309, 309, 321, 291, 321, 321, 736, 321, 291, 58, 342, 142, 321, 379, 291, 321, 321, 142, 309, 736, 171, 291, 291, 291, 321, 736, 291, 736, 321 };
    assertEquals(9, coinpiles.organize(sizes));
  }

  @Test
  public void case61() {
    int[] sizes = { 41, 293, 293, 293, 35, 35, 293, 293, 102, 286, 35, 293, 293, 35, 293, 47, 293, 293, 293, 102, 293, 102, 293, 35, 293, 35, 286, 294, 35, 170, 35, 102, 286, 293, 35, 293, 293, 293, 293, 35, 293, 293, 286, 47, 293, 35, 293, 286, 35, 35 };
    assertEquals(7, coinpiles.organize(sizes));
  }

  @Test
  public void case62() {
    int[] sizes = { 862, 460, 37, 861, 438, 438, 175, 438, 861, 861, 175, 861, 460, 175, 460, 391, 36, 175, 446, 861, 861, 438, 105, 861, 861, 861, 460, 175, 318, 391, 175, 861, 446 };
    assertEquals(7, coinpiles.organize(sizes));
  }

  @Test
  public void case63() {
    int[] sizes = { 471, 439, 471, 439, 439, 214, 439, 38, 471, 143, 439, 188, 219, 38, 143, 471, 214, 38, 38, 143, 38, 471, 102, 143, 38, 143, 471, 214, 472, 439, 143, 439, 471, 188, 214, 38, 38, 143, 471, 143, 143, 143, 43, 439, 439, 471, 471, 143, 143, 214 };
    assertEquals(9, coinpiles.organize(sizes));
  }

  @Test
  public void case64() {
    int[] sizes = { 67, 183, 416, 416, 576, 302, 10, 530, 253, 530, 530, 416, 530, 530, 78, 253, 302, 416, 576, 576, 183, 416, 302, 67, 576, 530, 67, 576, 576, 576, 416, 576, 253, 416, 576, 576, 302, 576, 576, 576, 253, 416, 576, 577, 576, 416, 254, 576, 254, 530 };
    assertEquals(8, coinpiles.organize(sizes));
  }

  @Test
  public void case65() {
    int[] sizes = { 486, 790, 357, 486, 207, 790, 207, 790, 790, 790, 486, 396, 486, 357, 207, 203, 80, 396, 396, 396, 790, 396, 790, 486, 207, 790, 357, 396, 790, 486, 791, 84, 790, 486, 790, 396, 790, 790, 207, 790, 431, 357, 486, 203, 486, 237, 203, 207, 790, 237 };
    assertEquals(8, coinpiles.organize(sizes));
  }

  @Test
  public void case66() {
    int[] sizes = { 276, 84, 407, 276, 149, 226, 226, 407, 276, 777, 276, 226, 777, 777, 407, 777, 226, 276, 778, 777, 226, 226, 407, 276, 407, 407, 226, 276, 151, 26, 226, 276, 81, 777, 142, 226, 226, 407, 149, 226, 407, 226, 276, 777, 777, 149, 777, 226, 26, 407 };
    assertEquals(8, coinpiles.organize(sizes));
  }

  @Test
  public void case67() {
    int[] sizes = { 188, 431, 188, 15, 431, 431, 188, 124, 111, 229, 210, 188, 15, 188, 124, 188, 431, 15, 432, 431, 229, 431, 15, 124, 15, 15, 188, 124, 124, 188, 15, 229, 188, 15, 15, 15, 431, 431, 151, 124, 124, 124, 124, 111, 124, 124, 67, 431, 15, 229 };
    assertEquals(9, coinpiles.organize(sizes));
  }

  @Test
  public void case68() {
    int[] sizes = { 228, 228, 94, 269, 228, 228, 68, 303, 228, 303, 454, 228, 95, 231, 231, 455, 303, 94, 231, 228, 94, 269, 228, 228, 454, 269, 269, 210, 231, 231, 269, 94, 231, 231, 269, 228, 228, 269, 269, 231, 231, 269, 231, 269, 269, 210, 303, 228, 94, 228 };
    assertEquals(9, coinpiles.organize(sizes));
  }

  @Test
  public void case69() {
    int[] sizes = { 60, 348, 60, 18, 60, 60, 400, 38, 211, 150, 348, 348, 60, 400, 462, 60, 97, 400, 164 };
    assertEquals(5, coinpiles.organize(sizes));
  }

  @Test
  public void case70() {
    int[] sizes = { 12, 14, 15, 11, 21, 11, 10, 9, 9, 4, 21, 33, 12, 32, 12, 12, 14, 15, 11, 21, 11, 10, 9, 9, 4, 21, 33, 12, 32, 12, 11, 99, 22, 92, 12, 34, 53, 23, 23, 21, 24, 23, 12, 12, 34, 21, 45, 30 };
    assertEquals(9, coinpiles.organize(sizes));
  }

  @Test
  public void case71() {
    int[] sizes = { 1, 2, 2, 2, 2, 3 };
    assertEquals(2, coinpiles.organize(sizes));
  }

  @Test
  public void case72() {
    int[] sizes = { 5, 4, 4, 4, 3, 3 };
    assertEquals(3, coinpiles.organize(sizes));
  }

  @Test
  public void case73() {
    int[] sizes = { 1, 2 };
    assertEquals(1, coinpiles.organize(sizes));
  }

  @Test
  public void case74() {
    int[] sizes = { 60, 348, 60, 18, 60, 60, 400, 38, 211, 150, 348, 348, 60, 400, 462, 60, 97, 400, 164, 1, 1, 1, 2, 56, 400, 56, 2 };
    assertEquals(6, coinpiles.organize(sizes));
  }

  @Test
  public void case75() {
    int[] sizes = { 5, 8, 1, 1, 1, 20, 6, 6, 3, 2, 5, 3, 7, 5, 9, 999, 74, 23, 65, 34, 23, 76 };
    assertEquals(6, coinpiles.organize(sizes));
  }

  @Test
  public void case76() {
    int[] sizes = { 2, 1, 2, 2, 3, 4, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 23, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3 };
    assertEquals(4, coinpiles.organize(sizes));
  }

}
