package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class GameOfSegmentsTest {
    GameOfSegments gameofsegments = new GameOfSegments();

    @Test
    public void case1() {
        int N = 3;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case2() {
        int N = 4;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case3() {
        int N = 498;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case4() {
        int N = 887;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case5() {
        int N = 854;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case6() {
        int N = 15;
        assertEquals(2, gameofsegments.winner(N));
    }

    @Test
    public void case7() {
        int N = 882;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case8() {
        int N = 621;
        assertEquals(2, gameofsegments.winner(N));
    }

    @Test
    public void case9() {
        int N = 896;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case10() {
        int N = 792;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case11() {
        int N = 265;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case12() {
        int N = 191;
        assertEquals(2, gameofsegments.winner(N));
    }

    @Test
    public void case13() {
        int N = 584;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case14() {
        int N = 34;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case15() {
        int N = 848;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case16() {
        int N = 778;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case17() {
        int N = 413;
        assertEquals(2, gameofsegments.winner(N));
    }

    @Test
    public void case18() {
        int N = 521;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case19() {
        int N = 302;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case20() {
        int N = 842;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case21() {
        int N = 356;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case22() {
        int N = 520;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case23() {
        int N = 197;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case24() {
        int N = 781;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case25() {
        int N = 274;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case26() {
        int N = 663;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case27() {
        int N = 393;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case28() {
        int N = 856;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case29() {
        int N = 858;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case30() {
        int N = 59;
        assertEquals(2, gameofsegments.winner(N));
    }

    @Test
    public void case31() {
        int N = 996;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case32() {
        int N = 577;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case33() {
        int N = 425;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case34() {
        int N = 400;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case35() {
        int N = 861;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case36() {
        int N = 733;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case37() {
        int N = 745;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case38() {
        int N = 409;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case39() {
        int N = 873;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case40() {
        int N = 827;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case41() {
        int N = 83;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case42() {
        int N = 967;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case43() {
        int N = 507;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case44() {
        int N = 704;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case45() {
        int N = 248;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case46() {
        int N = 145;
        assertEquals(2, gameofsegments.winner(N));
    }

    @Test
    public void case47() {
        int N = 745;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case48() {
        int N = 356;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case49() {
        int N = 746;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case50() {
        int N = 459;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case51() {
        int N = 879;
        assertEquals(2, gameofsegments.winner(N));
    }

    @Test
    public void case52() {
        int N = 11;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case53() {
        int N = 999;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case54() {
        int N = 7;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case55() {
        int N = 10;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case56() {
        int N = 929;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case57() {
        int N = 997;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case58() {
        int N = 246;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case59() {
        int N = 1000;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case60() {
        int N = 6;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case61() {
        int N = 925;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case62() {
        int N = 5;
        assertEquals(2, gameofsegments.winner(N));
    }

    @Test
    public void case63() {
        int N = 987;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case64() {
        int N = 190;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case65() {
        int N = 891;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case66() {
        int N = 700;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case67() {
        int N = 8;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case68() {
        int N = 777;
        assertEquals(2, gameofsegments.winner(N));
    }

    @Test
    public void case69() {
        int N = 25;
        assertEquals(2, gameofsegments.winner(N));
    }

    @Test
    public void case70() {
        int N = 24;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case71() {
        int N = 903;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case72() {
        int N = 816;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case73() {
        int N = 37;
        assertEquals(1, gameofsegments.winner(N));
    }

    @Test
    public void case74() {
        int N = 9;
        assertEquals(2, gameofsegments.winner(N));
    }

}
