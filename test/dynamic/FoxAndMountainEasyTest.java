package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class FoxAndMountainEasyTest {
    FoxAndMountainEasy foxandmountaineasy = new FoxAndMountainEasy();

    @Test
    public void case1() {
        int n = 4;
        int h0 = 0;
        int hn = 4;
        String history = "UU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case2() {
        int n = 4;
        int h0 = 0;
        int hn = 4;
        String history = "D";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case3() {
        int n = 4;
        int h0 = 100000;
        int hn = 100000;
        String history = "DDU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case4() {
        int n = 4;
        int h0 = 0;
        int hn = 0;
        String history = "DDU";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case5() {
        int n = 20;
        int h0 = 20;
        int hn = 20;
        String history = "UDUDUDUDUD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case6() {
        int n = 20;
        int h0 = 0;
        int hn = 0;
        String history = "UUUUUUUUUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case7() {
        int n = 20;
        int h0 = 0;
        int hn = 0;
        String history = "UUUUUUUUUUU";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case8() {
        int n = 10;
        int h0 = 10;
        int hn = 22;
        String history = "U";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case9() {
        int n = 10;
        int h0 = 10;
        int hn = 11;
        String history = "D";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case10() {
        int n = 36;
        int h0 = 52;
        int hn = 70;
        String history = "DDDDDDDDDDUUDDDDDDDDDDDDDDDDD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case11() {
        int n = 5;
        int h0 = 5;
        int hn = 4;
        String history = "U";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case12() {
        int n = 67994;
        int h0 = 2675;
        int hn = 645;
        String history = "DDDDDDDUUDUUDDDUDDDDDDDDDDDDDDDDUDDDDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case13() {
        int n = 89003;
        int h0 = 85932;
        int hn = 10413;
        String history = "UUDDDDDDDDDDDDDDDDDDDDUDUDU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case14() {
        int n = 52281;
        int h0 = 2513;
        int hn = 48060;
        String history = "DDDDDDDUDUDUUD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case15() {
        int n = 7274;
        int h0 = 72;
        int hn = 492;
        String history = "DDDDDDDDDDDDDDUDDUDDDDDDDDDDDDDDDDDDDDDDDDDDDDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case16() {
        int n = 37;
        int h0 = 36;
        int hn = 31;
        String history = "U";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case17() {
        int n = 10370;
        int h0 = 4658;
        int hn = 3990;
        String history = "UUDUUDUDDUDUUUUDDUDDUUDUUDDDUUUUUDUDUDDDDDUUDDUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case18() {
        int n = 66264;
        int h0 = 40406;
        int hn = 48634;
        String history = "DDDDDDUDUDDUUUUDUUUDUUUDDDDUUDUUUUDDDDUDDDDDDDU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case19() {
        int n = 25;
        int h0 = 190;
        int hn = 165;
        String history = "DUUUDUUUDDUUUUUDD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case20() {
        int n = 74154;
        int h0 = 84;
        int hn = 7;
        String history = "UUUDUUUUDUUUUDUUUUDUDDUDUUDUUUDDUUUDDUUUDUDUDUUDU";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case21() {
        int n = 5650;
        int h0 = 1397;
        int hn = 969;
        String history = "UDUUUDUDDDDUDDUUDUUUUDDUUUUDUDUDUDUDDDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case22() {
        int n = 2198;
        int h0 = 0;
        int hn = 2;
        String history = "DDUUUUUD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case23() {
        int n = 36546;
        int h0 = 14655;
        int hn = 30305;
        String history = "DDDDDDDUDDDUDDDDDDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case24() {
        int n = 49;
        int h0 = 22;
        int hn = 35;
        String history = "UDDDDDUUUDDDDDDUDDDDDUDDUUDUDDDDUDUDDDDDDDDDDD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case25() {
        int n = 7;
        int h0 = 33;
        int hn = 32;
        String history = "DDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case26() {
        int n = 69566;
        int h0 = 62705;
        int hn = 52473;
        String history = "UDDDDDDDUDDDDDDDDUDDDDDDDDDDDDDDUDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case27() {
        int n = 49;
        int h0 = 61;
        int hn = 64;
        String history = "DDDDDUDUUUD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case28() {
        int n = 76879;
        int h0 = 67;
        int hn = 66;
        String history = "DDDDDDDDDUUDDDDDDDDDDDDUDU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case29() {
        int n = 15;
        int h0 = 5;
        int hn = 34;
        String history = "UUDDDUD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case30() {
        int n = 39;
        int h0 = 30;
        int hn = 25;
        String history = "UDDDDDUUDUUUD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case31() {
        int n = 39273;
        int h0 = 9813;
        int hn = 332;
        String history = "UUDUUUDDUUUDDUUUUDUUDUDDDDDDDDUUUUDUDUUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case32() {
        int n = 29;
        int h0 = 16;
        int hn = 29;
        String history = "UUUUUUUUUDU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case33() {
        int n = 20;
        int h0 = 15;
        int hn = 17;
        String history = "UDDUDUUUUUDUUUUUUU";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case34() {
        int n = 43;
        int h0 = 31;
        int hn = 42;
        String history = "DDDDDUUUDDDUDUUUDDUDDDDDUDUDDDDDUDDDDDD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case35() {
        int n = 48;
        int h0 = 6;
        int hn = 20;
        String history = "DUUDUDUUDUDDUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case36() {
        int n = 2;
        int h0 = 2;
        int hn = 2;
        String history = "UU";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case37() {
        int n = 38;
        int h0 = 82;
        int hn = 62;
        String history = "DDUDUDUDUUUUDDDUUDUDUUUUUUUDUDUU";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case38() {
        int n = 2;
        int h0 = 0;
        int hn = 2;
        String history = "U";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case39() {
        int n = 37;
        int h0 = 33;
        int hn = 0;
        String history = "UUUUDUU";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case40() {
        int n = 50;
        int h0 = 8;
        int hn = 6;
        String history = "DDDDUDU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case41() {
        int n = 97608;
        int h0 = 82137;
        int hn = 8191;
        String history = "UUUUUUDDUUUDUDUDUUUUDUDUUDDUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case42() {
        int n = 97667;
        int h0 = 856;
        int hn = 3;
        String history = "UDUUUUDDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case43() {
        int n = 31016;
        int h0 = 2393;
        int hn = 5153;
        String history = "UDUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case44() {
        int n = 43916;
        int h0 = 31531;
        int hn = 93;
        String history = "UUUUUDUDUUDDUUUDUUDUDUUUUUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case45() {
        int n = 1010;
        int h0 = 137;
        int hn = 9;
        String history = "UUDUUDDDDUDDDUUUUDUD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case46() {
        int n = 31634;
        int h0 = 26590;
        int hn = 23936;
        String history = "DUUUUDUUUDUDDDUUUUDUUUDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case47() {
        int n = 49849;
        int h0 = 11786;
        int hn = 19043;
        String history = "DUUDUDDDDDDDUDDUDUUUUUDDUDUUD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case48() {
        int n = 2231;
        int h0 = 439;
        int hn = 876;
        String history = "UUUUUUUUUUUUUUUUUUUUUUUUUUUUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case49() {
        int n = 8;
        int h0 = 1;
        int hn = 7;
        String history = "UU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case50() {
        int n = 45;
        int h0 = 42;
        int hn = 7;
        String history = "DUUUUUUDUDDU";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case51() {
        int n = 45;
        int h0 = 4479;
        int hn = 20447;
        String history = "UUUUUUUDUUUDD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case52() {
        int n = 34;
        int h0 = 16;
        int hn = 18;
        String history = "DDUDDDDDDDDDDDDDDDDDD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case53() {
        int n = 26;
        int h0 = 26;
        int hn = 0;
        String history = "UUUUUUUUUUUUUUUUDUUUUUUU";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case54() {
        int n = 33669;
        int h0 = 28682;
        int hn = 6015;
        String history = "DUDUDDDDDUUDDUUUUDDDUDDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case55() {
        int n = 17622;
        int h0 = 6717;
        int hn = 5053;
        String history = "UDDUDDDDUUDUDDDDUUDUDDUDDUDDDDUDDUUDDUDDUDDDU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case56() {
        int n = 78461;
        int h0 = 20417;
        int hn = 44852;
        String history = "UUUDDDUUDDUUUUUUUDUDUUUUDDDUUDU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case57() {
        int n = 22653;
        int h0 = 713;
        int hn = 8;
        String history = "DDDDDDDDDDDDDDDDDDUUUDUUDDDDDUDDUDDDDDDDDDDDDDDDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case58() {
        int n = 51992;
        int h0 = 9888;
        int hn = 40740;
        String history = "UUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case59() {
        int n = 2275;
        int h0 = 2155;
        int hn = 1170;
        String history = "DDUUDDUUDUDUDDUDUDUDDUUDUD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case60() {
        int n = 65356;
        int h0 = 24588;
        int hn = 48968;
        String history = "DDDUUDUDDDDDDUDUUDDDUDUDUDDU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case61() {
        int n = 53691;
        int h0 = 24583;
        int hn = 45056;
        String history = "UDUDDUUUUDUUDUUUDUUDUUUDUDDUDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case62() {
        int n = 51367;
        int h0 = 64;
        int hn = 725;
        String history = "DUUUUUUDUDDDUUUUDUDDDUDDDDDDUUDDDDUDUDDUDDUUDUDDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case63() {
        int n = 40491;
        int h0 = 96176;
        int hn = 75;
        String history = "UDUDUDUDUUUDDDDUUUDUDUDDUDUU";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case64() {
        int n = 15046;
        int h0 = 8;
        int hn = 6060;
        String history = "DDDDDDDDUUUUUUUUUUDDUUDDDDDUDUDDDUDDDUDDUDUDDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case65() {
        int n = 35;
        int h0 = 7;
        int hn = 0;
        String history = "UUUUUUUUUUUDUDDDDUUU";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case66() {
        int n = 30565;
        int h0 = 617;
        int hn = 2;
        String history = "DUUUDDDUDUUUUDDDUUUUUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case67() {
        int n = 5;
        int h0 = 5;
        int hn = 10;
        String history = "DD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case68() {
        int n = 45;
        int h0 = 33;
        int hn = 28;
        String history = "DDDDDDDDDDDUDDDDDDDDDUDDDDUDDDDDDDDDD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case69() {
        int n = 5563;
        int h0 = 99089;
        int hn = 1794;
        String history = "DDDDUDDDDDDUD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case70() {
        int n = 20165;
        int h0 = 981;
        int hn = 19244;
        String history = "DDDDDDDDDUDDUDDDDDDDDDDDDDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case71() {
        int n = 2;
        int h0 = 790;
        int hn = 788;
        String history = "D";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case72() {
        int n = 72692;
        int h0 = 4;
        int hn = 2094;
        String history = "UUUDUUDUDUDUUDUUUUDUDUUUUUUUUUUUDUUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case73() {
        int n = 33;
        int h0 = 3297;
        int hn = 3292;
        String history = "UDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case74() {
        int n = 32747;
        int h0 = 5810;
        int hn = 947;
        String history = "DDUDDDDUDDDDDDDDDDDDDDDDU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case75() {
        int n = 16;
        int h0 = 4;
        int hn = 2;
        String history = "UDUUUDUUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case76() {
        int n = 52784;
        int h0 = 2841;
        int hn = 21951;
        String history = "DDDDDDDDDDDDDDDDDDDUUUUDDUDDDDDDDDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case77() {
        int n = 15896;
        int h0 = 3;
        int hn = 4487;
        String history = "UUUUUUUUUUUUDUUUUUUUUUUUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case78() {
        int n = 1807;
        int h0 = 1554;
        int hn = 87;
        String history = "UDDUDDUDDDDDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case79() {
        int n = 27;
        int h0 = 23;
        int hn = 9;
        String history = "UDUUDDUUUUDUU";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case80() {
        int n = 8;
        int h0 = 10;
        int hn = 4;
        String history = "DUDUU";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case81() {
        int n = 23378;
        int h0 = 15888;
        int hn = 3688;
        String history = "DDDDUDUDUDUUUDDDDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case82() {
        int n = 27;
        int h0 = 4;
        int hn = 13;
        String history = "UUDDDDDDDDDDUUD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case83() {
        int n = 20;
        int h0 = 9;
        int hn = 15;
        String history = "DDDDDUUDUUUUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case84() {
        int n = 70226;
        int h0 = 11702;
        int hn = 46434;
        String history = "DDDDDDDDDUUUDUUDDUDUUDUUDUDUDDDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case85() {
        int n = 29;
        int h0 = 3;
        int hn = 8;
        String history = "DDUDUDDDDDUDDDDUDDDDDDUDDDDDU";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case86() {
        int n = 49163;
        int h0 = 4647;
        int hn = 4596;
        String history = "UDDDUUUDUDUDUUUDUUDDDUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case87() {
        int n = 14;
        int h0 = 47862;
        int hn = 96;
        String history = "DUUDDD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case88() {
        int n = 19381;
        int h0 = 13084;
        int hn = 12043;
        String history = "DUUUUUUUUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case89() {
        int n = 85719;
        int h0 = 881;
        int hn = 0;
        String history = "UDUUUUUUUDUDUUDDUUDUUUUDDUDUUDUUDDU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case90() {
        int n = 85252;
        int h0 = 20;
        int hn = 51;
        String history = "DDDDDDDDDDDUDD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case91() {
        int n = 26;
        int h0 = 3;
        int hn = 11;
        String history = "UUUUUUUUUUUUDUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case92() {
        int n = 4520;
        int h0 = 9;
        int hn = 39;
        String history = "UUDDUDDUDDDUDDDDDDDDDUDUDUDDDDU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case93() {
        int n = 11096;
        int h0 = 2054;
        int hn = 227;
        String history = "DDDDDDDDDDDDDDDDDDUDDDUDDDDDDDDDDDDDDDDDDDDUDUDUDD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case94() {
        int n = 30;
        int h0 = 3;
        int hn = 9;
        String history = "DUDDDUDUUDDDDUDDDD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case95() {
        int n = 3;
        int h0 = 1;
        int hn = 2;
        String history = "DD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case96() {
        int n = 75551;
        int h0 = 71114;
        int hn = 50437;
        String history = "UUUDUUDDDDUDDUUDDDDUUUDDUDDDUDUUUUDDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case97() {
        int n = 11296;
        int h0 = 9271;
        int hn = 10235;
        String history = "UD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case98() {
        int n = 54095;
        int h0 = 7499;
        int hn = 9498;
        String history = "DUDDUUUUUUDUD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case99() {
        int n = 15484;
        int h0 = 0;
        int hn = 8;
        String history = "DDDDDDDDDDDUDDDDDDDDUDDDDDDDDDDDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case100() {
        int n = 41;
        int h0 = 9;
        int hn = 34;
        String history = "DUDDDUUUDDDDUUDDDDU";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case101() {
        int n = 20654;
        int h0 = 9486;
        int hn = 15728;
        String history = "DDDDDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case102() {
        int n = 47;
        int h0 = 23;
        int hn = 12;
        String history = "UUDDUUUUUDUUDUDUUUDUUUD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case103() {
        int n = 57752;
        int h0 = 92;
        int hn = 3670;
        String history = "UUUDUUDDUUDUDDUUUUDDDDDDDUDUDUUDUUDUDUDUDUDUDDDDDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case104() {
        int n = 17;
        int h0 = 13;
        int hn = 14;
        String history = "DDDDDUD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case105() {
        int n = 40;
        int h0 = 1;
        int hn = 1701;
        String history = "DDDDDDDDUUDDUDDUDDDDUDDUUDDDUDDUDD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case106() {
        int n = 40655;
        int h0 = 34737;
        int hn = 40012;
        String history = "UUUUDUDUUUUUDDDDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case107() {
        int n = 10;
        int h0 = 10;
        int hn = 8;
        String history = "DU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case108() {
        int n = 38;
        int h0 = 9818;
        int hn = 19932;
        String history = "DDDDDDDDDDDUDDDDDDDDDDDDDDDD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case109() {
        int n = 66040;
        int h0 = 6;
        int hn = 119;
        String history = "UDDUUDDDUD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case110() {
        int n = 20;
        int h0 = 2;
        int hn = 18;
        String history = "DUDDDDDD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case111() {
        int n = 28;
        int h0 = 806;
        int hn = 66;
        String history = "DDDUUDDDDDDUD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case112() {
        int n = 40077;
        int h0 = 1202;
        int hn = 2015;
        String history = "DDDDDDDDDUUDDDUDUDDDDDDDUUDDDUUUUDDDUUD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case113() {
        int n = 96533;
        int h0 = 29232;
        int hn = 31164;
        String history = "DDDDDDDDDDDDD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case114() {
        int n = 85704;
        int h0 = 74956;
        int hn = 32264;
        String history = "DDUDDDDUDDUUDDDDDDDDDDDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case115() {
        int n = 69755;
        int h0 = 8;
        int hn = 67;
        String history = "DDDDUUDUDDDUUUUDUDDUUUUDUDDUDUUUDUDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case116() {
        int n = 15;
        int h0 = 4;
        int hn = 5;
        String history = "DUUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case117() {
        int n = 21;
        int h0 = 2;
        int hn = 11;
        String history = "UDUDDUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case118() {
        int n = 65744;
        int h0 = 982;
        int hn = 6958;
        String history = "DDDDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case119() {
        int n = 27;
        int h0 = 3;
        int hn = 6;
        String history = "DUUUUUUUUUUDUUUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case120() {
        int n = 14;
        int h0 = 4;
        int hn = 2;
        String history = "UUUUUUUUUUU";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case121() {
        int n = 6;
        int h0 = 1;
        int hn = 3;
        String history = "DD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case122() {
        int n = 65818;
        int h0 = 51172;
        int hn = 10510;
        String history = "DDDDDDUDDDDDDDDU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case123() {
        int n = 59614;
        int h0 = 30979;
        int hn = 58789;
        String history = "UDUUDUUUUDDDUUUDDDUUUUUUUUUDUDUDUD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case124() {
        int n = 3;
        int h0 = 2;
        int hn = 1;
        String history = "DD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case125() {
        int n = 59325;
        int h0 = 18740;
        int hn = 26375;
        String history = "DDDDDDDUDDDDDDDDDDDDUDDDDDUDUDDDDDDUDDDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case126() {
        int n = 8171;
        int h0 = 5391;
        int hn = 6296;
        String history = "UDDDDUUDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case127() {
        int n = 25;
        int h0 = 18;
        int hn = 21;
        String history = "UUUUUUUUUUUUUDUUU";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case128() {
        int n = 49649;
        int h0 = 19;
        int hn = 10;
        String history = "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case129() {
        int n = 21;
        int h0 = 1;
        int hn = 2;
        String history = "UUUUUDDDUDUUDDUDDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case130() {
        int n = 29;
        int h0 = 22;
        int hn = 27;
        String history = "UUUDDDUDUUUDUDUUDDDDUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case131() {
        int n = 36;
        int h0 = 26;
        int hn = 8;
        String history = "UUUD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case132() {
        int n = 37;
        int h0 = 5;
        int hn = 8;
        String history = "DUDDDUDDDDUDDDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case133() {
        int n = 35794;
        int h0 = 496;
        int hn = 158;
        String history = "UUUUUUUUUUUUDU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case134() {
        int n = 66025;
        int h0 = 59664;
        int hn = 2651;
        String history = "DDUUDDDDDDDDDDDUDUUDDDDDDDDUDDDDDDDDDDDDDDUD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case135() {
        int n = 95538;
        int h0 = 30372;
        int hn = 31669;
        String history = "DDDDDDU";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case136() {
        int n = 29;
        int h0 = 61670;
        int hn = 841;
        String history = "UUUUDDDUUUUUDDUDDUUUDD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case137() {
        int n = 17;
        int h0 = 1;
        int hn = 8;
        String history = "UUUUUUUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case138() {
        int n = 15;
        int h0 = 13;
        int hn = 8;
        String history = "DDDDDDDDDUDDD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case139() {
        int n = 35;
        int h0 = 14;
        int hn = 3;
        String history = "UUUUUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case140() {
        int n = 81409;
        int h0 = 37491;
        int hn = 3246;
        String history = "UDDDDDDDDDDDDDDDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case141() {
        int n = 33;
        int h0 = 4;
        int hn = 9;
        String history = "DDUDDDDDDDDDDDDDDDDD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case142() {
        int n = 48968;
        int h0 = 14;
        int hn = 8;
        String history = "DUUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case143() {
        int n = 64770;
        int h0 = 3;
        int hn = 7;
        String history = "UDDUUUDUDDUUUUUUUDUUUDUUUUDUDUDUUUUDUDUUUUUUUUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case144() {
        int n = 14646;
        int h0 = 387;
        int hn = 9;
        String history = "UUUUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case145() {
        int n = 79695;
        int h0 = 19586;
        int hn = 64451;
        String history = "UUUUDUUUUUUUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case146() {
        int n = 59186;
        int h0 = 9802;
        int hn = 796;
        String history = "DDDDUDUUUDDDDDDUUDDDDDDUDDDDDDUDDDUDDUDDDUUDDDDU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case147() {
        int n = 747;
        int h0 = 347;
        int hn = 42;
        String history = "DUUDDDDDDUDDDDDDDDUDDDDDDDDUDDDDDDDDDDUDDDUDDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case148() {
        int n = 77236;
        int h0 = 50874;
        int hn = 52914;
        String history = "UUUDDDUDUDUUUUDUDDUDUUDUUUDUUDUUUDDDUUUUUDUD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case149() {
        int n = 10;
        int h0 = 12;
        int hn = 2;
        String history = "UUUU";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case150() {
        int n = 26026;
        int h0 = 15327;
        int hn = 3443;
        String history = "UDDUUUDDDDUDUUUDUDDUDDDDUUDUDDUUUUDDUUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case151() {
        int n = 44785;
        int h0 = 44634;
        int hn = 7;
        String history = "DDDUDDDDDDDDDDUDDDUDDDDDDUDDDDDUDDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case152() {
        int n = 8639;
        int h0 = 677;
        int hn = 98;
        String history = "UUUUUUUUUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case153() {
        int n = 55739;
        int h0 = 55584;
        int hn = 50483;
        String history = "DDDUUUDDDDDDDDDDDDDDDDUDDUDDDUDDDDDUDDDDDDUDDDDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case154() {
        int n = 29250;
        int h0 = 27367;
        int hn = 1659;
        String history = "UUUUUDDUUUUDUUUUUDUUUUUUUDUUUDUDUDDUUUUUUUUUUUUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case155() {
        int n = 36935;
        int h0 = 8184;
        int hn = 1;
        String history = "DDUUDUDDDUDDDDDUUDDDUDDDDUDDDDUDDDDDDDUDDDDDUDDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case156() {
        int n = 67656;
        int h0 = 63536;
        int hn = 58208;
        String history = "DDDDDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case157() {
        int n = 30;
        int h0 = 2;
        int hn = 18;
        String history = "UDDDDDDDDDDDDDUDDUDDDDDDUDDDDD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case158() {
        int n = 8297;
        int h0 = 644;
        int hn = 441;
        String history = "UUUUUUUUUUUUUUDDUUDUDUUUUUUUUUUUUUDUDUUDUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case159() {
        int n = 18;
        int h0 = 65058;
        int hn = 646;
        String history = "UU";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case160() {
        int n = 99999;
        int h0 = 0;
        int hn = 0;
        String history = "UD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case161() {
        int n = 4;
        int h0 = 0;
        int hn = 0;
        String history = "DDUU";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case162() {
        int n = 2;
        int h0 = 0;
        int hn = 1;
        String history = "U";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case163() {
        int n = 3;
        int h0 = 2;
        int hn = 2;
        String history = "UD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case164() {
        int n = 8;
        int h0 = 0;
        int hn = 0;
        String history = "DDDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case165() {
        int n = 4;
        int h0 = 0;
        int hn = 0;
        String history = "DD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case166() {
        int n = 9;
        int h0 = 0;
        int hn = 0;
        String history = "U";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case167() {
        int n = 10;
        int h0 = 1;
        int hn = 10;
        String history = "U";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case168() {
        int n = 6;
        int h0 = 0;
        int hn = 1;
        String history = "UUDD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case169() {
        int n = 10000;
        int h0 = 0;
        int hn = 0;
        String history = "U";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case170() {
        int n = 5;
        int h0 = 0;
        int hn = 4;
        String history = "UU";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case171() {
        int n = 999;
        int h0 = 100;
        int hn = 100;
        String history = "UD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case172() {
        int n = 199;
        int h0 = 100;
        int hn = 100;
        String history = "U";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case173() {
        int n = 3;
        int h0 = 10;
        int hn = 10;
        String history = "UD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case174() {
        int n = 10;
        int h0 = 0;
        int hn = 5;
        String history = "U";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case175() {
        int n = 50;
        int h0 = 0;
        int hn = 0;
        String history = "DDDDDDDDDDDDDDDDDDDDDDDDDUUUUUUUUUUUUUUUUUUUUUUUUU";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case176() {
        int n = 100000;
        int h0 = 0;
        int hn = 50000;
        String history = "UDUDUDUD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case177() {
        int n = 3;
        int h0 = 0;
        int hn = 1;
        String history = "U";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case178() {
        int n = 2;
        int h0 = 0;
        int hn = 0;
        String history = "D";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case179() {
        int n = 4;
        int h0 = 4;
        int hn = 5;
        String history = "U";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case180() {
        int n = 10;
        int h0 = 0;
        int hn = 1;
        String history = "U";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case181() {
        int n = 8;
        int h0 = 4;
        int hn = 0;
        String history = "DDDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case182() {
        int n = 4;
        int h0 = 0;
        int hn = 2;
        String history = "DU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case183() {
        int n = 100000;
        int h0 = 1;
        int hn = 1;
        String history = "D";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case184() {
        int n = 99999;
        int h0 = 50000;
        int hn = 50000;
        String history = "U";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case185() {
        int n = 1000;
        int h0 = 100000;
        int hn = 10000;
        String history = "UDDD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case186() {
        int n = 5;
        int h0 = 1;
        int hn = 0;
        String history = "DD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case187() {
        int n = 4;
        int h0 = 0;
        int hn = 0;
        String history = "DU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case188() {
        int n = 3;
        int h0 = 100;
        int hn = 102;
        String history = "U";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case189() {
        int n = 2;
        int h0 = 0;
        int hn = 0;
        String history = "DU";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case190() {
        int n = 3;
        int h0 = 0;
        int hn = 2;
        String history = "U";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case191() {
        int n = 4;
        int h0 = 0;
        int hn = 3;
        String history = "U";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case192() {
        int n = 4;
        int h0 = 0;
        int hn = 0;
        String history = "UUDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case193() {
        int n = 15;
        int h0 = 13;
        int hn = 0;
        String history = "DDDDDDDDDDDDDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case194() {
        int n = 1;
        int h0 = 0;
        int hn = 1;
        String history = "U";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case195() {
        int n = 13;
        int h0 = 7;
        int hn = 7;
        String history = "U";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case196() {
        int n = 1000;
        int h0 = 0;
        int hn = 21;
        String history = "DD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case197() {
        int n = 8;
        int h0 = 1;
        int hn = 1;
        String history = "DDDUUUD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case198() {
        int n = 3;
        int h0 = 0;
        int hn = 0;
        String history = "UD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case199() {
        int n = 3;
        int h0 = 1;
        int hn = 0;
        String history = "DD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case200() {
        int n = 3;
        int h0 = 0;
        int hn = 1;
        String history = "DU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case201() {
        int n = 2;
        int h0 = 0;
        int hn = 0;
        String history = "DD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case202() {
        int n = 100000;
        int h0 = 10001;
        int hn = 100000;
        String history = "UUUD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case203() {
        int n = 100;
        int h0 = 0;
        int hn = 0;
        String history = "DDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case204() {
        int n = 8;
        int h0 = 0;
        int hn = 0;
        String history = "DDDDU";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case205() {
        int n = 13;
        int h0 = 19;
        int hn = 10;
        String history = "DDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case206() {
        int n = 99;
        int h0 = 99;
        int hn = 2;
        String history = "DD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case207() {
        int n = 100000;
        int h0 = 50000;
        int hn = 50001;
        String history = "U";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case208() {
        int n = 5;
        int h0 = 0;
        int hn = 2;
        String history = "UD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case209() {
        int n = 10;
        int h0 = 0;
        int hn = 2;
        String history = "D";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case210() {
        int n = 6;
        int h0 = 0;
        int hn = 0;
        String history = "DDUU";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case211() {
        int n = 198;
        int h0 = 100;
        int hn = 2;
        String history = "U";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case212() {
        int n = 1;
        int h0 = 1;
        int hn = 0;
        String history = "D";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case213() {
        int n = 8;
        int h0 = 0;
        int hn = 4;
        String history = "UUUUUDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case214() {
        int n = 10;
        int h0 = 0;
        int hn = 0;
        String history = "DD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case215() {
        int n = 6;
        int h0 = 8;
        int hn = 7;
        String history = "DDDU";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case216() {
        int n = 3;
        int h0 = 0;
        int hn = 1;
        String history = "DUU";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case217() {
        int n = 4;
        int h0 = 0;
        int hn = 2;
        String history = "D";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case218() {
        int n = 100000;
        int h0 = 0;
        int hn = 99999;
        String history = "U";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case219() {
        int n = 3;
        int h0 = 1;
        int hn = 0;
        String history = "DDU";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case220() {
        int n = 6;
        int h0 = 0;
        int hn = 2;
        String history = "DD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case221() {
        int n = 100;
        int h0 = 0;
        int hn = 0;
        String history = "DDDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case222() {
        int n = 2;
        int h0 = 3;
        int hn = 1;
        String history = "D";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case223() {
        int n = 10;
        int h0 = 2;
        int hn = 4;
        String history = "DDDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case224() {
        int n = 31;
        int h0 = 0;
        int hn = 0;
        String history = "U";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case225() {
        int n = 8;
        int h0 = 0;
        int hn = 0;
        String history = "DDUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case226() {
        int n = 100;
        int h0 = 20;
        int hn = 10;
        String history = "U";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case227() {
        int n = 3;
        int h0 = 3;
        int hn = 2;
        String history = "UD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case228() {
        int n = 7;
        int h0 = 1;
        int hn = 0;
        String history = "DDUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case229() {
        int n = 4;
        int h0 = 8;
        int hn = 9;
        String history = "UD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case230() {
        int n = 10;
        int h0 = 3;
        int hn = 3;
        String history = "DDDDUUUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case231() {
        int n = 2;
        int h0 = 2;
        int hn = 0;
        String history = "DD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case232() {
        int n = 10;
        int h0 = 1000;
        int hn = 1001;
        String history = "UD";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case233() {
        int n = 1;
        int h0 = 2;
        int hn = 1;
        String history = "U";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case234() {
        int n = 6;
        int h0 = 0;
        int hn = 2;
        String history = "DDUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case235() {
        int n = 101;
        int h0 = 21;
        int hn = 2;
        String history = "UD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case236() {
        int n = 4;
        int h0 = 0;
        int hn = 0;
        String history = "UDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case237() {
        int n = 7;
        int h0 = 0;
        int hn = 4;
        String history = "UU";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case238() {
        int n = 2;
        int h0 = 2;
        int hn = 0;
        String history = "D";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case239() {
        int n = 4;
        int h0 = 1;
        int hn = 1;
        String history = "UDDU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case240() {
        int n = 6;
        int h0 = 0;
        int hn = 0;
        String history = "DDU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case241() {
        int n = 16;
        int h0 = 0;
        int hn = 8;
        String history = "DDDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case242() {
        int n = 8;
        int h0 = 0;
        int hn = 1;
        String history = "U";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case243() {
        int n = 5;
        int h0 = 3;
        int hn = 0;
        String history = "DDDUD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case244() {
        int n = 3;
        int h0 = 1;
        int hn = 0;
        String history = "D";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case245() {
        int n = 100000;
        int h0 = 100000;
        int hn = 100000;
        String history = "U";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case246() {
        int n = 2;
        int h0 = 0;
        int hn = 0;
        String history = "U";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case247() {
        int n = 8;
        int h0 = 0;
        int hn = 0;
        String history = "DDUUUU";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case248() {
        int n = 10;
        int h0 = 0;
        int hn = 0;
        String history = "DDDDU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case249() {
        int n = 4;
        int h0 = 3;
        int hn = 1;
        String history = "DUD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case250() {
        int n = 3;
        int h0 = 2;
        int hn = 2;
        String history = "U";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case251() {
        int n = 100000;
        int h0 = 100000;
        int hn = 100000;
        String history = "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case252() {
        int n = 6;
        int h0 = 1;
        int hn = 3;
        String history = "DDUU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case253() {
        int n = 31;
        int h0 = 0;
        int hn = 2;
        String history = "U";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case254() {
        int n = 12;
        int h0 = 0;
        int hn = 5;
        String history = "DUDUUUUU";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case255() {
        int n = 4;
        int h0 = 1;
        int hn = 1;
        String history = "DDU";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case256() {
        int n = 5;
        int h0 = 0;
        int hn = 1;
        String history = "DUUU";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case257() {
        int n = 10;
        int h0 = 0;
        int hn = 0;
        String history = "DDDDUUUU";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case258() {
        int n = 2;
        int h0 = 2;
        int hn = 2;
        String history = "UD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case259() {
        int n = 6;
        int h0 = 0;
        int hn = 0;
        String history = "UDUDUD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case260() {
        int n = 1;
        int h0 = 2;
        int hn = 1;
        String history = "D";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case261() {
        int n = 3;
        int h0 = 1;
        int hn = 0;
        String history = "UDD";
        assertEquals("YES", foxandmountaineasy.possible(n, h0, hn, history));
    }

    @Test
    public void case262() {
        int n = 8;
        int h0 = 1;
        int hn = 2;
        String history = "DDUU";
        assertEquals("NO", foxandmountaineasy.possible(n, h0, hn, history));
    }

}
