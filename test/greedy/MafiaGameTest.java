package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class MafiaGameTest {
    double DELTA = 1.0e-09;
    MafiaGame mafiagame = new MafiaGame();

    @Test
    public void case1() {
        int N = 3;
        int[] decisions = { 1, 1, 1 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case2() {
        int N = 20;
        int[] decisions = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case3() {
        int N = 500;
        int[] decisions = { 1, 2, 1 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case4() {
        int N = 5;
        int[] decisions = { 1, 2, 3 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case5() {
        int N = 20;
        int[] decisions = { 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 18, 19, 0 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case6() {
        int N = 23;
        int[] decisions = { 17, 10, 3, 14, 22, 5, 11, 10, 22, 3, 14, 5, 11, 17 };
        assertEquals(0.14285714285714285, mafiagame.probabilityToLose(N, decisions), DELTA * 0.14285714285714285);
    }

    @Test
    public void case7() {
        int N = 3;
        int[] decisions = { 2, 1 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case8() {
        int N = 4;
        int[] decisions = { 0, 1 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case9() {
        int N = 5;
        int[] decisions = { 4, 3, 3 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case10() {
        int N = 6;
        int[] decisions = { 4, 2, 5 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case11() {
        int N = 7;
        int[] decisions = { 5, 6, 6, 0 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case12() {
        int N = 8;
        int[] decisions = { 3, 3, 6, 3 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case13() {
        int N = 8;
        int[] decisions = { 4, 7, 4, 6, 1, 4, 6 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case14() {
        int N = 2;
        int[] decisions = { 1, 1 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case15() {
        int N = 9;
        int[] decisions = { 0, 2, 0, 6, 4, 8, 1, 7 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case16() {
        int N = 10;
        int[] decisions = { 4, 3, 1, 2, 3 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case17() {
        int N = 10;
        int[] decisions = { 3, 4, 1, 1, 3, 8, 7, 4 };
        assertEquals(0.3333333333333333, mafiagame.probabilityToLose(N, decisions), DELTA * 0.3333333333333333);
    }

    @Test
    public void case18() {
        int N = 11;
        int[] decisions = { 3 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case19() {
        int N = 21;
        int[] decisions = { 18, 3 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case20() {
        int N = 31;
        int[] decisions = { 25, 12 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case21() {
        int N = 41;
        int[] decisions = { 24, 18, 40 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case22() {
        int N = 51;
        int[] decisions = { 25, 26, 5 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case23() {
        int N = 61;
        int[] decisions = { 12, 44, 33, 12 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case24() {
        int N = 71;
        int[] decisions = { 67, 23, 70, 40 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case25() {
        int N = 71;
        int[] decisions = { 20, 57, 55, 17, 14, 25, 3 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case26() {
        int N = 81;
        int[] decisions = { 12, 65, 27, 68, 27 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case27() {
        int N = 81;
        int[] decisions = { 28, 45, 14, 25, 5, 80, 64, 15 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case28() {
        int N = 91;
        int[] decisions = { 43, 56, 39, 77, 62 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case29() {
        int N = 91;
        int[] decisions = { 11, 80, 88, 70, 10, 84, 89, 83 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case30() {
        int N = 41;
        int[] decisions = { 31, 8, 37, 10, 21, 0, 19, 4, 28, 7, 38, 7, 4, 34, 13, 30, 1, 6, 18, 22, 10, 3, 39, 35, 13, 39, 3, 2, 8, 35, 26, 27, 29, 15, 8, 21, 0, 28, 37, 10 };
        assertEquals(0.5, mafiagame.probabilityToLose(N, decisions), DELTA * 0.5);
    }

    @Test
    public void case31() {
        int N = 42;
        int[] decisions = { 35, 5, 37, 14, 29, 24, 38, 40, 38, 10, 33, 20, 18, 41, 30, 17, 22, 17, 30, 41, 2, 15, 1, 9, 32, 32, 1, 8, 8, 16, 18, 39, 6, 15, 12, 40, 7, 30, 11, 25 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case32() {
        int N = 43;
        int[] decisions = { 16, 31, 20, 4, 24, 37, 30, 15, 9, 37, 5, 13, 34, 38, 23, 11, 33, 5, 15, 36, 3, 3, 7, 37, 8, 31, 32, 0, 39, 15, 25, 22, 13, 17, 40, 24, 36, 39, 31, 0 };
        assertEquals(0.3333333333333333, mafiagame.probabilityToLose(N, decisions), DELTA * 0.3333333333333333);
    }

    @Test
    public void case33() {
        int N = 44;
        int[] decisions = { 12, 32, 38, 18, 32, 40, 14, 13, 9, 30, 25, 9, 12, 38, 14, 16, 10, 23, 18, 1, 38, 31, 15, 8, 16, 27, 10, 38, 28, 35, 0, 30, 6, 2, 43, 9, 37, 34, 40, 8 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case34() {
        int N = 44;
        int[] decisions = { 13, 10, 26, 39, 33, 23, 37, 8, 40, 13, 15, 20, 4, 2, 15, 29, 41, 36, 25, 21, 31, 11, 30, 25, 26, 33, 28, 10, 17, 41, 20, 0, 33, 42, 25, 29, 0, 1, 36, 4, 41, 39, 2 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case35() {
        int N = 45;
        int[] decisions = { 34, 16, 17, 40, 15, 28, 18, 29, 3, 34, 31, 37, 19, 4, 22, 21, 34, 13, 20, 12, 31, 26, 40, 8, 37, 35, 39, 24, 1, 41, 16, 26, 23, 38, 10, 0, 28, 12, 8, 32 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case36() {
        int N = 45;
        int[] decisions = { 20, 38, 36, 16, 28, 21, 37, 31, 4, 21, 17, 19, 1, 0, 20, 13, 26, 29, 14, 12, 24, 18, 44, 9, 35, 20, 39, 1, 33, 19, 32, 8, 23, 22, 5, 3, 11, 32, 25, 17, 4, 44, 39 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case37() {
        int N = 46;
        int[] decisions = { 32, 22, 38, 11, 11, 10, 35, 7, 20, 35, 17, 24, 15, 0, 34, 1, 20, 16, 3, 37, 18, 5, 29, 3, 25, 38, 29, 26, 43, 13, 45, 16, 25, 39, 1, 13, 28, 4, 18, 6 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case38() {
        int N = 46;
        int[] decisions = { 0, 34, 5, 34, 11, 16, 10, 6, 5, 13, 23, 0, 36, 21, 17, 38, 2, 32, 27, 4, 5, 9, 34, 28, 26, 36, 29, 18, 32, 7, 23, 0, 6, 36, 5, 14, 40, 9, 10, 40, 40, 19, 16 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case39() {
        int N = 47;
        int[] decisions = { 11, 35, 6, 11, 10, 20, 33, 33, 25, 2, 9, 14, 45, 40, 12, 36, 15, 43, 38, 40, 16, 29, 15, 24, 7, 43, 1, 42, 35, 45, 32, 1, 22, 12, 33, 19, 26, 3, 41, 39 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case40() {
        int N = 47;
        int[] decisions = { 25, 14, 2, 5, 30, 3, 11, 21, 41, 17, 0, 46, 35, 9, 25, 20, 0, 0, 23, 40, 21, 38, 32, 10, 35, 14, 8, 31, 9, 21, 30, 41, 7, 44, 34, 4, 20, 9, 22, 23, 9, 17, 45 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case41() {
        int N = 47;
        int[] decisions = { 28, 4, 19, 9, 9, 6, 40, 33, 18, 3, 7, 7, 27, 37, 23, 24, 30, 18, 24, 6, 26, 2, 18, 10, 21, 42, 12, 30, 27, 5, 25, 34, 19, 2, 22, 39, 18, 26, 9, 6, 22, 13, 14, 5, 19, 25 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case42() {
        int N = 48;
        int[] decisions = { 37, 15, 3, 17, 5, 14, 42, 14, 37, 7, 42, 22, 7, 45, 1, 14, 5, 38, 36, 25, 0, 25, 2, 36, 41, 12, 13, 33, 31, 39, 38, 38, 11, 13, 24, 38, 24, 11, 24, 1 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case43() {
        int N = 48;
        int[] decisions = { 8, 1, 11, 8, 2, 34, 9, 4, 32, 23, 17, 23, 24, 40, 29, 34, 9, 45, 22, 25, 9, 18, 27, 4, 12, 26, 47, 23, 8, 21, 16, 37, 39, 37, 15, 16, 12, 45, 29, 36, 25, 43, 35 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case44() {
        int N = 48;
        int[] decisions = { 21, 17, 40, 21, 38, 9, 29, 7, 43, 5, 40, 0, 33, 16, 15, 30, 28, 43, 4, 43, 18, 42, 10, 47, 39, 12, 23, 5, 7, 42, 11, 34, 43, 33, 0, 20, 6, 35, 33, 7, 32, 42, 16, 30, 5, 31 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case45() {
        int N = 49;
        int[] decisions = { 20, 9, 5, 28, 26, 11, 26, 31, 28, 30, 1, 34, 47, 4, 9, 5, 23, 42, 20, 16, 19, 23, 18, 19, 28, 45, 38, 46, 1, 13, 21, 6, 48, 3, 20, 11, 2, 17, 48, 36 };
        assertEquals(0.5, mafiagame.probabilityToLose(N, decisions), DELTA * 0.5);
    }

    @Test
    public void case46() {
        int N = 49;
        int[] decisions = { 19, 1, 28, 28, 32, 14, 30, 3, 44, 16, 3, 2, 26, 20, 23, 20, 14, 4, 43, 15, 14, 34, 4, 11, 5, 17, 42, 13, 19, 28, 7, 3, 33, 44, 31, 4, 2, 3, 19, 29, 27, 15, 21 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case47() {
        int N = 49;
        int[] decisions = { 44, 10, 43, 43, 29, 4, 20, 33, 9, 39, 13, 9, 30, 18, 39, 28, 21, 32, 45, 33, 42, 4, 7, 27, 15, 41, 46, 20, 20, 7, 3, 13, 36, 35, 42, 16, 24, 37, 24, 17, 0, 32, 43, 4, 2, 5 };
        assertEquals(0.3333333333333333, mafiagame.probabilityToLose(N, decisions), DELTA * 0.3333333333333333);
    }

    @Test
    public void case48() {
        int N = 50;
        int[] decisions = { 25, 11, 37, 36, 40, 0, 12, 34, 43, 3, 16, 2, 8, 12, 33, 4, 3, 34, 3, 6, 48, 24, 17, 13, 9, 28, 0, 30, 18, 8, 0, 5, 11, 14, 3, 26, 43, 9, 2, 11 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case49() {
        int N = 50;
        int[] decisions = { 39, 48, 32, 3, 24, 20, 2, 23, 31, 19, 28, 9, 8, 19, 21, 3, 45, 31, 4, 42, 35, 13, 48, 39, 22, 38, 37, 10, 11, 34, 8, 11, 9, 43, 15, 19, 37, 19, 8, 0, 21, 14, 17 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case50() {
        int N = 50;
        int[] decisions = { 15, 5, 15, 30, 39, 12, 38, 32, 4, 35, 10, 34, 24, 30, 15, 1, 41, 15, 29, 10, 48, 23, 38, 27, 32, 6, 39, 13, 8, 41, 40, 23, 13, 28, 34, 28, 0, 21, 35, 24, 21, 33, 17, 3, 45, 18 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case51() {
        int N = 50;
        int[] decisions = { 25, 26, 29, 0, 48, 9, 43, 36, 30, 16, 49, 17, 28, 29, 14, 21, 5, 26, 16, 16, 26, 16, 37, 31, 14, 40, 36, 21, 12, 21, 14, 9, 15, 2, 23, 24, 41, 45, 12, 23, 31, 6, 18, 18, 2, 7, 7, 31, 12 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case52() {
        int N = 213;
        int[] decisions = { 131 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case53() {
        int N = 213;
        int[] decisions = { 101, 101 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case54() {
        int N = 213;
        int[] decisions = { 45, 65, 65 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case55() {
        int N = 213;
        int[] decisions = { 87, 87, 137, 87 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case56() {
        int N = 213;
        int[] decisions = { 88, 88, 70, 70, 70 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case57() {
        int N = 213;
        int[] decisions = { 24, 191, 24, 191, 134, 61 };
        assertEquals(0.5, mafiagame.probabilityToLose(N, decisions), DELTA * 0.5);
    }

    @Test
    public void case58() {
        int N = 213;
        int[] decisions = { 64, 186, 36, 36, 157, 149, 64 };
        assertEquals(0.5, mafiagame.probabilityToLose(N, decisions), DELTA * 0.5);
    }

    @Test
    public void case59() {
        int N = 213;
        int[] decisions = { 29, 29, 18, 208, 66, 208, 173, 66 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case60() {
        int N = 213;
        int[] decisions = { 175, 98, 175, 212, 82, 168, 165, 175, 80 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case61() {
        int N = 213;
        int[] decisions = { 71, 184, 10, 191, 71, 164, 27, 71, 164, 86 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case62() {
        int N = 213;
        int[] decisions = { 123, 40, 197, 45, 124, 36, 36, 197, 203, 124, 150 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case63() {
        int N = 213;
        int[] decisions = { 92, 46, 87, 207, 154, 27, 46, 117, 208, 96, 71, 92 };
        assertEquals(0.5, mafiagame.probabilityToLose(N, decisions), DELTA * 0.5);
    }

    @Test
    public void case64() {
        int N = 213;
        int[] decisions = { 42, 30, 101, 113, 41, 179, 113, 76, 69, 30, 18, 159, 36 };
        assertEquals(0.5, mafiagame.probabilityToLose(N, decisions), DELTA * 0.5);
    }

    @Test
    public void case65() {
        int N = 213;
        int[] decisions = { 23, 63, 18, 18, 149, 28, 23, 95, 15, 62, 56, 15, 209, 209 };
        assertEquals(0.25, mafiagame.probabilityToLose(N, decisions), DELTA * 0.25);
    }

    @Test
    public void case66() {
        int N = 213;
        int[] decisions = { 34, 76, 95, 177, 101, 65, 120, 191, 18, 34, 93, 168, 191, 108, 95 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case67() {
        int N = 213;
        int[] decisions = { 29, 69, 40, 107, 161, 91, 128, 91, 118, 168, 44, 168, 4, 42, 128, 204 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case68() {
        int N = 213;
        int[] decisions = { 211, 27, 178, 72, 36, 142, 184, 191, 1, 62, 36, 51, 153, 86, 147, 21, 140 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case69() {
        int N = 213;
        int[] decisions = { 51, 197, 202, 163, 49, 30, 42, 148, 8, 22, 8, 67, 67, 176, 82, 43, 169, 93 };
        assertEquals(0.5, mafiagame.probabilityToLose(N, decisions), DELTA * 0.5);
    }

    @Test
    public void case70() {
        int N = 213;
        int[] decisions = { 57, 146, 164, 139, 52, 96, 132, 61, 195, 113, 143, 57, 96, 59, 143, 104, 124, 11, 193 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case71() {
        int N = 213;
        int[] decisions = { 27, 195, 61, 99, 63, 180, 47, 66, 41, 193, 31, 174, 193, 27, 61, 128, 96, 41, 174, 169 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case72() {
        int N = 213;
        int[] decisions = { 147, 136, 198, 96, 154, 37, 128, 195, 55, 140, 94, 198, 171, 37, 176, 69, 114, 153, 178, 69, 188 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case73() {
        int N = 213;
        int[] decisions = { 186, 99, 199, 98, 68, 99, 170, 74, 75, 186, 18, 29, 26, 185, 120, 140, 101, 98, 18, 68, 192, 19 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case74() {
        int N = 213;
        int[] decisions = { 138, 143, 47, 185, 152, 53, 44, 184, 10, 152, 82, 97, 184, 176, 134, 191, 82, 13, 124, 13, 62, 134, 185 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case75() {
        int N = 213;
        int[] decisions = { 20, 13, 120, 51, 193, 4, 195, 80, 70, 162, 41, 207, 207, 13, 128, 22, 41, 4, 211, 150, 132, 160, 211, 56 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case76() {
        int N = 213;
        int[] decisions = { 7, 149, 76, 43, 7, 160, 76, 64, 118, 179, 3, 166, 134, 118, 133, 98, 95, 142, 138, 107, 128, 45, 91, 134, 128 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case77() {
        int N = 497;
        int[] decisions = { 39 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case78() {
        int N = 497;
        int[] decisions = { 295, 485, 35, 342, 295, 342, 115, 473 };
        assertEquals(0.5, mafiagame.probabilityToLose(N, decisions), DELTA * 0.5);
    }

    @Test
    public void case79() {
        int N = 497;
        int[] decisions = { 199, 444, 199, 154, 391, 41, 345, 46, 51, 414, 55, 428, 97, 345, 428 };
        assertEquals(0.3333333333333333, mafiagame.probabilityToLose(N, decisions), DELTA * 0.3333333333333333);
    }

    @Test
    public void case80() {
        int N = 497;
        int[] decisions = { 13, 343, 27, 256, 125, 125, 293, 438, 494, 13, 50, 4, 160, 4, 488, 44, 448, 25, 160, 186, 118, 27 };
        assertEquals(0.2, mafiagame.probabilityToLose(N, decisions), DELTA * 0.2);
    }

    @Test
    public void case81() {
        int N = 491;
        int[] decisions = { 111 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case82() {
        int N = 491;
        int[] decisions = { 193, 57, 57, 128 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case83() {
        int N = 491;
        int[] decisions = { 238, 238, 313, 300, 129, 238, 189 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case84() {
        int N = 491;
        int[] decisions = { 174, 92, 391, 243, 448, 224, 448, 391, 174, 391 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case85() {
        int N = 491;
        int[] decisions = { 30, 51, 251, 44, 28, 356, 425, 330, 425, 425, 117, 51, 286 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case86() {
        int N = 491;
        int[] decisions = { 17, 87, 280, 245, 44, 280, 396, 160, 17, 160, 35, 68, 35, 340, 87, 340 };
        assertEquals(0.16666666666666666, mafiagame.probabilityToLose(N, decisions), DELTA * 0.16666666666666666);
    }

    @Test
    public void case87() {
        int N = 491;
        int[] decisions = { 465, 100, 390, 210, 307, 227, 470, 30, 355, 227, 465, 71, 47, 307, 65, 108, 363, 30, 281 };
        assertEquals(0.25, mafiagame.probabilityToLose(N, decisions), DELTA * 0.25);
    }

    @Test
    public void case88() {
        int N = 491;
        int[] decisions = { 196, 478, 50, 50, 79, 245, 145, 358, 408, 145, 349, 258, 327, 275, 472, 408, 245, 318, 419, 327, 196, 228 };
        assertEquals(0.16666666666666666, mafiagame.probabilityToLose(N, decisions), DELTA * 0.16666666666666666);
    }

    @Test
    public void case89() {
        int N = 491;
        int[] decisions = { 293, 449, 287, 224, 134, 419, 261, 449, 31, 287, 115, 437, 39, 270, 87, 115, 164, 178, 50, 261, 474, 87, 331, 39, 331 };
        assertEquals(0.14285714285714285, mafiagame.probabilityToLose(N, decisions), DELTA * 0.14285714285714285);
    }

    @Test
    public void case90() {
        int N = 500;
        int[] decisions = { 394 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case91() {
        int N = 500;
        int[] decisions = { 43, 355, 236, 188, 280, 24, 245, 236, 43 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case92() {
        int N = 500;
        int[] decisions = { 113, 309, 374, 341, 312, 447, 447, 164, 17, 164, 17, 37, 416, 184, 238, 121, 292 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case93() {
        int N = 500;
        int[] decisions = { 124, 56, 8, 99, 21, 421, 167, 368, 355, 248, 163, 8, 71, 88, 270, 234, 56, 495, 46, 234, 137, 38, 158, 158, 21 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case94() {
        int N = 348;
        int[] decisions = { 66, 327, 230, 263, 180, 180, 245, 263, 178, 263 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case95() {
        int N = 309;
        int[] decisions = { 62, 241, 199, 94, 291, 212, 64, 17, 75, 138, 158, 138, 201, 254, 62, 27, 48, 262, 158, 28, 76, 262, 28, 10 };
        assertEquals(0.2, mafiagame.probabilityToLose(N, decisions), DELTA * 0.2);
    }

    @Test
    public void case96() {
        int N = 187;
        int[] decisions = { 144, 160, 38, 139, 136, 22, 101, 46, 38, 15, 137, 69, 169, 179, 87, 153, 101 };
        assertEquals(0.5, mafiagame.probabilityToLose(N, decisions), DELTA * 0.5);
    }

    @Test
    public void case97() {
        int N = 178;
        int[] decisions = { 42, 76, 31, 145, 7, 76, 42, 6, 7, 58, 6 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case98() {
        int N = 313;
        int[] decisions = { 278, 120, 179, 74, 138, 177, 269, 217, 178, 200, 179, 177, 23, 307, 227, 256, 227, 125, 225 };
        assertEquals(0.3333333333333333, mafiagame.probabilityToLose(N, decisions), DELTA * 0.3333333333333333);
    }

    @Test
    public void case99() {
        int N = 306;
        int[] decisions = { 142, 24 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case100() {
        int N = 294;
        int[] decisions = { 261, 261, 27, 232, 168, 269, 59 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case101() {
        int N = 448;
        int[] decisions = { 203, 193, 258, 77, 38, 189, 11, 45, 321, 232, 321, 444, 418, 242, 199, 31, 149, 203, 262, 258, 199, 444, 220, 56, 242 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case102() {
        int N = 342;
        int[] decisions = { 214, 58, 76, 52, 244, 160, 199, 293, 244, 238, 28, 52, 277, 287, 89, 172, 129 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case103() {
        int N = 291;
        int[] decisions = { 135, 244, 56, 56, 259, 241, 79, 184, 154, 150, 273, 196, 2, 12, 246, 241, 184, 150, 77, 189, 157, 196 };
        assertEquals(0.2, mafiagame.probabilityToLose(N, decisions), DELTA * 0.2);
    }

    @Test
    public void case104() {
        int N = 22;
        int[] decisions = { 1, 2, 3, 1, 2, 3 };
        assertEquals(0.3333333333333333, mafiagame.probabilityToLose(N, decisions), DELTA * 0.3333333333333333);
    }

    @Test
    public void case105() {
        int N = 367;
        int[] decisions = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        assertEquals(0.05, mafiagame.probabilityToLose(N, decisions), DELTA * 0.05);
    }

    @Test
    public void case106() {
        int N = 3;
        int[] decisions = { 1, 1, 1 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case107() {
        int N = 500;
        int[] decisions = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case108() {
        int N = 10;
        int[] decisions = { 1 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case109() {
        int N = 500;
        int[] decisions = { 499 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case110() {
        int N = 120;
        int[] decisions = { 1, 3, 5, 6, 9 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case111() {
        int N = 500;
        int[] decisions = { 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 6, 7, 8, 9, 10, 13, 14, 15, 17, 17, 17, 17, 17, 18, 22, 24, 24, 25, 105, 150, 150, 150, 150, 150, 493, 493, 493, 493, 493 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case112() {
        int N = 500;
        int[] decisions = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 13, 14, 14, 14, 14 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case113() {
        int N = 5;
        int[] decisions = { 0, 1, 0, 1 };
        assertEquals(0.5, mafiagame.probabilityToLose(N, decisions), DELTA * 0.5);
    }

    @Test
    public void case114() {
        int N = 11;
        int[] decisions = { 0, 0, 1, 1, 2, 2, 3, 3 };
        assertEquals(0.25, mafiagame.probabilityToLose(N, decisions), DELTA * 0.25);
    }

    @Test
    public void case115() {
        int N = 10;
        int[] decisions = { 9, 9, 8 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case116() {
        int N = 500;
        int[] decisions = { 1, 1, 1, 222, 222, 222, 499, 499, 499 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case117() {
        int N = 23;
        int[] decisions = { 17, 10, 3, 14, 22, 5, 11, 10, 22, 3, 14, 5, 11, 17 };
        assertEquals(0.14285714285714285, mafiagame.probabilityToLose(N, decisions), DELTA * 0.14285714285714285);
    }

    @Test
    public void case118() {
        int N = 497;
        int[] decisions = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24 };
        assertEquals(0.04, mafiagame.probabilityToLose(N, decisions), DELTA * 0.04);
    }

    @Test
    public void case119() {
        int N = 2;
        int[] decisions = { 1 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case120() {
        int N = 10;
        int[] decisions = { 0, 1, 2, 0, 1, 2 };
        assertEquals(0.3333333333333333, mafiagame.probabilityToLose(N, decisions), DELTA * 0.3333333333333333);
    }

    @Test
    public void case121() {
        int N = 2;
        int[] decisions = { 0, 1 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case122() {
        int N = 5;
        int[] decisions = { 0, 0, 1, 1 };
        assertEquals(0.5, mafiagame.probabilityToLose(N, decisions), DELTA * 0.5);
    }

    @Test
    public void case123() {
        int N = 500;
        int[] decisions = { 20, 30, 5, 4, 4, 4, 4, 31, 23, 22, 2, 2, 2, 2, 43 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case124() {
        int N = 20;
        int[] decisions = { 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 18, 19, 0 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case125() {
        int N = 5;
        int[] decisions = { 1, 1, 2, 2, 3 };
        assertEquals(0.5, mafiagame.probabilityToLose(N, decisions), DELTA * 0.5);
    }

    @Test
    public void case126() {
        int N = 2;
        int[] decisions = { 0, 0 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case127() {
        int N = 500;
        int[] decisions = { 1 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case128() {
        int N = 21;
        int[] decisions = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case129() {
        int N = 10;
        int[] decisions = { 1, 1, 2, 2, 3, 3 };
        assertEquals(0.3333333333333333, mafiagame.probabilityToLose(N, decisions), DELTA * 0.3333333333333333);
    }

    @Test
    public void case130() {
        int N = 500;
        int[] decisions = { 0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 11, 11, 11, 12, 12, 12, 13, 13, 13, 14, 14, 14, 15, 15, 15 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case131() {
        int N = 10;
        int[] decisions = { 1, 2, 2 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case132() {
        int N = 7;
        int[] decisions = { 1, 1, 2, 2, 3 };
        assertEquals(0.5, mafiagame.probabilityToLose(N, decisions), DELTA * 0.5);
    }

    @Test
    public void case133() {
        int N = 50;
        int[] decisions = { 1 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case134() {
        int N = 16;
        int[] decisions = { 10, 15, 0, 13, 10, 9, 4, 11, 0, 6, 1, 13, 2, 5, 8, 12 };
        assertEquals(0.3333333333333333, mafiagame.probabilityToLose(N, decisions), DELTA * 0.3333333333333333);
    }

    @Test
    public void case135() {
        int N = 500;
        int[] decisions = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 55, 234, 432, 333, 444, 56, 64 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case136() {
        int N = 10;
        int[] decisions = { 0, 1, 2, 0, 1, 2, 3, 4 };
        assertEquals(0.3333333333333333, mafiagame.probabilityToLose(N, decisions), DELTA * 0.3333333333333333);
    }

    @Test
    public void case137() {
        int N = 480;
        int[] decisions = { 1, 1, 1, 2, 2, 2, 3, 3, 3 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case138() {
        int N = 293;
        int[] decisions = { 102, 262, 241, 218, 51, 251, 208, 150, 89, 4, 26, 106, 43, 48, 289, 130, 34, 1, 2, 110, 155, 167, 176, 177 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case139() {
        int N = 4;
        int[] decisions = { 0, 0, 1, 1 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case140() {
        int N = 30;
        int[] decisions = { 0, 1, 0, 2 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case141() {
        int N = 17;
        int[] decisions = { 0, 0, 1, 1 };
        assertEquals(0.5, mafiagame.probabilityToLose(N, decisions), DELTA * 0.5);
    }

    @Test
    public void case142() {
        int N = 9;
        int[] decisions = { 1, 1, 1, 2, 2, 2, 0 };
        assertEquals(0.5, mafiagame.probabilityToLose(N, decisions), DELTA * 0.5);
    }

    @Test
    public void case143() {
        int N = 7;
        int[] decisions = { 1 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case144() {
        int N = 78;
        int[] decisions = { 45 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case145() {
        int N = 9;
        int[] decisions = { 3, 3, 3, 2, 2, 2, 1, 1, 1 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case146() {
        int N = 500;
        int[] decisions = { 1, 1, 384, 348, 394, 281, 483, 283, 438, 28, 283 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case147() {
        int N = 5;
        int[] decisions = { 0, 0, 1, 2, 1 };
        assertEquals(0.5, mafiagame.probabilityToLose(N, decisions), DELTA * 0.5);
    }

    @Test
    public void case148() {
        int N = 5;
        int[] decisions = { 1 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case149() {
        int N = 7;
        int[] decisions = { 3, 3, 3, 1, 1, 1, 2 };
        assertEquals(0.5, mafiagame.probabilityToLose(N, decisions), DELTA * 0.5);
    }

    @Test
    public void case150() {
        int N = 19;
        int[] decisions = { 0, 0, 1, 1, 2, 2, 3, 3, 4, 4 };
        assertEquals(0.2, mafiagame.probabilityToLose(N, decisions), DELTA * 0.2);
    }

    @Test
    public void case151() {
        int N = 4;
        int[] decisions = { 0, 0 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case152() {
        int N = 100;
        int[] decisions = { 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3 };
        assertEquals(1.0, mafiagame.probabilityToLose(N, decisions), DELTA * 1.0);
    }

    @Test
    public void case153() {
        int N = 20;
        int[] decisions = { 1 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case154() {
        int N = 2;
        int[] decisions = { 0 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case155() {
        int N = 6;
        int[] decisions = { 0, 0, 1, 1, 2 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case156() {
        int N = 500;
        int[] decisions = { 0, 0, 1, 2, 3, 1 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

    @Test
    public void case157() {
        int N = 21;
        int[] decisions = { 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7 };
        assertEquals(0.0, mafiagame.probabilityToLose(N, decisions), DELTA);
    }

}
