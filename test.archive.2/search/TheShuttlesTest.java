package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class TheShuttlesTest {
    TheShuttles theshuttles = new TheShuttles();

    @Test
    public void case1() {
        int[] cnt = { 9 };
        int baseCost = 30;
        int seatCost = 5;
        assertEquals(75, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case2() {
        int[] cnt = { 9, 4 };
        int baseCost = 30;
        int seatCost = 5;
        assertEquals(150, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case3() {
        int[] cnt = { 9, 4 };
        int baseCost = 10;
        int seatCost = 5;
        assertEquals(105, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case4() {
        int[] cnt = { 51, 1, 77, 14, 17, 10, 80 };
        int baseCost = 32;
        int seatCost = 40;
        assertEquals(12096, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case5() {
        int[] cnt = { 86, 93, 26, 4, 48, 37, 36, 1, 72, 10, 79, 87, 88, 85, 4, 95, 54, 23, 31, 51 };
        int baseCost = 82;
        int seatCost = 49;
        assertEquals(62553, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case6() {
        int[] cnt = { 51, 71, 54, 58, 50, 65, 27, 52, 39, 28, 10, 38, 30, 97, 26, 24, 58, 57, 20, 28, 2, 8, 2, 58, 39, 32 };
        int baseCost = 83;
        int seatCost = 58;
        assertEquals(74256, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case7() {
        int[] cnt = { 66, 98, 52, 56, 3, 10, 87, 34, 51, 2, 77, 9, 97, 82, 59, 14, 59, 20, 71, 85, 90, 36, 5, 54 };
        int baseCost = 7;
        int seatCost = 12;
        assertEquals(16675, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case8() {
        int[] cnt = { 21, 19, 43, 80, 16, 25, 13, 63, 26, 82, 9, 75, 96, 62, 76, 4, 57, 35, 57, 2, 38, 90, 51, 26, 62, 4, 61, 51, 1, 78, 48, 66, 35, 99, 6, 87, 71, 66, 60, 21, 3 };
        int baseCost = 95;
        int seatCost = 87;
        assertEquals(198428, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case9() {
        int[] cnt = { 97, 26, 94, 25, 82, 26, 56, 100, 75, 66, 36, 2, 47, 2, 75, 15, 25, 32, 71, 33, 83 };
        int baseCost = 45;
        int seatCost = 82;
        assertEquals(100278, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case10() {
        int[] cnt = { 10, 17, 63, 49, 27, 8, 24, 61, 54, 42, 14, 14, 76, 50, 82 };
        int baseCost = 51;
        int seatCost = 41;
        assertEquals(29375, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case11() {
        int[] cnt = { 73, 71, 100, 99, 11, 83, 50, 69, 4, 2, 94, 57 };
        int baseCost = 86;
        int seatCost = 15;
        assertEquals(15213, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case12() {
        int[] cnt = { 9, 19, 92, 10, 65, 74, 83, 57, 69, 78, 53, 18, 51, 23, 60, 46, 85 };
        int baseCost = 75;
        int seatCost = 75;
        assertEquals(78975, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case13() {
        int[] cnt = { 74, 79, 94, 99, 23, 96, 55, 68, 32, 84, 12, 24, 10, 85, 23, 68, 66 };
        int baseCost = 42;
        int seatCost = 69;
        assertEquals(76560, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case14() {
        int[] cnt = { 78, 51, 13, 55, 29, 46, 5 };
        int baseCost = 73;
        int seatCost = 25;
        assertEquals(9460, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case15() {
        int[] cnt = { 90, 17, 37, 92, 40, 59, 35, 66, 20, 52, 26, 54, 1 };
        int baseCost = 98;
        int seatCost = 71;
        assertEquals(51612, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case16() {
        int[] cnt = { 77, 40, 88, 33, 50, 82, 50, 88, 50, 74, 27, 89, 79, 89, 60, 40, 63, 3, 99, 92, 35, 97, 90, 55, 50, 62, 42, 69, 90, 93, 50, 30, 45, 50, 18, 75, 4, 34, 52, 11, 40, 62, 90, 42, 20 };
        int baseCost = 19;
        int seatCost = 75;
        assertEquals(207638, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case17() {
        int[] cnt = { 3, 62, 66, 70, 10, 11, 79, 80, 96, 98, 18, 38, 43, 44, 15, 97, 3, 66, 31, 3, 48, 1, 10, 53, 39, 76, 11, 63, 63, 70, 61, 63, 6, 1, 64, 32, 15, 87, 66, 92, 23, 9, 46, 22, 3, 22, 20, 92, 2 };
        int baseCost = 48;
        int seatCost = 65;
        assertEquals(159467, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case18() {
        int[] cnt = { 22, 49, 54, 93, 39, 15, 58, 67, 92, 47, 45, 17, 99, 94, 69, 58, 27, 21, 66, 52, 83, 48, 39, 19, 10, 60, 40, 31, 15, 58, 24, 36, 55, 75, 19, 74, 53, 30, 11, 17, 59, 96 };
        int baseCost = 78;
        int seatCost = 78;
        assertEquals(188604, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case19() {
        int[] cnt = { 94, 40, 76, 95, 29, 5, 5 };
        int baseCost = 37;
        int seatCost = 47;
        assertEquals(18585, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case20() {
        int[] cnt = { 90, 72, 70, 75, 24, 52, 63, 51, 56, 56, 15, 88, 19, 44, 18, 4, 18, 45, 96, 75, 31, 93, 3, 23, 32, 85, 57, 28, 93, 23, 24, 69, 64 };
        int baseCost = 28;
        int seatCost = 42;
        assertEquals(79352, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case21() {
        int[] cnt = { 45, 13, 95, 31, 58, 72, 9, 94, 64, 92, 64, 53, 24, 97, 9, 56, 56, 35, 34, 39, 80 };
        int baseCost = 93;
        int seatCost = 86;
        assertEquals(113625, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case22() {
        int[] cnt = { 10, 61, 6, 78, 71, 71, 2, 94, 82, 51, 97, 69, 3, 1, 1, 70, 99, 75, 59 };
        int baseCost = 12;
        int seatCost = 100;
        assertEquals(106080, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case23() {
        int[] cnt = { 36, 98, 15, 80, 85, 90, 29, 5, 58, 96, 10, 10, 62, 72, 20, 59, 62, 64, 37, 14, 91, 58, 21, 31, 75, 90, 5, 25 };
        int baseCost = 83;
        int seatCost = 25;
        assertEquals(47334, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case24() {
        int[] cnt = { 33, 84, 93, 94, 10, 29, 88, 28, 10, 78, 32, 70, 58, 73, 1, 15, 86, 20, 17, 39, 2, 6, 72, 53, 62, 79, 5, 11, 69, 13, 88, 1, 100, 99, 27, 45, 38, 26, 63, 17, 17, 64, 34, 30, 77, 46 };
        int baseCost = 56;
        int seatCost = 100;
        assertEquals(241824, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case25() {
        int[] cnt = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
        int baseCost = 100;
        int seatCost = 100;
        assertEquals(505000, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case26() {
        int[] cnt = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
        int baseCost = 44;
        int seatCost = 48;
        assertEquals(242200, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case27() {
        int[] cnt = { 32, 70, 98, 72, 51, 87, 49, 41, 85, 75, 52, 40, 72, 23, 15, 15, 94, 60, 70, 54, 20, 98, 84, 87, 65, 54, 53, 98, 98, 99, 68, 3, 49, 54, 12, 69, 19, 9, 45, 55, 36, 43, 1, 20, 62, 54, 32, 21 };
        int baseCost = 78;
        int seatCost = 68;
        assertEquals(206500, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case28() {
        int[] cnt = { 91, 69, 33, 83, 74, 20, 40, 62, 17, 63, 17, 34, 28, 93, 20, 99, 89, 44, 50, 26, 57, 11, 69, 41, 40, 28, 83, 7, 8, 52, 61, 1, 24, 69, 61, 62, 14, 18, 60, 60 };
        int baseCost = 27;
        int seatCost = 56;
        assertEquals(118158, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case29() {
        int[] cnt = { 96, 13, 79, 49, 25, 77, 17, 94, 97, 38, 65, 12, 33, 50, 70, 83, 93, 22, 57, 19, 66, 58, 13, 81, 34, 28, 59, 49, 1, 54, 86, 52, 88, 17, 40, 50, 14, 6, 11, 58, 12, 63 };
        int baseCost = 60;
        int seatCost = 47;
        assertEquals(116316, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case30() {
        int[] cnt = { 36, 67, 65, 42, 63, 74, 37, 89, 89, 1, 32, 39, 96, 18, 59, 57, 40, 100, 28, 49, 54, 29, 28, 7, 53, 74, 3, 71, 46, 26, 22, 59, 56, 93, 66, 7, 38, 92, 2, 83, 88, 10, 100 };
        int baseCost = 32;
        int seatCost = 20;
        assertEquals(54752, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case31() {
        int[] cnt = { 70, 96, 35, 31, 84, 1, 89, 99, 27, 67, 92, 70, 90, 26, 76, 89, 13, 49, 46, 64, 47, 71, 27, 64, 41, 84, 60, 95, 88, 66, 54, 14, 18, 45, 30, 28, 35, 46, 10, 32, 98, 70, 12, 1, 12, 23 };
        int baseCost = 78;
        int seatCost = 13;
        assertEquals(46371, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case32() {
        int[] cnt = { 31, 95, 47, 45, 67, 86, 63, 14, 40, 37, 18, 78, 21, 37, 76, 20, 64, 27, 100, 13, 74, 30, 81, 77, 58, 80, 33, 15, 7, 39, 35, 18, 51, 28, 6, 33, 79, 28, 10, 4, 64, 31, 22, 58, 33, 67 };
        int baseCost = 34;
        int seatCost = 64;
        assertEquals(149604, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case33() {
        int[] cnt = { 19, 100, 22, 56, 30, 35, 91, 20, 28, 98, 85, 93, 53, 35, 27, 58, 4, 10, 71, 23, 80, 12, 96, 13, 72, 43, 5, 35, 81, 40, 16, 5, 66, 100, 30, 9, 86, 80, 36, 25, 41, 70 };
        int baseCost = 65;
        int seatCost = 21;
        assertEquals(57230, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case34() {
        int[] cnt = { 28, 17, 9, 1, 83, 65, 12, 98, 85, 25, 17, 97, 83, 43, 11, 54, 39, 86, 58, 58, 7, 34, 94, 22, 36, 70, 7, 46, 44, 52, 62, 80, 36, 18, 100, 45, 5, 34, 13, 21, 40, 8, 13, 41, 69 };
        int baseCost = 42;
        int seatCost = 65;
        assertEquals(147972, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case35() {
        int[] cnt = { 51, 99, 54, 29, 55, 40, 50, 36, 18, 97, 89, 91, 81, 22, 25, 35, 22, 22, 86, 12, 32, 18, 59, 18, 26, 88, 97, 67, 28, 87, 62, 5, 43, 41, 4, 88, 24, 23, 65, 88 };
        int baseCost = 47;
        int seatCost = 87;
        assertEquals(194220, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case36() {
        int[] cnt = { 89, 89, 80, 18, 25, 53, 95, 30, 61, 61, 53, 47, 12, 15, 63, 53, 72, 10, 73, 20, 16, 69, 92, 69, 12, 42, 42, 78, 15, 52, 71, 23, 74, 70, 33, 27, 76, 16, 8, 31, 10, 86, 80, 63, 43, 25, 14, 69 };
        int baseCost = 66;
        int seatCost = 67;
        assertEquals(183975, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case37() {
        int[] cnt = { 73, 21, 24, 56, 5, 15, 8, 87, 38, 86, 63, 77, 16, 31, 72, 13, 17, 98, 95, 40, 74, 71, 46, 84, 31, 37, 20, 50, 2, 25, 79, 86, 13, 20, 8, 53, 46, 21, 53, 67, 8, 47, 75, 79, 67, 56, 43, 27 };
        int baseCost = 50;
        int seatCost = 100;
        assertEquals(249900, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case38() {
        int[] cnt = { 3, 87, 7, 99, 53, 16, 1, 66, 67, 47, 93, 39, 12, 42, 56, 43, 83, 65, 61, 50, 21, 28, 36, 52, 59, 8, 47, 24, 27, 17, 20, 39, 65, 71, 16, 89, 90, 54, 94, 91, 74, 74, 76, 62, 26 };
        int baseCost = 2;
        int seatCost = 21;
        assertEquals(49660, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case39() {
        int[] cnt = { 69, 70, 74, 38, 47, 68, 25, 45, 37, 48, 9, 62, 38, 23, 51, 46, 34, 90, 67, 4, 79, 59, 8, 7, 42, 37, 53, 18, 67, 43, 3, 95, 92, 52, 45, 70, 73, 96, 35, 60, 93, 14, 91, 81, 71, 38 };
        int baseCost = 22;
        int seatCost = 61;
        assertEquals(160557, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case40() {
        int[] cnt = { 47, 33, 83, 94, 18, 100, 8, 94, 56, 12, 97, 36, 40, 65, 65, 25, 11, 89, 64, 83, 63, 10, 84, 80, 74, 77, 91, 90, 62, 6, 11, 35, 41, 14, 85, 91, 98, 33, 18, 49, 64, 71, 6, 87, 86, 9, 65, 80, 73 };
        int baseCost = 59;
        int seatCost = 42;
        assertEquals(140360, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case41() {
        int[] cnt = { 84, 39, 42, 69, 7, 22, 65, 54, 21, 99, 58, 70, 31, 9, 5, 63, 61, 88, 92, 38, 100, 50, 91, 67, 37, 2, 47, 12, 99, 86, 70, 5, 89, 14, 63, 28, 8, 34, 52, 41, 86, 98, 63, 14, 82, 92, 56, 67, 62, 17 };
        int baseCost = 24;
        int seatCost = 63;
        assertEquals(184605, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case42() {
        int[] cnt = { 1, 23, 31, 37, 70, 45, 63, 50, 62, 57, 18, 8, 22, 10, 35, 68, 15, 43, 41, 22, 31, 74, 82, 17, 48, 26, 14, 18, 10, 16, 100, 93, 13, 39, 73, 20, 20, 9, 56, 9, 47, 49, 33, 16, 67, 62, 27, 89 };
        int baseCost = 81;
        int seatCost = 99;
        assertEquals(222768, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case43() {
        int[] cnt = { 57, 71, 81, 69, 21, 57, 91, 83, 60, 71, 72, 67, 64, 95, 6, 65, 23, 60, 61, 29, 94, 65, 79, 98, 15, 38, 99, 62, 59, 26, 56, 78, 91, 58, 14, 18, 24, 56, 94, 68, 25, 18 };
        int baseCost = 100;
        int seatCost = 78;
        assertEquals(227920, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case44() {
        int[] cnt = { 11, 30, 26, 12, 7, 61, 55, 60, 22, 79, 59, 28, 59, 53, 80, 14, 9, 87, 17, 68, 70, 25, 13, 91, 96, 97, 23, 15, 26, 98, 73, 21, 19, 44, 71, 84, 43, 59, 73, 72, 11, 73, 9, 27, 43, 51, 69 };
        int baseCost = 39;
        int seatCost = 47;
        assertEquals(122760, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case45() {
        int[] cnt = { 80, 91, 77, 75, 25, 19, 7, 98, 63, 76, 100, 25, 52, 37, 42, 9, 86, 57, 31, 15, 49, 67, 24, 58, 18, 90, 25, 34, 3, 60, 94, 14, 12, 92, 39, 75, 60, 34, 98, 90 };
        int baseCost = 5;
        int seatCost = 43;
        assertEquals(95260, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case46() {
        int[] cnt = { 27, 5, 35, 31, 24, 7, 98, 38, 15, 94, 88, 69, 82, 22, 95, 82, 100, 37, 85, 81, 39, 11, 42, 33, 9, 87, 28, 37, 48, 88, 28, 90, 68, 81, 98, 23, 28, 77, 98, 73, 48 };
        int baseCost = 16;
        int seatCost = 25;
        assertEquals(64176, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case47() {
        int[] cnt = { 51, 1, 77, 14, 17, 10, 80, 20, 11 };
        int baseCost = 32;
        int seatCost = 40;
        assertEquals(13688, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case48() {
        int[] cnt = { 51, 1, 77, 14, 17, 10, 80 };
        int baseCost = 32;
        int seatCost = 40;
        assertEquals(12096, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case49() {
        int[] cnt = { 1 };
        int baseCost = 1;
        int seatCost = 1;
        assertEquals(2, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case50() {
        int[] cnt = { 5, 6 };
        int baseCost = 1;
        int seatCost = 100;
        assertEquals(1111, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case51() {
        int[] cnt = { 9 };
        int baseCost = 30;
        int seatCost = 5;
        assertEquals(75, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case52() {
        int[] cnt = { 100, 100 };
        int baseCost = 23;
        int seatCost = 26;
        assertEquals(5246, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case53() {
        int[] cnt = { 9, 4 };
        int baseCost = 15;
        int seatCost = 100;
        assertEquals(1495, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case54() {
        int[] cnt = { 100 };
        int baseCost = 100;
        int seatCost = 1;
        assertEquals(200, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case55() {
        int[] cnt = { 9, 4 };
        int baseCost = 10;
        int seatCost = 5;
        assertEquals(105, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case56() {
        int[] cnt = { 100 };
        int baseCost = 100;
        int seatCost = 100;
        assertEquals(10100, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case57() {
        int[] cnt = { 1, 1, 1 };
        int baseCost = 1;
        int seatCost = 1;
        assertEquals(6, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case58() {
        int[] cnt = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
        int baseCost = 100;
        int seatCost = 100;
        assertEquals(505000, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case59() {
        int[] cnt = { 99, 99, 99, 99, 99 };
        int baseCost = 40;
        int seatCost = 40;
        assertEquals(20000, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case60() {
        int[] cnt = { 1, 1, 1, 1, 99 };
        int baseCost = 50;
        int seatCost = 5;
        assertEquals(1350, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case61() {
        int[] cnt = { 6, 9 };
        int baseCost = 1;
        int seatCost = 50;
        assertEquals(755, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case62() {
        int[] cnt = { 100, 99 };
        int baseCost = 100;
        int seatCost = 100;
        assertEquals(20200, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case63() {
        int[] cnt = { 9, 4 };
        int baseCost = 30;
        int seatCost = 5;
        assertEquals(150, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case64() {
        int[] cnt = { 11, 4 };
        int baseCost = 1;
        int seatCost = 100;
        assertEquals(1515, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case65() {
        int[] cnt = { 98, 99, 100 };
        int baseCost = 1;
        int seatCost = 100;
        assertEquals(29949, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case66() {
        int[] cnt = { 12, 20 };
        int baseCost = 1;
        int seatCost = 10;
        assertEquals(328, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case67() {
        int[] cnt = { 5, 1, 1, 1 };
        int baseCost = 1;
        int seatCost = 2;
        assertEquals(24, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case68() {
        int[] cnt = { 9, 3 };
        int baseCost = 1;
        int seatCost = 20;
        assertEquals(244, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case69() {
        int[] cnt = { 99 };
        int baseCost = 100;
        int seatCost = 1;
        assertEquals(199, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case70() {
        int[] cnt = { 9, 4 };
        int baseCost = 1;
        int seatCost = 5;
        assertEquals(77, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case71() {
        int[] cnt = { 100 };
        int baseCost = 1;
        int seatCost = 1;
        assertEquals(101, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case72() {
        int[] cnt = { 51 };
        int baseCost = 30;
        int seatCost = 5;
        assertEquals(285, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case73() {
        int[] cnt = { 40, 50 };
        int baseCost = 1;
        int seatCost = 100;
        assertEquals(9009, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case74() {
        int[] cnt = { 9, 6 };
        int baseCost = 1;
        int seatCost = 5;
        assertEquals(80, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case75() {
        int[] cnt = { 100 };
        int baseCost = 50;
        int seatCost = 5;
        assertEquals(550, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case76() {
        int[] cnt = { 51 };
        int baseCost = 1;
        int seatCost = 3;
        assertEquals(154, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case77() {
        int[] cnt = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 100 };
        int baseCost = 50;
        int seatCost = 50;
        assertEquals(8500, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case78() {
        int[] cnt = { 6, 9 };
        int baseCost = 1;
        int seatCost = 100;
        assertEquals(1505, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case79() {
        int[] cnt = { 1, 2, 3, 5, 7, 11, 13, 15, 17, 23, 27, 31, 37 };
        int baseCost = 90;
        int seatCost = 10;
        assertEquals(4680, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case80() {
        int[] cnt = { 1, 1 };
        int baseCost = 1;
        int seatCost = 1;
        assertEquals(4, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case81() {
        int[] cnt = { 100 };
        int baseCost = 1;
        int seatCost = 3;
        assertEquals(301, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case82() {
        int[] cnt = { 9, 4, 27, 30, 10, 15 };
        int baseCost = 1;
        int seatCost = 5;
        assertEquals(520, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case83() {
        int[] cnt = { 99 };
        int baseCost = 10;
        int seatCost = 1;
        assertEquals(109, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case84() {
        int[] cnt = { 2, 3, 4 };
        int baseCost = 2;
        int seatCost = 9;
        assertEquals(99, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case85() {
        int[] cnt = { 100 };
        int baseCost = 100;
        int seatCost = 5;
        assertEquals(600, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case86() {
        int[] cnt = { 21, 22, 87, 12, 24 };
        int baseCost = 5;
        int seatCost = 10;
        assertEquals(1870, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case87() {
        int[] cnt = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
        int baseCost = 100;
        int seatCost = 100;
        assertEquals(404000, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case88() {
        int[] cnt = { 100, 100, 100, 100 };
        int baseCost = 30;
        int seatCost = 5;
        assertEquals(2120, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

    @Test
    public void case89() {
        int[] cnt = { 49, 2, 77, 15, 17, 11, 79 };
        int baseCost = 1;
        int seatCost = 40;
        assertEquals(10250, theshuttles.getLeastCost(cnt, baseCost, seatCost));
    }

}
