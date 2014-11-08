package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class BallAndHatsTest {
    BallAndHats ballandhats = new BallAndHats();

    @Test
    public void case1() {
        String hats = ".o.";
        int numSwaps = 1;
        assertEquals(0, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case2() {
        String hats = "..o";
        int numSwaps = 0;
        assertEquals(2, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case3() {
        String hats = "o..";
        int numSwaps = 1;
        assertEquals(1, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case4() {
        String hats = "..o";
        int numSwaps = 2;
        assertEquals(0, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case5() {
        String hats = "o..";
        int numSwaps = 101;
        assertEquals(1, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case6() {
        String hats = "o..";
        int numSwaps = 1000;
        assertEquals(0, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case7() {
        String hats = ".o.";
        int numSwaps = 1000;
        assertEquals(1, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case8() {
        String hats = "..o";
        int numSwaps = 1000;
        assertEquals(0, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case9() {
        String hats = "o..";
        int numSwaps = 0;
        assertEquals(0, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case10() {
        String hats = ".o.";
        int numSwaps = 0;
        assertEquals(1, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case11() {
        String hats = "..o";
        int numSwaps = 1;
        assertEquals(1, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case12() {
        String hats = "o..";
        int numSwaps = 999;
        assertEquals(1, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case13() {
        String hats = ".o.";
        int numSwaps = 999;
        assertEquals(0, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case14() {
        String hats = "..o";
        int numSwaps = 999;
        assertEquals(1, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case15() {
        String hats = "o..";
        int numSwaps = 2;
        assertEquals(0, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case16() {
        String hats = ".o.";
        int numSwaps = 2;
        assertEquals(1, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case17() {
        String hats = "o..";
        int numSwaps = 17;
        assertEquals(1, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case18() {
        String hats = ".o.";
        int numSwaps = 892;
        assertEquals(1, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case19() {
        String hats = "..o";
        int numSwaps = 727;
        assertEquals(1, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case20() {
        String hats = "..o";
        int numSwaps = 213;
        assertEquals(1, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case21() {
        String hats = "o..";
        int numSwaps = 777;
        assertEquals(1, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case22() {
        String hats = "o..";
        int numSwaps = 776;
        assertEquals(0, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case23() {
        String hats = ".o.";
        int numSwaps = 774;
        assertEquals(1, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case24() {
        String hats = ".o.";
        int numSwaps = 775;
        assertEquals(0, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case25() {
        String hats = "..o";
        int numSwaps = 231;
        assertEquals(1, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case26() {
        String hats = "..o";
        int numSwaps = 232;
        assertEquals(0, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case27() {
        String hats = ".o.";
        int numSwaps = 444;
        assertEquals(1, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case28() {
        String hats = ".o.";
        int numSwaps = 447;
        assertEquals(0, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case29() {
        String hats = "o..";
        int numSwaps = 3;
        assertEquals(1, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case30() {
        String hats = ".o.";
        int numSwaps = 3;
        assertEquals(0, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case31() {
        String hats = "..o";
        int numSwaps = 3;
        assertEquals(1, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case32() {
        String hats = "o..";
        int numSwaps = 6;
        assertEquals(0, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case33() {
        String hats = "..o";
        int numSwaps = 4;
        assertEquals(0, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case34() {
        String hats = ".o.";
        int numSwaps = 942;
        assertEquals(1, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case35() {
        String hats = ".o.";
        int numSwaps = 101;
        assertEquals(0, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case36() {
        String hats = "..o";
        int numSwaps = 8;
        assertEquals(0, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case37() {
        String hats = "..o";
        int numSwaps = 100;
        assertEquals(0, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case38() {
        String hats = "o..";
        int numSwaps = 14;
        assertEquals(0, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case39() {
        String hats = ".o.";
        int numSwaps = 4;
        assertEquals(1, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case40() {
        String hats = "..o";
        int numSwaps = 16;
        assertEquals(0, ballandhats.getHat(hats, numSwaps));
    }

    @Test
    public void case41() {
        String hats = ".o.";
        int numSwaps = 399;
        assertEquals(0, ballandhats.getHat(hats, numSwaps));
    }

}
