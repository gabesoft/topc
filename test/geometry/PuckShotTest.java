package topc.test.geometry;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.geometry.*;

public class PuckShotTest {
  double DELTA = 1.0e-09;
  PuckShot puckshot = new PuckShot();

  @Test
  public void case1() {
    int puckCoord = 2833;
    int[] xCoords = { 1500, 1580 };
    int[] yCoords = { 1730, 1730 };
    assertEquals(47.022170720170784, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 47.022170720170784);
  }

  @Test
  public void case2() {
    int puckCoord = 2833;
    int[] xCoords = { 2690 };
    int[] yCoords = { 500 };
    assertEquals(44.88563731851585, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 44.88563731851585);
  }

  @Test
  public void case3() {
    int puckCoord = 2833;
    int[] xCoords = { 2690, 2676 };
    int[] yCoords = { 500, 500 };
    assertEquals(-1.0, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * -1.0);
  }

  @Test
  public void case4() {
    int puckCoord = 2900;
    int[] xCoords = { 1500, 1580, 2200, 2600 };
    int[] yCoords = { 1730, 1730, 1000, 500 };
    assertEquals(46.79257639615244, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 46.79257639615244);
  }

  @Test
  public void case5() {
    int puckCoord = 55;
    int[] xCoords = { 1479, 1427, 2556, 2834, 2866, 2958, 2763, 2899, 2630 };
    int[] yCoords = { 1708, 1726, 487, 471, 121, 446, 473, 266, 380 };
    assertEquals(21.706043385046158, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 21.706043385046158);
  }

  @Test
  public void case6() {
    int puckCoord = 1809;
    int[] xCoords = { 1571 };
    int[] yCoords = { 1730 };
    assertEquals(33.18726534329994, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 33.18726534329994);
  }

  @Test
  public void case7() {
    int puckCoord = 1;
    int[] xCoords = { 1831 };
    int[] yCoords = { 1629 };
    assertEquals(21.464425628113574, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 21.464425628113574);
  }

  @Test
  public void case8() {
    int puckCoord = 11;
    int[] xCoords = { 1668 };
    int[] yCoords = { 1693 };
    assertEquals(21.508782280926084, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 21.508782280926084);
  }

  @Test
  public void case9() {
    int puckCoord = 115;
    int[] xCoords = { 1504, 1430, 2568, 2477, 2767, 2507, 2645, 2684, 2838 };
    int[] yCoords = { 1732, 1720, 281, 228, 173, 472, 325, 225, 229 };
    assertEquals(21.980648511094003, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 21.980648511094003);
  }

  @Test
  public void case10() {
    int puckCoord = 2839;
    int[] xCoords = { 1472, 1550, 2905, 2692, 2687, 2688, 2854, 2798, 2950 };
    int[] yCoords = { 1705, 1701, 85, 174, 193, 263, 141, 448, 276 };
    assertEquals(-1.0, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * -1.0);
  }

  @Test
  public void case11() {
    int puckCoord = 655;
    int[] xCoords = { 1474, 1500, 2885, 2534, 2478, 2794, 2576, 2769, 2694 };
    int[] yCoords = { 1714, 1732, 391, 253, 392, 450, 186, 341, 326 };
    assertEquals(24.78288409190985, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 24.78288409190985);
  }

  @Test
  public void case12() {
    int puckCoord = 480;
    int[] xCoords = { 1514, 1509, 2600, 2675, 2878, 2782, 2584, 2873, 2722 };
    int[] yCoords = { 1699, 1688, 379, 119, 389, 283, 224, 102, 366 };
    assertEquals(23.803968594369593, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 23.803968594369593);
  }

  @Test
  public void case13() {
    int puckCoord = 1247;
    int[] xCoords = { 1545, 1503, 2615, 2504, 2886, 2721, 2497, 2579, 2926 };
    int[] yCoords = { 1647, 1678, 357, 83, 240, 446, 433, 211, 109 };
    assertEquals(28.729681693903068, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 28.729681693903068);
  }

  @Test
  public void case14() {
    int puckCoord = 2901;
    int[] xCoords = { 1486, 1447, 2627, 2797, 2908, 2827, 2713, 2647, 2500 };
    int[] yCoords = { 1698, 1659, 91, 186, 455, 280, 463, 93, 123 };
    assertEquals(-1.0, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * -1.0);
  }

