package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class FruitTreesTest {
    FruitTrees fruittrees = new FruitTrees();

    @Test
    public void case1() {
        int apple = 1;
        int kiwi = 5;
        int grape = 8;
        assertEquals(0, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case2() {
        int apple = 3;
        int kiwi = 3;
        int grape = 6;
        assertEquals(1, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case3() {
        int apple = 40;
        int kiwi = 30;
        int grape = 20;
        assertEquals(5, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case4() {
        int apple = 899;
        int kiwi = 1073;
        int grape = 1147;
        assertEquals(14, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case5() {
        int apple = 2000;
        int kiwi = 2000;
        int grape = 2000;
        assertEquals(666, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case6() {
        int apple = 1977;
        int kiwi = 1977;
        int grape = 1977;
        assertEquals(659, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case7() {
        int apple = 1255;
        int kiwi = 1255;
        int grape = 1255;
        assertEquals(418, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case8() {
        int apple = 1416;
        int kiwi = 708;
        int grape = 1416;
        assertEquals(354, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case9() {
        int apple = 747;
        int kiwi = 1494;
        int grape = 1494;
        assertEquals(373, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case10() {
        int apple = 776;
        int kiwi = 388;
        int grape = 1164;
        assertEquals(129, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case11() {
        int apple = 1275;
        int kiwi = 1700;
        int grape = 425;
        assertEquals(141, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case12() {
        int apple = 825;
        int kiwi = 1100;
        int grape = 1925;
        assertEquals(91, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case13() {
        int apple = 654;
        int kiwi = 1308;
        int grape = 1308;
        assertEquals(327, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case14() {
        int apple = 324;
        int kiwi = 1620;
        int grape = 1296;
        assertEquals(108, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case15() {
        int apple = 1890;
        int kiwi = 315;
        int grape = 1575;
        assertEquals(105, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case16() {
        int apple = 310;
        int kiwi = 1560;
        int grape = 1670;
        assertEquals(3, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case17() {
        int apple = 936;
        int kiwi = 420;
        int grape = 372;
        assertEquals(4, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case18() {
        int apple = 760;
        int kiwi = 970;
        int grape = 390;
        assertEquals(3, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case19() {
        int apple = 1300;
        int kiwi = 160;
        int grape = 350;
        assertEquals(5, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case20() {
        int apple = 1395;
        int kiwi = 360;
        int grape = 495;
        assertEquals(15, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case21() {
        int apple = 425;
        int kiwi = 1139;
        int grape = 1071;
        assertEquals(5, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case22() {
        int apple = 979;
        int kiwi = 363;
        int grape = 1551;
        assertEquals(5, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case23() {
        int apple = 1281;
        int kiwi = 1155;
        int grape = 1449;
        assertEquals(7, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case24() {
        int apple = 330;
        int kiwi = 435;
        int grape = 90;
        assertEquals(7, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case25() {
        int apple = 1740;
        int kiwi = 40;
        int grape = 780;
        assertEquals(10, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case26() {
        int apple = 641;
        int kiwi = 942;
        int grape = 1251;
        assertEquals(0, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case27() {
        int apple = 1781;
        int kiwi = 1045;
        int grape = 1153;
        assertEquals(0, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case28() {
        int apple = 456;
        int kiwi = 210;
        int grape = 990;
        assertEquals(3, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case29() {
        int apple = 1497;
        int kiwi = 1716;
        int grape = 1874;
        assertEquals(0, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case30() {
        int apple = 573;
        int kiwi = 1983;
        int grape = 412;
        assertEquals(0, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case31() {
        int apple = 1730;
        int kiwi = 1005;
        int grape = 839;
        assertEquals(0, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case32() {
        int apple = 366;
        int kiwi = 1257;
        int grape = 1672;
        assertEquals(0, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case33() {
        int apple = 1845;
        int kiwi = 976;
        int grape = 1593;
        assertEquals(0, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case34() {
        int apple = 839;
        int kiwi = 1800;
        int grape = 995;
        assertEquals(0, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case35() {
        int apple = 1614;
        int kiwi = 920;
        int grape = 1780;
        assertEquals(1, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case36() {
        int apple = 444;
        int kiwi = 1480;
        int grape = 1110;
        assertEquals(74, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case37() {
        int apple = 1221;
        int kiwi = 1332;
        int grape = 1628;
        assertEquals(55, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case38() {
        int apple = 1425;
        int kiwi = 1900;
        int grape = 456;
        assertEquals(28, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case39() {
        int apple = 720;
        int kiwi = 330;
        int grape = 1188;
        assertEquals(15, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case40() {
        int apple = 1050;
        int kiwi = 550;
        int grape = 1540;
        assertEquals(25, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case41() {
        int apple = 288;
        int kiwi = 1824;
        int grape = 1368;
        assertEquals(36, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case42() {
        int apple = 645;
        int kiwi = 900;
        int grape = 860;
        assertEquals(7, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case43() {
        int apple = 1323;
        int kiwi = 504;
        int grape = 196;
        assertEquals(14, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case44() {
        int apple = 1596;
        int kiwi = 437;
        int grape = 1932;
        assertEquals(9, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case45() {
        int apple = 980;
        int kiwi = 1440;
        int grape = 735;
        assertEquals(7, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case46() {
        int apple = 1;
        int kiwi = 1;
        int grape = 2000;
        assertEquals(0, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case47() {
        int apple = 1;
        int kiwi = 2000;
        int grape = 2000;
        assertEquals(0, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case48() {
        int apple = 6;
        int kiwi = 10;
        int grape = 15;
        assertEquals(1, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case49() {
        int apple = 10;
        int kiwi = 20;
        int grape = 30;
        assertEquals(3, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case50() {
        int apple = 4;
        int kiwi = 12;
        int grape = 20;
        assertEquals(1, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case51() {
        int apple = 19;
        int kiwi = 21;
        int grape = 12;
        assertEquals(0, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case52() {
        int apple = 2000;
        int kiwi = 150;
        int grape = 50;
        assertEquals(16, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case53() {
        int apple = 2;
        int kiwi = 4;
        int grape = 8;
        assertEquals(1, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case54() {
        int apple = 18;
        int kiwi = 20;
        int grape = 4;
        assertEquals(1, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case55() {
        int apple = 2;
        int kiwi = 4;
        int grape = 6;
        assertEquals(0, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case56() {
        int apple = 2;
        int kiwi = 4;
        int grape = 4;
        assertEquals(1, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case57() {
        int apple = 2000;
        int kiwi = 2000;
        int grape = 1000;
        assertEquals(500, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case58() {
        int apple = 2000;
        int kiwi = 1999;
        int grape = 1997;
        assertEquals(0, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case59() {
        int apple = 1997;
        int kiwi = 2000;
        int grape = 2000;
        assertEquals(0, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case60() {
        int apple = 2000;
        int kiwi = 1000;
        int grape = 500;
        assertEquals(250, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case61() {
        int apple = 1104;
        int kiwi = 736;
        int grape = 1840;
        assertEquals(122, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case62() {
        int apple = 30;
        int kiwi = 40;
        int grape = 50;
        assertEquals(3, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case63() {
        int apple = 2;
        int kiwi = 2;
        int grape = 4;
        assertEquals(0, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case64() {
        int apple = 6;
        int kiwi = 6;
        int grape = 12;
        assertEquals(2, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case65() {
        int apple = 10;
        int kiwi = 2000;
        int grape = 2000;
        assertEquals(5, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case66() {
        int apple = 1000;
        int kiwi = 1000;
        int grape = 2000;
        assertEquals(333, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case67() {
        int apple = 82;
        int kiwi = 28;
        int grape = 62;
        assertEquals(0, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case68() {
        int apple = 10;
        int kiwi = 20;
        int grape = 20;
        assertEquals(5, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case69() {
        int apple = 4;
        int kiwi = 4;
        int grape = 3;
        assertEquals(0, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case70() {
        int apple = 1993;
        int kiwi = 1997;
        int grape = 1999;
        assertEquals(0, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case71() {
        int apple = 10;
        int kiwi = 4;
        int grape = 2;
        assertEquals(0, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case72() {
        int apple = 4;
        int kiwi = 4;
        int grape = 2;
        assertEquals(1, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case73() {
        int apple = 200;
        int kiwi = 200;
        int grape = 201;
        assertEquals(0, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case74() {
        int apple = 5;
        int kiwi = 100;
        int grape = 200;
        assertEquals(2, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case75() {
        int apple = 20;
        int kiwi = 40;
        int grape = 80;
        assertEquals(10, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case76() {
        int apple = 100;
        int kiwi = 100;
        int grape = 200;
        assertEquals(33, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case77() {
        int apple = 4;
        int kiwi = 8;
        int grape = 12;
        assertEquals(1, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case78() {
        int apple = 10;
        int kiwi = 10;
        int grape = 5;
        assertEquals(2, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case79() {
        int apple = 100;
        int kiwi = 200;
        int grape = 300;
        assertEquals(33, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case80() {
        int apple = 2;
        int kiwi = 96;
        int grape = 98;
        assertEquals(0, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case81() {
        int apple = 200;
        int kiwi = 300;
        int grape = 500;
        assertEquals(33, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case82() {
        int apple = 1995;
        int kiwi = 1998;
        int grape = 1992;
        assertEquals(1, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case83() {
        int apple = 12;
        int kiwi = 8;
        int grape = 4;
        assertEquals(1, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case84() {
        int apple = 4;
        int kiwi = 8;
        int grape = 8;
        assertEquals(2, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case85() {
        int apple = 5;
        int kiwi = 10;
        int grape = 15;
        assertEquals(1, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case86() {
        int apple = 2;
        int kiwi = 6;
        int grape = 6;
        assertEquals(1, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case87() {
        int apple = 1974;
        int kiwi = 1758;
        int grape = 1385;
        assertEquals(0, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case88() {
        int apple = 2;
        int kiwi = 4;
        int grape = 2000;
        assertEquals(1, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case89() {
        int apple = 20;
        int kiwi = 30;
        int grape = 50;
        assertEquals(3, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case90() {
        int apple = 1997;
        int kiwi = 1999;
        int grape = 2000;
        assertEquals(0, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case91() {
        int apple = 70;
        int kiwi = 80;
        int grape = 90;
        assertEquals(3, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case92() {
        int apple = 2000;
        int kiwi = 2;
        int grape = 2;
        assertEquals(0, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case93() {
        int apple = 1976;
        int kiwi = 1988;
        int grape = 1968;
        assertEquals(2, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case94() {
        int apple = 783;
        int kiwi = 1241;
        int grape = 1736;
        assertEquals(0, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case95() {
        int apple = 6;
        int kiwi = 8;
        int grape = 10;
        assertEquals(0, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case96() {
        int apple = 2;
        int kiwi = 8;
        int grape = 2;
        assertEquals(0, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case97() {
        int apple = 25;
        int kiwi = 100;
        int grape = 400;
        assertEquals(12, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case98() {
        int apple = 1682;
        int kiwi = 1989;
        int grape = 1955;
        assertEquals(0, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case99() {
        int apple = 12;
        int kiwi = 16;
        int grape = 20;
        assertEquals(1, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case100() {
        int apple = 14;
        int kiwi = 28;
        int grape = 56;
        assertEquals(7, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case101() {
        int apple = 30;
        int kiwi = 60;
        int grape = 90;
        assertEquals(10, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case102() {
        int apple = 47;
        int kiwi = 47;
        int grape = 188;
        assertEquals(15, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case103() {
        int apple = 5;
        int kiwi = 10;
        int grape = 5;
        assertEquals(1, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case104() {
        int apple = 10;
        int kiwi = 100;
        int grape = 100;
        assertEquals(5, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case105() {
        int apple = 2;
        int kiwi = 2000;
        int grape = 2000;
        assertEquals(1, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case106() {
        int apple = 77;
        int kiwi = 88;
        int grape = 99;
        assertEquals(3, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case107() {
        int apple = 10;
        int kiwi = 100;
        int grape = 1000;
        assertEquals(5, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case108() {
        int apple = 17;
        int kiwi = 34;
        int grape = 51;
        assertEquals(5, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case109() {
        int apple = 97;
        int kiwi = 970;
        int grape = 388;
        assertEquals(48, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case110() {
        int apple = 4;
        int kiwi = 8;
        int grape = 48;
        assertEquals(2, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case111() {
        int apple = 12;
        int kiwi = 1200;
        int grape = 1800;
        assertEquals(6, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case112() {
        int apple = 20;
        int kiwi = 40;
        int grape = 60;
        assertEquals(6, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case113() {
        int apple = 1996;
        int kiwi = 1998;
        int grape = 2000;
        assertEquals(1, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case114() {
        int apple = 1997;
        int kiwi = 1998;
        int grape = 1999;
        assertEquals(0, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case115() {
        int apple = 1650;
        int kiwi = 1500;
        int grape = 352;
        assertEquals(2, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case116() {
        int apple = 30;
        int kiwi = 30;
        int grape = 30;
        assertEquals(10, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case117() {
        int apple = 50;
        int kiwi = 150;
        int grape = 2000;
        assertEquals(16, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case118() {
        int apple = 8;
        int kiwi = 4;
        int grape = 2;
        assertEquals(1, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case119() {
        int apple = 7;
        int kiwi = 7;
        int grape = 7;
        assertEquals(2, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case120() {
        int apple = 6;
        int kiwi = 4;
        int grape = 4;
        assertEquals(1, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case121() {
        int apple = 544;
        int kiwi = 702;
        int grape = 1940;
        assertEquals(1, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case122() {
        int apple = 28;
        int kiwi = 44;
        int grape = 77;
        assertEquals(2, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case123() {
        int apple = 221;
        int kiwi = 247;
        int grape = 323;
        assertEquals(6, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case124() {
        int apple = 8;
        int kiwi = 16;
        int grape = 32;
        assertEquals(4, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case125() {
        int apple = 99;
        int kiwi = 77;
        int grape = 63;
        assertEquals(3, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case126() {
        int apple = 1997;
        int kiwi = 1314;
        int grape = 1879;
        assertEquals(0, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case127() {
        int apple = 14;
        int kiwi = 7;
        int grape = 21;
        assertEquals(2, fruittrees.maxDist(apple, kiwi, grape));
    }

    @Test
    public void case128() {
        int apple = 10;
        int kiwi = 50;
        int grape = 50;
        assertEquals(5, fruittrees.maxDist(apple, kiwi, grape));
    }

}
