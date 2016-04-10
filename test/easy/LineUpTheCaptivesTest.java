package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class LineUpTheCaptivesTest {
    @Test
    public void case1() {
        assertEquals("2", LineUpTheCaptives.answer(2, 2, 3));
    }

    @Test
    public void case2() {
        assertEquals("24", LineUpTheCaptives.answer(1, 2, 6));
    }

    @Test
    public void case3() {
        assertEquals("2", LineUpTheCaptives.answer(1, 2, 4));
    }

    @Test
    public void case4() {
        assertEquals("6", LineUpTheCaptives.answer(2, 2, 4));
    }

    @Test
    public void case5() {
        assertEquals("3", LineUpTheCaptives.answer(1, 3, 4));
    }

    @Test
    public void case6() {
        assertEquals("3", LineUpTheCaptives.answer(2, 3, 4));
    }

    @Test
    public void case7() {
        assertEquals("11711700", LineUpTheCaptives.answer(5, 7, 14));
    }

    @Test
    public void case8() {
        assertEquals("13860", LineUpTheCaptives.answer(6, 6, 12));
    }

    @Test
    public void case9() {
        assertEquals("462", LineUpTheCaptives.answer(6, 7, 12));
    }

    @Test
    public void case10() {
        assertEquals("72072", LineUpTheCaptives.answer(7, 7, 14));
    }

    @Test
    public void case11() {
        assertEquals("105", LineUpTheCaptives.answer(2, 3, 6));
    }

    @Test
    public void case12() {
        assertEquals("18", LineUpTheCaptives.answer(2, 3, 5));
    }

    @Test
    public void case13() {
        assertEquals("22", LineUpTheCaptives.answer(2, 2, 5));
    }

    @Test
    public void case14() {
        assertEquals("26190840475800", LineUpTheCaptives.answer(20, 20, 40));
    }

    @Test
    public void case15() {
        assertEquals("370735648940954868480", LineUpTheCaptives.answer(12, 24, 40));
    }

    @Test
    public void case16() {
        assertEquals("49359264583135691366121595500", LineUpTheCaptives.answer(3, 25, 40));
    }
}
