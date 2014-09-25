package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class PrimalUnlicensedCreaturesTest {
    PrimalUnlicensedCreatures primalunlicensedcreatures = new PrimalUnlicensedCreatures();

    @Test
    public void case1() {
        int initialLevel = 31;
        int[] grezPower = { 10, 20, 30 };
        assertEquals(3, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case2() {
        int initialLevel = 20;
        int[] grezPower = { 24, 5, 6, 38 };
        assertEquals(3, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case3() {
        int initialLevel = 20;
        int[] grezPower = { 3, 3, 3, 3, 3, 1, 25 };
        assertEquals(6, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case4() {
        int initialLevel = 4;
        int[] grezPower = { 3, 13, 6, 4, 9 };
        assertEquals(5, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case5() {
        int initialLevel = 7;
        int[] grezPower = { 7, 8, 9, 10 };
        assertEquals(0, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case6() {
        int initialLevel = 713;
        int[] grezPower = { 794, 857, 149, 857, 663, 49 };
        assertEquals(6, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case7() {
        int initialLevel = 423;
        int[] grezPower = { 351, 891, 95, 526, 387, 756, 717, 415, 904, 541, 543, 77, 456, 912, 822, 70, 167, 542, 337, 38, 876, 463, 765, 550, 614, 580, 753, 80 };
        assertEquals(28, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case8() {
        int initialLevel = 32;
        int[] grezPower = { 127, 818, 146, 275, 340, 651, 647, 105, 211, 863, 6, 613, 182, 833, 127, 145, 184, 402, 786, 740, 82, 674, 309, 872, 108, 197 };
        assertEquals(1, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case9() {
        int initialLevel = 112;
        int[] grezPower = { 621, 268, 33, 874, 107, 876, 388, 595, 386, 342, 471, 488, 75, 437, 53, 461, 21, 323, 941, 863, 77, 903, 550, 272, 991, 219, 118 };
        assertEquals(27, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case10() {
        int initialLevel = 653;
        int[] grezPower = { 856, 647, 67, 375, 507, 57, 175, 577, 922, 550, 389, 995, 874, 738, 820, 961, 492, 88, 818, 269, 601, 170, 543, 508, 174, 875, 37, 290, 670, 82, 110, 593, 351, 514, 619, 205, 544, 637, 989, 261, 677, 100, 579 };
        assertEquals(43, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case11() {
        int initialLevel = 837;
        int[] grezPower = { 303, 853, 78, 768, 546, 385, 780, 100, 455, 585, 143, 792, 372, 557, 360, 849, 255, 304, 3, 835, 546, 646, 59, 811, 69, 8, 499, 966, 473, 423, 397, 147, 232, 929, 927, 209, 760, 192, 74, 569, 316, 926 };
        assertEquals(42, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case12() {
        int initialLevel = 498;
        int[] grezPower = { 511, 664, 108, 16, 595, 295, 170, 252, 996, 482, 217, 291, 288, 153, 414, 626, 334, 350, 639, 827, 350, 131, 837, 904, 407, 913, 732, 919, 87, 908, 79, 533, 692, 486, 935, 635, 866, 711, 454, 179, 728, 320, 851, 78, 648, 271, 435 };
        assertEquals(47, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case13() {
        int initialLevel = 719;
        int[] grezPower = { 138, 2, 40, 851, 164, 542, 585 };
        assertEquals(7, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case14() {
        int initialLevel = 749;
        int[] grezPower = { 82, 329, 918, 625, 432, 433, 992 };
        assertEquals(7, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case15() {
        int initialLevel = 683;
        int[] grezPower = { 295, 309, 111, 475, 273, 314, 509, 460, 356, 159, 922, 933, 735, 521 };
        assertEquals(14, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case16() {
        int initialLevel = 289;
        int[] grezPower = { 576, 49, 225, 196, 256, 625, 676, 100, 324, 100, 169, 961, 4, 784, 121, 289, 49, 25, 9, 225, 100, 25, 400, 4, 16, 361, 16, 81, 196, 25, 1, 16, 64, 361, 81, 49, 324, 729, 441, 81, 676, 16, 361, 900, 100, 81, 729, 196, 81 };
        assertEquals(49, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case17() {
        int initialLevel = 256;
        int[] grezPower = { 289, 1, 625, 841, 64, 25, 841, 484, 49, 289, 169, 576, 400, 484, 900, 841, 225, 169, 900, 484, 961 };
        assertEquals(21, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case18() {
        int initialLevel = 529;
        int[] grezPower = { 16, 81, 841, 144, 676, 4, 400, 400, 841, 289, 289, 441, 4, 1, 361, 144, 529, 625, 256, 121, 225, 64, 49, 576, 256, 324, 729, 169, 64 };
        assertEquals(29, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case19() {
        int initialLevel = 4;
        int[] grezPower = { 576, 625, 49, 256, 441, 324, 625, 961, 225, 729, 9, 25, 9, 169, 441, 4, 25, 289, 196, 576, 36, 361, 169, 64, 441, 900, 100, 169, 81, 144, 9, 256, 784, 729, 16, 625, 784, 81, 121, 49, 729, 121, 841, 484, 144, 4 };
        assertEquals(0, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case20() {
        int initialLevel = 16;
        int[] grezPower = { 900, 64, 121, 841, 121, 676, 676 };
        assertEquals(0, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case21() {
        int initialLevel = 121;
        int[] grezPower = { 36, 729, 625, 64, 900, 625, 1, 100 };
        assertEquals(4, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case22() {
        int initialLevel = 625;
        int[] grezPower = { 81, 144, 361, 361, 4, 961, 1, 169, 484, 16, 64, 25, 36, 841, 9, 169, 49, 225, 676, 64, 784, 729, 225, 196, 324, 441, 324, 784, 576, 64, 25, 225, 961, 64, 9, 100, 324, 225, 25, 676, 9, 169, 169 };
        assertEquals(43, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case23() {
        int initialLevel = 1;
        int[] grezPower = { 81, 121, 576, 144, 121, 64, 256, 576, 169, 400, 625, 900, 576, 25, 144 };
        assertEquals(0, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case24() {
        int initialLevel = 289;
        int[] grezPower = { 4, 400, 256, 576, 900, 729, 324, 4, 841, 289, 121, 529, 529, 256, 36, 100 };
        assertEquals(16, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case25() {
        int initialLevel = 49;
        int[] grezPower = { 361, 324, 64, 64, 225, 361, 4, 4, 25, 256, 400, 324, 400, 961, 289 };
        assertEquals(5, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case26() {
        int initialLevel = 64;
        int[] grezPower = { 343, 512, 343, 27, 27, 27, 64, 512, 343, 343, 1 };
        assertEquals(5, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case27() {
        int initialLevel = 1;
        int[] grezPower = { 64, 512, 8, 729, 343, 216, 27, 216, 1, 729, 27, 729, 343, 216, 512 };
        assertEquals(0, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case28() {
        int initialLevel = 64;
        int[] grezPower = { 216, 343, 343, 125, 64, 64, 64, 27, 729, 8, 216, 729, 512, 512, 512, 125, 1, 1, 729, 125, 64, 216, 27, 8, 343, 64, 729, 729, 64, 64, 343, 216, 27 };
        assertEquals(33, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case29() {
        int initialLevel = 125;
        int[] grezPower = { 27, 343, 27, 27, 125, 343, 8, 125, 27, 729, 729, 27 };
        assertEquals(8, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case30() {
        int initialLevel = 216;
        int[] grezPower = { 729, 27, 125, 8, 216, 1, 8, 8, 8, 27, 64, 512, 729, 1, 343, 1, 125, 343, 343, 343, 512, 27, 8, 8, 27, 729, 216, 512, 216, 729, 27, 64, 1, 27, 8, 1, 125, 64, 216, 216, 512, 27, 125, 512, 64, 125 };
        assertEquals(46, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case31() {
        int initialLevel = 729;
        int[] grezPower = { 27, 1, 8, 1, 8, 125, 512, 64, 8, 125, 125, 216, 27, 216, 1, 512, 64, 729, 343, 343, 27, 27, 729, 729, 8 };
        assertEquals(25, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case32() {
        int initialLevel = 64;
        int[] grezPower = { 125, 27, 64, 27, 64, 216, 343, 512, 64, 27, 64, 512, 64, 1, 27, 8 };
        assertEquals(16, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case33() {
        int initialLevel = 1;
        int[] grezPower = { 8, 729, 729, 8, 216, 64, 1, 729, 125, 64, 64, 8, 512, 216, 343, 64, 343, 729, 729, 512, 216, 64, 512, 729, 343, 1, 27, 729, 64, 343 };
        assertEquals(0, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case34() {
        int initialLevel = 216;
        int[] grezPower = { 1, 8, 216, 512, 216, 125, 1, 125, 8, 512, 64, 27, 64, 729, 64, 512, 125, 64, 125, 216, 8, 343, 27, 343 };
        assertEquals(24, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case35() {
        int initialLevel = 343;
        int[] grezPower = { 1, 512, 125, 64, 64, 1, 8, 216, 8, 1, 125, 216, 512, 1, 512 };
        assertEquals(15, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case36() {
        int initialLevel = 3;
        int[] grezPower = { 2, 3, 4, 6, 9, 13, 19, 28, 42, 63, 94, 141, 211, 316, 474, 711 };
        assertEquals(16, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case37() {
        int initialLevel = 3;
        int[] grezPower = { 2, 2, 4, 4, 8, 8, 16, 16, 32, 32, 64, 64, 128, 128, 256, 256, 512, 512 };
        assertEquals(18, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case38() {
        int initialLevel = 3;
        int[] grezPower = { 2, 2, 2, 5, 5, 5, 11, 11, 11, 26, 26, 26, 65, 65, 65, 161, 161, 161, 401, 401, 401 };
        assertEquals(21, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case39() {
        int initialLevel = 7;
        int[] grezPower = { 7, 8, 9, 10 };
        assertEquals(0, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case40() {
        int initialLevel = 3;
        int[] grezPower = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
        assertEquals(16, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case41() {
        int initialLevel = 500;
        int[] grezPower = { 10, 20, 30 };
        assertEquals(3, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case42() {
        int initialLevel = 3;
        int[] grezPower = { 5, 4, 3, 2 };
        assertEquals(4, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case43() {
        int initialLevel = 6;
        int[] grezPower = { 6, 5 };
        assertEquals(2, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case44() {
        int initialLevel = 4;
        int[] grezPower = { 3, 13, 6, 4, 9 };
        assertEquals(5, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case45() {
        int initialLevel = 20;
        int[] grezPower = { 24, 5, 6, 38 };
        assertEquals(3, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case46() {
        int initialLevel = 3;
        int[] grezPower = { 3, 3 };
        assertEquals(0, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case47() {
        int initialLevel = 10;
        int[] grezPower = { 10, 10 };
        assertEquals(0, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case48() {
        int initialLevel = 30;
        int[] grezPower = { 1, 30 };
        assertEquals(1, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case49() {
        int initialLevel = 2;
        int[] grezPower = { 1, 2 };
        assertEquals(1, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case50() {
        int initialLevel = 10;
        int[] grezPower = { 999, 999, 999, 888, 899, 910, 920, 930, 940, 950, 960, 960, 777, 456, 678, 987, 654, 345, 456, 456, 2, 456 };
        assertEquals(1, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case51() {
        int initialLevel = 3;
        int[] grezPower = { 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(8, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case52() {
        int initialLevel = 1000;
        int[] grezPower = { 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999 };
        assertEquals(50, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case53() {
        int initialLevel = 20;
        int[] grezPower = { 37, 24, 6, 6 };
        assertEquals(4, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case54() {
        int initialLevel = 1000;
        int[] grezPower = { 999 };
        assertEquals(1, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

    @Test
    public void case55() {
        int initialLevel = 10;
        int[] grezPower = { 1, 150, 400 };
        assertEquals(1, primalunlicensedcreatures.maxWins(initialLevel, grezPower));
    }

}
