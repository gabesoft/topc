package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class ColorfulCoinsEasyTest {
    ColorfulCoinsEasy colorfulcoinseasy = new ColorfulCoinsEasy();

    @Test
    public void case1() {
        int[] values = { 1 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case2() {
        int[] values = { 1, 3 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case3() {
        int[] values = { 1, 2, 4 };
        assertEquals("Impossible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case4() {
        int[] values = { 1, 5, 15, 90 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case5() {
        int[] values = { 1, 4, 20, 60, 180, 1440, 5760 };
        assertEquals("Impossible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case6() {
        int[] values = { 1, 7, 21, 105, 630, 3150, 18900 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case7() {
        int[] values = { 1, 10, 30, 300, 900, 9000, 18000 };
        assertEquals("Impossible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case8() {
        int[] values = { 1, 2, 10, 40, 200, 1000, 4000, 20000 };
        assertEquals("Impossible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case9() {
        int[] values = { 1, 2 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case10() {
        int[] values = { 1, 42 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case11() {
        int[] values = { 1, 20000 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case12() {
        int[] values = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384 };
        assertEquals("Impossible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case13() {
        int[] values = { 1, 2, 8, 16, 64, 512, 4096, 16384 };
        assertEquals("Impossible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case14() {
        int[] values = { 1, 2, 8, 64, 512, 4096, 16384 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case15() {
        int[] values = { 1, 3, 9, 27, 81, 243, 729, 2187, 6561, 19683 };
        assertEquals("Impossible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case16() {
        int[] values = { 1, 9, 27, 243, 729, 2187, 19683 };
        assertEquals("Impossible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case17() {
        int[] values = { 1, 9, 27, 243, 729, 19683 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case18() {
        int[] values = { 1, 4, 16, 64, 256, 1024, 4096, 16384 };
        assertEquals("Impossible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case19() {
        int[] values = { 1, 16, 256, 1024, 4096, 16384 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case20() {
        int[] values = { 1, 5, 25, 125, 625, 3125, 15625 };
        assertEquals("Impossible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case21() {
        int[] values = { 1, 5, 25, 125, 3125, 15625 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case22() {
        int[] values = { 1, 6, 36, 216, 1296, 7776 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case23() {
        int[] values = { 1, 10, 100, 1000, 10000 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case24() {
        int[] values = { 1, 10, 100, 1000, 10000, 20000 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case25() {
        int[] values = { 1, 5, 25, 100, 400, 2800, 19600 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case26() {
        int[] values = { 1, 3, 18, 108, 540, 2700, 18900 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case27() {
        int[] values = { 1, 2, 14, 98, 686, 4802, 19208 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case28() {
        int[] values = { 1, 4, 16, 80, 400, 2800, 19600 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case29() {
        int[] values = { 1, 2, 12, 72, 432, 2592, 18144 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case30() {
        int[] values = { 1, 2, 8, 56, 392, 2352, 16464 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case31() {
        int[] values = { 1, 4, 20, 100, 400, 2800, 19600 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case32() {
        int[] values = { 1, 2, 6, 24, 120, 720, 5040 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case33() {
        int[] values = { 1, 2, 6, 12, 36, 72, 216, 648, 1296, 2592, 7776, 15552 };
        assertEquals("Impossible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case34() {
        int[] values = { 1, 100, 20000 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case35() {
        int[] values = { 1, 2, 10000, 20000 };
        assertEquals("Impossible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case36() {
        int[] values = { 1, 3, 6561, 19683 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case37() {
        int[] values = { 1, 3, 9, 6561, 19683 };
        assertEquals("Impossible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case38() {
        int[] values = { 1, 3, 2187, 6561, 19683 };
        assertEquals("Impossible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case39() {
        int[] values = { 1, 23, 966, 11592 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case40() {
        int[] values = { 1, 1000, 2000, 4000, 8000, 16000 };
        assertEquals("Impossible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case41() {
        int[] values = { 1, 5000, 10000, 20000 };
        assertEquals("Impossible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case42() {
        int[] values = { 1, 2000, 10000, 20000 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case43() {
        int[] values = { 1, 19999 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case44() {
        int[] values = { 1, 10007 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case45() {
        int[] values = { 1, 101, 10201 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case46() {
        int[] values = { 1, 99, 9801 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case47() {
        int[] values = { 1, 49, 2401 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case48() {
        int[] values = { 1, 99, 9801, 19602 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case49() {
        int[] values = { 1, 4, 24, 144, 432, 2160, 12960 };
        assertEquals("Impossible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case50() {
        int[] values = { 1, 4, 24, 144, 432, 2160, 15120 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case51() {
        int[] values = { 1, 3, 9, 36, 144 };
        assertEquals("Impossible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case52() {
        int[] values = { 1, 5, 10, 40, 200, 1000 };
        assertEquals("Impossible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case53() {
        int[] values = { 1, 2, 6, 30, 210, 2310 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case54() {
        int[] values = { 1, 4, 8, 32, 64, 256, 512, 2048, 4096, 16384 };
        assertEquals("Impossible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case55() {
        int[] values = { 1, 3, 9, 1107, 4428 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case56() {
        int[] values = { 1, 3, 9, 45, 405, 1215 };
        assertEquals("Impossible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case57() {
        int[] values = { 1, 3, 9, 27, 621, 19872 };
        assertEquals("Impossible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case58() {
        int[] values = { 1, 2, 4, 8, 16 };
        assertEquals("Impossible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case59() {
        int[] values = { 1, 7, 42, 210, 840, 2520, 5040 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case60() {
        int[] values = { 1, 7, 42, 210, 840, 2520, 17640 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case61() {
        int[] values = { 1, 7, 42, 210, 840, 2520, 10080 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case62() {
        int[] values = { 1, 7, 42, 210, 420, 1260, 5040, 15120 };
        assertEquals("Impossible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case63() {
        int[] values = { 1, 4, 24, 48, 144, 720, 4320 };
        assertEquals("Impossible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case64() {
        int[] values = { 1, 5, 25, 100, 500, 3500, 17500 };
        assertEquals("Impossible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case65() {
        int[] values = { 1, 6, 42, 168, 672, 2688, 10752 };
        assertEquals("Impossible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case66() {
        int[] values = { 1, 10, 30, 300, 900, 9000, 18000 };
        assertEquals("Impossible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case67() {
        int[] values = { 1, 7, 21, 105, 630, 3150, 18900 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case68() {
        int[] values = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384 };
        assertEquals("Impossible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case69() {
        int[] values = { 1, 3 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case70() {
        int[] values = { 1, 3, 9, 27 };
        assertEquals("Impossible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case71() {
        int[] values = { 1, 4 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case72() {
        int[] values = { 1, 2, 8 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case73() {
        int[] values = { 1, 2000 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case74() {
        int[] values = { 1, 2, 6, 24, 120 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case75() {
        int[] values = { 1, 5, 25 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case76() {
        int[] values = { 1, 3, 6, 12, 24, 48 };
        assertEquals("Impossible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case77() {
        int[] values = { 1, 2 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case78() {
        int[] values = { 1, 7, 49, 343 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case79() {
        int[] values = { 1, 2, 4 };
        assertEquals("Impossible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case80() {
        int[] values = { 1, 5, 25, 125, 625, 3125 };
        assertEquals("Impossible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case81() {
        int[] values = { 1, 2, 10 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case82() {
        int[] values = { 1, 4, 8, 64 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case83() {
        int[] values = { 1, 4, 32, 64 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case84() {
        int[] values = { 1, 10, 30, 60 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case85() {
        int[] values = { 1, 2, 6, 24, 120, 720, 5040 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case86() {
        int[] values = { 1, 20, 4000 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case87() {
        int[] values = { 1, 3, 9, 27, 81 };
        assertEquals("Impossible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case88() {
        int[] values = { 1, 4, 16 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case89() {
        int[] values = { 1, 4, 20, 60, 180, 5760 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case90() {
        int[] values = { 1, 5, 15, 75 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case91() {
        int[] values = { 1, 10, 100, 1000, 10000 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case92() {
        int[] values = { 1, 5, 10 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case93() {
        int[] values = { 1, 2, 6, 12 };
        assertEquals("Impossible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case94() {
        int[] values = { 1, 3, 9 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case95() {
        int[] values = { 1, 10, 50 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case96() {
        int[] values = { 1, 10, 100, 1000 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case97() {
        int[] values = { 1, 3, 6 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case98() {
        int[] values = { 1, 2, 6 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case99() {
        int[] values = { 1, 2, 6, 18 };
        assertEquals("Impossible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case100() {
        int[] values = { 1, 5, 15, 90 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case101() {
        int[] values = { 1, 5, 25, 125, 625 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case102() {
        int[] values = { 1 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case103() {
        int[] values = { 1, 7, 21, 105, 420, 2100, 12600 };
        assertEquals("Possible", colorfulcoinseasy.isPossible(values));
    }

    @Test
    public void case104() {
        int[] values = { 1, 2, 10, 40, 200, 1000, 4000, 20000 };
        assertEquals("Impossible", colorfulcoinseasy.isPossible(values));
    }

}
