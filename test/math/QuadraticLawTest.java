package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class QuadraticLawTest {
    QuadraticLaw quadraticlaw = new QuadraticLaw();

    @Test
    public void case1() {
        long d = 1L;
        assertEquals(0L, quadraticlaw.getTime(d));
    }

    @Test
    public void case2() {
        long d = 2L;
        assertEquals(1L, quadraticlaw.getTime(d));
    }

    @Test
    public void case3() {
        long d = 5L;
        assertEquals(1L, quadraticlaw.getTime(d));
    }

    @Test
    public void case4() {
        long d = 6L;
        assertEquals(2L, quadraticlaw.getTime(d));
    }

    @Test
    public void case5() {
        long d = 7L;
        assertEquals(2L, quadraticlaw.getTime(d));
    }

    @Test
    public void case6() {
        long d = 1482L;
        assertEquals(38L, quadraticlaw.getTime(d));
    }

    @Test
    public void case7() {
        long d = 1000000000000000000L;
        assertEquals(999999999L, quadraticlaw.getTime(d));
    }

    @Test
    public void case8() {
        long d = 3L;
        assertEquals(1L, quadraticlaw.getTime(d));
    }

    @Test
    public void case9() {
        long d = 4L;
        assertEquals(1L, quadraticlaw.getTime(d));
    }

    @Test
    public void case10() {
        long d = 8L;
        assertEquals(2L, quadraticlaw.getTime(d));
    }

    @Test
    public void case11() {
        long d = 9L;
        assertEquals(2L, quadraticlaw.getTime(d));
    }

    @Test
    public void case12() {
        long d = 11L;
        assertEquals(2L, quadraticlaw.getTime(d));
    }

    @Test
    public void case13() {
        long d = 12L;
        assertEquals(3L, quadraticlaw.getTime(d));
    }

    @Test
    public void case14() {
        long d = 13L;
        assertEquals(3L, quadraticlaw.getTime(d));
    }

    @Test
    public void case15() {
        long d = 14L;
        assertEquals(3L, quadraticlaw.getTime(d));
    }

    @Test
    public void case16() {
        long d = 15L;
        assertEquals(3L, quadraticlaw.getTime(d));
    }

    @Test
    public void case17() {
        long d = 19L;
        assertEquals(3L, quadraticlaw.getTime(d));
    }

    @Test
    public void case18() {
        long d = 20L;
        assertEquals(4L, quadraticlaw.getTime(d));
    }

    @Test
    public void case19() {
        long d = 21L;
        assertEquals(4L, quadraticlaw.getTime(d));
    }

    @Test
    public void case20() {
        long d = 25L;
        assertEquals(4L, quadraticlaw.getTime(d));
    }

    @Test
    public void case21() {
        long d = 30L;
        assertEquals(5L, quadraticlaw.getTime(d));
    }

    @Test
    public void case22() {
        long d = 109L;
        assertEquals(9L, quadraticlaw.getTime(d));
    }

    @Test
    public void case23() {
        long d = 110L;
        assertEquals(10L, quadraticlaw.getTime(d));
    }

    @Test
    public void case24() {
        long d = 239L;
        assertEquals(14L, quadraticlaw.getTime(d));
    }

    @Test
    public void case25() {
        long d = 240L;
        assertEquals(15L, quadraticlaw.getTime(d));
    }

    @Test
    public void case26() {
        long d = 272L;
        assertEquals(16L, quadraticlaw.getTime(d));
    }

    @Test
    public void case27() {
        long d = 273L;
        assertEquals(16L, quadraticlaw.getTime(d));
    }

    @Test
    public void case28() {
        long d = 999999999000000000L;
        assertEquals(999999999L, quadraticlaw.getTime(d));
    }

    @Test
    public void case29() {
        long d = 999999998999999999L;
        assertEquals(999999998L, quadraticlaw.getTime(d));
    }

    @Test
    public void case30() {
        long d = 103383831633775665L;
        assertEquals(321533561L, quadraticlaw.getTime(d));
    }

    @Test
    public void case31() {
        long d = 61299352584613691L;
        assertEquals(247587060L, quadraticlaw.getTime(d));
    }

    @Test
    public void case32() {
        long d = 894466004015791768L;
        assertEquals(945762128L, quadraticlaw.getTime(d));
    }

    @Test
    public void case33() {
        long d = 999999999500000000L;
        assertEquals(999999999L, quadraticlaw.getTime(d));
    }

    @Test
    public void case34() {
        long d = 528855640288122840L;
        assertEquals(727224614L, quadraticlaw.getTime(d));
    }

    @Test
    public void case35() {
        long d = 528855642979122840L;
        assertEquals(727224616L, quadraticlaw.getTime(d));
    }

    @Test
    public void case36() {
        long d = 528855641389122740L;
        assertEquals(727224614L, quadraticlaw.getTime(d));
    }

    @Test
    public void case37() {
        long d = 528855641389122940L;
        assertEquals(727224615L, quadraticlaw.getTime(d));
    }

    @Test
    public void case38() {
        long d = 9949762070L;
        assertEquals(99747L, quadraticlaw.getTime(d));
    }

    @Test
    public void case39() {
        long d = 428617L;
        assertEquals(654L, quadraticlaw.getTime(d));
    }

    @Test
    public void case40() {
        long d = 237L;
        assertEquals(14L, quadraticlaw.getTime(d));
    }

    @Test
    public void case41() {
        long d = 619L;
        assertEquals(24L, quadraticlaw.getTime(d));
    }

    @Test
    public void case42() {
        long d = 177065240309308056L;
        assertEquals(420791207L, quadraticlaw.getTime(d));
    }

    @Test
    public void case43() {
        long d = 177065240309308055L;
        assertEquals(420791206L, quadraticlaw.getTime(d));
    }

    @Test
    public void case44() {
        long d = 177065240309308054L;
        assertEquals(420791206L, quadraticlaw.getTime(d));
    }

    @Test
    public void case45() {
        long d = 59984731L;
        assertEquals(7744L, quadraticlaw.getTime(d));
    }

    @Test
    public void case46() {
        long d = 716985016762L;
        assertEquals(846749L, quadraticlaw.getTime(d));
    }

    @Test
    public void case47() {
        long d = 1662103671524136L;
        assertEquals(40768905L, quadraticlaw.getTime(d));
    }

    @Test
    public void case48() {
        long d = 680794135506987356L;
        assertEquals(825102499L, quadraticlaw.getTime(d));
    }

    @Test
    public void case49() {
        long d = 936977302116305825L;
        assertEquals(967975878L, quadraticlaw.getTime(d));
    }

    @Test
    public void case50() {
        long d = 1234567890L;
        assertEquals(35135L, quadraticlaw.getTime(d));
    }

    @Test
    public void case51() {
        long d = 31958809614643170L;
        assertEquals(178770270L, quadraticlaw.getTime(d));
    }

    @Test
    public void case52() {
        long d = 999999203000158731L;
        assertEquals(999999600L, quadraticlaw.getTime(d));
    }

    @Test
    public void case53() {
        long d = 99999999999999999L;
        assertEquals(316227765L, quadraticlaw.getTime(d));
    }

    @Test
    public void case54() {
        long d = 500L;
        assertEquals(21L, quadraticlaw.getTime(d));
    }

    @Test
    public void case55() {
        long d = 56478496L;
        assertEquals(7514L, quadraticlaw.getTime(d));
    }

    @Test
    public void case56() {
        long d = 170L;
        assertEquals(12L, quadraticlaw.getTime(d));
    }

    @Test
    public void case57() {
        long d = 10L;
        assertEquals(2L, quadraticlaw.getTime(d));
    }

    @Test
    public void case58() {
        long d = 5789L;
        assertEquals(75L, quadraticlaw.getTime(d));
    }

    @Test
    public void case59() {
        long d = 38L;
        assertEquals(5L, quadraticlaw.getTime(d));
    }

    @Test
    public void case60() {
        long d = 970L;
        assertEquals(30L, quadraticlaw.getTime(d));
    }

    @Test
    public void case61() {
        long d = 208L;
        assertEquals(13L, quadraticlaw.getTime(d));
    }

    @Test
    public void case62() {
        long d = 23252444213212961L;
        assertEquals(152487520L, quadraticlaw.getTime(d));
    }

}
