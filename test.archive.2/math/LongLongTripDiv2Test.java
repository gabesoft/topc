package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class LongLongTripDiv2Test {
    LongLongTripDiv2 longlongtripdiv2 = new LongLongTripDiv2();

    @Test
    public void case1() {
        long D = 10L;
        int T = 6;
        int B = 3;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case2() {
        long D = 10L;
        int T = 5;
        int B = 3;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case3() {
        long D = 10L;
        int T = 10;
        int B = 9999;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case4() {
        long D = 1000L;
        int T = 100;
        int B = 10;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case5() {
        long D = 1000010000100001L;
        int T = 1100011;
        int B = 1000000000;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case6() {
        long D = 12345678987654321L;
        int T = 111111111;
        int B = 111111111;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case7() {
        long D = 561550235931654728L;
        int T = 770077091;
        int B = 594689741;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case8() {
        long D = 782530047792645702L;
        int T = 810704991;
        int B = 528005295;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case9() {
        long D = 624086603713404674L;
        int T = 155234367;
        int B = 624336837;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case10() {
        long D = 712848680829476726L;
        int T = 791137911;
        int B = 583594796;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case11() {
        long D = 100729809748786028L;
        int T = 698964399;
        int B = 552066677;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case12() {
        long D = 400449542141702697L;
        int T = 592584370;
        int B = 683818647;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case13() {
        long D = 573345591460223849L;
        int T = 37847150;
        int B = 441873733;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case14() {
        long D = 39847468287453969L;
        int T = 893600490;
        int B = 35770085;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case15() {
        long D = 648355374576745941L;
        int T = 193613005;
        int B = 616033025;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case16() {
        long D = 757451873003548674L;
        int T = 775314670;
        int B = 575850467;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case17() {
        long D = 860202583564900878L;
        int T = 305983574;
        int B = 590060496;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case18() {
        long D = 511436416444306L;
        int T = 32920090;
        int B = 30133477;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case19() {
        long D = 56627120982707376L;
        int T = 398015298;
        int B = 824514854;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case20() {
        long D = 62953424141737776L;
        int T = 109294186;
        int B = 601827691;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case21() {
        long D = 313708976434406248L;
        int T = 627419903;
        int B = 901586146;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case22() {
        long D = 50L;
        int T = 100;
        int B = 2;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case23() {
        long D = 120L;
        int T = 10;
        int B = 11;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case24() {
        long D = 426628796717371325L;
        int T = 790195070;
        int B = 562630216;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case25() {
        long D = 156644136483855159L;
        int T = 940691151;
        int B = 214527417;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case26() {
        long D = 4000680273891670L;
        int T = 453415984;
        int B = 83425307;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case27() {
        long D = 116288870684141900L;
        int T = 253673516;
        int B = 735727312;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case28() {
        long D = 6092575699495802L;
        int T = 72846070;
        int B = 258202895;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case29() {
        long D = 45378819282349739L;
        int T = 939280619;
        int B = 337057631;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case30() {
        long D = 11013088164268884L;
        int T = 137690964;
        int B = 770600833;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case31() {
        long D = 24500664552824728L;
        int T = 827564104;
        int B = 411276082;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case32() {
        long D = 13176362220377406L;
        int T = 888479706;
        int B = 17582926;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case33() {
        long D = 370706625832873310L;
        int T = 902062133;
        int B = 516683284;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case34() {
        long D = 38786596395518266L;
        int T = 182174947;
        int B = 650120450;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case35() {
        long D = 7479534912064137L;
        int T = 649681433;
        int B = 34461209;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case36() {
        long D = 17330402299125994L;
        int T = 30496894;
        int B = 898646176;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case37() {
        long D = 2111789993468437L;
        int T = 110120617;
        int B = 813773048;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case38() {
        long D = 1000000000000000000L;
        int T = 1000000000;
        int B = 1000000000;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case39() {
        long D = 1L;
        int T = 1;
        int B = 2;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case40() {
        long D = 1000000000L;
        int T = 1000000000;
        int B = 2;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case41() {
        long D = 1000000000000000000L;
        int T = 1000000000;
        int B = 2;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case42() {
        long D = 10L;
        int T = 100;
        int B = 2;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case43() {
        long D = 10L;
        int T = 6;
        int B = 9;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case44() {
        long D = 1000000000000000000L;
        int T = 2;
        int B = 2;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case45() {
        long D = 10000000000L;
        int T = 1000000000;
        int B = 11;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case46() {
        long D = 1000000000000000000L;
        int T = 100000000;
        int B = 2;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case47() {
        long D = 100L;
        int T = 50;
        int B = 2;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case48() {
        long D = 10L;
        int T = 1000000000;
        int B = 10;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case49() {
        long D = 10000000001L;
        int T = 10000;
        int B = 2;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case50() {
        long D = 1000000000000000000L;
        int T = 1000000000;
        int B = 9;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case51() {
        long D = 2000000001L;
        int T = 1000000000;
        int B = 2;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case52() {
        long D = 10000000000000000L;
        int T = 100000000;
        int B = 100000000;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case53() {
        long D = 92222222222222L;
        int T = 1000000000;
        int B = 2;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case54() {
        long D = 12L;
        int T = 10;
        int B = 3;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case55() {
        long D = 1000000000000000000L;
        int T = 999999999;
        int B = 1000000000;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case56() {
        long D = 11L;
        int T = 3;
        int B = 2;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case57() {
        long D = 10000L;
        int T = 1;
        int B = 10;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case58() {
        long D = 13211231212213268L;
        int T = 1000000000;
        int B = 2;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case59() {
        long D = 10L;
        int T = 10;
        int B = 2;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case60() {
        long D = 999999999000000001L;
        int T = 1000000000;
        int B = 1000000000;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case61() {
        long D = 10000000000L;
        int T = 1000000000;
        int B = 10;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case62() {
        long D = 20L;
        int T = 9;
        int B = 3;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case63() {
        long D = 1000000000L;
        int T = 1000000000;
        int B = 1000007;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case64() {
        long D = 1000000001L;
        int T = 1000000000;
        int B = 2;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case65() {
        long D = 1000000000000000000L;
        int T = 1;
        int B = 2;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case66() {
        long D = 100000000000L;
        int T = 1;
        int B = 2;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case67() {
        long D = 1L;
        int T = 1000000000;
        int B = 2;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case68() {
        long D = 999999999999999999L;
        int T = 2;
        int B = 9999;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case69() {
        long D = 10L;
        int T = 10;
        int B = 5;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case70() {
        long D = 1L;
        int T = 2;
        int B = 2;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case71() {
        long D = 100000000000001L;
        int T = 1000000000;
        int B = 2;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case72() {
        long D = 1000000000L;
        int T = 1000000000;
        int B = 1000000000;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case73() {
        long D = 1000000000000000L;
        int T = 100000000;
        int B = 2;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case74() {
        long D = 1500000000L;
        int T = 1000000000;
        int B = 2;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case75() {
        long D = 1000000000000000000L;
        int T = 900900000;
        int B = 2;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case76() {
        long D = 999999999999999999L;
        int T = 989898989;
        int B = 99999;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case77() {
        long D = 10000000000000000L;
        int T = 1000000000;
        int B = 2;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case78() {
        long D = 27L;
        int T = 9;
        int B = 5;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case79() {
        long D = 1000010000100001L;
        int T = 1000000000;
        int B = 2;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case80() {
        long D = 30L;
        int T = 10;
        int B = 3;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case81() {
        long D = 5L;
        int T = 1;
        int B = 2;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case82() {
        long D = 5L;
        int T = 5;
        int B = 2;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case83() {
        long D = 100L;
        int T = 1;
        int B = 10;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case84() {
        long D = 21L;
        int T = 13;
        int B = 5;
        assertEquals("Possible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case85() {
        long D = 1000000000000000000L;
        int T = 1000000000;
        int B = 999999999;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case86() {
        long D = 16L;
        int T = 7;
        int B = 5;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case87() {
        long D = 6L;
        int T = 2;
        int B = 2;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case88() {
        long D = 999999999999999999L;
        int T = 1000000000;
        int B = 2;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

    @Test
    public void case89() {
        long D = 4000000000L;
        int T = 1000000000;
        int B = 3;
        assertEquals("Impossible", longlongtripdiv2.isAble(D, T, B));
    }

}
