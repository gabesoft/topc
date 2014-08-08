package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class SplitStoneGameTest {
    SplitStoneGame splitstonegame = new SplitStoneGame();

    @Test
    public void case1() {
        int[] number = { 1, 1, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case2() {
        int[] number = { 2, 2 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case3() {
        int[] number = { 1, 1, 2 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case4() {
        int[] number = { 1, 2, 3, 4, 3, 2, 2, 4, 3, 1, 4, 4, 1, 2, 4, 4, 1, 4, 3, 1, 4, 2, 1 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case5() {
        int[] number = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 3, 1, 9, 1, 3, 1, 1, 1, 1, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case6() {
        int[] number = { 1, 1, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case7() {
        int[] number = { 19, 11, 30, 13, 1, 28, 24, 31, 15, 7, 1, 29, 1, 1, 10, 16, 27, 29, 23, 32, 8, 12, 8, 7, 1, 1, 5, 1, 30, 1, 26, 32 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case8() {
        int[] number = { 2, 1, 1, 28, 1, 1, 16, 5, 22, 1, 13, 26, 1, 1, 9, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case9() {
        int[] number = { 22, 49, 33, 22, 1, 47, 44, 1, 4, 6, 1, 18, 34, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case10() {
        int[] number = { 1, 1, 1, 1, 2, 1, 8, 2, 8, 1, 5, 20, 1, 1, 1, 1, 27, 1, 1, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case11() {
        int[] number = { 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case12() {
        int[] number = { 1, 1, 1, 1, 1, 1, 1, 1, 6, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case13() {
        int[] number = { 1, 1, 1, 1, 1, 1, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case14() {
        int[] number = { 2, 1, 2, 2, 1, 3, 1, 2, 4, 1, 4, 1, 1, 2, 2, 2, 2, 1, 4, 4, 4, 4, 3 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case15() {
        int[] number = { 1, 8, 10, 1, 1, 1, 1, 1, 1, 1, 1, 22, 5, 1, 1, 1, 16, 1, 1, 1, 1, 1, 23, 1, 22, 7, 1, 1, 1, 1, 1, 1, 1, 1, 15, 1, 9, 1, 1 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case16() {
        int[] number = { 1, 2, 1, 1, 6, 1, 2, 1, 1, 5, 6, 6, 1, 5, 1, 4, 1, 1, 1, 1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6, 1, 1, 1, 2, 1, 1, 1, 4 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case17() {
        int[] number = { 5, 1, 30, 13, 19, 28, 15, 19, 9, 16, 1, 19, 28, 24, 21, 15, 20, 15, 25, 4, 1, 1, 3, 14, 17, 13, 22, 1, 17, 2 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case18() {
        int[] number = { 37, 1, 1, 1, 1, 12, 1, 4, 34, 6, 1, 1, 1, 1, 11, 39, 1, 24, 7, 34, 39, 19, 39, 1, 9, 1, 11, 1, 32, 21, 20, 1, 1, 1, 35, 36, 5, 5, 1, 38, 1, 1, 1, 20, 18, 26, 31 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case19() {
        int[] number = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 14, 5, 1, 1, 1, 1, 1, 4, 1, 5, 4, 1, 1, 1, 1, 1, 19, 1, 1, 1, 1, 2, 12, 6 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case20() {
        int[] number = { 1, 1, 1, 1, 2, 1, 1, 1, 1, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case21() {
        int[] number = { 2, 2, 2, 2, 3, 3, 2, 3, 2, 2, 1, 1, 2, 1, 1, 1, 2, 1, 2, 1, 3, 3, 1, 2, 3, 2, 2, 1, 2, 2, 1, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case22() {
        int[] number = { 15, 1, 1, 12, 1, 9, 1, 1, 25, 25, 12, 19, 22, 19, 1, 1, 14, 3, 22, 1, 16, 16, 16, 21, 1, 1, 20, 12, 1, 13, 1, 17, 21, 7, 20, 10, 22, 15, 23, 1, 3, 20, 21, 25, 2, 17, 10, 9, 1, 25 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case23() {
        int[] number = { 8, 2, 15, 4, 8, 9, 20, 12, 13, 11, 19 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case24() {
        int[] number = { 1, 1, 4, 29, 1, 1, 1, 31, 1, 6, 1, 1, 28, 22, 1, 1, 1, 1, 1, 1, 1, 1, 33, 17, 22, 1, 1, 24, 1, 1, 1, 1, 14, 18, 24, 27, 14, 1, 1, 1, 1, 1, 1, 1, 5, 1, 1 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case25() {
        int[] number = { 8, 3, 7, 15, 10, 3, 1, 1, 14, 2, 4, 6, 6, 7, 14, 1, 4, 6, 1, 8, 5, 8, 1, 7, 5, 1, 15, 9, 10, 12, 8, 2, 6, 1, 2, 7, 1, 11, 1, 10, 13, 14, 2, 5 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case26() {
        int[] number = { 4, 2, 2, 9, 18, 3, 18, 9 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case27() {
        int[] number = { 1, 10, 1, 4, 1, 1, 1, 1, 5, 4, 1, 1, 7, 1, 7, 8, 8, 2, 8, 6, 1, 1, 1, 2, 1, 1, 12, 1, 2, 12, 3, 1, 1, 4, 1, 12, 1, 1, 1 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case28() {
        int[] number = { 3, 6, 1, 2, 1, 3, 1, 4, 5, 2, 2, 4, 4, 2, 1, 3, 1, 4, 1, 1, 1, 4, 1, 5, 1, 6, 1, 1, 4, 4, 6, 2, 1, 2, 1, 4, 1, 3, 6, 4, 1, 3, 5, 1, 3, 2, 5 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case29() {
        int[] number = { 26, 1, 41, 40, 33, 31, 1, 1, 1, 1, 1, 1, 1, 1, 23, 3, 30, 1, 11, 1, 3, 1, 1, 8, 1, 1, 6, 16, 28, 1, 6, 1, 1, 1, 17, 29, 1, 1, 34, 24, 1, 1, 42 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case30() {
        int[] number = { 1, 25, 1, 1, 4, 1, 1, 1, 1, 25, 1, 1, 1, 1, 1, 1, 23, 15, 1, 1, 26, 1, 1 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case31() {
        int[] number = { 1, 1, 1, 1, 1, 31, 1, 13, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 8 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case32() {
        int[] number = { 1, 33, 1, 1, 41, 1, 1, 1, 1, 32, 1, 1, 1, 1, 1, 16, 1, 3, 1, 1, 1, 1, 8, 1, 1, 1, 1, 1, 1, 1, 1, 4, 1, 1, 33, 32, 1, 6, 1, 1, 1, 1, 11, 1, 1, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case33() {
        int[] number = { 3, 15, 21, 1, 1, 16, 1, 13, 17, 17, 1, 1, 8, 19, 1, 9 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case34() {
        int[] number = { 1, 1, 1, 1, 1, 6, 1, 1, 3, 1, 1, 8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 7, 1, 4, 1, 5, 1, 1 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case35() {
        int[] number = { 10, 7, 1, 1, 17, 1, 13, 13, 1, 1, 3, 7, 8, 12, 6, 19, 14, 14, 9, 19, 11, 13, 11, 4, 6, 1, 7, 2, 10, 10, 13 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case36() {
        int[] number = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 46, 1, 1, 1 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case37() {
        int[] number = { 15, 10, 6, 12, 17, 23, 4, 1, 17, 15, 21 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case38() {
        int[] number = { 1, 7, 1, 13, 1, 29, 26, 8, 16, 1, 21, 10, 1, 11, 1, 1, 16, 14, 1 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case39() {
        int[] number = { 1, 11, 1, 7, 14, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 17, 16, 1, 1, 2, 10, 1, 1, 1, 1, 8, 1, 1, 1, 11, 1, 4, 1, 1, 1 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case40() {
        int[] number = { 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 19, 1, 16, 25, 1, 1, 19, 1, 1, 5, 24, 1, 1, 1, 1, 1, 1, 21, 1, 1, 15, 1, 21, 1, 1, 25, 20, 20, 10, 1, 1, 1, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case41() {
        int[] number = { 10, 1, 9, 2, 1, 1, 1, 1, 1, 9, 1, 8, 1, 1, 1, 10, 12, 1, 1, 4, 1, 9, 1, 6, 1, 1, 1, 1, 1, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case42() {
        int[] number = { 7, 3, 1, 8, 11, 13, 5, 1, 8, 9, 13, 4, 7, 1, 2, 4, 1, 1, 11 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case43() {
        int[] number = { 26, 1, 35, 7, 24, 1, 1, 1, 47, 26, 1, 38, 2, 38, 13, 1, 1, 1, 1, 24, 1, 40, 23, 39, 1, 21, 1 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case44() {
        int[] number = { 18, 12, 18, 1, 21, 18, 1, 2, 22, 1, 15, 26, 7, 1, 7, 10, 1, 1, 1, 27, 1, 24, 8 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case45() {
        int[] number = { 1, 1, 1, 1, 44, 1, 1, 1, 1, 42, 1, 1, 17, 1, 1, 18, 10, 1, 1, 1, 1, 1, 1, 21, 1, 1, 48, 1, 1, 1, 1, 1, 1, 23, 1, 44, 23, 17, 1, 13, 1, 1, 5 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case46() {
        int[] number = { 1, 6, 1, 1, 1, 1, 10, 8, 4, 1, 5, 4, 1, 4, 1, 1, 1, 7, 1, 9, 5, 9, 1, 6, 3, 1, 7, 1, 1, 1, 7, 1, 1, 1, 6, 8, 1, 1, 1, 7, 1, 6, 2, 6, 1, 1, 2, 3, 8 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case47() {
        int[] number = { 3, 1, 3, 2, 3, 2, 1, 2, 2, 4, 4, 2, 4, 3, 2, 1, 4, 2, 4, 4, 3, 2, 2, 4 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case48() {
        int[] number = { 1, 9, 2, 12, 6, 8, 5, 5, 8, 15, 3 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case49() {
        int[] number = { 1, 1, 1, 1, 1, 26, 1, 1, 1, 1, 47, 1, 1, 1, 1, 43, 1, 7, 1, 1, 1, 1, 1, 1, 39, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case50() {
        int[] number = { 1, 1, 1, 1, 6, 1, 33, 1, 35, 1, 1, 1, 1, 1, 1, 1, 1, 6, 1, 16, 1, 1, 1, 39, 12, 1, 1, 1, 1, 1, 1, 16, 1, 1, 1, 17, 1, 1, 26, 46 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case51() {
        int[] number = { 25, 3, 1, 12, 19, 23, 26, 7, 5, 15, 13 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case52() {
        int[] number = { 26, 13, 23, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case53() {
        int[] number = { 1, 40, 1, 1, 1, 14, 24, 1, 1, 1, 1, 1, 1, 1, 1, 35, 1, 1, 1, 12, 1, 1, 1 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case54() {
        int[] number = { 20, 19, 3, 3, 4, 1, 5, 7, 1, 1, 10 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case55() {
        int[] number = { 1, 14, 12, 14, 1, 1, 1, 1, 10, 7, 13, 11 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case56() {
        int[] number = { 1, 1, 1, 1, 1, 1, 1, 30, 1, 1, 1, 19, 1, 1, 1, 1, 1 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case57() {
        int[] number = { 11, 5, 7, 1, 7, 5, 5, 10, 13, 10, 13, 2, 10, 8, 4 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case58() {
        int[] number = { 1, 1, 1, 1, 1, 1, 23, 1, 1, 13, 17, 40, 1, 1, 1, 1, 1, 1, 1, 1, 1, 28, 1, 29, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 43, 1, 1, 1, 1, 1, 37, 41, 1, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case59() {
        int[] number = { 11, 1, 5, 1, 1, 1, 1, 1, 1, 1, 1, 14, 1, 13, 1, 1, 1, 6, 1, 1, 1, 1, 1, 5, 1, 1, 1, 11, 4, 7, 1, 7, 11, 1, 1 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case60() {
        int[] number = { 1, 1, 4, 1, 25, 1, 1, 19, 24, 1, 1, 1, 1, 20, 1, 1, 1, 12, 12, 1, 1, 1, 1, 19, 1, 7, 1, 1, 1, 3, 22, 1, 16 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case61() {
        int[] number = { 22, 20, 1, 27, 1, 1, 1, 1, 1, 16, 1, 23, 1, 5, 11, 1, 3, 1, 21, 3, 1, 1, 20, 6, 19, 18, 3, 1, 1, 27, 1, 6, 19, 13, 10, 24, 23, 27, 21, 10, 24, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case62() {
        int[] number = { 1, 1, 1, 13, 1, 15, 1, 16, 36, 1, 1, 11, 18, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case63() {
        int[] number = { 3, 1, 2, 1, 1, 2, 1, 6, 4, 1, 1, 6, 1, 1, 1, 1, 1, 6, 1, 2, 4, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case64() {
        int[] number = { 2, 1, 16, 1, 1, 1, 21, 34, 26, 2, 1, 27, 17, 31, 29, 1, 1, 1, 1, 30, 7, 1, 6, 1, 35, 11, 9, 1, 8, 4, 29, 1, 23, 5, 34, 1, 1, 1, 2 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case65() {
        int[] number = { 8, 26, 41, 1, 1, 34, 24, 22, 30, 1, 1, 1, 4, 1, 1, 4, 1, 31, 1, 40, 35, 46, 9, 21, 8, 23, 22, 1, 45, 1, 1, 11, 1, 23, 1, 43, 32, 19, 46, 25, 47, 27, 8 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case66() {
        int[] number = { 1, 1, 1, 1, 1, 1, 1, 1, 34, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 25, 1, 1, 1, 1, 1, 1 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case67() {
        int[] number = { 11, 6, 8, 2, 11, 7, 6, 3, 9, 4, 9, 8, 5, 7, 6, 8, 3, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case68() {
        int[] number = { 7, 3, 3, 5, 12, 1, 15, 8, 7, 1, 16, 1, 17, 6, 1, 16 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case69() {
        int[] number = { 1, 16, 13, 13, 4, 4, 1, 1, 5, 16, 1, 1, 9, 1, 23, 12, 23, 1, 22, 19, 5, 3, 1, 9, 14, 18, 1, 22, 1, 1, 1, 5, 15, 10, 18, 10, 6, 15, 7, 1, 12, 4, 3 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case70() {
        int[] number = { 1, 1, 1, 1, 1, 20, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case71() {
        int[] number = { 6, 5, 2 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case72() {
        int[] number = { 9, 22, 7, 25, 1, 1, 1, 1, 17, 2, 19, 1, 6, 14, 1, 4, 1, 1, 1, 7, 7, 26, 2, 23, 9, 2, 1, 19, 2, 25, 1, 16, 23, 1, 1, 26, 1, 1, 6 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case73() {
        int[] number = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 23, 19, 1, 1, 1, 1, 5, 1, 1, 1, 1, 1, 1, 23, 18, 1, 1, 1, 1, 1, 1, 22, 1, 24, 1, 3 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case74() {
        int[] number = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case75() {
        int[] number = { 9, 1, 16, 2, 3, 17, 23, 25 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case76() {
        int[] number = { 1, 1, 1, 8, 1, 1, 16, 1, 1, 1, 7, 1, 1, 18, 1, 1, 1, 1, 1, 9, 1, 1, 12, 1, 1, 1, 1, 1, 10, 1, 12, 1, 7, 1, 1, 7, 1, 18, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case77() {
        int[] number = { 11, 8, 5, 1, 1, 2, 1, 23, 7, 1, 3, 21, 1, 11, 8, 1, 23, 11, 1, 25, 20, 15, 13, 1, 15, 1, 22, 2, 3, 1, 6, 27, 1, 21, 1, 1, 1, 24, 1, 21, 1, 25, 1, 20, 1 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case78() {
        int[] number = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case79() {
        int[] number = { 18, 2, 1, 1, 1, 13, 24, 1, 1, 20, 2, 1, 22, 21, 23, 17, 6, 10, 1, 15, 2, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case80() {
        int[] number = { 1, 28, 1, 1, 28, 1, 1, 1, 1, 16, 17, 15, 1, 1, 1, 15, 12, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 23, 1, 1, 3, 24 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case81() {
        int[] number = { 5, 10, 1, 3, 9, 5, 3, 1, 1, 4, 2, 10, 6, 6, 6, 2, 4, 7, 8, 1, 9, 5, 2 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case82() {
        int[] number = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case83() {
        int[] number = { 11, 1, 2, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case84() {
        int[] number = { 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case85() {
        int[] number = { 1, 1, 1, 1, 1, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case86() {
        int[] number = { 1, 1, 1, 1, 1, 1, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case87() {
        int[] number = { 2 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case88() {
        int[] number = { 10 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case89() {
        int[] number = { 4 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case90() {
        int[] number = { 2, 2 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case91() {
        int[] number = { 5 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case92() {
        int[] number = { 1, 1, 1, 1, 1, 1, 1, 2 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case93() {
        int[] number = { 3 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case94() {
        int[] number = { 1, 1, 1, 2 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case95() {
        int[] number = { 2 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case96() {
        int[] number = { 1, 2, 1, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case97() {
        int[] number = { 3, 1, 1, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case98() {
        int[] number = { 1, 2, 2, 2 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case99() {
        int[] number = { 1, 2 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case100() {
        int[] number = { 1, 1, 1, 1, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case101() {
        int[] number = { 1, 1, 2, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case102() {
        int[] number = { 1, 1, 1, 1, 1, 2 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case103() {
        int[] number = { 2, 2, 1 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case104() {
        int[] number = { 1, 1, 1, 3, 3, 3 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case105() {
        int[] number = { 1, 3, 3 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case106() {
        int[] number = { 1, 1, 1, 1, 1, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case107() {
        int[] number = { 1, 4, 1, 3, 2, 1, 3, 2 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case108() {
        int[] number = { 2, 2, 2, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case109() {
        int[] number = { 1, 1, 1, 4 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case110() {
        int[] number = { 5, 1, 1, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case111() {
        int[] number = { 1, 2, 2 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case112() {
        int[] number = { 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case113() {
        int[] number = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case114() {
        int[] number = { 32 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case115() {
        int[] number = { 1, 19, 1, 1, 1, 41, 41, 1, 31, 1, 1, 1, 48, 1, 49, 1, 30, 1, 40, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case116() {
        int[] number = { 1, 1, 1, 1, 50, 50, 50, 1, 1, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case117() {
        int[] number = { 1, 1, 2, 2 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case118() {
        int[] number = { 1, 2, 2, 2, 2 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

    @Test
    public void case119() {
        int[] number = { 2, 1 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case120() {
        int[] number = { 2, 4, 2, 4, 4, 3 };
        assertEquals("LOSE", splitstonegame.winOrLose(number));
    }

    @Test
    public void case121() {
        int[] number = { 1, 1, 2 };
        assertEquals("WIN", splitstonegame.winOrLose(number));
    }

}
