package topc.test.simulation;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.simulation.*;

public class WakingUpEasyTest {
    WakingUpEasy wakingupeasy = new WakingUpEasy();

    @Test
    public void case1() {
        int[] volume = { 5, 2, 4 };
        int S = 13;
        assertEquals(4, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case2() {
        int[] volume = { 5, 2, 4 };
        int S = 3;
        assertEquals(1, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case3() {
        int[] volume = { 1 };
        int S = 10000;
        assertEquals(10000, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case4() {
        int[] volume = { 42, 68, 35, 1, 70, 25, 79, 59, 63, 65, 6, 46, 82, 28, 62, 92, 96, 43, 28, 37, 92, 5, 3, 54, 93, 83, 22, 17, 19, 96, 48, 27, 72, 39, 70, 13, 68, 100, 36, 95, 4, 12, 23, 34, 74, 65, 42, 12, 54, 69 };
        int S = 9999;
        assertEquals(203, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case5() {
        int[] volume = { 1 };
        int S = 1;
        assertEquals(1, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case6() {
        int[] volume = { 100 };
        int S = 10000;
        assertEquals(100, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case7() {
        int[] volume = { 1 };
        int S = 10000;
        assertEquals(10000, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case8() {
        int[] volume = { 100 };
        int S = 1;
        assertEquals(1, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case9() {
        int[] volume = { 42 };
        int S = 2014;
        assertEquals(48, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case10() {
        int[] volume = { 99 };
        int S = 9999;
        assertEquals(101, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case11() {
        int[] volume = { 11 };
        int S = 9999;
        assertEquals(909, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case12() {
        int[] volume = { 99 };
        int S = 10000;
        assertEquals(102, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case13() {
        int[] volume = { 11 };
        int S = 10000;
        assertEquals(910, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case14() {
        int[] volume = { 5, 2, 4, 7 };
        int S = 42;
        assertEquals(10, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case15() {
        int[] volume = { 54, 57, 62, 57, 14, 16, 43, 42, 16, 37, 45, 23 };
        int S = 7289;
        assertEquals(187, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case16() {
        int[] volume = { 45, 31, 53, 18, 38, 24, 18, 21, 36, 19, 60, 25, 61, 32, 20, 31, 70, 30, 58 };
        int S = 2480;
        assertEquals(70, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case17() {
        int[] volume = { 12, 9, 26, 14, 14 };
        int S = 5238;
        assertEquals(350, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case18() {
        int[] volume = { 22, 29, 28, 5, 11, 21, 29, 6, 10, 2, 27, 4, 10, 3, 25 };
        int S = 5984;
        assertEquals(386, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case19() {
        int[] volume = { 1, 24 };
        int S = 146;
        assertEquals(12, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case20() {
        int[] volume = { 7, 1, 52, 48, 31, 3, 31, 32, 55, 20, 52, 36, 30, 30, 21, 47, 31, 44, 5, 55, 8, 32, 52, 19, 8, 2, 48, 14, 11, 30, 31, 55, 9, 17, 37, 53, 40, 22, 53, 55, 9, 11, 4 };
        int S = 1245;
        assertEquals(42, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case21() {
        int[] volume = { 21, 1, 17, 20, 7, 18, 3, 8, 19, 14, 2, 21, 12, 7 };
        int S = 8377;
        assertEquals(690, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case22() {
        int[] volume = { 46, 45, 18, 54, 53, 4, 6, 15, 16, 1, 51, 37, 2, 1, 7, 11, 22, 45, 51, 37, 47, 35, 51, 18 };
        int S = 2593;
        assertEquals(94, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case23() {
        int[] volume = { 4, 3, 4, 4, 3, 6, 5, 5, 5, 6, 6, 6, 5, 3, 5, 1, 6, 5, 6, 5, 5, 5, 5, 6, 1, 4, 6, 2, 6, 2, 6, 4, 3, 6, 4 };
        int S = 7013;
        assertEquals(1553, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case24() {
        int[] volume = { 28, 41, 61 };
        int S = 377;
        assertEquals(9, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case25() {
        int[] volume = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int S = 10000;
        assertEquals(10000, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case26() {
        int[] volume = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
        int S = 10000;
        assertEquals(100, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case27() {
        int[] volume = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int S = 1;
        assertEquals(1, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case28() {
        int[] volume = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
        int S = 1;
        assertEquals(1, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case29() {
        int[] volume = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
        int S = 10000;
        assertEquals(396, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case30() {
        int[] volume = { 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 };
        int S = 10000;
        assertEquals(136, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case31() {
        int[] volume = { 100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90, 89, 88, 87, 86, 85, 84, 83, 82, 81, 80, 79, 78, 77, 76, 75, 74, 73, 72, 71, 70, 69, 68, 67, 66, 65, 64, 63, 62, 61, 60, 59, 58, 57, 56, 55, 54, 53, 52, 51 };
        int S = 10000;
        assertEquals(129, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case32() {
        int[] volume = { 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int S = 10000;
        assertEquals(381, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case33() {
        int[] volume = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int S = 10000;
        assertEquals(10000, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case34() {
        int[] volume = { 2, 2, 2, 2, 1, 1, 1, 1, 2, 2, 2, 2, 1, 2, 1, 2, 1, 1, 2, 2, 1, 2, 2, 2, 2, 1, 1, 2, 1, 1, 1, 2, 2, 1, 1, 2, 1, 2, 1, 1, 1, 1, 1, 2, 2, 2, 1, 2, 2, 2 };
        int S = 10000;
        assertEquals(6495, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case35() {
        int[] volume = { 46, 52, 2, 73, 12, 45, 55, 93, 62, 66, 57, 38, 21, 88, 51, 7, 100, 45, 47, 36, 75, 90, 36, 77, 51, 89, 20, 65, 3, 67, 62, 84, 18, 7, 73, 9, 11, 45, 36, 5, 24, 37, 52, 58, 20, 2, 53, 45, 29, 31 };
        int S = 1234;
        assertEquals(24, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case36() {
        int[] volume = { 37, 2, 47, 11, 86, 77, 87, 49, 30, 38, 72, 86, 81, 5, 89, 2, 99, 87, 35, 16, 47, 10, 9, 45, 90, 71, 40, 87, 69, 79, 73, 69, 91, 11, 1, 43, 2, 31, 45, 42, 82, 74, 89, 51, 18, 54, 66, 77, 94 };
        int S = 9876;
        assertEquals(189, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case37() {
        int[] volume = { 3, 4, 4, 3, 6, 17, 23, 23, 12, 6, 18, 11, 15, 11, 7, 24, 11, 18, 23, 17, 11, 17, 12, 7 };
        int S = 2424;
        assertEquals(192, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case38() {
        int[] volume = { 80, 4, 28, 4, 16, 96, 72, 75, 72, 70, 77, 62, 3, 54, 23, 41, 54, 28, 44, 76, 33, 27, 98, 84, 52, 4, 14, 83, 44, 84, 14, 16, 65, 3, 48, 56, 19, 2, 37, 47, 50, 2, 59, 43, 68, 58, 98, 76, 27, 97 };
        int S = 123;
        assertEquals(5, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case39() {
        int[] volume = { 19, 55, 69, 65, 48, 91, 38, 13, 98, 71, 77, 5, 28, 6, 47, 33, 45, 45, 82, 93, 93, 49, 32, 68, 21, 39, 10, 24, 70, 54, 57, 72, 26, 88, 80, 82, 4, 49, 84, 89, 90, 46, 74, 72, 74, 35, 13, 69, 42, 98 };
        int S = 12;
        assertEquals(1, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case40() {
        int[] volume = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 2, 1, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int S = 9777;
        assertEquals(8709, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case41() {
        int[] volume = { 13, 13, 13, 42, 13, 13, 13, 13, 13, 13, 42, 13, 13, 42, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 42, 13, 42, 13, 13, 42, 13, 13, 13, 13, 42, 13, 13, 13, 42, 42, 13, 13, 13, 13, 13, 42, 13 };
        int S = 7779;
        assertEquals(411, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case42() {
        int[] volume = { 1, 1, 100, 1, 100, 100, 100, 1, 1, 100, 1, 100, 100, 100, 100, 100, 1, 1, 1, 100, 100, 100, 100, 1, 1, 1, 1, 100, 1, 1, 1, 1, 100, 100, 1, 1, 1, 100, 100, 1, 1, 1, 1, 100, 1, 1, 1 };
        int S = 9912;
        assertEquals(226, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case43() {
        int[] volume = { 98, 98, 99, 98, 99, 98, 99, 98, 99, 99, 99, 98, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 98, 98, 99, 99, 99, 99, 99, 99, 99, 98, 99, 98, 99, 99, 98, 99, 99, 99, 98, 99, 99 };
        int S = 8888;
        assertEquals(91, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case44() {
        int[] volume = { 33, 23, 33, 23, 33, 23, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 23, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 23, 23, 33, 33, 33, 33, 33, 23, 23, 33, 33, 33, 33, 33, 33, 33, 33 };
        int S = 666;
        assertEquals(22, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case45() {
        int[] volume = { 3, 2, 2, 3, 3, 2, 2, 3, 2, 3, 3, 3, 3, 2, 2, 3, 2, 2, 2, 2, 3, 3, 2, 2, 2, 2, 3, 2, 2, 3, 2, 3, 2, 2, 2, 2, 2, 2, 2, 3, 2, 3, 2, 2 };
        int S = 8901;
        assertEquals(3765, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case46() {
        int[] volume = { 3, 1, 1, 1, 1, 3, 3, 1, 1, 3, 1, 3, 1, 3, 1, 1, 1, 3, 1, 3, 1, 3, 1, 1, 1, 3, 1, 1, 3, 1, 1, 1, 3, 1, 1, 3, 1, 1, 1, 1, 1, 3, 1 };
        int S = 9111;
        assertEquals(5517, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case47() {
        int[] volume = { 1 };
        int S = 10000;
        assertEquals(10000, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case48() {
        int[] volume = { 10 };
        int S = 2;
        assertEquals(1, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case49() {
        int[] volume = { 1, 2 };
        int S = 1;
        assertEquals(1, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case50() {
        int[] volume = { 5, 2, 4 };
        int S = 13;
        assertEquals(4, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case51() {
        int[] volume = { 1, 1, 10 };
        int S = 2;
        assertEquals(2, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case52() {
        int[] volume = { 1 };
        int S = 1;
        assertEquals(1, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case53() {
        int[] volume = { 1, 3 };
        int S = 2;
        assertEquals(2, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case54() {
        int[] volume = { 2 };
        int S = 5;
        assertEquals(3, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case55() {
        int[] volume = { 4, 3, 2 };
        int S = 7;
        assertEquals(2, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case56() {
        int[] volume = { 1, 2 };
        int S = 150;
        assertEquals(100, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case57() {
        int[] volume = { 2 };
        int S = 9999;
        assertEquals(5000, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case58() {
        int[] volume = { 2, 1 };
        int S = 2;
        assertEquals(1, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case59() {
        int[] volume = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int S = 11;
        assertEquals(11, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case60() {
        int[] volume = { 5, 2, 4 };
        int S = 16;
        assertEquals(4, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case61() {
        int[] volume = { 5, 2, 4 };
        int S = 3;
        assertEquals(1, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case62() {
        int[] volume = { 1, 5, 2 };
        int S = 152;
        assertEquals(57, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case63() {
        int[] volume = { 5, 3, 20 };
        int S = 10;
        assertEquals(3, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case64() {
        int[] volume = { 3 };
        int S = 8;
        assertEquals(3, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case65() {
        int[] volume = { 1, 100 };
        int S = 10;
        assertEquals(2, wakingupeasy.countAlarms(volume, S));
    }

    @Test
    public void case66() {
        int[] volume = { 1, 1 };
        int S = 2;
        assertEquals(2, wakingupeasy.countAlarms(volume, S));
    }

}