  @Test
  public void case15() {
    int puckCoord = 37;
    int[] xCoords = { 1575, 1476, 2568, 2716, 2510, 2730, 2774, 2626, 2916 };
    int[] yCoords = { 1710, 1692, 142, 298, 292, 367, 99, 340, 156 };
    assertEquals(21.62493085310635, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 21.62493085310635);
  }

  @Test
  public void case16() {
    int puckCoord = 1669;
    int[] xCoords = { 1470, 1575, 2799, 2716, 2481, 2687, 2904, 2521, 2685 };
    int[] yCoords = { 1640, 1714, 435, 253, 301, 217, 139, 170, 108 };
    assertEquals(32.31733026762112, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 32.31733026762112);
  }

  @Test
  public void case17() {
    int puckCoord = 840;
    int[] xCoords = { 1528, 1472, 2953, 2854, 2918, 2849, 2643, 2663, 2852 };
    int[] yCoords = { 1649, 1725, 491, 284, 491, 343, 98, 243, 256 };
    assertEquals(25.902981728497977, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 25.902981728497977);
  }

  @Test
  public void case18() {
    int puckCoord = 1441;
    int[] xCoords = { 1580, 1494, 2834, 2658, 2650, 2486, 2648, 2891, 2649 };
    int[] yCoords = { 1729, 1649, 499, 229, 188, 141, 139, 259, 475 };
    assertEquals(29.923263658520504, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 29.923263658520504);
  }

  @Test
  public void case19() {
    int puckCoord = 1359;
    int[] xCoords = { 1464, 1500, 2765, 2961, 2705, 2896, 2866, 2650, 2720 };
    int[] yCoords = { 1685, 1732, 477, 286, 309, 214, 59, 260, 429 };
    assertEquals(29.609131167187037, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 29.609131167187037);
  }

  @Test
  public void case20() {
    int puckCoord = 72;
    int[] xCoords = { 1531, 1469, 2735, 2539, 2540, 2574, 2769, 2763, 2485 };
    int[] yCoords = { 1666, 1718, 174, 212, 134, 363, 162, 440, 380 };
    assertEquals(21.783183102247648, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 21.783183102247648);
  }

  @Test
  public void case21() {
    int puckCoord = 851;
    int[] xCoords = { 1551, 1516, 2841, 2763, 2565, 2493, 2857, 2512, 2550 };
    int[] yCoords = { 1731, 1658, 306, 244, 140, 393, 303, 461, 302 };
    assertEquals(25.972558302706005, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 25.972558302706005);
  }

  @Test
  public void case22() {
    int puckCoord = 2026;
    int[] xCoords = { 1494, 1475, 2841, 2540, 2959, 2718, 2930, 2580, 2862 };
    int[] yCoords = { 1700, 1703, 396, 460, 85, 249, 358, 392, 51 };
    assertEquals(-1.0, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * -1.0);
  }

  @Test
  public void case23() {
    int puckCoord = 2458;
    int[] xCoords = { 1501, 1585, 2568, 2612, 2671, 2928, 2861, 2769, 2531 };
    int[] yCoords = { 1720, 1687, 395, 219, 178, 423, 302, 456, 283 };
    assertEquals(-1.0, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * -1.0);
  }

  @Test
  public void case24() {
    int puckCoord = 950;
    int[] xCoords = { 1522, 1499, 2835, 2681, 2482, 2898, 2655, 2831, 2740 };
    int[] yCoords = { 1703, 1704, 441, 241, 232, 427, 93, 88, 91 };
    assertEquals(26.61472958617206, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 26.61472958617206);
  }

  @Test
  public void case25() {
    int puckCoord = 1411;
    int[] xCoords = { 1501, 1420, 2869, 2563, 2967, 2920, 2862, 2620, 2896 };
    int[] yCoords = { 1722, 1718, 133, 201, 260, 227, 144, 155, 479 };
    assertEquals(30.034287741826027, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 30.034287741826027);
  }

  @Test
  public void case26() {
    int puckCoord = 2861;
    int[] xCoords = { 1478, 1499, 2668, 2822, 2953, 2943, 2485, 2695, 2812 };
    int[] yCoords = { 1658, 1725, 293, 290, 177, 187, 292, 352, 220 };
    assertEquals(48.23641542085916, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 48.23641542085916);
  }

  @Test
  public void case27() {
    int puckCoord = 519;
    int[] xCoords = { 1521, 1545, 2570, 2750, 2963, 2728, 2944, 2883, 2534 };
    int[] yCoords = { 1725, 1730, 68, 242, 376, 161, 311, 149, 413 };
    assertEquals(24.015771472506188, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 24.015771472506188);
  }

