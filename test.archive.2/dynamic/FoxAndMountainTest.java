package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class FoxAndMountainTest {
    FoxAndMountain foxandmountain = new FoxAndMountain();

    @Test
    public void case1() {
        int n = 4;
        String history = "UUDD";
        assertEquals(1, foxandmountain.count(n, history));
    }

    @Test
    public void case2() {
        int n = 4;
        String history = "DUUD";
        assertEquals(0, foxandmountain.count(n, history));
    }

    @Test
    public void case3() {
        int n = 4;
        String history = "UU";
        assertEquals(1, foxandmountain.count(n, history));
    }

    @Test
    public void case4() {
        int n = 49;
        String history = "U";
        assertEquals(0, foxandmountain.count(n, history));
    }

    @Test
    public void case5() {
        int n = 20;
        String history = "UUUDUUU";
        assertEquals(990, foxandmountain.count(n, history));
    }

    @Test
    public void case6() {
        int n = 30;
        String history = "DUDUDUDUDUDUDUDU";
        assertEquals(3718, foxandmountain.count(n, history));
    }

    @Test
    public void case7() {
        int n = 50;
        String history = "U";
        assertEquals(946357703, foxandmountain.count(n, history));
    }

    @Test
    public void case8() {
        int n = 42;
        String history = "DDDDUUUUDDDDDUDDDDDDDUUDDUDDDD";
        assertEquals(0, foxandmountain.count(n, history));
    }

    @Test
    public void case9() {
        int n = 48;
        String history = "DDDDDDD";
        assertEquals(11210520, foxandmountain.count(n, history));
    }

    @Test
    public void case10() {
        int n = 11;
        String history = "D";
        assertEquals(0, foxandmountain.count(n, history));
    }

    @Test
    public void case11() {
        int n = 38;
        String history = "UUUUUUUUUDUUU";
        assertEquals(657800, foxandmountain.count(n, history));
    }

    @Test
    public void case12() {
        int n = 42;
        String history = "DDUUU";
        assertEquals(901366256, foxandmountain.count(n, history));
    }

    @Test
    public void case13() {
        int n = 9;
        String history = "D";
        assertEquals(0, foxandmountain.count(n, history));
    }

    @Test
    public void case14() {
        int n = 32;
        String history = "UDDDUU";
        assertEquals(11386309, foxandmountain.count(n, history));
    }

    @Test
    public void case15() {
        int n = 20;
        String history = "DDDDUDUD";
        assertEquals(715, foxandmountain.count(n, history));
    }

    @Test
    public void case16() {
        int n = 30;
        String history = "D";
        assertEquals(9694845, foxandmountain.count(n, history));
    }

    @Test
    public void case17() {
        int n = 6;
        String history = "U";
        assertEquals(5, foxandmountain.count(n, history));
    }

    @Test
    public void case18() {
        int n = 14;
        String history = "U";
        assertEquals(429, foxandmountain.count(n, history));
    }

    @Test
    public void case19() {
        int n = 17;
        String history = "UD";
        assertEquals(0, foxandmountain.count(n, history));
    }

    @Test
    public void case20() {
        int n = 50;
        String history = "DDDUDUDDDUUUUUUUDDUUUUDDU";
        assertEquals(230230, foxandmountain.count(n, history));
    }

    @Test
    public void case21() {
        int n = 2;
        String history = "D";
        assertEquals(1, foxandmountain.count(n, history));
    }

    @Test
    public void case22() {
        int n = 4;
        String history = "D";
        assertEquals(2, foxandmountain.count(n, history));
    }

    @Test
    public void case23() {
        int n = 44;
        String history = "DUDUD";
        assertEquals(632106360, foxandmountain.count(n, history));
    }

    @Test
    public void case24() {
        int n = 48;
        String history = "UDUD";
        assertEquals(922505942, foxandmountain.count(n, history));
    }

    @Test
    public void case25() {
        int n = 30;
        String history = "DUU";
        assertEquals(9678461, foxandmountain.count(n, history));
    }

    @Test
    public void case26() {
        int n = 32;
        String history = "DUD";
        assertEquals(35047098, foxandmountain.count(n, history));
    }

    @Test
    public void case27() {
        int n = 22;
        String history = "DUDDDDUDDUDUUDDD";
        assertEquals(1, foxandmountain.count(n, history));
    }

    @Test
    public void case28() {
        int n = 32;
        String history = "UUDDUDDDUUDDUUUDUUDDUDUDUUDUUUUU";
        assertEquals(0, foxandmountain.count(n, history));
    }

    @Test
    public void case29() {
        int n = 28;
        String history = "DDDDDDDDDDDDD";
        assertEquals(15, foxandmountain.count(n, history));
    }

    @Test
    public void case30() {
        int n = 50;
        String history = "DDDUDDDDDDDDD";
        assertEquals(414926201, foxandmountain.count(n, history));
    }

    @Test
    public void case31() {
        int n = 50;
        String history = "DDDDDDDUUUUDDDDDDDDDDDUDD";
        assertEquals(65780, foxandmountain.count(n, history));
    }

    @Test
    public void case32() {
        int n = 14;
        String history = "DDDDDDD";
        assertEquals(1, foxandmountain.count(n, history));
    }

    @Test
    public void case33() {
        int n = 40;
        String history = "DDUDUDUDDDD";
        assertEquals(86384698, foxandmountain.count(n, history));
    }

    @Test
    public void case34() {
        int n = 28;
        String history = "DDDDDDDDDDD";
        assertEquals(680, foxandmountain.count(n, history));
    }

    @Test
    public void case35() {
        int n = 40;
        String history = "DDDUDUUDUUUU";
        assertEquals(20026662, foxandmountain.count(n, history));
    }

    @Test
    public void case36() {
        int n = 49;
        String history = "DUDUDUUDDDDDUUDUDUDDDDDDDDDDUDDDDDDDDUDUDD";
        assertEquals(0, foxandmountain.count(n, history));
    }

    @Test
    public void case37() {
        int n = 22;
        String history = "DUDUDDUUDDD";
        assertEquals(495, foxandmountain.count(n, history));
    }

    @Test
    public void case38() {
        int n = 12;
        String history = "DDUUUUDUUD";
        assertEquals(0, foxandmountain.count(n, history));
    }

    @Test
    public void case39() {
        int n = 32;
        String history = "DDUDUDDUUDUDDUDUD";
        assertEquals(8007, foxandmountain.count(n, history));
    }

    @Test
    public void case40() {
        int n = 14;
        String history = "UDUUU";
        assertEquals(119, foxandmountain.count(n, history));
    }

    @Test
    public void case41() {
        int n = 28;
        String history = "UDDUUDDDUUDDDDDDUUDUU";
        assertEquals(0, foxandmountain.count(n, history));
    }

    @Test
    public void case42() {
        int n = 34;
        String history = "UUUUUUUUUUU";
        assertEquals(100947, foxandmountain.count(n, history));
    }

    @Test
    public void case43() {
        int n = 42;
        String history = "UUUUUUUUUUUUUUUU";
        assertEquals(65780, foxandmountain.count(n, history));
    }

    @Test
    public void case44() {
        int n = 21;
        String history = "DDDD";
        assertEquals(0, foxandmountain.count(n, history));
    }

    @Test
    public void case45() {
        int n = 20;
        String history = "U";
        assertEquals(16796, foxandmountain.count(n, history));
    }

    @Test
    public void case46() {
        int n = 48;
        String history = "UDDDDDDDDDDDDUDDDDUDUUU";
        assertEquals(14950, foxandmountain.count(n, history));
    }

    @Test
    public void case47() {
        int n = 3;
        String history = "D";
        assertEquals(0, foxandmountain.count(n, history));
    }

    @Test
    public void case48() {
        int n = 20;
        String history = "D";
        assertEquals(16796, foxandmountain.count(n, history));
    }

    @Test
    public void case49() {
        int n = 34;
        String history = "DDDUDDDDDDDDDDDUU";
        assertEquals(18, foxandmountain.count(n, history));
    }

    @Test
    public void case50() {
        int n = 30;
        String history = "U";
        assertEquals(9694845, foxandmountain.count(n, history));
    }

    @Test
    public void case51() {
        int n = 4;
        String history = "U";
        assertEquals(2, foxandmountain.count(n, history));
    }

    @Test
    public void case52() {
        int n = 32;
        String history = "UDDDDUUDUUD";
        assertEquals(319298, foxandmountain.count(n, history));
    }

    @Test
    public void case53() {
        int n = 14;
        String history = "UDDDDUD";
        assertEquals(28, foxandmountain.count(n, history));
    }

    @Test
    public void case54() {
        int n = 12;
        String history = "DDUUU";
        assertEquals(8, foxandmountain.count(n, history));
    }

    @Test
    public void case55() {
        int n = 26;
        String history = "DDDDDDDDDDDDDDUDDDDD";
        assertEquals(0, foxandmountain.count(n, history));
    }

    @Test
    public void case56() {
        int n = 42;
        String history = "UUUUUUUUUUUU";
        assertEquals(14307150, foxandmountain.count(n, history));
    }

    @Test
    public void case57() {
        int n = 30;
        String history = "UUUDUUUUUU";
        assertEquals(54263, foxandmountain.count(n, history));
    }

    @Test
    public void case58() {
        int n = 42;
        String history = "UUUUUU";
        assertEquals(417819120, foxandmountain.count(n, history));
    }

    @Test
    public void case59() {
        int n = 18;
        String history = "DUUD";
        assertEquals(3347, foxandmountain.count(n, history));
    }

    @Test
    public void case60() {
        int n = 46;
        String history = "DDDUDDDDDDDDDDDDD";
        assertEquals(2035800, foxandmountain.count(n, history));
    }

    @Test
    public void case61() {
        int n = 18;
        String history = "DDDDDDDD";
        assertEquals(10, foxandmountain.count(n, history));
    }

    @Test
    public void case62() {
        int n = 8;
        String history = "DUU";
        assertEquals(6, foxandmountain.count(n, history));
    }

    @Test
    public void case63() {
        int n = 48;
        String history = "DDUUDDDDDDDDDDDDDD";
        assertEquals(7888725, foxandmountain.count(n, history));
    }

    @Test
    public void case64() {
        int n = 15;
        String history = "DUUDDDD";
        assertEquals(0, foxandmountain.count(n, history));
    }

    @Test
    public void case65() {
        int n = 40;
        String history = "DDDDU";
        assertEquals(409169930, foxandmountain.count(n, history));
    }

    @Test
    public void case66() {
        int n = 2;
        String history = "U";
        assertEquals(1, foxandmountain.count(n, history));
    }

    @Test
    public void case67() {
        int n = 43;
        String history = "DUUUUDUUUDDUDUUUUDUD";
        assertEquals(0, foxandmountain.count(n, history));
    }

    @Test
    public void case68() {
        int n = 4;
        String history = "UU";
        assertEquals(1, foxandmountain.count(n, history));
    }

    @Test
    public void case69() {
        int n = 4;
        String history = "D";
        assertEquals(2, foxandmountain.count(n, history));
    }

    @Test
    public void case70() {
        int n = 4;
        String history = "U";
        assertEquals(2, foxandmountain.count(n, history));
    }

    @Test
    public void case71() {
        int n = 38;
        String history = "DDUDUUDUDU";
        assertEquals(51586010, foxandmountain.count(n, history));
    }

    @Test
    public void case72() {
        int n = 50;
        String history = "DDUDDDDDDDDD";
        assertEquals(84324081, foxandmountain.count(n, history));
    }

    @Test
    public void case73() {
        int n = 42;
        String history = "DDDUUDDDDDUDDUDDUDDD";
        assertEquals(100947, foxandmountain.count(n, history));
    }

    @Test
    public void case74() {
        int n = 36;
        String history = "UUUUUUUUUDUUDU";
        assertEquals(100947, foxandmountain.count(n, history));
    }

    @Test
    public void case75() {
        int n = 28;
        String history = "DUUDDDUDDDUDD";
        assertEquals(4368, foxandmountain.count(n, history));
    }

    @Test
    public void case76() {
        int n = 28;
        String history = "DUDDDUDDDUDDDD";
        assertEquals(455, foxandmountain.count(n, history));
    }

    @Test
    public void case77() {
        int n = 48;
        String history = "UUU";
        assertEquals(711407953, foxandmountain.count(n, history));
    }

    @Test
    public void case78() {
        int n = 12;
        String history = "UUU";
        assertEquals(81, foxandmountain.count(n, history));
    }

    @Test
    public void case79() {
        int n = 18;
        String history = "UUU";
        assertEquals(4027, foxandmountain.count(n, history));
    }

    @Test
    public void case80() {
        int n = 26;
        String history = "UDU";
        assertEquals(727389, foxandmountain.count(n, history));
    }

    @Test
    public void case81() {
        int n = 20;
        String history = "DD";
        assertEquals(16795, foxandmountain.count(n, history));
    }

    @Test
    public void case82() {
        int n = 40;
        String history = "DDUDDDDDDDUUDDDDDDDDDDUDDDDDDD";
        assertEquals(0, foxandmountain.count(n, history));
    }

    @Test
    public void case83() {
        int n = 12;
        String history = "D";
        assertEquals(132, foxandmountain.count(n, history));
    }

    @Test
    public void case84() {
        int n = 32;
        String history = "DDUD";
        assertEquals(32676651, foxandmountain.count(n, history));
    }

    @Test
    public void case85() {
        int n = 6;
        String history = "U";
        assertEquals(5, foxandmountain.count(n, history));
    }

    @Test
    public void case86() {
        int n = 12;
        String history = "DD";
        assertEquals(131, foxandmountain.count(n, history));
    }

    @Test
    public void case87() {
        int n = 20;
        String history = "UDDDUDUDUD";
        assertEquals(330, foxandmountain.count(n, history));
    }

    @Test
    public void case88() {
        int n = 20;
        String history = "UDUUDUUU";
        assertEquals(715, foxandmountain.count(n, history));
    }

    @Test
    public void case89() {
        int n = 26;
        String history = "DUUDDUUUUU";
        assertEquals(6188, foxandmountain.count(n, history));
    }

    @Test
    public void case90() {
        int n = 38;
        String history = "UUUDUUU";
        assertEquals(322543285, foxandmountain.count(n, history));
    }

    @Test
    public void case91() {
        int n = 8;
        String history = "U";
        assertEquals(14, foxandmountain.count(n, history));
    }

    @Test
    public void case92() {
        int n = 8;
        String history = "DDDD";
        assertEquals(1, foxandmountain.count(n, history));
    }

    @Test
    public void case93() {
        int n = 40;
        String history = "DUUDDUDDUUUDDDDDDUUDDUUDUUDDDDDUD";
        assertEquals(1, foxandmountain.count(n, history));
    }

    @Test
    public void case94() {
        int n = 25;
        String history = "DDDUUDDDDDDU";
        assertEquals(0, foxandmountain.count(n, history));
    }

    @Test
    public void case95() {
        int n = 38;
        String history = "DDDUDUDDDDDDDDDUD";
        assertEquals(26334, foxandmountain.count(n, history));
    }

    @Test
    public void case96() {
        int n = 36;
        String history = "DDDDDDDDDDUDDDDDDDDD";
        assertEquals(0, foxandmountain.count(n, history));
    }

    @Test
    public void case97() {
        int n = 8;
        String history = "DU";
        assertEquals(13, foxandmountain.count(n, history));
    }

    @Test
    public void case98() {
        int n = 36;
        String history = "UDUUDDUDDDDDDD";
        assertEquals(490314, foxandmountain.count(n, history));
    }

    @Test
    public void case99() {
        int n = 38;
        String history = "DUDDDUUDDUDUUDDDD";
        assertEquals(319770, foxandmountain.count(n, history));
    }

    @Test
    public void case100() {
        int n = 14;
        String history = "DDDUDDDDDDDDDD";
        assertEquals(0, foxandmountain.count(n, history));
    }

    @Test
    public void case101() {
        int n = 46;
        String history = "UUUUUUU";
        assertEquals(388724757, foxandmountain.count(n, history));
    }

    @Test
    public void case102() {
        int n = 24;
        String history = "DUDUUDD";
        assertEquals(41036, foxandmountain.count(n, history));
    }

    @Test
    public void case103() {
        int n = 32;
        String history = "UD";
        assertEquals(35357670, foxandmountain.count(n, history));
    }

    @Test
    public void case104() {
        int n = 26;
        String history = "DDDDDDDDDDDD";
        assertEquals(14, foxandmountain.count(n, history));
    }

    @Test
    public void case105() {
        int n = 50;
        String history = "UD";
        assertEquals(946357703, foxandmountain.count(n, history));
    }

    @Test
    public void case106() {
        int n = 5;
        String history = "U";
        assertEquals(0, foxandmountain.count(n, history));
    }

    @Test
    public void case107() {
        int n = 2;
        String history = "D";
        assertEquals(1, foxandmountain.count(n, history));
    }

    @Test
    public void case108() {
        int n = 10;
        String history = "DD";
        assertEquals(41, foxandmountain.count(n, history));
    }

    @Test
    public void case109() {
        int n = 28;
        String history = "U";
        assertEquals(2674440, foxandmountain.count(n, history));
    }

    @Test
    public void case110() {
        int n = 48;
        String history = "UDDUDDDDUUDUDDDUUUDUDUUDDUDDUUUDDDUD";
        assertEquals(286, foxandmountain.count(n, history));
    }

    @Test
    public void case111() {
        int n = 38;
        String history = "DDDDDUUUUUDDUUUD";
        assertEquals(100947, foxandmountain.count(n, history));
    }

    @Test
    public void case112() {
        int n = 22;
        String history = "UUUUU";
        assertEquals(12310, foxandmountain.count(n, history));
    }

    @Test
    public void case113() {
        int n = 38;
        String history = "UDDUUD";
        assertEquals(797662006, foxandmountain.count(n, history));
    }

    @Test
    public void case114() {
        int n = 20;
        String history = "UDDDDDDD";
        assertEquals(286, foxandmountain.count(n, history));
    }

    @Test
    public void case115() {
        int n = 50;
        String history = "UDUUUUUUUUD";
        assertEquals(820800668, foxandmountain.count(n, history));
    }

    @Test
    public void case116() {
        int n = 44;
        String history = "DUUU";
        assertEquals(309319711, foxandmountain.count(n, history));
    }

    @Test
    public void case117() {
        int n = 15;
        String history = "DDDUDDD";
        assertEquals(0, foxandmountain.count(n, history));
    }

    @Test
    public void case118() {
        int n = 13;
        String history = "D";
        assertEquals(0, foxandmountain.count(n, history));
    }

    @Test
    public void case119() {
        int n = 36;
        String history = "DUDDUDUUDDDUDDDDUDUDDUUDDDDDDDD";
        assertEquals(0, foxandmountain.count(n, history));
    }

    @Test
    public void case120() {
        int n = 30;
        String history = "U";
        assertEquals(9694845, foxandmountain.count(n, history));
    }

    @Test
    public void case121() {
        int n = 2;
        String history = "D";
        assertEquals(1, foxandmountain.count(n, history));
    }

    @Test
    public void case122() {
        int n = 14;
        String history = "UUUD";
        assertEquals(302, foxandmountain.count(n, history));
    }

    @Test
    public void case123() {
        int n = 44;
        String history = "DDDDDDDUDDDDDUDUDUDDDDDDUUDDDUDUDDDDUUU";
        assertEquals(0, foxandmountain.count(n, history));
    }

    @Test
    public void case124() {
        int n = 22;
        String history = "DDU";
        assertEquals(57762, foxandmountain.count(n, history));
    }

    @Test
    public void case125() {
        int n = 44;
        String history = "DUDUDUUUUUDDDDDDDUDUDDDDDD";
        assertEquals(11628, foxandmountain.count(n, history));
    }

    @Test
    public void case126() {
        int n = 10;
        String history = "U";
        assertEquals(42, foxandmountain.count(n, history));
    }

    @Test
    public void case127() {
        int n = 24;
        String history = "DDDUUDDD";
        assertEquals(12087, foxandmountain.count(n, history));
    }

    @Test
    public void case128() {
        int n = 38;
        String history = "DDUDUDDUDDUUDDDDDDUUDDDDUD";
        assertEquals(13, foxandmountain.count(n, history));
    }

    @Test
    public void case129() {
        int n = 28;
        String history = "UUUU";
        assertEquals(1693576, foxandmountain.count(n, history));
    }

    @Test
    public void case130() {
        int n = 16;
        String history = "DDDDDU";
        assertEquals(55, foxandmountain.count(n, history));
    }

    @Test
    public void case131() {
        int n = 35;
        String history = "UUUUUUUUUDUUUUU";
        assertEquals(0, foxandmountain.count(n, history));
    }

    @Test
    public void case132() {
        int n = 14;
        String history = "DDD";
        assertEquals(302, foxandmountain.count(n, history));
    }

    @Test
    public void case133() {
        int n = 44;
        String history = "UUUUDUUUUUDUUU";
        assertEquals(44299015, foxandmountain.count(n, history));
    }

    @Test
    public void case134() {
        int n = 17;
        String history = "DDDDDDDD";
        assertEquals(0, foxandmountain.count(n, history));
    }

    @Test
    public void case135() {
        int n = 50;
        String history = "DDDDDDDDUDDDDDDDDDD";
        assertEquals(3365856, foxandmountain.count(n, history));
    }

    @Test
    public void case136() {
        int n = 4;
        String history = "UU";
        assertEquals(1, foxandmountain.count(n, history));
    }

    @Test
    public void case137() {
        int n = 16;
        String history = "DDUDUUDUDDUDUDD";
        assertEquals(0, foxandmountain.count(n, history));
    }

    @Test
    public void case138() {
        int n = 50;
        String history = "DDUUUDUDUDUDUDUD";
        assertEquals(247555533, foxandmountain.count(n, history));
    }

    @Test
    public void case139() {
        int n = 50;
        String history = "UUUUDDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDUDDDDUDUD";
        assertEquals(1, foxandmountain.count(n, history));
    }

    @Test
    public void case140() {
        int n = 48;
        String history = "UUDUUDDDU";
        assertEquals(549009398, foxandmountain.count(n, history));
    }

    @Test
    public void case141() {
        int n = 6;
        String history = "D";
        assertEquals(5, foxandmountain.count(n, history));
    }

    @Test
    public void case142() {
        int n = 48;
        String history = "U";
        assertEquals(904135723, foxandmountain.count(n, history));
    }

    @Test
    public void case143() {
        int n = 44;
        String history = "UUDUUDUDU";
        assertEquals(168754967, foxandmountain.count(n, history));
    }

    @Test
    public void case144() {
        int n = 50;
        String history = "UUDDDDUUDUUUU";
        assertEquals(460334997, foxandmountain.count(n, history));
    }

    @Test
    public void case145() {
        int n = 2;
        String history = "UD";
        assertEquals(1, foxandmountain.count(n, history));
    }

}
