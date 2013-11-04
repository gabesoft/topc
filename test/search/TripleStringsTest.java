package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class TripleStringsTest {
    TripleStrings triplestrings = new TripleStrings();

    @Test
    public void case1() {
        String init = "ooxxox";
        String goal = "xoxoxo";
        assertEquals(6, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case2() {
        String init = "oooxxoo";
        String goal = "oooxxoo";
        assertEquals(0, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case3() {
        String init = "ox";
        String goal = "xo";
        assertEquals(2, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case4() {
        String init = "ooxxooxx";
        String goal = "xxoxoxoo";
        assertEquals(12, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case5() {
        String init = "oxxoxxoooxooooxxxoo";
        String goal = "oxooooxxxooooxoxxxo";
        assertEquals(16, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case6() {
        String init = "xxxoxoxxooxooxoxooo";
        String goal = "oxxooxxooxxoxoxooxo";
        assertEquals(36, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case7() {
        String init = "x";
        String goal = "x";
        assertEquals(0, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case8() {
        String init = "o";
        String goal = "o";
        assertEquals(0, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case9() {
        String init = "xx";
        String goal = "xx";
        assertEquals(0, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case10() {
        String init = "ox";
        String goal = "xo";
        assertEquals(2, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case11() {
        String init = "oo";
        String goal = "oo";
        assertEquals(0, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case12() {
        String init = "xxx";
        String goal = "xxx";
        assertEquals(0, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case13() {
        String init = "oox";
        String goal = "oox";
        assertEquals(0, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case14() {
        String init = "ooo";
        String goal = "ooo";
        assertEquals(0, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case15() {
        String init = "xxoxxox";
        String goal = "xxooxxx";
        assertEquals(12, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case16() {
        String init = "oxoooxo";
        String goal = "xxooooo";
        assertEquals(14, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case17() {
        String init = "oxxoxoo";
        String goal = "oxoxxoo";
        assertEquals(12, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case18() {
        String init = "oooooxoxxoxooo";
        String goal = "oxoxxooooooxoo";
        assertEquals(26, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case19() {
        String init = "xoxooooxxoxoxx";
        String goal = "xxoxooooxxxoox";
        assertEquals(24, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case20() {
        String init = "oxooooxxxoxxoo";
        String goal = "xxoxoxoooxooox";
        assertEquals(28, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case21() {
        String init = "ooooooxoxoxxxxooooooo";
        String goal = "ooooxooooxxoxoxooooxo";
        assertEquals(34, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case22() {
        String init = "xxxxxxxxxxoxxoxxxxxxx";
        String goal = "xxoxxxxxxxxxxxxxxxxxo";
        assertEquals(22, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case23() {
        String init = "xoooxoooooxxooooooooo";
        String goal = "oxoooooxooooxooooooox";
        assertEquals(40, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case24() {
        String init = "ooooxoxooooooooooooooooooooo";
        String goal = "oooooooooooooooooooooxoooxoo";
        assertEquals(14, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case25() {
        String init = "xxxxxxxxxxxxxxoxxxxxxxxoxxxx";
        String goal = "xxxxxxxxxxxxxxxxxxxxxxxxxoox";
        assertEquals(48, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case26() {
        String init = "oooxooxoxxoxooxxoxooxooxooox";
        String goal = "ooxxxooxoooxxxxoooxooxooooxo";
        assertEquals(50, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case27() {
        String init = "xxoxooxoxox";
        String goal = "xxxxxooooxo";
        assertEquals(20, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case28() {
        String init = "oooooooxxoo";
        String goal = "oxxoooooooo";
        assertEquals(12, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case29() {
        String init = "xxooxooxoxx";
        String goal = "ooxooxoxxxx";
        assertEquals(4, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case30() {
        String init = "ooxooxoxoxooxxxoxoxxxx";
        String goal = "oxxxxxooxxxooxoxoxoxoo";
        assertEquals(34, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case31() {
        String init = "xoooxxxxxxxxooxxooxooo";
        String goal = "xxooxxooxoooxxoxxxxoox";
        assertEquals(20, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case32() {
        String init = "oxxxxoxooxxxoxooooooxx";
        String goal = "xxxoxooxxxoxooooooxxxo";
        assertEquals(4, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case33() {
        String init = "xoxxoooooooxooxxooxxooooxxxoxxoxx";
        String goal = "xxxoxxoxxxoooxooxxoooxoxxooooooox";
        assertEquals(48, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case34() {
        String init = "oxxxxooxxoooxxxooxxxoxoxxxxooxoxo";
        String goal = "xxooxxxoxoxxxxooxoxoxxoooxxoxoxox";
        assertEquals(26, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case35() {
        String init = "ooxoxxoxxxxxooxooxooxoxxxxxoxoxox";
        String goal = "xoxxoxxxxxooxooxooxoxxxxxoxoxoxoo";
        assertEquals(4, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case36() {
        String init = "xoooxxxoooxoooxoxxoxxoooxxxxxxxxxxooooxxxxxo";
        String goal = "xxooooxxxxxoxoxxxxxxoxxxoooooxxooooxoxxoxxxo";
        assertEquals(64, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case37() {
        String init = "ooxxoxxxxoxoxooxoxoxooxxxxxxooxxxxxxoxxxoxoo";
        String goal = "xoxooxxxxxxooxxxxxxoxxxoxooxxxoxoxooooxoxoxx";
        assertEquals(34, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case38() {
        String init = "oxoxoxxxoxoxoooxxoxoxxxoxoxxooxooxxooooxxoox";
        String goal = "oxoxxxoxoxoooxxoxoxxxoxoxxooxooxxooooxxooxxo";
        assertEquals(4, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case39() {
        String init = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        String goal = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(0, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case40() {
        String init = "oooooooooooooooooooooooooooooooooooooooooooooooooo";
        String goal = "oooooooooooooooooooooooooooooooooooooooooooooooooo";
        assertEquals(0, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case41() {
        String init = "xxxxxxxxxoxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        String goal = "xxxxxxxxxxxxxxxxxoxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(66, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case42() {
        String init = "ooooooooooooooooooooooooooooooooooooooooooooooxooo";
        String goal = "ooxooooooooooooooooooooooooooooooooooooooooooooooo";
        assertEquals(88, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case43() {
        String init = "xxxxoxxxoxxoxxxoxxxxoxxxxxxxoxxoxxxxxxxxxxoxxxxxxo";
        String goal = "xxoxoxxxoxoxxxxxxoxxxxxxxxxxooxxxxxxxxxoxxxoxxxxxx";
        assertEquals(94, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case44() {
        String init = "xxxoxoxoxxxxxxxoxoxoooxxoxooxxxxooxxxxxoxxxxxxoxox";
        String goal = "xxxxxoooxxooxxoxxxoxxxxoxxxoxxxxxxooxooxxoxxoxxoxx";
        assertEquals(98, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case45() {
        String init = "oxxxoooxoxxxxoxxxxooxoxoxoxxooxooooxxoxxooxoxoxxox";
        String goal = "xxoxooooxooooxxooxooxxoxoxxxoxxxxxxoxooxxooxoxxxxo";
        assertEquals(92, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case46() {
        String init = "oxooxxoxooooxxxooooxxooxooxxoooooooxoxxoooooxxoxxx";
        String goal = "xxooooooxooxoooooxoooxooooxoxxxooxoxxoxoxxxxoxoxoo";
        assertEquals(96, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case47() {
        String init = "oooooxoxoooxxoooooooooxoooxoxoooxooxooxxooooxxoooo";
        String goal = "oooxooooooooooxoxxoxxooxooooxoooxoooooooxooxoooxxo";
        assertEquals(94, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case48() {
        String init = "xooooooooooooxoooooooooxooxoooooxooooooooooxoooooo";
        String goal = "oooooooxoxoxxooooooooxoooooooooooooooooxoooooooooo";
        assertEquals(88, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case49() {
        String init = "ooxxxxoxxxoxxoxxooooxoooxoooxxxxoxooxooxxoxooxooxx";
        String goal = "oxooxooxxooxxoooxooxxxooxxoxoooxxoxoxxxooxxxxxooxo";
        assertEquals(82, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case50() {
        String init = "ooxoxxoxooxoxxoxxoxooxxoxoxoxxooooxooooooxxxxxoxxx";
        String goal = "xooooooxxxxxoxxxooxoooxooxooxxxoooxxoxxxxxoxoxxooo";
        assertEquals(68, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case51() {
        String init = "oxxooxoxoxxxooxxoooxoxooooxxoxoxooxxxoxxxoxoxoxxxx";
        String goal = "xoxoxooxxxoxxxoxoxoxxxxoxoooooxxxooxoxoxxooxxoxoxo";
        assertEquals(54, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case52() {
        String init = "oooxooooxxxxxoxxxoxxooooooxoooxxoxxxxxxooxoxoxxoox";
        String goal = "ooooooxoooxxoxxxxxxooxoxoxxooxoxoxxxxooooxoxoxxxox";
        assertEquals(40, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case53() {
        String init = "oooxxxooxxoooxooxxxxooooxoxoxoxxxoxooxoxoxxxxxoxxo";
        String goal = "xooxxxxooooxoxoxoxxxoxooxoxoxxxxxoxxoxooxooxoxooox";
        assertEquals(26, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case54() {
        String init = "xoxxxxxoxoooooxoxxooooooxoxxoooxooxxxxxoxxoxoxoxxx";
        String goal = "xoxoooooxoxxooooooxoxxoooxooxxxxxoxxoxoxoxxxxoxxxx";
        assertEquals(12, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case55() {
        String init = "xoxoxooxooxxooxxxxxoxoxoooxxxooxoooxxooxxooxxxxxoo";
        String goal = "xoxooxooxxooxxxxxoxoxoooxxxooxoooxxooxxooxxxxxooox";
        assertEquals(4, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case56() {
        String init = "oxoooxxxoooxoooxoxxooxoxooxooxxxoxooxooooooxxxooox";
        String goal = "ooxxxoooxoooxoxxooxoxooxooxxxoxooxooooooxxxoooxxoo";
        assertEquals(6, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case57() {
        String init = "ooooooxxoxooxooxoxxxxoooxooxoxooooxooxooxxxoxooooo";
        String goal = "ooxxoxooxooxoxxxxoooxooxoxooooxooxooxxxoxooooooooo";
        assertEquals(8, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case58() {
        String init = "oooxxxxooxxxooxxxoooxoxoxoooxooooooxxxooxoxoooxxox";
        String goal = "xooooooooxoxooxooxoxooxoxooxxxxxxxxoxxooxoooxooxox";
        assertEquals(98, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case59() {
        String init = "xxoxxxooooxoooxxoooxxooxoxooxoxxxxoxxxoxooxoooooxx";
        String goal = "xxxoooxxxxooooxooxoxoxxooxooxxxoxxooxooooxxoxoxxoo";
        assertEquals(96, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case60() {
        String init = "xoxxxxxoxoooxooooxoxoxoxxxxooxoxxooooxxxoxxxxxxoxo";
        String goal = "oxoxxoxooooxxooxooxxxoxxxxoxxxxoooxoxxoxxxoxxxxooo";
        assertEquals(94, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case61() {
        String init = "xoxooxooxxooxxxxxoxoxoooxxxooxoooxxooxxooxxxxxooox";
        String goal = "xoxooxooxxooxxxxxoxoxoooxxxooxoooxxooxxooxxxxxooox";
        assertEquals(0, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case62() {
        String init = "xoxo";
        String goal = "xxoo";
        assertEquals(8, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case63() {
        String init = "ooxx";
        String goal = "oxox";
        assertEquals(8, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case64() {
        String init = "oxxox";
        String goal = "ooxxx";
        assertEquals(10, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case65() {
        String init = "oooxxxooxxoooxxxooxxoooxxxooxxoooxxxooxxoooxxxooxx";
        String goal = "oxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxox";
        assertEquals(100, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case66() {
        String init = "oxox";
        String goal = "ooxx";
        assertEquals(8, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case67() {
        String init = "oooooooooooooooooooooooooxxxxxxxxxxxxxxxxxxxxxxxxx";
        String goal = "ooooooooooooooooooooooooxoxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(100, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case68() {
        String init = "ooooooooooooooooooooooxoxxxxxxxxxxxxxxxxxxxxx";
        String goal = "oooooooooooooooooooooooxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(90, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case69() {
        String init = "ooooooooooooooooooooooooooooooooooooooooooooooooxx";
        String goal = "oxoxoooooooooooooooooooooooooooooooooooooooooooooo";
        assertEquals(100, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case70() {
        String init = "xxoo";
        String goal = "xoxo";
        assertEquals(8, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case71() {
        String init = "xxxooo";
        String goal = "xoxoxo";
        assertEquals(12, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case72() {
        String init = "xoxoxoxoxoxoxoxxxxxxxxxx";
        String goal = "xxxxxxxxxxxxxxxxxooooooo";
        assertEquals(28, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case73() {
        String init = "oooxxx";
        String goal = "oxoxox";
        assertEquals(12, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case74() {
        String init = "oxoxx";
        String goal = "ooxxx";
        assertEquals(10, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case75() {
        String init = "xxxxooxxoooxxxoxxxxoxoxooxxooxoxxoxooxxoxxoxo";
        String goal = "xxooooxxooxxxxxxxxoxooxxxoxxxoxooxoxoxoooxoxx";
        assertEquals(90, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case76() {
        String init = "ooxox";
        String goal = "oooxx";
        assertEquals(10, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case77() {
        String init = "xoooxooxxxxoxxoxoxoxoxxoxxxoxooxooxxoooxxooxxxooxo";
        String goal = "oxxooxoxoxxoxxooxoxxxoooxxxxoxoxxoxxxoooxoooooxxox";
        assertEquals(98, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case78() {
        String init = "oxoox";
        String goal = "oooxx";
        assertEquals(10, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case79() {
        String init = "ooooxoxo";
        String goal = "ooooxxoo";
        assertEquals(14, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case80() {
        String init = "xxxxxxxxxxxxxxxxxxxxxxxxxooooooooooooooooooooooooo";
        String goal = "xxxxxxxxxxxxxxxxxxxoxxxxxooooooooooxoooooooooooooo";
        assertEquals(100, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case81() {
        String init = "xoxox";
        String goal = "ooxxx";
        assertEquals(10, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case82() {
        String init = "xxooo";
        String goal = "xooxo";
        assertEquals(10, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case83() {
        String init = "xoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxo";
        String goal = "xxooxxooxoxxooxxooxxooxxooxxooxxooxxooxxooxxooxxoo";
        assertEquals(100, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case84() {
        String init = "oxoxoxox";
        String goal = "ooooxxxx";
        assertEquals(16, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case85() {
        String init = "xoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxo";
        String goal = "xxxxxxxxxxxxxxxxxxxxxxxxxooooooooooooooooooooooooo";
        assertEquals(100, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case86() {
        String init = "xoxxoxoxxooxxxxooxxoxxxoxxxxooooxoxxoxxoxooxoooxoo";
        String goal = "ooxoxxxoxoxxoxxoxoxxoooxxoxxxoxxxxooooxxxoxxxooooo";
        assertEquals(96, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case87() {
        String init = "oooxx";
        String goal = "oxoxo";
        assertEquals(10, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case88() {
        String init = "xxoxxoo";
        String goal = "xoxooxx";
        assertEquals(14, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case89() {
        String init = "xoxoxo";
        String goal = "xxxooo";
        assertEquals(12, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case90() {
        String init = "oxoxoxooxxxoxxxxxoxoxxxxoxo";
        String goal = "xxxxooooxxoxxxoxoxoxxxxooxx";
        assertEquals(54, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case91() {
        String init = "xxxxoooooo";
        String goal = "xoooxxooxo";
        assertEquals(20, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case92() {
        String init = "xooxo";
        String goal = "xxooo";
        assertEquals(10, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case93() {
        String init = "ooxxoo";
        String goal = "xoxooo";
        assertEquals(12, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case94() {
        String init = "ooxoxx";
        String goal = "oooxxx";
        assertEquals(12, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case95() {
        String init = "ooxxx";
        String goal = "oxxox";
        assertEquals(10, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case96() {
        String init = "xxooxx";
        String goal = "oxoxxx";
        assertEquals(12, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case97() {
        String init = "oxoxxx";
        String goal = "oxxoxx";
        assertEquals(12, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case98() {
        String init = "xxoxoo";
        String goal = "xxxooo";
        assertEquals(12, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case99() {
        String init = "oxxoo";
        String goal = "xoxoo";
        assertEquals(10, triplestrings.getMinimumOperations(init, goal));
    }

    @Test
    public void case100() {
        String init = "oxxoox";
        String goal = "oooxxx";
        assertEquals(12, triplestrings.getMinimumOperations(init, goal));
    }

}
