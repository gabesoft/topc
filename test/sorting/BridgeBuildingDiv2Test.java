package topc.test.sorting;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.sorting.*;

public class BridgeBuildingDiv2Test {
    BridgeBuildingDiv2 bridgebuildingdiv2 = new BridgeBuildingDiv2();

    @Test
    public void case1() {
        int[] a = { 2, 1, 1, 1, 2 };
        int[] b = { 1, 9, 1, 9, 1 };
        int K = 4;
        assertEquals(6, bridgebuildingdiv2.minDiameter(a, b, K));
    }

    @Test
    public void case2() {
        int[] a = { 1, 50, 1, 50, 1, 50, 1, 50 };
        int[] b = { 50, 1, 50, 1, 50, 1, 50, 1 };
        int K = 9;
        assertEquals(8, bridgebuildingdiv2.minDiameter(a, b, K));
    }

    @Test
    public void case3() {
        int[] a = { 50, 10, 15, 31, 20, 23, 7, 48, 5, 50 };
        int[] b = { 2, 5, 1, 8, 3, 2, 16, 11, 9, 1 };
        int K = 3;
        assertEquals(124, bridgebuildingdiv2.minDiameter(a, b, K));
    }

    @Test
    public void case4() {
        int[] a = { 2, 4, 10, 2, 2, 22, 30, 7, 28 };
        int[] b = { 5, 26, 1, 2, 6, 2, 16, 3, 15 };
        int K = 5;
        assertEquals(54, bridgebuildingdiv2.minDiameter(a, b, K));
    }

    @Test
    public void case5() {
        int[] a = { 1, 4, 7, 3, 24, 39 };
        int[] b = { 5, 11, 37, 11, 1, 26 };
        int K = 3;
        assertEquals(52, bridgebuildingdiv2.minDiameter(a, b, K));
    }

    @Test
    public void case6() {
        int[] a = { 34, 14, 9, 2, 6 };
        int[] b = { 25, 30, 2, 22, 23 };
        int K = 5;
        assertEquals(56, bridgebuildingdiv2.minDiameter(a, b, K));
    }

    @Test
    public void case7() {
        int[] a = { 3, 40, 33, 3, 7, 1, 10, 35, 1 };
        int[] b = { 1, 15, 6, 1, 2, 19, 11, 1, 27 };
        int K = 4;
        assertEquals(63, bridgebuildingdiv2.minDiameter(a, b, K));
    }

    @Test
    public void case8() {
        int[] a = { 1, 24, 2, 36, 16 };
        int[] b = { 10, 23, 7, 29, 4 };
        int K = 4;
        assertEquals(63, bridgebuildingdiv2.minDiameter(a, b, K));
    }

    @Test
    public void case9() {
        int[] a = { 2, 1, 16, 35, 1, 9, 1, 5 };
        int[] b = { 30, 2, 1, 21, 8, 13, 3, 1 };
        int K = 3;
        assertEquals(53, bridgebuildingdiv2.minDiameter(a, b, K));
    }

    @Test
    public void case10() {
        int[] a = { 4, 1, 6, 1, 1, 4, 36, 5, 2 };
        int[] b = { 46, 11, 8, 8, 13, 1, 8, 1, 2 };
        int K = 2;
        assertEquals(74, bridgebuildingdiv2.minDiameter(a, b, K));
    }

    @Test
    public void case11() {
        int[] a = { 2, 2, 38, 37, 8, 1, 42, 4 };
        int[] b = { 1, 12, 1, 4, 8, 16, 41, 39 };
        int K = 2;
        assertEquals(126, bridgebuildingdiv2.minDiameter(a, b, K));
    }

    @Test
    public void case12() {
        int[] a = { 13, 28, 19, 2, 19, 6, 13 };
        int[] b = { 5, 1, 2, 2, 1, 11, 28 };
        int K = 2;
        assertEquals(73, bridgebuildingdiv2.minDiameter(a, b, K));
    }

    @Test
    public void case13() {
        int[] a = { 7, 1, 1, 36 };
        int[] b = { 20, 20, 7, 19 };
        int K = 2;
        assertEquals(55, bridgebuildingdiv2.minDiameter(a, b, K));
    }

    @Test
    public void case14() {
        int[] a = { 3, 4, 8, 1, 4, 1, 23, 4 };
        int[] b = { 8, 18, 2, 27, 2, 6, 1, 11 };
        int K = 2;
        assertEquals(59, bridgebuildingdiv2.minDiameter(a, b, K));
    }

    @Test
    public void case15() {
        int[] a = { 2, 31, 10, 9, 2, 3, 47, 16, 12 };
        int[] b = { 1, 27, 23, 17, 3, 8, 14, 4, 46 };
        int K = 6;
        assertEquals(83, bridgebuildingdiv2.minDiameter(a, b, K));
    }

    @Test
    public void case16() {
        int[] a = { 4, 4, 2, 2, 45, 4, 45, 1 };
        int[] b = { 4, 23, 2, 11, 17, 1, 1, 25 };
        int K = 3;
        assertEquals(68, bridgebuildingdiv2.minDiameter(a, b, K));
    }

    @Test
    public void case17() {
        int[] a = { 2, 3, 31, 24, 1 };
        int[] b = { 23, 14, 1, 4, 30 };
        int K = 5;
        assertEquals(20, bridgebuildingdiv2.minDiameter(a, b, K));
    }

    @Test
    public void case18() {
        int[] a = { 20, 2, 3, 1 };
        int[] b = { 7, 39, 1, 5 };
        int K = 2;
        assertEquals(28, bridgebuildingdiv2.minDiameter(a, b, K));
    }

