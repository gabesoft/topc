package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class MountainRangesTest {
    MountainRanges mountainranges = new MountainRanges();

    @Test
    public void case1() {
        int[] heights = { 5, 6, 2, 4 };
        assertEquals(2, mountainranges.countPeaks(heights));
    }

    @Test
    public void case2() {
        int[] heights = { 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(0, mountainranges.countPeaks(heights));
    }

    @Test
    public void case3() {
        int[] heights = { 2, 1 };
        assertEquals(1, mountainranges.countPeaks(heights));
    }

    @Test
    public void case4() {
        int[] heights = { 2, 5, 3, 7, 2, 8, 1, 3, 1 };
        assertEquals(4, mountainranges.countPeaks(heights));
    }

    @Test
    public void case5() {
        int[] heights = { 1 };
        assertEquals(1, mountainranges.countPeaks(heights));
    }

    @Test
    public void case6() {
        int[] heights = { 63, 97, 2, 40, 38, 22, 1, 68, 85, 59, 48, 53, 23, 23, 72, 86, 97, 11, 93, 76 };
        assertEquals(6, mountainranges.countPeaks(heights));
    }

    @Test
    public void case7() {
        int[] heights = { 52, 76, 51, 40 };
        assertEquals(1, mountainranges.countPeaks(heights));
    }

    @Test
    public void case8() {
        int[] heights = { 63, 89, 39, 87, 72, 92, 18, 24, 99, 32, 20, 55, 99 };
        assertEquals(5, mountainranges.countPeaks(heights));
    }

    @Test
    public void case9() {
        int[] heights = { 39, 64, 74, 51, 49, 55, 13, 90, 48, 77, 39, 9, 96, 32, 2, 3, 92, 53, 73, 7, 14, 6, 11, 82, 93, 84, 78, 74, 20, 63 };
        assertEquals(10, mountainranges.countPeaks(heights));
    }

    @Test
    public void case10() {
        int[] heights = { 29, 99, 98, 74, 31, 11, 67, 1, 87, 79, 42, 48, 35, 77, 63, 82, 63, 45, 2, 82, 37, 44, 67, 84, 98, 30, 65, 69, 45, 51, 58, 26, 78, 69, 64, 77, 48, 37, 41, 98, 74, 33, 62, 23, 56, 17, 24, 52, 43, 44 };
        assertEquals(17, mountainranges.countPeaks(heights));
    }

    @Test
    public void case11() {
        int[] heights = { 82, 57, 45, 29, 91, 52, 48, 33, 20, 95, 100, 51, 5, 92, 28, 51, 44, 27, 58, 11, 9, 94, 4, 9, 8, 99, 23, 76, 80, 70 };
        assertEquals(10, mountainranges.countPeaks(heights));
    }

    @Test
    public void case12() {
        int[] heights = { 84, 94, 72, 24, 46, 86, 39, 47, 10, 91, 60, 20 };
        assertEquals(4, mountainranges.countPeaks(heights));
    }

    @Test
    public void case13() {
        int[] heights = { 75, 6, 7, 11, 20, 84, 53, 46, 57, 10, 63, 52, 83, 41 };
        assertEquals(5, mountainranges.countPeaks(heights));
    }

    @Test
    public void case14() {
        int[] heights = { 52, 89, 60, 82, 97, 26, 44, 49, 53, 61, 16, 55, 67, 66, 95, 47, 47, 35, 95, 81, 62, 100, 70, 23 };
        assertEquals(7, mountainranges.countPeaks(heights));
    }

    @Test
    public void case15() {
        int[] heights = { 80, 4, 7, 73, 95, 56, 18, 71, 16, 26, 99, 97, 59, 54, 28, 91, 58, 16, 84, 52, 95, 37, 38, 70, 7, 89, 85 };
        assertEquals(9, mountainranges.countPeaks(heights));
    }

    @Test
    public void case16() {
        int[] heights = { 23, 38, 83, 19, 58, 92, 34, 94, 11, 93 };
        assertEquals(4, mountainranges.countPeaks(heights));
    }

    @Test
    public void case17() {
        int[] heights = { 73, 94, 99, 54, 5, 49, 76, 17, 50, 4, 78, 20, 33, 54, 95, 38, 8, 32, 12, 60, 50, 97, 36, 92, 54, 56, 76, 47, 48, 91, 72, 19, 85, 52, 87, 90, 25, 64, 86, 60, 39, 73, 6, 34, 72 };
        assertEquals(16, mountainranges.countPeaks(heights));
    }

    @Test
    public void case18() {
        int[] heights = { 58, 70, 100, 85, 48, 21, 48, 42, 23, 92, 87, 4, 10, 72, 53, 89, 9, 75 };
        assertEquals(6, mountainranges.countPeaks(heights));
    }

    @Test
    public void case19() {
        int[] heights = { 45, 47, 94, 44 };
        assertEquals(1, mountainranges.countPeaks(heights));
    }

    @Test
    public void case20() {
        int[] heights = { 89, 43, 78, 74, 56, 23, 25, 67, 32, 53, 14, 18, 30, 53, 40, 60, 19, 86, 63, 91, 1, 15 };
        assertEquals(9, mountainranges.countPeaks(heights));
    }

    @Test
    public void case21() {
        int[] heights = { 86, 68, 61, 33, 14, 93, 3, 39, 77, 82, 83, 23, 57, 42, 70, 63 };
        assertEquals(5, mountainranges.countPeaks(heights));
    }

    @Test
    public void case22() {
        int[] heights = { 4, 40, 72, 28, 56, 28, 19, 30, 63, 30, 81, 90, 28, 32, 41, 34, 32, 72, 76, 61, 17 };
        assertEquals(6, mountainranges.countPeaks(heights));
    }

    @Test
    public void case23() {
        int[] heights = { 26, 15, 26, 33, 4, 53, 68, 30, 19, 91, 29, 85, 100, 49, 28, 48, 89 };
        assertEquals(6, mountainranges.countPeaks(heights));
    }

    @Test
    public void case24() {
        int[] heights = { 16, 59, 49, 4, 87, 33, 34, 38, 2, 69, 43, 54, 47, 42, 22, 99 };
        assertEquals(6, mountainranges.countPeaks(heights));
    }

    @Test
    public void case25() {
        int[] heights = { 20, 2, 36, 90, 48, 63, 68, 38, 34, 6, 67, 17, 16, 53, 87, 70, 33, 66, 46, 65, 5, 45, 54, 25, 85, 18, 60, 20 };
        assertEquals(10, mountainranges.countPeaks(heights));
    }

    @Test
    public void case26() {
        int[] heights = { 40 };
        assertEquals(1, mountainranges.countPeaks(heights));
    }

    @Test
    public void case27() {
        int[] heights = { 10, 5, 36, 3, 98, 90, 98, 65, 80, 39, 79, 65 };
        assertEquals(6, mountainranges.countPeaks(heights));
    }

    @Test
    public void case28() {
        int[] heights = { 27, 13, 31, 100, 6, 28, 31, 33, 61, 2, 20, 42, 53, 78, 96, 89, 9, 2, 18, 87, 61, 89, 93, 27, 11, 82, 51 };
        assertEquals(7, mountainranges.countPeaks(heights));
    }

    @Test
    public void case29() {
        int[] heights = { 2, 18, 91, 44, 92, 97, 11, 23, 27, 64, 2, 69, 18, 56, 4, 58, 59, 28, 11, 45, 22, 84, 49, 27, 92, 49, 17, 86, 39, 79, 38, 24, 36, 77, 47, 5, 75, 18, 2, 100 };
        assertEquals(14, mountainranges.countPeaks(heights));
    }

    @Test
    public void case30() {
        int[] heights = { 90, 79, 6, 94, 50, 80, 48, 19, 67, 90, 77, 8, 78, 62, 13, 61, 79, 22, 22, 91, 27, 65, 80, 62, 46, 8, 36, 68, 48, 56, 46 };
        assertEquals(10, mountainranges.countPeaks(heights));
    }

    @Test
    public void case31() {
        int[] heights = { 91, 31, 100, 38, 96, 33, 76, 83, 78, 85, 40, 29, 88, 33, 4, 49, 14 };
        assertEquals(7, mountainranges.countPeaks(heights));
    }

    @Test
    public void case32() {
        int[] heights = { 98, 6, 42, 18, 25, 18, 51, 67, 4, 80, 27, 70, 79, 5, 29, 77, 26, 73, 89, 85, 49, 65, 36, 69, 65, 47, 45, 54, 94, 45, 77, 76, 9, 13, 34, 66, 10, 4 };
        assertEquals(13, mountainranges.countPeaks(heights));
    }

    @Test
    public void case33() {
        int[] heights = { 95, 59, 61, 86, 82, 86, 67, 76, 9, 3, 77, 45, 44, 85, 94, 51, 14, 84, 58, 47, 39, 85, 51, 27, 93, 8, 14, 60, 27, 48, 47, 28, 43, 77, 38, 7, 92, 15, 66, 69 };
        assertEquals(14, mountainranges.countPeaks(heights));
    }

    @Test
    public void case34() {
        int[] heights = { 36, 81, 53, 83, 20, 90, 30, 98, 81, 43, 28, 60, 99, 15, 26, 25, 71, 99 };
        assertEquals(7, mountainranges.countPeaks(heights));
    }

    @Test
    public void case35() {
        int[] heights = { 55, 27, 91, 86, 50, 21, 95, 98, 7, 93, 46, 95, 63, 89, 93, 71, 41, 25, 75, 64, 36, 72, 56, 47, 3, 7, 97, 34, 83, 75, 83, 25, 56, 41, 13, 26, 92, 34, 55, 99, 12, 71, 24, 94, 91, 83, 51 };
        assertEquals(16, mountainranges.countPeaks(heights));
    }

    @Test
    public void case36() {
        int[] heights = { 51, 62, 93, 45, 31, 4, 24, 6, 49, 82, 48, 33, 7, 12 };
        assertEquals(4, mountainranges.countPeaks(heights));
    }

    @Test
    public void case37() {
        int[] heights = { 80, 25, 59, 64, 41, 45, 52, 8, 10, 63, 93, 87, 95, 31, 14, 94, 60, 88, 53, 67, 99, 56, 88, 83, 92, 87, 84, 19, 65, 98, 20, 32, 75, 13 };
        assertEquals(12, mountainranges.countPeaks(heights));
    }

    @Test
    public void case38() {
        int[] heights = { 34, 86, 81, 45 };
        assertEquals(1, mountainranges.countPeaks(heights));
    }

    @Test
    public void case39() {
        int[] heights = { 45, 12, 84, 13, 74, 64, 1, 66, 76, 49, 80, 78, 54, 59, 45, 32, 41, 41, 61, 100, 4, 81, 41, 42, 80 };
        assertEquals(9, mountainranges.countPeaks(heights));
    }

    @Test
    public void case40() {
        int[] heights = { 83, 45, 57, 82, 81, 52, 12, 48 };
        assertEquals(3, mountainranges.countPeaks(heights));
    }

    @Test
    public void case41() {
        int[] heights = { 16, 29, 7, 55, 40, 38, 55, 14, 65, 29, 92, 87, 14, 32, 32, 83, 76, 54, 92, 6, 88, 25, 83, 91, 61, 95, 83, 18, 58, 16, 70, 33, 23, 96, 13, 79 };
        assertEquals(14, mountainranges.countPeaks(heights));
    }

    @Test
    public void case42() {
        int[] heights = { 73, 75, 58, 57, 40, 67, 20, 25, 5, 60, 94, 12, 63, 83, 45, 48, 19, 65, 2, 38, 7, 43, 15, 97, 88, 80, 53, 66, 75, 98, 87, 47, 6 };
        assertEquals(11, mountainranges.countPeaks(heights));
    }

    @Test
    public void case43() {
        int[] heights = { 27, 22, 49, 34, 69, 43, 97, 12, 97, 64, 74, 68, 17, 79, 96, 73, 47, 79, 20, 30, 77, 35, 40, 5, 25, 6, 89, 85, 50, 43, 26, 15, 42, 51, 18, 87, 33, 84, 13, 93 };
        assertEquals(16, mountainranges.countPeaks(heights));
    }

    @Test
    public void case44() {
        int[] heights = { 11, 88, 74, 72, 23, 91, 67, 22, 34, 57, 45, 16, 36, 43, 45, 69, 82, 69, 80, 67, 91, 64, 11, 58, 56, 3, 94, 61 };
        assertEquals(8, mountainranges.countPeaks(heights));
    }

    @Test
    public void case45() {
        int[] heights = { 16, 86, 30, 16, 63, 35, 33, 49, 37, 73, 27, 11, 35, 61, 43, 60, 31, 38, 69, 78, 56, 69, 62, 57, 8, 99, 13, 99, 66, 50, 53, 12, 44, 35, 25, 12, 32, 97, 5, 13, 86, 21, 30 };
        assertEquals(15, mountainranges.countPeaks(heights));
    }

    @Test
    public void case46() {
        int[] heights = { 93, 93, 82, 83, 32, 59, 47, 26 };
        assertEquals(2, mountainranges.countPeaks(heights));
    }

    @Test
    public void case47() {
        int[] heights = { 45, 4, 11, 39, 72, 1, 49, 11, 60, 92, 84, 51, 51, 74, 8, 50, 59, 9, 50 };
        assertEquals(7, mountainranges.countPeaks(heights));
    }

    @Test
    public void case48() {
        int[] heights = { 6, 51, 22, 44, 84, 9, 38, 18, 40, 53, 21, 98, 51, 57, 27, 85, 53, 70, 54, 52, 39, 90, 39, 75, 48, 48, 24, 59, 30, 42 };
        assertEquals(12, mountainranges.countPeaks(heights));
    }

    @Test
    public void case49() {
        int[] heights = { 19, 83, 76, 58, 49, 31, 20, 83, 88, 15, 84, 75, 13, 60, 45, 9, 15, 5, 52, 51, 97, 48, 73, 8, 25, 97, 82, 56, 87, 16, 56, 52, 64, 77, 91, 22, 17, 21, 17, 100 };
        assertEquals(14, mountainranges.countPeaks(heights));
    }

    @Test
    public void case50() {
        int[] heights = { 88, 27, 86, 44, 66, 53, 41, 41, 51, 6, 90, 65, 43, 76, 25, 5, 12, 31, 52, 65, 35, 73, 3, 56, 24, 47, 28, 34, 100, 29, 9, 48, 35, 26, 32 };
        assertEquals(13, mountainranges.countPeaks(heights));
    }

    @Test
    public void case51() {
        int[] heights = { 15, 46, 58, 61, 30, 94, 87, 20, 58, 76, 57, 48, 57, 51, 28, 74, 47, 15, 46, 66, 34, 45, 67, 11, 66, 42, 14, 24, 17, 76, 98, 79, 49, 17, 54, 11, 71, 83, 4 };
        assertEquals(12, mountainranges.countPeaks(heights));
    }

    @Test
    public void case52() {
        int[] heights = { 9, 41, 62, 87, 78, 8, 99, 10, 19, 62, 83, 45, 81, 46, 98, 61, 84, 76, 70, 86 };
        assertEquals(7, mountainranges.countPeaks(heights));
    }

    @Test
    public void case53() {
        int[] heights = { 43, 20, 79, 80, 56, 1, 58, 95, 67, 53, 98, 24, 10, 67, 45 };
        assertEquals(5, mountainranges.countPeaks(heights));
    }

    @Test
    public void case54() {
        int[] heights = { 1, 39, 87, 8, 37, 43, 25, 15, 15, 66, 2, 34, 64, 79, 21, 71, 2, 58, 73, 92, 48, 99, 5, 43, 16, 21, 86, 96, 92, 80, 52 };
        assertEquals(9, mountainranges.countPeaks(heights));
    }

    @Test
    public void case55() {
        int[] heights = { 25, 68, 46, 78, 18, 44, 41, 6, 72, 39, 77 };
        assertEquals(5, mountainranges.countPeaks(heights));
    }

    @Test
    public void case56() {
        int[] heights = { 2, 2 };
        assertEquals(0, mountainranges.countPeaks(heights));
    }

    @Test
    public void case57() {
        int[] heights = { 3, 2, 1 };
        assertEquals(1, mountainranges.countPeaks(heights));
    }

    @Test
    public void case58() {
        int[] heights = { 100, 99, 100 };
        assertEquals(2, mountainranges.countPeaks(heights));
    }

    @Test
    public void case59() {
        int[] heights = { 99, 100, 99 };
        assertEquals(1, mountainranges.countPeaks(heights));
    }

    @Test
    public void case60() {
        int[] heights = { 2, 3, 2, 3, 1, 2, 2, 3, 3 };
        assertEquals(2, mountainranges.countPeaks(heights));
    }

    @Test
    public void case61() {
        int[] heights = { 3, 2, 2 };
        assertEquals(1, mountainranges.countPeaks(heights));
    }

    @Test
    public void case62() {
        int[] heights = { 1, 2, 2, 2, 3, 2, 3, 3, 2, 2, 3, 3, 3, 1, 1, 2, 3, 1, 1, 2, 2, 3, 3, 2, 2, 1, 1, 1, 3, 3, 1 };
        assertEquals(2, mountainranges.countPeaks(heights));
    }

    @Test
    public void case63() {
        int[] heights = { 1, 2, 3, 2, 3, 1, 1, 2, 3, 3, 1, 3, 2, 3, 1, 2, 1, 1, 2, 3, 2, 2, 3, 2, 3, 3, 3, 2, 2, 3, 1, 2, 1, 3, 1, 1, 1, 2, 3, 2, 1, 3 };
        assertEquals(12, mountainranges.countPeaks(heights));
    }

    @Test
    public void case64() {
        int[] heights = { 3, 1, 3, 3, 1, 1, 1, 1, 3, 2, 1, 1, 1, 3, 1, 1, 2, 2, 2 };
        assertEquals(3, mountainranges.countPeaks(heights));
    }

    @Test
    public void case65() {
        int[] heights = { 3, 2, 1, 1, 1, 2, 1, 1, 3, 2, 2, 1, 3, 1, 3, 3, 1, 3, 3, 2, 3, 3, 1, 1 };
        assertEquals(4, mountainranges.countPeaks(heights));
    }

    @Test
    public void case66() {
        int[] heights = { 2, 1, 2, 1, 3, 1, 1, 3, 2, 1, 3, 2, 2, 2, 3, 3, 2, 3, 2, 3, 3, 2, 2, 2, 2, 1, 3, 3, 2, 1, 1, 1 };
        assertEquals(6, mountainranges.countPeaks(heights));
    }

    @Test
    public void case67() {
        int[] heights = { 2, 2, 3, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3 };
        assertEquals(1, mountainranges.countPeaks(heights));
    }

    @Test
    public void case68() {
        int[] heights = { 1, 2, 3, 2, 2, 1, 1, 2, 3, 2, 1, 1, 3, 2, 2, 2, 1, 3, 2, 2, 1, 1, 3, 3, 3, 3, 3, 3, 2, 3, 1, 2, 2, 1, 3, 3, 3, 2 };
        assertEquals(5, mountainranges.countPeaks(heights));
    }

    @Test
    public void case69() {
        int[] heights = { 2, 3, 3, 2, 3, 1, 3, 3, 1, 1, 3, 2, 2, 3, 1, 2, 3, 1, 3, 1, 3, 2, 2 };
        assertEquals(6, mountainranges.countPeaks(heights));
    }

    @Test
    public void case70() {
        int[] heights = { 1, 3, 3, 1, 3, 3, 2, 3, 2, 2, 3, 2, 3, 3, 2, 2, 3, 3, 2, 1, 1 };
        assertEquals(2, mountainranges.countPeaks(heights));
    }

    @Test
    public void case71() {
        int[] heights = { 1, 1, 1, 1 };
        assertEquals(0, mountainranges.countPeaks(heights));
    }

    @Test
    public void case72() {
        int[] heights = { 1, 1, 3, 3, 1, 1 };
        assertEquals(0, mountainranges.countPeaks(heights));
    }

    @Test
    public void case73() {
        int[] heights = { 3, 3, 2, 3, 1, 1, 2, 1, 2, 3, 2, 2, 1, 1, 3, 3, 1, 2, 1, 2, 3, 3, 1, 2, 2, 1 };
        assertEquals(4, mountainranges.countPeaks(heights));
    }

    @Test
    public void case74() {
        int[] heights = { 1, 2, 3, 4, 4, 3, 2, 1 };
        assertEquals(0, mountainranges.countPeaks(heights));
    }

    @Test
    public void case75() {
        int[] heights = { 1, 2, 3, 1, 3, 4, 5, 1, 6, 8, 1, 9, 15, 6, 18 };
        assertEquals(5, mountainranges.countPeaks(heights));
    }

    @Test
    public void case76() {
        int[] heights = { 1 };
        assertEquals(1, mountainranges.countPeaks(heights));
    }

    @Test
    public void case77() {
        int[] heights = { 4 };
        assertEquals(1, mountainranges.countPeaks(heights));
    }

    @Test
    public void case78() {
        int[] heights = { 1, 2, 3, 4, 4, 3, 2, 1 };
        assertEquals(0, mountainranges.countPeaks(heights));
    }

    @Test
    public void case79() {
        int[] heights = { 5 };
        assertEquals(1, mountainranges.countPeaks(heights));
    }

    @Test
    public void case80() {
        int[] heights = { 2, 2 };
        assertEquals(0, mountainranges.countPeaks(heights));
    }

    @Test
    public void case81() {
        int[] heights = { 2, 1, 1, 1, 2 };
        assertEquals(2, mountainranges.countPeaks(heights));
    }

    @Test
    public void case82() {
        int[] heights = { 2, 1, 2 };
        assertEquals(2, mountainranges.countPeaks(heights));
    }

    @Test
    public void case83() {
        int[] heights = { 5, 5 };
        assertEquals(0, mountainranges.countPeaks(heights));
    }

    @Test
    public void case84() {
        int[] heights = { 2, 1 };
        assertEquals(1, mountainranges.countPeaks(heights));
    }

    @Test
    public void case85() {
        int[] heights = { 1, 1 };
        assertEquals(0, mountainranges.countPeaks(heights));
    }

    @Test
    public void case86() {
        int[] heights = { 99 };
        assertEquals(1, mountainranges.countPeaks(heights));
    }

    @Test
    public void case87() {
        int[] heights = { 11, 1, 11, 1, 11, 1, 11, 1 };
        assertEquals(4, mountainranges.countPeaks(heights));
    }

    @Test
    public void case88() {
        int[] heights = { 2, 1, 1 };
        assertEquals(1, mountainranges.countPeaks(heights));
    }

    @Test
    public void case89() {
        int[] heights = { 42 };
        assertEquals(1, mountainranges.countPeaks(heights));
    }

    @Test
    public void case90() {
        int[] heights = { 10, 9, 8, 7, 6, 4, 3, 2, 1 };
        assertEquals(1, mountainranges.countPeaks(heights));
    }

    @Test
    public void case91() {
        int[] heights = { 3, 2, 3 };
        assertEquals(2, mountainranges.countPeaks(heights));
    }

    @Test
    public void case92() {
        int[] heights = { 5, 6, 7, 8, 7, 6, 7, 6, 7, 6, 6 };
        assertEquals(3, mountainranges.countPeaks(heights));
    }

}
