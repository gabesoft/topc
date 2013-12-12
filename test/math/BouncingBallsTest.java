package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class BouncingBallsTest {
    double DELTA = 1.0e-09;
    BouncingBalls bouncingballs = new BouncingBalls();

    @Test
    public void case1() {
        int[] x = { 5, 8 };
        int T = 2;
        assertEquals(0.25, bouncingballs.expectedBounces(x, T), DELTA * 0.25);
    }

    @Test
    public void case2() {
        int[] x = { 5, 8 };
        int T = 1;
        assertEquals(0.0, bouncingballs.expectedBounces(x, T), DELTA);
    }

    @Test
    public void case3() {
        int[] x = { 87, 356, 42, 865, 82, 482, 676 };
        int T = 200;
        assertEquals(3.25, bouncingballs.expectedBounces(x, T), DELTA * 3.25);
    }

    @Test
    public void case4() {
        int[] x = { 91, 857, 692, 54, 8679, 83, 792, 86, 9537, 913, 64, 592 };
        int T = 458;
        assertEquals(11.5, bouncingballs.expectedBounces(x, T), DELTA * 11.5);
    }

    @Test
    public void case5() {
        int[] x = { 75432 };
        int T = 386;
        assertEquals(0.0, bouncingballs.expectedBounces(x, T), DELTA);
    }

    @Test
    public void case6() {
        int[] x = { 81765919 };
        int T = 74927847;
        assertEquals(0.0, bouncingballs.expectedBounces(x, T), DELTA);
    }

    @Test
    public void case7() {
        int[] x = { 91391518 };
        int T = 8678366;
        assertEquals(0.0, bouncingballs.expectedBounces(x, T), DELTA);
    }

    @Test
    public void case8() {
        int[] x = { 45349748, 44887243 };
        int T = 1802272;
        assertEquals(0.25, bouncingballs.expectedBounces(x, T), DELTA * 0.25);
    }

    @Test
    public void case9() {
        int[] x = { 80268343, 89772825 };
        int T = 4169015;
        assertEquals(0.0, bouncingballs.expectedBounces(x, T), DELTA);
    }

    @Test
    public void case10() {
        int[] x = { 49118311, 79932150, 20137364 };
        int T = 13972261;
        assertEquals(0.0, bouncingballs.expectedBounces(x, T), DELTA);
    }

    @Test
    public void case11() {
        int[] x = { 96032857, 77206973, 68706223 };
        int T = 46406355;
        assertEquals(0.75, bouncingballs.expectedBounces(x, T), DELTA * 0.75);
    }

    @Test
    public void case12() {
        int[] x = { 92516171, 26542610, 28126542, 1950414 };
        int T = 49164332;
        assertEquals(1.5, bouncingballs.expectedBounces(x, T), DELTA * 1.5);
    }

    @Test
    public void case13() {
        int[] x = { 59998478, 80937351, 25914703, 81643285 };
        int T = 28983968;
        assertEquals(1.5, bouncingballs.expectedBounces(x, T), DELTA * 1.5);
    }

    @Test
    public void case14() {
        int[] x = { 56224172, 18458117, 83059335, 10500656, 70970480 };
        int T = 9137855;
        assertEquals(0.75, bouncingballs.expectedBounces(x, T), DELTA * 0.75);
    }

    @Test
    public void case15() {
        int[] x = { 63674747, 4629740, 47965600, 93687325, 15934104 };
        int T = 18477289;
        assertEquals(1.0, bouncingballs.expectedBounces(x, T), DELTA * 1.0);
    }

    @Test
    public void case16() {
        int[] x = { 51656710, 36430313, 83337399, 14127113, 82875682, 43654031 };
        int T = 13380804;
        assertEquals(1.25, bouncingballs.expectedBounces(x, T), DELTA * 1.25);
    }

    @Test
    public void case17() {
        int[] x = { 5099291, 53580334, 35222225, 17442741, 88580989, 7426501 };
        int T = 10691471;
        assertEquals(1.25, bouncingballs.expectedBounces(x, T), DELTA * 1.25);
    }

    @Test
    public void case18() {
        int[] x = { 52299416, 39228182, 82095952, 31636655, 23840040, 11081999, 87487094 };
        int T = 7596;
        assertEquals(0.0, bouncingballs.expectedBounces(x, T), DELTA);
    }

    @Test
    public void case19() {
        int[] x = { 30103618, 1013189, 61784834, 76460916, 5748438, 86000794, 61170557 };
        int T = 6672899;
        assertEquals(0.75, bouncingballs.expectedBounces(x, T), DELTA * 0.75);
    }

    @Test
    public void case20() {
        int[] x = { 99304824, 59931119, 53962267, 68295553, 6364913, 11243527, 94411731, 41418519 };
        int T = 19703123;
        assertEquals(3.5, bouncingballs.expectedBounces(x, T), DELTA * 3.5);
    }

    @Test
    public void case21() {
        int[] x = { 25440078, 33958741, 12677186, 71339218, 84742706, 65117066, 83332382, 52483193 };
        int T = 11460881;
        assertEquals(3.0, bouncingballs.expectedBounces(x, T), DELTA * 3.0);
    }

    @Test
    public void case22() {
        int[] x = { 96796182, 76151768, 6140945, 78512105, 9984370, 3305397, 19159289, 42727406, 32021903 };
        int T = 38430576;
        assertEquals(8.0, bouncingballs.expectedBounces(x, T), DELTA * 8.0);
    }

    @Test
    public void case23() {
        int[] x = { 53189263, 48283583, 54969874, 57114987, 14316389, 59481676, 68043415, 72004048, 80643046 };
        int T = 890829;
        assertEquals(0.25, bouncingballs.expectedBounces(x, T), DELTA * 0.25);
    }

    @Test
    public void case24() {
        int[] x = { 82559963, 20256093, 3823673, 41127585, 99845036, 85293988, 16688793, 98508730, 558229, 47030698 };
        int T = 19791905;
        assertEquals(5.0, bouncingballs.expectedBounces(x, T), DELTA * 5.0);
    }

    @Test
    public void case25() {
        int[] x = { 4255253, 63821518, 46953781, 98427199, 47176132, 34901140, 2183717, 70386587, 5284670, 3224407 };
        int T = 564704;
        assertEquals(1.0, bouncingballs.expectedBounces(x, T), DELTA * 1.0);
    }

    @Test
    public void case26() {
        int[] x = { 31622996, 21792716, 57482152, 19515391, 99333059, 26846005, 53909171, 97905445, 1708865, 81350648, 14238776 };
        int T = 17021783;
        assertEquals(6.5, bouncingballs.expectedBounces(x, T), DELTA * 6.5);
    }

    @Test
    public void case27() {
        int[] x = { 58703724, 72439826, 4108454, 85894557, 85983573, 41274446, 27723012, 9435094, 22814898, 34168418, 58421357 };
        int T = 19293331;
        assertEquals(8.75, bouncingballs.expectedBounces(x, T), DELTA * 8.75);
    }

    @Test
    public void case28() {
        int[] x = { 84695038, 74726696, 69580809, 12835713, 10483393, 74846502, 64873464, 79011686, 40931190, 6947919, 70258288, 65332131 };
        int T = 46820309;
        assertEquals(16.5, bouncingballs.expectedBounces(x, T), DELTA * 16.5);
    }

    @Test
    public void case29() {
        int[] x = { 27166037, 99374289, 41680381, 83555933, 60692725, 33654394, 33644384, 74341720, 78883766, 45357074, 53542738, 75831903 };
        int T = 34469051;
        assertEquals(16.25, bouncingballs.expectedBounces(x, T), DELTA * 16.25);
    }

    @Test
    public void case30() {
        int[] x = { 0, 100000000 };
        int T = 50000000;
        assertEquals(0.25, bouncingballs.expectedBounces(x, T), DELTA * 0.25);
    }

    @Test
    public void case31() {
        int[] x = { 1, 100000000 };
        int T = 49999999;
        assertEquals(0.0, bouncingballs.expectedBounces(x, T), DELTA);
    }

    @Test
    public void case32() {
        int[] x = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        int T = 6;
        assertEquals(16.5, bouncingballs.expectedBounces(x, T), DELTA * 16.5);
    }

    @Test
    public void case33() {
        int[] x = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        int T = 3;
        assertEquals(12.75, bouncingballs.expectedBounces(x, T), DELTA * 12.75);
    }

    @Test
    public void case34() {
        int[] x = { 4, 50, 77, 2323 };
        int T = 1000;
        assertEquals(0.75, bouncingballs.expectedBounces(x, T), DELTA * 0.75);
    }

    @Test
    public void case35() {
        int[] x = { 91, 857, 692, 54, 8679, 83, 792, 86, 9537, 913, 64, 592 };
        int T = 458;
        assertEquals(11.5, bouncingballs.expectedBounces(x, T), DELTA * 11.5);
    }

    @Test
    public void case36() {
        int[] x = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        int T = 3;
        assertEquals(12.75, bouncingballs.expectedBounces(x, T), DELTA * 12.75);
    }

    @Test
    public void case37() {
        int[] x = { 1, 2, 30000000, 100000000, 5, 6, 7, 8, 9, 10, 11, 12 };
        int T = 100000000;
        assertEquals(16.5, bouncingballs.expectedBounces(x, T), DELTA * 16.5);
    }

    @Test
    public void case38() {
        int[] x = { 91, 857, 692, 54, 8679, 83, 792, 86, 9537, 592, 100000000 };
        int T = 2010;
        assertEquals(7.25, bouncingballs.expectedBounces(x, T), DELTA * 7.25);
    }

    @Test
    public void case39() {
        int[] x = { 234, 235, 23487, 2839, 9237, 4987, 2, 928374, 98374, 345345 };
        int T = 7967293;
        assertEquals(11.25, bouncingballs.expectedBounces(x, T), DELTA * 11.25);
    }

    @Test
    public void case40() {
        int[] x = { 1, 10, 1000, 10000, 20000, 12, 100, 10000000, 100001, 10000002, 10000004, 10000005 };
        int T = 100000000;
        assertEquals(16.5, bouncingballs.expectedBounces(x, T), DELTA * 16.5);
    }

    @Test
    public void case41() {
        int[] x = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        int T = 100000000;
        assertEquals(16.5, bouncingballs.expectedBounces(x, T), DELTA * 16.5);
    }

    @Test
    public void case42() {
        int[] x = { 432424, 5325, 6436, 23432, 342, 4234, 3422, 2333, 233, 22, 33333, 432422 };
        int T = 100000000;
        assertEquals(16.5, bouncingballs.expectedBounces(x, T), DELTA * 16.5);
    }

    @Test
    public void case43() {
        int[] x = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        int T = 100000000;
        assertEquals(16.5, bouncingballs.expectedBounces(x, T), DELTA * 16.5);
    }

    @Test
    public void case44() {
        int[] x = { 89003176, 77514010, 72441260, 6514497, 79733773, 61035309, 37017339, 88108025, 75820271, 10647984, 26139400, 32984324 };
        int T = 100000000;
        assertEquals(16.5, bouncingballs.expectedBounces(x, T), DELTA * 16.5);
    }

    @Test
    public void case45() {
        int[] x = { 1, 100000000, 50000000, 10000000, 20000000, 30000000, 40000000, 55000000, 8, 32432423, 324324, 99999999 };
        int T = 100000000;
        assertEquals(16.5, bouncingballs.expectedBounces(x, T), DELTA * 16.5);
    }

    @Test
    public void case46() {
        int[] x = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 11, 12 };
        int T = 10000000;
        assertEquals(16.5, bouncingballs.expectedBounces(x, T), DELTA * 16.5);
    }

    @Test
    public void case47() {
        int[] x = { 1, 2, 3, 4, 54, 6, 7, 8, 9, 10, 11 };
        int T = 500;
        assertEquals(13.75, bouncingballs.expectedBounces(x, T), DELTA * 13.75);
    }

}
