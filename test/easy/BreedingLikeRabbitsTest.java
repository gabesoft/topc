package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class BreedingLikeRabbitsTest {
    @Test
    public void case1() {
        assertEquals("4", BreedingLikeRabbits.answer("7"));
    }

    @Test
    public void case2() {
        assertEquals("None", BreedingLikeRabbits.answer("100"));
    }

    @Test
    public void case3() {
        assertEquals("123", BreedingLikeRabbits.answer("266"));
    }

    @Test
    public void case4() {
        assertEquals("1001", BreedingLikeRabbits.answer("2919"));
    }

    @Test
    public void case5() {
        assertEquals("1000000000000", BreedingLikeRabbits.answer("10915172437697"));
    }

    @Test
    public void case6() {
        assertEquals("105186984972988157", BreedingLikeRabbits.answer("1537228672809129268"));
    }

    @Test
    public void case7() {
        assertEquals("17", BreedingLikeRabbits.answer("22"));
    }
}
