package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class FoxAndDoraemonTest {
    FoxAndDoraemon foxanddoraemon = new FoxAndDoraemon();

    @Test
    public void case1() {
        int[] workCost = { 1, 2 };
        int splitCost = 1000;
        assertEquals(1002, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case2() {
        int[] workCost = { 3, 6, 9, 12 };
        int splitCost = 1000;
        assertEquals(2012, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case3() {
        int[] workCost = { 1000, 100, 10, 1 };
        int splitCost = 1;
        assertEquals(1001, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case4() {
        int[] workCost = { 1712, 1911, 1703, 1610, 1697, 1612 };
        int splitCost = 100;
        assertEquals(2012, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case5() {
        int[] workCost = { 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000, 3000 };
        int splitCost = 3000;
        assertEquals(15000, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case6() {
        int[] workCost = { 58 };
        int splitCost = 3600;
        assertEquals(58, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case7() {
        int[] workCost = { 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600 };
        int splitCost = 3600;
        assertEquals(25200, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case8() {
        int[] workCost = { 1113, 773, 824, 822, 1458, 1257, 908, 1320, 780, 1016, 1066, 861, 1150, 718, 1405, 738, 718, 980, 1037, 946, 1121, 1349, 805, 1378, 1308, 1272, 1532, 779, 875, 1392, 982, 1282, 744, 723, 1033, 1067, 1158, 1071, 742, 683, 678, 762, 686, 1143, 862, 1231, 765, 1472, 1560, 1085 };
        int splitCost = 3147;
        assertEquals(20040, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case9() {
        int[] workCost = { 3030, 2965, 3048, 2946, 2922, 3064, 2970, 3030, 3069, 2994, 2959, 3044, 3001, 3013, 3019, 2948, 3022, 2973, 2901, 3066, 3003, 3054, 3013, 2926, 3046, 2901, 3012 };
        int splitCost = 2390;
        assertEquals(14996, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case10() {
        int[] workCost = { 2768, 2699, 2627, 2777, 2701, 2691, 2852, 2625, 2814, 2685, 2736, 2757, 2612, 2784, 2674, 2628, 2782, 2651, 2814, 2704, 2818, 2759, 2626, 2797, 2648, 2631, 2746, 2840, 2705, 2883, 2667, 2817, 2856, 2687, 2708, 2758, 2746, 2779, 2790, 2754, 2655, 2696, 2875, 2703, 2877 };
        int splitCost = 3006;
        assertEquals(20793, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case11() {
        int[] workCost = { 1725, 2375, 544, 990, 1562, 2146, 1696, 1200, 1101, 1349, 780, 998, 621, 1539, 2400, 2064, 635, 974, 1863, 1201, 2706, 2597, 2291, 1858, 2330, 2067, 2643, 1167, 1592, 2441, 1929, 1838, 2404, 785, 792, 1782, 987, 1493, 2058, 2122, 784 };
        int splitCost = 604;
        assertEquals(5420, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case12() {
        int[] workCost = { 380, 178, 192, 502, 408, 290, 312, 144, 169, 474, 438, 386, 330, 337, 201, 355, 457, 141, 251, 283, 293, 289, 159, 328, 497, 136, 510, 256, 156, 272, 405, 146, 423, 366 };
        int splitCost = 2943;
        assertEquals(17804, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case13() {
        int[] workCost = { 3051, 1861, 3101, 2156, 2297 };
        int splitCost = 3465;
        assertEquals(12551, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case14() {
        int[] workCost = { 1392, 1810, 1673, 1136, 512, 869, 307, 215, 1182, 1367, 1610, 1671, 1491, 727, 1199, 301, 633, 479, 1199, 539, 716, 604, 1438, 708, 782, 1627, 908, 1104, 1317, 855, 1222, 1759, 851, 568 };
        int splitCost = 2915;
        assertEquals(17969, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case15() {
        int[] workCost = { 1986, 2108, 1986, 1944, 1826, 1859, 2431, 2053, 2507, 1623, 2076, 2153, 1654, 2258, 1762, 1903, 2203, 1642, 2211, 1654, 1979, 2218, 1882, 2085, 2358, 2018, 1675, 2105, 2279, 1837, 1898, 2124, 1958, 2160, 2193, 2426 };
        int splitCost = 3195;
        assertEquals(21007, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case16() {
        int[] workCost = { 3060, 1171, 1909, 2655, 2177, 2410, 2188, 2415, 1376, 1476, 1151, 3070, 1753, 2663, 2615, 2777, 1829, 2827, 2753, 2438, 3084, 1061, 571, 1155, 1331, 1028, 2922, 1460, 1495, 1087, 2456, 2685, 565 };
        int splitCost = 3431;
        assertEquals(21157, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case17() {
        int[] workCost = { 1206, 2481, 1793, 2094, 2061, 1769, 737, 2131, 1739, 1892, 2618, 2146, 1857, 2244, 1463, 2918, 2748, 1521, 2093, 848, 2722, 2048, 834, 2246, 694, 1065, 1772, 1578, 1508, 556, 1490 };
        int splitCost = 3310;
        assertEquals(19298, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case18() {
        int[] workCost = { 548, 569, 502, 518, 542, 546, 521, 540, 554, 569, 513, 554, 566, 558 };
        int splitCost = 2237;
        assertEquals(9514, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case19() {
        int[] workCost = { 927, 1411, 2370, 946, 2699, 1192, 2447, 2592, 1099, 2652, 1870, 815, 2461, 2166, 2801, 1543, 2195, 1881, 2605, 1523, 1901, 2710, 2096, 884, 1992, 1435, 552, 2780, 1798, 2723, 2107, 1849, 2771, 2305, 1400, 538, 1549, 2029, 2103, 1641, 1369, 1327, 1842, 2375, 1798, 2166 };
        int splitCost = 1027;
        assertEquals(8154, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case20() {
        int[] workCost = { 1512, 1216, 1210, 1537, 1144, 1327, 1063, 1483, 1126, 1071, 1143, 1391, 1234, 1104, 1141, 1236, 1372, 1092, 1280, 1111, 1054, 1171, 1473, 1041, 1533, 1094, 1493, 1515, 1159, 1183, 1488, 1275, 1322, 1038, 1424, 1254, 1385, 1272, 1033, 1030, 1151, 1351, 1491, 1497, 1248 };
        int splitCost = 1121;
        assertEquals(7998, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case21() {
        int[] workCost = { 1991, 2102, 2019, 2165, 1825, 1299, 2274, 2327, 2386, 1518 };
        int splitCost = 1853;
        assertEquals(9403, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case22() {
        int[] workCost = { 3429, 3135, 3178, 3043, 3276, 3026, 3199, 3126, 3230, 3532, 3223, 3540, 3181, 3324, 3407, 3032, 3151, 3365, 3403, 3121, 3267, 3523, 3190, 3052, 3061, 3343, 3518, 3337, 3369, 3161, 3121, 3148, 3112, 3475 };
        int splitCost = 676;
        assertEquals(7108, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case23() {
        int[] workCost = { 2700, 2631, 2751, 2591, 2452, 2471, 2348, 2924, 2333, 2821, 2423, 2346, 2606, 2343, 2233, 2341, 2510, 2918, 2368, 2709, 2901, 2346, 2353, 2896, 2921, 2603, 2516 };
        int splitCost = 584;
        assertEquals(5741, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case24() {
        int[] workCost = { 129, 661, 253, 170, 378, 620, 124, 651 };
        int splitCost = 2313;
        assertEquals(7600, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case25() {
        int[] workCost = { 1196, 1402, 2535, 1251, 937, 1651 };
        int splitCost = 1306;
        assertEquals(5320, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case26() {
        int[] workCost = { 857, 1059, 724, 768, 711, 668, 709, 906, 985, 766, 549, 793 };
        int splitCost = 2084;
        assertEquals(9129, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case27() {
        int[] workCost = { 1980, 2292, 2371, 2674, 2093, 2324, 1819, 2405, 2438, 1770, 2628, 1921, 1930, 2118, 1828, 1950, 1775, 2100, 2012, 1822, 2277, 2235, 1884, 1975, 1963, 1899, 2616, 2266, 2302, 2391 };
        int splitCost = 3129;
        assertEquals(18261, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case28() {
        int[] workCost = { 1569, 2410, 1553, 2248, 2383, 2058, 1878, 1925, 1456, 1947, 2626, 1956, 2092, 1531, 2028, 1837, 1693, 1670, 1517, 1383, 2521 };
        int splitCost = 2692;
        assertEquals(15338, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case29() {
        int[] workCost = { 2091, 2545, 2984, 2665 };
        int splitCost = 48;
        assertEquals(3032, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case30() {
        int[] workCost = { 2686, 2820, 2515, 2495, 2971, 2844, 2860, 2528, 2815, 2473, 2720, 2940, 2698, 2788, 2790, 2714, 2687, 2435, 2894, 2901, 2565, 2986, 3004, 2579, 3016, 2585, 2725, 3016, 2557, 2599, 2965, 2950, 2741, 3009, 2524 };
        int splitCost = 1123;
        assertEquals(9266, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case31() {
        int[] workCost = { 1145, 1436, 2130, 563, 1093, 724, 2026, 1501, 82, 1871, 330, 2011, 2196, 2095, 567, 1567, 1662, 1907, 1613, 1784, 2170, 1610, 1540, 1321, 1429, 594, 1580, 715, 1670, 665, 335, 1259, 507, 1675, 112, 758, 1533 };
        int splitCost = 3313;
        assertEquals(20593, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case32() {
        int[] workCost = { 1363, 1408, 1508, 1467, 1443, 1267, 1388, 1249, 1428, 1420, 1311, 1243, 1434, 1317, 1405, 1522, 1242, 1347, 1412, 1236, 1268, 1394, 1227, 1527, 1498, 1344, 1267, 1512, 1464, 1253, 1355, 1404, 1205, 1337, 1340, 1230, 1441, 1455 };
        int splitCost = 2960;
        assertEquals(19071, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case33() {
        int[] workCost = { 1237, 601, 1412, 2522, 2280, 575, 1448, 2178, 1119, 1274, 822, 841, 1521, 2532 };
        int splitCost = 420;
        assertEquals(3621, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case34() {
        int[] workCost = { 3035, 3069, 3059, 3079, 3052, 3040, 3043, 3016, 3024, 3049, 3037, 3057, 3008 };
        int splitCost = 2258;
        assertEquals(12089, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case35() {
        int[] workCost = { 2618, 2812, 2253, 2406, 2567, 2398, 2300, 2378, 2343, 2457, 2283, 2664, 2279, 3148, 2477, 2951, 3109, 3124, 2439, 2969, 2265, 2374, 2958, 2371, 2847, 2554, 2512, 3110, 2590, 3171, 2781, 3046, 3072, 2574, 3123, 2614 };
        int splitCost = 1826;
        assertEquals(13330, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case36() {
        int[] workCost = { 1965, 2864, 2375, 2579, 1885 };
        int splitCost = 1126;
        assertEquals(5343, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case37() {
        int[] workCost = { 2510, 757, 1763, 2762, 2150, 1570 };
        int splitCost = 1191;
        assertEquals(5723, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case38() {
        int[] workCost = { 1924, 2334, 2645, 2259, 2197, 2781, 3284 };
        int splitCost = 2050;
        assertEquals(8931, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case39() {
        int[] workCost = { 3120, 1471, 3119, 2961, 3030, 1472, 1256, 1630, 1499, 2949, 490, 2597, 2537, 1067, 665, 517, 3242 };
        int splitCost = 1551;
        assertEquals(9254, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case40() {
        int[] workCost = { 2971, 2938, 2954, 2873, 3318, 3399, 3215, 3223, 3522, 3579, 3180, 3227, 3204, 3429, 3250, 3416, 3165, 3221, 3570, 3316, 2896, 3457, 2937, 2896, 3140, 2902, 2899, 2982, 3081, 2857, 3247, 3187, 2993, 2894, 2947, 3076, 2970, 3360, 3476, 2870, 3308, 3134, 3354, 3120, 3320, 3077, 3010, 3124 };
        int splitCost = 2176;
        assertEquals(16283, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case41() {
        int[] workCost = { 375, 988, 737, 314, 522, 977, 698, 948, 1042, 1026, 619, 968, 510, 527, 703, 505, 837, 796, 532, 605, 596, 938, 536, 562, 722, 843, 416, 560, 963, 444, 351, 421, 828, 519 };
        int splitCost = 512;
        assertEquals(3582, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case42() {
        int[] workCost = { 2479, 2441, 2544, 2784, 2991, 3077, 2554, 3202, 3041, 2591, 3030, 2658, 2561, 3166, 2929, 2978, 3063, 2874, 2879, 2481, 3055, 2942, 3190, 2888, 2833, 2571, 3195, 2695, 2591, 2527, 2598, 2745, 3083, 2459, 2658, 2583, 3028, 3145, 3238, 2945 };
        int splitCost = 2008;
        assertEquals(14743, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case43() {
        int[] workCost = { 2177, 1868, 2067, 2245, 1805, 2012, 1809, 2316, 1827, 2235, 2173, 1933, 1773, 2126, 2142, 2102, 1786, 1765, 2231, 1865, 1844, 2288, 2298, 1903, 2104, 1943, 2124, 2162, 1786 };
        int splitCost = 3434;
        assertEquals(19415, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case44() {
        int[] workCost = { 2011, 1892, 2543, 2404, 2513, 2056, 2339, 2523, 2071, 2217, 2169, 1983 };
        int splitCost = 1604;
        assertEquals(8755, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case45() {
        int[] workCost = { 1934, 3543, 3417, 2630, 2462, 3569, 3497, 971, 557, 218, 709, 2158, 3353, 1427, 859, 3524, 2061, 1505, 3430, 1567, 1142, 2821, 846, 2117, 1047, 784, 2086, 3210, 680, 2771, 3133, 3038, 2713, 1791, 686 };
        int splitCost = 1044;
        assertEquals(8353, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case46() {
        int[] workCost = { 727, 1534, 1049, 2524 };
        int splitCost = 1597;
        assertEquals(5718, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case47() {
        int[] workCost = { 2475, 1605, 1267, 2538, 2420, 2733, 1438 };
        int splitCost = 1314;
        assertEquals(6480, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case48() {
        int[] workCost = { 2280, 2129, 2682, 2122, 2481, 2401, 2623, 2132, 2208, 2441, 2247, 2247, 2760, 2206, 2253, 2413, 2562, 2702, 2262, 2146, 2244, 2192, 2388, 2381, 2400, 2505, 2414, 2619, 2316 };
        int splitCost = 1726;
        assertEquals(11253, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case49() {
        int[] workCost = { 706, 668, 713, 749, 759, 620, 642, 621, 500, 513, 587, 484, 510, 623, 510, 669, 464, 533, 579, 576, 492, 563, 665, 731, 505, 484, 645, 609, 473, 572, 718, 568, 742, 765, 702, 622 };
        int splitCost = 2585;
        assertEquals(16020, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case50() {
        int[] workCost = { 2988, 1905, 1830, 3053, 1478, 2907, 1966, 2514, 3311, 2527, 2573, 2962, 2978, 2425, 1809, 1548, 2734, 2010, 2858, 2462, 3130, 1698, 1947, 2553, 2468, 3099, 1918, 3024, 2379, 2484, 1759, 2342, 2588, 2211, 2375, 3058, 2785, 2220, 3233, 2357, 2498, 2601, 1948, 2873, 2249, 2072, 2683 };
        int splitCost = 2697;
        assertEquals(18770, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case51() {
        int[] workCost = { 2198, 2197, 2012, 2168, 1749, 1993, 2164, 1679, 1702, 2169, 1909, 1825, 1755, 1769, 1782, 1754, 1685, 1894, 2255, 2082, 1768, 2027, 1881, 2020, 2158 };
        int splitCost = 1066;
        assertEquals(7412, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case52() {
        int[] workCost = { 1816, 1529, 1262, 2775, 1469, 929, 2366, 811, 1727, 2497, 1995 };
        int splitCost = 1495;
        assertEquals(7707, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case53() {
        int[] workCost = { 1921, 888, 1830, 1006, 1708, 1541, 1336, 588, 1321, 1547, 2141, 1431, 1953, 2566, 2013, 2106, 1915, 2050, 1386, 2084, 2864, 1670, 710, 2022, 1461, 1618, 882, 1934, 1181, 2004, 668, 1325, 1999, 2584, 1563, 2818, 744, 1270 };
        int splitCost = 143;
        assertEquals(3150, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case54() {
        int[] workCost = { 1907, 1560, 2068, 1959, 1189, 1630, 2499, 2139, 2514, 2132, 1397, 2936, 3036, 1394, 1159, 1696, 1085, 2187, 1455, 2381, 1786, 2393, 1893, 1169, 1772, 2245, 2152, 1859, 2206, 2326, 1227, 2044, 2255, 961, 1789, 1052, 1186, 1251, 2294 };
        int splitCost = 1674;
        assertEquals(11674, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case55() {
        int[] workCost = { 234, 671, 901, 415, 635, 524, 660, 139, 343, 372 };
        int splitCost = 1490;
        assertEquals(6332, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case56() {
        int[] workCost = { 757, 972, 735, 572, 1030, 1127, 484, 743, 895, 743, 851, 601, 893, 743, 1150, 914, 615, 901, 710, 1117, 724, 788, 575, 1103, 721, 568, 931, 774, 821 };
        int splitCost = 1536;
        assertEquals(8783, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case57() {
        int[] workCost = { 2458, 1422, 1039, 1728, 1445, 2584, 2698, 1423, 1127, 881, 1367, 2076, 1391, 1202, 2236, 909, 2274, 2477, 2676, 2364, 1531, 1771, 2716 };
        int splitCost = 3021;
        assertEquals(17181, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case58() {
        int[] workCost = { 1184, 670, 2149, 1943, 718, 677, 825, 1129, 879, 1761, 1423, 1763, 1460, 1332, 1505, 1990, 435, 787, 2233, 1133 };
        int splitCost = 1484;
        assertEquals(8549, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case59() {
        int[] workCost = { 2234, 2570, 2970, 2142, 2632, 3015, 2019, 2180, 2759, 1954, 1969, 2038, 3178, 2986, 2127, 2213, 2524, 2848, 2735, 2771 };
        int splitCost = 2146;
        assertEquals(12943, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case60() {
        int[] workCost = { 2345, 1760, 2354, 1369 };
        int splitCost = 1894;
        assertEquals(6142, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case61() {
        int[] workCost = { 1413, 2349, 978, 2936, 1909, 2787, 918, 1400, 595, 2476, 601, 3163, 1063, 2169, 1555, 2506, 900, 548, 2181, 1360, 2136, 1844, 3056, 446, 1474, 1373, 454, 2510, 3171, 1735, 542, 3206, 696, 1745, 811, 607 };
        int splitCost = 2817;
        assertEquals(17598, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case62() {
        int[] workCost = { 1942, 1650, 1785, 1727, 2585, 2165, 1556, 1507, 2679, 2508, 2009, 1941, 2035, 1858, 2223, 2489, 2094, 2357 };
        int splitCost = 1443;
        assertEquals(8942, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case63() {
        int[] workCost = { 780, 1333, 1091, 1024, 1846, 1597, 1611, 1346, 705, 1739, 1851, 607, 1486, 1549, 1810, 1377, 850, 1959, 1690, 1497, 682, 1250, 1029, 810, 1670, 618, 718, 1235, 1303, 1753, 760, 856, 1482, 594, 1896, 1694, 1790, 1257, 617, 1902 };
        int splitCost = 2883;
        assertEquals(18533, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case64() {
        int[] workCost = { 1486, 1838, 1075, 1868, 1821, 1615, 1731, 1170, 1164, 1866, 534, 1356, 739, 1157, 1043, 1762, 1647, 1412, 1320, 1716, 852, 1237, 1203, 579, 880, 1510, 1469, 972, 1554, 1045, 1114, 1560, 569, 908, 1804, 1337, 1349 };
        int splitCost = 1925;
        assertEquals(12595, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case65() {
        int[] workCost = { 1255, 2565, 2216, 1894, 2047, 1206, 2184, 2128, 2474, 2479, 2141, 1924, 1978, 2095, 1777, 2503, 2133, 1884, 1805, 1100, 1649, 2286, 1761 };
        int splitCost = 1175;
        assertEquals(8003, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case66() {
        int[] workCost = { 3040, 1025, 429 };
        int splitCost = 127;
        assertEquals(3167, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case67() {
        int[] workCost = { 835, 796, 815, 602, 1252, 650, 1003, 1099, 898, 247, 1054, 1484, 640, 1298, 996, 251, 345, 1047, 917, 395, 1040, 1254, 890, 1073, 1052, 279 };
        int splitCost = 3374;
        assertEquals(17924, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case68() {
        int[] workCost = { 517, 368, 544, 262, 303, 453, 487, 289, 278, 482, 527, 461, 476, 349, 308, 551, 358, 315, 532, 262, 517, 461, 285, 584, 355, 525, 567, 490, 322, 347, 307, 524, 410, 249 };
        int splitCost = 2802;
        assertEquals(17090, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case69() {
        int[] workCost = { 856, 1120, 1400, 1147, 1139, 1081, 1164, 921, 1312, 872, 1031, 847, 1273, 1486, 804, 1184, 1324, 1248, 832, 1449, 1021, 1391, 1117, 955, 1205, 987, 1571, 1485, 939, 1357, 1445, 1409, 1407, 985 };
        int splitCost = 448;
        assertEquals(3689, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case70() {
        int[] workCost = { 2249, 2405, 2461, 2077, 1987, 2737, 1965, 2611, 2209, 2373, 2608, 2341, 2630, 2506, 1964, 2677, 2433, 2178, 2693, 2283, 2086, 2651, 2553, 2276, 2595, 2420, 2655, 2507, 2765, 2185, 2181, 2368, 2524, 2482, 2440, 2751, 2717, 2504, 2650, 1955, 2448, 2272, 2204, 2567, 2562 };
        int splitCost = 3547;
        assertEquals(23786, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case71() {
        int[] workCost = { 475, 710, 668, 904, 513, 586, 496, 918, 704, 559, 850, 910, 656, 789, 407, 557, 425, 524, 511, 896, 426, 736, 678, 619, 742, 788, 498, 723, 853, 847, 765, 493 };
        int splitCost = 2634;
        assertEquals(14088, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case72() {
        int[] workCost = { 23, 20, 24, 16, 12, 9, 24, 21, 15, 13, 21, 27, 26, 14, 18, 14, 3, 21, 23, 25, 23, 6, 22, 9, 7, 18, 24, 5, 26, 26, 24, 24, 6, 14, 14, 14, 17, 6, 11, 25, 10, 17, 4, 24, 21 };
        int splitCost = 599;
        assertEquals(3615, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case73() {
        int[] workCost = { 2908, 2450, 2663, 2901, 2979, 2823, 2751, 2536, 2470, 2975, 2595, 2572, 2690, 2753, 2394, 2956, 2966, 2376, 2608, 2700, 2467, 2414, 2598, 2865, 2652, 2671, 2581, 2996, 2351, 2957, 2546, 2940, 2376, 2727, 2385, 2561 };
        int splitCost = 1413;
        assertEquals(10945, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case74() {
        int[] workCost = { 1690, 2437 };
        int splitCost = 1141;
        assertEquals(3578, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case75() {
        int[] workCost = { 1547, 1550, 1557, 1547, 1561 };
        int splitCost = 2805;
        assertEquals(9962, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case76() {
        int[] workCost = { 859, 476, 789, 664, 584, 686, 293, 893, 235, 490, 253, 233, 265, 320, 282, 511, 489, 428, 230, 676 };
        int splitCost = 1141;
        assertEquals(6025, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case77() {
        int[] workCost = { 1144 };
        int splitCost = 334;
        assertEquals(1144, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case78() {
        int[] workCost = { 1901, 1566, 1851, 1804, 1911, 1652, 2126, 1719, 2372, 2293, 2207, 1452 };
        int splitCost = 2212;
        assertEquals(10759, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case79() {
        int[] workCost = { 1602, 1432 };
        int splitCost = 2427;
        assertEquals(4029, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case80() {
        int[] workCost = { 3379, 3524, 3189, 3212, 3436, 3376, 3253, 3400, 3203, 3344, 3363, 3408, 3521, 3362, 3232, 3490 };
        int splitCost = 3449;
        assertEquals(17320, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case81() {
        int[] workCost = { 249, 352, 286, 208, 367, 391, 315, 234, 175, 231, 257, 433, 135, 353, 436, 332, 246, 444, 414, 109, 393 };
        int splitCost = 3551;
        assertEquals(18041, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case82() {
        int[] workCost = { 701, 551, 654, 747, 765, 588, 569, 480, 836, 696, 478, 413, 410, 825, 857, 544, 663, 436, 846, 436, 876, 506, 552, 771, 633, 894 };
        int splitCost = 384;
        assertEquals(2691, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case83() {
        int[] workCost = { 1038, 883, 811, 887, 749, 595, 1236, 1007, 1341, 608, 814, 1115, 636, 748, 1154, 1254, 1413, 1101, 1044, 867, 1186, 1156, 1328, 890, 771, 942, 956, 1121, 1292, 814 };
        int splitCost = 730;
        assertEquals(4978, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case84() {
        int[] workCost = { 2848, 3135, 2966, 3297 };
        int splitCost = 3546;
        assertEquals(10389, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case85() {
        int[] workCost = { 885, 1405, 1174, 1084, 1445, 790, 1662, 1408, 805, 941, 1480, 1656, 895, 1049, 852, 1573, 1814, 1221, 1148 };
        int splitCost = 2851;
        assertEquals(15196, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case86() {
        int[] workCost = { 279, 335, 354, 281, 385, 326, 300, 271, 314, 292 };
        int splitCost = 1249;
        assertEquals(5288, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case87() {
        int[] workCost = { 1894, 1862, 1802, 1842, 1778, 1753, 1968, 1788, 1784, 1793, 1924, 1772, 1800, 1991, 1927, 1826 };
        int splitCost = 3192;
        assertEquals(14759, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case88() {
        int[] workCost = { 1380, 1018, 1148, 1246, 1092, 1199, 1019, 1234, 1277, 1299, 1474, 1218, 1045, 1415, 1221, 1453, 1396, 1114, 1522, 1416, 1530, 1193, 1009, 1338, 1063, 1407, 1495, 1242, 1032, 1038, 1443, 1537, 1031, 1404, 1438, 1123, 1196, 1369, 1180, 1451, 1303, 1377, 1429, 1426, 1160 };
        int splitCost = 3255;
        assertEquals(20868, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case89() {
        int[] workCost = { 1622, 2445, 2591, 2059, 1631, 2481, 1062, 2758, 2228, 874, 882, 2182, 995, 2592, 1855, 990, 2605, 508, 1715, 911, 735, 1015, 1688, 2611, 1596, 2047, 1131, 1342, 2504 };
        int splitCost = 2748;
        assertEquals(16332, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case90() {
        int[] workCost = { 2370, 3363, 2434, 3182, 2551, 2277, 2855, 3168, 2877, 2180, 3080, 2268, 3025 };
        int splitCost = 1372;
        assertEquals(8568, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case91() {
        int[] workCost = { 1780, 1859, 2030, 1473, 1946, 1628, 1983, 2021, 1791, 1957, 1718, 1862, 1747, 1540, 1994, 2005, 1868, 1949, 1482, 1737, 1891, 1980, 1567, 1567, 1655, 1824, 1915, 1644, 1894 };
        int splitCost = 211;
        assertEquals(3001, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case92() {
        int[] workCost = { 1738, 2676, 2373, 2730, 2617, 2199, 2581, 2818, 2448, 2446, 2826, 2957, 1909, 1964, 2600, 2084, 2282, 3043, 3004, 3014, 2442, 2558, 2739, 2001, 2854, 2177, 2975, 2986, 1731, 2884 };
        int splitCost = 2530;
        assertEquals(15654, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case93() {
        int[] workCost = { 2818, 2693, 2979, 2377, 2627, 2980, 3058 };
        int splitCost = 734;
        assertEquals(5182, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case94() {
        int[] workCost = { 1531, 1156, 2459, 1261, 686, 668, 936, 1776, 952, 702, 932, 2448, 1685, 1653, 1885, 1954, 1594, 1387, 1536, 2083, 2450, 2250, 1597, 1690, 1179, 1575, 1462, 1592, 622, 1947, 1130, 2195, 1152, 2056, 947, 2181, 868, 2419, 1869, 1692, 614, 1646, 1613, 1855, 2002, 1483 };
        int splitCost = 2196;
        assertEquals(14861, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case95() {
        int[] workCost = { 2807 };
        int splitCost = 1219;
        assertEquals(2807, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case96() {
        int[] workCost = { 2751, 2565, 748, 3079, 2955, 1070, 1371, 2109, 2794, 2344, 1195, 2550, 2683, 3141, 1425, 2667, 1003, 2880, 2800, 2802, 473, 1460, 1859, 2746, 2304, 1492, 1443, 2503, 377, 1101, 1323, 474, 2431, 737, 2634, 1253, 1519, 2477, 2632, 1054, 2319, 1445, 277, 1410, 2334, 919 };
        int splitCost = 1927;
        assertEquals(13896, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case97() {
        int[] workCost = { 1733, 2518, 1112, 1379, 957, 1012, 1459, 585, 2579, 664, 1376, 1167, 1234, 2588, 1065, 1914, 1361, 2432, 2226, 1500, 843, 1235, 1915, 1516, 1427, 1923, 2531, 1372, 1126, 2584, 2313, 579, 965, 1425, 2224, 2126, 1752, 792, 1114, 1501, 651, 1721, 2218, 1745, 1302, 692 };
        int splitCost = 1114;
        assertEquals(8200, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case98() {
        int[] workCost = { 934, 215, 877, 783, 432, 528, 1063, 210, 957, 815, 516, 746, 573, 810, 769, 246, 467, 383, 432, 714, 774, 792, 586, 523 };
        int splitCost = 3546;
        assertEquals(18504, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case99() {
        int[] workCost = { 1985, 2258, 2093, 2050, 2001, 1648, 2307, 2140, 1521, 1419, 1512, 1944, 1405, 1419, 1792, 1869, 1557, 1231, 1721, 2080, 2219, 1791, 2023, 2067, 2166, 1903 };
        int splitCost = 836;
        assertEquals(6260, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case100() {
        int[] workCost = { 1252, 2240, 747, 406, 1337, 2915, 1232, 1838, 1064, 2462, 892, 2222, 2624, 1170, 2710, 561, 597, 2813, 379, 1634, 808, 2027, 2684, 2898, 385, 675, 1444, 2938 };
        int splitCost = 142;
        assertEquals(3324, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case101() {
        int[] workCost = { 820, 967, 851, 886, 920, 918, 787, 1015, 841, 811, 854, 870, 854, 819, 994, 764, 980, 972, 934, 897, 817, 816, 798, 853, 786, 865, 925, 974, 922, 983, 835 };
        int splitCost = 3143;
        assertEquals(16709, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case102() {
        int[] workCost = { 2211, 1846, 1918, 1486, 1637, 2079, 2569, 1998, 2215, 2504 };
        int splitCost = 2743;
        assertEquals(12890, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case103() {
        int[] workCost = { 2096, 1600, 1183, 1756, 1226, 1715, 2039, 1595, 1231, 1627, 2018, 1895, 1792, 1671, 1969, 1615, 977, 1806, 1852, 1605, 2076, 1110, 1607, 1062, 2122, 2061, 1520, 1037, 1712, 970, 1962, 1605, 1996, 1438, 1942 };
        int splitCost = 1971;
        assertEquals(13009, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case104() {
        int[] workCost = { 2310, 2326, 2400, 2337, 2368, 2316, 2349, 2411, 2347, 2445, 2305, 2422, 2310, 2348, 2312, 2318, 2378, 2444, 2384, 2423, 2317, 2318, 2336, 2430, 2406, 2409, 2393, 2367, 2306, 2426, 2363, 2424, 2373, 2383, 2315, 2350 };
        int splitCost = 2263;
        assertEquals(15895, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case105() {
        int[] workCost = { 2828 };
        int splitCost = 1871;
        assertEquals(2828, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case106() {
        int[] workCost = { 802, 683, 502, 360, 806, 722, 297, 375, 327, 670, 409, 680, 260, 498, 496, 944, 265, 414, 700, 177 };
        int splitCost = 1313;
        assertEquals(6974, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case107() {
        int[] workCost = { 2665, 3390, 2934, 3324, 3048, 3062, 3258, 2650, 2821, 2960, 2971, 2911, 3262, 3304, 2764, 3402, 2701, 3012, 3294, 2577, 2843, 2877, 2754, 3352, 3256, 2724 };
        int splitCost = 3579;
        assertEquals(21157, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case108() {
        int[] workCost = { 1912, 1712, 1712, 1712, 1612, 1612 };
        int splitCost = 100;
        assertEquals(2012, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case109() {
        int[] workCost = { 317, 793, 2471 };
        int splitCost = 1;
        assertEquals(2472, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case110() {
        int[] workCost = { 1000, 999, 988, 977, 122, 342, 543, 654, 234, 765, 3, 564, 234, 1, 324, 345, 322, 222, 111, 3600, 3599, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int splitCost = 21;
        assertEquals(3641, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case111() {
        int[] workCost = { 1784, 2087, 3178, 116, 2994, 3536, 587, 2893, 250, 3422, 1563, 428, 1491, 2060, 564, 2327, 2941, 1027, 773, 137, 2412, 2169, 2968, 430, 2583, 2331, 63, 3524, 2468, 1136, 330, 3403, 3223, 2659, 2670, 1768, 2594, 3257, 212, 2843, 2230, 1774, 2422, 120, 2985, 2138, 1599, 2325, 2316, 2371 };
        int splitCost = 1614;
        assertEquals(12071, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case112() {
        int[] workCost = { 3000, 3001, 3002, 3003, 3004, 3005, 3006, 3007, 3008, 3009, 3010, 3011, 3012, 3013, 3014, 3015, 3016, 3017, 3018, 3019, 3020, 3021, 3022, 3023, 3024, 3025, 3026, 3027, 3028, 3029, 3030, 3031, 3032, 3033, 3034, 3035, 3036, 3037, 3038, 3039, 3040, 3041, 3042, 3043, 3044, 3045, 3046, 3047, 3048, 3049 };
        int splitCost = 1;
        assertEquals(3050, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case113() {
        int[] workCost = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 38, 39, 40, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
        int splitCost = 14;
        assertEquals(117, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case114() {
        int[] workCost = { 8, 12, 15, 16, 17, 20, 22, 24, 25, 27, 30 };
        int splitCost = 3;
        assertEquals(36, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case115() {
        int[] workCost = { 3200, 3199, 3198, 3197, 3196, 3195, 3194, 3193, 3192, 3191, 3190, 3189, 3188, 3187, 3186, 3185, 3184, 3183, 3182, 3181, 3180, 3179, 3178, 3177, 3176, 3175, 3174, 3173, 3172, 3171, 3170, 3169, 3168, 3167, 3166, 3165, 3164, 3163, 3162, 3161, 3160, 3159, 3158, 3157, 3156, 3155, 3154, 3153, 3152, 3151 };
        int splitCost = 3175;
        assertEquals(22236, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case116() {
        int[] workCost = { 1, 2, 3, 4, 5, 6, 8, 10, 12, 15, 20, 24, 25, 30, 40, 50, 60, 75, 100, 120, 125, 150, 200, 250, 300, 375, 500, 600, 750, 1000, 1500, 3000 };
        int splitCost = 100;
        assertEquals(3100, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case117() {
        int[] workCost = { 1535, 482, 310, 631, 2053, 2803, 2873, 1237, 3308, 1547, 1508, 2480, 1384, 2065, 187, 187, 3167, 2718, 3100, 3568, 1075, 3362, 2075, 3582, 2121, 1347, 3079, 1929, 1209, 891, 2691, 2843, 275, 260, 3207, 2326, 2338, 17, 591, 1550, 494, 1614, 1742, 780, 293, 3393, 2528, 1705, 3335, 2662 };
        int splitCost = 99;
        assertEquals(3780, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case118() {
        int[] workCost = { 1124, 1345, 1734, 1030, 1020, 1013, 1450, 1230, 1120, 1040, 1534, 1540, 1130, 1645, 1645, 1856, 1086, 1086, 1600, 1001, 1700, 1034, 1532, 1034, 1034, 1245, 1056, 1050, 1090, 1040, 1860, 1743, 1543, 1223, 1756, 1467, 1856, 1850, 1680, 1550, 1420, 2000, 1234, 1254, 1156, 1867, 1057, 1078, 1060, 1024 };
        int splitCost = 100;
        assertEquals(2256, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case119() {
        int[] workCost = { 1275, 1701, 368, 2534, 2403, 2558, 1912, 1792, 2996, 498, 3339, 579, 2915, 61, 395, 1725, 629, 2376, 2461, 3070, 1225, 1438, 1536, 1387, 1526, 2816, 655, 1950, 2952, 3129, 3081, 1360, 1605, 1972, 3103, 3146, 1701, 2333, 269, 328, 1137, 3445, 156, 2767, 907, 2298, 1975, 1745, 687, 902 };
        int splitCost = 3245;
        assertEquals(21931, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case120() {
        int[] workCost = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 140, 150, 160, 170, 180, 190, 200, 210, 220, 230, 250, 240, 2802, 2222, 2222, 1900, 3030, 3212, 3211, 333, 330, 330, 3003, 222, 222, 333, 444, 55, 11, 23, 11, 1, 23, 44, 55, 342, 33 };
        int splitCost = 500;
        assertEquals(4712, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case121() {
        int[] workCost = { 1712, 1911, 1703, 1610, 1697, 1612 };
        int splitCost = 100;
        assertEquals(2012, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case122() {
        int[] workCost = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        int splitCost = 1000;
        assertEquals(4006, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case123() {
        int[] workCost = { 1583, 977, 2806, 2598, 364, 1577, 986, 3030, 281, 1903, 1483, 18, 842, 3559, 2642, 2020, 2198, 777, 2203, 542, 2852, 2865, 2820, 137, 1291, 1565, 3267, 464, 1214, 2006, 1440, 2797, 2982, 646, 1794, 3346, 2222, 2779, 2776, 2503, 1082, 658, 2521, 1923, 616, 1563, 342, 2814, 2339 };
        int splitCost = 342;
        assertEquals(4585, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case124() {
        int[] workCost = { 1000, 100, 10, 1 };
        int splitCost = 1;
        assertEquals(1001, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case125() {
        int[] workCost = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
        int splitCost = 1;
        assertEquals(51, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case126() {
        int[] workCost = { 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3600, 3 };
        int splitCost = 3500;
        assertEquals(24600, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case127() {
        int[] workCost = { 3106, 3069, 1511, 3425, 3376, 2148, 2428, 173, 2629, 255, 2610, 1330, 2190, 3301, 2005, 1304, 2266, 2718, 3532, 2333, 546, 855, 2643, 1190, 3542, 3087, 2276, 627, 614, 2270, 2689, 512, 2170, 566, 1153, 487, 350, 913, 645, 803, 1885, 2202, 2613, 3248, 3016, 1991, 827, 1326, 1571, 1524 };
        int splitCost = 438;
        assertEquals(5268, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case128() {
        int[] workCost = { 1000 };
        int splitCost = 1000;
        assertEquals(1000, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case129() {
        int[] workCost = { 10, 11, 14, 19, 26, 35, 46, 59, 74, 91, 110, 131, 154, 179, 206, 235, 266, 299, 334, 371, 410, 451, 494, 539, 586, 635, 686, 739, 794, 851, 910, 971, 1034, 1099, 1166, 1235, 1306, 1379, 1454, 1531, 1610, 1691, 1774, 1859, 1946, 2035, 2126, 2219, 2314, 2411 };
        int splitCost = 1000;
        assertEquals(7179, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case130() {
        int[] workCost = { 10, 15, 20, 30, 45, 70, 150, 250, 400, 1000, 1001, 1002 };
        int splitCost = 123;
        assertEquals(1248, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case131() {
        int[] workCost = { 1, 1, 1, 1, 1, 1, 2, 3, 3, 4, 5, 6, 6, 3, 34, 5, 6, 4, 34, 34, 54, 234, 23, 34, 3, 2, 2, 2, 2, 1, 2, 3, 4, 5, 6, 8, 6, 4, 3, 2, 3, 56, 23, 54, 23, 54, 32, 45, 23, 2 };
        int splitCost = 4;
        assertEquals(238, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case132() {
        int[] workCost = { 213, 3, 4, 546, 546, 67, 78, 86, 45, 546, 677, 566, 45, 22, 444, 3100 };
        int splitCost = 3000;
        assertEquals(15004, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case133() {
        int[] workCost = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
        int splitCost = 1;
        assertEquals(11, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case134() {
        int[] workCost = { 10, 41, 25, 452, 542, 452, 78, 578, 67, 789, 789, 474, 474, 3000, 141, 414, 414, 888, 888, 888, 888, 888, 888, 777, 869, 777, 444, 111, 111, 444, 111, 444, 1, 1, 1, 111, 111, 111, 1111, 1111, 1111, 444, 444, 1111, 444, 444, 1, 4, 7, 8 };
        int splitCost = 3250;
        assertEquals(20277, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case135() {
        int[] workCost = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 50, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 50, 45, 47, 48, 50 };
        int splitCost = 25;
        assertEquals(183, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case136() {
        int[] workCost = { 783, 1851, 777, 2790, 796, 2058, 2035, 3038, 3186, 3254, 240, 1327, 2073, 1566, 638, 550, 621, 1986, 355, 2017, 123, 3238, 37, 651, 1179, 54, 2009, 293, 122, 2645, 3062, 2373, 931, 2734, 2053, 376, 2954, 2635, 2136, 1187, 149, 1443, 244, 2951, 1815, 1037, 44, 1651, 2969, 2291 };
        int splitCost = 1800;
        assertEquals(12844, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case137() {
        int[] workCost = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99 };
        int splitCost = 47;
        assertEquals(345, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case138() {
        int[] workCost = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1 };
        int splitCost = 1;
        assertEquals(6, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case139() {
        int[] workCost = { 2194, 935, 677, 1702, 2758, 1030, 891, 3412, 2356, 2045, 1688, 3449, 3051, 369, 589, 1873, 2124, 441, 2825, 701, 3224, 1484, 1809, 990, 3187, 1991, 344, 408, 2660, 2981, 3271, 48, 770, 3492, 1894, 3358, 1720, 1942, 1920, 2156, 785, 3452, 2915, 2340, 2828, 2493, 1389, 1876, 1880, 493 };
        int splitCost = 1800;
        assertEquals(13140, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case140() {
        int[] workCost = { 5, 5, 5, 5, 5, 6, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
        int splitCost = 678;
        assertEquals(4073, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case141() {
        int[] workCost = { 1 };
        int splitCost = 1000;
        assertEquals(1, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case142() {
        int[] workCost = { 100, 100, 100, 100, 1000, 1000, 1000, 1000, 2000, 2000, 2000, 2000, 3000, 3000, 3000, 3000, 100, 100, 100, 100, 100, 3000, 3000, 3000, 3000, 3000, 2000, 3000, 3000, 3000 };
        int splitCost = 499;
        assertEquals(4996, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case143() {
        int[] workCost = { 1, 2 };
        int splitCost = 3;
        assertEquals(5, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case144() {
        int[] workCost = { 2896, 145, 863, 3437, 794, 2156, 1545, 253, 732, 1421, 2226, 72, 2446, 85, 3525, 1605, 553, 1758, 3478, 923, 533, 641, 2937, 328, 2922, 511, 3481, 1750, 1250, 1633, 1772, 1903, 3028, 1014, 2776, 2743, 1236, 1545, 2041, 2574, 1915, 2395, 2001, 1446, 293, 115, 963, 1096, 1764, 84 };
        int splitCost = 2966;
        assertEquals(19952, foxanddoraemon.minTime(workCost, splitCost));
    }

    @Test
    public void case145() {
        int[] workCost = { 3600, 3599, 3598, 3597, 2312, 3600, 3599, 3598, 3597, 2312, 3600, 3599, 3598, 3597, 2312, 3600, 3599, 3598, 3597, 2312, 3600, 3599, 3598, 3597, 2312, 3600, 3599, 3598, 3597, 2312, 3600, 3599, 3598, 3597, 2312, 3600, 3599, 3598, 3597, 2312, 3600, 3599, 3598, 3597, 2312, 3600, 3599, 3598, 3597, 2312 };
        int splitCost = 1000;
        assertEquals(9599, foxanddoraemon.minTime(workCost, splitCost));
    }

}
