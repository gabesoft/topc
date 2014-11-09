package topc.test.simulation;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.simulation.*;

public class TypoCoderDiv2Test {
  TypoCoderDiv2 typocoderdiv2 = new TypoCoderDiv2();

  @Test
  public void case1() {
    int[] rating = { 1000, 1200, 1199 };
    assertEquals(2, typocoderdiv2.count(rating));
  }

  @Test
  public void case2() {
    int[] rating = { 1500, 2200, 900, 3000 };
    assertEquals(3, typocoderdiv2.count(rating));
  }

  @Test
  public void case3() {
    int[] rating = { 600, 700, 800, 900, 1000, 1100, 1199 };
    assertEquals(0, typocoderdiv2.count(rating));
  }

  @Test
  public void case4() {
    int[] rating = { 0, 4000, 0, 4000, 4000, 0, 0 };
    assertEquals(4, typocoderdiv2.count(rating));
  }

  @Test
  public void case5() {
    int[] rating = { 575, 1090, 3271, 2496, 859, 2708, 3774, 2796, 1616, 2552, 3783, 2435, 1111, 526, 562 };
    assertEquals(4, typocoderdiv2.count(rating));
  }

  @Test
  public void case6() {
    int[] rating = { 1065 };
    assertEquals(0, typocoderdiv2.count(rating));
  }

  @Test
  public void case7() {
    int[] rating = { 692, 1309 };
    assertEquals(1, typocoderdiv2.count(rating));
  }

  @Test
  public void case8() {
    int[] rating = { 2116, 1841, 3089 };
    assertEquals(1, typocoderdiv2.count(rating));
  }

  @Test
  public void case9() {
    int[] rating = { 551, 3856, 252, 2628 };
    assertEquals(3, typocoderdiv2.count(rating));
  }

  @Test
  public void case10() {
    int[] rating = { 2501, 3156, 1187, 1606, 928 };
    assertEquals(4, typocoderdiv2.count(rating));
  }

  @Test
  public void case11() {
    int[] rating = { 645, 1426, 1806, 1771, 2899, 1601 };
    assertEquals(1, typocoderdiv2.count(rating));
  }

  @Test
  public void case12() {
    int[] rating = { 695, 1797, 2046, 939, 1465, 3798, 1653 };
    assertEquals(3, typocoderdiv2.count(rating));
  }

  @Test
  public void case13() {
    int[] rating = { 433, 309, 850, 1926, 118, 3545, 1977, 3973 };
    assertEquals(3, typocoderdiv2.count(rating));
  }

  @Test
  public void case14() {
    int[] rating = { 593, 1894, 168, 1018, 2829, 2163, 491, 2551, 2210 };
    assertEquals(5, typocoderdiv2.count(rating));
  }

  @Test
  public void case15() {
    int[] rating = { 2208, 3594, 489, 348, 244, 3268, 1946, 2441, 3176, 3311 };
    assertEquals(3, typocoderdiv2.count(rating));
  }

  @Test
  public void case16() {
    int[] rating = { 845, 2273, 3754, 3689, 689, 876, 1851, 109, 1388, 1566, 2525 };
    assertEquals(5, typocoderdiv2.count(rating));
  }

  @Test
  public void case17() {
    int[] rating = { 793, 3500, 3810, 496, 204, 3406, 3383, 467, 3860, 1386, 1096, 517, 3088, 2341 };
    assertEquals(7, typocoderdiv2.count(rating));
  }

  @Test
  public void case18() {
    int[] rating = { 3143, 1602, 119, 2588, 3081, 2725, 2755, 3334, 3279, 1807, 1431, 2462, 1108, 1965, 1889, 1575, 1395 };
    assertEquals(5, typocoderdiv2.count(rating));
  }

  @Test
  public void case19() {
    int[] rating = { 3259, 778, 1416, 1746, 2648, 2937, 10, 3254, 1688, 2095, 350, 74, 2528, 2875, 2980, 1112, 322, 2795, 1884, 89 };
    assertEquals(10, typocoderdiv2.count(rating));
  }

  @Test
  public void case20() {
    int[] rating = { 2294, 648, 3620, 2681, 2718, 3904, 1849, 3107, 693, 1738, 2671, 3187, 2919, 207, 3225, 677, 1967, 1148, 2725, 3744, 1936, 362, 1437 };
    assertEquals(13, typocoderdiv2.count(rating));
  }

  @Test
  public void case21() {
    int[] rating = { 196, 1446, 2615, 3688, 3322, 1956, 3901, 2761, 1801, 68, 1759, 1157, 3987, 1734, 1685, 1989, 826, 1529, 2837, 781, 1397, 1209, 1030, 2940, 1532, 3177 };
    assertEquals(11, typocoderdiv2.count(rating));
  }

