package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class NumericalSequenceTest {
  NumericalSequence numericalsequence = new NumericalSequence();

  @Test
  public void case1() {
    int[] sequence = { 15, 78, 78, 15 };
    assertEquals(0, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case2() {
    int[] sequence = { 1, 1, 1, 3 };
    assertEquals(2, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case3() {
    int[] sequence = { 15, 78, 87, 51 };
    assertEquals(3, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case4() {
    int[] sequence = { 3, 23, 21, 23, 42, 39, 63, 76, 13, 13, 13, 32, 12, 42, 26 };
    assertEquals(8, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case5() {
    int[] sequence = { 1 };
    assertEquals(0, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case6() {
    int[] sequence = { 10000 };
    assertEquals(0, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case7() {
    int[] sequence = { 10000, 9999 };
    assertEquals(1, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case8() {
    int[] sequence = { 10000, 9999, 10000, 9999 };
    assertEquals(2, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case9() {
    int[] sequence = { 1, 1 };
    assertEquals(0, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case10() {
    int[] sequence = { 1, 2, 1 };
    assertEquals(0, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case11() {
    int[] sequence = { 1, 2, 2 };
    assertEquals(2, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case12() {
    int[] sequence = { 1, 3, 2 };
    assertEquals(2, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case13() {
    int[] sequence = { 1, 2, 3 };
    assertEquals(1, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case14() {
    int[] sequence = { 1, 2, 3, 6 };
    assertEquals(2, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case15() {
    int[] sequence = { 2, 2 };
    assertEquals(0, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case16() {
    int[] sequence = { 37, 81, 61, 4, 78, 59, 65, 99, 71, 87, 69, 50, 61, 29, 99, 40, 1, 29, 97, 76, 65, 70, 8, 48, 51, 97, 33, 79, 83, 1, 36, 43, 61, 46, 68, 2, 12, 17, 81, 41, 26, 30, 41, 87, 62, 1, 7, 94, 60, 2574 };
    assertEquals(49, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case17() {
    int[] sequence = { 2574, 37, 81, 61, 4, 78, 59, 65, 99, 71, 87, 69, 50, 61, 29, 99, 40, 1, 29, 97, 76, 65, 70, 8, 48, 51, 97, 33, 79, 83, 1, 36, 43, 61, 46, 68, 2, 12, 17, 81, 41, 26, 30, 41, 87, 62, 1, 7, 94, 60 };
    assertEquals(49, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case18() {
    int[] sequence = { 37, 81, 61, 4, 78, 59, 65, 99, 71, 87, 69, 50, 61, 29, 99, 40, 1, 29, 97, 76, 65, 70, 8, 48, 51, 97, 33, 79, 83, 1, 36, 43, 61, 46, 68, 2, 12, 17, 81, 41, 26, 30, 41, 87, 62, 1, 7, 94, 60, 2575 };
    assertEquals(49, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case19() {
    int[] sequence = { 2575, 37, 81, 61, 4, 78, 59, 65, 99, 71, 87, 69, 50, 61, 29, 99, 40, 1, 29, 97, 76, 65, 70, 8, 48, 51, 97, 33, 79, 83, 1, 36, 43, 61, 46, 68, 2, 12, 17, 81, 41, 26, 30, 41, 87, 62, 1, 7, 94, 60 };
    assertEquals(49, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case20() {
    int[] sequence = { 9999, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 9999, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000 };
    assertEquals(48, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case21() {
    int[] sequence = { 65, 100, 96, 73, 45, 1, 95 };
    assertEquals(6, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case22() {
    int[] sequence = { 69, 41, 10, 18, 31, 66, 32, 7, 33, 67, 15, 1, 45, 81, 34, 81, 83, 23, 45, 54, 41, 26, 19, 1, 79, 26, 53, 76, 74, 81, 95, 24, 59, 21, 89, 1, 79, 29, 25, 19, 29, 61, 85 };
    assertEquals(42, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case23() {
    int[] sequence = { 92, 74, 1, 49, 8, 93, 73, 61, 77, 1, 53, 41, 93, 69, 25, 41, 19, 68, 21 };
    assertEquals(18, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case24() {
    int[] sequence = { 1, 65, 49, 57, 29, 97, 9, 55, 55, 59, 39, 75, 89, 26, 13, 96, 19, 13, 97, 81, 43, 97, 57, 83, 53, 29, 88, 94, 86, 25, 35, 73, 55, 47 };
    assertEquals(33, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case25() {
    int[] sequence = { 77, 89, 93, 85, 79, 71, 58, 41, 75, 31, 47, 26, 61, 51, 81, 93, 45, 39, 2, 29, 36, 30, 21, 51, 81 };
    assertEquals(24, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case26() {
    int[] sequence = { 97, 88, 21, 45, 76, 47, 79, 26, 91, 33, 67, 53, 51, 37, 70, 13, 41, 11, 76, 97, 63, 27, 45, 3 };
    assertEquals(23, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case27() {
    int[] sequence = { 21, 25, 31, 97, 52, 9, 73, 69, 61, 41, 47, 76, 93, 81, 11, 12, 19, 17, 91, 61, 81, 94, 35, 29, 5, 54, 1, 43, 36, 32, 2, 45, 39 };
    assertEquals(32, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case28() {
    int[] sequence = { 44, 27, 33, 1, 15, 39, 25, 21, 61, 16, 29, 15, 45, 55, 95, 15, 49, 34, 60, 83, 71, 96, 5, 27, 33, 21, 25, 77, 27, 21, 93, 15, 96, 66, 76, 55 };
    assertEquals(35, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case29() {
    int[] sequence = { 3, 25, 93, 45, 33, 21, 81, 69, 29, 55, 29, 37, 91, 21, 5 };
    assertEquals(14, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case30() {
    int[] sequence = { 51, 57, 34, 44, 89, 65, 84 };
    assertEquals(6, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case31() {
    int[] sequence = { 10, 40, 1, 3, 32, 14, 1, 1, 1, 1, 3, 1, 17, 73, 7, 3, 11, 27, 2, 2, 2, 14, 38, 7, 2, 13, 36, 1, 1, 1, 1, 14, 36, 2, 1, 1, 1, 4, 81, 55, 36, 91, 90, 54, 58, 56, 50, 98, 50, 50 };
    assertEquals(32, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case32() {
    int[] sequence = { 1, 1, 9, 6, 9, 9, 1, 7, 1, 1, 6, 1, 9, 1, 3, 9, 10, 1, 1, 9, 3 };
    assertEquals(18, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case33() {
    int[] sequence = { 6, 9, 2, 2, 5, 6, 5, 1, 1, 2, 6, 10, 3, 4, 3, 1, 9, 7, 1, 3, 9, 3, 9, 4, 1, 9, 7, 9, 8, 5, 5, 1, 9, 9 };
    assertEquals(25, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case34() {
    int[] sequence = { 5, 3, 1, 1, 1, 9 };
    assertEquals(2, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case35() {
    int[] sequence = { 1, 5, 3, 2, 9, 3, 7, 7, 1, 6, 9, 8, 4, 6, 4, 1, 3, 1, 7, 4, 1, 10, 9, 8, 1, 1, 6, 6, 1, 2, 5, 5, 1, 9, 1, 9, 9, 1, 4, 3, 1, 5, 7, 8, 7, 9, 1, 9, 7, 1 };
    assertEquals(38, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case36() {
    int[] sequence = { 9, 3, 5, 1, 9, 7, 6, 3, 6, 9, 1, 5, 5, 3, 3, 1, 8, 5, 9, 10, 1, 3, 5, 9, 1, 1, 3, 2, 3, 1, 1, 1, 1, 9, 5, 6, 9, 1, 8, 5, 10, 8, 8, 3, 5, 9 };
    assertEquals(31, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case37() {
    int[] sequence = { 9, 6, 7, 3, 1, 7, 9, 1, 2, 7, 1, 6, 7 };
    assertEquals(11, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case38() {
    int[] sequence = { 3, 7, 1, 1, 9, 3, 9, 5 };
    assertEquals(7, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case39() {
    int[] sequence = { 1, 4, 5, 1, 1, 7, 1, 1, 8, 3, 1, 3, 5, 9, 9, 1, 3, 1, 1, 1, 1, 6, 1, 3, 3, 8, 4, 4, 1, 1, 1, 9, 9, 1, 6, 1, 1, 9, 1 };
    assertEquals(24, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case40() {
    int[] sequence = { 6, 6, 6, 4, 1, 2, 1, 1, 6, 5, 3, 1, 1, 1, 1, 2, 3, 7, 9, 1, 1, 7, 1, 1 };
    assertEquals(19, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case41() {
    int[] sequence = { 3, 3, 2, 7, 1, 5, 1, 7, 5 };
    assertEquals(8, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case42() {
    int[] sequence = { 2812, 274, 2557, 794, 4931, 607, 2060, 728, 842, 2599, 682, 4136, 4686, 1264, 9934, 11, 7059, 21, 456, 1575, 1067, 3523, 293, 671, 2656, 6117, 2942, 2291, 599, 52, 6034, 3703, 4590, 1170, 659, 223, 1018, 3219, 978, 1855, 9934, 2505, 3445, 4136, 3281, 842, 9120, 3116, 2229, 298 };
    assertEquals(26, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case43() {
    int[] sequence = { 7046, 3740, 9590, 6414, 2949, 3555, 3830, 7536, 4294, 610, 241, 1080, 288, 6627, 1183, 3118, 1912, 6, 11, 726, 39, 1452, 2740, 3562, 740, 7014, 782, 396, 2496, 2138, 7810, 1345, 874, 4011, 8, 275, 7536, 1095, 2666, 69, 2439, 100, 158, 310, 548, 5546, 3817, 9590, 3740, 7046 };
    assertEquals(24, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case44() {
    int[] sequence = { 1080, 949, 124, 156, 1605, 9990, 3695, 4064, 2906, 1335, 5027, 870, 60, 44, 1558, 9258, 92, 134, 1402, 1242, 3048, 743, 862, 2031, 3610, 5720, 1032, 436, 1419, 49, 5720, 3610, 2893, 479, 264, 5918, 9258, 1662, 870, 6362, 3785, 1086, 328, 1771, 1254, 2441, 2417, 1727, 5846, 3914 };
    assertEquals(22, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case45() {
    int[] sequence = { 7110, 5246, 224, 7062, 227, 1531, 3636, 87, 54, 385, 2278, 5, 4, 4923, 2017, 131, 1445, 2090, 272, 792, 2494, 1738, 793, 1369, 1754, 13, 9578, 9578, 157, 1886, 1093, 5025, 792, 272, 2090, 349, 1227, 6949, 354, 1924, 476, 50, 722, 4672, 7062, 5099, 100, 234, 37, 7110 };
    assertEquals(22, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case46() {
    int[] sequence = { 9615, 9002, 8374, 1589, 280, 2466, 4785, 9898, 284, 483, 5451, 600, 730, 338, 1537, 396, 1668, 626, 417, 1503, 2083, 1212, 106, 1884, 4420, 919, 3501, 509, 271, 985, 225, 3295, 4610, 1875, 1289, 41, 5490, 728, 6047, 991, 2860, 6842, 2278, 1226, 6318, 449, 381, 9002, 5507, 4108 };
    assertEquals(26, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case47() {
    int[] sequence = { 342, 132, 368, 2705, 943, 5077, 763, 23, 2499, 2017, 88, 28, 581, 1390, 1068, 3066, 1856, 1366, 1595, 563, 1729, 3109, 3120, 4133, 3239, 420, 5570, 2552, 1388, 1610, 5, 15, 601, 3058, 349, 6904, 6996, 6288, 2238, 5, 215, 653, 23, 21, 2017, 2499, 786, 924, 4153, 4490 };
    assertEquals(26, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case48() {
    int[] sequence = { 1841, 8082, 714, 2144, 4028, 2705, 99, 40, 328, 99, 988, 120, 146, 4180, 4420, 3, 2, 33, 109, 9148, 1124, 3790, 33, 16, 66, 37, 1436, 1507, 1490, 580, 1722, 5299, 1588, 3790, 631, 392, 101, 9295, 5513, 688, 2399, 138, 128, 988, 335, 231, 9591, 8082, 989, 852 };
    assertEquals(26, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case49() {
    int[] sequence = { 7674, 1022, 250, 5381, 9802, 3710, 2994, 128, 578, 6705, 4399, 2359, 2599, 2431, 5362, 3398, 1678, 1108, 164, 268, 350, 689, 471, 7359, 2264, 1092, 4003, 1778, 1165, 483, 1302, 4920, 3840, 744, 759, 928, 1865, 734, 6758, 6705, 572, 84, 23, 27, 6704, 1597, 8205, 6653, 4268, 3406 };
    assertEquals(24, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case50() {
    int[] sequence = { 5336, 448, 335, 526, 5004, 1394, 8630, 2038, 594, 1693, 6385, 4831, 234, 1744, 4423, 1884, 83, 2085, 3289, 2582, 9045, 9045, 4005, 1866, 1758, 326, 54, 30, 1092, 716, 44, 15, 17, 4423, 1744, 1449, 163, 3453, 3488, 3713, 877, 2632, 7611, 647, 294, 78, 1394, 5865, 2958, 2826 };
    assertEquals(24, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case51() {
    int[] sequence = { 7073, 755, 7328, 5694, 277, 5412, 9642, 9610, 1, 4, 1805, 1445, 901, 9750, 432, 2206, 3328, 3857, 49, 601, 650, 475, 6710, 1955, 683, 9750, 417, 1788, 47, 94, 706, 786, 318, 9610, 777, 4316, 798, 3751, 864, 3095, 1730, 1115, 357, 1472, 2750, 5639, 164, 423, 1102, 7828 };
    assertEquals(26, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case52() {
    int[] sequence = { 4674, 9767, 6172, 4635, 2114, 2111, 2213, 7618, 9050, 4010, 1994, 235, 1692, 440, 1252, 95, 12, 128, 1905, 84, 3, 2, 3953, 4, 45, 8, 9050, 5181, 669, 1768, 1700, 351, 162, 591, 99, 1421, 1312, 178, 624, 4635, 2914, 3258, 3848, 150, 1201, 3680, 888, 2586, 241, 1847 };
    assertEquals(24, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case53() {
    int[] sequence = { 6562, 8090, 3460, 8438, 5998, 3366, 2274, 4430, 2644, 3760, 3188, 572, 1812, 534, 129, 169, 1976, 1298, 760, 396, 1225, 905, 88, 13, 43, 332, 1711, 326, 997, 5123, 582, 145, 52, 96, 476, 7464, 375, 94, 29, 2615, 845, 2068, 5086, 643, 293, 5816, 498, 191, 33, 24 };
    assertEquals(30, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case54() {
    int[] sequence = { 730, 7560, 1370, 8168, 7662, 9776, 6905, 750, 8810, 5810, 3767, 6160, 7104, 7104, 2621, 591, 2891, 57, 961, 1877, 272, 657, 1968, 1705, 309, 298, 1530, 1258, 7552, 393, 357, 4728, 2177, 2095, 2442, 993, 3302, 944, 2658, 4777, 227, 4314, 3854, 1258, 21, 91, 4337, 2046, 1177, 730 };
    assertEquals(24, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case55() {
    int[] sequence = { 529, 6135, 616, 3230, 4330, 3780, 4420, 9106, 5039, 1334, 917, 1302, 1325, 34, 19, 60, 48, 3903, 226, 1370, 1701, 1906, 4420, 202, 292, 1457, 1722, 55, 21, 20, 11, 4330, 1747, 463, 667, 226, 52, 75, 575, 33, 8, 101, 6034, 26, 401, 47, 34, 8, 13 };
    assertEquals(31, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case56() {
    int[] sequence = { 2826, 5792, 1827, 924, 4626, 4670, 3296, 7366, 2337, 4568, 301, 67, 41, 20, 32, 3296, 1635, 1940, 205, 807, 73, 10, 4626, 845, 64, 9, 1, 5, 156, 1066, 316, 218, 10, 47, 7, 7, 930, 677, 771, 1384, 742, 274, 832, 66, 73, 43, 1728, 357, 298, 443 };
    assertEquals(34, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case57() {
    int[] sequence = { 3080, 6957, 9706, 6490, 4501, 7018, 3990, 7794, 1534, 4796, 217, 624, 623, 3431, 177, 62, 58, 262, 2202, 3621, 528, 667, 1278, 3223, 445, 5953, 44, 26, 15, 3, 4, 2791, 2712, 2853, 84, 342, 4, 218, 702, 264, 1361, 3924, 365, 364, 239, 355, 30, 39, 16, 3080 };
    assertEquals(34, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case58() {
    int[] sequence = { 483, 2828, 381, 553, 1203, 3918, 202, 1611, 5, 186, 408, 107, 638, 5, 127, 3157, 3875, 1291, 240, 93, 37, 36, 521, 1109, 5964, 2105, 1288, 383, 83, 452, 734, 70, 5382, 4890, 4, 790, 3204, 696, 226, 944, 1816, 3682, 3998, 4890, 7104, 3393, 7760, 9440, 2210, 9568 };
    assertEquals(32, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case59() {
    int[] sequence = { 158, 34, 151, 295, 1062, 1326, 1755, 2170, 488, 717, 20, 11, 8, 13, 49, 82, 302, 761, 2040, 2, 14, 8, 26, 364, 201, 819, 1339, 1, 2, 4, 1, 2, 192, 4409, 44, 7, 397, 878, 480, 58, 2286, 671, 3701, 4372, 4150, 4611, 1339, 1434, 3286, 8156 };
    assertEquals(36, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case60() {
    int[] sequence = { 3874, 776, 2610, 9, 1, 69, 756, 2, 1, 30, 140, 327, 284, 106, 6935, 275, 3549, 1656, 14, 393, 54, 311, 4257, 2931, 927, 362, 1222, 298, 27, 79, 80, 99, 4970, 1, 1, 1, 1, 1, 1, 16, 1492, 1514, 5255, 2809, 7960, 5480, 6935, 890, 835, 7260 };
    assertEquals(32, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case61() {
    int[] sequence = { 9600, 7312, 2, 1, 1, 4, 44, 33, 64, 59, 71, 62, 641, 2407, 5775, 14, 7693, 1127, 1, 1, 1, 2, 2, 47, 4, 1019, 926, 38, 860, 987, 1539, 534, 2346, 1, 3, 6, 4, 76, 130, 2073, 1082, 3650, 7025, 6304, 2003, 8834, 8956, 208, 7312, 9600 };
    assertEquals(34, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case62() {
    int[] sequence = { 20, 25, 85, 25, 9, 57, 43, 44, 75, 18, 47, 57, 27, 16, 27, 88, 36, 21, 16, 41, 11, 65, 41, 93, 50, 47, 3, 17, 56, 15, 3, 84, 64, 76, 67, 31, 4, 5, 35, 45, 10, 96, 97, 21, 33, 23, 63, 99, 53, 2084 };
    assertEquals(48, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case63() {
    int[] sequence = { 2084, 20, 25, 85, 25, 9, 57, 43, 44, 75, 18, 47, 57, 27, 16, 27, 88, 36, 21, 16, 41, 11, 65, 41, 93, 50, 47, 3, 17, 56, 15, 3, 84, 64, 76, 67, 31, 4, 5, 35, 45, 10, 96, 97, 21, 33, 23, 63, 99, 53 };
    assertEquals(48, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case64() {
    int[] sequence = { 20, 25, 85, 25, 9, 57, 43, 44, 75, 18, 47, 57, 27, 16, 27, 88, 36, 21, 16, 41, 11, 65, 41, 93, 50, 47, 3, 17, 56, 15, 3, 84, 64, 76, 67, 31, 4, 5, 35, 45, 10, 96, 97, 21, 33, 23, 63, 99, 53, 2085 };
    assertEquals(49, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case65() {
    int[] sequence = { 2085, 20, 25, 85, 25, 9, 57, 43, 44, 75, 18, 47, 57, 27, 16, 27, 88, 36, 21, 16, 41, 11, 65, 41, 93, 50, 47, 3, 17, 56, 15, 3, 84, 64, 76, 67, 31, 4, 5, 35, 45, 10, 96, 97, 21, 33, 23, 63, 99, 53 };
    assertEquals(49, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case66() {
    int[] sequence = { 3, 23, 21, 23, 42, 39, 63, 76, 13, 13, 13, 32, 12, 42, 26, 3, 23, 21, 23, 42, 39, 63, 76, 13, 13, 13, 32, 12, 42, 26, 3, 23, 21, 23, 42, 39, 63, 76, 13, 13, 13, 32, 12, 42, 26, 13, 32, 12, 42, 26 };
    assertEquals(39, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case67() {
    int[] sequence = { 15, 78, 87, 51 };
    assertEquals(3, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case68() {
    int[] sequence = { 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(1, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case69() {
    int[] sequence = { 3, 23, 21, 23, 42, 39, 63, 76, 13, 13, 13, 32, 12, 42, 26 };
    assertEquals(8, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case70() {
    int[] sequence = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(4, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case71() {
    int[] sequence = { 3, 23, 21, 23, 42, 39, 63, 76, 13, 13, 13, 32, 12, 42, 26, 3, 23, 21, 23, 42, 39, 63, 76, 13, 13, 13, 32, 12, 42, 26, 3, 23, 21, 23, 42, 39, 63, 76, 13, 13, 13, 32, 12, 42, 26, 4, 5, 6, 7, 8 };
    assertEquals(47, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case72() {
    int[] sequence = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7 };
    assertEquals(43, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case73() {
    int[] sequence = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 12, 13, 14, 15, 16, 17, 18, 19, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 12, 13, 14, 15, 16, 17, 18, 19, 1 };
    assertEquals(40, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case74() {
    int[] sequence = { 3, 233, 13, 32, 12, 42, 26 };
    assertEquals(6, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case75() {
    int[] sequence = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    assertEquals(49, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case76() {
    int[] sequence = { 15, 78, 87, 51, 121, 121, 12, 12, 1232, 34, 23, 12, 12, 12, 12, 123, 3, 23, 12, 1, 3, 2, 3, 3, 1, 1, 23, 123, 123, 123, 123, 123, 123, 123, 123, 123, 123, 12, 34, 234, 34, 234, 4, 34, 3, 4 };
    assertEquals(45, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case77() {
    int[] sequence = { 2, 1, 1, 2, 2, 1, 1, 1, 2, 2, 1, 1, 2, 1, 1, 1, 2, 1, 2, 2, 2, 2, 2, 2, 1, 2, 1, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 2, 2, 2 };
    assertEquals(6, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case78() {
    int[] sequence = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 5, 6, 8, 9, 5, 6, 8, 9, 5, 6, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
    assertEquals(41, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case79() {
    int[] sequence = { 15, 78, 87, 51, 121, 121, 12, 12, 1232, 34, 23, 12, 12, 12, 12, 123, 3, 23, 12, 1, 3, 2, 3, 3, 1, 1, 23, 123, 123, 123, 123, 123, 123, 123, 123, 123, 123, 12, 34, 234, 34, 234, 4, 34, 3, 4, 34, 234, 324, 234 };
    assertEquals(49, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case80() {
    int[] sequence = { 1 };
    assertEquals(0, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case81() {
    int[] sequence = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(0, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case82() {
    int[] sequence = { 1, 7, 12, 16, 21, 26, 31, 36, 41, 46, 50, 55, 56, 80, 90, 95, 100, 105, 110, 115, 120, 125, 130, 135, 140, 145, 151, 156, 161, 170, 175, 182, 187, 192, 200, 208, 212, 220, 225, 230, 235, 240, 245, 250, 255, 260, 265, 270, 280, 290 };
    assertEquals(49, numericalsequence.makePalindrome(sequence));
  }

  @Test
  public void case83() {
    int[] sequence = { 21, 31, 8, 112, 4, 1, 852, 3, 86, 3, 42, 3, 8, 12, 45, 1, 85, 3, 86, 3, 21, 31, 8, 112, 4, 1, 852, 3, 86, 3, 42, 3, 8, 12, 45, 1, 85, 3, 86, 3, 7, 88, 5, 2, 3, 4, 5, 7, 8, 9 };
    assertEquals(49, numericalsequence.makePalindrome(sequence));
  }

}
