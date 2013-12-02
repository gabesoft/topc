package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class SumRectangleTest {
    SumRectangle sumrectangle = new SumRectangle();

    @Test
    public void case1() {
        int[] leftColumn = { 88, 18, 1 };
        int[] topRow = { 88, 57, 33, 10, 5 };
        assertEquals(18, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case2() {
        int[] leftColumn = { 0, 0, 0, 0 };
        int[] topRow = { 0, 0, 0, 0 };
        assertEquals(0, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case3() {
        int[] leftColumn = { 6, 1 };
        int[] topRow = { 6, 2 };
        assertEquals(3, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case4() {
        int[] leftColumn = { 47 };
        int[] topRow = { 47 };
        assertEquals(47, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case5() {
        int[] leftColumn = { 47, 42 };
        int[] topRow = { 47 };
        assertEquals(42, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case6() {
        int[] leftColumn = { 47 };
        int[] topRow = { 47, 42 };
        assertEquals(42, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case7() {
        int[] leftColumn = { 100, 0, 100, 0, 100, 0, 100, 0, 100, 0 };
        int[] topRow = { 100, 0, 100, 0, 100, 0, 100, 0, 100, 0 };
        assertEquals(59841700, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case8() {
        int[] leftColumn = { 0, 100, 0, 100, 0, 100, 0, 100, 0, 100 };
        int[] topRow = { 0, 100, 0, 100, 0, 100, 0, 100, 0, 100 };
        assertEquals(-86414600, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case9() {
        int[] leftColumn = { 12, 21, 21, 14, 51, 25, 26, 76, 0, 24 };
        int[] topRow = { 12, 62, 52, 35, 75, 2, 53, 35, 73, 21 };
        assertEquals(-17584335, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case10() {
        int[] leftColumn = { 12 };
        int[] topRow = { 12, 62, 52, 35, 75, 2, 53, 35, 73, 21 };
        assertEquals(21, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case11() {
        int[] leftColumn = { 12, 62, 52, 35, 75, 2, 53, 35, 73, 21 };
        int[] topRow = { 12 };
        assertEquals(21, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case12() {
        int[] leftColumn = { 0, 0, 0, 0, 0, 0 };
        int[] topRow = { 0, 0, 47, 0, 0 };
        assertEquals(-2350, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case13() {
        int[] leftColumn = { 3, 1, 4, 1, 5, 9, 2, 6, 5 };
        int[] topRow = { 3, 5, 8, 9, 7, 9, 3, 2 };
        assertEquals(706, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case14() {
        int[] leftColumn = { 0, 100, 0, 100, 0, 100, 0, 100, 0, 100 };
        int[] topRow = { 0, 100, 0, 100, 0, 100, 0, 100, 0, 100 };
        assertEquals(-86414600, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case15() {
        int[] leftColumn = { 27, 9, 3, 1 };
        int[] topRow = { 27, 9, 3, 1 };
        assertEquals(61, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case16() {
        int[] leftColumn = { 27, 9, 3, 1 };
        int[] topRow = { 27, 9, 3, 1, 3 };
        assertEquals(-119, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case17() {
        int[] leftColumn = { 100, 0, 100, 0, 97, 4, 100, 1, 100, 0 };
        int[] topRow = { 100, 10, 90, 1, 98, 4, 100, 1, 100, 3 };
        assertEquals(54439753, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case18() {
        int[] leftColumn = { 0 };
        int[] topRow = { 0 };
        assertEquals(0, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case19() {
        int[] leftColumn = { 100 };
        int[] topRow = { 100 };
        assertEquals(100, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case20() {
        int[] leftColumn = { 1, 2 };
        int[] topRow = { 1 };
        assertEquals(2, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case21() {
        int[] leftColumn = { 1 };
        int[] topRow = { 1, 100 };
        assertEquals(100, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case22() {
        int[] leftColumn = { 0, 100 };
        int[] topRow = { 0, 100 };
        assertEquals(-200, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case23() {
        int[] leftColumn = { 100, 2 };
        int[] topRow = { 100, 2, 3 };
        assertEquals(-97, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case24() {
        int[] leftColumn = { 6, 1 };
        int[] topRow = { 6, 2 };
        assertEquals(3, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case25() {
        int[] leftColumn = { 1 };
        int[] topRow = { 1 };
        assertEquals(1, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case26() {
        int[] leftColumn = { 77 };
        int[] topRow = { 77 };
        assertEquals(77, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case27() {
        int[] leftColumn = { 2 };
        int[] topRow = { 2 };
        assertEquals(2, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case28() {
        int[] leftColumn = { 0, 1 };
        int[] topRow = { 0, 1 };
        assertEquals(-2, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case29() {
        int[] leftColumn = { 5 };
        int[] topRow = { 5 };
        assertEquals(5, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case30() {
        int[] leftColumn = { 99 };
        int[] topRow = { 99 };
        assertEquals(99, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case31() {
        int[] leftColumn = { 50 };
        int[] topRow = { 50 };
        assertEquals(50, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case32() {
        int[] leftColumn = { 88, 18, 1 };
        int[] topRow = { 88, 57, 33, 10, 5 };
        assertEquals(18, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case33() {
        int[] leftColumn = { 1, 1 };
        int[] topRow = { 1, 1 };
        assertEquals(-1, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case34() {
        int[] leftColumn = { 77, 88 };
        int[] topRow = { 77 };
        assertEquals(88, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case35() {
        int[] leftColumn = { 10 };
        int[] topRow = { 10 };
        assertEquals(10, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case36() {
        int[] leftColumn = { 1 };
        int[] topRow = { 1, 2 };
        assertEquals(2, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case37() {
        int[] leftColumn = { 7 };
        int[] topRow = { 7 };
        assertEquals(7, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case38() {
        int[] leftColumn = { 6, 5, 2, 3 };
        int[] topRow = { 6 };
        assertEquals(3, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case39() {
        int[] leftColumn = { 88 };
        int[] topRow = { 88, 2 };
        assertEquals(2, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case40() {
        int[] leftColumn = { 1 };
        int[] topRow = { 1, 1, 1, 1 };
        assertEquals(1, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case41() {
        int[] leftColumn = { 3 };
        int[] topRow = { 3 };
        assertEquals(3, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case42() {
        int[] leftColumn = { 66 };
        int[] topRow = { 66 };
        assertEquals(66, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case43() {
        int[] leftColumn = { 1, 2, 3 };
        int[] topRow = { 1 };
        assertEquals(3, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case44() {
        int[] leftColumn = { 3, 2 };
        int[] topRow = { 3, 2 };
        assertEquals(-1, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case45() {
        int[] leftColumn = { 9, 0, 3, 5, 4, 3 };
        int[] topRow = { 9, 3, 9, 7, 3 };
        assertEquals(-1167, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case46() {
        int[] leftColumn = { 1 };
        int[] topRow = { 1, 6 };
        assertEquals(6, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case47() {
        int[] leftColumn = { 3, 1 };
        int[] topRow = { 3 };
        assertEquals(1, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case48() {
        int[] leftColumn = { 9 };
        int[] topRow = { 9 };
        assertEquals(9, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case49() {
        int[] leftColumn = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] topRow = { 1 };
        assertEquals(8, sumrectangle.getCorner(leftColumn, topRow));
    }

    @Test
    public void case50() {
        int[] leftColumn = { 88 };
        int[] topRow = { 88, 57 };
        assertEquals(57, sumrectangle.getCorner(leftColumn, topRow));
    }

}
