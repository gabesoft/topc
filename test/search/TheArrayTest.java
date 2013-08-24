package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class TheArrayTest {
    TheArray thearray = new TheArray();

    @Test
    public void case1() {
        int n = 3;
        int d = 5;
        int first = 2;
        int last = 4;
        assertEquals(7, thearray.find(n, d, first, last));
    }

    @Test
    public void case2() {
        int n = 10;
        int d = 100;
        int first = 999;
        int last = 100;
        assertEquals(999, thearray.find(n, d, first, last));
    }

    @Test
    public void case3() {
        int n = 97;
        int d = 53;
        int first = -92;
        int last = 441;
        assertEquals(2717, thearray.find(n, d, first, last));
    }

    @Test
    public void case4() {
        int n = 99;
        int d = 3;
        int first = -743;
        int last = -619;
        assertEquals(-535, thearray.find(n, d, first, last));
    }

    @Test
    public void case5() {
        int n = 96;
        int d = 6;
        int first = -543;
        int last = -275;
        assertEquals(-125, thearray.find(n, d, first, last));
    }

    @Test
    public void case6() {
        int n = 2;
        int d = 1000;
        int first = 444;
        int last = -444;
        assertEquals(444, thearray.find(n, d, first, last));
    }

    @Test
    public void case7() {
        int n = 2;
        int d = 999;
        int first = 0;
        int last = 0;
        assertEquals(0, thearray.find(n, d, first, last));
    }

    @Test
    public void case8() {
        int n = 393417;
        int d = 561;
        int first = -245;
        int last = 605;
        assertEquals(110353232, thearray.find(n, d, first, last));
    }

    @Test
    public void case9() {
        int n = 727064;
        int d = 750;
        int first = 576;
        int last = 7;
        assertEquals(272648826, thearray.find(n, d, first, last));
    }

    @Test
    public void case10() {
        int n = 497597;
        int d = 896;
        int first = -92;
        int last = -13;
        assertEquals(222922916, thearray.find(n, d, first, last));
    }

    @Test
    public void case11() {
        int n = 529199;
        int d = 564;
        int first = -743;
        int last = -205;
        assertEquals(149233093, thearray.find(n, d, first, last));
    }

    @Test
    public void case12() {
        int n = 852396;
        int d = 941;
        int first = -543;
        int last = -495;
        assertEquals(401050882, thearray.find(n, d, first, last));
    }

    @Test
    public void case13() {
        int n = 596914;
        int d = 9;
        int first = 795;
        int last = -849;
        assertEquals(2686080, thearray.find(n, d, first, last));
    }

    @Test
    public void case14() {
        int n = 98837;
        int d = 669;
        int first = -631;
        int last = -430;
        assertEquals(33060011, thearray.find(n, d, first, last));
    }

    @Test
    public void case15() {
        int n = 847367;
        int d = 413;
        int first = -555;
        int last = 302;
        assertEquals(174980937, thearray.find(n, d, first, last));
    }

    @Test
    public void case16() {
        int n = 140970;
        int d = 565;
        int first = 534;
        int last = -906;
        assertEquals(39823429, thearray.find(n, d, first, last));
    }

    @Test
    public void case17() {
        int n = 935547;
        int d = 27;
        int first = 828;
        int last = -188;
        assertEquals(12630186, thearray.find(n, d, first, last));
    }

    @Test
    public void case18() {
        int n = 908027;
        int d = 945;
        int first = 819;
        int last = -612;
        assertEquals(429042159, thearray.find(n, d, first, last));
    }

    @Test
    public void case19() {
        int n = 837390;
        int d = 198;
        int first = -60;
        int last = 150;
        assertEquals(82901550, thearray.find(n, d, first, last));
    }

    @Test
    public void case20() {
        int n = 847965;
        int d = 581;
        int first = 986;
        int last = 681;
        assertEquals(246334223, thearray.find(n, d, first, last));
    }

    @Test
    public void case21() {
        int n = 418821;
        int d = 830;
        int first = 52;
        int last = 605;
        assertEquals(173810352, thearray.find(n, d, first, last));
    }

    @Test
    public void case22() {
        int n = 379978;
        int d = 659;
        int first = 462;
        int last = 7;
        assertEquals(125202554, thearray.find(n, d, first, last));
    }

    @Test
    public void case23() {
        int n = 402718;
        int d = 547;
        int first = 65;
        int last = -13;
        assertEquals(110142891, thearray.find(n, d, first, last));
    }

    @Test
    public void case24() {
        int n = 595696;
        int d = 627;
        int first = 257;
        int last = -205;
        assertEquals(186750326, thearray.find(n, d, first, last));
    }

    @Test
    public void case25() {
        int n = 125415;
        int d = 105;
        int first = 276;
        int last = -495;
        assertEquals(6584091, thearray.find(n, d, first, last));
    }

    @Test
    public void case26() {
        int n = 489029;
        int d = 545;
        int first = 631;
        int last = -849;
        assertEquals(133259826, thearray.find(n, d, first, last));
    }

    @Test
    public void case27() {
        int n = 697094;
        int d = 219;
        int first = 533;
        int last = -430;
        assertEquals(76331669, thearray.find(n, d, first, last));
    }

    @Test
    public void case28() {
        int n = 993689;
        int d = 718;
        int first = 394;
        int last = 302;
        assertEquals(356734294, thearray.find(n, d, first, last));
    }

    @Test
    public void case29() {
        int n = 536302;
        int d = 409;
        int first = 370;
        int last = -906;
        assertEquals(109673262, thearray.find(n, d, first, last));
    }

    @Test
    public void case30() {
        int n = 1000000;
        int d = 1;
        int first = 995;
        int last = 681;
        assertEquals(500837, thearray.find(n, d, first, last));
    }

    @Test
    public void case31() {
        int n = 999999;
        int d = 1;
        int first = 993;
        int last = 605;
        assertEquals(500798, thearray.find(n, d, first, last));
    }

    @Test
    public void case32() {
        int n = 1000000;
        int d = 1;
        int first = 991;
        int last = 7;
        assertEquals(500498, thearray.find(n, d, first, last));
    }

    @Test
    public void case33() {
        int n = 999999;
        int d = 0;
        int first = 990;
        int last = 990;
        assertEquals(990, thearray.find(n, d, first, last));
    }

    @Test
    public void case34() {
        int n = 999999;
        int d = 0;
        int first = 997;
        int last = 997;
        assertEquals(997, thearray.find(n, d, first, last));
    }

    @Test
    public void case35() {
        int n = 1000000;
        int d = 2;
        int first = 997;
        int last = -495;
        assertEquals(1000249, thearray.find(n, d, first, last));
    }

    @Test
    public void case36() {
        int n = 1000000;
        int d = 2;
        int first = 993;
        int last = -849;
        assertEquals(1000071, thearray.find(n, d, first, last));
    }

    @Test
    public void case37() {
        int n = 999999;
        int d = 1;
        int first = 999;
        int last = -430;
        assertEquals(500283, thearray.find(n, d, first, last));
    }

    @Test
    public void case38() {
        int n = 999999;
        int d = 0;
        int first = 992;
        int last = 992;
        assertEquals(992, thearray.find(n, d, first, last));
    }

    @Test
    public void case39() {
        int n = 1000000;
        int d = 1;
        int first = 996;
        int last = -906;
        assertEquals(500044, thearray.find(n, d, first, last));
    }

    @Test
    public void case40() {
        int n = 19;
        int d = 11;
        int first = 1000;
        int last = 809;
        assertEquals(1000, thearray.find(n, d, first, last));
    }

    @Test
    public void case41() {
        int n = 40;
        int d = 12;
        int first = 999;
        int last = 538;
        assertEquals(999, thearray.find(n, d, first, last));
    }

    @Test
    public void case42() {
        int n = 29;
        int d = 12;
        int first = 999;
        int last = 671;
        assertEquals(999, thearray.find(n, d, first, last));
    }

    @Test
    public void case43() {
        int n = 23;
        int d = 10;
        int first = -959;
        int last = -749;
        assertEquals(-749, thearray.find(n, d, first, last));
    }

    @Test
    public void case44() {
        int n = 74;
        int d = 14;
        int first = -959;
        int last = 49;
        assertEquals(49, thearray.find(n, d, first, last));
    }

    @Test
    public void case45() {
        int n = 23;
        int d = 10;
        int first = -959;
        int last = -750;
        assertEquals(-749, thearray.find(n, d, first, last));
    }

    @Test
    public void case46() {
        int n = 1000000;
        int d = 1000;
        int first = -1000;
        int last = 1000;
        assertEquals(499999000, thearray.find(n, d, first, last));
    }

    @Test
    public void case47() {
        int n = 1000000;
        int d = 0;
        int first = 474;
        int last = 474;
        assertEquals(474, thearray.find(n, d, first, last));
    }

    @Test
    public void case48() {
        int n = 100;
        int d = 3;
        int first = 2;
        int last = 9;
        assertEquals(153, thearray.find(n, d, first, last));
    }

    @Test
    public void case49() {
        int n = 1000000;
        int d = 1;
        int first = 1;
        int last = 2;
        assertEquals(500001, thearray.find(n, d, first, last));
    }

    @Test
    public void case50() {
        int n = 4;
        int d = 5;
        int first = 0;
        int last = 0;
        assertEquals(5, thearray.find(n, d, first, last));
    }

    @Test
    public void case51() {
        int n = 10000;
        int d = 5;
        int first = 5;
        int last = 4;
        assertEquals(25000, thearray.find(n, d, first, last));
    }

    @Test
    public void case52() {
        int n = 997901;
        int d = 313;
        int first = 997;
        int last = -913;
        assertEquals(156171376, thearray.find(n, d, first, last));
    }

    @Test
    public void case53() {
        int n = 3;
        int d = 100;
        int first = 1;
        int last = 0;
        assertEquals(100, thearray.find(n, d, first, last));
    }

    @Test
    public void case54() {
        int n = 4;
        int d = 3;
        int first = 2;
        int last = 2;
        assertEquals(5, thearray.find(n, d, first, last));
    }

    @Test
    public void case55() {
        int n = 7;
        int d = 8;
        int first = 1;
        int last = 11;
        assertEquals(27, thearray.find(n, d, first, last));
    }

    @Test
    public void case56() {
        int n = 2;
        int d = 10;
        int first = 0;
        int last = 10;
        assertEquals(10, thearray.find(n, d, first, last));
    }

    @Test
    public void case57() {
        int n = 5;
        int d = 2;
        int first = 2;
        int last = 5;
        assertEquals(7, thearray.find(n, d, first, last));
    }

    @Test
    public void case58() {
        int n = 20;
        int d = 100;
        int first = 999;
        int last = 100;
        assertEquals(1499, thearray.find(n, d, first, last));
    }

    @Test
    public void case59() {
        int n = 2;
        int d = 1;
        int first = 2;
        int last = 3;
        assertEquals(3, thearray.find(n, d, first, last));
    }

    @Test
    public void case60() {
        int n = 30;
        int d = 10;
        int first = 30;
        int last = 20;
        assertEquals(170, thearray.find(n, d, first, last));
    }

    @Test
    public void case61() {
        int n = 2;
        int d = 10;
        int first = 2;
        int last = 2;
        assertEquals(2, thearray.find(n, d, first, last));
    }

    @Test
    public void case62() {
        int n = 100;
        int d = 1000;
        int first = 1;
        int last = 1000;
        assertEquals(50000, thearray.find(n, d, first, last));
    }

    @Test
    public void case63() {
        int n = 1000000;
        int d = 1000;
        int first = 1;
        int last = 1;
        assertEquals(499999001, thearray.find(n, d, first, last));
    }

    @Test
    public void case64() {
        int n = 3;
        int d = 2;
        int first = 1;
        int last = 5;
        assertEquals(5, thearray.find(n, d, first, last));
    }

    @Test
    public void case65() {
        int n = 1000000;
        int d = 1000;
        int first = -1000;
        int last = -999;
        assertEquals(499998001, thearray.find(n, d, first, last));
    }

    @Test
    public void case66() {
        int n = 2;
        int d = 3;
        int first = 2;
        int last = 4;
        assertEquals(4, thearray.find(n, d, first, last));
    }

    @Test
    public void case67() {
        int n = 2;
        int d = 3;
        int first = 5;
        int last = 2;
        assertEquals(5, thearray.find(n, d, first, last));
    }

    @Test
    public void case68() {
        int n = 2;
        int d = 239;
        int first = -5;
        int last = 55;
        assertEquals(55, thearray.find(n, d, first, last));
    }

    @Test
    public void case69() {
        int n = 2;
        int d = 8;
        int first = 5;
        int last = 10;
        assertEquals(10, thearray.find(n, d, first, last));
    }

    @Test
    public void case70() {
        int n = 3;
        int d = 2;
        int first = 3;
        int last = 4;
        assertEquals(5, thearray.find(n, d, first, last));
    }

    @Test
    public void case71() {
        int n = 3;
        int d = 2;
        int first = 100;
        int last = 100;
        assertEquals(102, thearray.find(n, d, first, last));
    }

    @Test
    public void case72() {
        int n = 2;
        int d = 5;
        int first = 5;
        int last = 3;
        assertEquals(5, thearray.find(n, d, first, last));
    }

    @Test
    public void case73() {
        int n = 1000000;
        int d = 1000;
        int first = 1000;
        int last = 1000;
        assertEquals(500000000, thearray.find(n, d, first, last));
    }

    @Test
    public void case74() {
        int n = 4;
        int d = 1000;
        int first = -1000;
        int last = 1000;
        assertEquals(1000, thearray.find(n, d, first, last));
    }

    @Test
    public void case75() {
        int n = 1000000;
        int d = 2;
        int first = -1;
        int last = 1;
        assertEquals(999999, thearray.find(n, d, first, last));
    }

    @Test
    public void case76() {
        int n = 3;
        int d = 5;
        int first = 2;
        int last = 1;
        assertEquals(6, thearray.find(n, d, first, last));
    }

    @Test
    public void case77() {
        int n = 1000000;
        int d = 1000;
        int first = 0;
        int last = 0;
        assertEquals(499999000, thearray.find(n, d, first, last));
    }

    @Test
    public void case78() {
        int n = 3;
        int d = 100;
        int first = 100;
        int last = 100;
        assertEquals(200, thearray.find(n, d, first, last));
    }

    @Test
    public void case79() {
        int n = 2;
        int d = 10;
        int first = 0;
        int last = 2;
        assertEquals(2, thearray.find(n, d, first, last));
    }

    @Test
    public void case80() {
        int n = 3;
        int d = 4;
        int first = 4;
        int last = 4;
        assertEquals(8, thearray.find(n, d, first, last));
    }

    @Test
    public void case81() {
        int n = 2;
        int d = 10;
        int first = 0;
        int last = 0;
        assertEquals(0, thearray.find(n, d, first, last));
    }

    @Test
    public void case82() {
        int n = 2;
        int d = 1;
        int first = 5;
        int last = 4;
        assertEquals(5, thearray.find(n, d, first, last));
    }

    @Test
    public void case83() {
        int n = 2;
        int d = 5;
        int first = 1;
        int last = 3;
        assertEquals(3, thearray.find(n, d, first, last));
    }

    @Test
    public void case84() {
        int n = 2;
        int d = 298;
        int first = -2;
        int last = -1;
        assertEquals(-1, thearray.find(n, d, first, last));
    }

    @Test
    public void case85() {
        int n = 1000000;
        int d = 1;
        int first = 1;
        int last = 1;
        assertEquals(500000, thearray.find(n, d, first, last));
    }

    @Test
    public void case86() {
        int n = 3;
        int d = 1;
        int first = 2;
        int last = 3;
        assertEquals(3, thearray.find(n, d, first, last));
    }

    @Test
    public void case87() {
        int n = 3;
        int d = 1;
        int first = 1;
        int last = 1;
        assertEquals(2, thearray.find(n, d, first, last));
    }

    @Test
    public void case88() {
        int n = 100000;
        int d = 10;
        int first = 10;
        int last = 9;
        assertEquals(500000, thearray.find(n, d, first, last));
    }

    @Test
    public void case89() {
        int n = 2;
        int d = 2;
        int first = 12;
        int last = 14;
        assertEquals(14, thearray.find(n, d, first, last));
    }

    @Test
    public void case90() {
        int n = 2;
        int d = 2;
        int first = 7;
        int last = 7;
        assertEquals(7, thearray.find(n, d, first, last));
    }

    @Test
    public void case91() {
        int n = 1000000;
        int d = 1000;
        int first = 474;
        int last = 474;
        assertEquals(499999474, thearray.find(n, d, first, last));
    }

    @Test
    public void case92() {
        int n = 2;
        int d = 1;
        int first = 3;
        int last = 2;
        assertEquals(3, thearray.find(n, d, first, last));
    }

    @Test
    public void case93() {
        int n = 3;
        int d = 3;
        int first = 10;
        int last = 10;
        assertEquals(13, thearray.find(n, d, first, last));
    }

    @Test
    public void case94() {
        int n = 1000000;
        int d = 1;
        int first = 0;
        int last = 0;
        assertEquals(499999, thearray.find(n, d, first, last));
    }

    @Test
    public void case95() {
        int n = 3;
        int d = 1;
        int first = -1;
        int last = -1;
        assertEquals(0, thearray.find(n, d, first, last));
    }

    @Test
    public void case96() {
        int n = 100000;
        int d = 5;
        int first = 345;
        int last = 23;
        assertEquals(250180, thearray.find(n, d, first, last));
    }

    @Test
    public void case97() {
        int n = 2;
        int d = 100;
        int first = 1;
        int last = 1;
        assertEquals(1, thearray.find(n, d, first, last));
    }

    @Test
    public void case98() {
        int n = 4;
        int d = 5;
        int first = 2;
        int last = 4;
        assertEquals(9, thearray.find(n, d, first, last));
    }

    @Test
    public void case99() {
        int n = 4;
        int d = 10;
        int first = -5;
        int last = -6;
        assertEquals(5, thearray.find(n, d, first, last));
    }

    @Test
    public void case100() {
        int n = 3;
        int d = 3;
        int first = 5;
        int last = 3;
        assertEquals(6, thearray.find(n, d, first, last));
    }

    @Test
    public void case101() {
        int n = 5;
        int d = 1;
        int first = 0;
        int last = 0;
        assertEquals(2, thearray.find(n, d, first, last));
    }

    @Test
    public void case102() {
        int n = 3;
        int d = 6;
        int first = 1;
        int last = 9;
        assertEquals(9, thearray.find(n, d, first, last));
    }

    @Test
    public void case103() {
        int n = 4;
        int d = 100;
        int first = 98;
        int last = 100;
        assertEquals(200, thearray.find(n, d, first, last));
    }

    @Test
    public void case104() {
        int n = 10;
        int d = 0;
        int first = 1;
        int last = 1;
        assertEquals(1, thearray.find(n, d, first, last));
    }

    @Test
    public void case105() {
        int n = 2;
        int d = 3;
        int first = 1;
        int last = 2;
        assertEquals(2, thearray.find(n, d, first, last));
    }

    @Test
    public void case106() {
        int n = 2;
        int d = 2;
        int first = 2;
        int last = 4;
        assertEquals(4, thearray.find(n, d, first, last));
    }

    @Test
    public void case107() {
        int n = 2;
        int d = 1;
        int first = 1;
        int last = 2;
        assertEquals(2, thearray.find(n, d, first, last));
    }

    @Test
    public void case108() {
        int n = 2;
        int d = 2;
        int first = -3;
        int last = -5;
        assertEquals(-3, thearray.find(n, d, first, last));
    }

    @Test
    public void case109() {
        int n = 2;
        int d = 7;
        int first = -657;
        int last = -654;
        assertEquals(-654, thearray.find(n, d, first, last));
    }

    @Test
    public void case110() {
        int n = 31;
        int d = 509;
        int first = 64;
        int last = 42;
        assertEquals(7677, thearray.find(n, d, first, last));
    }

    @Test
    public void case111() {
        int n = 3;
        int d = 100;
        int first = 100;
        int last = 299;
        assertEquals(299, thearray.find(n, d, first, last));
    }

    @Test
    public void case112() {
        int n = 4;
        int d = 5;
        int first = 0;
        int last = 15;
        assertEquals(15, thearray.find(n, d, first, last));
    }

    @Test
    public void case113() {
        int n = 3;
        int d = 7;
        int first = 10;
        int last = 10;
        assertEquals(17, thearray.find(n, d, first, last));
    }

    @Test
    public void case114() {
        int n = 3;
        int d = 3;
        int first = 4;
        int last = 7;
        assertEquals(7, thearray.find(n, d, first, last));
    }

    @Test
    public void case115() {
        int n = 3;
        int d = 4;
        int first = 7;
        int last = 4;
        assertEquals(8, thearray.find(n, d, first, last));
    }

    @Test
    public void case116() {
        int n = 2;
        int d = 5;
        int first = -3;
        int last = 0;
        assertEquals(0, thearray.find(n, d, first, last));
    }

    @Test
    public void case117() {
        int n = 2;
        int d = 10;
        int first = 7;
        int last = 16;
        assertEquals(16, thearray.find(n, d, first, last));
    }

    @Test
    public void case118() {
        int n = 3;
        int d = 10;
        int first = 20;
        int last = 20;
        assertEquals(30, thearray.find(n, d, first, last));
    }

    @Test
    public void case119() {
        int n = 2;
        int d = 1;
        int first = 4;
        int last = 5;
        assertEquals(5, thearray.find(n, d, first, last));
    }

    @Test
    public void case120() {
        int n = 97;
        int d = 53;
        int first = 441;
        int last = -92;
        assertEquals(2717, thearray.find(n, d, first, last));
    }

    @Test
    public void case121() {
        int n = 3;
        int d = 5;
        int first = 10;
        int last = 5;
        assertEquals(10, thearray.find(n, d, first, last));
    }

    @Test
    public void case122() {
        int n = 330465;
        int d = 961;
        int first = 35;
        int last = -858;
        assertEquals(158787094, thearray.find(n, d, first, last));
    }

    @Test
    public void case123() {
        int n = 1000000;
        int d = 987;
        int first = -619;
        int last = -718;
        assertEquals(493498394, thearray.find(n, d, first, last));
    }

    @Test
    public void case124() {
        int n = 3;
        int d = 3;
        int first = 0;
        int last = -2;
        assertEquals(1, thearray.find(n, d, first, last));
    }

    @Test
    public void case125() {
        int n = 1000000;
        int d = 1000;
        int first = 123;
        int last = 765;
        assertEquals(499999765, thearray.find(n, d, first, last));
    }

}
