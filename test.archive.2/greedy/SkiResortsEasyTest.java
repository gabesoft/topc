package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class SkiResortsEasyTest {
    SkiResortsEasy skiresortseasy = new SkiResortsEasy();

    @Test
    public void case1() {
        int[] altitude = { 30, 20, 20, 10 };
        assertEquals(0, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case2() {
        int[] altitude = { 5, 7, 3 };
        assertEquals(2, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case3() {
        int[] altitude = { 6, 8, 5, 4, 7, 4, 2, 3, 1 };
        assertEquals(6, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case4() {
        int[] altitude = { 23, 507 };
        assertEquals(484, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case5() {
        int[] altitude = { 249, 739, 471 };
        assertEquals(712, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case6() {
        int[] altitude = { 836, 515, 256, 985 };
        assertEquals(729, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case7() {
        int[] altitude = { 893, 564, 67, 59, 902 };
        assertEquals(843, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case8() {
        int[] altitude = { 539, 162, 187, 745, 413, 621 };
        assertEquals(1318, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case9() {
        int[] altitude = { 781, 478, 793, 32, 6, 212, 130 };
        assertEquals(645, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case10() {
        int[] altitude = { 870, 78, 227, 622, 930, 554, 578, 597 };
        assertEquals(3040, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case11() {
        int[] altitude = { 533, 901, 375, 989, 799, 37, 120, 842, 548 };
        assertEquals(2805, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case12() {
        int[] altitude = { 749, 560, 921, 166, 757, 818, 228, 584, 366, 88 };
        assertEquals(2284, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case13() {
        int[] altitude = { 733, 985, 965, 457, 553, 172, 880, 763, 421, 30, 327, 233 };
        assertEquals(2628, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case14() {
        int[] altitude = { 386, 932, 176, 785, 56, 705, 223, 336, 835, 770, 498, 674, 677, 848 };
        assertEquals(6217, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case15() {
        int[] altitude = { 112, 574, 224, 410, 3, 860, 502, 37, 123, 748, 392, 714, 319, 374, 747, 646 };
        assertEquals(6301, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case16() {
        int[] altitude = { 371, 272, 95, 980, 335, 830, 669, 491, 949, 465, 529, 220, 878, 888, 117, 57, 66, 747 };
        assertEquals(6910, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case17() {
        int[] altitude = { 712, 745, 230, 200, 648, 440, 115, 913, 627, 621, 186, 222, 741, 954, 581, 193, 266, 320, 798, 745 };
        assertEquals(6393, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case18() {
        int[] altitude = { 290, 943, 836, 208, 421, 991, 972, 684, 448, 127, 516, 444, 483, 378, 923, 674, 422, 664, 181, 179, 321, 602 };
        assertEquals(7938, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case19() {
        int[] altitude = { 479, 551, 232, 301, 509, 100, 609, 306, 76, 110, 261, 260, 200, 792, 318, 539, 148, 572, 230, 384, 294, 31, 517, 831 };
        assertEquals(5615, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case20() {
        int[] altitude = { 782, 750, 335, 705, 129, 979, 817, 867, 501, 507, 926, 901, 668, 332, 195, 631, 34, 39, 858, 138, 655, 194, 141, 777, 502, 862 };
        assertEquals(10135, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case21() {
        int[] altitude = { 740, 875, 214, 255, 735, 90, 552, 99, 296, 7, 803, 550, 321, 989, 552, 656, 25, 554, 843, 693, 225, 290, 541, 719, 105, 391, 338, 894 };
        assertEquals(10737, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case22() {
        int[] altitude = { 218, 250, 956, 746, 635, 430, 962, 113, 267, 907, 649, 333, 217, 952, 481, 142, 588, 821, 268, 586, 416, 357, 787, 856, 587, 15, 245, 433, 616, 814 };
        assertEquals(12012, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case23() {
        int[] altitude = { 439, 796, 413, 281, 807, 919, 810, 574, 2, 279, 805, 774, 829, 524, 794, 264, 546, 202, 737, 626, 450, 365, 506, 873, 337, 807, 268, 579, 988, 7, 160, 352 };
        assertEquals(14369, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case24() {
        int[] altitude = { 670, 678, 231, 581, 43, 117, 816, 856, 638, 419, 676, 869, 52, 205, 861, 346, 630, 85, 937, 350, 20, 474, 790, 293, 243, 103, 323, 108, 247, 33, 534, 870, 81, 805 };
        assertEquals(12214, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case25() {
        int[] altitude = { 88, 27, 368, 476, 88, 852, 874, 282, 614, 659, 530, 846, 127, 630, 241, 57, 697, 730, 373, 790, 692, 310, 440, 667, 23, 258, 101, 489, 18, 238, 229, 418, 993, 529, 405, 745 };
        assertEquals(14959, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case26() {
        int[] altitude = { 287, 405, 750, 328, 794, 82, 131, 370, 832, 244, 155, 304, 23, 852, 951, 677, 493, 929, 550, 904, 477, 300, 230, 672, 6, 707, 748, 594, 60, 672, 43, 477, 447, 177, 763, 530, 544, 452 };
        assertEquals(15591, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case27() {
        int[] altitude = { 45, 424, 641, 650, 217, 478, 939, 983, 702, 325, 928, 600, 213, 747, 821, 801, 215, 608, 71, 745, 880, 917, 652, 40, 700, 643, 712, 365, 589, 712, 984, 57, 273, 871, 854, 37, 862, 473, 203, 652 };
        assertEquals(20929, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case28() {
        int[] altitude = { 867, 885, 624, 54, 867, 201, 803, 670, 250, 226, 599, 942, 95, 937, 906, 57, 796, 762, 784, 882, 664, 39, 872, 162, 669, 650, 417, 79, 926, 84, 770, 823, 632, 50, 218, 190, 152, 142, 147, 888, 374, 0 };
        assertEquals(17045, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case29() {
        int[] altitude = { 689, 698, 496, 970, 538, 153, 880, 81, 368, 602, 818, 861, 484, 783, 291, 108, 784, 166, 906, 753, 681, 770, 749, 128, 121, 930, 518, 68, 846, 726, 123, 391, 842, 325, 498, 831, 741, 236, 798, 672, 542, 19, 391, 327 };
        assertEquals(17901, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case30() {
        int[] altitude = { 370, 74, 378, 939, 990, 843, 38, 556, 577, 218, 172, 119, 808, 111, 849, 888, 733, 574, 476, 820, 201, 938, 633, 522, 492, 642, 857, 179, 595, 761, 938, 437, 183, 64, 387, 953, 864, 718, 325, 111, 852, 709, 28, 127, 68, 152 };
        assertEquals(21049, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case31() {
        int[] altitude = { 78, 653, 56, 299, 348, 830, 78, 243, 163, 931, 354, 389, 215, 653, 373, 672, 13, 785, 573, 649, 369, 817, 206, 104, 473, 433, 436, 21, 435, 905, 420, 699, 14, 921, 896, 721, 842, 450, 318, 236, 966, 19, 403, 560, 613, 259, 653, 754 };
        assertEquals(20942, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case32() {
        int[] altitude = { 978, 599, 991, 768, 170, 384, 706, 260, 445, 585, 743, 520, 172, 60, 422, 89, 267, 375, 477, 741, 782, 517, 951, 263, 277, 502, 402, 440, 888, 145, 85, 599, 711, 974, 113, 523, 878, 81, 495, 294, 524, 67, 444, 77, 633, 767, 731, 730, 918, 493 };
        assertEquals(18531, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case33() {
        int[] altitude = { 0, 0 };
        assertEquals(0, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case34() {
        int[] altitude = { 1000, 1000 };
        assertEquals(0, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case35() {
        int[] altitude = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(0, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case36() {
        int[] altitude = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
        assertEquals(0, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case37() {
        int[] altitude = { 712, 745, 230, 200, 648, 440, 115, 913, 627, 621, 186, 222, 741, 954, 581, 193, 266, 320, 798, 745 };
        assertEquals(6393, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case38() {
        int[] altitude = { 10, 50, 30, 5, 10, 100, 1 };
        assertEquals(160, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case39() {
        int[] altitude = { 1, 3, 2, 0 };
        assertEquals(3, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case40() {
        int[] altitude = { 5, 7, 10 };
        assertEquals(7, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case41() {
        int[] altitude = { 6, 8, 5, 4, 7, 4, 2, 3, 1 };
        assertEquals(6, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case42() {
        int[] altitude = { 30, 31 };
        assertEquals(1, skiresortseasy.minCost(altitude));
    }

    @Test
    public void case43() {
        int[] altitude = { 2, 3, 5 };
        assertEquals(4, skiresortseasy.minCost(altitude));
    }

}
