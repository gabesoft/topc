package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class JingleRingleTest {
    JingleRingle jingleringle = new JingleRingle();

    @Test
    public void case1() {
        int[] buyOffers = { 1000, 1024 };
        int[] sellOffers = { 990, 1011 };
        int tax = 0;
        assertEquals(34, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case2() {
        int[] buyOffers = { 1000, 1001, 1002 };
        int[] sellOffers = { 980, 981, 982 };
        int tax = 2;
        assertEquals(2, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case3() {
        int[] buyOffers = { 100, 120, 140 };
        int[] sellOffers = { 150, 170, 200 };
        int tax = 15;
        assertEquals(0, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case4() {
        int[] buyOffers = { 440, 451, 439 };
        int[] sellOffers = { 390, 390 };
        int tax = 10;
        assertEquals(22, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case5() {
        int[] buyOffers = {  };
        int[] sellOffers = {  };
        int tax = 20;
        assertEquals(0, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case6() {
        int[] buyOffers = {  };
        int[] sellOffers = { 2143, 4253, 2340, 4536, 5931, 3904 };
        int tax = 10;
        assertEquals(0, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case7() {
        int[] buyOffers = {  };
        int[] sellOffers = { 8653, 9528, 7243, 8431, 9345, 7900 };
        int tax = 8;
        assertEquals(0, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case8() {
        int[] buyOffers = { 345, 756, 123, 456 };
        int[] sellOffers = {  };
        int tax = 19;
        assertEquals(0, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case9() {
        int[] buyOffers = { 957, 2321, 1743, 834, 923, 2156, 1875 };
        int[] sellOffers = {  };
        int tax = 1;
        assertEquals(0, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case10() {
        int[] buyOffers = { 2000, 2000, 2000, 2000 };
        int[] sellOffers = { 1500, 1500, 1500, 1500 };
        int tax = 5;
        assertEquals(1600, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case11() {
        int[] buyOffers = { 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000 };
        int[] sellOffers = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
        int tax = 0;
        assertEquals(495000, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case12() {
        int[] buyOffers = { 3811, 3568, 3274, 3352, 2649, 3655, 3442, 3852, 3096, 2668, 3509, 3220, 3512, 2603, 2499, 3578, 3537, 3819, 2882, 2664, 2902, 3586, 3473, 3451, 3602, 2801, 3284, 3333, 3041, 3313 };
        int[] sellOffers = { 2862, 3529, 3255, 2416, 3805, 3098, 3776, 3339, 2747, 3534, 3381, 3713, 3959, 3893, 2372, 3079, 3261, 2387, 3819, 3843, 3231, 3367 };
        int tax = 15;
        assertEquals(3147, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case13() {
        int[] buyOffers = { 1692, 3281, 862 };
        int[] sellOffers = { 2701, 2819, 2582, 1918, 638, 601, 1128, 2760, 1949, 3074, 615, 2221, 1691, 3226, 1351, 1329, 556, 1060, 898, 1080, 2494, 2379, 3148, 737, 1412, 3290, 1594, 1314, 959, 3192, 1326, 932, 1103, 937, 1670, 2017, 1403, 1282, 2949, 2940, 2557, 940, 2561, 1248, 2385, 541, 2382, 1309, 831 };
        int tax = 4;
        assertEquals(3905, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case14() {
        int[] buyOffers = { 9219, 8265, 6797, 8299, 9340, 8902, 7343, 7881, 9173, 8070, 8558, 7293, 9210, 7457, 8181, 9304, 8930, 7676, 9332, 7640, 7588, 6772, 8568, 8360 };
        int[] sellOffers = { 7953, 7383, 7410, 9571, 9315, 9107, 7422, 8638, 7568, 9183, 7895, 8413, 8665, 7935, 8510, 9116, 7413, 8814, 8919, 9144, 7858, 7045, 8036, 8294, 9575, 6891, 6531, 7639, 6821, 7979, 7367, 7413, 7621, 8681, 7322, 8095, 7562, 9467, 8145, 7900, 8661, 9642, 6924, 8357, 7479, 7656, 9625, 7982 };
        int tax = 17;
        assertEquals(4650, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case15() {
        int[] buyOffers = { 5935 };
        int[] sellOffers = { 5903, 6599, 6802, 7228, 7031, 5932, 7244, 7180, 6098, 5784, 7070, 5974, 6078, 6625, 7189, 6992, 6528, 6928, 6259, 6070, 5964, 6167, 6842, 6111, 6609, 5815, 6446, 6085, 7328, 6360, 6040, 6489, 5872, 6613, 5915, 5985, 6666, 6605 };
        int tax = 15;
        assertEquals(0, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case16() {
        int[] buyOffers = { 3755, 3345, 3555, 4221, 4331, 4256, 2765, 2682, 3835, 3790, 4008, 3935, 3791, 3031, 2494, 3152, 4372, 4717, 3442, 3896, 3241, 4011, 4610, 3000, 3445, 4764, 4193, 4689, 4751, 3100, 3814, 3590, 3062 };
        int[] sellOffers = { 3435, 3006, 2929, 2634, 4617, 2724, 3843, 3013, 3073, 2535, 3642, 3790, 3159, 4257, 4636, 2587, 2766, 2770, 3918, 3584, 3257, 3954, 4252, 3771, 3448, 4216, 2617, 3566, 3738, 4653, 4578, 3117, 4190, 4389, 4770, 3865 };
        int tax = 5;
        assertEquals(17975, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case17() {
        int[] buyOffers = { 7612, 7973, 4428, 4829, 5607, 7553, 6522, 5715, 5166, 4448, 5932, 5942, 7170, 6291, 4719, 4858, 7694, 5359, 5326, 7596, 4754, 7677, 4332, 4376, 5005, 4764, 5705, 5786 };
        int[] sellOffers = { 5888, 4700, 6804, 7706, 5870, 5457, 5466, 7309, 4667, 5939, 4744, 6119, 6837, 4940, 4500, 6411, 7026, 7272, 7593, 4530, 4772, 7556, 7782, 5253, 5354, 5316 };
        int tax = 7;
        assertEquals(18278, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case18() {
        int[] buyOffers = { 2653, 2685, 2749, 2790, 2561, 3143, 2412, 3261, 2718, 2802, 3317, 2687, 2616, 3087, 2717, 3303, 2486, 3418, 2997, 3079, 3547, 3502, 3130 };
        int[] sellOffers = { 2354, 3528, 2861, 2826, 3551, 2868, 3628, 3241, 3510, 2905, 3580, 3416, 3452, 2862, 2834, 3548 };
        int tax = 7;
        assertEquals(2338, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case19() {
        int[] buyOffers = { 2028, 4258, 3683, 2180, 3075, 4651, 4253, 2173, 1990, 2326, 4997, 1721, 2376, 3979, 1550, 2981, 1618, 3591, 4923, 1751, 1815, 2597, 4384, 2025, 2253, 2650, 1721, 3992, 3025, 2058, 2636, 2550, 4206, 3742, 4894, 2669, 1900, 1789, 2924, 2688, 2966, 2806, 2315, 2715, 2361, 3222, 2267, 4362, 4282 };
        int[] sellOffers = { 2240, 1813, 3084, 1964, 1561, 1690, 2998, 2476, 3624, 4914, 2731, 2763, 5028, 2920, 4360, 4049, 2195, 3042, 3459, 1825, 4274, 4362, 3323, 3382, 1572, 3911, 1678, 2292, 2657, 2052, 3717, 4606, 4254, 1558, 2397, 4294, 3785, 2029, 2688, 3748, 4205, 2171, 4107, 3114 };
        int tax = 0;
        assertEquals(37118, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case20() {
        int[] buyOffers = { 8022, 6586, 3868, 7832, 4979, 1956, 6560, 5166, 5206, 8655 };
        int[] sellOffers = { 3402, 6240, 6448, 9120, 7908, 7122, 3694, 3384, 3918, 8614, 3337, 1903, 5037, 6267, 2391, 4969, 7155, 4291, 5356, 7770 };
        int tax = 19;
        assertEquals(16875, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case21() {
        int[] buyOffers = { 3490, 2693, 3473, 3535, 3199, 3458, 1714, 2565, 2702, 1502 };
        int[] sellOffers = { 2879, 1578, 1253, 2959, 1304, 1703, 1075, 1601, 2941 };
        int tax = 14;
        assertEquals(8566, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case22() {
        int[] buyOffers = { 6797, 5123, 5037, 7186, 6595, 6163, 6064, 5753, 6588, 6346, 5391, 6615, 6388, 6242, 5646, 5765, 6488, 6058, 5811, 6957, 6989, 5555, 7089, 7038, 5509, 6294, 4985, 6090, 6435, 6568, 5049, 6336, 6804, 7155, 7154, 5742, 6377, 5747, 6449, 6737, 5358, 6152, 5866, 5395, 5105, 6149, 4965, 6913, 5879 };
        int[] sellOffers = { 5954, 5334, 5405, 6241, 6083, 7154, 6975, 5964, 6505, 6514, 6609, 5409, 6179, 5900, 5363, 7021, 6632, 6882, 5962, 5943, 6553, 4943, 5387, 5603, 6170, 7113, 6503, 5551, 5328, 5926, 7067, 5932, 6028, 6550, 7157, 6257 };
        int tax = 14;
        assertEquals(6107, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case23() {
        int[] buyOffers = { 5016, 7212, 7613, 1590, 2942, 5155, 5898, 8113, 2001, 2348, 671, 5167, 7524, 2467, 4294, 3628, 4480, 5872, 5230, 3732, 4637, 6419, 1431, 6335, 1652, 3005, 2125, 2193, 2183, 5856, 1795, 5441, 2079, 7114, 2290, 4025, 5943, 1695 };
        int[] sellOffers = { 2407, 5602, 1350 };
        int tax = 3;
        assertEquals(13195, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case24() {
        int[] buyOffers = { 193, 169, 185, 172, 190, 194, 238, 237, 183, 222, 183, 190, 187, 221, 193, 208, 148, 227, 248, 138, 238, 176, 237, 137, 231, 148, 175, 142, 190, 216, 195, 124, 191, 136, 201, 190, 251, 165, 128, 238, 183, 229 };
        int[] sellOffers = { 164, 128, 235, 229, 176, 209, 205, 203, 205, 243, 167, 199, 203, 176, 138, 195, 249, 182, 168, 207, 250, 243, 124, 136, 231, 223, 212, 228, 132, 219, 222, 153 };
        int tax = 4;
        assertEquals(880, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case25() {
        int[] buyOffers = { 1247, 1142, 1105, 901, 1320, 1423, 1324, 902, 1418, 1371, 1448, 1504, 1171, 1065, 922, 1560, 1439, 935, 1513, 970, 1575, 1295, 1414, 947, 1222, 942, 1361, 1077, 1438, 1079, 1117, 949, 1101, 1467, 997, 1573, 1278, 1126, 1331, 975, 1215, 959, 1437 };
        int[] sellOffers = { 1034, 1280, 1431, 939, 1013, 913, 1414, 1040, 909, 1267, 1247, 1283, 970, 1167, 989, 918, 1392, 1382, 917, 1326 };
        int tax = 9;
        assertEquals(4162, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case26() {
        int[] buyOffers = { 3059, 3960, 5719, 6451, 7628, 3769, 4179, 7507, 3264, 7427, 5689, 3295, 4163, 6878, 4623, 5568, 6431, 7289, 3807, 5483, 6094, 4638, 2989, 4822, 5568, 8174, 3349, 4911, 3449, 4929, 4188, 7015, 4419, 3729, 8105, 4114, 3646, 4072, 3267, 7881, 5629, 7241, 3086, 6198, 5121, 7837, 6884 };
        int[] sellOffers = { 6363, 7273, 3232, 4421, 6015, 6452, 7167, 7311, 4431, 5967, 3021, 3828, 6914, 3119, 5551, 5960, 4015, 6203, 7466, 7009, 6800, 3902, 5639, 4133, 7676, 7657, 5351, 5325, 8156, 5031, 7486, 8227, 6061, 3005, 3451, 6830, 4808, 6247, 7621, 4719, 6948, 3279, 7444 };
        int tax = 17;
        assertEquals(32038, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case27() {
        int[] buyOffers = { 1107, 1003 };
        int[] sellOffers = { 932, 1247, 1226, 1218, 931, 964, 1076, 1238, 1102, 972, 1282, 1010 };
        int tax = 2;
        assertEquals(205, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case28() {
        int[] buyOffers = { 4655, 6360, 5168, 4196, 5318, 5789, 6215, 6385 };
        int[] sellOffers = { 5083, 4847, 6388, 5726, 4551, 5640, 4503, 5828, 4579, 6005, 5811, 5891, 5154, 4459, 6029, 6387, 4297, 6252, 4442, 5037, 6069, 4717, 5464, 5127, 5420, 5204, 5841, 6421, 4439, 5533, 5536, 5558, 5200, 6175, 5464, 5608, 5262, 4517 };
        int tax = 10;
        assertEquals(5058, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case29() {
        int[] buyOffers = { 6686, 6050, 6803, 6346, 6430, 6848, 6018, 6171, 6559, 6758, 6366, 5976, 6899, 6768, 6028, 6750, 6112, 6532, 6123, 6605, 6175, 6083, 6331, 6918, 6995, 6963, 6827, 6858, 6282, 6787, 6444, 6037, 5962, 6832, 6541, 6940, 6102, 6814, 6038, 6203, 6137 };
        int[] sellOffers = { 6530, 6939, 6945, 6670, 6269, 6707, 6327, 6349, 6636, 6541, 6078 };
        int tax = 2;
        assertEquals(2753, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case30() {
        int[] buyOffers = { 7471, 7334, 7233, 7384, 7226, 7561, 7469, 7499, 7277, 7217, 7292, 7441, 7262, 7199, 7166, 7287, 7325, 7343, 7407, 7457, 7442, 7461, 7548, 7215, 7262, 7351, 7447, 7420, 7312, 7491, 7179, 7282, 7586, 7349, 7305, 7364, 7412, 7287, 7455, 7174, 7222 };
        int[] sellOffers = { 7179, 7326, 7476, 7443, 7313, 7374, 7449, 7326 };
        int tax = 9;
        assertEquals(0, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case31() {
        int[] buyOffers = { 2570, 2623, 2602, 2635, 2613, 2630, 2580, 2610, 2657, 2606, 2578, 2595 };
        int[] sellOffers = { 2636, 2618, 2591, 2577, 2574, 2674, 2569, 2628, 2612, 2657, 2673, 2606, 2667, 2570, 2627, 2588, 2674, 2604, 2590, 2622, 2626, 2624, 2674, 2678, 2675, 2661, 2603, 2648, 2597, 2617, 2585, 2640, 2628, 2611 };
        int tax = 20;
        assertEquals(0, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case32() {
        int[] buyOffers = { 5625, 5796, 5621, 5645, 5672, 5764, 5667, 5642, 5807, 5803, 5568, 5567, 5652, 5770, 5754, 5666, 5641, 5611, 5639, 5581, 5755, 5731, 5688, 5745, 5750, 5682, 5707 };
        int[] sellOffers = { 5700, 5614, 5779, 5665, 5796, 5786, 5675, 5761, 5695, 5646, 5739, 5592, 5773, 5800, 5669, 5609, 5651, 5601, 5732, 5737, 5653, 5573, 5700, 5782, 5800, 5643, 5789, 5730, 5588, 5805, 5683, 5779, 5779, 5736 };
        int tax = 10;
        assertEquals(0, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case33() {
        int[] buyOffers = { 6817, 6688, 6635, 6602, 6810, 6697, 6802, 6753, 6701, 6605, 6720, 6626, 6631, 6624, 6713, 6721, 6792, 6647, 6635, 6770, 6633, 6758, 6626, 6709, 6749, 6610, 6602, 6619, 6820, 6685, 6598, 6726, 6737, 6776, 6624, 6827, 6618, 6603, 6595, 6813, 6642, 6804, 6653, 6680, 6646, 6730 };
        int[] sellOffers = { 6835, 6808, 6642, 6649, 6751, 6613, 6711, 6641, 6701, 6624, 6742, 6642, 6837 };
        int tax = 9;
        assertEquals(0, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case34() {
        int[] buyOffers = { 3463, 3187, 3655, 2978, 4001, 3303, 4904, 3070, 3068, 3599, 2864, 4540, 3180, 3848, 3977, 3879, 2838, 3946, 4157, 4887, 3009, 3020, 4856, 4468, 2921, 3590, 3242, 2927, 3220, 4178, 4777, 4667, 2779, 4443, 2874, 3686, 3440, 4003, 4537, 4610, 3110, 3919, 2931, 3522, 3468 };
        int[] sellOffers = { 3564, 4685, 3306, 4349, 3319, 4887, 4414, 4671, 3071, 3326, 3858, 3619, 3290, 4292 };
        int tax = 9;
        assertEquals(7029, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case35() {
        int[] buyOffers = { 2842, 2089, 1877, 2333, 2448, 932, 2523, 1949, 1522, 978 };
        int[] sellOffers = { 2209, 2230, 1958, 995 };
        int tax = 15;
        assertEquals(1608, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case36() {
        int[] buyOffers = { 2151, 3115, 1238, 1499, 2463, 2115, 1106, 2948, 2587, 3436, 3131, 3384, 2401, 2092, 3058, 1993, 1868, 2630, 2763, 1762, 2978, 2488, 2256, 3364, 1237, 3641, 1379, 3081, 2920, 1872, 3086, 3613, 965, 2880, 3625, 1843, 1144, 3469 };
        int[] sellOffers = { 2072, 1962, 1085, 1570, 947, 2503, 1790, 1390, 2447, 1674, 1268, 1246, 1698, 2527, 953, 3628, 1758, 1010 };
        int tax = 3;
        assertEquals(24966, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case37() {
        int[] buyOffers = { 2204, 5999, 6622, 5488, 3481, 3088, 4599, 6238, 2748, 4910, 4245, 4603, 2991, 2174, 2763, 4867, 5581, 6727, 2370, 5830, 3582, 2691, 5841, 4190, 2002, 5452, 4290, 2883, 4525, 5314, 5182, 6954 };
        int[] sellOffers = { 2633, 3072, 2609, 3513, 5062, 6435, 2097, 5437, 5945, 6026, 5469, 1991, 4173, 6132, 7172, 3887, 2963, 2842, 1772, 3950, 7420, 2585, 3699, 2127, 4290, 5900, 4894 };
        int tax = 19;
        assertEquals(25889, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case38() {
        int[] buyOffers = { 8774, 7461, 7489, 9709, 8583, 9716, 3709, 8266, 8655, 8315, 6424, 3901, 4706, 6301, 7639, 8064, 4016, 6845, 5962, 4687, 4458, 9524, 3838, 3896, 6110, 4877, 5532 };
        int[] sellOffers = { 4111, 5853, 9440, 4534, 7981, 4471, 6979, 7716, 5867, 5624, 8901, 7085, 7906, 4926, 8661, 9697, 8017, 8904, 9602, 4895, 4680, 9433, 5967, 7196, 9389, 4493, 5202, 6024, 5342, 7936, 5878, 8321, 9306, 5596, 6914, 4298, 5933, 4386, 7089, 9590, 9659, 7667, 4995, 5976, 9379, 9624, 4218, 5878, 5992 };
        int tax = 12;
        assertEquals(35471, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case39() {
        int[] buyOffers = { 7242, 7492, 7729, 8324, 6694, 6833, 7942, 8192, 6599, 7758, 6944, 8423, 7489, 7057, 8491, 8189, 8347, 7490, 8290, 6701, 8423, 8192, 6810, 6867, 8302, 7202, 7200, 8077, 7359, 6782, 6997, 7274, 7947 };
        int[] sellOffers = { 6599, 8503, 6787, 8421, 7209, 8582, 7717, 7651, 8574, 7381, 7523, 8543, 7973, 7535, 7603, 8258, 7272, 6589, 6827, 8330, 7600, 7771, 8186, 8126, 8433, 8030, 7599, 6573, 6914, 8137, 7657, 8557, 7195, 8118, 6719, 7555 };
        int tax = 6;
        assertEquals(9715, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case40() {
        int[] buyOffers = { 5193, 4951, 6213, 4897, 2206, 7063, 5159, 6035, 4245, 6138, 3906, 3364, 6278, 2336, 6411, 6476, 3723, 4489, 3561, 5746, 6150, 2663, 4004, 5784, 5367, 7074, 5080, 4295, 4499, 4059, 3849, 5473, 4533, 5276, 2306, 6537, 5429 };
        int[] sellOffers = { 6644, 4787, 3955, 2854, 5299, 3530, 2767, 6353, 5836, 5801, 3853, 4938, 2776, 3974, 6378, 4080, 6540, 3756, 5435, 3979, 2159, 2384, 5443, 5587 };
        int tax = 1;
        assertEquals(36169, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case41() {
        int[] buyOffers = { 4122, 4537, 4779, 5086, 4104, 3916, 4538, 3943, 4789, 4478, 4193, 4087, 3931, 4715, 4293, 4521, 4963, 4381, 4376, 4290, 3942, 4899, 3995, 4867, 4436, 4096, 4082, 4790, 4395, 4609, 4896, 4590, 5002, 4811, 4867, 4107, 4424, 4596, 4274, 3990, 4039, 4392 };
        int[] sellOffers = { 4636, 4422, 4919, 3924, 4860, 4958, 4613, 5059, 5012 };
        int tax = 0;
        assertEquals(2391, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case42() {
        int[] buyOffers = { 2813, 3859, 2204, 4853, 3755, 4952, 3925, 3035, 3282, 3691, 4947, 5181, 2181, 4508, 4728, 2880, 3522, 3998, 2678, 2803, 3589, 4545, 2059, 5124, 4612, 4978, 4726, 2194, 5219, 2800 };
        int[] sellOffers = { 5065, 1995, 2976, 3767, 2837, 3697, 4835, 4341, 4416, 4903, 2858, 3554, 4469, 2871, 3546, 3536, 2300, 3924, 3460, 4452, 3221, 3389, 3008, 3283, 4008, 3595, 2809, 2615, 2191, 3857, 3628, 3371, 3842, 2218, 4010, 3674, 3846, 4578, 2851, 3697, 2153, 2106 };
        int tax = 14;
        assertEquals(21332, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case43() {
        int[] buyOffers = { 6526, 6565, 6757, 6587, 6672, 6449, 6599, 6619, 6678, 6639, 6846, 6688, 6476, 6714, 6842, 6670, 6593, 6591, 6709, 6538, 6494, 6512, 6868, 6639, 6553 };
        int[] sellOffers = { 6427 };
        int tax = 1;
        assertEquals(373, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case44() {
        int[] buyOffers = { 1059, 1195, 1230, 842, 1414, 988, 640, 1514, 1429, 631, 1166, 780, 1328, 1460, 746, 1474, 1500, 1320, 751, 1150, 725, 1264, 1528, 919, 653, 664, 1488, 1096, 746, 753 };
        int[] sellOffers = { 728, 762, 1521, 1011, 1431, 1237 };
        int tax = 5;
        assertEquals(1992, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case45() {
        int[] buyOffers = { 133, 136, 188, 145, 152, 138, 209, 158, 124, 131, 194, 209, 170 };
        int[] sellOffers = { 168, 215, 188, 166, 136, 161, 137, 121, 130, 183, 144, 223, 121, 155, 124, 220, 220, 177, 144, 130, 185, 189, 145, 180, 138, 214, 203, 126, 118, 124, 196, 216, 201, 147, 158, 191 };
        int tax = 20;
        assertEquals(172, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case46() {
        int[] buyOffers = { 5518, 7844, 5733, 6680, 8138, 6264, 5151, 6118, 5952, 6073, 8204, 5311, 5879, 5915, 6175, 8640 };
        int[] sellOffers = { 5370, 5394, 4642, 4948, 4708, 6455, 4835, 4578, 6053, 7376, 5701, 8450, 8756, 8483, 6073, 5253, 5713, 7867, 5090, 7709, 4961, 7328, 4594, 8207, 4927, 6674, 5754, 5996, 5119, 8591, 5877, 8684, 6154, 6661, 5410, 8067, 7185, 7156, 7236, 8815, 5074, 7035 };
        int tax = 10;
        assertEquals(14970, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case47() {
        int[] buyOffers = { 2520, 2470, 2486, 2543, 2502, 2414 };
        int[] sellOffers = { 2631, 2418, 2470, 2581, 2544 };
        int tax = 20;
        assertEquals(0, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case48() {
        int[] buyOffers = { 6777, 1463, 6163, 5234, 5734, 6580 };
        int[] sellOffers = { 2015, 6924, 1849, 4989, 7345, 2154, 4712, 1235, 3387, 3231, 6211, 3154, 1859, 5203, 2421, 3421, 4204, 6129, 1592, 2787, 3661, 1817, 2663, 5614, 5633, 4185, 1579, 6696, 5928, 5774, 4078, 7219, 2157, 5430, 4460 };
        int tax = 5;
        assertEquals(20894, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case49() {
        int[] buyOffers = { 1307, 873, 771, 1207 };
        int[] sellOffers = { 1402, 785, 990, 1100, 1083, 1006, 1069, 950, 1381, 735, 1123, 979, 1197, 1318, 948, 919, 1299, 1220, 1260, 869, 1393, 1021 };
        int tax = 2;
        assertEquals(944, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case50() {
        int[] buyOffers = { 8244, 8396, 8459, 8376, 8543, 8523, 8330, 8569, 8239, 8605, 8779, 8357, 8560, 8711, 8373, 8747, 8333, 8347, 8626, 8568, 8738, 8275 };
        int[] sellOffers = { 8713, 8698, 8403, 8257, 8686, 8683, 8235, 8510, 8559, 8257, 8291, 8759, 8631, 8580, 8241 };
        int tax = 11;
        assertEquals(0, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case51() {
        int[] buyOffers = { 2273, 2231, 2184, 2166, 2263, 2332, 2294, 2199, 2243, 2169, 2161, 2216, 2250, 2185, 2335, 2213, 2244, 2299, 2211, 2182, 2243, 2170, 2331, 2167, 2211, 2231, 2189, 2169, 2246, 2314, 2198 };
        int[] sellOffers = { 2175, 2311, 2259, 2162, 2214, 2242, 2249, 2278, 2172, 2204, 2169, 2234, 2163, 2301, 2321, 2307, 2252, 2251, 2310, 2188, 2276, 2221, 2241, 2193, 2317, 2215, 2247, 2287, 2320, 2322, 2213, 2298, 2207, 2254, 2159, 2203 };
        int tax = 1;
        assertEquals(955, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case52() {
        int[] buyOffers = { 1662, 2297, 1408, 2112, 1929, 2245, 2528, 1646, 2237, 2612, 2053, 1424, 2653, 1531, 1332, 1424, 1498, 2426, 2699, 2030, 2194, 1780, 1352, 1728, 1848, 1558, 2620, 2747, 2526, 2237, 1754, 1454, 2353, 1326, 1486 };
        int[] sellOffers = { 1912, 2338, 1676, 1984, 2364, 1480, 2522, 2350, 1754, 1836, 2297, 2462, 1624 };
        int tax = 0;
        assertEquals(6263, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case53() {
        int[] buyOffers = { 4071, 4935, 5686, 4730, 6091, 4802, 5635, 5381, 4094, 5286 };
        int[] sellOffers = { 3975, 4512, 3772, 4640, 5240, 3877, 5240, 4737, 5977, 4206, 3584, 4654, 5947, 5730 };
        int tax = 4;
        assertEquals(7770, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case54() {
        int[] buyOffers = { 1448, 1465, 1399, 1140, 1625, 1591, 1302, 1180, 1717, 1148, 1632, 1248, 1226, 1310, 1367, 1368, 1607, 1269, 1301, 1281, 1577, 1604, 1417, 1659, 1543, 1337, 1186 };
        int[] sellOffers = { 1369, 1399, 1290, 1459, 1453, 1331, 1339, 1553, 1176, 1569, 1521, 1222, 1690, 1228, 1244, 1333, 1572, 1287, 1325, 1280, 1232, 1365, 1285, 1520, 1309, 1470 };
        int tax = 4;
        assertEquals(2937, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case55() {
        int[] buyOffers = { 6848, 3102, 3716, 3008, 8411, 6367, 7038, 3605, 1592, 3886 };
        int[] sellOffers = { 3206, 5564, 3820, 5468, 1612, 3789, 2499, 7993 };
        int tax = 12;
        assertEquals(14120, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case56() {
        int[] buyOffers = { 4109, 4252, 4228, 4039, 4263, 4258, 4151, 4311, 4211, 4014, 4244, 4077, 4020, 4261, 4172, 4046, 4218, 4304, 4052, 4044, 4214, 4135, 4243, 4161, 4024, 4010, 4290, 4098, 4058, 4178, 4300, 4115, 4153, 4041, 4028, 4151, 4189, 4118, 4010, 4298, 4195, 4200 };
        int[] sellOffers = { 4098, 4293, 4209, 4191, 4193, 4208, 4163, 4302, 4269, 4146, 4127, 4239 };
        int tax = 15;
        assertEquals(0, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case57() {
        int[] buyOffers = { 1382, 2037, 1758, 2122, 1476, 1973 };
        int[] sellOffers = { 1609, 1354, 1629, 2037, 2141, 1942, 2141, 2202, 2414, 2274, 2169, 2334, 1600, 2595, 1363, 1752 };
        int tax = 3;
        assertEquals(1729, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case58() {
        int[] buyOffers = { 2485, 1376, 2815, 2883, 2480, 3063, 1064, 1280, 2940, 1751, 965, 1063, 1638, 2072, 648, 1278, 2108, 2370, 1743, 1846, 528, 2362, 1199, 2179, 1625, 2958, 1101, 2470 };
        int[] sellOffers = { 1073, 2191, 2838, 1378, 891, 1915, 1691, 2611, 2769, 1350, 2517, 2091, 1409, 2060, 1095, 1610, 1756, 1380, 1734, 2302, 1734, 1852, 2082, 881, 1737, 1307, 2840 };
        int tax = 14;
        assertEquals(11012, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case59() {
        int[] buyOffers = { 5557, 4276, 4543, 4834, 4129, 4783, 3942, 3672, 3977, 4444, 3432, 4080, 4568, 3951, 3936, 3743, 5259, 4994, 3524, 4497, 3557 };
        int[] sellOffers = { 4506, 4206, 3399, 4392, 3912, 3988, 3323, 4915, 3783, 4976, 3440, 5434, 3431, 3581, 4098, 3436, 4386, 5423, 3507, 5072, 4511, 4085, 3778 };
        int tax = 8;
        assertEquals(8350, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case60() {
        int[] buyOffers = { 5176, 3843 };
        int[] sellOffers = { 5326, 7168, 7184, 5767, 4231, 5202, 5686, 6462, 3747, 3460, 5016, 7192, 4626, 4156, 5836, 4827, 7031, 4017, 6127, 4550, 5450, 5829, 3993, 3826, 4033, 3729, 5281, 4447 };
        int tax = 0;
        assertEquals(1830, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case61() {
        int[] buyOffers = { 1238, 1436, 1197, 1454, 1343, 1239, 1412, 1413, 1266, 1242, 1246, 1273, 1272, 1317, 1327, 1231, 1220 };
        int[] sellOffers = { 1291, 1214, 1404, 1393, 1261, 1435, 1220, 1337, 1265, 1213, 1432, 1306, 1288, 1346, 1269, 1203, 1379, 1297, 1240, 1399, 1450, 1257, 1442, 1426, 1246 };
        int tax = 19;
        assertEquals(0, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case62() {
        int[] buyOffers = { 4631, 5103, 2778, 4004, 4293, 4542, 2383, 4616, 3572, 3275, 4032, 3802, 3258, 3915, 4207, 3953, 5291, 4623, 3557, 2473, 2475, 5032 };
        int[] sellOffers = { 2834, 4444, 4440, 5422, 3556, 3483, 4012, 2569, 5347, 2763, 2774, 2514, 5406, 2932, 3978, 4503, 5426, 4928, 2436, 5273, 3841, 4869, 5321, 2917, 2993, 4507, 3538, 2588, 4069, 3530, 2884, 2574, 4121, 3570, 2517, 2716, 5162 };
        int tax = 15;
        assertEquals(14734, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case63() {
        int[] buyOffers = { 6698, 5685, 7072, 5261, 5572, 7669, 5074, 7903, 6953, 7179, 7331, 5427, 7813, 5029, 7832, 5310, 6652, 6103, 6051, 4467 };
        int[] sellOffers = { 7251, 5487, 4391, 6276, 7531, 7789, 4594 };
        int tax = 0;
        assertEquals(10549, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case64() {
        int[] buyOffers = { 5160, 2257, 1002, 4580, 4192, 4995, 3752, 3174, 3800, 2305, 3345, 952 };
        int[] sellOffers = { 1971, 1213, 4349, 4470, 3816, 2729, 3670, 4073, 1028, 2220, 890, 1314, 5146, 5046, 1066, 4017, 3354, 3385, 2149, 4278, 3335, 4844, 792, 3599, 1948, 1678, 4137, 3758, 3445, 1016, 4084, 2338, 5184, 4966, 1326, 3197, 4429, 3831, 5058, 2198 };
        int tax = 5;
        assertEquals(23415, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case65() {
        int[] buyOffers = { 6436, 6361, 4467, 6744, 5873, 4326, 4238, 5657, 5812, 6215, 6773, 4639, 5510, 4709, 4426, 6169, 5708, 5760, 6332, 4114, 6461, 6409, 4584, 4478, 6724, 4535, 6802, 4455, 4095, 5007, 6392, 4367, 4221, 4980, 5559, 5331 };
        int[] sellOffers = { 5879, 4099, 6130, 5056, 5472, 4519, 5334, 5704, 6459, 5575, 4714, 5268, 6074, 4138, 6853, 6562, 6433, 5599, 6513, 5715, 4248, 4781, 5066, 5872, 6808, 6691, 4917, 5279, 5893, 5830, 5713, 6802, 5961, 4489, 5402, 5953, 5899, 6105, 6257, 6076 };
        int tax = 10;
        assertEquals(13467, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case66() {
        int[] buyOffers = { 7192, 5104, 7470, 7166, 6836, 5555, 5663, 4445, 6653, 7394, 5870, 4305, 7197, 6859, 7000, 4475, 4558, 5832, 4110, 5139, 5874, 4262, 6951, 8003, 6015, 6557, 6418, 6862, 7516, 7321, 6952, 6473, 6587, 4720, 4641, 7409, 7344, 6668, 4750, 7879, 7681, 5489 };
        int[] sellOffers = { 5559, 6766, 6305, 5837, 6129, 4218, 4599, 4506, 6002, 5298, 5682, 4495, 7208, 7637, 5571, 7751, 7304, 5972, 7217, 7546, 6929, 5636, 4332, 7796, 6531, 5778, 5992, 7679, 5070, 5343, 6387, 7909, 8020, 7915, 6425, 5810, 7218, 4406, 7270, 6962, 4275, 7684, 7221, 6502 };
        int tax = 4;
        assertEquals(34402, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case67() {
        int[] buyOffers = { 2345, 1887, 1817, 2068, 1843, 2171, 2143, 1960, 2340, 1913, 1960, 2297, 2010, 2098, 2232, 1974, 1814, 1871, 2015 };
        int[] sellOffers = { 2041, 2021, 1853, 2264, 2117, 2307, 2270, 2339, 1835, 1769 };
        int tax = 7;
        assertEquals(1093, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case68() {
        int[] buyOffers = { 2589, 1338, 1990, 3381, 6907, 6789, 4016, 7234, 1374, 1864, 2406, 6415, 2806, 6771, 4616 };
        int[] sellOffers = { 4316, 5568, 2758, 2430, 1828, 2153, 4989, 7301, 6934, 1278, 2526, 4172, 6999, 3495, 4069, 7795, 6284, 5684, 2453, 5179, 5451, 7856, 6522, 7168 };
        int tax = 2;
        assertEquals(26470, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case69() {
        int[] buyOffers = { 696, 1185, 804, 1026, 730, 888, 600, 852, 1315, 1294, 694, 558, 1298, 860, 728, 1045, 743, 833, 1264, 1088, 1086, 897, 783, 1241, 606, 1110, 1274, 661 };
        int[] sellOffers = { 682, 1344, 1242, 1118, 915, 1151 };
        int tax = 8;
        assertEquals(903, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case70() {
        int[] buyOffers = { 2412, 2259, 2330, 2420, 2416, 2394, 2363, 2226, 2423 };
        int[] sellOffers = { 2300, 2201, 2295, 2236, 2314, 2258, 2267, 2192, 2289, 2372, 2228, 2446, 2438, 2223, 2326, 2314, 2317, 2299, 2403, 2440, 2325, 2221, 2354, 2333, 2326, 2407, 2216, 2174, 2252, 2326, 2299, 2370, 2335, 2282, 2356, 2363, 2225, 2267, 2287, 2168, 2351, 2326, 2284, 2206 };
        int tax = 16;
        assertEquals(0, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case71() {
        int[] buyOffers = { 6169, 6533, 4288, 8505, 8314, 7086, 7561, 5951, 5605, 7093, 5035, 6040, 8066, 4470, 7562, 8744, 4294, 5781, 5002, 4364, 6756, 4391, 4772, 4600, 5040, 4820, 7054, 5857 };
        int[] sellOffers = { 8461, 4966, 6611, 5778, 8829, 4559, 7404, 5683, 5084, 5437, 7147, 5451, 6673, 7378, 4565, 7179, 6693, 5003, 8661, 6032, 4915, 4767, 4759, 7624, 7338, 5011, 7790, 8816, 4761, 4470, 6863, 7244, 8003, 7869, 8128, 8248, 4381, 7095, 6202, 6059, 8110 };
        int tax = 15;
        assertEquals(18792, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case72() {
        int[] buyOffers = { 101 };
        int[] sellOffers = { 100 };
        int tax = 0;
        assertEquals(1, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case73() {
        int[] buyOffers = { 1000, 1024 };
        int[] sellOffers = { 990, 1011 };
        int tax = 0;
        assertEquals(34, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case74() {
        int[] buyOffers = { 100, 100, 100, 100, 1000 };
        int[] sellOffers = { 100, 100, 100, 100, 100 };
        int tax = 0;
        assertEquals(900, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case75() {
        int[] buyOffers = { 5016, 7212, 7613, 1590, 2942, 5155, 5898, 8113, 2001, 2348, 671, 5167, 7524, 2467, 4294, 3628, 4480, 5872, 5230, 3732, 4637, 6419, 1431, 6335, 1652, 3005, 2125, 2193, 2183, 5856, 1795, 5441, 2079, 7114, 2290, 4025, 5943, 1695 };
        int[] sellOffers = { 2407, 5602, 1350 };
        int tax = 3;
        assertEquals(13195, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case76() {
        int[] buyOffers = { 1002, 1001 };
        int[] sellOffers = { 1000, 1000 };
        int tax = 0;
        assertEquals(3, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case77() {
        int[] buyOffers = {  };
        int[] sellOffers = {  };
        int tax = 1;
        assertEquals(0, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case78() {
        int[] buyOffers = {  };
        int[] sellOffers = { 1000 };
        int tax = 0;
        assertEquals(0, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case79() {
        int[] buyOffers = { 10000, 10000, 10000, 10000, 10000 };
        int[] sellOffers = { 100, 100, 100, 100, 100 };
        int tax = 1;
        assertEquals(49000, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case80() {
        int[] buyOffers = { 199, 200 };
        int[] sellOffers = { 190 };
        int tax = 4;
        assertEquals(2, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case81() {
        int[] buyOffers = { 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000 };
        int[] sellOffers = {  };
        int tax = 10;
        assertEquals(0, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case82() {
        int[] buyOffers = { 120 };
        int[] sellOffers = { 100 };
        int tax = 20;
        assertEquals(0, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case83() {
        int[] buyOffers = { 400, 200 };
        int[] sellOffers = { 100 };
        int tax = 4;
        assertEquals(284, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case84() {
        int[] buyOffers = { 8932, 6456, 3484, 7470, 823, 9449, 3029, 379, 2516, 4240, 3371, 7099, 9799, 7765, 4414, 1250, 7042, 1584, 9764, 8372, 1827, 5411, 739, 1338, 7191, 9269, 2675, 5465, 1068, 4275, 4202, 5598, 2865, 9145, 4596, 2041, 1404, 8910, 107, 289, 7789, 9498, 440, 6254, 6907, 9936, 7496, 830, 4823, 9476 };
        int[] sellOffers = { 9466, 9150, 4721, 4955, 6962, 4072, 1906, 6274, 9687, 1011, 8227, 4374, 9054, 6642, 2770, 1617, 4869, 9587, 4072, 7618, 6375, 6309, 7403, 6871, 1245, 1203, 9625, 864, 3109, 1493, 5422, 3573, 7402, 3576, 9755, 2260, 9337, 8579, 8612, 193 };
        int tax = 19;
        assertEquals(78787, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case85() {
        int[] buyOffers = { 101 };
        int[] sellOffers = { 100 };
        int tax = 0;
        assertEquals(1, jingleringle.profit(buyOffers, sellOffers, tax));
    }

    @Test
    public void case86() {
        int[] buyOffers = { 1692, 3281, 862 };
        int[] sellOffers = { 2701, 2819, 2582, 1918, 638, 601, 1128, 2760, 1949, 3074, 615, 2221, 1691, 3226, 1351, 1329, 556, 1060, 898, 1080, 2494, 2379, 3148, 737, 1412, 3290, 1594, 1314, 959, 3192, 1326, 932, 1103, 937, 1670, 2017, 1403, 1282, 2949, 2940, 2557, 940, 2561, 1248, 2385, 541, 2382, 1309, 831 };
        int tax = 4;
        assertEquals(3905, jingleringle.profit(buyOffers, sellOffers, tax));
    }

}
