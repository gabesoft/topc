package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class PatrolRouteTest {
    PatrolRoute patrolroute = new PatrolRoute();

    @Test
    public void case1() {
        int X = 3;
        int Y = 3;
        int minT = 1;
        int maxT = 20000;
        assertEquals(6, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case2() {
        int X = 3;
        int Y = 3;
        int minT = 4;
        int maxT = 7;
        assertEquals(0, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case3() {
        int X = 4;
        int Y = 6;
        int minT = 9;
        int maxT = 12;
        assertEquals(264, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case4() {
        int X = 7;
        int Y = 5;
        int minT = 13;
        int maxT = 18;
        assertEquals(1212, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case5() {
        int X = 4000;
        int Y = 4000;
        int minT = 4000;
        int maxT = 14000;
        assertEquals(859690013, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case6() {
        int X = 3;
        int Y = 3;
        int minT = 8;
        int maxT = 16490;
        assertEquals(6, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case7() {
        int X = 3;
        int Y = 5;
        int minT = 10;
        int maxT = 10;
        assertEquals(24, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case8() {
        int X = 3;
        int Y = 74;
        int minT = 49;
        int maxT = 54;
        assertEquals(20688, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case9() {
        int X = 3;
        int Y = 965;
        int minT = 845;
        int maxT = 15653;
        assertEquals(534553440, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case10() {
        int X = 3;
        int Y = 2848;
        int minT = 58;
        int maxT = 413;
        assertEquals(331326708, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case11() {
        int X = 3;
        int Y = 3852;
        int minT = 2094;
        int maxT = 4759;
        assertEquals(97261732, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case12() {
        int X = 3;
        int Y = 4000;
        int minT = 138;
        int maxT = 1403;
        assertEquals(120856025, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case13() {
        int X = 3;
        int Y = 4000;
        int minT = 3192;
        int maxT = 18090;
        assertEquals(604282241, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case14() {
        int X = 3;
        int Y = 4000;
        int minT = 4126;
        int maxT = 4373;
        assertEquals(962485226, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case15() {
        int X = 3;
        int Y = 4000;
        int minT = 948;
        int maxT = 2176;
        assertEquals(130607277, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case16() {
        int X = 5;
        int Y = 3;
        int minT = 10;
        int maxT = 12;
        assertEquals(42, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case17() {
        int X = 4;
        int Y = 4;
        int minT = 8;
        int maxT = 12;
        assertEquals(96, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case18() {
        int X = 6;
        int Y = 19;
        int minT = 4;
        int maxT = 18776;
        assertEquals(116280, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case19() {
        int X = 4;
        int Y = 596;
        int minT = 4;
        int maxT = 11528;
        assertEquals(842577120, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case20() {
        int X = 7;
        int Y = 1139;
        int minT = 539;
        int maxT = 1512;
        assertEquals(709062678, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case21() {
        int X = 4;
        int Y = 3328;
        int minT = 1;
        int maxT = 16142;
        assertEquals(305292795, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case22() {
        int X = 6;
        int Y = 4000;
        int minT = 4;
        int maxT = 13687;
        assertEquals(40151047, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case23() {
        int X = 7;
        int Y = 4000;
        int minT = 3528;
        int maxT = 5968;
        assertEquals(263582038, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case24() {
        int X = 8;
        int Y = 4000;
        int minT = 3357;
        int maxT = 7339;
        assertEquals(167595594, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case25() {
        int X = 10;
        int Y = 4000;
        int minT = 3195;
        int maxT = 6204;
        assertEquals(468314247, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case26() {
        int X = 69;
        int Y = 3;
        int minT = 16;
        int maxT = 43;
        assertEquals(53214, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case27() {
        int X = 78;
        int Y = 10;
        int minT = 9;
        int maxT = 81;
        assertEquals(22615296, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case28() {
        int X = 59;
        int Y = 55;
        int minT = 202;
        int maxT = 202;
        assertEquals(5324592, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case29() {
        int X = 69;
        int Y = 764;
        int minT = 449;
        int maxT = 536;
        assertEquals(255131323, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case30() {
        int X = 49;
        int Y = 1939;
        int minT = 7;
        int maxT = 7454;
        assertEquals(47536481, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case31() {
        int X = 15;
        int Y = 3175;
        int minT = 1750;
        int maxT = 5517;
        assertEquals(355443154, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case32() {
        int X = 64;
        int Y = 4000;
        int minT = 918;
        int maxT = 3723;
        assertEquals(419556572, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case33() {
        int X = 88;
        int Y = 4000;
        int minT = 2885;
        int maxT = 6204;
        assertEquals(688183076, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case34() {
        int X = 54;
        int Y = 4000;
        int minT = 696;
        int maxT = 4511;
        assertEquals(44199280, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case35() {
        int X = 41;
        int Y = 4000;
        int minT = 3850;
        int maxT = 5823;
        assertEquals(407417253, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case36() {
        int X = 919;
        int Y = 3;
        int minT = 1349;
        int maxT = 1392;
        assertEquals(21210882, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case37() {
        int X = 662;
        int Y = 4;
        int minT = 34;
        int maxT = 492;
        assertEquals(352261560, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case38() {
        int X = 290;
        int Y = 57;
        int minT = 452;
        int maxT = 684;
        assertEquals(338550943, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case39() {
        int X = 189;
        int Y = 331;
        int minT = 154;
        int maxT = 10373;
        assertEquals(325724526, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case40() {
        int X = 826;
        int Y = 2274;
        int minT = 2648;
        int maxT = 4657;
        assertEquals(206951426, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case41() {
        int X = 550;
        int Y = 3214;
        int minT = 1431;
        int maxT = 3693;
        assertEquals(191123235, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case42() {
        int X = 792;
        int Y = 4000;
        int minT = 702;
        int maxT = 4928;
        assertEquals(536532765, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case43() {
        int X = 725;
        int Y = 4000;
        int minT = 6003;
        int maxT = 6772;
        assertEquals(679294073, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case44() {
        int X = 902;
        int Y = 4000;
        int minT = 559;
        int maxT = 2527;
        assertEquals(884141942, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case45() {
        int X = 428;
        int Y = 4000;
        int minT = 2443;
        int maxT = 4815;
        assertEquals(743555437, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case46() {
        int X = 2237;
        int Y = 3;
        int minT = 406;
        int maxT = 1233;
        assertEquals(811851535, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case47() {
        int X = 2632;
        int Y = 5;
        int minT = 2004;
        int maxT = 14285;
        assertEquals(436563411, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case48() {
        int X = 1278;
        int Y = 62;
        int minT = 504;
        int maxT = 899;
        assertEquals(858000322, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case49() {
        int X = 1734;
        int Y = 666;
        int minT = 1482;
        int maxT = 2578;
        assertEquals(959315776, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case50() {
        int X = 1050;
        int Y = 1910;
        int minT = 3645;
        int maxT = 15557;
        assertEquals(96866904, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case51() {
        int X = 1797;
        int Y = 3221;
        int minT = 1860;
        int maxT = 6896;
        assertEquals(239429453, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case52() {
        int X = 1068;
        int Y = 4000;
        int minT = 2;
        int maxT = 8140;
        assertEquals(487587099, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case53() {
        int X = 2644;
        int Y = 4000;
        int minT = 2950;
        int maxT = 16801;
        assertEquals(240109543, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case54() {
        int X = 1153;
        int Y = 4000;
        int minT = 2614;
        int maxT = 7521;
        assertEquals(567674971, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case55() {
        int X = 2672;
        int Y = 4000;
        int minT = 1;
        int maxT = 6995;
        assertEquals(558833528, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case56() {
        int X = 3179;
        int Y = 3;
        int minT = 1601;
        int maxT = 10334;
        assertEquals(47540751, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case57() {
        int X = 3722;
        int Y = 6;
        int minT = 1835;
        int maxT = 4700;
        assertEquals(630079540, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case58() {
        int X = 3097;
        int Y = 67;
        int minT = 6;
        int maxT = 16139;
        assertEquals(417332860, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case59() {
        int X = 3073;
        int Y = 896;
        int minT = 2971;
        int maxT = 5162;
        assertEquals(42264110, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case60() {
        int X = 3611;
        int Y = 1909;
        int minT = 3455;
        int maxT = 15516;
        assertEquals(265817429, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case61() {
        int X = 3684;
        int Y = 3658;
        int minT = 790;
        int maxT = 3571;
        assertEquals(642256061, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case62() {
        int X = 3912;
        int Y = 4000;
        int minT = 5511;
        int maxT = 11808;
        assertEquals(655385380, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case63() {
        int X = 3571;
        int Y = 4000;
        int minT = 5;
        int maxT = 17352;
        assertEquals(546521875, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case64() {
        int X = 3463;
        int Y = 4000;
        int minT = 9932;
        int maxT = 11412;
        assertEquals(603574675, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case65() {
        int X = 3802;
        int Y = 4000;
        int minT = 6309;
        int maxT = 16618;
        assertEquals(370713244, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case66() {
        int X = 4000;
        int Y = 3;
        int minT = 3169;
        int maxT = 6678;
        assertEquals(172914481, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case67() {
        int X = 4000;
        int Y = 7;
        int minT = 2339;
        int maxT = 3206;
        assertEquals(138485080, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case68() {
        int X = 4000;
        int Y = 90;
        int minT = 1330;
        int maxT = 7479;
        assertEquals(235469308, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case69() {
        int X = 4000;
        int Y = 153;
        int minT = 1417;
        int maxT = 7391;
        assertEquals(804113801, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case70() {
        int X = 4000;
        int Y = 2201;
        int minT = 1181;
        int maxT = 18727;
        assertEquals(838302983, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case71() {
        int X = 4000;
        int Y = 3439;
        int minT = 4704;
        int maxT = 12176;
        assertEquals(892445093, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case72() {
        int X = 4000;
        int Y = 4000;
        int minT = 154;
        int maxT = 14115;
        assertEquals(271094810, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case73() {
        int X = 4000;
        int Y = 4000;
        int minT = 7;
        int maxT = 6955;
        assertEquals(12515125, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case74() {
        int X = 4000;
        int Y = 4000;
        int minT = 3536;
        int maxT = 13883;
        assertEquals(829054842, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case75() {
        int X = 4000;
        int Y = 4000;
        int minT = 2958;
        int maxT = 11049;
        assertEquals(530782180, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case76() {
        int X = 4000;
        int Y = 3;
        int minT = 966;
        int maxT = 7406;
        assertEquals(398387820, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case77() {
        int X = 4000;
        int Y = 5;
        int minT = 4581;
        int maxT = 7565;
        assertEquals(768689693, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case78() {
        int X = 4000;
        int Y = 81;
        int minT = 7;
        int maxT = 2216;
        assertEquals(88083667, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case79() {
        int X = 4000;
        int Y = 763;
        int minT = 353;
        int maxT = 3088;
        assertEquals(609972979, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case80() {
        int X = 4000;
        int Y = 2415;
        int minT = 6498;
        int maxT = 8052;
        assertEquals(906988521, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case81() {
        int X = 4000;
        int Y = 3786;
        int minT = 1;
        int maxT = 17433;
        assertEquals(211309943, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case82() {
        int X = 4000;
        int Y = 4000;
        int minT = 4757;
        int maxT = 11014;
        assertEquals(941272513, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case83() {
        int X = 4000;
        int Y = 4000;
        int minT = 2264;
        int maxT = 6947;
        assertEquals(770259243, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case84() {
        int X = 4000;
        int Y = 4000;
        int minT = 9278;
        int maxT = 14869;
        assertEquals(18742782, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case85() {
        int X = 4000;
        int Y = 4000;
        int minT = 7615;
        int maxT = 10237;
        assertEquals(761102148, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case86() {
        int X = 4000;
        int Y = 3;
        int minT = 6925;
        int maxT = 6925;
        assertEquals(0, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case87() {
        int X = 4000;
        int Y = 7;
        int minT = 791;
        int maxT = 1684;
        assertEquals(535319677, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case88() {
        int X = 4000;
        int Y = 88;
        int minT = 1068;
        int maxT = 5291;
        assertEquals(637493061, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case89() {
        int X = 4000;
        int Y = 525;
        int minT = 4986;
        int maxT = 17078;
        assertEquals(154085517, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case90() {
        int X = 4000;
        int Y = 1039;
        int minT = 5973;
        int maxT = 6375;
        assertEquals(686890365, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case91() {
        int X = 4000;
        int Y = 3702;
        int minT = 595;
        int maxT = 2847;
        assertEquals(954799055, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case92() {
        int X = 4000;
        int Y = 4000;
        int minT = 5668;
        int maxT = 12617;
        assertEquals(934060675, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case93() {
        int X = 4000;
        int Y = 4000;
        int minT = 5351;
        int maxT = 9402;
        assertEquals(904618957, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case94() {
        int X = 4000;
        int Y = 4000;
        int minT = 3176;
        int maxT = 3942;
        assertEquals(597294897, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case95() {
        int X = 4000;
        int Y = 4000;
        int minT = 10577;
        int maxT = 18396;
        assertEquals(294461960, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case96() {
        int X = 4000;
        int Y = 3;
        int minT = 5187;
        int maxT = 19979;
        assertEquals(211944834, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case97() {
        int X = 4000;
        int Y = 7;
        int minT = 2;
        int maxT = 19417;
        assertEquals(320264334, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case98() {
        int X = 4000;
        int Y = 56;
        int minT = 2492;
        int maxT = 5314;
        assertEquals(532258081, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case99() {
        int X = 4000;
        int Y = 419;
        int minT = 4176;
        int maxT = 18328;
        assertEquals(96662287, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case100() {
        int X = 4000;
        int Y = 1126;
        int minT = 6818;
        int maxT = 6818;
        assertEquals(328603423, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case101() {
        int X = 4000;
        int Y = 3161;
        int minT = 1;
        int maxT = 15656;
        assertEquals(635094855, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case102() {
        int X = 4000;
        int Y = 4000;
        int minT = 1;
        int maxT = 16087;
        assertEquals(841484969, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case103() {
        int X = 4000;
        int Y = 4000;
        int minT = 1;
        int maxT = 15583;
        assertEquals(881384874, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case104() {
        int X = 4000;
        int Y = 4000;
        int minT = 14660;
        int maxT = 15978;
        assertEquals(306325003, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case105() {
        int X = 4000;
        int Y = 4000;
        int minT = 4408;
        int maxT = 9435;
        assertEquals(255776655, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case106() {
        int X = 4000;
        int Y = 4000;
        int minT = 1;
        int maxT = 20000;
        assertEquals(841484969, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case107() {
        int X = 4000;
        int Y = 4000;
        int minT = 1;
        int maxT = 7;
        assertEquals(0, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case108() {
        int X = 4000;
        int Y = 4000;
        int minT = 15996;
        int maxT = 15996;
        assertEquals(95904024, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case109() {
        int X = 4000;
        int Y = 4000;
        int minT = 15997;
        int maxT = 20000;
        assertEquals(0, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case110() {
        int X = 4000;
        int Y = 4000;
        int minT = 9;
        int maxT = 15995;
        assertEquals(649676921, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case111() {
        int X = 4000;
        int Y = 4000;
        int minT = 1;
        int maxT = 19998;
        assertEquals(841484969, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case112() {
        int X = 4000;
        int Y = 4000;
        int minT = 4000;
        int maxT = 20000;
        assertEquals(445258349, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case113() {
        int X = 4000;
        int Y = 4000;
        int minT = 20000;
        int maxT = 20000;
        assertEquals(0, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case114() {
        int X = 4000;
        int Y = 4000;
        int minT = 331;
        int maxT = 20000;
        assertEquals(888967583, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case115() {
        int X = 3999;
        int Y = 2999;
        int minT = 1999;
        int maxT = 19998;
        assertEquals(40906664, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case116() {
        int X = 3970;
        int Y = 3121;
        int minT = 1;
        int maxT = 14560;
        assertEquals(449660083, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case117() {
        int X = 4000;
        int Y = 4000;
        int minT = 2138;
        int maxT = 2140;
        assertEquals(100744667, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case118() {
        int X = 4000;
        int Y = 3999;
        int minT = 10000;
        int maxT = 20000;
        assertEquals(423622390, patrolroute.countRoutes(X, Y, minT, maxT));
    }

    @Test
    public void case119() {
        int X = 3795;
        int Y = 3997;
        int minT = 3;
        int maxT = 19997;
        assertEquals(124289875, patrolroute.countRoutes(X, Y, minT, maxT));
    }

}
