package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class TheJediTestDiv2Test {
    TheJediTestDiv2 thejeditestdiv2 = new TheJediTestDiv2();

    @Test
    public void case1() {
        int[] students = { 10, 15 };
        int Y = 12;
        int J = 5;
        assertEquals(3, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case2() {
        int[] students = { 11, 13, 15 };
        int Y = 9;
        int J = 5;
        assertEquals(7, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case3() {
        int[] students = { 10 };
        int Y = 100;
        int J = 2;
        assertEquals(0, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case4() {
        int[] students = { 4, 7, 10, 5, 6, 55, 2 };
        int Y = 20;
        int J = 3;
        assertEquals(26, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case5() {
        int[] students = { 45, 551, 575, 17, 90, 488, 22, 195, 278, 659, 36, 251, 663, 341, 129, 6, 481, 398, 778, 360, 297, 545, 869, 798, 739, 684, 711, 928, 986, 85, 885, 586, 723, 341, 453, 552, 507, 123, 648, 920, 573, 956, 919, 739, 963, 391, 385 };
        int Y = 201;
        int J = 194;
        assertEquals(143, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case6() {
        int[] students = { 116, 689, 301, 755, 311, 150, 582, 835, 440, 943, 708, 969, 612 };
        int Y = 630;
        int J = 294;
        assertEquals(30, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case7() {
        int[] students = { 985, 37, 940, 856, 793, 314, 755, 558, 675, 661, 953, 424, 342, 190, 584, 226, 244, 956, 440, 681, 852, 700, 944, 129, 344, 944, 95 };
        int Y = 517;
        int J = 219;
        assertEquals(84, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case8() {
        int[] students = { 432, 799, 320, 235, 730, 242, 54, 824, 734, 310, 447, 496, 572, 332, 862, 882, 600, 435, 647, 336, 358, 700, 369, 230, 5, 215, 981, 569, 49, 939 };
        int Y = 134;
        int J = 133;
        assertEquals(125, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case9() {
        int[] students = { 94, 451, 47, 285, 729, 904, 829, 687, 992, 902, 498, 920, 590, 741, 663, 159, 929, 33, 50, 225, 361, 265, 261 };
        int Y = 204;
        int J = 191;
        assertEquals(71, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case10() {
        int[] students = { 418, 628, 404, 19, 533, 600, 561, 52, 893, 62, 790, 50, 808, 72, 741, 135, 628, 300, 966, 148, 983, 852, 703, 312, 872, 837, 659, 964, 331, 314, 743, 439, 115, 204, 31, 418, 34, 518, 616, 562, 330, 788, 317 };
        int Y = 196;
        int J = 22;
        assertEquals(952, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case11() {
        int[] students = { 732, 825, 749, 511, 467, 306, 742, 532, 934, 791, 866, 972, 547, 646, 529, 929, 762, 461, 622, 886, 891, 353, 894, 902, 314, 526, 939, 940, 266, 238, 779, 167, 94, 620, 63, 385, 556, 418, 523, 893, 459, 644, 403, 989, 704 };
        int Y = 66;
        int J = 49;
        assertEquals(589, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case12() {
        int[] students = { 572, 413, 803, 177, 944, 820, 689, 155, 962, 177, 440, 473, 545, 711, 122, 764, 85, 800, 800, 577, 591, 849, 50, 287, 517, 627, 402, 685, 551, 701, 366, 753, 640, 333, 234, 896, 627, 163, 724, 347, 974, 279, 73, 800, 154, 834, 210, 338, 517, 169 };
        int Y = 248;
        int J = 69;
        assertEquals(394, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case13() {
        int[] students = { 560, 919, 798, 730, 31, 834, 393, 520, 430, 227, 850, 37, 829, 274, 335, 679, 629, 872, 404, 986, 210, 229, 15, 585, 789, 110, 622, 422 };
        int Y = 153;
        int J = 93;
        assertEquals(166, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case14() {
        int[] students = { 939, 784, 554, 559, 337, 905, 470, 339 };
        int Y = 210;
        int J = 98;
        assertEquals(51, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case15() {
        int[] students = { 732, 242, 353, 371, 686, 220, 170, 671, 561, 215, 298, 315, 374, 451, 455, 179, 933, 983, 473, 687, 573, 72, 960, 440 };
        int Y = 568;
        int J = 54;
        assertEquals(212, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case16() {
        int[] students = { 889, 241, 942, 573, 688, 274, 185, 725, 628, 692, 79, 508, 667, 53, 71, 410, 889, 19, 390, 532, 972, 925, 703, 240, 30, 730 };
        int Y = 329;
        int J = 225;
        assertEquals(72, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case17() {
        int[] students = { 306, 959, 16, 721, 161, 201, 223, 436, 667, 546, 909, 620, 572, 379, 429, 10, 66, 12, 790, 30, 962, 198, 901, 394, 603, 827, 416, 941, 995, 528 };
        int Y = 458;
        int J = 417;
        assertEquals(51, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case18() {
        int[] students = { 169, 513, 153, 611, 479, 360, 565, 544, 303, 34, 450 };
        int Y = 284;
        int J = 70;
        assertEquals(62, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case19() {
        int[] students = { 301, 929, 661, 141, 972, 302, 226, 248, 115, 583, 17, 674, 264, 559, 597, 207, 885, 594 };
        int Y = 184;
        int J = 66;
        assertEquals(132, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case20() {
        int[] students = { 905, 2, 4, 732, 374, 534, 675, 69, 434, 452, 105, 680, 562, 160, 971, 967, 714, 16, 931, 225, 593, 274, 865, 696, 969, 57, 253, 407, 419, 239, 709, 100, 757, 856 };
        int Y = 392;
        int J = 65;
        assertEquals(267, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case21() {
        int[] students = { 455, 366, 840, 955, 627 };
        int Y = 881;
        int J = 160;
        assertEquals(16, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case22() {
        int[] students = { 787, 167, 426, 169, 199, 95, 135, 239, 111 };
        int Y = 38;
        int J = 7;
        assertEquals(331, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case23() {
        int[] students = { 841, 591, 619, 878, 616, 149, 776, 139, 999, 651, 785, 973, 730, 387, 343, 3, 952, 262, 304, 205, 811, 846, 284, 916, 631, 46, 742, 11, 974, 445, 273, 262, 113, 436, 950, 460, 687, 729, 122, 382, 532, 416, 315, 786, 7, 782 };
        int Y = 658;
        int J = 306;
        assertEquals(102, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case24() {
        int[] students = { 255, 903, 530, 604, 429, 631, 703, 789, 867, 830, 543, 918, 490, 487, 367, 237, 718, 423, 282, 120, 136, 371 };
        int Y = 450;
        int J = 288;
        assertEquals(49, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case25() {
        int[] students = { 985, 158, 729, 632, 625, 136, 86, 641, 234, 897, 2, 989, 584, 264, 409, 279, 735, 120, 526, 326, 569, 590, 974 };
        int Y = 528;
        int J = 116;
        assertEquals(108, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case26() {
        int[] students = { 574, 973, 561, 928, 243, 215, 225, 222, 166, 584, 505, 642, 280, 251, 327, 625, 919, 828, 420, 39, 382, 771, 243, 438, 88, 405, 773, 97, 934, 752, 427, 883, 427 };
        int Y = 20;
        int J = 17;
        assertEquals(964, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case27() {
        int[] students = { 233, 566, 721, 490, 728, 622 };
        int Y = 456;
        int J = 363;
        assertEquals(10, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case28() {
        int[] students = { 437, 571, 555, 195, 323, 944, 155, 889, 960, 757, 612, 18, 1000, 78, 899 };
        int Y = 698;
        int J = 71;
        assertEquals(117, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case29() {
        int[] students = { 392, 767, 387, 742, 850, 526, 280, 689, 996, 502 };
        int Y = 284;
        int J = 168;
        assertEquals(40, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case30() {
        int[] students = { 176, 618, 564, 243, 723, 6, 119, 652, 798, 211, 692, 436, 528, 349, 383, 141, 700, 155, 287, 990, 624 };
        int Y = 93;
        int J = 79;
        assertEquals(127, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case31() {
        int[] students = { 681, 783, 413, 670, 56, 979, 967, 858, 785, 89, 202, 405, 796, 906, 945, 959, 306, 509, 144, 893, 553, 61, 935, 646, 575, 932, 979, 469, 460 };
        int Y = 367;
        int J = 139;
        assertEquals(139, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case32() {
        int[] students = { 252, 143, 27, 983, 486, 425, 966, 743, 149, 80, 30, 615, 723, 129, 575, 627, 827, 570, 794, 907, 922, 763, 27, 696, 468, 463, 220, 423, 900, 851, 476, 548, 801, 319, 545, 821, 710, 514, 498, 338, 38, 55, 832, 252, 692 };
        int Y = 248;
        int J = 1;
        assertEquals(22975, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case33() {
        int[] students = { 133, 216, 59, 361, 780, 995, 935, 81, 811, 778, 343, 316, 716, 933, 728, 406 };
        int Y = 706;
        int J = 497;
        assertEquals(23, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case34() {
        int[] students = { 626, 20, 284, 8, 26, 787, 274, 475 };
        int Y = 162;
        int J = 105;
        assertEquals(26, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case35() {
        int[] students = { 186, 955, 754, 989, 507, 351, 266, 365, 98, 387, 860, 67, 29, 803, 69, 388, 504, 894, 961, 599, 691, 775, 880, 12, 47, 729, 374, 595, 9, 771, 785, 386, 911, 355 };
        int Y = 700;
        int J = 9;
        assertEquals(1865, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case36() {
        int[] students = { 694, 429, 948, 572, 531, 905, 620, 531, 302, 990, 717, 372, 563, 385, 745, 541, 214, 968, 733, 839, 560, 762, 529, 8, 446, 904 };
        int Y = 612;
        int J = 1;
        assertEquals(15196, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case37() {
        int[] students = { 899, 147, 151, 689, 405, 932, 701, 558, 718, 1000, 140, 820, 111, 738, 970, 955, 194, 27, 552, 348, 481, 12, 88, 752, 460, 550, 164, 779, 520, 87, 849, 103, 259, 287, 388, 123, 838, 518, 67, 676, 260 };
        int Y = 179;
        int J = 10;
        assertEquals(1928, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case38() {
        int[] students = { 663 };
        int Y = 481;
        int J = 10;
        assertEquals(19, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case39() {
        int[] students = { 990, 241, 374, 163, 683, 978, 52, 812, 369, 647, 134, 112, 855, 62, 416, 798, 137, 48, 450, 535, 555, 76, 680, 547, 636, 706, 629, 527, 696, 721, 505, 864, 729, 778, 984 };
        int Y = 549;
        int J = 6;
        assertEquals(3003, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case40() {
        int[] students = { 848, 945, 850, 128, 635, 523, 416, 206, 435, 637, 445, 601, 502, 719, 487, 534, 405, 832, 297, 668, 26, 541, 576, 807, 826, 566, 495, 617, 461, 296 };
        int Y = 628;
        int J = 7;
        assertEquals(2255, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case41() {
        int[] students = { 710 };
        int Y = 550;
        int J = 2;
        assertEquals(80, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case42() {
        int[] students = { 512, 609, 410, 875, 312, 442, 797, 551, 485, 843, 34, 662, 972, 495, 837, 256, 613, 714, 2, 893, 815, 514, 572, 28, 236, 479, 116, 333, 943, 512, 682, 701, 959, 598, 176, 246, 429, 883, 535, 601 };
        int Y = 65;
        int J = 7;
        assertEquals(3104, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case43() {
        int[] students = { 356, 235, 986, 617, 613, 742, 556, 135, 210, 621, 416, 783, 326, 124, 490, 86, 887, 918, 948, 733, 344, 311, 416, 710, 231, 740, 405, 381, 64, 393, 830, 443, 72, 5, 987, 23, 498, 688, 814, 871, 104, 346 };
        int Y = 674;
        int J = 6;
        assertEquals(3315, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case44() {
        int[] students = { 648, 127, 90, 369, 762, 367, 490, 614, 33, 327, 251, 554, 616, 176, 437, 413, 566, 320, 43, 513, 320, 376, 612, 641, 545, 954, 172, 731, 304, 789, 874, 227, 134, 539, 113, 660, 120, 387, 706, 690, 305, 434, 668, 113, 780, 777, 456, 92 };
        int Y = 762;
        int J = 5;
        assertEquals(4113, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case45() {
        int[] students = { 181, 663, 151, 659, 572, 563, 929 };
        int Y = 658;
        int J = 1;
        assertEquals(3060, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case46() {
        int[] students = { 459, 603, 256, 435, 776, 869, 624, 75, 811, 540, 630, 965, 537, 286, 353, 279, 351, 212, 673, 679, 951, 370, 324, 2, 130, 595, 339, 217, 167, 357, 695 };
        int Y = 28;
        int J = 4;
        assertEquals(3644, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case47() {
        int[] students = { 185, 59 };
        int Y = 329;
        int J = 8;
        assertEquals(8, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case48() {
        int[] students = { 305, 459, 112, 213, 704, 250, 983, 892, 717, 993 };
        int Y = 338;
        int J = 9;
        assertEquals(592, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case49() {
        int[] students = { 531, 850, 121, 81, 908, 681, 478, 531, 807, 326, 987, 705, 930, 53, 742, 562, 946, 473, 641, 501, 250, 309, 37, 521, 357 };
        int Y = 129;
        int J = 3;
        assertEquals(4407, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case50() {
        int[] students = { 385, 101, 152, 243, 778, 371, 120, 959, 54, 943, 231, 648, 179, 707, 671, 926, 825, 148, 19, 170, 653, 863, 213, 37, 527, 842, 861, 410, 421, 123, 704, 704, 703, 702, 747, 209, 342 };
        int Y = 523;
        int J = 4;
        assertEquals(4306, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case51() {
        int[] students = { 581, 351, 19, 650, 547, 642, 804, 859, 335, 538, 509, 673, 75, 364, 874, 878, 635, 545, 195, 309, 648, 344, 213, 777, 739, 464, 696, 737, 957, 739, 148, 909, 629, 249, 161, 632, 87, 595, 522, 197 };
        int Y = 167;
        int J = 10;
        assertEquals(2082, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case52() {
        int[] students = { 550, 974, 703, 406, 749, 758, 944, 156, 300, 997, 115, 492, 41, 309, 539, 317, 532, 109, 100 };
        int Y = 952;
        int J = 8;
        assertEquals(1025, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case53() {
        int[] students = { 39, 842, 21, 127, 563, 798, 807, 220, 234, 5, 362, 46, 225, 714, 548, 988, 46, 554, 48, 536, 110, 165 };
        int Y = 574;
        int J = 1;
        assertEquals(7424, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case54() {
        int[] students = { 247, 164, 970, 85, 603, 897, 538, 105, 332, 149, 631, 537, 437, 327, 515, 585, 765, 378, 974, 432, 389, 15, 660, 411, 239, 507, 57, 317 };
        int Y = 43;
        int J = 9;
        assertEquals(1370, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case55() {
        int[] students = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
        int Y = 2;
        int J = 1;
        assertEquals(49998, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case56() {
        int[] students = { 459, 494 };
        int Y = 1000;
        int J = 999;
        assertEquals(1, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case57() {
        int[] students = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
        int Y = 1000;
        int J = 999;
        assertEquals(98, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case58() {
        int[] students = { 352, 825, 556, 40, 974, 980, 215, 2, 461, 73, 935, 216, 333, 25, 45, 558, 53, 463, 718, 743, 523, 641, 932, 445, 697, 856, 938, 886, 455, 172, 848, 326, 883, 336, 161, 719, 655, 573 };
        int Y = 1000;
        int J = 1;
        assertEquals(18633, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case59() {
        int[] students = { 0, 0, 0, 0, 0 };
        int Y = 145;
        int J = 21;
        assertEquals(0, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case60() {
        int[] students = { 11, 13, 15 };
        int Y = 9;
        int J = 5;
        assertEquals(7, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case61() {
        int[] students = { 10, 15 };
        int Y = 12;
        int J = 5;
        assertEquals(3, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case62() {
        int[] students = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
        int Y = 2;
        int J = 1;
        assertEquals(49998, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case63() {
        int[] students = { 12, 15, 10, 9 };
        int Y = 10;
        int J = 2;
        assertEquals(19, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case64() {
        int[] students = { 4, 3 };
        int Y = 5;
        int J = 1;
        assertEquals(3, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case65() {
        int[] students = { 4, 7, 10, 5, 6, 55, 2, 22, 35, 42 };
        int Y = 29;
        int J = 5;
        assertEquals(35, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case66() {
        int[] students = { 10, 11, 11, 11 };
        int Y = 9;
        int J = 5;
        assertEquals(9, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case67() {
        int[] students = { 15, 13, 11 };
        int Y = 9;
        int J = 5;
        assertEquals(7, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case68() {
        int[] students = { 20, 21, 22, 23, 5 };
        int Y = 7;
        int J = 5;
        assertEquals(18, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case69() {
        int[] students = { 5, 7 };
        int Y = 10;
        int J = 7;
        assertEquals(1, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case70() {
        int[] students = { 4, 7, 10, 5, 6, 55, 2 };
        int Y = 20;
        int J = 3;
        assertEquals(26, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case71() {
        int[] students = { 10, 9, 10, 10, 10 };
        int Y = 9;
        int J = 5;
        assertEquals(8, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case72() {
        int[] students = { 15, 13, 15 };
        int Y = 9;
        int J = 5;
        assertEquals(7, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case73() {
        int[] students = { 16, 10 };
        int Y = 10;
        int J = 8;
        assertEquals(2, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case74() {
        int[] students = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 10, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
        int Y = 2;
        int J = 1;
        assertEquals(30103, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case75() {
        int[] students = { 3 };
        int Y = 4;
        int J = 2;
        assertEquals(0, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case76() {
        int[] students = { 20, 9 };
        int Y = 9;
        int J = 5;
        assertEquals(4, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case77() {
        int[] students = { 10, 16, 23 };
        int Y = 15;
        int J = 8;
        assertEquals(5, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case78() {
        int[] students = { 2, 4, 6, 1 };
        int Y = 8;
        int J = 1;
        assertEquals(7, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case79() {
        int[] students = { 99, 78, 1, 34, 45, 11, 90, 34, 26, 67, 12 };
        int Y = 45;
        int J = 9;
        assertEquals(54, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case80() {
        int[] students = { 1, 2, 3, 4, 5, 6, 7 };
        int Y = 1000;
        int J = 3;
        assertEquals(9, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case81() {
        int[] students = { 11, 13 };
        int Y = 10;
        int J = 3;
        assertEquals(5, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case82() {
        int[] students = { 2, 12 };
        int Y = 10;
        int J = 4;
        assertEquals(2, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case83() {
        int[] students = { 15, 6 };
        int Y = 6;
        int J = 5;
        assertEquals(3, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case84() {
        int[] students = { 8, 9 };
        int Y = 5;
        int J = 4;
        assertEquals(3, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case85() {
        int[] students = { 1, 1, 1, 1, 3 };
        int Y = 3;
        int J = 1;
        assertEquals(4, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case86() {
        int[] students = { 5, 7 };
        int Y = 10;
        int J = 5;
        assertEquals(1, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case87() {
        int[] students = { 12, 0 };
        int Y = 12;
        int J = 3;
        assertEquals(0, thejeditestdiv2.countSupervisors(students, Y, J));
    }

    @Test
    public void case88() {
        int[] students = { 4, 4, 4, 4 };
        int Y = 4;
        int J = 3;
        assertEquals(6, thejeditestdiv2.countSupervisors(students, Y, J));
    }

}
