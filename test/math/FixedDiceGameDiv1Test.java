package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class FixedDiceGameDiv1Test {
    double DELTA = 1.0e-09;
    FixedDiceGameDiv1 fixeddicegamediv1 = new FixedDiceGameDiv1();

    @Test
    public void case1() {
        int a = 1;
        int b = 2;
        int c = 1;
        int d = 5;
        assertEquals(2.0, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 2.0);
    }

    @Test
    public void case2() {
        int a = 3;
        int b = 1;
        int c = 1;
        int d = 3;
        assertEquals(3.0, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 3.0);
    }

    @Test
    public void case3() {
        int a = 1;
        int b = 5;
        int c = 1;
        int d = 1;
        assertEquals(3.4999999999999996, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 3.4999999999999996);
    }

    @Test
    public void case4() {
        int a = 2;
        int b = 6;
        int c = 50;
        int d = 30;
        assertEquals(-1.0, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * -1.0);
    }

    @Test
    public void case5() {
        int a = 2;
        int b = 6;
        int c = 6;
        int d = 2;
        assertEquals(10.148148148148147, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 10.148148148148147);
    }

    @Test
    public void case6() {
        int a = 50;
        int b = 50;
        int c = 50;
        int d = 50;
        assertEquals(1332.7589106984374, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 1332.7589106984374);
    }

    @Test
    public void case7() {
        int a = 1;
        int b = 50;
        int c = 50;
        int d = 1;
        assertEquals(-1.0, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * -1.0);
    }

    @Test
    public void case8() {
        int a = 4;
        int b = 4;
        int c = 20;
        int d = 50;
        assertEquals(-1.0, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * -1.0);
    }

    @Test
    public void case9() {
        int a = 21;
        int b = 30;
        int c = 5;
        int d = 4;
        assertEquals(325.4999999999997, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 325.4999999999997);
    }

    @Test
    public void case10() {
        int a = 31;
        int b = 29;
        int c = 21;
        int d = 39;
        assertEquals(478.75536280357505, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 478.75536280357505);
    }

    @Test
    public void case11() {
        int a = 50;
        int b = 11;
        int c = 50;
        int d = 50;
        assertEquals(369.8865999182022, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 369.8865999182022);
    }

    @Test
    public void case12() {
        int a = 49;
        int b = 17;
        int c = 46;
        int d = 43;
        assertEquals(534.2170925066571, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 534.2170925066571);
    }

    @Test
    public void case13() {
        int a = 1;
        int b = 1;
        int c = 1;
        int d = 1;
        assertEquals(-1.0, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * -1.0);
    }

    @Test
    public void case14() {
        int a = 27;
        int b = 16;
        int c = 21;
        int d = 29;
        assertEquals(258.7074101537062, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 258.7074101537062);
    }

    @Test
    public void case15() {
        int a = 10;
        int b = 43;
        int c = 20;
        int d = 31;
        assertEquals(279.6602257881004, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 279.6602257881004);
    }

    @Test
    public void case16() {
        int a = 15;
        int b = 50;
        int c = 13;
        int d = 50;
        assertEquals(400.16061658758815, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 400.16061658758815);
    }

    @Test
    public void case17() {
        int a = 3;
        int b = 8;
        int c = 25;
        int d = 28;
        assertEquals(-1.0, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * -1.0);
    }

    @Test
    public void case18() {
        int a = 48;
        int b = 19;
        int c = 33;
        int d = 29;
        assertEquals(502.6872572209374, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 502.6872572209374);
    }

    @Test
    public void case19() {
        int a = 31;
        int b = 46;
        int c = 50;
        int d = 50;
        assertEquals(926.4124713423334, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 926.4124713423334);
    }

    @Test
    public void case20() {
        int a = 40;
        int b = 39;
        int c = 13;
        int d = 28;
        assertEquals(800.0, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 800.0);
    }

    @Test
    public void case21() {
        int a = 18;
        int b = 31;
        int c = 26;
        int d = 20;
        assertEquals(306.5496066751804, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 306.5496066751804);
    }

    @Test
    public void case22() {
        int a = 24;
        int b = 31;
        int c = 43;
        int d = 22;
        assertEquals(454.5514654839089, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 454.5514654839089);
    }

    @Test
    public void case23() {
        int a = 15;
        int b = 18;
        int c = 13;
        int d = 46;
        assertEquals(171.46762889735407, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 171.46762889735407);
    }

    @Test
    public void case24() {
        int a = 16;
        int b = 11;
        int c = 25;
        int d = 33;
        assertEquals(128.25086190339601, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 128.25086190339601);
    }

    @Test
    public void case25() {
        int a = 11;
        int b = 11;
        int c = 22;
        int d = 8;
        assertEquals(84.6482753727544, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 84.6482753727544);
    }

    @Test
    public void case26() {
        int a = 15;
        int b = 27;
        int c = 30;
        int d = 2;
        assertEquals(210.0000000322832, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 210.0000000322832);
    }

    @Test
    public void case27() {
        int a = 16;
        int b = 11;
        int c = 8;
        int d = 33;
        assertEquals(105.85739594226452, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 105.85739594226452);
    }

    @Test
    public void case28() {
        int a = 50;
        int b = 38;
        int c = 6;
        int d = 6;
        assertEquals(975.0000000000006, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 975.0000000000006);
    }

    @Test
    public void case29() {
        int a = 49;
        int b = 27;
        int c = 7;
        int d = 22;
        assertEquals(685.9999999999997, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 685.9999999999997);
    }

    @Test
    public void case30() {
        int a = 4;
        int b = 49;
        int c = 35;
        int d = 23;
        assertEquals(179.57904432269555, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 179.57904432269555);
    }

    @Test
    public void case31() {
        int a = 50;
        int b = 32;
        int c = 13;
        int d = 41;
        assertEquals(825.0000000000275, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 825.0000000000275);
    }

    @Test
    public void case32() {
        int a = 4;
        int b = 21;
        int c = 16;
        int d = 42;
        assertEquals(71.35525024147547, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 71.35525024147547);
    }

    @Test
    public void case33() {
        int a = 24;
        int b = 25;
        int c = 38;
        int d = 6;
        assertEquals(312.00003679806423, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 312.00003679806423);
    }

    @Test
    public void case34() {
        int a = 20;
        int b = 35;
        int c = 38;
        int d = 19;
        assertEquals(397.7861355777227, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 397.7861355777227);
    }

    @Test
    public void case35() {
        int a = 20;
        int b = 15;
        int c = 14;
        int d = 14;
        assertEquals(160.5082495855897, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 160.5082495855897);
    }

    @Test
    public void case36() {
        int a = 4;
        int b = 31;
        int c = 8;
        int d = 23;
        assertEquals(85.15550700214645, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 85.15550700214645);
    }

    @Test
    public void case37() {
        int a = 1;
        int b = 4;
        int c = 15;
        int d = 20;
        assertEquals(-1.0, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * -1.0);
    }

    @Test
    public void case38() {
        int a = 27;
        int b = 39;
        int c = 11;
        int d = 44;
        assertEquals(540.0036735288666, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 540.0036735288666);
    }

    @Test
    public void case39() {
        int a = 27;
        int b = 50;
        int c = 31;
        int d = 33;
        assertEquals(693.9472629135273, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 693.9472629135273);
    }

    @Test
    public void case40() {
        int a = 23;
        int b = 22;
        int c = 49;
        int d = 24;
        assertEquals(366.58178351553005, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 366.58178351553005);
    }

    @Test
    public void case41() {
        int a = 43;
        int b = 34;
        int c = 49;
        int d = 2;
        assertEquals(752.5000000000014, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 752.5000000000014);
    }

    @Test
    public void case42() {
        int a = 18;
        int b = 26;
        int c = 16;
        int d = 14;
        assertEquals(243.0241513368867, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 243.0241513368867);
    }

    @Test
    public void case43() {
        int a = 35;
        int b = 29;
        int c = 42;
        int d = 6;
        assertEquals(525.0000000000002, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 525.0000000000002);
    }

    @Test
    public void case44() {
        int a = 37;
        int b = 11;
        int c = 14;
        int d = 42;
        assertEquals(237.4588865436795, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 237.4588865436795);
    }

    @Test
    public void case45() {
        int a = 22;
        int b = 2;
        int c = 3;
        int d = 29;
        assertEquals(33.51463413522666, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 33.51463413522666);
    }

    @Test
    public void case46() {
        int a = 34;
        int b = 8;
        int c = 50;
        int d = 22;
        assertEquals(200.27130538628728, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 200.27130538628728);
    }

    @Test
    public void case47() {
        int a = 19;
        int b = 4;
        int c = 48;
        int d = 20;
        assertEquals(68.78676255099504, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 68.78676255099504);
    }

    @Test
    public void case48() {
        int a = 14;
        int b = 27;
        int c = 16;
        int d = 8;
        assertEquals(196.00127731133506, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 196.00127731133506);
    }

    @Test
    public void case49() {
        int a = 13;
        int b = 26;
        int c = 38;
        int d = 30;
        assertEquals(265.0953587969176, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 265.0953587969176);
    }

    @Test
    public void case50() {
        int a = 29;
        int b = 6;
        int c = 24;
        int d = 3;
        assertEquals(101.50000087473207, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 101.50000087473207);
    }

    @Test
    public void case51() {
        int a = 15;
        int b = 16;
        int c = 46;
        int d = 15;
        assertEquals(192.74264208870224, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 192.74264208870224);
    }

    @Test
    public void case52() {
        int a = 42;
        int b = 36;
        int c = 37;
        int d = 40;
        assertEquals(808.8882986768757, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 808.8882986768757);
    }

    @Test
    public void case53() {
        int a = 43;
        int b = 32;
        int c = 43;
        int d = 21;
        assertEquals(709.5930563242547, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 709.5930563242547);
    }

    @Test
    public void case54() {
        int a = 3;
        int b = 4;
        int c = 12;
        int d = 1;
        assertEquals(-1.0, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * -1.0);
    }

    @Test
    public void case55() {
        int a = 5;
        int b = 10;
        int c = 50;
        int d = 3;
        assertEquals(-1.0, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * -1.0);
    }

    @Test
    public void case56() {
        int a = 50;
        int b = 49;
        int c = 49;
        int d = 50;
        assertEquals(1306.1592757857798, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 1306.1592757857798);
    }

    @Test
    public void case57() {
        int a = 2;
        int b = 3;
        int c = 6;
        int d = 1;
        assertEquals(-1.0, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * -1.0);
    }

    @Test
    public void case58() {
        int a = 5;
        int b = 5;
        int c = 25;
        int d = 1;
        assertEquals(-1.0, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * -1.0);
    }

    @Test
    public void case59() {
        int a = 1;
        int b = 2;
        int c = 2;
        int d = 1;
        assertEquals(-1.0, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * -1.0);
    }

    @Test
    public void case60() {
        int a = 2;
        int b = 2;
        int c = 4;
        int d = 2;
        assertEquals(-1.0, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * -1.0);
    }

    @Test
    public void case61() {
        int a = 1;
        int b = 50;
        int c = 50;
        int d = 50;
        assertEquals(-1.0, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * -1.0);
    }

    @Test
    public void case62() {
        int a = 5;
        int b = 5;
        int c = 25;
        int d = 5;
        assertEquals(-1.0, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * -1.0);
    }

    @Test
    public void case63() {
        int a = 39;
        int b = 39;
        int c = 39;
        int d = 39;
        assertEquals(819.8389117308133, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 819.8389117308133);
    }

    @Test
    public void case64() {
        int a = 50;
        int b = 50;
        int c = 50;
        int d = 5;
        assertEquals(1274.9999999999995, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 1274.9999999999995);
    }

    @Test
    public void case65() {
        int a = 1;
        int b = 1;
        int c = 1;
        int d = 2;
        assertEquals(-1.0, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * -1.0);
    }

    @Test
    public void case66() {
        int a = 1;
        int b = 1;
        int c = 1;
        int d = 5;
        assertEquals(-1.0, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * -1.0);
    }

    @Test
    public void case67() {
        int a = 3;
        int b = 3;
        int c = 9;
        int d = 1;
        assertEquals(-1.0, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * -1.0);
    }

    @Test
    public void case68() {
        int a = 2;
        int b = 2;
        int c = 4;
        int d = 1;
        assertEquals(-1.0, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * -1.0);
    }

    @Test
    public void case69() {
        int a = 2;
        int b = 3;
        int c = 6;
        int d = 7;
        assertEquals(-1.0, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * -1.0);
    }

    @Test
    public void case70() {
        int a = 1;
        int b = 21;
        int c = 20;
        int d = 20;
        assertEquals(21.0, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 21.0);
    }

    @Test
    public void case71() {
        int a = 50;
        int b = 33;
        int c = 50;
        int d = 50;
        assertEquals(989.8999699575622, fixeddicegamediv1.getExpectation(a, b, c, d), DELTA * 989.8999699575622);
    }

}
