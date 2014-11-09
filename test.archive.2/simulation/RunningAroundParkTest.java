package topc.test.simulation;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.simulation.*;

public class RunningAroundParkTest {
    RunningAroundPark runningaroundpark = new RunningAroundPark();

    @Test
    public void case1() {
        int N = 3;
        int[] d = { 1, 2, 3 };
        assertEquals(1, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case2() {
        int N = 3;
        int[] d = { 3, 2, 1 };
        assertEquals(3, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case3() {
        int N = 50;
        int[] d = { 1, 3, 5, 7, 9, 2, 4, 6, 8, 10 };
        assertEquals(2, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case4() {
        int N = 24;
        int[] d = { 6, 6 };
        assertEquals(2, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case5() {
        int N = 2;
        int[] d = { 1 };
        assertEquals(1, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case6() {
        int N = 36;
        int[] d = { 2, 36, 9, 30, 25, 19, 29, 7, 6, 8, 5, 16, 11, 35, 19, 6, 35, 25, 15, 9, 32, 23, 34, 35, 11, 22, 2, 1, 33, 31, 7, 11, 18, 28, 7, 3, 13 };
        assertEquals(21, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case7() {
        int N = 41;
        int[] d = { 23, 18, 9, 13, 1, 40 };
        assertEquals(4, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case8() {
        int N = 21;
        int[] d = { 18, 8, 5, 11, 6, 14, 13, 5, 4, 6, 8, 11, 9, 19, 10, 20, 18, 16, 15, 1 };
        assertEquals(13, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case9() {
        int N = 7;
        int[] d = { 3, 6, 4, 5, 2, 1, 3, 5, 3, 3, 4, 5, 1, 5, 2, 7, 5, 6, 3, 2, 3, 1, 2, 4, 4, 2, 4, 5, 2, 1, 2, 6, 4, 1, 3, 2, 7, 7, 3, 3, 4, 5 };
        assertEquals(22, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case10() {
        int N = 20;
        int[] d = { 13, 12, 14, 4, 6, 8, 4, 9, 9, 6, 17, 4, 17, 12, 14, 19, 5, 13, 9, 11, 1, 1, 11, 13, 2, 6, 13, 2, 18, 4, 3, 10 };
        assertEquals(16, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case11() {
        int N = 10;
        int[] d = { 9, 8, 7, 6, 8, 1, 4, 7, 8, 4, 4, 6, 5, 10, 3, 2, 1, 7, 10, 6, 2, 4, 1, 8, 9, 10, 5, 7, 10, 2, 5, 6, 9, 10, 6, 7, 9 };
        assertEquals(17, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case12() {
        int N = 11;
        int[] d = { 11, 4, 10, 7, 2, 6, 11 };
        assertEquals(4, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case13() {
        int N = 45;
        int[] d = { 33, 24, 28, 17, 4, 43, 43 };
        assertEquals(5, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case14() {
        int N = 16;
        int[] d = { 15, 13, 15, 2, 14, 6, 13, 12, 2, 11, 3, 13, 15, 1, 6, 9, 12, 13, 10, 6, 12, 4, 4, 9, 6, 11, 10, 6, 13, 8, 16, 3, 7, 14, 11, 5, 9, 4, 1, 16, 8, 14, 6 };
        assertEquals(23, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case15() {
        int N = 42;
        int[] d = { 7, 6, 29, 19, 22, 15, 25, 14, 35, 33, 3, 31, 23, 17, 8 };
        assertEquals(10, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case16() {
        int N = 36;
        int[] d = { 19 };
        assertEquals(1, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case17() {
        int N = 35;
        int[] d = { 14, 34, 21, 16, 2, 8, 23, 11, 34, 32, 9, 25, 30, 24, 16, 8, 23, 15, 19, 27, 10, 11, 18, 29, 32, 4, 2, 16, 11, 1, 11, 9, 29, 13, 25, 21, 27, 11, 4, 21, 7, 8, 16, 16, 30, 29, 26, 3 };
        assertEquals(26, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case18() {
        int N = 22;
        int[] d = { 17, 21, 12, 4, 13, 18, 12, 5, 20, 8, 6, 17, 20, 16, 4, 20, 5, 19, 9, 1, 6, 2, 17, 22, 15, 6, 11, 19, 4 };
        assertEquals(16, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case19() {
        int N = 18;
        int[] d = { 7, 9, 8, 13, 6, 17, 4, 15, 2, 18, 11, 14, 11, 4, 12, 13, 4, 8, 1, 18, 9, 8, 18, 4, 15, 10, 3, 10, 7, 14, 7, 1, 14, 17, 8, 8, 8, 1, 3, 11, 11, 16 };
        assertEquals(23, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case20() {
        int N = 34;
        int[] d = { 5, 14, 5, 32, 30, 4, 15, 11, 32, 15, 17, 9, 21, 12, 6, 15, 20, 3, 29, 28, 29, 23, 12, 22, 18, 8, 17, 26, 34, 18, 5, 18, 19, 4, 17, 9, 13, 26, 12, 31, 18, 14, 12, 26, 8, 11, 29 };
        assertEquals(24, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case21() {
        int N = 18;
        int[] d = { 9, 8, 14, 2, 18, 12, 5, 18 };
        assertEquals(5, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case22() {
        int N = 11;
        int[] d = { 8, 5, 11, 11, 2, 7, 9, 1, 4, 11, 2, 6, 7, 7, 5, 10, 11, 9 };
        assertEquals(9, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case23() {
        int N = 9;
        int[] d = { 8, 4, 6, 6, 9, 5, 1, 2, 1, 8, 5, 4, 5, 3, 3, 8, 9, 4, 8, 8, 5, 7, 5, 9, 9, 2, 2, 1, 1, 7, 8, 5, 6, 9, 4, 9, 6, 4, 2, 7, 5, 1, 5, 6 };
        assertEquals(26, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case24() {
        int N = 30;
        int[] d = { 24, 28, 18, 16, 19, 16, 13, 3, 5, 4, 27, 25, 18, 5, 21, 27, 4, 24, 24, 24, 24, 2, 17, 22, 4, 4, 26, 25, 2, 24, 12, 20, 3, 19, 24, 13, 23, 2, 2, 12, 28, 26, 7, 29, 14, 6, 18, 12 };
        assertEquals(29, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case25() {
        int N = 41;
        int[] d = { 9, 38, 8, 26, 17, 23, 41, 29, 26, 29, 16, 38, 37, 17 };
        assertEquals(8, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case26() {
        int N = 41;
        int[] d = { 31, 40, 20, 17, 16, 21, 12, 5, 3, 22, 22, 13, 33, 31, 15, 39, 7, 28, 22, 13, 11, 13, 30, 41, 8, 38, 1, 20, 5, 39, 11, 32, 1, 11, 21, 19, 8, 26, 7, 40, 8, 37, 28, 28, 13, 31, 9, 10, 38, 37 };
        assertEquals(29, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case27() {
        int N = 14;
        int[] d = { 11, 7, 7, 12, 3, 12, 5, 13, 8, 4, 7, 8, 10, 12, 12, 4, 2, 3, 4, 8, 2, 2, 2, 11, 10, 9, 7, 5, 6, 3, 14, 1, 7, 13, 8, 9, 1, 1, 11, 13, 10, 4, 2, 6, 9, 9, 12, 4, 10, 7 };
        assertEquals(28, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case28() {
        int N = 12;
        int[] d = { 3, 9, 9, 6, 1, 12, 4, 4, 10, 10, 8, 11, 7, 7, 4, 12, 2, 5, 11, 8, 7, 8, 7, 8, 4, 10, 9, 6, 1, 8, 10, 9, 3, 3, 3, 12, 12, 3, 1, 7, 12, 2, 5, 11, 4, 8, 7, 5, 6, 11 };
        assertEquals(30, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case29() {
        int N = 6;
        int[] d = { 4, 3, 6, 3, 5, 2, 5, 2, 4, 6, 4, 1, 6, 4, 4, 1, 4, 6, 1, 6, 6, 1, 5, 6, 3, 5, 4, 6, 2, 6, 6, 6, 3, 5, 6, 6, 3, 4, 5, 1, 3, 5, 3, 4, 3, 6, 3, 5, 4, 1 };
        assertEquals(27, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case30() {
        int N = 40;
        int[] d = { 39, 3, 3, 25, 5, 21, 6, 9, 34, 13, 34, 11, 26, 1, 28, 2, 36, 36, 26, 3, 28, 29, 17, 12, 30, 8, 20, 10, 40, 26, 10, 34, 31, 32, 8, 16, 1, 39, 26, 18, 24, 29, 5, 36, 4, 37, 7, 12, 1, 6 };
        assertEquals(27, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case31() {
        int N = 3;
        int[] d = { 1, 2, 3 };
        assertEquals(1, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case32() {
        int N = 3;
        int[] d = { 3, 2, 1 };
        assertEquals(3, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case33() {
        int N = 4;
        int[] d = { 3, 3, 3, 3 };
        assertEquals(4, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case34() {
        int N = 3;
        int[] d = { 1 };
        assertEquals(1, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case35() {
        int N = 2;
        int[] d = { 1, 1, 1, 1, 1 };
        assertEquals(5, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case36() {
        int N = 24;
        int[] d = { 6, 6 };
        assertEquals(2, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case37() {
        int N = 4;
        int[] d = { 3, 2, 1, 3, 2, 1, 3, 2, 1 };
        assertEquals(7, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case38() {
        int N = 7;
        int[] d = { 7, 6, 5, 4, 3, 2, 1 };
        assertEquals(7, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case39() {
        int N = 40;
        int[] d = { 1, 2, 3 };
        assertEquals(1, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case40() {
        int N = 5;
        int[] d = { 3 };
        assertEquals(1, runningaroundpark.numberOfLap(N, d));
    }

    @Test
    public void case41() {
        int N = 6;
        int[] d = { 6, 6, 6, 3, 3 };
        assertEquals(5, runningaroundpark.numberOfLap(N, d));
    }

}
