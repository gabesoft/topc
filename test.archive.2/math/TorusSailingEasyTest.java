package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class TorusSailingEasyTest {
    double DELTA = 1.0e-09;
    TorusSailingEasy torussailingeasy = new TorusSailingEasy();

    @Test
    public void case1() {
        int N = 2;
        int M = 2;
        int goalX = 1;
        int goalY = 1;
        assertEquals(1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 1.0);
    }

    @Test
    public void case2() {
        int N = 2;
        int M = 2;
        int goalX = 0;
        int goalY = 1;
        assertEquals(-1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * -1.0);
    }

    @Test
    public void case3() {
        int N = 4;
        int M = 6;
        int goalX = 1;
        int goalY = 3;
        assertEquals(27.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 27.0);
    }

    @Test
    public void case4() {
        int N = 4;
        int M = 7;
        int goalX = 2;
        int goalY = 3;
        assertEquals(180.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 180.0);
    }

    @Test
    public void case5() {
        int N = 6;
        int M = 8;
        int goalX = 3;
        int goalY = 6;
        assertEquals(-1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * -1.0);
    }

    @Test
    public void case6() {
        int N = 8;
        int M = 6;
        int goalX = 1;
        int goalY = 0;
        assertEquals(-1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * -1.0);
    }

    @Test
    public void case7() {
        int N = 3;
        int M = 3;
        int goalX = 1;
        int goalY = 1;
        assertEquals(2.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 2.0);
    }

    @Test
    public void case8() {
        int N = 2;
        int M = 2;
        int goalX = 1;
        int goalY = 0;
        assertEquals(-1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * -1.0);
    }

    @Test
    public void case9() {
        int N = 10;
        int M = 10;
        int goalX = 9;
        int goalY = 9;
        assertEquals(9.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 9.0);
    }

    @Test
    public void case10() {
        int N = 10;
        int M = 10;
        int goalX = 1;
        int goalY = 1;
        assertEquals(9.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 9.0);
    }

    @Test
    public void case11() {
        int N = 10;
        int M = 9;
        int goalX = 9;
        int goalY = 8;
        assertEquals(89.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 89.0);
    }

    @Test
    public void case12() {
        int N = 10;
        int M = 9;
        int goalX = 3;
        int goalY = 6;
        assertEquals(1881.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 1881.0);
    }

    @Test
    public void case13() {
        int N = 2;
        int M = 9;
        int goalX = 1;
        int goalY = 5;
        assertEquals(65.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 65.0);
    }

    @Test
    public void case14() {
        int N = 2;
        int M = 5;
        int goalX = 1;
        int goalY = 3;
        assertEquals(21.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 21.0);
    }

    @Test
    public void case15() {
        int N = 10;
        int M = 8;
        int goalX = 7;
        int goalY = 4;
        assertEquals(-1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * -1.0);
    }

    @Test
    public void case16() {
        int N = 6;
        int M = 8;
        int goalX = 1;
        int goalY = 3;
        assertEquals(95.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 95.0);
    }

    @Test
    public void case17() {
        int N = 5;
        int M = 2;
        int goalX = 1;
        int goalY = 1;
        assertEquals(9.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 9.0);
    }

    @Test
    public void case18() {
        int N = 7;
        int M = 2;
        int goalX = 1;
        int goalY = 1;
        assertEquals(13.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 13.0);
    }

    @Test
    public void case19() {
        int N = 2;
        int M = 3;
        int goalX = 1;
        int goalY = 2;
        assertEquals(5.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 5.0);
    }

    @Test
    public void case20() {
        int N = 3;
        int M = 2;
        int goalX = 0;
        int goalY = 1;
        assertEquals(9.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 9.0);
    }

    @Test
    public void case21() {
        int N = 3;
        int M = 3;
        int goalX = 1;
        int goalY = 2;
        assertEquals(-1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * -1.0);
    }

    @Test
    public void case22() {
        int N = 3;
        int M = 4;
        int goalX = 2;
        int goalY = 0;
        assertEquals(32.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 32.0);
    }

    @Test
    public void case23() {
        int N = 4;
        int M = 6;
        int goalX = 2;
        int goalY = 2;
        assertEquals(20.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 20.0);
    }

    @Test
    public void case24() {
        int N = 6;
        int M = 4;
        int goalX = 1;
        int goalY = 0;
        assertEquals(-1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * -1.0);
    }

    @Test
    public void case25() {
        int N = 10;
        int M = 10;
        int goalX = 7;
        int goalY = 3;
        assertEquals(-1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * -1.0);
    }

    @Test
    public void case26() {
        int N = 10;
        int M = 10;
        int goalX = 9;
        int goalY = 1;
        assertEquals(-1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * -1.0);
    }

    @Test
    public void case27() {
        int N = 5;
        int M = 10;
        int goalX = 4;
        int goalY = 2;
        assertEquals(-1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * -1.0);
    }

    @Test
    public void case28() {
        int N = 5;
        int M = 10;
        int goalX = 1;
        int goalY = 3;
        assertEquals(-1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * -1.0);
    }

    @Test
    public void case29() {
        int N = 8;
        int M = 2;
        int goalX = 2;
        int goalY = 0;
        assertEquals(12.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 12.0);
    }

    @Test
    public void case30() {
        int N = 10;
        int M = 3;
        int goalX = 8;
        int goalY = 1;
        assertEquals(56.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 56.0);
    }

    @Test
    public void case31() {
        int N = 10;
        int M = 4;
        int goalX = 2;
        int goalY = 2;
        assertEquals(36.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 36.0);
    }

    @Test
    public void case32() {
        int N = 10;
        int M = 9;
        int goalX = 5;
        int goalY = 0;
        assertEquals(2025.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 2025.0);
    }

    @Test
    public void case33() {
        int N = 9;
        int M = 10;
        int goalX = 0;
        int goalY = 5;
        assertEquals(2025.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 2025.0);
    }

    @Test
    public void case34() {
        int N = 3;
        int M = 9;
        int goalX = 1;
        int goalY = 7;
        assertEquals(14.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 14.0);
    }

    @Test
    public void case35() {
        int N = 8;
        int M = 2;
        int goalX = 1;
        int goalY = 0;
        assertEquals(-1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * -1.0);
    }

    @Test
    public void case36() {
        int N = 10;
        int M = 7;
        int goalX = 7;
        int goalY = 1;
        assertEquals(741.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 741.0);
    }

    @Test
    public void case37() {
        int N = 4;
        int M = 7;
        int goalX = 3;
        int goalY = 6;
        assertEquals(27.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 27.0);
    }

    @Test
    public void case38() {
        int N = 10;
        int M = 9;
        int goalX = 1;
        int goalY = 1;
        assertEquals(89.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 89.0);
    }

    @Test
    public void case39() {
        int N = 5;
        int M = 8;
        int goalX = 2;
        int goalY = 5;
        assertEquals(111.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 111.0);
    }

    @Test
    public void case40() {
        int N = 8;
        int M = 5;
        int goalX = 2;
        int goalY = 4;
        assertEquals(204.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 204.0);
    }

    @Test
    public void case41() {
        int N = 8;
        int M = 9;
        int goalX = 2;
        int goalY = 1;
        assertEquals(620.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 620.0);
    }

    @Test
    public void case42() {
        int N = 8;
        int M = 6;
        int goalX = 1;
        int goalY = 4;
        assertEquals(-1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * -1.0);
    }

    @Test
    public void case43() {
        int N = 6;
        int M = 8;
        int goalX = 3;
        int goalY = 0;
        assertEquals(-1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * -1.0);
    }

    @Test
    public void case44() {
        int N = 8;
        int M = 5;
        int goalX = 2;
        int goalY = 3;
        assertEquals(396.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 396.0);
    }

    @Test
    public void case45() {
        int N = 4;
        int M = 4;
        int goalX = 2;
        int goalY = 2;
        assertEquals(4.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 4.0);
    }

    @Test
    public void case46() {
        int N = 5;
        int M = 9;
        int goalX = 4;
        int goalY = 8;
        assertEquals(44.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 44.0);
    }

    @Test
    public void case47() {
        int N = 9;
        int M = 10;
        int goalX = 5;
        int goalY = 3;
        assertEquals(1541.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 1541.0);
    }

    @Test
    public void case48() {
        int N = 5;
        int M = 4;
        int goalX = 3;
        int goalY = 0;
        assertEquals(96.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 96.0);
    }

    @Test
    public void case49() {
        int N = 3;
        int M = 7;
        int goalX = 1;
        int goalY = 5;
        assertEquals(38.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 38.0);
    }

    @Test
    public void case50() {
        int N = 10;
        int M = 3;
        int goalX = 9;
        int goalY = 0;
        assertEquals(189.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 189.0);
    }

    @Test
    public void case51() {
        int N = 7;
        int M = 10;
        int goalX = 0;
        int goalY = 9;
        assertEquals(1029.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 1029.0);
    }

    @Test
    public void case52() {
        int N = 4;
        int M = 8;
        int goalX = 2;
        int goalY = 2;
        assertEquals(12.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 12.0);
    }

    @Test
    public void case53() {
        int N = 5;
        int M = 7;
        int goalX = 1;
        int goalY = 2;
        assertEquals(304.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 304.0);
    }

    @Test
    public void case54() {
        int N = 10;
        int M = 6;
        int goalX = 3;
        int goalY = 2;
        assertEquals(-1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * -1.0);
    }

    @Test
    public void case55() {
        int N = 4;
        int M = 5;
        int goalX = 3;
        int goalY = 2;
        assertEquals(91.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 91.0);
    }

    @Test
    public void case56() {
        int N = 6;
        int M = 9;
        int goalX = 4;
        int goalY = 8;
        assertEquals(-1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * -1.0);
    }

    @Test
    public void case57() {
        int N = 8;
        int M = 9;
        int goalX = 2;
        int goalY = 8;
        assertEquals(1196.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 1196.0);
    }

    @Test
    public void case58() {
        int N = 8;
        int M = 2;
        int goalX = 5;
        int goalY = 0;
        assertEquals(-1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * -1.0);
    }

    @Test
    public void case59() {
        int N = 9;
        int M = 2;
        int goalX = 5;
        int goalY = 0;
        assertEquals(56.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 56.0);
    }

    @Test
    public void case60() {
        int N = 2;
        int M = 8;
        int goalX = 1;
        int goalY = 6;
        assertEquals(-1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * -1.0);
    }

    @Test
    public void case61() {
        int N = 7;
        int M = 5;
        int goalX = 5;
        int goalY = 4;
        assertEquals(304.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 304.0);
    }

    @Test
    public void case62() {
        int N = 5;
        int M = 6;
        int goalX = 1;
        int goalY = 5;
        assertEquals(209.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 209.0);
    }

    @Test
    public void case63() {
        int N = 5;
        int M = 3;
        int goalX = 3;
        int goalY = 0;
        assertEquals(36.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 36.0);
    }

    @Test
    public void case64() {
        int N = 4;
        int M = 7;
        int goalX = 1;
        int goalY = 0;
        assertEquals(147.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 147.0);
    }

    @Test
    public void case65() {
        int N = 4;
        int M = 9;
        int goalX = 1;
        int goalY = 1;
        assertEquals(35.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 35.0);
    }

    @Test
    public void case66() {
        int N = 9;
        int M = 9;
        int goalX = 7;
        int goalY = 2;
        assertEquals(-1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * -1.0);
    }

    @Test
    public void case67() {
        int N = 5;
        int M = 9;
        int goalX = 3;
        int goalY = 5;
        assertEquals(506.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 506.0);
    }

    @Test
    public void case68() {
        int N = 5;
        int M = 4;
        int goalX = 4;
        int goalY = 0;
        assertEquals(64.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 64.0);
    }

    @Test
    public void case69() {
        int N = 7;
        int M = 4;
        int goalX = 1;
        int goalY = 3;
        assertEquals(195.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 195.0);
    }

    @Test
    public void case70() {
        int N = 4;
        int M = 7;
        int goalX = 2;
        int goalY = 0;
        assertEquals(196.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 196.0);
    }

    @Test
    public void case71() {
        int N = 10;
        int M = 2;
        int goalX = 2;
        int goalY = 0;
        assertEquals(16.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 16.0);
    }

    @Test
    public void case72() {
        int N = 4;
        int M = 10;
        int goalX = 2;
        int goalY = 3;
        assertEquals(-1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * -1.0);
    }

    @Test
    public void case73() {
        int N = 5;
        int M = 7;
        int goalX = 3;
        int goalY = 6;
        assertEquals(286.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 286.0);
    }

    @Test
    public void case74() {
        int N = 9;
        int M = 9;
        int goalX = 7;
        int goalY = 1;
        assertEquals(-1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * -1.0);
    }

    @Test
    public void case75() {
        int N = 5;
        int M = 9;
        int goalX = 3;
        int goalY = 3;
        assertEquals(126.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 126.0);
    }

    @Test
    public void case76() {
        int N = 5;
        int M = 4;
        int goalX = 3;
        int goalY = 1;
        assertEquals(91.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 91.0);
    }

    @Test
    public void case77() {
        int N = 2;
        int M = 4;
        int goalX = 1;
        int goalY = 3;
        assertEquals(3.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 3.0);
    }

    @Test
    public void case78() {
        int N = 7;
        int M = 5;
        int goalX = 2;
        int goalY = 2;
        assertEquals(66.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 66.0);
    }

    @Test
    public void case79() {
        int N = 6;
        int M = 4;
        int goalX = 3;
        int goalY = 0;
        assertEquals(-1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * -1.0);
    }

    @Test
    public void case80() {
        int N = 5;
        int M = 4;
        int goalX = 1;
        int goalY = 1;
        assertEquals(19.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 19.0);
    }

    @Test
    public void case81() {
        int N = 2;
        int M = 9;
        int goalX = 0;
        int goalY = 7;
        assertEquals(32.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 32.0);
    }

    @Test
    public void case82() {
        int N = 9;
        int M = 4;
        int goalX = 4;
        int goalY = 3;
        assertEquals(155.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 155.0);
    }

    @Test
    public void case83() {
        int N = 6;
        int M = 10;
        int goalX = 5;
        int goalY = 4;
        assertEquals(-1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * -1.0);
    }

    @Test
    public void case84() {
        int N = 2;
        int M = 10;
        int goalX = 0;
        int goalY = 9;
        assertEquals(-1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * -1.0);
    }

    @Test
    public void case85() {
        int N = 9;
        int M = 4;
        int goalX = 1;
        int goalY = 3;
        assertEquals(323.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 323.0);
    }

    @Test
    public void case86() {
        int N = 6;
        int M = 10;
        int goalX = 1;
        int goalY = 4;
        assertEquals(-1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * -1.0);
    }

    @Test
    public void case87() {
        int N = 10;
        int M = 3;
        int goalX = 0;
        int goalY = 2;
        assertEquals(200.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 200.0);
    }

    @Test
    public void case88() {
        int N = 3;
        int M = 10;
        int goalX = 2;
        int goalY = 0;
        assertEquals(200.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 200.0);
    }

    @Test
    public void case89() {
        int N = 7;
        int M = 10;
        int goalX = 5;
        int goalY = 1;
        assertEquals(549.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 549.0);
    }

    @Test
    public void case90() {
        int N = 4;
        int M = 2;
        int goalX = 0;
        int goalY = 1;
        assertEquals(-1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * -1.0);
    }

    @Test
    public void case91() {
        int N = 5;
        int M = 6;
        int goalX = 2;
        int goalY = 5;
        assertEquals(221.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 221.0);
    }

    @Test
    public void case92() {
        int N = 7;
        int M = 4;
        int goalX = 2;
        int goalY = 1;
        assertEquals(171.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 171.0);
    }

    @Test
    public void case93() {
        int N = 10;
        int M = 8;
        int goalX = 2;
        int goalY = 5;
        assertEquals(-1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * -1.0);
    }

    @Test
    public void case94() {
        int N = 10;
        int M = 2;
        int goalX = 9;
        int goalY = 1;
        assertEquals(9.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 9.0);
    }

    @Test
    public void case95() {
        int N = 9;
        int M = 7;
        int goalX = 4;
        int goalY = 5;
        assertEquals(920.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 920.0);
    }

    @Test
    public void case96() {
        int N = 7;
        int M = 7;
        int goalX = 1;
        int goalY = 5;
        assertEquals(-1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * -1.0);
    }

    @Test
    public void case97() {
        int N = 10;
        int M = 10;
        int goalX = 8;
        int goalY = 9;
        assertEquals(-1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * -1.0);
    }

    @Test
    public void case98() {
        int N = 10;
        int M = 9;
        int goalX = 3;
        int goalY = 4;
        assertEquals(1001.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 1001.0);
    }

    @Test
    public void case99() {
        int N = 9;
        int M = 10;
        int goalX = 1;
        int goalY = 5;
        assertEquals(1925.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 1925.0);
    }

    @Test
    public void case100() {
        int N = 9;
        int M = 7;
        int goalX = 4;
        int goalY = 0;
        assertEquals(686.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 686.0);
    }

    @Test
    public void case101() {
        int N = 5;
        int M = 2;
        int goalX = 0;
        int goalY = 1;
        assertEquals(25.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 25.0);
    }

    @Test
    public void case102() {
        int N = 3;
        int M = 3;
        int goalX = 2;
        int goalY = 1;
        assertEquals(-1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * -1.0);
    }

    @Test
    public void case103() {
        int N = 10;
        int M = 9;
        int goalX = 6;
        int goalY = 1;
        assertEquals(2024.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 2024.0);
    }

    @Test
    public void case104() {
        int N = 10;
        int M = 9;
        int goalX = 4;
        int goalY = 8;
        assertEquals(2024.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 2024.0);
    }

    @Test
    public void case105() {
        int N = 9;
        int M = 10;
        int goalX = 4;
        int goalY = 7;
        assertEquals(1541.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 1541.0);
    }

    @Test
    public void case106() {
        int N = 10;
        int M = 9;
        int goalX = 9;
        int goalY = 0;
        assertEquals(729.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 729.0);
    }

    @Test
    public void case107() {
        int N = 5;
        int M = 7;
        int goalX = 2;
        int goalY = 1;
        assertEquals(286.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 286.0);
    }

    @Test
    public void case108() {
        int N = 9;
        int M = 5;
        int goalX = 6;
        int goalY = 0;
        assertEquals(450.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 450.0);
    }

    @Test
    public void case109() {
        int N = 5;
        int M = 8;
        int goalX = 3;
        int goalY = 1;
        assertEquals(231.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 231.0);
    }

    @Test
    public void case110() {
        int N = 5;
        int M = 8;
        int goalX = 3;
        int goalY = 2;
        assertEquals(396.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 396.0);
    }

    @Test
    public void case111() {
        int N = 9;
        int M = 3;
        int goalX = 6;
        int goalY = 0;
        assertEquals(18.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 18.0);
    }

    @Test
    public void case112() {
        int N = 2;
        int M = 10;
        int goalX = 1;
        int goalY = 2;
        assertEquals(-1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * -1.0);
    }

    @Test
    public void case113() {
        int N = 3;
        int M = 10;
        int goalX = 1;
        int goalY = 9;
        assertEquals(209.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 209.0);
    }

    @Test
    public void case114() {
        int N = 4;
        int M = 3;
        int goalX = 3;
        int goalY = 2;
        assertEquals(11.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 11.0);
    }

    @Test
    public void case115() {
        int N = 3;
        int M = 8;
        int goalX = 2;
        int goalY = 2;
        assertEquals(44.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 44.0);
    }

    @Test
    public void case116() {
        int N = 7;
        int M = 7;
        int goalX = 5;
        int goalY = 4;
        assertEquals(-1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * -1.0);
    }

    @Test
    public void case117() {
        int N = 5;
        int M = 5;
        int goalX = 2;
        int goalY = 2;
        assertEquals(6.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 6.0);
    }

    @Test
    public void case118() {
        int N = 10;
        int M = 10;
        int goalX = 5;
        int goalY = 5;
        assertEquals(25.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 25.0);
    }

    @Test
    public void case119() {
        int N = 10;
        int M = 10;
        int goalX = 4;
        int goalY = 4;
        assertEquals(24.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 24.0);
    }

    @Test
    public void case120() {
        int N = 6;
        int M = 2;
        int goalX = 3;
        int goalY = 1;
        assertEquals(9.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 9.0);
    }

    @Test
    public void case121() {
        int N = 6;
        int M = 3;
        int goalX = 1;
        int goalY = 2;
        assertEquals(-1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * -1.0);
    }

    @Test
    public void case122() {
        int N = 6;
        int M = 7;
        int goalX = 1;
        int goalY = 5;
        assertEquals(437.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 437.0);
    }

    @Test
    public void case123() {
        int N = 6;
        int M = 10;
        int goalX = 2;
        int goalY = 4;
        assertEquals(224.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 224.0);
    }

    @Test
    public void case124() {
        int N = 7;
        int M = 3;
        int goalX = 5;
        int goalY = 2;
        assertEquals(80.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 80.0);
    }

    @Test
    public void case125() {
        int N = 7;
        int M = 9;
        int goalX = 2;
        int goalY = 6;
        assertEquals(612.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 612.0);
    }

    @Test
    public void case126() {
        int N = 8;
        int M = 4;
        int goalX = 2;
        int goalY = 2;
        assertEquals(12.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 12.0);
    }

    @Test
    public void case127() {
        int N = 9;
        int M = 3;
        int goalX = 7;
        int goalY = 0;
        assertEquals(-1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * -1.0);
    }

    @Test
    public void case128() {
        int N = 9;
        int M = 8;
        int goalX = 6;
        int goalY = 6;
        assertEquals(396.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 396.0);
    }

    @Test
    public void case129() {
        int N = 9;
        int M = 6;
        int goalX = 4;
        int goalY = 2;
        assertEquals(-1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * -1.0);
    }

    @Test
    public void case130() {
        int N = 10;
        int M = 10;
        int goalX = 9;
        int goalY = 8;
        assertEquals(-1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * -1.0);
    }

    @Test
    public void case131() {
        int N = 10;
        int M = 9;
        int goalX = 1;
        int goalY = 2;
        assertEquals(869.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 869.0);
    }

    @Test
    public void case132() {
        int N = 10;
        int M = 10;
        int goalX = 6;
        int goalY = 6;
        assertEquals(24.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 24.0);
    }

    @Test
    public void case133() {
        int N = 7;
        int M = 10;
        int goalX = 2;
        int goalY = 5;
        assertEquals(325.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 325.0);
    }

    @Test
    public void case134() {
        int N = 7;
        int M = 10;
        int goalX = 1;
        int goalY = 1;
        assertEquals(69.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * 69.0);
    }

    @Test
    public void case135() {
        int N = 2;
        int M = 4;
        int goalX = 0;
        int goalY = 1;
        assertEquals(-1.0, torussailingeasy.expectedTime(N, M, goalX, goalY), DELTA * -1.0);
    }

}
