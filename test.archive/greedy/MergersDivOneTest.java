package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class MergersDivOneTest {
    double DELTA = 1.0e-09;
    MergersDivOne mergersdivone = new MergersDivOne();

    @Test
    public void case1() {
        int[] revenues = { 5, -7, 3 };
        assertEquals(1.5, mergersdivone.findMaximum(revenues), DELTA * 1.5);
    }

    @Test
    public void case2() {
        int[] revenues = { 10, -17 };
        assertEquals(-3.5, mergersdivone.findMaximum(revenues), DELTA * -3.5);
    }

    @Test
    public void case3() {
        int[] revenues = { 12, 12, 12, 12, 12 };
        assertEquals(12.0, mergersdivone.findMaximum(revenues), DELTA * 12.0);
    }

    @Test
    public void case4() {
        int[] revenues = { 0, 0, 0, 0, 0, 100 };
        assertEquals(50.0, mergersdivone.findMaximum(revenues), DELTA * 50.0);
    }

    @Test
    public void case5() {
        int[] revenues = { 10, -10, 100, -100, 1000, -1000 };
        assertEquals(491.25, mergersdivone.findMaximum(revenues), DELTA * 491.25);
    }

    @Test
    public void case6() {
        int[] revenues = { 768, -918, -13, -627, -371, -18, -477, -841, -210, -889, -980, -941, -119, -90, -435, -207, -915, -570, -481, -983, -534, -491, -783, -847, -927, -113, -63, -439, -401, -813, -146, -20, -837, -402, -398 };
        assertEquals(371.7478430605843, mergersdivone.findMaximum(revenues), DELTA * 371.7478430605843);
    }

    @Test
    public void case7() {
        int[] revenues = { 629, -615, -167, -808, -997, -836, -913, -928, -231, -405, -659, -70, -253, -596, -758, -565, -518, -818, -742, -74, -272, -191, -328, -758 };
        assertEquals(263.114745259285, mergersdivone.findMaximum(revenues), DELTA * 263.114745259285);
    }

    @Test
    public void case8() {
        int[] revenues = { 0, -303, -280, -195, -417, -70, -249, -73, -597, -138, -128, -732, -206, -212, -82, -138, -632, -731, -214, -849, -151, -170, -132, -904, -980, -312, -217, -135, -792, -223, -579, -452, -217, -155, -681, -670, -268, -417, -243 };
        assertEquals(-39.98993882029754, mergersdivone.findMaximum(revenues), DELTA * -39.98993882029754);
    }

    @Test
    public void case9() {
        int[] revenues = { 666, -975, -852, -547, -711, -520, -557, -690, -159, -824, -206, -268, -759, -901, -416, -501, -715, -85, -644, -529, -502, -408, -26, -795, -378, -714, -860, -798, -609, -35, -913, -416 };
        assertEquals(303.39946806710213, mergersdivone.findMaximum(revenues), DELTA * 303.39946806710213);
    }

    @Test
    public void case10() {
        int[] revenues = { 976, -987, -18, -436, -365, -49, -542, -12, -151, -624, -87, -156, -263, -720, -181, -780, -29, -419, -204, -9, -119, -642, -261, -819, -620, -630, -959, -109, -925, -209, -470, -366, -442, -89, -434, -210, -396, -580, -679, -533, -131 };
        assertEquals(479.95252511432045, mergersdivone.findMaximum(revenues), DELTA * 479.95252511432045);
    }

    @Test
    public void case11() {
        int[] revenues = { 583, -583, -92, -290, -895, -973, -528, -50, -399, -162, -121, -244, -713, -751, -911, -174, -775, -187, -904, -335, -850, -161, -676, -427 };
        assertEquals(249.14048671722412, mergersdivone.findMaximum(revenues), DELTA * 249.14048671722412);
    }

    @Test
    public void case12() {
        int[] revenues = { 384, -145, -188, -106, -771, -702, -240, -142, -882, -802, -505, -114, -53, -251, -501, -987, -341, -762, -92, -990, -41, -321, -17, -853, -138, -535, -675 };
        assertEquals(172.70534346997738, mergersdivone.findMaximum(revenues), DELTA * 172.70534346997738);
    }

    @Test
    public void case13() {
        int[] revenues = { 767, -254, -819, -872, -895, -90, -456, -187, -786, -454, -914, -488, -534, -278, -627, -311, -510, -203, -791, -501 };
        assertEquals(306.5642604827881, mergersdivone.findMaximum(revenues), DELTA * 306.5642604827881);
    }

    @Test
    public void case14() {
        int[] revenues = { 884, -173, -949, -996, -241, -854, -109, -487, -988, -161, -591, -613, -150, -396, -453, -930, -588, -734, -613, -133, -328, -240, -614, -588, -268, -177, -163, -516, -40, -402, -958, -565, -195, -650, -802, -264, -304, -967, -946, -843, -952, -560, -621, -943, -345, -697, -359 };
        assertEquals(400.12953003578025, mergersdivone.findMaximum(revenues), DELTA * 400.12953003578025);
    }

    @Test
    public void case15() {
        int[] revenues = { 727, -262, -271, -594, -778, -625, -903, -925, -104, -592, -65, -868, -602, -755, -610, -493, 0, -507, -952, -592, -437, -596, -927, -391, -827, -645, -134, -276 };
        assertEquals(335.6984081491828, mergersdivone.findMaximum(revenues), DELTA * 335.6984081491828);
    }

    @Test
    public void case16() {
        int[] revenues = { 25, -918, -13, -627, -371, -18, -477, -841, -210, -889, -980, -941, -119, -90, -435, -207, -915, -570, -481, -983, -534, -491, -783, -847, -927, -113, -63, -439, -401, -813, -146, -20, -837, -402, -398 };
        assertEquals(0.2478430605842732, mergersdivone.findMaximum(revenues), DELTA * 0.2478430605842732);
    }

    @Test
    public void case17() {
        int[] revenues = { 36, -167, -808, -997, -836, -913, -928, -231, -405, -659, -70, -253, -596, -758, -565, -518, -818, -742, -74, -272, -191, -328, -758, -351, 0, -303, -280, -195, -417, -70, -249, -73, -597, -138, -128, -732, -206, -212, -82, -138, -632, -731, -214, -849, -151 };
        assertEquals(-0.2701685476446869, mergersdivone.findMaximum(revenues), DELTA * -0.2701685476446869);
    }

    @Test
    public void case18() {
        int[] revenues = { 72, -980, -312, -217, -135, -792, -223, -579, -452, -217, -155, -681, -670, -268, -417, -243, -871, -666, -975, -852, -547, -711, -520, -557, -690, -159, -824, -206, -268, -759, -901, -416, -501, -715, -85, -644, -529, -502, -408, -26, -795, -378 };
        assertEquals(-0.2494574217457739, mergersdivone.findMaximum(revenues), DELTA * -0.2494574217457739);
    }

    @Test
    public void case19() {
        int[] revenues = { 26, -609, -35, -913, -416, -173, -976, -987, -18, -436, -365, -49, -542, -12, -151, -624, -87, -156, -263, -720, -181 };
        assertEquals(0.03628826141357422, mergersdivone.findMaximum(revenues), DELTA * 0.03628826141357422);
    }

    @Test
    public void case20() {
        int[] revenues = { 54, -204, -9, -119, -642, -261, -819, -620, -630, -959, -109, -925, -209, -470, -366, -442, -89, -434, -210, -396, -580, -679, -533, -131, -481, -583, -583, -92, -290, -895, -973, -528 };
        assertEquals(-0.11879557836800814, mergersdivone.findMaximum(revenues), DELTA * -0.11879557836800814);
    }

    @Test
    public void case21() {
        int[] revenues = { 71, -121, -244, -713, -751, -911, -174, -775, -187, -904, -335, -850, -161, -676, -427, -64, -384, -145, -188, -106, -771, -702, -240, -142, -882, -802, -505, -114, -53, -251, -501, -987, -341 };
        assertEquals(-0.1883820933289826, mergersdivone.findMaximum(revenues), DELTA * -0.1883820933289826);
    }

    @Test
    public void case22() {
        int[] revenues = { 55, -41, -321, -17, -853, -138, -535, -675, -699, -767, -254, -819, -872, -895, -90, -456, -187, -786, -454, -914, -488 };
        assertEquals(0.15306377410888672, mergersdivone.findMaximum(revenues), DELTA * 0.15306377410888672);
    }

    @Test
    public void case23() {
        int[] revenues = { 130, -311, -510, -203, -791, -501, -856, -884, -173, -949, -996, -241, -854, -109, -487, -988, -161, -591, -613, -150, -396, -453, -930, -588, -734, -613, -133 };
        assertEquals(0.02480575442314148, mergersdivone.findMaximum(revenues), DELTA * 0.02480575442314148);
    }

    @Test
    public void case24() {
        int[] revenues = { 112, -588, -268, -177, -163, -516, -40, -402, -958, -565, -195, -650, -802, -264, -304, -967, -946, -843, -952, -560, -621, -943, -345, -697, -359, -770, -727, -262 };
        assertEquals(-0.0718710795044899, mergersdivone.findMaximum(revenues), DELTA * -0.0718710795044899);
    }

    @Test
    public void case25() {
        int[] revenues = { 15, -778, -625, -903, -925, -104, -592, -65, -868, -602, -755, -610, -493, 0, -507, -952, -592, -437, -596, -927, -391, -827, -645, -134, -276, -638, -465, -12, -16, -789, -894, -724, -559, -477, -192, -563, -511, -57, -754, -145, -358, -642, -983 };
        assertEquals(0.07069007871336908, mergersdivone.findMaximum(revenues), DELTA * 0.07069007871336908);
    }

    @Test
    public void case26() {
        int[] revenues = { 768, 918, -986, -372, 371, -981, 477, 841, 210, 889, 980, -58, 119, -909, 435, 207, -84, -429, 481, -16, -465, 491, 783, -152, 927, 113, 63, 439, 401, 813, -853, -979, -162, -597, 398, 801 };
        assertEquals(942.7967356526933, mergersdivone.findMaximum(revenues), DELTA * 942.7967356526933);
    }

    @Test
    public void case27() {
        int[] revenues = { 615, -832, -191, -2, 836, -86, -71, 231, -594, -340, -929, -746, -403, 758, 565, 518, 818, -257, -925, -727, -808, 328, -241, -648, -999, 303 };
        assertEquals(785.5180625319481, mergersdivone.findMaximum(revenues), DELTA * 785.5180625319481);
    }

    @Test
    public void case28() {
        int[] revenues = { 195, -582, 70, 249, 73, -402, -861, -871, -267, -793, -787 };
        assertEquals(161.263671875, mergersdivone.findMaximum(revenues), DELTA * 161.263671875);
    }

    @Test
    public void case29() {
        int[] revenues = { 138, 632, 731, 214, 849, 151, 170, -867, -95, 980, -687, -782, -864, 792, -776, 579, -547, 217, 155, 681, -329, 268, 417, 243, -128, -333, -24, -147, -452, 711, -479, 557, -309, -840, -175, 206, -731, -240, 901, 416, 501, 715, -914, -355, 529, -497 };
        assertEquals(915.4132161540664, mergersdivone.findMaximum(revenues), DELTA * 915.4132161540664);
    }

    @Test
    public void case30() {
        int[] revenues = { -973, 795, 378, -285, 860, -201, -390, -964, -86, -583, 173, 976, -12, -981, 436, -634, -950, 542, 12, -848, 624, -912, 156, 263, -279, 181, 780, 29, -580, -795, 9, -880, 642, 261, 819, -379, 630, -40, -890, 925, -790, 470, 366, 442, -910, 434 };
        assertEquals(924.6311861052118, mergersdivone.findMaximum(revenues), DELTA * 924.6311861052118);
    }

    @Test
    public void case31() {
        int[] revenues = { 396, 580, -320, -466, -868, 481, 583, -416, 92, 290, 895, 973, -471, 50, -600, -837, -878, -755, -286, 751, 911, 174, -224, 187, -95, 335, 850 };
        assertEquals(919.5487457513809, mergersdivone.findMaximum(revenues), DELTA * 919.5487457513809);
    }

    @Test
    public void case32() {
        int[] revenues = { 676, -572, -935, 384, -854, -811, -893, -228, -297, -759, -857, 882, 802, -494, 114, 53, -748, -498, 987, 341, -237, -907, 990, 41, 321, 17, -146, -861, -464, 675, 699, -232, 254, -180, 872, -104, -909, 456, 187, -213, 454, 914, 488, 534, -721, 627, -688, -489, -796 };
        assertEquals(961.4225591447291, mergersdivone.findMaximum(revenues), DELTA * 961.4225591447291);
    }

    @Test
    public void case33() {
        int[] revenues = { -498, 856, 884, -826, -50 };
        assertEquals(567.0, mergersdivone.findMaximum(revenues), DELTA * 567.0);
    }

    @Test
    public void case34() {
        int[] revenues = { 241, 854, -890, 487, -11, -838, 591 };
        assertEquals(623.34375, mergersdivone.findMaximum(revenues), DELTA * 623.34375);
    }

    @Test
    public void case35() {
        int[] revenues = { -849, 396, -546, 930, -411, -265, 613, -866 };
        assertEquals(616.4140625, mergersdivone.findMaximum(revenues), DELTA * 616.4140625);
    }

    @Test
    public void case36() {
        int[] revenues = { -759, -385, 588, 268, 177, -836, 516, -959, -597, 958, 565, 195, -349, 802, 264, -695, 967, -53, -156, 952, -439, -378, 943, -654, 697, 359, 770, 727, 262, -728, -405, 778, -374, 903, 925, 104, -407, -934, 868 };
        assertEquals(956.7951147076928, mergersdivone.findMaximum(revenues), DELTA * 956.7951147076928);
    }

    @Test
    public void case37() {
        int[] revenues = { -397, -244, 610, 493, -999, -492, -47, 592, -562 };
        assertEquals(487.91796875, mergersdivone.findMaximum(revenues), DELTA * 487.91796875);
    }

    @Test
    public void case38() {
        int[] revenues = { -72, -608, 827, -354, -865, -723, -361, -534, 12, 16, -210, -105, 724, 559, 477, 192, -436, -488, -942, 754, 145, 358, -357, 983, -725, 291, 136, -955, 566, -794, 737, -417, -222, -407, 977, -445, -274, 1, 822, -976, -240, 629, -773 };
        assertEquals(935.7167685507495, mergersdivone.findMaximum(revenues), DELTA * 935.7167685507495);
    }

    @Test
    public void case39() {
        int[] revenues = { 479, 132, 537, 336, -702, 350, -999, 876, -255, -971, 118, 653, 272, 546, 923, -218, 428, -866, -95, 815, -844, 229, 659, 156, -807, 667, 400, 287 };
        assertEquals(862.9287402778864, mergersdivone.findMaximum(revenues), DELTA * 862.9287402778864);
    }

    @Test
    public void case40() {
        int[] revenues = { 0, -856, -927, -531, 441, -378, 599, 710, 219, -845, -451, 396, -606, 688, -34, 268, 189, 940, 891, 957, 722, -299, 837, -775, -765, 196, -112, 226, 527, 233, -10, 720, -831, 235, 728, 815, -383, -950, 650, 6, -622, 478, -164, -975, 622, -28, 257, 305 };
        assertEquals(925.1439663487079, mergersdivone.findMaximum(revenues), DELTA * 925.1439663487079);
    }

    @Test
    public void case41() {
        int[] revenues = { -519, 527, -50, -797, -187, 98, 925, -8, -149, -146, -285, 471, -565, 23, -316, -422, 627, 572, 574, 619, -22, 676, -417, 659, -365, -794, 908, 143, 916, 393, -923, -596, -362, 7, -376, -973, -555, -949, 488, -638, -783 };
        assertEquals(886.7636689624815, mergersdivone.findMaximum(revenues), DELTA * 886.7636689624815);
    }

    @Test
    public void case42() {
        int[] revenues = { 846, -748, -847, 107, 882 };
        assertEquals(566.1875, mergersdivone.findMaximum(revenues), DELTA * 566.1875);
    }

    @Test
    public void case43() {
        int[] revenues = { 772, 468, -254 };
        assertEquals(439.5, mergersdivone.findMaximum(revenues), DELTA * 439.5);
    }

    @Test
    public void case44() {
        int[] revenues = { -634, -37, -748, 180, -19, 150, 652, -747, 105, 408, -420, -173, -109, -829, -419, 493, 857, 865, -498, 202, 903, 819, -760, -990, -199, 999, 674, -116, 692, 798 };
        assertEquals(935.0751221422106, mergersdivone.findMaximum(revenues), DELTA * 935.0751221422106);
    }

    @Test
    public void case45() {
        int[] revenues = { 292, -791, 131, -972, 978, 267, -791, 403, -53, -575, 995, -953, 253 };
        assertEquals(820.986572265625, mergersdivone.findMaximum(revenues), DELTA * 820.986572265625);
    }

    @Test
    public void case46() {
        int[] revenues = { 1, 0, -2, 2, -5, 5, 1, 2, -4, -4, 0, -4, 3, 5, -5, 1, 2, -2, 3, 3, 2, -5, -3, -2, 0, -3, 0, 1, -5, -2, -5, 3, 0, -2, -4, 3, 2, -3, 5, -5, -1, 2, 4, -5, -3, -4 };
        assertEquals(4.810514359674926, mergersdivone.findMaximum(revenues), DELTA * 4.810514359674926);
    }

    @Test
    public void case47() {
        int[] revenues = { -5, -1, 4, 5, -3, 4, 3, 2, -1, 4, -1, -3, 5, -1, -5, 5, 3, 5, 4, -2, 1, -1, 2, 0, -1, 5, 5, -3, -1, 3, 3, 5, -4, -5, -2, 4, 0, -2, -5, 3, 1, -3, 1, 5, 1, 2, 2 };
        assertEquals(4.995967607912121, mergersdivone.findMaximum(revenues), DELTA * 4.995967607912121);
    }

    @Test
    public void case48() {
        int[] revenues = { -3, 1, -5 };
        assertEquals(-1.5, mergersdivone.findMaximum(revenues), DELTA * -1.5);
    }

    @Test
    public void case49() {
        int[] revenues = { 1, 5, -2, -3, 5, 2, -5, 3, 4, 1, 3, 1, 3, 0, 3, 5, -2, 5, 2, 4, 1, -3, 0, 1, -2, -1, -3, 1, 1, 4, 0 };
        assertEquals(4.9290760066360235, mergersdivone.findMaximum(revenues), DELTA * 4.9290760066360235);
    }

    @Test
    public void case50() {
        int[] revenues = { -3, 1, -2, -1, -1, 4, 4, 2, 0, 3, 4, -1, -5, 4, 2, -5, -3, 2, 1, 5, 4, 1, 5, -1, -4 };
        assertEquals(4.737698197364807, mergersdivone.findMaximum(revenues), DELTA * 4.737698197364807);
    }

    @Test
    public void case51() {
        int[] revenues = { 3, -4, -1, 5, -2, 3, 5, 1, 0, 3, -4, -3, 3, 5, -5, 5, 1, 0, 2, -5, 3, -3, 1, 3, 0, 0, 0, 2, 4, -4 };
        assertEquals(4.905623521655798, mergersdivone.findMaximum(revenues), DELTA * 4.905623521655798);
    }

    @Test
    public void case52() {
        int[] revenues = { -2, -1, -1, 0, 3, 2, 2, 1, -2, 0, 2, 1, 3, 4, -4, 0, 5, -4, -3, 0, 1, 4, 1, 5, -5, -2, 2, -5, 5, 4, -2, -4, -1, -5, -4, -1, 3, 4, -4, 0, 3, -5, 4, 4, -5 };
        assertEquals(4.872916682535106, mergersdivone.findMaximum(revenues), DELTA * 4.872916682535106);
    }

    @Test
    public void case53() {
        int[] revenues = { 0, 1, -3, -4, -2, 0, 0, -2, 4, -3, 5, 4, 0 };
        assertEquals(4.053466796875, mergersdivone.findMaximum(revenues), DELTA * 4.053466796875);
    }

    @Test
    public void case54() {
        int[] revenues = { -3, 3, -3, 1, -3, 1, -5, -2, -3, 1, 2, 2, 3, -3, 0, -4, -3, -5, -4, -1, -3, 4, 1, -4, 0, -5, -2, -5, 5, 2, -5, -3, 3, -3, 0, 3, -4, -1 };
        assertEquals(4.232279775547795, mergersdivone.findMaximum(revenues), DELTA * 4.232279775547795);
    }

    @Test
    public void case55() {
        int[] revenues = { -3, 0, 2, -1, 0, 3, 0, -3, 1, 5, -3, -3, -1, -1, 2, 4, -4, 5, 4, -3, -2, 2, -1, 2, 4, 5, -3, 2, 1, 4, 2, -5, 2, 5, 2 };
        assertEquals(4.931630827311892, mergersdivone.findMaximum(revenues), DELTA * 4.931630827311892);
    }

    @Test
    public void case56() {
        int[] revenues = { 44, 49 };
        assertEquals(46.5, mergersdivone.findMaximum(revenues), DELTA * 46.5);
    }

    @Test
    public void case57() {
        int[] revenues = { -15, 35, -12, 31 };
        assertEquals(21.875, mergersdivone.findMaximum(revenues), DELTA * 21.875);
    }

    @Test
    public void case58() {
        int[] revenues = { -36, -30, 23 };
        assertEquals(-5.0, mergersdivone.findMaximum(revenues), DELTA * -5.0);
    }

    @Test
    public void case59() {
        int[] revenues = { 3, 41, 13, -13 };
        assertEquals(22.5, mergersdivone.findMaximum(revenues), DELTA * 22.5);
    }

    @Test
    public void case60() {
        int[] revenues = { 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0 };
        assertEquals(0.9999997615814209, mergersdivone.findMaximum(revenues), DELTA * 0.9999997615814209);
    }

    @Test
    public void case61() {
        int[] revenues = { 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1 };
        assertEquals(0.9999999962747097, mergersdivone.findMaximum(revenues), DELTA * 0.9999999962747097);
    }

    @Test
    public void case62() {
        int[] revenues = { -1, 0, -1, -1, -1, 0, 0, 0, -1, -1, -1, 0, 0, -1, 0, -1, 0, -1, 0, -1, 0, 0, 0, -1, 0, -1, -1, -1, 0, 0, 0, -1, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, -1, -1, 0, 0, -1, -1, -1, -1 };
        assertEquals(-5.960464477539063e-08, mergersdivone.findMaximum(revenues), DELTA * -5.960464477539063e-08);
    }

    @Test
    public void case63() {
        int[] revenues = { -1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, -1, -1, -1, 0, -1, -1, 0, 0, -1, -1, 0, 0, 0, 0, -1, 0, 0, 0, -1, 0, -1, -1, -1, -1, 0, 0, -1, -1, 0, -1, -1, 0, -1, 0, 0, -1, -1, 0, -1 };
        assertEquals(-7.450580596923828e-09, mergersdivone.findMaximum(revenues), DELTA * -7.450580596923828e-09);
    }

    @Test
    public void case64() {
        int[] revenues = { 34, 54, 16, -102, -32, 784, 4, -9, -41, 29, 44, 276, 25, -434, -13, -75, 304, -456, 31, -868, 666, -39, -32, -314, -47, 857, 792, 46, -126, 7, 85, -38, 46, 397, -11, 826, -352, 766, 957, 771, 10 };
        assertEquals(891.8725374178612, mergersdivone.findMaximum(revenues), DELTA * 891.8725374178612);
    }

    @Test
    public void case65() {
        int[] revenues = { -24, 241, 175, -644, 108, 37, 405, 568, 6, -484, 729, 33, -179, 509, 114, 578, 278, -6, -5, -110, -47, 23, -654, -616, 14, 121, -50, -18, 566, -544, 688, 34, 105, 35, -31, -839, 321, 994, -16, -4, -34, 399 };
        assertEquals(834.8496360371805, mergersdivone.findMaximum(revenues), DELTA * 834.8496360371805);
    }

    @Test
    public void case66() {
        int[] revenues = { 855, 197, -46, -34, 0, -1, 10, -760, 6, -31, -5, -39, -26, 558, 404, 25, 908, -27, -3, -13, 28, -256, 792, 16, 374, 695 };
        assertEquals(837.7186942100525, mergersdivone.findMaximum(revenues), DELTA * 837.7186942100525);
    }

    @Test
    public void case67() {
        int[] revenues = { -705, -472, 210, 37, -6, 660, -259, -5, -385, -32, 4 };
        assertEquals(383.9619140625, mergersdivone.findMaximum(revenues), DELTA * 383.9619140625);
    }

    @Test
    public void case68() {
        int[] revenues = { 550, -633, -40, -31, 325, 30, -50, 38, 19, -30, -19, 7, 227 };
        assertEquals(387.939697265625, mergersdivone.findMaximum(revenues), DELTA * 387.939697265625);
    }

    @Test
    public void case69() {
        int[] revenues = { 38, 46, 20, -49, -47, 27, 20, 278, 23, -13, 543, 586, -760, -15, -592, -283, -26, 36, -28, 7, -457, 39, -3, -755, 40, -35, 585, 21, -869, -42, 5, -27, -12, 13, -263, 1, -40, -28, 407, 616, 49, 37, -48, -918, 2, 47 };
        assertEquals(579.356812966206, mergersdivone.findMaximum(revenues), DELTA * 579.356812966206);
    }

    @Test
    public void case70() {
        int[] revenues = { 40, -334, 22, -677, -271, -302, 17, -45, -17, 931, -1, -40, -250, -42, 189, -42, -13, -48, 113, -39, -432, -36, -17, -2, -255, -45, -30, 33, -49, -394, -286, 24, 40, 224, 7, -40, 36, -10, 107 };
        assertEquals(556.7124765929148, mergersdivone.findMaximum(revenues), DELTA * 556.7124765929148);
    }

    @Test
    public void case71() {
        int[] revenues = { -30, 279, 181, 505, 47, -10, 580, -804, -936, 40, -694, 232, 214, -19, 198, 21, -5, -95, 30, 16, -388, 729, 29, 69, -659, -36, 56, 38, 25, 159, -39, -506, 386, 38, -634, -666, 368, -971, -2, -41, -47, 15, 3, -675, 11, 763, 685, -118, 458 };
        assertEquals(713.9753470341445, mergersdivone.findMaximum(revenues), DELTA * 713.9753470341445);
    }

    @Test
    public void case72() {
        int[] revenues = { 48, -17, 253, -185, 177, -829, 9, -574, 683, -657, -9, 98, 960, -313, -32, -214 };
        assertEquals(696.9595336914062, mergersdivone.findMaximum(revenues), DELTA * 696.9595336914062);
    }

    @Test
    public void case73() {
        int[] revenues = { -48, 30, 767, 683, 888, -44, 284, -671, -37, 438, -571, -29, -950, -44, -24, -314, 12, 16, -29, -5, -881 };
        assertEquals(757.9443044662476, mergersdivone.findMaximum(revenues), DELTA * 757.9443044662476);
    }

    @Test
    public void case74() {
        int[] revenues = { 543, 44, 211, -844, -377, 4, -33, 14, -37, 20, 595, 41, -14, -32, -27, 370, 550, 22, 8, -19, 15, 17, -16 };
        assertEquals(533.7538063526154, mergersdivone.findMaximum(revenues), DELTA * 533.7538063526154);
    }

    @Test
    public void case75() {
        int[] revenues = { 43, -47, 342, -2, 22, 26, 15, -845, -44, -11, -42, 758, -647, -26 };
        assertEquals(472.056396484375, mergersdivone.findMaximum(revenues), DELTA * 472.056396484375);
    }

    @Test
    public void case76() {
        int[] revenues = { -761, 376, -21, -765, -639, 558, -969, -71, -409, 44, 759, -689, 179 };
        assertEquals(573.3662109375, mergersdivone.findMaximum(revenues), DELTA * 573.3662109375);
    }

    @Test
    public void case77() {
        int[] revenues = { -534, 15, 293, 677, -47, 587, -33, 43, 863, -13, -606, -44, -916, -800, 945, -36, -253, 967, 736, -34, 987, -47, 37, 30, -876, 23, 47, -37, -997, 10, -293, 17, -444 };
        assertEquals(946.7843482864555, mergersdivone.findMaximum(revenues), DELTA * 946.7843482864555);
    }

    @Test
    public void case78() {
        int[] revenues = { 19, -575, 434, 953, -855, -50, 17, 4, 252, 797, 16, 723, 207 };
        assertEquals(804.23583984375, mergersdivone.findMaximum(revenues), DELTA * 804.23583984375);
    }

    @Test
    public void case79() {
        int[] revenues = { 563, 887, -156, 5, -92, -360, 653, 17, -48, -101, 886, -8, -5, -885, 661, 32, 782, 20, 650, -562, 27, 1, -6, 608, -348, 29, 4, 34, -359, 41, -28, -828, 37, -3 };
        assertEquals(841.7209418885177, mergersdivone.findMaximum(revenues), DELTA * 841.7209418885177);
    }

    @Test
    public void case80() {
        int[] revenues = { 444, -46, -314, -33, -317, -28, 2, 483, -379, 14, -27, -28, 35, -668, -31, 22, 13, 22, -14, 504, 0, -6, -698, 215, -9, -902, 0, -185, -3, -9, 13, -268, -28, 6, -16, -43, 40, 7, 38, -816, -354, 462, 23, -9, 18, -399, 45 };
        assertEquals(466.2434704128491, mergersdivone.findMaximum(revenues), DELTA * 466.2434704128491);
    }

    @Test
    public void case81() {
        int[] revenues = { 12, -249, -13, -722, 304, 892, -20, -729, -9, -72, 47, 0, 34, 723, 46, -761, 47, 530, -112, -41, -572, -364, 48, 443, -15, -48, -246, 27, 3, 1, 20, -176, -267, -25, 813, 46, -5, -24, 662, 576, -584, -695, -381, -478, -38 };
        assertEquals(812.112431621378, mergersdivone.findMaximum(revenues), DELTA * 812.112431621378);
    }

    @Test
    public void case82() {
        int[] revenues = { -442, 48, 29, 38, 21, -2, 38, 6, -25, -179, 32, 212, 205, 127, 42, -838, -20, -361, -35, 25, -250, -43, -11, 378, -242, -789, -33, -407, 247 };
        assertEquals(295.3857683427632, mergersdivone.findMaximum(revenues), DELTA * 295.3857683427632);
    }

    @Test
    public void case83() {
        int[] revenues = { -122, 787, -17, -446, -287, -274, -16, -32, -133, -269, 11, -112, -12, -1, 12, -684, -49, 1, 981, -39, 46, 33, 43, -24, -15, 25, -20, -4, -555, -956, 97, 11 };
        assertEquals(704.3817642116919, mergersdivone.findMaximum(revenues), DELTA * 704.3817642116919);
    }

    @Test
    public void case84() {
        int[] revenues = { -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000, -1000 };
        assertEquals(-1000.0, mergersdivone.findMaximum(revenues), DELTA * -1000.0);
    }

    @Test
    public void case85() {
        int[] revenues = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
        assertEquals(1000.0, mergersdivone.findMaximum(revenues), DELTA * 1000.0);
    }

    @Test
    public void case86() {
        int[] revenues = { 4, 4, 8 };
        assertEquals(6.0, mergersdivone.findMaximum(revenues), DELTA * 6.0);
    }

    @Test
    public void case87() {
        int[] revenues = { 109, 122, -51, -157, 59, -663, -704, 386, 254, 525, -199, -353, -332, 56, -794, 780, -11, -226, 445, -187, -48, 135, 339, 9, -43, 435, 24, 11, -826, -24, 841, -9, -341 };
        assertEquals(732.6620609145612, mergersdivone.findMaximum(revenues), DELTA * 732.6620609145612);
    }

    @Test
    public void case88() {
        int[] revenues = { 933, 743, 262, 529, 700, 508, 752, 256, 256, 119, 711, 351, 843, 705, 108, 393, 330, 366, 169, 932, 917, 847, 972, 868, 980, 223, 549, 592, 164, 169, 551, 427, 190, 624, 635, 920, 944, 310, 862, 484, 363, 301, 710, 236, 876, 431, 929, 397, 675, 491 };
        assertEquals(967.1019344417859, mergersdivone.findMaximum(revenues), DELTA * 967.1019344417859);
    }

    @Test
    public void case89() {
        int[] revenues = { 1, 2, 3, 4, 5, 6, 7 };
        assertEquals(6.015625, mergersdivone.findMaximum(revenues), DELTA * 6.015625);
    }

    @Test
    public void case90() {
        int[] revenues = { -959, -524, -663, -487, 178, 731, 483, 372, -25, -524, 707, -841, 292, -165, 965, -509, -4, 947, -171, 438, -593, -389, 903, -847, -708, -612, 429, -275, 727, 904, 449, 736, -222, 543, 869, 921, 679, -688, 43, 898, -283, 822, 337, -652, 681, -334, 148, 714, -733 };
        assertEquals(945.9694893797687, mergersdivone.findMaximum(revenues), DELTA * 945.9694893797687);
    }

    @Test
    public void case91() {
        int[] revenues = { -845, -609, 280, 508, 115, -334, -812, -632, -274, -401, 1000, 461, -702, -697, -135, -339, 597, 504, -806, -268, -867, -766, 2, 332, -897, 38, 974, 829, 483, 425, -168, -463, 774, 177, -851, 789, 346, -820, 929, 982, -878, 889, -486, -792, -675, -176, 339, 52, -304, 319 };
        assertEquals(977.3629588318029, mergersdivone.findMaximum(revenues), DELTA * 977.3629588318029);
    }

    @Test
    public void case92() {
        int[] revenues = { -5, -4, -3, -2, -1, 1, 2, 3, 4, 5 };
        assertEquals(3.970703125, mergersdivone.findMaximum(revenues), DELTA * 3.970703125);
    }

    @Test
    public void case93() {
        int[] revenues = { 2, 12, 12, 12, 12 };
        assertEquals(11.375, mergersdivone.findMaximum(revenues), DELTA * 11.375);
    }

    @Test
    public void case94() {
        int[] revenues = { 1, 2, 2, 2, 3 };
        assertEquals(2.4375, mergersdivone.findMaximum(revenues), DELTA * 2.4375);
    }

    @Test
    public void case95() {
        int[] revenues = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
        assertEquals(2.0, mergersdivone.findMaximum(revenues), DELTA * 2.0);
    }

    @Test
    public void case96() {
        int[] revenues = { 1, 3, 3, 4 };
        assertEquals(3.25, mergersdivone.findMaximum(revenues), DELTA * 3.25);
    }

    @Test
    public void case97() {
        int[] revenues = { -813, 182, 182, 182, -560, 182, -813, 864, -813, 182, -813, -896, 182, -83, 700, -973, 182, 496, 182, 182, 182, 182, 182, 101, 182, 182, 101, 182, 182, -813, 182, 182, 182, -813, 182, 55, 182, -973, -679, 182, 182, 227, -973, -813, 182, -813, -679, -454, 182, -594 };
        assertEquals(694.562499743499, mergersdivone.findMaximum(revenues), DELTA * 694.562499743499);
    }

    @Test
    public void case98() {
        int[] revenues = { 1000, 1, 1 };
        assertEquals(500.5, mergersdivone.findMaximum(revenues), DELTA * 500.5);
    }

    @Test
    public void case99() {
        int[] revenues = { 324, 656, 121, -435, -989, 234, 122, -999, 0, 123 };
        assertEquals(446.05859375, mergersdivone.findMaximum(revenues), DELTA * 446.05859375);
    }

    @Test
    public void case100() {
        int[] revenues = { 10, 12, 12, 12, 12 };
        assertEquals(11.875, mergersdivone.findMaximum(revenues), DELTA * 11.875);
    }

    @Test
    public void case101() {
        int[] revenues = { 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(0.9999999925494194, mergersdivone.findMaximum(revenues), DELTA * 0.9999999925494194);
    }

    @Test
    public void case102() {
        int[] revenues = { 1, 2, 3 };
        assertEquals(2.25, mergersdivone.findMaximum(revenues), DELTA * 2.25);
    }

    @Test
    public void case103() {
        int[] revenues = { 1, 10, 10, 10 };
        assertEquals(8.875, mergersdivone.findMaximum(revenues), DELTA * 8.875);
    }

    @Test
    public void case104() {
        int[] revenues = { 1, 2, 2, 2, 2 };
        assertEquals(1.9375, mergersdivone.findMaximum(revenues), DELTA * 1.9375);
    }

    @Test
    public void case105() {
        int[] revenues = { -5, -5, 10, 10 };
        assertEquals(6.25, mergersdivone.findMaximum(revenues), DELTA * 6.25);
    }

    @Test
    public void case106() {
        int[] revenues = { 10, 20, 25 };
        assertEquals(20.0, mergersdivone.findMaximum(revenues), DELTA * 20.0);
    }

    @Test
    public void case107() {
        int[] revenues = { 1, 1, 1000 };
        assertEquals(500.5, mergersdivone.findMaximum(revenues), DELTA * 500.5);
    }

    @Test
    public void case108() {
        int[] revenues = { 13, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
        assertEquals(7.5, mergersdivone.findMaximum(revenues), DELTA * 7.5);
    }

    @Test
    public void case109() {
        int[] revenues = { 10, 10, 30, 50 };
        assertEquals(35.0, mergersdivone.findMaximum(revenues), DELTA * 35.0);
    }

    @Test
    public void case110() {
        int[] revenues = { -10, -10, 10, 10 };
        assertEquals(5.0, mergersdivone.findMaximum(revenues), DELTA * 5.0);
    }

    @Test
    public void case111() {
        int[] revenues = { -3, -2, 4, 500, 1000 };
        assertEquals(625.1875, mergersdivone.findMaximum(revenues), DELTA * 625.1875);
    }

    @Test
    public void case112() {
        int[] revenues = { 0, 100, 100 };
        assertEquals(75.0, mergersdivone.findMaximum(revenues), DELTA * 75.0);
    }

    @Test
    public void case113() {
        int[] revenues = { -2, -2, -2, -3, -3, -3, 4, 4, -10, -999 };
        assertEquals(0.509765625, mergersdivone.findMaximum(revenues), DELTA * 0.509765625);
    }

    @Test
    public void case114() {
        int[] revenues = { 10, 20, 30 };
        assertEquals(22.5, mergersdivone.findMaximum(revenues), DELTA * 22.5);
    }

    @Test
    public void case115() {
        int[] revenues = { 10, 20, 30 };
        assertEquals(22.5, mergersdivone.findMaximum(revenues), DELTA * 22.5);
    }

}
