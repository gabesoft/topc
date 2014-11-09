package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class SilverDistanceTest {
    SilverDistance silverdistance = new SilverDistance();

    @Test
    public void case1() {
        int sx = 1;
        int sy = 0;
        int gx = 1;
        int gy = 9;
        assertEquals(9, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case2() {
        int sx = 0;
        int sy = 0;
        int gx = -4;
        int gy = 3;
        assertEquals(5, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case3() {
        int sx = 0;
        int sy = 0;
        int gx = 5;
        int gy = 8;
        assertEquals(8, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case4() {
        int sx = -487617;
        int sy = 826524;
        int gx = 892309;
        int gy = -918045;
        assertEquals(1744571, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case5() {
        int sx = -27857;
        int sy = 31475;
        int gx = -27857;
        int gy = 31475;
        assertEquals(0, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case6() {
        int sx = 765193;
        int sy = 377201;
        int gx = 765191;
        int gy = 377199;
        assertEquals(2, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case7() {
        int sx = -784373;
        int sy = 390934;
        int gx = -784375;
        int gy = 390933;
        assertEquals(3, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case8() {
        int sx = -330706;
        int sy = 475232;
        int gx = -330708;
        int gy = 475232;
        assertEquals(2, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case9() {
        int sx = 349530;
        int sy = -113416;
        int gx = 349528;
        int gy = -113415;
        assertEquals(3, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case10() {
        int sx = -583109;
        int sy = -842787;
        int gx = -583111;
        int gy = -842785;
        assertEquals(2, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case11() {
        int sx = 699638;
        int sy = -732089;
        int gx = 699637;
        int gy = -732091;
        assertEquals(4, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case12() {
        int sx = 771899;
        int sy = -921638;
        int gx = 771898;
        int gy = -921639;
        assertEquals(1, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case13() {
        int sx = 753056;
        int sy = -453698;
        int gx = 753055;
        int gy = -453698;
        assertEquals(2, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case14() {
        int sx = 117356;
        int sy = -862744;
        int gx = 117355;
        int gy = -862743;
        assertEquals(1, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case15() {
        int sx = 931180;
        int sy = 957388;
        int gx = 931179;
        int gy = 957390;
        assertEquals(2, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case16() {
        int sx = 225981;
        int sy = 669490;
        int gx = 225981;
        int gy = 669488;
        assertEquals(2, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case17() {
        int sx = -62771;
        int sy = -967730;
        int gx = -62771;
        int gy = -967731;
        assertEquals(3, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case18() {
        int sx = 206592;
        int sy = -293811;
        int gx = 206592;
        int gy = -293811;
        assertEquals(0, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case19() {
        int sx = 637628;
        int sy = -432514;
        int gx = 637628;
        int gy = -432513;
        assertEquals(1, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case20() {
        int sx = 487223;
        int sy = -224313;
        int gx = 487223;
        int gy = -224311;
        assertEquals(2, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case21() {
        int sx = -873913;
        int sy = 949777;
        int gx = -873912;
        int gy = 949775;
        assertEquals(4, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case22() {
        int sx = -484806;
        int sy = -458089;
        int gx = -484805;
        int gy = -458090;
        assertEquals(1, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case23() {
        int sx = 40211;
        int sy = 604450;
        int gx = 40212;
        int gy = 604450;
        assertEquals(2, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case24() {
        int sx = -572756;
        int sy = -281687;
        int gx = -572755;
        int gy = -281686;
        assertEquals(1, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case25() {
        int sx = -731157;
        int sy = 998155;
        int gx = -731156;
        int gy = 998157;
        assertEquals(2, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case26() {
        int sx = -63277;
        int sy = 642461;
        int gx = -63275;
        int gy = 642459;
        assertEquals(2, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case27() {
        int sx = 914348;
        int sy = 266372;
        int gx = 914350;
        int gy = 266371;
        assertEquals(3, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case28() {
        int sx = 350865;
        int sy = -249640;
        int gx = 350867;
        int gy = -249640;
        assertEquals(2, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case29() {
        int sx = -420991;
        int sy = -440652;
        int gx = -420989;
        int gy = -440651;
        assertEquals(3, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case30() {
        int sx = -500280;
        int sy = -30094;
        int gx = -500278;
        int gy = -30092;
        assertEquals(2, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case31() {
        int sx = -732513;
        int sy = -542725;
        int gx = 58853;
        int gy = -776738;
        assertEquals(791367, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case32() {
        int sx = -571559;
        int sy = 252635;
        int gx = -156169;
        int gy = -159253;
        assertEquals(415390, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case33() {
        int sx = 674079;
        int sy = 934097;
        int gx = 686838;
        int gy = -858508;
        assertEquals(1792605, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case34() {
        int sx = -330110;
        int sy = 230031;
        int gx = 964597;
        int gy = -370703;
        assertEquals(1294708, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case35() {
        int sx = -46250;
        int sy = -598134;
        int gx = -469307;
        int gy = 35292;
        assertEquals(633426, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case36() {
        int sx = 653128;
        int sy = -124996;
        int gx = 337064;
        int gy = -873188;
        assertEquals(748192, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case37() {
        int sx = 565990;
        int sy = -966563;
        int gx = 656244;
        int gy = -570391;
        assertEquals(396172, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case38() {
        int sx = 653164;
        int sy = 287035;
        int gx = 218540;
        int gy = 91958;
        assertEquals(434625, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case39() {
        int sx = 98554;
        int sy = -419937;
        int gx = 221228;
        int gy = 622379;
        assertEquals(1042316, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case40() {
        int sx = -574481;
        int sy = 579426;
        int gx = 442096;
        int gy = 426106;
        assertEquals(1016578, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case41() {
        int sx = -20853;
        int sy = 170601;
        int gx = 638444;
        int gy = -783689;
        assertEquals(954292, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case42() {
        int sx = 636591;
        int sy = 227526;
        int gx = -113385;
        int gy = 160718;
        assertEquals(749976, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case43() {
        int sx = 839931;
        int sy = -701149;
        int gx = 81406;
        int gy = -904628;
        assertEquals(758525, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case44() {
        int sx = 758207;
        int sy = 205845;
        int gx = 400672;
        int gy = 486463;
        assertEquals(357536, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case45() {
        int sx = 885971;
        int sy = -715746;
        int gx = -117854;
        int gy = 833476;
        assertEquals(1549222, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case46() {
        int sx = 170184;
        int sy = 784167;
        int gx = 999772;
        int gy = -17176;
        assertEquals(829589, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case47() {
        int sx = -539857;
        int sy = 748436;
        int gx = -896740;
        int gy = 12797;
        assertEquals(735639, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case48() {
        int sx = 168858;
        int sy = 569210;
        int gx = 997844;
        int gy = 997385;
        assertEquals(828987, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case49() {
        int sx = 670859;
        int sy = -973579;
        int gx = 323107;
        int gy = -590101;
        assertEquals(383478, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case50() {
        int sx = -1000000;
        int sy = -1000000;
        int gx = 1000000;
        int gy = 1000000;
        assertEquals(2000000, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case51() {
        int sx = -1000000;
        int sy = -1000000;
        int gx = 1000000;
        int gy = 999999;
        assertEquals(2000001, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case52() {
        int sx = -1000000;
        int sy = -1000000;
        int gx = 999999;
        int gy = 1000000;
        assertEquals(2000000, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case53() {
        int sx = 1000000;
        int sy = 1000000;
        int gx = -1000000;
        int gy = -1000000;
        assertEquals(2000000, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case54() {
        int sx = 1000000;
        int sy = 1000000;
        int gx = -1000000;
        int gy = -999999;
        assertEquals(2000001, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case55() {
        int sx = 1000000;
        int sy = 1000000;
        int gx = -999999;
        int gy = -1000000;
        assertEquals(2000002, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case56() {
        int sx = 1000000;
        int sy = -1000000;
        int gx = -1000000;
        int gy = 1000000;
        assertEquals(2000000, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case57() {
        int sx = -1000000;
        int sy = 1000000;
        int gx = 1000000;
        int gy = -999999;
        assertEquals(2000001, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case58() {
        int sx = -1000000;
        int sy = 1000000;
        int gx = 999999;
        int gy = -1000000;
        assertEquals(2000002, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case59() {
        int sx = 1000000;
        int sy = -1000000;
        int gx = -1000000;
        int gy = 1000000;
        assertEquals(2000000, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case60() {
        int sx = 1000000;
        int sy = -1000000;
        int gx = -999999;
        int gy = 1000000;
        assertEquals(2000000, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case61() {
        int sx = 1000000;
        int sy = -1000000;
        int gx = -1000000;
        int gy = 999999;
        assertEquals(2000001, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case62() {
        int sx = 0;
        int sy = 0;
        int gx = 1;
        int gy = -4;
        assertEquals(6, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case63() {
        int sx = 0;
        int sy = 1;
        int gx = 0;
        int gy = -1;
        assertEquals(2, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case64() {
        int sx = 0;
        int sy = 0;
        int gx = 8;
        int gy = 0;
        assertEquals(8, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case65() {
        int sx = 1;
        int sy = 10;
        int gx = 11;
        int gy = 10;
        assertEquals(10, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case66() {
        int sx = 0;
        int sy = 0;
        int gx = 1;
        int gy = 0;
        assertEquals(2, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case67() {
        int sx = 800000;
        int sy = 800000;
        int gx = 500000;
        int gy = 600000;
        assertEquals(300000, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case68() {
        int sx = 999999;
        int sy = 999999;
        int gx = -999999;
        int gy = -999999;
        assertEquals(1999998, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case69() {
        int sx = 0;
        int sy = 0;
        int gx = 0;
        int gy = -1;
        assertEquals(3, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case70() {
        int sx = 0;
        int sy = 0;
        int gx = -3;
        int gy = -1;
        assertEquals(3, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case71() {
        int sx = 0;
        int sy = 0;
        int gx = 1;
        int gy = -1;
        assertEquals(1, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case72() {
        int sx = -1000000;
        int sy = -1000000;
        int gx = 1000000;
        int gy = 999001;
        assertEquals(2000001, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case73() {
        int sx = 5;
        int sy = 10;
        int gx = 5;
        int gy = 9;
        assertEquals(3, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case74() {
        int sx = -48761;
        int sy = 82654;
        int gx = 892309;
        int gy = -918045;
        assertEquals(1000701, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case75() {
        int sx = 0;
        int sy = 0;
        int gx = 10;
        int gy = -10;
        assertEquals(10, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case76() {
        int sx = 1000000;
        int sy = 1000000;
        int gx = -999999;
        int gy = 0;
        assertEquals(2000000, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case77() {
        int sx = -999999;
        int sy = 999999;
        int gx = 999999;
        int gy = 999998;
        assertEquals(1999999, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case78() {
        int sx = 1;
        int sy = 1;
        int gx = -9;
        int gy = 1;
        assertEquals(10, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case79() {
        int sx = 0;
        int sy = 0;
        int gx = 3;
        int gy = 0;
        assertEquals(4, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case80() {
        int sx = -900000;
        int sy = -500000;
        int gx = 1000000;
        int gy = 700000;
        assertEquals(1900000, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case81() {
        int sx = -999999;
        int sy = -999997;
        int gx = 999999;
        int gy = 999104;
        assertEquals(1999999, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case82() {
        int sx = 0;
        int sy = 0;
        int gx = 10001;
        int gy = -3;
        assertEquals(10001, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case83() {
        int sx = 0;
        int sy = 0;
        int gx = 300;
        int gy = -1;
        assertEquals(301, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case84() {
        int sx = -478617;
        int sy = 826582;
        int gx = 896365;
        int gy = -914745;
        assertEquals(1741329, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case85() {
        int sx = 0;
        int sy = 0;
        int gx = 2;
        int gy = 1;
        assertEquals(3, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case86() {
        int sx = 0;
        int sy = 0;
        int gx = 0;
        int gy = -2;
        assertEquals(2, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case87() {
        int sx = 4;
        int sy = 1;
        int gx = 1;
        int gy = 4;
        assertEquals(3, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case88() {
        int sx = 0;
        int sy = 0;
        int gx = 3;
        int gy = 3;
        assertEquals(3, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case89() {
        int sx = -1000000;
        int sy = -1000000;
        int gx = 999999;
        int gy = 666666;
        assertEquals(2000000, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case90() {
        int sx = 0;
        int sy = 1;
        int gx = 3;
        int gy = 1;
        assertEquals(4, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case91() {
        int sx = 987654;
        int sy = 989898;
        int gx = -998877;
        int gy = -897976;
        assertEquals(1986532, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case92() {
        int sx = 0;
        int sy = 0;
        int gx = 1;
        int gy = -3;
        assertEquals(3, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case93() {
        int sx = -643039;
        int sy = 155704;
        int gx = -426405;
        int gy = 83934;
        assertEquals(216634, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case94() {
        int sx = 10;
        int sy = 2;
        int gx = 4;
        int gy = 2;
        assertEquals(6, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case95() {
        int sx = 0;
        int sy = 0;
        int gx = 1;
        int gy = -2;
        assertEquals(4, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case96() {
        int sx = -99999;
        int sy = 123;
        int gx = -999991;
        int gy = 99998;
        assertEquals(899993, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case97() {
        int sx = 0;
        int sy = 0;
        int gx = 2;
        int gy = -1;
        assertEquals(3, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case98() {
        int sx = 0;
        int sy = 0;
        int gx = 5;
        int gy = -8;
        assertEquals(10, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case99() {
        int sx = -483649;
        int sy = 640827;
        int gx = 201850;
        int gy = -510648;
        assertEquals(1151475, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case100() {
        int sx = 0;
        int sy = 0;
        int gx = 4;
        int gy = -3;
        assertEquals(5, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case101() {
        int sx = 10;
        int sy = 10;
        int gx = 20;
        int gy = 30;
        assertEquals(20, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case102() {
        int sx = 0;
        int sy = 1;
        int gx = 3;
        int gy = 0;
        assertEquals(3, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case103() {
        int sx = 2;
        int sy = 0;
        int gx = 0;
        int gy = 0;
        assertEquals(2, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case104() {
        int sx = 100;
        int sy = 1;
        int gx = 0;
        int gy = 0;
        assertEquals(101, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case105() {
        int sx = 0;
        int sy = 2;
        int gx = 0;
        int gy = -3;
        assertEquals(7, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case106() {
        int sx = 999999;
        int sy = 0;
        int gx = 0;
        int gy = 0;
        assertEquals(1000000, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case107() {
        int sx = 0;
        int sy = 0;
        int gx = 0;
        int gy = -5;
        assertEquals(7, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case108() {
        int sx = 0;
        int sy = 1;
        int gx = 0;
        int gy = 0;
        assertEquals(3, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case109() {
        int sx = 12345;
        int sy = -12345;
        int gx = 12245;
        int gy = -12444;
        assertEquals(101, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case110() {
        int sx = 0;
        int sy = 0;
        int gx = -30;
        int gy = -27;
        assertEquals(31, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case111() {
        int sx = -1000000;
        int sy = -1000000;
        int gx = 999991;
        int gy = -892344;
        assertEquals(1999992, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case112() {
        int sx = -16563;
        int sy = -15432;
        int gx = 875581;
        int gy = 509110;
        assertEquals(892144, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case113() {
        int sx = 100;
        int sy = 101;
        int gx = -100000;
        int gy = -99999;
        assertEquals(100100, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case114() {
        int sx = -487617;
        int sy = 826524;
        int gx = 892309;
        int gy = -918049;
        assertEquals(1744575, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case115() {
        int sx = 0;
        int sy = 0;
        int gx = 19233;
        int gy = 9382;
        assertEquals(19234, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case116() {
        int sx = -1000000;
        int sy = 1000000;
        int gx = 999997;
        int gy = -1000000;
        assertEquals(2000002, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case117() {
        int sx = 0;
        int sy = 0;
        int gx = -1;
        int gy = -2;
        assertEquals(4, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case118() {
        int sx = 960864;
        int sy = 17412;
        int gx = -825303;
        int gy = -522786;
        assertEquals(1786168, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case119() {
        int sx = 0;
        int sy = 0;
        int gx = 4;
        int gy = 2;
        assertEquals(4, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case120() {
        int sx = -1000000;
        int sy = -1000000;
        int gx = 999999;
        int gy = 999998;
        assertEquals(2000000, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case121() {
        int sx = 0;
        int sy = 0;
        int gx = 8;
        int gy = -5;
        assertEquals(9, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case122() {
        int sx = 0;
        int sy = 0;
        int gx = 10;
        int gy = -20;
        assertEquals(20, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case123() {
        int sx = 23422;
        int sy = 23423;
        int gx = -23423;
        int gy = -23492;
        assertEquals(46915, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case124() {
        int sx = 0;
        int sy = 0;
        int gx = 5;
        int gy = 2;
        assertEquals(6, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case125() {
        int sx = 0;
        int sy = 0;
        int gx = 2;
        int gy = 0;
        assertEquals(2, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case126() {
        int sx = 0;
        int sy = 0;
        int gx = -1;
        int gy = -4;
        assertEquals(6, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case127() {
        int sx = 2;
        int sy = 3;
        int gx = 0;
        int gy = 0;
        assertEquals(5, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case128() {
        int sx = 0;
        int sy = 0;
        int gx = -2;
        int gy = 0;
        assertEquals(2, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case129() {
        int sx = 28703;
        int sy = 31322;
        int gx = 23811;
        int gy = 30333;
        assertEquals(4893, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case130() {
        int sx = 100;
        int sy = 0;
        int gx = 0;
        int gy = 0;
        assertEquals(100, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case131() {
        int sx = 368690;
        int sy = -479941;
        int gx = -102237;
        int gy = 513926;
        assertEquals(993867, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case132() {
        int sx = -999998;
        int sy = 1;
        int gx = 999998;
        int gy = -1;
        assertEquals(1999996, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case133() {
        int sx = 5;
        int sy = 5;
        int gx = 8;
        int gy = 4;
        assertEquals(3, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case134() {
        int sx = 0;
        int sy = 0;
        int gx = 7;
        int gy = 0;
        assertEquals(8, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case135() {
        int sx = 0;
        int sy = 0;
        int gx = 30;
        int gy = -31;
        assertEquals(33, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case136() {
        int sx = -99999;
        int sy = -99998;
        int gx = 99999;
        int gy = 99999;
        assertEquals(199999, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case137() {
        int sx = 0;
        int sy = 0;
        int gx = 3;
        int gy = 1;
        assertEquals(3, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case138() {
        int sx = 0;
        int sy = 0;
        int gx = 1;
        int gy = 1;
        assertEquals(1, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case139() {
        int sx = 1;
        int sy = 1;
        int gx = 0;
        int gy = 0;
        assertEquals(1, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case140() {
        int sx = 0;
        int sy = 2;
        int gx = 0;
        int gy = 0;
        assertEquals(2, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case141() {
        int sx = 1;
        int sy = 1;
        int gx = 5;
        int gy = 3;
        assertEquals(4, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case142() {
        int sx = 0;
        int sy = -3;
        int gx = 0;
        int gy = -5;
        assertEquals(2, silverdistance.minSteps(sx, sy, gx, gy));
    }

    @Test
    public void case143() {
        int sx = 0;
        int sy = 0;
        int gx = -4;
        int gy = -1;
        assertEquals(5, silverdistance.minSteps(sx, sy, gx, gy));
    }

}
