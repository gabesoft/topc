package topc.test.simulation;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.simulation.*;

public class DoubleXorTest {
    DoubleXor doublexor = new DoubleXor();

    @Test
    public void case1() {
        int N = 1;
        assertEquals(1, doublexor.calculate(N));
    }

    @Test
    public void case2() {
        int N = 2;
        assertEquals(3, doublexor.calculate(N));
    }

    @Test
    public void case3() {
        int N = 7;
        assertEquals(0, doublexor.calculate(N));
    }

    @Test
    public void case4() {
        int N = 10;
        assertEquals(11, doublexor.calculate(N));
    }

    @Test
    public void case5() {
        int N = 100;
        assertEquals(100, doublexor.calculate(N));
    }

    @Test
    public void case6() {
        int N = 1000;
        assertEquals(1000, doublexor.calculate(N));
    }

    @Test
    public void case7() {
        int N = 10000;
        assertEquals(10000, doublexor.calculate(N));
    }

    @Test
    public void case8() {
        int N = 100000;
        assertEquals(100000, doublexor.calculate(N));
    }

    @Test
    public void case9() {
        int N = 1000000;
        assertEquals(1000000, doublexor.calculate(N));
    }

    @Test
    public void case10() {
        int N = 9;
        assertEquals(1, doublexor.calculate(N));
    }

    @Test
    public void case11() {
        int N = 99;
        assertEquals(0, doublexor.calculate(N));
    }

    @Test
    public void case12() {
        int N = 999;
        assertEquals(0, doublexor.calculate(N));
    }

    @Test
    public void case13() {
        int N = 9999;
        assertEquals(0, doublexor.calculate(N));
    }

    @Test
    public void case14() {
        int N = 99999;
        assertEquals(0, doublexor.calculate(N));
    }

    @Test
    public void case15() {
        int N = 999999;
        assertEquals(0, doublexor.calculate(N));
    }

    @Test
    public void case16() {
        int N = 1;
        assertEquals(1, doublexor.calculate(N));
    }

    @Test
    public void case17() {
        int N = 11;
        assertEquals(0, doublexor.calculate(N));
    }

    @Test
    public void case18() {
        int N = 111;
        assertEquals(0, doublexor.calculate(N));
    }

    @Test
    public void case19() {
        int N = 1111;
        assertEquals(0, doublexor.calculate(N));
    }

    @Test
    public void case20() {
        int N = 11111;
        assertEquals(0, doublexor.calculate(N));
    }

    @Test
    public void case21() {
        int N = 111111;
        assertEquals(0, doublexor.calculate(N));
    }

    @Test
    public void case22() {
        int N = 22;
        assertEquals(23, doublexor.calculate(N));
    }

    @Test
    public void case23() {
        int N = 222;
        assertEquals(223, doublexor.calculate(N));
    }

    @Test
    public void case24() {
        int N = 2222;
        assertEquals(2223, doublexor.calculate(N));
    }

    @Test
    public void case25() {
        int N = 22222;
        assertEquals(22223, doublexor.calculate(N));
    }

    @Test
    public void case26() {
        int N = 222222;
        assertEquals(222223, doublexor.calculate(N));
    }

    @Test
    public void case27() {
        int N = 77;
        assertEquals(1, doublexor.calculate(N));
    }

    @Test
    public void case28() {
        int N = 777;
        assertEquals(1, doublexor.calculate(N));
    }

    @Test
    public void case29() {
        int N = 7777;
        assertEquals(1, doublexor.calculate(N));
    }

    @Test
    public void case30() {
        int N = 77777;
        assertEquals(1, doublexor.calculate(N));
    }

    @Test
    public void case31() {
        int N = 777777;
        assertEquals(1, doublexor.calculate(N));
    }

    @Test
    public void case32() {
        int N = 123456;
        assertEquals(123012, doublexor.calculate(N));
    }

    @Test
    public void case33() {
        int N = 654321;
        assertEquals(1, doublexor.calculate(N));
    }

