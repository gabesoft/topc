package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class LinearKingdomParkingLotTest {
    LinearKingdomParkingLot linearkingdomparkinglot = new LinearKingdomParkingLot();

    @Test
    public void case1() {
        int[] exitOrder = { 4, 1, 0, 2, 3 };
        assertEquals(1, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case2() {
        int[] exitOrder = { 0, 1 };
        assertEquals(0, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case3() {
        int[] exitOrder = { 1, 3, 5, 7, 0, 2, 4, 6 };
        assertEquals(4, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case4() {
        int[] exitOrder = { 1, 0 };
        assertEquals(0, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case5() {
        int[] exitOrder = { 0, 1 };
        assertEquals(0, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case6() {
        int[] exitOrder = { 2, 0, 3, 1 };
        assertEquals(0, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case7() {
        int[] exitOrder = { 4, 0, 3, 2, 1, 5 };
        assertEquals(1, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case8() {
        int[] exitOrder = { 1, 5, 3, 0, 6, 7, 2, 4 };
        assertEquals(3, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case9() {
        int[] exitOrder = { 7, 2, 8, 6, 5, 4, 1, 0, 3 };
        assertEquals(0, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case10() {
        int[] exitOrder = { 8, 2, 10, 9, 5, 0, 1, 3, 4, 6, 7 };
        assertEquals(4, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case11() {
        int[] exitOrder = { 0, 3, 9, 4, 10, 6, 5, 1, 7, 8, 2, 11 };
        assertEquals(7, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case12() {
        int[] exitOrder = { 12, 3, 6, 1, 7, 8, 4, 5, 2, 0, 9, 10, 13, 11 };
        assertEquals(7, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case13() {
        int[] exitOrder = { 13, 2, 11, 10, 1, 0, 9, 7, 14, 4, 8, 6, 5, 12, 3 };
        assertEquals(4, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case14() {
        int[] exitOrder = { 4, 11, 8, 1, 0, 5, 13, 7, 14, 2, 6, 3, 10, 9, 15, 12 };
        assertEquals(8, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case15() {
        int[] exitOrder = { 5, 9, 8, 15, 3, 10, 18, 7, 4, 0, 12, 13, 14, 11, 1, 6, 16, 2, 17 };
        assertEquals(11, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case16() {
        int[] exitOrder = { 18, 12, 4, 6, 7, 0, 20, 5, 14, 8, 13, 11, 1, 3, 19, 9, 10, 2, 21, 17, 15, 16 };
        assertEquals(12, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case17() {
        int[] exitOrder = { 20, 17, 18, 19, 16, 6, 10, 13, 5, 8, 22, 12, 2, 15, 11, 1, 23, 9, 14, 7, 4, 0, 3, 21 };
        assertEquals(8, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case18() {
        int[] exitOrder = { 2, 19, 1, 3, 21, 7, 9, 18, 8, 22, 26, 14, 13, 15, 17, 0, 25, 11, 5, 4, 12, 10, 20, 24, 23, 16, 6 };
        assertEquals(17, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case19() {
        int[] exitOrder = { 10, 16, 7, 6, 20, 26, 0, 3, 22, 12, 4, 5, 11, 27, 17, 18, 29, 19, 2, 21, 24, 14, 1, 8, 28, 13, 9, 15, 23, 25 };
        assertEquals(20, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case20() {
        int[] exitOrder = { 3, 31, 13, 17, 11, 2, 0, 23, 15, 4, 12, 20, 19, 7, 25, 28, 24, 22, 29, 26, 9, 10, 16, 27, 30, 1, 6, 21, 18, 14, 5, 8 };
        assertEquals(21, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case21() {
        int[] exitOrder = { 20, 13, 0, 10, 23, 25, 29, 8, 1, 22, 11, 14, 18, 15, 32, 33, 3, 17, 28, 5, 24, 9, 4, 26, 30, 6, 21, 16, 12, 7, 19, 2, 31, 27 };
        assertEquals(23, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case22() {
        int[] exitOrder = { 33, 15, 32, 19, 10, 30, 23, 34, 12, 35, 3, 28, 8, 36, 5, 9, 2, 25, 4, 0, 21, 6, 17, 13, 14, 22, 1, 27, 11, 24, 7, 31, 16, 18, 20, 29, 26 };
        assertEquals(22, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case23() {
        int[] exitOrder = { 30, 25, 0, 33, 14, 37, 17, 6, 22, 35, 5, 36, 21, 18, 24, 4, 29, 23, 19, 38, 1, 15, 16, 3, 32, 2, 28, 27, 8, 11, 34, 10, 13, 12, 9, 20, 31, 7, 26 };
        assertEquals(26, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case24() {
        int[] exitOrder = { 17, 12, 30, 25, 11, 27, 22, 23, 37, 31, 2, 14, 40, 24, 1, 35, 34, 26, 8, 4, 20, 16, 39, 6, 5, 3, 18, 28, 10, 29, 15, 13, 21, 32, 36, 33, 9, 19, 38, 7, 0 };
        assertEquals(25, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case25() {
        int[] exitOrder = { 18, 13, 8, 2, 22, 37, 20, 35, 5, 28, 15, 9, 16, 32, 41, 36, 33, 11, 21, 10, 17, 26, 0, 24, 31, 12, 3, 14, 19, 34, 39, 29, 40, 42, 38, 30, 1, 6, 7, 27, 4, 25, 23 };
        assertEquals(30, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case26() {
        int[] exitOrder = { 6, 34, 3, 17, 4, 12, 41, 25, 26, 33, 32, 7, 21, 24, 42, 40, 2, 16, 14, 38, 23, 29, 11, 1, 20, 43, 8, 39, 36, 5, 22, 27, 13, 9, 18, 15, 31, 10, 35, 0, 28, 37, 44, 19, 30 };
        assertEquals(31, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case27() {
        int[] exitOrder = { 22, 27, 36, 35, 45, 21, 32, 40, 18, 42, 7, 13, 31, 25, 20, 15, 17, 11, 5, 39, 2, 38, 4, 9, 19, 29, 33, 6, 16, 10, 43, 24, 44, 26, 3, 12, 14, 34, 23, 28, 0, 37, 1, 30, 8, 41 };
        assertEquals(27, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case28() {
        int[] exitOrder = { 42, 45, 26, 28, 23, 47, 25, 1, 7, 14, 24, 29, 33, 35, 9, 3, 17, 27, 6, 34, 4, 10, 8, 38, 41, 2, 21, 13, 37, 19, 12, 16, 32, 5, 44, 0, 18, 11, 36, 22, 15, 20, 30, 39, 31, 40, 46, 43 };
        assertEquals(35, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case29() {
        int[] exitOrder = { 43, 40, 9, 36, 3, 19, 37, 7, 23, 42, 31, 39, 27, 21, 34, 8, 15, 16, 49, 44, 1, 28, 33, 47, 10, 11, 38, 35, 45, 5, 24, 41, 17, 2, 25, 48, 4, 20, 22, 46, 12, 30, 26, 18, 6, 13, 32, 29, 14, 0 };
        assertEquals(36, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case30() {
        int[] exitOrder = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49 };
        assertEquals(48, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case31() {
        int[] exitOrder = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 39, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 17, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49 };
        assertEquals(46, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case32() {
        int[] exitOrder = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 39, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 44, 33, 34, 35, 36, 37, 38, 17, 40, 41, 42, 43, 32, 45, 46, 47, 48, 49 };
        assertEquals(46, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case33() {
        int[] exitOrder = { 0, 1, 2, 4, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 39, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 44, 33, 34, 35, 36, 37, 38, 17, 40, 41, 42, 43, 32, 45, 46, 47, 48, 49 };
        assertEquals(46, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case34() {
        int[] exitOrder = { 0, 1, 2, 28, 3, 5, 6, 7, 8, 9, 10, 11, 12, 43, 14, 15, 16, 39, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 4, 29, 30, 31, 44, 33, 34, 35, 36, 37, 38, 17, 40, 41, 42, 13, 32, 45, 46, 47, 48, 49 };
        assertEquals(44, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case35() {
        int[] exitOrder = { 0, 1, 2, 28, 3, 5, 6, 7, 8, 9, 10, 13, 12, 43, 14, 15, 16, 39, 35, 19, 20, 21, 22, 23, 24, 25, 26, 27, 4, 29, 30, 17, 44, 33, 34, 18, 36, 37, 38, 31, 40, 41, 42, 11, 32, 45, 46, 47, 48, 49 };
        assertEquals(43, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case36() {
        int[] exitOrder = { 0, 1, 27, 28, 46, 5, 6, 7, 8, 9, 10, 13, 12, 43, 14, 15, 16, 3, 2, 19, 20, 21, 22, 23, 24, 25, 26, 35, 4, 29, 30, 17, 34, 33, 44, 18, 36, 37, 38, 31, 40, 41, 42, 11, 32, 45, 39, 47, 48, 49 };
        assertEquals(42, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case37() {
        int[] exitOrder = { 0, 1, 27, 28, 46, 5, 19, 8, 7, 31, 10, 13, 12, 43, 14, 15, 16, 3, 2, 6, 20, 21, 22, 23, 24, 25, 48, 35, 4, 29, 30, 17, 38, 33, 44, 18, 11, 37, 34, 9, 40, 42, 41, 49, 32, 45, 39, 47, 26, 36 };
        assertEquals(42, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case38() {
        int[] exitOrder = { 0, 1, 27, 30, 41, 5, 19, 8, 7, 20, 10, 13, 38, 43, 14, 15, 16, 39, 46, 6, 31, 21, 22, 23, 24, 25, 48, 35, 29, 32, 28, 17, 12, 45, 44, 18, 34, 37, 11, 3, 40, 42, 9, 49, 33, 4, 2, 47, 26, 36 };
        assertEquals(38, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case39() {
        int[] exitOrder = { 0, 27, 29, 30, 6, 32, 1, 8, 7, 12, 10, 13, 38, 15, 14, 43, 16, 47, 21, 2, 40, 46, 24, 23, 22, 25, 48, 35, 19, 5, 18, 17, 3, 44, 36, 28, 34, 37, 42, 20, 41, 45, 9, 11, 33, 4, 49, 39, 26, 31 };
        assertEquals(39, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case40() {
        int[] exitOrder = { 0, 41, 34, 9, 39, 23, 1, 16, 30, 17, 42, 6, 2, 20, 37, 10, 8, 47, 33, 49, 40, 46, 26, 32, 38, 22, 28, 43, 19, 35, 24, 12, 3, 18, 36, 5, 25, 14, 13, 15, 27, 31, 29, 7, 21, 4, 44, 11, 48, 45 };
        assertEquals(37, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case41() {
        int[] exitOrder = { 0, 10, 29, 40, 15, 43, 20, 33, 46, 2, 22, 1, 9, 48, 42, 30, 38, 5, 13, 21, 34, 17, 32, 18, 25, 6, 28, 49, 39, 4, 16, 45, 3, 47, 19, 36, 37, 14, 12, 7, 27, 31, 44, 26, 24, 8, 41, 11, 35, 23 };
        assertEquals(39, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case42() {
        int[] exitOrder = { 14, 44, 41, 37, 36, 25, 21, 29, 19, 33, 23, 49, 28, 17, 6, 40, 7, 45, 42, 30, 18, 16, 2, 39, 8, 4, 35, 27, 1, 48, 24, 46, 3, 47, 26, 10, 0, 11, 22, 12, 32, 13, 43, 34, 15, 20, 9, 5, 38, 31 };
        assertEquals(33, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case43() {
        int[] exitOrder = { 7, 20, 49, 13, 42, 5, 34, 3, 6, 0, 31, 46, 14, 37, 2, 36, 16, 1, 23, 40, 8, 9, 44, 18, 39, 32, 28, 4, 30, 25, 38, 24, 35, 15, 43, 11, 48, 47, 27, 45, 10, 41, 12, 22, 29, 33, 19, 26, 21, 17 };
        assertEquals(35, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case44() {
        int[] exitOrder = { 9, 43, 21, 49, 16, 2, 42, 47, 40, 1, 24, 13, 36, 20, 38, 6, 39, 31, 3, 7, 22, 0, 8, 27, 19, 37, 28, 18, 23, 35, 14, 11, 46, 17, 34, 33, 26, 48, 45, 25, 15, 44, 5, 12, 41, 30, 4, 32, 29, 10 };
        assertEquals(33, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case45() {
        int[] exitOrder = { 25, 19, 40, 42, 49, 22, 32, 6, 39, 15, 13, 24, 46, 23, 34, 1, 36, 0, 45, 37, 3, 30, 17, 27, 9, 7, 26, 41, 10, 29, 18, 28, 43, 47, 31, 11, 48, 4, 14, 2, 8, 33, 21, 20, 38, 35, 5, 44, 12, 16 };
        assertEquals(34, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case46() {
        int[] exitOrder = { 30, 47, 25, 38, 7, 32, 35, 42, 48, 24, 13, 41, 10, 1, 39, 23, 8, 3, 43, 18, 21, 4, 34, 46, 9, 5, 22, 45, 26, 31, 12, 17, 33, 0, 40, 14, 11, 15, 27, 37, 28, 49, 19, 16, 29, 2, 20, 44, 6, 36 };
        assertEquals(35, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case47() {
        int[] exitOrder = { 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        assertEquals(0, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case48() {
        int[] exitOrder = { 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 14, 21, 20, 19, 18, 17, 16, 15, 22, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        assertEquals(1, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case49() {
        int[] exitOrder = { 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 20, 27, 26, 25, 24, 23, 14, 21, 28, 19, 18, 17, 16, 15, 22, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        assertEquals(2, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case50() {
        int[] exitOrder = { 49, 48, 47, 46, 45, 17, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 20, 27, 26, 25, 24, 23, 14, 21, 28, 19, 18, 44, 16, 15, 22, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        assertEquals(4, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case51() {
        int[] exitOrder = { 23, 48, 47, 46, 45, 17, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 20, 27, 26, 25, 24, 49, 14, 21, 28, 0, 18, 44, 16, 15, 22, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 19 };
        assertEquals(6, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case52() {
        int[] exitOrder = { 23, 32, 47, 46, 45, 17, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 48, 31, 30, 29, 20, 7, 26, 25, 24, 49, 14, 21, 28, 0, 18, 44, 16, 15, 22, 13, 9, 11, 10, 12, 8, 27, 6, 5, 4, 3, 2, 1, 19 };
        assertEquals(12, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case53() {
        int[] exitOrder = { 36, 32, 47, 46, 12, 17, 43, 42, 41, 31, 39, 38, 37, 23, 35, 34, 33, 48, 40, 30, 29, 20, 0, 26, 25, 24, 49, 14, 21, 28, 7, 18, 44, 16, 15, 22, 13, 9, 11, 10, 45, 27, 8, 6, 5, 4, 3, 2, 1, 19 };
        assertEquals(16, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case54() {
        int[] exitOrder = { 36, 32, 47, 46, 12, 17, 43, 1, 41, 31, 39, 38, 37, 24, 20, 25, 11, 14, 40, 30, 29, 35, 0, 26, 34, 44, 49, 48, 21, 28, 7, 18, 23, 16, 15, 22, 13, 9, 33, 10, 45, 27, 8, 6, 5, 4, 3, 19, 42, 2 };
        assertEquals(23, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case55() {
        int[] exitOrder = { 11, 4, 25, 23, 12, 10, 43, 31, 41, 1, 39, 38, 37, 24, 20, 42, 36, 14, 40, 30, 29, 35, 0, 26, 34, 3, 49, 48, 7, 28, 47, 18, 21, 16, 15, 22, 13, 9, 33, 17, 44, 27, 8, 6, 5, 32, 45, 46, 19, 2 };
        assertEquals(28, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case56() {
        int[] exitOrder = { 42, 4, 25, 33, 24, 10, 31, 43, 34, 5, 39, 38, 37, 7, 9, 11, 36, 14, 40, 30, 13, 21, 0, 23, 32, 3, 49, 48, 26, 28, 8, 47, 1, 16, 15, 22, 29, 45, 12, 20, 18, 27, 44, 6, 35, 41, 17, 46, 19, 2 };
        assertEquals(35, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case57() {
        int[] exitOrder = { 4, 1, 11, 39, 14, 28, 31, 43, 34, 15, 12, 33, 3, 42, 9, 38, 16, 10, 47, 36, 25, 32, 21, 23, 26, 37, 49, 17, 24, 22, 0, 40, 20, 46, 5, 7, 29, 8, 13, 45, 18, 27, 44, 6, 35, 41, 48, 30, 19, 2 };
        assertEquals(35, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case58() {
        int[] exitOrder = { 4, 20, 18, 40, 14, 3, 48, 8, 49, 34, 43, 45, 21, 9, 11, 29, 19, 37, 47, 31, 13, 44, 15, 2, 10, 1, 27, 28, 24, 22, 46, 16, 12, 0, 5, 7, 39, 32, 36, 33, 6, 38, 41, 30, 35, 42, 25, 17, 26, 23 };
        assertEquals(34, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case59() {
        int[] exitOrder = { 0, 20, 23, 4, 22, 15, 49, 7, 13, 48, 27, 29, 36, 6, 14, 10, 44, 37, 21, 1, 11, 42, 17, 39, 16, 12, 28, 34, 24, 26, 19, 3, 46, 18, 43, 45, 32, 47, 2, 35, 25, 40, 8, 33, 31, 38, 5, 9, 30, 41 };
        assertEquals(38, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case60() {
        int[] exitOrder = { 43, 40, 0, 17, 1, 6, 33, 20, 25, 13, 32, 49, 28, 47, 14, 27, 19, 35, 36, 26, 42, 15, 18, 46, 3, 39, 44, 34, 7, 37, 24, 29, 8, 23, 48, 21, 2, 22, 45, 41, 4, 10, 31, 30, 9, 38, 12, 16, 11, 5 };
        assertEquals(36, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case61() {
        int[] exitOrder = { 21, 25, 2, 8, 40, 24, 13, 38, 48, 41, 26, 18, 42, 39, 37, 49, 30, 43, 34, 46, 20, 28, 14, 19, 3, 22, 45, 17, 44, 15, 35, 27, 32, 23, 47, 4, 12, 9, 16, 7, 1, 10, 36, 0, 5, 33, 31, 29, 11, 6 };
        assertEquals(33, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case62() {
        int[] exitOrder = { 10, 26, 42, 32, 9, 23, 46, 49, 15, 25, 17, 44, 24, 4, 47, 1, 7, 22, 11, 43, 31, 39, 21, 14, 0, 41, 27, 16, 3, 35, 29, 18, 6, 38, 33, 36, 37, 13, 2, 12, 28, 40, 19, 34, 45, 20, 48, 8, 5, 30 };
        assertEquals(34, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case63() {
        int[] exitOrder = { 33, 26, 23, 41, 43, 20, 36, 3, 45, 44, 47, 35, 4, 2, 0, 29, 31, 24, 42, 27, 13, 30, 28, 48, 22, 17, 8, 15, 39, 5, 6, 16, 32, 1, 40, 49, 10, 7, 14, 18, 9, 34, 46, 21, 19, 25, 37, 12, 11, 38 };
        assertEquals(31, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case64() {
        int[] exitOrder = { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49 };
        assertEquals(47, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case65() {
        int[] exitOrder = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48 };
        assertEquals(46, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case66() {
        int[] exitOrder = { 0, 2, 30, 6, 8, 3, 12, 14, 16, 18, 20, 22, 24, 26, 28, 4, 32, 41, 36, 38, 40, 42, 44, 46, 48, 29, 10, 5, 7, 9, 49, 13, 15, 17, 19, 21, 23, 25, 27, 1, 31, 33, 35, 37, 39, 34, 43, 45, 47, 11 };
        assertEquals(43, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case67() {
        int[] exitOrder = { 1, 28, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 6, 29, 36, 46, 35, 37, 39, 41, 43, 45, 10, 49, 0, 2, 4, 27, 8, 47, 12, 14, 16, 18, 20, 22, 24, 26, 3, 30, 32, 34, 31, 38, 40, 42, 44, 33, 48 };
        assertEquals(43, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case68() {
        int[] exitOrder = { 48, 2, 8, 18, 5, 10, 12, 41, 30, 6, 20, 22, 24, 26, 40, 15, 17, 16, 36, 38, 28, 27, 44, 14, 43, 1, 3, 21, 29, 33, 19, 13, 34, 9, 11, 42, 35, 25, 4, 7, 31, 37, 23, 46, 39, 47, 0, 45, 32, 49 };
        assertEquals(36, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case69() {
        int[] exitOrder = { 16, 4, 26, 7, 9, 31, 14, 15, 17, 27, 42, 11, 25, 47, 29, 23, 33, 36, 40, 2, 41, 43, 45, 19, 34, 0, 13, 49, 6, 8, 10, 30, 3, 28, 35, 20, 5, 24, 12, 1, 22, 32, 39, 18, 38, 21, 44, 37, 46, 48 };
        assertEquals(37, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case70() {
        int[] exitOrder = { 46, 49, 42, 47, 24, 13, 45, 4, 8, 28, 3, 16, 5, 39, 22, 44, 25, 1, 43, 2, 38, 30, 15, 33, 11, 34, 0, 12, 37, 27, 29, 10, 20, 6, 48, 41, 31, 21, 18, 36, 9, 35, 40, 26, 19, 7, 32, 23, 17, 14 };
        assertEquals(29, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case71() {
        int[] exitOrder = { 43, 49, 4, 41, 11, 2, 24, 45, 32, 3, 47, 33, 14, 35, 37, 44, 39, 30, 26, 10, 29, 9, 7, 15, 0, 48, 40, 23, 8, 34, 25, 42, 31, 28, 46, 20, 6, 36, 21, 17, 38, 1, 27, 18, 22, 13, 12, 5, 19, 16 };
        assertEquals(34, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case72() {
        int[] exitOrder = { 21, 12, 26, 42, 14, 30, 25, 2, 47, 9, 35, 7, 19, 28, 18, 5, 38, 20, 31, 33, 6, 4, 0, 32, 49, 44, 3, 39, 41, 45, 46, 16, 36, 24, 17, 43, 40, 10, 48, 1, 22, 15, 34, 8, 11, 13, 23, 37, 27, 29 };
        assertEquals(37, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case73() {
        int[] exitOrder = { 17, 1, 25, 46, 6, 36, 19, 34, 39, 13, 11, 14, 2, 33, 26, 20, 45, 15, 18, 31, 29, 21, 41, 4, 7, 10, 5, 24, 35, 23, 30, 16, 28, 42, 32, 37, 8, 38, 49, 40, 44, 27, 47, 9, 12, 3, 43, 0, 22, 48 };
        assertEquals(36, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case74() {
        int[] exitOrder = { 49, 47, 45, 43, 41, 39, 37, 35, 33, 31, 29, 27, 25, 23, 21, 19, 17, 15, 13, 11, 9, 7, 5, 3, 1, 48, 46, 44, 42, 40, 38, 36, 34, 32, 30, 28, 26, 24, 22, 20, 18, 16, 14, 12, 10, 8, 6, 4, 2, 0 };
        assertEquals(0, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case75() {
        int[] exitOrder = { 48, 46, 44, 42, 40, 38, 36, 34, 32, 30, 28, 26, 24, 22, 20, 18, 16, 14, 12, 10, 8, 6, 4, 2, 0, 49, 47, 45, 43, 41, 39, 37, 35, 33, 31, 29, 27, 25, 23, 21, 19, 17, 15, 13, 11, 9, 7, 5, 3, 1 };
        assertEquals(0, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case76() {
        int[] exitOrder = { 21, 47, 45, 43, 41, 39, 37, 35, 33, 17, 13, 27, 25, 23, 49, 19, 31, 15, 44, 11, 9, 7, 5, 3, 1, 24, 46, 29, 42, 40, 38, 36, 34, 32, 30, 28, 26, 48, 22, 20, 18, 16, 14, 12, 10, 8, 6, 4, 2, 0 };
        assertEquals(17, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case77() {
        int[] exitOrder = { 48, 46, 44, 42, 40, 38, 36, 34, 32, 30, 28, 10, 24, 16, 20, 18, 37, 14, 12, 26, 8, 6, 39, 2, 0, 49, 47, 45, 17, 41, 4, 22, 35, 33, 31, 29, 27, 25, 23, 21, 19, 43, 15, 13, 11, 9, 7, 5, 3, 1 };
        assertEquals(13, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case78() {
        int[] exitOrder = { 33, 47, 45, 2, 41, 25, 4, 35, 30, 14, 29, 39, 46, 32, 21, 23, 17, 10, 27, 49, 9, 26, 37, 3, 22, 48, 11, 44, 42, 5, 40, 36, 34, 1, 24, 7, 15, 16, 31, 20, 18, 13, 19, 12, 28, 8, 6, 38, 43, 0 };
        assertEquals(31, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case79() {
        int[] exitOrder = { 47, 3, 49, 42, 40, 33, 2, 13, 32, 30, 17, 26, 24, 11, 34, 36, 16, 12, 14, 10, 8, 38, 4, 44, 0, 20, 19, 45, 43, 41, 39, 5, 35, 9, 18, 29, 27, 25, 46, 31, 48, 28, 23, 21, 22, 37, 7, 15, 6, 1 };
        assertEquals(31, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case80() {
        int[] exitOrder = { 28, 27, 39, 32, 26, 46, 31, 37, 0, 30, 12, 15, 49, 22, 33, 34, 3, 36, 13, 35, 2, 6, 20, 41, 47, 43, 11, 29, 4, 17, 40, 7, 10, 5, 48, 38, 45, 24, 1, 21, 44, 19, 8, 18, 16, 9, 25, 42, 23, 14 };
        assertEquals(35, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case81() {
        int[] exitOrder = { 11, 33, 22, 6, 5, 38, 46, 32, 36, 29, 30, 47, 7, 42, 40, 20, 2, 21, 16, 27, 12, 35, 45, 13, 44, 48, 39, 34, 25, 28, 8, 37, 1, 3, 26, 31, 49, 10, 9, 23, 19, 41, 15, 14, 43, 0, 18, 17, 24, 4 };
        assertEquals(32, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case82() {
        int[] exitOrder = { 35, 46, 38, 41, 25, 15, 11, 10, 24, 39, 49, 0, 33, 5, 27, 42, 7, 4, 3, 18, 34, 30, 43, 9, 48, 1, 22, 13, 36, 12, 14, 26, 21, 32, 47, 17, 20, 28, 8, 23, 2, 44, 45, 40, 6, 19, 29, 37, 31, 16 };
        assertEquals(34, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case83() {
        int[] exitOrder = { 0, 35, 41, 12, 47, 39, 32, 15, 45, 1, 22, 25, 21, 10, 38, 6, 7, 31, 20, 33, 36, 30, 11, 43, 4, 2, 5, 14, 29, 34, 46, 26, 48, 44, 18, 9, 3, 40, 23, 13, 37, 19, 42, 16, 27, 24, 28, 17, 49, 8 };
        assertEquals(38, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case84() {
        int[] exitOrder = { 0, 25, 1, 26, 2, 27, 3, 28, 4, 29, 5, 30, 6, 31, 7, 32, 8, 33, 9, 34, 10, 35, 11, 36, 12, 37, 13, 38, 14, 39, 15, 40, 16, 41, 17, 42, 18, 43, 19, 44, 20, 45, 21, 46, 22, 47, 23, 48, 24, 49 };
        assertEquals(47, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case85() {
        int[] exitOrder = { 0, 11, 1, 26, 2, 27, 3, 28, 49, 19, 29, 30, 45, 31, 40, 32, 4, 44, 9, 34, 10, 35, 25, 36, 12, 41, 13, 38, 14, 39, 15, 7, 16, 37, 17, 42, 18, 43, 5, 33, 20, 6, 21, 46, 22, 47, 23, 48, 8, 24 };
        assertEquals(40, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case86() {
        int[] exitOrder = { 49, 24, 48, 23, 47, 22, 46, 21, 45, 20, 44, 19, 43, 18, 42, 17, 41, 16, 40, 15, 39, 14, 38, 13, 37, 12, 36, 11, 35, 10, 34, 9, 33, 8, 32, 7, 31, 6, 30, 5, 29, 4, 28, 3, 27, 2, 26, 1, 25, 0 };
        assertEquals(0, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case87() {
        int[] exitOrder = { 48, 24, 14, 23, 40, 4, 18, 21, 38, 35, 44, 12, 25, 39, 42, 17, 41, 34, 47, 15, 46, 49, 45, 13, 37, 8, 36, 11, 20, 3, 26, 9, 33, 32, 19, 7, 31, 6, 30, 5, 29, 22, 28, 10, 27, 2, 16, 1, 43, 0 };
        assertEquals(29, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case88() {
        int[] exitOrder = { 0, 49, 1, 48, 2, 47, 3, 46, 4, 45, 5, 44, 6, 43, 7, 42, 8, 41, 9, 40, 10, 39, 11, 38, 12, 37, 13, 36, 14, 35, 15, 34, 16, 33, 17, 32, 18, 31, 19, 30, 20, 29, 21, 28, 22, 27, 23, 26, 24, 25 };
        assertEquals(24, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case89() {
        int[] exitOrder = { 33, 30, 1, 48, 2, 47, 5, 46, 4, 6, 3, 0, 45, 43, 7, 42, 8, 41, 9, 40, 10, 44, 11, 38, 12, 37, 13, 36, 14, 35, 15, 34, 16, 31, 17, 32, 18, 39, 19, 49, 20, 29, 21, 28, 22, 27, 23, 26, 24, 25 };
        assertEquals(27, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case90() {
        int[] exitOrder = { 48, 0, 47, 1, 46, 2, 45, 3, 44, 4, 43, 5, 42, 6, 41, 7, 40, 8, 39, 9, 38, 10, 37, 11, 36, 12, 35, 13, 34, 14, 33, 15, 32, 16, 31, 17, 30, 18, 29, 19, 28, 20, 27, 21, 26, 22, 25, 23, 24 };
        assertEquals(23, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case91() {
        int[] exitOrder = { 48, 0, 47, 1, 46, 2, 9, 3, 44, 4, 11, 5, 42, 6, 41, 7, 40, 8, 39, 27, 38, 10, 37, 43, 36, 12, 35, 13, 34, 14, 33, 15, 32, 16, 31, 17, 30, 18, 29, 19, 28, 20, 45, 21, 26, 22, 25, 23, 24 };
        assertEquals(26, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case92() {
        int[] exitOrder = { 25, 24, 26, 23, 27, 22, 28, 21, 29, 20, 30, 19, 31, 18, 32, 17, 33, 16, 34, 15, 35, 14, 36, 13, 37, 12, 38, 11, 39, 10, 40, 9, 41, 8, 42, 7, 43, 6, 44, 5, 45, 4, 46, 3, 47, 2, 48, 1, 49, 0 };
        assertEquals(23, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case93() {
        int[] exitOrder = { 25, 2, 22, 23, 1, 7, 21, 37, 6, 29, 17, 9, 28, 18, 32, 0, 16, 33, 34, 15, 35, 14, 30, 13, 8, 38, 12, 11, 3, 36, 19, 20, 41, 31, 42, 26, 10, 43, 44, 48, 27, 5, 46, 39, 40, 47, 49, 45, 24, 4 };
        assertEquals(33, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case94() {
        int[] exitOrder = { 24, 23, 25, 22, 26, 21, 27, 20, 28, 19, 29, 18, 30, 17, 31, 16, 32, 15, 33, 14, 34, 13, 35, 12, 36, 11, 37, 10, 38, 9, 39, 8, 40, 7, 41, 6, 42, 5, 43, 4, 44, 3, 45, 2, 46, 1, 47, 0, 48 };
        assertEquals(23, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case95() {
        int[] exitOrder = { 24, 14, 4, 48, 16, 20, 18, 1, 28, 19, 21, 31, 32, 7, 45, 2, 27, 12, 39, 47, 40, 29, 15, 34, 42, 37, 10, 5, 38, 8, 13, 22, 44, 30, 41, 9, 36, 6, 35, 3, 11, 26, 33, 17, 43, 25, 46, 0, 23 };
        assertEquals(35, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case96() {
        int[] exitOrder = { 0, 7, 14, 21, 28, 35, 42, 49, 6, 13, 20, 27, 34, 41, 48, 5, 12, 19, 26, 33, 40, 47, 4, 11, 18, 25, 32, 39, 46, 3, 10, 17, 24, 31, 38, 45, 2, 9, 16, 23, 30, 37, 44, 1, 8, 15, 22, 29, 36, 43 };
        assertEquals(42, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case97() {
        int[] exitOrder = { 14, 15, 36, 45, 24, 47, 9, 8, 5, 21, 16, 22, 1, 26, 11, 35, 29, 43, 49, 48, 17, 6, 12, 32, 40, 19, 46, 27, 7, 18, 42, 20, 41, 3, 39, 33, 2, 28, 34, 10, 37, 13, 0, 38, 23, 25, 4, 31, 44, 30 };
        assertEquals(34, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case98() {
        int[] exitOrder = { 43, 36, 29, 22, 15, 8, 1, 44, 37, 30, 23, 16, 9, 2, 45, 38, 31, 24, 17, 10, 3, 46, 39, 32, 25, 18, 11, 4, 47, 40, 33, 26, 19, 12, 5, 48, 41, 34, 27, 20, 13, 6, 49, 42, 35, 28, 21, 14, 7, 0 };
        assertEquals(35, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case99() {
        int[] exitOrder = { 43, 10, 29, 22, 39, 8, 1, 25, 40, 35, 23, 16, 17, 2, 45, 38, 11, 24, 9, 36, 3, 37, 15, 32, 44, 18, 31, 4, 47, 27, 33, 26, 19, 12, 5, 6, 41, 34, 46, 20, 13, 48, 49, 42, 30, 28, 7, 14, 21, 0 };
        assertEquals(35, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case100() {
        int[] exitOrder = { 25, 18, 11, 4, 47, 40, 33, 26, 19, 12, 5, 48, 41, 34, 27, 20, 13, 6, 49, 42, 35, 28, 21, 14, 7, 0, 43, 36, 29, 22, 15, 8, 1, 44, 37, 30, 23, 16, 9, 2, 45, 38, 31, 24, 17, 10, 3, 46, 39, 32 };
        assertEquals(37, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case101() {
        int[] exitOrder = { 25, 18, 11, 4, 47, 40, 33, 44, 19, 12, 5, 48, 41, 34, 27, 20, 13, 6, 49, 42, 35, 28, 21, 14, 7, 0, 43, 36, 29, 46, 15, 8, 1, 26, 37, 30, 23, 16, 9, 2, 45, 38, 31, 24, 17, 10, 3, 22, 39, 32 };
        assertEquals(35, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case102() {
        int[] exitOrder = { 28, 21, 14, 7, 0, 43, 36, 29, 22, 15, 8, 1, 44, 37, 30, 23, 16, 9, 2, 45, 38, 31, 24, 17, 10, 3, 46, 39, 32, 25, 18, 11, 4, 47, 40, 33, 26, 19, 12, 5, 48, 41, 34, 27, 20, 13, 6, 49, 42, 35 };
        assertEquals(38, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case103() {
        int[] exitOrder = { 28, 21, 14, 7, 0, 43, 36, 29, 1, 15, 8, 37, 44, 22, 30, 23, 24, 9, 2, 45, 38, 31, 16, 17, 10, 3, 46, 39, 32, 25, 18, 11, 4, 47, 40, 33, 26, 19, 12, 5, 13, 41, 34, 27, 20, 48, 6, 49, 42, 35 };
        assertEquals(38, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case104() {
        int[] exitOrder = { 1, 0, 3, 2, 4 };
        assertEquals(1, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case105() {
        int[] exitOrder = { 1, 0, 3, 2, 5, 4, 7, 6, 9, 8, 11, 10, 13, 12, 15, 14, 17, 16, 19, 18, 21, 20, 23, 22, 25, 24, 27, 26, 29, 28, 31, 30, 33, 32, 35, 34, 37, 36, 39, 38, 41, 40, 43, 42, 45, 44, 47, 46, 49, 48 };
        assertEquals(46, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case106() {
        int[] exitOrder = { 1, 0, 37, 2, 5, 20, 7, 6, 9, 8, 11, 10, 13, 12, 15, 48, 36, 16, 19, 18, 21, 4, 23, 22, 25, 24, 27, 26, 29, 28, 31, 30, 33, 32, 35, 34, 3, 17, 44, 38, 41, 40, 43, 42, 45, 39, 47, 46, 49, 14 };
        assertEquals(42, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case107() {
        int[] exitOrder = { 48, 49, 46, 47, 44, 45, 42, 43, 40, 41, 38, 39, 36, 37, 34, 35, 32, 33, 30, 31, 28, 29, 26, 27, 24, 25, 22, 23, 20, 21, 18, 19, 16, 17, 14, 15, 12, 13, 10, 11, 8, 9, 6, 7, 4, 5, 2, 3, 0, 1 };
        assertEquals(0, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case108() {
        int[] exitOrder = { 48, 41, 46, 47, 44, 1, 18, 43, 40, 42, 22, 39, 36, 37, 34, 35, 20, 16, 30, 14, 28, 29, 26, 27, 24, 25, 6, 4, 32, 0, 49, 19, 33, 17, 31, 13, 3, 23, 10, 21, 8, 9, 38, 7, 15, 5, 2, 12, 11, 45 };
        assertEquals(27, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case109() {
        int[] exitOrder = { 13, 15, 16, 5, 23, 40, 8, 3, 38, 41, 45, 10, 36, 37, 34, 33, 0, 11, 30, 28, 9, 29, 19, 42, 12, 25, 22, 48, 27, 21, 17, 46, 26, 47, 24, 49, 43, 6, 39, 2, 44, 31, 7, 14, 4, 18, 35, 20, 32, 1 };
        assertEquals(32, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case110() {
        int[] exitOrder = { 2, 1, 0, 5, 4, 3, 8, 7, 6, 11, 10, 9, 14, 13, 12, 17, 16, 15, 20, 19, 18, 23, 22, 21, 26, 25, 24, 29, 28, 27, 32, 31, 30, 35, 34, 33, 38, 37, 36, 41, 40, 39, 44, 43, 42, 47, 46, 45, 49, 48 };
        assertEquals(44, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case111() {
        int[] exitOrder = { 2, 1, 37, 5, 4, 42, 11, 7, 6, 24, 15, 9, 14, 13, 12, 16, 17, 10, 20, 47, 18, 23, 22, 21, 26, 25, 8, 29, 28, 27, 38, 31, 34, 35, 30, 33, 3, 0, 48, 41, 40, 39, 44, 43, 36, 19, 46, 45, 49, 32 };
        assertEquals(38, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case112() {
        int[] exitOrder = { 48, 49, 45, 46, 47, 42, 43, 44, 39, 40, 41, 36, 37, 38, 33, 34, 35, 30, 31, 32, 27, 28, 29, 24, 25, 26, 21, 22, 23, 18, 19, 20, 15, 16, 17, 12, 13, 14, 9, 10, 11, 6, 7, 8, 3, 4, 5, 0, 1, 2 };
        assertEquals(16, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case113() {
        int[] exitOrder = { 48, 49, 45, 46, 47, 42, 43, 44, 39, 40, 41, 36, 37, 38, 33, 34, 35, 30, 31, 32, 27, 28, 29, 24, 25, 26, 7, 3, 23, 1, 19, 20, 15, 16, 17, 14, 0, 22, 9, 18, 11, 6, 21, 8, 12, 4, 5, 13, 10, 2 };
        assertEquals(20, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case114() {
        int[] exitOrder = { 3, 2, 1, 0, 7, 6, 5, 4, 11, 10, 9, 8, 15, 14, 13, 12, 19, 18, 17, 16, 23, 22, 21, 20, 27, 26, 25, 24, 31, 30, 29, 28, 35, 34, 33, 32, 39, 38, 37, 36, 43, 42, 41, 40, 47, 46, 45, 44, 49, 48 };
        assertEquals(42, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case115() {
        int[] exitOrder = { 23, 2, 1, 0, 3, 6, 5, 4, 11, 10, 9, 8, 15, 14, 13, 44, 19, 20, 17, 21, 31, 22, 27, 18, 16, 26, 25, 24, 38, 30, 29, 40, 35, 34, 33, 32, 45, 7, 37, 43, 36, 28, 41, 42, 47, 46, 39, 12, 49, 48 };
        assertEquals(38, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case116() {
        int[] exitOrder = { 48, 49, 44, 45, 46, 47, 40, 41, 42, 43, 36, 37, 38, 39, 32, 33, 34, 35, 28, 29, 30, 31, 24, 25, 26, 27, 20, 21, 22, 23, 16, 17, 18, 19, 12, 13, 14, 15, 8, 9, 10, 11, 4, 5, 6, 7, 0, 1, 2, 3 };
        assertEquals(24, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case117() {
        int[] exitOrder = { 48, 49, 18, 45, 21, 47, 25, 41, 36, 43, 42, 8, 38, 39, 32, 33, 34, 35, 28, 29, 30, 31, 24, 40, 26, 27, 20, 46, 22, 23, 16, 44, 17, 19, 12, 13, 14, 15, 37, 9, 10, 11, 4, 5, 6, 7, 0, 1, 2, 3 };
        assertEquals(31, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case118() {
        int[] exitOrder = { 5, 4, 3, 2, 1, 0, 11, 10, 9, 8, 7, 6, 17, 16, 15, 14, 13, 12, 23, 22, 21, 20, 19, 18, 29, 28, 27, 26, 25, 24, 35, 34, 33, 32, 31, 30, 41, 40, 39, 38, 37, 36, 47, 46, 45, 44, 43, 42, 49, 48 };
        assertEquals(38, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case119() {
        int[] exitOrder = { 5, 10, 3, 44, 1, 0, 11, 4, 9, 8, 7, 6, 17, 16, 15, 25, 13, 12, 23, 22, 21, 20, 19, 18, 29, 28, 27, 26, 35, 24, 14, 34, 33, 46, 30, 31, 41, 40, 39, 38, 37, 36, 47, 32, 45, 2, 43, 42, 49, 48 };
        assertEquals(36, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case120() {
        int[] exitOrder = { 48, 49, 42, 43, 44, 45, 46, 47, 36, 37, 38, 39, 40, 41, 30, 31, 32, 33, 34, 35, 24, 25, 26, 27, 28, 29, 18, 19, 20, 21, 22, 23, 12, 13, 14, 15, 16, 17, 6, 7, 8, 9, 10, 11, 0, 1, 2, 3, 4, 5 };
        assertEquals(32, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case121() {
        int[] exitOrder = { 19, 49, 42, 43, 41, 38, 31, 47, 36, 37, 45, 40, 39, 44, 30, 46, 4, 33, 34, 35, 24, 25, 26, 32, 28, 29, 18, 48, 17, 21, 22, 23, 12, 13, 14, 15, 20, 10, 6, 7, 8, 9, 16, 11, 0, 1, 2, 3, 27, 5 };
        assertEquals(33, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case122() {
        int[] exitOrder = { 8, 7, 6, 5, 4, 3, 2, 1, 0, 17, 16, 15, 14, 13, 12, 11, 10, 9, 26, 25, 24, 23, 22, 21, 20, 19, 18, 35, 34, 33, 32, 31, 30, 29, 28, 27, 44, 43, 42, 41, 40, 39, 38, 37, 36, 49, 48, 47, 46, 45 };
        assertEquals(32, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case123() {
        int[] exitOrder = { 8, 7, 46, 5, 4, 3, 28, 1, 0, 17, 16, 15, 14, 13, 12, 11, 10, 44, 31, 25, 24, 23, 22, 21, 20, 19, 18, 35, 26, 33, 32, 34, 30, 29, 2, 27, 9, 43, 42, 41, 40, 39, 38, 37, 36, 49, 48, 47, 6, 45 };
        assertEquals(30, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case124() {
        int[] exitOrder = { 45, 46, 47, 48, 49, 36, 37, 38, 39, 40, 41, 42, 43, 44, 27, 28, 29, 30, 31, 32, 33, 34, 35, 18, 19, 20, 21, 22, 23, 24, 25, 26, 9, 10, 11, 12, 13, 14, 15, 16, 17, 0, 1, 2, 3, 4, 5, 6, 7, 8 };
        assertEquals(38, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case125() {
        int[] exitOrder = { 45, 46, 47, 48, 17, 24, 37, 38, 39, 6, 41, 42, 43, 44, 27, 28, 29, 30, 31, 32, 33, 34, 35, 18, 19, 20, 21, 22, 23, 36, 25, 26, 2, 10, 11, 12, 13, 14, 15, 4, 49, 0, 1, 9, 3, 16, 5, 40, 7, 8 };
        assertEquals(38, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case126() {
        int[] exitOrder = { 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 49, 48, 47, 46, 45, 44, 43, 42 };
        assertEquals(22, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case127() {
        int[] exitOrder = { 13, 12, 11, 10, 9, 8, 7, 6, 5, 0, 3, 2, 1, 4, 27, 26, 20, 24, 23, 22, 33, 25, 19, 18, 17, 28, 15, 14, 41, 40, 39, 38, 37, 36, 35, 34, 21, 32, 31, 30, 29, 16, 49, 48, 47, 46, 45, 44, 43, 42 };
        assertEquals(27, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case128() {
        int[] exitOrder = { 42, 43, 44, 45, 46, 47, 48, 49, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
        assertEquals(42, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case129() {
        int[] exitOrder = { 42, 43, 44, 30, 8, 47, 27, 49, 28, 29, 45, 6, 32, 18, 31, 35, 36, 37, 38, 39, 40, 41, 16, 46, 23, 17, 33, 19, 20, 21, 22, 14, 24, 25, 26, 0, 48, 1, 15, 3, 4, 5, 34, 7, 2, 9, 10, 11, 12, 13 };
        assertEquals(36, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case130() {
        int[] exitOrder = { 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 49, 48, 47, 46, 45, 44 };
        assertEquals(6, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case131() {
        int[] exitOrder = { 21, 31, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 20, 30, 29, 28, 27, 26, 25, 24, 23, 22, 49, 48, 47, 46, 45, 0 };
        assertEquals(7, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case132() {
        int[] exitOrder = { 44, 45, 46, 47, 48, 49, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21 };
        assertEquals(44, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case133() {
        int[] exitOrder = { 44, 45, 46, 18, 48, 49, 22, 23, 24, 6, 26, 27, 28, 16, 30, 31, 32, 33, 9, 35, 36, 37, 38, 15, 40, 41, 42, 43, 7, 1, 2, 29, 4, 5, 25, 0, 8, 34, 10, 11, 12, 13, 14, 39, 3, 17, 47, 19, 20, 21 };
        assertEquals(38, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case134() {
        int[] exitOrder = { 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35 };
        assertEquals(0, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case135() {
        int[] exitOrder = { 34, 33, 32, 48, 30, 29, 28, 27, 26, 25, 10, 23, 44, 21, 20, 19, 5, 17, 16, 15, 14, 13, 12, 11, 24, 9, 8, 7, 6, 18, 4, 3, 2, 1, 0, 49, 31, 47, 46, 45, 22, 43, 42, 41, 40, 39, 38, 37, 36, 35 };
        assertEquals(18, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case136() {
        int[] exitOrder = { 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34 };
        assertEquals(46, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case137() {
        int[] exitOrder = { 33, 18, 25, 38, 19, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 0, 1, 2, 17, 4, 5, 6, 7, 8, 9, 10, 11, 12, 34, 14, 15, 28, 3, 36, 35, 20, 16, 21, 23, 24, 37, 26, 27, 22, 29, 30, 31, 32, 39, 13 };
        assertEquals(41, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case138() {
        int[] exitOrder = { 4, 0, 2, 1, 5, 3 };
        assertEquals(2, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case139() {
        int[] exitOrder = { 3, 0, 2, 1 };
        assertEquals(0, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case140() {
        int[] exitOrder = { 1, 3, 0, 2 };
        assertEquals(0, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case141() {
        int[] exitOrder = { 0, 2, 4, 1, 3, 5 };
        assertEquals(3, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case142() {
        int[] exitOrder = { 0, 2, 4, 1, 3 };
        assertEquals(2, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case143() {
        int[] exitOrder = { 12, 1, 9, 49, 0, 27, 36, 31, 29, 45, 18, 46, 32, 40, 23, 33, 26, 41, 48, 17, 8, 47, 22, 34, 30, 7, 6, 11, 5, 4, 2, 21, 42, 35, 10, 39, 25, 3, 43, 16, 38, 37, 14, 13, 24, 15, 28, 19, 20, 44 };
        assertEquals(35, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case144() {
        int[] exitOrder = { 7, 8, 0, 6, 3, 4, 5, 1, 2, 9 };
        assertEquals(4, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case145() {
        int[] exitOrder = { 4, 17, 16, 43, 12, 28, 7, 33, 29, 36, 31, 37, 27, 39, 14, 42, 21, 0, 48, 44, 38, 23, 22, 40, 10, 8, 19, 3, 13, 30, 5, 35, 24, 26, 34, 41, 49, 1, 46, 18, 15, 47, 32, 6, 2, 45, 25, 20, 9, 11 };
        assertEquals(37, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case146() {
        int[] exitOrder = { 0, 34, 10, 35, 36, 11, 29, 22, 39, 2, 6, 1, 19, 45, 21, 25, 26, 16, 43, 49, 48, 28, 47, 46, 24, 23, 3, 31, 38, 20, 8, 12, 33, 5, 18, 9, 17, 4, 13, 14, 37, 40, 15, 32, 41, 42, 44, 7, 27, 30 };
        assertEquals(38, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case147() {
        int[] exitOrder = { 4, 0, 2, 1, 5, 3, 9, 7, 6, 8 };
        assertEquals(5, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case148() {
        int[] exitOrder = { 2, 4, 5, 0, 1, 3 };
        assertEquals(2, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case149() {
        int[] exitOrder = { 41, 44, 48, 42, 37, 24, 1, 39, 2, 4, 35, 9, 11, 3, 7, 16, 19, 46, 45, 30, 0, 38, 32, 20, 15, 22, 47, 6, 34, 12, 29, 40, 43, 18, 26, 13, 23, 5, 33, 27, 25, 28, 14, 21, 36, 49, 10, 8, 31, 17 };
        assertEquals(34, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

    @Test
    public void case150() {
        int[] exitOrder = { 0, 1, 9, 8, 7, 6, 5, 4, 3, 2 };
        assertEquals(1, linearkingdomparkinglot.borrowKeys(exitOrder));
    }

}
