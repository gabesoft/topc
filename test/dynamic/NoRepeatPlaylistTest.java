package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class NoRepeatPlaylistTest {
    NoRepeatPlaylist norepeatplaylist = new NoRepeatPlaylist();

    @Test
    public void case1() {
        int N = 1;
        int M = 0;
        int P = 3;
        assertEquals(1, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case2() {
        int N = 1;
        int M = 1;
        int P = 3;
        assertEquals(0, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case3() {
        int N = 2;
        int M = 0;
        int P = 3;
        assertEquals(6, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case4() {
        int N = 4;
        int M = 0;
        int P = 4;
        assertEquals(24, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case5() {
        int N = 2;
        int M = 1;
        int P = 4;
        assertEquals(2, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case6() {
        int N = 50;
        int M = 5;
        int P = 100;
        assertEquals(222288991, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case7() {
        int N = 1;
        int M = 0;
        int P = 1;
        assertEquals(1, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case8() {
        int N = 1;
        int M = 1;
        int P = 1;
        assertEquals(1, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case9() {
        int N = 1;
        int M = 0;
        int P = 2;
        assertEquals(1, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case10() {
        int N = 1;
        int M = 1;
        int P = 2;
        assertEquals(0, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case11() {
        int N = 2;
        int M = 0;
        int P = 2;
        assertEquals(2, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case12() {
        int N = 2;
        int M = 1;
        int P = 2;
        assertEquals(2, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case13() {
        int N = 2;
        int M = 2;
        int P = 2;
        assertEquals(2, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case14() {
        int N = 1;
        int M = 0;
        int P = 3;
        assertEquals(1, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case15() {
        int N = 1;
        int M = 1;
        int P = 3;
        assertEquals(0, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case16() {
        int N = 2;
        int M = 0;
        int P = 3;
        assertEquals(6, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case17() {
        int N = 2;
        int M = 1;
        int P = 3;
        assertEquals(2, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case18() {
        int N = 2;
        int M = 2;
        int P = 3;
        assertEquals(0, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case19() {
        int N = 3;
        int M = 0;
        int P = 3;
        assertEquals(6, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case20() {
        int N = 3;
        int M = 1;
        int P = 3;
        assertEquals(6, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case21() {
        int N = 3;
        int M = 2;
        int P = 3;
        assertEquals(6, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case22() {
        int N = 3;
        int M = 3;
        int P = 3;
        assertEquals(6, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case23() {
        int N = 1;
        int M = 0;
        int P = 4;
        assertEquals(1, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case24() {
        int N = 1;
        int M = 1;
        int P = 4;
        assertEquals(0, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case25() {
        int N = 2;
        int M = 0;
        int P = 4;
        assertEquals(14, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case26() {
        int N = 2;
        int M = 1;
        int P = 4;
        assertEquals(2, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case27() {
        int N = 2;
        int M = 2;
        int P = 4;
        assertEquals(0, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case28() {
        int N = 3;
        int M = 0;
        int P = 4;
        assertEquals(36, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case29() {
        int N = 3;
        int M = 1;
        int P = 4;
        assertEquals(18, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case30() {
        int N = 3;
        int M = 2;
        int P = 4;
        assertEquals(6, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case31() {
        int N = 3;
        int M = 3;
        int P = 4;
        assertEquals(0, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case32() {
        int N = 4;
        int M = 0;
        int P = 4;
        assertEquals(24, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case33() {
        int N = 4;
        int M = 1;
        int P = 4;
        assertEquals(24, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case34() {
        int N = 4;
        int M = 2;
        int P = 4;
        assertEquals(24, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case35() {
        int N = 4;
        int M = 3;
        int P = 4;
        assertEquals(24, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case36() {
        int N = 4;
        int M = 4;
        int P = 4;
        assertEquals(24, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case37() {
        int N = 47;
        int M = 47;
        int P = 47;
        assertEquals(846397273, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case38() {
        int N = 47;
        int M = 46;
        int P = 47;
        assertEquals(846397273, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case39() {
        int N = 47;
        int M = 47;
        int P = 48;
        assertEquals(0, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case40() {
        int N = 1;
        int M = 0;
        int P = 100;
        assertEquals(1, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case41() {
        int N = 1;
        int M = 1;
        int P = 100;
        assertEquals(0, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case42() {
        int N = 2;
        int M = 0;
        int P = 100;
        assertEquals(976371283, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case43() {
        int N = 2;
        int M = 1;
        int P = 100;
        assertEquals(2, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case44() {
        int N = 2;
        int M = 2;
        int P = 100;
        assertEquals(0, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case45() {
        int N = 3;
        int M = 0;
        int P = 100;
        assertEquals(956927880, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case46() {
        int N = 3;
        int M = 1;
        int P = 100;
        assertEquals(964556918, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case47() {
        int N = 3;
        int M = 2;
        int P = 100;
        assertEquals(6, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case48() {
        int N = 3;
        int M = 3;
        int P = 100;
        assertEquals(0, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case49() {
        int N = 100;
        int M = 0;
        int P = 100;
        assertEquals(437918130, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case50() {
        int N = 100;
        int M = 100;
        int P = 100;
        assertEquals(437918130, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case51() {
        int N = 42;
        int M = 20;
        int P = 100;
        assertEquals(917652623, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case52() {
        int N = 35;
        int M = 4;
        int P = 100;
        assertEquals(241141251, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case53() {
        int N = 70;
        int M = 33;
        int P = 100;
        assertEquals(113350320, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case54() {
        int N = 79;
        int M = 78;
        int P = 100;
        assertEquals(472081547, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case55() {
        int N = 63;
        int M = 16;
        int P = 100;
        assertEquals(791270589, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case56() {
        int N = 6;
        int M = 5;
        int P = 100;
        assertEquals(720, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case57() {
        int N = 82;
        int M = 61;
        int P = 100;
        assertEquals(443647325, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case58() {
        int N = 62;
        int M = 50;
        int P = 100;
        assertEquals(362358782, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case59() {
        int N = 96;
        int M = 11;
        int P = 100;
        assertEquals(22353827, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case60() {
        int N = 28;
        int M = 13;
        int P = 100;
        assertEquals(491360085, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case61() {
        int N = 92;
        int M = 3;
        int P = 100;
        assertEquals(635215935, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case62() {
        int N = 3;
        int M = 1;
        int P = 100;
        assertEquals(964556918, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case63() {
        int N = 14;
        int M = 6;
        int P = 93;
        assertEquals(137054740, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case64() {
        int N = 16;
        int M = 5;
        int P = 17;
        assertEquals(122941672, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case65() {
        int N = 31;
        int M = 19;
        int P = 48;
        assertEquals(654394566, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case66() {
        int N = 37;
        int M = 0;
        int P = 39;
        assertEquals(834227218, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case67() {
        int N = 52;
        int M = 22;
        int P = 68;
        assertEquals(35563645, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case68() {
        int N = 14;
        int M = 6;
        int P = 95;
        assertEquals(282801414, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case69() {
        int N = 20;
        int M = 12;
        int P = 23;
        assertEquals(353616274, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case70() {
        int N = 62;
        int M = 25;
        int P = 65;
        assertEquals(762027972, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case71() {
        int N = 11;
        int M = 11;
        int P = 54;
        assertEquals(0, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case72() {
        int N = 38;
        int M = 36;
        int P = 45;
        assertEquals(601830705, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case73() {
        int N = 60;
        int M = 15;
        int P = 100;
        assertEquals(228534218, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case74() {
        int N = 99;
        int M = 3;
        int P = 100;
        assertEquals(989467997, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case75() {
        int N = 37;
        int M = 7;
        int P = 97;
        assertEquals(945713644, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case76() {
        int N = 50;
        int M = 30;
        int P = 100;
        assertEquals(226791857, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case77() {
        int N = 53;
        int M = 3;
        int P = 100;
        assertEquals(177662748, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case78() {
        int N = 50;
        int M = 23;
        int P = 81;
        assertEquals(885425071, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case79() {
        int N = 49;
        int M = 7;
        int P = 100;
        assertEquals(437821697, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case80() {
        int N = 5;
        int M = 5;
        int P = 5;
        assertEquals(120, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case81() {
        int N = 80;
        int M = 8;
        int P = 100;
        assertEquals(467650474, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case82() {
        int N = 100;
        int M = 25;
        int P = 100;
        assertEquals(437918130, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case83() {
        int N = 64;
        int M = 33;
        int P = 100;
        assertEquals(910604984, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case84() {
        int N = 40;
        int M = 15;
        int P = 100;
        assertEquals(553780149, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case85() {
        int N = 25;
        int M = 13;
        int P = 60;
        assertEquals(23832333, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case86() {
        int N = 88;
        int M = 5;
        int P = 100;
        assertEquals(638621416, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case87() {
        int N = 100;
        int M = 1;
        int P = 100;
        assertEquals(437918130, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case88() {
        int N = 50;
        int M = 10;
        int P = 100;
        assertEquals(663536800, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case89() {
        int N = 10;
        int M = 10;
        int P = 100;
        assertEquals(0, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case90() {
        int N = 100;
        int M = 10;
        int P = 100;
        assertEquals(437918130, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case91() {
        int N = 99;
        int M = 5;
        int P = 100;
        assertEquals(53044368, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case92() {
        int N = 50;
        int M = 7;
        int P = 100;
        assertEquals(363575434, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case93() {
        int N = 20;
        int M = 2;
        int P = 100;
        assertEquals(545911587, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case94() {
        int N = 60;
        int M = 25;
        int P = 100;
        assertEquals(145208404, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case95() {
        int N = 13;
        int M = 9;
        int P = 39;
        assertEquals(997218499, norepeatplaylist.numPlaylists(N, M, P));
    }

    @Test
    public void case96() {
        int N = 50;
        int M = 50;
        int P = 50;
        assertEquals(318608048, norepeatplaylist.numPlaylists(N, M, P));
    }

}
