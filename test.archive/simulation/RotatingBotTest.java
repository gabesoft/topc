package topc.test.simulation;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.simulation.*;

public class RotatingBotTest {
    RotatingBot rotatingbot = new RotatingBot();

    @Test
    public void case1() {
        int[] moves = { 15 };
        assertEquals(16, rotatingbot.minArea(moves));
    }

    @Test
    public void case2() {
        int[] moves = { 3, 10 };
        assertEquals(44, rotatingbot.minArea(moves));
    }

    @Test
    public void case3() {
        int[] moves = { 1, 1, 1, 1 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case4() {
        int[] moves = { 9, 5, 11, 10, 11, 4, 10 };
        assertEquals(132, rotatingbot.minArea(moves));
    }

    @Test
    public void case5() {
        int[] moves = { 1, 2, 3, 4, 5 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case6() {
        int[] moves = { 47 };
        assertEquals(48, rotatingbot.minArea(moves));
    }

    @Test
    public void case7() {
        int[] moves = { 13, 5, 17, 6, 17 };
        assertEquals(126, rotatingbot.minArea(moves));
    }

    @Test
    public void case8() {
        int[] moves = { 3, 1, 34, 1, 30 };
        assertEquals(70, rotatingbot.minArea(moves));
    }

    @Test
    public void case9() {
        int[] moves = { 17, 3, 18, 16, 18, 12, 17, 11, 16, 10, 15, 9, 14, 8, 13, 7, 12, 6, 11, 5, 10, 4, 9, 3, 8, 2, 7, 1, 6 };
        assertEquals(323, rotatingbot.minArea(moves));
    }

    @Test
    public void case10() {
        int[] moves = { 8, 8, 12, 38, 12, 29, 11, 28, 10, 27, 9, 26, 8, 25, 7, 24, 6, 23, 5, 22, 4, 21, 3, 20, 2 };
        assertEquals(507, rotatingbot.minArea(moves));
    }

    @Test
    public void case11() {
        int[] moves = { 2, 1, 48, 13, 48, 11 };
        assertEquals(686, rotatingbot.minArea(moves));
    }

    @Test
    public void case12() {
        int[] moves = { 12, 1, 27, 14, 27, 12, 26, 11, 25, 10, 24, 9, 23, 8, 22, 7, 21, 6, 20, 5, 19, 4, 18, 3, 17, 2, 16, 1, 15 };
        assertEquals(420, rotatingbot.minArea(moves));
    }

    @Test
    public void case13() {
        int[] moves = { 6 };
        assertEquals(7, rotatingbot.minArea(moves));
    }

    @Test
    public void case14() {
        int[] moves = { 31, 14, 36, 23, 36, 8, 35, 7, 34, 6, 33, 5, 32, 4, 31, 3, 30, 2, 29, 1, 28 };
        assertEquals(888, rotatingbot.minArea(moves));
    }

    @Test
    public void case15() {
        int[] moves = { 11, 2, 46, 15, 46, 12, 45, 11 };
        assertEquals(752, rotatingbot.minArea(moves));
    }

    @Test
    public void case16() {
        int[] moves = { 1, 10, 8, 21, 8, 10, 7, 9, 6, 8, 5, 7, 4, 6, 3, 5, 2, 4 };
        assertEquals(198, rotatingbot.minArea(moves));
    }

    @Test
    public void case17() {
        int[] moves = { 10, 3, 12, 4, 12 };
        assertEquals(65, rotatingbot.minArea(moves));
    }

    @Test
    public void case18() {
        int[] moves = { 6, 20, 40, 37, 40, 16, 39, 15, 38, 14, 37, 13, 36, 12, 35, 11, 34, 10, 33, 9, 32, 8, 31, 7, 30, 6, 29, 5, 28, 4, 27, 3, 26, 2, 25, 1 };
        assertEquals(1558, rotatingbot.minArea(moves));
    }

    @Test
    public void case19() {
        int[] moves = { 13, 27, 27, 34, 27, 6, 26, 5, 25, 4, 24, 3, 23, 2, 22, 1, 21 };
        assertEquals(980, rotatingbot.minArea(moves));
    }

    @Test
    public void case20() {
        int[] moves = { 14, 4, 38, 31, 38, 26, 37, 25, 36, 24, 35, 23, 34, 22, 33, 21, 32, 20, 31, 19, 30, 18, 29, 17, 28, 16, 27, 15, 26, 14, 25, 13, 24, 12, 23, 11, 22, 10, 21, 9, 20, 8, 19, 7, 18 };
        assertEquals(1248, rotatingbot.minArea(moves));
    }

    @Test
    public void case21() {
        int[] moves = { 12, 18, 22, 19, 22 };
        assertEquals(460, rotatingbot.minArea(moves));
    }

    @Test
    public void case22() {
        int[] moves = { 6, 5, 10, 17, 10, 11, 9, 10, 8, 9, 7, 8, 6, 7, 5, 6, 4, 5, 3, 4, 2, 3, 1, 2 };
        assertEquals(198, rotatingbot.minArea(moves));
    }

    @Test
    public void case23() {
        int[] moves = { 21, 13, 26, 43, 26, 29, 25, 28, 24, 27, 23, 26, 22, 25, 21, 24, 20, 23, 19, 22, 18, 21, 17, 20, 16, 19, 15, 18, 14, 17, 13, 16, 12, 15, 11, 14, 10, 13, 9 };
        assertEquals(1188, rotatingbot.minArea(moves));
    }

    @Test
    public void case24() {
        int[] moves = { 27, 10, 44, 49, 44, 38, 43, 37, 42, 36, 41, 35, 40, 34, 39, 33, 38 };
        assertEquals(2250, rotatingbot.minArea(moves));
    }

    @Test
    public void case25() {
        int[] moves = { 19 };
        assertEquals(20, rotatingbot.minArea(moves));
    }

    @Test
    public void case26() {
        int[] moves = { 10, 1, 10 };
        assertEquals(22, rotatingbot.minArea(moves));
    }

    @Test
    public void case27() {
        int[] moves = { 23, 4, 42, 23, 42, 18, 41, 17, 40 };
        assertEquals(1032, rotatingbot.minArea(moves));
    }

    @Test
    public void case28() {
        int[] moves = { 21, 10, 28, 14, 28, 3, 27, 2, 26, 1, 25 };
        assertEquals(435, rotatingbot.minArea(moves));
    }

    @Test
    public void case29() {
        int[] moves = { 7, 33, 16, 35, 16, 1, 15 };
        assertEquals(612, rotatingbot.minArea(moves));
    }

    @Test
    public void case30() {
        int[] moves = { 12, 12, 23, 15, 23, 2, 22, 1, 21 };
        assertEquals(384, rotatingbot.minArea(moves));
    }

    @Test
    public void case31() {
        int[] moves = { 6, 17, 24, 23, 24, 5, 23, 4, 22, 3, 21, 2, 20, 1, 19 };
        assertEquals(600, rotatingbot.minArea(moves));
    }

    @Test
    public void case32() {
        int[] moves = { 14, 7, 19, 8, 19 };
        assertEquals(180, rotatingbot.minArea(moves));
    }

    @Test
    public void case33() {
        int[] moves = { 1, 36, 39, 37, 39 };
        assertEquals(1520, rotatingbot.minArea(moves));
    }

    @Test
    public void case34() {
        int[] moves = { 7, 2, 8, 14, 8, 11, 7, 10, 6, 9, 5, 8, 4, 7, 3, 6, 2, 5 };
        assertEquals(135, rotatingbot.minArea(moves));
    }

    @Test
    public void case35() {
        int[] moves = { 35, 11, 41, 23, 41, 11, 40, 10, 39, 9, 38, 8, 37, 7, 36, 6, 35, 5, 34, 4, 33, 3, 32, 2, 31 };
        assertEquals(1008, rotatingbot.minArea(moves));
    }

    @Test
    public void case36() {
        int[] moves = { 14 };
        assertEquals(15, rotatingbot.minArea(moves));
    }

    @Test
    public void case37() {
        int[] moves = { 13, 5, 17, 6, 17 };
        assertEquals(126, rotatingbot.minArea(moves));
    }

    @Test
    public void case38() {
        int[] moves = { 3, 1, 34, 1, 30 };
        assertEquals(70, rotatingbot.minArea(moves));
    }

    @Test
    public void case39() {
        int[] moves = { 17, 3, 18, 16, 18, 12, 17, 11, 16, 10, 15, 9, 14, 8, 13, 7, 12, 6, 11, 5, 10, 4, 9, 3, 8, 2, 7, 1, 6 };
        assertEquals(323, rotatingbot.minArea(moves));
    }

    @Test
    public void case40() {
        int[] moves = { 8, 8, 12, 38, 12, 29, 11, 28, 10, 27, 9, 26, 8, 25, 7, 24, 6, 23, 5, 22, 4, 21, 3, 20, 2 };
        assertEquals(507, rotatingbot.minArea(moves));
    }

    @Test
    public void case41() {
        int[] moves = { 2, 1, 48, 13, 48, 11 };
        assertEquals(686, rotatingbot.minArea(moves));
    }

    @Test
    public void case42() {
        int[] moves = { 12, 1, 27, 14, 27, 12, 26, 11, 25, 10, 24, 9, 23, 8, 22, 7, 21, 6, 20, 5, 19, 4, 18, 3, 17, 2, 16, 1, 15 };
        assertEquals(420, rotatingbot.minArea(moves));
    }

    @Test
    public void case43() {
        int[] moves = { 6 };
        assertEquals(7, rotatingbot.minArea(moves));
    }

    @Test
    public void case44() {
        int[] moves = { 31, 14, 36, 23, 36, 8, 35, 7, 34, 6, 33, 5, 32, 4, 31, 3, 30, 2, 29, 1, 28 };
        assertEquals(888, rotatingbot.minArea(moves));
    }

    @Test
    public void case45() {
        int[] moves = { 11, 2, 46, 15, 46, 12, 45, 11 };
        assertEquals(752, rotatingbot.minArea(moves));
    }

    @Test
    public void case46() {
        int[] moves = { 1, 10, 8, 21, 8, 10, 7, 9, 6, 8, 5, 7, 4, 6, 3, 5, 2, 4 };
        assertEquals(198, rotatingbot.minArea(moves));
    }

    @Test
    public void case47() {
        int[] moves = { 10, 3, 12, 4, 12 };
        assertEquals(65, rotatingbot.minArea(moves));
    }

    @Test
    public void case48() {
        int[] moves = { 6, 20, 40, 37, 40, 16, 39, 15, 38, 14, 37, 13, 36, 12, 35, 11, 34, 10, 33, 9, 32, 8, 31, 7, 30, 6, 29, 5, 28, 4, 27, 3, 26, 2, 25, 1 };
        assertEquals(1558, rotatingbot.minArea(moves));
    }

    @Test
    public void case49() {
        int[] moves = { 13, 27, 27, 34, 27, 6, 26, 5, 25, 4, 24, 3, 23, 2, 22, 1, 21 };
        assertEquals(980, rotatingbot.minArea(moves));
    }

    @Test
    public void case50() {
        int[] moves = { 14, 4, 38, 31, 38, 26, 37, 25, 36, 24, 35, 23, 34, 22, 33, 21, 32, 20, 31, 19, 30, 18, 29, 17, 28, 16, 27, 15, 26, 14, 25, 13, 24, 12, 23, 11, 22, 10, 21, 9, 20, 8, 19, 7, 18 };
        assertEquals(1248, rotatingbot.minArea(moves));
    }

    @Test
    public void case51() {
        int[] moves = { 12, 18, 22, 19, 22 };
        assertEquals(460, rotatingbot.minArea(moves));
    }

    @Test
    public void case52() {
        int[] moves = { 6, 5, 10, 17, 10, 11, 9, 10, 8, 9, 7, 8, 6, 7, 5, 6, 4, 5, 3, 4, 2, 3, 1, 2 };
        assertEquals(198, rotatingbot.minArea(moves));
    }

    @Test
    public void case53() {
        int[] moves = { 21, 13, 26, 43, 26, 29, 25, 28, 24, 27, 23, 26, 22, 25, 21, 24, 20, 23, 19, 22, 18, 21, 17, 20, 16, 19, 15, 18, 14, 17, 13, 16, 12, 15, 11, 14, 10, 13, 9 };
        assertEquals(1188, rotatingbot.minArea(moves));
    }

    @Test
    public void case54() {
        int[] moves = { 27, 10, 44, 49, 44, 38, 43, 37, 42, 36, 41, 35, 40, 34, 39, 33, 38 };
        assertEquals(2250, rotatingbot.minArea(moves));
    }

    @Test
    public void case55() {
        int[] moves = { 19 };
        assertEquals(20, rotatingbot.minArea(moves));
    }

    @Test
    public void case56() {
        int[] moves = { 10, 1, 10 };
        assertEquals(22, rotatingbot.minArea(moves));
    }

    @Test
    public void case57() {
        int[] moves = { 23, 4, 42, 23, 42, 18, 41, 17, 40 };
        assertEquals(1032, rotatingbot.minArea(moves));
    }

    @Test
    public void case58() {
        int[] moves = { 21, 10, 28, 14, 28, 3, 27, 2, 26, 1, 25 };
        assertEquals(435, rotatingbot.minArea(moves));
    }

    @Test
    public void case59() {
        int[] moves = { 7, 33, 16, 35, 16, 1, 15 };
        assertEquals(612, rotatingbot.minArea(moves));
    }

    @Test
    public void case60() {
        int[] moves = { 12, 12, 23, 15, 23, 2, 22, 1, 21 };
        assertEquals(384, rotatingbot.minArea(moves));
    }

    @Test
    public void case61() {
        int[] moves = { 6, 17, 24, 23, 24, 5, 23, 4, 22, 3, 21, 2, 20, 1, 19 };
        assertEquals(600, rotatingbot.minArea(moves));
    }

    @Test
    public void case62() {
        int[] moves = { 14, 7, 19, 8, 19 };
        assertEquals(180, rotatingbot.minArea(moves));
    }

    @Test
    public void case63() {
        int[] moves = { 1, 36, 39, 37, 39 };
        assertEquals(1520, rotatingbot.minArea(moves));
    }

    @Test
    public void case64() {
        int[] moves = { 7, 2, 8, 14, 8, 11, 7, 10, 6, 9, 5, 8, 4, 7, 3, 6, 2, 5 };
        assertEquals(135, rotatingbot.minArea(moves));
    }

    @Test
    public void case65() {
        int[] moves = { 35, 11, 41, 23, 41, 11, 40, 10, 39, 9, 38, 8, 37, 7, 36, 6, 35, 5, 34, 4, 33, 3, 32, 2, 31 };
        assertEquals(1008, rotatingbot.minArea(moves));
    }

    @Test
    public void case66() {
        int[] moves = { 14 };
        assertEquals(15, rotatingbot.minArea(moves));
    }

    @Test
    public void case67() {
        int[] moves = { 4, 22, 16, 27, 15, 4, 14, 3, 13, 2, 12, 1, 11 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case68() {
        int[] moves = { 18, 2, 41, 30, 40, 27 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case69() {
        int[] moves = { 8, 23, 11, 34, 11, 10, 10, 9, 10, 8 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case70() {
        int[] moves = { 10, 2, 16, 5, 16, 1, 15 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case71() {
        int[] moves = { 7, 7, 11, 8, 10 };
        assertEquals(108, rotatingbot.minArea(moves));
    }

    @Test
    public void case72() {
        int[] moves = { 2, 27, 2, 25, 1, 24 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case73() {
        int[] moves = { 6, 9, 15, 14, 15, 4, 14, 3, 13, 2, 12, 1, 12 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case74() {
        int[] moves = { 12, 11, 22, 14, 22, 2, 21, 1, 20 };
        assertEquals(345, rotatingbot.minArea(moves));
    }

    @Test
    public void case75() {
        int[] moves = { 24, 22, 36, 24, 36 };
        assertEquals(925, rotatingbot.minArea(moves));
    }

    @Test
    public void case76() {
        int[] moves = { 17, 17, 19, 24, 19, 6, 18, 5, 17, 4, 16, 3, 14, 2, 14, 1, 13 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case77() {
        int[] moves = { 1, 30, 14 };
        assertEquals(465, rotatingbot.minArea(moves));
    }

    @Test
    public void case78() {
        int[] moves = { 3, 15, 43, 21, 43, 5, 42, 4, 41, 3, 40, 3, 39, 1, 38 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case79() {
        int[] moves = { 29, 15, 48, 41, 47, 25, 46, 24, 45, 23, 44, 22, 43, 21, 42, 20 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case80() {
        int[] moves = { 8, 29, 16, 44, 16, 14, 15, 13, 14, 12, 13, 11, 12, 10, 11, 9, 10, 8, 9, 7, 8, 6, 7, 5, 6, 4, 5, 3, 3, 2, 3, 1, 2 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case81() {
        int[] moves = { 35, 8, 40, 11, 40, 3, 39, 2, 38, 1, 37 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case82() {
        int[] moves = { 8 };
        assertEquals(9, rotatingbot.minArea(moves));
    }

    @Test
    public void case83() {
        int[] moves = { 5, 1, 6, 7, 7, 5, 6, 4, 5, 3, 4, 2, 3, 1, 2 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case84() {
        int[] moves = { 2, 3, 14, 16, 14, 12, 13, 11, 12, 10, 11, 9, 10, 8, 9, 7, 8, 6, 7, 5, 7, 4, 5, 3 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case85() {
        int[] moves = { 3, 4, 49, 4, 49 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case86() {
        int[] moves = { 6, 5, 13, 13, 13, 7, 12, 6, 12, 5, 10, 4, 9, 3, 8, 2, 7, 1, 6 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case87() {
        int[] moves = { 3, 35, 10, 35, 6, 34, 5, 33, 5, 32, 3, 31, 2, 30, 1, 29 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case88() {
        int[] moves = { 11, 7, 11, 6, 10, 5, 9, 4, 8, 3, 7, 2, 6, 2, 5 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case89() {
        int[] moves = { 21, 5, 27, 21, 27, 14, 26, 13 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case90() {
        int[] moves = { 11, 40, 16, 46, 16, 4, 15, 4, 14, 3, 13, 2, 12, 1, 11 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case91() {
        int[] moves = { 18, 17, 32, 34, 32, 16, 31, 15, 30, 13, 29, 13, 28, 12, 27 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case92() {
        int[] moves = { 14, 3, 24, 15, 24 };
        assertEquals(400, rotatingbot.minArea(moves));
    }

    @Test
    public void case93() {
        int[] moves = { 16, 31, 31, 36, 31, 4, 30, 3, 28, 2, 28, 1, 27 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case94() {
        int[] moves = { 20 };
        assertEquals(21, rotatingbot.minArea(moves));
    }

    @Test
    public void case95() {
        int[] moves = { 2, 3, 4, 10, 3, 6 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case96() {
        int[] moves = { 1 };
        assertEquals(2, rotatingbot.minArea(moves));
    }

    @Test
    public void case97() {
        int[] moves = { 50, 50, 50, 49 };
        assertEquals(2601, rotatingbot.minArea(moves));
    }

    @Test
    public void case98() {
        int[] moves = { 8, 6, 6, 1 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case99() {
        int[] moves = { 8, 6, 6 };
        assertEquals(63, rotatingbot.minArea(moves));
    }

    @Test
    public void case100() {
        int[] moves = { 5, 4, 5, 3, 3 };
        assertEquals(30, rotatingbot.minArea(moves));
    }

    @Test
    public void case101() {
        int[] moves = { 4, 5, 4, 4, 3, 2 };
        assertEquals(30, rotatingbot.minArea(moves));
    }

    @Test
    public void case102() {
        int[] moves = { 9, 6, 9, 5, 8 };
        assertEquals(70, rotatingbot.minArea(moves));
    }

    @Test
    public void case103() {
        int[] moves = { 3, 3, 3, 2, 2 };
        assertEquals(16, rotatingbot.minArea(moves));
    }

    @Test
    public void case104() {
        int[] moves = { 1, 4, 3, 4, 1, 2 };
        assertEquals(20, rotatingbot.minArea(moves));
    }

    @Test
    public void case105() {
        int[] moves = { 4, 3, 4, 2, 1 };
        assertEquals(20, rotatingbot.minArea(moves));
    }

    @Test
    public void case106() {
        int[] moves = { 8, 6, 6, 1 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case107() {
        int[] moves = { 50, 50, 50, 49, 1, 48, 48, 48, 47, 1, 46, 46, 46, 45, 1, 44, 44, 44, 43, 1, 42, 42, 42, 41, 1, 40, 40, 40, 39, 1, 38, 38, 38, 37, 1, 36, 36, 36, 35, 1, 34, 34, 34, 33, 1, 32, 32, 32, 31, 1 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case108() {
        int[] moves = { 20, 5, 30, 5, 10 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case109() {
        int[] moves = { 12, 1, 27, 14, 27, 12, 26, 11, 25, 10, 24, 9, 23, 8, 22, 7, 21, 6, 20, 5, 19, 4, 18, 3, 17, 2, 16, 1, 15 };
        assertEquals(420, rotatingbot.minArea(moves));
    }

    @Test
    public void case110() {
        int[] moves = { 8, 6, 6 };
        assertEquals(63, rotatingbot.minArea(moves));
    }

    @Test
    public void case111() {
        int[] moves = { 15 };
        assertEquals(16, rotatingbot.minArea(moves));
    }

    @Test
    public void case112() {
        int[] moves = { 10, 5, 12, 2, 3 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case113() {
        int[] moves = { 1, 2, 3, 4, 5 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case114() {
        int[] moves = { 10, 10, 7, 2, 3 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case115() {
        int[] moves = { 1, 1, 2, 2, 3 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case116() {
        int[] moves = { 3, 4, 1 };
        assertEquals(20, rotatingbot.minArea(moves));
    }

    @Test
    public void case117() {
        int[] moves = { 5, 4, 2, 1 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case118() {
        int[] moves = { 1, 1, 2, 2, 4 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case119() {
        int[] moves = { 9, 8, 9, 6, 3 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case120() {
        int[] moves = { 50, 50 };
        assertEquals(2601, rotatingbot.minArea(moves));
    }

    @Test
    public void case121() {
        int[] moves = { 2, 2, 1, 1 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case122() {
        int[] moves = { 4, 3, 5, 4, 6, 1 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case123() {
        int[] moves = { 2, 4, 4, 8, 10 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case124() {
        int[] moves = { 5, 4, 5, 3, 3 };
        assertEquals(30, rotatingbot.minArea(moves));
    }

    @Test
    public void case125() {
        int[] moves = { 2, 3, 4, 5, 6 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case126() {
        int[] moves = { 10, 5, 20, 10, 30 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case127() {
        int[] moves = { 2, 2, 3, 3, 1, 1 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case128() {
        int[] moves = { 9, 5, 11, 10, 11, 4, 10, 4 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case129() {
        int[] moves = { 4, 2, 5, 3, 6 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case130() {
        int[] moves = { 5, 5, 2, 1 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case131() {
        int[] moves = { 5, 5, 10, 10, 20 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case132() {
        int[] moves = { 1, 1, 2, 3, 5 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case133() {
        int[] moves = { 50, 1, 1, 1, 50, 1, 1, 1, 50 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case134() {
        int[] moves = { 10, 10, 5, 5, 1 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case135() {
        int[] moves = { 1, 1, 50 };
        assertEquals(102, rotatingbot.minArea(moves));
    }

    @Test
    public void case136() {
        int[] moves = { 50, 50, 49, 1 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case137() {
        int[] moves = { 8, 6, 9, 4, 2 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case138() {
        int[] moves = { 8, 6, 6, 2 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case139() {
        int[] moves = { 1, 1, 2, 2, 2, 2 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case140() {
        int[] moves = { 3, 2, 2, 2 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case141() {
        int[] moves = { 1, 1 };
        assertEquals(4, rotatingbot.minArea(moves));
    }

    @Test
    public void case142() {
        int[] moves = { 8, 6, 8, 4, 1 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case143() {
        int[] moves = { 2, 2, 3, 4, 6, 4 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case144() {
        int[] moves = { 9, 5, 11, 10, 12, 8 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case145() {
        int[] moves = { 4, 10, 2, 1 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case146() {
        int[] moves = { 1, 1, 2, 2, 1, 1 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case147() {
        int[] moves = { 5, 4, 10, 40, 12 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case148() {
        int[] moves = { 2, 1, 3, 3, 1, 1 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case149() {
        int[] moves = { 16, 8, 7, 4, 3 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case150() {
        int[] moves = { 1, 1, 2, 2, 10 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case151() {
        int[] moves = { 9, 5, 11, 10, 16, 4, 10 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case152() {
        int[] moves = { 5, 5, 2 };
        assertEquals(36, rotatingbot.minArea(moves));
    }

    @Test
    public void case153() {
        int[] moves = { 10, 5, 15, 20 };
        assertEquals(336, rotatingbot.minArea(moves));
    }

    @Test
    public void case154() {
        int[] moves = { 5, 4, 5, 3, 4, 2, 2, 1, 1 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case155() {
        int[] moves = { 2, 1, 4, 5, 10 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case156() {
        int[] moves = { 6, 6, 8, 1 };
        assertEquals(63, rotatingbot.minArea(moves));
    }

    @Test
    public void case157() {
        int[] moves = { 6, 6, 6, 1 };
        assertEquals(49, rotatingbot.minArea(moves));
    }

    @Test
    public void case158() {
        int[] moves = { 1, 5, 10, 20, 50 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case159() {
        int[] moves = { 1, 1, 2, 2, 3, 3 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case160() {
        int[] moves = { 1, 1, 2, 2, 3, 2 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case161() {
        int[] moves = { 2, 2, 3, 1, 1 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case162() {
        int[] moves = { 9, 5, 11, 10, 11, 3, 9 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case163() {
        int[] moves = { 1, 2, 1, 1 };
        assertEquals(6, rotatingbot.minArea(moves));
    }

    @Test
    public void case164() {
        int[] moves = { 2, 3, 4, 5, 5, 5 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case165() {
        int[] moves = { 2, 2, 4, 2, 1, 1 };
        assertEquals(15, rotatingbot.minArea(moves));
    }

    @Test
    public void case166() {
        int[] moves = { 5, 5, 10, 2 };
        assertEquals(66, rotatingbot.minArea(moves));
    }

    @Test
    public void case167() {
        int[] moves = { 1, 2, 50 };
        assertEquals(153, rotatingbot.minArea(moves));
    }

    @Test
    public void case168() {
        int[] moves = { 8, 6, 8, 1 };
        assertEquals(63, rotatingbot.minArea(moves));
    }

    @Test
    public void case169() {
        int[] moves = { 20 };
        assertEquals(21, rotatingbot.minArea(moves));
    }

    @Test
    public void case170() {
        int[] moves = { 5, 10, 5 };
        assertEquals(66, rotatingbot.minArea(moves));
    }

    @Test
    public void case171() {
        int[] moves = { 4, 2, 10, 6, 50 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case172() {
        int[] moves = { 50, 50, 50 };
        assertEquals(2601, rotatingbot.minArea(moves));
    }

    @Test
    public void case173() {
        int[] moves = { 1, 1, 2, 3, 4, 5, 6 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case174() {
        int[] moves = { 1, 2, 3, 2, 1, 1, 1 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case175() {
        int[] moves = { 1, 1, 2, 5, 2, 1, 1 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case176() {
        int[] moves = { 1, 1, 5, 5, 1, 1 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case177() {
        int[] moves = { 2, 1, 3, 2, 4 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case178() {
        int[] moves = { 5, 4, 5, 2, 1 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case179() {
        int[] moves = { 1, 2, 4, 3, 5 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case180() {
        int[] moves = { 10, 2, 50, 10, 1, 1 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case181() {
        int[] moves = { 4, 3, 5, 2, 3, 1 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case182() {
        int[] moves = { 10, 3, 1, 1 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case183() {
        int[] moves = { 8, 10, 20, 13, 2 };
        assertEquals(294, rotatingbot.minArea(moves));
    }

    @Test
    public void case184() {
        int[] moves = { 2, 2, 3, 3, 4 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case185() {
        int[] moves = { 6, 6, 10, 12, 35 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case186() {
        int[] moves = { 9, 5, 11, 10, 16, 4 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case187() {
        int[] moves = { 1, 1, 3, 3, 10 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case188() {
        int[] moves = { 2, 2, 4, 4, 6, 6 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case189() {
        int[] moves = { 6, 6, 6, 4, 4, 2, 2 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case190() {
        int[] moves = { 3, 5, 5, 5, 1 };
        assertEquals(36, rotatingbot.minArea(moves));
    }

    @Test
    public void case191() {
        int[] moves = { 10, 10, 20, 20, 1, 1 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case192() {
        int[] moves = { 2, 1, 3, 3, 2, 1 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case193() {
        int[] moves = { 3, 1, 4, 4, 4, 2, 3, 1, 1 };
        assertEquals(25, rotatingbot.minArea(moves));
    }

    @Test
    public void case194() {
        int[] moves = { 10, 20, 20, 10, 10 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case195() {
        int[] moves = { 1, 2, 2, 1, 1 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case196() {
        int[] moves = { 5, 5, 6, 1, 4 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case197() {
        int[] moves = { 5, 5, 3, 2 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case198() {
        int[] moves = { 2, 1, 1 };
        assertEquals(6, rotatingbot.minArea(moves));
    }

    @Test
    public void case199() {
        int[] moves = { 1, 2, 4, 8, 16, 32 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case200() {
        int[] moves = { 8, 6, 8, 5, 2, 4 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case201() {
        int[] moves = { 3, 3, 3, 1, 1 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case202() {
        int[] moves = { 10, 10, 10, 9, 9, 6, 3 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case203() {
        int[] moves = { 9, 5, 11, 10, 11, 4, 9, 2 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case204() {
        int[] moves = { 1, 1, 2, 2, 3, 3, 4, 4 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case205() {
        int[] moves = { 1, 1, 1, 1 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case206() {
        int[] moves = { 9, 2, 8, 6 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case207() {
        int[] moves = { 10, 5, 15, 20, 25 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case208() {
        int[] moves = { 2, 2, 2, 1, 1 };
        assertEquals(9, rotatingbot.minArea(moves));
    }

    @Test
    public void case209() {
        int[] moves = { 2, 2, 3, 2, 2 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case210() {
        int[] moves = { 9, 5, 11, 10, 11, 4, 10 };
        assertEquals(132, rotatingbot.minArea(moves));
    }

    @Test
    public void case211() {
        int[] moves = { 48, 49, 50 };
        assertEquals(2550, rotatingbot.minArea(moves));
    }

    @Test
    public void case212() {
        int[] moves = { 5, 2, 6, 1, 1 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case213() {
        int[] moves = { 2, 2, 4, 4, 4, 1, 3, 2 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case214() {
        int[] moves = { 6, 6, 6, 5, 5, 3, 1 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case215() {
        int[] moves = { 1, 1, 2, 1, 1 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case216() {
        int[] moves = { 10, 20, 30, 40, 50 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case217() {
        int[] moves = { 4, 1, 7, 1, 6 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case218() {
        int[] moves = { 10, 5, 10, 4, 9, 3, 5 };
        assertEquals(66, rotatingbot.minArea(moves));
    }

    @Test
    public void case219() {
        int[] moves = { 1, 1, 2, 2, 3, 4, 4, 6, 6, 9, 6, 2, 5, 1, 4 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

    @Test
    public void case220() {
        int[] moves = { 2, 2, 3 };
        assertEquals(12, rotatingbot.minArea(moves));
    }

    @Test
    public void case221() {
        int[] moves = { 5, 4, 5, 3 };
        assertEquals(30, rotatingbot.minArea(moves));
    }

    @Test
    public void case222() {
        int[] moves = { 8, 8, 6, 1 };
        assertEquals(-1, rotatingbot.minArea(moves));
    }

}
