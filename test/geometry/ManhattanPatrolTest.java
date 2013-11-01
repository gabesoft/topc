package topc.test.geometry;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.geometry.*;

public class ManhattanPatrolTest {
    ManhattanPatrol manhattanpatrol = new ManhattanPatrol();

    @Test
    public void case1() {
        int N = 4;
        int AX = 1;
        int BX = 2;
        int MX = 11;
        int AY = 2;
        int BY = 2;
        int MY = 13;
        assertEquals(1L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case2() {
        int N = 7;
        int AX = 1;
        int BX = 2;
        int MX = 11;
        int AY = 2;
        int BY = 2;
        int MY = 13;
        assertEquals(2L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case3() {
        int N = 6;
        int AX = 1;
        int BX = 2;
        int MX = 7;
        int AY = 1;
        int BY = 1;
        int MY = 6;
        assertEquals(5L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case4() {
        int N = 7;
        int AX = 1;
        int BX = 1;
        int MX = 11;
        int AY = 13;
        int BY = 1;
        int MY = 16;
        assertEquals(0L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case5() {
        int N = 20;
        int AX = 6;
        int BX = 1;
        int MX = 211;
        int AY = 13;
        int BY = 11;
        int MY = 186;
        assertEquals(862L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case6() {
        int N = 500;
        int AX = 124;
        int BX = 66;
        int MX = 11266;
        int AY = 13368;
        int BY = 15623;
        int MY = 21521;
        assertEquals(428883537L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case7() {
        int N = 4;
        int AX = 1;
        int BX = 1;
        int MX = 4;
        int AY = 1;
        int BY = 1;
        int MY = 4;
        assertEquals(0L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case8() {
        int N = 4;
        int AX = 1;
        int BX = 3;
        int MX = 4;
        int AY = 3;
        int BY = 2;
        int MY = 7;
        assertEquals(1L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case9() {
        int N = 380;
        int AX = 1823;
        int BX = 10845;
        int MX = 24666;
        int AY = 6040;
        int BY = 25246;
        int MY = 29665;
        assertEquals(142466311L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case10() {
        int N = 337;
        int AX = 4486;
        int BX = 20517;
        int MX = 24451;
        int AY = 1992;
        int BY = 873;
        int MY = 19308;
        assertEquals(83448168L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case11() {
        int N = 101;
        int AX = 4006;
        int BX = 1049;
        int MX = 5597;
        int AY = 5880;
        int BY = 14371;
        int MY = 36663;
        assertEquals(741979L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case12() {
        int N = 358;
        int AX = 7472;
        int BX = 5190;
        int MX = 8924;
        int AY = 2817;
        int BY = 16436;
        int MY = 33946;
        assertEquals(117158504L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case13() {
        int N = 222;
        int AX = 8210;
        int BX = 27662;
        int MX = 30862;
        int AY = 12803;
        int BY = 31111;
        int MY = 32785;
        assertEquals(17294687L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case14() {
        int N = 45;
        int AX = 2943;
        int BX = 413;
        int MX = 30953;
        int AY = 32712;
        int BY = 35901;
        int MY = 37367;
        assertEquals(25122L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case15() {
        int N = 68;
        int AX = 1037;
        int BX = 8935;
        int MX = 10091;
        int AY = 7489;
        int BY = 5034;
        int MY = 16146;
        assertEquals(105644L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case16() {
        int N = 125;
        int AX = 1716;
        int BX = 679;
        int MX = 9615;
        int AY = 3025;
        int BY = 3510;
        int MY = 12840;
        assertEquals(1712586L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case17() {
        int N = 23;
        int AX = 4688;
        int BX = 15956;
        int MX = 21676;
        int AY = 3098;
        int BY = 1773;
        int MY = 3757;
        assertEquals(1365L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case18() {
        int N = 497;
        int AX = 2406;
        int BX = 16746;
        int MX = 26893;
        int AY = 30913;
        int BY = 30802;
        int MY = 33285;
        assertEquals(423806447L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case19() {
        int N = 131;
        int AX = 14587;
        int BX = 7497;
        int MX = 23319;
        int AY = 22362;
        int BY = 5827;
        int MY = 33446;
        assertEquals(1942331L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case20() {
        int N = 269;
        int AX = 1957;
        int BX = 6970;
        int MX = 8508;
        int AY = 4026;
        int BY = 867;
        int MY = 4098;
        assertEquals(34290152L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case21() {
        int N = 286;
        int AX = 13745;
        int BX = 5209;
        int MX = 30409;
        int AY = 20280;
        int BY = 20740;
        int MY = 22534;
        assertEquals(46445592L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case22() {
        int N = 102;
        int AX = 1429;
        int BX = 3854;
        int MX = 6179;
        int AY = 4119;
        int BY = 2841;
        int MY = 4506;
        assertEquals(670498L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case23() {
        int N = 61;
        int AX = 26618;
        int BX = 18384;
        int MX = 32623;
        int AY = 3743;
        int BY = 10296;
        int MY = 13098;
        assertEquals(85021L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case24() {
        int N = 335;
        int AX = 17936;
        int BX = 24266;
        int MX = 37945;
        int AY = 6387;
        int BY = 13590;
        int MY = 18636;
        assertEquals(91875077L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case25() {
        int N = 427;
        int AX = 1284;
        int BX = 231;
        int MX = 2798;
        int AY = 8498;
        int BY = 22757;
        int MY = 28541;
        assertEquals(233629798L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case26() {
        int N = 165;
        int AX = 10717;
        int BX = 11530;
        int MX = 15104;
        int AY = 3545;
        int BY = 5745;
        int MY = 39913;
        assertEquals(4338846L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case27() {
        int N = 471;
        int AX = 14882;
        int BX = 3001;
        int MX = 34939;
        int AY = 4825;
        int BY = 4360;
        int MY = 10366;
        assertEquals(360698755L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case28() {
        int N = 399;
        int AX = 13894;
        int BX = 3389;
        int MX = 25798;
        int AY = 17880;
        int BY = 8810;
        int MY = 18159;
        assertEquals(163810061L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case29() {
        int N = 351;
        int AX = 1293;
        int BX = 552;
        int MX = 21647;
        int AY = 9808;
        int BY = 1098;
        int MY = 9941;
        assertEquals(103812316L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case30() {
        int N = 83;
        int AX = 8562;
        int BX = 7949;
        int MX = 16489;
        int AY = 9209;
        int BY = 27446;
        int MY = 29912;
        assertEquals(296885L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case31() {
        int N = 136;
        int AX = 18107;
        int BX = 20574;
        int MX = 20963;
        int AY = 9147;
        int BY = 5061;
        int MY = 9244;
        assertEquals(2140176L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case32() {
        int N = 31;
        int AX = 17627;
        int BX = 12988;
        int MX = 30388;
        int AY = 999;
        int BY = 1195;
        int MY = 1522;
        assertEquals(6009L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case33() {
        int N = 226;
        int AX = 17037;
        int BX = 5079;
        int MX = 38869;
        int AY = 36337;
        int BY = 8304;
        int MY = 38727;
        assertEquals(18747216L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case34() {
        int N = 80;
        int AX = 11406;
        int BX = 12859;
        int MX = 24434;
        int AY = 14137;
        int BY = 4711;
        int MY = 16117;
        assertEquals(250839L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case35() {
        int N = 160;
        int AX = 3229;
        int BX = 4172;
        int MX = 26727;
        int AY = 5426;
        int BY = 10363;
        int MY = 28591;
        assertEquals(4737779L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case36() {
        int N = 23;
        int AX = 2559;
        int BX = 3541;
        int MX = 4356;
        int AY = 11677;
        int BY = 11311;
        int MY = 27560;
        assertEquals(1466L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case37() {
        int N = 282;
        int AX = 29797;
        int BX = 426;
        int MX = 31656;
        int AY = 138;
        int BY = 17087;
        int MY = 39827;
        assertEquals(43710743L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case38() {
        int N = 45;
        int AX = 19781;
        int BX = 14658;
        int MX = 26712;
        int AY = 4374;
        int BY = 5276;
        int MY = 11764;
        assertEquals(30894L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case39() {
        int N = 304;
        int AX = 3524;
        int BX = 10073;
        int MX = 17503;
        int AY = 17334;
        int BY = 24794;
        int MY = 30902;
        assertEquals(58563193L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case40() {
        int N = 57;
        int AX = 733;
        int BX = 1222;
        int MX = 4048;
        int AY = 1756;
        int BY = 519;
        int MY = 3854;
        assertEquals(79665L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case41() {
        int N = 341;
        int AX = 23908;
        int BX = 16404;
        int MX = 29644;
        int AY = 32016;
        int BY = 28077;
        int MY = 39889;
        assertEquals(98501264L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case42() {
        int N = 167;
        int AX = 30366;
        int BX = 3027;
        int MX = 36579;
        int AY = 1456;
        int BY = 32544;
        int MY = 33116;
        assertEquals(4763863L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case43() {
        int N = 362;
        int AX = 17452;
        int BX = 17280;
        int MX = 26137;
        int AY = 14184;
        int BY = 4034;
        int MY = 15386;
        assertEquals(119391057L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case44() {
        int N = 382;
        int AX = 10787;
        int BX = 13962;
        int MX = 25341;
        int AY = 1601;
        int BY = 3324;
        int MY = 8416;
        assertEquals(146056452L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case45() {
        int N = 15;
        int AX = 3240;
        int BX = 17492;
        int MX = 22700;
        int AY = 17173;
        int BY = 17780;
        int MY = 18836;
        assertEquals(342L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case46() {
        int N = 27;
        int AX = 3035;
        int BX = 4128;
        int MX = 9992;
        int AY = 16421;
        int BY = 9521;
        int MY = 17618;
        assertEquals(2272L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case47() {
        int N = 211;
        int AX = 11513;
        int BX = 5026;
        int MX = 19614;
        int AY = 12140;
        int BY = 228;
        int MY = 15178;
        assertEquals(12721462L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case48() {
        int N = 100;
        int AX = 1630;
        int BX = 7643;
        int MX = 9870;
        int AY = 10367;
        int BY = 197;
        int MY = 21934;
        assertEquals(602196L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case49() {
        int N = 168;
        int AX = 10103;
        int BX = 12600;
        int MX = 19645;
        int AY = 21810;
        int BY = 5471;
        int MY = 33758;
        assertEquals(5506928L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case50() {
        int N = 260;
        int AX = 10532;
        int BX = 9770;
        int MX = 22478;
        int AY = 11376;
        int BY = 3295;
        int MY = 22342;
        assertEquals(32395430L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case51() {
        int N = 9;
        int AX = 3928;
        int BX = 16535;
        int MX = 16846;
        int AY = 4862;
        int BY = 4879;
        int MY = 8978;
        assertEquals(32L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case52() {
        int N = 23;
        int AX = 25549;
        int BX = 1424;
        int MX = 32610;
        int AY = 26591;
        int BY = 35243;
        int MY = 35504;
        assertEquals(907L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case53() {
        int N = 480;
        int AX = 25858;
        int BX = 25114;
        int MX = 29255;
        int AY = 14055;
        int BY = 1030;
        int MY = 35791;
        assertEquals(360709436L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case54() {
        int N = 380;
        int AX = 18252;
        int BX = 6742;
        int MX = 23893;
        int AY = 9096;
        int BY = 13003;
        int MY = 35152;
        assertEquals(143668554L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case55() {
        int N = 35;
        int AX = 19334;
        int BX = 24270;
        int MX = 38197;
        int AY = 621;
        int BY = 62;
        int MY = 1950;
        assertEquals(7868L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case56() {
        int N = 122;
        int AX = 8250;
        int BX = 19217;
        int MX = 31260;
        int AY = 5039;
        int BY = 23303;
        int MY = 29917;
        assertEquals(1478742L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case57() {
        int N = 119;
        int AX = 188;
        int BX = 5450;
        int MX = 15058;
        int AY = 8135;
        int BY = 2682;
        int MY = 10930;
        assertEquals(1321425L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case58() {
        int N = 19;
        int AX = 20363;
        int BX = 16039;
        int MX = 36001;
        int AY = 6467;
        int BY = 7922;
        int MY = 29548;
        assertEquals(615L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case59() {
        int N = 162;
        int AX = 4225;
        int BX = 3390;
        int MX = 4418;
        int AY = 5213;
        int BY = 6374;
        int MY = 8443;
        assertEquals(4179761L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case60() {
        int N = 500;
        int AX = 1763;
        int BX = 5892;
        int MX = 12781;
        int AY = 3217;
        int BY = 3529;
        int MY = 4036;
        assertEquals(431849238L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case61() {
        int N = 500;
        int AX = 7827;
        int BX = 6973;
        int MX = 11789;
        int AY = 10684;
        int BY = 15122;
        int MY = 39135;
        assertEquals(435361312L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case62() {
        int N = 500;
        int AX = 1763;
        int BX = 22343;
        int MX = 34097;
        int AY = 10396;
        int BY = 23492;
        int MY = 31511;
        assertEquals(450675891L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case63() {
        int N = 500;
        int AX = 3918;
        int BX = 11286;
        int MX = 12778;
        int AY = 7393;
        int BY = 7100;
        int MY = 16757;
        assertEquals(455539467L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case64() {
        int N = 500;
        int AX = 2383;
        int BX = 2326;
        int MX = 10404;
        int AY = 6741;
        int BY = 20476;
        int MY = 21282;
        assertEquals(464463753L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case65() {
        int N = 500;
        int AX = 11506;
        int BX = 23735;
        int MX = 25471;
        int AY = 15299;
        int BY = 20725;
        int MY = 22071;
        assertEquals(466759793L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case66() {
        int N = 500;
        int AX = 2822;
        int BX = 2284;
        int MX = 3171;
        int AY = 2911;
        int BY = 10186;
        int MY = 17156;
        assertEquals(471632975L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case67() {
        int N = 500;
        int AX = 1410;
        int BX = 4760;
        int MX = 6767;
        int AY = 28892;
        int BY = 14896;
        int MY = 32786;
        assertEquals(474238379L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case68() {
        int N = 500;
        int AX = 9211;
        int BX = 3868;
        int MX = 20547;
        int AY = 4894;
        int BY = 4866;
        int MY = 4913;
        assertEquals(480330893L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case69() {
        int N = 500;
        int AX = 32422;
        int BX = 22998;
        int MX = 35704;
        int AY = 17857;
        int BY = 31876;
        int MY = 37866;
        assertEquals(482778654L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case70() {
        int N = 500;
        int AX = 10245;
        int BX = 998;
        int MX = 30029;
        int AY = 16519;
        int BY = 73;
        int MY = 30813;
        assertEquals(484078917L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case71() {
        int N = 500;
        int AX = 11989;
        int BX = 9746;
        int MX = 14817;
        int AY = 10752;
        int BY = 15968;
        int MY = 16858;
        assertEquals(484896488L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case72() {
        int N = 500;
        int AX = 11917;
        int BX = 3051;
        int MX = 17335;
        int AY = 379;
        int BY = 3365;
        int MY = 7158;
        assertEquals(487545394L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case73() {
        int N = 500;
        int AX = 3034;
        int BX = 13154;
        int MX = 17110;
        int AY = 12848;
        int BY = 13601;
        int MY = 26744;
        assertEquals(488147864L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case74() {
        int N = 500;
        int AX = 23114;
        int BX = 18984;
        int MX = 30078;
        int AY = 20594;
        int BY = 19415;
        int MY = 35664;
        assertEquals(492711511L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case75() {
        int N = 500;
        int AX = 8719;
        int BX = 12919;
        int MX = 17716;
        int AY = 681;
        int BY = 12322;
        int MY = 29332;
        assertEquals(390618877L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case76() {
        int N = 500;
        int AX = 19758;
        int BX = 14303;
        int MX = 20322;
        int AY = 1014;
        int BY = 9262;
        int MY = 17387;
        assertEquals(379860052L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case77() {
        int N = 500;
        int AX = 28103;
        int BX = 1107;
        int MX = 34391;
        int AY = 21487;
        int BY = 22075;
        int MY = 32315;
        assertEquals(376346913L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case78() {
        int N = 500;
        int AX = 21274;
        int BX = 3373;
        int MX = 35318;
        int AY = 4219;
        int BY = 964;
        int MY = 21686;
        assertEquals(371761765L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case79() {
        int N = 500;
        int AX = 9809;
        int BX = 9547;
        int MX = 10409;
        int AY = 26986;
        int BY = 8280;
        int MY = 34645;
        assertEquals(370960154L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case80() {
        int N = 500;
        int AX = 11545;
        int BX = 8100;
        int MX = 15818;
        int AY = 8611;
        int BY = 6679;
        int MY = 34895;
        assertEquals(364130488L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case81() {
        int N = 500;
        int AX = 1;
        int BX = 1;
        int MX = 10000;
        int AY = 1;
        int BY = 1;
        int MY = 10000;
        assertEquals(0L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case82() {
        int N = 500;
        int AX = 2723;
        int BX = 121;
        int MX = 4363;
        int AY = 6873;
        int BY = 5226;
        int MY = 10133;
        assertEquals(363972219L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

    @Test
    public void case83() {
        int N = 500;
        int AX = 1;
        int BX = 1;
        int MX = 26088;
        int AY = 21432;
        int BY = 26039;
        int MY = 29638;
        assertEquals(506398043L, manhattanpatrol.countIntersections(N, AX, BX, MX, AY, BY, MY));
    }

}
