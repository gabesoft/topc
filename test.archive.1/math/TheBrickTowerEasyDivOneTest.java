package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class TheBrickTowerEasyDivOneTest {
    TheBrickTowerEasyDivOne thebricktowereasydivone = new TheBrickTowerEasyDivOne();

    @Test
    public void case1() {
        int redCount = 1;
        int redHeight = 2;
        int blueCount = 3;
        int blueHeight = 4;
        assertEquals(4, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case2() {
        int redCount = 4;
        int redHeight = 4;
        int blueCount = 4;
        int blueHeight = 7;
        assertEquals(12, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case3() {
        int redCount = 7;
        int redHeight = 7;
        int blueCount = 4;
        int blueHeight = 4;
        assertEquals(13, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case4() {
        int redCount = 47;
        int redHeight = 47;
        int blueCount = 47;
        int blueHeight = 47;
        assertEquals(94, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case5() {
        int redCount = 1;
        int redHeight = 1;
        int blueCount = 1;
        int blueHeight = 1;
        assertEquals(2, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case6() {
        int redCount = 1;
        int redHeight = 41;
        int blueCount = 1;
        int blueHeight = 1;
        assertEquals(3, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case7() {
        int redCount = 1;
        int redHeight = 4;
        int blueCount = 2;
        int blueHeight = 4;
        assertEquals(3, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case8() {
        int redCount = 1;
        int redHeight = 1;
        int blueCount = 2;
        int blueHeight = 1;
        assertEquals(3, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case9() {
        int redCount = 1;
        int redHeight = 3;
        int blueCount = 3;
        int blueHeight = 3;
        assertEquals(3, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case10() {
        int redCount = 1;
        int redHeight = 38;
        int blueCount = 3;
        int blueHeight = 1;
        assertEquals(4, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case11() {
        int redCount = 2;
        int redHeight = 34;
        int blueCount = 1;
        int blueHeight = 34;
        assertEquals(3, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case12() {
        int redCount = 2;
        int redHeight = 14;
        int blueCount = 1;
        int blueHeight = 4;
        assertEquals(4, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case13() {
        int redCount = 2;
        int redHeight = 4;
        int blueCount = 2;
        int blueHeight = 4;
        assertEquals(4, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case14() {
        int redCount = 2;
        int redHeight = 33;
        int blueCount = 2;
        int blueHeight = 46;
        assertEquals(6, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case15() {
        int redCount = 2;
        int redHeight = 26;
        int blueCount = 3;
        int blueHeight = 26;
        assertEquals(5, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case16() {
        int redCount = 2;
        int redHeight = 40;
        int blueCount = 3;
        int blueHeight = 1;
        assertEquals(7, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case17() {
        int redCount = 3;
        int redHeight = 8;
        int blueCount = 1;
        int blueHeight = 8;
        assertEquals(3, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case18() {
        int redCount = 3;
        int redHeight = 43;
        int blueCount = 1;
        int blueHeight = 46;
        assertEquals(4, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case19() {
        int redCount = 3;
        int redHeight = 47;
        int blueCount = 2;
        int blueHeight = 47;
        assertEquals(5, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case20() {
        int redCount = 3;
        int redHeight = 3;
        int blueCount = 2;
        int blueHeight = 41;
        assertEquals(7, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case21() {
        int redCount = 3;
        int redHeight = 35;
        int blueCount = 3;
        int blueHeight = 35;
        assertEquals(6, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case22() {
        int redCount = 3;
        int redHeight = 47;
        int blueCount = 3;
        int blueHeight = 11;
        assertEquals(9, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case23() {
        int redCount = 47;
        int redHeight = 24;
        int blueCount = 47;
        int blueHeight = 8;
        assertEquals(141, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case24() {
        int redCount = 1;
        int redHeight = 13;
        int blueCount = 1;
        int blueHeight = 1;
        assertEquals(3, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case25() {
        int redCount = 8;
        int redHeight = 46;
        int blueCount = 9;
        int blueHeight = 6;
        assertEquals(25, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case26() {
        int redCount = 47;
        int redHeight = 38;
        int blueCount = 47;
        int blueHeight = 38;
        assertEquals(94, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case27() {
        int redCount = 45;
        int redHeight = 10;
        int blueCount = 45;
        int blueHeight = 4;
        assertEquals(135, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case28() {
        int redCount = 34;
        int redHeight = 5;
        int blueCount = 33;
        int blueHeight = 5;
        assertEquals(67, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case29() {
        int redCount = 31;
        int redHeight = 45;
        int blueCount = 30;
        int blueHeight = 45;
        assertEquals(61, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case30() {
        int redCount = 34;
        int redHeight = 21;
        int blueCount = 33;
        int blueHeight = 47;
        assertEquals(100, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case31() {
        int redCount = 10;
        int redHeight = 47;
        int blueCount = 47;
        int blueHeight = 47;
        assertEquals(21, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case32() {
        int redCount = 2;
        int redHeight = 47;
        int blueCount = 2;
        int blueHeight = 47;
        assertEquals(4, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case33() {
        int redCount = 1;
        int redHeight = 1;
        int blueCount = 2;
        int blueHeight = 47;
        assertEquals(4, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case34() {
        int redCount = 1;
        int redHeight = 47;
        int blueCount = 46;
        int blueHeight = 1;
        assertEquals(4, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case35() {
        int redCount = 32;
        int redHeight = 4;
        int blueCount = 31;
        int blueHeight = 4;
        assertEquals(63, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case36() {
        int redCount = 47;
        int redHeight = 45;
        int blueCount = 40;
        int blueHeight = 3;
        assertEquals(121, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case37() {
        int redCount = 3;
        int redHeight = 46;
        int blueCount = 4;
        int blueHeight = 46;
        assertEquals(7, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case38() {
        int redCount = 18;
        int redHeight = 16;
        int blueCount = 47;
        int blueHeight = 1;
        assertEquals(55, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case39() {
        int redCount = 47;
        int redHeight = 46;
        int blueCount = 31;
        int blueHeight = 46;
        assertEquals(63, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case40() {
        int redCount = 22;
        int redHeight = 47;
        int blueCount = 21;
        int blueHeight = 47;
        assertEquals(43, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case41() {
        int redCount = 35;
        int redHeight = 46;
        int blueCount = 1;
        int blueHeight = 46;
        assertEquals(3, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case42() {
        int redCount = 2;
        int redHeight = 1;
        int blueCount = 3;
        int blueHeight = 1;
        assertEquals(5, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case43() {
        int redCount = 42;
        int redHeight = 47;
        int blueCount = 19;
        int blueHeight = 47;
        assertEquals(39, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case44() {
        int redCount = 14;
        int redHeight = 2;
        int blueCount = 2;
        int blueHeight = 2;
        assertEquals(5, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case45() {
        int redCount = 37;
        int redHeight = 1;
        int blueCount = 4;
        int blueHeight = 1;
        assertEquals(9, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case46() {
        int redCount = 39;
        int redHeight = 2;
        int blueCount = 2;
        int blueHeight = 2;
        assertEquals(5, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case47() {
        int redCount = 5;
        int redHeight = 10;
        int blueCount = 6;
        int blueHeight = 9;
        assertEquals(16, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case48() {
        int redCount = 474747474;
        int redHeight = 474747474;
        int blueCount = 474747474;
        int blueHeight = 292633855;
        assertEquals(1424242422, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case49() {
        int redCount = 474747474;
        int redHeight = 474747474;
        int blueCount = 474747474;
        int blueHeight = 474747474;
        assertEquals(949494948, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case50() {
        int redCount = 474747474;
        int redHeight = 474747468;
        int blueCount = 474746558;
        int blueHeight = 474747468;
        assertEquals(949493117, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case51() {
        int redCount = 474627584;
        int redHeight = 474747437;
        int blueCount = 474321382;
        int blueHeight = 504;
        assertEquals(1422964147, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case52() {
        int redCount = 474747473;
        int redHeight = 474273670;
        int blueCount = 466712388;
        int blueHeight = 474273670;
        assertEquals(933424777, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case53() {
        int redCount = 5381;
        int redHeight = 474393051;
        int blueCount = 5382;
        int blueHeight = 474393051;
        assertEquals(10763, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case54() {
        int redCount = 33222208;
        int redHeight = 55274;
        int blueCount = 33222209;
        int blueHeight = 41280768;
        assertEquals(99666625, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case55() {
        int redCount = 47075863;
        int redHeight = 181543779;
        int blueCount = 47075864;
        int blueHeight = 993924;
        assertEquals(141227590, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case56() {
        int redCount = 470418661;
        int redHeight = 454;
        int blueCount = 399796762;
        int blueHeight = 454;
        assertEquals(799593525, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case57() {
        int redCount = 33241;
        int redHeight = 421687360;
        int blueCount = 74544080;
        int blueHeight = 473675028;
        assertEquals(99724, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case58() {
        int redCount = 474733002;
        int redHeight = 115658936;
        int blueCount = 474733001;
        int blueHeight = 115658936;
        assertEquals(949466003, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case59() {
        int redCount = 92287;
        int redHeight = 1;
        int blueCount = 92286;
        int blueHeight = 465155160;
        assertEquals(276859, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case60() {
        int redCount = 118256;
        int redHeight = 474747470;
        int blueCount = 118256;
        int blueHeight = 474747470;
        assertEquals(236512, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case61() {
        int redCount = 1;
        int redHeight = 474747472;
        int blueCount = 9943413;
        int blueHeight = 474747472;
        assertEquals(3, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case62() {
        int redCount = 49344750;
        int redHeight = 288525;
        int blueCount = 49344749;
        int blueHeight = 62807079;
        assertEquals(148034248, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case63() {
        int redCount = 474631371;
        int redHeight = 1160014;
        int blueCount = 474631372;
        int blueHeight = 263540944;
        assertEquals(1423894114, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case64() {
        int redCount = 415038707;
        int redHeight = 1329630;
        int blueCount = 415038708;
        int blueHeight = 1329630;
        assertEquals(830077415, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case65() {
        int redCount = 920505;
        int redHeight = 1;
        int blueCount = 920504;
        int blueHeight = 1;
        assertEquals(1841009, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case66() {
        int redCount = 218113;
        int redHeight = 474076373;
        int blueCount = 195671916;
        int blueHeight = 474076373;
        assertEquals(436227, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case67() {
        int redCount = 474743982;
        int redHeight = 474721201;
        int blueCount = 474744825;
        int blueHeight = 474721201;
        assertEquals(949487965, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case68() {
        int redCount = 474742218;
        int redHeight = 5;
        int blueCount = 474747474;
        int blueHeight = 5;
        assertEquals(949484437, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case69() {
        int redCount = 474746972;
        int redHeight = 474551967;
        int blueCount = 474746971;
        int blueHeight = 474551967;
        assertEquals(949493943, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case70() {
        int redCount = 474747362;
        int redHeight = 5;
        int blueCount = 474747361;
        int blueHeight = 108358890;
        assertEquals(1424242084, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case71() {
        int redCount = 396305893;
        int redHeight = 1;
        int blueCount = 4263546;
        int blueHeight = 1;
        assertEquals(8527093, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case72() {
        int redCount = 402;
        int redHeight = 474746117;
        int blueCount = 402;
        int blueHeight = 474746117;
        assertEquals(804, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case73() {
        int redCount = 1268;
        int redHeight = 282291;
        int blueCount = 470776704;
        int blueHeight = 1;
        assertEquals(3805, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case74() {
        int redCount = 458978111;
        int redHeight = 474747339;
        int blueCount = 458978112;
        int blueHeight = 61;
        assertEquals(1376934334, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case75() {
        int redCount = 1;
        int redHeight = 3;
        int blueCount = 2;
        int blueHeight = 3;
        assertEquals(3, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case76() {
        int redCount = 1;
        int redHeight = 1;
        int blueCount = 1000;
        int blueHeight = 1;
        assertEquals(3, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case77() {
        int redCount = 444444444;
        int redHeight = 444444444;
        int blueCount = 444444444;
        int blueHeight = 444444444;
        assertEquals(888888888, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case78() {
        int redCount = 2;
        int redHeight = 1;
        int blueCount = 4;
        int blueHeight = 1;
        assertEquals(5, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case79() {
        int redCount = 5;
        int redHeight = 1;
        int blueCount = 6;
        int blueHeight = 1;
        assertEquals(11, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case80() {
        int redCount = 474747474;
        int redHeight = 474747474;
        int blueCount = 474747474;
        int blueHeight = 474747473;
        assertEquals(1424242422, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case81() {
        int redCount = 1;
        int redHeight = 4;
        int blueCount = 3;
        int blueHeight = 4;
        assertEquals(3, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case82() {
        int redCount = 1;
        int redHeight = 1;
        int blueCount = 100;
        int blueHeight = 1;
        assertEquals(3, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case83() {
        int redCount = 1000;
        int redHeight = 10;
        int blueCount = 10;
        int blueHeight = 10;
        assertEquals(21, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case84() {
        int redCount = 47;
        int redHeight = 47;
        int blueCount = 48;
        int blueHeight = 47;
        assertEquals(95, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case85() {
        int redCount = 5;
        int redHeight = 3;
        int blueCount = 8;
        int blueHeight = 3;
        assertEquals(11, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case86() {
        int redCount = 1;
        int redHeight = 5;
        int blueCount = 4;
        int blueHeight = 5;
        assertEquals(3, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case87() {
        int redCount = 1;
        int redHeight = 2;
        int blueCount = 3;
        int blueHeight = 2;
        assertEquals(3, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case88() {
        int redCount = 4;
        int redHeight = 10;
        int blueCount = 10;
        int blueHeight = 10;
        assertEquals(9, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case89() {
        int redCount = 474747474;
        int redHeight = 30;
        int blueCount = 474747474;
        int blueHeight = 50;
        assertEquals(1424242422, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case90() {
        int redCount = 9;
        int redHeight = 9;
        int blueCount = 1;
        int blueHeight = 9;
        assertEquals(3, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case91() {
        int redCount = 4;
        int redHeight = 4;
        int blueCount = 7;
        int blueHeight = 4;
        assertEquals(9, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case92() {
        int redCount = 5;
        int redHeight = 2;
        int blueCount = 1;
        int blueHeight = 2;
        assertEquals(3, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case93() {
        int redCount = 10;
        int redHeight = 1;
        int blueCount = 5;
        int blueHeight = 1;
        assertEquals(11, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case94() {
        int redCount = 17;
        int redHeight = 11;
        int blueCount = 13;
        int blueHeight = 11;
        assertEquals(27, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case95() {
        int redCount = 9;
        int redHeight = 5;
        int blueCount = 5;
        int blueHeight = 5;
        assertEquals(11, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case96() {
        int redCount = 10;
        int redHeight = 5;
        int blueCount = 8;
        int blueHeight = 5;
        assertEquals(17, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case97() {
        int redCount = 100;
        int redHeight = 1;
        int blueCount = 1;
        int blueHeight = 1;
        assertEquals(3, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case98() {
        int redCount = 84;
        int redHeight = 47;
        int blueCount = 92;
        int blueHeight = 47;
        assertEquals(169, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case99() {
        int redCount = 4;
        int redHeight = 5;
        int blueCount = 4;
        int blueHeight = 5;
        assertEquals(8, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case100() {
        int redCount = 1000;
        int redHeight = 6;
        int blueCount = 10;
        int blueHeight = 4;
        assertEquals(31, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case101() {
        int redCount = 10000;
        int redHeight = 10000;
        int blueCount = 10000;
        int blueHeight = 10000;
        assertEquals(20000, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case102() {
        int redCount = 474747470;
        int redHeight = 474747439;
        int blueCount = 474747420;
        int blueHeight = 474747433;
        assertEquals(1424242261, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case103() {
        int redCount = 100;
        int redHeight = 10;
        int blueCount = 1;
        int blueHeight = 10;
        assertEquals(3, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case104() {
        int redCount = 9;
        int redHeight = 11;
        int blueCount = 13;
        int blueHeight = 11;
        assertEquals(19, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case105() {
        int redCount = 5;
        int redHeight = 1;
        int blueCount = 3;
        int blueHeight = 1;
        assertEquals(7, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case106() {
        int redCount = 1;
        int redHeight = 1;
        int blueCount = 5;
        int blueHeight = 1;
        assertEquals(3, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case107() {
        int redCount = 1;
        int redHeight = 1;
        int blueCount = 10;
        int blueHeight = 1;
        assertEquals(3, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case108() {
        int redCount = 474747474;
        int redHeight = 474747474;
        int blueCount = 474747472;
        int blueHeight = 474747474;
        assertEquals(949494945, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case109() {
        int redCount = 100;
        int redHeight = 100;
        int blueCount = 1;
        int blueHeight = 2;
        assertEquals(4, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case110() {
        int redCount = 1;
        int redHeight = 3;
        int blueCount = 10;
        int blueHeight = 3;
        assertEquals(3, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case111() {
        int redCount = 1;
        int redHeight = 100;
        int blueCount = 1000;
        int blueHeight = 100;
        assertEquals(3, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case112() {
        int redCount = 10;
        int redHeight = 5;
        int blueCount = 9;
        int blueHeight = 9;
        assertEquals(28, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case113() {
        int redCount = 3;
        int redHeight = 4;
        int blueCount = 4;
        int blueHeight = 4;
        assertEquals(7, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case114() {
        int redCount = 1;
        int redHeight = 1;
        int blueCount = 999;
        int blueHeight = 1;
        assertEquals(3, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case115() {
        int redCount = 3;
        int redHeight = 3;
        int blueCount = 10;
        int blueHeight = 3;
        assertEquals(7, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case116() {
        int redCount = 10000;
        int redHeight = 1;
        int blueCount = 2;
        int blueHeight = 1;
        assertEquals(5, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case117() {
        int redCount = 20;
        int redHeight = 7;
        int blueCount = 17;
        int blueHeight = 7;
        assertEquals(35, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case118() {
        int redCount = 474747474;
        int redHeight = 1;
        int blueCount = 474747474;
        int blueHeight = 2;
        assertEquals(1424242422, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case119() {
        int redCount = 470000000;
        int redHeight = 470000000;
        int blueCount = 470000000;
        int blueHeight = 470000000;
        assertEquals(940000000, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case120() {
        int redCount = 474747474;
        int redHeight = 474747474;
        int blueCount = 474747473;
        int blueHeight = 474747474;
        assertEquals(949494947, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case121() {
        int redCount = 4;
        int redHeight = 2;
        int blueCount = 3;
        int blueHeight = 2;
        assertEquals(7, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case122() {
        int redCount = 474747412;
        int redHeight = 414747412;
        int blueCount = 474741412;
        int blueHeight = 470747412;
        assertEquals(1424224237, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case123() {
        int redCount = 474747474;
        int redHeight = 474747473;
        int blueCount = 474747472;
        int blueHeight = 474747471;
        assertEquals(1424242417, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case124() {
        int redCount = 4;
        int redHeight = 4;
        int blueCount = 5;
        int blueHeight = 4;
        assertEquals(9, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case125() {
        int redCount = 5;
        int redHeight = 474747474;
        int blueCount = 2;
        int blueHeight = 474747474;
        assertEquals(5, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case126() {
        int redCount = 2;
        int redHeight = 2;
        int blueCount = 1;
        int blueHeight = 2;
        assertEquals(3, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

    @Test
    public void case127() {
        int redCount = 5;
        int redHeight = 1;
        int blueCount = 1;
        int blueHeight = 1;
        assertEquals(3, thebricktowereasydivone.find(redCount, redHeight, blueCount, blueHeight));
    }

}
