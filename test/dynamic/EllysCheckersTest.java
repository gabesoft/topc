package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class EllysCheckersTest {
    EllysCheckers ellyscheckers = new EllysCheckers();

    @Test
    public void case1() {
        String board = ".o...";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case2() {
        String board = "..o..o";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case3() {
        String board = ".o...ooo..oo..";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case4() {
        String board = "......o.ooo.o......";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case5() {
        String board = ".o..o...o....o.....o";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case6() {
        String board = ".......";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case7() {
        String board = ".";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case8() {
        String board = "o";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case9() {
        String board = "oooooooooooooooooooo";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case10() {
        String board = "ooo.ooo.ooo.ooo.ooo.";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case11() {
        String board = "o..ooo";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case12() {
        String board = "oooo...oo";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case13() {
        String board = "oo.o.......";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case14() {
        String board = ".ooooo";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case15() {
        String board = "oooooo..oo.oo..ooooo";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case16() {
        String board = ".o.o...oooooo...";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case17() {
        String board = ".o..o.....";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case18() {
        String board = "ooooo";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case19() {
        String board = ".o.";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case20() {
        String board = "..o..........";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case21() {
        String board = "o.o.o.oooo.";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case22() {
        String board = "oo....o.....ooo";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case23() {
        String board = "...oo..oooo.oooo..o";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case24() {
        String board = "ooooooooooo.oo.o";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case25() {
        String board = "....o..........";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case26() {
        String board = "o.......";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case27() {
        String board = "o.o";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case28() {
        String board = "oo";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case29() {
        String board = "..o...oo.o";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case30() {
        String board = "...oo..";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case31() {
        String board = "o.";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case32() {
        String board = "....o.";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case33() {
        String board = "...ooo.o";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case34() {
        String board = "oooooo.oo.o";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case35() {
        String board = "oooooooooooooooo";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case36() {
        String board = ".o..oo.o";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case37() {
        String board = "ooo.oo.o";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case38() {
        String board = "..oooo...o.ooo";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case39() {
        String board = "........oo..o......";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case40() {
        String board = "o......o..";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case41() {
        String board = "..oooo.o...oo.o..o";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case42() {
        String board = "oo.o.o.ooo..o.o.o";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case43() {
        String board = ".......o........o..";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case44() {
        String board = "o....";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case45() {
        String board = "oooooooooooo";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case46() {
        String board = "o.oooooooooooooooooo";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case47() {
        String board = "......o..";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case48() {
        String board = "oooooooooo.oooo.oo";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case49() {
        String board = "oo..ooo.o...oooo..";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case50() {
        String board = "ooooooooo";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case51() {
        String board = "oo.ooo";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case52() {
        String board = ".o.oo.oooooo.o..";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case53() {
        String board = ".o..o...o...o.";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case54() {
        String board = ".o";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case55() {
        String board = ".o..ooo.o";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case56() {
        String board = ".......o...oo...";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case57() {
        String board = ".o.o";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case58() {
        String board = "o.oo..ooo..o...o";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case59() {
        String board = "ooooooo";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case60() {
        String board = "...........o.o..";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case61() {
        String board = ".o.o..oo";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case62() {
        String board = "oooooooo";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case63() {
        String board = ".o.oo.oooooo";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case64() {
        String board = "......oo.o.......";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case65() {
        String board = "oooo.ooooo.o";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case66() {
        String board = "o....o.......o.oo";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case67() {
        String board = ".......oo.";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case68() {
        String board = "o...oo.oo";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case69() {
        String board = "ooooooooooo";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case70() {
        String board = "oooooo";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case71() {
        String board = "........o...";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case72() {
        String board = "..o";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case73() {
        String board = "o.oo....o.o";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case74() {
        String board = ".o.................";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case75() {
        String board = "ooo";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case76() {
        String board = ".o.oo.ooo.o.";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case77() {
        String board = ".......o.";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case78() {
        String board = "...o...ooo..o..";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case79() {
        String board = ".....o......";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case80() {
        String board = "oooooooooo";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case81() {
        String board = ".oo";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case82() {
        String board = ".oo.oo.oooo..o.o..";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case83() {
        String board = ".oooooooooo.ooo.oo.o";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case84() {
        String board = "..ooooo";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case85() {
        String board = "oooooooooooo...oo.oo";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case86() {
        String board = "o.ooooooo.ooooooo";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case87() {
        String board = "....o...o..";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case88() {
        String board = "oo.";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case89() {
        String board = "..o.o.......";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case90() {
        String board = "o.oo....o..o.o...o..";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case91() {
        String board = "....oo.oo.....o";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case92() {
        String board = "..oo.o";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case93() {
        String board = ".o..o...o....oo....o";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case94() {
        String board = "oooo..ooo..oo..oo..o";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case95() {
        String board = "ooooooooooooooooooo.";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case96() {
        String board = ".o...oooo..oo..";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case97() {
        String board = "oooooooooooooooooo";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case98() {
        String board = ".o..";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case99() {
        String board = "ooooooooooooooooooo";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case100() {
        String board = "o.o....ooo.o.o..o.";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case101() {
        String board = "o..";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case102() {
        String board = "o.oo.o.o..o..o..o...";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case103() {
        String board = "o.oo..o.o..o.o..o.o.";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case104() {
        String board = "oooo.oooo.oooo.oooo.";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case105() {
        String board = "ooooo..";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case106() {
        String board = "..";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case107() {
        String board = "ooooooo.oooooooooooo";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case108() {
        String board = ".o.o...ooo..oo..";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case109() {
        String board = "oooooo.ooooooooooooo";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case110() {
        String board = "ooo.";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case111() {
        String board = "o.o.";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case112() {
        String board = "oooo.";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case113() {
        String board = "oo..o...ooo.";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case114() {
        String board = "oooooo............";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case115() {
        String board = "o.o.o.";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case116() {
        String board = "oo..o.o.ooo.o..o";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

    @Test
    public void case117() {
        String board = "o...";
        assertEquals("YES", ellyscheckers.getWinner(board));
    }

    @Test
    public void case118() {
        String board = "..o..";
        assertEquals("NO", ellyscheckers.getWinner(board));
    }

}
