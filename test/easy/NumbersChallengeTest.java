package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class NumbersChallengeTest {
    NumbersChallenge numberschallenge = new NumbersChallenge();

    @Test
    public void case1() {
        int[] S = { 5, 1, 2 };
        assertEquals(4, numberschallenge.MinNumber(S));
    }

    @Test
    public void case2() {
        int[] S = { 1, 3, 26, 14, 28, 15, 3, 3, 35, 1, 2, 212, 30, 126 };
        assertEquals(500, numberschallenge.MinNumber(S));
    }

    @Test
    public void case3() {
        int[] S = { 6, 3, 33, 158, 100, 331, 4, 66, 132, 512, 2, 1, 1, 12, 3, 1, 1257, 1, 6 };
        assertEquals(2630, numberschallenge.MinNumber(S));
    }

    @Test
    public void case4() {
        int[] S = { 2, 12, 137, 3, 1, 8, 60, 25, 184, 1, 23, 6, 276 };
        assertEquals(739, numberschallenge.MinNumber(S));
    }

    @Test
    public void case5() {
        int[] S = { 53, 29, 1, 82, 125, 7, 1, 3, 29, 2, 2, 5, 7, 44, 1, 160, 3, 50, 1, 7 };
        assertEquals(613, numberschallenge.MinNumber(S));
    }

    @Test
    public void case6() {
        int[] S = { 2048, 256, 16384, 2, 1024, 8, 16, 32, 1, 512, 128, 4, 64, 4096, 8192 };
        assertEquals(32768, numberschallenge.MinNumber(S));
    }

    @Test
    public void case7() {
        int[] S = { 1024, 8, 256, 4, 2048, 4096, 64, 2, 8192, 16, 1, 512, 128, 32 };
        assertEquals(16384, numberschallenge.MinNumber(S));
    }

    @Test
    public void case8() {
        int[] S = { 32, 64, 1, 128, 2, 4, 8, 16 };
        assertEquals(256, numberschallenge.MinNumber(S));
    }

    @Test
    public void case9() {
        int[] S = { 256, 1024, 16, 2, 4, 8, 64, 128, 1, 32, 4096, 2048, 512 };
        assertEquals(8192, numberschallenge.MinNumber(S));
    }

    @Test
    public void case10() {
        int[] S = { 64, 8192, 99932, 512, 65536, 1024, 2, 2048, 4, 4096, 16384, 8, 15919, 256, 32, 1, 32768, 128, 16 };
        assertEquals(246923, numberschallenge.MinNumber(S));
    }

    @Test
    public void case11() {
        int[] S = { 2, 1, 4 };
        assertEquals(8, numberschallenge.MinNumber(S));
    }

    @Test
    public void case12() {
        int[] S = { 4, 1, 2 };
        assertEquals(8, numberschallenge.MinNumber(S));
    }

    @Test
    public void case13() {
        int[] S = { 2, 1, 2, 7 };
        assertEquals(6, numberschallenge.MinNumber(S));
    }

    @Test
    public void case14() {
        int[] S = { 46148, 4, 2, 58416, 1, 80011 };
        assertEquals(8, numberschallenge.MinNumber(S));
    }

    @Test
    public void case15() {
        int[] S = { 1, 14225, 1, 1, 1, 59962, 93481, 71261, 14875, 4 };
        assertEquals(9, numberschallenge.MinNumber(S));
    }

    @Test
    public void case16() {
        int[] S = { 19755, 72594, 48311, 98571, 1, 1, 1, 2, 1, 9408 };
        assertEquals(7, numberschallenge.MinNumber(S));
    }

    @Test
    public void case17() {
        int[] S = { 1, 4545, 99004, 17031, 60877, 9816, 3, 8, 14, 20698, 5, 1 };
        assertEquals(33, numberschallenge.MinNumber(S));
    }

    @Test
    public void case18() {
        int[] S = { 79150, 8, 8561, 51120, 29, 47009, 97589, 2, 58299, 1, 49825, 2, 4, 83988, 11752, 33509, 2, 57, 11 };
        assertEquals(117, numberschallenge.MinNumber(S));
    }

    @Test
    public void case19() {
        int[] S = { 1, 32667, 84703, 1, 58792 };
        assertEquals(3, numberschallenge.MinNumber(S));
    }

    @Test
    public void case20() {
        int[] S = { 9380, 1, 50305 };
        assertEquals(2, numberschallenge.MinNumber(S));
    }

    @Test
    public void case21() {
        int[] S = { 4, 44682, 79954, 53565, 98353, 1, 26006, 2, 2, 11421, 2 };
        assertEquals(12, numberschallenge.MinNumber(S));
    }

    @Test
    public void case22() {
        int[] S = { 84772, 50764, 47506, 3, 5, 5511, 23417, 2, 1 };
        assertEquals(12, numberschallenge.MinNumber(S));
    }

    @Test
    public void case23() {
        int[] S = { 2, 10, 9, 3, 4, 6 };
        assertEquals(1, numberschallenge.MinNumber(S));
    }

    @Test
    public void case24() {
        int[] S = { 1, 40560, 1, 928 };
        assertEquals(3, numberschallenge.MinNumber(S));
    }

    @Test
    public void case25() {
        int[] S = { 1, 1 };
        assertEquals(3, numberschallenge.MinNumber(S));
    }

    @Test
    public void case26() {
        int[] S = { 29, 55, 1, 85684, 85684, 85684, 3, 85684, 8, 33, 1, 85684, 1, 85684, 85684, 14, 85684, 1 };
        assertEquals(147, numberschallenge.MinNumber(S));
    }

    @Test
    public void case27() {
        int[] S = { 3, 2, 14, 9, 1, 1, 47, 2, 2, 32 };
        assertEquals(114, numberschallenge.MinNumber(S));
    }

    @Test
    public void case28() {
        int[] S = { 55064, 55064, 55064, 7, 3, 1, 1, 55064, 55064, 4, 55064, 55064, 3, 55064, 1, 3, 6, 55064, 12 };
        assertEquals(42, numberschallenge.MinNumber(S));
    }

    @Test
    public void case29() {
        int[] S = { 1, 92050, 1, 92050, 92050, 1, 6, 92050, 92050, 14, 1, 4, 92050, 92050, 33, 11, 92050, 92050, 3 };
        assertEquals(76, numberschallenge.MinNumber(S));
    }

    @Test
    public void case30() {
        int[] S = { 7, 44741, 44741, 1, 1, 44741, 44741, 44741, 12, 3, 12, 44741, 1, 44741, 3, 44741, 2, 8 };
        assertEquals(51, numberschallenge.MinNumber(S));
    }

    @Test
    public void case31() {
        int[] S = { 1 };
        assertEquals(2, numberschallenge.MinNumber(S));
    }

    @Test
    public void case32() {
        int[] S = { 2, 1 };
        assertEquals(4, numberschallenge.MinNumber(S));
    }

    @Test
    public void case33() {
        int[] S = { 1, 2, 1, 1 };
        assertEquals(6, numberschallenge.MinNumber(S));
    }

    @Test
    public void case34() {
        int[] S = { 1, 1, 1, 1, 1 };
        assertEquals(6, numberschallenge.MinNumber(S));
    }

    @Test
    public void case35() {
        int[] S = { 10, 5, 10, 1, 1, 4, 1, 20 };
        assertEquals(53, numberschallenge.MinNumber(S));
    }

    @Test
    public void case36() {
        int[] S = { 17183, 1, 50885, 20797, 10, 20, 43, 37249, 48449, 75677, 54065, 8, 5, 61635, 1, 1, 71149, 81500, 3, 2 };
        assertEquals(95, numberschallenge.MinNumber(S));
    }

    @Test
    public void case37() {
        int[] S = { 47222, 1, 62178, 3, 5, 5, 65487, 71317, 17, 2, 31048, 5, 8, 41824, 57562, 75483, 41, 2, 70955, 19211 };
        assertEquals(90, numberschallenge.MinNumber(S));
    }

    @Test
    public void case38() {
        int[] S = { 86151, 61450, 18234, 9, 90468, 17, 69809, 3, 88415, 23, 24, 60312, 35320, 1, 6, 7067, 1, 79865, 60, 5 };
        assertEquals(150, numberschallenge.MinNumber(S));
    }

    @Test
    public void case39() {
        int[] S = { 74271, 84843, 23652, 38973, 7, 3, 6, 1, 88876, 33265, 9, 20603, 33, 40913, 2, 4806, 49045, 10, 2, 29 };
        assertEquals(103, numberschallenge.MinNumber(S));
    }

    @Test
    public void case40() {
        int[] S = { 75105, 1, 2, 2, 87062, 40717, 24, 2, 1, 63328, 3, 1, 95196, 77310, 19266, 21865, 15, 41093, 2, 85003 };
        assertEquals(54, numberschallenge.MinNumber(S));
    }

    @Test
    public void case41() {
        int[] S = { 2, 20047, 98042, 5319, 1598, 6868, 1, 47301, 27692, 87, 2, 94767, 50758, 7, 16, 30, 53, 7, 56747, 3 };
        assertEquals(209, numberschallenge.MinNumber(S));
    }

    @Test
    public void case42() {
        int[] S = { 2, 39688, 1, 64279, 1, 26989, 14, 52436, 37830, 17915, 29382, 5, 9454, 3, 2, 3, 93588, 4, 2, 32461 };
        assertEquals(38, numberschallenge.MinNumber(S));
    }

    @Test
    public void case43() {
        int[] S = { 15347, 83708, 22160, 60267, 6, 5, 2, 11, 83508, 31485, 1, 67618, 1, 84047, 60461, 6, 41964, 3, 11, 24 };
        assertEquals(71, numberschallenge.MinNumber(S));
    }

    @Test
    public void case44() {
        int[] S = { 91671, 1, 58769, 63024, 14317, 95285, 1, 16, 1, 1, 4, 89237, 5, 42303, 1, 69789, 60660, 1, 8943, 6 };
        assertEquals(38, numberschallenge.MinNumber(S));
    }

    @Test
    public void case45() {
        int[] S = { 2, 173, 3, 2, 194, 92, 23, 41, 475, 1, 11, 2, 1, 71 };
        assertEquals(1092, numberschallenge.MinNumber(S));
    }

    @Test
    public void case46() {
        int[] S = { 1, 70560, 1, 7, 70560, 55747, 12370, 28273, 8, 18499, 1, 2, 2, 7, 79906, 74838, 44507, 28585, 1, 12 };
        assertEquals(43, numberschallenge.MinNumber(S));
    }

    @Test
    public void case47() {
        int[] S = { 16, 14, 14, 26732, 1, 2989, 190, 96410, 149, 34, 2, 362, 705, 63, 5239, 4, 488, 407, 6, 37 };
        assertEquals(2493, numberschallenge.MinNumber(S));
    }

    @Test
    public void case48() {
        int[] S = { 54, 2, 24, 1, 11, 1, 42, 44831, 3, 35, 115, 18564, 125, 1, 128, 509, 13165, 74, 8, 18962 };
        assertEquals(1134, numberschallenge.MinNumber(S));
    }

    @Test
    public void case49() {
        int[] S = { 2, 10, 1, 354, 40, 1, 1, 5, 16, 96280, 4207, 59995, 71, 121, 3, 130, 25, 2, 52827, 2 };
        assertEquals(785, numberschallenge.MinNumber(S));
    }

    @Test
    public void case50() {
        int[] S = { 42318, 3, 14, 1, 21, 71075, 88014, 2, 86718, 4, 14, 106, 1, 164, 1, 43, 51, 18, 55, 5 };
        assertEquals(504, numberschallenge.MinNumber(S));
    }

    @Test
    public void case51() {
        int[] S = { 94512, 2, 87654, 81316, 6, 5, 6, 37151, 6, 139, 1, 36, 307, 1, 377, 101, 8, 37, 58, 1 };
        assertEquals(1092, numberschallenge.MinNumber(S));
    }

    @Test
    public void case52() {
        int[] S = { 7, 34, 75798, 17, 61124, 62989, 161, 114, 450, 1, 83086, 1, 11, 22, 2, 41, 70, 11, 2, 3 };
        assertEquals(948, numberschallenge.MinNumber(S));
    }

    @Test
    public void case53() {
        int[] S = { 10, 86, 1, 1, 42, 57389, 85, 2, 1, 11754, 5, 363, 1, 5, 192, 13, 1, 13745, 40861, 7 };
        assertEquals(816, numberschallenge.MinNumber(S));
    }

    @Test
    public void case54() {
        int[] S = { 28, 4, 48463, 23, 32, 183, 202, 17, 27495, 9, 1, 46, 11935, 94762, 498, 1, 74, 1, 1, 3 };
        assertEquals(1124, numberschallenge.MinNumber(S));
    }

    @Test
    public void case55() {
        int[] S = { 78225, 29, 2, 145, 15, 141, 2, 12, 36, 82, 85390, 1, 90765, 3, 7, 88847, 1, 1, 4, 451 };
        assertEquals(933, numberschallenge.MinNumber(S));
    }

    @Test
    public void case56() {
        int[] S = { 2, 3, 1 };
        assertEquals(7, numberschallenge.MinNumber(S));
    }

    @Test
    public void case57() {
        int[] S = { 217, 76694, 1, 13546, 319, 20, 1, 1, 93155, 3, 22, 13, 25, 28, 180, 7, 78, 27008, 714, 23 };
        assertEquals(1653, numberschallenge.MinNumber(S));
    }

    @Test
    public void case58() {
        int[] S = { 16, 69, 2, 91, 452, 66170, 240, 23, 8, 909, 18, 1462, 8, 32, 1, 3257, 60, 4, 5006, 38613 };
        assertEquals(11659, numberschallenge.MinNumber(S));
    }

    @Test
    public void case59() {
        int[] S = { 738, 27, 97092, 79963, 35, 4, 70, 36, 2260, 829, 2, 242, 3, 120, 38, 10, 1, 6, 157, 68 };
        assertEquals(4647, numberschallenge.MinNumber(S));
    }

    @Test
    public void case60() {
        int[] S = { 1, 17, 6, 276, 99, 1, 87009, 1, 77, 2, 1497, 24, 1094, 11, 634, 74132, 2, 211, 64, 97 };
        assertEquals(4115, numberschallenge.MinNumber(S));
    }

    @Test
    public void case61() {
        int[] S = { 7, 185, 1, 6, 16, 64, 1, 3, 15, 85464, 26, 843, 143, 257, 71886, 33, 187, 1, 208, 1 };
        assertEquals(1998, numberschallenge.MinNumber(S));
    }

    @Test
    public void case62() {
        int[] S = { 11, 6, 688, 39130, 85, 243, 15, 1, 521, 1, 1, 1, 1, 39677, 30, 41, 28, 177, 21, 41 };
        assertEquals(1913, numberschallenge.MinNumber(S));
    }

    @Test
    public void case63() {
        int[] S = { 2, 91670, 7, 2, 2, 34, 301, 1, 2, 48, 451, 12, 62039, 16, 38, 14, 45, 227, 2, 33 };
        assertEquals(1238, numberschallenge.MinNumber(S));
    }

    @Test
    public void case64() {
        int[] S = { 134, 31, 10, 45, 3, 11, 7, 346, 68, 1, 89746, 513, 12, 1, 60, 1, 5, 40, 69615, 27 };
        assertEquals(1316, numberschallenge.MinNumber(S));
    }

    @Test
    public void case65() {
        int[] S = { 55, 2, 78, 20, 382, 121, 142, 19, 2, 10, 1, 9, 64055, 1, 288, 2, 4, 90207, 54, 7 };
        assertEquals(1198, numberschallenge.MinNumber(S));
    }

    @Test
    public void case66() {
        int[] S = { 115, 3, 1396, 1, 369, 15, 3, 1, 97455, 6, 5290, 1, 30, 91, 12, 955, 191, 43, 67, 90 };
        assertEquals(3390, numberschallenge.MinNumber(S));
    }

    @Test
    public void case67() {
        int[] S = { 28, 9, 5, 67, 4, 2, 1, 21, 34, 95, 52 };
        assertEquals(319, numberschallenge.MinNumber(S));
    }

    @Test
    public void case68() {
        int[] S = { 27, 101, 36, 485, 1, 4, 1, 14, 1, 29, 2, 86154, 325, 17, 127, 3, 208, 481, 76223, 2 };
        assertEquals(1865, numberschallenge.MinNumber(S));
    }

    @Test
    public void case69() {
        int[] S = { 12, 9, 73, 64, 38525, 3386, 5, 459, 1662, 1, 29, 843, 1, 77582, 306, 204, 2, 188, 18, 6 };
        assertEquals(7269, numberschallenge.MinNumber(S));
    }

    @Test
    public void case70() {
        int[] S = { 192, 3, 720, 2, 1, 67188, 3, 577, 85, 26, 1, 9, 60, 2153, 128, 48, 18, 288, 63746, 2146 };
        assertEquals(6461, numberschallenge.MinNumber(S));
    }

    @Test
    public void case71() {
        int[] S = { 595, 13, 74, 1832, 5041, 4355, 15611, 953, 187, 4, 3, 69609, 31, 9, 1, 9, 1, 202, 72, 585 };
        assertEquals(13968, numberschallenge.MinNumber(S));
    }

    @Test
    public void case72() {
        int[] S = { 1887, 1, 11, 93621, 1, 331, 886, 88239, 5, 49, 130, 5, 273, 2, 9, 31, 1398, 34, 112, 497 };
        assertEquals(5663, numberschallenge.MinNumber(S));
    }

    @Test
    public void case73() {
        int[] S = { 21, 259, 1, 35, 225, 812, 1, 1, 58544, 361, 14, 82, 58, 1516, 5, 17494, 541, 6, 4, 10 };
        assertEquals(3953, numberschallenge.MinNumber(S));
    }

    @Test
    public void case74() {
        int[] S = { 3, 7, 1, 1, 142, 8795, 38, 25, 85, 57, 5, 98120, 21, 805, 1208, 358, 318, 537, 10, 3 };
        assertEquals(3625, numberschallenge.MinNumber(S));
    }

    @Test
    public void case75() {
        int[] S = { 115, 54, 2, 1210, 405, 8246, 5, 46, 1, 18, 9278, 12, 8, 1, 462, 4, 3, 1034, 173, 77 };
        assertEquals(3631, numberschallenge.MinNumber(S));
    }

    @Test
    public void case76() {
        int[] S = { 86023, 1039, 3, 66, 895, 73247, 29, 2, 439, 4, 1608, 366, 11, 126, 41, 84, 3003, 7, 1, 5 };
        assertEquals(7730, numberschallenge.MinNumber(S));
    }

    @Test
    public void case77() {
        int[] S = { 42, 95, 1, 6, 406, 84422, 2745, 10, 385, 1441, 10, 913, 3, 609, 15, 142, 1, 39, 23206, 63 };
        assertEquals(6927, numberschallenge.MinNumber(S));
    }

    @Test
    public void case78() {
        int[] S = { 1, 1, 94, 7, 172, 354, 1, 8, 34, 561, 1606, 2407, 1, 12, 4, 9, 204, 19, 449, 3 };
        assertEquals(5948, numberschallenge.MinNumber(S));
    }

    @Test
    public void case79() {
        int[] S = { 16, 687, 3, 1, 5, 65822, 3486, 7, 1, 2, 728, 1092, 1, 85, 38, 84, 256, 257, 11, 2 };
        assertEquals(3277, numberschallenge.MinNumber(S));
    }

    @Test
    public void case80() {
        int[] S = { 990, 31, 15860, 1984, 1, 7931, 6, 1, 1, 248, 62, 126, 40882, 5, 498, 3963, 1, 1, 16, 90687 };
        assertEquals(31726, numberschallenge.MinNumber(S));
    }

    @Test
    public void case81() {
        int[] S = { 56138, 1, 6, 7, 1, 225, 1, 31, 12, 14372, 34357, 7188, 56, 451, 109, 1, 3592, 1796, 1, 898 };
        assertEquals(28749, numberschallenge.MinNumber(S));
    }

    @Test
    public void case82() {
        int[] S = { 62031, 9, 1, 82308, 401, 804, 99, 10, 50, 6420, 3, 1601, 3210, 1, 201, 1, 1, 26, 1, 12836 };
        assertEquals(25676, numberschallenge.MinNumber(S));
    }

    @Test
    public void case83() {
        int[] S = { 5387, 12, 2, 674, 39, 3, 2693, 1, 58558, 169, 85, 98182, 1, 21547, 21, 1, 10775, 5, 1347, 340 };
        assertEquals(43103, numberschallenge.MinNumber(S));
    }

    @Test
    public void case84() {
        int[] S = { 3245, 52475, 811, 201, 410, 54813, 1623, 24, 3, 1, 12984, 51, 5, 1, 1, 25971, 102, 5, 6490, 15 };
        assertEquals(51944, numberschallenge.MinNumber(S));
    }

    @Test
    public void case85() {
        int[] S = { 3763, 7527, 31, 12, 474, 1, 234, 7, 940, 3, 116, 4, 3, 1881, 15056, 54186, 1, 31835, 1, 60 };
        assertEquals(30115, numberschallenge.MinNumber(S));
    }

    @Test
    public void case86() {
        int[] S = { 149, 1, 17, 1, 2344, 4, 1172, 1, 37249, 2, 5, 1, 73, 1, 8, 99615, 586, 4691, 294, 35 };
        assertEquals(9386, numberschallenge.MinNumber(S));
    }

    @Test
    public void case87() {
        int[] S = { 1, 11, 700, 352, 3, 4, 70288, 3, 24, 2796, 174, 71018, 85, 1, 1, 5600, 11191, 1, 1400, 43 };
        assertEquals(22391, numberschallenge.MinNumber(S));
    }

    @Test
    public void case88() {
        int[] S = { 66766, 5832, 363, 46, 1, 731, 1, 185, 90, 1, 1, 4, 1, 62245, 13, 2917, 1456, 6, 11661, 20 };
        assertEquals(23330, numberschallenge.MinNumber(S));
    }

    @Test
    public void case89() {
        int[] S = { 14, 4, 9, 1, 1, 9, 1, 3 };
        assertEquals(43, numberschallenge.MinNumber(S));
    }

    @Test
    public void case90() {
        int[] S = { 883, 66392, 3531, 28257, 1, 14131, 57, 1, 25, 88474, 4, 1, 110, 6, 1769, 220, 442, 7064, 7, 13 };
        assertEquals(56523, numberschallenge.MinNumber(S));
    }

    @Test
    public void case91() {
        int[] S = { 883, 66392, 3531, 28257, 1, 14131, 57, 1, 25, 88474, 4, 1, 110, 6, 1769, 220, 442, 7064, 7, 13 };
        assertEquals(56523, numberschallenge.MinNumber(S));
    }

    @Test
    public void case92() {
        int[] S = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536 };
        assertEquals(131072, numberschallenge.MinNumber(S));
    }

    @Test
    public void case93() {
        int[] S = { 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000 };
        assertEquals(1, numberschallenge.MinNumber(S));
    }

    @Test
    public void case94() {
        int[] S = { 1, 2 };
        assertEquals(4, numberschallenge.MinNumber(S));
    }

    @Test
    public void case95() {
        int[] S = { 1, 10, 100, 1000, 10000, 100000, 100000, 100000, 99999, 99997, 99999, 99993, 99995, 99996, 99992, 39999, 99991, 99998, 100000, 999 };
        assertEquals(2, numberschallenge.MinNumber(S));
    }

    @Test
    public void case96() {
        int[] S = { 5 };
        assertEquals(1, numberschallenge.MinNumber(S));
    }

    @Test
    public void case97() {
        int[] S = { 2, 1, 4 };
        assertEquals(8, numberschallenge.MinNumber(S));
    }

    @Test
    public void case98() {
        int[] S = { 5, 3, 2 };
        assertEquals(1, numberschallenge.MinNumber(S));
    }

    @Test
    public void case99() {
        int[] S = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        assertEquals(211, numberschallenge.MinNumber(S));
    }

    @Test
    public void case100() {
        int[] S = { 2 };
        assertEquals(1, numberschallenge.MinNumber(S));
    }

    @Test
    public void case101() {
        int[] S = { 7 };
        assertEquals(1, numberschallenge.MinNumber(S));
    }

    @Test
    public void case102() {
        int[] S = { 5, 4, 2 };
        assertEquals(1, numberschallenge.MinNumber(S));
    }

    @Test
    public void case103() {
        int[] S = { 94512, 2, 87654, 81316, 6, 5, 6, 37151, 6, 139, 1, 36, 307, 1, 377, 101, 8, 37, 58, 1 };
        assertEquals(1092, numberschallenge.MinNumber(S));
    }

    @Test
    public void case104() {
        int[] S = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 100000 };
        assertEquals(231072, numberschallenge.MinNumber(S));
    }

    @Test
    public void case105() {
        int[] S = { 5, 2 };
        assertEquals(1, numberschallenge.MinNumber(S));
    }

    @Test
    public void case106() {
        int[] S = { 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 65536, 65537, 99999, 99988 };
        assertEquals(1, numberschallenge.MinNumber(S));
    }

    @Test
    public void case107() {
        int[] S = { 2, 100, 4 };
        assertEquals(1, numberschallenge.MinNumber(S));
    }

    @Test
    public void case108() {
        int[] S = { 1 };
        assertEquals(2, numberschallenge.MinNumber(S));
    }

    @Test
    public void case109() {
        int[] S = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 99941, 99967, 99934 };
        assertEquals(430914, numberschallenge.MinNumber(S));
    }

    @Test
    public void case110() {
        int[] S = { 2, 3, 4 };
        assertEquals(1, numberschallenge.MinNumber(S));
    }

    @Test
    public void case111() {
        int[] S = { 5, 1, 2 };
        assertEquals(4, numberschallenge.MinNumber(S));
    }

    @Test
    public void case112() {
        int[] S = { 1, 2, 3, 7, 8, 9 };
        assertEquals(31, numberschallenge.MinNumber(S));
    }

    @Test
    public void case113() {
        int[] S = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 99999 };
        assertEquals(231071, numberschallenge.MinNumber(S));
    }

    @Test
    public void case114() {
        int[] S = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 65536, 65536, 65536 };
        assertEquals(327680, numberschallenge.MinNumber(S));
    }

    @Test
    public void case115() {
        int[] S = { 5, 6, 7 };
        assertEquals(1, numberschallenge.MinNumber(S));
    }

    @Test
    public void case116() {
        int[] S = { 1, 2, 4 };
        assertEquals(8, numberschallenge.MinNumber(S));
    }

}
