package topc.test.graph;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.graph.*;

public class TheTreeTest {
    TheTree thetree = new TheTree();

    @Test
    public void case1() {
        int[] cnt = { 3 };
        assertEquals(2, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case2() {
        int[] cnt = { 2, 2 };
        assertEquals(4, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case3() {
        int[] cnt = { 4, 1, 2, 4 };
        assertEquals(5, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case4() {
        int[] cnt = { 4, 2, 1, 3, 2, 5, 7, 2, 4, 5, 2, 3, 1, 13, 6 };
        assertEquals(21, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case5() {
        int[] cnt = { 1 };
        assertEquals(1, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case6() {
        int[] cnt = { 1, 1, 1, 1, 1 };
        assertEquals(5, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case7() {
        int[] cnt = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(50, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case8() {
        int[] cnt = { 324, 200 };
        assertEquals(4, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case9() {
        int[] cnt = { 116, 771, 317, 611, 389, 111, 845, 345, 863, 454, 173, 44, 767, 259, 465, 754, 179, 189, 46, 251, 244, 468, 388, 197, 919, 294, 756, 896, 814, 669, 687, 613, 907, 269, 720, 702, 221, 208, 74, 37, 719, 811, 169, 474, 8, 775, 195, 344, 622, 293 };
        assertEquals(100, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case10() {
        int[] cnt = { 139, 203, 962, 53, 943, 1, 555, 533, 340, 615, 971, 956, 882, 822, 387 };
        assertEquals(20, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case11() {
        int[] cnt = { 253, 1, 663, 237, 218, 1, 1, 1, 1, 738, 977, 1, 295, 1, 1, 839, 1, 1, 195, 908, 43, 44, 1, 1, 548, 1, 888, 811, 434, 97, 888, 1, 181, 67, 621, 238, 1, 199, 1, 182, 495, 28, 120, 1, 1 };
        assertEquals(46, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case12() {
        int[] cnt = { 1, 1, 1, 1, 368, 328, 1, 1, 409, 1, 1, 631, 1, 1, 1, 1, 1, 117, 1, 1, 1, 1, 1, 1, 991, 783, 787, 925, 1, 1, 1, 1, 289, 571, 1, 721, 1, 1, 1, 1, 139, 1, 1, 1, 1 };
        assertEquals(45, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case13() {
        int[] cnt = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(49, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case14() {
        int[] cnt = { 1, 1, 488, 1, 1, 938, 1, 1, 1, 1, 1, 432, 1, 509, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 836, 1, 1, 1, 1, 227, 1, 1, 706, 1, 1, 247, 1, 1, 1, 1, 27, 1, 1, 1, 1 };
        assertEquals(46, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case15() {
        int[] cnt = { 615, 347, 258, 355, 132, 10, 866, 822, 118, 24, 182, 482, 111, 837, 139, 643, 479, 789, 527, 128, 43, 993, 194, 291, 185, 902, 805, 443, 415, 816, 764, 578, 592, 867, 99, 545, 257, 224, 415, 59, 785, 1, 623, 172, 639, 865, 93, 740, 39, 991 };
        assertEquals(91, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case16() {
        int[] cnt = { 716, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 408, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(49, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case17() {
        int[] cnt = { 1, 1, 859, 1, 130, 13, 1, 953, 967, 42, 743, 1, 1, 1, 857, 757, 322, 101, 756, 34, 1, 1, 1, 947, 298, 1, 1, 58, 884, 1, 1, 187, 1, 57, 1, 687, 168, 1, 723, 1, 1, 676, 627, 1, 1, 341, 720, 1, 1, 1 };
        assertEquals(50, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case18() {
        int[] cnt = { 292, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 904, 96, 1, 1, 1, 1, 1, 1, 1, 140, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(48, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case19() {
        int[] cnt = { 218, 1, 949, 1, 1, 999, 195, 837, 428, 18, 980, 98, 519, 1, 1, 229, 416, 1, 1, 718, 515, 312, 481, 1, 944, 524, 928, 817, 717, 371, 280, 1, 835, 1, 1, 1, 252, 300, 19, 586, 246, 1, 1, 857, 575, 1, 570 };
        assertEquals(50, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case20() {
        int[] cnt = { 746, 1, 291, 1, 380, 502, 505, 1, 1, 107, 1, 1, 1, 1, 261, 682, 701, 436, 1, 1, 1, 782, 1, 1, 227, 856, 518, 338, 1, 370, 753, 154, 1, 697, 1, 594, 249, 1, 207, 1, 311, 406, 1, 531, 46, 1, 1 };
        assertEquals(48, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case21() {
        int[] cnt = { 967, 1, 1, 1, 134, 1, 1, 1, 1, 465, 1, 1, 1, 1, 1, 1, 390, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 504, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 593 };
        assertEquals(49, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case22() {
        int[] cnt = { 1, 1, 912, 1, 1, 1, 743, 431, 956, 438, 760, 1, 968, 853, 687, 676, 1, 470, 429, 736, 734, 674, 1, 763, 1, 405, 744, 531, 815, 692, 208, 1, 709, 384, 1, 663, 1, 585, 1, 317, 835, 1, 762, 924, 43, 286 };
        assertEquals(46, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case23() {
        int[] cnt = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 898, 1, 1, 329, 1, 1, 339, 1, 1, 1, 1, 744, 1, 1, 1, 1, 1, 1, 1, 844, 1, 1, 1, 1, 494, 1, 235, 1, 1, 1, 1, 1, 25, 1, 878 };
        assertEquals(47, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case24() {
        int[] cnt = { 251, 256, 650, 46, 791, 851, 553, 853, 547, 10, 214, 163, 267, 507, 1, 745, 729, 820, 1, 545, 901, 897, 1, 445, 426, 435, 391, 1, 46, 764, 686, 323, 178, 1, 217, 1, 267, 424, 647, 196, 82, 730, 898, 409, 1, 580 };
        assertEquals(60, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case25() {
        int[] cnt = { 269, 462, 1, 419, 306, 475, 941, 276, 630, 457, 730, 139, 36, 964, 786, 49, 426, 86, 678, 635, 175, 511, 301, 272, 897, 63, 181, 411, 561, 172, 58, 463, 629, 332, 89, 885, 206, 791, 236, 372, 387, 22, 686, 278, 265 };
        assertEquals(84, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case26() {
        int[] cnt = { 1, 1, 683, 1, 1, 1, 1, 1, 277, 769, 1, 1, 1, 800, 1, 1, 1, 1, 1, 1, 807, 223, 1, 1, 91, 1, 1, 1, 991, 1, 1, 1, 1, 1, 1, 1, 434, 1, 1, 999, 126, 151, 1, 1, 8, 1 };
        assertEquals(46, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case27() {
        int[] cnt = { 416, 1, 1, 976, 683, 786, 1, 1, 447, 945, 767, 198, 604, 514, 529, 100, 858, 275, 933, 1, 1, 663, 348, 501, 867, 1, 371, 859, 249, 529, 161, 322, 732, 363, 923, 624, 97, 311, 717, 212, 785, 160, 362, 981, 2, 1, 317, 348 };
        assertEquals(51, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case28() {
        int[] cnt = { 286, 352, 759, 244, 1, 1, 728, 951, 97, 971, 876, 776, 1, 1, 954, 308, 1, 1, 398, 659, 1, 749, 655, 1, 536, 1, 1, 803, 1, 1, 691, 1, 337, 671, 173, 665, 1, 744, 1, 917, 638, 1, 760, 713, 1, 1, 1, 286, 12 };
        assertEquals(53, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case29() {
        int[] cnt = { 975, 1, 102, 380, 763, 254, 1, 1, 850, 1, 104, 62, 798, 1, 734, 791, 121, 1, 317, 1, 1, 187, 1, 797, 774, 1, 960, 356, 1, 906, 587, 1, 1, 979, 579, 182, 495, 1, 552, 360, 1, 374, 864, 443, 178 };
        assertEquals(47, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case30() {
        int[] cnt = { 387, 919, 515, 518, 853, 915, 500, 1, 395, 1, 805, 224, 920, 939, 105, 760, 823, 1, 484, 554, 868, 658, 262, 1, 629, 675, 686, 54, 694, 829, 454, 170, 895, 982, 826, 36, 940, 945, 184, 787, 1, 451, 583, 86, 923 };
        assertEquals(52, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case31() {
        int[] cnt = { 54, 316, 458, 210, 208, 41, 639, 315, 281, 672, 124, 819, 506, 1, 822, 977, 143, 958, 333, 69, 905, 827, 757, 1, 1, 842, 979, 496, 618, 1, 1, 555, 299, 154, 774, 165, 201, 126, 842, 760, 703, 893, 537, 726, 993, 466, 1, 23, 25 };
        assertEquals(62, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case32() {
        int[] cnt = { 866, 620, 833, 176, 261, 856, 859, 337, 214, 562, 364, 202, 183, 213, 1, 689, 887, 425, 1, 1, 719, 753, 1, 24, 82, 875, 817, 874, 861, 1, 100, 661, 30, 816, 356, 694, 224, 49, 96, 804, 779, 529, 45, 404, 402, 675, 1, 417, 737 };
        assertEquals(63, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case33() {
        int[] cnt = { 950, 868, 563, 789, 234, 140, 722, 852, 381, 568, 491, 255, 176, 1, 317, 118, 591, 11, 645, 1, 1, 619, 160, 906, 903, 531, 1, 441, 284, 1, 1, 559, 380, 537, 534, 263, 1, 173, 587, 833, 448, 770, 1, 37, 427, 663 };
        assertEquals(59, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case34() {
        int[] cnt = { 322, 473, 84, 524, 678, 722, 773, 38, 70, 584, 401, 150, 59, 560, 660, 674, 197, 522, 336, 1, 96, 533, 782, 751, 279, 789, 83, 616, 1, 840, 997, 755, 575, 1, 881, 809, 982, 5, 228, 1, 144, 22, 332, 357, 558 };
        assertEquals(64, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case35() {
        int[] cnt = { 631, 544, 589, 86, 556, 85, 855, 567, 2, 288, 472, 773, 584, 457, 369, 695, 76, 1, 937, 977, 1, 836, 427, 450, 822, 251, 326, 1, 861, 771, 957, 698, 98, 1, 725, 144, 1, 762, 733, 836, 1, 473, 1, 640, 568 };
        assertEquals(62, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case36() {
        int[] cnt = { 1, 113, 96, 1, 94, 120, 750, 311, 152, 990, 775, 297, 136, 276, 682, 528, 321, 469, 538, 1, 132, 652, 127, 294, 765, 281, 184, 290, 1, 570, 718, 910, 706, 124, 615, 532, 639, 737, 211, 1, 65, 660, 40, 288, 203, 70 };
        assertEquals(57, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case37() {
        int[] cnt = { 453, 79, 1, 562, 964, 382, 293, 185, 1, 303, 536, 1, 128, 512, 580, 30, 340, 654, 1, 50, 902, 86, 445, 1, 1, 975, 904, 1, 426, 335, 292, 378, 40, 1, 359, 319, 460, 1, 986, 1, 732, 548, 872, 512, 632, 1, 303 };
        assertEquals(49, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case38() {
        int[] cnt = { 288, 13, 650, 612, 746, 975, 991, 396, 163, 186, 87, 475, 360, 97, 698, 794, 1, 39, 8, 229, 982, 868, 297, 45, 401, 286, 14, 519, 719, 839, 515, 15, 203, 767, 615, 192, 432, 91, 710, 1, 921, 927, 71, 173, 1, 469, 865 };
        assertEquals(63, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case39() {
        int[] cnt = { 321, 128, 769, 703, 335, 795, 4, 552, 822, 827, 145, 801, 975, 224, 1, 535, 902, 601, 723, 801, 458, 752, 285, 271, 57, 279, 111, 576, 720, 706, 463, 10, 800, 262, 982, 27, 230, 931, 806, 628, 209, 97, 199, 312, 816, 20, 824, 495, 279, 757 };
        assertEquals(70, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case40() {
        int[] cnt = { 608, 895, 289, 647, 271, 845, 907, 519, 229, 372, 183, 274, 981, 86, 51, 317, 271, 363, 806, 273, 859, 1, 1, 87, 881, 279, 262, 112, 1, 771, 386, 1, 752, 137, 428, 630, 226, 919, 522, 1, 189, 539, 625, 917, 899 };
        assertEquals(66, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case41() {
        int[] cnt = { 583, 1, 1, 1, 26, 1, 253, 637, 1, 260, 20, 1, 257, 540, 504, 791, 91, 860, 588, 1, 1, 1, 333, 741, 1, 454, 893, 831, 1, 865, 396, 743, 1, 642, 850, 935, 102, 13, 140, 573, 503, 67, 1, 939, 828, 948, 532, 1 };
        assertEquals(49, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case42() {
        int[] cnt = { 580, 832, 794, 731, 692, 999, 428, 711, 1, 178, 249, 949, 528, 344, 43, 637, 304, 433, 1, 902, 143, 756, 565, 149, 590, 379, 1, 608, 1, 737, 541, 1, 790, 965, 424, 631, 799, 1, 97, 180, 766, 715, 1, 704, 720, 1, 243, 1, 20 };
        assertEquals(57, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case43() {
        int[] cnt = { 205, 272, 375, 377, 331, 984, 147, 121, 594, 36, 42, 641, 603, 77, 1, 54, 1, 674, 368, 708, 399, 259, 226, 438, 768, 554, 975, 254, 138, 629, 1, 807, 694, 1, 710, 512, 989, 98, 456, 106, 905, 734, 373, 42, 801, 317 };
        assertEquals(60, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case44() {
        int[] cnt = { 421, 646, 784, 370, 274, 374, 73, 17, 56, 27, 866, 927, 59, 993, 216, 538, 920, 334, 800, 925, 663, 1, 848, 980, 475, 254, 746, 610, 1, 313, 435, 210, 566, 82, 671, 1, 27, 559, 528, 550, 1, 832, 1, 546, 818, 79, 863 };
        assertEquals(68, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case45() {
        int[] cnt = { 706, 205, 153, 533, 895, 862, 364, 1, 662, 743, 455, 222, 568, 546, 547, 265, 433, 830, 477, 416, 610, 958, 920, 814, 1, 555, 488, 284, 295, 57, 705, 130, 1, 240, 17, 427, 586, 899, 968, 1, 7, 435, 877, 1, 540, 302, 398 };
        assertEquals(55, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case46() {
        int[] cnt = { 83, 694, 452, 972, 657, 280, 1, 494, 63, 223, 897, 931, 1, 687, 839, 426, 911, 492, 629, 665, 552, 720, 1, 1, 545, 444, 198, 73, 991, 56, 937, 889, 69, 291, 208, 686, 726, 616, 718, 1, 813, 123, 480, 654, 554, 72, 412 };
        assertEquals(53, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case47() {
        int[] cnt = { 188, 701, 75, 803, 130, 975, 924, 714, 471, 1, 1, 599, 514, 370, 728, 163, 18, 1, 993, 448, 896, 522, 468, 838, 1, 1, 923, 1, 1, 86, 263, 312, 786, 774, 622, 318, 301, 1, 537, 156, 860, 1, 377, 813, 337, 1, 1, 928 };
        assertEquals(57, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case48() {
        int[] cnt = { 499, 215, 116, 1, 1, 61, 297, 1, 1, 15, 583, 1, 349, 750, 839, 1, 859, 324, 140, 448, 351, 1, 1, 560, 846, 360, 944, 917, 751, 986, 49, 651, 1, 1, 559, 43, 1, 931, 252, 1, 673, 444, 379, 219, 770, 730, 258, 552, 1, 162 };
        assertEquals(53, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case49() {
        int[] cnt = { 1, 774, 829, 859, 528, 1, 338, 392, 85, 1, 330, 592, 65, 199, 169, 479, 941, 394, 491, 367, 43, 1, 1, 137, 1, 123, 993, 322, 31, 821, 565, 129, 459, 718, 1, 289, 354, 490, 688, 66, 252, 172, 658, 522, 888, 566, 695 };
        assertEquals(50, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case50() {
        int[] cnt = { 780, 213, 165, 997, 179, 654, 461, 1, 377, 549, 444, 692, 967, 208, 991, 752, 449, 605, 769, 509, 197, 297, 429, 573, 810, 1, 953, 49, 37, 1, 709, 903, 52, 409, 177, 834, 781, 349, 850, 695, 221, 630, 960, 805, 1, 726, 402 };
        assertEquals(56, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case51() {
        int[] cnt = { 1, 241, 476, 242, 136, 250, 983, 681, 512, 706, 149, 704, 281, 516, 601, 551, 911, 865, 18, 644, 968, 19, 965, 788, 84, 371, 200, 955, 500, 343, 670, 886, 564, 385, 237, 848, 892, 191, 230, 685, 122, 174, 548, 703, 314, 434, 957, 54, 102, 708 };
        assertEquals(98, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case52() {
        int[] cnt = { 590, 7, 628, 264, 436, 1, 910, 143, 286, 798, 699, 919, 98, 242, 536, 779, 436, 584, 509, 102, 122, 857, 395, 655, 644, 959, 113, 982, 633, 956, 901, 340, 655, 574, 196, 395, 558, 465, 862, 988, 368, 237, 759, 255, 800, 101, 537, 328, 609, 192 };
        assertEquals(88, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case53() {
        int[] cnt = { 239, 660, 308, 293, 523, 712, 291, 731, 273, 401, 1, 18, 675, 935, 233, 724, 925, 211, 481, 49, 568, 570, 127, 114, 526, 682, 530, 808, 133, 25, 962, 498, 347, 815, 200, 901, 113, 972, 347, 659, 670, 932, 934, 974, 353, 54, 149, 760, 477, 806 };
        assertEquals(78, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case54() {
        int[] cnt = { 697, 915, 509, 82, 459, 749, 558, 815, 541, 20, 631, 533, 792, 782, 797, 1, 570, 129, 47, 544, 521, 265, 192, 197, 843, 558, 299, 197, 712, 727, 767, 410, 898, 122, 113, 416, 890, 106, 378, 879, 531, 842, 419, 733, 128, 428, 188, 836, 421, 924 };
        assertEquals(68, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case55() {
        int[] cnt = { 252, 212, 766, 272, 999, 744, 614, 461, 369, 443, 680, 642, 494, 966, 227, 20, 357, 157, 500, 487, 1, 373, 727, 695, 973, 887, 104, 783, 363, 689, 646, 158, 684, 3, 133, 322, 980, 879, 417, 804, 905, 577, 667, 47, 619, 261, 416, 269, 15, 364 };
        assertEquals(70, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case56() {
        int[] cnt = { 962, 241, 641, 22, 299, 398, 943, 249, 866, 17, 614, 976, 888, 981, 910, 621, 967, 253, 752, 587, 892, 275, 330, 6, 342, 1, 471, 689, 48, 273, 396, 504, 345, 296, 338, 805, 427, 288, 922, 962, 572, 795, 759, 611, 154, 544, 289, 561, 386, 513 };
        assertEquals(75, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case57() {
        int[] cnt = { 772, 903, 355, 572, 787, 708, 351, 650, 694, 709, 826, 758, 287, 328, 737, 974, 230, 238, 646, 656, 971, 420, 726, 745, 498, 329, 704, 7, 708, 341, 1, 893, 452, 187, 153, 665, 987, 852, 157, 102, 538, 291, 124, 143, 521, 590, 691, 199, 544, 134 };
        assertEquals(80, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case58() {
        int[] cnt = { 291, 91, 666, 136, 121, 178, 335, 644, 680, 695, 420, 384, 246, 674, 349, 81, 322, 270, 451, 826, 787, 966, 33, 670, 972, 949, 599, 833, 329, 847, 902, 865, 744, 171, 159, 1, 626, 761, 45, 886, 172, 151, 236, 271, 518, 356, 55, 897, 764, 287 };
        assertEquals(85, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case59() {
        int[] cnt = { 460, 962, 263, 817, 549, 794, 338, 159, 689, 639, 585, 928, 747, 164, 903, 372, 189, 80, 239, 667, 400, 603, 493, 688, 186, 231, 150, 882, 272, 420, 966, 177, 588, 359, 509, 922, 276, 931, 395, 959, 1, 630, 359, 867, 797, 650, 791, 709, 769, 487 };
        assertEquals(90, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case60() {
        int[] cnt = { 260, 584, 768, 818, 12, 587, 839, 116, 244, 195, 458, 839, 609, 773, 825, 836, 722, 556, 846, 575, 57, 297, 787, 444, 265, 813, 779, 985, 960, 295, 432, 844, 441, 558, 836, 185, 640, 387, 137, 508, 869, 734, 682, 161, 530, 1, 824, 470, 238, 27 };
        assertEquals(95, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case61() {
        int[] cnt = { 138, 257, 298, 598, 1, 857, 206, 42, 617, 581, 428, 96, 187, 37, 78, 119, 559, 68, 960, 738, 955, 399, 740, 225, 874, 544, 915, 393, 864, 751, 701, 949, 47, 76, 849, 400, 360, 499, 1, 191, 660, 647, 514, 423, 732, 194, 745, 222, 143, 267 };
        assertEquals(78, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case62() {
        int[] cnt = { 1 };
        assertEquals(1, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case63() {
        int[] cnt = { 1, 1, 1, 1 };
        assertEquals(4, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case64() {
        int[] cnt = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(45, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case65() {
        int[] cnt = { 1, 1, 1, 1, 1, 1 };
        assertEquals(6, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case66() {
        int[] cnt = { 1, 1, 1 };
        assertEquals(3, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case67() {
        int[] cnt = { 1, 1, 2, 2, 2, 1 };
        assertEquals(7, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case68() {
        int[] cnt = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
        assertEquals(100, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case69() {
        int[] cnt = { 2, 2 };
        assertEquals(4, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case70() {
        int[] cnt = { 1, 1, 2, 2, 2 };
        assertEquals(6, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case71() {
        int[] cnt = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(50, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case72() {
        int[] cnt = { 3, 1, 2, 4, 2, 1 };
        assertEquals(7, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case73() {
        int[] cnt = { 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(50, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case74() {
        int[] cnt = { 2, 5, 1, 2, 10, 1 };
        assertEquals(8, thetree.maximumDiameter(cnt));
    }

    @Test
    public void case75() {
        int[] cnt = { 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2 };
        assertEquals(16, thetree.maximumDiameter(cnt));
    }

}
