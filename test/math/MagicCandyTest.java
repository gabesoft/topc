package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class MagicCandyTest {
    MagicCandy magiccandy = new MagicCandy();

    @Test
    public void case1() {
        int n = 5;
        assertEquals(5, magiccandy.whichOne(n));
    }

    @Test
    public void case2() {
        int n = 9;
        assertEquals(7, magiccandy.whichOne(n));
    }

    @Test
    public void case3() {
        int n = 20;
        assertEquals(17, magiccandy.whichOne(n));
    }

    @Test
    public void case4() {
        int n = 5265;
        assertEquals(5257, magiccandy.whichOne(n));
    }

    @Test
    public void case5() {
        int n = 20111223;
        assertEquals(20110741, magiccandy.whichOne(n));
    }

    @Test
    public void case6() {
        int n = 1;
        assertEquals(1, magiccandy.whichOne(n));
    }

    @Test
    public void case7() {
        int n = 977;
        assertEquals(962, magiccandy.whichOne(n));
    }

    @Test
    public void case8() {
        int n = 999;
        assertEquals(993, magiccandy.whichOne(n));
    }

    @Test
    public void case9() {
        int n = 407;
        assertEquals(401, magiccandy.whichOne(n));
    }

    @Test
    public void case10() {
        int n = 655;
        assertEquals(651, magiccandy.whichOne(n));
    }

    @Test
    public void case11() {
        int n = 819;
        assertEquals(813, magiccandy.whichOne(n));
    }

    @Test
    public void case12() {
        int n = 717;
        assertEquals(703, magiccandy.whichOne(n));
    }

    @Test
    public void case13() {
        int n = 201;
        assertEquals(197, magiccandy.whichOne(n));
    }

    @Test
    public void case14() {
        int n = 773;
        assertEquals(757, magiccandy.whichOne(n));
    }

    @Test
    public void case15() {
        int n = 354;
        assertEquals(343, magiccandy.whichOne(n));
    }

    @Test
    public void case16() {
        int n = 525;
        assertEquals(507, magiccandy.whichOne(n));
    }

    @Test
    public void case17() {
        int n = 279;
        assertEquals(273, magiccandy.whichOne(n));
    }

    @Test
    public void case18() {
        int n = 172;
        assertEquals(170, magiccandy.whichOne(n));
    }

    @Test
    public void case19() {
        int n = 103;
        assertEquals(101, magiccandy.whichOne(n));
    }

    @Test
    public void case20() {
        int n = 473;
        assertEquals(463, magiccandy.whichOne(n));
    }

    @Test
    public void case21() {
        int n = 50;
        assertEquals(50, magiccandy.whichOne(n));
    }

    @Test
    public void case22() {
        int n = 991;
        assertEquals(962, magiccandy.whichOne(n));
    }

    @Test
    public void case23() {
        int n = 446;
        assertEquals(442, magiccandy.whichOne(n));
    }

    @Test
    public void case24() {
        int n = 592;
        assertEquals(577, magiccandy.whichOne(n));
    }

    @Test
    public void case25() {
        int n = 226;
        assertEquals(226, magiccandy.whichOne(n));
    }

    @Test
    public void case26() {
        int n = 496;
        assertEquals(485, magiccandy.whichOne(n));
    }

    @Test
    public void case27() {
        int n = 954;
        assertEquals(931, magiccandy.whichOne(n));
    }

    @Test
    public void case28() {
        int n = 611;
        assertEquals(601, magiccandy.whichOne(n));
    }

    @Test
    public void case29() {
        int n = 722;
        assertEquals(703, magiccandy.whichOne(n));
    }

    @Test
    public void case30() {
        int n = 361;
        assertEquals(343, magiccandy.whichOne(n));
    }

    @Test
    public void case31() {
        int n = 254;
        assertEquals(241, magiccandy.whichOne(n));
    }

    @Test
    public void case32() {
        int n = 736;
        assertEquals(730, magiccandy.whichOne(n));
    }

    @Test
    public void case33() {
        int n = 426;
        assertEquals(421, magiccandy.whichOne(n));
    }

    @Test
    public void case34() {
        int n = 443;
        assertEquals(442, magiccandy.whichOne(n));
    }

    @Test
    public void case35() {
        int n = 869;
        assertEquals(842, magiccandy.whichOne(n));
    }

    @Test
    public void case36() {
        int n = 587;
        assertEquals(577, magiccandy.whichOne(n));
    }

    @Test
    public void case37() {
        int n = 19;
        assertEquals(17, magiccandy.whichOne(n));
    }

    @Test
    public void case38() {
        int n = 419;
        assertEquals(401, magiccandy.whichOne(n));
    }

    @Test
    public void case39() {
        int n = 20;
        assertEquals(17, magiccandy.whichOne(n));
    }

    @Test
    public void case40() {
        int n = 648;
        assertEquals(626, magiccandy.whichOne(n));
    }

    @Test
    public void case41() {
        int n = 335;
        assertEquals(325, magiccandy.whichOne(n));
    }

    @Test
    public void case42() {
        int n = 72;
        assertEquals(65, magiccandy.whichOne(n));
    }

    @Test
    public void case43() {
        int n = 251;
        assertEquals(241, magiccandy.whichOne(n));
    }

    @Test
    public void case44() {
        int n = 674;
        assertEquals(651, magiccandy.whichOne(n));
    }

    @Test
    public void case45() {
        int n = 239;
        assertEquals(226, magiccandy.whichOne(n));
    }

    @Test
    public void case46() {
        int n = 919;
        assertEquals(901, magiccandy.whichOne(n));
    }

    @Test
    public void case47() {
        int n = 631434;
        assertEquals(631231, magiccandy.whichOne(n));
    }

    @Test
    public void case48() {
        int n = 573880;
        assertEquals(573807, magiccandy.whichOne(n));
    }

    @Test
    public void case49() {
        int n = 218681;
        assertEquals(218557, magiccandy.whichOne(n));
    }

    @Test
    public void case50() {
        int n = 81607;
        assertEquals(81511, magiccandy.whichOne(n));
    }

    @Test
    public void case51() {
        int n = 184094;
        assertEquals(184042, magiccandy.whichOne(n));
    }

    @Test
    public void case52() {
        int n = 41130;
        assertEquals(41007, magiccandy.whichOne(n));
    }

    @Test
    public void case53() {
        int n = 212195;
        assertEquals(212061, magiccandy.whichOne(n));
    }

    @Test
    public void case54() {
        int n = 841452;
        assertEquals(840890, magiccandy.whichOne(n));
    }

    @Test
    public void case55() {
        int n = 716519;
        assertEquals(715717, magiccandy.whichOne(n));
    }

    @Test
    public void case56() {
        int n = 32472;
        assertEquals(32401, magiccandy.whichOne(n));
    }

    @Test
    public void case57() {
        int n = 949657;
        assertEquals(949651, magiccandy.whichOne(n));
    }

    @Test
    public void case58() {
        int n = 565925;
        assertEquals(565505, magiccandy.whichOne(n));
    }

    @Test
    public void case59() {
        int n = 830725;
        assertEquals(829922, magiccandy.whichOne(n));
    }

    @Test
    public void case60() {
        int n = 280746;
        assertEquals(280371, magiccandy.whichOne(n));
    }

    @Test
    public void case61() {
        int n = 651694;
        assertEquals(651250, magiccandy.whichOne(n));
    }

    @Test
    public void case62() {
        int n = 601368;
        assertEquals(600626, magiccandy.whichOne(n));
    }

    @Test
    public void case63() {
        int n = 536028;
        assertEquals(535825, magiccandy.whichOne(n));
    }

    @Test
    public void case64() {
        int n = 19751;
        assertEquals(19741, magiccandy.whichOne(n));
    }

    @Test
    public void case65() {
        int n = 771447;
        assertEquals(770885, magiccandy.whichOne(n));
    }

    @Test
    public void case66() {
        int n = 772625;
        assertEquals(771763, magiccandy.whichOne(n));
    }

    @Test
    public void case67() {
        int n = 216981;
        assertEquals(216691, magiccandy.whichOne(n));
    }

    @Test
    public void case68() {
        int n = 710335;
        assertEquals(709807, magiccandy.whichOne(n));
    }

    @Test
    public void case69() {
        int n = 979921;
        assertEquals(979111, magiccandy.whichOne(n));
    }

    @Test
    public void case70() {
        int n = 179520;
        assertEquals(179353, magiccandy.whichOne(n));
    }

    @Test
    public void case71() {
        int n = 13661;
        assertEquals(13573, magiccandy.whichOne(n));
    }

    @Test
    public void case72() {
        int n = 259393;
        assertEquals(259082, magiccandy.whichOne(n));
    }

    @Test
    public void case73() {
        int n = 292057;
        assertEquals(291601, magiccandy.whichOne(n));
    }

    @Test
    public void case74() {
        int n = 526906;
        assertEquals(526351, magiccandy.whichOne(n));
    }

    @Test
    public void case75() {
        int n = 21284;
        assertEquals(21171, magiccandy.whichOne(n));
    }

    @Test
    public void case76() {
        int n = 690533;
        assertEquals(689731, magiccandy.whichOne(n));
    }

    @Test
    public void case77() {
        int n = 996785;
        assertEquals(996005, magiccandy.whichOne(n));
    }

    @Test
    public void case78() {
        int n = 898420;
        assertEquals(897757, magiccandy.whichOne(n));
    }

    @Test
    public void case79() {
        int n = 106526;
        assertEquals(106277, magiccandy.whichOne(n));
    }

    @Test
    public void case80() {
        int n = 86403;
        assertEquals(86143, magiccandy.whichOne(n));
    }

    @Test
    public void case81() {
        int n = 498306;
        assertEquals(497731, magiccandy.whichOne(n));
    }

    @Test
    public void case82() {
        int n = 645900;
        assertEquals(645613, magiccandy.whichOne(n));
    }

    @Test
    public void case83() {
        int n = 880133;
        assertEquals(879845, magiccandy.whichOne(n));
    }

    @Test
    public void case84() {
        int n = 392602;
        assertEquals(392503, magiccandy.whichOne(n));
    }

    @Test
    public void case85() {
        int n = 961461;
        assertEquals(961381, magiccandy.whichOne(n));
    }

    @Test
    public void case86() {
        int n = 42176;
        assertEquals(42026, magiccandy.whichOne(n));
    }

    @Test
    public void case87() {
        int n = 139493627;
        assertEquals(139487911, magiccandy.whichOne(n));
    }

    @Test
    public void case88() {
        int n = 105126837;
        assertEquals(105124010, magiccandy.whichOne(n));
    }

    @Test
    public void case89() {
        int n = 460216916;
        assertEquals(460209757, magiccandy.whichOne(n));
    }

    @Test
    public void case90() {
        int n = 685443914;
        assertEquals(685418581, magiccandy.whichOne(n));
    }

    @Test
    public void case91() {
        int n = 792615630;
        assertEquals(792591410, magiccandy.whichOne(n));
    }

    @Test
    public void case92() {
        int n = 702309530;
        assertEquals(702303002, magiccandy.whichOne(n));
    }

    @Test
    public void case93() {
        int n = 841851564;
        assertEquals(841841211, magiccandy.whichOne(n));
    }

    @Test
    public void case94() {
        int n = 444959509;
        assertEquals(444956837, magiccandy.whichOne(n));
    }

    @Test
    public void case95() {
        int n = 489967884;
        assertEquals(489958226, magiccandy.whichOne(n));
    }

    @Test
    public void case96() {
        int n = 61948395;
        assertEquals(61944771, magiccandy.whichOne(n));
    }

    @Test
    public void case97() {
        int n = 31483581;
        assertEquals(31483322, magiccandy.whichOne(n));
    }

    @Test
    public void case98() {
        int n = 358620543;
        assertEquals(358609970, magiccandy.whichOne(n));
    }

    @Test
    public void case99() {
        int n = 99898192;
        assertEquals(99890031, magiccandy.whichOne(n));
    }

    @Test
    public void case100() {
        int n = 71209241;
        assertEquals(71208283, magiccandy.whichOne(n));
    }

    @Test
    public void case101() {
        int n = 166207090;
        assertEquals(166203665, magiccandy.whichOne(n));
    }

    @Test
    public void case102() {
        int n = 525732570;
        assertEquals(525716113, magiccandy.whichOne(n));
    }

    @Test
    public void case103() {
        int n = 84501369;
        assertEquals(84492865, magiccandy.whichOne(n));
    }

    @Test
    public void case104() {
        int n = 382893046;
        assertEquals(382887057, magiccandy.whichOne(n));
    }

    @Test
    public void case105() {
        int n = 384179516;
        assertEquals(384160001, magiccandy.whichOne(n));
    }

    @Test
    public void case106() {
        int n = 573649693;
        assertEquals(573626451, magiccandy.whichOne(n));
    }

    @Test
    public void case107() {
        int n = 702770728;
        assertEquals(702753591, magiccandy.whichOne(n));
    }

    @Test
    public void case108() {
        int n = 13275450;
        assertEquals(13275093, magiccandy.whichOne(n));
    }

    @Test
    public void case109() {
        int n = 288437904;
        assertEquals(288422290, magiccandy.whichOne(n));
    }

    @Test
    public void case110() {
        int n = 115200608;
        assertEquals(115197290, magiccandy.whichOne(n));
    }

    @Test
    public void case111() {
        int n = 145668933;
        assertEquals(145660762, magiccandy.whichOne(n));
    }

    @Test
    public void case112() {
        int n = 331963137;
        assertEquals(331950181, magiccandy.whichOne(n));
    }

    @Test
    public void case113() {
        int n = 16264807;
        assertEquals(16261057, magiccandy.whichOne(n));
    }

    @Test
    public void case114() {
        int n = 368394082;
        assertEquals(368390443, magiccandy.whichOne(n));
    }

    @Test
    public void case115() {
        int n = 391420538;
        assertEquals(391406657, magiccandy.whichOne(n));
    }

    @Test
    public void case116() {
        int n = 638670155;
        assertEquals(638648713, magiccandy.whichOne(n));
    }

    @Test
    public void case117() {
        int n = 649752508;
        assertEquals(649740101, magiccandy.whichOne(n));
    }

    @Test
    public void case118() {
        int n = 446313987;
        assertEquals(446307877, magiccandy.whichOne(n));
    }

    @Test
    public void case119() {
        int n = 172134326;
        assertEquals(172121281, magiccandy.whichOne(n));
    }

    @Test
    public void case120() {
        int n = 543125116;
        assertEquals(543123026, magiccandy.whichOne(n));
    }

    @Test
    public void case121() {
        int n = 674531602;
        assertEquals(674518813, magiccandy.whichOne(n));
    }

    @Test
    public void case122() {
        int n = 218048458;
        assertEquals(218034757, magiccandy.whichOne(n));
    }

    @Test
    public void case123() {
        int n = 513753516;
        assertEquals(513747557, magiccandy.whichOne(n));
    }

    @Test
    public void case124() {
        int n = 783235033;
        assertEquals(783216197, magiccandy.whichOne(n));
    }

    @Test
    public void case125() {
        int n = 927116012;
        assertEquals(927111153, magiccandy.whichOne(n));
    }

    @Test
    public void case126() {
        int n = 987718240;
        assertEquals(987687757, magiccandy.whichOne(n));
    }

    @Test
    public void case127() {
        int n = 1000000000;
        assertEquals(999982507, magiccandy.whichOne(n));
    }

    @Test
    public void case128() {
        int n = 998987654;
        assertEquals(998970843, magiccandy.whichOne(n));
    }

    @Test
    public void case129() {
        int n = 555555555;
        assertEquals(555544901, magiccandy.whichOne(n));
    }

    @Test
    public void case130() {
        int n = 999998797;
        assertEquals(999982507, magiccandy.whichOne(n));
    }

    @Test
    public void case131() {
        int n = 999982506;
        assertEquals(999950885, magiccandy.whichOne(n));
    }

    @Test
    public void case132() {
        int n = 987654321;
        assertEquals(987624903, magiccandy.whichOne(n));
    }

    @Test
    public void case133() {
        int n = 999999999;
        assertEquals(999982507, magiccandy.whichOne(n));
    }

    @Test
    public void case134() {
        int n = 99999545;
        assertEquals(99990001, magiccandy.whichOne(n));
    }

    @Test
    public void case135() {
        int n = 999982507;
        assertEquals(999982507, magiccandy.whichOne(n));
    }

    @Test
    public void case136() {
        int n = 100000000;
        assertEquals(99990001, magiccandy.whichOne(n));
    }

    @Test
    public void case137() {
        int n = 999982508;
        assertEquals(999982507, magiccandy.whichOne(n));
    }

    @Test
    public void case138() {
        int n = 999999998;
        assertEquals(999982507, magiccandy.whichOne(n));
    }

    @Test
    public void case139() {
        int n = 900000000;
        assertEquals(899970001, magiccandy.whichOne(n));
    }

    @Test
    public void case140() {
        int n = 999999996;
        assertEquals(999982507, magiccandy.whichOne(n));
    }

    @Test
    public void case141() {
        int n = 27;
        assertEquals(26, magiccandy.whichOne(n));
    }

    @Test
    public void case142() {
        int n = 999980884;
        assertEquals(999950885, magiccandy.whichOne(n));
    }

    @Test
    public void case143() {
        int n = 99999;
        assertEquals(99857, magiccandy.whichOne(n));
    }

    @Test
    public void case144() {
        int n = 12896;
        assertEquals(12883, magiccandy.whichOne(n));
    }

    @Test
    public void case145() {
        int n = 3;
        assertEquals(3, magiccandy.whichOne(n));
    }

    @Test
    public void case146() {
        int n = 10;
        assertEquals(10, magiccandy.whichOne(n));
    }

    @Test
    public void case147() {
        int n = 257000001;
        assertEquals(256992962, magiccandy.whichOne(n));
    }

    @Test
    public void case148() {
        int n = 10000;
        assertEquals(9901, magiccandy.whichOne(n));
    }

    @Test
    public void case149() {
        int n = 91;
        assertEquals(91, magiccandy.whichOne(n));
    }

    @Test
    public void case150() {
        int n = 4;
        assertEquals(3, magiccandy.whichOne(n));
    }

    @Test
    public void case151() {
        int n = 999999;
        assertEquals(999001, magiccandy.whichOne(n));
    }

    @Test
    public void case152() {
        int n = 2;
        assertEquals(2, magiccandy.whichOne(n));
    }

    @Test
    public void case153() {
        int n = 999950884;
        assertEquals(999919263, magiccandy.whichOne(n));
    }

    @Test
    public void case154() {
        int n = 998998998;
        assertEquals(998970843, magiccandy.whichOne(n));
    }

    @Test
    public void case155() {
        int n = 777777777;
        assertEquals(777768433, magiccandy.whichOne(n));
    }

}
