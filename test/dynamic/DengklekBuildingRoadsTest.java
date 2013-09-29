package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class DengklekBuildingRoadsTest {
    DengklekBuildingRoads dengklekbuildingroads = new DengklekBuildingRoads();

    @Test
    public void case1() {
        int N = 3;
        int M = 4;
        int K = 1;
        assertEquals(3, dengklekbuildingroads.numWays(N, M, K));
    }

    @Test
    public void case2() {
        int N = 4;
        int M = 3;
        int K = 3;
        assertEquals(4, dengklekbuildingroads.numWays(N, M, K));
    }

    @Test
    public void case3() {
        int N = 2;
        int M = 1;
        int K = 1;
        assertEquals(0, dengklekbuildingroads.numWays(N, M, K));
    }

    @Test
    public void case4() {
        int N = 5;
        int M = 0;
        int K = 3;
        assertEquals(1, dengklekbuildingroads.numWays(N, M, K));
    }

    @Test
    public void case5() {
        int N = 10;
        int M = 20;
        int K = 5;
        assertEquals(26964424, dengklekbuildingroads.numWays(N, M, K));
    }

    @Test
    public void case6() {
        int N = 30;
        int M = 30;
        int K = 8;
        assertEquals(201860393, dengklekbuildingroads.numWays(N, M, K));
    }

    @Test
    public void case7() {
        int N = 30;
        int M = 30;
        int K = 7;
        assertEquals(145979048, dengklekbuildingroads.numWays(N, M, K));
    }

    @Test
    public void case8() {
        int N = 30;
        int M = 30;
        int K = 6;
        assertEquals(177956313, dengklekbuildingroads.numWays(N, M, K));
    }

    @Test
    public void case9() {
        int N = 30;
        int M = 30;
        int K = 5;
        assertEquals(244633725, dengklekbuildingroads.numWays(N, M, K));
    }

    @Test
    public void case10() {
        int N = 30;
        int M = 30;
        int K = 4;
        assertEquals(457088350, dengklekbuildingroads.numWays(N, M, K));
    }

    @Test
    public void case11() {
        int N = 30;
        int M = 30;
        int K = 3;
        assertEquals(488218396, dengklekbuildingroads.numWays(N, M, K));
    }

    @Test
    public void case12() {
        int N = 30;
        int M = 30;
        int K = 2;
        assertEquals(36571349, dengklekbuildingroads.numWays(N, M, K));
    }

    @Test
    public void case13() {
        int N = 30;
        int M = 30;
        int K = 1;
        assertEquals(532655639, dengklekbuildingroads.numWays(N, M, K));
    }

    @Test
    public void case14() {
        int N = 2;
        int M = 0;
        int K = 1;
        assertEquals(1, dengklekbuildingroads.numWays(N, M, K));
    }

    @Test
    public void case15() {
        int N = 2;
        int M = 1;
        int K = 1;
        assertEquals(0, dengklekbuildingroads.numWays(N, M, K));
    }

    @Test
    public void case16() {
        int N = 2;
        int M = 30;
        int K = 1;
        assertEquals(1, dengklekbuildingroads.numWays(N, M, K));
    }

    @Test
    public void case17() {
        int N = 4;
        int M = 30;
        int K = 3;
        assertEquals(41208, dengklekbuildingroads.numWays(N, M, K));
    }

    @Test
    public void case18() {
        int N = 4;
        int M = 30;
        int K = 1;
        assertEquals(136, dengklekbuildingroads.numWays(N, M, K));
    }

    @Test
    public void case19() {
        int N = 6;
        int M = 30;
        int K = 5;
        assertEquals(595145665, dengklekbuildingroads.numWays(N, M, K));
    }

    @Test
    public void case20() {
        int N = 8;
        int M = 30;
        int K = 3;
        assertEquals(898450917, dengklekbuildingroads.numWays(N, M, K));
    }

    @Test
    public void case21() {
        int N = 7;
        int M = 8;
        int K = 6;
        assertEquals(55041, dengklekbuildingroads.numWays(N, M, K));
    }

    @Test
    public void case22() {
        int N = 16;
        int M = 28;
        int K = 1;
        assertEquals(40116600, dengklekbuildingroads.numWays(N, M, K));
    }

    @Test
    public void case23() {
        int N = 30;
        int M = 2;
        int K = 2;
        assertEquals(57, dengklekbuildingroads.numWays(N, M, K));
    }

    @Test
    public void case24() {
        int N = 30;
        int M = 2;
        int K = 1;
        assertEquals(29, dengklekbuildingroads.numWays(N, M, K));
    }

    @Test
    public void case25() {
        int N = 10;
        int M = 2;
        int K = 5;
        assertEquals(35, dengklekbuildingroads.numWays(N, M, K));
    }

    @Test
    public void case26() {
        int N = 25;
        int M = 13;
        int K = 7;
        assertEquals(309349042, dengklekbuildingroads.numWays(N, M, K));
    }

    @Test
    public void case27() {
        int N = 30;
        int M = 15;
        int K = 4;
        assertEquals(543238700, dengklekbuildingroads.numWays(N, M, K));
    }

    @Test
    public void case28() {
        int N = 27;
        int M = 27;
        int K = 6;
        assertEquals(69218107, dengklekbuildingroads.numWays(N, M, K));
    }

    @Test
    public void case29() {
        int N = 3;
        int M = 19;
        int K = 6;
        assertEquals(45, dengklekbuildingroads.numWays(N, M, K));
    }

    @Test
    public void case30() {
        int N = 1;
        int M = 30;
        int K = 8;
        assertEquals(0, dengklekbuildingroads.numWays(N, M, K));
    }

    @Test
    public void case31() {
        int N = 4;
        int M = 16;
        int K = 7;
        assertEquals(2673, dengklekbuildingroads.numWays(N, M, K));
    }

    @Test
    public void case32() {
        int N = 23;
        int M = 28;
        int K = 1;
        assertEquals(319959386, dengklekbuildingroads.numWays(N, M, K));
    }

    @Test
    public void case33() {
        int N = 16;
        int M = 18;
        int K = 4;
        assertEquals(250757448, dengklekbuildingroads.numWays(N, M, K));
    }

    @Test
    public void case34() {
        int N = 29;
        int M = 29;
        int K = 7;
        assertEquals(85065498, dengklekbuildingroads.numWays(N, M, K));
    }

    @Test
    public void case35() {
        int N = 30;
        int M = 27;
        int K = 7;
        assertEquals(627690142, dengklekbuildingroads.numWays(N, M, K));
    }

    @Test
    public void case36() {
        int N = 30;
        int M = 2;
        int K = 8;
        assertEquals(204, dengklekbuildingroads.numWays(N, M, K));
    }

}