    @Test
    public void case19() {
        int[] a = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int[] b = { 20, 18, 16, 14, 12, 10, 8, 6, 4, 2 };
        int K = 11;
        assertEquals(60, bridgebuildingdiv2.minDiameter(a, b, K));
    }

    @Test
    public void case20() {
        int[] a = { 4, 25, 22, 45, 2 };
        int[] b = { 19, 45, 12, 12, 4 };
        int K = 4;
        assertEquals(57, bridgebuildingdiv2.minDiameter(a, b, K));
    }

    @Test
    public void case21() {
        int[] a = { 36, 36, 22, 12, 14, 14, 6 };
        int[] b = { 43, 10, 41, 20, 21, 1, 5 };
        int K = 5;
        assertEquals(107, bridgebuildingdiv2.minDiameter(a, b, K));
    }

    @Test
    public void case22() {
        int[] a = { 34, 22, 34, 4, 6, 46, 45 };
        int[] b = { 30, 2, 43, 49, 31, 6, 21 };
        int K = 2;
        assertEquals(184, bridgebuildingdiv2.minDiameter(a, b, K));
    }

    @Test
    public void case23() {
        int[] a = { 11, 21, 7, 5, 14 };
        int[] b = { 10, 2, 36, 24, 26 };
        int K = 5;
        assertEquals(39, bridgebuildingdiv2.minDiameter(a, b, K));
    }

    @Test
    public void case24() {
        int[] a = { 9, 37, 1, 22 };
        int[] b = { 28, 32, 1, 23 };
        int K = 2;
        assertEquals(70, bridgebuildingdiv2.minDiameter(a, b, K));
    }

    @Test
    public void case25() {
        int[] a = { 22, 26, 16, 4 };
        int[] b = { 5, 38, 26, 13 };
        int K = 2;
        assertEquals(73, bridgebuildingdiv2.minDiameter(a, b, K));
    }

    @Test
    public void case26() {
        int[] a = { 6, 37, 35, 41, 19, 32, 13, 41, 6 };
        int[] b = { 26, 50, 3, 19, 19, 22, 39, 40, 23 };
        int K = 2;
        assertEquals(231, bridgebuildingdiv2.minDiameter(a, b, K));
    }

    @Test
    public void case27() {
        int[] a = { 45, 35, 36, 33 };
        int[] b = { 4, 27, 12, 13 };
        int K = 2;
        assertEquals(101, bridgebuildingdiv2.minDiameter(a, b, K));
    }

    @Test
    public void case28() {
        int[] a = { 12, 26, 2, 9, 12, 4, 5, 3 };
        int[] b = { 33, 7, 19, 47, 5, 13, 41, 4 };
        int K = 3;
        assertEquals(78, bridgebuildingdiv2.minDiameter(a, b, K));
    }

    @Test
    public void case29() {
        int[] a = { 33, 13, 31, 23, 22 };
        int[] b = { 36, 29, 17, 22, 34 };
        int K = 2;
        assertEquals(125, bridgebuildingdiv2.minDiameter(a, b, K));
    }

    @Test
    public void case30() {
        int[] a = { 23, 16, 4, 29, 35 };
        int[] b = { 45, 25, 29, 25, 2 };
        int K = 2;
        assertEquals(114, bridgebuildingdiv2.minDiameter(a, b, K));
    }

    @Test
    public void case31() {
        int[] a = { 11, 46, 16, 16, 14 };
        int[] b = { 30, 33, 36, 23, 22 };
        int K = 4;
        assertEquals(98, bridgebuildingdiv2.minDiameter(a, b, K));
    }

    @Test
    public void case32() {
        int[] a = { 6, 8, 15, 48 };
        int[] b = { 33, 36, 4, 34 };
        int K = 2;
        assertEquals(87, bridgebuildingdiv2.minDiameter(a, b, K));
    }

    @Test
    public void case33() {
        int[] a = { 21, 27, 38, 43, 4, 19, 19 };
        int[] b = { 4, 9, 15, 23, 9, 3, 38 };
        int K = 3;
        assertEquals(105, bridgebuildingdiv2.minDiameter(a, b, K));
    }

    @Test
    public void case34() {
        int[] a = { 18, 9, 15, 33, 43, 43, 19, 12, 29 };
        int[] b = { 15, 34, 24, 17, 17, 36, 7, 13, 18 };
        int K = 4;
        assertEquals(150, bridgebuildingdiv2.minDiameter(a, b, K));
    }

    @Test
    public void case35() {
        int[] a = { 11, 40, 23, 1, 9, 36 };
        int[] b = { 3, 20, 6, 8, 12, 25 };
        int K = 2;
        assertEquals(90, bridgebuildingdiv2.minDiameter(a, b, K));
    }

    @Test
    public void case36() {
        int[] a = { 7, 22, 13, 45, 13, 37, 17 };
        int[] b = { 28, 37, 50, 19, 20, 11, 48 };
        int K = 5;
        assertEquals(117, bridgebuildingdiv2.minDiameter(a, b, K));
    }

    @Test
    public void case37() {
        int[] a = { 50, 10, 15, 31, 20, 23, 7, 48, 5, 50 };
        int[] b = { 2, 5, 1, 8, 3, 2, 16, 11, 9, 1 };
        int K = 3;
        assertEquals(124, bridgebuildingdiv2.minDiameter(a, b, K));
    }

    @Test
    public void case38() {
        int[] a = { 2, 3, 4, 5, 6, 7, 8, 9, 1, 2 };
        int[] b = { 3, 4, 2, 1, 3, 4, 5, 2, 1, 1 };
        int K = 7;
        assertEquals(24, bridgebuildingdiv2.minDiameter(a, b, K));
    }

}
