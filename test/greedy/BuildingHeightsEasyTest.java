package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class BuildingHeightsEasyTest {
    BuildingHeightsEasy buildingheightseasy = new BuildingHeightsEasy();

    @Test
    public void case1() {
        int M = 2;
        int[] heights = { 1, 2, 1, 4, 3 };
        assertEquals(0, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case2() {
        int M = 3;
        int[] heights = { 1, 3, 5, 2, 1 };
        assertEquals(2, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case3() {
        int M = 1;
        int[] heights = { 43, 19, 15 };
        assertEquals(0, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case4() {
        int M = 3;
        int[] heights = { 19, 23, 9, 12 };
        assertEquals(15, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case5() {
        int M = 12;
        int[] heights = { 25, 18, 38, 1, 42, 41, 14, 16, 19, 46, 42, 39, 38, 31, 43, 37, 26, 41, 33, 37, 45, 27, 19, 24, 33, 11, 22, 20, 36, 4, 4 };
        assertEquals(47, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case6() {
        int M = 4;
        int[] heights = { 41, 12, 15, 33, 25, 32, 2, 23, 23, 40 };
        assertEquals(14, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case7() {
        int M = 10;
        int[] heights = { 34, 48, 29, 26, 30, 17, 23, 8, 37, 48, 40, 47 };
        assertEquals(118, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case8() {
        int M = 9;
        int[] heights = { 32, 25, 15, 43, 48, 5, 5, 14, 40, 31, 46, 41, 3, 20, 32, 16, 23, 16, 14 };
        assertEquals(72, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case9() {
        int M = 1;
        int[] heights = { 13 };
        assertEquals(0, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case10() {
        int M = 39;
        int[] heights = { 33, 3, 36, 7, 17, 31, 6, 24, 35, 20, 15, 17, 15, 5, 22, 34, 36, 37, 9, 3, 50, 13, 46, 43, 34, 12, 45, 40, 24, 36, 45, 9, 41, 30, 15, 9, 10, 23, 32, 46, 44, 48 };
        assertEquals(795, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case11() {
        int M = 1;
        int[] heights = { 2, 34, 43, 40, 20, 3, 44, 22, 18, 41, 14, 1, 3 };
        assertEquals(0, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case12() {
        int M = 2;
        int[] heights = { 28, 45, 36, 36, 37, 18, 3, 46, 29, 27 };
        assertEquals(0, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case13() {
        int M = 1;
        int[] heights = { 20, 25, 39, 29, 28, 22, 23, 19, 43, 26, 15, 14, 45, 5, 29, 47, 9, 38, 38, 37, 35, 26, 24, 21, 45, 28, 16 };
        assertEquals(0, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case14() {
        int M = 7;
        int[] heights = { 45, 49, 23, 21, 37, 1, 50, 10, 24, 19, 5, 1, 35, 20, 45, 39, 49, 41, 50, 38, 30, 38, 22 };
        assertEquals(21, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case15() {
        int M = 5;
        int[] heights = { 45, 1, 39, 12, 26, 42, 6 };
        assertEquals(61, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case16() {
        int M = 13;
        int[] heights = { 28, 13, 17, 28, 24, 40, 48, 30, 42, 32, 50, 36, 22, 48, 28, 21, 37, 10, 8, 11, 18, 21, 5, 19, 9, 16 };
        assertEquals(96, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case17() {
        int M = 36;
        int[] heights = { 24, 21, 18, 1, 35, 37, 30, 11, 28, 29, 40, 20, 12, 39, 7, 36, 38, 37, 6, 27, 48, 16, 37, 15, 36, 41, 35, 46, 8, 30, 49, 31, 3, 19, 34, 37, 5, 15, 49, 34, 46, 39, 3, 7, 29, 12 };
        assertEquals(510, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case18() {
        int M = 27;
        int[] heights = { 50, 50, 45, 47, 17, 31, 11, 2, 23, 46, 49, 30, 25, 49, 13, 29, 17, 46, 16, 23, 12, 14, 7, 7, 4, 11, 14, 33, 22, 7, 3, 23, 8, 47, 19, 24, 27, 30, 27, 1, 25, 25 };
        assertEquals(303, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case19() {
        int M = 21;
        int[] heights = { 24, 42, 32, 42, 39, 47, 15, 1, 12, 23, 7, 18, 33, 22, 2, 7, 31, 4, 29, 38, 2, 48, 12, 30, 29, 40, 30, 5, 15, 9 };
        assertEquals(304, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case20() {
        int M = 5;
        int[] heights = { 3, 38, 31, 41, 36 };
        assertEquals(56, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case21() {
        int M = 10;
        int[] heights = { 48, 19, 50, 17, 2, 23, 18, 10, 3, 23, 38, 43, 24, 37, 6, 5, 15, 45, 34, 19, 11, 44, 26, 50, 46, 13, 33, 37, 49, 29, 29, 48, 50, 28, 14, 3, 1, 33, 12, 5, 7, 1, 47, 30, 38, 2, 36 };
        assertEquals(23, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case22() {
        int M = 15;
        int[] heights = { 8, 12, 43, 46, 10, 23, 24, 9, 22, 4, 22, 26, 6, 6, 37, 12, 12, 40, 9, 43, 29, 12, 28, 32, 10, 48, 4, 19, 10, 3, 29, 19, 17, 21, 16, 26, 43, 39, 35, 17, 44, 8, 42, 1, 16, 31, 13, 27 };
        assertEquals(48, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case23() {
        int M = 3;
        int[] heights = { 22, 50, 36, 1, 31, 46, 49, 37, 16, 10, 39, 44, 28, 5, 16, 43, 33, 10, 33, 19 };
        assertEquals(2, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case24() {
        int M = 13;
        int[] heights = { 28, 20, 31, 43, 2, 43, 22, 23, 17, 43, 22, 3, 45, 2, 50, 43, 40, 15, 2, 31, 10, 31, 35, 27, 25, 19, 36, 10 };
        assertEquals(92, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case25() {
        int M = 4;
        int[] heights = { 40, 17, 35, 20, 9, 38, 15, 32, 10, 31, 26, 33, 35, 21, 36, 34, 15, 26, 48, 19, 6, 9, 1, 42, 35, 26, 11, 23, 37, 49, 38, 28, 17, 22, 47, 28, 9, 13, 9 };
        assertEquals(0, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case26() {
        int M = 4;
        int[] heights = { 35, 2, 28, 7, 37, 14, 21, 14, 13, 39, 19, 22, 40, 11, 8, 17, 23, 30, 5, 23 };
        assertEquals(3, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case27() {
        int M = 5;
        int[] heights = { 42, 40, 28, 19, 50, 43, 27, 19, 36, 13, 22, 15, 19, 11, 30, 40, 24 };
        assertEquals(10, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case28() {
        int M = 6;
        int[] heights = { 45, 14, 19, 7, 21, 37, 29, 1, 41, 3, 19, 22, 44, 9, 2, 12, 8, 44, 41, 29, 31, 3, 50, 47, 24, 12, 27, 13, 36, 19, 44, 32, 34, 15, 38, 6, 1, 18, 8, 42, 22, 27, 15 };
        assertEquals(8, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case29() {
        int M = 7;
        int[] heights = { 16, 29, 44, 11, 21, 22, 41, 24, 22, 40, 47, 33, 16, 11, 20, 36 };
        assertEquals(26, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case30() {
        int M = 3;
        int[] heights = { 21, 18, 40, 26 };
        assertEquals(13, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case31() {
        int M = 5;
        int[] heights = { 34, 14, 29, 12, 28, 46, 46, 46, 26, 39, 8, 47, 13, 49, 20, 34, 40, 18, 18, 5, 30 };
        assertEquals(10, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case32() {
        int M = 2;
        int[] heights = { 33, 42, 12, 3, 34, 37, 25, 40, 22, 38, 20, 33, 17, 17, 28, 14, 43, 19, 22, 39, 33, 22, 10, 18, 11, 27, 35, 17, 6, 26, 8, 40, 20, 19, 44, 3, 7, 18, 42, 29 };
        assertEquals(0, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case33() {
        int M = 1;
        int[] heights = { 9 };
        assertEquals(0, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case34() {
        int M = 2;
        int[] heights = { 5, 2, 1 };
        assertEquals(1, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case35() {
        int M = 3;
        int[] heights = { 2, 3, 3, 3, 3 };
        assertEquals(0, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case36() {
        int M = 3;
        int[] heights = { 2, 5, 6, 7, 11, 17 };
        assertEquals(3, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case37() {
        int M = 3;
        int[] heights = { 1, 1, 50 };
        assertEquals(98, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case38() {
        int M = 50;
        int[] heights = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 50 };
        assertEquals(2401, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case39() {
        int M = 3;
        int[] heights = { 1, 2, 19, 19, 19 };
        assertEquals(0, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case40() {
        int M = 12;
        int[] heights = { 25, 18, 38, 1, 42, 41, 14, 16, 19, 46, 42, 39, 38, 31, 43, 37, 26, 41, 33, 37, 45, 27, 19, 24, 33, 11, 22, 20, 36, 4, 4 };
        assertEquals(47, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case41() {
        int M = 4;
        int[] heights = { 3, 3, 4, 4, 4 };
        assertEquals(1, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case42() {
        int M = 2;
        int[] heights = { 1, 2, 5, 10, 20, 30, 50 };
        assertEquals(1, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case43() {
        int M = 2;
        int[] heights = { 3, 1, 4, 4 };
        assertEquals(0, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case44() {
        int M = 25;
        int[] heights = { 34, 37, 28, 16, 44, 36, 37, 43, 50, 22, 13, 28, 41, 10, 14, 27, 41, 27, 23, 37, 12, 19, 18, 30, 33, 31, 13, 24, 18, 36, 30, 3, 23, 9, 20, 18, 44, 7, 12, 43, 30, 24, 22, 20, 35, 38, 49, 25, 16, 21 };
        assertEquals(194, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case45() {
        int M = 3;
        int[] heights = { 10, 20, 30, 30 };
        assertEquals(10, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case46() {
        int M = 3;
        int[] heights = { 1, 1, 2, 2, 3, 3 };
        assertEquals(1, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case47() {
        int M = 1;
        int[] heights = { 1, 2, 3 };
        assertEquals(0, buildingheightseasy.minimum(M, heights));
    }

    @Test
    public void case48() {
        int M = 5;
        int[] heights = { 1, 1, 1, 1, 50, 50, 50, 50 };
        assertEquals(49, buildingheightseasy.minimum(M, heights));
    }

}
