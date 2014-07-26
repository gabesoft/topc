package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class BoxesDiv2Test {
    BoxesDiv2 boxesdiv2 = new BoxesDiv2();

    @Test
    public void case1() {
        int[] candyCounts = { 8, 8 };
        assertEquals(16, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case2() {
        int[] candyCounts = { 5, 6 };
        assertEquals(16, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case3() {
        int[] candyCounts = { 1, 7 };
        assertEquals(16, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case4() {
        int[] candyCounts = { 1, 1, 13, 1, 1 };
        assertEquals(32, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case5() {
        int[] candyCounts = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32 };
        assertEquals(1024, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case6() {
        int[] candyCounts = { 468, 335, 501 };
        assertEquals(2048, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case7() {
        int[] candyCounts = { 725, 479, 359, 963, 465, 706, 146, 282, 828, 962, 492 };
        assertEquals(8192, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case8() {
        int[] candyCounts = { 943, 828, 437, 392, 605, 903, 154, 293, 383, 422, 717, 719, 896, 448, 727, 772, 539 };
        assertEquals(16384, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case9() {
        int[] candyCounts = { 913, 668, 300, 36, 895, 704, 812, 323, 334, 674, 665 };
        assertEquals(16384, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case10() {
        int[] candyCounts = { 712, 254, 869 };
        assertEquals(4096, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case11() {
        int[] candyCounts = { 645, 663, 758, 38, 860, 724, 742, 530, 779 };
        assertEquals(16384, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case12() {
        int[] candyCounts = { 36, 191, 843, 289, 107, 41, 943, 265, 649, 447, 806, 891, 730, 371, 351, 7, 102, 394 };
        assertEquals(16384, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case13() {
        int[] candyCounts = { 630, 624, 85, 955, 757, 841, 967, 377, 932, 309 };
        assertEquals(16384, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case14() {
        int[] candyCounts = { 440, 627, 324, 538, 539, 119 };
        assertEquals(8192, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case15() {
        int[] candyCounts = { 930, 542, 834, 116 };
        assertEquals(4096, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case16() {
        int[] candyCounts = { 659, 705, 931, 978, 307, 674, 387, 22, 746, 925, 73, 271, 830, 778, 574, 98, 513, 987, 291, 162, 637 };
        assertEquals(16384, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case17() {
        int[] candyCounts = { 768, 656, 575, 32, 53, 351, 151, 942, 725, 967, 431, 108, 192, 8, 338, 458, 288 };
        assertEquals(16384, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case18() {
        int[] candyCounts = { 384, 946, 910, 210, 759, 222, 589, 423, 947, 507, 31, 414, 169, 901, 592 };
        assertEquals(16384, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case19() {
        int[] candyCounts = { 656, 411, 360, 625 };
        assertEquals(4096, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case20() {
        int[] candyCounts = { 549, 484, 596, 42, 603, 351, 292, 837, 375, 21, 597, 22, 349, 200, 669, 485, 282, 735, 54 };
        assertEquals(16384, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case21() {
        int[] candyCounts = { 419, 939, 901, 789, 128, 468, 729, 894, 649, 484, 808, 422, 311, 618, 814, 515, 310, 617, 936, 452, 601 };
        assertEquals(32768, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case22() {
        int[] candyCounts = { 520, 557, 799, 304, 225, 9, 845, 610, 990, 703, 196 };
        assertEquals(16384, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case23() {
        int[] candyCounts = { 94, 344, 524, 588, 315, 504, 449 };
        assertEquals(8192, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case24() {
        int[] candyCounts = { 459, 619 };
        assertEquals(2048, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case25() {
        int[] candyCounts = { 797, 799 };
        assertEquals(2048, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case26() {
        int[] candyCounts = { 590, 799, 10 };
        assertEquals(4096, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case27() {
        int[] candyCounts = { 473, 623, 539, 293, 39, 180, 191, 658, 959, 192, 816, 889, 157, 512, 203, 635, 273, 56, 329 };
        assertEquals(16384, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case28() {
        int[] candyCounts = { 363, 887, 876, 434, 870, 143, 845, 417 };
        assertEquals(8192, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case29() {
        int[] candyCounts = { 999, 323, 652 };
        assertEquals(4096, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case30() {
        int[] candyCounts = { 700, 558, 477 };
        assertEquals(4096, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case31() {
        int[] candyCounts = { 390, 76, 713, 601, 511, 4, 870, 862, 689, 402, 790, 256, 424, 3 };
        assertEquals(16384, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case32() {
        int[] candyCounts = { 183, 286, 89, 427, 618, 758, 833, 933, 170, 155, 722, 190, 977, 330, 369, 693, 426, 556, 435, 550, 442, 513, 146, 61, 719, 754, 140, 424, 280, 997, 688, 530, 550, 438, 867, 950, 194, 196, 298, 417, 287, 106, 489, 283, 456, 735, 115, 702, 317, 672, 787, 264, 314, 356, 186, 54, 913, 809, 833, 946, 314, 757, 322, 559, 647, 983, 482, 145, 197, 223, 130, 162, 536, 451, 174, 467, 45, 660, 293, 440, 254, 25, 155, 511, 746, 650, 187, 314, 475, 23, 169, 19, 788, 906, 959, 392, 203, 626, 478, 415 };
        assertEquals(65536, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case33() {
        int[] candyCounts = { 825, 335, 875, 373, 160, 834, 71, 488, 298, 519, 178, 774, 271, 764, 669, 193, 986, 103, 481, 214, 628, 803, 100, 528, 626, 544, 925, 24, 973, 62, 182, 4, 433, 506, 594, 726, 32, 493, 143, 223, 287, 65, 901, 188, 361, 414, 975, 271, 171, 236, 834, 712, 761, 897, 668, 286, 551, 141, 695, 696, 625, 20, 126, 577, 695, 659, 303, 372, 467, 679, 594, 852, 485, 19, 465, 120, 153, 801, 88, 61, 927, 11, 758, 171, 316, 577, 228, 44, 759, 165, 110, 883, 87, 566, 488, 578, 475, 626, 628, 630 };
        assertEquals(65536, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case34() {
        int[] candyCounts = { 424, 521, 903, 963, 124, 597, 738, 262, 196, 526, 265, 261, 203, 117, 31, 327, 12, 772, 412, 548, 154, 521, 791, 925, 189, 764, 941, 852, 663, 830, 901, 714, 959, 579, 366, 8, 478, 201, 59, 440, 304, 761, 358, 325, 478, 109, 114, 888, 802, 851, 461, 429, 994, 385, 406, 541, 112, 705, 836, 357, 73, 351, 824, 486, 557, 217, 627, 358, 527, 358, 338, 272, 870, 362, 897, 23, 618, 113, 718, 697, 586, 42, 424, 130, 230, 566, 560, 933, 297, 856, 54, 963, 585, 735, 655, 973, 458, 370, 533, 964 };
        assertEquals(131072, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case35() {
        int[] candyCounts = { 484, 912, 636, 68, 849, 676, 939, 224, 143, 755, 512, 742, 176, 460, 826, 222, 871, 627, 935, 206, 784, 851, 399, 280, 702, 194, 735, 638, 535, 557, 994, 177, 706, 963, 549, 882, 301, 414, 642, 856, 856, 143, 463, 612, 878, 425, 679, 753, 444, 297, 674, 41, 314, 876, 73, 819, 611, 18, 933, 113, 696, 170, 832, 41, 489, 686, 91, 498, 590, 991, 146, 354, 315, 652, 741, 45, 259, 336, 760, 193, 606, 265, 182, 504, 830, 776, 609, 293, 998, 550, 557, 562, 628, 468, 542, 130, 241, 814, 175, 602 };
        assertEquals(131072, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case36() {
        int[] candyCounts = { 1 };
        assertEquals(1, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case37() {
        int[] candyCounts = { 3 };
        assertEquals(4, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case38() {
        int[] candyCounts = { 1000 };
        assertEquals(1024, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case39() {
        int[] candyCounts = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
        assertEquals(131072, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case40() {
        int[] candyCounts = { 1, 3, 3 };
        assertEquals(16, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case41() {
        int[] candyCounts = { 901, 902, 903, 904, 905, 906, 907, 908, 909, 910, 911, 912, 913, 914, 915, 916, 917, 918, 919, 920, 921, 922, 923, 924, 925, 926, 927, 928, 929, 930, 931, 932, 933, 934, 935, 936, 937, 938, 939, 940, 941, 942, 943, 944, 945, 946, 947, 948, 949, 950, 951, 952, 953, 954, 955, 956, 957, 958, 959, 960, 961, 962, 963, 964, 965, 966, 967, 968, 969, 970, 971, 972, 973, 974, 975, 976, 977, 978, 979, 980, 981, 982, 983, 984, 985, 986, 987, 988, 989, 990, 991, 992, 993, 994, 995, 996, 997, 998, 999, 1000 };
        assertEquals(131072, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case42() {
        int[] candyCounts = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
        assertEquals(65536, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case43() {
        int[] candyCounts = { 8, 8 };
        assertEquals(16, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case44() {
        int[] candyCounts = { 410, 659, 925, 454, 30, 304, 269, 785, 905, 787, 446, 41, 531, 643, 691, 634, 577, 35, 154, 78, 324, 145, 145, 217, 107, 304, 56, 762, 189, 820, 415, 180, 357, 27, 284, 177, 712, 88, 316, 8, 241, 427, 629, 651, 264, 353, 608, 19, 308, 133, 642, 720, 102, 433, 548, 585, 17, 272, 907, 787, 823, 839, 300, 491, 249, 474, 622, 736, 313, 113, 334, 3, 784, 620, 573, 530, 591, 597, 575, 96, 801, 781, 762, 599, 643, 821, 983, 259, 632, 836, 19, 741, 228, 726, 333, 20, 767, 50, 179, 186 };
        assertEquals(65536, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case45() {
        int[] candyCounts = { 1, 1 };
        assertEquals(2, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case46() {
        int[] candyCounts = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
        assertEquals(131072, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case47() {
        int[] candyCounts = { 1 };
        assertEquals(1, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case48() {
        int[] candyCounts = { 1, 4, 8, 8, 8 };
        assertEquals(32, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case49() {
        int[] candyCounts = { 1, 1, 1 };
        assertEquals(4, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case50() {
        int[] candyCounts = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1 };
        assertEquals(32, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case51() {
        int[] candyCounts = { 17, 17, 17 };
        assertEquals(128, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case52() {
        int[] candyCounts = { 4, 1, 2 };
        assertEquals(8, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case53() {
        int[] candyCounts = { 1, 7 };
        assertEquals(16, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case54() {
        int[] candyCounts = { 800, 475, 369, 390, 10, 962, 229, 798, 698, 631, 450, 222, 565, 211, 457, 739, 744, 140, 32, 741, 360, 866, 789, 153, 111, 746, 794, 265, 886, 420, 40, 685, 247, 408, 427, 608, 369, 655, 757, 418, 637, 206, 992, 553, 768, 800, 292, 512, 940, 323, 604, 651, 189, 392, 803, 651, 489, 948, 915, 375, 720, 306, 411, 318, 66, 189, 925, 434, 195, 681, 204, 832, 239, 547, 384, 6 };
        assertEquals(65536, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case55() {
        int[] candyCounts = { 17 };
        assertEquals(32, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case56() {
        int[] candyCounts = { 1, 3, 4 };
        assertEquals(16, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case57() {
        int[] candyCounts = { 1, 1, 2 };
        assertEquals(4, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case58() {
        int[] candyCounts = { 1, 2, 1 };
        assertEquals(4, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case59() {
        int[] candyCounts = { 1, 7, 7, 7 };
        assertEquals(32, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case60() {
        int[] candyCounts = { 1, 1, 32, 64 };
        assertEquals(128, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case61() {
        int[] candyCounts = { 5, 5, 5 };
        assertEquals(32, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case62() {
        int[] candyCounts = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
        assertEquals(131072, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case63() {
        int[] candyCounts = { 8, 16, 32, 64 };
        assertEquals(128, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case64() {
        int[] candyCounts = { 502, 349, 177, 219, 492, 2, 190, 61, 200, 56, 485, 476, 858, 731, 243, 777, 660, 246, 676, 891, 67, 354, 389, 956, 224, 394, 289, 19, 598, 93, 719, 451, 441, 247, 669, 933, 248, 858, 993, 447, 266, 829, 274, 123, 559, 868, 252, 571, 114 };
        assertEquals(32768, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case65() {
        int[] candyCounts = { 1, 1, 1, 8 };
        assertEquals(16, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case66() {
        int[] candyCounts = { 16 };
        assertEquals(16, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case67() {
        int[] candyCounts = { 1000, 999, 998 };
        assertEquals(4096, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case68() {
        int[] candyCounts = { 1, 1, 13 };
        assertEquals(32, boxesdiv2.findSize(candyCounts));
    }

    @Test
    public void case69() {
        int[] candyCounts = { 1, 1, 3, 7 };
        assertEquals(16, boxesdiv2.findSize(candyCounts));
    }

}
