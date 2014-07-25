package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class FibonacciDiv2Test {
    FibonacciDiv2 fibonaccidiv2 = new FibonacciDiv2();

    @Test
    public void case1() {
        int N = 1;
        assertEquals(0, fibonaccidiv2.find(N));
    }

    @Test
    public void case2() {
        int N = 19;
        assertEquals(2, fibonaccidiv2.find(N));
    }

    @Test
    public void case3() {
        int N = 1000000;
        assertEquals(167960, fibonaccidiv2.find(N));
    }

    @Test
    public void case4() {
        int N = 13;
        assertEquals(0, fibonaccidiv2.find(N));
    }

    @Test
    public void case5() {
        int N = 999999;
        assertEquals(167959, fibonaccidiv2.find(N));
    }

    @Test
    public void case6() {
        int N = 514229;
        assertEquals(0, fibonaccidiv2.find(N));
    }

    @Test
    public void case7() {
        int N = 673134;
        assertEquals(158905, fibonaccidiv2.find(N));
    }

    @Test
    public void case8() {
        int N = 199;
        assertEquals(34, fibonaccidiv2.find(N));
    }

    @Test
    public void case9() {
        int N = 100;
        assertEquals(11, fibonaccidiv2.find(N));
    }

    @Test
    public void case10() {
        int N = 200;
        assertEquals(33, fibonaccidiv2.find(N));
    }

    @Test
    public void case11() {
        int N = 300;
        assertEquals(67, fibonaccidiv2.find(N));
    }

    @Test
    public void case12() {
        int N = 400;
        assertEquals(23, fibonaccidiv2.find(N));
    }

    @Test
    public void case13() {
        int N = 500;
        assertEquals(110, fibonaccidiv2.find(N));
    }

    @Test
    public void case14() {
        int N = 567876;
        assertEquals(53647, fibonaccidiv2.find(N));
    }

    @Test
    public void case15() {
        int N = 257;
        assertEquals(24, fibonaccidiv2.find(N));
    }

    @Test
    public void case16() {
        int N = 765;
        assertEquals(155, fibonaccidiv2.find(N));
    }

    @Test
    public void case17() {
        int N = 15;
        assertEquals(2, fibonaccidiv2.find(N));
    }

    @Test
    public void case18() {
        int N = 9368;
        assertEquals(1578, fibonaccidiv2.find(N));
    }

    @Test
    public void case19() {
        int N = 2615;
        assertEquals(31, fibonaccidiv2.find(N));
    }

    @Test
    public void case20() {
        int N = 2;
        assertEquals(0, fibonaccidiv2.find(N));
    }

    @Test
    public void case21() {
        int N = 27491;
        assertEquals(1166, fibonaccidiv2.find(N));
    }

    @Test
    public void case22() {
        int N = 5;
        assertEquals(0, fibonaccidiv2.find(N));
    }

    @Test
    public void case23() {
        int N = 7;
        assertEquals(1, fibonaccidiv2.find(N));
    }

    @Test
    public void case24() {
        int N = 8;
        assertEquals(0, fibonaccidiv2.find(N));
    }

    @Test
    public void case25() {
        int N = 12;
        assertEquals(1, fibonaccidiv2.find(N));
    }

    @Test
    public void case26() {
        int N = 15;
        assertEquals(2, fibonaccidiv2.find(N));
    }

    @Test
    public void case27() {
        int N = 16;
        assertEquals(3, fibonaccidiv2.find(N));
    }

    @Test
    public void case28() {
        int N = 19;
        assertEquals(2, fibonaccidiv2.find(N));
    }

    @Test
    public void case29() {
        int N = 18;
        assertEquals(3, fibonaccidiv2.find(N));
    }

    @Test
    public void case30() {
        int N = 3417;
        assertEquals(764, fibonaccidiv2.find(N));
    }

    @Test
    public void case31() {
        int N = 28;
        assertEquals(6, fibonaccidiv2.find(N));
    }

    @Test
    public void case32() {
        int N = 34;
        assertEquals(0, fibonaccidiv2.find(N));
    }

    @Test
    public void case33() {
        int N = 35;
        assertEquals(1, fibonaccidiv2.find(N));
    }

    @Test
    public void case34() {
        int N = 1728;
        assertEquals(131, fibonaccidiv2.find(N));
    }

    @Test
    public void case35() {
        int N = 2003;
        assertEquals(406, fibonaccidiv2.find(N));
    }

    @Test
    public void case36() {
        int N = 142178;
        assertEquals(20785, fibonaccidiv2.find(N));
    }

    @Test
    public void case37() {
        int N = 125784;
        assertEquals(4391, fibonaccidiv2.find(N));
    }

    @Test
    public void case38() {
        int N = 59876;
        assertEquals(13508, fibonaccidiv2.find(N));
    }

    @Test
    public void case39() {
        int N = 606259;
        assertEquals(92030, fibonaccidiv2.find(N));
    }

    @Test
    public void case40() {
        int N = 165;
        assertEquals(21, fibonaccidiv2.find(N));
    }

    @Test
    public void case41() {
        int N = 76856;
        assertEquals(1831, fibonaccidiv2.find(N));
    }

    @Test
    public void case42() {
        int N = 24564;
        assertEquals(4093, fibonaccidiv2.find(N));
    }

    @Test
    public void case43() {
        int N = 26377;
        assertEquals(2280, fibonaccidiv2.find(N));
    }

    @Test
    public void case44() {
        int N = 290;
        assertEquals(57, fibonaccidiv2.find(N));
    }

    @Test
    public void case45() {
        int N = 186312;
        assertEquals(10106, fibonaccidiv2.find(N));
    }

    @Test
    public void case46() {
        int N = 3299;
        assertEquals(715, fibonaccidiv2.find(N));
    }

    @Test
    public void case47() {
        int N = 707233;
        assertEquals(124807, fibonaccidiv2.find(N));
    }

    @Test
    public void case48() {
        int N = 16181;
        assertEquals(1530, fibonaccidiv2.find(N));
    }

    @Test
    public void case49() {
        int N = 536;
        assertEquals(74, fibonaccidiv2.find(N));
    }

    @Test
    public void case50() {
        int N = 758092;
        assertEquals(73948, fibonaccidiv2.find(N));
    }

    @Test
    public void case51() {
        int N = 190039;
        assertEquals(6379, fibonaccidiv2.find(N));
    }

    @Test
    public void case52() {
        int N = 219;
        assertEquals(14, fibonaccidiv2.find(N));
    }

    @Test
    public void case53() {
        int N = 18208;
        assertEquals(497, fibonaccidiv2.find(N));
    }

    @Test
    public void case54() {
        int N = 874;
        assertEquals(113, fibonaccidiv2.find(N));
    }

    @Test
    public void case55() {
        int N = 1281;
        assertEquals(294, fibonaccidiv2.find(N));
    }

    @Test
    public void case56() {
        int N = 212428;
        assertEquals(16010, fibonaccidiv2.find(N));
    }

    @Test
    public void case57() {
        int N = 29088;
        assertEquals(431, fibonaccidiv2.find(N));
    }

    @Test
    public void case58() {
        int N = 165003;
        assertEquals(31415, fibonaccidiv2.find(N));
    }

    @Test
    public void case59() {
        int N = 982;
        assertEquals(5, fibonaccidiv2.find(N));
    }

    @Test
    public void case60() {
        int N = 507547;
        assertEquals(6682, fibonaccidiv2.find(N));
    }

    @Test
    public void case61() {
        int N = 127;
        assertEquals(17, fibonaccidiv2.find(N));
    }

    @Test
    public void case62() {
        int N = 320087;
        assertEquals(2276, fibonaccidiv2.find(N));
    }

    @Test
    public void case63() {
        int N = 487803;
        assertEquals(26426, fibonaccidiv2.find(N));
    }

    @Test
    public void case64() {
        int N = 183288;
        assertEquals(13130, fibonaccidiv2.find(N));
    }

    @Test
    public void case65() {
        int N = 9;
        assertEquals(1, fibonaccidiv2.find(N));
    }

    @Test
    public void case66() {
        int N = 4;
        assertEquals(1, fibonaccidiv2.find(N));
    }

}