  @Test
  public void case28() {
    int puckCoord = 678;
    int[] xCoords = { 1489, 1497, 2627, 2696, 2705, 2835, 2772, 2839, 2613 };
    int[] yCoords = { 1682, 1706, 122, 200, 291, 488, 340, 298, 452 };
    assertEquals(24.917177035275017, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 24.917177035275017);
  }

  @Test
  public void case29() {
    int puckCoord = 2849;
    int[] xCoords = { 1498, 1535, 2721, 2492, 2591, 2769, 2540, 2501, 2573 };
    int[] yCoords = { 1732, 1703, 115, 394, 249, 404, 287, 108, 264 };
    assertEquals(-1.0, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * -1.0);
  }

  @Test
  public void case30() {
    int puckCoord = 2859;
    int[] xCoords = { 1543, 1441, 2709, 2688, 2549, 2491, 2648, 2866, 2625 };
    int[] yCoords = { 1685, 1722, 144, 331, 250, 241, 172, 323, 206 };
    assertEquals(47.114293288225944, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 47.114293288225944);
  }

  @Test
  public void case31() {
    int puckCoord = 499;
    int[] xCoords = { 1508, 1535, 2932, 2946, 2850, 2809, 2526, 2505, 2873 };
    int[] yCoords = { 1732, 1669, 283, 215, 447, 136, 251, 419, 222 };
    assertEquals(23.906713436666493, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 23.906713436666493);
  }

  @Test
  public void case32() {
    int puckCoord = 2243;
    int[] xCoords = { 1425, 1540, 2688, 2575, 2584, 2785, 2649, 2723, 2823 };
    int[] yCoords = { 1686, 1656, 500, 161, 141, 171, 408, 380, 257 };
    assertEquals(36.45054739069765, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 36.45054739069765);
  }

  @Test
  public void case33() {
    int puckCoord = 858;
    int[] xCoords = { 1484, 1567, 2944, 2523, 2628, 2532, 2487, 2817, 2864 };
    int[] yCoords = { 1669, 1707, 98, 451, 391, 486, 84, 81, 125 };
    assertEquals(26.017015664393845, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 26.017015664393845);
  }

  @Test
  public void case34() {
    int puckCoord = 1438;
    int[] xCoords = { 1468, 1517, 2769, 2931, 2501, 2752, 2690, 2547, 2737 };
    int[] yCoords = { 1646, 1731, 186, 324, 399, 482, 162, 470, 308 };
    assertEquals(30.259435247307067, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 30.259435247307067);
  }

  @Test
  public void case35() {
    int puckCoord = 2128;
    int[] xCoords = { 1590, 1528, 2653, 2657, 2804, 2604, 2796, 2743, 2850 };
    int[] yCoords = { 1730, 1707, 219, 414, 178, 303, 168, 215, 213 };
    assertEquals(36.7704834376051, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 36.7704834376051);
  }

  @Test
  public void case36() {
    int puckCoord = 91;
    int[] xCoords = { 1460, 1412, 2926, 2874, 2553, 2769, 2734, 2921, 2665 };
    int[] yCoords = { 1722, 1699, 354, 449, 84, 51, 253, 110, 159 };
    assertEquals(21.870017567612067, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 21.870017567612067);
  }

  @Test
  public void case37() {
    int puckCoord = 1486;
    int[] xCoords = { 1537, 1476, 2751, 2682, 2784, 2510, 2781, 2704, 2742 };
    int[] yCoords = { 1676, 1649, 98, 430, 402, 165, 371, 93, 219 };
    assertEquals(30.66732440931191, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 30.66732440931191);
  }

  @Test
  public void case38() {
    int puckCoord = 838;
    int[] xCoords = { 1468, 1485, 2903, 2898, 2743, 2864, 2661, 2667, 2836 };
    int[] yCoords = { 1691, 1712, 364, 226, 412, 354, 312, 136, 185 };
    assertEquals(25.890368709532936, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 25.890368709532936);
  }

  @Test
  public void case39() {
    int puckCoord = 2810;
    int[] xCoords = { 1511, 1518, 2613, 2562, 2542, 2963, 2495, 2831, 2693 };
    int[] yCoords = { 1678, 1670, 367, 473, 302, 140, 292, 98, 453 };
    assertEquals(-1.0, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * -1.0);
  }

  @Test
  public void case40() {
    int puckCoord = 1098;
    int[] xCoords = { 1493, 1453, 2917, 2820, 2483, 2955, 2779, 2946, 2765 };
    int[] yCoords = { 1712, 1686, 239, 461, 397, 110, 358, 362, 477 };
    assertEquals(27.631422371236447, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 27.631422371236447);
  }

