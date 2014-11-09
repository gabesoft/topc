package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class DeerInZooDivTwoTest {
    DeerInZooDivTwo deerinzoodivtwo = new DeerInZooDivTwo();

    @Test
    public void case1() {
        int N = 1;
        int K = 0;
        assertArrayEquals(new int[] { 1, 1 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case2() {
        int N = 1;
        int K = 1;
        assertArrayEquals(new int[] { 0, 0 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case3() {
        int N = 1;
        int K = 2;
        assertArrayEquals(new int[] { 0, 0 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case4() {
        int N = 2;
        int K = 0;
        assertArrayEquals(new int[] { 2, 2 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case5() {
        int N = 2;
        int K = 1;
        assertArrayEquals(new int[] { 1, 1 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case6() {
        int N = 2;
        int K = 2;
        assertArrayEquals(new int[] { 0, 1 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case7() {
        int N = 2;
        int K = 3;
        assertArrayEquals(new int[] { 0, 0 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case8() {
        int N = 2;
        int K = 4;
        assertArrayEquals(new int[] { 0, 0 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case9() {
        int N = 3;
        int K = 0;
        assertArrayEquals(new int[] { 3, 3 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case10() {
        int N = 3;
        int K = 1;
        assertArrayEquals(new int[] { 2, 2 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case11() {
        int N = 3;
        int K = 2;
        assertArrayEquals(new int[] { 1, 2 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case12() {
        int N = 3;
        int K = 3;
        assertArrayEquals(new int[] { 0, 1 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case13() {
        int N = 3;
        int K = 4;
        assertArrayEquals(new int[] { 0, 1 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case14() {
        int N = 3;
        int K = 5;
        assertArrayEquals(new int[] { 0, 0 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case15() {
        int N = 3;
        int K = 6;
        assertArrayEquals(new int[] { 0, 0 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case16() {
        int N = 10;
        int K = 0;
        assertArrayEquals(new int[] { 10, 10 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case17() {
        int N = 519;
        int K = 345;
        assertArrayEquals(new int[] { 174, 346 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case18() {
        int N = 942;
        int K = 1427;
        assertArrayEquals(new int[] { 0, 228 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case19() {
        int N = 958;
        int K = 1267;
        assertArrayEquals(new int[] { 0, 324 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case20() {
        int N = 975;
        int K = 49;
        assertArrayEquals(new int[] { 926, 950 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case21() {
        int N = 267;
        int K = 271;
        assertArrayEquals(new int[] { 0, 131 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case22() {
        int N = 337;
        int K = 325;
        assertArrayEquals(new int[] { 12, 174 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case23() {
        int N = 796;
        int K = 1589;
        assertArrayEquals(new int[] { 0, 1 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case24() {
        int N = 683;
        int K = 250;
        assertArrayEquals(new int[] { 433, 558 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case25() {
        int N = 566;
        int K = 403;
        assertArrayEquals(new int[] { 163, 364 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case26() {
        int N = 172;
        int K = 91;
        assertArrayEquals(new int[] { 81, 126 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case27() {
        int N = 370;
        int K = 393;
        assertArrayEquals(new int[] { 0, 173 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case28() {
        int N = 915;
        int K = 1104;
        assertArrayEquals(new int[] { 0, 363 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case29() {
        int N = 912;
        int K = 1711;
        assertArrayEquals(new int[] { 0, 56 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case30() {
        int N = 68;
        int K = 77;
        assertArrayEquals(new int[] { 0, 29 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case31() {
        int N = 778;
        int K = 697;
        assertArrayEquals(new int[] { 81, 429 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case32() {
        int N = 106;
        int K = 76;
        assertArrayEquals(new int[] { 30, 68 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case33() {
        int N = 142;
        int K = 160;
        assertArrayEquals(new int[] { 0, 62 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case34() {
        int N = 301;
        int K = 275;
        assertArrayEquals(new int[] { 26, 163 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case35() {
        int N = 364;
        int K = 12;
        assertArrayEquals(new int[] { 352, 358 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case36() {
        int N = 306;
        int K = 339;
        assertArrayEquals(new int[] { 0, 136 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case37() {
        int N = 363;
        int K = 156;
        assertArrayEquals(new int[] { 207, 285 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case38() {
        int N = 126;
        int K = 39;
        assertArrayEquals(new int[] { 87, 106 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case39() {
        int N = 970;
        int K = 58;
        assertArrayEquals(new int[] { 912, 941 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case40() {
        int N = 655;
        int K = 1289;
        assertArrayEquals(new int[] { 0, 10 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case41() {
        int N = 227;
        int K = 177;
        assertArrayEquals(new int[] { 50, 138 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case42() {
        int N = 984;
        int K = 139;
        assertArrayEquals(new int[] { 845, 914 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case43() {
        int N = 977;
        int K = 433;
        assertArrayEquals(new int[] { 544, 760 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case44() {
        int N = 649;
        int K = 533;
        assertArrayEquals(new int[] { 116, 382 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case45() {
        int N = 780;
        int K = 1290;
        assertArrayEquals(new int[] { 0, 135 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case46() {
        int N = 883;
        int K = 412;
        assertArrayEquals(new int[] { 471, 677 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case47() {
        int N = 937;
        int K = 1434;
        assertArrayEquals(new int[] { 0, 220 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case48() {
        int N = 80;
        int K = 93;
        assertArrayEquals(new int[] { 0, 33 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case49() {
        int N = 348;
        int K = 378;
        assertArrayEquals(new int[] { 0, 159 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case50() {
        int N = 603;
        int K = 729;
        assertArrayEquals(new int[] { 0, 238 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case51() {
        int N = 402;
        int K = 597;
        assertArrayEquals(new int[] { 0, 103 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case52() {
        int N = 161;
        int K = 292;
        assertArrayEquals(new int[] { 0, 15 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case53() {
        int N = 887;
        int K = 1153;
        assertArrayEquals(new int[] { 0, 310 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case54() {
        int N = 654;
        int K = 321;
        assertArrayEquals(new int[] { 333, 493 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case55() {
        int N = 435;
        int K = 355;
        assertArrayEquals(new int[] { 80, 257 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case56() {
        int N = 275;
        int K = 340;
        assertArrayEquals(new int[] { 0, 105 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case57() {
        int N = 14;
        int K = 19;
        assertArrayEquals(new int[] { 0, 4 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case58() {
        int N = 206;
        int K = 350;
        assertArrayEquals(new int[] { 0, 31 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case59() {
        int N = 113;
        int K = 49;
        assertArrayEquals(new int[] { 64, 88 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case60() {
        int N = 287;
        int K = 82;
        assertArrayEquals(new int[] { 205, 246 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case61() {
        int N = 614;
        int K = 1015;
        assertArrayEquals(new int[] { 0, 106 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case62() {
        int N = 965;
        int K = 609;
        assertArrayEquals(new int[] { 356, 660 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case63() {
        int N = 969;
        int K = 517;
        assertArrayEquals(new int[] { 452, 710 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case64() {
        int N = 882;
        int K = 1091;
        assertArrayEquals(new int[] { 0, 336 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case65() {
        int N = 434;
        int K = 107;
        assertArrayEquals(new int[] { 327, 380 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case66() {
        int N = 100;
        int K = 193;
        assertArrayEquals(new int[] { 0, 3 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case67() {
        int N = 100;
        int K = 100;
        assertArrayEquals(new int[] { 0, 50 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case68() {
        int N = 100;
        int K = 0;
        assertArrayEquals(new int[] { 100, 100 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case69() {
        int N = 5;
        int K = 2;
        assertArrayEquals(new int[] { 3, 4 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case70() {
        int N = 650;
        int K = 350;
        assertArrayEquals(new int[] { 300, 475 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case71() {
        int N = 5;
        int K = 10;
        assertArrayEquals(new int[] { 0, 0 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case72() {
        int N = 10;
        int K = 5;
        assertArrayEquals(new int[] { 5, 7 }, deerinzoodivtwo.getminmax(N, K));
    }

    @Test
    public void case73() {
        int N = 7;
        int K = 3;
        assertArrayEquals(new int[] { 4, 5 }, deerinzoodivtwo.getminmax(N, K));
    }

}
