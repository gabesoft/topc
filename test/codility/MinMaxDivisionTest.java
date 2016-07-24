package topc.test.codility;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.codility.*;

public class MinMaxDivisionTest {
    MinMaxDivision sut = new MinMaxDivision();

    @Test
    public void case1() {
        assertEquals(6, sut.solution(3, 5, new int[] { 2, 1, 5, 1, 2, 2, 2 }));
    }

    @Test
    public void case2() {
        assertEquals(0, sut.solution(1, 1, new int[] { 0 }));
    }

    @Test
    public void case3() {
        assertEquals(5, sut.solution(3, 5, new int[] { 5, 3 }));
    }
}
