package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class SumOfPowerTest {
    SumOfPower sumofpower = new SumOfPower();

    @Test
    public void case1() {
        int[] array = { 1, 2 };
        assertEquals(6, sumofpower.findSum(array));
    }

    @Test
    public void case2() {
        int[] array = { 1, 1, 1 };
        assertEquals(10, sumofpower.findSum(array));
    }

    @Test
    public void case3() {
        int[] array = { 3, 14, 15, 92, 65 };
        assertEquals(1323, sumofpower.findSum(array));
    }

    @Test
    public void case4() {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        assertEquals(1210, sumofpower.findSum(array));
    }

    @Test
    public void case5() {
        int[] array = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
        assertEquals(714000, sumofpower.findSum(array));
    }

    @Test
    public void case6() {
        int[] array = { 95, 28, 18, 47, 39, 29, 10, 30, 8, 17, 83, 2, 60 };
        assertEquals(14065, sumofpower.findSum(array));
    }

    @Test
    public void case7() {
        int[] array = { 10, 2, 3, 5 };
        assertEquals(90, sumofpower.findSum(array));
    }

    @Test
    public void case8() {
        int[] array = { 19, 46, 97, 7, 19, 60, 77, 100, 14, 1, 69, 80, 38, 76, 27, 33, 37, 45, 78 };
        assertEquals(65449, sumofpower.findSum(array));
    }

    @Test
    public void case9() {
        int[] array = { 5, 44, 51, 97, 53, 78, 26, 59, 89, 4, 17, 13, 39, 89, 31, 68, 5, 7, 72, 76, 34, 71, 61, 23, 31, 55, 93, 24, 45 };
        assertEquals(208696, sumofpower.findSum(array));
    }

    @Test
    public void case10() {
        int[] array = { 51, 57, 11, 18, 77, 23, 62, 28, 42, 61, 20, 58, 41, 10, 6, 54, 94, 17, 19, 61, 81, 7, 33, 58, 75, 27, 44, 71, 6, 90, 36, 47, 15, 50, 76, 75, 52, 77, 44, 15 };
        assertEquals(510216, sumofpower.findSum(array));
    }

    @Test
    public void case11() {
        int[] array = { 94, 9, 70, 43, 79, 2, 29, 79, 55, 5, 14, 47, 15, 70, 18, 14, 81, 3, 67, 54, 93, 3, 92, 71, 8, 30, 40, 69, 2, 67, 18, 9, 3, 6, 17, 82, 80 };
        assertEquals(370939, sumofpower.findSum(array));
    }

    @Test
    public void case12() {
        int[] array = { 32, 61, 94, 75, 39, 96, 36, 52 };
        assertEquals(7730, sumofpower.findSum(array));
    }

    @Test
    public void case13() {
        int[] array = { 85, 92, 80, 39, 84, 49, 20, 60, 79, 27, 68, 78, 27, 74, 12, 100, 68, 41, 3, 24, 60, 24, 95, 15, 51, 31, 11, 68, 100, 17, 81, 59, 69, 20, 91, 72, 70, 87, 99, 12, 28, 6, 65, 87, 19, 20 };
        assertEquals(906220, sumofpower.findSum(array));
    }

    @Test
    public void case14() {
        int[] array = { 80, 87, 15, 53, 3, 99, 54, 13, 83, 88, 50, 91, 96, 66, 50, 31, 24, 7, 36, 36, 100, 11, 36 };
        assertEquals(124909, sumofpower.findSum(array));
    }

    @Test
    public void case15() {
        int[] array = { 61, 34, 71, 13, 16, 21, 62, 4, 23, 19, 54, 12, 30, 52, 37, 67, 48, 49, 51, 36, 8, 52, 27, 56, 18, 24, 4, 47, 90, 48, 33, 11, 35, 64, 8, 81, 100 };
        assertEquals(341948, sumofpower.findSum(array));
    }

    @Test
    public void case16() {
        int[] array = { 81, 12, 61, 67, 10, 10, 39, 37, 91, 99, 2, 78, 99, 83 };
        assertEquals(28382, sumofpower.findSum(array));
    }

    @Test
    public void case17() {
        int[] array = { 98, 18, 12, 33, 62, 89, 72, 50, 11, 64, 39, 67, 83, 29, 1, 30 };
        assertEquals(40472, sumofpower.findSum(array));
    }

    @Test
    public void case18() {
        int[] array = { 11, 21, 34, 33, 71, 40, 46, 87, 33, 42, 20, 53, 100, 89, 17, 97, 76, 11, 77, 53, 92, 80, 65, 85, 21, 12, 4, 28, 61, 83, 42, 22, 58, 74, 63, 1, 13, 79, 96, 39, 51, 90, 82, 67, 5, 49, 41 };
        assertEquals(983197, sumofpower.findSum(array));
    }

    @Test
    public void case19() {
        int[] array = { 68, 1, 56, 9, 5, 92, 57, 10, 88, 91, 47, 2, 62, 48, 34, 50, 39, 96, 41, 39, 65, 30, 34, 39, 7, 98, 24, 42, 38, 54, 33, 28, 30, 63, 80, 37, 95, 34, 68, 95 };
        assertEquals(537806, sumofpower.findSum(array));
    }

    @Test
    public void case20() {
        int[] array = { 53, 12, 1, 57, 95, 4, 88, 51, 10, 52, 27, 9, 89, 1, 71, 54, 98, 15, 60, 43, 54, 29, 16, 43, 44, 94, 80, 12, 23 };
        assertEquals(204865, sumofpower.findSum(array));
    }

    @Test
    public void case21() {
        int[] array = { 66, 59, 22, 18, 60, 5, 81, 21, 64, 65, 74, 17, 16, 99, 43, 59, 20, 90, 49, 53, 27, 64, 68, 48, 69, 45, 6, 34, 88, 24, 66, 99, 35, 24, 33 };
        assertEquals(389417, sumofpower.findSum(array));
    }

    @Test
    public void case22() {
        int[] array = { 26 };
        assertEquals(26, sumofpower.findSum(array));
    }

    @Test
    public void case23() {
        int[] array = { 40, 8, 99, 39, 49, 59, 100, 3, 80, 34, 48, 28, 5, 96, 55, 46, 3, 1, 55, 52, 6, 12, 3, 70, 96, 18, 93, 74, 12, 52, 55, 14, 13, 66, 10, 64, 87, 1, 25, 78, 38, 93, 8 };
        assertEquals(605220, sumofpower.findSum(array));
    }

    @Test
    public void case24() {
        int[] array = { 15, 5, 74, 61, 2, 11, 98, 20, 96, 15, 81, 48, 23, 94, 34, 26, 85, 73, 36, 82, 17, 8, 37, 30, 47, 82, 16, 64, 73, 35, 67, 62, 43, 25, 69, 60, 23, 75, 14, 23, 52, 44, 30, 20, 21, 16, 94, 33 };
        assertEquals(923394, sumofpower.findSum(array));
    }

    @Test
    public void case25() {
        int[] array = { 76, 38, 22, 23, 29, 90 };
        assertEquals(2206, sumofpower.findSum(array));
    }

    @Test
    public void case26() {
        int[] array = { 35, 2, 32, 3, 49, 19, 74, 81, 10 };
        assertEquals(5712, sumofpower.findSum(array));
    }

    @Test
    public void case27() {
        int[] array = { 37, 51, 34, 33, 77, 53, 24, 67, 78, 44, 24, 23, 23, 44, 47, 84, 83, 90, 77, 95, 30, 18, 66, 90, 43, 87, 58, 6, 32, 66, 72, 14, 74, 97, 39, 79, 8, 57, 18, 99, 67, 36 };
        assertEquals(729050, sumofpower.findSum(array));
    }

    @Test
    public void case28() {
        int[] array = { 67, 83, 90, 20, 77, 44, 91, 31, 60, 63, 71, 61, 1, 39, 25, 61, 33, 12, 91, 11, 6, 84, 49, 29, 87, 84, 87, 94, 10, 63, 50, 32, 95 };
        assertEquals(332374, sumofpower.findSum(array));
    }

    @Test
    public void case29() {
        int[] array = { 93, 47, 52, 65, 6, 7, 2, 72, 35, 53, 29, 51, 40, 62, 13, 82, 14, 59, 83, 16, 90, 52, 60, 80, 81, 97, 57, 3, 85, 37, 62 };
        assertEquals(272902, sumofpower.findSum(array));
    }

    @Test
    public void case30() {
        int[] array = { 6, 61, 9, 13, 66, 81, 98, 68, 79, 33, 56 };
        assertEquals(16186, sumofpower.findSum(array));
    }

    @Test
    public void case31() {
        int[] array = { 93, 92, 50, 65, 21, 43, 2 };
        assertEquals(4390, sumofpower.findSum(array));
    }

    @Test
    public void case32() {
        int[] array = { 18, 19, 15, 33, 70, 5, 39, 61, 21, 37, 63, 66 };
        assertEquals(13404, sumofpower.findSum(array));
    }

    @Test
    public void case33() {
        int[] array = { 75, 63, 51, 36, 100, 3, 59, 1, 13, 19, 36, 22, 35, 93, 21, 6, 55, 73, 49, 44, 20, 80, 28, 2, 11, 79, 37, 73, 54, 91, 38, 3, 61, 86, 30 };
        assertEquals(323459, sumofpower.findSum(array));
    }

    @Test
    public void case34() {
        int[] array = { 13, 77, 59, 68, 18, 4, 12, 16, 67, 2, 53, 63, 52, 17, 36 };
        assertEquals(24250, sumofpower.findSum(array));
    }

    @Test
    public void case35() {
        int[] array = { 80, 29, 12, 4, 23, 30, 74, 78, 34, 25 };
        assertEquals(8118, sumofpower.findSum(array));
    }

    @Test
    public void case36() {
        int[] array = { 9, 65, 66, 17, 49, 39, 18, 10, 83, 97, 63, 48, 10, 25, 51, 43, 15, 73 };
        assertEquals(50678, sumofpower.findSum(array));
    }

    @Test
    public void case37() {
        int[] array = { 62, 87, 31, 26, 33, 57, 93, 7, 3, 100, 29, 37, 61, 16, 32, 96, 41, 50, 48 };
        assertEquals(60915, sumofpower.findSum(array));
    }

    @Test
    public void case38() {
        int[] array = { 31, 82, 65, 63, 13, 6, 100, 46, 3, 60, 87, 20, 100, 63, 11, 13 };
        assertEquals(40192, sumofpower.findSum(array));
    }

    @Test
    public void case39() {
        int[] array = { 2, 66 };
        assertEquals(136, sumofpower.findSum(array));
    }

    @Test
    public void case40() {
        int[] array = { 4, 65, 98, 27, 86, 36, 73, 86, 66, 29, 75, 17, 98, 44, 69, 48, 24, 18, 56, 71, 64 };
        assertEquals(99553, sumofpower.findSum(array));
    }

    @Test
    public void case41() {
        int[] array = { 66, 56, 4, 30, 87, 7, 86, 69, 64, 67, 3, 16, 44, 85, 48, 49, 42, 98, 88, 39, 59, 91 };
        assertEquals(106352, sumofpower.findSum(array));
    }

    @Test
    public void case42() {
        int[] array = { 39, 78, 37, 43, 40, 70, 63, 77, 62, 77, 98, 20, 70, 8, 30, 13, 36, 79, 19, 85, 99, 64 };
        assertEquals(108112, sumofpower.findSum(array));
    }

    @Test
    public void case43() {
        int[] array = { 72, 18, 52, 16, 61, 29, 2, 21, 81, 95, 94, 45, 12, 47, 5, 9, 48, 78, 8, 31, 18, 13, 76, 63, 19, 1, 9, 73, 34, 71, 32, 24, 10, 23, 1 };
        assertEquals(294586, sumofpower.findSum(array));
    }

    @Test
    public void case44() {
        int[] array = { 38, 5, 56, 94, 56, 86, 97, 20, 3, 8, 98, 66, 97 };
        assertEquals(25117, sumofpower.findSum(array));
    }

    @Test
    public void case45() {
        int[] array = { 8, 70, 56, 16, 47, 21, 5, 94, 8, 96, 7, 28, 5, 5, 18, 21, 34, 32, 52, 24, 37, 8, 23, 53, 7, 17, 100, 39, 83, 8, 36, 36, 66, 93, 64, 62, 56, 62, 30 };
        assertEquals(388130, sumofpower.findSum(array));
    }

    @Test
    public void case46() {
        int[] array = { 61, 29, 15 };
        assertEquals(344, sumofpower.findSum(array));
    }

    @Test
    public void case47() {
        int[] array = { 52, 48, 42, 34, 31, 94, 7, 3, 59, 84, 49, 46, 75, 94, 100, 67, 29, 98, 78, 24, 2, 81, 51, 90, 62, 10, 21, 34, 88, 97, 48, 76, 11, 46, 46 };
        assertEquals(436057, sumofpower.findSum(array));
    }

    @Test
    public void case48() {
        int[] array = { 7, 87, 4, 63, 98, 13, 32, 90, 98, 22, 45, 30, 12, 89, 71, 25, 86, 3, 47, 41, 28, 10, 13, 78, 71, 34, 12, 22, 69, 63 };
        assertEquals(225184, sumofpower.findSum(array));
    }

    @Test
    public void case49() {
        int[] array = { 5, 52, 95, 88, 90, 77, 16, 58, 78, 59, 38, 73, 95, 5, 40, 51, 86, 93, 9, 58, 43, 18, 7, 12, 32 };
        assertEquals(160318, sumofpower.findSum(array));
    }

    @Test
    public void case50() {
        int[] array = { 45, 99, 4, 66, 65 };
        assertEquals(1906, sumofpower.findSum(array));
    }

    @Test
    public void case51() {
        int[] array = { 50, 89 };
        assertEquals(278, sumofpower.findSum(array));
    }

    @Test
    public void case52() {
        int[] array = { 1, 1, 1 };
        assertEquals(10, sumofpower.findSum(array));
    }

    @Test
    public void case53() {
        int[] array = { 1, 2 };
        assertEquals(6, sumofpower.findSum(array));
    }

    @Test
    public void case54() {
        int[] array = { 1 };
        assertEquals(1, sumofpower.findSum(array));
    }

    @Test
    public void case55() {
        int[] array = { 3, 14, 15, 92, 65 };
        assertEquals(1323, sumofpower.findSum(array));
    }

    @Test
    public void case56() {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        assertEquals(1210, sumofpower.findSum(array));
    }

    @Test
    public void case57() {
        int[] array = { 3, 14, 100, 92, 1, 99, 1 };
        assertEquals(4371, sumofpower.findSum(array));
    }

    @Test
    public void case58() {
        int[] array = { 5 };
        assertEquals(5, sumofpower.findSum(array));
    }

    @Test
    public void case59() {
        int[] array = { 100 };
        assertEquals(100, sumofpower.findSum(array));
    }

    @Test
    public void case60() {
        int[] array = { 1, 1, 1, 1, 1, 100, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 11 };
        assertEquals(10650, sumofpower.findSum(array));
    }

    @Test
    public void case61() {
        int[] array = { 1, 2, 3, 4, 5 };
        assertEquals(105, sumofpower.findSum(array));
    }

}
