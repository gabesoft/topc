package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class OneRegisterTest {
    OneRegister oneregister = new OneRegister();

    @Test
    public void case1() {
        int s = 7;
        int t = 392;
        assertEquals("+*+", oneregister.getProgram(s, t));
    }

    @Test
    public void case2() {
        int s = 7;
        int t = 256;
        assertEquals("/+***", oneregister.getProgram(s, t));
    }

    @Test
    public void case3() {
        int s = 4;
        int t = 256;
        assertEquals("**", oneregister.getProgram(s, t));
    }

    @Test
    public void case4() {
        int s = 7;
        int t = 7;
        assertEquals("", oneregister.getProgram(s, t));
    }

    @Test
    public void case5() {
        int s = 7;
        int t = 9;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case6() {
        int s = 10;
        int t = 1;
        assertEquals("/", oneregister.getProgram(s, t));
    }

    @Test
    public void case7() {
        int s = 5;
        int t = 1250;
        assertEquals("**+", oneregister.getProgram(s, t));
    }

    @Test
    public void case8() {
        int s = 4099;
        int t = 4096;
        assertEquals("/+*+**", oneregister.getProgram(s, t));
    }

    @Test
    public void case9() {
        int s = 1000000000;
        int t = 536870912;
        assertEquals("/+*+*+**+", oneregister.getProgram(s, t));
    }

    @Test
    public void case10() {
        int s = 11;
        int t = 214358881;
        assertEquals("***", oneregister.getProgram(s, t));
    }

    @Test
    public void case11() {
        int s = 1;
        int t = 1;
        assertEquals("", oneregister.getProgram(s, t));
    }

    @Test
    public void case12() {
        int s = 1;
        int t = 2;
        assertEquals("+", oneregister.getProgram(s, t));
    }

    @Test
    public void case13() {
        int s = 1;
        int t = 4;
        assertEquals("+*", oneregister.getProgram(s, t));
    }

    @Test
    public void case14() {
        int s = 1;
        int t = 8;
        assertEquals("+*+", oneregister.getProgram(s, t));
    }

    @Test
    public void case15() {
        int s = 1;
        int t = 16;
        assertEquals("+**", oneregister.getProgram(s, t));
    }

    @Test
    public void case16() {
        int s = 1;
        int t = 128;
        assertEquals("+*+*+", oneregister.getProgram(s, t));
    }

    @Test
    public void case17() {
        int s = 1;
        int t = 256;
        assertEquals("+***", oneregister.getProgram(s, t));
    }

    @Test
    public void case18() {
        int s = 1;
        int t = 564;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case19() {
        int s = 1;
        int t = 65536;
        assertEquals("+****", oneregister.getProgram(s, t));
    }

    @Test
    public void case20() {
        int s = 1;
        int t = 262144;
        assertEquals("+***+*", oneregister.getProgram(s, t));
    }

    @Test
    public void case21() {
        int s = 1;
        int t = 1000000000;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case22() {
        int s = 2;
        int t = 256;
        assertEquals("***", oneregister.getProgram(s, t));
    }

    @Test
    public void case23() {
        int s = 3;
        int t = 4;
        assertEquals("/+*", oneregister.getProgram(s, t));
    }

    @Test
    public void case24() {
        int s = 3;
        int t = 16;
        assertEquals("/+**", oneregister.getProgram(s, t));
    }

    @Test
    public void case25() {
        int s = 3;
        int t = 59049;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case26() {
        int s = 4;
        int t = 2;
        assertEquals("/+", oneregister.getProgram(s, t));
    }

    @Test
    public void case27() {
        int s = 5;
        int t = 125;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case28() {
        int s = 5;
        int t = 6250000;
        assertEquals("*+**", oneregister.getProgram(s, t));
    }

    @Test
    public void case29() {
        int s = 6;
        int t = 144;
        assertEquals("+*", oneregister.getProgram(s, t));
    }

    @Test
    public void case30() {
        int s = 8;
        int t = 4;
        assertEquals("/+*", oneregister.getProgram(s, t));
    }

    @Test
    public void case31() {
        int s = 8;
        int t = 268435456;
        assertEquals("*+**", oneregister.getProgram(s, t));
    }

    @Test
    public void case32() {
        int s = 9;
        int t = 43046721;
        assertEquals("***", oneregister.getProgram(s, t));
    }

    @Test
    public void case33() {
        int s = 9;
        int t = 172186884;
        assertEquals("**+*", oneregister.getProgram(s, t));
    }

    @Test
    public void case34() {
        int s = 10;
        int t = 10245;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case35() {
        int s = 10;
        int t = 40000;
        assertEquals("*+*", oneregister.getProgram(s, t));
    }

    @Test
    public void case36() {
        int s = 10;
        int t = 100000000;
        assertEquals("***", oneregister.getProgram(s, t));
    }

    @Test
    public void case37() {
        int s = 11;
        int t = 214358881;
        assertEquals("***", oneregister.getProgram(s, t));
    }

    @Test
    public void case38() {
        int s = 13;
        int t = 456976;
        assertEquals("+**", oneregister.getProgram(s, t));
    }

    @Test
    public void case39() {
        int s = 14;
        int t = 802816;
        assertEquals("++++++*", oneregister.getProgram(s, t));
    }

    @Test
    public void case40() {
        int s = 17;
        int t = 83521;
        assertEquals("**", oneregister.getProgram(s, t));
    }

    @Test
    public void case41() {
        int s = 18;
        int t = 104976;
        assertEquals("**", oneregister.getProgram(s, t));
    }

    @Test
    public void case42() {
        int s = 19;
        int t = 16;
        assertEquals("/+**", oneregister.getProgram(s, t));
    }

    @Test
    public void case43() {
        int s = 21;
        int t = 168;
        assertEquals("+++", oneregister.getProgram(s, t));
    }

    @Test
    public void case44() {
        int s = 22;
        int t = 123904;
        assertEquals("++++*", oneregister.getProgram(s, t));
    }

    @Test
    public void case45() {
        int s = 22;
        int t = 234256;
        assertEquals("**", oneregister.getProgram(s, t));
    }

    @Test
    public void case46() {
        int s = 23;
        int t = 1083392;
        assertEquals("+++++*+", oneregister.getProgram(s, t));
    }

    @Test
    public void case47() {
        int s = 23;
        int t = 771751936;
        assertEquals("+++++++++++++++++++++++++", oneregister.getProgram(s, t));
    }

    @Test
    public void case48() {
        int s = 27;
        int t = 2916;
        assertEquals("+*", oneregister.getProgram(s, t));
    }

    @Test
    public void case49() {
        int s = 28;
        int t = 614656;
        assertEquals("**", oneregister.getProgram(s, t));
    }

    @Test
    public void case50() {
        int s = 32;
        int t = 1024;
        assertEquals("*", oneregister.getProgram(s, t));
    }

    @Test
    public void case51() {
        int s = 32;
        int t = 1048576;
        assertEquals("**", oneregister.getProgram(s, t));
    }

    @Test
    public void case52() {
        int s = 33;
        int t = 264;
        assertEquals("+++", oneregister.getProgram(s, t));
    }

    @Test
    public void case53() {
        int s = 41;
        int t = 2825761;
        assertEquals("**", oneregister.getProgram(s, t));
    }

    @Test
    public void case54() {
        int s = 43;
        int t = 172;
        assertEquals("++", oneregister.getProgram(s, t));
    }

    @Test
    public void case55() {
        int s = 48;
        int t = 73728;
        assertEquals("++*+", oneregister.getProgram(s, t));
    }

    @Test
    public void case56() {
        int s = 49;
        int t = 392;
        assertEquals("+++", oneregister.getProgram(s, t));
    }

    @Test
    public void case57() {
        int s = 49;
        int t = 5764801;
        assertEquals("**", oneregister.getProgram(s, t));
    }

    @Test
    public void case58() {
        int s = 50;
        int t = 838860800;
        assertEquals("++++++++++++++++++++++++", oneregister.getProgram(s, t));
    }

    @Test
    public void case59() {
        int s = 51;
        int t = 6765201;
        assertEquals("**", oneregister.getProgram(s, t));
    }

    @Test
    public void case60() {
        int s = 53;
        int t = 11236;
        assertEquals("+*", oneregister.getProgram(s, t));
    }

    @Test
    public void case61() {
        int s = 53;
        int t = 889192448;
        assertEquals("++++++++++++++++++++++++", oneregister.getProgram(s, t));
    }

    @Test
    public void case62() {
        int s = 62;
        int t = 260046848;
        assertEquals("++++++++++++++++++++++", oneregister.getProgram(s, t));
    }

    @Test
    public void case63() {
        int s = 66;
        int t = 18974736;
        assertEquals("**", oneregister.getProgram(s, t));
    }

    @Test
    public void case64() {
        int s = 68;
        int t = 21381376;
        assertEquals("**", oneregister.getProgram(s, t));
    }

    @Test
    public void case65() {
        int s = 72;
        int t = 1327104;
        assertEquals("++++*", oneregister.getProgram(s, t));
    }

    @Test
    public void case66() {
        int s = 74;
        int t = 592;
        assertEquals("+++", oneregister.getProgram(s, t));
    }

    @Test
    public void case67() {
        int s = 74;
        int t = 620756992;
        assertEquals("+++++++++++++++++++++++", oneregister.getProgram(s, t));
    }

    @Test
    public void case68() {
        int s = 75;
        int t = 31640625;
        assertEquals("**", oneregister.getProgram(s, t));
    }

    @Test
    public void case69() {
        int s = 76;
        int t = 46208;
        assertEquals("+*+", oneregister.getProgram(s, t));
    }

    @Test
    public void case70() {
        int s = 80;
        int t = 256;
        assertEquals("/+***", oneregister.getProgram(s, t));
    }

    @Test
    public void case71() {
        int s = 80;
        int t = 102400;
        assertEquals("++*", oneregister.getProgram(s, t));
    }

    @Test
    public void case72() {
        int s = 81;
        int t = 648;
        assertEquals("+++", oneregister.getProgram(s, t));
    }

    @Test
    public void case73() {
        int s = 83;
        int t = 881792;
        assertEquals("+++*+", oneregister.getProgram(s, t));
    }

    @Test
    public void case74() {
        int s = 86;
        int t = 875213056;
        assertEquals("+**", oneregister.getProgram(s, t));
    }

    @Test
    public void case75() {
        int s = 92;
        int t = 71639296;
        assertEquals("**", oneregister.getProgram(s, t));
    }

    @Test
    public void case76() {
        int s = 94;
        int t = 788529152;
        assertEquals("+++++++++++++++++++++++", oneregister.getProgram(s, t));
    }

    @Test
    public void case77() {
        int s = 96;
        int t = 768;
        assertEquals("+++", oneregister.getProgram(s, t));
    }

    @Test
    public void case78() {
        int s = 96;
        int t = 9437184;
        assertEquals("+++++*", oneregister.getProgram(s, t));
    }

    @Test
    public void case79() {
        int s = 97;
        int t = 88529281;
        assertEquals("**", oneregister.getProgram(s, t));
    }

    @Test
    public void case80() {
        int s = 124;
        int t = 64;
        assertEquals("/+*+*", oneregister.getProgram(s, t));
    }

    @Test
    public void case81() {
        int s = 128;
        int t = 96;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case82() {
        int s = 157;
        int t = 1024;
        assertEquals("/+**+*", oneregister.getProgram(s, t));
    }

    @Test
    public void case83() {
        int s = 257;
        int t = 256;
        assertEquals("/+***", oneregister.getProgram(s, t));
    }

    @Test
    public void case84() {
        int s = 454;
        int t = 256;
        assertEquals("/+***", oneregister.getProgram(s, t));
    }

    @Test
    public void case85() {
        int s = 637;
        int t = 512;
        assertEquals("/+***+", oneregister.getProgram(s, t));
    }

    @Test
    public void case86() {
        int s = 43393;
        int t = 65536;
        assertEquals("/+****", oneregister.getProgram(s, t));
    }

    @Test
    public void case87() {
        int s = 68467;
        int t = 68467;
        assertEquals("", oneregister.getProgram(s, t));
    }

    @Test
    public void case88() {
        int s = 102968;
        int t = 65536;
        assertEquals("/+****", oneregister.getProgram(s, t));
    }

    @Test
    public void case89() {
        int s = 999999;
        int t = 99999999;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case90() {
        int s = 1002736;
        int t = 1048576;
        assertEquals("/+**+**", oneregister.getProgram(s, t));
    }

    @Test
    public void case91() {
        int s = 3431332;
        int t = 2097152;
        assertEquals("/+**+**+", oneregister.getProgram(s, t));
    }

    @Test
    public void case92() {
        int s = 30199283;
        int t = 67108864;
        assertEquals("/+*+**+*", oneregister.getProgram(s, t));
    }

    @Test
    public void case93() {
        int s = 193221366;
        int t = 536870912;
        assertEquals("/+*+*+**+", oneregister.getProgram(s, t));
    }

    @Test
    public void case94() {
        int s = 1000000000;
        int t = 2;
        assertEquals("/+", oneregister.getProgram(s, t));
    }

    @Test
    public void case95() {
        int s = 1000000000;
        int t = 4;
        assertEquals("/+*", oneregister.getProgram(s, t));
    }

    @Test
    public void case96() {
        int s = 1000000000;
        int t = 16;
        assertEquals("/+**", oneregister.getProgram(s, t));
    }

    @Test
    public void case97() {
        int s = 1000000000;
        int t = 256;
        assertEquals("/+***", oneregister.getProgram(s, t));
    }

    @Test
    public void case98() {
        int s = 1000000000;
        int t = 65536;
        assertEquals("/+****", oneregister.getProgram(s, t));
    }

    @Test
    public void case99() {
        int s = 1000000000;
        int t = 1000000000;
        assertEquals("", oneregister.getProgram(s, t));
    }

    @Test
    public void case100() {
        int s = 512;
        int t = 65536;
        assertEquals("/+****", oneregister.getProgram(s, t));
    }

    @Test
    public void case101() {
        int s = 10;
        int t = 1000000000;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case102() {
        int s = 465456;
        int t = 16769023;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case103() {
        int s = 4;
        int t = 32768;
        assertEquals("+*+*+", oneregister.getProgram(s, t));
    }

    @Test
    public void case104() {
        int s = 12345678;
        int t = 260846532;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case105() {
        int s = 29382974;
        int t = 293829747;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case106() {
        int s = 2;
        int t = 1;
        assertEquals("/", oneregister.getProgram(s, t));
    }

    @Test
    public void case107() {
        int s = 2;
        int t = 4;
        assertEquals("*", oneregister.getProgram(s, t));
    }

    @Test
    public void case108() {
        int s = 14;
        int t = 12;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case109() {
        int s = 666666670;
        int t = 886389896;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case110() {
        int s = 13;
        int t = 999999999;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case111() {
        int s = 65537;
        int t = 131073;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case112() {
        int s = 32;
        int t = 64;
        assertEquals("+", oneregister.getProgram(s, t));
    }

    @Test
    public void case113() {
        int s = 1;
        int t = 99999999;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case114() {
        int s = 5;
        int t = 40000;
        assertEquals("+*+*", oneregister.getProgram(s, t));
    }

    @Test
    public void case115() {
        int s = 5;
        int t = 2;
        assertEquals("/+", oneregister.getProgram(s, t));
    }

    @Test
    public void case116() {
        int s = 3;
        int t = 9;
        assertEquals("*", oneregister.getProgram(s, t));
    }

    @Test
    public void case117() {
        int s = 3;
        int t = 6718464;
        assertEquals("+**+*", oneregister.getProgram(s, t));
    }

    @Test
    public void case118() {
        int s = 77;
        int t = 64;
        assertEquals("/+*+*", oneregister.getProgram(s, t));
    }

    @Test
    public void case119() {
        int s = 1;
        int t = 536870912;
        assertEquals("+*+*+**+", oneregister.getProgram(s, t));
    }

    @Test
    public void case120() {
        int s = 7;
        int t = 368947264;
        assertEquals("*+*+*", oneregister.getProgram(s, t));
    }

    @Test
    public void case121() {
        int s = 7;
        int t = 1;
        assertEquals("/", oneregister.getProgram(s, t));
    }

    @Test
    public void case122() {
        int s = 3;
        int t = 81;
        assertEquals("**", oneregister.getProgram(s, t));
    }

    @Test
    public void case123() {
        int s = 350490028;
        int t = 991619984;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case124() {
        int s = 67;
        int t = 1000000000;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case125() {
        int s = 268435457;
        int t = 536870913;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case126() {
        int s = 10;
        int t = 2;
        assertEquals("/+", oneregister.getProgram(s, t));
    }

    @Test
    public void case127() {
        int s = 1000000000;
        int t = 999999999;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case128() {
        int s = 1;
        int t = 1024;
        assertEquals("+**+*", oneregister.getProgram(s, t));
    }

    @Test
    public void case129() {
        int s = 524288;
        int t = 536870912;
        assertEquals("/+*+*+**+", oneregister.getProgram(s, t));
    }

    @Test
    public void case130() {
        int s = 3;
        int t = 402653184;
        assertEquals("+++++++++++++++++++++++++++", oneregister.getProgram(s, t));
    }

    @Test
    public void case131() {
        int s = 7;
        int t = 114688;
        assertEquals("++++++++++++++", oneregister.getProgram(s, t));
    }

    @Test
    public void case132() {
        int s = 9;
        int t = 36;
        assertEquals("++", oneregister.getProgram(s, t));
    }

    @Test
    public void case133() {
        int s = 434;
        int t = 134217728;
        assertEquals("/+*+**+*+", oneregister.getProgram(s, t));
    }

    @Test
    public void case134() {
        int s = 1;
        int t = 43;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case135() {
        int s = 10;
        int t = 4;
        assertEquals("/+*", oneregister.getProgram(s, t));
    }

    @Test
    public void case136() {
        int s = 17;
        int t = 16;
        assertEquals("/+**", oneregister.getProgram(s, t));
    }

    @Test
    public void case137() {
        int s = 10889;
        int t = 10;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case138() {
        int s = 3;
        int t = 805306368;
        assertEquals("++++++++++++++++++++++++++++", oneregister.getProgram(s, t));
    }

    @Test
    public void case139() {
        int s = 12345;
        int t = 2;
        assertEquals("/+", oneregister.getProgram(s, t));
    }

    @Test
    public void case140() {
        int s = 3;
        int t = 256;
        assertEquals("/+***", oneregister.getProgram(s, t));
    }

    @Test
    public void case141() {
        int s = 999999999;
        int t = 808348673;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case142() {
        int s = 3;
        int t = 60466176;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case143() {
        int s = 7;
        int t = 2048;
        assertEquals("/+**+*+", oneregister.getProgram(s, t));
    }

    @Test
    public void case144() {
        int s = 128;
        int t = 256;
        assertEquals("+", oneregister.getProgram(s, t));
    }

    @Test
    public void case145() {
        int s = 8;
        int t = 16;
        assertEquals("+", oneregister.getProgram(s, t));
    }

    @Test
    public void case146() {
        int s = 7;
        int t = 49;
        assertEquals("*", oneregister.getProgram(s, t));
    }

    @Test
    public void case147() {
        int s = 162;
        int t = 104976;
        assertEquals("+*", oneregister.getProgram(s, t));
    }

    @Test
    public void case148() {
        int s = 1;
        int t = 5;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case149() {
        int s = 324987325;
        int t = 382975023;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case150() {
        int s = 3;
        int t = 2;
        assertEquals("/+", oneregister.getProgram(s, t));
    }

    @Test
    public void case151() {
        int s = 132;
        int t = 2;
        assertEquals("/+", oneregister.getProgram(s, t));
    }

    @Test
    public void case152() {
        int s = 1;
        int t = 805306368;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case153() {
        int s = 2;
        int t = 6;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case154() {
        int s = 65538;
        int t = 262148;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case155() {
        int s = 343;
        int t = 33554432;
        assertEquals("/+*+***+", oneregister.getProgram(s, t));
    }

    @Test
    public void case156() {
        int s = 3;
        int t = 1000000000;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case157() {
        int s = 77;
        int t = 2097152;
        assertEquals("/+**+**+", oneregister.getProgram(s, t));
    }

    @Test
    public void case158() {
        int s = 10000000;
        int t = 1;
        assertEquals("/", oneregister.getProgram(s, t));
    }

    @Test
    public void case159() {
        int s = 9;
        int t = 589824;
        assertEquals("++++++++++++++++", oneregister.getProgram(s, t));
    }

    @Test
    public void case160() {
        int s = 10000;
        int t = 100000000;
        assertEquals("*", oneregister.getProgram(s, t));
    }

    @Test
    public void case161() {
        int s = 6;
        int t = 787346436;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case162() {
        int s = 536870913;
        int t = 536870912;
        assertEquals("/+*+*+**+", oneregister.getProgram(s, t));
    }

    @Test
    public void case163() {
        int s = 50;
        int t = 100;
        assertEquals("+", oneregister.getProgram(s, t));
    }

    @Test
    public void case164() {
        int s = 7;
        int t = 1000000000;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case165() {
        int s = 7;
        int t = 8;
        assertEquals("/+*+", oneregister.getProgram(s, t));
    }

    @Test
    public void case166() {
        int s = 500000000;
        int t = 1000000000;
        assertEquals("+", oneregister.getProgram(s, t));
    }

    @Test
    public void case167() {
        int s = 7;
        int t = 268435456;
        assertEquals("/+*+*+**", oneregister.getProgram(s, t));
    }

    @Test
    public void case168() {
        int s = 3;
        int t = 11;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case169() {
        int s = 6;
        int t = 18;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case170() {
        int s = 16384;
        int t = 134217728;
        assertEquals("/+*+**+*+", oneregister.getProgram(s, t));
    }

    @Test
    public void case171() {
        int s = 256;
        int t = 1024;
        assertEquals("++", oneregister.getProgram(s, t));
    }

    @Test
    public void case172() {
        int s = 1;
        int t = 64;
        assertEquals("+*+*", oneregister.getProgram(s, t));
    }

    @Test
    public void case173() {
        int s = 17;
        int t = 8;
        assertEquals("/+*+", oneregister.getProgram(s, t));
    }

    @Test
    public void case174() {
        int s = 31000;
        int t = 961000000;
        assertEquals("*", oneregister.getProgram(s, t));
    }

    @Test
    public void case175() {
        int s = 512;
        int t = 131072;
        assertEquals("/+****+", oneregister.getProgram(s, t));
    }

    @Test
    public void case176() {
        int s = 500000;
        int t = 891896832;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case177() {
        int s = 3;
        int t = 536870912;
        assertEquals("/+*+*+**+", oneregister.getProgram(s, t));
    }

    @Test
    public void case178() {
        int s = 1024;
        int t = 65536;
        assertEquals("++++++", oneregister.getProgram(s, t));
    }

    @Test
    public void case179() {
        int s = 5;
        int t = 83886080;
        assertEquals("++++++++++++++++++++++++", oneregister.getProgram(s, t));
    }

    @Test
    public void case180() {
        int s = 64;
        int t = 256;
        assertEquals("++", oneregister.getProgram(s, t));
    }

    @Test
    public void case181() {
        int s = 7;
        int t = 14680064;
        assertEquals("+++++++++++++++++++++", oneregister.getProgram(s, t));
    }

    @Test
    public void case182() {
        int s = 2;
        int t = 67108864;
        assertEquals("*+**+*", oneregister.getProgram(s, t));
    }

    @Test
    public void case183() {
        int s = 1;
        int t = 3;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case184() {
        int s = 65500;
        int t = 70000;
        assertEquals(":-(", oneregister.getProgram(s, t));
    }

    @Test
    public void case185() {
        int s = 3;
        int t = 65536;
        assertEquals("/+****", oneregister.getProgram(s, t));
    }

}
