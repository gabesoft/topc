package topc.test.geometry;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.geometry.*;

public class TwoRectanglesTest {
    TwoRectangles tworectangles = new TwoRectangles();

    @Test
    public void case1() {
        int[] A = { 0, 0, 3, 2 };
        int[] B = { 1, 1, 5, 3 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case2() {
        int[] A = { 0, 0, 5, 3 };
        int[] B = { 1, 2, 2, 3 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case3() {
        int[] A = { 1, 1, 6, 2 };
        int[] B = { 3, 2, 5, 4 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case4() {
        int[] A = { 0, 1, 2, 3 };
        int[] B = { 2, 0, 5, 2 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case5() {
        int[] A = { 0, 0, 1, 1 };
        int[] B = { 1, 1, 5, 2 };
        assertEquals("point", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case6() {
        int[] A = { 1, 1, 2, 2 };
        int[] B = { 3, 1, 4, 2 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case7() {
        int[] A = { 0, 0, 10, 10 };
        int[] B = { 20, 10, 30, 20 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case8() {
        int[] A = { 155, 410, 162, 713 };
        int[] B = { 155, 410, 162, 713 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case9() {
        int[] A = { 28, 70, 441, 125 };
        int[] B = { 28, 70, 441, 554 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case10() {
        int[] A = { 69, 63, 299, 420 };
        int[] B = { 69, 420, 299, 712 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case11() {
        int[] A = { 127, 148, 286, 766 };
        int[] B = { 127, 148, 286, 593 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case12() {
        int[] A = { 177, 89, 245, 480 };
        int[] B = { 177, 318, 245, 480 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case13() {
        int[] A = { 28, 669, 700, 698 };
        int[] B = { 28, 164, 700, 669 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case14() {
        int[] A = { 315, 435, 777, 450 };
        int[] B = { 315, 407, 777, 450 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case15() {
        int[] A = { 381, 187, 494, 499 };
        int[] B = { 381, 703, 494, 954 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case16() {
        int[] A = { 423, 190, 692, 711 };
        int[] B = { 423, 214, 692, 955 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case17() {
        int[] A = { 104, 193, 341, 801 };
        int[] B = { 104, 581, 341, 619 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case18() {
        int[] A = { 90, 682, 618, 686 };
        int[] B = { 90, 202, 618, 920 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case19() {
        int[] A = { 375, 105, 416, 844 };
        int[] B = { 375, 55, 416, 807 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case20() {
        int[] A = { 171, 849, 479, 955 };
        int[] B = { 171, 608, 479, 656 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case21() {
        int[] A = { 200, 362, 324, 543 };
        int[] B = { 200, 362, 389, 543 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case22() {
        int[] A = { 110, 638, 230, 886 };
        int[] B = { 110, 638, 232, 949 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case23() {
        int[] A = { 159, 185, 337, 420 };
        int[] B = { 159, 420, 531, 630 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case24() {
        int[] A = { 307, 229, 694, 424 };
        int[] B = { 307, 229, 732, 384 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case25() {
        int[] A = { 87, 10, 317, 297 };
        int[] B = { 87, 163, 441, 297 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case26() {
        int[] A = { 487, 235, 496, 830 };
        int[] B = { 487, 188, 791, 235 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case27() {
        int[] A = { 110, 362, 428, 433 };
        int[] B = { 110, 215, 472, 433 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case28() {
        int[] A = { 371, 144, 572, 170 };
        int[] B = { 371, 417, 658, 777 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case29() {
        int[] A = { 223, 88, 291, 631 };
        int[] B = { 223, 413, 402, 633 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case30() {
        int[] A = { 19, 72, 485, 778 };
        int[] B = { 19, 478, 600, 497 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case31() {
        int[] A = { 40, 300, 323, 903 };
        int[] B = { 40, 165, 341, 946 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case32() {
        int[] A = { 226, 408, 289, 939 };
        int[] B = { 226, 226, 291, 850 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case33() {
        int[] A = { 516, 369, 657, 615 };
        int[] B = { 516, 193, 813, 331 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case34() {
        int[] A = { 185, 291, 414, 672 };
        int[] B = { 414, 291, 774, 672 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case35() {
        int[] A = { 22, 496, 232, 500 };
        int[] B = { 232, 496, 511, 556 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case36() {
        int[] A = { 384, 191, 504, 421 };
        int[] B = { 504, 421, 671, 509 };
        assertEquals("point", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case37() {
        int[] A = { 565, 787, 586, 846 };
        int[] B = { 586, 787, 689, 817 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case38() {
        int[] A = { 534, 222, 618, 920 };
        int[] B = { 618, 894, 644, 920 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case39() {
        int[] A = { 424, 308, 599, 521 };
        int[] B = { 599, 279, 846, 308 };
        assertEquals("point", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case40() {
        int[] A = { 25, 575, 369, 788 };
        int[] B = { 369, 437, 375, 788 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case41() {
        int[] A = { 146, 230, 230, 436 };
        int[] B = { 230, 547, 428, 815 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case42() {
        int[] A = { 13, 522, 545, 899 };
        int[] B = { 545, 827, 589, 921 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case43() {
        int[] A = { 5, 336, 538, 946 };
        int[] B = { 538, 351, 872, 477 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case44() {
        int[] A = { 18, 582, 101, 644 };
        int[] B = { 101, 198, 154, 860 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case45() {
        int[] A = { 66, 368, 237, 754 };
        int[] B = { 237, 43, 398, 487 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case46() {
        int[] A = { 305, 588, 565, 787 };
        int[] B = { 565, 311, 584, 578 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case47() {
        int[] A = { 63, 111, 613, 122 };
        int[] B = { 63, 111, 444, 122 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case48() {
        int[] A = { 77, 41, 755, 133 };
        int[] B = { 77, 41, 272, 553 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case49() {
        int[] A = { 170, 83, 505, 249 };
        int[] B = { 170, 249, 344, 463 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case50() {
        int[] A = { 183, 69, 708, 883 };
        int[] B = { 183, 69, 437, 371 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case51() {
        int[] A = { 298, 4, 797, 247 };
        int[] B = { 298, 114, 387, 247 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case52() {
        int[] A = { 2, 81, 383, 524 };
        int[] B = { 2, 50, 41, 81 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case53() {
        int[] A = { 18, 275, 474, 447 };
        int[] B = { 18, 233, 23, 447 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case54() {
        int[] A = { 200, 440, 267, 811 };
        int[] B = { 200, 891, 207, 960 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case55() {
        int[] A = { 276, 412, 704, 902 };
        int[] B = { 276, 782, 519, 932 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case56() {
        int[] A = { 162, 51, 818, 996 };
        int[] B = { 162, 141, 389, 703 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case57() {
        int[] A = { 0, 27, 352, 132 };
        int[] B = { 0, 7, 5, 633 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case58() {
        int[] A = { 75, 83, 634, 944 };
        int[] B = { 75, 70, 153, 435 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case59() {
        int[] A = { 261, 549, 682, 767 };
        int[] B = { 261, 408, 597, 521 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case60() {
        int[] A = { 35, 47, 642, 61 };
        int[] B = { 227, 47, 642, 61 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case61() {
        int[] A = { 254, 64, 706, 308 };
        int[] B = { 562, 64, 706, 586 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case62() {
        int[] A = { 571, 446, 763, 478 };
        int[] B = { 579, 478, 763, 524 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case63() {
        int[] A = { 180, 20, 826, 570 };
        int[] B = { 450, 20, 826, 342 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case64() {
        int[] A = { 11, 342, 120, 546 };
        int[] B = { 98, 485, 120, 546 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case65() {
        int[] A = { 298, 213, 648, 368 };
        int[] B = { 496, 41, 648, 213 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case66() {
        int[] A = { 180, 473, 786, 506 };
        int[] B = { 730, 466, 786, 506 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case67() {
        int[] A = { 367, 689, 850, 753 };
        int[] B = { 428, 801, 850, 980 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case68() {
        int[] A = { 258, 95, 646, 404 };
        int[] B = { 354, 246, 646, 679 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case69() {
        int[] A = { 566, 254, 867, 910 };
        int[] B = { 788, 681, 867, 890 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case70() {
        int[] A = { 479, 143, 683, 378 };
        int[] B = { 493, 117, 683, 665 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case71() {
        int[] A = { 546, 350, 844, 575 };
        int[] B = { 734, 90, 844, 352 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case72() {
        int[] A = { 6, 847, 329, 885 };
        int[] B = { 21, 25, 329, 335 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case73() {
        int[] A = { 225, 48, 590, 417 };
        int[] B = { 154, 48, 225, 417 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case74() {
        int[] A = { 156, 272, 503, 473 };
        int[] B = { 88, 272, 156, 508 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case75() {
        int[] A = { 593, 153, 849, 171 };
        int[] B = { 15, 171, 593, 214 };
        assertEquals("point", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case76() {
        int[] A = { 337, 109, 400, 539 };
        int[] B = { 81, 109, 337, 250 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case77() {
        int[] A = { 363, 303, 476, 614 };
        int[] B = { 91, 364, 363, 614 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case78() {
        int[] A = { 41, 344, 313, 563 };
        int[] B = { 12, 231, 41, 344 };
        assertEquals("point", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case79() {
        int[] A = { 450, 506, 634, 553 };
        int[] B = { 449, 197, 450, 553 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case80() {
        int[] A = { 424, 72, 597, 610 };
        int[] B = { 371, 654, 424, 985 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case81() {
        int[] A = { 362, 229, 372, 728 };
        int[] B = { 299, 626, 362, 845 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case82() {
        int[] A = { 313, 91, 391, 818 };
        int[] B = { 113, 125, 313, 714 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case83() {
        int[] A = { 329, 290, 360, 537 };
        int[] B = { 122, 100, 329, 702 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case84() {
        int[] A = { 239, 274, 604, 818 };
        int[] B = { 49, 253, 239, 559 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case85() {
        int[] A = { 917, 870, 990, 932 };
        int[] B = { 572, 132, 917, 683 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case86() {
        int[] A = { 150, 362, 161, 434 };
        int[] B = { 23, 362, 161, 434 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case87() {
        int[] A = { 629, 107, 632, 418 };
        int[] B = { 154, 107, 632, 842 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case88() {
        int[] A = { 267, 352, 625, 559 };
        int[] B = { 121, 559, 625, 695 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case89() {
        int[] A = { 325, 61, 482, 448 };
        int[] B = { 300, 61, 482, 260 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case90() {
        int[] A = { 397, 90, 591, 342 };
        int[] B = { 378, 160, 591, 342 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case91() {
        int[] A = { 303, 723, 461, 922 };
        int[] B = { 35, 177, 461, 723 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case92() {
        int[] A = { 486, 310, 542, 602 };
        int[] B = { 8, 290, 542, 602 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case93() {
        int[] A = { 140, 236, 315, 433 };
        int[] B = { 8, 467, 315, 587 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case94() {
        int[] A = { 255, 168, 470, 421 };
        int[] B = { 15, 233, 470, 686 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case95() {
        int[] A = { 325, 63, 502, 844 };
        int[] B = { 109, 594, 502, 712 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case96() {
        int[] A = { 598, 751, 708, 889 };
        int[] B = { 411, 488, 708, 970 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case97() {
        int[] A = { 367, 123, 389, 872 };
        int[] B = { 81, 78, 389, 727 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case98() {
        int[] A = { 279, 579, 702, 687 };
        int[] B = { 269, 145, 702, 465 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case99() {
        int[] A = { 441, 84, 480, 605 };
        int[] B = { 564, 84, 867, 605 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case100() {
        int[] A = { 56, 4, 371, 133 };
        int[] B = { 689, 4, 966, 310 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case101() {
        int[] A = { 121, 123, 200, 210 };
        int[] B = { 500, 210, 580, 552 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case102() {
        int[] A = { 69, 94, 203, 776 };
        int[] B = { 260, 94, 706, 526 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case103() {
        int[] A = { 43, 451, 112, 792 };
        int[] B = { 423, 597, 508, 792 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case104() {
        int[] A = { 393, 301, 514, 450 };
        int[] B = { 543, 3, 916, 301 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case105() {
        int[] A = { 231, 410, 287, 739 };
        int[] B = { 446, 408, 826, 739 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case106() {
        int[] A = { 23, 50, 434, 146 };
        int[] B = { 569, 528, 880, 997 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case107() {
        int[] A = { 37, 249, 706, 329 };
        int[] B = { 778, 251, 938, 978 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case108() {
        int[] A = { 13, 163, 136, 744 };
        int[] B = { 218, 444, 759, 622 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case109() {
        int[] A = { 12, 268, 856, 535 };
        int[] B = { 941, 113, 996, 984 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case110() {
        int[] A = { 125, 300, 205, 649 };
        int[] B = { 587, 249, 775, 578 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case111() {
        int[] A = { 1, 892, 49, 970 };
        int[] B = { 119, 138, 940, 860 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case112() {
        int[] A = { 177, 262, 460, 450 };
        int[] B = { 239, 262, 802, 450 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case113() {
        int[] A = { 166, 86, 647, 330 };
        int[] B = { 599, 86, 852, 447 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case114() {
        int[] A = { 59, 295, 873, 346 };
        int[] B = { 805, 346, 946, 527 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case115() {
        int[] A = { 61, 297, 818, 566 };
        int[] B = { 581, 297, 842, 514 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case116() {
        int[] A = { 21, 91, 883, 264 };
        int[] B = { 266, 234, 977, 264 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case117() {
        int[] A = { 208, 69, 430, 329 };
        int[] B = { 233, 39, 637, 69 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case118() {
        int[] A = { 66, 322, 659, 419 };
        int[] B = { 566, 288, 769, 419 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case119() {
        int[] A = { 170, 95, 392, 624 };
        int[] B = { 239, 760, 687, 791 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case120() {
        int[] A = { 224, 225, 288, 428 };
        int[] B = { 238, 355, 924, 819 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case121() {
        int[] A = { 324, 238, 493, 705 };
        int[] B = { 352, 254, 603, 298 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case122() {
        int[] A = { 76, 146, 531, 683 };
        int[] B = { 465, 21, 662, 840 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case123() {
        int[] A = { 113, 415, 681, 823 };
        int[] B = { 155, 184, 997, 441 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case124() {
        int[] A = { 84, 131, 719, 552 };
        int[] B = { 536, 0, 985, 110 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case125() {
        int[] A = { 109, 175, 686, 456 };
        int[] B = { 182, 175, 456, 456 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case126() {
        int[] A = { 376, 193, 856, 354 };
        int[] B = { 515, 193, 694, 755 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case127() {
        int[] A = { 399, 98, 850, 104 };
        int[] B = { 439, 104, 813, 136 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case128() {
        int[] A = { 159, 41, 558, 744 };
        int[] B = { 255, 41, 464, 676 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case129() {
        int[] A = { 58, 36, 977, 615 };
        int[] B = { 442, 235, 467, 615 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case130() {
        int[] A = { 327, 223, 926, 231 };
        int[] B = { 780, 56, 803, 223 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case131() {
        int[] A = { 68, 352, 737, 424 };
        int[] B = { 152, 305, 458, 424 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case132() {
        int[] A = { 213, 18, 701, 32 };
        int[] B = { 402, 139, 662, 340 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case133() {
        int[] A = { 317, 50, 974, 417 };
        int[] B = { 378, 178, 819, 991 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case134() {
        int[] A = { 220, 82, 975, 994 };
        int[] B = { 249, 496, 698, 640 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case135() {
        int[] A = { 660, 658, 974, 719 };
        int[] B = { 862, 424, 969, 899 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case136() {
        int[] A = { 319, 341, 568, 765 };
        int[] B = { 469, 236, 515, 405 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case137() {
        int[] A = { 8, 679, 608, 783 };
        int[] B = { 200, 315, 253, 560 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case138() {
        int[] A = { 119, 155, 263, 386 };
        int[] B = { 61, 155, 370, 386 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case139() {
        int[] A = { 405, 126, 597, 181 };
        int[] B = { 357, 126, 715, 813 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case140() {
        int[] A = { 209, 0, 275, 14 };
        int[] B = { 182, 14, 365, 895 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case141() {
        int[] A = { 290, 144, 525, 417 };
        int[] B = { 70, 144, 719, 353 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case142() {
        int[] A = { 99, 278, 381, 600 };
        int[] B = { 79, 484, 455, 600 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case143() {
        int[] A = { 562, 914, 584, 922 };
        int[] B = { 67, 546, 972, 914 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case144() {
        int[] A = { 398, 472, 860, 709 };
        int[] B = { 265, 62, 997, 709 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case145() {
        int[] A = { 376, 154, 661, 304 };
        int[] B = { 193, 401, 845, 927 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case146() {
        int[] A = { 243, 187, 245, 805 };
        int[] B = { 202, 716, 816, 959 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case147() {
        int[] A = { 398, 560, 606, 869 };
        int[] B = { 343, 702, 616, 767 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case148() {
        int[] A = { 528, 425, 713, 465 };
        int[] B = { 435, 58, 733, 537 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case149() {
        int[] A = { 36, 191, 608, 683 };
        int[] B = { 12, 153, 886, 475 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case150() {
        int[] A = { 406, 601, 507, 805 };
        int[] B = { 165, 34, 822, 459 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case151() {
        int[] A = { 363, 314, 475, 338 };
        int[] B = { 54, 314, 466, 338 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case152() {
        int[] A = { 427, 112, 511, 275 };
        int[] B = { 92, 112, 447, 277 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case153() {
        int[] A = { 295, 149, 711, 219 };
        int[] B = { 17, 219, 399, 370 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case154() {
        int[] A = { 130, 159, 535, 491 };
        int[] B = { 106, 159, 183, 387 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case155() {
        int[] A = { 291, 418, 897, 708 };
        int[] B = { 0, 634, 552, 708 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case156() {
        int[] A = { 692, 417, 983, 732 };
        int[] B = { 400, 281, 869, 417 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case157() {
        int[] A = { 747, 579, 965, 742 };
        int[] B = { 278, 93, 887, 742 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case158() {
        int[] A = { 559, 63, 886, 113 };
        int[] B = { 147, 192, 780, 943 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case159() {
        int[] A = { 305, 254, 685, 722 };
        int[] B = { 220, 625, 323, 742 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case160() {
        int[] A = { 76, 136, 944, 411 };
        int[] B = { 39, 247, 930, 306 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case161() {
        int[] A = { 540, 591, 857, 598 };
        int[] B = { 114, 349, 548, 872 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case162() {
        int[] A = { 397, 664, 566, 935 };
        int[] B = { 139, 551, 437, 716 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case163() {
        int[] A = { 398, 356, 974, 422 };
        int[] B = { 251, 127, 822, 131 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case164() {
        int[] A = { 507, 19, 866, 232 };
        int[] B = { 265, 19, 351, 232 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case165() {
        int[] A = { 622, 81, 693, 244 };
        int[] B = { 187, 81, 270, 373 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case166() {
        int[] A = { 170, 26, 309, 376 };
        int[] B = { 113, 376, 131, 437 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case167() {
        int[] A = { 393, 2, 469, 749 };
        int[] B = { 146, 2, 341, 332 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case168() {
        int[] A = { 513, 71, 515, 269 };
        int[] B = { 180, 136, 431, 269 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case169() {
        int[] A = { 581, 216, 964, 571 };
        int[] B = { 16, 58, 73, 216 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case170() {
        int[] A = { 490, 450, 740, 680 };
        int[] B = { 45, 12, 408, 680 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case171() {
        int[] A = { 520, 2, 679, 714 };
        int[] B = { 45, 806, 303, 911 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case172() {
        int[] A = { 371, 362, 609, 569 };
        int[] B = { 65, 500, 271, 668 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case173() {
        int[] A = { 537, 465, 585, 853 };
        int[] B = { 194, 563, 289, 651 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case174() {
        int[] A = { 794, 223, 947, 294 };
        int[] B = { 264, 188, 377, 391 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case175() {
        int[] A = { 414, 350, 842, 868 };
        int[] B = { 253, 182, 331, 358 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case176() {
        int[] A = { 691, 864, 792, 987 };
        int[] B = { 88, 544, 455, 586 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case177() {
        int[] A = { 0, 0, 3, 2 };
        int[] B = { 1, 1, 5, 3 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case178() {
        int[] A = { 3, 3, 5, 5 };
        int[] B = { 5, 1, 7, 3 };
        assertEquals("point", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case179() {
        int[] A = { 0, 0, 3, 2 };
        int[] B = { 0, 0, 3, 2 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case180() {
        int[] A = { 0, 0, 1, 1 };
        int[] B = { 1, 1, 5, 2 };
        assertEquals("point", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case181() {
        int[] A = { 0, 0, 5, 5 };
        int[] B = { 0, 0, 5, 5 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case182() {
        int[] A = { 1, 1, 2, 2 };
        int[] B = { 1, 1, 2, 2 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case183() {
        int[] A = { 0, 101, 101, 102 };
        int[] B = { 0, 0, 1, 100 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case184() {
        int[] A = { 0, 0, 1, 1 };
        int[] B = { 1, 0, 2, 1 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case185() {
        int[] A = { 0, 1, 1, 2 };
        int[] B = { 1, 0, 2, 1 };
        assertEquals("point", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case186() {
        int[] A = { 0, 0, 2, 2 };
        int[] B = { 1, 0, 2, 1 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case187() {
        int[] A = { 1, 2, 3, 4 };
        int[] B = { 1, 2, 3, 4 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case188() {
        int[] A = { 2, 2, 8, 8 };
        int[] B = { 0, 0, 10, 10 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case189() {
        int[] A = { 0, 0, 2, 2 };
        int[] B = { 0, 0, 2, 2 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case190() {
        int[] A = { 2, 6, 7, 8 };
        int[] B = { 1, 2, 3, 4 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case191() {
        int[] A = { 1, 1, 5, 5 };
        int[] B = { 1, 2, 5, 4 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case192() {
        int[] A = { 2, 2, 3, 3 };
        int[] B = { 1, 3, 2, 4 };
        assertEquals("point", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case193() {
        int[] A = { 2, 2, 8, 3 };
        int[] B = { 3, 1, 4, 5 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case194() {
        int[] A = { 0, 0, 3, 3 };
        int[] B = { 1, 1, 3, 3 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case195() {
        int[] A = { 0, 0, 1, 1 };
        int[] B = { 50, 1, 51, 2 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case196() {
        int[] A = { 2, 3, 4, 4 };
        int[] B = { 1, 1, 5, 5 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case197() {
        int[] A = { 1, 1, 6, 2 };
        int[] B = { 3, 2, 6, 6 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case198() {
        int[] A = { 1, 1, 2, 2 };
        int[] B = { 3, 1, 4, 2 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case199() {
        int[] A = { 11, 11, 22, 22 };
        int[] B = { 12, 0, 15, 11 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case200() {
        int[] A = { 1, 999, 2, 1000 };
        int[] B = { 2, 999, 3, 1000 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case201() {
        int[] A = { 3, 4, 10, 100 };
        int[] B = { 3, 4, 10, 100 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case202() {
        int[] A = { 0, 1, 1, 3 };
        int[] B = { 1, 0, 2, 1 };
        assertEquals("point", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case203() {
        int[] A = { 0, 0, 4, 4 };
        int[] B = { 1, 5, 2, 6 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case204() {
        int[] A = { 23, 567, 95, 999 };
        int[] B = { 0, 23, 555, 24 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case205() {
        int[] A = { 0, 0, 1, 1 };
        int[] B = { 2, 1, 5, 3 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case206() {
        int[] A = { 1, 1, 2, 2 };
        int[] B = { 0, 0, 1, 1 };
        assertEquals("point", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case207() {
        int[] A = { 1, 3, 2, 6 };
        int[] B = { 2, 1, 4, 3 };
        assertEquals("point", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case208() {
        int[] A = { 100, 100, 200, 200 };
        int[] B = { 0, 200, 100, 300 };
        assertEquals("point", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case209() {
        int[] A = { 1, 0, 2, 1 };
        int[] B = { 0, 1, 1, 2 };
        assertEquals("point", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case210() {
        int[] A = { 0, 0, 1, 1 };
        int[] B = { 5, 1, 6, 2 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case211() {
        int[] A = { 2, 2, 3, 3 };
        int[] B = { 1, 1, 4, 4 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case212() {
        int[] A = { 0, 1, 3, 2 };
        int[] B = { 1, 0, 2, 1 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case213() {
        int[] A = { 1, 2, 2, 3 };
        int[] B = { 2, 1, 3, 2 };
        assertEquals("point", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case214() {
        int[] A = { 0, 0, 3, 3 };
        int[] B = { 3, 4, 6, 6 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case215() {
        int[] A = { 2, 2, 10, 10 };
        int[] B = { 2, 2, 10, 10 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case216() {
        int[] A = { 2, 2, 7, 7 };
        int[] B = { 1, 7, 2, 9 };
        assertEquals("point", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case217() {
        int[] A = { 1, 1, 2, 2 };
        int[] B = { 2, 0, 3, 1 };
        assertEquals("point", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case218() {
        int[] A = { 1, 1, 2, 2 };
        int[] B = { 0, 0, 3, 3 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case219() {
        int[] A = { 2, 2, 4, 4 };
        int[] B = { 1, 2, 2, 3 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case220() {
        int[] A = { 0, 0, 1, 1 };
        int[] B = { 0, 0, 1, 1 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case221() {
        int[] A = { 100, 100, 103, 102 };
        int[] B = { 103, 90, 105, 100 };
        assertEquals("point", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case222() {
        int[] A = { 1, 1, 2, 2 };
        int[] B = { 1, 2, 2, 3 };
        assertEquals("segment", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case223() {
        int[] A = { 2, 1, 3, 2 };
        int[] B = { 1, 2, 2, 3 };
        assertEquals("point", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case224() {
        int[] A = { 0, 0, 3, 2 };
        int[] B = { 10, 10, 52, 52 };
        assertEquals("none", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case225() {
        int[] A = { 10, 10, 20, 20 };
        int[] B = { 8, 12, 22, 14 };
        assertEquals("rectangle", tworectangles.describeIntersection(A, B));
    }

    @Test
    public void case226() {
        int[] A = { 0, 3, 1, 4 };
        int[] B = { 1, 2, 2, 3 };
        assertEquals("point", tworectangles.describeIntersection(A, B));
    }

}
