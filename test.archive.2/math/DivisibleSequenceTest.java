package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class DivisibleSequenceTest {
    DivisibleSequence divisiblesequence = new DivisibleSequence();

    @Test
    public void case1() {
        int N = 5;
        int H = 3;
        assertEquals(3, divisiblesequence.count(N, H));
    }

    @Test
    public void case2() {
        int N = 6;
        int H = 3;
        assertEquals(9, divisiblesequence.count(N, H));
    }

    @Test
    public void case3() {
        int N = 10;
        int H = 2;
        assertEquals(4, divisiblesequence.count(N, H));
    }

    @Test
    public void case4() {
        int N = 1;
        int H = 10000;
        assertEquals(1, divisiblesequence.count(N, H));
    }

    @Test
    public void case5() {
        int N = 30;
        int H = 4;
        assertEquals(64, divisiblesequence.count(N, H));
    }

    @Test
    public void case6() {
        int N = 25883;
        int H = 100000;
        assertEquals(991000009, divisiblesequence.count(N, H));
    }

    @Test
    public void case7() {
        int N = 647407371;
        int H = 1;
        assertEquals(1, divisiblesequence.count(N, H));
    }

    @Test
    public void case8() {
        int N = 110174988;
        int H = 1;
        assertEquals(1, divisiblesequence.count(N, H));
    }

    @Test
    public void case9() {
        int N = 4491883;
        int H = 1;
        assertEquals(1, divisiblesequence.count(N, H));
    }

    @Test
    public void case10() {
        int N = 1000000000;
        int H = 1000000000;
        assertEquals(1, divisiblesequence.count(N, H));
    }

    @Test
    public void case11() {
        int N = 128;
        int H = 5;
        assertEquals(330, divisiblesequence.count(N, H));
    }

    @Test
    public void case12() {
        int N = 1024;
        int H = 6;
        assertEquals(3003, divisiblesequence.count(N, H));
    }

    @Test
    public void case13() {
        int N = 8192;
        int H = 9;
        assertEquals(203490, divisiblesequence.count(N, H));
    }

    @Test
    public void case14() {
        int N = 65536;
        int H = 10;
        assertEquals(2042975, divisiblesequence.count(N, H));
    }

    @Test
    public void case15() {
        int N = 524288;
        int H = 5;
        assertEquals(8855, divisiblesequence.count(N, H));
    }

    @Test
    public void case16() {
        int N = 4194304;
        int H = 3;
        assertEquals(276, divisiblesequence.count(N, H));
    }

    @Test
    public void case17() {
        int N = 33554432;
        int H = 5;
        assertEquals(23751, divisiblesequence.count(N, H));
    }

    @Test
    public void case18() {
        int N = 268435456;
        int H = 10;
        assertEquals(124403620, divisiblesequence.count(N, H));
    }

    @Test
    public void case19() {
        int N = 607227212;
        int H = 1000000000;
        assertEquals(2916, divisiblesequence.count(N, H));
    }

    @Test
    public void case20() {
        int N = 570657782;
        int H = 1000000000;
        assertEquals(999999280, divisiblesequence.count(N, H));
    }

    @Test
    public void case21() {
        int N = 31720467;
        int H = 1000000000;
        assertEquals(81, divisiblesequence.count(N, H));
    }

    @Test
    public void case22() {
        int N = 616277956;
        int H = 1000000000;
        assertEquals(999973765, divisiblesequence.count(N, H));
    }

    @Test
    public void case23() {
        int N = 392090393;
        int H = 1000000000;
        assertEquals(999999280, divisiblesequence.count(N, H));
    }

    @Test
    public void case24() {
        int N = 947786970;
        int H = 1000000000;
        assertEquals(999940960, divisiblesequence.count(N, H));
    }

    @Test
    public void case25() {
        int N = 889463010;
        int H = 1000000000;
        assertEquals(6561, divisiblesequence.count(N, H));
    }

    @Test
    public void case26() {
        int N = 656296092;
        int H = 1000000000;
        assertEquals(999988345, divisiblesequence.count(N, H));
    }

    @Test
    public void case27() {
        int N = 724618275;
        int H = 1000000000;
        assertEquals(999973765, divisiblesequence.count(N, H));
    }

    @Test
    public void case28() {
        int N = 74424508;
        int H = 1000000000;
        assertEquals(2916, divisiblesequence.count(N, H));
    }

    @Test
    public void case29() {
        int N = 223092870;
        int H = 1000000000;
        assertEquals(612579520, divisiblesequence.count(N, H));
    }

    @Test
    public void case30() {
        int N = 892371480;
        int H = 1000000000;
        assertEquals(384075472, divisiblesequence.count(N, H));
    }

    @Test
    public void case31() {
        int N = 528377850;
        int H = 1000000000;
        assertEquals(392922434, divisiblesequence.count(N, H));
    }

    @Test
    public void case32() {
        int N = 618072047;
        int H = 241039583;
        assertEquals(241039583, divisiblesequence.count(N, H));
    }

    @Test
    public void case33() {
        int N = 417666895;
        int H = 31398275;
        assertEquals(664102966, divisiblesequence.count(N, H));
    }

    @Test
    public void case34() {
        int N = 913560619;
        int H = 607018036;
        assertEquals(607018036, divisiblesequence.count(N, H));
    }

    @Test
    public void case35() {
        int N = 575330186;
        int H = 810777402;
        assertEquals(677629703, divisiblesequence.count(N, H));
    }

    @Test
    public void case36() {
        int N = 645533998;
        int H = 833377033;
        assertEquals(881227641, divisiblesequence.count(N, H));
    }

    @Test
    public void case37() {
        int N = 358206437;
        int H = 268814082;
        assertEquals(268814082, divisiblesequence.count(N, H));
    }

    @Test
    public void case38() {
        int N = 508497218;
        int H = 186401907;
        assertEquals(620525619, divisiblesequence.count(N, H));
    }

    @Test
    public void case39() {
        int N = 736093901;
        int H = 617502990;
        assertEquals(617502990, divisiblesequence.count(N, H));
    }

    @Test
    public void case40() {
        int N = 280465279;
        int H = 469507421;
        assertEquals(469507421, divisiblesequence.count(N, H));
    }

    @Test
    public void case41() {
        int N = 871828149;
        int H = 829804015;
        assertEquals(112947952, divisiblesequence.count(N, H));
    }

    @Test
    public void case42() {
        int N = 847424561;
        int H = 28145410;
        assertEquals(28145410, divisiblesequence.count(N, H));
    }

    @Test
    public void case43() {
        int N = 861162853;
        int H = 898614095;
        assertEquals(898614095, divisiblesequence.count(N, H));
    }

    @Test
    public void case44() {
        int N = 388916998;
        int H = 598567553;
        assertEquals(279859801, divisiblesequence.count(N, H));
    }

    @Test
    public void case45() {
        int N = 891660971;
        int H = 260561351;
        assertEquals(260561351, divisiblesequence.count(N, H));
    }

    @Test
    public void case46() {
        int N = 993849463;
        int H = 812677863;
        assertEquals(812677863, divisiblesequence.count(N, H));
    }

    @Test
    public void case47() {
        int N = 262777433;
        int H = 770756043;
        assertEquals(770756043, divisiblesequence.count(N, H));
    }

    @Test
    public void case48() {
        int N = 779145303;
        int H = 153589475;
        assertEquals(618468091, divisiblesequence.count(N, H));
    }

    @Test
    public void case49() {
        int N = 939819766;
        int H = 183286708;
        assertEquals(27131111, divisiblesequence.count(N, H));
    }

    @Test
    public void case50() {
        int N = 536091299;
        int H = 58740986;
        assertEquals(58740986, divisiblesequence.count(N, H));
    }

    @Test
    public void case51() {
        int N = 766216357;
        int H = 596876469;
        assertEquals(596876469, divisiblesequence.count(N, H));
    }

    @Test
    public void case52() {
        int N = 205713660;
        int H = 645989977;
        assertEquals(738543667, divisiblesequence.count(N, H));
    }

    @Test
    public void case53() {
        int N = 592849636;
        int H = 139499967;
        assertEquals(69856908, divisiblesequence.count(N, H));
    }

    @Test
    public void case54() {
        int N = 934135810;
        int H = 442473862;
        assertEquals(975777879, divisiblesequence.count(N, H));
    }

    @Test
    public void case55() {
        int N = 523164325;
        int H = 581634158;
        assertEquals(327411676, divisiblesequence.count(N, H));
    }

    @Test
    public void case56() {
        int N = 924276981;
        int H = 101871547;
        assertEquals(343340284, divisiblesequence.count(N, H));
    }

    @Test
    public void case57() {
        int N = 218476551;
        int H = 480776573;
        assertEquals(65309330, divisiblesequence.count(N, H));
    }

    @Test
    public void case58() {
        int N = 87762983;
        int H = 413898968;
        assertEquals(833463261, divisiblesequence.count(N, H));
    }

    @Test
    public void case59() {
        int N = 607627509;
        int H = 309433553;
        assertEquals(58887685, divisiblesequence.count(N, H));
    }

    @Test
    public void case60() {
        int N = 879541585;
        int H = 838282600;
        assertEquals(344427726, divisiblesequence.count(N, H));
    }

    @Test
    public void case61() {
        int N = 461163917;
        int H = 371029704;
        assertEquals(11360256, divisiblesequence.count(N, H));
    }

    @Test
    public void case62() {
        int N = 134038397;
        int H = 297471730;
        assertEquals(297471730, divisiblesequence.count(N, H));
    }

    @Test
    public void case63() {
        int N = 907279181;
        int H = 220315684;
        assertEquals(876856448, divisiblesequence.count(N, H));
    }

    @Test
    public void case64() {
        int N = 389766571;
        int H = 698901314;
        assertEquals(698901314, divisiblesequence.count(N, H));
    }

    @Test
    public void case65() {
        int N = 199468152;
        int H = 900927383;
        assertEquals(880289570, divisiblesequence.count(N, H));
    }

    @Test
    public void case66() {
        int N = 921536961;
        int H = 212836495;
        assertEquals(863869231, divisiblesequence.count(N, H));
    }

    @Test
    public void case67() {
        int N = 109827511;
        int H = 528568733;
        assertEquals(990761171, divisiblesequence.count(N, H));
    }

    @Test
    public void case68() {
        int N = 860548627;
        int H = 750775782;
        assertEquals(258823754, divisiblesequence.count(N, H));
    }

    @Test
    public void case69() {
        int N = 811191662;
        int H = 620361885;
        assertEquals(271676500, divisiblesequence.count(N, H));
    }

    @Test
    public void case70() {
        int N = 850021656;
        int H = 664585135;
        assertEquals(937075534, divisiblesequence.count(N, H));
    }

    @Test
    public void case71() {
        int N = 6801226;
        int H = 99228110;
        assertEquals(725556147, divisiblesequence.count(N, H));
    }

    @Test
    public void case72() {
        int N = 875035561;
        int H = 226034598;
        assertEquals(629615730, divisiblesequence.count(N, H));
    }

    @Test
    public void case73() {
        int N = 959202841;
        int H = 572907596;
        assertEquals(586699411, divisiblesequence.count(N, H));
    }

    @Test
    public void case74() {
        int N = 803665801;
        int H = 866909724;
        assertEquals(834436871, divisiblesequence.count(N, H));
    }

    @Test
    public void case75() {
        int N = 56806369;
        int H = 871371041;
        assertEquals(565603683, divisiblesequence.count(N, H));
    }

    @Test
    public void case76() {
        int N = 49378729;
        int H = 379535140;
        assertEquals(788966230, divisiblesequence.count(N, H));
    }

    @Test
    public void case77() {
        int N = 536870912;
        int H = 99999963;
        assertEquals(916296978, divisiblesequence.count(N, H));
    }

    @Test
    public void case78() {
        int N = 536870912;
        int H = 999999975;
        assertEquals(999721753, divisiblesequence.count(N, H));
    }

    @Test
    public void case79() {
        int N = 536870912;
        int H = 999999980;
        assertEquals(1000000008, divisiblesequence.count(N, H));
    }

    @Test
    public void case80() {
        int N = 536870912;
        int H = 999999981;
        assertEquals(0, divisiblesequence.count(N, H));
    }

    @Test
    public void case81() {
        int N = 536870912;
        int H = 1000000000;
        assertEquals(0, divisiblesequence.count(N, H));
    }

    @Test
    public void case82() {
        int N = 995425200;
        int H = 999999976;
        assertEquals(301366032, divisiblesequence.count(N, H));
    }

    @Test
    public void case83() {
        int N = 931170240;
        int H = 1000000000;
        assertEquals(607077575, divisiblesequence.count(N, H));
    }

    @Test
    public void case84() {
        int N = 999999998;
        int H = 999999998;
        assertEquals(999998678, divisiblesequence.count(N, H));
    }

    @Test
    public void case85() {
        int N = 123456789;
        int H = 987654321;
        assertEquals(464723823, divisiblesequence.count(N, H));
    }

    @Test
    public void case86() {
        int N = 100000000;
        int H = 100000000;
        assertEquals(136624515, divisiblesequence.count(N, H));
    }

    @Test
    public void case87() {
        int N = 268435456;
        int H = 1000000000;
        assertEquals(0, divisiblesequence.count(N, H));
    }

    @Test
    public void case88() {
        int N = 12345678;
        int H = 1000000000;
        assertEquals(999973765, divisiblesequence.count(N, H));
    }

    @Test
    public void case89() {
        int N = 999999978;
        int H = 999999987;
        assertEquals(234256, divisiblesequence.count(N, H));
    }

    @Test
    public void case90() {
        int N = 10000;
        int H = 1000000000;
        assertEquals(15876, divisiblesequence.count(N, H));
    }

    @Test
    public void case91() {
        int N = 999999999;
        int H = 888888887;
        assertEquals(870111041, divisiblesequence.count(N, H));
    }

    @Test
    public void case92() {
        int N = 999999613;
        int H = 999999613;
        assertEquals(999999613, divisiblesequence.count(N, H));
    }

    @Test
    public void case93() {
        int N = 8;
        int H = 999999999;
        assertEquals(999999889, divisiblesequence.count(N, H));
    }

    @Test
    public void case94() {
        int N = 73513440;
        int H = 1000000000;
        assertEquals(375025393, divisiblesequence.count(N, H));
    }

    @Test
    public void case95() {
        int N = 999999999;
        int H = 999999999;
        assertEquals(21000, divisiblesequence.count(N, H));
    }

    @Test
    public void case96() {
        int N = 536870912;
        int H = 999999999;
        assertEquals(0, divisiblesequence.count(N, H));
    }

    @Test
    public void case97() {
        int N = 60;
        int H = 3;
        assertEquals(54, divisiblesequence.count(N, H));
    }

    @Test
    public void case98() {
        int N = 600000000;
        int H = 28;
        assertEquals(625742509, divisiblesequence.count(N, H));
    }

}
