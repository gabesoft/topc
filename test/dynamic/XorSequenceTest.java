package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class XorSequenceTest {
    XorSequence xorsequence = new XorSequence();

    @Test
    public void case1() {
        int N = 4;
        int sz = 6;
        int A0 = 3;
        int A1 = 2;
        int P = 0;
        int Q = 1;
        int R = 3;
        assertEquals(8L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case2() {
        int N = 8;
        int sz = 8;
        int A0 = 2;
        int A1 = 5;
        int P = 3;
        int Q = 1;
        int R = 4;
        assertEquals(13L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case3() {
        int N = 8;
        int sz = 7;
        int A0 = 3;
        int A1 = 0;
        int P = 1;
        int Q = 2;
        int R = 4;
        assertEquals(12L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case4() {
        int N = 32;
        int sz = 15;
        int A0 = 7;
        int A1 = 9;
        int P = 11;
        int Q = 2;
        int R = 1;
        assertEquals(60L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case5() {
        int N = 131072;
        int sz = 131072;
        int A0 = 7;
        int A1 = 7;
        int P = 1;
        int Q = 0;
        int R = 0;
        assertEquals(0L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case6() {
        int N = 131072;
        int sz = 131070;
        int A0 = 411;
        int A1 = 415;
        int P = 398;
        int Q = 463;
        int R = 9191;
        assertEquals(4302679760L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case7() {
        int N = 2;
        int sz = 23237;
        int A0 = 0;
        int A1 = 1;
        int P = 1;
        int Q = 1;
        int R = 1;
        assertEquals(60000516L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case8() {
        int N = 2;
        int sz = 39088;
        int A0 = 0;
        int A1 = 0;
        int P = 0;
        int Q = 1;
        int R = 1;
        assertEquals(190993739L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case9() {
        int N = 2;
        int sz = 88857;
        int A0 = 0;
        int A1 = 1;
        int P = 1;
        int Q = 0;
        int R = 0;
        assertEquals(986945806L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case10() {
        int N = 4;
        int sz = 77309;
        int A0 = 3;
        int A1 = 0;
        int P = 2;
        int Q = 0;
        int R = 3;
        assertEquals(231918L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case11() {
        int N = 4;
        int sz = 89167;
        int A0 = 3;
        int A1 = 2;
        int P = 3;
        int Q = 2;
        int R = 1;
        assertEquals(1490844376L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case12() {
        int N = 4;
        int sz = 20187;
        int A0 = 2;
        int A1 = 2;
        int P = 3;
        int Q = 0;
        int R = 3;
        assertEquals(50944418L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case13() {
        int N = 8;
        int sz = 62560;
        int A0 = 0;
        int A1 = 4;
        int P = 3;
        int Q = 4;
        int R = 7;
        assertEquals(611563100L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case14() {
        int N = 8;
        int sz = 122220;
        int A0 = 0;
        int A1 = 1;
        int P = 3;
        int Q = 7;
        int R = 0;
        assertEquals(2904599040L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case15() {
        int N = 8;
        int sz = 71377;
        int A0 = 3;
        int A1 = 6;
        int P = 2;
        int Q = 7;
        int R = 4;
        assertEquals(636941577L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case16() {
        int N = 16;
        int sz = 58857;
        int A0 = 10;
        int A1 = 15;
        int P = 8;
        int Q = 5;
        int R = 7;
        assertEquals(811936911L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case17() {
        int N = 16;
        int sz = 34010;
        int A0 = 7;
        int A1 = 11;
        int P = 13;
        int Q = 8;
        int R = 15;
        assertEquals(271158549L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case18() {
        int N = 16;
        int sz = 11876;
        int A0 = 4;
        int A1 = 12;
        int P = 11;
        int Q = 15;
        int R = 15;
        assertEquals(27426963L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case19() {
        int N = 32;
        int sz = 15831;
        int A0 = 8;
        int A1 = 19;
        int P = 23;
        int Q = 22;
        int R = 4;
        assertEquals(60704836L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case20() {
        int N = 32;
        int sz = 54222;
        int A0 = 0;
        int A1 = 4;
        int P = 26;
        int Q = 29;
        int R = 23;
        assertEquals(689109087L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case21() {
        int N = 32;
        int sz = 3316;
        int A0 = 16;
        int A1 = 21;
        int P = 19;
        int Q = 14;
        int R = 24;
        assertEquals(2663474L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case22() {
        int N = 64;
        int sz = 93536;
        int A0 = 22;
        int A1 = 60;
        int P = 31;
        int Q = 49;
        int R = 13;
        assertEquals(1944260080L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case23() {
        int N = 64;
        int sz = 107601;
        int A0 = 44;
        int A1 = 9;
        int P = 9;
        int Q = 18;
        int R = 2;
        assertEquals(2826781441L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case24() {
        int N = 64;
        int sz = 121491;
        int A0 = 9;
        int A1 = 40;
        int P = 18;
        int Q = 16;
        int R = 60;
        assertEquals(1214830L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case25() {
        int N = 128;
        int sz = 117223;
        int A0 = 7;
        int A1 = 84;
        int P = 77;
        int Q = 66;
        int R = 16;
        assertEquals(3395264068L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case26() {
        int N = 128;
        int sz = 12702;
        int A0 = 49;
        int A1 = 72;
        int P = 123;
        int Q = 69;
        int R = 100;
        assertEquals(38810080L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case27() {
        int N = 128;
        int sz = 107016;
        int A0 = 124;
        int A1 = 67;
        int P = 79;
        int Q = 79;
        int R = 66;
        assertEquals(2385952933L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case28() {
        int N = 256;
        int sz = 88175;
        int A0 = 230;
        int A1 = 214;
        int P = 50;
        int Q = 134;
        int R = 143;
        assertEquals(1322467L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case29() {
        int N = 256;
        int sz = 111398;
        int A0 = 212;
        int A1 = 2;
        int P = 242;
        int Q = 250;
        int R = 231;
        assertEquals(1559403L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case30() {
        int N = 256;
        int sz = 118379;
        int A0 = 105;
        int A1 = 50;
        int P = 217;
        int Q = 225;
        int R = 215;
        assertEquals(3460992309L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case31() {
        int N = 512;
        int sz = 66660;
        int A0 = 484;
        int A1 = 225;
        int P = 431;
        int Q = 125;
        int R = 213;
        assertEquals(1107107700L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case32() {
        int N = 512;
        int sz = 83269;
        int A0 = 93;
        int A1 = 276;
        int P = 409;
        int Q = 342;
        int R = 272;
        assertEquals(1728583700L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case33() {
        int N = 512;
        int sz = 6205;
        int A0 = 393;
        int A1 = 420;
        int P = 432;
        int Q = 212;
        int R = 45;
        assertEquals(37206L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case34() {
        int N = 1024;
        int sz = 6798;
        int A0 = 1009;
        int A1 = 446;
        int P = 31;
        int Q = 270;
        int R = 10;
        assertEquals(11539368L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case35() {
        int N = 1024;
        int sz = 42524;
        int A0 = 241;
        int A1 = 521;
        int P = 803;
        int Q = 354;
        int R = 550;
        assertEquals(451325477L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case36() {
        int N = 1024;
        int sz = 55968;
        int A0 = 505;
        int A1 = 407;
        int P = 538;
        int Q = 193;
        int R = 23;
        assertEquals(780238969L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case37() {
        int N = 2048;
        int sz = 69513;
        int A0 = 2018;
        int A1 = 1972;
        int P = 1349;
        int Q = 49;
        int R = 431;
        assertEquals(1207414090L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case38() {
        int N = 2048;
        int sz = 83281;
        int A0 = 1554;
        int A1 = 1879;
        int P = 1132;
        int Q = 274;
        int R = 1122;
        assertEquals(999251L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case39() {
        int N = 2048;
        int sz = 117323;
        int A0 = 1151;
        int A1 = 764;
        int P = 670;
        int Q = 1794;
        int R = 195;
        assertEquals(2463457L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case40() {
        int N = 4096;
        int sz = 128046;
        int A0 = 3571;
        int A1 = 2536;
        int P = 936;
        int Q = 3943;
        int R = 793;
        assertEquals(4067046584L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case41() {
        int N = 4096;
        int sz = 104175;
        int A0 = 3249;
        int A1 = 3009;
        int P = 1470;
        int Q = 2236;
        int R = 482;
        assertEquals(2499749L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case42() {
        int N = 4096;
        int sz = 6718;
        int A0 = 555;
        int A1 = 1722;
        int P = 2858;
        int Q = 1460;
        int R = 2844;
        assertEquals(154111L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case43() {
        int N = 8192;
        int sz = 30679;
        int A0 = 6318;
        int A1 = 678;
        int P = 2195;
        int Q = 3892;
        int R = 655;
        assertEquals(235322340L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case44() {
        int N = 8192;
        int sz = 50338;
        int A0 = 4045;
        int A1 = 1133;
        int P = 7189;
        int Q = 5755;
        int R = 5499;
        assertEquals(634045519L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case45() {
        int N = 8192;
        int sz = 74319;
        int A0 = 8186;
        int A1 = 6723;
        int P = 690;
        int Q = 7194;
        int R = 5783;
        assertEquals(1708907L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case46() {
        int N = 16384;
        int sz = 22511;
        int A0 = 8019;
        int A1 = 7730;
        int P = 9076;
        int Q = 8314;
        int R = 15057;
        assertEquals(314997L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case47() {
        int N = 16384;
        int sz = 55291;
        int A0 = 7543;
        int A1 = 2806;
        int P = 4835;
        int Q = 14862;
        int R = 13760;
        assertEquals(764681939L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case48() {
        int N = 16384;
        int sz = 48582;
        int A0 = 16306;
        int A1 = 6749;
        int P = 7294;
        int Q = 6486;
        int R = 8969;
        assertEquals(1214049L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case49() {
        int N = 32768;
        int sz = 41039;
        int A0 = 13088;
        int A1 = 161;
        int P = 5359;
        int Q = 20402;
        int R = 18154;
        assertEquals(421607032L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case50() {
        int N = 32768;
        int sz = 53611;
        int A0 = 94;
        int A1 = 19585;
        int P = 2365;
        int Q = 29842;
        int R = 14215;
        assertEquals(719137701L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case51() {
        int N = 32768;
        int sz = 82682;
        int A0 = 21028;
        int A1 = 18438;
        int P = 25778;
        int Q = 16414;
        int R = 10508;
        assertEquals(2149173L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case52() {
        int N = 65536;
        int sz = 101732;
        int A0 = 7256;
        int A1 = 35171;
        int P = 64873;
        int Q = 36347;
        int R = 31520;
        assertEquals(2589979486L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case53() {
        int N = 65536;
        int sz = 18504;
        int A0 = 14443;
        int A1 = 22184;
        int P = 30654;
        int Q = 7132;
        int R = 41092;
        assertEquals(536018L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case54() {
        int N = 65536;
        int sz = 70701;
        int A0 = 537;
        int A1 = 54387;
        int P = 20930;
        int Q = 63086;
        int R = 38728;
        assertEquals(2191033L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case55() {
        int N = 131072;
        int sz = 36501;
        int A0 = 109138;
        int A1 = 39607;
        int P = 102847;
        int Q = 129932;
        int R = 47848;
        assertEquals(334216715L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case56() {
        int N = 131072;
        int sz = 61209;
        int A0 = 77572;
        int A1 = 75585;
        int P = 130707;
        int Q = 67821;
        int R = 103774;
        assertEquals(937269886L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case57() {
        int N = 131072;
        int sz = 10789;
        int A0 = 110364;
        int A1 = 112993;
        int P = 126149;
        int Q = 88307;
        int R = 65886;
        assertEquals(29323639L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case58() {
        int N = 262144;
        int sz = 26132;
        int A0 = 82911;
        int A1 = 116533;
        int P = 189130;
        int Q = 134711;
        int R = 207986;
        assertEquals(170900013L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case59() {
        int N = 262144;
        int sz = 19669;
        int A0 = 202024;
        int A1 = 73626;
        int P = 259981;
        int Q = 137367;
        int R = 117363;
        assertEquals(97013187L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case60() {
        int N = 262144;
        int sz = 63578;
        int A0 = 182580;
        int A1 = 1151;
        int P = 24380;
        int Q = 121966;
        int R = 127601;
        assertEquals(1080601L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case61() {
        int N = 524288;
        int sz = 63875;
        int A0 = 239846;
        int A1 = 496912;
        int P = 163874;
        int Q = 451750;
        int R = 216338;
        assertEquals(2298542L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case62() {
        int N = 524288;
        int sz = 76851;
        int A0 = 106815;
        int A1 = 442987;
        int P = 457652;
        int Q = 41007;
        int R = 502193;
        assertEquals(1479625939L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case63() {
        int N = 524288;
        int sz = 9646;
        int A0 = 103391;
        int A1 = 436409;
        int P = 84855;
        int Q = 417173;
        int R = 362362;
        assertEquals(23356375L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case64() {
        int N = 1048576;
        int sz = 91779;
        int A0 = 473106;
        int A1 = 716006;
        int P = 473690;
        int Q = 359171;
        int R = 87112;
        assertEquals(2107785803L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case65() {
        int N = 1048576;
        int sz = 103658;
        int A0 = 526445;
        int A1 = 914373;
        int P = 518461;
        int Q = 906625;
        int R = 961401;
        assertEquals(2694148763L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case66() {
        int N = 1048576;
        int sz = 32253;
        int A0 = 441433;
        int A1 = 783509;
        int P = 222800;
        int Q = 752027;
        int R = 619605;
        assertEquals(261190755L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case67() {
        int N = 2097152;
        int sz = 78104;
        int A0 = 120758;
        int A1 = 1902757;
        int P = 424307;
        int Q = 1258590;
        int R = 1523126;
        assertEquals(1534510930L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case68() {
        int N = 2097152;
        int sz = 39356;
        int A0 = 1387182;
        int A1 = 1931867;
        int P = 919834;
        int Q = 983251;
        int R = 1930694;
        assertEquals(389943508L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case69() {
        int N = 2097152;
        int sz = 82356;
        int A0 = 105276;
        int A1 = 1931722;
        int P = 134539;
        int Q = 1008776;
        int R = 1525019;
        assertEquals(1700164757L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case70() {
        int N = 4194304;
        int sz = 17129;
        int A0 = 1154369;
        int A1 = 3414095;
        int P = 1370132;
        int Q = 4175056;
        int R = 2275954;
        assertEquals(376464L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case71() {
        int N = 4194304;
        int sz = 108928;
        int A0 = 3270148;
        int A1 = 808158;
        int P = 2706464;
        int Q = 3675345;
        int R = 3031576;
        assertEquals(2980756601L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case72() {
        int N = 4194304;
        int sz = 21798;
        int A0 = 1427623;
        int A1 = 802910;
        int P = 3177609;
        int Q = 2989884;
        int R = 702147;
        assertEquals(119402057L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case73() {
        int N = 8388608;
        int sz = 78041;
        int A0 = 1756222;
        int A1 = 8072406;
        int P = 6308638;
        int Q = 4783712;
        int R = 1312935;
        assertEquals(3588295L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case74() {
        int N = 8388608;
        int sz = 61034;
        int A0 = 3899247;
        int A1 = 6143093;
        int P = 847643;
        int Q = 6185596;
        int R = 1626886;
        assertEquals(937933666L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case75() {
        int N = 8388608;
        int sz = 129486;
        int A0 = 1585149;
        int A1 = 2481511;
        int P = 2401139;
        int Q = 7843290;
        int R = 5899221;
        assertEquals(4198006577L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case76() {
        int N = 16777216;
        int sz = 124886;
        int A0 = 12316608;
        int A1 = 15872055;
        int P = 5195334;
        int Q = 14390720;
        int R = 2831852;
        assertEquals(5743064L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case77() {
        int N = 16777216;
        int sz = 27556;
        int A0 = 13139628;
        int A1 = 13037266;
        int P = 8978890;
        int Q = 6192982;
        int R = 14009228;
        assertEquals(1210858L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case78() {
        int N = 16777216;
        int sz = 52905;
        int A0 = 12452636;
        int A1 = 10616111;
        int P = 4808965;
        int Q = 7162433;
        int R = 12113675;
        assertEquals(703696087L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case79() {
        int N = 33554432;
        int sz = 51228;
        int A0 = 5055055;
        int A1 = 24500018;
        int P = 4076553;
        int Q = 29569054;
        int R = 28870035;
        assertEquals(658916155L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case80() {
        int N = 33554432;
        int sz = 8259;
        int A0 = 7999364;
        int A1 = 21952421;
        int P = 32904880;
        int Q = 3709719;
        int R = 8937174;
        assertEquals(17128086L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case81() {
        int N = 33554432;
        int sz = 62430;
        int A0 = 29965327;
        int A1 = 4491418;
        int P = 26954306;
        int Q = 28948306;
        int R = 24419931;
        assertEquals(3057294L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case82() {
        int N = 67108864;
        int sz = 129757;
        int A0 = 2039061;
        int A1 = 20973433;
        int P = 26387614;
        int Q = 38355021;
        int R = 58184493;
        assertEquals(4215470349L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case83() {
        int N = 67108864;
        int sz = 101539;
        int A0 = 9473982;
        int A1 = 45883049;
        int P = 26428929;
        int Q = 32820034;
        int R = 16534985;
        assertEquals(2581534956L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case84() {
        int N = 67108864;
        int sz = 128867;
        int A0 = 47014651;
        int A1 = 31532420;
        int P = 47058389;
        int Q = 41892104;
        int R = 56837979;
        assertEquals(4159801255L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case85() {
        int N = 134217728;
        int sz = 87886;
        int A0 = 99795636;
        int A1 = 37567740;
        int P = 82520939;
        int Q = 103896185;
        int R = 109943942;
        assertEquals(1941095362L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case86() {
        int N = 134217728;
        int sz = 9314;
        int A0 = 78498903;
        int A1 = 96689833;
        int P = 105380346;
        int Q = 37806443;
        int R = 2026143;
        assertEquals(21967246L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case87() {
        int N = 134217728;
        int sz = 95640;
        int A0 = 128876634;
        int A1 = 12093312;
        int P = 98496221;
        int Q = 103318638;
        int R = 80736330;
        assertEquals(2296262792L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case88() {
        int N = 268435456;
        int sz = 119713;
        int A0 = 28776728;
        int A1 = 203411920;
        int P = 117087010;
        int Q = 124609890;
        int R = 259363844;
        assertEquals(6103442L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case89() {
        int N = 268435456;
        int sz = 23369;
        int A0 = 199306420;
        int A1 = 157655022;
        int P = 110393030;
        int Q = 135478538;
        int R = 106698167;
        assertEquals(1283141L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case90() {
        int N = 268435456;
        int sz = 130905;
        int A0 = 42160526;
        int A1 = 45342980;
        int P = 134117197;
        int Q = 97485514;
        int R = 145507365;
        assertEquals(4297138847L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case91() {
        int N = 536870912;
        int sz = 114480;
        int A0 = 315481588;
        int A1 = 201615006;
        int P = 106909386;
        int Q = 80153207;
        int R = 512601482;
        assertEquals(3285936560L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case92() {
        int N = 536870912;
        int sz = 46831;
        int A0 = 234509654;
        int A1 = 218390512;
        int P = 374034076;
        int Q = 114397746;
        int R = 424607778;
        assertEquals(1263847L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case93() {
        int N = 536870912;
        int sz = 95087;
        int A0 = 83516024;
        int A1 = 192928180;
        int P = 243918267;
        int Q = 96285383;
        int R = 272907717;
        assertEquals(2269374345L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case94() {
        int N = 1073741824;
        int sz = 55603;
        int A0 = 36266296;
        int A1 = 718206558;
        int P = 364153791;
        int Q = 927385200;
        int R = 1025549166;
        assertEquals(776465378L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case95() {
        int N = 1073741824;
        int sz = 75297;
        int A0 = 758394104;
        int A1 = 663511744;
        int P = 571829859;
        int Q = 956502497;
        int R = 901793550;
        assertEquals(1424836191L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case96() {
        int N = 1073741824;
        int sz = 128310;
        int A0 = 801886897;
        int A1 = 197964852;
        int P = 557346079;
        int Q = 787187461;
        int R = 767431394;
        assertEquals(4123854671L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case97() {
        int N = 1073741824;
        int sz = 131072;
        int A0 = 141249309;
        int A1 = 513499077;
        int P = 416719421;
        int Q = 828088045;
        int R = 61207686;
        assertEquals(4299378726L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case98() {
        int N = 1073741824;
        int sz = 131072;
        int A0 = 119807212;
        int A1 = 142515129;
        int P = 931390265;
        int Q = 185615422;
        int R = 252678648;
        assertEquals(4307304476L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case99() {
        int N = 1073741824;
        int sz = 131072;
        int A0 = 577928307;
        int A1 = 682156641;
        int P = 273016423;
        int Q = 309510929;
        int R = 918370446;
        assertEquals(4302246661L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case100() {
        int N = 1073741824;
        int sz = 131072;
        int A0 = 154713196;
        int A1 = 267126153;
        int P = 350909134;
        int Q = 672633457;
        int R = 73784074;
        assertEquals(4297750710L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case101() {
        int N = 1073741824;
        int sz = 131072;
        int A0 = 1065826258;
        int A1 = 544920208;
        int P = 668334123;
        int Q = 1069555354;
        int R = 533192428;
        assertEquals(4308041296L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case102() {
        int N = 1073741824;
        int sz = 131072;
        int A0 = 572887291;
        int A1 = 824841385;
        int P = 195822307;
        int Q = 502566606;
        int R = 998089151;
        assertEquals(4308727464L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case103() {
        int N = 1073741824;
        int sz = 131072;
        int A0 = 88290473;
        int A1 = 332291048;
        int P = 736408473;
        int Q = 402812554;
        int R = 336428167;
        assertEquals(4303797142L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case104() {
        int N = 1073741824;
        int sz = 131072;
        int A0 = 378354907;
        int A1 = 438109454;
        int P = 871417947;
        int Q = 843356151;
        int R = 742057538;
        assertEquals(4308466087L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case105() {
        int N = 1073741824;
        int sz = 131072;
        int A0 = 1055996694;
        int A1 = 667131450;
        int P = 272818362;
        int Q = 815699454;
        int R = 329838551;
        assertEquals(7730676L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case106() {
        int N = 1073741824;
        int sz = 131072;
        int A0 = 877240978;
        int A1 = 12966311;
        int P = 230373985;
        int Q = 83991765;
        int R = 560959061;
        assertEquals(4305215358L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case107() {
        int N = 1073741824;
        int sz = 131072;
        int A0 = 908917065;
        int A1 = 660318756;
        int P = 733464388;
        int Q = 596623620;
        int R = 10114781;
        assertEquals(3800398L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case108() {
        int N = 1073741824;
        int sz = 131072;
        int A0 = 495913967;
        int A1 = 926205879;
        int P = 664386029;
        int Q = 824862537;
        int R = 340906702;
        assertEquals(4302784285L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case109() {
        int N = 1073741824;
        int sz = 131072;
        int A0 = 699357358;
        int A1 = 616247682;
        int P = 936126865;
        int Q = 319063882;
        int R = 727409046;
        assertEquals(4307818075L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case110() {
        int N = 1073741824;
        int sz = 131072;
        int A0 = 457493799;
        int A1 = 190401742;
        int P = 188268665;
        int Q = 744363708;
        int R = 486480932;
        assertEquals(4303526778L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case111() {
        int N = 1073741824;
        int sz = 131072;
        int A0 = 447080738;
        int A1 = 892736284;
        int P = 59424212;
        int Q = 687166731;
        int R = 953061983;
        assertEquals(4302368912L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case112() {
        int N = 1073741824;
        int sz = 131072;
        int A0 = 400986268;
        int A1 = 784111720;
        int P = 464484347;
        int Q = 997792476;
        int R = 782174671;
        assertEquals(4300295192L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case113() {
        int N = 1073741824;
        int sz = 131072;
        int A0 = 195490932;
        int A1 = 641718009;
        int P = 745168924;
        int Q = 431938598;
        int R = 603991801;
        assertEquals(3800404L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case114() {
        int N = 1073741824;
        int sz = 131072;
        int A0 = 530618987;
        int A1 = 708021763;
        int P = 15296663;
        int Q = 211088964;
        int R = 647866309;
        assertEquals(4308948388L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case115() {
        int N = 1073741824;
        int sz = 131072;
        int A0 = 1043157327;
        int A1 = 34446352;
        int P = 45935033;
        int Q = 482352141;
        int R = 1061055358;
        assertEquals(4305149253L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case116() {
        int N = 1073741824;
        int sz = 131072;
        int A0 = 105541521;
        int A1 = 1028347170;
        int P = 522227221;
        int Q = 718914071;
        int R = 583474038;
        assertEquals(4302659536L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case117() {
        int N = 1073741824;
        int sz = 131070;
        int A0 = 411;
        int A1 = 415;
        int P = 398;
        int Q = 463;
        int R = 9191;
        assertEquals(4306787059L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case118() {
        int N = 1024;
        int sz = 12343;
        int A0 = 45;
        int A1 = 44;
        int P = 344;
        int Q = 987;
        int R = 354;
        assertEquals(37992737L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case119() {
        int N = 1073741824;
        int sz = 131071;
        int A0 = 1073741820;
        int A1 = 1073741821;
        int P = 1073741822;
        int Q = 1073741823;
        int R = 1073741819;
        assertEquals(4310026488L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case120() {
        int N = 1073741824;
        int sz = 100000;
        int A0 = 99999;
        int A1 = 999999999;
        int P = 999999999;
        int Q = 999999999;
        int R = 999999999;
        assertEquals(2507856950L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case121() {
        int N = 536870912;
        int sz = 130000;
        int A0 = 0;
        int A1 = 1234;
        int P = 6;
        int Q = 7;
        int R = 3456;
        assertEquals(4235601672L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case122() {
        int N = 131072;
        int sz = 130070;
        int A0 = 411;
        int A1 = 415;
        int P = 398;
        int Q = 463;
        int R = 9121;
        assertEquals(4244241556L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case123() {
        int N = 1073741824;
        int sz = 131072;
        int A0 = 114;
        int A1 = 514;
        int P = 1919;
        int Q = 810;
        int R = 5235;
        assertEquals(4308500415L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case124() {
        int N = 1073741824;
        int sz = 12332;
        int A0 = 1312;
        int A1 = 123123;
        int P = 32412;
        int Q = 123213;
        int R = 123123321;
        assertEquals(38324183L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case125() {
        int N = 1073741824;
        int sz = 100000;
        int A0 = 41;
        int A1 = 18467;
        int P = 6334;
        int Q = 26500;
        int R = 19169;
        assertEquals(5697514L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case126() {
        int N = 1073741824;
        int sz = 131072;
        int A0 = 1073741823;
        int A1 = 1073741823;
        int P = 1073741823;
        int Q = 1073741823;
        int R = 1073741823;
        assertEquals(1908859790L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case127() {
        int N = 1073741824;
        int sz = 2;
        int A0 = 536870912;
        int A1 = 0;
        int P = 1;
        int Q = 1;
        int R = 1;
        assertEquals(1L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case128() {
        int N = 1073741824;
        int sz = 131072;
        int A0 = 5646;
        int A1 = 123;
        int P = 897;
        int Q = 564;
        int R = 321;
        assertEquals(4308316187L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case129() {
        int N = 1073741824;
        int sz = 131072;
        int A0 = 1073741820;
        int A1 = 1000000000;
        int P = 111132;
        int Q = 1073741823;
        int R = 1073741823;
        assertEquals(4317984034L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case130() {
        int N = 1073741824;
        int sz = 131072;
        int A0 = 2;
        int A1 = 3;
        int P = 5;
        int Q = 7;
        int R = 11;
        assertEquals(4309347817L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

    @Test
    public void case131() {
        int N = 1073741824;
        int sz = 131072;
        int A0 = 1073741820;
        int A1 = 1073741821;
        int P = 1073741822;
        int Q = 1073741823;
        int R = 1073741819;
        assertEquals(4310137573L, xorsequence.getmax(N, sz, A0, A1, P, Q, R));
    }

}
