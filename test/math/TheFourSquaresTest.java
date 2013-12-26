package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class TheFourSquaresTest {
    TheFourSquares thefoursquares = new TheFourSquares();

    @Test
    public void case1() {
        int n = 2;
        int m = 2;
        assertEquals(1, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case1a() {
        int n = 4;
        int m = 4;
        assertEquals(20, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case2() {
        int n = 3;
        int m = 3;
        assertEquals(5, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case3() {
        int n = 3;
        int m = 4;
        assertEquals(9, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case4() {
        int n = 10;
        int m = 7;
        assertEquals(421, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case5() {
        int n = 123456;
        int m = 987654;
        assertEquals(136415012, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case6() {
        int n = 1000000;
        int m = 1000000;
        assertEquals(260122732, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case7() {
        int n = 1000000;
        int m = 999999;
        assertEquals(93122718, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case8() {
        int n = 999999;
        int m = 1000000;
        assertEquals(93122718, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case9() {
        int n = 999999;
        int m = 999999;
        assertEquals(758109197, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case10() {
        int n = 2;
        int m = 1000000;
        assertEquals(1, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case11() {
        int n = 989782;
        int m = 1000000;
        assertEquals(914669749, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case12() {
        int n = 739798;
        int m = 669212;
        assertEquals(311761403, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case13() {
        int n = 292586;
        int m = 424235;
        assertEquals(307328095, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case14() {
        int n = 805115;
        int m = 938417;
        assertEquals(822799866, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case15() {
        int n = 384500;
        int m = 259574;
        assertEquals(375888347, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case16() {
        int n = 356807;
        int m = 796049;
        assertEquals(290933291, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case17() {
        int n = 260731;
        int m = 777351;
        assertEquals(434922109, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case18() {
        int n = 109230;
        int m = 690343;
        assertEquals(845965649, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case19() {
        int n = 586570;
        int m = 163882;
        assertEquals(389920628, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case20() {
        int n = 57710;
        int m = 949982;
        assertEquals(718492866, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case21() {
        int n = 61923;
        int m = 217062;
        assertEquals(626354668, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case22() {
        int n = 106493;
        int m = 909559;
        assertEquals(603935003, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case23() {
        int n = 417580;
        int m = 781770;
        assertEquals(14636816, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case24() {
        int n = 97278;
        int m = 301791;
        assertEquals(844654655, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case25() {
        int n = 199923;
        int m = 179248;
        assertEquals(490242682, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case26() {
        int n = 788621;
        int m = 549059;
        assertEquals(28850380, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case27() {
        int n = 417438;
        int m = 359410;
        assertEquals(335668543, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case28() {
        int n = 448742;
        int m = 797672;
        assertEquals(832492533, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case29() {
        int n = 542729;
        int m = 440909;
        assertEquals(655163055, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case30() {
        int n = 821554;
        int m = 551577;
        assertEquals(827594240, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case31() {
        int n = 28734;
        int m = 632885;
        assertEquals(797067487, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case32() {
        int n = 281345;
        int m = 106952;
        assertEquals(835197208, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case33() {
        int n = 194181;
        int m = 142686;
        assertEquals(949365357, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case34() {
        int n = 578515;
        int m = 115113;
        assertEquals(914743886, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case35() {
        int n = 60804;
        int m = 565419;
        assertEquals(104572100, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case36() {
        int n = 696888;
        int m = 508387;
        assertEquals(800669939, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case37() {
        int n = 483692;
        int m = 424084;
        assertEquals(833708597, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case38() {
        int n = 992554;
        int m = 712067;
        assertEquals(89878021, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case39() {
        int n = 706108;
        int m = 983116;
        assertEquals(356388798, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case40() {
        int n = 964869;
        int m = 535314;
        assertEquals(229267154, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case41() {
        int n = 291492;
        int m = 193513;
        assertEquals(424105565, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case42() {
        int n = 722130;
        int m = 384820;
        assertEquals(485933304, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case43() {
        int n = 237812;
        int m = 644351;
        assertEquals(939244589, thefoursquares.countPlacements(n, m));
    }

    @Test
    public void case44() {
        int n = 447623;
        int m = 477308;
        assertEquals(807142952, thefoursquares.countPlacements(n, m));
    }

}
