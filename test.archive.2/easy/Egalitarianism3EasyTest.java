package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class Egalitarianism3EasyTest {
    Egalitarianism3Easy egalitarianism3easy = new Egalitarianism3Easy();

    @Test
    public void case1() {
        int n = 4;
        int[] a = { 1, 1, 1 };
        int[] b = { 2, 3, 4 };
        int[] len = { 1, 1, 1 };
        assertEquals(3, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case2() {
        int n = 6;
        int[] a = { 1, 2, 3, 2, 3 };
        int[] b = { 2, 3, 4, 5, 6 };
        int[] len = { 2, 1, 3, 2, 3 };
        assertEquals(3, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case3() {
        int n = 10;
        int[] a = { 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] b = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] len = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
        assertEquals(9, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case4() {
        int n = 2;
        int[] a = { 1 };
        int[] b = { 2 };
        int[] len = { 3 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case5() {
        int n = 1;
        int[] a = {  };
        int[] b = {  };
        int[] len = {  };
        assertEquals(1, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case6() {
        int n = 5;
        int[] a = { 1, 1, 4, 2 };
        int[] b = { 4, 5, 3, 1 };
        int[] len = { 423, 422, 422, 424 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case7() {
        int n = 5;
        int[] a = { 3, 4, 2, 5 };
        int[] b = { 1, 2, 3, 4 };
        int[] len = { 446, 446, 446, 443 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case8() {
        int n = 9;
        int[] a = { 1, 6, 3, 9, 6, 1, 6, 6 };
        int[] b = { 9, 4, 6, 5, 1, 7, 8, 2 };
        int[] len = { 827, 823, 825, 827, 827, 823, 824, 826 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case9() {
        int n = 6;
        int[] a = { 6, 6, 6, 5, 5 };
        int[] b = { 2, 5, 1, 3, 4 };
        int[] len = { 886, 886, 885, 886, 886 };
        assertEquals(3, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case10() {
        int n = 3;
        int[] a = { 3, 3 };
        int[] b = { 2, 1 };
        int[] len = { 91, 91 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case11() {
        int n = 8;
        int[] a = { 2, 5, 5, 2, 2, 3, 3 };
        int[] b = { 5, 6, 3, 8, 4, 7, 1 };
        int[] len = { 164, 164, 164, 164, 164, 164, 164 };
        assertEquals(3, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case12() {
        int n = 9;
        int[] a = { 2, 1, 7, 9, 2, 6, 9, 7 };
        int[] b = { 9, 4, 3, 7, 1, 8, 6, 5 };
        int[] len = { 345, 345, 345, 346, 346, 345, 344, 346 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case13() {
        int n = 6;
        int[] a = { 4, 2, 2, 4, 4 };
        int[] b = { 3, 5, 6, 2, 1 };
        int[] len = { 670, 668, 673, 670, 669 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case14() {
        int n = 9;
        int[] a = { 2, 7, 7, 3, 9, 7, 6, 3 };
        int[] b = { 4, 9, 6, 5, 3, 2, 8, 1 };
        int[] len = { 857, 857, 857, 857, 857, 857, 857, 857 };
        assertEquals(3, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case15() {
        int n = 9;
        int[] a = { 3, 1, 3, 3, 3, 9, 7, 7 };
        int[] b = { 9, 5, 4, 7, 2, 6, 1, 8 };
        int[] len = { 490, 489, 490, 490, 490, 488, 489, 490 };
        assertEquals(4, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case16() {
        int n = 10;
        int[] a = { 7, 10, 7, 9, 6, 8, 7, 7, 7 };
        int[] b = { 5, 2, 10, 4, 8, 1, 6, 3, 9 };
        int[] len = { 632, 632, 633, 633, 632, 632, 632, 632, 633 };
        assertEquals(3, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case17() {
        int n = 5;
        int[] a = { 2, 2, 1, 5 };
        int[] b = { 4, 3, 5, 2 };
        int[] len = { 108, 108, 109, 107 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case18() {
        int n = 6;
        int[] a = { 3, 6, 5, 3, 5 };
        int[] b = { 6, 2, 1, 5, 4 };
        int[] len = { 291, 290, 291, 288, 288 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case19() {
        int n = 8;
        int[] a = { 6, 5, 5, 7, 8, 3, 1 };
        int[] b = { 3, 6, 8, 5, 1, 2, 4 };
        int[] len = { 75, 76, 74, 77, 77, 73, 73 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case20() {
        int n = 6;
        int[] a = { 3, 3, 6, 6, 2 };
        int[] b = { 6, 2, 5, 4, 1 };
        int[] len = { 585, 586, 584, 584, 586 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case21() {
        int n = 7;
        int[] a = { 7, 6, 2, 1, 5, 1 };
        int[] b = { 6, 2, 4, 7, 1, 3 };
        int[] len = { 250, 253, 251, 250, 251, 251 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case22() {
        int n = 7;
        int[] a = { 4, 4, 2, 7, 4, 1 };
        int[] b = { 2, 5, 3, 6, 1, 7 };
        int[] len = { 278, 280, 279, 278, 283, 279 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case23() {
        int n = 7;
        int[] a = { 5, 7, 4, 5, 1, 7 };
        int[] b = { 3, 4, 6, 7, 5, 2 };
        int[] len = { 683, 682, 682, 682, 682, 683 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case24() {
        int n = 10;
        int[] a = { 2, 5, 9, 2, 2, 9, 6, 10, 5 };
        int[] b = { 3, 4, 7, 10, 6, 1, 9, 8, 2 };
        int[] len = { 890, 887, 888, 888, 890, 889, 888, 890, 889 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case25() {
        int n = 8;
        int[] a = { 8, 6, 6, 3, 6, 7, 3 };
        int[] b = { 4, 3, 8, 1, 2, 5, 7 };
        int[] len = { 392, 390, 394, 392, 394, 390, 390 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case26() {
        int n = 9;
        int[] a = { 5, 9, 5, 5, 4, 3, 3, 4 };
        int[] b = { 7, 6, 9, 8, 1, 4, 5, 2 };
        int[] len = { 379, 379, 378, 379, 378, 379, 378, 380 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case27() {
        int n = 8;
        int[] a = { 3, 2, 4, 4, 3, 3, 4 };
        int[] b = { 1, 7, 6, 2, 5, 8, 3 };
        int[] len = { 540, 542, 542, 541, 542, 539, 542 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case28() {
        int n = 10;
        int[] a = { 5, 5, 5, 4, 10, 9, 5, 9, 9 };
        int[] b = { 4, 3, 2, 6, 1, 5, 10, 7, 8 };
        int[] len = { 18, 18, 18, 18, 18, 18, 18, 18, 18 };
        assertEquals(5, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case29() {
        int n = 8;
        int[] a = { 4, 6, 8, 3, 4, 4, 6 };
        int[] b = { 1, 5, 4, 6, 3, 7, 2 };
        int[] len = { 321, 321, 321, 321, 321, 321, 321 };
        assertEquals(4, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case30() {
        int n = 6;
        int[] a = { 1, 6, 1, 1, 1 };
        int[] b = { 2, 5, 4, 6, 3 };
        int[] len = { 733, 736, 736, 734, 733 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case31() {
        int n = 10;
        int[] a = { 6, 1, 5, 1, 1, 7, 5, 10, 5 };
        int[] b = { 3, 4, 6, 5, 9, 10, 8, 2, 7 };
        int[] len = { 322, 320, 324, 323, 323, 323, 325, 321, 322 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case32() {
        int n = 3;
        int[] a = { 3, 3 };
        int[] b = { 2, 1 };
        int[] len = { 349, 348 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case33() {
        int n = 6;
        int[] a = { 6, 1, 6, 5, 6 };
        int[] b = { 3, 6, 5, 4, 2 };
        int[] len = { 884, 885, 884, 885, 884 };
        assertEquals(3, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case34() {
        int n = 3;
        int[] a = { 2, 3 };
        int[] b = { 3, 1 };
        int[] len = { 328, 324 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case35() {
        int n = 8;
        int[] a = { 1, 7, 2, 7, 7, 2, 7 };
        int[] b = { 4, 3, 5, 8, 1, 7, 6 };
        int[] len = { 299, 299, 300, 299, 301, 303, 303 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case36() {
        int n = 10;
        int[] a = { 2, 6, 6, 4, 7, 2, 4, 6, 1 };
        int[] b = { 9, 5, 2, 8, 1, 3, 10, 7, 4 };
        int[] len = { 738, 741, 740, 740, 738, 738, 738, 741, 736 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case37() {
        int n = 8;
        int[] a = { 3, 5, 5, 8, 8, 7, 3 };
        int[] b = { 4, 7, 8, 6, 1, 3, 2 };
        int[] len = { 656, 654, 655, 655, 654, 656, 656 };
        assertEquals(3, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case38() {
        int n = 8;
        int[] a = { 8, 1, 4, 6, 7, 4, 8 };
        int[] b = { 6, 8, 2, 5, 4, 3, 7 };
        int[] len = { 350, 348, 348, 346, 348, 348, 347 };
        assertEquals(3, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case39() {
        int n = 3;
        int[] a = { 2, 2 };
        int[] b = { 1, 3 };
        int[] len = { 98, 99 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case40() {
        int n = 5;
        int[] a = { 1, 2, 5, 5 };
        int[] b = { 4, 5, 3, 1 };
        int[] len = { 672, 672, 674, 672 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case41() {
        int n = 5;
        int[] a = { 4, 4, 3, 3 };
        int[] b = { 2, 5, 4, 1 };
        int[] len = { 872, 873, 876, 872 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case42() {
        int n = 5;
        int[] a = { 3, 3, 1, 4 };
        int[] b = { 2, 4, 5, 1 };
        int[] len = { 552, 550, 551, 552 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case43() {
        int n = 9;
        int[] a = { 3, 5, 4, 9, 6, 1, 4, 4 };
        int[] b = { 8, 4, 2, 6, 7, 3, 1, 9 };
        int[] len = { 145, 145, 146, 145, 145, 143, 143, 144 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case44() {
        int n = 4;
        int[] a = { 3, 1, 3 };
        int[] b = { 4, 3, 2 };
        int[] len = { 149, 149, 149 };
        assertEquals(3, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case45() {
        int n = 5;
        int[] a = { 3, 4, 3, 3 };
        int[] b = { 2, 1, 4, 5 };
        int[] len = { 555, 555, 555, 555 };
        assertEquals(3, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case46() {
        int n = 8;
        int[] a = { 2, 1, 1, 2, 8, 7, 8 };
        int[] b = { 4, 5, 3, 7, 2, 6, 1 };
        int[] len = { 813, 813, 813, 813, 813, 813, 813 };
        assertEquals(3, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case47() {
        int n = 6;
        int[] a = { 2, 6, 2, 1, 1 };
        int[] b = { 3, 4, 5, 6, 2 };
        int[] len = { 727, 727, 727, 727, 727 };
        assertEquals(3, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case48() {
        int n = 7;
        int[] a = { 2, 1, 5, 7, 7, 2 };
        int[] b = { 7, 3, 6, 1, 5, 4 };
        int[] len = { 664, 664, 664, 664, 664, 664 };
        assertEquals(3, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case49() {
        int n = 6;
        int[] a = { 5, 4, 2, 6, 2 };
        int[] b = { 3, 1, 6, 4, 5 };
        int[] len = { 863, 863, 863, 863, 863 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case50() {
        int n = 10;
        int[] a = { 4, 10, 7, 2, 7, 9, 9, 6, 10 };
        int[] b = { 5, 2, 1, 6, 9, 4, 3, 8, 7 };
        int[] len = { 498, 498, 498, 498, 498, 498, 498, 498, 498 };
        assertEquals(3, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case51() {
        int n = 5;
        int[] a = { 5, 5, 4, 5 };
        int[] b = { 1, 4, 3, 2 };
        int[] len = { 741, 741, 741, 741 };
        assertEquals(3, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case52() {
        int n = 8;
        int[] a = { 5, 1, 6, 3, 6, 5, 6 };
        int[] b = { 1, 8, 5, 4, 2, 7, 3 };
        int[] len = { 708, 708, 708, 708, 708, 708, 708 };
        assertEquals(3, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case53() {
        int n = 4;
        int[] a = { 2, 2, 4 };
        int[] b = { 4, 1, 3 };
        int[] len = { 899, 899, 899 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case54() {
        int n = 8;
        int[] a = { 5, 5, 4, 5, 4, 5, 4 };
        int[] b = { 3, 2, 1, 7, 6, 8, 5 };
        int[] len = { 876, 876, 876, 876, 876, 876, 876 };
        assertEquals(5, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case55() {
        int n = 3;
        int[] a = { 2, 2 };
        int[] b = { 3, 1 };
        int[] len = { 669, 669 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case56() {
        int n = 10;
        int[] a = { 10, 10, 10, 10, 10, 5, 5, 10, 5 };
        int[] b = { 1, 8, 2, 7, 5, 9, 3, 6, 4 };
        int[] len = { 375, 375, 375, 375, 375, 375, 375, 375, 375 };
        assertEquals(6, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case57() {
        int n = 3;
        int[] a = { 3, 3 };
        int[] b = { 1, 2 };
        int[] len = { 430, 430 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case58() {
        int n = 8;
        int[] a = { 3, 3, 3, 3, 2, 3, 2 };
        int[] b = { 6, 1, 4, 7, 8, 2, 5 };
        int[] len = { 708, 708, 708, 708, 708, 708, 708 };
        assertEquals(5, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case59() {
        int n = 9;
        int[] a = { 5, 5, 4, 5, 5, 5, 5, 5 };
        int[] b = { 3, 7, 5, 6, 8, 2, 1, 9 };
        int[] len = { 735, 735, 735, 735, 735, 735, 735, 735 };
        assertEquals(8, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case60() {
        int n = 10;
        int[] a = { 4, 10, 4, 4, 4, 4, 4, 10, 4 };
        int[] b = { 9, 1, 7, 2, 5, 8, 6, 4, 3 };
        int[] len = { 750, 750, 750, 750, 750, 750, 750, 750, 750 };
        assertEquals(8, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case61() {
        int n = 5;
        int[] a = { 4, 4, 2, 4 };
        int[] b = { 5, 1, 3, 2 };
        int[] len = { 246, 246, 246, 246 };
        assertEquals(3, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case62() {
        int n = 7;
        int[] a = { 3, 7, 3, 3, 7, 7 };
        int[] b = { 5, 2, 7, 4, 6, 1 };
        int[] len = { 688, 688, 688, 688, 688, 688 };
        assertEquals(4, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case63() {
        int n = 8;
        int[] a = { 4, 4, 4, 4, 4, 4, 1 };
        int[] b = { 8, 6, 2, 5, 3, 1, 7 };
        int[] len = { 450, 450, 450, 450, 450, 450, 450 };
        assertEquals(6, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case64() {
        int n = 6;
        int[] a = { 5, 5, 1, 5, 1 };
        int[] b = { 2, 3, 6, 1, 4 };
        int[] len = { 597, 597, 597, 597, 597 };
        assertEquals(3, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case65() {
        int n = 6;
        int[] a = { 6, 4, 6, 6, 6 };
        int[] b = { 1, 6, 2, 3, 5 };
        int[] len = { 253, 253, 253, 253, 253 };
        assertEquals(5, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case66() {
        int n = 9;
        int[] a = { 7, 7, 5, 7, 5, 8, 8, 8 };
        int[] b = { 4, 8, 3, 2, 9, 6, 1, 5 };
        int[] len = { 248, 248, 248, 248, 248, 248, 248, 248 };
        assertEquals(4, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case67() {
        int n = 10;
        int[] a = { 1, 1, 4, 1, 4, 1, 4, 1, 4 };
        int[] b = { 10, 2, 8, 5, 7, 3, 1, 6, 9 };
        int[] len = { 135, 135, 135, 135, 135, 134, 135, 134, 135 };
        assertEquals(4, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case68() {
        int n = 6;
        int[] a = { 3, 5, 3, 3, 1 };
        int[] b = { 1, 2, 4, 5, 6 };
        int[] len = { 80, 80, 80, 81, 81 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case69() {
        int n = 7;
        int[] a = { 5, 2, 5, 5, 4, 2 };
        int[] b = { 6, 1, 4, 2, 3, 7 };
        int[] len = { 589, 589, 589, 589, 589, 589 };
        assertEquals(3, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case70() {
        int n = 5;
        int[] a = { 3, 3, 3, 4 };
        int[] b = { 4, 1, 5, 2 };
        int[] len = { 793, 794, 793, 794 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case71() {
        int n = 7;
        int[] a = { 6, 6, 4, 6, 5, 5 };
        int[] b = { 3, 5, 2, 1, 7, 4 };
        int[] len = { 727, 727, 727, 727, 726, 726 };
        assertEquals(3, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case72() {
        int n = 8;
        int[] a = { 5, 5, 3, 7, 7, 7, 5 };
        int[] b = { 8, 1, 7, 2, 4, 6, 3 };
        int[] len = { 241, 241, 241, 241, 241, 241, 241 };
        assertEquals(4, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case73() {
        int n = 9;
        int[] a = { 6, 7, 2, 7, 7, 6, 2, 7 };
        int[] b = { 8, 4, 3, 1, 2, 9, 6, 5 };
        int[] len = { 22, 21, 21, 21, 22, 21, 22, 22 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case74() {
        int n = 7;
        int[] a = { 7, 7, 7, 4, 4, 7 };
        int[] b = { 2, 1, 4, 5, 6, 3 };
        int[] len = { 797, 798, 797, 797, 799, 798 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case75() {
        int n = 8;
        int[] a = { 2, 4, 1, 1, 4, 4, 1 };
        int[] b = { 7, 2, 3, 6, 1, 5, 8 };
        int[] len = { 316, 315, 316, 315, 315, 316, 316 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case76() {
        int n = 6;
        int[] a = { 2, 5, 5, 2, 5 };
        int[] b = { 6, 4, 1, 3, 2 };
        int[] len = { 43, 43, 43, 43, 43 };
        assertEquals(3, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case77() {
        int n = 7;
        int[] a = { 5, 1, 1, 6, 6, 5 };
        int[] b = { 4, 5, 6, 3, 2, 7 };
        int[] len = { 562, 562, 563, 563, 561, 563 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case78() {
        int n = 4;
        int[] a = { 4, 1, 4 };
        int[] b = { 1, 2, 3 };
        int[] len = { 349, 350, 349 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case79() {
        int n = 6;
        int[] a = { 5, 6, 1, 5, 6 };
        int[] b = { 4, 2, 6, 1, 3 };
        int[] len = { 73, 73, 73, 72, 73 };
        assertEquals(3, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case80() {
        int n = 10;
        int[] a = { 5, 1, 5, 9, 9, 1, 9, 9, 5 };
        int[] b = { 4, 8, 10, 5, 6, 7, 1, 3, 2 };
        int[] len = { 669, 669, 670, 669, 669, 669, 670, 669, 670 };
        assertEquals(3, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case81() {
        int n = 8;
        int[] a = { 7, 4, 5, 7, 7, 7, 5 };
        int[] b = { 5, 1, 4, 8, 3, 6, 2 };
        int[] len = { 12, 12, 11, 12, 12, 13, 13 };
        assertEquals(3, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case82() {
        int n = 6;
        int[] a = { 3, 1, 3, 1, 3 };
        int[] b = { 5, 2, 1, 4, 6 };
        int[] len = { 92, 92, 92, 92, 92 };
        assertEquals(3, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case83() {
        int n = 9;
        int[] a = { 7, 2, 7, 7, 7, 2, 6, 6 };
        int[] b = { 9, 3, 8, 2, 4, 1, 7, 5 };
        int[] len = { 61, 62, 61, 62, 62, 61, 62, 62 };
        assertEquals(3, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case84() {
        int n = 6;
        int[] a = { 5, 1, 4, 4, 4 };
        int[] b = { 2, 3, 5, 6, 1 };
        int[] len = { 340, 340, 338, 340, 338 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case85() {
        int n = 10;
        int[] a = { 6, 5, 5, 5, 5, 5, 10, 5, 6 };
        int[] b = { 7, 1, 2, 4, 3, 6, 8, 9, 10 };
        int[] len = { 149, 149, 149, 149, 149, 149, 149, 149, 149 };
        assertEquals(6, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case86() {
        int n = 6;
        int[] a = { 1, 2, 3, 2, 3 };
        int[] b = { 2, 3, 4, 5, 6 };
        int[] len = { 2, 1, 3, 2, 3 };
        assertEquals(3, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case87() {
        int n = 10;
        int[] a = { 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] b = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] len = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
        assertEquals(9, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case88() {
        int n = 5;
        int[] a = { 1, 1, 3, 3 };
        int[] b = { 2, 3, 4, 5 };
        int[] len = { 1, 1, 2, 2 };
        assertEquals(3, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case89() {
        int n = 10;
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] b = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] len = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case90() {
        int n = 1;
        int[] a = {  };
        int[] b = {  };
        int[] len = {  };
        assertEquals(1, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case91() {
        int n = 5;
        int[] a = { 1, 1, 1, 1 };
        int[] b = { 2, 3, 4, 5 };
        int[] len = { 1, 1, 1, 2 };
        assertEquals(3, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case92() {
        int n = 4;
        int[] a = { 1, 3, 1 };
        int[] b = { 2, 4, 3 };
        int[] len = { 1, 1, 1 };
        assertEquals(2, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case93() {
        int n = 6;
        int[] a = { 3, 1, 2, 2, 1 };
        int[] b = { 1, 2, 4, 5, 6 };
        int[] len = { 1, 1, 2, 2, 1 };
        assertEquals(3, egalitarianism3easy.maxCities(n, a, b, len));
    }

    @Test
    public void case94() {
        int n = 6;
        int[] a = { 1, 1, 1, 4, 4 };
        int[] b = { 2, 3, 4, 6, 5 };
        int[] len = { 10, 10, 5, 5, 5 };
        assertEquals(3, egalitarianism3easy.maxCities(n, a, b, len));
    }

}
