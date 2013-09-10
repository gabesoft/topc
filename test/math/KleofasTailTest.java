package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class KleofasTailTest {
    KleofasTail kleofastail = new KleofasTail();

    @Test
    public void case1() {
        long K = 3L;
        long A = 4L;
        long B = 8L;
        assertEquals(2L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case2() {
        long K = 1L;
        long A = 23457L;
        long B = 123456L;
        assertEquals(100000L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case3() {
        long K = 1234567890123456L;
        long A = 10L;
        long B = 1000000L;
        assertEquals(0L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case4() {
        long K = 0L;
        long A = 0L;
        long B = 2L;
        assertEquals(3L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case5() {
        long K = 7L;
        long A = 123456789012L;
        long B = 123456789034L;
        assertEquals(23L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case6() {
        long K = 4L;
        long A = 2L;
        long B = 10L;
        assertEquals(5L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case7() {
        long K = 1L;
        long A = 0L;
        long B = 12L;
        assertEquals(12L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case8() {
        long K = 0L;
        long A = 0L;
        long B = 1000000000000000000L;
        assertEquals(1000000000000000001L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case9() {
        long K = 1L;
        long A = 0L;
        long B = 1000000000000000000L;
        assertEquals(1000000000000000000L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case10() {
        long K = 2L;
        long A = 0L;
        long B = 1000000000000000000L;
        assertEquals(999999999999999999L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case11() {
        long K = 3L;
        long A = 0L;
        long B = 1000000000000000000L;
        assertEquals(423539247696576512L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case12() {
        long K = 4L;
        long A = 0L;
        long B = 1000000000000000000L;
        assertEquals(576460752303423486L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case13() {
        long K = 47L;
        long A = 0L;
        long B = 1000000000000000000L;
        assertEquals(36028797018963967L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case14() {
        long K = 48L;
        long A = 0L;
        long B = 1000000000000000000L;
        assertEquals(72057594037927934L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case15() {
        long K = 96L;
        long A = 0L;
        long B = 1000000000000000000L;
        assertEquals(36028797018963966L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case16() {
        long K = 32532534L;
        long A = 43534L;
        long B = 43643643643262L;
        assertEquals(4194302L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case17() {
        long K = 435324643263426L;
        long A = 345435L;
        long B = 346436346363263L;
        assertEquals(0L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case18() {
        long K = 3253263263267326L;
        long A = 325325256L;
        long B = 3352353263263263L;
        assertEquals(2L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case19() {
        long K = 8L;
        long A = 8L;
        long B = 8L;
        assertEquals(1L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case20() {
        long K = 8L;
        long A = 9L;
        long B = 9L;
        assertEquals(1L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case21() {
        long K = 8L;
        long A = 4376437643743L;
        long B = 5475475475477L;
        assertEquals(1077428964374L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case22() {
        long K = 5L;
        long A = 81L;
        long B = 28835084869372468L;
        assertEquals(9007199254740975L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case23() {
        long K = 6638512153L;
        long A = 72826464L;
        long B = 823187539409L;
        assertEquals(127L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case24() {
        long K = 7L;
        long A = 73077371391L;
        long B = 7656952776382984L;
        assertEquals(1125882726973440L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case25() {
        long K = 82653L;
        long A = 28766948L;
        long B = 18147573791L;
        assertEquals(261632L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case26() {
        long K = 37701L;
        long A = 658391L;
        long B = 508545755473L;
        assertEquals(16777184L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case27() {
        long K = 5545187L;
        long A = 1511801L;
        long B = 262443850L;
        assertEquals(63L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case28() {
        long K = 981618L;
        long A = 73L;
        long B = 319841134745304143L;
        assertEquals(1099511627774L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case29() {
        long K = 184777099346175L;
        long A = 5L;
        long B = 805L;
        assertEquals(0L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case30() {
        long K = 1144372441L;
        long A = 2575157442058L;
        long B = 533555935488665724L;
        assertEquals(536866816L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case31() {
        long K = 845473L;
        long A = 87358662L;
        long B = 550604675998880L;
        assertEquals(1073741696L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case32() {
        long K = 63108327L;
        long A = 806068143224561L;
        long B = 910750308707474040L;
        assertEquals(17163091968L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case33() {
        long K = 7592812L;
        long A = 156058969L;
        long B = 528890271209816L;
        assertEquals(268435392L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case34() {
        long K = 8706174L;
        long A = 89497133L;
        long B = 7223040061447801L;
        assertEquals(2147483616L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case35() {
        long K = 453229L;
        long A = 912744455L;
        long B = 85371512690174L;
        assertEquals(268433408L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case36() {
        long K = 6360073847422L;
        long A = 232896755L;
        long B = 458353355613L;
        assertEquals(0L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case37() {
        long K = 26L;
        long A = 3L;
        long B = 2226L;
        assertEquals(254L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case38() {
        long K = 9L;
        long A = 4470449L;
        long B = 2427301214L;
        assertEquals(279293279L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case39() {
        long K = 25L;
        long A = 638L;
        long B = 49789995431L;
        assertEquals(2147483616L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case40() {
        long K = 42L;
        long A = 83125009949634858L;
        long B = 84136392866282652L;
        assertEquals(0L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case41() {
        long K = 650L;
        long A = 4395903L;
        long B = 49763674L;
        assertEquals(245760L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case42() {
        long K = 32838314L;
        long A = 645475049L;
        long B = 843599986L;
        assertEquals(0L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case43() {
        long K = 420052020L;
        long A = 79329904L;
        long B = 7181776464719L;
        assertEquals(65534L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case44() {
        long K = 649L;
        long A = 5376633372L;
        long B = 479537200249959803L;
        assertEquals(1125899898454016L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case45() {
        long K = 126L;
        long A = 51262L;
        long B = 31598433624305724L;
        assertEquals(562949953420288L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case46() {
        long K = 2459852788813L;
        long A = 69465373L;
        long B = 62893420707898749L;
        assertEquals(32767L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case47() {
        long K = 14549444143L;
        long A = 643L;
        long B = 2901352713764L;
        assertEquals(255L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case48() {
        long K = 66001729947L;
        long A = 747692189L;
        long B = 88330477933L;
        assertEquals(1L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case49() {
        long K = 8L;
        long A = 2L;
        long B = 51914222174524950L;
        assertEquals(18014398509481982L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case50() {
        long K = 6449339L;
        long A = 482292792L;
        long B = 14557479981L;
        assertEquals(3968L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case51() {
        long K = 4672236029067222L;
        long A = 7293L;
        long B = 146528092457229537L;
        assertEquals(62L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case52() {
        long K = 88L;
        long A = 2L;
        long B = 72641556994459L;
        assertEquals(2199023255550L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case53() {
        long K = 1663L;
        long A = 859085L;
        long B = 9425682L;
        assertEquals(7168L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case54() {
        long K = 4696L;
        long A = 496L;
        long B = 741480593331063921L;
        assertEquals(562949953421310L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case55() {
        long K = 162065809L;
        long A = 23554932L;
        long B = 856943842958L;
        assertEquals(8191L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case56() {
        long K = 154023L;
        long A = 2202945L;
        long B = 714911039L;
        assertEquals(8176L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case57() {
        long K = 86938777568910L;
        long A = 6429795L;
        long B = 675074062685506L;
        assertEquals(14L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case58() {
        long K = 3626434L;
        long A = 5699994L;
        long B = 379668764L;
        assertEquals(252L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case59() {
        long K = 7565L;
        long A = 308705L;
        long B = 19088118364121L;
        assertEquals(4294967232L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case60() {
        long K = 4L;
        long A = 617601301555L;
        long B = 57431178689028L;
        assertEquals(34841648694221L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case61() {
        long K = 39511L;
        long A = 7439766607003L;
        long B = 80569917140590732L;
        assertEquals(2198754820096L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case62() {
        long K = 881L;
        long A = 30043L;
        long B = 829505387314376L;
        assertEquals(1099511627712L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case63() {
        long K = 5769561727236040L;
        long A = 7L;
        long B = 216469881014L;
        assertEquals(0L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case64() {
        long K = 403532L;
        long A = 612069109660598L;
        long B = 699801554194811L;
        assertEquals(0L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case65() {
        long K = 888L;
        long A = 407L;
        long B = 8807399504809482L;
        assertEquals(35184372088830L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case66() {
        long K = 353194L;
        long A = 1525839L;
        long B = 675851986478L;
        assertEquals(4194288L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case67() {
        long K = 199632L;
        long A = 654339L;
        long B = 6757602337129L;
        assertEquals(134217720L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case68() {
        long K = 495L;
        long A = 13946908800L;
        long B = 85058566399875L;
        assertEquals(274844352512L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case69() {
        long K = 412184855405306L;
        long A = 421872877046504L;
        long B = 607941353126123L;
        assertEquals(0L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case70() {
        long K = 8251L;
        long A = 693596L;
        long B = 1629332107L;
        assertEquals(262016L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case71() {
        long K = 208L;
        long A = 232085738L;
        long B = 581424496978461L;
        assertEquals(8796088827904L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case72() {
        long K = 2L;
        long A = 3L;
        long B = 3L;
        assertEquals(1L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case73() {
        long K = 13L;
        long A = 12345L;
        long B = 67890123L;
        assertEquals(8387584L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case74() {
        long K = 7L;
        long A = 30L;
        long B = 1000000000000000000L;
        assertEquals(144115188075855866L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case75() {
        long K = 1L;
        long A = 0L;
        long B = 10L;
        assertEquals(10L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case76() {
        long K = 3534545L;
        long A = 1L;
        long B = 1000000000000000000L;
        assertEquals(549755813887L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case77() {
        long K = 6L;
        long A = 48L;
        long B = 99L;
        assertEquals(20L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case78() {
        long K = 2L;
        long A = 0L;
        long B = 999999999999999L;
        assertEquals(999999999999998L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case79() {
        long K = 2L;
        long A = 1L;
        long B = 100000000000000000L;
        assertEquals(99999999999999999L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case80() {
        long K = 2L;
        long A = 1L;
        long B = 4L;
        assertEquals(3L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case81() {
        long K = 1L;
        long A = 0L;
        long B = 999999999999999992L;
        assertEquals(999999999999999992L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case82() {
        long K = 5L;
        long A = 1L;
        long B = 1000000000000000000L;
        assertEquals(288230376151711743L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case83() {
        long K = 3L;
        long A = 1L;
        long B = 1000000000000000000L;
        assertEquals(423539247696576512L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case84() {
        long K = 1L;
        long A = 0L;
        long B = 7L;
        assertEquals(7L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case85() {
        long K = 1L;
        long A = 0L;
        long B = 123456789101112L;
        assertEquals(123456789101112L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case86() {
        long K = 1L;
        long A = 1L;
        long B = 1000000000000000000L;
        assertEquals(1000000000000000000L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case87() {
        long K = 10000L;
        long A = 1L;
        long B = 1000000000000000000L;
        assertEquals(281474976710654L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case88() {
        long K = 3L;
        long A = 2L;
        long B = 1000000000000000000L;
        assertEquals(423539247696576512L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case89() {
        long K = 2L;
        long A = 1L;
        long B = 1000000000000000L;
        assertEquals(999999999999999L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case90() {
        long K = 1L;
        long A = 0L;
        long B = 2L;
        assertEquals(2L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case91() {
        long K = 2L;
        long A = 1L;
        long B = 10000000000000L;
        assertEquals(9999999999999L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case92() {
        long K = 2L;
        long A = 2L;
        long B = 2L;
        assertEquals(1L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case93() {
        long K = 1L;
        long A = 0L;
        long B = 0L;
        assertEquals(0L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case94() {
        long K = 13L;
        long A = 0L;
        long B = 1000000000000000000L;
        assertEquals(135308871544864768L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case95() {
        long K = 1L;
        long A = 0L;
        long B = 1L;
        assertEquals(1L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case96() {
        long K = 777L;
        long A = 100L;
        long B = 1000000000000000000L;
        assertEquals(2251799813685247L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case97() {
        long K = 0L;
        long A = 1L;
        long B = 1000000000000000000L;
        assertEquals(1000000000000000000L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case98() {
        long K = 1L;
        long A = 1L;
        long B = 10000000000L;
        assertEquals(10000000000L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case99() {
        long K = 13L;
        long A = 1L;
        long B = 1000000000000000000L;
        assertEquals(135308871544864768L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case100() {
        long K = 1352L;
        long A = 123321L;
        long B = 10000000L;
        assertEquals(16128L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case101() {
        long K = 1L;
        long A = 1L;
        long B = 999999999999999900L;
        assertEquals(999999999999999900L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case102() {
        long K = 1L;
        long A = 1L;
        long B = 100000000000000000L;
        assertEquals(100000000000000000L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case103() {
        long K = 24L;
        long A = 1234L;
        long B = 1000000000000L;
        assertEquals(137438953344L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case104() {
        long K = 16L;
        long A = 0L;
        long B = 100L;
        assertEquals(14L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case105() {
        long K = 2L;
        long A = 1000000000000000000L;
        long B = 1000000000000000000L;
        assertEquals(1L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case106() {
        long K = 32L;
        long A = 0L;
        long B = 10000000L;
        assertEquals(1048574L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case107() {
        long K = 5328L;
        long A = 1L;
        long B = 1000000000000000000L;
        assertEquals(562949953421310L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case108() {
        long K = 822981258385599122L;
        long A = 28316248989464292L;
        long B = 836179613355295595L;
        assertEquals(2L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case109() {
        long K = 2L;
        long A = 0L;
        long B = 1L;
        assertEquals(0L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case110() {
        long K = 5L;
        long A = 1000000000000000L;
        long B = 1000000000000000L;
        assertEquals(0L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case111() {
        long K = 12370L;
        long A = 3085281L;
        long B = 12506503L;
        assertEquals(1536L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case112() {
        long K = 1L;
        long A = 0L;
        long B = 100000000000000000L;
        assertEquals(100000000000000000L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case113() {
        long K = 1L;
        long A = 0L;
        long B = 3L;
        assertEquals(3L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case114() {
        long K = 5L;
        long A = 18L;
        long B = 999999999999999999L;
        assertEquals(288230376151711740L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case115() {
        long K = 121L;
        long A = 100000000000000000L;
        long B = 900000000000000000L;
        assertEquals(7881299347898368L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case116() {
        long K = 6L;
        long A = 10L;
        long B = 10L;
        assertEquals(0L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case117() {
        long K = 2L;
        long A = 1L;
        long B = 3L;
        assertEquals(2L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case118() {
        long K = 8L;
        long A = 4L;
        long B = 4L;
        assertEquals(0L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case119() {
        long K = 8L;
        long A = 1000L;
        long B = 2000L;
        assertEquals(256L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case120() {
        long K = 2L;
        long A = 1L;
        long B = 1L;
        assertEquals(0L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case121() {
        long K = 12345L;
        long A = 0L;
        long B = 1000000000000000000L;
        assertEquals(140737488355327L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case122() {
        long K = 2L;
        long A = 0L;
        long B = 5L;
        assertEquals(4L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case123() {
        long K = 2L;
        long A = 1L;
        long B = 99999999999999999L;
        assertEquals(99999999999999998L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case124() {
        long K = 1238L;
        long A = 1L;
        long B = 100000000L;
        assertEquals(262142L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case125() {
        long K = 4L;
        long A = 0L;
        long B = 6L;
        assertEquals(2L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case126() {
        long K = 6L;
        long A = 1L;
        long B = 1000000000000000000L;
        assertEquals(423539247696576511L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case127() {
        long K = 2L;
        long A = 1L;
        long B = 10L;
        assertEquals(9L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case128() {
        long K = 0L;
        long A = 1L;
        long B = 2L;
        assertEquals(2L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case129() {
        long K = 4L;
        long A = 1L;
        long B = 5L;
        assertEquals(2L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case130() {
        long K = 1L;
        long A = 1L;
        long B = 123456789123456789L;
        assertEquals(123456789123456789L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case131() {
        long K = 1099511627776L;
        long A = 1L;
        long B = 1000000000000000000L;
        assertEquals(2097150L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case132() {
        long K = 2L;
        long A = 0L;
        long B = 13L;
        assertEquals(12L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case133() {
        long K = 2L;
        long A = 0L;
        long B = 4L;
        assertEquals(3L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case134() {
        long K = 40L;
        long A = 34637L;
        long B = 193431160843L;
        assertEquals(17179867136L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case135() {
        long K = 3L;
        long A = 1L;
        long B = 10000000000000L;
        assertEquals(4398046511103L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case136() {
        long K = 3L;
        long A = 4L;
        long B = 7L;
        assertEquals(2L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case137() {
        long K = 1024L;
        long A = 1L;
        long B = 1L;
        assertEquals(0L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case138() {
        long K = 120L;
        long A = 1L;
        long B = 1000000000000000000L;
        assertEquals(18014398509481982L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case139() {
        long K = 1000000000000000000L;
        long A = 1000000000000000000L;
        long B = 1000000000000000000L;
        assertEquals(1L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case140() {
        long K = 8L;
        long A = 1L;
        long B = 40L;
        assertEquals(14L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case141() {
        long K = 10L;
        long A = 1L;
        long B = 10L;
        assertEquals(1L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case142() {
        long K = 4L;
        long A = 1L;
        long B = 10L;
        assertEquals(5L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case143() {
        long K = 4L;
        long A = 8L;
        long B = 12L;
        assertEquals(4L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case144() {
        long K = 1L;
        long A = 1L;
        long B = 1L;
        assertEquals(1L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case145() {
        long K = 10L;
        long A = 19L;
        long B = 1353L;
        assertEquals(326L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case146() {
        long K = 6L;
        long A = 0L;
        long B = 1000000000000000000L;
        assertEquals(423539247696576511L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case147() {
        long K = 2L;
        long A = 0L;
        long B = 0L;
        assertEquals(0L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case148() {
        long K = 8L;
        long A = 0L;
        long B = 7L;
        assertEquals(0L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case149() {
        long K = 33L;
        long A = 999999999999999999L;
        long B = 1000000000000000000L;
        assertEquals(0L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case150() {
        long K = 16L;
        long A = 20L;
        long B = 100L;
        assertEquals(12L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case151() {
        long K = 1L;
        long A = 86248L;
        long B = 120591L;
        assertEquals(34344L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case152() {
        long K = 26L;
        long A = 15L;
        long B = 1547546L;
        assertEquals(131070L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case153() {
        long K = 1L;
        long A = 1L;
        long B = 10L;
        assertEquals(10L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case154() {
        long K = 199L;
        long A = 100000000000000000L;
        long B = 1000000000000000000L;
        assertEquals(8444249301319680L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case155() {
        long K = 2L;
        long A = 1L;
        long B = 1000000000000000000L;
        assertEquals(999999999999999999L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case156() {
        long K = 1L;
        long A = 10L;
        long B = 12L;
        assertEquals(3L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case157() {
        long K = 4L;
        long A = 3L;
        long B = 8L;
        assertEquals(3L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case158() {
        long K = 12L;
        long A = 123L;
        long B = 12345678L;
        assertEquals(2097120L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case159() {
        long K = 100L;
        long A = 100L;
        long B = 100L;
        assertEquals(1L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case160() {
        long K = 4L;
        long A = 13L;
        long B = 1000000000000000000L;
        assertEquals(576460752303423480L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case161() {
        long K = 1L;
        long A = 100000000000000000L;
        long B = 1000000000000000000L;
        assertEquals(900000000000000001L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case162() {
        long K = 14L;
        long A = 14L;
        long B = 103L;
        assertEquals(14L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case163() {
        long K = 30136L;
        long A = 17078L;
        long B = 49762L;
        assertEquals(2L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case164() {
        long K = 8L;
        long A = 7L;
        long B = 20L;
        assertEquals(6L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case165() {
        long K = 203L;
        long A = 18L;
        long B = 1182L;
        assertEquals(7L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case166() {
        long K = 2012L;
        long A = 10000000000000000L;
        long B = 1000000000000000000L;
        assertEquals(1108307720798208L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case167() {
        long K = 123456L;
        long A = 678910L;
        long B = 123456789L;
        assertEquals(2032L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case168() {
        long K = 1L;
        long A = 0L;
        long B = 18L;
        assertEquals(18L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case169() {
        long K = 1L;
        long A = 0L;
        long B = 6L;
        assertEquals(6L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case170() {
        long K = 4L;
        long A = 1L;
        long B = 1000000000000000000L;
        assertEquals(576460752303423486L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case171() {
        long K = 40L;
        long A = 0L;
        long B = 45L;
        assertEquals(2L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case172() {
        long K = 100000000000000L;
        long A = 400000000000000L;
        long B = 8300000000000000L;
        assertEquals(248L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case173() {
        long K = 10L;
        long A = 1L;
        long B = 1000000000L;
        assertEquals(268435454L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case174() {
        long K = 10L;
        long A = 0L;
        long B = 10L;
        assertEquals(1L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case175() {
        long K = 0L;
        long A = 4L;
        long B = 4L;
        assertEquals(1L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case176() {
        long K = 0L;
        long A = 0L;
        long B = 4L;
        assertEquals(5L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case177() {
        long K = 3L;
        long A = 23L;
        long B = 23L;
        assertEquals(0L, kleofastail.countGoodSequences(K, A, B));
    }

    @Test
    public void case178() {
        long K = 20L;
        long A = 80L;
        long B = 85L;
        assertEquals(6L, kleofastail.countGoodSequences(K, A, B));
    }

}
