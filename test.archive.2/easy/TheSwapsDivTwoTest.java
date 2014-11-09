package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class TheSwapsDivTwoTest {
    TheSwapsDivTwo theswapsdivtwo = new TheSwapsDivTwo();

    @Test
    public void case1() {
        int[] sequence = { 4, 7, 4 };
        assertEquals(3, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case2() {
        int[] sequence = { 1, 47 };
        assertEquals(1, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case3() {
        int[] sequence = { 9, 9, 9, 9 };
        assertEquals(1, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case4() {
        int[] sequence = { 22, 16, 36, 35, 14, 9, 33, 6, 28, 12, 18, 14, 47, 46, 29, 22, 14, 17, 4, 15, 28, 6, 39, 24, 47, 37 };
        assertEquals(319, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case5() {
        int[] sequence = { 7, 2, 21, 27, 5, 8, 14, 4, 42, 1, 12, 12, 24, 19, 31, 17, 19, 34, 13, 16, 30, 10, 20, 19, 30, 1, 47, 10, 19, 38, 30, 31, 33, 23, 46, 44, 8, 31, 26, 36, 1, 1, 12, 39, 9 };
        assertEquals(968, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case6() {
        int[] sequence = { 9, 40, 28, 28, 28, 36, 34, 14, 10, 38, 25, 25, 24, 24, 13, 15, 2, 33, 19, 12, 17, 21, 3, 25, 24, 5, 19, 11, 31, 16, 13, 37, 37, 29, 36, 21, 19, 11, 43, 8, 31, 47, 47, 20 };
        assertEquals(928, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case7() {
        int[] sequence = { 12, 23, 39, 16, 30, 46, 47, 29, 43, 12, 19, 27, 44, 1, 7, 47 };
        assertEquals(119, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case8() {
        int[] sequence = { 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24 };
        assertEquals(1, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case9() {
        int[] sequence = { 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41 };
        assertEquals(1, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case10() {
        int[] sequence = { 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19 };
        assertEquals(1, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case11() {
        int[] sequence = { 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47 };
        assertEquals(1, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case12() {
        int[] sequence = { 7, 13, 26, 15, 41, 6, 17, 33, 20, 16, 43, 46, 32, 40, 34, 27, 9, 8, 39, 4, 12, 11, 5, 38, 22, 29, 14, 24, 35, 45, 21, 2, 10, 31, 28, 44, 37, 3, 19, 25, 18, 30, 42, 36, 47, 1, 23 };
        assertEquals(1081, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case13() {
        int[] sequence = { 6, 7, 6, 6, 5, 7, 7, 6, 7, 6, 6, 6, 6, 6, 5, 4, 7, 7, 5, 4, 4, 5, 6, 5, 7, 7, 4, 5, 5, 5, 4, 5, 5, 4, 4, 6, 4, 4, 5, 6, 4, 4, 6, 5, 5, 6, 5 };
        assertEquals(817, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case14() {
        int[] sequence = { 5, 6, 4, 5, 7, 4, 6, 4, 4, 6, 4, 7, 7, 5, 4, 4, 5, 4, 6, 6, 4, 4, 4, 6, 7, 5, 4, 6, 5, 5, 7, 7, 4, 5, 4, 4, 4, 6, 4, 6, 6, 7, 7, 4, 7, 7, 6 };
        assertEquals(801, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case15() {
        int[] sequence = { 5, 7, 6, 7, 4, 4, 6, 6, 7, 5, 7, 7, 4, 7, 7, 5, 5, 7, 4, 4, 5, 6, 4, 7, 5, 7, 6, 5, 4, 7, 7, 5, 5, 5, 5, 6, 6, 5, 4, 7, 6, 5, 6, 4, 4, 5, 7 };
        assertEquals(819, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case16() {
        int[] sequence = { 1, 2, 1, 1, 2, 2, 2, 1, 2, 1, 1, 1, 1, 1, 2, 1, 2, 2, 2, 1, 1, 2, 1, 2, 2, 2, 1, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 2, 1, 2 };
        assertEquals(551, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case17() {
        int[] sequence = { 2, 1, 1, 2, 2, 1, 1, 1, 1, 1, 1, 2, 2, 2, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 2, 2, 2, 2, 1, 2, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 2, 2, 1 };
        assertEquals(523, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case18() {
        int[] sequence = { 2, 2, 1, 2, 1, 1, 1, 1, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 1, 1, 2, 1, 1, 2, 2, 2, 1, 2, 1, 2, 2, 2, 2, 2, 2, 1, 1, 2, 1, 2, 1, 2, 1, 1, 1, 2, 2 };
        assertEquals(533, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case19() {
        int[] sequence = { 1, 1, 1, 1, 2, 1, 2, 1, 2, 2, 1, 2, 1, 2, 2, 1, 2, 1, 2, 2, 1, 1, 2, 2, 2, 1, 2, 2, 2, 2, 1, 1, 2, 1, 1, 2, 2, 1, 1, 2, 1, 1, 2, 1, 1, 1, 2 };
        assertEquals(553, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case20() {
        int[] sequence = { 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 2, 2, 1, 2, 2, 1, 2, 1, 1, 2, 1, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 1, 1, 1, 2, 2, 1, 2, 1, 1, 2 };
        assertEquals(523, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case21() {
        int[] sequence = { 1, 1 };
        assertEquals(1, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case22() {
        int[] sequence = { 1, 2, 1, 3 };
        assertEquals(6, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case23() {
        int[] sequence = { 3, 3, 4, 3 };
        assertEquals(4, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case24() {
        int[] sequence = { 4, 4, 1 };
        assertEquals(3, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case25() {
        int[] sequence = { 1, 2, 1 };
        assertEquals(3, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case26() {
        int[] sequence = { 1, 4, 3, 1 };
        assertEquals(6, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case27() {
        int[] sequence = { 4, 4, 2, 3 };
        assertEquals(6, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case28() {
        int[] sequence = { 3, 1, 1, 3 };
        assertEquals(5, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case29() {
        int[] sequence = { 2, 2, 1, 4 };
        assertEquals(6, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case30() {
        int[] sequence = { 2, 2, 3 };
        assertEquals(3, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case31() {
        int[] sequence = { 6, 13, 26, 9, 39, 7, 31, 7, 28, 22, 43, 6, 5, 26, 44, 44, 40, 4, 5 };
        assertEquals(167, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case32() {
        int[] sequence = { 11, 5, 13, 47, 6, 4, 6, 20, 42, 18, 4, 31, 46, 6, 34, 33, 6, 6 };
        assertEquals(143, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case33() {
        int[] sequence = { 38, 9, 5, 35, 25 };
        assertEquals(10, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case34() {
        int[] sequence = { 32, 31, 46, 42, 38, 10, 30, 21, 7, 26, 18, 31, 46, 25, 22, 17, 5, 22, 36, 46, 32, 8, 7, 28, 29, 34, 20, 5 };
        assertEquals(371, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case35() {
        int[] sequence = { 35, 35, 6, 42, 45, 47, 33, 39, 28, 27, 33, 17, 35, 13, 29, 16, 39, 12, 11, 21, 42, 38, 39, 28, 6, 14, 38, 39, 46, 41, 35, 20, 32, 19, 37, 34, 22, 38, 39, 42, 43, 31, 25, 40 };
        assertEquals(922, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case36() {
        int[] sequence = { 42, 41, 13, 37, 30, 35, 14, 9, 17, 18, 14, 35, 18, 15, 9, 40, 34, 45, 46, 46, 12, 27, 20, 37, 38, 36, 21, 32, 21, 22, 32, 38, 15, 39, 41, 32, 40, 33, 41, 47 };
        assertEquals(765, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case37() {
        int[] sequence = { 44, 35, 45, 46, 23, 42, 17, 14, 34, 33, 11, 6, 21, 6, 16, 5, 9, 42, 34, 40, 23, 45, 37, 11, 41, 23, 11, 44, 31, 32, 32, 39, 42, 33, 44, 35, 31, 23, 13, 36, 40, 25, 34, 19, 13 };
        assertEquals(965, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case38() {
        int[] sequence = { 34, 44, 20, 45, 46, 23, 28, 47, 12, 26, 47, 29, 37, 15, 12, 28, 25, 17, 31, 10, 6, 7, 26, 11, 14 };
        assertEquals(297, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case39() {
        int[] sequence = { 34, 40, 47, 32, 18, 9, 27, 45, 8, 28, 16, 39, 23, 17, 39, 11, 10, 16, 20, 43, 24, 24, 35, 19, 46, 8, 45, 22, 15, 31, 10, 16, 40, 43, 34, 24, 40, 28, 37, 24, 26, 25, 41, 8, 44, 24, 39 };
        assertEquals(1055, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case40() {
        int[] sequence = { 42, 23, 38, 38, 28, 13, 25, 6, 35, 7, 29, 28, 24, 18, 26, 40, 9, 45, 45, 12, 29, 23, 28, 4, 35, 19, 22, 41, 26, 10, 41, 14, 27, 44, 29, 4 };
        assertEquals(618, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case41() {
        int[] sequence = { 21, 20, 10, 23, 10, 47, 6, 26, 34, 31, 5, 33, 25, 22, 4, 32, 19, 32, 23, 10, 18, 44, 12, 15, 16, 45, 40, 40, 34, 26, 33, 9, 37, 19, 13, 35, 23, 19, 5, 42, 24, 17, 22, 39, 4, 33 };
        assertEquals(1017, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case42() {
        int[] sequence = { 4, 8, 8, 13, 40, 42, 26, 17, 17, 11, 24, 11, 11, 9, 38, 46, 46, 29, 33, 17, 32, 5, 30, 33, 42, 22, 31, 6, 39, 18, 14, 8, 21, 9, 29, 5, 7, 30, 11, 43, 21, 31, 24, 14 };
        assertEquals(924, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case43() {
        int[] sequence = { 18, 39, 47, 13, 9, 9, 6, 23, 5, 12, 37, 45, 35, 18, 30, 9, 46, 19, 15, 5, 4, 33, 12, 4, 14, 30, 24, 42, 45, 41, 17, 25, 20, 41, 43, 20, 27, 45, 43, 17, 22, 32, 15 };
        assertEquals(888, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case44() {
        int[] sequence = { 42, 46, 38, 30, 41, 18, 9, 27, 29, 7, 11, 36, 17, 8, 19, 21, 30, 29, 19, 30, 24, 21, 44, 46, 23, 17, 36, 37, 46, 34, 47, 37 };
        assertEquals(485, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case45() {
        int[] sequence = { 45, 45, 14, 40, 44, 16, 46, 27, 22, 40, 7, 7, 5, 45, 6, 7, 25, 20, 27, 39, 40, 25, 27, 42, 37, 27, 27, 9 };
        assertEquals(359, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case46() {
        int[] sequence = { 46, 44, 14, 8, 27, 23, 10, 20, 34, 9, 30, 39, 4, 44, 35, 46, 30, 46 };
        assertEquals(149, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case47() {
        int[] sequence = { 12, 26, 17, 41, 13, 22, 23, 34, 41, 4, 38, 17, 18, 9 };
        assertEquals(90, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case48() {
        int[] sequence = { 22, 16, 36, 35, 14, 9, 33, 6, 28, 12, 18, 14, 47, 46, 29, 22, 14, 17, 4, 15, 28, 6, 39, 24, 47, 37 };
        assertEquals(319, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case49() {
        int[] sequence = { 1, 2, 3, 4, 5 };
        assertEquals(10, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case50() {
        int[] sequence = { 1, 2, 3 };
        assertEquals(3, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case51() {
        int[] sequence = { 1, 2 };
        assertEquals(1, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case52() {
        int[] sequence = { 16, 10, 16, 38, 1, 5, 46, 29, 27, 34, 16, 33, 10, 7, 3, 22, 20, 19, 39, 43, 25, 21, 20, 37, 20, 17, 7, 19, 17, 15, 26, 6, 3, 30, 1, 16, 24, 17, 23, 21, 20, 17, 16, 29, 6, 13, 19 };
        assertEquals(1050, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case53() {
        int[] sequence = { 9, 9, 9, 9 };
        assertEquals(1, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case54() {
        int[] sequence = { 2, 2 };
        assertEquals(1, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case55() {
        int[] sequence = { 1, 2, 3, 5, 7 };
        assertEquals(10, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case56() {
        int[] sequence = { 1, 1, 1, 1, 1, 1, 2, 2, 2, 2 };
        assertEquals(25, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case57() {
        int[] sequence = { 3, 4, 5 };
        assertEquals(3, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case58() {
        int[] sequence = { 45, 43, 12, 5, 5, 23 };
        assertEquals(15, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case59() {
        int[] sequence = { 2, 3, 4 };
        assertEquals(3, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case60() {
        int[] sequence = { 1, 47, 2 };
        assertEquals(3, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case61() {
        int[] sequence = { 1, 47 };
        assertEquals(1, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case62() {
        int[] sequence = { 7, 4 };
        assertEquals(1, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case63() {
        int[] sequence = { 1, 2, 3, 4 };
        assertEquals(6, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case64() {
        int[] sequence = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
        assertEquals(1, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case65() {
        int[] sequence = { 3, 2, 1 };
        assertEquals(3, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case66() {
        int[] sequence = { 1, 47, 20 };
        assertEquals(3, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case67() {
        int[] sequence = { 4, 5, 6 };
        assertEquals(3, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case68() {
        int[] sequence = { 2, 2, 4, 2 };
        assertEquals(4, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case69() {
        int[] sequence = { 1, 2, 3, 4, 6, 6, 6 };
        assertEquals(19, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case70() {
        int[] sequence = { 3, 33, 3 };
        assertEquals(3, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case71() {
        int[] sequence = { 1, 11, 1 };
        assertEquals(3, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case72() {
        int[] sequence = { 4, 7, 4 };
        assertEquals(3, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case73() {
        int[] sequence = { 3, 1, 2 };
        assertEquals(3, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case74() {
        int[] sequence = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46 };
        assertEquals(1035, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case75() {
        int[] sequence = { 3, 33, 1, 11 };
        assertEquals(6, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case76() {
        int[] sequence = { 1, 1 };
        assertEquals(1, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case77() {
        int[] sequence = { 12, 13, 14 };
        assertEquals(3, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case78() {
        int[] sequence = { 7, 4, 4 };
        assertEquals(3, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case79() {
        int[] sequence = { 1, 1, 2, 2 };
        assertEquals(5, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case80() {
        int[] sequence = { 1, 47, 3 };
        assertEquals(3, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case81() {
        int[] sequence = { 2, 3, 2, 2, 2, 3 };
        assertEquals(9, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case82() {
        int[] sequence = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 };
        assertEquals(780, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case83() {
        int[] sequence = { 4, 5, 7 };
        assertEquals(3, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case84() {
        int[] sequence = { 4, 7, 4, 7 };
        assertEquals(5, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case85() {
        int[] sequence = { 4, 4 };
        assertEquals(1, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case86() {
        int[] sequence = { 12, 13, 14, 14, 12 };
        assertEquals(9, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case87() {
        int[] sequence = { 4, 9, 3 };
        assertEquals(3, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case88() {
        int[] sequence = { 4, 3, 2, 1 };
        assertEquals(6, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case89() {
        int[] sequence = { 1, 2, 2, 3 };
        assertEquals(6, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case90() {
        int[] sequence = { 3, 3 };
        assertEquals(1, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case91() {
        int[] sequence = { 9, 9 };
        assertEquals(1, theswapsdivtwo.find(sequence));
    }

    @Test
    public void case92() {
        int[] sequence = { 22, 16, 36, 35, 14, 9, 33, 6, 28, 12, 18, 14, 47, 46, 29, 22, 14, 17, 4, 15, 28, 6, 39, 24, 47, 37, 10, 11, 12, 13, 20, 25, 35, 41, 15, 14, 32, 25, 35, 45, 36, 45, 21, 25, 18 };
        assertEquals(970, theswapsdivtwo.find(sequence));
    }

}
