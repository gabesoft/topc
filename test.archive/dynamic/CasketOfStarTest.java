package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class CasketOfStarTest {
    CasketOfStar casketofstar = new CasketOfStar();

    @Test
    public void case1() {
        int[] weight = { 1, 2, 3, 4 };
        assertEquals(12, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case2() {
        int[] weight = { 100, 2, 1, 3, 100 };
        assertEquals(10400, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case3() {
        int[] weight = { 2, 2, 7, 6, 90, 5, 9 };
        assertEquals(1818, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case4() {
        int[] weight = { 477, 744, 474, 777, 447, 747, 777, 474 };
        assertEquals(2937051, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case5() {
        int[] weight = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(13, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case6() {
        int[] weight = { 54, 64, 24, 24, 72, 33, 30, 40, 22, 17, 40, 21, 41, 64, 8, 46, 18, 65, 48, 32, 52, 54, 75, 5, 18, 37, 41, 22, 68, 42, 55 };
        assertEquals(96202, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case7() {
        int[] weight = { 428, 507, 566, 692, 555, 344, 618, 218, 674, 697, 332, 433, 240, 453, 694, 264, 695, 263, 264, 351, 700, 691, 354, 560, 258, 181, 599, 477, 368, 509, 518, 401, 485, 323, 671, 201, 428 };
        assertEquals(12714780, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case8() {
        int[] weight = { 134, 333, 377, 148, 233, 155 };
        assertEquals(237815, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case9() {
        int[] weight = { 575, 549, 601, 593, 590, 585, 612, 605, 556, 619, 575, 649, 547, 642 };
        assertEquals(4627648, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case10() {
        int[] weight = { 671, 547, 393, 594, 655, 704, 376, 320, 711, 671, 500, 265, 638, 457, 468, 549, 485, 695, 252, 655, 262, 670, 450, 310, 716, 497, 619, 496, 301, 642, 332, 350, 675, 363, 253 };
        assertEquals(13367148, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case11() {
        int[] weight = { 365, 325, 353, 337, 309, 358, 317, 349, 322, 325, 334, 296, 352, 349, 318, 354, 325, 371, 338, 325, 306 };
        assertEquals(2379637, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case12() {
        int[] weight = { 611, 213, 619, 592, 216, 558, 255, 461, 207, 663, 577, 679, 198, 632, 521, 416, 420, 651, 654, 620, 472, 507 };
        assertEquals(7490179, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case13() {
        int[] weight = { 272, 223, 226, 269, 290, 303, 277, 274 };
        assertEquals(457520, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case14() {
        int[] weight = { 95, 221, 734, 362, 713, 352, 341, 520, 280, 260, 314, 479, 355 };
        assertEquals(2870087, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case15() {
        int[] weight = { 379, 483, 521, 400, 506, 587, 486, 248, 390, 311, 440, 465, 405, 441, 375, 533, 452, 277, 475, 460, 572, 557, 489, 259, 486, 445, 497, 447, 283, 289, 503, 400, 559, 372 };
        assertEquals(8269952, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case16() {
        int[] weight = { 98, 98, 87, 88, 93, 85, 83, 83, 90, 88, 88, 82, 91, 91, 96, 89, 93, 87, 87, 84, 87, 85, 85, 92, 92, 90, 82, 94, 85, 88, 92, 84, 94, 87, 89, 85, 96, 85, 98, 87, 95 };
        assertEquals(343128, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case17() {
        int[] weight = { 569, 750, 216, 689, 410, 672, 401, 198, 270, 727, 171, 187, 482, 139, 94, 211, 404, 693, 105, 105, 309, 237, 668, 549, 540, 573, 466, 121, 160, 408, 399, 270, 595, 370, 217, 132, 204, 115 };
        assertEquals(10674721, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case18() {
        int[] weight = { 258, 347, 225, 302 };
        assertEquals(182710, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case19() {
        int[] weight = { 804, 789, 804, 773, 806, 804, 763, 754, 778, 766, 799, 753, 779, 768, 776, 745, 772, 748, 767, 787, 800, 782, 752, 758, 786, 800, 768, 757, 775, 748, 800, 780, 793, 752, 803, 791, 774, 774, 780, 788, 800, 772, 748 };
        assertEquals(25775864, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case20() {
        int[] weight = { 944, 954, 955, 951, 937, 972, 961, 950, 943, 952, 937, 980, 972, 943 };
        assertEquals(11149064, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case21() {
        int[] weight = { 760, 691, 673, 844, 829, 499, 518, 674 };
        assertEquals(3355092, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case22() {
        int[] weight = { 164, 289, 209, 354, 226, 308, 357, 477, 191, 277, 551, 308, 188, 492, 420, 632, 712, 238, 303, 263, 177, 723, 671, 234, 496, 162, 501, 550, 265, 284, 449, 295, 257, 607 };
        assertEquals(8686576, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case23() {
        int[] weight = { 849, 770, 923, 363, 904, 492, 796, 606, 594, 682, 591, 746, 325, 270, 613, 300, 577, 514, 423, 308, 612, 855, 627, 417, 587 };
        assertEquals(12782043, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case24() {
        int[] weight = { 796, 940, 932, 758, 829, 842, 820, 817, 884, 838, 819, 935, 910, 766, 750, 804, 923, 888, 775, 804, 933, 869, 838, 851, 787, 928, 771 };
        assertEquals(20010894, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case25() {
        int[] weight = { 419, 664, 509, 696, 534, 230, 799, 236, 405, 251, 329, 775, 464, 447, 829, 281, 551, 391, 250, 427, 488, 248, 221, 607, 614, 827, 630, 821, 771, 380, 572, 307, 824, 446, 412, 583, 697, 259, 314, 701, 347, 415, 675, 606, 593 };
        assertEquals(20153330, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case26() {
        int[] weight = { 442, 443, 783, 936, 675, 520, 937, 611, 413, 771, 634, 867, 691, 804, 655, 373, 464, 719, 713 };
        assertEquals(10401350, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case27() {
        int[] weight = { 902, 961, 927, 825, 954 };
        assertEquals(2661660, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case28() {
        int[] weight = { 687, 480, 542, 589, 683, 668, 630, 508, 553, 586, 462, 676, 516, 672, 500, 431, 432, 686, 551, 490, 690, 655, 677, 648, 529, 638, 632, 682, 569, 655, 596, 511, 535, 657, 692, 697, 655, 518 };
        assertEquals(15471373, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case29() {
        int[] weight = { 114, 219, 705, 370, 715, 431, 359, 438, 702, 718, 319, 161, 569, 715, 109, 629, 492, 196, 415, 79, 401 };
        assertEquals(6527401, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case30() {
        int[] weight = { 726, 380, 450, 437, 491, 687, 458, 417, 689, 508, 500, 669, 447, 366, 675, 580, 768, 386, 710, 43, 523, 428, 841, 698, 448, 112, 182, 594, 214, 161, 406, 363, 577, 641, 169, 409, 162, 754, 223, 710, 496, 597, 247, 593 };
        assertEquals(18204371, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case31() {
        int[] weight = { 381, 403, 421, 478, 403, 325, 300, 306, 357, 363, 425, 366, 342, 359, 391, 485, 384, 448, 380, 450, 304, 409, 306, 476, 433, 356, 420, 395, 398, 339, 460, 378, 466, 335, 379, 382, 338, 301, 456, 358, 302, 478, 428, 340, 467 };
        assertEquals(8415943, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case32() {
        int[] weight = { 318, 309, 337, 296, 294, 317, 304, 294, 298, 296, 298, 328, 337, 316, 338, 304, 339, 334, 299, 337, 299, 312, 334, 330, 322, 333, 331, 288, 336, 295, 331, 285, 301, 289, 332 };
        assertEquals(3588902, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case33() {
        int[] weight = { 546, 577, 686, 298, 340, 683, 597, 323, 474, 608, 511, 392, 563, 433, 479, 479, 568, 408, 531, 344, 451, 379, 301, 554, 530, 363, 311, 430, 669, 417, 323, 526, 593, 672 };
        assertEquals(10906402, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case34() {
        int[] weight = { 511, 495, 522, 582, 270, 644, 371, 505, 306, 291, 380, 305, 410, 536 };
        assertEquals(3392788, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case35() {
        int[] weight = { 668, 765, 785, 747, 755, 660, 716, 776, 761, 723, 667, 742, 618, 689, 716, 754, 726, 705, 750, 730, 650, 694, 676 };
        assertEquals(11668747, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case36() {
        int[] weight = { 678, 699, 673, 693, 703, 699, 705, 703, 670, 664, 668, 694, 700, 687, 701, 697, 668, 690, 682, 696, 681, 700, 699, 678, 663, 689, 678, 700 };
        assertEquals(12640500, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case37() {
        int[] weight = { 668, 420, 718, 696, 202, 119, 192, 227, 119, 331, 466, 442, 238, 795, 292, 575, 218 };
        assertEquals(4855507, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case38() {
        int[] weight = { 304, 307, 313, 307, 314, 300, 305, 313, 299, 297, 298, 309, 300, 314, 311, 300, 310, 302, 300, 295, 296, 312, 304, 309, 314, 301, 301, 310, 304, 308, 312, 313, 303, 305, 310, 298, 308, 314, 311, 305, 298, 299, 303, 307, 296 };
        assertEquals(4138369, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case39() {
        int[] weight = { 690, 642, 626 };
        assertEquals(431940, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case40() {
        int[] weight = { 268, 103, 87 };
        assertEquals(23316, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case41() {
        int[] weight = { 21, 273, 281, 263, 78, 417, 459, 386, 537, 533, 130, 430, 46, 210, 379, 87, 169, 255, 381, 341, 12, 540, 26, 165, 340, 21, 341, 410, 49, 29, 571, 165, 274, 509, 567, 147, 393, 396, 513, 350, 338, 155, 135, 159, 226, 473, 159, 346, 117, 205 };
        assertEquals(8671102, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case42() {
        int[] weight = { 331, 339, 232, 236, 317, 275, 328, 311, 327, 329, 310, 250, 315, 223, 229, 299, 239, 284, 218, 303, 245, 271, 212, 286, 226, 269, 255, 310, 314, 250, 241, 272, 219, 284, 276, 249, 321, 334, 248, 320, 295, 293, 278, 263, 326, 248, 233, 310, 292, 319 };
        assertEquals(4639980, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case43() {
        int[] weight = { 947, 948, 918, 887, 929, 840, 826, 817, 803, 860, 928, 893, 821, 824, 909, 804, 876, 787, 810, 865, 914, 860, 823, 911, 863, 837, 819, 846, 780, 840, 940, 828 };
        assertEquals(24439378, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case44() {
        int[] weight = { 68, 927, 215, 308, 539, 276, 162, 355, 548, 176, 239, 546, 517, 721, 449, 765, 70, 342, 844, 184, 532, 66, 484, 325, 152, 428, 457, 685, 141, 274, 579, 380, 292, 304, 465, 173, 131, 761, 181, 440, 148, 220, 171, 322, 165, 219, 490, 435, 466, 874 };
        assertEquals(18407053, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case45() {
        int[] weight = { 213, 217, 194, 196, 222, 199, 212, 192, 226, 202, 196, 223, 207, 227, 190, 194, 219, 219, 217, 188, 196, 209, 223, 201, 219, 223, 193, 220, 201, 223, 215, 211, 225, 208, 195, 190, 217 };
        assertEquals(1690917, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case46() {
        int[] weight = { 782, 811, 762, 779, 874, 692, 880, 808, 674, 849, 691, 733, 860, 776, 837, 766, 675, 745, 848, 744, 778, 795, 852, 844, 792, 728, 876, 848, 861, 674, 834, 841, 885, 734, 864, 717, 707, 672, 737, 785, 711, 863, 686 };
        assertEquals(29006896, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case47() {
        int[] weight = { 621, 445, 362, 659, 688, 395, 806, 463, 566, 638, 631, 774, 439, 766, 476, 652, 740, 322, 534, 796, 388, 511, 343 };
        assertEquals(10375558, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case48() {
        int[] weight = { 457, 470, 453, 455, 452, 464, 450, 449, 449, 458, 448, 467, 466, 451, 469, 450, 451, 466, 459, 451, 466, 461, 452, 460, 457, 465, 453, 470, 464, 453, 468, 448, 462, 451, 455, 465, 448, 463, 448, 449, 468, 458, 463, 463, 459, 451, 451, 448, 448, 462 };
        assertEquals(10358879, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case49() {
        int[] weight = { 837, 825, 519, 867, 811, 789, 674, 904, 801, 791, 874, 899, 991, 897, 837, 700, 808, 893, 711, 912, 663, 586, 689, 911, 899, 651, 858, 514, 951, 987, 598, 668, 695, 913, 987 };
        assertEquals(27011685, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case50() {
        int[] weight = { 226, 252, 353, 315, 307, 127, 483, 58, 180 };
        assertEquals(829419, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case51() {
        int[] weight = { 267, 462, 479, 705, 314, 283, 713, 452, 743, 827, 439, 208, 524, 214, 785, 179, 288, 460, 213, 183, 335, 391, 158, 783, 694, 819, 777, 670, 804, 508 };
        assertEquals(12201391, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case52() {
        int[] weight = { 348, 612, 561, 351, 519, 533, 384, 642, 747, 595, 696, 381, 470, 509, 697, 560, 721, 629, 624, 634, 513, 378, 410, 404, 598, 513, 519, 669, 558, 438, 722, 403, 435, 623, 425, 359, 677 };
        assertEquals(14487221, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case53() {
        int[] weight = { 693, 674, 663, 676, 683, 680, 703, 667, 678, 713 };
        assertEquals(3879070, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case54() {
        int[] weight = { 304, 342, 318, 342, 311, 331, 296, 343, 345, 329, 346, 330, 298, 300, 310, 359, 345, 318, 350, 323, 340, 333, 302, 343, 313, 338, 341, 347, 348, 336, 307, 302, 327, 351, 342, 320, 356, 347, 347, 355, 318 };
        assertEquals(4646739, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case55() {
        int[] weight = { 441, 759, 468 };
        assertEquals(206388, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case56() {
        int[] weight = { 6, 8, 9, 9, 5, 6 };
        assertEquals(216, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case57() {
        int[] weight = { 3, 2, 5, 3, 3, 4, 1 };
        assertEquals(65, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case58() {
        int[] weight = { 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4 };
        assertEquals(208, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case59() {
        int[] weight = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
        assertEquals(500, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case60() {
        int[] weight = { 1, 2, 2, 1, 2, 1, 1 };
        assertEquals(13, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case61() {
        int[] weight = { 8, 5, 5, 5, 5, 10, 8, 5, 5, 7, 10, 7, 10, 10 };
        assertEquals(890, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case62() {
        int[] weight = { 5, 7, 6, 7, 5, 5, 7, 4, 3, 5, 3, 5, 6, 3, 3, 5, 4, 3, 3, 5, 5, 5, 6, 3, 3, 4, 5, 7, 7, 3, 7, 5, 4, 7, 3, 3, 3, 7, 6 };
        assertEquals(1344, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case63() {
        int[] weight = { 8, 8, 6, 7, 7, 7, 7, 8, 8, 7, 7, 6, 8, 8, 7, 8, 8, 8, 8, 7 };
        assertEquals(1096, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case64() {
        int[] weight = { 3, 3, 4, 5, 5, 3, 3, 5, 5, 4, 4, 5, 3, 3, 3, 4, 4, 5 };
        assertEquals(330, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case65() {
        int[] weight = { 4, 4, 5, 5, 5, 4, 5, 4, 4, 4, 4, 4, 5, 4, 4, 5, 4, 5, 4, 4, 5, 5, 4, 5, 5, 4, 5, 5, 5, 4, 5, 4, 5, 4, 5, 5, 5, 4, 5, 4, 4, 5, 5, 5, 4, 4, 5 };
        assertEquals(1075, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case66() {
        int[] weight = { 10, 10, 9, 7, 6, 5, 9, 9, 3, 7, 3, 6, 10, 3, 3, 8, 9, 8, 6, 4, 6, 4, 9, 10, 4, 8, 7, 6, 4, 5, 7, 6, 5, 7, 5, 4, 7, 10, 8, 6, 4, 3, 4, 4, 8, 8, 9, 10, 10 };
        assertEquals(3310, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case67() {
        int[] weight = { 2, 4, 1, 4, 2, 4, 4, 1, 1, 3, 3, 2, 1, 3, 3, 2, 1, 2, 1, 1, 3, 3, 1, 2 };
        assertEquals(214, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case68() {
        int[] weight = { 1, 2, 1, 1, 2, 1, 1, 1, 2, 1, 2, 2, 2, 2, 2, 2 };
        assertEquals(48, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case69() {
        int[] weight = { 8, 8, 8, 8, 9, 9, 8, 8, 9, 8, 9, 9, 9, 8, 8, 9, 9, 9, 8, 9, 8, 9, 9, 9, 8, 8, 8, 9, 9, 9, 9, 8, 8, 8, 9, 8, 9, 9, 9 };
        assertEquals(2907, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case70() {
        int[] weight = { 4, 6, 4, 7 };
        assertEquals(70, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case71() {
        int[] weight = { 4, 6, 8, 7, 8, 4, 6, 7, 4, 4, 7, 7, 7, 7, 5, 6, 7, 5, 8, 7, 7, 4, 8, 6, 4, 4, 4, 5 };
        assertEquals(1276, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case72() {
        int[] weight = { 4, 1, 3, 5, 2, 3, 4, 6, 3, 8, 7, 3, 5, 1, 5, 1, 7, 3, 5, 6, 2, 3, 7, 2, 5, 6, 6, 5, 8, 8, 6, 2, 4, 2, 7, 2, 1, 2, 7 };
        assertEquals(1422, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case73() {
        int[] weight = { 8, 8, 8, 9, 8, 9, 9, 8, 9, 9, 9, 8, 8, 9, 8, 8, 9, 9, 9, 8, 9, 9, 8, 8, 8, 9, 8, 8, 8, 8, 9, 9, 9, 8, 9, 9, 9, 9, 9, 9 };
        assertEquals(2988, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case74() {
        int[] weight = { 8, 9, 9, 7, 6, 7, 7, 7, 9, 7, 8, 6, 7, 9, 8, 7, 8, 8, 6, 8, 9, 7, 6, 7, 6, 9, 9, 6, 7, 7, 8, 6, 8, 6, 7 };
        assertEquals(2278, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case75() {
        int[] weight = { 4, 2, 2, 4, 3, 2, 2, 2, 2, 3, 4, 2, 3, 3, 3 };
        assertEquals(148, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case76() {
        int[] weight = { 982, 994, 945, 947, 983, 982, 964, 939, 992, 995, 992, 958, 993, 976, 988, 975, 937, 956, 985, 949, 971, 965, 991, 993, 968, 995, 992, 954, 951, 956, 996, 938, 980, 971, 975, 948, 945, 974, 972, 981 };
        assertEquals(36946840, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case77() {
        int[] weight = { 917, 918, 940, 955, 988, 964, 945, 931, 930, 992, 930, 931, 997, 998, 957, 951, 968, 962, 996, 956, 987, 952, 943, 942, 984, 930, 922, 919, 920, 992, 953, 950, 965, 993, 940, 926, 947, 978, 921, 982 };
        assertEquals(36321482, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case78() {
        int[] weight = { 929, 969, 939, 988, 901, 956, 939, 955, 987, 988, 956, 929, 992, 965, 927, 935, 919, 916, 924, 902, 920, 916, 979, 975, 923, 944, 952, 936, 988, 918, 957, 915, 970, 919, 970, 952, 938, 907, 949, 905, 940, 906, 909, 915, 927 };
        assertEquals(40227129, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case79() {
        int[] weight = { 935, 930, 947, 951, 937, 953, 939, 956, 929, 943, 946, 944, 943, 943, 944, 952, 931, 928, 946, 944, 955, 950, 933, 954, 927, 956, 936, 954, 931, 945, 951, 925, 939, 927, 956, 928, 945, 935, 943, 957, 958 };
        assertEquals(35341426, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case80() {
        int[] weight = { 936, 934, 935, 936, 935, 934, 934, 935, 935, 934, 934, 934, 936, 934, 936, 934, 935, 936, 936, 936, 935, 934, 936, 935, 936, 936, 935, 935, 935, 936, 935, 935, 935, 936, 935, 935, 936, 934, 936, 934, 936, 936, 934, 934, 936, 935, 936, 934, 934 };
        assertEquals(41153112, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case81() {
        int[] weight = { 935, 942, 935, 942, 938, 937, 938, 942, 937, 936, 942, 941, 940, 940, 936, 940, 937, 940, 939, 935, 936, 936, 937, 940, 935, 940, 938, 935, 935, 935, 940, 938, 942, 940, 940, 939, 942, 936, 940, 942, 941, 941, 941, 941, 935 };
        assertEquals(38039905, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case82() {
        int[] weight = { 965, 966, 977, 957, 975, 964, 975, 975, 956, 973, 955, 970, 958, 955, 966, 977, 955, 973, 957, 959, 959, 975, 975, 975, 980, 965, 961, 971, 962, 974, 971, 976, 955, 965, 954, 963, 979, 975, 977, 980, 955, 954, 975, 976 };
        assertEquals(39891356, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case83() {
        int[] weight = { 920, 916, 920, 919, 918, 919, 918, 916, 919, 916, 920, 919, 920, 917, 917, 919, 916, 917, 916, 916, 920, 916, 920, 919, 920, 918, 919, 919, 917, 918, 920, 916, 917, 917, 919, 917, 916, 919, 917, 917, 917, 919, 917, 920, 917 };
        assertEquals(36340013, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case84() {
        int[] weight = { 924, 917, 919, 971, 954, 942, 947, 938, 965, 931, 956, 959, 939, 914, 956, 930, 944, 920, 952, 946, 941, 969, 946, 920, 915, 912, 967, 948, 925, 953, 954, 964, 940, 968, 905, 951, 909, 974, 915, 916, 905, 944, 910, 969 };
        assertEquals(38627917, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case85() {
        int[] weight = { 960, 940, 946, 966, 955, 948, 955, 948, 932, 945, 944, 941, 955, 955, 940, 932, 940, 945, 934, 943, 954, 927, 947, 940, 941, 944, 949, 954, 933, 950, 929, 933, 943, 934, 944, 941, 926, 941, 926, 945, 927 };
        assertEquals(35483046, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case86() {
        int[] weight = { 943, 943, 927, 940, 943, 932, 941, 930, 942, 931, 933, 942, 942, 941, 938, 933, 933, 934, 940, 926, 940, 932, 932, 941, 931, 933, 928, 942, 939, 927, 934, 934, 937, 933, 928, 939, 927, 935, 934, 935, 927, 927, 933, 925, 943, 930, 935, 929 };
        assertEquals(40624654, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case87() {
        int[] weight = { 973, 961, 978, 965, 974, 947, 978, 958, 966, 944, 953, 989, 994, 947, 983, 992, 993, 970, 951, 991, 994, 993, 956, 983, 962, 960, 995, 947, 975, 966, 967, 953, 971, 966, 990, 963, 990, 940, 970, 971, 980, 940, 956, 983 };
        assertEquals(40709252, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case88() {
        int[] weight = { 967, 964, 928, 968, 956, 951, 930, 953, 963, 969, 937, 939, 968, 947, 951, 959, 944, 942, 928, 971, 971, 938, 949, 953, 947, 937, 963, 928, 931, 922, 938, 943, 969, 967, 929, 935, 922, 955, 931, 936, 935, 941, 928, 947, 955, 967, 927, 970, 924 };
        assertEquals(43360289, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case89() {
        int[] weight = { 948, 915, 937, 930, 940, 924, 926, 914, 942, 945, 924, 938, 918, 917, 938, 923, 939, 941, 917, 941, 948, 949, 918, 944, 925, 933, 914, 922, 945, 941, 921, 918, 948, 927, 948, 926, 944, 947, 939, 929, 933, 949 };
        assertEquals(35560589, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case90() {
        int[] weight = { 971, 970, 970, 971, 971, 970, 970, 970, 970, 971, 971, 971, 970, 970, 971, 970, 970, 971, 970, 971, 971, 971, 971, 970, 971, 970, 971, 970, 971, 971, 971, 971, 970, 970, 971, 971, 971, 970, 971, 971, 971, 971, 971, 970, 971 };
        assertEquals(40535366, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case91() {
        int[] weight = { 929, 959, 929, 955, 924, 958, 949, 941, 914, 954, 939, 922, 952, 928, 956, 959, 951, 955, 919, 936, 922, 917, 926, 931, 919, 925, 932, 917, 946, 954, 949, 940, 959, 927, 951, 933, 919, 959, 944, 943, 924, 931 };
        assertEquals(36139643, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case92() {
        int[] weight = { 934, 938, 962, 971, 927, 928, 971, 953, 980, 957, 935, 967, 933, 985, 959, 929, 932, 987, 947, 947, 946, 991, 956, 988, 944, 947, 946, 947, 983, 978, 946, 975, 963, 968, 970, 929, 932, 976, 954, 963, 942, 926 };
        assertEquals(37888144, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case93() {
        int[] weight = { 929, 948, 945, 948, 921, 950, 931, 939, 950, 932, 917, 935, 952, 951, 961, 930, 951, 947, 959, 933, 945, 938, 947, 922, 942, 938, 928, 942, 917, 928, 933, 957, 924, 928, 961, 942, 939, 928, 934, 958, 935, 954, 960, 918, 947, 950, 951, 945, 947, 928 };
        assertEquals(43439869, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case94() {
        int[] weight = { 974, 974, 974, 974, 974, 973, 973, 974, 973, 973, 973, 973, 974, 974, 973, 974, 973, 974, 974, 973, 974, 974, 974, 973, 973, 974, 973, 973, 974, 973, 974, 974, 973, 974, 973, 974, 973, 974, 974, 974, 974 };
        assertEquals(36992520, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case95() {
        int[] weight = { 940, 929, 936, 935, 940, 932, 925, 933, 932, 924, 929, 931, 936, 934, 937, 942, 926, 927, 935, 935, 925, 923, 934, 923, 930, 934, 923, 928, 939, 931, 926, 941, 941, 928, 930, 942, 929, 937, 925, 928, 925 };
        assertEquals(34255220, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case96() {
        int[] weight = { 201, 841, 368, 221, 394, 175, 556, 322, 481, 813, 883, 304, 881, 188, 236, 150, 414, 764, 37, 68, 308, 217, 260, 366, 897, 176, 95, 735, 951, 182, 572, 540, 59, 146, 354, 989, 768, 438, 438, 792, 868, 833, 191, 917, 946, 24, 530, 187, 215, 1 };
        assertEquals(24144660, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case97() {
        int[] weight = { 10, 7, 6, 2, 1, 10, 10, 7, 9, 4, 5, 9, 5, 10, 10, 3, 6, 6, 4, 4, 4, 8, 5, 4, 9, 1, 9, 9, 1, 7, 9, 2, 10, 9, 10, 8, 3, 3, 9, 3, 9, 10, 1, 8, 9, 2, 6, 9, 7, 2 };
        assertEquals(3693, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case98() {
        int[] weight = { 589, 848, 314, 255, 905, 435, 607, 979, 749, 570, 474, 318, 264, 563, 235, 593, 263, 597, 190, 377, 333, 311, 100, 675, 960, 299, 154, 438, 303, 206, 855, 801, 7, 364, 956, 690, 821, 76, 835, 416, 661, 478, 738, 478, 593, 221 };
        assertEquals(23704925, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case99() {
        int[] weight = { 1, 5, 5, 5, 5, 5, 100, 1000, 100, 1 };
        assertEquals(27001, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case100() {
        int[] weight = { 5, 100, 30, 1, 1, 1, 30, 100, 5 };
        assertEquals(14485, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case101() {
        int[] weight = { 212, 743, 379, 313, 343, 157, 571, 332, 482, 799, 879, 299, 890, 201, 237, 149, 409, 769, 41 };
        assertEquals(6722359, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case102() {
        int[] weight = { 963, 465, 706, 146, 282, 828, 962, 492 };
        assertEquals(3661104, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case103() {
        int[] weight = { 3, 1, 2, 5, 4 };
        assertEquals(33, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case104() {
        int[] weight = { 5, 1, 7, 19, 12 };
        assertEquals(190, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case105() {
        int[] weight = { 809, 974, 742, 352, 372, 185, 750, 536, 642, 572, 544, 919, 985, 200, 877, 194, 371, 606, 99, 374, 347, 632, 145, 84, 825, 293, 159, 761, 330, 299, 584, 348, 767, 782, 917, 233, 327, 247, 695, 474, 796, 904, 440, 725, 303, 35, 566, 809, 937, 290 };
        assertEquals(27454956, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case106() {
        int[] weight = { 405, 454, 446, 125, 706, 941, 613, 406, 77 };
        assertEquals(2120542, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case107() {
        int[] weight = { 1, 3, 8, 3, 1 };
        assertEquals(17, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case108() {
        int[] weight = { 384, 887, 778, 916, 794, 336, 387, 493, 650, 422, 363, 28, 691, 60, 764, 927, 541, 427, 173, 737, 212, 369, 568, 430, 783, 531, 863, 124, 68, 136, 930, 803, 23, 59, 70, 168, 394, 457, 12, 43, 230, 374, 422, 920, 785, 538, 199, 325, 316, 371 };
        assertEquals(22047735, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case109() {
        int[] weight = { 4, 1, 5, 8, 5, 1, 4 };
        assertEquals(120, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case110() {
        int[] weight = { 5, 24, 10, 2, 3 };
        assertEquals(135, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case111() {
        int[] weight = { 5, 2, 2, 7, 9 };
        assertEquals(94, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case112() {
        int[] weight = { 13, 12, 51, 61, 12, 51, 81, 17, 15, 76, 41, 61, 62, 63, 23 };
        assertEquals(44681, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case113() {
        int[] weight = { 1, 3, 5, 3, 1, 2, 5, 1 };
        assertEquals(67, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case114() {
        int[] weight = { 1, 15, 100, 7, 1, 14 };
        assertEquals(1724, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case115() {
        int[] weight = { 1, 13, 100, 13, 1, 1, 100 };
        assertEquals(12800, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case116() {
        int[] weight = { 5, 2, 5, 20, 10 };
        assertEquals(190, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case117() {
        int[] weight = { 824, 840, 75, 511, 803, 323, 146, 923, 237, 834 };
        assertEquals(5135928, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case118() {
        int[] weight = { 45, 67, 89, 24, 78, 98, 456, 678, 267, 9, 5, 3, 6, 78, 234, 876, 23, 5, 67, 98, 13, 5, 89, 23, 68, 123, 34, 345, 56, 567, 78, 890, 98, 24, 76, 24, 97, 678, 34, 123, 839, 538, 4, 6, 89, 3, 4, 5 };
        assertEquals(8076363, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case119() {
        int[] weight = { 217, 914, 489, 289, 952, 873, 300, 938, 120, 199, 601, 770, 203, 278, 252, 215, 795, 734, 781, 523, 295, 389, 150, 928, 333, 42, 227, 962, 280, 924, 92, 925, 779, 239, 686, 466, 126, 344, 259, 645, 192, 875, 703, 370, 199, 241, 597, 423, 475, 334 };
        assertEquals(26377278, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case120() {
        int[] weight = { 10, 1, 1, 3, 10, 4, 1 };
        assertEquals(190, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case121() {
        int[] weight = { 10, 20, 100, 60, 10 };
        assertEquals(2100, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case122() {
        int[] weight = { 100, 1000, 100, 1, 99 };
        assertEquals(118800, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case123() {
        int[] weight = { 675, 76, 67, 466, 830 };
        assertEquals(920025, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case124() {
        int[] weight = { 92, 5, 3, 54, 93 };
        assertEquals(13800, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case125() {
        int[] weight = { 3, 4, 5, 4, 3 };
        assertEquals(39, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case126() {
        int[] weight = { 100, 1, 1, 3, 150 };
        assertEquals(15400, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case127() {
        int[] weight = { 634, 573, 844, 257, 76, 715, 327, 496, 354, 827, 321, 119, 517, 548, 935, 254, 667, 490, 302, 667, 518, 309, 227, 78, 866, 162, 880, 75, 426, 807, 407, 608, 939, 712, 411, 200, 859, 746, 516, 531, 703, 30, 295, 280, 901, 850, 312, 684, 465, 65 };
        assertEquals(26367021, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case128() {
        int[] weight = { 4, 3, 4, 1, 1, 10 };
        assertEquals(120, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case129() {
        int[] weight = { 5, 1, 1, 3, 4, 3 };
        assertEquals(55, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case130() {
        int[] weight = { 999, 348, 899, 928, 958, 234, 547, 574, 938, 478, 935, 297, 950, 968, 394, 928, 43, 910, 438, 991, 837, 947, 948, 273, 485, 938, 489, 958, 839, 948, 273, 129, 947, 832, 917, 247, 938, 172, 937, 172, 475, 55, 923, 473, 192, 387, 918, 736, 493, 999 };
        assertEquals(39923657, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case131() {
        int[] weight = { 6, 4, 2, 3, 5 };
        assertEquals(62, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case132() {
        int[] weight = { 310, 617, 936, 452, 601, 250, 520, 557, 799, 304, 225, 9, 845, 610, 990, 703, 196, 486, 94, 344, 524, 588, 315, 504, 449, 201, 459, 619, 581, 797, 799, 282, 590, 799, 10, 158, 473, 623, 539, 293, 39, 180, 191, 658, 959, 192, 816, 889, 157, 512 };
        assertEquals(24717175, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case133() {
        int[] weight = { 100, 3, 1, 2, 100 };
        assertEquals(10400, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case134() {
        int[] weight = { 1, 2, 7, 4, 1, 2, 3 };
        assertEquals(53, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case135() {
        int[] weight = { 898, 875, 534, 126, 416, 31, 748, 161, 343, 202, 647, 306, 858, 87, 714, 282, 348, 26, 825, 178, 654, 190, 64, 1, 877, 883, 402, 134, 671, 678, 358, 920, 792, 258, 279, 276, 904, 454, 860, 103 };
        assertEquals(20390957, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case136() {
        int[] weight = { 544, 474, 354, 216, 531, 475, 419, 137, 763, 117, 640 };
        assertEquals(3158565, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case137() {
        int[] weight = { 10, 5, 1, 3, 4, 8, 2, 9, 6, 7 };
        assertEquals(460, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case138() {
        int[] weight = { 1, 14, 59, 79, 66, 8, 78, 1, 59, 40 };
        assertEquals(27014, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case139() {
        int[] weight = { 974, 980, 983, 999, 975, 956, 967, 986, 995, 952, 977, 988, 981, 976, 963, 989, 979, 962, 953, 961, 993, 966, 991, 972, 994, 973, 992, 970, 957, 964, 960, 982, 997, 958, 990, 965, 1000, 959, 985, 968, 978, 998, 971, 987, 984, 969, 955, 951, 954, 996 };
        assertEquals(46991551, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case140() {
        int[] weight = { 230, 39, 125, 600, 310, 380, 200, 852, 665, 291 };
        assertEquals(1906360, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case141() {
        int[] weight = { 747, 600, 777, 474, 200, 501 };
        assertEquals(1581417, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case142() {
        int[] weight = { 111, 1, 1, 33, 111, 33, 1 };
        assertEquals(19869, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case143() {
        int[] weight = { 733, 493, 483, 791, 534, 224, 220, 284, 277, 168, 737, 886, 256, 77, 596, 693, 497, 112, 135, 445, 619, 854, 995, 478, 813, 736, 512, 296, 845, 375, 598, 298, 586, 81, 89, 120, 304, 308, 403, 299, 194, 140, 186, 169, 935, 500, 580, 151, 330, 714 };
        assertEquals(21847837, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case144() {
        int[] weight = { 521, 352, 5, 235, 678, 892 };
        assertEquals(1139346, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case145() {
        int[] weight = { 812, 204, 281, 512, 119, 691, 809, 246, 445, 992, 803, 382, 949, 723, 215, 921, 869, 765, 225, 6, 230, 774, 144, 939, 831, 344, 880, 84, 856, 727, 661, 82, 430, 570, 604, 169, 787, 666, 228, 586, 187, 960, 429, 736, 75, 997, 180, 257, 472, 162 };
        assertEquals(30564642, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case146() {
        int[] weight = { 69, 38, 29, 46, 72 };
        assertEquals(10143, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case147() {
        int[] weight = { 952, 525, 186, 195, 489, 801, 475, 900, 728, 861, 143, 377, 821, 373, 635, 219, 652, 286, 969, 1, 981, 230, 190, 980, 332, 897, 688, 566, 675, 879, 652, 411, 51, 578, 676, 343, 281, 887, 165, 431, 728, 158, 27, 849, 641, 822, 71, 480, 778, 906 };
        assertEquals(30940850, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case148() {
        int[] weight = { 9, 1, 10, 99, 10, 1, 9 };
        assertEquals(2061, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case149() {
        int[] weight = { 1, 2, 7, 10, 3, 2, 1 };
        assertEquals(61, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case150() {
        int[] weight = { 6, 1, 5, 9, 8 };
        assertEquals(132, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case151() {
        int[] weight = { 10, 1, 11, 100, 11, 1, 10 };
        assertEquals(2320, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case152() {
        int[] weight = { 720, 626, 287, 354, 324, 45, 513, 224, 404, 538, 661, 643, 678, 275, 663, 731, 60, 181, 506, 533, 675, 38, 644, 756, 454, 299, 461, 445, 43, 270, 450, 704, 129, 666, 68, 495, 531, 528, 171, 7, 141, 588, 154, 331, 467, 312, 57, 104, 57, 701 };
        assertEquals(16607808, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case153() {
        int[] weight = { 100, 98, 2, 1, 3, 100 };
        assertEquals(20192, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case154() {
        int[] weight = { 4, 1, 1, 5, 6, 5, 5, 5 };
        assertEquals(130, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case155() {
        int[] weight = { 968, 530, 474, 579, 581, 873, 25, 639, 54, 830, 271, 216, 583, 963, 658, 624, 728, 710, 791, 533, 304, 470, 640, 948, 401, 934, 970, 919, 567, 386, 548, 237, 573, 848, 711, 604, 20, 20, 910, 652, 668, 903, 164, 937, 66, 426, 489, 932, 745, 878 };
        assertEquals(32254576, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case156() {
        int[] weight = { 668, 300, 36, 895, 704, 812, 323 };
        assertEquals(2351280, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case157() {
        int[] weight = { 17, 4, 1, 2, 16 };
        assertEquals(352, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case158() {
        int[] weight = { 5, 11, 3, 1, 3 };
        assertEquals(59, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case159() {
        int[] weight = { 257, 386, 2, 492, 122, 108, 651, 903, 813, 517, 478, 387, 458, 295, 775, 753, 799, 974, 271, 246, 914, 548, 337, 462, 448, 716, 909, 948, 608, 790, 681, 866, 175, 684, 47, 297, 482, 699, 200, 295, 906, 368, 372, 363, 664, 838, 806, 462, 811, 76 };
        assertEquals(26582372, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case160() {
        int[] weight = { 1, 5, 10, 3, 1, 3 };
        assertEquals(58, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case161() {
        int[] weight = { 4, 15, 4, 1, 3 };
        assertEquals(72, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case162() {
        int[] weight = { 336, 263, 42, 39, 774, 619, 256, 449, 391, 557, 355, 603, 500, 768, 434, 106, 989, 52, 427, 400, 151, 83, 501, 886, 228, 624, 528, 586, 719, 334, 874, 54, 596, 267, 445, 369, 238, 52, 169, 980, 960, 523, 935, 459, 290, 368, 916, 630, 420, 342 };
        assertEquals(24504832, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case163() {
        int[] weight = { 100, 20, 1, 6, 1, 1, 100 };
        assertEquals(12820, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case164() {
        int[] weight = { 1, 100, 100, 2, 1, 100, 1 };
        assertEquals(20301, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case165() {
        int[] weight = { 100, 5, 1, 2, 100 };
        assertEquals(10600, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case166() {
        int[] weight = { 20, 300, 20, 1, 1, 10, 1 };
        assertEquals(3920, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case167() {
        int[] weight = { 10, 20, 8, 1, 8 };
        assertEquals(304, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case168() {
        int[] weight = { 10, 1, 10, 99, 10, 1, 10 };
        assertEquals(2280, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case169() {
        int[] weight = { 1, 2, 5, 3, 1, 1 };
        assertEquals(16, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case170() {
        int[] weight = { 42, 468, 335, 501, 170, 725, 479, 359, 963, 465, 706, 146, 282, 828, 962, 492, 996, 943, 828, 437, 392, 605, 903, 154, 293, 383, 422, 717, 719, 896, 448, 727, 772, 539, 870, 913, 668, 300, 36, 895, 704, 812, 323, 334, 674, 665, 142, 712, 254, 869 };
        assertEquals(30098989, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case171() {
        int[] weight = { 266, 123, 826, 697, 130, 768, 101, 111, 400, 550, 557, 301, 75, 102, 424, 983, 749, 27, 639, 671, 133, 196, 487, 776, 57, 107, 523, 781, 174, 763, 176, 486, 258, 167, 401, 472, 696, 613, 95, 170, 785, 142, 578, 642, 670, 585, 644, 578, 457, 134 };
        assertEquals(21965001, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case172() {
        int[] weight = { 312, 23, 321, 14, 543, 32, 432, 2, 43, 532, 11, 11, 321, 11, 312, 45, 543, 1, 53, 1, 543, 543, 545, 55, 444, 33, 23, 12, 4, 5, 6, 4, 77, 66, 55, 55, 33, 22, 565, 33, 55, 22, 22 };
        assertEquals(5276808, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case173() {
        int[] weight = { 3, 8, 5, 1, 1, 14 };
        assertEquals(238, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case174() {
        int[] weight = { 828, 360, 709, 472, 653, 144, 832, 616, 836, 196, 66, 944, 55, 644, 489, 355, 532, 499, 86, 639, 725, 543, 849, 441, 109, 742, 453, 759, 897, 875, 976, 231, 687, 703, 564, 988, 421, 20, 361, 854, 99, 882, 106, 438, 214, 593, 987, 536, 35, 598 };
        assertEquals(30397093, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case175() {
        int[] weight = { 1, 2, 2, 1, 1, 2, 2, 1 };
        assertEquals(17, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case176() {
        int[] weight = { 634, 885, 295, 386, 609, 486, 508, 427, 143, 92, 296, 76, 881, 572, 408, 639, 677, 707, 304, 799, 632, 722, 727, 128, 892, 738, 491, 614, 928, 267, 816, 691, 637, 944, 874, 59, 55, 580, 244, 195, 645, 937, 265, 987, 432, 62, 207, 147, 969, 779 };
        assertEquals(28416054, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case177() {
        int[] weight = { 6, 100, 17, 1, 3 };
        assertEquals(418, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case178() {
        int[] weight = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
        assertEquals(58800, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case179() {
        int[] weight = { 5, 20, 5, 1, 3 };
        assertEquals(95, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case180() {
        int[] weight = { 1, 4, 15, 4, 1 };
        assertEquals(31, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case181() {
        int[] weight = { 4, 1, 3, 9, 9 };
        assertEquals(84, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case182() {
        int[] weight = { 12, 9, 3, 2, 8 };
        assertEquals(192, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case183() {
        int[] weight = { 3, 7, 5, 2, 2 };
        assertEquals(34, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case184() {
        int[] weight = { 1, 2, 2, 1, 1, 2, 1 };
        assertEquals(13, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case185() {
        int[] weight = { 12, 101, 12, 1, 11 };
        assertEquals(1375, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case186() {
        int[] weight = { 6, 1, 10, 90, 10 };
        assertEquals(690, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case187() {
        int[] weight = { 7, 1, 3, 5, 9 };
        assertEquals(119, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case188() {
        int[] weight = { 1000, 1, 1, 1, 1, 1, 1, 1, 1, 1000, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1000 };
        assertEquals(3015000, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case189() {
        int[] weight = { 6, 7, 3, 1, 4 };
        assertEquals(64, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case190() {
        int[] weight = { 1000, 1, 1, 2, 1000, 501 };
        assertEquals(1504000, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case191() {
        int[] weight = { 4, 1, 5, 9, 5 };
        assertEquals(76, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case192() {
        int[] weight = { 1, 2, 5, 3, 1 };
        assertEquals(11, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case193() {
        int[] weight = { 101, 50, 2, 1, 100 };
        assertEquals(15300, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case194() {
        int[] weight = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
        assertEquals(48000000, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case195() {
        int[] weight = { 1, 2, 3 };
        assertEquals(3, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case196() {
        int[] weight = { 10, 1, 10, 20, 11 };
        assertEquals(410, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case197() {
        int[] weight = { 882, 215, 433, 988, 982, 478, 62, 348, 931, 921, 540, 564, 5, 730, 901, 500, 741, 254, 647, 368, 67, 209, 191, 324, 116, 467, 998, 412, 652, 941, 349, 879, 486, 793, 437, 594, 650, 318, 399, 751, 980, 323, 972, 585, 744, 60, 490, 326, 921, 991 };
        assertEquals(31715199, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case198() {
        int[] weight = { 100, 2, 1, 3, 101 };
        assertEquals(10500, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case199() {
        int[] weight = { 5, 50, 10, 1, 5 };
        assertEquals(325, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case200() {
        int[] weight = { 1, 4, 15, 4, 1, 3, 1 };
        assertEquals(91, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case201() {
        int[] weight = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 5, 7, 18, 29, 49, 35, 31, 49, 68, 54, 593, 139, 438, 48, 3, 6, 3, 7, 1, 5, 89, 3, 6, 2, 7, 2, 7, 2, 5, 8, 2, 78, 35, 674, 134, 1000, 935, 198, 400 };
        assertEquals(3838789, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case202() {
        int[] weight = { 1, 3, 8, 3, 1, 1, 3, 8, 3, 1, 1, 3, 8, 3, 1, 1, 3, 8, 3, 1, 1, 3, 8, 3, 1, 1, 3, 8, 3, 1, 1, 3, 8, 3, 1, 1, 3, 8, 3, 1, 1, 3, 8, 3, 1, 1, 3, 8, 3, 1 };
        assertEquals(1489, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case203() {
        int[] weight = { 42, 468, 335, 501, 170, 725, 479, 359 };
        assertEquals(1388765, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case204() {
        int[] weight = { 1, 100, 99, 100, 99, 100, 100, 99, 99, 100, 100, 99, 99, 98, 99, 100, 100, 99, 99, 100, 100, 100, 100, 100, 99, 99, 99, 99, 99, 100, 1, 1 };
        assertEquals(269202, casketofstar.maxEnergy(weight));
    }

    @Test
    public void case205() {
        int[] weight = { 2, 4, 2, 1, 2 };
        assertEquals(16, casketofstar.maxEnergy(weight));
    }

}
