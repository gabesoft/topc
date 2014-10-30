package topc.test.simulation;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.simulation.*;

public class ShoppingSurveyDiv2Test {
    ShoppingSurveyDiv2 shoppingsurveydiv2 = new ShoppingSurveyDiv2();

    @Test
    public void case1() {
        int N = 5;
        int[] s = { 3, 3 };
        assertEquals(1, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case2() {
        int N = 100;
        int[] s = { 97 };
        assertEquals(97, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case3() {
        int N = 10;
        int[] s = { 9, 9, 9, 9, 9 };
        assertEquals(5, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case4() {
        int N = 7;
        int[] s = { 1, 2, 3 };
        assertEquals(0, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case5() {
        int N = 5;
        int[] s = { 3, 3, 3 };
        assertEquals(0, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case6() {
        int N = 100;
        int[] s = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
        assertEquals(100, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case7() {
        int N = 92;
        int[] s = { 92, 90, 92, 92, 92, 89, 92, 91, 92, 89, 92 };
        assertEquals(83, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case8() {
        int N = 99;
        int[] s = { 99, 99, 99, 99, 99, 96, 99, 99, 99, 99, 98, 99, 99 };
        assertEquals(95, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case9() {
        int N = 64;
        int[] s = { 64, 61, 64, 61, 64, 64, 64, 64, 61, 64, 63, 64, 64, 61 };
        assertEquals(51, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case10() {
        int N = 50;
        int[] s = { 50, 50, 50, 49, 50, 50, 50, 47, 50, 50, 50 };
        assertEquals(46, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case11() {
        int N = 64;
        int[] s = { 62, 64, 64, 61, 64, 64, 62, 64, 64, 64, 63, 64 };
        assertEquals(56, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case12() {
        int N = 100;
        int[] s = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 0, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
        assertEquals(0, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case13() {
        int N = 58;
        int[] s = { 58, 58, 58, 56, 58, 58, 58, 58, 58, 58, 50, 58, 58, 58, 58, 58, 58, 58, 58, 58, 51, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 56, 58, 58, 58, 58, 58, 56, 58, 58, 58, 57, 58, 58, 58, 58, 58, 51, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58 };
        assertEquals(29, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case14() {
        int N = 55;
        int[] s = { 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 50, 55, 55, 55, 55, 55, 55, 55, 55, 55, 50, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 54, 46, 55, 55, 47, 55, 55, 55, 50, 55, 55, 55, 49, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55 };
        assertEquals(16, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case15() {
        int N = 83;
        int[] s = { 82, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 76, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 74, 83, 75, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 78, 83, 83, 83, 83, 83, 74, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 78, 83, 83, 78, 83, 83, 74, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83 };
        assertEquals(25, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case16() {
        int N = 55;
        int[] s = { 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 53, 55, 55, 55, 55, 50, 55, 55, 55, 55, 55, 48, 54, 55, 55, 55, 55, 55, 47, 55, 48, 55, 55, 50, 55, 50, 55, 55, 55, 55, 55, 55, 55, 55, 48, 55, 55, 55, 55 };
        assertEquals(8, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case17() {
        int N = 52;
        int[] s = { 46, 52, 52, 48, 52, 52, 52, 52, 52, 47, 52, 48, 52, 52, 52, 52, 52, 52, 52, 52, 52, 47, 52, 52, 52, 44, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 44, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 48, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 45, 52, 52, 45, 52, 52, 52, 52, 50, 52, 52, 52, 52, 52, 47, 52, 52, 52 };
        assertEquals(0, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case18() {
        int N = 89;
        int[] s = { 89, 86, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 71, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 71, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 84 };
        assertEquals(45, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case19() {
        int N = 86;
        int[] s = { 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 75, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 78, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86 };
        assertEquals(67, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case20() {
        int N = 92;
        int[] s = { 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 77, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 91, 92, 92, 92 };
        assertEquals(76, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case21() {
        int N = 93;
        int[] s = { 83, 81, 93, 81, 80, 88, 84, 92, 81 };
        assertEquals(19, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case22() {
        int N = 92;
        int[] s = { 89, 84, 83, 90, 81, 82, 91, 91 };
        assertEquals(47, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case23() {
        int N = 75;
        int[] s = { 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75 };
        assertEquals(75, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case24() {
        int N = 40;
        int[] s = { 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40 };
        assertEquals(40, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case25() {
        int N = 11;
        int[] s = { 7, 1, 11, 4, 5, 9, 11, 6, 3, 2, 8, 2, 6, 8, 7, 0, 6, 5, 3, 9, 3, 7, 2, 11, 10, 1, 4, 11, 11, 2, 3 };
        assertEquals(0, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case26() {
        int N = 46;
        int[] s = { 40, 46, 43, 19, 40, 21, 9, 30, 18, 16, 21, 28, 44, 23, 23, 2, 19, 34, 17, 14, 8, 18, 13, 31, 14, 42, 27, 8, 32, 16, 22, 42, 0, 16, 6, 39, 25, 37, 36, 39, 15, 20, 42, 28, 46, 25, 37, 33, 9, 14 };
        assertEquals(0, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case27() {
        int N = 11;
        int[] s = { 3, 11, 0, 6, 7, 7, 7, 9, 3, 6, 4, 1, 0, 4, 11, 10, 6, 10, 7, 10, 2, 8, 1, 7, 10, 7, 7, 10, 8, 3, 3, 11, 10, 9, 2, 2, 8, 7, 5, 1, 0, 7, 2, 3, 7, 6, 1, 3, 7, 1, 1, 6, 0, 5, 5, 4, 6, 1, 5, 10, 2, 1, 11, 2, 1, 11, 0, 8, 2, 10, 9, 3, 7, 9, 9, 4, 7, 4, 6, 10, 6, 4, 7, 8, 9, 2, 3, 4, 3, 6 };
        assertEquals(0, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case28() {
        int N = 25;
        int[] s = { 24, 24, 25, 24, 25, 24, 24, 25, 24, 24, 24, 24, 25, 25, 24, 25, 24, 25, 24, 24, 24, 25, 25, 24, 25, 24, 25, 25, 25, 24, 25, 25, 25, 24, 25 };
        assertEquals(7, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case29() {
        int N = 25;
        int[] s = { 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        assertEquals(0, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case30() {
        int N = 49;
        int[] s = { 31, 33, 41, 45, 42, 0, 49, 29, 42, 48, 25, 36, 44, 41, 36, 30, 33, 35, 49, 34, 36, 49, 38, 44, 37, 37, 31, 41, 49, 38, 45, 42, 29, 29, 41, 40, 36, 42, 29, 44, 29, 32, 29, 25, 28, 24, 27, 26, 47, 48, 27, 47, 29, 33, 42, 44, 31, 40, 35, 40, 30, 43, 46, 45, 44, 30, 39, 45, 41, 29, 34, 40, 49, 34, 44, 33, 38, 30, 43, 25, 26, 39, 27 };
        assertEquals(0, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case31() {
        int N = 45;
        int[] s = { 26, 23, 34, 34, 42, 37, 34, 31, 45, 23, 42, 41, 33, 45, 45, 37, 37, 38, 43, 32, 31, 43, 41, 22, 39, 33, 25, 30, 35, 31, 36, 22, 39, 22, 36, 34, 44, 38, 34, 22, 36, 44, 42, 0, 43, 29, 25 };
        assertEquals(0, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case32() {
        int N = 100;
        int[] s = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(0, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case33() {
        int N = 3;
        int[] s = { 3, 3, 3, 3 };
        assertEquals(3, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case34() {
        int N = 100;
        int[] s = { 70, 75, 80, 85 };
        assertEquals(10, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case35() {
        int N = 3;
        int[] s = { 1, 1, 1 };
        assertEquals(0, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case36() {
        int N = 2;
        int[] s = { 2, 2 };
        assertEquals(2, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case37() {
        int N = 3;
        int[] s = { 3, 3 };
        assertEquals(3, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case38() {
        int N = 5;
        int[] s = { 3, 3, 3, 3 };
        assertEquals(0, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case39() {
        int N = 5;
        int[] s = { 1, 1 };
        assertEquals(0, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case40() {
        int N = 5;
        int[] s = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
        assertEquals(5, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case41() {
        int N = 5;
        int[] s = { 3, 3, 3 };
        assertEquals(0, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case42() {
        int N = 4;
        int[] s = { 1, 1, 1, 1, 1 };
        assertEquals(0, shoppingsurveydiv2.minValue(N, s));
    }

    @Test
    public void case43() {
        int N = 100;
        int[] s = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
        assertEquals(100, shoppingsurveydiv2.minValue(N, s));
    }

}
