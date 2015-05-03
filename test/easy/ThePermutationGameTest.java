package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class ThePermutationGameTest {
    ThePermutationGame thepermutationgame = new ThePermutationGame();

    @Test
    public void case1() {
        int N = 2;
        assertEquals(2, thepermutationgame.findMin(N));
    }

    @Test
    public void case2() {
        int N = 3;
        assertEquals(6, thepermutationgame.findMin(N));
    }

    @Test
    public void case3() {
        int N = 11;
        assertEquals(27720, thepermutationgame.findMin(N));
    }

    @Test
    public void case4() {
        int N = 102;
        assertEquals(53580071, thepermutationgame.findMin(N));
    }

    @Test
    public void case5() {
        int N = 9999;
        assertEquals(927702802, thepermutationgame.findMin(N));
    }

    @Test
    public void case6() {
        int N = 35157;
        assertEquals(937518076, thepermutationgame.findMin(N));
    }

    @Test
    public void case7() {
        int N = 34230;
        assertEquals(740350604, thepermutationgame.findMin(N));
    }

    @Test
    public void case8() {
        int N = 57100;
        assertEquals(247067771, thepermutationgame.findMin(N));
    }

    @Test
    public void case9() {
        int N = 58698;
        assertEquals(49268119, thepermutationgame.findMin(N));
    }

    @Test
    public void case10() {
        int N = 12481;
        assertEquals(849911685, thepermutationgame.findMin(N));
    }

    @Test
    public void case11() {
        int N = 42324;
        assertEquals(762823246, thepermutationgame.findMin(N));
    }

    @Test
    public void case12() {
        int N = 31379;
        assertEquals(589672269, thepermutationgame.findMin(N));
    }

    @Test
    public void case13() {
        int N = 24398;
        assertEquals(882274344, thepermutationgame.findMin(N));
    }

    @Test
    public void case14() {
        int N = 36940;
        assertEquals(330451934, thepermutationgame.findMin(N));
    }

    @Test
    public void case15() {
        int N = 24917;
        assertEquals(250138819, thepermutationgame.findMin(N));
    }

    @Test
    public void case16() {
        int N = 31086;
        assertEquals(234840781, thepermutationgame.findMin(N));
    }

    @Test
    public void case17() {
        int N = 26329;
        assertEquals(145436481, thepermutationgame.findMin(N));
    }

    @Test
    public void case18() {
        int N = 10079;
        assertEquals(360516388, thepermutationgame.findMin(N));
    }

    @Test
    public void case19() {
        int N = 72615;
        assertEquals(468013463, thepermutationgame.findMin(N));
    }

    @Test
    public void case20() {
        int N = 13944;
        assertEquals(851198691, thepermutationgame.findMin(N));
    }

    @Test
    public void case21() {
        int N = 8376;
        assertEquals(459278786, thepermutationgame.findMin(N));
    }

    @Test
    public void case22() {
        int N = 40268;
        assertEquals(207985004, thepermutationgame.findMin(N));
    }

    @Test
    public void case23() {
        int N = 53876;
        assertEquals(294846859, thepermutationgame.findMin(N));
    }

    @Test
    public void case24() {
        int N = 57385;
        assertEquals(340995703, thepermutationgame.findMin(N));
    }

    @Test
    public void case25() {
        int N = 87446;
        assertEquals(576510380, thepermutationgame.findMin(N));
    }

    @Test
    public void case26() {
        int N = 20331;
        assertEquals(929584200, thepermutationgame.findMin(N));
    }

    @Test
    public void case27() {
        int N = 76668;
        assertEquals(982058946, thepermutationgame.findMin(N));
    }

    @Test
    public void case28() {
        int N = 18397;
        assertEquals(286495927, thepermutationgame.findMin(N));
    }

    @Test
    public void case29() {
        int N = 75155;
        assertEquals(410672060, thepermutationgame.findMin(N));
    }

    @Test
    public void case30() {
        int N = 33360;
        assertEquals(302893413, thepermutationgame.findMin(N));
    }

    @Test
    public void case31() {
        int N = 57529;
        assertEquals(998094308, thepermutationgame.findMin(N));
    }

    @Test
    public void case32() {
        int N = 62815;
        assertEquals(365884096, thepermutationgame.findMin(N));
    }

    @Test
    public void case33() {
        int N = 88264;
        assertEquals(668415225, thepermutationgame.findMin(N));
    }

    @Test
    public void case34() {
        int N = 87537;
        assertEquals(569631445, thepermutationgame.findMin(N));
    }

    @Test
    public void case35() {
        int N = 25169;
        assertEquals(377880881, thepermutationgame.findMin(N));
    }

    @Test
    public void case36() {
        int N = 133;
        assertEquals(765427742, thepermutationgame.findMin(N));
    }

    @Test
    public void case37() {
        int N = 1381;
        assertEquals(714617036, thepermutationgame.findMin(N));
    }

    @Test
    public void case38() {
        int N = 650;
        assertEquals(179094468, thepermutationgame.findMin(N));
    }

    @Test
    public void case39() {
        int N = 301;
        assertEquals(199546229, thepermutationgame.findMin(N));
    }

    @Test
    public void case40() {
        int N = 170;
        assertEquals(871276406, thepermutationgame.findMin(N));
    }

    @Test
    public void case41() {
        int N = 5;
        assertEquals(60, thepermutationgame.findMin(N));
    }

    @Test
    public void case42() {
        int N = 19640;
        assertEquals(705613344, thepermutationgame.findMin(N));
    }

    @Test
    public void case43() {
        int N = 128;
        assertEquals(570728460, thepermutationgame.findMin(N));
    }

    @Test
    public void case44() {
        int N = 6;
        assertEquals(60, thepermutationgame.findMin(N));
    }

    @Test
    public void case45() {
        int N = 9508;
        assertEquals(220585550, thepermutationgame.findMin(N));
    }

    @Test
    public void case46() {
        int N = 16;
        assertEquals(720720, thepermutationgame.findMin(N));
    }

    @Test
    public void case47() {
        int N = 73;
        assertEquals(497270415, thepermutationgame.findMin(N));
    }

    @Test
    public void case48() {
        int N = 42;
        assertEquals(206169884, thepermutationgame.findMin(N));
    }

    @Test
    public void case49() {
        int N = 753;
        assertEquals(691620754, thepermutationgame.findMin(N));
    }

    @Test
    public void case50() {
        int N = 8;
        assertEquals(840, thepermutationgame.findMin(N));
    }

    @Test
    public void case51() {
        int N = 361;
        assertEquals(779915945, thepermutationgame.findMin(N));
    }

    @Test
    public void case52() {
        int N = 242;
        assertEquals(769677147, thepermutationgame.findMin(N));
    }

    @Test
    public void case53() {
        int N = 941;
        assertEquals(665163605, thepermutationgame.findMin(N));
    }

    @Test
    public void case54() {
        int N = 16;
        assertEquals(720720, thepermutationgame.findMin(N));
    }

    @Test
    public void case55() {
        int N = 1541;
        assertEquals(630801461, thepermutationgame.findMin(N));
    }

    @Test
    public void case56() {
        int N = 448;
        assertEquals(215695038, thepermutationgame.findMin(N));
    }

    @Test
    public void case57() {
        int N = 13;
        assertEquals(360360, thepermutationgame.findMin(N));
    }

    @Test
    public void case58() {
        int N = 70;
        assertEquals(419737080, thepermutationgame.findMin(N));
    }

    @Test
    public void case59() {
        int N = 1311;
        assertEquals(938024783, thepermutationgame.findMin(N));
    }

    @Test
    public void case60() {
        int N = 7;
        assertEquals(420, thepermutationgame.findMin(N));
    }

    @Test
    public void case61() {
        int N = 3;
        assertEquals(6, thepermutationgame.findMin(N));
    }

    @Test
    public void case62() {
        int N = 3105;
        assertEquals(588601036, thepermutationgame.findMin(N));
    }

    @Test
    public void case63() {
        int N = 89893;
        assertEquals(594213079, thepermutationgame.findMin(N));
    }

    @Test
    public void case64() {
        int N = 19414;
        assertEquals(63013446, thepermutationgame.findMin(N));
    }

    @Test
    public void case65() {
        int N = 32570;
        assertEquals(965309544, thepermutationgame.findMin(N));
    }

    @Test
    public void case66() {
        int N = 14371;
        assertEquals(63854004, thepermutationgame.findMin(N));
    }

    @Test
    public void case67() {
        int N = 12386;
        assertEquals(608039160, thepermutationgame.findMin(N));
    }

    @Test
    public void case68() {
        int N = 75747;
        assertEquals(248650835, thepermutationgame.findMin(N));
    }

    @Test
    public void case69() {
        int N = 3743;
        assertEquals(67640556, thepermutationgame.findMin(N));
    }

    @Test
    public void case70() {
        int N = 30487;
        assertEquals(823181278, thepermutationgame.findMin(N));
    }

    @Test
    public void case71() {
        int N = 19852;
        assertEquals(397205410, thepermutationgame.findMin(N));
    }

    @Test
    public void case72() {
        int N = 3699;
        assertEquals(654343651, thepermutationgame.findMin(N));
    }

    @Test
    public void case73() {
        int N = 70458;
        assertEquals(168508059, thepermutationgame.findMin(N));
    }

    @Test
    public void case74() {
        int N = 16422;
        assertEquals(786864642, thepermutationgame.findMin(N));
    }

    @Test
    public void case75() {
        int N = 49978;
        assertEquals(739881009, thepermutationgame.findMin(N));
    }

    @Test
    public void case76() {
        int N = 30027;
        assertEquals(662326482, thepermutationgame.findMin(N));
    }

    @Test
    public void case77() {
        int N = 577;
        assertEquals(970663088, thepermutationgame.findMin(N));
    }

    @Test
    public void case78() {
        int N = 18061;
        assertEquals(492843004, thepermutationgame.findMin(N));
    }

    @Test
    public void case79() {
        int N = 12240;
        assertEquals(159347435, thepermutationgame.findMin(N));
    }

    @Test
    public void case80() {
        int N = 16738;
        assertEquals(903923151, thepermutationgame.findMin(N));
    }

    @Test
    public void case81() {
        int N = 2040;
        assertEquals(675966917, thepermutationgame.findMin(N));
    }

    @Test
    public void case82() {
        int N = 41511;
        assertEquals(149417417, thepermutationgame.findMin(N));
    }

    @Test
    public void case83() {
        int N = 93731;
        assertEquals(489330151, thepermutationgame.findMin(N));
    }

    @Test
    public void case84() {
        int N = 26656;
        assertEquals(544162488, thepermutationgame.findMin(N));
    }

    @Test
    public void case85() {
        int N = 45741;
        assertEquals(495256522, thepermutationgame.findMin(N));
    }

    @Test
    public void case86() {
        int N = 70174;
        assertEquals(223695140, thepermutationgame.findMin(N));
    }

    @Test
    public void case87() {
        int N = 1337;
        assertEquals(232134838, thepermutationgame.findMin(N));
    }

    @Test
    public void case88() {
        int N = 100000;
        assertEquals(59814054, thepermutationgame.findMin(N));
    }

    @Test
    public void case89() {
        int N = 99990;
        assertEquals(26863016, thepermutationgame.findMin(N));
    }

    @Test
    public void case90() {
        int N = 99991;
        assertEquals(59814054, thepermutationgame.findMin(N));
    }

    @Test
    public void case91() {
        int N = 1;
        assertEquals(1, thepermutationgame.findMin(N));
    }

    @Test
    public void case92() {
        int N = 32;
        assertEquals(551882779, thepermutationgame.findMin(N));
    }

    @Test
    public void case93() {
        int N = 99999;
        assertEquals(59814054, thepermutationgame.findMin(N));
    }

    @Test
    public void case94() {
        int N = 12345;
        assertEquals(733823350, thepermutationgame.findMin(N));
    }

    @Test
    public void case95() {
        int N = 70523;
        assertEquals(999268607, thepermutationgame.findMin(N));
    }

    @Test
    public void case96() {
        int N = 65536;
        assertEquals(551585434, thepermutationgame.findMin(N));
    }

    @Test
    public void case97() {
        int N = 4;
        assertEquals(12, thepermutationgame.findMin(N));
    }

    @Test
    public void case98() {
        int N = 98798;
        assertEquals(786222871, thepermutationgame.findMin(N));
    }

    @Test
    public void case99() {
        int N = 96720;
        assertEquals(477016810, thepermutationgame.findMin(N));
    }

    @Test
    public void case100() {
        int N = 9;
        assertEquals(2520, thepermutationgame.findMin(N));
    }

    @Test
    public void case101() {
        int N = 97966;
        assertEquals(744400308, thepermutationgame.findMin(N));
    }

}