    @Test
    public void case34() {
        int N = 78;
        assertEquals(73, doublexor.calculate(N));
    }

    @Test
    public void case35() {
        int N = 87;
        assertEquals(0, doublexor.calculate(N));
    }

    @Test
    public void case36() {
        int N = 31;
        assertEquals(0, doublexor.calculate(N));
    }

    @Test
    public void case37() {
        int N = 93;
        assertEquals(1, doublexor.calculate(N));
    }

    @Test
    public void case38() {
        int N = 98;
        assertEquals(33, doublexor.calculate(N));
    }

    @Test
    public void case39() {
        int N = 111;
        assertEquals(0, doublexor.calculate(N));
    }

    @Test
    public void case40() {
        int N = 121;
        assertEquals(1, doublexor.calculate(N));
    }

    @Test
    public void case41() {
        int N = 42;
        assertEquals(43, doublexor.calculate(N));
    }

    @Test
    public void case42() {
        int N = 18468;
        assertEquals(12022, doublexor.calculate(N));
    }

    @Test
    public void case43() {
        int N = 6335;
        assertEquals(0, doublexor.calculate(N));
    }

    @Test
    public void case44() {
        int N = 26501;
        assertEquals(1, doublexor.calculate(N));
    }

    @Test
    public void case45() {
        int N = 19170;
        assertEquals(13131, doublexor.calculate(N));
    }

    @Test
    public void case46() {
        int N = 15725;
        assertEquals(1, doublexor.calculate(N));
    }

    @Test
    public void case47() {
        int N = 11479;
        assertEquals(0, doublexor.calculate(N));
    }

    @Test
    public void case48() {
        int N = 29359;
        assertEquals(0, doublexor.calculate(N));
    }

    @Test
    public void case49() {
        int N = 26963;
        assertEquals(0, doublexor.calculate(N));
    }

    @Test
    public void case50() {
        int N = 24465;
        assertEquals(1, doublexor.calculate(N));
    }

    @Test
    public void case51() {
        int N = 5706;
        assertEquals(5303, doublexor.calculate(N));
    }

    @Test
    public void case52() {
        int N = 28146;
        assertEquals(22103, doublexor.calculate(N));
    }

    @Test
    public void case53() {
        int N = 23282;
        assertEquals(23223, doublexor.calculate(N));
    }

    @Test
    public void case54() {
        int N = 16828;
        assertEquals(12222, doublexor.calculate(N));
    }

    @Test
    public void case55() {
        int N = 9962;
        assertEquals(3323, doublexor.calculate(N));
    }

    @Test
    public void case56() {
        int N = 492;
        assertEquals(432, doublexor.calculate(N));
    }

    @Test
    public void case57() {
        int N = 2996;
        assertEquals(2332, doublexor.calculate(N));
    }

    @Test
    public void case58() {
        int N = 11943;
        assertEquals(0, doublexor.calculate(N));
    }

    @Test
    public void case59() {
        int N = 4828;
        assertEquals(4222, doublexor.calculate(N));
    }

    @Test
    public void case60() {
        int N = 5437;
        assertEquals(1, doublexor.calculate(N));
    }

    @Test
    public void case61() {
        int N = 32392;
        assertEquals(32332, doublexor.calculate(N));
    }

    @Test
    public void case62() {
        int N = 14605;
        assertEquals(1, doublexor.calculate(N));
    }

    @Test
    public void case63() {
        int N = 3903;
        assertEquals(0, doublexor.calculate(N));
    }

    @Test
    public void case64() {
        int N = 154;
        assertEquals(111, doublexor.calculate(N));
    }

    @Test
    public void case65() {
        int N = 293;
        assertEquals(1, doublexor.calculate(N));
    }

    @Test
    public void case66() {
        int N = 12383;
        assertEquals(0, doublexor.calculate(N));
    }

    @Test
    public void case67() {
        int N = 17422;
        assertEquals(13023, doublexor.calculate(N));
    }

