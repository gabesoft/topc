package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class BunnyComputerTest {
    BunnyComputer bunnycomputer = new BunnyComputer();

    @Test
	public void test1() {
        int[] pref = new int[] { 3, 1, 4, 1, 5, 9, 2, 6 };
        int k = 2;
        assertEquals(28, bunnycomputer.getMaximum(pref, k));
    }

    @Test
	public void test2() {
        int[] pref = new int[] { 3, 1, 4, 1, 5, 9, 2, 6 };
        int k = 1;
        assertEquals(31, bunnycomputer.getMaximum(pref, k));
    }

    @Test
	public void test3() {
        int[] pref = new int[] { 1, 2, 3, 4, 5, 6 };
        int k = 3;
        assertEquals(14, bunnycomputer.getMaximum(pref, k));
    }

    @Test
	public void test4() {
        int[] pref = new int[] { 487, 2010};
        int k = 2;
        assertEquals(0, bunnycomputer.getMaximum(pref, k));
    }
}
