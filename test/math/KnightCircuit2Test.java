package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class KnightCircuit2Test {
    KnightCircuit2 knightcircuit2 = new KnightCircuit2();

    @Test
    public void case1() {
        int w = 1;
        int h = 1;
        assertEquals(1, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case2() {
        int w = 15;
        int h = 2;
        assertEquals(8, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case3() {
        int w = 100;
        int h = 100;
        assertEquals(10000, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case4() {
        int w = 3;
        int h = 3;
        assertEquals(8, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case5() {
        int w = 5;
        int h = 4;
        assertEquals(20, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case6() {
        int w = 3;
        int h = 2;
        assertEquals(2, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case7() {
        int w = 1;
        int h = 45000;
        assertEquals(1, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case8() {
        int w = 45000;
        int h = 1;
        assertEquals(1, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case9() {
        int w = 1;
        int h = 22279;
        assertEquals(1, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case10() {
        int w = 1;
        int h = 39878;
        assertEquals(1, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case11() {
        int w = 43270;
        int h = 1;
        assertEquals(1, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case12() {
        int w = 13784;
        int h = 1;
        assertEquals(1, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case13() {
        int w = 1;
        int h = 27255;
        assertEquals(1, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case14() {
        int w = 29043;
        int h = 1;
        assertEquals(1, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case15() {
        int w = 1;
        int h = 5043;
        assertEquals(1, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case16() {
        int w = 1;
        int h = 21932;
        assertEquals(1, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case17() {
        int w = 13510;
        int h = 1;
        assertEquals(1, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case18() {
        int w = 39576;
        int h = 1;
        assertEquals(1, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case19() {
        int w = 2;
        int h = 2;
        assertEquals(1, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case20() {
        int w = 2;
        int h = 15463;
        assertEquals(7732, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case21() {
        int w = 23900;
        int h = 2;
        assertEquals(11950, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case22() {
        int w = 10827;
        int h = 2;
        assertEquals(5414, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case23() {
        int w = 27471;
        int h = 2;
        assertEquals(13736, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case24() {
        int w = 10856;
        int h = 2;
        assertEquals(5428, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case25() {
        int w = 22189;
        int h = 2;
        assertEquals(11095, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case26() {
        int w = 2;
        int h = 16267;
        assertEquals(8134, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case27() {
        int w = 11416;
        int h = 2;
        assertEquals(5708, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case28() {
        int w = 2;
        int h = 7641;
        assertEquals(3821, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case29() {
        int w = 2;
        int h = 5887;
        assertEquals(2944, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case30() {
        int w = 9663;
        int h = 2;
        assertEquals(4832, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case31() {
        int w = 2;
        int h = 7417;
        assertEquals(3709, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case32() {
        int w = 2;
        int h = 44820;
        assertEquals(22410, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case33() {
        int w = 12338;
        int h = 2;
        assertEquals(6169, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case34() {
        int w = 11540;
        int h = 2;
        assertEquals(5770, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case35() {
        int w = 2;
        int h = 33896;
        assertEquals(16948, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case36() {
        int w = 39060;
        int h = 2;
        assertEquals(19530, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case37() {
        int w = 34885;
        int h = 2;
        assertEquals(17443, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case38() {
        int w = 39519;
        int h = 2;
        assertEquals(19760, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case39() {
        int w = 7236;
        int h = 2;
        assertEquals(3618, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case40() {
        int w = 3;
        int h = 29038;
        assertEquals(87114, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case41() {
        int w = 3;
        int h = 39515;
        assertEquals(118545, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case42() {
        int w = 11345;
        int h = 3;
        assertEquals(34035, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case43() {
        int w = 2473;
        int h = 3;
        assertEquals(7419, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case44() {
        int w = 26591;
        int h = 3;
        assertEquals(79773, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case45() {
        int w = 3;
        int h = 25053;
        assertEquals(75159, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case46() {
        int w = 10661;
        int h = 3;
        assertEquals(31983, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case47() {
        int w = 3;
        int h = 362;
        assertEquals(1086, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case48() {
        int w = 3;
        int h = 32740;
        assertEquals(98220, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case49() {
        int w = 3;
        int h = 5936;
        assertEquals(17808, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case50() {
        int w = 3;
        int h = 8468;
        assertEquals(25404, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case51() {
        int w = 3;
        int h = 12128;
        assertEquals(36384, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case52() {
        int w = 3;
        int h = 31858;
        assertEquals(95574, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case53() {
        int w = 3;
        int h = 34476;
        assertEquals(103428, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case54() {
        int w = 28802;
        int h = 3;
        assertEquals(86406, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case55() {
        int w = 32913;
        int h = 3;
        assertEquals(98739, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case56() {
        int w = 18628;
        int h = 3;
        assertEquals(55884, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case57() {
        int w = 3;
        int h = 8306;
        assertEquals(24918, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case58() {
        int w = 19097;
        int h = 3;
        assertEquals(57291, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case59() {
        int w = 25406;
        int h = 3;
        assertEquals(76218, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case60() {
        int w = 2541;
        int h = 20856;
        assertEquals(52995096, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case61() {
        int w = 14419;
        int h = 12565;
        assertEquals(181174735, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case62() {
        int w = 38541;
        int h = 42422;
        assertEquals(1634986302, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case63() {
        int w = 11035;
        int h = 14984;
        assertEquals(165348440, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case64() {
        int w = 14034;
        int h = 5341;
        assertEquals(74955594, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case65() {
        int w = 9038;
        int h = 19759;
        assertEquals(178581842, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case66() {
        int w = 8390;
        int h = 11828;
        assertEquals(99236920, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case67() {
        int w = 9918;
        int h = 28487;
        assertEquals(282534066, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case68() {
        int w = 30892;
        int h = 30300;
        assertEquals(936027600, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case69() {
        int w = 18127;
        int h = 12992;
        assertEquals(235505984, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case70() {
        int w = 34788;
        int h = 34923;
        assertEquals(1214901324, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case71() {
        int w = 20739;
        int h = 15623;
        assertEquals(324005397, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case72() {
        int w = 23954;
        int h = 26913;
        assertEquals(644674002, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case73() {
        int w = 13419;
        int h = 28274;
        assertEquals(379408806, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case74() {
        int w = 28689;
        int h = 4500;
        assertEquals(129100500, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case75() {
        int w = 28530;
        int h = 31815;
        assertEquals(907681950, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case76() {
        int w = 22985;
        int h = 1063;
        assertEquals(24433055, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case77() {
        int w = 17051;
        int h = 34304;
        assertEquals(584917504, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case78() {
        int w = 13245;
        int h = 30758;
        assertEquals(407389710, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case79() {
        int w = 950;
        int h = 19702;
        assertEquals(18716900, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case80() {
        int w = 31665;
        int h = 29950;
        assertEquals(948366750, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case81() {
        int w = 41419;
        int h = 14625;
        assertEquals(605752875, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case82() {
        int w = 38383;
        int h = 37867;
        assertEquals(1453449061, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case83() {
        int w = 12259;
        int h = 348;
        assertEquals(4266132, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case84() {
        int w = 40450;
        int h = 22196;
        assertEquals(897828200, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case85() {
        int w = 2614;
        int h = 17017;
        assertEquals(44482438, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case86() {
        int w = 25447;
        int h = 27169;
        assertEquals(691369543, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case87() {
        int w = 16903;
        int h = 16123;
        assertEquals(272527069, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case88() {
        int w = 31014;
        int h = 17527;
        assertEquals(543582378, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case89() {
        int w = 7177;
        int h = 35843;
        assertEquals(257245211, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case90() {
        int w = 5;
        int h = 5;
        assertEquals(25, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case91() {
        int w = 4;
        int h = 4;
        assertEquals(16, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case92() {
        int w = 1;
        int h = 100;
        assertEquals(1, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case93() {
        int w = 45000;
        int h = 45000;
        assertEquals(2025000000, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case94() {
        int w = 3;
        int h = 5;
        assertEquals(15, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case95() {
        int w = 51;
        int h = 51;
        assertEquals(2601, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case96() {
        int w = 4;
        int h = 2;
        assertEquals(2, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case97() {
        int w = 3;
        int h = 4;
        assertEquals(12, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case98() {
        int w = 2;
        int h = 100;
        assertEquals(50, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case99() {
        int w = 99;
        int h = 98;
        assertEquals(9702, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case100() {
        int w = 3;
        int h = 7;
        assertEquals(21, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case101() {
        int w = 2;
        int h = 4;
        assertEquals(2, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case102() {
        int w = 16;
        int h = 2;
        assertEquals(8, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case103() {
        int w = 1;
        int h = 3;
        assertEquals(1, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case104() {
        int w = 1;
        int h = 7;
        assertEquals(1, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case105() {
        int w = 1;
        int h = 123;
        assertEquals(1, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case106() {
        int w = 99;
        int h = 45000;
        assertEquals(4455000, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case107() {
        int w = 1;
        int h = 10;
        assertEquals(1, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case108() {
        int w = 33;
        int h = 3;
        assertEquals(99, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case109() {
        int w = 1;
        int h = 1234;
        assertEquals(1, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case110() {
        int w = 9;
        int h = 45000;
        assertEquals(405000, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case111() {
        int w = 5;
        int h = 2;
        assertEquals(3, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case112() {
        int w = 10;
        int h = 45000;
        assertEquals(450000, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case113() {
        int w = 45000;
        int h = 50;
        assertEquals(2250000, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case114() {
        int w = 2;
        int h = 45000;
        assertEquals(22500, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case115() {
        int w = 4;
        int h = 45000;
        assertEquals(180000, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case116() {
        int w = 10;
        int h = 3;
        assertEquals(30, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case117() {
        int w = 45000;
        int h = 98;
        assertEquals(4410000, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case118() {
        int w = 1;
        int h = 199;
        assertEquals(1, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case119() {
        int w = 80;
        int h = 45000;
        assertEquals(3600000, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case120() {
        int w = 45000;
        int h = 99;
        assertEquals(4455000, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case121() {
        int w = 3;
        int h = 45000;
        assertEquals(135000, knightcircuit2.maxSize(w, h));
    }

    @Test
    public void case122() {
        int w = 2;
        int h = 3;
        assertEquals(2, knightcircuit2.maxSize(w, h));
    }

}
