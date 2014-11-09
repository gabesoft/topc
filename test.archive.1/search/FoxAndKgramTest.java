package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class FoxAndKgramTest {
    FoxAndKgram foxandkgram = new FoxAndKgram();

    @Test
    public void case1() {
        int[] len = { 1, 1, 1, 1, 3 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case2() {
        int[] len = { 2, 2, 1, 3, 5, 5, 5 };
        assertEquals(5, foxandkgram.maxK(len));
    }

    @Test
    public void case3() {
        int[] len = { 1 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case4() {
        int[] len = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
        assertEquals(5, foxandkgram.maxK(len));
    }

    @Test
    public void case5() {
        int[] len = { 1, 2, 3, 1, 2, 4, 2, 3, 1 };
        assertEquals(4, foxandkgram.maxK(len));
    }

    @Test
    public void case6() {
        int[] len = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case7() {
        int[] len = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case8() {
        int[] len = { 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
        assertEquals(50, foxandkgram.maxK(len));
    }

    @Test
    public void case9() {
        int[] len = { 10, 10, 10, 10, 10, 10, 10, 10, 2, 7, 4, 5 };
        assertEquals(10, foxandkgram.maxK(len));
    }

    @Test
    public void case10() {
        int[] len = { 2, 2, 2, 2, 2, 2, 5 };
        assertEquals(2, foxandkgram.maxK(len));
    }

    @Test
    public void case11() {
        int[] len = { 26, 2, 17, 6, 27, 2, 29, 15, 17, 18, 9, 27, 27, 2, 25, 19, 27, 22, 21, 31, 19, 25, 8, 23, 24, 18, 22, 20, 13, 12, 15, 11, 9, 27, 30, 17, 25 };
        assertEquals(2, foxandkgram.maxK(len));
    }

    @Test
    public void case12() {
        int[] len = { 32, 11, 32, 5 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case13() {
        int[] len = { 25, 31, 26, 18, 17, 30, 2, 23, 32, 38, 36, 4, 1, 37, 20, 21, 34, 23, 6, 27, 24, 10, 19, 8, 41, 24, 38, 5, 3, 2, 42, 12, 32, 30, 6, 1, 5 };
        assertEquals(2, foxandkgram.maxK(len));
    }

    @Test
    public void case14() {
        int[] len = { 2, 17, 18, 13, 5, 18, 14, 5, 12, 1, 7, 14, 7, 13, 14, 17, 12, 16, 5, 17, 17, 9, 6, 6, 9, 18 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case15() {
        int[] len = { 17, 9, 8, 3, 4, 11, 9, 22, 23, 20, 11, 4, 8, 8, 17, 9, 27, 21, 21, 9, 29, 8, 16, 5, 15, 24, 2, 22 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case16() {
        int[] len = { 33, 16, 20, 8, 39, 19, 14, 5, 25, 12, 7, 30, 17, 28, 10, 33, 11, 20, 17, 2, 26, 29, 11, 37 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case17() {
        int[] len = { 15, 22, 5, 21, 2, 14, 18, 20, 2, 25, 6, 22, 9, 21, 3, 12, 26, 19, 22, 6, 24, 23, 8, 10, 21, 10, 7, 19, 1, 16, 2, 14, 8, 6, 4, 3, 16, 2, 22, 3, 5, 2, 28, 16, 27, 10, 13, 18, 10, 5 };
        assertEquals(10, foxandkgram.maxK(len));
    }

    @Test
    public void case18() {
        int[] len = { 21, 16, 21, 30, 35, 11, 37, 27, 43, 8, 4, 30, 7, 37, 6, 30, 25, 6, 40, 11 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case19() {
        int[] len = { 5, 24, 37, 21, 21, 13, 11, 16, 40, 15 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case20() {
        int[] len = { 12, 5, 15, 18, 9, 9, 4, 18, 8, 15, 8, 11, 9, 19, 6, 17, 10 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case21() {
        int[] len = { 38, 22, 3, 13, 31, 27, 35, 6, 41, 24, 34, 18, 29, 32, 2, 11, 42, 33, 28, 14 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case22() {
        int[] len = { 6, 26, 20, 8, 29, 16, 15, 8, 26, 21, 24, 5, 24, 10, 17 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case23() {
        int[] len = { 25, 36, 25, 35, 37, 8, 7, 13, 42, 26, 39, 38, 35, 27, 16, 16, 11, 17, 29, 17, 5, 19, 23, 30, 27, 2, 7 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case24() {
        int[] len = { 2, 40, 10, 8, 16, 33, 29, 28, 41, 9, 37, 28, 9, 41, 10, 30, 3, 12, 17, 40, 29, 36, 31, 13, 10, 16 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case25() {
        int[] len = { 35, 8, 14, 23, 7, 35, 25, 41, 35, 34, 19, 44, 8, 46, 48, 23, 16, 1, 22, 8, 19, 21, 30, 40, 29, 10, 11, 37, 3, 10, 46, 46, 36, 34, 26, 31, 10, 41, 39, 22, 37, 17, 24 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case26() {
        int[] len = { 4, 3, 3, 1, 1, 2, 4, 3, 1 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case27() {
        int[] len = { 7, 13, 17 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case28() {
        int[] len = { 12, 9, 9, 8, 10, 4, 10, 8, 4, 1, 5, 10, 2, 9, 7, 2, 8, 5, 8, 8, 1, 7, 6, 2, 2, 3, 3, 4, 2, 3, 11, 9, 1, 3, 1, 3, 4, 1, 12, 7, 3, 4 };
        assertEquals(13, foxandkgram.maxK(len));
    }

    @Test
    public void case29() {
        int[] len = { 33, 6, 24, 31, 35, 44, 32, 2, 3, 37, 11, 40, 35, 13, 9, 20, 43, 11 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case30() {
        int[] len = { 1, 1, 2, 2, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 2, 2, 2, 1, 2, 1, 2, 1, 2, 2, 1, 2, 1, 1, 2, 1, 2 };
        assertEquals(5, foxandkgram.maxK(len));
    }

    @Test
    public void case31() {
        int[] len = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case32() {
        int[] len = { 10, 26, 28, 32, 30, 22, 36, 14 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case33() {
        int[] len = { 16, 3, 18, 14, 19, 2, 5, 8, 6, 13, 11, 18, 3, 2, 9, 5, 23, 19, 5, 23, 22, 17, 3, 4, 5, 8, 4, 20, 10, 6, 15, 4, 17, 5, 9, 19 };
        assertEquals(5, foxandkgram.maxK(len));
    }

    @Test
    public void case34() {
        int[] len = { 9, 7, 10, 7, 10, 17, 14, 10, 11, 10, 3, 13, 1, 12, 7, 1, 2, 17, 4, 7, 9, 5, 15, 5, 10, 13, 3, 1, 15, 16, 10, 4, 2, 1 };
        assertEquals(10, foxandkgram.maxK(len));
    }

    @Test
    public void case35() {
        int[] len = { 8, 2, 3, 12, 19, 13, 6, 25 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case36() {
        int[] len = { 4, 7, 1, 8, 2, 4, 4, 3, 5, 8, 3, 6, 1, 6, 3, 5, 2, 8, 2, 1, 4, 5, 1, 7, 3, 2, 7, 8, 7, 5, 7, 2, 2 };
        assertEquals(11, foxandkgram.maxK(len));
    }

    @Test
    public void case37() {
        int[] len = { 17, 20, 35, 18, 33, 17, 27, 5, 38, 39, 7, 10, 11, 12, 8, 10, 21, 1 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case38() {
        int[] len = { 4, 8, 9, 5, 8, 17, 15, 12, 1, 18, 16, 3, 5, 3, 12, 14, 1, 13, 7, 11, 18, 15, 15, 17, 8, 6, 11, 1, 13, 18, 8, 2, 17, 9, 14, 18, 14, 9, 13, 7, 8 };
        assertEquals(8, foxandkgram.maxK(len));
    }

    @Test
    public void case39() {
        int[] len = { 24, 31, 27, 27, 3, 10, 6, 13, 15, 16, 26, 4, 13, 26, 9, 38, 20, 33, 36, 25, 24, 30, 4, 40, 24, 34, 1, 15, 5, 15, 19, 35 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case40() {
        int[] len = { 41, 37, 36 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case41() {
        int[] len = { 32, 19, 16, 9, 21, 9, 21, 9, 12, 19, 21, 9, 28, 20, 1, 25, 32 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case42() {
        int[] len = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case43() {
        int[] len = { 20, 2, 11, 16, 21, 4, 15, 21, 18, 18, 18, 4, 13, 29, 6, 29, 15, 25 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case44() {
        int[] len = { 5, 5, 4, 1, 4, 1, 5, 5, 5, 5, 3, 4, 1, 3, 2, 3, 3, 2, 2, 3, 3, 2, 4, 5, 4, 2, 2, 2, 3, 4, 5, 5, 2, 4, 4, 3, 1, 1, 1, 3, 2, 1, 3, 4, 2, 2, 5 };
        assertEquals(9, foxandkgram.maxK(len));
    }

    @Test
    public void case45() {
        int[] len = { 14, 15, 11, 14, 9, 10, 20, 3, 14, 20, 10, 13, 8, 14, 9, 9 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case46() {
        int[] len = { 6, 31, 18, 24, 22, 5, 11, 24, 16, 35, 23, 29, 23, 18, 12, 6, 10, 4 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case47() {
        int[] len = { 49, 45, 7, 1, 4, 33, 12, 16, 43, 3, 4, 15, 24, 39, 35, 13, 19, 22, 40, 8 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case48() {
        int[] len = { 13, 11, 12, 30, 29, 16, 10, 34, 38, 36, 16, 10, 36, 17, 24, 16, 20, 41, 34, 27, 2, 41, 36, 10, 36, 6, 34, 41, 2, 41, 16, 38, 26, 2, 33, 4, 41, 25, 31, 1 };
        assertEquals(2, foxandkgram.maxK(len));
    }

    @Test
    public void case49() {
        int[] len = { 41, 32, 7, 4, 19, 14, 23, 31, 31, 12, 41, 18, 6, 12, 7, 46, 15, 29, 18, 1, 29, 2, 36, 12, 9, 18, 4, 27, 18, 1, 9 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case50() {
        int[] len = { 36, 9, 36, 3, 47, 24, 40, 15, 44, 32, 34, 13, 17, 22, 46, 25, 40, 16, 7, 22, 24, 28, 13, 25, 8, 38, 36, 38, 24, 3, 33, 31, 16, 18, 36, 10, 42, 8, 39, 42, 15, 30, 23, 10 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case51() {
        int[] len = { 1, 1, 1 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case52() {
        int[] len = { 14, 34, 4, 27, 27, 17, 8, 24, 11, 36, 2, 26, 13, 14, 32, 33, 8, 19, 31, 30, 29, 37, 19, 22, 34, 26, 18, 31, 1, 34, 6, 26, 32, 20, 13, 27, 5, 27, 25, 31, 3, 28, 16, 10, 35, 9, 38, 38 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case53() {
        int[] len = { 7, 17, 1, 11, 14, 8, 19, 12, 11, 13, 12, 15, 10, 9, 18, 17, 9, 2, 6, 12, 16, 9, 6, 9, 4, 3, 7, 14, 11, 18, 5, 3, 11, 17, 2, 10, 5, 9, 7, 8, 10, 3, 16, 11, 10 };
        assertEquals(11, foxandkgram.maxK(len));
    }

    @Test
    public void case54() {
        int[] len = { 4, 14, 21, 16, 6, 17, 5, 34, 18, 8, 10, 13, 24, 29, 1, 34, 17 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case55() {
        int[] len = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case56() {
        int[] len = { 6, 7, 8, 4, 7, 12, 6, 10, 7, 6, 4, 12, 11, 12, 12, 13, 11, 2, 10, 11, 13, 6, 13, 4, 7, 10, 16, 12, 15, 7, 10, 12, 4, 15, 3, 13, 3, 4, 8, 5, 3, 8, 16, 1, 2, 4, 15 };
        assertEquals(15, foxandkgram.maxK(len));
    }

    @Test
    public void case57() {
        int[] len = { 11, 5, 19, 4, 12, 4, 19, 19, 15, 15, 2, 6, 1, 15, 7, 3, 14, 12, 15, 13, 20, 12, 12, 11 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case58() {
        int[] len = { 1, 1, 3, 5, 3, 5, 4, 1, 8, 4 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case59() {
        int[] len = { 9, 14 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case60() {
        int[] len = { 11, 13, 19, 45, 31, 14, 46, 30, 32, 17, 17, 25, 6, 14, 14, 39, 45, 46, 23, 5, 17, 27, 20, 25, 24, 3, 14, 18, 44, 24, 40, 31, 35, 22, 27, 42, 22, 16, 11, 35, 9, 9, 6 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case61() {
        int[] len = { 1, 3, 6, 8, 8, 6, 1, 8, 5, 6, 7, 7, 4, 3, 6, 3, 3, 7, 2, 1, 1, 3, 1, 2, 5, 8, 3 };
        assertEquals(10, foxandkgram.maxK(len));
    }

    @Test
    public void case62() {
        int[] len = { 14, 10, 2, 11, 7, 7, 5, 14, 6, 2, 9, 14, 12, 9, 3, 8, 1, 10 };
        assertEquals(2, foxandkgram.maxK(len));
    }

    @Test
    public void case63() {
        int[] len = { 2, 5, 1, 8, 1, 7, 6, 6, 8, 5, 1, 6, 1, 4, 3 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case64() {
        int[] len = { 10, 6, 1, 3, 7, 4, 4, 3, 8, 6, 7, 7, 4, 10, 9, 9, 4, 1, 10, 5, 7, 6, 1, 7, 10, 6, 8, 10, 6, 4, 3, 9, 1 };
        assertEquals(12, foxandkgram.maxK(len));
    }

    @Test
    public void case65() {
        int[] len = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case66() {
        int[] len = { 36, 32, 27, 8, 26, 28, 20, 28, 14, 32, 7, 8, 32, 12, 17, 10, 1, 8, 8, 38, 37, 18, 27, 5, 28, 31, 15, 28, 25, 29, 23, 31, 15, 24, 12, 5, 40 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case67() {
        int[] len = { 28, 49, 27, 15, 34, 28, 34, 45, 39, 34, 29, 1, 9, 43, 41, 29, 17, 11, 19, 7 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case68() {
        int[] len = { 13, 7, 23, 3, 16, 29, 28, 32, 4, 5, 36, 2, 7, 30, 1, 8, 31, 10, 29, 15 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case69() {
        int[] len = { 14, 21, 12, 4, 7, 24, 1, 10, 8, 15, 17, 22, 17, 2, 20, 11, 13, 16, 1, 6, 8, 8 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case70() {
        int[] len = { 2, 4, 2, 3, 5, 5, 1, 5, 2, 3, 1, 5, 4, 4, 4, 5, 5, 4, 2, 5, 2, 5, 1, 2, 5, 1, 1, 2, 2, 4, 4, 5, 1, 1, 4, 4, 2, 4, 3, 4, 5, 1, 1, 4, 3, 1 };
        assertEquals(10, foxandkgram.maxK(len));
    }

    @Test
    public void case71() {
        int[] len = { 20, 7, 2, 5, 16, 6, 12, 8, 4, 13, 9, 20, 15, 16, 6, 7, 19, 18, 3, 5, 9, 21, 25, 8, 5, 12, 14, 20 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case72() {
        int[] len = { 3, 6, 4, 7, 2, 6, 5 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case73() {
        int[] len = { 18, 27, 27, 10, 20, 24, 18, 14, 4, 21, 37, 30, 11, 37, 31, 6, 20, 3 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case74() {
        int[] len = { 11, 2, 2, 9, 6, 2, 6, 13, 5, 13, 11, 9, 7, 11, 1, 1, 7, 4, 12, 12, 4, 2, 12, 8, 5, 1, 2, 13, 3, 4, 4, 7, 8, 10, 9, 7, 10, 4, 8, 12, 3, 12, 7, 12 };
        assertEquals(15, foxandkgram.maxK(len));
    }

    @Test
    public void case75() {
        int[] len = { 3, 31, 7, 37, 22, 37, 39, 5, 28, 35, 41, 20, 8, 18, 6, 30, 9, 48, 5, 44, 36, 35, 17, 26, 18, 47, 30, 30 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case76() {
        int[] len = { 19, 28, 10, 8, 32, 1, 15, 1, 24, 10, 18, 32, 16, 21, 4, 30, 17, 5, 16, 6, 16, 18, 9, 15, 7, 30, 29, 34, 4, 2, 32, 29, 32, 31, 4, 10, 27, 27, 8, 14, 35, 4, 3, 31, 14, 4 };
        assertEquals(4, foxandkgram.maxK(len));
    }

    @Test
    public void case77() {
        int[] len = { 9, 6, 19, 29, 7, 27, 15, 9, 23, 13, 17, 21, 12, 19, 29, 3, 3, 5, 27, 5, 23, 17, 22, 30, 15, 21, 4, 29 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case78() {
        int[] len = { 1, 2, 5, 1, 4, 8, 6, 1, 2, 10, 7, 2, 9, 10, 2, 4, 4, 4, 10, 1, 10, 10, 7, 1, 5, 10, 4, 9, 10, 4 };
        assertEquals(10, foxandkgram.maxK(len));
    }

    @Test
    public void case79() {
        int[] len = { 30, 10, 11, 18, 15, 13, 14, 19, 9, 4, 32, 12, 14, 19, 31, 36, 16, 15, 21, 32, 23, 4, 5, 21, 8 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case80() {
        int[] len = { 8, 4, 4, 7, 7, 9, 6, 2, 6, 6, 4, 6, 8, 3, 3, 2, 5, 6, 4, 4, 2, 3, 9, 5, 6, 9, 5, 5, 7, 8, 1, 7, 6, 9, 1, 1, 5, 7, 4, 3, 2, 2, 6, 6, 5, 6, 8, 8 };
        assertEquals(14, foxandkgram.maxK(len));
    }

    @Test
    public void case81() {
        int[] len = { 4, 1, 4, 4, 1, 2 };
        assertEquals(4, foxandkgram.maxK(len));
    }

    @Test
    public void case82() {
        int[] len = { 15, 11, 11, 17, 21, 11, 15, 7, 5, 12, 6, 16, 1, 6, 6, 14, 18, 21, 11 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case83() {
        int[] len = { 2, 1, 2, 1, 3, 2, 1, 2, 1 };
        assertEquals(4, foxandkgram.maxK(len));
    }

    @Test
    public void case84() {
        int[] len = { 6, 8, 33, 47, 28, 27, 49, 43, 39 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case85() {
        int[] len = { 16, 16, 3, 14, 14, 20, 21, 12, 22, 16, 19, 1, 3, 22, 21, 9, 12, 24, 12, 13, 8, 20, 24, 14, 2, 24, 25, 4, 16, 26, 24, 2, 25, 16, 26, 20, 9, 16, 1, 17, 6, 15, 20, 14, 11, 18, 17, 12 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case86() {
        int[] len = { 28, 19 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case87() {
        int[] len = { 30, 1, 15, 17, 23, 21, 23, 10, 25, 7, 29 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case88() {
        int[] len = { 24, 19, 9, 2, 5, 22, 23, 15, 7, 11, 25, 19, 15, 10, 4, 18, 5, 19, 18, 24, 5, 23, 25, 23, 13, 6, 27, 9, 24, 7, 21, 9, 14, 10, 24, 18, 21 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case89() {
        int[] len = { 18, 36, 3, 24, 30, 29, 24, 8, 37, 24, 34, 22, 31, 13, 23, 13, 13, 12, 36, 34, 9, 25, 36, 18, 28, 23, 23, 28, 5, 21, 36, 11, 19, 17, 36, 8 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case90() {
        int[] len = { 23, 32, 30, 9, 10, 20 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case91() {
        int[] len = { 41, 27, 3, 5, 46, 20, 28, 42, 18, 35, 33, 3, 47, 24, 20 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case92() {
        int[] len = { 18, 13, 11 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case93() {
        int[] len = { 17, 6, 15, 14, 13, 3, 1, 9, 3, 14, 7, 18, 21, 3, 17, 23, 17, 2, 18, 12, 7, 21, 8, 20, 18, 5, 16, 8, 3, 23, 12 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case94() {
        int[] len = { 3, 1, 17, 5, 14, 17, 2, 4, 7, 12, 11, 2, 2, 15, 14, 1, 3, 9, 19, 5, 2, 9, 17, 18, 10 };
        assertEquals(5, foxandkgram.maxK(len));
    }

    @Test
    public void case95() {
        int[] len = { 25, 34, 6, 33, 31, 6, 33, 44 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case96() {
        int[] len = { 6, 30, 2, 8, 9, 28, 27, 28, 37, 26, 33, 9, 8, 4, 14, 5, 18, 38, 32, 17, 1, 36, 31, 29, 21, 30, 4, 8, 11, 40, 12, 30, 8, 13, 23, 20, 10 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case97() {
        int[] len = { 35, 41, 1, 3, 23, 34, 22, 23, 18, 22, 44, 36, 42, 19, 21, 42, 28, 20, 2, 37, 4, 43, 23, 6, 18, 8, 7, 7, 39, 24, 26, 32, 32, 29, 14 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case98() {
        int[] len = { 8, 10, 7, 1, 10, 10, 5, 2, 3, 2, 11, 6, 12, 5, 5, 9, 8, 6, 5, 3, 10, 8, 6, 2, 1, 11, 8, 4, 7, 9, 10, 7, 2, 10, 4, 2, 4, 8, 7, 9, 10, 6, 5, 8, 11, 10, 1 };
        assertEquals(16, foxandkgram.maxK(len));
    }

    @Test
    public void case99() {
        int[] len = { 29, 33, 6, 23, 33, 14, 16, 5, 8, 33, 33, 29, 24, 21, 13, 20, 16, 29, 5, 24, 30, 31, 34, 8, 9, 23, 4, 3, 15, 33, 27, 31 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case100() {
        int[] len = { 10, 25, 1, 24, 16, 1, 29, 18, 15, 17, 15, 3, 16, 27, 6, 3, 8, 13, 26, 31, 5, 8, 23, 18, 6, 6, 4, 11, 27, 11, 23, 8, 25, 31, 16, 22, 30, 16, 21, 17, 12, 19, 13, 29, 25 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case101() {
        int[] len = { 9, 23, 11, 16, 12, 7, 6 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case102() {
        int[] len = { 23, 15, 16, 7, 19, 42, 4, 39, 38, 36, 43, 48, 10, 47, 19, 32, 30, 48, 41, 2, 7, 7, 12, 11, 37, 20 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case103() {
        int[] len = { 16, 24, 9, 3, 10, 10, 16, 5, 6, 19, 10, 13, 10, 20, 15, 2, 9, 6, 17, 6, 20, 2, 22, 19, 18, 10, 15, 19, 22, 23, 2, 2, 24, 5, 21, 6, 14, 12, 4, 11 };
        assertEquals(2, foxandkgram.maxK(len));
    }

    @Test
    public void case104() {
        int[] len = { 9, 15, 26, 35, 30, 16, 17, 34, 29, 1, 33, 3, 28, 26, 25, 46, 1 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case105() {
        int[] len = { 37, 33, 4, 15, 16, 49, 41, 47, 14, 34, 34, 32, 26, 10, 37, 18 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case106() {
        int[] len = { 2, 1, 1, 1, 2, 2, 3, 1, 2, 1, 3, 2, 2, 2, 3, 3, 1, 1, 1, 2, 3, 1, 3 };
        assertEquals(6, foxandkgram.maxK(len));
    }

    @Test
    public void case107() {
        int[] len = { 4, 11, 14, 1, 4, 14, 5, 11, 15, 16, 17, 12, 2, 6, 6, 3, 8, 13, 11, 6, 4, 11, 4, 4, 9, 4, 17, 4, 8, 15, 3, 8, 11, 1, 15, 8, 11, 16, 16 };
        assertEquals(11, foxandkgram.maxK(len));
    }

    @Test
    public void case108() {
        int[] len = { 43, 19, 2, 22, 6 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case109() {
        int[] len = { 3, 1, 1, 3, 5, 1, 1, 3, 1, 2, 1, 2, 5, 3, 4, 4, 5, 1, 1, 2, 3, 3, 1, 5, 2, 2, 2, 5, 2, 1, 5, 2, 2, 2, 4, 3, 4, 4, 5 };
        assertEquals(9, foxandkgram.maxK(len));
    }

    @Test
    public void case110() {
        int[] len = { 2, 10, 7, 4, 15, 9, 15, 5, 5, 11, 6, 4, 7, 8, 13, 11, 1, 4, 4, 3, 9, 9, 8, 12, 6, 1, 8, 12, 8, 6, 14, 10, 13, 13, 4, 11, 14, 11, 13, 15, 14, 4, 14 };
        assertEquals(15, foxandkgram.maxK(len));
    }

    @Test
    public void case111() {
        int[] len = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
        assertEquals(5, foxandkgram.maxK(len));
    }

    @Test
    public void case112() {
        int[] len = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case113() {
        int[] len = { 2 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case114() {
        int[] len = { 5 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case115() {
        int[] len = { 3 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case116() {
        int[] len = { 17 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case117() {
        int[] len = { 1, 1, 1, 1, 1, 1, 3 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case118() {
        int[] len = { 50 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case119() {
        int[] len = { 10 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case120() {
        int[] len = { 10, 9, 10, 11, 2, 7, 17, 16, 16, 5, 19, 10, 8, 16, 2, 9, 13, 10, 4, 9, 1, 14, 18, 16, 20, 3, 1, 7, 15, 1, 4, 13, 7, 6, 2, 12, 13, 13, 2, 3, 17, 11, 20, 11, 4, 14, 6, 6, 11, 19 };
        assertEquals(18, foxandkgram.maxK(len));
    }

    @Test
    public void case121() {
        int[] len = { 1, 2, 2, 2, 5 };
        assertEquals(2, foxandkgram.maxK(len));
    }

    @Test
    public void case122() {
        int[] len = { 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case123() {
        int[] len = { 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3 };
        assertEquals(5, foxandkgram.maxK(len));
    }

    @Test
    public void case124() {
        int[] len = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1 };
        assertEquals(5, foxandkgram.maxK(len));
    }

    @Test
    public void case125() {
        int[] len = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case126() {
        int[] len = { 8 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case127() {
        int[] len = { 2, 2, 2 };
        assertEquals(2, foxandkgram.maxK(len));
    }

    @Test
    public void case128() {
        int[] len = { 1, 1, 1, 1, 1 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case129() {
        int[] len = { 1, 2 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case130() {
        int[] len = { 3, 1, 1, 1 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case131() {
        int[] len = { 10, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case132() {
        int[] len = { 5, 5, 5, 2, 2, 2 };
        assertEquals(2, foxandkgram.maxK(len));
    }

    @Test
    public void case133() {
        int[] len = { 3, 3, 3, 3 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case134() {
        int[] len = { 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
        assertEquals(5, foxandkgram.maxK(len));
    }

    @Test
    public void case135() {
        int[] len = { 1, 3, 3, 3, 3 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case136() {
        int[] len = { 1, 1, 1, 1, 1, 1 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case137() {
        int[] len = { 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
        assertEquals(50, foxandkgram.maxK(len));
    }

    @Test
    public void case138() {
        int[] len = { 1, 3, 3, 3, 3, 3 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case139() {
        int[] len = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 22, 50, 1, 1 };
        assertEquals(5, foxandkgram.maxK(len));
    }

    @Test
    public void case140() {
        int[] len = { 1, 3, 3 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case141() {
        int[] len = { 8, 8, 8, 8, 8, 8, 8, 8 };
        assertEquals(8, foxandkgram.maxK(len));
    }

    @Test
    public void case142() {
        int[] len = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
        assertEquals(5, foxandkgram.maxK(len));
    }

    @Test
    public void case143() {
        int[] len = { 2, 2, 3 };
        assertEquals(2, foxandkgram.maxK(len));
    }

    @Test
    public void case144() {
        int[] len = { 3, 3, 3, 3, 3 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case145() {
        int[] len = { 2, 2, 2, 2, 2, 5, 5 };
        assertEquals(2, foxandkgram.maxK(len));
    }

    @Test
    public void case146() {
        int[] len = { 1, 1, 1, 1, 2 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case147() {
        int[] len = { 10, 9, 9, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 4, 1, 9, 9 };
        assertEquals(19, foxandkgram.maxK(len));
    }

    @Test
    public void case148() {
        int[] len = { 1, 1, 1 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case149() {
        int[] len = { 10, 4, 4, 4, 4, 1 };
        assertEquals(4, foxandkgram.maxK(len));
    }

    @Test
    public void case150() {
        int[] len = { 5, 1 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case151() {
        int[] len = { 1, 1, 1, 1, 9 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case152() {
        int[] len = { 6 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case153() {
        int[] len = { 2, 2, 50, 50, 47, 43, 23 };
        assertEquals(2, foxandkgram.maxK(len));
    }

    @Test
    public void case154() {
        int[] len = { 1, 1, 2 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case155() {
        int[] len = { 1, 1, 1, 1, 3, 3 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case156() {
        int[] len = { 1, 1, 1, 1, 2, 2, 2, 2 };
        assertEquals(4, foxandkgram.maxK(len));
    }

    @Test
    public void case157() {
        int[] len = { 5, 5, 5, 5, 5, 10 };
        assertEquals(5, foxandkgram.maxK(len));
    }

    @Test
    public void case158() {
        int[] len = { 3, 2, 3 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case159() {
        int[] len = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
        assertEquals(10, foxandkgram.maxK(len));
    }

    @Test
    public void case160() {
        int[] len = { 1, 50 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case161() {
        int[] len = { 5, 2, 2, 2, 2, 3, 3, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
        assertEquals(5, foxandkgram.maxK(len));
    }

    @Test
    public void case162() {
        int[] len = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case163() {
        int[] len = { 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };
        assertEquals(7, foxandkgram.maxK(len));
    }

    @Test
    public void case164() {
        int[] len = { 2, 2, 1, 1, 1, 1 };
        assertEquals(2, foxandkgram.maxK(len));
    }

    @Test
    public void case165() {
        int[] len = { 1, 1, 1, 2, 4 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case166() {
        int[] len = { 3, 3, 1 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case167() {
        int[] len = { 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30 };
        assertEquals(30, foxandkgram.maxK(len));
    }

    @Test
    public void case168() {
        int[] len = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case169() {
        int[] len = { 1, 2, 4, 4, 1, 3 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case170() {
        int[] len = { 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24 };
        assertEquals(24, foxandkgram.maxK(len));
    }

    @Test
    public void case171() {
        int[] len = { 1, 1 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case172() {
        int[] len = { 1, 1, 1, 1, 1, 1, 5 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case173() {
        int[] len = { 1, 5 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case174() {
        int[] len = { 1, 1, 1, 1 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case175() {
        int[] len = { 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
        assertEquals(11, foxandkgram.maxK(len));
    }

    @Test
    public void case176() {
        int[] len = { 4, 1, 1, 1, 1, 1, 1 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case177() {
        int[] len = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11 };
        assertEquals(17, foxandkgram.maxK(len));
    }

    @Test
    public void case178() {
        int[] len = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6 };
        assertEquals(6, foxandkgram.maxK(len));
    }

    @Test
    public void case179() {
        int[] len = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
        assertEquals(5, foxandkgram.maxK(len));
    }

    @Test
    public void case180() {
        int[] len = { 1, 5, 4, 3, 2, 1, 1, 1, 1, 3, 3, 3, 4, 4, 4, 6, 6, 3, 3, 3, 1, 1, 2, 2, 24, 2, 2, 1, 1, 6, 6, 6, 6, 7, 7, 3, 3, 1, 1 };
        assertEquals(9, foxandkgram.maxK(len));
    }

    @Test
    public void case181() {
        int[] len = { 1, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4 };
        assertEquals(4, foxandkgram.maxK(len));
    }

    @Test
    public void case182() {
        int[] len = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 6 };
        assertEquals(5, foxandkgram.maxK(len));
    }

    @Test
    public void case183() {
        int[] len = { 1, 1, 1, 1, 1, 1, 1, 1, 10 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case184() {
        int[] len = { 1, 1, 2, 4, 4, 4 };
        assertEquals(4, foxandkgram.maxK(len));
    }

    @Test
    public void case185() {
        int[] len = { 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
        assertEquals(5, foxandkgram.maxK(len));
    }

    @Test
    public void case186() {
        int[] len = { 5, 5, 5, 5, 5, 5, 5, 5 };
        assertEquals(5, foxandkgram.maxK(len));
    }

    @Test
    public void case187() {
        int[] len = { 2, 2, 2, 5, 5, 5 };
        assertEquals(2, foxandkgram.maxK(len));
    }

    @Test
    public void case188() {
        int[] len = { 1, 1, 1, 1, 10 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case189() {
        int[] len = { 5, 5, 5, 5, 5, 5, 5 };
        assertEquals(5, foxandkgram.maxK(len));
    }

    @Test
    public void case190() {
        int[] len = { 1, 3, 3, 3, 3, 3, 1, 1, 1 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case191() {
        int[] len = { 1, 1, 2, 1 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case192() {
        int[] len = { 1, 3, 1, 3, 1, 3 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case193() {
        int[] len = { 4, 4, 1, 2, 2 };
        assertEquals(2, foxandkgram.maxK(len));
    }

    @Test
    public void case194() {
        int[] len = { 10, 1, 1 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case195() {
        int[] len = { 1, 1, 2, 2, 2, 1, 1, 1, 4, 4, 1 };
        assertEquals(4, foxandkgram.maxK(len));
    }

    @Test
    public void case196() {
        int[] len = { 2, 2, 1, 3, 5, 5, 5, 5 };
        assertEquals(5, foxandkgram.maxK(len));
    }

    @Test
    public void case197() {
        int[] len = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
        assertEquals(5, foxandkgram.maxK(len));
    }

    @Test
    public void case198() {
        int[] len = { 5, 5, 5, 5, 5, 5 };
        assertEquals(5, foxandkgram.maxK(len));
    }

    @Test
    public void case199() {
        int[] len = { 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 1, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case200() {
        int[] len = { 5, 5, 5, 5, 5, 1, 1 };
        assertEquals(5, foxandkgram.maxK(len));
    }

    @Test
    public void case201() {
        int[] len = { 3, 3, 3 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case202() {
        int[] len = { 1, 1, 1, 1, 3 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case203() {
        int[] len = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
        assertEquals(10, foxandkgram.maxK(len));
    }

    @Test
    public void case204() {
        int[] len = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case205() {
        int[] len = { 2, 2, 2, 2, 2 };
        assertEquals(2, foxandkgram.maxK(len));
    }

    @Test
    public void case206() {
        int[] len = { 1, 2, 3, 4, 6, 6, 6, 6 };
        assertEquals(6, foxandkgram.maxK(len));
    }

    @Test
    public void case207() {
        int[] len = { 3, 1 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case208() {
        int[] len = { 1, 1, 1, 2, 2, 2 };
        assertEquals(2, foxandkgram.maxK(len));
    }

    @Test
    public void case209() {
        int[] len = { 3, 2, 2, 2, 2, 1, 1, 1, 1 };
        assertEquals(4, foxandkgram.maxK(len));
    }

    @Test
    public void case210() {
        int[] len = { 1, 1, 3, 1 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case211() {
        int[] len = { 2, 2 };
        assertEquals(2, foxandkgram.maxK(len));
    }

    @Test
    public void case212() {
        int[] len = { 1, 1, 1, 3, 5, 5 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case213() {
        int[] len = { 3, 3, 3, 3, 3, 3, 3 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case214() {
        int[] len = { 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };
        assertEquals(7, foxandkgram.maxK(len));
    }

    @Test
    public void case215() {
        int[] len = { 1, 3 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case216() {
        int[] len = { 2, 3, 3, 3, 3, 3, 3 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case217() {
        int[] len = { 2, 2, 2, 2, 1, 3, 5, 5, 5 };
        assertEquals(5, foxandkgram.maxK(len));
    }

    @Test
    public void case218() {
        int[] len = { 6, 6, 6, 6, 2, 3, 3, 3 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case219() {
        int[] len = { 2, 2, 2, 2, 2, 2 };
        assertEquals(2, foxandkgram.maxK(len));
    }

    @Test
    public void case220() {
        int[] len = { 1, 2, 1, 2 };
        assertEquals(2, foxandkgram.maxK(len));
    }

    @Test
    public void case221() {
        int[] len = { 50, 50 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case222() {
        int[] len = { 7, 7, 7, 7, 7, 7, 7 };
        assertEquals(7, foxandkgram.maxK(len));
    }

    @Test
    public void case223() {
        int[] len = { 2, 5, 5, 5, 5, 5, 6 };
        assertEquals(5, foxandkgram.maxK(len));
    }

    @Test
    public void case224() {
        int[] len = { 3, 3, 1, 1, 1, 1 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case225() {
        int[] len = { 2, 10 };
        assertEquals(0, foxandkgram.maxK(len));
    }

    @Test
    public void case226() {
        int[] len = { 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 1 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case227() {
        int[] len = { 2, 2, 2, 2, 2, 2, 2, 2 };
        assertEquals(2, foxandkgram.maxK(len));
    }

    @Test
    public void case228() {
        int[] len = { 5, 5, 5, 3, 2, 1, 2 };
        assertEquals(5, foxandkgram.maxK(len));
    }

    @Test
    public void case229() {
        int[] len = { 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
        assertEquals(11, foxandkgram.maxK(len));
    }

    @Test
    public void case230() {
        int[] len = { 1, 1, 1, 1, 1, 1, 2 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case231() {
        int[] len = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case232() {
        int[] len = { 1, 2, 2, 7, 7, 7, 7, 7, 7, 7 };
        assertEquals(7, foxandkgram.maxK(len));
    }

    @Test
    public void case233() {
        int[] len = { 3, 1, 1, 1, 1, 1, 1 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case234() {
        int[] len = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case235() {
        int[] len = { 4, 4, 4, 2, 2, 1 };
        assertEquals(4, foxandkgram.maxK(len));
    }

    @Test
    public void case236() {
        int[] len = { 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case237() {
        int[] len = { 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20 };
        assertEquals(20, foxandkgram.maxK(len));
    }

    @Test
    public void case238() {
        int[] len = { 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case239() {
        int[] len = { 10, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 1 };
        assertEquals(11, foxandkgram.maxK(len));
    }

    @Test
    public void case240() {
        int[] len = { 4, 2, 2, 2, 1 };
        assertEquals(2, foxandkgram.maxK(len));
    }

    @Test
    public void case241() {
        int[] len = { 2, 3, 2, 3, 2, 3, 2, 3, 2, 5 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case242() {
        int[] len = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case243() {
        int[] len = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3 };
        assertEquals(3, foxandkgram.maxK(len));
    }

    @Test
    public void case244() {
        int[] len = { 1, 1, 1, 2, 2, 1 };
        assertEquals(2, foxandkgram.maxK(len));
    }

    @Test
    public void case245() {
        int[] len = { 1, 4, 4, 4, 4, 4, 4, 5 };
        assertEquals(4, foxandkgram.maxK(len));
    }

    @Test
    public void case246() {
        int[] len = { 3, 1, 2, 1, 1 };
        assertEquals(1, foxandkgram.maxK(len));
    }

    @Test
    public void case247() {
        int[] len = { 2, 2, 5, 5 };
        assertEquals(2, foxandkgram.maxK(len));
    }

    @Test
    public void case248() {
        int[] len = { 1, 1, 1, 1, 1, 4, 4, 4, 4, 4, 3, 3 };
        assertEquals(4, foxandkgram.maxK(len));
    }

    @Test
    public void case249() {
        int[] len = { 3, 1, 50 };
        assertEquals(1, foxandkgram.maxK(len));
    }

}
