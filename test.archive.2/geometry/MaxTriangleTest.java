package topc.test.geometry;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.geometry.*;

public class MaxTriangleTest {
    double DELTA = 1.0e-09;
    MaxTriangle maxtriangle = new MaxTriangle();

    @Test
    public void case1() {
        int A = 1;
        int B = 1;
        assertEquals(0.5, maxtriangle.calculateArea(A, B), DELTA * 0.5);
    }

    @Test
    public void case2() {
        int A = 3;
        int B = 7;
        assertEquals(-1.0, maxtriangle.calculateArea(A, B), DELTA * -1.0);
    }

    @Test
    public void case3() {
        int A = 41;
        int B = 85;
        assertEquals(29.5, maxtriangle.calculateArea(A, B), DELTA * 29.5);
    }

    @Test
    public void case4() {
        int A = 194;
        int B = 881;
        assertEquals(202.5, maxtriangle.calculateArea(A, B), DELTA * 202.5);
    }

    @Test
    public void case5() {
        int A = 1000000000;
        int B = 1000000000;
        assertEquals(500000000.0, maxtriangle.calculateArea(A, B), DELTA * 500000000.0);
    }

    @Test
    public void case6() {
        int A = 2000000000;
        int B = 2000000000;
        assertEquals(1000000000.0, maxtriangle.calculateArea(A, B), DELTA * 1000000000.0);
    }

    @Test
    public void case7() {
        int A = 2000000000;
        int B = 1;
        assertEquals(22240.0, maxtriangle.calculateArea(A, B), DELTA * 22240.0);
    }

    @Test
    public void case8() {
        int A = 1999967841;
        int B = 1999878400;
        assertEquals(999961560.0, maxtriangle.calculateArea(A, B), DELTA * 999961560.0);
    }

    @Test
    public void case9() {
        int A = 850;
        int B = 925;
        assertEquals(442.5, maxtriangle.calculateArea(A, B), DELTA * 442.5);
    }

    @Test
    public void case10() {
        int A = 925;
        int B = 725;
        assertEquals(408.5, maxtriangle.calculateArea(A, B), DELTA * 408.5);
    }

    @Test
    public void case11() {
        int A = 325;
        int B = 725;
        assertEquals(242.5, maxtriangle.calculateArea(A, B), DELTA * 242.5);
    }

    @Test
    public void case12() {
        int A = 850;
        int B = 650;
        assertEquals(371.0, maxtriangle.calculateArea(A, B), DELTA * 371.0);
    }

    @Test
    public void case13() {
        int A = 845;
        int B = 625;
        assertEquals(362.5, maxtriangle.calculateArea(A, B), DELTA * 362.5);
    }

    @Test
    public void case14() {
        int A = 31525;
        int B = 65000;
        assertEquals(22633.0, maxtriangle.calculateArea(A, B), DELTA * 22633.0);
    }

    @Test
    public void case15() {
        int A = 53300;
        int B = 34225;
        assertEquals(21355.0, maxtriangle.calculateArea(A, B), DELTA * 21355.0);
    }

    @Test
    public void case16() {
        int A = 93425;
        int B = 95485;
        assertEquals(47222.5, maxtriangle.calculateArea(A, B), DELTA * 47222.5);
    }

    @Test
    public void case17() {
        int A = 81925;
        int B = 90625;
        assertEquals(43079.0, maxtriangle.calculateArea(A, B), DELTA * 43079.0);
    }

    @Test
    public void case18() {
        int A = 91250;
        int B = 75205;
        assertEquals(41417.5, maxtriangle.calculateArea(A, B), DELTA * 41417.5);
    }

    @Test
    public void case19() {
        int A = 32045;
        int B = 21025;
        assertEquals(12977.5, maxtriangle.calculateArea(A, B), DELTA * 12977.5);
    }

    @Test
    public void case20() {
        int A = 68125;
        int B = 90610;
        assertEquals(39283.5, maxtriangle.calculateArea(A, B), DELTA * 39283.5);
    }

    @Test
    public void case21() {
        int A = 93425;
        int B = 18125;
        assertEquals(20575.0, maxtriangle.calculateArea(A, B), DELTA * 20575.0);
    }

    @Test
    public void case22() {
        int A = 53650;
        int B = 38425;
        assertEquals(22692.5, maxtriangle.calculateArea(A, B), DELTA * 22692.5);
    }

    @Test
    public void case23() {
        int A = 99025;
        int B = 15725;
        assertEquals(19705.0, maxtriangle.calculateArea(A, B), DELTA * 19705.0);
    }

    @Test
    public void case24() {
        int A = 86125;
        int B = 68125;
        assertEquals(38250.0, maxtriangle.calculateArea(A, B), DELTA * 38250.0);
    }

