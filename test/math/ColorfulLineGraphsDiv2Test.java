package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class ColorfulLineGraphsDiv2Test {
    ColorfulLineGraphsDiv2 colorfullinegraphsdiv2 = new ColorfulLineGraphsDiv2();

    @Test
    public void case1() {
        int N = 100;
        int K = 3;
        assertEquals(492594064, colorfullinegraphsdiv2.countWays(N, K));
    }
}
