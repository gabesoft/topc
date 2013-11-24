package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class LockersDivOneTest {
    LockersDivOne lockersdivone = new LockersDivOne();

    @Test
    public void case1() {
        int N = 9;
        assertEquals(6, lockersdivone.lastOpened(N));
    }

    @Test
    public void case2() {
        int N = 42;
        assertEquals(42, lockersdivone.lastOpened(N));
    }

    @Test
    public void case3() {
        int N = 314;
        assertEquals(282, lockersdivone.lastOpened(N));
    }

    @Test
    public void case4() {
        int N = 2000000;
        assertEquals(1999854, lockersdivone.lastOpened(N));
    }

    @Test
    public void case5() {
        int N = 1;
        assertEquals(1, lockersdivone.lastOpened(N));
    }

    @Test
    public void case6() {
        int N = 2;
        assertEquals(2, lockersdivone.lastOpened(N));
    }

    @Test
    public void case7() {
        int N = 3;
        assertEquals(2, lockersdivone.lastOpened(N));
    }

    @Test
    public void case8() {
        int N = 4;
        assertEquals(4, lockersdivone.lastOpened(N));
    }

    @Test
    public void case9() {
        int N = 5;
        assertEquals(4, lockersdivone.lastOpened(N));
    }

    @Test
    public void case10() {
        int N = 6;
        assertEquals(6, lockersdivone.lastOpened(N));
    }

    @Test
    public void case11() {
        int N = 7;
        assertEquals(6, lockersdivone.lastOpened(N));
    }

    @Test
    public void case12() {
        int N = 8;
        assertEquals(6, lockersdivone.lastOpened(N));
    }

    @Test
    public void case13() {
        int N = 10;
        assertEquals(10, lockersdivone.lastOpened(N));
    }

    @Test
    public void case14() {
        int N = 11;
        assertEquals(10, lockersdivone.lastOpened(N));
    }

    @Test
    public void case15() {
        int N = 12;
        assertEquals(12, lockersdivone.lastOpened(N));
    }

    @Test
    public void case16() {
        int N = 17;
        assertEquals(12, lockersdivone.lastOpened(N));
    }

    @Test
    public void case17() {
        int N = 29;
        assertEquals(22, lockersdivone.lastOpened(N));
    }

    @Test
    public void case18() {
        int N = 57;
        assertEquals(48, lockersdivone.lastOpened(N));
    }

    @Test
    public void case19() {
        int N = 101;
        assertEquals(82, lockersdivone.lastOpened(N));
    }

    @Test
    public void case20() {
        int N = 321;
        assertEquals(282, lockersdivone.lastOpened(N));
    }

    @Test
    public void case21() {
        int N = 717;
        assertEquals(672, lockersdivone.lastOpened(N));
    }

    @Test
    public void case22() {
        int N = 989;
        assertEquals(930, lockersdivone.lastOpened(N));
    }

    @Test
    public void case23() {
        int N = 1631;
        assertEquals(1558, lockersdivone.lastOpened(N));
    }

    @Test
    public void case24() {
        int N = 3053;
        assertEquals(2940, lockersdivone.lastOpened(N));
    }

    @Test
    public void case25() {
        int N = 3971;
        assertEquals(3814, lockersdivone.lastOpened(N));
    }

    @Test
    public void case26() {
        int N = 6833;
        assertEquals(6534, lockersdivone.lastOpened(N));
    }

    @Test
    public void case27() {
        int N = 25739;
        assertEquals(25198, lockersdivone.lastOpened(N));
    }

    @Test
    public void case28() {
        int N = 74021;
        assertEquals(73272, lockersdivone.lastOpened(N));
    }

    @Test
    public void case29() {
        int N = 94277;
        assertEquals(93274, lockersdivone.lastOpened(N));
    }

    @Test
    public void case30() {
        int N = 118679;
        assertEquals(117552, lockersdivone.lastOpened(N));
    }

    @Test
    public void case31() {
        int N = 199661;
        assertEquals(197988, lockersdivone.lastOpened(N));
    }

    @Test
    public void case32() {
        int N = 345993;
        assertEquals(343920, lockersdivone.lastOpened(N));
    }

    @Test
    public void case33() {
        int N = 460181;
        assertEquals(457798, lockersdivone.lastOpened(N));
    }

    @Test
    public void case34() {
        int N = 735561;
        assertEquals(732612, lockersdivone.lastOpened(N));
    }

    @Test
    public void case35() {
        int N = 765317;
        assertEquals(762090, lockersdivone.lastOpened(N));
    }

    @Test
    public void case36() {
        int N = 833267;
        assertEquals(828048, lockersdivone.lastOpened(N));
    }

    @Test
    public void case37() {
        int N = 802;
        assertEquals(802, lockersdivone.lastOpened(N));
    }

    @Test
    public void case38() {
        int N = 7114;
        assertEquals(7114, lockersdivone.lastOpened(N));
    }

    @Test
    public void case39() {
        int N = 19872;
        assertEquals(19872, lockersdivone.lastOpened(N));
    }

    @Test
    public void case40() {
        int N = 39018;
        assertEquals(39018, lockersdivone.lastOpened(N));
    }

    @Test
    public void case41() {
        int N = 64632;
        assertEquals(64632, lockersdivone.lastOpened(N));
    }

    @Test
    public void case42() {
        int N = 96312;
        assertEquals(96312, lockersdivone.lastOpened(N));
    }

    @Test
    public void case43() {
        int N = 134898;
        assertEquals(134898, lockersdivone.lastOpened(N));
    }

    @Test
    public void case44() {
        int N = 179062;
        assertEquals(179062, lockersdivone.lastOpened(N));
    }

    @Test
    public void case45() {
        int N = 230532;
        assertEquals(230532, lockersdivone.lastOpened(N));
    }

    @Test
    public void case46() {
        int N = 286974;
        assertEquals(286974, lockersdivone.lastOpened(N));
    }

    @Test
    public void case47() {
        int N = 351210;
        assertEquals(351210, lockersdivone.lastOpened(N));
    }

    @Test
    public void case48() {
        int N = 420942;
        assertEquals(420942, lockersdivone.lastOpened(N));
    }

    @Test
    public void case49() {
        int N = 497958;
        assertEquals(497958, lockersdivone.lastOpened(N));
    }

    @Test
    public void case50() {
        int N = 580218;
        assertEquals(580218, lockersdivone.lastOpened(N));
    }

    @Test
    public void case51() {
        int N = 669874;
        assertEquals(669874, lockersdivone.lastOpened(N));
    }

    @Test
    public void case52() {
        int N = 765322;
        assertEquals(765322, lockersdivone.lastOpened(N));
    }

    @Test
    public void case53() {
        int N = 866842;
        assertEquals(866842, lockersdivone.lastOpened(N));
    }

    @Test
    public void case54() {
        int N = 975678;
        assertEquals(975678, lockersdivone.lastOpened(N));
    }

    @Test
    public void case55() {
        int N = 1088970;
        assertEquals(1088970, lockersdivone.lastOpened(N));
    }

    @Test
    public void case56() {
        int N = 1210102;
        assertEquals(1210102, lockersdivone.lastOpened(N));
    }

    @Test
    public void case57() {
        int N = 1338958;
        assertEquals(1338958, lockersdivone.lastOpened(N));
    }

    @Test
    public void case58() {
        int N = 1471258;
        assertEquals(1471258, lockersdivone.lastOpened(N));
    }

    @Test
    public void case59() {
        int N = 1611898;
        assertEquals(1611898, lockersdivone.lastOpened(N));
    }

    @Test
    public void case60() {
        int N = 1757172;
        assertEquals(1757172, lockersdivone.lastOpened(N));
    }

    @Test
    public void case61() {
        int N = 1912002;
        assertEquals(1912002, lockersdivone.lastOpened(N));
    }

    @Test
    public void case62() {
        int N = 1991418;
        assertEquals(1991418, lockersdivone.lastOpened(N));
    }

    @Test
    public void case63() {
        int N = 1875321;
        assertEquals(1871958, lockersdivone.lastOpened(N));
    }

    @Test
    public void case64() {
        int N = 1920904;
        assertEquals(1919502, lockersdivone.lastOpened(N));
    }

    @Test
    public void case65() {
        int N = 1896379;
        assertEquals(1894428, lockersdivone.lastOpened(N));
    }

    @Test
    public void case66() {
        int N = 1244146;
        assertEquals(1242828, lockersdivone.lastOpened(N));
    }

    @Test
    public void case67() {
        int N = 454224;
        assertEquals(453102, lockersdivone.lastOpened(N));
    }

    @Test
    public void case68() {
        int N = 1167427;
        assertEquals(1167270, lockersdivone.lastOpened(N));
    }

    @Test
    public void case69() {
        int N = 528500;
        assertEquals(526618, lockersdivone.lastOpened(N));
    }

    @Test
    public void case70() {
        int N = 1333468;
        assertEquals(1330978, lockersdivone.lastOpened(N));
    }

    @Test
    public void case71() {
        int N = 422925;
        assertEquals(422602, lockersdivone.lastOpened(N));
    }

    @Test
    public void case72() {
        int N = 1644440;
        assertEquals(1642932, lockersdivone.lastOpened(N));
    }

    @Test
    public void case73() {
        int N = 256900;
        assertEquals(256788, lockersdivone.lastOpened(N));
    }

    @Test
    public void case74() {
        int N = 809308;
        assertEquals(809280, lockersdivone.lastOpened(N));
    }

    @Test
    public void case75() {
        int N = 1033672;
        assertEquals(1032658, lockersdivone.lastOpened(N));
    }

    @Test
    public void case76() {
        int N = 39409;
        assertEquals(39300, lockersdivone.lastOpened(N));
    }

    @Test
    public void case77() {
        int N = 1865925;
        assertEquals(1864470, lockersdivone.lastOpened(N));
    }

    @Test
    public void case78() {
        int N = 72827;
        assertEquals(72718, lockersdivone.lastOpened(N));
    }

    @Test
    public void case79() {
        int N = 1793954;
        assertEquals(1792512, lockersdivone.lastOpened(N));
    }

    @Test
    public void case80() {
        int N = 22458;
        assertEquals(22278, lockersdivone.lastOpened(N));
    }

    @Test
    public void case81() {
        int N = 1368982;
        assertEquals(1368960, lockersdivone.lastOpened(N));
    }

    @Test
    public void case82() {
        int N = 255031;
        assertEquals(254434, lockersdivone.lastOpened(N));
    }

    @Test
    public void case83() {
        int N = 275027;
        assertEquals(274174, lockersdivone.lastOpened(N));
    }

    @Test
    public void case84() {
        int N = 23537;
        assertEquals(23502, lockersdivone.lastOpened(N));
    }

    @Test
    public void case85() {
        int N = 1280635;
        assertEquals(1280352, lockersdivone.lastOpened(N));
    }

    @Test
    public void case86() {
        int N = 981867;
        assertEquals(981690, lockersdivone.lastOpened(N));
    }

    @Test
    public void case87() {
        int N = 1806794;
        assertEquals(1806132, lockersdivone.lastOpened(N));
    }

    @Test
    public void case88() {
        int N = 70235;
        assertEquals(70174, lockersdivone.lastOpened(N));
    }

    @Test
    public void case89() {
        int N = 1378524;
        assertEquals(1378188, lockersdivone.lastOpened(N));
    }

    @Test
    public void case90() {
        int N = 1860626;
        assertEquals(1859338, lockersdivone.lastOpened(N));
    }

    @Test
    public void case91() {
        int N = 670982;
        assertEquals(670758, lockersdivone.lastOpened(N));
    }

    @Test
    public void case92() {
        int N = 1482497;
        assertEquals(1481052, lockersdivone.lastOpened(N));
    }

    @Test
    public void case93() {
        int N = 423800;
        assertEquals(422602, lockersdivone.lastOpened(N));
    }

    @Test
    public void case94() {
        int N = 1520612;
        assertEquals(1518798, lockersdivone.lastOpened(N));
    }

    @Test
    public void case95() {
        int N = 1638684;
        assertEquals(1637982, lockersdivone.lastOpened(N));
    }

    @Test
    public void case96() {
        int N = 1958076;
        assertEquals(1956238, lockersdivone.lastOpened(N));
    }

    @Test
    public void case97() {
        int N = 11386;
        assertEquals(11302, lockersdivone.lastOpened(N));
    }

    @Test
    public void case98() {
        int N = 1345687;
        assertEquals(1345462, lockersdivone.lastOpened(N));
    }

    @Test
    public void case99() {
        int N = 974465;
        assertEquals(972108, lockersdivone.lastOpened(N));
    }

    @Test
    public void case100() {
        int N = 56151;
        assertEquals(56010, lockersdivone.lastOpened(N));
    }

    @Test
    public void case101() {
        int N = 1500836;
        assertEquals(1499262, lockersdivone.lastOpened(N));
    }

    @Test
    public void case102() {
        int N = 784431;
        assertEquals(784200, lockersdivone.lastOpened(N));
    }

    @Test
    public void case103() {
        int N = 1705022;
        assertEquals(1702080, lockersdivone.lastOpened(N));
    }

    @Test
    public void case104() {
        int N = 1240589;
        assertEquals(1240572, lockersdivone.lastOpened(N));
    }

    @Test
    public void case105() {
        int N = 1768731;
        assertEquals(1767222, lockersdivone.lastOpened(N));
    }

    @Test
    public void case106() {
        int N = 964835;
        assertEquals(963798, lockersdivone.lastOpened(N));
    }

    @Test
    public void case107() {
        int N = 1792140;
        assertEquals(1790982, lockersdivone.lastOpened(N));
    }

    @Test
    public void case108() {
        int N = 1906351;
        assertEquals(1903462, lockersdivone.lastOpened(N));
    }

    @Test
    public void case109() {
        int N = 889195;
        assertEquals(888330, lockersdivone.lastOpened(N));
    }

    @Test
    public void case110() {
        int N = 1768921;
        assertEquals(1767222, lockersdivone.lastOpened(N));
    }

    @Test
    public void case111() {
        int N = 1121613;
        assertEquals(1120368, lockersdivone.lastOpened(N));
    }

    @Test
    public void case112() {
        int N = 1556163;
        assertEquals(1555558, lockersdivone.lastOpened(N));
    }

    @Test
    public void case113() {
        int N = 1979797;
        assertEquals(1976482, lockersdivone.lastOpened(N));
    }

    @Test
    public void case114() {
        int N = 1999999;
        assertEquals(1999854, lockersdivone.lastOpened(N));
    }

    @Test
    public void case115() {
        int N = 1999854;
        assertEquals(1999854, lockersdivone.lastOpened(N));
    }

    @Test
    public void case116() {
        int N = 1876437;
        assertEquals(1875588, lockersdivone.lastOpened(N));
    }

    @Test
    public void case117() {
        int N = 134567;
        assertEquals(133702, lockersdivone.lastOpened(N));
    }

    @Test
    public void case118() {
        int N = 1234561;
        assertEquals(1232448, lockersdivone.lastOpened(N));
    }

    @Test
    public void case119() {
        int N = 619931;
        assertEquals(619902, lockersdivone.lastOpened(N));
    }

    @Test
    public void case120() {
        int N = 1999123;
        assertEquals(1998852, lockersdivone.lastOpened(N));
    }

    @Test
    public void case121() {
        int N = 1999923;
        assertEquals(1999854, lockersdivone.lastOpened(N));
    }

    @Test
    public void case122() {
        int N = 1999853;
        assertEquals(1998852, lockersdivone.lastOpened(N));
    }

    @Test
    public void case123() {
        int N = 18468;
        assertEquals(18414, lockersdivone.lastOpened(N));
    }

    @Test
    public void case124() {
        int N = 1987567;
        assertEquals(1985988, lockersdivone.lastOpened(N));
    }

    @Test
    public void case125() {
        int N = 55;
        assertEquals(48, lockersdivone.lastOpened(N));
    }

    @Test
    public void case126() {
        int N = 100;
        assertEquals(82, lockersdivone.lastOpened(N));
    }

}
