package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class RabbitsAndCakesTest {
    RabbitsAndCakes rabbitsandcakes = new RabbitsAndCakes();

    @Test
    public void case1() {
        int minR = 4;
        int maxR = 5;
        int minC = 3;
        int maxC = 3;
        assertEquals(1L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case2() {
        int minR = 2;
        int maxR = 2;
        int minC = 1;
        int maxC = 1000;
        assertEquals(1000L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case3() {
        int minR = 1;
        int maxR = 1000;
        int minC = 2;
        int maxC = 2;
        assertEquals(4L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case4() {
        int minR = 4;
        int maxR = 7;
        int minC = 4;
        int maxC = 7;
        assertEquals(14L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case5() {
        int minR = 64716;
        int maxR = 101247;
        int minC = 99867;
        int maxC = 287365;
        assertEquals(6848769959L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case6() {
        int minR = 1;
        int maxR = 1;
        int minC = 1;
        int maxC = 1;
        assertEquals(1L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case7() {
        int minR = 1;
        int maxR = 1;
        int minC = 1;
        int maxC = 1000000;
        assertEquals(1000000L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case8() {
        int minR = 1;
        int maxR = 1;
        int minC = 1000000;
        int maxC = 1000000;
        assertEquals(1L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case9() {
        int minR = 1;
        int maxR = 1000000;
        int minC = 1;
        int maxC = 1;
        assertEquals(2L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case10() {
        int minR = 1;
        int maxR = 1000000;
        int minC = 1;
        int maxC = 1000000;
        assertEquals(500013470034L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case11() {
        int minR = 1;
        int maxR = 1000000;
        int minC = 1000000;
        int maxC = 1000000;
        assertEquals(1000000L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case12() {
        int minR = 1000000;
        int maxR = 1000000;
        int minC = 1;
        int maxC = 1;
        assertEquals(0L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case13() {
        int minR = 1000000;
        int maxR = 1000000;
        int minC = 1;
        int maxC = 1000000;
        assertEquals(49L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case14() {
        int minR = 1000000;
        int maxR = 1000000;
        int minC = 1000000;
        int maxC = 1000000;
        assertEquals(1L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case15() {
        int minR = 3150;
        int maxR = 990534;
        int minC = 4280;
        int maxC = 991932;
        assertEquals(488857589364L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case16() {
        int minR = 7551;
        int maxR = 990298;
        int minC = 9580;
        int maxC = 992783;
        assertEquals(485350121641L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case17() {
        int minR = 6994;
        int maxR = 998748;
        int minC = 6059;
        int maxC = 997024;
        assertEquals(490094066141L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case18() {
        int minR = 581;
        int maxR = 999075;
        int minC = 6301;
        int maxC = 994347;
        assertEquals(493783422892L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case19() {
        int minR = 3950;
        int maxR = 997352;
        int minC = 5439;
        int maxC = 991877;
        assertEquals(488013091811L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case20() {
        int minR = 997401;
        int maxR = 998551;
        int minC = 996045;
        int maxC = 998792;
        assertEquals(949718L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case21() {
        int minR = 991388;
        int maxR = 999991;
        int minC = 993774;
        int maxC = 998504;
        assertEquals(22523192L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case22() {
        int minR = 993004;
        int maxR = 996413;
        int minC = 998706;
        int maxC = 999175;
        assertEquals(1602700L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case23() {
        int minR = 998405;
        int maxR = 999514;
        int minC = 995079;
        int maxC = 996131;
        assertEquals(343L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case24() {
        int minR = 997580;
        int maxR = 999608;
        int minC = 999387;
        int maxC = 999673;
        assertEquals(558910L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case25() {
        int minR = 8984;
        int maxR = 8984;
        int minC = 6738;
        int maxC = 6738;
        assertEquals(1L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case26() {
        int minR = 459160;
        int maxR = 459160;
        int minC = 454745;
        int maxC = 454745;
        assertEquals(1L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case27() {
        int minR = 884617;
        int maxR = 884617;
        int minC = 884616;
        int maxC = 884616;
        assertEquals(1L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case28() {
        int minR = 883008;
        int maxR = 883008;
        int minC = 882336;
        int maxC = 882336;
        assertEquals(1L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case29() {
        int minR = 472992;
        int maxR = 472992;
        int minC = 472984;
        int maxC = 472984;
        assertEquals(1L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case30() {
        int minR = 316334;
        int maxR = 741572;
        int minC = 352213;
        int maxC = 713049;
        assertEquals(78052884439L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case31() {
        int minR = 932427;
        int maxR = 968987;
        int minC = 201035;
        int maxC = 968987;
        assertEquals(668880427L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case32() {
        int minR = 779640;
        int maxR = 963654;
        int minC = 443736;
        int maxC = 830376;
        assertEquals(1288121803L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case33() {
        int minR = 659606;
        int maxR = 918455;
        int minC = 849488;
        int maxC = 918064;
        assertEquals(15373711738L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case34() {
        int minR = 605904;
        int maxR = 948246;
        int minC = 48278;
        int maxC = 605826;
        assertEquals(473393L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case35() {
        int minR = 606793;
        int maxR = 846424;
        int minC = 581509;
        int maxC = 900000;
        assertEquals(41553341472L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case36() {
        int minR = 167224;
        int maxR = 808593;
        int minC = 76676;
        int maxC = 769601;
        assertEquals(181437978770L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case37() {
        int minR = 472014;
        int maxR = 906134;
        int minC = 868025;
        int maxC = 905942;
        assertEquals(15735236349L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case38() {
        int minR = 315721;
        int maxR = 444379;
        int minC = 772064;
        int maxC = 982217;
        assertEquals(27038203486L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case39() {
        int minR = 477962;
        int maxR = 982968;
        int minC = 556865;
        int maxC = 728565;
        assertEquals(28290712144L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case40() {
        int minR = 721280;
        int maxR = 786167;
        int minC = 334430;
        int maxC = 441894;
        assertEquals(32444L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case41() {
        int minR = 475466;
        int maxR = 733459;
        int minC = 889567;
        int maxC = 914241;
        assertEquals(6366001950L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case42() {
        int minR = 62830;
        int maxR = 830710;
        int minC = 427847;
        int maxC = 472394;
        assertEquals(17253648491L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case43() {
        int minR = 95455;
        int maxR = 175523;
        int minC = 90151;
        int maxC = 449469;
        assertEquals(25141032491L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case44() {
        int minR = 33276;
        int maxR = 880261;
        int minC = 33217;
        int maxC = 515366;
        assertEquals(116212538776L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case45() {
        int minR = 134235;
        int maxR = 824175;
        int minC = 33658;
        int maxC = 244311;
        assertEquals(6060125271L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case46() {
        int minR = 440604;
        int maxR = 747262;
        int minC = 96620;
        int maxC = 440594;
        assertEquals(373559L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case47() {
        int minR = 796871;
        int maxR = 986696;
        int minC = 116891;
        int maxC = 618685;
        assertEquals(145643L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case48() {
        int minR = 538579;
        int maxR = 938032;
        int minC = 272451;
        int maxC = 468804;
        assertEquals(287532L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case49() {
        int minR = 179650;
        int maxR = 684816;
        int minC = 201893;
        int maxC = 340319;
        assertEquals(12662008157L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case50() {
        int minR = 203744;
        int maxR = 299774;
        int minC = 213349;
        int maxC = 441950;
        assertEquals(18219141404L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case51() {
        int minR = 436833;
        int maxR = 761401;
        int minC = 576893;
        int maxC = 665752;
        assertEquals(16394928127L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case52() {
        int minR = 337760;
        int maxR = 740383;
        int minC = 454445;
        int maxC = 737661;
        assertEquals(73156705682L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case53() {
        int minR = 442581;
        int maxR = 684579;
        int minC = 420452;
        int maxC = 979676;
        assertEquals(100698034162L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case54() {
        int minR = 685384;
        int maxR = 844770;
        int minC = 673072;
        int maxC = 844740;
        assertEquals(12699292256L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case55() {
        int minR = 337903;
        int maxR = 875757;
        int minC = 337900;
        int maxC = 954952;
        assertEquals(187246584655L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

    @Test
    public void case56() {
        int minR = 452466;
        int maxR = 771912;
        int minC = 452448;
        int maxC = 872178;
        assertEquals(83056942043L, rabbitsandcakes.getNumber(minR, maxR, minC, maxC));
    }

}
