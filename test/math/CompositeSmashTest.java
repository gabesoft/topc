package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class CompositeSmashTest {
    CompositeSmash compositesmash = new CompositeSmash();

    @Test
    public void case1() {
        int N = 517;
        int target = 47;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case2() {
        int N = 8;
        int target = 4;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case3() {
        int N = 12;
        int target = 6;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case4() {
        int N = 5;
        int target = 8;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case5() {
        int N = 100000;
        int target = 100000;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case6() {
        int N = 5858;
        int target = 2;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case7() {
        int N = 81461;
        int target = 2809;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case8() {
        int N = 2;
        int target = 2;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case9() {
        int N = 24517;
        int target = 24517;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case10() {
        int N = 23868;
        int target = 23868;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case11() {
        int N = 27981;
        int target = 27981;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case12() {
        int N = 7581;
        int target = 7;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case13() {
        int N = 77202;
        int target = 3;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case14() {
        int N = 33649;
        int target = 23;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case15() {
        int N = 64175;
        int target = 17;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case16() {
        int N = 68408;
        int target = 503;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case17() {
        int N = 45676;
        int target = 601;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case18() {
        int N = 52247;
        int target = 4019;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case19() {
        int N = 40648;
        int target = 5081;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case20() {
        int N = 65719;
        int target = 65719;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case21() {
        int N = 91733;
        int target = 91733;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case22() {
        int N = 8;
        int target = 4;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case23() {
        int N = 32768;
        int target = 4;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case24() {
        int N = 65536;
        int target = 4;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case25() {
        int N = 2187;
        int target = 9;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case26() {
        int N = 3125;
        int target = 25;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case27() {
        int N = 343;
        int target = 49;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case28() {
        int N = 14641;
        int target = 121;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case29() {
        int N = 2197;
        int target = 169;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case30() {
        int N = 4913;
        int target = 289;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case31() {
        int N = 6859;
        int target = 361;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case32() {
        int N = 12167;
        int target = 529;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case33() {
        int N = 24389;
        int target = 841;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case34() {
        int N = 29791;
        int target = 961;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case35() {
        int N = 50653;
        int target = 1369;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case36() {
        int N = 68921;
        int target = 1681;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case37() {
        int N = 79507;
        int target = 1849;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case38() {
        int N = 24517;
        int target = 23868;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case39() {
        int N = 27981;
        int target = 32111;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case40() {
        int N = 25696;
        int target = 63304;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case41() {
        int N = 39699;
        int target = 87448;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case42() {
        int N = 92401;
        int target = 11170;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case43() {
        int N = 74346;
        int target = 71633;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case44() {
        int N = 92758;
        int target = 89633;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case45() {
        int N = 70147;
        int target = 23873;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case46() {
        int N = 26578;
        int target = 20233;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case47() {
        int N = 79626;
        int target = 31543;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case48() {
        int N = 996;
        int target = 6;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case49() {
        int N = 69780;
        int target = 10;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case50() {
        int N = 66256;
        int target = 82;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case51() {
        int N = 10998;
        int target = 39;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case52() {
        int N = 55760;
        int target = 656;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case53() {
        int N = 58380;
        int target = 834;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case54() {
        int N = 17578;
        int target = 8789;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case55() {
        int N = 38940;
        int target = 1770;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case56() {
        int N = 53524;
        int target = 26762;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case57() {
        int N = 51162;
        int target = 25581;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case58() {
        int N = 16;
        int target = 8;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case59() {
        int N = 65536;
        int target = 8;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case60() {
        int N = 32768;
        int target = 8;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case61() {
        int N = 65536;
        int target = 256;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case62() {
        int N = 65536;
        int target = 32768;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case63() {
        int N = 6561;
        int target = 2187;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case64() {
        int N = 78125;
        int target = 15625;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case65() {
        int N = 16807;
        int target = 343;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case66() {
        int N = 14641;
        int target = 1331;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case67() {
        int N = 28561;
        int target = 2197;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case68() {
        int N = 83521;
        int target = 4913;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case69() {
        int N = 39601;
        int target = 199;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case70() {
        int N = 100000;
        int target = 2;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case71() {
        int N = 100000;
        int target = 50000;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case72() {
        int N = 100000;
        int target = 99999;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case73() {
        int N = 64;
        int target = 8;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case74() {
        int N = 512;
        int target = 8;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case75() {
        int N = 10000;
        int target = 100;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case76() {
        int N = 243;
        int target = 9;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case77() {
        int N = 169;
        int target = 13;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case78() {
        int N = 16;
        int target = 4;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case79() {
        int N = 64;
        int target = 4;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case80() {
        int N = 4;
        int target = 2;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case81() {
        int N = 59049;
        int target = 9;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case82() {
        int N = 24;
        int target = 2;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case83() {
        int N = 256;
        int target = 4;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case84() {
        int N = 32;
        int target = 4;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case85() {
        int N = 7;
        int target = 4;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case86() {
        int N = 24983;
        int target = 6;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case87() {
        int N = 25;
        int target = 5;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case88() {
        int N = 1024;
        int target = 2;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case89() {
        int N = 7;
        int target = 2;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case90() {
        int N = 90090;
        int target = 4;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case91() {
        int N = 11;
        int target = 3;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case92() {
        int N = 221;
        int target = 5;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case93() {
        int N = 25;
        int target = 3;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case94() {
        int N = 7;
        int target = 5;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case95() {
        int N = 3;
        int target = 2;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case96() {
        int N = 101;
        int target = 3;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case97() {
        int N = 81;
        int target = 9;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case98() {
        int N = 27;
        int target = 9;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case99() {
        int N = 14947;
        int target = 8911;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case100() {
        int N = 32;
        int target = 16;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case101() {
        int N = 64;
        int target = 16;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case102() {
        int N = 11;
        int target = 7;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case103() {
        int N = 13;
        int target = 2;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case104() {
        int N = 100000;
        int target = 3;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case105() {
        int N = 16807;
        int target = 49;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case106() {
        int N = 30;
        int target = 5;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case107() {
        int N = 10000;
        int target = 5;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case108() {
        int N = 5;
        int target = 3;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case109() {
        int N = 2;
        int target = 3;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case110() {
        int N = 17;
        int target = 13;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case111() {
        int N = 1024;
        int target = 4;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case112() {
        int N = 4;
        int target = 3;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case113() {
        int N = 66;
        int target = 6;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case114() {
        int N = 7;
        int target = 3;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case115() {
        int N = 50;
        int target = 97;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case116() {
        int N = 37;
        int target = 2;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case117() {
        int N = 512;
        int target = 9;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case118() {
        int N = 150;
        int target = 25;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case119() {
        int N = 101;
        int target = 50;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case120() {
        int N = 65536;
        int target = 2;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case121() {
        int N = 85085;
        int target = 11;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case122() {
        int N = 72361;
        int target = 269;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case123() {
        int N = 840;
        int target = 2;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case124() {
        int N = 10000;
        int target = 10000;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case125() {
        int N = 50;
        int target = 7;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case126() {
        int N = 15;
        int target = 2;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case127() {
        int N = 24;
        int target = 6;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case128() {
        int N = 105;
        int target = 7;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case129() {
        int N = 128;
        int target = 4;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case130() {
        int N = 36;
        int target = 9;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case131() {
        int N = 30;
        int target = 6;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case132() {
        int N = 5;
        int target = 2;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case133() {
        int N = 18;
        int target = 3;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case134() {
        int N = 97;
        int target = 2;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case135() {
        int N = 12;
        int target = 3;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case136() {
        int N = 24;
        int target = 8;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case137() {
        int N = 8;
        int target = 3;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case138() {
        int N = 80;
        int target = 5;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case139() {
        int N = 16;
        int target = 2;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case140() {
        int N = 70345;
        int target = 7;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case141() {
        int N = 7;
        int target = 7;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case142() {
        int N = 625;
        int target = 25;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case143() {
        int N = 32;
        int target = 8;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case144() {
        int N = 9;
        int target = 3;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case145() {
        int N = 7;
        int target = 6;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case146() {
        int N = 4096;
        int target = 4;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case147() {
        int N = 100;
        int target = 5;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case148() {
        int N = 36;
        int target = 6;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case149() {
        int N = 5;
        int target = 4;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case150() {
        int N = 48;
        int target = 3;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case151() {
        int N = 216;
        int target = 6;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case152() {
        int N = 85386;
        int target = 2;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case153() {
        int N = 11;
        int target = 9;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case154() {
        int N = 6;
        int target = 81;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case155() {
        int N = 519;
        int target = 17;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case156() {
        int N = 128;
        int target = 2;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case157() {
        int N = 96;
        int target = 2;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case158() {
        int N = 42;
        int target = 2;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case159() {
        int N = 14;
        int target = 7;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case160() {
        int N = 24;
        int target = 4;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case161() {
        int N = 17;
        int target = 6;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case162() {
        int N = 81;
        int target = 27;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case163() {
        int N = 36;
        int target = 2;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case164() {
        int N = 99760;
        int target = 10;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case165() {
        int N = 9;
        int target = 2;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case166() {
        int N = 49;
        int target = 7;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case167() {
        int N = 30;
        int target = 3;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case168() {
        int N = 6054;
        int target = 1009;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case169() {
        int N = 3402;
        int target = 3;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case170() {
        int N = 17;
        int target = 5;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case171() {
        int N = 10;
        int target = 7;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case172() {
        int N = 90090;
        int target = 6;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case173() {
        int N = 96;
        int target = 3;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case174() {
        int N = 12;
        int target = 4;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case175() {
        int N = 101;
        int target = 101;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case176() {
        int N = 85085;
        int target = 3;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case177() {
        int N = 2;
        int target = 4;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

    @Test
    public void case178() {
        int N = 60;
        int target = 5;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case179() {
        int N = 30;
        int target = 2;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case180() {
        int N = 60480;
        int target = 2;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case181() {
        int N = 256;
        int target = 2;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case182() {
        int N = 8;
        int target = 8;
        assertEquals("Yes", compositesmash.thePossible(N, target));
    }

    @Test
    public void case183() {
        int N = 3;
        int target = 9;
        assertEquals("No", compositesmash.thePossible(N, target));
    }

}