  @Test
  public void case22() {
    int[] rating = { 1739, 3939, 1847, 996, 2778, 3542, 889, 3083, 2453, 1712, 2037, 2937, 465, 1899, 3081, 3682, 3867, 89, 630, 3619, 2253, 2429, 3981, 401, 3724, 2168, 1056, 2532, 2512 };
    assertEquals(13, typocoderdiv2.count(rating));
  }

  @Test
  public void case23() {
    int[] rating = { 755, 1016, 936, 1754, 2862, 1131, 3102, 2990, 2051, 2031, 291, 554, 538, 97, 2619, 276, 3556, 3988, 3057, 3892, 2586, 3779, 3754, 3408, 3200, 1250, 608, 3738, 3033, 3996, 2032, 1914 };
    assertEquals(9, typocoderdiv2.count(rating));
  }

  @Test
  public void case24() {
    int[] rating = { 1200, 651, 1371, 2275, 3130, 2937, 988, 319, 1194, 3265, 160, 1471, 1286, 2435, 1827, 3556, 973, 3295, 724, 2549, 779, 1973, 437, 486, 1817, 1001, 902, 444, 2229, 3287, 580, 3333, 869, 1772, 1154 };
    assertEquals(22, typocoderdiv2.count(rating));
  }

  @Test
  public void case25() {
    int[] rating = { 2195, 703, 38, 2361, 2474, 3934, 992, 310, 3995, 1429, 1142, 2570, 1101, 491, 2133, 3903, 566, 697, 3971, 286, 3579, 3122, 2581, 2098, 2827, 2496, 422, 2643, 3318, 2127, 3795, 3647, 2096, 1584, 126, 2871, 3749, 239 };
    assertEquals(18, typocoderdiv2.count(rating));
  }

  @Test
  public void case26() {
    int[] rating = { 475, 2498, 3649, 239, 487, 2334, 1738, 215, 3498, 2856, 2687, 1181, 1565, 1370, 2286, 2043, 3696, 2970, 2984, 3549, 1901, 2100, 709, 3694, 221, 25, 1936, 342, 3881, 2681, 3896, 1183, 1828, 2707, 822, 1438, 2442, 3963, 957, 2142, 162 };
    assertEquals(20, typocoderdiv2.count(rating));
  }

  @Test
  public void case27() {
    int[] rating = { 3382, 1175, 1533, 3432, 3190, 283, 1022, 2779, 1075, 1054, 2607, 2209, 1406, 312, 3229, 1060, 1519, 2113, 3065, 2447, 3976, 2995, 2771, 3174, 2229, 1977, 3774, 2821, 2609, 2356, 3675, 3144, 2908, 1033, 1132, 1280, 2701, 878, 76, 1866, 2662, 1955, 338, 1807 };
    assertEquals(17, typocoderdiv2.count(rating));
  }

  @Test
  public void case28() {
    int[] rating = { 1443, 878, 2714, 1006, 3120, 3396, 1164, 2443, 3450, 1724, 3267, 3119, 3324, 1033, 2141, 711, 3845, 2402, 1619, 57, 2454, 1008, 2941, 1575, 2180, 2356, 980, 432, 88, 497, 2932, 3444, 3159, 2195, 1900, 2795, 3539, 3686, 2957, 57, 1488, 1320, 939, 3743, 818, 2876, 1351 };
    assertEquals(23, typocoderdiv2.count(rating));
  }

  @Test
  public void case29() {
    int[] rating = { 1108, 529, 1597, 3224, 3161, 3963, 3715, 3987, 3911, 2047, 3765, 2658, 3483, 228, 3953, 1768, 664, 2350, 2529, 3270, 1603, 2363, 607, 3846, 1253, 1092, 2431, 2176, 1531, 734, 87, 1787, 3847, 1504, 3153, 1938, 3458, 1970, 2598, 442, 2889, 3758, 1199, 194, 2, 2752, 552, 428, 3276, 3470 };
    assertEquals(17, typocoderdiv2.count(rating));
  }

  @Test
  public void case30() {
    int[] rating = { 3078, 3675, 2343, 607, 3939, 3427, 534, 2602, 1668, 3320, 3872, 1981, 2777, 3502, 2691, 1749, 6, 2241, 809, 1295, 1866, 386, 3183, 2239, 3927, 1682, 3992, 1327, 1553, 1506, 2954, 1276, 2484, 524, 1298, 3542, 2912, 1393, 3248, 895, 3530, 3199, 1800, 1258, 1496, 506, 3495, 463, 2163, 1609 };
    assertEquals(19, typocoderdiv2.count(rating));
  }

