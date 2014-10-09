package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class SpellCardsEasyTest {
    SpellCardsEasy spellcardseasy = new SpellCardsEasy();

    @Test
    public void case1() {
        int[] level = { 1, 1, 1 };
        int[] damage = { 10, 20, 30 };
        assertEquals(60, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case2() {
        int[] level = { 3, 3, 3 };
        int[] damage = { 10, 20, 30 };
        assertEquals(10, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case3() {
        int[] level = { 4, 4, 4 };
        int[] damage = { 10, 20, 30 };
        assertEquals(0, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case4() {
        int[] level = { 50, 1, 50, 1, 50 };
        int[] damage = { 10, 20, 30, 40, 50 };
        assertEquals(60, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case5() {
        int[] level = { 2, 1, 1 };
        int[] damage = { 40, 40, 10 };
        assertEquals(80, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case6() {
        int[] level = { 1, 2, 1, 1, 3, 2, 1 };
        int[] damage = { 10, 40, 10, 10, 90, 40, 10 };
        assertEquals(150, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case7() {
        int[] level = { 1, 2, 2, 3, 1, 4, 2 };
        int[] damage = { 113, 253, 523, 941, 250, 534, 454 };
        assertEquals(1577, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case8() {
        int[] level = { 1, 1, 2, 4 };
        int[] damage = { 804, 898, 733, 818 };
        assertEquals(2435, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case9() {
        int[] level = { 22, 14 };
        int[] damage = { 573, 572 };
        assertEquals(0, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case10() {
        int[] level = { 5, 31, 5, 9, 31, 20, 3, 20 };
        int[] damage = { 145, 356, 142, 514, 284, 639, 117, 377 };
        assertEquals(145, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case11() {
        int[] level = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] damage = { 770, 705, 708, 713, 794, 675, 720, 759, 738, 686 };
        assertEquals(7268, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case12() {
        int[] level = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] damage = { 330, 245, 203, 199, 369, 421, 60, 205, 376, 46, 114, 503, 404, 146, 498, 502, 186, 507, 344, 475, 520, 217, 188, 130, 422, 351, 110, 433, 83, 308, 196, 138, 228, 334, 240, 374, 349, 54, 198, 147, 353, 388, 72, 466 };
        assertEquals(12432, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case13() {
        int[] level = { 1, 3, 2 };
        int[] damage = { 95, 50, 61 };
        assertEquals(95, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case14() {
        int[] level = { 5, 6, 25, 5, 14, 3, 31, 14, 28, 1, 6, 28, 24, 18, 16, 18, 15, 9, 17, 27, 24, 7 };
        int[] damage = { 88, 109, 91, 106, 139, 112, 90, 127, 91, 133, 90, 121, 102, 108, 137, 127, 98, 109, 111, 132, 129, 112 };
        assertEquals(550, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case15() {
        int[] level = { 1, 1, 1, 2, 2, 2, 1, 1, 1, 1, 2, 2 };
        int[] damage = { 74, 48, 68, 50, 52, 36, 54, 69, 57, 69, 44, 57 };
        assertEquals(541, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case16() {
        int[] level = { 3 };
        int[] damage = { 146 };
        assertEquals(0, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case17() {
        int[] level = { 34, 32, 19, 8, 34, 6, 23, 18, 35, 33, 17, 8, 17, 19, 38, 38, 30, 3, 35, 10, 2, 20, 34, 32, 34, 3, 1, 13, 37, 30, 31, 2, 21, 31, 1, 22 };
        int[] damage = { 681, 524, 395, 321, 541, 384, 532, 565, 665, 529, 561, 545, 560, 493, 415, 617, 496, 684, 325, 460, 512, 389, 684, 677, 648, 320, 459, 576, 450, 596, 413, 572, 446, 416, 548, 631 };
        assertEquals(4025, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case18() {
        int[] level = { 11, 4, 13, 1, 1, 9, 13, 2, 2, 13, 6, 14, 11, 12, 2, 7, 6, 13, 9, 10, 5, 9, 2, 9, 2, 1, 4, 5, 10, 5, 13 };
        int[] damage = { 166, 563, 264, 264, 220, 342, 487, 185, 410, 374, 471, 415, 211, 210, 383, 453, 151, 299, 209, 278, 578, 398, 205, 175, 240, 216, 256, 428, 537, 352, 558 };
        assertEquals(3735, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case19() {
        int[] level = { 3, 12, 11, 10, 5, 12, 12, 7, 4, 2, 12, 2, 5, 6, 5, 6, 10, 7, 2, 3, 3, 1, 4, 7, 2, 9, 1, 11, 11, 6, 4, 11, 1, 10, 7, 8, 11, 7 };
        int[] damage = { 44, 79, 88, 87, 44, 84, 69, 39, 36, 45, 83, 65, 58, 53, 50, 75, 60, 79, 77, 75, 63, 59, 75, 72, 70, 87, 37, 42, 54, 51, 71, 65, 84, 39, 52, 86, 75, 63 };
        assertEquals(830, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case20() {
        int[] level = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] damage = { 18, 10, 16, 7, 6, 11, 6, 12, 7, 6, 17, 8, 18, 17, 6, 18, 9, 8, 12 };
        assertEquals(212, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case21() {
        int[] level = { 6, 7, 2, 3, 4, 6, 3, 6, 4, 3, 6, 2, 4, 5, 7, 4, 3, 6, 5, 7, 4, 5 };
        int[] damage = { 502, 503, 498, 503, 499, 497, 504, 504, 501, 497, 498, 503, 498, 497, 499, 503, 499, 502, 499, 498, 499, 497 };
        assertEquals(3507, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case22() {
        int[] level = { 19, 17, 6, 15, 23, 2, 18, 22, 29, 25, 9, 10, 24, 6, 6, 21, 10, 19, 5, 3, 9, 2, 25, 6, 21, 1, 1, 9, 22, 12, 13, 20 };
        int[] damage = { 209, 209, 206, 202, 218, 225, 201, 261, 189, 238, 220, 181, 252, 175, 222, 207, 234, 253, 241, 169, 233, 170, 252, 251, 199, 200, 225, 235, 194, 222, 217, 184 };
        assertEquals(1666, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case23() {
        int[] level = { 6, 5, 8, 6, 3, 12, 2, 2, 12, 5, 6, 2, 7, 2, 3, 11, 6, 12, 5, 11, 7, 10, 4, 12, 5, 1, 6, 4, 2, 11, 6, 1, 12, 7, 6, 11, 12, 7, 6, 12, 3, 3 };
        int[] damage = { 226, 106, 79, 63, 91, 59, 227, 218, 167, 70, 162, 176, 227, 121, 182, 67, 137, 114, 231, 107, 85, 162, 202, 121, 234, 197, 183, 157, 128, 149, 92, 172, 63, 185, 133, 75, 240, 136, 101, 203, 49, 156 };
        assertEquals(2562, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case24() {
        int[] level = { 1, 3, 2, 2, 4, 1, 2, 4, 4, 2 };
        int[] damage = { 174, 170, 163, 177, 164, 158, 152, 162, 163, 152 };
        assertEquals(842, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case25() {
        int[] level = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] damage = { 491, 549, 461, 574, 605, 662, 555, 650, 470, 608, 518, 551, 590, 556, 540, 658, 539, 602, 546, 647, 547, 585, 667, 540, 502, 637 };
        assertEquals(14850, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case26() {
        int[] level = { 1, 3, 1, 3, 1, 2, 3, 1, 2, 3, 3, 2, 1, 3, 1, 1, 1, 2, 3, 3, 3, 3, 3, 1, 1, 2, 3 };
        int[] damage = { 529, 548, 456, 482, 480, 424, 643, 529, 510, 500, 475, 535, 492, 494, 642, 451, 426, 481, 424, 463, 636, 508, 447, 620, 516, 522, 423 };
        assertEquals(9016, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case27() {
        int[] level = { 4, 5, 3, 5, 3, 5, 2 };
        int[] damage = { 399, 529, 322, 311, 488, 320, 331 };
        assertEquals(887, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case28() {
        int[] level = { 37, 8, 18, 20, 17, 6, 36, 14, 35, 1, 6, 32, 32, 22, 29, 15, 21, 36, 22, 34, 3, 18, 6, 32, 34, 7, 5, 36, 30, 13, 19, 21, 3, 26, 11, 33 };
        int[] damage = { 321, 319, 445, 387, 241, 460, 364, 231, 214, 435, 183, 274, 404, 72, 422, 336, 112, 60, 145, 340, 310, 117, 132, 235, 393, 431, 426, 231, 380, 129, 197, 402, 371, 376, 271, 114 };
        assertEquals(2509, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case29() {
        int[] level = { 2, 3, 1, 1, 2, 1, 1, 3, 3, 3, 2, 1, 1, 1, 1 };
        int[] damage = { 397, 468, 368, 393, 411, 438, 374, 411, 466, 453, 468, 467, 382, 379, 450 };
        assertEquals(4527, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case30() {
        int[] level = { 6, 1, 2, 2, 11, 1, 10, 1, 8, 4, 4, 1, 8, 3, 11, 12, 12, 13, 6, 1, 2, 8, 8, 1, 6, 9, 10, 5, 2, 7, 6, 5, 3, 1, 3, 13, 11, 12, 2 };
        int[] damage = { 466, 238, 154, 497, 426, 306, 663, 528, 180, 240, 233, 311, 407, 177, 272, 474, 169, 618, 625, 219, 416, 147, 766, 547, 437, 654, 628, 175, 446, 228, 611, 757, 710, 496, 432, 558, 178, 500, 765 };
        assertEquals(6710, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case31() {
        int[] level = { 3, 4, 3, 2, 5, 4, 2 };
        int[] damage = { 418, 474, 279, 492, 360, 496, 435 };
        assertEquals(966, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case32() {
        int[] level = { 3, 3, 3, 3, 2, 1, 2, 2, 3, 2, 2, 3 };
        int[] damage = { 881, 417, 155, 466, 392, 697, 417, 734, 840, 302, 539, 449 };
        assertEquals(3618, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case33() {
        int[] level = { 4, 6, 3, 5, 8, 7, 5, 6, 11, 6, 10, 12, 5, 2, 2, 10, 2, 8, 8, 5, 6, 1, 10, 3, 9, 12, 3, 1, 7, 1, 12, 11, 4, 1, 10 };
        int[] damage = { 117, 118, 72, 105, 90, 126, 107, 124, 99, 74, 121, 109, 94, 115, 78, 110, 98, 115, 95, 98, 73, 85, 111, 75, 102, 94, 77, 77, 117, 75, 70, 115, 119, 100, 101 };
        assertEquals(1211, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case34() {
        int[] level = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] damage = { 704, 703, 709, 707, 703, 707, 707, 706, 707, 704, 705, 705, 706, 709, 706, 709, 706, 705, 705, 705, 706, 706, 706, 704, 704, 709, 708, 704, 708, 709, 704, 707, 704, 703, 707, 708, 704, 705 };
        assertEquals(26824, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case35() {
        int[] level = { 8, 11, 11, 20, 12, 12, 3, 18, 16, 12, 20, 3, 14, 14, 4, 18, 8, 16, 16, 4, 10, 8, 19, 13, 7, 7, 13, 5, 5, 8, 7, 4, 15, 18, 7, 20, 13 };
        int[] damage = { 212, 549, 62, 626, 428, 381, 634, 597, 178, 471, 342, 125, 62, 463, 511, 377, 556, 603, 441, 27, 400, 658, 254, 404, 616, 39, 202, 504, 9, 676, 374, 615, 656, 282, 245, 577, 586 };
        assertEquals(3369, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case36() {
        int[] level = { 6, 2, 1, 5, 7, 3 };
        int[] damage = { 573, 563, 541, 547, 596, 546 };
        assertEquals(1104, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case37() {
        int[] level = { 11, 27, 4, 4, 13, 13, 5, 8, 28, 18, 15, 25, 15, 9, 26, 20, 17, 6, 3, 5, 24, 20, 17, 16, 13, 4, 1, 6, 13, 20, 27, 2 };
        int[] damage = { 557, 645, 587, 478, 291, 927, 502, 237, 754, 237, 601, 377, 253, 707, 767, 446, 739, 348, 525, 684, 642, 629, 686, 749, 783, 823, 332, 448, 864, 403, 432, 438 };
        assertEquals(3986, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case38() {
        int[] level = { 12, 3, 8, 3, 11, 11, 10, 11, 7, 10, 2, 2, 9, 1, 6, 8, 10, 5, 3, 5, 4, 8, 2, 9, 5, 6, 11, 11, 7, 8, 4, 9, 8, 2, 6, 7, 12, 8, 7, 10, 1, 6, 13, 1, 11, 1, 5, 3, 12 };
        int[] damage = { 884, 773, 922, 809, 917, 753, 803, 807, 768, 797, 920, 853, 790, 914, 929, 758, 804, 930, 873, 858, 771, 831, 835, 802, 904, 890, 837, 843, 857, 814, 874, 886, 905, 930, 770, 804, 789, 777, 904, 800, 817, 771, 834, 809, 909, 788, 873, 765, 896 };
        assertEquals(13809, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case39() {
        int[] level = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] damage = { 348, 198, 156, 183, 217, 255, 305, 267, 166, 232, 295, 169, 430, 255 };
        assertEquals(3476, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case40() {
        int[] level = { 5, 1, 5, 1, 1, 3, 1, 1, 5, 4, 4, 4, 3, 4, 3, 2, 3, 3, 5, 5, 5, 1, 3, 5, 4, 2, 1, 1, 1, 2, 4, 3, 1, 2, 4, 5, 2, 4, 5, 2, 2, 4, 5 };
        int[] damage = { 495, 486, 508, 488, 512, 489, 493, 482, 486, 515, 486, 516, 479, 514, 496, 512, 484, 479, 515, 484, 504, 504, 506, 481, 482, 489, 510, 511, 482, 503, 488, 506, 495, 506, 497, 494, 500, 517, 500, 483, 517, 514, 504 };
        assertEquals(11001, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case41() {
        int[] level = { 6, 27, 5, 8, 4, 31 };
        int[] damage = { 273, 222, 107, 225, 236, 278 };
        assertEquals(273, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case42() {
        int[] level = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] damage = { 211, 87, 89, 89, 189, 111, 136, 191, 224, 55, 193, 121, 201, 227, 224, 140, 198 };
        assertEquals(2686, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case43() {
        int[] level = { 27, 17, 6, 19, 6, 16, 16, 14, 24, 23, 6, 16, 4, 21, 12, 18, 9 };
        int[] damage = { 217, 414, 294, 113, 131, 179, 332, 139, 438, 329, 433, 453, 55, 124, 50, 302, 330 };
        assertEquals(727, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case44() {
        int[] level = { 5, 2, 1, 1, 2, 2 };
        int[] damage = { 392, 378, 322, 323, 349, 332 };
        assertEquals(1050, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case45() {
        int[] level = { 1, 1, 1 };
        int[] damage = { 178, 147, 149 };
        assertEquals(474, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case46() {
        int[] level = { 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] damage = { 331, 326, 342, 343, 327, 352, 333, 330, 348 };
        assertEquals(3032, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case47() {
        int[] level = { 1, 20, 8, 11, 11, 28, 17 };
        int[] damage = { 219, 481, 246, 273, 322, 205, 460 };
        assertEquals(219, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case48() {
        int[] level = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] damage = { 212, 136, 281, 203, 242, 217, 192, 90, 62, 95, 124, 196, 294, 97, 246, 97, 213, 68, 119, 177, 220, 111 };
        assertEquals(3692, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case49() {
        int[] level = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] damage = { 540, 515, 513, 525, 525, 525, 519, 552, 548, 525, 525, 537, 545, 551, 516, 512, 526, 513, 526, 534, 534, 516, 545, 533, 523, 545, 532, 524, 542 };
        assertEquals(15366, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case50() {
        int[] level = { 7, 10, 3, 3, 8, 6, 2, 6, 6, 6, 1, 1, 9, 9, 7, 7, 10, 2, 1, 5, 7, 9, 4, 10, 9, 7, 9, 8, 7, 4, 4, 10, 6, 7, 1, 8, 3 };
        int[] damage = { 502, 527, 583, 512, 460, 565, 426, 523, 545, 403, 550, 421, 400, 571, 563, 596, 571, 562, 626, 529, 436, 404, 412, 429, 568, 376, 535, 581, 421, 598, 471, 573, 565, 412, 425, 504, 491 };
        assertEquals(6342, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case51() {
        int[] level = { 1 };
        int[] damage = { 833 };
        assertEquals(833, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case52() {
        int[] level = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] damage = { 969, 968, 970, 963, 971, 965, 966, 966, 965, 970, 967, 966, 971, 966, 964, 965, 969, 970, 968, 963, 964, 966, 963, 969, 964, 971, 968, 964, 966, 966, 971, 965 };
        assertEquals(30939, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case53() {
        int[] level = { 29, 39, 34, 13, 34, 28, 13, 35, 28, 24, 22, 32, 30, 5, 5, 27, 29, 27, 21, 26, 2, 6, 24, 40, 11, 32, 1, 28, 25, 19 };
        int[] damage = { 166, 168, 168, 168, 168, 166, 166, 167, 168, 167, 167, 168, 167, 167, 166, 167, 166, 167, 166, 168, 167, 167, 166, 166, 167, 168, 168, 167, 166, 168 };
        assertEquals(837, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case54() {
        int[] level = { 2, 2, 1, 1, 2, 2, 2, 1, 1, 2, 1, 2, 2, 1, 1, 1, 1, 1, 2, 2, 2, 2, 1 };
        int[] damage = { 29, 51, 48, 37, 31, 37, 31, 48, 36, 26, 26, 26, 24, 33, 34, 52, 24, 38, 29, 43, 48, 44, 26 };
        assertEquals(629, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case55() {
        int[] level = { 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] damage = { 849, 678, 552, 394, 746, 628, 252, 370 };
        assertEquals(4469, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case56() {
        int[] level = { 3, 5, 1, 1, 3, 6, 1, 3, 6, 7, 1, 6, 1, 5, 7, 5, 7, 1, 7, 4, 4, 4, 1, 7, 5, 7, 2, 4, 3, 2, 7, 1, 7, 2, 6, 5, 4, 7, 2 };
        int[] damage = { 243, 250, 262, 288, 271, 260, 283, 269, 292, 245, 275, 252, 251, 282, 234, 240, 284, 267, 287, 235, 272, 259, 253, 258, 249, 279, 275, 266, 275, 292, 229, 242, 270, 254, 274, 275, 290, 263, 249 };
        assertEquals(4813, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case57() {
        int[] level = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] damage = { 270, 296, 246, 124, 222, 124, 183, 166, 75, 108, 191, 125, 103, 113, 76, 151, 272, 218, 161, 118, 213, 211, 73, 96, 213, 72, 80, 177, 104, 247, 110, 270, 148, 295, 151, 288, 208, 257, 223, 299, 230, 243, 271, 263, 280, 158, 302, 86, 240, 101 };
        assertEquals(9251, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case58() {
        int[] level = { 1, 1, 3, 2, 3, 2, 2, 1, 1, 3, 3, 1, 3, 2, 3, 3, 3, 3, 3, 2, 2, 1, 2, 3, 2, 2, 1, 2, 2, 3, 1, 2, 1, 2, 3, 3, 3, 1, 2 };
        int[] damage = { 44, 26, 56, 34, 60, 43, 55, 46, 58, 64, 52, 35, 17, 27, 40, 86, 77, 92, 80, 78, 85, 83, 24, 79, 25, 51, 14, 79, 36, 67, 21, 13, 86, 21, 35, 72, 41, 64, 30 };
        assertEquals(1316, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case59() {
        int[] level = { 4, 3, 2, 2, 1 };
        int[] damage = { 438, 443, 114, 113, 540 };
        assertEquals(983, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case60() {
        int[] level = { 1, 3, 3, 1, 2 };
        int[] damage = { 174, 408, 208, 327, 298 };
        assertEquals(909, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case61() {
        int[] level = { 2, 3, 4, 2, 2, 3, 3, 1, 4, 2, 2, 4, 3, 2, 1, 2, 2, 3, 1, 3, 1, 2, 4, 4, 2, 3 };
        int[] damage = { 477, 513, 481, 609, 554, 474, 493, 616, 582, 458, 617, 529, 509, 593, 450, 629, 503, 605, 609, 592, 612, 632, 622, 556, 458, 558 };
        assertEquals(7974, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case62() {
        int[] level = { 3, 5, 5, 1, 1, 5, 1, 5, 2, 2, 1, 3, 2, 3, 5, 3, 5, 4, 1, 3, 5 };
        int[] damage = { 493, 529, 512, 503, 541, 509, 499, 549, 502, 528, 517, 508, 550, 495, 494, 515, 553, 548, 520, 512, 522 };
        assertEquals(5215, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case63() {
        int[] level = { 1, 1 };
        int[] damage = { 191, 358 };
        assertEquals(549, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case64() {
        int[] level = { 1, 1, 2, 2, 2, 2, 2, 2, 1, 2, 1, 2, 2, 2, 1, 1, 2, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 1, 2, 1, 2, 1, 1, 2, 1, 2, 2, 2, 1, 1, 1, 1, 2, 2, 2, 2 };
        int[] damage = { 48, 50, 52, 44, 50, 37, 43, 51, 40, 43, 41, 41, 42, 42, 48, 43, 47, 41, 39, 49, 46, 48, 39, 49, 51, 50, 38, 47, 42, 52, 37, 43, 43, 45, 47, 48, 44, 44, 51, 43, 38, 44, 38, 43, 45, 45, 38 };
        assertEquals(1514, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case65() {
        int[] level = { 14, 1, 19, 6, 3, 10, 4, 28, 24, 18, 5, 15, 29, 13 };
        int[] damage = { 690, 473, 748, 788, 590, 534, 502, 610, 489, 580, 661, 761, 774, 759 };
        assertEquals(1851, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case66() {
        int[] level = { 1 };
        int[] damage = { 113 };
        assertEquals(113, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case67() {
        int[] level = { 6, 5, 12, 28, 13, 23, 31, 6, 24, 31, 20 };
        int[] damage = { 141, 116, 318, 339, 309, 374, 333, 390, 302, 126, 407 };
        assertEquals(257, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case68() {
        int[] level = { 3, 3, 3, 3, 3, 2, 2, 2, 1, 2, 1, 3, 1, 3, 2, 1, 3, 1, 3, 2, 3, 1, 1, 1, 1, 2, 3 };
        int[] damage = { 493, 378, 597, 303, 634, 632, 645, 352, 701, 648, 428, 552, 473, 259, 713, 502, 763, 594, 594, 630, 723, 427, 558, 368, 307, 381, 655 };
        assertEquals(9172, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case69() {
        int[] level = { 1, 1, 1, 1 };
        int[] damage = { 709, 846, 786, 716 };
        assertEquals(3057, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case70() {
        int[] level = { 1, 1, 2, 1, 2, 2, 1, 2, 2, 1, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 2 };
        int[] damage = { 364, 358, 367, 341, 350, 378, 331, 358, 335, 332, 349, 335, 367, 352, 362, 334, 374, 360, 340, 331, 345, 367, 385, 330, 371, 364, 340, 375, 358, 377, 345, 368, 350, 354, 354, 334, 352, 353, 355, 386, 352, 336, 374, 351, 377, 356, 359, 367 };
        assertEquals(12553, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case71() {
        int[] level = { 1, 2, 1, 1 };
        int[] damage = { 243, 307, 356, 241 };
        assertEquals(906, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case72() {
        int[] level = { 43, 37, 12, 1, 33, 37, 5, 25, 13, 35, 25, 36, 31, 19, 44, 16, 1, 29, 30, 27, 35, 39, 13, 18, 14, 30, 13, 23, 19, 3, 44, 32, 27, 9, 11, 34, 43, 41, 31, 31, 1, 28, 39, 43, 17, 17, 9, 2 };
        int[] damage = { 228, 295, 172, 331, 176, 129, 328, 156, 318, 54, 227, 70, 116, 243, 274, 16, 299, 41, 87, 218, 156, 123, 314, 209, 75, 195, 210, 283, 283, 152, 39, 193, 74, 86, 280, 251, 26, 339, 209, 319, 143, 19, 25, 66, 282, 29, 76, 339 };
        assertEquals(1905, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case73() {
        int[] level = { 4 };
        int[] damage = { 549 };
        assertEquals(0, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case74() {
        int[] level = { 1, 4, 5, 5, 5, 5, 2, 2, 4, 5, 1, 4, 3, 5, 2, 4, 2, 5, 3, 1, 3, 2, 3, 5, 5, 5, 1, 5, 2, 5, 4, 1, 5, 2, 1, 1, 3, 2, 2, 2, 5, 1, 2, 3, 2, 4, 3, 3, 1, 4 };
        int[] damage = { 36, 31, 20, 19, 22, 35, 13, 18, 35, 27, 26, 37, 22, 28, 37, 13, 10, 27, 33, 9, 18, 19, 32, 14, 34, 23, 19, 37, 35, 26, 23, 25, 22, 29, 22, 11, 26, 15, 30, 9, 17, 21, 15, 36, 16, 9, 33, 33, 19, 23 };
        assertEquals(628, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case75() {
        int[] level = { 5, 1, 3, 5, 2, 4 };
        int[] damage = { 46, 43, 220, 37, 37, 243 };
        assertEquals(263, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case76() {
        int[] level = { 1, 2, 2 };
        int[] damage = { 801, 509, 486 };
        assertEquals(1310, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case77() {
        int[] level = { 2, 3, 3, 1, 1, 2, 3, 3 };
        int[] damage = { 440, 115, 174, 233, 123, 183, 119, 246 };
        assertEquals(1030, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case78() {
        int[] level = { 6, 7, 14, 15, 13, 12, 7, 12, 8, 4, 10, 13, 7, 6, 6, 1, 9, 10, 10, 9, 5, 1, 7, 6, 4, 14, 8, 2, 7, 1, 5, 10, 6 };
        int[] damage = { 217, 228, 223, 213, 217, 212, 250, 257, 224, 229, 239, 240, 251, 242, 243, 249, 234, 237, 257, 213, 238, 220, 217, 212, 226, 246, 217, 241, 243, 244, 237, 250, 249 };
        assertEquals(2131, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case79() {
        int[] level = { 22, 17, 22, 48, 35, 1, 29, 8, 14, 3, 30, 13, 21, 24, 5, 40, 6, 2, 37, 23, 39, 35, 13, 17, 27, 23 };
        int[] damage = { 62, 55, 64, 56, 62, 58, 46, 60, 55, 50, 62, 48, 57, 61, 51, 59, 50, 63, 48, 62, 45, 63, 49, 51, 61, 43 };
        assertEquals(282, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case80() {
        int[] level = { 4, 2, 4, 2, 5, 3, 4, 5, 2, 4, 2, 5, 3, 4, 5, 2, 2, 5, 2, 1, 2, 4, 2, 1, 2, 5, 3, 3, 5, 2, 3 };
        int[] damage = { 141, 101, 121, 114, 117, 131, 142, 114, 114, 128, 120, 106, 92, 97, 140, 91, 111, 137, 139, 144, 115, 94, 137, 124, 144, 90, 145, 91, 96, 119, 100 };
        assertEquals(1845, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case81() {
        int[] level = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] damage = { 234, 227, 225, 229, 226, 223, 248, 252, 228, 245, 241, 226, 229, 234, 231, 223, 240, 218, 239, 219, 243, 253, 248, 225, 252, 237, 244, 232, 229, 248, 244, 242, 241, 248, 218, 249, 228, 246, 251, 232, 240, 227, 230 };
        assertEquals(10144, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case82() {
        int[] level = { 3, 5, 1, 4, 1, 3, 2, 2, 4, 2, 3, 3, 5, 4, 1 };
        int[] damage = { 292, 254, 246, 341, 319, 416, 321, 346, 346, 393, 406, 256, 324, 427, 375 };
        assertEquals(2708, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case83() {
        int[] level = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] damage = { 530, 592, 660, 723, 725, 659, 758, 635, 580, 682, 404, 715, 604, 608, 392, 417, 386, 403, 572, 490, 546, 598, 460, 469, 527, 764, 574, 481, 488, 418, 469, 792, 488, 429, 733, 536, 669, 425, 378, 494, 456, 612, 705 };
        assertEquals(24046, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case84() {
        int[] level = { 1, 2, 1, 2, 1, 2, 1, 2, 2, 1, 2, 1, 2, 1, 1 };
        int[] damage = { 718, 395, 900, 575, 297, 160, 935, 663, 785, 781, 468, 844, 850, 632, 385 };
        assertEquals(7712, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case85() {
        int[] level = { 3, 3, 2, 4, 4, 1, 1, 6, 2, 3, 1, 6, 3, 4, 10, 6, 6, 8, 7, 4, 3, 8, 10, 10, 3, 3, 9, 2, 5, 4, 8, 8, 4, 1, 2, 3, 2, 1, 1, 10, 9, 2, 4, 5, 8, 6, 9, 9, 2, 4 };
        int[] damage = { 437, 821, 703, 792, 777, 804, 802, 619, 809, 640, 921, 490, 870, 431, 681, 644, 480, 909, 607, 335, 854, 761, 698, 581, 362, 919, 659, 240, 913, 567, 498, 877, 406, 839, 898, 436, 281, 552, 314, 737, 456, 831, 444, 732, 652, 658, 321, 421, 360, 386 };
        assertEquals(15292, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case86() {
        int[] level = { 1, 1, 1, 1, 3, 3, 2, 3, 3, 1, 3, 3, 1, 3, 2, 2, 2, 1, 1, 3, 2, 2, 2, 2, 1, 3, 1, 3, 2, 2, 3, 3, 1, 2, 3, 1, 2, 1, 1, 1, 1, 3, 2, 1, 1, 2 };
        int[] damage = { 456, 454, 452, 482, 459, 432, 434, 421, 433, 466, 483, 408, 486, 444, 412, 475, 448, 456, 419, 457, 479, 435, 459, 460, 432, 482, 418, 451, 428, 470, 418, 486, 445, 413, 415, 451, 409, 480, 421, 485, 446, 485, 424, 484, 472, 458 };
        assertEquals(14071, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case87() {
        int[] level = { 2, 2, 2, 1, 2, 5, 5, 4, 1, 3, 3, 3, 5, 4, 5, 1, 1, 4, 5, 4, 5, 2, 1, 2, 2, 2, 2, 3, 1, 5 };
        int[] damage = { 475, 476, 474, 474, 475, 474, 472, 473, 475, 475, 471, 475, 471, 471, 473, 474, 473, 474, 476, 471, 472, 473, 472, 472, 475, 472, 474, 474, 473, 473 };
        assertEquals(7587, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case88() {
        int[] level = { 3, 3, 2, 2, 1, 1, 2, 1, 1, 1, 1, 1, 3, 1, 2, 3, 3, 3, 2, 1, 3, 2, 1, 3, 2, 1, 1, 3, 3, 3, 1, 1, 2, 2, 3, 2, 1, 3, 2, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] damage = { 506, 121, 267, 107, 260, 338, 440, 157, 329, 642, 947, 759, 884, 975, 516, 703, 332, 258, 239, 382, 586, 35, 138, 172, 898, 744, 112, 512, 700, 12, 23, 707, 286, 554, 319, 917, 705, 926, 773, 70, 169, 212, 173, 356, 69, 869, 396 };
        assertEquals(17291, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case89() {
        int[] level = { 1, 1, 2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 2 };
        int[] damage = { 885, 741, 826, 718, 835, 770, 759, 730, 902, 882, 851, 679, 840, 885, 763, 836, 866, 923, 815, 734, 798, 701, 785 };
        assertEquals(14571, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case90() {
        int[] level = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] damage = { 444, 418, 172, 61, 401, 39, 474, 456, 56, 432, 107, 456, 81, 154, 19, 404, 407, 371, 325, 168, 135, 303, 458, 234, 200, 291, 436, 179, 327, 119, 130, 41, 202, 337, 308, 165, 454, 253 };
        assertEquals(10017, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case91() {
        int[] level = { 3, 1, 3, 3, 4, 3, 3, 3, 3, 2, 2, 3, 4, 1, 1, 4, 3, 2, 3, 3, 5, 1, 3, 2, 1, 5, 4, 3, 2, 3, 5, 5, 4, 3, 2, 2, 4, 5, 3, 2, 3, 1, 5, 2, 5, 2, 5, 2, 4, 2 };
        int[] damage = { 336, 308, 369, 483, 357, 468, 455, 433, 288, 434, 382, 480, 391, 451, 321, 406, 297, 391, 346, 291, 453, 496, 460, 385, 306, 360, 295, 377, 439, 389, 413, 400, 448, 383, 297, 464, 406, 372, 308, 362, 449, 430, 433, 458, 329, 356, 391, 312, 428, 330 };
        assertEquals(9844, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case92() {
        int[] level = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] damage = { 461, 491, 418, 389, 346, 415, 353, 370, 418, 441, 468, 444, 449, 452, 500, 451, 385, 368, 393 };
        assertEquals(8012, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case93() {
        int[] level = { 1, 2, 2 };
        int[] damage = { 540, 672, 454 };
        assertEquals(1212, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case94() {
        int[] level = { 21, 1, 10, 7, 5, 14, 16, 24, 12, 1, 23, 13, 14, 6, 17, 19, 22, 17, 20, 18, 2, 7, 20, 15, 18, 21 };
        int[] damage = { 818, 542, 530, 795, 452, 392, 519, 532, 568, 719, 592, 460, 748, 836, 837, 385, 828, 563, 560, 524, 757, 574, 800, 708, 434, 542 };
        assertEquals(4101, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case95() {
        int[] level = { 32, 21, 14, 26, 16, 30, 15, 32, 24, 11, 2, 2, 14, 20, 11, 17, 28, 18, 27 };
        int[] damage = { 732, 566, 491, 464, 678, 765, 765, 637, 774, 667, 777, 550, 509, 773, 778, 797, 750, 523, 651 };
        assertEquals(1327, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case96() {
        int[] level = { 1, 1, 4, 3, 4, 1, 5, 4, 2, 2, 2, 2, 5, 2, 3, 2, 1, 2, 3, 4, 3, 3, 3, 1, 3, 3, 1, 1, 1, 4, 4, 4 };
        int[] damage = { 224, 382, 352, 293, 261, 274, 336, 331, 242, 361, 217, 285, 355, 253, 384, 246, 284, 283, 347, 264, 380, 375, 378, 342, 368, 255, 347, 285, 351, 215, 367, 242 };
        assertEquals(5458, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case97() {
        int[] level = { 1, 3, 3 };
        int[] damage = { 850, 855, 666 };
        assertEquals(850, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case98() {
        int[] level = { 2, 2, 1, 1, 1, 2, 2, 2 };
        int[] damage = { 611, 578, 664, 584, 399, 590, 465, 529 };
        assertEquals(3027, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case99() {
        int[] level = { 2, 3, 2, 1, 3, 4, 3, 5, 5, 4, 1, 3, 4, 5, 5, 1, 2, 3, 2, 3, 1, 2, 1, 2, 2, 3, 1, 3, 4, 3, 2, 5, 2, 1, 1, 3, 3, 1, 4, 4, 2, 5, 1, 4, 1, 3, 2, 1 };
        int[] damage = { 127, 122, 122, 121, 121, 121, 120, 127, 119, 124, 118, 118, 116, 117, 115, 117, 122, 124, 116, 125, 126, 120, 126, 115, 122, 122, 125, 123, 115, 123, 119, 126, 123, 123, 122, 119, 117, 116, 116, 116, 124, 122, 121, 121, 120, 116, 127, 127 };
        assertEquals(3292, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case100() {
        int[] level = { 2, 2, 2, 3, 3, 1, 3, 1, 3, 2, 1, 2, 1, 2, 3, 2, 1, 3, 2 };
        int[] damage = { 488, 517, 694, 651, 797, 112, 788, 353, 646, 117, 840, 722, 694, 520, 846, 404, 838, 770, 413 };
        assertEquals(7060, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case101() {
        int[] level = { 5, 9, 4, 1, 1, 15, 1, 16, 11, 1, 1, 6, 3, 11, 14, 3, 11, 12, 12, 8, 2, 7, 2, 9, 12, 14, 10, 14, 12, 13, 13, 15, 13, 2, 10, 11, 16, 8 };
        int[] damage = { 638, 579, 592, 559, 534, 670, 611, 501, 528, 582, 650, 627, 577, 584, 626, 580, 641, 663, 663, 608, 531, 523, 514, 533, 612, 519, 540, 547, 510, 618, 530, 590, 575, 522, 564, 598, 518, 635 };
        assertEquals(7611, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case102() {
        int[] level = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] damage = { 102, 58, 125, 36, 125, 129, 53, 119, 133, 36, 52, 58, 64, 98, 121, 75, 86, 78, 72, 57, 91, 129, 75, 70, 32, 62, 30, 133, 133, 113 };
        assertEquals(2545, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case103() {
        int[] level = { 2, 2, 1, 2, 3, 1, 4, 1, 1, 2, 2, 4, 2, 3, 2, 1, 1, 3, 1, 1, 2, 2, 4, 2, 2, 2, 2, 3, 2, 4, 3, 2, 4, 4 };
        int[] damage = { 317, 263, 849, 514, 788, 275, 358, 327, 769, 421, 785, 465, 708, 260, 427, 321, 854, 640, 362, 777, 267, 666, 305, 547, 506, 696, 676, 227, 691, 799, 796, 863, 314, 386 };
        assertEquals(12425, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case104() {
        int[] level = { 1, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 2, 2, 2, 1, 1, 1, 2, 2, 2, 2, 1, 1, 1, 2, 2, 2, 2, 2, 1, 1 };
        int[] damage = { 863, 776, 888, 806, 811, 956, 850, 876, 942, 781, 779, 850, 779, 854, 940, 911, 872, 946, 882, 914, 808, 802, 821, 861, 919, 845, 867, 912, 791, 946, 864, 871, 934, 827, 797, 872, 777, 893, 956, 822, 932, 834 };
        assertEquals(28069, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case105() {
        int[] level = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] damage = { 527, 508, 722, 704, 610, 555, 516, 601, 511, 644, 554, 718, 657, 647 };
        assertEquals(8474, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case106() {
        int[] level = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] damage = { 11, 28, 33, 62, 47, 74, 10, 56, 14, 83, 65, 66, 24, 20, 71, 88, 32, 88, 17, 69, 36, 89, 64 };
        assertEquals(1147, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case107() {
        int[] level = { 1, 1, 1, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 2, 1, 1, 1 };
        int[] damage = { 54, 127, 64, 129, 80, 49, 51, 86, 106, 67, 59, 104, 92, 39, 67, 73, 136, 122, 71, 131, 69, 132, 65, 94 };
        assertEquals(1839, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case108() {
        int[] level = { 38, 48, 26, 21, 42, 19, 16, 27, 31, 46, 22, 4, 31, 6, 34, 33, 17, 14, 19, 18, 36, 7, 15, 32, 45, 2, 29, 44, 35, 42, 39, 36, 35, 16, 4, 8, 36, 43, 29, 47, 17, 10, 34, 16, 30, 42, 15, 27, 5, 49 };
        int[] damage = { 685, 906, 8933, 6663, 8118, 2150, 6717, 527, 3530, 2261, 8439, 6104, 2377, 3547, 8422, 3822, 7187, 345, 7008, 2186, 8255, 7544, 1022, 281, 7352, 6435, 1870, 5986, 5658, 8437, 4091, 7537, 4635, 4416, 513, 6109, 9878, 6195, 2951, 9521, 1004, 1346, 1359, 4709, 3363, 895, 808, 9123, 4958, 4676 };
        assertEquals(36456, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case109() {
        int[] level = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 1, 3, 4, 5, 6, 7, 8, 9, 10, 1, 1, 3, 4, 5, 6, 7, 8, 9, 10, 1, 1, 3, 4, 5, 6, 7, 8, 9, 10, 1, 1, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] damage = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 1, 3, 4, 5, 6, 7, 8, 9, 10, 1, 1, 3, 4, 5, 6, 7, 8, 9, 10, 1, 1, 3, 4, 5, 6, 7, 8, 9, 10, 1, 1, 3, 4, 5, 6, 7, 8, 9, 10 };
        assertEquals(50, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case110() {
        int[] level = { 2, 1, 1 };
        int[] damage = { 40, 40, 10 };
        assertEquals(80, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case111() {
        int[] level = { 1, 2, 2, 3, 1, 4, 2, 4, 6, 6, 32, 35, 1 };
        int[] damage = { 113, 253, 523, 941, 250, 534, 454, 1234, 21, 9786, 943, 113, 253 };
        assertEquals(3317, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case112() {
        int[] level = { 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1 };
        int[] damage = { 500, 500, 100, 500, 500, 100, 500, 500, 100, 500, 500, 100, 500, 500, 100, 500, 500, 100, 500, 500, 100, 500, 500, 100, 500, 500, 100, 500, 500, 100, 500, 500, 100, 500, 500, 100, 500, 500, 100, 500, 500, 100, 500, 500, 100 };
        assertEquals(15000, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case113() {
        int[] level = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] damage = { 113, 253, 523, 941, 250, 534, 4541, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(7198, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case114() {
        int[] level = { 1, 2, 2, 3, 1, 4, 2 };
        int[] damage = { 113, 253, 523, 941, 250, 534, 454 };
        assertEquals(1577, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case115() {
        int[] level = { 1, 2, 1, 1, 2, 3, 1, 2, 3, 1, 1, 2, 1, 1, 2, 3, 1, 2, 3, 1, 1, 2, 1, 1, 2, 3, 1, 2, 3, 1, 1, 2, 1, 1, 2, 3, 1, 2, 3, 1, 1, 2, 1, 1, 2, 3, 1, 2, 3, 1 };
        int[] damage = { 113, 253, 523, 941, 250, 534, 454, 1, 22, 5, 113, 253, 523, 941, 250, 534, 454, 1, 22, 5, 113, 253, 523, 941, 250, 534, 454, 1, 22, 5, 113, 253, 523, 941, 250, 534, 454, 1, 22, 5, 113, 1, 1000, 941, 250, 534, 454, 1, 22, 5 };
        assertEquals(15225, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case116() {
        int[] level = { 3, 3, 3 };
        int[] damage = { 10, 20, 30 };
        assertEquals(10, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case117() {
        int[] level = { 4, 1, 1, 1 };
        int[] damage = { 2, 1, 1, 1 };
        assertEquals(3, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case118() {
        int[] level = { 2, 3, 4, 2, 3, 4, 5, 6, 7, 4, 3, 2, 4, 3, 2, 3, 4, 43, 4, 3, 4, 5, 7, 5, 2, 1, 3, 2, 1, 2, 4, 3, 1, 2, 3, 2, 3, 4, 3, 2, 3, 4, 2, 3, 4, 3, 2, 3, 4 };
        int[] damage = { 1, 3, 4, 323, 52, 346, 23, 23, 4, 234, 234, 2, 2, 34, 25, 3, 2, 1, 3, 5, 3, 45, 3, 23, 4, 32, 643, 23, 235, 32, 32, 1, 3, 2, 4, 3, 2, 3, 4, 32, 3, 2, 5, 7, 4, 3, 7, 4, 3 };
        assertEquals(2346, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case119() {
        int[] level = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] damage = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
        assertEquals(5000, spellcardseasy.maxDamage(level, damage));
    }

    @Test
    public void case120() {
        int[] level = { 2, 1, 1 };
        int[] damage = { 100, 90, 1 };
        assertEquals(190, spellcardseasy.maxDamage(level, damage));
    }

}