  @Test
  public void case41() {
    int puckCoord = 1140;
    int[] xCoords = { 1472, 1552, 2657, 2724, 2524, 2729, 2791, 2836, 2952 };
    int[] yCoords = { 1686, 1695, 470, 98, 101, 460, 500, 370, 255 };
    assertEquals(27.933100262427935, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 27.933100262427935);
  }

  @Test
  public void case42() {
    int puckCoord = 2762;
    int[] xCoords = { 1500, 1594, 2814, 2659, 2865, 2542, 2904, 2942, 2660 };
    int[] yCoords = { 1732, 1719, 342, 182, 71, 245, 401, 497, 470 };
    assertEquals(45.84550797561554, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 45.84550797561554);
  }

  @Test
  public void case43() {
    int puckCoord = 35;
    int[] xCoords = { 1460, 1525, 2541, 2757, 2949, 2957, 2921, 2746, 2581 };
    int[] yCoords = { 1644, 1725, 284, 447, 243, 422, 490, 284, 224 };
    assertEquals(21.61595396254762, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 21.61595396254762);
  }

  @Test
  public void case44() {
    int puckCoord = 2679;
    int[] xCoords = { 1450, 1545, 2701, 2657, 2681, 2672, 2476, 2530, 2790 };
    int[] yCoords = { 1687, 1690, 400, 140, 476, 250, 388, 223, 338 };
    assertEquals(45.05791629169531, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 45.05791629169531);
  }

  @Test
  public void case45() {
    int puckCoord = 2328;
    int[] xCoords = { 1431, 1526, 2475, 2586, 2647, 2910, 2803, 2714, 2817 };
    int[] yCoords = { 1720, 1680, 444, 333, 198, 391, 428, 235, 56 };
    assertEquals(39.79337934817982, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 39.79337934817982);
  }

  @Test
  public void case46() {
    int puckCoord = 152;
    int[] xCoords = { 1500, 1487, 2728, 2491, 2621, 2825, 2642, 2955, 2904 };
    int[] yCoords = { 1732, 1731, 143, 336, 324, 266, 208, 165, 298 };
    assertEquals(22.15330349945802, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 22.15330349945802);
  }

  @Test
  public void case47() {
    int puckCoord = 1031;
    int[] xCoords = { 1501, 1535, 2857, 2678, 2560, 2779, 2967, 2598, 2557 };
    int[] yCoords = { 1724, 1655, 70, 376, 282, 272, 261, 127, 381 };
    assertEquals(27.162423084690076, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 27.162423084690076);
  }

  @Test
  public void case48() {
    int puckCoord = 55;
    int[] xCoords = { 1479, 1427, 2530, 2808, 2840, 2932, 2737, 2873, 2604 };
    int[] yCoords = { 1708, 1726, 487, 471, 121, 446, 473, 266, 380 };
    assertEquals(21.706043385046158, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 21.706043385046158);
  }

  @Test
  public void case49() {
    int puckCoord = 2628;
    int[] xCoords = { 1548, 1485, 2725, 2519, 2813, 2883, 2620, 2836, 2647 };
    int[] yCoords = { 1667, 1645, 204, 125, 347, 407, 391, 169, 357 };
    assertEquals(44.22544934160531, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 44.22544934160531);
  }

  @Test
  public void case50() {
    int puckCoord = 1891;
    int[] xCoords = { 1543, 1518, 2662, 2944, 2757, 2493, 2962, 2557, 2769 };
    int[] yCoords = { 1697, 1698, 214, 155, 206, 53, 479, 444, 382 };
    assertEquals(32.722652216820116, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 32.722652216820116);
  }

  @Test
  public void case51() {
    int puckCoord = 1919;
    int[] xCoords = { 1498, 1589, 2876, 2731, 2672, 2763, 2539, 2749, 2884 };
    int[] yCoords = { 1689, 1710, 100, 140, 319, 387, 230, 426, 313 };
    assertEquals(34.842691883211046, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 34.842691883211046);
  }

  @Test
  public void case52() {
    int puckCoord = 623;
    int[] xCoords = { 1588, 1496, 2567, 2691, 2867, 2635, 2511, 2958, 2523 };
    int[] yCoords = { 1691, 1676, 76, 160, 345, 450, 205, 498, 83 };
    assertEquals(24.59828302183631, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 24.59828302183631);
  }

