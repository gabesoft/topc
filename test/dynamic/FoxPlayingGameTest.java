package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class FoxPlayingGameTest {
    double DELTA = 1.0e-08;
    FoxPlayingGame foxplayinggame = new FoxPlayingGame();

    @Test
    public void case1() {
        int nA = 5;
        int nB = 4;
        int paramA = 3000;
        int paramB = 2000;
        assertEquals(240.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case2() {
        int nA = 3;
        int nB = 3;
        int paramA = 2000;
        int paramB = 100;
        assertEquals(6.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case3() {
        int nA = 4;
        int nB = 3;
        int paramA = -2000;
        int paramB = 2000;
        assertEquals(-8.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case4() {
        int nA = 5;
        int nB = 5;
        int paramA = 2000;
        int paramB = -2000;
        assertEquals(160.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case5() {
        int nA = 50;
        int nB = 50;
        int paramA = 10000;
        int paramB = 2000;
        assertEquals(562949953421312000.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case6() {
        int nA = 41;
        int nB = 34;
        int paramA = 9876;
        int paramB = -1234;
        assertEquals(515323.9982341775, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case7() {
        int nA = 31;
        int nB = 16;
        int paramA = -1234;
        int paramB = -1569;
        assertEquals(32886.75382013723, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case8() {
        int nA = 31;
        int nB = 17;
        int paramA = -7717;
        int paramB = -1322;
        assertEquals(27526.115739436027, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case9() {
        int nA = 23;
        int nB = 34;
        int paramA = -9422;
        int paramB = -180;
        assertEquals(39.00708, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case10() {
        int nA = 23;
        int nB = 35;
        int paramA = -3581;
        int paramB = -599;
        assertEquals(49.335437, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case11() {
        int nA = 41;
        int nB = 19;
        int paramA = 414;
        int paramB = -509;
        assertEquals(16.974, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case12() {
        int nA = 41;
        int nB = 20;
        int paramA = 5511;
        int paramB = -918;
        assertEquals(225.951, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case13() {
        int nA = 0;
        int nB = 0;
        int paramA = 10000;
        int paramB = 2000;
        assertEquals(0.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case14() {
        int nA = 0;
        int nB = 0;
        int paramA = 8481;
        int paramB = -512;
        assertEquals(0.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case15() {
        int nA = 0;
        int nB = 1;
        int paramA = -414;
        int paramB = -1851;
        assertEquals(0.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case16() {
        int nA = 0;
        int nB = 1;
        int paramA = 4144;
        int paramB = 2000;
        assertEquals(0.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case17() {
        int nA = 1;
        int nB = 0;
        int paramA = 1885;
        int paramB = 424;
        assertEquals(1.885, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case18() {
        int nA = 1;
        int nB = 0;
        int paramA = -5153;
        int paramB = 31;
        assertEquals(-5.153, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case19() {
        int nA = 1;
        int nB = 1;
        int paramA = -4142;
        int paramB = -321;
        assertEquals(1.329582, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case20() {
        int nA = 1;
        int nB = 1;
        int paramA = -951;
        int paramB = -243;
        assertEquals(0.231093, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case21() {
        int nA = 1;
        int nB = 1;
        int paramA = 2534;
        int paramB = -1001;
        assertEquals(2.534, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case22() {
        int nA = 1;
        int nB = 2;
        int paramA = 4515;
        int paramB = -1002;
        assertEquals(4.533078059999999, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case23() {
        int nA = 50;
        int nB = 1;
        int paramA = 5293;
        int paramB = 1403;
        assertEquals(371.30395000000004, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case24() {
        int nA = 45;
        int nB = 1;
        int paramA = -5918;
        int paramB = -1;
        assertEquals(0.26631, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case25() {
        int nA = 25;
        int nB = 9;
        int paramA = 0;
        int paramB = 1592;
        assertEquals(0.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case26() {
        int nA = 39;
        int nB = 50;
        int paramA = -1;
        int paramB = -2;
        assertEquals(7.8e-05, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case27() {
        int nA = 40;
        int nB = 45;
        int paramA = -1;
        int paramB = 1;
        assertEquals(-4.0000000000000037e-137, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case28() {
        int nA = 31;
        int nB = 49;
        int paramA = 1000;
        int paramB = 1000;
        assertEquals(31.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case29() {
        int nA = 22;
        int nB = 23;
        int paramA = -1000;
        int paramB = -1000;
        assertEquals(22.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case30() {
        int nA = 37;
        int nB = 41;
        int paramA = -1001;
        int paramB = 1001;
        assertEquals(-37.037, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case31() {
        int nA = 43;
        int nB = 12;
        int paramA = 999;
        int paramB = -1001;
        assertEquals(43.47532863383772, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case32() {
        int nA = 41;
        int nB = 23;
        int paramA = -104;
        int paramB = -1000;
        assertEquals(4.264, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case33() {
        int nA = 40;
        int nB = 9;
        int paramA = -4796;
        int paramB = -146;
        assertEquals(28.00864, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case34() {
        int nA = 26;
        int nB = 26;
        int paramA = -8930;
        int paramB = 1839;
        assertEquals(-232.18, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case35() {
        int nA = 14;
        int nB = 34;
        int paramA = 2898;
        int paramB = -912;
        assertEquals(40.572, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case36() {
        int nA = 18;
        int nB = 14;
        int paramA = -8184;
        int paramB = -412;
        assertEquals(60.69254399999999, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case37() {
        int nA = 25;
        int nB = 7;
        int paramA = -2350;
        int paramB = -564;
        assertEquals(33.135, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case38() {
        int nA = 47;
        int nB = 44;
        int paramA = 9508;
        int paramB = -171;
        assertEquals(446.876, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case39() {
        int nA = 4;
        int nB = 41;
        int paramA = -5461;
        int paramB = 1574;
        assertEquals(-21.844, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case40() {
        int nA = 29;
        int nB = 5;
        int paramA = -4769;
        int paramB = -1401;
        assertEquals(746.476253539108, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case41() {
        int nA = 38;
        int nB = 43;
        int paramA = -6852;
        int paramB = 482;
        assertEquals(-6.118198950390014e-12, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case42() {
        int nA = 23;
        int nB = 49;
        int paramA = 8654;
        int paramB = -861;
        assertEquals(199.042, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case43() {
        int nA = 47;
        int nB = 34;
        int paramA = 4635;
        int paramB = 271;
        assertEquals(217.845, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case44() {
        int nA = 7;
        int nB = 11;
        int paramA = 7987;
        int paramB = -1398;
        assertEquals(1594.2390346449097, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case45() {
        int nA = 26;
        int nB = 34;
        int paramA = 3143;
        int paramB = -187;
        assertEquals(81.71799999999999, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case46() {
        int nA = 17;
        int nB = 20;
        int paramA = -6315;
        int paramB = 522;
        assertEquals(-0.00024223245811644934, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case47() {
        int nA = 45;
        int nB = 41;
        int paramA = 3155;
        int paramB = 702;
        assertEquals(141.975, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case48() {
        int nA = 18;
        int nB = 27;
        int paramA = 5835;
        int paramB = -1325;
        assertEquals(158097.93614918503, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case49() {
        int nA = 47;
        int nB = 26;
        int paramA = 1529;
        int paramB = 1709;
        assertEquals(80872147.2123053, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case50() {
        int nA = 38;
        int nB = 8;
        int paramA = -4286;
        int paramB = -1678;
        assertEquals(6100.697043704332, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case51() {
        int nA = 45;
        int nB = 15;
        int paramA = -3938;
        int paramB = 1389;
        assertEquals(-177.21, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case52() {
        int nA = 34;
        int nB = 50;
        int paramA = 1662;
        int paramB = -4;
        assertEquals(56.507999999999996, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case53() {
        int nA = 27;
        int nB = 13;
        int paramA = -7130;
        int paramB = 1387;
        assertEquals(-192.51, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case54() {
        int nA = 14;
        int nB = 27;
        int paramA = -3023;
        int paramB = -872;
        assertEquals(36.904784, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case55() {
        int nA = 49;
        int nB = 12;
        int paramA = -9628;
        int paramB = -687;
        assertEquals(324.107364, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case56() {
        int nA = 6;
        int nB = 13;
        int paramA = -5577;
        int paramB = 1913;
        assertEquals(-33.462, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case57() {
        int nA = 13;
        int nB = 42;
        int paramA = 6461;
        int paramB = -1089;
        assertEquals(3015.8799017856522, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case58() {
        int nA = 14;
        int nB = 31;
        int paramA = -602;
        int paramB = -1575;
        assertEquals(11000738.188400714, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case59() {
        int nA = 39;
        int nB = 22;
        int paramA = 8645;
        int paramB = -1529;
        assertEquals(3844096.5203036075, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case60() {
        int nA = 38;
        int nB = 0;
        int paramA = 493;
        int paramB = -1024;
        assertEquals(18.733999999999998, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case61() {
        int nA = 12;
        int nB = 12;
        int paramA = -7128;
        int paramB = 1651;
        assertEquals(-85.536, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case62() {
        int nA = 3;
        int nB = 13;
        int paramA = -8205;
        int paramB = -707;
        assertEquals(17.402805, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case63() {
        int nA = 50;
        int nB = 50;
        int paramA = -10000;
        int paramB = -2000;
        assertEquals(281474976710656000.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case64() {
        int nA = 50;
        int nB = 49;
        int paramA = -10000;
        int paramB = -2000;
        assertEquals(281474976710656000.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case65() {
        int nA = 50;
        int nB = 50;
        int paramA = -10000;
        int paramB = 2000;
        assertEquals(-500.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case66() {
        int nA = 50;
        int nB = 50;
        int paramA = 10000;
        int paramB = -2000;
        assertEquals(562949953421312000.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case67() {
        int nA = 50;
        int nB = 49;
        int paramA = 10000;
        int paramB = -2000;
        assertEquals(140737488355328000.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case68() {
        int nA = 50;
        int nB = 50;
        int paramA = 1;
        int paramB = 1001;
        assertEquals(0.052562241621737275, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case69() {
        int nA = 50;
        int nB = 50;
        int paramA = 1;
        int paramB = -1001;
        assertEquals(0.052562241621737275, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case70() {
        int nA = 50;
        int nB = 50;
        int paramA = -10000;
        int paramB = 0;
        assertEquals(-0.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case71() {
        int nA = 50;
        int nB = 0;
        int paramA = -9188;
        int paramB = 0;
        assertEquals(-459.40000000000003, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case72() {
        int nA = 48;
        int nB = 0;
        int paramA = -1004;
        int paramB = 0;
        assertEquals(-48.192, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case73() {
        int nA = 50;
        int nB = 50;
        int paramA = 1160;
        int paramB = 116;
        assertEquals(57.99999999999999, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case74() {
        int nA = 5;
        int nB = 7;
        int paramA = -3000;
        int paramB = -2000;
        assertEquals(1920.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case75() {
        int nA = 2;
        int nB = 4;
        int paramA = -1000;
        int paramB = -500;
        assertEquals(1.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case76() {
        int nA = 5;
        int nB = 5;
        int paramA = -5000;
        int paramB = -500;
        assertEquals(12.5, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case77() {
        int nA = 9;
        int nB = 9;
        int paramA = -1500;
        int paramB = -1;
        assertEquals(0.0135, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case78() {
        int nA = 49;
        int nB = 49;
        int paramA = -1000;
        int paramB = -500;
        assertEquals(24.5, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case79() {
        int nA = 1;
        int nB = 2;
        int paramA = -3000;
        int paramB = -2000;
        assertEquals(6.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case80() {
        int nA = 4;
        int nB = 5;
        int paramA = -1;
        int paramB = -1;
        assertEquals(4.0e-06, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case81() {
        int nA = 50;
        int nB = 50;
        int paramA = -1000;
        int paramB = -500;
        assertEquals(25.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case82() {
        int nA = 1;
        int nB = 3;
        int paramA = -5000;
        int paramB = -500;
        assertEquals(2.5, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case83() {
        int nA = 2;
        int nB = 50;
        int paramA = -10000;
        int paramB = -999;
        assertEquals(19.98, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case84() {
        int nA = 37;
        int nB = 8;
        int paramA = -5173;
        int paramB = -564;
        assertEquals(107.950164, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case85() {
        int nA = 1;
        int nB = 4;
        int paramA = -100;
        int paramB = -3;
        assertEquals(0.00030000000000000003, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case86() {
        int nA = 50;
        int nB = 50;
        int paramA = -1;
        int paramB = -1;
        assertEquals(5.0e-05, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case87() {
        int nA = 10;
        int nB = 10;
        int paramA = -10000;
        int paramB = -500;
        assertEquals(50.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case88() {
        int nA = 20;
        int nB = 21;
        int paramA = -2000;
        int paramB = -900;
        assertEquals(36.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case89() {
        int nA = 2;
        int nB = 4;
        int paramA = -100;
        int paramB = -100;
        assertEquals(0.020000000000000004, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case90() {
        int nA = 8;
        int nB = 10;
        int paramA = -2000;
        int paramB = -500;
        assertEquals(8.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case91() {
        int nA = 5;
        int nB = 5;
        int paramA = -100;
        int paramB = -100;
        assertEquals(0.05, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case92() {
        int nA = 25;
        int nB = 25;
        int paramA = 500;
        int paramB = -2000;
        assertEquals(209715200.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case93() {
        int nA = 37;
        int nB = 49;
        int paramA = -5843;
        int paramB = -483;
        assertEquals(104.420253, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case94() {
        int nA = 2;
        int nB = 3;
        int paramA = -5000;
        int paramB = -2000;
        assertEquals(80.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case95() {
        int nA = 50;
        int nB = 48;
        int paramA = -1000;
        int paramB = -50;
        assertEquals(2.5, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case96() {
        int nA = 50;
        int nB = 50;
        int paramA = 1000;
        int paramB = 1000;
        assertEquals(50.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case97() {
        int nA = 4;
        int nB = 4;
        int paramA = -2000;
        int paramB = -500;
        assertEquals(4.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case98() {
        int nA = 40;
        int nB = 40;
        int paramA = -100;
        int paramB = -300;
        assertEquals(1.2, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case99() {
        int nA = 1;
        int nB = 1;
        int paramA = -1000;
        int paramB = -1000;
        assertEquals(1.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case100() {
        int nA = 3;
        int nB = 3;
        int paramA = -2000;
        int paramB = -100;
        assertEquals(0.6000000000000001, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case101() {
        int nA = 3;
        int nB = 3;
        int paramA = -2000;
        int paramB = 100;
        assertEquals(-0.006000000000000002, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case102() {
        int nA = 5;
        int nB = 5;
        int paramA = -1000;
        int paramB = 200;
        assertEquals(-0.0016000000000000003, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case103() {
        int nA = 5;
        int nB = 5;
        int paramA = -10000;
        int paramB = -100;
        assertEquals(5.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case104() {
        int nA = 1;
        int nB = 0;
        int paramA = -1000;
        int paramB = 0;
        assertEquals(-1.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case105() {
        int nA = 10;
        int nB = 10;
        int paramA = -1000;
        int paramB = -100;
        assertEquals(1.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case106() {
        int nA = 2;
        int nB = 2;
        int paramA = -10000;
        int paramB = 1999;
        assertEquals(-20.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case107() {
        int nA = 5;
        int nB = 5;
        int paramA = -10000;
        int paramB = -500;
        assertEquals(25.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case108() {
        int nA = 40;
        int nB = 0;
        int paramA = -1000;
        int paramB = 0;
        assertEquals(-40.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case109() {
        int nA = 5;
        int nB = 5;
        int paramA = -1000;
        int paramB = -2000;
        assertEquals(160.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case110() {
        int nA = 2;
        int nB = 2;
        int paramA = 2;
        int paramB = 0;
        assertEquals(0.004, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case111() {
        int nA = 3;
        int nB = 3;
        int paramA = -1000;
        int paramB = -750;
        assertEquals(2.25, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case112() {
        int nA = 4;
        int nB = 5;
        int paramA = -1000;
        int paramB = -100;
        assertEquals(0.4, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case113() {
        int nA = 1;
        int nB = 2;
        int paramA = 6107;
        int paramB = 0;
        assertEquals(6.107, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case114() {
        int nA = 50;
        int nB = 50;
        int paramA = -1000;
        int paramB = -1;
        assertEquals(0.05, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case115() {
        int nA = 5;
        int nB = 4;
        int paramA = -2000;
        int paramB = -500;
        assertEquals(5.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case116() {
        int nA = 5;
        int nB = 5;
        int paramA = -1000;
        int paramB = -100;
        assertEquals(0.5, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case117() {
        int nA = 49;
        int nB = 49;
        int paramA = -3000;
        int paramB = -675;
        assertEquals(99.22500000000001, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case118() {
        int nA = 1;
        int nB = 10;
        int paramA = -1000;
        int paramB = -100;
        assertEquals(0.1, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case119() {
        int nA = 5;
        int nB = 10;
        int paramA = -300;
        int paramB = -100;
        assertEquals(0.15000000000000002, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case120() {
        int nA = 5;
        int nB = 5;
        int paramA = -2000;
        int paramB = -50;
        assertEquals(0.5, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case121() {
        int nA = 10;
        int nB = 3;
        int paramA = -1000;
        int paramB = 500;
        assertEquals(-1.25, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case122() {
        int nA = 10;
        int nB = 1;
        int paramA = -1000;
        int paramB = -2000;
        assertEquals(20.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case123() {
        int nA = 50;
        int nB = 10;
        int paramA = -10000;
        int paramB = 500;
        assertEquals(-0.48828125, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case124() {
        int nA = 2;
        int nB = 3;
        int paramA = -2000;
        int paramB = -100;
        assertEquals(0.4, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case125() {
        int nA = 1;
        int nB = 0;
        int paramA = 2000;
        int paramB = 500;
        assertEquals(2.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case126() {
        int nA = 10;
        int nB = 10;
        int paramA = -600;
        int paramB = -1500;
        assertEquals(230.66015625, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case127() {
        int nA = 50;
        int nB = 50;
        int paramA = -9999;
        int paramB = 567;
        assertEquals(-2.3882485204200707e-10, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case128() {
        int nA = 1;
        int nB = 0;
        int paramA = -10;
        int paramB = 0;
        assertEquals(-0.01, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case129() {
        int nA = 50;
        int nB = 3;
        int paramA = -1000;
        int paramB = -500;
        assertEquals(25.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case130() {
        int nA = 2;
        int nB = 5;
        int paramA = -2000;
        int paramB = -500;
        assertEquals(2.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case131() {
        int nA = 1;
        int nB = 50;
        int paramA = -10000;
        int paramB = -1;
        assertEquals(0.01, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case132() {
        int nA = 10;
        int nB = 10;
        int paramA = 2000;
        int paramB = -800;
        assertEquals(20.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case133() {
        int nA = 1;
        int nB = 10;
        int paramA = -2;
        int paramB = -999;
        assertEquals(0.001998, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case134() {
        int nA = 10;
        int nB = 0;
        int paramA = -1;
        int paramB = -200;
        assertEquals(-0.01, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case135() {
        int nA = 3;
        int nB = 0;
        int paramA = -2000;
        int paramB = -100;
        assertEquals(-6.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case136() {
        int nA = 4;
        int nB = 4;
        int paramA = -5000;
        int paramB = -500;
        assertEquals(10.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case137() {
        int nA = 2;
        int nB = 50;
        int paramA = -2000;
        int paramB = 2000;
        assertEquals(-4.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case138() {
        int nA = 5;
        int nB = 0;
        int paramA = -1000;
        int paramB = -2000;
        assertEquals(-5.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case139() {
        int nA = 10;
        int nB = 6;
        int paramA = -2000;
        int paramB = -500;
        assertEquals(10.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case140() {
        int nA = 50;
        int nB = 0;
        int paramA = -5000;
        int paramB = -1000;
        assertEquals(-250.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case141() {
        int nA = 49;
        int nB = 49;
        int paramA = -9999;
        int paramB = 1000;
        assertEquals(-489.951, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case142() {
        int nA = 3;
        int nB = 10;
        int paramA = -3000;
        int paramB = -500;
        assertEquals(4.5, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case143() {
        int nA = 10;
        int nB = 3;
        int paramA = -1;
        int paramB = -1;
        assertEquals(1.0e-05, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case144() {
        int nA = 50;
        int nB = 50;
        int paramA = -1500;
        int paramB = -500;
        assertEquals(37.5, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case145() {
        int nA = 10;
        int nB = 5;
        int paramA = -10000;
        int paramB = -900;
        assertEquals(90.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case146() {
        int nA = 50;
        int nB = 50;
        int paramA = 9432;
        int paramB = -1868;
        assertEquals(17475008317493910.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case147() {
        int nA = 1;
        int nB = 5;
        int paramA = -1000;
        int paramB = -1;
        assertEquals(0.001, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case148() {
        int nA = 3;
        int nB = 3;
        int paramA = 100;
        int paramB = -100;
        assertEquals(0.30000000000000004, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case149() {
        int nA = 1;
        int nB = 10;
        int paramA = -2000;
        int paramB = -200;
        assertEquals(0.4, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case150() {
        int nA = 11;
        int nB = 40;
        int paramA = -100;
        int paramB = -3;
        assertEquals(0.0033000000000000004, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case151() {
        int nA = 10;
        int nB = 0;
        int paramA = -1000;
        int paramB = 0;
        assertEquals(-10.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case152() {
        int nA = 6;
        int nB = 6;
        int paramA = -2000;
        int paramB = -2000;
        assertEquals(384.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case153() {
        int nA = 1;
        int nB = 2;
        int paramA = -1000;
        int paramB = -500;
        assertEquals(0.5, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case154() {
        int nA = 1;
        int nB = 0;
        int paramA = -2000;
        int paramB = -5;
        assertEquals(-2.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case155() {
        int nA = 4;
        int nB = 5;
        int paramA = -2000;
        int paramB = -500;
        assertEquals(4.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case156() {
        int nA = 10;
        int nB = 10;
        int paramA = -500;
        int paramB = -500;
        assertEquals(2.5, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case157() {
        int nA = 5;
        int nB = 5;
        int paramA = 10000;
        int paramB = 2000;
        assertEquals(1600.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case158() {
        int nA = 3;
        int nB = 20;
        int paramA = -2000;
        int paramB = 100;
        assertEquals(-6.000000000000007e-20, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case159() {
        int nA = 1;
        int nB = 1;
        int paramA = -1;
        int paramB = 0;
        assertEquals(-0.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case160() {
        int nA = 1;
        int nB = 10;
        int paramA = -100;
        int paramB = -500;
        assertEquals(0.05, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case161() {
        int nA = 5;
        int nB = 5;
        int paramA = -2000;
        int paramB = -1;
        assertEquals(0.01, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case162() {
        int nA = 1;
        int nB = 0;
        int paramA = 2000;
        int paramB = 100;
        assertEquals(2.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case163() {
        int nA = 1;
        int nB = 1;
        int paramA = -500;
        int paramB = -500;
        assertEquals(0.25, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case164() {
        int nA = 4;
        int nB = 3;
        int paramA = -2000;
        int paramB = -200;
        assertEquals(1.6, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case165() {
        int nA = 10;
        int nB = 12;
        int paramA = -500;
        int paramB = -700;
        assertEquals(3.5, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case166() {
        int nA = 10;
        int nB = 10;
        int paramA = -2000;
        int paramB = -100;
        assertEquals(2.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case167() {
        int nA = 5;
        int nB = 0;
        int paramA = -1000;
        int paramB = -200;
        assertEquals(-5.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case168() {
        int nA = 1;
        int nB = 3;
        int paramA = -500;
        int paramB = -500;
        assertEquals(0.25, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case169() {
        int nA = 5;
        int nB = 2;
        int paramA = -1000;
        int paramB = 1;
        assertEquals(-4.9999999999999996e-06, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case170() {
        int nA = 5;
        int nB = 5;
        int paramA = -2000;
        int paramB = -500;
        assertEquals(5.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case171() {
        int nA = 10;
        int nB = 10;
        int paramA = -2345;
        int paramB = -2000;
        assertEquals(12006.400000000001, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case172() {
        int nA = 5;
        int nB = 5;
        int paramA = -3000;
        int paramB = -2000;
        assertEquals(480.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case173() {
        int nA = 0;
        int nB = 0;
        int paramA = 0;
        int paramB = 0;
        assertEquals(0.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case174() {
        int nA = 2;
        int nB = 3;
        int paramA = -2000;
        int paramB = -2000;
        assertEquals(32.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case175() {
        int nA = 1;
        int nB = 3;
        int paramA = -1000;
        int paramB = -100;
        assertEquals(0.1, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case176() {
        int nA = 50;
        int nB = 50;
        int paramA = -1000;
        int paramB = 1;
        assertEquals(-5.000000000000005e-149, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case177() {
        int nA = 10;
        int nB = 9;
        int paramA = -2000;
        int paramB = -100;
        assertEquals(2.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case178() {
        int nA = 2;
        int nB = 3;
        int paramA = 1000;
        int paramB = -2000;
        assertEquals(8.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case179() {
        int nA = 46;
        int nB = 3;
        int paramA = 1696;
        int paramB = -969;
        assertEquals(78.01599999999999, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case180() {
        int nA = 1;
        int nB = 9;
        int paramA = -1000;
        int paramB = -200;
        assertEquals(0.2, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case181() {
        int nA = 1;
        int nB = 2;
        int paramA = -1000;
        int paramB = -1000;
        assertEquals(1.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case182() {
        int nA = 5;
        int nB = 3;
        int paramA = -2000;
        int paramB = -200;
        assertEquals(2.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case183() {
        int nA = 10;
        int nB = 10;
        int paramA = 1000;
        int paramB = -10;
        assertEquals(10.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case184() {
        int nA = 10;
        int nB = 10;
        int paramA = -100;
        int paramB = -100;
        assertEquals(0.1, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case185() {
        int nA = 2;
        int nB = 2;
        int paramA = -1000;
        int paramB = -2000;
        assertEquals(4.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case186() {
        int nA = 1;
        int nB = 0;
        int paramA = 2000;
        int paramB = 2000;
        assertEquals(2.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case187() {
        int nA = 1;
        int nB = 5;
        int paramA = -7966;
        int paramB = -373;
        assertEquals(2.971318, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case188() {
        int nA = 1;
        int nB = 3;
        int paramA = -5000;
        int paramB = -2000;
        assertEquals(40.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case189() {
        int nA = 5;
        int nB = 4;
        int paramA = -2000;
        int paramB = -100;
        assertEquals(1.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case190() {
        int nA = 3;
        int nB = 3;
        int paramA = -100;
        int paramB = -100;
        assertEquals(0.030000000000000006, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case191() {
        int nA = 3;
        int nB = 5;
        int paramA = -2000;
        int paramB = -200;
        assertEquals(1.2000000000000002, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case192() {
        int nA = 50;
        int nB = 2;
        int paramA = -5000;
        int paramB = -1500;
        assertEquals(375.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case193() {
        int nA = 1;
        int nB = 0;
        int paramA = -1;
        int paramB = 0;
        assertEquals(-0.001, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case194() {
        int nA = 10;
        int nB = 6;
        int paramA = -1500;
        int paramB = 1500;
        assertEquals(-15.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case195() {
        int nA = 1;
        int nB = 10;
        int paramA = -1000;
        int paramB = -500;
        assertEquals(0.5, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case196() {
        int nA = 29;
        int nB = 16;
        int paramA = -4552;
        int paramB = -1079;
        assertEquals(412.9732500259706, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case197() {
        int nA = 50;
        int nB = 50;
        int paramA = -1000;
        int paramB = -200;
        assertEquals(10.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case198() {
        int nA = 3;
        int nB = 4;
        int paramA = -2000;
        int paramB = -500;
        assertEquals(3.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case199() {
        int nA = 3;
        int nB = 2;
        int paramA = -3706;
        int paramB = 0;
        assertEquals(-0.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case200() {
        int nA = 1;
        int nB = 1;
        int paramA = -1000;
        int paramB = -2000;
        assertEquals(2.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case201() {
        int nA = 4;
        int nB = 5;
        int paramA = -3000;
        int paramB = -800;
        assertEquals(9.600000000000001, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case202() {
        int nA = 6;
        int nB = 5;
        int paramA = -2000;
        int paramB = -500;
        assertEquals(6.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case203() {
        int nA = 2;
        int nB = 5;
        int paramA = -2000;
        int paramB = -2000;
        assertEquals(128.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case204() {
        int nA = 1;
        int nB = 3;
        int paramA = 1000;
        int paramB = -500;
        assertEquals(1.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case205() {
        int nA = 13;
        int nB = 13;
        int paramA = -2000;
        int paramB = -100;
        assertEquals(2.6, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case206() {
        int nA = 10;
        int nB = 5;
        int paramA = -5000;
        int paramB = -500;
        assertEquals(25.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case207() {
        int nA = 1;
        int nB = 3;
        int paramA = 500;
        int paramB = -500;
        assertEquals(0.5, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case208() {
        int nA = 5;
        int nB = 5;
        int paramA = -3000;
        int paramB = -200;
        assertEquals(3.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case209() {
        int nA = 1;
        int nB = 1;
        int paramA = -1000;
        int paramB = 0;
        assertEquals(-0.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case210() {
        int nA = 5;
        int nB = 5;
        int paramA = 2000;
        int paramB = 2000;
        assertEquals(320.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case211() {
        int nA = 50;
        int nB = 0;
        int paramA = -10000;
        int paramB = 0;
        assertEquals(-500.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case212() {
        int nA = 2;
        int nB = 11;
        int paramA = -2000;
        int paramB = -100;
        assertEquals(0.4, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case213() {
        int nA = 2;
        int nB = 4;
        int paramA = -5000;
        int paramB = -200;
        assertEquals(2.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case214() {
        int nA = 10;
        int nB = 10;
        int paramA = 2000;
        int paramB = -600;
        assertEquals(20.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case215() {
        int nA = 5;
        int nB = 5;
        int paramA = -2000;
        int paramB = 0;
        assertEquals(-0.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case216() {
        int nA = 1;
        int nB = 3;
        int paramA = -10000;
        int paramB = -999;
        assertEquals(9.99, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case217() {
        int nA = 49;
        int nB = 49;
        int paramA = -10000;
        int paramB = 1;
        assertEquals(-4.9000000000000054e-145, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case218() {
        int nA = 2;
        int nB = 4;
        int paramA = -3000;
        int paramB = -200;
        assertEquals(1.2000000000000002, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case219() {
        int nA = 2;
        int nB = 2;
        int paramA = -1000;
        int paramB = 10;
        assertEquals(-0.0002, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case220() {
        int nA = 3;
        int nB = 0;
        int paramA = -2000;
        int paramB = -500;
        assertEquals(-6.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case221() {
        int nA = 2;
        int nB = 3;
        int paramA = -5000;
        int paramB = -100;
        assertEquals(1.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case222() {
        int nA = 40;
        int nB = 20;
        int paramA = -2000;
        int paramB = 400;
        assertEquals(-8.79609302220801e-07, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case223() {
        int nA = 50;
        int nB = 0;
        int paramA = -10000;
        int paramB = -1;
        assertEquals(-500.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case224() {
        int nA = 2;
        int nB = 1;
        int paramA = -1000;
        int paramB = -1000;
        assertEquals(2.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case225() {
        int nA = 50;
        int nB = 0;
        int paramA = -5000;
        int paramB = -500;
        assertEquals(-250.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case226() {
        int nA = 10;
        int nB = 10;
        int paramA = 10;
        int paramB = 0;
        assertEquals(0.1, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case227() {
        int nA = 5;
        int nB = 5;
        int paramA = -2000;
        int paramB = -1999;
        assertEquals(319.2007996001001, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case228() {
        int nA = 5;
        int nB = 4;
        int paramA = -3000;
        int paramB = -100;
        assertEquals(1.5, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case229() {
        int nA = 1;
        int nB = 1;
        int paramA = -1000;
        int paramB = 100;
        assertEquals(-0.1, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case230() {
        int nA = 1;
        int nB = 2;
        int paramA = -5000;
        int paramB = 0;
        assertEquals(-0.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case231() {
        int nA = 1;
        int nB = 0;
        int paramA = -1000;
        int paramB = -1000;
        assertEquals(-1.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case232() {
        int nA = 10;
        int nB = 0;
        int paramA = 10000;
        int paramB = 2000;
        assertEquals(100.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case233() {
        int nA = 5;
        int nB = 5;
        int paramA = -5000;
        int paramB = -100;
        assertEquals(2.5, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case234() {
        int nA = 50;
        int nB = 50;
        int paramA = -2000;
        int paramB = -100;
        assertEquals(10.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case235() {
        int nA = 50;
        int nB = 50;
        int paramA = -3000;
        int paramB = -100;
        assertEquals(15.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case236() {
        int nA = 5;
        int nB = 6;
        int paramA = -2000;
        int paramB = -100;
        assertEquals(1.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case237() {
        int nA = 49;
        int nB = 49;
        int paramA = -10000;
        int paramB = 1192;
        assertEquals(-490.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case238() {
        int nA = 10;
        int nB = 11;
        int paramA = -1000;
        int paramB = -10;
        assertEquals(0.1, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case239() {
        int nA = 5;
        int nB = 4;
        int paramA = -1000;
        int paramB = -200;
        assertEquals(1.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case240() {
        int nA = 1;
        int nB = 2;
        int paramA = -2000;
        int paramB = -2000;
        assertEquals(4.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case241() {
        int nA = 1;
        int nB = 0;
        int paramA = 1000;
        int paramB = 2000;
        assertEquals(1.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case242() {
        int nA = 50;
        int nB = 50;
        int paramA = -10000;
        int paramB = -1;
        assertEquals(0.5, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case243() {
        int nA = 50;
        int nB = 50;
        int paramA = -300;
        int paramB = -70;
        assertEquals(1.05, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case244() {
        int nA = 4;
        int nB = 0;
        int paramA = -2000;
        int paramB = -2000;
        assertEquals(-8.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case245() {
        int nA = 10;
        int nB = 20;
        int paramA = -2000;
        int paramB = -10;
        assertEquals(0.2, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case246() {
        int nA = 3;
        int nB = 0;
        int paramA = -1000;
        int paramB = -750;
        assertEquals(-3.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case247() {
        int nA = 5;
        int nB = 0;
        int paramA = -2000;
        int paramB = -200;
        assertEquals(-10.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case248() {
        int nA = 2;
        int nB = 0;
        int paramA = -2000;
        int paramB = -100;
        assertEquals(-4.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case249() {
        int nA = 5;
        int nB = 0;
        int paramA = 2000;
        int paramB = 2000;
        assertEquals(10.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case250() {
        int nA = 3;
        int nB = 18;
        int paramA = -2548;
        int paramB = -230;
        assertEquals(1.7581200000000001, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case251() {
        int nA = 50;
        int nB = 50;
        int paramA = 900;
        int paramB = 2000;
        assertEquals(50665495807918080.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case252() {
        int nA = 5;
        int nB = 5;
        int paramA = -3000;
        int paramB = -100;
        assertEquals(1.5, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case253() {
        int nA = 1;
        int nB = 0;
        int paramA = 1;
        int paramB = 0;
        assertEquals(0.001, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case254() {
        int nA = 5;
        int nB = 0;
        int paramA = -1000;
        int paramB = 0;
        assertEquals(-5.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case255() {
        int nA = 1;
        int nB = 1;
        int paramA = -1000;
        int paramB = -500;
        assertEquals(0.5, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case256() {
        int nA = 1;
        int nB = 0;
        int paramA = -1000;
        int paramB = -500;
        assertEquals(-1.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case257() {
        int nA = 1;
        int nB = 1;
        int paramA = -2000;
        int paramB = 2000;
        assertEquals(-2.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case258() {
        int nA = 3;
        int nB = 0;
        int paramA = -1000;
        int paramB = -2000;
        assertEquals(-3.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case259() {
        int nA = 1;
        int nB = 1;
        int paramA = -100;
        int paramB = 0;
        assertEquals(-0.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case260() {
        int nA = 10;
        int nB = 10;
        int paramA = -2000;
        int paramB = -2000;
        assertEquals(10240.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case261() {
        int nA = 5;
        int nB = 5;
        int paramA = 5000;
        int paramB = 2000;
        assertEquals(800.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case262() {
        int nA = 10;
        int nB = 0;
        int paramA = -1200;
        int paramB = 0;
        assertEquals(-12.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case263() {
        int nA = 2;
        int nB = 0;
        int paramA = -2000;
        int paramB = -500;
        assertEquals(-4.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case264() {
        int nA = 1;
        int nB = 10;
        int paramA = -2000;
        int paramB = -500;
        assertEquals(1.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case265() {
        int nA = 10;
        int nB = 0;
        int paramA = -1100;
        int paramB = -100;
        assertEquals(-11.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case266() {
        int nA = 3;
        int nB = 1;
        int paramA = -2000;
        int paramB = -500;
        assertEquals(3.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case267() {
        int nA = 2;
        int nB = 2;
        int paramA = -500;
        int paramB = -2000;
        assertEquals(2.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case268() {
        int nA = 3;
        int nB = 3;
        int paramA = -1;
        int paramB = 1;
        assertEquals(-3.0e-12, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case269() {
        int nA = 50;
        int nB = 50;
        int paramA = -5000;
        int paramB = -2000;
        assertEquals(140737488355328000.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case270() {
        int nA = 5;
        int nB = 5;
        int paramA = -100;
        int paramB = 900;
        assertEquals(-0.29524500000000004, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case271() {
        int nA = 1;
        int nB = 1;
        int paramA = 10000;
        int paramB = 2000;
        assertEquals(20.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case272() {
        int nA = 5;
        int nB = 5;
        int paramA = -2000;
        int paramB = -300;
        assertEquals(3.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case273() {
        int nA = 4;
        int nB = 5;
        int paramA = -5000;
        int paramB = -500;
        assertEquals(10.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case274() {
        int nA = 5;
        int nB = 4;
        int paramA = -6000;
        int paramB = -2000;
        assertEquals(240.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case275() {
        int nA = 49;
        int nB = 49;
        int paramA = -9998;
        int paramB = -1997;
        assertEquals(256232604543883940.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case276() {
        int nA = 2;
        int nB = 2;
        int paramA = -3000;
        int paramB = -2000;
        assertEquals(12.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case277() {
        int nA = 1;
        int nB = 1;
        int paramA = -1000;
        int paramB = 500;
        assertEquals(-0.5, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case278() {
        int nA = 5;
        int nB = 5;
        int paramA = -2000;
        int paramB = -100;
        assertEquals(1.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case279() {
        int nA = 41;
        int nB = 17;
        int paramA = -666;
        int paramB = -500;
        assertEquals(13.653, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case280() {
        int nA = 50;
        int nB = 50;
        int paramA = 2000;
        int paramB = 100;
        assertEquals(100.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case281() {
        int nA = 4;
        int nB = 3;
        int paramA = -2;
        int paramB = -2;
        assertEquals(1.6e-05, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case282() {
        int nA = 10;
        int nB = 1;
        int paramA = -1000;
        int paramB = 500;
        assertEquals(-5.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case283() {
        int nA = 4;
        int nB = 4;
        int paramA = -3000;
        int paramB = -2000;
        assertEquals(96.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case284() {
        int nA = 50;
        int nB = 50;
        int paramA = 8000;
        int paramB = 0;
        assertEquals(400.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case285() {
        int nA = 50;
        int nB = 50;
        int paramA = 3000;
        int paramB = -200;
        assertEquals(150.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case286() {
        int nA = 10;
        int nB = 49;
        int paramA = -1000;
        int paramB = -900;
        assertEquals(9.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case287() {
        int nA = 1;
        int nB = 0;
        int paramA = 7;
        int paramB = 0;
        assertEquals(0.007, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case288() {
        int nA = 2;
        int nB = 3;
        int paramA = -2000;
        int paramB = -500;
        assertEquals(2.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case289() {
        int nA = 10;
        int nB = 19;
        int paramA = -1;
        int paramB = -1;
        assertEquals(1.0e-05, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case290() {
        int nA = 50;
        int nB = 50;
        int paramA = -10000;
        int paramB = -10;
        assertEquals(5.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case291() {
        int nA = 10;
        int nB = 0;
        int paramA = -10000;
        int paramB = 0;
        assertEquals(-100.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case292() {
        int nA = 4;
        int nB = 0;
        int paramA = -5000;
        int paramB = -500;
        assertEquals(-20.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case293() {
        int nA = 10;
        int nB = 0;
        int paramA = 10000;
        int paramB = 1;
        assertEquals(100.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case294() {
        int nA = 1;
        int nB = 0;
        int paramA = -2000;
        int paramB = -300;
        assertEquals(-2.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case295() {
        int nA = 10;
        int nB = 10;
        int paramA = -1345;
        int paramB = -5;
        assertEquals(0.06725, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case296() {
        int nA = 1;
        int nB = 10;
        int paramA = -2000;
        int paramB = -5;
        assertEquals(0.01, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case297() {
        int nA = 1;
        int nB = 5;
        int paramA = 2000;
        int paramB = 2000;
        assertEquals(64.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case298() {
        int nA = 1;
        int nB = 2;
        int paramA = -10000;
        int paramB = -2000;
        assertEquals(20.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case299() {
        int nA = 10;
        int nB = 1;
        int paramA = -10;
        int paramB = 0;
        assertEquals(-0.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case300() {
        int nA = 5;
        int nB = 4;
        int paramA = 3000;
        int paramB = 1000;
        assertEquals(15.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case301() {
        int nA = 50;
        int nB = 50;
        int paramA = -1000;
        int paramB = -100;
        assertEquals(5.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case302() {
        int nA = 5;
        int nB = 5;
        int paramA = 500;
        int paramB = 500;
        assertEquals(2.5, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case303() {
        int nA = 3;
        int nB = 0;
        int paramA = -1000;
        int paramB = 0;
        assertEquals(-3.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case304() {
        int nA = 4;
        int nB = 3;
        int paramA = 2000;
        int paramB = -2000;
        assertEquals(32.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case305() {
        int nA = 1;
        int nB = 0;
        int paramA = -500;
        int paramB = -500;
        assertEquals(-0.5, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case306() {
        int nA = 1;
        int nB = 1;
        int paramA = -100;
        int paramB = -100;
        assertEquals(0.010000000000000002, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case307() {
        int nA = 40;
        int nB = 37;
        int paramA = -9874;
        int paramB = 589;
        assertEquals(-1.2325910823419878e-06, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case308() {
        int nA = 50;
        int nB = 50;
        int paramA = -1000;
        int paramB = -999;
        assertEquals(49.95, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case309() {
        int nA = 4;
        int nB = 2;
        int paramA = -5000;
        int paramB = -1700;
        assertEquals(34.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case310() {
        int nA = 50;
        int nB = 50;
        int paramA = -4000;
        int paramB = -500;
        assertEquals(100.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case311() {
        int nA = 4;
        int nB = 0;
        int paramA = -2000;
        int paramB = 2000;
        assertEquals(-8.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case312() {
        int nA = 5;
        int nB = 3;
        int paramA = -5000;
        int paramB = -500;
        assertEquals(12.5, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case313() {
        int nA = 10;
        int nB = 3;
        int paramA = -1000;
        int paramB = 99;
        assertEquals(-0.009702990000000002, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case314() {
        int nA = 1;
        int nB = 0;
        int paramA = -300;
        int paramB = 0;
        assertEquals(-0.3, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case315() {
        int nA = 1;
        int nB = 0;
        int paramA = -1000;
        int paramB = -1;
        assertEquals(-1.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case316() {
        int nA = 1;
        int nB = 5;
        int paramA = -2000;
        int paramB = -500;
        assertEquals(1.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case317() {
        int nA = 2;
        int nB = 2;
        int paramA = -1000;
        int paramB = 2000;
        assertEquals(-2.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case318() {
        int nA = 10;
        int nB = 10;
        int paramA = -10;
        int paramB = 0;
        assertEquals(-0.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case319() {
        int nA = 50;
        int nB = 49;
        int paramA = -5000;
        int paramB = -500;
        assertEquals(125.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case320() {
        int nA = 1;
        int nB = 2;
        int paramA = 900;
        int paramB = 2000;
        assertEquals(3.6, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case321() {
        int nA = 5;
        int nB = 0;
        int paramA = -2000;
        int paramB = -500;
        assertEquals(-10.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case322() {
        int nA = 10;
        int nB = 0;
        int paramA = -1000;
        int paramB = -100;
        assertEquals(-10.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case323() {
        int nA = 50;
        int nB = 50;
        int paramA = -900;
        int paramB = 900;
        assertEquals(-0.23191988432940538, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case324() {
        int nA = 5;
        int nB = 5;
        int paramA = -1000;
        int paramB = -500;
        assertEquals(2.5, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case325() {
        int nA = 49;
        int nB = 49;
        int paramA = -999;
        int paramB = -999;
        assertEquals(48.902049, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case326() {
        int nA = 10;
        int nB = 10;
        int paramA = -2000;
        int paramB = 500;
        assertEquals(-0.01953125, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case327() {
        int nA = 50;
        int nB = 50;
        int paramA = 1111;
        int paramB = 1111;
        assertEquals(10724.745875895354, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case328() {
        int nA = 10;
        int nB = 9;
        int paramA = -2000;
        int paramB = -2000;
        assertEquals(10240.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case329() {
        int nA = 10;
        int nB = 10;
        int paramA = -1000;
        int paramB = -10;
        assertEquals(0.1, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

    @Test
    public void case330() {
        int nA = 0;
        int nB = 10;
        int paramA = 2000;
        int paramB = 2000;
        assertEquals(0.0, foxplayinggame.theMax(nA, nB, paramA, paramB), DELTA);
    }

}
