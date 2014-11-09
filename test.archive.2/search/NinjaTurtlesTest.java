package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class NinjaTurtlesTest {
    NinjaTurtles ninjaturtles = new NinjaTurtles();

    @Test
    public void case1() {
        int P = 5;
        int K = 4;
        assertEquals(6, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case2() {
        int P = 1;
        int K = 4;
        assertEquals(3, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case3() {
        int P = 13;
        int K = 6;
        assertEquals(-1, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case4() {
        int P = 13;
        int K = 17;
        assertEquals(30, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case5() {
        int P = 122;
        int K = 21;
        assertEquals(258, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case6() {
        int P = 1000000;
        int K = 100;
        assertEquals(-1, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case7() {
        int P = 1000000;
        int K = 99;
        assertEquals(2750007, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case8() {
        int P = 1000000;
        int K = 98;
        assertEquals(2747667, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case9() {
        int P = 999999;
        int K = 100;
        assertEquals(2752299, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case10() {
        int P = 1000000;
        int K = 4;
        assertEquals(923079, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case11() {
        int P = 112;
        int K = 8;
        assertEquals(-1, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case12() {
        int P = 113;
        int K = 8;
        assertEquals(160, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case13() {
        int P = 114;
        int K = 8;
        assertEquals(162, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case14() {
        int P = 1;
        int K = 100;
        assertEquals(3, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case15() {
        int P = 666;
        int K = 66;
        assertEquals(1764, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case16() {
        int P = 1234;
        int K = 4;
        assertEquals(-1, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case17() {
        int P = 12345;
        int K = 4;
        assertEquals(11396, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case18() {
        int P = 8462;
        int K = 26;
        assertEquals(18861, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case19() {
        int P = 983325;
        int K = 59;
        assertEquals(2559538, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case20() {
        int P = 93135;
        int K = 100;
        assertEquals(256338, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case21() {
        int P = 69993;
        int K = 22;
        assertEquals(149022, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case22() {
        int P = 69994;
        int K = 22;
        assertEquals(149025, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case23() {
        int P = 69994;
        int K = 11;
        assertEquals(115491, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case24() {
        int P = 903;
        int K = 8;
        assertEquals(1278, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case25() {
        int P = 903;
        int K = 4;
        assertEquals(-1, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case26() {
        int P = 905;
        int K = 4;
        assertEquals(836, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case27() {
        int P = 20000;
        int K = 6;
        assertEquals(24000, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case28() {
        int P = 20005;
        int K = 6;
        assertEquals(24006, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case29() {
        int P = 555555;
        int K = 55;
        assertEquals(1432296, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case30() {
        int P = 52951;
        int K = 92;
        assertEquals(144705, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case31() {
        int P = 52951;
        int K = 96;
        assertEquals(145245, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case32() {
        int P = 52952;
        int K = 96;
        assertEquals(-1, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case33() {
        int P = 909090;
        int K = 90;
        assertEquals(2479338, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case34() {
        int P = 909090;
        int K = 95;
        assertEquals(2491263, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case35() {
        int P = 909090;
        int K = 100;
        assertEquals(2502090, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case36() {
        int P = 44;
        int K = 11;
        assertEquals(-1, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case37() {
        int P = 44;
        int K = 21;
        assertEquals(96, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case38() {
        int P = 4400;
        int K = 5;
        assertEquals(4715, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case39() {
        int P = 3912;
        int K = 79;
        assertEquals(10539, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case40() {
        int P = 100000;
        int K = 4;
        assertEquals(92308, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case41() {
        int P = 100000;
        int K = 5;
        assertEquals(-1, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case42() {
        int P = 1000000;
        int K = 51;
        assertEquals(2550000, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case43() {
        int P = 1000000;
        int K = 7;
        assertEquals(1312500, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case44() {
        int P = 602408;
        int K = 7;
        assertEquals(-1, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case45() {
        int P = 602408;
        int K = 9;
        assertEquals(903615, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case46() {
        int P = 293852;
        int K = 40;
        assertEquals(-1, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case47() {
        int P = 293852;
        int K = 41;
        assertEquals(722877, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case48() {
        int P = 512000;
        int K = 32;
        assertEquals(1198833, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case49() {
        int P = 709222;
        int K = 88;
        assertEquals(1930260, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case50() {
        int P = 512512;
        int K = 64;
        assertEquals(1347978, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case51() {
        int P = 80000;
        int K = 67;
        assertEquals(-1, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case52() {
        int P = 82000;
        int K = 67;
        assertEquals(216876, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case53() {
        int P = 82222;
        int K = 83;
        assertEquals(222537, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case54() {
        int P = 400000;
        int K = 6;
        assertEquals(480000, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case55() {
        int P = 400000;
        int K = 5;
        assertEquals(428574, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case56() {
        int P = 400001;
        int K = 4;
        assertEquals(369232, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case57() {
        int P = 659554;
        int K = 100;
        assertEquals(1815294, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case58() {
        int P = 878342;
        int K = 36;
        assertEquals(2108022, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case59() {
        int P = 65281;
        int K = 59;
        assertEquals(169923, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case60() {
        int P = 2512;
        int K = 4;
        assertEquals(-1, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case61() {
        int P = 4;
        int K = 4;
        assertEquals(4, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case62() {
        int P = 13;
        int K = 4;
        assertEquals(12, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case63() {
        int P = 1355;
        int K = 4;
        assertEquals(-1, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case64() {
        int P = 2358;
        int K = 4;
        assertEquals(2178, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case65() {
        int P = 999999;
        int K = 4;
        assertEquals(923076, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case66() {
        int P = 999997;
        int K = 41;
        assertEquals(-1, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case67() {
        int P = 999997;
        int K = 42;
        assertEquals(2470584, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case68() {
        int P = 605553;
        int K = 100;
        assertEquals(1666665, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case69() {
        int P = 763000;
        int K = 100;
        assertEquals(2100000, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case70() {
        int P = 726666;
        int K = 100;
        assertEquals(2000000, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case71() {
        int P = 10000;
        int K = 4;
        assertEquals(-1, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case72() {
        int P = 999999;
        int K = 99;
        assertEquals(2750004, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case73() {
        int P = 100;
        int K = 50;
        assertEquals(255, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case74() {
        int P = 1000000;
        int K = 25;
        assertEquals(2205885, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case75() {
        int P = 2;
        int K = 8;
        assertEquals(6, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case76() {
        int P = 790000;
        int K = 70;
        assertEquals(2100000, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case77() {
        int P = 1000000;
        int K = 21;
        assertEquals(2100000, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case78() {
        int P = 1000000;
        int K = 50;
        assertEquals(2542377, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case79() {
        int P = 399666;
        int K = 100;
        assertEquals(1100000, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case80() {
        int P = 460000;
        int K = 30;
        assertEquals(1061544, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case81() {
        int P = 999875;
        int K = 35;
        assertEquals(2386068, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case82() {
        int P = 676666;
        int K = 100;
        assertEquals(1862391, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case83() {
        int P = 1000000;
        int K = 14;
        assertEquals(-1, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case84() {
        int P = 1000000;
        int K = 95;
        assertEquals(2740386, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case85() {
        int P = 1000000;
        int K = 6;
        assertEquals(1200000, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case86() {
        int P = 1000000;
        int K = 11;
        assertEquals(1650000, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case87() {
        int P = 999920;
        int K = 100;
        assertEquals(2752080, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case88() {
        int P = 696666;
        int K = 10;
        assertEquals(1100000, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case89() {
        int P = 2;
        int K = 4;
        assertEquals(-1, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case90() {
        int P = 1000000;
        int K = 23;
        assertEquals(2156250, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case91() {
        int P = 1000000;
        int K = 15;
        assertEquals(1875000, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case92() {
        int P = 1000000;
        int K = 40;
        assertEquals(2448984, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case93() {
        int P = 437;
        int K = 4;
        assertEquals(404, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case94() {
        int P = 1000000;
        int K = 86;
        assertEquals(-1, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case95() {
        int P = 833335;
        int K = 6;
        assertEquals(1000002, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case96() {
        int P = 1000000;
        int K = 12;
        assertEquals(1714287, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case97() {
        int P = 1000000;
        int K = 91;
        assertEquals(2730000, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case98() {
        int P = 1000000;
        int K = 20;
        assertEquals(2068968, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case99() {
        int P = 833355;
        int K = 6;
        assertEquals(1000026, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case100() {
        int P = 119166;
        int K = 4;
        assertEquals(110000, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case101() {
        int P = 14;
        int K = 5;
        assertEquals(15, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case102() {
        int P = 686667;
        int K = 100;
        assertEquals(1889910, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case103() {
        int P = 300000;
        int K = 100;
        assertEquals(825696, ninjaturtles.countOpponents(P, K));
    }

    @Test
    public void case104() {
        int P = 999990;
        int K = 100;
        assertEquals(2752272, ninjaturtles.countOpponents(P, K));
    }

}
