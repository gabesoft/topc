package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class TheBoredomDivOneTest {
    double DELTA = 1.0e-09;
    TheBoredomDivOne theboredomdivone = new TheBoredomDivOne();

    @Test
    public void case1() {
        int n = 1;
        int m = 1;
        assertEquals(1.0, theboredomdivone.find(n, m), DELTA * 1.0);
    }

    @Test
    public void case2() {
        int n = 2;
        int m = 1;
        assertEquals(1.5, theboredomdivone.find(n, m), DELTA * 1.5);
    }

    @Test
    public void case3() {
        int n = 1;
        int m = 2;
        assertEquals(2.0, theboredomdivone.find(n, m), DELTA * 2.0);
    }

    @Test
    public void case4() {
        int n = 4;
        int m = 7;
        assertEquals(13.831068977298521, theboredomdivone.find(n, m), DELTA * 13.831068977298521);
    }

    @Test
    public void case5() {
        int n = 1;
        int m = 3;
        assertEquals(3.4, theboredomdivone.find(n, m), DELTA * 3.4);
    }

    @Test
    public void case6() {
        int n = 5;
        int m = 7;
        assertEquals(15.130274214949138, theboredomdivone.find(n, m), DELTA * 15.130274214949138);
    }

    @Test
    public void case7() {
        int n = 5;
        int m = 7;
        assertEquals(15.130274214949138, theboredomdivone.find(n, m), DELTA * 15.130274214949138);
    }

    @Test
    public void case8() {
        int n = 25;
        int m = 42;
        assertEquals(144.10605121277968, theboredomdivone.find(n, m), DELTA * 144.10605121277968);
    }

    @Test
    public void case9() {
        int n = 7;
        int m = 19;
        assertEquals(45.46619363103156, theboredomdivone.find(n, m), DELTA * 45.46619363103156);
    }

    @Test
    public void case10() {
        int n = 40;
        int m = 45;
        assertEquals(185.93004772631068, theboredomdivone.find(n, m), DELTA * 185.93004772631068);
    }

    @Test
    public void case11() {
        int n = 17;
        int m = 32;
        assertEquals(98.65802187986704, theboredomdivone.find(n, m), DELTA * 98.65802187986704);
    }

    @Test
    public void case12() {
        int n = 43;
        int m = 37;
        assertEquals(167.2564362404144, theboredomdivone.find(n, m), DELTA * 167.2564362404144);
    }

    @Test
    public void case13() {
        int n = 38;
        int m = 13;
        assertEquals(80.5404811915203, theboredomdivone.find(n, m), DELTA * 80.5404811915203);
    }

    @Test
    public void case14() {
        int n = 23;
        int m = 29;
        assertEquals(102.2529460584118, theboredomdivone.find(n, m), DELTA * 102.2529460584118);
    }

    @Test
    public void case15() {
        int n = 22;
        int m = 35;
        assertEquals(117.38738121338442, theboredomdivone.find(n, m), DELTA * 117.38738121338442);
    }

    @Test
    public void case16() {
        int n = 18;
        int m = 36;
        assertEquals(111.90968303530524, theboredomdivone.find(n, m), DELTA * 111.90968303530524);
    }

    @Test
    public void case17() {
        int n = 37;
        int m = 35;
        assertEquals(148.49017388645055, theboredomdivone.find(n, m), DELTA * 148.49017388645055);
    }

    @Test
    public void case18() {
        int n = 18;
        int m = 32;
        assertEquals(100.68748185421157, theboredomdivone.find(n, m), DELTA * 100.68748185421157);
    }

    @Test
    public void case19() {
        int n = 12;
        int m = 22;
        assertEquals(62.05729455821641, theboredomdivone.find(n, m), DELTA * 62.05729455821641);
    }

    @Test
    public void case20() {
        int n = 37;
        int m = 21;
        assertEquals(105.04611916550033, theboredomdivone.find(n, m), DELTA * 105.04611916550033);
    }

    @Test
    public void case21() {
        int n = 1;
        int m = 42;
        assertEquals(92.18052432506396, theboredomdivone.find(n, m), DELTA * 92.18052432506396);
    }

    @Test
    public void case22() {
        int n = 1;
        int m = 19;
        assertEquals(34.81755537072986, theboredomdivone.find(n, m), DELTA * 34.81755537072986);
    }

    @Test
    public void case23() {
        int n = 1;
        int m = 45;
        assertEquals(100.22296540591749, theboredomdivone.find(n, m), DELTA * 100.22296540591749);
    }

    @Test
    public void case24() {
        int n = 1;
        int m = 32;
        assertEquals(66.1848781573403, theboredomdivone.find(n, m), DELTA * 66.1848781573403);
    }

    @Test
    public void case25() {
        int n = 1;
        int m = 37;
        assertEquals(79.01569196479905, theboredomdivone.find(n, m), DELTA * 79.01569196479905);
    }

    @Test
    public void case26() {
        int n = 1;
        int m = 13;
        assertEquals(21.68611425271092, theboredomdivone.find(n, m), DELTA * 21.68611425271092);
    }

    @Test
    public void case27() {
        int n = 1;
        int m = 29;
        assertEquals(58.66753502733225, theboredomdivone.find(n, m), DELTA * 58.66753502733225);
    }

    @Test
    public void case28() {
        int n = 1;
        int m = 35;
        assertEquals(73.84071925118994, theboredomdivone.find(n, m), DELTA * 73.84071925118994);
    }

    @Test
    public void case29() {
        int n = 1;
        int m = 36;
        assertEquals(76.42136199277984, theboredomdivone.find(n, m), DELTA * 76.42136199277984);
    }

    @Test
    public void case30() {
        int n = 1;
        int m = 35;
        assertEquals(73.84071925118994, theboredomdivone.find(n, m), DELTA * 73.84071925118994);
    }

    @Test
    public void case31() {
        int n = 25;
        int m = 1;
        assertEquals(13.0, theboredomdivone.find(n, m), DELTA * 13.0);
    }

    @Test
    public void case32() {
        int n = 7;
        int m = 1;
        assertEquals(4.0, theboredomdivone.find(n, m), DELTA * 4.0);
    }

    @Test
    public void case33() {
        int n = 40;
        int m = 1;
        assertEquals(20.5, theboredomdivone.find(n, m), DELTA * 20.5);
    }

    @Test
    public void case34() {
        int n = 17;
        int m = 1;
        assertEquals(9.0, theboredomdivone.find(n, m), DELTA * 9.0);
    }

    @Test
    public void case35() {
        int n = 43;
        int m = 1;
        assertEquals(22.0, theboredomdivone.find(n, m), DELTA * 22.0);
    }

    @Test
    public void case36() {
        int n = 38;
        int m = 1;
        assertEquals(19.5, theboredomdivone.find(n, m), DELTA * 19.5);
    }

    @Test
    public void case37() {
        int n = 23;
        int m = 1;
        assertEquals(12.0, theboredomdivone.find(n, m), DELTA * 12.0);
    }

    @Test
    public void case38() {
        int n = 22;
        int m = 1;
        assertEquals(11.5, theboredomdivone.find(n, m), DELTA * 11.5);
    }

    @Test
    public void case39() {
        int n = 18;
        int m = 1;
        assertEquals(9.5, theboredomdivone.find(n, m), DELTA * 9.5);
    }

    @Test
    public void case40() {
        int n = 37;
        int m = 1;
        assertEquals(19.0, theboredomdivone.find(n, m), DELTA * 19.0);
    }

    @Test
    public void case41() {
        int n = 47;
        int m = 47;
        assertEquals(207.71886934498465, theboredomdivone.find(n, m), DELTA * 207.71886934498465);
    }

    @Test
    public void case42() {
        int n = 1;
        int m = 47;
        assertEquals(105.63993468806005, theboredomdivone.find(n, m), DELTA * 105.63993468806005);
    }

    @Test
    public void case43() {
        int n = 47;
        int m = 1;
        assertEquals(24.0, theboredomdivone.find(n, m), DELTA * 24.0);
    }

    @Test
    public void case44() {
        int n = 25;
        int m = 25;
        assertEquals(94.68530313377337, theboredomdivone.find(n, m), DELTA * 94.68530313377337);
    }

    @Test
    public void case45() {
        int n = 7;
        int m = 7;
        assertEquals(17.727435221783047, theboredomdivone.find(n, m), DELTA * 17.727435221783047);
    }

    @Test
    public void case46() {
        int n = 40;
        int m = 40;
        assertEquals(170.3153486399425, theboredomdivone.find(n, m), DELTA * 170.3153486399425);
    }

    @Test
    public void case47() {
        int n = 17;
        int m = 17;
        assertEquals(57.849614911338, theboredomdivone.find(n, m), DELTA * 57.849614911338);
    }

    @Test
    public void case48() {
        int n = 45;
        int m = 47;
        assertEquals(203.28077550191213, theboredomdivone.find(n, m), DELTA * 203.28077550191213);
    }

    @Test
    public void case49() {
        int n = 37;
        int m = 43;
        assertEquals(173.1555956596007, theboredomdivone.find(n, m), DELTA * 173.1555956596007);
    }

    @Test
    public void case50() {
        int n = 46;
        int m = 46;
        assertEquals(202.30740031298058, theboredomdivone.find(n, m), DELTA * 202.30740031298058);
    }

    @Test
    public void case51() {
        int n = 45;
        int m = 43;
        assertEquals(190.55621720432092, theboredomdivone.find(n, m), DELTA * 190.55621720432092);
    }

    @Test
    public void case52() {
        int n = 36;
        int m = 18;
        assertEquals(93.73595311541357, theboredomdivone.find(n, m), DELTA * 93.73595311541357);
    }

    @Test
    public void case53() {
        int n = 46;
        int m = 47;
        assertEquals(205.49982312701206, theboredomdivone.find(n, m), DELTA * 205.49982312701206);
    }

    @Test
    public void case54() {
        int n = 47;
        int m = 46;
        assertEquals(204.515809325977, theboredomdivone.find(n, m), DELTA * 204.515809325977);
    }

}
