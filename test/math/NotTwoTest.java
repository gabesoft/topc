package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class NotTwoTest {
    NotTwo nottwo = new NotTwo();

    @Test
    public void case1() {
        int width = 3;
        int height = 2;
        assertEquals(4, nottwo.maxStones(width, height));
    }

    @Test
    public void case2() {
        int width = 3;
        int height = 3;
        assertEquals(5, nottwo.maxStones(width, height));
    }

    @Test
    public void case3() {
        int width = 8;
        int height = 5;
        assertEquals(20, nottwo.maxStones(width, height));
    }

    @Test
    public void case4() {
        int width = 1;
        int height = 1;
        assertEquals(1, nottwo.maxStones(width, height));
    }

    @Test
    public void case5() {
        int width = 1;
        int height = 2;
        assertEquals(2, nottwo.maxStones(width, height));
    }

    @Test
    public void case6() {
        int width = 1;
        int height = 3;
        assertEquals(2, nottwo.maxStones(width, height));
    }

    @Test
    public void case7() {
        int width = 1;
        int height = 4;
        assertEquals(2, nottwo.maxStones(width, height));
    }

    @Test
    public void case8() {
        int width = 2;
        int height = 1;
        assertEquals(2, nottwo.maxStones(width, height));
    }

    @Test
    public void case9() {
        int width = 2;
        int height = 2;
        assertEquals(4, nottwo.maxStones(width, height));
    }

    @Test
    public void case10() {
        int width = 2;
        int height = 3;
        assertEquals(4, nottwo.maxStones(width, height));
    }

    @Test
    public void case11() {
        int width = 2;
        int height = 4;
        assertEquals(4, nottwo.maxStones(width, height));
    }

    @Test
    public void case12() {
        int width = 3;
        int height = 1;
        assertEquals(2, nottwo.maxStones(width, height));
    }

    @Test
    public void case13() {
        int width = 3;
        int height = 2;
        assertEquals(4, nottwo.maxStones(width, height));
    }

    @Test
    public void case14() {
        int width = 3;
        int height = 3;
        assertEquals(5, nottwo.maxStones(width, height));
    }

    @Test
    public void case15() {
        int width = 3;
        int height = 4;
        assertEquals(6, nottwo.maxStones(width, height));
    }

    @Test
    public void case16() {
        int width = 4;
        int height = 1;
        assertEquals(2, nottwo.maxStones(width, height));
    }

    @Test
    public void case17() {
        int width = 4;
        int height = 2;
        assertEquals(4, nottwo.maxStones(width, height));
    }

    @Test
    public void case18() {
        int width = 4;
        int height = 3;
        assertEquals(6, nottwo.maxStones(width, height));
    }

    @Test
    public void case19() {
        int width = 4;
        int height = 4;
        assertEquals(8, nottwo.maxStones(width, height));
    }

    @Test
    public void case20() {
        int width = 997;
        int height = 997;
        assertEquals(497005, nottwo.maxStones(width, height));
    }

    @Test
    public void case21() {
        int width = 997;
        int height = 998;
        assertEquals(497504, nottwo.maxStones(width, height));
    }

    @Test
    public void case22() {
        int width = 997;
        int height = 999;
        assertEquals(498002, nottwo.maxStones(width, height));
    }

    @Test
    public void case23() {
        int width = 997;
        int height = 1000;
        assertEquals(498500, nottwo.maxStones(width, height));
    }

    @Test
    public void case24() {
        int width = 998;
        int height = 997;
        assertEquals(497504, nottwo.maxStones(width, height));
    }

    @Test
    public void case25() {
        int width = 998;
        int height = 998;
        assertEquals(498004, nottwo.maxStones(width, height));
    }

    @Test
    public void case26() {
        int width = 998;
        int height = 999;
        assertEquals(498502, nottwo.maxStones(width, height));
    }

    @Test
    public void case27() {
        int width = 998;
        int height = 1000;
        assertEquals(499000, nottwo.maxStones(width, height));
    }

    @Test
    public void case28() {
        int width = 999;
        int height = 997;
        assertEquals(498002, nottwo.maxStones(width, height));
    }

    @Test
    public void case29() {
        int width = 999;
        int height = 998;
        assertEquals(498502, nottwo.maxStones(width, height));
    }

    @Test
    public void case30() {
        int width = 999;
        int height = 999;
        assertEquals(499001, nottwo.maxStones(width, height));
    }

    @Test
    public void case31() {
        int width = 999;
        int height = 1000;
        assertEquals(499500, nottwo.maxStones(width, height));
    }

    @Test
    public void case32() {
        int width = 1000;
        int height = 997;
        assertEquals(498500, nottwo.maxStones(width, height));
    }

    @Test
    public void case33() {
        int width = 1000;
        int height = 998;
        assertEquals(499000, nottwo.maxStones(width, height));
    }

    @Test
    public void case34() {
        int width = 1000;
        int height = 999;
        assertEquals(499500, nottwo.maxStones(width, height));
    }

    @Test
    public void case35() {
        int width = 1000;
        int height = 1000;
        assertEquals(500000, nottwo.maxStones(width, height));
    }

    @Test
    public void case36() {
        int width = 1;
        int height = 934;
        assertEquals(468, nottwo.maxStones(width, height));
    }

    @Test
    public void case37() {
        int width = 744;
        int height = 263;
        assertEquals(97836, nottwo.maxStones(width, height));
    }

    @Test
    public void case38() {
        int width = 530;
        int height = 701;
        assertEquals(185766, nottwo.maxStones(width, height));
    }

    @Test
    public void case39() {
        int width = 509;
        int height = 753;
        assertEquals(191639, nottwo.maxStones(width, height));
    }

    @Test
    public void case40() {
        int width = 257;
        int height = 257;
        assertEquals(33025, nottwo.maxStones(width, height));
    }

    @Test
    public void case41() {
        int width = 120;
        int height = 712;
        assertEquals(42720, nottwo.maxStones(width, height));
    }

    @Test
    public void case42() {
        int width = 352;
        int height = 844;
        assertEquals(148544, nottwo.maxStones(width, height));
    }

    @Test
    public void case43() {
        int width = 706;
        int height = 109;
        assertEquals(38478, nottwo.maxStones(width, height));
    }

    @Test
    public void case44() {
        int width = 394;
        int height = 331;
        assertEquals(65208, nottwo.maxStones(width, height));
    }

    @Test
    public void case45() {
        int width = 367;
        int height = 170;
        assertEquals(31196, nottwo.maxStones(width, height));
    }

    @Test
    public void case46() {
        int width = 933;
        int height = 918;
        assertEquals(428248, nottwo.maxStones(width, height));
    }

    @Test
    public void case47() {
        int width = 848;
        int height = 973;
        assertEquals(412552, nottwo.maxStones(width, height));
    }

    @Test
    public void case48() {
        int width = 869;
        int height = 981;
        assertEquals(426245, nottwo.maxStones(width, height));
    }

    @Test
    public void case49() {
        int width = 224;
        int height = 550;
        assertEquals(61600, nottwo.maxStones(width, height));
    }

    @Test
    public void case50() {
        int width = 593;
        int height = 165;
        assertEquals(48923, nottwo.maxStones(width, height));
    }

    @Test
    public void case51() {
        int width = 170;
        int height = 552;
        assertEquals(46920, nottwo.maxStones(width, height));
    }

    @Test
    public void case52() {
        int width = 428;
        int height = 191;
        assertEquals(40874, nottwo.maxStones(width, height));
    }

    @Test
    public void case53() {
        int width = 625;
        int height = 636;
        assertEquals(198750, nottwo.maxStones(width, height));
    }

    @Test
    public void case54() {
        int width = 921;
        int height = 945;
        assertEquals(435173, nottwo.maxStones(width, height));
    }

    @Test
    public void case55() {
        int width = 311;
        int height = 863;
        assertEquals(134197, nottwo.maxStones(width, height));
    }

    @Test
    public void case56() {
        int width = 1;
        int height = 234;
        assertEquals(118, nottwo.maxStones(width, height));
    }

    @Test
    public void case57() {
        int width = 965;
        int height = 1;
        assertEquals(483, nottwo.maxStones(width, height));
    }

    @Test
    public void case58() {
        int width = 1;
        int height = 534;
        assertEquals(268, nottwo.maxStones(width, height));
    }

    @Test
    public void case59() {
        int width = 621;
        int height = 1;
        assertEquals(311, nottwo.maxStones(width, height));
    }

    @Test
    public void case60() {
        int width = 2;
        int height = 6;
        assertEquals(8, nottwo.maxStones(width, height));
    }

    @Test
    public void case61() {
        int width = 997;
        int height = 883;
        assertEquals(440176, nottwo.maxStones(width, height));
    }

    @Test
    public void case62() {
        int width = 11;
        int height = 6;
        assertEquals(34, nottwo.maxStones(width, height));
    }

    @Test
    public void case63() {
        int width = 992;
        int height = 945;
        assertEquals(468720, nottwo.maxStones(width, height));
    }

    @Test
    public void case64() {
        int width = 6;
        int height = 1;
        assertEquals(4, nottwo.maxStones(width, height));
    }

    @Test
    public void case65() {
        int width = 1;
        int height = 6;
        assertEquals(4, nottwo.maxStones(width, height));
    }

    @Test
    public void case66() {
        int width = 5;
        int height = 6;
        assertEquals(16, nottwo.maxStones(width, height));
    }

    @Test
    public void case67() {
        int width = 7;
        int height = 1;
        assertEquals(4, nottwo.maxStones(width, height));
    }

    @Test
    public void case68() {
        int width = 901;
        int height = 1000;
        assertEquals(450500, nottwo.maxStones(width, height));
    }

    @Test
    public void case69() {
        int width = 236;
        int height = 935;
        assertEquals(110330, nottwo.maxStones(width, height));
    }

    @Test
    public void case70() {
        int width = 10;
        int height = 10;
        assertEquals(52, nottwo.maxStones(width, height));
    }

    @Test
    public void case71() {
        int width = 18;
        int height = 18;
        assertEquals(164, nottwo.maxStones(width, height));
    }

    @Test
    public void case72() {
        int width = 867;
        int height = 461;
        assertEquals(199844, nottwo.maxStones(width, height));
    }

    @Test
    public void case73() {
        int width = 666;
        int height = 667;
        assertEquals(222112, nottwo.maxStones(width, height));
    }

    @Test
    public void case74() {
        int width = 25;
        int height = 25;
        assertEquals(313, nottwo.maxStones(width, height));
    }

    @Test
    public void case75() {
        int width = 2;
        int height = 5;
        assertEquals(6, nottwo.maxStones(width, height));
    }

    @Test
    public void case76() {
        int width = 5;
        int height = 2;
        assertEquals(6, nottwo.maxStones(width, height));
    }

    @Test
    public void case77() {
        int width = 980;
        int height = 817;
        assertEquals(400330, nottwo.maxStones(width, height));
    }

    @Test
    public void case78() {
        int width = 6;
        int height = 6;
        assertEquals(20, nottwo.maxStones(width, height));
    }

    @Test
    public void case79() {
        int width = 234;
        int height = 34;
        assertEquals(3980, nottwo.maxStones(width, height));
    }

    @Test
    public void case80() {
        int width = 6;
        int height = 3;
        assertEquals(10, nottwo.maxStones(width, height));
    }

    @Test
    public void case81() {
        int width = 5;
        int height = 3;
        assertEquals(8, nottwo.maxStones(width, height));
    }

    @Test
    public void case82() {
        int width = 95;
        int height = 74;
        assertEquals(3516, nottwo.maxStones(width, height));
    }

    @Test
    public void case83() {
        int width = 706;
        int height = 146;
        assertEquals(51540, nottwo.maxStones(width, height));
    }

    @Test
    public void case84() {
        int width = 5;
        int height = 5;
        assertEquals(13, nottwo.maxStones(width, height));
    }

    @Test
    public void case85() {
        int width = 999;
        int height = 987;
        assertEquals(493007, nottwo.maxStones(width, height));
    }

    @Test
    public void case86() {
        int width = 49;
        int height = 47;
        assertEquals(1152, nottwo.maxStones(width, height));
    }

    @Test
    public void case87() {
        int width = 6;
        int height = 4;
        assertEquals(12, nottwo.maxStones(width, height));
    }

    @Test
    public void case88() {
        int width = 6;
        int height = 2;
        assertEquals(8, nottwo.maxStones(width, height));
    }

    @Test
    public void case89() {
        int width = 1000;
        int height = 872;
        assertEquals(436000, nottwo.maxStones(width, height));
    }

    @Test
    public void case90() {
        int width = 1;
        int height = 100;
        assertEquals(50, nottwo.maxStones(width, height));
    }

    @Test
    public void case91() {
        int width = 10;
        int height = 11;
        assertEquals(56, nottwo.maxStones(width, height));
    }

    @Test
    public void case92() {
        int width = 10;
        int height = 1;
        assertEquals(6, nottwo.maxStones(width, height));
    }

    @Test
    public void case93() {
        int width = 42;
        int height = 18;
        assertEquals(380, nottwo.maxStones(width, height));
    }

    @Test
    public void case94() {
        int width = 58;
        int height = 214;
        assertEquals(6208, nottwo.maxStones(width, height));
    }

    @Test
    public void case95() {
        int width = 3;
        int height = 6;
        assertEquals(10, nottwo.maxStones(width, height));
    }

    @Test
    public void case96() {
        int width = 1;
        int height = 99;
        assertEquals(50, nottwo.maxStones(width, height));
    }

    @Test
    public void case97() {
        int width = 11;
        int height = 11;
        assertEquals(61, nottwo.maxStones(width, height));
    }

    @Test
    public void case98() {
        int width = 20;
        int height = 5;
        assertEquals(50, nottwo.maxStones(width, height));
    }

    @Test
    public void case99() {
        int width = 777;
        int height = 127;
        assertEquals(49340, nottwo.maxStones(width, height));
    }

    @Test
    public void case100() {
        int width = 955;
        int height = 599;
        assertEquals(286023, nottwo.maxStones(width, height));
    }

    @Test
    public void case101() {
        int width = 1;
        int height = 9;
        assertEquals(5, nottwo.maxStones(width, height));
    }

    @Test
    public void case102() {
        int width = 989;
        int height = 899;
        assertEquals(444556, nottwo.maxStones(width, height));
    }

}
