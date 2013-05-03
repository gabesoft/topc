package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class HardDequeSortTest {
  HardDequeSort harddequesort = new HardDequeSort();

  @Test
  public void case1() {
    int[] data = { 50, 45, 55, 60, 45, 65, 40, 70, 70, 35, 30, 75 };
    assertEquals(1, harddequesort.minDeques(data));
  }

  @Test
  public void case2() {
    int[] data = { 3, 6, 0, 9, 6, 3 };
    assertEquals(2, harddequesort.minDeques(data));
  }

  @Test
  public void case3() {
    int[] data = { 0, 2, 1, 4, 3, 6, 5, 8, 7, 9 };
    assertEquals(5, harddequesort.minDeques(data));
  }

  @Test
  public void case4() {
    int[] data = { 100, 100, 100, -100, -100, -100, -50, -50, -50 };
    assertEquals(2, harddequesort.minDeques(data));
  }

  @Test
  public void case5() {
    int[] data = { 1, 2, 5, 3, 1, 0, 5, 4, 1, 7, 3, 6, 0, 2, 5, 5, 9, 5, 10, 5, 10, 7, 9, 8, 9, 7, 5, 1, 10, 1, 2, 7, 6, 5, 4, 6, 6, 8, 9, 5, 10, 5, 5, 2, 3, 4, 5, 5, 3 };
    assertEquals(6, harddequesort.minDeques(data));
  }

  @Test
  public void case6() {
    int[] data = { 454, 537, 7, 976, 537, 908, 976, 908, -94, 454, 908, 64, 454, -731, 908, -646, 537 };
    assertEquals(4, harddequesort.minDeques(data));
  }

  @Test
  public void case7() {
    int[] data = { 724, 724, 724, 724, 724, -471, -471, 802, -481, 343, 65, -471, 343, 994, 994, -806, 318 };
    assertEquals(3, harddequesort.minDeques(data));
  }

  @Test
  public void case8() {
    int[] data = { 226, 226, 226, 778, 226, 226, 778, 778, -308, -960, 12, 893, -960, 245, 608, 226, 893, 88, -988, -988, -248, 778, -43, -708, 84, -495, -117, -960, -708, -792 };
    assertEquals(6, harddequesort.minDeques(data));
  }

  @Test
  public void case9() {
    int[] data = { 902, 878, 895, 860, 869, 791, 829, 772, 784, 731, 759, 651, 665, 541, 586, 409, 534, 264, 405, 230, 247, 159, 224, 36, 124, -5, 31, -177, -58, -327, -194, -357, -340, -474, -391, -494, -492, -508, -505, -577, -554, -723, -662, -824, -768, -908, -880, -975, -930, -993 };
    assertEquals(25, harddequesort.minDeques(data));
  }

  @Test
  public void case10() {
    int[] data = { -858, -790, -791, -750, -769, -571, -746, -464, -509, -439, -449, -416, -426, -388, -412, -369, -378, -316, -364, -279, -287, -123, -194, -48, -71, 61, 28, 304, 94, 346, 311, 411, 387, 460, 453, 547, 527, 604, 580, 665, 621, 730, 718, 802, 733, 871, 809, 921, 884, 985 };
    assertEquals(25, harddequesort.minDeques(data));
  }

  @Test
  public void case11() {
    int[] data = { -790, -791, -750, -769, -571, -746, -464, -509, -439, -449, -416, -426, -388, -412, -369, -378, -316, -364, -279, -287, -123, -194, -48, -71, 61, 28, 304, 94, 346, 311, 411, 387, 460, 453, 547, 527, 604, 580, 665, 621, 730, 718, 802, 733, 871, 809, 921, 884, 985 };
    assertEquals(24, harddequesort.minDeques(data));
  }

  @Test
  public void case12() {
    int[] data = { 860, 869, 791, 829, 772, 784, 731, 759, 651, 665, 541, 586, 409, 534, 264, 405, 230, 247, 159, 224, 36, 124, -5, 31, -177, -58, -327, -194, -357, -340, -474, -391, -494, -492, -508, -505, -577, -554, -723, -662, -824, -768, -908, -880, -975, -930, -993 };
    assertEquals(23, harddequesort.minDeques(data));
  }

  @Test
  public void case13() {
    int[] data = { 902, 878, 895, 860, 869, 791, 829, 772, 784, 731, 759, 651, 665, 541, 586, 409, 534, 264, 405, 230, 247, 159, 224, 36, 124, -5, 31, -177, -58, -327, -194, -357, -340, -474, -391, -494, -492, -508, -505, -577, -554, -723, -662, -824, -768, -908, -880, -975, -930 };
    assertEquals(25, harddequesort.minDeques(data));
  }

  @Test
  public void case14() {
    int[] data = { 902, 878, 895, 860, 869, 791, 829, 772, 784, 731, 759, 651, 665, 541, 586, 409, 534, 264, 405, 230, 247, 159, 224, 36, 124, -5, 31, -177, -58, -327, -194, -357, -340, -474, -391, -494, -492, -508, -505, -577, -554, -723, -662, -824, -768, -908, -880, -975, 930 };
    assertEquals(24, harddequesort.minDeques(data));
  }

  @Test
  public void case15() {
    int[] data = { -330, -628, -730, 289, -189, -538 };
    assertEquals(3, harddequesort.minDeques(data));
  }

  @Test
  public void case16() {
    int[] data = { -571, -538, 956, 354, 174, -188, -708, -989 };
    assertEquals(2, harddequesort.minDeques(data));
  }

  @Test
  public void case17() {
    int[] data = { 451, -333, -266, -148, -513, 396, -726, -694 };
    assertEquals(3, harddequesort.minDeques(data));
  }

  @Test
  public void case18() {
    int[] data = { 721, 172, 334 };
    assertEquals(2, harddequesort.minDeques(data));
  }

  @Test
  public void case19() {
    int[] data = { -263, 983, -45, 880, 558, -393, -20, -419, -87, -466, 115, 37, 393, -529, 138, 303, -444, -296, 190, -641, -883, -249, 122, -950, 974, 240, 227, 100, 266, 434, 240, -913, -968 };
    assertEquals(11, harddequesort.minDeques(data));
  }

  @Test
  public void case20() {
    int[] data = { 832, -73, -386, -648, 228, -3, -878, 734, 927, -83, -570, -783, -84, 918, 182, -503, -166, 526, 62, -147, 246, -749, -169, -522, -280, -969, -650, -327 };
    assertEquals(8, harddequesort.minDeques(data));
  }

  @Test
  public void case21() {
    int[] data = { 334, 351, 959, -631, -57, -326, -147, -168, 4, -627, -939, 632, -455, -764, -650, -894, -62, -417, 543, 668, -918, -294, 644, -460, -546, 94 };
    assertEquals(10, harddequesort.minDeques(data));
  }

  @Test
  public void case22() {
    int[] data = { -604, -441, 270, 773, 87, -898, -997, 115, -278, -700, -135, -98, -954, -126, -567, -471, -404, 427, 648, -968, 794, -6, 143, -532, -490, 193, -526, -231, 743, 49, -850, -964, -578, 152, 867, -74, 764, -535, -197 };
    assertEquals(13, harddequesort.minDeques(data));
  }

  @Test
  public void case23() {
    int[] data = { -331, 950, 957, 236, 83, 578, 66, -455, 94, -835, -878, -116, -108, -207, 29, 475, -853, -954, -880, 160, 428, -405, 897 };
    assertEquals(9, harddequesort.minDeques(data));
  }

  @Test
  public void case24() {
    int[] data = { 697, -704, 915, 182, -724, 146, 180, -273, -436, 976, 993, 732, 387, -267, 360, 540, -724, 747, -365, -584, -689, 553, -718, 642, -459 };
    assertEquals(10, harddequesort.minDeques(data));
  }

  @Test
  public void case25() {
    int[] data = { -583, 693, 410, -153, -243, 13, -318, -949, 917, -32, -973, 873, 381, 494, -449, -612, 148, -442, 638, -271, 831, 903, 409, 306, -282, -275, 447, 872, -751, -485, -388, 941, 328, -262, 833, -160, 311, 200 };
    assertEquals(15, harddequesort.minDeques(data));
  }

  @Test
  public void case26() {
    int[] data = { 679, 549, 912, 399, 593, -477, -609, -662, 901, 468, -992, 231, -327, 235, -372, -372, -545, -6, -308, 939, 438, 552, 20, 380, -431, 366, 461, 850, 677, -229 };
    assertEquals(10, harddequesort.minDeques(data));
  }

  @Test
  public void case27() {
    int[] data = { 884, 66, -476, 68, 998, 427, -86, 214, 626, -970, -445, -81, 427, -739, 98, -318, -104, 986, -13, -570, 614, -438, 253, 113, -996, 490, -564, -886, -524 };
    assertEquals(10, harddequesort.minDeques(data));
  }

  @Test
  public void case28() {
    int[] data = { 685, -270, -175, -9, -170, 874, 218, 422, 983, 14, -798, 377, -507, -974, 524, -846, -235, 945, 942, 254, -687, -463, -398, -751, 773, -525, 888, -561, -241, -772, -943, -590, 807, 981, 608, 931, -11, -47, 383, 50, 253, 655, 419, 82, -706, 233 };
    assertEquals(15, harddequesort.minDeques(data));
  }

  @Test
  public void case29() {
    int[] data = { 8, -10, 6, -4, -5, 9, 6, 0, 3, -10, 10, -5, -4, -7, 8, 2, -6, -7, -1, -1, -1, 3, -6, -6, 8, -9, -5, 9, 3, -8, 3, -4, -9, -1, 3, 2, 1, -3, 0, 4, 5, 7 };
    assertEquals(8, harddequesort.minDeques(data));
  }

  @Test
  public void case30() {
    int[] data = { -8, 4, 8, -3, -4, -2, 2, 5, 3, -2, 2, -5, -8, 7, 2, 9, -9, -10, 9, 5, 8, 0, -3, 10, -9, -6, 3, -7, 1, -5, -3, -10, 4, 1, 9, 10, 6, 1, 3, -6, -1, 4, -6, -5, 1, -5, 3, -5, 3, -3 };
    assertEquals(10, harddequesort.minDeques(data));
  }

  @Test
  public void case31() {
    int[] data = { 10, -2, 10, 8, 2, -5, 7, 3, 6, 5, -4, 0, -9, -6, -1, 1, -2, 4, -7, 1, -6, -3, 8, 7, -1, 5, -10, 9, -10, 6, 3, -5, -10, 4, 4, -1, -4, 1, 10, 0, -1, -9, -8, 8, -9, 10, -3 };
    assertEquals(10, harddequesort.minDeques(data));
  }

  @Test
  public void case32() {
    int[] data = { 0, 10, -9, -1, -2, 10, 4, -6, -9, 7, 1, -1, 0, -3, -2, 5, -1, -9, 5, 6, -5, -1, 10, 3, -1, -5, 9, -2, 7, -8, -7, -9, 1, 0, 6, -9, -2, -1, 7, 6, 4, 7 };
    assertEquals(8, harddequesort.minDeques(data));
  }

  @Test
  public void case33() {
    int[] data = { -3, 6, -4, -7, 0, -3, 9, 4, -9, 2, 9, 4, 2, 4, 3, 3, -7, 0, 7, -3, -2, 2, -10, 6, 3, -1, 4, 3, -4, 0, 6, 0, -7, 10, -2, -2, -4, -1, 0, 3 };
    assertEquals(6, harddequesort.minDeques(data));
  }

  @Test
  public void case34() {
    int[] data = { 3, -10, -9, 1, -2, 1, 8, 6, 2, 4, -6, -5, 3, 1, 7, 0, 6, 5, 9, -1, 0, 7, 0, -2, 0, -8, 6, -7, -6, -4, -1, 7, 0, -6, -3, -10, -6, 7, 6, 1, 5, -9, 10, 9, -4 };
    assertEquals(10, harddequesort.minDeques(data));
  }

  @Test
  public void case35() {
    int[] data = { 1, 0, -6, 7, 3, 4, -3, 9, 0, 6, -7, -3, 1, -2, 2, 5, 1, 7, -1, -8, 6, 5, 1, 3, -1, -6, 3, -8, -9, -4, 6, -2, 2, -9, -5, 1, 2, -8, -6, 6, -10, 4, -6, 8, 8, 5, -6, 2, 9 };
    assertEquals(8, harddequesort.minDeques(data));
  }

  @Test
  public void case36() {
    int[] data = { 1, -6, 1, -2, -5, -10, -10, -1, -3, -4, -1, -9, -2, -9, -6, -7, -10, 3, 1, -4, -9, -2, 5, 6, -10, 10, -2, 3, -1, -1, -2, -9, -5, 2, -2, 7, 5, -5, 10, -6, 8 };
    assertEquals(8, harddequesort.minDeques(data));
  }

  @Test
  public void case37() {
    int[] data = { -1, 5, 8, -4, -6, -9, 10, -6, -3, 3, -2, -2, 9, 7, 1, -4, -10, -4, 0, 1, 6, -6, -4, -3, 9, 3, 0, -4, 5, -2, -8, 1, -10, -9, 8, -9, -4, 0, 7, -7, 6, -6, 3, -9, -4, -8, 5, 0, -5 };
    assertEquals(9, harddequesort.minDeques(data));
  }

  @Test
  public void case38() {
    int[] data = { 10, 2, -5, -5, 7, -8, -5, 1, 7, -10, 6, -7, 4, 7, 1, -4, 4, -3, -10, -1, -5, 0, 9, 8, 10, -10, 1, -8, 5, 8, -10, 1, 3, 7, 0, -7, 5, -10, -5, 3, 7, 6, 9, 6 };
    assertEquals(8, harddequesort.minDeques(data));
  }

  @Test
  public void case39() {
    int[] data = { 2, 3, 4, 4, 3, 3, 2, 2, 3, 0, 2, 0, 0, 2, 3, 1, 2, 1, 4, 1, 5, 4, 0, 5, 2, 2, 4, 5, 5, 1, 5, 0, 2, 0, 5, 2, 0, 4, 4, 5, 2, 0, 5, 4, 4, 1, 2 };
    assertEquals(3, harddequesort.minDeques(data));
  }

  @Test
  public void case40() {
    int[] data = { 0, 3, 0, 2, 1, 1, 4, 0, 2, 5, 3, 3, 5, 4, 1, 5, 4, 3, 2, 4, 3, 4, 2, 1, 0, 1, 0, 4, 2, 2, 1, 5, 3, 4, 0, 5, 1, 1, 4, 4, 1, 3, 5, 5, 1, 3, 5, 1 };
    assertEquals(3, harddequesort.minDeques(data));
  }

  @Test
  public void case41() {
    int[] data = { 3, 0, 2, 1, 0, 3, 5, 0, 5, 5, 0, 1, 2, 4, 4, 3, 3, 0, 4, 4, 2, 1, 1, 1, 0, 0, 2, 0, 5, 5, 5, 2, 5, 0, 2, 3, 0, 5, 5, 3, 4, 5, 5, 3, 4, 3 };
    assertEquals(3, harddequesort.minDeques(data));
  }

  @Test
  public void case42() {
    int[] data = { 1, 5, 5, 1, 5, 3, 1, 1, 4, 1, 1, 4, 5, 4, 0, 1, 3, 4, 5, 4, 1, 2, 2, 5, 5, 2, 4, 3, 2, 3, 5, 5, 5, 3, 4, 4, 0, 1, 1, 4, 5, 1, 5, 3, 1 };
    assertEquals(3, harddequesort.minDeques(data));
  }

  @Test
  public void case43() {
    int[] data = { 1, 3, 3, 3, 5, 3, 3, 1, 4, 3, 2, 0, 1, 0, 5, 0, 3, 1, 5, 1, 5, 3, 3, 5, 0, 2, 3, 0, 0, 3, 3, 3, 2, 1, 0, 1, 4, 5, 5, 1, 1, 3, 2, 3 };
    assertEquals(3, harddequesort.minDeques(data));
  }

  @Test
  public void case44() {
    int[] data = { 0, 2, 2, 4, 0, 2, 4, 2, 3, 1, 2, 0, 1, 2, 0, 3, 4, 0, 5, 2, 5, 1, 1, 5, 3, 2, 5, 3, 1, 4, 4, 2, 5, 2, 5, 5, 0, 2, 3, 3, 0, 1, 4 };
    assertEquals(3, harddequesort.minDeques(data));
  }

  @Test
  public void case45() {
    int[] data = { 1, 0, 5, 3, 4, 1, 0, 2, 4, 2, 4, 1, 2, 5, 2, 1, 1, 0, 3, 5, 1, 1, 4, 0, 4, 1, 1, 4, 5, 0, 2, 2, 2, 3, 5, 4, 3, 5, 1, 2, 3, 1, 0, 4, 0, 3, 1, 4, 2 };
    assertEquals(3, harddequesort.minDeques(data));
  }

  @Test
  public void case46() {
    int[] data = { 3, 3, 2, 5, 4, 3, 4, 1, 1, 1, 1, 2, 4, 1, 5, 1, 3, 3, 4, 5, 3, 0, 2, 1, 0, 5, 5, 1, 1, 3, 4, 1, 5, 2, 1, 3, 0, 5, 3, 1, 4, 0, 0, 5, 0, 2 };
    assertEquals(3, harddequesort.minDeques(data));
  }

  @Test
  public void case47() {
    int[] data = { 3, 3, 1, 5, 3, 4, 5, 2, 2, 0, 5, 1, 0, 5, 2, 1, 2, 0, 4, 4, 3, 5, 1, 4, 0, 1, 1, 4, 1, 3, 1, 5, 2, 0, 2, 0, 1, 1, 0, 5, 1, 4, 0, 4, 5, 0, 0, 1, 5 };
    assertEquals(3, harddequesort.minDeques(data));
  }

  @Test
  public void case48() {
    int[] data = { 4, 1, 5, 2, 5, 1, 0, 0, 0, 4, 2, 4, 3, 4, 4, 4, 4, 5, 5, 3, 2, 3, 4, 3, 1, 5, 1, 4, 1, 0, 4, 4, 1, 2, 2, 2, 4, 4, 5, 2, 5, 2, 4, 2, 5, 1 };
    assertEquals(3, harddequesort.minDeques(data));
  }

  @Test
  public void case49() {
    int[] data = { 902, 878, 895, 860, 869, 791, 829, 772, 784, 731, 759, 651, 665, 541, 586, 409, 534, 264, 405, 230, 247, 159, 224, 36, 124, -5, 31, -177, -58, -327, -194, -357, -340, -474, -391, -494, -492, -508, -505, -577, -554, -723, -662, -824, -768, -908, -880, -975, -930, -993 };
    assertEquals(25, harddequesort.minDeques(data));
  }

  @Test
  public void case50() {
    int[] data = { -858, -790, -791, -750, -769, -571, -746, -464, -509, -439, -449, -416, -426, -388, -412, -369, -378, -316, -364, -279, -287, -123, -194, -48, -71, 61, 28, 304, 94, 346, 311, 411, 387, 460, 453, 547, 527, 604, 580, 665, 621, 730, 718, 802, 733, 871, 809, 921, 884, 985 };
    assertEquals(25, harddequesort.minDeques(data));
  }

  @Test
  public void case51() {
    int[] data = { -858, -750, -769, -571, -746, -464, -509, -439, -449, -416, -426, -388, -412, -369, -378, -316, -364, -279, -287, -123, -194, -48, -71, 61, 28, 304, 94, 346, 311, 411, 387, 460, 453, 547, 527, 604, 580, 665, 621, 730, 718, 802, 733, 871, 809, 921, 884, 985 };
    assertEquals(24, harddequesort.minDeques(data));
  }

  @Test
  public void case52() {
    int[] data = { 902, 878, 895, 860, 869, 791, 829, 772, 784, 731, 759, 651, 665, 541, 586, 409, 534, 264, 405, 230, 247, 159, 224, 36, 124, -5, 31, -177, -58, -327, -194, -357, -340, -474, -391, -494, -492, -508, -505, -577, -554, -723, -662, -824, -768, -880, -908, -975, -993 };
    assertEquals(23, harddequesort.minDeques(data));
  }

  @Test
  public void case53() {
    int[] data = { -79, -86, -70, -61, -44, -221, -16, 11, -222, -225, 93, 140, 207, -261, 230, -269, 254, -377, -559, -589, -623, 257, -659, 284, 299, -671, 358, -752, -765, 373, 397, -784, 424, -840, 494, -856, 525, -882, -886, -890, 648, 670, -904, -909, -920, 687, 743, 791, 839, -963 };
    assertEquals(1, harddequesort.minDeques(data));
  }

  @Test
  public void case54() {
    int[] data = { -672, -883, 944, -883, -412, -672, -802, -672, -321, 944, 944, -802, -883, -321, -354 };
    assertEquals(3, harddequesort.minDeques(data));
  }

  @Test
  public void case55() {
    int[] data = { 433, 359, 359, 876, -642, -960, 809, -699, 638, 319, 751, 900, 22, 586, -639, 973, -300, 22, 638, -699, -566, 842, -828, -562, 881, 433, 470, -1000, 913, -960, -49, 913, 928, -828, -392, -642, 359, 470, -362, 11, -574, 1000, -642, 982, 778, 961, 11, 614 };
    assertEquals(14, harddequesort.minDeques(data));
  }

  @Test
  public void case56() {
    int[] data = { 23, 488, -533, -457, 250 };
    assertEquals(3, harddequesort.minDeques(data));
  }

  @Test
  public void case57() {
    int[] data = { 291, -613, 511, -918, 473, -920, -48, -37, -551, 442, 550, -902, -412, 937, 558, 511, 545, -920, 718, -197, 777, -918, -1000, 136, -551, -309, 1000, 718, -218, 230, -138, -48, -613, -37, -412, 291, -640, -551, -309, -218, 563, 373, 373, -269, 136, 1000, -269, 563, 718 };
    assertEquals(12, harddequesort.minDeques(data));
  }

  @Test
  public void case58() {
    int[] data = { -793, 930, 64, 868, 204, 930, 64, -615, 271, -282, 773, 187, 208 };
    assertEquals(5, harddequesort.minDeques(data));
  }

  @Test
  public void case59() {
    int[] data = { 407, -607, -607, 607, 407, 863, 296, 848, -294, -117, -148, -869, 135, -180, 53, 135, 848, 391, -641, 622, -25, 102, 841, -419 };
    assertEquals(8, harddequesort.minDeques(data));
  }

  @Test
  public void case60() {
    int[] data = { -506, -943, -946, -360, -6, 6, -668, 835, -554, 69, 871, 82, -760, 542, -173, -1000, 1000, -367, -857, 445, 204, 462, -41, -351, 986, 110, -544, -610, 211, -544, 257, -967, -688, -982, -941, 633, -857, 108, -73, -87, -262, 734, 50, 495 };
    assertEquals(15, harddequesort.minDeques(data));
  }

  @Test
  public void case61() {
    int[] data = { 295, 466, 466, 466, 295, 295, 466, 404, -1000, 295, 295, 295, -576, 295, -576, 295, 295, 1000, 1000, 404, 466, 1000, 466, -576 };
    assertEquals(3, harddequesort.minDeques(data));
  }

  @Test
  public void case62() {
    int[] data = { 716, 716, -973, -241, 716, -241, -241, -241, 137, -241, -241, 0, -334, -659, -973, -973, -563, 137, -973, -241, -522, -241, 816, 549, -224, 816, -511, -241 };
    assertEquals(4, harddequesort.minDeques(data));
  }

  @Test
  public void case63() {
    int[] data = { 172, -766, 172, 172, 172, 172, -766, -766 };
    assertEquals(1, harddequesort.minDeques(data));
  }

  @Test
  public void case64() {
    int[] data = { -818, -497, -57, -717, 629, -340, -407, -560, 266, -197, -57, -407, -468, -497, -143, 415, 868, -287, 1000, 333, 868, 261, 437, 860, -1000, 646, -287, -407, 1000, 415, -1000, 498 };
    assertEquals(9, harddequesort.minDeques(data));
  }

  @Test
  public void case65() {
    int[] data = { -395, -37, -433, -120, -220, 703, 228, 1000, -825, -812, 966, -177, -1000, -338, 999, 82, 568, -148, -84, 28, -968, 503, 544, -329, -812, 937, -162, -1000, 657, 51, -482, 387, 729, 387, -695, -565, 580, -44 };
    assertEquals(12, harddequesort.minDeques(data));
  }

  @Test
  public void case66() {
    int[] data = { -469, 1000, 1000, -692, -692, -397, -692, -765, 1000, 363, -158, 1000, 363, 363, -397, -1000, 363, -314, 1000, -469, -158, -692, -469, 1000, -765, -1000, -397 };
    assertEquals(5, harddequesort.minDeques(data));
  }

  @Test
  public void case67() {
    int[] data = { -947, -571, -1000, -296, -482, 161, 287, 919, 817, 520, 1000, -350, 828, 536, -309, -350, -831, -641, -947, -387, -724, -154, -154, -152, -426, 449, -152, 161, -641, -406, 504, 817, -571, 555, -296, 555, 253, -615, -406, 551, 449, -715 };
    assertEquals(11, harddequesort.minDeques(data));
  }

  @Test
  public void case68() {
    int[] data = { 25, 941, 1000, 471, -265, 1000, -284, -1000, 25, 471, -928, 471, -265, 1000, -1000, 1000, 941, -265, -265, 471, -618, 967, -284, 471, -742 };
    assertEquals(5, harddequesort.minDeques(data));
  }

  @Test
  public void case69() {
    int[] data = { 362, 362, -839, 362, -612, -839, -839, -170, 913, 804, -788, -249, 787, 913 };
    assertEquals(4, harddequesort.minDeques(data));
  }

  @Test
  public void case70() {
    int[] data = { 797, 976, 976, 976, -105, 699, 764, 376, 689, -254, -920, -197, -888, 81, -949, 756, 699, 764, 745, -920, -90, 887, -92, -410, 150, 392, 738, 122, 392, -216, 150, 376, -920, 9, 9, 939, 376, 887, 376, -341, -493, -251, -504, 742, -619, 865 };
    assertEquals(13, harddequesort.minDeques(data));
  }

  @Test
  public void case71() {
    int[] data = { -471, -471, -471, -471, -471, -471, -471, -471, -471, -471, -471, -471, -471, -471 };
    assertEquals(1, harddequesort.minDeques(data));
  }

  @Test
  public void case72() {
    int[] data = { 16, -522, 8, -93, 657, 994, -785, -21, 980, -409, 584, -415, -484, -351, -750, 312, 708, 402, -327 };
    assertEquals(7, harddequesort.minDeques(data));
  }

  @Test
  public void case73() {
    int[] data = { -973, 572, -918, 114, -910, 896, -889, 513, 1000, 829, 399, 52, -211, 372, -284, -717, 501, 65, 126, -1000, 896, -624, -510, 337, 357, -622, 822, -143, -452, 231, 147, -729, -944, 966, 733, 891, -833, -618, -43, 896, 673, 513, 191 };
    assertEquals(13, harddequesort.minDeques(data));
  }

  @Test
  public void case74() {
    int[] data = { -710, -190, -763, 1000, 563, 51, 573, -956, -595, -507, 345, -595, 292, -696, -435, -190, -956, 448, 532, -956, -1000, -595, -595, -435, 1000, 448 };
    assertEquals(6, harddequesort.minDeques(data));
  }

  @Test
  public void case75() {
    int[] data = { -350, 295, 730, -784, -163, 707, 756, -942, 707, 889, 611, 737, 744, 564, 228, 833, -164, -465, -975, 572, -371, -673, 638, 41, 707, -91, 475, 1000, 890, 647, 375, -711, -805, -891, -495, 830, -1000, 85, -774, 158, -902, 44, -627, -578, 227, 728, -392, -774, -740 };
    assertEquals(16, harddequesort.minDeques(data));
  }

  @Test
  public void case76() {
    int[] data = { -1000, -1000, 91, -892, -892, -429, 276, 590, -792, 1000, 162, 944, 91, 944, -938, 50, 876, -39, -464, -890, 916, -238, -934, 730, 752, 102, -184, -464 };
    assertEquals(8, harddequesort.minDeques(data));
  }

  @Test
  public void case77() {
    int[] data = { -1000, 643, -1000, -680, 255, -680, 708, 297, -240, 257, -240, 94, -384, -46, 94, -843, 227, 255, 1000, 255, -901, -966, 1000, -575, -1000, 1000, -533, 1000, -4, -533, -575, -46, -345, -901, -843, -405, 708, -535, 255, -345, -240, -680, 257, -666, 444, 643, 444, -345, 94, 257 };
    assertEquals(12, harddequesort.minDeques(data));
  }

  @Test
  public void case78() {
    int[] data = { -1000, 1000, 901, -42, 901, 1000, 901, 901 };
    assertEquals(2, harddequesort.minDeques(data));
  }

  @Test
  public void case79() {
    int[] data = { 770, -869, 770, -183, 322, -183, 140, 770, -869, 798, -39, -39, -646, 605, 142 };
    assertEquals(5, harddequesort.minDeques(data));
  }

  @Test
  public void case80() {
    int[] data = { 227, 411, 770, 107, -949, -826, 118, -749, 845, 155, 275, 322, 266, -664, -400, -444, 1000, -622, -614, 792, 78, -1000, 169, -818, -241, 407, -885, 390, -279, -232, -443, -670 };
    assertEquals(12, harddequesort.minDeques(data));
  }

  @Test
  public void case81() {
    int[] data = { -835, 300, 300, 643, -835, -561, 300, -730, -730, 694, -314, -730, -387, 228, -98, -566, -788, 308, -561, 724, -32, -314, 435 };
    assertEquals(6, harddequesort.minDeques(data));
  }

  @Test
  public void case82() {
    int[] data = { -492, -492, -492, -492, -492, -492, -492, -492, -492, 996, 287, 35, 112, -210, 227, -432, -465, 32, -492, -492, -492, -332, 114, 114, 951, -210, 996, -465, -492, 504, -634 };
    assertEquals(6, harddequesort.minDeques(data));
  }

  @Test
  public void case83() {
    int[] data = { 320, 893, 659, 28, -544, 893, -951, 711, 774, -791 };
    assertEquals(3, harddequesort.minDeques(data));
  }

  @Test
  public void case84() {
    int[] data = { 748, 748, 174, 680, 174, 174, 748, -379, 680, 680, -656, -379, 174, 680, -379, 482 };
    assertEquals(3, harddequesort.minDeques(data));
  }

  @Test
  public void case85() {
    int[] data = { 177, 177, 304, -675, 304, 304, 401, 304, -675, -203, 304, 304, 407, 216, 304, 262, 881, -84, 704, -675, -699, -458, -399, 179, -886, -458, -699, 409, 177, 454, 454, -209, 881, -399 };
    assertEquals(8, harddequesort.minDeques(data));
  }

  @Test
  public void case86() {
    int[] data = { -837, 218, 218, -837, -837, -837, -837, 659, 659, 611, 611, -837, -304, 218, -289, -304, 346, -304, -121, -861, -837, -837, 176, 218, -289, 783, 176, -747, -861, 260, 659, 611, -304, 260, -747, -121, -121, -304, 611, 58, 260, 659, -747, 58 };
    assertEquals(6, harddequesort.minDeques(data));
  }

  @Test
  public void case87() {
    int[] data = { -234, 365, 624, 287, 228, 941, -1000, 673, -960, -847, -847, 228, 673, 287, 165, -300, -599, 109, 287, 673, 1000, 718, 871, -1000, -105, -770, 941, 358, 624, -92, -847, 425, -92, -234, -770, 158, 881, -300, 624, 350 };
    assertEquals(8, harddequesort.minDeques(data));
  }

  @Test
  public void case88() {
    int[] data = { 249, 766, 733, -109, -408, -523, 990, 878, -638, -666, 881, 71, 940, 940, -1000, -666, 71, -523, -848, -761, -1, 406, 910, -928, -141, 809, -197, -928, -409, -873, 733, -718, -693, 1000, -96, 170, -599, -693, -874, 580, 659, -523, -408, 303, -718 };
    assertEquals(12, harddequesort.minDeques(data));
  }

  @Test
  public void case89() {
    int[] data = { -685, -685, -685, -685, 94, -683, -683, 94, 226, -683, 96 };
    assertEquals(3, harddequesort.minDeques(data));
  }

  @Test
  public void case90() {
    int[] data = { 1000, 576, -791, -189, 691, 710, 417, -1000, -757, 576, 576, 691, -791, -1000, -256, 691, -189, 130, 710, -757, -124, -596, -899, -593, -596, -189, -17, -467, 268, -1000, 320, 456, 268, -596, 157, -899, -596, -1000, 320, -443, 130, -443 };
    assertEquals(10, harddequesort.minDeques(data));
  }

  @Test
  public void case91() {
    int[] data = { -69, -69, -69, -69, 852, 852, -69, -348, 688, -69, -141, 843, -69, 852, -192, 477, 747, 587, -961, -961, 758, 21, 600, 688, 491, -643 };
    assertEquals(7, harddequesort.minDeques(data));
  }

  @Test
  public void case92() {
    int[] data = { -1000, 123, -160, 750, 750, 750, -160, -160, -535, 750, -258, -1000, -258, 750, -1000, -312, -312, 123, -160, -160, 123, 1000, 1000 };
    assertEquals(3, harddequesort.minDeques(data));
  }

  @Test
  public void case93() {
    int[] data = { -112, -387, -216, -1000, 811, 163, -533, -387, -6, -436, 1000, 163, -1000, -436, 568, -387, -984, 163, -155, -216, -785, 810, 234, 810, -387, -922, -155, -6, 1000, 163, -1000, 744, 811, 731, -159, 336, -785, 811, 568, -159 };
    assertEquals(8, harddequesort.minDeques(data));
  }

  @Test
  public void case94() {
    int[] data = { -625, 875, -625, 600, 875, -559, 600, -116, -356, 875, -559, 875, 271, 875, 875, 875, -434, -559, 600, -677, 271, -322, -434, 881, 982, 271, -116, 875, -349, -275, -625, -434, -220, 881, -625, -625, 413, -538, -116, 982, -434, 121, -625, -538, -322, -349, -349, -220, -677 };
    assertEquals(8, harddequesort.minDeques(data));
  }

  @Test
  public void case95() {
    int[] data = { -884, -884, -884, -884, 262, 52, -623, 262, 156, 690, 690, 538, 52, 563, 364, 690, -404, 355, 538, 673, 683, 156, 355, 683, -201, 673, 262, 135, 52, 355, 683, 262, 878, 355, 364, -884, 52, -201, 690, -674, 878, 878, -135, 378 };
    assertEquals(8, harddequesort.minDeques(data));
  }

  @Test
  public void case96() {
    int[] data = { 94, 94, 94, 94, 94, 94, 94, 94, -11, -11, 644, -11, -11, 644, -11, -11, -11, 94, 644, -11, 94, 94, 94, 644, 644, 644, 94, -11, 206, 206, 259, 94, 206, -778 };
    assertEquals(3, harddequesort.minDeques(data));
  }

  @Test
  public void case97() {
    int[] data = { 44, 347, 176, 733, 192, 782, -411, 465, 344, -35, -190, 571, 118, 986, 901, 672, 519, -226, -206, 716, 544, -62, 1000, -1000, -259, 150, 535, -740, -68, -694, -532, 19, 966, -106, 311, -710, 540, 745, -242, -497, 646, 917, 142, -694 };
    assertEquals(14, harddequesort.minDeques(data));
  }

  @Test
  public void case98() {
    int[] data = { -1, -2, 0, -3, -2, -1 };
    assertEquals(2, harddequesort.minDeques(data));
  }

  @Test
  public void case99() {
    int[] data = { 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
    assertEquals(1, harddequesort.minDeques(data));
  }

  @Test
  public void case100() {
    int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    assertEquals(1, harddequesort.minDeques(data));
  }

  @Test
  public void case101() {
    int[] data = { 7, 4, 9, 10, 9, 7, 3, 7, 8, 2, 10, 7, 4, 10, 8, 9, 8, 2, 7, 10, 1, 3, 6, 8, 8, 3, 7, 8, 8, 9, 9, 1, 6, 2, 5, 6, 2, 9, 6, 4, 4, 10, 7, 5, 5, 1, 4, 9, 5, 6 };
    assertEquals(5, harddequesort.minDeques(data));
  }

  @Test
  public void case102() {
    int[] data = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24 };
    assertEquals(13, harddequesort.minDeques(data));
  }

  @Test
  public void case103() {
    int[] data = { -70, -639, -270, 811, 915, -82, 830, 678, -52, 878, -994, 633, -38, 574, -140, -154, 180, -479, -626, 800, -696, 179, 111, -885, -980, 366, -350, 638, -201, 165, 501, -122, -521, 672, -792, 399, -432, -580, 863, 244, 767, -164, -266, -3, -347, 556, -741, -422, -987, 966 };
    assertEquals(17, harddequesort.minDeques(data));
  }

  @Test
  public void case104() {
    int[] data = { 0, -1, -2, -3, -4, -5, -6, 100, 99, 98, 97, 96, 95, 94, 200, 199, 198, 197, 196, 195, 194, 300, 299, 298, 297, 296, 295, 294, 400, 399, 398, 397, 396, 395, 394, 500, 499, 498, 497, 496, 495, 494, 600, 599, 598, 597, 596, 595, 594, 596 };
    assertEquals(8, harddequesort.minDeques(data));
  }

  @Test
  public void case105() {
    int[] data = { 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7 };
    assertEquals(4, harddequesort.minDeques(data));
  }

  @Test
  public void case106() {
    int[] data = { 454, 537, 7, 976, 537, 908, 976, 908, -94, 454, 908, 64, 454, -731, 908, -646, 537 };
    assertEquals(4, harddequesort.minDeques(data));
  }

  @Test
  public void case107() {
    int[] data = { 0, 2, 1, 4, 3, 6, 5, 8, 7, 10, 9, 12, 11, 14, 13, 16, 15, 18, 17, 20, 19, 22, 21, 24, 23, 26, 25, 28, 27, 30, 29, 32, 31, 34, 33, 36, 35, 38, 37, 40, 39, 42, 41, 44, 43, 46, 45, 48, 47, 49 };
    assertEquals(25, harddequesort.minDeques(data));
  }

  @Test
  public void case108() {
    int[] data = { 50, 45, 55, 60, 45, 65, 40, 70, 70, 35, 30, 75 };
    assertEquals(1, harddequesort.minDeques(data));
  }

  @Test
  public void case109() {
    int[] data = { 914, -235, 704, -448, 174, -275, 368, 20, -29, 240, -877, -394, -546, 276, 737, 425, 573, 470, -673, 695, 898, 256, -832, -281, -442, -101, -241, 152, -250, 937, -654, -121, 738, 127, 386, -324, -774, -655, -154, -64, 881, 680, -221, -207, 573, 710, -461, -517, -310, 159 };
    assertEquals(17, harddequesort.minDeques(data));
  }

  @Test
  public void case110() {
    int[] data = { 95, 94, 92, 82, 78, 73, 69, 69, 68, 67, 67, 64, 61, 53, 47, 45, 41, 38, 36, 35, 34, 33, 27, 27, 26, 24, 21, 18, 3, 2, 0, 4, 5, 11, 11, 12, 16, 22, 41, 42, 53, 58, 62, 64, 71, 81, 91, 91, 95, 99 };
    assertEquals(9, harddequesort.minDeques(data));
  }

  @Test
  public void case111() {
    int[] data = { -289, 261, -448, 282, -468, 411, 491, 971, 163, -95, 123, -230, 776, 722, 127, 123, -856, -629, -9, -275, 203, -139, 88, 524, 7, 648, -979, -228, -788, -248, -661, -529, -511, 782, 692, 783, 486, 948 };
    assertEquals(11, harddequesort.minDeques(data));
  }

  @Test
  public void case112() {
    int[] data = { 454, 537, 7, 976, 537, 908, 976, 908, -94, 454, 908, 64, 454, -731, 908, -646, 537, 123, 123, 123, 56, 231, 123, 123, 666, 454, 537, 7, 976, 537, 908, 976, 908, -94, 454, 908, 64, 454, -731, 908, -646, 537, 123, 123, 123, 56, 231, 123, 123, 666 };
    assertEquals(7, harddequesort.minDeques(data));
  }

  @Test
  public void case113() {
    int[] data = { 95, 210, 690, 566, 722, 882, 330, 456, 840, 314, 112, 805, 285, 159, 80, 261, 512, 52, 863, 100, 500, 39, 580, 859, 303, 31, 808, 972, 373, 10, 468, 319, 199, 238, 542, 26, 825, 483, 76, 481, 120, 878, 793, 380, 699, 97, 322, 196, 591, 719 };
    assertEquals(18, harddequesort.minDeques(data));
  }

  @Test
  public void case114() {
    int[] data = { 2, 3, 2, 1, 2 };
    assertEquals(2, harddequesort.minDeques(data));
  }

  @Test
  public void case115() {
    int[] data = { 1, 10, 2, 9, 5, 234, 2, 23, 313, 31, 35, 135, 341, 234, 531, 324, 1, 35, 234, 43, 123, 67, 23, 65, 123, 54, 54, 23, 654, 32, 43, 57, 234, 45, 123, 46, 23, 54, 324, 21, 56, 23, 76, 23, 567, 23, 435, 1, 3, 2 };
    assertEquals(11, harddequesort.minDeques(data));
  }

  @Test
  public void case116() {
    int[] data = { 3, 4, 2, 3, 4, 2, 3, 4, 2 };
    assertEquals(2, harddequesort.minDeques(data));
  }

  @Test
  public void case117() {
    int[] data = { 3, 6, 0, 9, 6, 3 };
    assertEquals(2, harddequesort.minDeques(data));
  }

  @Test
  public void case118() {
    int[] data = { 1, 2, 3, 4, 5, 6, 3, 4, 5, 2, 8, 10, 45, 9, 8, 10, 45, 9, 7, 1000, -1000, 1000, 999, -999, 999, -999, 998, 996, 995, 995, 994, 995, 1000, -1000, 982, 384, 283, 381, 192, 281, 291, -122, 198, 291, 312, 1, 0, 1, 0, 2 };
    assertEquals(9, harddequesort.minDeques(data));
  }

}
