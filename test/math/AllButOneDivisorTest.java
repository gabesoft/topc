package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class AllButOneDivisorTest {
    AllButOneDivisor allbutonedivisor = new AllButOneDivisor();

    @Test
    public void case1() {
        int[] divisors = { 2, 3, 5 };
        assertEquals(6, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case2() {
        int[] divisors = { 2, 4, 3, 9 };
        assertEquals(12, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case3() {
        int[] divisors = { 3, 2, 6 };
        assertEquals(-1, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case4() {
        int[] divisors = { 6, 7, 8, 9, 10 };
        assertEquals(360, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case5() {
        int[] divisors = { 10, 6, 15 };
        assertEquals(-1, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case6() {
        int[] divisors = { 10, 11, 12, 13, 14, 15 };
        assertEquals(4620, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case7() {
        int[] divisors = { 2, 4, 6, 3 };
        assertEquals(6, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case8() {
        int[] divisors = { 8, 9, 5, 7, 11, 13 };
        assertEquals(27720, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case9() {
        int[] divisors = { 14, 15, 6 };
        assertEquals(30, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case10() {
        int[] divisors = { 7, 14, 2 };
        assertEquals(-1, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case11() {
        int[] divisors = { 4, 3, 1, 12 };
        assertEquals(-1, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case12() {
        int[] divisors = { 1, 2 };
        assertEquals(1, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case13() {
        int[] divisors = { 1, 2, 3 };
        assertEquals(2, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case14() {
        int[] divisors = { 15, 14, 1 };
        assertEquals(14, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case15() {
        int[] divisors = { 15, 14, 13, 1, 12 };
        assertEquals(420, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case16() {
        int[] divisors = { 2, 4, 8, 6, 3 };
        assertEquals(12, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case17() {
        int[] divisors = { 2, 4, 11, 6, 3 };
        assertEquals(12, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case18() {
        int[] divisors = { 2, 4, 13, 6, 3 };
        assertEquals(12, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case19() {
        int[] divisors = { 8, 9, 15, 7, 11, 13 };
        assertEquals(27720, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case20() {
        int[] divisors = { 2, 3, 5, 6 };
        assertEquals(6, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case21() {
        int[] divisors = { 1, 3, 2, 5, 4 };
        assertEquals(12, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case22() {
        int[] divisors = { 4, 1, 5, 3, 2 };
        assertEquals(12, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case23() {
        int[] divisors = { 3, 4, 2, 5, 1 };
        assertEquals(12, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case24() {
        int[] divisors = { 2, 4, 3, 1, 5 };
        assertEquals(12, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case25() {
        int[] divisors = { 2, 5, 6, 4, 1, 3 };
        assertEquals(12, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case26() {
        int[] divisors = { 3, 1, 2, 4 };
        assertEquals(4, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case27() {
        int[] divisors = { 8, 11, 5 };
        assertEquals(40, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case28() {
        int[] divisors = { 14, 1, 6, 10, 5, 9 };
        assertEquals(90, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case29() {
        int[] divisors = { 8, 14, 5, 11, 7 };
        assertEquals(280, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case30() {
        int[] divisors = { 13, 7, 14, 15, 6, 9 };
        assertEquals(630, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case31() {
        int[] divisors = { 9, 3, 4, 1, 5 };
        assertEquals(36, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case32() {
        int[] divisors = { 11, 1 };
        assertEquals(1, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case33() {
        int[] divisors = { 1, 4, 12, 3, 13 };
        assertEquals(12, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case34() {
        int[] divisors = { 4, 2 };
        assertEquals(2, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case35() {
        int[] divisors = { 5, 8, 14, 4 };
        assertEquals(40, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case36() {
        int[] divisors = { 7, 13, 14 };
        assertEquals(14, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case37() {
        int[] divisors = { 14, 15 };
        assertEquals(14, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case38() {
        int[] divisors = { 5, 13, 10, 9, 7, 2 };
        assertEquals(630, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case39() {
        int[] divisors = { 1, 2, 12, 13, 11 };
        assertEquals(132, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case40() {
        int[] divisors = { 2, 3, 11, 12, 14, 1 };
        assertEquals(84, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case41() {
        int[] divisors = { 9, 14, 5 };
        assertEquals(45, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case42() {
        int[] divisors = { 11, 1, 9, 2 };
        assertEquals(18, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case43() {
        int[] divisors = { 9, 8, 5, 2 };
        assertEquals(40, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case44() {
        int[] divisors = { 4, 6 };
        assertEquals(4, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case45() {
        int[] divisors = { 14, 6 };
        assertEquals(6, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case46() {
        int[] divisors = { 13, 1, 5, 9, 7, 4 };
        assertEquals(1260, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case47() {
        int[] divisors = { 11, 8, 15, 6, 4 };
        assertEquals(120, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case48() {
        int[] divisors = { 4, 12, 11 };
        assertEquals(12, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case49() {
        int[] divisors = { 7, 5, 9, 1, 11, 6 };
        assertEquals(630, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case50() {
        int[] divisors = { 4, 9, 10, 3, 12 };
        assertEquals(36, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case51() {
        int[] divisors = { 4, 10, 13, 12, 9 };
        assertEquals(180, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case52() {
        int[] divisors = { 14, 4, 12, 13, 2 };
        assertEquals(84, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case53() {
        int[] divisors = { 9, 2, 14 };
        assertEquals(14, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case54() {
        int[] divisors = { 6, 3, 13, 7 };
        assertEquals(42, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case55() {
        int[] divisors = { 2, 14, 4 };
        assertEquals(4, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case56() {
        int[] divisors = { 5, 3, 7, 13, 4, 9 };
        assertEquals(1260, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case57() {
        int[] divisors = { 7, 8, 11, 4 };
        assertEquals(56, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case58() {
        int[] divisors = { 8, 10 };
        assertEquals(8, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case59() {
        int[] divisors = { 4, 15, 12, 3 };
        assertEquals(12, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case60() {
        int[] divisors = { 4, 11, 10, 9 };
        assertEquals(180, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case61() {
        int[] divisors = { 7, 6, 8 };
        assertEquals(24, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case62() {
        int[] divisors = { 2, 7, 11, 4 };
        assertEquals(28, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case63() {
        int[] divisors = { 7, 1, 10, 15, 13 };
        assertEquals(210, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case64() {
        int[] divisors = { 4, 10, 14, 6, 9 };
        assertEquals(180, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case65() {
        int[] divisors = { 11, 10, 13, 9, 3, 5 };
        assertEquals(990, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case66() {
        int[] divisors = { 2, 15, 12 };
        assertEquals(12, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case67() {
        int[] divisors = { 10, 1, 2, 3 };
        assertEquals(6, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case68() {
        int[] divisors = { 2, 3, 6, 11 };
        assertEquals(6, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case69() {
        int[] divisors = { 2, 10, 12, 9, 8 };
        assertEquals(72, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case70() {
        int[] divisors = { 2, 11, 15, 5 };
        assertEquals(30, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case71() {
        int[] divisors = { 11, 10, 14, 4, 2 };
        assertEquals(140, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case72() {
        int[] divisors = { 2, 8, 10, 3, 13, 7 };
        assertEquals(840, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case73() {
        int[] divisors = { 9, 7, 3, 11, 14 };
        assertEquals(126, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case74() {
        int[] divisors = { 6, 10, 5, 3, 1 };
        assertEquals(-1, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case75() {
        int[] divisors = { 3, 9, 5, 4 };
        assertEquals(36, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case76() {
        int[] divisors = { 14, 2, 4, 11, 7, 6 };
        assertEquals(84, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case77() {
        int[] divisors = { 12, 9, 4, 5 };
        assertEquals(36, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case78() {
        int[] divisors = { 15, 2, 9, 5 };
        assertEquals(30, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case79() {
        int[] divisors = { 8, 11, 7, 10, 1 };
        assertEquals(280, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case80() {
        int[] divisors = { 12, 14, 13, 4 };
        assertEquals(84, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case81() {
        int[] divisors = { 8, 7, 2, 3, 1, 10 };
        assertEquals(120, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case82() {
        int[] divisors = { 10, 12, 7, 14, 9, 5 };
        assertEquals(420, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case83() {
        int[] divisors = { 14, 7, 9, 11, 8 };
        assertEquals(504, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case84() {
        int[] divisors = { 1, 9, 7, 4, 2, 14 };
        assertEquals(28, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case85() {
        int[] divisors = { 1, 15, 9, 5, 3, 11 };
        assertEquals(45, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case86() {
        int[] divisors = { 11, 6, 13, 1 };
        assertEquals(66, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case87() {
        int[] divisors = { 10, 11, 14, 12 };
        assertEquals(420, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case88() {
        int[] divisors = { 9, 7, 12, 14, 10 };
        assertEquals(252, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case89() {
        int[] divisors = { 15, 7, 12, 10, 11, 14 };
        assertEquals(420, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case90() {
        int[] divisors = { 9, 15, 13, 11, 12, 10 };
        assertEquals(1980, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case91() {
        int[] divisors = { 15, 11, 8, 14 };
        assertEquals(616, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case92() {
        int[] divisors = { 14, 8, 9, 7, 13 };
        assertEquals(504, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case93() {
        int[] divisors = { 13, 7, 12, 9, 15, 14 };
        assertEquals(1260, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case94() {
        int[] divisors = { 11, 7, 13, 14, 12, 15 };
        assertEquals(4620, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case95() {
        int[] divisors = { 12, 7, 15, 9, 13, 8 };
        assertEquals(2520, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case96() {
        int[] divisors = { 11, 13, 15, 14 };
        assertEquals(2002, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case97() {
        int[] divisors = { 11, 14, 13, 9, 12, 10 };
        assertEquals(13860, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case98() {
        int[] divisors = { 9, 15, 12, 13, 11, 8 };
        assertEquals(3960, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case99() {
        int[] divisors = { 12, 8, 11, 9, 13, 15 };
        assertEquals(3960, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case100() {
        int[] divisors = { 8, 10, 14, 11, 12 };
        assertEquals(840, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case101() {
        int[] divisors = { 10, 15, 14, 8 };
        assertEquals(120, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case102() {
        int[] divisors = { 15, 13, 9, 11 };
        assertEquals(495, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case103() {
        int[] divisors = { 10, 14, 8, 11 };
        assertEquals(280, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case104() {
        int[] divisors = { 14, 11, 9, 13 };
        assertEquals(1287, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case105() {
        int[] divisors = { 7, 9, 13, 11 };
        assertEquals(693, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case106() {
        int[] divisors = { 12, 8, 11, 14, 13, 15 };
        assertEquals(9240, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case107() {
        int[] divisors = { 7, 13, 11, 14, 9 };
        assertEquals(1386, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case108() {
        int[] divisors = { 1, 2 };
        assertEquals(1, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case109() {
        int[] divisors = { 1, 3, 4 };
        assertEquals(3, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case110() {
        int[] divisors = { 2, 3, 7 };
        assertEquals(6, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case111() {
        int[] divisors = { 2, 4 };
        assertEquals(2, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case112() {
        int[] divisors = { 2, 3, 5, 15 };
        assertEquals(15, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case113() {
        int[] divisors = { 5, 10, 13 };
        assertEquals(10, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case114() {
        int[] divisors = { 3, 2, 6 };
        assertEquals(-1, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case115() {
        int[] divisors = { 10, 2, 3 };
        assertEquals(6, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case116() {
        int[] divisors = { 5, 7, 8, 9, 11, 13 };
        assertEquals(27720, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case117() {
        int[] divisors = { 2, 3, 4, 6, 7 };
        assertEquals(12, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case118() {
        int[] divisors = { 5, 7 };
        assertEquals(5, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case119() {
        int[] divisors = { 6, 7, 15 };
        assertEquals(30, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case120() {
        int[] divisors = { 4, 5, 6 };
        assertEquals(12, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case121() {
        int[] divisors = { 3, 6, 13 };
        assertEquals(6, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case122() {
        int[] divisors = { 1, 2, 4, 8 };
        assertEquals(4, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case123() {
        int[] divisors = { 13, 11, 9, 8, 7, 5 };
        assertEquals(27720, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case124() {
        int[] divisors = { 1, 5 };
        assertEquals(1, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case125() {
        int[] divisors = { 2, 4, 8 };
        assertEquals(4, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case126() {
        int[] divisors = { 2, 3 };
        assertEquals(2, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case127() {
        int[] divisors = { 6, 7, 8, 9, 10 };
        assertEquals(360, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case128() {
        int[] divisors = { 13, 11, 7, 5, 9, 4 };
        assertEquals(13860, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case129() {
        int[] divisors = { 6, 10, 15, 14 };
        assertEquals(30, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case130() {
        int[] divisors = { 3, 5, 7, 11, 13 };
        assertEquals(1155, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case131() {
        int[] divisors = { 3, 13, 2 };
        assertEquals(6, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case132() {
        int[] divisors = { 2, 1 };
        assertEquals(1, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case133() {
        int[] divisors = { 7, 10, 15 };
        assertEquals(30, allbutonedivisor.getMinimum(divisors));
    }

    @Test
    public void case134() {
        int[] divisors = { 15, 14, 13, 12, 11, 10 };
        assertEquals(4620, allbutonedivisor.getMinimum(divisors));
    }

}
