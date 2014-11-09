package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class GirlsAndBoysTest {
    GirlsAndBoys girlsandboys = new GirlsAndBoys();

    @Test
	public void test1() {
        assertEquals(2, girlsandboys.sortThem("GGBBG"));
    }

    @Test
	public void test2() {
        assertEquals(0, girlsandboys.sortThem("BBBBGGGG"));
    }

    @Test
	public void test3() {
        assertEquals(33, girlsandboys.sortThem("BGBGBGBGGGBBGBGBGG"));
    }

    @Test
	public void test4() {
        assertEquals(0, girlsandboys.sortThem("B"));
    }
}