    @Test
    public void case68() {
        int N = 18717;
        assertEquals(1, doublexor.calculate(N));
    }

    @Test
    public void case69() {
        int N = 19719;
        assertEquals(0, doublexor.calculate(N));
    }

    @Test
    public void case70() {
        int N = 19896;
        assertEquals(13232, doublexor.calculate(N));
    }

    @Test
    public void case71() {
        int N = 5448;
        assertEquals(5002, doublexor.calculate(N));
    }

    @Test
    public void case72() {
        int N = 21727;
        assertEquals(0, doublexor.calculate(N));
    }

    @Test
    public void case73() {
        int N = 14772;
        assertEquals(10332, doublexor.calculate(N));
    }

    @Test
    public void case74() {
        int N = 11539;
        assertEquals(0, doublexor.calculate(N));
    }

    @Test
    public void case75() {
        int N = 1870;
        assertEquals(1231, doublexor.calculate(N));
    }

    @Test
    public void case76() {
        int N = 19913;
        assertEquals(1, doublexor.calculate(N));
    }

    @Test
    public void case77() {
        int N = 25668;
        assertEquals(21222, doublexor.calculate(N));
    }

    @Test
    public void case78() {
        int N = 26300;
        assertEquals(22300, doublexor.calculate(N));
    }

    @Test
    public void case79() {
        int N = 17036;
        assertEquals(13032, doublexor.calculate(N));
    }

    @Test
    public void case80() {
        int N = 9895;
        assertEquals(0, doublexor.calculate(N));
    }

    @Test
    public void case81() {
        int N = 28704;
        assertEquals(22300, doublexor.calculate(N));
    }

    @Test
    public void case82() {
        int N = 23812;
        assertEquals(23212, doublexor.calculate(N));
    }

    @Test
    public void case83() {
        int N = 31323;
        assertEquals(0, doublexor.calculate(N));
    }

    @Test
    public void case84() {
        int N = 30334;
        assertEquals(30331, doublexor.calculate(N));
    }

    @Test
    public void case85() {
        int N = 17674;
        assertEquals(13231, doublexor.calculate(N));
    }

    @Test
    public void case86() {
        int N = 4665;
        assertEquals(1, doublexor.calculate(N));
    }

    @Test
    public void case87() {
        int N = 15142;
        assertEquals(11103, doublexor.calculate(N));
    }

    @Test
    public void case88() {
        int N = 7712;
        assertEquals(7312, doublexor.calculate(N));
    }

    @Test
    public void case89() {
        int N = 28254;
        assertEquals(22211, doublexor.calculate(N));
    }

    @Test
    public void case90() {
        int N = 6869;
        assertEquals(1, doublexor.calculate(N));
    }

    @Test
    public void case91() {
        int N = 19656;
        assertEquals(13212, doublexor.calculate(N));
    }

    @Test
    public void case92() {
        int N = 167835;
        assertEquals(0, doublexor.calculate(N));
    }

    @Test
    public void case93() {
        int N = 123250;
        assertEquals(123211, doublexor.calculate(N));
    }

    @Test
    public void case94() {
        int N = 171961;
        assertEquals(1, doublexor.calculate(N));
    }

    @Test
    public void case95() {
        int N = 447795;
        assertEquals(0, doublexor.calculate(N));
    }

    @Test
    public void case96() {
        int N = 103076;
        assertEquals(103032, doublexor.calculate(N));
    }

    @Test
    public void case97() {
        int N = 233496;
        assertEquals(233032, doublexor.calculate(N));
    }

    @Test
    public void case98() {
        int N = 473304;
        assertEquals(433300, doublexor.calculate(N));
    }

    @Test
    public void case99() {
        int N = 939228;
        assertEquals(333222, doublexor.calculate(N));
    }

    @Test
    public void case100() {
        int N = 361836;
        assertEquals(321232, doublexor.calculate(N));
    }

    @Test
    public void case101() {
        int N = 237160;
        assertEquals(233120, doublexor.calculate(N));
    }

