package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class CutTest {
    Cut cut = new Cut();

    @Test
    public void case1() {
        int[] eelLengths = { 13, 20, 13 };
        int maxCuts = 2;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case2() {
        int[] eelLengths = { 5, 5, 5, 5 };
        int maxCuts = 2;
        assertEquals(0, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case3() {
        int[] eelLengths = { 34, 10, 48 };
        int maxCuts = 4;
        assertEquals(5, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case4() {
        int[] eelLengths = { 30, 50, 30, 50 };
        int maxCuts = 350;
        assertEquals(16, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case5() {
        int[] eelLengths = { 1 };
        int maxCuts = 1;
        assertEquals(0, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case6() {
        int[] eelLengths = { 10 };
        int maxCuts = 1;
        assertEquals(1, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case7() {
        int[] eelLengths = { 20 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case8() {
        int[] eelLengths = { 25, 15 };
        int maxCuts = 3;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case9() {
        int[] eelLengths = { 25, 15 };
        int maxCuts = 4;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case10() {
        int[] eelLengths = { 25, 15 };
        int maxCuts = 5;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case11() {
        int[] eelLengths = { 10, 10, 10, 10, 10, 50, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
        int maxCuts = 3;
        assertEquals(52, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case12() {
        int[] eelLengths = { 10, 10, 10, 10, 10, 50, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
        int maxCuts = 4;
        assertEquals(54, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case13() {
        int[] eelLengths = { 10, 10, 10, 10, 10, 50, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
        int maxCuts = 5;
        assertEquals(54, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case14() {
        int[] eelLengths = { 10, 10, 10, 10, 10, 50, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
        int maxCuts = 1000;
        assertEquals(54, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case15() {
        int[] eelLengths = { 999 };
        int maxCuts = 99;
        assertEquals(99, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case16() {
        int[] eelLengths = { 999 };
        int maxCuts = 100;
        assertEquals(99, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case17() {
        int[] eelLengths = { 143, 32, 59, 128, 147 };
        int maxCuts = 22;
        assertEquals(22, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case18() {
        int[] eelLengths = { 121, 117, 133, 169, 52, 71, 83, 112, 97, 53, 191, 173, 41, 124, 72 };
        int maxCuts = 143;
        assertEquals(143, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case19() {
        int[] eelLengths = { 41, 22, 11, 159, 178, 37, 182, 182, 123, 95, 98, 19, 122, 2, 88, 175, 87, 62, 83, 139, 179, 37, 131, 15, 146 };
        int maxCuts = 229;
        assertEquals(229, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case20() {
        int[] eelLengths = { 111, 163, 139, 108, 97, 125, 44, 92, 156, 49, 194, 142, 132, 42, 41, 67, 56, 176, 47, 175, 176, 154, 169, 13, 135, 133, 128, 188, 107, 7, 175, 4, 188, 59, 111 };
        int maxCuts = 385;
        assertEquals(372, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case21() {
        int[] eelLengths = { 19, 87, 158, 158, 128, 94, 152, 168, 12, 158, 51, 24, 87, 101, 141, 174, 165, 174, 155, 107, 129, 78, 194, 129, 61, 75, 175, 66, 18, 116, 186, 129, 178, 5, 53, 65, 4, 196, 144, 41, 136, 85, 131, 107, 139 };
        int maxCuts = 497;
        assertEquals(471, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case22() {
        int[] eelLengths = { 128, 553, 964, 371, 769 };
        int maxCuts = 276;
        assertEquals(276, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case23() {
        int[] eelLengths = { 957, 653, 962, 452, 709, 985, 742, 705, 991, 153, 108, 683, 684, 21, 312 };
        int maxCuts = 816;
        assertEquals(816, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case24() {
        int[] eelLengths = { 739, 618, 127, 164, 38, 961, 437, 61, 63, 463, 214, 528, 111, 949, 76, 706, 946, 292, 478, 25, 502, 372, 524, 807, 741 };
        int maxCuts = 902;
        assertEquals(902, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case25() {
        int[] eelLengths = { 537, 355, 775, 222, 801, 146, 938, 808, 206, 526, 281, 82, 411, 206, 934, 476, 405, 697, 939, 63, 483, 521, 208, 675, 647, 414, 509, 998, 889, 203, 831, 948, 605, 619, 597 };
        int maxCuts = 1000;
        assertEquals(1000, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case26() {
        int[] eelLengths = { 426, 729, 121, 319, 647, 459, 117, 37, 107, 223, 526, 117, 695, 584, 845, 216, 114, 986, 831, 586, 448, 182, 894, 426, 775, 481, 426, 782, 745, 908, 37, 835, 471, 579, 775, 15, 755, 74, 439, 836, 73, 797, 268, 32, 579 };
        int maxCuts = 1000;
        assertEquals(1000, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case27() {
        int[] eelLengths = { 120, 100, 130, 190, 140, 40 };
        int maxCuts = 48;
        assertEquals(53, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case28() {
        int[] eelLengths = { 160, 60, 10, 30, 200, 60, 100, 180, 200, 100, 170, 180, 60, 200, 40 };
        int maxCuts = 163;
        assertEquals(175, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case29() {
        int[] eelLengths = { 100, 120, 120, 150, 20, 50, 120, 110, 160, 180, 110, 200, 50, 70, 180, 30, 80, 140, 80, 180, 60, 150, 200, 140 };
        int maxCuts = 280;
        assertEquals(280, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case30() {
        int[] eelLengths = { 20, 40, 60, 90, 40, 150, 130, 50, 200, 110, 50, 80, 70, 130, 160, 80, 40, 110, 200, 50, 20, 40, 100, 170, 180, 170, 180, 150, 30, 190, 30, 160, 130 };
        int maxCuts = 353;
        assertEquals(341, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case31() {
        int[] eelLengths = { 60, 40, 90, 190, 170, 90, 80, 70, 100, 180, 160, 130, 10, 200, 30, 170, 130, 150, 150, 170, 120, 140, 110, 160, 160, 60, 120, 70, 190, 60, 100, 60, 70, 190, 20, 170, 140, 170, 150, 130, 70, 30 };
        int maxCuts = 510;
        assertEquals(486, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case32() {
        int[] eelLengths = { 580, 450, 340, 10, 190, 280 };
        int maxCuts = 185;
        assertEquals(185, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case33() {
        int[] eelLengths = { 230, 90, 600, 510, 180, 240, 220, 10, 530, 760, 600, 10, 420, 380, 800 };
        int maxCuts = 478;
        assertEquals(492, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case34() {
        int[] eelLengths = { 270, 320, 610, 40, 760, 620, 700, 440, 450, 230, 770, 230, 40, 510, 340, 780, 50, 520, 300, 180, 20, 520, 800, 610 };
        int maxCuts = 851;
        assertEquals(873, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case35() {
        int[] eelLengths = { 290, 490, 130, 740, 700, 300, 210, 800, 350, 320, 520, 50, 260, 610, 730, 560, 140, 670, 180, 170, 530, 690, 720, 640, 10, 240, 680, 780, 710, 570, 120, 420, 110 };
        int maxCuts = 1000;
        assertEquals(1027, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case36() {
        int[] eelLengths = { 570, 380, 740, 300, 650, 650, 230, 130, 360, 130, 570, 330, 240, 700, 360, 650, 350, 180, 80, 60, 560, 280, 350, 490, 670, 590, 730, 500, 20, 790, 160, 130, 220, 540, 540, 360, 700, 310, 500, 660, 120, 440 };
        int maxCuts = 1000;
        assertEquals(1031, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case37() {
        int[] eelLengths = { 220, 120, 353, 470, 393 };
        int maxCuts = 155;
        assertEquals(155, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case38() {
        int[] eelLengths = { 45, 490, 363, 30, 161, 315, 490, 187, 190, 90, 100, 233, 60, 414 };
        int maxCuts = 234;
        assertEquals(241, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case39() {
        int[] eelLengths = { 429, 170, 255, 489, 290, 116, 480, 408, 180, 450, 470, 228, 329, 310, 59, 390, 211, 410, 413, 350, 460, 472, 182 };
        int maxCuts = 588;
        assertEquals(599, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case40() {
        int[] eelLengths = { 187, 328, 420, 60, 2, 155, 380, 270, 110, 380, 34, 365, 4, 203, 248, 490, 410, 290, 440, 383, 380, 36, 175, 44, 360, 260, 387, 360, 73, 272, 210, 35 };
        int maxCuts = 527;
        assertEquals(542, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case41() {
        int[] eelLengths = { 49, 49, 235, 453, 199, 60, 266, 10, 250, 148, 175, 260, 314, 433, 373, 141, 138, 230, 204, 390, 450, 180, 460, 455, 360, 240, 470, 190, 280, 240, 434, 12, 63, 200, 280, 70, 403, 345, 50, 409, 22 };
        int maxCuts = 668;
        assertEquals(687, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case42() {
        int[] eelLengths = { 613, 930, 903, 574, 370, 390, 769, 992, 851, 502 };
        int maxCuts = 687;
        assertEquals(687, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case43() {
        int[] eelLengths = { 109, 213, 300, 845, 836, 448, 40, 240, 240, 214, 961, 240, 94, 330, 430, 552, 980, 450, 135, 363 };
        int maxCuts = 717;
        assertEquals(726, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case44() {
        int[] eelLengths = { 942, 923, 300, 619, 980, 906, 530, 810, 920, 220, 520, 760, 350, 450, 568, 500, 969, 66, 151, 690, 488, 600, 541, 360, 931, 543, 240, 564, 387, 888 };
        int maxCuts = 1000;
        assertEquals(1015, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case45() {
        int[] eelLengths = { 930, 40, 959, 303, 270, 600, 690, 844, 978, 557, 370, 932, 513, 960, 490, 770, 613, 896, 115, 1000, 811, 640, 752, 460, 700, 997, 350, 492, 241, 419, 580, 858, 920, 300, 310, 810, 70, 520, 976, 928 };
        int maxCuts = 1000;
        assertEquals(1019, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case46() {
        int[] eelLengths = { 916, 60, 80, 863, 13, 84, 679, 719, 830, 851, 621, 359, 830, 432, 180, 746, 80, 140, 420, 167, 138, 250, 352, 461, 960, 260, 230, 760, 448, 660, 40, 153, 358, 440, 390, 850, 870, 850, 300, 292, 760, 140, 960, 570, 520, 980, 756, 722, 908, 772 };
        int maxCuts = 1000;
        assertEquals(1023, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case47() {
        int[] eelLengths = { 430, 440, 300, 60, 20, 70, 540, 460, 160, 680, 430, 720, 280, 210, 530, 290, 960, 30, 200, 110, 320, 830, 470, 10, 240, 150, 810, 800, 150, 80, 20, 460, 660, 460, 10, 430, 750, 620, 190, 610, 660, 720, 400, 310, 910, 800, 720, 740, 790, 270 };
        int maxCuts = 1000;
        assertEquals(1035, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case48() {
        int[] eelLengths = { 854, 849, 701, 162, 326, 767, 159, 218, 37, 632, 71, 29, 844, 735, 47, 914, 353, 954, 125, 254, 968, 901, 226, 981, 423, 247, 952, 747, 523, 115, 709, 393, 672, 366, 325, 989, 504, 228, 203, 951, 118, 879, 434, 557, 523, 509, 783, 955, 603, 198 };
        int maxCuts = 1000;
        assertEquals(1000, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case49() {
        int[] eelLengths = { 209, 164, 456, 162, 442, 320, 171, 192, 386, 414, 440, 259, 445, 377, 141, 176, 250, 184, 250, 483, 453, 1, 415, 416, 44, 313, 103, 56, 244, 118, 277, 50, 291, 453, 287, 82, 229, 205, 27, 267, 497, 371, 35, 276, 446, 409, 48, 293, 384, 359 };
        int maxCuts = 1000;
        assertEquals(1005, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case50() {
        int[] eelLengths = { 129, 171, 120, 15, 151, 153, 126, 507, 109, 202, 141, 258, 193, 91, 207, 18, 392, 32, 203, 438, 241, 18, 125, 338, 420, 121, 150, 372, 218, 187, 138, 40, 228, 50, 382, 122, 364, 80, 387, 30, 118, 400, 475, 220, 385, 404, 408, 389, 480, 497 };
        int maxCuts = 1000;
        assertEquals(1010, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case51() {
        int[] eelLengths = { 318, 238, 10, 214, 438, 416, 1, 470, 440, 27, 88, 253, 430, 100, 212, 315, 401, 478, 378, 496, 251, 184, 150, 96, 180, 441, 40, 370, 169, 88, 9, 150, 176, 266, 439, 72, 123, 90, 114, 230, 20, 240, 142, 215, 170, 259, 444, 381, 133, 187 };
        int maxCuts = 1000;
        assertEquals(1015, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case52() {
        int[] eelLengths = { 157, 43, 465, 510, 360, 440, 45, 48, 30, 131, 250, 374, 480, 296, 132, 440, 380, 80, 244, 210, 426, 420, 25, 110, 424, 189, 502, 26, 135, 380, 338, 357, 86, 490, 310, 455, 364, 379, 312, 370, 255, 108, 342, 176, 431, 189, 210, 240, 370, 240 };
        int maxCuts = 1000;
        assertEquals(1020, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case53() {
        int[] eelLengths = { 242, 265, 527, 433, 270, 197, 90, 350, 363, 320, 426, 396, 460, 334, 40, 130, 500, 15, 322, 400, 70, 400, 270, 504, 54, 170, 500, 80, 340, 360, 68, 71, 270, 540, 350, 511, 500, 301, 176, 460, 20, 415, 330, 2, 134, 494, 178, 355, 310, 377 };
        int maxCuts = 1000;
        assertEquals(1025, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case54() {
        int[] eelLengths = { 227, 407, 11, 418, 223, 678, 928, 166, 815, 293, 684, 282, 749, 397, 256, 836, 743, 776, 497, 836, 891, 19, 727, 605, 196, 93, 57, 402, 215, 265, 215, 485, 641, 819, 937, 122, 312, 438, 157, 173, 87, 973, 19, 152, 867, 456, 626, 702, 312, 115 };
        int maxCuts = 1000;
        assertEquals(1000, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case55() {
        int[] eelLengths = { 480, 950, 500, 100, 410, 680, 910, 380, 940, 240, 310, 700, 530, 690, 670, 800, 320, 570, 700, 980, 610, 110, 700, 610, 160, 870, 570, 790, 100, 740, 880, 860, 620, 910, 790, 860, 920, 170, 200, 30, 370, 290, 850, 480, 380, 430, 890, 330, 840, 960 };
        int maxCuts = 1000;
        assertEquals(1027, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case56() {
        int[] eelLengths = { 9, 9, 1000, 9, 9, 9, 9, 9, 9, 9, 1000, 9, 1000, 9, 9, 9, 9, 9, 9, 9, 1000, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 1000, 9, 9, 9, 9 };
        int maxCuts = 99;
        assertEquals(100, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case57() {
        int[] eelLengths = { 9, 1000, 9, 9, 9, 9, 1000, 9, 9, 9, 1000, 1000, 9, 1000, 9, 1000, 1000, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 1000, 9, 9, 9, 9, 1000, 9, 9, 9, 1000, 9, 9, 9, 9, 9 };
        int maxCuts = 100;
        assertEquals(101, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case58() {
        int[] eelLengths = { 9, 9, 9, 9, 9, 9, 9, 1000, 9, 1000, 9, 9, 9, 9, 9, 9, 9, 1000, 9, 1000, 9, 9, 9, 9, 9, 1000, 1000, 1000, 1000, 9, 9, 9, 9, 9, 1000, 1000, 9, 1000, 1000, 9, 1000, 1000, 9, 9, 1000, 9, 9, 9, 9, 9 };
        int maxCuts = 101;
        assertEquals(102, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case59() {
        int[] eelLengths = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
        int maxCuts = 1;
        assertEquals(50, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case60() {
        int[] eelLengths = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 20, 20, 20, 20, 20, 20, 20, 20, 20, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 20 };
        int maxCuts = 1000;
        assertEquals(1050, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case61() {
        int[] eelLengths = { 30, 20, 15 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case62() {
        int[] eelLengths = { 13, 20, 13 };
        int maxCuts = 2;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case63() {
        int[] eelLengths = { 1, 2, 3, 4, 5, 30, 6, 7, 8, 9, 50, 10, 11, 12, 13, 14, 15, 16, 30, 17, 18, 50 };
        int maxCuts = 5;
        assertEquals(8, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case64() {
        int[] eelLengths = { 100, 90 };
        int maxCuts = 8;
        assertEquals(9, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case65() {
        int[] eelLengths = { 30, 50, 30, 50 };
        int maxCuts = 4;
        assertEquals(6, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case66() {
        int[] eelLengths = { 11, 20 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case67() {
        int[] eelLengths = { 40, 20, 20 };
        int maxCuts = 2;
        assertEquals(4, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case68() {
        int[] eelLengths = { 50, 30, 40 };
        int maxCuts = 5;
        assertEquals(7, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case69() {
        int[] eelLengths = { 100, 90, 20 };
        int maxCuts = 9;
        assertEquals(11, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case70() {
        int[] eelLengths = { 13, 40, 30 };
        int maxCuts = 2;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case71() {
        int[] eelLengths = { 23, 50, 30, 80, 20 };
        int maxCuts = 3;
        assertEquals(5, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case72() {
        int[] eelLengths = { 30, 20, 20 };
        int maxCuts = 2;
        assertEquals(4, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case73() {
        int[] eelLengths = { 100, 20 };
        int maxCuts = 3;
        assertEquals(4, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case74() {
        int[] eelLengths = { 20, 100, 20 };
        int maxCuts = 3;
        assertEquals(5, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case75() {
        int[] eelLengths = { 31, 40 };
        int maxCuts = 3;
        assertEquals(4, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case76() {
        int[] eelLengths = { 30, 20 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case77() {
        int[] eelLengths = { 10, 30, 11, 21, 20, 21, 11, 30, 10 };
        int maxCuts = 1;
        assertEquals(4, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case78() {
        int[] eelLengths = { 25, 25, 20, 30 };
        int maxCuts = 3;
        assertEquals(5, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case79() {
        int[] eelLengths = { 40, 30, 20 };
        int maxCuts = 3;
        assertEquals(5, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case80() {
        int[] eelLengths = { 23, 30 };
        int maxCuts = 2;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case81() {
        int[] eelLengths = { 40, 30, 20 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case82() {
        int[] eelLengths = { 40, 20 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case83() {
        int[] eelLengths = { 50, 30 };
        int maxCuts = 2;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case84() {
        int[] eelLengths = { 16, 32, 50, 20 };
        int maxCuts = 5;
        assertEquals(7, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case85() {
        int[] eelLengths = { 40, 20, 20 };
        int maxCuts = 3;
        assertEquals(5, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case86() {
        int[] eelLengths = { 120, 123, 45, 40, 30, 10, 20, 20, 22, 55, 30, 50 };
        int maxCuts = 8;
        assertEquals(13, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case87() {
        int[] eelLengths = { 50, 60, 15, 20, 20, 20, 15, 15, 15 };
        int maxCuts = 3;
        assertEquals(6, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case88() {
        int[] eelLengths = { 20, 20, 20, 30, 30, 30, 40, 40, 40, 40, 40 };
        int maxCuts = 5;
        assertEquals(9, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case89() {
        int[] eelLengths = { 13, 20 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case90() {
        int[] eelLengths = { 40, 30 };
        int maxCuts = 2;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case91() {
        int[] eelLengths = { 15, 15, 20, 20, 20, 25, 25 };
        int maxCuts = 3;
        assertEquals(6, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case92() {
        int[] eelLengths = { 80, 40, 40 };
        int maxCuts = 7;
        assertEquals(9, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case93() {
        int[] eelLengths = { 100, 20, 20, 20, 20, 20, 20, 20, 20, 20 };
        int maxCuts = 9;
        assertEquals(18, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case94() {
        int[] eelLengths = { 50, 50, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20 };
        int maxCuts = 8;
        assertEquals(16, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case95() {
        int[] eelLengths = { 48, 50 };
        int maxCuts = 4;
        assertEquals(5, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case96() {
        int[] eelLengths = { 80, 20 };
        int maxCuts = 2;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case97() {
        int[] eelLengths = { 100, 20 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case98() {
        int[] eelLengths = { 13, 40, 13 };
        int maxCuts = 2;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case99() {
        int[] eelLengths = { 13, 30, 20, 20, 20 };
        int maxCuts = 3;
        assertEquals(6, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case100() {
        int[] eelLengths = { 10, 13, 14, 15, 20, 30, 40, 28 };
        int maxCuts = 3;
        assertEquals(6, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case101() {
        int[] eelLengths = { 50, 20, 20, 20 };
        int maxCuts = 3;
        assertEquals(6, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case102() {
        int[] eelLengths = { 1000, 1000, 1000, 1000, 1000, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 300, 270, 110 };
        int maxCuts = 531;
        assertEquals(541, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case103() {
        int[] eelLengths = { 30, 37, 41, 20, 20, 20, 10, 10 };
        int maxCuts = 3;
        assertEquals(8, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case104() {
        int[] eelLengths = { 31, 30 };
        int maxCuts = 2;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case105() {
        int[] eelLengths = { 931, 230, 984, 724, 288, 418, 20, 20, 401, 990, 333, 10, 11, 116, 452, 1000, 727, 217, 368, 165, 863, 370, 673, 997, 829, 294, 314, 480, 542, 713, 449, 897, 850, 209, 983, 883, 307, 738, 314, 88, 631, 441, 20, 420, 15, 10, 592, 490, 6, 999 };
        int maxCuts = 888;
        assertEquals(901, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case106() {
        int[] eelLengths = { 20, 10, 13 };
        int maxCuts = 1;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case107() {
        int[] eelLengths = { 23, 20 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case108() {
        int[] eelLengths = { 13, 20, 23 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case109() {
        int[] eelLengths = { 10, 21, 50, 10, 50, 50, 20, 50, 20, 50, 20, 50, 50, 31 };
        int maxCuts = 3;
        assertEquals(8, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case110() {
        int[] eelLengths = { 100, 20, 20, 20, 20, 9 };
        int maxCuts = 9;
        assertEquals(13, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case111() {
        int[] eelLengths = { 50, 50, 50 };
        int maxCuts = 10;
        assertEquals(12, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case112() {
        int[] eelLengths = { 13, 20, 13 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case113() {
        int[] eelLengths = { 17, 20, 51 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case114() {
        int[] eelLengths = { 40, 35, 35 };
        int maxCuts = 3;
        assertEquals(4, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case115() {
        int[] eelLengths = { 15, 20, 20 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case116() {
        int[] eelLengths = { 100, 100, 20 };
        int maxCuts = 17;
        assertEquals(19, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case117() {
        int[] eelLengths = { 40, 20, 20, 20 };
        int maxCuts = 3;
        assertEquals(6, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case118() {
        int[] eelLengths = { 31, 20 };
        int maxCuts = 2;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case119() {
        int[] eelLengths = { 100, 100, 100, 20, 20 };
        int maxCuts = 2;
        assertEquals(4, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case120() {
        int[] eelLengths = { 50 };
        int maxCuts = 1;
        assertEquals(1, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case121() {
        int[] eelLengths = { 20 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case122() {
        int[] eelLengths = { 40, 40, 30 };
        int maxCuts = 5;
        assertEquals(7, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case123() {
        int[] eelLengths = { 100, 20, 20 };
        int maxCuts = 2;
        assertEquals(4, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case124() {
        int[] eelLengths = { 40, 30, 20, 40 };
        int maxCuts = 3;
        assertEquals(5, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case125() {
        int[] eelLengths = { 50 };
        int maxCuts = 2;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case126() {
        int[] eelLengths = { 20, 20, 30, 48 };
        int maxCuts = 3;
        assertEquals(5, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case127() {
        int[] eelLengths = { 30, 33 };
        int maxCuts = 2;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case128() {
        int[] eelLengths = { 1, 10, 22, 20 };
        int maxCuts = 1;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case129() {
        int[] eelLengths = { 30, 40 };
        int maxCuts = 3;
        assertEquals(4, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case130() {
        int[] eelLengths = { 30, 10 };
        int maxCuts = 2;
        assertEquals(4, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case131() {
        int[] eelLengths = { 30 };
        int maxCuts = 1;
        assertEquals(1, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case132() {
        int[] eelLengths = { 40, 30, 20, 20 };
        int maxCuts = 2;
        assertEquals(4, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case133() {
        int[] eelLengths = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
        int maxCuts = 1000;
        assertEquals(1010, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case134() {
        int[] eelLengths = { 13, 13, 20 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case135() {
        int[] eelLengths = { 50, 20, 20, 13 };
        int maxCuts = 2;
        assertEquals(4, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case136() {
        int[] eelLengths = { 5, 20, 15, 20 };
        int maxCuts = 2;
        assertEquals(4, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case137() {
        int[] eelLengths = { 23, 23, 23, 30, 33, 33, 33 };
        int maxCuts = 5;
        assertEquals(6, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case138() {
        int[] eelLengths = { 11, 30 };
        int maxCuts = 2;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case139() {
        int[] eelLengths = { 50, 20 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case140() {
        int[] eelLengths = { 15, 16, 17, 18, 19, 20 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case141() {
        int[] eelLengths = { 15, 20 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case142() {
        int[] eelLengths = { 13, 20, 10, 20 };
        int maxCuts = 1;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case143() {
        int[] eelLengths = { 50, 30, 30 };
        int maxCuts = 4;
        assertEquals(6, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case144() {
        int[] eelLengths = { 98, 72, 20, 98 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case145() {
        int[] eelLengths = { 20, 20 };
        int maxCuts = 3;
        assertEquals(4, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case146() {
        int[] eelLengths = { 12, 22, 23, 33, 60 };
        int maxCuts = 5;
        assertEquals(6, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case147() {
        int[] eelLengths = { 11, 50, 40, 13, 30, 20, 11 };
        int maxCuts = 3;
        assertEquals(5, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case148() {
        int[] eelLengths = { 20, 50 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case149() {
        int[] eelLengths = { 23, 20, 10, 11 };
        int maxCuts = 1;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case150() {
        int[] eelLengths = { 48, 10, 20 };
        int maxCuts = 1;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case151() {
        int[] eelLengths = { 48, 34, 20 };
        int maxCuts = 4;
        assertEquals(5, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case152() {
        int[] eelLengths = { 63, 40, 10, 20, 61 };
        int maxCuts = 4;
        assertEquals(7, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case153() {
        int[] eelLengths = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
        int maxCuts = 1;
        assertEquals(1, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case154() {
        int[] eelLengths = { 30, 40, 20, 20, 20 };
        int maxCuts = 3;
        assertEquals(6, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case155() {
        int[] eelLengths = { 20, 22 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case156() {
        int[] eelLengths = { 10, 11, 30 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case157() {
        int[] eelLengths = { 30, 10, 20, 20 };
        int maxCuts = 2;
        assertEquals(5, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case158() {
        int[] eelLengths = { 41, 320, 150, 460, 930, 700, 258, 952, 990, 820, 350, 899, 290, 400, 699, 440, 750, 860, 642, 10, 675, 291, 650, 126, 220, 520, 630, 17, 715, 500, 304, 160, 280, 30, 240, 419, 875, 340, 992, 360, 610, 60, 730, 960, 910, 928, 602, 530, 100, 907 };
        int maxCuts = 1000;
        assertEquals(1026, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case159() {
        int[] eelLengths = { 34, 30, 20, 20, 30 };
        int maxCuts = 4;
        assertEquals(7, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case160() {
        int[] eelLengths = { 15, 20, 25 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case161() {
        int[] eelLengths = { 11, 11, 11, 20 };
        int maxCuts = 3;
        assertEquals(4, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case162() {
        int[] eelLengths = { 30, 20, 30 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case163() {
        int[] eelLengths = { 50, 20, 20, 20 };
        int maxCuts = 4;
        assertEquals(7, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case164() {
        int[] eelLengths = { 21, 20 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case165() {
        int[] eelLengths = { 30, 50, 30, 50 };
        int maxCuts = 350;
        assertEquals(16, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case166() {
        int[] eelLengths = { 21, 57, 30 };
        int maxCuts = 2;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case167() {
        int[] eelLengths = { 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 20, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21 };
        int maxCuts = 5;
        assertEquals(6, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case168() {
        int[] eelLengths = { 50, 40 };
        int maxCuts = 2;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case169() {
        int[] eelLengths = { 30, 80, 70 };
        int maxCuts = 8;
        assertEquals(10, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case170() {
        int[] eelLengths = { 44, 40 };
        int maxCuts = 3;
        assertEquals(4, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case171() {
        int[] eelLengths = { 30, 22 };
        int maxCuts = 2;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case172() {
        int[] eelLengths = { 15, 20, 50, 20, 30, 30 };
        int maxCuts = 6;
        assertEquals(10, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case173() {
        int[] eelLengths = { 20, 70 };
        int maxCuts = 2;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case174() {
        int[] eelLengths = { 20, 23 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case175() {
        int[] eelLengths = { 50, 20, 20, 20, 20, 20 };
        int maxCuts = 5;
        assertEquals(10, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case176() {
        int[] eelLengths = { 48, 20, 20 };
        int maxCuts = 2;
        assertEquals(4, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case177() {
        int[] eelLengths = { 30, 45 };
        int maxCuts = 2;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case178() {
        int[] eelLengths = { 20, 30 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case179() {
        int[] eelLengths = { 30, 30 };
        int maxCuts = 2;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case180() {
        int[] eelLengths = { 50, 20 };
        int maxCuts = 2;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case181() {
        int[] eelLengths = { 23, 30, 13, 55 };
        int maxCuts = 2;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case182() {
        int[] eelLengths = { 13, 13, 20 };
        int maxCuts = 2;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case183() {
        int[] eelLengths = { 20, 30 };
        int maxCuts = 2;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case184() {
        int[] eelLengths = { 20, 20, 41 };
        int maxCuts = 4;
        assertEquals(6, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case185() {
        int[] eelLengths = { 90 };
        int maxCuts = 8;
        assertEquals(9, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case186() {
        int[] eelLengths = { 30 };
        int maxCuts = 2;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case187() {
        int[] eelLengths = { 85, 60, 30, 20, 20 };
        int maxCuts = 7;
        assertEquals(10, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case188() {
        int[] eelLengths = { 53, 53, 53, 60, 63, 63, 63 };
        int maxCuts = 7;
        assertEquals(8, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case189() {
        int[] eelLengths = { 1000, 20, 20, 20 };
        int maxCuts = 100;
        assertEquals(103, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case190() {
        int[] eelLengths = { 20, 30, 10 };
        int maxCuts = 3;
        assertEquals(6, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case191() {
        int[] eelLengths = { 30, 30, 2, 17, 10 };
        int maxCuts = 3;
        assertEquals(5, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case192() {
        int[] eelLengths = { 10 };
        int maxCuts = 1;
        assertEquals(1, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case193() {
        int[] eelLengths = { 30, 10, 10, 10 };
        int maxCuts = 1;
        assertEquals(4, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case194() {
        int[] eelLengths = { 50, 20 };
        int maxCuts = 3;
        assertEquals(4, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case195() {
        int[] eelLengths = { 50, 30 };
        int maxCuts = 3;
        assertEquals(4, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case196() {
        int[] eelLengths = { 20, 30, 40, 50 };
        int maxCuts = 6;
        assertEquals(9, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case197() {
        int[] eelLengths = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 30, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
        int maxCuts = 2;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case198() {
        int[] eelLengths = { 30, 50, 30 };
        int maxCuts = 4;
        assertEquals(6, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case199() {
        int[] eelLengths = { 100, 30 };
        int maxCuts = 2;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case200() {
        int[] eelLengths = { 30, 31 };
        int maxCuts = 2;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case201() {
        int[] eelLengths = { 100, 11, 21, 30, 20, 20 };
        int maxCuts = 2;
        assertEquals(4, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case202() {
        int[] eelLengths = { 50 };
        int maxCuts = 3;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case203() {
        int[] eelLengths = { 38, 20 };
        int maxCuts = 3;
        assertEquals(4, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case204() {
        int[] eelLengths = { 63, 40 };
        int maxCuts = 3;
        assertEquals(4, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case205() {
        int[] eelLengths = { 40, 20, 30, 50 };
        int maxCuts = 3;
        assertEquals(5, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case206() {
        int[] eelLengths = { 300 };
        int maxCuts = 1;
        assertEquals(1, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case207() {
        int[] eelLengths = { 100 };
        int maxCuts = 1;
        assertEquals(1, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case208() {
        int[] eelLengths = { 60, 20 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case209() {
        int[] eelLengths = { 18, 18, 12, 40, 18, 18 };
        int maxCuts = 3;
        assertEquals(4, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case210() {
        int[] eelLengths = { 50, 50, 50, 40, 30, 40 };
        int maxCuts = 5;
        assertEquals(7, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case211() {
        int[] eelLengths = { 31, 20, 20 };
        int maxCuts = 2;
        assertEquals(4, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case212() {
        int[] eelLengths = { 13, 13, 13, 40 };
        int maxCuts = 3;
        assertEquals(4, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case213() {
        int[] eelLengths = { 11, 11, 200, 200, 20, 20, 200, 1000 };
        int maxCuts = 3;
        assertEquals(5, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case214() {
        int[] eelLengths = { 20, 10 };
        int maxCuts = 1;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case215() {
        int[] eelLengths = { 60 };
        int maxCuts = 2;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case216() {
        int[] eelLengths = { 20, 20, 30 };
        int maxCuts = 2;
        assertEquals(4, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case217() {
        int[] eelLengths = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int maxCuts = 7;
        assertEquals(0, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case218() {
        int[] eelLengths = { 143, 140, 15 };
        int maxCuts = 14;
        assertEquals(15, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case219() {
        int[] eelLengths = { 23, 23, 20 };
        int maxCuts = 2;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case220() {
        int[] eelLengths = { 40, 30, 20, 20, 20 };
        int maxCuts = 3;
        assertEquals(6, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case221() {
        int[] eelLengths = { 13, 23, 40, 20, 20, 10, 33 };
        int maxCuts = 3;
        assertEquals(6, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case222() {
        int[] eelLengths = { 100, 100, 100, 19, 29, 39, 13, 33 };
        int maxCuts = 15;
        assertEquals(16, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case223() {
        int[] eelLengths = { 13, 30 };
        int maxCuts = 2;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case224() {
        int[] eelLengths = { 12, 12, 20 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case225() {
        int[] eelLengths = { 30, 10, 10, 10, 50 };
        int maxCuts = 3;
        assertEquals(7, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case226() {
        int[] eelLengths = { 39, 20, 20 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case227() {
        int[] eelLengths = { 35, 100, 30 };
        int maxCuts = 2;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case228() {
        int[] eelLengths = { 34, 28 };
        int maxCuts = 4;
        assertEquals(4, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case229() {
        int[] eelLengths = { 5, 5, 15, 20 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case230() {
        int[] eelLengths = { 70, 30, 30, 30 };
        int maxCuts = 6;
        assertEquals(9, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case231() {
        int[] eelLengths = { 13, 13, 13, 30 };
        int maxCuts = 2;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case232() {
        int[] eelLengths = { 50, 20, 20, 20, 20 };
        int maxCuts = 4;
        assertEquals(8, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case233() {
        int[] eelLengths = { 34, 30, 20 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case234() {
        int[] eelLengths = { 40, 20, 30 };
        int maxCuts = 3;
        assertEquals(5, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case235() {
        int[] eelLengths = { 27 };
        int maxCuts = 5;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case236() {
        int[] eelLengths = { 2, 30, 20 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case237() {
        int[] eelLengths = { 10, 20 };
        int maxCuts = 1;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case238() {
        int[] eelLengths = { 15, 20, 35 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case239() {
        int[] eelLengths = { 12, 20 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case240() {
        int[] eelLengths = { 19, 20, 23, 25, 72, 51, 40, 30, 20, 16, 10, 12 };
        int maxCuts = 5;
        assertEquals(9, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case241() {
        int[] eelLengths = { 19, 40, 63 };
        int maxCuts = 3;
        assertEquals(4, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case242() {
        int[] eelLengths = { 20, 20 };
        int maxCuts = 2;
        assertEquals(4, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case243() {
        int[] eelLengths = { 13, 20, 13, 23, 36 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case244() {
        int[] eelLengths = { 90, 120, 123, 45, 40, 30, 10, 20, 20, 22, 55, 30, 50 };
        int maxCuts = 8;
        assertEquals(13, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case245() {
        int[] eelLengths = { 60, 101 };
        int maxCuts = 5;
        assertEquals(6, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case246() {
        int[] eelLengths = { 100, 40, 40, 40 };
        int maxCuts = 9;
        assertEquals(12, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case247() {
        int[] eelLengths = { 10, 50, 40, 25 };
        int maxCuts = 3;
        assertEquals(5, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case248() {
        int[] eelLengths = { 30, 50, 30, 50 };
        int maxCuts = 2;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case249() {
        int[] eelLengths = { 40 };
        int maxCuts = 3;
        assertEquals(4, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case250() {
        int[] eelLengths = { 50, 50, 30 };
        int maxCuts = 3;
        assertEquals(4, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case251() {
        int[] eelLengths = { 30, 30 };
        int maxCuts = 1;
        assertEquals(1, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case252() {
        int[] eelLengths = { 40, 20, 30 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case253() {
        int[] eelLengths = { 63, 40, 20, 10, 10 };
        int maxCuts = 4;
        assertEquals(8, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case254() {
        int[] eelLengths = { 13, 13, 13, 30, 40 };
        int maxCuts = 3;
        assertEquals(4, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case255() {
        int[] eelLengths = { 30, 30, 20 };
        int maxCuts = 3;
        assertEquals(5, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case256() {
        int[] eelLengths = { 11, 11, 11, 30, 30, 30 };
        int maxCuts = 6;
        assertEquals(9, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case257() {
        int[] eelLengths = { 10, 30, 20, 3 };
        int maxCuts = 3;
        assertEquals(6, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case258() {
        int[] eelLengths = { 10, 10, 10, 10, 10, 20, 20, 20, 20, 20, 202, 20, 20 };
        int maxCuts = 6;
        assertEquals(17, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case259() {
        int[] eelLengths = { 70, 80, 23, 20, 20, 20, 13, 40, 20, 30 };
        int maxCuts = 6;
        assertEquals(11, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case260() {
        int[] eelLengths = { 10, 10, 10, 30, 30, 21, 21, 41, 45, 49 };
        int maxCuts = 4;
        assertEquals(9, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case261() {
        int[] eelLengths = { 60, 20, 20, 20, 20, 20, 20, 20, 20 };
        int maxCuts = 6;
        assertEquals(12, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case262() {
        int[] eelLengths = { 50, 50, 50, 50, 50 };
        int maxCuts = 20;
        assertEquals(25, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case263() {
        int[] eelLengths = { 30, 50, 60, 50, 40, 20, 40, 30, 60, 80 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case264() {
        int[] eelLengths = { 13, 23, 20 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case265() {
        int[] eelLengths = { 60, 20, 20, 20, 20 };
        int maxCuts = 5;
        assertEquals(9, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case266() {
        int[] eelLengths = { 30, 20, 20, 17, 10 };
        int maxCuts = 3;
        assertEquals(6, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case267() {
        int[] eelLengths = { 15, 20, 30 };
        int maxCuts = 3;
        assertEquals(5, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case268() {
        int[] eelLengths = { 60, 30, 20 };
        int maxCuts = 3;
        assertEquals(5, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case269() {
        int[] eelLengths = { 73, 20 };
        int maxCuts = 2;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case270() {
        int[] eelLengths = { 20, 30, 50 };
        int maxCuts = 3;
        assertEquals(5, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case271() {
        int[] eelLengths = { 100, 105 };
        int maxCuts = 7;
        assertEquals(7, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case272() {
        int[] eelLengths = { 34 };
        int maxCuts = 1;
        assertEquals(1, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case273() {
        int[] eelLengths = { 99, 100, 999 };
        int maxCuts = 9;
        assertEquals(10, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case274() {
        int[] eelLengths = { 15, 15, 30 };
        int maxCuts = 2;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case275() {
        int[] eelLengths = { 20, 21 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case276() {
        int[] eelLengths = { 70, 30, 30, 30, 30 };
        int maxCuts = 6;
        assertEquals(9, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case277() {
        int[] eelLengths = { 35, 30, 10, 10 };
        int maxCuts = 2;
        assertEquals(5, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case278() {
        int[] eelLengths = { 40 };
        int maxCuts = 1;
        assertEquals(1, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case279() {
        int[] eelLengths = { 30, 50, 40, 50 };
        int maxCuts = 5;
        assertEquals(7, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case280() {
        int[] eelLengths = { 20, 20, 30, 30 };
        int maxCuts = 4;
        assertEquals(7, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case281() {
        int[] eelLengths = { 19, 20, 23, 25, 72, 51, 40, 30, 20, 16, 10, 12, 13, 14 };
        int maxCuts = 5;
        assertEquals(9, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case282() {
        int[] eelLengths = { 13, 20, 33 };
        int maxCuts = 1;
        assertEquals(2, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case283() {
        int[] eelLengths = { 100 };
        int maxCuts = 3;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case284() {
        int[] eelLengths = { 70, 80, 20, 20, 20, 40, 20, 30 };
        int maxCuts = 6;
        assertEquals(11, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case285() {
        int[] eelLengths = { 13, 13, 13, 30, 40 };
        int maxCuts = 5;
        assertEquals(7, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case286() {
        int[] eelLengths = { 1000, 10 };
        int maxCuts = 5;
        assertEquals(6, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case287() {
        int[] eelLengths = { 55, 50, 50, 50, 40, 30, 40 };
        int maxCuts = 5;
        assertEquals(7, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case288() {
        int[] eelLengths = { 11, 21, 31, 41, 51, 100 };
        int maxCuts = 9;
        assertEquals(10, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case289() {
        int[] eelLengths = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
        int maxCuts = 1000;
        assertEquals(50, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case290() {
        int[] eelLengths = { 7, 74, 20 };
        int maxCuts = 2;
        assertEquals(3, cut.getMaximum(eelLengths, maxCuts));
    }

    @Test
    public void case291() {
        int[] eelLengths = { 40, 20, 20, 20, 20 };
        int maxCuts = 3;
        assertEquals(6, cut.getMaximum(eelLengths, maxCuts));
    }

}
