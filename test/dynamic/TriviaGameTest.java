package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class TriviaGameTest {
  TriviaGame triviagame = new TriviaGame();

  @Test
  public void case1() {
    int[] points = { 1, 2, 3, 4, 5, 6 };
    int tokensNeeded = 3;
    int[] bonuses = { 4, 4, 4, 4, 4, 4 };
    assertEquals(29, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case2() {
    int[] points = { 1, 2, 3, 4, 5, 6 };
    int tokensNeeded = 3;
    int[] bonuses = { 1, 1, 1, 20, 1, 1 };
    assertEquals(39, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case3() {
    int[] points = { 150, 20, 30, 40, 50 };
    int tokensNeeded = 3;
    int[] bonuses = { 0, 0, 0, 250, 0 };
    assertEquals(500, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case4() {
    int[] points = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
    int tokensNeeded = 1;
    int[] bonuses = { 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000 };
    assertEquals(550000, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case5() {
    int[] points = { 0 };
    int tokensNeeded = 12;
    int[] bonuses = { 10000 };
    assertEquals(0, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case6() {
    int[] points = { 500, 500, 500, 0, 500 };
    int tokensNeeded = 3;
    int[] bonuses = { 0, 0, 0, 500, 0 };
    assertEquals(2000, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case7() {
    int[] points = { 123, 12, 19, 37, 11, 8, 94 };
    int tokensNeeded = 3;
    int[] bonuses = { 10000, 3, 10, 20, 300, 7, 6000 };
    assertEquals(6300, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case8() {
    int[] points = { 234, 235, 545, 641, 31, 535, 609, 328, 932, 1000, 20, 343, 20, 111, 585, 20, 330, 50, 789, 999, 230, 589, 590, 0, 392, 10, 383, 509, 203, 2, 209, 389, 3, 50, 32, 18, 28, 30, 5, 39, 230, 489, 48, 2, 3, 5, 7, 8, 1, 0 };
    int tokensNeeded = 11;
    int[] bonuses = { 3209, 350, 0, 0, 0, 0, 0, 0, 253, 0, 0, 0, 32, 2039, 1, 30, 39, 0, 5, 100, 10000, 3210, 30, 0, 2039, 9098, 9099, 1, 0, 0, 0, 0, 0, 3, 2, 10, 22, 34, 10000, 9, 0, 0, 0, 10000, 0, 0, 120, 3, 2, 1 };
    assertEquals(33847, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case9() {
    int[] points = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
    int tokensNeeded = 10;
    int[] bonuses = { 0, 0, 0, 0, 0, 0, 0, 0, 10000, 0, 0, 0, 0, 0, 0, 0, 0, 10000, 0, 0, 0, 0, 0, 0, 0, 0, 10000, 0, 0, 0, 0, 0, 0, 0, 0, 10000, 0, 0, 0, 0, 0, 0, 0, 0, 10000, 0, 0, 0, 0, 10000 };
    assertEquals(31000, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case10() {
    int[] points = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
    int tokensNeeded = 10;
    int[] bonuses = { 0, 0, 0, 0, 0, 0, 0, 0, 10000, 0, 0, 0, 0, 0, 0, 0, 0, 2000, 0, 0, 0, 0, 0, 0, 0, 0, 10000, 0, 0, 0, 0, 0, 0, 0, 0, 4000, 0, 0, 0, 0, 0, 0, 0, 0, 10000, 0, 0, 0, 0, 10000 };
    assertEquals(23000, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case11() {
    int[] points = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 0, 100, 0, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 0, 0, 0, 0, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
    int tokensNeeded = 10;
    int[] bonuses = { 0, 0, 0, 0, 0, 0, 0, 0, 10000, 0, 0, 0, 0, 0, 0, 0, 0, 2000, 0, 0, 0, 0, 0, 0, 0, 0, 10000, 0, 0, 0, 0, 0, 0, 0, 0, 4000, 0, 0, 0, 0, 0, 0, 0, 0, 2000, 0, 0, 0, 0, 10000 };
    assertEquals(23400, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case12() {
    int[] points = { 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
    int tokensNeeded = 10;
    int[] bonuses = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1000, 0 };
    assertEquals(1084, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case13() {
    int[] points = { 123, 234, 345, 456, 1, 2, 3, 4, 5, 6 };
    int tokensNeeded = 4;
    int[] bonuses = { 0, 0, 0, 1, 2, 3, 120, 5, 2, 1 };
    assertEquals(1185, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case14() {
    int[] points = { 449, 328, 474, 150, 709, 467, 329, 936, 440, 700, 117, 258, 811, 952, 491, 993, 931, 823, 431, 359, 590, 899, 153, 292, 370, 404, 698, 699, 876, 442, 705, 757, 527, 868, 893, 642, 273, 18, 885, 675, 788, 291 };
    int tokensNeeded = 34;
    int[] bonuses = { 7672, 4664, 5140, 7711, 8251, 6868, 5545, 7642, 2659, 2754, 35, 2858, 8723, 9741, 7527, 778, 2315, 3035, 2188, 1842, 288, 103, 9040, 8942, 9263, 2646, 7444, 3803, 5889, 6729, 4368, 5349, 5005, 1098, 4391, 3548, 9628, 2622, 4082, 9953, 8755, 1839 };
    assertEquals(32681, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case15() {
    int[] points = { 369, 918, 282, 928, 407, 602, 312, 532, 517, 102, 80, 907, 525, 829, 84, 635, 629 };
    int tokensNeeded = 5;
    int[] bonuses = { 9930, 3976, 2306, 1670, 2384, 5021, 8743, 6922, 9071, 6270, 5829, 6775, 5572, 5097, 6511, 3984, 3289 };
    assertEquals(26163, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case16() {
    int[] points = { 618, 333, 743, 632, 559, 27, 40, 323, 149, 925, 703, 953 };
    int tokensNeeded = 31;
    int[] bonuses = { 1104, 188, 8006, 1336, 5456, 2286, 7751, 382, 4944, 8909, 2206, 9758 };
    assertEquals(6005, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case17() {
    int[] points = { 570, 416, 922, 479, 17, 397, 139, 900, 559, 744, 654, 393, 353, 597, 517, 527, 477, 568, 37, 599, 326, 281 };
    int tokensNeeded = 37;
    int[] bonuses = { 9374, 1019, 4596, 4019, 7346, 3197, 9667, 4482, 8281, 4734, 53, 1999, 6416, 7936, 6900, 3788, 8126, 467, 3728, 4892, 4646, 2481 };
    assertEquals(10472, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case18() {
    int[] points = { 419, 296, 611, 791, 505, 295, 609, 917 };
    int tokensNeeded = 2;
    int[] bonuses = { 598, 5249, 6518, 1553, 2796, 300, 6224, 1007 };
    assertEquals(19389, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case19() {
    int[] points = { 577, 975, 670, 192, 465, 90, 329, 493, 586, 285, 494, 441, 175, 445, 612, 560, 777, 784, 266, 570, 778, 982, 130, 452, 599, 520, 280, 32, 155, 172, 628, 951, 185, 796, 866, 137, 500, 186, 632, 248, 35, 308, 624, 336, 882 };
    int tokensNeeded = 26;
    int[] bonuses = { 8431, 9867, 140, 3842, 1416, 1879, 1995, 321, 8650, 20, 5699, 3557, 8474, 7890, 4387, 5075, 711, 2600, 2510, 1001, 6867, 7860, 4687, 3400, 9789, 5254, 6422, 5002, 584, 4180, 284, 7086, 1423, 8615, 3755, 9832, 929, 4169, 2154, 5719, 7188, 9975, 1326, 2368, 8690 };
    assertEquals(27678, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case20() {
    int[] points = { 545, 431, 533, 434, 503, 115, 42, 697, 750, 123, 411, 263, 971, 671, 517, 527, 420, 847, 937, 193, 172, 294, 396, 258, 89, 464 };
    int tokensNeeded = 33;
    int[] bonuses = { 2454, 5732, 8113, 1700, 1313, 669, 5786, 2262, 4313, 4353, 1182, 51, 912, 807, 1832, 943, 4313, 7754, 8319, 9557, 3644, 7980, 481, 4144, 3194, 220 };
    assertEquals(11603, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case21() {
    int[] points = { 159, 530, 430, 162, 456, 32, 638, 266, 413, 236, 4, 128, 481, 741, 629, 173, 305, 470, 995, 166, 4, 769, 896, 941, 384, 192, 622, 451, 410, 305 };
    int tokensNeeded = 25;
    int[] bonuses = { 9332, 5872, 4370, 157, 1832, 8068, 7487, 8295, 7518, 8177, 7772, 2267, 1763, 2668, 7191, 3984, 3102, 8480, 9211, 7627, 4802, 4099, 524, 2625, 1543, 1924, 1022, 9970, 3060, 4180 };
    assertEquals(22278, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case22() {
    int[] points = { 405, 488, 566, 703 };
    int tokensNeeded = 32;
    int[] bonuses = { 8492, 142, 7221, 1283 };
    assertEquals(2162, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case23() {
    int[] points = { 893, 168, 352, 391, 944, 256, 141, 235, 803, 692, 735, 878, 663, 278, 538 };
    int tokensNeeded = 41;
    int[] bonuses = { 3693, 2695, 1622, 8017, 2125, 6574, 1692, 2656, 6300, 7370, 2464, 4678, 2591, 3849, 5482 };
    assertEquals(7967, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case24() {
    int[] points = { 436, 98, 129, 798, 69, 29, 925, 1, 753, 138, 295, 567, 197, 31, 736, 157, 104, 875, 69 };
    int tokensNeeded = 16;
    int[] bonuses = { 3487, 9575, 4473, 2625, 5625, 5629, 1925, 5421, 8518, 6902, 4961, 123, 4594, 3737, 3260, 194, 2522, 1264, 8260 };
    assertEquals(14545, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case25() {
    int[] points = { 108, 25, 306 };
    int tokensNeeded = 12;
    int[] bonuses = { 768, 6411, 5545 };
    assertEquals(439, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case26() {
    int[] points = { 499, 761, 910, 158 };
    int tokensNeeded = 14;
    int[] bonuses = { 4940, 849, 8661, 3828 };
    assertEquals(2328, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case27() {
    int[] points = { 696 };
    int tokensNeeded = 9;
    int[] bonuses = { 7577 };
    assertEquals(696, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case28() {
    int[] points = { 995, 466, 199, 32, 433, 301, 748, 338, 322, 471, 103, 92, 873, 782, 828, 446 };
    int tokensNeeded = 29;
    int[] bonuses = { 2992, 7382, 9404, 6540, 1108, 8702, 2834, 2353, 6072, 9348, 8822, 4484, 554, 3214, 1626, 9357 };
    assertEquals(7429, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case29() {
    int[] points = { 344, 308, 248, 846, 332, 884, 9, 588, 102, 705, 678, 574, 17, 399, 105, 205, 561, 553, 924, 274, 826, 41, 946, 581, 705, 648, 956 };
    int tokensNeeded = 8;
    int[] bonuses = { 4368, 2530, 2963, 2607, 2483, 911, 1634, 66, 2846, 4675, 2937, 2223, 2140, 3752, 6511, 2739, 173, 1457, 7824, 3221, 7869, 1626, 1931, 5204, 1780, 3848, 7397 };
    assertEquals(32999, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case30() {
    int[] points = { 679, 181, 722, 636, 508, 551, 992, 166, 680, 956, 538, 866, 300, 399, 625, 836, 831, 129, 451, 584, 847, 404, 646, 751, 425, 268, 661, 30, 304, 875 };
    int tokensNeeded = 23;
    int[] bonuses = { 2817, 610, 1017, 4931, 8110, 692, 3168, 3829, 38, 6486, 8683, 9089, 9496, 2589, 5988, 5144, 9352, 9313, 8650, 6738, 2042, 1257, 335, 8759, 1191, 7605, 5262, 2180, 8501, 3829 };
    assertEquals(25342, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case31() {
    int[] points = { 588, 263, 992, 532, 527, 536, 596, 461, 512, 103, 209, 786, 145, 581, 71, 195, 675, 205, 969, 799, 596, 369, 744, 668, 402, 1000 };
    int tokensNeeded = 35;
    int[] bonuses = { 74, 8785, 5497, 4968, 6287, 3845, 2601, 503, 1219, 2661, 5706, 2363, 9010, 2169, 7487, 8239, 2163, 5540, 7619, 911, 7591, 6704, 1815, 9232, 750, 5203 };
    assertEquals(13524, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case32() {
    int[] points = { 538, 303, 411, 77, 236, 571, 635, 969, 847, 891, 64, 524, 684, 529, 660, 768, 247, 511, 972, 261, 929, 863, 522, 222, 483, 290 };
    int tokensNeeded = 21;
    int[] bonuses = { 9601, 8321, 1130, 4470, 7150, 5085, 8568, 9761, 9899, 7102, 4422, 3527, 1599, 6967, 4014, 5565, 28, 1541, 5345, 2088, 2943, 2636, 2407, 6461, 5049, 4681 };
    assertEquals(19714, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case33() {
    int[] points = { 331, 608, 28, 200, 757, 925, 868, 132, 690, 942, 831, 409, 595, 748, 40, 532, 763, 17, 194, 170, 31, 844, 604, 213, 733, 904, 356, 225, 742, 940, 941, 295, 694, 386, 4, 335, 971, 527, 487 };
    int tokensNeeded = 35;
    int[] bonuses = { 9515, 7963, 3340, 8075, 7912, 6141, 1193, 1946, 5070, 424, 4605, 6171, 4427, 2401, 6705, 624, 9810, 9374, 90, 6564, 6035, 4735, 9139, 811, 5994, 8256, 6652, 3934, 835, 480, 1355, 1013, 1131, 8229, 7840, 4624, 2011, 2634, 4186 };
    assertEquals(27852, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case34() {
    int[] points = { 649, 657, 613, 883, 343, 395, 439, 995, 255, 211, 449, 287, 618, 277, 242, 148, 113, 305, 209, 82, 4, 171, 59, 297, 842, 26, 131, 330, 249, 892, 673, 614, 883, 888, 558, 461, 924, 281, 640, 644, 218 };
    int tokensNeeded = 3;
    int[] bonuses = { 6923, 3831, 9368, 3878, 257, 9007, 2617, 3969, 0, 1943, 9781, 6502, 2391, 2682, 5311, 6698, 5589, 2721, 5938, 9036, 6410, 1458, 6234, 2507, 9961, 3959, 6493, 1515, 5267, 4935, 8867, 58, 4699, 3970, 6262, 5116, 6214, 4553, 7815, 8329, 3039 };
    assertEquals(102043, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case35() {
    int[] points = { 259, 54, 953, 69, 690, 460, 750, 372, 786, 926, 535, 97, 678 };
    int tokensNeeded = 11;
    int[] bonuses = { 5896, 3071, 788, 3975, 8131, 9954, 8687, 6111, 7, 2940, 5789, 1723, 1361 };
    assertEquals(12418, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case36() {
    int[] points = { 159, 754, 193, 66, 884, 953, 70, 322, 845, 127, 281, 136, 805, 667, 614, 622, 596, 306, 689, 682, 50, 106, 237, 641, 527, 653, 857, 392, 397 };
    int tokensNeeded = 27;
    int[] bonuses = { 6816, 7516, 7724, 8664, 9085, 7679, 9963, 1340, 5686, 6021, 1661, 4720, 6064, 9307, 413, 7901, 9871, 7123, 3939, 2742, 1759, 8421, 7529, 4806, 2267, 9318, 5602, 1904, 4305 };
    assertEquals(19233, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case37() {
    int[] points = { 11, 115, 604, 90, 783, 80, 533, 278, 272, 967, 123, 53, 320, 694, 248, 484, 699, 126, 84, 423, 951, 698, 675, 989, 51, 244, 472, 220, 397, 891, 856, 642 };
    int tokensNeeded = 49;
    int[] bonuses = { 8484, 1194, 7462, 6631, 2157, 2021, 1146, 8391, 3036, 3925, 646, 9456, 6602, 804, 4098, 7828, 9290, 4599, 7278, 797, 8351, 446, 3881, 540, 8313, 4575, 8762, 9567, 2334, 8396, 1415, 9896 };
    assertEquals(14073, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case38() {
    int[] points = { 838, 790, 206, 445, 909, 658, 229, 496, 930, 531, 132, 137, 654, 655, 792, 339, 723, 382, 123, 706, 920, 167, 550, 630, 636, 60, 491, 510, 475 };
    int tokensNeeded = 16;
    int[] bonuses = { 526, 3233, 2569, 905, 9464, 9556, 8960, 4160, 521, 2548, 7468, 330, 1920, 8348, 4332, 2923, 909, 9736, 6335, 8336, 1278, 2392, 7636, 711, 8162, 1588, 9948, 9134, 2505 };
    assertEquals(24312, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case39() {
    int[] points = { 995, 321, 621, 636, 961, 583, 538, 262, 78, 143, 355, 624, 186, 867, 803, 368, 565, 243, 626, 145, 801, 943, 579, 940, 269, 411, 560, 802, 578, 200, 419, 614, 607, 53, 157, 877, 58, 496 };
    int tokensNeeded = 1;
    int[] bonuses = { 9694, 9573, 5588, 3160, 1169, 7967, 7356, 6029, 6266, 9425, 8508, 421, 771, 8779, 907, 3550, 4182, 5389, 5494, 5764, 874, 1364, 4901, 8253, 4460, 474, 6972, 6819, 6120, 5545, 1575, 9789, 5603, 192, 7592, 7950, 6342, 754 };
    assertEquals(214855, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case40() {
    int[] points = { 11, 661, 416, 415, 907, 753, 962, 384, 411, 907, 206, 748, 408, 199, 457, 315, 958, 940, 780, 158, 682, 356, 675, 766, 504, 526, 944, 444, 16, 265, 196, 302 };
    int tokensNeeded = 27;
    int[] bonuses = { 8581, 6946, 2722, 7981, 2016, 4775, 9220, 1108, 2179, 3854, 9489, 8925, 4324, 6486, 9676, 5968, 1642, 7534, 5676, 2666, 1065, 1989, 2193, 7783, 6827, 7727, 9424, 5870, 696, 7611, 8702, 1026 };
    assertEquals(26096, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case41() {
    int[] points = { 540, 499, 178, 208, 213, 417, 292, 479, 842 };
    int tokensNeeded = 29;
    int[] bonuses = { 2111, 3648, 8147, 1191, 1454, 5868, 681, 7463, 265 };
    assertEquals(3668, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case42() {
    int[] points = { 774, 616, 447, 952, 808, 877, 414, 172, 864, 745, 702, 350, 380, 574 };
    int tokensNeeded = 24;
    int[] bonuses = { 2237, 8023, 2176, 6594, 167, 2327, 2041, 1307, 8180, 1057, 7926, 9487, 1670, 2525 };
    assertEquals(8675, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case43() {
    int[] points = { 256, 206 };
    int tokensNeeded = 11;
    int[] bonuses = { 5781, 1284 };
    assertEquals(462, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case44() {
    int[] points = { 602, 468, 121, 416, 836, 698, 500, 853, 841, 928, 880, 248, 728, 586, 580, 430, 659, 37, 724, 787, 258, 470, 416, 359, 43, 579, 385, 826, 352, 317, 22, 920, 463, 421, 817, 760, 734, 791, 588, 826, 871, 951, 321 };
    int tokensNeeded = 3;
    int[] bonuses = { 1368, 1241, 1792, 6608, 9252, 1646, 7431, 9535, 7208, 3264, 3497, 3241, 7647, 2013, 6839, 189, 6099, 9811, 645, 9523, 9850, 4472, 8631, 9889, 7198, 9853, 9990, 5695, 4919, 7779, 2576, 2930, 2541, 3340, 3486, 899, 2523, 8483, 5538, 7492, 6193, 8250, 5009 };
    assertEquals(117604, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case45() {
    int[] points = { 819, 839, 466, 783, 511, 509, 787, 763, 379, 197, 536 };
    int tokensNeeded = 29;
    int[] bonuses = { 6977, 968, 9277, 73, 191, 1620, 1495, 3825, 1273, 9789, 6582 };
    assertEquals(6589, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case46() {
    int[] points = { 148, 398, 463, 159, 446, 912, 63, 370, 982, 940, 198, 471, 485, 355, 575, 182, 62, 709, 599, 0, 733, 45, 878, 132, 667, 703, 913, 427, 739 };
    int tokensNeeded = 5;
    int[] bonuses = { 6813, 2862, 395, 5459, 613, 903, 2599, 134, 4680, 9198, 7030, 4386, 2581, 7240, 3517, 7005, 8670, 241, 8881, 5247, 3523, 1755, 2104, 9619, 7094, 7296, 9916, 5677, 177 };
    assertEquals(43523, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case47() {
    int[] points = { 33, 550, 738, 994, 706, 57, 993, 676, 652, 726, 879, 773, 550, 90, 595, 166, 232, 900, 507, 158, 50, 180, 968, 914, 742, 646, 976, 142, 430, 546 };
    int tokensNeeded = 18;
    int[] bonuses = { 4628, 9914, 5874, 5790, 5468, 2910, 8146, 690, 9091, 9815, 6947, 6855, 638, 6050, 236, 8551, 9487, 1223, 8160, 6954, 3181, 8394, 177, 6096, 3065, 7063, 2513, 9261, 2577, 1076 };
    assertEquals(24663, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case48() {
    int[] points = { 126, 607, 916, 443, 170, 946, 476, 726, 143, 330, 852, 192, 265, 981, 405, 888, 351, 494, 878, 779, 624, 224, 185, 699, 473, 315, 532, 320, 428 };
    int tokensNeeded = 9;
    int[] bonuses = { 9646, 2274, 5757, 186, 419, 7664, 8486, 3455, 2028, 9612, 4860, 9251, 1776, 1345, 2502, 860, 2429, 9080, 2454, 4196, 2104, 8752, 5820, 7295, 6279, 6019, 4453, 5946, 7122 };
    assertEquals(35062, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case49() {
    int[] points = { 998, 1, 11, 23, 41, 75, 111, 49, 107, 103 };
    int tokensNeeded = 4;
    int[] bonuses = { 9998, 1, 11, 23, 41, 75, 111, 49, 107, 103 };
    assertEquals(1673, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case50() {
    int[] points = { 500, 500, 500, 0, 500 };
    int tokensNeeded = 3;
    int[] bonuses = { 0, 0, 0, 500, 0 };
    assertEquals(2000, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case51() {
    int[] points = { 47, 284, 202, 213, 184, 37, 0, 238, 237, 47, 284, 202, 213, 184, 37, 0, 238, 237 };
    int tokensNeeded = 4;
    int[] bonuses = { 3, 4, 8, 183, 194, 451, 48, 13, 57, 3, 4, 8, 183, 194, 451, 48, 13, 57 };
    assertEquals(3365, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case52() {
    int[] points = { 5, 6, 7, 8, 5, 4, 6, 7, 8, 9, 8, 7, 6, 5, 4, 3, 4, 5, 6, 7, 8, 9, 0, 7, 5, 5, 7, 6, 5, 8, 9, 8, 7, 9, 8, 7, 9, 8, 7, 6, 7, 8, 9, 7, 6, 7, 8, 9, 5, 6 };
    int tokensNeeded = 1;
    int[] bonuses = { 12, 11, 10, 9, 8, 10, 12, 13, 10, 9, 11, 12, 14, 13, 12, 11, 9, 10, 10, 9, 10, 11, 12, 9, 11, 9, 10, 11, 12, 14, 9, 8, 10, 11, 13, 14, 12, 15, 16, 13, 14, 15, 15, 14, 13, 12, 11, 10, 14, 13 };
    assertEquals(906, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case53() {
    int[] points = { 994, 710, 573, 363, 32, 483, 418, 165, 504, 899, 361, 384, 795, 933, 555, 403, 78, 121, 916, 797, 963, 991, 8, 315, 193, 175, 417, 514, 837, 740, 176, 711, 657, 465, 70, 96, 608, 84, 870, 162, 641, 743, 827, 814, 276, 168, 983, 797, 613, 320 };
    int tokensNeeded = 5;
    int[] bonuses = { 348, 8927, 759, 1857, 3455, 4592, 4988, 1107, 2163, 8479, 5867, 3558, 1307, 3398, 2892, 1056, 1983, 6060, 3578, 9329, 3617, 5594, 2054, 2500, 8088, 4463, 3026, 1102, 3142, 4599, 9574, 7686, 4825, 4140, 5766, 6634, 1144, 2590, 7569, 7268, 1713, 4778, 8014, 1867, 575, 6458, 5124, 2685, 1959, 6900 };
    assertEquals(87353, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case54() {
    int[] points = { 1, 5, 2, 4, 10, 21, 3 };
    int tokensNeeded = 2;
    int[] bonuses = { 11, 7, 2, 26, 29, 3, 24 };
    assertEquals(102, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case55() {
    int[] points = { 15, 15, 15, 15, 15, 15, 15, 15, 14, 13, 13, 14, 14, 1, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 1, 5, 1, 1, 1, 4, 1, 3, 4 };
    int tokensNeeded = 3;
    int[] bonuses = { 1, 1, 1, 1, 1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 9, 9, 9, 9, 9, 9, 9, 9, 99, 9, 9, 6, 6, 55, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
    assertEquals(778, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case56() {
    int[] points = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 100, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
    int tokensNeeded = 50;
    int[] bonuses = { 100, 1000, 100, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
    assertEquals(50100, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case57() {
    int[] points = { 1, 2, 3, 4, 5, 6 };
    int tokensNeeded = 3;
    int[] bonuses = { 1, 1, 1, 20, 1, 1 };
    assertEquals(39, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case58() {
    int[] points = { 11, 11, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 231, 23, 1000, 1000, 1000, 1000, 234, 234, 234, 234, 234, 234, 123, 123, 654, 234, 234, 234, 234, 234, 234, 234, 234, 234, 234, 765, 45, 86 };
    int tokensNeeded = 31;
    int[] bonuses = { 234, 234, 234, 754, 1, 34, 0, 575, 2, 987, 33, 57, 234, 854, 234, 75, 234, 543, 234, 234, 754, 345, 345, 345, 345, 345, 345, 345, 345, 35, 521, 754, 86, 24, 46, 45, 4, 52, 7, 0, 785, 445, 67, 345, 863, 545, 234, 65, 23, 465 };
    assertEquals(10671, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case59() {
    int[] points = { 50, 2, 3, 4, 5, 6, 50, 2, 3, 4, 5, 6, 50, 2, 3, 4, 5, 6, 50, 2, 3, 4, 5, 6, 50, 2, 3, 4, 5, 6, 50, 2, 3, 4, 5, 6, 50, 2, 3, 4, 5, 6, 50, 2, 3, 4, 5, 6 };
    int tokensNeeded = 5;
    int[] bonuses = { 50, 2, 3, 4, 5, 6, 50, 2, 3, 4, 5, 6, 50, 2, 3, 4, 5, 6, 50, 2, 3, 4, 5, 6, 50, 2, 3, 4, 5, 6, 50, 2, 3, 4, 5, 6, 50, 2, 3, 4, 5, 6, 50, 2, 3, 4, 5, 6 };
    assertEquals(882, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case60() {
    int[] points = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49 };
    int tokensNeeded = 7;
    int[] bonuses = { 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
    assertEquals(1379, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case61() {
    int[] points = { 150, 20, 30, 40, 200 };
    int tokensNeeded = 3;
    int[] bonuses = { 0, 0, 0, 250, 0 };
    assertEquals(650, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case62() {
    int[] points = { 1, 2, 3, 4, 5, 6 };
    int tokensNeeded = 1;
    int[] bonuses = { 10000, 1, 1, 1, 1, 1 };
    assertEquals(10026, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case63() {
    int[] points = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int tokensNeeded = 40;
    int[] bonuses = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(31, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case64() {
    int[] points = { 41, 449, 328, 474, 150, 709, 467, 329, 936, 440, 700, 117, 258, 811, 952, 491, 993, 931, 823, 431, 359, 590, 899, 153, 292, 370, 404, 698, 699, 876, 442, 705, 757, 527, 868, 893, 642, 273, 18, 885, 675, 788, 291, 303, 656, 660, 126, 704, 225, 862 };
    int tokensNeeded = 2;
    int[] bonuses = { 5545, 7642, 2659, 2754, 35, 2858, 8723, 9741, 7527, 778, 2315, 3035, 2188, 1842, 288, 103, 9040, 8942, 9263, 2646, 7444, 3803, 5889, 6729, 4368, 5349, 5005, 1098, 4391, 3548, 9628, 2622, 4082, 9953, 8755, 1839, 4966, 7376, 3930, 6306, 6943, 2436, 4624, 1322, 5537, 1536, 6117, 2082, 2927, 6540 };
    assertEquals(164679, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case65() {
    int[] points = { 34, 23, 45, 45, 36, 54, 6, 54, 7, 67, 65, 76, 8, 679, 78, 98, 89, 8, 34, 23, 45, 45, 36, 54, 6, 54, 7, 67, 65, 76, 8, 679, 78, 98, 89, 8, 34, 23, 45, 45, 36, 54, 6, 54, 7, 67, 65, 76, 8 };
    int tokensNeeded = 8;
    int[] bonuses = { 34, 23, 45, 45, 36, 54, 6, 54, 7, 67, 65, 76, 8, 679, 78, 98, 89, 8, 34, 23, 45, 45, 36, 54, 6, 54, 7, 67, 65, 76, 8, 679, 78, 98, 89, 8, 34, 23, 45, 45, 36, 54, 6, 54, 7, 67, 65, 76, 8 };
    assertEquals(4734, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case66() {
    int[] points = { 15, 2, 0, 0, 4, 5, 6, 88, 120, 0, 0, 0, 0, 1, 0, 2, 87, 0, 0, 77, 66, 58, 0, 0, 45, 0, 487, 546, 740, 548, 452, 12, 0, 0, 0, 0, 4, 45, 440, 0, 5, 0, 0, 0, 0, 5, 789, 0, 0, 0 };
    int tokensNeeded = 7;
    int[] bonuses = { 15, 55, 543, 0, 0, 0, 0, 4, 5, 79, 45, 38, 48, 43, 20, 0, 0, 5, 48, 68, 453, 31, 2, 0, 548, 4, 54, 45, 54, 0, 899, 999, 452, 0, 0, 0, 4, 5, 48, 797, 0, 4479, 0, 456, 452, 0, 456, 0, 456, 0 };
    assertEquals(11211, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

  @Test
  public void case67() {
    int[] points = { 324, 654, 53, 76, 6, 3, 5, 654, 654, 654, 465, 4, 65, 456, 456, 465, 456, 54, 546, 45, 456, 456, 4, 456, 456, 4, 67, 7, 5, 6, 5, 6, 3, 564, 56, 77, 9, 9, 4, 765, 3, 44, 4, 23, 32, 4, 5, 4, 456, 6 };
    int tokensNeeded = 4;
    int[] bonuses = { 6, 64, 64, 76, 365, 87, 65, 54, 43, 67, 87, 56, 54, 34, 76, 98, 9, 7, 65, 4, 4, 6, 7, 456, 8, 0, 45, 94, 87, 7, 6, 5, 54, 4, 3, 54, 4, 6, 7, 645, 9, 90, 8, 76, 5, 4, 56, 45, 678, 9 };
    assertEquals(12554, triviagame.maximumScore(points, tokensNeeded, bonuses));
  }

}
