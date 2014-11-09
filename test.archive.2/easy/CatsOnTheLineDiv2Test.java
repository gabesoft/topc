package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class CatsOnTheLineDiv2Test {
    CatsOnTheLineDiv2 catsonthelinediv2 = new CatsOnTheLineDiv2();

    @Test
    public void case1() {
        int[] position = { 0 };
        int[] count = { 7 };
        int time = 3;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case2() {
        int[] position = { 0 };
        int[] count = { 8 };
        int time = 2;
        assertEquals("Impossible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case3() {
        int[] position = { 0, 1 };
        int[] count = { 3, 1 };
        int time = 0;
        assertEquals("Impossible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case4() {
        int[] position = { 5, 0, 2 };
        int[] count = { 2, 3, 5 };
        int time = 2;
        assertEquals("Impossible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case5() {
        int[] position = { 5, 1, -10, 7, 12, 2, 10, 20 };
        int[] count = { 3, 4, 2, 7, 1, 4, 3, 4 };
        int time = 6;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case6() {
        int[] position = { 1000 };
        int[] count = { 1 };
        int time = 0;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case7() {
        int[] position = { -1000, 1000 };
        int[] count = { 1000, 1000 };
        int time = 1000;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case8() {
        int[] position = { 0, 4, 8 };
        int[] count = { 5, 7, 1 };
        int time = 3;
        assertEquals("Impossible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case9() {
        int[] position = { 0 };
        int[] count = { 7 };
        int time = 3;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case10() {
        int[] position = { 5, 0, 2 };
        int[] count = { 2, 3, 5 };
        int time = 2;
        assertEquals("Impossible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case11() {
        int[] position = { 5, 1, -10, 7, 12, 2, 10, 20 };
        int[] count = { 3, 4, 2, 7, 1, 4, 3, 4 };
        int time = 6;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case12() {
        int[] position = { -1000, -999 };
        int[] count = { 1000, 1000 };
        int time = 999;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case13() {
        int[] position = { 2, 3 };
        int[] count = { 100, 1 };
        int time = 2;
        assertEquals("Impossible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case14() {
        int[] position = { 2, 3, 4 };
        int[] count = { 1, 7, 1 };
        int time = 3;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case15() {
        int[] position = { -1000 };
        int[] count = { 5 };
        int time = 3;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case16() {
        int[] position = { 3, 5, 10 };
        int[] count = { 8, 6, 8 };
        int time = 7;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case17() {
        int[] position = { 2, 3, 6 };
        int[] count = { 8, 7, 8 };
        int time = 12;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case18() {
        int[] position = { 0, 10 };
        int[] count = { 5, 5 };
        int time = 5;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case19() {
        int[] position = { -1000, 0, 1000 };
        int[] count = { 1000, 1000, 1000 };
        int time = 1000;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case20() {
        int[] position = { 0, 10 };
        int[] count = { 1, 10 };
        int time = 3;
        assertEquals("Impossible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case21() {
        int[] position = { -1000 };
        int[] count = { 1000 };
        int time = 1000;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case22() {
        int[] position = { 0 };
        int[] count = { 1 };
        int time = 1000;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case23() {
        int[] position = { -1000, -800, 0, 800, 1000 };
        int[] count = { 500, 500, 500, 500, 500 };
        int time = 1000;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case24() {
        int[] position = { 0 };
        int[] count = { 8 };
        int time = 2;
        assertEquals("Impossible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case25() {
        int[] position = { 1 };
        int[] count = { 3 };
        int time = 1;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case26() {
        int[] position = { 0 };
        int[] count = { 1 };
        int time = 100;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case27() {
        int[] position = { 0, 1, 2 };
        int[] count = { 1, 5, 1 };
        int time = 99;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case28() {
        int[] position = { -1000, -998 };
        int[] count = { 3, 3 };
        int time = 1;
        assertEquals("Impossible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case29() {
        int[] position = { -1000, -998 };
        int[] count = { 5, 3 };
        int time = 5;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case30() {
        int[] position = { -1000, 0, 1000 };
        int[] count = { 1, 1000, 1 };
        int time = 1;
        assertEquals("Impossible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case31() {
        int[] position = { -1000, -999 };
        int[] count = { 10, 10 };
        int time = 20;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case32() {
        int[] position = { 1 };
        int[] count = { 1 };
        int time = 0;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case33() {
        int[] position = { 0, 5 };
        int[] count = { 1, 2 };
        int time = 0;
        assertEquals("Impossible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case34() {
        int[] position = { 1, 201 };
        int[] count = { 100, 1 };
        int time = 1;
        assertEquals("Impossible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case35() {
        int[] position = { -1000, 10, 1000 };
        int[] count = { 1000, 1000, 10 };
        int time = 500;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case36() {
        int[] position = { 0, 2 };
        int[] count = { 5, 3 };
        int time = 3;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case37() {
        int[] position = { 4, 5 };
        int[] count = { 9, 9 };
        int time = 6;
        assertEquals("Impossible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case38() {
        int[] position = { 0, 500 };
        int[] count = { 7, 5 };
        int time = 2;
        assertEquals("Impossible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case39() {
        int[] position = { -5, 0, 2 };
        int[] count = { 5, 2, 21 };
        int time = 10;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case40() {
        int[] position = { -100, -200, -300, -400 };
        int[] count = { 1, 1, 1, 4 };
        int time = 1;
        assertEquals("Impossible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case41() {
        int[] position = { -10 };
        int[] count = { 1 };
        int time = 10;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case42() {
        int[] position = { -1000, -999 };
        int[] count = { 100, 102 };
        int time = 100;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case43() {
        int[] position = { -1000, -999, -998, 999, 1000 };
        int[] count = { 1000, 5, 5, 600, 1000 };
        int time = 1000;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case44() {
        int[] position = { 3, 4 };
        int[] count = { 10, 10 };
        int time = 7;
        assertEquals("Impossible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case45() {
        int[] position = { 0, 1, 2 };
        int[] count = { 100, 100, 100 };
        int time = 1000;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case46() {
        int[] position = { 27, -79, -93, 0, 37, 42, 1, 26, 41, -34, -53, 22, 62, 52, 72, -83, 25, 18, 44, -87, -21, -4, -20, -74, 60, -88, 83, -71, 53, 32, 47, 48, 85, -39, 33, 13, 93, -94, -70, 87, -61, 39 };
        int[] count = { 3, 2, 3, 3, 2, 3, 1, 2, 2, 3, 3, 1, 2, 1, 3, 3, 2, 1, 2, 1, 2, 1, 2, 2, 2, 1, 3, 2, 1, 3, 2, 1, 1, 1, 2, 2, 1, 3, 2, 1, 3, 1 };
        int time = 24;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case47() {
        int[] position = { 2, 98, 34, 89, -47, 59, -1, -69, 21, 12, 49, 82, -5, 7, 55 };
        int[] count = { 2, 3, 6, 6, 2, 1, 1, 1, 2, 5, 3, 5, 5, 3, 4 };
        int time = 51;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case48() {
        int[] position = { -55, 29, -34, -22, -40, 69, -38, -88, -33, 1, 28, -37, -66, 94, 31, -82, -17, 87, 21, 68 };
        int[] count = { 6, 7, 2, 1, 6, 3, 5, 6, 5, 7, 2, 1, 7, 7, 7, 2, 7, 4, 1, 3 };
        int time = 67;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case49() {
        int[] position = { 16, -26, -17, -11, -40, -48, -1, -52, 68, 48, 21, -97, 41, -39, -22, -64, -88, -33, 47, -62, 17, -21, 92, 33, 74, 37, 57 };
        int[] count = { 1, 4, 3, 3, 1, 2, 3, 1, 3, 3, 3, 4, 2, 3, 1, 2, 3, 4, 4, 3, 1, 4, 3, 3, 2, 1, 1 };
        int time = 39;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case50() {
        int[] position = { -83, 27, 95, -27, 15, -57, 23, -44, 32, -89, -79, 10, -31, 79, -47, 61, -93, 89, 8, 50, -35, 40, -76 };
        int[] count = { 4, 1, 4, 4, 2, 3, 1, 4, 3, 4, 4, 2, 2, 1, 2, 2, 3, 2, 3, 2, 3, 1, 4 };
        int time = 31;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case51() {
        int[] position = { 96, -67, -29, 35, 74, -98, 79, 36, -21, 3, 32, -43, -30, 73, 2, 87, -89, -63, -52, 48, 42, 10, -74 };
        int[] count = { 6, 6, 6, 5, 5, 3, 4, 2, 4, 1, 6, 3, 6, 6, 5, 1, 2, 6, 1, 1, 4, 2, 1 };
        int time = 28;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case52() {
        int[] position = { 64, 35, 2, -3, -89, -24, 98, 57, -48, 65, 14, 56, 54, 21, -34, -37, 76, 24, -32, 44, -85, 72, 31, 26, -67, -86, 82, -7, -98, -19, 36, -44, -20, 58, 69, 63, 78, -76 };
        int[] count = { 4, 2, 4, 5, 1, 4, 4, 5, 1, 6, 1, 2, 5, 5, 4, 1, 1, 2, 1, 5, 4, 6, 6, 1, 2, 5, 3, 6, 2, 3, 6, 6, 1, 2, 1, 6, 2, 5 };
        int time = 27;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case53() {
        int[] position = { -29, 80, 49, 32, 39, 91, 66, 7, 63, 0, 26, -53, -18, 84, 62, 21, -84, -14 };
        int[] count = { 2, 14, 3, 14, 12, 8, 16, 17, 14, 15, 19, 20, 7, 13, 10, 5, 17, 16 };
        int time = 96;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case54() {
        int[] position = { -61, -19, -43, 66, -45, -35, -52, 96, 0, 23, 44, 85, 24, 13, -29, -70, 75, -87, 46, -86, 64, -94, 56, -95, 12, -2, -83, 90, -32, 22, -85, -8, -50, -14, -33, 11, 29, -67, -91, -68, 25, -79 };
        int[] count = { 5, 3, 9, 3, 8, 6, 6, 4, 3, 8, 7, 9, 4, 6, 4, 6, 9, 4, 5, 5, 4, 3, 9, 7, 6, 5, 9, 2, 5, 4, 6, 1, 4, 8, 4, 3, 9, 5, 7, 4, 8, 3 };
        int time = 40;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case55() {
        int[] position = { -95, 43, -80, 28, -44, 57, -99, -98, -37, 22, 30, -83, 26, 98, -85, -62, 1, 8, 73, -93, -84, 9, 81, 37, 60, -31, -8, 45, -15, -58, -27, 29 };
        int[] count = { 15, 1, 3, 1, 16, 19, 7, 9, 7, 6, 19, 15, 6, 2, 17, 2, 15, 12, 12, 12, 16, 16, 20, 4, 11, 9, 16, 13, 2, 18, 16, 12 };
        int time = 97;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case56() {
        int[] position = { 72, 31, -32, 90, -14, 52, 64, 25, 15, 91, 58, -16, 85, 36, -97, 46, 74, -4, -42, -92, -75, 28, 83, 69, -23 };
        int[] count = { 4, 19, 3, 26, 6, 1, 14, 20, 21, 27, 2, 26, 2, 22, 2, 22, 23, 7, 13, 22, 12, 10, 5, 15, 21 };
        int time = 52;
        assertEquals("Impossible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case57() {
        int[] position = { 40, -12, 79, 86, -25, 47, 9, 31, -65, 50, 49, 12, 43, -40, -8, 81, 6, 2, -32, 13, -51, 37, -87, -92, -1, -37, -83 };
        int[] count = { 22, 4, 44, 31, 31, 32, 11, 20, 19, 45, 23, 41, 36, 44, 10, 34, 17, 20, 22, 13, 45, 1, 17, 34, 35, 16, 1 };
        int time = 88;
        assertEquals("Impossible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case58() {
        int[] position = { 5, -70, -93, -81, 78, 11, -92, 2, 75, -39, 69, 13, -53, -74, -33, -65, 38, -9, 34, 59, 16, 41, -15, -43, -38, 80, 97, -27, 76, -17, -98, 94, -32, 93, 45, 19, -36, 21, -77, -41, 58, -37, 68, -95, 39, 9, -58 };
        int[] count = { 2, 10, 23, 21, 8, 43, 37, 2, 44, 8, 35, 2, 12, 24, 10, 4, 44, 42, 4, 21, 15, 22, 13, 25, 20, 11, 36, 18, 32, 15, 31, 8, 23, 10, 43, 24, 1, 43, 42, 3, 15, 14, 13, 18, 24, 24, 41 };
        int time = 87;
        assertEquals("Impossible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case59() {
        int[] position = { 69, 20, 71, 23, 15, 79, -57, 50, 80, 88, 29, 82, -15, 72, -24, -60, -8, 46, -64, -77, -88, 68, 60, -70, -85, 27, -65, 85, 31, -52, 38, 1, -50, -59, 63, -79, 93, 34, 26, -39 };
        int[] count = { 19, 12, 3, 14, 28, 16, 25, 17, 6, 23, 23, 9, 25, 10, 1, 18, 8, 10, 10, 4, 27, 1, 19, 2, 9, 21, 18, 3, 18, 10, 23, 1, 8, 19, 30, 29, 24, 13, 6, 3 };
        int time = 59;
        assertEquals("Impossible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case60() {
        int[] position = { -13, 12, 72, 54, 69, -63, 89, 75, 98, -48, 45, -96, 58, 37, 86 };
        int[] count = { 7, 8, 6, 6, 1, 4, 2, 3, 2, 5, 7, 2, 8, 3, 2 };
        int time = 16;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case61() {
        int[] position = { 93, -75, -77, -56, -55, -8, -81, -60, -80, -35, -17, -85, -97, 22, 57, -47, 90, -34, -71, -68, -30 };
        int[] count = { 3, 26, 20, 21, 27, 28, 22, 31, 1, 6, 31, 10, 11, 7, 17, 10, 28, 6, 20, 28, 32 };
        int time = 63;
        assertEquals("Impossible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case62() {
        int[] position = { -89, 71, 19, 17, 51, 54, -93, -15, 30, -6, -51, -41, -86, 57, 68, 18, -53, 76, 60, -78, -1, 33, 64, 42, -72, 95, -37, 66, -79, 75, 78, 37, 31, -23, -62, -61, -26, -65, 2, -66, 8, 38, 93, 53, -12 };
        int[] count = { 8, 7, 11, 3, 32, 2, 16, 3, 34, 31, 6, 29, 32, 8, 5, 27, 19, 32, 9, 24, 34, 25, 7, 19, 17, 4, 10, 23, 34, 12, 30, 8, 18, 5, 19, 3, 32, 10, 7, 11, 13, 1, 11, 29, 19 };
        int time = 66;
        assertEquals("Impossible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case63() {
        int[] position = { -18, 42, -47, 10, -88, -90, -43, 16, -11, -89, 36, -56, -21, -86, 92 };
        int[] count = { 9, 1, 9, 10, 7, 7, 5, 2, 4, 10, 3, 7, 9, 5, 6 };
        int time = 21;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case64() {
        int[] position = { 82, -51, 71, -85, 63, -3, 70, -62, 43, 40, 23, 86, -11, 17, -55, -14, -83, 7 };
        int[] count = { 7, 3, 1, 3, 5, 5, 7, 2, 1, 8, 2, 1, 4, 6, 1, 3, 6, 1 };
        int time = 17;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case65() {
        int[] position = { 75, 48, 17, -25, 71, -70, 68, -14, 31, 58, 28, -17, -86, 46, -23, -18, 0, -74, -83, -44, -30, 76, 40, 83, 54 };
        int[] count = { 1, 4, 3, 1, 5, 2, 1, 5, 2, 1, 5, 3, 2, 4, 4, 2, 1, 1, 2, 5, 3, 1, 5, 1, 5 };
        int time = 8;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case66() {
        int[] position = { 612, 17, 557, -212, 318, 30, -890, 521, 874, -210, -415, -720, -707, -164, -928, -770, 553, 725, -772, 622, 413, -398, -622, -173, -201, 852, -524, -25, 530, -548, 158, -911, -239, 296, 656, -960, 211, -930, -958, 682, -998, -360, 858, -454, 284, -607, 225, 220, -662, 640 };
        int[] count = { 17, 23, 10, 3, 17, 6, 21, 9, 25, 16, 2, 15, 7, 11, 15, 2, 25, 2, 25, 16, 18, 26, 12, 13, 14, 6, 10, 6, 23, 5, 17, 14, 5, 18, 9, 5, 5, 17, 5, 17, 4, 16, 21, 12, 25, 13, 27, 25, 18, 23 };
        int time = 520;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case67() {
        int[] position = { 45, -571, 225, -473, 264, -118, 255, -457, -699, -454, -338, 431, 376, -429, -423, -386, -518, -898, 857, 843, 245, 645, 334, -505, 100, 375, -527, -627, -638, 729, 825, -37, -225, -255, -737, 741, 799, -145, 897, 992, -92, -123, -795, -829, -819, -926, -579, 9, 205, 218 };
        int[] count = { 1, 4, 47, 17, 15, 11, 4, 31, 45, 42, 47, 46, 2, 3, 48, 48, 35, 24, 8, 29, 15, 22, 10, 6, 7, 34, 29, 17, 18, 18, 4, 22, 48, 8, 26, 21, 36, 6, 25, 44, 18, 6, 45, 12, 16, 12, 46, 7, 6, 44 };
        int time = 941;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case68() {
        int[] position = { 767, 758, -789, -411, -263, 319, 479, -309, 14, 408, 845, 79, -753, -795, -191, 735, -941, -220, -455, -286, 558, 616, -9, 770, -14, -144, -100, 552, 759, -596, -469, 573, -573, -678, 314, -962, -667, 480, -797, -958, 557, 315, -710, -248, 621, 627, -32, -399, -586, 357 };
        int[] count = { 21, 2, 23, 13, 2, 22, 6, 5, 6, 2, 3, 5, 12, 14, 22, 10, 8, 4, 17, 25, 4, 21, 25, 12, 18, 17, 24, 14, 22, 16, 2, 7, 20, 21, 22, 10, 19, 13, 15, 15, 8, 15, 11, 16, 17, 15, 14, 7, 24, 19 };
        int time = 483;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case69() {
        int[] position = { 597, -666, 93, 388, 227, -838, -454, 689, 348, 353, -581, -966, -690, -44, 478, 381, 641, -758, -312, 881, -252, -504, 454, -72, -63, -833, 885, -233, -296, 77, 186, -38, 916, 889, -664, 66, -757, -852, 685, -566, 878, 524, 797, -721, -345, 315, 47, 940, -444, -999 };
        int[] count = { 29, 27, 12, 25, 6, 34, 4, 36, 35, 21, 29, 29, 23, 1, 6, 28, 15, 23, 25, 31, 9, 2, 8, 18, 45, 28, 25, 23, 32, 35, 37, 18, 28, 35, 12, 35, 32, 31, 6, 13, 34, 38, 3, 24, 4, 36, 6, 5, 39, 35 };
        int time = 886;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case70() {
        int[] position = { 936, -696, -16, 384, -498, -527, -85, 892, -306, -928, 747, 457, 689, -32, 615, -791, 541, 769, -544, -189, -427, 949, -162, -230, 614, -375, -782, -875, -216, -248, -932, -955, -907, -267, -64, 341, -617, 880, 241, -727, -352, -426, 998, 990, -400, 232, 250, 680, -93, 934 };
        int[] count = { 4, 6, 6, 2, 2, 1, 6, 7, 7, 2, 2, 3, 1, 3, 5, 4, 1, 4, 7, 1, 4, 5, 7, 1, 5, 4, 2, 6, 7, 5, 3, 2, 3, 1, 7, 6, 1, 7, 1, 6, 5, 7, 3, 6, 3, 7, 1, 4, 6, 6 };
        int time = 130;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case71() {
        int[] position = { -180, -946, 513, -779, 662, -666, 635, 285, 476, 509, -178, 579, -854, 911, 921, -159, 915, -429, -155, 826, -965, 315, -708, 354, 231, -995, -46, -77, -121, 251, -262, -6, -617, -943, -51, -35, 422, -291, -539, -702, -973, 371, -15, -499, 776, -96, -912, 994, 151, -835 };
        int[] count = { 24, 2, 4, 56, 8, 8, 35, 44, 32, 56, 8, 45, 73, 3, 35, 45, 31, 22, 22, 59, 47, 75, 27, 32, 66, 67, 29, 15, 67, 58, 44, 33, 73, 54, 63, 64, 37, 22, 33, 3, 25, 74, 31, 20, 19, 40, 20, 4, 60, 29 };
        int time = 784;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case72() {
        int[] position = { 795, 460, -305, -271, 51, -897, 736, 461, -453, 39, 239, 744, 835, -598, 794, 501, -886, -816, -416, 881, 709, -828, 288, 848, 41, 705, 417, 26, 452, -137, -159, -685, 495, 544, 556, 447, -708, -352, 137, -436, 128, 467, -54, -735, -408, 151, -909, 937, -171, 32 };
        int[] count = { 20, 5, 20, 14, 21, 12, 20, 8, 7, 17, 2, 21, 5, 23, 24, 3, 20, 16, 24, 12, 4, 24, 18, 16, 2, 14, 7, 20, 5, 23, 22, 9, 19, 15, 11, 18, 11, 19, 15, 8, 15, 9, 4, 8, 4, 8, 4, 8, 15, 18 };
        int time = 245;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case73() {
        int[] position = { -864, -180, -236, -411, 930, -297, 913, 546, 313, -958, -594, 152, -835, 812, -584, 751, 736, -504, -959, -705, 143, 341, -476, 58, 70, 884, 151, 570, 416, 371, -353, 296, -294, -124, 88, -237, -847, -879, -697, -893, -819, -597, -773, 740, -535, -868, -737, 705, -547, -969 };
        int[] count = { 41, 12, 4, 47, 10, 31, 39, 13, 36, 6, 17, 27, 22, 15, 42, 37, 43, 44, 25, 5, 16, 31, 44, 10, 24, 1, 2, 41, 11, 7, 29, 40, 45, 4, 6, 14, 35, 37, 24, 26, 27, 38, 35, 30, 45, 11, 46, 34, 29, 40 };
        int time = 489;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case74() {
        int[] position = { 971, 679, 203, 61, -406, 110, 134, 362, -156, -573, -101, -790, 856, 625, -960, 950, 724, 71, -883, 484, 875, 81, -343, -590, 663, -289, 566, -764, -350, 928, 126, -434, -678, -427, -424, -214, 451, 530, -315, 833, -250, 938, 651, -589, 665, 804, 705, 284, -467, -961 };
        int[] count = { 7, 6, 25, 18, 4, 40, 4, 40, 37, 29, 27, 23, 2, 4, 1, 8, 37, 20, 17, 13, 19, 28, 38, 26, 3, 17, 37, 9, 40, 21, 9, 27, 10, 24, 2, 22, 12, 35, 3, 22, 9, 11, 4, 29, 3, 31, 20, 15, 21, 30 };
        int time = 391;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case75() {
        int[] position = { -116, -13, -207, -507, 359, -819, -499, 836, -431, -93, -320, 387, 606, 975, -351, -569, -717, -925, -973, -396, -49, -822, 86, 904, -731, -996, -808, 138, -115, -694, 218, -337, -493, 571, -546, 681, -541, 872, 353, -730, -435, 791, -20, 64, -667, -724, -190, -112, -81, 140 };
        int[] count = { 22, 9, 29, 12, 1, 2, 7, 34, 10, 1, 20, 24, 5, 25, 33, 14, 15, 31, 18, 35, 19, 19, 34, 11, 15, 18, 13, 25, 3, 5, 13, 15, 32, 34, 9, 15, 13, 31, 34, 27, 19, 24, 8, 30, 29, 22, 28, 26, 4, 8 };
        int time = 343;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case76() {
        int[] position = { 665, -976, -307, 331, 649, -337, -914, -281, -367, 801, 411, -760, -698, 671, -86, -88, -395, 432, -951, 239, 830, 192, 885, -398, -934, 30, -689, 173, -279, 981, -332, 394, -111, 824, 879, -221, 308, -579, -942, 566, -738, -723, 186, 933, -534, -964, 873, -842, 3, 459 };
        int[] count = { 63, 57, 24, 17, 28, 10, 10, 59, 64, 60, 23, 59, 6, 51, 18, 20, 24, 30, 28, 16, 42, 72, 20, 6, 56, 56, 44, 15, 26, 27, 50, 68, 60, 17, 19, 43, 17, 25, 46, 62, 13, 43, 42, 30, 55, 33, 38, 9, 22, 67 };
        int time = 356;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case77() {
        int[] position = { 978, 553, 421, 197, 868, -11, -273, 255, 9, 316, -158, 104, -253, 807, -345, -192, -41, 240, 736, -766, 387, 157, 278, -397, -101, -600, 289, 733, -953, -603, 866, -693, -982, 223, 860, 816, -551, -516, -546, -840, -115, 263, 861, -204, -968, 992, 173, -423, -737, 779 };
        int[] count = { 39, 30, 58, 113, 31, 14, 84, 45, 52, 80, 8, 37, 82, 58, 58, 52, 81, 101, 115, 38, 95, 3, 17, 29, 36, 82, 13, 63, 24, 44, 19, 101, 24, 65, 119, 124, 81, 48, 48, 8, 59, 106, 105, 116, 31, 122, 21, 88, 17, 91 };
        int time = 622;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case78() {
        int[] position = { -596, -889, -327, -178, 311, -526, -482, -229, -86, 456, 512, 356, 964, -12, -187, 492, -993, -74, 93, 511, 579, 732, 223, 342, 539, -929, 6, 134, 956, -42, 353, -175, 97, 394, -179, 107, 731, 530, -242, -513, 920, 269, 726, 38, 904, -72, -819, 668, 101, 547 };
        int[] count = { 98, 123, 107, 34, 173, 70, 156, 40, 31, 181, 169, 92, 182, 120, 18, 129, 168, 133, 27, 93, 82, 158, 16, 55, 12, 140, 160, 153, 4, 133, 175, 148, 110, 66, 176, 166, 21, 176, 21, 69, 14, 123, 142, 133, 176, 144, 14, 156, 153, 111 };
        int time = 927;
        assertEquals("Impossible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case79() {
        int[] position = { 872, 178, -122, 818, 647, -131, 175, -938, 376, -578, 698, 186, -189, -280, -612, -200, -552, 864, 138, 683, -656, -251, -409, -990, 356, 795, 782, -772, -567, 414, 576, 86, -147, -3, -531, 468, 554, 271, -988, 947, -348, -126, -187, -351, 162, 513, 560, 722, 69, -88 };
        int[] count = { 77, 7, 65, 48, 109, 116, 113, 88, 138, 25, 128, 15, 113, 148, 83, 1, 90, 100, 125, 145, 98, 38, 65, 15, 130, 137, 5, 157, 15, 14, 54, 3, 65, 60, 112, 70, 38, 120, 79, 150, 41, 60, 6, 62, 74, 112, 64, 116, 20, 38 };
        int time = 823;
        assertEquals("Impossible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case80() {
        int[] position = { -254, -8, 855, 274, 785, -222, 143, -591, -829, -895, -411, -566, -968, 428, 664, 422, -930, 578, -5, 279, 795, -410, 413, -285, -627, -408, 454, -390, -712, 794, 737, -780, 555, -570, 903, 301, -419, 519, -22, -197, -624, 996, -185, 120, 751, -981, -729, 605, -137, 901 };
        int[] count = { 6, 14, 14, 16, 6, 11, 4, 5, 10, 7, 14, 4, 12, 12, 7, 13, 13, 10, 13, 15, 16, 2, 8, 13, 10, 15, 4, 12, 8, 7, 2, 4, 12, 9, 11, 12, 11, 3, 3, 8, 12, 16, 1, 7, 10, 16, 12, 13, 10, 16 };
        int time = 77;
        assertEquals("Possible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case81() {
        int[] position = { 509, 725, -359, 867, -108, -805, -261, -594, 507, 39, -296, 391, 606, -595, 108, -332, 771, 377, -264, 182, -308, 378, 427, 97, 844, 145, 38, -833, 683, -198, -10, -142, 726, 77, -574, -855, -779, 160, 922, -490, 252, -917, 118, -858, 783, -287, 826, -257, 69, -25 };
        int[] count = { 798, 204, 109, 234, 507, 740, 260, 696, 742, 636, 262, 511, 195, 749, 142, 350, 250, 443, 732, 1, 114, 170, 586, 644, 554, 78, 7, 602, 1, 792, 356, 20, 740, 476, 445, 603, 743, 821, 529, 267, 381, 775, 652, 784, 526, 377, 136, 684, 521, 383 };
        int time = 853;
        assertEquals("Impossible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case82() {
        int[] position = { 69, 350, 194, -307, 947, 497, 39, 62, 899, 971, 224, 128, 518, 878, -392, -289, 932, -666, 179, 832, -634, 399, 220, 277, -256, 499, -846, 955, -226, 517, -397, 531, -595, -119, -810, 428, 333, 243, -812, -733, -414, 470, 890, -56, 20, -714, -586, -372, -682, -860 };
        int[] count = { 53, 344, 254, 282, 29, 173, 398, 209, 416, 353, 171, 390, 230, 238, 165, 321, 222, 351, 414, 391, 70, 64, 176, 402, 113, 118, 120, 271, 416, 103, 59, 382, 239, 33, 115, 288, 13, 261, 102, 243, 397, 203, 448, 167, 135, 275, 228, 68, 278, 116 };
        int time = 451;
        assertEquals("Impossible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case83() {
        int[] position = { -984, 844, 117, -744, 920, 728, -97, -402, -848, -335, -966, 785, -527, 121, 348, -932, -182, 741, 570, 769, 75, 221, -690, 237, 264, -530, -606, -572, 20, -72, -677, 862, -686, 944, -168, 652, -354, -834, 522, -294, -937, 397, 835, -697, 440, 714, 303, -950, -529, 7 };
        int[] count = { 271, 578, 553, 729, 858, 858, 848, 854, 581, 410, 592, 568, 197, 181, 85, 863, 101, 343, 772, 523, 815, 476, 643, 662, 527, 739, 116, 83, 871, 39, 123, 551, 481, 230, 91, 853, 357, 369, 757, 87, 236, 259, 470, 530, 322, 85, 702, 401, 711, 656 };
        int time = 884;
        assertEquals("Impossible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case84() {
        int[] position = { -536, 658, -688, -346, -902, 16, 541, 414, 890, 241, -444, 644, 915, 923, 899, -140, -345, 183, 146, -34, 556, 393, 211, -93, -516, -959, 852, 674, 196, -654, 921, 800, -621, -745, 42, -971, 952, -596, 65, 105, 496, -337, -735, -83, -583, -620, 868, -661, 340, -779 };
        int[] count = { 605, 849, 129, 11, 719, 456, 221, 473, 35, 878, 11, 212, 880, 85, 873, 222, 297, 432, 221, 729, 734, 329, 421, 177, 768, 210, 15, 58, 341, 373, 572, 198, 229, 385, 111, 843, 751, 475, 329, 320, 268, 386, 39, 505, 416, 196, 642, 186, 866, 635 };
        int time = 918;
        assertEquals("Impossible", catsonthelinediv2.getAnswer(position, count, time));
    }

    @Test
    public void case85() {
        int[] position = { 677, -425, -435, 808, -80, 683, -444, 243, 643, 275, -163, -836, 386, 134, 893, 185, -342, 760, 474, 126, -172, -797, 284, -223, 192, 153, -105, -20, -108, 770, 900, -839, -542, 488, -149, 5, 203, 537, 150, 384, 74, 132, 319, -739, 205, 910, -72, 67, 509, 429 };
        int[] count = { 94, 575, 89, 442, 349, 346, 243, 210, 674, 312, 649, 627, 439, 464, 585, 41, 621, 592, 469, 639, 195, 335, 702, 443, 222, 624, 117, 61, 621, 404, 439, 664, 672, 319, 64, 328, 241, 213, 731, 714, 320, 93, 684, 747, 341, 543, 408, 82, 673, 444 };
        int time = 788;
        assertEquals("Impossible", catsonthelinediv2.getAnswer(position, count, time));
    }

}
