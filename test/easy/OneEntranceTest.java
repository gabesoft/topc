package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class OneEntranceTest {
    OneEntrance oneentrance = new OneEntrance();

    @Test
    public void case1() {
        int[] a = { 0, 1, 2 };
        int[] b = { 1, 2, 3 };
        int s = 0;
        assertEquals(1, oneentrance.count(a, b, s));
    }

    @Test
    public void case2() {
        int[] a = { 0, 1, 2 };
        int[] b = { 1, 2, 3 };
        int s = 2;
        assertEquals(3, oneentrance.count(a, b, s));
    }

    @Test
    public void case3() {
        int[] a = { 0, 0, 0, 0 };
        int[] b = { 1, 2, 3, 4 };
        int s = 0;
        assertEquals(24, oneentrance.count(a, b, s));
    }

    @Test
    public void case4() {
        int[] a = { 7, 4, 1, 0, 1, 1, 6, 0 };
        int[] b = { 6, 6, 2, 5, 0, 3, 8, 4 };
        int s = 4;
        assertEquals(896, oneentrance.count(a, b, s));
    }

    @Test
    public void case5() {
        int[] a = {  };
        int[] b = {  };
        int s = 0;
        assertEquals(1, oneentrance.count(a, b, s));
    }

    @Test
    public void case6() {
        int[] a = { 6, 8, 0, 7, 4, 4, 1, 3 };
        int[] b = { 0, 3, 5, 0, 6, 2, 4, 6 };
        int s = 3;
        assertEquals(640, oneentrance.count(a, b, s));
    }

    @Test
    public void case7() {
        int[] a = { 6, 1, 8, 2, 0, 6, 3, 1 };
        int[] b = { 0, 6, 6, 5, 7, 5, 4, 3 };
        int s = 0;
        assertEquals(480, oneentrance.count(a, b, s));
    }

    @Test
    public void case8() {
        int[] a = { 4, 3, 8, 0, 3, 1, 5, 2 };
        int[] b = { 0, 8, 7, 6, 0, 0, 1, 3 };
        int s = 0;
        assertEquals(2520, oneentrance.count(a, b, s));
    }

    @Test
    public void case9() {
        int[] a = { 4, 2, 6, 6, 2, 0, 8, 7 };
        int[] b = { 2, 5, 1, 7, 3, 2, 7, 3 };
        int s = 0;
        assertEquals(126, oneentrance.count(a, b, s));
    }

    @Test
    public void case10() {
        int[] a = { 2, 8, 8, 4, 8, 6, 1, 8 };
        int[] b = { 3, 0, 4, 5, 2, 7, 8, 7 };
        int s = 0;
        assertEquals(630, oneentrance.count(a, b, s));
    }

    @Test
    public void case11() {
        int[] a = { 6, 6, 7, 7, 6, 8, 4, 5 };
        int[] b = { 2, 0, 3, 6, 1, 2, 8, 7 };
        int s = 6;
        assertEquals(2240, oneentrance.count(a, b, s));
    }

    @Test
    public void case12() {
        int[] a = { 0, 4, 4, 7, 3, 3, 4, 5 };
        int[] b = { 3, 6, 1, 8, 7, 2, 3, 7 };
        int s = 5;
        assertEquals(280, oneentrance.count(a, b, s));
    }

    @Test
    public void case13() {
        int[] a = { 2, 3, 4, 1, 8, 6, 1, 1 };
        int[] b = { 8, 5, 5, 4, 0, 4, 8, 7 };
        int s = 0;
        assertEquals(105, oneentrance.count(a, b, s));
    }

    @Test
    public void case14() {
        int[] a = { 7, 6, 2, 1, 1, 2, 4, 1 };
        int[] b = { 1, 3, 0, 8, 4, 6, 5, 0 };
        int s = 1;
        assertEquals(840, oneentrance.count(a, b, s));
    }

    @Test
    public void case15() {
        int[] a = { 8, 5, 0, 0, 2, 1, 2, 4 };
        int[] b = { 3, 8, 8, 7, 5, 2, 6, 8 };
        int s = 1;
        assertEquals(84, oneentrance.count(a, b, s));
    }

    @Test
    public void case16() {
        int[] a = { 2, 0, 1, 6, 7, 0, 5, 1 };
        int[] b = { 8, 7, 3, 4, 4, 2, 4, 6 };
        int s = 3;
        assertEquals(5, oneentrance.count(a, b, s));
    }

    @Test
    public void case17() {
        int[] a = { 7, 0, 1, 2, 6, 5, 0, 5 };
        int[] b = { 4, 6, 8, 8, 5, 8, 4, 3 };
        int s = 8;
        assertEquals(280, oneentrance.count(a, b, s));
    }

    @Test
    public void case18() {
        int[] a = { 6, 3, 6, 4, 6, 5, 1, 8 };
        int[] b = { 2, 6, 0, 7, 4, 7, 6, 7 };
        int s = 5;
        assertEquals(168, oneentrance.count(a, b, s));
    }

    @Test
    public void case19() {
        int[] a = { 6, 3, 0, 8, 8, 1, 0, 4 };
        int[] b = { 1, 1, 5, 3, 2, 7, 8, 2 };
        int s = 2;
        assertEquals(240, oneentrance.count(a, b, s));
    }

    @Test
    public void case20() {
        int[] a = { 6, 1, 4, 2, 7, 5, 8, 0 };
        int[] b = { 1, 5, 2, 0, 1, 8, 3, 1 };
        int s = 0;
        assertEquals(560, oneentrance.count(a, b, s));
    }

    @Test
    public void case21() {
        int[] a = { 4, 1, 5, 0, 5, 7, 8, 1 };
        int[] b = { 2, 2, 3, 8, 8, 4, 1, 6 };
        int s = 5;
        assertEquals(192, oneentrance.count(a, b, s));
    }

    @Test
    public void case22() {
        int[] a = { 1, 3, 2, 0, 0, 6, 8, 0 };
        int[] b = { 5, 0, 1, 6, 4, 5, 2, 7 };
        int s = 5;
        assertEquals(336, oneentrance.count(a, b, s));
    }

    @Test
    public void case23() {
        int[] a = { 7, 3, 6, 2, 3, 4, 2, 6 };
        int[] b = { 1, 2, 3, 1, 4, 5, 8, 0 };
        int s = 5;
        assertEquals(45, oneentrance.count(a, b, s));
    }

    @Test
    public void case24() {
        int[] a = { 8, 6, 4, 2, 5, 0, 7, 3 };
        int[] b = { 4, 0, 0, 4, 0, 1, 8, 7 };
        int s = 1;
        assertEquals(168, oneentrance.count(a, b, s));
    }

    @Test
    public void case25() {
        int[] a = { 7, 8, 0, 4, 7, 4, 1, 3 };
        int[] b = { 5, 1, 7, 6, 4, 8, 2, 2 };
        int s = 1;
        assertEquals(224, oneentrance.count(a, b, s));
    }

    @Test
    public void case26() {
        int[] a = { 8, 1, 0, 3, 3, 3, 7, 0 };
        int[] b = { 5, 5, 5, 8, 4, 7, 2, 6 };
        int s = 8;
        assertEquals(630, oneentrance.count(a, b, s));
    }

    @Test
    public void case27() {
        int[] a = { 5, 4, 6, 6, 0, 2, 4, 7 };
        int[] b = { 0, 6, 8, 3, 6, 8, 1, 0 };
        int s = 0;
        assertEquals(1680, oneentrance.count(a, b, s));
    }

    @Test
    public void case28() {
        int[] a = { 6, 6, 2, 1, 7, 0, 8, 1 };
        int[] b = { 3, 2, 8, 5, 2, 2, 4, 6 };
        int s = 2;
        assertEquals(2520, oneentrance.count(a, b, s));
    }

    @Test
    public void case29() {
        int[] a = { 7, 4, 6, 8, 3, 2, 5, 8 };
        int[] b = { 2, 1, 5, 1, 5, 0, 8, 0 };
        int s = 8;
        assertEquals(1120, oneentrance.count(a, b, s));
    }

    @Test
    public void case30() {
        int[] a = { 5, 6, 3, 3, 5, 0, 8, 1 };
        int[] b = { 6, 8, 2, 4, 0, 7, 3, 5 };
        int s = 8;
        assertEquals(336, oneentrance.count(a, b, s));
    }

    @Test
    public void case31() {
        int[] a = { 5, 1, 6, 1, 3, 2, 1, 8 };
        int[] b = { 1, 4, 5, 0, 4, 4, 7, 3 };
        int s = 6;
        assertEquals(90, oneentrance.count(a, b, s));
    }

    @Test
    public void case32() {
        int[] a = { 6, 6, 0, 6, 4, 6, 3, 8 };
        int[] b = { 7, 1, 5, 5, 6, 8, 6, 2 };
        int s = 5;
        assertEquals(2880, oneentrance.count(a, b, s));
    }

    @Test
    public void case33() {
        int[] a = { 8, 8, 7, 2, 7, 8, 5, 1 };
        int[] b = { 3, 6, 5, 5, 0, 7, 1, 4 };
        int s = 4;
        assertEquals(48, oneentrance.count(a, b, s));
    }

    @Test
    public void case34() {
        int[] a = { 8, 0, 5, 8, 1, 5, 1, 1 };
        int[] b = { 4, 7, 4, 3, 0, 6, 4, 2 };
        int s = 4;
        assertEquals(1260, oneentrance.count(a, b, s));
    }

    @Test
    public void case35() {
        int[] a = { 6, 0, 7, 0, 4, 5, 6, 2 };
        int[] b = { 5, 3, 1, 1, 3, 8, 1, 1 };
        int s = 6;
        assertEquals(560, oneentrance.count(a, b, s));
    }

    @Test
    public void case36() {
        int[] a = { 0, 7, 7, 4, 2, 6, 1, 4 };
        int[] b = { 7, 8, 5, 8, 5, 8, 7, 3 };
        int s = 7;
        assertEquals(2520, oneentrance.count(a, b, s));
    }

    @Test
    public void case37() {
        int[] a = { 8, 2, 6, 0, 7, 3, 5, 1 };
        int[] b = { 0, 4, 8, 4, 2, 0, 3, 0 };
        int s = 3;
        assertEquals(480, oneentrance.count(a, b, s));
    }

    @Test
    public void case38() {
        int[] a = { 3, 8, 8, 6, 5, 2, 8, 7 };
        int[] b = { 7, 0, 6, 1, 4, 4, 2, 2 };
        int s = 3;
        assertEquals(45, oneentrance.count(a, b, s));
    }

    @Test
    public void case39() {
        int[] a = { 2, 4, 1, 8, 5, 6, 3, 2 };
        int[] b = { 0, 2, 0, 7, 8, 8, 7, 6 };
        int s = 2;
        assertEquals(504, oneentrance.count(a, b, s));
    }

    @Test
    public void case40() {
        int[] a = { 0, 6, 5, 4, 7, 8, 0, 6 };
        int[] b = { 1, 7, 3, 3, 2, 5, 6, 5 };
        int s = 3;
        assertEquals(288, oneentrance.count(a, b, s));
    }

    @Test
    public void case41() {
        int[] a = { 0, 1, 3, 3, 6, 3, 0, 6 };
        int[] b = { 4, 4, 2, 7, 3, 8, 2, 5 };
        int s = 6;
        assertEquals(240, oneentrance.count(a, b, s));
    }

    @Test
    public void case42() {
        int[] a = { 4, 2, 0, 8, 4, 3, 8, 1 };
        int[] b = { 7, 1, 3, 6, 8, 4, 5, 6 };
        int s = 1;
        assertEquals(120, oneentrance.count(a, b, s));
    }

    @Test
    public void case43() {
        int[] a = { 0, 8, 0, 1, 0, 3, 3, 5 };
        int[] b = { 2, 1, 7, 6, 4, 7, 5, 8 };
        int s = 6;
        assertEquals(2, oneentrance.count(a, b, s));
    }

    @Test
    public void case44() {
        int[] a = { 8, 1, 4, 6, 4, 7, 6, 2 };
        int[] b = { 3, 4, 3, 3, 5, 0, 0, 5 };
        int s = 4;
        assertEquals(672, oneentrance.count(a, b, s));
    }

    @Test
    public void case45() {
        int[] a = { 4, 8, 2, 8, 0, 4, 5, 3 };
        int[] b = { 1, 6, 1, 2, 1, 7, 2, 8 };
        int s = 5;
        assertEquals(210, oneentrance.count(a, b, s));
    }

    @Test
    public void case46() {
        int[] a = { 6, 4, 6, 6, 6, 6, 2, 0 };
        int[] b = { 1, 5, 8, 3, 5, 7, 8, 8 };
        int s = 8;
        assertEquals(3360, oneentrance.count(a, b, s));
    }

    @Test
    public void case47() {
        int[] a = { 7, 7, 5, 8, 0, 5, 2, 2 };
        int[] b = { 1, 4, 6, 1, 8, 2, 8, 3 };
        int s = 6;
        assertEquals(24, oneentrance.count(a, b, s));
    }

    @Test
    public void case48() {
        int[] a = { 4, 0, 0, 6, 1, 1, 0, 6 };
        int[] b = { 3, 8, 7, 5, 0, 3, 2, 0 };
        int s = 2;
        assertEquals(420, oneentrance.count(a, b, s));
    }

    @Test
    public void case49() {
        int[] a = { 2, 8, 2, 4, 4, 3, 5, 4 };
        int[] b = { 7, 2, 4, 6, 1, 4, 2, 0 };
        int s = 6;
        assertEquals(1260, oneentrance.count(a, b, s));
    }

    @Test
    public void case50() {
        int[] a = { 6, 6, 5, 2, 4, 7, 3, 6 };
        int[] b = { 5, 8, 1, 8, 8, 8, 8, 0 };
        int s = 0;
        assertEquals(504, oneentrance.count(a, b, s));
    }

    @Test
    public void case51() {
        int[] a = { 1, 8, 3, 1, 6, 4, 3, 7 };
        int[] b = { 5, 5, 2, 7, 1, 1, 0, 3 };
        int s = 5;
        assertEquals(480, oneentrance.count(a, b, s));
    }

    @Test
    public void case52() {
        int[] a = { 7, 8, 2, 6, 3, 0, 2, 8 };
        int[] b = { 2, 0, 0, 1, 4, 1, 3, 5 };
        int s = 0;
        assertEquals(1260, oneentrance.count(a, b, s));
    }

    @Test
    public void case53() {
        int[] a = { 5, 6, 7, 4, 6, 8, 3, 8 };
        int[] b = { 1, 4, 4, 2, 1, 6, 8, 0 };
        int s = 4;
        assertEquals(1120, oneentrance.count(a, b, s));
    }

    @Test
    public void case54() {
        int[] a = { 7, 0, 3, 6, 5, 6, 7, 7 };
        int[] b = { 1, 1, 7, 4, 8, 1, 5, 2 };
        int s = 3;
        assertEquals(315, oneentrance.count(a, b, s));
    }

    @Test
    public void case55() {
        int[] a = { 3, 0, 7, 0, 5, 8, 1, 5 };
        int[] b = { 1, 7, 2, 1, 6, 4, 4, 1 };
        int s = 0;
        assertEquals(840, oneentrance.count(a, b, s));
    }

    @Test
    public void case56() {
        int[] a = { 4, 6, 3, 6, 1, 2 };
        int[] b = { 1, 4, 2, 0, 5, 5 };
        int s = 3;
        assertEquals(1, oneentrance.count(a, b, s));
    }

    @Test
    public void case57() {
        int[] a = { 1, 3, 1, 0 };
        int[] b = { 4, 4, 2, 2 };
        int s = 3;
        assertEquals(1, oneentrance.count(a, b, s));
    }

    @Test
    public void case58() {
        int[] a = { 6, 4, 5, 0, 2, 4 };
        int[] b = { 3, 0, 4, 3, 4, 1 };
        int s = 0;
        assertEquals(90, oneentrance.count(a, b, s));
    }

    @Test
    public void case59() {
        int[] a = { 0, 3, 1 };
        int[] b = { 1, 1, 2 };
        int s = 1;
        assertEquals(6, oneentrance.count(a, b, s));
    }

    @Test
    public void case60() {
        int[] a = { 0, 4, 3, 4, 3 };
        int[] b = { 5, 2, 4, 0, 1 };
        int s = 0;
        assertEquals(15, oneentrance.count(a, b, s));
    }

    @Test
    public void case61() {
        int[] a = { 3, 2, 3 };
        int[] b = { 2, 1, 0 };
        int s = 1;
        assertEquals(1, oneentrance.count(a, b, s));
    }

    @Test
    public void case62() {
        int[] a = { 4, 2, 3, 4, 3 };
        int[] b = { 0, 4, 2, 5, 1 };
        int s = 0;
        assertEquals(4, oneentrance.count(a, b, s));
    }

    @Test
    public void case63() {
        int[] a = { 1 };
        int[] b = { 0 };
        int s = 1;
        assertEquals(1, oneentrance.count(a, b, s));
    }

    @Test
    public void case64() {
        int[] a = { 3, 0, 2, 1, 1 };
        int[] b = { 5, 5, 4, 4, 3 };
        int s = 2;
        assertEquals(1, oneentrance.count(a, b, s));
    }

    @Test
    public void case65() {
        int[] a = { 0, 3, 2, 1 };
        int[] b = { 4, 0, 3, 4 };
        int s = 4;
        assertEquals(4, oneentrance.count(a, b, s));
    }

    @Test
    public void case66() {
        int[] a = { 0, 3, 2 };
        int[] b = { 3, 1, 1 };
        int s = 1;
        assertEquals(3, oneentrance.count(a, b, s));
    }

    @Test
    public void case67() {
        int[] a = { 6, 4, 3, 1, 4, 0 };
        int[] b = { 2, 0, 4, 0, 6, 5 };
        int s = 5;
        assertEquals(15, oneentrance.count(a, b, s));
    }

    @Test
    public void case68() {
        int[] a = { 4, 2, 3, 1 };
        int[] b = { 0, 3, 4, 4 };
        int s = 4;
        assertEquals(12, oneentrance.count(a, b, s));
    }

    @Test
    public void case69() {
        int[] a = { 2, 0, 1, 5, 3 };
        int[] b = { 0, 4, 5, 0, 0 };
        int s = 5;
        assertEquals(30, oneentrance.count(a, b, s));
    }

    @Test
    public void case70() {
        int[] a = { 1, 0, 0, 4, 1, 6 };
        int[] b = { 3, 2, 5, 1, 0, 5 };
        int s = 4;
        assertEquals(15, oneentrance.count(a, b, s));
    }

    @Test
    public void case71() {
        int[] a = { 2, 2, 0 };
        int[] b = { 1, 0, 3 };
        int s = 0;
        assertEquals(3, oneentrance.count(a, b, s));
    }

    @Test
    public void case72() {
        int[] a = { 0, 1, 2 };
        int[] b = { 1, 3, 0 };
        int s = 0;
        assertEquals(3, oneentrance.count(a, b, s));
    }

    @Test
    public void case73() {
        int[] a = { 3, 3, 3, 3, 4, 5 };
        int[] b = { 2, 1, 5, 6, 0, 0 };
        int s = 5;
        assertEquals(90, oneentrance.count(a, b, s));
    }

    @Test
    public void case74() {
        int[] a = { 2, 2, 1 };
        int[] b = { 3, 0, 3 };
        int s = 1;
        assertEquals(1, oneentrance.count(a, b, s));
    }

    @Test
    public void case75() {
        int[] a = { 1, 1, 0 };
        int[] b = { 2, 3, 2 };
        int s = 2;
        assertEquals(3, oneentrance.count(a, b, s));
    }

    @Test
    public void case76() {
        int[] a = { 5, 0, 1, 6, 2, 2 };
        int[] b = { 2, 3, 4, 4, 1, 3 };
        int s = 0;
        assertEquals(4, oneentrance.count(a, b, s));
    }

    @Test
    public void case77() {
        int[] a = { 1, 0, 4, 1 };
        int[] b = { 3, 3, 1, 2 };
        int s = 1;
        assertEquals(12, oneentrance.count(a, b, s));
    }

    @Test
    public void case78() {
        int[] a = { 4, 1, 6, 1, 2, 5 };
        int[] b = { 3, 0, 4, 4, 4, 4 };
        int s = 6;
        assertEquals(60, oneentrance.count(a, b, s));
    }

    @Test
    public void case79() {
        int[] a = { 2, 0, 2 };
        int[] b = { 3, 2, 1 };
        int s = 3;
        assertEquals(2, oneentrance.count(a, b, s));
    }

    @Test
    public void case80() {
        int[] a = { 4, 2, 1, 1, 0 };
        int[] b = { 1, 3, 3, 5, 3 };
        int s = 4;
        assertEquals(8, oneentrance.count(a, b, s));
    }

    @Test
    public void case81() {
        int[] a = { 6, 3, 6, 2, 5, 1 };
        int[] b = { 2, 0, 5, 3, 4, 6 };
        int s = 5;
        assertEquals(24, oneentrance.count(a, b, s));
    }

    @Test
    public void case82() {
        int[] a = { 0, 1 };
        int[] b = { 2, 2 };
        int s = 0;
        assertEquals(1, oneentrance.count(a, b, s));
    }

    @Test
    public void case83() {
        int[] a = { 4, 3, 1, 2 };
        int[] b = { 3, 0, 0, 0 };
        int s = 0;
        assertEquals(12, oneentrance.count(a, b, s));
    }

    @Test
    public void case84() {
        int[] a = { 1, 0, 3, 4 };
        int[] b = { 4, 2, 4, 2 };
        int s = 1;
        assertEquals(3, oneentrance.count(a, b, s));
    }

    @Test
    public void case85() {
        int[] a = { 2, 0, 2, 1, 5 };
        int[] b = { 0, 5, 4, 0, 3 };
        int s = 2;
        assertEquals(15, oneentrance.count(a, b, s));
    }

    @Test
    public void case86() {
        int[] a = { 2, 3, 2, 5, 0 };
        int[] b = { 1, 4, 3, 2, 5 };
        int s = 5;
        assertEquals(15, oneentrance.count(a, b, s));
    }

    @Test
    public void case87() {
        int[] a = { 5, 3, 5, 1, 3, 2 };
        int[] b = { 6, 6, 0, 0, 2, 4 };
        int s = 6;
        assertEquals(20, oneentrance.count(a, b, s));
    }

    @Test
    public void case88() {
        int[] a = { 3, 1, 2, 1, 5 };
        int[] b = { 5, 4, 4, 5, 0 };
        int s = 5;
        assertEquals(20, oneentrance.count(a, b, s));
    }

    @Test
    public void case89() {
        int[] a = { 3, 4, 2, 1, 2 };
        int[] b = { 5, 5, 0, 5, 4 };
        int s = 1;
        assertEquals(4, oneentrance.count(a, b, s));
    }

    @Test
    public void case90() {
        int[] a = { 0, 1, 0, 3, 4 };
        int[] b = { 5, 2, 2, 4, 1 };
        int s = 1;
        assertEquals(10, oneentrance.count(a, b, s));
    }

    @Test
    public void case91() {
        int[] a = { 1, 4, 1, 2 };
        int[] b = { 0, 0, 3, 1 };
        int s = 3;
        assertEquals(3, oneentrance.count(a, b, s));
    }

    @Test
    public void case92() {
        int[] a = { 3, 2, 0, 3, 5 };
        int[] b = { 1, 4, 3, 2, 0 };
        int s = 2;
        assertEquals(15, oneentrance.count(a, b, s));
    }

    @Test
    public void case93() {
        int[] a = { 5, 0, 5, 3, 4 };
        int[] b = { 1, 5, 4, 1, 2 };
        int s = 1;
        assertEquals(15, oneentrance.count(a, b, s));
    }

    @Test
    public void case94() {
        int[] a = { 1, 2, 3 };
        int[] b = { 0, 0, 2 };
        int s = 1;
        assertEquals(1, oneentrance.count(a, b, s));
    }

    @Test
    public void case95() {
        int[] a = { 3, 0, 2 };
        int[] b = { 2, 1, 1 };
        int s = 2;
        assertEquals(3, oneentrance.count(a, b, s));
    }

    @Test
    public void case96() {
        int[] a = { 4, 5, 5, 2, 0, 0 };
        int[] b = { 1, 3, 4, 5, 6, 5 };
        int s = 2;
        assertEquals(30, oneentrance.count(a, b, s));
    }

    @Test
    public void case97() {
        int[] a = { 0, 2, 3 };
        int[] b = { 1, 1, 1 };
        int s = 3;
        assertEquals(2, oneentrance.count(a, b, s));
    }

    @Test
    public void case98() {
        int[] a = { 1, 5, 4, 0, 4 };
        int[] b = { 4, 3, 5, 5, 2 };
        int s = 4;
        assertEquals(40, oneentrance.count(a, b, s));
    }

    @Test
    public void case99() {
        int[] a = { 0, 0 };
        int[] b = { 1, 2 };
        int s = 1;
        assertEquals(1, oneentrance.count(a, b, s));
    }

    @Test
    public void case100() {
        int[] a = { 2, 0 };
        int[] b = { 1, 1 };
        int s = 2;
        assertEquals(1, oneentrance.count(a, b, s));
    }

    @Test
    public void case101() {
        int[] a = { 0, 0, 0, 0, 0, 0, 0, 0 };
        int[] b = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int s = 0;
        assertEquals(40320, oneentrance.count(a, b, s));
    }

    @Test
    public void case102() {
        int[] a = { 0, 1, 2, 3, 4, 5, 6, 7 };
        int[] b = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int s = 4;
        assertEquals(70, oneentrance.count(a, b, s));
    }

    @Test
    public void case103() {
        int[] a = { 0, 1, 2, 3, 4, 5, 6, 7 };
        int[] b = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int s = 8;
        assertEquals(1, oneentrance.count(a, b, s));
    }

    @Test
    public void case104() {
        int[] a = { 7, 4, 1, 0, 1, 1, 6, 0 };
        int[] b = { 6, 6, 2, 5, 0, 3, 8, 4 };
        int s = 4;
        assertEquals(896, oneentrance.count(a, b, s));
    }

    @Test
    public void case105() {
        int[] a = { 0, 1, 2 };
        int[] b = { 1, 2, 3 };
        int s = 2;
        assertEquals(3, oneentrance.count(a, b, s));
    }

    @Test
    public void case106() {
        int[] a = { 0, 0, 0, 3, 3, 3, 3, 6 };
        int[] b = { 1, 2, 3, 4, 5, 6, 8, 7 };
        int s = 0;
        assertEquals(3360, oneentrance.count(a, b, s));
    }

    @Test
    public void case107() {
        int[] a = { 0, 1, 2 };
        int[] b = { 1, 2, 3 };
        int s = 1;
        assertEquals(3, oneentrance.count(a, b, s));
    }

    @Test
    public void case108() {
        int[] a = { 0, 0, 1, 1 };
        int[] b = { 1, 2, 3, 4 };
        int s = 0;
        assertEquals(8, oneentrance.count(a, b, s));
    }

}
