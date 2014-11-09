package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class MovingRooksDiv2Test {
    MovingRooksDiv2 movingrooksdiv2 = new MovingRooksDiv2();

    @Test
    public void case1() {
        int[] Y1 = { 0 };
        int[] Y2 = { 0 };
        assertEquals("Possible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case2() {
        int[] Y1 = { 1, 0 };
        int[] Y2 = { 0, 1 };
        assertEquals("Possible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case3() {
        int[] Y1 = { 0, 1 };
        int[] Y2 = { 1, 0 };
        assertEquals("Impossible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case4() {
        int[] Y1 = { 3, 1, 2, 0 };
        int[] Y2 = { 0, 2, 1, 3 };
        assertEquals("Possible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case5() {
        int[] Y1 = { 3, 1, 2, 0 };
        int[] Y2 = { 3, 2, 0, 1 };
        assertEquals("Impossible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case6() {
        int[] Y1 = { 2, 0, 1 };
        int[] Y2 = { 0, 1, 2 };
        assertEquals("Possible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case7() {
        int[] Y1 = { 2, 4, 1, 0, 3 };
        int[] Y2 = { 1, 2, 3, 0, 4 };
        assertEquals("Possible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case8() {
        int[] Y1 = { 7, 0, 4, 6, 5, 3, 1, 2 };
        int[] Y2 = { 4, 1, 5, 7, 2, 3, 6, 0 };
        assertEquals("Impossible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case9() {
        int[] Y1 = { 2, 1, 6, 4, 0, 5, 3 };
        int[] Y2 = { 0, 2, 4, 5, 6, 3, 1 };
        assertEquals("Impossible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case10() {
        int[] Y1 = { 0, 3, 6, 4, 1, 2, 5 };
        int[] Y2 = { 1, 6, 5, 2, 0, 3, 4 };
        assertEquals("Impossible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case11() {
        int[] Y1 = { 3, 0, 2, 1 };
        int[] Y2 = { 2, 3, 0, 1 };
        assertEquals("Impossible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case12() {
        int[] Y1 = { 0, 4, 2, 5, 3, 1 };
        int[] Y2 = { 5, 1, 2, 0, 3, 4 };
        assertEquals("Impossible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case13() {
        int[] Y1 = { 2, 0, 3, 1, 4 };
        int[] Y2 = { 0, 1, 2, 4, 3 };
        assertEquals("Impossible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case14() {
        int[] Y1 = { 3, 6, 2, 4, 1, 5, 0 };
        int[] Y2 = { 6, 4, 0, 2, 1, 3, 5 };
        assertEquals("Impossible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case15() {
        int[] Y1 = { 2, 0, 1 };
        int[] Y2 = { 1, 0, 2 };
        assertEquals("Possible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case16() {
        int[] Y1 = { 1, 0, 4, 5, 3, 2 };
        int[] Y2 = { 0, 3, 4, 1, 5, 2 };
        assertEquals("Impossible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case17() {
        int[] Y1 = { 0, 1, 2 };
        int[] Y2 = { 1, 2, 0 };
        assertEquals("Impossible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case18() {
        int[] Y1 = { 2, 0, 1 };
        int[] Y2 = { 0, 2, 1 };
        assertEquals("Possible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case19() {
        int[] Y1 = { 2, 1, 0, 3, 4 };
        int[] Y2 = { 3, 1, 4, 2, 0 };
        assertEquals("Impossible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case20() {
        int[] Y1 = { 1, 0, 3, 4, 2, 6, 5 };
        int[] Y2 = { 3, 0, 1, 5, 6, 2, 4 };
        assertEquals("Impossible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case21() {
        int[] Y1 = { 4, 2, 0, 3, 1 };
        int[] Y2 = { 2, 1, 0, 4, 3 };
        assertEquals("Possible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case22() {
        int[] Y1 = { 4, 6, 1, 0, 2, 5, 3 };
        int[] Y2 = { 4, 5, 2, 0, 1, 3, 6 };
        assertEquals("Impossible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case23() {
        int[] Y1 = { 6, 0, 5, 1, 3, 4, 2 };
        int[] Y2 = { 0, 3, 6, 1, 5, 4, 2 };
        assertEquals("Possible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case24() {
        int[] Y1 = { 5, 2, 4, 3, 1, 0 };
        int[] Y2 = { 0, 5, 2, 3, 4, 1 };
        assertEquals("Possible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case25() {
        int[] Y1 = { 7, 6, 5, 4, 3, 2, 1, 0 };
        int[] Y2 = { 0, 1, 2, 3, 4, 5, 6, 7 };
        assertEquals("Possible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case26() {
        int[] Y1 = { 6, 7, 5, 4, 3, 2, 1, 0 };
        int[] Y2 = { 7, 0, 1, 2, 3, 4, 5, 6 };
        assertEquals("Impossible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case27() {
        int[] Y1 = { 7, 6, 5, 4, 3, 2, 1, 0 };
        int[] Y2 = { 6, 5, 4, 3, 2, 1, 0, 7 };
        assertEquals("Possible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case28() {
        int[] Y1 = { 3, 1, 2, 0 };
        int[] Y2 = { 0, 2, 1, 3 };
        assertEquals("Possible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case29() {
        int[] Y1 = { 2, 1, 0 };
        int[] Y2 = { 0, 2, 1 };
        assertEquals("Possible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case30() {
        int[] Y1 = { 7, 6, 5, 4, 3, 2, 1, 0 };
        int[] Y2 = { 7, 4, 5, 6, 1, 2, 3, 0 };
        assertEquals("Possible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case31() {
        int[] Y1 = { 5, 6, 7, 4, 3, 2, 1, 0 };
        int[] Y2 = { 3, 4, 5, 6, 7, 1, 2, 0 };
        assertEquals("Possible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case32() {
        int[] Y1 = { 4, 0, 5, 3, 6, 2, 7, 1 };
        int[] Y2 = { 7, 1, 2, 3, 4, 5, 6, 0 };
        assertEquals("Impossible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case33() {
        int[] Y1 = { 3, 1, 0, 2 };
        int[] Y2 = { 1, 3, 2, 0 };
        assertEquals("Impossible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case34() {
        int[] Y1 = { 3, 1, 2, 0 };
        int[] Y2 = { 1, 2, 0, 3 };
        assertEquals("Possible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case35() {
        int[] Y1 = { 0, 1 };
        int[] Y2 = { 1, 0 };
        assertEquals("Impossible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case36() {
        int[] Y1 = { 3, 7, 2, 4, 0, 1, 5, 6 };
        int[] Y2 = { 6, 5, 1, 0, 4, 2, 7, 3 };
        assertEquals("Impossible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case37() {
        int[] Y1 = { 6, 2, 4, 0, 1, 5, 7, 3 };
        int[] Y2 = { 1, 0, 4, 3, 2, 6, 7, 5 };
        assertEquals("Possible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case38() {
        int[] Y1 = { 7, 6, 5, 4, 3, 2, 1, 0 };
        int[] Y2 = { 0, 1, 2, 3, 4, 5, 6, 7 };
        assertEquals("Possible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case39() {
        int[] Y1 = { 2, 1, 0, 3 };
        int[] Y2 = { 1, 2, 3, 0 };
        assertEquals("Impossible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case40() {
        int[] Y1 = { 1, 2, 0, 3 };
        int[] Y2 = { 0, 1, 3, 2 };
        assertEquals("Impossible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case41() {
        int[] Y1 = { 3, 1, 2, 0 };
        int[] Y2 = { 2, 3, 0, 1 };
        assertEquals("Impossible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case42() {
        int[] Y1 = { 0, 1, 2, 3, 4, 5, 6, 7 };
        int[] Y2 = { 0, 1, 2, 3, 4, 5, 7, 6 };
        assertEquals("Impossible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case43() {
        int[] Y1 = { 0, 1 };
        int[] Y2 = { 0, 1 };
        assertEquals("Possible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case44() {
        int[] Y1 = { 1, 0 };
        int[] Y2 = { 0, 1 };
        assertEquals("Possible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case45() {
        int[] Y1 = { 0, 7, 6, 5, 4, 3, 2, 1 };
        int[] Y2 = { 1, 0, 2, 3, 4, 5, 6, 7 };
        assertEquals("Impossible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case46() {
        int[] Y1 = { 0, 1, 2, 3 };
        int[] Y2 = { 0, 1, 3, 2 };
        assertEquals("Impossible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case47() {
        int[] Y1 = { 2, 1, 3, 0 };
        int[] Y2 = { 2, 0, 3, 1 };
        assertEquals("Possible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case48() {
        int[] Y1 = { 7, 6, 5, 4, 3, 2, 1, 0 };
        int[] Y2 = { 1, 2, 0, 4, 3, 5, 6, 7 };
        assertEquals("Possible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case49() {
        int[] Y1 = { 3, 0, 1, 2 };
        int[] Y2 = { 0, 3, 2, 1 };
        assertEquals("Impossible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case50() {
        int[] Y1 = { 7, 6, 5, 4, 3, 1, 2, 0 };
        int[] Y2 = { 3, 4, 5, 6, 7, 2, 0, 1 };
        assertEquals("Impossible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case51() {
        int[] Y1 = { 0, 1, 3, 2 };
        int[] Y2 = { 1, 0, 2, 3 };
        assertEquals("Impossible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case52() {
        int[] Y1 = { 3, 1, 2, 0, 7, 6, 5, 4 };
        int[] Y2 = { 3, 2, 0, 1, 4, 5, 6, 7 };
        assertEquals("Impossible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case53() {
        int[] Y1 = { 7, 6, 4, 3, 2, 1, 0, 5 };
        int[] Y2 = { 5, 7, 6, 1, 0, 3, 2, 4 };
        assertEquals("Impossible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case54() {
        int[] Y1 = { 0, 2, 1, 3 };
        int[] Y2 = { 0, 1, 3, 2 };
        assertEquals("Impossible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case55() {
        int[] Y1 = { 4, 3, 0, 1, 2 };
        int[] Y2 = { 0, 1, 2, 3, 4 };
        assertEquals("Possible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case56() {
        int[] Y1 = { 4, 2, 6, 3, 7, 5, 1, 0 };
        int[] Y2 = { 0, 3, 1, 4, 2, 6, 7, 5 };
        assertEquals("Possible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case57() {
        int[] Y1 = { 2, 0, 1 };
        int[] Y2 = { 1, 0, 2 };
        assertEquals("Possible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case58() {
        int[] Y1 = { 0, 1, 4, 3, 2 };
        int[] Y2 = { 1, 0, 2, 3, 4 };
        assertEquals("Impossible", movingrooksdiv2.move(Y1, Y2));
    }

    @Test
    public void case59() {
        int[] Y1 = { 1, 0, 2 };
        int[] Y2 = { 0, 2, 1 };
        assertEquals("Impossible", movingrooksdiv2.move(Y1, Y2));
    }

}
