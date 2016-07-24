package topc.test.codility;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.codility.*;

public class Problem1Test {
    Problem1 sut = new Problem1();

    @Test
    public void case1() {
        assertArrayEquals(new int[] { 1, 1, 0, 1}, sut.toBaseM2(-9));
    }

    @Test
    public void case2() {
        assertEquals(9, sut.toBase10(new int[] { 1, 0, 0, 1, 1 }));
    }
}
