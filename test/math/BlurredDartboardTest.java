package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class BlurredDartboardTest {
    BlurredDartboard blurreddartboard = new BlurredDartboard();

    @Test
    public void case1() {
        int[] points = { 0, 3, 4, 0, 0 };
        int P = 8;
        assertEquals(2, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case2() {
        int[] points = { 0, 0, 0, 0, 0 };
        int P = 15;
        assertEquals(5, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case3() {
        int[] points = { 4, 7, 8, 1, 3, 2, 6, 5 };
        int P = 2012;
        assertEquals(252, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case4() {
        int[] points = { 0, 0, 5, 0, 0, 0, 1, 3, 0, 0 };
        int P = 2012;
        assertEquals(307, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case5() {
        int[] points = { 0, 2, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0, 6, 0, 0, 0, 4, 0, 0, 0 };
        int P = 1000000000;
        assertEquals(84656087, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case6() {
        int[] points = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int P = 1000000000;
        assertEquals(38461550, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case7() {
        int[] points = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 };
        int P = 1000000000;
        assertEquals(37735859, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case8() {
        int[] points = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 2, 0, 3, 0, 0, 0 };
        int P = 1000000000;
        assertEquals(37037044, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case9() {
        int[] points = { 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int P = 1000000000;
        assertEquals(36363640, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case10() {
        int[] points = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 4, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0 };
        int P = 1000000000;
        assertEquals(35714290, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case11() {
        int[] points = { 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 4, 3, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0 };
        int P = 1000000000;
        assertEquals(35087727, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case12() {
        int[] points = { 6, 0, 5, 3, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0 };
        int P = 1000000000;
        assertEquals(35171870, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case13() {
        int[] points = { 0, 0, 0, 0, 0, 5, 0, 0, 3, 0, 0, 0, 8, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 1, 7 };
        int P = 1000000000;
        assertEquals(33898312, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case14() {
        int[] points = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int P = 1000000000;
        assertEquals(37450205, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case15() {
        int[] points = { 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0 };
        int P = 1000000000;
        assertEquals(36144582, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case16() {
        int[] points = { 6, 0, 0, 0, 0, 9, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 2, 0, 0, 11, 0, 0, 0, 0, 1, 0, 0, 0, 0, 4, 0, 3, 0, 10, 0, 0, 0, 0 };
        int P = 1000000000;
        assertEquals(32258067, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case17() {
        int[] points = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 12, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 2, 0, 0, 8, 0, 1, 0, 11, 0, 0, 0, 0, 0, 0, 0, 0 };
        int P = 1000000000;
        assertEquals(34539482, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case18() {
        int[] points = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 12, 1, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int P = 1000000000;
        assertEquals(37126724, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case19() {
        int[] points = { 0, 0, 0, 9, 13, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 2, 0, 0, 4, 0, 0, 1, 0, 0, 5, 10, 0, 0, 7, 0, 0, 0, 0, 0, 0, 14, 12, 0 };
        int P = 1000000000;
        assertEquals(32094600, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case20() {
        int[] points = { 0, 0, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 0 };
        int P = 1000000000;
        assertEquals(38118411, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case21() {
        int[] points = { 0, 0, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 8, 0, 0, 0, 0, 11, 15, 16, 0, 0, 1, 0, 7, 5, 0, 0, 10, 0, 3, 0, 0, 0, 9, 0, 0, 0, 0, 6, 0, 12, 0, 0, 13, 0 };
        int P = 1000000000;
        assertEquals(30621177, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case22() {
        int[] points = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 14, 0, 5, 1, 0, 8, 0, 0, 10, 7, 0, 0, 0, 0, 0, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int P = 1000000000;
        assertEquals(34941768, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case23() {
        int[] points = { 4, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 15, 17, 2, 0, 0, 0, 0, 0, 1, 9, 0, 11, 7, 0, 13, 0, 0, 0, 0, 10, 0, 8, 0, 0, 18, 0, 0, 0, 12, 6, 16 };
        int P = 1000000000;
        assertEquals(29516999, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case24() {
        int[] points = { 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16, 19, 0, 0, 0, 6, 0, 9, 15, 0, 17, 3, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0 };
        int P = 1000000000;
        assertEquals(34217280, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case25() {
        int[] points = { 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 20, 0, 0, 5, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int P = 1000000000;
        assertEquals(35685321, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case26() {
        int[] points = { 0, 0, 8, 0, 15, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 18, 0, 21, 0, 0, 0, 0, 12, 10, 0, 20, 0, 0, 0, 7, 0, 9, 1, 2, 19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 14 };
        int P = 1000000000;
        assertEquals(32345019, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case27() {
        int[] points = { 0, 0, 17, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 13, 0, 0, 0, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int P = 1000000000;
        assertEquals(37282523, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case28() {
        int[] points = { 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 23, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 18, 0, 0, 17, 22, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int P = 1000000000;
        assertEquals(36720753, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case29() {
        int[] points = { 0, 0, 16, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 18, 0, 0, 7, 0, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 12, 0, 0, 0, 3 };
        int P = 1000000000;
        assertEquals(35714287, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case30() {
        int[] points = { 12, 0, 0, 0, 0, 0, 0, 0, 15, 2, 0, 14, 20, 9, 6, 0, 0, 8, 0, 0, 0, 5, 0, 1, 0, 0, 24, 0, 25, 0, 0, 0, 0, 0, 13, 0, 23, 0, 0, 3, 0, 19, 4, 0, 0, 0, 0, 0, 7, 16 };
        int P = 1000000000;
        assertEquals(29551956, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case31() {
        int[] points = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 26, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int P = 1000000000;
        assertEquals(38461539, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case32() {
        int[] points = { 0, 0, 0, 0, 0, 22, 20, 0, 21, 0, 0, 0, 0, 0, 12, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 27, 0 };
        int P = 1000000000;
        assertEquals(36878217, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case33() {
        int[] points = { 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 18, 0, 0, 0, 0, 27, 2, 7, 0, 1, 8, 24, 0, 0, 0, 9, 0, 0, 0, 26, 0, 12, 13, 6, 0, 25, 0, 0, 0, 0, 0, 0, 0, 0, 19, 0, 0, 0, 28, 0 };
        int P = 1000000000;
        assertEquals(32850244, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case34() {
        int[] points = { 24, 0, 5, 22, 0, 0, 0, 0, 0, 17, 16, 29, 4, 6, 2, 1, 0, 19, 15, 0, 20, 0, 0, 3, 10, 0, 21, 27, 0, 8, 0, 0, 7, 0, 14, 26, 0, 13, 9, 28, 12, 11, 0, 25, 0, 0, 0, 0, 0, 23 };
        int P = 1000000000;
        assertEquals(25641027, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case35() {
        int[] points = { 25, 0, 0, 0, 0, 0, 0, 0, 14, 18, 0, 0, 0, 0, 0, 24, 12, 0, 0, 0, 26, 0, 0, 0, 0, 23, 0, 0, 0, 29, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 11, 0, 0, 0, 17, 8, 0, 2 };
        int P = 1000000000;
        assertEquals(33333334, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case36() {
        int[] points = { 0, 0, 9, 0, 0, 28, 0, 5, 0, 17, 0, 0, 16, 0, 7, 0, 0, 0, 11, 0, 31, 0, 0, 27, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 30, 0, 0, 0, 0, 0, 0 };
        int P = 1000000000;
        assertEquals(32258065, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case37() {
        int[] points = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int P = 1000000000;
        assertEquals(31250000, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case38() {
        int[] points = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 33, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int P = 1000000000;
        assertEquals(30303031, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case39() {
        int[] points = { 0, 11, 27, 0, 0, 2, 0, 21, 0, 23, 0, 0, 0, 19, 0, 0, 0, 0, 9, 17, 0, 0, 20, 0, 0, 28, 18, 0, 26, 0, 0, 0, 13, 0, 31, 0, 3, 10, 7, 34, 6, 16, 30, 0, 0, 0, 0, 0, 0, 33 };
        int P = 1000000000;
        assertEquals(29411765, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case40() {
        int[] points = { 0, 1, 35, 0, 0, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, 0, 0, 29, 0, 0, 0, 0, 0, 0, 0, 15, 31, 0, 7, 0, 0, 0, 0, 34, 0, 0, 0, 0, 0, 6, 0, 0, 20, 0, 16 };
        int P = 1000000000;
        assertEquals(28571429, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case41() {
        int[] points = { 15, 12, 0, 0, 0, 7, 0, 0, 0, 0, 23, 0, 0, 25, 0, 22, 4, 0, 0, 0, 2, 0, 0, 0, 28, 0, 0, 14, 21, 0, 0, 0, 0, 0, 31, 1, 0, 35, 0, 0, 0, 17, 26, 0, 6, 10, 0, 0, 36, 0 };
        int P = 1000000000;
        assertEquals(27777778, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case42() {
        int[] points = { 0, 0, 0, 0, 11, 4, 22, 0, 16, 34, 0, 0, 25, 2, 0, 0, 6, 0, 21, 0, 18, 0, 0, 12, 31, 0, 37, 0, 5, 0, 19, 20, 0, 17, 23, 3, 24, 9, 0, 0, 0, 0, 0, 0, 15, 27, 8, 7, 14, 30 };
        int P = 1000000000;
        assertEquals(27027028, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case43() {
        int[] points = { 8, 20, 0, 0, 0, 34, 33, 22, 38, 0, 0, 0, 1, 0, 28, 0, 12, 0, 0, 10, 29, 36, 0, 30, 25, 31, 16, 9, 17, 0, 7, 15, 0, 4, 3, 21, 24, 6, 2, 26, 0, 27, 14, 19, 18, 0, 0, 35, 5, 23 };
        int P = 1000000000;
        assertEquals(25518342, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case44() {
        int[] points = { 0, 0, 10, 28, 0, 2, 1, 4, 0, 0, 5, 0, 0, 0, 0, 30, 0, 19, 39, 0, 0, 0, 0, 0, 0, 0, 0, 0, 36, 17, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 25, 9, 0, 12, 0, 0, 0, 0, 21 };
        int P = 1000000000;
        assertEquals(25641026, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case45() {
        int[] points = { 0, 29, 0, 0, 0, 0, 20, 17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16, 36, 0, 0, 0, 28, 0, 0, 0, 0, 0, 23, 15, 31, 40, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 21, 7, 0, 6, 0, 0, 0 };
        int P = 1000000000;
        assertEquals(25000000, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case46() {
        int[] points = { 13, 0, 0, 0, 0, 28, 0, 0, 35, 0, 30, 36, 0, 0, 0, 0, 5, 0, 16, 31, 22, 18, 19, 0, 34, 3, 0, 0, 38, 0, 1, 2, 0, 0, 11, 14, 0, 41, 21, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int P = 1000000000;
        assertEquals(24390244, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case47() {
        int[] points = { 0, 0, 0, 0, 18, 0, 4, 1, 0, 11, 13, 0, 0, 0, 0, 0, 40, 0, 0, 8, 0, 28, 0, 32, 0, 0, 39, 42, 0, 0, 0, 0, 0, 0, 0, 29, 37, 0, 0, 14, 0, 0, 0, 17, 26, 0, 24, 5, 0, 0 };
        int P = 1000000000;
        assertEquals(23809524, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case48() {
        int[] points = { 29, 0, 34, 0, 0, 0, 8, 0, 28, 35, 43, 0, 6, 0, 0, 0, 0, 0, 0, 12, 0, 0, 1, 0, 0, 32, 0, 0, 0, 0, 0, 0, 42, 0, 0, 16, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0 };
        int P = 1000000000;
        assertEquals(23255814, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case49() {
        int[] points = { 29, 10, 34, 1, 9, 4, 2, 43, 12, 31, 0, 28, 24, 37, 8, 30, 35, 42, 22, 19, 0, 39, 0, 18, 27, 44, 36, 17, 25, 38, 3, 7, 33, 15, 0, 0, 16, 21, 6, 32, 41, 40, 23, 0, 13, 11, 14, 26, 5, 20 };
        int P = 1000000000;
        assertEquals(21052632, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case50() {
        int[] points = { 28, 0, 34, 0, 35, 24, 0, 36, 31, 8, 44, 16, 11, 40, 2, 45, 20, 0, 17, 14, 19, 27, 32, 41, 22, 42, 4, 26, 13, 30, 37, 33, 10, 1, 7, 9, 0, 6, 5, 3, 12, 15, 39, 43, 38, 29, 25, 18, 21, 23 };
        int P = 1000000000;
        assertEquals(20833334, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case51() {
        int[] points = { 32, 0, 0, 0, 0, 36, 0, 46, 0, 0, 24, 28, 0, 4, 0, 42, 8, 1, 0, 27, 0, 40, 0, 12, 0, 9, 0, 0, 10, 45, 0, 0, 0, 0, 0, 0, 19, 22, 0, 0, 23, 0, 43, 44, 39, 0, 0, 0, 0, 17 };
        int P = 1000000000;
        assertEquals(21739131, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case52() {
        int[] points = { 0, 0, 34, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 47, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int P = 1000000000;
        assertEquals(21276596, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case53() {
        int[] points = { 48, 0, 0, 23, 0, 15, 14, 10, 0, 39, 4, 26, 40, 1, 8, 7, 25, 45, 0, 12, 36, 0, 11, 0, 31, 17, 33, 22, 19, 0, 18, 0, 0, 28, 0, 3, 2, 0, 0, 27, 20, 35, 37, 32, 5, 13, 41, 6, 30, 46 };
        int P = 1000000000;
        assertEquals(20833334, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case54() {
        int[] points = { 44, 42, 0, 8, 34, 0, 9, 0, 25, 37, 36, 38, 0, 0, 0, 0, 48, 49, 0, 0, 28, 35, 0, 16, 12, 0, 0, 41, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 47, 3, 0, 22, 30, 0, 5, 0, 0, 0, 14 };
        int P = 1000000000;
        assertEquals(20408164, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case55() {
        int[] points = { 43, 29, 49, 26, 47, 24, 36, 35, 7, 15, 33, 27, 32, 0, 17, 10, 13, 34, 23, 4, 11, 28, 5, 8, 14, 6, 0, 48, 38, 16, 21, 19, 46, 50, 40, 0, 3, 44, 18, 37, 0, 0, 30, 45, 1, 2, 12, 22, 42, 0 };
        int P = 1000000000;
        assertEquals(20000000, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case56() {
        int[] points = { 0 };
        int P = 1000000000;
        assertEquals(1000000000, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case57() {
        int[] points = { 1 };
        int P = 1000000000;
        assertEquals(1000000000, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case58() {
        int[] points = { 0 };
        int P = 1;
        assertEquals(1, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case59() {
        int[] points = { 1 };
        int P = 1;
        assertEquals(1, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case60() {
        int[] points = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int P = 1000000000;
        assertEquals(39215693, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case61() {
        int[] points = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int P = 1;
        assertEquals(1, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case62() {
        int[] points = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int P = 1274;
        assertEquals(50, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case63() {
        int[] points = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int P = 1275;
        assertEquals(50, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case64() {
        int[] points = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int P = 1276;
        assertEquals(51, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case65() {
        int[] points = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int P = 999999399;
        assertEquals(39215675, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case66() {
        int[] points = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int P = 999999400;
        assertEquals(39215675, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case67() {
        int[] points = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int P = 999999401;
        assertEquals(39215676, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case68() {
        int[] points = { 1 };
        int P = 563581186;
        assertEquals(563581186, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case69() {
        int[] points = { 0, 1 };
        int P = 87425665;
        assertEquals(43712833, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case70() {
        int[] points = { 2, 0 };
        int P = 944054129;
        assertEquals(472027065, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case71() {
        int[] points = { 1, 2 };
        int P = 87797720;
        assertEquals(43898860, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case72() {
        int[] points = { 0, 0, 1 };
        int P = 513229179;
        assertEquals(205291672, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case73() {
        int[] points = { 2, 0, 0 };
        int P = 601121304;
        assertEquals(300560652, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case74() {
        int[] points = { 0, 2, 1 };
        int P = 473167535;
        assertEquals(157722512, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case75() {
        int[] points = { 0, 0, 3 };
        int P = 666805781;
        assertEquals(222268594, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case76() {
        int[] points = { 0, 3, 1 };
        int P = 80269260;
        assertEquals(26756420, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case77() {
        int[] points = { 1, 3, 2 };
        int P = 255270989;
        assertEquals(85090330, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case78() {
        int[] points = { 0, 1, 0, 0 };
        int P = 845087985;
        assertEquals(281695995, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case79() {
        int[] points = { 0, 0, 2, 0 };
        int P = 77795979;
        assertEquals(29173493, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case80() {
        int[] points = { 0, 2, 0, 1 };
        int P = 569775558;
        assertEquals(162793017, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case81() {
        int[] points = { 0, 0, 3, 0 };
        int P = 554542443;
        assertEquals(184847481, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case82() {
        int[] points = { 3, 0, 0, 2 };
        int P = 536933517;
        assertEquals(178977839, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case83() {
        int[] points = { 0, 3, 2, 1 };
        int P = 514580500;
        assertEquals(128645125, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case84() {
        int[] points = { 0, 0, 4, 0 };
        int P = 275440670;
        assertEquals(68860168, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case85() {
        int[] points = { 3, 0, 4, 0 };
        int P = 651657124;
        assertEquals(162914281, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case86() {
        int[] points = { 1, 4, 2, 0 };
        int P = 376133037;
        assertEquals(94033260, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case87() {
        int[] points = { 1, 2, 4, 3 };
        int P = 940920897;
        assertEquals(235230225, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case88() {
        int[] points = { 0, 0, 0, 0, 1 };
        int P = 684161130;
        assertEquals(195474609, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case89() {
        int[] points = { 0, 0, 2, 0, 0 };
        int P = 666535468;
        assertEquals(205087837, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case90() {
        int[] points = { 0, 2, 0, 1, 0 };
        int P = 885013950;
        assertEquals(221253488, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case91() {
        int[] points = { 0, 0, 0, 0, 3 };
        int P = 459635400;
        assertEquals(153211800, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case92() {
        int[] points = { 1, 0, 0, 3, 0 };
        int P = 561206549;
        assertEquals(153056332, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case93() {
        int[] points = { 3, 0, 0, 2, 1 };
        int P = 228929010;
        assertEquals(50873114, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case94() {
        int[] points = { 0, 0, 0, 0, 4 };
        int P = 676882088;
        assertEquals(169220522, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case95() {
        int[] points = { 0, 0, 1, 0, 4 };
        int P = 65059104;
        assertEquals(16264776, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case96() {
        int[] points = { 3, 4, 0, 2, 0 };
        int P = 532644667;
        assertEquals(133161167, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case97() {
        int[] points = { 3, 2, 1, 4, 0 };
        int P = 972231173;
        assertEquals(194446235, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case98() {
        int[] points = { 5, 0, 0, 0, 0 };
        int P = 597928294;
        assertEquals(119585659, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case99() {
        int[] points = { 0, 0, 5, 1, 0 };
        int P = 972190228;
        assertEquals(194438046, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case100() {
        int[] points = { 0, 2, 5, 0, 4 };
        int P = 351478570;
        assertEquals(70295714, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case101() {
        int[] points = { 4, 5, 2, 1, 0 };
        int P = 205828121;
        assertEquals(41165625, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case102() {
        int[] points = { 5, 4, 2, 1, 3 };
        int P = 567289119;
        assertEquals(113457824, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case103() {
        int[] points = { 1, 0, 0, 0, 0, 0 };
        int P = 65128891;
        assertEquals(16282224, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case104() {
        int[] points = { 2, 0, 0, 0, 0, 0 };
        int P = 558611428;
        assertEquals(147003009, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case105() {
        int[] points = { 0, 0, 1, 0, 0, 2 };
        int P = 474971039;
        assertEquals(105549120, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case106() {
        int[] points = { 0, 0, 0, 3, 0, 0 };
        int P = 201733093;
        assertEquals(56036971, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case107() {
        int[] points = { 2, 0, 0, 0, 3, 0 };
        int P = 544615267;
        assertEquals(136153817, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case108() {
        int[] points = { 0, 0, 1, 3, 2, 0 };
        int P = 476935780;
        assertEquals(95387157, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case109() {
        int[] points = { 0, 0, 0, 4, 0, 0 };
        int P = 649918996;
        assertEquals(162479749, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case110() {
        int[] points = { 4, 0, 1, 0, 0, 0 };
        int P = 890023232;
        assertEquals(222505808, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case111() {
        int[] points = { 4, 3, 1, 0, 0, 0 };
        int P = 826160356;
        assertEquals(190652390, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case112() {
        int[] points = { 2, 0, 1, 3, 0, 4 };
        int P = 719610818;
        assertEquals(130838331, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case113() {
        int[] points = { 0, 0, 0, 0, 0, 5 };
        int P = 583851505;
        assertEquals(116770301, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case114() {
        int[] points = { 5, 4, 0, 0, 0, 0 };
        int P = 918024935;
        assertEquals(183604987, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case115() {
        int[] points = { 3, 5, 0, 2, 0, 0 };
        int P = 437608485;
        assertEquals(87521697, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case116() {
        int[] points = { 0, 0, 2, 1, 4, 5 };
        int P = 278391573;
        assertEquals(55678315, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case117() {
        int[] points = { 4, 2, 3, 1, 0, 5 };
        int P = 128142266;
        assertEquals(21357045, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case118() {
        int[] points = { 0, 0, 0, 6, 0, 0 };
        int P = 46936998;
        assertEquals(7822833, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case119() {
        int[] points = { 2, 0, 0, 6, 0, 0 };
        int P = 450209604;
        assertEquals(75034934, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case120() {
        int[] points = { 0, 0, 5, 4, 6, 0 };
        int P = 782948638;
        assertEquals(130491440, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case121() {
        int[] points = { 0, 5, 3, 0, 6, 1 };
        int P = 781141158;
        assertEquals(130190193, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case122() {
        int[] points = { 1, 0, 4, 2, 3, 6 };
        int P = 738471601;
        assertEquals(123078601, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case123() {
        int[] points = { 2, 3, 5, 1, 4, 6 };
        int P = 810489392;
        assertEquals(135081566, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case124() {
        int[] points = { 9, 3, 0, 6, 0, 0, 0, 4, 0, 1, 0, 0, 2, 5, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0 };
        int P = 944054129;
        assertEquals(41045832, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case125() {
        int[] points = { 14, 18, 0, 6, 0, 0, 39, 25, 21, 0, 0, 16, 2, 9, 17, 34, 1, 0, 32, 20, 15, 0, 3, 0, 0, 0, 36, 0, 27, 13, 0, 0, 10, 0, 0, 0, 29, 0, 0, 24, 0, 0, 19, 0, 0, 30, 23 };
        int P = 794009030;
        assertEquals(20359206, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case126() {
        int[] points = { 10, 8, 0, 0, 11, 0, 0, 7, 14, 13, 4, 0, 1, 12, 16, 2, 3, 5, 0, 0, 0, 0, 0 };
        int P = 595036222;
        assertEquals(35002131, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case127() {
        int[] points = { 0, 0, 0, 29, 33, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 30, 0, 0, 16, 0, 0, 0, 0, 0, 0, 0, 0 };
        int P = 24867951;
        assertEquals(753575, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case128() {
        int[] points = { 1, 0, 0, 0, 0, 6, 0, 0, 3 };
        int P = 229291849;
        assertEquals(38215309, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case129() {
        int[] points = { 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int P = 868614591;
        assertEquals(28953820, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case130() {
        int[] points = { 2, 6, 3, 0, 5, 8, 1, 7 };
        int P = 410128334;
        assertEquals(51266042, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case131() {
        int[] points = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int P = 810489392;
        assertEquals(40874833, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case132() {
        int[] points = { 6, 0, 0, 0, 5, 0 };
        int P = 112889831;
        assertEquals(18814972, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case133() {
        int[] points = { 0, 0, 9, 11, 0, 0, 0, 8, 0, 0, 0, 0 };
        int P = 602847911;
        assertEquals(54804356, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case134() {
        int[] points = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 8, 4, 0, 5, 3, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 };
        int P = 153;
        assertEquals(13, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case135() {
        int[] points = { 0, 0, 2, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int P = 111;
        assertEquals(13, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case136() {
        int[] points = { 0, 6, 0, 0, 0, 0, 0, 0, 11, 0, 24, 0, 0, 0, 0, 0, 0, 35, 0, 0, 0, 0, 0, 0, 0, 0, 29, 14, 15, 0, 0, 38, 0, 0, 20, 0, 0, 0, 0, 0, 5, 0, 0, 0 };
        int P = 318;
        assertEquals(9, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case137() {
        int[] points = { 0, 0, 6, 0, 0, 0, 0, 0, 0 };
        int P = 64;
        assertEquals(11, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case138() {
        int[] points = { 0, 7, 0, 10, 0, 1, 4, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0 };
        int P = 41;
        assertEquals(5, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case139() {
        int[] points = { 0, 7, 5, 8, 0, 3, 6, 0, 1, 4, 0 };
        int P = 128;
        assertEquals(16, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case140() {
        int[] points = { 0, 19, 0, 0, 23, 14, 0, 2, 0, 22, 0, 0, 9, 0, 1, 21, 0, 0, 0, 0, 11, 12, 0 };
        int P = 174;
        assertEquals(8, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case141() {
        int[] points = { 0, 10, 0, 14, 16, 0, 0, 8, 0, 4, 18, 0, 0, 0, 0, 1, 15, 0, 0, 0, 5, 0, 0, 0, 0, 0, 19, 0, 0, 0, 0 };
        int P = 62;
        assertEquals(4, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case142() {
        int[] points = { 5, 0, 0, 0, 11, 0, 0, 0, 2, 0, 0, 14, 0, 10, 16, 0, 13, 0, 9, 3, 0, 0, 0, 12, 7, 17, 15, 0, 8, 6, 4 };
        int P = 357;
        assertEquals(16, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case143() {
        int[] points = { 0, 0, 0, 1 };
        int P = 14;
        assertEquals(5, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case144() {
        int[] points = { 29, 37, 26, 9, 17, 38, 42, 27, 28, 16, 5, 35, 18, 44, 10, 2, 39, 30, 13, 11, 22, 31, 19, 46, 7, 33, 36, 25, 1, 15, 47, 34, 4, 20, 49, 32, 41, 6, 8, 12, 45, 50, 23, 43, 48, 3, 40, 24, 14, 21 };
        int P = 1;
        assertEquals(1, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case145() {
        int[] points = { 46, 14, 17, 39, 13, 24, 1, 7, 48, 44, 25, 11, 31, 12, 43, 49, 3, 21, 36, 19, 16, 4, 6, 33, 47, 41, 20, 32, 23, 35, 50, 27, 34, 18, 9, 30, 8, 10, 15, 2, 28, 26, 42, 5, 45, 38, 22, 40, 37, 29 };
        int P = 1000000000;
        assertEquals(20000000, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case146() {
        int[] points = { 43, 23, 3, 39, 22, 24, 47, 21, 7, 44, 50, 12, 11, 18, 35, 4, 37, 19, 38, 16, 8, 36, 30, 27, 33, 15, 40, 9, 34, 46, 10, 5, 13, 32, 25, 49, 2, 48, 45, 20, 26, 29, 17, 14, 41, 31, 6, 42, 1, 28 };
        int P = 1274;
        assertEquals(26, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case147() {
        int[] points = { 30, 24, 47, 28, 32, 16, 27, 20, 15, 11, 18, 10, 17, 6, 36, 4, 35, 12, 23, 7, 19, 34, 48, 43, 37, 25, 2, 41, 33, 31, 13, 9, 29, 21, 42, 44, 38, 49, 50, 1, 22, 5, 3, 45, 39, 26, 40, 8, 46, 14 };
        int P = 1275;
        assertEquals(26, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case148() {
        int[] points = { 18, 10, 16, 44, 43, 37, 13, 15, 14, 39, 38, 42, 17, 46, 32, 27, 28, 50, 12, 26, 7, 25, 20, 29, 2, 45, 34, 4, 8, 41, 21, 23, 3, 11, 31, 48, 1, 5, 33, 40, 9, 49, 6, 35, 22, 19, 36, 24, 30, 47 };
        int P = 1276;
        assertEquals(26, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case149() {
        int[] points = { 45, 22, 32, 20, 14, 16, 44, 26, 2, 4, 31, 39, 35, 42, 10, 46, 43, 40, 49, 13, 36, 12, 19, 27, 48, 3, 5, 9, 47, 41, 37, 6, 1, 30, 25, 15, 38, 28, 34, 33, 24, 29, 17, 50, 11, 8, 7, 23, 21, 18 };
        int P = 999999399;
        assertEquals(19999988, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case150() {
        int[] points = { 18, 32, 38, 49, 36, 3, 22, 39, 37, 48, 9, 41, 43, 21, 2, 35, 26, 28, 33, 14, 47, 50, 7, 5, 19, 8, 40, 12, 24, 6, 11, 15, 25, 4, 13, 10, 1, 42, 16, 29, 17, 23, 44, 34, 45, 27, 30, 20, 46, 31 };
        int P = 999999400;
        assertEquals(19999988, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case151() {
        int[] points = { 28, 23, 41, 35, 7, 8, 38, 44, 45, 1, 13, 12, 25, 39, 21, 30, 47, 20, 17, 29, 24, 37, 16, 27, 42, 18, 46, 14, 26, 5, 33, 3, 31, 6, 4, 32, 48, 10, 49, 43, 19, 15, 36, 50, 34, 22, 11, 9, 2, 40 };
        int P = 999999401;
        assertEquals(19999989, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case152() {
        int[] points = { 0, 0, 0, 0, 0 };
        int P = 18;
        assertEquals(7, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case153() {
        int[] points = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int P = 1000000000;
        assertEquals(20408164, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case154() {
        int[] points = { 0, 0 };
        int P = 4;
        assertEquals(3, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case155() {
        int[] points = { 1, 2, 3 };
        int P = 6;
        assertEquals(2, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case156() {
        int[] points = { 0, 0, 0 };
        int P = 10;
        assertEquals(6, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case157() {
        int[] points = { 1, 2, 3, 4, 5, 0, 0 };
        int P = 13;
        assertEquals(2, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case158() {
        int[] points = { 0 };
        int P = 1000000000;
        assertEquals(1000000000, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case159() {
        int[] points = { 1 };
        int P = 1000000000;
        assertEquals(1000000000, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case160() {
        int[] points = { 0, 0, 0, 0, 0 };
        int P = 17;
        assertEquals(7, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case161() {
        int[] points = { 0, 0, 0, 0, 0 };
        int P = 10;
        assertEquals(4, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case162() {
        int[] points = { 0, 0, 0 };
        int P = 3;
        assertEquals(2, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case163() {
        int[] points = { 0, 2, 0, 0, 0 };
        int P = 8;
        assertEquals(3, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case164() {
        int[] points = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int P = 1000000;
        assertEquals(39228, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case165() {
        int[] points = { 0, 0, 0, 0, 0 };
        int P = 19;
        assertEquals(8, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case166() {
        int[] points = { 0, 0, 0, 0, 0 };
        int P = 16;
        assertEquals(6, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case167() {
        int[] points = { 0, 0 };
        int P = 10;
        assertEquals(7, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case168() {
        int[] points = { 0, 0, 0, 0, 0 };
        int P = 14;
        assertEquals(5, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case169() {
        int[] points = { 1, 0, 0, 0, 0, 0 };
        int P = 29;
        assertEquals(8, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case170() {
        int[] points = { 1, 0 };
        int P = 999999999;
        assertEquals(500000000, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case171() {
        int[] points = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 25, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int P = 25;
        assertEquals(1, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case172() {
        int[] points = { 0, 26, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int P = 1000000000;
        assertEquals(38461539, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case173() {
        int[] points = { 1, 25, 26, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int P = 978401222;
        assertEquals(37600047, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case174() {
        int[] points = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16, 0, 0, 0, 0, 0, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int P = 1135;
        assertEquals(46, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case175() {
        int[] points = { 2, 0, 0 };
        int P = 100000000;
        assertEquals(50000000, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case176() {
        int[] points = { 0, 0, 0, 0 };
        int P = 1;
        assertEquals(1, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case177() {
        int[] points = { 0, 1 };
        int P = 1000000000;
        assertEquals(500000000, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case178() {
        int[] points = { 1, 0, 3, 0, 5, 0, 0, 0 };
        int P = 32;
        assertEquals(6, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case179() {
        int[] points = { 0, 0 };
        int P = 5;
        assertEquals(4, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case180() {
        int[] points = { 1, 0 };
        int P = 1000000000;
        assertEquals(500000000, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case181() {
        int[] points = { 0, 0, 0 };
        int P = 7;
        assertEquals(4, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case182() {
        int[] points = { 0, 0, 0, 0, 0, 0, 0 };
        int P = 60;
        assertEquals(17, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case183() {
        int[] points = { 2, 0, 0, 0 };
        int P = 24;
        assertEquals(9, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case184() {
        int[] points = { 0, 0, 0, 0, 0, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int P = 449451686;
        assertEquals(27212896, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case185() {
        int[] points = { 0, 0 };
        int P = 2;
        assertEquals(2, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case186() {
        int[] points = { 0, 0, 0, 0, 0, 0, 0 };
        int P = 15;
        assertEquals(5, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case187() {
        int[] points = { 1, 2, 3, 4, 5, 0, 0 };
        int P = 1000000000;
        assertEquals(153846154, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case188() {
        int[] points = { 0, 0, 0 };
        int P = 9;
        assertEquals(5, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case189() {
        int[] points = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0, 0, 0, 0, 0, 0 };
        int P = 148881189;
        assertEquals(6616942, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case190() {
        int[] points = { 0, 0, 0 };
        int P = 2;
        assertEquals(2, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case191() {
        int[] points = { 1, 2, 0 };
        int P = 9;
        assertEquals(3, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case192() {
        int[] points = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10 };
        int P = 10500;
        assertEquals(998, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case193() {
        int[] points = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int P = 1000000000;
        assertEquals(39215693, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case194() {
        int[] points = { 1, 0, 0, 0, 5, 0, 0, 0, 0 };
        int P = 12345348;
        assertEquals(2215832, blurreddartboard.minThrows(points, P));
    }

    @Test
    public void case195() {
        int[] points = { 0, 2, 0, 0 };
        int P = 888888888;
        assertEquals(333333333, blurreddartboard.minThrows(points, P));
    }

}
