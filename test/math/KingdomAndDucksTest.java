package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class KingdomAndDucksTest {
    KingdomAndDucks kingdomandducks = new KingdomAndDucks();

    @Test
    public void case1() {
        int[] duckTypes = { 5, 8 };
        assertEquals(2, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case2() {
        int[] duckTypes = { 4, 7, 4, 7, 4 };
        assertEquals(6, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case3() {
        int[] duckTypes = { 17, 17, 19, 23, 23, 19, 19, 17, 17 };
        assertEquals(12, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case4() {
        int[] duckTypes = { 50 };
        assertEquals(1, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case5() {
        int[] duckTypes = { 10, 10, 10, 10, 10 };
        assertEquals(5, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case6() {
        int[] duckTypes = { 1 };
        assertEquals(1, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case7() {
        int[] duckTypes = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(50, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case8() {
        int[] duckTypes = { 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
        assertEquals(50, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case9() {
        int[] duckTypes = { 7, 26, 31, 35, 22, 20, 19, 49, 29, 47, 12, 1, 32, 45, 30, 23, 11, 27, 3, 2, 4, 9, 17, 24, 46, 5, 34, 14, 21, 28, 37, 39, 43, 41, 48, 38, 16, 25, 6, 8, 40, 42, 36, 18, 33, 50, 10, 44, 15, 13 };
        assertEquals(50, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case10() {
        int[] duckTypes = { 9, 3, 6, 5, 2, 1, 13, 13, 14, 1, 11, 11, 2, 12, 14, 7, 7, 8, 4, 8, 10, 12, 9, 10, 3, 5, 6, 4, 15 };
        assertEquals(30, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case11() {
        int[] duckTypes = { 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 7, 4, 4, 4, 4, 4, 4 };
        assertEquals(38, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case12() {
        int[] duckTypes = { 45, 34, 4, 34, 45, 12, 4, 34, 12, 34, 7, 25, 45, 12, 6, 7, 7, 12, 4, 45, 4, 7, 4, 7, 34, 7, 45, 6, 12, 4, 6, 45, 25, 34, 25, 25, 25, 4, 25, 25, 7, 45, 6, 34, 12, 6, 6, 6, 12 };
        assertEquals(49, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case13() {
        int[] duckTypes = { 2, 39, 14, 6, 14, 2, 6, 2, 6, 14, 2, 39, 14, 6, 39, 14, 6, 26, 39, 6, 2, 39, 14, 26, 14, 39, 14, 26, 26, 26, 6, 39, 26, 26, 2, 26, 6, 14, 26, 26, 14, 2, 39, 2, 39, 39, 6, 6, 2, 2 };
        assertEquals(50, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case14() {
        int[] duckTypes = { 24, 27, 27, 3, 24, 22, 27, 40, 21, 3, 24, 40, 40, 22, 29, 22, 21, 3, 22, 27, 22, 22, 29, 21, 22, 40, 22, 24, 22, 21, 3, 29, 40, 22, 21, 29, 22, 29, 27, 24, 22, 40, 27, 40, 29, 21, 24, 3, 3 };
        assertEquals(84, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case15() {
        int[] duckTypes = { 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27 };
        assertEquals(22, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case16() {
        int[] duckTypes = { 35, 8, 40, 18, 13, 8, 35, 13, 35, 13, 18, 13, 49, 35, 18, 13, 18, 35, 13, 40, 18, 35, 49, 8, 49, 40, 49, 35, 40, 40, 8, 18, 13, 35, 18, 35, 8, 49, 8, 49, 40, 18, 49, 49, 49, 40, 8 };
        assertEquals(54, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case17() {
        int[] duckTypes = { 9, 17, 17, 47, 19, 22, 41, 41, 4, 41, 4, 19, 5, 9, 17, 47, 19, 4, 5, 9, 9, 22, 9, 19, 41, 41, 17, 41, 47, 47, 22, 5, 22, 4, 5, 17, 41 };
        assertEquals(56, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case18() {
        int[] duckTypes = { 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32 };
        assertEquals(12, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case19() {
        int[] duckTypes = { 19, 17, 2, 2, 2, 17, 19, 2, 19, 19, 22, 23, 19, 17, 2, 2, 17, 22, 2, 23, 23, 17, 23, 2, 19, 2, 17, 23, 22 };
        assertEquals(45, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case20() {
        int[] duckTypes = { 15, 30, 13, 15, 13, 13, 21, 48, 21, 21, 48, 30, 30, 30, 48, 15, 21, 48, 48, 33, 21, 30, 15, 13, 15, 13, 30, 33, 15, 15, 33, 33, 21, 13, 48, 13, 33 };
        assertEquals(42, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case21() {
        int[] duckTypes = { 16, 44, 49, 44, 49, 44, 49, 44, 44, 44, 49, 16, 49, 44, 16, 16, 49, 44, 49 };
        assertEquals(24, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case22() {
        int[] duckTypes = { 1, 46, 46, 46, 1, 46, 1, 1, 46, 46, 46, 1, 1, 1, 46, 46, 1, 1, 46, 1, 1 };
        assertEquals(22, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case23() {
        int[] duckTypes = { 7, 32, 7, 20, 7, 20, 32, 32, 20, 7, 7, 7, 7, 7, 32, 20, 32, 7, 20, 32, 20 };
        assertEquals(27, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case24() {
        int[] duckTypes = { 29, 5, 29, 29, 29, 6, 34, 6, 34, 5, 5, 5, 29, 6, 34, 29, 6, 6, 34, 34, 29, 34, 6, 5, 5, 6, 5, 5, 34, 29, 5, 6, 6 };
        assertEquals(36, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case25() {
        int[] duckTypes = { 48, 48, 36, 36, 48, 36, 48, 32, 48, 21, 48, 48, 21, 48, 32, 48, 24, 24, 48, 36, 21, 21, 48, 32, 48, 32, 32, 21, 24, 48, 36, 24, 21, 48, 24, 36, 32, 24, 32, 24 };
        assertEquals(70, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case26() {
        int[] duckTypes = { 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15 };
        assertEquals(17, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case27() {
        int[] duckTypes = { 28, 8, 36, 42, 28, 42, 28, 42, 26, 42, 26, 42, 26, 36, 26, 8, 36, 26, 8, 36, 36, 42, 36, 8, 36, 8, 28, 42, 8, 8, 28 };
        assertEquals(35, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case28() {
        int[] duckTypes = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
        assertEquals(24, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case29() {
        int[] duckTypes = { 30, 36, 7, 38, 21, 38, 19, 47, 47, 47, 32, 49, 29, 9, 41, 9, 9, 45, 21, 32, 28, 7, 12, 36, 31, 16, 38, 19, 39 };
        assertEquals(54, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case30() {
        int[] duckTypes = { 37, 1, 37, 46, 46, 46, 46, 46, 37, 46, 1, 46, 1, 46, 37, 37, 1, 37, 37, 1, 1, 46, 1, 37, 37, 1, 46, 1, 37, 46, 1 };
        assertEquals(33, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case31() {
        int[] duckTypes = { 50, 8, 8, 50, 50, 8, 8, 50, 50, 50, 50, 50, 8, 8, 8, 50, 50, 8, 8, 50, 8, 8, 50 };
        assertEquals(24, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case32() {
        int[] duckTypes = { 32, 3, 5, 26, 4, 29, 1, 5, 27, 33 };
        assertEquals(18, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case33() {
        int[] duckTypes = { 41, 29 };
        assertEquals(2, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case34() {
        int[] duckTypes = { 32, 39, 48, 30, 9, 50, 7, 35, 22, 6, 13, 13, 14, 34, 37, 32, 18, 31, 45, 20, 22, 7, 32, 16, 45, 43, 25, 29, 13, 46, 24, 14, 31, 17, 4, 36, 35, 37, 9, 9, 24, 8, 15, 1, 15, 14, 32 };
        assertEquals(120, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case35() {
        int[] duckTypes = { 40, 44, 18, 45, 46, 10, 50, 14, 46, 6, 48, 14, 29, 33, 2, 20, 47, 41, 27, 15, 50, 50, 26, 48, 30, 44, 19, 21, 13, 28, 44, 19, 16, 12, 3, 17, 35 };
        assertEquals(87, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case36() {
        int[] duckTypes = { 3, 34, 15, 42, 10, 30, 21, 44, 48, 43, 21, 23, 3, 22, 22, 15, 38, 28, 20, 32, 7, 20, 36, 37, 45, 18, 48, 27, 35, 18, 25, 4, 10, 15, 30, 47, 19 };
        assertEquals(81, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case37() {
        int[] duckTypes = { 23, 24, 40, 26, 25, 13, 1, 27, 17, 18, 26, 42, 12, 24, 34, 26, 4, 38, 30, 44, 37, 30, 17, 30, 9, 6, 28, 44, 48, 34, 2, 46, 30, 10, 47, 28, 5, 9, 26, 20, 2, 26, 31 };
        assertEquals(145, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case38() {
        int[] duckTypes = { 6, 13, 17, 27, 6, 29, 49, 4, 2, 5, 10 };
        assertEquals(20, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case39() {
        int[] duckTypes = { 49, 33, 22, 50, 27, 37, 18, 5, 46, 40, 9, 5, 46, 35, 50, 5, 24, 49, 50, 4, 22, 30, 45, 44, 22, 31, 39, 18, 45, 43, 13, 44, 35, 8, 48, 44, 16, 43 };
        assertEquals(72, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case40() {
        int[] duckTypes = { 40, 47, 35, 7, 19, 24, 3, 31, 34, 9, 25, 13, 41, 49, 4, 9, 12, 29, 20, 27, 19, 4, 21, 43, 9, 26, 30, 4, 9, 22, 33, 12, 41, 14, 42, 38, 1, 5, 1, 45 };
        assertEquals(124, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case41() {
        int[] duckTypes = { 29, 6, 7, 6, 11, 18, 47, 50, 7, 26, 18, 36, 37, 6, 32, 13, 4, 11, 20 };
        assertEquals(42, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case42() {
        int[] duckTypes = { 28, 14, 5, 32, 41, 38, 11, 40, 26, 24 };
        assertEquals(10, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case43() {
        int[] duckTypes = { 27, 38, 33, 29, 24, 17, 43, 36, 46, 17, 6, 8, 39, 27, 27, 26, 32, 21, 15, 23, 43, 28, 21, 42 };
        assertEquals(57, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case44() {
        int[] duckTypes = { 14, 32, 10, 7, 35, 44, 40, 31, 22, 48, 33, 20, 7, 38, 34, 23, 7, 21, 42, 24, 50, 9, 22, 6, 9, 50, 9, 45, 41, 7 };
        assertEquals(92, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case45() {
        int[] duckTypes = { 42, 29, 26, 28, 45, 2, 46, 12, 29, 4, 12, 14, 44, 13, 25, 5, 31, 15, 8, 21, 32, 12, 5, 5, 30, 5, 24, 16, 34, 37, 50, 28, 34, 40, 45, 16 };
        assertEquals(104, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case46() {
        int[] duckTypes = { 26, 43, 1, 19, 45, 41, 19, 46, 21, 3, 28, 33, 26, 37, 36, 33, 1, 8, 6, 4 };
        assertEquals(32, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case47() {
        int[] duckTypes = { 26, 6, 33, 46, 12, 47, 20, 2 };
        assertEquals(8, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case48() {
        int[] duckTypes = { 49, 48, 31, 10, 48, 41, 25, 6, 15, 39, 5, 34, 8, 50, 10, 16, 13, 13, 40, 43, 46, 30, 34, 47, 43, 37, 5, 18, 16, 47, 10, 28 };
        assertEquals(69, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case49() {
        int[] duckTypes = { 46, 43, 36, 23, 2, 16, 43, 47, 2, 21, 7, 12, 14, 39, 18, 39, 15, 7, 16, 21, 46, 13, 8, 23, 6, 30, 34, 21, 11, 44, 8, 30, 21, 4, 25, 5, 28, 32, 13, 10, 28, 43, 30, 1, 1, 8, 29, 5 };
        assertEquals(116, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case50() {
        int[] duckTypes = { 12, 14, 17, 19, 48, 4, 15, 18, 7, 30, 14, 6, 3, 28 };
        assertEquals(26, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case51() {
        int[] duckTypes = { 42 };
        assertEquals(1, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case52() {
        int[] duckTypes = { 38, 47, 5, 50, 14, 30, 6, 11, 43, 11, 12, 4, 17, 39, 2, 49, 34, 42, 17, 39, 21, 25, 34, 30, 30, 46, 8, 1, 9, 43, 50, 20, 48, 42, 49, 13, 9, 20, 33, 39, 19, 37, 45, 48, 8, 4, 21, 40, 13 };
        assertEquals(93, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case53() {
        int[] duckTypes = { 7, 10, 18, 30, 3, 43, 45, 48, 15, 48, 3, 49, 27, 49, 30, 18, 8, 22, 50, 33, 41, 28, 12, 39, 38, 20, 50, 36, 41, 6, 35 };
        assertEquals(48, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case54() {
        int[] duckTypes = { 19, 50, 13, 48, 30, 33, 8, 42, 36, 22, 35, 13, 7, 7, 13, 50, 10, 32, 40, 13, 4, 18, 33, 32, 48, 25, 35, 12, 17, 34, 44, 10, 27, 14, 11, 24, 34, 16, 11, 43, 45, 32, 13, 46, 30, 37, 24, 49 };
        assertEquals(160, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case55() {
        int[] duckTypes = { 34, 23, 35, 19 };
        assertEquals(4, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case56() {
        int[] duckTypes = { 23, 8, 19, 37, 6, 20, 33, 6, 17, 9, 47, 18, 29, 46, 46, 3, 37, 43, 40, 5, 2, 8, 3, 25, 12, 14, 42, 31, 13, 20 };
        assertEquals(48, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case57() {
        int[] duckTypes = { 1, 37 };
        assertEquals(2, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case58() {
        int[] duckTypes = { 47, 34, 18, 34, 25, 36, 39, 48, 38, 8, 43, 16 };
        assertEquals(22, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case59() {
        int[] duckTypes = { 48, 10, 6, 41, 21, 21, 18, 9, 12 };
        assertEquals(16, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case60() {
        int[] duckTypes = { 45, 1, 4, 40, 20, 10, 15, 27, 50, 20, 45, 33, 3, 34, 17, 36, 16, 6, 44, 26, 17, 19, 36, 30, 43, 46, 33, 17, 48, 34, 45, 33, 9, 23, 15, 6 };
        assertEquals(75, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case61() {
        int[] duckTypes = { 8, 24, 42, 31, 17, 34, 28, 8, 47, 20, 14, 21, 48, 46, 16, 40, 41, 42, 13, 39, 11, 15, 25, 34, 14, 44, 50, 18, 49, 4, 45, 11, 48, 6, 43, 37, 37, 29, 16, 27, 37, 27, 28, 13, 6, 41, 38, 45, 12, 27 };
        assertEquals(102, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case62() {
        int[] duckTypes = { 47, 9, 7, 44, 42, 43, 33, 35, 50, 4, 40, 41, 36, 20, 18, 48, 6, 2, 41, 7, 35, 4, 40, 33, 5, 41, 50, 10, 27, 39, 9, 37, 9, 26, 13, 10, 8, 38, 29, 49, 34 };
        assertEquals(90, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case63() {
        int[] duckTypes = { 32, 16, 45, 9, 50, 38, 11, 11, 29, 34, 30, 30, 36, 26, 35, 4, 18, 18, 14, 34, 47, 13, 20, 37, 26, 26, 6, 50, 6, 35, 18, 11, 12, 24, 39, 21, 9, 9, 48, 6, 8 };
        assertEquals(81, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case64() {
        int[] duckTypes = { 31, 46, 2, 41, 48, 7, 13, 5, 12, 16, 9, 29, 40, 13, 4, 2, 4, 34, 50, 35, 43, 12, 36, 44, 10, 30, 34, 35, 6, 24, 17, 33, 8, 37, 12, 15, 7 };
        assertEquals(87, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case65() {
        int[] duckTypes = { 21, 4, 33, 4, 32, 12, 34, 15, 43, 37, 12, 43, 42, 20, 21, 39, 43, 39, 49, 42, 25, 14, 50, 43, 9, 42, 9, 19, 15, 44, 13, 43, 30, 33 };
        assertEquals(105, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case66() {
        int[] duckTypes = { 42, 29, 37, 46, 28, 24, 50, 22, 22, 37, 39, 39, 15, 48, 31, 28, 44, 43, 13, 37, 36, 35, 45, 48, 36, 36, 43, 24, 33, 10, 47, 2, 43, 21, 25, 10, 2, 13, 32, 22, 29, 8, 7, 5 };
        assertEquals(84, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case67() {
        int[] duckTypes = { 23, 37, 33, 6, 33, 3, 23, 19, 7, 38, 30, 12, 9, 15, 8, 1, 39, 37, 20, 13, 28, 28, 23, 24, 14, 4, 12, 44, 20, 50, 16, 28, 10, 33, 13 };
        assertEquals(75, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case68() {
        int[] duckTypes = { 47, 21, 26, 3, 40, 21, 35, 26, 17, 23, 38, 7, 31, 35, 30, 46, 28, 22, 14, 2, 19, 23, 47, 14, 44, 48, 10, 6, 26, 6, 20, 38 };
        assertEquals(69, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case69() {
        int[] duckTypes = { 43, 24, 34, 37, 3, 15, 4, 19, 27, 28, 27, 24, 41, 26, 16, 16, 26 };
        assertEquals(26, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case70() {
        int[] duckTypes = { 12, 31, 13, 38, 36, 45, 3, 46, 12, 8, 37, 38 };
        assertEquals(20, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case71() {
        int[] duckTypes = { 8, 13, 2, 23, 13, 49, 12, 4, 8, 46, 43, 1, 15, 2, 13 };
        assertEquals(33, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case72() {
        int[] duckTypes = { 6, 41, 39, 37, 7, 6, 22, 5, 41, 46, 44, 19, 2, 41, 18, 42, 34, 17, 6, 1, 35, 8, 37, 13, 50, 5, 28, 24, 30, 20, 46, 42, 49, 50, 34, 13 };
        assertEquals(75, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case73() {
        int[] duckTypes = { 21, 18, 43, 45, 30, 22, 16, 23, 24, 25, 44, 7, 42, 41, 33, 2, 7, 1, 28, 13, 37, 19, 37, 3, 47, 37, 7, 38, 37, 27, 7, 18, 12, 3, 22, 33, 36, 12, 4, 2 };
        assertEquals(112, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case74() {
        int[] duckTypes = { 11, 1, 42, 16, 36, 9, 3, 32, 11, 50, 6, 36, 6, 5, 3 };
        assertEquals(22, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case75() {
        int[] duckTypes = { 47, 44, 25, 36, 28, 14, 27, 17, 36, 10, 38, 1, 40, 34, 27, 40 };
        assertEquals(26, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case76() {
        int[] duckTypes = { 18, 33, 32, 17, 9, 41, 5, 39 };
        assertEquals(8, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case77() {
        int[] duckTypes = { 7, 1, 1, 3, 21, 18, 35, 7, 50, 26, 26, 29, 24, 50, 50, 23, 18, 13, 17, 32, 9, 18, 7, 7, 11, 13, 26, 39 };
        assertEquals(68, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case78() {
        int[] duckTypes = { 43, 7 };
        assertEquals(2, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case79() {
        int[] duckTypes = { 38, 27, 38, 44, 40, 45, 1, 42, 38, 35, 5, 45, 45, 39, 11, 47, 6, 39, 44, 1, 25, 35, 49, 19, 13, 12, 25, 44, 50, 28, 46, 37, 18, 25, 29, 50, 38, 42, 26, 37, 28, 39, 2 };
        assertEquals(104, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case80() {
        int[] duckTypes = { 23, 9, 46, 6, 47, 24, 33, 41, 43, 38, 16, 39, 31, 13, 46, 6, 26, 48, 36, 12, 14, 42, 40, 14, 36, 31, 15, 7, 14, 10, 33, 18 };
        assertEquals(75, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case81() {
        int[] duckTypes = { 6, 50, 4, 49, 42, 25, 11, 10, 26, 23, 6, 38, 45, 40, 33, 12, 7, 11, 39, 21, 1, 31, 14, 32, 42, 29, 49, 39, 2, 8, 8, 1, 42, 21, 8, 48, 1 };
        assertEquals(78, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case82() {
        int[] duckTypes = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
        assertEquals(650, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case83() {
        int[] duckTypes = { 49, 50, 1, 50, 2, 3, 4, 49, 50 };
        assertEquals(18, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case84() {
        int[] duckTypes = { 17, 17, 19, 23, 23, 19, 50, 17, 17, 50, 37, 50 };
        assertEquals(20, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case85() {
        int[] duckTypes = { 50 };
        assertEquals(1, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case86() {
        int[] duckTypes = { 1, 2, 2 };
        assertEquals(4, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case87() {
        int[] duckTypes = { 3, 4, 4, 4, 4 };
        assertEquals(8, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case88() {
        int[] duckTypes = { 1, 1, 3, 1, 3, 3, 3, 3 };
        assertEquals(10, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case89() {
        int[] duckTypes = { 1, 1, 1, 1, 1, 1 };
        assertEquals(6, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case90() {
        int[] duckTypes = { 50, 50 };
        assertEquals(2, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case91() {
        int[] duckTypes = { 4, 7, 4, 7, 4 };
        assertEquals(6, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case92() {
        int[] duckTypes = { 1, 2, 3, 2, 1 };
        assertEquals(6, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case93() {
        int[] duckTypes = { 5, 8, 50, 50, 50 };
        assertEquals(9, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case94() {
        int[] duckTypes = { 4, 7, 4, 7, 8 };
        assertEquals(6, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case95() {
        int[] duckTypes = { 1, 3 };
        assertEquals(2, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case96() {
        int[] duckTypes = { 3, 3, 4, 4 };
        assertEquals(4, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case97() {
        int[] duckTypes = { 50, 50, 2, 50 };
        assertEquals(6, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case98() {
        int[] duckTypes = { 5, 8, 8, 9 };
        assertEquals(6, kingdomandducks.minDucks(duckTypes));
    }

    @Test
    public void case99() {
        int[] duckTypes = { 1, 1, 1, 2, 2, 3, 3, 17 };
        assertEquals(12, kingdomandducks.minDucks(duckTypes));
    }

}
