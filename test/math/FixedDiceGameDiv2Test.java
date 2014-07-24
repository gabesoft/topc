package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class FixedDiceGameDiv2Test {
    double DELTA = 1.0e-09;
    FixedDiceGameDiv2 fixeddicegamediv2 = new FixedDiceGameDiv2();

    @Test
    public void case1() {
        int a = 2;
        int b = 2;
        assertEquals(2.0, fixeddicegamediv2.getExpectation(a, b), DELTA * 2.0);
    }

    @Test
    public void case2() {
        int a = 4;
        int b = 2;
        assertEquals(3.2, fixeddicegamediv2.getExpectation(a, b), DELTA * 3.2);
    }

    @Test
    public void case3() {
        int a = 6;
        int b = 6;
        assertEquals(4.666666666666667, fixeddicegamediv2.getExpectation(a, b), DELTA * 4.666666666666667);
    }

    @Test
    public void case4() {
        int a = 50;
        int b = 50;
        assertEquals(34.0, fixeddicegamediv2.getExpectation(a, b), DELTA * 34.0);
    }

    @Test
    public void case5() {
        int a = 3;
        int b = 3;
        assertEquals(2.6666666666666665, fixeddicegamediv2.getExpectation(a, b), DELTA * 2.6666666666666665);
    }

    @Test
    public void case6() {
        int a = 11;
        int b = 13;
        assertEquals(7.999999999999999, fixeddicegamediv2.getExpectation(a, b), DELTA * 7.999999999999999);
    }

    @Test
    public void case7() {
        int a = 2;
        int b = 1000;
        assertEquals(2.0, fixeddicegamediv2.getExpectation(a, b), DELTA * 2.0);
    }

    @Test
    public void case8() {
        int a = 1000;
        int b = 2;
        assertEquals(501.2498748122179, fixeddicegamediv2.getExpectation(a, b), DELTA * 501.2498748122179);
    }

    @Test
    public void case9() {
        int a = 1000;
        int b = 1000;
        assertEquals(667.3333333333333, fixeddicegamediv2.getExpectation(a, b), DELTA * 667.3333333333333);
    }

    @Test
    public void case10() {
        int a = 418;
        int b = 382;
        assertEquals(278.40618101545294, fixeddicegamediv2.getExpectation(a, b), DELTA * 278.40618101545294);
    }

    @Test
    public void case11() {
        int a = 573;
        int b = 923;
        assertEquals(382.6666666666668, fixeddicegamediv2.getExpectation(a, b), DELTA * 382.6666666666668);
    }

    @Test
    public void case12() {
        int a = 182;
        int b = 39;
        assertEquals(101.10905349794261, fixeddicegamediv2.getExpectation(a, b), DELTA * 101.10905349794261);
    }

    @Test
    public void case13() {
        int a = 294;
        int b = 392;
        assertEquals(196.66666666666612, fixeddicegamediv2.getExpectation(a, b), DELTA * 196.66666666666612);
    }

    @Test
    public void case14() {
        int a = 574;
        int b = 964;
        assertEquals(383.3333333333333, fixeddicegamediv2.getExpectation(a, b), DELTA * 383.3333333333333);
    }

    @Test
    public void case15() {
        int a = 192;
        int b = 723;
        assertEquals(128.66666666666697, fixeddicegamediv2.getExpectation(a, b), DELTA * 128.66666666666697);
    }

    @Test
    public void case16() {
        int a = 940;
        int b = 382;
        assertEquals(558.1269205076807, fixeddicegamediv2.getExpectation(a, b), DELTA * 558.1269205076807);
    }

    @Test
    public void case17() {
        int a = 483;
        int b = 17;
        assertEquals(246.4746835443017, fixeddicegamediv2.getExpectation(a, b), DELTA * 246.4746835443017);
    }

    @Test
    public void case18() {
        int a = 293;
        int b = 420;
        assertEquals(195.99999999999997, fixeddicegamediv2.getExpectation(a, b), DELTA * 195.99999999999997);
    }

    @Test
    public void case19() {
        int a = 572;
        int b = 674;
        assertEquals(382.0000000000002, fixeddicegamediv2.getExpectation(a, b), DELTA * 382.0000000000002);
    }

    @Test
    public void case20() {
        int a = 850;
        int b = 878;
        assertEquals(567.3333333333334, fixeddicegamediv2.getExpectation(a, b), DELTA * 567.3333333333334);
    }

    @Test
    public void case21() {
        int a = 681;
        int b = 483;
        assertEquals(439.8580106302186, fixeddicegamediv2.getExpectation(a, b), DELTA * 439.8580106302186);
    }

    @Test
    public void case22() {
        int a = 492;
        int b = 549;
        assertEquals(328.66666666666663, fixeddicegamediv2.getExpectation(a, b), DELTA * 328.66666666666663);
    }

    @Test
    public void case23() {
        int a = 207;
        int b = 157;
        assertEquals(135.47656249999977, fixeddicegamediv2.getExpectation(a, b), DELTA * 135.47656249999977);
    }

    @Test
    public void case24() {
        int a = 134;
        int b = 323;
        assertEquals(89.99999999999999, fixeddicegamediv2.getExpectation(a, b), DELTA * 89.99999999999999);
    }

    @Test
    public void case25() {
        int a = 948;
        int b = 816;
        assertEquals(627.3246833487768, fixeddicegamediv2.getExpectation(a, b), DELTA * 627.3246833487768);
    }

    @Test
    public void case26() {
        int a = 583;
        int b = 404;
        assertEquals(375.3771353482258, fixeddicegamediv2.getExpectation(a, b), DELTA * 375.3771353482258);
    }

    @Test
    public void case27() {
        int a = 603;
        int b = 727;
        assertEquals(402.6666666666667, fixeddicegamediv2.getExpectation(a, b), DELTA * 402.6666666666667);
    }

    @Test
    public void case28() {
        int a = 458;
        int b = 3;
        assertEquals(230.4992690058504, fixeddicegamediv2.getExpectation(a, b), DELTA * 230.4992690058504);
    }

    @Test
    public void case29() {
        int a = 182;
        int b = 683;
        assertEquals(122.00000000000001, fixeddicegamediv2.getExpectation(a, b), DELTA * 122.00000000000001);
    }

    @Test
    public void case30() {
        int a = 788;
        int b = 468;
        assertEquals(495.262270400481, fixeddicegamediv2.getExpectation(a, b), DELTA * 495.262270400481);
    }

    @Test
    public void case31() {
        int a = 544;
        int b = 66;
        assertEquals(288.8945478289269, fixeddicegamediv2.getExpectation(a, b), DELTA * 288.8945478289269);
    }

    @Test
    public void case32() {
        int a = 648;
        int b = 856;
        assertEquals(432.66666666666686, fixeddicegamediv2.getExpectation(a, b), DELTA * 432.66666666666686);
    }

    @Test
    public void case33() {
        int a = 459;
        int b = 600;
        assertEquals(306.6666666666666, fixeddicegamediv2.getExpectation(a, b), DELTA * 306.6666666666666);
    }

    @Test
    public void case34() {
        int a = 497;
        int b = 883;
        assertEquals(332.0000000000003, fixeddicegamediv2.getExpectation(a, b), DELTA * 332.0000000000003);
    }

    @Test
    public void case35() {
        int a = 759;
        int b = 40;
        assertEquals(390.15978334462284, fixeddicegamediv2.getExpectation(a, b), DELTA * 390.15978334462284);
    }

    @Test
    public void case36() {
        int a = 855;
        int b = 177;
        assertEquals(470.7959094865139, fixeddicegamediv2.getExpectation(a, b), DELTA * 470.7959094865139);
    }

    @Test
    public void case37() {
        int a = 649;
        int b = 11;
        assertEquals(327.9922239502304, fixeddicegamediv2.getExpectation(a, b), DELTA * 327.9922239502304);
    }

    @Test
    public void case38() {
        int a = 249;
        int b = 243;
        assertEquals(166.62729658792654, fixeddicegamediv2.getExpectation(a, b), DELTA * 166.62729658792654);
    }

    @Test
    public void case39() {
        int a = 498;
        int b = 470;
        assertEquals(332.1866666666661, fixeddicegamediv2.getExpectation(a, b), DELTA * 332.1866666666661);
    }

    @Test
    public void case40() {
        int a = 866;
        int b = 573;
        assertEquals(553.3724812895771, fixeddicegamediv2.getExpectation(a, b), DELTA * 553.3724812895771);
    }

    @Test
    public void case41() {
        int a = 530;
        int b = 341;
        assertEquals(337.5041782729804, fixeddicegamediv2.getExpectation(a, b), DELTA * 337.5041782729804);
    }

    @Test
    public void case42() {
        int a = 239;
        int b = 869;
        assertEquals(160.0, fixeddicegamediv2.getExpectation(a, b), DELTA * 160.0);
    }

    @Test
    public void case43() {
        int a = 657;
        int b = 99;
        assertEquals(353.32729269631477, fixeddicegamediv2.getExpectation(a, b), DELTA * 353.32729269631477);
    }

    @Test
    public void case44() {
        int a = 321;
        int b = 487;
        assertEquals(214.66666666666683, fixeddicegamediv2.getExpectation(a, b), DELTA * 214.66666666666683);
    }

    @Test
    public void case45() {
        int a = 329;
        int b = 323;
        assertEquals(219.97005988023966, fixeddicegamediv2.getExpectation(a, b), DELTA * 219.97005988023966);
    }

    @Test
    public void case46() {
        int a = 786;
        int b = 750;
        assertEquals(524.1550954120997, fixeddicegamediv2.getExpectation(a, b), DELTA * 524.1550954120997);
    }

    @Test
    public void case47() {
        int a = 674;
        int b = 477;
        assertEquals(435.20613026819996, fixeddicegamediv2.getExpectation(a, b), DELTA * 435.20613026819996);
    }

    @Test
    public void case48() {
        int a = 994;
        int b = 29;
        assertEquals(504.9642492339228, fixeddicegamediv2.getExpectation(a, b), DELTA * 504.9642492339228);
    }

    @Test
    public void case49() {
        int a = 420;
        int b = 457;
        assertEquals(280.66666666666674, fixeddicegamediv2.getExpectation(a, b), DELTA * 280.66666666666674);
    }

    @Test
    public void case50() {
        int a = 44;
        int b = 51;
        assertEquals(30.0, fixeddicegamediv2.getExpectation(a, b), DELTA * 30.0);
    }

    @Test
    public void case51() {
        int a = 13;
        int b = 796;
        assertEquals(9.333333333333334, fixeddicegamediv2.getExpectation(a, b), DELTA * 9.333333333333334);
    }

    @Test
    public void case52() {
        int a = 700;
        int b = 700;
        assertEquals(467.3333333333329, fixeddicegamediv2.getExpectation(a, b), DELTA * 467.3333333333329);
    }

    @Test
    public void case53() {
        int a = 5;
        int b = 7;
        assertEquals(4.0, fixeddicegamediv2.getExpectation(a, b), DELTA * 4.0);
    }

    @Test
    public void case54() {
        int a = 6;
        int b = 2;
        assertEquals(4.222222222222222, fixeddicegamediv2.getExpectation(a, b), DELTA * 4.222222222222222);
    }

    @Test
    public void case55() {
        int a = 999;
        int b = 499;
        assertEquals(611.1481975968048, fixeddicegamediv2.getExpectation(a, b), DELTA * 611.1481975968048);
    }

    @Test
    public void case56() {
        int a = 10;
        int b = 2;
        assertEquals(6.235294117647061, fixeddicegamediv2.getExpectation(a, b), DELTA * 6.235294117647061);
    }

    @Test
    public void case57() {
        int a = 49;
        int b = 48;
        assertEquals(33.333333333333336, fixeddicegamediv2.getExpectation(a, b), DELTA * 33.333333333333336);
    }

}
