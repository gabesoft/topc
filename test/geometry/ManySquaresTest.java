package topc.test.geometry;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.geometry.*;

public class ManySquaresTest {
    ManySquares manysquares = new ManySquares();

    @Test
    public void case1() {
        int[] sticks = { 1, 1, 2, 2, 1, 1, 2 };
        assertEquals(1, manysquares.howManySquares(sticks));
    }

    @Test
    public void case2() {
        int[] sticks = { 3, 1, 4, 4, 4, 10, 10, 10, 10 };
        assertEquals(1, manysquares.howManySquares(sticks));
    }

    @Test
    public void case3() {
        int[] sticks = { 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 3, 3 };
        assertEquals(3, manysquares.howManySquares(sticks));
    }

    @Test
    public void case4() {
        int[] sticks = { 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case5() {
        int[] sticks = { 43 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case6() {
        int[] sticks = { 379 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case7() {
        int[] sticks = { 71 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case8() {
        int[] sticks = { 181 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case9() {
        int[] sticks = { 371 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case10() {
        int[] sticks = { 715 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case11() {
        int[] sticks = { 404, 404 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case12() {
        int[] sticks = { 942, 942 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case13() {
        int[] sticks = { 166, 363 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case14() {
        int[] sticks = { 999, 746 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case15() {
        int[] sticks = { 16, 677 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case16() {
        int[] sticks = { 902, 618 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case17() {
        int[] sticks = { 703, 703, 703 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case18() {
        int[] sticks = { 441, 67, 67 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case19() {
        int[] sticks = { 766, 421, 586 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case20() {
        int[] sticks = { 421, 859, 62 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case21() {
        int[] sticks = { 12, 12, 468 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case22() {
        int[] sticks = { 641, 511, 575 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case23() {
        int[] sticks = { 191, 191, 191, 191 };
        assertEquals(1, manysquares.howManySquares(sticks));
    }

    @Test
    public void case24() {
        int[] sticks = { 539, 800, 539, 539 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case25() {
        int[] sticks = { 138, 603, 603, 652 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case26() {
        int[] sticks = { 790, 417, 417, 946 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case27() {
        int[] sticks = { 521, 460, 283, 509 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case28() {
        int[] sticks = { 511, 746, 941, 511 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case29() {
        int[] sticks = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
        assertEquals(5, manysquares.howManySquares(sticks));
    }

    @Test
    public void case30() {
        int[] sticks = { 380, 472, 472, 380, 380, 380, 472, 472, 380, 472, 380, 472, 472, 380, 380, 380, 472, 472, 380, 380, 380, 472, 472 };
        assertEquals(5, manysquares.howManySquares(sticks));
    }

    @Test
    public void case31() {
        int[] sticks = { 819, 93, 819, 819, 819, 819, 149, 93, 93, 93, 93, 819, 93, 93, 93, 149, 819, 819, 93, 819, 149, 93, 149 };
        assertEquals(5, manysquares.howManySquares(sticks));
    }

    @Test
    public void case32() {
        int[] sticks = { 525, 887, 671, 64, 671, 64, 671, 525, 525, 389, 64, 525, 525, 671, 64, 887, 525, 64, 389, 389, 64, 671, 64 };
        assertEquals(3, manysquares.howManySquares(sticks));
    }

    @Test
    public void case33() {
        int[] sticks = { 435, 304, 258, 435, 203, 304, 510, 382, 235, 258, 203, 235, 304, 203, 398, 203, 273, 258, 382, 203, 304, 510, 510 };
        assertEquals(2, manysquares.howManySquares(sticks));
    }

    @Test
    public void case34() {
        int[] sticks = { 259, 403, 459, 403, 813, 67, 717, 98, 459, 63, 446, 847, 540, 945, 219, 966, 477, 758, 935, 546, 485, 403, 555 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case35() {
        int[] sticks = { 105, 105, 105, 105, 105, 105, 105, 105, 105, 105, 105, 105, 105, 105, 105, 105, 105, 105, 105, 105 };
        assertEquals(5, manysquares.howManySquares(sticks));
    }

    @Test
    public void case36() {
        int[] sticks = { 11, 11, 11, 625, 625, 11, 625, 625, 625, 11, 11, 625, 11, 11, 625, 625, 625, 625, 11, 11 };
        assertEquals(4, manysquares.howManySquares(sticks));
    }

    @Test
    public void case37() {
        int[] sticks = { 791, 315, 315, 791, 166, 166, 166, 315, 166, 791, 166, 791, 166, 315, 315, 791, 166, 791, 791, 791 };
        assertEquals(4, manysquares.howManySquares(sticks));
    }

    @Test
    public void case38() {
        int[] sticks = { 315, 568, 315, 789, 568, 55, 315, 789, 315, 315, 55, 55, 789, 315, 568, 55, 789, 55, 476, 476 };
        assertEquals(3, manysquares.howManySquares(sticks));
    }

    @Test
    public void case39() {
        int[] sticks = { 30, 475, 475, 147, 477, 475, 475, 857, 857, 385, 858, 475, 882, 858, 882, 911, 911, 857, 385, 626 };
        assertEquals(1, manysquares.howManySquares(sticks));
    }

    @Test
    public void case40() {
        int[] sticks = { 275, 629, 837, 381, 205, 946, 347, 593, 903, 586, 865, 860, 388, 501, 197, 878, 245, 837, 593, 929 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case41() {
        int[] sticks = { 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798, 798 };
        assertEquals(7, manysquares.howManySquares(sticks));
    }

    @Test
    public void case42() {
        int[] sticks = { 894, 219, 894, 894, 219, 894, 219, 894, 219, 894, 219, 219, 219, 219, 219, 219, 219, 894, 894, 894, 894, 219, 219, 219, 894, 219, 894, 894, 894, 219, 219 };
        assertEquals(7, manysquares.howManySquares(sticks));
    }

    @Test
    public void case43() {
        int[] sticks = { 890, 416, 890, 416, 890, 273, 416, 890, 273, 273, 416, 273, 416, 416, 416, 273, 890, 890, 273, 890, 416, 890, 890, 890, 890, 890, 416, 416, 273, 416, 273 };
        assertEquals(7, manysquares.howManySquares(sticks));
    }

    @Test
    public void case44() {
        int[] sticks = { 719, 369, 369, 719, 719, 280, 280, 280, 958, 369, 369, 719, 958, 719, 369, 958, 719, 958, 958, 369, 844, 719, 958, 280, 280, 844, 844, 369, 369, 958, 369 };
        assertEquals(5, manysquares.howManySquares(sticks));
    }

    @Test
    public void case45() {
        int[] sticks = { 117, 11, 11, 411, 117, 655, 246, 246, 117, 517, 118, 118, 794, 117, 655, 411, 411, 594, 118, 232, 655, 517, 594, 232, 117, 594, 246, 411, 411, 517, 117 };
        assertEquals(2, manysquares.howManySquares(sticks));
    }

    @Test
    public void case46() {
        int[] sticks = { 886, 805, 153, 300, 361, 361, 660, 32, 760, 818, 805, 77, 624, 859, 869, 756, 104, 624, 408, 869, 36, 839, 37, 818, 1, 543, 869, 820, 297, 280, 222 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case47() {
        int[] sticks = { 964, 964, 964, 964, 964, 964, 964, 964, 964 };
        assertEquals(2, manysquares.howManySquares(sticks));
    }

    @Test
    public void case48() {
        int[] sticks = { 545, 72, 545, 545, 72, 545, 72, 72, 545 };
        assertEquals(2, manysquares.howManySquares(sticks));
    }

    @Test
    public void case49() {
        int[] sticks = { 981, 478, 478, 478, 478, 89, 478, 478, 478 };
        assertEquals(1, manysquares.howManySquares(sticks));
    }

    @Test
    public void case50() {
        int[] sticks = { 121, 991, 675, 276, 121, 276, 39, 276, 39 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case51() {
        int[] sticks = { 487, 229, 853, 853, 853, 900, 853, 553, 358 };
        assertEquals(1, manysquares.howManySquares(sticks));
    }

    @Test
    public void case52() {
        int[] sticks = { 918, 965, 757, 684, 489, 442, 979, 194, 311 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case53() {
        int[] sticks = { 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805, 805 };
        assertEquals(9, manysquares.howManySquares(sticks));
    }

    @Test
    public void case54() {
        int[] sticks = { 853, 853, 604, 853, 604, 604, 853, 853, 853, 604, 604, 604, 853, 604, 853, 853, 853, 604, 604, 853, 853, 604, 604, 604, 604, 853, 604, 853, 853, 853, 604, 604, 604, 853, 604, 604, 853 };
        assertEquals(8, manysquares.howManySquares(sticks));
    }

    @Test
    public void case55() {
        int[] sticks = { 636, 636, 636, 636, 710, 710, 710, 710, 533, 636, 636, 710, 533, 710, 636, 533, 710, 710, 710, 710, 710, 636, 710, 533, 533, 533, 533, 533, 533, 636, 533, 710, 636, 636, 636, 636, 533 };
        assertEquals(8, manysquares.howManySquares(sticks));
    }

    @Test
    public void case56() {
        int[] sticks = { 48, 908, 48, 253, 30, 48, 908, 24, 253, 253, 24, 30, 908, 253, 908, 253, 24, 30, 24, 908, 253, 908, 253, 253, 48, 253, 908, 24, 48, 24, 253, 24, 24, 48, 24, 24, 48 };
        assertEquals(6, manysquares.howManySquares(sticks));
    }

    @Test
    public void case57() {
        int[] sticks = { 738, 76, 146, 628, 205, 76, 333, 282, 646, 738, 646, 282, 205, 998, 76, 628, 333, 998, 205, 998, 205, 205, 282, 628, 333, 738, 76, 738, 205, 282, 76, 333, 76, 998, 628, 282, 282 };
        assertEquals(7, manysquares.howManySquares(sticks));
    }

    @Test
    public void case58() {
        int[] sticks = { 351, 21, 351, 144, 35, 594, 601, 601, 554, 90, 411, 171, 785, 496, 270, 70, 433, 578, 94, 167, 220, 90, 295, 837, 327, 220, 656, 90, 819, 336, 493, 351, 501, 282, 969, 969, 282 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case59() {
        int[] sticks = { 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958, 958 };
        assertEquals(12, manysquares.howManySquares(sticks));
    }

    @Test
    public void case60() {
        int[] sticks = { 75, 75, 75, 75, 327, 75, 327, 327, 327, 75, 327, 75, 75, 327, 327, 75, 75, 75, 75, 327, 75, 327, 75, 75, 75, 327, 327, 327, 75, 75, 75, 75, 75, 327, 327, 75, 75, 75, 327, 327, 75, 75, 327, 75, 327, 75, 327, 327 };
        assertEquals(12, manysquares.howManySquares(sticks));
    }

    @Test
    public void case61() {
        int[] sticks = { 752, 180, 180, 642, 642, 642, 180, 180, 752, 180, 642, 752, 642, 642, 180, 752, 180, 642, 752, 180, 180, 180, 642, 752, 642, 752, 642, 642, 642, 752, 752, 180, 752, 642, 180, 642, 180, 752, 642, 642, 180, 642, 180, 180, 642, 180, 642, 180 };
        assertEquals(10, manysquares.howManySquares(sticks));
    }

    @Test
    public void case62() {
        int[] sticks = { 750, 750, 587, 587, 750, 488, 344, 750, 587, 344, 488, 587, 970, 344, 750, 970, 488, 344, 488, 750, 970, 750, 587, 970, 750, 587, 587, 750, 344, 970, 750, 750, 750, 750, 970, 488, 587, 344, 488, 344, 970, 587, 587, 587, 970, 750, 587, 344 };
        assertEquals(11, manysquares.howManySquares(sticks));
    }

    @Test
    public void case63() {
        int[] sticks = { 196, 196, 54, 54, 196, 141, 209, 209, 876, 54, 71, 54, 209, 509, 422, 498, 876, 509, 509, 71, 54, 54, 141, 141, 71, 509, 498, 141, 196, 509, 71, 71, 209, 422, 196, 141, 71, 422, 209, 422, 802, 498, 209, 54, 71, 141, 54, 509 };
        assertEquals(8, manysquares.howManySquares(sticks));
    }

    @Test
    public void case64() {
        int[] sticks = { 347, 690, 109, 145, 885, 145, 555, 305, 680, 318, 636, 476, 877, 395, 850, 332, 442, 775, 305, 815, 775, 304, 350, 422, 141, 772, 891, 212, 772, 885, 377, 395, 901, 625, 885, 413, 52, 443, 413, 726, 901, 106, 690, 443, 332, 20, 106, 275 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case65() {
        int[] sticks = { 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179, 179 };
        assertEquals(6, manysquares.howManySquares(sticks));
    }

    @Test
    public void case66() {
        int[] sticks = { 60, 60, 934, 60, 60, 60, 934, 934, 934, 934, 60, 60, 934, 60, 60, 934, 934, 60, 934, 60, 60, 60, 934, 60, 60, 60, 934 };
        assertEquals(6, manysquares.howManySquares(sticks));
    }

    @Test
    public void case67() {
        int[] sticks = { 18, 284, 384, 384, 18, 384, 384, 18, 18, 284, 384, 384, 384, 18, 18, 384, 384, 284, 18, 18, 284, 18, 18, 18, 18, 18, 284 };
        assertEquals(6, manysquares.howManySquares(sticks));
    }

    @Test
    public void case68() {
        int[] sticks = { 851, 658, 344, 851, 209, 115, 209, 209, 851, 851, 115, 344, 115, 344, 115, 658, 851, 344, 115, 115, 851, 658, 658, 209, 115, 851, 851 };
        assertEquals(6, manysquares.howManySquares(sticks));
    }

    @Test
    public void case69() {
        int[] sticks = { 248, 796, 280, 956, 280, 782, 782, 280, 466, 280, 796, 496, 796, 66, 248, 782, 796, 782, 248, 248, 782, 796, 782, 956, 782, 248, 782 };
        assertEquals(5, manysquares.howManySquares(sticks));
    }

    @Test
    public void case70() {
        int[] sticks = { 498, 962, 742, 624, 76, 114, 897, 827, 450, 839, 153, 23, 543, 237, 375, 914, 241, 852, 217, 784, 343, 36, 871, 481, 406, 646, 156 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case71() {
        int[] sticks = { 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764, 764 };
        assertEquals(12, manysquares.howManySquares(sticks));
    }

    @Test
    public void case72() {
        int[] sticks = { 499, 499, 499, 447, 499, 499, 447, 447, 499, 447, 447, 499, 499, 499, 499, 447, 447, 447, 499, 499, 499, 447, 447, 447, 447, 447, 447, 447, 447, 499, 499, 447, 447, 499, 447, 499, 499, 499, 499, 447, 499, 447, 499, 499, 447, 447, 447, 447, 447, 499 };
        assertEquals(12, manysquares.howManySquares(sticks));
    }

    @Test
    public void case73() {
        int[] sticks = { 472, 758, 758, 472, 875, 875, 472, 875, 472, 758, 758, 875, 875, 472, 472, 758, 472, 758, 758, 472, 758, 758, 472, 472, 875, 472, 472, 758, 472, 758, 758, 875, 758, 758, 875, 875, 472, 875, 758, 875, 758, 875, 758, 875, 875, 875, 472, 472, 875, 758 };
        assertEquals(12, manysquares.howManySquares(sticks));
    }

    @Test
    public void case74() {
        int[] sticks = { 352, 237, 402, 757, 352, 757, 402, 237, 237, 237, 14, 757, 352, 402, 14, 757, 402, 14, 14, 237, 757, 402, 237, 237, 757, 352, 352, 402, 402, 402, 237, 352, 402, 352, 237, 757, 237, 757, 352, 402, 14, 237, 757, 237, 352, 14, 237, 237, 237, 402 };
        assertEquals(10, manysquares.howManySquares(sticks));
    }

    @Test
    public void case75() {
        int[] sticks = { 80, 435, 743, 435, 100, 683, 683, 683, 771, 406, 572, 771, 743, 821, 821, 743, 406, 406, 100, 743, 80, 821, 435, 100, 572, 406, 572, 771, 572, 771, 771, 406, 821, 406, 382, 572, 771, 100, 771, 80, 80, 821, 80, 743, 683, 743, 572, 771, 382, 572 };
        assertEquals(9, manysquares.howManySquares(sticks));
    }

    @Test
    public void case76() {
        int[] sticks = { 427, 952, 747, 881, 396, 695, 468, 553, 520, 582, 902, 338, 66, 83, 870, 406, 62, 902, 642, 613, 640, 72, 468, 452, 902, 396, 642, 695, 395, 154, 870, 154, 870, 478, 478, 553, 981, 427, 840, 964, 330, 406, 553, 72, 981, 986, 395, 636, 395, 997 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case77() {
        int[] sticks = { 334, 334, 334, 334, 334 };
        assertEquals(1, manysquares.howManySquares(sticks));
    }

    @Test
    public void case78() {
        int[] sticks = { 529, 802, 802, 529, 802 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case79() {
        int[] sticks = { 192, 296, 896, 896, 296 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case80() {
        int[] sticks = { 216, 84, 576, 84, 84 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case81() {
        int[] sticks = { 915, 45, 417, 896, 767 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case82() {
        int[] sticks = { 880, 335, 630, 625, 408 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case83() {
        int[] sticks = { 833, 833, 833, 833, 833, 833, 833, 833, 833, 833, 833, 833, 833, 833, 833, 833, 833, 833, 833, 833, 833, 833, 833, 833 };
        assertEquals(6, manysquares.howManySquares(sticks));
    }

    @Test
    public void case84() {
        int[] sticks = { 782, 782, 184, 184, 782, 184, 782, 184, 782, 782, 184, 184, 782, 184, 782, 782, 782, 782, 184, 782, 782, 782, 184, 184 };
        assertEquals(5, manysquares.howManySquares(sticks));
    }

    @Test
    public void case85() {
        int[] sticks = { 498, 266, 705, 498, 705, 705, 266, 705, 266, 266, 705, 705, 705, 266, 705, 705, 498, 266, 498, 266, 705, 705, 705, 705 };
        assertEquals(5, manysquares.howManySquares(sticks));
    }

    @Test
    public void case86() {
        int[] sticks = { 492, 24, 162, 865, 492, 162, 924, 924, 24, 162, 492, 492, 162, 492, 924, 162, 24, 162, 24, 162, 492, 162, 162, 924 };
        assertEquals(5, manysquares.howManySquares(sticks));
    }

    @Test
    public void case87() {
        int[] sticks = { 30, 30, 658, 821, 71, 73, 511, 71, 73, 195, 30, 658, 73, 27, 511, 796, 71, 511, 30, 30, 821, 821, 912, 73 };
        assertEquals(2, manysquares.howManySquares(sticks));
    }

    @Test
    public void case88() {
        int[] sticks = { 493, 37, 225, 225, 86, 183, 834, 579, 653, 493, 66, 994, 998, 878, 926, 654, 601, 834, 579, 926, 335, 139, 998, 926 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case89() {
        int[] sticks = { 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410, 410 };
        assertEquals(8, manysquares.howManySquares(sticks));
    }

    @Test
    public void case90() {
        int[] sticks = { 561, 273, 273, 561, 561, 561, 273, 561, 273, 273, 561, 561, 561, 561, 273, 273, 273, 273, 561, 561, 273, 273, 561, 561, 273, 273, 561, 273, 273, 561, 561, 273, 561, 561 };
        assertEquals(8, manysquares.howManySquares(sticks));
    }

    @Test
    public void case91() {
        int[] sticks = { 311, 311, 311, 324, 311, 324, 346, 346, 324, 311, 346, 346, 311, 324, 346, 346, 324, 324, 311, 311, 311, 346, 311, 311, 346, 311, 324, 346, 311, 311, 311, 311, 324, 311 };
        assertEquals(8, manysquares.howManySquares(sticks));
    }

    @Test
    public void case92() {
        int[] sticks = { 609, 611, 957, 957, 611, 485, 957, 957, 485, 957, 485, 611, 609, 611, 957, 957, 957, 611, 957, 611, 180, 180, 957, 485, 180, 180, 485, 485, 180, 611, 611, 957, 180, 611 };
        assertEquals(6, manysquares.howManySquares(sticks));
    }

    @Test
    public void case93() {
        int[] sticks = { 506, 57, 50, 50, 50, 50, 57, 506, 39, 607, 887, 871, 39, 271, 506, 871, 39, 607, 891, 871, 57, 50, 607, 871, 607, 57, 607, 50, 50, 39, 39, 50, 607, 891 };
        assertEquals(6, manysquares.howManySquares(sticks));
    }

    @Test
    public void case94() {
        int[] sticks = { 819, 296, 950, 243, 568, 243, 220, 384, 370, 909, 90, 442, 220, 375, 90, 375, 403, 909, 442, 243, 431, 98, 900, 296, 576, 220, 764, 429, 3, 747, 927, 155, 851, 40 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case95() {
        int[] sticks = { 508, 508, 508, 508, 508, 508 };
        assertEquals(1, manysquares.howManySquares(sticks));
    }

    @Test
    public void case96() {
        int[] sticks = { 292, 751, 292, 292, 292, 751 };
        assertEquals(1, manysquares.howManySquares(sticks));
    }

    @Test
    public void case97() {
        int[] sticks = { 592, 592, 732, 732, 886, 886 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case98() {
        int[] sticks = { 662, 662, 911, 503, 833, 833 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case99() {
        int[] sticks = { 182, 922, 164, 182, 231, 164 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case100() {
        int[] sticks = { 133, 322, 225, 906, 760, 937 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case101() {
        int[] sticks = { 648, 648, 648, 648, 648, 648, 648, 648, 648, 648, 648 };
        assertEquals(2, manysquares.howManySquares(sticks));
    }

    @Test
    public void case102() {
        int[] sticks = { 647, 647, 33, 647, 647, 647, 33, 33, 33, 33, 647 };
        assertEquals(2, manysquares.howManySquares(sticks));
    }

    @Test
    public void case103() {
        int[] sticks = { 623, 623, 623, 623, 623, 321, 321, 819, 623, 623, 623 };
        assertEquals(2, manysquares.howManySquares(sticks));
    }

    @Test
    public void case104() {
        int[] sticks = { 858, 897, 283, 806, 241, 241, 806, 806, 283, 283, 806 };
        assertEquals(1, manysquares.howManySquares(sticks));
    }

    @Test
    public void case105() {
        int[] sticks = { 767, 675, 219, 144, 79, 144, 697, 631, 144, 388, 328 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case106() {
        int[] sticks = { 589, 663, 42, 865, 745, 961, 628, 864, 357, 318, 42 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case107() {
        int[] sticks = { 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58 };
        assertEquals(4, manysquares.howManySquares(sticks));
    }

    @Test
    public void case108() {
        int[] sticks = { 75, 75, 477, 75, 75, 75, 75, 75, 477, 477, 477, 477, 477, 477, 477, 477, 75 };
        assertEquals(4, manysquares.howManySquares(sticks));
    }

    @Test
    public void case109() {
        int[] sticks = { 748, 748, 748, 474, 1000, 748, 1000, 474, 748, 748, 748, 474, 474, 474, 474, 748, 1000 };
        assertEquals(3, manysquares.howManySquares(sticks));
    }

    @Test
    public void case110() {
        int[] sticks = { 414, 941, 414, 414, 292, 627, 292, 627, 627, 414, 627, 941, 708, 414, 292, 414, 292 };
        assertEquals(3, manysquares.howManySquares(sticks));
    }

    @Test
    public void case111() {
        int[] sticks = { 689, 953, 953, 461, 135, 897, 135, 580, 624, 461, 240, 689, 953, 135, 897, 689, 231 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case112() {
        int[] sticks = { 245, 620, 529, 641, 177, 26, 115, 987, 523, 402, 925, 159, 302, 620, 84, 987, 838 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case113() {
        int[] sticks = { 302, 302, 302, 302, 302, 302, 302, 302, 302, 302, 302, 302, 302, 302 };
        assertEquals(3, manysquares.howManySquares(sticks));
    }

    @Test
    public void case114() {
        int[] sticks = { 321, 375, 375, 321, 321, 375, 321, 321, 321, 321, 375, 321, 375, 321 };
        assertEquals(3, manysquares.howManySquares(sticks));
    }

    @Test
    public void case115() {
        int[] sticks = { 959, 959, 174, 959, 959, 174, 174, 174, 174, 959, 959, 959, 959, 174 };
        assertEquals(3, manysquares.howManySquares(sticks));
    }

    @Test
    public void case116() {
        int[] sticks = { 985, 490, 775, 490, 985, 985, 490, 985, 490, 985, 269, 394, 775, 394 };
        assertEquals(2, manysquares.howManySquares(sticks));
    }

    @Test
    public void case117() {
        int[] sticks = { 625, 625, 472, 472, 455, 98, 748, 988, 840, 840, 98, 472, 98, 12 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case118() {
        int[] sticks = { 797, 569, 577, 183, 942, 893, 301, 577, 984, 364, 561, 382, 273, 830 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case119() {
        int[] sticks = { 1, 1, 1, 2, 1, 1, 1, 3, 1, 1, 1 };
        assertEquals(2, manysquares.howManySquares(sticks));
    }

    @Test
    public void case120() {
        int[] sticks = { 2, 2, 4, 4, 8, 8 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case121() {
        int[] sticks = { 3, 1, 4, 4, 4, 10, 10, 10, 10 };
        assertEquals(1, manysquares.howManySquares(sticks));
    }

    @Test
    public void case122() {
        int[] sticks = { 1000, 1000, 1000, 1000 };
        assertEquals(1, manysquares.howManySquares(sticks));
    }

    @Test
    public void case123() {
        int[] sticks = { 88, 1, 2, 9, 4, 10, 10, 10, 10 };
        assertEquals(1, manysquares.howManySquares(sticks));
    }

    @Test
    public void case124() {
        int[] sticks = { 1000, 1000, 1000, 1000, 1, 1, 1, 1 };
        assertEquals(2, manysquares.howManySquares(sticks));
    }

    @Test
    public void case125() {
        int[] sticks = { 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(2, manysquares.howManySquares(sticks));
    }

    @Test
    public void case126() {
        int[] sticks = { 4, 4, 4, 4 };
        assertEquals(1, manysquares.howManySquares(sticks));
    }

    @Test
    public void case127() {
        int[] sticks = { 2, 2, 4, 4, 8, 8 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case128() {
        int[] sticks = { 7, 1, 1, 1, 1 };
        assertEquals(1, manysquares.howManySquares(sticks));
    }

    @Test
    public void case129() {
        int[] sticks = { 10 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case130() {
        int[] sticks = { 1000, 1000, 1000, 1000, 1000 };
        assertEquals(1, manysquares.howManySquares(sticks));
    }

    @Test
    public void case131() {
        int[] sticks = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(3, manysquares.howManySquares(sticks));
    }

    @Test
    public void case132() {
        int[] sticks = { 1000, 1000, 2, 2, 1000, 1000, 2 };
        assertEquals(1, manysquares.howManySquares(sticks));
    }

    @Test
    public void case133() {
        int[] sticks = { 900, 900, 900, 900, 1, 2, 3 };
        assertEquals(1, manysquares.howManySquares(sticks));
    }

    @Test
    public void case134() {
        int[] sticks = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
        assertEquals(2, manysquares.howManySquares(sticks));
    }

    @Test
    public void case135() {
        int[] sticks = { 1000, 1000 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case136() {
        int[] sticks = { 1, 1, 1, 1, 2, 2, 2, 2 };
        assertEquals(2, manysquares.howManySquares(sticks));
    }

    @Test
    public void case137() {
        int[] sticks = { 1, 1, 1, 1 };
        assertEquals(1, manysquares.howManySquares(sticks));
    }

    @Test
    public void case138() {
        int[] sticks = { 1000, 1, 1, 1, 1 };
        assertEquals(1, manysquares.howManySquares(sticks));
    }

    @Test
    public void case139() {
        int[] sticks = { 900, 900, 900, 900 };
        assertEquals(1, manysquares.howManySquares(sticks));
    }

    @Test
    public void case140() {
        int[] sticks = { 1, 1, 1, 1, 1, 1 };
        assertEquals(1, manysquares.howManySquares(sticks));
    }

    @Test
    public void case141() {
        int[] sticks = { 500, 500, 500, 500 };
        assertEquals(1, manysquares.howManySquares(sticks));
    }

    @Test
    public void case142() {
        int[] sticks = { 1, 1, 1, 2, 1, 1, 1, 3, 1, 1, 1 };
        assertEquals(2, manysquares.howManySquares(sticks));
    }

    @Test
    public void case143() {
        int[] sticks = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(3, manysquares.howManySquares(sticks));
    }

    @Test
    public void case144() {
        int[] sticks = { 1, 1, 2, 2, 1, 1, 2 };
        assertEquals(1, manysquares.howManySquares(sticks));
    }

    @Test
    public void case145() {
        int[] sticks = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
        assertEquals(2, manysquares.howManySquares(sticks));
    }

    @Test
    public void case146() {
        int[] sticks = { 1000, 1000, 1000, 1000, 999, 1, 2 };
        assertEquals(1, manysquares.howManySquares(sticks));
    }

    @Test
    public void case147() {
        int[] sticks = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(12, manysquares.howManySquares(sticks));
    }

    @Test
    public void case148() {
        int[] sticks = { 2, 2, 1, 1, 1, 1, 2, 2 };
        assertEquals(2, manysquares.howManySquares(sticks));
    }

    @Test
    public void case149() {
        int[] sticks = { 400, 400, 400, 400 };
        assertEquals(1, manysquares.howManySquares(sticks));
    }

    @Test
    public void case150() {
        int[] sticks = { 1, 1000, 1000, 1000 };
        assertEquals(0, manysquares.howManySquares(sticks));
    }

    @Test
    public void case151() {
        int[] sticks = { 1, 1, 1, 1, 3, 3, 3, 3, 5, 5, 5, 5 };
        assertEquals(3, manysquares.howManySquares(sticks));
    }

    @Test
    public void case152() {
        int[] sticks = { 1000, 999, 122, 122, 122, 122 };
        assertEquals(1, manysquares.howManySquares(sticks));
    }

    @Test
    public void case153() {
        int[] sticks = { 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
        assertEquals(1, manysquares.howManySquares(sticks));
    }

    @Test
    public void case154() {
        int[] sticks = { 1, 1, 2, 2, 1, 1, 2, 2 };
        assertEquals(2, manysquares.howManySquares(sticks));
    }

    @Test
    public void case155() {
        int[] sticks = { 10, 10, 19, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 19, 19, 19, 19, 19, 19 };
        assertEquals(4, manysquares.howManySquares(sticks));
    }

    @Test
    public void case156() {
        int[] sticks = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(12, manysquares.howManySquares(sticks));
    }

    @Test
    public void case157() {
        int[] sticks = { 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(1, manysquares.howManySquares(sticks));
    }

    @Test
    public void case158() {
        int[] sticks = { 1000, 1000, 1000, 1000, 999, 999, 999 };
        assertEquals(1, manysquares.howManySquares(sticks));
    }

    @Test
    public void case159() {
        int[] sticks = { 1, 1, 1, 1, 1 };
        assertEquals(1, manysquares.howManySquares(sticks));
    }

    @Test
    public void case160() {
        int[] sticks = { 4, 4, 4, 4, 4, 4, 4 };
        assertEquals(1, manysquares.howManySquares(sticks));
    }

    @Test
    public void case161() {
        int[] sticks = { 100, 100, 100, 100 };
        assertEquals(1, manysquares.howManySquares(sticks));
    }

}
