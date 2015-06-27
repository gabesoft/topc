package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class PoweritTest {
    Powerit powerit = new Powerit();

    @Test
    public void case1() {
        int n = 4;
        int k = 1;
        int m = 107;
        assertEquals(10, powerit.calc(n, k, m));
    }

    @Test
    public void case2() {
        int n = 4;
        int k = 2;
        int m = 107;
        assertEquals(100, powerit.calc(n, k, m));
    }

    @Test
    public void case3() {
        int n = 3;
        int k = 3;
        int m = 107;
        assertEquals(69, powerit.calc(n, k, m));
    }

    @Test
    public void case4() {
        int n = 1;
        int k = 400;
        int m = 107;
        assertEquals(1, powerit.calc(n, k, m));
    }

    @Test
    public void case5() {
        int n = 10;
        int k = 2;
        int m = 10;
        assertEquals(5, powerit.calc(n, k, m));
    }

    @Test
    public void case6() {
        int n = 1000000;
        int k = 400;
        int m = 1000000000;
        assertEquals(0, powerit.calc(n, k, m));
    }

    @Test
    public void case7() {
        int n = 3348;
        int k = 3;
        int m = 681318585;
        assertEquals(457999371, powerit.calc(n, k, m));
    }

    @Test
    public void case8() {
        int n = 1134;
        int k = 35;
        int m = 411442879;
        assertEquals(334161548, powerit.calc(n, k, m));
    }

    @Test
    public void case9() {
        int n = 2550;
        int k = 38;
        int m = 752795944;
        assertEquals(41572777, powerit.calc(n, k, m));
    }

    @Test
    public void case10() {
        int n = 9589;
        int k = 31;
        int m = 470941272;
        assertEquals(86407945, powerit.calc(n, k, m));
    }

    @Test
    public void case11() {
        int n = 6893;
        int k = 32;
        int m = 101410319;
        assertEquals(48696648, powerit.calc(n, k, m));
    }

    @Test
    public void case12() {
        int n = 122;
        int k = 36;
        int m = 350817449;
        assertEquals(253006866, powerit.calc(n, k, m));
    }

    @Test
    public void case13() {
        int n = 9114;
        int k = 30;
        int m = 66810926;
        assertEquals(6097469, powerit.calc(n, k, m));
    }

    @Test
    public void case14() {
        int n = 5253;
        int k = 37;
        int m = 387142327;
        assertEquals(14139399, powerit.calc(n, k, m));
    }

    @Test
    public void case15() {
        int n = 9711;
        int k = 25;
        int m = 351487933;
        assertEquals(330986031, powerit.calc(n, k, m));
    }

    @Test
    public void case16() {
        int n = 9640;
        int k = 15;
        int m = 655422273;
        assertEquals(531550756, powerit.calc(n, k, m));
    }

    @Test
    public void case17() {
        int n = 7401;
        int k = 34;
        int m = 572223950;
        assertEquals(130529351, powerit.calc(n, k, m));
    }

    @Test
    public void case18() {
        int n = 8496;
        int k = 33;
        int m = 953318943;
        assertEquals(709306389, powerit.calc(n, k, m));
    }

    @Test
    public void case19() {
        int n = 5656;
        int k = 29;
        int m = 481932956;
        assertEquals(44391236, powerit.calc(n, k, m));
    }

    @Test
    public void case20() {
        int n = 3208;
        int k = 30;
        int m = 377693893;
        assertEquals(109500358, powerit.calc(n, k, m));
    }

    @Test
    public void case21() {
        int n = 1886;
        int k = 28;
        int m = 262386486;
        assertEquals(54254331, powerit.calc(n, k, m));
    }

    @Test
    public void case22() {
        int n = 3901;
        int k = 26;
        int m = 254045302;
        assertEquals(226500969, powerit.calc(n, k, m));
    }

    @Test
    public void case23() {
        int n = 9993;
        int k = 39;
        int m = 985838476;
        assertEquals(785191165, powerit.calc(n, k, m));
    }

    @Test
    public void case24() {
        int n = 9557;
        int k = 39;
        int m = 806222142;
        assertEquals(64303515, powerit.calc(n, k, m));
    }

    @Test
    public void case25() {
        int n = 6423;
        int k = 34;
        int m = 994429285;
        assertEquals(672100621, powerit.calc(n, k, m));
    }

    @Test
    public void case26() {
        int n = 9701;
        int k = 28;
        int m = 6730635;
        assertEquals(4501866, powerit.calc(n, k, m));
    }

    @Test
    public void case27() {
        int n = 4282;
        int k = 30;
        int m = 631721722;
        assertEquals(446526461, powerit.calc(n, k, m));
    }

    @Test
    public void case28() {
        int n = 9654;
        int k = 11;
        int m = 184029953;
        assertEquals(157767701, powerit.calc(n, k, m));
    }

    @Test
    public void case29() {
        int n = 1722;
        int k = 36;
        int m = 845723778;
        assertEquals(287363997, powerit.calc(n, k, m));
    }

    @Test
    public void case30() {
        int n = 9710;
        int k = 34;
        int m = 639192832;
        assertEquals(569635505, powerit.calc(n, k, m));
    }

    @Test
    public void case31() {
        int n = 3301;
        int k = 17;
        int m = 856320826;
        assertEquals(352043513, powerit.calc(n, k, m));
    }

    @Test
    public void case32() {
        int n = 9968;
        int k = 19;
        int m = 519501005;
        assertEquals(219340241, powerit.calc(n, k, m));
    }

    @Test
    public void case33() {
        int n = 6277;
        int k = 26;
        int m = 319735517;
        assertEquals(75570271, powerit.calc(n, k, m));
    }

    @Test
    public void case34() {
        int n = 9919;
        int k = 37;
        int m = 212474861;
        assertEquals(71748284, powerit.calc(n, k, m));
    }

    @Test
    public void case35() {
        int n = 2832;
        int k = 1;
        int m = 23256828;
        assertEquals(4011528, powerit.calc(n, k, m));
    }

    @Test
    public void case36() {
        int n = 9705;
        int k = 33;
        int m = 452667176;
        assertEquals(60815769, powerit.calc(n, k, m));
    }

    @Test
    public void case37() {
        int n = 443348;
        int k = 243;
        int m = 681318585;
        assertEquals(71460036, powerit.calc(n, k, m));
    }

    @Test
    public void case38() {
        int n = 981134;
        int k = 395;
        int m = 411442879;
        assertEquals(411185553, powerit.calc(n, k, m));
    }

    @Test
    public void case39() {
        int n = 992550;
        int k = 78;
        int m = 752795944;
        assertEquals(32255401, powerit.calc(n, k, m));
    }

    @Test
    public void case40() {
        int n = 309589;
        int k = 271;
        int m = 470941272;
        assertEquals(445542481, powerit.calc(n, k, m));
    }

    @Test
    public void case41() {
        int n = 956893;
        int k = 272;
        int m = 101410319;
        assertEquals(87081909, powerit.calc(n, k, m));
    }

    @Test
    public void case42() {
        int n = 770122;
        int k = 196;
        int m = 350817449;
        assertEquals(319256405, powerit.calc(n, k, m));
    }

    @Test
    public void case43() {
        int n = 559114;
        int k = 270;
        int m = 66810926;
        assertEquals(40449977, powerit.calc(n, k, m));
    }

    @Test
    public void case44() {
        int n = 495253;
        int k = 317;
        int m = 387142327;
        assertEquals(84570123, powerit.calc(n, k, m));
    }

    @Test
    public void case45() {
        int n = 199711;
        int k = 105;
        int m = 351487933;
        assertEquals(187782517, powerit.calc(n, k, m));
    }

    @Test
    public void case46() {
        int n = 579640;
        int k = 175;
        int m = 655422273;
        assertEquals(45860155, powerit.calc(n, k, m));
    }

    @Test
    public void case47() {
        int n = 117401;
        int k = 74;
        int m = 572223950;
        assertEquals(233269251, powerit.calc(n, k, m));
    }

    @Test
    public void case48() {
        int n = 218496;
        int k = 140;
        int m = 953318943;
        assertEquals(332327916, powerit.calc(n, k, m));
    }

    @Test
    public void case49() {
        int n = 931311;
        int k = 137;
        int m = 963865910;
        assertEquals(812008126, powerit.calc(n, k, m));
    }

    @Test
    public void case50() {
        int n = 639439;
        int k = 204;
        int m = 755387785;
        assertEquals(719937465, powerit.calc(n, k, m));
    }

    @Test
    public void case51() {
        int n = 596795;
        int k = 90;
        int m = 524772971;
        assertEquals(295517558, powerit.calc(n, k, m));
    }

    @Test
    public void case52() {
        int n = 768625;
        int k = 86;
        int m = 736875759;
        assertEquals(610788289, powerit.calc(n, k, m));
    }

    @Test
    public void case53() {
        int n = 951108;
        int k = 312;
        int m = 568328429;
        assertEquals(302573945, powerit.calc(n, k, m));
    }

    @Test
    public void case54() {
        int n = 596960;
        int k = 17;
        int m = 410703204;
        assertEquals(89978520, powerit.calc(n, k, m));
    }

    @Test
    public void case55() {
        int n = 99053;
        int k = 253;
        int m = 112026146;
        assertEquals(22110685, powerit.calc(n, k, m));
    }

    @Test
    public void case56() {
        int n = 398326;
        int k = 22;
        int m = 695843313;
        assertEquals(466856527, powerit.calc(n, k, m));
    }

    @Test
    public void case57() {
        int n = 421603;
        int k = 65;
        int m = 280059370;
        assertEquals(253395356, powerit.calc(n, k, m));
    }

    @Test
    public void case58() {
        int n = 576982;
        int k = 12;
        int m = 975512854;
        assertEquals(144332873, powerit.calc(n, k, m));
    }

    @Test
    public void case59() {
        int n = 3158;
        int k = 278;
        int m = 764324232;
        assertEquals(239854833, powerit.calc(n, k, m));
    }

    @Test
    public void case60() {
        int n = 611648;
        int k = 236;
        int m = 929523786;
        assertEquals(561897384, powerit.calc(n, k, m));
    }

    @Test
    public void case61() {
        int n = 542013;
        int k = 12;
        int m = 325329334;
        assertEquals(219833757, powerit.calc(n, k, m));
    }

    @Test
    public void case62() {
        int n = 611794;
        int k = 32;
        int m = 40776996;
        assertEquals(21686185, powerit.calc(n, k, m));
    }

    @Test
    public void case63() {
        int n = 144259;
        int k = 364;
        int m = 688681983;
        assertEquals(469310449, powerit.calc(n, k, m));
    }

    @Test
    public void case64() {
        int n = 869166;
        int k = 208;
        int m = 714073630;
        assertEquals(30880411, powerit.calc(n, k, m));
    }

    @Test
    public void case65() {
        int n = 175719;
        int k = 209;
        int m = 257435394;
        assertEquals(33330492, powerit.calc(n, k, m));
    }

    @Test
    public void case66() {
        int n = 86905;
        int k = 372;
        int m = 362572872;
        assertEquals(359566321, powerit.calc(n, k, m));
    }

    @Test
    public void case67() {
        int n = 403470;
        int k = 36;
        int m = 815062262;
        assertEquals(294424755, powerit.calc(n, k, m));
    }

    @Test
    public void case68() {
        int n = 411070;
        int k = 388;
        int m = 694715251;
        assertEquals(74979712, powerit.calc(n, k, m));
    }

    @Test
    public void case69() {
        int n = 881650;
        int k = 36;
        int m = 74512798;
        assertEquals(5699443, powerit.calc(n, k, m));
    }

    @Test
    public void case70() {
        int n = 741092;
        int k = 222;
        int m = 160427311;
        assertEquals(73852856, powerit.calc(n, k, m));
    }

    @Test
    public void case71() {
        int n = 153127;
        int k = 389;
        int m = 251431445;
        assertEquals(125506469, powerit.calc(n, k, m));
    }

    @Test
    public void case72() {
        int n = 269191;
        int k = 397;
        int m = 791499529;
        assertEquals(319676103, powerit.calc(n, k, m));
    }

    @Test
    public void case73() {
        int n = 360321;
        int k = 118;
        int m = 342262793;
        assertEquals(182180507, powerit.calc(n, k, m));
    }

    @Test
    public void case74() {
        int n = 513101;
        int k = 87;
        int m = 620897538;
        assertEquals(336725415, powerit.calc(n, k, m));
    }

    @Test
    public void case75() {
        int n = 970890;
        int k = 388;
        int m = 294917169;
        assertEquals(251995749, powerit.calc(n, k, m));
    }

    @Test
    public void case76() {
        int n = 412918;
        int k = 400;
        int m = 27318291;
        assertEquals(4380805, powerit.calc(n, k, m));
    }

    @Test
    public void case77() {
        int n = 702568;
        int k = 30;
        int m = 147259731;
        assertEquals(128522716, powerit.calc(n, k, m));
    }

    @Test
    public void case78() {
        int n = 694544;
        int k = 389;
        int m = 651490273;
        assertEquals(651116952, powerit.calc(n, k, m));
    }

    @Test
    public void case79() {
        int n = 476266;
        int k = 398;
        int m = 942312155;
        assertEquals(851951051, powerit.calc(n, k, m));
    }

    @Test
    public void case80() {
        int n = 818918;
        int k = 386;
        int m = 423200081;
        assertEquals(294881132, powerit.calc(n, k, m));
    }

    @Test
    public void case81() {
        int n = 79960;
        int k = 357;
        int m = 784365917;
        assertEquals(188786291, powerit.calc(n, k, m));
    }

    @Test
    public void case82() {
        int n = 262962;
        int k = 319;
        int m = 356218413;
        assertEquals(354775851, powerit.calc(n, k, m));
    }

    @Test
    public void case83() {
        int n = 650976;
        int k = 390;
        int m = 51495091;
        assertEquals(46408023, powerit.calc(n, k, m));
    }

    @Test
    public void case84() {
        int n = 710180;
        int k = 389;
        int m = 833079638;
        assertEquals(567811932, powerit.calc(n, k, m));
    }

    @Test
    public void case85() {
        int n = 441938;
        int k = 45;
        int m = 678963665;
        assertEquals(444620086, powerit.calc(n, k, m));
    }

    @Test
    public void case86() {
        int n = 65488;
        int k = 9;
        int m = 498462774;
        assertEquals(239473144, powerit.calc(n, k, m));
    }

    @Test
    public void case87() {
        int n = 960999;
        int k = 393;
        int m = 705802158;
        assertEquals(274295838, powerit.calc(n, k, m));
    }

    @Test
    public void case88() {
        int n = 968670;
        int k = 389;
        int m = 352976868;
        assertEquals(234233325, powerit.calc(n, k, m));
    }

    @Test
    public void case89() {
        int n = 662315;
        int k = 299;
        int m = 499095705;
        assertEquals(136763070, powerit.calc(n, k, m));
    }

    @Test
    public void case90() {
        int n = 995587;
        int k = 369;
        int m = 26695518;
        assertEquals(25640944, powerit.calc(n, k, m));
    }

    @Test
    public void case91() {
        int n = 735365;
        int k = 398;
        int m = 372041885;
        assertEquals(19448015, powerit.calc(n, k, m));
    }

    @Test
    public void case92() {
        int n = 987860;
        int k = 393;
        int m = 989078573;
        assertEquals(315562156, powerit.calc(n, k, m));
    }

    @Test
    public void case93() {
        int n = 526871;
        int k = 105;
        int m = 95915719;
        assertEquals(73025674, powerit.calc(n, k, m));
    }

    @Test
    public void case94() {
        int n = 973165;
        int k = 253;
        int m = 139772865;
        assertEquals(11561125, powerit.calc(n, k, m));
    }

    @Test
    public void case95() {
        int n = 738435;
        int k = 400;
        int m = 485925430;
        assertEquals(246179010, powerit.calc(n, k, m));
    }

    @Test
    public void case96() {
        int n = 982255;
        int k = 400;
        int m = 182342485;
        assertEquals(50301460, powerit.calc(n, k, m));
    }

    @Test
    public void case97() {
        int n = 465706;
        int k = 155;
        int m = 315313015;
        assertEquals(173781556, powerit.calc(n, k, m));
    }

    @Test
    public void case98() {
        int n = 982538;
        int k = 348;
        int m = 2210564;
        assertEquals(657037, powerit.calc(n, k, m));
    }

    @Test
    public void case99() {
        int n = 631868;
        int k = 394;
        int m = 254085361;
        assertEquals(40085794, powerit.calc(n, k, m));
    }

    @Test
    public void case100() {
        int n = 973904;
        int k = 388;
        int m = 870445961;
        assertEquals(360598799, powerit.calc(n, k, m));
    }

    @Test
    public void case101() {
        int n = 587666;
        int k = 281;
        int m = 700188016;
        assertEquals(547270001, powerit.calc(n, k, m));
    }

    @Test
    public void case102() {
        int n = 970080;
        int k = 338;
        int m = 267177703;
        assertEquals(61418075, powerit.calc(n, k, m));
    }

    @Test
    public void case103() {
        int n = 177611;
        int k = 398;
        int m = 614526689;
        assertEquals(270778312, powerit.calc(n, k, m));
    }

    @Test
    public void case104() {
        int n = 967308;
        int k = 397;
        int m = 440187978;
        assertEquals(241565838, powerit.calc(n, k, m));
    }

    @Test
    public void case105() {
        int n = 363150;
        int k = 370;
        int m = 615727640;
        assertEquals(2979265, powerit.calc(n, k, m));
    }

    @Test
    public void case106() {
        int n = 991098;
        int k = 331;
        int m = 743710051;
        assertEquals(99927372, powerit.calc(n, k, m));
    }

    @Test
    public void case107() {
        int n = 760184;
        int k = 398;
        int m = 665419075;
        assertEquals(269844625, powerit.calc(n, k, m));
    }

    @Test
    public void case108() {
        int n = 988925;
        int k = 395;
        int m = 361351719;
        assertEquals(241430421, powerit.calc(n, k, m));
    }

    @Test
    public void case109() {
        int n = 580724;
        int k = 360;
        int m = 13676508;
        assertEquals(9397800, powerit.calc(n, k, m));
    }

    @Test
    public void case110() {
        int n = 992274;
        int k = 302;
        int m = 408017968;
        assertEquals(211383745, powerit.calc(n, k, m));
    }

    @Test
    public void case111() {
        int n = 597543;
        int k = 392;
        int m = 264859844;
        assertEquals(83323964, powerit.calc(n, k, m));
    }

    @Test
    public void case112() {
        int n = 996298;
        int k = 389;
        int m = 269987261;
        assertEquals(60165552, powerit.calc(n, k, m));
    }

    @Test
    public void case113() {
        int n = 196848;
        int k = 37;
        int m = 81269629;
        assertEquals(74853955, powerit.calc(n, k, m));
    }

    @Test
    public void case114() {
        int n = 983425;
        int k = 62;
        int m = 927852680;
        assertEquals(569037745, powerit.calc(n, k, m));
    }

    @Test
    public void case115() {
        int n = 681531;
        int k = 387;
        int m = 4111138;
        assertEquals(594622, powerit.calc(n, k, m));
    }

    @Test
    public void case116() {
        int n = 987574;
        int k = 400;
        int m = 631047121;
        assertEquals(11465774, powerit.calc(n, k, m));
    }

    @Test
    public void case117() {
        int n = 1000000;
        int k = 1;
        int m = 764411904;
        assertEquals(75114784, powerit.calc(n, k, m));
    }

    @Test
    public void case118() {
        int n = 1000000;
        int k = 2;
        int m = 764411904;
        assertEquals(258688000, powerit.calc(n, k, m));
    }

    @Test
    public void case119() {
        int n = 987654;
        int k = 1;
        int m = 1024000;
        assertEquals(529685, powerit.calc(n, k, m));
    }

    @Test
    public void case120() {
        int n = 987987;
        int k = 1;
        int m = 536870912;
        assertEquals(43991070, powerit.calc(n, k, m));
    }

    @Test
    public void case121() {
        int n = 987987;
        int k = 2;
        int m = 536870912;
        assertEquals(223544196, powerit.calc(n, k, m));
    }

    @Test
    public void case122() {
        int n = 987987;
        int k = 3;
        int m = 536870912;
        assertEquals(71642284, powerit.calc(n, k, m));
    }

    @Test
    public void case123() {
        int n = 987987;
        int k = 4;
        int m = 536870912;
        assertEquals(448603916, powerit.calc(n, k, m));
    }

    @Test
    public void case124() {
        int n = 987987;
        int k = 5;
        int m = 536870912;
        assertEquals(392833228, powerit.calc(n, k, m));
    }

    @Test
    public void case125() {
        int n = 987987;
        int k = 400;
        int m = 2;
        assertEquals(0, powerit.calc(n, k, m));
    }

    @Test
    public void case126() {
        int n = 987987;
        int k = 389;
        int m = 5;
        assertEquals(4, powerit.calc(n, k, m));
    }

    @Test
    public void case127() {
        int n = 999999;
        int k = 399;
        int m = 7;
        assertEquals(0, powerit.calc(n, k, m));
    }

    @Test
    public void case128() {
        int n = 443348;
        int k = 243;
        int m = 364973499;
        assertEquals(325223910, powerit.calc(n, k, m));
    }

    @Test
    public void case129() {
        int n = 716849;
        int k = 6;
        int m = 73629;
        assertEquals(22599, powerit.calc(n, k, m));
    }

    @Test
    public void case130() {
        int n = 793139;
        int k = 390;
        int m = 75625;
        assertEquals(26775, powerit.calc(n, k, m));
    }

    @Test
    public void case131() {
        int n = 681456;
        int k = 105;
        int m = 732050000;
        assertEquals(603877856, powerit.calc(n, k, m));
    }

    @Test
    public void case132() {
        int n = 241915;
        int k = 326;
        int m = 310903351;
        assertEquals(78596521, powerit.calc(n, k, m));
    }

    @Test
    public void case133() {
        int n = 497003;
        int k = 283;
        int m = 823851904;
        assertEquals(221427916, powerit.calc(n, k, m));
    }

    @Test
    public void case134() {
        int n = 23785;
        int k = 269;
        int m = 1000;
        assertEquals(625, powerit.calc(n, k, m));
    }

    @Test
    public void case135() {
        int n = 727138;
        int k = 68;
        int m = 643938125;
        assertEquals(201666176, powerit.calc(n, k, m));
    }

    @Test
    public void case136() {
        int n = 609116;
        int k = 242;
        int m = 99;
        assertEquals(9, powerit.calc(n, k, m));
    }

    @Test
    public void case137() {
        int n = 879028;
        int k = 241;
        int m = 766763811;
        assertEquals(136999099, powerit.calc(n, k, m));
    }

    @Test
    public void case138() {
        int n = 869253;
        int k = 366;
        int m = 557646408;
        assertEquals(389122569, powerit.calc(n, k, m));
    }

    @Test
    public void case139() {
        int n = 67108;
        int k = 400;
        int m = 91809;
        assertEquals(72433, powerit.calc(n, k, m));
    }

    @Test
    public void case140() {
        int n = 937278;
        int k = 202;
        int m = 796953125;
        assertEquals(449092461, powerit.calc(n, k, m));
    }

    @Test
    public void case141() {
        int n = 964228;
        int k = 119;
        int m = 100;
        assertEquals(16, powerit.calc(n, k, m));
    }

    @Test
    public void case142() {
        int n = 477297;
        int k = 387;
        int m = 997353324;
        assertEquals(740571849, powerit.calc(n, k, m));
    }

    @Test
    public void case143() {
        int n = 832276;
        int k = 390;
        int m = 448204933;
        assertEquals(250643145, powerit.calc(n, k, m));
    }

    @Test
    public void case144() {
        int n = 754175;
        int k = 264;
        int m = 352218537;
        assertEquals(129774042, powerit.calc(n, k, m));
    }

    @Test
    public void case145() {
        int n = 973141;
        int k = 365;
        int m = 536870912;
        assertEquals(196879689, powerit.calc(n, k, m));
    }

    @Test
    public void case146() {
        int n = 863944;
        int k = 5;
        int m = 244140625;
        assertEquals(89034250, powerit.calc(n, k, m));
    }

    @Test
    public void case147() {
        int n = 979811;
        int k = 398;
        int m = 664902216;
        assertEquals(548038764, powerit.calc(n, k, m));
    }

    @Test
    public void case148() {
        int n = 448436;
        int k = 111;
        int m = 58564;
        assertEquals(0, powerit.calc(n, k, m));
    }

    @Test
    public void case149() {
        int n = 980264;
        int k = 344;
        int m = 25;
        assertEquals(0, powerit.calc(n, k, m));
    }

    @Test
    public void case150() {
        int n = 99865;
        int k = 390;
        int m = 796953125;
        assertEquals(191340650, powerit.calc(n, k, m));
    }

    @Test
    public void case151() {
        int n = 995191;
        int k = 394;
        int m = 36663;
        assertEquals(30976, powerit.calc(n, k, m));
    }

    @Test
    public void case152() {
        int n = 805758;
        int k = 309;
        int m = 25;
        assertEquals(16, powerit.calc(n, k, m));
    }

    @Test
    public void case153() {
        int n = 9963;
        int k = 1;
        int m = 678410940;
        assertEquals(49635666, powerit.calc(n, k, m));
    }

    @Test
    public void case154() {
        int n = 9949;
        int k = 1;
        int m = 668999740;
        assertEquals(49496275, powerit.calc(n, k, m));
    }

    @Test
    public void case155() {
        int n = 9914;
        int k = 1;
        int m = 215841664;
        assertEquals(49148655, powerit.calc(n, k, m));
    }

    @Test
    public void case156() {
        int n = 9923;
        int k = 1;
        int m = 238400932;
        assertEquals(49237926, powerit.calc(n, k, m));
    }

    @Test
    public void case157() {
        int n = 9974;
        int k = 1;
        int m = 372984436;
        assertEquals(49745325, powerit.calc(n, k, m));
    }

    @Test
    public void case158() {
        int n = 9907;
        int k = 1;
        int m = 19777264;
        assertEquals(9524750, powerit.calc(n, k, m));
    }

    @Test
    public void case159() {
        int n = 9930;
        int k = 1;
        int m = 177681845;
        assertEquals(49307415, powerit.calc(n, k, m));
    }

    @Test
    public void case160() {
        int n = 9910;
        int k = 1;
        int m = 760645136;
        assertEquals(49109005, powerit.calc(n, k, m));
    }

    @Test
    public void case161() {
        int n = 9990;
        int k = 1;
        int m = 953843872;
        assertEquals(49905045, powerit.calc(n, k, m));
    }

    @Test
    public void case162() {
        int n = 9974;
        int k = 1;
        int m = 630243632;
        assertEquals(49745325, powerit.calc(n, k, m));
    }

    @Test
    public void case163() {
        int n = 9941;
        int k = 2;
        int m = 20339136;
        assertEquals(19897713, powerit.calc(n, k, m));
    }

    @Test
    public void case164() {
        int n = 9913;
        int k = 1;
        int m = 720450280;
        assertEquals(49138741, powerit.calc(n, k, m));
    }

    @Test
    public void case165() {
        int n = 9963;
        int k = 1;
        int m = 665652836;
        assertEquals(49635666, powerit.calc(n, k, m));
    }

    @Test
    public void case166() {
        int n = 9995;
        int k = 1;
        int m = 208499500;
        assertEquals(49955010, powerit.calc(n, k, m));
    }

    @Test
    public void case167() {
        int n = 9963;
        int k = 1;
        int m = 415502997;
        assertEquals(49635666, powerit.calc(n, k, m));
    }

    @Test
    public void case168() {
        int n = 9994;
        int k = 1;
        int m = 225843959;
        assertEquals(49945015, powerit.calc(n, k, m));
    }

    @Test
    public void case169() {
        int n = 9985;
        int k = 1;
        int m = 696416775;
        assertEquals(49855105, powerit.calc(n, k, m));
    }

    @Test
    public void case170() {
        int n = 9979;
        int k = 1;
        int m = 942135424;
        assertEquals(49795210, powerit.calc(n, k, m));
    }

    @Test
    public void case171() {
        int n = 9972;
        int k = 1;
        int m = 716976048;
        assertEquals(49725378, powerit.calc(n, k, m));
    }

    @Test
    public void case172() {
        int n = 9977;
        int k = 1;
        int m = 439177752;
        assertEquals(49775253, powerit.calc(n, k, m));
    }

    @Test
    public void case173() {
        int n = 9963;
        int k = 1;
        int m = 678410940;
        assertEquals(49635666, powerit.calc(n, k, m));
    }

    @Test
    public void case174() {
        int n = 9949;
        int k = 1;
        int m = 668999740;
        assertEquals(49496275, powerit.calc(n, k, m));
    }

    @Test
    public void case175() {
        int n = 9914;
        int k = 1;
        int m = 215841664;
        assertEquals(49148655, powerit.calc(n, k, m));
    }

    @Test
    public void case176() {
        int n = 9923;
        int k = 1;
        int m = 238400932;
        assertEquals(49237926, powerit.calc(n, k, m));
    }

    @Test
    public void case177() {
        int n = 9974;
        int k = 1;
        int m = 372984436;
        assertEquals(49745325, powerit.calc(n, k, m));
    }

    @Test
    public void case178() {
        int n = 9907;
        int k = 1;
        int m = 19777264;
        assertEquals(9524750, powerit.calc(n, k, m));
    }

    @Test
    public void case179() {
        int n = 9930;
        int k = 1;
        int m = 177681845;
        assertEquals(49307415, powerit.calc(n, k, m));
    }

    @Test
    public void case180() {
        int n = 9910;
        int k = 1;
        int m = 760645136;
        assertEquals(49109005, powerit.calc(n, k, m));
    }

    @Test
    public void case181() {
        int n = 9990;
        int k = 1;
        int m = 953843872;
        assertEquals(49905045, powerit.calc(n, k, m));
    }

    @Test
    public void case182() {
        int n = 9974;
        int k = 1;
        int m = 630243632;
        assertEquals(49745325, powerit.calc(n, k, m));
    }

    @Test
    public void case183() {
        int n = 9932;
        int k = 141;
        int m = 961;
        assertEquals(326, powerit.calc(n, k, m));
    }

    @Test
    public void case184() {
        int n = 9967;
        int k = 139;
        int m = 9;
        assertEquals(7, powerit.calc(n, k, m));
    }

    @Test
    public void case185() {
        int n = 9966;
        int k = 141;
        int m = 961;
        assertEquals(957, powerit.calc(n, k, m));
    }

    @Test
    public void case186() {
        int n = 9922;
        int k = 99;
        int m = 18;
        assertEquals(7, powerit.calc(n, k, m));
    }

    @Test
    public void case187() {
        int n = 9999;
        int k = 99;
        int m = 2;
        assertEquals(0, powerit.calc(n, k, m));
    }

    @Test
    public void case188() {
        int n = 9970;
        int k = 97;
        int m = 2;
        assertEquals(1, powerit.calc(n, k, m));
    }

    @Test
    public void case189() {
        int n = 9995;
        int k = 99;
        int m = 18;
        assertEquals(12, powerit.calc(n, k, m));
    }

    @Test
    public void case190() {
        int n = 9932;
        int k = 141;
        int m = 961;
        assertEquals(326, powerit.calc(n, k, m));
    }

    @Test
    public void case191() {
        int n = 9984;
        int k = 97;
        int m = 18;
        assertEquals(12, powerit.calc(n, k, m));
    }

    @Test
    public void case192() {
        int n = 9923;
        int k = 139;
        int m = 9;
        assertEquals(3, powerit.calc(n, k, m));
    }

    @Test
    public void case193() {
        int n = 999999;
        int k = 400;
        int m = 1000000000;
        assertEquals(0, powerit.calc(n, k, m));
    }

    @Test
    public void case194() {
        int n = 1000000;
        int k = 400;
        int m = 2;
        assertEquals(0, powerit.calc(n, k, m));
    }

    @Test
    public void case195() {
        int n = 1000000;
        int k = 399;
        int m = 1000007;
        assertEquals(501896, powerit.calc(n, k, m));
    }

    @Test
    public void case196() {
        int n = 1000000;
        int k = 400;
        int m = 10000000;
        assertEquals(0, powerit.calc(n, k, m));
    }

    @Test
    public void case197() {
        int n = 999999;
        int k = 400;
        int m = 999999999;
        assertEquals(504479016, powerit.calc(n, k, m));
    }

    @Test
    public void case198() {
        int n = 1000000;
        int k = 400;
        int m = 100000000;
        assertEquals(0, powerit.calc(n, k, m));
    }

    @Test
    public void case199() {
        int n = 1000;
        int k = 400;
        int m = 1000000;
        assertEquals(750000, powerit.calc(n, k, m));
    }

    @Test
    public void case200() {
        int n = 938132;
        int k = 382;
        int m = 999998991;
        assertEquals(74187405, powerit.calc(n, k, m));
    }

    @Test
    public void case201() {
        int n = 999997;
        int k = 399;
        int m = 536870911;
        assertEquals(183331312, powerit.calc(n, k, m));
    }

    @Test
    public void case202() {
        int n = 2;
        int k = 4;
        int m = 3;
        assertEquals(0, powerit.calc(n, k, m));
    }

    @Test
    public void case203() {
        int n = 1000000;
        int k = 400;
        int m = 999999999;
        assertEquals(504479017, powerit.calc(n, k, m));
    }

    @Test
    public void case204() {
        int n = 1000000;
        int k = 400;
        int m = 99999999;
        assertEquals(68238226, powerit.calc(n, k, m));
    }

    @Test
    public void case205() {
        int n = 1000000;
        int k = 400;
        int m = 1000;
        assertEquals(0, powerit.calc(n, k, m));
    }

    @Test
    public void case206() {
        int n = 100000;
        int k = 352;
        int m = 1000;
        assertEquals(0, powerit.calc(n, k, m));
    }

    @Test
    public void case207() {
        int n = 1000000;
        int k = 400;
        int m = 10;
        assertEquals(0, powerit.calc(n, k, m));
    }

    @Test
    public void case208() {
        int n = 1000000;
        int k = 400;
        int m = 1111;
        assertEquals(606, powerit.calc(n, k, m));
    }

    @Test
    public void case209() {
        int n = 111100;
        int k = 400;
        int m = 2;
        assertEquals(0, powerit.calc(n, k, m));
    }

    @Test
    public void case210() {
        int n = 1000000;
        int k = 400;
        int m = 1007;
        assertEquals(815, powerit.calc(n, k, m));
    }

    @Test
    public void case211() {
        int n = 1000000;
        int k = 400;
        int m = 57777;
        assertEquals(35407, powerit.calc(n, k, m));
    }

    @Test
    public void case212() {
        int n = 999999;
        int k = 399;
        int m = 999999999;
        assertEquals(549167283, powerit.calc(n, k, m));
    }

    @Test
    public void case213() {
        int n = 11000;
        int k = 333;
        int m = 888888;
        assertEquals(141504, powerit.calc(n, k, m));
    }

    @Test
    public void case214() {
        int n = 1000000;
        int k = 400;
        int m = 100000099;
        assertEquals(49391523, powerit.calc(n, k, m));
    }

    @Test
    public void case215() {
        int n = 1000;
        int k = 3;
        int m = 7;
        assertEquals(0, powerit.calc(n, k, m));
    }

    @Test
    public void case216() {
        int n = 1000000;
        int k = 400;
        int m = 123456789;
        assertEquals(28311364, powerit.calc(n, k, m));
    }

    @Test
    public void case217() {
        int n = 100002;
        int k = 123;
        int m = 123565;
        assertEquals(121844, powerit.calc(n, k, m));
    }

    @Test
    public void case218() {
        int n = 987654;
        int k = 399;
        int m = 100000001;
        assertEquals(215596, powerit.calc(n, k, m));
    }

    @Test
    public void case219() {
        int n = 999997;
        int k = 400;
        int m = 990000231;
        assertEquals(774897883, powerit.calc(n, k, m));
    }

    @Test
    public void case220() {
        int n = 100000;
        int k = 400;
        int m = 4;
        assertEquals(0, powerit.calc(n, k, m));
    }

    @Test
    public void case221() {
        int n = 999737;
        int k = 377;
        int m = 100000007;
        assertEquals(72349339, powerit.calc(n, k, m));
    }

    @Test
    public void case222() {
        int n = 1000000;
        int k = 400;
        int m = 10000008;
        assertEquals(5972896, powerit.calc(n, k, m));
    }

    @Test
    public void case223() {
        int n = 100000;
        int k = 400;
        int m = 2;
        assertEquals(0, powerit.calc(n, k, m));
    }

    @Test
    public void case224() {
        int n = 1000000;
        int k = 397;
        int m = 555959447;
        assertEquals(277786381, powerit.calc(n, k, m));
    }

    @Test
    public void case225() {
        int n = 1000000;
        int k = 400;
        int m = 100000015;
        assertEquals(32304705, powerit.calc(n, k, m));
    }

    @Test
    public void case226() {
        int n = 3;
        int k = 4;
        int m = 15;
        assertEquals(6, powerit.calc(n, k, m));
    }

    @Test
    public void case227() {
        int n = 1000;
        int k = 400;
        int m = 1000;
        assertEquals(0, powerit.calc(n, k, m));
    }

    @Test
    public void case228() {
        int n = 5;
        int k = 3;
        int m = 9;
        assertEquals(3, powerit.calc(n, k, m));
    }

}
