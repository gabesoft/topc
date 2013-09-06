package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class CrossingTheRiverTest {
    CrossingTheRiver crossingtheriver = new CrossingTheRiver();

    @Test
    public void case1() {
        int waterWidth = 3;
        int landWidth = 3;
        int[] blockHeight = { 3, 4, 4, 5, 5, 6 };
        int depth = 2;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case2() {
        int waterWidth = 3;
        int landWidth = 3;
        int[] blockHeight = { 3, 4, 4, 5, 6, 6 };
        int depth = 2;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case3() {
        int waterWidth = 5;
        int landWidth = 2;
        int[] blockHeight = { 4, 4, 4, 4, 4 };
        int depth = 4;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case4() {
        int waterWidth = 25;
        int landWidth = 25;
        int[] blockHeight = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49 };
        int depth = 2;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case5() {
        int waterWidth = 15;
        int landWidth = 15;
        int[] blockHeight = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 };
        int depth = 2;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case6() {
        int waterWidth = 3;
        int landWidth = 1;
        int[] blockHeight = { 3, 3, 2, 3, 2, 3 };
        int depth = 2;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case7() {
        int waterWidth = 5;
        int landWidth = 5;
        int[] blockHeight = { 5, 5, 5, 5, 5, 5, 2, 3, 4, 4, 6, 7, 3, 2 };
        int depth = 2;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case8() {
        int waterWidth = 5;
        int landWidth = 7;
        int[] blockHeight = { 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 8, 9, 10 };
        int depth = 5;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case9() {
        int waterWidth = 1;
        int landWidth = 1;
        int[] blockHeight = { 5, 3, 4 };
        int depth = 2;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case10() {
        int waterWidth = 24;
        int landWidth = 3;
        int[] blockHeight = { 16, 12, 15, 18, 14, 15, 12, 19, 13, 11, 10, 17, 19, 13, 17, 18, 88, 66, 63, 11, 19, 48, 20, 12, 74, 63, 19, 37, 20, 84, 17, 33, 17, 56, 11, 61, 17, 13, 14, 18, 44, 17, 76, 22, 26, 21 };
        int depth = 10;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case11() {
        int waterWidth = 7;
        int landWidth = 33;
        int[] blockHeight = { 21, 4, 22, 8, 7, 2, 11, 20, 14, 5, 4, 2, 4, 22, 4, 16, 22, 15, 6, 13, 4, 8, 5, 15, 5, 17, 8, 7, 16, 10, 5, 3, 12, 2, 5, 19, 6, 13, 18, 9, 19 };
        int depth = 2;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case12() {
        int waterWidth = 18;
        int landWidth = 13;
        int[] blockHeight = { 44, 26, 13, 17, 14, 17, 14, 23, 14, 80, 17, 15, 19, 23, 18, 58, 15, 22, 53, 19, 17, 31, 25, 21, 14, 54, 16, 15, 20, 18, 51, 28, 72, 22, 16, 17, 24, 15, 15, 16, 94, 15, 70 };
        int depth = 13;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case13() {
        int waterWidth = 35;
        int landWidth = 10;
        int[] blockHeight = { 19, 21, 13, 23, 17, 25, 22, 29, 14, 18, 29, 19, 20, 14, 25, 19, 27, 14, 21, 28, 15, 25, 17, 26, 25, 13, 20, 29, 13, 20, 16, 22, 20, 24, 16, 24, 13, 19, 24, 24, 14, 18, 16, 22, 21 };
        int depth = 13;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case14() {
        int waterWidth = 11;
        int landWidth = 2;
        int[] blockHeight = { 2, 2, 60, 2, 5, 5, 2, 14, 89, 4, 11, 49, 83, 31, 61, 21, 62, 5, 3, 2, 6, 18, 2, 47, 5 };
        int depth = 2;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case15() {
        int waterWidth = 15;
        int landWidth = 12;
        int[] blockHeight = { 84, 14, 75, 9, 13, 12, 46, 14, 61, 7, 11, 16, 7, 8, 9, 78, 59, 10, 14, 12, 12, 16, 80, 76, 58, 25, 15, 37, 8, 12, 84, 11, 9, 80, 50, 97, 10, 8, 15, 12, 28, 100, 18, 8, 55, 10, 9, 12, 13, 10 };
        int depth = 7;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case16() {
        int waterWidth = 21;
        int landWidth = 8;
        int[] blockHeight = { 11, 6, 9, 55, 58, 6, 22, 28, 10, 69, 10, 8, 6, 12, 9, 9, 84, 5, 10, 47, 23, 95, 7, 5, 10, 7, 10, 12, 10, 94, 10, 7, 5, 8, 12, 10, 11, 17, 5, 5, 66, 10, 5 };
        int depth = 5;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case17() {
        int waterWidth = 17;
        int landWidth = 5;
        int[] blockHeight = { 15, 17, 20, 53, 16, 17, 18, 53, 20, 16, 17, 25, 17, 19, 16, 12, 14, 82, 29, 88, 12, 15, 23, 77, 39, 61, 51, 13, 20, 24, 21, 22, 37 };
        int depth = 11;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case18() {
        int waterWidth = 13;
        int landWidth = 26;
        int[] blockHeight = { 5, 9, 41, 7, 5, 7, 8, 3, 6, 16, 16, 81, 6, 6, 17, 5, 15, 5, 13, 5, 63, 10, 14, 5, 12, 69, 5, 6, 7, 9, 64, 14, 11, 4, 7, 3, 14, 7, 13, 96, 4, 92, 33, 97, 45, 4, 55, 7, 16, 7 };
        int depth = 2;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case19() {
        int waterWidth = 17;
        int landWidth = 7;
        int[] blockHeight = { 11, 11, 13, 11, 45, 7, 8, 73, 11, 29, 11, 10, 58, 9, 10, 10, 9, 78, 52, 83, 42, 10, 80, 5, 12, 11, 11, 12, 10, 8, 20, 13, 31, 10, 84, 6 };
        int depth = 4;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case20() {
        int waterWidth = 17;
        int landWidth = 29;
        int[] blockHeight = { 20, 20, 13, 17, 14, 16, 11, 24, 20, 26, 16, 23, 25, 19, 11, 22, 18, 23, 10, 23, 12, 22, 18, 71, 20, 20, 18, 12, 14, 18, 11, 13, 10, 20, 9, 15, 12, 15, 11, 13, 17, 12, 16, 15, 21, 22, 21, 17, 12, 15 };
        int depth = 9;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case21() {
        int waterWidth = 39;
        int landWidth = 3;
        int[] blockHeight = { 10, 12, 6, 23, 16, 20, 13, 4, 10, 18, 32, 22, 21, 11, 4, 8, 10, 6, 21, 7, 17, 83, 87, 10, 10, 18, 61, 21, 4, 9, 19, 10, 10, 10, 5, 15, 13, 11, 19, 15, 34, 8, 10, 22, 53, 20, 20, 20, 14, 8 };
        int depth = 4;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case22() {
        int waterWidth = 40;
        int landWidth = 8;
        int[] blockHeight = { 7, 17, 22, 13, 18, 21, 6, 5, 16, 11, 9, 20, 7, 19, 21, 5, 16, 16, 20, 19, 19, 17, 17, 13, 19, 17, 17, 18, 9, 10, 5, 17, 22, 13, 21, 18, 18, 11, 12, 8, 6, 13, 16, 15, 21, 20, 7, 14 };
        int depth = 4;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case23() {
        int waterWidth = 7;
        int landWidth = 14;
        int[] blockHeight = { 46, 78, 44, 10, 6, 97, 11, 8, 92, 98, 20, 7, 45, 51, 81, 14, 48, 52, 17, 31, 9, 40, 59, 9, 7, 7, 9, 9, 10, 51, 10, 87, 10, 84, 6, 70, 7, 88, 10, 6, 37, 6, 11, 80, 95, 92, 7, 8 };
        int depth = 6;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case24() {
        int waterWidth = 23;
        int landWidth = 26;
        int[] blockHeight = { 6, 18, 18, 10, 16, 6, 12, 6, 6, 13, 18, 6, 13, 10, 11, 5, 8, 9, 9, 6, 13, 13, 10, 15, 6, 13, 7, 8, 6, 13, 6, 9, 6, 10, 13, 17, 6, 8, 8, 7, 8, 6, 14, 6, 6, 8, 6, 5, 6 };
        int depth = 4;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case25() {
        int waterWidth = 12;
        int landWidth = 38;
        int[] blockHeight = { 9, 10, 6, 14, 20, 23, 15, 6, 7, 24, 22, 26, 7, 19, 23, 27, 8, 4, 14, 14, 19, 12, 8, 8, 25, 15, 15, 8, 18, 7, 3, 17, 16, 10, 9, 21, 8, 13, 4, 21, 5, 12, 9, 11, 21, 6, 8, 18, 24, 9 };
        int depth = 3;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case26() {
        int waterWidth = 10;
        int landWidth = 31;
        int[] blockHeight = { 20, 15, 20, 11, 18, 5, 9, 20, 16, 7, 15, 5, 11, 7, 12, 6, 6, 14, 12, 14, 19, 11, 8, 11, 6, 14, 13, 85, 6, 62, 10, 5, 3, 17, 7, 18, 4, 12, 8, 14, 6, 11, 53, 6, 11 };
        int depth = 2;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case27() {
        int waterWidth = 36;
        int landWidth = 1;
        int[] blockHeight = { 7, 7, 8, 10, 5, 16, 4, 19, 17, 17, 14, 45, 11, 6, 4, 8, 19, 12, 5, 40, 15, 22, 5, 11, 6, 17, 10, 10, 11, 16, 5, 17, 82, 15, 9, 76, 6, 13, 19, 7, 18, 17 };
        int depth = 4;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case28() {
        int waterWidth = 25;
        int landWidth = 23;
        int[] blockHeight = { 6, 13, 21, 8, 18, 6, 25, 16, 23, 17, 21, 7, 18, 21, 22, 19, 27, 18, 15, 24, 5, 26, 18, 26, 16, 21, 12, 18, 18, 15, 12, 18, 11, 17, 15, 21, 27, 25, 10, 9, 6, 24, 21, 14, 19, 20, 14, 9 };
        int depth = 4;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case29() {
        int waterWidth = 29;
        int landWidth = 16;
        int[] blockHeight = { 16, 83, 10, 17, 13, 13, 13, 18, 11, 13, 97, 17, 14, 13, 13, 19, 18, 12, 13, 12, 17, 19, 16, 17, 63, 15, 14, 13, 17, 17, 13, 18, 16, 15, 14, 14, 19, 13, 12, 12, 13, 16, 17, 11, 17, 17, 13, 9 };
        int depth = 8;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case30() {
        int waterWidth = 2;
        int landWidth = 37;
        int[] blockHeight = { 23, 12, 2, 16, 4, 17, 20, 3, 13, 16, 7, 2, 4, 2, 5, 6, 10, 5, 19, 18, 4, 12, 4, 4, 10, 19, 21, 8, 5, 22, 12, 4, 15, 9, 11, 16, 14, 3, 14 };
        int depth = 2;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case31() {
        int waterWidth = 26;
        int landWidth = 10;
        int[] blockHeight = { 16, 19, 22, 14, 12, 11, 15, 16, 17, 10, 8, 4, 5, 21, 8, 17, 8, 13, 8, 5, 14, 5, 6, 8, 14, 7, 20, 5, 15, 13, 5, 9, 13, 10, 18, 17 };
        int depth = 4;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case32() {
        int waterWidth = 18;
        int landWidth = 5;
        int[] blockHeight = { 7, 10, 7, 8, 4, 9, 3, 12, 10, 10, 11, 8, 11, 9, 12, 9, 9, 6, 5, 9, 3, 12, 5 };
        int depth = 3;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case33() {
        int waterWidth = 20;
        int landWidth = 25;
        int[] blockHeight = { 17, 25, 24, 21, 15, 13, 23, 19, 24, 19, 20, 23, 18, 20, 25, 20, 22, 22, 24, 24, 16, 24, 17, 16, 24, 20, 14, 25, 18, 25, 19, 14, 18, 19, 13, 26, 15, 21, 15, 18, 20, 24, 13, 18, 23 };
        int depth = 12;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case34() {
        int waterWidth = 8;
        int landWidth = 1;
        int[] blockHeight = { 4, 4, 6, 6, 5, 3, 6, 7, 3 };
        int depth = 2;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case35() {
        int waterWidth = 20;
        int landWidth = 15;
        int[] blockHeight = { 10, 22, 16, 17, 10, 16, 14, 15, 21, 21, 12, 11, 16, 23, 20, 22, 16, 17, 17, 17, 22, 19, 19, 18, 19, 18, 21, 12, 13, 15, 17, 19, 12, 20, 15 };
        int depth = 9;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case36() {
        int waterWidth = 23;
        int landWidth = 20;
        int[] blockHeight = { 18, 4, 4, 10, 19, 8, 10, 14, 13, 11, 10, 20, 17, 14, 5, 13, 11, 11, 19, 11, 4, 15, 4, 4, 14, 17, 6, 12, 7, 16, 11, 10, 12, 10, 14, 9, 12, 7, 16, 14, 19, 15, 16 };
        int depth = 4;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case37() {
        int waterWidth = 24;
        int landWidth = 12;
        int[] blockHeight = { 14, 16, 8, 16, 9, 4, 16, 13, 12, 5, 16, 3, 6, 12, 16, 16, 12, 6, 7, 15, 8, 12, 9, 12, 4, 15, 13, 10, 13, 12, 16, 13, 14, 11, 17, 6 };
        int depth = 3;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case38() {
        int waterWidth = 26;
        int landWidth = 12;
        int[] blockHeight = { 20, 18, 18, 16, 14, 15, 17, 16, 22, 20, 20, 18, 18, 17, 21, 19, 13, 14, 17, 22, 13, 13, 11, 10, 14, 20, 21, 15, 20, 22, 19, 13, 15, 17, 12, 16, 16, 16 };
        int depth = 10;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case39() {
        int waterWidth = 30;
        int landWidth = 19;
        int[] blockHeight = { 30, 33, 35, 19, 23, 22, 33, 31, 24, 33, 26, 22, 19, 34, 22, 33, 30, 21, 27, 26, 23, 34, 22, 28, 25, 20, 31, 25, 22, 29, 19, 19, 32, 29, 27, 21, 20, 24, 22, 23, 29, 26, 18, 28, 24, 27, 31, 21, 25 };
        int depth = 18;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case40() {
        int waterWidth = 35;
        int landWidth = 12;
        int[] blockHeight = { 14, 15, 14, 7, 10, 9, 9, 5, 12, 12, 16, 8, 11, 19, 3, 14, 14, 9, 15, 13, 15, 13, 13, 9, 13, 18, 15, 15, 12, 15, 14, 17, 15, 14, 20, 7, 14, 14, 14, 15, 14, 11, 20, 4, 19, 6, 16 };
        int depth = 2;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case41() {
        int waterWidth = 37;
        int landWidth = 8;
        int[] blockHeight = { 4, 16, 14, 9, 19, 10, 13, 17, 17, 20, 7, 6, 18, 15, 17, 14, 17, 10, 5, 12, 17, 8, 8, 6, 16, 5, 16, 9, 18, 9, 6, 4, 5, 4, 17, 8, 8, 8, 5, 10, 19, 6, 16, 17, 11 };
        int depth = 3;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case42() {
        int waterWidth = 14;
        int landWidth = 2;
        int[] blockHeight = { 14, 11, 9, 8, 9, 8, 12, 10, 13, 10, 16, 15, 15, 14, 8, 14 };
        int depth = 7;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case43() {
        int waterWidth = 19;
        int landWidth = 14;
        int[] blockHeight = { 8, 7, 7, 7, 7, 7, 7, 8, 7, 6, 6, 6, 7, 5, 9, 5, 7, 5, 4, 6, 3, 8, 8, 8, 5, 8, 5, 5, 9, 5, 6, 7, 8 };
        int depth = 3;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case44() {
        int waterWidth = 12;
        int landWidth = 37;
        int[] blockHeight = { 27, 9, 7, 6, 20, 23, 15, 10, 21, 24, 8, 27, 7, 20, 23, 18, 20, 8, 20, 13, 5, 22, 12, 24, 20, 4, 8, 10, 25, 19, 18, 13, 16, 25, 26, 7, 11, 17, 11, 17, 14, 25, 9, 10, 17, 4, 6, 6, 26 };
        int depth = 3;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case45() {
        int waterWidth = 34;
        int landWidth = 10;
        int[] blockHeight = { 10, 18, 10, 20, 18, 15, 22, 13, 23, 25, 25, 10, 17, 24, 10, 18, 16, 22, 21, 10, 21, 18, 19, 17, 25, 27, 26, 18, 23, 12, 20, 24, 22, 16, 10, 19, 25, 17, 11, 21, 14, 14, 17, 24 };
        int depth = 10;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case46() {
        int waterWidth = 20;
        int landWidth = 9;
        int[] blockHeight = { 20, 12, 14, 23, 17, 13, 24, 17, 18, 18, 12, 17, 16, 21, 13, 15, 13, 19, 21, 18, 22, 21, 14, 24, 13, 15, 24, 18, 16 };
        int depth = 12;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case47() {
        int waterWidth = 27;
        int landWidth = 7;
        int[] blockHeight = { 16, 21, 27, 16, 17, 26, 20, 20, 19, 25, 28, 24, 29, 18, 15, 29, 23, 18, 15, 22, 23, 28, 18, 24, 20, 18, 15, 18, 30, 15, 17, 16, 19, 16 };
        int depth = 15;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case48() {
        int waterWidth = 25;
        int landWidth = 20;
        int[] blockHeight = { 20, 16, 9, 19, 15, 10, 11, 19, 17, 13, 12, 14, 14, 14, 17, 17, 20, 16, 19, 15, 23, 21, 17, 25, 18, 11, 21, 26, 27, 22, 13, 21, 27, 14, 13, 19, 17, 8, 13, 27, 18, 8, 27, 13, 24 };
        int depth = 7;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case49() {
        int waterWidth = 5;
        int landWidth = 28;
        int[] blockHeight = { 6, 13, 18, 20, 8, 11, 15, 10, 4, 10, 6, 12, 17, 20, 7, 6, 17, 8, 14, 7, 6, 17, 9, 5, 12, 12, 19, 18, 16, 9, 7, 12, 12 };
        int depth = 3;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case50() {
        int waterWidth = 10;
        int landWidth = 10;
        int[] blockHeight = { 6, 7, 6, 6, 8, 6, 6, 5, 8, 8, 7, 8, 8, 6, 7, 8, 4, 7, 4 };
        int depth = 2;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case51() {
        int waterWidth = 39;
        int landWidth = 4;
        int[] blockHeight = { 18, 22, 16, 15, 15, 8, 8, 10, 9, 20, 13, 10, 10, 9, 11, 10, 20, 17, 9, 8, 8, 15, 11, 10, 7, 14, 9, 7, 8, 9, 10, 12, 13, 10, 21, 16, 9, 8, 10, 8, 16, 19 };
        int depth = 7;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case52() {
        int waterWidth = 16;
        int landWidth = 26;
        int[] blockHeight = { 20, 23, 20, 14, 5, 6, 11, 10, 12, 19, 21, 15, 4, 11, 14, 17, 7, 11, 11, 7, 16, 20, 9, 14, 16, 23, 16, 23, 10, 13, 20, 18, 11, 8, 12, 5, 21, 22, 3, 23, 7 };
        int depth = 2;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case53() {
        int waterWidth = 19;
        int landWidth = 2;
        int[] blockHeight = { 16, 13, 21, 21, 12, 21, 20, 12, 19, 21, 12, 14, 11, 11, 11, 17, 11, 20, 11, 15 };
        int depth = 11;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case54() {
        int waterWidth = 1;
        int landWidth = 10;
        int[] blockHeight = { 8, 5, 9, 3, 3, 8 };
        int depth = 2;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case55() {
        int waterWidth = 29;
        int landWidth = 18;
        int[] blockHeight = { 11, 15, 16, 5, 11, 9, 3, 10, 15, 13, 9, 14, 11, 6, 8, 11, 12, 7, 2, 5, 10, 9, 10, 5, 10, 4, 7, 7, 12, 3, 15, 5, 7, 5, 10, 10, 10, 10, 10, 14, 7, 3, 5, 11, 4, 14 };
        int depth = 2;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case56() {
        int waterWidth = 12;
        int landWidth = 17;
        int[] blockHeight = { 14, 9, 7, 14, 10, 13, 15, 9, 8, 11, 10, 17, 12, 16, 9, 13, 14, 13, 14, 17, 12, 14, 13, 10, 17, 13, 8, 17 };
        int depth = 6;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case57() {
        int waterWidth = 15;
        int landWidth = 26;
        int[] blockHeight = { 17, 12, 3, 17, 12, 7, 9, 4, 6, 7, 2, 15, 4, 8, 17, 6, 6, 6, 19, 5, 6, 6, 3, 10, 13, 7, 5, 6, 6, 13, 14, 17, 19, 13, 14, 16, 18, 6, 14, 6 };
        int depth = 2;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case58() {
        int waterWidth = 37;
        int landWidth = 10;
        int[] blockHeight = { 21, 19, 13, 6, 19, 13, 11, 17, 11, 13, 7, 13, 11, 7, 13, 12, 13, 14, 7, 8, 16, 14, 9, 10, 7, 6, 6, 13, 15, 19, 20, 22, 24, 22, 21, 20, 5, 6, 11, 8, 18, 22, 16, 21, 18, 11 };
        int depth = 5;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case59() {
        int waterWidth = 33;
        int landWidth = 4;
        int[] blockHeight = { 14, 22, 13, 26, 28, 20, 24, 19, 13, 23, 21, 16, 27, 25, 14, 18, 27, 28, 20, 22, 16, 12, 29, 15, 12, 17, 21, 23, 13, 14, 18, 21, 18, 19, 17, 28 };
        int depth = 11;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case60() {
        int waterWidth = 17;
        int landWidth = 6;
        int[] blockHeight = { 7, 8, 11, 14, 15, 9, 12, 13, 17, 15, 10, 13, 13, 16, 13, 12, 13, 13, 11, 16, 14, 15 };
        int depth = 7;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case61() {
        int waterWidth = 12;
        int landWidth = 12;
        int[] blockHeight = { 7, 3, 5, 7, 9, 6, 3, 4, 6, 6, 4, 5, 5, 5, 3, 7, 8, 6, 9, 7, 5, 5, 3 };
        int depth = 3;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case62() {
        int waterWidth = 23;
        int landWidth = 20;
        int[] blockHeight = { 23, 18, 13, 16, 25, 13, 18, 15, 19, 23, 21, 20, 23, 21, 13, 17, 20, 17, 15, 15, 19, 15, 21, 23, 24, 13, 19, 22, 15, 15, 19, 16, 20, 17, 18, 25, 26, 12, 21, 14, 22, 20 };
        int depth = 12;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case63() {
        int waterWidth = 12;
        int landWidth = 21;
        int[] blockHeight = { 11, 6, 12, 6, 13, 10, 6, 9, 6, 6, 12, 9, 8, 7, 6, 12, 12, 5, 14, 13, 8, 7, 11, 9, 11, 8, 6, 13, 7, 6, 7, 12 };
        int depth = 4;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case64() {
        int waterWidth = 10;
        int landWidth = 36;
        int[] blockHeight = { 15, 12, 6, 12, 4, 7, 2, 12, 8, 20, 2, 12, 12, 9, 2, 14, 7, 16, 9, 18, 17, 11, 18, 2, 11, 11, 15, 8, 12, 5, 10, 12, 14, 12, 20, 12, 16, 18, 11, 13, 18, 3, 19, 15, 7 };
        int depth = 2;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case65() {
        int waterWidth = 31;
        int landWidth = 18;
        int[] blockHeight = { 12, 18, 21, 16, 22, 17, 19, 20, 19, 17, 16, 19, 10, 17, 16, 18, 16, 17, 20, 17, 20, 20, 20, 14, 17, 20, 17, 19, 21, 11, 25, 16, 21, 26, 24, 16, 20, 20, 23, 13, 20, 20, 12, 17, 15, 21, 20, 17 };
        int depth = 10;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case66() {
        int waterWidth = 25;
        int landWidth = 22;
        int[] blockHeight = { 22, 19, 17, 11, 12, 15, 10, 14, 21, 21, 16, 16, 18, 20, 14, 13, 13, 14, 8, 20, 21, 7, 13, 12, 22, 17, 7, 17, 19, 18, 16, 15, 21, 17, 17, 13, 11, 14, 11, 20, 16, 19, 18, 18, 21, 23 };
        int depth = 7;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case67() {
        int waterWidth = 10;
        int landWidth = 18;
        int[] blockHeight = { 14, 10, 16, 10, 16, 11, 12, 9, 12, 6, 16, 12, 11, 8, 12, 11, 16, 7, 10, 12, 13, 14, 9, 11, 15, 5, 5 };
        int depth = 4;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case68() {
        int waterWidth = 19;
        int landWidth = 17;
        int[] blockHeight = { 4, 12, 13, 10, 20, 13, 18, 21, 13, 17, 13, 8, 14, 20, 8, 10, 6, 10, 16, 13, 14, 21, 12, 5, 10, 11, 14, 16, 13, 19, 17, 17, 9, 15, 16 };
        int depth = 3;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case69() {
        int waterWidth = 30;
        int landWidth = 16;
        int[] blockHeight = { 21, 17, 22, 23, 23, 24, 12, 21, 10, 11, 23, 15, 20, 25, 26, 22, 13, 16, 8, 26, 22, 22, 25, 22, 20, 11, 21, 27, 19, 7, 22, 18, 9, 27, 14, 14, 25, 22, 24, 8, 20, 23, 24, 23, 27 };
        int depth = 6;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case70() {
        int waterWidth = 44;
        int landWidth = 1;
        int[] blockHeight = { 41, 62, 51, 36, 35, 40, 39, 64, 49, 60, 39, 56, 52, 44, 38, 51, 47, 48, 36, 42, 43, 55, 47, 34, 57, 65, 45, 54, 53, 63, 47, 33, 37, 34, 60, 41, 38, 35, 34, 58, 46, 59, 50, 50, 61 };
        int depth = 33;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case71() {
        int waterWidth = 49;
        int landWidth = 1;
        int[] blockHeight = { 62, 52, 49, 65, 50, 65, 40, 43, 38, 37, 66, 56, 55, 41, 42, 55, 62, 34, 40, 60, 67, 46, 66, 35, 45, 39, 57, 36, 50, 48, 55, 39, 49, 61, 53, 63, 65, 47, 64, 51, 40, 65, 35, 54, 55, 44, 56, 58, 66, 59 };
        int depth = 34;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case72() {
        int waterWidth = 46;
        int landWidth = 1;
        int[] blockHeight = { 42, 41, 62, 37, 40, 45, 64, 35, 38, 58, 45, 63, 45, 36, 62, 51, 34, 43, 54, 66, 49, 58, 42, 61, 53, 56, 50, 63, 47, 55, 60, 50, 60, 57, 52, 33, 50, 50, 39, 46, 53, 50, 65, 48, 44, 62, 59 };
        int depth = 33;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case73() {
        int waterWidth = 49;
        int landWidth = 1;
        int[] blockHeight = { 41, 61, 47, 50, 33, 43, 60, 37, 56, 43, 37, 64, 42, 34, 35, 56, 52, 54, 65, 63, 44, 39, 39, 45, 53, 38, 54, 51, 33, 39, 49, 40, 36, 48, 62, 64, 49, 55, 46, 45, 59, 58, 64, 51, 37, 57, 45, 61, 56, 41 };
        int depth = 33;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case74() {
        int waterWidth = 47;
        int landWidth = 1;
        int[] blockHeight = { 47, 48, 64, 39, 46, 36, 52, 63, 61, 37, 45, 43, 63, 38, 56, 35, 42, 47, 51, 37, 33, 63, 62, 40, 47, 34, 53, 57, 60, 63, 65, 49, 61, 59, 44, 48, 45, 57, 46, 53, 55, 41, 50, 42, 50, 58, 54, 53 };
        int depth = 33;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case75() {
        int waterWidth = 47;
        int landWidth = 3;
        int[] blockHeight = { 50, 55, 50, 49, 58, 36, 34, 41, 35, 35, 46, 40, 46, 52, 44, 39, 47, 37, 59, 49, 43, 63, 57, 54, 37, 55, 58, 39, 42, 53, 58, 48, 43, 45, 34, 56, 37, 33, 59, 62, 65, 51, 47, 61, 64, 60, 48, 34, 38, 43 };
        int depth = 33;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case76() {
        int waterWidth = 47;
        int landWidth = 3;
        int[] blockHeight = { 52, 61, 44, 34, 66, 66, 47, 33, 39, 46, 51, 66, 64, 42, 59, 38, 57, 50, 49, 65, 52, 63, 40, 51, 60, 43, 38, 58, 49, 36, 47, 35, 34, 35, 51, 53, 62, 40, 56, 45, 37, 55, 34, 34, 53, 36, 48, 54, 41, 33 };
        int depth = 33;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case77() {
        int waterWidth = 47;
        int landWidth = 1;
        int[] blockHeight = { 51, 63, 45, 35, 43, 57, 54, 64, 40, 42, 38, 46, 59, 56, 60, 55, 35, 59, 51, 36, 51, 34, 33, 43, 61, 37, 40, 48, 41, 65, 66, 49, 52, 40, 41, 58, 44, 62, 39, 63, 56, 50, 53, 64, 48, 47, 50 };
        int depth = 33;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case78() {
        int waterWidth = 47;
        int landWidth = 1;
        int[] blockHeight = { 53, 37, 39, 66, 53, 35, 56, 63, 61, 65, 50, 38, 44, 67, 48, 46, 68, 53, 35, 36, 35, 35, 66, 64, 43, 62, 51, 52, 57, 44, 58, 49, 49, 41, 45, 51, 42, 48, 40, 55, 47, 38, 34, 54, 64, 59, 60 };
        int depth = 34;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case79() {
        int waterWidth = 49;
        int landWidth = 1;
        int[] blockHeight = { 39, 37, 60, 36, 56, 43, 52, 48, 37, 70, 41, 59, 65, 49, 36, 45, 42, 51, 42, 63, 57, 42, 38, 40, 60, 67, 53, 44, 37, 62, 62, 41, 58, 59, 49, 37, 49, 46, 66, 50, 36, 61, 47, 69, 68, 42, 55, 49, 54, 64 };
        int depth = 35;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case80() {
        int waterWidth = 38;
        int landWidth = 12;
        int[] blockHeight = { 30, 30, 20, 20, 28, 25, 20, 19, 27, 23, 19, 20, 21, 33, 21, 20, 33, 17, 20, 20, 20, 22, 19, 25, 26, 20, 24, 32, 30, 22, 26, 18, 21, 29, 31, 27, 20, 21, 18, 28, 20, 25, 25, 19, 21, 19, 32, 25, 20, 17 };
        int depth = 17;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case81() {
        int waterWidth = 30;
        int landWidth = 16;
        int[] blockHeight = { 19, 25, 21, 21, 29, 19, 22, 29, 29, 20, 24, 24, 22, 27, 28, 17, 18, 33, 18, 31, 23, 26, 33, 22, 19, 22, 22, 24, 26, 24, 30, 30, 32, 24, 22, 21, 30, 28, 25, 24, 20, 26, 26, 25, 20, 23, 20 };
        int depth = 17;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case82() {
        int waterWidth = 23;
        int landWidth = 1;
        int[] blockHeight = { 23, 24, 22, 18, 15, 28, 25, 29, 21, 20, 19, 27, 26, 23, 15, 15, 17, 17, 16, 28, 18, 26, 18, 18 };
        int depth = 15;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case83() {
        int waterWidth = 23;
        int landWidth = 24;
        int[] blockHeight = { 34, 18, 21, 32, 23, 29, 27, 17, 21, 24, 34, 22, 21, 19, 22, 21, 28, 17, 26, 27, 27, 18, 30, 22, 20, 22, 25, 20, 18, 23, 31, 33, 23, 30, 25, 23, 24, 24, 34, 21, 25, 19, 21, 21, 26, 21 };
        int depth = 17;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case84() {
        int waterWidth = 32;
        int landWidth = 14;
        int[] blockHeight = { 32, 23, 18, 28, 24, 28, 25, 34, 35, 25, 36, 37, 28, 37, 27, 30, 17, 24, 31, 30, 20, 29, 19, 27, 26, 26, 22, 26, 22, 24, 28, 25, 38, 17, 27, 22, 28, 25, 16, 33, 21, 38, 28, 27, 35, 24 };
        int depth = 15;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case85() {
        int waterWidth = 34;
        int landWidth = 3;
        int[] blockHeight = { 25, 30, 27, 17, 17, 19, 27, 20, 28, 16, 22, 16, 29, 24, 27, 15, 16, 25, 25, 15, 23, 21, 22, 23, 15, 30, 17, 25, 29, 27, 27, 27, 26, 31, 18, 17, 27 };
        int depth = 15;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case86() {
        int waterWidth = 31;
        int landWidth = 6;
        int[] blockHeight = { 23, 16, 28, 29, 18, 16, 15, 24, 17, 23, 20, 19, 21, 28, 23, 23, 16, 21, 15, 27, 17, 27, 24, 26, 21, 27, 21, 19, 18, 25, 22, 15, 17, 26, 26, 26 };
        int depth = 15;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case87() {
        int waterWidth = 27;
        int landWidth = 5;
        int[] blockHeight = { 17, 27, 21, 23, 23, 26, 27, 24, 18, 21, 29, 30, 29, 26, 17, 19, 22, 27, 20, 25, 19, 27, 18, 17, 19, 20, 32, 26, 28, 19, 18, 31 };
        int depth = 16;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case88() {
        int waterWidth = 32;
        int landWidth = 15;
        int[] blockHeight = { 25, 16, 28, 21, 30, 21, 30, 28, 20, 16, 94, 25, 53, 18, 23, 27, 25, 24, 54, 21, 25, 23, 23, 18, 29, 31, 16, 30, 22, 24, 32, 21, 27, 23, 17, 20, 16, 16, 26, 30, 22, 20, 19, 19, 16, 17, 30, 21, 22, 20 };
        int depth = 16;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case89() {
        int waterWidth = 29;
        int landWidth = 2;
        int[] blockHeight = { 27, 84, 24, 21, 60, 18, 19, 22, 32, 17, 30, 99, 20, 21, 26, 25, 38, 70, 29, 29, 29, 31, 28, 31, 30, 23, 34, 70, 29, 28, 91, 25, 29, 21, 20, 26, 60, 21, 54, 16, 17 };
        int depth = 16;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case90() {
        int waterWidth = 38;
        int landWidth = 8;
        int[] blockHeight = { 34, 29, 30, 27, 22, 24, 22, 31, 20, 22, 28, 22, 18, 21, 21, 26, 22, 27, 26, 19, 22, 18, 22, 25, 31, 32, 33, 26, 26, 23, 28, 30, 24, 22, 20, 21, 27, 21, 21, 25, 27, 21, 19, 22, 35, 35 };
        int depth = 18;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case91() {
        int waterWidth = 32;
        int landWidth = 17;
        int[] blockHeight = { 9, 6, 12, 14, 20, 15, 20, 18, 9, 7, 21, 12, 11, 4, 11, 8, 9, 15, 13, 12, 17, 10, 20, 17, 15, 5, 9, 7, 20, 12, 13, 12, 13, 20, 11, 17, 15, 14, 16, 20, 16, 16, 16, 16, 21, 17, 17, 4, 19 };
        int depth = 4;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case92() {
        int waterWidth = 44;
        int landWidth = 1;
        int[] blockHeight = { 31, 22, 21, 23, 16, 18, 27, 12, 24, 23, 19, 34, 20, 30, 26, 21, 24, 35, 30, 21, 25, 30, 20, 28, 15, 28, 13, 16, 14, 13, 32, 33, 13, 29, 27, 32, 14, 14, 16, 33, 21, 21, 14, 21 };
        int depth = 11;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case93() {
        int waterWidth = 12;
        int landWidth = 37;
        int[] blockHeight = { 12, 29, 18, 17, 26, 9, 19, 23, 10, 19, 13, 14, 25, 17, 31, 9, 9, 15, 22, 12, 30, 16, 15, 16, 28, 21, 27, 8, 10, 12, 24, 11, 19, 9, 10, 14, 9, 23, 11, 9, 14, 7, 20, 25, 15, 13, 15, 9 };
        int depth = 6;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case94() {
        int waterWidth = 23;
        int landWidth = 24;
        int[] blockHeight = { 18, 19, 22, 8, 11, 3, 11, 15, 3, 20, 13, 12, 21, 4, 3, 3, 3, 12, 4, 3, 20, 10, 11, 18, 7, 6, 10, 12, 23, 5, 9, 18, 18, 13, 9, 7, 16, 11, 17, 9, 14, 3, 14, 14, 11, 21, 7 };
        int depth = 3;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case95() {
        int waterWidth = 40;
        int landWidth = 9;
        int[] blockHeight = { 12, 9, 20, 19, 6, 12, 18, 19, 22, 21, 11, 14, 21, 8, 14, 19, 20, 9, 12, 20, 15, 21, 23, 21, 21, 24, 20, 13, 24, 21, 10, 5, 21, 20, 7, 17, 11, 16, 11, 21, 9, 21, 12, 21, 21, 21, 9, 19 };
        int depth = 5;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case96() {
        int waterWidth = 2;
        int landWidth = 43;
        int[] blockHeight = { 8, 24, 25, 23, 4, 16, 22, 6, 11, 13, 12, 25, 3, 23, 13, 3, 20, 13, 25, 14, 6, 10, 12, 2, 21, 5, 15, 19, 13, 18, 9, 14, 17, 21, 4, 23, 5, 19, 20, 8, 22, 10, 6, 12, 7 };
        int depth = 2;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case97() {
        int waterWidth = 21;
        int landWidth = 29;
        int[] blockHeight = { 10, 11, 23, 12, 10, 11, 14, 23, 17, 16, 17, 24, 21, 20, 16, 10, 16, 22, 16, 15, 17, 15, 13, 15, 12, 16, 16, 11, 14, 16, 11, 19, 22, 15, 15, 9, 15, 15, 14, 14, 16, 25, 17, 18, 20, 21, 23, 13, 12, 16 };
        int depth = 9;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case98() {
        int waterWidth = 4;
        int landWidth = 44;
        int[] blockHeight = { 10, 8, 9, 7, 21, 10, 5, 3, 4, 12, 11, 17, 12, 15, 18, 6, 20, 13, 10, 4, 15, 3, 9, 16, 23, 17, 4, 5, 5, 4, 18, 14, 10, 18, 22, 4, 23, 6, 3, 6, 9, 19, 5, 7, 15, 17, 4, 16 };
        int depth = 3;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case99() {
        int waterWidth = 38;
        int landWidth = 10;
        int[] blockHeight = { 16, 27, 16, 21, 21, 24, 30, 16, 19, 27, 27, 33, 22, 22, 32, 32, 21, 29, 33, 29, 17, 20, 20, 13, 24, 25, 23, 29, 23, 22, 31, 33, 21, 28, 26, 14, 23, 23, 26, 20, 23, 22, 19, 16, 24, 18, 15, 18 };
        int depth = 13;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case100() {
        int waterWidth = 43;
        int landWidth = 7;
        int[] blockHeight = { 55, 55, 31, 38, 48, 35, 31, 32, 44, 40, 56, 52, 36, 42, 30, 48, 35, 57, 34, 35, 37, 48, 39, 57, 51, 47, 53, 46, 57, 30, 43, 45, 56, 33, 31, 32, 53, 47, 49, 30, 32, 57, 32, 50, 58, 46, 38, 51, 41, 54 };
        int depth = 29;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case101() {
        int waterWidth = 46;
        int landWidth = 4;
        int[] blockHeight = { 52, 36, 43, 56, 50, 57, 37, 53, 40, 41, 59, 30, 49, 53, 30, 32, 36, 58, 34, 37, 48, 55, 49, 44, 46, 34, 50, 54, 59, 31, 50, 41, 34, 45, 42, 51, 30, 39, 47, 57, 50, 37, 38, 31, 32, 55, 43, 35, 33, 48 };
        int depth = 29;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case102() {
        int waterWidth = 42;
        int landWidth = 6;
        int[] blockHeight = { 41, 33, 31, 45, 38, 58, 47, 32, 57, 41, 31, 33, 50, 44, 42, 53, 52, 46, 46, 31, 34, 48, 56, 39, 33, 34, 33, 56, 32, 36, 43, 49, 31, 32, 37, 55, 44, 30, 40, 35, 59, 54, 49, 58, 44, 51, 33, 46 };
        int depth = 29;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case103() {
        int waterWidth = 46;
        int landWidth = 4;
        int[] blockHeight = { 41, 35, 31, 45, 43, 36, 52, 34, 37, 56, 35, 51, 48, 55, 58, 42, 58, 41, 30, 50, 54, 48, 50, 39, 41, 38, 43, 33, 51, 44, 37, 32, 53, 47, 51, 38, 59, 37, 41, 38, 54, 31, 49, 57, 46, 40, 56, 32, 33, 51 };
        int depth = 30;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case104() {
        int waterWidth = 44;
        int landWidth = 5;
        int[] blockHeight = { 57, 38, 50, 31, 30, 55, 39, 43, 54, 44, 35, 34, 52, 56, 47, 32, 53, 37, 38, 32, 36, 43, 60, 48, 59, 39, 59, 32, 56, 60, 35, 41, 33, 39, 60, 36, 58, 49, 52, 47, 58, 31, 42, 40, 54, 46, 51, 45 };
        int depth = 30;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case105() {
        int waterWidth = 46;
        int landWidth = 2;
        int[] blockHeight = { 51, 32, 54, 55, 43, 58, 53, 48, 59, 56, 34, 31, 32, 58, 33, 45, 57, 32, 58, 41, 50, 50, 42, 59, 37, 52, 40, 38, 53, 60, 46, 44, 55, 61, 35, 49, 36, 39, 38, 57, 62, 54, 47, 51, 32, 31, 62 };
        int depth = 31;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case106() {
        int waterWidth = 45;
        int landWidth = 1;
        int[] blockHeight = { 32, 51, 40, 39, 55, 53, 58, 31, 54, 47, 59, 46, 33, 49, 42, 56, 34, 54, 59, 46, 53, 50, 48, 53, 36, 30, 43, 54, 35, 47, 37, 46, 31, 58, 61, 32, 57, 41, 38, 31, 34, 60, 45, 51, 44, 52 };
        int depth = 30;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case107() {
        int waterWidth = 43;
        int landWidth = 7;
        int[] blockHeight = { 49, 53, 42, 33, 30, 35, 60, 50, 42, 47, 44, 55, 33, 40, 31, 52, 36, 52, 54, 35, 32, 39, 31, 41, 30, 54, 56, 46, 33, 49, 43, 37, 59, 51, 31, 32, 57, 56, 54, 34, 32, 33, 35, 48, 58, 38, 45, 33, 31, 49 };
        int depth = 30;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case108() {
        int waterWidth = 47;
        int landWidth = 3;
        int[] blockHeight = { 32, 32, 38, 31, 58, 37, 32, 41, 44, 47, 44, 42, 39, 30, 40, 53, 52, 39, 32, 42, 45, 42, 50, 51, 32, 56, 39, 57, 48, 36, 55, 32, 54, 37, 30, 46, 54, 31, 31, 52, 43, 39, 42, 49, 32, 32, 34, 51, 35 };
        int depth = 29;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case109() {
        int waterWidth = 47;
        int landWidth = 3;
        int[] blockHeight = { 47, 34, 49, 49, 37, 44, 58, 37, 56, 48, 45, 50, 60, 33, 55, 51, 41, 42, 39, 41, 43, 44, 36, 54, 58, 57, 61, 51, 32, 33, 38, 59, 54, 53, 58, 38, 55, 56, 32, 40, 42, 52, 46, 38, 35, 52, 40, 33, 31 };
        int depth = 31;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case110() {
        int waterWidth = 50;
        int landWidth = 50;
        int[] blockHeight = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
        int depth = 100;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case111() {
        int waterWidth = 50;
        int landWidth = 2;
        int[] blockHeight = { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 100, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };
        int depth = 99;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case112() {
        int waterWidth = 49;
        int landWidth = 1;
        int[] blockHeight = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 4 };
        int depth = 2;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case113() {
        int waterWidth = 30;
        int landWidth = 20;
        int[] blockHeight = { 47, 47, 47, 47, 47, 47, 47, 54, 47, 47, 47, 47, 47, 47, 47, 47, 67, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47 };
        int depth = 47;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case114() {
        int waterWidth = 30;
        int landWidth = 20;
        int[] blockHeight = { 47, 47, 47, 47, 47, 47, 47, 54, 47, 47, 47, 47, 47, 47, 47, 67, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47 };
        int depth = 47;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case115() {
        int waterWidth = 30;
        int landWidth = 20;
        int[] blockHeight = { 47, 47, 47, 47, 47, 47, 47, 54, 47, 47, 47, 47, 47, 47, 47, 47, 67, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47 };
        int depth = 46;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case116() {
        int waterWidth = 40;
        int landWidth = 10;
        int[] blockHeight = { 3, 2, 3, 3, 2, 3, 3, 3, 3, 2, 3, 3, 3, 2, 3, 2, 3, 3, 3, 3, 2, 3, 3, 3, 3, 3, 3, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 3, 3, 2 };
        int depth = 2;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case117() {
        int waterWidth = 1;
        int landWidth = 1;
        int[] blockHeight = { 3, 2 };
        int depth = 2;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case118() {
        int waterWidth = 1;
        int landWidth = 1;
        int[] blockHeight = { 2, 2 };
        int depth = 2;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case119() {
        int waterWidth = 1;
        int landWidth = 1;
        int[] blockHeight = { 3, 3 };
        int depth = 2;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case120() {
        int waterWidth = 37;
        int landWidth = 13;
        int[] blockHeight = { 9, 19, 9, 23, 23, 4, 24, 11, 12, 22, 15, 10, 3, 17, 28, 26, 18, 17, 22, 20, 16, 21, 7, 18, 5, 3, 5, 6, 15, 20, 13, 7, 15, 11, 11, 19, 24, 14, 12, 10, 15, 13, 16, 5, 8, 24, 19, 4, 25, 7 };
        int depth = 2;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case121() {
        int waterWidth = 37;
        int landWidth = 12;
        int[] blockHeight = { 9, 19, 9, 23, 23, 4, 24, 11, 12, 22, 15, 10, 3, 17, 28, 26, 18, 17, 22, 20, 16, 21, 7, 18, 5, 3, 5, 6, 15, 20, 13, 7, 15, 11, 11, 19, 24, 14, 12, 10, 15, 13, 16, 5, 8, 24, 19, 4, 25, 7 };
        int depth = 2;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case122() {
        int waterWidth = 44;
        int landWidth = 7;
        int[] blockHeight = { 15, 8, 6, 10, 15, 12, 17, 7, 14, 17, 19, 16, 3, 14, 15, 5, 11, 14, 11, 3, 10, 8, 8, 9, 8, 15, 5, 3, 19, 17, 11, 18, 16, 12, 4, 13, 18, 13, 11, 10, 3, 4, 18, 6, 7, 13, 12, 10, 5, 4 };
        int depth = 3;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case123() {
        int waterWidth = 44;
        int landWidth = 6;
        int[] blockHeight = { 15, 8, 6, 10, 15, 12, 17, 7, 14, 17, 19, 16, 3, 14, 15, 5, 11, 14, 11, 3, 10, 8, 8, 9, 8, 15, 5, 3, 19, 17, 11, 18, 16, 12, 4, 13, 18, 13, 11, 10, 3, 4, 18, 6, 7, 13, 12, 10, 5, 4 };
        int depth = 3;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case124() {
        int waterWidth = 20;
        int landWidth = 31;
        int[] blockHeight = { 9, 2, 8, 11, 11, 12, 12, 3, 13, 3, 6, 14, 9, 11, 11, 13, 6, 7, 12, 12, 15, 10, 14, 9, 5, 6, 7, 6, 10, 14, 12, 8, 11, 10, 11, 11, 15, 5, 13, 4, 9, 10, 10, 4, 7, 8, 6, 13, 5, 4 };
        int depth = 2;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case125() {
        int waterWidth = 20;
        int landWidth = 31;
        int[] blockHeight = { 3, 7, 14, 5, 9, 5, 9, 14, 6, 10, 14, 8, 13, 3, 13, 15, 15, 14, 10, 7, 13, 11, 12, 10, 4, 10, 7, 14, 8, 5, 12, 11, 9, 11, 13, 9, 3, 12, 10, 8, 13, 5, 12, 4, 12, 11, 11, 6, 12, 9 };
        int depth = 3;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case126() {
        int waterWidth = 20;
        int landWidth = 30;
        int[] blockHeight = { 3, 7, 14, 5, 9, 5, 9, 14, 6, 10, 14, 8, 13, 3, 13, 15, 15, 14, 10, 7, 13, 11, 12, 10, 4, 10, 7, 14, 8, 5, 12, 11, 9, 11, 13, 9, 3, 12, 10, 8, 13, 5, 12, 4, 12, 11, 11, 6, 12, 9 };
        int depth = 3;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case127() {
        int waterWidth = 11;
        int landWidth = 34;
        int[] blockHeight = { 9, 8, 7, 11, 9, 8, 15, 8, 12, 7, 10, 5, 4, 12, 7, 8, 8, 2, 5, 9, 13, 5, 4, 5, 5, 11, 5, 5, 11, 9, 15, 13, 14, 6, 8, 13, 7, 8, 10, 3, 13, 12, 13, 15, 5, 5, 15, 9, 9, 5 };
        int depth = 2;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case128() {
        int waterWidth = 10;
        int landWidth = 36;
        int[] blockHeight = { 6, 9, 6, 9, 2, 5, 5, 9, 8, 5, 9, 3, 7, 3, 3, 6, 5, 5, 8, 5, 5, 3, 6, 4, 3, 6, 7, 9, 6, 7, 6, 2, 10, 7, 3, 3, 7, 6, 8, 7, 2, 7, 3, 3, 8, 8, 3, 3, 3, 5 };
        int depth = 2;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case129() {
        int waterWidth = 16;
        int landWidth = 29;
        int[] blockHeight = { 5, 4, 2, 5, 4, 14, 7, 12, 10, 4, 5, 13, 4, 3, 7, 11, 13, 5, 5, 7, 11, 8, 5, 13, 12, 6, 10, 8, 14, 12, 4, 14, 8, 9, 10, 8, 13, 15, 11, 5, 4, 5, 10, 8, 7, 3, 12, 5, 14, 5 };
        int depth = 2;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case130() {
        int waterWidth = 16;
        int landWidth = 30;
        int[] blockHeight = { 4, 8, 15, 2, 3, 9, 13, 4, 2, 10, 8, 14, 10, 7, 14, 15, 2, 14, 14, 7, 8, 8, 12, 4, 5, 11, 4, 13, 4, 4, 3, 4, 11, 10, 6, 2, 8, 6, 13, 3, 2, 7, 2, 9, 8, 14, 14, 4, 12, 4 };
        int depth = 2;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case131() {
        int waterWidth = 8;
        int landWidth = 39;
        int[] blockHeight = { 11, 3, 3, 10, 11, 9, 5, 12, 10, 2, 4, 6, 15, 12, 2, 15, 3, 13, 5, 14, 8, 10, 9, 5, 12, 14, 13, 3, 3, 8, 9, 7, 6, 8, 7, 6, 3, 14, 12, 8, 11, 3, 13, 3, 13, 13, 9, 6, 7, 10 };
        int depth = 2;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case132() {
        int waterWidth = 15;
        int landWidth = 36;
        int[] blockHeight = { 2, 2, 4, 2, 4, 4, 5, 3, 4, 3, 3, 5, 4, 3, 3, 3, 3, 2, 4, 2, 5, 3, 4, 4, 3, 3, 4, 3, 2, 4, 5, 2, 4, 2, 5, 5, 5, 3, 4, 5, 3, 2, 5, 4, 3, 3, 4, 4, 2, 5 };
        int depth = 2;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case133() {
        int waterWidth = 17;
        int landWidth = 36;
        int[] blockHeight = { 4, 4, 2, 3, 2, 4, 4, 3, 3, 4, 4, 2, 4, 2, 2, 2, 4, 2, 3, 3, 3, 4, 2, 4, 4, 2, 4, 3, 4, 2, 3, 3, 3, 3, 2, 2, 3, 4, 2, 3, 3, 3, 4, 2, 3, 2, 4, 3, 2, 3 };
        int depth = 2;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case134() {
        int waterWidth = 21;
        int landWidth = 35;
        int[] blockHeight = { 3, 3, 2, 3, 2, 3, 3, 2, 3, 3, 2, 2, 3, 3, 2, 2, 3, 3, 2, 2, 2, 3, 3, 2, 2, 2, 3, 2, 3, 3, 3, 3, 2, 3, 3, 3, 2, 3, 3, 3, 3, 2, 3, 2, 3, 3, 3, 3, 2, 2 };
        int depth = 2;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case135() {
        int waterWidth = 49;
        int landWidth = 1;
        int[] blockHeight = { 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 11, 11, 11, 12, 12, 12, 13, 13, 13, 14, 14, 14, 15, 15, 15, 16, 16, 16, 17, 17, 17, 18, 28 };
        int depth = 2;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case136() {
        int waterWidth = 35;
        int landWidth = 1;
        int[] blockHeight = { 49, 49, 50, 50, 51, 51, 52, 52, 53, 53, 54, 54, 55, 55, 56, 56, 57, 57, 58, 58, 59, 59, 60, 60, 61, 61, 62, 62, 63, 63, 64, 64, 65, 65, 66, 66, 67, 67, 68, 68, 69, 69, 70, 70, 71, 71, 72, 72, 73, 73 };
        int depth = 49;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case137() {
        int waterWidth = 6;
        int landWidth = 4;
        int[] blockHeight = { 3, 3, 3, 3, 3, 4, 5, 5, 5, 5 };
        int depth = 3;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case138() {
        int waterWidth = 1;
        int landWidth = 1;
        int[] blockHeight = { 3, 3 };
        int depth = 2;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case139() {
        int waterWidth = 5;
        int landWidth = 5;
        int[] blockHeight = { 3, 4, 5, 5, 5, 5, 5, 5, 6, 7 };
        int depth = 3;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case140() {
        int waterWidth = 1;
        int landWidth = 10;
        int[] blockHeight = { 2, 15 };
        int depth = 2;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case141() {
        int waterWidth = 13;
        int landWidth = 26;
        int[] blockHeight = { 18, 13, 22, 14, 33, 25, 10, 36, 15, 29, 21, 30, 35, 31, 24, 26, 17, 18, 20, 12, 37, 10, 28, 11, 11, 16, 19, 37, 38, 15, 18, 19, 12, 34, 27, 23, 30, 19, 22, 22, 13, 17, 16, 36, 18, 13, 15, 14, 32, 17 };
        int depth = 10;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case142() {
        int waterWidth = 4;
        int landWidth = 5;
        int[] blockHeight = { 70, 71, 72, 73, 70, 71, 72, 73, 74, 75 };
        int depth = 70;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case143() {
        int waterWidth = 3;
        int landWidth = 1;
        int[] blockHeight = { 2, 3, 4, 5 };
        int depth = 2;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case144() {
        int waterWidth = 5;
        int landWidth = 3;
        int[] blockHeight = { 3, 3, 4, 5, 6, 5, 6, 7 };
        int depth = 2;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case145() {
        int waterWidth = 50;
        int landWidth = 50;
        int[] blockHeight = { 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };
        int depth = 2;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case146() {
        int waterWidth = 3;
        int landWidth = 2;
        int[] blockHeight = { 3, 4, 4, 5, 6 };
        int depth = 3;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case147() {
        int waterWidth = 5;
        int landWidth = 4;
        int[] blockHeight = { 6, 8, 4, 8, 8, 7, 7, 6, 8, 4, 4, 5 };
        int depth = 4;
        assertEquals("IMPOSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case148() {
        int waterWidth = 4;
        int landWidth = 4;
        int[] blockHeight = { 4, 4, 4, 4, 7, 10 };
        int depth = 4;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

    @Test
    public void case149() {
        int waterWidth = 1;
        int landWidth = 1;
        int[] blockHeight = { 3, 2, 50 };
        int depth = 2;
        assertEquals("POSSIBLE", crossingtheriver.isItEvenPossible(waterWidth, landWidth, blockHeight, depth));
    }

}
