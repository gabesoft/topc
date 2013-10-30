package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class RotatedClockTest {
    RotatedClock rotatedclock = new RotatedClock();

    @Test
    public void case1() {
        int hourHand = 70;
        int minuteHand = 300;
        assertEquals("08:20", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case2() {
        int hourHand = 90;
        int minuteHand = 120;
        assertEquals("11:00", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case3() {
        int hourHand = 240;
        int minuteHand = 36;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case4() {
        int hourHand = 19;
        int minuteHand = 19;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case5() {
        int hourHand = 1;
        int minuteHand = 12;
        assertEquals("00:02", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case6() {
        int hourHand = 0;
        int minuteHand = 0;
        assertEquals("00:00", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case7() {
        int hourHand = 30;
        int minuteHand = 30;
        assertEquals("00:00", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case8() {
        int hourHand = 330;
        int minuteHand = 330;
        assertEquals("00:00", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case9() {
        int hourHand = 1;
        int minuteHand = 12;
        assertEquals("00:02", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case10() {
        int hourHand = 31;
        int minuteHand = 42;
        assertEquals("00:02", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case11() {
        int hourHand = 331;
        int minuteHand = 342;
        assertEquals("00:02", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case12() {
        int hourHand = 29;
        int minuteHand = 348;
        assertEquals("00:58", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case13() {
        int hourHand = 59;
        int minuteHand = 18;
        assertEquals("00:58", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case14() {
        int hourHand = 359;
        int minuteHand = 318;
        assertEquals("00:58", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case15() {
        int hourHand = 30;
        int minuteHand = 0;
        assertEquals("01:00", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case16() {
        int hourHand = 60;
        int minuteHand = 30;
        assertEquals("01:00", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case17() {
        int hourHand = 0;
        int minuteHand = 330;
        assertEquals("01:00", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case18() {
        int hourHand = 31;
        int minuteHand = 12;
        assertEquals("01:02", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case19() {
        int hourHand = 61;
        int minuteHand = 42;
        assertEquals("01:02", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case20() {
        int hourHand = 1;
        int minuteHand = 342;
        assertEquals("01:02", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case21() {
        int hourHand = 59;
        int minuteHand = 348;
        assertEquals("01:58", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case22() {
        int hourHand = 89;
        int minuteHand = 18;
        assertEquals("01:58", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case23() {
        int hourHand = 29;
        int minuteHand = 318;
        assertEquals("01:58", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case24() {
        int hourHand = 330;
        int minuteHand = 0;
        assertEquals("11:00", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case25() {
        int hourHand = 0;
        int minuteHand = 30;
        assertEquals("11:00", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case26() {
        int hourHand = 300;
        int minuteHand = 330;
        assertEquals("11:00", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case27() {
        int hourHand = 331;
        int minuteHand = 12;
        assertEquals("11:02", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case28() {
        int hourHand = 1;
        int minuteHand = 42;
        assertEquals("11:02", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case29() {
        int hourHand = 301;
        int minuteHand = 342;
        assertEquals("11:02", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case30() {
        int hourHand = 359;
        int minuteHand = 348;
        assertEquals("11:58", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case31() {
        int hourHand = 29;
        int minuteHand = 18;
        assertEquals("11:58", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case32() {
        int hourHand = 329;
        int minuteHand = 318;
        assertEquals("11:58", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case33() {
        int hourHand = 247;
        int minuteHand = 60;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case34() {
        int hourHand = 36;
        int minuteHand = 276;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case35() {
        int hourHand = 356;
        int minuteHand = 6;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case36() {
        int hourHand = 120;
        int minuteHand = 6;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case37() {
        int hourHand = 227;
        int minuteHand = 270;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case38() {
        int hourHand = 341;
        int minuteHand = 306;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case39() {
        int hourHand = 74;
        int minuteHand = 114;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case40() {
        int hourHand = 329;
        int minuteHand = 114;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case41() {
        int hourHand = 174;
        int minuteHand = 132;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case42() {
        int hourHand = 337;
        int minuteHand = 18;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case43() {
        int hourHand = 96;
        int minuteHand = 102;
        assertEquals("02:12", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case44() {
        int hourHand = 257;
        int minuteHand = 155;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case45() {
        int hourHand = 63;
        int minuteHand = 180;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case46() {
        int hourHand = 111;
        int minuteHand = 42;
        assertEquals("10:42", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case47() {
        int hourHand = 144;
        int minuteHand = 20;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case48() {
        int hourHand = 85;
        int minuteHand = 270;
        assertEquals("03:50", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case49() {
        int hourHand = 8;
        int minuteHand = 332;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case50() {
        int hourHand = 138;
        int minuteHand = 42;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case51() {
        int hourHand = 129;
        int minuteHand = 48;
        assertEquals("06:18", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case52() {
        int hourHand = 168;
        int minuteHand = 224;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case53() {
        int hourHand = 292;
        int minuteHand = 138;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case54() {
        int hourHand = 155;
        int minuteHand = 137;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case55() {
        int hourHand = 134;
        int minuteHand = 48;
        assertEquals("08:28", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case56() {
        int hourHand = 154;
        int minuteHand = 198;
        assertEquals("00:08", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case57() {
        int hourHand = 30;
        int minuteHand = 96;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case58() {
        int hourHand = 192;
        int minuteHand = 48;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case59() {
        int hourHand = 296;
        int minuteHand = 102;
        assertEquals("04:52", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case60() {
        int hourHand = 350;
        int minuteHand = 300;
        assertEquals("09:40", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case61() {
        int hourHand = 64;
        int minuteHand = 186;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case62() {
        int hourHand = 271;
        int minuteHand = 342;
        assertEquals("10:02", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case63() {
        int hourHand = 180;
        int minuteHand = 60;
        assertEquals("04:00", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case64() {
        int hourHand = 355;
        int minuteHand = 0;
        assertEquals("09:50", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case65() {
        int hourHand = 245;
        int minuteHand = 150;
        assertEquals("05:10", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case66() {
        int hourHand = 244;
        int minuteHand = 138;
        assertEquals("05:08", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case67() {
        int hourHand = 37;
        int minuteHand = 84;
        assertEquals("01:14", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case68() {
        int hourHand = 130;
        int minuteHand = 30;
        assertEquals("07:20", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case69() {
        int hourHand = 21;
        int minuteHand = 342;
        assertEquals("09:42", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case70() {
        int hourHand = 287;
        int minuteHand = 45;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case71() {
        int hourHand = 33;
        int minuteHand = 48;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case72() {
        int hourHand = 233;
        int minuteHand = 210;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case73() {
        int hourHand = 269;
        int minuteHand = 348;
        assertEquals("08:58", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case74() {
        int hourHand = 51;
        int minuteHand = 258;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case75() {
        int hourHand = 102;
        int minuteHand = 114;
        assertEquals("04:24", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case76() {
        int hourHand = 86;
        int minuteHand = 222;
        assertEquals("05:52", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case77() {
        int hourHand = 348;
        int minuteHand = 186;
        assertEquals("00:36", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case78() {
        int hourHand = 257;
        int minuteHand = 54;
        assertEquals("01:34", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case79() {
        int hourHand = 2;
        int minuteHand = 324;
        assertEquals("02:04", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case80() {
        int hourHand = 319;
        int minuteHand = 176;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case81() {
        int hourHand = 128;
        int minuteHand = 216;
        assertEquals("00:16", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case82() {
        int hourHand = 266;
        int minuteHand = 342;
        assertEquals("07:52", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case83() {
        int hourHand = 69;
        int minuteHand = 73;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case84() {
        int hourHand = 232;
        int minuteHand = 24;
        assertEquals("03:44", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case85() {
        int hourHand = 271;
        int minuteHand = 192;
        assertEquals("03:02", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case86() {
        int hourHand = 150;
        int minuteHand = 150;
        assertEquals("00:00", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case87() {
        int hourHand = 36;
        int minuteHand = 36;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case88() {
        int hourHand = 1;
        int minuteHand = 181;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case89() {
        int hourHand = 340;
        int minuteHand = 120;
        assertEquals("11:20", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case90() {
        int hourHand = 1;
        int minuteHand = 11;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case91() {
        int hourHand = 20;
        int minuteHand = 0;
        assertEquals("08:40", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case92() {
        int hourHand = 58;
        int minuteHand = 6;
        assertEquals("00:56", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case93() {
        int hourHand = 47;
        int minuteHand = 17;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case94() {
        int hourHand = 230;
        int minuteHand = 241;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case95() {
        int hourHand = 148;
        int minuteHand = 96;
        assertEquals("00:56", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case96() {
        int hourHand = 115;
        int minuteHand = 115;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case97() {
        int hourHand = 1;
        int minuteHand = 1;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case98() {
        int hourHand = 79;
        int minuteHand = 336;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case99() {
        int hourHand = 10;
        int minuteHand = 10;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case100() {
        int hourHand = 330;
        int minuteHand = 30;
        assertEquals("10:00", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case101() {
        int hourHand = 0;
        int minuteHand = 1;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case102() {
        int hourHand = 10;
        int minuteHand = 30;
        assertEquals("03:20", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case103() {
        int hourHand = 180;
        int minuteHand = 0;
        assertEquals("06:00", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case104() {
        int hourHand = 2;
        int minuteHand = 13;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case105() {
        int hourHand = 0;
        int minuteHand = 55;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case106() {
        int hourHand = 354;
        int minuteHand = 288;
        assertEquals("11:48", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case107() {
        int hourHand = 6;
        int minuteHand = 72;
        assertEquals("00:12", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case108() {
        int hourHand = 140;
        int minuteHand = 0;
        assertEquals("00:40", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case109() {
        int hourHand = 180;
        int minuteHand = 150;
        assertEquals("01:00", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case110() {
        int hourHand = 3;
        int minuteHand = 6;
        assertEquals("01:06", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case111() {
        int hourHand = 315;
        int minuteHand = 90;
        assertEquals("01:30", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case112() {
        int hourHand = 105;
        int minuteHand = 28;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case113() {
        int hourHand = 1;
        int minuteHand = 10;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case114() {
        int hourHand = 33;
        int minuteHand = 43;
        assertEquals("", rotatedclock.getEarliest(hourHand, minuteHand));
    }

    @Test
    public void case115() {
        int hourHand = 0;
        int minuteHand = 60;
        assertEquals("10:00", rotatedclock.getEarliest(hourHand, minuteHand));
    }

}
