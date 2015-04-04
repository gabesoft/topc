package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class CartInSupermarketEasyTest {
    CartInSupermarketEasy cartinsupermarketeasy = new CartInSupermarketEasy();

    @Test
    public void case1() {
        int N = 5;
        int K = 0;
        assertEquals(5, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case2() {
        int N = 5;
        int K = 2;
        assertEquals(4, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case3() {
        int N = 15;
        int K = 4;
        assertEquals(6, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case4() {
        int N = 7;
        int K = 100;
        assertEquals(4, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case5() {
        int N = 45;
        int K = 5;
        assertEquals(11, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case6() {
        int N = 100;
        int K = 100;
        assertEquals(8, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case7() {
        int N = 1;
        int K = 0;
        assertEquals(1, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case8() {
        int N = 2;
        int K = 0;
        assertEquals(2, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case9() {
        int N = 2;
        int K = 1;
        assertEquals(2, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case10() {
        int N = 3;
        int K = 0;
        assertEquals(3, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case11() {
        int N = 3;
        int K = 1;
        assertEquals(3, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case12() {
        int N = 4;
        int K = 0;
        assertEquals(4, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case13() {
        int N = 4;
        int K = 1;
        assertEquals(3, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case14() {
        int N = 4;
        int K = 2;
        assertEquals(3, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case15() {
        int N = 4;
        int K = 3;
        assertEquals(3, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case16() {
        int N = 100;
        int K = 0;
        assertEquals(100, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case17() {
        int N = 100;
        int K = 1;
        assertEquals(51, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case18() {
        int N = 100;
        int K = 2;
        assertEquals(35, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case19() {
        int N = 100;
        int K = 3;
        assertEquals(27, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case20() {
        int N = 100;
        int K = 4;
        assertEquals(23, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case21() {
        int N = 99;
        int K = 0;
        assertEquals(99, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case22() {
        int N = 99;
        int K = 1;
        assertEquals(51, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case23() {
        int N = 99;
        int K = 2;
        assertEquals(35, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case24() {
        int N = 99;
        int K = 3;
        assertEquals(27, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case25() {
        int N = 99;
        int K = 4;
        assertEquals(23, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case26() {
        int N = 83;
        int K = 81;
        assertEquals(8, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case27() {
        int N = 36;
        int K = 38;
        assertEquals(7, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case28() {
        int N = 22;
        int K = 63;
        assertEquals(6, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case29() {
        int N = 85;
        int K = 7;
        assertEquals(14, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case30() {
        int N = 11;
        int K = 41;
        assertEquals(5, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case31() {
        int N = 28;
        int K = 67;
        assertEquals(6, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case32() {
        int N = 56;
        int K = 3;
        assertEquals(16, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case33() {
        int N = 83;
        int K = 20;
        assertEquals(9, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case34() {
        int N = 19;
        int K = 66;
        assertEquals(6, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case35() {
        int N = 57;
        int K = 34;
        assertEquals(7, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case36() {
        int N = 14;
        int K = 72;
        assertEquals(5, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case37() {
        int N = 20;
        int K = 25;
        assertEquals(6, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case38() {
        int N = 73;
        int K = 89;
        assertEquals(8, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case39() {
        int N = 42;
        int K = 2;
        assertEquals(16, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case40() {
        int N = 34;
        int K = 26;
        assertEquals(7, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case41() {
        int N = 50;
        int K = 58;
        assertEquals(7, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case42() {
        int N = 29;
        int K = 6;
        assertEquals(7, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case43() {
        int N = 59;
        int K = 87;
        assertEquals(7, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case44() {
        int N = 23;
        int K = 31;
        assertEquals(6, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case45() {
        int N = 27;
        int K = 28;
        assertEquals(6, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case46() {
        int N = 55;
        int K = 41;
        assertEquals(7, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case47() {
        int N = 64;
        int K = 40;
        assertEquals(7, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case48() {
        int N = 21;
        int K = 26;
        assertEquals(6, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case49() {
        int N = 64;
        int K = 19;
        assertEquals(8, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case50() {
        int N = 94;
        int K = 93;
        assertEquals(8, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case51() {
        int N = 60;
        int K = 54;
        assertEquals(7, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case52() {
        int N = 99;
        int K = 67;
        assertEquals(8, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case53() {
        int N = 80;
        int K = 21;
        assertEquals(9, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case54() {
        int N = 45;
        int K = 100;
        assertEquals(7, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case55() {
        int N = 12;
        int K = 5;
        assertEquals(5, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case56() {
        int N = 99;
        int K = 91;
        assertEquals(8, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case57() {
        int N = 96;
        int K = 31;
        assertEquals(8, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case58() {
        int N = 22;
        int K = 69;
        assertEquals(6, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case59() {
        int N = 50;
        int K = 22;
        assertEquals(7, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case60() {
        int N = 11;
        int K = 66;
        assertEquals(5, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case61() {
        int N = 86;
        int K = 13;
        assertEquals(10, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case62() {
        int N = 55;
        int K = 0;
        assertEquals(55, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case63() {
        int N = 35;
        int K = 81;
        assertEquals(7, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case64() {
        int N = 33;
        int K = 70;
        assertEquals(7, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case65() {
        int N = 53;
        int K = 83;
        assertEquals(7, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case66() {
        int N = 14;
        int K = 18;
        assertEquals(5, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case67() {
        int N = 52;
        int K = 60;
        assertEquals(7, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case68() {
        int N = 2;
        int K = 19;
        assertEquals(2, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case69() {
        int N = 79;
        int K = 47;
        assertEquals(8, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case70() {
        int N = 21;
        int K = 97;
        assertEquals(6, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case71() {
        int N = 11;
        int K = 39;
        assertEquals(5, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case72() {
        int N = 84;
        int K = 77;
        assertEquals(8, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case73() {
        int N = 76;
        int K = 82;
        assertEquals(8, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case74() {
        int N = 80;
        int K = 91;
        assertEquals(8, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case75() {
        int N = 34;
        int K = 34;
        assertEquals(7, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case76() {
        int N = 100;
        int K = 7;
        assertEquals(16, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case77() {
        int N = 12;
        int K = 0;
        assertEquals(12, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case78() {
        int N = 31;
        int K = 4;
        assertEquals(9, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case79() {
        int N = 76;
        int K = 1;
        assertEquals(39, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case80() {
        int N = 62;
        int K = 9;
        assertEquals(10, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case81() {
        int N = 66;
        int K = 6;
        assertEquals(13, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case82() {
        int N = 86;
        int K = 0;
        assertEquals(86, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case83() {
        int N = 28;
        int K = 1;
        assertEquals(15, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case84() {
        int N = 44;
        int K = 9;
        assertEquals(8, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case85() {
        int N = 67;
        int K = 4;
        assertEquals(16, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case86() {
        int N = 45;
        int K = 9;
        assertEquals(8, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case87() {
        int N = 9;
        int K = 6;
        assertEquals(5, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case88() {
        int N = 71;
        int K = 3;
        assertEquals(20, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case89() {
        int N = 22;
        int K = 2;
        assertEquals(9, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case90() {
        int N = 72;
        int K = 3;
        assertEquals(20, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case91() {
        int N = 44;
        int K = 6;
        assertEquals(10, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case92() {
        int N = 19;
        int K = 3;
        assertEquals(7, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case93() {
        int N = 32;
        int K = 0;
        assertEquals(32, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case94() {
        int N = 94;
        int K = 0;
        assertEquals(94, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case95() {
        int N = 57;
        int K = 4;
        assertEquals(14, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case96() {
        int N = 43;
        int K = 0;
        assertEquals(43, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case97() {
        int N = 10;
        int K = 6;
        assertEquals(5, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case98() {
        int N = 90;
        int K = 2;
        assertEquals(32, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case99() {
        int N = 27;
        int K = 9;
        assertEquals(7, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case100() {
        int N = 56;
        int K = 5;
        assertEquals(12, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case101() {
        int N = 58;
        int K = 6;
        assertEquals(12, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case102() {
        int N = 84;
        int K = 1;
        assertEquals(43, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case103() {
        int N = 38;
        int K = 5;
        assertEquals(9, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case104() {
        int N = 5;
        int K = 8;
        assertEquals(4, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case105() {
        int N = 35;
        int K = 3;
        assertEquals(11, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case106() {
        int N = 77;
        int K = 4;
        assertEquals(18, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case107() {
        int N = 61;
        int K = 6;
        assertEquals(12, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case108() {
        int N = 83;
        int K = 0;
        assertEquals(83, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case109() {
        int N = 82;
        int K = 0;
        assertEquals(82, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case110() {
        int N = 2;
        int K = 4;
        assertEquals(2, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case111() {
        int N = 49;
        int K = 6;
        assertEquals(10, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case112() {
        int N = 32;
        int K = 8;
        assertEquals(7, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case113() {
        int N = 23;
        int K = 6;
        assertEquals(7, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case114() {
        int N = 7;
        int K = 9;
        assertEquals(4, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case115() {
        int N = 14;
        int K = 9;
        assertEquals(5, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case116() {
        int N = 72;
        int K = 8;
        assertEquals(12, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case117() {
        int N = 45;
        int K = 4;
        assertEquals(12, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case118() {
        int N = 71;
        int K = 8;
        assertEquals(12, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case119() {
        int N = 32;
        int K = 7;
        assertEquals(7, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case120() {
        int N = 36;
        int K = 4;
        assertEquals(10, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case121() {
        int N = 31;
        int K = 3;
        assertEquals(10, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case122() {
        int N = 38;
        int K = 2;
        assertEquals(15, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case123() {
        int N = 83;
        int K = 7;
        assertEquals(14, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case124() {
        int N = 77;
        int K = 8;
        assertEquals(12, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case125() {
        int N = 97;
        int K = 8;
        assertEquals(14, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case126() {
        int N = 3;
        int K = 5;
        assertEquals(3, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case127() {
        int N = 97;
        int K = 13;
        assertEquals(11, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case128() {
        int N = 46;
        int K = 6;
        assertEquals(10, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case129() {
        int N = 100;
        int K = 10;
        assertEquals(13, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case130() {
        int N = 3;
        int K = 3;
        assertEquals(3, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case131() {
        int N = 45;
        int K = 3;
        assertEquals(14, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case132() {
        int N = 1;
        int K = 100;
        assertEquals(1, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case133() {
        int N = 78;
        int K = 12;
        assertEquals(10, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case134() {
        int N = 100;
        int K = 24;
        assertEquals(9, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case135() {
        int N = 100;
        int K = 15;
        assertEquals(11, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case136() {
        int N = 2;
        int K = 2;
        assertEquals(2, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case137() {
        int N = 100;
        int K = 5;
        assertEquals(20, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case138() {
        int N = 87;
        int K = 53;
        assertEquals(8, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case139() {
        int N = 6;
        int K = 1;
        assertEquals(4, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case140() {
        int N = 64;
        int K = 8;
        assertEquals(11, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case141() {
        int N = 9;
        int K = 2;
        assertEquals(5, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case142() {
        int N = 15;
        int K = 2;
        assertEquals(7, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case143() {
        int N = 16;
        int K = 3;
        assertEquals(6, cartinsupermarketeasy.calc(N, K));
    }

    @Test
    public void case144() {
        int N = 10;
        int K = 2;
        assertEquals(5, cartinsupermarketeasy.calc(N, K));
    }

}
