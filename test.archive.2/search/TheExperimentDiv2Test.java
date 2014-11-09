package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class TheExperimentDiv2Test {
    TheExperimentDiv2 theexperimentdiv2 = new TheExperimentDiv2();

    @Test
    public void case1() {
        int[] intensity = { 3, 4, 1, 1, 5, 6 };
        int L = 3;
        int[] leftEnd = { 3, 1, 0 };
        assertArrayEquals(new int[] { 12, 5, 3 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case2() {
        int[] intensity = { 5, 5 };
        int L = 2;
        int[] leftEnd = { 0, 0 };
        assertArrayEquals(new int[] { 10, 0 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case3() {
        int[] intensity = { 92, 11, 1000, 14, 3 };
        int L = 2;
        int[] leftEnd = { 0, 3 };
        assertArrayEquals(new int[] { 103, 17 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case4() {
        int[] intensity = { 2, 6, 15, 10, 8, 11, 99, 2, 4, 4, 4, 13 };
        int L = 4;
        int[] leftEnd = { 1, 7, 4, 5, 8, 0 };
        assertArrayEquals(new int[] { 39, 14, 110, 0, 13, 2 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case5() {
        int[] intensity = { 1 };
        int L = 1;
        int[] leftEnd = { 0 };
        assertArrayEquals(new int[] { 1 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case6() {
        int[] intensity = { 854, 932, 791, 533, 38, 824, 935, 905, 171, 319, 502, 957, 485 };
        int L = 13;
        int[] leftEnd = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertArrayEquals(new int[] { 8246, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case7() {
        int[] intensity = { 754, 775, 846, 680, 387, 956, 413, 397, 546, 592, 235, 289, 422, 591, 623, 309 };
        int L = 13;
        int[] leftEnd = { 0, 3, 0, 2 };
        assertArrayEquals(new int[] { 7292, 1523, 0, 0 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case8() {
        int[] intensity = { 42, 437, 166, 669, 598, 365, 994 };
        int L = 5;
        int[] leftEnd = { 1, 1, 0, 0, 1, 2, 2, 1, 2, 0, 2, 2, 2, 0, 1, 1, 1, 2, 2, 1, 2, 0, 2, 0, 1, 1, 1, 2, 0 };
        assertArrayEquals(new int[] { 2235, 0, 42, 0, 0, 994, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case9() {
        int[] intensity = { 331, 204, 122, 570, 174, 441, 850, 805, 508, 883, 670, 242, 226, 539, 683, 112, 862, 844, 730, 521, 113, 830, 880, 79, 417, 364, 326, 779, 776, 235, 730, 691, 747, 121, 515, 222, 89, 786, 576, 453, 90 };
        int L = 29;
        int[] leftEnd = { 2, 7, 12, 5, 9, 7, 2, 10, 6 };
        assertArrayEquals(new int[] { 15311, 2296, 1994, 0, 0, 0, 0, 0, 0 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case10() {
        int[] intensity = { 327, 10, 120 };
        int L = 1;
        int[] leftEnd = { 2, 0, 0, 0, 0, 1, 2, 2, 0, 0 };
        assertArrayEquals(new int[] { 120, 327, 0, 0, 0, 10, 0, 0, 0, 0 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case11() {
        int[] intensity = { 217, 565, 172, 834, 624, 16 };
        int L = 4;
        int[] leftEnd = { 1, 0, 1, 1, 2, 2, 2, 0, 1 };
        assertArrayEquals(new int[] { 2195, 217, 0, 0, 16, 0, 0, 0, 0 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case12() {
        int[] intensity = { 45, 892, 804, 884, 45, 255, 92, 913, 184, 393, 865, 411, 774, 873, 504, 539 };
        int L = 10;
        int[] leftEnd = { 0, 4, 6, 2, 2 };
        assertArrayEquals(new int[] { 4507, 2923, 1043, 0, 0 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case13() {
        int[] intensity = { 921, 970, 187, 170, 825, 823, 23, 462, 497, 744, 109, 97, 149, 666, 879, 639, 632, 597, 73, 229, 37, 648, 918, 694, 428, 46, 79, 99, 198, 318, 148, 104, 659, 731, 353, 151, 380, 871, 186, 670, 240, 896 };
        int L = 2;
        int[] leftEnd = { 39, 13, 26, 1, 17, 26, 11, 1, 38, 2, 17, 40, 11, 37, 19, 2, 10, 31, 10, 0, 40, 37, 10, 28, 22, 23, 33, 30, 3, 7, 12, 13, 10, 5, 22, 26, 8, 19, 10, 3, 38, 36, 40, 36, 23, 27, 17, 11, 36, 5 };
        assertArrayEquals(new int[] { 910, 1545, 178, 1157, 670, 0, 246, 0, 186, 170, 0, 896, 0, 871, 266, 0, 109, 763, 0, 921, 0, 0, 0, 516, 1612, 428, 1084, 148, 825, 959, 0, 0, 0, 846, 0, 0, 744, 0, 0, 0, 0, 380, 0, 0, 0, 0, 0, 0, 0, 0 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case14() {
        int[] intensity = { 9, 600, 651, 454, 910, 703, 726, 372 };
        int L = 5;
        int[] leftEnd = { 0, 2, 0, 1, 0, 2, 1, 2, 3, 1, 0, 2, 0, 0, 2, 0, 0, 1, 2, 2, 1, 2, 3, 0, 1, 1, 1, 0, 2, 0, 2, 2, 2, 2, 1 };
        assertArrayEquals(new int[] { 2624, 1429, 0, 0, 0, 0, 0, 0, 372, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case15() {
        int[] intensity = { 83, 432, 988, 285, 694, 809, 821, 922, 29, 971 };
        int L = 4;
        int[] leftEnd = { 2, 6, 1, 5, 0, 0, 4, 6, 1, 0, 4, 1, 5, 1, 5, 3, 2, 5, 6, 6, 4, 5, 2 };
        assertArrayEquals(new int[] { 2776, 2743, 432, 0, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case16() {
        int[] intensity = { 910, 140, 984, 28, 807, 32, 570, 829, 332, 80, 933, 829, 190, 724, 471, 919, 550, 74, 472, 84, 611, 356, 612, 731 };
        int L = 23;
        int[] leftEnd = { 1, 0 };
        assertArrayEquals(new int[] { 11358, 910 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case17() {
        int[] intensity = { 334, 861, 869, 416, 947, 218, 431, 75, 437, 374, 567, 97, 972, 498, 657, 690, 384, 989, 617, 256, 524 };
        int L = 15;
        int[] leftEnd = { 4, 6, 2, 0, 2, 5, 3, 6, 6, 2, 3, 5, 5, 2, 5, 2, 4, 5, 3, 1, 4, 3, 0, 2, 2, 4, 1 };
        assertArrayEquals(new int[] { 7953, 780, 1285, 1195, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case18() {
        int[] intensity = { 68, 982, 748, 795, 783, 169, 674, 200, 125, 782, 639, 236, 238, 976, 667, 158, 389, 46, 720, 580, 785, 424, 105, 93 };
        int L = 15;
        int[] leftEnd = { 3, 7, 9 };
        assertArrayEquals(new int[] { 6877, 2509, 198 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case19() {
        int[] intensity = { 913, 385, 69, 789, 407, 329, 998, 855, 691, 973, 180, 824, 578, 245, 402, 23, 416, 234, 623, 314, 266, 692, 769, 487, 907, 656, 904, 262, 666, 579, 809, 851, 870, 784, 852, 659, 880, 86, 794, 419, 249, 164, 839, 25, 544, 632 };
        int L = 16;
        int[] leftEnd = { 11, 23, 24, 19, 23, 2, 20, 10, 22, 25, 14, 24, 0 };
        assertArrayEquals(new int[] { 8340, 8092, 419, 0, 0, 5291, 0, 0, 0, 249, 0, 0, 1298 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case20() {
        int[] intensity = { 189, 915, 40, 344, 778, 345, 114, 602, 188, 466, 781, 955, 349, 959, 409, 685, 210 };
        int L = 6;
        int[] leftEnd = { 10, 6, 8, 0, 2, 6, 10, 4, 1, 4, 7 };
        assertArrayEquals(new int[] { 4138, 1370, 0, 2611, 0, 0, 0, 0, 0, 0, 0 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case21() {
        int[] intensity = { 70, 898, 115, 528, 333, 553, 849, 624, 6, 142, 609, 323, 311, 104, 825, 186, 972, 323, 383, 685, 650, 626, 692, 703, 589, 27, 877, 760 };
        int L = 17;
        int[] leftEnd = { 2, 8, 1, 2 };
        assertArrayEquals(new int[] { 7186, 3945, 898, 0 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case22() {
        int[] intensity = { 981, 644, 577, 815, 917, 566, 754, 826, 973, 151, 273, 33, 297, 124, 547, 549, 852, 775, 581, 263, 148, 630, 614, 589, 163, 920, 360, 73, 993, 302 };
        int L = 15;
        int[] leftEnd = { 2, 8, 0, 6, 15, 1, 15, 15, 11, 11, 14, 15, 14, 9, 15, 6, 5, 14, 8, 3, 6, 13, 0, 12, 10, 1, 4, 10, 2, 12, 3, 12, 0, 12, 9, 8, 14, 1, 10, 11, 9, 0, 11, 9, 5, 4, 2 };
        assertArrayEquals(new int[] { 8254, 3011, 1625, 0, 3400, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case23() {
        int[] intensity = { 93, 899, 961, 600, 234, 334, 567, 23, 797, 114, 774, 364, 974, 113, 374, 81, 267, 123, 236, 726, 666, 991, 768, 697, 691, 64, 785, 537 };
        int L = 27;
        int[] leftEnd = { 0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0 };
        assertArrayEquals(new int[] { 13316, 537, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case24() {
        int[] intensity = { 359, 63, 477, 306, 422, 334, 912, 861 };
        int L = 1;
        int[] leftEnd = { 2, 4, 7, 6, 0, 3, 1, 5, 1, 4, 0, 7, 6, 6, 0, 5, 3, 2, 0, 1, 2, 3, 7, 1, 6, 0, 6, 2, 0, 3, 5, 4, 6, 5, 2, 1, 7, 7, 3, 4, 2, 3, 6, 7, 2, 4 };
        assertArrayEquals(new int[] { 477, 422, 861, 912, 359, 306, 63, 334, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case25() {
        int[] intensity = { 495, 879, 588, 618, 996, 951, 47, 295, 90, 283, 80, 555, 114 };
        int L = 12;
        int[] leftEnd = { 0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1 };
        assertArrayEquals(new int[] { 5877, 114, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case26() {
        int[] intensity = { 202, 988, 517, 893, 416 };
        int L = 5;
        int[] leftEnd = { 0, 0, 0, 0, 0 };
        assertArrayEquals(new int[] { 3016, 0, 0, 0, 0 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case27() {
        int[] intensity = { 177, 773, 286, 232 };
        int L = 4;
        int[] leftEnd = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertArrayEquals(new int[] { 1468, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case28() {
        int[] intensity = { 515, 398, 509, 944, 610, 896, 304, 59, 592, 743 };
        int L = 8;
        int[] leftEnd = { 2, 1, 2, 1, 0, 2, 0, 0, 1, 0, 0, 2, 2, 1, 2, 2, 0, 0, 0, 0, 2, 1, 1, 2, 2, 2, 0, 0, 0, 2, 2 };
        assertArrayEquals(new int[] { 4657, 398, 0, 0, 515, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case29() {
        int[] intensity = { 326, 519, 339, 925, 687, 334, 223, 213, 979, 704, 665, 366, 472, 771 };
        int L = 2;
        int[] leftEnd = { 1, 9, 1, 7, 2, 12 };
        assertArrayEquals(new int[] { 858, 1369, 0, 1192, 925, 1243 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case30() {
        int[] intensity = { 640, 536, 241, 496, 618, 112, 406, 104, 835, 175, 97 };
        int L = 7;
        int[] leftEnd = { 0, 1, 2, 1, 1, 0, 3, 4, 1, 2, 4, 1, 2, 3, 1, 1, 4, 4, 0, 4, 1, 3, 3, 2, 2 };
        assertArrayEquals(new int[] { 3049, 104, 835, 0, 0, 0, 175, 97, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case31() {
        int[] intensity = { 298 };
        int L = 1;
        int[] leftEnd = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertArrayEquals(new int[] { 298, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case32() {
        int[] intensity = { 461, 262, 884, 184, 512, 388, 765, 755, 58, 855, 518, 878, 944, 105, 416 };
        int L = 13;
        int[] leftEnd = { 2, 1, 2, 0, 2, 0, 2, 0, 2, 0, 0, 0 };
        assertArrayEquals(new int[] { 7262, 262, 0, 461, 0, 0, 0, 0, 0, 0, 0, 0 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case33() {
        int[] intensity = { 859, 315, 579, 149 };
        int L = 1;
        int[] leftEnd = { 1, 0, 3, 3, 2, 0, 1 };
        assertArrayEquals(new int[] { 315, 859, 149, 0, 579, 0, 0 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case34() {
        int[] intensity = { 261, 20, 123, 558, 125, 805, 591, 129, 757, 696, 460, 702, 467 };
        int L = 11;
        int[] leftEnd = { 2, 2, 1, 0, 2, 2, 1, 0, 1, 1, 2, 2, 1, 2, 2, 1, 1, 2, 0, 2, 0, 2, 2, 2, 1, 2, 0, 0, 1, 1, 0, 0, 1, 2, 0, 1 };
        assertArrayEquals(new int[] { 5413, 0, 20, 261, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case35() {
        int[] intensity = { 826, 875, 691, 113, 10, 657, 173, 216, 460, 937, 621, 800, 34, 887, 653, 58, 729, 639, 390, 722 };
        int L = 12;
        int[] leftEnd = { 8, 4, 3, 7, 0, 8, 6, 6, 4, 4 };
        assertArrayEquals(new int[] { 6930, 1056, 113, 0, 2392, 0, 0, 0, 0, 0 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case36() {
        int[] intensity = { 694, 312, 474, 509, 228, 836, 540, 883, 331, 277, 312, 579, 664, 648, 37, 35, 231, 848, 375, 358, 426, 999, 895, 367, 158, 942, 471, 374, 17, 955, 378, 770, 768, 994, 20, 750, 551, 177, 663, 339, 297, 822, 476, 446, 782, 69, 461, 823, 678, 995 };
        int L = 50;
        int[] leftEnd = { 0 };
        assertArrayEquals(new int[] { 26034 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case37() {
        int[] intensity = { 216, 522, 197, 691, 99, 914, 250, 970, 145, 79, 685, 6, 553, 278, 642, 590, 671, 538, 831, 241, 872, 73, 259, 685, 351, 955, 431, 398, 504, 611, 104, 259, 816, 105, 423, 278, 658, 929, 690, 227, 996, 197, 52, 752, 750, 733, 121, 204, 516, 526 };
        int L = 1;
        int[] leftEnd = { 49, 18, 20, 27, 38, 38, 31, 34, 2, 45, 12, 21, 13, 23, 36, 33, 17, 14, 20, 21, 9, 31, 27, 16, 48, 13, 4, 31, 44, 15, 34, 37, 44, 26, 5, 33, 13, 35, 16, 18, 26, 16, 42, 44, 10, 4, 42, 24, 4, 22 };
        assertArrayEquals(new int[] { 526, 831, 872, 398, 690, 0, 259, 423, 197, 733, 553, 73, 278, 685, 658, 105, 538, 642, 0, 0, 79, 0, 0, 671, 516, 0, 99, 0, 750, 590, 0, 929, 0, 431, 914, 0, 0, 278, 0, 0, 0, 0, 52, 0, 685, 0, 0, 351, 0, 259 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case38() {
        int[] intensity = { 344, 349, 986, 497, 665, 709, 782, 201, 746, 442, 561, 400, 612, 551, 666, 407, 358, 142, 908, 565, 487, 1000, 61, 816, 390, 141, 908, 464, 598, 801, 882, 203, 606, 949, 743, 440, 877, 865, 231, 265, 70, 784, 299, 145, 713, 911, 365, 593, 261, 302 };
        int L = 2;
        int[] leftEnd = { 28, 47, 14, 27, 23, 0, 8, 38, 28, 10, 31, 15, 2, 44, 35, 21, 30, 32, 6, 19, 12, 16, 8, 6, 32, 10, 26, 38, 38, 0, 4, 12, 42, 20, 26, 31, 6, 35, 13, 42, 46, 36, 24, 25, 45, 4, 1, 42, 8, 6 };
        assertArrayEquals(new int[] { 1399, 854, 1073, 464, 1206, 693, 1188, 496, 0, 961, 809, 358, 1483, 1624, 1317, 1061, 882, 949, 983, 1052, 1163, 142, 0, 0, 0, 0, 908, 0, 0, 0, 1374, 0, 444, 0, 0, 0, 0, 0, 0, 0, 365, 865, 141, 0, 0, 0, 0, 0, 0, 0 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case39() {
        int[] intensity = { 844, 524, 388, 219, 502, 217, 349, 956, 352, 938, 680, 760, 293, 957, 861, 328, 530, 251, 297, 69, 717, 183, 500, 955, 933, 109, 728, 352, 390, 472, 231, 65, 995, 118, 621, 294, 763, 616, 501, 101, 611, 349, 171, 311, 217, 27, 172, 428, 524, 44 };
        int L = 6;
        int[] leftEnd = { 14, 40, 36, 43, 41, 9, 34, 24, 3, 31, 14, 3, 4, 11, 19, 12, 14 };
        assertArrayEquals(new int[] { 2336, 1686, 1981, 1124, 0, 3628, 915, 2984, 2595, 1178, 0, 0, 0, 0, 2355, 0, 0 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case40() {
        int[] intensity = { 817, 373, 74, 124, 510, 566, 807, 924, 456, 544, 208, 68, 491, 770, 503, 127, 394, 59, 71, 792, 719, 541, 568, 900, 108, 278, 278, 687, 871, 752, 783, 846, 6, 432, 575, 171, 646, 342, 553, 990, 125, 873, 693, 98, 466, 99, 319, 649, 111, 484 };
        int L = 9;
        int[] leftEnd = { 10, 6, 8, 17, 26, 6, 9, 10, 10, 37, 1, 18, 28, 36, 41 };
        assertArrayEquals(new int[] { 2691, 2731, 0, 3906, 5230, 0, 0, 0, 0, 4239, 1647, 0, 817, 0, 1563 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case41() {
        int[] intensity = { 255, 571, 202, 156, 243, 849, 301, 205, 932, 385, 898, 580, 219, 401, 742, 1, 413, 28, 662, 8, 451, 275, 870, 387, 242, 924, 861, 216, 57, 741, 655, 596, 85, 328, 32, 833, 101, 697, 437, 954, 715, 340, 428, 962, 777, 177, 932, 156, 390, 269 };
        int L = 9;
        int[] leftEnd = { 7, 15, 24, 31, 9, 8, 18, 41, 35, 9, 17, 41 };
        assertArrayEquals(new int[] { 4363, 3094, 4377, 3382, 0, 0, 0, 4431, 715, 0, 0, 0 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case42() {
        int[] intensity = { 518, 817, 108, 433, 585, 708, 713, 994, 723, 191, 770, 524, 542, 589, 14, 648, 70, 481, 591, 796, 273, 202, 36, 145, 206, 388, 537, 551, 525, 722, 753, 102, 436, 206, 894, 195, 722, 935, 674, 255, 188, 347, 475, 302, 714, 358, 323, 571, 116, 631 };
        int L = 8;
        int[] leftEnd = { 13, 8, 18, 14, 31, 31, 12, 30, 27, 16, 17, 4 };
        assertArrayEquals(new int[] { 3462, 2750, 977, 0, 4164, 0, 0, 753, 1798, 0, 0, 3000 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case43() {
        int[] intensity = { 63, 76, 556, 534, 733, 288, 384, 278, 654, 895, 662, 895, 230, 819, 630, 228, 756, 988, 207, 934, 837, 194, 824, 26, 547, 848, 855, 335, 818, 570, 202, 867, 452, 386, 610, 53, 582, 943, 517, 470, 621, 794, 569, 529, 503, 280, 472, 920, 500, 966 };
        int L = 6;
        int[] leftEnd = { 17, 1, 40, 37, 27, 31, 8, 36, 10, 44, 22, 18, 24, 28, 7, 24, 7, 39 };
        assertArrayEquals(new int[] { 3984, 2571, 3296, 1930, 3244, 1631, 4155, 0, 858, 2858, 2276, 0, 0, 0, 278, 0, 0, 0 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case44() {
        int[] intensity = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
        int L = 50;
        int[] leftEnd = { 0 };
        assertArrayEquals(new int[] { 50000 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case45() {
        int[] intensity = { 92, 11, 1000, 14, 3 };
        int L = 2;
        int[] leftEnd = { 0, 3 };
        assertArrayEquals(new int[] { 103, 17 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case46() {
        int[] intensity = { 2, 6, 15, 10, 8, 11, 99, 2, 4, 4, 4, 13 };
        int L = 4;
        int[] leftEnd = { 1, 7, 4, 5, 8, 0 };
        assertArrayEquals(new int[] { 39, 14, 110, 0, 13, 2 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case47() {
        int[] intensity = { 21, 25, 24, 35, 37, 26, 28, 48, 9, 7, 21, 19, 35, 12, 26, 28, 14, 18, 46, 2, 25, 32, 31, 48, 15, 22, 29, 7, 8, 13, 16, 15, 13, 44, 26, 11, 12, 48, 35, 42, 26, 6, 35, 37, 32, 3, 28, 45, 19, 50 };
        int L = 5;
        int[] leftEnd = { 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0 };
        assertArrayEquals(new int[] { 142, 0, 0, 0, 26, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case48() {
        int[] intensity = { 10, 10, 1, 2, 1, 4 };
        int L = 1;
        int[] leftEnd = { 0, 2, 3 };
        assertArrayEquals(new int[] { 10, 1, 2 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case49() {
        int[] intensity = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int L = 2;
        int[] leftEnd = { 2, 5, 2 };
        assertArrayEquals(new int[] { 2, 2, 0 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case50() {
        int[] intensity = { 1, 1 };
        int L = 1;
        int[] leftEnd = { 0, 1, 0 };
        assertArrayEquals(new int[] { 1, 1, 0 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

    @Test
    public void case51() {
        int[] intensity = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int L = 1;
        int[] leftEnd = { 8 };
        assertArrayEquals(new int[] { 9 }, theexperimentdiv2.determineHumidity(intensity, L, leftEnd));
    }

}
