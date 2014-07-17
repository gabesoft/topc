package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class IncrementingSequenceTest {
    IncrementingSequence incrementingsequence = new IncrementingSequence();

    @Test
    public void case1() {
        int k = 3;
        int[] A = { 1, 2, 4, 3 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case2() {
        int k = 5;
        int[] A = { 2, 2 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case3() {
        int k = 1;
        int[] A = { 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case4() {
        int k = 2;
        int[] A = { 5, 3, 3, 2, 1 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case5() {
        int k = 9;
        int[] A = { 1, 2, 3, 1, 4, 5, 6, 7, 9, 8 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case6() {
        int k = 2;
        int[] A = { 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case7() {
        int k = 1;
        int[] A = { 1 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case8() {
        int k = 4;
        int[] A = { 13, 16, 9, 41, 3, 24, 25, 21, 12, 34, 22, 39, 31, 33, 10, 35, 27, 1, 6, 8, 44, 29, 15, 5, 45, 14, 40, 28, 20, 26, 36, 43, 7, 11, 38, 19, 4, 37, 46, 32, 23, 18, 2, 17, 30, 42, 47 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case9() {
        int k = 8;
        int[] A = { 1, 13, 12, 36, 29, 20, 15, 10, 1, 35, 17, 15, 26, 11, 13, 4, 3, 5, 15, 39, 28, 21, 16, 18, 8, 22, 2, 33, 27, 19, 14, 7, 18, 38, 32, 24, 17, 30, 6 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case10() {
        int k = 2;
        int[] A = { 1, 21, 2, 23, 11, 13, 28, 24, 27, 7, 8, 22, 33, 19, 12, 26, 27, 16, 16, 31, 17, 34, 32, 10, 6, 7, 13, 23, 30, 20, 2, 3, 14, 3 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case11() {
        int k = 5;
        int[] A = { 9, 32, 18, 5, 22, 33, 13, 17, 2, 26, 24, 35, 14, 15, 23, 3, 29, 20, 16, 27, 18, 11, 10, 8, 1, 7, 4, 34, 36, 19, 21, 30, 6, 12, 31, 25 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case12() {
        int k = 7;
        int[] A = { 22, 27, 39, 34, 36, 43, 25, 16, 24, 2, 33, 8, 18, 37, 42, 15, 13, 48, 30, 17, 33, 29, 4, 39, 37, 32, 23, 28, 31, 11, 3, 40, 45, 14, 19, 1, 6, 19, 20, 7, 21, 41, 5, 35, 10, 12, 2, 17 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case13() {
        int k = 5;
        int[] A = { 2, 4, 2, 1, 5, 3, 1 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case14() {
        int k = 2;
        int[] A = { 2, 26, 8, 20, 23, 4, 27, 12, 9, 1, 4, 5, 16, 25, 19, 31, 14, 28, 22, 13, 21, 24, 17, 23, 8, 18, 28, 1, 7, 15, 11 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case15() {
        int k = 4;
        int[] A = { 14, 5, 13, 4, 3, 22, 12, 6, 10, 8, 9, 11, 17, 19, 3, 9, 2, 15, 18, 20, 19, 4, 1 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case16() {
        int k = 7;
        int[] A = { 31, 1, 16, 20, 7, 36, 46, 10, 41, 23, 42, 8, 5, 9, 34, 32, 14, 11, 6, 35, 25, 45, 50, 47, 18, 40, 28, 12, 30, 39, 27, 3, 24, 37, 44, 38, 4, 15, 10, 29, 26, 43, 19, 48, 6, 33, 21, 49, 2, 22 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case17() {
        int k = 4;
        int[] A = { 1, 2, 4, 3, 1, 2 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case18() {
        int k = 2;
        int[] A = { 6, 11, 2, 20, 13, 14, 6, 21, 7, 1, 4, 12, 5, 3, 9, 8, 19, 17, 15, 14, 18 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case19() {
        int k = 7;
        int[] A = { 6, 7, 8, 3, 1, 9, 3, 2, 4, 5 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case20() {
        int k = 10;
        int[] A = { 8, 30, 8, 17, 35, 3, 12, 21, 24, 34, 10, 9, 36, 38, 1, 10, 6, 3, 39, 30, 27, 1, 26, 19, 22, 29, 7, 37, 25, 14, 13, 5, 2, 28, 15, 4, 33, 31, 16, 22, 41 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case21() {
        int k = 9;
        int[] A = { 1, 8, 2, 2, 3, 5, 4, 9, 3, 4, 1, 6, 7 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case22() {
        int k = 10;
        int[] A = { 2, 16, 9, 21, 10, 15, 12, 13, 14, 9, 22, 3, 17, 27, 18, 3, 11, 1, 8, 10, 14, 28, 25, 26, 19, 5, 4, 6, 7 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case23() {
        int k = 10;
        int[] A = { 3, 2, 17, 16, 15, 7, 19, 23, 8, 24, 1, 10, 8, 5, 9, 15, 22, 12, 11, 6, 13, 14, 21, 26, 20, 4 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case24() {
        int k = 5;
        int[] A = { 21, 13, 24, 22, 18, 26, 3, 25, 33, 2, 6, 6, 31, 14, 4, 7, 1, 10, 29, 2, 5, 20, 4, 32, 8, 27, 31, 25, 28, 17, 15, 35, 34, 9, 16, 23 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case25() {
        int k = 9;
        int[] A = { 2, 1 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case26() {
        int k = 6;
        int[] A = { 20, 11, 36, 44, 9, 12, 39, 1, 25, 43, 29, 33, 16, 50, 3, 40, 14, 42, 43, 13, 18, 27, 38, 32, 2, 47, 31, 5, 15, 4, 10, 6, 35, 19, 7, 39, 48, 28, 17, 21, 23, 46, 22, 34, 37, 26, 12, 41, 8, 30 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case27() {
        int k = 9;
        int[] A = { 3, 2, 1 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case28() {
        int k = 7;
        int[] A = { 1, 2 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case29() {
        int k = 8;
        int[] A = { 2, 10, 18, 6, 12, 8, 11, 7, 13, 5, 19, 12, 17, 9, 3, 13, 14, 4, 16, 15, 1 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case30() {
        int k = 7;
        int[] A = { 4, 5, 7, 2, 3, 1, 6 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case31() {
        int k = 9;
        int[] A = { 6, 4, 7, 5, 1, 2, 3 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case32() {
        int k = 8;
        int[] A = { 9, 10, 14, 24, 23, 21, 12, 6, 15, 26, 12, 3, 8, 25, 16, 19, 27, 5, 4, 10, 2, 5, 22, 1, 7, 17, 11 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case33() {
        int k = 10;
        int[] A = { 11, 19, 26, 6, 7, 9, 15, 12, 27, 22, 5, 23, 6, 14, 20, 1, 8, 10, 11, 20, 24, 7, 25, 2, 3, 29, 3, 4, 8, 28 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case34() {
        int k = 8;
        int[] A = { 28, 10, 21, 18, 1, 12, 2, 31, 3, 14, 27, 4, 6, 25, 5, 22, 7, 39, 20, 5, 17, 30, 38, 24, 15, 34, 33, 19, 8, 40, 26, 29, 27, 9, 15, 36, 24, 8, 11, 33, 29 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case35() {
        int k = 10;
        int[] A = { 28, 8, 33, 1, 32, 26, 10, 12, 9, 4, 36, 5, 16, 20, 37, 35, 3, 34, 5, 24, 18, 31, 13, 29, 2, 21, 1, 7, 13, 14, 6, 27, 19, 17, 22, 25, 30 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case36() {
        int k = 10;
        int[] A = { 3, 14, 39, 12, 18, 19, 25, 2, 42, 22, 4, 23, 24, 13, 9, 12, 29, 38, 31, 1, 11, 31, 33, 16, 10, 18, 8, 20, 15, 26, 5, 11, 40, 7, 30, 37, 35, 27, 16, 17, 6, 4 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case37() {
        int k = 7;
        int[] A = { 35, 7, 2, 16, 23, 26, 13, 24, 37, 30, 1, 33, 17, 29, 8, 15, 20, 12, 28, 10, 38, 14, 6, 5, 18, 27, 32, 3, 13, 40, 25, 4, 39, 15, 31, 4, 19, 9, 21, 36 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case38() {
        int k = 8;
        int[] A = { 5, 7, 6, 3, 8, 4, 2, 2, 1, 1 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case39() {
        int k = 9;
        int[] A = { 6, 1, 4, 5, 3, 2 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case40() {
        int k = 8;
        int[] A = { 9, 20, 19, 24, 7, 25, 5, 4, 14, 21, 15, 16, 6, 1, 15, 8, 1, 10, 13, 22, 18, 18, 3, 4, 2, 3 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case41() {
        int k = 5;
        int[] A = { 17, 1, 10, 13, 7, 23, 14, 11, 5, 22, 1, 20, 2, 10, 1, 3, 12, 16, 18, 9, 3, 4, 4 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case42() {
        int k = 4;
        int[] A = { 3, 15, 2, 12, 8, 3, 6, 1, 13, 1, 4, 14, 8, 7, 1, 2 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case43() {
        int k = 3;
        int[] A = { 41, 32, 24, 16, 34, 34, 2, 6, 27, 7, 42, 40, 8, 11, 11, 19, 1, 43, 22, 35, 18, 23, 13, 9, 21, 20, 38, 33, 29, 15, 31, 36, 17, 10, 5, 26, 12, 3, 30, 4, 28, 25, 39 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case44() {
        int k = 6;
        int[] A = { 2, 4, 5, 1, 1, 6, 3 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case45() {
        int k = 10;
        int[] A = { 34, 26, 10, 23, 2, 3, 13, 31, 11, 12, 15, 8, 30, 7, 9, 11, 29, 6, 7, 1, 27, 15, 20, 5, 14, 9, 26, 33, 8, 22, 22, 16, 4, 28, 24, 35 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case46() {
        int k = 3;
        int[] A = { 7, 11, 18, 10, 2, 9, 18, 2, 8, 16, 12, 20, 1, 4, 3, 6, 10, 15, 8, 22, 14, 13 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case47() {
        int k = 9;
        int[] A = { 8, 1, 3, 4, 7, 2, 9, 6, 5, 1, 2 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case48() {
        int k = 8;
        int[] A = { 35, 11, 2, 7, 34, 5, 25, 3, 21, 14, 27, 8, 13, 20, 24, 21, 4, 18, 25, 22, 1, 15, 18, 6, 30, 31, 1, 32, 10, 7, 9, 12, 28, 3, 36, 16 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case49() {
        int k = 9;
        int[] A = { 2, 3, 1, 4 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case50() {
        int k = 2;
        int[] A = { 48, 7, 29, 24, 41, 40, 50, 7, 44, 11, 34, 13, 23, 39, 27, 37, 45, 14, 33, 22, 3, 36, 32, 30, 6, 31, 3, 8, 28, 4, 20, 35, 17, 49, 6, 42, 1, 12, 38, 25, 24, 18, 16, 19, 46, 47, 2, 21, 43, 15 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case51() {
        int k = 3;
        int[] A = { 13, 16, 41, 3, 38, 24, 8, 37, 7, 25, 20, 9, 18, 23, 26, 40, 30, 32, 19, 3, 31, 32, 21, 1, 15, 28, 36, 6, 22, 39, 4, 14, 28, 2, 10, 5, 27, 17, 5, 26, 33 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case52() {
        int k = 4;
        int[] A = { 2, 3, 4, 1 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case53() {
        int k = 4;
        int[] A = { 6, 30, 9, 36, 1, 19, 32, 23, 10, 15, 34, 26, 16, 16, 8, 11, 31, 5, 33, 24, 2, 28, 27, 7, 31, 37, 3, 18, 9, 4, 21, 25, 17, 22, 14, 8, 29 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case54() {
        int k = 2;
        int[] A = { 28, 14, 32, 8, 17, 3, 15, 26, 13, 7, 4, 19, 27, 29, 38, 16, 21, 20, 23, 34, 5, 2, 31, 30, 37, 10, 42, 35, 1, 18, 22, 11, 36, 24, 39, 25, 33, 12, 6, 40, 9, 41 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case55() {
        int k = 3;
        int[] A = { 1, 3, 14, 11, 9, 4, 8, 7, 6, 7, 2, 7, 5, 9 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case56() {
        int k = 6;
        int[] A = { 5, 11, 9, 18, 13, 8, 12, 16, 8, 10, 17, 6, 4, 7, 2, 1, 3, 9 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case57() {
        int k = 7;
        int[] A = { 22, 8, 2, 11, 1, 1, 5, 7, 13, 7, 3, 2, 4, 10, 12, 20, 9, 14, 19, 3, 4, 6 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case58() {
        int k = 9;
        int[] A = { 4, 7, 5, 1, 4, 9, 2, 6, 5, 1, 6, 4, 3, 6, 5, 2, 5, 5, 2, 1, 9, 8, 7, 7, 7, 8, 6, 4, 2, 4, 3, 8, 3, 1, 2, 1, 9, 3, 6, 9, 3, 7, 8 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case59() {
        int k = 7;
        int[] A = { 5, 4, 6, 3, 3, 1, 3, 5, 5, 4, 2, 2, 4, 1, 7, 2, 1, 7, 3, 7, 1, 3, 3, 6, 2, 6, 4, 2, 1, 4, 6, 6, 6, 1, 2, 5, 5, 7, 7, 5, 4 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case60() {
        int k = 7;
        int[] A = { 3, 4, 1, 7, 3, 3, 5, 2, 6, 6, 5, 5, 6, 7, 6, 2, 2, 23, 6, 7, 1, 4, 28, 2, 1, 4, 4, 5, 1, 5, 1, 4, 1, 3, 10, 4, 2, 7, 6, 7, 5, 10, 15, 2 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case61() {
        int k = 10;
        int[] A = { 1, 1, 4, 5, 9, 2, 10, 7, 5, 4, 8, 10, 2, 10, 5, 8, 6, 4, 9, 7, 10, 3, 4, 4, 3, 2, 2, 1, 1, 6, 7, 1, 3, 3, 8, 7, 5, 6, 9, 6, 2, 3, 9, 8 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case62() {
        int k = 10;
        int[] A = { 1, 2, 1, 9, 5, 6, 2, 1, 3, 1, 10, 8, 9, 3, 7, 2, 4, 9, 5, 5, 2, 10, 6, 10, 4, 10, 6, 7, 4, 1, 8, 9, 8, 3, 3, 5, 7, 8, 4, 6, 7 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case63() {
        int k = 6;
        int[] A = { 5, 4, 1, 2, 5, 4, 5, 3, 6, 4, 6, 4, 3, 5, 6, 4, 3, 2, 6, 3, 1, 2, 1, 5, 4, 6, 2, 2, 4, 1, 1, 2, 6, 1, 2, 4, 1, 3, 2, 3, 1, 6, 5, 3, 6, 1, 5, 2, 5, 3 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case64() {
        int k = 9;
        int[] A = { 3, 1, 2, 9, 8, 5, 1, 1, 3, 5, 9, 8, 2, 2, 9, 6, 1, 6, 7, 6, 4, 2, 9, 3, 7, 7, 8, 7, 2, 1, 5, 9, 4, 7, 4, 4, 4, 1, 2, 8, 8, 5, 6, 5, 6, 3, 3 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case65() {
        int k = 7;
        int[] A = { 3, 2, 6, 5, 2, 4, 4, 1, 7, 1, 6, 4, 3, 7, 1, 7, 2, 3, 7, 1, 7, 4, 1, 3, 2, 1, 1, 3, 5, 4, 3, 6, 6, 7, 6, 2, 3, 5, 2, 5, 4, 2, 4, 5, 6, 5 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case66() {
        int k = 8;
        int[] A = { 6, 3, 6, 3, 8, 8, 7, 4, 1, 6, 1, 4, 1, 5, 5, 5, 2, 3, 7, 3, 3, 4, 5, 6, 5, 8, 8, 4, 1, 1, 7, 1, 2, 2, 2, 7, 3, 2, 4, 6, 2, 4, 8, 7 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case67() {
        int k = 10;
        int[] A = { 3, 6, 7, 1, 5, 6, 1, 1, 10, 5, 3, 1, 7, 6, 8, 10, 8, 2, 10, 10, 5, 4, 9, 7, 7, 2, 8, 1, 4, 6, 8, 2, 3, 2, 3, 4, 9, 9, 3, 2, 9, 4, 5 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case68() {
        int k = 6;
        int[] A = { 12, 25, 22, 27, 5, 15, 31, 26, 1, 20, 8, 3, 14, 11, 23, 29, 34, 32, 5, 21, 16, 2, 10, 6, 7, 13, 33, 18, 28, 17, 24, 9, 30, 19 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case69() {
        int k = 2;
        int[] A = { 2, 11, 11, 17, 14, 5, 8, 9, 4, 8, 16, 7, 7, 12, 15, 1, 1 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case70() {
        int k = 8;
        int[] A = { 17, 11, 6, 23, 14, 13, 18, 10, 22, 13, 4, 1, 2, 8, 5, 7, 15, 19, 16, 13, 3, 9, 20 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case71() {
        int k = 5;
        int[] A = { 20, 13, 2, 5, 13, 6, 3, 4, 1, 2, 18, 4, 15, 19, 6, 9, 8, 12, 5, 16 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case72() {
        int k = 5;
        int[] A = { 3, 14, 22, 2, 18, 6, 4, 17, 6, 9, 13, 2, 11, 7, 21, 4, 5, 1, 3, 11, 5, 23, 20 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case73() {
        int k = 2;
        int[] A = { 17, 15, 9, 22, 13, 23, 21, 17, 12, 5, 14, 2, 11, 4, 6, 19, 1, 10, 7, 18, 20, 8, 1 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case74() {
        int k = 4;
        int[] A = { 1, 10, 10, 12, 32, 21, 17, 20, 28, 26, 27, 6, 24, 23, 33, 19, 18, 15, 25, 2, 7, 16, 8, 30, 11, 13, 29, 14, 3, 4, 22, 31, 5 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case75() {
        int k = 8;
        int[] A = { 16, 6, 7, 1, 19, 21, 9, 20, 18, 30, 24, 15, 31, 5, 28, 26, 17, 10, 27, 8, 6, 15, 25, 3, 14, 2, 11, 4, 13, 13, 5 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case76() {
        int k = 8;
        int[] A = { 2, 2 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case77() {
        int k = 8;
        int[] A = { 19, 29, 31, 34, 18, 30, 3, 21, 3, 9, 33, 24, 24, 41, 14, 4, 26, 28, 10, 35, 30, 15, 17, 23, 5, 17, 7, 13, 16, 28, 37, 4, 20, 40, 8, 1, 2, 11, 6, 39, 23 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case78() {
        int k = 9;
        int[] A = { 7, 1, 6, 5, 4, 8, 2, 1, 9, 4, 6, 2, 4, 3, 5, 7 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case79() {
        int k = 9;
        int[] A = { 16, 15, 11, 2, 14, 7, 9, 3, 3, 5, 2, 4, 17, 13, 6, 8, 10 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case80() {
        int k = 3;
        int[] A = { 13, 2, 11, 9, 18, 6, 19, 12, 15, 4, 4, 15, 3, 20, 5, 5, 14, 10, 13, 1 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case81() {
        int k = 9;
        int[] A = { 4, 1, 6, 4, 5, 2 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case82() {
        int k = 10;
        int[] A = { 27, 13, 7, 4, 2, 8, 10, 24, 25, 18, 23, 12, 9, 6, 1, 14, 10, 5, 15, 2, 27, 19, 11, 16, 3, 17, 21 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case83() {
        int k = 4;
        int[] A = { 3, 6, 3, 11, 22, 25, 28, 4, 18, 8, 27, 19, 30, 10, 21, 27, 34, 20, 23, 24, 17, 15, 12, 2, 36, 5, 1, 31, 29, 13, 33, 10, 5, 31, 8, 24 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case84() {
        int k = 8;
        int[] A = { 8, 27, 36, 3, 38, 42, 37, 40, 30, 22, 23, 6, 31, 26, 43, 39, 24, 2, 7, 18, 13, 14, 5, 16, 24, 20, 41, 46, 3, 45, 15, 28, 9, 35, 41, 33, 2, 34, 14, 40, 4, 47, 29, 1, 4, 19, 44, 17, 25 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case85() {
        int k = 9;
        int[] A = { 14, 6, 1, 3, 5, 12, 16, 10, 8, 9, 7, 2, 4, 13, 15, 12 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case86() {
        int k = 3;
        int[] A = { 36, 15, 2, 24, 22, 29, 26, 37, 16, 31, 19, 12, 20, 40, 42, 43, 7, 21, 4, 1, 33, 6, 9, 3, 44, 32, 34, 11, 27, 41, 17, 10, 25, 23, 15, 12, 39, 30, 35, 5, 38, 42, 5, 28, 13 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case87() {
        int k = 9;
        int[] A = { 6, 2, 3, 8, 7, 5, 2, 1, 4, 9 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case88() {
        int k = 5;
        int[] A = { 12, 41, 31, 23, 24, 8, 36, 32, 15, 5, 2, 17, 26, 27, 30, 30, 4, 4, 13, 32, 33, 25, 43, 7, 29, 1, 22, 14, 5, 15, 11, 44, 13, 1, 39, 21, 42, 9, 16, 28, 35, 19, 23, 34 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case89() {
        int k = 4;
        int[] A = { 15, 6, 2, 2, 4, 3, 5, 14, 4, 7, 12, 9, 7, 12, 2, 9 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case90() {
        int k = 2;
        int[] A = { 11, 8, 3, 7, 1, 6, 20, 16, 17, 4, 11, 21, 9, 14, 12, 22, 2, 13, 19, 18, 5, 15 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case91() {
        int k = 6;
        int[] A = { 21, 22, 19, 5, 24, 26, 23, 2, 11, 4, 6, 14, 25, 10, 20, 1, 7, 11, 6, 4, 2, 18, 16, 9, 13, 15 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case92() {
        int k = 10;
        int[] A = { 7, 1, 10, 15, 9, 6, 3, 12, 5, 11, 4, 2, 13, 8, 5 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case93() {
        int k = 10;
        int[] A = { 5, 6, 2, 17, 14, 1, 8, 13, 22, 12, 36, 27, 8, 35, 26, 20, 3, 31, 24, 11, 6, 28, 9, 10, 15, 30, 16, 21, 29, 23, 19, 33, 32, 4, 7, 34, 37 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case94() {
        int k = 7;
        int[] A = { 3, 7, 18, 27, 4, 17, 28, 25, 9, 13, 6, 15, 10, 23, 11, 10, 21, 7, 29, 22, 8, 2, 30, 5, 5, 1, 12, 26, 20, 24 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case95() {
        int k = 6;
        int[] A = { 16, 37, 12, 39, 42, 23, 3, 29, 13, 10, 21, 12, 28, 26, 1, 11, 15, 5, 38, 8, 4, 43, 33, 9, 32, 6, 20, 25, 22, 30, 36, 35, 14, 1, 23, 38, 40, 7, 35, 11, 24, 2, 27, 25 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case96() {
        int k = 2;
        int[] A = { 17, 38, 35, 28, 24, 37, 3, 40, 44, 41, 29, 15, 1, 23, 37, 11, 33, 7, 9, 4, 25, 34, 10, 19, 14, 27, 8, 21, 45, 12, 31, 39, 26, 5, 30, 2, 13, 32, 43, 6, 16, 20, 49, 42, 47, 46, 48, 22, 18 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case97() {
        int k = 8;
        int[] A = { 1, 5, 7, 2, 2, 5, 8, 6, 3, 3, 1 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case98() {
        int k = 7;
        int[] A = { 2, 1, 7, 5, 6, 5, 3 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case99() {
        int k = 9;
        int[] A = { 3, 3, 11, 9, 20, 23, 4, 2, 13, 18, 27, 16, 19, 6, 21, 14, 25, 10, 23, 8, 7, 5, 24, 15, 1, 17, 26 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case100() {
        int k = 4;
        int[] A = { 4, 2, 4, 1, 11, 4, 7, 1, 9, 3, 7, 6, 1 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case101() {
        int k = 7;
        int[] A = { 43, 6, 31, 27, 10, 7, 30, 20, 8, 23, 23, 2, 13, 35, 33, 3, 14, 30, 4, 25, 19, 39, 42, 9, 11, 27, 12, 24, 21, 29, 15, 26, 41, 40, 36, 1, 18, 5, 17, 31, 28, 32, 9 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case102() {
        int k = 3;
        int[] A = { 8, 33, 32, 13, 12, 28, 37, 24, 7, 40, 3, 22, 39, 29, 35, 6, 20, 36, 10, 17, 14, 38, 4, 16, 31, 23, 1, 2, 16, 5, 27, 21, 18, 30, 11, 34, 9, 25, 23, 19 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case103() {
        int k = 8;
        int[] A = { 27, 3, 19, 20, 10, 8, 24, 10, 2, 5, 3, 7, 17, 29, 13, 22, 17, 12, 6, 9, 6, 1, 26, 8, 12, 24, 22, 7, 21, 4 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case104() {
        int k = 9;
        int[] A = { 46, 24, 8, 23, 29, 47, 26, 42, 40, 36, 20, 32, 37, 25, 7, 21, 16, 10, 22, 4, 14, 17, 19, 38, 39, 44, 9, 2, 35, 11, 6, 13, 3, 45, 12, 30, 5, 49, 33, 31, 15, 43, 27, 48, 41, 28, 50, 35, 1, 18 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case105() {
        int k = 6;
        int[] A = { 8, 23, 13, 4, 9, 7, 5, 5, 14, 18, 11, 14, 15, 19, 6, 3, 22, 1, 12, 22, 10, 2, 10 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case106() {
        int k = 3;
        int[] A = { 1, 30, 11, 28, 24, 32, 31, 21, 36, 37, 15, 2, 12, 6, 22, 2, 10, 18, 20, 7, 17, 8, 3, 5, 34, 39, 38, 35, 23, 20, 29, 33, 19, 25, 16, 13, 14, 24, 9 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case107() {
        int k = 4;
        int[] A = { 1, 2, 3, 1, 5, 2 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case108() {
        int k = 10;
        int[] A = { 3, 2, 2 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case109() {
        int k = 10;
        int[] A = { 5, 9, 5, 7, 11, 3, 5, 6, 3, 8, 2, 17, 6, 14, 10, 10, 9, 18, 1, 2 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case110() {
        int k = 10;
        int[] A = { 1, 3, 16, 12, 21, 10, 8, 9, 19, 5, 2, 24, 22, 10, 17, 5, 4, 7, 24, 8, 1, 6, 14, 13 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case111() {
        int k = 8;
        int[] A = { 7, 5, 2, 5, 3, 6, 1, 8 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case112() {
        int k = 6;
        int[] A = { 4, 2, 3, 2 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case113() {
        int k = 6;
        int[] A = { 8, 21, 10, 2, 7, 13, 12, 17, 14, 9, 6, 15, 4, 11, 1, 3, 21, 5, 16, 12, 19 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case114() {
        int k = 2;
        int[] A = { 2, 2 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case115() {
        int k = 9;
        int[] A = { 8, 5, 26, 14, 10, 3, 4, 7, 10, 25, 15, 20, 20, 13, 23, 27, 18, 9, 1, 6, 16, 24, 3, 12, 2, 14, 17, 28, 11 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case116() {
        int k = 7;
        int[] A = { 4, 5, 1, 4, 2, 6, 7, 3, 3, 2, 1, 6 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case117() {
        int k = 4;
        int[] A = { 3, 1, 2, 2, 4 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case118() {
        int k = 6;
        int[] A = { 34, 2, 17, 31, 13, 10, 3, 7, 16, 33, 23, 8, 18, 7, 22, 13, 30, 9, 21, 26, 2, 12, 30, 6, 2, 22, 4, 31, 19, 33, 35, 13, 5, 18, 27 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case119() {
        int k = 2;
        int[] A = { 5, 5, 5, 5, 5 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case120() {
        int k = 7;
        int[] A = { 28, 42, 4, 12, 39, 2, 21, 13, 11, 35, 44, 5, 37, 4, 33, 24, 32, 4, 30, 9, 21, 9, 41, 42, 25, 22, 22, 18, 17, 16, 35, 43, 10, 26, 8, 12, 30, 28, 21, 41, 24, 37, 35, 14 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case121() {
        int k = 9;
        int[] A = { 16, 22, 28, 25, 9, 30, 16, 10, 10, 28, 21, 10, 6, 24, 16, 28, 10, 23, 27, 19, 4, 30, 30, 11, 27, 5, 16, 10, 25, 8 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case122() {
        int k = 4;
        int[] A = { 29, 8, 12, 31, 15, 15, 17, 3, 8, 21, 5, 21, 30, 14, 6, 29, 3, 18, 13, 28, 18, 26, 5, 5, 20, 22, 24, 1, 8, 25, 24 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case123() {
        int k = 2;
        int[] A = { 9, 12, 21, 5, 14, 3, 21, 4, 8, 11, 9, 5, 8, 18, 11, 16, 17, 16, 21, 15, 10 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case124() {
        int k = 6;
        int[] A = { 35, 7, 10, 41, 11, 30, 22, 3, 40, 25, 31, 2, 41, 13, 10, 18, 21, 15, 24, 23, 20, 41, 32, 36, 26, 7, 41, 19, 41, 19, 32, 4, 26, 11, 26, 20, 13, 30, 8, 30, 38 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case125() {
        int k = 2;
        int[] A = { 2, 2 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case126() {
        int k = 3;
        int[] A = { 6, 17, 2, 4, 3, 13, 17, 8, 9, 17, 10, 11, 3, 17, 17, 15, 9 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case127() {
        int k = 10;
        int[] A = { 38, 37, 33, 37, 29, 26, 28, 6, 10, 42, 10, 15, 10, 5, 33, 12, 32, 22, 6, 5, 42, 17, 30, 32, 33, 40, 20, 24, 27, 15, 22, 41, 19, 10, 19, 4, 32, 37, 23, 15, 42, 11 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case128() {
        int k = 10;
        int[] A = { 14, 10, 14, 15, 16, 4, 5, 10, 9, 11, 17, 10, 12, 8, 7, 10, 8 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case129() {
        int k = 2;
        int[] A = { 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case130() {
        int k = 10;
        int[] A = { 3, 10, 6, 12, 21, 19, 2, 11, 16, 13, 4, 6, 27, 13, 8, 28, 14, 17, 22, 6, 7, 20, 17, 2, 25, 11, 25, 2 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case131() {
        int k = 9;
        int[] A = { 33, 13, 18, 20, 17, 14, 23, 20, 31, 33, 7, 24, 8, 9, 15, 17, 2, 11, 16, 3, 27, 29, 7, 21, 11, 12, 13, 32, 32, 19, 16, 9, 5 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case132() {
        int k = 9;
        int[] A = { 33, 28, 5, 13, 34, 11, 41, 40, 5, 13, 31, 35, 22, 43, 26, 32, 11, 28, 17, 24, 39, 19, 32, 7, 40, 43, 43, 26, 10, 33, 3, 16, 22, 28, 8, 14, 23, 21, 12, 19, 5, 29, 14 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case133() {
        int k = 3;
        int[] A = { 9, 19, 40, 18, 11, 37, 21, 39, 13, 33, 50, 50, 24, 3, 46, 27, 27, 31, 46, 38, 15, 43, 49, 5, 44, 27, 45, 8, 39, 6, 12, 13, 35, 21, 37, 9, 30, 34, 33, 5, 5, 17, 12, 43, 25, 24, 30, 48, 9, 19 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case134() {
        int k = 9;
        int[] A = { 7, 7, 7, 7, 7, 7, 7 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case135() {
        int k = 8;
        int[] A = { 29, 30, 10, 15, 4, 28, 18, 7, 30, 7, 13, 3, 13, 19, 15, 5, 21, 13, 20, 3, 14, 9, 20, 23, 30, 13, 10, 9, 5, 25 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case136() {
        int k = 10;
        int[] A = { 47, 3, 19, 6, 34, 7, 20, 34, 21, 15, 24, 21, 5, 7, 48, 23, 39, 46, 2, 10, 28, 18, 35, 4, 32, 26, 11, 45, 17, 30, 41, 4, 12, 38, 42, 36, 8, 25, 31, 27, 1, 34, 12, 28, 19, 43, 9, 13 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case137() {
        int k = 6;
        int[] A = { 17, 4, 16, 9, 14, 5, 17, 14, 12, 2, 2, 11, 10, 17, 11, 17, 6 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case138() {
        int k = 3;
        int[] A = { 13, 18, 18, 18, 11, 13, 15, 9, 18, 18, 9, 13, 16, 13, 11, 18, 18, 15 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case139() {
        int k = 7;
        int[] A = { 12, 37, 19, 25, 34, 22, 40, 17, 18, 6, 39, 13, 30, 34, 36, 39, 30, 10, 3, 15, 43, 22, 44, 41, 4, 21, 10, 28, 26, 10, 7, 36, 44, 25, 16, 31, 32, 12, 9, 45, 29, 24, 3, 18, 4 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case140() {
        int k = 6;
        int[] A = { 28, 33, 8, 25, 24, 27, 28, 15, 24, 25, 5, 33, 12, 3, 21, 13, 38, 30, 9, 34, 24, 6, 3, 5, 20, 2, 4, 25, 10, 11, 35, 5, 18, 2, 24, 8, 37, 19 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case141() {
        int k = 7;
        int[] A = { 6, 11, 22, 37, 16, 32, 3, 7, 32, 21, 4, 6, 13, 23, 9, 29, 3, 37, 8, 23, 15, 35, 21, 20, 18, 24, 11, 13, 7, 31, 29, 27, 36, 38, 25, 31, 14, 32 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case142() {
        int k = 8;
        int[] A = { 11, 12, 15, 21, 13, 5, 10, 6, 12, 9, 7, 4, 19, 12, 6, 6, 9, 8, 6, 7, 17 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case143() {
        int k = 2;
        int[] A = { 37, 8, 33, 27, 5, 21, 23, 29, 38, 10, 20, 15, 21, 40, 24, 30, 12, 24, 18, 35, 4, 33, 30, 39, 17, 29, 16, 27, 19, 1, 12, 4, 40, 9, 21, 9, 31, 8, 35, 37 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case144() {
        int k = 8;
        int[] A = { 6, 10, 13, 35, 3, 32, 4, 21, 26, 36, 38, 15, 26, 22, 8, 2, 3, 1, 34, 29, 17, 22, 1, 16, 15, 7, 34, 13, 17, 20, 3, 19, 31, 30, 20, 5, 28, 24 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case145() {
        int k = 3;
        int[] A = { 14, 3, 14, 14, 8, 10, 10, 10, 11, 14, 14, 9, 13, 13 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case146() {
        int k = 5;
        int[] A = { 8, 32, 12, 17, 30, 33, 3, 20, 11, 16, 29, 10, 33, 19, 20, 27, 12, 28, 23, 9, 4, 26, 16, 3, 21, 3, 27, 6, 7, 31, 12, 19, 33 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case147() {
        int k = 6;
        int[] A = { 4, 4, 4, 4 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case148() {
        int k = 3;
        int[] A = { 8, 7, 8, 8, 6, 7, 6, 6 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case149() {
        int k = 10;
        int[] A = { 18, 5, 34, 7, 38, 24, 4, 20, 36, 13, 40, 27, 33, 2, 33, 10, 15, 22, 23, 22, 30, 7, 12, 26, 15, 38, 40, 9, 18, 23, 28, 13, 36, 18, 40, 15, 29, 10, 40, 27 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case150() {
        int k = 6;
        int[] A = { 2, 2 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case151() {
        int k = 10;
        int[] A = { 11, 4, 5, 6, 11, 12, 5, 6, 8, 5, 12, 11 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case152() {
        int k = 10;
        int[] A = { 5, 6, 9, 22, 12, 14, 14, 9, 22, 16, 22, 8, 5, 10, 16, 7, 9, 14, 14, 22, 5, 19 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case153() {
        int k = 7;
        int[] A = { 8, 5, 4, 6, 2, 6, 13, 1, 9, 3, 2, 12, 13, 4, 7, 14, 11, 3 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case154() {
        int k = 8;
        int[] A = { 31, 12, 8, 15, 6, 28, 26, 28, 13, 22, 9, 18, 11, 25, 24, 30, 2, 21, 24, 1, 18, 20, 4, 19, 31, 16, 14, 5, 26, 6, 3 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case155() {
        int k = 3;
        int[] A = { 3, 3, 3 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case156() {
        int k = 8;
        int[] A = { 5, 5, 5, 5, 5 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case157() {
        int k = 2;
        int[] A = { 6, 13, 2, 4, 22, 3, 20, 2, 16, 8, 6, 15, 14, 2, 9, 5, 21, 12, 17, 18, 9, 17, 20 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case158() {
        int k = 2;
        int[] A = { 9, 9, 9, 9, 9, 9, 9, 9, 9 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case159() {
        int k = 10;
        int[] A = { 11, 12, 9, 6, 4, 4, 6, 9, 7, 12, 12, 5 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case160() {
        int k = 9;
        int[] A = { 28, 32, 9, 5, 36, 29, 34, 23, 12, 30, 19, 4, 21, 43, 14, 25, 10, 36, 10, 34, 2, 16, 43, 15, 31, 39, 22, 50, 26, 17, 6, 50, 8, 5, 18, 47, 12, 39, 40, 47, 20, 37, 16, 46, 9, 27, 41, 28, 15, 1 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case161() {
        int k = 10;
        int[] A = { 17, 17, 22, 15, 18, 31, 36, 6, 39, 38, 35, 29, 2, 18, 28, 13, 26, 17, 22, 9, 12, 7, 4, 30, 41, 1, 40, 33, 25, 16, 38, 24, 12, 10, 26, 41, 2, 32, 6, 43, 11, 10, 33 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case162() {
        int k = 4;
        int[] A = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case163() {
        int k = 2;
        int[] A = { 1, 1, 1, 1 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case164() {
        int k = 5;
        int[] A = { 22, 6, 12, 33, 2, 45, 33, 13, 30, 35, 28, 41, 39, 37, 34, 11, 10, 21, 4, 44, 17, 23, 42, 41, 40, 14, 24, 16, 14, 5, 27, 8, 31, 16, 26, 7, 32, 38, 1, 10, 19, 20, 35, 25, 7 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case165() {
        int k = 8;
        int[] A = { 7, 38, 2, 42, 17, 39, 27, 36, 5, 43, 14, 15, 22, 13, 34, 32, 44, 32, 27, 16, 34, 1, 45, 41, 3, 19, 22, 37, 47, 29, 10, 47, 20, 9, 28, 43, 25, 11, 26, 23, 9, 13, 12, 4, 8, 25, 23 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case166() {
        int k = 8;
        int[] A = { 42, 41, 4, 29, 46, 10, 36, 46, 43, 41, 15, 11, 24, 34, 23, 26, 38, 3, 7, 15, 5, 12, 31, 2, 34, 28, 24, 23, 19, 35, 30, 37, 33, 14, 10, 20, 17, 5, 8, 40, 45, 2, 48, 26, 6, 8, 22, 8 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case167() {
        int k = 2;
        int[] A = { 1, 1 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case168() {
        int k = 7;
        int[] A = { 25, 37, 17, 26, 18, 14, 3, 8, 4, 50, 1, 49, 31, 42, 15, 38, 3, 17, 5, 20, 6, 32, 14, 19, 24, 8, 34, 43, 37, 6, 36, 6, 45, 32, 2, 8, 47, 31, 29, 24, 18, 48, 40, 18, 41, 44, 14, 33, 27, 42 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case169() {
        int k = 4;
        int[] A = { 3, 11, 12, 11, 4, 6, 5, 5, 4, 6, 5, 12 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case170() {
        int k = 8;
        int[] A = { 1, 1 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case171() {
        int k = 2;
        int[] A = { 16, 31, 34, 28, 25, 4, 23, 11, 20, 2, 7, 25, 24, 18, 11, 3, 6, 33, 34, 16, 13, 15, 32, 24, 18, 9, 8, 29, 10, 2, 14, 18, 29, 21 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case172() {
        int k = 4;
        int[] A = { 2, 5, 5, 2, 4 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case173() {
        int k = 9;
        int[] A = { 9, 26, 1, 19, 4, 4, 20, 18, 26, 3, 14, 13, 11, 22, 6, 22, 2, 15, 35, 7, 23, 1, 32, 7, 19, 29, 19, 15, 36, 16, 28, 4, 18, 23, 23, 9, 21 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case174() {
        int k = 8;
        int[] A = { 5, 26, 5, 3, 17, 13, 25, 14, 2, 3, 19, 5, 7, 20, 3, 6, 8, 24, 15, 1, 25, 18, 3, 25, 3, 23, 23 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case175() {
        int k = 6;
        int[] A = { 32, 34, 44, 27, 25, 34, 33, 19, 40, 27, 7, 41, 37, 25, 35, 14, 5, 10, 40, 3, 16, 9, 31, 29, 23, 3, 27, 19, 13, 17, 22, 12, 42, 1, 36, 10, 46, 25, 47, 5, 23, 43, 46, 21, 20, 16, 7, 2 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case176() {
        int k = 5;
        int[] A = { 9, 22, 11, 15, 14, 17, 26, 16, 14, 6, 20, 18, 8, 18, 8, 26, 18, 22, 3, 5, 10, 1, 5, 6, 2, 17 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case177() {
        int k = 6;
        int[] A = { 5, 5, 5, 4, 4, 6 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case178() {
        int k = 5;
        int[] A = { 1, 2, 13, 7, 6, 27, 8, 16, 19, 8, 9, 17, 28, 3, 35, 24, 30, 25, 36, 17, 37, 21, 21, 21, 20, 28, 14, 22, 19, 29, 32, 11, 1, 5, 10, 32, 4 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case179() {
        int k = 6;
        int[] A = { 3, 2, 2, 8, 7, 5, 3, 8, 9, 3 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case180() {
        int k = 4;
        int[] A = { 31, 27, 9, 29, 13, 11, 21, 20, 32, 15, 6, 8, 21, 28, 8, 2, 23, 30, 10, 1, 20, 32, 13, 2, 9, 6, 23, 19, 19, 3, 14, 22 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case181() {
        int k = 10;
        int[] A = { 4, 1, 1, 2, 17, 6, 2, 5, 4, 8, 5, 7, 7, 3, 8, 9, 7, 1 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case182() {
        int k = 2;
        int[] A = { 22, 13, 19, 7, 2, 16, 16, 1, 10, 6, 10, 24, 15, 21, 4, 18, 10, 3, 11, 5, 20, 25, 5, 13, 25 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case183() {
        int k = 6;
        int[] A = { 29, 27, 23, 14, 30, 9, 18, 2, 19, 4, 2, 29, 13, 13, 27, 2, 5, 16, 33, 24, 15, 4, 29, 3, 33, 10, 13, 1, 12, 20, 5, 20, 8, 20 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case184() {
        int k = 5;
        int[] A = { 20, 50, 32, 10, 25, 24, 41, 29, 44, 44, 16, 26, 34, 36, 27, 29, 15, 5, 5, 1, 23, 38, 12, 21, 10, 35, 48, 34, 20, 21, 40, 7, 33, 43, 3, 17, 30, 13, 19, 15, 13, 8, 43, 32, 9, 44, 48, 48, 39, 2 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case185() {
        int k = 8;
        int[] A = { 25, 6, 11, 13, 24, 13, 10, 30, 8, 21, 19, 1, 16, 30, 18, 7, 20, 4, 15, 1, 2, 6, 11, 21, 28, 29, 26, 19, 26, 5, 15 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case186() {
        int k = 6;
        int[] A = { 1, 1 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case187() {
        int k = 9;
        int[] A = { 4, 10, 20, 23, 8, 13, 14, 25, 32, 25, 7, 22, 18, 37, 18, 13, 11, 5, 29, 12, 2, 9, 8, 12, 5, 34, 15, 14, 34, 1, 35, 24, 35, 17, 8, 1, 9 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case188() {
        int k = 3;
        int[] A = { 17, 5, 41, 31, 11, 44, 38, 26, 32, 24, 25, 10, 14, 48, 5, 43, 36, 49, 47, 4, 31, 14, 49, 8, 31, 8, 19, 3, 4, 28, 36, 29, 19, 22, 42, 37, 13, 2, 24, 2, 14, 41, 27, 47, 31, 8, 40, 17, 27, 12 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case189() {
        int k = 9;
        int[] A = { 18, 5, 43, 15, 37, 1, 3, 23, 18, 3, 31, 34, 12, 28, 26, 10, 3, 42, 24, 25, 14, 26, 16, 42, 37, 31, 21, 1, 15, 38, 26, 39, 41, 29, 43, 22, 9, 32, 29, 3, 38, 8, 9, 20, 6 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case190() {
        int k = 9;
        int[] A = { 4, 3, 3, 4 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case191() {
        int k = 3;
        int[] A = { 1, 1, 1, 1 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case192() {
        int k = 9;
        int[] A = { 5, 6, 2, 6, 6, 4 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case193() {
        int k = 8;
        int[] A = { 27, 1, 5, 13, 16, 35, 2, 20, 11, 18, 3, 4, 6, 3, 20, 25, 23, 17, 14, 11, 29, 34, 7, 36, 25, 19, 31, 15, 28, 9, 23, 17, 9, 33, 16, 26 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case194() {
        int k = 8;
        int[] A = { 7, 3, 29, 1, 26, 40, 7, 22, 23, 4, 4, 13, 25, 35, 28, 33, 27, 15, 24, 8, 36, 6, 11, 23, 5, 38, 18, 3, 31, 25, 12, 16, 30, 12, 23, 6, 9, 19, 20, 33 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case195() {
        int k = 5;
        int[] A = { 30, 24, 46, 3, 28, 1, 27, 41, 20, 40, 20, 13, 42, 24, 36, 22, 40, 46, 13, 5, 13, 38, 19, 5, 34, 41, 29, 10, 28, 18, 17, 35, 38, 9, 15, 6, 45, 2, 16, 31, 32, 16, 9, 7, 36, 24 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case196() {
        int k = 3;
        int[] A = { 15, 3, 10, 1, 12, 7, 14, 13, 3, 14, 6, 4, 8, 1, 7, 10, 1 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case197() {
        int k = 4;
        int[] A = { 26, 9, 25, 17, 23, 12, 3, 18, 1, 4, 6, 4, 10, 3, 12, 14, 22, 20, 7, 19, 7, 15, 19, 20, 8, 1 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case198() {
        int k = 4;
        int[] A = { 13, 2, 12, 21, 24, 7, 22, 21, 7, 1, 12, 4, 16, 10, 20, 23, 10, 19, 16, 9, 4, 13, 2, 9, 5 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case199() {
        int k = 3;
        int[] A = { 29, 8, 18, 6, 31, 29, 14, 10, 20, 27, 9, 18, 25, 15, 30, 13, 23, 22, 2, 4, 12, 22, 29, 16, 5, 19, 10, 1, 21, 3, 26, 6 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case200() {
        int k = 3;
        int[] A = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case201() {
        int k = 10;
        int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case202() {
        int k = 10;
        int[] A = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 11, 12, 13, 14, 5, 6, 7, 8, 9, 10 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case203() {
        int k = 8;
        int[] A = { 7, 6, 1, 2, 4, 5, 3, 8 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case204() {
        int k = 3;
        int[] A = { 5, 7, 33, 2, 35, 1, 39, 11, 43, 44, 36, 15, 40, 30, 29, 9, 15, 13, 26, 6, 11, 23, 37, 32, 19, 4, 28, 21, 38, 17, 5, 13, 26, 25, 33, 7, 34, 3, 27, 20, 18, 31, 7, 21 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case205() {
        int k = 10;
        int[] A = { 1, 2 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case206() {
        int k = 6;
        int[] A = { 6, 5, 3, 5, 7, 8, 12, 3, 2, 5, 16, 3, 1, 3, 6, 1, 4, 4, 1, 8, 2 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case207() {
        int k = 2;
        int[] A = { 24, 29, 1, 11, 42, 43, 44, 9, 1, 2, 33, 30, 41, 11, 27, 32, 14, 33, 8, 17, 36, 40, 20, 22, 10, 27, 15, 17, 16, 44, 35, 41, 18, 32, 27, 6, 17, 26, 32, 10, 5, 19, 4, 35 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case208() {
        int k = 2;
        int[] A = { 17, 2, 24, 5, 5, 26, 20, 31, 23, 18, 29, 8, 23, 16, 29, 11, 22, 2, 5, 32, 17, 28, 32, 11, 8, 7, 10, 10, 21, 2, 11, 15 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case209() {
        int k = 8;
        int[] A = { 4, 1, 2, 3, 5 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case210() {
        int k = 4;
        int[] A = { 18, 29, 37, 4, 19, 32, 27, 23, 38, 15, 25, 14, 8, 10, 13, 7, 35, 9, 10, 31, 12, 2, 5, 22, 30, 44, 1, 16, 16, 28, 33, 41, 3, 24, 34, 42, 39, 21, 40, 17, 32, 26, 15, 39 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case211() {
        int k = 8;
        int[] A = { 4, 8, 2, 12, 1, 8, 1, 6, 3, 7, 2, 18, 5, 3, 7, 11, 14, 1, 5 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case212() {
        int k = 3;
        int[] A = { 15, 7, 28, 21, 22, 3, 33, 39, 31, 1, 26, 20, 34, 36, 19, 20, 9, 9, 32, 15, 4, 4, 2, 38, 7, 22, 14, 11, 13, 21, 27, 25, 5, 27, 35, 29, 24, 5, 8 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case213() {
        int k = 5;
        int[] A = { 2, 2 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case214() {
        int k = 1;
        int[] A = { 1 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case215() {
        int k = 10;
        int[] A = { 1, 1, 4 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case216() {
        int k = 2;
        int[] A = { 5, 3, 3, 2, 1 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case217() {
        int k = 1;
        int[] A = { 3, 2, 1 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case218() {
        int k = 1;
        int[] A = { 1, 2, 5 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case219() {
        int k = 1;
        int[] A = { 2 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case220() {
        int k = 9;
        int[] A = { 1, 2, 3, 1, 4, 5, 6, 7, 9, 8 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case221() {
        int k = 9;
        int[] A = { 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case222() {
        int k = 2;
        int[] A = { 1, 4 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case223() {
        int k = 4;
        int[] A = { 3 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case224() {
        int k = 2;
        int[] A = { 2, 3, 4, 5 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case225() {
        int k = 1;
        int[] A = { 3, 3, 3, 3 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case226() {
        int k = 1;
        int[] A = { 3, 3, 3 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case227() {
        int k = 2;
        int[] A = { 2 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case228() {
        int k = 1;
        int[] A = { 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case229() {
        int k = 5;
        int[] A = { 5, 5, 5, 5, 5 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case230() {
        int k = 4;
        int[] A = { 1, 1, 1, 3 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case231() {
        int k = 2;
        int[] A = { 1, 2, 2, 3 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case232() {
        int k = 1;
        int[] A = { 50 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case233() {
        int k = 6;
        int[] A = { 1, 2, 4, 3 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case234() {
        int k = 5;
        int[] A = { 1, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case235() {
        int k = 3;
        int[] A = { 1, 2, 2, 2 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case236() {
        int k = 2;
        int[] A = { 1, 1, 4 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case237() {
        int k = 7;
        int[] A = { 1, 9 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case238() {
        int k = 1;
        int[] A = { 1, 1, 1, 1, 2, 3, 4 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case239() {
        int k = 2;
        int[] A = { 1, 1, 1, 1, 1, 1, 1, 1, 2 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case240() {
        int k = 2;
        int[] A = { 1, 2, 2, 2 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case241() {
        int k = 10;
        int[] A = { 5 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case242() {
        int k = 1;
        int[] A = { 2, 2 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case243() {
        int k = 2;
        int[] A = { 1, 2, 3, 4, 6, 1 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case244() {
        int k = 2;
        int[] A = { 1, 2, 3, 3, 4, 4 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case245() {
        int k = 2;
        int[] A = { 1, 1, 1, 1 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case246() {
        int k = 1;
        int[] A = { 1, 1, 1, 5 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case247() {
        int k = 4;
        int[] A = { 2, 3, 4, 5 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case248() {
        int k = 2;
        int[] A = { 1, 2, 3, 13 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case249() {
        int k = 5;
        int[] A = { 6 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case250() {
        int k = 3;
        int[] A = { 1, 2, 2, 2, 2, 3 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case251() {
        int k = 1;
        int[] A = { 1, 1, 3, 5 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case252() {
        int k = 2;
        int[] A = { 1, 3, 3, 3 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case253() {
        int k = 2;
        int[] A = { 1, 2, 3, 3, 4, 5, 5, 6, 8 };
        assertEquals("POSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case254() {
        int k = 4;
        int[] A = { 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

    @Test
    public void case255() {
        int k = 1;
        int[] A = { 2, 2, 3, 4 };
        assertEquals("IMPOSSIBLE", incrementingsequence.canItBeDone(k, A));
    }

}
