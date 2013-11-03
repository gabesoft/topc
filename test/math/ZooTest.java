package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class ZooTest {
    Zoo zoo = new Zoo();

    @Test
    public void case1() {
        int[] answers = { 0, 1, 2, 3, 4 };
        assertEquals(2L, zoo.theCount(answers));
    }

    @Test
    public void case2() {
        int[] answers = { 5, 8 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case3() {
        int[] answers = { 0, 0, 0, 0, 0, 0 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case4() {
        int[] answers = { 1, 0, 2, 0, 1 };
        assertEquals(8L, zoo.theCount(answers));
    }

    @Test
    public void case5() {
        int[] answers = { 1, 0, 2, 0, 1, 3 };
        assertEquals(8L, zoo.theCount(answers));
    }

    @Test
    public void case6() {
        int[] answers = { 1, 0, 0, 1 };
        assertEquals(4L, zoo.theCount(answers));
    }

    @Test
    public void case7() {
        int[] answers = { 1, 1 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case8() {
        int[] answers = { 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 19, 19 };
        assertEquals(1048576L, zoo.theCount(answers));
    }

    @Test
    public void case9() {
        int[] answers = { 7, 6, 1, 20, 10, 14, 9, 7, 17, 4, 3, 8, 18, 5, 5, 1, 10, 0, 9, 2, 8, 12, 24, 21, 19, 12, 4, 11, 15, 11, 13, 6, 0, 2, 14, 3, 22, 16, 23, 13 };
        assertEquals(65536L, zoo.theCount(answers));
    }

    @Test
    public void case10() {
        int[] answers = { 8, 3, 14, 6, 2, 18, 12, 9, 11, 15, 20, 0, 9, 15, 7, 14, 7, 19, 5, 10, 1, 12, 11, 16, 23, 4, 10, 0, 3, 13, 5, 6, 13, 21, 4, 1, 2, 17, 22, 8 };
        assertEquals(131072L, zoo.theCount(answers));
    }

    @Test
    public void case11() {
        int[] answers = { 6, 15, 8, 6, 3, 2, 15, 7, 1, 17, 0, 4, 12, 16, 5, 19, 13, 9, 14, 10, 12, 2, 8, 14, 3, 20, 11, 11, 7, 10, 21, 18, 13, 1, 9, 16, 4, 5, 22, 0 };
        assertEquals(262144L, zoo.theCount(answers));
    }

    @Test
    public void case12() {
        int[] answers = { 15, 19, 0, 11, 1, 5, 17, 2, 6, 8, 9, 15, 9, 14, 17, 4, 6, 1, 3, 0, 4, 13, 16, 21, 18, 20, 3, 5, 7, 14, 2, 12, 10, 13, 8, 12, 16, 10, 11, 7 };
        assertEquals(524288L, zoo.theCount(answers));
    }

    @Test
    public void case13() {
        int[] answers = { 5, 10, 9, 0, 11, 13, 8, 12, 3, 11, 2, 6, 8, 6, 18, 7, 5, 4, 12, 17, 15, 18, 1, 14, 17, 14, 16, 13, 0, 1, 2, 15, 16, 4, 3, 9, 10, 7, 19, 20 };
        assertEquals(1048576L, zoo.theCount(answers));
    }

    @Test
    public void case14() {
        int[] answers = { 19, 13, 7, 18, 15, 6, 1, 11, 10, 17, 2, 0, 19, 10, 16, 11, 18, 13, 6, 8, 1, 5, 8, 14, 3, 16, 0, 12, 7, 17, 12, 4, 14, 2, 3, 9, 15, 9, 4, 5 };
        assertEquals(1048576L, zoo.theCount(answers));
    }

    @Test
    public void case15() {
        int[] answers = { 2, 0, 12, 6, 18, 7, 5, 17, 2, 21, 12, 9, 0, 10, 6, 11, 13, 3, 8, 1, 14, 16, 14, 22, 15, 1, 7, 20, 10, 4, 11, 4, 19, 8, 9, 23, 3, 13, 5 };
        assertEquals(65536L, zoo.theCount(answers));
    }

    @Test
    public void case16() {
        int[] answers = { 1, 10, 10, 1, 15, 20, 22, 17, 2, 2, 0, 11, 8, 9, 4, 4, 11, 19, 7, 3, 3, 12, 15, 5, 13, 7, 5, 12, 21, 14, 13, 6, 16, 18, 9, 14, 6, 0, 8 };
        assertEquals(131072L, zoo.theCount(answers));
    }

    @Test
    public void case17() {
        int[] answers = { 3, 1, 19, 12, 15, 10, 5, 2, 14, 17, 0, 18, 13, 13, 8, 0, 10, 5, 6, 4, 16, 21, 15, 8, 2, 3, 6, 9, 4, 7, 1, 7, 16, 12, 14, 11, 20, 11, 9 };
        assertEquals(262144L, zoo.theCount(answers));
    }

    @Test
    public void case18() {
        int[] answers = { 1, 10, 3, 2, 4, 9, 12, 14, 18, 3, 5, 4, 11, 13, 6, 9, 15, 10, 7, 15, 19, 12, 0, 8, 1, 7, 6, 11, 17, 5, 8, 2, 17, 14, 16, 16, 0, 13, 20 };
        assertEquals(524288L, zoo.theCount(answers));
    }

    @Test
    public void case19() {
        int[] answers = { 6, 3, 8, 15, 12, 2, 11, 19, 13, 17, 9, 8, 1, 7, 7, 17, 0, 11, 15, 6, 12, 18, 1, 14, 13, 5, 0, 4, 10, 9, 16, 2, 5, 3, 4, 16, 10, 14, 18 };
        assertEquals(1048576L, zoo.theCount(answers));
    }

    @Test
    public void case20() {
        int[] answers = { 5, 20, 17, 29, 32, 9, 12, 26, 2, 35, 19, 1, 15, 7, 25, 13, 31, 39, 16, 34, 0, 30, 21, 23, 8, 14, 18, 33, 11, 22, 10, 36, 37, 28, 6, 3, 27, 38, 24, 4 };
        assertEquals(2L, zoo.theCount(answers));
    }

    @Test
    public void case21() {
        int[] answers = { 34, 31, 13, 27, 2, 0, 38, 32, 25, 3, 20, 15, 29, 6, 19, 17, 7, 37, 5, 0, 8, 36, 24, 18, 4, 28, 35, 26, 16, 22, 11, 30, 9, 21, 10, 1, 33, 12, 23, 14 };
        assertEquals(4L, zoo.theCount(answers));
    }

    @Test
    public void case22() {
        int[] answers = { 23, 2, 19, 15, 37, 34, 33, 0, 16, 22, 0, 6, 31, 35, 11, 29, 25, 7, 10, 1, 8, 14, 27, 26, 18, 20, 32, 9, 4, 3, 5, 1, 13, 17, 36, 21, 24, 12, 30, 28 };
        assertEquals(8L, zoo.theCount(answers));
    }

    @Test
    public void case23() {
        int[] answers = { 27, 8, 36, 18, 26, 35, 23, 31, 5, 0, 0, 15, 17, 33, 11, 7, 12, 30, 28, 16, 21, 13, 25, 4, 1, 19, 1, 20, 14, 10, 2, 6, 32, 24, 2, 3, 9, 34, 29, 22 };
        assertEquals(16L, zoo.theCount(answers));
    }

    @Test
    public void case24() {
        int[] answers = { 24, 10, 0, 4, 8, 2, 23, 1, 14, 7, 28, 22, 13, 3, 1, 11, 9, 26, 5, 19, 27, 32, 17, 29, 25, 12, 33, 20, 31, 21, 16, 3, 15, 18, 34, 30, 6, 35, 2, 0 };
        assertEquals(32L, zoo.theCount(answers));
    }

    @Test
    public void case25() {
        int[] answers = { 32, 11, 18, 1, 12, 8, 16, 38, 10, 7, 36, 9, 0, 17, 19, 24, 35, 31, 30, 26, 23, 15, 34, 4, 3, 20, 2, 21, 5, 33, 13, 22, 25, 27, 29, 37, 14, 6, 28 };
        assertEquals(2L, zoo.theCount(answers));
    }

    @Test
    public void case26() {
        int[] answers = { 15, 35, 7, 22, 9, 17, 13, 12, 27, 29, 24, 32, 25, 2, 0, 3, 8, 18, 20, 37, 23, 14, 34, 11, 28, 30, 5, 33, 6, 36, 1, 10, 31, 26, 4, 21, 16, 0, 19 };
        assertEquals(4L, zoo.theCount(answers));
    }

    @Test
    public void case27() {
        int[] answers = { 26, 23, 29, 28, 1, 27, 19, 16, 5, 9, 14, 31, 21, 3, 25, 11, 30, 32, 18, 12, 33, 10, 1, 15, 2, 13, 0, 8, 0, 34, 4, 24, 6, 36, 35, 17, 7, 22, 20 };
        assertEquals(8L, zoo.theCount(answers));
    }

    @Test
    public void case28() {
        int[] answers = { 10, 13, 35, 19, 21, 12, 34, 1, 11, 7, 5, 17, 29, 20, 23, 3, 15, 30, 2, 31, 9, 0, 1, 28, 18, 33, 25, 8, 32, 27, 0, 24, 4, 2, 26, 14, 22, 6, 16 };
        assertEquals(16L, zoo.theCount(answers));
    }

    @Test
    public void case29() {
        int[] answers = { 23, 8, 34, 0, 6, 10, 31, 27, 12, 19, 26, 20, 1, 4, 2, 11, 21, 24, 2, 13, 29, 14, 30, 32, 5, 22, 33, 3, 0, 9, 7, 3, 18, 1, 28, 15, 17, 25, 16 };
        assertEquals(32L, zoo.theCount(answers));
    }

    @Test
    public void case30() {
        int[] answers = { 0 };
        assertEquals(2L, zoo.theCount(answers));
    }

    @Test
    public void case31() {
        int[] answers = { 0, 1 };
        assertEquals(2L, zoo.theCount(answers));
    }

    @Test
    public void case32() {
        int[] answers = { 2, 1, 0 };
        assertEquals(2L, zoo.theCount(answers));
    }

    @Test
    public void case33() {
        int[] answers = { 1, 3, 2, 0 };
        assertEquals(2L, zoo.theCount(answers));
    }

    @Test
    public void case34() {
        int[] answers = { 0 };
        assertEquals(2L, zoo.theCount(answers));
    }

    @Test
    public void case35() {
        int[] answers = { 0, 0 };
        assertEquals(2L, zoo.theCount(answers));
    }

    @Test
    public void case36() {
        int[] answers = { 0, 0, 1 };
        assertEquals(4L, zoo.theCount(answers));
    }

    @Test
    public void case37() {
        int[] answers = { 0, 0, 1, 2 };
        assertEquals(4L, zoo.theCount(answers));
    }

    @Test
    public void case38() {
        int[] answers = { 0, 1, 0, 2, 3 };
        assertEquals(4L, zoo.theCount(answers));
    }

    @Test
    public void case39() {
        int[] answers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39 };
        assertEquals(2L, zoo.theCount(answers));
    }

    @Test
    public void case40() {
        int[] answers = { 25, 39, 0, 34, 21, 14, 20, 5, 27, 16, 31, 8, 35, 20, 8, 25, 33, 35, 38, 2, 18, 20, 27, 11, 28, 18, 32, 20, 3, 23, 39, 29, 16, 18, 28, 26, 33, 5, 32, 4 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case41() {
        int[] answers = { 9, 31, 21, 10, 12, 26, 11, 15, 23, 21, 1, 19, 22, 39, 21, 2, 6, 27, 29, 29, 12, 1, 10, 11, 17, 16, 2, 1, 40, 11, 22, 14, 34, 17, 13, 37, 18, 15, 9, 26 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case42() {
        int[] answers = { 0, 19, 0, 26, 8, 10, 32, 40, 16, 20, 22, 3, 32, 5, 38, 27, 24, 13, 34, 6, 30, 40, 5, 7, 39, 19, 32, 38, 8, 17, 1, 34, 25, 40, 35, 16, 27, 29, 18, 14 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case43() {
        int[] answers = { 19, 8, 9, 17, 3, 15, 5, 7, 11, 5, 13, 1, 14, 6, 15, 16, 10, 2, 11, 18, 7, 3, 1, 10, 8, 4, 9, 17, 0, 13, 0, 12, 2, 3, 16, 4, 6, 12, 14, 18 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case44() {
        int[] answers = { 9, 18, 8, 1, 7, 2, 9, 3, 17, 5, 15, 13, 12, 18, 12, 1, 13, 8, 14, 11, 4, 0, 0, 11, 4, 14, 10, 3, 7, 15, 19, 6, 6, 16, 5, 16, 2, 17, 6, 10 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case45() {
        int[] answers = { 11, 16, 15, 7, 16, 7, 19, 6, 5, 0, 9, 5, 6, 1, 10, 13, 8, 2, 0, 3, 17, 4, 18, 13, 8, 17, 1, 10, 12, 2, 4, 5, 9, 15, 14, 18, 14, 3, 11, 12 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case46() {
        int[] answers = { 5, 0, 4, 16, 3, 15, 7, 5, 10, 0, 16, 4, 8, 15, 12, 17, 18, 10, 19, 7, 14, 13, 6, 18, 6, 11, 11, 2, 9, 1, 3, 8, 14, 17, 2, 9, 13, 19, 1 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case47() {
        int[] answers = { 0, 11, 19, 6, 14, 4, 17, 12, 3, 8, 9, 17, 1, 19, 14, 1, 15, 10, 3, 15, 7, 2, 11, 16, 0, 5, 16, 13, 7, 5, 2, 13, 18, 12, 9, 8, 6, 18, 10 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case48() {
        int[] answers = { 12, 16, 3, 1, 0, 7, 5, 4, 3, 2, 7, 19, 18, 15, 1, 14, 18, 10, 0, 13, 17, 17, 4, 11, 16, 9, 15, 5, 2, 9, 12, 11, 8, 10, 6, 14, 8, 6, 13 };
        assertEquals(1048576L, zoo.theCount(answers));
    }

    @Test
    public void case49() {
        int[] answers = { 16, 9, 3, 2, 5, 12, 0, 17, 19, 1, 15, 5, 18, 9, 14, 14, 7, 1, 6, 4, 8, 8, 6, 2, 10, 4, 13, 7, 3, 11, 0 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case50() {
        int[] answers = { 11, 12, 2, 10, 3, 1, 13, 17, 8, 18, 19, 5, 6, 4, 15, 9, 8, 11, 2, 16, 3, 7, 1, 5, 6, 0, 9, 0, 4, 7, 14 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case51() {
        int[] answers = { 5, 1, 13, 6, 0, 6, 10, 1, 15, 5, 12, 11, 7, 3, 14, 9, 17, 8, 7, 16, 4, 4, 13, 2, 8, 9, 19, 2, 0, 18, 3 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case52() {
        int[] answers = { 1, 0, 1 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case53() {
        int[] answers = { 0, 1, 2, 3, 4 };
        assertEquals(2L, zoo.theCount(answers));
    }

    @Test
    public void case54() {
        int[] answers = { 0, 0 };
        assertEquals(2L, zoo.theCount(answers));
    }

    @Test
    public void case55() {
        int[] answers = { 0, 1, 1, 0 };
        assertEquals(4L, zoo.theCount(answers));
    }

    @Test
    public void case56() {
        int[] answers = { 40, 40 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case57() {
        int[] answers = { 0, 0, 1, 1 };
        assertEquals(4L, zoo.theCount(answers));
    }

    @Test
    public void case58() {
        int[] answers = { 0, 1, 2, 3, 0, 1, 2, 3 };
        assertEquals(16L, zoo.theCount(answers));
    }

    @Test
    public void case59() {
        int[] answers = { 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 19, 19 };
        assertEquals(1048576L, zoo.theCount(answers));
    }

    @Test
    public void case60() {
        int[] answers = { 1, 1, 0, 0 };
        assertEquals(4L, zoo.theCount(answers));
    }

    @Test
    public void case61() {
        int[] answers = { 0, 1, 0, 1 };
        assertEquals(4L, zoo.theCount(answers));
    }

    @Test
    public void case62() {
        int[] answers = { 0, 1, 2, 0, 1, 2 };
        assertEquals(8L, zoo.theCount(answers));
    }

    @Test
    public void case63() {
        int[] answers = { 0, 1, 0, 1, 2, 3, 4, 5 };
        assertEquals(8L, zoo.theCount(answers));
    }

    @Test
    public void case64() {
        int[] answers = { 0 };
        assertEquals(2L, zoo.theCount(answers));
    }

    @Test
    public void case65() {
        int[] answers = { 0, 0, 1, 1, 2, 2, 3, 4, 5 };
        assertEquals(16L, zoo.theCount(answers));
    }

    @Test
    public void case66() {
        int[] answers = { 0, 0, 1, 2, 2 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case67() {
        int[] answers = { 1, 0, 0, 1 };
        assertEquals(4L, zoo.theCount(answers));
    }

    @Test
    public void case68() {
        int[] answers = { 0, 0, 2, 2 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case69() {
        int[] answers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18 };
        assertEquals(524288L, zoo.theCount(answers));
    }

    @Test
    public void case70() {
        int[] answers = { 0, 1, 2, 3, 4, 5 };
        assertEquals(2L, zoo.theCount(answers));
    }

    @Test
    public void case71() {
        int[] answers = { 14, 18, 9, 4, 19, 9, 8, 3, 1, 10, 11, 2, 13, 0, 15, 1, 6, 5, 0, 2, 3, 17, 12, 7, 16, 17, 6, 11, 14, 13, 4, 5, 7, 8, 15, 10, 16, 19, 12, 18 };
        assertEquals(1048576L, zoo.theCount(answers));
    }

    @Test
    public void case72() {
        int[] answers = { 1, 2, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case73() {
        int[] answers = { 0, 0, 1, 1, 2, 3, 4, 5, 6 };
        assertEquals(8L, zoo.theCount(answers));
    }

    @Test
    public void case74() {
        int[] answers = { 0, 0, 0 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case75() {
        int[] answers = { 0, 0, 1, 1, 2, 2, 3, 3, 4, 4 };
        assertEquals(32L, zoo.theCount(answers));
    }

    @Test
    public void case76() {
        int[] answers = { 0, 0, 1, 1, 2, 2 };
        assertEquals(8L, zoo.theCount(answers));
    }

    @Test
    public void case77() {
        int[] answers = { 0, 0, 1, 2, 3, 4 };
        assertEquals(4L, zoo.theCount(answers));
    }

    @Test
    public void case78() {
        int[] answers = { 12, 1, 2, 3, 4, 3, 12, 12, 2, 3, 2, 2, 3, 2, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3, 3, 3, 3, 1, 1, 1 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case79() {
        int[] answers = { 1, 2, 3, 4, 5, 6, 0 };
        assertEquals(2L, zoo.theCount(answers));
    }

    @Test
    public void case80() {
        int[] answers = { 0, 1, 2, 3, 4, 5, 5, 4, 3, 2, 1, 0 };
        assertEquals(64L, zoo.theCount(answers));
    }

    @Test
    public void case81() {
        int[] answers = { 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
        assertEquals(64L, zoo.theCount(answers));
    }

    @Test
    public void case82() {
        int[] answers = { 0, 0, 1, 1, 2, 2, 3, 3 };
        assertEquals(16L, zoo.theCount(answers));
    }

    @Test
    public void case83() {
        int[] answers = { 1, 0, 2, 0, 1 };
        assertEquals(8L, zoo.theCount(answers));
    }

    @Test
    public void case84() {
        int[] answers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
        assertEquals(1048576L, zoo.theCount(answers));
    }

    @Test
    public void case85() {
        int[] answers = { 0, 0, 1, 1, 2, 3 };
        assertEquals(8L, zoo.theCount(answers));
    }

    @Test
    public void case86() {
        int[] answers = { 0, 1, 2, 3, 4, 0 };
        assertEquals(4L, zoo.theCount(answers));
    }

    @Test
    public void case87() {
        int[] answers = { 0, 0, 1, 1, 1 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case88() {
        int[] answers = { 1 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case89() {
        int[] answers = { 0, 0, 1, 1, 2, 2, 3, 4, 4, 5, 5, 6, 7, 8 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case90() {
        int[] answers = { 0, 1, 2, 3, 4, 6, 7, 8, 5, 0, 1, 2 };
        assertEquals(16L, zoo.theCount(answers));
    }

    @Test
    public void case91() {
        int[] answers = { 0, 1, 2, 3, 0, 1, 0 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case92() {
        int[] answers = { 0, 1, 5 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case93() {
        int[] answers = { 0, 0, 1 };
        assertEquals(4L, zoo.theCount(answers));
    }

    @Test
    public void case94() {
        int[] answers = { 0, 1, 2, 3, 0, 1 };
        assertEquals(8L, zoo.theCount(answers));
    }

    @Test
    public void case95() {
        int[] answers = { 0, 0, 1, 1, 2, 2, 3, 3, 4, 5, 6 };
        assertEquals(32L, zoo.theCount(answers));
    }

    @Test
    public void case96() {
        int[] answers = { 0, 2 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case97() {
        int[] answers = { 0, 1, 0, 1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10, 3, 4, 5, 6, 7, 8, 9, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 19, 19 };
        assertEquals(1048576L, zoo.theCount(answers));
    }

    @Test
    public void case98() {
        int[] answers = { 0, 1, 0, 1, 2, 2 };
        assertEquals(8L, zoo.theCount(answers));
    }

    @Test
    public void case99() {
        int[] answers = { 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        assertEquals(64L, zoo.theCount(answers));
    }

    @Test
    public void case100() {
        int[] answers = { 0, 0, 2, 2, 1, 1 };
        assertEquals(8L, zoo.theCount(answers));
    }

    @Test
    public void case101() {
        int[] answers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 13, 14, 15 };
        assertEquals(131072L, zoo.theCount(answers));
    }

    @Test
    public void case102() {
        int[] answers = { 0, 0, 1, 2, 3 };
        assertEquals(4L, zoo.theCount(answers));
    }

    @Test
    public void case103() {
        int[] answers = { 0, 0, 1, 1, 3 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case104() {
        int[] answers = { 1, 1, 1 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case105() {
        int[] answers = { 0, 1, 0, 1, 2, 3, 4, 5, 6, 7 };
        assertEquals(8L, zoo.theCount(answers));
    }

    @Test
    public void case106() {
        int[] answers = { 1, 1, 0, 0, 2, 2, 3, 4, 5, 6 };
        assertEquals(16L, zoo.theCount(answers));
    }

    @Test
    public void case107() {
        int[] answers = { 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8 };
        assertEquals(512L, zoo.theCount(answers));
    }

    @Test
    public void case108() {
        int[] answers = { 0, 1, 2, 1, 2 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case109() {
        int[] answers = { 3, 1, 1, 2, 0, 3, 0, 2 };
        assertEquals(16L, zoo.theCount(answers));
    }

    @Test
    public void case110() {
        int[] answers = { 0, 0, 1, 2, 3, 3 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case111() {
        int[] answers = { 0, 0, 1, 1, 2, 3, 4 };
        assertEquals(8L, zoo.theCount(answers));
    }

    @Test
    public void case112() {
        int[] answers = { 0, 1, 2, 3, 4, 0, 1, 2, 3, 4 };
        assertEquals(32L, zoo.theCount(answers));
    }

    @Test
    public void case113() {
        int[] answers = { 1, 1, 2, 2 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case114() {
        int[] answers = { 40 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case115() {
        int[] answers = { 0, 0, 1, 2, 3, 4, 5, 6, 7 };
        assertEquals(4L, zoo.theCount(answers));
    }

    @Test
    public void case116() {
        int[] answers = { 1, 0, 2, 1, 1 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case117() {
        int[] answers = { 1, 2 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case118() {
        int[] answers = { 0, 0, 1, 1, 3, 2, 3, 2, 4, 4, 5, 5 };
        assertEquals(64L, zoo.theCount(answers));
    }

    @Test
    public void case119() {
        int[] answers = { 0, 0, 1, 1, 2, 2, 3, 4, 5, 6 };
        assertEquals(16L, zoo.theCount(answers));
    }

    @Test
    public void case120() {
        int[] answers = { 0, 0, 1, 1, 2, 2, 3, 3, 4, 5 };
        assertEquals(32L, zoo.theCount(answers));
    }

    @Test
    public void case121() {
        int[] answers = { 0, 1, 0 };
        assertEquals(4L, zoo.theCount(answers));
    }

    @Test
    public void case122() {
        int[] answers = { 1, 2, 3, 0, 1, 2, 3, 0, 4, 5, 6, 4, 5, 6 };
        assertEquals(128L, zoo.theCount(answers));
    }

    @Test
    public void case123() {
        int[] answers = { 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 19 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case124() {
        int[] answers = { 0, 1, 0, 1, 3 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case125() {
        int[] answers = { 1, 0, 2, 0, 1, 3, 4, 5, 3 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case126() {
        int[] answers = { 4, 4, 3, 3, 2, 2, 1, 1, 0, 0 };
        assertEquals(32L, zoo.theCount(answers));
    }

    @Test
    public void case127() {
        int[] answers = { 0, 0, 1, 1, 2, 3, 3 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case128() {
        int[] answers = { 1, 0, 0, 1, 2, 2 };
        assertEquals(8L, zoo.theCount(answers));
    }

    @Test
    public void case129() {
        int[] answers = { 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 12 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case130() {
        int[] answers = { 0, 0, 1, 1, 2, 2, 3, 3, 4, 14, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 19, 20 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case131() {
        int[] answers = { 0, 0, 1, 2, 5 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case132() {
        int[] answers = { 0, 0, 1, 2 };
        assertEquals(4L, zoo.theCount(answers));
    }

    @Test
    public void case133() {
        int[] answers = { 1, 1 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case134() {
        int[] answers = { 1, 0, 2, 0, 1, 2 };
        assertEquals(8L, zoo.theCount(answers));
    }

    @Test
    public void case135() {
        int[] answers = { 0, 0, 1, 1, 2, 3, 4, 5 };
        assertEquals(8L, zoo.theCount(answers));
    }

    @Test
    public void case136() {
        int[] answers = { 1, 0, 1, 0 };
        assertEquals(4L, zoo.theCount(answers));
    }

    @Test
    public void case137() {
        int[] answers = { 0, 0, 1, 1, 2, 7, 2, 3, 4, 5, 6 };
        assertEquals(16L, zoo.theCount(answers));
    }

    @Test
    public void case138() {
        int[] answers = { 0, 1, 2, 0, 1, 2, 4 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case139() {
        int[] answers = { 0, 0, 1, 2, 2, 2 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case140() {
        int[] answers = { 0, 0, 0, 1, 1, 1, 3, 3 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case141() {
        int[] answers = { 0, 1, 2, 2, 0, 1 };
        assertEquals(8L, zoo.theCount(answers));
    }

    @Test
    public void case142() {
        int[] answers = { 7, 6, 5 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case143() {
        int[] answers = { 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18 };
        assertEquals(524288L, zoo.theCount(answers));
    }

    @Test
    public void case144() {
        int[] answers = { 3, 2, 1, 0, 2, 1, 0 };
        assertEquals(16L, zoo.theCount(answers));
    }

    @Test
    public void case145() {
        int[] answers = { 0, 1, 3 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case146() {
        int[] answers = { 3 };
        assertEquals(0L, zoo.theCount(answers));
    }

    @Test
    public void case147() {
        int[] answers = { 0, 0, 1, 2, 3, 4, 5 };
        assertEquals(4L, zoo.theCount(answers));
    }

}
