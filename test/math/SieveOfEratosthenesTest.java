package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class SieveOfEratosthenesTest {
    SieveOfEratosthenes sieveoferatosthenes = new SieveOfEratosthenes();

    @Test
    public void case1() {
        int maxNum = 18;
        assertEquals(15, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case2() {
        int maxNum = 5;
        assertEquals(4, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case3() {
        int maxNum = 100;
        assertEquals(91, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case4() {
        int maxNum = 400;
        assertEquals(361, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case5() {
        int maxNum = 2000000000;
        assertEquals(1999878319, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case6() {
        int maxNum = 8;
        assertEquals(8, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case7() {
        int maxNum = 1999999998;
        assertEquals(1999878319, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case8() {
        int maxNum = 1999999254;
        assertEquals(1999878319, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case9() {
        int maxNum = 1999999112;
        assertEquals(1999878319, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case10() {
        int maxNum = 1999999066;
        assertEquals(1999878319, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case11() {
        int maxNum = 1999999008;
        assertEquals(1999878319, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case12() {
        int maxNum = 1999878319;
        assertEquals(1999878319, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case13() {
        int maxNum = 1999878168;
        assertEquals(1999073521, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case14() {
        int maxNum = 1999827445;
        assertEquals(1999073521, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case15() {
        int maxNum = 1999599033;
        assertEquals(1999073521, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case16() {
        int maxNum = 1999169514;
        assertEquals(1999073521, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case17() {
        int maxNum = 1999159633;
        assertEquals(1999073521, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case18() {
        int maxNum = 1999073520;
        assertEquals(1998626411, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case19() {
        int maxNum = 1999072210;
        assertEquals(1998626411, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case20() {
        int maxNum = 1998351843;
        assertEquals(1998179401, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case21() {
        int maxNum = 1998131217;
        assertEquals(1998089999, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case22() {
        int maxNum = 1997833237;
        assertEquals(1997553587, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case23() {
        int maxNum = 1997665189;
        assertEquals(1997553587, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case24() {
        int maxNum = 1997150393;
        assertEquals(1996927969, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case25() {
        int maxNum = 1996816063;
        assertEquals(1996749221, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case26() {
        int maxNum = 1996611676;
        assertEquals(1996570489, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case27() {
        int maxNum = 1996416006;
        assertEquals(1996212557, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case28() {
        int maxNum = 1995872735;
        assertEquals(1995587359, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case29() {
        int maxNum = 1995314573;
        assertEquals(1994247649, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case30() {
        int maxNum = 1111111111;
        assertEquals(1110955561, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case31() {
        int maxNum = 1073741824;
        assertEquals(1073610467, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case32() {
        int maxNum = 1000000000;
        assertEquals(999634589, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case33() {
        int maxNum = 999999999;
        assertEquals(999634589, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case34() {
        int maxNum = 594823321;
        assertEquals(594628189, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case35() {
        int maxNum = 134217728;
        assertEquals(134165873, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case36() {
        int maxNum = 43046721;
        assertEquals(43046657, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case37() {
        int maxNum = 20511149;
        assertEquals(20457529, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case38() {
        int maxNum = 16777216;
        assertEquals(16777207, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case39() {
        int maxNum = 2097152;
        assertEquals(2093809, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case40() {
        int maxNum = 707281;
        assertEquals(703921, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case41() {
        int maxNum = 262144;
        assertEquals(259081, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case42() {
        int maxNum = 32768;
        assertEquals(32761, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case43() {
        int maxNum = 24389;
        assertEquals(23707, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case44() {
        int maxNum = 6561;
        assertEquals(6557, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case45() {
        int maxNum = 4096;
        assertEquals(4087, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case46() {
        int maxNum = 1024;
        assertEquals(961, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case47() {
        int maxNum = 841;
        assertEquals(841, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case48() {
        int maxNum = 512;
        assertEquals(437, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case49() {
        int maxNum = 256;
        assertEquals(247, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case50() {
        int maxNum = 128;
        assertEquals(121, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case51() {
        int maxNum = 81;
        assertEquals(77, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case52() {
        int maxNum = 64;
        assertEquals(49, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case53() {
        int maxNum = 32;
        assertEquals(25, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case54() {
        int maxNum = 29;
        assertEquals(25, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case55() {
        int maxNum = 16;
        assertEquals(15, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case56() {
        int maxNum = 9;
        assertEquals(9, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case57() {
        int maxNum = 1999878318;
        assertEquals(1999073521, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case58() {
        int maxNum = 7;
        assertEquals(6, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case59() {
        int maxNum = 6;
        assertEquals(6, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case60() {
        int maxNum = 4;
        assertEquals(4, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case61() {
        int maxNum = 10;
        assertEquals(9, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case62() {
        int maxNum = 25;
        assertEquals(25, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case63() {
        int maxNum = 48;
        assertEquals(35, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case64() {
        int maxNum = 1987654321;
        assertEquals(1987643873, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case65() {
        int maxNum = 1897231767;
        assertEquals(1895992849, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case66() {
        int maxNum = 1916425729;
        assertEquals(1916425729, sieveoferatosthenes.lastScratch(maxNum));
    }

    @Test
    public void case67() {
        int maxNum = 1999878317;
        assertEquals(1999073521, sieveoferatosthenes.lastScratch(maxNum));
    }

}
