package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class FoxPlusMinusTest {
    FoxPlusMinus foxplusminus = new FoxPlusMinus();

    @Test 
    public void case0() {
        int[] first    = {1, 2, 4, 9, 7, 3};
        int N          = 13;
        int[] expected = {3, 4, 2, 7, 1, 9 };
        assertArrayEquals(expected, foxplusminus.maximize(first, N));
    }

    @Test 
    public void case1() {
        int[] first = {
            -4112039, 51143992, 941422315, -153492958, 499218832, 543599293, 132059490, -434243951,
            -95819234, 1552938, -857192847, 481950390, 401099286, 71482395, -711450593, 8101919
        };
        int N = 884142312;
        int[] expected = {
            51143992, 8101919, 71482395, 1552938, 132059490, -4112039,
            401099286, -95819234, 481950390, -153492958, 499218832, -434243951, 
            543599293, -711450593, 941422315, -857192847 
        };

        assertArrayEquals(expected, foxplusminus.maximize(first, N));
    }

    @Test 
    public void case2() {
        int[] first    = {2, 7, -1, 8, -2, -8};
        int N          = 10;
        int[] expected = {2, -1, 7, -2, 8, -8 };
        assertArrayEquals(expected, foxplusminus.maximize(first, N));
    }

    @Test 
    public void case3() {
        int[] first    = {-3, 1, -4, 1, -5, 9, -2};
        int N          = 10;
        int[] expected = {-5, -4, 9, -3, -2, 1, 1 };
        assertArrayEquals(expected, foxplusminus.maximize(first, N));
    }

    @Test 
    public void case4() {
        int[] first    = {-10, -20, -30};
        int N          = 1;
        int[] expected = {-30, -10, -20 };
        assertArrayEquals(expected, foxplusminus.maximize(first, N));
    }
}