  @Test
  public void case31() {
    int[] rating = { 3984, 2402, 3686, 919, 187, 989, 725, 2583, 2809, 609, 1949, 3213, 2159, 1590, 1432, 3717, 1427, 2527, 562, 2760, 1533, 175, 1973, 2232, 3158, 3297, 1960, 1041, 906, 1036, 2425, 1326, 2241, 1272, 1857, 2212, 923, 641, 2400, 393, 658, 3301, 304, 333, 558, 1151, 959, 617, 2759, 3892 };
    assertEquals(17, typocoderdiv2.count(rating));
  }

  @Test
  public void case32() {
    int[] rating = { 77, 1438, 492, 1222, 3894, 2708, 267, 705, 594, 2357, 661, 3794, 2914, 3713, 1877, 1211, 3561, 2356, 3019, 3628, 801, 3989, 1711, 119, 761, 2835, 300, 58, 2099, 1901, 2282, 1706, 1698, 1573, 2390, 2673, 1634, 1070, 106, 2152, 2484, 3159, 2450, 769, 3517, 603, 527, 2462, 3413, 2656 };
    assertEquals(19, typocoderdiv2.count(rating));
  }

  @Test
  public void case33() {
    int[] rating = { 591, 2644, 1547, 1796, 765, 3439, 1965, 19, 253, 2918, 1790, 586, 628, 1101, 1844, 2715, 936, 571, 2064, 3780, 3527, 1726, 667, 1353, 2581, 3773, 593, 1916, 2457, 355, 2933, 149, 381, 2602, 1468, 1241, 3125, 405, 312, 3483, 3338, 2736, 2613, 3278, 714, 1912, 1067, 2678, 3530, 1198 };
    assertEquals(24, typocoderdiv2.count(rating));
  }

  @Test
  public void case34() {
    int[] rating = { 1817, 3779, 3218, 2129, 63, 3981, 3781, 574, 325, 1989, 3594, 2308, 2075, 2424, 1071, 2439, 3253, 270, 1515, 3436, 3443, 2156, 887, 2247, 1829, 3665, 691, 3741, 532, 766, 2347, 1846, 2720, 203, 3964, 1224, 1282, 1289, 1781, 103, 2988, 3863, 483, 2737, 209, 1762, 1434, 731, 1388, 2647 };
    assertEquals(25, typocoderdiv2.count(rating));
  }

  @Test
  public void case35() {
    int[] rating = { 3302, 1509, 1386, 3739, 2752, 2868, 1468, 3677, 1867, 154, 3554, 2254, 3663, 712, 3484, 3548, 235, 3759, 2381, 1315, 2916, 3649, 72, 2338, 3787, 784, 1553, 3728, 618, 1638, 3416, 19, 1727, 2535, 2801, 1837, 3416, 406, 3181, 3372, 462, 3792, 3710, 2671, 2713, 2160, 184, 619, 1578, 327 };
    assertEquals(22, typocoderdiv2.count(rating));
  }

  @Test
  public void case36() {
    int[] rating = { 0 };
    assertEquals(0, typocoderdiv2.count(rating));
  }

  @Test
  public void case37() {
    int[] rating = { 4000 };
    assertEquals(1, typocoderdiv2.count(rating));
  }

  @Test
  public void case38() {
    int[] rating = { 1199 };
    assertEquals(0, typocoderdiv2.count(rating));
  }

  @Test
  public void case39() {
    int[] rating = { 1200 };
    assertEquals(1, typocoderdiv2.count(rating));
  }

  @Test
  public void case40() {
    int[] rating = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    assertEquals(0, typocoderdiv2.count(rating));
  }

  @Test
  public void case41() {
    int[] rating = { 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000 };
    assertEquals(1, typocoderdiv2.count(rating));
  }

  @Test
  public void case42() {
    int[] rating = { 1200, 1199, 1200, 1199, 1200, 1199, 1200, 1199, 1200, 1199, 1200, 1199, 1200, 1199, 1200, 1199, 1200, 1199, 1200, 1199, 1200, 1199, 1200, 1199, 1200, 1199, 1200, 1199, 1200, 1199, 1200, 1199, 1200, 1199, 1200, 1199, 1200, 1199, 1200, 1199, 1200, 1199, 1200, 1199, 1200, 1199, 1200, 1199, 1200, 1199 };
    assertEquals(50, typocoderdiv2.count(rating));
  }

  @Test
  public void case43() {
    int[] rating = { 1000 };
    assertEquals(0, typocoderdiv2.count(rating));
  }

  @Test
  public void case44() {
    int[] rating = { 1500 };
    assertEquals(1, typocoderdiv2.count(rating));
  }

