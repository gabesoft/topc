package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class TheSquareRootDilemmaTest {
    TheSquareRootDilemma thesquarerootdilemma = new TheSquareRootDilemma();

    @Test
    public void case1() {
        int N = 2;
        int M = 2;
        assertEquals(2, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case2() {
        int N = 10;
        int M = 1;
        assertEquals(3, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case3() {
        int N = 3;
        int M = 8;
        assertEquals(5, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case4() {
        int N = 100;
        int M = 100;
        assertEquals(310, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case5() {
        int N = 77777;
        int M = 77777;
        assertEquals(543345, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case6() {
        int N = 77777;
        int M = 72277;
        assertEquals(519638, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case7() {
        int N = 1;
        int M = 1;
        assertEquals(1, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case8() {
        int N = 24;
        int M = 1;
        assertEquals(4, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case9() {
        int N = 25;
        int M = 1;
        assertEquals(5, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case10() {
        int N = 77777;
        int M = 1;
        assertEquals(278, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case11() {
        int N = 24;
        int M = 16236;
        assertEquals(1506, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case12() {
        int N = 8824;
        int M = 56236;
        assertEquals(130313, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case13() {
        int N = 68824;
        int M = 56232;
        assertEquals(421216, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case14() {
        int N = 77777;
        int M = 24512;
        assertEquals(278870, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case15() {
        int N = 25891;
        int M = 5356;
        assertEquals(65001, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case16() {
        int N = 2929;
        int M = 59599;
        assertEquals(69953, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case17() {
        int N = 1000;
        int M = 1000;
        assertEquals(4344, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case18() {
        int N = 10000;
        int M = 10000;
        assertEquals(57296, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case19() {
        int N = 10000;
        int M = 66869;
        assertEquals(153175, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case20() {
        int N = 58858;
        int M = 281;
        assertEquals(15860, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case21() {
        int N = 22;
        int M = 505;
        assertEquals(242, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case22() {
        int N = 50005;
        int M = 77777;
        assertEquals(418501, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case23() {
        int N = 50005;
        int M = 7777;
        assertEquals(113985, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case24() {
        int N = 50005;
        int M = 7;
        assertEquals(1008, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case25() {
        int N = 1314;
        int M = 1211;
        assertEquals(5594, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case26() {
        int N = 5925;
        int M = 11;
        assertEquals(521, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case27() {
        int N = 1113;
        int M = 59999;
        assertEquals(38664, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case28() {
        int N = 60000;
        int M = 10000;
        assertEquals(144913, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case29() {
        int N = 70000;
        int M = 66969;
        assertEquals(471387, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case30() {
        int N = 59414;
        int M = 67002;
        assertEquals(429403, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case31() {
        int N = 75000;
        int M = 77000;
        assertEquals(528692, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case32() {
        int N = 75000;
        int M = 49993;
        assertEquals(410419, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case33() {
        int N = 49945;
        int M = 74935;
        assertEquals(410071, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case34() {
        int N = 77200;
        int M = 77711;
        assertEquals(540417, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case35() {
        int N = 77200;
        int M = 51515;
        assertEquals(423769, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case36() {
        int N = 51295;
        int M = 76123;
        assertEquals(419928, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case37() {
        int N = 12375;
        int M = 748;
        assertEquals(13542, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case38() {
        int N = 23895;
        int M = 7895;
        assertEquals(78035, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case39() {
        int N = 2;
        int M = 77777;
        assertEquals(475, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case40() {
        int N = 77777;
        int M = 3;
        assertEquals(636, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case41() {
        int N = 50000;
        int M = 6;
        assertEquals(924, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case42() {
        int N = 50001;
        int M = 12700;
        assertEquals(152516, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case43() {
        int N = 77577;
        int M = 77577;
        assertEquals(541493, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case44() {
        int N = 76765;
        int M = 77777;
        assertEquals(538968, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case45() {
        int N = 77777;
        int M = 44444;
        assertEquals(390889, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case46() {
        int N = 77776;
        int M = 77776;
        assertEquals(543344, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case47() {
        int N = 77771;
        int M = 77771;
        assertEquals(543323, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case48() {
        int N = 7777;
        int M = 7777;
        assertEquals(43513, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case49() {
        int N = 77777;
        int M = 70000;
        assertEquals(509807, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case50() {
        int N = 76513;
        int M = 74797;
        assertEquals(526033, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case51() {
        int N = 77773;
        int M = 77775;
        assertEquals(543331, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case52() {
        int N = 33333;
        int M = 77777;
        assertEquals(331955, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case53() {
        int N = 65536;
        int M = 65536;
        assertEquals(451096, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case54() {
        int N = 70000;
        int M = 70000;
        assertEquals(484684, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case55() {
        int N = 77767;
        int M = 77767;
        assertEquals(543313, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case56() {
        int N = 77763;
        int M = 77764;
        assertEquals(543308, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case57() {
        int N = 50000;
        int M = 50000;
        assertEquals(336016, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case58() {
        int N = 77657;
        int M = 77777;
        assertEquals(542785, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case59() {
        int N = 77555;
        int M = 65666;
        assertEquals(489869, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case60() {
        int N = 999;
        int M = 666;
        assertEquals(3313, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case61() {
        int N = 77776;
        int M = 77777;
        assertEquals(543344, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case62() {
        int N = 77267;
        int M = 75557;
        assertEquals(531659, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case63() {
        int N = 77777;
        int M = 77775;
        assertEquals(543340, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case64() {
        int N = 77777;
        int M = 77776;
        assertEquals(543344, thesquarerootdilemma.countPairs(N, M));
    }

    @Test
    public void case65() {
        int N = 101;
        int M = 201;
        assertEquals(440, thesquarerootdilemma.countPairs(N, M));
    }

}