  @Test
  public void case53() {
    int puckCoord = 665;
    int[] xCoords = { 1472, 1538, 2610, 2951, 2756, 2634, 2967, 2847, 2671 };
    int[] yCoords = { 1710, 1716, 238, 463, 318, 128, 425, 241, 52 };
    assertEquals(24.84110535733005, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 24.84110535733005);
  }

  @Test
  public void case54() {
    int puckCoord = 1693;
    int[] xCoords = { 1455, 1442, 2579, 2944, 2740, 2667, 2932, 2580, 2797 };
    int[] yCoords = { 1678, 1651, 407, 63, 183, 194, 377, 494, 352 };
    assertEquals(32.54553768877361, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 32.54553768877361);
  }

  @Test
  public void case55() {
    int puckCoord = 2199;
    int[] xCoords = { 1504, 1466, 2655, 2722, 2795, 2887, 2614, 2762, 2886 };
    int[] yCoords = { 1643, 1683, 271, 245, 485, 420, 326, 487, 315 };
    assertEquals(36.53508316908163, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 36.53508316908163);
  }

  @Test
  public void case56() {
    int puckCoord = 943;
    int[] xCoords = { 1541, 1494, 2652, 2799, 2813, 2807, 2539, 2849, 2964 };
    int[] yCoords = { 1683, 1730, 96, 200, 420, 118, 158, 164, 463 };
    assertEquals(26.56835772021335, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 26.56835772021335);
  }

  @Test
  public void case57() {
    int puckCoord = 1129;
    int[] xCoords = { 1479, 1539, 2598, 2741, 2955, 2587, 2604, 2641, 2913 };
    int[] yCoords = { 1699, 1698, 114, 209, 207, 270, 375, 492, 97 };
    assertEquals(27.85350529829538, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 27.85350529829538);
  }

  @Test
  public void case58() {
    int puckCoord = 2767;
    int[] xCoords = { 1521, 1469, 2707, 2651, 2923, 2511, 2778, 2734, 2852 };
    int[] yCoords = { 1716, 1721, 450, 223, 302, 221, 410, 52, 74 };
    assertEquals(-1.0, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * -1.0);
  }

  @Test
  public void case59() {
    int puckCoord = 1709;
    int[] xCoords = { 1594, 1491, 2612, 2904, 2519, 2795, 2618, 2954, 2677 };
    int[] yCoords = { 1706, 1703, 69, 293, 370, 233, 151, 462, 306 };
    assertEquals(32.699275562952415, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 32.699275562952415);
  }

  @Test
  public void case60() {
    int puckCoord = 2841;
    int[] xCoords = { 1514, 1438, 2672, 2719, 2773, 2673, 2828, 2510, 2945 };
    int[] yCoords = { 1694, 1703, 324, 235, 249, 140, 406, 262, 256 };
    assertEquals(46.96696076023582, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 46.96696076023582);
  }

  @Test
  public void case61() {
    int puckCoord = 393;
    int[] xCoords = { 1497, 1562, 2678, 2611, 2690, 2518, 2482, 2656, 2633 };
    int[] yCoords = { 1696, 1689, 364, 240, 448, 363, 485, 51, 491 };
    assertEquals(23.343947654891466, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 23.343947654891466);
  }

  @Test
  public void case62() {
    int puckCoord = 811;
    int[] xCoords = { 1426, 1480, 2580, 2554, 2691, 2485, 2941, 2693, 2573 };
    int[] yCoords = { 1680, 1725, 104, 288, 379, 310, 317, 314, 236 };
    assertEquals(25.72120594463378, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 25.72120594463378);
  }

  @Test
  public void case63() {
    int puckCoord = 1336;
    int[] xCoords = { 1472, 1509, 2554, 2552, 2813, 2900, 2827, 2704, 2901 };
    int[] yCoords = { 1699, 1722, 205, 335, 162, 389, 495, 201, 301 };
    assertEquals(29.42455449702296, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 29.42455449702296);
  }

  @Test
  public void case64() {
    int puckCoord = 1334;
    int[] xCoords = { 1527, 1513, 2509, 2505, 2873, 2893, 2707, 2857, 2585 };
    int[] yCoords = { 1654, 1671, 338, 75, 303, 485, 254, 281, 496 };
    assertEquals(29.408603323726766, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 29.408603323726766);
  }

  @Test
  public void case65() {
    int puckCoord = 1646;
    int[] xCoords = { 1479, 1468, 2762, 2547, 2878, 2485, 2615, 2597, 2808 };
    int[] yCoords = { 1729, 1697, 399, 400, 482, 271, 329, 307, 247 };
    assertEquals(32.101295117355, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 32.101295117355);
  }

