package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class BlackWhiteMagicTest {
    BlackWhiteMagic blackwhitemagic = new BlackWhiteMagic();

    @Test
    public void case1() {
        String creatures = "WBBW";
        assertEquals(1, blackwhitemagic.count(creatures));
    }

    @Test
    public void case2() {
        String creatures = "WWWWBBBB";
        assertEquals(0, blackwhitemagic.count(creatures));
    }

    @Test
    public void case3() {
        String creatures = "BBWW";
        assertEquals(2, blackwhitemagic.count(creatures));
    }

    @Test
    public void case4() {
        String creatures = "BWWWWWWWBBBBBBBW";
        assertEquals(1, blackwhitemagic.count(creatures));
    }

    @Test
    public void case5() {
        String creatures = "WBWBWBWBWWBWBWBWBBBWBW";
        assertEquals(5, blackwhitemagic.count(creatures));
    }

    @Test
    public void case6() {
        String creatures = "B";
        assertEquals(0, blackwhitemagic.count(creatures));
    }

    @Test
    public void case7() {
        String creatures = "W";
        assertEquals(0, blackwhitemagic.count(creatures));
    }

    @Test
    public void case8() {
        String creatures = "BB";
        assertEquals(0, blackwhitemagic.count(creatures));
    }

    @Test
    public void case9() {
        String creatures = "WB";
        assertEquals(0, blackwhitemagic.count(creatures));
    }

    @Test
    public void case10() {
        String creatures = "BW";
        assertEquals(1, blackwhitemagic.count(creatures));
    }

    @Test
    public void case11() {
        String creatures = "WW";
        assertEquals(0, blackwhitemagic.count(creatures));
    }

    @Test
    public void case12() {
        String creatures = "BBB";
        assertEquals(0, blackwhitemagic.count(creatures));
    }

    @Test
    public void case13() {
        String creatures = "WBB";
        assertEquals(0, blackwhitemagic.count(creatures));
    }

    @Test
    public void case14() {
        String creatures = "BWB";
        assertEquals(1, blackwhitemagic.count(creatures));
    }

    @Test
    public void case15() {
        String creatures = "WWB";
        assertEquals(0, blackwhitemagic.count(creatures));
    }

    @Test
    public void case16() {
        String creatures = "BBW";
        assertEquals(1, blackwhitemagic.count(creatures));
    }

    @Test
    public void case17() {
        String creatures = "WBW";
        assertEquals(1, blackwhitemagic.count(creatures));
    }

    @Test
    public void case18() {
        String creatures = "BWW";
        assertEquals(1, blackwhitemagic.count(creatures));
    }

    @Test
    public void case19() {
        String creatures = "WWW";
        assertEquals(0, blackwhitemagic.count(creatures));
    }

    @Test
    public void case20() {
        String creatures = "BBBB";
        assertEquals(0, blackwhitemagic.count(creatures));
    }

    @Test
    public void case21() {
        String creatures = "WBBB";
        assertEquals(0, blackwhitemagic.count(creatures));
    }

    @Test
    public void case22() {
        String creatures = "BWBB";
        assertEquals(1, blackwhitemagic.count(creatures));
    }

    @Test
    public void case23() {
        String creatures = "WWBB";
        assertEquals(0, blackwhitemagic.count(creatures));
    }

    @Test
    public void case24() {
        String creatures = "BBWB";
        assertEquals(1, blackwhitemagic.count(creatures));
    }

    @Test
    public void case25() {
        String creatures = "WBWB";
        assertEquals(1, blackwhitemagic.count(creatures));
    }

    @Test
    public void case26() {
        String creatures = "BWWB";
        assertEquals(1, blackwhitemagic.count(creatures));
    }

    @Test
    public void case27() {
        String creatures = "WWWB";
        assertEquals(0, blackwhitemagic.count(creatures));
    }

    @Test
    public void case28() {
        String creatures = "BBBW";
        assertEquals(1, blackwhitemagic.count(creatures));
    }

    @Test
    public void case29() {
        String creatures = "WBBW";
        assertEquals(1, blackwhitemagic.count(creatures));
    }

    @Test
    public void case30() {
        String creatures = "BWBW";
        assertEquals(1, blackwhitemagic.count(creatures));
    }

    @Test
    public void case31() {
        String creatures = "WWBW";
        assertEquals(1, blackwhitemagic.count(creatures));
    }

    @Test
    public void case32() {
        String creatures = "BBWW";
        assertEquals(2, blackwhitemagic.count(creatures));
    }

    @Test
    public void case33() {
        String creatures = "WBWW";
        assertEquals(1, blackwhitemagic.count(creatures));
    }

    @Test
    public void case34() {
        String creatures = "BWWW";
        assertEquals(1, blackwhitemagic.count(creatures));
    }

    @Test
    public void case35() {
        String creatures = "WWWW";
        assertEquals(0, blackwhitemagic.count(creatures));
    }

    @Test
    public void case36() {
        String creatures = "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW";
        assertEquals(0, blackwhitemagic.count(creatures));
    }

    @Test
    public void case37() {
        String creatures = "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB";
        assertEquals(0, blackwhitemagic.count(creatures));
    }

    @Test
    public void case38() {
        String creatures = "BWBWBWBWBWBWBWBWBWBWBWBWBWBWBWBWBWBWBWBWBWBWBWBWBW";
        assertEquals(13, blackwhitemagic.count(creatures));
    }

    @Test
    public void case39() {
        String creatures = "WBWBWBWBWBWBWBWBWBWBWBWBWBWBWBWBWBWBWBWBWBWBWBWBWB";
        assertEquals(12, blackwhitemagic.count(creatures));
    }

    @Test
    public void case40() {
        String creatures = "BWBWBWBWBWBWBWBWBWBWBWBWBBWBWBWBWBWBWBWBWBWBWBWBWB";
        assertEquals(12, blackwhitemagic.count(creatures));
    }

    @Test
    public void case41() {
        String creatures = "WBWBWBWBWBWBWBWBWBWBWBWBWWBWBWBWBWBWBWBWBWBWBWBWBW";
        assertEquals(12, blackwhitemagic.count(creatures));
    }

    @Test
    public void case42() {
        String creatures = "BWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW";
        assertEquals(1, blackwhitemagic.count(creatures));
    }

    @Test
    public void case43() {
        String creatures = "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBW";
        assertEquals(1, blackwhitemagic.count(creatures));
    }

    @Test
    public void case44() {
        String creatures = "BBBBBBBBBBBBBBBBBBBBBBBBBWWWWWWWWWWWWWWWWWWWWWWWWW";
        assertEquals(25, blackwhitemagic.count(creatures));
    }

    @Test
    public void case45() {
        String creatures = "WWWWWWWWWWWWWWWWWWWWWWWWWBBBBBBBBBBBBBBBBBBBBBBBBB";
        assertEquals(0, blackwhitemagic.count(creatures));
    }

    @Test
    public void case46() {
        String creatures = "WBBWBBBBBWWWWWWWBWBWBBWBBWBBWWBWBWBWWWBWWB";
        assertEquals(11, blackwhitemagic.count(creatures));
    }

    @Test
    public void case47() {
        String creatures = "WBWWWBWBBWWWWWWBBWBBBBBBBBBWBWBBBW";
        assertEquals(4, blackwhitemagic.count(creatures));
    }

    @Test
    public void case48() {
        String creatures = "BWWBBBBBBWBBWBWWBBBWWWWWBBBWBWBWWBBBWWWWBBBW";
        assertEquals(13, blackwhitemagic.count(creatures));
    }

    @Test
    public void case49() {
        String creatures = "WWWBWBBBWBBBWWWWWWWWWWWBWBBBBBWBBWBWB";
        assertEquals(7, blackwhitemagic.count(creatures));
    }

    @Test
    public void case50() {
        String creatures = "BWBWWWBBWB";
        assertEquals(2, blackwhitemagic.count(creatures));
    }

    @Test
    public void case51() {
        String creatures = "BBWBWBBWBWWBBBBWWBWBWWWBW";
        assertEquals(7, blackwhitemagic.count(creatures));
    }

    @Test
    public void case52() {
        String creatures = "BWBWWBWWBBWBBB";
        assertEquals(3, blackwhitemagic.count(creatures));
    }

    @Test
    public void case53() {
        String creatures = "WBWWWWWWBW";
        assertEquals(1, blackwhitemagic.count(creatures));
    }

    @Test
    public void case54() {
        String creatures = "BBBBBBWWBWWBBBBBWBWBWWBBWBBBWBBBBWWWBBBWBBWWWWBBW";
        assertEquals(13, blackwhitemagic.count(creatures));
    }

    @Test
    public void case55() {
        String creatures = "BBBWWWBWWWWBWBWBBWWBBWBWWB";
        assertEquals(6, blackwhitemagic.count(creatures));
    }

    @Test
    public void case56() {
        String creatures = "WBBWBBBWBWWWBWBWWBBWBWBWBBBBBWBWBWBBBBBBWWBBBBWBWW";
        assertEquals(10, blackwhitemagic.count(creatures));
    }

    @Test
    public void case57() {
        String creatures = "BWBWBBWBBBWWWBBWBBWWBBBBBBBWWBBBWBWWBBBBBBBWBBWWBB";
        assertEquals(10, blackwhitemagic.count(creatures));
    }

    @Test
    public void case58() {
        String creatures = "BWBWBWBWWBWWBBBBWBBBWBBBBWWWBBBBBBBWBWBWBWWWBBWWWB";
        assertEquals(12, blackwhitemagic.count(creatures));
    }

    @Test
    public void case59() {
        String creatures = "BBWWWBBBBWWBWBBWWWWWWBWBWBWBWBWWBBBBBWWWWWWBWWBWWB";
        assertEquals(13, blackwhitemagic.count(creatures));
    }

    @Test
    public void case60() {
        String creatures = "BWWWWBWBWBBWBBWBBWWWBWBBBWBWWWWBWWWWWBWBBWWBWBWWBB";
        assertEquals(14, blackwhitemagic.count(creatures));
    }

    @Test
    public void case61() {
        String creatures = "WBBBWWWBWWWWBWWBWWBBWBWBBBBWBBWBBWBBBBWWWWWWBBBWWB";
        assertEquals(11, blackwhitemagic.count(creatures));
    }

    @Test
    public void case62() {
        String creatures = "WBBBBWWWWBBWWBBWBBWWWWWWWWWWBBWWWBBBBWWWWBWBWWWWWW";
        assertEquals(12, blackwhitemagic.count(creatures));
    }

    @Test
    public void case63() {
        String creatures = "WWBBBBBWWBBBWWWWBWBWWWBWWWWWBWBWBWBBBBWWBBWWBWWWWW";
        assertEquals(12, blackwhitemagic.count(creatures));
    }

    @Test
    public void case64() {
        String creatures = "WWWBWBBWWWWWBWWBBWWWBBWWWBBBBBWBBWBBWBWBBBWWBBWBBB";
        assertEquals(8, blackwhitemagic.count(creatures));
    }

    @Test
    public void case65() {
        String creatures = "BBBWWWWBBBBWBBBBBWWWWBWBWWWBBWWWWWWWBWWWBWBWBWBWWW";
        assertEquals(16, blackwhitemagic.count(creatures));
    }

    @Test
    public void case66() {
        String creatures = "BBBBB";
        assertEquals(0, blackwhitemagic.count(creatures));
    }

    @Test
    public void case67() {
        String creatures = "BBWWBBWBBBBBWWBBBBWWWWBBBBWBWBWBWWWBBWWWBBBWWWB";
        assertEquals(13, blackwhitemagic.count(creatures));
    }

    @Test
    public void case68() {
        String creatures = "BBBBBBBBBBW";
        assertEquals(1, blackwhitemagic.count(creatures));
    }

    @Test
    public void case69() {
        String creatures = "WBWBW";
        assertEquals(1, blackwhitemagic.count(creatures));
    }

    @Test
    public void case70() {
        String creatures = "BWBBBBBBBBBBBBBB";
        assertEquals(1, blackwhitemagic.count(creatures));
    }

    @Test
    public void case71() {
        String creatures = "BBBBW";
        assertEquals(1, blackwhitemagic.count(creatures));
    }

    @Test
    public void case72() {
        String creatures = "WWWWWBW";
        assertEquals(1, blackwhitemagic.count(creatures));
    }

    @Test
    public void case73() {
        String creatures = "BBWWWWWBBWWWB";
        assertEquals(3, blackwhitemagic.count(creatures));
    }

    @Test
    public void case74() {
        String creatures = "WWWWWWWWWWWWWWWBW";
        assertEquals(1, blackwhitemagic.count(creatures));
    }

    @Test
    public void case75() {
        String creatures = "WWWWBW";
        assertEquals(1, blackwhitemagic.count(creatures));
    }

    @Test
    public void case76() {
        String creatures = "WBWBWBW";
        assertEquals(2, blackwhitemagic.count(creatures));
    }

    @Test
    public void case77() {
        String creatures = "BWWBWW";
        assertEquals(2, blackwhitemagic.count(creatures));
    }

    @Test
    public void case78() {
        String creatures = "WWWWWWWWWWW";
        assertEquals(0, blackwhitemagic.count(creatures));
    }

    @Test
    public void case79() {
        String creatures = "WWWWW";
        assertEquals(0, blackwhitemagic.count(creatures));
    }

    @Test
    public void case80() {
        String creatures = "WWWWWWWWWWWWWB";
        assertEquals(0, blackwhitemagic.count(creatures));
    }

    @Test
    public void case81() {
        String creatures = "BWBBB";
        assertEquals(1, blackwhitemagic.count(creatures));
    }

    @Test
    public void case82() {
        String creatures = "WBBBBB";
        assertEquals(0, blackwhitemagic.count(creatures));
    }

    @Test
    public void case83() {
        String creatures = "BBBBWW";
        assertEquals(2, blackwhitemagic.count(creatures));
    }

    @Test
    public void case84() {
        String creatures = "WWBBBBBBBB";
        assertEquals(0, blackwhitemagic.count(creatures));
    }

    @Test
    public void case85() {
        String creatures = "WWWBW";
        assertEquals(1, blackwhitemagic.count(creatures));
    }

    @Test
    public void case86() {
        String creatures = "WWWWWWBW";
        assertEquals(1, blackwhitemagic.count(creatures));
    }

    @Test
    public void case87() {
        String creatures = "BWWWW";
        assertEquals(1, blackwhitemagic.count(creatures));
    }

    @Test
    public void case88() {
        String creatures = "WBBBBBBBB";
        assertEquals(0, blackwhitemagic.count(creatures));
    }

    @Test
    public void case89() {
        String creatures = "BBBBBBBBB";
        assertEquals(0, blackwhitemagic.count(creatures));
    }

    @Test
    public void case90() {
        String creatures = "BBBBBBBBBBBB";
        assertEquals(0, blackwhitemagic.count(creatures));
    }

    @Test
    public void case91() {
        String creatures = "BBBBBBBBBW";
        assertEquals(1, blackwhitemagic.count(creatures));
    }

    @Test
    public void case92() {
        String creatures = "BWBBBBB";
        assertEquals(1, blackwhitemagic.count(creatures));
    }

}
