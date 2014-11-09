package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class MysticAndCandiesEasyTest {
    MysticAndCandiesEasy mysticandcandieseasy = new MysticAndCandiesEasy();

    @Test
    public void case1() {
        int C = 10;
        int X = 10;
        int[] high = { 20 };
        assertEquals(1, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case2() {
        int C = 10;
        int X = 7;
        int[] high = { 3, 3, 3, 3, 3 };
        assertEquals(4, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case3() {
        int C = 100;
        int X = 63;
        int[] high = { 12, 34, 23, 45, 34 };
        assertEquals(3, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case4() {
        int C = 26;
        int X = 5;
        int[] high = { 6, 9, 15, 3, 11, 6, 8, 12 };
        assertEquals(5, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case5() {
        int C = 168;
        int X = 30;
        int[] high = { 2, 15, 6, 1, 1, 10, 14, 18, 13, 11, 17, 17, 11, 12, 18, 11, 9, 7 };
        assertEquals(4, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case6() {
        int C = 5;
        int X = 3;
        int[] high = { 9, 1 };
        assertEquals(1, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case7() {
        int C = 19;
        int X = 12;
        int[] high = { 12, 9, 15, 1, 6, 4, 9, 10, 10, 10, 14, 14, 1, 1, 12, 10, 9, 2, 3, 6, 1, 7, 3, 4, 10, 3, 14 };
        assertEquals(22, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case8() {
        int C = 712;
        int X = 285;
        int[] high = { 35, 5, 15, 2, 35, 26, 20, 28, 1, 8, 28, 16, 36, 36, 20, 22, 30, 31, 8, 8, 32, 35, 20, 31, 19, 1, 17, 12, 29, 12, 11, 25, 14, 17, 12, 8, 30, 12, 24, 9, 8, 8, 12, 28, 17, 2, 13, 31, 36, 28 };
        assertEquals(17, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case9() {
        int C = 29;
        int X = 26;
        int[] high = { 5, 6, 10, 10, 5, 5, 3, 10, 1, 10, 2, 9, 11, 3, 3, 8, 11, 6, 10, 2, 6, 7, 4, 8 };
        assertEquals(22, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case10() {
        int C = 326;
        int X = 109;
        int[] high = { 9, 13, 6, 6, 6, 16, 16, 16, 10, 16, 4, 3, 10, 8, 11, 17, 12, 5, 7, 8, 7, 4, 15, 7, 14, 2, 2, 1, 17, 1, 7, 7, 12, 17, 2, 9, 7, 1, 8, 16, 7, 4, 16, 2, 13, 3, 13, 1, 17, 6 };
        assertEquals(15, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case11() {
        int C = 198;
        int X = 136;
        int[] high = { 16, 17, 7, 20, 17, 19, 13, 18, 9, 19, 6, 15, 15, 22, 15, 2, 15, 16, 6, 19, 6, 21, 20, 19, 1, 2, 3, 7, 2, 19, 17, 22, 4, 2, 3, 11, 22, 15, 12, 11, 17, 19, 1, 9, 15, 21, 18, 6, 13, 16 };
        assertEquals(35, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case12() {
        int C = 2;
        int X = 1;
        int[] high = { 4 };
        assertEquals(1, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case13() {
        int C = 20;
        int X = 5;
        int[] high = { 18, 22, 20, 2, 13, 3, 11, 22, 17, 2, 9, 22, 11, 11, 7, 21, 4, 21, 9, 2, 7, 4, 7, 9, 3, 18, 19, 12, 22 };
        assertEquals(24, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case14() {
        int C = 128;
        int X = 42;
        int[] high = { 3, 4, 2, 5, 4, 2, 3, 6, 3, 2, 3, 2, 5, 4, 4, 4, 3, 1, 3, 3, 1, 1, 4, 3, 6, 6, 3, 4, 1, 4, 5, 2, 3, 1, 2, 6, 2, 6, 1, 1, 2, 3, 2 };
        assertEquals(9, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case15() {
        int C = 135;
        int X = 106;
        int[] high = { 2, 3, 2, 1, 5, 5, 5, 4, 6, 2, 1, 1, 3, 5, 3, 1, 5, 5, 5, 3, 2, 4, 6, 5, 3, 1, 3, 6, 1, 1, 3, 2, 5, 4, 6, 3, 1, 2, 5, 5, 1, 1, 3, 1, 4, 4, 1, 3, 6, 4 };
        assertEquals(31, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case16() {
        int C = 66;
        int X = 6;
        int[] high = { 5, 35, 45, 17, 15, 30, 36, 22, 38, 41, 1, 40, 21, 3, 40, 12, 22, 30, 25, 6 };
        assertEquals(13, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case17() {
        int C = 62;
        int X = 29;
        int[] high = { 9, 8, 16, 3, 3, 3, 9, 16, 12, 13, 4, 16, 15, 9, 11, 17, 16, 16, 14, 13, 13, 12, 9, 7, 15, 3, 10, 4, 5, 11, 4, 11, 6, 9, 6, 3, 7 };
        assertEquals(28, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case18() {
        int C = 258;
        int X = 9;
        int[] high = { 32, 19, 39, 14, 2, 13, 19, 36, 21, 16, 25, 11, 21, 21, 19, 6, 9, 14, 10, 24, 38, 28, 30, 18, 32, 2, 31, 16, 34 };
        assertEquals(12, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case19() {
        int C = 425;
        int X = 225;
        int[] high = { 36, 21, 38, 30, 38, 10, 23, 26, 38, 16, 40, 1, 38, 42, 33 };
        assertEquals(6, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case20() {
        int C = 48;
        int X = 41;
        int[] high = { 28, 25, 25, 30, 17, 27, 32, 4, 10, 30, 36, 23, 32 };
        assertEquals(12, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case21() {
        int C = 96;
        int X = 16;
        int[] high = { 1, 3, 9, 4, 4, 10, 6, 7, 11, 12, 7, 6, 11, 1, 8, 2, 2, 3, 10, 8, 8, 4, 3, 8, 10, 8, 10, 12, 6, 9, 11, 5, 2, 8, 6, 6, 4, 6, 1, 7, 3, 10, 7, 7, 11, 5, 3, 6, 11, 1 };
        assertEquals(28, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case22() {
        int C = 538;
        int X = 47;
        int[] high = { 38, 21, 34, 30, 19, 40, 37, 33, 27, 22, 13, 3, 37, 32, 45, 28, 14, 10, 18, 13, 34, 9, 20, 10, 22, 16, 50, 4, 23, 32, 49, 8, 8, 12, 22, 20, 33, 39, 47, 35, 41, 50, 4, 21, 5 };
        assertEquals(16, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case23() {
        int C = 139;
        int X = 58;
        int[] high = { 1, 6, 4, 3, 3, 4, 7, 2, 5, 3, 5, 1, 1, 3, 4, 2, 5, 5, 5, 1, 1, 7, 4, 7, 6, 5, 7, 5, 1, 1, 4, 5, 2, 1, 2, 1, 7, 7, 3, 3, 5, 6, 3, 1, 4, 1, 1, 2, 3, 2 };
        assertEquals(17, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case24() {
        int C = 415;
        int X = 257;
        int[] high = { 43, 30, 22, 21, 23, 36, 15, 4, 48, 46, 10, 23, 29, 23, 12, 7, 26, 33, 27, 17, 33, 20 };
        assertEquals(12, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case25() {
        int C = 413;
        int X = 220;
        int[] high = { 10, 8, 14, 6, 18, 4, 17, 12, 8, 10, 16, 20, 12, 20, 20, 15, 10, 8, 12, 4, 9, 18, 2, 14, 15, 6, 8, 5, 7, 3, 7, 11, 12, 4, 13, 15, 8, 20, 16, 12, 4, 12, 19, 12, 13, 5, 6, 5, 9, 2 };
        assertEquals(22, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case26() {
        int C = 73;
        int X = 37;
        int[] high = { 6, 5, 2, 6, 2, 3, 1, 6, 2, 2, 6, 3, 5, 3, 1, 2, 6, 1, 5, 3, 3, 4, 6, 1, 3, 6, 2, 6, 1, 6, 2, 4, 4, 4, 6, 1, 1, 1, 6, 6, 2, 2, 5, 4, 4, 2, 5, 4, 2, 2 };
        assertEquals(29, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case27() {
        int C = 156;
        int X = 93;
        int[] high = { 16, 12, 7, 14, 6, 7, 2, 2, 15, 8, 15, 13, 13, 13, 10, 8, 14, 10, 1, 18, 7, 1, 2, 6 };
        assertEquals(12, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case28() {
        int C = 21;
        int X = 9;
        int[] high = { 8, 15 };
        assertEquals(1, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case29() {
        int C = 145;
        int X = 43;
        int[] high = { 15, 2, 5, 19, 11, 14, 14, 12, 18, 10, 25, 24, 12, 16, 5, 11, 16, 18, 6, 9, 2, 12, 2, 1, 20, 12, 8, 18, 2, 1, 12, 14, 9, 14, 13, 8, 17, 15, 6, 23, 2, 4, 9, 15, 4, 14, 6, 20, 10, 11 };
        assertEquals(30, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case30() {
        int C = 156;
        int X = 84;
        int[] high = { 25, 29, 21, 5, 12, 8, 18, 9, 16, 8, 26, 18, 18, 29, 18, 3, 11, 14, 19, 13, 7, 9, 16, 28, 19, 21, 23, 11, 14, 10, 29, 12, 13, 25, 25, 6, 19, 12, 4, 29, 4, 23, 23, 6, 4, 1, 4, 5, 21, 22 };
        assertEquals(37, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case31() {
        int C = 149;
        int X = 33;
        int[] high = { 26, 8, 11, 22, 4, 5, 25, 30, 10, 2, 28, 22, 24, 20, 13, 30 };
        assertEquals(7, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case32() {
        int C = 7;
        int X = 3;
        int[] high = { 1, 2, 4, 5, 6, 3, 3, 5, 13, 11, 13, 13 };
        assertEquals(10, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case33() {
        int C = 30;
        int X = 26;
        int[] high = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(46, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case34() {
        int C = 4;
        int X = 1;
        int[] high = { 3, 1, 6, 1, 5, 1, 6, 6, 3, 2, 1, 2, 9, 6, 6, 6, 6, 9, 9, 4, 4, 5, 7, 7, 3, 2, 1, 2, 7, 4, 8, 1, 6, 5 };
        assertEquals(31, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case35() {
        int C = 577;
        int X = 413;
        int[] high = { 10, 21, 14, 9, 18, 37, 7, 44, 26, 47, 26, 10, 39, 39, 46, 34, 20, 9, 13, 15, 24, 29, 30, 6, 48, 24, 28, 47, 17, 19, 29, 26, 19, 19, 34, 23, 41, 47, 22, 20, 13, 44, 14, 11, 30, 17, 31, 48, 28, 14 };
        assertEquals(36, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case36() {
        int C = 329;
        int X = 290;
        int[] high = { 6, 20, 16, 30, 18, 8, 9, 17, 25, 31, 4, 15, 29, 16, 3, 4, 4, 15, 18, 25, 19, 2, 7, 13, 6, 27, 1, 12, 28, 19, 2, 32, 27, 6, 12, 27, 6, 14, 8, 21, 4, 6, 7, 21, 21, 16, 23, 21, 2 };
        assertEquals(38, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case37() {
        int C = 89;
        int X = 26;
        int[] high = { 15, 1, 11, 13, 1, 18, 8, 14, 11, 11 };
        assertEquals(3, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case38() {
        int C = 165;
        int X = 110;
        int[] high = { 29, 35, 26, 3, 33, 42, 25, 29, 2, 13, 42, 26, 25 };
        assertEquals(9, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case39() {
        int C = 19;
        int X = 11;
        int[] high = { 14, 12, 13, 16, 15 };
        assertEquals(5, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case40() {
        int C = 263;
        int X = 151;
        int[] high = { 28, 32, 37, 2, 13, 13, 5, 2, 36, 6, 30, 16, 17, 30, 20, 3, 9, 7, 32, 10, 38, 24, 26, 4, 37, 15, 8, 25, 14, 35, 14, 25, 25, 29, 38, 11, 13, 17, 1, 38, 28, 26, 22, 14 };
        assertEquals(29, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case41() {
        int C = 589;
        int X = 275;
        int[] high = { 31, 14, 24, 24, 32, 5, 17, 10, 2, 24, 22, 14, 23, 38, 19, 10, 5, 23, 18, 15, 28, 8, 37, 23, 28, 29, 12, 28, 11, 24, 23, 32, 32, 26, 22, 25, 20, 19, 11, 16, 33, 13, 35, 33, 11, 4, 10, 34, 5, 23 };
        assertEquals(25, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case42() {
        int C = 32;
        int X = 9;
        int[] high = { 8, 21, 10, 21, 21, 26, 5, 5, 20, 19, 21, 22, 20, 12, 31, 32, 26, 11, 8, 11, 31, 18, 35, 22, 36 };
        assertEquals(22, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case43() {
        int C = 56;
        int X = 51;
        int[] high = { 2, 3, 3, 2, 2, 1, 5, 1, 3, 3, 1, 4, 3, 2, 1, 5, 2, 4, 2, 3, 2, 5, 2, 1, 4, 3, 4, 5, 3, 1, 3, 1, 2, 2, 4, 2, 5, 2, 2, 5, 4, 4, 1, 3, 4, 3, 4, 3, 4, 5 };
        assertEquals(45, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case44() {
        int C = 1;
        int X = 1;
        int[] high = { 1 };
        assertEquals(1, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case45() {
        int C = 439;
        int X = 357;
        int[] high = { 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
        assertEquals(49, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case46() {
        int C = 1;
        int X = 1;
        int[] high = { 1 };
        assertEquals(1, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case47() {
        int C = 454;
        int X = 221;
        int[] high = { 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
        assertEquals(46, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case48() {
        int C = 326;
        int X = 109;
        int[] high = { 9, 13, 6, 6, 6, 16, 16, 16, 10, 16, 4, 3, 10, 8, 11, 17, 12, 5, 7, 8, 7, 4, 15, 7, 14, 2, 2, 1, 17, 1, 7, 7, 12, 17, 2, 9, 7, 1, 8, 16, 7, 4, 16, 2, 13, 3, 13, 1, 17, 6 };
        assertEquals(15, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case49() {
        int C = 10;
        int X = 10;
        int[] high = { 20 };
        assertEquals(1, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case50() {
        int C = 10;
        int X = 10;
        int[] high = { 5, 5, 5 };
        assertEquals(3, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case51() {
        int C = 1;
        int X = 1;
        int[] high = { 50, 50 };
        assertEquals(2, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case52() {
        int C = 19;
        int X = 12;
        int[] high = { 12, 9, 15, 1, 6, 4, 9, 10, 10, 10, 14, 14, 1, 1, 12, 10, 9, 2, 3, 6, 1, 7, 3, 4, 10, 3, 14 };
        assertEquals(22, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case53() {
        int C = 10;
        int X = 7;
        int[] high = { 3, 3, 3, 3, 3 };
        assertEquals(4, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case54() {
        int C = 2;
        int X = 2;
        int[] high = { 1, 1 };
        assertEquals(2, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case55() {
        int C = 20;
        int X = 10;
        int[] high = { 15, 15 };
        assertEquals(2, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case56() {
        int C = 2500;
        int X = 2500;
        int[] high = { 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
        assertEquals(50, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case57() {
        int C = 100;
        int X = 63;
        int[] high = { 12, 34, 23, 45, 34 };
        assertEquals(3, mysticandcandieseasy.minBoxes(C, X, high));
    }

    @Test
    public void case58() {
        int C = 50;
        int X = 40;
        int[] high = { 49, 10 };
        assertEquals(1, mysticandcandieseasy.minBoxes(C, X, high));
    }

}
