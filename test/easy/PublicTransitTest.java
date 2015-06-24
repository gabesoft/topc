package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class PublicTransitTest {
    PublicTransit publictransit = new PublicTransit();

    @Test
    public void case1() {
        int R = 4;
        int C = 1;
        assertEquals(1, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case2() {
        int R = 2;
        int C = 2;
        assertEquals(1, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case3() {
        int R = 5;
        int C = 3;
        assertEquals(4, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case4() {
        int R = 8;
        int C = 2;
        assertEquals(4, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case5() {
        int R = 1;
        int C = 1;
        assertEquals(0, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case6() {
        int R = 2;
        int C = 1;
        assertEquals(0, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case7() {
        int R = 1;
        int C = 3;
        assertEquals(1, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case8() {
        int R = 4;
        int C = 1;
        assertEquals(1, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case9() {
        int R = 1;
        int C = 5;
        assertEquals(2, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case10() {
        int R = 1;
        int C = 6;
        assertEquals(2, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case11() {
        int R = 7;
        int C = 1;
        assertEquals(3, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case12() {
        int R = 8;
        int C = 1;
        assertEquals(3, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case13() {
        int R = 9;
        int C = 1;
        assertEquals(4, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case14() {
        int R = 1;
        int C = 10;
        assertEquals(4, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case15() {
        int R = 2;
        int C = 2;
        assertEquals(1, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case16() {
        int R = 2;
        int C = 3;
        assertEquals(2, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case17() {
        int R = 4;
        int C = 2;
        assertEquals(2, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case18() {
        int R = 5;
        int C = 2;
        assertEquals(3, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case19() {
        int R = 6;
        int C = 2;
        assertEquals(3, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case20() {
        int R = 2;
        int C = 7;
        assertEquals(4, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case21() {
        int R = 2;
        int C = 8;
        assertEquals(4, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case22() {
        int R = 9;
        int C = 2;
        assertEquals(5, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case23() {
        int R = 2;
        int C = 10;
        assertEquals(5, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case24() {
        int R = 3;
        int C = 3;
        assertEquals(3, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case25() {
        int R = 4;
        int C = 3;
        assertEquals(3, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case26() {
        int R = 5;
        int C = 3;
        assertEquals(4, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case27() {
        int R = 6;
        int C = 3;
        assertEquals(4, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case28() {
        int R = 7;
        int C = 3;
        assertEquals(5, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case29() {
        int R = 3;
        int C = 8;
        assertEquals(5, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case30() {
        int R = 3;
        int C = 9;
        assertEquals(6, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case31() {
        int R = 10;
        int C = 3;
        assertEquals(6, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case32() {
        int R = 4;
        int C = 4;
        assertEquals(4, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case33() {
        int R = 4;
        int C = 5;
        assertEquals(5, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case34() {
        int R = 4;
        int C = 6;
        assertEquals(5, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case35() {
        int R = 4;
        int C = 7;
        assertEquals(6, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case36() {
        int R = 8;
        int C = 4;
        assertEquals(6, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case37() {
        int R = 4;
        int C = 9;
        assertEquals(7, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case38() {
        int R = 10;
        int C = 4;
        assertEquals(7, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case39() {
        int R = 5;
        int C = 5;
        assertEquals(6, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case40() {
        int R = 5;
        int C = 6;
        assertEquals(6, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case41() {
        int R = 5;
        int C = 7;
        assertEquals(7, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case42() {
        int R = 8;
        int C = 5;
        assertEquals(7, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case43() {
        int R = 5;
        int C = 9;
        assertEquals(8, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case44() {
        int R = 5;
        int C = 10;
        assertEquals(8, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case45() {
        int R = 6;
        int C = 6;
        assertEquals(7, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case46() {
        int R = 7;
        int C = 6;
        assertEquals(8, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case47() {
        int R = 8;
        int C = 6;
        assertEquals(8, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case48() {
        int R = 9;
        int C = 6;
        assertEquals(9, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case49() {
        int R = 10;
        int C = 6;
        assertEquals(9, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case50() {
        int R = 7;
        int C = 7;
        assertEquals(9, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case51() {
        int R = 7;
        int C = 8;
        assertEquals(9, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case52() {
        int R = 7;
        int C = 9;
        assertEquals(10, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case53() {
        int R = 10;
        int C = 7;
        assertEquals(10, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case54() {
        int R = 8;
        int C = 8;
        assertEquals(10, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case55() {
        int R = 8;
        int C = 9;
        assertEquals(11, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case56() {
        int R = 8;
        int C = 10;
        assertEquals(11, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case57() {
        int R = 9;
        int C = 9;
        assertEquals(12, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case58() {
        int R = 10;
        int C = 9;
        assertEquals(12, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case59() {
        int R = 10;
        int C = 10;
        assertEquals(13, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case60() {
        int R = 9;
        int C = 10;
        assertEquals(12, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case61() {
        int R = 3;
        int C = 5;
        assertEquals(4, publictransit.minimumLongestDistance(R, C));
    }

    @Test
    public void case62() {
        int R = 1;
        int C = 4;
        assertEquals(1, publictransit.minimumLongestDistance(R, C));
    }

}
