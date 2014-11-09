package topc.test.geometry;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.geometry.*;

public class JumpingTest {
    Jumping jumping = new Jumping();

    @Test
    public void case1() {
        int x = 5;
        int y = 4;
        int[] jumpLengths = { 2, 5 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case2() {
        int x = 3;
        int y = 4;
        int[] jumpLengths = { 4 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case3() {
        int x = 3;
        int y = 4;
        int[] jumpLengths = { 6 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case4() {
        int x = 300;
        int y = 400;
        int[] jumpLengths = { 500 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case5() {
        int x = 0;
        int y = 1;
        int[] jumpLengths = { 100, 100 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case6() {
        int x = 11;
        int y = 12;
        int[] jumpLengths = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case7() {
        int x = 11;
        int y = 12;
        int[] jumpLengths = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 100 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case8() {
        int x = 421;
        int y = 326;
        int[] jumpLengths = { 530, 701, 509, 753, 257, 257, 120, 712, 352, 844, 706, 109, 394 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case9() {
        int x = -742;
        int y = 353;
        int[] jumpLengths = { 933, 918, 848, 973, 869, 981, 224, 550, 593, 165, 170, 552, 428, 191, 625, 636, 921, 945, 311, 863 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case10() {
        int x = -350;
        int y = 215;
        int[] jumpLengths = { 711, 237 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case11() {
        int x = -294;
        int y = 92;
        int[] jumpLengths = { 398, 676, 492, 191, 345, 135, 426, 630, 31, 728, 127, 744, 335, 105, 761, 750, 621, 257, 933, 573, 614, 491, 510, 120, 406, 696, 50, 328, 720, 498 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case12() {
        int x = -542;
        int y = -631;
        int[] jumpLengths = { 357, 185, 94, 246, 8, 307, 510, 755, 353, 666, 784, 739, 802, 691, 331, 338, 196, 657, 964, 12, 428, 43, 107, 969, 213, 2, 511, 481, 659, 572, 332, 815, 848, 565, 198, 626, 439, 932, 19, 488, 152, 188, 914, 180, 996, 751, 751, 914, 563, 135 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case13() {
        int x = 456;
        int y = -572;
        int[] jumpLengths = { 831, 141, 558, 679, 727, 504, 598, 409, 894, 989, 239, 86, 94, 189, 721, 212, 747, 388, 711, 210, 888, 669 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case14() {
        int x = -688;
        int y = -29;
        int[] jumpLengths = { 675 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case15() {
        int x = 343;
        int y = 835;
        int[] jumpLengths = { 371, 788, 303 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case16() {
        int x = -843;
        int y = 953;
        int[] jumpLengths = { 401, 997, 143, 586, 861, 48, 925, 732, 159, 387, 220 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case17() {
        int x = 521;
        int y = 411;
        int[] jumpLengths = { 683, 875, 62, 7, 603, 269 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case18() {
        int x = 777;
        int y = 998;
        int[] jumpLengths = { 724, 90, 107, 320, 131, 656, 733, 994, 975, 596, 811, 674, 56, 731, 96, 246, 706, 695, 949 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case19() {
        int x = -227;
        int y = 977;
        int[] jumpLengths = { 761, 742, 757, 645, 144, 641, 738, 680, 136, 150, 530, 211, 608, 418, 256, 788, 374, 627, 446, 113, 173, 596, 154, 54, 184 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case20() {
        int x = -712;
        int y = 313;
        int[] jumpLengths = { 177, 78, 777, 400, 655, 729, 3, 162, 456, 871, 317, 695, 382, 931, 481, 605, 387, 360 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case21() {
        int x = 140;
        int y = 138;
        int[] jumpLengths = { 703, 366, 454, 733, 837, 433, 564, 18, 108, 584, 911, 468, 117, 547, 720, 529, 72, 108, 257, 521, 354, 529, 155, 431, 478, 49, 521, 205, 415, 811 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case22() {
        int x = 455;
        int y = -397;
        int[] jumpLengths = { 132, 702, 710, 752, 23, 818, 653, 925, 696, 472, 154, 626, 979, 617, 143, 598, 89, 733, 918, 405, 744, 396, 750, 408, 937, 303, 768, 46, 564, 341, 399, 897, 52, 808, 768, 998, 979, 651, 810, 331, 361, 717, 162, 294, 210, 754, 99, 131, 635 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case23() {
        int x = -92;
        int y = 854;
        int[] jumpLengths = { 32, 693, 402, 675, 295, 694, 166, 950, 766, 738, 459, 842, 49, 944, 230, 216, 390, 210, 389, 755, 244, 502, 272, 517, 565, 278, 913, 6, 612, 213, 783, 93, 124, 202, 325, 5, 438, 603, 805 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case24() {
        int x = -285;
        int y = 793;
        int[] jumpLengths = { 576, 907, 760, 627, 897, 860, 764, 359, 578, 485, 748, 157, 949, 606, 455, 195, 360, 431, 324, 884, 25, 448, 203, 848 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case25() {
        int x = 692;
        int y = -538;
        int[] jumpLengths = { 589, 305, 134, 559, 843, 415, 568, 729, 507, 392, 1, 993, 119, 399, 719, 869, 976, 580, 120, 364, 597, 380, 917, 467, 841, 233, 431, 415, 156, 572, 312, 180, 797, 301, 217, 904, 994, 56, 729, 482, 906, 30, 38 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case26() {
        int x = 506;
        int y = -817;
        int[] jumpLengths = { 378, 683, 555, 507, 758, 530, 581, 642 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case27() {
        int x = 676;
        int y = -421;
        int[] jumpLengths = { 661, 491, 617, 733, 607, 115, 186, 648, 228, 436, 59, 184, 111, 743, 375, 605, 672, 873, 606, 481, 672, 980, 718, 482, 681, 792, 776, 1, 47, 833, 469, 859, 227, 179 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case28() {
        int x = -803;
        int y = 654;
        int[] jumpLengths = { 704, 464, 923, 512, 894 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case29() {
        int x = -285;
        int y = -139;
        int[] jumpLengths = { 920, 513, 93, 233, 221, 224, 39, 610, 453, 523, 729, 977, 153, 518, 424, 403, 705, 937, 351, 36, 826, 129, 965, 427, 166, 776, 405, 165, 874, 259, 625, 822 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case30() {
        int x = -868;
        int y = -285;
        int[] jumpLengths = { 227, 605, 452, 38, 839, 626, 380, 420, 576, 689, 898, 821, 79, 967, 798, 56, 675, 229, 403, 677, 280, 383, 977, 262, 328 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case31() {
        int x = 877;
        int y = 739;
        int[] jumpLengths = { 762, 343, 698, 34, 806, 319, 876, 939, 321, 758, 440, 289, 772, 528, 857, 869, 65, 571, 480, 268, 339, 412, 207, 747, 279 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case32() {
        int x = 548;
        int y = 595;
        int[] jumpLengths = { 143, 597, 209, 72, 169, 377, 8, 313, 949, 718, 358, 219, 855, 991, 854, 240, 450, 985, 712, 975, 822, 637, 329, 786, 494, 268, 244, 532, 955, 140, 984, 284, 685, 16, 597 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case33() {
        int x = -195;
        int y = -449;
        int[] jumpLengths = { 423, 214 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case34() {
        int x = -860;
        int y = -463;
        int[] jumpLengths = { 398, 577, 716, 850, 841, 514, 889, 423, 280, 583, 941, 867, 547, 801, 164, 923, 279, 46, 237, 758, 900, 186, 272, 818, 993, 433, 99, 132, 246, 185, 187, 636, 803, 705, 851, 578 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case35() {
        int x = 508;
        int y = -610;
        int[] jumpLengths = { 779, 338, 288, 620, 516, 888, 58, 454, 554, 889, 584, 786, 176, 90, 810, 354, 596, 98, 570, 271, 169, 239, 199, 484, 145, 592, 101, 943, 354, 586, 903, 190, 146, 520, 91, 545, 670, 343, 761, 698, 701, 978, 126 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case36() {
        int x = 975;
        int y = 181;
        int[] jumpLengths = { 704 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case37() {
        int x = 592;
        int y = -447;
        int[] jumpLengths = { 957, 527, 521, 976, 297, 149, 918, 609, 327, 846 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case38() {
        int x = -297;
        int y = 1;
        int[] jumpLengths = { 37, 646, 305, 644, 26, 256, 370, 260, 324, 880, 183, 708, 740, 357, 124, 919, 336 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case39() {
        int x = -262;
        int y = -185;
        int[] jumpLengths = { 270, 335, 486, 121, 907, 215, 681, 71, 280 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case40() {
        int x = 154;
        int y = 532;
        int[] jumpLengths = { 615, 745, 64, 327, 44, 876, 724, 58, 912, 419, 962, 473, 812, 767, 824, 840, 75, 511, 803, 323, 146, 923 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case41() {
        int x = 943;
        int y = 243;
        int[] jumpLengths = { 735, 279, 312, 10, 614, 438, 818, 214, 151, 604, 70, 288, 492, 550, 56, 206, 630, 669, 630, 253, 812, 251, 971, 646, 392, 91, 775, 565, 18, 959, 354, 817, 175, 784, 717, 408, 9, 895, 257, 264, 291, 250, 896, 883, 907, 50, 24, 450 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case42() {
        int x = -337;
        int y = 703;
        int[] jumpLengths = { 65, 803, 74, 644, 712, 60, 548, 170, 977, 153, 834, 405, 349, 90, 266, 511, 303, 998, 467, 823, 884, 129, 981, 846, 96, 718, 50, 420, 127, 730, 579, 537, 184, 575, 49, 39, 907, 314, 293, 892 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case43() {
        int x = -74;
        int y = -188;
        int[] jumpLengths = { 549, 764, 518, 18, 942, 449, 99, 387, 223, 808, 226, 695, 425, 548, 484, 619, 48 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case44() {
        int x = 666;
        int y = 247;
        int[] jumpLengths = { 896, 542, 78, 918, 233, 616, 611, 726, 386, 915, 172, 307, 654, 641, 399 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case45() {
        int x = -693;
        int y = 528;
        int[] jumpLengths = { 124, 578, 281, 581, 369, 159 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case46() {
        int x = -60;
        int y = 43;
        int[] jumpLengths = { 944, 267 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case47() {
        int x = 487;
        int y = 253;
        int[] jumpLengths = { 853, 35, 982, 863, 299, 202, 940, 999, 312, 885, 874, 259, 317, 144, 479, 675, 438, 30, 416, 572, 468, 558, 136, 456, 293, 549, 705, 292, 365, 679, 709, 856 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case48() {
        int x = 725;
        int y = 807;
        int[] jumpLengths = { 402, 427, 566, 288, 300, 725, 917, 950, 211, 454, 524, 859, 554, 3, 156, 960, 107, 288, 358, 4, 883, 985, 488, 811, 443, 771 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case49() {
        int x = -299;
        int y = -830;
        int[] jumpLengths = { 549, 98 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case50() {
        int x = -12;
        int y = -361;
        int[] jumpLengths = { 981, 177, 16, 634, 355, 195, 356, 171, 893, 323, 654, 502, 524, 379, 91, 21, 43, 268, 153 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case51() {
        int x = -342;
        int y = -927;
        int[] jumpLengths = { 60, 693, 573, 643, 212, 263, 995, 117, 276, 925, 385, 107, 780, 374, 8, 667, 67, 143, 178, 282, 775, 935, 787, 518, 293, 899 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case52() {
        int x = -590;
        int y = 172;
        int[] jumpLengths = { 621, 15, 821, 412 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case53() {
        int x = -337;
        int y = -114;
        int[] jumpLengths = { 779, 504, 718, 216, 256, 961, 506, 454, 555, 612, 340, 370, 32, 905, 735, 87, 36, 17, 446, 166, 328, 877, 135, 601, 580, 603, 560, 652, 871, 746, 154, 948, 252, 519, 414, 484, 962, 131, 221, 866 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case54() {
        int x = 637;
        int y = -702;
        int[] jumpLengths = { 568, 244, 748, 258, 621, 197, 17, 347, 688, 448, 202, 570, 444, 633, 979, 548, 347, 636, 265, 248, 453, 110, 896, 228, 103, 422 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case55() {
        int x = -115;
        int y = 801;
        int[] jumpLengths = { 837, 124, 587, 618, 252, 841, 728, 32, 887, 118, 226, 448, 719, 839, 630, 426, 1000, 72 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case56() {
        int x = -9;
        int y = -893;
        int[] jumpLengths = { 752, 933, 174, 140, 220, 211, 591, 343, 263, 548, 455, 185, 718, 98, 918, 267, 237, 216, 348, 609, 918, 266, 662, 441, 371, 701, 901, 135, 236, 86, 478 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case57() {
        int x = -555;
        int y = -259;
        int[] jumpLengths = { 824, 93, 363, 684, 339, 789, 119, 376, 957, 967, 329, 805, 832, 136, 388, 359, 695, 964, 593, 310, 551, 663, 750, 974, 408, 509, 668, 479, 790, 195 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case58() {
        int x = 11;
        int y = 12;
        int[] jumpLengths = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case59() {
        int x = 15;
        int y = 11;
        int[] jumpLengths = { 2, 2, 6, 8, 10, 4, 11, 1 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case60() {
        int x = 1;
        int y = 1;
        int[] jumpLengths = { 2 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case61() {
        int x = 3;
        int y = 4;
        int[] jumpLengths = { 4 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case62() {
        int x = 11;
        int y = 12;
        int[] jumpLengths = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 100 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case63() {
        int x = 1;
        int y = 0;
        int[] jumpLengths = { 100, 101 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case64() {
        int x = 1;
        int y = 1;
        int[] jumpLengths = { 100, 10 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case65() {
        int x = 10;
        int y = 10;
        int[] jumpLengths = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case66() {
        int x = 0;
        int y = 1;
        int[] jumpLengths = { 2, 2, 2, 1 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case67() {
        int x = 8;
        int y = 0;
        int[] jumpLengths = { 10, 1 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case68() {
        int x = 1;
        int y = 1;
        int[] jumpLengths = { 1 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case69() {
        int x = 0;
        int y = 5;
        int[] jumpLengths = { 1, 1, 1, 1, 1, 8 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case70() {
        int x = 0;
        int y = 1;
        int[] jumpLengths = { 100, 100 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case71() {
        int x = 10;
        int y = 0;
        int[] jumpLengths = { 100, 10 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case72() {
        int x = 3;
        int y = 4;
        int[] jumpLengths = { 5, 100 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case73() {
        int x = 0;
        int y = 5;
        int[] jumpLengths = { 1 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case74() {
        int x = 6;
        int y = 8;
        int[] jumpLengths = { 2, 3, 2, 3 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case75() {
        int x = 3;
        int y = 4;
        int[] jumpLengths = { 1, 1 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case76() {
        int x = 4;
        int y = 5;
        int[] jumpLengths = { 100, 1, 1, 1 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case77() {
        int x = 5;
        int y = 4;
        int[] jumpLengths = { 2, 5 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case78() {
        int x = 100;
        int y = 100;
        int[] jumpLengths = { 1, 2, 3, 1000 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case79() {
        int x = 4;
        int y = 4;
        int[] jumpLengths = { 4 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case80() {
        int x = 3;
        int y = 4;
        int[] jumpLengths = { 1, 1, 1, 1 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case81() {
        int x = 0;
        int y = 1;
        int[] jumpLengths = { 100 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case82() {
        int x = 1;
        int y = 1;
        int[] jumpLengths = { 1, 3, 4, 5, 7, 6, 2, 1 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case83() {
        int x = 11;
        int y = 12;
        int[] jumpLengths = { 1, 2, 3, 4, 5, 6, 7, 8, 100, 9 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case84() {
        int x = 0;
        int y = 0;
        int[] jumpLengths = { 2, 2 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case85() {
        int x = 1;
        int y = 1;
        int[] jumpLengths = { 100, 1 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case86() {
        int x = 1;
        int y = 0;
        int[] jumpLengths = { 100, 1 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case87() {
        int x = 0;
        int y = 0;
        int[] jumpLengths = { 1, 2, 1, 3, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 3, 1, 2, 1, 2, 2, 2, 1, 3, 1, 2, 2, 3, 1, 2, 3, 2, 1, 2, 2, 3 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case88() {
        int x = 0;
        int y = 0;
        int[] jumpLengths = { 10, 10, 10 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case89() {
        int x = -5;
        int y = 0;
        int[] jumpLengths = { 100, 100, 3, 4 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case90() {
        int x = 0;
        int y = 20;
        int[] jumpLengths = { 50, 100 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case91() {
        int x = 10;
        int y = 0;
        int[] jumpLengths = { 10, 38, 10, 1, 10 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case92() {
        int x = 0;
        int y = 0;
        int[] jumpLengths = { 1 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case93() {
        int x = 1;
        int y = 1;
        int[] jumpLengths = { 10, 20, 10 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case94() {
        int x = 3;
        int y = 4;
        int[] jumpLengths = { 1, 1, 1, 1, 1 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case95() {
        int x = 2;
        int y = 0;
        int[] jumpLengths = { 2, 4, 8, 16, 32, 64, 128, 256, 512 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case96() {
        int x = 3;
        int y = 3;
        int[] jumpLengths = { 1, 1, 100 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case97() {
        int x = 1000;
        int y = 1000;
        int[] jumpLengths = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case98() {
        int x = 5;
        int y = 4;
        int[] jumpLengths = { 2, 4 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case99() {
        int x = 5;
        int y = 6;
        int[] jumpLengths = { 7 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case100() {
        int x = 0;
        int y = 4;
        int[] jumpLengths = { 3, 10, 3 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case101() {
        int x = 1;
        int y = 1;
        int[] jumpLengths = { 1, 3 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case102() {
        int x = 0;
        int y = 0;
        int[] jumpLengths = { 1, 5, 11, 5 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case103() {
        int x = 3;
        int y = 4;
        int[] jumpLengths = { 30, 25 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case104() {
        int x = 0;
        int y = 98;
        int[] jumpLengths = { 100, 1 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case105() {
        int x = 3;
        int y = 4;
        int[] jumpLengths = { 2, 100 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case106() {
        int x = 3;
        int y = 4;
        int[] jumpLengths = { 10 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case107() {
        int x = 0;
        int y = 0;
        int[] jumpLengths = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case108() {
        int x = 300;
        int y = 400;
        int[] jumpLengths = { 500 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case109() {
        int x = 0;
        int y = 0;
        int[] jumpLengths = { 4, 4 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case110() {
        int x = 1000;
        int y = -1000;
        int[] jumpLengths = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1000, 50, 500, 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 20, 30, 40, 50, 60, 70, 80, 90, 11, 22, 33, 44, 55, 66, 77, 88, 99, 999, 20 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case111() {
        int x = 1;
        int y = 0;
        int[] jumpLengths = { 3, 1 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case112() {
        int x = 3;
        int y = 4;
        int[] jumpLengths = { 1, 4 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case113() {
        int x = 11;
        int y = 12;
        int[] jumpLengths = { 100, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case114() {
        int x = 1000;
        int y = 1000;
        int[] jumpLengths = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case115() {
        int x = 3;
        int y = 5;
        int[] jumpLengths = { 1, 2, 10, 3 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case116() {
        int x = 3;
        int y = 4;
        int[] jumpLengths = { 5, 5 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case117() {
        int x = 4;
        int y = 0;
        int[] jumpLengths = { 5, 100 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case118() {
        int x = 0;
        int y = 3;
        int[] jumpLengths = { 1, 100 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case119() {
        int x = 33;
        int y = 52;
        int[] jumpLengths = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 100 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case120() {
        int x = 1;
        int y = 0;
        int[] jumpLengths = { 2, 3 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case121() {
        int x = 1;
        int y = 0;
        int[] jumpLengths = { 500, 500, 500, 500, 555 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case122() {
        int x = 0;
        int y = 1;
        int[] jumpLengths = { 100, 200, 100 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case123() {
        int x = 3;
        int y = 4;
        int[] jumpLengths = { 6, 12 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case124() {
        int x = 11;
        int y = 12;
        int[] jumpLengths = { 1, 2, 3, 4, 5, 6, 7, 8, 100, 9, 1000 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case125() {
        int x = 3;
        int y = 4;
        int[] jumpLengths = { 5 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case126() {
        int x = 1;
        int y = 0;
        int[] jumpLengths = { 4, 3 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case127() {
        int x = 4;
        int y = 0;
        int[] jumpLengths = { 1, 2 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case128() {
        int x = 0;
        int y = 0;
        int[] jumpLengths = { 1, 3, 3 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case129() {
        int x = 97;
        int y = 0;
        int[] jumpLengths = { 1, 2, 100 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case130() {
        int x = 0;
        int y = 1;
        int[] jumpLengths = { 3, 1, 3 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case131() {
        int x = 1000;
        int y = 1000;
        int[] jumpLengths = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 11, 1, 1, 1, 1, 1, 1, 11, 1, 1 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case132() {
        int x = 4;
        int y = 4;
        int[] jumpLengths = { 5 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case133() {
        int x = 3;
        int y = 4;
        int[] jumpLengths = { 4, 4, 6 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case134() {
        int x = 0;
        int y = 0;
        int[] jumpLengths = { 2, 3, 2 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case135() {
        int x = 2;
        int y = 0;
        int[] jumpLengths = { 1, 3 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case136() {
        int x = 0;
        int y = 0;
        int[] jumpLengths = { 1, 1, 2 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case137() {
        int x = 0;
        int y = 0;
        int[] jumpLengths = { 100, 100 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case138() {
        int x = 0;
        int y = 0;
        int[] jumpLengths = { 4, 4, 7 };
        assertEquals("Able", jumping.ableToGet(x, y, jumpLengths));
    }

    @Test
    public void case139() {
        int x = 11;
        int y = 12;
        int[] jumpLengths = { 100, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        assertEquals("Not able", jumping.ableToGet(x, y, jumpLengths));
    }

}
