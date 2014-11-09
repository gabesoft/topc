package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class PillarsTest {
    double DELTA = 1.0e-09;
    Pillars pillars = new Pillars();

    @Test
    public void case1() {
        int w = 1;
        int x = 1;
        int y = 1;
        assertEquals(1.0, pillars.getExpectedLength(w, x, y), DELTA * 1.0);
    }

    @Test
    public void case2() {
        int w = 1;
        int x = 5;
        int y = 1;
        assertEquals(2.387132965131785, pillars.getExpectedLength(w, x, y), DELTA * 2.387132965131785);
    }

    @Test
    public void case3() {
        int w = 2;
        int x = 3;
        int y = 15;
        assertEquals(6.737191281760445, pillars.getExpectedLength(w, x, y), DELTA * 6.737191281760445);
    }

    @Test
    public void case4() {
        int w = 10;
        int x = 15;
        int y = 23;
        assertEquals(12.988608956320535, pillars.getExpectedLength(w, x, y), DELTA * 12.988608956320535);
    }

    @Test
    public void case5() {
        int w = 1000;
        int x = 100000;
        int y = 100000;
        assertEquals(33381.38304701605, pillars.getExpectedLength(w, x, y), DELTA * 33381.38304701605);
    }

    @Test
    public void case6() {
        int w = 1;
        int x = 99175;
        int y = 56445;
        assertEquals(32073.471757648073, pillars.getExpectedLength(w, x, y), DELTA * 32073.471757648073);
    }

    @Test
    public void case7() {
        int w = 741;
        int x = 98283;
        int y = 97708;
        assertEquals(32694.75809065241, pillars.getExpectedLength(w, x, y), DELTA * 32694.75809065241);
    }

    @Test
    public void case8() {
        int w = 772;
        int x = 97431;
        int y = 92415;
        assertEquals(31758.202091392817, pillars.getExpectedLength(w, x, y), DELTA * 31758.202091392817);
    }

    @Test
    public void case9() {
        int w = 987;
        int x = 98228;
        int y = 96988;
        assertEquals(32589.00970552789, pillars.getExpectedLength(w, x, y), DELTA * 32589.00970552789);
    }

    @Test
    public void case10() {
        int w = 890;
        int x = 92714;
        int y = 96949;
        assertEquals(31712.49684962615, pillars.getExpectedLength(w, x, y), DELTA * 31712.49684962615);
    }

    @Test
    public void case11() {
        int w = 884;
        int x = 99111;
        int y = 94672;
        assertEquals(32402.59188274667, pillars.getExpectedLength(w, x, y), DELTA * 32402.59188274667);
    }

    @Test
    public void case12() {
        int w = 741;
        int x = 98835;
        int y = 90385;
        assertEquals(31806.143660389673, pillars.getExpectedLength(w, x, y), DELTA * 31806.143660389673);
    }

    @Test
    public void case13() {
        int w = 729;
        int x = 92658;
        int y = 92366;
        assertEquals(30866.59996029441, pillars.getExpectedLength(w, x, y), DELTA * 30866.59996029441);
    }

    @Test
    public void case14() {
        int w = 746;
        int x = 98939;
        int y = 97438;
        assertEquals(32765.82263936255, pillars.getExpectedLength(w, x, y), DELTA * 32765.82263936255);
    }

    @Test
    public void case15() {
        int w = 808;
        int x = 93569;
        int y = 91507;
        assertEquals(30895.89432876109, pillars.getExpectedLength(w, x, y), DELTA * 30895.89432876109);
    }

    @Test
    public void case16() {
        int w = 849;
        int x = 90577;
        int y = 92202;
        assertEquals(30511.110044647055, pillars.getExpectedLength(w, x, y), DELTA * 30511.110044647055);
    }

    @Test
    public void case17() {
        int w = 963;
        int x = 98047;
        int y = 96381;
        assertEquals(32459.944104889895, pillars.getExpectedLength(w, x, y), DELTA * 32459.944104889895);
    }

    @Test
    public void case18() {
        int w = 917;
        int x = 92247;
        int y = 95421;
        assertEquals(31356.225216130268, pillars.getExpectedLength(w, x, y), DELTA * 31356.225216130268);
    }

    @Test
    public void case19() {
        int w = 976;
        int x = 99917;
        int y = 90443;
        assertEquals(32072.809658547325, pillars.getExpectedLength(w, x, y), DELTA * 32072.809658547325);
    }

    @Test
    public void case20() {
        int w = 706;
        int x = 97598;
        int y = 97448;
        assertEquals(32533.942518992055, pillars.getExpectedLength(w, x, y), DELTA * 32533.942518992055);
    }

    @Test
    public void case21() {
        int w = 755;
        int x = 93628;
        int y = 99334;
        assertEquals(32299.044059147163, pillars.getExpectedLength(w, x, y), DELTA * 32299.044059147163);
    }

    @Test
    public void case22() {
        int w = 1000;
        int x = 94941;
        int y = 97711;
        assertEquals(32184.135418201913, pillars.getExpectedLength(w, x, y), DELTA * 32184.135418201913);
    }

    @Test
    public void case23() {
        int w = 764;
        int x = 91934;
        int y = 99803;
        assertEquals(32193.015738418748, pillars.getExpectedLength(w, x, y), DELTA * 32193.015738418748);
    }

    @Test
    public void case24() {
        int w = 801;
        int x = 95554;
        int y = 90102;
        assertEquals(31080.165714689017, pillars.getExpectedLength(w, x, y), DELTA * 31080.165714689017);
    }

    @Test
    public void case25() {
        int w = 788;
        int x = 92938;
        int y = 99183;
        assertEquals(32183.11427643082, pillars.getExpectedLength(w, x, y), DELTA * 32183.11427643082);
    }

    @Test
    public void case26() {
        int w = 867;
        int x = 94321;
        int y = 90666;
        assertEquals(30917.68049883712, pillars.getExpectedLength(w, x, y), DELTA * 30917.68049883712);
    }

    @Test
    public void case27() {
        int w = 717;
        int x = 98053;
        int y = 97904;
        assertEquals(32686.415243153057, pillars.getExpectedLength(w, x, y), DELTA * 32686.415243153057);
    }

    @Test
    public void case28() {
        int w = 998;
        int x = 97740;
        int y = 90882;
        assertEquals(31646.771878422198, pillars.getExpectedLength(w, x, y), DELTA * 31646.771878422198);
    }

    @Test
    public void case29() {
        int w = 905;
        int x = 92995;
        int y = 99484;
        assertEquals(32261.73462507481, pillars.getExpectedLength(w, x, y), DELTA * 32261.73462507481);
    }

    @Test
    public void case30() {
        int w = 810;
        int x = 96526;
        int y = 93249;
        assertEquals(31700.36466772312, pillars.getExpectedLength(w, x, y), DELTA * 31700.36466772312);
    }

    @Test
    public void case31() {
        int w = 907;
        int x = 97517;
        int y = 96124;
        assertEquals(32321.451176681683, pillars.getExpectedLength(w, x, y), DELTA * 32321.451176681683);
    }

    @Test
    public void case32() {
        int w = 785;
        int x = 96134;
        int y = 96755;
        assertEquals(32181.491324592185, pillars.getExpectedLength(w, x, y), DELTA * 32181.491324592185);
    }

    @Test
    public void case33() {
        int w = 960;
        int x = 90202;
        int y = 97048;
        assertEquals(31415.623263082023, pillars.getExpectedLength(w, x, y), DELTA * 31415.623263082023);
    }

    @Test
    public void case34() {
        int w = 819;
        int x = 97532;
        int y = 94947;
        assertEquals(32137.140460237355, pillars.getExpectedLength(w, x, y), DELTA * 32137.140460237355);
    }

    @Test
    public void case35() {
        int w = 806;
        int x = 97015;
        int y = 98420;
        assertEquals(32612.35196213513, pillars.getExpectedLength(w, x, y), DELTA * 32612.35196213513);
    }

    @Test
    public void case36() {
        int w = 880;
        int x = 93996;
        int y = 94931;
        assertEquals(31530.840430364417, pillars.getExpectedLength(w, x, y), DELTA * 31530.840430364417);
    }

    @Test
    public void case37() {
        int w = 1;
        int x = 100000;
        int y = 100000;
        assertEquals(33333.33344872877, pillars.getExpectedLength(w, x, y), DELTA * 33333.33344872877);
    }

    @Test
    public void case38() {
        int w = 1000;
        int x = 1;
        int y = 100000;
        assertEquals(50028.496625165004, pillars.getExpectedLength(w, x, y), DELTA * 50028.496625165004);
    }

    @Test
    public void case39() {
        int w = 1;
        int x = 1;
        int y = 100000;
        assertEquals(49999.50006935564, pillars.getExpectedLength(w, x, y), DELTA * 49999.50006935564);
    }

    @Test
    public void case40() {
        int w = 100;
        int x = 100000;
        int y = 100000;
        assertEquals(33334.04348856876, pillars.getExpectedLength(w, x, y), DELTA * 33334.04348856876);
    }

    @Test
    public void case41() {
        int w = 1000;
        int x = 100000;
        int y = 10000;
        assertEquals(45374.871961122386, pillars.getExpectedLength(w, x, y), DELTA * 45374.871961122386);
    }

    @Test
    public void case42() {
        int w = 1000;
        int x = 50000;
        int y = 50000;
        assertEquals(16749.035733819004, pillars.getExpectedLength(w, x, y), DELTA * 16749.035733819004);
    }

    @Test
    public void case43() {
        int w = 10;
        int x = 100000;
        int y = 100000;
        assertEquals(33333.342735219885, pillars.getExpectedLength(w, x, y), DELTA * 33333.342735219885);
    }

    @Test
    public void case44() {
        int w = 44;
        int x = 100000;
        int y = 100000;
        assertEquals(33333.48670500142, pillars.getExpectedLength(w, x, y), DELTA * 33333.48670500142);
    }

    @Test
    public void case45() {
        int w = 1000;
        int x = 99999;
        int y = 99998;
        assertEquals(33380.88362205062, pillars.getExpectedLength(w, x, y), DELTA * 33380.88362205062);
    }

    @Test
    public void case46() {
        int w = 1000;
        int x = 99999;
        int y = 99999;
        assertEquals(33381.05009484778, pillars.getExpectedLength(w, x, y), DELTA * 33381.05009484778);
    }

    @Test
    public void case47() {
        int w = 998;
        int x = 88888;
        int y = 99999;
        assertEquals(31941.31591403921, pillars.getExpectedLength(w, x, y), DELTA * 31941.31591403921);
    }

    @Test
    public void case48() {
        int w = 1000;
        int x = 99999;
        int y = 100000;
        assertEquals(33381.216574215534, pillars.getExpectedLength(w, x, y), DELTA * 33381.216574215534);
    }

    @Test
    public void case49() {
        int w = 1000;
        int x = 90000;
        int y = 90000;
        assertEquals(30052.226096239192, pillars.getExpectedLength(w, x, y), DELTA * 30052.226096239192);
    }

    @Test
    public void case50() {
        int w = 1000;
        int x = 92673;
        int y = 92673;
        assertEquals(30942.03323926141, pillars.getExpectedLength(w, x, y), DELTA * 30942.03323926141);
    }

}
