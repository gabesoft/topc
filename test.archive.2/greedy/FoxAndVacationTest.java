package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class FoxAndVacationTest {
    FoxAndVacation foxandvacation = new FoxAndVacation();

    @Test
    public void case1() {
        int total = 5;
        int[] d = { 2, 2, 2 };
        assertEquals(2, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case2() {
        int total = 5;
        int[] d = { 5, 6, 1 };
        assertEquals(1, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case3() {
        int total = 5;
        int[] d = { 6, 6, 6 };
        assertEquals(0, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case4() {
        int total = 6;
        int[] d = { 1, 1, 1, 1, 1 };
        assertEquals(5, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case5() {
        int total = 10;
        int[] d = { 7, 1, 5, 6, 1, 3, 4 };
        assertEquals(4, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case6() {
        int total = 50;
        int[] d = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        assertEquals(9, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case7() {
        int total = 21;
        int[] d = { 14, 2, 16, 9, 9, 5, 5, 23, 25, 20, 8, 25, 6, 12, 3, 2, 4, 5, 10, 14, 19, 12, 25, 15, 14 };
        assertEquals(6, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case8() {
        int total = 14;
        int[] d = { 11, 4, 3 };
        assertEquals(2, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case9() {
        int total = 50;
        int[] d = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(50, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case10() {
        int total = 38;
        int[] d = { 15, 12, 17, 11, 23, 19, 6, 19, 30, 19, 13, 27, 23, 12, 3, 14, 18, 22, 35, 36, 4 };
        assertEquals(5, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case11() {
        int total = 13;
        int[] d = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(13, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case12() {
        int total = 32;
        int[] d = { 1, 1, 2, 2, 2, 2, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 1, 1 };
        assertEquals(20, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case13() {
        int total = 16;
        int[] d = { 5, 8, 17, 13, 15, 13, 23, 7, 15, 5, 23, 10, 2, 13, 20, 5, 1, 21, 6, 10, 8, 25, 2, 20, 2, 12, 13, 25, 25, 24, 24, 21, 13, 11, 3, 18, 2, 5, 5, 12, 6, 11, 8, 6, 6, 1, 23 };
        assertEquals(7, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case14() {
        int total = 10;
        int[] d = { 1, 37, 6, 37, 45, 38, 6, 47, 41, 42, 40, 30, 15, 9, 40, 41, 12, 37, 24, 17, 12, 47, 28, 17, 3, 10, 32, 8, 26, 39, 6, 16, 9, 46, 24, 29, 16, 2, 24, 10, 27, 3, 4, 44, 14, 47 };
        assertEquals(4, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case15() {
        int total = 49;
        int[] d = { 1, 1, 1, 3, 1, 1, 1, 2, 3, 1, 3, 1, 3, 1, 3, 3, 1, 3, 1, 1, 3, 3, 1, 2, 3, 3 };
        assertEquals(25, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case16() {
        int total = 18;
        int[] d = { 14, 13, 3, 10, 6, 11, 4, 1, 16, 2, 16, 3, 11, 5, 9, 14, 8, 18, 13 };
        assertEquals(6, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case17() {
        int total = 4;
        int[] d = { 15, 18, 9, 2, 21, 20, 20, 14, 24, 33, 3, 33, 5, 3, 1, 31, 19, 21, 23, 29, 6, 14, 15, 3, 24, 29, 33, 21, 13, 7, 20, 30, 26, 33, 18, 19, 22, 3, 11, 21, 32, 30 };
        assertEquals(2, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case18() {
        int total = 25;
        int[] d = { 1, 6, 2, 4, 3, 3, 6, 2, 7, 2, 3, 5, 1, 1, 1, 1, 4, 6, 5, 2, 4, 5, 5, 4, 4, 3 };
        assertEquals(13, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case19() {
        int total = 48;
        int[] d = { 4, 5, 2, 3, 5, 5, 3, 1, 3, 5, 5, 5, 4 };
        assertEquals(12, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case20() {
        int total = 23;
        int[] d = { 5, 32, 6, 12, 2, 22, 9, 11, 26, 7, 20, 5, 24, 31, 19, 6, 33, 11, 29, 6, 29, 3 };
        assertEquals(5, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case21() {
        int total = 47;
        int[] d = { 9, 31, 32, 15, 13, 27, 19, 9, 10, 9, 14, 20, 25, 8, 6, 8, 10, 14, 7, 19, 18, 27, 1, 30 };
        assertEquals(6, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case22() {
        int total = 46;
        int[] d = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(23, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case23() {
        int total = 39;
        int[] d = { 14, 16, 7, 17, 10, 8, 12, 15, 5, 3, 16, 10, 10, 3, 7, 4, 17, 11, 4, 6, 9, 18, 5, 6, 16, 1, 3, 17, 18, 11, 8, 16, 13, 17, 14, 8, 5, 10, 7, 2, 12 };
        assertEquals(10, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case24() {
        int total = 18;
        int[] d = { 20, 5, 11, 21, 20, 14, 3, 15, 17, 4, 6, 4, 11, 16, 23 };
        assertEquals(4, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case25() {
        int total = 31;
        int[] d = { 20, 3, 6, 17, 12, 1, 1, 10, 18, 18, 18, 8, 4, 11, 11, 12 };
        assertEquals(6, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case26() {
        int total = 16;
        int[] d = { 8, 3, 5, 5, 14, 7, 8, 1, 10, 9, 5, 6, 10, 3, 1, 7, 5, 10, 12, 15, 12, 1, 9, 1, 14, 6, 4, 3, 7, 2, 15, 5, 2, 14, 13, 9, 5, 13, 16, 11, 7, 15, 10 };
        assertEquals(8, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case27() {
        int total = 28;
        int[] d = { 1, 1, 1 };
        assertEquals(3, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case28() {
        int total = 33;
        int[] d = { 12, 4, 13, 20, 10, 4 };
        assertEquals(4, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case29() {
        int total = 50;
        int[] d = { 14, 14, 8, 11, 16, 4, 15, 19 };
        assertEquals(4, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case30() {
        int total = 3;
        int[] d = { 11, 9, 26, 20 };
        assertEquals(0, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case31() {
        int total = 43;
        int[] d = { 6, 34, 4, 44, 14 };
        assertEquals(3, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case32() {
        int total = 26;
        int[] d = { 24, 10, 7, 40, 32, 18, 7, 24, 40, 35, 19, 32, 16, 28, 17, 29, 38, 2, 2, 20, 33, 16, 6, 24, 30, 25, 5, 20, 34, 26, 12 };
        assertEquals(5, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case33() {
        int total = 22;
        int[] d = { 11, 4, 28, 20, 30, 3, 3, 1, 27, 1, 14, 14, 27, 27, 22, 2, 21, 18, 30, 23, 31, 3, 26, 15, 20, 28, 6, 11, 17, 11, 13, 23, 10, 7 };
        assertEquals(7, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case34() {
        int total = 37;
        int[] d = { 5, 1, 3, 6, 8, 12, 13, 3, 5, 3, 3, 6, 8, 12, 3, 9, 4, 2, 5, 5, 8, 9, 1, 9, 3, 5, 4, 7 };
        assertEquals(12, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case35() {
        int total = 39;
        int[] d = { 12, 12, 3, 15 };
        assertEquals(3, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case36() {
        int total = 46;
        int[] d = { 3, 4, 2, 1, 3, 3, 3, 4, 1, 4, 1, 1, 1, 2, 3, 4 };
        assertEquals(16, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case37() {
        int total = 42;
        int[] d = { 17, 3, 6, 9, 8, 16, 10, 6, 2, 15, 9, 3, 14, 22, 1, 22, 8, 13, 20, 3, 19, 17, 6, 16, 22, 1, 1, 8, 6, 17, 5, 5, 17, 18 };
        assertEquals(12, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case38() {
        int total = 22;
        int[] d = { 8, 1, 1, 2, 6, 4, 4, 4, 2, 3, 10, 2, 9, 1, 5, 8, 2, 1, 2, 3, 9, 1, 10, 1, 9, 7, 8, 4, 6, 2, 9, 2, 7, 4, 7, 7, 5, 5, 4, 7, 8, 8, 7, 10 };
        assertEquals(13, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case39() {
        int total = 37;
        int[] d = { 28, 31, 27 };
        assertEquals(1, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case40() {
        int total = 17;
        int[] d = { 8, 5, 14, 10, 13 };
        assertEquals(2, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case41() {
        int total = 43;
        int[] d = { 8, 17, 10, 2, 22, 7, 17, 15, 13, 14, 16, 4, 10, 18, 22, 11, 11, 22, 8, 17, 11, 10, 9, 8, 11, 12, 20, 4, 9, 19, 2, 5, 8, 13, 5, 3, 19, 19, 22, 18, 11, 7, 13, 17, 21, 8, 8 };
        assertEquals(9, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case42() {
        int total = 14;
        int[] d = { 2, 2, 2, 2, 2, 1, 2, 1, 2, 2, 1, 1, 2, 1, 2, 1, 2, 1, 2, 2, 1, 1, 1, 2, 2, 1, 2, 1, 1, 1 };
        assertEquals(14, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case43() {
        int total = 39;
        int[] d = { 4, 2, 4, 10, 6, 4, 1, 6, 6, 10, 10, 11, 10, 3, 4, 11, 10, 3, 4, 10, 5, 9, 6, 9, 8, 7, 4, 1, 2, 2, 9, 3, 9, 3, 8, 4, 1, 11, 7, 3, 6, 10, 6, 10, 10, 1 };
        assertEquals(15, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case44() {
        int total = 25;
        int[] d = { 26, 5, 32, 4, 7, 37, 30 };
        assertEquals(3, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case45() {
        int total = 15;
        int[] d = { 1, 2, 3, 5, 1, 5, 2, 1, 5, 2, 1, 4, 4, 4, 2, 7, 7, 5, 6 };
        assertEquals(9, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case46() {
        int total = 13;
        int[] d = { 6, 3, 1, 1, 4, 2, 3, 2, 2, 5, 4, 3 };
        assertEquals(6, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case47() {
        int total = 27;
        int[] d = { 28, 21, 2, 16, 18, 16, 9, 5, 1, 12, 17, 23, 22, 20, 15, 16, 1, 20, 25, 22, 6, 22, 15, 28, 9, 14, 25, 8, 14 };
        assertEquals(6, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case48() {
        int total = 28;
        int[] d = { 13, 21, 12, 4, 1, 17, 13, 6, 9, 5, 3, 8, 1, 13, 4, 12, 16, 13, 10, 23, 11, 19, 23, 11, 16, 13, 3, 22, 12, 6, 20, 23, 10, 17, 9, 24, 7, 21 };
        assertEquals(8, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case49() {
        int total = 49;
        int[] d = { 1, 2, 2, 1, 2, 1, 2, 2, 1, 1, 1, 1, 2, 2, 2, 2 };
        assertEquals(16, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case50() {
        int total = 32;
        int[] d = { 21, 17, 9 };
        assertEquals(2, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case51() {
        int total = 50;
        int[] d = { 2, 10, 10, 8, 6, 6, 6, 6, 7, 5, 11, 7, 8, 5, 6, 1, 4, 4, 10, 11, 11, 1, 3, 2, 2, 8, 1, 6, 1, 2, 11, 4, 6, 9, 2, 5, 11, 3, 11, 4 };
        assertEquals(17, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case52() {
        int total = 24;
        int[] d = { 5, 2, 7, 9, 11, 6, 2, 3, 1, 6, 8, 4, 11, 2, 10, 11, 7, 11, 7, 8, 7, 8, 8, 3, 11, 7, 10, 7, 6, 10, 5, 7, 9, 8, 7, 9, 8, 11, 3, 10, 8, 3, 2, 6 };
        assertEquals(9, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case53() {
        int total = 40;
        int[] d = { 13, 14, 2, 15, 1, 12, 6, 6, 16, 16, 8, 11, 11, 15, 8, 5, 12, 5, 7, 17, 8, 11, 1, 7, 13 };
        assertEquals(9, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case54() {
        int total = 45;
        int[] d = { 30, 13, 4, 24, 15, 13, 17, 10, 12, 13, 29, 14, 28, 28, 15, 28, 8, 2, 27, 17, 5, 24, 27, 13, 25, 4, 7, 4, 1, 15, 29, 19, 20, 29, 9, 5, 6, 15, 15, 20, 11, 26, 29, 20, 7, 12, 24 };
        assertEquals(10, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case55() {
        int total = 13;
        int[] d = { 5, 10, 3, 5, 11, 17, 11, 12, 3, 11, 6, 13, 3, 12, 2, 17, 5, 2, 8, 11, 13, 6, 3, 10, 1, 10, 8, 4, 16, 6, 5, 15, 2, 14, 11, 4, 3 };
        assertEquals(6, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case56() {
        int total = 39;
        int[] d = { 3, 11, 11, 2, 6, 7, 8, 4, 11, 13, 2, 12, 5, 6, 3, 11, 1, 1, 8, 7, 8, 9, 8, 4, 5, 7, 11, 1, 7, 11, 13, 5, 3, 1, 5, 10, 13, 5, 10, 10 };
        assertEquals(13, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case57() {
        int total = 14;
        int[] d = { 15, 10, 18, 3, 6, 1, 15, 2, 4, 4, 11, 6, 5, 15, 5, 6, 1, 7 };
        assertEquals(5, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case58() {
        int total = 24;
        int[] d = { 10, 2, 9, 3, 2, 3, 6, 2, 8, 2, 9, 5, 4, 2, 2, 3, 9, 6, 6, 3, 4, 3, 5, 7, 3, 2, 10, 5, 4, 9, 9, 1, 5, 8, 5 };
        assertEquals(11, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case59() {
        int total = 28;
        int[] d = { 3, 2, 2, 1, 3, 3, 2, 2, 1, 3, 2, 3, 1, 1, 3, 3, 3, 3, 3, 1, 2, 2, 1, 2, 2 };
        assertEquals(16, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case60() {
        int total = 35;
        int[] d = { 47, 36, 22, 27, 16, 26, 5, 50, 10, 2, 7, 24 };
        assertEquals(4, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case61() {
        int total = 44;
        int[] d = { 17, 23, 6, 16, 15, 2, 13, 29, 28, 24, 21, 1, 12, 28, 27, 27, 19, 18, 25, 22, 25, 26, 17, 1, 17, 6, 24, 21, 6, 19, 14, 26, 9 };
        assertEquals(8, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case62() {
        int total = 46;
        int[] d = { 28, 14, 23, 22, 30, 30, 20, 6, 32, 23, 30, 9 };
        assertEquals(3, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case63() {
        int total = 14;
        int[] d = { 30, 17, 26, 31, 33, 19, 16, 16 };
        assertEquals(0, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case64() {
        int total = 10;
        int[] d = { 9, 23, 9, 31, 36, 37, 14, 8, 21, 7, 43, 16, 21, 40, 7 };
        assertEquals(1, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case65() {
        int total = 14;
        int[] d = { 14, 9, 2, 15, 4, 9, 10, 8, 5, 19, 26, 26, 7, 8, 13, 21, 13, 2 };
        assertEquals(4, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case66() {
        int total = 11;
        int[] d = { 10, 9, 4, 8, 5, 12, 1, 6, 7, 3, 6, 2, 2, 14, 11, 15, 6, 8, 6, 3, 10, 13, 13, 6, 16, 14, 16, 2, 4, 13, 6, 14, 7, 10 };
        assertEquals(5, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case67() {
        int total = 42;
        int[] d = { 7, 1, 3, 8, 3, 3, 1, 2, 3, 7, 13, 6, 3, 6, 3, 14, 12, 9, 8, 6, 13, 5, 6, 7, 7, 4, 6, 4, 14, 7, 6, 8, 3, 11, 12, 3, 3, 14, 13, 9, 14 };
        assertEquals(14, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case68() {
        int total = 29;
        int[] d = { 23, 4, 22, 11, 12, 12, 12, 21, 17, 12, 23, 15, 20, 7, 21, 11, 13, 11 };
        assertEquals(3, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case69() {
        int total = 34;
        int[] d = { 19, 6, 1, 1, 10, 19, 16, 18, 15, 22, 8, 5, 3, 2, 1, 16 };
        assertEquals(8, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case70() {
        int total = 5;
        int[] d = { 7, 1, 2, 3, 8, 4, 4 };
        assertEquals(2, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case71() {
        int total = 22;
        int[] d = { 6, 12, 18, 22, 19, 14, 8, 3, 36, 15, 25, 20, 30, 28, 8, 33, 31, 22, 7, 14, 10, 19, 13, 3, 17, 1, 19, 11, 30, 6, 8, 8, 19, 27, 20, 27, 38 };
        assertEquals(5, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case72() {
        int total = 49;
        int[] d = { 3, 12, 2, 8, 30, 5, 2, 27, 13, 7, 12, 9, 28, 13, 23, 17, 20, 23, 27, 25, 14, 27, 4, 2, 9, 21, 29 };
        assertEquals(9, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case73() {
        int total = 27;
        int[] d = { 7 };
        assertEquals(1, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case74() {
        int total = 26;
        int[] d = { 12, 8, 6, 6, 4, 1, 1, 9, 2, 1, 9, 12, 13, 3, 3, 4, 11, 11, 3, 5, 7, 10, 8, 10, 13, 6, 7, 3, 10, 5 };
        assertEquals(10, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case75() {
        int total = 28;
        int[] d = { 15, 14, 28, 39, 25, 8, 12, 18, 2, 33, 28, 31 };
        assertEquals(3, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case76() {
        int total = 19;
        int[] d = { 39, 23, 16, 30, 32, 6 };
        assertEquals(1, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case77() {
        int total = 19;
        int[] d = { 19, 13, 16, 18, 11, 14, 4, 2, 16, 17, 11, 18, 14, 13, 8, 5, 1, 6, 13, 6, 2, 17, 6, 3, 19, 19, 2, 20, 14, 3, 16, 4, 15, 11, 3, 2, 11, 10, 5, 12, 14, 13, 19, 11, 4, 15 };
        assertEquals(8, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case78() {
        int total = 6;
        int[] d = { 16, 18, 31, 21, 29, 14, 5, 29, 1, 30, 30, 24, 18, 17, 42, 4, 14, 41, 11, 39, 6, 11, 22, 31, 16, 13, 24, 31, 42, 33, 13, 25, 7, 19, 41, 22, 13, 4, 11, 8, 21, 22, 33 };
        assertEquals(2, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case79() {
        int total = 34;
        int[] d = { 40, 18, 14, 2, 41, 5, 14, 6, 6, 20, 5, 10, 36 };
        assertEquals(6, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case80() {
        int total = 13;
        int[] d = { 1, 23, 14, 13, 7, 10, 15, 5, 20, 19, 25, 13, 28, 27, 16, 29, 22, 18, 26, 1, 2, 22 };
        assertEquals(4, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case81() {
        int total = 46;
        int[] d = { 14, 15, 16, 1, 16, 7, 17, 3, 16, 12, 17, 7, 16, 11, 12, 4, 13, 3, 4, 12 };
        assertEquals(8, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case82() {
        int total = 23;
        int[] d = { 44, 36, 20, 18, 38, 26, 1, 5, 5, 12, 20, 32, 39, 21, 40, 34, 26, 21, 43, 21, 11, 38, 37, 6, 19, 27, 43, 47, 14, 5, 42, 17, 19, 22, 30, 28, 33, 35, 29 };
        assertEquals(5, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case83() {
        int total = 46;
        int[] d = { 8, 8, 6, 3, 3, 6, 3, 8, 7, 11, 10, 10, 7, 7, 2, 3, 6, 1, 7, 3, 9, 6, 11, 5, 9, 8, 1 };
        assertEquals(12, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case84() {
        int total = 22;
        int[] d = { 3, 2, 2, 1, 3, 3 };
        assertEquals(6, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case85() {
        int total = 49;
        int[] d = { 15, 7, 3, 6, 15, 5, 5, 1, 2, 15, 5, 8, 3, 15, 12, 12, 11, 6, 10, 8, 10, 11, 7, 3, 1, 11, 8, 13, 6 };
        assertEquals(12, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case86() {
        int total = 44;
        int[] d = { 14, 33, 14, 28, 14, 1, 19, 26, 15, 30, 5, 12, 22, 9, 13, 4, 14 };
        assertEquals(6, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case87() {
        int total = 32;
        int[] d = { 19, 12, 13, 8, 3, 10, 10, 4, 9, 5, 2, 3 };
        assertEquals(6, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case88() {
        int total = 42;
        int[] d = { 13, 21, 18, 6, 10, 17, 5, 9, 8, 9, 12, 19, 1, 12, 8 };
        assertEquals(6, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case89() {
        int total = 5;
        int[] d = { 16, 25, 13, 23, 7, 20, 13, 9, 12, 28, 8, 21, 22, 6, 9, 7, 30, 2, 14, 10, 21, 7, 10, 24, 17, 3, 14, 9, 16, 18, 12, 9, 11, 15, 20, 5 };
        assertEquals(2, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case90() {
        int total = 12;
        int[] d = { 26, 6, 6, 27, 19, 1, 4, 6, 27, 5, 12, 1, 29, 14, 6, 3 };
        assertEquals(4, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case91() {
        int total = 12;
        int[] d = { 15, 26, 11, 9, 1, 2, 25 };
        assertEquals(3, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case92() {
        int total = 43;
        int[] d = { 10, 4, 10, 13, 8, 4, 9, 9, 10, 9, 12, 5, 11, 12, 9, 10, 4, 3, 7, 13, 12, 1, 4, 7, 7, 2, 9, 4, 12, 11, 5, 2, 13, 13, 3, 5, 12, 7, 9, 2, 4 };
        assertEquals(13, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case93() {
        int total = 18;
        int[] d = { 21, 15, 19, 38, 40, 40, 29, 26, 34, 11, 33, 32, 14, 6, 2, 35, 24, 25, 3, 14, 22, 10, 27, 13, 29, 10, 5 };
        assertEquals(4, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case94() {
        int total = 21;
        int[] d = { 31, 26, 13, 5, 6, 26, 21, 11, 7, 5, 4, 15, 28, 29, 25, 26, 30, 20, 22, 30, 12, 1, 19, 7, 8, 18, 34, 11, 29, 15, 32, 20, 19, 30, 29, 26, 10, 7, 18, 2, 8, 19, 6, 23, 18, 19 };
        assertEquals(5, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case95() {
        int total = 38;
        int[] d = { 8, 4, 6, 6, 8, 2, 2, 3, 2, 5, 4 };
        assertEquals(9, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case96() {
        int total = 45;
        int[] d = { 2, 7, 11, 17, 2, 9, 18, 16, 16, 8, 5, 18, 5, 17, 16, 5, 4, 13, 16, 10, 9, 3, 18, 15, 9, 5, 14, 7, 11, 3, 6, 17, 9, 7 };
        assertEquals(10, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case97() {
        int total = 37;
        int[] d = { 2, 1, 21, 25, 10, 18, 2, 30, 21, 27, 14, 8, 8, 9, 30, 7, 14, 28, 9, 12, 14, 17, 7, 25, 26, 11, 24, 29, 14, 31, 25, 18, 30, 8, 12, 31 };
        assertEquals(7, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case98() {
        int total = 45;
        int[] d = { 3, 1, 3, 2, 1, 3, 2, 2, 1, 2, 3, 3, 2, 3, 3, 2, 3, 3, 3, 3, 2, 2, 2, 2, 2, 3, 1, 2, 3, 2, 3, 1, 3 };
        assertEquals(22, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case99() {
        int total = 12;
        int[] d = { 25, 21, 26, 8, 8, 21, 1, 6, 28, 2, 6, 14, 10, 8, 26, 10, 11, 15, 6, 10, 17, 3, 26, 29, 24, 5, 11, 27, 14, 25, 4 };
        assertEquals(4, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case100() {
        int total = 7;
        int[] d = { 50, 32, 39, 40, 19, 49, 25, 46, 7, 29, 12, 23, 19, 17, 12, 15, 41, 36, 26, 45, 16, 2, 3, 9, 13 };
        assertEquals(2, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case101() {
        int total = 37;
        int[] d = { 33, 1, 21, 29, 12, 11, 30, 4, 3, 41, 7, 38, 2, 8, 15, 34, 29, 19, 42, 12, 27, 22 };
        assertEquals(7, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case102() {
        int total = 44;
        int[] d = { 18, 17, 7, 28, 29, 9, 6, 17, 26, 7, 11, 28, 14, 11, 27, 31 };
        assertEquals(5, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case103() {
        int total = 45;
        int[] d = { 19, 20, 2, 1, 6, 20, 13, 7, 2, 22, 8, 21, 19, 9, 22, 22, 19, 20, 3, 8, 6, 8, 15, 4, 5, 5, 19, 14, 11, 5, 17, 7, 22, 2 };
        assertEquals(11, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case104() {
        int total = 44;
        int[] d = { 29, 13, 17, 33, 31, 7, 36, 17, 20, 39, 13, 8, 30, 36, 25, 6, 13, 35, 13, 34, 27, 40, 25, 40, 35, 21 };
        assertEquals(4, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case105() {
        int total = 38;
        int[] d = { 33 };
        assertEquals(1, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case106() {
        int total = 45;
        int[] d = { 23, 19, 15, 24, 34, 27, 17, 18, 6, 35, 17, 4, 23, 34, 8, 32, 32, 19, 10, 16, 2, 21, 32, 30, 4, 22 };
        assertEquals(6, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case107() {
        int total = 9;
        int[] d = { 1, 2, 3, 6 };
        assertEquals(3, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case108() {
        int total = 1;
        int[] d = { 1 };
        assertEquals(1, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case109() {
        int total = 5;
        int[] d = { 5 };
        assertEquals(1, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case110() {
        int total = 10;
        int[] d = { 2, 2, 2, 2, 2 };
        assertEquals(5, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case111() {
        int total = 21;
        int[] d = { 14, 2, 16, 9, 9, 5, 5, 23, 25, 20, 8, 25, 6, 12, 3, 2, 4, 5, 10, 14, 19, 12, 25, 15, 14 };
        assertEquals(6, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case112() {
        int total = 2;
        int[] d = { 1, 1, 1 };
        assertEquals(2, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case113() {
        int total = 6;
        int[] d = { 1, 1, 1, 1, 1 };
        assertEquals(5, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case114() {
        int total = 10;
        int[] d = { 7, 1, 5, 6, 1, 3, 4 };
        assertEquals(4, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case115() {
        int total = 50;
        int[] d = { 1, 1 };
        assertEquals(2, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case116() {
        int total = 50;
        int[] d = { 1 };
        assertEquals(1, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case117() {
        int total = 10;
        int[] d = { 2, 2, 2, 2 };
        assertEquals(4, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case118() {
        int total = 5;
        int[] d = { 1, 1, 1, 1, 1 };
        assertEquals(5, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case119() {
        int total = 6;
        int[] d = { 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(6, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case120() {
        int total = 5;
        int[] d = { 2, 2, 2 };
        assertEquals(2, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case121() {
        int total = 5;
        int[] d = { 2, 2, 1 };
        assertEquals(3, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case122() {
        int total = 5;
        int[] d = { 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(5, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case123() {
        int total = 50;
        int[] d = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(50, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case124() {
        int total = 3;
        int[] d = { 3 };
        assertEquals(1, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case125() {
        int total = 10;
        int[] d = { 1 };
        assertEquals(1, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case126() {
        int total = 6;
        int[] d = { 1 };
        assertEquals(1, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case127() {
        int total = 2;
        int[] d = { 2 };
        assertEquals(1, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case128() {
        int total = 10;
        int[] d = { 1, 2, 3 };
        assertEquals(3, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case129() {
        int total = 10;
        int[] d = { 9, 1, 2, 3, 4 };
        assertEquals(4, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case130() {
        int total = 50;
        int[] d = { 1, 2 };
        assertEquals(2, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case131() {
        int total = 12;
        int[] d = { 5, 7, 3 };
        assertEquals(2, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case132() {
        int total = 50;
        int[] d = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(10, foxandvacation.maxCities(total, d));
    }

    @Test
    public void case133() {
        int total = 5;
        int[] d = { 2, 1 };
        assertEquals(2, foxandvacation.maxCities(total, d));
    }

}
