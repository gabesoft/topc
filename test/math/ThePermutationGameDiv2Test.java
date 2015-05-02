package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class ThePermutationGameDiv2Test {
    ThePermutationGameDiv2 thepermutationgamediv2 = new ThePermutationGameDiv2();

    @Test
    public void case1() {
        int N = 2;
        assertEquals(2L, thepermutationgamediv2.findMin(N));
    }

    @Test
    public void case2() {
        int N = 3;
        assertEquals(6L, thepermutationgamediv2.findMin(N));
    }

    @Test
    public void case3() {
        int N = 11;
        assertEquals(27720L, thepermutationgamediv2.findMin(N));
    }

    @Test
    public void case4() {
        int N = 25;
        assertEquals(26771144400L, thepermutationgamediv2.findMin(N));
    }

    @Test
    public void case5() {
        int N = 4;
        assertEquals(12L, thepermutationgamediv2.findMin(N));
    }

    @Test
    public void case6() {
        int N = 5;
        assertEquals(60L, thepermutationgamediv2.findMin(N));
    }

    @Test
    public void case7() {
        int N = 6;
        assertEquals(60L, thepermutationgamediv2.findMin(N));
    }

    @Test
    public void case8() {
        int N = 7;
        assertEquals(420L, thepermutationgamediv2.findMin(N));
    }

    @Test
    public void case9() {
        int N = 8;
        assertEquals(840L, thepermutationgamediv2.findMin(N));
    }

    @Test
    public void case10() {
        int N = 9;
        assertEquals(2520L, thepermutationgamediv2.findMin(N));
    }

    @Test
    public void case11() {
        int N = 10;
        assertEquals(2520L, thepermutationgamediv2.findMin(N));
    }

    @Test
    public void case12() {
        int N = 12;
        assertEquals(27720L, thepermutationgamediv2.findMin(N));
    }

    @Test
    public void case13() {
        int N = 13;
        assertEquals(360360L, thepermutationgamediv2.findMin(N));
    }

    @Test
    public void case14() {
        int N = 14;
        assertEquals(360360L, thepermutationgamediv2.findMin(N));
    }

    @Test
    public void case15() {
        int N = 15;
        assertEquals(360360L, thepermutationgamediv2.findMin(N));
    }

    @Test
    public void case16() {
        int N = 16;
        assertEquals(720720L, thepermutationgamediv2.findMin(N));
    }

    @Test
    public void case17() {
        int N = 17;
        assertEquals(12252240L, thepermutationgamediv2.findMin(N));
    }

    @Test
    public void case18() {
        int N = 18;
        assertEquals(12252240L, thepermutationgamediv2.findMin(N));
    }

    @Test
    public void case19() {
        int N = 19;
        assertEquals(232792560L, thepermutationgamediv2.findMin(N));
    }

    @Test
    public void case20() {
        int N = 20;
        assertEquals(232792560L, thepermutationgamediv2.findMin(N));
    }

    @Test
    public void case21() {
        int N = 21;
        assertEquals(232792560L, thepermutationgamediv2.findMin(N));
    }

    @Test
    public void case22() {
        int N = 22;
        assertEquals(232792560L, thepermutationgamediv2.findMin(N));
    }

    @Test
    public void case23() {
        int N = 23;
        assertEquals(5354228880L, thepermutationgamediv2.findMin(N));
    }

    @Test
    public void case24() {
        int N = 24;
        assertEquals(5354228880L, thepermutationgamediv2.findMin(N));
    }

    @Test
    public void case25() {
        int N = 20;
        assertEquals(232792560L, thepermutationgamediv2.findMin(N));
    }

    @Test
    public void case26() {
        int N = 26;
        assertEquals(26771144400L, thepermutationgamediv2.findMin(N));
    }

    @Test
    public void case27() {
        int N = 27;
        assertEquals(80313433200L, thepermutationgamediv2.findMin(N));
    }

    @Test
    public void case28() {
        int N = 28;
        assertEquals(80313433200L, thepermutationgamediv2.findMin(N));
    }

    @Test
    public void case29() {
        int N = 29;
        assertEquals(2329089562800L, thepermutationgamediv2.findMin(N));
    }

    @Test
    public void case30() {
        int N = 30;
        assertEquals(2329089562800L, thepermutationgamediv2.findMin(N));
    }

    @Test
    public void case31() {
        int N = 31;
        assertEquals(72201776446800L, thepermutationgamediv2.findMin(N));
    }

    @Test
    public void case32() {
        int N = 32;
        assertEquals(144403552893600L, thepermutationgamediv2.findMin(N));
    }

    @Test
    public void case33() {
        int N = 33;
        assertEquals(144403552893600L, thepermutationgamediv2.findMin(N));
    }

    @Test
    public void case34() {
        int N = 34;
        assertEquals(144403552893600L, thepermutationgamediv2.findMin(N));
    }

    @Test
    public void case35() {
        int N = 35;
        assertEquals(144403552893600L, thepermutationgamediv2.findMin(N));
    }

    @Test
    public void case36() {
        int N = 1;
        assertEquals(1L, thepermutationgamediv2.findMin(N));
    }

}
