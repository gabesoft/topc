package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class KeyDungeonDiv2Test {
    KeyDungeonDiv2 keydungeondiv2 = new KeyDungeonDiv2();

    @Test
    public void case1() {
        int[] doorR = { 2, 0, 5, 3 };
        int[] doorG = { 1, 4, 0, 2 };
        int[] keys = { 2, 3, 1 };
        assertEquals(3, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case2() {
        int[] doorR = { 0, 1, 2, 0 };
        int[] doorG = { 0, 2, 3, 1 };
        int[] keys = { 0, 0, 0 };
        assertEquals(1, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case3() {
        int[] doorR = { 3, 5, 4, 2, 8 };
        int[] doorG = { 4, 2, 3, 8, 1 };
        int[] keys = { 0, 0, 10 };
        assertEquals(5, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case4() {
        int[] doorR = { 4, 5, 4, 6, 8 };
        int[] doorG = { 2, 1, 2, 3, 5 };
        int[] keys = { 1, 2, 1 };
        assertEquals(0, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case5() {
        int[] doorR = { 41, 44, 41, 57, 58, 74, 84, 100, 58, 2, 43, 32, 82, 97, 44, 13, 35, 98, 96, 81, 43, 77, 18, 51, 27, 27, 39, 39, 45, 82, 59, 20, 28, 93, 6, 39, 64, 78, 28, 85, 17, 56, 3, 68, 4, 0, 36, 80, 41, 77 };
        int[] doorG = { 67, 15, 53, 36, 88, 29, 26, 57, 68, 99, 97, 27, 51, 70, 3, 49, 65, 75, 35, 92, 66, 0, 23, 96, 38, 86, 98, 31, 26, 75, 30, 2, 92, 78, 100, 99, 38, 26, 85, 74, 77, 15, 16, 48, 100, 88, 55, 93, 99, 54 };
        int[] keys = { 39, 31, 34 };
        assertEquals(17, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case6() {
        int[] doorR = { 1 };
        int[] doorG = { 7 };
        int[] keys = { 10, 4, 8 };
        assertEquals(1, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case7() {
        int[] doorR = { 69 };
        int[] doorG = { 88 };
        int[] keys = { 98, 28, 78 };
        assertEquals(1, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case8() {
        int[] doorR = { 6, 8 };
        int[] doorG = { 3, 0 };
        int[] keys = { 4, 11, 10 };
        assertEquals(2, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case9() {
        int[] doorR = { 17, 97 };
        int[] doorG = { 81, 12 };
        int[] keys = { 53, 4, 48 };
        assertEquals(0, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case10() {
        int[] doorR = { 9, 7, 1 };
        int[] doorG = { 10, 4, 7 };
        int[] keys = { 15, 6, 6 };
        assertEquals(3, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case11() {
        int[] doorR = { 14, 3, 64 };
        int[] doorG = { 47, 95, 98 };
        int[] keys = { 26, 32, 79 };
        assertEquals(2, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case12() {
        int[] doorR = { 1, 7, 9, 2 };
        int[] doorG = { 9, 3, 6, 7 };
        int[] keys = { 2, 9, 5 };
        assertEquals(3, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case13() {
        int[] doorR = { 53, 55, 46, 96 };
        int[] doorG = { 51, 39, 65, 85 };
        int[] keys = { 43, 42, 95 };
        assertEquals(3, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case14() {
        int[] doorR = { 7, 0, 2, 10, 9 };
        int[] doorG = { 3, 3, 6, 10, 5 };
        int[] keys = { 15, 6, 1 };
        assertEquals(4, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case15() {
        int[] doorR = { 45, 29, 1, 67, 61 };
        int[] doorG = { 13, 33, 86, 31, 2 };
        int[] keys = { 39, 33, 90 };
        assertEquals(5, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case16() {
        int[] doorR = { 0, 2, 1, 8, 2, 7 };
        int[] doorG = { 5, 10, 1, 4, 7, 10 };
        int[] keys = { 9, 8, 2 };
        assertEquals(6, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case17() {
        int[] doorR = { 0, 8, 100, 17, 49, 40 };
        int[] doorG = { 48, 99, 92, 34, 28, 94 };
        int[] keys = { 49, 60, 62 };
        assertEquals(5, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case18() {
        int[] doorR = { 7, 1, 1, 5, 10, 3, 6 };
        int[] doorG = { 1, 3, 5, 6, 2, 8, 4 };
        int[] keys = { 10, 14, 13 };
        assertEquals(7, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case19() {
        int[] doorR = { 33, 16, 22, 94, 67, 98, 49 };
        int[] doorG = { 67, 86, 100, 80, 40, 47, 0 };
        int[] keys = { 96, 75, 62 };
        assertEquals(7, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case20() {
        int[] doorR = { 8, 10, 9, 5, 3, 10, 4, 10 };
        int[] doorG = { 6, 1, 5, 0, 2, 4, 2, 6 };
        int[] keys = { 0, 14, 7 };
        assertEquals(3, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case21() {
        int[] doorR = { 75, 7, 96, 29, 11, 3, 66, 11 };
        int[] doorG = { 84, 60, 83, 13, 12, 75, 4, 34 };
        int[] keys = { 23, 15, 45 };
        assertEquals(5, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case22() {
        int[] doorR = { 8, 2, 7, 5, 8, 4, 10, 1, 2 };
        int[] doorG = { 9, 5, 1, 3, 3, 7, 7, 1, 4 };
        int[] keys = { 12, 13, 17 };
        assertEquals(9, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case23() {
        int[] doorR = { 41, 39, 82, 52, 0, 93, 54, 29, 68 };
        int[] doorG = { 61, 32, 74, 83, 37, 6, 87, 60, 57 };
        int[] keys = { 85, 62, 36 };
        assertEquals(9, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case24() {
        int[] doorR = { 2, 8, 1, 5, 1, 0, 1, 6, 4, 9 };
        int[] doorG = { 1, 5, 2, 9, 10, 3, 8, 7, 7, 7 };
        int[] keys = { 4, 9, 6 };
        assertEquals(10, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case25() {
        int[] doorR = { 81, 31, 51, 96, 77, 90, 64, 84, 60, 78 };
        int[] doorG = { 68, 99, 21, 83, 35, 61, 12, 31, 5, 54 };
        int[] keys = { 100, 38, 27 };
        assertEquals(7, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case26() {
        int[] doorR = { 7, 1, 5, 9, 0, 1, 2, 1, 5, 1 };
        int[] doorG = { 0, 7, 10, 2, 8, 9, 10, 7, 1, 1 };
        int[] keys = { 4, 3, 1 };
        assertEquals(2, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case27() {
        int[] doorR = { 6, 6, 0, 2, 8, 8, 5, 5, 3, 4 };
        int[] doorG = { 7, 6, 4, 7, 8, 0, 9, 5, 3, 3 };
        int[] keys = { 4, 7, 8 };
        assertEquals(10, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case28() {
        int[] doorR = { 9, 4, 7, 8, 8, 3, 3, 3, 3, 7 };
        int[] doorG = { 6, 8, 10, 2, 7, 5, 10, 8, 4, 1 };
        int[] keys = { 15, 8, 7 };
        assertEquals(10, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case29() {
        int[] doorR = { 1, 8, 3, 7, 5, 10, 9, 8, 8, 0 };
        int[] doorG = { 6, 1, 6, 9, 8, 0, 5, 6, 7, 0 };
        int[] keys = { 10, 12, 19 };
        assertEquals(10, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case30() {
        int[] doorR = { 11, 28, 93, 40, 64, 70, 22, 64, 85, 25 };
        int[] doorG = { 78, 71, 49, 20, 7, 72, 16, 28, 26, 35 };
        int[] keys = { 36, 34, 25 };
        assertEquals(3, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case31() {
        int[] doorR = { 22, 59, 86, 93, 38, 66, 99, 55, 13, 80 };
        int[] doorG = { 56, 20, 71, 21, 58, 24, 61, 45, 14, 50 };
        int[] keys = { 0, 0, 17 };
        assertEquals(0, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case32() {
        int[] doorR = { 63, 90, 94, 48, 59, 92, 39, 64, 2, 57 };
        int[] doorG = { 80, 74, 82, 55, 62, 54, 13, 0, 2, 61 };
        int[] keys = { 40, 25, 43 };
        assertEquals(4, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case33() {
        int[] doorR = { 84, 87, 14, 59, 11, 6, 14, 70, 10, 29 };
        int[] doorG = { 73, 5, 67, 6, 20, 98, 95, 5, 65, 36 };
        int[] keys = { 75, 50, 98 };
        assertEquals(10, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case34() {
        int[] doorR = { 13, 64, 100, 88, 44, 59, 88, 0, 21, 79 };
        int[] doorG = { 22, 22, 74, 15, 40, 21, 63, 22, 77, 1 };
        int[] keys = { 55, 94, 25 };
        assertEquals(7, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case35() {
        int[] doorR = { 5, 51, 94, 17, 52, 42, 59, 10, 29, 45 };
        int[] doorG = { 9, 23, 79, 80, 90, 90, 7, 76, 69, 38 };
        int[] keys = { 93, 7, 12 };
        assertEquals(2, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case36() {
        int[] doorR = { 1, 8, 3, 4, 3, 0, 0, 4, 0, 1, 6, 9, 1, 3, 3, 3, 10, 2, 3, 8 };
        int[] doorG = { 0, 3, 0, 0, 9, 1, 4, 8, 2, 4, 5, 10, 2, 8, 2, 4, 8, 1, 5, 5 };
        int[] keys = { 4, 8, 3 };
        assertEquals(16, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case37() {
        int[] doorR = { 10, 2, 6, 0, 1, 1, 7, 7, 9, 2, 1, 10, 10, 4, 0, 10, 7, 3, 2, 5 };
        int[] doorG = { 5, 5, 0, 9, 3, 4, 2, 0, 2, 3, 7, 0, 2, 4, 9, 3, 3, 1, 7, 2 };
        int[] keys = { 5, 6, 0 };
        assertEquals(7, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case38() {
        int[] doorR = { 1, 4, 9, 0, 0, 8, 3, 5, 3, 1, 9, 1, 10, 9, 2, 4, 0, 3, 8, 4 };
        int[] doorG = { 3, 9, 4, 3, 2, 10, 2, 10, 7, 0, 3, 7, 6, 1, 9, 4, 1, 2, 0, 4 };
        int[] keys = { 14, 5, 12 };
        assertEquals(20, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case39() {
        int[] doorR = { 7, 10, 9, 0, 2, 3, 2, 2, 5, 10, 9, 7, 5, 9, 1, 2, 10, 3, 9, 4 };
        int[] doorG = { 3, 3, 7, 0, 5, 6, 6, 2, 9, 9, 3, 2, 5, 0, 7, 1, 9, 9, 1, 7 };
        int[] keys = { 13, 4, 9 };
        assertEquals(20, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case40() {
        int[] doorR = { 81, 7, 27, 18, 28, 97, 30, 48, 25, 18, 88, 65, 97, 60, 71, 1, 5, 94, 44, 71 };
        int[] doorG = { 61, 7, 11, 52, 71, 58, 97, 32, 66, 60, 37, 99, 84, 58, 58, 90, 51, 50, 54, 86 };
        int[] keys = { 1, 8, 50 };
        assertEquals(3, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case41() {
        int[] doorR = { 49, 31, 18, 43, 44, 28, 51, 79, 16, 71, 66, 62, 18, 60, 18, 25, 3, 38, 63, 32 };
        int[] doorG = { 97, 44, 73, 91, 73, 11, 62, 54, 43, 72, 46, 9, 42, 95, 35, 85, 25, 74, 33, 75 };
        int[] keys = { 12, 43, 30 };
        assertEquals(6, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case42() {
        int[] doorR = { 63, 26, 42, 79, 78, 14, 70, 26, 8, 97, 23, 56, 14, 18, 23, 91, 98, 43, 14, 1 };
        int[] doorG = { 10, 33, 36, 13, 66, 15, 40, 34, 90, 100, 0, 54, 77, 81, 58, 100, 3, 52, 56, 53 };
        int[] keys = { 23, 16, 6 };
        assertEquals(2, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case43() {
        int[] doorR = { 97, 46, 75, 56, 91, 24, 22, 90, 79, 7, 52, 3, 50, 93, 39, 27, 73, 52, 43, 44 };
        int[] doorG = { 58, 17, 13, 85, 76, 78, 50, 11, 22, 15, 20, 53, 70, 69, 28, 4, 85, 41, 10, 93 };
        int[] keys = { 18, 26, 65 };
        assertEquals(12, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case44() {
        int[] doorR = { 77, 49, 21, 41, 86, 9, 64, 33, 37, 68, 73, 96, 66, 3, 42, 70, 44, 0, 75, 21 };
        int[] doorG = { 73, 38, 23, 95, 31, 64, 74, 57, 91, 24, 83, 42, 10, 44, 27, 51, 6, 92, 74, 48 };
        int[] keys = { 7, 20, 75 };
        assertEquals(11, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case45() {
        int[] doorR = { 36, 19, 21, 35, 78, 97, 21, 42, 19, 4, 30, 21, 43, 94, 77, 83, 86, 60, 51, 44 };
        int[] doorG = { 49, 14, 12, 68, 56, 62, 69, 27, 55, 41, 26, 63, 55, 12, 9, 63, 26, 17, 34, 15 };
        int[] keys = { 38, 76, 15 };
        assertEquals(13, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case46() {
        int[] doorR = { 6, 10, 9, 10, 10, 7, 3, 2, 5, 8, 4, 3, 10, 4, 7, 8, 10, 3, 3, 2, 5, 5, 2, 8, 8, 8, 2, 1, 8, 10, 0, 7, 4, 7, 0, 6, 4, 4, 1, 4, 10, 3, 5, 7, 1, 4, 2, 5, 5, 3 };
        int[] doorG = { 1, 1, 9, 9, 6, 4, 10, 7, 0, 8, 8, 2, 0, 4, 8, 10, 10, 4, 1, 0, 7, 1, 4, 9, 5, 1, 5, 8, 4, 7, 4, 5, 1, 2, 0, 9, 0, 2, 7, 4, 7, 1, 1, 0, 8, 3, 4, 6, 8, 9 };
        int[] keys = { 8, 9, 6 };
        assertEquals(50, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case47() {
        int[] doorR = { 6, 8, 3, 5, 8, 6, 9, 10, 1, 2, 5, 4, 8, 10, 4, 9, 7, 4, 9, 4, 9, 4, 7, 7, 0, 4, 1, 3, 1, 9, 0, 10, 8, 9, 1, 7, 8, 5, 9, 5, 1, 4, 5, 9, 5, 2, 10, 7, 3, 9 };
        int[] doorG = { 8, 4, 8, 7, 6, 6, 0, 1, 8, 8, 7, 2, 4, 8, 0, 7, 2, 0, 7, 2, 6, 4, 9, 6, 6, 7, 1, 0, 7, 7, 10, 10, 2, 6, 4, 2, 1, 9, 8, 6, 2, 1, 7, 10, 5, 0, 5, 6, 4, 5 };
        int[] keys = { 5, 10, 4 };
        assertEquals(46, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case48() {
        int[] doorR = { 9, 5, 4, 4, 5, 10, 8, 5, 10, 1, 3, 2, 5, 0, 3, 4, 3, 10, 5, 3, 4, 9, 9, 9, 2, 5, 0, 3, 2, 10, 3, 10, 3, 9, 5, 6, 3, 10, 1, 1, 9, 7, 3, 2, 10, 7, 6, 2, 7, 8 };
        int[] doorG = { 2, 9, 5, 5, 6, 4, 3, 7, 10, 9, 1, 5, 10, 0, 8, 10, 3, 7, 3, 2, 9, 6, 0, 2, 2, 2, 10, 9, 7, 0, 1, 2, 9, 3, 3, 5, 9, 9, 4, 7, 9, 3, 6, 6, 6, 5, 6, 4, 9, 9 };
        int[] keys = { 1, 19, 7 };
        assertEquals(37, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case49() {
        int[] doorR = { 4, 3, 7, 7, 10, 6, 6, 8, 4, 5, 2, 9, 6, 9, 10, 1, 5, 5, 4, 2, 10, 5, 5, 2, 6, 7, 1, 7, 8, 10, 2, 4, 5, 4, 4, 8, 8, 2, 5, 8, 9, 7, 0, 9, 3, 1, 0, 1, 6, 5 };
        int[] doorG = { 8, 6, 6, 2, 3, 7, 4, 10, 4, 4, 6, 9, 10, 9, 0, 0, 8, 7, 10, 6, 5, 1, 0, 5, 10, 2, 8, 1, 2, 5, 5, 4, 0, 10, 0, 9, 6, 1, 8, 8, 2, 9, 0, 10, 1, 0, 5, 5, 4, 8 };
        int[] keys = { 7, 18, 2 };
        assertEquals(46, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case50() {
        int[] doorR = { 48, 85, 14, 47, 32, 5, 37, 66, 35, 63, 41, 20, 16, 96, 26, 73, 73, 33, 70, 83, 88, 60, 11, 15, 49, 80, 54, 22, 49, 25, 30, 32, 94, 29, 14, 11, 94, 89, 14, 8, 8, 69, 76, 37, 17, 56, 68, 78, 18, 45 };
        int[] doorG = { 81, 55, 34, 89, 39, 28, 52, 67, 23, 85, 85, 57, 13, 31, 65, 21, 31, 6, 56, 22, 36, 88, 0, 81, 59, 49, 38, 5, 0, 52, 61, 21, 14, 15, 64, 49, 82, 14, 70, 70, 29, 59, 92, 43, 32, 2, 82, 18, 19, 96 };
        int[] keys = { 8, 21, 30 };
        assertEquals(12, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case51() {
        int[] doorR = { 39, 91, 75, 50, 18, 46, 6, 0, 33, 54, 72, 9, 82, 14, 36, 69, 61, 53, 15, 4, 79, 84, 55, 7, 49, 5, 93, 63, 39, 10, 41, 68, 10, 65, 23, 48, 44, 50, 96, 1, 78, 98, 1, 56, 34, 29, 32, 79, 51, 32 };
        int[] doorG = { 45, 64, 89, 68, 53, 41, 100, 91, 97, 73, 1, 89, 31, 68, 27, 72, 55, 66, 50, 79, 26, 58, 67, 77, 67, 7, 71, 12, 54, 78, 73, 87, 82, 46, 11, 51, 49, 71, 100, 11, 66, 95, 94, 40, 70, 64, 72, 57, 55, 100 };
        int[] keys = { 31, 42, 34 };
        assertEquals(18, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case52() {
        int[] doorR = { 35, 65, 10, 44, 15, 85, 63, 53, 71, 92, 7, 98, 36, 55, 16, 0, 14, 17, 35, 26, 94, 60, 98, 8, 26, 76, 32, 81, 1, 55, 79, 82, 71, 68, 35, 52, 43, 66, 90, 98, 27, 61, 87, 48, 43, 77, 34, 28, 68, 0 };
        int[] doorG = { 54, 60, 1, 70, 38, 66, 22, 87, 15, 78, 84, 5, 10, 71, 38, 30, 21, 32, 16, 66, 56, 75, 36, 33, 47, 39, 48, 38, 19, 39, 20, 72, 84, 35, 0, 87, 62, 97, 85, 8, 88, 79, 49, 94, 77, 35, 53, 1, 71, 46 };
        int[] keys = { 78, 45, 34 };
        assertEquals(41, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case53() {
        int[] doorR = { 34, 91, 31, 1, 64, 7, 7, 78, 28, 86, 7, 73, 23, 88, 10, 48, 42, 7, 43, 61, 28, 27, 32, 58, 77, 26, 30, 79, 22, 71, 86, 13, 33, 73, 38, 44, 78, 76, 33, 50, 18, 28, 73, 55, 11, 76, 53, 82, 42, 22 };
        int[] doorG = { 98, 61, 71, 69, 45, 27, 77, 0, 1, 81, 36, 48, 0, 94, 54, 11, 82, 49, 47, 73, 66, 61, 36, 75, 41, 28, 66, 100, 73, 70, 38, 14, 0, 40, 12, 43, 30, 56, 18, 35, 7, 37, 35, 79, 97, 86, 93, 77, 33, 45 };
        int[] keys = { 2, 36, 64 };
        assertEquals(27, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case54() {
        int[] doorR = { 70, 57, 31, 77, 85, 2, 35, 87, 39, 20, 36, 51, 17, 31, 84, 82, 66, 39, 87, 33, 27, 31, 76, 81, 73, 25, 9, 84, 85, 6, 12, 7, 91, 4, 98, 57, 75, 47, 50, 83, 48, 90, 54, 86, 1, 81, 66, 52, 99, 31 };
        int[] doorG = { 61, 31, 27, 95, 51, 91, 53, 61, 25, 19, 28, 10, 31, 94, 62, 74, 27, 4, 19, 17, 89, 68, 9, 64, 45, 85, 61, 59, 75, 55, 86, 6, 72, 82, 3, 93, 95, 11, 40, 81, 30, 6, 97, 77, 73, 10, 97, 31, 95, 38 };
        int[] keys = { 28, 36, 15 };
        assertEquals(9, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case55() {
        int[] doorR = { 2, 7, 5, 8, 1, 6, 2, 4, 10, 10, 1, 5, 3, 10, 9, 3, 8 };
        int[] doorG = { 10, 8, 2, 8, 3, 6, 2, 8, 9, 8, 10, 7, 9, 10, 2, 1, 3 };
        int[] keys = { 7, 20, 12 };
        assertEquals(17, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case56() {
        int[] doorR = { 35, 86, 51, 89, 16, 9, 16, 9, 12, 88, 96, 43, 92, 20, 29, 60, 74 };
        int[] doorG = { 31, 7, 14, 43, 71, 69, 19, 94, 73, 84, 95, 69, 64, 81, 92, 13, 97 };
        int[] keys = { 9, 44, 0 };
        assertEquals(0, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case57() {
        int[] doorR = { 58, 90, 28, 11, 54, 84, 17, 34, 100, 24, 16, 8, 47, 35, 64, 56, 81 };
        int[] doorG = { 80, 31, 48, 5, 13, 72, 87, 89, 100, 19, 44, 86, 49, 32, 98, 30, 92 };
        int[] keys = { 13, 57, 91 };
        assertEquals(14, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case58() {
        int[] doorR = { 5, 6, 4, 0, 10, 10, 5, 2, 10, 8, 10, 3, 1, 9, 8, 8, 0, 8, 10, 7, 5, 4, 0, 4, 9 };
        int[] doorG = { 2, 0, 8, 10, 1, 8, 8, 9, 1, 5, 2, 2, 5, 8, 0, 0, 8, 7, 8, 4, 8, 3, 0, 3, 5 };
        int[] keys = { 5, 13, 17 };
        assertEquals(25, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case59() {
        int[] doorR = { 46, 69, 32, 60, 27, 8, 62, 91, 48, 85, 15, 35, 56, 63, 37, 62, 10, 94, 0, 1, 63, 61, 2, 71, 66 };
        int[] doorG = { 47, 41, 53, 30, 81, 69, 47, 74, 25, 47, 56, 22, 22, 22, 43, 53, 37, 68, 19, 20, 33, 68, 44, 28, 6 };
        int[] keys = { 47, 28, 10 };
        assertEquals(6, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case60() {
        int[] doorR = { 24, 16, 76, 97, 76, 7, 47, 96, 83, 88, 49, 16, 46, 33, 86, 9, 5, 59, 99, 63, 1, 56, 12, 95, 28 };
        int[] doorG = { 87, 51, 27, 53, 64, 57, 8, 80, 38, 29, 89, 17, 34, 22, 60, 57, 14, 12, 39, 71, 42, 64, 16, 10, 77 };
        int[] keys = { 25, 4, 30 };
        assertEquals(5, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case61() {
        int[] doorR = { 10, 1, 5, 0, 3, 7, 9, 3, 9, 10, 4, 8, 10, 0, 9, 2, 0, 8, 4, 3, 3, 7, 5, 6, 0, 10, 7, 9, 3, 6, 6, 1, 1, 9, 1, 3, 3 };
        int[] doorG = { 4, 9, 2, 4, 3, 9, 3, 1, 1, 2, 4, 9, 2, 10, 7, 2, 2, 1, 0, 5, 4, 6, 6, 6, 0, 2, 4, 4, 4, 5, 10, 0, 0, 6, 1, 7, 6 };
        int[] keys = { 5, 18, 19 };
        assertEquals(37, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case62() {
        int[] doorR = { 77, 52, 92, 70, 23, 89, 93, 58, 54, 55, 87, 95, 1, 10, 33, 24, 0, 84, 62, 43, 18, 25, 27, 63, 32, 70, 83, 51, 50, 49, 42, 50, 76, 53, 31, 1, 97 };
        int[] doorG = { 63, 99, 79, 9, 92, 84, 58, 72, 78, 3, 50, 29, 2, 25, 61, 76, 92, 27, 12, 76, 37, 75, 40, 67, 83, 28, 75, 8, 24, 90, 63, 54, 82, 25, 88, 74, 96 };
        int[] keys = { 17, 37, 27 };
        assertEquals(4, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case63() {
        int[] doorR = { 81, 21, 7, 30, 20, 59, 48, 37, 65, 67, 30, 37, 54, 89, 87, 45, 91, 39, 15, 80, 36, 1, 22, 87, 1, 78, 52, 67, 11, 89, 87, 9, 15, 82, 95, 68, 83 };
        int[] doorG = { 65, 83, 32, 44, 63, 98, 58, 72, 0, 93, 67, 25, 55, 79, 71, 17, 61, 52, 17, 82, 77, 71, 67, 62, 77, 36, 69, 55, 8, 48, 77, 33, 24, 75, 64, 89, 64 };
        int[] keys = { 57, 1, 13 };
        assertEquals(2, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case64() {
        int[] doorR = { 9, 4, 4, 10, 7, 2, 7, 4, 7, 6, 5, 3, 3, 5, 8, 8, 8, 7, 9 };
        int[] doorG = { 4, 3, 7, 9, 9, 0, 9, 8, 3, 9, 0, 4, 7, 1, 1, 10, 10, 1, 0 };
        int[] keys = { 16, 18, 19 };
        assertEquals(19, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case65() {
        int[] doorR = { 94, 50, 91, 71, 32, 84, 57, 71, 82, 35, 30, 2, 97, 1, 73, 36, 67, 60, 76 };
        int[] doorG = { 53, 8, 4, 81, 8, 43, 41, 49, 100, 65, 95, 39, 58, 23, 14, 37, 60, 30, 15 };
        int[] keys = { 13, 34, 41 };
        assertEquals(5, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case66() {
        int[] doorR = { 44, 18, 90, 97, 53, 5, 91, 75, 77, 28, 80, 64, 65, 77, 87, 2, 13, 1, 98 };
        int[] doorG = { 35, 21, 5, 74, 15, 11, 51, 43, 66, 29, 38, 26, 18, 71, 63, 59, 95, 57, 63 };
        int[] keys = { 6, 61, 12 };
        assertEquals(4, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case67() {
        int[] doorR = { 3, 1, 1, 10, 5, 8, 6, 1, 7, 2, 9, 10, 8, 0, 8, 4, 7, 4, 0, 7, 7, 8, 10, 10, 10, 9, 6, 1 };
        int[] doorG = { 5, 6, 3, 2, 7, 0, 0, 4, 3, 10, 10, 10, 8, 3, 10, 7, 4, 8, 1, 8, 3, 8, 6, 10, 2, 1, 8, 0 };
        int[] keys = { 11, 10, 20 };
        assertEquals(28, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case68() {
        int[] doorR = { 76, 20, 8, 69, 24, 11, 81, 13, 86, 19, 17, 42, 81, 40, 2, 55, 80, 12, 16, 87, 13, 37, 26, 73, 95, 73, 18, 88 };
        int[] doorG = { 50, 46, 43, 6, 97, 6, 99, 89, 20, 69, 97, 72, 65, 20, 40, 93, 79, 24, 14, 46, 94, 52, 12, 0, 42, 27, 14, 16 };
        int[] keys = { 1, 15, 3 };
        assertEquals(0, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case69() {
        int[] doorR = { 44, 100, 98, 78, 43, 41, 34, 98, 69, 42, 38, 44, 62, 97, 31, 81, 53, 28, 33, 37, 71, 61, 29, 84, 69, 41, 84, 86 };
        int[] doorG = { 38, 3, 19, 25, 5, 46, 55, 90, 34, 42, 75, 57, 69, 96, 100, 84, 55, 79, 69, 53, 98, 95, 70, 57, 5, 89, 28, 15 };
        int[] keys = { 75, 16, 62 };
        assertEquals(20, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case70() {
        int[] doorR = { 3, 3, 3, 5, 10, 6, 10, 4, 0, 8, 3, 7, 1, 2, 0, 9, 10, 6, 7, 3, 5, 5, 1, 4, 7, 8, 0, 0, 3, 6, 2, 3, 6, 4, 8, 10, 2, 10, 3, 10, 0, 3, 7, 2, 4 };
        int[] doorG = { 0, 10, 3, 3, 4, 7, 10, 1, 0, 9, 9, 1, 5, 9, 1, 9, 8, 10, 4, 1, 5, 8, 7, 8, 8, 7, 7, 2, 8, 3, 7, 8, 6, 10, 7, 10, 6, 1, 3, 9, 1, 6, 4, 2, 6 };
        int[] keys = { 9, 9, 1 };
        assertEquals(43, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case71() {
        int[] doorR = { 77, 39, 48, 9, 84, 27, 34, 76, 21, 80, 36, 86, 61, 31, 66, 80, 26, 39, 12, 62, 77, 44, 22, 4, 39, 15, 22, 47, 74, 3, 14, 63, 59, 64, 23, 10, 64, 53, 63, 72, 20, 58, 24, 92, 34 };
        int[] doorG = { 59, 49, 19, 51, 50, 34, 15, 15, 40, 60, 4, 33, 53, 84, 98, 59, 25, 88, 73, 39, 100, 32, 61, 70, 75, 86, 66, 76, 4, 23, 55, 32, 75, 37, 49, 30, 21, 54, 45, 35, 47, 20, 20, 30, 65 };
        int[] keys = { 34, 25, 50 };
        assertEquals(30, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case72() {
        int[] doorR = { 49, 90, 3, 59, 100, 50, 73, 34, 79, 31, 48, 61, 96, 30, 45, 99, 6, 15, 95, 79, 92, 39, 49, 70, 90, 5, 67, 82, 86, 8, 35, 2, 21, 89, 78, 42, 51, 21, 21, 85, 2, 7, 46, 96, 58 };
        int[] doorG = { 45, 82, 37, 84, 58, 21, 89, 11, 15, 46, 33, 62, 21, 11, 5, 40, 58, 40, 89, 50, 33, 88, 16, 89, 27, 35, 43, 19, 73, 4, 14, 68, 91, 3, 30, 16, 7, 76, 63, 61, 95, 94, 2, 33, 25 };
        int[] keys = { 90, 90, 3 };
        assertEquals(38, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case73() {
        int[] doorR = { 1, 6, 8, 10, 7, 2, 0, 1, 7, 8, 10, 8, 5, 2, 3, 9, 4, 4, 2, 2, 5, 10, 3, 1 };
        int[] doorG = { 3, 10, 10, 2, 1, 8, 2, 8, 6, 0, 3, 0, 9, 7, 8, 5, 8, 6, 8, 7, 1, 10, 2, 1 };
        int[] keys = { 12, 18, 18 };
        assertEquals(24, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case74() {
        int[] doorR = { 42, 80, 3, 24, 75, 20, 8, 58, 10, 13, 86, 77, 56, 12, 48, 62, 67, 39, 75, 44, 97, 15, 0, 55 };
        int[] doorG = { 82, 34, 9, 88, 97, 69, 26, 52, 5, 39, 22, 64, 53, 20, 95, 4, 3, 96, 71, 100, 88, 41, 2, 56 };
        int[] keys = { 5, 40, 18 };
        assertEquals(7, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case75() {
        int[] doorR = { 76, 46, 5, 44, 8, 26, 89, 99, 69, 46, 11, 64, 94, 90, 41, 59, 90, 84, 9, 37, 0, 19, 12, 12 };
        int[] doorG = { 46, 18, 62, 84, 60, 98, 43, 5, 71, 71, 35, 57, 71, 21, 38, 12, 66, 56, 27, 70, 2, 83, 94, 46 };
        int[] keys = { 7, 65, 18 };
        assertEquals(6, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case76() {
        int[] doorR = { 7, 6, 9, 4, 6, 10, 2, 0, 10, 0, 9, 6, 2, 7, 0, 7, 2, 1, 9, 1, 8, 4, 6, 1, 2, 9, 10, 2, 0, 1, 0, 10, 8, 5, 7 };
        int[] doorG = { 4, 5, 10, 5, 9, 2, 4, 7, 6, 7, 6, 0, 3, 2, 6, 1, 0, 9, 6, 4, 8, 9, 7, 7, 10, 3, 1, 6, 7, 6, 6, 6, 5, 0, 5 };
        int[] keys = { 20, 3, 3 };
        assertEquals(24, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case77() {
        int[] doorR = { 78, 14, 25, 25, 52, 59, 9, 42, 61, 85, 90, 54, 90, 84, 7, 52, 80, 55, 16, 7, 21, 50, 11, 52, 83, 45, 84, 8, 57, 78, 61, 43, 37, 59, 86 };
        int[] doorG = { 23, 29, 36, 8, 76, 13, 45, 71, 98, 59, 68, 13, 10, 92, 97, 15, 60, 44, 37, 100, 33, 33, 7, 74, 8, 12, 67, 3, 22, 99, 39, 96, 100, 67, 25 };
        int[] keys = { 48, 38, 32 };
        assertEquals(17, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case78() {
        int[] doorR = { 81, 0, 81, 73, 97, 71, 54, 3, 3, 81, 69, 82, 43, 12, 90, 46, 81, 95, 5, 91, 10, 91, 33, 93, 46, 23, 45, 52, 47, 9, 7, 5, 23, 38, 83 };
        int[] doorG = { 43, 31, 5, 41, 78, 82, 93, 40, 55, 60, 29, 24, 3, 96, 96, 18, 70, 43, 32, 72, 59, 5, 78, 72, 76, 8, 56, 51, 74, 90, 99, 93, 81, 16, 62 };
        int[] keys = { 13, 43, 81 };
        assertEquals(25, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case79() {
        int[] doorR = { 4, 7, 5, 8, 9, 2, 2, 4, 10, 10, 7, 6, 6, 0, 5 };
        int[] doorG = { 5, 8, 9, 10, 3, 4, 8, 8, 8, 10, 0, 10, 7, 10, 0 };
        int[] keys = { 2, 8, 13 };
        assertEquals(15, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case80() {
        int[] doorR = { 37, 98, 4, 84, 85, 0, 48, 12, 77, 39, 19, 95, 12, 39, 68 };
        int[] doorG = { 90, 41, 97, 71, 99, 20, 76, 62, 14, 67, 74, 94, 31, 48, 89 };
        int[] keys = { 48, 37, 46 };
        assertEquals(8, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case81() {
        int[] doorR = { 99, 5, 41, 44, 96, 26, 86, 54, 69, 35, 57, 60, 93, 58, 76 };
        int[] doorG = { 8, 52, 25, 92, 4, 54, 63, 70, 7, 83, 48, 20, 31, 54, 88 };
        int[] keys = { 91, 96, 30 };
        assertEquals(15, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case82() {
        int[] doorR = { 10, 7, 9, 0, 1, 2, 9, 8, 6, 2, 6, 5, 8, 1, 3, 9, 1, 7, 6, 1, 0, 1, 2, 2, 0, 6, 8, 0, 5, 8, 10, 7, 2, 6, 6, 2, 5, 2, 6, 10, 2, 4, 4, 8, 2, 7, 5, 10, 10, 1 };
        int[] doorG = { 4, 8, 4, 4, 3, 5, 7, 1, 8, 2, 4, 1, 2, 9, 7, 0, 1, 0, 2, 7, 9, 7, 4, 7, 0, 1, 4, 7, 4, 8, 10, 8, 10, 5, 0, 4, 9, 9, 6, 1, 8, 7, 6, 4, 4, 10, 8, 10, 0, 10 };
        int[] keys = { 0, 12, 6 };
        assertEquals(33, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case83() {
        int[] doorR = { 56, 40, 19, 25, 78, 16, 91, 20, 86, 93, 63, 60, 43, 68, 56, 18, 76, 86, 37, 28, 32, 17, 54, 88, 47, 76, 44, 41, 72, 75, 19, 39, 21, 14, 52, 50, 96, 83, 8, 41, 4, 72, 100, 48, 13, 60, 35, 50, 100, 7 };
        int[] doorG = { 91, 73, 49, 56, 65, 57, 90, 43, 84, 14, 74, 31, 7, 39, 39, 96, 5, 47, 16, 34, 33, 4, 3, 23, 53, 83, 22, 100, 21, 8, 70, 95, 41, 81, 84, 84, 39, 67, 73, 77, 90, 90, 90, 43, 22, 92, 75, 7, 91, 69 };
        int[] keys = { 20, 18, 28 };
        assertEquals(9, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case84() {
        int[] doorR = { 75, 32, 79, 57, 61, 35, 62, 97, 22, 48, 58, 73, 19, 7, 14, 93, 2, 27, 96, 24, 71, 79, 74, 52, 88, 84, 94, 31, 36, 26, 68, 34, 44, 31, 7, 56, 47, 93, 52, 6, 75, 52, 17, 10, 71, 67, 56, 45, 56, 23 };
        int[] doorG = { 46, 15, 37, 56, 59, 8, 72, 71, 83, 38, 92, 41, 35, 24, 48, 69, 2, 98, 38, 7, 42, 47, 3, 13, 38, 98, 57, 22, 94, 47, 92, 17, 88, 59, 73, 7, 78, 4, 13, 98, 82, 72, 89, 2, 36, 83, 3, 9, 50, 60 };
        int[] keys = { 4, 64, 77 };
        assertEquals(39, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case85() {
        int[] doorR = { 1 };
        int[] doorG = { 1 };
        int[] keys = { 0, 0, 1 };
        assertEquals(0, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case86() {
        int[] doorR = { 41, 44, 41, 57, 58, 74, 84, 100, 58, 2, 43, 32, 82, 97, 44, 13, 35, 98, 96, 81, 43, 77, 18, 51, 27, 27, 39, 39, 45, 82, 59, 20, 28, 93, 6, 39, 64, 78, 28, 85, 17, 56, 3, 68, 4, 0, 36, 80, 41, 77 };
        int[] doorG = { 67, 15, 53, 36, 88, 29, 26, 57, 68, 99, 97, 27, 51, 70, 3, 49, 65, 75, 35, 92, 66, 0, 23, 96, 38, 86, 98, 31, 26, 75, 30, 2, 92, 78, 100, 99, 38, 26, 85, 74, 77, 15, 16, 48, 100, 88, 55, 93, 99, 54 };
        int[] keys = { 39, 31, 34 };
        assertEquals(17, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case87() {
        int[] doorR = { 3 };
        int[] doorG = { 4 };
        int[] keys = { 1, 2, 3 };
        assertEquals(0, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case88() {
        int[] doorR = { 1 };
        int[] doorG = { 1 };
        int[] keys = { 0, 0, 2 };
        assertEquals(1, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case89() {
        int[] doorR = { 1 };
        int[] doorG = { 10 };
        int[] keys = { 1, 5, 5 };
        assertEquals(1, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case90() {
        int[] doorR = { 2 };
        int[] doorG = { 2 };
        int[] keys = { 1, 1, 1 };
        assertEquals(0, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case91() {
        int[] doorR = { 1 };
        int[] doorG = { 4 };
        int[] keys = { 2, 2, 4 };
        assertEquals(1, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case92() {
        int[] doorR = { 5 };
        int[] doorG = { 5 };
        int[] keys = { 3, 3, 2 };
        assertEquals(0, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case93() {
        int[] doorR = { 1, 0 };
        int[] doorG = { 1, 0 };
        int[] keys = { 0, 0, 2 };
        assertEquals(2, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case94() {
        int[] doorR = { 5 };
        int[] doorG = { 5 };
        int[] keys = { 1, 1, 4 };
        assertEquals(0, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case95() {
        int[] doorR = { 3, 5, 4, 2, 8 };
        int[] doorG = { 4, 2, 3, 8, 1 };
        int[] keys = { 0, 0, 10 };
        assertEquals(5, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case96() {
        int[] doorR = { 3 };
        int[] doorG = { 1 };
        int[] keys = { 1, 1, 2 };
        assertEquals(1, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case97() {
        int[] doorR = { 3 };
        int[] doorG = { 2 };
        int[] keys = { 0, 2, 2 };
        assertEquals(0, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case98() {
        int[] doorR = { 5 };
        int[] doorG = { 4 };
        int[] keys = { 4, 4, 2 };
        assertEquals(1, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case99() {
        int[] doorR = { 0, 1, 2, 0 };
        int[] doorG = { 0, 2, 3, 1 };
        int[] keys = { 0, 0, 0 };
        assertEquals(1, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case100() {
        int[] doorR = { 3 };
        int[] doorG = { 3 };
        int[] keys = { 5, 1, 1 };
        assertEquals(0, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case101() {
        int[] doorR = { 10, 2 };
        int[] doorG = { 12, 2 };
        int[] keys = { 2, 2, 0 };
        assertEquals(1, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case102() {
        int[] doorR = { 5 };
        int[] doorG = { 3 };
        int[] keys = { 4, 2, 1 };
        assertEquals(0, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case103() {
        int[] doorR = { 3, 1 };
        int[] doorG = { 1, 1 };
        int[] keys = { 2, 2, 0 };
        assertEquals(1, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case104() {
        int[] doorR = { 3, 4, 4 };
        int[] doorG = { 3, 2, 1 };
        int[] keys = { 4, 2, 1 };
        assertEquals(3, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case105() {
        int[] doorR = { 2, 2, 2 };
        int[] doorG = { 2, 2, 2 };
        int[] keys = { 1, 1, 2 };
        assertEquals(3, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case106() {
        int[] doorR = { 3 };
        int[] doorG = { 20 };
        int[] keys = { 25, 0, 0 };
        assertEquals(0, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case107() {
        int[] doorR = { 5 };
        int[] doorG = { 7 };
        int[] keys = { 2, 2, 5 };
        assertEquals(0, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

    @Test
    public void case108() {
        int[] doorR = { 10, 1 };
        int[] doorG = { 10, 1 };
        int[] keys = { 1, 2, 3 };
        assertEquals(1, keydungeondiv2.countDoors(doorR, doorG, keys));
    }

}
