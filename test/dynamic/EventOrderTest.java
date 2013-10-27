package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class EventOrderTest {
    EventOrder eventorder = new EventOrder();

    @Test
    public void case1() {
        int longEvents = 0;
        int instantEvents = 2;
        assertEquals(3, eventorder.getCount(longEvents, instantEvents));
    }

    @Test
    public void case2() {
        int longEvents = 1;
        int instantEvents = 1;
        assertEquals(5, eventorder.getCount(longEvents, instantEvents));
    }

    @Test
    public void case3() {
        int longEvents = 2;
        int instantEvents = 0;
        assertEquals(13, eventorder.getCount(longEvents, instantEvents));
    }

    @Test
    public void case4() {
        int longEvents = 0;
        int instantEvents = 4;
        assertEquals(75, eventorder.getCount(longEvents, instantEvents));
    }

    @Test
    public void case5() {
        int longEvents = 1000;
        int instantEvents = 1000;
        assertEquals(665489683, eventorder.getCount(longEvents, instantEvents));
    }

    @Test
    public void case6() {
        int longEvents = 1;
        int instantEvents = 0;
        assertEquals(1, eventorder.getCount(longEvents, instantEvents));
    }

    @Test
    public void case7() {
        int longEvents = 0;
        int instantEvents = 1;
        assertEquals(1, eventorder.getCount(longEvents, instantEvents));
    }

    @Test
    public void case8() {
        int longEvents = 2;
        int instantEvents = 1;
        assertEquals(101, eventorder.getCount(longEvents, instantEvents));
    }

    @Test
    public void case9() {
        int longEvents = 1;
        int instantEvents = 2;
        assertEquals(31, eventorder.getCount(longEvents, instantEvents));
    }

    @Test
    public void case10() {
        int longEvents = 3;
        int instantEvents = 0;
        assertEquals(409, eventorder.getCount(longEvents, instantEvents));
    }

    @Test
    public void case11() {
        int longEvents = 0;
        int instantEvents = 3;
        assertEquals(13, eventorder.getCount(longEvents, instantEvents));
    }

    @Test
    public void case12() {
        int longEvents = 4;
        int instantEvents = 1;
        assertEquals(323093, eventorder.getCount(longEvents, instantEvents));
    }

    @Test
    public void case13() {
        int longEvents = 4;
        int instantEvents = 7;
        assertEquals(13989478, eventorder.getCount(longEvents, instantEvents));
    }

    @Test
    public void case14() {
        int longEvents = 7;
        int instantEvents = 4;
        assertEquals(417933133, eventorder.getCount(longEvents, instantEvents));
    }

    @Test
    public void case15() {
        int longEvents = 997;
        int instantEvents = 998;
        assertEquals(359149531, eventorder.getCount(longEvents, instantEvents));
    }

    @Test
    public void case16() {
        int longEvents = 998;
        int instantEvents = 997;
        assertEquals(605235182, eventorder.getCount(longEvents, instantEvents));
    }

    @Test
    public void case17() {
        int longEvents = 857;
        int instantEvents = 789;
        assertEquals(726313412, eventorder.getCount(longEvents, instantEvents));
    }

    @Test
    public void case18() {
        int longEvents = 997;
        int instantEvents = 1;
        assertEquals(529082900, eventorder.getCount(longEvents, instantEvents));
    }

    @Test
    public void case19() {
        int longEvents = 2;
        int instantEvents = 355;
        assertEquals(889723939, eventorder.getCount(longEvents, instantEvents));
    }

    @Test
    public void case20() {
        int longEvents = 254;
        int instantEvents = 245;
        assertEquals(229655616, eventorder.getCount(longEvents, instantEvents));
    }

    @Test
    public void case21() {
        int longEvents = 936;
        int instantEvents = 909;
        assertEquals(702935821, eventorder.getCount(longEvents, instantEvents));
    }

    @Test
    public void case22() {
        int longEvents = 987;
        int instantEvents = 988;
        assertEquals(129627381, eventorder.getCount(longEvents, instantEvents));
    }

    @Test
    public void case23() {
        int longEvents = 956;
        int instantEvents = 435;
        assertEquals(664968911, eventorder.getCount(longEvents, instantEvents));
    }

    @Test
    public void case24() {
        int longEvents = 234;
        int instantEvents = 986;
        assertEquals(390337642, eventorder.getCount(longEvents, instantEvents));
    }

    @Test
    public void case25() {
        int longEvents = 356;
        int instantEvents = 356;
        assertEquals(98103717, eventorder.getCount(longEvents, instantEvents));
    }

    @Test
    public void case26() {
        int longEvents = 1000;
        int instantEvents = 0;
        assertEquals(374847625, eventorder.getCount(longEvents, instantEvents));
    }

    @Test
    public void case27() {
        int longEvents = 0;
        int instantEvents = 1000;
        assertEquals(629517728, eventorder.getCount(longEvents, instantEvents));
    }

    @Test
    public void case28() {
        int longEvents = 1000;
        int instantEvents = 1;
        assertEquals(656944515, eventorder.getCount(longEvents, instantEvents));
    }

    @Test
    public void case29() {
        int longEvents = 1;
        int instantEvents = 1000;
        assertEquals(862202137, eventorder.getCount(longEvents, instantEvents));
    }

    @Test
    public void case30() {
        int longEvents = 474;
        int instantEvents = 747;
        assertEquals(125016932, eventorder.getCount(longEvents, instantEvents));
    }

}
