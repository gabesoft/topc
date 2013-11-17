package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class StarportTest {
    double DELTA = 1.0e-09;
    Starport starport = new Starport();

    @Test
    public void case1() {
        int N = 4;
        int M = 2;
        assertEquals(1.0, starport.getExpectedTime(N, M), DELTA * 1.0);
    }

    @Test
    public void case2() {
        int N = 5;
        int M = 3;
        assertEquals(2.0, starport.getExpectedTime(N, M), DELTA * 2.0);
    }

    @Test
    public void case3() {
        int N = 6;
        int M = 1;
        assertEquals(2.5, starport.getExpectedTime(N, M), DELTA * 2.5);
    }

    @Test
    public void case4() {
        int N = 12345;
        int M = 2345;
        assertEquals(6170.0, starport.getExpectedTime(N, M), DELTA * 6170.0);
    }

    @Test
    public void case5() {
        int N = 1;
        int M = 1000000000;
        assertEquals(0.0, starport.getExpectedTime(N, M), DELTA);
    }

    @Test
    public void case6() {
        int N = 1000000000;
        int M = 1;
        assertEquals(499999999.5, starport.getExpectedTime(N, M), DELTA * 499999999.5);
    }

    @Test
    public void case7() {
        int N = 1000000000;
        int M = 1000000000;
        assertEquals(0.0, starport.getExpectedTime(N, M), DELTA);
    }

    @Test
    public void case8() {
        int N = 1000000000;
        int M = 999999999;
        assertEquals(499999999.5, starport.getExpectedTime(N, M), DELTA * 499999999.5);
    }

    @Test
    public void case9() {
        int N = 999999999;
        int M = 1000000000;
        assertEquals(499999999.0, starport.getExpectedTime(N, M), DELTA * 499999999.0);
    }

    @Test
    public void case10() {
        int N = 12;
        int M = 5;
        assertEquals(5.5, starport.getExpectedTime(N, M), DELTA * 5.5);
    }

    @Test
    public void case11() {
        int N = 14;
        int M = 12;
        assertEquals(6.0, starport.getExpectedTime(N, M), DELTA * 6.0);
    }

    @Test
    public void case12() {
        int N = 6;
        int M = 7;
        assertEquals(2.5, starport.getExpectedTime(N, M), DELTA * 2.5);
    }

    @Test
    public void case13() {
        int N = 9;
        int M = 13;
        assertEquals(4.0, starport.getExpectedTime(N, M), DELTA * 4.0);
    }

    @Test
    public void case14() {
        int N = 14;
        int M = 10;
        assertEquals(6.0, starport.getExpectedTime(N, M), DELTA * 6.0);
    }

    @Test
    public void case15() {
        int N = 2;
        int M = 14;
        assertEquals(0.0, starport.getExpectedTime(N, M), DELTA);
    }

    @Test
    public void case16() {
        int N = 11;
        int M = 1;
        assertEquals(5.0, starport.getExpectedTime(N, M), DELTA * 5.0);
    }

    @Test
    public void case17() {
        int N = 9;
        int M = 10;
        assertEquals(4.0, starport.getExpectedTime(N, M), DELTA * 4.0);
    }

    @Test
    public void case18() {
        int N = 4;
        int M = 13;
        assertEquals(1.5, starport.getExpectedTime(N, M), DELTA * 1.5);
    }

    @Test
    public void case19() {
        int N = 11;
        int M = 9;
        assertEquals(5.0, starport.getExpectedTime(N, M), DELTA * 5.0);
    }

    @Test
    public void case20() {
        int N = 1;
        int M = 47;
        assertEquals(0.0, starport.getExpectedTime(N, M), DELTA);
    }

    @Test
    public void case21() {
        int N = 1;
        int M = 53;
        assertEquals(0.0, starport.getExpectedTime(N, M), DELTA);
    }

    @Test
    public void case22() {
        int N = 1;
        int M = 73;
        assertEquals(0.0, starport.getExpectedTime(N, M), DELTA);
    }

    @Test
    public void case23() {
        int N = 1;
        int M = 27;
        assertEquals(0.0, starport.getExpectedTime(N, M), DELTA);
    }

    @Test
    public void case24() {
        int N = 96;
        int M = 1;
        assertEquals(47.5, starport.getExpectedTime(N, M), DELTA * 47.5);
    }

    @Test
    public void case25() {
        int N = 7046131;
        int M = 1;
        assertEquals(3523065.0, starport.getExpectedTime(N, M), DELTA * 3523065.0);
    }

    @Test
    public void case26() {
        int N = 8821408;
        int M = 1;
        assertEquals(4410703.5, starport.getExpectedTime(N, M), DELTA * 4410703.5);
    }

    @Test
    public void case27() {
        int N = 1;
        int M = 3862670;
        assertEquals(0.0, starport.getExpectedTime(N, M), DELTA);
    }

    @Test
    public void case28() {
        int N = 1;
        int M = 7357215;
        assertEquals(0.0, starport.getExpectedTime(N, M), DELTA);
    }

    @Test
    public void case29() {
        int N = 1184139;
        int M = 1;
        assertEquals(592069.0, starport.getExpectedTime(N, M), DELTA * 592069.0);
    }

    @Test
    public void case30() {
        int N = 100000000;
        int M = 1000000;
        assertEquals(49500000.0, starport.getExpectedTime(N, M), DELTA * 49500000.0);
    }

    @Test
    public void case31() {
        int N = 1;
        int M = 1;
        assertEquals(0.0, starport.getExpectedTime(N, M), DELTA);
    }

    @Test
    public void case32() {
        int N = 7;
        int M = 7;
        assertEquals(0.0, starport.getExpectedTime(N, M), DELTA);
    }

    @Test
    public void case33() {
        int N = 536870912;
        int M = 536870912;
        assertEquals(0.0, starport.getExpectedTime(N, M), DELTA);
    }

    @Test
    public void case34() {
        int N = 701408733;
        int M = 433494437;
        assertEquals(350704366.0, starport.getExpectedTime(N, M), DELTA * 350704366.0);
    }

    @Test
    public void case35() {
        int N = 700776761;
        int M = 150563401;
        assertEquals(350388380.0, starport.getExpectedTime(N, M), DELTA * 350388380.0);
    }

    @Test
    public void case36() {
        int N = 289801000;
        int M = 462555205;
        assertEquals(144900497.5, starport.getExpectedTime(N, M), DELTA * 144900497.5);
    }

    @Test
    public void case37() {
        int N = 610548375;
        int M = 828728634;
        assertEquals(305274186.0, starport.getExpectedTime(N, M), DELTA * 305274186.0);
    }

    @Test
    public void case38() {
        int N = 843858085;
        int M = 587573580;
        assertEquals(421929040.0, starport.getExpectedTime(N, M), DELTA * 421929040.0);
    }

    @Test
    public void case39() {
        int N = 926721076;
        int M = 318260246;
        assertEquals(463360537.0, starport.getExpectedTime(N, M), DELTA * 463360537.0);
    }

    @Test
    public void case40() {
        int N = 396643072;
        int M = 561141801;
        assertEquals(198321535.5, starport.getExpectedTime(N, M), DELTA * 198321535.5);
    }

    @Test
    public void case41() {
        int N = 875126809;
        int M = 783703811;
        assertEquals(437563404.0, starport.getExpectedTime(N, M), DELTA * 437563404.0);
    }

    @Test
    public void case42() {
        int N = 426219907;
        int M = 965110942;
        assertEquals(213109953.0, starport.getExpectedTime(N, M), DELTA * 213109953.0);
    }

    @Test
    public void case43() {
        int N = 349927638;
        int M = 580671298;
        assertEquals(174963818.0, starport.getExpectedTime(N, M), DELTA * 174963818.0);
    }

    @Test
    public void case44() {
        int N = 886918310;
        int M = 641958573;
        assertEquals(443459154.5, starport.getExpectedTime(N, M), DELTA * 443459154.5);
    }

    @Test
    public void case45() {
        int N = 253770905;
        int M = 631600262;
        assertEquals(126885452.0, starport.getExpectedTime(N, M), DELTA * 126885452.0);
    }

    @Test
    public void case46() {
        int N = 360396889;
        int M = 298547569;
        assertEquals(180198444.0, starport.getExpectedTime(N, M), DELTA * 180198444.0);
    }

    @Test
    public void case47() {
        int N = 770993956;
        int M = 505252854;
        assertEquals(385496977.0, starport.getExpectedTime(N, M), DELTA * 385496977.0);
    }

    @Test
    public void case48() {
        int N = 69946468;
        int M = 528890679;
        assertEquals(34973233.5, starport.getExpectedTime(N, M), DELTA * 34973233.5);
    }

    @Test
    public void case49() {
        int N = 260001211;
        int M = 384396188;
        assertEquals(130000605.0, starport.getExpectedTime(N, M), DELTA * 130000605.0);
    }

    @Test
    public void case50() {
        int N = 728057387;
        int M = 466304827;
        assertEquals(364028693.0, starport.getExpectedTime(N, M), DELTA * 364028693.0);
    }

    @Test
    public void case51() {
        int N = 585210999;
        int M = 86736168;
        assertEquals(292605498.0, starport.getExpectedTime(N, M), DELTA * 292605498.0);
    }

    @Test
    public void case52() {
        int N = 319828794;
        int M = 744254367;
        assertEquals(159914395.5, starport.getExpectedTime(N, M), DELTA * 159914395.5);
    }

    @Test
    public void case53() {
        int N = 688734193;
        int M = 436415944;
        assertEquals(344367096.0, starport.getExpectedTime(N, M), DELTA * 344367096.0);
    }

    @Test
    public void case54() {
        int N = 146682056;
        int M = 684418574;
        assertEquals(73341027.0, starport.getExpectedTime(N, M), DELTA * 73341027.0);
    }

    @Test
    public void case55() {
        int N = 650381000;
        int M = 45693000;
        assertEquals(325190000.0, starport.getExpectedTime(N, M), DELTA * 325190000.0);
    }

    @Test
    public void case56() {
        int N = 355279000;
        int M = 928984000;
        assertEquals(177639000.0, starport.getExpectedTime(N, M), DELTA * 177639000.0);
    }

    @Test
    public void case57() {
        int N = 668342000;
        int M = 279221000;
        assertEquals(334170500.0, starport.getExpectedTime(N, M), DELTA * 334170500.0);
    }

    @Test
    public void case58() {
        int N = 403710000;
        int M = 360056000;
        assertEquals(201854000.0, starport.getExpectedTime(N, M), DELTA * 201854000.0);
    }

    @Test
    public void case59() {
        int N = 667949000;
        int M = 969780000;
        assertEquals(333974000.0, starport.getExpectedTime(N, M), DELTA * 333974000.0);
    }

    @Test
    public void case60() {
        int N = 438041727;
        int M = 711722994;
        assertEquals(219018012.0, starport.getExpectedTime(N, M), DELTA * 219018012.0);
    }

    @Test
    public void case61() {
        int N = 511292960;
        int M = 966272597;
        assertEquals(255645529.5, starport.getExpectedTime(N, M), DELTA * 255645529.5);
    }

    @Test
    public void case62() {
        int N = 574755944;
        int M = 679156963;
        assertEquals(287377021.5, starport.getExpectedTime(N, M), DELTA * 287377021.5);
    }

    @Test
    public void case63() {
        int N = 508042250;
        int M = 985006952;
        assertEquals(254019224.0, starport.getExpectedTime(N, M), DELTA * 254019224.0);
    }

    @Test
    public void case64() {
        int N = 271422879;
        int M = 834149295;
        assertEquals(135691479.0, starport.getExpectedTime(N, M), DELTA * 135691479.0);
    }

    @Test
    public void case65() {
        int N = 194478570;
        int M = 491301045;
        assertEquals(97234627.5, starport.getExpectedTime(N, M), DELTA * 97234627.5);
    }

    @Test
    public void case66() {
        int N = 873930195;
        int M = 953921205;
        assertEquals(436963545.0, starport.getExpectedTime(N, M), DELTA * 436963545.0);
    }

    @Test
    public void case67() {
        int N = 195615;
        int M = 373469400;
        assertEquals(96255.0, starport.getExpectedTime(N, M), DELTA * 96255.0);
    }

    @Test
    public void case68() {
        int N = 450762165;
        int M = 177211665;
        assertEquals(225379530.0, starport.getExpectedTime(N, M), DELTA * 225379530.0);
    }

    @Test
    public void case69() {
        int N = 269063775;
        int M = 572493690;
        assertEquals(134530335.0, starport.getExpectedTime(N, M), DELTA * 134530335.0);
    }

    @Test
    public void case70() {
        int N = 845619711;
        int M = 63577962;
        assertEquals(422809794.0, starport.getExpectedTime(N, M), DELTA * 422809794.0);
    }

    @Test
    public void case71() {
        int N = 353871615;
        int M = 147598647;
        assertEquals(176935746.0, starport.getExpectedTime(N, M), DELTA * 176935746.0);
    }

    @Test
    public void case72() {
        int N = 70467315;
        int M = 122463105;
        assertEquals(35233350.0, starport.getExpectedTime(N, M), DELTA * 35233350.0);
    }

    @Test
    public void case73() {
        int N = 868656627;
        int M = 827791230;
        assertEquals(434328252.0, starport.getExpectedTime(N, M), DELTA * 434328252.0);
    }

    @Test
    public void case74() {
        int N = 899418435;
        int M = 996159288;
        assertEquals(449709156.0, starport.getExpectedTime(N, M), DELTA * 449709156.0);
    }

    @Test
    public void case75() {
        int N = 665431613;
        int M = 17283938;
        assertEquals(328394822.0, starport.getExpectedTime(N, M), DELTA * 328394822.0);
    }

    @Test
    public void case76() {
        int N = 303703482;
        int M = 751851303;
        assertEquals(149999890.5, starport.getExpectedTime(N, M), DELTA * 149999890.5);
    }

    @Test
    public void case77() {
        int N = 30864175;
        int M = 713579726;
        assertEquals(14814804.0, starport.getExpectedTime(N, M), DELTA * 14814804.0);
    }

    @Test
    public void case78() {
        int N = 641974840;
        int M = 990122734;
        assertEquals(319752853.0, starport.getExpectedTime(N, M), DELTA * 319752853.0);
    }

    @Test
    public void case79() {
        int N = 724690829;
        int M = 240740565;
        assertEquals(361728131.0, starport.getExpectedTime(N, M), DELTA * 361728131.0);
    }

    @Test
    public void case80() {
        int N = 545169920;
        int M = 894600640;
        assertEquals(271860000.0, starport.getExpectedTime(N, M), DELTA * 271860000.0);
    }

    @Test
    public void case81() {
        int N = 142390130;
        int M = 144146365;
        assertEquals(71127517.5, starport.getExpectedTime(N, M), DELTA * 71127517.5);
    }

    @Test
    public void case82() {
        int N = 542524311;
        int M = 745550757;
        assertEquals(270926019.0, starport.getExpectedTime(N, M), DELTA * 270926019.0);
    }

    @Test
    public void case83() {
        int N = 654774512;
        int M = 520522184;
        assertEquals(326209604.0, starport.getExpectedTime(N, M), DELTA * 326209604.0);
    }

    @Test
    public void case84() {
        int N = 816773670;
        int M = 142995060;
        assertEquals(408334950.0, starport.getExpectedTime(N, M), DELTA * 408334950.0);
    }

    @Test
    public void case85() {
        int N = 721123123;
        int M = 534535343;
        assertEquals(360561561.0, starport.getExpectedTime(N, M), DELTA * 360561561.0);
    }

    @Test
    public void case86() {
        int N = 20996011;
        int M = 3;
        assertEquals(10498005.0, starport.getExpectedTime(N, M), DELTA * 10498005.0);
    }

    @Test
    public void case87() {
        int N = 3;
        int M = 5;
        assertEquals(1.0, starport.getExpectedTime(N, M), DELTA * 1.0);
    }

    @Test
    public void case88() {
        int N = 997007078;
        int M = 997007079;
        assertEquals(498503538.5, starport.getExpectedTime(N, M), DELTA * 498503538.5);
    }

    @Test
    public void case89() {
        int N = 1000000000;
        int M = 3;
        assertEquals(499999999.5, starport.getExpectedTime(N, M), DELTA * 499999999.5);
    }

    @Test
    public void case90() {
        int N = 999999937;
        int M = 999999929;
        assertEquals(499999968.0, starport.getExpectedTime(N, M), DELTA * 499999968.0);
    }

    @Test
    public void case91() {
        int N = 999999929;
        int M = 999999937;
        assertEquals(499999964.0, starport.getExpectedTime(N, M), DELTA * 499999964.0);
    }

    @Test
    public void case92() {
        int N = 1000000000;
        int M = 999999929;
        assertEquals(499999999.5, starport.getExpectedTime(N, M), DELTA * 499999999.5);
    }

    @Test
    public void case93() {
        int N = 100000009;
        int M = 100000007;
        assertEquals(50000004.0, starport.getExpectedTime(N, M), DELTA * 50000004.0);
    }

    @Test
    public void case94() {
        int N = 999999999;
        int M = 999999998;
        assertEquals(499999999.0, starport.getExpectedTime(N, M), DELTA * 499999999.0);
    }

    @Test
    public void case95() {
        int N = 646119602;
        int M = 178503576;
        assertEquals(323059800.0, starport.getExpectedTime(N, M), DELTA * 323059800.0);
    }

    @Test
    public void case96() {
        int N = 999999998;
        int M = 999999999;
        assertEquals(499999998.5, starport.getExpectedTime(N, M), DELTA * 499999998.5);
    }

    @Test
    public void case97() {
        int N = 999999993;
        int M = 999999997;
        assertEquals(499999996.0, starport.getExpectedTime(N, M), DELTA * 499999996.0);
    }

    @Test
    public void case98() {
        int N = 999999997;
        int M = 1;
        assertEquals(499999998.0, starport.getExpectedTime(N, M), DELTA * 499999998.0);
    }

    @Test
    public void case99() {
        int N = 9875475;
        int M = 9854753;
        assertEquals(4937737.0, starport.getExpectedTime(N, M), DELTA * 4937737.0);
    }

    @Test
    public void case100() {
        int N = 982451653;
        int M = 982451707;
        assertEquals(491225826.0, starport.getExpectedTime(N, M), DELTA * 491225826.0);
    }

    @Test
    public void case101() {
        int N = 100000000;
        int M = 1210985;
        assertEquals(49999997.5, starport.getExpectedTime(N, M), DELTA * 49999997.5);
    }

    @Test
    public void case102() {
        int N = 100000007;
        int M = 100000009;
        assertEquals(50000003.0, starport.getExpectedTime(N, M), DELTA * 50000003.0);
    }

    @Test
    public void case103() {
        int N = 100000007;
        int M = 1000000000;
        assertEquals(50000003.0, starport.getExpectedTime(N, M), DELTA * 50000003.0);
    }

    @Test
    public void case104() {
        int N = 6;
        int M = 8;
        assertEquals(2.0, starport.getExpectedTime(N, M), DELTA * 2.0);
    }

    @Test
    public void case105() {
        int N = 856712345;
        int M = 6;
        assertEquals(428356172.0, starport.getExpectedTime(N, M), DELTA * 428356172.0);
    }

    @Test
    public void case106() {
        int N = 99999989;
        int M = 13;
        assertEquals(49999994.0, starport.getExpectedTime(N, M), DELTA * 49999994.0);
    }

    @Test
    public void case107() {
        int N = 99999989;
        int M = 94418953;
        assertEquals(49999994.0, starport.getExpectedTime(N, M), DELTA * 49999994.0);
    }

    @Test
    public void case108() {
        int N = 1000000000;
        int M = 1000007;
        assertEquals(499999999.5, starport.getExpectedTime(N, M), DELTA * 499999999.5);
    }

    @Test
    public void case109() {
        int N = 982451653;
        int M = 15485863;
        assertEquals(491225826.0, starport.getExpectedTime(N, M), DELTA * 491225826.0);
    }

    @Test
    public void case110() {
        int N = 536870912;
        int M = 199999994;
        assertEquals(268435455.0, starport.getExpectedTime(N, M), DELTA * 268435455.0);
    }

    @Test
    public void case111() {
        int N = 999617293;
        int M = 999617279;
        assertEquals(499808646.0, starport.getExpectedTime(N, M), DELTA * 499808646.0);
    }

    @Test
    public void case112() {
        int N = 37637323;
        int M = 524287;
        assertEquals(18818661.0, starport.getExpectedTime(N, M), DELTA * 18818661.0);
    }

    @Test
    public void case113() {
        int N = 999999997;
        int M = 1000000000;
        assertEquals(499999998.0, starport.getExpectedTime(N, M), DELTA * 499999998.0);
    }

    @Test
    public void case114() {
        int N = 100000000;
        int M = 99999999;
        assertEquals(49999999.5, starport.getExpectedTime(N, M), DELTA * 49999999.5);
    }

    @Test
    public void case115() {
        int N = 987989982;
        int M = 7345284;
        assertEquals(493994988.0, starport.getExpectedTime(N, M), DELTA * 493994988.0);
    }

    @Test
    public void case116() {
        int N = 1000000000;
        int M = 999999997;
        assertEquals(499999999.5, starport.getExpectedTime(N, M), DELTA * 499999999.5);
    }

    @Test
    public void case117() {
        int N = 866988874;
        int M = 100712442;
        assertEquals(433494436.0, starport.getExpectedTime(N, M), DELTA * 433494436.0);
    }

    @Test
    public void case118() {
        int N = 999999893;
        int M = 999999937;
        assertEquals(499999946.0, starport.getExpectedTime(N, M), DELTA * 499999946.0);
    }

    @Test
    public void case119() {
        int N = 999888733;
        int M = 1000000000;
        assertEquals(499944366.0, starport.getExpectedTime(N, M), DELTA * 499944366.0);
    }

    @Test
    public void case120() {
        int N = 999999999;
        int M = 889329422;
        assertEquals(499999999.0, starport.getExpectedTime(N, M), DELTA * 499999999.0);
    }

    @Test
    public void case121() {
        int N = 100000000;
        int M = 1;
        assertEquals(49999999.5, starport.getExpectedTime(N, M), DELTA * 49999999.5);
    }

    @Test
    public void case122() {
        int N = 999999992;
        int M = 999999993;
        assertEquals(499999995.5, starport.getExpectedTime(N, M), DELTA * 499999995.5);
    }

    @Test
    public void case123() {
        int N = 999999998;
        int M = 999999996;
        assertEquals(499999998.0, starport.getExpectedTime(N, M), DELTA * 499999998.0);
    }

    @Test
    public void case124() {
        int N = 20996011;
        int M = 24036583;
        assertEquals(10498005.0, starport.getExpectedTime(N, M), DELTA * 10498005.0);
    }

    @Test
    public void case125() {
        int N = 311;
        int M = 1000000000;
        assertEquals(155.0, starport.getExpectedTime(N, M), DELTA * 155.0);
    }

    @Test
    public void case126() {
        int N = 100000001;
        int M = 3;
        assertEquals(50000000.0, starport.getExpectedTime(N, M), DELTA * 50000000.0);
    }

    @Test
    public void case127() {
        int N = 1000000000;
        int M = 4456332;
        assertEquals(499999998.0, starport.getExpectedTime(N, M), DELTA * 499999998.0);
    }

    @Test
    public void case128() {
        int N = 999999997;
        int M = 999999991;
        assertEquals(499999998.0, starport.getExpectedTime(N, M), DELTA * 499999998.0);
    }

    @Test
    public void case129() {
        int N = 999999995;
        int M = 999999997;
        assertEquals(499999997.0, starport.getExpectedTime(N, M), DELTA * 499999997.0);
    }

    @Test
    public void case130() {
        int N = 999999937;
        int M = 800000011;
        assertEquals(499999968.0, starport.getExpectedTime(N, M), DELTA * 499999968.0);
    }

    @Test
    public void case131() {
        int N = 1;
        int M = 999999999;
        assertEquals(0.0, starport.getExpectedTime(N, M), DELTA);
    }

    @Test
    public void case132() {
        int N = 433434;
        int M = 3232233;
        assertEquals(216715.5, starport.getExpectedTime(N, M), DELTA * 216715.5);
    }

    @Test
    public void case133() {
        int N = 1000000000;
        int M = 999999991;
        assertEquals(499999999.5, starport.getExpectedTime(N, M), DELTA * 499999999.5);
    }

    @Test
    public void case134() {
        int N = 1000000000;
        int M = 2345;
        assertEquals(499999997.5, starport.getExpectedTime(N, M), DELTA * 499999997.5);
    }

    @Test
    public void case135() {
        int N = 100000000;
        int M = 999999999;
        assertEquals(49999999.5, starport.getExpectedTime(N, M), DELTA * 49999999.5);
    }

    @Test
    public void case136() {
        int N = 999000011;
        int M = 999000029;
        assertEquals(499500005.0, starport.getExpectedTime(N, M), DELTA * 499500005.0);
    }

    @Test
    public void case137() {
        int N = 10000000;
        int M = 9999999;
        assertEquals(4999999.5, starport.getExpectedTime(N, M), DELTA * 4999999.5);
    }

    @Test
    public void case138() {
        int N = 125467865;
        int M = 875556644;
        assertEquals(62733932.0, starport.getExpectedTime(N, M), DELTA * 62733932.0);
    }

    @Test
    public void case139() {
        int N = 65536;
        int M = 65536;
        assertEquals(0.0, starport.getExpectedTime(N, M), DELTA);
    }

    @Test
    public void case140() {
        int N = 3;
        int M = 4;
        assertEquals(1.0, starport.getExpectedTime(N, M), DELTA * 1.0);
    }

    @Test
    public void case141() {
        int N = 100000000;
        int M = 9999999;
        assertEquals(49999999.5, starport.getExpectedTime(N, M), DELTA * 49999999.5);
    }

    @Test
    public void case142() {
        int N = 999999997;
        int M = 999999998;
        assertEquals(499999998.0, starport.getExpectedTime(N, M), DELTA * 499999998.0);
    }

    @Test
    public void case143() {
        int N = 99999999;
        int M = 123;
        assertEquals(49999998.0, starport.getExpectedTime(N, M), DELTA * 49999998.0);
    }

    @Test
    public void case144() {
        int N = 999999999;
        int M = 777777778;
        assertEquals(499999999.0, starport.getExpectedTime(N, M), DELTA * 499999999.0);
    }

    @Test
    public void case145() {
        int N = 536870912;
        int M = 387420489;
        assertEquals(268435455.5, starport.getExpectedTime(N, M), DELTA * 268435455.5);
    }

    @Test
    public void case146() {
        int N = 1233432;
        int M = 3242345;
        assertEquals(616715.5, starport.getExpectedTime(N, M), DELTA * 616715.5);
    }

    @Test
    public void case147() {
        int N = 3;
        int M = 7;
        assertEquals(1.0, starport.getExpectedTime(N, M), DELTA * 1.0);
    }

    @Test
    public void case148() {
        int N = 21474836;
        int M = 123123213;
        assertEquals(10737417.5, starport.getExpectedTime(N, M), DELTA * 10737417.5);
    }

    @Test
    public void case149() {
        int N = 900000009;
        int M = 12242;
        assertEquals(450000004.0, starport.getExpectedTime(N, M), DELTA * 450000004.0);
    }

    @Test
    public void case150() {
        int N = 1000000000;
        int M = 499999999;
        assertEquals(499999999.5, starport.getExpectedTime(N, M), DELTA * 499999999.5);
    }

    @Test
    public void case151() {
        int N = 999999999;
        int M = 999999997;
        assertEquals(499999999.0, starport.getExpectedTime(N, M), DELTA * 499999999.0);
    }

    @Test
    public void case152() {
        int N = 500000041;
        int M = 500000003;
        assertEquals(250000020.0, starport.getExpectedTime(N, M), DELTA * 250000020.0);
    }

    @Test
    public void case153() {
        int N = 999999999;
        int M = 1;
        assertEquals(499999999.0, starport.getExpectedTime(N, M), DELTA * 499999999.0);
    }

    @Test
    public void case154() {
        int N = 999992999;
        int M = 992999999;
        assertEquals(499996499.0, starport.getExpectedTime(N, M), DELTA * 499996499.0);
    }

    @Test
    public void case155() {
        int N = 999999996;
        int M = 999999997;
        assertEquals(499999997.5, starport.getExpectedTime(N, M), DELTA * 499999997.5);
    }

    @Test
    public void case156() {
        int N = 999999991;
        int M = 999999989;
        assertEquals(499999995.0, starport.getExpectedTime(N, M), DELTA * 499999995.0);
    }

    @Test
    public void case157() {
        int N = 999999999;
        int M = 99999999;
        assertEquals(499999995.0, starport.getExpectedTime(N, M), DELTA * 499999995.0);
    }

    @Test
    public void case158() {
        int N = 500000000;
        int M = 7;
        assertEquals(249999999.5, starport.getExpectedTime(N, M), DELTA * 249999999.5);
    }

    @Test
    public void case159() {
        int N = 1000000000;
        int M = 999999998;
        assertEquals(499999999.0, starport.getExpectedTime(N, M), DELTA * 499999999.0);
    }

    @Test
    public void case160() {
        int N = 2;
        int M = 4;
        assertEquals(0.0, starport.getExpectedTime(N, M), DELTA);
    }

    @Test
    public void case161() {
        int N = 999999937;
        int M = 999999893;
        assertEquals(499999968.0, starport.getExpectedTime(N, M), DELTA * 499999968.0);
    }

    @Test
    public void case162() {
        int N = 999999151;
        int M = 1000000000;
        assertEquals(499999575.0, starport.getExpectedTime(N, M), DELTA * 499999575.0);
    }

    @Test
    public void case163() {
        int N = 10000007;
        int M = 100000007;
        assertEquals(5000003.0, starport.getExpectedTime(N, M), DELTA * 5000003.0);
    }

    @Test
    public void case164() {
        int N = 19587619;
        int M = 19587671;
        assertEquals(9793809.0, starport.getExpectedTime(N, M), DELTA * 9793809.0);
    }

    @Test
    public void case165() {
        int N = 999100211;
        int M = 999100213;
        assertEquals(499550105.0, starport.getExpectedTime(N, M), DELTA * 499550105.0);
    }

    @Test
    public void case166() {
        int N = 200000000;
        int M = 300000000;
        assertEquals(50000000.0, starport.getExpectedTime(N, M), DELTA * 50000000.0);
    }

    @Test
    public void case167() {
        int N = 10000000;
        int M = 10000001;
        assertEquals(4999999.5, starport.getExpectedTime(N, M), DELTA * 4999999.5);
    }

    @Test
    public void case168() {
        int N = 12;
        int M = 8;
        assertEquals(4.0, starport.getExpectedTime(N, M), DELTA * 4.0);
    }

    @Test
    public void case169() {
        int N = 7;
        int M = 13;
        assertEquals(3.0, starport.getExpectedTime(N, M), DELTA * 3.0);
    }

    @Test
    public void case170() {
        int N = 999999997;
        int M = 887657890;
        assertEquals(499999998.0, starport.getExpectedTime(N, M), DELTA * 499999998.0);
    }

    @Test
    public void case171() {
        int N = 999999997;
        int M = 999999993;
        assertEquals(499999998.0, starport.getExpectedTime(N, M), DELTA * 499999998.0);
    }

    @Test
    public void case172() {
        int N = 999999999;
        int M = 979593913;
        assertEquals(499999999.0, starport.getExpectedTime(N, M), DELTA * 499999999.0);
    }

    @Test
    public void case173() {
        int N = 999999937;
        int M = 99999989;
        assertEquals(499999968.0, starport.getExpectedTime(N, M), DELTA * 499999968.0);
    }

    @Test
    public void case174() {
        int N = 1000000000;
        int M = 9;
        assertEquals(499999999.5, starport.getExpectedTime(N, M), DELTA * 499999999.5);
    }

    @Test
    public void case175() {
        int N = 500000000;
        int M = 1000000000;
        assertEquals(0.0, starport.getExpectedTime(N, M), DELTA);
    }

    @Test
    public void case176() {
        int N = 987654321;
        int M = 1000000000;
        assertEquals(493827160.0, starport.getExpectedTime(N, M), DELTA * 493827160.0);
    }

    @Test
    public void case177() {
        int N = 104729;
        int M = 104723;
        assertEquals(52364.0, starport.getExpectedTime(N, M), DELTA * 52364.0);
    }

    @Test
    public void case178() {
        int N = 9999999;
        int M = 1000000000;
        assertEquals(4999999.0, starport.getExpectedTime(N, M), DELTA * 4999999.0);
    }

    @Test
    public void case179() {
        int N = 99999999;
        int M = 99999998;
        assertEquals(49999999.0, starport.getExpectedTime(N, M), DELTA * 49999999.0);
    }

    @Test
    public void case180() {
        int N = 99999999;
        int M = 1000000000;
        assertEquals(49999999.0, starport.getExpectedTime(N, M), DELTA * 49999999.0);
    }

    @Test
    public void case181() {
        int N = 1000000000;
        int M = 999999971;
        assertEquals(499999999.5, starport.getExpectedTime(N, M), DELTA * 499999999.5);
    }

    @Test
    public void case182() {
        int N = 99999997;
        int M = 1000000000;
        assertEquals(49999998.0, starport.getExpectedTime(N, M), DELTA * 49999998.0);
    }

    @Test
    public void case183() {
        int N = 999009019;
        int M = 999008537;
        assertEquals(499504509.0, starport.getExpectedTime(N, M), DELTA * 499504509.0);
    }

    @Test
    public void case184() {
        int N = 536870911;
        int M = 536870913;
        assertEquals(268435455.0, starport.getExpectedTime(N, M), DELTA * 268435455.0);
    }

    @Test
    public void case185() {
        int N = 100613;
        int M = 100621;
        assertEquals(50306.0, starport.getExpectedTime(N, M), DELTA * 50306.0);
    }

    @Test
    public void case186() {
        int N = 1000000000;
        int M = 99999999;
        assertEquals(499999999.5, starport.getExpectedTime(N, M), DELTA * 499999999.5);
    }

    @Test
    public void case187() {
        int N = 999999997;
        int M = 2;
        assertEquals(499999998.0, starport.getExpectedTime(N, M), DELTA * 499999998.0);
    }

    @Test
    public void case188() {
        int N = 1;
        int M = 999999997;
        assertEquals(0.0, starport.getExpectedTime(N, M), DELTA);
    }

    @Test
    public void case189() {
        int N = 1000000000;
        int M = 999999937;
        assertEquals(499999999.5, starport.getExpectedTime(N, M), DELTA * 499999999.5);
    }

    @Test
    public void case190() {
        int N = 2345;
        int M = 1000000000;
        assertEquals(1170.0, starport.getExpectedTime(N, M), DELTA * 1170.0);
    }

    @Test
    public void case191() {
        int N = 99998888;
        int M = 7778888;
        assertEquals(49999440.0, starport.getExpectedTime(N, M), DELTA * 49999440.0);
    }

    @Test
    public void case192() {
        int N = 4;
        int M = 6;
        assertEquals(1.0, starport.getExpectedTime(N, M), DELTA * 1.0);
    }

    @Test
    public void case193() {
        int N = 100000000;
        int M = 99999990;
        assertEquals(49999995.0, starport.getExpectedTime(N, M), DELTA * 49999995.0);
    }

    @Test
    public void case194() {
        int N = 999999999;
        int M = 2;
        assertEquals(499999999.0, starport.getExpectedTime(N, M), DELTA * 499999999.0);
    }

    @Test
    public void case195() {
        int N = 999999992;
        int M = 999999997;
        assertEquals(499999995.5, starport.getExpectedTime(N, M), DELTA * 499999995.5);
    }

    @Test
    public void case196() {
        int N = 99999999;
        int M = 99999991;
        assertEquals(49999999.0, starport.getExpectedTime(N, M), DELTA * 49999999.0);
    }

    @Test
    public void case197() {
        int N = 4;
        int M = 4;
        assertEquals(0.0, starport.getExpectedTime(N, M), DELTA);
    }

    @Test
    public void case198() {
        int N = 1000000000;
        int M = 2;
        assertEquals(499999999.0, starport.getExpectedTime(N, M), DELTA * 499999999.0);
    }

    @Test
    public void case199() {
        int N = 123456789;
        int M = 100000000;
        assertEquals(61728394.0, starport.getExpectedTime(N, M), DELTA * 61728394.0);
    }

    @Test
    public void case200() {
        int N = 999999999;
        int M = 45235621;
        assertEquals(499999999.0, starport.getExpectedTime(N, M), DELTA * 499999999.0);
    }

    @Test
    public void case201() {
        int N = 1000000000;
        int M = 500000001;
        assertEquals(499999999.5, starport.getExpectedTime(N, M), DELTA * 499999999.5);
    }

    @Test
    public void case202() {
        int N = 2;
        int M = 1000;
        assertEquals(0.0, starport.getExpectedTime(N, M), DELTA);
    }

    @Test
    public void case203() {
        int N = 12365656;
        int M = 234;
        assertEquals(6182827.0, starport.getExpectedTime(N, M), DELTA * 6182827.0);
    }

    @Test
    public void case204() {
        int N = 1000000000;
        int M = 99;
        assertEquals(499999999.5, starport.getExpectedTime(N, M), DELTA * 499999999.5);
    }

    @Test
    public void case205() {
        int N = 2;
        int M = 6;
        assertEquals(0.0, starport.getExpectedTime(N, M), DELTA);
    }

    @Test
    public void case206() {
        int N = 6;
        int M = 4;
        assertEquals(2.0, starport.getExpectedTime(N, M), DELTA * 2.0);
    }

    @Test
    public void case207() {
        int N = 999008537;
        int M = 999009019;
        assertEquals(499504268.0, starport.getExpectedTime(N, M), DELTA * 499504268.0);
    }

    @Test
    public void case208() {
        int N = 199999997;
        int M = 199999991;
        assertEquals(99999998.0, starport.getExpectedTime(N, M), DELTA * 99999998.0);
    }

}
