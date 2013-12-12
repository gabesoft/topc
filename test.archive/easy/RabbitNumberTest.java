package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class RabbitNumberTest {
    RabbitNumber rabbitnumber = new RabbitNumber();

    @Test
    public void case1() {
        int low = 22;
        int high = 22;
        assertEquals(1, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case2() {
        int low = 484;
        int high = 484;
        assertEquals(0, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case3() {
        int low = 1;
        int high = 58;
        assertEquals(12, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case4() {
        int low = 58;
        int high = 484;
        assertEquals(24, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case5() {
        int low = 1000000000;
        int high = 1000000000;
        assertEquals(1, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case6() {
        int low = 1;
        int high = 1000000000;
        assertEquals(7116, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case7() {
        int low = 3;
        int high = 9;
        assertEquals(1, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case8() {
        int low = 2;
        int high = 8;
        assertEquals(2, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case9() {
        int low = 38;
        int high = 54;
        assertEquals(0, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case10() {
        int low = 7;
        int high = 16;
        assertEquals(4, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case11() {
        int low = 626;
        int high = 985;
        assertEquals(0, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case12() {
        int low = 647;
        int high = 678;
        assertEquals(0, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case13() {
        int low = 4366;
        int high = 8445;
        assertEquals(0, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case14() {
        int low = 6797;
        int high = 9409;
        assertEquals(0, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case15() {
        int low = 70762;
        int high = 72091;
        assertEquals(0, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case16() {
        int low = 31189;
        int high = 97205;
        assertEquals(0, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case17() {
        int low = 541304;
        int high = 836723;
        assertEquals(0, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case18() {
        int low = 287737;
        int high = 304686;
        assertEquals(16, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case19() {
        int low = 224156;
        int high = 7766061;
        assertEquals(850, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case20() {
        int low = 1794191;
        int high = 2493164;
        assertEquals(254, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case21() {
        int low = 55997858;
        int high = 84272705;
        assertEquals(0, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case22() {
        int low = 6229956;
        int high = 70256053;
        assertEquals(1810, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case23() {
        int low = 528330885;
        int high = 791733587;
        assertEquals(0, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case24() {
        int low = 88453870;
        int high = 552998244;
        assertEquals(3872, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case25() {
        int low = 1;
        int high = 1;
        assertEquals(1, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case26() {
        int low = 200122010;
        int high = 200122010;
        assertEquals(1, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case27() {
        int low = 1211101;
        int high = 1211101;
        assertEquals(1, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case28() {
        int low = 101010021;
        int high = 101010021;
        assertEquals(1, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case29() {
        int low = 21210110;
        int high = 21210110;
        assertEquals(1, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case30() {
        int low = 10002012;
        int high = 10002012;
        assertEquals(1, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case31() {
        int low = 220010001;
        int high = 220010001;
        assertEquals(1, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case32() {
        int low = 2000110;
        int high = 2000110;
        assertEquals(1, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case33() {
        int low = 1113000;
        int high = 1113000;
        assertEquals(1, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case34() {
        int low = 101021101;
        int high = 101021101;
        assertEquals(1, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case35() {
        int low = 111011;
        int high = 111011;
        assertEquals(1, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case36() {
        int low = 1;
        int high = 999999999;
        assertEquals(7115, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case37() {
        int low = 10;
        int high = 999999999;
        assertEquals(7112, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case38() {
        int low = 30010010;
        int high = 1000000000;
        assertEquals(3970, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case39() {
        int low = 3;
        int high = 1000000000;
        assertEquals(7114, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case40() {
        int low = 9;
        int high = 999999993;
        assertEquals(7112, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case41() {
        int low = 2;
        int high = 1000000000;
        assertEquals(7115, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case42() {
        int low = 2;
        int high = 999999999;
        assertEquals(7114, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case43() {
        int low = 1;
        int high = 100000000;
        assertEquals(3244, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case44() {
        int low = 12;
        int high = 10000000;
        assertEquals(1429, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case45() {
        int low = 1;
        int high = 1000000;
        assertEquals(615, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case46() {
        int low = 1;
        int high = 199999999;
        assertEquals(5766, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case47() {
        int low = 4;
        int high = 1000000000;
        assertEquals(7113, rabbitnumber.theCount(low, high));
    }

    @Test
    public void case48() {
        int low = 155;
        int high = 5345;
        assertEquals(75, rabbitnumber.theCount(low, high));
    }

}
