package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class MissingLCMTest {
    MissingLCM missinglcm = new MissingLCM();

    @Test
    public void case1() {
        int N = 1;
        assertEquals(2, missinglcm.getMin(N));
    }

    @Test
    public void case2() {
        int N = 2;
        assertEquals(4, missinglcm.getMin(N));
    }

    @Test
    public void case3() {
        int N = 3;
        assertEquals(6, missinglcm.getMin(N));
    }

    @Test
    public void case4() {
        int N = 4;
        assertEquals(8, missinglcm.getMin(N));
    }

    @Test
    public void case5() {
        int N = 5;
        assertEquals(10, missinglcm.getMin(N));
    }

    @Test
    public void case6() {
        int N = 999999;
        assertEquals(1999966, missinglcm.getMin(N));
    }

    @Test
    public void case7() {
        int N = 42;
        assertEquals(82, missinglcm.getMin(N));
    }

    @Test
    public void case8() {
        int N = 1000000;
        assertEquals(1999966, missinglcm.getMin(N));
    }

    @Test
    public void case9() {
        int N = 10;
        assertEquals(18, missinglcm.getMin(N));
    }

    @Test
    public void case10() {
        int N = 100;
        assertEquals(194, missinglcm.getMin(N));
    }

    @Test
    public void case11() {
        int N = 1000;
        assertEquals(1994, missinglcm.getMin(N));
    }

    @Test
    public void case12() {
        int N = 10000;
        assertEquals(19946, missinglcm.getMin(N));
    }

    @Test
    public void case13() {
        int N = 100000;
        assertEquals(199982, missinglcm.getMin(N));
    }

    @Test
    public void case14() {
        int N = 279841;
        assertEquals(559682, missinglcm.getMin(N));
    }

    @Test
    public void case15() {
        int N = 531445;
        assertEquals(1062882, missinglcm.getMin(N));
    }

    @Test
    public void case16() {
        int N = 161052;
        assertEquals(322102, missinglcm.getMin(N));
    }

    @Test
    public void case17() {
        int N = 161055;
        assertEquals(322106, missinglcm.getMin(N));
    }

    @Test
    public void case18() {
        int N = 994012;
        assertEquals(1988018, missinglcm.getMin(N));
    }

    @Test
    public void case19() {
        int N = 386181;
        assertEquals(772346, missinglcm.getMin(N));
    }

    @Test
    public void case20() {
        int N = 559460;
        assertEquals(1118918, missinglcm.getMin(N));
    }

    @Test
    public void case21() {
        int N = 823661;
        assertEquals(1647302, missinglcm.getMin(N));
    }

    @Test
    public void case22() {
        int N = 627547;
        assertEquals(1255094, missinglcm.getMin(N));
    }

    @Test
    public void case23() {
        int N = 904541;
        assertEquals(1809062, missinglcm.getMin(N));
    }

    @Test
    public void case24() {
        int N = 856252;
        assertEquals(1712498, missinglcm.getMin(N));
    }

    @Test
    public void case25() {
        int N = 509533;
        assertEquals(1019042, missinglcm.getMin(N));
    }

    @Test
    public void case26() {
        int N = 223449;
        assertEquals(446882, missinglcm.getMin(N));
    }

    @Test
    public void case27() {
        int N = 832585;
        assertEquals(1665166, missinglcm.getMin(N));
    }

    @Test
    public void case28() {
        int N = 986047;
        assertEquals(1972094, missinglcm.getMin(N));
    }

    @Test
    public void case29() {
        int N = 37834;
        assertEquals(75662, missinglcm.getMin(N));
    }

    @Test
    public void case30() {
        int N = 33298;
        assertEquals(66578, missinglcm.getMin(N));
    }

    @Test
    public void case31() {
        int N = 79002;
        assertEquals(157978, missinglcm.getMin(N));
    }

    @Test
    public void case32() {
        int N = 27258;
        assertEquals(54506, missinglcm.getMin(N));
    }

    @Test
    public void case33() {
        int N = 44618;
        assertEquals(89234, missinglcm.getMin(N));
    }

    @Test
    public void case34() {
        int N = 6423;
        assertEquals(12842, missinglcm.getMin(N));
    }

    @Test
    public void case35() {
        int N = 4836;
        assertEquals(9662, missinglcm.getMin(N));
    }

    @Test
    public void case36() {
        int N = 4058;
        assertEquals(8114, missinglcm.getMin(N));
    }

    @Test
    public void case37() {
        int N = 8566;
        assertEquals(17126, missinglcm.getMin(N));
    }

    @Test
    public void case38() {
        int N = 6951;
        assertEquals(13898, missinglcm.getMin(N));
    }

    @Test
    public void case39() {
        int N = 408;
        assertEquals(802, missinglcm.getMin(N));
    }

    @Test
    public void case40() {
        int N = 395;
        assertEquals(778, missinglcm.getMin(N));
    }

    @Test
    public void case41() {
        int N = 377;
        assertEquals(746, missinglcm.getMin(N));
    }

    @Test
    public void case42() {
        int N = 573;
        assertEquals(1142, missinglcm.getMin(N));
    }

    @Test
    public void case43() {
        int N = 54;
        assertEquals(106, missinglcm.getMin(N));
    }

    @Test
    public void case44() {
        int N = 90;
        assertEquals(178, missinglcm.getMin(N));
    }

    @Test
    public void case45() {
        int N = 33;
        assertEquals(64, missinglcm.getMin(N));
    }

    @Test
    public void case46() {
        int N = 30;
        assertEquals(58, missinglcm.getMin(N));
    }

    @Test
    public void case47() {
        int N = 23;
        assertEquals(46, missinglcm.getMin(N));
    }

    @Test
    public void case48() {
        int N = 531441;
        assertEquals(1062882, missinglcm.getMin(N));
    }

    @Test
    public void case49() {
        int N = 8;
        assertEquals(16, missinglcm.getMin(N));
    }

    @Test
    public void case50() {
        int N = 81;
        assertEquals(162, missinglcm.getMin(N));
    }

    @Test
    public void case51() {
        int N = 9;
        assertEquals(18, missinglcm.getMin(N));
    }

    @Test
    public void case52() {
        int N = 28;
        assertEquals(54, missinglcm.getMin(N));
    }

    @Test
    public void case53() {
        int N = 16;
        assertEquals(32, missinglcm.getMin(N));
    }

    @Test
    public void case54() {
        int N = 27;
        assertEquals(54, missinglcm.getMin(N));
    }

    @Test
    public void case55() {
        int N = 262144;
        assertEquals(524288, missinglcm.getMin(N));
    }

    @Test
    public void case56() {
        int N = 103823;
        assertEquals(207646, missinglcm.getMin(N));
    }

    @Test
    public void case57() {
        int N = 1350;
        assertEquals(2662, missinglcm.getMin(N));
    }

}
