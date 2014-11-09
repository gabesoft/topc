package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class ChooseTheBestOneTest {
    ChooseTheBestOne choosethebestone = new ChooseTheBestOne();

    @Test
    public void case1() {
        int N = 3;
        assertEquals(2, choosethebestone.countNumber(N));
    }

    @Test
    public void case2() {
        int N = 6;
        assertEquals(6, choosethebestone.countNumber(N));
    }

    @Test
    public void case3() {
        int N = 10;
        assertEquals(8, choosethebestone.countNumber(N));
    }

    @Test
    public void case4() {
        int N = 1234;
        assertEquals(341, choosethebestone.countNumber(N));
    }

    @Test
    public void case5() {
        int N = 2414;
        assertEquals(1368, choosethebestone.countNumber(N));
    }

    @Test
    public void case6() {
        int N = 1506;
        assertEquals(767, choosethebestone.countNumber(N));
    }

    @Test
    public void case7() {
        int N = 1113;
        assertEquals(405, choosethebestone.countNumber(N));
    }

    @Test
    public void case8() {
        int N = 2462;
        assertEquals(1286, choosethebestone.countNumber(N));
    }

    @Test
    public void case9() {
        int N = 3423;
        assertEquals(1635, choosethebestone.countNumber(N));
    }

    @Test
    public void case10() {
        int N = 3647;
        assertEquals(1386, choosethebestone.countNumber(N));
    }

    @Test
    public void case11() {
        int N = 2172;
        assertEquals(833, choosethebestone.countNumber(N));
    }

    @Test
    public void case12() {
        int N = 2065;
        assertEquals(1520, choosethebestone.countNumber(N));
    }

    @Test
    public void case13() {
        int N = 2749;
        assertEquals(299, choosethebestone.countNumber(N));
    }

    @Test
    public void case14() {
        int N = 1756;
        assertEquals(732, choosethebestone.countNumber(N));
    }

    @Test
    public void case15() {
        int N = 2471;
        assertEquals(583, choosethebestone.countNumber(N));
    }

    @Test
    public void case16() {
        int N = 1840;
        assertEquals(551, choosethebestone.countNumber(N));
    }

    @Test
    public void case17() {
        int N = 2577;
        assertEquals(42, choosethebestone.countNumber(N));
    }

    @Test
    public void case18() {
        int N = 2293;
        assertEquals(1389, choosethebestone.countNumber(N));
    }

    @Test
    public void case19() {
        int N = 2201;
        assertEquals(1070, choosethebestone.countNumber(N));
    }

    @Test
    public void case20() {
        int N = 1839;
        assertEquals(1618, choosethebestone.countNumber(N));
    }

    @Test
    public void case21() {
        int N = 120;
        assertEquals(32, choosethebestone.countNumber(N));
    }

    @Test
    public void case22() {
        int N = 3522;
        assertEquals(818, choosethebestone.countNumber(N));
    }

    @Test
    public void case23() {
        int N = 2078;
        assertEquals(1283, choosethebestone.countNumber(N));
    }

    @Test
    public void case24() {
        int N = 657;
        assertEquals(208, choosethebestone.countNumber(N));
    }

    @Test
    public void case25() {
        int N = 1421;
        assertEquals(634, choosethebestone.countNumber(N));
    }

    @Test
    public void case26() {
        int N = 2040;
        assertEquals(276, choosethebestone.countNumber(N));
    }

    @Test
    public void case27() {
        int N = 1660;
        assertEquals(776, choosethebestone.countNumber(N));
    }

    @Test
    public void case28() {
        int N = 1366;
        assertEquals(499, choosethebestone.countNumber(N));
    }

    @Test
    public void case29() {
        int N = 201;
        assertEquals(117, choosethebestone.countNumber(N));
    }

    @Test
    public void case30() {
        int N = 4887;
        assertEquals(2687, choosethebestone.countNumber(N));
    }

    @Test
    public void case31() {
        int N = 1780;
        assertEquals(654, choosethebestone.countNumber(N));
    }

    @Test
    public void case32() {
        int N = 2056;
        assertEquals(87, choosethebestone.countNumber(N));
    }

    @Test
    public void case33() {
        int N = 1090;
        assertEquals(158, choosethebestone.countNumber(N));
    }

    @Test
    public void case34() {
        int N = 996;
        assertEquals(706, choosethebestone.countNumber(N));
    }

    @Test
    public void case35() {
        int N = 612;
        assertEquals(72, choosethebestone.countNumber(N));
    }

    @Test
    public void case36() {
        int N = 1298;
        assertEquals(806, choosethebestone.countNumber(N));
    }

    @Test
    public void case37() {
        int N = 1650;
        assertEquals(1526, choosethebestone.countNumber(N));
    }

    @Test
    public void case38() {
        int N = 1634;
        assertEquals(1108, choosethebestone.countNumber(N));
    }

    @Test
    public void case39() {
        int N = 2899;
        assertEquals(2654, choosethebestone.countNumber(N));
    }

    @Test
    public void case40() {
        int N = 2306;
        assertEquals(250, choosethebestone.countNumber(N));
    }

    @Test
    public void case41() {
        int N = 1369;
        assertEquals(997, choosethebestone.countNumber(N));
    }

    @Test
    public void case42() {
        int N = 1261;
        assertEquals(482, choosethebestone.countNumber(N));
    }

    @Test
    public void case43() {
        int N = 3396;
        assertEquals(615, choosethebestone.countNumber(N));
    }

    @Test
    public void case44() {
        int N = 2793;
        assertEquals(1289, choosethebestone.countNumber(N));
    }

    @Test
    public void case45() {
        int N = 2566;
        assertEquals(1583, choosethebestone.countNumber(N));
    }

    @Test
    public void case46() {
        int N = 2856;
        assertEquals(2210, choosethebestone.countNumber(N));
    }

    @Test
    public void case47() {
        int N = 3607;
        assertEquals(2681, choosethebestone.countNumber(N));
    }

    @Test
    public void case48() {
        int N = 1080;
        assertEquals(380, choosethebestone.countNumber(N));
    }

    @Test
    public void case49() {
        int N = 2626;
        assertEquals(112, choosethebestone.countNumber(N));
    }

    @Test
    public void case50() {
        int N = 4207;
        assertEquals(923, choosethebestone.countNumber(N));
    }

    @Test
    public void case51() {
        int N = 2852;
        assertEquals(2549, choosethebestone.countNumber(N));
    }

    @Test
    public void case52() {
        int N = 2525;
        assertEquals(2112, choosethebestone.countNumber(N));
    }

    @Test
    public void case53() {
        int N = 2349;
        assertEquals(587, choosethebestone.countNumber(N));
    }

    @Test
    public void case54() {
        int N = 3063;
        assertEquals(2587, choosethebestone.countNumber(N));
    }

    @Test
    public void case55() {
        int N = 3306;
        assertEquals(2580, choosethebestone.countNumber(N));
    }

    @Test
    public void case56() {
        int N = 1902;
        assertEquals(1770, choosethebestone.countNumber(N));
    }

    @Test
    public void case57() {
        int N = 2141;
        assertEquals(1195, choosethebestone.countNumber(N));
    }

    @Test
    public void case58() {
        int N = 2637;
        assertEquals(2533, choosethebestone.countNumber(N));
    }

    @Test
    public void case59() {
        int N = 559;
        assertEquals(189, choosethebestone.countNumber(N));
    }

    @Test
    public void case60() {
        int N = 3037;
        assertEquals(228, choosethebestone.countNumber(N));
    }

    @Test
    public void case61() {
        int N = 3588;
        assertEquals(3478, choosethebestone.countNumber(N));
    }

    @Test
    public void case62() {
        int N = 4916;
        assertEquals(1508, choosethebestone.countNumber(N));
    }

    @Test
    public void case63() {
        int N = 4888;
        assertEquals(2755, choosethebestone.countNumber(N));
    }

    @Test
    public void case64() {
        int N = 1781;
        assertEquals(1471, choosethebestone.countNumber(N));
    }

    @Test
    public void case65() {
        int N = 929;
        assertEquals(662, choosethebestone.countNumber(N));
    }

    @Test
    public void case66() {
        int N = 867;
        assertEquals(813, choosethebestone.countNumber(N));
    }

    @Test
    public void case67() {
        int N = 2643;
        assertEquals(1740, choosethebestone.countNumber(N));
    }

    @Test
    public void case68() {
        int N = 1028;
        assertEquals(482, choosethebestone.countNumber(N));
    }

    @Test
    public void case69() {
        int N = 498;
        assertEquals(112, choosethebestone.countNumber(N));
    }

    @Test
    public void case70() {
        int N = 62;
        assertEquals(17, choosethebestone.countNumber(N));
    }

    @Test
    public void case71() {
        int N = 1235;
        assertEquals(606, choosethebestone.countNumber(N));
    }

    @Test
    public void case72() {
        int N = 386;
        assertEquals(89, choosethebestone.countNumber(N));
    }

    @Test
    public void case73() {
        int N = 3801;
        assertEquals(835, choosethebestone.countNumber(N));
    }

    @Test
    public void case74() {
        int N = 611;
        assertEquals(482, choosethebestone.countNumber(N));
    }

    @Test
    public void case75() {
        int N = 3748;
        assertEquals(1886, choosethebestone.countNumber(N));
    }

    @Test
    public void case76() {
        int N = 1433;
        assertEquals(733, choosethebestone.countNumber(N));
    }

    @Test
    public void case77() {
        int N = 612;
        assertEquals(72, choosethebestone.countNumber(N));
    }

    @Test
    public void case78() {
        int N = 56;
        assertEquals(20, choosethebestone.countNumber(N));
    }

    @Test
    public void case79() {
        int N = 2280;
        assertEquals(1986, choosethebestone.countNumber(N));
    }

    @Test
    public void case80() {
        int N = 101;
        assertEquals(12, choosethebestone.countNumber(N));
    }

    @Test
    public void case81() {
        int N = 3834;
        assertEquals(2837, choosethebestone.countNumber(N));
    }

    @Test
    public void case82() {
        int N = 4884;
        assertEquals(40, choosethebestone.countNumber(N));
    }

    @Test
    public void case83() {
        int N = 4338;
        assertEquals(45, choosethebestone.countNumber(N));
    }

    @Test
    public void case84() {
        int N = 2205;
        assertEquals(900, choosethebestone.countNumber(N));
    }

    @Test
    public void case85() {
        int N = 1;
        assertEquals(1, choosethebestone.countNumber(N));
    }

    @Test
    public void case86() {
        int N = 2;
        assertEquals(2, choosethebestone.countNumber(N));
    }

    @Test
    public void case87() {
        int N = 5000;
        assertEquals(4200, choosethebestone.countNumber(N));
    }

    @Test
    public void case88() {
        int N = 4999;
        assertEquals(1656, choosethebestone.countNumber(N));
    }

    @Test
    public void case89() {
        int N = 4000;
        assertEquals(1680, choosethebestone.countNumber(N));
    }

    @Test
    public void case90() {
        int N = 842;
        assertEquals(140, choosethebestone.countNumber(N));
    }

    @Test
    public void case91() {
        int N = 1765;
        assertEquals(45, choosethebestone.countNumber(N));
    }

    @Test
    public void case92() {
        int N = 4894;
        assertEquals(2035, choosethebestone.countNumber(N));
    }

}
