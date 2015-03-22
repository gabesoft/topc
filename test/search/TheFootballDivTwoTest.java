package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class TheFootballDivTwoTest {
    TheFootballDivTwo thefootballdivtwo = new TheFootballDivTwo();

    @Test
    public void case1() {
        int yourScore = 4;
        int[] scores = { 7 };
        int[] numberOfTeams = { 1 };
        assertEquals(1, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case2() {
        int yourScore = 1;
        int[] scores = { 7 };
        int[] numberOfTeams = { 2 };
        assertEquals(2, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case3() {
        int yourScore = 1;
        int[] scores = { 7, 1 };
        int[] numberOfTeams = { 2, 1 };
        assertEquals(1, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case4() {
        int yourScore = 11;
        int[] scores = { 5, 12, 17, 19, 99, 13, 15, 14 };
        int[] numberOfTeams = { 2, 4, 8, 2, 1, 3, 25, 3 };
        assertEquals(18, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case5() {
        int yourScore = 1;
        int[] scores = { 7 };
        int[] numberOfTeams = { 1 };
        assertEquals(1, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case6() {
        int yourScore = 1;
        int[] scores = { 100 };
        int[] numberOfTeams = { 1 };
        assertEquals(2, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case7() {
        int yourScore = 100;
        int[] scores = { 0 };
        int[] numberOfTeams = { 1 };
        assertEquals(1, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case8() {
        int yourScore = 0;
        int[] scores = { 0, 8, 4, 5, 6, 1, 7, 2 };
        int[] numberOfTeams = { 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(3, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case9() {
        int yourScore = 5;
        int[] scores = { 2, 6, 3, 5, 4, 9 };
        int[] numberOfTeams = { 3, 1, 1, 1, 2, 1 };
        assertEquals(1, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case10() {
        int yourScore = 8;
        int[] scores = { 0, 8, 3, 6, 2 };
        int[] numberOfTeams = { 5, 2, 1, 1, 1 };
        assertEquals(1, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case11() {
        int yourScore = 8;
        int[] scores = { 5, 2, 6, 9, 0 };
        int[] numberOfTeams = { 1, 2, 2, 1, 1 };
        assertEquals(1, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case12() {
        int yourScore = 1;
        int[] scores = { 4 };
        int[] numberOfTeams = { 1 };
        assertEquals(1, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case13() {
        int yourScore = 6;
        int[] scores = { 5 };
        int[] numberOfTeams = { 1 };
        assertEquals(1, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case14() {
        int yourScore = 2;
        int[] scores = { 0 };
        int[] numberOfTeams = { 1 };
        assertEquals(1, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case15() {
        int yourScore = 0;
        int[] scores = { 7, 9, 5 };
        int[] numberOfTeams = { 1, 3, 1 };
        assertEquals(5, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case16() {
        int yourScore = 9;
        int[] scores = { 42, 1, 20, 7, 46, 23, 22, 32, 4, 18, 3, 35, 30, 31, 27, 38, 13, 10, 37, 29, 40, 6, 5, 45, 14, 15, 39, 36, 9, 11, 33, 34, 43, 8, 19, 16, 28, 24, 41, 21, 17, 44, 12, 2, 25, 26, 0 };
        int[] numberOfTeams = { 579, 589, 553, 583, 30949, 578, 532, 558, 569, 570, 560, 488, 582, 556, 529, 539, 584, 541, 564, 576, 533, 524, 576, 518, 542, 610, 564, 557, 537, 532, 550, 528, 578, 535, 555, 563, 543, 576, 567, 557, 583, 526, 502, 603, 583, 575, 1159 };
        assertEquals(47610, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case17() {
        int yourScore = 100;
        int[] scores = { 32, 36, 44, 9, 41, 29, 26, 2, 16, 5, 23, 6, 34, 12, 20, 21, 0, 22, 24, 28, 30, 100, 13, 17, 8, 45, 31, 18, 40, 38, 4, 1, 15, 25, 11, 42, 14, 7, 10, 3, 19, 37, 33, 27, 35, 39, 43 };
        int[] numberOfTeams = { 189, 262, 216, 220, 244, 204, 216, 211, 210, 208, 200, 204, 223, 203, 247, 233, 401, 197, 228, 196, 240, 215, 213, 197, 224, 12324, 193, 206, 210, 223, 201, 215, 213, 214, 221, 209, 243, 262, 235, 226, 223, 236, 239, 235, 243, 235, 237 };
        assertEquals(1, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case18() {
        int yourScore = 19;
        int[] scores = { 5, 22, 13, 38, 18, 27, 14, 21, 29, 25, 30, 19, 15, 3, 26, 9, 6, 41, 11, 28, 32, 45, 46, 43, 33, 40, 2, 10, 31, 0, 20, 39, 17, 8, 35, 12, 4, 36, 42, 44, 16, 1, 24, 23, 34, 7, 37 };
        int[] numberOfTeams = { 486, 424, 439, 467, 474, 436, 444, 495, 427, 464, 455, 467, 473, 418, 493, 458, 463, 477, 450, 459, 462, 428, 25193, 452, 458, 490, 451, 482, 468, 952, 520, 463, 471, 466, 467, 483, 452, 442, 435, 474, 421, 475, 448, 437, 463, 476, 442 };
        assertEquals(34352, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case19() {
        int yourScore = 0;
        int[] scores = { 22, 13, 26, 14, 15, 8, 3, 42, 43, 12, 35, 39, 11, 30, 2, 18, 37, 9, 40, 19, 46, 33, 20, 21, 16, 27, 24, 36, 44, 6, 29, 17, 31, 32, 25, 45, 28, 5, 23, 10, 7, 41, 1, 4, 34, 0, 38 };
        int[] numberOfTeams = { 650, 642, 672, 645, 725, 702, 672, 688, 623, 640, 683, 636, 693, 684, 670, 670, 663, 671, 667, 635, 36800, 650, 669, 648, 683, 688, 700, 623, 655, 645, 675, 668, 631, 645, 723, 696, 669, 667, 665, 698, 745, 715, 674, 638, 681, 1375, 648 };
        assertEquals(62965, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case20() {
        int yourScore = 87;
        int[] scores = { 15, 3, 5, 18, 4, 7, 26, 94, 14, 87, 6, 16, 91, 88, 99, 2, 22, 12, 27, 31, 96, 9, 29, 20, 30, 21, 8, 11, 1, 19, 95, 93, 28, 98, 25, 97, 0, 17, 32, 13, 92, 10, 100, 89, 24, 23, 90 };
        int[] numberOfTeams = { 116, 132, 118, 120, 114, 115, 107, 111, 105, 104, 124, 126, 131, 126, 116, 100, 129, 114, 116, 114, 115, 121, 118, 129, 101, 120, 128, 108, 122, 106, 131, 140, 123, 110, 111, 130, 257, 93, 6426, 125, 107, 122, 130, 124, 117, 111, 113 };
        assertEquals(844, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case21() {
        int yourScore = 51;
        int[] scores = { 7, 59, 52, 76, 69, 1, 2, 73, 9, 57, 4, 61, 72, 60, 8, 0, 67, 64, 77, 16, 17, 18, 10, 3, 56, 62, 63, 51, 71, 74, 55, 12, 6, 65, 66, 58, 15, 5, 53, 19, 13, 75, 68, 54, 70, 11, 14 };
        int[] numberOfTeams = { 703, 710, 679, 690, 719, 666, 743, 747, 726, 735, 736, 737, 690, 707, 684, 1470, 722, 697, 17196, 724, 716, 758, 709, 714, 730, 742, 720, 720, 727, 711, 755, 716, 689, 736, 715, 698, 719, 740, 709, 22674, 671, 730, 683, 667, 759, 661, 728 };
        assertEquals(30837, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case22() {
        int yourScore = 83;
        int[] scores = { 20, 17, 2, 3, 14, 87, 85, 89, 4, 96, 16, 23, 28, 21, 90, 99, 8, 26, 1, 95, 9, 0, 83, 92, 84, 94, 88, 91, 97, 24, 86, 25, 98, 27, 19, 93, 100, 13, 7, 6, 12, 5, 22, 15, 11, 18, 10 };
        int[] numberOfTeams = { 531, 499, 527, 545, 570, 551, 591, 531, 564, 551, 515, 573, 30074, 525, 537, 499, 533, 544, 558, 534, 559, 1067, 550, 542, 541, 551, 564, 549, 543, 550, 543, 543, 556, 546, 556, 558, 567, 542, 541, 535, 537, 616, 523, 581, 524, 543, 517 };
        assertEquals(5988, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case23() {
        int yourScore = 41;
        int[] scores = { 7, 11, 64, 55, 42, 46, 2, 61, 63, 3, 53, 66, 41, 14, 60, 58, 0, 6, 9, 19, 45, 5, 8, 12, 4, 48, 13, 65, 16, 51, 15, 50, 47, 10, 43, 59, 67, 18, 54, 44, 1, 17, 49, 52, 57, 56, 62 };
        int[] numberOfTeams = { 21, 37, 18, 18, 18, 16, 23, 24, 23, 15, 30, 29, 20, 20, 19, 24, 50, 20, 33, 538, 24, 24, 18, 30, 23, 19, 23, 25, 22, 27, 24, 26, 22, 30, 32, 28, 800, 28, 18, 18, 19, 21, 27, 23, 21, 30, 26 };
        assertEquals(1256, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case24() {
        int yourScore = 0;
        int[] scores = { 0 };
        int[] numberOfTeams = { 99999 };
        assertEquals(1, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case25() {
        int yourScore = 100;
        int[] scores = { 100 };
        int[] numberOfTeams = { 99999 };
        assertEquals(1, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case26() {
        int yourScore = 9;
        int[] scores = { 44, 3, 40, 41, 0, 24, 38, 36, 21, 8, 49, 37, 9, 50, 17, 5, 19, 15, 51, 16, 46, 25, 7, 34, 20, 29, 1, 45, 22, 18, 2, 31, 30, 27, 42, 39, 4, 47, 43, 6, 28, 32, 48, 35, 26, 23, 33 };
        int[] numberOfTeams = { 22, 18, 23, 26, 55, 21, 20, 26, 17, 21, 25, 30, 23, 22, 14, 16, 22, 121, 1044, 28, 20, 23, 22, 18, 20, 18, 24, 16, 24, 24, 28, 23, 17, 23, 19, 22, 22, 26, 14, 15, 16, 20, 19, 16, 21, 21, 21 };
        assertEquals(1782, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case27() {
        int yourScore = 10;
        int[] scores = { 28, 33, 22, 3, 23, 1, 34, 4, 26, 8, 45, 48, 49, 24, 21, 18, 25, 38, 41, 31, 35, 39, 7, 40, 47, 9, 29, 43, 37, 44, 50, 19, 16, 10, 46, 6, 17, 36, 32, 27, 51, 42, 5, 0, 30, 20, 2 };
        int[] numberOfTeams = { 14, 24, 16, 18, 26, 16, 28, 18, 21, 13, 25, 12, 31, 20, 19, 18, 17, 24, 18, 17, 31, 19, 22, 25, 22, 21, 14, 15, 16, 21, 25, 20, 109, 23, 12, 22, 21, 20, 15, 17, 1002, 28, 22, 38, 13, 16, 27 };
        assertEquals(1683, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case28() {
        int yourScore = 34;
        int[] scores = { 58, 51, 7, 40, 15, 1, 19, 55, 60, 42, 20, 46, 4, 45, 52, 59, 17, 48, 61, 54, 3, 14, 53, 2, 57, 49, 8, 6, 44, 12, 50, 9, 22, 16, 34, 11, 18, 0, 56, 5, 62, 13, 43, 21, 10, 41, 47 };
        int[] numberOfTeams = { 19, 18, 18, 118, 14, 21, 30, 25, 22, 14, 16, 16, 18, 18, 16, 16, 22, 15, 12, 23, 19, 21, 22, 23, 15, 21, 23, 18, 20, 21, 15, 12, 248, 18, 19, 17, 25, 42, 19, 13, 762, 24, 18, 15, 17, 21, 12 };
        assertEquals(1140, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case29() {
        int yourScore = 94;
        int[] scores = { 37, 39, 38, 4, 2, 6, 8, 34, 94, 21, 19, 18, 0, 10, 5, 11, 15, 31, 100, 17, 42, 41, 7, 25, 14, 9, 36, 24, 40, 26, 30, 22, 35, 43, 44, 12, 32, 33, 13, 27, 3, 29, 1, 16, 20, 23, 28 };
        int[] numberOfTeams = { 37, 43, 21, 33, 36, 42, 42, 41, 49, 40, 30, 46, 78, 33, 40, 36, 40, 41, 239, 32, 33, 37, 38, 26, 43, 41, 43, 42, 34, 35, 41, 36, 30, 29, 1890, 47, 43, 38, 41, 38, 65, 39, 35, 58, 35, 39, 23 };
        assertEquals(1, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case30() {
        int yourScore = 7;
        int[] scores = { 0, 23, 33, 21, 15, 41, 51, 28, 1, 47, 40, 19, 6, 48, 44, 42, 29, 32, 27, 13, 34, 31, 25, 17, 20, 43, 7, 38, 3, 24, 36, 16, 46, 5, 2, 26, 18, 50, 45, 35, 37, 30, 14, 4, 22, 39, 49 };
        int[] numberOfTeams = { 39, 17, 18, 17, 22, 20, 950, 10, 16, 18, 16, 18, 11, 16, 19, 27, 22, 20, 12, 117, 21, 15, 12, 21, 24, 11, 16, 22, 23, 29, 11, 17, 17, 25, 22, 20, 14, 19, 19, 11, 13, 13, 13, 17, 17, 21, 25 };
        assertEquals(1608, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case31() {
        int yourScore = 21;
        int[] scores = { 3, 17, 39, 33, 1, 31, 51, 32, 37, 43, 28, 34, 14, 19, 35, 10, 41, 29, 16, 50, 49, 42, 7, 0, 36, 21, 4, 27, 47, 15, 20, 12, 30, 40, 44, 2, 38, 45, 48, 13, 18, 6, 46, 8, 11, 9, 5 };
        int[] numberOfTeams = { 16, 28, 20, 16, 20, 16, 1121, 21, 26, 24, 15, 22, 24, 28, 19, 23, 21, 24, 23, 21, 28, 24, 19, 49, 22, 18, 25, 142, 18, 24, 17, 15, 35, 14, 25, 24, 24, 19, 21, 27, 20, 25, 26, 16, 18, 32, 19 };
        assertEquals(1623, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case32() {
        int yourScore = 3;
        int[] scores = { 25, 32, 19, 48, 42, 26, 13, 44, 43, 45, 37, 12, 31, 29, 24, 3, 23, 50, 33, 28, 30, 27, 47, 1, 10, 21, 11, 18, 36, 0, 40, 16, 41, 51, 15, 39, 49, 38, 9, 14, 34, 46, 20, 17, 22, 2, 35 };
        int[] numberOfTeams = { 29, 24, 26, 30, 45, 33, 21, 33, 29, 26, 27, 27, 29, 31, 38, 32, 29, 27, 31, 37, 17, 25, 29, 26, 28, 25, 29, 18, 32, 44, 28, 28, 33, 1399, 32, 23, 34, 28, 158, 37, 30, 33, 31, 32, 30, 24, 32 };
        assertEquals(2606, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case33() {
        int yourScore = 9;
        int[] scores = { 49, 42, 34, 19, 26, 36, 13, 23, 27, 38, 21, 37, 46, 28, 20, 6, 40, 18, 33, 1, 4, 22, 15, 25, 45, 29, 30, 48, 44, 24, 35, 47, 39, 50, 41, 17, 2, 16, 32, 7, 43, 3, 31, 0, 8, 5, 9 };
        int[] numberOfTeams = { 574, 579, 528, 555, 575, 557, 1, 578, 529, 539, 557, 564, 521, 543, 553, 524, 533, 570, 550, 588, 569, 532, 3310, 583, 518, 576, 581, 542, 526, 576, 488, 548, 564, 28758, 567, 583, 603, 563, 558, 583, 578, 560, 556, 1158, 535, 576, 537 };
        assertEquals(47603, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case34() {
        int yourScore = 51;
        int[] scores = { 0, 51, 58, 19, 2, 3, 75, 78, 69, 20, 67, 70, 74, 9, 55, 8, 12, 21, 64, 6, 11, 10, 60, 72, 68, 66, 61, 17, 59, 65, 4, 15, 57, 16, 63, 18, 73, 13, 79, 1, 62, 71, 76, 77, 5, 7, 14 };
        int[] numberOfTeams = { 629, 322, 289, 352, 323, 351, 320, 349, 300, 375, 329, 349, 323, 345, 1, 342, 307, 10098, 301, 321, 320, 351, 327, 341, 363, 330, 369, 320, 343, 352, 300, 324, 2053, 318, 347, 296, 335, 326, 7413, 336, 321, 326, 337, 350, 312, 371, 347 };
        assertEquals(14415, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case35() {
        int yourScore = 86;
        int[] scores = { 96, 32, 19, 16, 14, 21, 9, 3, 97, 30, 12, 20, 0, 1, 26, 28, 7, 31, 99, 22, 34, 93, 6, 94, 17, 15, 86, 4, 33, 18, 95, 10, 11, 92, 23, 8, 5, 100, 35, 13, 24, 98, 90, 25, 29, 27, 2 };
        int[] numberOfTeams = { 316, 350, 318, 330, 342, 344, 333, 372, 337, 379, 337, 363, 702, 343, 325, 379, 357, 323, 310, 342, 359, 334, 320, 315, 327, 333, 385, 332, 373, 352, 323, 347, 345, 2013, 338, 372, 346, 346, 17470, 354, 343, 348, 1, 347, 379, 328, 333 };
        assertEquals(2630, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case36() {
        int yourScore = 51;
        int[] scores = { 69, 15, 55, 67, 13, 71, 17, 79, 60, 0, 68, 9, 5, 73, 8, 63, 75, 11, 3, 78, 21, 61, 74, 19, 72, 76, 16, 58, 65, 59, 20, 1, 64, 10, 57, 4, 66, 7, 18, 14, 62, 6, 2, 70, 12, 51, 77 };
        int[] numberOfTeams = { 289, 261, 1, 247, 253, 243, 250, 5541, 245, 548, 251, 247, 258, 258, 240, 261, 300, 252, 224, 242, 7655, 255, 281, 237, 258, 238, 253, 232, 248, 248, 248, 271, 270, 242, 1524, 248, 261, 245, 226, 232, 238, 260, 229, 253, 248, 235, 268 };
        assertEquals(10928, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case37() {
        int yourScore = 54;
        int[] scores = { 82, 14, 62, 15, 4, 54, 10, 17, 1, 67, 70, 7, 19, 21, 77, 66, 11, 2, 18, 74, 75, 58, 60, 79, 78, 64, 63, 73, 8, 6, 80, 76, 68, 71, 61, 69, 72, 12, 0, 13, 20, 81, 65, 9, 16, 3, 5 };
        int[] numberOfTeams = { 6214, 332, 312, 369, 321, 339, 358, 343, 331, 331, 325, 388, 320, 10762, 312, 315, 341, 327, 324, 354, 325, 1, 2021, 340, 328, 347, 342, 340, 336, 316, 346, 342, 337, 367, 341, 349, 324, 345, 666, 298, 321, 306, 347, 347, 339, 324, 331 };
        assertEquals(13245, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case38() {
        int yourScore = 78;
        int[] scores = { 85, 98, 4, 82, 96, 2, 7, 91, 26, 23, 22, 6, 78, 97, 17, 95, 20, 8, 11, 16, 5, 9, 14, 92, 25, 12, 87, 100, 86, 13, 0, 88, 84, 90, 3, 99, 94, 18, 10, 19, 27, 15, 21, 89, 1, 24, 93 };
        int[] numberOfTeams = { 208, 189, 200, 1, 194, 211, 189, 207, 182, 209, 189, 208, 216, 224, 203, 205, 192, 218, 200, 210, 215, 220, 211, 213, 191, 208, 239, 196, 208, 204, 351, 197, 1229, 221, 217, 179, 199, 208, 187, 210, 10339, 219, 190, 186, 202, 203, 202 };
        assertEquals(3268, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case39() {
        int yourScore = 52;
        int[] scores = { 79, 76, 16, 20, 11, 67, 60, 70, 9, 72, 69, 74, 5, 1, 59, 64, 75, 65, 4, 77, 68, 58, 56, 17, 3, 18, 52, 12, 73, 8, 66, 14, 63, 80, 0, 21, 78, 62, 2, 6, 10, 61, 7, 71, 19, 15, 13 };
        int[] numberOfTeams = { 204, 178, 238, 211, 206, 208, 200, 207, 218, 218, 213, 227, 219, 205, 224, 219, 213, 201, 206, 206, 258, 1322, 1, 177, 211, 213, 221, 196, 215, 242, 217, 197, 245, 4544, 430, 6588, 210, 192, 183, 230, 217, 208, 206, 219, 201, 198, 227 };
        assertEquals(9027, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case40() {
        int yourScore = 5;
        int[] scores = { 10, 11 };
        int[] numberOfTeams = { 1, 1 };
        assertEquals(2, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case41() {
        int yourScore = 5;
        int[] scores = { 9, 11 };
        int[] numberOfTeams = { 1, 1 };
        assertEquals(2, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case42() {
        int yourScore = 5;
        int[] scores = { 11, 9 };
        int[] numberOfTeams = { 1, 2 };
        assertEquals(2, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case43() {
        int yourScore = 5;
        int[] scores = { 11, 8 };
        int[] numberOfTeams = { 1, 1 };
        assertEquals(1, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case44() {
        int yourScore = 35686;
        int[] scores = { 29412, 24988, 26889, 89738, 19900, 82601, 69602, 18212, 58470, 64313, 45030, 48318, 560, 75343, 95281, 19889, 79554, 39663, 71327, 57387, 99430, 14019, 61842, 77536, 71922, 33892, 34499, 64640, 21382, 92320, 37999, 86059, 8195, 18812, 72063, 59450, 88061, 82444, 49873, 51164, 60593, 44724, 4061, 8891, 84990, 92660, 91705 };
        int[] numberOfTeams = { 49295, 48223, 99585, 83254, 82101, 33705, 25904, 89830, 34870, 57644, 94802, 40784, 27554, 62245, 77024, 56878, 43344, 69354, 80141, 40231, 62778, 43531, 85992, 37203, 52609, 64720, 1527, 3751, 43373, 99860, 39259, 70488, 20864, 91556, 49278, 48730, 49037, 56469, 90543, 88483, 20333, 83930, 18767, 72045, 20241, 27211, 60346 };
        assertEquals(1789844, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case45() {
        int yourScore = 22;
        int[] scores = { 38, 1, 0, 28, 43, 31, 45, 8, 19, 36, 10, 39, 30, 17, 37, 21, 40, 29, 32, 6, 4, 20, 7, 24, 26, 42, 33, 41, 14, 13, 15, 3, 23, 5, 16, 18, 25, 9, 11, 2, 27, 22, 44, 12, 46, 34, 35 };
        int[] numberOfTeams = { 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000 };
        assertEquals(1800001, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case46() {
        int yourScore = 124;
        int[] scores = { 130, 141, 112, 142, 101, 124, 127, 143, 111, 120, 135, 107, 119, 106, 131, 122, 146, 102, 125, 114, 140, 128, 134, 110, 132, 129, 145, 123, 136, 103, 115, 118, 147, 108, 109, 121, 138, 105, 133, 113, 104, 139, 116, 144, 137, 126, 117 };
        int[] numberOfTeams = { 72933, 80315, 43373, 83930, 11938, 23775, 55560, 38370, 26568, 92294, 88169, 20864, 62778, 90543, 40970, 14838, 82511, 55060, 82101, 83281, 16181, 48223, 41499, 27554, 94802, 31799, 29199, 88483, 91556, 52396, 70017, 99585, 70488, 85616, 23045, 64720, 25904, 28130, 83254, 78740, 49295, 74542, 72045, 39257, 9295, 28928, 20333 };
        assertEquals(990243, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case47() {
        int yourScore = 137;
        int[] scores = { 137, 138, 129, 102, 109, 108, 144, 106, 121, 141, 107, 146, 131, 134, 143, 113, 145, 119, 140, 132, 130, 122, 123, 111, 115, 128, 118, 127, 101, 112, 114, 126, 117, 103, 124, 105, 125, 133, 110, 136, 120, 139, 104, 116 };
        int[] numberOfTeams = { 42668, 40081, 45404, 74036, 37852, 58772, 36257, 1057, 81755, 96822, 88887, 12953, 71222, 72848, 25955, 5696, 8337, 43855, 83145, 3301, 24146, 7538, 30942, 46335, 31847, 87795, 89336, 37681, 59854, 32473, 90890, 28074, 85783, 79960, 81073, 23845, 91288, 57494, 37590, 1135, 51496, 32055, 149, 90327 };
        assertEquals(57548, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case48() {
        int yourScore = 11;
        int[] scores = { 5, 12, 17, 19, 99, 13, 15, 14 };
        int[] numberOfTeams = { 2, 4, 8, 2, 1, 3, 25, 3 };
        assertEquals(18, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case49() {
        int yourScore = 1;
        int[] scores = { 7, 1 };
        int[] numberOfTeams = { 2, 1 };
        assertEquals(1, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case50() {
        int yourScore = 43423;
        int[] scores = { 123, 878, 3245, 98768, 32173, 13188, 12317, 9653, 2178, 792, 993, 3348 };
        int[] numberOfTeams = { 55345, 123, 1, 45435, 5346, 7657, 65464, 23423, 54654, 9, 23432, 345 };
        assertEquals(45436, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

    @Test
    public void case51() {
        int yourScore = 11;
        int[] scores = { 5, 12, 17, 19, 99, 13, 15, 14 };
        int[] numberOfTeams = { 2732, 4533, 899, 2638, 1111, 3333, 2505, 3901 };
        assertEquals(3750, thefootballdivtwo.find(yourScore, scores, numberOfTeams));
    }

}