    @Test
    public void case25() {
        int A = 16900;
        int B = 75725;
        assertEquals(17875.0, maxtriangle.calculateArea(A, B), DELTA * 17875.0);
    }

    @Test
    public void case26() {
        int A = 91225;
        int B = 10625;
        assertEquals(15566.5, maxtriangle.calculateArea(A, B), DELTA * 15566.5);
    }

    @Test
    public void case27() {
        int A = 84500;
        int B = 70850;
        assertEquals(38675.0, maxtriangle.calculateArea(A, B), DELTA * 38675.0);
    }

    @Test
    public void case28() {
        int A = 45305;
        int B = 65000;
        assertEquals(27133.0, maxtriangle.calculateArea(A, B), DELTA * 27133.0);
    }

    @Test
    public void case29() {
        int A = 89050;
        int B = 75205;
        assertEquals(40917.5, maxtriangle.calculateArea(A, B), DELTA * 40917.5);
    }

    @Test
    public void case30() {
        int A = 79300;
        int B = 92500;
        assertEquals(42820.0, maxtriangle.calculateArea(A, B), DELTA * 42820.0);
    }

    @Test
    public void case31() {
        int A = 31525;
        int B = 22100;
        assertEquals(13196.0, maxtriangle.calculateArea(A, B), DELTA * 13196.0);
    }

    @Test
    public void case32() {
        int A = 94250;
        int B = 28900;
        assertEquals(26095.0, maxtriangle.calculateArea(A, B), DELTA * 26095.0);
    }

    @Test
    public void case33() {
        int A = 65000;
        int B = 56425;
        assertEquals(30275.0, maxtriangle.calculateArea(A, B), DELTA * 30275.0);
    }

    @Test
    public void case34() {
        int A = 1988995850;
        int B = 1987587738;
        assertEquals(992895591.0, maxtriangle.calculateArea(A, B), DELTA * 992895591.0);
    }

    @Test
    public void case35() {
        int A = 1997433828;
        int B = 1984338325;
        assertEquals(988315917.0, maxtriangle.calculateArea(A, B), DELTA * 988315917.0);
    }

    @Test
    public void case36() {
        int A = 1994939060;
        int B = 1985077097;
        assertEquals(994537511.0, maxtriangle.calculateArea(A, B), DELTA * 994537511.0);
    }

    @Test
    public void case37() {
        int A = 1999185781;
        int B = 1995219252;
        assertEquals(954664047.0, maxtriangle.calculateArea(A, B), DELTA * 954664047.0);
    }

    @Test
    public void case38() {
        int A = 1990368553;
        int B = 1998422397;
        assertEquals(955910935.5, maxtriangle.calculateArea(A, B), DELTA * 955910935.5);
    }

    @Test
    public void case39() {
        int A = 1999999170;
        int B = 1999999170;
        assertEquals(999999585.0, maxtriangle.calculateArea(A, B), DELTA * 999999585.0);
    }

    @Test
    public void case40() {
        int A = 1999999170;
        int B = 1999999625;
        assertEquals(999999682.5, maxtriangle.calculateArea(A, B), DELTA * 999999682.5);
    }

    @Test
    public void case41() {
        int A = 1215306625;
        int B = 1215306625;
        assertEquals(607653312.5, maxtriangle.calculateArea(A, B), DELTA * 607653312.5);
    }

    @Test
    public void case42() {
        int A = 1215309770;
        int B = 1215306625;
        assertEquals(607654089.5, maxtriangle.calculateArea(A, B), DELTA * 607654089.5);
    }

    @Test
    public void case43() {
        int A = 1215300970;
        int B = 1215302800;
        assertEquals(607648058.0, maxtriangle.calculateArea(A, B), DELTA * 607648058.0);
    }

    @Test
    public void case44() {
        int A = 1215301825;
        int B = 1215306625;
        assertEquals(607651930.0, maxtriangle.calculateArea(A, B), DELTA * 607651930.0);
    }

    @Test
    public void case45() {
        int A = 1999999656;
        int B = 1215307490;
        assertEquals(779517726.0, maxtriangle.calculateArea(A, B), DELTA * 779517726.0);
    }

    @Test
    public void case46() {
        int A = 1215309770;
        int B = 8450;
        assertEquals(1602193.0, maxtriangle.calculateArea(A, B), DELTA * 1602193.0);
    }

    @Test
    public void case47() {
        int A = 1215304456;
        int B = 4802;
        assertEquals(1199422.0, maxtriangle.calculateArea(A, B), DELTA * 1199422.0);
    }

    @Test
    public void case48() {
        int A = 1568;
        int B = 1999999880;
        assertEquals(880824.0, maxtriangle.calculateArea(A, B), DELTA * 880824.0);
    }

