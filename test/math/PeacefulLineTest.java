package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class PeacefulLineTest {
    PeacefulLine peacefulline = new PeacefulLine();

    @Test
    public void case1() {
        int[] x = { 1, 2, 3, 4 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case2() {
        int[] x = { 1, 1, 1, 2 };
        assertEquals("impossible", peacefulline.makeLine(x));
    }

    @Test
    public void case3() {
        int[] x = { 1, 1, 2, 2, 3, 3, 4, 4 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case4() {
        int[] x = { 25, 12, 3, 25, 25, 12, 12, 12, 12, 3, 25 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case5() {
        int[] x = { 21 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case6() {
        int[] x = { 3, 3, 3, 3, 13, 13, 13, 13 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case7() {
        int[] x = { 3, 7, 7, 7, 3, 7, 7, 7, 3 };
        assertEquals("impossible", peacefulline.makeLine(x));
    }

    @Test
    public void case8() {
        int[] x = { 12, 12, 12, 12, 12, 4, 4, 4, 4 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case9() {
        int[] x = { 16, 17, 16, 17, 16, 17, 16, 17, 16, 17, 17 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case10() {
        int[] x = { 5, 5, 3, 10, 9, 2, 1, 2, 3, 4 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case11() {
        int[] x = { 7, 5, 3, 7, 7, 5, 5, 7, 6, 6, 8, 2, 3, 3, 3, 4, 2, 8, 9, 2, 6 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case12() {
        int[] x = { 3, 2, 1, 3, 2, 3, 3, 2, 1, 1, 1, 1, 2, 1, 3, 3, 3, 3, 1, 3, 1, 3, 2, 3 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case13() {
        int[] x = { 11, 2, 4, 11, 17, 12, 9, 17, 6 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case14() {
        int[] x = { 3, 1, 15, 15, 4, 4, 12, 21, 8, 11, 15, 2 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case15() {
        int[] x = { 20, 7, 14, 11, 6, 12 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case16() {
        int[] x = { 2, 6, 1, 5, 6, 6, 4, 3, 6, 5, 3, 5, 3, 1, 3, 5, 4 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case17() {
        int[] x = { 4, 5, 5, 7, 2, 6, 7, 2, 3, 3, 7, 5, 3, 4, 1, 1, 3, 6, 3, 1, 6, 7, 2, 6 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case18() {
        int[] x = { 5, 1, 7, 15, 9, 11, 16, 6, 8, 8, 8, 13, 7, 8, 12, 3, 12, 15 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case19() {
        int[] x = { 4, 7, 4, 6, 1, 1, 5, 2, 2, 6, 5, 4, 1, 2, 3, 1, 4, 5 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case20() {
        int[] x = { 14, 20, 9, 15, 2, 14, 13, 2, 7, 16, 12, 4, 11, 19, 14, 12, 5, 6 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case21() {
        int[] x = { 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 2, 1 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case22() {
        int[] x = { 4, 3, 8, 6, 7, 1, 6, 8, 4, 4, 8, 3, 6, 3, 7, 8, 7, 4, 4, 8, 4 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case23() {
        int[] x = { 4, 6, 5, 7, 7, 4, 5, 6, 3, 1, 6, 2, 4, 5, 2, 1, 6, 6, 5, 1 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case24() {
        int[] x = { 2, 17, 19, 4, 12, 11, 20, 17, 7, 20, 1, 20, 2, 3, 14 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case25() {
        int[] x = { 5, 1, 16, 5, 5, 16, 12, 6, 17, 14, 17, 1, 14, 9, 18 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case26() {
        int[] x = { 2, 3, 1, 3, 1, 1, 3, 1, 3, 3, 1, 3, 1, 3, 1, 2, 2, 3, 3, 1, 2, 3, 1, 2, 2 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case27() {
        int[] x = { 8, 5, 20, 6, 19, 15, 24, 13, 20 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case28() {
        int[] x = { 5, 5, 7, 8, 15, 2, 8, 13, 16, 11, 13, 1, 17, 12, 3, 12, 15, 9, 9, 10, 11, 13, 11 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case29() {
        int[] x = { 8, 13, 1, 2, 13, 16, 11, 11, 22, 17, 4, 21 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case30() {
        int[] x = { 6, 16, 11, 17, 3, 12, 16, 16, 15, 5 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case31() {
        int[] x = { 1, 8, 6, 6, 6, 8, 6, 8 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case32() {
        int[] x = { 3, 6, 3, 3, 5, 6, 2, 3, 6, 1 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case33() {
        int[] x = { 5, 3, 13, 1, 19, 16, 8, 9, 9, 14, 14, 12, 17, 16, 11, 11, 18 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case34() {
        int[] x = { 18, 12, 17, 3, 2, 7, 8, 15, 8, 8, 13, 7, 15, 16, 18, 12, 4, 4, 3, 1, 16, 3, 17 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case35() {
        int[] x = { 8, 4, 7, 7, 5, 13, 10, 4, 3, 6, 5, 12, 5, 5, 10, 13, 12, 8, 11, 12, 4, 3, 1, 8 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case36() {
        int[] x = { 4, 6, 1, 4, 4, 6, 8, 8 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case37() {
        int[] x = { 1, 3, 1, 4, 9 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case38() {
        int[] x = { 2, 4, 1, 4, 1, 1, 1, 2, 1, 4, 3, 4, 4 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case39() {
        int[] x = { 4, 4, 16, 1, 11, 4, 8, 10, 7, 16, 9, 9, 8, 15, 6, 5, 3, 4, 1, 13, 14, 13, 8 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case40() {
        int[] x = { 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
        assertEquals("impossible", peacefulline.makeLine(x));
    }

    @Test
    public void case41() {
        int[] x = { 4, 1, 20, 10, 14, 6, 15, 18, 13, 4, 1, 4, 13, 7, 20, 21, 3, 12, 9, 20, 4, 11 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case42() {
        int[] x = { 15, 9, 22, 22, 16, 22, 16, 14, 12, 17, 13, 5 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case43() {
        int[] x = { 3, 15, 13, 9, 17, 18, 4, 17, 15, 19, 1, 16, 13, 5, 2, 8, 14, 3, 2 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case44() {
        int[] x = { 8, 4, 11, 12, 4, 11, 5 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case45() {
        int[] x = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals("impossible", peacefulline.makeLine(x));
    }

    @Test
    public void case46() {
        int[] x = { 12, 2, 2, 2, 23, 24, 21, 14, 5, 3, 2, 4, 12, 10, 3 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case47() {
        int[] x = { 2, 1, 1, 3, 2, 1, 1, 1, 2, 2, 3, 1, 2, 2, 2, 2, 1, 3, 1, 1, 2, 2, 1, 1 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case48() {
        int[] x = { 3, 4, 3, 1, 2, 1, 3, 3, 4, 1 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case49() {
        int[] x = { 9, 1, 2, 3, 8, 1, 7, 5 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case50() {
        int[] x = { 11, 14, 3, 3, 18, 4, 14, 17, 16, 7, 7, 18, 18, 16 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case51() {
        int[] x = { 13, 5, 9, 19, 3, 15, 15, 6, 18, 13, 16, 10 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case52() {
        int[] x = { 3, 3, 9, 10, 5, 12, 2, 4, 4, 5, 5, 11, 4, 8, 10, 7, 5, 12 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case53() {
        int[] x = { 1, 11, 4, 9, 9, 12, 9, 12, 3, 11, 6, 10, 5, 2 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case54() {
        int[] x = { 3, 11, 2, 10, 5, 6, 11, 16, 5, 3, 3, 8 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case55() {
        int[] x = { 5, 5, 4, 5, 1, 3, 5, 1, 1, 3, 2, 3, 5, 2 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case56() {
        int[] x = { 4, 12, 18, 5, 12, 9, 5, 16, 14, 7, 12, 5, 7, 3, 16, 7, 9, 3, 10, 13, 11, 20, 9, 1 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case57() {
        int[] x = { 6, 21, 15, 1, 13, 7, 3, 17, 7, 12, 18, 1, 8, 11, 22, 14, 10, 18, 20, 7, 17, 11, 9, 3 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case58() {
        int[] x = { 2, 1, 1, 5, 4, 1, 5, 3, 4, 4, 5, 7, 3, 6, 3 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case59() {
        int[] x = { 8, 14, 8, 3, 11, 7, 8, 3, 1, 18, 1, 14, 7, 4, 3, 16, 17, 17, 17 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case60() {
        int[] x = { 10, 1, 10, 2, 10, 3, 10, 4, 10, 5, 10, 6, 10, 7, 10, 8, 10, 9, 10, 10 };
        assertEquals("impossible", peacefulline.makeLine(x));
    }

    @Test
    public void case61() {
        int[] x = { 1, 3, 3, 3, 6 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case62() {
        int[] x = { 18, 18 };
        assertEquals("impossible", peacefulline.makeLine(x));
    }

    @Test
    public void case63() {
        int[] x = { 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25 };
        assertEquals("impossible", peacefulline.makeLine(x));
    }

    @Test
    public void case64() {
        int[] x = { 3, 3, 3, 3, 13, 13, 13, 13, 3 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case65() {
        int[] x = { 1, 1, 2 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case66() {
        int[] x = { 1 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case67() {
        int[] x = { 2, 2, 3 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case68() {
        int[] x = { 25, 12, 3, 25, 25, 12, 12, 12, 12, 3, 25 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case69() {
        int[] x = { 1, 1, 1, 2, 2 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case70() {
        int[] x = { 3, 3, 3, 2, 2 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case71() {
        int[] x = { 1, 2, 1, 3, 1 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case72() {
        int[] x = { 1, 1, 2, 2 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case73() {
        int[] x = { 2, 2, 2, 2, 2, 2 };
        assertEquals("impossible", peacefulline.makeLine(x));
    }

    @Test
    public void case74() {
        int[] x = { 2, 1, 1 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case75() {
        int[] x = { 25, 25, 25, 25, 25 };
        assertEquals("impossible", peacefulline.makeLine(x));
    }

    @Test
    public void case76() {
        int[] x = { 1, 1, 1, 2 };
        assertEquals("impossible", peacefulline.makeLine(x));
    }

    @Test
    public void case77() {
        int[] x = { 1, 1, 1 };
        assertEquals("impossible", peacefulline.makeLine(x));
    }

    @Test
    public void case78() {
        int[] x = { 1, 1, 1, 1 };
        assertEquals("impossible", peacefulline.makeLine(x));
    }

    @Test
    public void case79() {
        int[] x = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 11, 11, 11, 11, 11, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case80() {
        int[] x = { 3, 3, 3, 3, 13, 13, 13, 13, 3 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case81() {
        int[] x = { 25, 25, 3, 25 };
        assertEquals("impossible", peacefulline.makeLine(x));
    }

    @Test
    public void case82() {
        int[] x = { 3, 3, 1, 1, 2, 2, 3, 3 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case83() {
        int[] x = { 3, 1, 3 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case84() {
        int[] x = { 1, 2, 2, 3, 3, 3, 3 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case85() {
        int[] x = { 1, 2, 1, 2, 1, 2, 1, 3, 1, 3, 1 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case86() {
        int[] x = { 1, 2, 3, 3, 3 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case87() {
        int[] x = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals("impossible", peacefulline.makeLine(x));
    }

    @Test
    public void case88() {
        int[] x = { 3, 3, 3, 3, 2, 2, 2, 2, 2, 2, 2, 2 };
        assertEquals("impossible", peacefulline.makeLine(x));
    }

    @Test
    public void case89() {
        int[] x = { 15, 15, 15, 15, 15, 15, 15, 15, 15, 15 };
        assertEquals("impossible", peacefulline.makeLine(x));
    }

    @Test
    public void case90() {
        int[] x = { 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case91() {
        int[] x = { 1, 1, 1, 2, 2, 2, 3, 3, 3 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case92() {
        int[] x = { 3, 3, 6, 6, 6, 6 };
        assertEquals("impossible", peacefulline.makeLine(x));
    }

    @Test
    public void case93() {
        int[] x = { 1, 1, 1, 1, 1, 2, 2, 2, 3, 4, 5, 6, 7 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case94() {
        int[] x = { 9, 9, 9 };
        assertEquals("impossible", peacefulline.makeLine(x));
    }

    @Test
    public void case95() {
        int[] x = { 1, 1 };
        assertEquals("impossible", peacefulline.makeLine(x));
    }

    @Test
    public void case96() {
        int[] x = { 3, 3, 5 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case97() {
        int[] x = { 3, 7, 7, 7, 3 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case98() {
        int[] x = { 1, 25, 25, 25, 25 };
        assertEquals("impossible", peacefulline.makeLine(x));
    }

    @Test
    public void case99() {
        int[] x = { 1, 2, 3, 4 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case100() {
        int[] x = { 1, 1, 3, 1, 2 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case101() {
        int[] x = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12 };
        assertEquals("impossible", peacefulline.makeLine(x));
    }

    @Test
    public void case102() {
        int[] x = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        assertEquals("impossible", peacefulline.makeLine(x));
    }

    @Test
    public void case103() {
        int[] x = { 1, 1, 1, 1, 1, 2, 3, 4, 5, 5, 5 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case104() {
        int[] x = { 1, 1, 1, 1, 1, 1, 2, 2 };
        assertEquals("impossible", peacefulline.makeLine(x));
    }

    @Test
    public void case105() {
        int[] x = { 2, 3, 4, 3, 8, 3, 9, 14, 15, 21, 21 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case106() {
        int[] x = { 2, 2, 1, 1 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case107() {
        int[] x = { 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case108() {
        int[] x = { 1, 1, 2, 2, 2 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case109() {
        int[] x = { 1, 2, 3, 4, 4, 4 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case110() {
        int[] x = { 1, 1, 1, 2, 3 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case111() {
        int[] x = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 1 };
        assertEquals("impossible", peacefulline.makeLine(x));
    }

    @Test
    public void case112() {
        int[] x = { 1, 2, 1 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

    @Test
    public void case113() {
        int[] x = { 3, 3, 3, 3, 3, 4, 5, 6, 7 };
        assertEquals("possible", peacefulline.makeLine(x));
    }

}
