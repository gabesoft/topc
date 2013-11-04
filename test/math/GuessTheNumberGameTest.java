package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class GuessTheNumberGameTest {
    GuessTheNumberGame guessthenumbergame = new GuessTheNumberGame();

    @Test
    public void case1() {
        int n = 5;
        assertEquals(12, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case2() {
        int n = 16;
        assertEquals(240, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case3() {
        int n = 1;
        assertEquals(1, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case4() {
        int n = 1000000;
        assertEquals(677298706, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case5() {
        int n = 2;
        assertEquals(2, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case6() {
        int n = 3;
        assertEquals(4, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case7() {
        int n = 4;
        assertEquals(6, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case8() {
        int n = 6;
        assertEquals(12, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case9() {
        int n = 7;
        assertEquals(24, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case10() {
        int n = 8;
        assertEquals(32, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case11() {
        int n = 9;
        assertEquals(48, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case12() {
        int n = 10;
        assertEquals(48, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case13() {
        int n = 999999;
        assertEquals(677298706, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case14() {
        int n = 999998;
        assertEquals(677298706, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case15() {
        int n = 999997;
        assertEquals(677298706, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case16() {
        int n = 999996;
        assertEquals(677298706, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case17() {
        int n = 999995;
        assertEquals(677298706, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case18() {
        int n = 4;
        assertEquals(6, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case19() {
        int n = 5;
        assertEquals(12, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case20() {
        int n = 3;
        assertEquals(4, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case21() {
        int n = 262143;
        assertEquals(439797190, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case22() {
        int n = 262145;
        assertEquals(686452591, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case23() {
        int n = 2049;
        assertEquals(259455152, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case24() {
        int n = 2047;
        assertEquals(571167225, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case25() {
        int n = 257;
        assertEquals(371222849, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case26() {
        int n = 16;
        assertEquals(240, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case27() {
        int n = 7;
        assertEquals(24, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case28() {
        int n = 512;
        assertEquals(165346969, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case29() {
        int n = 127;
        assertEquals(557168052, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case30() {
        int n = 16383;
        assertEquals(376000874, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case31() {
        int n = 9;
        assertEquals(48, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case32() {
        int n = 10;
        assertEquals(48, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case33() {
        int n = 8;
        assertEquals(32, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case34() {
        int n = 19682;
        assertEquals(107872579, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case35() {
        int n = 27;
        assertEquals(3840, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case36() {
        int n = 19684;
        assertEquals(230969533, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case37() {
        int n = 28;
        assertEquals(3840, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case38() {
        int n = 59050;
        assertEquals(861627307, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case39() {
        int n = 6562;
        assertEquals(170878868, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case40() {
        int n = 81;
        assertEquals(82575360, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case41() {
        int n = 2188;
        assertEquals(698159760, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case42() {
        int n = 82;
        assertEquals(82575360, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case43() {
        int n = 244;
        assertEquals(526938414, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case44() {
        int n = 25;
        assertEquals(2880, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case45() {
        int n = 26;
        assertEquals(2880, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case46() {
        int n = 24;
        assertEquals(1920, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case47() {
        int n = 15624;
        assertEquals(323319333, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case48() {
        int n = 390625;
        assertEquals(69849809, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case49() {
        int n = 626;
        assertEquals(670816995, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case50() {
        int n = 125;
        assertEquals(278584026, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case51() {
        int n = 78126;
        assertEquals(894717118, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case52() {
        int n = 15625;
        assertEquals(877205892, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case53() {
        int n = 124;
        assertEquals(708938023, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case54() {
        int n = 3125;
        assertEquals(907367095, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case55() {
        int n = 126;
        assertEquals(278584026, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case56() {
        int n = 390624;
        assertEquals(173199831, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case57() {
        int n = 49;
        assertEquals(442368, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case58() {
        int n = 50;
        assertEquals(442368, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case59() {
        int n = 48;
        assertEquals(294912, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case60() {
        int n = 343;
        assertEquals(115115442, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case61() {
        int n = 2401;
        assertEquals(245747346, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case62() {
        int n = 16806;
        assertEquals(45017159, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case63() {
        int n = 117648;
        assertEquals(915846756, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case64() {
        int n = 2400;
        assertEquals(796597881, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case65() {
        int n = 16807;
        assertEquals(654020595, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case66() {
        int n = 823542;
        assertEquals(769520726, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case67() {
        int n = 823543;
        assertEquals(165166539, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case68() {
        int n = 117650;
        assertEquals(68487875, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case69() {
        int n = 16808;
        assertEquals(654020595, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case70() {
        int n = 997;
        assertEquals(376725361, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case71() {
        int n = 998;
        assertEquals(376725361, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case72() {
        int n = 996;
        assertEquals(688362684, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case73() {
        int n = 994009;
        assertEquals(536153558, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case74() {
        int n = 994010;
        assertEquals(536153558, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case75() {
        int n = 994008;
        assertEquals(690769041, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case76() {
        int n = 1009;
        assertEquals(753450722, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case77() {
        int n = 1010;
        assertEquals(753450722, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case78() {
        int n = 1008;
        assertEquals(376725361, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case79() {
        int n = 1613;
        assertEquals(706533350, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case80() {
        int n = 1614;
        assertEquals(706533350, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case81() {
        int n = 1612;
        assertEquals(353266675, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case82() {
        int n = 99133;
        assertEquals(261848332, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case83() {
        int n = 99134;
        assertEquals(261848332, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case84() {
        int n = 99132;
        assertEquals(130924166, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case85() {
        int n = 77591;
        assertEquals(144806995, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case86() {
        int n = 77592;
        assertEquals(144806995, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case87() {
        int n = 77590;
        assertEquals(572403501, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case88() {
        int n = 41221;
        assertEquals(421018372, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case89() {
        int n = 41222;
        assertEquals(421018372, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case90() {
        int n = 41220;
        assertEquals(210509186, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case91() {
        int n = 18397;
        assertEquals(827768751, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case92() {
        int n = 18398;
        assertEquals(827768751, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case93() {
        int n = 18396;
        assertEquals(913884379, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case94() {
        int n = 130;
        assertEquals(636763488, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case95() {
        int n = 195;
        assertEquals(549685776, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case96() {
        int n = 172;
        assertEquals(517177684, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case97() {
        int n = 1060;
        assertEquals(571721834, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case98() {
        int n = 1690;
        assertEquals(308804503, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case99() {
        int n = 1551;
        assertEquals(73587175, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case100() {
        int n = 106318;
        assertEquals(895355768, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case101() {
        int n = 124846;
        assertEquals(890587993, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case102() {
        int n = 155100;
        assertEquals(875286419, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case103() {
        int n = 510510;
        assertEquals(119256192, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case104() {
        int n = 99999;
        assertEquals(456269783, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case105() {
        int n = 571787;
        assertEquals(281355041, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case106() {
        int n = 128;
        assertEquals(636763488, guessthenumbergame.possibleClues(n));
    }

    @Test
    public void case107() {
        int n = 141421;
        assertEquals(365627645, guessthenumbergame.possibleClues(n));
    }

}