  @Test
  public void case66() {
    int puckCoord = 1309;
    int[] xCoords = { 1415, 1499, 2556, 2742, 2593, 2864, 2911, 2838, 2934 };
    int[] yCoords = { 1684, 1730, 470, 239, 474, 407, 114, 88, 104 };
    assertEquals(29.21053511716169, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 29.21053511716169);
  }

  @Test
  public void case67() {
    int puckCoord = 1664;
    int[] xCoords = { 1537, 1527, 2819, 2488, 2874, 2550, 2620, 2793, 2600 };
    int[] yCoords = { 1698, 1671, 257, 294, 281, 91, 432, 294, 461 };
    assertEquals(32.27014579240081, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 32.27014579240081);
  }

  @Test
  public void case68() {
    int puckCoord = 1461;
    int[] xCoords = { 1500, 1519, 2486, 2518, 2709, 2558, 2596, 2514, 2891 };
    int[] yCoords = { 1732, 1654, 364, 378, 283, 493, 434, 412, 159 };
    assertEquals(30.453650337044166, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 30.453650337044166);
  }

  @Test
  public void case69() {
    int puckCoord = 2215;
    int[] xCoords = { 1548, 1503, 2498, 2713, 2914, 2825, 2525, 2960, 2657 };
    int[] yCoords = { 1660, 1709, 425, 155, 292, 167, 321, 55, 356 };
    assertEquals(37.31873142401753, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 37.31873142401753);
  }

  @Test
  public void case70() {
    int puckCoord = 1819;
    int[] xCoords = { 1413, 1503, 2506, 2941, 2556, 2691, 2505, 2930, 2935 };
    int[] yCoords = { 1714, 1730, 206, 469, 387, 252, 121, 295, 131 };
    assertEquals(33.79206711472079, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 33.79206711472079);
  }

  @Test
  public void case71() {
    int puckCoord = 2699;
    int[] xCoords = { 1434, 1483, 2947, 2742, 2552, 2652, 2645, 2715, 2685 };
    int[] yCoords = { 1723, 1729, 355, 124, 75, 82, 324, 498, 322 };
    assertEquals(43.12723573636204, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 43.12723573636204);
  }

  @Test
  public void case72() {
    int puckCoord = 1797;
    int[] xCoords = { 1477, 1502, 2731, 2595, 2843, 2564, 2665, 2936, 2527 };
    int[] yCoords = { 1680, 1673, 282, 284, 312, 241, 77, 233, 380 };
    assertEquals(33.56838294203687, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 33.56838294203687);
  }

  @Test
  public void case73() {
    int puckCoord = 2404;
    int[] xCoords = { 1448, 1450, 2773, 2544, 2532, 2685, 2726, 2496, 2689 };
    int[] yCoords = { 1653, 1707, 205, 73, 273, 184, 398, 444, 240 };
    assertEquals(-1.0, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * -1.0);
  }

  @Test
  public void case74() {
    int puckCoord = 579;
    int[] xCoords = { 1510, 1447, 2527, 2572, 2540, 2894, 2715, 2737, 2877 };
    int[] yCoords = { 1714, 1665, 176, 152, 153, 472, 293, 55, 391 };
    assertEquals(24.3486301778553, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 24.3486301778553);
  }

  @Test
  public void case75() {
    int puckCoord = 2703;
    int[] xCoords = { 1439, 1449, 2753, 2558, 2533, 2827, 2967, 2598, 2655 };
    int[] yCoords = { 1708, 1694, 171, 355, 255, 234, 199, 470, 467 };
    assertEquals(45.4582231624032, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 45.4582231624032);
  }

  @Test
  public void case76() {
    int puckCoord = 2360;
    int[] xCoords = { 1550, 1427, 2560, 2825, 2648, 2825, 2663, 2651, 2693 };
    int[] yCoords = { 1731, 1711, 192, 281, 239, 113, 66, 411, 214 };
    assertEquals(-1.0, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * -1.0);
  }

  @Test
  public void case77() {
    int puckCoord = 845;
    int[] xCoords = { 1543, 1439, 2540, 2773, 2583, 2726, 2759, 2584, 2501 };
    int[] yCoords = { 1699, 1684, 415, 328, 443, 349, 323, 337, 362 };
    assertEquals(25.93456438043377, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 25.93456438043377);
  }