    @Test
    public void case102() {
        int N = 139062;
        assertEquals(133023, doublexor.calculate(N));
    }

    @Test
    public void case103() {
        int N = 112219;
        assertEquals(0, doublexor.calculate(N));
    }

    @Test
    public void case104() {
        int N = 302574;
        assertEquals(302131, doublexor.calculate(N));
    }

    @Test
    public void case105() {
        int N = 644224;
        assertEquals(600220, doublexor.calculate(N));
    }

    @Test
    public void case106() {
        int N = 325696;
        assertEquals(321232, doublexor.calculate(N));
    }

    @Test
    public void case107() {
        int N = 416108;
        assertEquals(412102, doublexor.calculate(N));
    }

    @Test
    public void case108() {
        int N = 794310;
        assertEquals(730311, doublexor.calculate(N));
    }

    @Test
    public void case109() {
        int N = 200400;
        assertEquals(200000, doublexor.calculate(N));
    }

    @Test
    public void case110() {
        int N = 32220;
        assertEquals(32220, doublexor.calculate(N));
    }

    @Test
    public void case111() {
        int N = 571648;
        assertEquals(531202, doublexor.calculate(N));
    }

    @Test
    public void case112() {
        int N = 107882;
        assertEquals(103223, doublexor.calculate(N));
    }

    @Test
    public void case113() {
        int N = 448210;
        assertEquals(402211, doublexor.calculate(N));
    }

    @Test
    public void case114() {
        int N = 101104;
        assertEquals(101100, doublexor.calculate(N));
    }

    @Test
    public void case115() {
        int N = 220726;
        assertEquals(220323, doublexor.calculate(N));
    }

    @Test
    public void case116() {
        int N = 353460;
        assertEquals(313020, doublexor.calculate(N));
    }

    @Test
    public void case117() {
        int N = 502554;
        assertEquals(502111, doublexor.calculate(N));
    }

    @Test
    public void case118() {
        int N = 32680;
        assertEquals(32220, doublexor.calculate(N));
    }

    @Test
    public void case119() {
        int N = 537208;
        assertEquals(533202, doublexor.calculate(N));
    }

    @Test
    public void case120() {
        int N = 412870;
        assertEquals(412231, doublexor.calculate(N));
    }

    @Test
    public void case121() {
        int N = 11412;
        assertEquals(11012, doublexor.calculate(N));
    }

    @Test
    public void case122() {
        int N = 161013;
        assertEquals(1, doublexor.calculate(N));
    }

    @Test
    public void case123() {
        int N = 30923;
        assertEquals(0, doublexor.calculate(N));
    }

    @Test
    public void case124() {
        int N = 38663;
        assertEquals(0, doublexor.calculate(N));
    }

    @Test
    public void case125() {
        int N = 171985;
        assertEquals(1, doublexor.calculate(N));
    }

    @Test
    public void case126() {
        int N = 360282;
        assertEquals(320223, doublexor.calculate(N));
    }

    @Test
    public void case127() {
        int N = 650430;
        assertEquals(610031, doublexor.calculate(N));
    }

    @Test
    public void case128() {
        int N = 130221;
        assertEquals(1, doublexor.calculate(N));
    }

    @Test
    public void case129() {
        int N = 714;
        assertEquals(711, doublexor.calculate(N));
    }

    @Test
    public void case130() {
        int N = 216306;
        assertEquals(212303, doublexor.calculate(N));
    }

    @Test
    public void case131() {
        int N = 393120;
        assertEquals(333120, doublexor.calculate(N));
    }

    @Test
    public void case132() {
        int N = 81175;
        assertEquals(0, doublexor.calculate(N));
    }

    @Test
    public void case133() {
        int N = 636637;
        assertEquals(1, doublexor.calculate(N));
    }

    @Test
    public void case134() {
        int N = 364559;
        assertEquals(0, doublexor.calculate(N));
    }

