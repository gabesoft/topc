package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class StonesGameTest {
    StonesGame stonesgame = new StonesGame();

    @Test
    public void case1() {
        int N = 2;
        int M = 1;
        int K = 2;
        int L = 2;
        assertEquals("Romeo", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case2() {
        int N = 3;
        int M = 1;
        int K = 1;
        int L = 2;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case3() {
        int N = 5;
        int M = 1;
        int K = 2;
        int L = 2;
        assertEquals("Romeo", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case4() {
        int N = 5;
        int M = 5;
        int K = 2;
        int L = 3;
        assertEquals("Strangelet", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case5() {
        int N = 5;
        int M = 5;
        int K = 2;
        int L = 2;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case6() {
        int N = 2;
        int M = 1;
        int K = 1;
        int L = 2;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case7() {
        int N = 2;
        int M = 2;
        int K = 1;
        int L = 1;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case8() {
        int N = 2;
        int M = 1;
        int K = 2;
        int L = 2;
        assertEquals("Romeo", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case9() {
        int N = 2;
        int M = 2;
        int K = 2;
        int L = 1;
        assertEquals("Romeo", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case10() {
        int N = 3;
        int M = 1;
        int K = 1;
        int L = 2;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case11() {
        int N = 3;
        int M = 1;
        int K = 1;
        int L = 3;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case12() {
        int N = 3;
        int M = 2;
        int K = 1;
        int L = 1;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case13() {
        int N = 3;
        int M = 2;
        int K = 1;
        int L = 3;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case14() {
        int N = 3;
        int M = 3;
        int K = 1;
        int L = 1;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case15() {
        int N = 3;
        int M = 3;
        int K = 1;
        int L = 2;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case16() {
        int N = 3;
        int M = 1;
        int K = 2;
        int L = 2;
        assertEquals("Romeo", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case17() {
        int N = 3;
        int M = 1;
        int K = 2;
        int L = 3;
        assertEquals("Strangelet", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case18() {
        int N = 3;
        int M = 2;
        int K = 2;
        int L = 1;
        assertEquals("Romeo", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case19() {
        int N = 3;
        int M = 2;
        int K = 2;
        int L = 3;
        assertEquals("Romeo", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case20() {
        int N = 3;
        int M = 3;
        int K = 2;
        int L = 1;
        assertEquals("Strangelet", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case21() {
        int N = 3;
        int M = 3;
        int K = 2;
        int L = 2;
        assertEquals("Romeo", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case22() {
        int N = 3;
        int M = 1;
        int K = 3;
        int L = 2;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case23() {
        int N = 3;
        int M = 1;
        int K = 3;
        int L = 3;
        assertEquals("Romeo", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case24() {
        int N = 3;
        int M = 2;
        int K = 3;
        int L = 1;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case25() {
        int N = 3;
        int M = 2;
        int K = 3;
        int L = 3;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case26() {
        int N = 3;
        int M = 3;
        int K = 3;
        int L = 1;
        assertEquals("Romeo", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case27() {
        int N = 3;
        int M = 3;
        int K = 3;
        int L = 2;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case28() {
        int N = 10;
        int M = 1;
        int K = 8;
        int L = 5;
        assertEquals("Strangelet", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case29() {
        int N = 9;
        int M = 3;
        int K = 3;
        int L = 9;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case30() {
        int N = 6;
        int M = 6;
        int K = 4;
        int L = 2;
        assertEquals("Strangelet", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case31() {
        int N = 6;
        int M = 1;
        int K = 3;
        int L = 4;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case32() {
        int N = 8;
        int M = 2;
        int K = 5;
        int L = 7;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case33() {
        int N = 9;
        int M = 6;
        int K = 8;
        int L = 7;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case34() {
        int N = 7;
        int M = 6;
        int K = 2;
        int L = 2;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case35() {
        int N = 10;
        int M = 3;
        int K = 9;
        int L = 10;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case36() {
        int N = 10;
        int M = 5;
        int K = 10;
        int L = 6;
        assertEquals("Romeo", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case37() {
        int N = 10;
        int M = 4;
        int K = 2;
        int L = 3;
        assertEquals("Romeo", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case38() {
        int N = 8;
        int M = 8;
        int K = 1;
        int L = 6;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case39() {
        int N = 10;
        int M = 5;
        int K = 9;
        int L = 8;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case40() {
        int N = 9;
        int M = 8;
        int K = 7;
        int L = 4;
        assertEquals("Romeo", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case41() {
        int N = 10;
        int M = 9;
        int K = 2;
        int L = 10;
        assertEquals("Romeo", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case42() {
        int N = 9;
        int M = 7;
        int K = 3;
        int L = 6;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case43() {
        int N = 5;
        int M = 3;
        int K = 2;
        int L = 1;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case44() {
        int N = 9;
        int M = 1;
        int K = 5;
        int L = 6;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case45() {
        int N = 7;
        int M = 7;
        int K = 3;
        int L = 4;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case46() {
        int N = 8;
        int M = 3;
        int K = 8;
        int L = 5;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case47() {
        int N = 10;
        int M = 10;
        int K = 9;
        int L = 5;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case48() {
        int N = 1000000;
        int M = 131525;
        int K = 705444;
        int L = 275309;
        assertEquals("Strangelet", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case49() {
        int N = 1000000;
        int M = 251567;
        int K = 705444;
        int L = 6097;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case50() {
        int N = 1000000;
        int M = 804588;
        int K = 705444;
        int L = 292263;
        assertEquals("Romeo", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case51() {
        int N = 1000000;
        int M = 791181;
        int K = 347709;
        int L = 721626;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case52() {
        int N = 1000000;
        int M = 43795;
        int K = 347709;
        int L = 506697;
        assertEquals("Strangelet", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case53() {
        int N = 1000000;
        int M = 595477;
        int K = 347709;
        int L = 275837;
        assertEquals("Romeo", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case54() {
        int N = 1000000;
        int M = 157692;
        int K = 569590;
        int L = 680270;
        assertEquals("Strangelet", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case55() {
        int N = 1000000;
        int M = 141323;
        int K = 569590;
        int L = 144412;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case56() {
        int N = 1000000;
        int M = 127671;
        int K = 569590;
        int L = 464318;
        assertEquals("Romeo", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case57() {
        int N = 1000000;
        int M = 418768;
        int K = 623197;
        int L = 388979;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case58() {
        int N = 1000000;
        int M = 205057;
        int K = 623197;
        int L = 459153;
        assertEquals("Romeo", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case59() {
        int N = 1000000;
        int M = 187669;
        int K = 623197;
        int L = 410751;
        assertEquals("Strangelet", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case60() {
        int N = 1000000;
        int M = 279207;
        int K = 267101;
        int L = 658544;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case61() {
        int N = 1000000;
        int M = 897139;
        int K = 267101;
        int L = 646247;
        assertEquals("Romeo", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case62() {
        int N = 1000000;
        int M = 986533;
        int K = 267101;
        int L = 708351;
        assertEquals("Strangelet", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case63() {
        int N = 1000000;
        int M = 357987;
        int K = 475408;
        int L = 202189;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case64() {
        int N = 1000000;
        int M = 971540;
        int K = 475408;
        int L = 333102;
        assertEquals("Strangelet", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case65() {
        int N = 1000000;
        int M = 805503;
        int K = 475408;
        int L = 624982;
        assertEquals("Romeo", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case66() {
        int N = 1000000;
        int M = 918661;
        int K = 676615;
        int L = 730548;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case67() {
        int N = 1000000;
        int M = 238455;
        int K = 676615;
        int L = 664919;
        assertEquals("Romeo", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case68() {
        int N = 1000000;
        int M = 821658;
        int K = 676615;
        int L = 801838;
        assertEquals("Strangelet", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case69() {
        int N = 1000000;
        int M = 467470;
        int K = 270595;
        int L = 380885;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case70() {
        int N = 1000000;
        int M = 662889;
        int K = 270595;
        int L = 600781;
        assertEquals("Romeo", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case71() {
        int N = 1000000;
        int M = 922371;
        int K = 270595;
        int L = 910759;
        assertEquals("Strangelet", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case72() {
        int N = 1000000;
        int M = 220322;
        int K = 93517;
        int L = 660116;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case73() {
        int N = 1000000;
        int M = 374352;
        int K = 93517;
        int L = 354850;
        assertEquals("Romeo", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case74() {
        int N = 1000000;
        int M = 965405;
        int K = 93517;
        int L = 861365;
        assertEquals("Strangelet", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case75() {
        int N = 1000000;
        int M = 907614;
        int K = 548991;
        int L = 220911;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case76() {
        int N = 1000000;
        int M = 238793;
        int K = 548991;
        int L = 242437;
        assertEquals("Strangelet", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case77() {
        int N = 1000000;
        int M = 730836;
        int K = 548991;
        int L = 640234;
        assertEquals("Romeo", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case78() {
        int N = 999999;
        int M = 1;
        int K = 500000;
        int L = 999999;
        assertEquals("Strangelet", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case79() {
        int N = 1000000;
        int M = 100000;
        int K = 500000;
        int L = 600000;
        assertEquals("Strangelet", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case80() {
        int N = 1000000;
        int M = 1000000;
        int K = 1000000;
        int L = 999999;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case81() {
        int N = 137;
        int M = 85;
        int K = 32;
        int L = 116;
        assertEquals("Romeo", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case82() {
        int N = 954;
        int M = 545;
        int K = 2;
        int L = 58;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case83() {
        int N = 6;
        int M = 5;
        int K = 1;
        int L = 2;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case84() {
        int N = 7;
        int M = 1;
        int K = 7;
        int L = 5;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case85() {
        int N = 42;
        int M = 1;
        int K = 2;
        int L = 17;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case86() {
        int N = 232;
        int M = 1;
        int K = 160;
        int L = 2;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case87() {
        int N = 96;
        int M = 85;
        int K = 21;
        int L = 65;
        assertEquals("Romeo", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case88() {
        int N = 4;
        int M = 1;
        int K = 4;
        int L = 3;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case89() {
        int N = 3;
        int M = 1;
        int K = 3;
        int L = 3;
        assertEquals("Romeo", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case90() {
        int N = 946;
        int M = 243;
        int K = 1;
        int L = 426;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case91() {
        int N = 44;
        int M = 13;
        int K = 2;
        int L = 30;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case92() {
        int N = 36;
        int M = 36;
        int K = 26;
        int L = 14;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case93() {
        int N = 153;
        int M = 153;
        int K = 63;
        int L = 44;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case94() {
        int N = 6;
        int M = 2;
        int K = 4;
        int L = 6;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case95() {
        int N = 5;
        int M = 1;
        int K = 4;
        int L = 2;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case96() {
        int N = 6;
        int M = 4;
        int K = 3;
        int L = 1;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case97() {
        int N = 1000000;
        int M = 494613;
        int K = 498765;
        int L = 999813;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case98() {
        int N = 1000000;
        int M = 999998;
        int K = 3899;
        int L = 5;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case99() {
        int N = 5;
        int M = 1;
        int K = 3;
        int L = 2;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case100() {
        int N = 1000;
        int M = 333;
        int K = 412;
        int L = 612;
        assertEquals("Romeo", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case101() {
        int N = 10;
        int M = 1;
        int K = 10;
        int L = 5;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case102() {
        int N = 1000000;
        int M = 123;
        int K = 12;
        int L = 1231;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case103() {
        int N = 999999;
        int M = 834753;
        int K = 483140;
        int L = 999925;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case104() {
        int N = 1000;
        int M = 45;
        int K = 2;
        int L = 67;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case105() {
        int N = 4;
        int M = 1;
        int K = 4;
        int L = 2;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case106() {
        int N = 1000000;
        int M = 76543;
        int K = 7896;
        int L = 789657;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case107() {
        int N = 5;
        int M = 4;
        int K = 4;
        int L = 5;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case108() {
        int N = 5;
        int M = 4;
        int K = 5;
        int L = 5;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case109() {
        int N = 5;
        int M = 1;
        int K = 5;
        int L = 2;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case110() {
        int N = 999997;
        int M = 7943;
        int K = 1327;
        int L = 999977;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case111() {
        int N = 1000000;
        int M = 100000;
        int K = 500000;
        int L = 600002;
        assertEquals("Strangelet", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case112() {
        int N = 7;
        int M = 4;
        int K = 7;
        int L = 6;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case113() {
        int N = 5;
        int M = 4;
        int K = 3;
        int L = 5;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case114() {
        int N = 100;
        int M = 50;
        int K = 5;
        int L = 51;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case115() {
        int N = 1000000;
        int M = 2;
        int K = 999999;
        int L = 999997;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case116() {
        int N = 1000000;
        int M = 499999;
        int K = 2;
        int L = 500001;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case117() {
        int N = 50000;
        int M = 100;
        int K = 100;
        int L = 200;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case118() {
        int N = 7;
        int M = 4;
        int K = 4;
        int L = 2;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case119() {
        int N = 100;
        int M = 1;
        int K = 3;
        int L = 2;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case120() {
        int N = 1000000;
        int M = 500000;
        int K = 478;
        int L = 877849;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case121() {
        int N = 5;
        int M = 3;
        int K = 3;
        int L = 4;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case122() {
        int N = 10;
        int M = 5;
        int K = 5;
        int L = 6;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case123() {
        int N = 4;
        int M = 3;
        int K = 3;
        int L = 4;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case124() {
        int N = 100;
        int M = 10;
        int K = 5;
        int L = 11;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case125() {
        int N = 6;
        int M = 6;
        int K = 5;
        int L = 4;
        assertEquals("Strangelet", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case126() {
        int N = 1000000;
        int M = 100000;
        int K = 500001;
        int L = 6000;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case127() {
        int N = 100;
        int M = 99;
        int K = 10;
        int L = 100;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case128() {
        int N = 10;
        int M = 3;
        int K = 5;
        int L = 6;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case129() {
        int N = 7;
        int M = 3;
        int K = 7;
        int L = 4;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case130() {
        int N = 5;
        int M = 3;
        int K = 5;
        int L = 4;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case131() {
        int N = 100;
        int M = 30;
        int K = 11;
        int L = 25;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case132() {
        int N = 100000;
        int M = 1;
        int K = 9999;
        int L = 8;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case133() {
        int N = 999337;
        int M = 2;
        int K = 999337;
        int L = 1;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case134() {
        int N = 4;
        int M = 2;
        int K = 4;
        int L = 4;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case135() {
        int N = 1000000;
        int M = 100000;
        int K = 200000;
        int L = 500000;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case136() {
        int N = 6;
        int M = 1;
        int K = 6;
        int L = 4;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case137() {
        int N = 1000000;
        int M = 100000;
        int K = 500000;
        int L = 1;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case138() {
        int N = 6;
        int M = 2;
        int K = 6;
        int L = 6;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case139() {
        int N = 10;
        int M = 1;
        int K = 10;
        int L = 9;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case140() {
        int N = 9;
        int M = 9;
        int K = 4;
        int L = 4;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case141() {
        int N = 7;
        int M = 2;
        int K = 5;
        int L = 5;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case142() {
        int N = 10;
        int M = 5;
        int K = 4;
        int L = 7;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case143() {
        int N = 100;
        int M = 1;
        int K = 99;
        int L = 3;
        assertEquals("Strangelet", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case144() {
        int N = 10;
        int M = 1;
        int K = 6;
        int L = 2;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case145() {
        int N = 5;
        int M = 2;
        int K = 2;
        int L = 5;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case146() {
        int N = 4;
        int M = 4;
        int K = 4;
        int L = 3;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case147() {
        int N = 10;
        int M = 9;
        int K = 3;
        int L = 10;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case148() {
        int N = 10;
        int M = 1;
        int K = 4;
        int L = 2;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case149() {
        int N = 10000;
        int M = 400;
        int K = 999;
        int L = 512;
        assertEquals("Strangelet", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case150() {
        int N = 10;
        int M = 2;
        int K = 5;
        int L = 8;
        assertEquals("Strangelet", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case151() {
        int N = 7;
        int M = 4;
        int K = 7;
        int L = 5;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case152() {
        int N = 30;
        int M = 10;
        int K = 4;
        int L = 16;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case153() {
        int N = 5;
        int M = 1;
        int K = 4;
        int L = 3;
        assertEquals("Strangelet", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case154() {
        int N = 50;
        int M = 25;
        int K = 50;
        int L = 30;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case155() {
        int N = 4;
        int M = 2;
        int K = 4;
        int L = 1;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case156() {
        int N = 6;
        int M = 6;
        int K = 4;
        int L = 4;
        assertEquals("Strangelet", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case157() {
        int N = 10;
        int M = 5;
        int K = 9;
        int L = 9;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case158() {
        int N = 5;
        int M = 2;
        int K = 5;
        int L = 3;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case159() {
        int N = 8;
        int M = 1;
        int K = 8;
        int L = 3;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case160() {
        int N = 10;
        int M = 4;
        int K = 3;
        int L = 5;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case161() {
        int N = 5;
        int M = 4;
        int K = 3;
        int L = 3;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case162() {
        int N = 100;
        int M = 1;
        int K = 5;
        int L = 2;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case163() {
        int N = 8;
        int M = 5;
        int K = 2;
        int L = 3;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case164() {
        int N = 875973;
        int M = 636549;
        int K = 837344;
        int L = 810904;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case165() {
        int N = 30;
        int M = 1;
        int K = 3;
        int L = 2;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case166() {
        int N = 5;
        int M = 5;
        int K = 4;
        int L = 4;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case167() {
        int N = 1000;
        int M = 3;
        int K = 97;
        int L = 100;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case168() {
        int N = 1000000;
        int M = 500000;
        int K = 500001;
        int L = 500001;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case169() {
        int N = 8;
        int M = 1;
        int K = 4;
        int L = 2;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case170() {
        int N = 100;
        int M = 99;
        int K = 4;
        int L = 100;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case171() {
        int N = 1000;
        int M = 4;
        int K = 3;
        int L = 5;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case172() {
        int N = 6;
        int M = 2;
        int K = 5;
        int L = 5;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case173() {
        int N = 8;
        int M = 1;
        int K = 8;
        int L = 5;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case174() {
        int N = 5;
        int M = 5;
        int K = 5;
        int L = 3;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case175() {
        int N = 5;
        int M = 3;
        int K = 5;
        int L = 1;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case176() {
        int N = 8;
        int M = 2;
        int K = 4;
        int L = 4;
        assertEquals("Strangelet", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case177() {
        int N = 100;
        int M = 5;
        int K = 4;
        int L = 2;
        assertEquals("Romeo", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case178() {
        int N = 299999;
        int M = 651;
        int K = 154;
        int L = 541;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case179() {
        int N = 5;
        int M = 2;
        int K = 2;
        int L = 3;
        assertEquals("Romeo", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case180() {
        int N = 5;
        int M = 2;
        int K = 3;
        int L = 3;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case181() {
        int N = 10;
        int M = 5;
        int K = 3;
        int L = 6;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case182() {
        int N = 10;
        int M = 2;
        int K = 3;
        int L = 8;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case183() {
        int N = 6;
        int M = 3;
        int K = 5;
        int L = 1;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case184() {
        int N = 7;
        int M = 2;
        int K = 7;
        int L = 4;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case185() {
        int N = 15;
        int M = 5;
        int K = 2;
        int L = 3;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case186() {
        int N = 100;
        int M = 10;
        int K = 3;
        int L = 12;
        assertEquals("Romeo", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case187() {
        int N = 11;
        int M = 1;
        int K = 9;
        int L = 11;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case188() {
        int N = 100;
        int M = 11;
        int K = 5;
        int L = 19;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case189() {
        int N = 1000000;
        int M = 123321;
        int K = 500000;
        int L = 954845;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case190() {
        int N = 999999;
        int M = 998742;
        int K = 5482;
        int L = 999934;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case191() {
        int N = 6;
        int M = 6;
        int K = 4;
        int L = 5;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case192() {
        int N = 50000;
        int M = 100;
        int K = 100;
        int L = 201;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

    @Test
    public void case193() {
        int N = 5;
        int M = 3;
        int K = 5;
        int L = 5;
        assertEquals("Draw", stonesgame.winner(N, M, K, L));
    }

}
