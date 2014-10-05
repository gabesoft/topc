package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class TheSimilarNumbersTest {
    TheSimilarNumbers thesimilarnumbers = new TheSimilarNumbers();

    @Test
    public void case1() {
        int lower = 1;
        int upper = 10;
        assertEquals(1, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case2() {
        int lower = 5;
        int upper = 511;
        assertEquals(3, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case3() {
        int lower = 5;
        int upper = 4747;
        assertEquals(3, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case4() {
        int lower = 1;
        int upper = 1000000;
        assertEquals(6, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case5() {
        int lower = 10;
        int upper = 10110;
        assertEquals(3, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case6() {
        int lower = 1;
        int upper = 1;
        assertEquals(1, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case7() {
        int lower = 1000000;
        int upper = 1000000;
        assertEquals(1, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case8() {
        int lower = 491273;
        int upper = 842398;
        assertEquals(1, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case9() {
        int lower = 849859;
        int upper = 958925;
        assertEquals(1, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case10() {
        int lower = 67803;
        int upper = 771363;
        assertEquals(2, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case11() {
        int lower = 184892;
        int upper = 391907;
        assertEquals(1, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case12() {
        int lower = 75799;
        int upper = 256150;
        assertEquals(1, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case13() {
        int lower = 268944;
        int upper = 342402;
        assertEquals(1, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case14() {
        int lower = 228640;
        int upper = 894352;
        assertEquals(1, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case15() {
        int lower = 903885;
        int upper = 908656;
        assertEquals(1, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case16() {
        int lower = 292588;
        int upper = 414271;
        assertEquals(1, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case17() {
        int lower = 852057;
        int upper = 889141;
        assertEquals(1, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case18() {
        int lower = 73955;
        int upper = 739551;
        assertEquals(2, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case19() {
        int lower = 73955;
        int upper = 739550;
        assertEquals(1, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case20() {
        int lower = 40363;
        int upper = 403631;
        assertEquals(2, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case21() {
        int lower = 40363;
        int upper = 403630;
        assertEquals(1, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case22() {
        int lower = 14367;
        int upper = 143671;
        assertEquals(2, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case23() {
        int lower = 14367;
        int upper = 143670;
        assertEquals(1, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case24() {
        int lower = 844;
        int upper = 84411;
        assertEquals(3, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case25() {
        int lower = 844;
        int upper = 84410;
        assertEquals(2, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case26() {
        int lower = 6646;
        int upper = 664611;
        assertEquals(3, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case27() {
        int lower = 6646;
        int upper = 664610;
        assertEquals(2, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case28() {
        int lower = 937;
        int upper = 93711;
        assertEquals(3, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case29() {
        int lower = 937;
        int upper = 93710;
        assertEquals(2, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case30() {
        int lower = 883;
        int upper = 883111;
        assertEquals(4, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case31() {
        int lower = 883;
        int upper = 883110;
        assertEquals(3, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case32() {
        int lower = 842;
        int upper = 842111;
        assertEquals(4, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case33() {
        int lower = 842;
        int upper = 842110;
        assertEquals(3, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case34() {
        int lower = 314;
        int upper = 314111;
        assertEquals(4, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case35() {
        int lower = 314;
        int upper = 314110;
        assertEquals(3, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case36() {
        int lower = 74;
        int upper = 741111;
        assertEquals(5, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case37() {
        int lower = 74;
        int upper = 741110;
        assertEquals(4, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case38() {
        int lower = 14;
        int upper = 141111;
        assertEquals(5, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case39() {
        int lower = 14;
        int upper = 141110;
        assertEquals(4, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case40() {
        int lower = 53;
        int upper = 531111;
        assertEquals(5, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case41() {
        int lower = 53;
        int upper = 531110;
        assertEquals(4, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case42() {
        int lower = 4;
        int upper = 411111;
        assertEquals(6, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case43() {
        int lower = 4;
        int upper = 411110;
        assertEquals(5, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case44() {
        int lower = 6;
        int upper = 611111;
        assertEquals(6, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case45() {
        int lower = 6;
        int upper = 611110;
        assertEquals(5, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case46() {
        int lower = 2;
        int upper = 211111;
        assertEquals(6, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case47() {
        int lower = 2;
        int upper = 211110;
        assertEquals(5, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case48() {
        int lower = 2;
        int upper = 20;
        assertEquals(1, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case49() {
        int lower = 100000;
        int upper = 100000;
        assertEquals(1, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case50() {
        int lower = 2;
        int upper = 2;
        assertEquals(1, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case51() {
        int lower = 1;
        int upper = 11;
        assertEquals(2, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case52() {
        int lower = 1;
        int upper = 8;
        assertEquals(1, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case53() {
        int lower = 5;
        int upper = 5;
        assertEquals(1, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case54() {
        int lower = 1;
        int upper = 9;
        assertEquals(1, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case55() {
        int lower = 2;
        int upper = 4;
        assertEquals(1, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case56() {
        int lower = 10;
        int upper = 101;
        assertEquals(2, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case57() {
        int lower = 1;
        int upper = 11122;
        assertEquals(5, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case58() {
        int lower = 55;
        int upper = 1000000;
        assertEquals(5, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case59() {
        int lower = 5;
        int upper = 51;
        assertEquals(2, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case60() {
        int lower = 6;
        int upper = 6;
        assertEquals(1, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case61() {
        int lower = 10;
        int upper = 10;
        assertEquals(1, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case62() {
        int lower = 500;
        int upper = 1500;
        assertEquals(1, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case63() {
        int lower = 2;
        int upper = 204;
        assertEquals(2, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case64() {
        int lower = 1;
        int upper = 99999;
        assertEquals(5, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case65() {
        int lower = 3;
        int upper = 11;
        assertEquals(1, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case66() {
        int lower = 10;
        int upper = 11;
        assertEquals(1, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case67() {
        int lower = 6;
        int upper = 7;
        assertEquals(1, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case68() {
        int lower = 5;
        int upper = 510;
        assertEquals(2, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case69() {
        int lower = 1;
        int upper = 111;
        assertEquals(3, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case70() {
        int lower = 5;
        int upper = 500;
        assertEquals(2, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case71() {
        int lower = 10;
        int upper = 100;
        assertEquals(1, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case72() {
        int lower = 6;
        int upper = 611;
        assertEquals(3, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case73() {
        int lower = 1;
        int upper = 110;
        assertEquals(2, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case74() {
        int lower = 4;
        int upper = 411;
        assertEquals(3, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case75() {
        int lower = 5000;
        int upper = 5000;
        assertEquals(1, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case76() {
        int lower = 1;
        int upper = 11111;
        assertEquals(5, thesimilarnumbers.find(lower, upper));
    }

    @Test
    public void case77() {
        int lower = 1;
        int upper = 2;
        assertEquals(1, thesimilarnumbers.find(lower, upper));
    }

}
