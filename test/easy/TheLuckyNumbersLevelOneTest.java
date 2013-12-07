package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class TheLuckyNumbersLevelOneTest {
    TheLuckyNumbersLevelOne theluckynumberslevelone = new TheLuckyNumbersLevelOne();

    @Test
    public void case1() {
        long a = 1L;
        long b = 100L;
        assertEquals(4L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case2() {
        long a = 45L;
        long b = 54L;
        assertEquals(0L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case3() {
        long a = 477444774L;
        long b = 477444774L;
        assertEquals(1L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case4() {
        long a = 456789123L;
        long b = 789123456L;
        assertEquals(24L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case5() {
        long a = 70L;
        long b = 100L;
        assertEquals(1L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case6() {
        long a = 71L;
        long b = 76L;
        assertEquals(0L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case7() {
        long a = 15L;
        long b = 77L;
        assertEquals(2L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case8() {
        long a = 314415L;
        long b = 748518739L;
        assertEquals(64L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case9() {
        long a = 839685L;
        long b = 294794236L;
        assertEquals(32L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case10() {
        long a = 720206L;
        long b = 863378607L;
        assertEquals(68L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case11() {
        long a = 987391L;
        long b = 91823502L;
        assertEquals(32L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case12() {
        long a = 374770L;
        long b = 454911421L;
        assertEquals(48L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case13() {
        long a = 925976L;
        long b = 253992901L;
        assertEquals(32L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case14() {
        long a = 31515L;
        long b = 815601503L;
        assertEquals(80L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case15() {
        long a = 993966L;
        long b = 789622502L;
        assertEquals(64L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case16() {
        long a = 461339L;
        long b = 14618776L;
        assertEquals(22L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case17() {
        long a = 533801L;
        long b = 299889533L;
        assertEquals(36L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case18() {
        long a = 486946L;
        long b = 461720850L;
        assertEquals(44L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case19() {
        long a = 358787L;
        long b = 201840879L;
        assertEquals(40L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case20() {
        long a = 980234L;
        long b = 2395868L;
        assertEquals(0L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case21() {
        long a = 91972593928314415L;
        long b = 429437714725840869L;
        assertEquals(0L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case22() {
        long a = 554102594705839685L;
        long b = 871864155292650254L;
        assertEquals(256L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case23() {
        long a = 17438115591720206L;
        long b = 79807977131137660L;
        assertEquals(512L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case24() {
        long a = 725080559573987391L;
        long b = 948391076642202521L;
        assertEquals(256L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case25() {
        long a = 535282044706616000L;
        long b = 968493245237374770L;
        assertEquals(256L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case26() {
        long a = 220418497480925976L;
        long b = 385179090453708371L;
        assertEquals(0L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case27() {
        long a = 952794849364031515L;
        long b = 978499011279142477L;
        assertEquals(0L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case28() {
        long a = 585767164920993966L;
        long b = 644797924620882056L;
        assertEquals(0L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case29() {
        long a = 798057841747051409L;
        long b = 851841734813461339L;
        assertEquals(0L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case30() {
        long a = 749070736374533801L;
        long b = 811873140226833474L;
        assertEquals(128L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case31() {
        long a = 91972593928314415L;
        long b = 929437714725840724L;
        assertEquals(512L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case32() {
        long a = 54102594705839685L;
        long b = 971864155292650155L;
        assertEquals(768L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case33() {
        long a = 17438115591720206L;
        long b = 979807977131137619L;
        assertEquals(1024L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case34() {
        long a = 25080559573987391L;
        long b = 948391076642202451L;
        assertEquals(1024L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case35() {
        long a = 68493245237374770L;
        long b = 935282044706615984L;
        assertEquals(768L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case36() {
        long a = 20418497480925976L;
        long b = 985179090453708307L;
        assertEquals(1024L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case37() {
        long a = 52794849364031515L;
        long b = 978499011279142317L;
        assertEquals(768L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case38() {
        long a = 85767164920993966L;
        long b = 944797924620881899L;
        assertEquals(512L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case39() {
        long a = 51841734813461339L;
        long b = 998057841747051331L;
        assertEquals(768L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case40() {
        long a = 49070736374533801L;
        long b = 911873140226833355L;
        assertEquals(768L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case41() {
        long a = 1L;
        long b = 1000000000000000000L;
        assertEquals(2044L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case42() {
        long a = 4L;
        long b = 777777777777777777L;
        assertEquals(2044L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case43() {
        long a = 7L;
        long b = 444444444444444444L;
        assertEquals(1532L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case44() {
        long a = 5L;
        long b = 536417038372758858L;
        assertEquals(1787L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case45() {
        long a = 8L;
        long b = 665213705816950778L;
        assertEquals(1786L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case46() {
        long a = 5L;
        long b = 461882560036164617L;
        assertEquals(1659L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case47() {
        long a = 5L;
        long b = 502858337351765142L;
        assertEquals(1787L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case48() {
        long a = 4774747444747774L;
        long b = 9284387456984365L;
        assertEquals(150L, theluckynumberslevelone.find(a, b));
    }

    @Test
    public void case49() {
        long a = 11L;
        long b = 999999999999999999L;
        assertEquals(2042L, theluckynumberslevelone.find(a, b));
    }

}
