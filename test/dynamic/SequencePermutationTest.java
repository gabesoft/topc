package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class SequencePermutationTest {
    SequencePermutation sequencepermutation = new SequencePermutation();

    @Test
    public void case1() {
        int N = 3;
        int M = 1;
        assertEquals(2, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case2() {
        int N = 3;
        int M = 0;
        assertEquals(1, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case3() {
        int N = 3;
        int M = 3;
        assertEquals(3, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case4() {
        int N = 33;
        int M = 1803;
        assertEquals(620284697, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case5() {
        int N = 2000;
        int M = 2000;
        assertEquals(624672242, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case6() {
        int N = 2000;
        int M = 1999;
        assertEquals(736442792, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case7() {
        int N = 1359;
        int M = 493;
        assertEquals(983021627, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case8() {
        int N = 1060;
        int M = 1927;
        assertEquals(584847094, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case9() {
        int N = 42;
        int M = 430;
        assertEquals(342421067, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case10() {
        int N = 1807;
        int M = 1803;
        assertEquals(55323580, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case11() {
        int N = 960;
        int M = 43;
        assertEquals(420276508, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case12() {
        int N = 1385;
        int M = 325;
        assertEquals(459824111, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case13() {
        int N = 1803;
        int M = 1874;
        assertEquals(318524952, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case14() {
        int N = 360;
        int M = 328;
        assertEquals(81830564, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case15() {
        int N = 330;
        int M = 1896;
        assertEquals(753409667, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case16() {
        int N = 1046;
        int M = 1751;
        assertEquals(424847468, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case17() {
        int N = 1805;
        int M = 652;
        assertEquals(345904607, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case18() {
        int N = 1661;
        int M = 13;
        assertEquals(958945511, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case19() {
        int N = 1103;
        int M = 379;
        assertEquals(431103492, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case20() {
        int N = 159;
        int M = 757;
        assertEquals(391130813, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case21() {
        int N = 900;
        int M = 620;
        assertEquals(117542688, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case22() {
        int N = 716;
        int M = 676;
        assertEquals(143501420, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case23() {
        int N = 231;
        int M = 966;
        assertEquals(826739160, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case24() {
        int N = 1040;
        int M = 830;
        assertEquals(714238476, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case25() {
        int N = 519;
        int M = 150;
        assertEquals(484884543, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case26() {
        int N = 91;
        int M = 1556;
        assertEquals(680962793, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case27() {
        int N = 579;
        int M = 1501;
        assertEquals(159401917, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case28() {
        int N = 1459;
        int M = 492;
        assertEquals(528061050, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case29() {
        int N = 1882;
        int M = 1229;
        assertEquals(819686086, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case30() {
        int N = 1360;
        int M = 1238;
        assertEquals(974141345, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case31() {
        int N = 711;
        int M = 1530;
        assertEquals(554355658, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case32() {
        int N = 397;
        int M = 841;
        assertEquals(600079463, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case33() {
        int N = 313;
        int M = 997;
        assertEquals(247432456, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case34() {
        int N = 1307;
        int M = 726;
        assertEquals(646161865, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case35() {
        int N = 1445;
        int M = 83;
        assertEquals(479813196, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case36() {
        int N = 537;
        int M = 612;
        assertEquals(900541535, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case37() {
        int N = 4;
        int M = 0;
        assertEquals(1, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case38() {
        int N = 4;
        int M = 1;
        assertEquals(3, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case39() {
        int N = 4;
        int M = 8;
        assertEquals(12, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case40() {
        int N = 4;
        int M = 37;
        assertEquals(12, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case41() {
        int N = 4;
        int M = 180;
        assertEquals(12, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case42() {
        int N = 4;
        int M = 603;
        assertEquals(12, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case43() {
        int N = 4;
        int M = 1955;
        assertEquals(12, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case44() {
        int N = 4;
        int M = 2000;
        assertEquals(12, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case45() {
        int N = 9;
        int M = 0;
        assertEquals(1, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case46() {
        int N = 9;
        int M = 1;
        assertEquals(8, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case47() {
        int N = 9;
        int M = 8;
        assertEquals(5157, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case48() {
        int N = 9;
        int M = 37;
        assertEquals(181440, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case49() {
        int N = 9;
        int M = 180;
        assertEquals(181440, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case50() {
        int N = 9;
        int M = 603;
        assertEquals(181440, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case51() {
        int N = 9;
        int M = 1955;
        assertEquals(181440, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case52() {
        int N = 9;
        int M = 2000;
        assertEquals(181440, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case53() {
        int N = 37;
        int M = 0;
        assertEquals(1, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case54() {
        int N = 37;
        int M = 1;
        assertEquals(36, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case55() {
        int N = 37;
        int M = 8;
        assertEquals(144259152, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case56() {
        int N = 37;
        int M = 37;
        assertEquals(449431890, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case57() {
        int N = 37;
        int M = 180;
        assertEquals(604205239, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case58() {
        int N = 37;
        int M = 603;
        assertEquals(553768892, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case59() {
        int N = 37;
        int M = 1955;
        assertEquals(858671960, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case60() {
        int N = 37;
        int M = 2000;
        assertEquals(858671960, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case61() {
        int N = 154;
        int M = 0;
        assertEquals(1, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case62() {
        int N = 154;
        int M = 1;
        assertEquals(153, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case63() {
        int N = 154;
        int M = 8;
        assertEquals(291852744, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case64() {
        int N = 154;
        int M = 37;
        assertEquals(92655949, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case65() {
        int N = 154;
        int M = 180;
        assertEquals(625619368, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case66() {
        int N = 154;
        int M = 603;
        assertEquals(988766192, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case67() {
        int N = 154;
        int M = 1955;
        assertEquals(718817285, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case68() {
        int N = 154;
        int M = 2000;
        assertEquals(52122500, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case69() {
        int N = 701;
        int M = 0;
        assertEquals(1, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case70() {
        int N = 701;
        int M = 1;
        assertEquals(700, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case71() {
        int N = 701;
        int M = 8;
        assertEquals(133969418, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case72() {
        int N = 701;
        int M = 37;
        assertEquals(215816380, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case73() {
        int N = 701;
        int M = 180;
        assertEquals(879039217, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case74() {
        int N = 701;
        int M = 603;
        assertEquals(399330037, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case75() {
        int N = 701;
        int M = 1955;
        assertEquals(764217826, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case76() {
        int N = 701;
        int M = 2000;
        assertEquals(994100762, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case77() {
        int N = 1902;
        int M = 0;
        assertEquals(1, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case78() {
        int N = 1902;
        int M = 1;
        assertEquals(1901, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case79() {
        int N = 1902;
        int M = 8;
        assertEquals(162757453, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case80() {
        int N = 1902;
        int M = 37;
        assertEquals(870047029, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case81() {
        int N = 1902;
        int M = 180;
        assertEquals(578532001, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case82() {
        int N = 1902;
        int M = 603;
        assertEquals(918783553, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case83() {
        int N = 1902;
        int M = 1955;
        assertEquals(796444949, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case84() {
        int N = 1902;
        int M = 2000;
        assertEquals(14589797, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case85() {
        int N = 2000;
        int M = 0;
        assertEquals(1, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case86() {
        int N = 2000;
        int M = 1;
        assertEquals(1999, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case87() {
        int N = 2000;
        int M = 8;
        assertEquals(285254861, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case88() {
        int N = 2000;
        int M = 37;
        assertEquals(835883399, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case89() {
        int N = 2000;
        int M = 180;
        assertEquals(779254402, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case90() {
        int N = 2000;
        int M = 603;
        assertEquals(342371180, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case91() {
        int N = 2000;
        int M = 1955;
        assertEquals(93454284, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case92() {
        int N = 2000;
        int M = 2000;
        assertEquals(624672242, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case93() {
        int N = 5;
        int M = 0;
        assertEquals(1, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case94() {
        int N = 5;
        int M = 1;
        assertEquals(4, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case95() {
        int N = 5;
        int M = 9;
        assertEquals(60, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case96() {
        int N = 5;
        int M = 10;
        assertEquals(60, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case97() {
        int N = 5;
        int M = 4;
        assertEquals(30, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case98() {
        int N = 5;
        int M = 5;
        assertEquals(41, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case99() {
        int N = 7;
        int M = 0;
        assertEquals(1, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case100() {
        int N = 7;
        int M = 1;
        assertEquals(6, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case101() {
        int N = 7;
        int M = 20;
        assertEquals(2520, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case102() {
        int N = 7;
        int M = 21;
        assertEquals(2520, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case103() {
        int N = 7;
        int M = 10;
        assertEquals(1406, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case104() {
        int N = 7;
        int M = 11;
        assertEquals(1687, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case105() {
        int N = 10;
        int M = 0;
        assertEquals(1, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case106() {
        int N = 10;
        int M = 1;
        assertEquals(9, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case107() {
        int N = 10;
        int M = 44;
        assertEquals(1814400, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case108() {
        int N = 10;
        int M = 45;
        assertEquals(1814400, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case109() {
        int N = 10;
        int M = 22;
        assertEquals(970337, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case110() {
        int N = 10;
        int M = 23;
        assertEquals(1094812, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case111() {
        int N = 20;
        int M = 0;
        assertEquals(1, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case112() {
        int N = 20;
        int M = 1;
        assertEquals(19, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case113() {
        int N = 20;
        int M = 189;
        assertEquals(140261063, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case114() {
        int N = 20;
        int M = 190;
        assertEquals(140261063, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case115() {
        int N = 20;
        int M = 94;
        assertEquals(570130536, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case116() {
        int N = 20;
        int M = 95;
        assertEquals(848084299, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case117() {
        int N = 40;
        int M = 0;
        assertEquals(1, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case118() {
        int N = 40;
        int M = 1;
        assertEquals(39, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case119() {
        int N = 40;
        int M = 779;
        assertEquals(73330682, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case120() {
        int N = 40;
        int M = 780;
        assertEquals(73330682, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case121() {
        int N = 40;
        int M = 389;
        assertEquals(36665341, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case122() {
        int N = 40;
        int M = 390;
        assertEquals(458379451, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case123() {
        int N = 50;
        int M = 0;
        assertEquals(1, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case124() {
        int N = 50;
        int M = 1;
        assertEquals(49, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case125() {
        int N = 50;
        int M = 1224;
        assertEquals(874846958, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case126() {
        int N = 50;
        int M = 1225;
        assertEquals(874846958, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case127() {
        int N = 50;
        int M = 612;
        assertEquals(627233708, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case128() {
        int N = 50;
        int M = 613;
        assertEquals(133753696, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case129() {
        int N = 55;
        int M = 0;
        assertEquals(1, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case130() {
        int N = 55;
        int M = 1;
        assertEquals(54, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case131() {
        int N = 55;
        int M = 1484;
        assertEquals(128230434, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case132() {
        int N = 55;
        int M = 1485;
        assertEquals(128230434, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case133() {
        int N = 55;
        int M = 742;
        assertEquals(659991788, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case134() {
        int N = 55;
        int M = 743;
        assertEquals(561680918, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case135() {
        int N = 60;
        int M = 0;
        assertEquals(1, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case136() {
        int N = 60;
        int M = 1;
        assertEquals(59, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case137() {
        int N = 60;
        int M = 1769;
        assertEquals(730386355, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case138() {
        int N = 60;
        int M = 1770;
        assertEquals(730386355, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case139() {
        int N = 60;
        int M = 884;
        assertEquals(865193182, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case140() {
        int N = 60;
        int M = 885;
        assertEquals(69286002, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case141() {
        int N = 61;
        int M = 0;
        assertEquals(1, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case142() {
        int N = 61;
        int M = 1;
        assertEquals(60, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case143() {
        int N = 61;
        int M = 1829;
        assertEquals(553567259, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case144() {
        int N = 61;
        int M = 1830;
        assertEquals(553567259, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case145() {
        int N = 61;
        int M = 914;
        assertEquals(776783634, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case146() {
        int N = 61;
        int M = 915;
        assertEquals(778468928, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case147() {
        int N = 62;
        int M = 0;
        assertEquals(1, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case148() {
        int N = 62;
        int M = 1;
        assertEquals(61, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case149() {
        int N = 62;
        int M = 1890;
        assertEquals(321169752, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case150() {
        int N = 62;
        int M = 1891;
        assertEquals(321169752, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case151() {
        int N = 62;
        int M = 945;
        assertEquals(512633378, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case152() {
        int N = 62;
        int M = 946;
        assertEquals(607582062, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case153() {
        int N = 63;
        int M = 0;
        assertEquals(1, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case154() {
        int N = 63;
        int M = 1;
        assertEquals(62, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case155() {
        int N = 63;
        int M = 1952;
        assertEquals(233694196, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case156() {
        int N = 63;
        int M = 1953;
        assertEquals(233694196, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case157() {
        int N = 63;
        int M = 976;
        assertEquals(781725991, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case158() {
        int N = 63;
        int M = 977;
        assertEquals(981645272, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case159() {
        int N = 64;
        int M = 0;
        assertEquals(1, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case160() {
        int N = 64;
        int M = 1;
        assertEquals(63, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case161() {
        int N = 64;
        int M = 1999;
        assertEquals(328984443, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case162() {
        int N = 64;
        int M = 2000;
        assertEquals(331097931, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case163() {
        int N = 64;
        int M = 999;
        assertEquals(767887354, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case164() {
        int N = 64;
        int M = 1000;
        assertEquals(97529581, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case165() {
        int N = 65;
        int M = 0;
        assertEquals(1, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case166() {
        int N = 65;
        int M = 1;
        assertEquals(64, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case167() {
        int N = 65;
        int M = 1999;
        assertEquals(594180458, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case168() {
        int N = 65;
        int M = 2000;
        assertEquals(272590452, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case169() {
        int N = 65;
        int M = 999;
        assertEquals(106840998, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case170() {
        int N = 65;
        int M = 1000;
        assertEquals(83957813, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case171() {
        int N = 63;
        int M = 1951;
        assertEquals(233694195, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case172() {
        int N = 63;
        int M = 1950;
        assertEquals(233694134, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case173() {
        int N = 2;
        int M = 0;
        assertEquals(1, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case174() {
        int N = 2;
        int M = 1;
        assertEquals(1, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case175() {
        int N = 2;
        int M = 2;
        assertEquals(1, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case176() {
        int N = 2;
        int M = 3;
        assertEquals(1, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case177() {
        int N = 2;
        int M = 2000;
        assertEquals(1, sequencepermutation.determineConfigurations(N, M));
    }

    @Test
    public void case178() {
        int N = 2;
        int M = 1999;
        assertEquals(1, sequencepermutation.determineConfigurations(N, M));
    }

}
