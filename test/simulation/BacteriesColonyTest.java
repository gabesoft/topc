package topc.test.simulation;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.simulation.*;

public class BacteriesColonyTest {
    BacteriesColony bacteriescolony = new BacteriesColony();

    @Test
    public void case1() {
        int[] colonies = { 5, 3, 4, 6, 1 };
        assertArrayEquals(new int[] { 5, 4, 4, 4, 1 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case2() {
        int[] colonies = { 1, 5, 4, 9 };
        assertArrayEquals(new int[] { 1, 4, 5, 9 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case3() {
        int[] colonies = { 78, 34, 3, 54, 44, 99 };
        assertArrayEquals(new int[] { 78, 34, 34, 49, 49, 99 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case4() {
        int[] colonies = { 32, 68, 50, 89, 34, 56, 47, 30, 82, 7, 21, 16, 82, 24, 91 };
        assertArrayEquals(new int[] { 32, 59, 59, 59, 47, 47, 47, 47, 47, 18, 18, 19, 53, 53, 91 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case5() {
        int[] colonies = { 51, 19, 61, 85, 24, 95, 64, 97, 7, 23, 80, 52, 6, 67, 89 };
        assertArrayEquals(new int[] { 51, 51, 61, 61, 61, 79, 80, 80, 23, 23, 52, 52, 52, 67, 89 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case6() {
        int[] colonies = { 74, 19, 40, 11, 85, 21, 10, 3, 69, 23, 100, 83, 56, 34, 97 };
        assertArrayEquals(new int[] { 74, 30, 29, 29, 29, 21, 10, 10, 46, 46, 83, 83, 56, 56, 97 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case7() {
        int[] colonies = { 24, 8, 56, 96, 97, 89, 68, 2, 81, 19, 68, 90, 33, 85, 37 };
        assertArrayEquals(new int[] { 24, 24, 56, 96, 96, 89, 68, 50, 50, 50, 68, 68, 59, 59, 37 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case8() {
        int[] colonies = { 13, 67, 95, 82, 24, 10, 81, 19, 67, 60, 16, 84, 47, 44, 65 };
        assertArrayEquals(new int[] { 13, 67, 82, 82, 24, 24, 50, 50, 60, 60, 50, 50, 47, 47, 65 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case9() {
        int[] colonies = { 16, 46, 91, 72, 39, 49, 93, 35, 51, 38, 7, 30, 21, 83, 56 };
        assertArrayEquals(new int[] { 16, 46, 72, 72, 49, 49, 49, 43, 43, 38, 25, 25, 26, 56, 56 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case10() {
        int[] colonies = { 1, 88, 27, 25, 28, 10, 24, 97, 66, 24, 85, 41, 65, 79, 80 };
        assertArrayEquals(new int[] { 1, 27, 27, 27, 26, 24, 24, 66, 66, 63, 63, 63, 65, 79, 80 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case11() {
        int[] colonies = { 3, 25, 59, 6, 57, 15, 54, 78, 76, 72, 16, 99, 78, 51, 94 };
        assertArrayEquals(new int[] { 3, 25, 32, 33, 36, 36, 54, 76, 76, 72, 72, 78, 78, 78, 94 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case12() {
        int[] colonies = { 2, 5, 47, 76, 20, 93, 68, 36, 64, 55, 79, 16, 75, 35, 80 };
        assertArrayEquals(new int[] { 2, 5, 47, 48, 48, 68, 68, 59, 59, 60, 60, 55, 55, 55, 80 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case13() {
        int[] colonies = { 70, 7, 31, 55, 66, 85, 53, 35, 16, 67, 56, 23, 84, 50, 61 };
        assertArrayEquals(new int[] { 70, 31, 31, 55, 66, 66, 53, 35, 35, 56, 56, 56, 61, 61, 61 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case14() {
        int[] colonies = { 87, 83, 29, 81, 42, 74, 23, 2, 67, 94, 6, 64, 27, 100, 42, 86, 41, 10, 39, 27, 50, 96, 6, 83, 97, 71, 49, 48, 7, 87, 54, 96, 91, 52, 85, 6, 90, 8, 76, 43, 69, 94, 16, 55, 71, 26, 42, 71, 12, 72 };
        assertArrayEquals(new int[] { 87, 83, 58, 58, 58, 58, 23, 23, 67, 67, 45, 45, 46, 64, 64, 64, 41, 33, 33, 33, 50, 51, 51, 83, 83, 71, 49, 48, 48, 70, 71, 91, 91, 69, 68, 49, 49, 49, 59, 60, 69, 69, 55, 55, 55, 42, 42, 42, 42, 72 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case15() {
        int[] colonies = { 88, 18, 70, 78, 88, 39, 35, 81, 65, 49, 72, 54, 84, 58, 84, 97, 12, 63, 16, 19, 39, 1, 58, 21, 8, 52, 74, 91, 85, 32, 65, 62, 32, 32, 36, 28, 24, 45, 5, 82, 15, 60, 64, 52, 29, 47, 83, 26, 84, 74 };
        assertArrayEquals(new int[] { 88, 70, 70, 78, 78, 39, 39, 65, 65, 63, 63, 63, 71, 71, 84, 84, 38, 37, 19, 19, 20, 20, 21, 21, 21, 52, 74, 85, 85, 62, 62, 62, 32, 32, 32, 28, 28, 28, 28, 48, 49, 60, 60, 52, 47, 47, 54, 55, 74, 74 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case16() {
        int[] colonies = { 84, 2, 46, 56, 46, 97, 34, 23, 62, 56, 54, 44, 63, 48, 68, 80, 52, 23, 32, 28, 82, 72, 94, 54, 98, 41, 73, 68, 31, 31, 51, 96, 70, 23, 37, 49, 73, 31, 65, 77, 67, 75, 70, 76, 99, 42, 13, 40, 67, 76 };
        assertArrayEquals(new int[] { 84, 46, 46, 51, 51, 51, 34, 34, 56, 56, 54, 54, 55, 56, 68, 68, 52, 30, 30, 30, 77, 77, 77, 76, 76, 68, 68, 68, 31, 31, 51, 70, 70, 37, 37, 49, 52, 52, 65, 72, 72, 72, 73, 76, 76, 42, 40, 40, 67, 76 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case17() {
        int[] colonies = { 38, 41, 70, 100, 20, 74, 27, 9, 4, 16, 36, 16, 22, 67, 63, 5, 58, 44, 40, 12, 95, 30, 100, 42, 90, 15, 59, 76, 97, 100, 8, 97, 36, 59, 1, 95, 59, 41, 21, 80, 45, 12, 66, 38, 93, 27, 30, 76, 51, 28 };
        assertArrayEquals(new int[] { 38, 41, 70, 70, 47, 47, 27, 9, 9, 16, 22, 22, 22, 63, 63, 44, 44, 44, 40, 40, 62, 63, 66, 66, 66, 59, 59, 76, 97, 97, 53, 52, 48, 47, 47, 59, 59, 41, 41, 45, 45, 45, 52, 52, 52, 30, 30, 51, 51, 28 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case18() {
        int[] colonies = { 10, 42, 34, 69, 85, 7, 3, 78, 94, 94, 8, 57, 79, 28, 90, 47, 68, 67, 100, 47, 91, 74, 57, 96, 18, 63, 76, 59, 48, 96, 2, 46, 39, 43, 83, 27, 22, 96, 8, 36, 45, 60, 24, 47, 33, 43, 34, 64, 58, 82 };
        assertArrayEquals(new int[] { 10, 38, 38, 69, 69, 7, 7, 78, 94, 94, 57, 57, 57, 57, 67, 67, 67, 68, 73, 74, 74, 74, 74, 74, 63, 63, 63, 59, 59, 59, 42, 42, 43, 43, 43, 27, 27, 36, 36, 36, 45, 45, 38, 38, 38, 38, 39, 61, 61, 82 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case19() {
        int[] colonies = { 19, 59, 62, 79, 73, 3, 47, 80, 6, 20, 72, 22, 93, 1, 80, 49, 90, 39, 59, 91, 36, 50, 18, 15, 36, 13, 97, 52, 39, 56, 55, 46, 44, 17, 32, 15, 23, 90, 74, 57, 5, 6, 70, 76, 81, 50, 80, 14, 62, 50 };
        assertArrayEquals(new int[] { 19, 59, 62, 73, 73, 47, 47, 47, 20, 20, 47, 47, 47, 47, 64, 65, 65, 59, 59, 59, 43, 43, 18, 18, 24, 25, 52, 52, 52, 55, 55, 46, 44, 25, 24, 23, 23, 74, 74, 57, 6, 6, 70, 76, 76, 65, 65, 50, 50, 50 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case20() {
        int[] colonies = { 21, 82, 54, 8, 12, 53, 91, 72, 43, 26, 44, 28, 35, 53, 54, 6, 19, 98, 11, 40, 77, 79, 11, 88, 54, 47, 57, 44, 79, 69, 88, 47, 8, 84, 35, 53, 55, 84, 22, 83, 56, 69, 58, 74, 39, 78, 86, 78, 79, 48 };
        assertArrayEquals(new int[] { 21, 54, 54, 12, 12, 53, 72, 72, 43, 35, 35, 35, 35, 53, 53, 19, 19, 40, 40, 40, 77, 77, 54, 54, 54, 52, 52, 52, 74, 74, 74, 47, 47, 53, 53, 53, 55, 55, 55, 63, 63, 63, 64, 64, 64, 78, 79, 79, 78, 48 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case21() {
        int[] colonies = { 47, 90, 34, 8, 17, 78, 13, 23, 83, 92, 82, 29, 49, 55, 2, 13, 19, 17, 4, 94, 17, 43, 99, 52, 97, 50, 67, 45, 24, 32, 83, 14, 69, 3, 81, 30, 39, 30, 18, 93, 89, 58, 51, 96, 39, 74, 61, 21, 86, 61 };
        assertArrayEquals(new int[] { 47, 47, 34, 17, 17, 23, 23, 23, 83, 83, 82, 49, 49, 49, 13, 13, 17, 17, 17, 43, 43, 43, 75, 75, 74, 59, 58, 45, 32, 32, 42, 42, 41, 41, 41, 35, 34, 30, 30, 89, 89, 58, 58, 61, 61, 61, 61, 61, 61, 61 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case22() {
        int[] colonies = { 42, 61, 15, 91, 44, 13, 41, 63, 13, 57, 12, 37, 75, 10, 94, 100, 48, 40, 72, 65, 45, 39, 44, 29, 49, 81, 74, 11, 88, 20, 16, 33, 13, 3, 10, 76, 79, 87, 77, 14, 35, 40, 10, 36, 51, 18, 2, 93, 29, 17 };
        assertArrayEquals(new int[] { 42, 42, 42, 44, 44, 41, 41, 41, 35, 35, 35, 37, 42, 43, 94, 94, 48, 48, 65, 65, 45, 42, 41, 41, 49, 74, 74, 50, 49, 20, 20, 20, 13, 10, 10, 76, 79, 79, 77, 35, 35, 35, 35, 36, 36, 18, 18, 29, 29, 17 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case23() {
        int[] colonies = { 74, 90, 23, 83, 52, 85, 93, 80, 28, 47, 100, 58, 60, 72, 94, 26, 80, 18, 33, 6, 27, 95, 16, 61, 61, 50, 48, 84, 13, 13, 11, 59, 15, 6, 83, 39, 21, 96, 1, 5, 55, 5, 87, 15, 3, 75, 51, 17, 58, 76 };
        assertArrayEquals(new int[] { 74, 74, 67, 67, 68, 85, 85, 80, 47, 47, 60, 60, 60, 72, 72, 53, 53, 26, 25, 25, 27, 55, 56, 61, 61, 50, 50, 50, 13, 13, 13, 15, 15, 15, 39, 39, 39, 39, 5, 5, 30, 30, 30, 15, 15, 51, 51, 51, 58, 76 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case24() {
        int[] colonies = { 49, 6, 17, 21, 5, 8, 3, 35, 80, 86, 15, 21, 11, 9, 20, 100, 77, 25, 59, 23, 48, 84, 1, 78, 24, 67, 5, 62, 15, 76, 28, 19, 12, 84, 76, 96, 40, 82, 18, 58, 42, 3, 67, 100, 72, 27, 1, 90, 62, 88 };
        assertArrayEquals(new int[] { 49, 17, 17, 17, 7, 6, 6, 35, 80, 80, 18, 18, 11, 11, 20, 77, 77, 42, 42, 42, 48, 48, 46, 46, 46, 45, 38, 38, 39, 39, 28, 19, 19, 80, 80, 80, 61, 61, 42, 42, 42, 42, 67, 72, 72, 27, 27, 76, 76, 88 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case25() {
        int[] colonies = { 81, 49, 75, 93, 92, 5, 56, 94, 26, 44, 43, 55, 98, 58, 20, 70, 35, 85, 60, 1, 83, 60, 71, 10, 98, 55, 66, 53, 25, 40, 41, 75, 4, 84, 80, 57, 45, 95, 13, 4, 94, 57, 89, 54, 92, 6, 84, 97, 96, 8 };
        assertArrayEquals(new int[] { 81, 75, 75, 92, 92, 56, 56, 56, 43, 43, 44, 55, 58, 58, 52, 52, 53, 60, 60, 60, 66, 66, 65, 61, 61, 61, 60, 53, 40, 40, 41, 41, 41, 80, 80, 57, 57, 57, 13, 13, 73, 73, 73, 73, 73, 73, 84, 96, 96, 8 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case26() {
        int[] colonies = { 26, 30, 54, 20, 85, 85, 73, 17, 61, 15, 10, 87, 62, 100, 48, 92, 25, 50, 63, 99, 34, 38, 76, 26, 32, 89, 53, 90, 57, 26, 29, 76, 100, 53, 10, 27, 43, 67, 25, 75, 50, 17, 58, 75, 53, 74, 69, 30, 34, 29 };
        assertArrayEquals(new int[] { 26, 30, 37, 37, 85, 85, 73, 39, 39, 15, 15, 74, 75, 75, 70, 70, 50, 50, 63, 63, 38, 38, 38, 32, 32, 71, 71, 71, 57, 29, 29, 76, 76, 53, 27, 27, 43, 46, 46, 50, 50, 50, 58, 64, 64, 69, 69, 32, 32, 29 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case27() {
        int[] colonies = { 36, 42, 67, 38, 9, 35, 17, 24, 82, 71, 5, 83, 12, 58, 33, 99, 85, 76, 54, 64, 93, 72, 24, 15, 98, 87, 87, 41, 91, 46, 22, 99, 70, 24, 77, 78, 33, 23, 46, 39, 95, 57, 71, 97, 19, 78, 73, 50, 97, 36 };
        assertArrayEquals(new int[] { 36, 42, 42, 38, 24, 24, 24, 24, 71, 71, 45, 45, 45, 45, 46, 85, 85, 76, 64, 64, 72, 72, 24, 24, 87, 87, 87, 66, 66, 46, 46, 70, 70, 70, 77, 77, 33, 33, 42, 43, 71, 71, 71, 71, 71, 73, 73, 73, 73, 36 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case28() {
        int[] colonies = { 33, 48, 84, 45, 68, 81, 38, 84, 43, 45, 13, 43, 37, 14, 62, 84, 35, 60, 88, 23, 86, 98, 96, 91, 11, 29, 31, 19, 33, 100, 51, 50, 44, 91, 9, 54, 61, 35, 10, 29, 86, 94, 64, 82, 51, 12, 28, 67, 93, 58 };
        assertArrayEquals(new int[] { 33, 48, 64, 65, 68, 68, 61, 61, 44, 44, 37, 37, 37, 37, 62, 62, 60, 60, 60, 60, 86, 96, 96, 91, 29, 29, 29, 29, 33, 51, 51, 50, 50, 50, 50, 54, 54, 35, 29, 29, 86, 86, 73, 73, 51, 28, 28, 67, 67, 58 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case29() {
        int[] colonies = { 22, 22, 94, 10, 45, 61, 26, 34, 67, 21, 80, 59, 71, 35, 59, 29, 49, 82, 43, 82, 29, 31, 19, 96, 16, 82, 69, 43, 100, 96, 48, 6, 83, 33, 60, 37, 49, 25, 59, 35, 13, 49, 50, 57, 36, 83, 31, 66, 52, 70 };
        assertArrayEquals(new int[] { 22, 22, 45, 45, 45, 45, 34, 34, 44, 44, 65, 65, 65, 47, 47, 47, 49, 62, 62, 62, 30, 30, 30, 56, 56, 69, 69, 69, 96, 96, 48, 47, 47, 47, 46, 43, 43, 42, 42, 35, 35, 49, 50, 50, 50, 57, 57, 59, 59, 70 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case30() {
        int[] colonies = { 50, 36, 37, 70, 26, 24, 73, 88, 17, 77, 1, 64, 39, 42, 54, 92, 35, 88, 41, 52, 66, 58, 59, 91, 4, 68, 12, 57, 23, 3, 42, 49, 47, 67, 20, 65, 71, 16, 43, 63, 90, 65, 73, 7, 86, 65, 92, 58, 95, 88 };
        assertArrayEquals(new int[] { 50, 37, 37, 37, 26, 26, 73, 73, 47, 47, 42, 42, 42, 42, 54, 62, 62, 61, 52, 52, 59, 59, 59, 59, 36, 36, 35, 34, 23, 23, 42, 48, 48, 48, 48, 65, 65, 43, 43, 63, 69, 69, 69, 69, 75, 76, 76, 76, 88, 88 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case31() {
        int[] colonies = { 69, 17, 83, 58, 66, 58, 29, 50, 13, 98, 44, 74, 70, 76, 57, 89, 23, 44, 59, 45, 37, 100, 73, 70, 74, 68, 53, 11, 89, 84, 13, 43, 5, 65, 23, 19, 62, 55, 9, 10, 44, 85, 12, 44, 2, 62, 68, 36, 42, 13 };
        assertArrayEquals(new int[] { 69, 62, 62, 62, 62, 58, 40, 39, 39, 71, 71, 72, 72, 72, 72, 72, 44, 44, 45, 45, 45, 73, 73, 72, 72, 68, 53, 53, 84, 84, 28, 28, 28, 28, 23, 23, 55, 55, 10, 10, 44, 44, 28, 28, 28, 62, 62, 39, 39, 13 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case32() {
        int[] colonies = { 9, 80, 37, 47, 48, 42, 53, 63, 17, 76, 5, 9, 56, 11, 5, 23, 9, 97, 47, 5, 24, 4, 65, 71, 93, 82, 96, 44, 29, 54, 92, 45, 17, 23, 61, 75, 90, 44, 78, 49, 62, 60, 3, 65, 20, 31, 44, 53, 78, 76 };
        assertArrayEquals(new int[] { 9, 47, 47, 47, 47, 47, 53, 53, 47, 46, 9, 9, 11, 11, 11, 16, 16, 47, 47, 15, 14, 14, 65, 71, 87, 88, 88, 44, 44, 54, 54, 45, 23, 23, 61, 75, 75, 61, 61, 60, 60, 60, 34, 34, 31, 31, 44, 53, 76, 76 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case33() {
        int[] colonies = { 24, 61, 79, 36, 16, 51, 63, 14, 53, 18, 47, 73, 79, 59, 24, 44, 62, 12, 4, 56, 32, 58, 54, 27, 21, 78, 29, 54, 20, 23, 41, 72, 99, 30, 77, 62, 96, 26, 40, 6, 41, 67, 62, 72, 57, 8, 85, 73, 64, 16 };
        assertArrayEquals(new int[] { 24, 61, 61, 36, 36, 51, 51, 35, 35, 36, 47, 73, 73, 59, 44, 44, 44, 12, 12, 44, 44, 54, 54, 27, 27, 42, 42, 41, 23, 23, 41, 72, 72, 69, 69, 70, 70, 33, 33, 33, 41, 64, 65, 65, 57, 57, 73, 73, 64, 16 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case34() {
        int[] colonies = { 21, 6, 93, 61, 3, 37, 93, 26, 68, 86, 79, 15, 90, 5, 14, 45, 15, 50, 55, 4, 58, 21, 67, 31, 38, 11, 67, 63, 60, 48, 62, 24, 69, 6, 19, 71, 96, 54, 60, 45, 17, 78, 58, 10, 97, 55, 46, 94, 48, 52 };
        assertArrayEquals(new int[] { 21, 21, 61, 61, 37, 37, 59, 60, 68, 79, 79, 53, 52, 14, 14, 30, 30, 50, 50, 39, 39, 40, 40, 35, 34, 34, 63, 63, 60, 55, 55, 47, 46, 19, 19, 71, 71, 57, 57, 45, 45, 58, 58, 55, 55, 55, 55, 55, 52, 52 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case35() {
        int[] colonies = { 27, 36, 29, 82, 73, 48, 36, 65, 73, 58, 62, 95, 86, 43, 68, 12, 55, 7, 65, 38, 66, 64, 82, 98, 81, 3, 75, 2, 79, 56, 96, 68, 37, 10, 71, 55, 1, 35, 47, 64, 90, 41, 42, 16, 2, 95, 71, 36, 1, 30 };
        assertArrayEquals(new int[] { 27, 32, 33, 73, 73, 48, 48, 65, 65, 62, 62, 86, 86, 56, 55, 34, 33, 33, 51, 52, 65, 65, 82, 82, 81, 39, 39, 39, 67, 68, 68, 68, 37, 37, 55, 55, 35, 35, 47, 64, 64, 42, 41, 16, 16, 71, 71, 36, 30, 30 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case36() {
        int[] colonies = { 91, 82, 59, 3, 1, 62, 19, 91, 51, 62, 64, 4, 75, 50, 60, 92, 86, 95, 36, 11, 52, 79, 52, 97, 100, 70, 79, 28, 21, 3, 76, 8, 25, 76, 18, 1, 5, 70, 38, 17, 62, 80, 55, 29, 58, 95, 58, 51, 17, 94 };
        assertArrayEquals(new int[] { 91, 82, 59, 3, 3, 40, 41, 62, 62, 62, 62, 60, 60, 60, 60, 89, 89, 89, 36, 36, 52, 65, 66, 97, 97, 75, 74, 28, 21, 21, 25, 25, 25, 25, 18, 5, 5, 38, 38, 38, 62, 62, 55, 55, 58, 58, 58, 51, 51, 94 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case37() {
        int[] colonies = { 62, 78, 98, 34, 49, 90, 45, 89, 25, 51, 59, 15, 54, 80, 3, 45, 32, 94, 87, 2, 16, 27, 22, 66, 10, 84, 84, 17, 81, 2, 89, 76, 98, 64, 89, 70, 86, 51, 31, 97, 15, 60, 15, 97, 25, 98, 38, 14, 57, 72 };
        assertArrayEquals(new int[] { 62, 78, 78, 49, 49, 67, 67, 67, 51, 51, 51, 51, 54, 54, 38, 38, 39, 87, 87, 16, 16, 24, 25, 38, 38, 84, 84, 49, 49, 49, 82, 83, 83, 78, 78, 78, 78, 51, 51, 51, 38, 38, 38, 61, 61, 61, 38, 38, 57, 72 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case38() {
        int[] colonies = { 65, 22, 90, 77, 29, 98, 90, 44, 49, 45, 31, 95, 69, 97, 70, 22, 93, 5, 27, 57, 61, 90, 95, 42, 23, 54, 34, 15, 17, 69, 85, 48, 89, 42, 12, 28, 19, 50, 59, 78, 82, 28, 94, 90, 1, 77, 72, 28, 75, 44 };
        assertArrayEquals(new int[] { 65, 65, 77, 77, 77, 90, 90, 47, 46, 45, 45, 82, 82, 82, 70, 58, 57, 27, 27, 57, 61, 90, 90, 42, 39, 38, 34, 17, 17, 69, 69, 69, 68, 42, 23, 23, 24, 50, 59, 78, 78, 78, 90, 90, 72, 72, 72, 52, 51, 44 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case39() {
        int[] colonies = { 52, 55, 8, 24, 47, 42, 71, 4, 81, 99, 76, 100, 12, 29, 71, 91, 57, 16, 74, 100, 52, 6, 2, 25, 14, 88, 9, 4, 1, 17, 58, 7, 60, 38, 98, 59, 24, 63, 45, 17, 50, 49, 96, 58, 69, 41, 46, 79, 19, 52 };
        assertArrayEquals(new int[] { 52, 52, 24, 24, 44, 45, 45, 45, 81, 87, 88, 88, 29, 29, 71, 71, 57, 57, 74, 74, 52, 6, 6, 19, 20, 20, 9, 4, 4, 17, 32, 33, 49, 49, 59, 59, 45, 45, 45, 45, 49, 50, 64, 64, 63, 46, 46, 49, 49, 52 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case40() {
        int[] colonies = { 24, 19, 71, 43, 93, 11, 85, 97, 30, 66, 89, 78, 94, 63, 41, 34, 30, 83, 14, 62, 59, 12, 13, 14, 32, 94, 94, 40, 82, 32, 12, 53, 76, 14, 90, 61, 100, 48, 22, 32, 43, 11, 76, 94, 64, 26, 65, 82, 48, 21 };
        assertArrayEquals(new int[] { 24, 24, 57, 57, 57, 57, 85, 85, 66, 66, 83, 84, 84, 63, 41, 34, 34, 48, 49, 59, 59, 13, 13, 14, 32, 94, 94, 61, 61, 32, 32, 53, 53, 53, 75, 76, 76, 48, 32, 32, 32, 32, 76, 76, 64, 64, 65, 65, 48, 21 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case41() {
        int[] colonies = { 9, 58, 20, 20, 25, 10, 88, 30, 21, 67, 39, 24, 69, 10, 47, 91, 18, 22, 94, 43, 24, 13, 72, 60, 66, 2, 43, 98, 29, 58, 13, 23, 36, 24, 65, 59, 67, 96, 77, 13, 27, 26, 42, 81, 78, 56, 32, 21, 71, 11 };
        assertArrayEquals(new int[] { 9, 20, 20, 20, 20, 20, 30, 30, 30, 39, 39, 39, 39, 40, 47, 47, 22, 22, 43, 43, 24, 24, 63, 63, 63, 43, 43, 44, 44, 43, 23, 23, 30, 30, 62, 62, 67, 77, 77, 26, 26, 27, 42, 78, 78, 56, 32, 32, 32, 11 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case42() {
        int[] colonies = { 75, 19, 80, 74, 54, 59, 34, 1, 99, 25, 77, 84, 56, 46, 60, 92, 93, 60, 67, 40, 58, 27, 56, 4, 6, 41, 42, 94, 39, 4, 29, 7, 40, 50, 30, 81, 4, 25, 29, 8, 1, 41, 76, 17, 25, 43, 50, 49, 60, 3 };
        assertArrayEquals(new int[] { 75, 74, 74, 74, 57, 56, 34, 34, 62, 62, 77, 77, 56, 56, 60, 92, 92, 64, 63, 49, 49, 42, 41, 6, 6, 41, 42, 42, 39, 18, 18, 18, 40, 40, 40, 40, 25, 25, 25, 8, 8, 41, 41, 25, 25, 43, 49, 50, 50, 3 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case43() {
        int[] colonies = { 9, 15, 35, 52, 23, 54, 43, 26, 91, 41, 20, 44, 11, 8, 11, 23, 1, 46, 47, 39, 67, 3, 4, 57, 12, 60, 13, 96, 75, 44, 91, 52, 65, 37, 88, 68, 46, 79, 29, 7, 35, 49, 40, 9, 75, 38, 7, 10, 7, 22 };
        assertArrayEquals(new int[] { 9, 15, 35, 37, 38, 43, 43, 43, 43, 41, 32, 32, 11, 11, 11, 12, 12, 46, 46, 46, 46, 4, 4, 34, 35, 36, 37, 75, 75, 68, 67, 59, 58, 58, 68, 68, 63, 62, 29, 29, 35, 40, 40, 40, 40, 38, 9, 9, 9, 22 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case44() {
        int[] colonies = { 1, 3, 5, 10, 56, 79, 90, 100 };
        assertArrayEquals(new int[] { 1, 3, 5, 10, 56, 79, 90, 100 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case45() {
        int[] colonies = { 100, 98, 90, 67, 45, 30, 25, 20, 9, 8, 7, 6, 5, 4, 3, 2, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9, 10, 45, 56, 67, 77, 89, 90, 90, 99 };
        assertArrayEquals(new int[] { 100, 98, 90, 67, 45, 30, 25, 20, 9, 8, 7, 6, 5, 4, 3, 2, 2, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9, 10, 45, 56, 67, 77, 89, 90, 90, 99 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case46() {
        int[] colonies = { 3, 5, 4, 6 };
        assertArrayEquals(new int[] { 3, 4, 5, 6 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case47() {
        int[] colonies = { 5, 4, 5, 4 };
        assertArrayEquals(new int[] { 5, 5, 4, 4 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case48() {
        int[] colonies = { 1, 2, 1, 2 };
        assertArrayEquals(new int[] { 1, 1, 2, 2 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case49() {
        int[] colonies = { 5, 3, 4, 2 };
        assertArrayEquals(new int[] { 5, 4, 3, 2 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case50() {
        int[] colonies = { 3, 7, 4, 6 };
        assertArrayEquals(new int[] { 3, 5, 6, 6 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case51() {
        int[] colonies = { 1, 2, 1 };
        assertArrayEquals(new int[] { 1, 1, 1 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case52() {
        int[] colonies = { 3, 2, 3, 2 };
        assertArrayEquals(new int[] { 3, 3, 2, 2 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case53() {
        int[] colonies = { 1, 3, 2, 3 };
        assertArrayEquals(new int[] { 1, 2, 3, 3 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case54() {
        int[] colonies = { 60, 49, 50, 30 };
        assertArrayEquals(new int[] { 60, 50, 49, 30 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case55() {
        int[] colonies = { 100, 10, 11, 8 };
        assertArrayEquals(new int[] { 100, 11, 10, 8 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case56() {
        int[] colonies = { 3, 4, 3, 4 };
        assertArrayEquals(new int[] { 3, 3, 4, 4 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case57() {
        int[] colonies = { 3, 1, 2, 1 };
        assertArrayEquals(new int[] { 3, 2, 1, 1 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case58() {
        int[] colonies = { 3, 1, 3 };
        assertArrayEquals(new int[] { 3, 3, 3 }, bacteriescolony.performTheExperiment(colonies));
    }

    @Test
    public void case59() {
        int[] colonies = { 5, 1, 4, 3 };
        assertArrayEquals(new int[] { 5, 3, 3, 3 }, bacteriescolony.performTheExperiment(colonies));
    }

}