  @Test
  public void case78() {
    int puckCoord = 112;
    int[] xCoords = { 1546, 1499, 2861, 2795, 2831, 2573, 2612, 2773, 2917 };
    int[] yCoords = { 1676, 1732, 336, 63, 105, 185, 478, 76, 60 };
    assertEquals(21.96676149838636, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 21.96676149838636);
  }

  @Test
  public void case79() {
    int puckCoord = 2708;
    int[] xCoords = { 1511, 1538, 2690, 2616, 2598, 2537, 2887, 2643, 2706 };
    int[] yCoords = { 1709, 1687, 211, 342, 337, 342, 426, 166, 253 };
    assertEquals(44.73226466129779, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 44.73226466129779);
  }

  @Test
  public void case80() {
    int puckCoord = 2818;
    int[] xCoords = { 1530, 1481, 2664, 2491, 2951, 2774, 2837, 2759, 2532 };
    int[] yCoords = { 1698, 1702, 225, 370, 258, 241, 438, 376, 255 };
    assertEquals(44.59886924109083, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 44.59886924109083);
  }

  @Test
  public void case81() {
    int puckCoord = 2494;
    int[] xCoords = { 1528, 1450, 2487, 2506, 2822, 2587, 2516, 2730, 2787 };
    int[] yCoords = { 1689, 1684, 275, 99, 169, 259, 494, 370, 135 };
    assertEquals(42.15130536538905, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 42.15130536538905);
  }

  @Test
  public void case82() {
    int puckCoord = 879;
    int[] xCoords = { 1477, 1514, 2959, 2658, 2688, 2573, 2777, 2764, 2915 };
    int[] yCoords = { 1730, 1728, 247, 409, 206, 203, 173, 335, 158 };
    assertEquals(26.15124103849317, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 26.15124103849317);
  }

  @Test
  public void case83() {
    int puckCoord = 1293;
    int[] xCoords = { 1572, 1483, 2873, 2705, 2880, 2873, 2636, 2965, 2479 };
    int[] yCoords = { 1681, 1724, 95, 176, 61, 393, 285, 304, 454 };
    assertEquals(29.085043625440115, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 29.085043625440115);
  }

  @Test
  public void case84() {
    int puckCoord = 2357;
    int[] xCoords = { 1545, 1507, 2614, 2767, 2926, 2930, 2880, 2600, 2649 };
    int[] yCoords = { 1677, 1672, 415, 64, 195, 405, 267, 277, 344 };
    assertEquals(40.18937659495279, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 40.18937659495279);
  }

  @Test
  public void case85() {
    int puckCoord = 2965;
    int[] xCoords = { 1461, 1479, 2748, 2572, 2905, 2961, 2779, 2727, 2806 };
    int[] yCoords = { 1724, 1701, 340, 322, 191, 321, 232, 334, 199 };
    assertEquals(-1.0, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * -1.0);
  }

  @Test
  public void case86() {
    int puckCoord = 1310;
    int[] xCoords = { 1499, 1507, 2619, 2880, 2832, 2599, 2693, 2552, 2537 };
    int[] yCoords = { 1696, 1698, 63, 344, 444, 450, 117, 361, 298 };
    assertEquals(29.218411128774186, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 29.218411128774186);
  }

  @Test
  public void case87() {
    int puckCoord = 2820;
    int[] xCoords = { 1442, 1503, 2678, 2523, 2586, 2886, 2652, 2957, 2726 };
    int[] yCoords = { 1705, 1719, 276, 258, 266, 418, 355, 315, 222 };
    assertEquals(47.49105008761407, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 47.49105008761407);
  }

  @Test
  public void case88() {
    int puckCoord = 2199;
    int[] xCoords = { 1558, 1524, 2766, 2751, 2621, 2682, 2721, 2872, 2804 };
    int[] yCoords = { 1725, 1721, 476, 314, 164, 252, 432, 150, 233 };
    assertEquals(38.108521290089946, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 38.108521290089946);
  }

  @Test
  public void case89() {
    int puckCoord = 347;
    int[] xCoords = { 1531, 1502, 2688, 2565, 2874, 2719, 2499, 2596, 2944 };
    int[] yCoords = { 1724, 1724, 473, 498, 66, 189, 111, 172, 104 };
    assertEquals(23.107440730927863, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 23.107440730927863);
  }

  @Test
  public void case90() {
    int puckCoord = 1423;
    int[] xCoords = { 1459, 1498, 2784, 2663, 2901, 2650, 2750, 2869, 2656 };
    int[] yCoords = { 1715, 1718, 274, 94, 163, 237, 66, 140, 425 };
    assertEquals(30.13397728369089, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 30.13397728369089);
  }

