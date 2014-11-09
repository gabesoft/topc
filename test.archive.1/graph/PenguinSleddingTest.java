package topc.test.graph;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.graph.*;

public class PenguinSleddingTest {
    PenguinSledding penguinsledding = new PenguinSledding();

    @Test
    public void case1() {
        int numCheckpoints = 4;
        int[] checkpoint1 = { 1, 2, 3 };
        int[] checkpoint2 = { 2, 3, 4 };
        assertEquals(6L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case2() {
        int numCheckpoints = 12;
        int[] checkpoint1 = { 1, 2, 3, 4, 6, 7, 8 };
        int[] checkpoint2 = { 4, 4, 4, 5, 5, 5, 5 };
        assertEquals(30L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case3() {
        int numCheckpoints = 3;
        int[] checkpoint1 = { 1, 2, 3 };
        int[] checkpoint2 = { 2, 3, 1 };
        assertEquals(8L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case4() {
        int numCheckpoints = 6;
        int[] checkpoint1 = { 1, 3, 6 };
        int[] checkpoint2 = { 2, 4, 4 };
        assertEquals(5L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case5() {
        int numCheckpoints = 2;
        int[] checkpoint1 = { 1 };
        int[] checkpoint2 = { 2 };
        assertEquals(2L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case6() {
        int numCheckpoints = 36;
        int[] checkpoint1 = { 13, 24, 24, 20, 31, 16, 10, 36, 34, 32, 28, 5, 20, 29, 23, 2, 14, 4, 9, 5, 19, 21, 8, 1, 26, 27, 25, 15, 22, 30, 30, 6, 11, 7, 2, 35, 13, 29, 4, 12, 33, 18, 13, 14, 17, 35, 3 };
        int[] checkpoint2 = { 10, 15, 27, 1, 29, 11, 5, 18, 33, 1, 9, 2, 31, 6, 19, 10, 33, 18, 6, 27, 3, 22, 4, 12, 31, 30, 34, 16, 7, 24, 3, 28, 15, 21, 22, 8, 26, 20, 14, 32, 25, 17, 35, 8, 36, 26, 23 };
        assertEquals(162L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case7() {
        int numCheckpoints = 6;
        int[] checkpoint1 = { 1, 1, 1, 2, 2, 2, 3, 3, 3 };
        int[] checkpoint2 = { 4, 5, 6, 4, 5, 6, 4, 5, 6 };
        assertEquals(34L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case8() {
        int numCheckpoints = 50;
        int[] checkpoint1 = { 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 50, 40, 40, 40, 23, 4, 24, 40, 22, 40, 8, 40, 40, 40, 34, 21, 40, 40, 38, 40, 40, 40, 40, 40, 28, 40, 40, 40, 40, 46, 13, 40, 40, 40, 47, 40, 40 };
        int[] checkpoint2 = { 45, 42, 20, 48, 12, 32, 25, 10, 26, 39, 16, 2, 19, 43, 37, 17, 19, 19, 19, 18, 19, 27, 19, 29, 11, 36, 19, 19, 1, 41, 19, 35, 14, 33, 49, 3, 19, 7, 5, 19, 31, 19, 19, 6, 9, 15, 19, 44, 30 };
        assertEquals(68719493118L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case9() {
        int numCheckpoints = 4;
        int[] checkpoint1 = { 1, 3 };
        int[] checkpoint2 = { 2, 4 };
        assertEquals(3L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case10() {
        int numCheckpoints = 50;
        int[] checkpoint1 = { 31, 19, 28, 5, 4, 33, 16, 13, 11, 8, 36, 17, 27, 40, 2, 49, 41, 35, 21, 34, 29, 23, 32, 46, 48, 30, 3, 26, 22, 18, 45, 47, 24, 37, 9, 39, 6, 15, 43, 38, 20, 12, 50, 7, 44, 25, 1, 42, 10 };
        int[] checkpoint2 = { 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14 };
        assertEquals(562949953421312L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case11() {
        int numCheckpoints = 50;
        int[] checkpoint1 = { 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47 };
        int[] checkpoint2 = { 7, 26, 28, 25, 32, 11, 50, 39, 12, 5, 17, 19, 37, 3, 10, 44, 43, 18, 24, 15, 48, 4, 30, 23, 2, 14, 1, 8, 16, 31, 42, 9, 27, 38, 35, 40, 45, 46, 20, 29, 36, 21, 49, 13, 34, 41, 22, 6, 33 };
        assertEquals(562949953421312L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case12() {
        int numCheckpoints = 30;
        int[] checkpoint1 = { 7, 30, 30, 30, 9, 13, 29, 30, 30, 30, 30, 14, 30, 1, 30, 24, 30, 30, 18, 20, 19, 30, 30, 25, 30, 30, 30, 30, 6, 30, 30, 30, 30, 30, 30, 30, 30, 30, 26, 30, 30, 30, 21 };
        int[] checkpoint2 = { 22, 7, 14, 2, 17, 2, 10, 9, 26, 11, 4, 12, 19, 15, 3, 3, 17, 23, 8, 28, 27, 1, 25, 4, 5, 20, 22, 16, 11, 18, 12, 24, 13, 15, 28, 8, 10, 21, 23, 27, 6, 29, 16 };
        assertEquals(536870968L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case13() {
        int numCheckpoints = 14;
        int[] checkpoint1 = { 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7 };
        int[] checkpoint2 = { 8, 9, 10, 11, 12, 13, 14, 8, 9, 10, 11, 12, 13, 14, 8, 9, 10, 11, 12, 13, 14, 8, 9, 10, 11, 12, 13, 14, 8, 9, 10, 11, 12, 13, 14, 8, 9, 10, 11, 12, 13, 14, 8, 9, 10, 11, 12, 13, 14 };
        assertEquals(1730L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case14() {
        int numCheckpoints = 10;
        int[] checkpoint1 = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 8, 8, 9 };
        int[] checkpoint2 = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 3, 4, 5, 6, 7, 8, 9, 10, 4, 5, 6, 7, 8, 9, 10, 5, 6, 7, 8, 9, 10, 6, 7, 8, 9, 10, 7, 8, 9, 10, 8, 9, 10, 9, 10, 10 };
        assertEquals(5186L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case15() {
        int numCheckpoints = 30;
        int[] checkpoint1 = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
        int[] checkpoint2 = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23 };
        assertEquals(541065256L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case16() {
        int numCheckpoints = 50;
        int[] checkpoint1 = { 1, 1, 2, 1, 2, 1, 3, 2, 4, 1, 5, 2, 6, 1, 7, 3, 8, 2, 9, 4, 10, 1, 11, 5, 12, 2, 13, 6, 14, 1, 15, 7, 16, 3, 17, 8, 18, 2, 19, 9, 20, 4, 21, 10, 22, 1, 23, 11, 24 };
        int[] checkpoint2 = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
        assertEquals(862L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case17() {
        int numCheckpoints = 50;
        int[] checkpoint1 = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26 };
        int[] checkpoint2 = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
        assertEquals(33554431L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case18() {
        int numCheckpoints = 50;
        int[] checkpoint1 = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2 };
        int[] checkpoint2 = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 3 };
        assertEquals(281474976710660L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case19() {
        int numCheckpoints = 50;
        int[] checkpoint1 = { 1, 1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 6, 8, 8, 8, 8, 8, 8, 9, 11, 11, 12, 14, 15, 15, 15, 15, 18, 18, 19, 20, 22, 24, 25, 25, 25, 28, 29, 30, 31, 34, 35, 36, 37, 39, 41, 43, 45, 48 };
        int[] checkpoint2 = { 13, 42, 32, 36, 8, 33, 50, 23, 50, 14, 19, 37, 8, 12, 15, 18, 26, 29, 37, 49, 40, 41, 34, 34, 16, 18, 47, 49, 19, 37, 35, 32, 42, 44, 29, 36, 37, 34, 47, 43, 42, 44, 41, 48, 42, 45, 47, 45, 48, 50 };
        assertEquals(440L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case20() {
        int numCheckpoints = 50;
        int[] checkpoint1 = { 1, 1, 1, 1, 2, 3, 4, 4, 6, 6, 6, 7, 7, 8, 8, 10, 11, 11, 12, 13, 13, 13, 13, 14, 15, 17, 17, 19, 21, 21, 21, 21, 22, 22, 23, 23, 25, 25, 25, 26, 29, 30, 31, 31, 32, 32, 33, 35, 39, 40 };
        int[] checkpoint2 = { 23, 39, 40, 41, 14, 27, 16, 29, 8, 15, 40, 32, 38, 16, 43, 21, 23, 46, 50, 24, 42, 45, 47, 26, 42, 18, 23, 36, 31, 33, 39, 40, 30, 46, 24, 33, 37, 40, 42, 46, 31, 42, 35, 37, 40, 47, 42, 50, 50, 47 };
        assertEquals(270L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case21() {
        int numCheckpoints = 50;
        int[] checkpoint1 = { 1, 1, 1, 2, 2, 2, 3, 3, 4, 5, 5, 6, 6, 7, 7, 7, 9, 9, 9, 9, 10, 10, 11, 13, 13, 13, 14, 15, 16, 17, 19, 21, 21, 21, 22, 23, 24, 24, 26, 26, 27, 28, 31, 32, 35, 35, 35, 36, 36, 46 };
        int[] checkpoint2 = { 13, 16, 28, 12, 19, 32, 7, 21, 40, 8, 44, 18, 49, 37, 43, 48, 26, 29, 41, 45, 35, 37, 47, 14, 28, 40, 18, 31, 37, 41, 42, 32, 39, 42, 38, 39, 31, 42, 33, 34, 48, 34, 35, 40, 38, 43, 50, 46, 48, 50 };
        assertEquals(179L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case22() {
        int numCheckpoints = 50;
        int[] checkpoint1 = { 2, 3, 3, 3, 4, 4, 4, 5, 6, 6, 7, 8, 8, 8, 9, 9, 10, 10, 10, 12, 13, 13, 13, 14, 15, 16, 16, 16, 17, 17, 19, 20, 20, 20, 20, 21, 21, 23, 23, 26, 27, 28, 29, 30, 30, 31, 33, 40, 41, 46 };
        int[] checkpoint2 = { 38, 19, 28, 38, 11, 13, 31, 12, 8, 46, 43, 19, 20, 23, 16, 47, 18, 24, 46, 24, 14, 18, 35, 38, 19, 27, 28, 33, 29, 34, 33, 22, 29, 37, 42, 24, 45, 36, 49, 27, 36, 36, 30, 42, 47, 40, 45, 42, 44, 47 };
        assertEquals(191L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case23() {
        int numCheckpoints = 50;
        int[] checkpoint1 = { 1, 2, 2, 2, 2, 2, 2, 2, 3, 4, 5, 5, 5, 5, 6, 7, 7, 9, 10, 11, 12, 12, 12, 12, 13, 13, 14, 14, 14, 17, 18, 18, 21, 22, 22, 22, 22, 22, 23, 24, 25, 25, 26, 28, 29, 31, 35, 36, 36, 39 };
        int[] checkpoint2 = { 41, 18, 20, 23, 26, 41, 47, 48, 29, 33, 11, 23, 29, 36, 7, 28, 30, 49, 29, 32, 14, 23, 35, 37, 25, 30, 30, 48, 49, 25, 26, 28, 46, 23, 30, 34, 39, 42, 46, 41, 34, 36, 30, 45, 39, 49, 45, 43, 48, 44 };
        assertEquals(354L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case24() {
        int numCheckpoints = 50;
        int[] checkpoint1 = { 1, 1, 1, 1, 2, 3, 4, 6, 7, 7, 7, 7, 7, 7, 9, 10, 11, 12, 12, 12, 13, 15, 15, 15, 16, 16, 16, 17, 19, 19, 19, 20, 21, 21, 22, 23, 24, 24, 26, 26, 27, 27, 29, 30, 35, 37, 38, 38, 40, 41 };
        int[] checkpoint2 = { 3, 26, 27, 32, 38, 35, 11, 50, 9, 10, 11, 35, 41, 43, 12, 18, 21, 18, 45, 50, 43, 24, 26, 49, 17, 39, 49, 29, 36, 39, 44, 39, 29, 41, 39, 43, 29, 43, 36, 43, 41, 46, 44, 49, 48, 50, 42, 44, 48, 42 };
        assertEquals(256L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case25() {
        int numCheckpoints = 50;
        int[] checkpoint1 = { 3, 3, 4, 5, 5, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 10, 10, 12, 13, 15, 15, 15, 15, 15, 17, 18, 18, 18, 18, 19, 21, 23, 24, 25, 25, 26, 27, 29, 29, 30, 31, 32, 33, 37, 37, 39, 40, 43, 45 };
        int[] checkpoint2 = { 8, 20, 44, 16, 37, 12, 16, 10, 24, 32, 34, 16, 24, 41, 44, 40, 23, 49, 15, 43, 20, 31, 34, 44, 45, 26, 28, 31, 48, 50, 38, 47, 25, 35, 41, 50, 44, 34, 42, 50, 38, 46, 37, 49, 38, 44, 47, 46, 50, 50 };
        assertEquals(263L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case26() {
        int numCheckpoints = 50;
        int[] checkpoint1 = { 1, 2, 3, 3, 4, 4, 5, 5, 6, 6, 6, 6, 7, 7, 8, 8, 9, 9, 9, 10, 10, 11, 11, 11, 12, 12, 13, 13, 15, 15, 15, 16, 16, 18, 19, 20, 22, 23, 25, 28, 28, 29, 30, 32, 32, 32, 37, 37, 38, 45 };
        int[] checkpoint2 = { 34, 38, 35, 44, 11, 47, 36, 50, 26, 30, 44, 47, 27, 39, 14, 36, 12, 21, 49, 25, 43, 16, 43, 46, 23, 31, 16, 26, 18, 28, 31, 38, 44, 36, 26, 22, 47, 48, 34, 37, 38, 36, 48, 45, 48, 49, 41, 44, 39, 47 };
        assertEquals(178L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case27() {
        int numCheckpoints = 50;
        int[] checkpoint1 = { 1, 1, 1, 2, 3, 3, 6, 6, 8, 8, 10, 11, 13, 14, 15, 16, 16, 16, 16, 17, 19, 19, 20, 20, 20, 21, 21, 21, 22, 22, 24, 24, 25, 25, 26, 28, 28, 29, 30, 31, 32, 33, 34, 34, 40, 40, 41, 41, 43, 45 };
        int[] checkpoint2 = { 30, 47, 49, 30, 6, 22, 17, 46, 11, 48, 31, 41, 40, 34, 26, 32, 35, 47, 48, 41, 22, 37, 31, 40, 47, 27, 30, 34, 31, 37, 34, 45, 30, 37, 31, 38, 49, 40, 36, 47, 38, 43, 35, 50, 41, 45, 45, 49, 49, 48 };
        assertEquals(276L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case28() {
        int numCheckpoints = 50;
        int[] checkpoint1 = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4, 5, 6, 6, 7, 7, 8, 8, 8, 8, 8, 9, 10, 10, 10, 11, 11, 13, 15, 17, 18, 18, 19, 19, 20, 20, 21, 22, 22, 23, 23, 28, 29, 32, 32, 32, 33, 33, 33, 36 };
        int[] checkpoint2 = { 18, 3, 18, 17, 22, 29, 13, 19, 21, 30, 38, 17, 13, 41, 8, 35, 9, 29, 30, 40, 49, 37, 20, 32, 42, 35, 36, 27, 19, 21, 24, 29, 45, 48, 30, 41, 30, 28, 43, 40, 45, 42, 36, 34, 36, 42, 35, 38, 50, 48 };
        assertEquals(261L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case29() {
        int numCheckpoints = 50;
        int[] checkpoint1 = { 1, 3, 3, 3, 4, 4, 6, 6, 8, 8, 9, 9, 9, 9, 11, 11, 11, 11, 13, 15, 16, 16, 16, 17, 18, 22, 23, 23, 23, 23, 24, 27, 28, 28, 29, 30, 30, 31, 34, 34, 34, 34, 34, 35, 36, 36, 37, 38, 42, 45 };
        int[] checkpoint2 = { 9, 45, 48, 50, 6, 36, 12, 17, 17, 44, 21, 25, 30, 44, 12, 14, 27, 33, 25, 29, 24, 25, 41, 34, 21, 40, 25, 28, 42, 43, 31, 44, 31, 34, 37, 47, 48, 40, 35, 39, 41, 42, 43, 40, 40, 50, 48, 47, 43, 47 };
        assertEquals(307L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case30() {
        int numCheckpoints = 50;
        int[] checkpoint1 = { 2, 2, 4, 4, 4, 4, 5, 5, 7, 8, 8, 8, 9, 9, 10, 10, 10, 12, 13, 14, 14, 14, 14, 16, 16, 17, 17, 17, 18, 18, 18, 19, 20, 20, 21, 21, 22, 23, 23, 25, 26, 28, 28, 31, 31, 34, 35, 35, 36, 41 };
        int[] checkpoint2 = { 5, 49, 30, 32, 41, 44, 25, 32, 46, 27, 29, 39, 37, 47, 25, 33, 37, 27, 26, 22, 24, 25, 43, 21, 41, 24, 31, 41, 24, 33, 36, 28, 25, 42, 33, 49, 46, 35, 40, 36, 27, 30, 44, 34, 47, 39, 37, 49, 50, 50 };
        assertEquals(185L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case31() {
        int numCheckpoints = 50;
        int[] checkpoint1 = { 1, 1, 3, 3, 4, 6, 6, 6, 6, 6, 6, 7, 7, 8, 8, 9, 10, 10, 12, 12, 13, 13, 14, 14, 15, 15, 15, 16, 16, 16, 19, 19, 20, 20, 22, 23, 23, 24, 27, 28, 29, 29, 30, 31, 32, 32, 34, 34, 37, 37 };
        int[] checkpoint2 = { 11, 14, 9, 14, 22, 9, 12, 28, 39, 41, 42, 49, 50, 35, 37, 50, 26, 35, 13, 36, 31, 44, 37, 48, 24, 32, 43, 18, 19, 29, 20, 50, 23, 36, 50, 35, 40, 49, 32, 47, 42, 46, 42, 41, 35, 39, 37, 50, 42, 50 };
        assertEquals(286L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case32() {
        int numCheckpoints = 50;
        int[] checkpoint1 = { 1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 3, 5, 6, 6, 6, 7, 8, 9, 10, 10, 10, 11, 12, 12, 14, 15, 16, 16, 17, 17, 17, 18, 18, 19, 19, 20, 20, 20, 22, 23, 24, 25, 28, 28, 29, 30, 31, 32, 38, 41 };
        int[] checkpoint2 = { 3, 28, 29, 42, 49, 43, 45, 16, 23, 26, 39, 42, 8, 21, 27, 16, 35, 24, 34, 46, 47, 41, 18, 27, 35, 44, 23, 46, 26, 29, 48, 39, 50, 20, 38, 22, 30, 41, 48, 40, 27, 48, 34, 40, 35, 34, 35, 50, 41, 42 };
        assertEquals(205L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case33() {
        int numCheckpoints = 50;
        int[] checkpoint1 = { 1, 1, 1, 2, 3, 3, 3, 4, 4, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 9, 9, 9, 10, 11, 12, 12, 13, 13, 13, 14, 15, 15, 15, 17, 17, 18, 18, 19, 25, 27, 28, 29, 29, 30, 31, 31, 34, 34, 41, 43 };
        int[] checkpoint2 = { 30, 36, 44, 35, 13, 45, 46, 5, 8, 21, 27, 28, 36, 37, 39, 13, 38, 47, 49, 18, 39, 43, 43, 41, 32, 42, 16, 25, 34, 27, 16, 30, 35, 23, 38, 19, 41, 24, 46, 46, 32, 32, 48, 43, 33, 46, 35, 47, 43, 45 };
        assertEquals(198L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case34() {
        int numCheckpoints = 50;
        int[] checkpoint1 = { 1, 1, 3, 4, 4, 5, 5, 6, 6, 7, 9, 10, 10, 11, 12, 12, 14, 14, 14, 16, 16, 16, 17, 18, 18, 18, 18, 18, 19, 21, 22, 23, 25, 25, 26, 27, 28, 29, 30, 31, 31, 32, 34, 34, 34, 37, 38, 40, 41, 41 };
        int[] checkpoint2 = { 35, 44, 16, 13, 39, 9, 17, 27, 43, 41, 27, 39, 40, 27, 21, 39, 17, 21, 45, 25, 33, 45, 28, 23, 26, 31, 38, 49, 44, 24, 26, 47, 41, 44, 42, 30, 41, 35, 33, 32, 38, 36, 39, 40, 41, 44, 40, 49, 46, 47 };
        assertEquals(238L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case35() {
        int numCheckpoints = 50;
        int[] checkpoint1 = { 1, 1, 2, 2, 3, 3, 3, 4, 4, 5, 6, 8, 8, 8, 9, 9, 10, 10, 10, 10, 10, 12, 13, 13, 14, 14, 16, 16, 16, 17, 18, 19, 19, 19, 22, 22, 24, 25, 27, 28, 30, 31, 33, 34, 35, 37, 38, 38, 38, 45 };
        int[] checkpoint2 = { 11, 26, 26, 50, 4, 39, 41, 7, 13, 18, 32, 16, 21, 41, 40, 48, 23, 26, 34, 41, 47, 36, 25, 46, 36, 49, 30, 35, 45, 50, 30, 23, 30, 44, 27, 30, 48, 41, 43, 34, 36, 44, 38, 47, 38, 43, 39, 48, 49, 47 };
        assertEquals(208L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case36() {
        int numCheckpoints = 50;
        int[] checkpoint1 = { 1, 1, 1, 1, 2, 2, 2, 4, 4, 5, 6, 6, 7, 7, 7, 8, 8, 10, 10, 11, 12, 13, 17, 17, 18, 18, 19, 19, 19, 20, 20, 20, 23, 23, 23, 26, 26, 27, 28, 29, 29, 31, 32, 34, 35, 36, 36, 36, 40, 44 };
        int[] checkpoint2 = { 27, 33, 36, 50, 17, 35, 47, 44, 47, 8, 12, 31, 8, 25, 37, 29, 47, 25, 45, 49, 19, 27, 22, 50, 25, 32, 23, 34, 36, 21, 31, 37, 24, 27, 47, 48, 49, 38, 42, 35, 38, 41, 38, 37, 45, 38, 43, 46, 42, 45 };
        assertEquals(206L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case37() {
        int numCheckpoints = 50;
        int[] checkpoint1 = { 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 11, 11, 13, 14, 15, 16, 17, 20, 20, 20, 22, 22, 25, 26, 26, 27, 27, 29, 31, 33, 34, 35, 37 };
        int[] checkpoint2 = { 15, 21, 7, 11, 27, 33, 41, 9, 23, 39, 45, 21, 22, 31, 8, 10, 14, 18, 38, 41, 47, 34, 36, 49, 47, 48, 49, 23, 43, 14, 38, 50, 19, 28, 21, 42, 47, 47, 48, 32, 31, 33, 38, 39, 36, 34, 38, 47, 40, 39 };
        assertEquals(212L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case38() {
        int numCheckpoints = 50;
        int[] checkpoint1 = { 1, 2, 3, 4, 4, 4, 5, 5, 5, 6, 6, 7, 7, 9, 9, 10, 11, 11, 12, 14, 16, 16, 17, 17, 17, 17, 18, 20, 21, 23, 23, 25, 26, 26, 29, 29, 30, 30, 30, 32, 32, 34, 34, 35, 35, 36, 40, 41, 44, 48 };
        int[] checkpoint2 = { 12, 30, 50, 6, 11, 20, 17, 19, 47, 22, 33, 23, 24, 26, 45, 50, 13, 30, 15, 48, 38, 47, 18, 25, 33, 48, 31, 27, 34, 36, 42, 47, 43, 48, 35, 47, 36, 40, 47, 34, 49, 36, 40, 38, 39, 46, 42, 49, 46, 50 };
        assertEquals(212L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case39() {
        int numCheckpoints = 20;
        int[] checkpoint1 = { 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 7, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9, 9, 10, 10, 11, 11, 11, 12, 12, 13, 14, 15, 15, 18 };
        int[] checkpoint2 = { 7, 11, 12, 19, 20, 8, 10, 16, 18, 19, 4, 8, 9, 12, 17, 19, 9, 14, 19, 20, 9, 12, 15, 17, 20, 10, 12, 13, 15, 20, 10, 18, 19, 10, 11, 12, 15, 17, 16, 17, 16, 19, 20, 13, 20, 14, 19, 16, 19, 19 };
        assertEquals(1365L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case40() {
        int numCheckpoints = 20;
        int[] checkpoint1 = { 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 8, 8, 8, 8, 9, 9, 9, 10, 10, 11, 11, 11, 11, 12, 12, 13, 13, 13, 14, 15, 15, 16, 16, 17, 17, 18 };
        int[] checkpoint2 = { 2, 5, 7, 9, 17, 3, 6, 8, 11, 12, 13, 4, 11, 12, 18, 11, 16, 19, 6, 9, 11, 9, 10, 15, 12, 13, 16, 20, 11, 19, 20, 13, 17, 13, 14, 16, 19, 17, 20, 14, 16, 17, 17, 18, 20, 19, 20, 18, 19, 19 };
        assertEquals(1307L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case41() {
        int numCheckpoints = 20;
        int[] checkpoint1 = { 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 9, 10, 10, 11, 11, 12, 12, 12, 13, 14, 15, 16, 17 };
        int[] checkpoint2 = { 2, 3, 6, 13, 14, 17, 18, 19, 10, 14, 4, 9, 16, 18, 7, 9, 11, 13, 17, 18, 6, 11, 12, 18, 20, 10, 20, 8, 13, 14, 20, 9, 10, 11, 12, 15, 19, 18, 15, 20, 15, 16, 16, 18, 20, 18, 19, 17, 19, 19 };
        assertEquals(964L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case42() {
        int numCheckpoints = 20;
        int[] checkpoint1 = { 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 8, 9, 9, 9, 10, 10, 11, 11, 11, 13, 13, 14, 15, 16 };
        int[] checkpoint2 = { 3, 6, 7, 11, 12, 17, 3, 4, 10, 16, 20, 5, 6, 14, 15, 19, 7, 10, 15, 16, 18, 6, 16, 20, 7, 8, 10, 18, 9, 11, 12, 13, 15, 16, 17, 20, 10, 10, 14, 19, 13, 19, 15, 18, 19, 14, 20, 17, 16, 17 };
        assertEquals(2796L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case43() {
        int numCheckpoints = 20;
        int[] checkpoint1 = { 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 8, 8, 10, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 14, 16, 16, 16, 17 };
        int[] checkpoint2 = { 4, 7, 12, 20, 3, 7, 9, 6, 9, 14, 5, 10, 11, 13, 14, 15, 18, 19, 20, 9, 12, 13, 15, 7, 13, 14, 15, 9, 10, 9, 20, 20, 12, 14, 15, 17, 18, 20, 15, 18, 19, 20, 14, 18, 20, 19, 17, 19, 20, 18 };
        assertEquals(1893L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case44() {
        int numCheckpoints = 20;
        int[] checkpoint1 = { 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 9, 9, 9, 9, 10, 10, 11, 12, 14, 15, 15, 16 };
        int[] checkpoint2 = { 6, 7, 10, 12, 14, 20, 6, 7, 8, 12, 4, 5, 6, 8, 12, 13, 14, 16, 19, 5, 7, 11, 13, 15, 17, 14, 15, 16, 18, 9, 12, 15, 17, 10, 13, 15, 18, 18, 14, 15, 18, 19, 11, 14, 19, 13, 16, 16, 17, 19 };
        assertEquals(1369L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case45() {
        int numCheckpoints = 20;
        int[] checkpoint1 = { 1, 1, 2, 2, 2, 2, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9, 9, 10, 10, 11, 12, 13, 13, 13, 13, 14, 15, 16, 16, 16 };
        int[] checkpoint2 = { 13, 16, 10, 15, 19, 20, 6, 12, 7, 9, 10, 15, 16, 19, 6, 13, 14, 15, 16, 17, 18, 19, 20, 10, 13, 20, 12, 14, 19, 9, 10, 17, 16, 17, 18, 19, 20, 11, 14, 18, 18, 15, 18, 19, 20, 20, 16, 18, 19, 20 };
        assertEquals(1572L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case46() {
        int numCheckpoints = 20;
        int[] checkpoint1 = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 10, 10, 11, 11, 12, 13, 14 };
        int[] checkpoint2 = { 2, 3, 6, 8, 9, 12, 14, 16, 17, 19, 20, 4, 5, 17, 12, 13, 17, 8, 12, 13, 14, 17, 18, 20, 6, 8, 15, 16, 19, 8, 9, 11, 14, 18, 11, 12, 20, 11, 16, 17, 18, 12, 18, 14, 17, 13, 19, 14, 17, 19 };
        assertEquals(3119L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case47() {
        int numCheckpoints = 20;
        int[] checkpoint1 = { 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 8, 9, 9, 9, 9, 11, 11, 12, 13, 13, 13, 13, 15, 16, 17 };
        int[] checkpoint2 = { 3, 5, 6, 8, 15, 18, 12, 13, 14, 15, 16, 18, 19, 9, 13, 17, 7, 9, 10, 14, 9, 17, 18, 20, 10, 11, 19, 9, 10, 11, 15, 10, 13, 14, 16, 18, 10, 12, 15, 17, 13, 16, 15, 14, 17, 19, 20, 20, 17, 20 };
        assertEquals(1084L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case48() {
        int numCheckpoints = 20;
        int[] checkpoint1 = { 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 7, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 11, 11, 12, 13, 13, 14, 14, 15, 16, 16 };
        int[] checkpoint2 = { 2, 6, 9, 11, 12, 15, 6, 8, 9, 19, 6, 12, 18, 19, 20, 8, 9, 13, 15, 6, 9, 17, 18, 19, 14, 8, 10, 15, 16, 19, 10, 11, 16, 17, 11, 15, 16, 20, 12, 13, 12, 20, 20, 15, 19, 15, 18, 18, 17, 19 };
        assertEquals(938L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case49() {
        int numCheckpoints = 20;
        int[] checkpoint1 = { 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 6, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 10, 10, 11, 11, 12, 13, 13, 13, 13, 14, 14, 15, 15, 15, 16, 17 };
        int[] checkpoint2 = { 13, 14, 17, 18, 19, 3, 4, 9, 11, 14, 19, 4, 6, 8, 10, 11, 17, 11, 14, 16, 17, 11, 13, 10, 11, 19, 9, 20, 9, 15, 11, 12, 16, 17, 13, 14, 16, 18, 18, 14, 15, 16, 19, 15, 16, 17, 18, 20, 19, 18 };
        assertEquals(1191L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case50() {
        int numCheckpoints = 20;
        int[] checkpoint1 = { 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 8, 8, 8, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 11, 12, 12, 13, 14, 15, 15, 16, 17, 18, 18 };
        int[] checkpoint2 = { 3, 7, 12, 4, 5, 7, 9, 11, 13, 15, 4, 6, 8, 13, 8, 10, 11, 16, 17, 6, 7, 16, 17, 10, 11, 20, 18, 19, 20, 10, 11, 13, 14, 16, 11, 13, 14, 18, 19, 18, 15, 16, 15, 16, 19, 20, 20, 19, 19, 20 };
        assertEquals(971L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case51() {
        int numCheckpoints = 20;
        int[] checkpoint1 = { 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 11, 12, 13, 13, 14, 16, 16, 18 };
        int[] checkpoint2 = { 4, 6, 9, 11, 13, 20, 3, 4, 11, 12, 16, 17, 19, 8, 11, 14, 19, 7, 12, 14, 15, 16, 9, 12, 17, 18, 20, 12, 13, 8, 18, 20, 14, 15, 16, 18, 10, 13, 15, 20, 11, 12, 12, 17, 16, 18, 17, 18, 20, 19 };
        assertEquals(891L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case52() {
        int numCheckpoints = 46;
        int[] checkpoint1 = { 1, 1, 3, 3, 4, 4, 5, 6, 7, 7, 7, 7, 7, 8, 9, 10, 10, 10, 10, 11, 11, 11, 12, 13, 13, 14, 15, 15, 16, 16, 17, 17, 20, 20, 21, 25, 25, 26, 27, 28, 29, 29, 29, 31, 31, 33, 34, 39, 42, 45 };
        int[] checkpoint2 = { 2, 35, 24, 29, 15, 44, 9, 40, 30, 31, 33, 42, 43, 15, 18, 29, 33, 34, 44, 18, 33, 40, 25, 38, 42, 35, 19, 35, 23, 41, 18, 46, 29, 30, 28, 33, 38, 30, 44, 31, 37, 42, 44, 32, 44, 36, 36, 43, 45, 46 };
        assertEquals(267L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case53() {
        int numCheckpoints = 42;
        int[] checkpoint1 = { 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5, 7, 7, 7, 8, 8, 9, 11, 12, 12, 12, 14, 14, 14, 14, 15, 15, 15, 17, 18, 19, 19, 20, 23, 23, 24, 24, 27, 28, 28, 30, 31, 31, 35, 39, 40 };
        int[] checkpoint2 = { 30, 35, 17, 36, 41, 10, 17, 26, 5, 7, 8, 24, 29, 36, 41, 27, 33, 39, 30, 37, 22, 24, 14, 39, 42, 17, 27, 36, 42, 22, 30, 41, 29, 32, 22, 40, 30, 38, 41, 25, 35, 38, 32, 38, 40, 34, 40, 38, 41, 42 };
        assertEquals(294L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case54() {
        int numCheckpoints = 40;
        int[] checkpoint1 = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 7, 8, 9, 10, 10, 10, 10, 11, 11, 12, 12, 12, 12, 13, 14, 14, 14, 15, 16, 17, 17, 17, 19, 21, 21, 22, 25, 26, 27, 28, 28, 28, 30, 30, 36 };
        int[] checkpoint2 = { 31, 34, 40, 3, 20, 21, 25, 31, 19, 8, 17, 30, 32, 38, 24, 31, 19, 33, 18, 30, 36, 40, 32, 36, 15, 22, 31, 39, 15, 16, 28, 37, 24, 26, 24, 31, 35, 38, 27, 29, 31, 26, 34, 30, 29, 30, 39, 33, 38, 40 };
        assertEquals(280L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case55() {
        int numCheckpoints = 36;
        int[] checkpoint1 = { 1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 6, 7, 7, 8, 10, 11, 11, 11, 12, 12, 12, 12, 13, 13, 15, 15, 15, 16, 17, 18, 18, 18, 19, 19, 20, 20, 20, 20, 22, 22, 22, 24, 25, 26, 27, 27, 31 };
        int[] checkpoint2 = { 16, 3, 11, 28, 33, 23, 32, 15, 18, 22, 30, 16, 32, 33, 16, 36, 20, 26, 15, 22, 26, 23, 25, 26, 31, 24, 33, 16, 20, 29, 30, 20, 20, 26, 36, 28, 31, 23, 24, 25, 35, 33, 35, 36, 33, 26, 32, 28, 30, 34 };
        assertEquals(552L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case56() {
        int numCheckpoints = 37;
        int[] checkpoint1 = { 1, 2, 3, 3, 3, 3, 3, 4, 4, 5, 5, 6, 7, 7, 7, 7, 7, 8, 10, 10, 11, 12, 12, 13, 13, 14, 14, 14, 14, 14, 15, 15, 16, 16, 16, 16, 17, 19, 19, 20, 21, 23, 23, 23, 23, 24, 27, 30, 32, 32 };
        int[] checkpoint2 = { 31, 32, 12, 24, 25, 30, 32, 22, 23, 8, 18, 32, 10, 12, 23, 24, 32, 10, 18, 28, 35, 27, 31, 24, 34, 15, 19, 22, 27, 34, 27, 34, 17, 20, 23, 25, 35, 26, 35, 22, 32, 27, 30, 31, 33, 31, 32, 37, 35, 37 };
        assertEquals(619L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case57() {
        int numCheckpoints = 27;
        int[] checkpoint1 = { 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9, 11, 11, 11, 13, 13, 15, 15, 16, 18, 19, 19 };
        int[] checkpoint2 = { 4, 5, 9, 19, 20, 21, 3, 6, 8, 18, 6, 10, 20, 25, 17, 19, 20, 18, 20, 23, 24, 27, 8, 10, 11, 12, 14, 19, 22, 14, 18, 20, 15, 20, 22, 10, 12, 13, 15, 18, 19, 24, 22, 27, 21, 24, 21, 24, 22, 27 };
        assertEquals(984L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case58() {
        int numCheckpoints = 14;
        int[] checkpoint1 = { 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 8, 8, 8, 8, 9, 9, 10, 10, 11, 11, 11, 12 };
        int[] checkpoint2 = { 2, 5, 6, 8, 9, 10, 13, 4, 5, 6, 8, 9, 11, 13, 14, 4, 5, 6, 7, 8, 11, 5, 6, 7, 8, 9, 11, 12, 13, 6, 9, 10, 14, 7, 8, 10, 14, 13, 10, 12, 13, 14, 11, 14, 12, 13, 12, 13, 14, 13 };
        assertEquals(3629L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case59() {
        int numCheckpoints = 26;
        int[] checkpoint1 = { 1, 1, 1, 1, 1, 1, 2, 3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 10, 10, 10, 11, 11, 12, 13, 13, 13, 13, 15, 15, 15, 15, 16, 16, 17, 17, 17, 18, 20, 23 };
        int[] checkpoint2 = { 3, 6, 8, 16, 18, 24, 20, 4, 5, 8, 16, 22, 5, 17, 20, 7, 13, 17, 26, 8, 12, 15, 22, 9, 10, 24, 12, 22, 14, 20, 22, 19, 26, 14, 18, 20, 21, 26, 18, 19, 21, 26, 18, 25, 18, 19, 25, 26, 26, 25 };
        assertEquals(566L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case60() {
        int numCheckpoints = 21;
        int[] checkpoint1 = { 1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 5, 5, 5, 5, 6, 6, 7, 7, 7, 8, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 11, 11, 12, 12, 12, 12, 12, 13, 13, 15, 15, 15, 16, 16, 16, 18, 19 };
        int[] checkpoint2 = { 7, 9, 20, 16, 20, 10, 12, 16, 18, 9, 16, 10, 12, 17, 20, 10, 17, 15, 16, 18, 9, 10, 11, 13, 21, 11, 12, 15, 17, 12, 14, 19, 20, 12, 19, 13, 14, 19, 20, 21, 18, 20, 17, 18, 19, 18, 19, 21, 19, 20 };
        assertEquals(1997L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case61() {
        int numCheckpoints = 23;
        int[] checkpoint1 = { 1, 1, 1, 1, 1, 2, 2, 2, 3, 4, 4, 4, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 10, 10, 10, 11, 11, 12, 12, 12, 12, 13, 13, 14, 15, 15, 15, 16, 16, 16, 17, 17, 18, 18, 20, 21 };
        int[] checkpoint2 = { 5, 10, 12, 18, 22, 4, 17, 19, 9, 13, 15, 22, 15, 9, 11, 12, 13, 21, 8, 16, 17, 20, 9, 19, 20, 17, 12, 14, 23, 17, 18, 15, 18, 19, 21, 21, 23, 16, 16, 21, 23, 18, 19, 23, 19, 21, 20, 23, 21, 23 };
        assertEquals(753L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case62() {
        int numCheckpoints = 38;
        int[] checkpoint1 = { 1, 1, 1, 2, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 6, 7, 8, 8, 8, 9, 10, 11, 12, 13, 13, 14, 14, 14, 15, 16, 16, 18, 18, 18, 19, 19, 19, 20, 21, 22, 22, 22, 22, 23, 26, 28, 28, 30, 33, 34 };
        int[] checkpoint2 = { 7, 22, 23, 27, 19, 24, 8, 13, 29, 32, 35, 37, 20, 25, 19, 10, 12, 16, 22, 19, 38, 38, 31, 19, 36, 30, 32, 33, 32, 21, 32, 23, 29, 32, 20, 21, 34, 37, 37, 31, 33, 34, 37, 27, 34, 31, 33, 34, 37, 36 };
        assertEquals(433L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case63() {
        int numCheckpoints = 45;
        int[] checkpoint1 = { 1, 1, 2, 2, 4, 4, 5, 5, 5, 6, 6, 6, 8, 9, 9, 10, 12, 13, 13, 14, 15, 15, 15, 16, 17, 17, 18, 19, 21, 23, 24, 24, 24, 26, 26, 27, 27, 27, 28, 28, 29, 30, 32, 32, 34, 35, 35, 35, 36, 38 };
        int[] checkpoint2 = { 12, 14, 11, 26, 28, 42, 7, 14, 34, 9, 18, 19, 12, 33, 42, 30, 28, 14, 30, 34, 20, 41, 45, 30, 39, 45, 24, 28, 35, 29, 28, 36, 40, 35, 36, 31, 35, 38, 34, 38, 44, 34, 37, 42, 36, 36, 37, 38, 45, 39 };
        assertEquals(311L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case64() {
        int numCheckpoints = 9;
        int[] checkpoint1 = { 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 7, 7, 8 };
        int[] checkpoint2 = { 2, 3, 4, 5, 6, 7, 8, 9, 3, 4, 5, 6, 7, 8, 9, 4, 5, 6, 7, 8, 9, 5, 6, 7, 8, 9, 6, 7, 8, 9, 7, 8, 9, 8, 9, 9 };
        assertEquals(2344L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case65() {
        int numCheckpoints = 25;
        int[] checkpoint1 = { 1, 1, 1, 1, 1, 2, 3, 3, 4, 4, 5, 5, 6, 6, 6, 7, 7, 8, 8, 8, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 11, 11, 11, 12, 12, 12, 13, 14, 14, 15, 15, 16, 16, 16, 16, 19, 20, 20, 22 };
        int[] checkpoint2 = { 2, 8, 10, 11, 18, 9, 11, 19, 22, 23, 18, 23, 13, 18, 20, 13, 21, 10, 12, 19, 11, 19, 21, 23, 24, 25, 12, 16, 18, 20, 21, 15, 18, 24, 13, 20, 21, 14, 15, 16, 19, 20, 17, 18, 20, 23, 20, 21, 24, 25 };
        assertEquals(888L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case66() {
        int numCheckpoints = 42;
        int[] checkpoint1 = { 1, 1, 2, 2, 2, 2, 4, 4, 5, 6, 6, 8, 8, 8, 8, 8, 9, 10, 10, 11, 11, 12, 12, 13, 13, 13, 14, 15, 16, 16, 16, 16, 16, 17, 17, 17, 18, 18, 19, 21, 21, 22, 23, 24, 27, 28, 29, 32, 35, 39 };
        int[] checkpoint2 = { 25, 30, 20, 30, 36, 40, 27, 34, 25, 27, 32, 12, 19, 27, 36, 39, 11, 15, 24, 16, 18, 24, 30, 15, 18, 31, 30, 25, 18, 29, 31, 33, 42, 28, 38, 42, 25, 30, 42, 28, 42, 41, 37, 41, 37, 36, 31, 35, 42, 41 };
        assertEquals(298L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case67() {
        int numCheckpoints = 7;
        int[] checkpoint1 = { 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5, 5, 6 };
        int[] checkpoint2 = { 2, 3, 4, 5, 6, 7, 3, 4, 5, 6, 7, 4, 5, 6, 7, 5, 6, 7, 6, 7, 7 };
        assertEquals(456L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case68() {
        int numCheckpoints = 33;
        int[] checkpoint1 = { 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 8, 8, 9, 9, 11, 11, 11, 11, 12, 12, 13, 13, 15, 15, 15, 15, 16, 16, 16, 17, 19, 21, 21, 26, 26, 27, 32 };
        int[] checkpoint2 = { 2, 32, 4, 13, 14, 6, 15, 25, 13, 26, 27, 10, 11, 12, 24, 29, 10, 11, 12, 17, 16, 21, 22, 17, 26, 14, 17, 17, 25, 26, 32, 21, 23, 27, 31, 20, 22, 23, 25, 20, 28, 33, 19, 32, 24, 33, 31, 33, 32, 33 };
        assertEquals(372L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case69() {
        int numCheckpoints = 17;
        int[] checkpoint1 = { 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10, 11, 11, 13, 15, 16 };
        int[] checkpoint2 = { 2, 3, 7, 10, 17, 3, 4, 5, 6, 9, 10, 11, 12, 14, 15, 16, 5, 8, 9, 11, 17, 5, 8, 14, 16, 17, 6, 8, 10, 15, 13, 14, 15, 10, 14, 9, 11, 14, 13, 14, 17, 11, 12, 13, 15, 12, 13, 16, 16, 17 };
        assertEquals(5103L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case70() {
        int numCheckpoints = 41;
        int[] checkpoint1 = { 1, 1, 2, 2, 2, 3, 3, 3, 4, 5, 5, 6, 6, 6, 7, 7, 8, 8, 8, 8, 9, 10, 11, 12, 12, 13, 13, 13, 13, 13, 15, 17, 17, 17, 18, 19, 19, 22, 22, 23, 25, 26, 26, 28, 29, 29, 30, 31, 38, 38 };
        int[] checkpoint2 = { 4, 26, 8, 22, 41, 18, 20, 31, 14, 11, 18, 19, 26, 31, 20, 28, 11, 12, 20, 34, 36, 39, 35, 24, 30, 19, 22, 23, 25, 39, 22, 27, 35, 40, 19, 26, 30, 25, 32, 37, 39, 28, 34, 34, 32, 35, 32, 36, 39, 40 };
        assertEquals(265L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case71() {
        int numCheckpoints = 9;
        int[] checkpoint1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] checkpoint2 = { 2, 3, 4, 5, 6, 7, 8, 9, 1 };
        assertEquals(19L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case72() {
        int numCheckpoints = 3;
        int[] checkpoint1 = { 1, 2, 3 };
        int[] checkpoint2 = { 2, 3, 1 };
        assertEquals(8L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case73() {
        int numCheckpoints = 36;
        int[] checkpoint1 = { 13, 24, 24, 20, 31, 16, 10, 36, 34, 32, 28, 5, 20, 29, 23, 2, 14, 4, 9, 5, 19, 21, 8, 1, 26, 27, 25, 15, 22, 30, 30, 6, 11, 7, 2, 35, 13, 29, 4, 12, 33, 18, 13, 14, 17, 35, 3 };
        int[] checkpoint2 = { 10, 15, 27, 1, 29, 11, 5, 18, 33, 1, 9, 2, 31, 6, 19, 10, 33, 18, 6, 27, 3, 22, 4, 12, 31, 30, 34, 16, 7, 24, 3, 28, 15, 21, 22, 8, 26, 20, 14, 32, 25, 17, 35, 8, 36, 26, 23 };
        assertEquals(162L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case74() {
        int numCheckpoints = 3;
        int[] checkpoint1 = { 1, 2, 1 };
        int[] checkpoint2 = { 2, 3, 3 };
        assertEquals(8L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case75() {
        int numCheckpoints = 4;
        int[] checkpoint1 = { 1, 2, 3, 4 };
        int[] checkpoint2 = { 2, 3, 4, 1 };
        assertEquals(9L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case76() {
        int numCheckpoints = 3;
        int[] checkpoint1 = { 1, 1, 2 };
        int[] checkpoint2 = { 2, 3, 3 };
        assertEquals(8L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case77() {
        int numCheckpoints = 5;
        int[] checkpoint1 = { 1, 1, 2, 1, 3, 3, 5, 5, 5, 5 };
        int[] checkpoint2 = { 2, 4, 4, 3, 4, 2, 1, 2, 3, 4 };
        assertEquals(76L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case78() {
        int numCheckpoints = 48;
        int[] checkpoint1 = { 1, 1, 2, 4, 5, 5, 6, 6, 6, 7, 7, 7, 8, 9, 9, 10, 10, 10, 11, 11, 14, 14, 17, 17, 19, 21, 24, 25, 26, 26, 26, 27, 27, 27, 27, 29, 30, 32, 35, 36, 36, 37, 37, 38, 40, 41, 42 };
        int[] checkpoint2 = { 19, 32, 32, 48, 13, 48, 17, 19, 35, 11, 20, 35, 43, 26, 44, 11, 27, 41, 28, 32, 22, 31, 32, 34, 42, 40, 44, 37, 27, 32, 35, 38, 39, 44, 48, 43, 45, 41, 46, 37, 39, 38, 46, 48, 42, 47, 47 };
        assertEquals(264L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case79() {
        int numCheckpoints = 50;
        int[] checkpoint1 = { 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 50, 40, 40, 40, 23, 4, 24, 40, 22, 40, 8, 40, 40, 40, 34, 21, 40, 40, 38, 40, 40, 40, 40, 40, 28, 40, 40, 40, 40, 46, 13, 40, 40, 40, 47, 40, 40 };
        int[] checkpoint2 = { 45, 42, 20, 48, 12, 32, 25, 10, 26, 39, 16, 2, 19, 43, 37, 17, 19, 19, 19, 18, 19, 27, 19, 29, 11, 36, 19, 19, 1, 41, 19, 35, 14, 33, 49, 3, 19, 7, 5, 19, 31, 19, 19, 6, 9, 15, 19, 44, 30 };
        assertEquals(68719493118L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

    @Test
    public void case80() {
        int numCheckpoints = 3;
        int[] checkpoint1 = { 3, 2 };
        int[] checkpoint2 = { 2, 1 };
        assertEquals(4L, penguinsledding.countDesigns(numCheckpoints, checkpoint1, checkpoint2));
    }

}
