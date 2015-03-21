package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class TheConsecutiveIntegersDivTwoTest {
    TheConsecutiveIntegersDivTwo theconsecutiveintegersdivtwo = new TheConsecutiveIntegersDivTwo();

    @Test
    public void case1() {
        int[] numbers = { 4, 47, 7 };
        int k = 2;
        assertEquals(2, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case2() {
        int[] numbers = { 1, 100 };
        int k = 1;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case3() {
        int[] numbers = { -96, -53, 82, -24, 6, -75 };
        int k = 2;
        assertEquals(20, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case4() {
        int[] numbers = { 64, -31, -56 };
        int k = 2;
        assertEquals(24, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case5() {
        int[] numbers = { 14, 36, 74 };
        int k = 1;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case6() {
        int[] numbers = { 90, -7, 64 };
        int k = 1;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case7() {
        int[] numbers = { 46, -27, 61, -5, -10, 76, -69 };
        int k = 2;
        assertEquals(4, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case8() {
        int[] numbers = { -4036084, 1701774, 8047434, 1831870, -3520376, 280315, 4644668, 3793537, -2992341, 8580060, -4998339, 2005181, 4145923, 3806082, -3547791, -2163303, 9204157, 4356001, -1265986, 9920261, -8401925, 2460129, 4316286, 8764845, 8378171, -4110207, -7938046, 9381494, -8827810, -8434384, 6667554, -6394899, 9290628, -8639799, 3784320 };
        int k = 1;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case9() {
        int[] numbers = { 3058475, 6500668, 5686555, 7700535, 7000681, -819476, 5075232, 7884182, -2423417, 7122230, 8490054, 2608425, 5782155, -4045513, -4508667, -6777764, -805198, 2259833, 7572302 };
        int k = 1;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case10() {
        int[] numbers = { -4845232, -5077278, -1696332, 9685053, -8008906, -2041580, -2825611, 7330935, -1994531, -5206896, -202206, -1506777, 8005773 };
        int k = 2;
        assertEquals(47048, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case11() {
        int[] numbers = { 905094, -9856209, -5067503, 2152352, 6069125, 6070805, -3078364, 3447730, 8533640, 8101663, 5627524, 7232490, 5409193, -6902965, -9001727, 7082618, -4761194, 9863063, 4156041, -6268386, -2551014, -1459606, 6848269, -2591702, -1581233, 4052341, -7692095, -251864, -6426888, 8421368, -9552201, 4005431, -9852381, -6312701, 1751043, 5428343, 3952329, -5260966, -6860219, -6470224, 6032682 };
        int k = 1;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case12() {
        int[] numbers = { 146510, -6507615, -9321354, 7291401, -9981037, -5129098, -7749378, -9861405, -3815967, -9078887, -4008208, 8336304, -2815172, 3939575, 7619137, 9979105, -9200896, -9875413, 6373208, 8536028, -5326004, -92197, -5728645, 476981, 2795232, 1958488, -4819855, -5580132 };
        int k = 1;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case13() {
        int[] numbers = { -5912096, -1271330, 235975, 7397958, 2234585, 3107177, -279730, 4522784, 252702, 671098, 5216584, -6262459, 3684610, 5943038, 6093587, 306116, 1115114 };
        int k = 2;
        assertEquals(16726, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case14() {
        int[] numbers = { -7171152, -1951591, 7430452, 6150290, 188178, -7644836, -9771874, 1084983, -9547982, 7787285, 4110722, -5730013, 3319082, -9473192, -4527117, -4454620, 1593764, -7333224, 5457830, -6898885, 631880, 9917676, 2764925, -2096374, -9466488, 7869233, 4804718 };
        int k = 2;
        assertEquals(6703, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case15() {
        int[] numbers = { 3494385, 1166379, 2963457, 884339, -2848806, -1624025, -5890830, -8613461, -4465603, -5835203, -4624055, -2134450 };
        int k = 1;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case16() {
        int[] numbers = { 5395586, -3605164 };
        int k = 1;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case17() {
        int[] numbers = { 1044336, -3513770, 7004648, 3861347, 1905495, -7764626, 7952512, 563395, 3593471, 4015264, 6103047, -6634600, -5147503, 1834570, 3673681, 2653668, -8784297, -3229981, -8522749, 9747920 };
        int k = 1;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case18() {
        int[] numbers = { -6469198, 520794, -2777844, -1021849, -678892, -2390375, 1453957, 5880371, -5240012, 3132401, -2572157, 4117040, 4207610, -9175882, -5246236, 9679465, 4638635, -7750966, -8870053, 4141120, -914897, 9917164, -801086, 6220742, -7782196, -6519920, -4933753, -1483663, 9548574, -1675115 };
        int k = 1;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case19() {
        int[] numbers = { -9131779, -2749504, 9226906, 4753767, -1019170, -1697868, -8749995, -7632561, -6360898, -7974912, 7061121, 2018502, 6584770, -6626274, 3743388, -6301110, -9171097, -7320428, 5442874, -4742901, 854924, -169547, 8737472, 4981071, 5918849, -8234291, 5791683 };
        int k = 1;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case20() {
        int[] numbers = { 6044735, -8511688, -9869927, -5135881, 1772881, 2077605, 9741478, 8109178, -9502114, -2043839, -2425955, 4282196, -9689536, -32075, 3378912, 1932932, 5036365, -8040792, 155049 };
        int k = 1;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case21() {
        int[] numbers = { 26, 36, 29, 20, 11, 7, 30, 25, 9, 3, 37, 10, 40, 41, 21, 44, 42, 23, 27, 46, 6, 18, 47, 34, 39, 38, 33, 45, 12, 31, 13, 28, 43, 14, 17, 8, 2, 16, 24, 15, 19, 5, 22, 35, 32, 4, 1 };
        int k = 2;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case22() {
        int[] numbers = { 32, 13, 8, 37, 7, 38, 16, 40, 14, 19, 26, 5, 43, 15, 25, 42, 21, 28, 33, 10, 20, 39, 17, 36, 34, 22, 29, 1, 11, 35, 2, 23, 27, 30, 4, 24, 31, 41, 18, 9, 12, 6, 3 };
        int k = 2;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case23() {
        int[] numbers = { 40, 19, 41, 20, 37, 28, 12, 7, 1, 21, 42, 22, 46, 24, 16, 44, 17, 38, 6, 26, 3, 8, 31, 29, 11, 18, 32, 14, 43, 5, 15, 45, 30, 4, 34, 13, 23, 39, 9, 36, 25, 27, 35, 10, 2, 33 };
        int k = 2;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case24() {
        int[] numbers = { 14, 12, 3, 24, 33, 38, 30, 1, 26, 18, 17, 29, 4, 19, 13, 15, 40, 31, 9, 36, 34, 7, 6, 39, 42, 32, 41, 23, 22, 21, 28, 10, 43, 27, 20, 37, 5, 44, 8, 16, 25, 2, 11, 35 };
        int k = 2;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case25() {
        int[] numbers = { 31, 19, 27, 30, 41, 2, 12, 16, 21, 33, 7, 8, 14, 1, 24, 26, 25, 28, 4, 13, 35, 11, 18, 32, 22, 10, 5, 23, 43, 40, 15, 3, 17, 29, 42, 36, 37, 20, 9, 34, 38, 6, 39 };
        int k = 2;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case26() {
        int[] numbers = { 5, 29, 42, 9, 28, 39, 43, 10, 2, 34, 38, 31, 14, 40, 26, 8, 22, 25, 27, 19, 24, 23, 1, 35, 7, 3, 33, 12, 4, 30, 11, 41, 36, 15, 6, 17, 20, 21, 13, 32, 16, 37, 18 };
        int k = 2;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case27() {
        int[] numbers = { 36, 41, 27, 28, 6, 22, 24, 18, 10, 35, 40, 25, 21, 1, 7, 13, 17, 9, 12, 5, 2, 34, 15, 11, 33, 14, 37, 30, 26, 31, 39, 19, 42, 29, 4, 23, 38, 20, 3, 16, 8, 32 };
        int k = 2;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case28() {
        int[] numbers = { 33, 21, 23, 27, 19, 26, 12, 36, 32, 42, 5, 7, 44, 24, 38, 28, 9, 15, 34, 3, 18, 4, 13, 8, 31, 35, 43, 2, 39, 16, 20, 11, 40, 25, 1, 30, 14, 41, 17, 6, 29, 37, 22, 10 };
        int k = 2;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case29() {
        int[] numbers = { 33, 17, 1, 11, 36, 32, 26, 23, 10, 6, 16, 29, 15, 13, 37, 2, 35, 34, 18, 9, 19, 3, 20, 7, 42, 28, 43, 22, 40, 4, 12, 31, 39, 8, 24, 27, 38, 25, 5, 41, 21, 14, 30 };
        int k = 2;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case30() {
        int[] numbers = { 20, 26, 24, 4, 37, 39, 23, 28, 36, 25, 38, 1, 17, 9, 13, 34, 15, 21, 29, 33, 44, 30, 19, 41, 43, 8, 7, 5, 22, 12, 2, 14, 10, 16, 35, 32, 27, 3, 31, 40, 42, 18, 11, 6 };
        int k = 2;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case31() {
        int[] numbers = { -296, 136, -144, 62, -187, -39, -80, 161, -91, 303, -293, 61, -112, -27, -179, -215, -41, 3, -12, -134, 38, 184, -95, -11, 151, -236, -3, -75, -56, -254, -288, 212, -315, 163, 73, 4, 41, -233, -108, -51, 238, -169, -130, -270, 145, -218, 112 };
        int k = 2;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case32() {
        int[] numbers = { -287, 76, -251, -51, 43, -192, -98, 148, 93, -198, 57, -267, -224, -199, -216, -12, 108, -249, 102, 116, -172, -207, -132, 274, -202, -262, -112, 103, 32, -195, 101, -16, 192, 104, -41, -106, 94, 181, -22, 87, -295, 25, -2, 249 };
        int k = 2;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case33() {
        int[] numbers = { -105, 41, 68, -173, -126, 292, -36, -18, -24, 232, -250, 268, -184, 15, 114, 263, 272, -135, -303, 10, -53, 291, 275, 304, 278, -129, 153, 25, 47, -212, 254, 266, -255, -170, -66, -262, -81, 76, -114, -55, -290, -284, -230, -293 };
        int k = 2;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case34() {
        int[] numbers = { -32, 233, 168, -184, -240, -39, 36, 255, 116, -131, 304, -302, 108, 171, 26, -294, 165, 250, 292, 51, -86, 230, 266, -90, -201, -252, 226, 101, 288, -110, 181, -187, -208, 19, 272, -56, -78, 84, 69, 40, -276, -247, 99, 65, 301, -88, -259 };
        int k = 2;
        assertEquals(1, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case35() {
        int[] numbers = { 98, -26, 251, -94, -253, 214, 4, 157, -74, 252, 3, 298, -8, -222, 18, 299, 109, -147, -151, 224, -251, -15, 63, 110, -220, 236, -307, 66, -82, 199, 16, -264, 68, 52, -217, -304, -67, -216, -226, -95, -102, 260, -171, 186, 39, -200 };
        int k = 2;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case36() {
        int[] numbers = { -15, -220, -177, 225, -204, 121, 82, -115, 264, 315, 161, -84, 194, -4, 296, -55, 327, 224, -57, -82, -296, 268, 61, -169, -89, 186, 201, -120, 62, -113, -202, -308, -108, -102, -36, 48, 75, -212, 302, 245, -302, -61, -255, 243, 248, 23, -235 };
        int k = 2;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case37() {
        int[] numbers = { -184, -30, 216, -229, 234, -72, -45, 228, -224, -209, -185, 75, 103, 169, 56, -295, -96, -158, 284, 207, -11, -101, -247, 144, 181, 221, -156, -118, -207, 74, -182, -93, -49, 171, 118, -27, 184, 275, 286, -205, -283, -164, -177, -129 };
        int k = 2;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case38() {
        int[] numbers = { -22, 33, 119, -193, 196, 306, -165, 85, -296, -139, 225, 44, -132, -256, 238, 31, 24, -214, -19, -56, 96, 248, -324, -221, 171, -218, -149, -71, -198, -135, 279, -42, -275, 297, -234, -136, 15, 292, -205, 161, -265, 265, 181, -99, 16, -86, 108 };
        int k = 2;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case39() {
        int[] numbers = { 110, 271, 75, -117, 227, 153, -276, -194, -34, -159, -29, 221, -171, 150, 250, -301, -87, -186, -6, -158, 308, -67, -22, -292, 93, 7, 280, 154, 223, -302, 115, 238, 23, -107, -94, 214, -103, -212, -105, -13, -209, -253, 33, -244, 197 };
        int k = 2;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case40() {
        int[] numbers = { 189, 132, 186, -190, -112, 127, -39, 195, -94, -219, 83, 288, 87, 105, -50, -25, 226, -57, 70, -101, -3, -76, 109, 40, 279, -67, -161, -89, 320, 274, -11, -193, 84, -273, 42, 121, -145, 27, -143, 268, -217, 213, 92, -242, 305, -294 };
        int k = 2;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case41() {
        int[] numbers = { 0, -9787190, -3829770, 5744655, 2553180, 8085070, 3404240, -7021245, -7872305, -2978710, -3191475, -1276590, -5744655, -9574425, -7446775, 6170185, 9999955, 4680830, -8297835, 8936130, 2978710, 1489355, 8510600, 1702120, -6595715, 7234010, -5531890, -7659540, -4255300, -4893595, 5531890, 2127650, 6382950, -2553180, 638295, -3617005, 4468065, -1914885, -1489355, 851060, -851060, 4042535, 7659540, 7021245, -2765945, -2340415, 2765945 };
        int k = 2;
        assertEquals(212764, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case42() {
        int[] numbers = { 0, -9565204, -9999986, -9347813, 5652166, -7826076, 1956519, -7391294, -3695647, -4130429, 8260858, -5217384, -1304346, -4782602, -2608692, 7826076, -652173, -7173903, -7608685, 4347820, 7391294, 4999993, -5869557, 2826083, 3260865, 6956512, 7608685, -8260858, -3478256, -9782595, 9565204, -2826083, 5217384, -8913031, 4782602, -6521730, -2173910, -8478249, 434782, -4565211, -4999993, 3478256, -217391, 9999986, 1739128, 3043474 };
        int k = 2;
        assertEquals(217390, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case43() {
        int[] numbers = { -9347813, -3478256, -1956519, 6304339, -4130429, -4782602, -8043467, -4999993, -6956512, -4347820, -7391294, -9130422, -7608685, 7391294, -6521730, -2608692, 9999986, -8260858, 217391, -5869557, 2826083, 0, 1956519, -1521737, -5217384, 8260858, 652173, 3913038, 7608685, 2173910, -8695640, 4565211, -1304346, -6086948, 1086955, -3695647, -1739128, -6739121, 6086948, 1521737, 8043467, -652173, 9130422, -7826076, -8478249, -3913038 };
        int k = 2;
        assertEquals(217390, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case44() {
        int[] numbers = { -6956512, -4999993, -7391294, -6521730, 0, -2608692, 5652166, -9130422, 7826076, -5434775, 3695647, -2826083, -1086955, -2173910, 1086955, 6304339, -3478256, -3260865, -4130429, 6086948, 8478249, -5652166, -9782595, -3695647, 9347813, 8043467, -217391, -652173, 4999993, -8043467, 7173903, 2608692, -9565204, -8913031, -6304339, -9999986, 9565204, -5217384, 2391301, -3913038, -6739121, 1304346, -8478249, 8260858, 6739121, -5869557 };
        int k = 2;
        assertEquals(217390, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case45() {
        int[] numbers = { -227272, 8409064, 1818176, -7727248, 8181792, -1363632, 0, -6590888, 1363632, -9090880, -1818176, -8409064, -5909072, -2499992, 2499992, -9772696, 454544, -7954520, -4772712, -909088, -3409080, -6363616, 8636336, 6818160, -2727264, -7272704, 9090880, 2727264, 1136360, 3409080, -2954536, 6136344, -5454528, -9545424, -9999968, 5454528, 7727248, 7954520, 7272704, -4090896, -2272720, 9999968, -6136344, -3636352 };
        int k = 2;
        assertEquals(227271, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case46() {
        int[] numbers = { -9361660, 7446775, 4468065, -5319125, -4255300, 7872305, -4468065, -3404240, -4680830, 5531890, -6808480, 1702120, -5106360, -8085070, -8936130, 1063825, -6170185, -5957420, 8297835, 9999955, -2553180, 6382950, -9574425, 3829770, -1489355, 5957420, 0, 8085070, -2978710, 9574425, 851060, 2765945, 2978710, 5744655, 3191475, -212765, -7234010, -6595715, -638295, 425530, 8936130, 6595715, -8297835, 2553180, -5531890, 9148895, 7021245 };
        int k = 2;
        assertEquals(212764, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case47() {
        int[] numbers = { -909088, -1590904, -3409080, 6818160, 7727248, 4772712, -3181808, 7272704, -4999984, 9772696, 1590904, -2272720, 3863624, 3636352, 681816, 1136360, -6136344, -7272704, 9999968, 3181808, -7045432, 7954520, 8181792, -5454528, 5681800, -4545440, -454544, -7499976, -8181792, 4318168, -5681800, -6363616, 2727264, 4545440, 5454528, 6363616, -8863608, -2045448, 9090880, -9545424, -5227256, -2499992, 2272720, 8863608 };
        int k = 2;
        assertEquals(227271, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case48() {
        int[] numbers = { -10000000, 10000000 };
        int k = 2;
        assertEquals(19999999, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case49() {
        int[] numbers = { 2, 3, 4 };
        int k = 2;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case50() {
        int[] numbers = { 0, 1 };
        int k = 2;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case51() {
        int[] numbers = { 2, 3 };
        int k = 2;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case52() {
        int[] numbers = { 1, 4, -6 };
        int k = 2;
        assertEquals(2, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case53() {
        int[] numbers = { 500, 1000 };
        int k = 2;
        assertEquals(499, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case54() {
        int[] numbers = { 2, 5 };
        int k = 2;
        assertEquals(2, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case55() {
        int[] numbers = { 0, 100000 };
        int k = 2;
        assertEquals(99999, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case56() {
        int[] numbers = { 0, 10000 };
        int k = 2;
        assertEquals(9999, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case57() {
        int[] numbers = { -96, -53, 2, -24, 1, -75 };
        int k = 2;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case58() {
        int[] numbers = { 2, 10, 13, 14, 17, 19 };
        int k = 2;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case59() {
        int[] numbers = { 1, 4, 5 };
        int k = 2;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case60() {
        int[] numbers = { 1, 40, 15, 9 };
        int k = 1;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case61() {
        int[] numbers = { 1, 10000000 };
        int k = 2;
        assertEquals(9999998, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case62() {
        int[] numbers = { 10000000, -10000000 };
        int k = 2;
        assertEquals(19999999, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case63() {
        int[] numbers = { 3, 5, 6 };
        int k = 2;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case64() {
        int[] numbers = { 1, 3, 5, 7, 8 };
        int k = 2;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case65() {
        int[] numbers = { 1, 8, 9 };
        int k = 2;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case66() {
        int[] numbers = { 4, 47, 7 };
        int k = 2;
        assertEquals(2, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case67() {
        int[] numbers = { -2, 1337, 1338 };
        int k = 2;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case68() {
        int[] numbers = { 1, 1000000 };
        int k = 2;
        assertEquals(999998, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case69() {
        int[] numbers = { 5, 20, 22, 50 };
        int k = 2;
        assertEquals(1, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case70() {
        int[] numbers = { 1, 10 };
        int k = 2;
        assertEquals(8, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case71() {
        int[] numbers = { 2, 1000, 1005, 1006 };
        int k = 2;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case72() {
        int[] numbers = { -2, 0 };
        int k = 2;
        assertEquals(1, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case73() {
        int[] numbers = { 1, 2 };
        int k = 2;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case74() {
        int[] numbers = { 1, 2 };
        int k = 1;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case75() {
        int[] numbers = { 1, 3 };
        int k = 2;
        assertEquals(1, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case76() {
        int[] numbers = { -1, 1 };
        int k = 2;
        assertEquals(1, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case77() {
        int[] numbers = { -40, -30, -25, -19, -12, -5 };
        int k = 2;
        assertEquals(4, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case78() {
        int[] numbers = { 2, 10, 5, 9 };
        int k = 2;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case79() {
        int[] numbers = { 3, 56, 4, 24 };
        int k = 2;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case80() {
        int[] numbers = { 2, 8, 10 };
        int k = 2;
        assertEquals(1, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case81() {
        int[] numbers = { 1, 100, 102 };
        int k = 2;
        assertEquals(1, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case82() {
        int[] numbers = { 8, 4, 2, 6, 10, 5, 14 };
        int k = 2;
        assertEquals(0, theconsecutiveintegersdivtwo.find(numbers, k));
    }

    @Test
    public void case83() {
        int[] numbers = { 1, 10, 15 };
        int k = 2;
        assertEquals(4, theconsecutiveintegersdivtwo.find(numbers, k));
    }

}
