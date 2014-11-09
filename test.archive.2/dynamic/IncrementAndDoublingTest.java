package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class IncrementAndDoublingTest {
    IncrementAndDoubling incrementanddoubling = new IncrementAndDoubling();

    @Test
    public void case1() {
        int[] desiredArray = { 2, 1 };
        assertEquals(3, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case2() {
        int[] desiredArray = { 16, 16, 16 };
        assertEquals(7, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case3() {
        int[] desiredArray = { 100 };
        assertEquals(9, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case4() {
        int[] desiredArray = { 0, 0, 1, 0, 1 };
        assertEquals(2, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case5() {
        int[] desiredArray = { 123, 234, 345, 456, 567, 789 };
        assertEquals(40, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case6() {
        int[] desiredArray = { 7, 5, 8, 1, 8, 6, 6, 5, 3, 5, 5, 2, 8, 9, 9, 4, 6, 9, 4, 4, 1, 9, 9, 2, 8, 4, 7, 4, 8, 8, 6, 3, 9, 4, 3, 4, 5, 1, 9, 8, 3, 8, 3, 7, 9, 3, 8, 4, 4, 7 };
        assertEquals(84, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case7() {
        int[] desiredArray = { 2 };
        assertEquals(2, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case8() {
        int[] desiredArray = { 4 };
        assertEquals(3, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case9() {
        int[] desiredArray = { 5 };
        assertEquals(4, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case10() {
        int[] desiredArray = { 12 };
        assertEquals(5, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case11() {
        int[] desiredArray = { 22 };
        assertEquals(7, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case12() {
        int[] desiredArray = { 56 };
        assertEquals(8, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case13() {
        int[] desiredArray = { 91 };
        assertEquals(11, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case14() {
        int[] desiredArray = { 139 };
        assertEquals(11, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case15() {
        int[] desiredArray = { 484 };
        assertEquals(13, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case16() {
        int[] desiredArray = { 725 };
        assertEquals(15, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case17() {
        int[] desiredArray = { 210, 236, 258 };
        assertEquals(19, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case18() {
        int[] desiredArray = { 642, 424, 49, 124 };
        assertEquals(24, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case19() {
        int[] desiredArray = { 314, 667, 264, 929, 353 };
        assertEquals(31, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case20() {
        int[] desiredArray = { 764, 204, 555, 239, 148, 706 };
        assertEquals(39, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case21() {
        int[] desiredArray = { 503, 159, 241, 843, 77, 156, 329 };
        assertEquals(46, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case22() {
        int[] desiredArray = { 14, 6, 9 };
        assertEquals(10, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case23() {
        int[] desiredArray = { 26, 31, 25, 11 };
        assertEquals(18, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case24() {
        int[] desiredArray = { 42, 22, 35, 52, 23 };
        assertEquals(21, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case25() {
        int[] desiredArray = { 3, 37, 54, 98, 64, 120 };
        assertEquals(23, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case26() {
        int[] desiredArray = { 233, 218, 36, 40, 133, 81, 116 };
        assertEquals(31, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case27() {
        int[] desiredArray = { 2, 1, 1, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 2, 2, 2, 2, 2, 1, 1, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 2, 1, 1, 2, 2, 2, 1, 2 };
        assertEquals(51, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case28() {
        int[] desiredArray = { 2, 3, 4, 3, 3, 3, 4, 2, 2, 4, 2, 2, 4, 4, 2, 2, 4, 3, 2, 2, 2, 4, 3, 3, 2, 2, 4, 2, 2, 2, 3, 2, 4, 3, 4, 2, 3, 2, 3, 4, 3, 4, 2, 3, 4, 4, 2, 4, 4, 4 };
        assertEquals(65, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case29() {
        int[] desiredArray = { 5, 5, 8, 7, 5, 5, 4, 6, 8, 4, 5, 4, 6, 6, 4, 6, 5, 7, 8, 5, 8, 4, 4, 6, 5, 5, 5, 5, 7, 6, 5, 5, 7, 7, 6, 4, 4, 4, 7, 6, 8, 4, 6, 4, 4, 7, 8, 4, 8, 8 };
        assertEquals(89, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case30() {
        int[] desiredArray = { 9, 12, 11, 14, 14, 11, 16, 11, 13, 14, 10, 9, 11, 11, 10, 12, 12, 15, 10, 11, 10, 9, 11, 9, 16, 16, 12, 11, 14, 16, 13, 15, 13, 11, 9, 12, 13, 8, 8, 15, 8, 13, 12, 15, 10, 12, 15, 8, 11, 11 };
        assertEquals(126, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case31() {
        int[] desiredArray = { 29, 19, 27, 26, 22, 31, 31, 18, 27, 26, 29, 29, 25, 23, 19, 28, 29, 18, 26, 29, 16, 21, 19, 24, 17, 21, 27, 23, 24, 21, 18, 23, 18, 32, 18, 17, 16, 28, 30, 24, 29, 17, 17, 21, 21, 29, 18, 23, 24, 19 };
        assertEquals(154, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case32() {
        int[] desiredArray = { 36, 63, 34, 40, 43, 41, 47, 33, 38, 48, 56, 57, 51, 62, 34, 38, 62, 49, 53, 52, 37, 60, 32, 50, 34, 37, 36, 61, 42, 59, 58, 64, 35, 45, 52, 49, 56, 41, 63, 50, 61, 64, 61, 32, 55, 32, 63, 33, 47, 48 };
        assertEquals(170, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case33() {
        int[] desiredArray = { 110, 85, 91, 101, 118, 124, 73, 114, 121, 120, 119, 104, 80, 106, 82, 114, 80, 119, 91, 126, 89, 78, 120, 114, 78, 82, 119, 80, 92, 120, 81, 68, 70, 79, 65, 126, 115, 83, 125, 93, 125, 101, 87, 124, 106, 119, 98, 70, 106, 65 };
        assertEquals(213, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case34() {
        int[] desiredArray = { 146, 255, 202, 165, 202, 206, 186, 184, 185, 137, 187, 255, 234, 159, 226, 130, 186, 201, 254, 160, 203, 151, 130, 178, 224, 158, 154, 139, 136, 180, 253, 250, 157, 224, 199, 235, 140, 135, 222, 201, 194, 212, 235, 172, 244, 194, 151, 242, 205, 176 };
        assertEquals(231, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case35() {
        int[] desiredArray = { 303, 394, 382, 298, 407, 337, 384, 290, 317, 308, 442, 436, 487, 401, 480, 277, 381, 259, 380, 439, 323, 475, 353, 433, 258, 464, 421, 289, 330, 282, 292, 475, 396, 504, 347, 359, 283, 312, 449, 352, 383, 491, 415, 395, 464, 471, 446, 321, 278, 358 };
        assertEquals(254, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case36() {
        int[] desiredArray = { 750, 735, 689, 977, 924, 711, 837, 955, 652, 935, 651, 888, 555, 608, 948, 719, 734, 591, 540, 764, 581, 522, 544, 552, 677, 868, 949, 933, 645, 656, 727, 935, 653, 570, 808, 713, 869, 807, 714, 878, 541, 874, 994, 655, 961, 924, 585, 734, 827, 818 };
        assertEquals(283, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case37() {
        int[] desiredArray = { 685, 655, 114, 407, 212, 7, 161, 524, 200, 298, 142, 591, 407, 551, 260, 312, 894, 758, 936, 705, 822, 660, 652, 624, 69, 122, 932, 970, 911, 51, 598, 239, 827, 124, 974, 505, 926, 500, 969, 530, 413, 981, 509, 92, 555, 161, 278, 259, 886, 381 };
        assertEquals(264, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case38() {
        int[] desiredArray = { 0, 755, 905, 371, 867, 594, 581, 166, 449, 588, 702, 251, 960, 669, 97, 348, 298, 681, 763, 654, 7, 986, 845, 997, 829, 257, 102, 861, 255, 217, 45, 717, 372, 889, 375, 945, 760, 225, 553, 229, 268, 8, 141, 211, 234, 748, 992, 480, 271, 401 };
        assertEquals(259, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case39() {
        int[] desiredArray = { 351, 126, 469, 754, 634, 934, 35, 188, 153, 528, 474, 575, 125, 397, 710, 597, 624, 235, 485, 639, 691, 6, 545, 918, 902, 55, 56, 104, 384, 741, 707, 326, 669, 757, 316, 628, 763, 997, 491, 950, 348, 898, 359, 18, 364, 460, 743, 587, 341, 265 };
        assertEquals(267, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case40() {
        int[] desiredArray = { 849, 174, 389, 560, 640, 838, 837, 708, 968, 483, 539, 730, 722, 315, 733, 791, 130, 671, 803, 446, 79, 830, 834, 334, 467, 852, 159, 767, 534, 61, 310, 25, 638, 652, 666, 494, 148, 909, 923, 654, 233, 406, 422, 96, 344, 735, 627, 280, 194, 764 };
        assertEquals(265, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case41() {
        int[] desiredArray = { 862, 933, 642, 85, 742, 504, 954, 702, 368, 717, 319, 559, 497, 960, 413, 141, 81, 914, 422, 894, 541, 166, 177, 725, 271, 821, 553, 271, 714, 113, 845, 879, 154, 786, 866, 661, 290, 290, 536, 965, 691, 471, 882, 956, 379, 81, 555, 617, 728, 611 };
        assertEquals(270, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case42() {
        int[] desiredArray = { 8, 2, 12, 1, 16, 11, 10, 5, 3, 4, 0, 2, 0, 9, 13, 15, 7, 11, 0, 7, 0, 9, 11, 1, 8, 1, 6, 11, 15, 11, 8, 1, 13, 14, 12, 16, 1, 16, 13, 3, 11, 14, 15, 12, 12, 13, 8, 0, 6, 14 };
        assertEquals(100, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case43() {
        int[] desiredArray = { 30, 24, 30, 29, 27, 31, 17, 10, 0, 26, 3, 27, 20, 24, 9, 12, 23, 27, 32, 30, 16, 30, 27, 1, 15, 21, 7, 13, 29, 22, 29, 10, 30, 5, 5, 9, 22, 15, 16, 18, 25, 3, 16, 17, 22, 3, 18, 29, 13, 1 };
        assertEquals(141, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case44() {
        int[] desiredArray = { 54, 52, 2, 50, 51, 3, 46, 29, 35, 31, 63, 49, 16, 1, 23, 23, 28, 59, 21, 6, 5, 27, 22, 47, 15, 19, 1, 18, 58, 51, 54, 26, 20, 44, 33, 18, 50, 9, 35, 52, 24, 26, 1, 41, 5, 19, 39, 58, 15, 24 };
        assertEquals(157, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case45() {
        int[] desiredArray = { 97, 86, 6, 105, 36, 86, 84, 71, 88, 126, 10, 79, 111, 58, 98, 120, 17, 8, 16, 41, 31, 48, 45, 99, 75, 93, 40, 61, 119, 45, 108, 1, 68, 34, 91, 118, 100, 121, 102, 79, 45, 51, 1, 121, 64, 2, 77, 82, 77, 96 };
        assertEquals(178, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case46() {
        int[] desiredArray = { 90, 28, 94, 111, 12, 37, 161, 122, 207, 42, 230, 108, 253, 127, 156, 128, 123, 86, 189, 236, 191, 180, 75, 95, 184, 116, 136, 238, 170, 18, 142, 203, 117, 149, 88, 29, 120, 200, 78, 125, 63, 76, 101, 0, 171, 35, 124, 26, 89, 227 };
        assertEquals(219, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case47() {
        int[] desiredArray = { 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255 };
        assertEquals(407, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case48() {
        int[] desiredArray = { 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511 };
        assertEquals(458, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case49() {
        int[] desiredArray = { 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767, 767 };
        assertEquals(459, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case50() {
        int[] desiredArray = { 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895, 895 };
        assertEquals(459, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case51() {
        int[] desiredArray = { 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959, 959 };
        assertEquals(459, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case52() {
        int[] desiredArray = { 0 };
        assertEquals(0, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case53() {
        int[] desiredArray = { 1 };
        assertEquals(1, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case54() {
        int[] desiredArray = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(0, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case55() {
        int[] desiredArray = { 0 };
        assertEquals(0, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case56() {
        int[] desiredArray = { 1, 1, 1, 1, 1, 1 };
        assertEquals(6, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case57() {
        int[] desiredArray = { 0, 0, 0 };
        assertEquals(0, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case58() {
        int[] desiredArray = { 0, 0 };
        assertEquals(0, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case59() {
        int[] desiredArray = { 0, 0, 0, 0 };
        assertEquals(0, incrementanddoubling.getMin(desiredArray));
    }

    @Test
    public void case60() {
        int[] desiredArray = { 512 };
        assertEquals(10, incrementanddoubling.getMin(desiredArray));
    }

}
