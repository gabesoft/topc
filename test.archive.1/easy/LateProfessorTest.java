package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class LateProfessorTest {
    double DELTA = 1.0e-09;
    LateProfessor lateprofessor = new LateProfessor();

    @Test
    public void case1() {
        int waitTime = 20;
        int walkTime = 30;
        int lateTime = 10;
        int bestArrival = 0;
        int worstArrival = 50;
        assertEquals(0.4, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.4);
    }

    @Test
    public void case2() {
        int waitTime = 20;
        int walkTime = 30;
        int lateTime = 10;
        int bestArrival = 30;
        int worstArrival = 100;
        assertEquals(0.42857142857142855, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.42857142857142855);
    }

    @Test
    public void case3() {
        int waitTime = 20;
        int walkTime = 40;
        int lateTime = 50;
        int bestArrival = 0;
        int worstArrival = 300;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case4() {
        int waitTime = 10;
        int walkTime = 100;
        int lateTime = 50;
        int bestArrival = 59;
        int worstArrival = 60;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case5() {
        int waitTime = 300;
        int walkTime = 50;
        int lateTime = 25;
        int bestArrival = 9000;
        int worstArrival = 10000;
        assertEquals(0.075, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.075);
    }

    @Test
    public void case6() {
        int waitTime = 20000;
        int walkTime = 30000;
        int lateTime = 10000;
        int bestArrival = 30000;
        int worstArrival = 30001;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case7() {
        int waitTime = 100;
        int walkTime = 200;
        int lateTime = 10;
        int bestArrival = 3150;
        int worstArrival = 3170;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case8() {
        int waitTime = 1000000;
        int walkTime = 2000000;
        int lateTime = 100000;
        int bestArrival = 0;
        int worstArrival = 100000;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case9() {
        int waitTime = 101;
        int walkTime = 230;
        int lateTime = 10;
        int bestArrival = 654;
        int worstArrival = 17890;
        assertEquals(0.6637270828498492, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.6637270828498492);
    }

    @Test
    public void case10() {
        int waitTime = 120000;
        int walkTime = 180000;
        int lateTime = 150000;
        int bestArrival = 600000;
        int worstArrival = 1400000;
        assertEquals(0.1125, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.1125);
    }

    @Test
    public void case11() {
        int waitTime = 20;
        int walkTime = 30;
        int lateTime = 10;
        int bestArrival = 10;
        int worstArrival = 10;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case12() {
        int waitTime = 20;
        int walkTime = 30;
        int lateTime = 10;
        int bestArrival = 90;
        int worstArrival = 90;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case13() {
        int waitTime = 1000;
        int walkTime = 600;
        int lateTime = 1;
        int bestArrival = 17000;
        int worstArrival = 17000;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case14() {
        int waitTime = 20;
        int walkTime = 30;
        int lateTime = 10;
        int bestArrival = 89;
        int worstArrival = 89;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case15() {
        int waitTime = 20;
        int walkTime = 30;
        int lateTime = 10;
        int bestArrival = 91;
        int worstArrival = 91;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case16() {
        int waitTime = 17;
        int walkTime = 20;
        int lateTime = 14;
        int bestArrival = 58798;
        int worstArrival = 58818;
        assertEquals(0.3, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.3);
    }

    @Test
    public void case17() {
        int waitTime = 12;
        int walkTime = 15;
        int lateTime = 20;
        int bestArrival = 170324;
        int worstArrival = 170340;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case18() {
        int waitTime = 15;
        int walkTime = 2;
        int lateTime = 19;
        int bestArrival = 503939;
        int worstArrival = 503951;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case19() {
        int waitTime = 15;
        int walkTime = 2;
        int lateTime = 5;
        int bestArrival = 117525;
        int worstArrival = 117528;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case20() {
        int waitTime = 3;
        int walkTime = 9;
        int lateTime = 18;
        int bestArrival = 325671;
        int worstArrival = 325685;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case21() {
        int waitTime = 20;
        int walkTime = 19;
        int lateTime = 7;
        int bestArrival = 187871;
        int worstArrival = 187881;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case22() {
        int waitTime = 4;
        int walkTime = 2;
        int lateTime = 6;
        int bestArrival = 743659;
        int worstArrival = 743670;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case23() {
        int waitTime = 3;
        int walkTime = 10;
        int lateTime = 1;
        int bestArrival = 299006;
        int worstArrival = 299016;
        assertEquals(0.6, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.6);
    }

    @Test
    public void case24() {
        int waitTime = 13;
        int walkTime = 16;
        int lateTime = 2;
        int bestArrival = 676576;
        int worstArrival = 676595;
        assertEquals(0.631578947368421, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.631578947368421);
    }

    @Test
    public void case25() {
        int waitTime = 11;
        int walkTime = 10;
        int lateTime = 1;
        int bestArrival = 93882;
        int worstArrival = 93885;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case26() {
        int waitTime = 8;
        int walkTime = 16;
        int lateTime = 15;
        int bestArrival = 70555;
        int worstArrival = 70575;
        assertEquals(0.05, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.05);
    }

    @Test
    public void case27() {
        int waitTime = 5;
        int walkTime = 10;
        int lateTime = 16;
        int bestArrival = 601464;
        int worstArrival = 601481;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case28() {
        int waitTime = 6;
        int walkTime = 13;
        int lateTime = 14;
        int bestArrival = 945270;
        int worstArrival = 945273;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case29() {
        int waitTime = 5;
        int walkTime = 6;
        int lateTime = 14;
        int bestArrival = 957655;
        int worstArrival = 957667;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case30() {
        int waitTime = 20;
        int walkTime = 14;
        int lateTime = 10;
        int bestArrival = 671701;
        int worstArrival = 671708;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case31() {
        int waitTime = 19;
        int walkTime = 12;
        int lateTime = 14;
        int bestArrival = 37945;
        int worstArrival = 37961;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case32() {
        int waitTime = 10;
        int walkTime = 15;
        int lateTime = 10;
        int bestArrival = 69345;
        int worstArrival = 69352;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case33() {
        int waitTime = 2;
        int walkTime = 3;
        int lateTime = 10;
        int bestArrival = 801989;
        int worstArrival = 802007;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case34() {
        int waitTime = 5;
        int walkTime = 20;
        int lateTime = 10;
        int bestArrival = 867898;
        int worstArrival = 867912;
        assertEquals(0.5, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.5);
    }

    @Test
    public void case35() {
        int waitTime = 13;
        int walkTime = 14;
        int lateTime = 20;
        int bestArrival = 689760;
        int worstArrival = 689763;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case36() {
        int waitTime = 910962;
        int walkTime = 967045;
        int lateTime = 672717;
        int bestArrival = 181666;
        int worstArrival = 181682;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case37() {
        int waitTime = 344978;
        int walkTime = 621265;
        int lateTime = 104920;
        int bestArrival = 168820;
        int worstArrival = 168831;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case38() {
        int waitTime = 413937;
        int walkTime = 86547;
        int lateTime = 53027;
        int bestArrival = 413339;
        int worstArrival = 413355;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case39() {
        int waitTime = 703524;
        int walkTime = 56660;
        int lateTime = 492404;
        int bestArrival = 318459;
        int worstArrival = 318473;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case40() {
        int waitTime = 62849;
        int walkTime = 693858;
        int lateTime = 997881;
        int bestArrival = 73175;
        int worstArrival = 73194;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case41() {
        int waitTime = 417913;
        int walkTime = 368356;
        int lateTime = 150984;
        int bestArrival = 321483;
        int worstArrival = 321500;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case42() {
        int waitTime = 988276;
        int walkTime = 280415;
        int lateTime = 234542;
        int bestArrival = 582818;
        int worstArrival = 582820;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case43() {
        int waitTime = 227339;
        int walkTime = 168075;
        int lateTime = 318377;
        int bestArrival = 311781;
        int worstArrival = 311785;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case44() {
        int waitTime = 331218;
        int walkTime = 763736;
        int lateTime = 991481;
        int bestArrival = 539781;
        int worstArrival = 539793;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case45() {
        int waitTime = 715732;
        int walkTime = 403199;
        int lateTime = 315087;
        int bestArrival = 614978;
        int worstArrival = 614993;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case46() {
        int waitTime = 622682;
        int walkTime = 765931;
        int lateTime = 57477;
        int bestArrival = 722602;
        int worstArrival = 722607;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case47() {
        int waitTime = 972097;
        int walkTime = 20375;
        int lateTime = 392176;
        int bestArrival = 172850;
        int worstArrival = 172870;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case48() {
        int waitTime = 482430;
        int walkTime = 438809;
        int lateTime = 594296;
        int bestArrival = 761418;
        int worstArrival = 761429;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case49() {
        int waitTime = 372760;
        int walkTime = 42199;
        int lateTime = 516341;
        int bestArrival = 568770;
        int worstArrival = 568775;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case50() {
        int waitTime = 707714;
        int walkTime = 583669;
        int lateTime = 347666;
        int bestArrival = 655457;
        int worstArrival = 655467;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case51() {
        int waitTime = 114929;
        int walkTime = 200856;
        int lateTime = 606921;
        int bestArrival = 715107;
        int worstArrival = 715125;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case52() {
        int waitTime = 732799;
        int walkTime = 3498;
        int lateTime = 803715;
        int bestArrival = 508483;
        int worstArrival = 508485;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case53() {
        int waitTime = 935817;
        int walkTime = 538186;
        int lateTime = 937432;
        int bestArrival = 743545;
        int worstArrival = 743548;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case54() {
        int waitTime = 964447;
        int walkTime = 85032;
        int lateTime = 89613;
        int bestArrival = 997120;
        int worstArrival = 997138;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case55() {
        int waitTime = 574307;
        int walkTime = 845669;
        int lateTime = 533616;
        int bestArrival = 266685;
        int worstArrival = 266703;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case56() {
        int waitTime = 733080;
        int walkTime = 137870;
        int lateTime = 836766;
        int bestArrival = 573505;
        int worstArrival = 573553;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case57() {
        int waitTime = 91922;
        int walkTime = 208382;
        int lateTime = 639173;
        int bestArrival = 231037;
        int worstArrival = 231132;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case58() {
        int waitTime = 18591;
        int walkTime = 245097;
        int lateTime = 740461;
        int bestArrival = 209819;
        int worstArrival = 209886;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case59() {
        int waitTime = 693708;
        int walkTime = 922954;
        int lateTime = 719107;
        int bestArrival = 900626;
        int worstArrival = 900687;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case60() {
        int waitTime = 964087;
        int walkTime = 294685;
        int lateTime = 751974;
        int bestArrival = 840395;
        int worstArrival = 840403;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case61() {
        int waitTime = 179080;
        int walkTime = 230443;
        int lateTime = 798121;
        int bestArrival = 503974;
        int worstArrival = 503978;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case62() {
        int waitTime = 834830;
        int walkTime = 483139;
        int lateTime = 164941;
        int bestArrival = 836257;
        int worstArrival = 836285;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case63() {
        int waitTime = 507630;
        int walkTime = 853721;
        int lateTime = 815446;
        int bestArrival = 249489;
        int worstArrival = 249493;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case64() {
        int waitTime = 716490;
        int walkTime = 905890;
        int lateTime = 901884;
        int bestArrival = 497641;
        int worstArrival = 497723;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case65() {
        int waitTime = 195125;
        int walkTime = 142330;
        int lateTime = 890045;
        int bestArrival = 458282;
        int worstArrival = 458382;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case66() {
        int waitTime = 721568;
        int walkTime = 358367;
        int lateTime = 247562;
        int bestArrival = 43653;
        int worstArrival = 43718;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case67() {
        int waitTime = 41959;
        int walkTime = 815785;
        int lateTime = 940120;
        int bestArrival = 728357;
        int worstArrival = 728392;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case68() {
        int waitTime = 60949;
        int walkTime = 935161;
        int lateTime = 482514;
        int bestArrival = 783452;
        int worstArrival = 783464;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case69() {
        int waitTime = 127426;
        int walkTime = 194183;
        int lateTime = 837926;
        int bestArrival = 825484;
        int worstArrival = 825556;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case70() {
        int waitTime = 461341;
        int walkTime = 411083;
        int lateTime = 395148;
        int bestArrival = 608064;
        int worstArrival = 608099;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case71() {
        int waitTime = 946151;
        int walkTime = 514386;
        int lateTime = 488702;
        int bestArrival = 882784;
        int worstArrival = 882876;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case72() {
        int waitTime = 296410;
        int walkTime = 467233;
        int lateTime = 959733;
        int bestArrival = 8599;
        int worstArrival = 8647;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case73() {
        int waitTime = 395926;
        int walkTime = 301514;
        int lateTime = 831922;
        int bestArrival = 773360;
        int worstArrival = 773424;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case74() {
        int waitTime = 47377;
        int walkTime = 414723;
        int lateTime = 874619;
        int bestArrival = 300577;
        int worstArrival = 300649;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case75() {
        int waitTime = 113039;
        int walkTime = 751870;
        int lateTime = 991493;
        int bestArrival = 135592;
        int worstArrival = 135661;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case76() {
        int waitTime = 293631;
        int walkTime = 164582;
        int lateTime = 894034;
        int bestArrival = 211029;
        int worstArrival = 211337;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case77() {
        int waitTime = 192241;
        int walkTime = 124624;
        int lateTime = 346923;
        int bestArrival = 882214;
        int worstArrival = 882858;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case78() {
        int waitTime = 298244;
        int walkTime = 729830;
        int lateTime = 893965;
        int bestArrival = 576101;
        int worstArrival = 576321;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case79() {
        int waitTime = 785661;
        int walkTime = 230173;
        int lateTime = 351853;
        int bestArrival = 301832;
        int worstArrival = 302482;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case80() {
        int waitTime = 189680;
        int walkTime = 6651;
        int lateTime = 906825;
        int bestArrival = 280749;
        int worstArrival = 280904;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case81() {
        int waitTime = 44003;
        int walkTime = 564255;
        int lateTime = 639370;
        int bestArrival = 264983;
        int worstArrival = 265683;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case82() {
        int waitTime = 384007;
        int walkTime = 83640;
        int lateTime = 535207;
        int bestArrival = 485501;
        int worstArrival = 485622;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case83() {
        int waitTime = 587125;
        int walkTime = 705034;
        int lateTime = 841679;
        int bestArrival = 281279;
        int worstArrival = 282031;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case84() {
        int waitTime = 388298;
        int walkTime = 609302;
        int lateTime = 9270;
        int bestArrival = 279815;
        int worstArrival = 280597;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case85() {
        int waitTime = 441439;
        int walkTime = 228015;
        int lateTime = 769159;
        int bestArrival = 639966;
        int worstArrival = 640466;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case86() {
        int waitTime = 675529;
        int walkTime = 766094;
        int lateTime = 687011;
        int bestArrival = 479740;
        int worstArrival = 480172;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case87() {
        int waitTime = 636371;
        int walkTime = 607725;
        int lateTime = 668688;
        int bestArrival = 547580;
        int worstArrival = 547975;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case88() {
        int waitTime = 784145;
        int walkTime = 18479;
        int lateTime = 824961;
        int bestArrival = 592576;
        int worstArrival = 593481;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case89() {
        int waitTime = 205089;
        int walkTime = 913436;
        int lateTime = 315750;
        int bestArrival = 957908;
        int worstArrival = 958622;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case90() {
        int waitTime = 937214;
        int walkTime = 463860;
        int lateTime = 309838;
        int bestArrival = 944247;
        int worstArrival = 944700;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case91() {
        int waitTime = 552376;
        int walkTime = 859261;
        int lateTime = 834039;
        int bestArrival = 797536;
        int worstArrival = 797851;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case92() {
        int waitTime = 645185;
        int walkTime = 755104;
        int lateTime = 300319;
        int bestArrival = 684108;
        int worstArrival = 684872;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case93() {
        int waitTime = 425522;
        int walkTime = 385073;
        int lateTime = 485786;
        int bestArrival = 333633;
        int worstArrival = 334105;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case94() {
        int waitTime = 460155;
        int walkTime = 751065;
        int lateTime = 784221;
        int bestArrival = 478819;
        int worstArrival = 479383;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case95() {
        int waitTime = 942189;
        int walkTime = 448778;
        int lateTime = 201805;
        int bestArrival = 13244;
        int worstArrival = 13430;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case96() {
        int waitTime = 38246;
        int walkTime = 892286;
        int lateTime = 396684;
        int bestArrival = 46629;
        int worstArrival = 66217;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case97() {
        int waitTime = 412175;
        int walkTime = 387007;
        int lateTime = 62775;
        int bestArrival = 537294;
        int worstArrival = 577403;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case98() {
        int waitTime = 865379;
        int walkTime = 225279;
        int lateTime = 21259;
        int bestArrival = 191505;
        int worstArrival = 200935;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case99() {
        int waitTime = 752871;
        int walkTime = 241358;
        int lateTime = 762498;
        int bestArrival = 15019;
        int worstArrival = 51716;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case100() {
        int waitTime = 851775;
        int walkTime = 59511;
        int lateTime = 20895;
        int bestArrival = 626055;
        int worstArrival = 689315;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case101() {
        int waitTime = 187943;
        int walkTime = 307088;
        int lateTime = 578093;
        int bestArrival = 19912;
        int worstArrival = 105242;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case102() {
        int waitTime = 429247;
        int walkTime = 768;
        int lateTime = 420025;
        int bestArrival = 738845;
        int worstArrival = 808770;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case103() {
        int waitTime = 397417;
        int walkTime = 589366;
        int lateTime = 138587;
        int bestArrival = 885436;
        int worstArrival = 984029;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case104() {
        int waitTime = 300064;
        int walkTime = 729117;
        int lateTime = 579025;
        int bestArrival = 226555;
        int worstArrival = 273756;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case105() {
        int waitTime = 171266;
        int walkTime = 958428;
        int lateTime = 570961;
        int bestArrival = 603112;
        int worstArrival = 664105;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case106() {
        int waitTime = 435940;
        int walkTime = 757549;
        int lateTime = 114932;
        int bestArrival = 35541;
        int worstArrival = 111482;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case107() {
        int waitTime = 828978;
        int walkTime = 537765;
        int lateTime = 183384;
        int bestArrival = 0;
        int worstArrival = 9656;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case108() {
        int waitTime = 545876;
        int walkTime = 128464;
        int lateTime = 586907;
        int bestArrival = 721974;
        int worstArrival = 796111;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case109() {
        int waitTime = 498697;
        int walkTime = 866191;
        int lateTime = 783344;
        int bestArrival = 483712;
        int worstArrival = 502961;
        assertEquals(0.2215180009351135, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.2215180009351135);
    }

    @Test
    public void case110() {
        int waitTime = 461038;
        int walkTime = 172096;
        int lateTime = 876212;
        int bestArrival = 630999;
        int worstArrival = 660670;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case111() {
        int waitTime = 322872;
        int walkTime = 26383;
        int lateTime = 39995;
        int bestArrival = 662940;
        int worstArrival = 669976;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case112() {
        int waitTime = 70837;
        int walkTime = 596307;
        int lateTime = 287895;
        int bestArrival = 892074;
        int worstArrival = 913046;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case113() {
        int waitTime = 460336;
        int walkTime = 885515;
        int lateTime = 640917;
        int bestArrival = 0;
        int worstArrival = 50255;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case114() {
        int waitTime = 153596;
        int walkTime = 629825;
        int lateTime = 85134;
        int bestArrival = 747461;
        int worstArrival = 814959;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case115() {
        int waitTime = 435529;
        int walkTime = 391868;
        int lateTime = 233066;
        int bestArrival = 285055;
        int worstArrival = 314994;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case116() {
        int waitTime = 84952;
        int walkTime = 347328;
        int lateTime = 986386;
        int bestArrival = 587196;
        int worstArrival = 622791;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case117() {
        int waitTime = 154261;
        int walkTime = 904502;
        int lateTime = 459190;
        int bestArrival = 0;
        int worstArrival = 157874;
        assertEquals(0.02288533894118094, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.02288533894118094);
    }

    @Test
    public void case118() {
        int waitTime = 808087;
        int walkTime = 370289;
        int lateTime = 760902;
        int bestArrival = 0;
        int worstArrival = 169637;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case119() {
        int waitTime = 886325;
        int walkTime = 477955;
        int lateTime = 51428;
        int bestArrival = 0;
        int worstArrival = 248141;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case120() {
        int waitTime = 399072;
        int walkTime = 836239;
        int lateTime = 599720;
        int bestArrival = 703835;
        int worstArrival = 835334;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case121() {
        int waitTime = 339362;
        int walkTime = 715983;
        int lateTime = 71119;
        int bestArrival = 0;
        int worstArrival = 75214;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case122() {
        int waitTime = 325895;
        int walkTime = 384307;
        int lateTime = 922392;
        int bestArrival = 563997;
        int worstArrival = 879550;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case123() {
        int waitTime = 89094;
        int walkTime = 974488;
        int lateTime = 167178;
        int bestArrival = 192551;
        int worstArrival = 577369;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case124() {
        int waitTime = 38738;
        int walkTime = 275554;
        int lateTime = 17060;
        int bestArrival = 496225;
        int worstArrival = 986371;
        assertEquals(0.772320900303175, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.772320900303175);
    }

    @Test
    public void case125() {
        int waitTime = 349662;
        int walkTime = 341661;
        int lateTime = 522736;
        int bestArrival = 143680;
        int worstArrival = 897197;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case126() {
        int waitTime = 212735;
        int walkTime = 199959;
        int lateTime = 100154;
        int bestArrival = 0;
        int worstArrival = 170085;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case127() {
        int waitTime = 620153;
        int walkTime = 991681;
        int lateTime = 249412;
        int bestArrival = 675433;
        int worstArrival = 900189;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case128() {
        int waitTime = 141560;
        int walkTime = 743485;
        int lateTime = 770359;
        int bestArrival = 0;
        int worstArrival = 128268;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case129() {
        int waitTime = 703661;
        int walkTime = 145018;
        int lateTime = 694831;
        int bestArrival = 0;
        int worstArrival = 315682;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case130() {
        int waitTime = 693639;
        int walkTime = 6037;
        int lateTime = 73075;
        int bestArrival = 296089;
        int worstArrival = 369345;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case131() {
        int waitTime = 598824;
        int walkTime = 943184;
        int lateTime = 417063;
        int bestArrival = 149355;
        int worstArrival = 494799;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case132() {
        int waitTime = 763397;
        int walkTime = 499182;
        int lateTime = 776361;
        int bestArrival = 269819;
        int worstArrival = 593077;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case133() {
        int waitTime = 546791;
        int walkTime = 48816;
        int lateTime = 250928;
        int bestArrival = 234670;
        int worstArrival = 594691;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case134() {
        int waitTime = 215583;
        int walkTime = 52181;
        int lateTime = 34254;
        int bestArrival = 594230;
        int worstArrival = 903386;
        assertEquals(0.057986906286793725, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.057986906286793725);
    }

    @Test
    public void case135() {
        int waitTime = 112125;
        int walkTime = 938216;
        int lateTime = 814808;
        int bestArrival = 968667;
        int worstArrival = 971379;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case136() {
        int waitTime = 433138;
        int walkTime = 597856;
        int lateTime = 95631;
        int bestArrival = 863582;
        int worstArrival = 863582;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case137() {
        int waitTime = 515869;
        int walkTime = 635459;
        int lateTime = 872940;
        int bestArrival = 714553;
        int worstArrival = 714553;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case138() {
        int waitTime = 777057;
        int walkTime = 60805;
        int lateTime = 927343;
        int bestArrival = 173861;
        int worstArrival = 173861;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case139() {
        int waitTime = 85891;
        int walkTime = 78712;
        int lateTime = 94135;
        int bestArrival = 377558;
        int worstArrival = 377558;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case140() {
        int waitTime = 419271;
        int walkTime = 756497;
        int lateTime = 417360;
        int bestArrival = 468006;
        int worstArrival = 468006;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case141() {
        int waitTime = 745246;
        int walkTime = 786193;
        int lateTime = 136604;
        int bestArrival = 338654;
        int worstArrival = 338654;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case142() {
        int waitTime = 374485;
        int walkTime = 38820;
        int lateTime = 836045;
        int bestArrival = 265709;
        int worstArrival = 265709;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case143() {
        int waitTime = 988750;
        int walkTime = 537521;
        int lateTime = 547725;
        int bestArrival = 189297;
        int worstArrival = 189297;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case144() {
        int waitTime = 236722;
        int walkTime = 572622;
        int lateTime = 322507;
        int bestArrival = 258471;
        int worstArrival = 258471;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case145() {
        int waitTime = 181684;
        int walkTime = 713538;
        int lateTime = 871000;
        int bestArrival = 972796;
        int worstArrival = 972796;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case146() {
        int waitTime = 201765;
        int walkTime = 166450;
        int lateTime = 691252;
        int bestArrival = 567147;
        int worstArrival = 567147;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case147() {
        int waitTime = 686727;
        int walkTime = 473793;
        int lateTime = 98035;
        int bestArrival = 555978;
        int worstArrival = 555978;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case148() {
        int waitTime = 699587;
        int walkTime = 60537;
        int lateTime = 428454;
        int bestArrival = 654065;
        int worstArrival = 654065;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case149() {
        int waitTime = 466093;
        int walkTime = 432213;
        int lateTime = 990464;
        int bestArrival = 933579;
        int worstArrival = 933579;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case150() {
        int waitTime = 462670;
        int walkTime = 228357;
        int lateTime = 316069;
        int bestArrival = 248071;
        int worstArrival = 248071;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case151() {
        int waitTime = 894851;
        int walkTime = 21978;
        int lateTime = 195563;
        int bestArrival = 688243;
        int worstArrival = 688243;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case152() {
        int waitTime = 567982;
        int walkTime = 367463;
        int lateTime = 472046;
        int bestArrival = 645786;
        int worstArrival = 645786;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case153() {
        int waitTime = 707730;
        int walkTime = 48923;
        int lateTime = 664291;
        int bestArrival = 726338;
        int worstArrival = 726338;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case154() {
        int waitTime = 151787;
        int walkTime = 414682;
        int lateTime = 779622;
        int bestArrival = 591905;
        int worstArrival = 591905;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case155() {
        int waitTime = 737086;
        int walkTime = 520842;
        int lateTime = 86354;
        int bestArrival = 923024;
        int worstArrival = 923024;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case156() {
        int waitTime = 110654;
        int walkTime = 439198;
        int lateTime = 134130;
        int bestArrival = 373018;
        int worstArrival = 614023;
        assertEquals(0.17719134457791333, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.17719134457791333);
    }

    @Test
    public void case157() {
        int waitTime = 45888;
        int walkTime = 998669;
        int lateTime = 122059;
        int bestArrival = 0;
        int worstArrival = 731646;
        assertEquals(0.9372811441598806, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.9372811441598806);
    }

    @Test
    public void case158() {
        int waitTime = 811728;
        int walkTime = 414034;
        int lateTime = 65679;
        int bestArrival = 0;
        int worstArrival = 621099;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case159() {
        int waitTime = 257845;
        int walkTime = 753255;
        int lateTime = 533795;
        int bestArrival = 585673;
        int worstArrival = 836339;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case160() {
        int waitTime = 374864;
        int walkTime = 712562;
        int lateTime = 236878;
        int bestArrival = 0;
        int worstArrival = 235452;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case161() {
        int waitTime = 994619;
        int walkTime = 742416;
        int lateTime = 31640;
        int bestArrival = 18827;
        int worstArrival = 906346;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case162() {
        int waitTime = 318440;
        int walkTime = 652442;
        int lateTime = 963888;
        int bestArrival = 0;
        int worstArrival = 189859;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case163() {
        int waitTime = 834151;
        int walkTime = 8925;
        int lateTime = 606595;
        int bestArrival = 0;
        int worstArrival = 329619;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case164() {
        int waitTime = 211581;
        int walkTime = 809384;
        int lateTime = 812504;
        int bestArrival = 97495;
        int worstArrival = 941581;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case165() {
        int waitTime = 920224;
        int walkTime = 723627;
        int lateTime = 876236;
        int bestArrival = 0;
        int worstArrival = 127724;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case166() {
        int waitTime = 963459;
        int walkTime = 994011;
        int lateTime = 439268;
        int bestArrival = 0;
        int worstArrival = 876634;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case167() {
        int waitTime = 966141;
        int walkTime = 193767;
        int lateTime = 5184;
        int bestArrival = 117251;
        int worstArrival = 172190;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case168() {
        int waitTime = 135902;
        int walkTime = 487762;
        int lateTime = 127598;
        int bestArrival = 0;
        int worstArrival = 171943;
        assertEquals(0.20961016150701103, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.20961016150701103);
    }

    @Test
    public void case169() {
        int waitTime = 949464;
        int walkTime = 319653;
        int lateTime = 571155;
        int bestArrival = 0;
        int worstArrival = 470385;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case170() {
        int waitTime = 367268;
        int walkTime = 795160;
        int lateTime = 146465;
        int bestArrival = 9293;
        int worstArrival = 138178;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case171() {
        int waitTime = 131487;
        int walkTime = 882340;
        int lateTime = 295484;
        int bestArrival = 0;
        int worstArrival = 221321;
        assertEquals(0.40589912389696414, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.40589912389696414);
    }

    @Test
    public void case172() {
        int waitTime = 737681;
        int walkTime = 650467;
        int lateTime = 795714;
        int bestArrival = 228433;
        int worstArrival = 483794;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case173() {
        int waitTime = 490875;
        int walkTime = 560982;
        int lateTime = 877390;
        int bestArrival = 237293;
        int worstArrival = 912607;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case174() {
        int waitTime = 234224;
        int walkTime = 759883;
        int lateTime = 848915;
        int bestArrival = 0;
        int worstArrival = 568750;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case175() {
        int waitTime = 113496;
        int walkTime = 837665;
        int lateTime = 204172;
        int bestArrival = 136538;
        int worstArrival = 688593;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case176() {
        int waitTime = 504781;
        int walkTime = 544634;
        int lateTime = 19030;
        int bestArrival = 285466;
        int worstArrival = 997440;
        assertEquals(0.6919620660305011, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.6919620660305011);
    }

    @Test
    public void case177() {
        int waitTime = 30325;
        int walkTime = 53751;
        int lateTime = 863797;
        int bestArrival = 318428;
        int worstArrival = 380591;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case178() {
        int waitTime = 204601;
        int walkTime = 271926;
        int lateTime = 210630;
        int bestArrival = 0;
        int worstArrival = 327480;
        assertEquals(0.18717478930010992, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.18717478930010992);
    }

    @Test
    public void case179() {
        int waitTime = 38900;
        int walkTime = 487712;
        int lateTime = 491573;
        int bestArrival = 1723;
        int worstArrival = 153323;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case180() {
        int waitTime = 706212;
        int walkTime = 118341;
        int lateTime = 442071;
        int bestArrival = 0;
        int worstArrival = 573249;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case181() {
        int waitTime = 951687;
        int walkTime = 427004;
        int lateTime = 499350;
        int bestArrival = 828983;
        int worstArrival = 957745;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case182() {
        int waitTime = 298601;
        int walkTime = 977218;
        int lateTime = 124565;
        int bestArrival = 192164;
        int worstArrival = 463100;
        assertEquals(0.6071507662326158, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.6071507662326158);
    }

    @Test
    public void case183() {
        int waitTime = 605165;
        int walkTime = 739451;
        int lateTime = 554037;
        int bestArrival = 520065;
        int worstArrival = 771981;
        assertEquals(0.6621889836294638, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.6621889836294638);
    }

    @Test
    public void case184() {
        int waitTime = 730370;
        int walkTime = 645015;
        int lateTime = 734172;
        int bestArrival = 0;
        int worstArrival = 474528;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case185() {
        int waitTime = 70371;
        int walkTime = 840430;
        int lateTime = 516031;
        int bestArrival = 0;
        int worstArrival = 211006;
        assertEquals(0.6664976351383373, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.6664976351383373);
    }

    @Test
    public void case186() {
        int waitTime = 185315;
        int walkTime = 716503;
        int lateTime = 164908;
        int bestArrival = 316564;
        int worstArrival = 338752;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case187() {
        int waitTime = 127317;
        int walkTime = 980491;
        int lateTime = 278983;
        int bestArrival = 242785;
        int worstArrival = 601405;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case188() {
        int waitTime = 254526;
        int walkTime = 668497;
        int lateTime = 355235;
        int bestArrival = 70458;
        int worstArrival = 458224;
        assertEquals(0.5253116570302708, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.5253116570302708);
    }

    @Test
    public void case189() {
        int waitTime = 525130;
        int walkTime = 796222;
        int lateTime = 745530;
        int bestArrival = 391397;
        int worstArrival = 957121;
        assertEquals(0.08960553202621774, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.08960553202621774);
    }

    @Test
    public void case190() {
        int waitTime = 510100;
        int walkTime = 964361;
        int lateTime = 884630;
        int bestArrival = 461246;
        int worstArrival = 953506;
        assertEquals(0.16196928452443832, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.16196928452443832);
    }

    @Test
    public void case191() {
        int waitTime = 41908;
        int walkTime = 414411;
        int lateTime = 349624;
        int bestArrival = 0;
        int worstArrival = 219293;
        assertEquals(0.29543578682402083, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.29543578682402083);
    }

    @Test
    public void case192() {
        int waitTime = 972900;
        int walkTime = 954724;
        int lateTime = 698264;
        int bestArrival = 701045;
        int worstArrival = 978888;
        assertEquals(0.02155173965152982, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.02155173965152982);
    }

    @Test
    public void case193() {
        int waitTime = 265015;
        int walkTime = 839117;
        int lateTime = 460082;
        int bestArrival = 0;
        int worstArrival = 621369;
        assertEquals(0.5734981951143362, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.5734981951143362);
    }

    @Test
    public void case194() {
        int waitTime = 745249;
        int walkTime = 791292;
        int lateTime = 61559;
        int bestArrival = 0;
        int worstArrival = 23397;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case195() {
        int waitTime = 100;
        int walkTime = 42;
        int lateTime = 15;
        int bestArrival = 110;
        int worstArrival = 131;
        assertEquals(0.8095238095238095, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.8095238095238095);
    }

    @Test
    public void case196() {
        int waitTime = 1;
        int walkTime = 1;
        int lateTime = 1;
        int bestArrival = 3;
        int worstArrival = 3;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case197() {
        int waitTime = 17;
        int walkTime = 47;
        int lateTime = 3;
        int bestArrival = 178532;
        int worstArrival = 323244;
        assertEquals(0.6875172756924097, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.6875172756924097);
    }

    @Test
    public void case198() {
        int waitTime = 2;
        int walkTime = 3;
        int lateTime = 2;
        int bestArrival = 1;
        int worstArrival = 10000000;
        assertEquals(0.200000020000002, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.200000020000002);
    }

    @Test
    public void case199() {
        int waitTime = 1;
        int walkTime = 1;
        int lateTime = 1;
        int bestArrival = 0;
        int worstArrival = 10000000;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case200() {
        int waitTime = 1;
        int walkTime = 1;
        int lateTime = 1;
        int bestArrival = 1;
        int worstArrival = 1;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case201() {
        int waitTime = 2;
        int walkTime = 2;
        int lateTime = 2;
        int bestArrival = 1;
        int worstArrival = 1;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case202() {
        int waitTime = 10;
        int walkTime = 10;
        int lateTime = 1;
        int bestArrival = 100;
        int worstArrival = 100;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case203() {
        int waitTime = 10;
        int walkTime = 10;
        int lateTime = 10;
        int bestArrival = 10;
        int worstArrival = 10;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case204() {
        int waitTime = 1;
        int walkTime = 1;
        int lateTime = 1;
        int bestArrival = 1;
        int worstArrival = 10000000;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case205() {
        int waitTime = 1;
        int walkTime = 1;
        int lateTime = 10000000;
        int bestArrival = 1;
        int worstArrival = 10000000;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case206() {
        int waitTime = 2;
        int walkTime = 15;
        int lateTime = 1;
        int bestArrival = 99;
        int worstArrival = 10000;
        assertEquals(0.8233511766488234, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.8233511766488234);
    }

    @Test
    public void case207() {
        int waitTime = 23322;
        int walkTime = 212322;
        int lateTime = 12232;
        int bestArrival = 1000000;
        int worstArrival = 10000000;
        assertEquals(0.8498831111111111, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.8498831111111111);
    }

    @Test
    public void case208() {
        int waitTime = 3;
        int walkTime = 3;
        int lateTime = 1;
        int bestArrival = 10;
        int worstArrival = 10;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case209() {
        int waitTime = 10;
        int walkTime = 10;
        int lateTime = 2;
        int bestArrival = 5;
        int worstArrival = 25;
        assertEquals(0.4, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.4);
    }

    @Test
    public void case210() {
        int waitTime = 10;
        int walkTime = 10;
        int lateTime = 10;
        int bestArrival = 5;
        int worstArrival = 5;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case211() {
        int waitTime = 1;
        int walkTime = 2;
        int lateTime = 1;
        int bestArrival = 0;
        int worstArrival = 10000000;
        assertEquals(0.3333333, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.3333333);
    }

    @Test
    public void case212() {
        int waitTime = 20;
        int walkTime = 20;
        int lateTime = 10;
        int bestArrival = 35;
        int worstArrival = 35;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case213() {
        int waitTime = 3;
        int walkTime = 150;
        int lateTime = 5;
        int bestArrival = 35;
        int worstArrival = 35;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case214() {
        int waitTime = 34;
        int walkTime = 43;
        int lateTime = 7;
        int bestArrival = 4567;
        int worstArrival = 10000000;
        assertEquals(0.4675331223769896, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.4675331223769896);
    }

    @Test
    public void case215() {
        int waitTime = 25;
        int walkTime = 25;
        int lateTime = 1;
        int bestArrival = 25;
        int worstArrival = 75;
        assertEquals(0.48, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.48);
    }

    @Test
    public void case216() {
        int waitTime = 2;
        int walkTime = 2;
        int lateTime = 2;
        int bestArrival = 3;
        int worstArrival = 3;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case217() {
        int waitTime = 1000000;
        int walkTime = 100000;
        int lateTime = 1;
        int bestArrival = 1;
        int worstArrival = 10000000;
        assertEquals(0.0899991089999109, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.0899991089999109);
    }

    @Test
    public void case218() {
        int waitTime = 20;
        int walkTime = 40;
        int lateTime = 100;
        int bestArrival = 100;
        int worstArrival = 100;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case219() {
        int waitTime = 2;
        int walkTime = 2;
        int lateTime = 1;
        int bestArrival = 0;
        int worstArrival = 10000000;
        assertEquals(0.25, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.25);
    }

    @Test
    public void case220() {
        int waitTime = 20;
        int walkTime = 20;
        int lateTime = 10;
        int bestArrival = 71;
        int worstArrival = 71;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case221() {
        int waitTime = 50;
        int walkTime = 50;
        int lateTime = 30;
        int bestArrival = 75;
        int worstArrival = 75;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case222() {
        int waitTime = 20;
        int walkTime = 20;
        int lateTime = 20;
        int bestArrival = 25;
        int worstArrival = 25;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case223() {
        int waitTime = 5;
        int walkTime = 5;
        int lateTime = 1;
        int bestArrival = 10;
        int worstArrival = 10;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case224() {
        int waitTime = 1;
        int walkTime = 2;
        int lateTime = 1;
        int bestArrival = 1;
        int worstArrival = 10000000;
        assertEquals(0.3333333333333333, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.3333333333333333);
    }

    @Test
    public void case225() {
        int waitTime = 5000;
        int walkTime = 5000;
        int lateTime = 1000;
        int bestArrival = 9500;
        int worstArrival = 9500;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case226() {
        int waitTime = 2;
        int walkTime = 4;
        int lateTime = 2;
        int bestArrival = 3;
        int worstArrival = 3;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case227() {
        int waitTime = 13;
        int walkTime = 55;
        int lateTime = 10;
        int bestArrival = 0;
        int worstArrival = 567;
        assertEquals(0.6525573192239859, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.6525573192239859);
    }

    @Test
    public void case228() {
        int waitTime = 1;
        int walkTime = 2;
        int lateTime = 1;
        int bestArrival = 20;
        int worstArrival = 20;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case229() {
        int waitTime = 1;
        int walkTime = 1;
        int lateTime = 10000000;
        int bestArrival = 10;
        int worstArrival = 10000000;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case230() {
        int waitTime = 20;
        int walkTime = 30;
        int lateTime = 11;
        int bestArrival = 90;
        int worstArrival = 90;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case231() {
        int waitTime = 20;
        int walkTime = 30;
        int lateTime = 10;
        int bestArrival = 23;
        int worstArrival = 74;
        assertEquals(0.4117647058823529, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.4117647058823529);
    }

    @Test
    public void case232() {
        int waitTime = 2;
        int walkTime = 2;
        int lateTime = 1;
        int bestArrival = 4;
        int worstArrival = 4;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case233() {
        int waitTime = 20;
        int walkTime = 30;
        int lateTime = 1000000;
        int bestArrival = 1000;
        int worstArrival = 1000;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case234() {
        int waitTime = 10;
        int walkTime = 10;
        int lateTime = 1000000;
        int bestArrival = 50;
        int worstArrival = 90;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case235() {
        int waitTime = 10;
        int walkTime = 10;
        int lateTime = 1;
        int bestArrival = 3;
        int worstArrival = 3;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case236() {
        int waitTime = 40;
        int walkTime = 10;
        int lateTime = 10;
        int bestArrival = 40;
        int worstArrival = 40;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case237() {
        int waitTime = 10;
        int walkTime = 10;
        int lateTime = 5;
        int bestArrival = 119;
        int worstArrival = 119;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case238() {
        int waitTime = 121;
        int walkTime = 222;
        int lateTime = 101;
        int bestArrival = 65;
        int worstArrival = 17890;
        assertEquals(0.3529873772791024, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.3529873772791024);
    }

    @Test
    public void case239() {
        int waitTime = 20;
        int walkTime = 10;
        int lateTime = 10;
        int bestArrival = 20;
        int worstArrival = 20;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case240() {
        int waitTime = 1;
        int walkTime = 1;
        int lateTime = 100;
        int bestArrival = 0;
        int worstArrival = 10000000;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case241() {
        int waitTime = 10000000;
        int walkTime = 10000000;
        int lateTime = 10000000;
        int bestArrival = 10000000;
        int worstArrival = 10000000;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case242() {
        int waitTime = 30;
        int walkTime = 20;
        int lateTime = 2;
        int bestArrival = 49;
        int worstArrival = 49;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case243() {
        int waitTime = 3;
        int walkTime = 3;
        int lateTime = 2;
        int bestArrival = 5;
        int worstArrival = 5;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case244() {
        int waitTime = 4;
        int walkTime = 4;
        int lateTime = 3;
        int bestArrival = 6;
        int worstArrival = 6;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case245() {
        int waitTime = 10;
        int walkTime = 10;
        int lateTime = 5;
        int bestArrival = 17;
        int worstArrival = 17;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case246() {
        int waitTime = 10;
        int walkTime = 10;
        int lateTime = 1;
        int bestArrival = 5;
        int worstArrival = 7;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case247() {
        int waitTime = 1;
        int walkTime = 5;
        int lateTime = 6;
        int bestArrival = 2;
        int worstArrival = 2;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case248() {
        int waitTime = 1;
        int walkTime = 1;
        int lateTime = 1;
        int bestArrival = 100;
        int worstArrival = 102;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case249() {
        int waitTime = 1;
        int walkTime = 5;
        int lateTime = 4;
        int bestArrival = 3;
        int worstArrival = 3;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case250() {
        int waitTime = 20;
        int walkTime = 30;
        int lateTime = 9;
        int bestArrival = 99;
        int worstArrival = 99;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case251() {
        int waitTime = 100;
        int walkTime = 100;
        int lateTime = 300;
        int bestArrival = 150;
        int worstArrival = 150;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case252() {
        int waitTime = 2;
        int walkTime = 5;
        int lateTime = 2;
        int bestArrival = 6;
        int worstArrival = 6;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case253() {
        int waitTime = 20;
        int walkTime = 20;
        int lateTime = 10;
        int bestArrival = 10;
        int worstArrival = 10;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case254() {
        int waitTime = 30;
        int walkTime = 5;
        int lateTime = 100;
        int bestArrival = 65;
        int worstArrival = 65;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case255() {
        int waitTime = 20;
        int walkTime = 30;
        int lateTime = 1;
        int bestArrival = 120;
        int worstArrival = 120;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case256() {
        int waitTime = 10;
        int walkTime = 10;
        int lateTime = 1;
        int bestArrival = 0;
        int worstArrival = 10;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case257() {
        int waitTime = 9999990;
        int walkTime = 2;
        int lateTime = 1;
        int bestArrival = 0;
        int worstArrival = 10000000;
        assertEquals(1.0e-07, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0e-07);
    }

    @Test
    public void case258() {
        int waitTime = 20;
        int walkTime = 30;
        int lateTime = 1;
        int bestArrival = 21;
        int worstArrival = 25;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case259() {
        int waitTime = 1;
        int walkTime = 100;
        int lateTime = 50;
        int bestArrival = 70;
        int worstArrival = 70;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case260() {
        int waitTime = 20;
        int walkTime = 30;
        int lateTime = 5;
        int bestArrival = 25;
        int worstArrival = 25;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case261() {
        int waitTime = 2;
        int walkTime = 2;
        int lateTime = 1;
        int bestArrival = 1;
        int worstArrival = 10000000;
        assertEquals(0.2500000250000025, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.2500000250000025);
    }

    @Test
    public void case262() {
        int waitTime = 100;
        int walkTime = 42;
        int lateTime = 15;
        int bestArrival = 110;
        int worstArrival = 130;
        assertEquals(0.85, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.85);
    }

    @Test
    public void case263() {
        int waitTime = 20;
        int walkTime = 30;
        int lateTime = 10;
        int bestArrival = 45;
        int worstArrival = 45;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case264() {
        int waitTime = 10;
        int walkTime = 10;
        int lateTime = 5;
        int bestArrival = 19;
        int worstArrival = 19;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case265() {
        int waitTime = 20;
        int walkTime = 30;
        int lateTime = 10;
        int bestArrival = 25;
        int worstArrival = 25;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case266() {
        int waitTime = 1;
        int walkTime = 10;
        int lateTime = 1;
        int bestArrival = 10;
        int worstArrival = 10;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case267() {
        int waitTime = 20;
        int walkTime = 30;
        int lateTime = 50;
        int bestArrival = 50;
        int worstArrival = 50;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case268() {
        int waitTime = 1;
        int walkTime = 2;
        int lateTime = 1;
        int bestArrival = 2;
        int worstArrival = 2;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case269() {
        int waitTime = 4;
        int walkTime = 9;
        int lateTime = 1;
        int bestArrival = 3;
        int worstArrival = 3;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case270() {
        int waitTime = 1;
        int walkTime = 3;
        int lateTime = 1;
        int bestArrival = 1;
        int worstArrival = 2;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case271() {
        int waitTime = 2;
        int walkTime = 2;
        int lateTime = 1;
        int bestArrival = 3;
        int worstArrival = 3;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case272() {
        int waitTime = 1;
        int walkTime = 2;
        int lateTime = 1;
        int bestArrival = 0;
        int worstArrival = 29;
        assertEquals(0.3448275862068966, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.3448275862068966);
    }

    @Test
    public void case273() {
        int waitTime = 86;
        int walkTime = 42;
        int lateTime = 24;
        int bestArrival = 30;
        int worstArrival = 30;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case274() {
        int waitTime = 1;
        int walkTime = 3;
        int lateTime = 1;
        int bestArrival = 1;
        int worstArrival = 3;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case275() {
        int waitTime = 1;
        int walkTime = 29;
        int lateTime = 1;
        int bestArrival = 100;
        int worstArrival = 100;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case276() {
        int waitTime = 2000;
        int walkTime = 7000;
        int lateTime = 6000;
        int bestArrival = 400;
        int worstArrival = 5000;
        assertEquals(0.21739130434782608, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.21739130434782608);
    }

    @Test
    public void case277() {
        int waitTime = 5;
        int walkTime = 5;
        int lateTime = 1;
        int bestArrival = 11;
        int worstArrival = 11;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case278() {
        int waitTime = 1337;
        int walkTime = 31337;
        int lateTime = 239;
        int bestArrival = 21;
        int worstArrival = 9999999;
        assertEquals(0.951642693613926, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.951642693613926);
    }

    @Test
    public void case279() {
        int waitTime = 4;
        int walkTime = 4;
        int lateTime = 1;
        int bestArrival = 7;
        int worstArrival = 8;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case280() {
        int waitTime = 3;
        int walkTime = 3;
        int lateTime = 1;
        int bestArrival = 4;
        int worstArrival = 4;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case281() {
        int waitTime = 20;
        int walkTime = 30;
        int lateTime = 5;
        int bestArrival = 50;
        int worstArrival = 50;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case282() {
        int waitTime = 2;
        int walkTime = 4;
        int lateTime = 2;
        int bestArrival = 1;
        int worstArrival = 1;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case283() {
        int waitTime = 10;
        int walkTime = 10;
        int lateTime = 1;
        int bestArrival = 12;
        int worstArrival = 15;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case284() {
        int waitTime = 1;
        int walkTime = 2;
        int lateTime = 1;
        int bestArrival = 10;
        int worstArrival = 10000000;
        assertEquals(0.3333333333333333, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.3333333333333333);
    }

    @Test
    public void case285() {
        int waitTime = 9000000;
        int walkTime = 9000000;
        int lateTime = 100;
        int bestArrival = 9000200;
        int worstArrival = 10000000;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case286() {
        int waitTime = 100;
        int walkTime = 100;
        int lateTime = 1;
        int bestArrival = 1;
        int worstArrival = 1;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case287() {
        int waitTime = 10;
        int walkTime = 10;
        int lateTime = 5;
        int bestArrival = 15;
        int worstArrival = 15;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case288() {
        int waitTime = 1;
        int walkTime = 2;
        int lateTime = 1;
        int bestArrival = 1;
        int worstArrival = 5;
        assertEquals(0.5, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.5);
    }

    @Test
    public void case289() {
        int waitTime = 100;
        int walkTime = 100;
        int lateTime = 50;
        int bestArrival = 175;
        int worstArrival = 175;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case290() {
        int waitTime = 99;
        int walkTime = 200;
        int lateTime = 100;
        int bestArrival = 101;
        int worstArrival = 101;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case291() {
        int waitTime = 5;
        int walkTime = 6;
        int lateTime = 5;
        int bestArrival = 10;
        int worstArrival = 10;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case292() {
        int waitTime = 10;
        int walkTime = 10;
        int lateTime = 1;
        int bestArrival = 5;
        int worstArrival = 19;
        assertEquals(0.6428571428571429, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.6428571428571429);
    }

    @Test
    public void case293() {
        int waitTime = 8;
        int walkTime = 2;
        int lateTime = 1;
        int bestArrival = 11;
        int worstArrival = 11;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case294() {
        int waitTime = 5;
        int walkTime = 5;
        int lateTime = 1;
        int bestArrival = 6;
        int worstArrival = 6;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case295() {
        int waitTime = 2;
        int walkTime = 3;
        int lateTime = 1;
        int bestArrival = 1;
        int worstArrival = 1;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case296() {
        int waitTime = 20;
        int walkTime = 20;
        int lateTime = 1000;
        int bestArrival = 30;
        int worstArrival = 30;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case297() {
        int waitTime = 100;
        int walkTime = 100;
        int lateTime = 99;
        int bestArrival = 150;
        int worstArrival = 150;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case298() {
        int waitTime = 2000000;
        int walkTime = 3000000;
        int lateTime = 1000000;
        int bestArrival = 9999999;
        int worstArrival = 9999999;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case299() {
        int waitTime = 10;
        int walkTime = 30;
        int lateTime = 1;
        int bestArrival = 30;
        int worstArrival = 30;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case300() {
        int waitTime = 1;
        int walkTime = 10;
        int lateTime = 1;
        int bestArrival = 2;
        int worstArrival = 3;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case301() {
        int waitTime = 2;
        int walkTime = 1;
        int lateTime = 1000000;
        int bestArrival = 0;
        int worstArrival = 10000000;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case302() {
        int waitTime = 3;
        int walkTime = 600;
        int lateTime = 1;
        int bestArrival = 0;
        int worstArrival = 10;
        assertEquals(0.7, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.7);
    }

    @Test
    public void case303() {
        int waitTime = 10;
        int walkTime = 2;
        int lateTime = 1;
        int bestArrival = 2;
        int worstArrival = 2;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case304() {
        int waitTime = 1000;
        int walkTime = 566;
        int lateTime = 125;
        int bestArrival = 1700;
        int worstArrival = 852129;
        assertEquals(0.2815790618617192, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.2815790618617192);
    }

    @Test
    public void case305() {
        int waitTime = 1000;
        int walkTime = 600;
        int lateTime = 100;
        int bestArrival = 17502;
        int worstArrival = 17502;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case306() {
        int waitTime = 2;
        int walkTime = 4;
        int lateTime = 3;
        int bestArrival = 4;
        int worstArrival = 4;
        assertEquals(0.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA);
    }

    @Test
    public void case307() {
        int waitTime = 20;
        int walkTime = 30;
        int lateTime = 10;
        int bestArrival = 21;
        int worstArrival = 21;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case308() {
        int waitTime = 20;
        int walkTime = 30;
        int lateTime = 20;
        int bestArrival = 25;
        int worstArrival = 25;
        assertEquals(1.0, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 1.0);
    }

    @Test
    public void case309() {
        int waitTime = 20;
        int walkTime = 100;
        int lateTime = 2;
        int bestArrival = 128;
        int worstArrival = 8997;
        assertEquals(0.817566805727816, lateprofessor.getProbability(waitTime, walkTime, lateTime, bestArrival, worstArrival), DELTA * 0.817566805727816);
    }

}
