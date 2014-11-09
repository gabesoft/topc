package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class PairGameTest {
    PairGame pairgame = new PairGame();

    @Test
    public void case1() {
        int a = 1;
        int b = 2;
        int c = 2;
        int d = 1;
        assertEquals(2, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case2() {
        int a = 15;
        int b = 4;
        int c = 10;
        int d = 7;
        assertEquals(7, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case3() {
        int a = 1;
        int b = 1;
        int c = 10;
        int d = 10;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case4() {
        int a = 1000;
        int b = 1001;
        int c = 2000;
        int d = 2001;
        assertEquals(1001, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case5() {
        int a = 10944;
        int b = 17928;
        int c = 7704;
        int d = 21888;
        assertEquals(144, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case6() {
        int a = 1;
        int b = 1;
        int c = 1;
        int d = 1;
        assertEquals(2, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case7() {
        int a = 736;
        int b = 184;
        int c = 828;
        int d = 552;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case8() {
        int a = 788;
        int b = 197;
        int c = 197;
        int d = 985;
        assertEquals(394, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case9() {
        int a = 596;
        int b = 596;
        int c = 596;
        int d = 596;
        assertEquals(1192, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case10() {
        int a = 664;
        int b = 166;
        int c = 332;
        int d = 332;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case11() {
        int a = 968;
        int b = 88;
        int c = 528;
        int d = 880;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case12() {
        int a = 315;
        int b = 945;
        int c = 315;
        int d = 315;
        assertEquals(630, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case13() {
        int a = 640;
        int b = 304;
        int c = 376;
        int d = 240;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case14() {
        int a = 45;
        int b = 63;
        int c = 306;
        int d = 279;
        assertEquals(18, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case15() {
        int a = 968;
        int b = 880;
        int c = 792;
        int d = 176;
        assertEquals(264, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case16() {
        int a = 490;
        int b = 90;
        int c = 420;
        int d = 204;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case17() {
        int a = 888;
        int b = 784;
        int c = 152;
        int d = 360;
        assertEquals(16, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case18() {
        int a = 246;
        int b = 942;
        int c = 246;
        int d = 666;
        assertEquals(12, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case19() {
        int a = 159;
        int b = 371;
        int c = 556;
        int d = 699;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case20() {
        int a = 595;
        int b = 595;
        int c = 595;
        int d = 595;
        assertEquals(1190, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case21() {
        int a = 640;
        int b = 640;
        int c = 440;
        int d = 920;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case22() {
        int a = 476;
        int b = 476;
        int c = 476;
        int d = 952;
        assertEquals(952, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case23() {
        int a = 996;
        int b = 390;
        int c = 811;
        int d = 539;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case24() {
        int a = 330;
        int b = 195;
        int c = 843;
        int d = 897;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case25() {
        int a = 702;
        int b = 702;
        int c = 702;
        int d = 351;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case26() {
        int a = 460;
        int b = 460;
        int c = 460;
        int d = 460;
        assertEquals(920, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case27() {
        int a = 505568;
        int b = 505568;
        int c = 505568;
        int d = 505568;
        assertEquals(1011136, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case28() {
        int a = 6423;
        int b = 6423;
        int c = 6423;
        int d = 6423;
        assertEquals(12846, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case29() {
        int a = 5;
        int b = 10;
        int c = 5;
        int d = 10;
        assertEquals(15, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case30() {
        int a = 517241;
        int b = 517241;
        int c = 517241;
        int d = 517241;
        assertEquals(1034482, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case31() {
        int a = 5912;
        int b = 4288;
        int c = 7632;
        int d = 7736;
        assertEquals(16, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case32() {
        int a = 57590;
        int b = 57590;
        int c = 57590;
        int d = 57590;
        assertEquals(115180, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case33() {
        int a = 117972;
        int b = 976320;
        int c = 760716;
        int d = 65088;
        assertEquals(8136, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case34() {
        int a = 243720;
        int b = 963472;
        int c = 101136;
        int d = 179168;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case35() {
        int a = 604608;
        int b = 604608;
        int c = 604608;
        int d = 604608;
        assertEquals(1209216, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case36() {
        int a = 90528;
        int b = 39744;
        int c = 78016;
        int d = 23552;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case37() {
        int a = 12;
        int b = 32;
        int c = 88;
        int d = 12;
        assertEquals(12, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case38() {
        int a = 852;
        int b = 923;
        int c = 923;
        int d = 568;
        assertEquals(213, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case39() {
        int a = 9351;
        int b = 9351;
        int c = 9351;
        int d = 9351;
        assertEquals(18702, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case40() {
        int a = 50142;
        int b = 902556;
        int c = 183854;
        int d = 802272;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case41() {
        int a = 79;
        int b = 79;
        int c = 79;
        int d = 79;
        assertEquals(158, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case42() {
        int a = 840;
        int b = 483;
        int c = 378;
        int d = 546;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case43() {
        int a = 72008;
        int b = 72008;
        int c = 72008;
        int d = 72008;
        assertEquals(144016, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case44() {
        int a = 60043;
        int b = 60043;
        int c = 60043;
        int d = 60043;
        assertEquals(120086, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case45() {
        int a = 927228;
        int b = 120756;
        int c = 548262;
        int d = 800082;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case46() {
        int a = 43;
        int b = 62;
        int c = 75;
        int d = 46;
        assertEquals(2, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case47() {
        int a = 17;
        int b = 17;
        int c = 17;
        int d = 17;
        assertEquals(34, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case48() {
        int a = 38896;
        int b = 79288;
        int c = 81158;
        int d = 93126;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case49() {
        int a = 66;
        int b = 66;
        int c = 66;
        int d = 66;
        assertEquals(132, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case50() {
        int a = 54;
        int b = 54;
        int c = 54;
        int d = 54;
        assertEquals(108, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case51() {
        int a = 848;
        int b = 848;
        int c = 848;
        int d = 848;
        assertEquals(1696, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case52() {
        int a = 4140;
        int b = 4230;
        int c = 300;
        int d = 3470;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case53() {
        int a = 994;
        int b = 994;
        int c = 994;
        int d = 994;
        assertEquals(1988, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case54() {
        int a = 16;
        int b = 16;
        int c = 16;
        int d = 16;
        assertEquals(32, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case55() {
        int a = 582;
        int b = 582;
        int c = 582;
        int d = 582;
        assertEquals(1164, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case56() {
        int a = 552707;
        int b = 552707;
        int c = 552707;
        int d = 552707;
        assertEquals(1105414, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case57() {
        int a = 938658;
        int b = 871611;
        int c = 670470;
        int d = 134094;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case58() {
        int a = 61;
        int b = 61;
        int c = 61;
        int d = 61;
        assertEquals(122, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case59() {
        int a = 26;
        int b = 26;
        int c = 60;
        int d = 100;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case60() {
        int a = 9;
        int b = 9;
        int c = 9;
        int d = 9;
        assertEquals(18, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case61() {
        int a = 90317;
        int b = 90317;
        int c = 90317;
        int d = 90317;
        assertEquals(180634, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case62() {
        int a = 140322;
        int b = 870870;
        int c = 381654;
        int d = 869232;
        assertEquals(1638, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case63() {
        int a = 85873;
        int b = 85873;
        int c = 85873;
        int d = 85873;
        assertEquals(171746, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case64() {
        int a = 116910;
        int b = 961260;
        int c = 844350;
        int d = 785895;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case65() {
        int a = 9063;
        int b = 1855;
        int c = 9593;
        int d = 3339;
        assertEquals(212, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case66() {
        int a = 98475;
        int b = 98735;
        int c = 71825;
        int d = 86190;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case67() {
        int a = 7289;
        int b = 7289;
        int c = 7289;
        int d = 7289;
        assertEquals(14578, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case68() {
        int a = 20462;
        int b = 83422;
        int c = 27545;
        int d = 97588;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case69() {
        int a = 104950;
        int b = 104950;
        int c = 104950;
        int d = 104950;
        assertEquals(209900, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case70() {
        int a = 185;
        int b = 185;
        int c = 185;
        int d = 185;
        assertEquals(370, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case71() {
        int a = 30;
        int b = 30;
        int c = 60;
        int d = 30;
        assertEquals(60, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case72() {
        int a = 89208;
        int b = 28944;
        int c = 51474;
        int d = 7524;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case73() {
        int a = 66206;
        int b = 94580;
        int c = 9458;
        int d = 85122;
        assertEquals(37832, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case74() {
        int a = 828156;
        int b = 828156;
        int c = 828156;
        int d = 828156;
        assertEquals(1656312, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case75() {
        int a = 7800;
        int b = 5800;
        int c = 8400;
        int d = 9600;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case76() {
        int a = 7;
        int b = 7;
        int c = 7;
        int d = 7;
        assertEquals(14, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case77() {
        int a = 19932;
        int b = 77916;
        int c = 4228;
        int d = 15100;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case78() {
        int a = 98399;
        int b = 98399;
        int c = 98399;
        int d = 98399;
        assertEquals(196798, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case79() {
        int a = 66;
        int b = 12;
        int c = 36;
        int d = 54;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case80() {
        int a = 2920;
        int b = 27590;
        int c = 67760;
        int d = 9110;
        assertEquals(30, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case81() {
        int a = 900274;
        int b = 450137;
        int c = 450137;
        int d = 450137;
        assertEquals(900274, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case82() {
        int a = 337413;
        int b = 430740;
        int c = 366129;
        int d = 524067;
        assertEquals(14358, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case83() {
        int a = 5544;
        int b = 6600;
        int c = 7788;
        int d = 6006;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case84() {
        int a = 303677;
        int b = 303677;
        int c = 303677;
        int d = 303677;
        assertEquals(607354, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case85() {
        int a = 18;
        int b = 34;
        int c = 9;
        int d = 90;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case86() {
        int a = 499;
        int b = 499;
        int c = 499;
        int d = 499;
        assertEquals(998, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case87() {
        int a = 6;
        int b = 6;
        int c = 6;
        int d = 6;
        assertEquals(12, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case88() {
        int a = 18410;
        int b = 67253;
        int c = 98370;
        int d = 8581;
        assertEquals(3, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case89() {
        int a = 2067;
        int b = 2067;
        int c = 2067;
        int d = 2067;
        assertEquals(4134, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case90() {
        int a = 7200;
        int b = 3600;
        int c = 7200;
        int d = 7200;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case91() {
        int a = 546295;
        int b = 218518;
        int c = 546295;
        int d = 109259;
        assertEquals(218518, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case92() {
        int a = 52248;
        int b = 731472;
        int c = 409276;
        int d = 104496;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case93() {
        int a = 9586;
        int b = 9586;
        int c = 9586;
        int d = 9586;
        assertEquals(19172, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case94() {
        int a = 8;
        int b = 4;
        int c = 10;
        int d = 48;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case95() {
        int a = 60788;
        int b = 5010;
        int c = 30227;
        int d = 51436;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case96() {
        int a = 61584;
        int b = 61584;
        int c = 61584;
        int d = 61584;
        assertEquals(123168, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case97() {
        int a = 6106;
        int b = 3124;
        int c = 1988;
        int d = 5964;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case98() {
        int a = 76422;
        int b = 76422;
        int c = 76422;
        int d = 76422;
        assertEquals(152844, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case99() {
        int a = 22800;
        int b = 54800;
        int c = 58200;
        int d = 48300;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case100() {
        int a = 8;
        int b = 8;
        int c = 8;
        int d = 8;
        assertEquals(16, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case101() {
        int a = 842450;
        int b = 842450;
        int c = 842450;
        int d = 842450;
        assertEquals(1684900, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case102() {
        int a = 6014;
        int b = 6014;
        int c = 6014;
        int d = 6014;
        assertEquals(12028, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case103() {
        int a = 49227;
        int b = 49227;
        int c = 98454;
        int d = 98454;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case104() {
        int a = 978129;
        int b = 978129;
        int c = 978129;
        int d = 978129;
        assertEquals(1956258, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case105() {
        int a = 295800;
        int b = 887400;
        int c = 347072;
        int d = 173536;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case106() {
        int a = 1;
        int b = 1000000;
        int c = 1;
        int d = 6;
        assertEquals(7, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case107() {
        int a = 1;
        int b = 1000000;
        int c = 1000000;
        int d = 1;
        assertEquals(2, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case108() {
        int a = 1000000;
        int b = 1;
        int c = 1;
        int d = 1000000;
        assertEquals(2, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case109() {
        int a = 1000000;
        int b = 1;
        int c = 500000;
        int d = 1;
        assertEquals(500001, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case110() {
        int a = 1000000;
        int b = 1;
        int c = 999999;
        int d = 2;
        assertEquals(2, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case111() {
        int a = 1000000;
        int b = 1;
        int c = 1000000;
        int d = 1;
        assertEquals(1000001, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case112() {
        int a = 2;
        int b = 1;
        int c = 4;
        int d = 2;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case113() {
        int a = 1000000;
        int b = 999999;
        int c = 1000000;
        int d = 999999;
        assertEquals(1999999, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case114() {
        int a = 1;
        int b = 1000000;
        int c = 1;
        int d = 10000;
        assertEquals(10001, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case115() {
        int a = 100;
        int b = 1;
        int c = 100;
        int d = 1;
        assertEquals(101, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case116() {
        int a = 1;
        int b = 1000000;
        int c = 1000000;
        int d = 2;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case117() {
        int a = 1;
        int b = 1000000;
        int c = 2;
        int d = 1000000;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case118() {
        int a = 2;
        int b = 2;
        int c = 4;
        int d = 4;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case119() {
        int a = 1000000;
        int b = 3;
        int c = 1000000;
        int d = 1;
        assertEquals(2, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case120() {
        int a = 1000000;
        int b = 1;
        int c = 1;
        int d = 1;
        assertEquals(2, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case121() {
        int a = 1;
        int b = 1000000;
        int c = 1000000;
        int d = 999983;
        assertEquals(2, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case122() {
        int a = 2;
        int b = 5;
        int c = 2;
        int d = 5;
        assertEquals(7, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case123() {
        int a = 999998;
        int b = 999999;
        int c = 999999;
        int d = 999999;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case124() {
        int a = 29;
        int b = 37;
        int c = 3;
        int d = 5;
        assertEquals(2, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case125() {
        int a = 1;
        int b = 999999;
        int c = 999999;
        int d = 1;
        assertEquals(2, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case126() {
        int a = 7;
        int b = 10;
        int c = 7;
        int d = 3;
        assertEquals(10, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case127() {
        int a = 1;
        int b = 1000000;
        int c = 1;
        int d = 1000000;
        assertEquals(1000001, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case128() {
        int a = 9999;
        int b = 1;
        int c = 10000;
        int d = 1;
        assertEquals(10000, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case129() {
        int a = 1;
        int b = 1;
        int c = 1;
        int d = 1000;
        assertEquals(2, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case130() {
        int a = 1;
        int b = 1;
        int c = 10;
        int d = 5;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case131() {
        int a = 6;
        int b = 6;
        int c = 2;
        int d = 2;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case132() {
        int a = 1000000;
        int b = 2;
        int c = 1;
        int d = 1000000;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case133() {
        int a = 2;
        int b = 2;
        int c = 2;
        int d = 1;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case134() {
        int a = 12345;
        int b = 94321;
        int c = 9153;
        int d = 15124;
        assertEquals(7, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case135() {
        int a = 2;
        int b = 999999;
        int c = 2;
        int d = 1000000;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case136() {
        int a = 10;
        int b = 10;
        int c = 1;
        int d = 2;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case137() {
        int a = 8;
        int b = 5;
        int c = 55;
        int d = 89;
        assertEquals(13, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case138() {
        int a = 1;
        int b = 1000000;
        int c = 999999;
        int d = 1000000;
        assertEquals(2, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case139() {
        int a = 100;
        int b = 5;
        int c = 100;
        int d = 5;
        assertEquals(105, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case140() {
        int a = 1000000;
        int b = 999999;
        int c = 999999;
        int d = 1000000;
        assertEquals(2, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case141() {
        int a = 1;
        int b = 1;
        int c = 1000000;
        int d = 999998;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case142() {
        int a = 1000000;
        int b = 1;
        int c = 1000000;
        int d = 2;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case143() {
        int a = 2;
        int b = 1000000;
        int c = 3;
        int d = 1000000;
        assertEquals(-1, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case144() {
        int a = 3;
        int b = 5;
        int c = 46368;
        int d = 770545;
        assertEquals(8, pairgame.maxSum(a, b, c, d));
    }

    @Test
    public void case145() {
        int a = 25;
        int b = 16;
        int c = 12;
        int d = 29;
        assertEquals(7, pairgame.maxSum(a, b, c, d));
    }

}
