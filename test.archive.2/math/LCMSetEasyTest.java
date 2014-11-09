package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class LCMSetEasyTest {
  LCMSetEasy lcmseteasy = new LCMSetEasy();

  @Test
  public void case1() {
    int[] S = { 2, 3, 4, 5 };
    int x = 20;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case2() {
    int[] S = { 2, 3, 4 };
    int x = 611;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case3() {
    int[] S = { 2, 3, 4 };
    int x = 12;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case4() {
    int[] S = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int x = 24;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case5() {
    int[] S = { 100, 200, 300, 400, 500, 600 };
    int x = 2000;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case6() {
    int[] S = { 100, 200, 300, 400, 500, 600 };
    int x = 8000;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case7() {
    int[] S = { 1000000000, 999999999, 999999998 };
    int x = 999999999;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case8() {
    int[] S = { 8648, 653, 1058, 134, 827, 170, 42, 3, 82150, 5, 74242, 2 };
    int x = 775726;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case9() {
    int[] S = { 4166867, 22524 };
    int x = 22524;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case10() {
    int[] S = { 2, 13, 761, 52, 70, 64, 66, 410, 566, 918, 6566, 67, 1, 542, 6865, 4558 };
    int x = 64957438;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case11() {
    int[] S = { 104, 917, 541, 5, 45965, 248, 4604088, 76015397, 14088, 8, 986265, 72603, 3299, 5980263, 686, 16, 88742, 5027112, 52, 2403479, 36124, 3929, 38, 489653, 2369, 867513, 55545860, 81590, 15, 10, 3 };
    int x = 882002973;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case12() {
    int[] S = { 5, 8200, 1866, 120, 8, 7588, 5793, 49, 32, 555, 891, 746, 621, 5690, 7, 56, 8982, 34, 1, 5717 };
    int x = 190010400;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case13() {
    int[] S = { 862, 6048, 478, 156, 78, 2321, 23, 113, 697, 5, 7232, 10, 6, 1, 9, 2427, 104, 460, 196, 6599, 4, 3, 129, 9129, 6840, 992, 32, 474, 13, 8642, 8, 6082, 517, 3130, 3416, 368, 5583, 401, 555, 2, 540, 577, 674, 91, 5673 };
    int x = 779399712;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case14() {
    int[] S = { 4063, 3487464, 6536, 63, 5242268, 6, 34983, 7825, 9893654, 7, 984, 3685980 };
    int x = 45752;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case15() {
    int[] S = { 360, 9, 8522, 996, 688, 2053636, 77640, 75760, 435, 66763, 503, 680, 9150, 550260, 8831, 43, 6142, 3436, 4, 7889, 64810, 2821, 290250, 59402, 208288, 9994, 613, 19737, 7483, 64, 896545, 463, 5333061, 5, 447308 };
    int x = 3075910;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case16() {
    int[] S = { 94, 37, 66, 1, 7, 31, 58, 69, 36, 5, 10, 3, 56, 39, 92, 4, 49, 6, 78, 99, 97, 25, 79, 63, 61, 91, 27, 59, 96, 67, 9 };
    int x = 722272782;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case17() {
    int[] S = { 41, 2826746, 9054871, 76487, 15723, 5945, 25, 60, 85, 38376, 6, 1131351, 149, 5940, 7, 45, 63775, 54, 79572, 7442, 306227, 42135 };
    int x = 371249711;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case18() {
    int[] S = { 9788, 8418, 10, 35, 55, 7250 };
    int x = 37683800;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case19() {
    int[] S = { 20, 79, 10, 43, 11 };
    int x = 373670;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case20() {
    int[] S = { 860608562, 806, 10, 669455, 261105394, 740266775, 5418973, 939845, 899, 508564, 7997168, 4092, 96663580 };
    int x = 770928;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case21() {
    int[] S = { 3, 737, 77, 28, 718, 74, 83, 5, 1, 82, 344, 9, 426, 13, 7, 400, 991, 810, 826 };
    int x = 5449;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case22() {
    int[] S = { 2892, 76, 4, 98753485, 461, 1, 5330, 5175407, 97538281, 615, 567684, 5, 10455969, 3, 89428, 74267101, 99732, 9895975, 7, 65639, 955, 663724, 20284354, 49030240, 7528, 82, 613, 2, 280, 36651, 814, 120, 92345545, 44, 6339105, 931021 };
    int x = 4034;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case23() {
    int[] S = { 81780, 2, 172, 9434, 43082, 80, 655, 187, 624, 606373, 4, 768414, 58, 70242, 302713, 98, 95, 42030, 2107, 734159, 20, 51, 33, 3, 36468, 10, 953, 69136, 591516, 83, 94, 7, 8, 858, 776071, 52811, 5, 56153, 704, 63769, 50842, 6, 369, 841439, 885, 937, 75 };
    int x = 118;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case24() {
    int[] S = { 5027, 6, 45, 8540, 40230, 36194, 831, 3, 9, 61869, 556, 8942, 15, 10, 56 };
    int x = 11143710;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case25() {
    int[] S = { 710740, 5, 726104752, 9513818, 14075381, 67, 250765018, 7500801, 8418, 948, 2095487, 55506 };
    int x = 66596726;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case26() {
    int[] S = { 402, 217, 917962, 18, 69570, 6, 10, 837, 792, 7444, 4720, 5694169, 118, 8140, 7 };
    int x = 13085100;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case27() {
    int[] S = { 843798298, 2163, 17402471, 1, 498797355, 3, 395799679, 313380, 360513, 4, 765382, 5240475, 181723, 7, 75, 2424, 26, 6311520, 934453 };
    int x = 498797355;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case28() {
    int[] S = { 3362, 5558, 523, 33, 3, 382, 6, 9, 70, 2212, 3196, 893, 7, 49, 1, 733, 3326, 41, 2662, 332, 314, 58, 10, 373, 380, 15, 43, 4141, 2686, 227, 7190, 93, 5, 54, 335, 398, 90 };
    int x = 924956802;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case29() {
    int[] S = { 799 };
    int x = 7990;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case30() {
    int[] S = { 293, 5, 40, 740, 10, 13, 609, 3, 1, 9, 965, 23, 86, 945, 978, 17, 6, 43, 19, 8, 7, 182, 70, 4, 807 };
    int x = 35936140;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case31() {
    int[] S = { 5036, 544, 7, 87 };
    int x = 35252;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case32() {
    int[] S = { 368660, 66, 77, 30931, 129804, 7, 10904, 565, 987, 5, 30, 97007, 846437, 251077, 15, 607, 93365, 11639, 11, 99, 1789, 307035, 853, 63851, 4, 747542, 832 };
    int x = 425802300;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case33() {
    int[] S = { 86, 6, 53, 10, 60, 74, 1920, 1, 76, 3818, 7, 151, 8143, 54, 9, 748, 634, 50, 556, 4, 90, 6632, 45, 13, 398, 9883, 17, 717, 2917, 11, 48, 5658, 85, 5760, 7694, 322, 39, 144, 909, 8, 2 };
    int x = 226867268;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case34() {
    int[] S = { 14323, 87093007, 63089, 61211, 23503991, 5095247, 493, 5362641, 37, 18529426, 3863020, 225737, 36098103, 71, 407, 73147, 6349 };
    int x = 23503991;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case35() {
    int[] S = { 704, 161, 5 };
    int x = 10;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case36() {
    int[] S = { 7, 472714, 5805, 4356, 6, 553, 65, 361, 527, 75949, 891, 1, 4, 209, 8, 886, 755, 9, 26316, 895, 87028, 7711, 376, 2, 218, 8468, 8039, 29, 319, 788, 25869, 55196, 6043, 1942, 545, 17, 27, 423734, 30245, 35, 89123, 9076, 390, 5601 };
    int x = 87233256;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case37() {
    int[] S = { 78, 7, 9, 829, 958, 511 };
    int x = 377285546;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case38() {
    int[] S = { 5, 6, 29, 3, 466, 9, 462, 98, 205, 172, 77, 765, 55, 897, 49, 41, 869, 8, 247, 48, 4, 431, 89, 36, 351, 27, 68, 645 };
    int x = 91631243;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case39() {
    int[] S = { 43, 29, 5, 8, 1, 91, 58, 39, 7, 79, 97, 30, 98, 4, 28, 3, 90, 49, 93, 42, 87, 18, 6, 47, 54, 89, 73, 12, 21, 64, 60 };
    int x = 135577260;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case40() {
    int[] S = { 7427411, 96, 2676, 9327732, 502, 874624, 7483996, 2957, 49, 8234, 49339367, 20125225, 657, 51, 69098690, 6283, 50, 86671101, 44142, 59531102, 733 };
    int x = 63303456;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case41() {
    int[] S = { 892, 688, 99, 1000, 48, 2326, 5, 2, 3144, 116, 6, 7, 3, 67, 7555, 89, 10, 8965, 1, 2357, 77, 9062, 9, 244, 8, 6046, 35 };
    int x = 531614160;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case42() {
    int[] S = { 80, 571549, 6845319, 21, 428117, 79197, 5818273, 549333907, 1, 7794038, 34098, 17416174, 9238, 35824, 84, 38804, 9272153, 638134, 273309715, 835, 46418, 66525142 };
    int x = 1363920;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case43() {
    int[] S = { 5526, 10, 3395, 92, 9, 9814, 2656, 63, 3364, 593, 14, 8053, 56, 2734, 6, 921, 1, 781, 8, 8910, 1205, 740, 8702, 876, 859, 5161, 8000, 391, 87, 86, 2218, 9992, 7852, 293, 48, 754, 563, 862, 11, 622, 33, 3101, 836, 1522, 4499 };
    int x = 168786144;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case44() {
    int[] S = { 8632, 8, 98867068, 1 };
    int x = 8632;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case45() {
    int[] S = { 6, 4, 14364, 2984, 3120, 1, 9, 74234, 86, 1601, 7744, 16063, 167, 92, 46, 4166, 39, 9997, 9099, 8, 3, 38992, 10, 555, 174, 278, 48268, 2834 };
    int x = 73417426;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case46() {
    int[] S = { 438, 3593 };
    int x = 1573734;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case47() {
    int[] S = { 1579, 6276, 63, 8242, 4, 43, 63228, 3, 876944, 539429, 1662, 622, 994, 10, 7702, 476521, 20179, 35, 2, 40337, 82269, 871, 57032, 230, 878504, 34431, 9, 6055, 95, 94, 33699, 1, 7, 470128, 50, 71785, 14, 323, 7707, 8 };
    int x = 508;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case48() {
    int[] S = { 9, 20, 6, 794, 419, 779, 66, 758, 5, 46, 58, 368, 41, 29, 32, 785, 11, 8, 117, 26, 88, 182, 59, 101, 7, 4, 2, 31, 91, 80, 10, 23, 53, 701, 998, 346, 74, 78, 3, 530, 660, 57, 95, 285, 83, 499, 350, 896, 681, 964 };
    int x = 123626594;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case49() {
    int[] S = { 258, 50, 373, 1761, 9, 907, 10, 85, 5791, 4869, 635, 85887, 16032, 381, 4844, 827, 981, 97, 30, 5088, 3, 39, 98084, 462, 73578, 862, 17, 930, 4, 877, 1, 22, 93230, 8793, 26, 879, 833, 9669, 77753, 4288, 44929, 8, 127, 41, 56, 2987, 71389 };
    int x = 305542950;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case50() {
    int[] S = { 7277, 964, 3844, 6, 2, 4049, 307, 503, 2039, 187, 3980, 9908, 4819 };
    int x = 29464573;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case51() {
    int[] S = { 8, 93, 371, 2, 8717, 986, 1, 55, 1661, 218, 5086, 5, 440, 28, 88, 817, 4070, 321, 654, 510, 11, 10, 95 };
    int x = 3963;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case52() {
    int[] S = { 3171, 29559, 26506, 4502, 2149, 68, 49, 54573, 2304054, 9, 5398, 4660, 727, 8965, 4186, 94195, 4, 6901096, 666, 10, 7, 830, 78096, 9399890, 505734, 6773, 295, 40651, 9407186, 7582514, 61632, 53, 8372 };
    int x = 937315890;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case53() {
    int[] S = { 753, 59, 51, 9425, 568, 64, 848, 41, 7, 2, 6252, 24, 11, 95, 29, 53, 4617, 85, 1087, 3, 40, 89, 6, 8888, 79, 8, 87, 4, 4603, 18, 7135, 44, 8570, 2888, 32, 7821, 978, 7158, 5, 5884, 4805, 34, 6705, 739, 63, 311, 845, 9, 99 };
    int x = 428987112;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case54() {
    int[] S = { 357695, 190314, 4, 28189, 5, 24, 4599925, 83055, 1585, 6, 9, 40012, 92, 785670, 6606806, 22, 3819225, 432, 801226, 256, 16469, 41982 };
    int x = 4006130;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case55() {
    int[] S = { 1254800, 10, 6250381, 7, 35444345, 144380726, 58927, 1, 4, 87, 180, 745679, 2098558, 29906, 573219, 209, 894, 28112, 849, 4403, 37 };
    int x = 764173200;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case56() {
    int[] S = { 476845, 10238, 74, 6829, 9503, 85, 640162, 38571, 193813, 631622, 2156, 6, 7848, 24961, 455, 58, 568, 3, 66, 675, 2, 75793, 923452, 10, 65, 598029, 78181, 895, 36, 531447, 10020, 83, 5, 64758, 56, 2770, 59, 546132, 802935, 9813, 1, 2861, 5571, 54, 9440, 9775, 8, 163 };
    int x = 599871010;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case57() {
    int[] S = { 991, 91, 535, 37, 8, 90, 9, 1, 3, 680, 34, 95, 94, 62, 276, 881, 567 };
    int x = 414447;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case58() {
    int[] S = { 96, 72, 51, 9 };
    int x = 1224;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case59() {
    int[] S = { 98701, 8800, 6191, 15, 150, 69319, 9, 182, 691, 601, 91367, 7, 49639, 2954, 31, 24, 8, 1699, 893, 2373, 6953, 11 };
    int x = 288961408;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case60() {
    int[] S = { 82, 62, 82697, 924193, 6732275, 413727, 67107, 52, 1093, 711291, 9, 3, 82359, 9914, 48, 758, 58, 895, 8607, 24, 949, 957535, 9501 };
    int x = 75783826;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case61() {
    int[] S = { 1129, 196, 61, 77, 2941, 219, 5341, 65, 4, 22, 660, 60, 960, 619, 983, 647, 3, 71, 7, 934, 671, 11, 1375, 754, 5, 8586, 872, 473, 55, 941, 37, 615 };
    int x = 523200;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case62() {
    int[] S = { 1, 7177955, 16, 7, 94, 31, 6456, 2, 87614, 62954, 10, 33, 6428038, 38, 8213045, 783625, 151973, 182, 977786, 868, 982, 6320, 6472099, 7516, 453, 822, 9048484, 730931, 90, 400, 210264, 1996, 89396, 1285, 29707, 34497, 819, 282014, 70555 };
    int x = 574236400;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case63() {
    int[] S = { 5553, 4, 97971, 103621, 9215, 7289, 30676, 231108, 8584, 184, 29, 543906, 65, 84, 8, 7553 };
    int x = 181344321;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case64() {
    int[] S = { 67395, 25134, 98791, 43058, 657029, 710481, 8245, 31949, 10, 531027, 914890, 97360, 9331, 36887, 665, 268, 75, 8, 97675, 4389, 61, 647311, 8015, 338, 16, 7, 599, 5095, 75208, 6924, 3699, 4, 915, 886 };
    int x = 4303;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case65() {
    int[] S = { 10, 6464, 2034, 742, 8, 5496, 63, 8907, 2419 };
    int x = 6406;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case66() {
    int[] S = { 77, 34557, 256, 746, 839031, 9, 4410, 231, 1, 32553, 9626, 94, 23023, 532059, 41, 730050 };
    int x = 25779522;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case67() {
    int[] S = { 9975580, 202, 84329, 55320895, 5944636, 3930, 14, 4037099, 289585, 641992, 2517474, 484, 70152762, 92009623, 36401, 321, 90187747, 2, 564103, 16139, 306, 6306212, 1, 6 };
    int x = 719300956;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case68() {
    int[] S = { 1404, 51, 698, 34, 4, 13, 30, 81, 23, 1, 734, 585, 48, 54, 96, 565, 52, 617, 980, 70, 1953, 2472, 2275, 166, 3, 5634, 8612, 4789, 45, 5, 881, 10, 348 };
    int x = 9;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case69() {
    int[] S = { 5031, 11, 15395, 24743893, 9166, 255, 6155, 5306, 62820, 5932, 547, 10424738, 371703003, 985023993, 9599, 124924976, 79, 4243, 383, 917486 };
    int x = 66891275;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case70() {
    int[] S = { 92, 40612554, 586, 96617863, 186078, 7355670, 4604894, 4524350, 25403, 72120615, 4854, 852, 637820, 718886960, 56590004, 62514336, 725, 447655, 58749, 311172, 2, 3535133, 455481230, 819145904, 5188525, 6, 4566, 5973, 70, 634636781, 53280, 63006, 7, 621, 72505, 26495, 19, 94358727, 29, 8, 8095 };
    int x = 6;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case71() {
    int[] S = { 67, 21, 13, 68, 48, 1, 2, 10, 92, 8, 3, 9, 25, 50, 7, 5, 93, 4, 88, 38, 76, 14, 59, 91, 33, 6, 60, 56, 66, 16, 89, 62, 28, 79 };
    int x = 543008553;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case72() {
    int[] S = { 33964, 900, 3, 55, 65458, 952, 6, 5067124, 72078, 25066, 52960, 5856, 9041016, 2599, 751463, 7700427, 42199, 7, 5, 179616, 2463511 };
    int x = 283600800;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case73() {
    int[] S = { 3, 61, 56, 9, 2, 10, 27, 58, 68, 1, 96, 6, 8, 25, 40, 37, 7, 87, 99, 5, 12, 78, 80, 84, 76 };
    int x = 267472800;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case74() {
    int[] S = { 85, 6, 24, 3, 7, 38, 5, 57, 10, 13, 66, 44, 18, 4, 1, 9, 90, 96, 36, 2, 23, 16, 31, 22, 86, 77, 12, 49, 47, 40, 67, 53, 50, 41, 62, 42 };
    int x = 216384;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case75() {
    int[] S = { 2, 3, 4 };
    int x = 12;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case76() {
    int[] S = { 1000000000, 999999999, 999999998 };
    int x = 999999999;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case77() {
    int[] S = { 100, 200, 300, 400, 500, 600 };
    int x = 8000;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case78() {
    int[] S = { 6000000, 8000000 };
    int x = 24000000;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case79() {
    int[] S = { 2, 8 };
    int x = 16;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case80() {
    int[] S = { 5000000, 6000000 };
    int x = 30000000;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case81() {
    int[] S = { 1, 2 };
    int x = 20;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case82() {
    int[] S = { 1000000000, 999999999, 999999998, 999999997, 999999996, 999999995, 999999994, 999999993, 999999992, 999999991, 999999990, 999999989, 999999988, 999999987, 999999986, 999999985, 999999984, 999999983, 999999982, 999999981, 999999980, 999999979, 999999978, 999999977, 999999976, 999999975, 999999974, 999999973, 999999972, 999999971, 999999970, 999999969, 999999968, 999999967, 999999966, 999999965, 999999964, 999999963, 999999962, 999999961, 999999960, 999999959, 999999958, 999999957, 999999956, 999999955, 999999954, 999999953, 999999952 };
    int x = 1000;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case83() {
    int[] S = { 100, 200, 300, 400, 500, 600 };
    int x = 2000;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case84() {
    int[] S = { 595619502, 3, 912561327, 777762567, 482138661, 825049976, 956266151, 248315773, 633219928, 161055223, 533955415, 701653328, 514356447, 776311486, 207167212, 906287099, 840398188, 508368568, 796223764, 397122898, 699444056, 206897334, 632551577, 491089685, 361694749, 795352934, 559167496, 875072845, 962610587, 617234394, 314322234, 243726905, 975320696, 678744365, 490678285, 970980437, 189245343, 193064210, 227551235, 452024742, 179187233, 990891321, 905697962, 967647230, 209268736, 949394055, 652017642, 477252109, 213814282, 7 };
    int x = 1067856;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case85() {
    int[] S = { 16, 81, 625, 425, 51, 848, 2134165, 17 };
    int x = 810000;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case86() {
    int[] S = { 3, 5, 7 };
    int x = 105;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case87() {
    int[] S = { 2000, 3000, 5000 };
    int x = 30000;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case88() {
    int[] S = { 1000000000, 2, 5, 10 };
    int x = 1000000000;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case89() {
    int[] S = { 16, 81, 625 };
    int x = 810000;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case90() {
    int[] S = { 2, 3, 4, 5 };
    int x = 20;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case91() {
    int[] S = { 3, 4, 5 };
    int x = 60;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case92() {
    int[] S = { 2, 3, 5 };
    int x = 30;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case93() {
    int[] S = { 4, 14, 10 };
    int x = 70;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case94() {
    int[] S = { 2, 3, 5, 7, 9, 11, 13, 17, 21, 23, 27 };
    int x = 1155;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case95() {
    int[] S = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44 };
    int x = 5454512;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case96() {
    int[] S = { 12, 15 };
    int x = 60;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case97() {
    int[] S = { 1000000000, 999999999, 999999998, 999999997, 999999996, 999999995, 999999994, 999999993, 999999992, 999999991, 999999990, 999999989, 999999988, 999999987, 999999986, 999999985, 999999984, 999999983, 999999982, 999999981, 999999980, 999999979, 999999978, 999999977, 999999976, 999999975, 999999974, 999999973, 999999972, 999999971, 999999970, 999999969, 999999968, 999999967, 999999966, 999999965, 999999964, 999999963, 999999962, 999999961, 999999960, 999999959, 999999958, 999999957, 999999956, 999999955, 999999954, 999999953, 999999952, 999999951 };
    int x = 20;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case98() {
    int[] S = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35 };
    int x = 74;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case99() {
    int[] S = { 2, 5, 7 };
    int x = 70;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case100() {
    int[] S = { 2 };
    int x = 2;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case101() {
    int[] S = { 1000000000, 5 };
    int x = 1000000000;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case102() {
    int[] S = { 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 14 };
    int x = 1000000000;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case103() {
    int[] S = { 100003, 100019, 100043, 100049, 100057, 100069, 100103, 100109, 100129, 100151, 100153, 100169, 100183, 100189, 100193, 100207, 100213, 100237, 100267, 100271, 100279, 100291, 100297, 100313, 100333, 100343, 100357, 100361, 100363, 100379, 100391, 100393, 100403, 100411, 100417, 100447, 100459, 100469, 100483, 100493, 100501, 100511, 100517, 100519, 100523, 100537, 100547, 100549, 100559 };
    int x = 1000000000;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case104() {
    int[] S = { 2, 3 };
    int x = 12;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case105() {
    int[] S = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22 };
    int x = 232792560;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case106() {
    int[] S = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int x = 210;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case107() {
    int[] S = { 3, 4, 5, 8, 7 };
    int x = 24;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case108() {
    int[] S = { 500000000, 200000000 };
    int x = 1000000000;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case109() {
    int[] S = { 999999937 };
    int x = 10;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case110() {
    int[] S = { 3, 5, 7, 11, 13, 17, 19 };
    int x = 4849845;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case111() {
    int[] S = { 13466917, 44353434, 3, 5, 65435345, 7543534, 78, 8999, 866, 977, 8888, 695, 73, 745, 82, 94, 59989888, 433, 4, 5234, 64234, 7234, 2234, 26170819, 7234999, 723488, 8234, 954, 77345, 884, 432432434 };
    int x = 52341638;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case112() {
    int[] S = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71 };
    int x = 412595806;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case113() {
    int[] S = { 2, 3, 5, 6, 7, 10, 11, 13, 14, 15, 17, 21, 22, 26, 30, 33, 35, 39, 42, 55, 65, 66, 70, 77, 78, 91, 105, 110, 130, 143, 154, 165, 182, 195, 210, 231, 273, 286, 330, 385, 390, 429, 455, 462, 546, 770, 910, 1155, 1365, 2310 };
    int x = 1021020;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case114() {
    int[] S = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51 };
    int x = 999999997;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case115() {
    int[] S = { 3, 4, 5, 10 };
    int x = 60;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case116() {
    int[] S = { 13466917, 44353434, 3, 5, 65435345, 7543534, 78, 8999, 866, 977, 8888, 695, 73, 745, 82, 94, 59989888, 433, 4, 5234, 64234, 7234, 2234, 26170819, 7234999, 723488, 8234, 2, 77345, 884, 432432434 };
    int x = 52341638;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case117() {
    int[] S = { 10000000, 100000000 };
    int x = 100000000;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case118() {
    int[] S = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 100 };
    int x = 100;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case119() {
    int[] S = { 1000000, 1000000000 };
    int x = 1000000000;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case120() {
    int[] S = { 3, 4, 5 };
    int x = 15;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case121() {
    int[] S = { 900000001, 900000002, 900000003, 900000004, 900000005 };
    int x = 900000005;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case122() {
    int[] S = { 10, 23 };
    int x = 100;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case123() {
    int[] S = { 4, 6, 11, 7 };
    int x = 84;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case124() {
    int[] S = { 2, 3, 4, 5, 7 };
    int x = 42;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case125() {
    int[] S = { 2, 5, 40 };
    int x = 20;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case126() {
    int[] S = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    int x = 1000000000;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case127() {
    int[] S = { 999221, 999233, 999239, 999269, 999287, 999307, 999329, 999331, 999359, 999371, 999377, 999389, 999431, 999433, 999437, 999451, 999491, 999499, 999521, 999529, 999541, 999553, 999563, 999599, 999611, 999613, 999623, 999631, 999653, 999667, 999671, 999683, 999721, 999727, 999749, 999763, 999769, 999773, 999809, 999853, 999863, 999883, 999907, 999917, 999931, 999953, 999959, 999961, 999979, 999983 };
    int x = 1000000;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case128() {
    int[] S = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 500, 502, 503, 508, 620, 897, 497, 268, 24323324, 556457, 2342367, 2344211, 97533, 46789, 32468975, 346789, 45668, 2342311, 243578, 123912, 3567853, 123332, 864223, 579896, 228521468, 7632235, 2357322, 62234232, 7821122, 6723214 };
    int x = 12692568;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case129() {
    int[] S = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100, 105, 110, 115, 120, 125, 130, 135, 140, 145, 150, 155, 160, 165, 170, 175, 180, 185, 190, 195, 200, 205, 210, 215, 220, 225, 230, 235, 240, 245 };
    int x = 3;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case130() {
    int[] S = { 10000000, 1000000 };
    int x = 10000000;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case131() {
    int[] S = { 5, 900000001 };
    int x = 205032709;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case132() {
    int[] S = { 2, 3, 4, 5, 6, 7, 8, 9, 1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42 };
    int x = 1000000;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case133() {
    int[] S = { 500000000, 2, 4, 8, 16, 32, 5, 10, 20, 40, 100000000, 200000000, 250000000 };
    int x = 1000000000;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case134() {
    int[] S = { 1, 2, 3, 4, 5 };
    int x = 60;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case135() {
    int[] S = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    int x = 101;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case136() {
    int[] S = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 39 };
    int x = 78;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case137() {
    int[] S = { 2, 3, 5, 7 };
    int x = 210;
    assertEquals("Possible", lcmseteasy.include(S, x));
  }

  @Test
  public void case138() {
    int[] S = { 999999999, 999999998, 999999997, 999999996, 999999995, 999999994, 999999993, 999999992, 999999991, 999999990, 999999989, 999999988, 999999987, 999999986, 999999985, 999999984, 999999983, 999999982, 999999981, 999999980, 999999979, 999999978, 999999977, 999999976, 999999975, 999999974, 999999973, 999999972, 999999971, 999999970, 999999969, 999999968, 999999967, 999999966, 999999965, 999999964, 999999963, 999999962, 999999961, 999999960, 999999959, 999999958, 999999957, 999999956, 999999955 };
    int x = 1000000000;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

  @Test
  public void case139() {
    int[] S = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43 };
    int x = 101;
    assertEquals("Impossible", lcmseteasy.include(S, x));
  }

}
