package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class DivideAndShiftTest {
    DivideAndShift divideandshift = new DivideAndShift();

    @Test
    public void case1() {
        int N = 56;
        int M = 14;
        assertEquals(3, divideandshift.getLeast(N, M));
    }

    @Test
    public void case2() {
        int N = 49;
        int M = 5;
        assertEquals(2, divideandshift.getLeast(N, M));
    }

    @Test
    public void case3() {
        int N = 256;
        int M = 7;
        assertEquals(6, divideandshift.getLeast(N, M));
    }

    @Test
    public void case4() {
        int N = 1;
        int M = 1;
        assertEquals(0, divideandshift.getLeast(N, M));
    }

    @Test
    public void case5() {
        int N = 7;
        int M = 3;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case6() {
        int N = 6;
        int M = 1;
        assertEquals(0, divideandshift.getLeast(N, M));
    }

    @Test
    public void case7() {
        int N = 93;
        int M = 13;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case8() {
        int N = 256;
        int M = 255;
        assertEquals(2, divideandshift.getLeast(N, M));
    }

    @Test
    public void case9() {
        int N = 1000000;
        int M = 1234;
        assertEquals(9, divideandshift.getLeast(N, M));
    }

    @Test
    public void case10() {
        int N = 123456;
        int M = 12347;
        assertEquals(7, divideandshift.getLeast(N, M));
    }

    @Test
    public void case11() {
        int N = 999999;
        int M = 215;
        assertEquals(6, divideandshift.getLeast(N, M));
    }

    @Test
    public void case12() {
        int N = 999999;
        int M = 234625;
        assertEquals(5, divideandshift.getLeast(N, M));
    }

    @Test
    public void case13() {
        int N = 3;
        int M = 2;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case14() {
        int N = 2;
        int M = 2;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case15() {
        int N = 4;
        int M = 3;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case16() {
        int N = 5;
        int M = 3;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case17() {
        int N = 8;
        int M = 6;
        assertEquals(2, divideandshift.getLeast(N, M));
    }

    @Test
    public void case18() {
        int N = 9;
        int M = 6;
        assertEquals(2, divideandshift.getLeast(N, M));
    }

    @Test
    public void case19() {
        int N = 12;
        int M = 11;
        assertEquals(2, divideandshift.getLeast(N, M));
    }

    @Test
    public void case20() {
        int N = 14;
        int M = 8;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case21() {
        int N = 15;
        int M = 9;
        assertEquals(2, divideandshift.getLeast(N, M));
    }

    @Test
    public void case22() {
        int N = 16;
        int M = 11;
        assertEquals(3, divideandshift.getLeast(N, M));
    }

    @Test
    public void case23() {
        int N = 16;
        int M = 12;
        assertEquals(3, divideandshift.getLeast(N, M));
    }

    @Test
    public void case24() {
        int N = 27;
        int M = 23;
        assertEquals(3, divideandshift.getLeast(N, M));
    }

    @Test
    public void case25() {
        int N = 32;
        int M = 11;
        assertEquals(4, divideandshift.getLeast(N, M));
    }

    @Test
    public void case26() {
        int N = 32;
        int M = 12;
        assertEquals(4, divideandshift.getLeast(N, M));
    }

    @Test
    public void case27() {
        int N = 32;
        int M = 16;
        assertEquals(2, divideandshift.getLeast(N, M));
    }

    @Test
    public void case28() {
        int N = 35;
        int M = 29;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case29() {
        int N = 100;
        int M = 58;
        assertEquals(3, divideandshift.getLeast(N, M));
    }

    @Test
    public void case30() {
        int N = 108;
        int M = 6;
        assertEquals(4, divideandshift.getLeast(N, M));
    }

    @Test
    public void case31() {
        int N = 512;
        int M = 13;
        assertEquals(7, divideandshift.getLeast(N, M));
    }

    @Test
    public void case32() {
        int N = 4096;
        int M = 666;
        assertEquals(10, divideandshift.getLeast(N, M));
    }

    @Test
    public void case33() {
        int N = 5096;
        int M = 776;
        assertEquals(4, divideandshift.getLeast(N, M));
    }

    @Test
    public void case34() {
        int N = 10000;
        int M = 6123;
        assertEquals(6, divideandshift.getLeast(N, M));
    }

    @Test
    public void case35() {
        int N = 6144;
        int M = 20;
        assertEquals(11, divideandshift.getLeast(N, M));
    }

    @Test
    public void case36() {
        int N = 6144;
        int M = 63;
        assertEquals(8, divideandshift.getLeast(N, M));
    }

    @Test
    public void case37() {
        int N = 8192;
        int M = 4110;
        assertEquals(12, divideandshift.getLeast(N, M));
    }

    @Test
    public void case38() {
        int N = 19999;
        int M = 521;
        assertEquals(2, divideandshift.getLeast(N, M));
    }

    @Test
    public void case39() {
        int N = 19945;
        int M = 229;
        assertEquals(2, divideandshift.getLeast(N, M));
    }

    @Test
    public void case40() {
        int N = 25998;
        int M = 15633;
        assertEquals(3, divideandshift.getLeast(N, M));
    }

    @Test
    public void case41() {
        int N = 59049;
        int M = 12157;
        assertEquals(9, divideandshift.getLeast(N, M));
    }

    @Test
    public void case42() {
        int N = 59049;
        int M = 57851;
        assertEquals(10, divideandshift.getLeast(N, M));
    }

    @Test
    public void case43() {
        int N = 59049;
        int M = 59045;
        assertEquals(5, divideandshift.getLeast(N, M));
    }

    @Test
    public void case44() {
        int N = 524288;
        int M = 55022;
        assertEquals(18, divideandshift.getLeast(N, M));
    }

    @Test
    public void case45() {
        int N = 524288;
        int M = 625;
        assertEquals(15, divideandshift.getLeast(N, M));
    }

    @Test
    public void case46() {
        int N = 200000;
        int M = 47237;
        assertEquals(9, divideandshift.getLeast(N, M));
    }

    @Test
    public void case47() {
        int N = 173734;
        int M = 58450;
        assertEquals(4, divideandshift.getLeast(N, M));
    }

    @Test
    public void case48() {
        int N = 360216;
        int M = 6327;
        assertEquals(5, divideandshift.getLeast(N, M));
    }

    @Test
    public void case49() {
        int N = 360216;
        int M = 284234;
        assertEquals(3, divideandshift.getLeast(N, M));
    }

    @Test
    public void case50() {
        int N = 1000000;
        int M = 1;
        assertEquals(0, divideandshift.getLeast(N, M));
    }

    @Test
    public void case51() {
        int N = 1000000;
        int M = 999999;
        assertEquals(2, divideandshift.getLeast(N, M));
    }

    @Test
    public void case52() {
        int N = 1000000;
        int M = 964998;
        assertEquals(8, divideandshift.getLeast(N, M));
    }

    @Test
    public void case53() {
        int N = 1000000;
        int M = 631233;
        assertEquals(6, divideandshift.getLeast(N, M));
    }

    @Test
    public void case54() {
        int N = 1000000;
        int M = 718118;
        assertEquals(11, divideandshift.getLeast(N, M));
    }

    @Test
    public void case55() {
        int N = 1000000;
        int M = 66;
        assertEquals(7, divideandshift.getLeast(N, M));
    }

    @Test
    public void case56() {
        int N = 1000000;
        int M = 999593;
        assertEquals(9, divideandshift.getLeast(N, M));
    }

    @Test
    public void case57() {
        int N = 999999;
        int M = 33;
        assertEquals(6, divideandshift.getLeast(N, M));
    }

    @Test
    public void case58() {
        int N = 999999;
        int M = 999999;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case59() {
        int N = 999999;
        int M = 96495;
        assertEquals(6, divideandshift.getLeast(N, M));
    }

    @Test
    public void case60() {
        int N = 969696;
        int M = 696696;
        assertEquals(5, divideandshift.getLeast(N, M));
    }

    @Test
    public void case61() {
        int N = 999983;
        int M = 427;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case62() {
        int N = 510510;
        int M = 44128;
        assertEquals(6, divideandshift.getLeast(N, M));
    }

    @Test
    public void case63() {
        int N = 510510;
        int M = 362585;
        assertEquals(6, divideandshift.getLeast(N, M));
    }

    @Test
    public void case64() {
        int N = 881790;
        int M = 61;
        assertEquals(4, divideandshift.getLeast(N, M));
    }

    @Test
    public void case65() {
        int N = 881790;
        int M = 428;
        assertEquals(6, divideandshift.getLeast(N, M));
    }

    @Test
    public void case66() {
        int N = 881790;
        int M = 17290;
        assertEquals(3, divideandshift.getLeast(N, M));
    }

    @Test
    public void case67() {
        int N = 881790;
        int M = 337156;
        assertEquals(2, divideandshift.getLeast(N, M));
    }

    @Test
    public void case68() {
        int N = 881790;
        int M = 337151;
        assertEquals(5, divideandshift.getLeast(N, M));
    }

    @Test
    public void case69() {
        int N = 881790;
        int M = 337152;
        assertEquals(6, divideandshift.getLeast(N, M));
    }

    @Test
    public void case70() {
        int N = 5184;
        int M = 1367;
        assertEquals(7, divideandshift.getLeast(N, M));
    }

    @Test
    public void case71() {
        int N = 972000;
        int M = 44;
        assertEquals(12, divideandshift.getLeast(N, M));
    }

    @Test
    public void case72() {
        int N = 972000;
        int M = 277634;
        assertEquals(7, divideandshift.getLeast(N, M));
    }

    @Test
    public void case73() {
        int N = 972000;
        int M = 324044;
        assertEquals(12, divideandshift.getLeast(N, M));
    }

    @Test
    public void case74() {
        int N = 408484;
        int M = 31267;
        assertEquals(2, divideandshift.getLeast(N, M));
    }

    @Test
    public void case75() {
        int N = 637377;
        int M = 636123;
        assertEquals(4, divideandshift.getLeast(N, M));
    }

    @Test
    public void case76() {
        int N = 999954;
        int M = 233632;
        assertEquals(3, divideandshift.getLeast(N, M));
    }

    @Test
    public void case77() {
        int N = 676892;
        int M = 123456;
        assertEquals(3, divideandshift.getLeast(N, M));
    }

    @Test
    public void case78() {
        int N = 356478;
        int M = 183526;
        assertEquals(4, divideandshift.getLeast(N, M));
    }

    @Test
    public void case79() {
        int N = 876542;
        int M = 123537;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case80() {
        int N = 964999;
        int M = 488425;
        assertEquals(3, divideandshift.getLeast(N, M));
    }

    @Test
    public void case81() {
        int N = 524288;
        int M = 27;
        assertEquals(18, divideandshift.getLeast(N, M));
    }

    @Test
    public void case82() {
        int N = 360360;
        int M = 4374;
        assertEquals(7, divideandshift.getLeast(N, M));
    }

    @Test
    public void case83() {
        int N = 77777;
        int M = 11111;
        assertEquals(2, divideandshift.getLeast(N, M));
    }

    @Test
    public void case84() {
        int N = 997920;
        int M = 508988;
        assertEquals(10, divideandshift.getLeast(N, M));
    }

    @Test
    public void case85() {
        int N = 997920;
        int M = 97115;
        assertEquals(11, divideandshift.getLeast(N, M));
    }

    @Test
    public void case86() {
        int N = 1000000;
        int M = 806790;
        assertEquals(11, divideandshift.getLeast(N, M));
    }

    @Test
    public void case87() {
        int N = 1000000;
        int M = 100012;
        assertEquals(11, divideandshift.getLeast(N, M));
    }

    @Test
    public void case88() {
        int N = 1000000;
        int M = 42354;
        assertEquals(9, divideandshift.getLeast(N, M));
    }

    @Test
    public void case89() {
        int N = 362880;
        int M = 77777;
        assertEquals(9, divideandshift.getLeast(N, M));
    }

    @Test
    public void case90() {
        int N = 1000000;
        int M = 1000000;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case91() {
        int N = 418944;
        int M = 161799;
        assertEquals(8, divideandshift.getLeast(N, M));
    }

    @Test
    public void case92() {
        int N = 345534;
        int M = 234139;
        assertEquals(3, divideandshift.getLeast(N, M));
    }

    @Test
    public void case93() {
        int N = 7;
        int M = 1;
        assertEquals(0, divideandshift.getLeast(N, M));
    }

    @Test
    public void case94() {
        int N = 984712;
        int M = 302000;
        assertEquals(3, divideandshift.getLeast(N, M));
    }

    @Test
    public void case95() {
        int N = 999983;
        int M = 500000;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case96() {
        int N = 999947;
        int M = 336327;
        assertEquals(2, divideandshift.getLeast(N, M));
    }

    @Test
    public void case97() {
        int N = 720720;
        int M = 462363;
        assertEquals(7, divideandshift.getLeast(N, M));
    }

    @Test
    public void case98() {
        int N = 600;
        int M = 67;
        assertEquals(4, divideandshift.getLeast(N, M));
    }

    @Test
    public void case99() {
        int N = 786432;
        int M = 222222;
        assertEquals(18, divideandshift.getLeast(N, M));
    }

    @Test
    public void case100() {
        int N = 169;
        int M = 7;
        assertEquals(2, divideandshift.getLeast(N, M));
    }

    @Test
    public void case101() {
        int N = 987524;
        int M = 254782;
        assertEquals(3, divideandshift.getLeast(N, M));
    }

    @Test
    public void case102() {
        int N = 147456;
        int M = 127523;
        assertEquals(13, divideandshift.getLeast(N, M));
    }

    @Test
    public void case103() {
        int N = 999983;
        int M = 1515;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case104() {
        int N = 786432;
        int M = 24606;
        assertEquals(17, divideandshift.getLeast(N, M));
    }

    @Test
    public void case105() {
        int N = 13;
        int M = 5;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case106() {
        int N = 11;
        int M = 5;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case107() {
        int N = 1000000;
        int M = 100;
        assertEquals(9, divideandshift.getLeast(N, M));
    }

    @Test
    public void case108() {
        int N = 12;
        int M = 5;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case109() {
        int N = 1000000;
        int M = 100000;
        assertEquals(3, divideandshift.getLeast(N, M));
    }

    @Test
    public void case110() {
        int N = 3000;
        int M = 2001;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case111() {
        int N = 10;
        int M = 5;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case112() {
        int N = 999983;
        int M = 999982;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case113() {
        int N = 77;
        int M = 75;
        assertEquals(2, divideandshift.getLeast(N, M));
    }

    @Test
    public void case114() {
        int N = 55997;
        int M = 20000;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case115() {
        int N = 100;
        int M = 100;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case116() {
        int N = 53;
        int M = 42;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case117() {
        int N = 200006;
        int M = 100004;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case118() {
        int N = 127;
        int M = 5;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case119() {
        int N = 125;
        int M = 8;
        assertEquals(3, divideandshift.getLeast(N, M));
    }

    @Test
    public void case120() {
        int N = 997920;
        int M = 22222;
        assertEquals(9, divideandshift.getLeast(N, M));
    }

    @Test
    public void case121() {
        int N = 20;
        int M = 14;
        assertEquals(2, divideandshift.getLeast(N, M));
    }

    @Test
    public void case122() {
        int N = 1000000;
        int M = 123456;
        assertEquals(7, divideandshift.getLeast(N, M));
    }

    @Test
    public void case123() {
        int N = 1000000;
        int M = 14;
        assertEquals(11, divideandshift.getLeast(N, M));
    }

    @Test
    public void case124() {
        int N = 200;
        int M = 2;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case125() {
        int N = 1000000;
        int M = 598432;
        assertEquals(8, divideandshift.getLeast(N, M));
    }

    @Test
    public void case126() {
        int N = 6;
        int M = 3;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case127() {
        int N = 524288;
        int M = 11111;
        assertEquals(18, divideandshift.getLeast(N, M));
    }

    @Test
    public void case128() {
        int N = 100003;
        int M = 19;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case129() {
        int N = 700001;
        int M = 350000;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case130() {
        int N = 77;
        int M = 8;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case131() {
        int N = 161051;
        int M = 123;
        assertEquals(4, divideandshift.getLeast(N, M));
    }

    @Test
    public void case132() {
        int N = 999983;
        int M = 444444;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case133() {
        int N = 324;
        int M = 19;
        assertEquals(3, divideandshift.getLeast(N, M));
    }

    @Test
    public void case134() {
        int N = 590340;
        int M = 59;
        assertEquals(3, divideandshift.getLeast(N, M));
    }

    @Test
    public void case135() {
        int N = 1000000;
        int M = 985421;
        assertEquals(9, divideandshift.getLeast(N, M));
    }

    @Test
    public void case136() {
        int N = 8;
        int M = 2;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case137() {
        int N = 333101;
        int M = 257733;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case138() {
        int N = 999958;
        int M = 499979;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case139() {
        int N = 5098;
        int M = 1219;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case140() {
        int N = 999999;
        int M = 123457;
        assertEquals(6, divideandshift.getLeast(N, M));
    }

    @Test
    public void case141() {
        int N = 999983;
        int M = 555555;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case142() {
        int N = 7;
        int M = 7;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case143() {
        int N = 720720;
        int M = 86719;
        assertEquals(7, divideandshift.getLeast(N, M));
    }

    @Test
    public void case144() {
        int N = 9;
        int M = 9;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case145() {
        int N = 15;
        int M = 4;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case146() {
        int N = 65;
        int M = 6;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case147() {
        int N = 524288;
        int M = 262044;
        assertEquals(18, divideandshift.getLeast(N, M));
    }

    @Test
    public void case148() {
        int N = 6;
        int M = 4;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case149() {
        int N = 524288;
        int M = 524288;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case150() {
        int N = 523673;
        int M = 10000;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case151() {
        int N = 17;
        int M = 5;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case152() {
        int N = 2;
        int M = 1;
        assertEquals(0, divideandshift.getLeast(N, M));
    }

    @Test
    public void case153() {
        int N = 71;
        int M = 5;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case154() {
        int N = 10007;
        int M = 5000;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case155() {
        int N = 8;
        int M = 8;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case156() {
        int N = 84822;
        int M = 58094;
        assertEquals(3, divideandshift.getLeast(N, M));
    }

    @Test
    public void case157() {
        int N = 33;
        int M = 13;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case158() {
        int N = 80640;
        int M = 11;
        assertEquals(10, divideandshift.getLeast(N, M));
    }

    @Test
    public void case159() {
        int N = 68;
        int M = 4;
        assertEquals(2, divideandshift.getLeast(N, M));
    }

    @Test
    public void case160() {
        int N = 147;
        int M = 147;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case161() {
        int N = 100003;
        int M = 12345;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case162() {
        int N = 899197;
        int M = 123934;
        assertEquals(3, divideandshift.getLeast(N, M));
    }

    @Test
    public void case163() {
        int N = 1000000;
        int M = 15724;
        assertEquals(11, divideandshift.getLeast(N, M));
    }

    @Test
    public void case164() {
        int N = 524288;
        int M = 524270;
        assertEquals(18, divideandshift.getLeast(N, M));
    }

    @Test
    public void case165() {
        int N = 531441;
        int M = 531411;
        assertEquals(12, divideandshift.getLeast(N, M));
    }

    @Test
    public void case166() {
        int N = 987584;
        int M = 675947;
        assertEquals(7, divideandshift.getLeast(N, M));
    }

    @Test
    public void case167() {
        int N = 999997;
        int M = 65537;
        assertEquals(2, divideandshift.getLeast(N, M));
    }

    @Test
    public void case168() {
        int N = 500000;
        int M = 102020;
        assertEquals(9, divideandshift.getLeast(N, M));
    }

    @Test
    public void case169() {
        int N = 524288;
        int M = 1934;
        assertEquals(18, divideandshift.getLeast(N, M));
    }

    @Test
    public void case170() {
        int N = 18;
        int M = 5;
        assertEquals(2, divideandshift.getLeast(N, M));
    }

    @Test
    public void case171() {
        int N = 983557;
        int M = 343;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case172() {
        int N = 55;
        int M = 6;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case173() {
        int N = 931327;
        int M = 889286;
        assertEquals(2, divideandshift.getLeast(N, M));
    }

    @Test
    public void case174() {
        int N = 362880;
        int M = 123456;
        assertEquals(7, divideandshift.getLeast(N, M));
    }

    @Test
    public void case175() {
        int N = 391;
        int M = 18;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case176() {
        int N = 1001;
        int M = 1000;
        assertEquals(2, divideandshift.getLeast(N, M));
    }

    @Test
    public void case177() {
        int N = 524287;
        int M = 123456;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case178() {
        int N = 198273;
        int M = 128376;
        assertEquals(4, divideandshift.getLeast(N, M));
    }

    @Test
    public void case179() {
        int N = 4199;
        int M = 18;
        assertEquals(2, divideandshift.getLeast(N, M));
    }

    @Test
    public void case180() {
        int N = 8;
        int M = 4;
        assertEquals(2, divideandshift.getLeast(N, M));
    }

    @Test
    public void case181() {
        int N = 7;
        int M = 4;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case182() {
        int N = 524288;
        int M = 50;
        assertEquals(16, divideandshift.getLeast(N, M));
    }

    @Test
    public void case183() {
        int N = 87;
        int M = 85;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case184() {
        int N = 510510;
        int M = 1991;
        assertEquals(5, divideandshift.getLeast(N, M));
    }

    @Test
    public void case185() {
        int N = 200006;
        int M = 3;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case186() {
        int N = 997920;
        int M = 111111;
        assertEquals(10, divideandshift.getLeast(N, M));
    }

    @Test
    public void case187() {
        int N = 524288;
        int M = 523066;
        assertEquals(17, divideandshift.getLeast(N, M));
    }

    @Test
    public void case188() {
        int N = 510510;
        int M = 30031;
        assertEquals(1, divideandshift.getLeast(N, M));
    }

    @Test
    public void case189() {
        int N = 5706;
        int M = 5322;
        assertEquals(3, divideandshift.getLeast(N, M));
    }

}
