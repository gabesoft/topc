package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class RabbitNumberingTest {
    RabbitNumbering rabbitnumbering = new RabbitNumbering();

    @Test
    public void case1() {
        int[] maxNumber = { 5 };
        assertEquals(5, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case2() {
        int[] maxNumber = { 4, 4, 4, 4 };
        assertEquals(24, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case3() {
        int[] maxNumber = { 5, 8 };
        assertEquals(35, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case4() {
        int[] maxNumber = { 2, 1, 2 };
        assertEquals(0, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case5() {
        int[] maxNumber = { 25, 489, 76, 98, 704, 98, 768, 39, 697, 8, 56, 74, 36, 95, 87, 2, 968, 4, 920, 54, 873, 90 };
        assertEquals(676780400, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case6() {
        int[] maxNumber = { 190 };
        assertEquals(190, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case7() {
        int[] maxNumber = { 122, 123 };
        assertEquals(14884, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case8() {
        int[] maxNumber = { 472, 478, 306 };
        assertEquals(68603976, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case9() {
        int[] maxNumber = { 14, 4, 18, 11 };
        assertEquals(7200, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case10() {
        int[] maxNumber = { 2, 2, 5, 3, 5 };
        assertEquals(4, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case11() {
        int[] maxNumber = { 44, 23, 56, 22, 16, 57, 50, 56, 56, 84, 25, 52, 45, 16, 66, 39, 43, 17, 50, 14, 31, 71, 76, 58, 62, 56, 56, 49, 57, 7, 27, 37, 37, 48, 66, 33, 53 };
        assertEquals(912191125, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case12() {
        int[] maxNumber = { 41, 51 };
        assertEquals(2050, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case13() {
        int[] maxNumber = { 20, 29, 22, 44, 12, 35, 41, 68, 46, 56, 13, 44, 53, 25 };
        assertEquals(156265080, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case14() {
        int[] maxNumber = { 3, 12, 14, 17, 9, 26, 11, 23, 6, 17, 8, 18, 28, 23, 17, 16, 13, 21, 21, 22, 10, 30, 27, 23, 5 };
        assertEquals(489700007, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case15() {
        int[] maxNumber = { 20, 17, 4, 8 };
        assertEquals(7140, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case16() {
        int[] maxNumber = { 10, 34, 30, 24, 13, 45, 21, 43, 40, 7, 37, 50, 14, 47, 11, 35, 4, 50, 17, 44, 38, 8, 28, 8, 23, 2, 19, 42, 38, 16, 6, 18, 49, 25, 5, 40, 15, 27, 33, 43, 32, 32, 28, 19, 29, 2, 21, 48, 23, 10 };
        assertEquals(268435456, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case17() {
        int[] maxNumber = { 48, 21, 41, 32, 18, 49, 68, 39, 47, 39, 45, 11, 4, 45, 48, 17, 56, 59, 30, 2, 47, 31, 41, 27, 62, 34, 50, 9, 21, 30, 25, 46, 43, 41, 14, 21, 57, 35, 27, 47, 64, 43, 9, 38, 51, 34, 31, 33, 22 };
        assertEquals(96783208, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case18() {
        int[] maxNumber = { 277 };
        assertEquals(277, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case19() {
        int[] maxNumber = { 44, 26, 15, 24, 34, 8, 20, 38, 4, 22, 27, 23, 35, 41, 27, 38, 31, 20, 23 };
        assertEquals(877427600, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case20() {
        int[] maxNumber = { 40, 8, 46, 46, 2, 27, 19, 15, 40, 28, 22, 34, 14, 39, 31, 28, 39, 3, 31, 37, 19, 23, 23, 27, 29, 32, 15, 34, 23, 15, 23, 39, 34, 39 };
        assertEquals(581883665, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case21() {
        int[] maxNumber = { 965 };
        assertEquals(965, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case22() {
        int[] maxNumber = { 427, 166 };
        assertEquals(70716, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case23() {
        int[] maxNumber = { 165, 405, 874 };
        assertEquals(58127520, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case24() {
        int[] maxNumber = { 830, 822, 778, 225 };
        assertEquals(555824674, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case25() {
        int[] maxNumber = { 420, 380, 38, 839, 626 };
        assertEquals(652805463, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case26() {
        int[] maxNumber = { 229, 528, 772, 56, 321, 403, 762, 677, 806, 75, 280, 34, 977, 289, 798, 343, 698, 758, 939, 440, 383, 876, 262, 283, 492, 967, 675, 328, 319 };
        assertEquals(801937806, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case27() {
        int[] maxNumber = { 712, 985, 240, 450 };
        assertEquals(132426675, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case28() {
        int[] maxNumber = { 280, 626, 841, 850, 577, 423, 514, 16, 140, 494, 716, 886, 890, 889, 685, 532, 89, 786, 423, 652, 955, 284, 244, 214, 984, 268, 535, 597, 398 };
        assertEquals(237178289, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case29() {
        int[] maxNumber = { 620, 146, 888, 516, 84, 670, 454, 271, 779, 786, 978, 101, 354, 584, 596, 554, 592, 943, 288, 903, 98, 145, 354, 698, 810, 779, 126, 90, 190, 761, 545, 338, 199, 239, 58, 520, 889, 484, 293, 701, 91, 343, 586, 570, 169, 176 };
        assertEquals(499609145, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case30() {
        int[] maxNumber = { 64, 327, 767, 376, 724, 763, 615, 75, 912, 840, 812, 419, 962, 58, 44, 745, 876, 824, 272, 473, 280 };
        assertEquals(661838298, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case31() {
        int[] maxNumber = { 6 };
        assertEquals(6, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case32() {
        int[] maxNumber = { 108, 29 };
        assertEquals(3103, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case33() {
        int[] maxNumber = { 25, 4, 14 };
        assertEquals(1196, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case34() {
        int[] maxNumber = { 9, 564, 463, 1 };
        assertEquals(2068968, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case35() {
        int[] maxNumber = { 2, 287, 294, 260, 8 };
        assertEquals(297484320, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case36() {
        int[] maxNumber = { 26, 284, 692 };
        assertEquals(5077020, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case37() {
        int[] maxNumber = { 67, 578, 552, 268, 10, 147, 89, 348, 20, 384, 4, 152, 407, 26, 116, 53, 56, 28, 17, 101, 150, 2, 42, 5, 8, 10, 27 };
        assertEquals(239341733, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case38() {
        int[] maxNumber = { 69, 4, 7, 45, 180, 9, 3, 58, 2, 263, 86, 70, 86, 162, 5, 19, 315 };
        assertEquals(256996107, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case39() {
        int[] maxNumber = { 367, 20, 287, 22, 140, 439, 693, 288, 124, 37, 16, 82, 39, 287, 49, 5, 374, 12, 418, 35, 56, 12, 137, 362, 326, 15, 52, 2 };
        assertEquals(205386743, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case40() {
        int[] maxNumber = { 24, 100, 628, 9, 161, 22, 143, 110, 166, 49, 2, 142, 1, 4, 60, 58, 121, 9, 12, 31, 23, 61, 22, 69, 1, 550, 11, 85, 21, 22, 101, 37, 332 };
        assertEquals(0, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case41() {
        int[] maxNumber = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
        assertEquals(512907687, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case42() {
        int[] maxNumber = { 1000 };
        assertEquals(1000, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case43() {
        int[] maxNumber = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(0, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case44() {
        int[] maxNumber = { 1 };
        assertEquals(1, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case45() {
        int[] maxNumber = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
        assertEquals(1, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case46() {
        int[] maxNumber = { 25, 489, 76, 98, 704, 98, 768, 39, 697, 8, 56, 74, 36, 95, 87, 2, 968, 4, 920, 54, 873, 90 };
        assertEquals(676780400, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case47() {
        int[] maxNumber = { 5, 7 };
        assertEquals(30, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case48() {
        int[] maxNumber = { 1000, 1000, 1000, 1000 };
        assertEquals(10987042, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case49() {
        int[] maxNumber = { 530, 775, 820, 727, 734, 420, 687, 338, 695, 185, 431, 528, 429, 8, 857, 541, 988, 123, 827, 992, 495, 129, 273, 338, 534, 97, 405, 711, 88, 101, 728, 505, 736, 805, 836, 85, 298, 381, 943, 464, 71, 49, 668, 911, 691, 80, 663, 674, 950, 363 };
        assertEquals(455673152, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case50() {
        int[] maxNumber = { 45, 45, 45, 34, 456, 444, 333 };
        assertEquals(93026007, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case51() {
        int[] maxNumber = { 25, 489, 76, 98, 704, 98, 768, 39, 697, 8, 999, 74, 36, 95, 87, 2, 968, 4, 920, 999, 999, 909 };
        assertEquals(690914420, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case52() {
        int[] maxNumber = { 25, 489, 76, 98, 704, 98, 798, 39, 697, 8, 56, 74, 36, 95, 87, 2, 968, 4, 920, 54, 873, 90 };
        assertEquals(703851616, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case53() {
        int[] maxNumber = { 1000, 1000, 1000, 1000, 1000, 1000, 234, 324, 345, 654 };
        assertEquals(657239485, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case54() {
        int[] maxNumber = { 1000, 1000, 1000, 1000, 1000 };
        assertEquals(943093762, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case55() {
        int[] maxNumber = { 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999 };
        assertEquals(210504217, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case56() {
        int[] maxNumber = { 2, 5, 125, 985, 657, 45, 11, 92, 12, 58, 125, 526, 548, 14, 54, 981, 126, 853, 265, 485, 123, 945, 12, 325, 425, 125, 365, 156, 165, 9, 574, 125 };
        assertEquals(822647744, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case57() {
        int[] maxNumber = { 25, 489, 76, 98, 704, 98, 768, 39, 697, 8, 56, 74, 36, 95, 87, 2, 968, 4, 920, 54, 873, 90, 77, 78, 79, 80, 90, 31, 34, 35, 36, 37, 38, 39, 40, 567, 568, 569, 570, 234, 546 };
        assertEquals(904675131, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case58() {
        int[] maxNumber = { 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999 };
        assertEquals(130223370, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case59() {
        int[] maxNumber = { 1, 2 };
        assertEquals(1, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case60() {
        int[] maxNumber = { 1000, 1000, 1000, 1000, 1000, 999, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 997, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 997 };
        assertEquals(458059245, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case61() {
        int[] maxNumber = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
        assertEquals(512907687, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case62() {
        int[] maxNumber = { 1000, 1000, 1000, 1000, 1000, 1000 };
        assertEquals(378286624, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case63() {
        int[] maxNumber = { 1000, 999, 1000, 998, 1000, 1000, 1000, 1000, 1000, 789, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
        assertEquals(403161038, rabbitnumbering.theCount(maxNumber));
    }

    @Test
    public void case64() {
        int[] maxNumber = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
        assertEquals(112594051, rabbitnumbering.theCount(maxNumber));
    }

}
