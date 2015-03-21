package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class KitayutaMart2Test {
    KitayutaMart2 kitayutamart2 = new KitayutaMart2();

    @Test
    public void case1() {
        int K = 100;
        int T = 100;
        assertEquals(1, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case2() {
        int K = 100;
        int T = 300;
        assertEquals(2, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case3() {
        int K = 150;
        int T = 1050;
        assertEquals(3, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case4() {
        int K = 160;
        int T = 163680;
        assertEquals(10, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case5() {
        int K = 80;
        int T = 80;
        assertEquals(1, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case6() {
        int K = 125;
        int T = 125;
        assertEquals(1, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case7() {
        int K = 129;
        int T = 129;
        assertEquals(1, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case8() {
        int K = 139;
        int T = 139;
        assertEquals(1, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case9() {
        int K = 157;
        int T = 157;
        assertEquals(1, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case10() {
        int K = 83;
        int T = 249;
        assertEquals(2, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case11() {
        int K = 86;
        int T = 258;
        assertEquals(2, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case12() {
        int K = 106;
        int T = 318;
        assertEquals(2, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case13() {
        int K = 112;
        int T = 336;
        assertEquals(2, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case14() {
        int K = 114;
        int T = 342;
        assertEquals(2, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case15() {
        int K = 85;
        int T = 595;
        assertEquals(3, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case16() {
        int K = 108;
        int T = 756;
        assertEquals(3, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case17() {
        int K = 138;
        int T = 966;
        assertEquals(3, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case18() {
        int K = 155;
        int T = 1085;
        assertEquals(3, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case19() {
        int K = 158;
        int T = 1106;
        assertEquals(3, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case20() {
        int K = 83;
        int T = 1245;
        assertEquals(4, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case21() {
        int K = 87;
        int T = 1305;
        assertEquals(4, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case22() {
        int K = 98;
        int T = 1470;
        assertEquals(4, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case23() {
        int K = 110;
        int T = 1650;
        assertEquals(4, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case24() {
        int K = 157;
        int T = 2355;
        assertEquals(4, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case25() {
        int K = 116;
        int T = 3596;
        assertEquals(5, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case26() {
        int K = 119;
        int T = 3689;
        assertEquals(5, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case27() {
        int K = 138;
        int T = 4278;
        assertEquals(5, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case28() {
        int K = 154;
        int T = 4774;
        assertEquals(5, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case29() {
        int K = 158;
        int T = 4898;
        assertEquals(5, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case30() {
        int K = 94;
        int T = 5922;
        assertEquals(6, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case31() {
        int K = 141;
        int T = 8883;
        assertEquals(6, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case32() {
        int K = 143;
        int T = 9009;
        assertEquals(6, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case33() {
        int K = 145;
        int T = 9135;
        assertEquals(6, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case34() {
        int K = 151;
        int T = 9513;
        assertEquals(6, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case35() {
        int K = 81;
        int T = 10287;
        assertEquals(7, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case36() {
        int K = 82;
        int T = 10414;
        assertEquals(7, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case37() {
        int K = 92;
        int T = 11684;
        assertEquals(7, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case38() {
        int K = 130;
        int T = 16510;
        assertEquals(7, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case39() {
        int K = 160;
        int T = 20320;
        assertEquals(7, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case40() {
        int K = 106;
        int T = 27030;
        assertEquals(8, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case41() {
        int K = 119;
        int T = 30345;
        assertEquals(8, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case42() {
        int K = 127;
        int T = 32385;
        assertEquals(8, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case43() {
        int K = 157;
        int T = 40035;
        assertEquals(8, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case44() {
        int K = 159;
        int T = 40545;
        assertEquals(8, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case45() {
        int K = 80;
        int T = 40880;
        assertEquals(9, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case46() {
        int K = 82;
        int T = 41902;
        assertEquals(9, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case47() {
        int K = 120;
        int T = 61320;
        assertEquals(9, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case48() {
        int K = 155;
        int T = 79205;
        assertEquals(9, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case49() {
        int K = 158;
        int T = 80738;
        assertEquals(9, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case50() {
        int K = 83;
        int T = 84909;
        assertEquals(10, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case51() {
        int K = 91;
        int T = 93093;
        assertEquals(10, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case52() {
        int K = 93;
        int T = 95139;
        assertEquals(10, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case53() {
        int K = 108;
        int T = 110484;
        assertEquals(10, kitayutamart2.numBought(K, T));
    }

    @Test
    public void case54() {
        int K = 110;
        int T = 112530;
        assertEquals(10, kitayutamart2.numBought(K, T));
    }

}
