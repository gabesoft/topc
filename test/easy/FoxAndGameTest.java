package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class FoxAndGameTest {
    FoxAndGame foxandgame = new FoxAndGame();

    @Test
    public void case1() {
        String[] result = { "ooo", "ooo" };
        assertEquals(6, foxandgame.countStars(result));
    }

    @Test
    public void case2() {
        String[] result = { "ooo", "oo-", "o--" };
        assertEquals(6, foxandgame.countStars(result));
    }

    @Test
    public void case3() {
        String[] result = { "ooo", "---", "oo-", "---", "o--" };
        assertEquals(6, foxandgame.countStars(result));
    }

    @Test
    public void case4() {
        String[] result = { "o--", "o--", "o--", "ooo", "---" };
        assertEquals(6, foxandgame.countStars(result));
    }

    @Test
    public void case5() {
        String[] result = { "---", "o--", "oo-", "ooo", "ooo", "oo-", "o--", "---" };
        assertEquals(12, foxandgame.countStars(result));
    }

    @Test
    public void case6() {
        String[] result = { "---", "---", "---", "---", "---", "---" };
        assertEquals(0, foxandgame.countStars(result));
    }

    @Test
    public void case7() {
        String[] result = { "oo-" };
        assertEquals(2, foxandgame.countStars(result));
    }

    @Test
    public void case8() {
        String[] result = { "ooo", "o--", "oo-", "o--", "oo-", "ooo", "oo-", "ooo", "---", "ooo", "ooo", "ooo", "o--", "o--", "o--", "o--", "o--", "ooo", "oo-", "o--", "ooo", "o--", "oo-", "oo-", "---", "ooo", "ooo", "ooo", "ooo", "oo-", "oo-", "o--", "oo-", "ooo", "o--", "o--" };
        assertEquals(69, foxandgame.countStars(result));
    }

    @Test
    public void case9() {
        String[] result = { "ooo", "ooo", "ooo", "ooo", "---", "ooo", "ooo", "---", "---", "ooo", "ooo", "ooo", "ooo", "ooo", "---", "ooo", "---", "---", "---", "ooo", "ooo", "ooo", "ooo", "o--", "ooo", "ooo", "---", "ooo", "---", "ooo", "ooo", "o--", "ooo", "ooo", "---", "ooo", "o--", "---", "ooo", "o--" };
        assertEquals(79, foxandgame.countStars(result));
    }

    @Test
    public void case10() {
        String[] result = { "o--", "oo-", "o--", "oo-", "ooo", "ooo", "oo-", "oo-", "oo-", "oo-", "oo-", "o--", "oo-", "oo-", "o--", "o--", "o--", "o--", "oo-", "oo-", "oo-", "o--", "oo-", "oo-", "ooo", "ooo", "o--", "oo-", "oo-", "oo-", "o--", "ooo", "oo-", "oo-", "o--" };
        assertEquals(64, foxandgame.countStars(result));
    }

    @Test
    public void case11() {
        String[] result = { "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "o--", "o--", "o--", "o--", "o--", "ooo", "ooo", "ooo", "ooo", "ooo", "o--", "o--", "ooo", "ooo", "ooo", "ooo", "ooo", "o--", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo" };
        assertEquals(101, foxandgame.countStars(result));
    }

    @Test
    public void case12() {
        String[] result = { "oo-", "ooo", "ooo", "oo-" };
        assertEquals(10, foxandgame.countStars(result));
    }

    @Test
    public void case13() {
        String[] result = { "---", "oo-", "ooo", "oo-", "---", "---", "ooo", "ooo", "---", "ooo", "oo-", "---", "---", "oo-" };
        assertEquals(20, foxandgame.countStars(result));
    }

    @Test
    public void case14() {
        String[] result = { "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo" };
        assertEquals(21, foxandgame.countStars(result));
    }

    @Test
    public void case15() {
        String[] result = { "oo-", "ooo", "---", "ooo", "ooo", "ooo", "---", "ooo", "oo-", "ooo", "ooo", "oo-", "---", "ooo", "---", "---", "ooo", "---", "oo-", "---", "ooo", "ooo", "---" };
        assertEquals(41, foxandgame.countStars(result));
    }

    @Test
    public void case16() {
        String[] result = { "ooo", "oo-", "oo-", "o--", "oo-", "oo-", "oo-", "oo-", "o--", "oo-", "ooo", "o--", "oo-", "ooo", "ooo", "oo-", "oo-", "ooo", "o--", "o--", "o--", "ooo", "oo-", "o--", "ooo", "oo-", "ooo", "o--", "oo-", "o--", "o--", "oo-", "oo-", "oo-", "oo-", "ooo", "oo-", "oo-", "ooo", "ooo" };
        assertEquals(81, foxandgame.countStars(result));
    }

    @Test
    public void case17() {
        String[] result = { "oo-", "oo-", "oo-", "oo-", "ooo", "o--", "o--", "oo-", "o--", "ooo", "o--", "o--", "o--", "ooo", "oo-", "ooo", "oo-", "ooo", "oo-", "ooo", "ooo", "o--", "ooo", "o--", "oo-", "ooo", "oo-", "o--", "oo-", "ooo", "o--", "ooo", "o--", "ooo" };
        assertEquals(69, foxandgame.countStars(result));
    }

    @Test
    public void case18() {
        String[] result = { "---", "oo-", "---", "---", "oo-", "oo-", "---", "---", "---", "oo-", "ooo", "oo-", "---", "oo-", "ooo", "ooo", "ooo", "---", "ooo", "---", "ooo", "---", "ooo", "---", "---", "ooo", "ooo", "ooo", "oo-", "ooo", "---", "ooo", "---", "ooo", "ooo", "ooo", "oo-" };
        assertEquals(61, foxandgame.countStars(result));
    }

    @Test
    public void case19() {
        String[] result = { "ooo", "ooo", "ooo", "ooo", "---", "---", "---", "---", "ooo", "ooo", "ooo", "---", "ooo", "---", "ooo", "ooo", "ooo", "ooo", "---", "ooo", "---", "---", "ooo", "---", "ooo", "ooo", "ooo", "---", "ooo", "ooo", "ooo", "---", "ooo", "ooo", "ooo", "---", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "---", "---", "---", "---" };
        assertEquals(90, foxandgame.countStars(result));
    }

    @Test
    public void case20() {
        String[] result = { "oo-", "o--", "o--", "---", "---", "oo-", "o--", "ooo", "oo-", "o--", "oo-", "---", "o--", "o--", "o--", "o--", "---", "---", "o--", "ooo", "---", "---", "---", "ooo", "ooo", "oo-", "ooo", "o--", "---", "o--", "oo-", "---", "o--", "o--", "oo-", "oo-", "o--", "oo-", "oo-" };
        assertEquals(49, foxandgame.countStars(result));
    }

    @Test
    public void case21() {
        String[] result = { "ooo", "ooo", "---", "ooo", "---", "ooo", "---", "ooo", "ooo", "ooo", "ooo", "---", "ooo", "ooo", "ooo", "---", "---", "ooo", "ooo", "---", "---", "ooo", "ooo", "---", "---", "ooo", "---", "---", "ooo", "ooo", "ooo", "---", "---", "ooo", "ooo", "ooo", "ooo", "---", "---", "ooo", "ooo", "---", "ooo", "---", "---" };
        assertEquals(78, foxandgame.countStars(result));
    }

    @Test
    public void case22() {
        String[] result = { "o--", "o--", "oo-", "ooo", "ooo", "o--", "ooo", "oo-", "ooo", "oo-", "ooo", "o--", "o--", "o--", "oo-", "o--", "ooo", "o--", "ooo", "o--" };
        assertEquals(38, foxandgame.countStars(result));
    }

    @Test
    public void case23() {
        String[] result = { "oo-", "ooo", "oo-", "o--", "oo-", "ooo", "ooo", "oo-", "ooo", "---", "ooo", "ooo", "ooo", "o--", "o--", "o--", "oo-", "o--", "---", "oo-", "---", "o--", "oo-", "---", "o--", "ooo" };
        assertEquals(45, foxandgame.countStars(result));
    }

    @Test
    public void case24() {
        String[] result = { "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo" };
        assertEquals(114, foxandgame.countStars(result));
    }

    @Test
    public void case25() {
        String[] result = { "---", "o--", "ooo", "o--", "---", "---", "o--", "o--", "---", "ooo", "---", "ooo", "o--", "ooo", "oo-", "---", "ooo" };
        assertEquals(22, foxandgame.countStars(result));
    }

    @Test
    public void case26() {
        String[] result = { "o--", "oo-", "o--", "o--", "ooo", "o--", "oo-", "oo-", "ooo", "o--", "oo-", "o--", "o--", "ooo", "ooo", "oo-", "ooo" };
        assertEquals(32, foxandgame.countStars(result));
    }

    @Test
    public void case27() {
        String[] result = { "ooo", "o--", "ooo", "o--", "ooo", "ooo", "ooo", "oo-", "ooo", "ooo", "ooo", "ooo", "o--", "ooo" };
        assertEquals(35, foxandgame.countStars(result));
    }

    @Test
    public void case28() {
        String[] result = { "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo" };
        assertEquals(144, foxandgame.countStars(result));
    }

    @Test
    public void case29() {
        String[] result = { "ooo", "ooo", "oo-", "o--", "oo-", "oo-", "oo-", "oo-", "ooo", "oo-", "o--", "ooo", "oo-", "ooo", "oo-", "oo-", "o--", "oo-", "o--", "ooo", "o--", "oo-", "ooo", "ooo", "oo-", "ooo", "oo-", "oo-", "o--", "ooo", "ooo", "o--", "ooo", "ooo", "oo-", "o--", "ooo", "ooo", "oo-", "ooo", "oo-", "ooo", "ooo" };
        assertEquals(96, foxandgame.countStars(result));
    }

    @Test
    public void case30() {
        String[] result = { "---", "oo-", "---", "oo-" };
        assertEquals(4, foxandgame.countStars(result));
    }

    @Test
    public void case31() {
        String[] result = { "o--", "oo-", "ooo", "ooo", "oo-", "o--", "ooo", "o--", "o--", "ooo", "oo-", "o--", "o--", "oo-", "o--", "o--", "o--", "ooo", "o--", "o--" };
        assertEquals(34, foxandgame.countStars(result));
    }

    @Test
    public void case32() {
        String[] result = { "oo-", "oo-", "ooo", "ooo", "ooo", "oo-", "ooo", "ooo", "ooo", "oo-", "oo-", "oo-", "ooo" };
        assertEquals(33, foxandgame.countStars(result));
    }

    @Test
    public void case33() {
        String[] result = { "oo-", "ooo", "ooo", "ooo", "ooo", "oo-", "ooo", "oo-", "oo-", "o--", "ooo", "oo-", "oo-", "oo-", "ooo", "oo-" };
        assertEquals(38, foxandgame.countStars(result));
    }

    @Test
    public void case34() {
        String[] result = { "oo-", "ooo", "ooo", "---", "oo-", "---", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo" };
        assertEquals(28, foxandgame.countStars(result));
    }

    @Test
    public void case35() {
        String[] result = { "o--", "oo-", "oo-", "ooo", "ooo", "o--", "oo-", "ooo", "o--" };
        assertEquals(18, foxandgame.countStars(result));
    }

    @Test
    public void case36() {
        String[] result = { "oo-", "o--", "ooo", "ooo", "oo-", "o--", "oo-", "oo-", "o--", "oo-", "ooo", "o--", "oo-", "ooo", "ooo", "o--", "ooo", "ooo", "ooo", "ooo", "ooo", "o--", "ooo" };
        assertEquals(51, foxandgame.countStars(result));
    }

    @Test
    public void case37() {
        String[] result = { "ooo", "ooo", "ooo", "oo-", "ooo", "o--", "ooo", "ooo", "ooo", "ooo", "oo-", "oo-", "ooo", "ooo", "oo-", "oo-", "oo-", "oo-", "oo-", "ooo", "ooo", "ooo", "ooo", "oo-", "ooo", "oo-", "oo-", "oo-", "oo-", "o--", "ooo", "ooo", "ooo", "ooo", "ooo", "oo-", "oo-" };
        assertEquals(92, foxandgame.countStars(result));
    }

    @Test
    public void case38() {
        String[] result = { "oo-", "oo-", "oo-", "ooo", "ooo", "ooo", "---", "---" };
        assertEquals(15, foxandgame.countStars(result));
    }

    @Test
    public void case39() {
        String[] result = { "ooo", "ooo", "o--", "ooo", "oo-" };
        assertEquals(12, foxandgame.countStars(result));
    }

    @Test
    public void case40() {
        String[] result = { "ooo", "ooo", "ooo", "---", "o--", "ooo", "ooo", "ooo", "ooo", "o--", "o--", "ooo", "---", "ooo", "ooo", "o--", "ooo", "ooo", "o--", "ooo" };
        assertEquals(44, foxandgame.countStars(result));
    }

    @Test
    public void case41() {
        String[] result = { "ooo", "o--", "ooo", "ooo", "ooo", "oo-", "oo-", "ooo", "o--", "oo-", "ooo", "ooo", "oo-", "o--", "oo-", "o--", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "oo-", "oo-", "ooo", "o--", "ooo", "o--", "o--", "o--", "ooo", "oo-", "oo-", "ooo", "oo-", "ooo", "ooo", "oo-", "o--", "ooo", "oo-", "ooo", "oo-" };
        assertEquals(98, foxandgame.countStars(result));
    }

    @Test
    public void case42() {
        String[] result = { "ooo", "o--", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "o--", "oo-", "o--", "oo-", "ooo", "ooo", "ooo", "ooo", "o--", "oo-", "ooo", "oo-", "oo-", "oo-", "ooo", "ooo", "oo-", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "o--", "oo-", "ooo", "ooo", "ooo", "o--", "ooo", "oo-", "oo-", "ooo", "o--" };
        assertEquals(102, foxandgame.countStars(result));
    }

    @Test
    public void case43() {
        String[] result = { "o--", "ooo", "o--", "oo-", "oo-", "---", "---", "oo-", "---", "oo-" };
        assertEquals(13, foxandgame.countStars(result));
    }

    @Test
    public void case44() {
        String[] result = { "ooo", "ooo", "---", "oo-", "---", "ooo" };
        assertEquals(11, foxandgame.countStars(result));
    }

    @Test
    public void case45() {
        String[] result = { "ooo", "o--", "o--", "o--", "o--", "ooo", "o--", "o--", "oo-" };
        assertEquals(14, foxandgame.countStars(result));
    }

    @Test
    public void case46() {
        String[] result = { "oo-", "oo-", "ooo", "ooo", "ooo", "oo-", "ooo", "oo-", "oo-", "oo-", "oo-", "oo-", "oo-", "ooo", "oo-", "oo-", "oo-", "ooo", "ooo", "ooo" };
        assertEquals(48, foxandgame.countStars(result));
    }

    @Test
    public void case47() {
        String[] result = { "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo" };
        assertEquals(126, foxandgame.countStars(result));
    }

    @Test
    public void case48() {
        String[] result = { "oo-", "---", "o--", "---", "ooo", "oo-", "ooo", "oo-", "ooo", "ooo", "ooo", "---", "o--", "o--", "ooo", "ooo", "ooo", "oo-", "ooo", "o--", "ooo", "ooo", "o--", "---", "oo-", "ooo", "---", "oo-", "ooo", "ooo", "o--", "ooo", "---", "ooo", "ooo", "o--", "ooo", "ooo", "ooo" };
        assertEquals(79, foxandgame.countStars(result));
    }

    @Test
    public void case49() {
        String[] result = { "ooo", "ooo", "---", "---", "oo-", "oo-", "oo-" };
        assertEquals(12, foxandgame.countStars(result));
    }

    @Test
    public void case50() {
        String[] result = { "ooo", "---", "ooo", "---", "ooo", "---", "ooo", "ooo", "ooo", "ooo", "---", "---", "ooo", "ooo", "ooo", "ooo", "---", "---", "ooo", "ooo", "---", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "---", "ooo", "ooo", "---", "---", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo" };
        assertEquals(87, foxandgame.countStars(result));
    }

    @Test
    public void case51() {
        String[] result = { "o--", "ooo", "o--", "ooo", "o--", "ooo", "ooo", "o--", "---", "---", "ooo", "ooo", "o--", "o--", "o--", "---", "ooo", "o--", "ooo" };
        assertEquals(32, foxandgame.countStars(result));
    }

    @Test
    public void case52() {
        String[] result = { "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo" };
        assertEquals(63, foxandgame.countStars(result));
    }

    @Test
    public void case53() {
        String[] result = { "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo" };
        assertEquals(30, foxandgame.countStars(result));
    }

    @Test
    public void case54() {
        String[] result = { "ooo", "ooo", "ooo", "o--", "ooo", "ooo", "ooo", "ooo", "---", "ooo" };
        assertEquals(25, foxandgame.countStars(result));
    }

    @Test
    public void case55() {
        String[] result = { "o--", "ooo", "o--", "o--", "ooo", "o--", "o--", "ooo", "ooo", "o--", "ooo", "o--", "ooo", "o--", "o--", "o--", "o--", "o--", "ooo", "o--", "o--", "ooo", "ooo", "o--", "o--", "o--", "ooo", "o--", "ooo", "o--" };
        assertEquals(52, foxandgame.countStars(result));
    }

    @Test
    public void case56() {
        String[] result = { "---", "ooo", "o--", "oo-", "ooo", "---", "oo-", "ooo" };
        assertEquals(14, foxandgame.countStars(result));
    }

    @Test
    public void case57() {
        String[] result = { "ooo", "o--", "o--", "ooo", "ooo", "ooo", "ooo", "o--", "ooo", "ooo", "---", "ooo", "o--", "---", "ooo", "ooo", "o--" };
        assertEquals(35, foxandgame.countStars(result));
    }

    @Test
    public void case58() {
        String[] result = { "oo-", "o--", "o--", "ooo", "oo-", "o--", "o--", "ooo", "o--" };
        assertEquals(15, foxandgame.countStars(result));
    }

    @Test
    public void case59() {
        String[] result = { "o--", "oo-", "o--", "oo-", "ooo", "oo-", "ooo", "o--", "oo-", "oo-", "o--", "oo-", "o--", "o--", "o--", "oo-", "oo-", "o--", "o--", "ooo", "oo-", "oo-", "oo-", "o--", "oo-", "oo-", "oo-", "oo-", "oo-", "o--", "oo-", "oo-", "o--", "oo-", "o--", "o--" };
        assertEquals(61, foxandgame.countStars(result));
    }

    @Test
    public void case60() {
        String[] result = { "ooo", "oo-", "ooo" };
        assertEquals(8, foxandgame.countStars(result));
    }

    @Test
    public void case61() {
        String[] result = { "ooo", "---", "ooo", "o--", "ooo", "ooo", "---", "ooo", "ooo", "ooo", "ooo", "ooo", "---", "ooo", "ooo", "ooo", "ooo", "ooo", "---", "ooo", "ooo", "o--", "ooo", "ooo", "o--", "ooo", "---", "ooo", "ooo", "---", "ooo", "ooo", "o--", "ooo", "ooo", "---", "---", "---", "ooo", "---", "ooo", "---", "o--", "o--" };
        assertEquals(87, foxandgame.countStars(result));
    }

    @Test
    public void case62() {
        String[] result = { "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo" };
        assertEquals(141, foxandgame.countStars(result));
    }

    @Test
    public void case63() {
        String[] result = { "---", "---", "---", "o--", "o--" };
        assertEquals(2, foxandgame.countStars(result));
    }

    @Test
    public void case64() {
        String[] result = { "ooo", "ooo", "ooo", "ooo", "ooo", "o--", "ooo", "ooo", "ooo", "ooo", "ooo", "o--", "o--", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "o--", "ooo", "ooo", "ooo", "o--", "o--", "o--", "o--", "ooo", "ooo", "ooo", "ooo", "o--", "ooo", "ooo", "ooo", "o--", "ooo", "o--", "ooo", "ooo", "o--", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo" };
        assertEquals(126, foxandgame.countStars(result));
    }

    @Test
    public void case65() {
        String[] result = { "o--", "o--", "ooo", "oo-", "ooo", "oo-", "oo-", "oo-", "ooo", "o--", "ooo", "ooo", "ooo", "oo-", "ooo", "ooo", "o--", "oo-", "ooo", "oo-", "o--", "ooo", "ooo", "ooo", "o--", "oo-" };
        assertEquals(58, foxandgame.countStars(result));
    }

    @Test
    public void case66() {
        String[] result = { "---", "ooo", "ooo", "oo-", "ooo", "oo-", "ooo", "oo-", "ooo", "ooo", "ooo", "oo-", "oo-", "---", "ooo", "oo-", "---", "ooo", "ooo", "ooo", "oo-", "oo-", "---", "oo-", "ooo", "ooo", "oo-", "---", "ooo", "oo-", "---", "ooo", "ooo", "oo-", "ooo", "ooo", "ooo", "---", "ooo", "ooo", "---", "ooo", "ooo", "ooo", "ooo", "---" };
        assertEquals(99, foxandgame.countStars(result));
    }

    @Test
    public void case67() {
        String[] result = { "ooo", "ooo", "ooo", "oo-", "ooo", "oo-", "ooo", "ooo", "ooo", "ooo", "oo-", "oo-", "ooo", "ooo", "oo-", "ooo", "ooo", "ooo", "oo-", "ooo", "ooo", "oo-", "ooo" };
        assertEquals(62, foxandgame.countStars(result));
    }

    @Test
    public void case68() {
        String[] result = { "---", "o--", "---", "oo-", "ooo", "oo-", "ooo", "o--", "---", "oo-", "---", "ooo", "ooo", "ooo", "---", "ooo", "o--", "---", "oo-", "oo-", "oo-", "oo-", "oo-", "oo-", "o--", "oo-", "---", "ooo", "---", "---", "o--", "oo-", "o--", "o--", "ooo", "oo-", "---", "oo-" };
        assertEquals(57, foxandgame.countStars(result));
    }

    @Test
    public void case69() {
        String[] result = { "o--", "oo-", "ooo", "ooo", "ooo", "ooo", "ooo", "oo-", "o--", "ooo", "oo-", "ooo", "oo-", "oo-", "ooo", "oo-", "oo-", "oo-", "ooo", "ooo", "ooo", "ooo", "ooo" };
        assertEquals(57, foxandgame.countStars(result));
    }

    @Test
    public void case70() {
        String[] result = { "o--", "oo-", "o--", "oo-", "ooo", "o--", "o--", "ooo", "oo-", "oo-", "oo-", "o--", "o--", "oo-", "ooo", "oo-", "ooo", "o--", "o--", "o--", "oo-", "ooo", "o--", "ooo", "o--" };
        assertEquals(45, foxandgame.countStars(result));
    }

    @Test
    public void case71() {
        String[] result = { "---", "oo-", "o--", "o--", "oo-", "o--", "o--", "oo-", "ooo", "oo-", "ooo", "ooo", "oo-", "---", "ooo", "o--", "ooo", "oo-", "---", "ooo", "ooo", "oo-", "o--", "o--", "oo-", "oo-", "---", "oo-", "---", "oo-", "o--", "---", "o--", "---", "oo-", "oo-" };
        assertEquals(56, foxandgame.countStars(result));
    }

    @Test
    public void case72() {
        String[] result = { "oo-", "---", "oo-", "ooo", "oo-", "oo-", "ooo", "ooo", "oo-", "oo-", "oo-", "ooo", "ooo", "ooo", "oo-", "ooo", "---", "oo-", "oo-", "---", "---", "oo-", "ooo", "oo-", "ooo", "oo-", "o--", "ooo", "---", "ooo", "oo-", "ooo", "ooo", "oo-", "---", "ooo", "oo-", "---", "oo-", "oo-", "oo-", "---", "ooo", "oo-", "oo-", "oo-", "o--" };
        assertEquals(91, foxandgame.countStars(result));
    }

    @Test
    public void case73() {
        String[] result = { "ooo", "ooo", "ooo", "ooo", "---", "ooo", "oo-", "ooo", "o--", "---", "---", "---", "---", "---", "o--", "oo-", "ooo", "ooo", "ooo", "o--", "---", "o--", "oo-", "oo-", "o--", "oo-", "o--", "ooo", "oo-", "ooo", "ooo", "ooo", "ooo", "---", "oo-", "oo-", "ooo", "---", "oo-", "---", "ooo", "o--", "ooo" };
        assertEquals(76, foxandgame.countStars(result));
    }

    @Test
    public void case74() {
        String[] result = { "ooo", "ooo", "o--", "ooo", "ooo", "o--", "ooo", "o--", "ooo", "o--", "ooo", "o--", "ooo", "ooo", "ooo", "ooo", "o--", "o--", "ooo", "o--", "ooo", "o--", "ooo", "o--", "ooo", "ooo", "o--", "ooo", "ooo", "ooo", "ooo", "ooo", "o--", "ooo", "o--", "o--", "ooo", "ooo", "o--", "ooo", "ooo", "ooo" };
        assertEquals(96, foxandgame.countStars(result));
    }

    @Test
    public void case75() {
        String[] result = { "o--", "o--", "ooo", "oo-", "oo-", "oo-", "ooo", "oo-", "oo-", "o--", "o--", "oo-", "ooo", "ooo", "oo-", "ooo", "o--", "ooo", "oo-", "oo-", "o--", "oo-", "oo-", "o--", "oo-", "oo-", "oo-", "oo-", "ooo", "ooo", "oo-", "ooo", "ooo", "o--", "oo-", "oo-", "o--", "oo-", "oo-", "o--" };
        assertEquals(80, foxandgame.countStars(result));
    }

    @Test
    public void case76() {
        String[] result = { "oo-", "ooo", "ooo", "ooo", "---", "ooo", "---", "oo-", "ooo", "---", "ooo", "---", "---", "ooo", "---", "oo-", "oo-", "ooo", "oo-", "ooo", "---", "---", "ooo", "ooo", "oo-", "ooo", "ooo", "ooo", "ooo", "oo-", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "---", "oo-" };
        assertEquals(79, foxandgame.countStars(result));
    }

    @Test
    public void case77() {
        String[] result = { "ooo", "oo-", "oo-", "ooo", "ooo" };
        assertEquals(13, foxandgame.countStars(result));
    }

    @Test
    public void case78() {
        String[] result = { "o--", "ooo", "ooo", "---", "---", "ooo", "---", "ooo", "o--", "ooo", "ooo", "ooo", "o--", "o--", "ooo" };
        assertEquals(28, foxandgame.countStars(result));
    }

    @Test
    public void case79() {
        String[] result = { "---", "oo-", "---", "o--", "oo-", "---", "ooo", "oo-", "---", "---", "---", "---", "oo-", "---", "ooo", "---", "o--", "ooo", "oo-", "---" };
        assertEquals(21, foxandgame.countStars(result));
    }

    @Test
    public void case80() {
        String[] result = { "o--", "ooo", "ooo", "o--", "ooo", "ooo", "---", "o--", "ooo", "ooo", "ooo", "---", "ooo", "oo-", "---", "ooo", "o--", "ooo", "o--" };
        assertEquals(37, foxandgame.countStars(result));
    }

    @Test
    public void case81() {
        String[] result = { "oo-", "ooo", "ooo", "oo-", "ooo", "ooo", "oo-", "oo-", "oo-", "ooo", "ooo", "oo-", "ooo", "oo-", "ooo", "ooo", "oo-", "oo-", "oo-", "oo-", "oo-", "ooo", "oo-", "ooo", "oo-", "oo-", "ooo", "ooo", "oo-", "ooo", "oo-", "ooo", "ooo", "ooo", "oo-", "ooo", "ooo", "oo-", "oo-", "oo-", "ooo", "oo-", "oo-", "oo-", "ooo", "oo-", "oo-", "oo-", "ooo", "oo-" };
        assertEquals(122, foxandgame.countStars(result));
    }

    @Test
    public void case82() {
        String[] result = { "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo" };
        assertEquals(48, foxandgame.countStars(result));
    }

    @Test
    public void case83() {
        String[] result = { "ooo", "o--", "o--", "ooo", "ooo", "ooo", "oo-", "oo-", "o--", "ooo", "o--", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "o--", "ooo", "ooo", "ooo", "ooo", "oo-", "o--", "ooo", "o--", "ooo", "ooo", "o--", "oo-", "ooo", "ooo", "oo-", "ooo", "oo-" };
        assertEquals(83, foxandgame.countStars(result));
    }

    @Test
    public void case84() {
        String[] result = { "o--", "ooo", "o--", "ooo", "---", "ooo", "ooo", "o--", "o--", "---", "o--", "o--", "o--", "ooo", "ooo", "o--", "ooo", "ooo", "ooo", "---", "ooo", "ooo", "---", "o--", "ooo", "o--", "o--" };
        assertEquals(47, foxandgame.countStars(result));
    }

    @Test
    public void case85() {
        String[] result = { "ooo", "o--", "oo-", "oo-", "o--", "ooo", "o--", "o--", "o--", "oo-", "oo-", "o--", "ooo", "oo-", "o--" };
        assertEquals(26, foxandgame.countStars(result));
    }

    @Test
    public void case86() {
        String[] result = { "o--", "o--", "o--", "o--", "o--", "o--", "ooo", "o--", "o--", "ooo", "o--", "o--", "o--", "o--", "o--", "ooo", "ooo", "o--", "o--", "ooo", "o--", "o--", "o--", "o--", "o--", "ooo", "o--", "ooo", "o--", "o--", "ooo", "o--", "o--", "o--", "ooo", "ooo", "o--" };
        assertEquals(57, foxandgame.countStars(result));
    }

    @Test
    public void case87() {
        String[] result = { "ooo", "ooo", "ooo", "---", "ooo", "ooo", "o--", "o--", "oo-", "o--" };
        assertEquals(20, foxandgame.countStars(result));
    }

    @Test
    public void case88() {
        String[] result = { "o--", "ooo", "o--", "oo-", "o--", "ooo", "o--", "ooo", "ooo", "o--", "o--", "ooo", "o--", "ooo", "ooo", "ooo", "oo-", "oo-", "ooo", "ooo", "o--", "o--", "o--", "ooo", "ooo", "o--", "o--", "ooo", "o--", "oo-", "ooo", "o--", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "o--", "ooo", "o--", "oo-", "ooo", "o--" };
        assertEquals(93, foxandgame.countStars(result));
    }

    @Test
    public void case89() {
        String[] result = { "o--", "o--", "o--", "---", "---", "o--", "o--", "ooo", "ooo", "o--" };
        assertEquals(12, foxandgame.countStars(result));
    }

    @Test
    public void case90() {
        String[] result = { "ooo", "oo-", "ooo", "oo-", "o--", "oo-", "ooo", "ooo", "oo-", "o--", "ooo", "ooo", "ooo", "ooo", "o--", "oo-", "oo-", "oo-", "oo-", "ooo", "ooo", "---", "ooo", "ooo", "oo-", "ooo", "oo-", "ooo", "oo-", "o--", "---", "ooo", "ooo", "oo-", "ooo", "ooo", "ooo", "ooo", "oo-", "oo-", "ooo", "oo-", "o--", "ooo" };
        assertEquals(101, foxandgame.countStars(result));
    }

    @Test
    public void case91() {
        String[] result = { "ooo" };
        assertEquals(3, foxandgame.countStars(result));
    }

    @Test
    public void case92() {
        String[] result = { "o--", "o--", "ooo", "o--", "ooo", "o--" };
        assertEquals(10, foxandgame.countStars(result));
    }

    @Test
    public void case93() {
        String[] result = { "ooo", "ooo", "ooo", "ooo", "o--", "oo-", "ooo", "ooo", "oo-", "ooo", "o--", "oo-", "ooo", "ooo", "oo-", "ooo", "oo-", "ooo", "o--", "ooo", "ooo", "o--", "o--", "ooo", "ooo", "oo-", "ooo", "o--", "oo-", "oo-", "o--", "oo-", "oo-", "oo-", "oo-", "ooo", "o--" };
        assertEquals(83, foxandgame.countStars(result));
    }

    @Test
    public void case94() {
        String[] result = { "ooo", "ooo" };
        assertEquals(6, foxandgame.countStars(result));
    }

    @Test
    public void case95() {
        String[] result = { "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "---", "ooo" };
        assertEquals(27, foxandgame.countStars(result));
    }

    @Test
    public void case96() {
        String[] result = { "oo-", "oo-", "o--" };
        assertEquals(5, foxandgame.countStars(result));
    }

    @Test
    public void case97() {
        String[] result = { "oo-", "ooo", "oo-", "ooo", "oo-", "ooo", "ooo", "oo-", "ooo", "ooo", "ooo", "ooo", "oo-", "ooo", "ooo", "ooo", "ooo", "oo-", "ooo", "ooo", "ooo", "oo-", "oo-", "ooo", "ooo", "oo-", "ooo", "ooo", "oo-", "ooo", "ooo", "ooo", "oo-", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "oo-" };
        assertEquals(111, foxandgame.countStars(result));
    }

    @Test
    public void case98() {
        String[] result = { "ooo", "ooo", "o--", "---", "---" };
        assertEquals(7, foxandgame.countStars(result));
    }

    @Test
    public void case99() {
        String[] result = { "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo" };
        assertEquals(84, foxandgame.countStars(result));
    }

    @Test
    public void case100() {
        String[] result = { "o--", "ooo", "ooo", "ooo", "o--", "o--", "o--", "ooo", "o--", "o--", "ooo", "ooo", "ooo", "o--", "ooo", "o--", "ooo", "ooo", "ooo", "ooo", "o--", "o--", "o--", "ooo", "ooo", "o--", "o--", "ooo", "ooo", "o--", "o--", "ooo", "ooo", "ooo", "ooo", "ooo", "o--", "ooo", "ooo", "ooo", "ooo", "o--", "ooo", "ooo", "o--", "ooo", "o--", "ooo", "ooo", "ooo" };
        assertEquals(112, foxandgame.countStars(result));
    }

    @Test
    public void case101() {
        String[] result = { "ooo", "ooo", "ooo", "ooo", "ooo", "ooo" };
        assertEquals(18, foxandgame.countStars(result));
    }

    @Test
    public void case102() {
        String[] result = { "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo", "ooo" };
        assertEquals(81, foxandgame.countStars(result));
    }

    @Test
    public void case103() {
        String[] result = { "oo-", "ooo", "oo-", "oo-", "o--", "ooo", "oo-", "oo-", "ooo", "oo-", "o--", "o--", "o--", "o--", "ooo" };
        assertEquals(29, foxandgame.countStars(result));
    }

    @Test
    public void case104() {
        String[] result = { "oo-", "oo-", "ooo", "ooo", "ooo", "ooo", "oo-", "ooo", "oo-", "oo-", "oo-", "oo-", "ooo", "oo-", "oo-", "oo-", "oo-", "oo-", "ooo", "oo-", "ooo", "ooo", "oo-", "ooo", "oo-", "oo-", "oo-", "ooo", "ooo" };
        assertEquals(70, foxandgame.countStars(result));
    }

    @Test
    public void case105() {
        String[] result = { "ooo", "ooo", "o--", "o--", "ooo", "ooo", "o--", "ooo", "o--", "ooo", "o--", "o--", "o--", "ooo", "o--", "o--", "o--", "o--", "o--", "o--", "o--", "o--", "o--", "o--", "ooo", "ooo", "o--", "ooo", "o--", "o--" };
        assertEquals(50, foxandgame.countStars(result));
    }

    @Test
    public void case106() {
        String[] result = { "ooo", "o--", "o--" };
        assertEquals(5, foxandgame.countStars(result));
    }

    @Test
    public void case107() {
        String[] result = { "o--", "o--", "o--", "o--" };
        assertEquals(4, foxandgame.countStars(result));
    }

    @Test
    public void case108() {
        String[] result = { "oo-" };
        assertEquals(2, foxandgame.countStars(result));
    }

    @Test
    public void case109() {
        String[] result = { "o--" };
        assertEquals(1, foxandgame.countStars(result));
    }

    @Test
    public void case110() {
        String[] result = { "---", "ooo", "oo-", "o--" };
        assertEquals(6, foxandgame.countStars(result));
    }

    @Test
    public void case111() {
        String[] result = { "ooo", "ooo" };
        assertEquals(6, foxandgame.countStars(result));
    }

    @Test
    public void case112() {
        String[] result = { "---", "o--", "oo-", "ooo", "ooo", "oo-", "o--", "---" };
        assertEquals(12, foxandgame.countStars(result));
    }

    @Test
    public void case113() {
        String[] result = { "ooo", "oo-", "o--" };
        assertEquals(6, foxandgame.countStars(result));
    }

}
