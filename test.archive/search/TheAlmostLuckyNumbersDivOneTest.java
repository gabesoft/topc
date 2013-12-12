package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class TheAlmostLuckyNumbersDivOneTest {
    TheAlmostLuckyNumbersDivOne thealmostluckynumbersdivone = new TheAlmostLuckyNumbersDivOne();

    @Test
    public void case1() {
        long a = 4L;
        long b = 7L;
        assertEquals(4L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case2() {
        long a = 8L;
        long b = 19L;
        assertEquals(4L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case3() {
        long a = 28L;
        long b = 33L;
        assertEquals(0L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case4() {
        long a = 12345678900L;
        long b = 98765432100L;
        assertEquals(91136L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case5() {
        long a = 64L;
        long b = 86L;
        assertEquals(13L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case6() {
        long a = 62L;
        long b = 76L;
        assertEquals(9L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case7() {
        long a = 97L;
        long b = 100L;
        assertEquals(1L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case8() {
        long a = 1L;
        long b = 34L;
        assertEquals(14L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case9() {
        long a = 2L;
        long b = 37L;
        assertEquals(14L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case10() {
        long a = 7L;
        long b = 57L;
        assertEquals(21L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case11() {
        long a = 3L;
        long b = 45L;
        assertEquals(19L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case12() {
        long a = 8L;
        long b = 46L;
        assertEquals(15L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case13() {
        long a = 8L;
        long b = 51L;
        assertEquals(18L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case14() {
        long a = 9L;
        long b = 16L;
        assertEquals(2L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case15() {
        long a = 6L;
        long b = 19L;
        assertEquals(6L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case16() {
        long a = 723696L;
        long b = 846400L;
        assertEquals(648L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case17() {
        long a = 38986L;
        long b = 512000L;
        assertEquals(1376L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case18() {
        long a = 393417L;
        long b = 934199L;
        assertEquals(1440L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case19() {
        long a = 104052L;
        long b = 209742L;
        assertEquals(32L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case20() {
        long a = 727064L;
        long b = 819465L;
        assertEquals(632L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case21() {
        long a = 765462L;
        long b = 973116L;
        assertEquals(360L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case22() {
        long a = 497597L;
        long b = 834500L;
        assertEquals(740L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case23() {
        long a = 222065L;
        long b = 426983L;
        assertEquals(104L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case24() {
        long a = 529199L;
        long b = 810446L;
        assertEquals(736L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case25() {
        long a = 339257L;
        long b = 803318L;
        assertEquals(1440L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case26() {
        long a = 852396L;
        long b = 915259L;
        assertEquals(16L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case27() {
        long a = 721276L;
        long b = 991052L;
        assertEquals(704L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case28() {
        long a = 596914L;
        long b = 799098L;
        assertEquals(704L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case29() {
        long a = 119631L;
        long b = 963105L;
        assertEquals(1552L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case30() {
        long a = 98837L;
        long b = 162888L;
        assertEquals(16L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case31() {
        long a = 914403L;
        long b = 940653L;
        assertEquals(0L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case32() {
        long a = 926889L;
        long b = 992513L;
        assertEquals(32L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case33() {
        long a = 924988L;
        long b = 929723L;
        assertEquals(0L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case34() {
        long a = 951164L;
        long b = 962240L;
        assertEquals(0L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case35() {
        long a = 986059L;
        long b = 998616L;
        assertEquals(0L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case36() {
        long a = 999430L;
        long b = 999498L;
        assertEquals(0L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case37() {
        long a = 918812L;
        long b = 960842L;
        assertEquals(16L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case38() {
        long a = 957387L;
        long b = 985213L;
        assertEquals(16L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case39() {
        long a = 961842L;
        long b = 994691L;
        assertEquals(16L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case40() {
        long a = 918212L;
        long b = 978671L;
        assertEquals(32L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case41() {
        long a = 1L;
        long b = 1000000L;
        assertEquals(2631L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case42() {
        long a = 444444L;
        long b = 777777L;
        assertEquals(1222L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case43() {
        long a = 696L;
        long b = 28765L;
        assertEquals(340L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case44() {
        long a = 986L;
        long b = 647568L;
        assertEquals(1732L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case45() {
        long a = 417L;
        long b = 893802L;
        assertEquals(2541L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case46() {
        long a = 52L;
        long b = 44295L;
        assertEquals(474L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case47() {
        long a = 474747L;
        long b = 747474L;
        assertEquals(520L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case48() {
        long a = 7099619347723696L;
        long b = 8096791250547355L;
        assertEquals(1982464L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case49() {
        long a = 8116120065038986L;
        long b = 8302882381790350L;
        assertEquals(0L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case50() {
        long a = 5693912333393417L;
        long b = 7751099423239359L;
        assertEquals(1548288L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case51() {
        long a = 5678191683104052L;
        long b = 7760208074754348L;
        assertEquals(1556480L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case52() {
        long a = 6954493434727064L;
        long b = 9163564499235981L;
        assertEquals(2031616L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case53() {
        long a = 6046915454765462L;
        long b = 9957734391816112L;
        assertEquals(2097152L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case54() {
        long a = 8618093852497597L;
        long b = 8854467931818360L;
        assertEquals(16384L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case55() {
        long a = 4482389558222065L;
        long b = 7195076591034935L;
        assertEquals(1114112L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case56() {
        long a = 4034525729529199L;
        long b = 6504345205992516L;
        assertEquals(2048000L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case57() {
        long a = 1310604297339257L;
        long b = 9054236214554102L;
        assertEquals(4194304L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case58() {
        long a = 7608741606852396L;
        long b = 8659909043592269L;
        assertEquals(999424L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case59() {
        long a = 3988356993721276L;
        long b = 8950024662032777L;
        assertEquals(4096000L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case60() {
        long a = 5572708823596914L;
        long b = 8667403182616822L;
        assertEquals(2064384L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case61() {
        long a = 347723696L;
        long b = 7884923925641609L;
        assertEquals(7832736L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case62() {
        long a = 65038986L;
        long b = 9657168644199331L;
        assertEquals(7902912L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case63() {
        long a = 333393417L;
        long b = 7573419255247019L;
        assertEquals(6857984L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case64() {
        long a = 683104052L;
        long b = 4768214517788433L;
        assertEquals(5292288L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case65() {
        long a = 434727064L;
        long b = 5036960610367256L;
        assertEquals(5784160L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case66() {
        long a = 1L;
        long b = 9883257925643274L;
        assertEquals(7929863L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case67() {
        long a = 2L;
        long b = 9656914644199584L;
        assertEquals(7913478L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case68() {
        long a = 7L;
        long b = 9572215255248222L;
        assertEquals(7913473L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case69() {
        long a = 3L;
        long b = 9768164517788482L;
        assertEquals(7921669L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case70() {
        long a = 8L;
        long b = 9033728610370487L;
        assertEquals(7897088L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case71() {
        long a = 1L;
        long b = 10000000000000000L;
        assertEquals(7929863L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case72() {
        long a = 444444444444444L;
        long b = 7777777777777777L;
        assertEquals(5963782L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case73() {
        long a = 4774747447442477L;
        long b = 7747447740747444L;
        assertEquals(1733270L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case74() {
        long a = 4774747447448477L;
        long b = 7747447747747444L;
        assertEquals(1736082L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case75() {
        long a = 1L;
        long b = 987654321098765L;
        assertEquals(3702791L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case76() {
        long a = 14031984L;
        long b = 9876543212902184L;
        assertEquals(7923584L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case77() {
        long a = 1L;
        long b = 1444444444444444L;
        assertEquals(3702792L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case78() {
        long a = 1L;
        long b = 5L;
        assertEquals(5L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case79() {
        long a = 1L;
        long b = 700044074791536L;
        assertEquals(2736135L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case80() {
        long a = 10000000000000000L;
        long b = 10000000000000000L;
        assertEquals(0L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case81() {
        long a = 999L;
        long b = 1000000000457L;
        assertEquals(364408L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case82() {
        long a = 3092382930L;
        long b = 8243948905L;
        assertEquals(39424L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case83() {
        long a = 1L;
        long b = 9999999999999999L;
        assertEquals(7929863L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case84() {
        long a = 1L;
        long b = 100000000L;
        assertEquals(14599L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case85() {
        long a = 1L;
        long b = 33L;
        assertEquals(13L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case86() {
        long a = 274249780L;
        long b = 3111800046048L;
        assertEquals(357760L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case87() {
        long a = 444444444444444L;
        long b = 474747747444747L;
        assertEquals(577520L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case88() {
        long a = 1L;
        long b = 1000L;
        assertEquals(143L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case89() {
        long a = 1L;
        long b = 1L;
        assertEquals(1L, thealmostluckynumbersdivone.find(a, b));
    }

    @Test
    public void case90() {
        long a = 1L;
        long b = 6757473L;
        assertEquals(4535L, thealmostluckynumbersdivone.find(a, b));
    }

}
