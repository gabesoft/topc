package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class DequeSortTest {
  DequeSort dequesort = new DequeSort();

  @Test
  public void case1() {
    int[] data = { 50, 45, 55, 60, 65, 40, 70, 35, 30, 75 };
    assertEquals(1, dequesort.minDeques(data));
  }

  @Test
  public void case2() {
    int[] data = { 3, 6, 0, 9, 5, 4 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case3() {
    int[] data = { 0, 2, 1, 4, 3, 6, 5, 8, 7, 9 };
    assertEquals(5, dequesort.minDeques(data));
  }

  @Test
  public void case4() {
    int[] data = { -858, -790, -791, -750, -769, -571, -746, -464, -509, -439, -449, -416, -426, -388, -412, -369, -378, -316, -364, -279, -287, -123, -194, -48, -71, 61, 28, 304, 94, 346, 311, 411, 387, 460, 453, 547, 527, 604, 580, 665, 621, 730, 718, 802, 733, 871, 809, 921, 884, 985 };
    assertEquals(25, dequesort.minDeques(data));
  }

  @Test
  public void case5() {
    int[] data = { 902, 878, 895, 860, 869, 791, 829, 772, 784, 731, 759, 651, 665, 541, 586, 409, 534, 264, 405, 230, 247, 159, 224, 36, 124, -5, 31, -177, -58, -327, -194, -357, -340, -474, -391, -494, -492, -508, -505, -577, -554, -723, -662, -824, -768, -908, -880, -975, -930, -993 };
    assertEquals(25, dequesort.minDeques(data));
  }

  @Test
  public void case6() {
    int[] data = { -742, 894, -499, 905, 744 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case7() {
    int[] data = { -62, -249, 505, 975, 124 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case8() {
    int[] data = { -4, -721, -579, -26, 335 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case9() {
    int[] data = { 701, -952, -493, 285 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case10() {
    int[] data = { 592, 164, -698, 372, -896 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case11() {
    int[] data = { 409, 620, -656, 896, -133 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case12() {
    int[] data = { -881, 428, -472, -212, -505 };
    assertEquals(3, dequesort.minDeques(data));
  }

  @Test
  public void case13() {
    int[] data = { 380, 59, -275, -60, -20 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case14() {
    int[] data = { -687, -282, -368, 75, -408 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case15() {
    int[] data = { 807, 770, 584, -398, -252 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case16() {
    int[] data = { -254, 275, 153 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case17() {
    int[] data = { 757, 869, -879, 505, -633 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case18() {
    int[] data = { -209, 135, -378, 887, 719 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case19() {
    int[] data = { 120, 197, 829, 857, 692 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case20() {
    int[] data = { -774, 518, -183, 317, -859 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case21() {
    int[] data = { -990, 187, 562, -971 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case22() {
    int[] data = { 248, -621, -889, 380, -516 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case23() {
    int[] data = { -882, -938, -391, 654, -60 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case24() {
    int[] data = { 331, 765, 413, 521, 609 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case25() {
    int[] data = { 737, -965, -391, -721 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case26() {
    int[] data = { 891, 120, -117, 400, 764 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case27() {
    int[] data = { 7, -770, -729, -198, -926 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case28() {
    int[] data = { 849, -562, 890, 756 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case29() {
    int[] data = { 265, 92, -613, 353, 693 };
    assertEquals(1, dequesort.minDeques(data));
  }

  @Test
  public void case30() {
    int[] data = { -91, -314, -653, -42 };
    assertEquals(1, dequesort.minDeques(data));
  }

  @Test
  public void case31() {
    int[] data = { 475, 855, -275, 558, 174 };
    assertEquals(3, dequesort.minDeques(data));
  }

  @Test
  public void case32() {
    int[] data = { 362, -776, -449, -249, 5 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case33() {
    int[] data = { 818, -58, -75 };
    assertEquals(1, dequesort.minDeques(data));
  }

  @Test
  public void case34() {
    int[] data = { -503, 268, -826, 360, 649 };
    assertEquals(1, dequesort.minDeques(data));
  }

  @Test
  public void case35() {
    int[] data = { -193, 912, 89, -744, -448 };
    assertEquals(3, dequesort.minDeques(data));
  }

  @Test
  public void case36() {
    int[] data = { 354, 264, 619, -825 };
    assertEquals(1, dequesort.minDeques(data));
  }

  @Test
  public void case37() {
    int[] data = { -376, 880, 952, 378, 557 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case38() {
    int[] data = { -483, 208, 866, 425, -652 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case39() {
    int[] data = { -877, -586, 248, 561 };
    assertEquals(1, dequesort.minDeques(data));
  }

  @Test
  public void case40() {
    int[] data = { -526, 829, 417, -836, -201 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case41() {
    int[] data = { -554, -351, -375, -227, -756 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case42() {
    int[] data = { -716, -142, -423, -134, 81 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case43() {
    int[] data = { 396, -843, 564, 109, 967 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case44() {
    int[] data = { 293, -669, 898, 299 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case45() {
    int[] data = { 460, 787, 473, 297, -203 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case46() {
    int[] data = { -938, -643, 756, 718, 912 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case47() {
    int[] data = { -427, -412, -481 };
    assertEquals(1, dequesort.minDeques(data));
  }

  @Test
  public void case48() {
    int[] data = { -417, -319, -706, -365, 609 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case49() {
    int[] data = { 442, -317, 403, 969 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case50() {
    int[] data = { 605, 430, -833, 864, 102 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case51() {
    int[] data = { -103, 711, -104, -576 };
    assertEquals(1, dequesort.minDeques(data));
  }

  @Test
  public void case52() {
    int[] data = { -268, 495, -311, 884, -105 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case53() {
    int[] data = { -803, 878, -866, -284, 81 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case54() {
    int[] data = { -133, 336, 11, 685 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case55() {
    int[] data = { -69, 662, 803, 917, 463 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case56() {
    int[] data = { 785, 897, 305, 455, 810 };
    assertEquals(3, dequesort.minDeques(data));
  }

  @Test
  public void case57() {
    int[] data = { -299, -382, 40, 586, 958 };
    assertEquals(1, dequesort.minDeques(data));
  }

  @Test
  public void case58() {
    int[] data = { 114, -157, -321, -84, 821 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case59() {
    int[] data = { -766, 405, 932, 628, 781 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case60() {
    int[] data = { 666, -483, 936, -22, 90 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case61() {
    int[] data = { -896, 184, 730, 282 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case62() {
    int[] data = { -688, -441, -226, 285, 964 };
    assertEquals(1, dequesort.minDeques(data));
  }

  @Test
  public void case63() {
    int[] data = { 597, -939, -497, 714, -868 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case64() {
    int[] data = { -639, -701, 635, 568, -532 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case65() {
    int[] data = { 34, 377, 396, 469, -219 };
    assertEquals(1, dequesort.minDeques(data));
  }

  @Test
  public void case66() {
    int[] data = { 81, 568, -148, -34, -725 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case67() {
    int[] data = { 905, -16, -770, -469, 347 };
    assertEquals(3, dequesort.minDeques(data));
  }

  @Test
  public void case68() {
    int[] data = { 136, -73, 78, 438, -173 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case69() {
    int[] data = { 539, -34, 588, 564, -382 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case70() {
    int[] data = { 139, -443, 822, 869, -977 };
    assertEquals(1, dequesort.minDeques(data));
  }

  @Test
  public void case71() {
    int[] data = { -954, 786, 53, -261, 236 };
    assertEquals(3, dequesort.minDeques(data));
  }

  @Test
  public void case72() {
    int[] data = { -179, 33, -490, 706, -601 };
    assertEquals(1, dequesort.minDeques(data));
  }

  @Test
  public void case73() {
    int[] data = { -375, -426, -525, -137, -765 };
    assertEquals(1, dequesort.minDeques(data));
  }

  @Test
  public void case74() {
    int[] data = { 421, -169, -945, 99, -336 };
    assertEquals(3, dequesort.minDeques(data));
  }

  @Test
  public void case75() {
    int[] data = { -433, -726, -446, -706, -787 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case76() {
    int[] data = { -451, -108, -532, -564, -441 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case77() {
    int[] data = { 145, 673, 911, -816, 74 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case78() {
    int[] data = { 258, 406, 371, 847, 805 };
    assertEquals(3, dequesort.minDeques(data));
  }

  @Test
  public void case79() {
    int[] data = { -973, 745, -941, 272, -419 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case80() {
    int[] data = { -668, 779, 499, -310, -256 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case81() {
    int[] data = { 549, -966, -838, -685, 88, 352, -266, 242, 803, 199, -188, 61, 688, -621, 679, 546, -992, -450, -199, 496, -822, -835, -566, 285, -101, 713, -804, 858, 465, 200, -369, 220, 936, -19, 801, -932, -459, -615, -408, -123, 33, 398, -354, -642, 115, 274, -384, 298, 163, 259 };
    assertEquals(19, dequesort.minDeques(data));
  }

  @Test
  public void case82() {
    int[] data = { 182, 967, 607, -923, 327, 769, -44, 29, -610, -202, 660, -824, -272, 788, 304, 3, 112, -7, 850, 658, -628, 567, -363, -819, -203, -748, -679, 530, -194, 785, -318, -141, 613, -241, -207, -625, 711, -633, -184, -588, -907, -390, -54, 214, 576, 806, -485, 60, -541, -232 };
    assertEquals(18, dequesort.minDeques(data));
  }

  @Test
  public void case83() {
    int[] data = { -77, 876, 385, 575, -853, -843, -181, 503, -534, 538, -90, -198, -514, 355, 687, -247, 811, -615, -508, 582, -312, -171, -701, 345, 434, 878, -621, 566, 520, -434, -945, 640, 977, -893, 974, -597, -98, 150, 337, -990, -175, -140, 86, 69, -126, 78, -885, 814, 752, 47 };
    assertEquals(17, dequesort.minDeques(data));
  }

  @Test
  public void case84() {
    int[] data = { 905, 315, -635, 431, -226, -931, -905, 685, 648, 670, 275, 867, -156, 165, 192, -1000, -926, -400, 787, -685, 163, -385, -591, 639, 794, 333, 765, 185, 705, -720, -489, 390, -648, 144, 745, 371, -950, 932, -223, 922, 994, -818, -920, 181, 87, -82, 429, 967, 282, 35 };
    assertEquals(19, dequesort.minDeques(data));
  }

  @Test
  public void case85() {
    int[] data = { -269, 241, -887, -702, 697, -947, 260, 314, -633, 13, -888, 608, 672, -7, 236, -151, -828, -267, -938, 113, -734, -180, 822, -131, 881, -601, 659, -147, 722, 295, -602, -207, -746, 263, 302, 734, 389, -303, -659, -758, -451, 647, -629, 226, 267, -72, -915, -739, -784, -521 };
    assertEquals(16, dequesort.minDeques(data));
  }

  @Test
  public void case86() {
    int[] data = { 191, 949, 879, 280, -149, 442, 479, 484, -15, 561, -323, -594, 695, -681, 427, 660, 828, -206, -437, -774, 820, 658, 372, 776, -902, 645, 915, 631, 576, -162, 235, -235, -357, 167, -151, -522, 960, -475, 797, 679, 245, 514, 130, -979, 926, 287, -297, 91, -436, -258 };
    assertEquals(13, dequesort.minDeques(data));
  }

  @Test
  public void case87() {
    int[] data = { 749, -828, 388, -440, 488, -577, -679, -961, 262, -892, -541, -692, 203, 334, 812, 468, -64, 429, 3, 172, -365, 544, 526, -339, -631, 527, -9, -819, 918, 10, -111, 440, 616, 161, -953, 331, 409, -166, -871, 521, -492, 259, -623, 809, 286, -903, -774, -427, 548, -109 };
    assertEquals(19, dequesort.minDeques(data));
  }

  @Test
  public void case88() {
    int[] data = { 970, -230, -669, -315, 122, -611, 396, -22, -134, 812, -54, -890, -261, 736, 545, 170, 718, 623, 893, -487, 982, -713, 904, -132, -560, -818, -920, -499, -709, 207, -604, 380, -189, 637, 197, 704, 510, 603, -893, -123, 42, 448, -678, 174, -960, -275, -254, -166, -168, 820 };
    assertEquals(18, dequesort.minDeques(data));
  }

  @Test
  public void case89() {
    int[] data = { -432, 270, -681, -552, 319, -285, 708, 519, 11, 882, 950, 873, -743, -434, -685, -693, 153, -513, 915, -29, -703, -799, -676, -232, -391, -322, 771, 475, -176, 650, 744, 647, -131, -655, 908, 100, -841, 935, -214, 575, 697, 369, -407, 705, -923, -749, -797, -34, -123, -660 };
    assertEquals(16, dequesort.minDeques(data));
  }

  @Test
  public void case90() {
    int[] data = { -957, 973, 278, -105, -594, 950, 220, 77, -845, -407, 839, -278, -781, -309, 795, 317, 357, -63, 498, -191, -912, 516, 75, 750, -296, 571, -775, -832, 930, -249, -697, 439, -453, 632, 4, 276, -70, -744, 779, 28, 983, -158, 538, -705, -37, -827, -272, 69, 437, 657 };
    assertEquals(17, dequesort.minDeques(data));
  }

  @Test
  public void case91() {
    int[] data = { 388, -658, 863, 118, -731, 959, 508, 131, 962, -158, -272, -437, 735, -431, 358, 151, -832, 805, 836, 949, -444, 128, 690, 780, 887, 35, -270, 86, -494, 612, -930, 619, 64, 894, 153, 381, 722, 769, -597, 409, 472, 800, 157, 490, -182, 4, -183, -52, 215, -875 };
    assertEquals(17, dequesort.minDeques(data));
  }

  @Test
  public void case92() {
    int[] data = { -662, 150, -1000, 822, -481, 552, 864, 526, 310, -102, 574, 487, -100, 821, 410, -858, -139, 396, 818, -20, 368, -346, 731, -33, -561, 728, -435, 110, 28, -348, 701, 519, -505, 973, 789, 608, -407, 833, 629, -73, 355, 43, -925, 583, 981, -829, 727, 732, -174, 605 };
    assertEquals(15, dequesort.minDeques(data));
  }

  @Test
  public void case93() {
    int[] data = { -424, 583, 872, 882, -791, -884, 50, -763, -387, 745, -731, 853, -860, 756, 18, 467, -880, -343, 879, 239, -566, 568, -326, 836, -182, 245, 157, -400, 876, -411, 71, 970, -405, -695, 915, 103, 993, -940, -527, -238, 368, -531, 593, -49, -962, 892, 171, -926, -247, 956 };
    assertEquals(17, dequesort.minDeques(data));
  }

  @Test
  public void case94() {
    int[] data = { 561, -510, 844, -864, -100, 216, -998, 58, 663, 969, 72, 196, -242, 273, -514, -228, 213, -772, 846, -599, 109, -60, -387, 292, 266, -182, -389, -981, -303, -142, 279, 394, -543, 858, 902, 596, -873, -741, -430, 105, -44, -158, -601, 927, -421, 782, -595, -657, 329, -15 };
    assertEquals(16, dequesort.minDeques(data));
  }

  @Test
  public void case95() {
    int[] data = { 582, 380, -381, 968, 919, 328, -105, 251, 459, -614, -431, 992, 124, 689, -376, 725, 312, 895, -617, -116, -853, -952, 348, 734, 55, -981, 362, -183, 142, -121, 995, -424, -919, -111, -259, -751, 120, 893, -430, 901, -247, 854, -28, 320, 587, -454, -58, -88, -360, -569 };
    assertEquals(18, dequesort.minDeques(data));
  }

  @Test
  public void case96() {
    int[] data = { 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
    assertEquals(1, dequesort.minDeques(data));
  }

  @Test
  public void case97() {
    int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    assertEquals(1, dequesort.minDeques(data));
  }

  @Test
  public void case98() {
    int[] data = { -79, -86, -70, -61, -44, -221, -16, 11, -222, -225, 93, 140, 207, -261, 230, -269, 254, -377, -559, -589, -623, 257, -659, 284, 299, -671, 358, -752, -765, 373, 397, -784, 424, -840, 494, -856, 525, -882, -886, -890, 648, 670, -904, -909, -920, 687, 743, 791, 839, -963 };
    assertEquals(1, dequesort.minDeques(data));
  }

  @Test
  public void case99() {
    int[] data = { 902, 878, 895, 860, 869, 791, 829, 772, 784, 731, 759, 651, 665, 541, 586, 409, 534, 264, 405, 230, 247, 159, 224, 36, 124, -5, 31, -177, -58, -327, -194, -357, -340, -474, -391, -494, -492, -508, -505, -577, -554, -723, -662, -824, -768, -880, -908, -975, -993 };
    assertEquals(23, dequesort.minDeques(data));
  }

  @Test
  public void case100() {
    int[] data = { -858, -750, -769, -571, -746, -464, -509, -439, -449, -416, -426, -388, -412, -369, -378, -316, -364, -279, -287, -123, -194, -48, -71, 61, 28, 304, 94, 346, 311, 411, 387, 460, 453, 547, 527, 604, 580, 665, 621, 730, 718, 802, 733, 871, 809, 921, 884, 985 };
    assertEquals(24, dequesort.minDeques(data));
  }

  @Test
  public void case101() {
    int[] data = { 3, 6, 0, 9, 5, 4, -1000, 1000, 999, -999, 998, -998, 997, -997 };
    assertEquals(4, dequesort.minDeques(data));
  }

  @Test
  public void case102() {
    int[] data = { 0, 1, 7, 3, 4, 8, 6 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case103() {
    int[] data = { 1, 2, 3, 7, 4, 5, 6, 8, 0, 9 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case104() {
    int[] data = { 1, 3, 7, 5, 6 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case105() {
    int[] data = { 1, 50, 2, 49, 3, 48, 4, 47, 5, 45, 6, 44, 7, 43, 8, 42, 9, 41, 10, 40, 11, 39, 12, 38, 13, 37, 14, 36, 15, 35, 16, 34, 17, 33, 18, 32, 19, 31, 20, 30, 21, 29, 22, 28, 23, 27, 24, 26, 25 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case106() {
    int[] data = { 0, 10, 3, 4, 5, 11, 9 };
    assertEquals(2, dequesort.minDeques(data));
  }

  @Test
  public void case107() {
    int[] data = { 3, 6, 0, 9, 5, 4, 7 };
    assertEquals(3, dequesort.minDeques(data));
  }

}
