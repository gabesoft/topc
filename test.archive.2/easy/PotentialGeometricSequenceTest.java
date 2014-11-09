package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class PotentialGeometricSequenceTest {
    PotentialGeometricSequence potentialgeometricsequence = new PotentialGeometricSequence();

    @Test
    public void case1() {
        int[] d = { 0, 1, 2 };
        assertEquals(6, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case2() {
        int[] d = { 1, 2, 4 };
        assertEquals(5, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case3() {
        int[] d = { 3, 2, 1, 0 };
        assertEquals(10, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case4() {
        int[] d = { 1, 2, 4, 8, 16 };
        assertEquals(9, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case5() {
        int[] d = { 1, 3, 5, 5, 5, 5, 64, 4, 23, 2, 3, 4, 5, 4, 3 };
        assertEquals(37, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case6() {
        int[] d = { 0, 50, 100, 50, 0 };
        assertEquals(11, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case7() {
        int[] d = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(1275, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case8() {
        int[] d = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
        assertEquals(1275, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case9() {
        int[] d = { 29, 21, 13, 5, 6, 7, 8, 12, 10 };
        assertEquals(23, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case10() {
        int[] d = { 100, 0, 50, 0, 0 };
        assertEquals(9, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case11() {
        int[] d = { 1, 2, 3, 4, 6, 8, 10 };
        assertEquals(19, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case12() {
        int[] d = { 60, 89, 100, 97, 93, 6, 20, 21, 75, 50, 25, 0, 26, 27, 28, 29, 30, 85, 62, 39, 16, 35, 53, 25, 38, 39, 40, 20, 92, 92, 44, 15, 35, 72, 60, 75, 90 };
        assertEquals(87, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case13() {
        int[] d = { 60, 80, 100, 89, 5, 11, 55, 36, 2, 68, 77, 53, 83, 5, 40, 75, 22, 37, 75, 55, 64, 73, 82, 69, 78, 87, 60 };
        assertEquals(59, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case14() {
        int[] d = { 50, 50, 50, 50, 50, 50, 50, 50, 73, 45, 17, 82, 76, 78, 80, 82, 84, 86, 88, 74, 92, 94, 96, 98, 13, 57, 31, 5, 63, 70, 77, 84, 91, 98, 23, 10, 23, 36, 49, 62, 75, 88, 80, 78, 76, 74, 72, 13 };
        assertEquals(167, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case15() {
        int[] d = { 75, 78, 96, 22, 66, 2, 36, 72, 40, 49, 58, 67, 76, 85, 94, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73 };
        assertEquals(396, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case16() {
        int[] d = { 22, 61, 100 };
        assertEquals(6, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case17() {
        int[] d = { 32, 26, 20, 14, 99, 8, 4, 0, 35, 20, 83, 80, 76, 72 };
        assertEquals(32, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case18() {
        int[] d = { 25, 22, 19, 16, 98, 10, 7, 4, 5, 22, 39, 56, 73, 90, 72, 48, 24, 39, 32, 25, 18, 11, 4, 56, 41, 26, 76, 76, 41, 16, 29, 76, 35, 79, 98, 77, 76, 75, 74, 73, 72, 71, 70, 69, 68, 67 };
        assertEquals(162, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case19() {
        int[] d = { 22, 48, 22, 73, 23, 87, 93, 99, 82, 82, 82, 82, 82, 56, 52, 27, 2 };
        assertEquals(41, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case20() {
        int[] d = { 40, 57, 55, 2, 84, 78, 51, 49, 47, 46, 41, 36, 31, 26, 21, 16, 11, 6, 1, 10, 80, 26, 23, 91, 62, 39, 16, 92, 53, 14, 90, 2, 13, 24, 35, 46, 30, 20, 1, 81, 43, 5, 98, 93, 21, 26, 31, 36 };
        assertEquals(144, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case21() {
        int[] d = { 99, 89, 39, 14, 9, 14, 56, 59 };
        assertEquals(15, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case22() {
        int[] d = { 43, 74, 74, 73, 89, 60, 22, 69, 43, 47, 51, 55, 25, 20, 15, 10, 5, 0, 32, 39, 46, 50, 47, 44, 41, 38, 35, 32, 29, 26, 23, 20, 17, 14, 11, 8, 5, 2, 64, 60, 56, 52, 48, 44, 9, 16, 23, 30, 37, 44 };
        assertEquals(253, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case23() {
        int[] d = { 24, 19, 14, 9, 17, 35, 36, 30, 23, 16, 9, 2, 42, 43, 44, 45, 46, 47, 48, 51, 6, 37, 30, 23, 16, 9, 2, 7, 32, 51, 55, 44, 91, 67, 46, 83, 29, 36, 20, 15, 10, 5, 0, 65 };
        assertEquals(127, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case24() {
        int[] d = { 100, 85, 70, 55, 40, 19, 91, 95, 99, 100, 98, 37, 1, 29, 66 };
        assertEquals(36, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case25() {
        int[] d = { 70, 73, 34, 16, 58, 97, 96, 93, 25, 31, 7, 8, 68, 73, 68, 72, 72, 67, 62, 57 };
        assertEquals(42, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case26() {
        int[] d = { 83, 79, 75, 71, 67, 14, 91, 50, 9, 41, 37, 1, 29, 55, 54, 74 };
        assertEquals(38, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case27() {
        int[] d = { 71, 53, 17, 59, 58, 2, 31, 60, 89, 54, 41, 97, 8, 8, 4, 90, 31 };
        assertEquals(36, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case28() {
        int[] d = { 19, 100, 98, 2, 94, 92, 90, 88, 86, 5, 30, 32, 77, 36, 38, 40, 42, 44, 46, 48, 12, 16, 20 };
        assertEquals(67, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case29() {
        int[] d = { 55, 98, 31, 26, 19, 19, 19, 19, 19, 19, 19, 19, 19, 38 };
        assertEquals(55, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case30() {
        int[] d = { 35, 12, 43, 55, 67, 19 };
        assertEquals(12, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case31() {
        int[] d = { 7, 66, 65, 64, 21, 69, 43, 8, 30, 77, 69, 69, 18, 69, 69, 37, 67, 97, 42, 43, 11, 6, 1, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 45, 44, 43, 42, 11, 3, 39, 38, 37 };
        assertEquals(191, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case32() {
        int[] d = { 49, 1, 53, 54, 55, 90, 88, 86, 84, 100, 93, 72, 79, 86, 93, 80, 75, 89, 21, 62, 60, 58, 56, 54, 52, 50, 48, 46, 98, 100, 40, 38, 37, 46, 96, 76, 56, 36, 16, 45, 38, 31, 24, 17, 10, 43, 76, 96, 36, 39 };
        assertEquals(151, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case33() {
        int[] d = { 5, 96, 40, 42, 44, 46, 82, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 100, 67, 64, 61, 58, 55, 52, 49, 46, 43, 22, 37, 34, 31, 28, 25, 22, 19 };
        assertEquals(445, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case34() {
        int[] d = { 55, 22, 19, 4, 17, 16, 15, 44, 46, 38, 9, 10, 70, 30, 74, 90, 5, 4, 3, 2, 37, 65, 100, 55, 64, 99, 8, 44, 80, 37, 72, 85, 52, 88, 52, 32, 25, 18, 11, 4, 49, 2, 17, 19, 21, 23, 25, 27, 29, 31 };
        assertEquals(131, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case35() {
        int[] d = { 59, 37, 75, 72, 69, 66, 63, 60, 57, 54, 51, 88, 57, 59, 61, 79, 74, 69, 64, 59, 54, 49, 44, 19, 3, 65, 72, 19, 14, 9, 4, 95, 97, 99, 76, 49, 45, 67, 75, 83, 91, 68, 96, 94, 96, 92, 98, 95, 92, 89 };
        assertEquals(159, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case36() {
        int[] d = { 29, 26, 23, 20, 17, 14, 11, 6, 7, 8, 9, 10, 4, 12, 13, 14, 15, 76, 1, 96, 64, 64, 64, 64, 93, 64, 1, 1, 20, 14, 65, 51, 79, 1, 12, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 39, 75, 1 };
        assertEquals(181, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case37() {
        int[] d = { 6, 6 };
        assertEquals(3, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case38() {
        int[] d = { 1, 2, 4 };
        assertEquals(5, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case39() {
        int[] d = { 64, 84, 100 };
        assertEquals(5, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case40() {
        int[] d = { 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5, 4, 3 };
        assertEquals(55, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case41() {
        int[] d = { 69, 83, 35, 3, 36, 42, 48, 61, 98, 60, 76, 89, 22, 23, 74, 95, 77, 12, 83, 94, 82, 45, 59, 29, 37, 97, 71, 66, 72, 12, 24, 37, 94, 28, 5, 64, 68, 35, 69, 39, 40, 1, 28, 89, 16, 19, 60, 98, 83, 17 };
        assertEquals(100, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case42() {
        int[] d = { 6 };
        assertEquals(1, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case43() {
        int[] d = { 1 };
        assertEquals(1, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case44() {
        int[] d = { 1, 1 };
        assertEquals(3, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case45() {
        int[] d = { 1, 0 };
        assertEquals(3, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case46() {
        int[] d = { 0, 100, 5, 100, 12, 99, 98, 100, 32, 9, 4, 100, 78, 43, 100, 0, 1, 100, 50 };
        assertEquals(37, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case47() {
        int[] d = { 1, 2, 2, 3 };
        assertEquals(7, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case48() {
        int[] d = { 0, 2, 1 };
        assertEquals(5, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case49() {
        int[] d = { 80, 81, 83 };
        assertEquals(5, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case50() {
        int[] d = { 0, 0, 0, 4, 4, 3, 2, 1, 2, 4, 8, 12, 8, 12, 24, 0, 0, 0, 0 };
        assertEquals(45, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case51() {
        int[] d = { 60, 20, 60, 10, 20, 30, 40, 50, 60 };
        assertEquals(27, potentialgeometricsequence.numberOfSubsequences(d));
    }

    @Test
    public void case52() {
        int[] d = { 1, 1, 1, 1, 2, 1, 1, 1, 1 };
        assertEquals(23, potentialgeometricsequence.numberOfSubsequences(d));
    }

}