    @Test
    public void case49() {
        int A = 1215304200;
        int B = 9516;
        assertEquals(-1.0, maxtriangle.calculateArea(A, B), DELTA * -1.0);
    }

    @Test
    public void case50() {
        int A = 1215303505;
        int B = 1215306625;
        assertEquals(607651947.5, maxtriangle.calculateArea(A, B), DELTA * 607651947.5);
    }

    @Test
    public void case51() {
        int A = 1215304658;
        int B = 8125;
        assertEquals(1570277.5, maxtriangle.calculateArea(A, B), DELTA * 1570277.5);
    }

    @Test
    public void case52() {
        int A = 1215303505;
        int B = 7225;
        assertEquals(1481473.5, maxtriangle.calculateArea(A, B), DELTA * 1481473.5);
    }

    @Test
    public void case53() {
        int A = 7225;
        int B = 1215303505;
        assertEquals(1481473.5, maxtriangle.calculateArea(A, B), DELTA * 1481473.5);
    }

    @Test
    public void case54() {
        int A = 8125;
        int B = 1215304025;
        assertEquals(1567525.0, maxtriangle.calculateArea(A, B), DELTA * 1567525.0);
    }

    @Test
    public void case55() {
        int A = 1215303197;
        int B = 1215302800;
        assertEquals(607544980.0, maxtriangle.calculateArea(A, B), DELTA * 607544980.0);
    }

    @Test
    public void case56() {
        int A = 1;
        int B = 2;
        assertEquals(0.5, maxtriangle.calculateArea(A, B), DELTA * 0.5);
    }

    @Test
    public void case57() {
        int A = 3;
        int B = 4;
        assertEquals(-1.0, maxtriangle.calculateArea(A, B), DELTA * -1.0);
    }

    @Test
    public void case58() {
        int A = 4;
        int B = 4;
        assertEquals(2.0, maxtriangle.calculateArea(A, B), DELTA * 2.0);
    }

    @Test
    public void case59() {
        int A = 6;
        int B = 6;
        assertEquals(-1.0, maxtriangle.calculateArea(A, B), DELTA * -1.0);
    }

    @Test
    public void case60() {
        int A = 1;
        int B = 2000000000;
        assertEquals(22240.0, maxtriangle.calculateArea(A, B), DELTA * 22240.0);
    }

    @Test
    public void case61() {
        int A = 987654321;
        int B = 123456789;
        assertEquals(-1.0, maxtriangle.calculateArea(A, B), DELTA * -1.0);
    }

    @Test
    public void case62() {
        int A = 999999999;
        int B = 1;
        assertEquals(-1.0, maxtriangle.calculateArea(A, B), DELTA * -1.0);
    }

    @Test
    public void case63() {
        int A = 1999999997;
        int B = 1;
        assertEquals(22349.5, maxtriangle.calculateArea(A, B), DELTA * 22349.5);
    }

    @Test
    public void case64() {
        int A = 1999967841;
        int B = 1948604449;
        assertEquals(987059551.5, maxtriangle.calculateArea(A, B), DELTA * 987059551.5);
    }

    @Test
    public void case65() {
        int A = 831910120;
        int B = 1271435329;
        assertEquals(513408051.0, maxtriangle.calculateArea(A, B), DELTA * 513408051.0);
    }

    @Test
    public void case66() {
        int A = 2;
        int B = 2;
        assertEquals(1.0, maxtriangle.calculateArea(A, B), DELTA * 1.0);
    }

    @Test
    public void case67() {
        int A = 1999967841;
        int B = 1999967841;
        assertEquals(999983920.5, maxtriangle.calculateArea(A, B), DELTA * 999983920.5);
    }

    @Test
    public void case68() {
        int A = 199999;
        int B = 2000000000;
        assertEquals(-1.0, maxtriangle.calculateArea(A, B), DELTA * -1.0);
    }

    @Test
    public void case69() {
        int A = 8;
        int B = 4;
        assertEquals(2.0, maxtriangle.calculateArea(A, B), DELTA * 2.0);
    }

    @Test
    public void case70() {
        int A = 999939200;
        int B = 999939200;
        assertEquals(499969600.0, maxtriangle.calculateArea(A, B), DELTA * 499969600.0);
    }

    @Test
    public void case71() {
        int A = 2;
        int B = 1;
        assertEquals(0.5, maxtriangle.calculateArea(A, B), DELTA * 0.5);
    }

    @Test
    public void case72() {
        int A = 169;
        int B = 180;
        assertEquals(87.0, maxtriangle.calculateArea(A, B), DELTA * 87.0);
    }

