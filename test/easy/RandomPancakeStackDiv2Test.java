package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class RandomPancakeStackDiv2Test {
    double DELTA = 1.0e-09;
    RandomPancakeStackDiv2 randompancakestackdiv2 = new RandomPancakeStackDiv2();

    @Test
    public void case1() {
        int[] d = { 1, 1, 1 };
        assertEquals(1.6666666666666667, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 1.6666666666666667);
    }

    @Test
    public void case2() {
        int[] d = { 3, 6, 10, 9, 2 };
        assertEquals(9.891666666666667, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 9.891666666666667);
    }

    @Test
    public void case3() {
        int[] d = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        assertEquals(10.999999724426809, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 10.999999724426809);
    }

    @Test
    public void case4() {
        int[] d = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        assertEquals(7.901100088183421, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 7.901100088183421);
    }

    @Test
    public void case5() {
        int[] d = { 2, 7, 1, 8, 2, 8, 1, 8, 2, 8 };
        assertEquals(7.707120535714286, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 7.707120535714286);
    }

    @Test
    public void case6() {
        int[] d = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(1.7182818011463845, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 1.7182818011463845);
    }

    @Test
    public void case7() {
        int[] d = { 100 };
        assertEquals(100.0, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 100.0);
    }

    @Test
    public void case8() {
        int[] d = { 47, 40, 9, 1, 1, 4, 17, 8, 2, 53 };
        assertEquals(34.2077094356261, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 34.2077094356261);
    }

    @Test
    public void case9() {
        int[] d = { 2, 1, 1, 31, 44, 1, 21, 21, 8, 9 };
        assertEquals(21.933069609788355, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 21.933069609788355);
    }

    @Test
    public void case10() {
        int[] d = { 3, 24, 31, 31, 10, 52, 52, 60, 46, 15 };
        assertEquals(50.1293110670194, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 50.1293110670194);
    }

    @Test
    public void case11() {
        int[] d = { 1, 2, 4, 13, 44, 10, 82, 2, 1, 6 };
        assertEquals(25.448012014991182, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 25.448012014991182);
    }

    @Test
    public void case12() {
        int[] d = { 6, 71, 38, 1, 1, 11, 14, 1, 30, 1 };
        assertEquals(34.501823467813054, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 34.501823467813054);
    }

    @Test
    public void case13() {
        int[] d = { 73, 45, 9, 16, 23, 1, 3, 89, 16, 1 };
        assertEquals(53.11812692901235, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 53.11812692901235);
    }

    @Test
    public void case14() {
        int[] d = { 29, 11, 1, 30, 24, 57, 1, 51, 11, 15 };
        assertEquals(38.55421434082893, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 38.55421434082893);
    }

    @Test
    public void case15() {
        int[] d = { 30, 3, 76, 9, 31, 1, 42, 35, 30, 42 };
        assertEquals(50.07904238315696, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 50.07904238315696);
    }

    @Test
    public void case16() {
        int[] d = { 38, 3, 1, 1, 20, 91, 70, 1, 7, 36 };
        assertEquals(43.01184551366843, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 43.01184551366843);
    }

    @Test
    public void case17() {
        int[] d = { 58, 6, 99, 93, 27, 95, 33, 21, 10, 29 };
        assertEquals(86.75347332451499, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 86.75347332451499);
    }

    @Test
    public void case18() {
        int[] d = { 60, 35, 5, 36, 90, 89, 40, 21, 35, 32 };
        assertEquals(77.06226162918873, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 77.06226162918873);
    }

    @Test
    public void case19() {
        int[] d = { 24, 69, 79, 31, 20, 18, 97, 76, 49, 79 };
        assertEquals(88.44129271384479, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 88.44129271384479);
    }

    @Test
    public void case20() {
        int[] d = { 17, 82, 25, 72, 4, 86, 20, 67, 20, 44 };
        assertEquals(75.19319444444444, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 75.19319444444444);
    }

    @Test
    public void case21() {
        int[] d = { 100, 99, 98, 30, 30, 7, 65, 42, 6, 34 };
        assertEquals(102.38517829585537, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 102.38517829585537);
    }

    @Test
    public void case22() {
        int[] d = { 73, 95, 42, 47, 56, 80, 94, 80, 96, 73 };
        assertEquals(123.55758239638446, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 123.55758239638446);
    }

    @Test
    public void case23() {
        int[] d = { 46, 22, 96, 2, 3, 6, 52, 11, 5, 53 };
        assertEquals(54.674823082010576, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 54.674823082010576);
    }

    @Test
    public void case24() {
        int[] d = { 38, 2, 10, 2, 25, 37, 11, 2, 5, 4 };
        assertEquals(26.03954420194004, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 26.03954420194004);
    }

    @Test
    public void case25() {
        int[] d = { 45, 1, 56, 49, 3, 50, 86, 41, 48, 5 };
        assertEquals(64.87169560185187, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 64.87169560185187);
    }

    @Test
    public void case26() {
        int[] d = { 24, 12, 1, 29, 2, 22, 16, 44, 31, 50 };
        assertEquals(35.01574459876544, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 35.01574459876544);
    }

    @Test
    public void case27() {
        int[] d = { 4, 1, 2, 19, 3, 8, 50, 2, 54, 50 };
        assertEquals(25.28321952160494, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 25.28321952160494);
    }

    @Test
    public void case28() {
        int[] d = { 2, 22, 6, 5, 10, 92, 99, 65, 32, 58 };
        assertEquals(54.98065917107583, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 54.98065917107583);
    }

    @Test
    public void case29() {
        int[] d = { 12, 2, 5, 1, 30, 78, 43, 95, 3, 9 };
        assertEquals(41.03976741622575, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 41.03976741622575);
    }

    @Test
    public void case30() {
        int[] d = { 27, 1, 39, 37, 89, 46, 11, 10, 21, 42 };
        assertEquals(54.700269235008804, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 54.700269235008804);
    }

    @Test
    public void case31() {
        int[] d = { 16, 77, 5, 3, 13, 56, 14, 24, 17, 20 };
        assertEquals(44.22237516534391, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 44.22237516534391);
    }

    @Test
    public void case32() {
        int[] d = { 1, 4, 49, 83, 82, 12, 4, 4, 1, 1 };
        assertEquals(44.89030974426808, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 44.89030974426808);
    }

    @Test
    public void case33() {
        int[] d = { 65, 3, 30, 75, 19, 69, 86, 26, 49, 42 };
        assertEquals(77.8095632164903, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 77.8095632164903);
    }

    @Test
    public void case34() {
        int[] d = { 13, 98, 10, 39, 77, 66, 14, 58, 94, 25 };
        assertEquals(82.24601796737213, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 82.24601796737213);
    }

    @Test
    public void case35() {
        int[] d = { 46, 100, 60, 93, 88, 93, 28, 37, 89, 44 };
        assertEquals(119.53908234126985, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 119.53908234126985);
    }

    @Test
    public void case36() {
        int[] d = { 42, 77, 20, 84, 31, 97, 14, 33, 86, 79 };
        assertEquals(94.1360827270723, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 94.1360827270723);
    }

    @Test
    public void case37() {
        int[] d = { 71, 22, 100, 27, 32, 45, 96, 74, 63, 53 };
        assertEquals(98.38912202380952, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 98.38912202380952);
    }

    @Test
    public void case38() {
        int[] d = { 37, 32, 81, 5, 1, 24, 1, 98, 89, 2 };
        assertEquals(62.37923831569666, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 62.37923831569666);
    }

    @Test
    public void case39() {
        int[] d = { 14, 32, 1, 5, 16, 10, 8, 11, 8, 62 };
        assertEquals(26.544673170194006, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 26.544673170194006);
    }

    @Test
    public void case40() {
        int[] d = { 66, 11, 45, 39, 53, 18, 84, 94, 7, 5 };
        assertEquals(74.0942297729277, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 74.0942297729277);
    }

    @Test
    public void case41() {
        int[] d = { 7, 21, 4, 6, 85, 30, 3, 46, 7, 1 };
        assertEquals(35.16091021825396, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 35.16091021825396);
    }

    @Test
    public void case42() {
        int[] d = { 1, 22, 4, 28, 16, 49, 2, 1, 18, 2 };
        assertEquals(24.695762786596116, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 24.695762786596116);
    }

    @Test
    public void case43() {
        int[] d = { 84, 17, 38, 5, 3, 51, 67, 13, 5, 99 };
        assertEquals(65.71564125881835, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 65.71564125881835);
    }

    @Test
    public void case44() {
        int[] d = { 27, 25, 2, 41, 14, 80, 1, 3, 1, 12 };
        assertEquals(38.193021660052906, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 38.193021660052906);
    }

    @Test
    public void case45() {
        int[] d = { 19, 48, 39, 39, 3, 46, 24, 19, 69, 96 };
        assertEquals(63.14430004409171, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 63.14430004409171);
    }

    @Test
    public void case46() {
        int[] d = { 1, 78, 1, 1, 66, 78, 1, 18, 33, 1 };
        assertEquals(48.96193617724868, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 48.96193617724868);
    }

    @Test
    public void case47() {
        int[] d = { 42, 1, 1, 25, 52, 4, 68, 69, 48, 55 };
        assertEquals(54.9373828813933, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 54.9373828813933);
    }

    @Test
    public void case48() {
        int[] d = { 37, 76, 97, 8, 73, 36, 32, 58, 35, 84 };
        assertEquals(92.75261298500884, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 92.75261298500884);
    }

    @Test
    public void case49() {
        int[] d = { 94, 75, 76, 20, 75, 27, 28, 61, 59, 75 };
        assertEquals(106.33758349867726, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 106.33758349867726);
    }

    @Test
    public void case50() {
        int[] d = { 29, 48, 74, 23, 71, 1, 99, 41, 66, 13 };
        assertEquals(79.49252314814814, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 79.49252314814814);
    }

    @Test
    public void case51() {
        int[] d = { 100, 70, 54, 34, 72, 97, 25, 93, 27, 85 };
        assertEquals(115.93858300264552, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 115.93858300264552);
    }

    @Test
    public void case52() {
        int[] d = { 18, 50, 31, 89, 11, 24, 69, 73, 52, 5 };
        assertEquals(71.11046957671958, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 71.11046957671958);
    }

    @Test
    public void case53() {
        int[] d = { 10, 20 };
        assertEquals(20.0, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 20.0);
    }

    @Test
    public void case54() {
        int[] d = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        assertEquals(10.999999724426809, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 10.999999724426809);
    }

    @Test
    public void case55() {
        int[] d = { 10, 20 };
        assertEquals(20.0, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 20.0);
    }

    @Test
    public void case56() {
        int[] d = { 3, 6, 10, 9, 2 };
        assertEquals(9.891666666666667, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 9.891666666666667);
    }

    @Test
    public void case57() {
        int[] d = { 1, 1, 1 };
        assertEquals(1.6666666666666667, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 1.6666666666666667);
    }

    @Test
    public void case58() {
        int[] d = { 99, 98, 97, 96, 95, 94, 93, 92, 91, 90 };
        assertEquals(163.92708002645503, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 163.92708002645503);
    }

    @Test
    public void case59() {
        int[] d = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        assertEquals(7.901100088183421, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 7.901100088183421);
    }

    @Test
    public void case60() {
        int[] d = { 1, 2, 4, 100, 5 };
        assertEquals(28.625, randompancakestackdiv2.expectedDeliciousness(d), DELTA * 28.625);
    }

}