    @Test
    public void case135() {
        int N = 287988;
        assertEquals(223322, doublexor.calculate(N));
    }

    @Test
    public void case136() {
        int N = 415800;
        assertEquals(411200, doublexor.calculate(N));
    }

    @Test
    public void case137() {
        int N = 203148;
        assertEquals(203102, doublexor.calculate(N));
    }

    @Test
    public void case138() {
        int N = 289982;
        assertEquals(223323, doublexor.calculate(N));
    }

    @Test
    public void case139() {
        int N = 9877;
        assertEquals(1, doublexor.calculate(N));
    }

    @Test
    public void case140() {
        int N = 504060;
        assertEquals(500020, doublexor.calculate(N));
    }

    @Test
    public void case141() {
        int N = 102;
        assertEquals(103, doublexor.calculate(N));
    }

    @Test
    public void case142() {
        int N = 8;
        assertEquals(2, doublexor.calculate(N));
    }

    @Test
    public void case143() {
        int N = 11736;
        assertEquals(11332, doublexor.calculate(N));
    }

    @Test
    public void case144() {
        int N = 666;
        assertEquals(623, doublexor.calculate(N));
    }

    @Test
    public void case145() {
        int N = 999998;
        assertEquals(333333, doublexor.calculate(N));
    }

    @Test
    public void case146() {
        int N = 298;
        assertEquals(233, doublexor.calculate(N));
    }

    @Test
    public void case147() {
        int N = 4;
        assertEquals(4, doublexor.calculate(N));
    }

    @Test
    public void case148() {
        int N = 100006;
        assertEquals(100003, doublexor.calculate(N));
    }

    @Test
    public void case149() {
        int N = 1024;
        assertEquals(1020, doublexor.calculate(N));
    }

    @Test
    public void case150() {
        int N = 12;
        assertEquals(12, doublexor.calculate(N));
    }

    @Test
    public void case151() {
        int N = 12346;
        assertEquals(12303, doublexor.calculate(N));
    }

    @Test
    public void case152() {
        int N = 140;
        assertEquals(100, doublexor.calculate(N));
    }

    @Test
    public void case153() {
        int N = 666999;
        assertEquals(0, doublexor.calculate(N));
    }

    @Test
    public void case154() {
        int N = 927928;
        assertEquals(323322, doublexor.calculate(N));
    }

    @Test
    public void case155() {
        int N = 14;
        assertEquals(11, doublexor.calculate(N));
    }

    @Test
    public void case156() {
        int N = 987654;
        assertEquals(323211, doublexor.calculate(N));
    }

    @Test
    public void case157() {
        int N = 123142;
        assertEquals(123103, doublexor.calculate(N));
    }

    @Test
    public void case158() {
        int N = 100004;
        assertEquals(100000, doublexor.calculate(N));
    }

    @Test
    public void case159() {
        int N = 123458;
        assertEquals(123013, doublexor.calculate(N));
    }

    @Test
    public void case160() {
        int N = 4848;
        assertEquals(4202, doublexor.calculate(N));
    }

    @Test
    public void case161() {
        int N = 123124;
        assertEquals(123120, doublexor.calculate(N));
    }

    @Test
    public void case162() {
        int N = 46238;
        assertEquals(42233, doublexor.calculate(N));
    }

    @Test
    public void case163() {
        int N = 4736;
        assertEquals(4332, doublexor.calculate(N));
    }

    @Test
    public void case164() {
        int N = 123707;
        assertEquals(0, doublexor.calculate(N));
    }

    @Test
    public void case165() {
        int N = 300004;
        assertEquals(300000, doublexor.calculate(N));
    }

    @Test
    public void case166() {
        int N = 999973;
        assertEquals(1, doublexor.calculate(N));
    }

    @Test
    public void case167() {
        int N = 156;
        assertEquals(112, doublexor.calculate(N));
    }

    @Test
    public void case168() {
        int N = 289384;
        assertEquals(223320, doublexor.calculate(N));
    }

}
