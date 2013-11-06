package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class TheNumbersWithLuckyLastDigitTest {
    TheNumbersWithLuckyLastDigit thenumberswithluckylastdigit = new TheNumbersWithLuckyLastDigit();

    @Test
    public void case1() {
        int n = 99;
        assertEquals(4, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case2() {
        int n = 11;
        assertEquals(2, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case3() {
        int n = 13;
        assertEquals(-1, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case4() {
        int n = 1234567;
        assertEquals(1, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case5() {
        int n = 1;
        assertEquals(-1, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case6() {
        int n = 2;
        assertEquals(-1, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case7() {
        int n = 3;
        assertEquals(-1, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case8() {
        int n = 4;
        assertEquals(1, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case9() {
        int n = 5;
        assertEquals(-1, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case10() {
        int n = 6;
        assertEquals(-1, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case11() {
        int n = 7;
        assertEquals(1, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case12() {
        int n = 8;
        assertEquals(2, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case13() {
        int n = 9;
        assertEquals(-1, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case14() {
        int n = 10;
        assertEquals(-1, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case15() {
        int n = 11;
        assertEquals(2, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case16() {
        int n = 12;
        assertEquals(3, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case17() {
        int n = 13;
        assertEquals(-1, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case18() {
        int n = 14;
        assertEquals(1, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case19() {
        int n = 15;
        assertEquals(3, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case20() {
        int n = 16;
        assertEquals(4, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case21() {
        int n = 17;
        assertEquals(1, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case22() {
        int n = 18;
        assertEquals(2, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case23() {
        int n = 19;
        assertEquals(4, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case24() {
        int n = 20;
        assertEquals(5, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case25() {
        int n = 21;
        assertEquals(2, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case26() {
        int n = 22;
        assertEquals(3, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case27() {
        int n = 23;
        assertEquals(5, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case28() {
        int n = 24;
        assertEquals(1, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case29() {
        int n = 25;
        assertEquals(3, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case30() {
        int n = 26;
        assertEquals(4, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case31() {
        int n = 27;
        assertEquals(1, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case32() {
        int n = 28;
        assertEquals(2, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case33() {
        int n = 29;
        assertEquals(4, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case34() {
        int n = 30;
        assertEquals(5, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case35() {
        int n = 757148;
        assertEquals(2, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case36() {
        int n = 167851001;
        assertEquals(2, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case37() {
        int n = 301413357;
        assertEquals(1, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case38() {
        int n = 336971125;
        assertEquals(3, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case39() {
        int n = 659598369;
        assertEquals(4, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case40() {
        int n = 160567226;
        assertEquals(4, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case41() {
        int n = 391749388;
        assertEquals(2, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case42() {
        int n = 4890852;
        assertEquals(3, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case43() {
        int n = 35766291;
        assertEquals(2, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case44() {
        int n = 26239573;
        assertEquals(5, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case45() {
        int n = 473038165;
        assertEquals(3, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case46() {
        int n = 1000000000;
        assertEquals(5, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case47() {
        int n = 999999999;
        assertEquals(4, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case48() {
        int n = 42;
        assertEquals(3, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case49() {
        int n = 100000000;
        assertEquals(5, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case50() {
        int n = 909090900;
        assertEquals(5, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case51() {
        int n = 100;
        assertEquals(5, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case52() {
        int n = 50;
        assertEquals(5, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case53() {
        int n = 10000;
        assertEquals(5, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case54() {
        int n = 900;
        assertEquals(5, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case55() {
        int n = 336;
        assertEquals(4, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case56() {
        int n = 45;
        assertEquals(3, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case57() {
        int n = 1000000;
        assertEquals(5, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case58() {
        int n = 33;
        assertEquals(5, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case59() {
        int n = 281;
        assertEquals(2, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case60() {
        int n = 10000000;
        assertEquals(5, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case61() {
        int n = 1555555;
        assertEquals(3, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case62() {
        int n = 88;
        assertEquals(2, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case63() {
        int n = 46;
        assertEquals(4, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case64() {
        int n = 1001;
        assertEquals(2, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case65() {
        int n = 20000;
        assertEquals(5, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case66() {
        int n = 60;
        assertEquals(5, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case67() {
        int n = 103;
        assertEquals(5, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case68() {
        int n = 53;
        assertEquals(5, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case69() {
        int n = 784783209;
        assertEquals(4, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case70() {
        int n = 1000;
        assertEquals(5, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case71() {
        int n = 2800;
        assertEquals(5, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case72() {
        int n = 36;
        assertEquals(4, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case73() {
        int n = 155555555;
        assertEquals(3, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case74() {
        int n = 200;
        assertEquals(5, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case75() {
        int n = 35;
        assertEquals(3, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case76() {
        int n = 70;
        assertEquals(5, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case77() {
        int n = 110;
        assertEquals(5, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case78() {
        int n = 222;
        assertEquals(3, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case79() {
        int n = 87;
        assertEquals(1, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case80() {
        int n = 999999992;
        assertEquals(3, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case81() {
        int n = 999999998;
        assertEquals(2, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case82() {
        int n = 55;
        assertEquals(3, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case83() {
        int n = 300000;
        assertEquals(5, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case84() {
        int n = 9921;
        assertEquals(2, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case85() {
        int n = 2000;
        assertEquals(5, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case86() {
        int n = 38;
        assertEquals(2, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case87() {
        int n = 220;
        assertEquals(5, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case88() {
        int n = 952250;
        assertEquals(5, thenumberswithluckylastdigit.find(n));
    }

    @Test
    public void case89() {
        int n = 688606352;
        assertEquals(3, thenumberswithluckylastdigit.find(n));
    }

}
