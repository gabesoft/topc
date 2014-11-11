package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class PillarsDivTwoTest {
    double DELTA = 1.0e-09;
    PillarsDivTwo pillarsdivtwo = new PillarsDivTwo();

    @Test
    public void case1() {
        int[] height = { 3, 3, 3 };
        int w = 2;
        assertEquals(5.656854249492381, pillarsdivtwo.maximalLength(height, w), DELTA * 5.656854249492381);
    }

    @Test
    public void case2() {
        int[] height = { 1, 1, 1, 1 };
        int w = 100;
        assertEquals(300.0, pillarsdivtwo.maximalLength(height, w), DELTA * 300.0);
    }

    @Test
    public void case3() {
        int[] height = { 100, 2, 100, 2, 100 };
        int w = 4;
        assertEquals(396.32310051270036, pillarsdivtwo.maximalLength(height, w), DELTA * 396.32310051270036);
    }

    @Test
    public void case4() {
        int[] height = { 2, 1, 1, 2 };
        int w = 1;
        assertEquals(3.82842712474619, pillarsdivtwo.maximalLength(height, w), DELTA * 3.82842712474619);
    }

    @Test
    public void case5() {
        int[] height = { 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int w = 20;
        assertEquals(221.02070848731498, pillarsdivtwo.maximalLength(height, w), DELTA * 221.02070848731498);
    }

    @Test
    public void case6() {
        int[] height = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
        int w = 100;
        assertEquals(6895.085278660454, pillarsdivtwo.maximalLength(height, w), DELTA * 6895.085278660454);
    }

    @Test
    public void case7() {
        int[] height = { 100, 1, 100 };
        int w = 97;
        assertEquals(277.2002886001384, pillarsdivtwo.maximalLength(height, w), DELTA * 277.2002886001384);
    }

    @Test
    public void case8() {
        int[] height = { 1, 100, 4 };
        int w = 93;
        assertEquals(271.6615541441225, pillarsdivtwo.maximalLength(height, w), DELTA * 271.6615541441225);
    }

    @Test
    public void case9() {
        int[] height = { 42, 68, 35, 1, 70, 25, 79, 59, 63, 65, 6, 46, 82, 28, 62, 92, 96, 43, 28, 37, 92, 5, 3, 54, 93, 83, 22, 17, 19, 96, 48, 27, 72, 39, 70, 13, 68, 100, 36, 95, 4, 12, 23, 34, 74, 65, 42, 12, 54, 69 };
        int w = 97;
        assertEquals(5697.585698318906, pillarsdivtwo.maximalLength(height, w), DELTA * 5697.585698318906);
    }

    @Test
    public void case10() {
        int[] height = { 92, 98, 43, 46, 30, 10, 72, 1, 25, 43, 19, 44, 14, 38, 43, 94, 70, 25, 86, 59, 99, 51, 4, 68, 100, 4, 57, 92, 12, 95, 43, 61, 92, 5, 94, 15, 4, 13, 78, 42, 31, 100, 59, 74, 64, 17, 51, 20, 36, 9 };
        int w = 23;
        assertEquals(3227.74775802847, pillarsdivtwo.maximalLength(height, w), DELTA * 3227.74775802847);
    }

    @Test
    public void case11() {
        int[] height = { 61, 39, 43, 56, 60, 68, 98, 64, 20, 5, 13, 69, 78, 63, 27, 46, 91, 38, 63, 57, 49, 71, 35, 2, 51, 62, 84, 1, 88, 98, 94, 81, 31, 18, 78, 71, 6, 74, 33, 1, 83, 39, 19, 15, 80, 74, 36, 39, 14, 28 };
        int w = 49;
        assertEquals(3762.30612268847, pillarsdivtwo.maximalLength(height, w), DELTA * 3762.30612268847);
    }

    @Test
    public void case12() {
        int[] height = { 42, 68, 35, 1, 70, 25, 79, 59, 63, 65, 6, 46, 82, 28, 62, 92, 96, 43, 28, 37, 92, 5, 3, 54, 93, 83, 22, 17, 19, 96, 48, 27, 72, 39, 70, 13, 68, 100, 36, 95, 4, 12, 23, 34, 74, 65, 42, 12, 54, 69 };
        int w = 48;
        assertEquals(3851.8189701668684, pillarsdivtwo.maximalLength(height, w), DELTA * 3851.8189701668684);
    }

    @Test
    public void case13() {
        int[] height = { 45, 63, 58, 38, 60, 24, 42, 30, 79, 17, 36, 91, 43, 89, 7, 41, 43, 65, 49, 47, 6, 91, 30, 71, 51, 7, 2, 94, 49, 30, 24, 85, 55, 57, 41, 67, 77, 32, 9, 45, 40, 27, 24, 38, 39, 19, 83, 30, 42, 34 };
        int w = 16;
        assertEquals(2844.926773074714, pillarsdivtwo.maximalLength(height, w), DELTA * 2844.926773074714);
    }

    @Test
    public void case14() {
        int[] height = { 40, 59, 5, 31, 78, 7, 74, 87, 22, 46, 25, 73, 71, 30, 78, 74, 98, 13, 87, 91, 62, 37, 56, 68, 56, 75, 32, 53, 51, 51, 42, 25, 67, 31, 8, 92, 8, 38, 58, 88, 54, 84, 46, 10, 10, 59, 22, 89, 23, 47 };
        int w = 7;
        assertEquals(2950.092492769286, pillarsdivtwo.maximalLength(height, w), DELTA * 2950.092492769286);
    }

    @Test
    public void case15() {
        int[] height = { 31, 14, 69, 1, 92, 63, 56, 11, 60, 25, 38, 49, 84, 96, 42, 3, 51, 92, 37, 75, 21, 97, 22, 49, 100, 69, 85, 82, 35, 54, 100, 19, 39, 1, 89, 28, 68, 29, 94, 49, 84, 8, 22, 11, 18, 14, 15, 10, 17, 36 };
        int w = 52;
        assertEquals(4049.5657504383657, pillarsdivtwo.maximalLength(height, w), DELTA * 4049.5657504383657);
    }

    @Test
    public void case16() {
        int[] height = { 1, 50, 20, 57, 99, 4, 25, 9, 45, 10, 90, 3, 96, 86, 94, 44, 24, 88, 15, 4, 49, 1, 59, 19, 81, 97, 99, 82, 90, 99, 10, 58, 73, 23, 39, 93, 39, 80, 91, 58, 59, 92, 16, 89, 57, 12, 3, 35, 73, 56 };
        int w = 29;
        assertEquals(3524.900000318473, pillarsdivtwo.maximalLength(height, w), DELTA * 3524.900000318473);
    }

    @Test
    public void case17() {
        int[] height = { 47, 63, 87, 76, 34, 70, 43, 45, 17, 82, 99, 23, 52, 22, 100, 58, 77, 93, 90, 76, 13, 1, 11, 4, 70, 62, 89, 2, 90, 56, 24, 3, 86, 83, 86, 89, 27, 18, 58, 33, 33, 70, 55, 22, 90, 77, 30, 69, 93, 26 };
        int w = 56;
        assertEquals(4213.296072802553, pillarsdivtwo.maximalLength(height, w), DELTA * 4213.296072802553);
    }

    @Test
    public void case18() {
        int[] height = { 35, 50, 42, 13, 46, 61, 19, 54, 40, 24, 80, 97, 88, 30, 50, 38, 67, 50, 94, 96, 98, 17, 87, 6, 89, 83, 56, 35, 15, 2, 17, 72, 87, 64, 14, 56, 86, 54, 13, 9, 33, 46, 14, 57, 22, 59, 47, 83, 82, 45 };
        int w = 97;
        assertEquals(5645.772838902263, pillarsdivtwo.maximalLength(height, w), DELTA * 5645.772838902263);
    }

    @Test
    public void case19() {
        int[] height = { 23, 30, 62, 36, 51, 74, 67, 45, 60, 93, 40, 54, 25, 55, 11, 46, 50, 87, 14, 75, 23, 69, 19, 88, 6, 59, 92, 3, 26, 78, 15, 15, 25, 35, 75, 73, 60, 34, 71, 88, 98, 19, 78, 74, 71, 64, 69, 93, 86, 3 };
        int w = 81;
        assertEquals(5143.7240088784765, pillarsdivtwo.maximalLength(height, w), DELTA * 5143.7240088784765);
    }

    @Test
    public void case20() {
        int[] height = { 14, 28, 3, 100, 28, 26, 44, 25, 24, 73, 62, 82, 4, 33, 6, 94, 26, 32, 93, 43, 23, 87, 65, 1, 88, 61, 14, 75, 71, 71, 36, 34, 12, 61, 97, 68, 86, 51, 41, 95, 96, 25, 20, 26, 77, 95, 59, 3, 72, 67 };
        int w = 79;
        assertEquals(5012.8427487849, pillarsdivtwo.maximalLength(height, w), DELTA * 5012.8427487849);
    }

    @Test
    public void case21() {
        int[] height = { 94, 52, 85, 19, 65, 20, 53, 1, 88, 61, 27, 11, 58, 71, 16, 77, 28, 44, 59, 65, 10, 83, 87, 66, 88, 78, 75, 26, 28, 30, 29, 24, 21, 3, 63, 24, 97, 38, 62, 96, 26, 65, 61, 3, 17, 31, 27, 12, 72, 12 };
        int w = 48;
        assertEquals(3761.538515581392, pillarsdivtwo.maximalLength(height, w), DELTA * 3761.538515581392);
    }

    @Test
    public void case22() {
        int[] height = { 54, 21, 91, 25, 89, 64, 41, 52, 63, 30, 1, 14, 59, 79, 66, 8, 78, 1, 59, 40, 4, 61, 58, 25, 78, 9, 14, 88, 2, 51, 61, 29, 94, 85, 6, 41, 12, 5, 36, 57, 73, 51, 24, 86, 57, 17, 27, 58, 27, 58 };
        int w = 38;
        assertEquals(3347.0754719268034, pillarsdivtwo.maximalLength(height, w), DELTA * 3347.0754719268034);
    }

    @Test
    public void case23() {
        int[] height = { 72, 70, 62, 97, 23, 18, 13, 18, 97, 86, 42, 24, 30, 30, 66, 60, 33, 97, 56, 54, 63, 85, 35, 55, 73, 58, 70, 33, 64, 8, 84, 12, 36, 68, 49, 76, 39, 24, 43, 55, 12, 42, 76, 60, 26, 22, 71, 27, 35, 6 };
        int w = 84;
        assertEquals(5086.827402571348, pillarsdivtwo.maximalLength(height, w), DELTA * 5086.827402571348);
    }

    @Test
    public void case24() {
        int[] height = { 51, 99, 80, 2, 94, 35, 38, 35, 57, 94, 77, 6, 63, 49, 82, 1, 14, 42, 56, 56, 43, 63, 12, 78, 25, 79, 53, 44, 97, 74, 41, 14, 76, 73, 19, 11, 18, 33, 13, 96, 70, 32, 41, 89, 86, 91, 98, 90, 91, 46 };
        int w = 54;
        assertEquals(4138.221466339355, pillarsdivtwo.maximalLength(height, w), DELTA * 4138.221466339355);
    }

    @Test
    public void case25() {
        int[] height = { 15, 52, 41, 45, 59, 36, 60, 93, 6, 65, 82, 4, 30, 76, 9, 93, 98, 50, 57, 62, 28, 68, 42, 30, 41, 14, 75, 2, 78, 16, 84, 14, 93, 25, 2, 93, 60, 71, 29, 28, 85, 76, 87, 99, 71, 88, 48, 5, 4, 22 };
        int w = 64;
        assertEquals(4475.562028763542, pillarsdivtwo.maximalLength(height, w), DELTA * 4475.562028763542);
    }

    @Test
    public void case26() {
        int[] height = { 7, 64, 11, 72, 90, 41, 65, 43, 20, 14, 92, 5, 19, 33, 51, 6, 76, 40, 4, 23, 99, 48, 85, 49, 72, 65, 14, 76, 46, 13, 47, 79, 70, 63, 20, 86, 90, 45, 66, 41, 46, 9, 19, 71, 2, 24, 33, 73, 53, 88 };
        int w = 71;
        assertEquals(4603.814856077139, pillarsdivtwo.maximalLength(height, w), DELTA * 4603.814856077139);
    }

    @Test
    public void case27() {
        int[] height = { 64, 2, 4, 24, 28, 1, 70, 16, 66, 29, 44, 48, 89, 44, 38, 10, 64, 50, 82, 89, 43, 9, 61, 22, 59, 55, 89, 47, 91, 50, 44, 31, 21, 49, 68, 37, 84, 36, 27, 86, 39, 54, 30, 25, 49, 24, 60, 58, 67, 45 };
        int w = 56;
        assertEquals(3993.840621897657, pillarsdivtwo.maximalLength(height, w), DELTA * 3993.840621897657);
    }

    @Test
    public void case28() {
        int[] height = { 19, 27, 12, 26, 56, 2, 50, 97, 85, 16, 65, 43, 76, 14, 43, 97, 49, 73, 27, 7, 74, 30, 5, 6, 27, 13, 76, 94, 66, 37, 37, 42, 15, 95, 57, 53, 37, 39, 83, 56, 16, 32, 31, 42, 26, 12, 38, 87, 91, 51 };
        int w = 63;
        assertEquals(4146.494525759854, pillarsdivtwo.maximalLength(height, w), DELTA * 4146.494525759854);
    }

    @Test
    public void case29() {
        int[] height = { 35, 94, 54, 17, 53, 9, 63, 34, 55, 4, 35, 4, 57, 49, 25, 18, 14, 10, 29, 1, 81, 19, 59, 51, 56, 62, 65, 4, 77, 44, 10, 3, 62, 90, 49, 83, 54, 75, 21, 3, 24, 32, 70, 79, 60, 9, 20, 72, 4, 46 };
        int w = 82;
        assertEquals(4874.647346475028, pillarsdivtwo.maximalLength(height, w), DELTA * 4874.647346475028);
    }

    @Test
    public void case30() {
        int[] height = { 5, 93, 86, 14, 99, 90, 23, 39, 38, 11, 62, 35, 9, 62, 60, 94, 16, 70, 38, 70, 59, 1, 72, 65, 18, 16, 56, 16, 31, 40, 13, 89, 83, 55, 86, 11, 85, 75, 81, 16, 52, 42, 16, 80, 11, 99, 74, 89, 78, 33 };
        int w = 57;
        assertEquals(4214.483768834308, pillarsdivtwo.maximalLength(height, w), DELTA * 4214.483768834308);
    }

    @Test
    public void case31() {
        int[] height = { 90, 14, 9, 42, 91, 24, 64, 29, 85, 79, 1, 72, 86, 75, 72, 34, 68, 54, 96, 69, 26, 77, 30, 51, 99, 10, 94, 87, 81, 17, 50, 68, 29, 80, 65, 22, 6, 27, 17, 17, 27, 67, 88, 82, 65, 41, 87, 22, 63, 22 };
        int w = 65;
        assertEquals(4541.267361569381, pillarsdivtwo.maximalLength(height, w), DELTA * 4541.267361569381);
    }

    @Test
    public void case32() {
        int[] height = { 10, 16, 3, 74, 25, 42, 46, 63, 24, 32, 7, 69, 19, 3, 8, 8, 82, 13, 37, 31, 15, 10, 85, 57, 91, 94, 97, 53, 55, 46, 9, 49, 92, 13, 32, 15, 40, 59, 23, 5, 96, 53, 70, 80, 39, 24, 19, 67, 60, 99 };
        int w = 87;
        assertEquals(5138.717089235266, pillarsdivtwo.maximalLength(height, w), DELTA * 5138.717089235266);
    }

    @Test
    public void case33() {
        int[] height = { 97, 63, 34, 59, 23, 47, 93, 38, 26, 48, 59, 3, 8, 99, 31, 93, 1, 79, 100, 53, 49, 83, 41, 16, 76, 63, 68, 37, 98, 19, 98, 29, 52, 17, 31, 50, 26, 59, 30, 21, 41, 61, 48, 63, 56, 76, 93, 62, 55, 99 };
        int w = 47;
        assertEquals(3936.215255729578, pillarsdivtwo.maximalLength(height, w), DELTA * 3936.215255729578);
    }

    @Test
    public void case34() {
        int[] height = { 15, 47, 89, 70, 39, 64, 76, 16, 22, 76, 16, 29, 35, 71, 6, 65, 58, 63, 62, 25, 50, 70, 31, 24, 51, 34, 26, 11, 38, 37, 38, 79, 94, 37, 15, 65, 92, 50, 36, 6, 38, 5, 38, 24, 65, 71, 9, 69, 82, 86 };
        int w = 53;
        assertEquals(3721.8263629029, pillarsdivtwo.maximalLength(height, w), DELTA * 3721.8263629029);
    }

    @Test
    public void case35() {
        int[] height = { 74, 53, 95, 77, 27, 97, 73, 50, 41, 75, 20, 44, 12, 42, 90, 20, 66, 6, 86, 17, 51, 16, 10, 65, 67, 94, 75, 10, 1, 96, 74, 90, 62, 73, 69, 59, 32, 69, 27, 11, 23, 75, 80, 11, 53, 83, 92, 96, 65, 75 };
        int w = 65;
        assertEquals(4608.578068254262, pillarsdivtwo.maximalLength(height, w), DELTA * 4608.578068254262);
    }

    @Test
    public void case36() {
        int[] height = { 3, 56, 61, 75, 73, 22, 23, 48, 78, 90, 6, 96, 95, 51, 44, 55, 82, 13, 73, 40, 29, 13, 63, 68, 9, 16, 9, 24, 60, 35, 5, 87, 20, 59, 46, 7, 67, 1, 68, 93, 88, 33, 57, 75, 48, 22, 84, 23, 32, 77 };
        int w = 84;
        assertEquals(5069.750569832345, pillarsdivtwo.maximalLength(height, w), DELTA * 5069.750569832345);
    }

    @Test
    public void case37() {
        int[] height = { 49, 24, 83, 19, 77, 21, 12, 83, 57, 91, 26, 25, 87, 78, 70, 44, 35, 78, 69, 69, 92, 97, 84, 29, 28, 27, 72, 98, 13, 4, 28, 9, 46, 9, 86, 39, 38, 44, 14, 2, 51, 29, 12, 51, 50, 93, 55, 70, 82, 66 };
        int w = 68;
        assertEquals(4539.631995764839, pillarsdivtwo.maximalLength(height, w), DELTA * 4539.631995764839);
    }

    @Test
    public void case38() {
        int[] height = { 14, 94, 35, 73, 73, 31, 2, 43, 78, 78, 71, 3, 65, 82, 91, 24, 38, 24, 80, 96, 70, 28, 43, 11, 83, 59, 27, 88, 71, 29, 52, 59, 14, 61, 84, 87, 43, 11, 73, 29, 35, 42, 19, 4, 68, 66, 39, 82, 58, 51 };
        int w = 15;
        assertEquals(2995.169090435318, pillarsdivtwo.maximalLength(height, w), DELTA * 2995.169090435318);
    }

    @Test
    public void case39() {
        int[] height = { 99, 59, 62, 64, 57, 8, 79, 90, 36, 66, 76, 87, 87, 34, 61, 31, 49, 29, 93, 34, 41, 67, 36, 11, 100, 38, 93, 83, 29, 53, 70, 45, 95, 9, 53, 48, 33, 36, 9, 65, 98, 44, 50, 16, 42, 90, 1, 13, 49, 24 };
        int w = 52;
        assertEquals(4036.1298009018233, pillarsdivtwo.maximalLength(height, w), DELTA * 4036.1298009018233);
    }

    @Test
    public void case40() {
        int[] height = { 75, 34, 92, 1, 55, 91, 98, 20, 81, 79, 32, 45, 41, 88, 100, 26, 84, 39, 93, 94, 53, 12, 61, 35, 41, 98, 86, 30, 41, 6, 92, 93, 11, 50, 79, 80, 72, 78, 74, 94, 21, 98, 27, 77, 91, 83, 79, 60, 19, 90 };
        int w = 60;
        assertEquals(4613.392057360121, pillarsdivtwo.maximalLength(height, w), DELTA * 4613.392057360121);
    }

    @Test
    public void case41() {
        int[] height = { 50, 25, 73, 81, 9, 68, 9, 78, 4, 71, 8, 97, 75, 23, 12, 20, 62, 57, 91, 64, 84, 17, 33, 53, 42, 55, 14, 63, 97, 61, 16, 5, 100, 37, 81, 99, 33, 88, 85, 41, 18, 7, 71, 42, 83, 50, 24, 59, 6, 22 };
        int w = 96;
        assertEquals(5695.095225480062, pillarsdivtwo.maximalLength(height, w), DELTA * 5695.095225480062);
    }

    @Test
    public void case42() {
        int[] height = { 97, 17, 79, 79, 80, 59, 78, 51, 8, 30, 82, 96, 79, 77, 54, 100, 85, 66, 94, 9, 73, 44, 30, 15, 69, 56, 92, 74, 23, 49, 52, 87, 45, 47, 78, 18, 30, 17, 75, 92, 70, 13, 47, 94, 92, 16, 50, 58, 41, 53 };
        int w = 37;
        assertEquals(3701.285980331424, pillarsdivtwo.maximalLength(height, w), DELTA * 3701.285980331424);
    }

    @Test
    public void case43() {
        int[] height = { 52, 88, 27, 63, 56, 84, 95, 81, 98, 66, 66, 14, 62, 79, 79, 79, 41, 12, 48, 46, 71, 76, 90, 51, 50, 34, 66, 15, 83, 8, 33, 97, 68, 23, 83, 11, 42, 32, 88, 6, 80, 22, 39, 52, 48, 9, 47, 77, 60, 90 };
        int w = 23;
        assertEquals(3423.257432740588, pillarsdivtwo.maximalLength(height, w), DELTA * 3423.257432740588);
    }

    @Test
    public void case44() {
        int[] height = { 67, 87, 56, 29, 15, 61, 54, 78, 49, 4, 62, 32, 83, 56, 98, 7, 53, 22, 97, 82, 22, 56, 48, 25, 19, 36, 77, 75, 60, 99, 75, 54, 23, 36, 44, 89, 54, 33, 48, 81, 27, 79, 51, 2, 62, 100, 56, 64, 17, 74 };
        int w = 62;
        assertEquals(4400.964779878813, pillarsdivtwo.maximalLength(height, w), DELTA * 4400.964779878813);
    }

    @Test
    public void case45() {
        int[] height = { 46, 74, 75, 51, 54, 82, 88, 100, 11, 44, 66, 73, 30, 82, 13, 77, 82, 48, 91, 72, 6, 73, 33, 90, 21, 66, 32, 59, 94, 7, 79, 49, 7, 72, 67, 97, 98, 21, 95, 30, 89, 10, 85, 70, 79, 18, 16, 27, 85, 69 };
        int w = 7;
        assertEquals(3440.8269950782324, pillarsdivtwo.maximalLength(height, w), DELTA * 3440.8269950782324);
    }

    @Test
    public void case46() {
        int[] height = { 29, 98, 19, 91, 100, 86, 87, 100, 21, 11, 72, 14, 16, 86, 19, 81, 32, 68, 88, 45, 87, 8, 61, 28, 75, 32, 53, 72, 69, 94, 86, 38, 12, 5, 78, 7, 69, 23, 14, 1, 43, 38, 39, 89, 56, 90, 48, 82, 94, 85 };
        int w = 88;
        assertEquals(5558.977635800158, pillarsdivtwo.maximalLength(height, w), DELTA * 5558.977635800158);
    }

    @Test
    public void case47() {
        int[] height = { 62, 94, 18, 2, 83, 48, 66, 54, 5, 85, 96, 26, 22, 65, 82, 73, 7, 57, 44, 94, 81, 81, 69, 12, 14, 69, 52, 17, 80, 69, 41, 32, 34, 80, 64, 60, 54, 37, 96, 66, 75, 21, 36, 81, 77, 56, 26, 72, 9, 60 };
        int w = 57;
        assertEquals(4212.1177983213665, pillarsdivtwo.maximalLength(height, w), DELTA * 4212.1177983213665);
    }

    @Test
    public void case48() {
        int[] height = { 3, 33, 6, 41, 76, 63, 86, 63, 81, 37, 98, 3, 9, 81, 41, 77, 59, 94, 41, 47, 75, 74, 98, 81, 36, 73, 1, 8, 56, 67, 42, 89, 82, 69, 16, 97, 26, 10, 13, 37, 56, 63, 44, 43, 22, 23, 13, 49, 19, 69 };
        int w = 18;
        assertEquals(3132.125123376149, pillarsdivtwo.maximalLength(height, w), DELTA * 3132.125123376149);
    }

    @Test
    public void case49() {
        int[] height = { 15, 51, 91, 36, 60, 70, 96, 4, 41, 80, 100, 6, 92, 62, 82, 53, 54, 34, 30, 88, 43, 54, 84, 21, 15, 19, 45, 64, 30, 53, 65, 70, 71, 6, 48, 95, 88, 27, 77, 24, 41, 80, 91, 89, 11, 72, 46, 22, 71, 84 };
        int w = 90;
        assertEquals(5519.1645016944785, pillarsdivtwo.maximalLength(height, w), DELTA * 5519.1645016944785);
    }

    @Test
    public void case50() {
        int[] height = { 56, 79, 80, 7, 63, 36, 88, 97, 34, 89, 36, 80, 94, 91, 63, 66, 2, 6, 8, 68, 70, 35, 72, 58, 99, 46, 98, 19, 39, 45, 73, 64, 29, 65, 2, 24, 91, 5, 2, 28, 98, 93, 72, 64, 2, 64, 22, 66, 22, 46 };
        int w = 11;
        assertEquals(3155.4891309934756, pillarsdivtwo.maximalLength(height, w), DELTA * 3155.4891309934756);
    }

    @Test
    public void case51() {
        int[] height = { 96, 42, 23, 13, 52, 16, 56, 94, 39, 80, 83, 9, 55, 23, 8, 46, 39, 45, 91, 40, 55, 5, 24, 26, 79, 25, 82, 31, 34, 24, 95, 31, 47, 88, 46, 6, 17, 51, 90, 39, 64, 36, 98, 10, 31, 25, 9, 38, 75, 21 };
        int w = 73;
        assertEquals(4649.080920198726, pillarsdivtwo.maximalLength(height, w), DELTA * 4649.080920198726);
    }

    @Test
    public void case52() {
        int[] height = { 94, 56, 35, 62, 57, 7, 85, 76, 83, 20, 42, 33, 85, 80, 80, 84, 68, 37, 26, 19, 38, 29, 20, 78, 38, 92, 57, 96, 61, 2, 94, 33, 37, 81, 76, 8, 85, 75, 20, 91, 77, 42, 52, 30, 91, 75, 73, 92, 90, 88 };
        int w = 91;
        assertEquals(5599.94889235557, pillarsdivtwo.maximalLength(height, w), DELTA * 5599.94889235557);
    }

    @Test
    public void case53() {
        int[] height = { 40, 94, 54, 64, 82, 4, 6, 77, 80, 96, 40, 69, 99, 84, 40, 16, 22, 94, 27, 23, 39, 29, 82, 100, 79, 92, 24, 44, 35, 44, 50, 3, 8, 3, 42, 88, 47, 92, 38, 14, 1, 17, 91, 63, 36, 27, 11, 78, 83, 61 };
        int w = 90;
        assertEquals(5414.974253146997, pillarsdivtwo.maximalLength(height, w), DELTA * 5414.974253146997);
    }

    @Test
    public void case54() {
        int[] height = { 6, 75, 64, 23, 96, 67, 61, 39, 89, 12, 46, 68, 26, 68, 90, 43, 64, 48, 3, 18, 100, 24, 27, 4, 49, 52, 71, 37, 59, 68, 57, 6, 32, 63, 20, 76, 57, 32, 96, 45, 92, 4, 89, 16, 51, 20, 73, 92, 84, 34 };
        int w = 76;
        assertEquals(4963.683542239594, pillarsdivtwo.maximalLength(height, w), DELTA * 4963.683542239594);
    }

    @Test
    public void case55() {
        int[] height = { 43, 70, 1, 55, 79, 86, 58, 34, 94, 91, 4, 51, 34, 23, 72, 12, 91, 39, 42, 59, 48, 53, 59, 80, 3, 84, 91, 3, 69, 23, 96, 36, 9, 62, 43, 95, 100, 89, 79, 43, 58, 42, 48, 70, 46, 81, 14, 65, 11, 62 };
        int w = 86;
        assertEquals(5349.152628770879, pillarsdivtwo.maximalLength(height, w), DELTA * 5349.152628770879);
    }

    @Test
    public void case56() {
        int[] height = { 74, 5, 63, 4, 3, 70, 55, 30, 53, 75, 50, 31, 45, 45, 50, 19, 66, 64, 53, 74, 71, 32, 48, 12, 70, 99, 99, 4, 53, 80, 54, 44, 23, 89, 64, 35, 51, 23, 41, 12, 93, 52, 81, 78, 17, 77, 79, 21, 16, 49 };
        int w = 99;
        assertEquals(5683.230350379701, pillarsdivtwo.maximalLength(height, w), DELTA * 5683.230350379701);
    }

    @Test
    public void case57() {
        int[] height = { 80, 36, 58, 84, 63, 3, 63, 21, 71, 23, 74, 42, 87, 89, 18, 18, 93, 99, 68, 50, 66, 90, 33, 20, 82, 4, 31, 29, 32, 90, 53, 31, 73, 65, 8, 96, 29, 82, 91, 11, 78, 72, 37, 60, 44, 41, 34, 38, 94, 31 };
        int w = 75;
        assertEquals(4869.419994991303, pillarsdivtwo.maximalLength(height, w), DELTA * 4869.419994991303);
    }

    @Test
    public void case58() {
        int[] height = { 94, 83, 4, 62, 91, 63, 8, 98, 52, 24, 91, 18, 41, 4, 67, 84, 62, 60, 46, 87, 52, 66, 2, 41, 10, 98, 84, 51, 59, 22, 76, 82, 88, 72, 88, 100, 5, 80, 39, 1, 31, 62, 19, 6, 41, 29, 60, 23, 99, 61 };
        int w = 99;
        assertEquals(5883.412415138644, pillarsdivtwo.maximalLength(height, w), DELTA * 5883.412415138644);
    }

    @Test
    public void case59() {
        int[] height = { 36, 82, 15, 68, 94, 97, 62, 47, 39, 71, 39, 77, 56, 18, 72, 61, 53, 59, 34, 56, 66, 27, 2, 35, 60, 94, 49, 74, 93, 94, 34, 38, 4, 91, 12, 95, 69, 28, 99, 90, 49, 80, 48, 50, 32, 70, 76, 99, 50, 37 };
        int w = 100;
        assertEquals(5959.549729629215, pillarsdivtwo.maximalLength(height, w), DELTA * 5959.549729629215);
    }

    @Test
    public void case60() {
        int[] height = { 24, 44, 32, 55, 62, 35, 86, 68, 17, 94, 5, 67, 54, 9, 24, 85, 93, 68, 49, 70, 31, 12, 15, 91, 28, 44, 5, 100, 75, 96, 7, 59, 90, 59, 10, 90, 48, 41, 19, 65, 76, 27, 90, 4, 67, 13, 41, 71, 77, 96 };
        int w = 42;
        assertEquals(3799.667114248842, pillarsdivtwo.maximalLength(height, w), DELTA * 3799.667114248842);
    }

    @Test
    public void case61() {
        int[] height = { 87, 52, 10, 88, 84, 86, 91, 51, 87, 56, 82, 29, 3, 78, 63, 25, 66, 73, 33, 86, 29, 47, 90, 79, 84, 26, 66, 61, 46, 79, 22, 56, 21, 28, 74, 35, 52, 76, 37, 35, 2, 38, 11, 75, 91, 57, 72, 81, 36, 46 };
        int w = 83;
        assertEquals(5182.929781607518, pillarsdivtwo.maximalLength(height, w), DELTA * 5182.929781607518);
    }

    @Test
    public void case62() {
        int[] height = { 100 };
        int w = 4;
        assertEquals(0.0, pillarsdivtwo.maximalLength(height, w), DELTA);
    }

    @Test
    public void case63() {
        int[] height = { 5, 10, 10, 10 };
        int w = 5;
        assertEquals(30.886890422961002, pillarsdivtwo.maximalLength(height, w), DELTA * 30.886890422961002);
    }

    @Test
    public void case64() {
        int[] height = { 34, 62, 79, 29, 38, 38, 5, 39, 57, 25, 24, 27, 24, 83, 54, 72, 12, 95, 11, 65, 62, 65, 98, 62, 63, 42, 63, 5, 64, 78, 3, 1, 92, 60, 98, 27, 92, 44, 67, 1, 9, 29, 28, 14, 18, 94, 64, 19, 66, 68 };
        int w = 3;
        assertEquals(2767.087523846886, pillarsdivtwo.maximalLength(height, w), DELTA * 2767.087523846886);
    }

    @Test
    public void case65() {
        int[] height = { 100, 10, 1, 1, 10, 100, 100, 10, 1, 1, 10, 100, 100, 10, 1, 1, 10, 100, 100, 10, 1, 1, 10, 100, 100, 10, 1, 1, 10, 100, 100, 10, 1, 1, 10, 100, 100, 10, 1, 1, 10, 100, 100, 10, 1, 1, 10, 100 };
        int w = 10;
        assertEquals(1950.4110370245667, pillarsdivtwo.maximalLength(height, w), DELTA * 1950.4110370245667);
    }

    @Test
    public void case66() {
        int[] height = { 100, 1, 100, 100, 1, 1 };
        int w = 95;
        assertEquals(601.62361448294, pillarsdivtwo.maximalLength(height, w), DELTA * 601.62361448294);
    }

    @Test
    public void case67() {
        int[] height = { 100, 2, 100, 2, 100 };
        int w = 4;
        assertEquals(396.32310051270036, pillarsdivtwo.maximalLength(height, w), DELTA * 396.32310051270036);
    }

    @Test
    public void case68() {
        int[] height = { 1, 51, 100, 1 };
        int w = 10;
        assertEquals(209.00753754569197, pillarsdivtwo.maximalLength(height, w), DELTA * 209.00753754569197);
    }

    @Test
    public void case69() {
        int[] height = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
        int w = 100;
        assertEquals(5089.709782605168, pillarsdivtwo.maximalLength(height, w), DELTA * 5089.709782605168);
    }

    @Test
    public void case70() {
        int[] height = { 1, 2, 8, 100, 98, 10, 100, 34, 12, 100, 99, 100, 19, 43, 13, 12, 100, 100, 100, 100, 100, 100, 100, 100, 100, 9, 2, 100, 100, 29, 10 };
        int w = 43;
        assertEquals(2639.5685714652464, pillarsdivtwo.maximalLength(height, w), DELTA * 2639.5685714652464);
    }

    @Test
    public void case71() {
        int[] height = { 1, 2, 4 };
        int w = 2;
        assertEquals(5.60555127546399, pillarsdivtwo.maximalLength(height, w), DELTA * 5.60555127546399);
    }

    @Test
    public void case72() {
        int[] height = { 2, 1, 1, 2 };
        int w = 1;
        assertEquals(3.82842712474619, pillarsdivtwo.maximalLength(height, w), DELTA * 3.82842712474619);
    }

    @Test
    public void case73() {
        int[] height = { 1, 100, 1, 100 };
        int w = 10;
        assertEquals(298.51130631853795, pillarsdivtwo.maximalLength(height, w), DELTA * 298.51130631853795);
    }

    @Test
    public void case74() {
        int[] height = { 1, 2, 5, 100, 1, 3, 100, 2, 1, 100, 5, 40, 100, 12, 100, 99, 1, 15, 100, 60, 50, 100, 1, 12 };
        int w = 14;
        assertEquals(1529.6658157576385, pillarsdivtwo.maximalLength(height, w), DELTA * 1529.6658157576385);
    }

    @Test
    public void case75() {
        int[] height = { 100, 99, 88, 97, 96, 95, 94, 93, 92, 91, 90, 89, 88, 87, 86, 85, 84, 83, 82, 81, 80, 79, 78, 77, 76, 60, 74, 73, 72, 71, 70, 69, 68, 67, 66, 65, 64, 63, 62, 61, 60, 59, 58, 57, 56, 55, 54, 52, 52, 51 };
        int w = 100;
        assertEquals(6122.496143467997, pillarsdivtwo.maximalLength(height, w), DELTA * 6122.496143467997);
    }

    @Test
    public void case76() {
        int[] height = { 36, 2, 1, 4, 5, 8, 96, 65, 5, 6 };
        int w = 5;
        assertEquals(261.23081191346324, pillarsdivtwo.maximalLength(height, w), DELTA * 261.23081191346324);
    }

    @Test
    public void case77() {
        int[] height = { 100, 2, 100, 2, 100, 33, 44, 5, 55, 66, 77, 55, 88 };
        int w = 7;
        assertEquals(932.1960719164986, pillarsdivtwo.maximalLength(height, w), DELTA * 932.1960719164986);
    }

    @Test
    public void case78() {
        int[] height = { 1, 10, 100 };
        int w = 10;
        assertEquals(109.50376877284599, pillarsdivtwo.maximalLength(height, w), DELTA * 109.50376877284599);
    }

    @Test
    public void case79() {
        int[] height = { 1, 10, 10, 1 };
        int w = 1;
        assertEquals(19.110770276274835, pillarsdivtwo.maximalLength(height, w), DELTA * 19.110770276274835);
    }

    @Test
    public void case80() {
        int[] height = { 3, 50, 80, 90, 6 };
        int w = 2;
        assertEquals(276.1265368295624, pillarsdivtwo.maximalLength(height, w), DELTA * 276.1265368295624);
    }

    @Test
    public void case81() {
        int[] height = { 2, 2, 1, 3, 4 };
        int w = 5;
        assertEquals(21.02899092203087, pillarsdivtwo.maximalLength(height, w), DELTA * 21.02899092203087);
    }

    @Test
    public void case82() {
        int[] height = { 3, 2, 1 };
        int w = 2;
        assertEquals(4.82842712474619, pillarsdivtwo.maximalLength(height, w), DELTA * 4.82842712474619);
    }

    @Test
    public void case83() {
        int[] height = { 100, 1, 1, 100 };
        int w = 1;
        assertEquals(199.01010075246163, pillarsdivtwo.maximalLength(height, w), DELTA * 199.01010075246163);
    }

    @Test
    public void case84() {
        int[] height = { 1, 2, 3 };
        int w = 2;
        assertEquals(4.82842712474619, pillarsdivtwo.maximalLength(height, w), DELTA * 4.82842712474619);
    }

    @Test
    public void case85() {
        int[] height = { 5, 3 };
        int w = 1;
        assertEquals(4.123105625617661, pillarsdivtwo.maximalLength(height, w), DELTA * 4.123105625617661);
    }

    @Test
    public void case86() {
        int[] height = { 50, 45, 1 };
        int w = 10;
        assertEquals(90.24411338142782, pillarsdivtwo.maximalLength(height, w), DELTA * 90.24411338142782);
    }

    @Test
    public void case87() {
        int[] height = { 16, 25, 12, 13, 51, 12, 6, 89, 6, 86, 54, 58, 14, 32, 27, 4, 66, 7, 93, 2, 74, 29, 47, 66, 14, 98, 93, 88, 88, 8, 49, 12, 78, 26, 8, 98, 51, 24, 52, 22, 76, 37, 35, 49, 61, 63, 11, 19, 28, 52 };
        int w = 97;
        assertEquals(5611.37850356068, pillarsdivtwo.maximalLength(height, w), DELTA * 5611.37850356068);
    }

    @Test
    public void case88() {
        int[] height = { 2, 100, 2, 100, 50, 100 };
        int w = 10;
        assertEquals(497.51884386422995, pillarsdivtwo.maximalLength(height, w), DELTA * 497.51884386422995);
    }

    @Test
    public void case89() {
        int[] height = { 90, 1, 35, 70, 99, 10, 50, 11, 13, 33, 60, 50, 40, 30, 10, 99, 55, 16, 60, 53, 57, 63, 16, 1, 10, 5, 2, 3, 4, 5, 6, 7, 7, 8, 9, 16, 95, 16, 32, 32, 66, 13, 15, 15, 16, 19, 20, 25, 33 };
        int w = 95;
        assertEquals(5060.868086519161, pillarsdivtwo.maximalLength(height, w), DELTA * 5060.868086519161);
    }

    @Test
    public void case90() {
        int[] height = { 100, 2, 2, 100 };
        int w = 1;
        assertEquals(199.01010075246163, pillarsdivtwo.maximalLength(height, w), DELTA * 199.01010075246163);
    }

    @Test
    public void case91() {
        int[] height = { 1, 100, 1, 1, 100, 1 };
        int w = 20;
        assertEquals(424.0, pillarsdivtwo.maximalLength(height, w), DELTA * 424.0);
    }

    @Test
    public void case92() {
        int[] height = { 10, 50, 100 };
        int w = 1;
        assertEquals(108.06043551436824, pillarsdivtwo.maximalLength(height, w), DELTA * 108.06043551436824);
    }

    @Test
    public void case93() {
        int[] height = { 100, 100, 100, 100, 100 };
        int w = 5;
        assertEquals(396.50472884948044, pillarsdivtwo.maximalLength(height, w), DELTA * 396.50472884948044);
    }

    @Test
    public void case94() {
        int[] height = { 10, 9 };
        int w = 1;
        assertEquals(9.055385138137417, pillarsdivtwo.maximalLength(height, w), DELTA * 9.055385138137417);
    }

    @Test
    public void case95() {
        int[] height = { 2, 10, 10, 5 };
        int w = 1;
        assertEquals(22.233875901892496, pillarsdivtwo.maximalLength(height, w), DELTA * 22.233875901892496);
    }

    @Test
    public void case96() {
        int[] height = { 20, 40, 60, 70, 80, 90, 10, 60, 55, 3, 99, 99, 99, 40 };
        int w = 99;
        assertEquals(1607.1064447643892, pillarsdivtwo.maximalLength(height, w), DELTA * 1607.1064447643892);
    }

    @Test
    public void case97() {
        int[] height = { 100, 1, 100, 100, 1, 1, 2, 2, 3, 4, 4, 2, 100, 100, 99, 90, 100, 100, 100, 90, 80, 90, 80, 90, 100, 10, 100, 1, 10, 100 };
        int w = 95;
        assertEquals(3543.256352118813, pillarsdivtwo.maximalLength(height, w), DELTA * 3543.256352118813);
    }

    @Test
    public void case98() {
        int[] height = { 50, 15, 8, 20, 50, 19, 38, 30, 45, 1, 1, 1, 1, 1, 50, 12, 48, 32, 45, 11, 43, 100, 1, 12, 88 };
        int w = 3;
        assertEquals(908.6756534435257, pillarsdivtwo.maximalLength(height, w), DELTA * 908.6756534435257);
    }

    @Test
    public void case99() {
        int[] height = { 1, 10, 100, 84, 34, 75, 34, 88, 11, 1, 22, 33, 44, 55, 100, 88, 15, 45, 75 };
        int w = 4;
        assertEquals(971.9020717717231, pillarsdivtwo.maximalLength(height, w), DELTA * 971.9020717717231);
    }

    @Test
    public void case100() {
        int[] height = { 10, 8, 5 };
        int w = 2;
        assertEquals(14.560219778561036, pillarsdivtwo.maximalLength(height, w), DELTA * 14.560219778561036);
    }

    @Test
    public void case101() {
        int[] height = { 5, 5, 2 };
        int w = 1;
        assertEquals(8.246211251235321, pillarsdivtwo.maximalLength(height, w), DELTA * 8.246211251235321);
    }

    @Test
    public void case102() {
        int[] height = { 1, 4, 6 };
        int w = 2;
        assertEquals(7.385164807134504, pillarsdivtwo.maximalLength(height, w), DELTA * 7.385164807134504);
    }

    @Test
    public void case103() {
        int[] height = { 3, 4, 88 };
        int w = 5;
        assertEquals(92.52872452327188, pillarsdivtwo.maximalLength(height, w), DELTA * 92.52872452327188);
    }

    @Test
    public void case104() {
        int[] height = { 2, 3, 100, 2, 100 };
        int w = 2;
        assertEquals(299.29666785570646, pillarsdivtwo.maximalLength(height, w), DELTA * 299.29666785570646);
    }

    @Test
    public void case105() {
        int[] height = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 47, 48, 49 };
        int w = 4;
        assertEquals(1227.9369749565783, pillarsdivtwo.maximalLength(height, w), DELTA * 1227.9369749565783);
    }

    @Test
    public void case106() {
        int[] height = { 1, 46, 91, 100, 1, 46, 91, 5, 100 };
        int w = 2;
        assertEquals(569.1938838734787, pillarsdivtwo.maximalLength(height, w), DELTA * 569.1938838734787);
    }

    @Test
    public void case107() {
        int[] height = { 50, 30, 59, 30, 49, 49, 39, 39, 30, 10, 10, 1, 39, 40, 20, 30, 40, 30, 40, 29, 99, 88, 69, 4, 3, 2, 6, 7, 1, 3, 6, 29, 30, 44, 58, 38, 30, 10, 10, 10, 10, 10, 10 };
        int w = 100;
        assertEquals(4505.53649020157, pillarsdivtwo.maximalLength(height, w), DELTA * 4505.53649020157);
    }

    @Test
    public void case108() {
        int[] height = { 100, 2, 1, 1, 2, 100 };
        int w = 1;
        assertEquals(201.01010075246163, pillarsdivtwo.maximalLength(height, w), DELTA * 201.01010075246163);
    }

    @Test
    public void case109() {
        int[] height = { 4, 2, 3, 4 };
        int w = 1;
        assertEquals(7.63441361516796, pillarsdivtwo.maximalLength(height, w), DELTA * 7.63441361516796);
    }

    @Test
    public void case110() {
        int[] height = { 1, 2 };
        int w = 100;
        assertEquals(100.00499987500625, pillarsdivtwo.maximalLength(height, w), DELTA * 100.00499987500625);
    }

    @Test
    public void case111() {
        int[] height = { 100, 1, 2, 3, 4, 1, 1, 1, 1, 100 };
        int w = 100;
        assertEquals(981.5320316993422, pillarsdivtwo.maximalLength(height, w), DELTA * 981.5320316993422);
    }

    @Test
    public void case112() {
        int[] height = { 1, 2, 3 };
        int w = 1;
        assertEquals(3.23606797749979, pillarsdivtwo.maximalLength(height, w), DELTA * 3.23606797749979);
    }

    @Test
    public void case113() {
        int[] height = { 1, 2, 3, 3 };
        int w = 1;
        assertEquals(5.47213595499958, pillarsdivtwo.maximalLength(height, w), DELTA * 5.47213595499958);
    }

    @Test
    public void case114() {
        int[] height = { 5, 1, 4, 3, 4, 5 };
        int w = 20;
        assertEquals(101.29107171899787, pillarsdivtwo.maximalLength(height, w), DELTA * 101.29107171899787);
    }

    @Test
    public void case115() {
        int[] height = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 1, 2, 1, 1, 1, 2, 3, 4, 3, 2, 1, 100, 1, 1, 1, 2, 3, 4, 5, 6, 6, 6, 6, 4, 3, 2, 1, 2, 1, 2, 2, 2, 1, 2, 2, 1, 2, 3, 2, 1, 100 };
        int w = 100;
        assertEquals(5023.327596290844, pillarsdivtwo.maximalLength(height, w), DELTA * 5023.327596290844);
    }

    @Test
    public void case116() {
        int[] height = { 2, 1, 1, 2, 2, 1, 1, 3, 2, 1, 1, 1, 2, 1, 3, 8, 24, 56 };
        int w = 1;
        assertEquals(87.69442954849627, pillarsdivtwo.maximalLength(height, w), DELTA * 87.69442954849627);
    }

    @Test
    public void case117() {
        int[] height = { 50, 15, 8, 20, 50, 19, 38, 30, 45, 1, 1, 1, 1, 1, 50, 12, 48, 32, 45, 11, 43, 100, 1, 12, 88, 99, 12, 1, 15, 38, 39, 57, 68, 88, 89, 97, 33, 92, 34, 100, 100, 100, 100, 2, 3 };
        int w = 7;
        assertEquals(2234.9825228448544, pillarsdivtwo.maximalLength(height, w), DELTA * 2234.9825228448544);
    }

    @Test
    public void case118() {
        int[] height = { 100, 1, 100, 100, 1, 10, 50, 19, 90, 98, 100, 15, 17, 100, 90, 90, 90, 90, 80, 70, 60, 20, 10, 100, 90, 18, 20, 20 };
        int w = 95;
        assertEquals(3233.2064416800113, pillarsdivtwo.maximalLength(height, w), DELTA * 3233.2064416800113);
    }

    @Test
    public void case119() {
        int[] height = { 1, 67, 3, 45, 78, 90, 23, 12, 34, 72, 91, 87, 52, 58, 24, 51, 74 };
        int w = 93;
        assertEquals(1795.3221382497823, pillarsdivtwo.maximalLength(height, w), DELTA * 1795.3221382497823);
    }

    @Test
    public void case120() {
        int[] height = { 2, 1, 1, 2, 1, 3, 8, 24, 49, 100 };
        int w = 1;
        assertEquals(154.763284751235, pillarsdivtwo.maximalLength(height, w), DELTA * 154.763284751235);
    }

    @Test
    public void case121() {
        int[] height = { 2, 1, 1, 3 };
        int w = 2;
        assertEquals(7.06449510224598, pillarsdivtwo.maximalLength(height, w), DELTA * 7.06449510224598);
    }

    @Test
    public void case122() {
        int[] height = { 3, 16, 17, 39, 12, 88, 80, 98, 73, 89, 4, 1, 92, 13, 2, 65, 7, 3, 69, 76 };
        int w = 5;
        assertEquals(1115.1380910781872, pillarsdivtwo.maximalLength(height, w), DELTA * 1115.1380910781872);
    }

    @Test
    public void case123() {
        int[] height = { 2, 3, 100, 3, 2, 100, 2, 3 };
        int w = 2;
        assertEquals(403.1452949398549, pillarsdivtwo.maximalLength(height, w), DELTA * 403.1452949398549);
    }

}
