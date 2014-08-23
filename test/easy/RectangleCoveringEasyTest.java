package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class RectangleCoveringEasyTest {
    RectangleCoveringEasy rectanglecoveringeasy = new RectangleCoveringEasy();

    @Test
    public void case1() {
        int holeH = 3;
        int holeW = 5;
        int boardH = 4;
        int boardW = 6;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case2() {
        int holeH = 1;
        int holeW = 1;
        int boardH = 1;
        int boardW = 1;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case3() {
        int holeH = 3;
        int holeW = 10;
        int boardH = 3;
        int boardW = 12;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case4() {
        int holeH = 10;
        int holeW = 20;
        int boardH = 25;
        int boardW = 15;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case5() {
        int holeH = 1000000000;
        int holeW = 1000000000;
        int boardH = 1000000000;
        int boardW = 1000000000;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case6() {
        int holeH = 1000000000;
        int holeW = 1000000000;
        int boardH = 1000000000;
        int boardW = 999999999;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case7() {
        int holeH = 1000000000;
        int holeW = 1000000000;
        int boardH = 999999999;
        int boardW = 1000000000;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case8() {
        int holeH = 1000000000;
        int holeW = 1000000000;
        int boardH = 999999999;
        int boardW = 999999999;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case9() {
        int holeH = 1000000000;
        int holeW = 999999999;
        int boardH = 1000000000;
        int boardW = 1000000000;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case10() {
        int holeH = 1000000000;
        int holeW = 999999999;
        int boardH = 1000000000;
        int boardW = 999999999;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case11() {
        int holeH = 1000000000;
        int holeW = 999999999;
        int boardH = 999999999;
        int boardW = 1000000000;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case12() {
        int holeH = 1000000000;
        int holeW = 999999999;
        int boardH = 999999999;
        int boardW = 999999999;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case13() {
        int holeH = 999999999;
        int holeW = 1000000000;
        int boardH = 1000000000;
        int boardW = 1000000000;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case14() {
        int holeH = 999999999;
        int holeW = 1000000000;
        int boardH = 1000000000;
        int boardW = 999999999;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case15() {
        int holeH = 999999999;
        int holeW = 1000000000;
        int boardH = 999999999;
        int boardW = 1000000000;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case16() {
        int holeH = 999999999;
        int holeW = 1000000000;
        int boardH = 999999999;
        int boardW = 999999999;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case17() {
        int holeH = 999999999;
        int holeW = 999999999;
        int boardH = 1000000000;
        int boardW = 1000000000;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case18() {
        int holeH = 999999999;
        int holeW = 999999999;
        int boardH = 1000000000;
        int boardW = 999999999;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case19() {
        int holeH = 999999999;
        int holeW = 999999999;
        int boardH = 999999999;
        int boardW = 1000000000;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case20() {
        int holeH = 999999999;
        int holeW = 999999999;
        int boardH = 999999999;
        int boardW = 999999999;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case21() {
        int holeH = 59380716;
        int holeW = 230567922;
        int boardH = 892314287;
        int boardW = 389736837;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case22() {
        int holeH = 602841311;
        int holeW = 910449437;
        int boardH = 3919002;
        int boardW = 932964157;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case23() {
        int holeH = 128538656;
        int holeW = 214954110;
        int boardH = 144294055;
        int boardW = 898432969;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case24() {
        int holeH = 334773024;
        int holeW = 726544904;
        int boardH = 205916095;
        int boardW = 165099777;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case25() {
        int holeH = 67129349;
        int holeW = 721105430;
        int boardH = 371099570;
        int boardW = 127396315;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case26() {
        int holeH = 511998071;
        int holeW = 670448203;
        int boardH = 458277225;
        int boardW = 344992218;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case27() {
        int holeH = 202612029;
        int holeW = 399674588;
        int boardH = 579309961;
        int boardW = 86859026;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case28() {
        int holeH = 789273946;
        int holeW = 927982142;
        int boardH = 373793014;
        int boardW = 427816921;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case29() {
        int holeH = 740098069;
        int holeW = 697842470;
        int boardH = 24521941;
        int boardW = 725384387;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case30() {
        int holeH = 211788018;
        int holeW = 162920072;
        int boardH = 553590925;
        int boardW = 983540390;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case31() {
        int holeH = 309545398;
        int holeW = 706757531;
        int boardH = 550995393;
        int boardW = 565874838;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case32() {
        int holeH = 477912167;
        int holeW = 587449810;
        int boardH = 107057750;
        int boardW = 19832808;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case33() {
        int holeH = 242189128;
        int holeW = 809443043;
        int boardH = 354634354;
        int boardW = 206345777;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case34() {
        int holeH = 636061686;
        int holeW = 272277524;
        int boardH = 449841814;
        int boardW = 388424872;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case35() {
        int holeH = 770062869;
        int holeW = 270343529;
        int boardH = 57665564;
        int boardW = 120582048;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case36() {
        int holeH = 388615697;
        int holeW = 961075764;
        int boardH = 868869557;
        int boardW = 290052366;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case37() {
        int holeH = 708064945;
        int holeW = 821926059;
        int boardH = 539900934;
        int boardW = 358874372;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case38() {
        int holeH = 862731001;
        int holeW = 355386691;
        int boardH = 855618549;
        int boardW = 19415513;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case39() {
        int holeH = 1;
        int holeW = 2;
        int boardH = 3;
        int boardW = 4;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case40() {
        int holeH = 1;
        int holeW = 2;
        int boardH = 4;
        int boardW = 3;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case41() {
        int holeH = 1;
        int holeW = 3;
        int boardH = 2;
        int boardW = 4;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case42() {
        int holeH = 1;
        int holeW = 3;
        int boardH = 4;
        int boardW = 2;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case43() {
        int holeH = 1;
        int holeW = 4;
        int boardH = 2;
        int boardW = 3;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case44() {
        int holeH = 1;
        int holeW = 4;
        int boardH = 3;
        int boardW = 2;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case45() {
        int holeH = 2;
        int holeW = 1;
        int boardH = 3;
        int boardW = 4;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case46() {
        int holeH = 2;
        int holeW = 1;
        int boardH = 4;
        int boardW = 3;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case47() {
        int holeH = 2;
        int holeW = 3;
        int boardH = 1;
        int boardW = 4;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case48() {
        int holeH = 2;
        int holeW = 3;
        int boardH = 4;
        int boardW = 1;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case49() {
        int holeH = 2;
        int holeW = 4;
        int boardH = 1;
        int boardW = 3;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case50() {
        int holeH = 2;
        int holeW = 4;
        int boardH = 3;
        int boardW = 1;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case51() {
        int holeH = 3;
        int holeW = 1;
        int boardH = 2;
        int boardW = 4;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case52() {
        int holeH = 3;
        int holeW = 1;
        int boardH = 4;
        int boardW = 2;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case53() {
        int holeH = 3;
        int holeW = 2;
        int boardH = 1;
        int boardW = 4;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case54() {
        int holeH = 3;
        int holeW = 2;
        int boardH = 4;
        int boardW = 1;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case55() {
        int holeH = 3;
        int holeW = 4;
        int boardH = 1;
        int boardW = 2;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case56() {
        int holeH = 3;
        int holeW = 4;
        int boardH = 2;
        int boardW = 1;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case57() {
        int holeH = 4;
        int holeW = 1;
        int boardH = 2;
        int boardW = 3;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case58() {
        int holeH = 4;
        int holeW = 1;
        int boardH = 3;
        int boardW = 2;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case59() {
        int holeH = 4;
        int holeW = 2;
        int boardH = 1;
        int boardW = 3;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case60() {
        int holeH = 4;
        int holeW = 2;
        int boardH = 3;
        int boardW = 1;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case61() {
        int holeH = 4;
        int holeW = 3;
        int boardH = 1;
        int boardW = 2;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case62() {
        int holeH = 4;
        int holeW = 3;
        int boardH = 2;
        int boardW = 1;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case63() {
        int holeH = 5;
        int holeW = 3;
        int boardH = 3;
        int boardW = 10;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case64() {
        int holeH = 5;
        int holeW = 3;
        int boardH = 4;
        int boardW = 5;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case65() {
        int holeH = 1;
        int holeW = 2;
        int boardH = 2;
        int boardW = 1;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case66() {
        int holeH = 1;
        int holeW = 3;
        int boardH = 3;
        int boardW = 2;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case67() {
        int holeH = 3;
        int holeW = 1;
        int boardH = 2;
        int boardW = 3;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case68() {
        int holeH = 3;
        int holeW = 1;
        int boardH = 1;
        int boardW = 3;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case69() {
        int holeH = 3;
        int holeW = 2;
        int boardH = 3;
        int boardW = 3;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case70() {
        int holeH = 3;
        int holeW = 2;
        int boardH = 1;
        int boardW = 10;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case71() {
        int holeH = 2;
        int holeW = 2;
        int boardH = 2;
        int boardW = 3;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case72() {
        int holeH = 10;
        int holeW = 10;
        int boardH = 5;
        int boardW = 1000;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case73() {
        int holeH = 200;
        int holeW = 100;
        int boardH = 150;
        int boardW = 150;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case74() {
        int holeH = 1;
        int holeW = 2;
        int boardH = 1;
        int boardW = 5;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case75() {
        int holeH = 3;
        int holeW = 5;
        int boardH = 3;
        int boardW = 6;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case76() {
        int holeH = 5;
        int holeW = 4;
        int boardH = 5;
        int boardW = 5;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case77() {
        int holeH = 2;
        int holeW = 4;
        int boardH = 1;
        int boardW = 10;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case78() {
        int holeH = 4;
        int holeW = 9;
        int boardH = 8;
        int boardW = 6;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case79() {
        int holeH = 1;
        int holeW = 3;
        int boardH = 2;
        int boardW = 2;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case80() {
        int holeH = 1;
        int holeW = 3;
        int boardH = 3;
        int boardW = 1;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case81() {
        int holeH = 2;
        int holeW = 4;
        int boardH = 4;
        int boardW = 2;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case82() {
        int holeH = 1;
        int holeW = 5;
        int boardH = 2;
        int boardW = 4;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case83() {
        int holeH = 3;
        int holeW = 3;
        int boardH = 2;
        int boardW = 10;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case84() {
        int holeH = 2;
        int holeW = 3;
        int boardH = 3;
        int boardW = 2;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case85() {
        int holeH = 3;
        int holeW = 10;
        int boardH = 3;
        int boardW = 11;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case86() {
        int holeH = 4;
        int holeW = 5;
        int boardH = 6;
        int boardW = 2;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case87() {
        int holeH = 4;
        int holeW = 5;
        int boardH = 2;
        int boardW = 15;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case88() {
        int holeH = 5;
        int holeW = 9;
        int boardH = 8;
        int boardW = 6;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case89() {
        int holeH = 5;
        int holeW = 5;
        int boardH = 4;
        int boardW = 100;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case90() {
        int holeH = 2;
        int holeW = 100;
        int boardH = 1;
        int boardW = 200;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case91() {
        int holeH = 3;
        int holeW = 5;
        int boardH = 2;
        int boardW = 6;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case92() {
        int holeH = 3;
        int holeW = 10;
        int boardH = 4;
        int boardW = 7;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case93() {
        int holeH = 10;
        int holeW = 100;
        int boardH = 11;
        int boardW = 12;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case94() {
        int holeH = 3;
        int holeW = 2;
        int boardH = 7;
        int boardW = 1;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case95() {
        int holeH = 3;
        int holeW = 5;
        int boardH = 3;
        int boardW = 8;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case96() {
        int holeH = 1000000000;
        int holeW = 1;
        int boardH = 1000000000;
        int boardW = 1000000000;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case97() {
        int holeH = 2;
        int holeW = 2;
        int boardH = 1;
        int boardW = 100000;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case98() {
        int holeH = 10;
        int holeW = 10;
        int boardH = 11;
        int boardW = 10;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case99() {
        int holeH = 2;
        int holeW = 2;
        int boardH = 3;
        int boardW = 2;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case100() {
        int holeH = 1;
        int holeW = 5;
        int boardH = 2;
        int boardW = 3;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case101() {
        int holeH = 1;
        int holeW = 1;
        int boardH = 2;
        int boardW = 1;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case102() {
        int holeH = 3;
        int holeW = 5;
        int boardH = 4;
        int boardW = 5;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case103() {
        int holeH = 2;
        int holeW = 2;
        int boardH = 1;
        int boardW = 4;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case104() {
        int holeH = 1;
        int holeW = 2;
        int boardH = 3;
        int boardW = 1;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case105() {
        int holeH = 5;
        int holeW = 5;
        int boardH = 4;
        int boardW = 4;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case106() {
        int holeH = 3;
        int holeW = 4;
        int boardH = 2;
        int boardW = 8;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case107() {
        int holeH = 2;
        int holeW = 100;
        int boardH = 1;
        int boardW = 500;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case108() {
        int holeH = 3;
        int holeW = 2;
        int boardH = 4;
        int boardW = 2;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case109() {
        int holeH = 3;
        int holeW = 10;
        int boardH = 9;
        int boardW = 3;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case110() {
        int holeH = 5;
        int holeW = 6;
        int boardH = 7;
        int boardW = 5;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case111() {
        int holeH = 5;
        int holeW = 5;
        int boardH = 2;
        int boardW = 10;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case112() {
        int holeH = 4;
        int holeW = 2;
        int boardH = 4;
        int boardW = 4;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case113() {
        int holeH = 10;
        int holeW = 100;
        int boardH = 11;
        int boardW = 100;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case114() {
        int holeH = 4;
        int holeW = 6;
        int boardH = 5;
        int boardW = 6;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case115() {
        int holeH = 5;
        int holeW = 3;
        int boardH = 5;
        int boardW = 4;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case116() {
        int holeH = 2;
        int holeW = 3;
        int boardH = 1;
        int boardW = 10;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case117() {
        int holeH = 1;
        int holeW = 10;
        int boardH = 4;
        int boardW = 4;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case118() {
        int holeH = 10;
        int holeW = 5;
        int boardH = 12;
        int boardW = 12;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case119() {
        int holeH = 5;
        int holeW = 8;
        int boardH = 4;
        int boardW = 10;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case120() {
        int holeH = 2;
        int holeW = 1000;
        int boardH = 1001;
        int boardW = 1;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case121() {
        int holeH = 5;
        int holeW = 5;
        int boardH = 5;
        int boardW = 4;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case122() {
        int holeH = 1;
        int holeW = 2;
        int boardH = 2;
        int boardW = 2;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case123() {
        int holeH = 5;
        int holeW = 8;
        int boardH = 5;
        int boardW = 9;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case124() {
        int holeH = 3;
        int holeW = 4;
        int boardH = 4;
        int boardW = 4;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case125() {
        int holeH = 6;
        int holeW = 2;
        int boardH = 6;
        int boardW = 5;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case126() {
        int holeH = 3;
        int holeW = 5;
        int boardH = 2;
        int boardW = 10;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case127() {
        int holeH = 2;
        int holeW = 3;
        int boardH = 1;
        int boardW = 1;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case128() {
        int holeH = 5;
        int holeW = 5;
        int boardH = 4;
        int boardW = 7;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case129() {
        int holeH = 2;
        int holeW = 10;
        int boardH = 3;
        int boardW = 5;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case130() {
        int holeH = 2;
        int holeW = 5;
        int boardH = 1;
        int boardW = 6;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case131() {
        int holeH = 9;
        int holeW = 1;
        int boardH = 8;
        int boardW = 2;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case132() {
        int holeH = 20;
        int holeW = 4;
        int boardH = 22;
        int boardW = 3;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case133() {
        int holeH = 10;
        int holeW = 15;
        int boardH = 11;
        int boardW = 15;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case134() {
        int holeH = 3;
        int holeW = 5;
        int boardH = 5;
        int boardW = 3;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case135() {
        int holeH = 3;
        int holeW = 10;
        int boardH = 2;
        int boardW = 12;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case136() {
        int holeH = 10;
        int holeW = 3;
        int boardH = 3;
        int boardW = 25;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case137() {
        int holeH = 4;
        int holeW = 7;
        int boardH = 5;
        int boardW = 6;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case138() {
        int holeH = 3;
        int holeW = 1;
        int boardH = 1;
        int boardW = 4;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case139() {
        int holeH = 3;
        int holeW = 4;
        int boardH = 1;
        int boardW = 1000;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case140() {
        int holeH = 2;
        int holeW = 2;
        int boardH = 1;
        int boardW = 10;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case141() {
        int holeH = 3;
        int holeW = 3;
        int boardH = 3;
        int boardW = 4;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case142() {
        int holeH = 3;
        int holeW = 8;
        int boardH = 5;
        int boardW = 7;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case143() {
        int holeH = 5;
        int holeW = 10;
        int boardH = 7;
        int boardW = 10;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case144() {
        int holeH = 2;
        int holeW = 100;
        int boardH = 3;
        int boardW = 4;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case145() {
        int holeH = 9;
        int holeW = 9;
        int boardH = 1;
        int boardW = 1;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case146() {
        int holeH = 12;
        int holeW = 10;
        int boardH = 12;
        int boardW = 11;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case147() {
        int holeH = 2;
        int holeW = 2;
        int boardH = 1;
        int boardW = 6;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case148() {
        int holeH = 3;
        int holeW = 3;
        int boardH = 2;
        int boardW = 4;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case149() {
        int holeH = 3;
        int holeW = 4;
        int boardH = 1;
        int boardW = 9;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case150() {
        int holeH = 3;
        int holeW = 10;
        int boardH = 2;
        int boardW = 15;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case151() {
        int holeH = 5;
        int holeW = 5;
        int boardH = 10;
        int boardW = 5;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case152() {
        int holeH = 2;
        int holeW = 3;
        int boardH = 3;
        int boardW = 3;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case153() {
        int holeH = 6;
        int holeW = 7;
        int boardH = 13;
        int boardW = 1;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case154() {
        int holeH = 3;
        int holeW = 3;
        int boardH = 2;
        int boardW = 5;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case155() {
        int holeH = 3;
        int holeW = 3;
        int boardH = 4;
        int boardW = 4;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case156() {
        int holeH = 3;
        int holeW = 4;
        int boardH = 3;
        int boardW = 5;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case157() {
        int holeH = 4;
        int holeW = 5;
        int boardH = 5;
        int boardW = 5;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case158() {
        int holeH = 3;
        int holeW = 10;
        int boardH = 12;
        int boardW = 3;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case159() {
        int holeH = 1;
        int holeW = 100;
        int boardH = 2;
        int boardW = 100;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case160() {
        int holeH = 15;
        int holeW = 10;
        int boardH = 16;
        int boardW = 9;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case161() {
        int holeH = 2;
        int holeW = 2;
        int boardH = 1;
        int boardW = 3;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case162() {
        int holeH = 3;
        int holeW = 4;
        int boardH = 6;
        int boardW = 2;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case163() {
        int holeH = 3;
        int holeW = 1;
        int boardH = 2;
        int boardW = 2;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case164() {
        int holeH = 3;
        int holeW = 5;
        int boardH = 6;
        int boardW = 3;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case165() {
        int holeH = 2;
        int holeW = 3;
        int boardH = 4;
        int boardW = 2;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case166() {
        int holeH = 5;
        int holeW = 2;
        int boardH = 8;
        int boardW = 2;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case167() {
        int holeH = 3;
        int holeW = 5;
        int boardH = 5;
        int boardW = 5;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case168() {
        int holeH = 3;
        int holeW = 3;
        int boardH = 4;
        int boardW = 2;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case169() {
        int holeH = 4;
        int holeW = 10;
        int boardH = 5;
        int boardW = 5;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case170() {
        int holeH = 1;
        int holeW = 1;
        int boardH = 1;
        int boardW = 2;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case171() {
        int holeH = 3;
        int holeW = 10;
        int boardH = 3;
        int boardW = 25;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case172() {
        int holeH = 3;
        int holeW = 4;
        int boardH = 4;
        int boardW = 3;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case173() {
        int holeH = 2;
        int holeW = 1;
        int boardH = 3;
        int boardW = 1;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case174() {
        int holeH = 5;
        int holeW = 10;
        int boardH = 11;
        int boardW = 4;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case175() {
        int holeH = 1;
        int holeW = 10;
        int boardH = 3;
        int boardW = 4;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case176() {
        int holeH = 10;
        int holeW = 10;
        int boardH = 1000000000;
        int boardW = 1000000000;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case177() {
        int holeH = 1;
        int holeW = 10;
        int boardH = 3;
        int boardW = 6;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case178() {
        int holeH = 5;
        int holeW = 10;
        int boardH = 11;
        int boardW = 5;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case179() {
        int holeH = 10;
        int holeW = 10;
        int boardH = 1;
        int boardW = 20;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case180() {
        int holeH = 2;
        int holeW = 8;
        int boardH = 3;
        int boardW = 7;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case181() {
        int holeH = 10;
        int holeW = 5;
        int boardH = 11;
        int boardW = 5;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case182() {
        int holeH = 8;
        int holeW = 2;
        int boardH = 10;
        int boardW = 1;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case183() {
        int holeH = 5;
        int holeW = 4;
        int boardH = 6;
        int boardW = 4;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case184() {
        int holeH = 5;
        int holeW = 6;
        int boardH = 5;
        int boardW = 7;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case185() {
        int holeH = 5;
        int holeW = 5;
        int boardH = 7;
        int boardW = 4;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case186() {
        int holeH = 5;
        int holeW = 3;
        int boardH = 9;
        int boardW = 3;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case187() {
        int holeH = 10;
        int holeW = 10;
        int boardH = 100;
        int boardW = 5;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case188() {
        int holeH = 4;
        int holeW = 2;
        int boardH = 2;
        int boardW = 5;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case189() {
        int holeH = 1;
        int holeW = 1;
        int boardH = 1000000000;
        int boardW = 1000000000;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case190() {
        int holeH = 12;
        int holeW = 10;
        int boardH = 10;
        int boardW = 13;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case191() {
        int holeH = 1;
        int holeW = 5;
        int boardH = 2;
        int boardW = 5;
        assertEquals(1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case192() {
        int holeH = 5;
        int holeW = 8;
        int boardH = 7;
        int boardW = 5;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

    @Test
    public void case193() {
        int holeH = 10;
        int holeW = 3;
        int boardH = 9;
        int boardW = 3;
        assertEquals(-1, rectanglecoveringeasy.solve(holeH, holeW, boardH, boardW));
    }

}
