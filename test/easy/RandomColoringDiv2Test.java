package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class RandomColoringDiv2Test {
    RandomColoringDiv2 randomcoloringdiv2 = new RandomColoringDiv2();

    @Test
    public void case1() {
        int maxR = 5;
        int maxG = 1;
        int maxB = 1;
        int startR = 2;
        int startG = 0;
        int startB = 0;
        int d1 = 0;
        int d2 = 1;
        assertEquals(3, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case2() {
        int maxR = 4;
        int maxG = 2;
        int maxB = 2;
        int startR = 0;
        int startG = 0;
        int startB = 0;
        int d1 = 3;
        int d2 = 3;
        assertEquals(4, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case3() {
        int maxR = 4;
        int maxG = 2;
        int maxB = 2;
        int startR = 0;
        int startG = 0;
        int startB = 0;
        int d1 = 5;
        int d2 = 5;
        assertEquals(0, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case4() {
        int maxR = 6;
        int maxG = 9;
        int maxB = 10;
        int startR = 1;
        int startG = 2;
        int startB = 3;
        int d1 = 0;
        int d2 = 10;
        assertEquals(540, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case5() {
        int maxR = 6;
        int maxG = 9;
        int maxB = 10;
        int startR = 1;
        int startG = 2;
        int startB = 3;
        int d1 = 4;
        int d2 = 10;
        assertEquals(330, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case6() {
        int maxR = 100;
        int maxG = 100;
        int maxB = 100;
        int startR = 0;
        int startG = 0;
        int startB = 0;
        int d1 = 0;
        int d2 = 100;
        assertEquals(1000000, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case7() {
        int maxR = 100;
        int maxG = 100;
        int maxB = 100;
        int startR = 99;
        int startG = 0;
        int startB = 0;
        int d1 = 1;
        int d2 = 100;
        assertEquals(999999, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case8() {
        int maxR = 100;
        int maxG = 100;
        int maxB = 100;
        int startR = 0;
        int startG = 99;
        int startB = 0;
        int d1 = 2;
        int d2 = 100;
        assertEquals(999992, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case9() {
        int maxR = 100;
        int maxG = 100;
        int maxB = 100;
        int startR = 0;
        int startG = 0;
        int startB = 99;
        int d1 = 3;
        int d2 = 40;
        assertEquals(68894, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case10() {
        int maxR = 100;
        int maxG = 100;
        int maxB = 100;
        int startR = 99;
        int startG = 0;
        int startB = 99;
        int d1 = 9;
        int d2 = 30;
        assertEquals(29062, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case11() {
        int maxR = 100;
        int maxG = 100;
        int maxB = 100;
        int startR = 99;
        int startG = 99;
        int startB = 99;
        int d1 = 10;
        int d2 = 10;
        assertEquals(331, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case12() {
        int maxR = 100;
        int maxG = 100;
        int maxB = 100;
        int startR = 99;
        int startG = 99;
        int startB = 99;
        int d1 = 20;
        int d2 = 21;
        assertEquals(2648, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case13() {
        int maxR = 100;
        int maxG = 100;
        int maxB = 100;
        int startR = 3;
        int startG = 4;
        int startB = 5;
        int d1 = 0;
        int d2 = 100;
        assertEquals(1000000, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case14() {
        int maxR = 100;
        int maxG = 100;
        int maxB = 100;
        int startR = 2;
        int startG = 6;
        int startB = 4;
        int d1 = 1;
        int d2 = 100;
        assertEquals(999999, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case15() {
        int maxR = 100;
        int maxG = 100;
        int maxB = 100;
        int startR = 89;
        int startG = 3;
        int startB = 99;
        int d1 = 2;
        int d2 = 100;
        assertEquals(999982, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case16() {
        int maxR = 100;
        int maxG = 100;
        int maxB = 100;
        int startR = 95;
        int startG = 90;
        int startB = 7;
        int d1 = 3;
        int d2 = 40;
        assertEquals(107875, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case17() {
        int maxR = 100;
        int maxG = 100;
        int maxB = 100;
        int startR = 3;
        int startG = 1;
        int startB = 84;
        int d1 = 10;
        int d2 = 10;
        assertEquals(811, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case18() {
        int maxR = 100;
        int maxG = 100;
        int maxB = 100;
        int startR = 3;
        int startG = 1;
        int startB = 84;
        int d1 = 20;
        int d2 = 20;
        assertEquals(2103, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case19() {
        int maxR = 100;
        int maxG = 100;
        int maxB = 100;
        int startR = 91;
        int startG = 5;
        int startB = 94;
        int d1 = 9;
        int d2 = 30;
        assertEquals(47212, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case20() {
        int maxR = 100;
        int maxG = 100;
        int maxB = 100;
        int startR = 50;
        int startG = 50;
        int startB = 50;
        int d1 = 0;
        int d2 = 100;
        assertEquals(1000000, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case21() {
        int maxR = 100;
        int maxG = 100;
        int maxB = 100;
        int startR = 49;
        int startG = 50;
        int startB = 50;
        int d1 = 1;
        int d2 = 100;
        assertEquals(999999, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case22() {
        int maxR = 100;
        int maxG = 100;
        int maxB = 100;
        int startR = 50;
        int startG = 49;
        int startB = 50;
        int d1 = 2;
        int d2 = 100;
        assertEquals(999973, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case23() {
        int maxR = 100;
        int maxG = 100;
        int maxB = 100;
        int startR = 50;
        int startG = 50;
        int startB = 49;
        int d1 = 3;
        int d2 = 40;
        assertEquals(531316, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case24() {
        int maxR = 100;
        int maxG = 100;
        int maxB = 100;
        int startR = 49;
        int startG = 49;
        int startB = 49;
        int d1 = 10;
        int d2 = 10;
        assertEquals(2402, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case25() {
        int maxR = 100;
        int maxG = 100;
        int maxB = 100;
        int startR = 49;
        int startG = 49;
        int startB = 49;
        int d1 = 20;
        int d2 = 20;
        assertEquals(9602, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case26() {
        int maxR = 100;
        int maxG = 100;
        int maxB = 100;
        int startR = 49;
        int startG = 50;
        int startB = 49;
        int d1 = 9;
        int d2 = 30;
        assertEquals(222068, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case27() {
        int maxR = 100;
        int maxG = 100;
        int maxB = 100;
        int startR = 88;
        int startG = 36;
        int startB = 70;
        int d1 = 0;
        int d2 = 0;
        assertEquals(1, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case28() {
        int maxR = 100;
        int maxG = 100;
        int maxB = 100;
        int startR = 34;
        int startG = 7;
        int startB = 49;
        int d1 = 1;
        int d2 = 1;
        assertEquals(26, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case29() {
        int maxR = 100;
        int maxG = 100;
        int maxB = 100;
        int startR = 75;
        int startG = 91;
        int startB = 43;
        int d1 = 0;
        int d2 = 1;
        assertEquals(27, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case30() {
        int maxR = 1;
        int maxG = 1;
        int maxB = 1;
        int startR = 0;
        int startG = 0;
        int startB = 0;
        int d1 = 0;
        int d2 = 0;
        assertEquals(1, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case31() {
        int maxR = 1;
        int maxG = 1;
        int maxB = 1;
        int startR = 0;
        int startG = 0;
        int startB = 0;
        int d1 = 0;
        int d2 = 100;
        assertEquals(1, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case32() {
        int maxR = 19;
        int maxG = 20;
        int maxB = 20;
        int startR = 16;
        int startG = 5;
        int startB = 11;
        int d1 = 10;
        int d2 = 11;
        assertEquals(1520, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case33() {
        int maxR = 18;
        int maxG = 15;
        int maxB = 10;
        int startR = 2;
        int startG = 8;
        int startB = 1;
        int d1 = 8;
        int d2 = 10;
        assertEquals(690, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case34() {
        int maxR = 10;
        int maxG = 12;
        int maxB = 19;
        int startR = 8;
        int startG = 5;
        int startB = 6;
        int d1 = 5;
        int d2 = 17;
        assertEquals(1794, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case35() {
        int maxR = 11;
        int maxG = 15;
        int maxB = 16;
        int startR = 7;
        int startG = 8;
        int startB = 5;
        int d1 = 9;
        int d2 = 12;
        assertEquals(330, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case36() {
        int maxR = 13;
        int maxG = 15;
        int maxB = 13;
        int startR = 2;
        int startG = 14;
        int startB = 6;
        int d1 = 9;
        int d2 = 15;
        assertEquals(1248, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case37() {
        int maxR = 11;
        int maxG = 20;
        int maxB = 10;
        int startR = 6;
        int startG = 4;
        int startB = 8;
        int d1 = 8;
        int d2 = 10;
        assertEquals(462, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case38() {
        int maxR = 49;
        int maxG = 52;
        int maxB = 40;
        int startR = 12;
        int startG = 11;
        int startB = 2;
        int d1 = 22;
        int d2 = 49;
        assertEquals(74992, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case39() {
        int maxR = 54;
        int maxG = 60;
        int maxB = 56;
        int startR = 40;
        int startG = 42;
        int startB = 35;
        int d1 = 24;
        int d2 = 26;
        assertEquals(15972, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case40() {
        int maxR = 49;
        int maxG = 59;
        int maxB = 53;
        int startR = 12;
        int startG = 23;
        int startB = 13;
        int d1 = 11;
        int d2 = 22;
        assertEquals(47439, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case41() {
        int maxR = 59;
        int maxG = 59;
        int maxB = 58;
        int startR = 32;
        int startG = 43;
        int startB = 17;
        int d1 = 30;
        int d2 = 32;
        assertEquals(23160, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case42() {
        int maxR = 49;
        int maxG = 55;
        int maxB = 51;
        int startR = 38;
        int startG = 45;
        int startB = 19;
        int d1 = 39;
        int d2 = 57;
        assertEquals(17493, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case43() {
        int maxR = 57;
        int maxG = 42;
        int maxB = 51;
        int startR = 37;
        int startG = 23;
        int startB = 31;
        int d1 = 27;
        int d2 = 39;
        assertEquals(33222, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case44() {
        int maxR = 99;
        int maxG = 96;
        int maxB = 88;
        int startR = 43;
        int startG = 12;
        int startB = 74;
        int d1 = 69;
        int d2 = 76;
        assertEquals(117810, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case45() {
        int maxR = 83;
        int maxG = 93;
        int maxB = 81;
        int startR = 48;
        int startG = 78;
        int startB = 61;
        int d1 = 38;
        int d2 = 51;
        assertEquals(175530, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case46() {
        int maxR = 81;
        int maxG = 100;
        int maxB = 91;
        int startR = 51;
        int startG = 26;
        int startB = 26;
        int d1 = 27;
        int d2 = 70;
        assertEquals(566110, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case47() {
        int maxR = 87;
        int maxG = 87;
        int maxB = 96;
        int startR = 39;
        int startG = 57;
        int startB = 87;
        int d1 = 40;
        int d2 = 81;
        assertEquals(419562, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case48() {
        int maxR = 90;
        int maxG = 80;
        int maxB = 85;
        int startR = 43;
        int startG = 5;
        int startB = 78;
        int d1 = 42;
        int d2 = 95;
        assertEquals(424752, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case49() {
        int maxR = 89;
        int maxG = 93;
        int maxB = 87;
        int startR = 22;
        int startG = 33;
        int startB = 0;
        int d1 = 35;
        int d2 = 70;
        assertEquals(452007, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case50() {
        int maxR = 13;
        int maxG = 95;
        int maxB = 64;
        int startR = 9;
        int startG = 0;
        int startB = 36;
        int d1 = 3;
        int d2 = 97;
        assertEquals(78965, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case51() {
        int maxR = 59;
        int maxG = 40;
        int maxB = 49;
        int startR = 49;
        int startG = 8;
        int startB = 37;
        int d1 = 36;
        int d2 = 91;
        assertEquals(31040, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case52() {
        int maxR = 80;
        int maxG = 82;
        int maxB = 80;
        int startR = 41;
        int startG = 53;
        int startB = 50;
        int d1 = 19;
        int d2 = 45;
        assertEquals(393347, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case53() {
        int maxR = 75;
        int maxG = 51;
        int maxB = 70;
        int startR = 69;
        int startG = 32;
        int startB = 21;
        int d1 = 23;
        int d2 = 59;
        assertEquals(181538, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case54() {
        int maxR = 93;
        int maxG = 44;
        int maxB = 16;
        int startR = 26;
        int startG = 23;
        int startB = 14;
        int d1 = 20;
        int d2 = 67;
        assertEquals(41136, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case55() {
        int maxR = 89;
        int maxG = 60;
        int maxB = 26;
        int startR = 7;
        int startG = 25;
        int startB = 2;
        int d1 = 5;
        int d2 = 82;
        assertEquals(138273, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case56() {
        int maxR = 17;
        int maxG = 22;
        int maxB = 98;
        int startR = 5;
        int startG = 11;
        int startB = 5;
        int d1 = 9;
        int d2 = 45;
        assertEquals(15742, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case57() {
        int maxR = 35;
        int maxG = 55;
        int maxB = 37;
        int startR = 34;
        int startG = 14;
        int startB = 31;
        int d1 = 0;
        int d2 = 74;
        assertEquals(71225, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case58() {
        int maxR = 80;
        int maxG = 93;
        int maxB = 78;
        int startR = 78;
        int startG = 79;
        int startB = 9;
        int d1 = 7;
        int d2 = 94;
        assertEquals(578968, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case59() {
        int maxR = 34;
        int maxG = 58;
        int maxB = 1;
        int startR = 2;
        int startG = 55;
        int startB = 0;
        int d1 = 55;
        int d2 = 67;
        assertEquals(34, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case60() {
        int maxR = 96;
        int maxG = 5;
        int maxB = 3;
        int startR = 26;
        int startG = 2;
        int startB = 0;
        int d1 = 5;
        int d2 = 8;
        assertEquals(120, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case61() {
        int maxR = 91;
        int maxG = 5;
        int maxB = 3;
        int startR = 13;
        int startG = 1;
        int startB = 0;
        int d1 = 5;
        int d2 = 5;
        assertEquals(30, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case62() {
        int maxR = 93;
        int maxG = 5;
        int maxB = 2;
        int startR = 76;
        int startG = 4;
        int startB = 0;
        int d1 = 9;
        int d2 = 27;
        assertEquals(270, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case63() {
        int maxR = 93;
        int maxG = 4;
        int maxB = 2;
        int startR = 5;
        int startG = 3;
        int startB = 1;
        int d1 = 3;
        int d2 = 24;
        assertEquals(210, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case64() {
        int maxR = 5;
        int maxG = 88;
        int maxB = 4;
        int startR = 3;
        int startG = 61;
        int startB = 2;
        int d1 = 3;
        int d2 = 6;
        assertEquals(180, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case65() {
        int maxR = 4;
        int maxG = 91;
        int maxB = 4;
        int startR = 2;
        int startG = 4;
        int startB = 3;
        int d1 = 4;
        int d2 = 9;
        assertEquals(112, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case66() {
        int maxR = 5;
        int maxG = 4;
        int maxB = 93;
        int startR = 0;
        int startG = 2;
        int startB = 43;
        int d1 = 4;
        int d2 = 5;
        assertEquals(108, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case67() {
        int maxR = 3;
        int maxG = 5;
        int maxB = 97;
        int startR = 0;
        int startG = 1;
        int startB = 69;
        int d1 = 0;
        int d2 = 1;
        assertEquals(18, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case68() {
        int maxR = 96;
        int maxG = 89;
        int maxB = 2;
        int startR = 46;
        int startG = 39;
        int startB = 1;
        int d1 = 3;
        int d2 = 4;
        assertEquals(112, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case69() {
        int maxR = 84;
        int maxG = 91;
        int maxB = 4;
        int startR = 8;
        int startG = 17;
        int startB = 2;
        int d1 = 3;
        int d2 = 9;
        assertEquals(1268, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case70() {
        int maxR = 92;
        int maxG = 4;
        int maxB = 80;
        int startR = 42;
        int startG = 3;
        int startB = 65;
        int d1 = 5;
        int d2 = 18;
        assertEquals(4560, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case71() {
        int maxR = 83;
        int maxG = 4;
        int maxB = 98;
        int startR = 74;
        int startG = 2;
        int startB = 34;
        int d1 = 3;
        int d2 = 10;
        assertEquals(1496, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case72() {
        int maxR = 3;
        int maxG = 96;
        int maxB = 86;
        int startR = 1;
        int startG = 74;
        int startB = 34;
        int d1 = 0;
        int d2 = 8;
        assertEquals(867, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case73() {
        int maxR = 4;
        int maxG = 90;
        int maxB = 95;
        int startR = 3;
        int startG = 11;
        int startB = 8;
        int d1 = 1;
        int d2 = 9;
        assertEquals(1367, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case74() {
        int maxR = 100;
        int maxG = 1;
        int maxB = 1;
        int startR = 99;
        int startG = 0;
        int startB = 0;
        int d1 = 3;
        int d2 = 7;
        assertEquals(5, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case75() {
        int maxR = 100;
        int maxG = 1;
        int maxB = 1;
        int startR = 99;
        int startG = 0;
        int startB = 0;
        int d1 = 34;
        int d2 = 69;
        assertEquals(36, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case76() {
        int maxR = 1;
        int maxG = 100;
        int maxB = 1;
        int startR = 0;
        int startG = 66;
        int startB = 0;
        int d1 = 2;
        int d2 = 22;
        assertEquals(42, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case77() {
        int maxR = 1;
        int maxG = 100;
        int maxB = 1;
        int startR = 0;
        int startG = 66;
        int startB = 0;
        int d1 = 4;
        int d2 = 44;
        assertEquals(71, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case78() {
        int maxR = 1;
        int maxG = 100;
        int maxB = 1;
        int startR = 0;
        int startG = 5;
        int startB = 0;
        int d1 = 4;
        int d2 = 6;
        assertEquals(5, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case79() {
        int maxR = 1;
        int maxG = 100;
        int maxB = 1;
        int startR = 0;
        int startG = 5;
        int startB = 0;
        int d1 = 5;
        int d2 = 6;
        assertEquals(3, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case80() {
        int maxR = 1;
        int maxG = 100;
        int maxB = 1;
        int startR = 0;
        int startG = 5;
        int startB = 0;
        int d1 = 6;
        int d2 = 6;
        assertEquals(1, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case81() {
        int maxR = 1;
        int maxG = 100;
        int maxB = 1;
        int startR = 0;
        int startG = 5;
        int startB = 0;
        int d1 = 7;
        int d2 = 7;
        assertEquals(1, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case82() {
        int maxR = 1;
        int maxG = 1;
        int maxB = 100;
        int startR = 0;
        int startG = 0;
        int startB = 0;
        int d1 = 18;
        int d2 = 23;
        assertEquals(6, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case83() {
        int maxR = 1;
        int maxG = 1;
        int maxB = 100;
        int startR = 0;
        int startG = 0;
        int startB = 26;
        int d1 = 20;
        int d2 = 24;
        assertEquals(10, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case84() {
        int maxR = 99;
        int maxG = 100;
        int maxB = 1;
        int startR = 13;
        int startG = 31;
        int startB = 0;
        int d1 = 20;
        int d2 = 60;
        assertEquals(5521, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case85() {
        int maxR = 99;
        int maxG = 100;
        int maxB = 1;
        int startR = 13;
        int startG = 31;
        int startB = 0;
        int d1 = 1;
        int d2 = 6;
        assertEquals(168, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case86() {
        int maxR = 100;
        int maxG = 99;
        int maxB = 1;
        int startR = 1;
        int startG = 94;
        int startB = 0;
        int d1 = 3;
        int d2 = 90;
        assertEquals(8720, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case87() {
        int maxR = 99;
        int maxG = 1;
        int maxB = 98;
        int startR = 25;
        int startG = 0;
        int startB = 96;
        int d1 = 0;
        int d2 = 3;
        assertEquals(35, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case88() {
        int maxR = 99;
        int maxG = 1;
        int maxB = 98;
        int startR = 25;
        int startG = 0;
        int startB = 96;
        int d1 = 0;
        int d2 = 4;
        assertEquals(54, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case89() {
        int maxR = 99;
        int maxG = 1;
        int maxB = 98;
        int startR = 25;
        int startG = 0;
        int startB = 96;
        int d1 = 0;
        int d2 = 5;
        assertEquals(77, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case90() {
        int maxR = 97;
        int maxG = 1;
        int maxB = 100;
        int startR = 0;
        int startG = 0;
        int startB = 0;
        int d1 = 8;
        int d2 = 13;
        assertEquals(132, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case91() {
        int maxR = 1;
        int maxG = 100;
        int maxB = 99;
        int startR = 0;
        int startG = 26;
        int startB = 23;
        int d1 = 1;
        int d2 = 3;
        assertEquals(48, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case92() {
        int maxR = 1;
        int maxG = 100;
        int maxB = 99;
        int startR = 0;
        int startG = 26;
        int startB = 23;
        int d1 = 31;
        int d2 = 33;
        assertEquals(342, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case93() {
        int maxR = 1;
        int maxG = 97;
        int maxB = 98;
        int startR = 0;
        int startG = 96;
        int startB = 96;
        int d1 = 95;
        int d2 = 100;
        assertEquals(386, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case94() {
        int maxR = 100;
        int maxG = 100;
        int maxB = 100;
        int startR = 8;
        int startG = 38;
        int startB = 37;
        int d1 = 6;
        int d2 = 10;
        assertEquals(7048, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case95() {
        int maxR = 100;
        int maxG = 100;
        int maxB = 100;
        int startR = 8;
        int startG = 37;
        int startB = 38;
        int d1 = 6;
        int d2 = 10;
        assertEquals(7048, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case96() {
        int maxR = 100;
        int maxG = 100;
        int maxB = 100;
        int startR = 8;
        int startG = 38;
        int startB = 38;
        int d1 = 6;
        int d2 = 10;
        assertEquals(7048, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case97() {
        int maxR = 100;
        int maxG = 100;
        int maxB = 100;
        int startR = 8;
        int startG = 37;
        int startB = 37;
        int d1 = 6;
        int d2 = 12;
        assertEquals(11794, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case98() {
        int maxR = 2;
        int maxG = 2;
        int maxB = 2;
        int startR = 0;
        int startG = 1;
        int startB = 1;
        int d1 = 1;
        int d2 = 1;
        assertEquals(7, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case99() {
        int maxR = 2;
        int maxG = 2;
        int maxB = 2;
        int startR = 1;
        int startG = 0;
        int startB = 1;
        int d1 = 1;
        int d2 = 1;
        assertEquals(7, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case100() {
        int maxR = 2;
        int maxG = 2;
        int maxB = 2;
        int startR = 1;
        int startG = 1;
        int startB = 0;
        int d1 = 1;
        int d2 = 1;
        assertEquals(7, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case101() {
        int maxR = 2;
        int maxG = 2;
        int maxB = 2;
        int startR = 0;
        int startG = 1;
        int startB = 1;
        int d1 = 0;
        int d2 = 1;
        assertEquals(8, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case102() {
        int maxR = 2;
        int maxG = 2;
        int maxB = 2;
        int startR = 1;
        int startG = 0;
        int startB = 1;
        int d1 = 0;
        int d2 = 1;
        assertEquals(8, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case103() {
        int maxR = 2;
        int maxG = 2;
        int maxB = 2;
        int startR = 1;
        int startG = 1;
        int startB = 0;
        int d1 = 0;
        int d2 = 1;
        assertEquals(8, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case104() {
        int maxR = 6;
        int maxG = 6;
        int maxB = 6;
        int startR = 3;
        int startG = 3;
        int startB = 3;
        int d1 = 1;
        int d2 = 2;
        assertEquals(124, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case105() {
        int maxR = 100;
        int maxG = 100;
        int maxB = 100;
        int startR = 50;
        int startG = 50;
        int startB = 50;
        int d1 = 3;
        int d2 = 50;
        assertEquals(999875, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case106() {
        int maxR = 100;
        int maxG = 100;
        int maxB = 100;
        int startR = 10;
        int startG = 10;
        int startB = 10;
        int d1 = 0;
        int d2 = 0;
        assertEquals(1, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case107() {
        int maxR = 1;
        int maxG = 1;
        int maxB = 1;
        int startR = 0;
        int startG = 0;
        int startB = 0;
        int d1 = 0;
        int d2 = 1;
        assertEquals(1, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case108() {
        int maxR = 5;
        int maxG = 1;
        int maxB = 1;
        int startR = 2;
        int startG = 0;
        int startB = 0;
        int d1 = 1;
        int d2 = 1;
        assertEquals(2, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case109() {
        int maxR = 100;
        int maxG = 100;
        int maxB = 100;
        int startR = 95;
        int startG = 95;
        int startB = 95;
        int d1 = 10;
        int d2 = 100;
        assertEquals(997256, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case110() {
        int maxR = 50;
        int maxG = 43;
        int maxB = 25;
        int startR = 3;
        int startG = 7;
        int startB = 5;
        int d1 = 2;
        int d2 = 7;
        assertEquals(2118, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case111() {
        int maxR = 100;
        int maxG = 99;
        int maxB = 98;
        int startR = 1;
        int startG = 97;
        int startB = 55;
        int d1 = 0;
        int d2 = 33;
        assertEquals(82075, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case112() {
        int maxR = 10;
        int maxG = 10;
        int maxB = 10;
        int startR = 5;
        int startG = 5;
        int startB = 5;
        int d1 = 1;
        int d2 = 3;
        assertEquals(342, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

    @Test
    public void case113() {
        int maxR = 100;
        int maxG = 100;
        int maxB = 100;
        int startR = 5;
        int startG = 5;
        int startB = 5;
        int d1 = 1;
        int d2 = 2;
        assertEquals(124, randomcoloringdiv2.getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
    }

}
