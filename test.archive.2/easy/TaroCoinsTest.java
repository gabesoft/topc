package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class TaroCoinsTest {
    TaroCoins tarocoins = new TaroCoins();

    @Test
    public void case1() {
        long N = 1L;
        assertEquals(1L, tarocoins.getNumber(N));
    }

    @Test
    public void case2() {
        long N = 6L;
        assertEquals(3L, tarocoins.getNumber(N));
    }

    @Test
    public void case3() {
        long N = 47L;
        assertEquals(2L, tarocoins.getNumber(N));
    }

    @Test
    public void case4() {
        long N = 256L;
        assertEquals(9L, tarocoins.getNumber(N));
    }

    @Test
    public void case5() {
        long N = 8489289L;
        assertEquals(6853L, tarocoins.getNumber(N));
    }

    @Test
    public void case6() {
        long N = 1000000000L;
        assertEquals(73411L, tarocoins.getNumber(N));
    }

    @Test
    public void case7() {
        long N = 100L;
        assertEquals(19L, tarocoins.getNumber(N));
    }

    @Test
    public void case8() {
        long N = 128L;
        assertEquals(8L, tarocoins.getNumber(N));
    }

    @Test
    public void case9() {
        long N = 1073741824L;
        assertEquals(31L, tarocoins.getNumber(N));
    }

    @Test
    public void case10() {
        long N = 6370L;
        assertEquals(175L, tarocoins.getNumber(N));
    }

    @Test
    public void case11() {
        long N = 10L;
        assertEquals(5L, tarocoins.getNumber(N));
    }

    @Test
    public void case12() {
        long N = 2L;
        assertEquals(2L, tarocoins.getNumber(N));
    }

    @Test
    public void case13() {
        long N = 3L;
        assertEquals(1L, tarocoins.getNumber(N));
    }

    @Test
    public void case14() {
        long N = 4L;
        assertEquals(3L, tarocoins.getNumber(N));
    }

    @Test
    public void case15() {
        long N = 2000000000L;
        assertEquals(81034L, tarocoins.getNumber(N));
    }

    @Test
    public void case16() {
        long N = 999999999L;
        assertEquals(7623L, tarocoins.getNumber(N));
    }

    @Test
    public void case17() {
        long N = 1000000000000000000L;
        assertEquals(554817437L, tarocoins.getNumber(N));
    }

    @Test
    public void case18() {
        long N = 576460752303423488L;
        assertEquals(60L, tarocoins.getNumber(N));
    }

    @Test
    public void case19() {
        long N = 640L;
        assertEquals(23L, tarocoins.getNumber(N));
    }

    @Test
    public void case20() {
        long N = 785L;
        assertEquals(34L, tarocoins.getNumber(N));
    }

    @Test
    public void case21() {
        long N = 1022L;
        assertEquals(10L, tarocoins.getNumber(N));
    }

    @Test
    public void case22() {
        long N = 962L;
        assertEquals(38L, tarocoins.getNumber(N));
    }

    @Test
    public void case23() {
        long N = 640L;
        assertEquals(23L, tarocoins.getNumber(N));
    }

    @Test
    public void case24() {
        long N = 1099510542205L;
        assertEquals(17863L, tarocoins.getNumber(N));
    }

    @Test
    public void case25() {
        long N = 944875173846L;
        assertEquals(1243789L, tarocoins.getNumber(N));
    }

    @Test
    public void case26() {
        long N = 672031828383L;
        assertEquals(500073L, tarocoins.getNumber(N));
    }

    @Test
    public void case27() {
        long N = 893915235088L;
        assertEquals(243779L, tarocoins.getNumber(N));
    }

    @Test
    public void case28() {
        long N = 1088385987371L;
        assertEquals(4634234L, tarocoins.getNumber(N));
    }

    @Test
    public void case29() {
        long N = 347905064087584832L;
        assertEquals(5150282L, tarocoins.getNumber(N));
    }

    @Test
    public void case30() {
        long N = 309341003709448449L;
        assertEquals(19102955L, tarocoins.getNumber(N));
    }

    @Test
    public void case31() {
        long N = 361431780114432130L;
        assertEquals(94727263L, tarocoins.getNumber(N));
    }

    @Test
    public void case32() {
        long N = 378311177695920400L;
        assertEquals(20702253L, tarocoins.getNumber(N));
    }

    @Test
    public void case33() {
        long N = 290553370434404484L;
        assertEquals(146293655L, tarocoins.getNumber(N));
    }

    @Test
    public void case34() {
        long N = 423901414250789313L;
        assertEquals(292614203L, tarocoins.getNumber(N));
    }

    @Test
    public void case35() {
        long N = 438190581230404958L;
        assertEquals(6012372582L, tarocoins.getNumber(N));
    }

    @Test
    public void case36() {
        long N = 293666568548731467L;
        assertEquals(3648043185L, tarocoins.getNumber(N));
    }

    @Test
    public void case37() {
        long N = 392393882169705920L;
        assertEquals(3341296806L, tarocoins.getNumber(N));
    }

    @Test
    public void case38() {
        long N = 376370659955075108L;
        assertEquals(3279511256L, tarocoins.getNumber(N));
    }

    @Test
    public void case39() {
        long N = 412658913555584867L;
        assertEquals(3498747798L, tarocoins.getNumber(N));
    }

    @Test
    public void case40() {
        long N = 410054521552536292L;
        assertEquals(26030230909L, tarocoins.getNumber(N));
    }

    @Test
    public void case41() {
        long N = 416860608518791589L;
        assertEquals(8015276820L, tarocoins.getNumber(N));
    }

    @Test
    public void case42() {
        long N = 393014244375683364L;
        assertEquals(16905456859L, tarocoins.getNumber(N));
    }

    @Test
    public void case43() {
        long N = 518010418436963490L;
        assertEquals(15340957057L, tarocoins.getNumber(N));
    }

    @Test
    public void case44() {
        long N = 576460730781662959L;
        assertEquals(794365L, tarocoins.getNumber(N));
    }

    @Test
    public void case45() {
        long N = 565764701561028461L;
        assertEquals(2186952L, tarocoins.getNumber(N));
    }

    @Test
    public void case46() {
        long N = 571954850028252927L;
        assertEquals(7287457L, tarocoins.getNumber(N));
    }

    @Test
    public void case47() {
        long N = 558161296277634687L;
        assertEquals(1416255L, tarocoins.getNumber(N));
    }

    @Test
    public void case48() {
        long N = 504314853196816127L;
        assertEquals(6183662L, tarocoins.getNumber(N));
    }

    @Test
    public void case49() {
        long N = 768614336404564650L;
        assertEquals(2504730781961L, tarocoins.getNumber(N));
    }

    @Test
    public void case50() {
        long N = 384307168202282325L;
        assertEquals(956722026041L, tarocoins.getNumber(N));
    }

    @Test
    public void case51() {
        long N = 384307168202282324L;
        assertEquals(1548008755920L, tarocoins.getNumber(N));
    }

    @Test
    public void case52() {
        long N = 192153584101141162L;
        assertEquals(956722026041L, tarocoins.getNumber(N));
    }

    @Test
    public void case53() {
        long N = 196657183728511722L;
        assertEquals(502131822759L, tarocoins.getNumber(N));
    }

    @Test
    public void case54() {
        long N = 193349852752161450L;
        assertEquals(484936992181L, tarocoins.getNumber(N));
    }

    @Test
    public void case55() {
        long N = 196731950519200426L;
        assertEquals(350312970581L, tarocoins.getNumber(N));
    }

    @Test
    public void case56() {
        long N = 192153584101141166L;
        assertEquals(644603021052L, tarocoins.getNumber(N));
    }

    @Test
    public void case57() {
        long N = 10000000000000000L;
        assertEquals(17165857L, tarocoins.getNumber(N));
    }

    @Test
    public void case58() {
        long N = 200L;
        assertEquals(26L, tarocoins.getNumber(N));
    }

    @Test
    public void case59() {
        long N = 93459834598323452L;
        assertEquals(317400926L, tarocoins.getNumber(N));
    }

    @Test
    public void case60() {
        long N = 1717161617181871L;
        assertEquals(69493195L, tarocoins.getNumber(N));
    }

    @Test
    public void case61() {
        long N = 123456789L;
        assertEquals(51639L, tarocoins.getNumber(N));
    }

    @Test
    public void case62() {
        long N = 999999999999999999L;
        assertEquals(29665503L, tarocoins.getNumber(N));
    }

    @Test
    public void case63() {
        long N = 263810380166378775L;
        assertEquals(4693345949L, tarocoins.getNumber(N));
    }

}
