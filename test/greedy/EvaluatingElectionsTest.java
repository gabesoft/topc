package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class EvaluatingElectionsTest {
    EvaluatingElections evaluatingelections = new EvaluatingElections();

    @Test
    public void case1() {
        int[] districts = { 47 };
        assertEquals(24, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case2() {
        int[] districts = { 9, 9 };
        assertEquals(14, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case3() {
        int[] districts = { 1, 1, 1, 1, 1, 1 };
        assertEquals(4, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case4() {
        int[] districts = { 2, 2, 2, 2, 2, 2 };
        assertEquals(7, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case5() {
        int[] districts = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        assertEquals(36, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case6() {
        int[] districts = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        assertEquals(45, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case7() {
        int[] districts = { 1, 1, 100, 100, 100, 100, 200, 200 };
        assertEquals(699, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case8() {
        int[] districts = { 2 };
        assertEquals(2, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case9() {
        int[] districts = { 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999 };
        assertEquals(37451, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case10() {
        int[] districts = { 2, 3, 9 };
        assertEquals(12, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case11() {
        int[] districts = { 1 };
        assertEquals(1, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case12() {
        int[] districts = { 3 };
        assertEquals(2, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case13() {
        int[] districts = { 4 };
        assertEquals(3, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case14() {
        int[] districts = { 5 };
        assertEquals(3, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case15() {
        int[] districts = { 6 };
        assertEquals(4, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case16() {
        int[] districts = { 1, 1 };
        assertEquals(2, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case17() {
        int[] districts = { 1, 2 };
        assertEquals(3, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case18() {
        int[] districts = { 2, 2 };
        assertEquals(3, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case19() {
        int[] districts = { 1, 3 };
        assertEquals(4, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case20() {
        int[] districts = { 1, 4 };
        assertEquals(5, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case21() {
        int[] districts = { 2, 3 };
        assertEquals(4, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case22() {
        int[] districts = { 2, 4 };
        assertEquals(5, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case23() {
        int[] districts = { 3, 3 };
        assertEquals(5, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case24() {
        int[] districts = { 100, 100 };
        assertEquals(150, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case25() {
        int[] districts = { 1, 1, 1 };
        assertEquals(2, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case26() {
        int[] districts = { 1, 2, 1 };
        assertEquals(3, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case27() {
        int[] districts = { 2, 2, 1 };
        assertEquals(4, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case28() {
        int[] districts = { 2, 2, 2 };
        assertEquals(4, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case29() {
        int[] districts = { 10, 100, 900 };
        assertEquals(955, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case30() {
        int[] districts = { 9, 99, 999 };
        assertEquals(1053, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case31() {
        int[] districts = { 2, 8, 4 };
        assertEquals(11, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case32() {
        int[] districts = { 2, 2, 2, 2 };
        assertEquals(5, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case33() {
        int[] districts = { 2, 2, 2, 2, 4 };
        assertEquals(8, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case34() {
        int[] districts = { 784, 451, 424, 422, 224, 478, 509, 380, 174, 797, 340, 513, 842, 233, 527, 342, 654, 816, 637 };
        assertEquals(7806, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case35() {
        int[] districts = { 342, 574, 20, 606, 413, 479, 51, 630, 802, 257, 16, 925, 938, 951, 764, 393, 766, 414, 764, 208, 959, 222, 85, 526, 104, 848, 53, 638, 969, 214, 806, 318, 461, 950, 768, 200, 972, 746, 171, 463 };
        assertEquals(18330, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case36() {
        int[] districts = { 877, 587, 587, 325, 528, 5, 500, 714, 548, 688, 243, 5, 508, 783, 561, 659, 297, 44, 70, 131, 329, 621, 374, 268, 3, 113, 782, 295, 902 };
        assertEquals(10838, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case37() {
        int[] districts = { 159, 797, 323, 629, 647, 941, 75, 226 };
        assertEquals(3404, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case38() {
        int[] districts = { 528, 259, 717, 920, 633, 957, 712, 966, 216, 812, 362, 146, 472, 462, 140, 743, 672, 512, 232, 16, 186, 721, 171, 831, 641, 446, 183, 483, 198, 55, 610, 489, 884, 396, 344, 499, 368, 618, 812, 211, 771, 449, 289 };
        assertEquals(18074, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case39() {
        int[] districts = { 608, 405, 630, 751, 288, 836 };
        assertEquals(2866, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case40() {
        int[] districts = { 207, 833, 960, 574, 795, 758, 220, 226, 377, 782, 611, 104, 239, 113, 992, 880, 125, 525, 252, 910, 990, 977, 465, 734, 680, 509, 435, 545, 197, 182, 271, 195, 684 };
        assertEquals(15017, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case41() {
        int[] districts = { 306, 800, 550, 229, 87, 361, 705, 12, 950, 646, 476, 108, 634, 631, 758, 40, 866, 162, 928, 634, 9, 733, 206, 47, 851, 5, 281, 678 };
        assertEquals(11519, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case42() {
        int[] districts = { 5, 850, 234, 102, 818, 710 };
        assertEquals(2547, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case43() {
        int[] districts = { 970, 883, 981, 861, 690, 899, 921, 261, 940, 713, 49, 823, 625, 296, 539, 509, 515, 77, 777, 392, 643, 50, 87, 597, 655, 164, 658, 589, 119, 161, 12, 785, 985 };
        assertEquals(15696, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case44() {
        int[] districts = { 340, 239, 495, 366, 223, 175, 742, 595, 501, 322, 702, 202, 401, 324, 490, 285, 495, 743, 733 };
        assertEquals(6929, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case45() {
        int[] districts = { 988, 167, 357, 9, 804, 778, 710, 333, 285, 904, 157, 764, 423, 291, 946, 309, 753, 275, 149, 826, 693, 160, 322, 31, 712, 257, 850, 531, 907, 887, 432, 398, 179, 925, 979, 787, 28, 667, 801, 411, 751, 530, 171, 160, 824, 791, 195, 77 };
        assertEquals(21882, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case46() {
        int[] districts = { 402, 916, 291, 858, 177, 744, 276, 83, 666, 994, 734, 252, 382, 332, 361, 941, 219, 618, 650, 4, 124, 715, 171, 763, 271, 894, 803, 221, 92, 159, 623, 592, 696, 807, 813, 711, 957, 371, 494, 500, 907, 907, 564 };
        assertEquals(19871, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case47() {
        int[] districts = { 623, 832, 648, 587 };
        assertEquals(2085, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case48() {
        int[] districts = { 706, 308, 863, 44, 534, 429, 236, 517, 296, 109, 340, 222, 819, 461, 90, 581, 756, 7, 743, 97, 161, 833, 512, 868, 79, 553, 737, 474 };
        assertEquals(10926, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case49() {
        int[] districts = { 462, 751, 405, 13, 986, 564, 289, 81, 821, 586, 608, 492, 891, 660, 16, 760, 735 };
        assertEquals(7661, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case50() {
        int[] districts = { 685, 636, 124, 393, 187, 768, 819, 678, 885, 263, 907, 765, 220, 73, 785, 926, 609, 39, 539, 855, 499, 427, 844, 132, 93, 204, 938, 208, 492, 542, 761, 849, 392, 79, 556, 737, 433, 489, 935, 865, 116, 806, 704, 513, 267, 405, 624 };
        assertEquals(21487, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case51() {
        int[] districts = { 514, 741, 978, 507, 516, 463, 668, 292, 4, 683, 561, 252, 192, 468, 289, 150, 562, 638, 204, 267, 619 };
        assertEquals(8017, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case52() {
        int[] districts = { 554, 37, 563, 840, 605, 753, 466, 49, 919, 769, 748, 968, 920, 598, 609, 205, 416, 418, 538, 796, 298, 350, 114, 65, 555 };
        assertEquals(11112, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case53() {
        int[] districts = { 112, 137, 756, 175, 659, 933, 42, 651, 400, 379, 607, 511, 269, 969, 920, 526, 58, 134, 188, 651, 119, 752, 562, 116, 865, 117, 623, 738, 667, 362, 709, 637, 843, 227, 70, 931, 33, 309, 430 };
        assertEquals(16080, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case54() {
        int[] districts = { 272, 240, 866, 829, 76, 517, 397, 28, 994, 152, 300, 960, 227, 413, 326, 405, 61, 112, 891, 387, 818, 926, 105, 491, 729, 566, 825, 633, 655, 381, 376, 212, 237, 915, 543, 86, 31, 545 };
        assertEquals(15510, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case55() {
        int[] districts = { 621, 481, 892, 56, 517, 55, 270, 554, 644, 428, 958, 165, 384, 692, 262, 800, 905, 997, 729, 240, 914, 644, 673, 329, 185, 351, 388, 379, 580, 943, 364, 389, 301, 32, 650, 569 };
        assertEquals(15799, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case56() {
        int[] districts = { 115, 82, 103, 354, 432, 318, 201, 783, 301, 29, 297, 862, 77, 466, 949, 545, 134, 548, 804, 55, 966, 779, 798, 187, 485, 837, 530, 258, 449 };
        assertEquals(11264, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case57() {
        int[] districts = { 649, 841, 274, 732, 747, 772, 131, 514, 126, 603, 34, 777, 615, 113, 677, 491, 912, 976, 885, 671 };
        assertEquals(9759, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case58() {
        int[] districts = { 488, 192, 100, 465, 675, 216, 877, 144, 816, 726, 466, 114, 197, 880, 757, 587, 606, 525, 908, 430, 700, 833 };
        assertEquals(10025, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case59() {
        int[] districts = { 436, 408, 976, 135, 50, 409, 925, 43, 807, 345, 839, 807, 858, 352, 427, 754, 345, 717, 627, 92, 450, 188, 781 };
        assertEquals(10149, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case60() {
        int[] districts = { 643, 628, 250, 509, 52, 71, 331, 627, 189 };
        assertEquals(2852, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case61() {
        int[] districts = { 884, 856, 651, 846, 406, 868, 514, 843, 722, 263, 345, 993, 415, 18, 681, 353, 489, 592, 315, 508, 384, 265, 486, 816, 824, 681, 175, 45, 614, 992, 624, 155, 587, 690, 622, 890, 603, 282 };
        assertEquals(17986, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case62() {
        int[] districts = { 8, 463, 544, 89, 116 };
        assertEquals(1113, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case63() {
        int[] districts = { 106, 162, 643, 677, 634, 244, 378, 726, 542, 396, 911, 340, 161, 306, 933, 894 };
        assertEquals(7000, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case64() {
        int[] districts = { 217, 94, 826, 452 };
        assertEquals(1433, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case65() {
        int[] districts = { 956, 370, 475, 824, 964 };
        assertEquals(2754, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case66() {
        int[] districts = { 215, 999, 802, 614, 496, 310, 412, 702, 581, 889, 9, 879, 303, 722, 870, 281, 201, 6, 152, 51, 412, 277, 226, 463, 763, 881, 537, 217, 799, 844, 161, 846, 376, 543, 455, 639, 962 };
        assertEquals(16372, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case67() {
        int[] districts = { 933, 497, 260, 225, 363, 437, 380, 60, 771, 867, 911, 537, 499, 737, 896, 717, 179, 738, 743, 98, 575, 116, 194, 618, 749, 107, 131, 385, 931, 382, 470, 450, 646, 910, 727, 377 };
        assertEquals(16048, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case68() {
        int[] districts = { 35, 939, 53, 724, 844, 494, 499, 281, 756, 433, 831, 654, 244, 94, 935, 454, 79, 661, 27, 269, 395, 919, 737, 203, 671, 953, 166, 173, 607, 225, 239, 917, 991, 754, 760 };
        assertEquals(15825, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case69() {
        int[] districts = { 667, 529, 899, 457, 485, 693, 360, 78, 943, 354, 684, 318, 204, 294, 675, 902 };
        assertEquals(7261, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case70() {
        int[] districts = { 560, 483, 707, 4, 449, 919, 319, 20, 857, 954, 394, 791, 300, 495, 864, 842, 657, 339, 643, 429, 253, 969, 172 };
        assertEquals(10585, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case71() {
        int[] districts = { 736, 153, 526, 149, 949, 666, 953, 897, 577, 925, 140, 177, 913, 403, 675, 501, 282, 292, 680, 550, 345 };
        assertEquals(9724, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case72() {
        int[] districts = { 224, 317, 716, 50, 513, 840, 361, 214, 989, 134, 780, 445, 384, 858, 300, 84, 184, 240, 762, 392, 842, 824, 608, 831, 759, 41, 546, 815, 309, 586, 226, 876 };
        assertEquals(14085, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case73() {
        int[] districts = { 108, 839, 600, 999, 874, 464, 969, 21, 469, 986, 135, 176, 564, 103, 394, 487, 481, 370, 78, 516, 52 };
        assertEquals(8493, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case74() {
        int[] districts = { 810, 38, 572, 137, 572, 680, 434, 159, 496, 469, 396, 150, 395, 19, 727, 895, 869, 148, 345, 529, 379, 301, 393, 269, 434, 243, 815, 483, 20, 173, 320, 305, 937, 500 };
        assertEquals(12505, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case75() {
        int[] districts = { 379, 324, 329, 867, 580, 60, 556, 553, 531, 685, 574, 917, 645, 217, 800, 781, 510, 232, 13, 81, 277, 577, 55, 182, 422, 697, 147, 620, 211, 487, 285, 152 };
        assertEquals(12053, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case76() {
        int[] districts = { 847, 145, 278, 672, 275, 864, 336, 976, 945, 370, 92, 133, 812, 812, 332, 364, 942, 708, 794, 815, 670, 89, 461, 922, 177, 877, 70, 858, 560, 493, 549, 584, 174, 827, 686, 293, 468, 413, 347, 379, 142, 224, 451, 48, 48, 973, 188, 605, 524 };
        assertEquals(21446, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case77() {
        int[] districts = { 979, 908, 966, 415, 608, 778, 395 };
        assertEquals(3950, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case78() {
        int[] districts = { 264, 838, 54, 966, 406, 355, 45, 644, 429, 442, 236, 895, 140, 720, 902, 52, 961, 716, 589, 710, 654, 210, 48, 681, 63, 768, 911, 826, 592, 453, 251, 638, 109 };
        assertEquals(14484, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case79() {
        int[] districts = { 450, 419, 694, 440, 780, 697, 817, 935, 443, 230 };
        assertEquals(4911, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case80() {
        int[] districts = { 124, 603, 746, 168, 444, 682, 444, 34, 534, 399, 660, 792, 742, 220, 282, 323, 72, 292, 73, 948, 615, 318, 93, 666, 671, 356, 523, 574, 664 };
        assertEquals(11230, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case81() {
        int[] districts = { 937, 213, 975, 508, 236, 551, 844, 429, 789 };
        assertEquals(4512, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case82() {
        int[] districts = { 687, 376, 109, 334, 329, 178, 121, 580, 351, 27, 125, 396, 270, 344, 435, 20, 373, 292, 194, 66, 666 };
        assertEquals(5401, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case83() {
        int[] districts = { 510, 68, 32, 911, 353, 412, 389, 742, 306, 457, 785, 307, 666, 942, 590, 184, 975, 605, 848, 108, 942, 776, 107, 281, 774, 239, 928, 981, 999, 653, 49, 886, 173, 407, 801, 149, 194, 895, 948, 366, 235, 898, 517, 490, 710, 131, 768 };
        assertEquals(22240, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case84() {
        int[] districts = { 166, 368, 341, 479, 145, 104, 845, 278, 331, 250, 621, 727, 529, 893, 824, 351, 629, 911, 632, 573, 435, 337, 771, 439, 155, 698, 6, 47, 723, 635, 462, 661, 862, 916, 47, 114, 493, 453, 448, 823 };
        assertEquals(16870, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case85() {
        int[] districts = { 585, 567, 838, 561, 875, 954 };
        assertEquals(3523, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case86() {
        int[] districts = { 932, 231, 984, 621, 179, 368, 576, 349, 756, 712, 289, 631, 379, 583, 769, 818, 766, 467, 928, 281, 323, 852, 178, 105, 974, 404, 724, 28, 407, 86, 110, 770, 130, 640, 248, 167, 370, 202, 600, 44, 847, 268, 79, 615, 727, 69, 538 };
        assertEquals(19461, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case87() {
        int[] districts = { 359, 566, 10, 521, 107, 334, 75, 352, 319, 983, 606, 9, 660, 965, 163, 512, 789, 988, 451, 321, 397, 81, 154, 699, 492, 677, 156, 187, 372, 47, 229, 170 };
        assertEquals(11384, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case88() {
        int[] districts = { 706, 379, 403, 929, 728, 339, 323, 885, 122, 849, 115, 688, 866, 453, 255 };
        assertEquals(6843, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case89() {
        int[] districts = { 11, 797, 599, 975, 377, 166, 774, 982, 299, 408, 718, 127, 162, 509, 350, 11, 772, 565, 453, 986, 313 };
        assertEquals(9010, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case90() {
        int[] districts = { 802, 511, 433, 710, 261, 971, 941, 241, 70, 66, 378, 516, 527, 93, 228, 943, 610, 385, 990, 241, 565, 146, 467, 457, 432, 9, 611, 91, 553, 257, 735 };
        assertEquals(12337, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case91() {
        int[] districts = { 495, 576, 330, 375, 736, 935, 86, 730, 817, 163, 403, 761, 359 };
        assertEquals(5658, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case92() {
        int[] districts = { 136, 517, 266, 768, 442, 768, 92, 719, 60, 162, 298, 53, 568, 984, 358, 652, 453, 778, 9, 978, 944, 32, 172, 154, 925, 678, 224, 179, 665, 550, 437, 775, 481, 314, 529, 907, 471, 390, 783, 703, 449, 692, 688, 182 };
        assertEquals(18701, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case93() {
        int[] districts = { 414, 845, 784, 78, 616, 901, 324, 382, 106, 422, 996, 911, 992, 2, 330, 195, 188, 186, 736, 932, 467, 339, 387, 280, 629, 211, 590 };
        assertEquals(11522, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case94() {
        int[] districts = { 921, 623, 76, 239, 341, 63, 171, 981, 160, 145, 777, 750, 464, 803, 364, 656, 307, 525, 656, 811, 286, 461, 955, 687, 69, 973, 914, 215, 326, 635, 867, 876, 911, 635, 398, 982, 755, 400 };
        assertEquals(18349, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case95() {
        int[] districts = { 177, 753, 388, 78, 80, 661, 425, 105, 329, 79, 664, 480, 33, 693, 459, 215, 350, 961, 13, 414, 252, 670, 183 };
        assertEquals(7509, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case96() {
        int[] districts = { 220, 458, 506, 766, 133, 846, 728, 697, 693, 66, 657, 274, 675, 747, 140, 789, 681, 749, 102, 25, 614, 124, 800, 532, 810, 346, 606, 171, 855, 818, 960, 828, 192, 316, 293, 578, 892, 610, 13, 712, 108, 576, 272, 612, 194 };
        assertEquals(19643, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case97() {
        int[] districts = { 345, 250, 465, 248, 144, 451, 598, 611, 577, 803, 899, 443, 824, 431, 311, 96, 310, 371, 33, 467, 301, 138, 276, 560, 269, 301, 618, 982, 499 };
        assertEquals(10700, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case98() {
        int[] districts = { 802, 934, 382, 533, 818, 967, 984, 405, 31, 762, 848, 410, 162, 932, 225, 543, 415, 223, 802, 78, 445, 577, 380, 937 };
        assertEquals(11743, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case99() {
        int[] districts = { 220, 677, 157, 204, 214, 347, 876, 761, 92, 302, 855, 908, 125, 580, 861, 782, 92, 397, 387, 61, 856, 962, 929, 845 };
        assertEquals(11183, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case100() {
        int[] districts = { 343, 243, 813, 296, 300, 614, 20, 117, 87, 689, 80, 753, 283, 878, 40, 322, 805, 168, 466, 60, 941, 338, 654, 641, 789, 853, 738, 754, 573, 336, 996, 119, 413 };
        assertEquals(13728, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case101() {
        int[] districts = { 440, 18, 466, 28, 262, 798, 424, 869, 566, 632, 684, 817, 290, 857, 412, 826, 329 };
        assertEquals(7377, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case102() {
        int[] districts = { 968, 278, 113, 538, 798, 945, 575, 199, 381, 952, 775, 946, 604, 892, 746, 377, 13, 934, 682, 924, 580, 101, 213, 634, 387, 259, 704, 636, 501, 381 };
        assertEquals(14580, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case103() {
        int[] districts = { 925, 19, 378, 137, 480, 853, 911, 569, 860, 205, 329, 972, 539, 861, 546, 932, 567, 366, 287, 976, 239, 498, 91, 734, 305, 156, 703, 610, 758, 314, 187, 256, 921, 774, 170, 368, 641, 76, 850, 869, 627, 998 };
        assertEquals(19869, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case104() {
        int[] districts = { 8, 10, 12 };
        assertEquals(21, evaluatingelections.evaluate(districts));
    }

    @Test
    public void case105() {
        int[] districts = { 10, 10, 5, 4, 1 };
        assertEquals(25, evaluatingelections.evaluate(districts));
    }

}
