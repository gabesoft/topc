package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class FoxMakingDiceTest {
    FoxMakingDice foxmakingdice = new FoxMakingDice();

    @Test
    public void case1() {
        int N = 6;
        int K = 7;
        assertEquals(2, foxmakingdice.theCount(N, K));
    }

    @Test
    public void case2() {
        int N = 5;
        int K = 7;
        assertEquals(0, foxmakingdice.theCount(N, K));
    }

    @Test
    public void case3() {
        int N = 1000;
        int K = 1;
        assertEquals(20625666000L, foxmakingdice.theCount(N, K));
    }

    @Test
    public void case4() {
        int N = 456;
        int K = 123;
        assertEquals(879075732L, foxmakingdice.theCount(N, K));
    }

    @Test
    public void case5() {
        int N = 913;
        int K = 1014;
        assertEquals(4506149340L, foxmakingdice.theCount(N, K));
    }
}