    @Test
    public void case73() {
        int A = 9945;
        int B = 9425;
        assertEquals(4836.0, maxtriangle.calculateArea(A, B), DELTA * 4836.0);
    }

    @Test
    public void case74() {
        int A = 2;
        int B = 1000000000;
        assertEquals(22240.0, maxtriangle.calculateArea(A, B), DELTA * 22240.0);
    }

    @Test
    public void case75() {
        int A = 100000000;
        int B = 500000000;
        assertEquals(111759488.0, maxtriangle.calculateArea(A, B), DELTA * 111759488.0);
    }

    @Test
    public void case76() {
        int A = 100000000;
        int B = 1441557;
        assertEquals(6003000.0, maxtriangle.calculateArea(A, B), DELTA * 6003000.0);
    }

    @Test
    public void case77() {
        int A = 1;
        int B = 13;
        assertEquals(1.5, maxtriangle.calculateArea(A, B), DELTA * 1.5);
    }

    @Test
    public void case78() {
        int A = 61;
        int B = 442;
        assertEquals(79.5, maxtriangle.calculateArea(A, B), DELTA * 79.5);
    }

    @Test
    public void case79() {
        int A = 1172488941;
        int B = 1172401781;
        assertEquals(586222680.0, maxtriangle.calculateArea(A, B), DELTA * 586222680.0);
    }

    @Test
    public void case80() {
        int A = 1951000578;
        int B = 1951000578;
        assertEquals(975500289.0, maxtriangle.calculateArea(A, B), DELTA * 975500289.0);
    }

    @Test
    public void case81() {
        int A = 8;
        int B = 8;
        assertEquals(4.0, maxtriangle.calculateArea(A, B), DELTA * 4.0);
    }

    @Test
    public void case82() {
        int A = 2000000000;
        int B = 1999967842;
        assertEquals(994597360.0, maxtriangle.calculateArea(A, B), DELTA * 994597360.0);
    }

    @Test
    public void case83() {
        int A = 112805732;
        int B = 1120048829;
        assertEquals(177564679.0, maxtriangle.calculateArea(A, B), DELTA * 177564679.0);
    }

    @Test
    public void case84() {
        int A = 1;
        int B = 32;
        assertEquals(2.0, maxtriangle.calculateArea(A, B), DELTA * 2.0);
    }

    @Test
    public void case85() {
        int A = 1825030001;
        int B = 1600000001;
        assertEquals(812091975.5, maxtriangle.calculateArea(A, B), DELTA * 812091975.5);
    }

    @Test
    public void case86() {
        int A = 1;
        int B = 9441;
        assertEquals(48.0, maxtriangle.calculateArea(A, B), DELTA * 48.0);
    }

    @Test
    public void case87() {
        int A = 169;
        int B = 144;
        assertEquals(78.0, maxtriangle.calculateArea(A, B), DELTA * 78.0);
    }

    @Test
    public void case88() {
        int A = 1;
        int B = 72;
        assertEquals(3.0, maxtriangle.calculateArea(A, B), DELTA * 3.0);
    }

    @Test
    public void case89() {
        int A = 1999569325;
        int B = 1999569325;
        assertEquals(999784662.5, maxtriangle.calculateArea(A, B), DELTA * 999784662.5);
    }

    @Test
    public void case90() {
        int A = 1349232625;
        int B = 73652228;
        assertEquals(157615655.0, maxtriangle.calculateArea(A, B), DELTA * 157615655.0);
    }

    @Test
    public void case91() {
        int A = 5;
        int B = 25;
        assertEquals(5.5, maxtriangle.calculateArea(A, B), DELTA * 5.5);
    }

    @Test
    public void case92() {
        int A = 800000000;
        int B = 400000000;
        assertEquals(282227200.0, maxtriangle.calculateArea(A, B), DELTA * 282227200.0);
    }

    @Test
    public void case93() {
        int A = 1999999940;
        int B = 1277997957;
        assertEquals(798469914.0, maxtriangle.calculateArea(A, B), DELTA * 798469914.0);
    }

    @Test
    public void case94() {
        int A = 25;
        int B = 31;
        assertEquals(-1.0, maxtriangle.calculateArea(A, B), DELTA * -1.0);
    }

    @Test
    public void case95() {
        int A = 2;
        int B = 2000000000;
        assertEquals(31600.0, maxtriangle.calculateArea(A, B), DELTA * 31600.0);
    }

    @Test
    public void case96() {
        int A = 1;
        int B = 1172488941;
        assertEquals(17089.5, maxtriangle.calculateArea(A, B), DELTA * 17089.5);
    }

    @Test
    public void case97() {
        int A = 101203012;
        int B = 186538500;
        assertEquals(68636946.0, maxtriangle.calculateArea(A, B), DELTA * 68636946.0);
    }

}
