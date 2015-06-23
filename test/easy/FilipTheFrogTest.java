package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class FilipTheFrogTest {
    FilipTheFrog filipthefrog = new FilipTheFrog();

    @Test
    public void case1() {
        int[] positions = { 4, 7, 1, 3, 5 };
        int L = 1;
        assertEquals(3, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case2() {
        int[] positions = { 100, 101, 103, 105, 107 };
        int L = 2;
        assertEquals(5, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case3() {
        int[] positions = { 17, 10, 22, 14, 6, 1, 2, 3 };
        int L = 4;
        assertEquals(7, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case4() {
        int[] positions = { 0 };
        int L = 1000;
        assertEquals(1, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case5() {
        int[] positions = { 0, 499, 999 };
        int L = 499;
        assertEquals(2, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case6() {
        int[] positions = { 1000, 0 };
        int L = 1000;
        assertEquals(2, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case7() {
        int[] positions = { 511, 15, 409, 667, 205, 23, 772, 212, 375, 944, 527, 98, 758, 273, 244, 803, 593, 857, 80, 126, 982, 10 };
        int L = 157;
        assertEquals(22, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case8() {
        int[] positions = { 633, 430, 611, 191, 5, 727, 111, 412, 626, 805, 50, 0, 217, 807, 704, 260, 434, 709, 16, 850, 959, 445, 305, 579, 896, 201, 965, 492, 406, 227, 54, 456, 622, 91, 586, 578, 895, 215, 279, 650 };
        int L = 103;
        assertEquals(40, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case9() {
        int[] positions = { 330, 696, 245, 827, 303, 601, 58, 379, 849, 970, 339, 911, 548, 399, 118, 49, 784, 863, 781, 287, 284, 540, 952, 592, 177, 342, 670, 560, 541, 554, 173, 491, 931, 706, 905, 75, 644, 543, 378, 641, 772, 273, 803, 628, 971 };
        int L = 90;
        assertEquals(17, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case10() {
        int[] positions = { 122, 935, 872, 975, 633, 783, 607, 824, 832, 354, 353, 377, 545, 329, 647, 7, 845, 823, 190, 688, 12, 515, 8, 574, 579, 357, 450, 602, 670, 945, 362, 658, 165, 352, 76, 345, 572, 821, 516, 827, 473, 884, 559, 455 };
        int L = 188;
        assertEquals(44, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case11() {
        int[] positions = { 170, 750, 543, 313, 62, 381, 703, 359, 326, 650, 65, 0, 184, 247, 456, 654, 612, 265, 911, 655, 148, 13, 7, 354, 369, 831, 288, 527, 71, 566, 406, 164, 42, 427, 689, 797, 717, 954, 546, 190, 50, 196, 88, 697, 306, 958, 845, 567, 93, 666 };
        int L = 91;
        assertEquals(50, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case12() {
        int[] positions = { 376, 243, 244, 399, 34, 663, 101, 500, 752, 816, 890, 742, 300, 190 };
        int L = 45;
        assertEquals(2, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case13() {
        int[] positions = { 894, 184, 527, 860, 528, 817, 210, 932, 688, 907, 749, 179, 589, 128, 333, 996, 366, 170, 823, 51, 735, 459, 4, 60, 843, 268, 553, 363, 984, 714, 921, 6, 560, 889, 611, 629, 469, 632, 236, 382, 360, 944, 147, 427, 63, 920, 196, 447, 532 };
        int L = 128;
        assertEquals(49, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case14() {
        int[] positions = { 203, 732, 467, 385, 282, 594, 785, 910, 938, 118, 70, 256, 383, 441, 889, 1000, 728, 599, 492, 499, 539, 105, 198, 494, 91, 612 };
        int L = 41;
        assertEquals(2, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case15() {
        int[] positions = { 814, 681, 306, 188, 437, 158, 257, 8, 505, 764, 128, 260, 533, 145, 982, 559, 252, 849, 530, 855, 411, 981, 446, 830, 717, 918, 630, 955, 476, 148, 300, 758, 852, 2, 513, 183, 414, 44, 567, 735, 450, 659 };
        int L = 127;
        assertEquals(42, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case16() {
        int[] positions = { 457, 638, 66, 867, 589, 523, 758 };
        int L = 662;
        assertEquals(7, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case17() {
        int[] positions = { 372, 907, 699, 564, 988, 764, 535, 931, 380, 742, 592, 261, 527, 804, 413, 321, 387, 71, 763, 628 };
        int L = 293;
        assertEquals(20, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case18() {
        int[] positions = { 686, 294, 101, 364, 340, 44, 667, 854, 76, 877, 295, 627, 639, 568, 334, 621, 506, 407, 393, 29, 977, 33, 678, 710, 802, 313, 601, 12, 876, 431, 227, 816, 119, 860, 700, 336, 129, 990, 140, 164, 542, 347, 477, 13, 256, 799, 937, 352, 878 };
        int L = 108;
        assertEquals(49, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case19() {
        int[] positions = { 7, 65, 635, 27, 86, 129, 192, 816, 699, 688, 702, 20, 729, 520, 160, 312, 790, 875, 402, 239, 469, 676, 685, 196, 690, 544, 742, 328, 914, 806, 975, 265, 542, 386, 263, 946, 68, 396, 911, 111, 774, 921 };
        int L = 87;
        assertEquals(23, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case20() {
        int[] positions = { 562, 985, 399, 266, 728, 541, 246, 937, 63, 402, 979, 271, 326, 638, 83, 677, 739, 313, 35, 23, 93, 933, 831 };
        int L = 165;
        assertEquals(23, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case21() {
        int[] positions = { 393, 247, 507, 489, 459, 756, 152, 694, 224, 368, 704, 714, 948, 600, 206, 849, 64, 20, 231, 81, 397, 933, 566 };
        int L = 25;
        assertEquals(3, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case22() {
        int[] positions = { 836, 662, 923, 491, 759, 208, 885, 365, 974, 133, 708, 72, 416, 80, 752, 524, 323, 64, 24, 607, 927, 227, 812, 496, 351, 334, 515, 513, 861, 423, 53, 722, 939 };
        int L = 147;
        assertEquals(33, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case23() {
        int[] positions = { 880, 312, 759, 982, 744, 995, 342, 699, 889, 591, 348, 518, 682, 216, 864, 77, 427, 138, 313, 708, 34, 528, 33, 385, 746, 246, 917, 439, 599, 271, 0, 656, 827, 493, 563, 275, 714, 838 };
        int L = 54;
        assertEquals(6, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case24() {
        int[] positions = { 87, 443, 339, 777 };
        int L = 590;
        assertEquals(4, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case25() {
        int[] positions = { 257, 347, 335, 661, 908, 651, 687, 990, 228, 430 };
        int L = 295;
        assertEquals(10, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case26() {
        int[] positions = { 989, 844, 321, 352, 123, 707, 762, 770, 722, 960, 588, 900, 732, 630, 318, 445, 309, 545, 500, 25, 864, 525, 564, 432, 587, 846, 828, 498, 965 };
        int L = 196;
        assertEquals(29, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case27() {
        int[] positions = { 706, 789, 340, 610, 836, 422, 70, 675, 573, 130, 73, 533, 113, 613, 703, 148, 278, 919, 30, 458, 327, 227, 219, 396, 376, 134, 687, 867, 178, 460, 499, 774, 170, 715, 468, 329, 306, 926, 634, 590, 971, 450, 68, 211, 922, 20, 214, 518, 386, 869 };
        int L = 4;
        assertEquals(2, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case28() {
        int[] positions = { 990, 835, 974, 345, 202, 226, 406, 26, 751, 834, 727, 885, 499, 888, 609, 476, 929, 964, 932, 188, 412, 250, 400, 301, 954, 17, 128, 754, 871, 666, 801, 391, 947, 77, 167, 42, 687, 648, 158, 64, 320, 482, 213, 292, 745, 34, 420, 480, 610, 760 };
        int L = 37;
        assertEquals(7, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case29() {
        int[] positions = { 571, 176, 385, 812, 290, 117, 365, 146, 554, 47, 271, 433, 605, 754, 311, 438, 325, 486, 102, 368, 787, 921, 506, 753, 767, 371, 37, 173, 519, 78, 976, 125, 348, 698, 529, 889, 277, 171, 637, 716, 603, 295, 302, 52, 48, 709, 354, 167, 694, 160 };
        int L = 186;
        assertEquals(50, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case30() {
        int[] positions = { 111, 142, 593, 12, 499, 126, 876, 868, 650, 389, 758, 909, 606, 514, 658, 750, 684, 94, 218, 543, 62, 123, 752, 823, 144, 946, 244, 226, 998, 676, 709, 809, 172, 386, 858, 678, 364, 428, 332, 375, 267, 448, 1000, 184, 539, 751, 87, 855, 963, 657 };
        int L = 55;
        assertEquals(15, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case31() {
        int[] positions = { 114, 518, 71, 454, 75, 243, 53, 153, 29, 595, 254, 887, 358, 618, 463, 139, 39, 109, 658, 57, 222, 37, 927, 460, 692, 604, 227, 171, 380, 242, 982, 56, 646, 760, 953, 233, 266, 626, 972, 255, 516, 20, 244, 186, 614, 130, 381, 477, 58, 960 };
        int L = 141;
        assertEquals(50, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case32() {
        int[] positions = { 759, 979, 587, 327, 257, 936, 445, 97, 169, 896, 978, 89, 469, 92, 388, 648, 791, 775, 82, 937, 498, 940, 714, 450, 131, 389, 153, 9, 529, 228, 530, 660, 862, 907, 890, 732, 468, 899, 575, 646, 109, 661, 202, 265, 803, 23, 901, 988, 552, 126 };
        int L = 76;
        assertEquals(50, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case33() {
        int[] positions = { 131, 326, 78, 439, 476, 744, 72, 333, 792, 826, 28, 749, 399, 958, 551, 929, 144, 564, 434, 347, 655, 324, 60, 375, 989, 296, 866, 602, 726, 425, 596, 793, 117, 251, 361, 519, 583, 299, 284, 638, 994, 105, 385, 6, 152, 734, 805, 230, 398, 803 };
        int L = 155;
        assertEquals(50, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case34() {
        int[] positions = { 948, 87, 61, 303, 929, 592, 711, 130, 199, 399, 715, 594, 934, 50, 157, 413, 847, 989, 133, 928, 369, 824, 127, 897, 80, 777, 658, 894, 448, 903, 106, 465, 876, 237, 488, 352, 14, 273, 588, 849, 12, 710, 852, 580, 774, 573, 52, 29, 322, 439 };
        int L = 58;
        assertEquals(15, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case35() {
        int[] positions = { 556, 868, 666, 569, 176, 136, 869, 644, 665, 565, 550, 215, 288, 202, 850, 409, 133, 12, 982, 255, 421, 943, 509, 928, 358, 5, 198, 917, 650, 637, 687, 583, 127, 911, 353, 438, 214, 464, 322, 34, 948, 279, 386, 692, 374, 402, 994, 309, 502, 273 };
        int L = 269;
        assertEquals(50, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case36() {
        int[] positions = { 803, 496, 886, 634, 954, 335, 356, 761, 783, 109, 550, 907, 996, 647, 941, 274, 681, 248, 246, 229, 606, 513, 230, 834, 961, 735, 644, 235, 91, 197, 432, 521, 562, 178, 191, 569, 63, 571, 708, 893, 74, 390, 906, 400, 696, 380, 340, 515, 411, 546 };
        int L = 98;
        assertEquals(50, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case37() {
        int[] positions = { 9, 2, 1, 6, 12, 16, 19, 21 };
        int L = 3;
        assertEquals(3, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case38() {
        int[] positions = { 8, 10, 12, 15, 16, 17, 18 };
        int L = 2;
        assertEquals(3, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case39() {
        int[] positions = { 4, 10, 11, 12, 13 };
        int L = 1;
        assertEquals(1, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case40() {
        int[] positions = { 16, 8, 9, 12 };
        int L = 1;
        assertEquals(1, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case41() {
        int[] positions = { 1, 4, 9, 12 };
        int L = 3;
        assertEquals(2, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case42() {
        int[] positions = { 1, 10, 4, 7 };
        int L = 3;
        assertEquals(4, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case43() {
        int[] positions = { 5, 1, 2 };
        int L = 2;
        assertEquals(1, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case44() {
        int[] positions = { 1, 2, 3, 4 };
        int L = 1;
        assertEquals(4, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case45() {
        int[] positions = { 8, 1, 2, 3, 4, 5, 6, 7, 9 };
        int L = 1;
        assertEquals(9, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case46() {
        int[] positions = { 1, 5, 1000 };
        int L = 1;
        assertEquals(1, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case47() {
        int[] positions = { 6, 1, 2 };
        int L = 1;
        assertEquals(1, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case48() {
        int[] positions = { 100, 1, 2, 3, 4, 5, 6, 7, 8 };
        int L = 2;
        assertEquals(1, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case49() {
        int[] positions = { 1, 2 };
        int L = 3;
        assertEquals(2, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case50() {
        int[] positions = { 0, 1, 2, 3, 100, 101, 102, 103 };
        int L = 1;
        assertEquals(4, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case51() {
        int[] positions = { 16, 8, 9, 12 };
        int L = 4;
        assertEquals(4, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case52() {
        int[] positions = { 1, 1000, 800, 999, 200, 998, 3 };
        int L = 1;
        assertEquals(1, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case53() {
        int[] positions = { 8, 6, 5, 4, 3, 2, 1 };
        int L = 1;
        assertEquals(1, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case54() {
        int[] positions = { 4, 1, 2, 6, 7 };
        int L = 1;
        assertEquals(1, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case55() {
        int[] positions = { 1, 10, 20, 30 };
        int L = 4;
        assertEquals(1, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case56() {
        int[] positions = { 17, 10, 22, 14, 6, 1, 2, 3, 600 };
        int L = 4;
        assertEquals(7, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case57() {
        int[] positions = { 10, 1, 2, 3, 4, 11 };
        int L = 1;
        assertEquals(2, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case58() {
        int[] positions = { 1 };
        int L = 1;
        assertEquals(1, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case59() {
        int[] positions = { 20, 1, 2, 3, 4, 5 };
        int L = 1;
        assertEquals(1, filipthefrog.countReachableIslands(positions, L));
    }

    @Test
    public void case60() {
        int[] positions = { 100 };
        int L = 1;
        assertEquals(1, filipthefrog.countReachableIslands(positions, L));
    }

}
