package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class GreatFairyWarTest {
    GreatFairyWar greatfairywar = new GreatFairyWar();

    @Test
    public void case1() {
        int[] dps = { 1, 2 };
        int[] hp = { 3, 4 };
        assertEquals(17, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case2() {
        int[] dps = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] hp = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(55, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case3() {
        int[] dps = { 20, 12, 10, 10, 23, 10 };
        int[] hp = { 5, 7, 7, 5, 7, 7 };
        assertEquals(1767, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case4() {
        int[] dps = { 5, 7, 7, 5, 7, 7 };
        int[] hp = { 20, 12, 10, 10, 23, 10 };
        assertEquals(1998, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case5() {
        int[] dps = { 30, 2, 7, 4, 7, 8, 21, 14, 19, 12 };
        int[] hp = { 2, 27, 18, 19, 14, 8, 25, 13, 21, 30 };
        assertEquals(11029, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case6() {
        int[] dps = { 1 };
        int[] hp = { 1 };
        assertEquals(1, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case7() {
        int[] dps = { 8, 19, 7, 12, 16, 16, 10, 10, 10, 18, 14, 17, 8, 18, 12, 15 };
        int[] hp = { 17, 8, 9, 18, 11, 10, 11, 7, 7, 12, 13, 18, 17, 13, 13, 10 };
        assertEquals(21938, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case8() {
        int[] dps = { 5, 1, 5, 2, 7, 7, 6, 7, 5, 5, 1, 6, 5, 1, 5, 5, 2, 1, 1 };
        int[] hp = { 2, 5, 2, 3, 6, 5, 4, 2, 3, 2, 3, 7, 6, 5, 7, 2, 2, 5, 7 };
        assertEquals(2585, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case9() {
        int[] dps = { 5, 6, 6, 5, 4, 5, 4, 5 };
        int[] hp = { 4, 4, 4, 6, 6, 6, 5, 5 };
        assertEquals(816, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case10() {
        int[] dps = { 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4 };
        int[] hp = { 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4 };
        assertEquals(1056, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case11() {
        int[] dps = { 12, 8, 15, 11, 10, 9, 10, 11, 15, 15, 11, 9, 14, 13, 12, 12, 11, 9, 10, 10, 10 };
        int[] hp = { 14, 13, 9, 15, 9, 14, 11, 8, 8, 9, 13, 14, 15, 9, 15, 9, 15, 15, 14, 12, 11 };
        assertEquals(30283, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case12() {
        int[] dps = { 2, 1, 2, 1, 2, 2, 1, 1, 2, 1, 1, 2, 2, 2 };
        int[] hp = { 1, 2, 2, 2, 2, 2, 1, 1, 1, 2, 2, 2, 2, 1 };
        assertEquals(279, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case13() {
        int[] dps = { 3, 5, 5, 5, 1, 1, 1, 2, 2, 2, 4, 2, 5, 5, 2, 1, 4, 1 };
        int[] hp = { 2, 4, 3, 1, 2, 2, 4, 4, 2, 1, 4, 3, 1, 5, 5, 1, 1, 2 };
        assertEquals(1209, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case14() {
        int[] dps = { 19, 19, 20, 19, 19, 20, 19, 19, 20, 19, 20, 19, 20, 20, 20, 19 };
        int[] hp = { 20, 20, 19, 20, 19, 19, 20, 19, 19, 19, 19, 20, 20, 20, 20, 19 };
        assertEquals(51771, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case15() {
        int[] dps = { 4, 7, 6, 2, 5, 3, 2, 6, 2, 5 };
        int[] hp = { 6, 6, 2, 7, 3, 7, 5, 4, 2, 2 };
        assertEquals(1063, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case16() {
        int[] dps = { 6, 3, 3, 3, 4, 8, 6, 5, 4, 8, 7, 7, 8, 2, 2, 2, 6, 5, 6, 2, 3, 3 };
        int[] hp = { 3, 5, 3, 3, 8, 5, 2, 3, 4, 5, 7, 3, 7, 4, 7, 6, 4, 8, 4, 6, 5, 8 };
        assertEquals(5081, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case17() {
        int[] dps = { 4, 6, 7, 4, 7, 5, 4, 4, 5, 5, 6, 5, 6, 4, 5, 6, 6, 5, 6, 4, 4, 7, 6, 5, 5, 6, 7, 6 };
        int[] hp = { 7, 4, 6, 7, 7, 4, 7, 6, 5, 4, 4, 5, 6, 7, 7, 5, 7, 6, 7, 6, 6, 5, 4, 4, 5, 6, 7, 5 };
        assertEquals(12752, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case18() {
        int[] dps = { 10, 11, 11 };
        int[] hp = { 11, 10, 10 };
        assertEquals(682, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case19() {
        int[] dps = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] hp = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(105, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case20() {
        int[] dps = { 9, 5, 1, 3, 10, 10, 9, 8, 4, 7, 8, 2, 9, 4, 6, 7, 9, 5, 1, 5, 10 };
        int[] hp = { 8, 1, 4, 6, 9, 5, 8, 9, 6, 4, 4, 10, 9, 8, 9, 9, 6, 1, 8, 3, 4 };
        assertEquals(9028, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case21() {
        int[] dps = { 8, 21, 20, 19, 25, 29, 12, 16, 27, 10, 16, 22, 23, 16, 9, 24 };
        int[] hp = { 22, 16, 20, 13, 23, 18, 21, 17, 13, 11, 18, 22, 15, 21, 17, 14 };
        assertEquals(45412, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case22() {
        int[] dps = { 6, 6, 3, 16, 12, 16, 16, 5, 18, 11, 17, 19, 14, 15, 10, 18, 9 };
        int[] hp = { 18, 4, 15, 17, 3, 8, 8, 18, 8, 4, 17, 19, 15, 4, 3, 15, 7 };
        assertEquals(23109, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case23() {
        int[] dps = { 25, 25, 13, 16, 18, 21, 19, 18, 14, 20 };
        int[] hp = { 20, 23, 18, 23, 27, 22, 28, 14, 13, 25 };
        assertEquals(21604, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case24() {
        int[] dps = { 5, 6, 5, 5, 5, 6, 5 };
        int[] hp = { 7, 7, 5, 5, 7, 7, 6 };
        assertEquals(937, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case25() {
        int[] dps = { 6, 13, 14, 15, 4, 6, 6, 13, 6 };
        int[] hp = { 11, 4, 14, 13, 5, 5, 4, 6, 15 };
        assertEquals(3401, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case26() {
        int[] dps = { 11, 14, 11, 14, 11, 11, 13, 11, 13, 14, 13, 11, 12, 10, 10, 9, 12, 10, 13, 12 };
        int[] hp = { 13, 9, 10, 13, 11, 9, 11, 14, 10, 10, 13, 13, 13, 14, 13, 9, 10, 13, 12, 14 };
        assertEquals(27608, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case27() {
        int[] dps = { 13, 13, 10, 11, 11, 10, 11, 13, 10, 11, 12, 10, 11, 12, 11, 12 };
        int[] hp = { 12, 12, 10, 12, 11, 11, 10, 13, 10, 12, 13, 11, 12, 10, 13, 13 };
        assertEquals(17456, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case28() {
        int[] dps = { 12, 10 };
        int[] hp = { 11, 11 };
        assertEquals(352, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case29() {
        int[] dps = { 16, 21, 18, 16, 21, 12, 13, 12, 13, 15, 13, 11, 16, 17, 11 };
        int[] hp = { 14, 18, 21, 14, 18, 13, 16, 12, 14, 19, 18, 18, 13, 16, 14 };
        assertEquals(27282, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case30() {
        int[] dps = { 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6 };
        int[] hp = { 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6 };
        assertEquals(2376, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case31() {
        int[] dps = { 18, 13, 5, 12, 11, 5, 10, 13, 13, 14, 15, 12, 18 };
        int[] hp = { 9, 9, 7, 15, 7, 5, 18, 11, 13, 9, 13, 6, 16 };
        assertEquals(11883, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case32() {
        int[] dps = { 19, 18, 19, 19, 19, 17 };
        int[] hp = { 18, 18, 17, 19, 19, 17 };
        assertEquals(6930, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case33() {
        int[] dps = { 28, 28, 28, 26, 27, 25, 27, 28, 25, 27, 28, 25, 25, 25, 28, 27 };
        int[] hp = { 25, 27, 28, 26, 25, 28, 26, 27, 26, 25, 25, 28, 26, 28, 27, 28 };
        assertEquals(95001, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case34() {
        int[] dps = { 12, 12, 10, 13, 14, 14, 12, 11, 12, 13, 14, 12, 10, 14, 10, 13, 13, 10 };
        int[] hp = { 11, 13, 12, 11, 14, 10, 11, 14, 14, 11, 13, 11, 12, 14, 12, 12, 12, 12 };
        assertEquals(24998, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case35() {
        int[] dps = { 27, 26, 26, 29 };
        int[] hp = { 26, 29, 26, 29 };
        assertEquals(7428, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case36() {
        int[] dps = { 5, 2, 4, 5, 2, 3 };
        int[] hp = { 2, 1, 3, 1, 5, 1 };
        assertEquals(138, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case37() {
        int[] dps = { 11, 10, 8, 10, 9 };
        int[] hp = { 10, 10, 9, 8, 9 };
        assertEquals(1326, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case38() {
        int[] dps = { 2, 2, 1, 2, 2, 2, 1, 2, 2, 1, 2, 1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 2, 1 };
        int[] hp = { 1, 1, 1, 2, 1, 1, 2, 2, 2, 1, 1, 1, 2, 1, 2, 2, 2, 1, 2, 2, 1, 1, 2, 1, 1, 1, 1, 2, 2 };
        assertEquals(833, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case39() {
        int[] dps = { 13, 4, 5, 9, 7, 9 };
        int[] hp = { 4, 4, 6, 13, 4, 4 };
        assertEquals(929, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case40() {
        int[] dps = { 15, 14, 13, 14, 17, 14, 14, 16, 13, 17 };
        int[] hp = { 15, 14, 16, 12, 13, 15, 17, 16, 12, 15 };
        assertEquals(11865, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case41() {
        int[] dps = { 25, 29 };
        int[] hp = { 29, 26 };
        assertEquals(2320, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case42() {
        int[] dps = { 24, 23, 25, 23, 22 };
        int[] hp = { 23, 25, 24, 24, 25 };
        assertEquals(8326, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case43() {
        int[] dps = { 4, 4, 4, 9, 2, 7, 4, 3, 7, 4, 2 };
        int[] hp = { 4, 3, 6, 3, 9, 2, 2, 6, 8, 5, 2 };
        assertEquals(1293, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case44() {
        int[] dps = { 18, 19, 21, 22, 21, 22, 21, 19, 23, 18, 23, 18, 24, 19, 24, 22, 19, 21 };
        int[] hp = { 19, 18, 23, 22, 22, 20, 24, 22, 18, 22, 18, 24, 19, 19, 22, 19, 20, 24 };
        assertEquals(74571, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case45() {
        int[] dps = { 5, 7, 9, 12, 11, 7, 9, 8, 8, 5, 17, 3, 12, 3, 13, 7 };
        int[] hp = { 17, 15, 15, 9, 13, 8, 10, 9, 6, 17, 4, 3, 13, 16, 10, 13 };
        assertEquals(13657, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case46() {
        int[] dps = { 10, 14, 15, 14 };
        int[] hp = { 22, 8, 6, 4 };
        assertEquals(1740, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case47() {
        int[] dps = { 20, 24 };
        int[] hp = { 28, 22 };
        assertEquals(1760, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case48() {
        int[] dps = { 3, 3, 4, 10, 9, 4, 9, 5, 5, 4, 9, 4 };
        int[] hp = { 4, 11, 10, 7, 8, 5, 7, 8, 5, 6, 3, 3 };
        assertEquals(3368, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case49() {
        int[] dps = { 8, 22, 11, 10, 24, 23, 14, 14, 13, 24, 17, 18, 18, 4, 15, 5, 14, 10, 13, 6 };
        int[] hp = { 2, 8, 8, 19, 19, 7, 19, 12, 18, 18, 9, 19, 11, 25, 5, 15, 25, 5, 25, 9 };
        assertEquals(34668, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case50() {
        int[] dps = { 15, 18, 16 };
        int[] hp = { 21, 15, 18 };
        assertEquals(1827, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case51() {
        int[] dps = { 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };
        int[] hp = { 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };
        assertEquals(702, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case52() {
        int[] dps = { 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22 };
        int[] hp = { 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22 };
        assertEquals(44044, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case53() {
        int[] dps = { 6, 6, 7, 7, 7, 6, 7, 6, 6, 7, 6, 6, 7 };
        int[] hp = { 7, 7, 6, 6, 6, 7, 7, 6, 6, 7, 7, 7, 6 };
        assertEquals(3844, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case54() {
        int[] dps = { 7, 7, 7, 7, 7, 7, 7 };
        int[] hp = { 7, 7, 7, 7, 7, 7, 7 };
        assertEquals(1372, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case55() {
        int[] dps = { 19, 19, 23, 23, 25, 25, 23, 24, 21, 23, 22, 27, 25, 25, 23, 25, 22, 23, 26, 24, 22, 27, 24, 27, 26, 27, 24, 25, 21, 25 };
        int[] hp = { 21, 22, 21, 26, 23, 24, 20, 23, 24, 25, 26, 22, 26, 21, 23, 25, 23, 23, 19, 22, 22, 19, 27, 21, 23, 24, 23, 25, 19, 20 };
        assertEquals(259513, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case56() {
        int[] dps = { 10, 11, 8, 12, 11, 9, 10, 10, 11, 8, 12, 10, 8, 10, 11, 12, 8 };
        int[] hp = { 12, 10, 11, 12, 8, 11, 10, 12, 10, 11, 8, 9, 9, 11, 9, 10, 11 };
        assertEquals(15992, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case57() {
        int[] dps = { 22, 19, 10, 14, 24, 28, 12, 10, 11, 7, 27, 9, 11, 12 };
        int[] hp = { 15, 8, 14, 21, 26, 14, 12, 10, 20, 11, 21, 16, 14, 28 };
        assertEquals(23144, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case58() {
        int[] dps = { 13, 14, 14, 13, 14, 13, 14, 14, 14, 14, 14, 14, 13, 13, 13, 14, 14, 14, 14, 14, 14, 14, 14, 14, 13, 13 };
        int[] hp = { 14, 14, 13, 14, 13, 14, 13, 14, 14, 14, 13, 14, 13, 14, 14, 14, 13, 14, 13, 14, 13, 14, 13, 14, 14, 14 };
        assertEquals(65640, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case59() {
        int[] dps = { 2, 4 };
        int[] hp = { 1, 1 };
        assertEquals(10, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case60() {
        int[] dps = { 15, 22, 11 };
        int[] hp = { 13, 22, 19 };
        assertEquals(1559, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case61() {
        int[] dps = { 20 };
        int[] hp = { 20 };
        assertEquals(400, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case62() {
        int[] dps = { 6, 7, 5, 6, 4, 5 };
        int[] hp = { 5, 5, 6, 3, 8, 7 };
        assertEquals(572, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case63() {
        int[] dps = { 19, 21, 26, 25, 14, 18, 24, 24, 14, 18, 20, 17, 19, 18, 20, 19, 17, 17, 14, 15 };
        int[] hp = { 19, 18, 14, 26, 24, 17, 26, 20, 20, 20, 17, 22, 20, 15, 23, 14, 17, 23, 16, 19 };
        assertEquals(74847, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case64() {
        int[] dps = { 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7 };
        int[] hp = { 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7 };
        assertEquals(19894, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case65() {
        int[] dps = { 30, 11, 17, 15, 28, 22 };
        int[] hp = { 25, 28, 26, 3, 21, 12 };
        assertEquals(9320, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case66() {
        int[] dps = { 22, 22, 22, 21, 22 };
        int[] hp = { 22, 21, 22, 22, 22 };
        assertEquals(7085, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case67() {
        int[] dps = { 7, 13, 9, 13, 19, 11, 4, 11, 5, 5, 18, 18, 17, 9, 4, 13, 4, 4, 18 };
        int[] hp = { 21, 8, 6, 4, 14, 14, 5, 11, 20, 14, 7, 14, 17, 6, 21, 20, 11, 17, 9 };
        assertEquals(23619, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case68() {
        int[] dps = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
        int[] hp = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
        assertEquals(760, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case69() {
        int[] dps = { 8, 7, 7, 8, 9, 9, 9, 9, 9, 9, 9, 7, 8, 7, 8 };
        int[] hp = { 7, 8, 8, 8, 9, 7, 7, 7, 8, 7, 9, 7, 9, 9, 9 };
        assertEquals(7632, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case70() {
        int[] dps = { 15, 16, 10, 10, 17, 16, 13, 13, 9, 17, 15, 13, 9, 10, 15, 11 };
        int[] hp = { 17, 13, 16, 16, 11, 12, 9, 17, 12, 16, 11, 11, 15, 11, 14, 15 };
        assertEquals(23739, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case71() {
        int[] dps = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] hp = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(435, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case72() {
        int[] dps = { 16, 18, 17, 17, 18, 16, 16, 17, 18, 17, 15, 18, 16, 16, 17, 16, 16, 15, 17, 16, 18, 18, 18, 17, 15, 15 };
        int[] hp = { 18, 16, 15, 17, 15, 17, 16, 17, 17, 17, 16, 17, 18, 17, 17, 18, 17, 15, 16, 15, 15, 17, 18, 18, 18, 18 };
        assertEquals(96313, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case73() {
        int[] dps = { 9, 4, 9, 4, 8, 1, 8, 6, 8, 4, 4, 6, 9, 7, 2, 8, 2, 9, 2, 2, 5, 5, 6, 4, 4, 2, 3, 5 };
        int[] hp = { 8, 2, 1, 5, 7, 9, 6, 5, 4, 7, 5, 3, 5, 5, 3, 9, 4, 7, 9, 8, 5, 8, 3, 1, 3, 7, 5, 9 };
        assertEquals(10142, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case74() {
        int[] dps = { 23, 22, 20, 21, 22, 21, 22, 21, 20, 20, 22, 20, 23, 21, 21 };
        int[] hp = { 21, 22, 23, 20, 23, 20, 22, 22, 23, 20, 21, 21, 20, 23, 20 };
        assertEquals(54687, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case75() {
        int[] dps = { 12, 11, 11, 11, 11, 12, 12, 11, 12, 12, 12, 11, 11, 12, 11, 11, 11, 11, 12 };
        int[] hp = { 11, 12, 11, 12, 11, 11, 12, 12, 11, 11, 12, 12, 11, 12, 12, 12, 11, 11, 12 };
        assertEquals(24884, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case76() {
        int[] dps = { 15, 21, 22, 20, 19, 19 };
        int[] hp = { 28, 27, 23, 21, 24, 19 };
        assertEquals(10306, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case77() {
        int[] dps = { 22, 22, 26, 22, 25, 20, 28, 28, 27, 17, 21, 16 };
        int[] hp = { 23, 24, 28, 19, 28, 17, 28, 25, 16, 17, 27, 18 };
        assertEquals(40493, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case78() {
        int[] dps = { 27, 26, 25, 27, 26, 27, 25, 26, 27, 27, 27, 27 };
        int[] hp = { 26, 27, 26, 25, 26, 27, 26, 25, 26, 25, 27, 25 };
        assertEquals(53895, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case79() {
        int[] dps = { 4, 5, 5, 2, 4, 6, 6, 6 };
        int[] hp = { 5, 7, 7, 4, 4, 7, 7, 6 };
        assertEquals(1061, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case80() {
        int[] dps = { 18, 17, 16, 16, 16, 17, 20, 20, 20, 17, 20, 16, 18, 16, 18, 16, 16, 17, 19, 16, 20, 20, 20, 19, 19, 17, 20, 17, 20, 20 };
        int[] hp = { 16, 18, 16, 17, 19, 19, 18, 20, 17, 17, 20, 16, 16, 20, 18, 19, 19, 20, 20, 18, 17, 18, 18, 18, 16, 20, 19, 20, 16, 19 };
        assertEquals(153511, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case81() {
        int[] dps = { 9, 11, 9, 9, 2, 7, 2, 5, 10, 3, 2, 8, 11, 4, 9, 7, 9, 6, 5, 2 };
        int[] hp = { 6, 5, 4, 3, 6, 7, 5, 7, 5, 5, 7, 7, 11, 10, 9, 5, 10, 5, 10, 9 };
        assertEquals(7733, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case82() {
        int[] dps = { 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7 };
        int[] hp = { 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7 };
        assertEquals(7497, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case83() {
        int[] dps = { 24, 24, 25, 25, 23, 24, 24, 25, 23, 24, 25, 25, 23, 23, 24, 23, 23, 23, 23, 23, 25, 23, 23, 25, 23, 24, 23, 23 };
        int[] hp = { 24, 23, 24, 24, 25, 23, 25, 23, 24, 24, 24, 24, 24, 23, 24, 23, 25, 25, 23, 23, 24, 23, 23, 24, 23, 23, 23, 24 };
        assertEquals(228033, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case84() {
        int[] dps = { 28, 28, 28, 27, 27, 28, 27, 28 };
        int[] hp = { 28, 28, 28, 27, 28, 28, 27, 27 };
        assertEquals(27556, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case85() {
        int[] dps = { 7, 8, 4, 7, 10, 10, 5, 4, 9, 10, 8, 8, 9, 5, 4, 10 };
        int[] hp = { 6, 6, 4, 4, 6, 5, 7, 9, 9, 10, 6, 3, 6, 4, 7, 7 };
        assertEquals(6142, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case86() {
        int[] dps = { 9, 9, 7, 11, 9, 8, 6, 10, 13, 6, 10, 4, 12, 10, 7, 9, 7, 7, 4, 13, 13, 4, 13, 5, 11, 11, 13, 13, 7 };
        int[] hp = { 8, 5, 8, 5, 9, 6, 13, 6, 6, 10, 8, 8, 9, 6, 10, 10, 7, 5, 8, 11, 13, 4, 6, 5, 11, 7, 12, 9, 12 };
        assertEquals(31517, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case87() {
        int[] dps = { 17, 20, 20, 19, 21, 17, 16, 16, 23, 22, 16, 22, 23, 24, 23, 19, 20, 16, 23, 16, 20, 22, 17 };
        int[] hp = { 19, 21, 19, 24, 22, 16, 22, 16, 21, 19, 16, 20, 20, 18, 18, 17, 17, 18, 19, 17, 24, 19, 24 };
        assertEquals(106368, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case88() {
        int[] dps = { 3, 1, 1, 3, 3, 3, 2, 1, 2, 3, 1, 2, 2, 1, 1, 1, 3, 3, 2, 2, 2, 1, 3, 3, 1, 2, 1, 3, 1 };
        int[] hp = { 2, 2, 3, 2, 1, 1, 3, 3, 3, 1, 2, 1, 3, 1, 2, 3, 3, 2, 1, 2, 1, 2, 2, 3, 1, 3, 2, 1, 2 };
        assertEquals(1703, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case89() {
        int[] dps = { 2, 2, 3, 4, 2, 4, 2, 2, 3, 3, 3, 4, 4, 4, 3, 2, 3, 4, 3, 3, 2, 3, 3, 2, 3, 3 };
        int[] hp = { 3, 3, 4, 4, 2, 4, 4, 3, 3, 2, 4, 4, 4, 4, 2, 2, 4, 4, 2, 2, 3, 4, 2, 3, 4, 3 };
        assertEquals(3387, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case90() {
        int[] dps = { 7, 6, 6, 6, 6, 8, 8, 6, 8, 8, 7, 7, 7, 9, 9, 7, 6, 8, 7, 6, 7 };
        int[] hp = { 6, 8, 9, 7, 8, 7, 9, 7, 7, 8, 6, 9, 9, 7, 7, 8, 7, 6, 7, 7, 9 };
        assertEquals(12584, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case91() {
        int[] dps = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] hp = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(105, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case92() {
        int[] dps = { 8, 2, 6, 13, 13 };
        int[] hp = { 6, 4, 9, 7, 3 };
        assertEquals(897, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case93() {
        int[] dps = { 15, 15, 11, 13, 11, 11 };
        int[] hp = { 13, 11, 12, 13, 12, 15 };
        assertEquals(3095, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case94() {
        int[] dps = { 22, 24, 25, 23, 17, 17, 24, 18, 17, 25, 16, 23, 18, 20, 19, 22, 21, 21, 20, 15, 21, 16, 18, 15, 25, 18 };
        int[] hp = { 22, 19, 22, 20, 16, 19, 18, 24, 20, 24, 17, 16, 18, 21, 16, 24, 18, 23, 25, 18, 16, 15, 18, 24, 15, 15 };
        assertEquals(134756, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case95() {
        int[] dps = { 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6 };
        int[] hp = { 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6 };
        assertEquals(9108, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case96() {
        int[] dps = { 18, 14, 11, 14, 21, 21, 23 };
        int[] hp = { 8, 21, 8, 17, 17, 21, 16 };
        assertEquals(7620, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case97() {
        int[] dps = { 6, 6, 6, 6, 6, 6, 6, 6, 6 };
        int[] hp = { 6, 6, 6, 6, 6, 6, 6, 6, 6 };
        assertEquals(1620, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case98() {
        int[] dps = { 11, 12, 8, 11, 14, 8, 8, 8, 13 };
        int[] hp = { 11, 13, 12, 11, 16, 10, 8, 9, 11 };
        assertEquals(5361, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case99() {
        int[] dps = { 9, 9, 10, 9, 9, 9, 9, 9, 9, 10, 9, 10 };
        int[] hp = { 9, 10, 10, 9, 9, 10, 9, 9, 10, 10, 10, 9 };
        assertEquals(6889, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case100() {
        int[] dps = { 8, 8, 8, 8, 8, 8, 8, 8 };
        int[] hp = { 8, 8, 8, 8, 8, 8, 8, 8 };
        assertEquals(2304, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case101() {
        int[] dps = { 11, 7, 9, 7, 9, 11, 7, 10, 8, 11, 9, 8, 9, 9, 9 };
        int[] hp = { 10, 8, 7, 7, 11, 9, 8, 8, 10, 7, 11, 9, 10, 11, 9 };
        assertEquals(9391, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case102() {
        int[] dps = { 8 };
        int[] hp = { 16 };
        assertEquals(128, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case103() {
        int[] dps = { 8, 15, 6, 9, 8, 13, 10 };
        int[] hp = { 14, 4, 14, 15, 2, 14, 7 };
        assertEquals(2908, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case104() {
        int[] dps = { 12, 16, 17, 18, 16, 17, 13, 15, 14, 16, 17, 16, 18, 12, 17, 18, 12, 18, 14, 18 };
        int[] hp = { 15, 17, 13, 12, 18, 12, 16, 18, 14, 18, 17, 12, 18, 16, 14, 18, 13, 12, 17, 14 };
        assertEquals(50600, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case105() {
        int[] dps = { 11, 6, 12, 9, 14, 8, 10, 16, 16, 9 };
        int[] hp = { 8, 10, 7, 13, 6, 8, 8, 6, 10, 10 };
        assertEquals(5516, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case106() {
        int[] dps = { 4, 5, 5, 4, 5, 5, 6, 7, 5, 8, 4, 6 };
        int[] hp = { 6, 6, 4, 3, 3, 6, 7, 8, 4, 3, 5, 6 };
        assertEquals(2222, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case107() {
        int[] dps = { 20, 18, 20, 18, 14, 19, 15, 19, 21, 15, 20, 19, 20, 18, 17, 14 };
        int[] hp = { 17, 17, 14, 15, 15, 16, 20, 21, 17, 21, 21, 14, 17, 15, 19, 21 };
        assertEquals(40961, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case108() {
        int[] dps = { 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 11, 11, 12, 12, 12, 12, 12 };
        int[] hp = { 12, 11, 12, 12, 11, 12, 12, 12, 11, 11, 12, 12, 12, 12, 12, 11, 12, 11, 12 };
        assertEquals(25682, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case109() {
        int[] dps = { 5, 5, 15, 15, 5, 4, 13, 11, 11, 12, 17, 10, 15, 5, 12, 17, 12, 3, 3, 16 };
        int[] hp = { 14, 14, 7, 14, 7, 8, 10, 15, 12, 13, 12, 6, 7, 17, 17, 12, 9, 17, 9, 18 };
        assertEquals(25403, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case110() {
        int[] dps = { 28, 19, 22, 29, 24, 21, 19, 24, 29, 23, 19, 23, 25, 26, 25, 19, 23, 20, 25, 22, 26, 27, 25, 26, 24, 22, 29, 19, 24 };
        int[] hp = { 20, 29, 21, 28, 28, 20, 22, 21, 28, 19, 22, 21, 28, 28, 23, 25, 25, 27, 25, 24, 21, 29, 22, 21, 27, 29, 29, 26, 27 };
        assertEquals(249877, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case111() {
        int[] dps = { 13, 25, 25, 21, 24, 24, 21, 21, 12, 14 };
        int[] hp = { 27, 16, 17, 19, 12, 24, 23, 18, 15, 21 };
        assertEquals(20443, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case112() {
        int[] dps = { 3, 2, 3, 2, 3 };
        int[] hp = { 2, 2, 3, 2, 2 };
        assertEquals(86, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case113() {
        int[] dps = { 1, 3, 1, 2, 3, 3, 1, 2, 3, 1, 1, 1, 3, 3, 1, 2, 2, 2, 3, 2, 2, 1, 2, 3, 3, 3, 1 };
        int[] hp = { 3, 1, 3, 3, 3, 3, 1, 2, 3, 3, 1, 2, 2, 2, 1, 2, 2, 1, 1, 2, 2, 2, 2, 2, 2, 3, 2 };
        assertEquals(1710, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case114() {
        int[] dps = { 22, 21, 22, 21, 22, 21 };
        int[] hp = { 21, 22, 22, 22, 22, 21 };
        assertEquals(9750, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case115() {
        int[] dps = { 6, 8, 8, 4, 4, 5, 4, 4, 5, 6, 5, 5, 5, 4, 8 };
        int[] hp = { 8, 6, 4, 4, 8, 6, 5, 7, 4, 7, 4, 4, 6, 7, 5 };
        assertEquals(3677, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case116() {
        int[] dps = { 29, 13, 27, 25, 25, 19, 29, 18, 20, 23, 13, 18, 26, 16, 14, 26, 24, 13, 24, 16, 22, 27, 17, 20, 29, 17, 26, 15, 24, 26 };
        int[] hp = { 26, 17, 18, 18, 17, 29, 29, 18, 21, 19, 29, 15, 26, 21, 15, 15, 16, 21, 17, 13, 14, 28, 20, 24, 18, 29, 24, 17, 28, 26 };
        assertEquals(204074, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case117() {
        int[] dps = { 1 };
        int[] hp = { 1 };
        assertEquals(1, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case118() {
        int[] dps = { 2, 2, 2, 2, 2, 2 };
        int[] hp = { 2, 2, 2, 2, 2, 2 };
        assertEquals(84, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case119() {
        int[] dps = { 8, 6, 7, 6, 6, 6, 7, 8, 7, 8, 8, 7, 8 };
        int[] hp = { 7, 7, 7, 6, 8, 6, 7, 6, 7, 8, 6, 7, 8 };
        assertEquals(4546, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case120() {
        int[] dps = { 27, 12, 24, 7, 20, 21, 12, 6, 20, 10, 25, 6, 20, 6, 15, 17, 10, 10, 7 };
        int[] hp = { 24, 24, 13, 15, 25, 24, 8, 15, 20, 22, 17, 13, 12, 23, 22, 14, 19, 6, 26 };
        assertEquals(46030, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case121() {
        int[] dps = { 13, 18, 16, 16, 13 };
        int[] hp = { 16, 14, 14, 12, 18 };
        assertEquals(3310, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case122() {
        int[] dps = { 7, 7, 7, 8, 7, 7, 7, 8 };
        int[] hp = { 8, 7, 7, 8, 8, 7, 7, 8 };
        assertEquals(1980, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case123() {
        int[] dps = { 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23 };
        int[] hp = { 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23 };
        assertEquals(100510, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case124() {
        int[] dps = { 9, 11, 23, 17, 18, 23, 17, 11, 25 };
        int[] hp = { 8, 23, 25, 17, 16, 27, 18, 19, 21 };
        assertEquals(15523, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case125() {
        int[] dps = { 21, 20, 22, 25, 25, 26, 23, 25, 20, 23, 25, 20, 21, 24, 20, 24, 21, 21, 20, 26, 24, 20, 24, 22, 20, 21 };
        int[] hp = { 23, 26, 25, 24, 20, 24, 22, 25, 23, 21, 22, 21, 23, 24, 21, 20, 21, 25, 25, 21, 22, 23, 26, 23, 24, 24 };
        assertEquals(179350, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case126() {
        int[] dps = { 17, 17, 17, 17, 17, 17, 17, 17 };
        int[] hp = { 17, 17, 17, 17, 17, 17, 17, 17 };
        assertEquals(10404, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case127() {
        int[] dps = { 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30 };
        int[] hp = { 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30 };
        assertEquals(418500, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case128() {
        int[] dps = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] hp = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(55, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case129() {
        int[] dps = { 30, 2, 7, 4, 7, 8, 21, 14, 19, 12 };
        int[] hp = { 2, 27, 18, 19, 14, 8, 25, 13, 21, 30 };
        assertEquals(11029, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case130() {
        int[] dps = { 1, 2 };
        int[] hp = { 3, 4 };
        assertEquals(17, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case131() {
        int[] dps = { 30, 1, 1, 1, 1 };
        int[] hp = { 30, 1, 1, 1, 1 };
        assertEquals(1030, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case132() {
        int[] dps = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] hp = { 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30 };
        assertEquals(6300, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case133() {
        int[] dps = { 1 };
        int[] hp = { 30 };
        assertEquals(30, greatfairywar.minHP(dps, hp));
    }

    @Test
    public void case134() {
        int[] dps = { 5, 4, 3, 2, 1 };
        int[] hp = { 30, 1, 2, 30, 30 };
        assertEquals(592, greatfairywar.minHP(dps, hp));
    }

}
