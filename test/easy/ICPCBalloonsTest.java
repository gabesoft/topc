package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class ICPCBalloonsTest {
    ICPCBalloons icpcballoons = new ICPCBalloons();

    @Test
    public void case1() {
        int[] balloonCount = { 100 };
        String balloonSize = "L";
        int[] maxAccepted = { 1, 2, 3, 4, 5 };
        assertEquals(10, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case2() {
        int[] balloonCount = { 100 };
        String balloonSize = "M";
        int[] maxAccepted = { 10, 20, 30, 40, 50 };
        assertEquals(-1, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case3() {
        int[] balloonCount = { 5, 6, 1, 5, 6, 1, 5, 6, 1 };
        String balloonSize = "MLMMLMMLM";
        int[] maxAccepted = { 7, 7, 4, 4, 7, 7 };
        assertEquals(6, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case4() {
        int[] balloonCount = { 100, 100 };
        String balloonSize = "ML";
        int[] maxAccepted = { 50, 51, 51 };
        assertEquals(-1, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case5() {
        int[] balloonCount = { 19, 25, 19, 34, 8, 33, 12, 12, 8, 2, 36, 14, 30, 11, 13, 32, 15, 30, 11, 27, 30, 4, 6, 17, 21, 13, 10, 28, 14, 10, 35, 10, 26, 15, 11, 34, 13, 13, 23, 27, 7, 9, 3, 34, 29, 27, 2, 15, 11, 25 };
        String balloonSize = "LLMLLMLLMLLMLLLLLLLLLLLLLLMLLLLLLLLMMMLMLMLLLMMLML";
        int[] maxAccepted = { 43, 1, 27, 12, 48, 43, 26, 17, 46, 32, 49, 50, 1, 19, 15 };
        assertEquals(73, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case6() {
        int[] balloonCount = { 43, 5, 38, 35, 43, 22, 47, 38, 43, 1, 47, 3, 30, 5, 9, 20, 3, 10, 7, 8, 41, 35, 27, 2, 24, 37, 9, 43, 47, 8, 37, 11, 23, 2, 15, 15, 41, 32, 2, 25, 1, 9, 29, 10, 1, 5, 39, 20, 21, 8 };
        String balloonSize = "LLLLLLMLLMLLLLLMLLLLLMLLLLLMLMMLLLLLLLMLLMLLLLLLMM";
        int[] maxAccepted = { 28, 71, 18, 58, 80, 18, 70, 85, 1, 48, 10 };
        assertEquals(142, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case7() {
        int[] balloonCount = { 79, 57, 50, 71, 69, 17, 86, 96, 60, 50, 90, 51, 45, 96, 85, 75, 51, 48, 86, 85, 39, 32, 38, 56, 33, 75, 88, 32, 4, 89, 54, 75, 68, 8, 26, 90, 70, 98, 20, 30, 52, 62, 24, 66, 24, 84, 62 };
        String balloonSize = "MMLLMLMMMLLLLLLMMMLLLLLLLLLLMMLMMMLMMLLLMMLLMLM";
        int[] maxAccepted = { 9, 38, 42, 44, 59, 23, 14, 73, 67, 1, 67, 39, 9, 4, 19 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case8() {
        int[] balloonCount = { 34, 87, 26, 9, 35, 70, 49, 65, 50, 67, 62, 83, 71, 27, 62, 19, 78, 33, 37, 54, 5, 7, 64, 87, 49, 14, 37, 43, 42, 48, 76, 52, 81, 73, 46, 1, 9, 60, 39, 58, 10, 9, 83, 24, 17, 39, 31, 1, 52, 1 };
        String balloonSize = "MMLLMLMMMLMLLMLMMMMLMMLMMMMLLMMMLMMMLLLMMMMMMLLMMM";
        int[] maxAccepted = { 34, 7, 4, 1, 31, 23, 18, 37, 21 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case9() {
        int[] balloonCount = { 40, 30, 35, 47, 6, 45, 20, 7, 4, 3, 9, 1, 11, 39, 18, 14, 11, 21, 13, 15, 11, 35, 28, 11, 17, 30, 33, 35, 42, 35, 9, 13, 23, 41, 3, 28, 5, 28, 28, 33, 7, 5, 8, 11, 18, 20, 46, 25, 37, 16 };
        String balloonSize = "LLLMMMMMMLLMLLMLMMLMLMMLLLMMMMLLLMMMLLMLLMLLMLMMML";
        int[] maxAccepted = { 2, 47, 28, 54, 45, 55, 47, 31, 36, 7, 19 };
        assertEquals(27, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case10() {
        int[] balloonCount = { 13, 6, 9, 5, 16, 11, 2, 19, 14, 3, 15, 11, 14, 12, 18, 12, 10, 18, 5, 17, 20, 16, 20, 17, 17, 20, 20, 2, 15, 15, 6, 10, 7, 15, 11, 12, 3, 4, 20, 20, 18, 15, 3, 11, 17, 18, 8, 6, 3, 1 };
        String balloonSize = "MMMMMMLMMMMLLMMMLMMMMMMMMMMLMMMLMLMMLMMMMMLMMLLLMM";
        int[] maxAccepted = { 5, 25, 16, 23, 28, 34, 10, 41, 24, 28, 13, 34, 28, 28, 18 };
        assertEquals(100, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case11() {
        int[] balloonCount = { 3, 22, 17, 33, 38, 31, 1, 20, 45, 37, 27, 1, 35, 34, 48, 50, 48, 30, 38, 9, 16, 29, 14, 48, 24, 20, 25, 22, 2, 49, 48, 9, 45, 6, 32, 10, 7, 20, 44, 8, 35, 13, 47, 32, 25, 20, 16, 4, 22, 3 };
        String balloonSize = "LLLLLLLLLLLLMLLLLLLMLLLLLLLLLLLLLLMMLLLLLLLLMLLLLL";
        int[] maxAccepted = { 18, 20, 38, 56, 41, 23, 54, 34, 63, 6, 21, 7, 24, 57, 61 };
        assertEquals(48, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case12() {
        int[] balloonCount = { 10, 58, 13, 41, 60, 36, 2, 51, 28, 33, 5, 44, 58, 31, 21, 68, 37, 25, 61, 30, 18, 49, 31, 43, 61, 43, 25, 12, 10, 52, 54, 70, 13, 25, 46, 14, 10, 4, 55 };
        String balloonSize = "LMLMLLLLMLLLLLLLLLMLLLLLLLLLLMLLLLLLLLL";
        int[] maxAccepted = { 1, 2, 3, 1, 3, 2, 3, 2, 3, 1, 1, 3, 3, 2, 2 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case13() {
        int[] balloonCount = { 21, 4, 16, 8, 10, 8, 18, 18, 15, 2, 11, 15, 15, 18, 16, 1, 4, 21, 2, 7, 15, 17, 23, 7, 6, 21, 1, 1, 5, 21, 13, 18, 3, 13, 2, 16, 7, 14, 22, 2, 21, 13, 20, 16, 12, 19, 6, 6, 3, 18 };
        String balloonSize = "MMLMMMMLLLMMLLMMLLMMLLMLLLLMMLLLMMLMLMLMLLLLMLLMLL";
        int[] maxAccepted = { 16, 15, 8, 11, 17, 9, 18, 13 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case14() {
        int[] balloonCount = { 68, 16, 16, 72, 68, 41, 56, 56, 10, 70, 35, 32, 72, 9, 53, 25, 61, 65, 71, 29, 60, 37, 8, 62, 48, 19, 70, 38, 27, 52, 42, 18, 22, 14, 58, 8, 51, 37, 64, 10, 22, 31, 23, 6, 42, 34, 53, 3, 7, 69 };
        String balloonSize = "MMMMMMMMMMMMMMMMMMMMMMMMMMMMLMMMMLMMMMMMMMMMMMMMMM";
        int[] maxAccepted = { 12, 23, 25, 22, 42, 4, 14, 39, 36, 30, 42, 31, 29, 8, 36 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case15() {
        int[] balloonCount = { 7, 26, 42, 24, 4, 24, 18, 35, 10, 7, 25, 1, 28, 21, 1, 2, 32, 11, 30, 8, 12, 17, 26, 1, 8, 33, 23, 13, 38, 9, 31, 40, 27, 9, 9, 16, 21, 33, 13, 29, 23, 13 };
        String balloonSize = "LMLLLLLLLLMLLLLLLLLLLLLLLMMLLLLLLLLLLLLMLL";
        int[] maxAccepted = { 11, 42, 4, 63, 30, 41, 77, 60, 60, 10, 77, 44, 69, 68, 57 };
        assertEquals(290, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case16() {
        int[] balloonCount = { 22, 19, 19, 2, 6, 31, 7, 9, 21, 33, 21, 29, 30, 24, 15, 32, 37, 23, 24, 8, 11, 22, 9, 12, 5, 18, 1, 28, 19 };
        String balloonSize = "MLMMMLMMMLLMLMLMMLMLMMMLLMLLL";
        int[] maxAccepted = { 18, 33, 4, 4, 16, 4, 20, 10, 26, 32, 6, 24, 19, 8, 5 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case17() {
        int[] balloonCount = { 1, 6, 6, 6, 2, 8, 1, 1, 5, 7, 4, 9, 1, 5, 1, 6, 9, 3, 2, 2, 9, 5, 8, 8, 4, 6, 8, 6, 5, 5, 7, 1, 3, 1, 3, 5, 8, 6, 9, 7, 4, 1, 4, 2, 4, 9, 5, 6, 6, 1 };
        String balloonSize = "MLLMMLLLMLLLMMMMLMLLLMLLMLLMMLMMLLLLLMLMMLLLMMLLLM";
        int[] maxAccepted = { 3, 18, 20, 1, 7, 5, 11, 15, 9, 6, 20, 11, 11, 12, 6 };
        assertEquals(50, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case18() {
        int[] balloonCount = { 17, 9, 32, 16, 19, 11, 9, 1, 30, 7, 14, 13, 8, 18, 27, 32, 33, 28, 22, 30, 16, 2, 8, 36, 20, 9, 30, 27, 8, 2, 16, 9, 31, 13, 23, 28, 14, 27, 8, 17, 16, 3, 12, 26, 1, 13, 3, 29, 32, 17 };
        String balloonSize = "LLLLLMLLLLMMLLLMLLLMLLMLLLLLLLLLMLMLLMMLMLLLLLLLLM";
        int[] maxAccepted = { 19, 31, 61, 7 };
        assertEquals(25, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case19() {
        int[] balloonCount = { 22, 1, 24, 23, 23, 4, 25, 21, 21, 6, 9, 12, 24, 21, 24, 4, 5, 12, 15, 5, 21, 5, 15, 10, 28, 24, 5, 12, 19, 7, 18, 5, 6, 16, 28, 10, 1, 24, 5, 5, 26, 12, 2, 25, 8 };
        String balloonSize = "MMLLLMLMLMMMLMMMMLMMLLLLLMLMLMLLLMLLMMLMMMLMM";
        int[] maxAccepted = { 57, 55, 44, 60, 15, 26, 63 };
        assertEquals(149, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case20() {
        int[] balloonCount = { 75, 17, 87, 77, 30, 46, 87, 2, 44, 74, 11, 1, 44, 35, 64, 44, 1, 67, 36, 83, 57, 38, 36 };
        String balloonSize = "LLMLLLLLLMLLLLLLLMMLMLM";
        int[] maxAccepted = { 25, 72, 3, 22, 46, 88, 9, 40, 13, 35, 46 };
        assertEquals(1, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case21() {
        int[] balloonCount = { 8, 33, 34, 15, 3, 3, 14, 21, 11, 31, 17, 21, 30, 31, 25, 8, 17, 19, 27, 12, 13, 22, 15, 12, 8, 13, 17, 21, 34, 14, 7, 3, 5, 12, 16, 1, 12, 30, 5, 9, 23, 17, 34, 34, 17, 11, 26, 11, 29, 33 };
        String balloonSize = "MMLMMMMLMMMMMMLLLLMMLMMMLLMMMMLLMMLMMLMLLLLMLLMLMM";
        int[] maxAccepted = { 13, 21, 26, 9, 5, 14, 26, 14, 16, 4, 24, 11, 4 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case22() {
        int[] balloonCount = { 11, 17, 74, 37, 25, 23, 29, 19, 68, 5, 66, 68, 30, 59, 30, 54, 33, 18, 1, 75, 34, 10, 41, 12, 30, 33, 8, 38, 22, 35, 42, 58, 18, 18, 8, 10, 73, 37, 18, 32, 8, 7, 2, 6, 69, 7, 71, 45, 65, 1 };
        String balloonSize = "LLLLMLLMLLMLLLLLMLMLLMLMMLLLMLMLLLLLMMMLLMMLLLLLLM";
        int[] maxAccepted = { 60, 42, 29, 35, 28, 60, 53, 3, 51 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case23() {
        int[] balloonCount = { 10, 91, 15, 85, 94, 16, 73, 52, 43, 1, 12, 65, 80, 30, 38, 22, 93, 61, 7, 2, 56, 76, 13, 62, 58, 54, 21, 77, 37, 35, 32, 57, 53, 19, 30, 25, 12, 85, 3, 93, 14, 16, 98, 20 };
        String balloonSize = "MMMMMMMMLMLMMMLMMLMMLMLLLMMMMMMLLLMMMMMMMMLL";
        int[] maxAccepted = { 4, 7 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case24() {
        int[] balloonCount = { 20, 1, 36, 19, 10, 37, 53, 53, 23, 49, 25, 30, 8, 21, 42, 6, 42, 9, 54, 26, 34, 3, 9, 58, 30, 48, 19, 22, 19, 49, 2, 59, 54, 44, 5, 20, 54, 8, 5, 31, 17, 10, 53, 30, 7, 10, 41, 35, 39, 58 };
        String balloonSize = "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM";
        int[] maxAccepted = { 80, 62, 71, 10, 2, 4, 36, 50, 34, 63, 57, 24, 75, 89, 83 };
        assertEquals(137, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case25() {
        int[] balloonCount = { 24, 56, 6, 13, 77, 2, 46, 64, 54, 22, 23, 27, 72, 74, 70, 58, 38, 24, 34, 35, 20, 22, 70, 64, 15, 51, 58, 39, 76, 5, 26, 33, 20, 65, 20, 28, 63, 37, 7, 76, 76, 16, 33, 21, 34, 75, 22, 78, 59, 73 };
        String balloonSize = "LLLLLLMMMLMMMLLLMLMMMLLLLLLLLLLLLLMMMMMMLMMMLLLLLL";
        int[] maxAccepted = { 40, 12, 71, 65, 44, 31, 20, 49, 38, 26, 48, 23, 12, 24, 77 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case26() {
        int[] balloonCount = { 9, 27, 16, 72, 70, 14, 55, 54, 4, 60, 62, 21, 11, 54, 73, 55, 13, 63, 54, 36, 25, 73, 79, 37, 80, 4, 60, 63, 10, 81, 82, 1, 43, 70, 8, 7, 16, 58, 69, 75 };
        String balloonSize = "MMMMLMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM";
        int[] maxAccepted = { 32, 35, 54, 11 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case27() {
        int[] balloonCount = { 62, 15, 56, 65, 10, 10, 61, 23 };
        String balloonSize = "LLLLLLLL";
        int[] maxAccepted = { 21, 1, 17, 7, 20, 8, 7, 19, 11, 21, 13, 12, 17, 15, 27 };
        assertEquals(73, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case28() {
        int[] balloonCount = { 25, 12, 21, 10, 23, 13, 46, 31, 30, 11, 37, 16, 48, 23, 41, 18, 7, 41, 49, 8 };
        String balloonSize = "LMMMLLMMMLLMLLLLLLMM";
        int[] maxAccepted = { 20, 14, 39, 25, 38, 36, 19, 13, 8, 15, 28, 37, 14, 24, 37 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case29() {
        int[] balloonCount = { 3, 5, 5, 9, 1, 15, 16, 5, 3, 3, 9, 16, 11, 14, 12, 14, 8, 11, 4, 7, 2, 6, 8, 12, 4, 12, 5, 8, 3, 6, 5, 14, 2, 7, 13, 14, 1, 16, 1, 6, 10, 15, 13, 13, 15, 9, 6, 16, 5, 9 };
        String balloonSize = "LLMLMLMMMLMMLLMLMMLMLMMLLMLLMLLLLMLMLLMLMMMLMMMMLM";
        int[] maxAccepted = { 2 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case30() {
        int[] balloonCount = { 19, 56, 12, 26, 5, 51, 70, 14, 62, 44, 28, 14, 7, 7, 51, 69, 57, 43, 34, 40, 34, 36, 46, 71, 47, 16, 36, 70, 68, 11, 56, 54, 30, 2, 2, 29, 41, 9, 8, 15, 69, 49, 38, 48, 43, 66, 58, 15, 14, 16 };
        String balloonSize = "MLLMLMMLMMMLLMMLLMMLMLMMLMLMMLLMLMLLLMLMLMLMMMMLLL";
        int[] maxAccepted = { 13, 15, 66, 30, 11 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case31() {
        int[] balloonCount = { 19, 2, 57, 19, 35, 28, 45, 82, 59, 13, 79 };
        String balloonSize = "MLMLMLLLLLL";
        int[] maxAccepted = { 15, 43, 24, 41, 29, 18, 39, 38 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case32() {
        int[] balloonCount = { 6, 24, 60, 54, 7, 8, 27, 30, 29, 10, 23, 47, 54, 46, 47, 3, 50, 4, 31, 12, 44, 25, 36, 52, 55, 12, 58, 42, 28, 1, 19, 4, 49, 25, 13, 50, 54, 10, 43, 32, 56, 25, 36, 9, 14, 49, 50, 8, 18, 59 };
        String balloonSize = "MMMMMMLMMMMLLMLMMLMLLMMMLMMLLMMMLLMMLMMMLMLMMMMLLM";
        int[] maxAccepted = { 31, 45, 43, 36 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case33() {
        int[] balloonCount = { 75, 18, 19, 2, 19, 24, 53, 2, 20, 4, 32, 13, 3, 37, 44, 70, 55, 31, 35, 81, 9, 70, 31, 19, 45, 80, 44, 71, 3, 36, 10, 58, 22, 56, 41, 9, 18, 76, 55 };
        String balloonSize = "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL";
        int[] maxAccepted = { 2, 2, 1, 2, 5, 3, 4, 6, 2, 6, 4, 6, 4, 3, 4 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case34() {
        int[] balloonCount = { 25, 13, 9, 23, 3, 17, 1, 26, 18, 24, 22, 11, 4, 8, 21, 18, 18, 17, 1, 22, 25, 16, 3, 24, 17, 17, 4, 12, 14, 25, 1, 13, 24, 10, 13, 25, 10, 12, 20, 25, 26, 29, 13, 6, 5, 5, 10, 21, 16, 6 };
        String balloonSize = "LLLLLLLMLLLLLLLLLLLLMLMLLLLMLLMLMLLLLLLLLMLLLLLMLL";
        int[] maxAccepted = { 74, 58 };
        assertEquals(77, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case35() {
        int[] balloonCount = { 37, 68, 30, 48, 61, 21, 41, 75, 80, 14, 23, 50, 18, 71, 36, 66 };
        String balloonSize = "LMLMMLMLLLMMMLLL";
        int[] maxAccepted = { 10, 2, 12 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case36() {
        int[] balloonCount = { 21, 34, 4, 13, 3, 32, 28, 38, 38, 12, 20, 28, 10, 39, 7, 18, 25, 21, 11, 9, 3, 11, 28, 22, 5, 36, 22, 5, 21, 19, 19, 3, 22, 36, 18, 2, 14, 32, 24, 11, 2, 12, 11, 17, 3, 19, 12, 11, 15 };
        String balloonSize = "MMMMMMMMMMMMMMMLLMMMLMLMMMMMMLMMMMMMMMMLMMMLMMMMM";
        int[] maxAccepted = { 3 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case37() {
        int[] balloonCount = { 53, 28, 33, 3, 27, 38, 26, 35, 15, 55, 10, 7, 30, 27, 49, 66, 35, 9, 23, 45, 17, 39, 48, 23, 12, 48, 57, 52, 71, 27, 70, 4, 70, 25, 61, 7, 17, 44, 60, 18, 66, 52, 14, 6, 35, 72, 7, 5, 4, 21 };
        String balloonSize = "MMLMLLLMMLLLMLMMMMMMMMMLLMLLMMMLMMMMMMMMMMMMLMLMLM";
        int[] maxAccepted = { 10, 12, 39, 72, 86, 58, 32, 59, 81, 75 };
        assertEquals(31, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case38() {
        int[] balloonCount = { 42, 2, 34, 9, 21, 13, 37, 8, 20, 17, 6, 48, 12, 40, 29, 23, 14, 27, 9, 2, 54, 43, 1, 22, 23, 39, 44, 1, 10, 3, 53, 45, 24, 5, 26, 20, 15, 24, 12, 28, 23, 48, 25, 15, 21, 4, 17, 27, 53, 50 };
        String balloonSize = "LLLLLLLLLLLLLLLLLLMLLLLLLLLLLLLLLLMLMLLLLLLLLLLLLL";
        int[] maxAccepted = { 15, 24, 15, 8, 8, 19, 10, 8, 22, 9, 17, 5, 10, 6, 20 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case39() {
        int[] balloonCount = { 5, 38, 66, 4, 35, 29, 67, 21, 10, 46, 37, 56, 60, 31, 41, 45, 67, 55, 61, 16, 65, 11, 32, 2, 42, 11, 52, 8, 36, 55, 46, 58, 1, 50, 51, 63, 55, 13, 31, 15, 21, 40, 12, 13, 66, 6, 28, 54, 51, 2 };
        String balloonSize = "MMMMMMMMMMMLMMMMMMMMMMMMMMMMMMMMMMMMMMLMMMMMMMMMLM";
        int[] maxAccepted = { 40, 12, 1, 5, 19, 6, 42, 32, 2, 24, 42, 27, 27, 41, 1 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case40() {
        int[] balloonCount = { 62, 47, 73, 55, 10, 75, 1, 75, 49, 46, 59, 70, 10, 18, 39, 80, 45, 29, 61, 51, 77, 36, 17, 70, 70, 61, 22, 59, 62, 50, 79, 29, 46, 3, 33, 11, 29, 31, 34, 81, 7, 82, 49, 82, 7, 37, 44, 8, 77, 5 };
        String balloonSize = "MLMLLLMMLMLLLLMLLLLMLLLLLMLMLLLMLLLLMLLLLLMLLMMMLM";
        int[] maxAccepted = { 25, 12, 13, 26, 15, 6, 24, 15, 16, 5, 26, 12, 25, 24 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case41() {
        int[] balloonCount = { 4, 8, 16, 16, 22, 18, 19, 24, 21, 22, 5, 16, 12, 13, 9, 25, 21, 6, 6, 15, 5, 22, 16, 2, 10, 15, 26, 18, 10, 13, 11, 26, 27, 9, 16, 8, 2, 26, 7, 17, 23, 5, 18, 5, 3, 7, 2, 26, 10, 17 };
        String balloonSize = "MMLMMMMMMMMMMLMMLMMMLMMMMMMMMMMMMMMMMMMMMMMMLMMMLM";
        int[] maxAccepted = { 43, 41, 43, 30, 3, 47, 46, 27, 9, 3, 17, 46, 24, 19, 38 };
        assertEquals(138, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case42() {
        int[] balloonCount = { 1, 29, 17, 34, 6, 12, 46, 12, 1, 23, 42, 30, 6, 13, 21, 42, 50, 24, 4, 19, 49, 20, 12, 39, 8, 30, 1, 36, 4, 35, 47, 2, 20, 30, 32, 20, 6, 8, 29, 41, 36, 3, 11, 29, 14, 38, 17, 46, 23, 37 };
        String balloonSize = "MMMMMMMMLMMMMMMMLMMMMLMMMMLMLMMMMMMMMMMMMMMMMMMMMM";
        int[] maxAccepted = { 56, 35, 43, 6, 5, 41, 13, 17, 5, 32, 53, 50, 28 };
        assertEquals(13, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case43() {
        int[] balloonCount = { 15, 7, 28, 30, 7, 39, 7, 24, 16, 24, 24, 24, 25, 38, 43, 3, 30, 30, 43, 32, 20, 49, 6, 13, 3, 44, 14, 10, 3, 2, 33, 19, 8, 47, 18, 19, 32, 21, 40, 8, 7, 24, 5, 24, 30, 10, 35, 14, 32, 49 };
        String balloonSize = "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM";
        int[] maxAccepted = { 13, 14, 26, 31 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case44() {
        int[] balloonCount = { 85, 17, 93, 10, 38, 30, 16, 85, 43, 20, 5, 81, 58, 60, 83, 8, 28, 87, 60, 35, 47, 64 };
        String balloonSize = "LLLLLLLLLLMLLLLLLLLLML";
        int[] maxAccepted = { 7, 2, 3, 7, 1, 6, 9, 4, 2, 10, 3, 1, 8, 6, 10 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case45() {
        int[] balloonCount = { 21, 15, 19, 17, 2, 12, 15, 9, 15, 16, 24, 4, 5, 16, 3, 1, 19, 12, 21, 4, 5, 9, 19, 13, 7, 3, 5, 1, 11, 19, 17 };
        String balloonSize = "LMLLMLLMMMMLLLLLLLLLLLLLLLLLLML";
        int[] maxAccepted = { 4, 3, 13, 12, 7, 3, 5, 9, 6, 11, 5, 11, 9, 4, 3 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case46() {
        int[] balloonCount = { 18, 13, 18, 84, 73, 5, 43, 46, 42, 81, 48, 20, 54, 76, 35, 86, 14, 12, 81, 87, 44, 64, 55, 52, 77, 42, 14, 90, 82, 57, 32, 21, 38, 9, 69, 39, 38, 60, 64, 6, 36, 83, 21, 26, 17, 75, 88, 90, 40, 64 };
        String balloonSize = "MMMMLLLLMMMMMMLMMMMLLMLLLLMLMMMMLMMLMMMMMLMLLLMMMM";
        int[] maxAccepted = { 57, 62, 17, 22, 65, 46, 72, 62, 3, 74, 64, 71, 33, 2, 29 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case47() {
        int[] balloonCount = { 4, 53, 35, 48, 23, 17, 14, 33, 17, 5, 11, 16, 5, 40, 44 };
        String balloonSize = "MMMLLLLMMMMMMMM";
        int[] maxAccepted = { 14, 15, 12, 9, 28, 6, 23, 8, 15, 29, 10, 13, 19, 22, 3 };
        assertEquals(4, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case48() {
        int[] balloonCount = { 25, 46, 21, 6, 8, 11, 15, 44, 17, 37, 14, 23, 10, 21, 33, 47, 28, 16, 26, 12, 18, 10, 48, 26, 29, 40, 3, 43, 40, 19, 8, 27, 2, 40, 16, 15, 45, 13, 41, 7, 2, 30, 32, 18, 15, 5, 17, 33, 15, 24 };
        String balloonSize = "MMMMMMMMMMMMMLMMMMMLMMLMMMMMMMLMMMMMMMMMMMLMMMMMMM";
        int[] maxAccepted = { 20, 33, 14, 37 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case49() {
        int[] balloonCount = { 10, 58, 9, 2, 34, 32, 35, 15, 37, 7 };
        String balloonSize = "LLLLLLLLLL";
        int[] maxAccepted = { 3, 8, 23, 23, 25, 5, 24, 18, 1, 17, 2, 8, 17, 19, 4 };
        assertEquals(40, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case50() {
        int[] balloonCount = { 33, 33, 70, 90, 12, 37, 7, 40, 59, 7, 23, 12, 9, 92, 18, 91 };
        String balloonSize = "LLLLLLLLLLLLLMLL";
        int[] maxAccepted = { 9, 9, 7, 39, 20, 9, 26, 29, 36, 14, 10, 43, 24, 28, 42 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case51() {
        int[] balloonCount = { 22, 20, 18, 15, 8, 2, 9, 16, 6, 16, 13, 16, 20, 4, 21, 2, 2, 7, 1, 8, 9, 12, 17, 17, 7, 16, 8, 13, 6, 3, 12, 7, 17, 22, 6, 19, 17, 13, 6, 6, 3, 2, 4, 21, 1, 19, 13, 12, 16, 8 };
        String balloonSize = "LLLLLLLLLLLLLLLMMLMLLLMLLLLLLMLLLLMMMMLLLLMLLLLLLL";
        int[] maxAccepted = { 16, 36, 4 };
        assertEquals(14, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case52() {
        int[] balloonCount = { 82, 45, 54, 74, 23, 73, 37, 58, 7 };
        String balloonSize = "MMMMMLMMM";
        int[] maxAccepted = { 43, 12, 50, 3, 1, 33, 15, 22, 10, 28 };
        assertEquals(1, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case53() {
        int[] balloonCount = { 5, 8, 13, 20, 17, 7, 20, 13, 14, 20, 9, 11, 19, 4, 2, 10, 14, 11, 5, 19, 14, 13, 17, 17, 12, 16, 16, 14, 16, 10, 13, 13, 3, 5, 18, 20, 2, 19, 11, 14, 10, 14, 16, 6, 6, 16, 14, 16, 8, 7 };
        String balloonSize = "LMLMMMLLMMMMLLLMMMLMLMMMMLMMLLMMMMLMLMLLMMMMMLLMLM";
        int[] maxAccepted = { 10, 13, 8, 15, 7, 10, 12, 1, 9, 5, 17, 1, 17, 16, 5 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case54() {
        int[] balloonCount = { 1, 23, 14, 15, 17, 4, 19, 20, 27, 11, 27, 10, 13, 22, 25, 4, 1, 7, 3, 14, 15, 17, 19, 5, 15, 2, 13, 19, 8, 24, 12, 2, 3, 17, 15, 24, 9, 15, 1, 10, 13, 6, 3, 2, 13, 14, 14, 8, 22, 4 };
        String balloonSize = "LLMLLLLMLMLMLMLMLMMLLMLLMMLLLMMMLMLLMLMMLLMLLLLMLL";
        int[] maxAccepted = { 7, 25, 26, 3, 28, 17 };
        assertEquals(1, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case55() {
        int[] balloonCount = { 1, 4, 1, 9 };
        String balloonSize = "LLML";
        int[] maxAccepted = { 20, 21 };
        assertEquals(-1, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case56() {
        int[] balloonCount = { 1, 3, 5, 2, 1, 3, 1, 2, 5, 2, 5, 4, 5, 4, 1, 5, 3, 1, 3, 5, 5, 3, 5, 4, 5, 2, 3, 3, 5, 4, 3, 4, 4, 1, 2, 4, 2, 5, 1, 1, 5, 5, 3, 1, 4, 3, 4, 5, 3, 4 };
        String balloonSize = "MMLLMMLMMMLMMMMMLMMMMMMMMMMLLMLLLMMMLMMLMLMMLMMLMM";
        int[] maxAccepted = { 43, 8, 51, 25, 54, 28, 17, 22, 34, 33, 24, 31, 37, 36, 40 };
        assertEquals(-1, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case57() {
        int[] balloonCount = { 3, 2, 1, 3, 3, 3, 2, 2, 1, 1, 1, 1, 2, 1, 1, 1, 3, 1, 1, 1, 2, 1, 1, 1, 3, 1, 1, 3, 3, 2, 1, 3, 2, 2, 1, 1, 1, 2, 2, 1, 3, 3, 2, 3, 3, 1, 3, 2, 3, 1 };
        String balloonSize = "MMMMMMLLMMMMMMMMLMMMMMMMLMMMMMMMMMMMMMMMMMMMMMLLMM";
        int[] maxAccepted = { 81, 78, 34, 45, 33, 50 };
        assertEquals(-1, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case58() {
        int[] balloonCount = { 31, 20, 47, 21 };
        String balloonSize = "MLMM";
        int[] maxAccepted = { 10, 24, 27, 25, 15, 9, 17, 14, 18, 17, 20, 10, 12, 4, 2 };
        assertEquals(-1, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case59() {
        int[] balloonCount = { 9, 9, 7, 6, 4, 12, 2, 4, 7, 6, 7, 10, 11, 8, 9, 5, 11, 11, 2, 8, 9, 4, 8, 12, 13, 9, 1, 12, 8, 6, 10, 2, 5, 9, 2, 5, 12, 3, 9, 3, 6, 12, 6, 12, 1, 12 };
        String balloonSize = "MMLMLLLMMLMMLMLLLLLLLLLMLLLMLLLLLLLLLLMMMLLLLL";
        int[] maxAccepted = { 6, 81, 74, 36, 11, 38, 49, 65, 12, 16, 7, 50, 59, 66 };
        assertEquals(-1, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case60() {
        int[] balloonCount = { 17, 13, 11, 2, 14 };
        String balloonSize = "MMMMM";
        int[] maxAccepted = { 78, 53, 43, 26, 19, 49, 61, 27, 21, 45, 38, 23, 36, 52, 67 };
        assertEquals(-1, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case61() {
        int[] balloonCount = { 2, 1, 1, 2, 2, 2, 1, 1, 2, 2, 1, 1, 2, 2, 2, 2, 2, 2, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 2, 1, 1, 1, 2, 2, 2, 2, 1, 1, 1, 1, 1, 2, 1, 2, 1, 2 };
        String balloonSize = "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL";
        int[] maxAccepted = { 76, 5, 69, 11, 82, 48, 78, 51, 8, 39, 85, 53, 16, 62, 33 };
        assertEquals(-1, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case62() {
        int[] balloonCount = { 5, 3, 1, 2, 3, 2, 3, 5, 3, 3, 1, 3, 1, 5, 4, 4, 3, 3, 4, 5, 2, 3, 2, 5, 2, 2 };
        String balloonSize = "LMMMMMMMMLMLMMMLLMLLMMMMLM";
        int[] maxAccepted = { 44, 41, 50, 81 };
        assertEquals(-1, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case63() {
        int[] balloonCount = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        String balloonSize = "MLMMMMMLMLMMMMMMMMMMLMMMMMMMMMLMMMMMMLMLLMMMLMMMMM";
        int[] maxAccepted = { 15, 3, 10, 13, 7, 4, 10, 4, 15, 10, 10, 18, 12, 9, 11 };
        assertEquals(-1, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case64() {
        int[] balloonCount = { 9, 9, 6, 7, 3, 3, 9, 4, 4, 9, 7, 9, 4, 6, 4 };
        String balloonSize = "MMLMMMMLMMMMLLM";
        int[] maxAccepted = { 20, 8, 9, 4, 4, 40, 15, 27, 3, 18, 28, 36, 27, 26, 31 };
        assertEquals(-1, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case65() {
        int[] balloonCount = { 60, 2, 18, 32, 29, 32, 36, 1, 20, 34, 30, 43, 14, 60, 17, 26, 51, 3, 11, 8, 57, 39, 30, 48, 5, 10, 49, 13, 51, 29, 34, 15, 10, 33, 1, 30, 26, 26, 44, 58, 50, 28, 47, 60, 42, 29, 42, 3, 18, 47 };
        String balloonSize = "MMMMMMMMMMMMMLMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM";
        int[] maxAccepted = { 18, 97, 64, 78, 96, 59, 52, 73, 73, 66, 84, 38, 48, 89, 97 };
        assertEquals(295, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case66() {
        int[] balloonCount = { 36, 15, 40, 30, 36, 25, 25, 19, 5, 37, 23, 31, 12, 25, 23, 37, 33, 9, 4, 20, 19, 6, 23, 13, 8, 20, 28, 28, 35, 19, 27, 22, 40, 37, 29, 11, 12, 10, 13, 26, 5, 28, 10, 38, 1, 32, 35, 25, 26, 12 };
        String balloonSize = "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMLMMMMMM";
        int[] maxAccepted = { 50, 34, 45, 29, 19, 52, 41 };
        assertEquals(34, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case67() {
        int[] balloonCount = { 33, 52, 4, 34, 4, 57, 56, 43, 7, 22, 11, 30, 6, 36, 2, 50, 55, 5, 59, 51, 47, 51, 59 };
        String balloonSize = "MMMMMMMMMMMMMMMMLMMMMML";
        int[] maxAccepted = { 32, 63, 66, 33, 4, 67, 30, 63, 45, 11, 22, 14, 12, 46, 53 };
        assertEquals(29, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case68() {
        int[] balloonCount = { 1, 22, 5, 19, 4, 12, 4, 10, 19, 7, 20, 2, 24, 5, 11, 13, 7, 16, 2, 11, 16, 17, 5, 26, 14, 1, 19, 7, 9, 26, 13, 26, 14, 7, 16, 14, 9, 18, 21, 5, 11, 28, 12, 21, 9, 24, 24, 3, 28, 8 };
        String balloonSize = "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLMLLML";
        int[] maxAccepted = { 47, 23, 35, 68, 59, 13, 2, 70, 25, 19, 39, 32, 2, 55, 72 };
        assertEquals(259, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case69() {
        int[] balloonCount = { 47, 51, 51, 18, 52, 23, 25, 63, 34, 6, 37, 26, 15, 58, 17, 23, 8, 39, 10, 33, 58, 11, 36, 50, 20, 52, 58, 31, 36, 62, 42, 14, 3, 44, 44, 28, 46, 51, 51, 6, 13, 1, 52, 23, 25, 5, 44, 12, 36, 37 };
        String balloonSize = "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLMLLLLLLLLLLLLLLLLLLLL";
        int[] maxAccepted = { 24, 46, 22, 9, 75, 3, 64, 4, 39, 15, 57 };
        assertEquals(18, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case70() {
        int[] balloonCount = { 5, 72, 59, 73, 17, 62, 10 };
        String balloonSize = "MMMMLMM";
        int[] maxAccepted = { 6, 10, 25, 5, 26, 15, 7, 7, 19, 14, 22, 20, 28, 4, 15 };
        assertEquals(92, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case71() {
        int[] balloonCount = { 4, 35, 15, 12, 1, 41, 51 };
        String balloonSize = "MMMMLML";
        int[] maxAccepted = { 19, 78, 9 };
        assertEquals(37, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case72() {
        int[] balloonCount = { 2, 43, 22 };
        String balloonSize = "LMM";
        int[] maxAccepted = { 11, 13, 5, 24 };
        assertEquals(16, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case73() {
        int[] balloonCount = { 35, 35, 50, 4, 10, 31, 13, 6, 32, 38, 42, 51, 16, 41, 30, 14, 28, 38, 40, 51, 11, 45, 21, 12, 45, 14, 35, 38, 27, 10, 14, 14, 7, 30, 14, 31, 45, 18, 39, 4, 43, 21, 31, 25, 20, 49, 9, 50, 47, 4 };
        String balloonSize = "LLLLLLLLLLLLLLLLLLLMLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL";
        int[] maxAccepted = { 50, 59, 29, 48, 56, 69, 50, 24, 30, 44, 44, 44, 27, 41, 56 };
        assertEquals(47, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case74() {
        int[] balloonCount = { 13, 48, 52, 33, 11, 55, 22 };
        String balloonSize = "MLLMLLL";
        int[] maxAccepted = { 1, 21, 1, 7, 2, 31, 22, 11, 34, 32, 33 };
        assertEquals(21, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case75() {
        int[] balloonCount = { 2, 7, 11, 10, 4, 8, 4, 6, 8, 21, 7, 13, 5, 11, 3, 14, 4, 6, 6, 12, 19, 1, 6, 24, 4, 10, 3, 10, 6, 26, 8, 6, 9, 17, 13, 14, 1, 21, 3, 22, 14, 3, 12, 4, 19, 8, 12, 18, 10, 21 };
        String balloonSize = "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLMLMLLLLLLLLLLLLLLLLLL";
        int[] maxAccepted = { 88, 37, 41 };
        assertEquals(99, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case76() {
        int[] balloonCount = { 23, 16, 1, 38, 12, 14, 36, 1, 24, 25, 4, 19, 23, 5, 13, 36, 22, 1, 28, 14, 26, 7, 1, 42, 28, 24, 23, 17, 18, 14, 7, 42, 8, 38, 31, 1, 8, 34, 11, 39, 13, 8, 20, 30, 18, 29, 43, 35, 19, 12 };
        String balloonSize = "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLMLLL";
        int[] maxAccepted = { 27, 8, 26, 17, 25, 41, 37, 35, 19, 24, 3, 44, 51, 25, 20 };
        assertEquals(11, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case77() {
        int[] balloonCount = { 16, 52, 19, 29, 33, 42, 21, 18, 57, 29, 37, 55, 38, 36, 36, 36 };
        String balloonSize = "LLLLLLLLLLLLMLLL";
        int[] maxAccepted = { 60, 9, 21, 67, 2, 18, 42, 61, 46, 13, 27, 20, 4 };
        assertEquals(33, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case78() {
        int[] balloonCount = { 12, 10, 4, 4, 18, 20, 16, 22, 24, 18, 23, 12, 4, 3, 23, 12, 7, 13, 13, 15, 4, 13, 5, 18, 12, 14, 16, 13, 1, 3, 2, 6, 13, 15, 22, 24, 22, 9, 1, 12, 16, 22, 8, 2, 16, 23, 15, 1, 1, 9 };
        String balloonSize = "MMMMMLMMMMLMMMMMMMMMMMMMLMMMMMMMMMMLMLMMMLMMMLLMMM";
        int[] maxAccepted = { 35, 36, 15, 31, 3, 14, 27, 28, 16, 38, 4, 34, 31, 43, 47 };
        assertEquals(127, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case79() {
        int[] balloonCount = { 1, 20, 27, 7, 19, 9, 19, 5, 27, 1, 18, 21, 11, 11, 15, 22, 27, 22, 19, 21, 11, 1, 8, 8, 6, 18, 19, 16, 15, 27, 9, 20, 24, 13, 2, 18, 1, 6, 26, 29, 8, 27, 11, 8, 17, 8, 14, 20, 15, 2 };
        String balloonSize = "LLLLMLLMLLLLMLLLLLMLLMLLMLLLLLLLLLLLLLLLLMLLLMMLMM";
        int[] maxAccepted = { 12, 55, 31, 58, 47, 87, 35, 85, 57, 49, 44, 62, 27, 36, 41 };
        assertEquals(375, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case80() {
        int[] balloonCount = { 64, 54, 45, 6, 49, 44, 2, 62, 16, 11, 7, 50 };
        String balloonSize = "LMMMMMLMMMMM";
        int[] maxAccepted = { 84, 17, 23 };
        assertEquals(22, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case81() {
        int[] balloonCount = { 4, 2, 14, 17, 10, 10, 13, 10, 8, 3, 9, 7, 10, 7, 2, 16, 6, 6, 13, 17, 1, 17, 16, 1, 6, 18, 16, 11, 4, 6, 17, 7, 1, 14, 11, 14, 9, 16, 6, 1, 8, 17, 6, 15, 15, 5, 18, 5, 6, 2 };
        String balloonSize = "LLLLLLLLLLLLLLLLLMLLLMLLLLLLLLLLLLLLLLLLMLLLLLLLLL";
        int[] maxAccepted = { 45, 30, 69, 52, 2, 40, 6, 36, 10, 11, 13, 41, 56, 47, 15 };
        assertEquals(266, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case82() {
        int[] balloonCount = { 46, 57, 33, 47, 52, 30, 30, 62, 51, 9, 22, 60, 46, 2, 18, 37, 28, 58 };
        String balloonSize = "LLLLLLMLLLLLLLLLLL";
        int[] maxAccepted = { 68, 61, 21, 83, 90, 58, 58, 15, 69, 24, 7, 35, 11, 23, 63 };
        assertEquals(124, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case83() {
        int[] balloonCount = { 27, 12, 27, 21, 3, 13, 26, 14, 22, 22, 5, 15, 14, 25, 2, 25, 13, 5, 3, 21, 8, 11, 9, 5, 12, 26, 19, 15, 13, 14, 7, 23, 21, 18, 1, 10, 25, 16, 4, 8, 19, 25, 27, 21, 5, 9, 16, 16, 7, 22 };
        String balloonSize = "MMLMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM";
        int[] maxAccepted = { 43, 33, 41, 47, 19, 4, 33, 13, 35, 37, 40, 30, 34, 17 };
        assertEquals(122, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case84() {
        int[] balloonCount = { 26, 26, 47, 20, 49, 25, 15, 5, 53, 53, 55, 14, 10, 6, 52, 36, 28, 47, 31, 29, 35, 43, 49, 19, 21, 41, 58, 17, 17, 44, 2, 3, 47, 17, 49, 15, 13, 31, 15, 17, 6, 26, 51, 15, 58, 44, 25, 50, 1, 13 };
        String balloonSize = "LLLLLLLLLLLLLLLLLLLLLLLLLLMLLLMLLLLLLLLLLLLLLLLLLL";
        int[] maxAccepted = { 35, 74, 74, 29, 36, 26, 68, 23, 8 };
        assertEquals(50, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case85() {
        int[] balloonCount = { 28, 36, 17, 18, 27, 22, 15, 8, 27, 39, 40, 25, 23, 32, 8, 4, 4, 14, 15, 22 };
        String balloonSize = "MMLMMMLMLMMMLMMLLMLL";
        int[] maxAccepted = { 12, 43, 50, 8, 47, 8, 48, 8, 40, 29, 7, 22, 47, 18, 30 };
        assertEquals(82, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case86() {
        int[] balloonCount = { 56, 24, 52, 26, 16, 19, 69, 29, 70, 47, 59, 27, 38 };
        String balloonSize = "MLLMLMMMMMMLM";
        int[] maxAccepted = { 41, 38, 11, 13, 8, 50, 48, 26, 54, 52, 36, 34, 5, 51, 53 };
        assertEquals(47, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case87() {
        int[] balloonCount = { 27, 63, 13, 44, 46, 23, 47, 53, 22, 31, 70, 7, 28, 76, 31, 49, 3 };
        String balloonSize = "LLLMMMLLMLLLLLLML";
        int[] maxAccepted = { 41, 55, 57, 29, 65, 49, 55, 52, 31, 57, 33, 25, 16, 33, 35 };
        assertEquals(54, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case88() {
        int[] balloonCount = { 14, 11, 2, 12, 10, 10, 6, 7, 3, 3, 5, 2, 6, 11, 4, 13, 14, 9, 7, 13, 9, 13, 10, 6, 8, 9, 10, 8, 9, 14 };
        String balloonSize = "LLLMLMMLLMMLMMMLLLMLMLMMLMLLML";
        int[] maxAccepted = { 6, 2, 8, 32, 35, 29, 35, 11, 32, 31, 29 };
        assertEquals(135, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case89() {
        int[] balloonCount = { 49, 51, 2, 22, 48, 8, 19, 11, 41, 59, 29, 13, 20, 27, 41, 27, 6 };
        String balloonSize = "LLLLMLMLMLMLLLLLL";
        int[] maxAccepted = { 17, 36, 48, 4, 23, 78, 19, 2, 47, 71, 38, 20, 47, 21 };
        assertEquals(54, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case90() {
        int[] balloonCount = { 14, 12, 10, 1, 11, 5, 10, 5, 1, 10, 10, 5, 5, 1, 6, 10, 11, 7, 1, 2, 4, 6, 12, 14, 4, 11, 10, 1, 6 };
        String balloonSize = "LLLLLLMLLLLMLLLLLMLLLLMMLLLLL";
        int[] maxAccepted = { 53, 51, 61 };
        assertEquals(-1, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case91() {
        int[] balloonCount = { 89, 31, 46, 10, 45, 14, 14, 55, 34, 49, 43, 11, 55, 51, 38, 39, 13, 56 };
        String balloonSize = "LLLLLLMMLLMMLLLLLL";
        int[] maxAccepted = { 67, 9, 69, 69, 78, 58, 73, 6, 91, 78, 95 };
        assertEquals(-1, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case92() {
        int[] balloonCount = { 1, 11, 4, 6, 16, 15, 10, 18, 21, 1, 21, 2, 16, 7, 9, 15, 18, 22, 14, 21, 20, 20, 7, 12, 3, 17, 21, 19, 21, 14, 21, 8, 4, 19, 13, 2, 15, 7, 5, 15, 2, 4, 3, 13, 12, 22, 1, 12, 11, 2 };
        String balloonSize = "MMMMMMMMMMMMMMMMMMMMLMLMMMMMLMMMMMMMMMMMMMMMMMMMMM";
        int[] maxAccepted = { 28, 36, 90, 3, 77, 67, 60, 2, 60, 71, 4, 93 };
        assertEquals(-1, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case93() {
        int[] balloonCount = { 2, 1, 2, 2, 1, 2, 1, 1, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 2, 2, 1, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 2, 2, 1 };
        String balloonSize = "LMLMLMLLMLLLLLLMLLLLLLMMLLLLLMMLMLLLLLMLLLLLLLLMLL";
        int[] maxAccepted = { 10, 59 };
        assertEquals(-1, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case94() {
        int[] balloonCount = { 2, 3, 6, 6, 6, 7, 2, 4, 7, 5, 2, 1, 3, 2, 7, 2, 4, 7, 7, 7, 2, 7, 5, 5, 1, 3, 1, 7, 1, 4, 4, 1, 6, 3, 1, 2, 2, 5, 3, 4, 1, 5, 5, 6, 3, 7, 4, 3, 5, 3 };
        String balloonSize = "MMMMMMMMMMMMMLMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM";
        int[] maxAccepted = { 8, 17, 16, 18, 19, 14, 23, 8, 5, 22, 1, 13, 12, 11, 12 };
        assertEquals(-1, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case95() {
        int[] balloonCount = { 3, 19, 10, 18, 12, 17, 6, 6, 30, 25, 27, 20, 8, 35, 28, 10, 21, 24, 9, 9, 33, 18, 3, 7, 19, 15, 26, 24, 23, 11, 18, 11, 21, 17, 14, 20, 6, 21, 14, 31, 23, 2, 22, 35, 22, 9, 32, 10, 19, 18 };
        String balloonSize = "MLMLLMLLMMMMLLMMLMLLMLMMLMLMMLMLLLLLMLLLMLLMMLMMML";
        int[] maxAccepted = { 20, 73, 70, 70, 27, 59, 85, 37, 57, 44, 73, 69, 100, 31, 66 };
        assertEquals(468, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case96() {
        int[] balloonCount = { 8, 3, 2, 13, 14, 3, 3, 2 };
        String balloonSize = "LMMMLMMM";
        int[] maxAccepted = { 11, 10, 10, 7, 9, 1 };
        assertEquals(13, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case97() {
        int[] balloonCount = { 45, 48, 27 };
        String balloonSize = "LLM";
        int[] maxAccepted = { 13, 30, 16, 11, 22, 28 };
        assertEquals(46, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case98() {
        int[] balloonCount = { 8, 20, 22, 23, 22, 38, 3, 9, 18, 34, 19, 29, 31, 3, 23, 6, 6, 18, 1, 3, 34, 23, 20, 9, 40, 17, 24, 18, 23, 8, 32, 3, 43, 22, 22, 15, 17, 20, 4, 18, 12, 26, 22, 18, 12, 26, 22, 15, 12, 10 };
        String balloonSize = "MMMMLMMMMMMMMMMMMMMMMLMLMLMMMMMMMMMMMMMMMMLLMMLMLM";
        int[] maxAccepted = { 37, 100, 100, 100, 89, 43, 62, 94, 17, 34, 61, 100, 45, 15, 26 };
        assertEquals(489, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case99() {
        int[] balloonCount = { 36, 6, 20, 21, 12, 3, 31, 11, 1, 6, 30, 14, 25, 1, 3, 18, 22, 18, 17, 29, 8, 26, 22, 16, 20, 13, 13, 15, 16, 13, 25, 26, 16, 15, 9, 24, 25, 1, 37, 6, 26, 33, 20, 27, 28, 3, 14, 4, 20, 17 };
        String balloonSize = "MMMMMMMMMMMMMMMMMMMLMLMMMLMMLMMMMMMMMMLMMMMLMLLMMM";
        int[] maxAccepted = { 94, 18, 47, 100, 70, 72, 10, 100, 55, 96, 100, 100 };
        assertEquals(533, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case100() {
        int[] balloonCount = { 8, 5, 1, 4, 1, 1, 3, 1, 3, 3, 5, 4, 5, 6, 9 };
        String balloonSize = "MMMLLLMMLLMLMLM";
        int[] maxAccepted = { 3, 5, 3, 3, 5, 6, 4, 6, 4, 2, 3, 7, 1, 5, 2 };
        assertEquals(5, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case101() {
        int[] balloonCount = { 28, 7, 11, 8, 10, 4, 36, 3, 19, 28, 28, 15, 20, 16, 14, 12, 6, 21, 25, 11, 21, 2, 19, 12, 15, 19, 23, 22, 16, 18, 1, 13, 19, 33, 27, 10, 13, 18, 6, 13, 18, 2, 6, 14, 11, 15, 18, 7 };
        String balloonSize = "LMLMMMMMMMLMMMMMLMLMMMMMMMMLMLMMMLMMMMMMMMMMMMML";
        int[] maxAccepted = { 54, 39, 48, 69, 8, 60, 71, 74, 68, 2, 56, 38, 78, 45, 23 };
        assertEquals(395, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case102() {
        int[] balloonCount = { 24, 21, 1, 25, 26, 28, 26, 8, 2, 30, 4, 27, 25, 19, 13, 19, 1, 14, 25, 12, 34, 10, 14 };
        String balloonSize = "LLLLMLLLLMMMLMMLLLLLLLL";
        int[] maxAccepted = { 65, 29, 53, 100, 90, 71 };
        assertEquals(238, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case103() {
        int[] balloonCount = { 39, 5, 20, 28, 29, 31, 2, 28, 3, 4, 4, 21, 1, 14, 36, 5, 26, 34, 27, 20, 23, 14, 21, 37, 26, 16, 33, 13, 3, 13, 22, 27, 29, 29, 10, 25, 4, 2, 18, 28, 21, 1, 35, 28, 19, 10, 6, 28, 26, 31 };
        String balloonSize = "MMMMMMMMMMMMLLLMMMMMMMMMMMMMLMMMMMLLMMMMMMMMLLLMMM";
        int[] maxAccepted = { 39, 18, 41, 80, 58, 100, 53, 60, 100, 65, 1, 100, 100, 87, 73 };
        assertEquals(540, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case104() {
        int[] balloonCount = { 14, 7, 1, 6, 12, 16, 11, 15, 1, 6, 20, 11, 8, 5, 9, 9, 6, 24, 1, 1, 13, 7, 14, 6, 6, 6, 16, 4, 5, 15, 2, 19, 18, 4, 7, 14, 13, 18, 17, 4, 4, 18, 9, 21, 6, 3, 9, 1, 21, 17 };
        String balloonSize = "LLLLLLLLLLLMLLLLLLLMLLLLLLLLLLMLLLLLLLLLLLLLLLLLLL";
        int[] maxAccepted = { 42, 2, 57, 8, 32, 32, 64, 31, 37, 1, 39, 52, 13, 59, 31 };
        assertEquals(269, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case105() {
        int[] balloonCount = { 29, 4, 8, 29, 7, 18, 1, 29, 12, 17, 40, 23, 19, 40, 26, 7, 18, 30, 3, 6, 14, 22, 23, 2, 11, 21, 20, 12, 30, 24, 12, 38, 25, 14, 7, 14, 47, 38, 6, 42, 9, 52, 25, 19, 4, 46, 45, 38, 32, 31 };
        String balloonSize = "LLLMLMLMLLLMMMLLLLLLLLLLLLLLLMLLLMLLLLLLLLLLLLLLLL";
        int[] maxAccepted = { 57, 43, 2, 48, 100, 100, 98, 81, 100, 83, 50, 100, 100, 96, 31 };
        assertEquals(539, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case106() {
        int[] balloonCount = { 33, 24, 46, 8, 35, 26, 46, 10, 21, 14, 2, 5, 9, 24, 7, 19, 41, 38, 1, 27, 15, 43, 4, 6, 17, 37, 2, 38, 36, 3, 26, 33, 17, 48, 32, 40, 21, 21, 20, 45, 33, 37, 6, 29, 15, 16, 4, 1, 28, 40 };
        String balloonSize = "LLMLMLLLMLLLLLLMLLLMLLLLLLLLLLMLLLMLMLLLLMLMMMMMLL";
        int[] maxAccepted = { 100, 62, 100, 100, 98, 87, 69, 93, 78, 79, 52, 43, 61, 83, 44 };
        assertEquals(547, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case107() {
        int[] balloonCount = { 100, 92, 96, 42, 47, 100, 100, 100, 100, 100, 88, 6, 100, 14, 37, 26, 61 };
        String balloonSize = "MMMMLMLLMMMMLMMLM";
        int[] maxAccepted = { 100, 100, 7, 100, 100, 100, 100, 100, 60, 100, 100, 56, 100, 10, 76 };
        assertEquals(73, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case108() {
        int[] balloonCount = { 30, 40, 36, 19, 16, 34, 33, 10, 44, 36, 41, 6, 43, 37, 16, 7, 41, 21, 24, 25, 3, 4, 17, 40, 49, 13, 12, 35, 8, 37, 18, 2, 16, 38, 43, 28, 40, 30, 6, 42, 26, 4, 38, 22, 24, 20, 24, 36, 7, 31 };
        String balloonSize = "MMMMLLMMLLMMLLLMLMLMMLLMLMLMMMMMMMLMMMLLLLLMMLMMLM";
        int[] maxAccepted = { 100, 100, 100, 100, 100, 100, 100, 13, 96, 100, 20, 100, 97, 100, 46 };
        assertEquals(705, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case109() {
        int[] balloonCount = { 54, 20, 14, 26, 76, 35, 78, 58, 36, 4, 48, 41, 67, 48, 29, 15, 2, 53, 5 };
        String balloonSize = "MMMMMMMMMMMMMMLLMML";
        int[] maxAccepted = { 10, 14, 4, 22, 13, 83, 67, 77, 45, 85, 24, 94, 78, 66, 27 };
        assertEquals(123, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case110() {
        int[] balloonCount = { 13, 18, 6, 18, 18, 21, 4, 11, 14, 7, 13, 10, 1, 12, 12, 16, 7, 5, 1, 15, 20, 1, 12, 8, 4, 10, 14, 13, 6, 4, 5, 21, 5, 12, 1, 30, 7, 18, 1, 4, 19, 25, 12, 10, 5, 21, 9, 10, 23, 5 };
        String balloonSize = "MMMMMMLMMMLLMLLMMMLMMLLLMMMMMLLLMMMLLMLMMMMMLMLLML";
        int[] maxAccepted = { 39, 18, 62, 37, 4, 53, 10, 9, 81, 26, 43, 39, 6, 71, 59 };
        assertEquals(299, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case111() {
        int[] balloonCount = { 7, 4, 1, 3, 4, 2, 12, 4, 8, 3, 2, 8, 5, 5, 5, 8, 1, 4, 3, 6, 7, 8, 1, 8, 5, 6, 3, 1, 3, 10, 2, 6, 3, 1, 4, 5, 10, 2, 7, 3, 6, 1, 5, 5, 6, 11, 13, 5, 1, 8 };
        String balloonSize = "MMMMMMMLMMMMMMMMMLMMLMMMLMLMMMLMMMMLMMMMMLMLMMMMMM";
        int[] maxAccepted = { 2, 17, 34, 37, 58, 2, 26, 33, 42 };
        assertEquals(176, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case112() {
        int[] balloonCount = { 1, 26, 25, 15, 2, 13, 16, 1, 14, 12, 26, 23, 28, 26, 17, 21, 20, 21, 16, 15, 23, 12, 15, 28, 16, 9, 16, 3, 5, 13, 4, 25, 22, 15, 20, 12, 25, 5, 14, 4, 25, 24, 7, 1, 22, 4, 9, 7, 14, 17 };
        String balloonSize = "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLMLLLLLLLLLLLLLLLLLLLL";
        int[] maxAccepted = { 71, 53, 54, 68, 6, 54, 46, 75, 79, 8, 88, 51, 2, 11, 88 };
        assertEquals(448, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case113() {
        int[] balloonCount = { 12, 12, 3, 14, 24, 36, 2, 21, 30, 6, 6, 11, 34, 23, 49, 28, 13, 27, 33, 1, 29, 40, 12, 36, 37, 36, 31, 36, 36, 11, 28, 32, 26, 46, 28, 3, 31, 2, 38, 6, 13, 22, 44, 37, 5, 15, 38, 38, 22, 20 };
        String balloonSize = "LLLLLLLLLLLLLLLMLLMLMMLLLLLLLLLLLLLLLLLLLLLLLLLLLL";
        int[] maxAccepted = { 100, 100, 100, 100, 44, 74, 100, 100, 100, 100, 9, 70, 100, 41, 45 };
        assertEquals(637, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case114() {
        int[] balloonCount = { 7, 1, 6, 10, 5, 7, 3, 7, 13, 5, 3, 2, 3, 14, 4, 8, 3, 7, 12, 16, 8, 2, 19, 15, 19, 5, 4, 16, 4, 7, 2, 7, 5, 12, 2, 10, 2, 5, 10, 4, 14, 8, 9, 10, 2, 13, 5, 2, 8, 20 };
        String balloonSize = "LMLLLLLMLLLMLMLLMMLMLLMMLLLLMMLLLLLLMLLLLMLLLMLLLL";
        int[] maxAccepted = { 12, 18, 58, 25, 69, 100, 3, 100 };
        assertEquals(266, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case115() {
        int[] balloonCount = { 79, 73, 76, 39, 61, 92, 44, 38, 9, 62, 52 };
        String balloonSize = "MLLLMMLMLLL";
        int[] maxAccepted = { 5, 63, 49, 68, 53, 53, 2, 88, 13, 21, 87, 56, 31, 13, 23 };
        assertEquals(61, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case116() {
        int[] balloonCount = { 18, 71, 17, 24, 52 };
        String balloonSize = "LMMMM";
        int[] maxAccepted = { 24, 2, 2, 12, 13, 9, 9, 17, 13, 10, 2, 3, 17, 23, 26 };
        assertEquals(79, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case117() {
        int[] balloonCount = { 1, 18, 4, 7, 19, 7, 7, 1, 4, 8, 10, 5, 14, 13, 8, 22, 6, 3, 13, 5, 3, 4, 2, 1, 3, 15, 19, 4, 5, 9, 4, 11, 2, 7, 12, 20, 11, 26, 22, 7, 2, 10, 9, 20, 13, 20, 2, 9, 11, 9 };
        String balloonSize = "LLMLLLLMLLLLLLLLLLLLMLLLLLLLLLLMMLMLLLMLLLLLLLLMLL";
        int[] maxAccepted = { 44, 59, 29, 53, 16, 23, 13, 14, 29, 42, 13, 15, 66, 4, 47 };
        assertEquals(210, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case118() {
        int[] balloonCount = { 29, 13, 27, 23, 23, 1, 22, 8, 18, 8, 6, 17, 1, 25, 13, 5, 19, 26, 18, 24, 10, 33, 27, 21, 19, 6, 6, 1, 22, 24, 5, 12, 8, 11, 25, 8, 25, 3, 28, 2, 20, 22, 2, 6, 3, 15, 13, 12, 25, 27 };
        String balloonSize = "LLMMLMMMMMMLLMMMLLLMMMLLLLLMMMMLLLMLMLMLLLLMMMLMMM";
        int[] maxAccepted = { 100, 67, 5, 100, 54, 49, 24, 85, 43, 100, 56, 28, 56 };
        assertEquals(443, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case119() {
        int[] balloonCount = { 48, 29, 18, 37, 13, 60, 7, 3, 67, 6, 42, 28, 20, 1, 57, 57, 55 };
        String balloonSize = "LLLLMLLLMMLMLLLLL";
        int[] maxAccepted = { 21, 69, 61, 27, 41, 90, 41, 6, 30, 51, 33, 21, 57 };
        assertEquals(57, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case120() {
        int[] balloonCount = { 6, 9, 13, 4, 8, 3, 1, 6, 1, 8, 7, 5, 9, 6, 6, 3, 14, 5 };
        String balloonSize = "LLMLLLLLLLLMLMLLLL";
        int[] maxAccepted = { 19, 31, 62, 2 };
        assertEquals(-1, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case121() {
        int[] balloonCount = { 36, 56, 49, 32, 3, 70, 6, 59, 19, 33, 40, 33, 1, 11, 42, 43, 51, 32, 19, 16, 16, 44, 15, 64, 6, 40, 22, 40, 26, 21, 37, 38, 14, 1, 13, 6, 44, 41, 13, 5, 48, 41, 16, 18, 18, 12, 19, 14, 50, 17 };
        String balloonSize = "LLLLLLLLLLLLLLLLLLLLLLMLLLLLLLLLLLLLLLLLLLLLLLLLLL";
        int[] maxAccepted = { 84, 100, 100, 72, 100, 66, 100, 100, 88, 100, 100, 100, 100, 100, 100 };
        assertEquals(-1, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case122() {
        int[] balloonCount = { 41, 20, 21, 33, 29, 33, 30, 12, 65, 8, 6, 45, 50, 11, 12, 31, 39, 6, 69, 24, 9, 53, 46, 19, 52, 11, 44, 9, 39, 3, 43, 36, 34, 45, 24, 46, 22, 12, 31, 14, 39, 47, 14, 14, 58, 22, 31 };
        String balloonSize = "MMLLMLLMLMLLMMMLLLMLLMMLLMMMMMLLLLLLLMLLLMMLLLL";
        int[] maxAccepted = { 100, 100, 100, 100, 100, 100, 100, 100, 52, 50, 100, 100, 100, 100, 100 };
        assertEquals(-1, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case123() {
        int[] balloonCount = { 16, 1, 2, 4, 12, 17, 11, 11, 5, 13, 11, 8, 6, 9, 2, 3, 6, 3, 2, 9, 10, 9, 21, 10, 14, 19, 10, 6, 3, 12, 9, 9, 11, 9, 4, 3, 11, 13, 9, 14, 12, 6, 8, 2, 15 };
        String balloonSize = "LLLMLMLLMLLMLMMMLLMLMLLMMMLLLMLMLLMLMMLMMMLMM";
        int[] maxAccepted = { 59, 72, 85, 62, 59, 38, 12, 13 };
        assertEquals(-1, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case124() {
        int[] balloonCount = { 35, 26, 29, 50, 26, 1, 17, 2, 26, 15, 46, 13, 43, 41, 33, 12, 14, 32, 47, 27, 13, 14, 15, 30, 36, 42, 18, 27, 47, 28, 39, 10, 42, 29, 4, 3, 5, 7, 30 };
        String balloonSize = "MMMMLMMMLMMLMMMLMMMMMMLMMMMMMMMMMMLMMLM";
        int[] maxAccepted = { 39, 100, 21, 100, 100, 42, 39, 73, 100, 84, 100, 100, 76 };
        assertEquals(-1, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case125() {
        int[] balloonCount = { 28, 14, 19, 22, 17, 20, 15, 16, 9, 7, 6, 27 };
        String balloonSize = "MMLMMMMMMMMM";
        int[] maxAccepted = { 83 };
        assertEquals(55, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case126() {
        int[] balloonCount = { 71, 1, 6, 78, 15, 50, 74, 77 };
        String balloonSize = "MLMMMMMM";
        int[] maxAccepted = { 1, 2, 3, 1, 2, 2, 4, 3 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case127() {
        int[] balloonCount = { 19, 22, 13, 1, 14, 9, 17, 18, 18 };
        String balloonSize = "MLMMMMLLL";
        int[] maxAccepted = { 69, 21 };
        assertEquals(49, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case128() {
        int[] balloonCount = { 42, 45, 32, 11, 27, 15, 32, 43, 10, 28, 21, 25, 63, 42, 47, 36, 10, 44, 12, 13, 38, 39, 51, 6, 61, 11, 50, 32, 15, 42, 19, 5, 9, 48, 11, 33, 54 };
        String balloonSize = "LLLLLLLLLMLLMLLLLLLLLLLLMLLLLLLLLLLLL";
        int[] maxAccepted = { 37, 91, 53, 76 };
        assertEquals(50, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case129() {
        int[] balloonCount = { 2, 3, 2, 8, 9, 6, 3, 10, 10, 1, 2, 7, 8, 4, 5, 5, 7 };
        String balloonSize = "MMLMMLMMLLMLMLMML";
        int[] maxAccepted = { 18, 7, 22, 12, 12, 12, 4 };
        assertEquals(31, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case130() {
        int[] balloonCount = { 33, 3, 44, 42, 29, 43, 17, 30, 42, 25 };
        String balloonSize = "LLMLMLLLLL";
        int[] maxAccepted = { 22, 53, 42, 55, 57 };
        assertEquals(36, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case131() {
        int[] balloonCount = { 3, 3, 3, 1, 2, 3 };
        String balloonSize = "LMLMMM";
        int[] maxAccepted = { 6, 5 };
        assertEquals(5, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case132() {
        int[] balloonCount = { 52, 22, 24, 8, 51, 31, 3 };
        String balloonSize = "MMMMMMM";
        int[] maxAccepted = { 9, 11, 8, 2, 2, 3, 3, 5, 11 };
        assertEquals(4, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case133() {
        int[] balloonCount = { 32, 29, 43, 28, 41, 41, 10, 17, 23, 1, 38, 29, 16, 35, 1, 43, 42, 6, 26, 17, 43, 19, 31, 17, 14, 18, 6, 37, 14, 35, 35, 12 };
        String balloonSize = "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL";
        int[] maxAccepted = { 59, 84, 9, 47 };
        assertEquals(61, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case134() {
        int[] balloonCount = { 32, 6, 14, 27, 31, 30, 37, 33, 33, 24, 21, 22, 9, 34, 35, 9, 32, 23, 1, 25, 21, 14, 35, 14, 3, 29, 8 };
        String balloonSize = "MMMMMMMMMMMMMMMMMMMMMMMMMMM";
        int[] maxAccepted = { 39, 9, 2, 2, 15, 38, 17 };
        assertEquals(5, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case135() {
        int[] balloonCount = { 42, 1, 47, 33 };
        String balloonSize = "MMMM";
        int[] maxAccepted = { 12 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case136() {
        int[] balloonCount = { 13, 15, 7, 5, 5, 3, 8, 5, 13, 12, 11, 13, 4, 12, 14, 10, 2, 8, 8, 8, 15, 8, 3, 4, 2, 12, 14 };
        String balloonSize = "MMMMMMMMMMMMMMMMMMMMMMMMMMM";
        int[] maxAccepted = { 3, 4, 1, 5, 5, 3 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case137() {
        int[] balloonCount = { 30, 42, 35, 3, 18, 35, 47, 44, 54 };
        String balloonSize = "MMMLLMMMM";
        int[] maxAccepted = { 13, 12, 7, 1, 14, 8, 35, 30 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case138() {
        int[] balloonCount = { 30, 18, 5, 19, 21, 24, 17 };
        String balloonSize = "LLLLLLM";
        int[] maxAccepted = { 15, 2, 18, 35, 9, 10, 15, 11, 11, 8 };
        assertEquals(29, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case139() {
        int[] balloonCount = { 21, 45 };
        String balloonSize = "LL";
        int[] maxAccepted = { 42 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case140() {
        int[] balloonCount = { 61 };
        String balloonSize = "M";
        int[] maxAccepted = { 69, 13, 53, 72, 59, 38, 32, 3, 17, 61, 72, 25, 62 };
        assertEquals(-1, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case141() {
        int[] balloonCount = { 19 };
        String balloonSize = "M";
        int[] maxAccepted = { 20, 11, 6, 8, 26 };
        assertEquals(-1, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case142() {
        int[] balloonCount = { 48 };
        String balloonSize = "M";
        int[] maxAccepted = { 8, 20 };
        assertEquals(8, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case143() {
        int[] balloonCount = { 72 };
        String balloonSize = "L";
        int[] maxAccepted = { 2, 10, 29, 10 };
        assertEquals(22, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case144() {
        int[] balloonCount = { 54 };
        String balloonSize = "L";
        int[] maxAccepted = { 4 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case145() {
        int[] balloonCount = { 19, 11, 15, 14, 13, 23 };
        String balloonSize = "LLMMLM";
        int[] maxAccepted = { 83 };
        assertEquals(-1, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case146() {
        int[] balloonCount = { 1 };
        String balloonSize = "L";
        int[] maxAccepted = { 8 };
        assertEquals(-1, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case147() {
        int[] balloonCount = { 2, 1, 1, 1, 2, 1, 1, 2, 1, 1, 2, 2, 1, 2, 2, 1, 1, 2 };
        String balloonSize = "MLLMMLMLLMLLMLMMLL";
        int[] maxAccepted = { 59 };
        assertEquals(-1, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case148() {
        int[] balloonCount = { 20, 16, 2, 13, 4, 15, 8, 8, 3, 14, 14, 12, 6, 19, 15, 12, 13, 5, 4, 8, 20, 2, 7, 21, 3, 21, 11, 15, 24, 3, 23, 13, 20 };
        String balloonSize = "LLLLLLLMLLLLLLMLLMLMLLLLLMLLMLLLL";
        int[] maxAccepted = { 1 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case149() {
        int[] balloonCount = { 14, 5, 5, 27, 16, 25 };
        String balloonSize = "MLLMLL";
        int[] maxAccepted = { 3 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case150() {
        int[] balloonCount = { 74, 22, 50, 57, 59, 35, 26, 45, 70, 74, 22, 40, 39, 33, 56, 45, 4, 31, 50, 17, 10, 8, 34, 50, 67, 41, 8, 33, 74, 1, 50, 54, 68, 17, 46, 24, 1, 30, 24, 28, 7, 25, 52, 66, 65, 47, 18 };
        String balloonSize = "LLLLLLLLLLLLLMLLLLLLLLLLLMLMLLLMLLLLLMLLLMLLLLL";
        int[] maxAccepted = { 87 };
        assertEquals(13, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case151() {
        int[] balloonCount = { 1 };
        String balloonSize = "M";
        int[] maxAccepted = { 2 };
        assertEquals(-1, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case152() {
        int[] balloonCount = { 1 };
        String balloonSize = "L";
        int[] maxAccepted = { 1 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case153() {
        int[] balloonCount = { 2 };
        String balloonSize = "M";
        int[] maxAccepted = { 1 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case154() {
        int[] balloonCount = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
        String balloonSize = "MLMLMLMLMLMLMLMLMLMLMLMLMLMLMLMLMLMLMLMLMLMLMLMLML";
        int[] maxAccepted = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
        assertEquals(0, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case155() {
        int[] balloonCount = { 5, 6, 1, 5, 6, 1, 5, 6, 1 };
        String balloonSize = "MLMMLMMLM";
        int[] maxAccepted = { 7, 7, 4, 4, 7, 7 };
        assertEquals(6, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case156() {
        int[] balloonCount = { 1, 18, 4, 7, 19, 7, 7, 1, 4, 8, 10, 5, 14, 13, 8, 22, 6, 3, 13, 5, 3, 4, 2, 1, 3, 15, 19, 4, 5, 9, 4, 11, 2, 7, 12, 20, 11, 26, 22, 7, 2, 10, 9, 20, 13, 20, 2, 9, 11, 9 };
        String balloonSize = "LLMLLLLMLLLLLLLLLLLLMLLLLLLLLLLMMLMLLLMLLLLLLLLMLL";
        int[] maxAccepted = { 44, 59, 29, 53, 16, 23, 13, 14, 29, 42, 13, 15, 66, 4, 47 };
        assertEquals(210, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case157() {
        int[] balloonCount = { 8, 5, 1, 45, 1, 1, 3, 1, 3, 3, 5, 4, 5, 6, 9 };
        String balloonSize = "MMMLLLMMLLMLMLM";
        int[] maxAccepted = { 3, 5, 3, 3, 5, 6, 4, 6, 4, 2, 3, 7, 1, 5, 2 };
        assertEquals(4, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case158() {
        int[] balloonCount = { 100, 1, 6, 80, 2, 6, 7, 2, 1, 6, 4 };
        String balloonSize = "LLLLLLMMMMM";
        int[] maxAccepted = { 20, 10, 1, 100, 10, 1, 1, 1, 1, 1, 1, 3, 1, 1, 5 };
        assertEquals(11, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case159() {
        int[] balloonCount = { 100, 100 };
        String balloonSize = "ML";
        int[] maxAccepted = { 50, 51, 51 };
        assertEquals(-1, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case160() {
        int[] balloonCount = { 1, 1 };
        String balloonSize = "LM";
        int[] maxAccepted = { 2 };
        assertEquals(-1, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case161() {
        int[] balloonCount = { 3, 100 };
        String balloonSize = "MM";
        int[] maxAccepted = { 5, 7 };
        assertEquals(2, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case162() {
        int[] balloonCount = { 1, 2, 3, 3, 3, 4, 5 };
        String balloonSize = "LMMLMMM";
        int[] maxAccepted = { 3, 4, 5, 6 };
        assertEquals(3, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case163() {
        int[] balloonCount = { 100 };
        String balloonSize = "L";
        int[] maxAccepted = { 1, 2, 3, 4, 5 };
        assertEquals(10, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case164() {
        int[] balloonCount = { 3, 6, 10 };
        String balloonSize = "MMM";
        int[] maxAccepted = { 2, 2, 15 };
        assertEquals(5, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

    @Test
    public void case165() {
        int[] balloonCount = { 17, 10 };
        String balloonSize = "ML";
        int[] maxAccepted = { 10, 8, 8 };
        assertEquals(8, icpcballoons.minRepaintings(balloonCount, balloonSize, maxAccepted));
    }

}
