package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class CarrotJumpingTest {
    CarrotJumping carrotjumping = new CarrotJumping();

    @Test
    public void case1() {
        int init = 125000000;
        assertEquals(1, carrotjumping.theJump(init));
    }

    @Test
    public void case2() {
        int init = 281250001;
        assertEquals(2, carrotjumping.theJump(init));
    }

    @Test
    public void case3() {
        int init = 974579565;
        assertEquals(-1, carrotjumping.theJump(init));
    }

    @Test
    public void case4() {
        int init = 18426114;
        assertEquals(58, carrotjumping.theJump(init));
    }

    @Test
    public void case5() {
        int init = 4530664;
        assertEquals(478, carrotjumping.theJump(init));
    }

    @Test
    public void case6() {
        int init = 610;
        assertEquals(-1, carrotjumping.theJump(init));
    }

    @Test
    public void case7() {
        int init = 754;
        assertEquals(-1, carrotjumping.theJump(init));
    }

    @Test
    public void case8() {
        int init = 705032704;
        assertEquals(-1, carrotjumping.theJump(init));
    }

    @Test
    public void case9() {
        int init = 579739909;
        assertEquals(99999, carrotjumping.theJump(init));
    }

    @Test
    public void case10() {
        int init = 289869954;
        assertEquals(99999, carrotjumping.theJump(init));
    }

    @Test
    public void case11() {
        int init = 644934980;
        assertEquals(99999, carrotjumping.theJump(init));
    }

    @Test
    public void case12() {
        int init = 822467493;
        assertEquals(100000, carrotjumping.theJump(init));
    }

    @Test
    public void case13() {
        int init = 411233746;
        assertEquals(100000, carrotjumping.theJump(init));
    }

    @Test
    public void case14() {
        int init = 705616876;
        assertEquals(100000, carrotjumping.theJump(init));
    }

    @Test
    public void case15() {
        int init = 852808441;
        assertEquals(-1, carrotjumping.theJump(init));
    }

    @Test
    public void case16() {
        int init = 426404220;
        assertEquals(-1, carrotjumping.theJump(init));
    }

    @Test
    public void case17() {
        int init = 713202113;
        assertEquals(-1, carrotjumping.theJump(init));
    }

    @Test
    public void case18() {
        int init = 356601056;
        assertEquals(-1, carrotjumping.theJump(init));
    }

    @Test
    public void case19() {
        int init = 678300531;
        assertEquals(-1, carrotjumping.theJump(init));
    }

    @Test
    public void case20() {
        int init = 339150265;
        assertEquals(-1, carrotjumping.theJump(init));
    }

    @Test
    public void case21() {
        int init = 1000000006;
        assertEquals(-1, carrotjumping.theJump(init));
    }

    @Test
    public void case22() {
        int init = 500000003;
        assertEquals(-1, carrotjumping.theJump(init));
    }

    @Test
    public void case23() {
        int init = 250000001;
        assertEquals(1, carrotjumping.theJump(init));
    }

    @Test
    public void case24() {
        int init = 125000000;
        assertEquals(1, carrotjumping.theJump(init));
    }

    @Test
    public void case25() {
        int init = 562500003;
        assertEquals(2, carrotjumping.theJump(init));
    }

    @Test
    public void case26() {
        int init = 281250001;
        assertEquals(2, carrotjumping.theJump(init));
    }

    @Test
    public void case27() {
        int init = 140625000;
        assertEquals(2, carrotjumping.theJump(init));
    }

    @Test
    public void case28() {
        int init = 570312503;
        assertEquals(3, carrotjumping.theJump(init));
    }

    @Test
    public void case29() {
        int init = 285156251;
        assertEquals(3, carrotjumping.theJump(init));
    }

    @Test
    public void case30() {
        int init = 142578125;
        assertEquals(3, carrotjumping.theJump(init));
    }

    @Test
    public void case31() {
        int init = 71289062;
        assertEquals(4, carrotjumping.theJump(init));
    }

    @Test
    public void case32() {
        int init = 535644534;
        assertEquals(4, carrotjumping.theJump(init));
    }

    @Test
    public void case33() {
        int init = 673399480;
        assertEquals(31975, carrotjumping.theJump(init));
    }

    @Test
    public void case34() {
        int init = 610100046;
        assertEquals(24047, carrotjumping.theJump(init));
    }

    @Test
    public void case35() {
        int init = 315802756;
        assertEquals(86744, carrotjumping.theJump(init));
    }

    @Test
    public void case36() {
        int init = 225937957;
        assertEquals(72060, carrotjumping.theJump(init));
    }

    @Test
    public void case37() {
        int init = 496178545;
        assertEquals(61128, carrotjumping.theJump(init));
    }

    @Test
    public void case38() {
        int init = 453035285;
        assertEquals(32514, carrotjumping.theJump(init));
    }

    @Test
    public void case39() {
        int init = 47858586;
        assertEquals(23997, carrotjumping.theJump(init));
    }

    @Test
    public void case40() {
        int init = 480799171;
        assertEquals(82231, carrotjumping.theJump(init));
    }

    @Test
    public void case41() {
        int init = 828067259;
        assertEquals(62445, carrotjumping.theJump(init));
    }

    @Test
    public void case42() {
        int init = 895255719;
        assertEquals(30132, carrotjumping.theJump(init));
    }

    @Test
    public void case43() {
        int init = 454540134;
        assertEquals(62962, carrotjumping.theJump(init));
    }

    @Test
    public void case44() {
        int init = 900327479;
        assertEquals(91701, carrotjumping.theJump(init));
    }

    @Test
    public void case45() {
        int init = 239594710;
        assertEquals(-1, carrotjumping.theJump(init));
    }

    @Test
    public void case46() {
        int init = 49592320;
        assertEquals(-1, carrotjumping.theJump(init));
    }

    @Test
    public void case47() {
        int init = 686088966;
        assertEquals(-1, carrotjumping.theJump(init));
    }

    @Test
    public void case48() {
        int init = 935467456;
        assertEquals(-1, carrotjumping.theJump(init));
    }

    @Test
    public void case49() {
        int init = 642858708;
        assertEquals(-1, carrotjumping.theJump(init));
    }

    @Test
    public void case50() {
        int init = 129938307;
        assertEquals(-1, carrotjumping.theJump(init));
    }

    @Test
    public void case51() {
        int init = 735946623;
        assertEquals(-1, carrotjumping.theJump(init));
    }

    @Test
    public void case52() {
        int init = 774009307;
        assertEquals(-1, carrotjumping.theJump(init));
    }

    @Test
    public void case53() {
        int init = 830378328;
        assertEquals(-1, carrotjumping.theJump(init));
    }

    @Test
    public void case54() {
        int init = 464244557;
        assertEquals(-1, carrotjumping.theJump(init));
    }

    @Test
    public void case55() {
        int init = 14646281;
        assertEquals(-1, carrotjumping.theJump(init));
    }

    @Test
    public void case56() {
        int init = 20735299;
        assertEquals(-1, carrotjumping.theJump(init));
    }

    @Test
    public void case57() {
        int init = 10000;
        assertEquals(-1, carrotjumping.theJump(init));
    }

    @Test
    public void case58() {
        int init = 1000170;
        assertEquals(6191, carrotjumping.theJump(init));
    }

    @Test
    public void case59() {
        int init = 777;
        assertEquals(-1, carrotjumping.theJump(init));
    }

    @Test
    public void case60() {
        int init = 1;
        assertEquals(-1, carrotjumping.theJump(init));
    }

    @Test
    public void case61() {
        int init = 987654321;
        assertEquals(-1, carrotjumping.theJump(init));
    }

    @Test
    public void case62() {
        int init = 750000006;
        assertEquals(-1, carrotjumping.theJump(init));
    }

    @Test
    public void case63() {
        int init = 2;
        assertEquals(-1, carrotjumping.theJump(init));
    }

    @Test
    public void case64() {
        int init = 1000000004;
        assertEquals(-1, carrotjumping.theJump(init));
    }

    @Test
    public void case65() {
        int init = 251132667;
        assertEquals(479, carrotjumping.theJump(init));
    }

}