  @Test
  public void case91() {
    int puckCoord = 199;
    int[] xCoords = { 1531, 1441, 2732, 2906, 2823, 2952, 2831, 2785, 2617 };
    int[] yCoords = { 1723, 1673, 143, 490, 74, 316, 62, 207, 403 };
    assertEquals(22.37636975893011, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 22.37636975893011);
  }

  @Test
  public void case92() {
    int puckCoord = 1642;
    int[] xCoords = { 1478, 1521, 2801, 2842, 2782, 2847, 2478, 2703, 2931 };
    int[] yCoords = { 1685, 1728, 480, 296, 221, 165, 313, 308, 289 };
    assertEquals(32.06398685211629, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 32.06398685211629);
  }

  @Test
  public void case93() {
    int puckCoord = 2969;
    int[] xCoords = { 1554, 1524, 2966, 2506, 2943, 2849, 2548, 2884, 2659 };
    int[] yCoords = { 1649, 1713, 100, 192, 182, 491, 125, 196, 415 };
    assertEquals(-1.0, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * -1.0);
  }

  @Test
  public void case94() {
    int puckCoord = 490;
    int[] xCoords = { 1492, 1441, 2637, 2542, 2539, 2698, 2603, 2661, 2921 };
    int[] yCoords = { 1730, 1655, 330, 415, 151, 401, 142, 151, 197 };
    assertEquals(23.857940942631842, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 23.857940942631842);
  }

  @Test
  public void case95() {
    int puckCoord = 74;
    int[] xCoords = { 1484, 1571, 2663, 2939, 2761, 2849, 2720, 2537, 2938 };
    int[] yCoords = { 1724, 1678, 75, 482, 322, 135, 254, 315, 183 };
    assertEquals(21.792292668875902, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 21.792292668875902);
  }

  @Test
  public void case96() {
    int puckCoord = 1013;
    int[] xCoords = { 1505, 1455, 2763, 2539, 2532, 2518, 2952, 2475, 2528 };
    int[] yCoords = { 1721, 1653, 429, 447, 349, 129, 211, 242, 96 };
    assertEquals(27.03892029424609, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 27.03892029424609);
  }

  @Test
  public void case97() {
    int puckCoord = 2474;
    int[] xCoords = { 1433, 1483, 2672, 2624, 2504, 2555, 2886, 2659, 2956 };
    int[] yCoords = { 1716, 1700, 110, 199, 195, 319, 326, 500, 427 };
    assertEquals(-1.0, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * -1.0);
  }

  @Test
  public void case98() {
    int puckCoord = 2038;
    int[] xCoords = { 1473, 1531, 2549, 2640, 2818, 2603, 2754, 2905, 2527 };
    int[] yCoords = { 1682, 1665, 96, 185, 106, 249, 53, 68, 364 };
    assertEquals(35.3050273265593, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 35.3050273265593);
  }

  @Test
  public void case99() {
    int puckCoord = 654;
    int[] xCoords = { 1463, 1409, 2526, 2913, 2790, 2624, 2685, 2703, 2690 };
    int[] yCoords = { 1723, 1719, 80, 193, 104, 321, 209, 405, 265 };
    assertEquals(24.77707602455017, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 24.77707602455017);
  }

  @Test
  public void case100() {
    int puckCoord = 2483;
    int[] xCoords = { 1416, 1486, 2802, 2958, 2945, 2546, 2519, 2747, 2891 };
    int[] yCoords = { 1730, 1673, 340, 212, 202, 442, 155, 264, 212 };
    assertEquals(41.98803448278311, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 41.98803448278311);
  }

  @Test
  public void case101() {
    int puckCoord = 2334;
    int[] xCoords = { 1459, 1396, 1509, 1559, 1609 };
    int[] yCoords = { 1717, 1727, 1717, 1717, 1717 };
    assertEquals(37.569832573137546, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * 37.569832573137546);
  }

  @Test
  public void case102() {
    int puckCoord = 1;
    int[] xCoords = { 26 };
    int[] yCoords = { 1 };
    assertEquals(-1.0, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * -1.0);
  }

  @Test
  public void case103() {
    int puckCoord = 1000;
    int[] xCoords = { 1400, 1450, 1500, 1550, 1600 };
    int[] yCoords = { 1733, 1733, 1733, 1733, 1733 };
    assertEquals(-1.0, puckshot.caromAngle(puckCoord, xCoords, yCoords), DELTA * -1.0);
  }

}
