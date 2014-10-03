package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class ChopsticksTest {
    Chopsticks chopsticks = new Chopsticks();

    @Test
    public void case1() {
        int[] length = { 5, 5 };
        assertEquals(1, chopsticks.getmax(length));
    }

    @Test
    public void case2() {
        int[] length = { 1, 2, 3, 2, 1, 2, 3, 2, 1 };
        assertEquals(4, chopsticks.getmax(length));
    }

    @Test
    public void case3() {
        int[] length = { 1 };
        assertEquals(0, chopsticks.getmax(length));
    }

    @Test
    public void case4() {
        int[] length = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        assertEquals(0, chopsticks.getmax(length));
    }

    @Test
    public void case5() {
        int[] length = { 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 };
        assertEquals(1, chopsticks.getmax(length));
    }

    @Test
    public void case6() {
        int[] length = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
        assertEquals(25, chopsticks.getmax(length));
    }

    @Test
    public void case7() {
        int[] length = { 100, 57, 5 };
        assertEquals(0, chopsticks.getmax(length));
    }

    @Test
    public void case8() {
        int[] length = { 78, 15, 79, 64, 77, 7, 99, 52 };
        assertEquals(0, chopsticks.getmax(length));
    }

    @Test
    public void case9() {
        int[] length = { 57, 78, 49, 88, 77, 84, 6, 87, 51, 29, 8, 33, 16 };
        assertEquals(0, chopsticks.getmax(length));
    }

    @Test
    public void case10() {
        int[] length = { 65, 16, 44, 8, 64, 25, 36, 35, 36, 64, 30, 33, 15, 66, 85, 88, 89, 36 };
        assertEquals(2, chopsticks.getmax(length));
    }

    @Test
    public void case11() {
        int[] length = { 18, 71, 97, 67, 71, 80, 38, 22, 13, 53, 75, 8, 50, 3, 30, 12, 95, 27, 6, 57, 38, 81, 56 };
        assertEquals(2, chopsticks.getmax(length));
    }

    @Test
    public void case12() {
        int[] length = { 55, 80, 63, 69, 43, 89, 53, 50, 77, 93, 69, 37, 59, 52, 35, 21, 92, 97, 47, 16, 90, 99, 54, 75, 94, 1, 12, 79 };
        assertEquals(1, chopsticks.getmax(length));
    }

    @Test
    public void case13() {
        int[] length = { 100, 86, 70, 93, 94, 22, 19, 36, 89, 43, 31, 99, 27, 98, 32, 66, 49, 31, 46, 52, 15, 17, 34, 75, 79, 72, 37, 24, 46, 32, 37, 56, 27 };
        assertEquals(5, chopsticks.getmax(length));
    }

    @Test
    public void case14() {
        int[] length = { 95, 53, 26, 11, 2, 92, 15, 64, 27, 88, 80, 72, 20, 43, 12, 41, 96, 48, 91, 91, 82, 22, 80, 49, 68, 17, 77, 53, 68, 45, 58, 84, 92, 17, 76, 51, 100, 14 };
        assertEquals(6, chopsticks.getmax(length));
    }

    @Test
    public void case15() {
        int[] length = { 37, 23, 67, 71, 39, 68, 29, 67, 74, 32, 36, 86, 64, 24, 44, 69, 64, 17, 82, 96, 86, 52, 22, 21, 48, 42, 69, 54, 21, 87, 9, 54, 11, 82, 32, 8, 70, 14, 70, 44, 46, 79, 5 };
        assertEquals(10, chopsticks.getmax(length));
    }

    @Test
    public void case16() {
        int[] length = { 73, 56, 44, 60, 37, 98, 74, 18, 18, 52, 33, 26, 71, 6, 25, 56, 31, 100, 77, 42, 39, 77, 91, 38, 1, 8, 57, 4, 57, 9, 59, 57, 74, 70, 40, 19, 55, 55, 90, 12, 66, 99, 97, 91, 57, 72, 70, 87 };
        assertEquals(9, chopsticks.getmax(length));
    }

    @Test
    public void case17() {
        int[] length = { 3, 89, 91, 78, 49, 2, 37, 13, 19, 94, 8, 81, 71, 11, 50, 85, 31, 59, 16, 99, 29, 18, 4, 3, 84, 40, 64, 57, 63, 51, 80, 18, 69, 38, 63, 69, 13, 76, 92, 85, 21, 31, 73, 1, 9, 27, 87, 71, 33, 18 };
        assertEquals(8, chopsticks.getmax(length));
    }

    @Test
    public void case18() {
        int[] length = { 37, 79, 58, 92, 71, 7, 17, 66, 92, 86, 99, 37, 26, 45, 61, 57, 6, 20, 97, 37, 11, 29, 91, 81, 19, 98, 1, 71, 16, 6, 16, 34, 100, 62, 61, 16, 51, 9, 4, 50, 53, 33, 43, 63, 82, 42, 42, 94, 73, 82 };
        assertEquals(8, chopsticks.getmax(length));
    }

    @Test
    public void case19() {
        int[] length = { 67, 92, 45, 45, 84, 77, 17, 75, 5, 53, 91, 61, 94, 42, 92, 53, 79, 28, 78, 17, 79, 44, 97, 75, 60, 72, 80, 96, 29, 89, 62, 86, 6, 9, 63, 57, 5, 32, 51, 37, 55, 84, 9, 14, 85, 73, 62, 1, 48, 96 };
        assertEquals(11, chopsticks.getmax(length));
    }

    @Test
    public void case20() {
        int[] length = { 86, 18, 31, 63, 38, 49, 36, 7, 67, 37, 90, 47, 3, 18, 82, 94, 8, 57, 32, 9, 34, 75, 91, 67, 61, 89, 98, 21, 19, 91, 37, 77, 54, 13, 70, 57, 29, 62, 84, 64, 92, 91, 72, 44, 68, 69, 69, 71, 27, 57 };
        assertEquals(6, chopsticks.getmax(length));
    }

    @Test
    public void case21() {
        int[] length = { 85, 62, 43, 97, 95, 11, 100, 66, 11, 93, 48, 24, 92, 26, 91, 20, 12, 40, 50, 60, 42, 69, 40, 87, 63, 40, 39, 28, 4, 55, 42, 78, 38, 50, 68, 9, 69, 54, 65, 29, 1, 9, 87, 95, 48, 64, 17, 60, 61, 79 };
        assertEquals(10, chopsticks.getmax(length));
    }

    @Test
    public void case22() {
        int[] length = { 41, 68, 29, 45, 59, 17, 65, 67, 18, 53, 99, 18, 28, 100, 94, 86, 90, 52, 5, 25, 21, 58, 32, 28, 39, 16, 71, 97, 84, 3, 82, 35, 48, 60, 59, 96, 33, 32, 100, 38, 98, 95, 62, 20, 85, 10, 14, 15, 31, 34 };
        assertEquals(5, chopsticks.getmax(length));
    }

    @Test
    public void case23() {
        int[] length = { 29, 53, 10, 38, 96, 36, 53, 72, 49, 90, 26, 5, 5, 46, 67, 86, 1, 96, 43, 77, 91, 52, 21, 92, 60, 16, 25, 71, 39, 39, 16, 52, 48, 14, 10, 90, 40, 53, 17, 83, 34, 87, 30, 93, 73, 88, 12, 2, 71, 55 };
        assertEquals(9, chopsticks.getmax(length));
    }

    @Test
    public void case24() {
        int[] length = { 90, 15, 8, 85, 81, 51, 45, 70, 88, 28, 60, 24, 29, 32, 4, 11, 36, 46, 40, 77, 87, 23, 4, 70, 18, 32, 54, 50, 22, 99, 97, 44, 97, 46, 12, 22, 11, 53, 21, 71, 53, 6, 57, 29, 55, 75, 76, 85, 17, 98 };
        assertEquals(10, chopsticks.getmax(length));
    }

    @Test
    public void case25() {
        int[] length = { 80, 38, 92, 44, 67, 71, 2, 58, 47, 23, 12, 94, 42, 92, 5, 67, 3, 35, 34, 17, 68, 44, 73, 62, 52, 69, 82, 12, 21, 5, 6, 59, 28, 98, 88, 3, 70, 72, 10, 85, 91, 45, 70, 85, 36, 5, 40, 54, 47, 68 };
        assertEquals(10, chopsticks.getmax(length));
    }

    @Test
    public void case26() {
        int[] length = { 49, 74, 99, 33, 64, 76, 11, 38, 43, 37, 21, 58, 47, 16, 38, 96, 60, 67, 39, 44, 90, 82, 77, 39, 35, 95, 72, 6, 55, 27, 95, 55, 76, 17, 59, 74, 68, 3, 44, 77, 92, 43, 88, 14, 70, 58, 57, 17, 100, 21 };
        assertEquals(12, chopsticks.getmax(length));
    }

    @Test
    public void case27() {
        int[] length = { 18, 17, 38, 32, 10, 37, 36, 29, 45, 48, 27, 48, 15, 21, 21, 45, 21, 25, 12, 11, 6, 45, 33, 12, 10, 17, 31, 49, 50, 40, 26, 49, 40, 35, 50, 12, 4, 29, 6, 35, 31, 49, 13, 3, 19, 28, 30, 15, 27, 26 };
        assertEquals(16, chopsticks.getmax(length));
    }

    @Test
    public void case28() {
        int[] length = { 30, 3, 26, 21, 3, 21, 30, 6, 26, 3, 30, 21, 11, 6, 3, 30, 3, 30, 11, 11, 11, 41, 41, 30, 21, 30, 41, 26, 3, 21, 21, 11, 26, 41, 26, 30, 26, 3, 11, 6, 26, 6, 30, 3, 30, 41, 21, 11, 3, 41 };
        assertEquals(23, chopsticks.getmax(length));
    }

    @Test
    public void case29() {
        int[] length = { 38, 47, 8, 17, 1, 8, 19, 13, 4, 1, 38, 28, 24, 6, 24, 43, 20, 37, 25, 39, 50, 1, 18, 32, 24, 37, 16, 20, 16, 41, 6, 1, 37, 16, 20, 39, 13, 26, 45, 1, 35, 50, 49, 18, 28, 27, 41, 31, 35, 24 };
        assertEquals(17, chopsticks.getmax(length));
    }

    @Test
    public void case30() {
        int[] length = { 25, 25, 25, 50, 50, 50, 50, 50, 25, 50, 25, 25, 50, 50, 50, 50, 50, 50, 50, 25, 25, 50, 25, 50, 50, 50, 25, 50, 25, 25, 50, 25, 25, 50, 25, 50, 50, 50, 25, 50, 50, 25, 25, 25, 50, 50, 25, 25, 25, 25 };
        assertEquals(24, chopsticks.getmax(length));
    }

    @Test
    public void case31() {
        int[] length = { 42, 11, 49, 35, 17, 15, 38, 15, 41, 29, 23, 17, 31, 31, 13, 27, 32, 50, 1, 4, 9, 28, 44, 35, 1, 49, 5, 14, 26, 47, 26, 48, 2, 5, 5, 42, 43, 21, 17, 36, 6, 31, 2, 39, 50, 11, 28, 4, 21, 41 };
        assertEquals(16, chopsticks.getmax(length));
    }

    @Test
    public void case32() {
        int[] length = { 2, 30, 30, 27, 30, 36, 28, 27, 20, 28, 20, 27, 2, 20, 20, 2, 36, 20, 30, 2, 2, 2, 30, 2, 6, 2, 6, 28, 2, 6, 20, 30, 2, 2, 27, 6, 28, 2, 28, 2, 36, 27, 30, 27, 2, 2, 27, 2, 20, 30 };
        assertEquals(23, chopsticks.getmax(length));
    }

    @Test
    public void case33() {
        int[] length = { 7, 39, 7, 39, 12, 39, 49, 12, 12, 49, 12, 49, 49, 7, 39, 49, 12, 39, 7, 39, 7, 12, 12, 7, 12, 39, 39, 7, 12, 7, 39, 49, 7, 12, 12, 39, 12, 39, 7, 49, 7, 49, 7, 7, 49, 39, 7, 7, 49, 12 };
        assertEquals(24, chopsticks.getmax(length));
    }

    @Test
    public void case34() {
        int[] length = { 32, 31, 11, 4, 11, 47, 22, 47, 27, 47, 11, 34, 27, 47, 38, 47, 39, 33, 34, 4, 38, 18, 4, 47, 33, 37, 31, 32, 4, 38, 11, 11, 34, 37, 38, 32, 31, 49, 48, 32, 48, 48, 22, 33, 31, 32, 1, 39, 38, 31 };
        assertEquals(20, chopsticks.getmax(length));
    }

    @Test
    public void case35() {
        int[] length = { 5, 14, 1, 39, 32, 35, 25, 28, 17, 10, 3, 28, 3, 28, 33, 41, 8, 41, 47, 13, 19, 7, 39, 31, 24, 9, 23, 24, 19, 18, 1, 48, 23, 41, 25, 33, 1, 25, 45, 10, 3, 13, 49, 34, 18, 3, 49, 8, 24, 5 };
        assertEquals(17, chopsticks.getmax(length));
    }

    @Test
    public void case36() {
        int[] length = { 38, 4, 19, 36, 16, 18, 2, 23, 2, 3, 11, 2, 1, 18, 46, 49, 45, 46, 3, 20, 35, 36, 9, 30, 4, 17, 9, 49, 26, 49, 12, 38, 13, 2, 37, 36, 11, 46, 23, 46, 4, 8, 1, 11, 16, 11, 22, 42, 40, 42 };
        assertEquals(17, chopsticks.getmax(length));
    }

    @Test
    public void case37() {
        int[] length = { 13, 13, 9, 13, 13, 13, 9, 13, 9, 9, 13, 13, 13, 13, 13, 13, 13, 9, 9, 13, 13, 13, 13, 9, 9, 9, 13, 9, 13, 13, 13, 13, 9, 9, 13, 13, 13, 13, 9, 9, 9, 9, 9, 13, 13, 9, 13, 13, 13, 9 };
        assertEquals(24, chopsticks.getmax(length));
    }

    @Test
    public void case38() {
        int[] length = { 25, 14, 4, 23, 9, 43, 40, 33, 49, 2, 37, 8, 50, 31, 40, 43, 5, 23, 6, 4, 38, 46, 8, 22, 10, 9, 19, 46, 49, 49, 23, 47, 47, 46, 47, 23, 2, 41, 4, 2, 50, 46, 10, 10, 43, 26, 32, 26, 37, 36 };
        assertEquals(16, chopsticks.getmax(length));
    }

    @Test
    public void case39() {
        int[] length = { 50, 6, 13, 17, 33, 3, 30, 49, 25, 46, 22, 5, 33, 40, 45, 15, 20, 26, 13, 24, 24, 43, 30, 38, 49, 34, 48, 2, 19, 34, 23, 17, 28, 10, 46, 48, 18, 41, 28, 11, 40, 45, 19, 23, 38, 1, 34, 15, 9, 28 };
        assertEquals(16, chopsticks.getmax(length));
    }

    @Test
    public void case40() {
        int[] length = { 33, 21, 4, 20, 23, 43, 12, 32, 10, 36, 5, 25, 5, 42, 31, 9, 16, 50, 45, 8, 1, 23, 29, 4, 22, 6, 48, 45, 4, 30, 34, 5, 12, 21, 11, 2, 49, 22, 6, 18, 13, 35, 41, 32, 48, 7, 36, 15, 16, 25 };
        assertEquals(13, chopsticks.getmax(length));
    }

    @Test
    public void case41() {
        int[] length = { 37, 37, 45, 18, 47, 5, 42, 11, 23, 4, 8, 42, 48, 4, 14, 4, 14, 21, 19, 20, 47, 47, 5, 1, 40, 45, 2, 11, 23, 23, 35, 37, 47, 46, 40, 7, 20, 17, 32, 8, 14, 37, 37, 23, 17, 45, 40, 17, 18, 19 };
        assertEquals(18, chopsticks.getmax(length));
    }

    @Test
    public void case42() {
        int[] length = { 50, 16, 31, 22, 47, 14, 28, 34, 37, 35, 5, 8, 37, 46, 35, 11, 30, 30, 20, 40, 48, 2, 18, 29, 47, 43, 35, 31, 50, 2, 22, 29, 39, 30, 14, 22, 4, 27, 37, 14, 34, 31, 40, 22, 46, 50, 43, 47, 2, 11 };
        assertEquals(16, chopsticks.getmax(length));
    }

    @Test
    public void case43() {
        int[] length = { 7, 7, 23, 37, 23, 26, 8, 35, 49, 40, 24, 23, 34, 49, 24, 37, 25, 35, 40, 37, 49, 23, 18, 17, 37, 34, 40, 37, 23, 46, 34, 49, 35, 46, 48, 11, 17, 7, 17, 17, 23, 17, 37, 8, 48, 17, 7, 18, 18, 17 };
        assertEquals(21, chopsticks.getmax(length));
    }

    @Test
    public void case44() {
        int[] length = { 18, 22, 10, 36, 3, 48, 2, 29, 5, 31, 32, 9, 19, 46, 44, 7, 32, 2, 23, 21, 10, 33, 2, 19, 38, 20, 10, 16, 17, 33, 34, 22, 41, 36, 2, 44, 48, 46, 34, 32, 41, 4, 48, 32, 50, 23, 21, 6, 12, 38 };
        assertEquals(17, chopsticks.getmax(length));
    }

    @Test
    public void case45() {
        int[] length = { 35, 35, 35, 50, 16, 30, 10, 10, 35, 50, 16, 16, 16, 30, 50, 30, 16, 35, 50, 30, 10, 50, 50, 16, 16, 10, 35, 50, 50, 50, 16, 35, 35, 30, 35, 10, 50, 10, 50, 50, 16, 30, 35, 10, 10, 30, 10, 10, 16, 35 };
        assertEquals(24, chopsticks.getmax(length));
    }

    @Test
    public void case46() {
        int[] length = { 5, 3, 45, 37, 47, 45, 33, 17, 17, 22, 15, 5, 2, 1, 32, 47, 20, 1, 15, 22, 22, 37, 1, 33, 15, 45, 32, 33, 1, 15, 22, 45, 40, 28, 32, 33, 17, 45, 5, 20, 17, 28, 20, 28, 40, 37, 1, 22, 33, 15 };
        assertEquals(19, chopsticks.getmax(length));
    }

    @Test
    public void case47() {
        int[] length = { 5, 5 };
        assertEquals(1, chopsticks.getmax(length));
    }

    @Test
    public void case48() {
        int[] length = { 100, 100 };
        assertEquals(1, chopsticks.getmax(length));
    }

    @Test
    public void case49() {
        int[] length = { 85, 97, 96, 85, 97, 95, 96, 90, 91, 80, 93, 83, 98, 100, 88, 95, 88, 84, 99, 98, 94, 94, 87, 83, 80, 87, 88, 100, 95, 83, 89, 83, 98, 80, 85, 85, 99, 85, 92, 93, 83, 85, 96, 85, 87, 84, 91, 93, 99, 92 };
        assertEquals(19, chopsticks.getmax(length));
    }

    @Test
    public void case50() {
        int[] length = { 1, 2, 2, 3 };
        assertEquals(1, chopsticks.getmax(length));
    }

    @Test
    public void case51() {
        int[] length = { 90 };
        assertEquals(0, chopsticks.getmax(length));
    }

    @Test
    public void case52() {
        int[] length = { 9, 47, 57, 62, 82, 9, 5, 52, 6, 28, 9, 8, 15, 55, 98, 26, 54, 45, 56, 47, 51, 30, 61, 82, 55, 65, 99, 69, 39, 99, 58, 79, 62, 93, 12, 50, 99, 35, 55, 94, 11, 68, 18, 33, 42, 10, 16, 82, 38, 100 };
        assertEquals(6, chopsticks.getmax(length));
    }

    @Test
    public void case53() {
        int[] length = { 52, 52, 52, 52, 90, 90, 90 };
        assertEquals(3, chopsticks.getmax(length));
    }

    @Test
    public void case54() {
        int[] length = { 100, 100, 100, 100, 3, 3 };
        assertEquals(3, chopsticks.getmax(length));
    }

    @Test
    public void case55() {
        int[] length = { 100, 100, 100, 100 };
        assertEquals(2, chopsticks.getmax(length));
    }

    @Test
    public void case56() {
        int[] length = { 1, 2, 50, 52, 52, 53, 99, 99, 77, 100, 100 };
        assertEquals(3, chopsticks.getmax(length));
    }

    @Test
    public void case57() {
        int[] length = { 1, 1, 2, 2, 3, 4, 4, 100, 100, 100 };
        assertEquals(4, chopsticks.getmax(length));
    }

    @Test
    public void case58() {
        int[] length = { 60, 60, 60, 60 };
        assertEquals(2, chopsticks.getmax(length));
    }

    @Test
    public void case59() {
        int[] length = { 100 };
        assertEquals(0, chopsticks.getmax(length));
    }

    @Test
    public void case60() {
        int[] length = { 100, 100, 100 };
        assertEquals(1, chopsticks.getmax(length));
    }

    @Test
    public void case61() {
        int[] length = { 2, 3 };
        assertEquals(0, chopsticks.getmax(length));
    }

    @Test
    public void case62() {
        int[] length = { 100, 1 };
        assertEquals(0, chopsticks.getmax(length));
    }

    @Test
    public void case63() {
        int[] length = { 70, 70, 80, 80, 90, 90 };
        assertEquals(3, chopsticks.getmax(length));
    }

    @Test
    public void case64() {
        int[] length = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 99, 94, 73, 77, 77, 87, 88, 87 };
        assertEquals(2, chopsticks.getmax(length));
    }

    @Test
    public void case65() {
        int[] length = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
        assertEquals(25, chopsticks.getmax(length));
    }

    @Test
    public void case66() {
        int[] length = { 80, 90, 90 };
        assertEquals(1, chopsticks.getmax(length));
    }

    @Test
    public void case67() {
        int[] length = { 35, 35, 35, 50, 16, 30, 10, 10, 35, 50, 16, 16, 16, 30, 50, 30, 16, 35, 50, 30, 10, 50, 50, 16, 16, 10, 35, 50, 50, 50, 16, 35, 35, 30, 35, 10, 50, 10, 50, 50, 16, 30, 35, 10, 10, 30, 100, 100, 100, 100 };
        assertEquals(24, chopsticks.getmax(length));
    }

    @Test
    public void case68() {
        int[] length = { 2, 2, 3 };
        assertEquals(1, chopsticks.getmax(length));
    }

    @Test
    public void case69() {
        int[] length = { 100, 100, 67, 90, 78, 60, 100, 80, 90 };
        assertEquals(2, chopsticks.getmax(length));
    }

    @Test
    public void case70() {
        int[] length = { 1, 1, 100, 100 };
        assertEquals(2, chopsticks.getmax(length));
    }

    @Test
    public void case71() {
        int[] length = { 100, 100, 100, 99, 99 };
        assertEquals(2, chopsticks.getmax(length));
    }

    @Test
    public void case72() {
        int[] length = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
        assertEquals(8, chopsticks.getmax(length));
    }

    @Test
    public void case73() {
        int[] length = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
        assertEquals(5, chopsticks.getmax(length));
    }

    @Test
    public void case74() {
        int[] length = { 100, 100, 100, 100, 100 };
        assertEquals(2, chopsticks.getmax(length));
    }

    @Test
    public void case75() {
        int[] length = { 1, 1, 1 };
        assertEquals(1, chopsticks.getmax(length));
    }

    @Test
    public void case76() {
        int[] length = { 2, 3, 2, 100, 100 };
        assertEquals(2, chopsticks.getmax(length));
    }

    @Test
    public void case77() {
        int[] length = { 100, 2, 3, 2, 100, 2, 3, 2, 1 };
        assertEquals(4, chopsticks.getmax(length));
    }

    @Test
    public void case78() {
        int[] length = { 1, 1, 2, 2 };
        assertEquals(2, chopsticks.getmax(length));
    }

    @Test
    public void case79() {
        int[] length = { 1, 2, 4, 3, 3, 3, 3 };
        assertEquals(2, chopsticks.getmax(length));
    }

}
