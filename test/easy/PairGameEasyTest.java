package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class PairGameEasyTest {
    PairGameEasy pairgameeasy = new PairGameEasy();

    @Test
    public void case1() {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 5;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case2() {
        int a = 1;
        int b = 2;
        int c = 2;
        int d = 1;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case3() {
        int a = 2;
        int b = 2;
        int c = 2;
        int d = 999;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case4() {
        int a = 2;
        int b = 2;
        int c = 2;
        int d = 1000;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case5() {
        int a = 47;
        int b = 58;
        int c = 384;
        int d = 221;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case6() {
        int a = 1000;
        int b = 1000;
        int c = 1000;
        int d = 1000;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case7() {
        int a = 3;
        int b = 2;
        int c = 19;
        int d = 26;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case8() {
        int a = 8;
        int b = 685;
        int c = 8;
        int d = 685;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case9() {
        int a = 7;
        int b = 88;
        int c = 299;
        int d = 496;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case10() {
        int a = 28;
        int b = 492;
        int c = 28;
        int d = 492;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case11() {
        int a = 583;
        int b = 609;
        int c = 583;
        int d = 609;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case12() {
        int a = 8;
        int b = 9;
        int c = 8;
        int d = 9;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case13() {
        int a = 635;
        int b = 24;
        int c = 635;
        int d = 24;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case14() {
        int a = 786;
        int b = 23;
        int c = 809;
        int d = 832;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case15() {
        int a = 341;
        int b = 242;
        int c = 341;
        int d = 242;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case16() {
        int a = 6;
        int b = 7;
        int c = 13;
        int d = 7;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case17() {
        int a = 1;
        int b = 4;
        int c = 62;
        int d = 45;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case18() {
        int a = 77;
        int b = 711;
        int c = 77;
        int d = 711;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case19() {
        int a = 127;
        int b = 310;
        int c = 127;
        int d = 310;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case20() {
        int a = 8;
        int b = 2;
        int c = 26;
        int d = 66;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case21() {
        int a = 69;
        int b = 31;
        int c = 69;
        int d = 31;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case22() {
        int a = 1;
        int b = 18;
        int c = 194;
        int d = 431;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case23() {
        int a = 8;
        int b = 6;
        int c = 346;
        int d = 124;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case24() {
        int a = 923;
        int b = 8;
        int c = 923;
        int d = 8;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case25() {
        int a = 8;
        int b = 971;
        int c = 8;
        int d = 971;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case26() {
        int a = 64;
        int b = 32;
        int c = 160;
        int d = 96;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case27() {
        int a = 40;
        int b = 63;
        int c = 38;
        int d = 49;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case28() {
        int a = 564;
        int b = 561;
        int c = 3;
        int d = 558;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case29() {
        int a = 831;
        int b = 16;
        int c = 831;
        int d = 16;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case30() {
        int a = 507;
        int b = 341;
        int c = 139;
        int d = 287;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case31() {
        int a = 84;
        int b = 223;
        int c = 35;
        int d = 32;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case32() {
        int a = 29;
        int b = 874;
        int c = 29;
        int d = 874;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case33() {
        int a = 79;
        int b = 67;
        int c = 362;
        int d = 583;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case34() {
        int a = 68;
        int b = 41;
        int c = 68;
        int d = 41;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case35() {
        int a = 9;
        int b = 44;
        int c = 9;
        int d = 44;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case36() {
        int a = 8;
        int b = 91;
        int c = 8;
        int d = 91;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case37() {
        int a = 42;
        int b = 35;
        int c = 42;
        int d = 35;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case38() {
        int a = 579;
        int b = 570;
        int c = 9;
        int d = 552;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case39() {
        int a = 7;
        int b = 1;
        int c = 177;
        int d = 817;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case40() {
        int a = 29;
        int b = 24;
        int c = 5;
        int d = 9;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case41() {
        int a = 774;
        int b = 292;
        int c = 74;
        int d = 14;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case42() {
        int a = 2;
        int b = 88;
        int c = 626;
        int d = 268;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case43() {
        int a = 268;
        int b = 296;
        int c = 268;
        int d = 296;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case44() {
        int a = 990;
        int b = 4;
        int c = 990;
        int d = 4;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case45() {
        int a = 88;
        int b = 5;
        int c = 88;
        int d = 5;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case46() {
        int a = 141;
        int b = 661;
        int c = 35;
        int d = 9;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case47() {
        int a = 72;
        int b = 239;
        int c = 8;
        int d = 87;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case48() {
        int a = 939;
        int b = 948;
        int c = 7;
        int d = 80;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case49() {
        int a = 468;
        int b = 3;
        int c = 67;
        int d = 980;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case50() {
        int a = 95;
        int b = 2;
        int c = 862;
        int d = 23;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case51() {
        int a = 923;
        int b = 10;
        int c = 95;
        int d = 4;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case52() {
        int a = 6;
        int b = 19;
        int c = 1;
        int d = 9;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case53() {
        int a = 351;
        int b = 17;
        int c = 9;
        int d = 63;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case54() {
        int a = 5;
        int b = 52;
        int c = 60;
        int d = 2;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case55() {
        int a = 638;
        int b = 33;
        int c = 59;
        int d = 56;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case56() {
        int a = 48;
        int b = 85;
        int c = 56;
        int d = 53;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case57() {
        int a = 6;
        int b = 16;
        int c = 61;
        int d = 4;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case58() {
        int a = 7;
        int b = 1;
        int c = 489;
        int d = 948;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case59() {
        int a = 87;
        int b = 612;
        int c = 304;
        int d = 10;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case60() {
        int a = 571;
        int b = 73;
        int c = 862;
        int d = 177;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case61() {
        int a = 72;
        int b = 112;
        int c = 6;
        int d = 151;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case62() {
        int a = 279;
        int b = 18;
        int c = 7;
        int d = 3;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case63() {
        int a = 3;
        int b = 8;
        int c = 5;
        int d = 833;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case64() {
        int a = 20;
        int b = 37;
        int c = 89;
        int d = 140;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case65() {
        int a = 151;
        int b = 115;
        int c = 33;
        int d = 572;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case66() {
        int a = 3;
        int b = 214;
        int c = 50;
        int d = 7;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case67() {
        int a = 1;
        int b = 2;
        int c = 999;
        int d = 1000;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case68() {
        int a = 1;
        int b = 1;
        int c = 1000;
        int d = 1000;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case69() {
        int a = 2;
        int b = 1;
        int c = 1;
        int d = 2;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case70() {
        int a = 1;
        int b = 1;
        int c = 998;
        int d = 994;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case71() {
        int a = 1;
        int b = 1;
        int c = 1;
        int d = 1;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case72() {
        int a = 3;
        int b = 2;
        int c = 1;
        int d = 1000;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case73() {
        int a = 1;
        int b = 2;
        int c = 1;
        int d = 2;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case74() {
        int a = 1;
        int b = 1;
        int c = 10;
        int d = 12;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case75() {
        int a = 3;
        int b = 6;
        int c = 6;
        int d = 9;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case76() {
        int a = 4;
        int b = 6;
        int c = 6;
        int d = 8;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case77() {
        int a = 1;
        int b = 2;
        int c = 4;
        int d = 4;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case78() {
        int a = 7;
        int b = 9;
        int c = 10;
        int d = 11;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case79() {
        int a = 5;
        int b = 6;
        int c = 15;
        int d = 18;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case80() {
        int a = 4;
        int b = 1;
        int c = 5;
        int d = 1;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case81() {
        int a = 2;
        int b = 2;
        int c = 6;
        int d = 4;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case82() {
        int a = 1;
        int b = 1;
        int c = 200;
        int d = 200;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case83() {
        int a = 1;
        int b = 1;
        int c = 1;
        int d = 1000;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case84() {
        int a = 1;
        int b = 2;
        int c = 4;
        int d = 3;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case85() {
        int a = 789;
        int b = 789;
        int c = 1;
        int d = 1000;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case86() {
        int a = 5;
        int b = 7;
        int c = 5;
        int d = 13;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case87() {
        int a = 3;
        int b = 3;
        int c = 4;
        int d = 4;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case88() {
        int a = 2;
        int b = 3;
        int c = 5;
        int d = 4;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case89() {
        int a = 5;
        int b = 47;
        int c = 20;
        int d = 20;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case90() {
        int a = 1;
        int b = 1;
        int c = 1;
        int d = 2;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case91() {
        int a = 1;
        int b = 1;
        int c = 3;
        int d = 3;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case92() {
        int a = 1;
        int b = 1;
        int c = 1;
        int d = 3;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case93() {
        int a = 2;
        int b = 3;
        int c = 5;
        int d = 11;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case94() {
        int a = 2;
        int b = 2;
        int c = 1000;
        int d = 998;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case95() {
        int a = 7;
        int b = 9;
        int c = 10;
        int d = 10;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case96() {
        int a = 2;
        int b = 2;
        int c = 2;
        int d = 2;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case97() {
        int a = 5;
        int b = 7;
        int c = 7;
        int d = 5;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case98() {
        int a = 2;
        int b = 3;
        int c = 4;
        int d = 6;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case99() {
        int a = 1;
        int b = 3;
        int c = 4;
        int d = 4;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case100() {
        int a = 1;
        int b = 1;
        int c = 5;
        int d = 5;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case101() {
        int a = 5;
        int b = 47;
        int c = 20;
        int d = 200;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case102() {
        int a = 1;
        int b = 10;
        int c = 8;
        int d = 10;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case103() {
        int a = 4;
        int b = 4;
        int c = 800;
        int d = 804;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case104() {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 3;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case105() {
        int a = 5;
        int b = 2;
        int c = 40;
        int d = 7;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case106() {
        int a = 5;
        int b = 3;
        int c = 6;
        int d = 6;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case107() {
        int a = 5;
        int b = 20;
        int c = 20;
        int d = 200;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case108() {
        int a = 999;
        int b = 999;
        int c = 1000;
        int d = 1000;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case109() {
        int a = 2;
        int b = 3;
        int c = 11;
        int d = 11;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case110() {
        int a = 3;
        int b = 2;
        int c = 12;
        int d = 19;
        assertEquals("Able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case111() {
        int a = 1;
        int b = 4;
        int c = 3;
        int d = 2;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case112() {
        int a = 1;
        int b = 1000;
        int c = 1000;
        int d = 1000;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case113() {
        int a = 2;
        int b = 3;
        int c = 2;
        int d = 6;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case114() {
        int a = 1;
        int b = 2;
        int c = 2;
        int d = 3;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

    @Test
    public void case115() {
        int a = 1;
        int b = 2;
        int c = 5;
        int d = 6;
        assertEquals("Not able to generate", pairgameeasy.able(a, b, c, d));
    }

}
