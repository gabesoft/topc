package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class FlatCatsBreedingTest {
    FlatCatsBreeding flatcatsbreeding = new FlatCatsBreeding();

    @Test
    public void case1() {
        int D = 4;
        int K = 3;
        int T = 1;
        assertEquals(0, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case2() {
        int D = 4;
        int K = 3;
        int T = 4;
        assertEquals(4, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case3() {
        int D = 4;
        int K = 3;
        int T = 9;
        assertEquals(8, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case4() {
        int D = 4;
        int K = 3;
        int T = 1000000;
        assertEquals(40, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case5() {
        int D = 100;
        int K = 1;
        int T = 1000000;
        assertEquals(2000, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case6() {
        int D = 1;
        int K = 10;
        int T = 1;
        assertEquals(0, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case7() {
        int D = 45;
        int K = 8;
        int T = 1;
        assertEquals(0, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case8() {
        int D = 1;
        int K = 5;
        int T = 978235;
        assertEquals(8, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case9() {
        int D = 84;
        int K = 1;
        int T = 234987;
        assertEquals(1512, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case10() {
        int D = 34;
        int K = 1;
        int T = 978325;
        assertEquals(680, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case11() {
        int D = 27;
        int K = 6;
        int T = 12088;
        assertEquals(135, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case12() {
        int D = 59;
        int K = 7;
        int T = 2170;
        assertEquals(236, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case13() {
        int D = 91;
        int K = 6;
        int T = 10433;
        assertEquals(455, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case14() {
        int D = 93;
        int K = 1;
        int T = 24671;
        assertEquals(1395, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case15() {
        int D = 9;
        int K = 7;
        int T = 17079;
        assertEquals(45, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case16() {
        int D = 42;
        int K = 9;
        int T = 11216;
        assertEquals(210, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case17() {
        int D = 86;
        int K = 1;
        int T = 19321;
        assertEquals(1290, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case18() {
        int D = 83;
        int K = 7;
        int T = 30526;
        assertEquals(415, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case19() {
        int D = 57;
        int K = 8;
        int T = 4211;
        assertEquals(228, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case20() {
        int D = 57;
        int K = 9;
        int T = 5548;
        assertEquals(228, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case21() {
        int D = 49;
        int K = 7;
        int T = 4196;
        assertEquals(245, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case22() {
        int D = 37;
        int K = 8;
        int T = 6685;
        assertEquals(185, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case23() {
        int D = 61;
        int K = 5;
        int T = 3132;
        assertEquals(305, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case24() {
        int D = 32;
        int K = 6;
        int T = 11946;
        assertEquals(160, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case25() {
        int D = 3;
        int K = 2;
        int T = 25416;
        assertEquals(30, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case26() {
        int D = 52;
        int K = 3;
        int T = 31182;
        assertEquals(416, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case27() {
        int D = 90;
        int K = 2;
        int T = 28042;
        assertEquals(900, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case28() {
        int D = 2;
        int K = 4;
        int T = 13237;
        assertEquals(12, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case29() {
        int D = 79;
        int K = 4;
        int T = 10094;
        assertEquals(474, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case30() {
        int D = 77;
        int K = 4;
        int T = 4229;
        assertEquals(462, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case31() {
        int D = 16;
        int K = 9;
        int T = 3134;
        assertEquals(64, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case32() {
        int D = 67;
        int K = 8;
        int T = 2559;
        assertEquals(268, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case33() {
        int D = 38;
        int K = 1;
        int T = 258;
        assertEquals(342, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case34() {
        int D = 44;
        int K = 8;
        int T = 10733;
        assertEquals(220, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case35() {
        int D = 6;
        int K = 7;
        int T = 16297;
        assertEquals(30, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case36() {
        int D = 86;
        int K = 7;
        int T = 4147;
        assertEquals(430, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case37() {
        int D = 64;
        int K = 9;
        int T = 23223;
        assertEquals(320, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case38() {
        int D = 58;
        int K = 3;
        int T = 23167;
        assertEquals(464, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case39() {
        int D = 56;
        int K = 3;
        int T = 17355;
        assertEquals(448, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case40() {
        int D = 56;
        int K = 1;
        int T = 8426;
        assertEquals(784, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case41() {
        int D = 11;
        int K = 8;
        int T = 19376;
        assertEquals(55, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case42() {
        int D = 27;
        int K = 3;
        int T = 14863;
        assertEquals(189, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case43() {
        int D = 76;
        int K = 4;
        int T = 26846;
        assertEquals(532, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case44() {
        int D = 26;
        int K = 3;
        int T = 14941;
        assertEquals(182, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case45() {
        int D = 15;
        int K = 2;
        int T = 16796;
        assertEquals(135, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case46() {
        int D = 86;
        int K = 3;
        int T = 30121;
        assertEquals(688, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case47() {
        int D = 72;
        int K = 1;
        int T = 4372;
        assertEquals(936, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case48() {
        int D = 99;
        int K = 4;
        int T = 32602;
        assertEquals(693, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case49() {
        int D = 91;
        int K = 2;
        int T = 4896;
        assertEquals(728, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case50() {
        int D = 91;
        int K = 5;
        int T = 3228;
        assertEquals(455, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case51() {
        int D = 48;
        int K = 9;
        int T = 16541;
        assertEquals(240, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case52() {
        int D = 55;
        int K = 7;
        int T = 1401;
        assertEquals(220, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case53() {
        int D = 19;
        int K = 7;
        int T = 24187;
        assertEquals(95, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case54() {
        int D = 74;
        int K = 5;
        int T = 19669;
        assertEquals(444, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case55() {
        int D = 73;
        int K = 5;
        int T = 17390;
        assertEquals(438, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case56() {
        int D = 46;
        int K = 2;
        int T = 9361;
        assertEquals(414, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case57() {
        int D = 12;
        int K = 4;
        int T = 22630;
        assertEquals(84, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case58() {
        int D = 84;
        int K = 4;
        int T = 25199;
        assertEquals(588, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case59() {
        int D = 46;
        int K = 3;
        int T = 12350;
        assertEquals(322, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case60() {
        int D = 19;
        int K = 8;
        int T = 15206;
        assertEquals(95, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case61() {
        int D = 99;
        int K = 2;
        int T = 531441;
        assertEquals(1188, flatcatsbreeding.days(D, K, T));
    }

    @Test
    public void case62() {
        int D = 99;
        int K = 2;
        int T = 531442;
        assertEquals(1287, flatcatsbreeding.days(D, K, T));
    }

}
