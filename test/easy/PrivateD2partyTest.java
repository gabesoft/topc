package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class PrivateD2partyTest {
    PrivateD2party privated2party = new PrivateD2party();

    @Test
    public void case1() {
        int[] a = { 0, 1 };
        assertEquals(2, privated2party.getsz(a));
    }

    @Test
    public void case2() {
        int[] a = { 1, 0 };
        assertEquals(1, privated2party.getsz(a));
    }

    @Test
    public void case3() {
        int[] a = { 1, 0, 3, 2 };
        assertEquals(2, privated2party.getsz(a));
    }

    @Test
    public void case4() {
        int[] a = { 5, 2, 2, 4, 5, 0 };
        assertEquals(5, privated2party.getsz(a));
    }

    @Test
    public void case5() {
        int[] a = { 3, 2, 1, 0, 5, 4 };
        assertEquals(3, privated2party.getsz(a));
    }

    @Test
    public void case6() {
        int[] a = { 13, 1, 2, 6, 17, 17, 2, 18, 14, 14, 15, 7, 14, 15, 6, 8, 5, 5, 4, 2 };
        assertEquals(19, privated2party.getsz(a));
    }

    @Test
    public void case7() {
        int[] a = { 3, 1, 3, 1 };
        assertEquals(4, privated2party.getsz(a));
    }

    @Test
    public void case8() {
        int[] a = { 6, 27, 14, 17, 11, 8, 2, 13, 6, 24, 10, 24, 17, 21, 13, 21, 7, 1, 18, 26, 11, 7, 11, 10, 18, 7, 11, 4, 17 };
        assertEquals(28, privated2party.getsz(a));
    }

    @Test
    public void case9() {
        int[] a = { 0, 4, 5, 1, 8, 1, 0, 0, 2, 8, 6, 0, 9 };
        assertEquals(12, privated2party.getsz(a));
    }

    @Test
    public void case10() {
        int[] a = { 28, 21, 4, 11, 7, 22, 23, 17, 25, 26, 24, 26, 6, 2, 10, 21, 7, 27, 21, 12, 18, 27, 8, 4, 2, 1, 7, 13, 1, 29 };
        assertEquals(29, privated2party.getsz(a));
    }

    @Test
    public void case11() {
        int[] a = { 7, 7, 1, 7, 0, 13, 13, 9, 0, 2, 0, 4, 8, 0 };
        assertEquals(13, privated2party.getsz(a));
    }

    @Test
    public void case12() {
        int[] a = { 9, 14, 6, 2, 0, 7, 10, 3, 5, 3, 10, 12, 1, 0, 9 };
        assertEquals(15, privated2party.getsz(a));
    }

    @Test
    public void case13() {
        int[] a = { 5, 4, 12, 10, 7, 0, 3, 1, 6, 3, 7, 3, 6 };
        assertEquals(11, privated2party.getsz(a));
    }

    @Test
    public void case14() {
        int[] a = { 1, 1, 0, 7, 0, 7, 7, 4, 3, 7 };
        assertEquals(10, privated2party.getsz(a));
    }

    @Test
    public void case15() {
        int[] a = { 12, 3, 7, 15, 4, 13, 0, 19, 10, 3, 18, 17, 17, 13, 3, 9, 8, 6, 11, 7 };
        assertEquals(17, privated2party.getsz(a));
    }

    @Test
    public void case16() {
        int[] a = { 5, 12, 16, 8, 18, 11, 6, 9, 8, 12, 7, 6, 0, 18, 16, 0, 5, 4, 7 };
        assertEquals(19, privated2party.getsz(a));
    }

    @Test
    public void case17() {
        int[] a = { 18, 9, 7, 18, 6, 14, 24, 8, 3, 21, 10, 0, 18, 23, 24, 0, 13, 3, 9, 18, 13, 19, 1, 6, 15 };
        assertEquals(24, privated2party.getsz(a));
    }

    @Test
    public void case18() {
        int[] a = { 0, 8, 13, 1, 0, 9, 3, 12, 16, 15, 2, 6, 14, 8, 3, 0, 15 };
        assertEquals(17, privated2party.getsz(a));
    }

    @Test
    public void case19() {
        int[] a = { 12, 0, 9, 11, 10, 7, 4, 8, 0, 2, 13, 5, 10, 11, 7 };
        assertEquals(13, privated2party.getsz(a));
    }

    @Test
    public void case20() {
        int[] a = { 7, 20, 12, 17, 7, 8, 13, 7, 13, 13, 16, 9, 13, 2, 17, 18, 9, 11, 3, 20, 8, 0, 11, 0 };
        assertEquals(23, privated2party.getsz(a));
    }

    @Test
    public void case21() {
        int[] a = { 4, 2, 26, 25, 3, 4, 22, 27, 14, 2, 20, 20, 26, 23, 22, 6, 21, 10, 28, 5, 22, 10, 19, 0, 12, 14, 0, 20, 19, 7, 30 };
        assertEquals(30, privated2party.getsz(a));
    }

    @Test
    public void case22() {
        int[] a = { 11, 7, 4, 5, 9, 8, 11, 10, 10, 6, 5, 10 };
        assertEquals(11, privated2party.getsz(a));
    }

    @Test
    public void case23() {
        int[] a = { 14, 14, 1, 3, 10, 0, 9, 11, 2, 2, 13, 11, 5, 2, 0 };
        assertEquals(14, privated2party.getsz(a));
    }

    @Test
    public void case24() {
        int[] a = { 12, 9, 12, 2, 1, 1, 11, 13, 3, 2, 6, 13, 12, 2 };
        assertEquals(14, privated2party.getsz(a));
    }

    @Test
    public void case25() {
        int[] a = { 6, 20, 1, 12, 3, 7, 12, 8, 1, 3, 5, 7, 7, 12, 13, 4, 6, 16, 12, 2, 4 };
        assertEquals(20, privated2party.getsz(a));
    }

    @Test
    public void case26() {
        int[] a = { 3, 9, 12, 6, 14, 12, 7, 7, 16, 0, 4, 12, 12, 2, 14, 3, 16 };
        assertEquals(17, privated2party.getsz(a));
    }

    @Test
    public void case27() {
        int[] a = { 20, 16, 9, 3, 7, 7, 28, 14, 5, 36, 19, 8, 3, 29, 31, 18, 24, 24, 15, 23, 23, 10, 20, 14, 10, 4, 29, 22, 17, 36, 25, 24, 28, 10, 11, 7, 8, 33 };
        assertEquals(36, privated2party.getsz(a));
    }

    @Test
    public void case28() {
        int[] a = { 13, 2, 5, 12, 0, 1, 12, 13, 11, 8, 11, 9, 8, 4, 6, 6 };
        assertEquals(13, privated2party.getsz(a));
    }

    @Test
    public void case29() {
        int[] a = { 0, 2, 10, 11, 15, 12, 15, 13, 11, 17, 2, 17, 2, 6, 15, 5, 8, 20, 10, 2, 4 };
        assertEquals(20, privated2party.getsz(a));
    }

    @Test
    public void case30() {
        int[] a = { 9, 0, 29, 24, 5, 21, 18, 10, 14, 11, 5, 30, 0, 9, 16, 24, 29, 9, 20, 28, 22, 31, 33, 33, 0, 30, 22, 23, 2, 15, 21, 31, 19, 16 };
        assertEquals(34, privated2party.getsz(a));
    }

    @Test
    public void case31() {
        int[] a = { 18, 7, 27, 5, 24, 24, 5, 3, 14, 23, 25, 29, 11, 17, 13, 3, 14, 9, 0, 24, 20, 8, 23, 23, 11, 28, 26, 24, 27, 23, 11 };
        assertEquals(30, privated2party.getsz(a));
    }

    @Test
    public void case32() {
        int[] a = { 20, 17, 12, 16, 6, 22, 21, 16, 19, 13, 12, 14, 17, 20, 15, 6, 5, 21, 20, 21, 8, 1, 23, 16 };
        assertEquals(22, privated2party.getsz(a));
    }

    @Test
    public void case33() {
        int[] a = { 22, 23, 7, 12, 4, 12, 15, 22, 9, 12, 2, 8, 15, 22, 2, 2, 6, 15, 14, 2, 15, 2, 13, 22 };
        assertEquals(23, privated2party.getsz(a));
    }

    @Test
    public void case34() {
        int[] a = { 2, 19, 14, 31, 22, 35, 37, 33, 24, 3, 10, 21, 31, 26, 20, 34, 32, 14, 5, 31, 25, 5, 11, 30, 28, 12, 3, 16, 35, 20, 11, 28, 3, 2, 5, 35, 29, 19, 34 };
        assertEquals(39, privated2party.getsz(a));
    }

    @Test
    public void case35() {
        int[] a = { 3, 25, 2, 15, 28, 34, 9, 24, 15, 33, 23, 17, 30, 31, 33, 3, 2, 1, 29, 31, 30, 24, 9, 0, 17, 7, 29, 32, 14, 17, 8, 15, 1, 13, 31 };
        assertEquals(33, privated2party.getsz(a));
    }

    @Test
    public void case36() {
        int[] a = { 8, 8, 16, 22, 22, 7, 0, 11, 15, 1, 12, 15, 11, 13, 0, 3, 16, 5, 16, 23, 8, 21, 5, 12, 3 };
        assertEquals(24, privated2party.getsz(a));
    }

    @Test
    public void case37() {
        int[] a = { 16, 12, 15, 23, 4, 2, 3, 5, 10, 22, 6, 3, 4, 9, 17, 15, 0, 20, 16, 2, 15, 19, 21, 11, 3 };
        assertEquals(23, privated2party.getsz(a));
    }

    @Test
    public void case38() {
        int[] a = { 22, 7, 34, 18, 13, 23, 9, 1, 3, 35, 32, 19, 29, 35, 20, 11, 29, 36, 37, 0, 33, 2, 21, 10, 29, 18, 35, 4, 30, 0, 36, 39, 9, 7, 23, 11, 22, 37, 16, 13 };
        assertEquals(38, privated2party.getsz(a));
    }

    @Test
    public void case39() {
        int[] a = { 26, 6, 15, 17, 16, 21, 22, 19, 24, 20, 22, 26, 8, 21, 28, 20, 1, 30, 18, 16, 8, 0, 8, 7, 25, 22, 1, 31, 16, 2, 16, 19 };
        assertEquals(31, privated2party.getsz(a));
    }

    @Test
    public void case40() {
        int[] a = { 1, 18, 30, 15, 7, 30, 5, 12, 22, 17, 7, 30, 7, 20, 0, 11, 14, 1, 4, 11, 14, 13, 12, 17, 13, 3, 27, 18, 30, 9, 17 };
        assertEquals(30, privated2party.getsz(a));
    }

    @Test
    public void case41() {
        int[] a = { 24, 1, 3, 22, 1, 18, 9, 3, 25, 12, 19, 19, 21, 4, 21, 1, 11, 18, 25, 4, 2, 17, 20, 23, 15, 20, 8, 22, 17 };
        assertEquals(28, privated2party.getsz(a));
    }

    @Test
    public void case42() {
        int[] a = { 10, 21, 8, 18, 11, 15, 27, 8, 20, 28, 23, 15, 13, 7, 24, 19, 4, 28, 2, 9, 3, 9, 32, 13, 21, 0, 21, 14, 18, 10, 3, 15, 23, 18, 34, 11, 10 };
        assertEquals(36, privated2party.getsz(a));
    }

    @Test
    public void case43() {
        int[] a = { 3, 5, 0, 11, 17, 22, 2, 15, 15, 15, 28, 4, 3, 22, 21, 6, 0, 15, 11, 28, 17, 25, 17, 5, 9, 17, 2, 23, 25 };
        assertEquals(28, privated2party.getsz(a));
    }

    @Test
    public void case44() {
        int[] a = { 3, 27, 35, 39, 25, 27, 0, 16, 28, 34, 29, 16, 22, 35, 36, 25, 40, 25, 2, 4, 35, 4, 20, 31, 19, 31, 25, 36, 27, 16, 33, 23, 32, 41, 23, 38, 43, 30, 22, 36, 37, 28, 42, 27 };
        assertEquals(41, privated2party.getsz(a));
    }

    @Test
    public void case45() {
        int[] a = { 4, 10, 28, 7, 25, 22, 11, 1, 23, 4, 7, 14, 26, 20, 2, 11, 10, 28, 14, 9, 5, 11, 24, 24, 29, 7, 8, 20, 29, 22 };
        assertEquals(28, privated2party.getsz(a));
    }

    @Test
    public void case46() {
        int[] a = { 8, 7, 4, 13, 21, 13, 10, 1, 2, 20, 28, 24, 11, 12, 22, 19, 10, 9, 1, 31, 8, 20, 4, 6, 28, 28, 28, 13, 26, 17, 21, 2 };
        assertEquals(29, privated2party.getsz(a));
    }

    @Test
    public void case47() {
        int[] a = { 24, 34, 37, 7, 5, 36, 0, 39, 40, 27, 25, 40, 6, 3, 27, 11, 33, 7, 23, 29, 13, 39, 3, 5, 5, 4, 21, 4, 12, 4, 36, 8, 46, 41, 31, 36, 5, 31, 12, 43, 36, 22, 46, 20, 35, 8, 33, 0 };
        assertEquals(46, privated2party.getsz(a));
    }

    @Test
    public void case48() {
        int[] a = { 2, 0, 21, 33, 8, 30, 22, 25, 37, 6, 9, 36, 33, 10, 25, 32, 15, 23, 22, 12, 27, 32, 16, 25, 32, 28, 14, 10, 6, 14, 22, 35, 16, 25, 16, 22, 12, 0 };
        assertEquals(37, privated2party.getsz(a));
    }

    @Test
    public void case49() {
        int[] a = { 11, 42, 23, 42, 22, 40, 28, 13, 10, 21, 22, 40, 16, 34, 19, 23, 5, 11, 22, 30, 11, 25, 3, 6, 44, 32, 11, 31, 16, 12, 2, 14, 6, 3, 14, 5, 26, 7, 7, 6, 18, 31, 5, 35, 19 };
        assertEquals(44, privated2party.getsz(a));
    }

    @Test
    public void case50() {
        int[] a = { 17, 38, 14, 22, 2, 2, 29, 42, 19, 5, 3, 43, 21, 0, 21, 16, 24, 7, 21, 39, 32, 45, 26, 21, 0, 26, 14, 5, 6, 11, 21, 41, 21, 5, 22, 6, 41, 2, 6, 21, 42, 29, 16, 10, 2, 6 };
        assertEquals(44, privated2party.getsz(a));
    }

    @Test
    public void case51() {
        int[] a = { 35, 35, 22, 25, 32, 18, 18, 20, 16, 2, 34, 35, 20, 11, 9, 16, 14, 10, 31, 36, 26, 33, 28, 11, 7, 3, 19, 11, 32, 6, 35, 14, 23, 0, 25, 14, 1 };
        assertEquals(35, privated2party.getsz(a));
    }

    @Test
    public void case52() {
        int[] a = { 6, 15, 17, 16, 24, 9, 10, 25, 20, 2, 15, 2, 27, 16, 11, 3, 23, 3, 9, 1, 0, 24, 13, 3, 16, 25, 14, 9 };
        assertEquals(27, privated2party.getsz(a));
    }

    @Test
    public void case53() {
        int[] a = { 18, 11, 26, 24, 16, 3, 26, 1, 31, 5, 21, 1, 16, 24, 0, 29, 18, 6, 21, 19, 24, 30, 22, 21, 7, 17, 7, 25, 0, 20, 12, 0 };
        assertEquals(30, privated2party.getsz(a));
    }

    @Test
    public void case54() {
        int[] a = { 2, 18, 39, 25, 38, 22, 3, 23, 8, 6, 19, 14, 5, 11, 22, 42, 36, 38, 15, 2, 40, 8, 30, 18, 2, 8, 8, 1, 17, 22, 13, 19, 34, 31, 42, 25, 22, 39, 0, 11, 14, 35, 11 };
        assertEquals(42, privated2party.getsz(a));
    }

    @Test
    public void case55() {
        int[] a = { 23, 8, 7, 12, 23, 21, 29, 16, 42, 1, 46, 44, 22, 11, 8, 25, 0, 5, 45, 33, 29, 47, 37, 13, 20, 34, 40, 4, 42, 23, 36, 16, 17, 34, 28, 30, 5, 13, 28, 3, 39, 30, 26, 41, 17, 34, 42, 10 };
        assertEquals(47, privated2party.getsz(a));
    }

    @Test
    public void case56() {
        int[] a = { 38, 33, 12, 38, 29, 32, 21, 21, 6, 32, 18, 12, 4, 4, 15, 23, 37, 3, 28, 13, 8, 19, 39, 18, 22, 27, 41, 10, 24, 22, 25, 41, 20, 39, 39, 37, 3, 13, 13, 3, 34, 21 };
        assertEquals(41, privated2party.getsz(a));
    }

    @Test
    public void case57() {
        int[] a = { 18, 13, 24, 7, 36, 9, 2, 13, 4, 15, 5, 14, 24, 21, 3, 34, 34, 7, 19, 9, 32, 1, 15, 15, 24, 25, 33, 1, 12, 26, 8, 26, 30, 24, 10, 20, 5 };
        assertEquals(35, privated2party.getsz(a));
    }

    @Test
    public void case58() {
        int[] a = { 24, 6, 35, 20, 12, 11, 4, 25, 12, 17, 38, 19, 13, 37, 4, 38, 6, 27, 16, 30, 14, 21, 13, 30, 26, 24, 11, 22, 34, 33, 28, 33, 37, 0, 22, 4, 3, 18, 25, 10, 33 };
        assertEquals(40, privated2party.getsz(a));
    }

    @Test
    public void case59() {
        int[] a = { 9, 3, 4, 37, 37, 40, 24, 31, 38, 13, 43, 27, 30, 8, 44, 20, 1, 24, 23, 32, 24, 20, 31, 29, 24, 30, 1, 13, 29, 19, 6, 34, 0, 12, 14, 18, 2, 14, 44, 25, 15, 38, 28, 13, 24, 9 };
        assertEquals(46, privated2party.getsz(a));
    }

    @Test
    public void case60() {
        int[] a = { 15, 34, 22, 6, 43, 34, 47, 2, 31, 38, 12, 37, 26, 34, 36, 46, 46, 21, 22, 5, 27, 41, 45, 37, 33, 30, 39, 31, 13, 39, 22, 42, 41, 34, 7, 17, 17, 10, 31, 20, 37, 13, 9, 37, 16, 46, 13, 37, 9 };
        assertEquals(47, privated2party.getsz(a));
    }

    @Test
    public void case61() {
        int[] a = { 13, 22, 23, 19, 27, 2, 29, 2, 15, 17, 17, 12, 28, 5, 6, 26, 17, 29, 15, 5, 27, 23, 9, 19, 12, 27, 32, 8, 29, 4, 14, 25, 30 };
        assertEquals(31, privated2party.getsz(a));
    }

    @Test
    public void case62() {
        int[] a = { 12, 14, 19, 4, 23, 8, 7, 3, 3, 5, 7, 0, 16, 3, 4, 30, 23, 20, 31, 6, 26, 25, 11, 24, 21, 31, 15, 1, 18, 29, 18, 8 };
        assertEquals(31, privated2party.getsz(a));
    }

    @Test
    public void case63() {
        int[] a = { 2, 30, 21, 31, 24, 21, 32, 35, 12, 17, 0, 18, 32, 9, 40, 31, 0, 38, 11, 14, 0, 19, 10, 21, 34, 40, 6, 29, 43, 13, 26, 1, 0, 42, 25, 35, 37, 37, 6, 41, 19, 44, 38, 1, 44, 34 };
        assertEquals(44, privated2party.getsz(a));
    }

    @Test
    public void case64() {
        int[] a = { 27, 4, 31, 5, 44, 1, 43, 5, 8, 11, 22, 27, 8, 14, 21, 13, 43, 12, 16, 25, 38, 8, 43, 27, 36, 35, 37, 25, 28, 32, 5, 21, 43, 11, 29, 33, 1, 26, 31, 39, 1, 9, 14, 33, 21 };
        assertEquals(43, privated2party.getsz(a));
    }

    @Test
    public void case65() {
        int[] a = { 17, 1, 33, 16, 34, 34, 10, 25, 36, 22, 10, 19, 26, 12, 15, 2, 31, 19, 28, 34, 8, 19, 12, 17, 2, 13, 36, 20, 8, 4, 3, 7, 13, 31, 29, 9, 36, 23 };
        assertEquals(37, privated2party.getsz(a));
    }

    @Test
    public void case66() {
        int[] a = { 33, 11, 3, 24, 21, 18, 14, 29, 4, 2, 15, 17, 19, 35, 34, 25, 23, 22, 30, 31, 20, 32, 20, 8, 10, 28, 12, 16, 13, 5, 6, 7, 0, 1, 9, 27 };
        assertEquals(36, privated2party.getsz(a));
    }

    @Test
    public void case67() {
        int[] a = { 3, 4, 12, 3, 7, 14, 10, 0, 9, 6, 13, 18, 17, 2, 1, 16, 19, 15, 8, 19 };
        assertEquals(20, privated2party.getsz(a));
    }

    @Test
    public void case68() {
        int[] a = { 9, 9, 11, 15, 29, 4, 21, 22, 19, 3, 2, 31, 5, 13, 13, 27, 17, 8, 23, 5, 4, 23, 26, 25, 14, 28, 33, 14, 7, 30, 1, 12, 18, 16 };
        assertEquals(34, privated2party.getsz(a));
    }

    @Test
    public void case69() {
        int[] a = { 39, 9, 15, 23, 20, 38, 10, 37, 19, 34, 0, 41, 27, 5, 29, 40, 12, 1, 17, 24, 14, 22, 31, 16, 3, 21, 11, 2, 18, 30, 28, 35, 13, 26, 8, 6, 7, 37, 36, 4, 32, 25 };
        assertEquals(42, privated2party.getsz(a));
    }

    @Test
    public void case70() {
        int[] a = { 11, 18, 21, 10, 17, 13, 8, 2, 8, 19, 6, 3, 9, 14, 12, 5, 20, 0, 7, 1, 15, 4 };
        assertEquals(22, privated2party.getsz(a));
    }

    @Test
    public void case71() {
        int[] a = { 15, 18, 12, 32, 10, 3, 30, 16, 34, 20, 23, 23, 21, 27, 42, 25, 2, 17, 18, 35, 40, 21, 6, 7, 7, 11, 29, 36, 44, 43, 31, 9, 28, 22, 24, 41, 1, 5, 0, 17, 37, 26, 4, 13, 38 };
        assertEquals(45, privated2party.getsz(a));
    }

    @Test
    public void case72() {
        int[] a = { 19, 1, 1, 16, 20, 21, 0, 5, 6, 10, 11, 18, 3, 2, 22, 14, 9, 12, 23, 17, 8, 4, 7, 13 };
        assertEquals(24, privated2party.getsz(a));
    }

    @Test
    public void case73() {
        int[] a = { 34, 29, 3, 39, 18, 13, 4, 6, 32, 28, 36, 25, 15, 19, 14, 31, 2, 24, 38, 37, 30, 27, 21, 5, 12, 22, 35, 10, 1, 33, 26, 0, 11, 17, 7, 9, 16, 8, 23, 14 };
        assertEquals(40, privated2party.getsz(a));
    }

    @Test
    public void case74() {
        int[] a = { 3, 16, 7, 17, 29, 11, 5, 33, 14, 21, 31, 8, 15, 4, 30, 23, 10, 1, 26, 9, 2, 18, 20, 23, 19, 0, 22, 25, 27, 24, 28, 12, 13, 6, 32 };
        assertEquals(35, privated2party.getsz(a));
    }

    @Test
    public void case75() {
        int[] a = { 16, 7, 24, 9, 3, 0, 5, 10, 14, 25, 2, 6, 19, 4, 22, 26, 15, 12, 1, 13, 8, 11, 23, 23, 21, 20, 17 };
        assertEquals(27, privated2party.getsz(a));
    }

    @Test
    public void case76() {
        int[] a = { 7, 1, 24, 11, 9, 16, 5, 4, 19, 15, 0, 8, 1, 22, 20, 23, 3, 18, 13, 21, 12, 14, 6, 2, 17 };
        assertEquals(25, privated2party.getsz(a));
    }

    @Test
    public void case77() {
        int[] a = { 6, 2, 11, 9, 23, 24, 10, 5, 7, 28, 21, 4, 16, 3, 27, 19, 15, 14, 20, 1, 20, 22, 25, 0, 12, 18, 13, 8, 17 };
        assertEquals(29, privated2party.getsz(a));
    }

    @Test
    public void case78() {
        int[] a = { 12, 6, 25, 23, 8, 3, 9, 31, 2, 9, 7, 4, 10, 17, 5, 26, 24, 27, 16, 15, 22, 11, 13, 30, 21, 20, 28, 14, 29, 18, 1, 19 };
        assertEquals(32, privated2party.getsz(a));
    }

    @Test
    public void case79() {
        int[] a = { 36, 20, 17, 23, 15, 28, 24, 21, 40, 1, 0, 2, 37, 33, 38, 6, 19, 7, 27, 34, 39, 16, 11, 30, 24, 4, 14, 40, 29, 41, 31, 9, 25, 35, 26, 18, 22, 5, 32, 13, 10, 8 };
        assertEquals(42, privated2party.getsz(a));
    }

    @Test
    public void case80() {
        int[] a = { 32, 35, 15, 1, 27, 4, 14, 5, 23, 31, 21, 10, 2, 14, 0, 19, 16, 13, 20, 11, 33, 30, 12, 24, 26, 23, 17, 25, 7, 28, 18, 34, 16, 6, 8, 0 };
        assertEquals(36, privated2party.getsz(a));
    }

    @Test
    public void case81() {
        int[] a = { 40, 18, 36, 38, 11, 7, 19, 6, 5, 20, 4, 16, 8, 35, 12, 31, 1, 13, 24, 29, 0, 10, 30, 37, 32, 25, 22, 26, 27, 17, 25, 21, 33, 3, 14, 9, 15, 28, 34, 2, 23 };
        assertEquals(41, privated2party.getsz(a));
    }

    @Test
    public void case82() {
        int[] a = { 21, 15, 14, 5, 4, 0, 20, 23, 30, 31, 19, 4, 11, 27, 16, 9, 26, 24, 29, 14, 34, 32, 3, 18, 6, 10, 26, 22, 30, 17, 4, 12, 28, 2, 1 };
        assertEquals(35, privated2party.getsz(a));
    }

    @Test
    public void case83() {
        int[] a = { 20, 4, 26, 29, 30, 6, 3, 22, 8, 13, 15, 0, 32, 5, 7, 17, 23, 24, 31, 16, 18, 27, 1, 12, 28, 8, 11, 2, 14, 21, 25, 33, 10, 19 };
        assertEquals(34, privated2party.getsz(a));
    }

    @Test
    public void case84() {
        int[] a = { 21, 15, 25, 6, 5, 1, 18, 11, 9, 20, 16, 11, 3, 19, 28, 2, 17, 24, 23, 14, 26, 22, 27, 13, 0, 12, 7, 8, 10 };
        assertEquals(29, privated2party.getsz(a));
    }

    @Test
    public void case85() {
        int[] a = { 32, 9, 28, 25, 19, 15, 6, 42, 43, 29, 20, 4, 13, 26, 33, 6, 1, 8, 2, 21, 30, 45, 36, 40, 39, 35, 0, 12, 38, 46, 14, 5, 37, 31, 18, 15, 23, 17, 22, 48, 24, 47, 3, 10, 41, 44, 27, 16, 11 };
        assertEquals(49, privated2party.getsz(a));
    }

    @Test
    public void case86() {
        int[] a = { 8, 44, 45, 40, 24, 24, 1, 27, 25, 41, 5, 28, 32, 48, 13, 38, 28, 23, 18, 4, 11, 15, 0, 29, 34, 2, 35, 14, 12, 43, 45, 22, 26, 31, 18, 10, 7, 19, 46, 21, 49, 46, 17, 39, 42, 9, 37, 6, 3, 38 };
        assertEquals(50, privated2party.getsz(a));
    }

    @Test
    public void case87() {
        int[] a = { 34, 11, 38, 48, 32, 16, 12, 13, 28, 40, 25, 19, 33, 43, 37, 24, 27, 5, 7, 22, 6, 2, 45, 41, 46, 35, 9, 4, 47, 39, 23, 29, 26, 3, 30, 44, 49, 36, 1, 21, 0, 31, 10, 43, 8, 42, 18, 20, 15, 17 };
        assertEquals(50, privated2party.getsz(a));
    }

    @Test
    public void case88() {
        int[] a = { 7, 2, 29, 1, 14, 27, 3, 9, 18, 19, 18, 21, 33, 4, 17, 10, 11, 30, 18, 12, 6, 0, 24, 15, 31, 28, 32, 27, 5, 8, 23, 25, 34, 20, 22 };
        assertEquals(35, privated2party.getsz(a));
    }

    @Test
    public void case89() {
        int[] a = { 28, 31, 12, 6, 22, 8, 6, 23, 1, 11, 7, 4, 0, 20, 15, 3, 25, 19, 24, 21, 2, 13, 17, 5, 26, 14, 29, 30, 16, 10, 18, 11 };
        assertEquals(32, privated2party.getsz(a));
    }

    @Test
    public void case90() {
        int[] a = { 4, 9, 7, 19, 43, 16, 18, 44, 34, 47, 11, 3, 22, 13, 26, 35, 48, 0, 32, 23, 42, 8, 41, 29, 12, 30, 5, 37, 1, 17, 10, 49, 40, 25, 20, 46, 39, 13, 15, 28, 38, 36, 45, 6, 27, 24, 21, 31, 33, 2 };
        assertEquals(50, privated2party.getsz(a));
    }

    @Test
    public void case91() {
        int[] a = { 37, 8, 2, 5, 28, 29, 23, 3, 10, 19, 24, 7, 13, 31, 11, 27, 26, 16, 25, 38, 6, 35, 15, 41, 4, 40, 36, 9, 0, 18, 22, 20, 2, 30, 33, 17, 1, 32, 12, 14, 21, 39 };
        assertEquals(42, privated2party.getsz(a));
    }

    @Test
    public void case92() {
        int[] a = { 10, 16, 4, 5, 0, 36, 17, 1, 2, 14, 11, 24, 30, 31, 22, 28, 6, 19, 37, 33, 35, 20, 12, 38, 27, 30, 9, 7, 23, 34, 29, 3, 8, 33, 15, 26, 11, 25, 13 };
        assertEquals(39, privated2party.getsz(a));
    }

    @Test
    public void case93() {
        int[] a = { 17, 8, 0, 38, 30, 35, 44, 4, 3, 26, 16, 6, 49, 11, 31, 20, 37, 40, 39, 45, 41, 43, 10, 32, 29, 47, 33, 27, 34, 27, 21, 42, 28, 1, 46, 12, 22, 2, 19, 25, 5, 14, 48, 23, 9, 36, 24, 7, 13, 18 };
        assertEquals(50, privated2party.getsz(a));
    }

    @Test
    public void case94() {
        int[] a = { 1, 28, 30, 35, 4, 12, 20, 27, 36, 32, 0, 19, 17, 14, 9, 25, 39, 18, 38, 15, 13, 2, 4, 37, 5, 8, 21, 3, 24, 33, 6, 23, 34, 10, 31, 16, 22, 7, 11, 40, 29 };
        assertEquals(41, privated2party.getsz(a));
    }

    @Test
    public void case95() {
        int[] a = { 26, 19, 20, 11, 18, 23, 37, 32, 9, 34, 0, 13, 6, 25, 3, 40, 41, 29, 16, 36, 12, 1, 38, 17, 15, 22, 20, 14, 21, 42, 30, 30, 5, 21, 32, 27, 43, 39, 7, 24, 33, 44, 4, 31, 10 };
        assertEquals(45, privated2party.getsz(a));
    }

    @Test
    public void case96() {
        int[] a = { 6, 23, 19, 27, 32, 5, 16, 13, 31, 34, 30, 1, 0, 21, 15, 35, 33, 8, 20, 12, 24, 18, 38, 37, 22, 11, 2, 5, 17, 7, 26, 14, 28, 3, 10, 36, 9, 4, 25 };
        assertEquals(39, privated2party.getsz(a));
    }

    @Test
    public void case97() {
        int[] a = { 30, 10, 5, 44, 1, 5, 48, 34, 40, 45, 32, 33, 39, 41, 27, 29, 0, 13, 2, 22, 12, 7, 20, 11, 8, 43, 4, 35, 31, 23, 9, 14, 24, 17, 3, 47, 21, 42, 28, 15, 16, 26, 46, 49, 25, 6, 19, 36, 18, 37 };
        assertEquals(50, privated2party.getsz(a));
    }

    @Test
    public void case98() {
        int[] a = { 28, 15, 36, 35, 16, 7, 22, 21, 44, 47, 31, 14, 43, 45, 3, 46, 49, 13, 25, 30, 26, 29, 48, 34, 1, 27, 6, 0, 23, 12, 4, 39, 10, 6, 20, 42, 26, 17, 2, 24, 18, 19, 33, 40, 37, 41, 11, 32, 48, 36 };
        assertEquals(50, privated2party.getsz(a));
    }

    @Test
    public void case99() {
        int[] a = { 27, 3, 34, 32, 9, 15, 8, 28, 21, 14, 6, 19, 7, 12, 16, 22, 13, 26, 33, 2, 10, 23, 11, 25, 17, 5, 20, 35, 0, 4, 24, 30, 31, 1, 34, 18 };
        assertEquals(36, privated2party.getsz(a));
    }

    @Test
    public void case100() {
        int[] a = { 2, 20, 12, 0, 31, 11, 25, 36, 27, 13, 22, 10, 6, 32, 17, 5, 34, 4, 21, 28, 35, 33, 8, 16, 7, 23, 18, 24, 29, 15, 19, 3, 32, 14, 30, 9, 1 };
        assertEquals(37, privated2party.getsz(a));
    }

    @Test
    public void case101() {
        int[] a = { 29, 48, 27, 6, 33, 25, 44, 45, 20, 34, 47, 28, 18, 19, 12, 31, 11, 40, 0, 7, 45, 22, 22, 38, 35, 23, 41, 10, 36, 49, 15, 46, 9, 16, 1, 42, 37, 26, 4, 2, 5, 14, 21, 30, 43, 24, 13, 8, 17, 39 };
        assertEquals(50, privated2party.getsz(a));
    }

    @Test
    public void case102() {
        int[] a = { 35, 41, 9, 14, 36, 12, 32, 13, 11, 44, 48, 22, 8, 37, 20, 0, 26, 16, 42, 46, 1, 33, 38, 3, 40, 10, 15, 25, 23, 31, 5, 2, 24, 39, 28, 43, 30, 27, 17, 34, 40, 6, 19, 7, 21, 49, 47, 45, 29, 4 };
        assertEquals(50, privated2party.getsz(a));
    }

    @Test
    public void case103() {
        int[] a = { 33, 45, 49, 38, 5, 40, 48, 37, 26, 21, 11, 7, 41, 0, 24, 44, 12, 42, 23, 35, 28, 14, 20, 36, 8, 34, 30, 17, 10, 22, 15, 25, 31, 2, 3, 4, 27, 16, 38, 46, 18, 1, 29, 13, 43, 32, 9, 19, 39, 47 };
        assertEquals(50, privated2party.getsz(a));
    }

    @Test
    public void case104() {
        int[] a = { 38, 42, 5, 29, 7, 18, 6, 14, 16, 17, 26, 34, 49, 37, 44, 25, 15, 47, 3, 0, 19, 20, 12, 24, 8, 27, 6, 32, 22, 23, 48, 9, 41, 36, 13, 46, 10, 2, 4, 35, 21, 28, 45, 11, 28, 40, 1, 30, 39, 33 };
        assertEquals(50, privated2party.getsz(a));
    }

    @Test
    public void case105() {
        int[] a = { 40, 36, 20, 6, 39, 15, 34, 14, 2, 3, 25, 43, 4, 44, 10, 26, 7, 41, 12, 18, 29, 17, 32, 0, 11, 25, 16, 19, 1, 22, 23, 9, 13, 42, 35, 30, 38, 31, 27, 21, 28, 5, 8, 45, 24, 37 };
        assertEquals(46, privated2party.getsz(a));
    }

    @Test
    public void case106() {
        int[] a = { 27, 4, 20, 18, 4, 16, 33, 24, 46, 49, 19, 9, 7, 35, 22, 12, 36, 13, 21, 39, 25, 11, 31, 15, 8, 26, 28, 34, 29, 37, 1, 48, 17, 23, 2, 40, 44, 30, 32, 45, 41, 6, 43, 0, 14, 42, 5, 10, 47, 38 };
        assertEquals(50, privated2party.getsz(a));
    }

    @Test
    public void case107() {
        int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49 };
        assertEquals(50, privated2party.getsz(a));
    }

    @Test
    public void case108() {
        int[] a = { 25, 48, 15, 23, 8, 20, 11, 14, 4, 40, 35, 6, 41, 28, 7, 2, 19, 43, 26, 16, 5, 30, 47, 3, 34, 0, 18, 37, 13, 49, 21, 45, 33, 32, 24, 10, 38, 27, 36, 44, 9, 12, 46, 17, 39, 31, 42, 22, 1, 29 };
        assertEquals(25, privated2party.getsz(a));
    }

    @Test
    public void case109() {
        int[] a = { 0 };
        assertEquals(1, privated2party.getsz(a));
    }

    @Test
    public void case110() {
        int[] a = { 3, 3, 3, 3, 3, 3, 3, 3, 3 };
        assertEquals(9, privated2party.getsz(a));
    }

    @Test
    public void case111() {
        int[] a = { 0, 1 };
        assertEquals(2, privated2party.getsz(a));
    }

    @Test
    public void case112() {
        int[] a = { 1, 2, 0 };
        assertEquals(2, privated2party.getsz(a));
    }

    @Test
    public void case113() {
        int[] a = { 1, 0, 0, 0 };
        assertEquals(3, privated2party.getsz(a));
    }

    @Test
    public void case114() {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 0 };
        assertEquals(49, privated2party.getsz(a));
    }

    @Test
    public void case115() {
        int[] a = { 0, 1, 1, 1, 1 };
        assertEquals(5, privated2party.getsz(a));
    }

    @Test
    public void case116() {
        int[] a = { 10, 0, 4, 5, 1, 2, 9, 8, 3, 7, 6 };
        assertEquals(10, privated2party.getsz(a));
    }

    @Test
    public void case117() {
        int[] a = { 3, 0, 1, 2 };
        assertEquals(3, privated2party.getsz(a));
    }

    @Test
    public void case118() {
        int[] a = { 4, 0, 1, 2, 3 };
        assertEquals(4, privated2party.getsz(a));
    }

    @Test
    public void case119() {
        int[] a = { 0, 0, 0, 0, 0 };
        assertEquals(5, privated2party.getsz(a));
    }

    @Test
    public void case120() {
        int[] a = { 6, 5, 5, 4, 4, 3, 3, 2 };
        assertEquals(8, privated2party.getsz(a));
    }

    @Test
    public void case121() {
        int[] a = { 0, 0, 0, 0, 0, 0 };
        assertEquals(6, privated2party.getsz(a));
    }

    @Test
    public void case122() {
        int[] a = { 1, 3, 4, 1, 0 };
        assertEquals(4, privated2party.getsz(a));
    }

    @Test
    public void case123() {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 0 };
        assertEquals(25, privated2party.getsz(a));
    }

    @Test
    public void case124() {
        int[] a = { 0, 0, 2, 3 };
        assertEquals(4, privated2party.getsz(a));
    }

    @Test
    public void case125() {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 33, 34, 35, 36, 2, 3, 4, 5, 6, 7, 8, 0, 12, 13, 14, 15, 16, 8 };
        assertEquals(48, privated2party.getsz(a));
    }

    @Test
    public void case126() {
        int[] a = { 0, 1, 2, 3, 4, 5, 6 };
        assertEquals(7, privated2party.getsz(a));
    }

    @Test
    public void case127() {
        int[] a = { 1, 1, 1, 1 };
        assertEquals(4, privated2party.getsz(a));
    }

    @Test
    public void case128() {
        int[] a = { 2, 0, 1 };
        assertEquals(2, privated2party.getsz(a));
    }

    @Test
    public void case129() {
        int[] a = { 0, 0, 0, 0, 4 };
        assertEquals(5, privated2party.getsz(a));
    }

    @Test
    public void case130() {
        int[] a = { 0, 1, 2, 3, 5, 6, 6, 5, 7 };
        assertEquals(9, privated2party.getsz(a));
    }

    @Test
    public void case131() {
        int[] a = { 2, 0, 3, 1, 2 };
        assertEquals(4, privated2party.getsz(a));
    }

    @Test
    public void case132() {
        int[] a = { 1, 2, 3, 4, 0, 2, 2, 1, 1 };
        assertEquals(8, privated2party.getsz(a));
    }

    @Test
    public void case133() {
        int[] a = { 41, 36, 6, 23, 42, 39, 42, 40, 49, 30, 17, 36, 33, 22, 32, 30, 13, 44, 46, 17, 26, 26, 10, 1, 9, 9, 26, 18, 24, 46, 43, 5, 12, 9, 25, 33, 27, 28, 11, 7, 15, 33, 18, 28, 33, 26, 11, 40, 42, 36 };
        assertEquals(48, privated2party.getsz(a));
    }

    @Test
    public void case134() {
        int[] a = { 0, 1, 2, 1, 3, 4, 5, 6, 5, 4, 2, 1, 1, 1, 1, 1, 1, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 1, 2, 3, 4, 5, 6 };
        assertEquals(49, privated2party.getsz(a));
    }

    @Test
    public void case135() {
        int[] a = { 0, 2, 3, 1, 2, 3, 5 };
        assertEquals(6, privated2party.getsz(a));
    }

    @Test
    public void case136() {
        int[] a = { 1, 2, 3, 0 };
        assertEquals(3, privated2party.getsz(a));
    }

    @Test
    public void case137() {
        int[] a = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(50, privated2party.getsz(a));
    }

    @Test
    public void case138() {
        int[] a = { 0, 0, 0, 0 };
        assertEquals(4, privated2party.getsz(a));
    }

    @Test
    public void case139() {
        int[] a = { 2, 0, 3, 1 };
        assertEquals(3, privated2party.getsz(a));
    }

    @Test
    public void case140() {
        int[] a = { 3, 2, 0, 1, 5, 4 };
        assertEquals(4, privated2party.getsz(a));
    }

    @Test
    public void case141() {
        int[] a = { 2, 2, 1, 3, 4, 1, 0, 0, 1, 2, 3, 2, 2, 3, 6, 7, 3, 2, 6, 8, 11, 13, 12, 14, 15, 16, 19, 43, 34, 23, 24, 43, 12, 10, 19, 18, 7, 21, 29, 31, 27, 26, 23, 33, 37, 38, 39, 3, 2, 2 };
        assertEquals(49, privated2party.getsz(a));
    }

    @Test
    public void case142() {
        int[] a = { 2, 2, 2, 4, 5, 0 };
        assertEquals(6, privated2party.getsz(a));
    }

    @Test
    public void case143() {
        int[] a = { 0, 0 };
        assertEquals(2, privated2party.getsz(a));
    }

    @Test
    public void case144() {
        int[] a = { 5, 4, 3, 2, 1, 0 };
        assertEquals(3, privated2party.getsz(a));
    }

    @Test
    public void case145() {
        int[] a = { 1, 2, 0, 0 };
        assertEquals(3, privated2party.getsz(a));
    }

    @Test
    public void case146() {
        int[] a = { 3, 2, 1, 1 };
        assertEquals(3, privated2party.getsz(a));
    }

    @Test
    public void case147() {
        int[] a = { 1, 2, 0, 4, 5, 3 };
        assertEquals(4, privated2party.getsz(a));
    }

    @Test
    public void case148() {
        int[] a = { 0, 0, 0 };
        assertEquals(3, privated2party.getsz(a));
    }

    @Test
    public void case149() {
        int[] a = { 1, 2, 0, 0, 4 };
        assertEquals(4, privated2party.getsz(a));
    }

    @Test
    public void case150() {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 0 };
        assertEquals(17, privated2party.getsz(a));
    }

}
