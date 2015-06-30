package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class MutaliskEasyTest {
    MutaliskEasy mutaliskeasy = new MutaliskEasy();

    @Test
    public void case1() {
        int[] x = { 12, 10, 4 };
        assertEquals(2, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case2() {
        int[] x = { 54, 18, 6 };
        assertEquals(6, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case3() {
        int[] x = { 55, 60, 53 };
        assertEquals(13, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case4() {
        int[] x = { 1, 1, 1 };
        assertEquals(1, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case5() {
        int[] x = { 60, 40 };
        assertEquals(9, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case6() {
        int[] x = { 60 };
        assertEquals(7, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case7() {
        int[] x = { 1 };
        assertEquals(1, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case8() {
        int[] x = { 60 };
        assertEquals(7, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case9() {
        int[] x = { 51 };
        assertEquals(6, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case10() {
        int[] x = { 16, 57, 52 };
        assertEquals(10, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case11() {
        int[] x = { 55 };
        assertEquals(7, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case12() {
        int[] x = { 52, 49, 38 };
        assertEquals(11, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case13() {
        int[] x = { 3, 22 };
        assertEquals(3, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case14() {
        int[] x = { 25, 33, 56 };
        assertEquals(9, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case15() {
        int[] x = { 14 };
        assertEquals(2, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case16() {
        int[] x = { 1, 40, 24 };
        assertEquals(6, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case17() {
        int[] x = { 15, 13 };
        assertEquals(3, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case18() {
        int[] x = { 45, 53 };
        assertEquals(9, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case19() {
        int[] x = { 22 };
        assertEquals(3, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case20() {
        int[] x = { 43, 32 };
        assertEquals(7, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case21() {
        int[] x = { 37, 26 };
        assertEquals(6, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case22() {
        int[] x = { 9 };
        assertEquals(1, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case23() {
        int[] x = { 18, 46, 9 };
        assertEquals(6, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case24() {
        int[] x = { 27, 17 };
        assertEquals(4, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case25() {
        int[] x = { 31, 45, 27 };
        assertEquals(9, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case26() {
        int[] x = { 50, 8 };
        assertEquals(6, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case27() {
        int[] x = { 38, 49 };
        assertEquals(8, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case28() {
        int[] x = { 9 };
        assertEquals(1, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case29() {
        int[] x = { 37, 31 };
        assertEquals(7, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case30() {
        int[] x = { 33 };
        assertEquals(4, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case31() {
        int[] x = { 28 };
        assertEquals(4, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case32() {
        int[] x = { 29, 9, 47 };
        assertEquals(7, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case33() {
        int[] x = { 1 };
        assertEquals(1, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case34() {
        int[] x = { 38 };
        assertEquals(5, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case35() {
        int[] x = { 34 };
        assertEquals(4, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case36() {
        int[] x = { 28, 20, 55 };
        assertEquals(8, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case37() {
        int[] x = { 59, 8 };
        assertEquals(7, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case38() {
        int[] x = { 37, 52, 49 };
        assertEquals(11, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case39() {
        int[] x = { 37 };
        assertEquals(5, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case40() {
        int[] x = { 20 };
        assertEquals(3, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case41() {
        int[] x = { 46, 57 };
        assertEquals(9, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case42() {
        int[] x = { 26, 7 };
        assertEquals(3, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case43() {
        int[] x = { 27, 47, 4 };
        assertEquals(7, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case44() {
        int[] x = { 23, 8, 13 };
        assertEquals(4, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case45() {
        int[] x = { 14, 50, 15 };
        assertEquals(7, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case46() {
        int[] x = { 59, 11 };
        assertEquals(7, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case47() {
        int[] x = { 2, 33 };
        assertEquals(4, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case48() {
        int[] x = { 55, 7, 48 };
        assertEquals(9, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case49() {
        int[] x = { 58, 26 };
        assertEquals(8, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case50() {
        int[] x = { 57, 20, 12 };
        assertEquals(7, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case51() {
        int[] x = { 7 };
        assertEquals(1, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case52() {
        int[] x = { 20, 26, 27 };
        assertEquals(6, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case53() {
        int[] x = { 34 };
        assertEquals(4, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case54() {
        int[] x = { 29, 55, 19 };
        assertEquals(9, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case55() {
        int[] x = { 37 };
        assertEquals(5, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case56() {
        int[] x = { 42, 49, 3 };
        assertEquals(8, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case57() {
        int[] x = { 14 };
        assertEquals(2, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case58() {
        int[] x = { 9, 15 };
        assertEquals(3, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case59() {
        int[] x = { 60, 60, 60 };
        assertEquals(14, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case60() {
        int[] x = { 9, 9, 8 };
        assertEquals(3, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case61() {
        int[] x = { 12, 10, 4 };
        assertEquals(2, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case62() {
        int[] x = { 60, 53, 51 };
        assertEquals(13, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case63() {
        int[] x = { 10, 1, 1 };
        assertEquals(2, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case64() {
        int[] x = { 1, 1, 60 };
        assertEquals(7, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case65() {
        int[] x = { 60, 1, 1 };
        assertEquals(7, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case66() {
        int[] x = { 14, 16, 22 };
        assertEquals(4, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case67() {
        int[] x = { 10 };
        assertEquals(2, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case68() {
        int[] x = { 12, 9, 5 };
        assertEquals(3, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case69() {
        int[] x = { 8, 8, 8 };
        assertEquals(3, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case70() {
        int[] x = { 7, 3, 2 };
        assertEquals(2, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case71() {
        int[] x = { 10, 1 };
        assertEquals(2, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case72() {
        int[] x = { 28, 1, 1 };
        assertEquals(4, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case73() {
        int[] x = { 60, 13, 17 };
        assertEquals(8, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case74() {
        int[] x = { 60, 57, 59 };
        assertEquals(14, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case75() {
        int[] x = { 9 };
        assertEquals(1, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case76() {
        int[] x = { 18, 7, 1 };
        assertEquals(3, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case77() {
        int[] x = { 1, 3, 9 };
        assertEquals(1, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case78() {
        int[] x = { 6, 9, 9 };
        assertEquals(2, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case79() {
        int[] x = { 60, 10, 1 };
        assertEquals(7, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case80() {
        int[] x = { 52 };
        assertEquals(6, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case81() {
        int[] x = { 27, 8, 4 };
        assertEquals(4, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case82() {
        int[] x = { 18, 18, 3 };
        assertEquals(4, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case83() {
        int[] x = { 1, 9, 3 };
        assertEquals(1, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case84() {
        int[] x = { 5, 15, 19 };
        assertEquals(3, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case85() {
        int[] x = { 8, 3, 2 };
        assertEquals(2, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case86() {
        int[] x = { 6, 6, 1 };
        assertEquals(2, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case87() {
        int[] x = { 54, 1, 1 };
        assertEquals(6, mutaliskeasy.minimalAttacks(x));
    }

    @Test
    public void case88() {
        int[] x = { 10, 2 };
        assertEquals(2, mutaliskeasy.minimalAttacks(x));
    }

}
