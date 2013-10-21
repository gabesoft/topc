package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class P8XGraphBuilderTest {
    P8XGraphBuilder p8xgraphbuilder = new P8XGraphBuilder();

    @Test
    public void case1() {
        int[] scores = { 1, 3, 0 };
        assertEquals(8, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case2() {
        int[] scores = { 0, 0, 0, 10 };
        assertEquals(10, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case3() {
        int[] scores = { 1, 2, 3, 4, 5, 6 };
        assertEquals(12, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case4() {
        int[] scores = { 5, 0, 0 };
        assertEquals(15, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case5() {
        int[] scores = { 10000 };
        assertEquals(20000, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case6() {
        int[] scores = { 10000, 0, 0, 0, 0, 0, 10000, 0, 0, 0, 0, 10000, 0, 0, 0, 0, 0, 10000 };
        assertEquals(190000, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case7() {
        int[] scores = { 0, 3, 1 };
        assertEquals(6, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case8() {
        int[] scores = { 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000 };
        assertEquals(510000, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case9() {
        int[] scores = { 4, 5, 6, 7 };
        assertEquals(23, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case10() {
        int[] scores = { 1, 3, 2, 5, 3, 7, 5 };
        assertEquals(20, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case11() {
        int[] scores = { 10, 21, 29, 41, 49, 59, 71 };
        assertEquals(146, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case12() {
        int[] scores = { 7, 18, 0, 39, 0, 0, 0, 80 };
        assertEquals(140, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case13() {
        int[] scores = { 0, 0, 0, 4, 7, 0, 0 };
        assertEquals(8, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case14() {
        int[] scores = { 1536, 3976, 9368, 5164, 2635, 6510, 3443, 3293, 7391, 2953, 9185, 8683, 2958, 5987, 4680, 1586, 4920, 6392, 2330, 2725, 5064, 9025, 4348, 8736, 8199, 2490, 7231, 5505, 8020, 4377, 5667, 9419, 5555, 7404, 4567, 2061, 2423, 1523, 2541, 881, 2872, 1803, 5961, 5861, 6026, 6062, 9098, 8117, 6675 };
        assertEquals(264768, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case15() {
        int[] scores = { 2879, 8295, 3104 };
        assertEquals(22348, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case16() {
        int[] scores = { 2731, 6643, 2362, 7394, 7728, 8372, 6708, 7035, 1375, 1355, 5932, 6438, 4287, 8750, 4139, 3192, 2862, 321, 4767, 7315, 8817, 6087, 8953, 1385 };
        assertEquals(158251, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case17() {
        int[] scores = { 5545, 3532, 3108, 8784, 82, 3696, 1283, 1504, 5417, 3350, 4928, 8033, 8709, 1217, 4035, 5079, 8580, 8005, 8595, 4791, 7543, 231, 8078, 3083, 2659, 3353, 4361, 1976, 3959, 6112, 6297, 7211, 7388, 7486, 1002, 6270, 1128, 3769, 3556, 7759, 5792, 1229 };
        assertEquals(278105, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case18() {
        int[] scores = { 2630, 3683, 4111, 8621, 9383, 9284, 4540, 9258, 2549, 6487, 4353, 9110, 3037, 9195 };
        assertEquals(64467, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case19() {
        int[] scores = { 9995, 1279, 9367, 8724, 1784, 5371, 9725, 2602, 3480, 5696, 885, 2672, 9953, 712, 1365, 3633, 1837, 4991, 9654, 5351, 5626, 5837, 54, 4192, 6806, 5627, 8142, 8117, 892, 8379, 8521, 5957, 7834, 1420, 126, 1304, 950, 8547, 9889, 242, 210, 6835, 2149, 485, 9111, 4662, 752, 4763 };
        assertEquals(488108, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case20() {
        int[] scores = { 364, 3759, 3448, 2554, 9161, 9126, 418 };
        assertEquals(23282, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case21() {
        int[] scores = { 7617, 9979, 1701, 3152, 4491, 3915, 8398, 9542, 2702, 439, 443, 9059, 8702, 7037 };
        assertEquals(144961, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case22() {
        int[] scores = { 9868, 1510, 8604, 9804, 3540, 6214, 9138, 7084 };
        assertEquals(86220, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case23() {
        int[] scores = { 2679, 1464, 4512, 5231, 9128, 2235, 5067, 5590, 3329, 1720, 3683, 8629, 9887, 5836, 6891, 6501, 6839, 5185, 7255, 3007, 7638, 4482, 4645, 4797, 5081, 2140, 7424, 3626, 2266, 2507, 6827, 430, 123, 3564, 5882, 4496, 6772, 4056, 8862, 412, 5774 };
        assertEquals(177008, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case24() {
        int[] scores = { 0, 110 };
        assertEquals(110, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case25() {
        int[] scores = { 30, 60 };
        assertEquals(120, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case26() {
        int[] scores = { 39, 78 };
        assertEquals(156, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case27() {
        int[] scores = { 71, 140 };
        assertEquals(282, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case28() {
        int[] scores = { 0, 178 };
        assertEquals(178, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case29() {
        int[] scores = { 0, 0, 357 };
        assertEquals(357, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case30() {
        int[] scores = { 65, 130, 195 };
        assertEquals(390, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case31() {
        int[] scores = { 15, 30, 45 };
        assertEquals(90, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case32() {
        int[] scores = { 87, 172, 258 };
        assertEquals(519, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case33() {
        int[] scores = { 145, 0, 147 };
        assertEquals(582, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case34() {
        int[] scores = { 0, 56, 84, 112, 140 };
        assertEquals(224, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case35() {
        int[] scores = { 113, 226, 339, 452, 565 };
        assertEquals(1130, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case36() {
        int[] scores = { 14, 14, 42, 56, 14 };
        assertEquals(140, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case37() {
        int[] scores = { 93, 186, 278, 372, 462 };
        assertEquals(930, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case38() {
        int[] scores = { 114, 0, 0, 256, 0 };
        assertEquals(712, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case39() {
        int[] scores = { 91, 0, 273, 0, 0, 0, 0, 728, 819, 0 };
        assertEquals(1820, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case40() {
        int[] scores = { 160, 320, 480, 640, 800, 960, 1120, 1280, 1440, 1600 };
        assertEquals(3200, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case41() {
        int[] scores = { 67, 134, 21, 28, 35, 402, 49, 56, 63, 70 };
        assertEquals(1340, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case42() {
        int[] scores = { 85, 168, 255, 336, 425, 500, 583, 680, 749, 832 };
        assertEquals(1700, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case43() {
        int[] scores = { 8, 0, 24, 44, 40, 0, 41, 64, 99, 80 };
        assertEquals(196, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case44() {
        int[] scores = { 124, 248, 372, 496, 0, 744, 0, 992, 1116, 1240, 1364, 0, 1612, 1736, 0, 1984, 2108, 2232, 2356, 2480, 2604 };
        assertEquals(5208, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case45() {
        int[] scores = { 59, 118, 177, 236, 295, 354, 413, 472, 531, 590, 649, 708, 767, 826, 885, 944, 1003, 1062, 1121, 1180, 1239 };
        assertEquals(2478, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case46() {
        int[] scores = { 12, 18, 36, 36, 45, 54, 48, 54, 81, 120, 72, 144, 84, 90, 135, 144, 153, 216, 171, 126, 189 };
        assertEquals(504, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case47() {
        int[] scores = { 26, 50, 78, 100, 125, 150, 182, 208, 225, 242, 266, 290, 314, 364, 390, 386, 442, 468, 475, 520, 546 };
        assertEquals(1092, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case48() {
        int[] scores = { 0, 62, 93, 148, 185, 186, 0, 248, 0, 0, 407, 444, 0, 0, 0, 0, 0, 0, 589, 0, 651 };
        assertEquals(1240, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case49() {
        int[] scores = { 38, 0, 114, 152, 190, 0, 266, 304, 0, 380, 418, 456, 494, 532, 570, 608, 646, 0, 722, 760, 0, 836, 0, 912, 950, 0, 0, 1064, 1102, 1140, 0, 0, 1254, 1292, 1330, 1368, 1406, 1444, 1482, 0, 0, 1596, 1634, 1672, 0, 1748 };
        assertEquals(3496, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case50() {
        int[] scores = { 24, 48, 72, 96, 120, 144, 168, 192, 216, 240, 264, 288, 312, 336, 360, 384, 408, 432, 456, 480, 504, 528, 552, 576, 600, 624, 648, 672, 696, 720, 744, 768, 792, 816, 840, 864, 888, 912, 936, 960, 984, 1008, 1032, 1056, 1080, 1104 };
        assertEquals(2208, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case51() {
        int[] scores = { 12, 18, 27, 36, 45, 54, 63, 54, 81, 90, 99, 108, 117, 126, 180, 192, 153, 162, 171, 180, 132, 198, 207, 216, 156, 234, 168, 252, 261, 270, 279, 384, 396, 408, 315, 324, 333, 234, 351, 360, 492, 504, 387, 528, 405, 414 };
        assertEquals(1104, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case52() {
        int[] scores = { 43, 86, 129, 172, 215, 258, 301, 344, 387, 430, 473, 516, 559, 602, 645, 688, 731, 774, 817, 860, 903, 946, 989, 1032, 1075, 1118, 1161, 1204, 1247, 1290, 1333, 1376, 1419, 1462, 1505, 1548, 1591, 1634, 1677, 1720, 1724, 1806, 1849, 1892, 1935, 1978 };
        assertEquals(3956, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case53() {
        int[] scores = { 0, 0, 137, 0, 0, 206, 0, 252, 0, 910, 0, 0, 0, 0, 1365, 1456, 459, 0, 1729, 0, 1911, 0, 0, 0, 0, 0, 0, 0, 0, 758, 0, 0, 827, 0, 0, 3276, 0, 3458, 0, 3640, 0, 1034, 0, 0, 0, 0 };
        assertEquals(4550, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case54() {
        int[] scores = { 21, 0, 63, 0, 105, 126, 147, 0, 189, 210, 0, 0, 0, 0, 0, 0, 357, 0, 399, 0, 0, 0, 0, 504, 525, 0, 0, 588, 0, 630, 651, 0, 0, 714, 735, 756, 0, 0, 0, 0, 861, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(2058, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case55() {
        int[] scores = { 161, 322, 483, 644, 805, 966, 1127, 1288, 1449, 1610, 1771, 1932, 2093, 2254, 2415, 2576, 2737, 2898, 3059, 3220, 3381, 3542, 3703, 3864, 4025, 4186, 4347, 4508, 4669, 4830, 4991, 5152, 5313, 5474, 5635, 5796, 5957, 6118, 6279, 6440, 6601, 6762, 6923, 7084, 7245, 7406, 7567, 7728, 7889 };
        assertEquals(15778, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case56() {
        int[] scores = { 157, 162, 243, 628, 177, 942, 567, 192, 729, 1570, 1727, 212, 1053, 222, 227, 232, 2669, 2826, 2983, 1620, 1701, 3454, 1863, 1944, 3925, 282, 2187, 2268, 297, 302, 307, 312, 317, 322, 5495, 2916, 337, 5966, 3159, 3240, 357, 3402, 367, 6908, 7065, 3726, 387, 3888, 3969 };
        assertEquals(15386, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case57() {
        int[] scores = { 42, 84, 126, 166, 210, 248, 289, 336, 378, 420, 462, 504, 559, 588, 630, 672, 699, 774, 798, 840, 863, 924, 945, 1008, 1027, 1092, 1161, 1204, 1247, 1232, 1302, 1344, 1355, 1428, 1470, 1512, 1554, 1634, 1638, 1642, 1722, 1764, 1806, 1848, 1890, 1932, 2021, 1970, 2058 };
        assertEquals(4168, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case58() {
        int[] scores = { 34, 0, 102, 116, 170, 204, 238, 272, 306, 340, 374, 408, 572, 356, 660, 544, 578, 0, 476, 880, 714, 748, 782, 816, 850, 644, 1188, 1232, 0, 1020, 1054, 1408, 1452, 836, 1190, 0, 1258, 932, 1326, 0, 0, 1428, 1462, 1496, 1530, 1564, 1598, 0, 1666 };
        assertEquals(3852, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case59() {
        int[] scores = { 0, 0, 0, 0, 0, 0, 336, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1104, 0, 1200, 0, 0, 0, 0, 0, 0, 1536, 1584, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2160, 0, 0, 0, 0, 0 };
        assertEquals(2688, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case60() {
        int[] scores = { 34, 68, 102, 136, 170, 204, 238, 272, 306, 340, 374, 408, 442, 476, 510, 544, 578, 612, 646, 680, 714, 748, 782, 816, 850, 884, 918, 952, 986, 1020, 1054, 1088, 1122, 1156, 1190, 1224, 1258, 1292, 1326, 1360, 1394, 1428, 1462, 1496, 1530, 1564, 1598, 1632, 1666, 1700 };
        assertEquals(3400, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case61() {
        int[] scores = { 149, 100, 150, 596, 250, 894, 0, 400, 450, 1490, 0, 1788, 650, 2086, 2235, 2384, 0, 900, 2831, 0, 3129, 3278, 0, 3576, 3725, 0, 4023, 0, 4321, 0, 0, 1600, 0, 1700, 0, 0, 1850, 0, 1950, 0, 2050, 0, 6407, 2200, 0, 2300, 0, 2400, 2450, 7450 };
        assertEquals(14900, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case62() {
        int[] scores = { 93, 184, 275, 366, 465, 558, 651, 744, 837, 930, 1023, 1104, 1185, 1302, 1395, 1488, 1581, 1674, 1731, 1860, 1953, 2004, 2095, 2232, 2277, 2392, 2459, 2604, 2697, 2732, 2823, 2976, 3069, 3096, 3220, 3348, 3441, 3534, 3551, 3642, 3813, 3824, 3999, 4006, 4185, 4278, 4279, 4464, 4557, 4650 };
        assertEquals(9300, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case63() {
        int[] scores = { 0, 0, 0, 164, 0, 0, 0, 152, 17, 0, 0, 0, 247, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 665, 684, 0, 0, 1599, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(2624, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case64() {
        int[] scores = { 0, 66, 99, 132, 0, 198, 0, 264, 0, 0, 363, 396, 0, 462, 0, 528, 561, 0, 627, 0, 693, 0, 759, 792, 825, 858, 891, 924, 0, 0, 1023, 0, 1089, 1122, 1155, 1188, 1221, 0, 0, 1320, 0, 1386, 0, 1452, 1485, 1518, 1551, 1584, 0, 1650 };
        assertEquals(3234, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case65() {
        int[] scores = { 38, 76, 114, 152, 190, 228, 266, 304, 342, 380, 418, 456, 494, 532, 570, 608, 646, 684, 722, 760, 798, 836, 874, 912, 950, 988, 1026, 1064, 1102, 1140, 1178, 1216, 1254, 1292, 1330, 1368, 1406, 1444, 1482, 1520, 1558, 1596, 1634, 1672, 1710, 1748, 1786, 1824, 1862, 1900 };
        assertEquals(3800, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case66() {
        int[] scores = { 39, 78, 117, 156, 195, 234, 273, 312, 351, 390, 429, 468, 507, 1862, 585, 0, 663, 702, 741, 780, 819, 858, 897, 936, 975, 1014, 1053, 1092, 1131, 1170, 1209, 1248, 1287, 1326, 1365, 1404, 1443, 1482, 1521, 1560, 1599, 1638, 1677, 1716, 1755, 1794, 1833, 1872, 1911, 1950 };
        assertEquals(7848, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case67() {
        int[] scores = { 63, 124, 189, 248, 307, 372, 441, 504, 551, 612, 682, 756, 795, 856, 917, 992, 1039, 1116, 1197, 1260, 1323, 1386, 1449, 1466, 1550, 1588, 1701, 1710, 1771, 1860, 1893, 2016, 2015, 2142, 2205, 2198, 2259, 2356, 2381, 2520, 2542, 2604, 2709, 2686, 2835, 2852, 2869, 2976, 2991, 3150 };
        assertEquals(6300, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case68() {
        int[] scores = { 0, 24, 0, 0, 180, 0, 0, 0, 0, 0, 0, 432, 0, 504, 540, 0, 0, 0, 0, 0, 0, 0, 0, 288, 300, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 432, 0, 1368, 0, 0, 492, 0, 0, 0, 0, 0, 0, 0, 1764, 0 };
        assertEquals(2184, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case69() {
        int[] scores = { 0 };
        assertEquals(0, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case70() {
        int[] scores = { 1 };
        assertEquals(2, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case71() {
        int[] scores = { 10000 };
        assertEquals(20000, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case72() {
        int[] scores = { 0, 0 };
        assertEquals(0, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case73() {
        int[] scores = { 0, 1 };
        assertEquals(1, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case74() {
        int[] scores = { 1, 0 };
        assertEquals(2, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case75() {
        int[] scores = { 1, 1 };
        assertEquals(3, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case76() {
        int[] scores = { 1, 2 };
        assertEquals(4, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case77() {
        int[] scores = { 2, 1 };
        assertEquals(5, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case78() {
        int[] scores = { 1, 3 };
        assertEquals(5, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case79() {
        int[] scores = { 3, 1 };
        assertEquals(7, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case80() {
        int[] scores = { 0, 10000 };
        assertEquals(10000, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case81() {
        int[] scores = { 10000, 0 };
        assertEquals(20000, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case82() {
        int[] scores = { 10000, 10000 };
        assertEquals(30000, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case83() {
        int[] scores = { 10000, 9999 };
        assertEquals(29999, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case84() {
        int[] scores = { 9999, 10000 };
        assertEquals(29998, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case85() {
        int[] scores = { 5000, 10000 };
        assertEquals(20000, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case86() {
        int[] scores = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(0, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case87() {
        int[] scores = { 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000 };
        assertEquals(510000, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case88() {
        int[] scores = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(51, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case89() {
        int[] scores = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49 };
        assertEquals(49, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case90() {
        int[] scores = { 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        assertEquals(2501, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case91() {
        int[] scores = { 10000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(500000, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case92() {
        int[] scores = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10000 };
        assertEquals(10000, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case93() {
        int[] scores = { 0, 10000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(490000, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case94() {
        int[] scores = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(10000, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case95() {
        int[] scores = { 0, 0, 0, 0, 0, 0, 10000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(80000, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case96() {
        int[] scores = { 200, 200, 600, 800, 1000, 200, 200, 1600, 1800, 2000, 200, 200, 2600, 2800, 200, 3200, 3400, 3600, 3800, 4000, 4200, 200, 200, 4800, 5000, 5200, 200, 5600, 200, 6000, 6200, 6400, 200, 200, 200, 7200, 200, 7600, 200, 8000, 200, 200, 8600, 200, 200, 9200, 9400, 9600, 9800, 10000 };
        assertEquals(20000, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case97() {
        int[] scores = { 101, 202, 303, 404, 505, 596, 707, 808, 893, 992, 1091, 1190, 1289, 1414, 1487, 1616, 1685, 1784, 1883, 2020, 2081, 2222, 2279, 2378, 2525, 2626, 2675, 2828, 2929, 3030, 3131, 3170, 3333, 3368, 3467, 3566, 3737, 3838, 3939, 4040, 4141, 4160, 4343, 4444, 4545, 4556, 4747, 4848, 4949, 5050 };
        assertEquals(10100, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case98() {
        int[] scores = { 200, 400, 0, 800, 0, 0, 0, 1600, 0, 0, 0, 0, 0, 0, 0, 3200, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(12000, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case99() {
        int[] scores = { 201, 400, 3, 804, 5, 6, 0, 1608, 0, 0, 0, 12, 13, 0, 0, 3200, 0, 0, 0, 20, 0, 0, 23, 0, 0, 26, 0, 0, 29, 30 };
        assertEquals(12060, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case100() {
        int[] scores = { 0, 400, 0, 0, 0, 0, 0, 1600, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(11600, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case101() {
        int[] scores = { 1, 3, 9, 27, 81, 243, 729, 2187, 6561 };
        assertEquals(6570, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case102() {
        int[] scores = { 1, 3, 9, 27, 101, 267, 729, 2187, 6561 };
        assertEquals(6570, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case103() {
        int[] scores = { 1, 0, 9, 0, 81, 0, 0, 2187, 6561 };
        assertEquals(6570, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case104() {
        int[] scores = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192 };
        assertEquals(8206, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case105() {
        int[] scores = { 7, 2, 4, 8, 16, 68, 34, 128, 310, 572, 1090, 2120, 4174, 8192 };
        assertEquals(8290, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case106() {
        int[] scores = { 0, 2, 4, 0, 16, 0, 0, 128, 256, 0, 0, 0, 4096, 8192 };
        assertEquals(8192, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case107() {
        int[] scores = { 1, 10, 100, 1000, 10000 };
        assertEquals(10005, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case108() {
        int[] scores = { 8, 24, 100, 1000, 10000 };
        assertEquals(10040, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case109() {
        int[] scores = { 0, 10, 100, 1000, 0 };
        assertEquals(1010, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case110() {
        int[] scores = { 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765 };
        assertEquals(6784, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case111() {
        int[] scores = { 1, 2, 3, 13, 18, 13, 21, 22, 41, 109, 126, 213, 355, 586, 1017, 1597, 2618, 4181, 6803 };
        assertEquals(6822, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case112() {
        int[] scores = { 1, 2, 3, 0, 8, 13, 0, 34, 55, 0, 0, 233, 0, 610, 0, 1597, 2584, 4181, 6765 };
        assertEquals(6784, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case113() {
        int[] scores = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765 };
        assertEquals(6765, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case114() {
        int[] scores = { 0, 13, 1, 2, 3, 5, 8, 13, 75, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4301, 6765 };
        assertEquals(6765, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case115() {
        int[] scores = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 0, 377, 610, 987, 1597, 2584, 4181, 0 };
        assertEquals(4182, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case116() {
        int[] scores = { 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765 };
        assertEquals(6785, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case117() {
        int[] scores = { 5, 9, 0, 0, 0, 0, 41, 53, 6, 95, 89, 192, 189, 433, 558, 1051, 1665, 2520, 4257, 6693 };
        assertEquals(6793, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case118() {
        int[] scores = { 1, 1, 2, 0, 5, 8, 13, 21, 0, 0, 0, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765 };
        assertEquals(6785, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case119() {
        int[] scores = { 9, 240, 350, 400, 578, 629, 596, 784, 577, 1112, 1077, 1058, 1344, 1686, 1098, 1755, 1667, 1680, 1925, 1760, 2229, 1923, 2276, 2603, 2509, 2993, 2758, 2590, 2489, 2778, 3169, 3275, 3733, 3711, 3239, 3448, 4454, 4321, 3818, 3748, 3997, 4159, 4585, 4892, 4350, 4445, 4604, 4477, 4438, 5123 };
        assertEquals(11778, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case120() {
        int[] scores = { 9, 240, 350, 400, 578, 689, 596, 784, 577, 1112, 1077, 1058, 1344, 1686, 1248, 1755, 1667, 1680, 1925, 1760, 2229, 1923, 2276, 2603, 2759, 2993, 2758, 2590, 2489, 2778, 3169, 2975, 3733, 3711, 3239, 3448, 4454, 4321, 4208, 3748, 3997, 4159, 4585, 4892, 4350, 4445, 5074, 4477, 4438, 5123 };
        assertEquals(11778, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case121() {
        int[] scores = { 9, 240, 0, 400, 578, 629, 596, 784, 577, 1112, 1077, 1058, 1344, 1686, 1098, 1755, 1667, 0, 1925, 1760, 2229, 1923, 2276, 2603, 0, 2993, 0, 0, 2489, 2778, 3169, 3275, 3733, 3711, 3239, 3448, 4454, 4321, 3818, 3748, 3997, 4159, 4585, 4892, 4350, 4445, 4604, 4477, 4438, 0 };
        assertEquals(11778, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case122() {
        int[] scores = { 70, 175, 335, 499, 295, 482, 913, 619, 375, 1005, 1126, 914, 1769, 1415, 1130, 1573, 1982, 1881, 1940, 1630, 1835, 2117, 1655, 2884, 2286, 3161, 2563, 3089, 2894, 3562, 3097, 2960, 2914, 3605, 3447, 3838, 3610, 3664, 3556, 3774, 4405, 4546, 4231, 4542, 4193, 4797, 4872, 4150, 5463, 4411 };
        assertEquals(10539, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case123() {
        int[] scores = { 80, 195, 365, 479, 345, 542, 863, 699, 305, 1105, 1236, 814, 1659, 1555, 1280, 1733, 1832, 1721, 1770, 1830, 2045, 2337, 1445, 2664, 2536, 2921, 2833, 2829, 2624, 3862, 2807, 2660, 2604, 3285, 3797, 4198, 3260, 3304, 3946, 3774, 4815, 4146, 4661, 4542, 4193, 5257, 5342, 4150, 5953, 4911 };
        assertEquals(11035, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case124() {
        int[] scores = { 70, 175, 0, 0, 0, 0, 913, 0, 0, 0, 0, 914, 0, 0, 1130, 0, 0, 0, 0, 0, 0, 0, 1655, 0, 2286, 3161, 2563, 0, 0, 0, 0, 0, 0, 0, 0, 3838, 0, 0, 0, 0, 0, 4546, 4231, 4542, 4193, 0, 0, 0, 0, 0 };
        assertEquals(10419, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case125() {
        int[] scores = { 103, 195, 201, 439, 468, 857, 845, 1120, 757, 985, 1091, 1487, 1215, 1437, 1716, 1589, 1510, 1988, 1796, 2272, 2199, 2170, 2230, 2533, 3058, 2757, 2755, 2922, 3525, 2230, 2555, 3116, 3136, 3691, 3406, 3476, 3753, 3759, 4018, 3744, 3827, 4385, 4104, 4916, 4736, 4655, 4652, 5094, 4916, 5042 };
        assertEquals(12565, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case126() {
        int[] scores = { 112, 195, 201, 439, 468, 857, 845, 1192, 757, 913, 1091, 1487, 1116, 1437, 1716, 1589, 1510, 1988, 1796, 2272, 2199, 2170, 2041, 2533, 3058, 2757, 2755, 2922, 3525, 2500, 2555, 3404, 3136, 3691, 3406, 3800, 3753, 3435, 4018, 3744, 3827, 4385, 4104, 5312, 4349, 4655, 4652, 5094, 4916, 5042 };
        assertEquals(13272, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case127() {
        int[] scores = { 0, 0, 0, 439, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2199, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4652, 0, 0, 5042 };
        assertEquals(7024, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case128() {
        int[] scores = { 163, 357, 420, 220, 754, 496, 783, 710, 1118, 828, 829, 1283, 1341, 1233, 1536, 1302, 1851, 1684, 1514, 1778, 1732, 2213, 1471, 2950, 2080, 3029, 2036, 3244, 3273, 2882, 3704, 3052, 3420, 3892, 4047, 3580, 3492, 3470, 3050, 4291, 3908, 3970, 3774, 4111, 4357, 4894, 4795, 4513, 5171, 4867 };
        assertEquals(17819, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case129() {
        int[] scores = { 172, 375, 420, 202, 727, 550, 783, 710, 1118, 918, 748, 1193, 1341, 1125, 1536, 1302, 1716, 1846, 1685, 1616, 1732, 2411, 1282, 2752, 2080, 3263, 2279, 3244, 3534, 3152, 3443, 2782, 3420, 3604, 4362, 3580, 3177, 3812, 2717, 4651, 3557, 4348, 3405, 3733, 3970, 4498, 4390, 4945, 5612, 4435 };
        assertEquals(18719, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case130() {
        int[] scores = { 163, 0, 420, 0, 0, 496, 0, 0, 1118, 828, 0, 0, 0, 1233, 0, 0, 0, 0, 0, 1778, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3704, 0, 3420, 0, 0, 3580, 0, 3470, 3050, 0, 0, 0, 0, 4111, 0, 0, 0, 0, 0, 4867 };
        assertEquals(14318, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case131() {
        int[] scores = { 183, 299, 435, 327, 278, 360, 702, 1004, 859, 706, 1045, 1239, 937, 1295, 1203, 1249, 1496, 1738, 1717, 2080, 1977, 1980, 2088, 2389, 2812, 2594, 2770, 2748, 3076, 3437, 2736, 3343, 2740, 3371, 3528, 3316, 3759, 4099, 3558, 3642, 3682, 4462, 4747, 4604, 4310, 4534, 4794, 4802, 4777, 5685 };
        assertEquals(15497, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case132() {
        int[] scores = { 183, 315, 459, 327, 278, 360, 758, 1068, 803, 786, 973, 1335, 849, 1295, 1203, 1249, 1632, 1610, 1869, 2240, 2145, 1980, 1920, 2389, 2812, 2594, 2770, 2748, 3076, 3213, 2736, 3599, 3004, 3643, 3528, 3316, 3759, 4403, 3262, 3642, 3682, 4462, 4419, 4604, 4310, 4534, 4794, 5186, 4777, 5685 };
        assertEquals(16089, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case133() {
        int[] scores = { 183, 299, 0, 0, 278, 0, 702, 0, 859, 706, 0, 1239, 937, 1295, 0, 0, 1496, 1738, 0, 0, 0, 0, 2088, 0, 0, 0, 2770, 2748, 0, 0, 2736, 0, 0, 0, 3528, 0, 3759, 4099, 3558, 3642, 3682, 0, 4747, 0, 0, 4534, 0, 0, 4777, 0 };
        assertEquals(15017, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case134() {
        int[] scores = { 200, 400, 600, 800, 1000, 1200, 1400, 1600, 1800, 0, 2200, 2400, 2600, 2800, 3000, 3200, 3400, 3600, 3800, 4000, 4200, 4400, 4600, 4800, 5000, 5200, 5400, 5600, 5800, 6000, 6200, 6400, 6600, 6800, 7000, 7200, 7400, 7600, 7800, 8000, 8200, 8400, 8600, 8800, 9000, 9200, 9400, 9600, 9800, 10000 };
        assertEquals(20000, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case135() {
        int[] scores = { 200, 400, 0, 800, 1000, 1200, 1400, 1600, 1800, 2000, 2200, 2400, 2600, 2800, 3000, 3200, 3400, 3600, 3800, 4000, 4200, 4400, 4600, 4800, 5000, 5200, 5400, 5600, 5800, 6000, 6200, 6400, 6600, 6800, 7000, 7200, 7400, 7600, 0, 8000, 8200, 8400, 8600, 8800, 9000, 9200, 9400, 9600, 9800, 10000 };
        assertEquals(20000, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case136() {
        int[] scores = { 200, 400, 600, 0, 1000, 1200, 1400, 1600, 0, 2000, 2200, 2400, 0, 2800, 3000, 3200, 0, 3600, 3800, 0, 4200, 4400, 4600, 4800, 5000, 5200, 5400, 5600, 5800, 6000, 6200, 6400, 6600, 6800, 7000, 7200, 7400, 7600, 7800, 8000, 8200, 8400, 8600, 8800, 9000, 9200, 0, 9600, 9800, 0 };
        assertEquals(20000, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case137() {
        int[] scores = { 0, 400, 600, 800, 1000, 0, 1400, 0, 0, 2000, 2200, 2400, 2600, 0, 0, 3200, 3400, 0, 3800, 0, 0, 0, 0, 4800, 0, 5200, 0, 0, 5800, 0, 0, 0, 0, 0, 0, 7200, 0, 7600, 0, 8000, 8200, 0, 8600, 8800, 9000, 0, 9400, 0, 9800, 10000 };
        assertEquals(19600, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case138() {
        int[] scores = { 0, 0, 0, 0, 1000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3200, 0, 0, 3800, 0, 4200, 0, 0, 0, 5000, 5200, 0, 0, 5800, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8600, 8800, 0, 0, 9400, 0, 0, 0 };
        assertEquals(12000, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case139() {
        int[] scores = { 0, 400, 600, 0, 0, 0, 0, 1600, 0, 0, 0, 0, 0, 0, 0, 0, 3400, 0, 0, 0, 0, 0, 4600, 0, 5000, 0, 0, 0, 0, 0, 0, 0, 0, 6800, 0, 0, 0, 0, 0, 8000, 0, 8400, 0, 0, 9000, 0, 0, 0, 0, 0 };
        assertEquals(19600, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case140() {
        int[] scores = { 0, 0, 0, 0, 0, 1200, 0, 0, 0, 0, 0, 0, 0, 2800, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5200, 0, 5600, 0, 6000, 0, 0, 6600, 6800, 0, 7200, 0, 0, 0, 0, 0, 0, 0, 8800, 0, 0, 0, 0, 9800, 0 };
        assertEquals(11200, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case141() {
        int[] scores = { 0, 0, 0, 0, 0, 1200, 1400, 0, 0, 0, 0, 0, 0, 0, 0, 3200, 0, 0, 3800, 0, 0, 0, 4600, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7000, 0, 0, 7600, 7800, 0, 0, 8400, 0, 0, 0, 9200, 0, 0, 0, 0 };
        assertEquals(11600, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case142() {
        int[] scores = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 2000, 0, 0, 0, 0, 0, 3200, 0, 3600, 3800, 4000, 0, 0, 0, 4800, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7800, 0, 0, 0, 8600, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(10400, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case143() {
        int[] scores = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2400, 0, 0, 0, 3200, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5400, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(10400, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case144() {
        int[] scores = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2400, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7400, 0, 7800, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(10200, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case145() {
        int[] scores = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7800, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(7800, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case146() {
        int[] scores = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5001, 10000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(15001, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case147() {
        int[] scores = { 2, 7, 6, 3, 9, 7, 7, 7, 7, 8, 8, 2, 7, 9, 3, 2, 8, 1, 2, 1, 5, 4, 1, 2, 5001, 10000, 6, 6, 1, 1, 2, 9, 9, 1, 3, 5, 5, 4, 10, 7, 10, 10, 1, 7, 1, 1, 4, 5, 4, 5 };
        assertEquals(15099, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case148() {
        int[] scores = { 201, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(10050, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case149() {
        int[] scores = { 200, 400, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(20000, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case150() {
        int[] scores = { 200, 402, 603, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(20098, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case151() {
        int[] scores = { 201, 402, 603, 798, 1005, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(20100, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case152() {
        int[] scores = { 201, 402, 603, 798, 997, 1196, 1395, 1608, 1793, 2000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(20100, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case153() {
        int[] scores = { 201, 402, 603, 798, 997, 1200, 1407, 1608, 1793, 2000, 2200, 2390, 2613, 2800, 2987, 3186, 3400, 3600, 3783, 3982, 4221, 4400, 4600, 4800, 5000, 5226, 5427, 5574, 5800, 6030, 6171, 6400, 6600, 6834, 6967, 7200, 7365, 7638, 7763, 8000, 8241, 8442, 8559, 8800, 9000, 9156, 9355, 9554, 9849, 10000 };
        assertEquals(20100, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case154() {
        int[] scores = { 0, 402, 600, 800, 997, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(19698, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case155() {
        int[] scores = { 0, 0, 599, 800, 1000, 1200, 1400, 1608, 1793, 2000, 2191, 2412, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(14577, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case156() {
        int[] scores = { 0, 0, 0, 804, 1000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(13060, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case157() {
        int[] scores = { 0, 0, 0, 0, 997, 1206, 1400, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(12173, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case158() {
        int[] scores = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1992, 2200, 2412, 2589, 2788, 2987, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(10800, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case159() {
        int[] scores = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4778, 5025, 5200, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(10225, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case160() {
        int[] scores = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5025, 5226, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(10251, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case161() {
        int[] scores = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5200, 5427, 5628, 5800, 6000, 6200, 6370, 6633, 6834, 6967, 7166, 7365, 7638, 7763, 8000, 8161, 8360, 8600, 8758, 9000, 9156, 9447, 9600, 9849, 10000 };
        assertEquals(10000, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case162() {
        int[] scores = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7962, 8161, 8360, 8559, 8844, 9045, 9200, 9447, 9648, 9753, 9952 };
        assertEquals(9952, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case163() {
        int[] scores = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9600, 9849, 10000 };
        assertEquals(10000, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case164() {
        int[] scores = { 10000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(500000, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case165() {
        int[] scores = { 5001, 10000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(500002, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case166() {
        int[] scores = { 3334, 6666, 9998, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(333302, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case167() {
        int[] scores = { 2001, 4000, 5999, 7998, 9997, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(200002, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case168() {
        int[] scores = { 1001, 2000, 2999, 4004, 4997, 5996, 7000, 8000, 8993, 10000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(100098, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case169() {
        int[] scores = { 200, 400, 603, 804, 1000, 1200, 1400, 1600, 1809, 2000, 2211, 2400, 2589, 2788, 3000, 3200, 3385, 3584, 3783, 3982, 4181, 4422, 4579, 4824, 5000, 5226, 5427, 5600, 5773, 5972, 6200, 6432, 6600, 6768, 7035, 7166, 7365, 7600, 7763, 7962, 8241, 8360, 8600, 8844, 9045, 9200, 9447, 9600, 9849, 9952 };
        assertEquals(20073, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case170() {
        int[] scores = { 0, 4000, 5999, 8004, 9997, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(196000, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case171() {
        int[] scores = { 0, 0, 2499, 3336, 4165, 4994, 5826, 6658, 7497, 8330, 9163, 10000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(60813, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case172() {
        int[] scores = { 0, 0, 0, 7998, 10000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(129970, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case173() {
        int[] scores = { 0, 0, 0, 0, 7145, 8574, 9991, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(87169, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case174() {
        int[] scores = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 6652, 7337, 8004, 8658, 9338, 9977, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(36000, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case175() {
        int[] scores = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9240, 9625, 9960, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(19585, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case176() {
        int[] scores = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9577, 9984, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(19561, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case177() {
        int[] scores = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5176, 5427, 5574, 5773, 5972, 6200, 6432, 6633, 6834, 6967, 7166, 7365, 7600, 7763, 8000, 8241, 8442, 8643, 8844, 9045, 9200, 9355, 9554, 9753, 10000 };
        assertEquals(10000, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case178() {
        int[] scores = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8000, 8200, 8400, 8643, 8758, 8957, 9246, 9447, 9648, 9753, 9952 };
        assertEquals(9952, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case179() {
        int[] scores = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9648, 9849, 9952 };
        assertEquals(9952, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case180() {
        int[] scores = { 0, 2000, 2599, 10000, 9997, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(162000, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case181() {
        int[] scores = { 123, 43, 534, 124 };
        assertEquals(946, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case182() {
        int[] scores = { 8110, 692, 3168, 3829, 38, 6486, 8683, 9089, 9496, 2589, 5988, 5144, 9352, 9313, 8650, 6738, 2042, 1257, 335, 8759, 1191, 7605, 5262, 2180, 8501, 3829, 3773, 606, 9290, 5997, 7548, 9554, 5559, 1624, 6467, 9539, 6127, 1237, 7811, 9172, 599, 6077, 213, 8683, 8213, 3990, 5822, 5601, 3390, 5758 };
        assertEquals(420562, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case183() {
        int[] scores = { 3, 2, 5, 3, 7, 3, 2, 5, 3, 7, 3, 2, 5, 3, 7, 3, 2, 5, 3, 7, 3, 2, 5, 3, 7, 3, 2, 5, 3, 7, 3, 2, 5, 3, 7, 3, 2, 5, 3, 7, 3, 2, 5, 3, 7, 3, 2, 5, 3, 7 };
        assertEquals(200, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case184() {
        int[] scores = { 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(22, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case185() {
        int[] scores = { 128, 7989, 3833, 9790, 2728, 9714, 8155, 2716, 9065, 6963, 9905, 2190, 3060, 2525, 2545, 9146, 2696, 2545, 6044, 1705, 6698, 8322, 2008, 8685, 4750, 6940, 8395, 9264, 8294, 4859, 4900, 2558, 933, 9742, 1040, 7081, 9744, 9694, 5089, 4157, 1350, 5822, 3531, 1253, 9586, 3550, 7527, 851, 4697, 508 };
        assertEquals(391717, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case186() {
        int[] scores = { 1, 3, 2, 5, 3, 7, 5 };
        assertEquals(20, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case187() {
        int[] scores = { 857, 775, 674, 132, 31, 755, 853, 560, 465, 878, 968, 268, 648, 494, 578, 598, 925, 939, 647, 544, 768, 270, 116, 883, 277, 284, 306, 246, 835, 686, 459, 303, 694, 562, 585, 522, 346, 833, 688, 188, 799, 525, 628, 293, 783, 871, 552, 43, 159, 0 };
        assertEquals(44172, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case188() {
        int[] scores = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1 };
        assertEquals(100, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case189() {
        int[] scores = { 1 };
        assertEquals(2, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case190() {
        int[] scores = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(0, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case191() {
        int[] scores = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(49, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case192() {
        int[] scores = { 15 };
        assertEquals(30, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case193() {
        int[] scores = { 2 };
        assertEquals(4, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case194() {
        int[] scores = { 5, 8, 15, 16, 94, 36, 87, 93, 50, 22, 63, 28, 91, 60, 64, 27, 41, 27, 73, 37, 12, 69, 68, 30, 83, 31, 63, 24, 68, 36, 30, 3, 23, 59, 70, 68, 94, 57, 12, 43, 30, 74, 22, 20, 85, 38, 99, 25, 16, 71 };
        assertEquals(1326, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case195() {
        int[] scores = { 1500, 1555, 1005, 1006, 1955, 1959, 1923, 1699, 1770, 1990, 2000, 1022, 234, 5, 6, 6, 1342, 1666, 1523, 12, 59, 100, 201, 1002, 1003, 1005, 1008, 999, 2000, 1500, 1555, 1005, 1006, 1955, 1959, 1923, 1699, 1770, 1990, 2000, 1022, 234, 5, 6, 6, 1342, 1666, 1523, 12 };
        assertEquals(80460, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case196() {
        int[] scores = { 9, 6, 5, 1, 0, 9, 9, 6, 8, 3, 4, 8, 4, 9, 9, 2, 5, 5, 3, 3, 3, 7, 4, 3, 8, 0, 8, 8, 0, 6, 8, 1, 9, 8, 9, 7, 2, 2, 8, 2, 8, 9, 0, 7, 8, 1, 5, 8, 6, 1 };
        assertEquals(459, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case197() {
        int[] scores = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(51, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case198() {
        int[] scores = { 0, 0, 10000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(80000, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case199() {
        int[] scores = { 1, 2, 3, 4, 5, 6, 7, 7, 4, 7, 3, 2, 7, 4, 8, 3, 3, 6, 4, 6, 8, 9, 4, 3, 0, 3, 1, 3, 5, 3, 4, 5, 7, 8, 5, 4, 6, 4, 5, 6, 8, 4, 4, 4, 4, 4, 6, 7, 8, 9 };
        assertEquals(100, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case200() {
        int[] scores = { 7325, 8438, 9414, 515, 1774, 8104, 8527, 3125, 8751, 4622, 7759, 486, 7138, 5362, 5431, 7896, 7023, 5939, 3126, 8363, 9434, 8085, 6488, 3711, 310, 3538, 3217, 2312, 5115, 25, 4787, 5479, 2219, 1599, 5817, 6156, 9285, 9544, 6998, 92, 5749, 942, 1929, 7478, 8405, 1549, 5228, 9435, 4864, 1079 };
        assertEquals(428112, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case201() {
        int[] scores = { 1, 5, 0, 10000 };
        assertEquals(10004, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case202() {
        int[] scores = { 1, 2, 45, 36, 754, 24, 326, 43, 62, 57, 65, 56, 45, 36, 754, 24, 326, 43, 62, 57, 65, 56, 45, 36, 754, 24, 326, 43, 62, 57, 65, 56, 45, 36, 754, 24, 326, 43, 62, 57, 65, 56, 45, 36, 754, 24, 326, 43, 62, 57 };
        assertEquals(9088, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case203() {
        int[] scores = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
        assertEquals(59, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case204() {
        int[] scores = { 0, 0, 5, 0, 0, 0, 0, 0 };
        assertEquals(15, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case205() {
        int[] scores = { 0, 0, 0, 0, 5, 5, 5, 5, 0, 0, 0, 0 };
        assertEquals(10, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case206() {
        int[] scores = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        assertEquals(100, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case207() {
        int[] scores = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 2, 3, 4, 5, 6, 7, 8, 9, 4, 34, 34, 5, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 3, 4, 5, 6, 7, 8, 9, 4, 23, 4, 5 };
        assertEquals(548, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case208() {
        int[] scores = { 1, 3, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 11 };
        assertEquals(149, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case209() {
        int[] scores = { 666, 666, 666, 1313, 1313, 1313, 666, 666, 666 };
        assertEquals(7954, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case210() {
        int[] scores = { 3 };
        assertEquals(6, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case211() {
        int[] scores = { 0 };
        assertEquals(0, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case212() {
        int[] scores = { 49, 24, 26, 12, 5, 33, 25, 30, 35, 41, 46, 23, 21, 3, 38, 43, 11, 19, 34, 29, 20, 32, 39, 7, 50, 31, 2, 8, 1, 48, 13, 18, 9, 10, 37, 4, 42, 16, 45, 47, 15, 22, 27, 44, 17, 36, 40, 6, 28, 14 };
        assertEquals(2494, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case213() {
        int[] scores = { 45, 5, 53, 35, 35, 4, 23, 53, 756, 453, 345, 5, 345, 345, 345, 345, 45, 345, 534, 5, 5, 435, 345, 534, 45, 54, 354, 345, 345, 345, 345, 354, 345, 345, 345, 3, 3553, 35, 35, 35, 354, 35, 3454, 53, 35, 345, 35, 35, 345, 345 };
        assertEquals(6521, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case214() {
        int[] scores = { 26, 37, 48, 9, 20, 31, 42, 3, 14, 25, 36, 47, 8, 19, 30, 41, 2, 13, 24, 35, 46, 7, 18, 29, 40, 1, 12, 23, 34, 45, 6, 17, 28, 39, 0, 11, 22, 33, 44, 5, 16, 27, 38, 49, 10, 21, 32, 43, 4, 15 };
        assertEquals(1865, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case215() {
        int[] scores = { 1, 3, 2, 5, 3, 7, 5, 2, 0, 6, 6, 10 };
        assertEquals(35, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case216() {
        int[] scores = { 1968, 1150, 1444, 1367, 1608, 1736, 3082, 98, 2014, 2881, 4868, 9721, 7426, 1779, 8237, 9998, 3022, 2790, 5746, 1134, 8399, 8432, 8669, 7416, 6508, 3750, 9480, 8165, 9595, 8892, 4833, 5794, 4992, 2144, 6093, 3878, 397, 5639, 7134, 806, 3446, 7764, 9545, 3651, 8331, 1009, 6406, 638, 5558, 1752 };
        assertEquals(131148, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case217() {
        int[] scores = { 41, 17, 34, 0, 19, 24, 28, 8, 12, 14, 5, 45, 31, 27, 11, 41, 45, 42, 27, 36, 41, 4, 2, 3, 42, 32, 21, 16, 18, 45, 47, 26, 21, 38, 19, 12, 17, 49, 35, 44, 3, 11, 22, 33, 23, 14, 41, 11, 3, 18 };
        assertEquals(2107, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case218() {
        int[] scores = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
        assertEquals(5100, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case219() {
        int[] scores = { 0, 0, 1, 1, 1, 1, 0 };
        assertEquals(3, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case220() {
        int[] scores = { 0, 0, 0, 10000, 0, 0 };
        assertEquals(10000, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case221() {
        int[] scores = { 0, 6, 5, 7, 8, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 1, 8, 0, 0, 0, 0, 1, 1, 2, 0, 1, 0, 1, 0, 0, 0, 0 };
        assertEquals(294, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case222() {
        int[] scores = { 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000 };
        assertEquals(510000, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case223() {
        int[] scores = { 1, 2, 3, 5, 6, 7, 9, 100, 11, 12, 13, 14 };
        assertEquals(117, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case224() {
        int[] scores = { 1, 2, 3, 5, 6, 7, 2, 1, 2, 3, 1, 3, 2, 3, 3, 4, 2, 3, 1, 3, 2, 3, 4, 1, 1, 3, 4, 2, 3, 2, 3, 2, 1, 5, 6, 3, 2, 3, 3, 1, 7, 5, 4, 3, 4, 2, 3, 3, 1, 4 };
        assertEquals(116, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case225() {
        int[] scores = { 0, 2, 0, 4, 2, 0, 0, 0, 1, 0, 0 };
        assertEquals(20, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case226() {
        int[] scores = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 102, 1023, 101 };
        assertEquals(1048, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case227() {
        int[] scores = { 1, 1, 1, 5, 5, 5, 1, 1, 1, 10, 10, 10, 10, 4, 4, 4, 4, 4, 11, 11, 11, 11, 11, 11, 11, 1, 1, 1, 1, 50, 50, 50, 1, 1, 100, 100, 1, 1, 1, 170 };
        assertEquals(210, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case228() {
        int[] scores = { 23, 12, 34, 45, 67, 2, 1, 45 };
        assertEquals(273, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case229() {
        int[] scores = { 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10000 };
        assertEquals(10000, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case230() {
        int[] scores = { 261, 891, 1137, 2512, 7885, 7779, 8386, 3423, 8317, 3467, 4684, 6486, 9144, 240, 3560, 4958, 8836, 653, 137, 1174, 373, 8984, 402, 3358, 5835, 9987, 9909, 6103, 4309, 5101, 7149, 7861, 1385, 6025, 5236, 9111, 5613, 1720, 3099, 6829 };
        assertEquals(81568, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case231() {
        int[] scores = { 0, 0, 1, 0, 0, 0, 0 };
        assertEquals(3, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case232() {
        int[] scores = { 89, 0, 67, 89, 34, 56, 78, 89, 45, 78, 67, 12, 34, 67, 89, 45, 65, 32, 24, 67, 455, 54, 34, 76, 23, 90, 12, 56, 78, 99, 67, 12, 90, 454, 78, 34, 78, 98, 100, 16, 1, 89, 67 };
        assertEquals(4626, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case233() {
        int[] scores = { 14, 29, 45, 33, 26, 37, 48, 15, 154, 22, 27, 28, 71, 79, 137, 159 };
        assertEquals(486, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case234() {
        int[] scores = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49 };
        assertEquals(49, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case235() {
        int[] scores = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 1, 1, 231, 142, 4, 3214, 2314, 4231, 4123, 4231, 2143, 4321, 234, 321, 421, 213, 1, 432, 21, 4, 2, 5, 532, 432, 21, 423, 4, 12, 423, 14, 214, 312, 4231, 4, 4, 4, 0, 0, 0 };
        assertEquals(9691, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case236() {
        int[] scores = { 1, 3, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(149, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case237() {
        int[] scores = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49 };
        assertEquals(98, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case238() {
        int[] scores = { 0, 0, 10, 0, 0, 0, 0 };
        assertEquals(30, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case239() {
        int[] scores = { 1968, 1150, 1444, 1367, 1608, 1736, 3082, 98, 2014, 2881, 4868, 9721, 3426, 1779, 2237, 3998, 9922, 2790, 5746, 1134, 8399, 8432, 8669, 7416, 6508, 3750, 9480, 8165, 9595, 8892, 4833, 5794, 4992, 2144, 6093, 3878, 397, 5639, 7134, 806, 3446, 7764, 9545, 3651, 8331, 1009, 6406, 638, 5558, 1752 };
        assertEquals(131581, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case240() {
        int[] scores = { 1, 1, 5, 1, 14, 1, 1, 1, 3, 1, 1, 1, 8, 1, 1, 9, 1, 1, 2, 1, 1, 1, 6, 1, 1, 8, 1, 19, 1, 15, 17, 1, 1, 1, 1, 1, 10, 18, 1, 16, 1, 1, 1, 1, 11, 1, 1, 1, 1, 1 };
        assertEquals(207, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case241() {
        int[] scores = { 5, 18, 11, 0, 0, 0 };
        assertEquals(100, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case242() {
        int[] scores = { 255 };
        assertEquals(510, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case243() {
        int[] scores = { 1, 3, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(56, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case244() {
        int[] scores = { 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(60, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case245() {
        int[] scores = { 1000, 34, 56, 987, 45, 67, 45, 324, 10000, 10000, 45, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 67, 56, 54, 78, 6, 7, 45, 34, 87, 67, 344, 10000, 10000, 10000, 0, 0, 0, 8 };
        assertEquals(104000, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case246() {
        int[] scores = { 4, 1, 20, 10, 10, 10 };
        assertEquals(57, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case247() {
        int[] scores = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10000 };
        assertEquals(10000, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case248() {
        int[] scores = { 0, 0, 0, 10, 0 };
        assertEquals(10, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case249() {
        int[] scores = { 10 };
        assertEquals(20, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case250() {
        int[] scores = { 4833, 1112, 4639, 9656, 2702, 9930 };
        assertEquals(38928, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case251() {
        int[] scores = { 1, 2, 4, 2, 6, 7, 4, 5, 6, 8, 3, 6, 8, 9, 3, 4, 8, 7, 9, 2, 2, 4, 6, 8, 10, 1, 2, 3, 5, 6, 8, 3, 5, 6, 8, 3, 3, 5, 6, 8, 9, 4, 6, 2, 10, 10, 10, 10, 10, 10 };
        assertEquals(124, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case252() {
        int[] scores = { 1, 3, 9, 1, 3, 4, 0, 6 };
        assertEquals(35, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case253() {
        int[] scores = { 3423, 2321, 123, 123, 213, 324, 3452, 231, 543, 656, 3, 5, 4, 2, 4, 6, 6, 4, 3, 2, 23, 23, 23, 453, 34, 5, 345, 23, 432, 4, 3423, 98, 234, 234, 5654, 213, 343, 442, 546, 231, 4232, 1233, 231, 231, 213, 4324, 324, 213, 213, 23 };
        assertEquals(174066, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case254() {
        int[] scores = { 7, 6, 87, 4650, 234, 458, 765, 48, 995, 154, 654, 897, 321, 82, 654, 60, 564, 321, 654, 321, 654, 56, 564, 21, 654, 684, 684, 321, 654, 321, 654, 231, 81, 564, 5468, 4863, 5684, 3246, 6540, 456, 6, 68, 48, 564, 654, 321, 8591, 564, 7568 };
        assertEquals(74638, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case255() {
        int[] scores = { 0, 0, 1000, 1000, 0, 0, 0 };
        assertEquals(3000, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case256() {
        int[] scores = { 0, 5, 6 };
        assertEquals(10, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case257() {
        int[] scores = { 3302, 4711, 7237, 1877 };
        assertEquals(21854, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case258() {
        int[] scores = { 12, 31, 0, 31, 32, 12, 324 };
        assertEquals(408, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case259() {
        int[] scores = { 1, 2, 3, 4, 5, 6, 5, 1, 1, 3, 5, 45, 23, 3, 4, 45, 6, 5, 2, 3, 4, 52, 33, 4, 4, 35, 6, 5, 43, 5, 4, 23, 4, 523, 4, 5, 32, 3, 2, 43, 33, 3, 2, 44, 4, 23, 53, 2, 3, 3 };
        assertEquals(622, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case260() {
        int[] scores = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
        assertEquals(100, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case261() {
        int[] scores = { 1, 2, 5, 5, 5 };
        assertEquals(14, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case262() {
        int[] scores = { 10000, 1, 2, 5, 1, 3 };
        assertEquals(60003, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case263() {
        int[] scores = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 3, 4, 5, 6, 7, 8, 9, 10, 100, 1000, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 500, 6, 7, 8, 900, 1000 };
        assertEquals(1069, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case264() {
        int[] scores = { 1, 3, 2, 5, 3, 7, 1, 3, 2, 5, 3, 7, 1, 3, 2, 5, 3, 7, 1, 3, 2, 5, 3, 7, 1, 3, 2, 5, 3, 7, 1, 3, 2, 5, 3, 7, 1, 3, 2, 5, 3, 7, 1, 3, 2, 5, 3, 7, 5 };
        assertEquals(146, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case265() {
        int[] scores = { 77, 54, 66, 29, 43, 31, 28, 40, 90, 6, 53, 89, 42, 55, 61, 8, 61, 7, 94, 89, 77, 69, 43, 90, 81, 29, 97, 79, 38, 20, 61, 51, 54, 75, 89, 51, 83, 49, 51, 13, 89, 87, 42, 10, 62, 23, 97, 2, 25, 84 };
        assertEquals(3989, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case266() {
        int[] scores = { 344, 344, 344, 344, 344, 344, 344, 344, 344, 344, 344, 344, 344, 344, 344, 344, 344, 344, 344, 344, 344, 344, 344, 344, 344, 344, 344, 344, 344, 344, 344, 10000, 344, 344, 344, 344, 344, 344, 344, 344, 344, 344, 344, 344, 344, 344, 344, 344, 344, 344 };
        assertEquals(27200, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case267() {
        int[] scores = { 1, 4, 8, 1, 7, 0, 6, 2 };
        assertEquals(33, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case268() {
        int[] scores = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(0, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case269() {
        int[] scores = { 5, 0, 1 };
        assertEquals(16, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case270() {
        int[] scores = { 48, 45, 63, 58, 38, 60, 24, 42, 30, 79, 17, 36, 91, 43, 89, 7, 41, 43, 65, 49, 47, 6, 91, 30, 71, 51, 7, 2, 94, 49, 30, 24, 85, 55, 57, 41, 67, 77, 32, 9, 45, 40, 27, 24, 38, 39, 19, 83, 30, 42 };
        assertEquals(2805, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case271() {
        int[] scores = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 3, 12, 23, 4, 5, 64, 6, 33, 33, 334, 4454, 445, 334, 334, 22, 33, 334, 33, 22, 22, 33, 44, 44, 4, 33, 22, 45, 33, 22, 222, 33, 3, 22, 33, 34, 34, 32, 22, 23, 34 };
        assertEquals(8966, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case272() {
        int[] scores = { 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 };
        assertEquals(13, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case273() {
        int[] scores = { 8077, 666, 474, 7763, 6558, 7315, 8175, 8907, 9505, 9018, 4301, 9056, 360, 5689, 8816, 2010, 1996, 7824, 8659, 1641, 8284, 8621, 7210, 1663, 6954, 1877, 1919, 1074, 9937, 2699, 8398, 1745, 2552, 199, 2170, 7014, 2891, 7283, 1496, 973, 383, 4150, 1809, 2834, 2126, 1045, 6244, 4560, 2170, 6873 };
        assertEquals(420008, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case274() {
        int[] scores = { 10, 20, 10, 0, 1, 20, 100, 1000, 9, 10, 2, 3, 10, 30, 2000, 10, 1212, 2222, 985, 845, 903, 345, 5768, 132, 34, 467, 297, 213, 407, 301, 203, 404, 104, 508, 103, 1211, 555, 333, 897, 999, 1022, 908, 788, 974, 774, 988, 107, 999, 498, 201 };
        assertEquals(12076, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case275() {
        int[] scores = { 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 99, 99, 99, 99, 99, 99, 99, 99, 4, 3, 2, 1, 0, 3, 2, 1, 12, 12, 8, 8, 8, 8, 8, 8, 8, 66 };
        assertEquals(639, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case276() {
        int[] scores = { 41, 8466, 6334, 6498, 9168, 5723, 1477, 9356, 6960, 4462, 5705, 8143, 3279, 6826, 9961, 491, 2995, 1941, 4827, 5436, 2388, 4603, 3902, 153, 292, 2381, 7420, 8715, 9717, 9894, 5447, 1724, 4770, 1537, 1869, 9911, 5665, 6297, 7034, 9894, 8701, 3809, 1319, 330, 7672, 4664, 5140, 7711, 8251, 6868 };
        assertEquals(414916, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case277() {
        int[] scores = { 3, 4, 0, 8, 0, 8, 4, 6 };
        assertEquals(38, p8xgraphbuilder.solve(scores));
    }

    @Test
    public void case278() {
        int[] scores = { 3, 1, 5, 5, 3, 2, 6, 7, 1, 1 };
        assertEquals(41, p8xgraphbuilder.solve(scores));
    }

}
