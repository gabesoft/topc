package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class EllysPairsTest {
    EllysPairs ellyspairs = new EllysPairs();

    @Test
    public void case1() {
        int[] knowledge = { 2, 6, 4, 3 };
        assertEquals(1, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case2() {
        int[] knowledge = { 1, 1, 1, 1, 1, 1 };
        assertEquals(0, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case3() {
        int[] knowledge = { 4, 2, 4, 2, 1, 3, 3, 7 };
        assertEquals(2, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case4() {
        int[] knowledge = { 5, 1, 8, 8, 13, 7, 6, 2, 1, 9, 5, 11, 3, 4 };
        assertEquals(3, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case5() {
        int[] knowledge = { 4, 2 };
        assertEquals(0, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case6() {
        int[] knowledge = { 4, 4 };
        assertEquals(0, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case7() {
        int[] knowledge = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 1000, 999, 998, 997, 996, 995, 994, 993, 992, 991, 990, 989, 988, 987, 986, 985, 984, 983, 982, 981, 980, 979, 978, 977, 976 };
        assertEquals(0, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case8() {
        int[] knowledge = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
        assertEquals(0, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case9() {
        int[] knowledge = { 4, 3, 1, 2, 1, 3, 3, 3, 1, 2, 2, 2, 4, 2, 4, 4, 3, 4, 1, 4, 1, 3, 2, 1, 3, 999, 1000, 998, 997, 997, 998, 997, 998, 999, 1000, 997, 997, 997, 998, 997, 997, 998, 999, 999, 1000, 999, 997, 999, 1000, 997 };
        assertEquals(1, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case10() {
        int[] knowledge = { 1, 5, 4, 1, 2, 5, 6, 2, 4, 5, 1, 2, 2, 7, 4, 4, 1, 4, 7, 6, 1, 3, 4, 7, 6, 1000, 995, 994, 999, 998, 996, 996, 997, 997, 997, 995, 999, 998, 996, 999, 1000, 996, 1000, 994, 996, 997, 996, 1000, 997, 1000 };
        assertEquals(2, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case11() {
        int[] knowledge = { 9, 5, 1, 8, 7, 4, 7, 2, 6, 5, 3, 1, 10, 8, 4, 8, 3, 7, 1, 2, 7, 6, 8, 6, 5, 999, 998, 1000, 1000, 999, 996, 994, 1000, 993, 999, 993, 993, 993, 993, 997, 997, 995, 991, 991, 992, 999, 992, 998, 994, 994 };
        assertEquals(2, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case12() {
        int[] knowledge = { 7, 9, 1, 3, 7, 9, 5, 6, 4, 9, 3, 4, 2, 1, 3, 6, 5, 3, 6, 5, 7, 1, 7, 7, 4, 996, 999, 1000, 992, 999, 997, 998, 994, 992, 999, 992, 998, 993, 994, 999, 995, 1000, 1000, 998, 993, 999, 992, 998, 992, 1000 };
        assertEquals(4, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case13() {
        int[] knowledge = { 3, 2, 3, 2, 1, 3, 2, 1, 3, 2, 3, 1, 2, 1, 1, 2, 1, 2, 3, 3, 1, 1, 1, 1, 3, 998, 998, 998, 998, 999, 999, 1000, 1000, 999, 999, 998, 998, 999, 998, 998, 998, 1000, 999, 999, 1000, 998, 1000, 998, 1000, 1000 };
        assertEquals(1, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case14() {
        int[] knowledge = { 2, 9, 3, 3, 8, 1, 4, 4, 3, 4, 9, 4, 5, 3, 3, 1, 2, 9, 9, 3, 9, 9, 7, 5, 6, 1000, 1000, 994, 1000, 993, 993, 999, 992, 993, 993, 993, 994, 994, 996, 992, 998, 997, 992, 992, 995, 1000, 999, 1000, 995, 993 };
        assertEquals(5, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case15() {
        int[] knowledge = { 5, 2, 3, 1, 1, 4, 4, 5, 4, 5, 2, 3, 5, 5, 3, 2, 5, 4, 1, 3, 2, 2, 1, 4, 3, 1000, 996, 996, 999, 999, 999, 999, 997, 997, 1000, 1000, 997, 998, 997, 998, 1000, 997, 999, 999, 997, 999, 998, 999, 996, 999 };
        assertEquals(1, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case16() {
        int[] knowledge = { 2, 2, 1, 3, 5, 9, 3, 6, 4, 7, 1, 9, 1, 9, 3, 4, 2, 7, 2, 6, 9, 6, 5, 6, 4, 998, 995, 993, 992, 996, 992, 997, 997, 992, 1000, 992, 993, 992, 992, 999, 997, 995, 993, 995, 992, 996, 998, 992, 994, 998 };
        assertEquals(3, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case17() {
        int[] knowledge = { 4, 3, 4, 8, 2, 8, 5, 8, 5, 6, 6, 4, 1, 2, 2, 6, 8, 5, 7, 7, 7, 1, 5, 4, 1, 995, 994, 994, 998, 997, 999, 993, 1000, 1000, 997, 995, 994, 996, 994, 993, 1000, 997, 995, 1000, 994, 998, 994, 997, 998, 994 };
        assertEquals(2, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case18() {
        int[] knowledge = { 4, 1, 3, 1, 4, 1, 1, 4, 1, 3, 3, 2, 3, 4, 1, 4, 4, 3, 1, 2, 3, 3, 2, 4, 2, 998, 999, 997, 999, 1000, 997, 1000, 998, 998, 997, 1000, 999, 999, 997, 999, 1000, 1000, 998, 1000, 998, 998, 997, 997, 997, 997 };
        assertEquals(1, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case19() {
        int[] knowledge = { 1, 3, 1, 1, 4, 1, 4, 3, 2, 1, 2, 3, 3, 2, 4, 2, 1, 3, 4, 4, 1, 2, 1, 2, 1, 999, 997, 999, 998, 1000, 1000, 999, 1000, 999, 1000, 997, 1000, 997, 1000, 1000, 998, 997, 999, 1000, 1000, 998, 999, 998, 999, 999 };
        assertEquals(1, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case20() {
        int[] knowledge = { 10, 2, 7, 3, 8, 3, 8, 7, 6, 2, 4, 10, 10, 6, 10, 3, 7, 6, 4, 3, 5, 5, 5, 3, 8, 991, 998, 997, 993, 997, 999, 995, 993, 992, 995, 992, 997, 998, 996, 999, 999, 995, 991, 995, 999, 1000, 994, 996, 995, 997 };
        assertEquals(1, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case21() {
        int[] knowledge = { 4, 5, 2, 4, 5, 3, 5, 2, 4, 2, 1, 3, 4, 2, 1, 4, 2, 1, 1, 3, 3, 2, 3, 5, 4, 998, 997, 999, 997, 1000, 997, 1000, 998, 997, 1000, 998, 998, 998, 1000, 996, 999, 1000, 997, 1000, 1000, 998, 996, 1000, 1000, 997 };
        assertEquals(1, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case22() {
        int[] knowledge = { 2, 1, 5, 4, 1, 5, 3, 1, 5, 2, 4, 5, 1, 4, 3, 3, 5, 2, 2, 3, 3, 2, 5, 1, 4, 996, 999, 998, 1000, 997, 997, 998, 996, 999, 998, 996, 1000, 997, 998, 996, 1000, 999, 997, 1000, 998, 998, 996, 997, 999, 997 };
        assertEquals(2, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case23() {
        int[] knowledge = { 4, 1, 2, 5, 1, 5, 3, 5, 4, 2, 5, 4, 3, 1, 1, 1, 5, 4, 3, 4, 3, 5, 4, 2, 5, 997, 1000, 1000, 998, 999, 997, 996, 998, 996, 1000, 996, 996, 1000, 1000, 1000, 997, 997, 1000, 999, 997, 998, 998, 998, 998, 1000 };
        assertEquals(1, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case24() {
        int[] knowledge = { 4, 4, 6, 6, 3, 6, 6, 4, 5, 4, 4, 1, 4, 2, 6, 4, 4, 2, 5, 3, 3, 3, 6, 1, 3, 998, 996, 1000, 995, 997, 996, 1000, 996, 999, 1000, 995, 995, 1000, 995, 1000, 999, 997, 996, 996, 997, 995, 999, 996, 1000, 997 };
        assertEquals(3, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case25() {
        int[] knowledge = { 3, 5, 2, 7, 6, 5, 2, 9, 3, 1, 6, 3, 4, 6, 3, 7, 8, 6, 9, 2, 4, 5, 1, 8, 5, 993, 994, 995, 993, 997, 992, 993, 1000, 997, 999, 995, 996, 993, 995, 1000, 994, 995, 997, 1000, 996, 997, 999, 993, 997, 999 };
        assertEquals(2, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case26() {
        int[] knowledge = { 4, 4, 2, 3, 4, 3, 4, 5, 4, 5, 4, 2, 4, 5, 3, 4, 5, 4, 1, 1, 4, 4, 1, 1, 2, 996, 997, 999, 997, 996, 998, 999, 996, 997, 998, 997, 996, 1000, 998, 997, 999, 996, 997, 996, 997, 996, 999, 997, 1000, 999 };
        assertEquals(1, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case27() {
        int[] knowledge = { 3, 1, 3, 3, 1, 3, 2, 3, 3, 1, 1, 2, 2, 3, 2, 1, 1, 2, 1, 2, 1, 1, 3, 1, 1, 1000, 1000, 1000, 1000, 998, 998, 998, 999, 998, 999, 999, 1000, 999, 999, 999, 999, 999, 998, 999, 998, 1000, 998, 999, 1000, 999 };
        assertEquals(2, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case28() {
        int[] knowledge = { 2, 1, 2, 3, 4, 4, 1, 1, 3, 1, 4, 2, 3, 4, 2, 4, 2, 4, 1, 2, 1, 2, 3, 3, 2, 999, 998, 1000, 1000, 999, 997, 1000, 997, 1000, 999, 999, 998, 1000, 1000, 998, 998, 997, 999, 1000, 1000, 998, 999, 998, 999, 1000 };
        assertEquals(1, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case29() {
        int[] knowledge = { 8, 7, 2, 5, 6, 2, 3, 8, 4, 7, 5, 7, 3, 4, 4, 2, 5, 1, 7, 3, 2, 5, 5, 3, 6, 996, 1000, 994, 999, 996, 1000, 997, 1000, 997, 998, 993, 994, 998, 1000, 997, 996, 995, 993, 994, 993, 994, 998, 997, 998, 994 };
        assertEquals(2, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case30() {
        int[] knowledge = { 463, 634, 159, 23, 147, 393, 38, 926, 648, 459, 603, 808, 99, 831, 293, 601, 279, 800, 353, 449, 883, 541, 316, 576, 763, 568, 337, 398, 419, 898, 829, 852, 817, 231, 450, 926, 659, 230, 521, 941, 561, 148, 163, 656 };
        assertEquals(129, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case31() {
        int[] knowledge = { 793, 362 };
        assertEquals(0, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case32() {
        int[] knowledge = { 399, 147, 715, 947, 189, 570, 639, 664, 76, 516 };
        assertEquals(233, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case33() {
        int[] knowledge = { 476, 616, 529, 235, 571, 906, 465, 558, 963, 162, 525, 550, 470, 331, 924, 351, 334, 926, 911, 738, 337, 338, 279, 394, 637, 715, 165, 592, 950, 136, 506, 338, 5, 338, 624, 665, 971, 609, 569, 282, 86, 153, 374, 653 };
        assertEquals(198, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case34() {
        int[] knowledge = { 877, 827, 397, 573, 250, 641, 175, 820, 944, 612, 942, 290, 420, 566, 806, 586, 217, 451, 616, 610, 65, 167, 894, 75, 510, 301, 696, 574, 590, 162, 173, 969, 359, 32, 269, 427, 511, 423, 775, 780 };
        assertEquals(141, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case35() {
        int[] knowledge = { 553, 183, 392, 496, 765, 875, 365, 903, 256, 461, 475, 973, 822, 123, 548, 578, 790, 606, 196, 595, 951, 344 };
        assertEquals(99, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case36() {
        int[] knowledge = { 482, 13, 673, 440, 429, 913, 763, 968, 409, 416 };
        assertEquals(400, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case37() {
        int[] knowledge = { 224, 760, 435, 205, 487, 320, 959, 946, 807, 167, 701, 368, 693, 788, 533, 557, 975, 448 };
        assertEquals(105, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case38() {
        int[] knowledge = { 284, 223, 332, 377, 584, 949, 724, 983, 19, 777, 221, 112, 183, 857, 491, 926, 325, 487, 678, 970, 644, 535, 678, 669, 69, 992, 197, 784, 829, 728, 427, 872, 698, 613, 704, 28, 409, 546, 509, 186, 239, 238, 444, 314 };
        assertEquals(142, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case39() {
        int[] knowledge = { 851, 129, 112, 651 };
        assertEquals(183, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case40() {
        int[] knowledge = { 193, 455, 870, 682, 466, 268, 714, 794, 635, 473, 973, 831, 902, 443, 178, 878, 771, 703, 365, 382, 591, 824, 238, 24, 180, 596, 170, 328, 43, 311, 183, 59, 927, 488, 671, 529, 652, 259, 214, 861, 784, 287, 743, 611, 473, 129, 435, 842, 719, 504 };
        assertEquals(126, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case41() {
        int[] knowledge = { 866, 939, 882, 258, 751, 615, 599, 459, 662, 64, 757, 808, 279, 490, 436, 366, 76, 587, 387, 834, 361, 331, 49, 929, 493, 434, 841, 767, 736, 811, 600, 838, 893, 983, 329, 353 };
        assertEquals(223, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case42() {
        int[] knowledge = { 245, 795, 609, 253, 648, 433, 536, 209, 265, 498, 244, 650, 16, 842, 190, 101, 813, 649, 524, 852, 475, 634, 892, 201, 855, 991, 698, 920, 781, 579, 932, 545, 341, 488, 900, 526, 484, 539, 493, 194 };
        assertEquals(129, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case43() {
        int[] knowledge = { 12, 561, 835, 841, 498, 786 };
        assertEquals(494, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case44() {
        int[] knowledge = { 541, 806, 792, 393, 211, 550, 579, 980, 972, 278 };
        assertEquals(204, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case45() {
        int[] knowledge = { 194, 621, 498, 827, 277, 791, 583, 579, 160, 419, 490, 160, 450, 925, 73, 381, 9, 968, 209, 478, 504, 371, 608, 197, 75, 723, 612, 20, 762, 57, 891, 164, 684, 717, 933, 453, 742, 955, 814, 863, 397, 461, 616, 905, 600, 137, 681, 199 };
        assertEquals(137, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case46() {
        int[] knowledge = { 388, 585, 241, 518, 7, 671, 242, 883, 250, 524, 759, 106, 622, 96, 297, 917 };
        assertEquals(158, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case47() {
        int[] knowledge = { 179, 580, 59, 578, 751, 8, 730, 82 };
        assertEquals(127, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case48() {
        int[] knowledge = { 679, 677, 754, 900, 785, 566, 94, 609, 173, 244, 930, 515, 169, 56, 192, 974, 923, 749, 652, 987, 145, 447, 578, 518, 630, 917, 875, 792, 470, 913, 147, 694, 92, 816, 950, 858, 641, 53, 237, 552, 488, 227 };
        assertEquals(215, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case49() {
        int[] knowledge = { 956, 184, 395, 181, 98, 66, 66, 514, 262, 579, 79, 879, 141, 612, 948, 446, 171, 976, 490, 751, 150, 334, 866, 215, 283, 8 };
        assertEquals(405, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case50() {
        int[] knowledge = { 897, 368, 523, 883, 811, 642, 232, 188, 706, 480, 322, 539, 352, 448, 209, 647 };
        assertEquals(105, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case51() {
        int[] knowledge = { 760, 190, 423, 667 };
        assertEquals(140, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case52() {
        int[] knowledge = { 456, 29, 615, 861, 254, 778, 349, 504, 862, 432, 83, 456, 198, 107, 753, 822, 297, 282, 22, 456, 948, 125, 319, 136 };
        assertEquals(232, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case53() {
        int[] knowledge = { 775, 860, 999, 75 };
        assertEquals(561, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case54() {
        int[] knowledge = { 923, 636, 644, 889, 154, 233, 748, 681 };
        assertEquals(307, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case55() {
        int[] knowledge = { 679, 451, 802, 962 };
        assertEquals(68, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case56() {
        int[] knowledge = { 856, 364, 717, 574, 562, 246, 474, 275, 551, 354, 182, 288, 700, 111, 644, 466, 173, 530, 982, 113, 477, 382, 248, 891, 672, 806, 373, 33, 990, 321, 166, 432, 659, 294, 207, 579, 949, 207, 172, 167, 397, 698, 21, 695, 530, 789, 110, 985, 970, 979 };
        assertEquals(215, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case57() {
        int[] knowledge = { 16, 627, 685, 169, 907, 929, 98, 119, 391, 200, 786, 487, 200, 421, 711, 272, 814, 416, 86, 319, 581, 332, 268, 388, 445, 187, 508, 361, 828, 75, 432, 153, 272, 269, 694, 886 };
        assertEquals(265, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case58() {
        int[] knowledge = { 312, 605, 678, 407, 769, 23, 414, 1, 543, 538, 39, 389, 356, 290, 648, 182, 94, 585, 988, 762, 494, 218, 502, 483, 448, 666 };
        assertEquals(217, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case59() {
        int[] knowledge = { 105, 85, 96, 526, 222, 965, 782, 873 };
        assertEquals(302, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case60() {
        int[] knowledge = { 657, 344, 594, 81, 81, 869, 412, 714, 969, 252, 217, 80, 769, 41 };
        assertEquals(254, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case61() {
        int[] knowledge = { 934, 780, 664, 260, 654, 937, 96, 366, 875, 721, 836, 681, 977, 456 };
        assertEquals(417, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case62() {
        int[] knowledge = { 72, 809 };
        assertEquals(0, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case63() {
        int[] knowledge = { 157, 603, 833, 906, 441, 376, 563, 886, 963, 81, 837, 798, 203, 509, 81, 341, 77, 59, 494, 741 };
        assertEquals(164, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case64() {
        int[] knowledge = { 475, 774, 98, 881, 336, 73, 401, 708, 956, 667, 142, 589, 482, 169, 316, 397, 226, 10, 13, 137, 456, 763, 44, 743, 22, 923, 513, 249, 19, 369, 718, 715, 651, 291, 336, 760, 170, 896, 304, 641, 980, 200, 106, 792 };
        assertEquals(192, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case65() {
        int[] knowledge = { 682, 653, 754, 34, 30, 988, 43, 254, 84, 421, 815, 719, 245, 64, 230, 653, 865, 770, 471, 6, 48, 595, 488, 327 };
        assertEquals(228, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case66() {
        int[] knowledge = { 324, 541, 680, 991 };
        assertEquals(94, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case67() {
        int[] knowledge = { 711, 272, 946, 222, 471, 184, 590, 956, 979, 780, 7, 263, 136, 488, 197, 34, 89, 936, 780, 994, 791, 963, 966, 2, 106, 808, 568, 670 };
        assertEquals(196, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case68() {
        int[] knowledge = { 672, 458, 999, 546, 598, 219, 839, 845, 373, 564, 29, 265, 802, 724, 491, 605, 602, 228, 198, 693 };
        assertEquals(173, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case69() {
        int[] knowledge = { 364, 302, 364, 722, 566, 422, 446, 611, 496, 742, 23, 813, 152, 16, 56, 394, 739, 280, 883, 609, 655, 823, 708, 246, 339, 145, 291, 340, 155, 605, 624, 226, 79, 725, 982, 331, 734, 224, 595, 131, 847, 988, 446, 806 };
        assertEquals(113, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case70() {
        int[] knowledge = { 751, 490, 339, 964, 136, 698, 210, 631, 225, 909, 738, 475, 921, 373, 294, 856, 735, 562, 57, 607, 185, 76, 383, 120, 742, 433, 685, 780, 280, 284, 668, 837, 126, 119 };
        assertEquals(112, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case71() {
        int[] knowledge = { 29, 120, 578, 738, 92, 557, 796, 61, 902, 794, 433, 137, 581, 876, 908, 185, 75, 720, 791, 477, 42, 352, 330, 291, 975, 73 };
        assertEquals(133, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case72() {
        int[] knowledge = { 190, 788, 491, 240, 894, 54, 64, 682, 904, 6, 177, 480, 696, 140, 469, 999, 84, 640, 516, 622, 994, 827, 723, 839, 829, 582, 400, 979, 892, 24, 944, 835, 244, 350 };
        assertEquals(216, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case73() {
        int[] knowledge = { 708, 503, 142, 688, 347, 892 };
        assertEquals(157, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case74() {
        int[] knowledge = { 414, 401, 817, 691, 163, 936, 127, 411, 878, 383, 261, 190, 706, 875, 664, 723, 196, 567, 361, 39, 589, 812, 246, 468, 426, 868 };
        assertEquals(180, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case75() {
        int[] knowledge = { 543, 64, 548, 503, 618, 100, 24, 227, 204, 49, 52, 571, 637, 459, 968, 457, 406, 532, 963, 820, 976, 557, 532, 496, 45, 592, 804, 389, 916, 451 };
        assertEquals(194, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case76() {
        int[] knowledge = { 273, 792, 384, 134, 776, 643, 570, 301, 955, 79, 586, 258, 334, 894, 491, 104, 751, 234, 723, 272, 612, 991, 339, 642, 259, 48, 353, 659, 480, 303, 684, 991, 3, 569, 423, 896, 136, 9, 362, 743 };
        assertEquals(128, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case77() {
        int[] knowledge = { 700, 189, 179, 43, 358, 942, 848, 470, 346, 381, 914, 965, 711, 62, 386, 74, 505, 463, 704, 103, 70, 155, 530, 553, 75, 150, 731, 245, 845, 50, 119, 66, 364, 553, 774, 471, 732, 748, 512, 870 };
        assertEquals(210, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case78() {
        int[] knowledge = { 499, 104, 353, 680, 54, 44, 523, 89, 564, 835, 851, 23, 241, 912, 493, 652, 581, 478, 617, 877, 179, 221, 616, 349, 799, 180, 636, 858, 884, 663, 903, 263, 421, 771, 23, 274, 842, 687, 889, 918, 718, 893, 699, 268, 750, 66, 390, 933 };
        assertEquals(256, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case79() {
        int[] knowledge = { 82, 4, 131, 29, 632, 590, 153, 631, 173, 865, 408, 296, 429, 682, 491, 611, 178, 72, 237, 460, 644, 841, 634, 38, 894, 631, 275, 994, 783, 204, 462, 291, 663, 308, 998, 152, 424, 891, 718, 641 };
        assertEquals(182, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case80() {
        int[] knowledge = { 567, 884, 662, 660, 246, 387, 652, 766 };
        assertEquals(182, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case81() {
        int[] knowledge = { 841, 210, 498, 284 };
        assertEquals(269, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case82() {
        int[] knowledge = { 59, 422 };
        assertEquals(0, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case83() {
        int[] knowledge = { 582, 788 };
        assertEquals(0, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case84() {
        int[] knowledge = { 288, 1000, 505, 980, 139, 701, 531, 462, 119, 206, 541, 829, 460, 623, 399, 761, 99, 936, 482, 615, 568, 494, 597, 162, 747, 539, 671, 539, 477, 556, 918, 372, 761, 753, 759, 434, 256, 66, 727, 402, 35, 760, 394, 549 };
        assertEquals(218, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case85() {
        int[] knowledge = { 793, 194, 934, 138, 104, 691, 212, 695, 669, 628, 499, 990, 249, 880, 648, 150, 932, 670, 876, 599, 450, 437, 600, 124, 444, 732, 155, 862, 435, 386, 968, 817, 394, 705, 867, 954, 309, 224, 685, 793, 668, 49, 470, 931, 812, 815, 91, 428 };
        assertEquals(241, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case86() {
        int[] knowledge = { 605, 600, 475, 196, 507, 159, 590, 859, 810, 890, 448, 41, 819, 365, 976, 27, 90, 504, 67, 413, 841, 571, 677, 396, 642, 987, 652, 110, 188, 84, 86, 391, 251, 687, 756, 382, 129, 503 };
        assertEquals(171, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case87() {
        int[] knowledge = { 863, 425, 566, 873, 833, 886 };
        assertEquals(385, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case88() {
        int[] knowledge = { 647, 890, 479, 884, 926, 266, 261, 46 };
        assertEquals(179, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case89() {
        int[] knowledge = { 822, 856, 521, 928, 774, 135, 252, 676 };
        assertEquals(387, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case90() {
        int[] knowledge = { 335, 2, 738, 311, 975, 591, 357, 72, 81, 936, 146, 283, 826, 719, 574, 713, 38, 999, 906, 163, 718, 693, 540, 48 };
        assertEquals(232, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case91() {
        int[] knowledge = { 104, 232, 116, 840, 859, 830, 646, 395, 200, 646, 273, 676, 863, 73, 774, 481, 239, 898, 543, 609, 204, 278, 126, 135, 402, 79, 383, 170, 737, 479, 940, 139, 722, 427, 664, 678, 576, 725, 982, 701, 962, 863, 3, 449 };
        assertEquals(132, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case92() {
        int[] knowledge = { 685, 17, 138, 508, 994, 285, 945, 260, 822, 59, 644, 669, 678, 120, 858, 42, 892, 265, 624, 916, 73, 930, 842, 716, 616, 537, 958, 760, 701, 453, 94, 242, 830, 449, 228, 799, 225, 325, 275, 134, 886, 39 };
        assertEquals(183, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case93() {
        int[] knowledge = { 863, 630, 85, 910, 879, 924, 86, 401, 25, 194, 106, 413, 766, 768, 408, 678, 785, 705, 791, 835, 892, 622, 86, 735, 191, 543, 999, 87, 19, 622, 425, 598, 377, 255, 670, 109, 928, 494, 69, 367, 103, 439 };
        assertEquals(178, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case94() {
        int[] knowledge = { 820, 319 };
        assertEquals(0, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case95() {
        int[] knowledge = { 985, 340, 557, 809, 633, 479, 815, 788, 240, 75, 21, 828, 555, 989, 442, 799, 643, 3, 322, 105, 947, 57, 510, 834, 709, 762, 534, 687, 805, 386, 143, 843 };
        assertEquals(323, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case96() {
        int[] knowledge = { 162, 621, 344, 579, 188, 114, 64, 592, 935, 416, 657, 762, 13, 412, 960, 252, 739, 371, 125, 508, 8, 585 };
        assertEquals(188, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case97() {
        int[] knowledge = { 102, 490, 959, 442 };
        assertEquals(129, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case98() {
        int[] knowledge = { 14, 413, 856, 61, 94, 473, 403, 677, 544, 374, 267, 652, 276, 529, 533, 762, 470, 504, 730, 108, 893, 452, 954, 393, 571, 520, 473, 408, 495, 506, 441, 384 };
        assertEquals(156, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case99() {
        int[] knowledge = { 410, 608, 39, 361, 472, 172, 655, 948, 515, 524, 230, 490, 767, 888, 757, 633, 471, 740, 667, 523, 284, 161, 554, 706, 92, 260 };
        assertEquals(151, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case100() {
        int[] knowledge = { 688, 630, 43, 318, 46, 357, 389, 453, 155, 467, 834, 761, 920, 632, 739, 268, 777, 99, 315, 321, 54, 8, 470, 217 };
        assertEquals(182, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case101() {
        int[] knowledge = { 1, 4, 6, 6, 7, 12 };
        assertEquals(2, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case102() {
        int[] knowledge = { 2, 1 };
        assertEquals(0, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case103() {
        int[] knowledge = { 1, 5, 6, 10, 20, 21 };
        assertEquals(9, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case104() {
        int[] knowledge = { 2, 3 };
        assertEquals(0, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case105() {
        int[] knowledge = { 1, 5, 10, 11 };
        assertEquals(3, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case106() {
        int[] knowledge = { 5, 1, 8, 8, 13, 7, 6, 2, 1, 9, 5, 11, 3, 4 };
        assertEquals(3, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case107() {
        int[] knowledge = { 1, 499, 500, 500, 999, 1000 };
        assertEquals(498, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case108() {
        int[] knowledge = { 1, 8, 3, 9, 8, 8, 5, 5, 15, 6, 1, 9, 4, 5, 6, 11, 3, 18, 8, 10, 9, 12, 11, 13, 10, 9, 14, 16, 17, 3, 20, 5, 3, 7, 5, 4, 2, 5 };
        assertEquals(7, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case109() {
        int[] knowledge = { 1, 5, 6, 10, 20, 21, 1, 5, 6, 10, 20, 21 };
        assertEquals(9, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case110() {
        int[] knowledge = { 6, 6 };
        assertEquals(0, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case111() {
        int[] knowledge = { 1, 2, 9, 10, 11, 20 };
        assertEquals(8, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case112() {
        int[] knowledge = { 1, 1, 4, 4, 5, 20 };
        assertEquals(15, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case113() {
        int[] knowledge = { 8, 6 };
        assertEquals(0, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case114() {
        int[] knowledge = { 1, 2, 7, 8, 9, 11 };
        assertEquals(4, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case115() {
        int[] knowledge = { 1, 99, 100, 101 };
        assertEquals(97, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case116() {
        int[] knowledge = { 1, 1 };
        assertEquals(0, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case117() {
        int[] knowledge = { 1, 5, 9, 19, 20, 30 };
        assertEquals(6, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case118() {
        int[] knowledge = { 100, 75, 51, 50, 1, 1 };
        assertEquals(25, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case119() {
        int[] knowledge = { 9, 8, 7, 6, 2, 1 };
        assertEquals(3, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case120() {
        int[] knowledge = { 1, 2 };
        assertEquals(0, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case121() {
        int[] knowledge = { 1000, 1000 };
        assertEquals(0, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case122() {
        int[] knowledge = { 1, 2, 4, 4, 9, 9 };
        assertEquals(3, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case123() {
        int[] knowledge = { 1, 4, 5, 6, 8, 9 };
        assertEquals(2, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case124() {
        int[] knowledge = { 1, 3, 5, 7, 10, 10, 17, 18 };
        assertEquals(5, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case125() {
        int[] knowledge = { 10, 10 };
        assertEquals(0, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case126() {
        int[] knowledge = { 10, 9, 8, 7, 1, 1 };
        assertEquals(5, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case127() {
        int[] knowledge = { 1, 2, 5, 6, 7, 10 };
        assertEquals(2, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case128() {
        int[] knowledge = { 1, 9, 9, 10 };
        assertEquals(7, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case129() {
        int[] knowledge = { 200, 206, 500, 501 };
        assertEquals(5, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case130() {
        int[] knowledge = { 1, 6, 6, 8 };
        assertEquals(3, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case131() {
        int[] knowledge = { 1, 2, 2, 2 };
        assertEquals(1, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case132() {
        int[] knowledge = { 1, 7, 7, 7, 9, 10 };
        assertEquals(5, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case133() {
        int[] knowledge = { 1, 3, 3, 4 };
        assertEquals(1, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case134() {
        int[] knowledge = { 1, 9, 10, 11 };
        assertEquals(7, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case135() {
        int[] knowledge = { 1, 5, 5, 6 };
        assertEquals(3, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case136() {
        int[] knowledge = { 997, 998, 999, 1000 };
        assertEquals(0, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case137() {
        int[] knowledge = { 1000, 1000, 1000, 1000 };
        assertEquals(0, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case138() {
        int[] knowledge = { 100, 90, 80, 70, 69, 1 };
        assertEquals(58, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case139() {
        int[] knowledge = { 20, 19, 18, 17, 16, 8, 7, 1 };
        assertEquals(12, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case140() {
        int[] knowledge = { 6, 10 };
        assertEquals(0, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case141() {
        int[] knowledge = { 6, 1, 4, 4 };
        assertEquals(1, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case142() {
        int[] knowledge = { 1000, 999, 998, 997 };
        assertEquals(0, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case143() {
        int[] knowledge = { 1, 2, 3, 3, 6, 6 };
        assertEquals(2, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case144() {
        int[] knowledge = { 1, 5, 6, 7, 20, 21 };
        assertEquals(12, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case145() {
        int[] knowledge = { 1, 5, 20, 20, 99, 100 };
        assertEquals(64, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case146() {
        int[] knowledge = { 1, 2, 7, 7, 8, 10 };
        assertEquals(4, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case147() {
        int[] knowledge = { 7, 6, 4, 4, 3, 1 };
        assertEquals(1, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case148() {
        int[] knowledge = { 1, 2, 9, 9, 10, 1000 };
        assertEquals(989, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case149() {
        int[] knowledge = { 1, 10, 12, 15 };
        assertEquals(6, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case150() {
        int[] knowledge = { 1, 3, 9, 10 };
        assertEquals(1, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case151() {
        int[] knowledge = { 3, 5 };
        assertEquals(0, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case152() {
        int[] knowledge = { 1, 5, 6, 7 };
        assertEquals(3, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case153() {
        int[] knowledge = { 1000, 500, 800, 499, 1, 501, 800, 2 };
        assertEquals(497, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case154() {
        int[] knowledge = { 2, 5, 6, 94, 97, 98 };
        assertEquals(2, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case155() {
        int[] knowledge = { 2, 6 };
        assertEquals(0, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case156() {
        int[] knowledge = { 1, 100, 100, 2 };
        assertEquals(1, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case157() {
        int[] knowledge = { 1, 3, 500, 500, 500, 1000 };
        assertEquals(498, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case158() {
        int[] knowledge = { 1, 6, 50, 51, 99, 100 };
        assertEquals(4, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case159() {
        int[] knowledge = { 1, 9, 10, 11, 19, 20 };
        assertEquals(7, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case160() {
        int[] knowledge = { 2, 3, 4, 9 };
        assertEquals(4, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case161() {
        int[] knowledge = { 1, 3, 4, 6, 999, 1000 };
        assertEquals(992, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case162() {
        int[] knowledge = { 1, 2, 8, 9, 10, 16 };
        assertEquals(5, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case163() {
        int[] knowledge = { 7, 6, 6, 6, 6, 1 };
        assertEquals(4, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case164() {
        int[] knowledge = { 6, 5, 4, 1 };
        assertEquals(2, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case165() {
        int[] knowledge = { 1, 4, 5, 6, 9, 10 };
        assertEquals(2, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case166() {
        int[] knowledge = { 1, 98, 105, 105, 200, 201 };
        assertEquals(96, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case167() {
        int[] knowledge = { 91, 91, 50, 100, 2, 100, 1, 150 };
        assertEquals(80, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case168() {
        int[] knowledge = { 1, 50, 50, 70, 70, 100 };
        assertEquals(19, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case169() {
        int[] knowledge = { 11, 25, 38, 44 };
        assertEquals(8, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case170() {
        int[] knowledge = { 1, 3, 4, 4, 6, 6 };
        assertEquals(2, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case171() {
        int[] knowledge = { 1, 3, 4, 5, 7, 8 };
        assertEquals(1, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case172() {
        int[] knowledge = { 1, 8, 9, 9, 11, 12 };
        assertEquals(6, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case173() {
        int[] knowledge = { 2, 3, 4, 7, 7, 10 };
        assertEquals(2, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case174() {
        int[] knowledge = { 1, 10, 11, 12, 99, 100 };
        assertEquals(86, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case175() {
        int[] knowledge = { 999, 1000 };
        assertEquals(0, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case176() {
        int[] knowledge = { 10, 20 };
        assertEquals(0, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case177() {
        int[] knowledge = { 5, 10, 15, 16, 20, 30 };
        assertEquals(5, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case178() {
        int[] knowledge = { 1, 1000 };
        assertEquals(0, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case179() {
        int[] knowledge = { 1, 3, 3, 3, 6, 7 };
        assertEquals(3, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case180() {
        int[] knowledge = { 1, 2, 3, 4, 6, 6 };
        assertEquals(1, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case181() {
        int[] knowledge = { 8, 7, 4, 4, 3, 1 };
        assertEquals(2, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case182() {
        int[] knowledge = { 1, 4, 4, 5, 10, 11 };
        assertEquals(5, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case183() {
        int[] knowledge = { 70, 6, 5, 5, 2, 1 };
        assertEquals(63, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case184() {
        int[] knowledge = { 6, 5, 3, 3, 4, 1 };
        assertEquals(1, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case185() {
        int[] knowledge = { 999, 1000, 998, 997 };
        assertEquals(0, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case186() {
        int[] knowledge = { 1, 2, 2, 3, 5, 5 };
        assertEquals(2, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case187() {
        int[] knowledge = { 100, 99, 96, 4, 3, 1 };
        assertEquals(2, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case188() {
        int[] knowledge = { 1, 4, 5, 5, 9, 10 };
        assertEquals(3, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case189() {
        int[] knowledge = { 1, 2, 5, 7, 9, 18 };
        assertEquals(8, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case190() {
        int[] knowledge = { 10, 9, 6, 6, 5, 2 };
        assertEquals(2, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case191() {
        int[] knowledge = { 1, 4, 5, 5, 9, 9 };
        assertEquals(3, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case192() {
        int[] knowledge = { 1, 2, 4, 4, 5, 9 };
        assertEquals(3, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case193() {
        int[] knowledge = { 1, 6, 8, 9 };
        assertEquals(4, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case194() {
        int[] knowledge = { 1, 3, 4, 5, 999, 1000 };
        assertEquals(993, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case195() {
        int[] knowledge = { 1, 3, 4, 5, 8, 9 };
        assertEquals(2, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case196() {
        int[] knowledge = { 1, 2, 5, 8, 10, 20 };
        assertEquals(9, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case197() {
        int[] knowledge = { 1, 3, 4, 199, 200, 250, 300, 310 };
        assertEquals(145, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case198() {
        int[] knowledge = { 1, 6, 6, 7 };
        assertEquals(4, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case199() {
        int[] knowledge = { 1, 1000, 1, 1000, 1000, 1000 };
        assertEquals(999, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case200() {
        int[] knowledge = { 1, 9, 6, 6, 3, 7 };
        assertEquals(2, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case201() {
        int[] knowledge = { 1, 4, 4, 4, 6, 7 };
        assertEquals(2, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case202() {
        int[] knowledge = { 1, 20, 40, 50, 90, 100 };
        assertEquals(20, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case203() {
        int[] knowledge = { 1, 1, 50, 51, 90, 100 };
        assertEquals(10, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case204() {
        int[] knowledge = { 1, 51, 52, 53, 99, 120 };
        assertEquals(45, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case205() {
        int[] knowledge = { 2, 5, 5, 6 };
        assertEquals(2, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case206() {
        int[] knowledge = { 1, 4, 4, 5 };
        assertEquals(2, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case207() {
        int[] knowledge = { 1, 3, 4, 5, 6, 8, 8, 8 };
        assertEquals(3, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case208() {
        int[] knowledge = { 888, 999 };
        assertEquals(0, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case209() {
        int[] knowledge = { 1, 13 };
        assertEquals(0, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case210() {
        int[] knowledge = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 25, 65, 2 };
        assertEquals(20, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case211() {
        int[] knowledge = { 1, 2, 7, 8, 8, 8 };
        assertEquals(6, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case212() {
        int[] knowledge = { 1, 2, 5, 7, 8, 9 };
        assertEquals(2, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case213() {
        int[] knowledge = { 1, 1, 5, 5, 8, 10 };
        assertEquals(2, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case214() {
        int[] knowledge = { 1, 2, 3, 6, 6, 10 };
        assertEquals(3, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case215() {
        int[] knowledge = { 1, 2, 6, 7, 8, 100 };
        assertEquals(91, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case216() {
        int[] knowledge = { 1, 7, 6, 6 };
        assertEquals(4, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case217() {
        int[] knowledge = { 10, 10, 2, 3 };
        assertEquals(1, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case218() {
        int[] knowledge = { 555, 999 };
        assertEquals(0, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case219() {
        int[] knowledge = { 1, 1, 20, 20, 30, 47 };
        assertEquals(17, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case220() {
        int[] knowledge = { 2, 8 };
        assertEquals(0, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case221() {
        int[] knowledge = { 2, 6, 4, 3 };
        assertEquals(1, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case222() {
        int[] knowledge = { 2, 6, 7, 8, 14, 15 };
        assertEquals(5, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case223() {
        int[] knowledge = { 623, 13, 234, 45, 12, 116, 14, 15, 45, 323, 554, 3, 7, 9, 107, 16, 195, 18, 45, 468, 17, 17, 718, 15, 11, 465, 89, 45, 45, 637, 34, 62, 45, 645, 24, 27, 16, 12, 233, 23, 72, 15, 26, 125, 153, 165, 145, 23 };
        assertEquals(649, ellyspairs.getDifference(knowledge));
    }

    @Test
    public void case224() {
        int[] knowledge = { 1, 6, 6, 7, 1, 8 };
        assertEquals(4, ellyspairs.getDifference(knowledge));
    }

}