  @Test
  public void case45() {
    int[] rating = { 2000 };
    assertEquals(1, typocoderdiv2.count(rating));
  }

  @Test
  public void case46() {
    int[] rating = { 1400 };
    assertEquals(1, typocoderdiv2.count(rating));
  }

  @Test
  public void case47() {
    int[] rating = { 1300, 100 };
    assertEquals(2, typocoderdiv2.count(rating));
  }

  @Test
  public void case48() {
    int[] rating = { 1200 };
    assertEquals(1, typocoderdiv2.count(rating));
  }

  @Test
  public void case49() {
    int[] rating = { 3000 };
    assertEquals(1, typocoderdiv2.count(rating));
  }

  @Test
  public void case50() {
    int[] rating = { 1200, 1200 };
    assertEquals(1, typocoderdiv2.count(rating));
  }

  @Test
  public void case51() {
    int[] rating = { 1222 };
    assertEquals(1, typocoderdiv2.count(rating));
  }

  @Test
  public void case52() {
    int[] rating = { 1300 };
    assertEquals(1, typocoderdiv2.count(rating));
  }

  @Test
  public void case53() {
    int[] rating = { 2500 };
    assertEquals(1, typocoderdiv2.count(rating));
  }

  @Test
  public void case54() {
    int[] rating = { 1500, 2200, 900, 3000 };
    assertEquals(3, typocoderdiv2.count(rating));
  }

  @Test
  public void case55() {
    int[] rating = { 1200, 1200, 500, 1300, 1200 };
    assertEquals(3, typocoderdiv2.count(rating));
  }

  @Test
  public void case56() {
    int[] rating = { 1600 };
    assertEquals(1, typocoderdiv2.count(rating));
  }

  @Test
  public void case57() {
    int[] rating = { 1575, 1090, 3271, 2496, 859, 2708, 3774, 2796, 1616, 2552, 3783, 2435, 1111, 526, 562 };
    assertEquals(6, typocoderdiv2.count(rating));
  }

  @Test
  public void case58() {
    int[] rating = { 500, 1200, 1201, 1200 };
    assertEquals(1, typocoderdiv2.count(rating));
  }

  @Test
  public void case59() {
    int[] rating = { 1200, 1200, 1200 };
    assertEquals(1, typocoderdiv2.count(rating));
  }

  @Test
  public void case60() {
    int[] rating = { 1500, 100, 100, 100 };
    assertEquals(2, typocoderdiv2.count(rating));
  }

  @Test
  public void case61() {
    int[] rating = { 1200, 0, 1200 };
    assertEquals(3, typocoderdiv2.count(rating));
  }

  @Test
  public void case62() {
    int[] rating = { 1202 };
    assertEquals(1, typocoderdiv2.count(rating));
  }

  @Test
  public void case63() {
    int[] rating = { 1200, 1199 };
    assertEquals(2, typocoderdiv2.count(rating));
  }

  @Test
  public void case64() {
    int[] rating = { 1300, 600 };
    assertEquals(2, typocoderdiv2.count(rating));
  }

  @Test
  public void case65() {
    int[] rating = { 1200, 1000 };
    assertEquals(2, typocoderdiv2.count(rating));
  }

  @Test
  public void case66() {
    int[] rating = { 950 };
    assertEquals(0, typocoderdiv2.count(rating));
  }

  @Test
  public void case67() {
    int[] rating = { 1201, 1201, 500 };
    assertEquals(2, typocoderdiv2.count(rating));
  }

  @Test
  public void case68() {
    int[] rating = { 1300, 1000 };
    assertEquals(2, typocoderdiv2.count(rating));
  }

  @Test
  public void case69() {
    int[] rating = { 575, 1090, 3271, 2496, 859, 2708, 3774, 2796, 1616, 2552, 3783, 2435, 1111, 526, 562 };
    assertEquals(4, typocoderdiv2.count(rating));
  }

  @Test
  public void case70() {
    int[] rating = { 1201, 1199, 1199 };
    assertEquals(2, typocoderdiv2.count(rating));
  }

  @Test
  public void case71() {
    int[] rating = { 1200, 1199, 1199 };
    assertEquals(2, typocoderdiv2.count(rating));
  }

  @Test
  public void case72() {
    int[] rating = { 1201 };
    assertEquals(1, typocoderdiv2.count(rating));
  }

  @Test
  public void case73() {
    int[] rating = { 1800 };
    assertEquals(1, typocoderdiv2.count(rating));
  }

  @Test
  public void case74() {
    int[] rating = { 1201, 1201 };
    assertEquals(1, typocoderdiv2.count(rating));
  }

  @Test
  public void case75() {
    int[] rating = { 1300, 700 };
    assertEquals(2, typocoderdiv2.count(rating));
  }

}
