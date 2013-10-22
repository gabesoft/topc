package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class MagicDiamondsTest {
    MagicDiamonds magicdiamonds = new MagicDiamonds();

    @Test
    public void case1() {
        long n = 2L;
        assertEquals(2L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case2() {
        long n = 4294967297L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case3() {
        long n = 2147483647L;
        assertEquals(2L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case4() {
        long n = 1L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case5() {
        long n = 8566L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case6() {
        long n = 6308L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case7() {
        long n = 4081L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case8() {
        long n = 5680L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case9() {
        long n = 4427L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case10() {
        long n = 2739L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case11() {
        long n = 6181L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case12() {
        long n = 6274L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case13() {
        long n = 3601L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case14() {
        long n = 7506L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case15() {
        long n = 8951L;
        assertEquals(2L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case16() {
        long n = 5345L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case17() {
        long n = 9621L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case18() {
        long n = 9300L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case19() {
        long n = 23L;
        assertEquals(2L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case20() {
        long n = 720L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case21() {
        long n = 2151L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case22() {
        long n = 7854L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case23() {
        long n = 3607L;
        assertEquals(2L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case24() {
        long n = 1881L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case25() {
        long n = 6076L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case26() {
        long n = 9369L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case27() {
        long n = 3853L;
        assertEquals(2L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case28() {
        long n = 8229L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case29() {
        long n = 205L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case30() {
        long n = 980L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case31() {
        long n = 4197L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case32() {
        long n = 1460L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case33() {
        long n = 320020303L;
        assertEquals(2L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case34() {
        long n = 1021932001L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case35() {
        long n = 1804873438L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case36() {
        long n = 625102087L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case37() {
        long n = 298989654L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case38() {
        long n = 713692516L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case39() {
        long n = 2019257625L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case40() {
        long n = 1567124116L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case41() {
        long n = 196044214L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case42() {
        long n = 436143805L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case43() {
        long n = 1906602942L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case44() {
        long n = 1651588877L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case45() {
        long n = 1477002708L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case46() {
        long n = 1117874276L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case47() {
        long n = 378147332L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case48() {
        long n = 557741133L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case49() {
        long n = 668154454L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case50() {
        long n = 570251827L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case51() {
        long n = 1039736738L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case52() {
        long n = 2099585234L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case53() {
        long n = 1981093541L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case54() {
        long n = 1884363755L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case55() {
        long n = 1865560917L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case56() {
        long n = 745615932L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case57() {
        long n = 1214865010L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case58() {
        long n = 1695760303L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case59() {
        long n = 1246390622L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case60() {
        long n = 1692493778L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case61() {
        long n = 1065227310L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case62() {
        long n = 1265265799L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case63() {
        long n = 1084963329L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case64() {
        long n = 1478843645L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case65() {
        long n = 2006456208L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case66() {
        long n = 1722953950L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case67() {
        long n = 496132103L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case68() {
        long n = 6562762L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case69() {
        long n = 957223956L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case70() {
        long n = 654140677L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case71() {
        long n = 1586450237L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case72() {
        long n = 1018720108L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case73() {
        long n = 2026536822L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case74() {
        long n = 764222894L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case75() {
        long n = 1544043251L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case76() {
        long n = 1034964664L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case77() {
        long n = 684533819L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case78() {
        long n = 559623793L;
        assertEquals(2L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case79() {
        long n = 1102523518L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case80() {
        long n = 1103984296L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case81() {
        long n = 1487426600L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case82() {
        long n = 1402158154L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case83() {
        long n = 1000000000000L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case84() {
        long n = 3L;
        assertEquals(3L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case85() {
        long n = 1L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case86() {
        long n = 4L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case87() {
        long n = 5L;
        assertEquals(2L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case88() {
        long n = 6L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case89() {
        long n = 7L;
        assertEquals(2L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case90() {
        long n = 8L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case91() {
        long n = 9L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case92() {
        long n = 10L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case93() {
        long n = 1000000000000L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case94() {
        long n = 999999999997L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case95() {
        long n = 999999999989L;
        assertEquals(2L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case96() {
        long n = 22222223L;
        assertEquals(2L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case97() {
        long n = 524524524524L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case98() {
        long n = 524524524521L;
        assertEquals(2L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case99() {
        long n = 51432121451L;
        assertEquals(2L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case100() {
        long n = 25L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case101() {
        long n = 11L;
        assertEquals(2L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case102() {
        long n = 999999000001L;
        assertEquals(2L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case103() {
        long n = 66L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case104() {
        long n = 16L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case105() {
        long n = 49L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case106() {
        long n = 100000000019L;
        assertEquals(2L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case107() {
        long n = 982451653L;
        assertEquals(2L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case108() {
        long n = 31L;
        assertEquals(2L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case109() {
        long n = 424248523252L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case110() {
        long n = 27L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case111() {
        long n = 999966000289L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case112() {
        long n = 10010602793L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case113() {
        long n = 97969L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case114() {
        long n = 1000000000L;
        assertEquals(1L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case115() {
        long n = 13L;
        assertEquals(2L, magicdiamonds.minimalTransfer(n));
    }

    @Test
    public void case116() {
        long n = 1000000007L;
        assertEquals(2L, magicdiamonds.minimalTransfer(n));
    }

}
