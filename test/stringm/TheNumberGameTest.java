package topc.test.stringm;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.stringm.*;

public class TheNumberGameTest {
    TheNumberGame thenumbergame = new TheNumberGame();

    @Test
    public void case1() {
        int A = 45;
        int B = 4;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case2() {
        int A = 45;
        int B = 5;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case3() {
        int A = 99;
        int B = 123;
        assertEquals("Manao loses", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case4() {
        int A = 2356236;
        int B = 5666;
        assertEquals("Manao loses", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case5() {
        int A = 11;
        int B = 1;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case6() {
        int A = 12;
        int B = 21;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case7() {
        int A = 123;
        int B = 231;
        assertEquals("Manao loses", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case8() {
        int A = 123456789;
        int B = 987654321;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case9() {
        int A = 123456789;
        int B = 512346789;
        assertEquals("Manao loses", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case10() {
        int A = 446;
        int B = 646;
        assertEquals("Manao loses", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case11() {
        int A = 446;
        int B = 464;
        assertEquals("Manao loses", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case12() {
        int A = 446;
        int B = 644;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case13() {
        int A = 7347837;
        int B = 325;
        assertEquals("Manao loses", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case14() {
        int A = 7347837;
        int B = 837;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case15() {
        int A = 611;
        int B = 61;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case16() {
        int A = 123536363;
        int B = 363;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case17() {
        int A = 995432553;
        int B = 543;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case18() {
        int A = 995432553;
        int B = 234;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case19() {
        int A = 987987789;
        int B = 987;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case20() {
        int A = 978978789;
        int B = 879;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case21() {
        int A = 314159265;
        int B = 415;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case22() {
        int A = 314159265;
        int B = 295;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case23() {
        int A = 8442;
        int B = 4221;
        assertEquals("Manao loses", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case24() {
        int A = 8442;
        int B = 42;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case25() {
        int A = 866395753;
        int B = 6639575;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case26() {
        int A = 572681512;
        int B = 26;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case27() {
        int A = 212321312;
        int B = 33221;
        assertEquals("Manao loses", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case28() {
        int A = 212321312;
        int B = 2212;
        assertEquals("Manao loses", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case29() {
        int A = 212321312;
        int B = 213;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case30() {
        int A = 212321312;
        int B = 21312;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case31() {
        int A = 212321312;
        int B = 32131;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case32() {
        int A = 919244822;
        int B = 44291;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case33() {
        int A = 824216852;
        int B = 258612428;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case34() {
        int A = 258612428;
        int B = 824216852;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case35() {
        int A = 126;
        int B = 62;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case36() {
        int A = 76532791;
        int B = 52369717;
        assertEquals("Manao loses", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case37() {
        int A = 811934182;
        int B = 934818211;
        assertEquals("Manao loses", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case38() {
        int A = 8512658;
        int B = 3752381;
        assertEquals("Manao loses", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case39() {
        int A = 2179425;
        int B = 43785444;
        assertEquals("Manao loses", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case40() {
        int A = 1;
        int B = 2;
        assertEquals("Manao loses", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case41() {
        int A = 111;
        int B = 1;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case42() {
        int A = 44784278;
        int B = 5129525;
        assertEquals("Manao loses", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case43() {
        int A = 64844626;
        int B = 4462;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case44() {
        int A = 724582652;
        int B = 245826;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case45() {
        int A = 276464629;
        int B = 646;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case46() {
        int A = 276464629;
        int B = 646467;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case47() {
        int A = 472246289;
        int B = 64;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case48() {
        int A = 999999999;
        int B = 92;
        assertEquals("Manao loses", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case49() {
        int A = 999999999;
        int B = 9999;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case50() {
        int A = 999999999;
        int B = 99999999;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case51() {
        int A = 123456789;
        int B = 87654321;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case52() {
        int A = 12345678;
        int B = 2345678;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case53() {
        int A = 123456789;
        int B = 765;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case54() {
        int A = 12121;
        int B = 212;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case55() {
        int A = 12345;
        int B = 32;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case56() {
        int A = 1234;
        int B = 24;
        assertEquals("Manao loses", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case57() {
        int A = 123;
        int B = 321;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case58() {
        int A = 123;
        int B = 32;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case59() {
        int A = 544;
        int B = 45;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case60() {
        int A = 123;
        int B = 21;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case61() {
        int A = 123456789;
        int B = 8765;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case62() {
        int A = 1222;
        int B = 221;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case63() {
        int A = 1234;
        int B = 4321;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case64() {
        int A = 4321;
        int B = 1234;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case65() {
        int A = 321;
        int B = 123;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case66() {
        int A = 123;
        int B = 69;
        assertEquals("Manao loses", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case67() {
        int A = 444;
        int B = 4;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case68() {
        int A = 1234;
        int B = 34;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case69() {
        int A = 1111;
        int B = 11;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case70() {
        int A = 19;
        int B = 91;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case71() {
        int A = 41679;
        int B = 976;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case72() {
        int A = 12345;
        int B = 23;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case73() {
        int A = 11;
        int B = 111;
        assertEquals("Manao loses", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case74() {
        int A = 983625176;
        int B = 15263;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case75() {
        int A = 1234567;
        int B = 543;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case76() {
        int A = 545;
        int B = 455;
        assertEquals("Manao loses", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case77() {
        int A = 14321;
        int B = 1234;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case78() {
        int A = 11111122;
        int B = 21;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case79() {
        int A = 12345;
        int B = 54321;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case80() {
        int A = 1;
        int B = 11;
        assertEquals("Manao loses", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case81() {
        int A = 1221;
        int B = 2112;
        assertEquals("Manao loses", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case82() {
        int A = 234;
        int B = 432;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case83() {
        int A = 123445;
        int B = 344;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case84() {
        int A = 2345;
        int B = 43;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case85() {
        int A = 132;
        int B = 12;
        assertEquals("Manao loses", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case86() {
        int A = 12345;
        int B = 432;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case87() {
        int A = 34;
        int B = 43;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case88() {
        int A = 13161;
        int B = 613;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case89() {
        int A = 26;
        int B = 62;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case90() {
        int A = 31113;
        int B = 111;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case91() {
        int A = 1234;
        int B = 43;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case92() {
        int A = 4567;
        int B = 54;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case93() {
        int A = 325134;
        int B = 33254;
        assertEquals("Manao loses", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case94() {
        int A = 1;
        int B = 111111;
        assertEquals("Manao loses", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case95() {
        int A = 2122334;
        int B = 22233;
        assertEquals("Manao loses", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case96() {
        int A = 455;
        int B = 5;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case97() {
        int A = 123;
        int B = 12;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case98() {
        int A = 1234;
        int B = 32;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case99() {
        int A = 45;
        int B = 54;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case100() {
        int A = 1;
        int B = 99;
        assertEquals("Manao loses", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case101() {
        int A = 54321;
        int B = 12345;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case102() {
        int A = 1234;
        int B = 123;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case103() {
        int A = 245;
        int B = 45;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case104() {
        int A = 121213;
        int B = 1213;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case105() {
        int A = 1234;
        int B = 21;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case106() {
        int A = 3112;
        int B = 21;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case107() {
        int A = 12345666;
        int B = 456;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case108() {
        int A = 154;
        int B = 45;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case109() {
        int A = 32;
        int B = 23;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case110() {
        int A = 2;
        int B = 1;
        assertEquals("Manao loses", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case111() {
        int A = 2325;
        int B = 35;
        assertEquals("Manao loses", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case112() {
        int A = 1234;
        int B = 321;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case113() {
        int A = 432;
        int B = 43;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case114() {
        int A = 75157;
        int B = 515;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case115() {
        int A = 451;
        int B = 54;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case116() {
        int A = 123456789;
        int B = 567;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case117() {
        int A = 455;
        int B = 45;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case118() {
        int A = 165;
        int B = 65;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case119() {
        int A = 4588;
        int B = 45;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case120() {
        int A = 3212;
        int B = 123;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case121() {
        int A = 123;
        int B = 23;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case122() {
        int A = 123456789;
        int B = 23456789;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case123() {
        int A = 999999999;
        int B = 9;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case124() {
        int A = 1112111;
        int B = 11211;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case125() {
        int A = 123456789;
        int B = 214365879;
        assertEquals("Manao loses", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case126() {
        int A = 999876999;
        int B = 9876;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

    @Test
    public void case127() {
        int A = 999998999;
        int B = 9999899;
        assertEquals("Manao wins", thenumbergame.determineOutcome(A, B));
    }

}
