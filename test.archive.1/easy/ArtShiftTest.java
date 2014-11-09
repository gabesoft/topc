package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class ArtShiftTest {
    ArtShift artshift = new ArtShift();

    @Test
    public void case1() {
        String sequence = "BW";
        assertEquals(2, artshift.maxShifts(sequence));
    }

    @Test
    public void case2() {
        String sequence = "BBBWBBB";
        assertEquals(7, artshift.maxShifts(sequence));
    }

    @Test
    public void case3() {
        String sequence = "BWBWB";
        assertEquals(6, artshift.maxShifts(sequence));
    }

    @Test
    public void case4() {
        String sequence = "WWWWWWWWW";
        assertEquals(1, artshift.maxShifts(sequence));
    }

    @Test
    public void case5() {
        String sequence = "BBBWBBBBBWWW";
        assertEquals(60, artshift.maxShifts(sequence));
    }

    @Test
    public void case6() {
        String sequence = "BBBBBWBBBBBBWBBBBBBBWBBBBBBBBB";
        assertEquals(990, artshift.maxShifts(sequence));
    }

    @Test
    public void case7() {
        String sequence = "BWBWBWBWBWBWBWBWBWBWBWBWBWBWBW";
        assertEquals(4620, artshift.maxShifts(sequence));
    }

    @Test
    public void case8() {
        String sequence = "W";
        assertEquals(1, artshift.maxShifts(sequence));
    }

    @Test
    public void case9() {
        String sequence = "BBBBBBBBBBB";
        assertEquals(1, artshift.maxShifts(sequence));
    }

    @Test
    public void case10() {
        String sequence = "WWWWWWWWWBBWB";
        assertEquals(60, artshift.maxShifts(sequence));
    }

    @Test
    public void case11() {
        String sequence = "B";
        assertEquals(1, artshift.maxShifts(sequence));
    }

    @Test
    public void case12() {
        String sequence = "BB";
        assertEquals(1, artshift.maxShifts(sequence));
    }

    @Test
    public void case13() {
        String sequence = "BW";
        assertEquals(2, artshift.maxShifts(sequence));
    }

    @Test
    public void case14() {
        String sequence = "BBB";
        assertEquals(1, artshift.maxShifts(sequence));
    }

    @Test
    public void case15() {
        String sequence = "WWB";
        assertEquals(3, artshift.maxShifts(sequence));
    }

    @Test
    public void case16() {
        String sequence = "BBBB";
        assertEquals(1, artshift.maxShifts(sequence));
    }

    @Test
    public void case17() {
        String sequence = "BWWW";
        assertEquals(4, artshift.maxShifts(sequence));
    }

    @Test
    public void case18() {
        String sequence = "WWBB";
        assertEquals(4, artshift.maxShifts(sequence));
    }

    @Test
    public void case19() {
        String sequence = "WWWWW";
        assertEquals(1, artshift.maxShifts(sequence));
    }

    @Test
    public void case20() {
        String sequence = "WWBWW";
        assertEquals(5, artshift.maxShifts(sequence));
    }

    @Test
    public void case21() {
        String sequence = "WBBWW";
        assertEquals(6, artshift.maxShifts(sequence));
    }

    @Test
    public void case22() {
        String sequence = "BBBBBB";
        assertEquals(1, artshift.maxShifts(sequence));
    }

    @Test
    public void case23() {
        String sequence = "BBBBBW";
        assertEquals(6, artshift.maxShifts(sequence));
    }

    @Test
    public void case24() {
        String sequence = "WBWBBB";
        assertEquals(6, artshift.maxShifts(sequence));
    }

    @Test
    public void case25() {
        String sequence = "BBWWWB";
        assertEquals(6, artshift.maxShifts(sequence));
    }

    @Test
    public void case26() {
        String sequence = "WWWWWWW";
        assertEquals(1, artshift.maxShifts(sequence));
    }

    @Test
    public void case27() {
        String sequence = "WWWWBWW";
        assertEquals(7, artshift.maxShifts(sequence));
    }

    @Test
    public void case28() {
        String sequence = "WWWWBBW";
        assertEquals(12, artshift.maxShifts(sequence));
    }

    @Test
    public void case29() {
        String sequence = "BWBBWWW";
        assertEquals(12, artshift.maxShifts(sequence));
    }

    @Test
    public void case30() {
        String sequence = "WWWWWWWW";
        assertEquals(1, artshift.maxShifts(sequence));
    }

    @Test
    public void case31() {
        String sequence = "WBWWWWWW";
        assertEquals(8, artshift.maxShifts(sequence));
    }

    @Test
    public void case32() {
        String sequence = "BBBBBWBW";
        assertEquals(15, artshift.maxShifts(sequence));
    }

    @Test
    public void case33() {
        String sequence = "BWBWBBWB";
        assertEquals(15, artshift.maxShifts(sequence));
    }

    @Test
    public void case34() {
        String sequence = "BBBBWWWW";
        assertEquals(15, artshift.maxShifts(sequence));
    }

    @Test
    public void case35() {
        String sequence = "WWWWWWWWW";
        assertEquals(1, artshift.maxShifts(sequence));
    }

    @Test
    public void case36() {
        String sequence = "WWWWWWBWW";
        assertEquals(9, artshift.maxShifts(sequence));
    }

    @Test
    public void case37() {
        String sequence = "WWBBBBBBB";
        assertEquals(20, artshift.maxShifts(sequence));
    }

    @Test
    public void case38() {
        String sequence = "BBBWBWBWB";
        assertEquals(20, artshift.maxShifts(sequence));
    }

    @Test
    public void case39() {
        String sequence = "WBWWBWBBW";
        assertEquals(20, artshift.maxShifts(sequence));
    }

    @Test
    public void case40() {
        String sequence = "WWWWWWWWWW";
        assertEquals(1, artshift.maxShifts(sequence));
    }

    @Test
    public void case41() {
        String sequence = "BBBBBBWBBB";
        assertEquals(10, artshift.maxShifts(sequence));
    }

    @Test
    public void case42() {
        String sequence = "WWWWBWWWBW";
        assertEquals(21, artshift.maxShifts(sequence));
    }

    @Test
    public void case43() {
        String sequence = "BBWWBBBBWB";
        assertEquals(30, artshift.maxShifts(sequence));
    }

    @Test
    public void case44() {
        String sequence = "WBWBWBBWBB";
        assertEquals(30, artshift.maxShifts(sequence));
    }

    @Test
    public void case45() {
        String sequence = "WWBBWWBWBB";
        assertEquals(30, artshift.maxShifts(sequence));
    }

    @Test
    public void case46() {
        String sequence = "WWWWWWWWWWW";
        assertEquals(1, artshift.maxShifts(sequence));
    }

    @Test
    public void case47() {
        String sequence = "BBBBBWBBBBB";
        assertEquals(11, artshift.maxShifts(sequence));
    }

    @Test
    public void case48() {
        String sequence = "BBBBBBBWBBW";
        assertEquals(30, artshift.maxShifts(sequence));
    }

    @Test
    public void case49() {
        String sequence = "BBBWBBBWBWB";
        assertEquals(30, artshift.maxShifts(sequence));
    }

    @Test
    public void case50() {
        String sequence = "BWWWBBWBWWW";
        assertEquals(30, artshift.maxShifts(sequence));
    }

    @Test
    public void case51() {
        String sequence = "BWBBWBWBWWB";
        assertEquals(30, artshift.maxShifts(sequence));
    }

    @Test
    public void case52() {
        String sequence = "WWWWWWWWWWWW";
        assertEquals(1, artshift.maxShifts(sequence));
    }

    @Test
    public void case53() {
        String sequence = "BBBBWBBBBBBB";
        assertEquals(12, artshift.maxShifts(sequence));
    }

    @Test
    public void case54() {
        String sequence = "WBBBBBBBWBBB";
        assertEquals(35, artshift.maxShifts(sequence));
    }

    @Test
    public void case55() {
        String sequence = "BWBWWWWWWBWW";
        assertEquals(60, artshift.maxShifts(sequence));
    }

    @Test
    public void case56() {
        String sequence = "WBBBWBBBBBWW";
        assertEquals(60, artshift.maxShifts(sequence));
    }

    @Test
    public void case57() {
        String sequence = "BBWBWBBWBWWB";
        assertEquals(60, artshift.maxShifts(sequence));
    }

    @Test
    public void case58() {
        String sequence = "BBBWBWWWWBBW";
        assertEquals(60, artshift.maxShifts(sequence));
    }

    @Test
    public void case59() {
        String sequence = "WWWWWWWWWWWWW";
        assertEquals(1, artshift.maxShifts(sequence));
    }

    @Test
    public void case60() {
        String sequence = "WWWWWWBWWWWWW";
        assertEquals(13, artshift.maxShifts(sequence));
    }

    @Test
    public void case61() {
        String sequence = "WWWWWWBWBWWWW";
        assertEquals(42, artshift.maxShifts(sequence));
    }

    @Test
    public void case62() {
        String sequence = "WBBBBBBBBWWBB";
        assertEquals(60, artshift.maxShifts(sequence));
    }

    @Test
    public void case63() {
        String sequence = "WBBBBWBWWBBBB";
        assertEquals(60, artshift.maxShifts(sequence));
    }

    @Test
    public void case64() {
        String sequence = "WBBBWBBWBWBWB";
        assertEquals(60, artshift.maxShifts(sequence));
    }

    @Test
    public void case65() {
        String sequence = "BBBWWBBWWBWWB";
        assertEquals(60, artshift.maxShifts(sequence));
    }

    @Test
    public void case66() {
        String sequence = "BBBBBBBBBBBBBB";
        assertEquals(1, artshift.maxShifts(sequence));
    }

    @Test
    public void case67() {
        String sequence = "BBBBBBBBBWBBBB";
        assertEquals(14, artshift.maxShifts(sequence));
    }

    @Test
    public void case68() {
        String sequence = "WWWWWWWWBWBWWW";
        assertEquals(45, artshift.maxShifts(sequence));
    }

    @Test
    public void case69() {
        String sequence = "WWWBWWBWWWBWWW";
        assertEquals(84, artshift.maxShifts(sequence));
    }

    @Test
    public void case70() {
        String sequence = "WBWWBWBWWWBWWW";
        assertEquals(84, artshift.maxShifts(sequence));
    }

    @Test
    public void case71() {
        String sequence = "WWBWBBBWBWBBBB";
        assertEquals(84, artshift.maxShifts(sequence));
    }

    @Test
    public void case72() {
        String sequence = "BWWBWWWBWBWWBB";
        assertEquals(84, artshift.maxShifts(sequence));
    }

    @Test
    public void case73() {
        String sequence = "WWWBBBWBWBWBWB";
        assertEquals(84, artshift.maxShifts(sequence));
    }

    @Test
    public void case74() {
        String sequence = "BBBBBBBBBBBBBBB";
        assertEquals(1, artshift.maxShifts(sequence));
    }

    @Test
    public void case75() {
        String sequence = "WBWWWWWWWWWWWWW";
        assertEquals(15, artshift.maxShifts(sequence));
    }

    @Test
    public void case76() {
        String sequence = "WWWWWWWWWWWWBWB";
        assertEquals(56, artshift.maxShifts(sequence));
    }

    @Test
    public void case77() {
        String sequence = "BBBBBBBBWWBBBWB";
        assertEquals(105, artshift.maxShifts(sequence));
    }

    @Test
    public void case78() {
        String sequence = "WBBWWWWWWWBWWBW";
        assertEquals(105, artshift.maxShifts(sequence));
    }

    @Test
    public void case79() {
        String sequence = "BBBWWBWBBBBBWWB";
        assertEquals(105, artshift.maxShifts(sequence));
    }

    @Test
    public void case80() {
        String sequence = "WBBWWBBBWBBBBWW";
        assertEquals(105, artshift.maxShifts(sequence));
    }

    @Test
    public void case81() {
        String sequence = "BBWBWWWBBWWBBBW";
        assertEquals(105, artshift.maxShifts(sequence));
    }

    @Test
    public void case82() {
        String sequence = "BBBBBBBBBBBBBBBBBBBBBBBBB";
        assertEquals(1, artshift.maxShifts(sequence));
    }

    @Test
    public void case83() {
        String sequence = "WWWWWWBWWWWWWWWWWWWWWWWWW";
        assertEquals(25, artshift.maxShifts(sequence));
    }

    @Test
    public void case84() {
        String sequence = "BBBBBBBBBBBBBBBBBBWBBBWBB";
        assertEquals(156, artshift.maxShifts(sequence));
    }

    @Test
    public void case85() {
        String sequence = "WWWBWWWWWWWWWWWWWWWWWWBBW";
        assertEquals(504, artshift.maxShifts(sequence));
    }

    @Test
    public void case86() {
        String sequence = "BBWWWBBBBBBWBBBBBBBBBBBBB";
        assertEquals(1260, artshift.maxShifts(sequence));
    }

    @Test
    public void case87() {
        String sequence = "BBBBBBBBBBBBWWBWWWBBBBBBB";
        assertEquals(1260, artshift.maxShifts(sequence));
    }

    @Test
    public void case88() {
        String sequence = "BWWWBBBBBBBBBBWWBBBBWBBBB";
        assertEquals(1260, artshift.maxShifts(sequence));
    }

    @Test
    public void case89() {
        String sequence = "BWBWBWBBBWBBBWBWBBWBBBBBB";
        assertEquals(1260, artshift.maxShifts(sequence));
    }

    @Test
    public void case90() {
        String sequence = "WBWWBWWWWWWWWWBBWWWBWBBWB";
        assertEquals(1260, artshift.maxShifts(sequence));
    }

    @Test
    public void case91() {
        String sequence = "WBBWBWWBBBWWWWBBBBBBBWBBB";
        assertEquals(1260, artshift.maxShifts(sequence));
    }

    @Test
    public void case92() {
        String sequence = "BWBBBBWBBWBWBBBWWBBWWWBBW";
        assertEquals(1260, artshift.maxShifts(sequence));
    }

    @Test
    public void case93() {
        String sequence = "WBWBBWBBBWBWWWWWBBWBBWWWW";
        assertEquals(1260, artshift.maxShifts(sequence));
    }

    @Test
    public void case94() {
        String sequence = "WBBWWWWWBBWWBBWWBBBBWBBWB";
        assertEquals(1260, artshift.maxShifts(sequence));
    }

    @Test
    public void case95() {
        String sequence = "WWWWWWWWWWWWWWWWWWWWWWWWWW";
        assertEquals(1, artshift.maxShifts(sequence));
    }

    @Test
    public void case96() {
        String sequence = "WBBBBBBBBBBBBBBBBBBBBBBBBB";
        assertEquals(26, artshift.maxShifts(sequence));
    }

    @Test
    public void case97() {
        String sequence = "BBBBBBBBWBBBBBBBBBBBBBBBWB";
        assertEquals(165, artshift.maxShifts(sequence));
    }

    @Test
    public void case98() {
        String sequence = "WWWWWWWWWWWBWWWWWWBWWWWWBW";
        assertEquals(630, artshift.maxShifts(sequence));
    }

    @Test
    public void case99() {
        String sequence = "BBWBBBWBBBBBBBBBWBBBBBBBBW";
        assertEquals(1260, artshift.maxShifts(sequence));
    }

    @Test
    public void case100() {
        String sequence = "BWBBBBWBBBWBBBWBBBWBBBBBBB";
        assertEquals(1260, artshift.maxShifts(sequence));
    }

    @Test
    public void case101() {
        String sequence = "WWWBWBWWBBWWWWWWWBWWBWWWWW";
        assertEquals(1260, artshift.maxShifts(sequence));
    }

    @Test
    public void case102() {
        String sequence = "WBBBWWWWWBWWBWWWWWBWWWWWBW";
        assertEquals(1260, artshift.maxShifts(sequence));
    }

    @Test
    public void case103() {
        String sequence = "WWWWWBWWWWWBWWWBWWBWWBBWBB";
        assertEquals(1260, artshift.maxShifts(sequence));
    }

    @Test
    public void case104() {
        String sequence = "WBBWWBWWWWWBWWWWWBBWWBWBBW";
        assertEquals(1260, artshift.maxShifts(sequence));
    }

    @Test
    public void case105() {
        String sequence = "WBBBWBWWBBWWBWBWWBWWWWWWWB";
        assertEquals(1260, artshift.maxShifts(sequence));
    }

    @Test
    public void case106() {
        String sequence = "BBWWWBBBWBWBWWBWWWWBBWBWWW";
        assertEquals(1260, artshift.maxShifts(sequence));
    }

    @Test
    public void case107() {
        String sequence = "BWWBWBWBBWBBWWBBWWBWBWBBWB";
        assertEquals(1260, artshift.maxShifts(sequence));
    }

    @Test
    public void case108() {
        String sequence = "WWBBWWWWBWBWBBBBWWBBBWWBWB";
        assertEquals(1260, artshift.maxShifts(sequence));
    }

    @Test
    public void case109() {
        String sequence = "BBBBBBBBBBBBBBBBBBBBBBBBBBB";
        assertEquals(1, artshift.maxShifts(sequence));
    }

    @Test
    public void case110() {
        String sequence = "BBBBBBBBBBBBBWBBBBBBBBBBBBB";
        assertEquals(27, artshift.maxShifts(sequence));
    }

    @Test
    public void case111() {
        String sequence = "BBBBBWBBBBBBBBWBBBBBBBBBBBB";
        assertEquals(182, artshift.maxShifts(sequence));
    }

    @Test
    public void case112() {
        String sequence = "WBBBWBBBBBBBBBBBBWBBBBBBBBB";
        assertEquals(693, artshift.maxShifts(sequence));
    }

    @Test
    public void case113() {
        String sequence = "BWBBBBBBBBBWBBBWBBBBWBBBBBB";
        assertEquals(1540, artshift.maxShifts(sequence));
    }

    @Test
    public void case114() {
        String sequence = "WWWWWBWBWWBWWWWWWWWWWWBWWBW";
        assertEquals(1540, artshift.maxShifts(sequence));
    }

    @Test
    public void case115() {
        String sequence = "WWBBWWWWWBWWWWWWWWWBWWWWBWB";
        assertEquals(1540, artshift.maxShifts(sequence));
    }

    @Test
    public void case116() {
        String sequence = "BBWBBBBWBBBWBWBBBBBBBBBWWBW";
        assertEquals(1540, artshift.maxShifts(sequence));
    }

    @Test
    public void case117() {
        String sequence = "WBBWBWBBBBBWWBBBWBBWBBWBBBB";
        assertEquals(1540, artshift.maxShifts(sequence));
    }

    @Test
    public void case118() {
        String sequence = "WBWWWWWBWWBWWBBBBWBWWWWWWWB";
        assertEquals(1540, artshift.maxShifts(sequence));
    }

    @Test
    public void case119() {
        String sequence = "BBBWWBBWBBBWBBWWWBWBWBBBBWB";
        assertEquals(1540, artshift.maxShifts(sequence));
    }

    @Test
    public void case120() {
        String sequence = "BBWBWWWWWWBWWBWBWWWWBWWBBBB";
        assertEquals(1540, artshift.maxShifts(sequence));
    }

    @Test
    public void case121() {
        String sequence = "WWWBWWWBBBBWWWBWWBWBBBBWWBW";
        assertEquals(1540, artshift.maxShifts(sequence));
    }

    @Test
    public void case122() {
        String sequence = "WWBBBBWWBBWWBWBBWBWBBWWWWBW";
        assertEquals(1540, artshift.maxShifts(sequence));
    }

    @Test
    public void case123() {
        String sequence = "WWWWWWWWWWWWWWWWWWWWWWWWWWWW";
        assertEquals(1, artshift.maxShifts(sequence));
    }

    @Test
    public void case124() {
        String sequence = "WWWWWWWWWWWWWWWWWWWWWWBWWWWW";
        assertEquals(28, artshift.maxShifts(sequence));
    }

    @Test
    public void case125() {
        String sequence = "BBBBBBBBBBBWBBBBBBBBBBBBBBBW";
        assertEquals(195, artshift.maxShifts(sequence));
    }

    @Test
    public void case126() {
        String sequence = "WWWWWBWWWWWWWWBWWWWWWWWBWWWW";
        assertEquals(792, artshift.maxShifts(sequence));
    }

    @Test
    public void case127() {
        String sequence = "WWWWBWBWWBBWWWWWWWWWWWWWWWWW";
        assertEquals(1540, artshift.maxShifts(sequence));
    }

    @Test
    public void case128() {
        String sequence = "BWBBWBBBBBBBBBBBBBBBWBBWBBBW";
        assertEquals(2310, artshift.maxShifts(sequence));
    }

    @Test
    public void case129() {
        String sequence = "WWWWWWWWBWWWWWBBBWWWBWWWBWWW";
        assertEquals(2310, artshift.maxShifts(sequence));
    }

    @Test
    public void case130() {
        String sequence = "WBWBWBBWWWBBBBBBBBBBBBWBBBBB";
        assertEquals(2310, artshift.maxShifts(sequence));
    }

    @Test
    public void case131() {
        String sequence = "WWWWWBWWWWWWWWWBWBWWBWWBBWBB";
        assertEquals(2310, artshift.maxShifts(sequence));
    }

    @Test
    public void case132() {
        String sequence = "WBWBBWBBWWWBWWWWWWWBWWWBWWBW";
        assertEquals(2310, artshift.maxShifts(sequence));
    }

    @Test
    public void case133() {
        String sequence = "WWBWWBWWWWWWWWWWBWWBBWBWBBBB";
        assertEquals(2310, artshift.maxShifts(sequence));
    }

    @Test
    public void case134() {
        String sequence = "BWBBBWWWWWBBBBWBBBBBWWBBBWBW";
        assertEquals(2310, artshift.maxShifts(sequence));
    }

    @Test
    public void case135() {
        String sequence = "WWBWBWBWBBBWWWWWWWWWBBBWBWBB";
        assertEquals(2310, artshift.maxShifts(sequence));
    }

    @Test
    public void case136() {
        String sequence = "WBWBWWWBBBBWBBBBWBWWWWWBWWWB";
        assertEquals(2310, artshift.maxShifts(sequence));
    }

    @Test
    public void case137() {
        String sequence = "BBBBWWBBWWWWWWWWBBBBBBWBWBWW";
        assertEquals(2310, artshift.maxShifts(sequence));
    }

    @Test
    public void case138() {
        String sequence = "WWWWWWWWWWWWWWWWWWWWWWWWWWWWW";
        assertEquals(1, artshift.maxShifts(sequence));
    }

    @Test
    public void case139() {
        String sequence = "WWWWWWWWWWWWWWWWWWWWWWWWWWBWW";
        assertEquals(29, artshift.maxShifts(sequence));
    }

    @Test
    public void case140() {
        String sequence = "WWWWWWWWWBWWWWWWWWWWWWWWWWWBW";
        assertEquals(210, artshift.maxShifts(sequence));
    }

    @Test
    public void case141() {
        String sequence = "WWWBWWWWWWWWWWWWWWWBWWWWWWWBW";
        assertEquals(819, artshift.maxShifts(sequence));
    }

    @Test
    public void case142() {
        String sequence = "WWWWWWWWWBWBBWWWWWWWWWWBWWWWW";
        assertEquals(2520, artshift.maxShifts(sequence));
    }

    @Test
    public void case143() {
        String sequence = "WWWWWWBWWWWBWWWBWBWWWWWWWWWWB";
        assertEquals(2520, artshift.maxShifts(sequence));
    }

    @Test
    public void case144() {
        String sequence = "WBWWWWWWWBWBWBWWBWWWWBWWWWWWW";
        assertEquals(2520, artshift.maxShifts(sequence));
    }

    @Test
    public void case145() {
        String sequence = "WBBBBBBBBBBBWBBBBWBWBWBWBBWBB";
        assertEquals(2520, artshift.maxShifts(sequence));
    }

    @Test
    public void case146() {
        String sequence = "BBBBBBBBWWWBBBBBBBBBWWBWBBBWW";
        assertEquals(2520, artshift.maxShifts(sequence));
    }

    @Test
    public void case147() {
        String sequence = "BWWWBWWWWWBBWWBBWBWWBWWWWWWWB";
        assertEquals(2520, artshift.maxShifts(sequence));
    }

    @Test
    public void case148() {
        String sequence = "BBBWBBBBBBWBBWBBBWBBWBWWWWBBW";
        assertEquals(2520, artshift.maxShifts(sequence));
    }

    @Test
    public void case149() {
        String sequence = "BBWBBWBWBBWBWBBWBBWWBBWWBBBBW";
        assertEquals(2520, artshift.maxShifts(sequence));
    }

    @Test
    public void case150() {
        String sequence = "WBWBBBBWWBBBBBBWWBWWWWBBBWBWB";
        assertEquals(2520, artshift.maxShifts(sequence));
    }

    @Test
    public void case151() {
        String sequence = "WBWBBBBBBWWBBWBBWBWWWBBWBBWWW";
        assertEquals(2520, artshift.maxShifts(sequence));
    }

    @Test
    public void case152() {
        String sequence = "BBBWWWWBWBBWWWBWWBBBWBBWBWBWB";
        assertEquals(2520, artshift.maxShifts(sequence));
    }

    @Test
    public void case153() {
        String sequence = "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBB";
        assertEquals(1, artshift.maxShifts(sequence));
    }

    @Test
    public void case154() {
        String sequence = "WWWWWWWWWWWWWWWWWWWWWWBWWWWWWW";
        assertEquals(30, artshift.maxShifts(sequence));
    }

    @Test
    public void case155() {
        String sequence = "BBBBBBBBBBWBBBBBBBBBBBBBWBBBBB";
        assertEquals(221, artshift.maxShifts(sequence));
    }

    @Test
    public void case156() {
        String sequence = "BBBBBWBWBBWBBBBBBBBBBBBBBBBBBB";
        assertEquals(990, artshift.maxShifts(sequence));
    }

    @Test
    public void case157() {
        String sequence = "BBBBBBWBBBBBBBBWWBBBBBBBBWBBBB";
        assertEquals(2520, artshift.maxShifts(sequence));
    }

    @Test
    public void case158() {
        String sequence = "WBBBBWBBBBBBWWBBBBBBBBBWBBBBBB";
        assertEquals(4620, artshift.maxShifts(sequence));
    }

    @Test
    public void case159() {
        String sequence = "BBBBBWBBWBBBBBBWBBBWWBBBBBBBWB";
        assertEquals(4620, artshift.maxShifts(sequence));
    }

    @Test
    public void case160() {
        String sequence = "BWBWWBWWWBWBWWWBWWWWWWWWBWWWWW";
        assertEquals(4620, artshift.maxShifts(sequence));
    }

    @Test
    public void case161() {
        String sequence = "BBWBBBBBBBBBWBBBWBBBBBWWBWBBWW";
        assertEquals(4620, artshift.maxShifts(sequence));
    }

    @Test
    public void case162() {
        String sequence = "BWBBBBBBWBBWBBBBWBBWBBBWBWBWBW";
        assertEquals(4620, artshift.maxShifts(sequence));
    }

    @Test
    public void case163() {
        String sequence = "WBWWWWWBBWWWWBBBWWWWBBWWWBBWWW";
        assertEquals(4620, artshift.maxShifts(sequence));
    }

    @Test
    public void case164() {
        String sequence = "BBBBBWBWBBWBBBBWBBWWWWBWBBBWBW";
        assertEquals(4620, artshift.maxShifts(sequence));
    }

    @Test
    public void case165() {
        String sequence = "BBBBBWWBWBWBWWWWBWWBBWWWWWBWWW";
        assertEquals(4620, artshift.maxShifts(sequence));
    }

    @Test
    public void case166() {
        String sequence = "BWBWBBBBWWWBWBBWWWWWBWWWWBWWBB";
        assertEquals(4620, artshift.maxShifts(sequence));
    }

    @Test
    public void case167() {
        String sequence = "WWBBBWBBWWWBBBWBWWWBWBBWWBWWBW";
        assertEquals(4620, artshift.maxShifts(sequence));
    }

    @Test
    public void case168() {
        String sequence = "BBBBBBBBWWBWBWBWWWBWBWWWBWBWWW";
        assertEquals(4620, artshift.maxShifts(sequence));
    }

    @Test
    public void case169() {
        String sequence = "BBBBBBBBBBBBBBBBB";
        assertEquals(1, artshift.maxShifts(sequence));
    }

    @Test
    public void case170() {
        String sequence = "BBBBBBBBBBBWBBBBB";
        assertEquals(17, artshift.maxShifts(sequence));
    }

    @Test
    public void case171() {
        String sequence = "BWBBBBBBWBBBBBBBB";
        assertEquals(72, artshift.maxShifts(sequence));
    }

    @Test
    public void case172() {
        String sequence = "BWWWWWWWBWWBWWWWW";
        assertEquals(140, artshift.maxShifts(sequence));
    }

    @Test
    public void case173() {
        String sequence = "WWWBWWWWWBWWWBWWB";
        assertEquals(210, artshift.maxShifts(sequence));
    }

    @Test
    public void case174() {
        String sequence = "WWWWBWWWWWBBBWWWB";
        assertEquals(210, artshift.maxShifts(sequence));
    }

    @Test
    public void case175() {
        String sequence = "WBWBBBWBBBWBBWBBW";
        assertEquals(210, artshift.maxShifts(sequence));
    }

    @Test
    public void case176() {
        String sequence = "WBBBBBWWBBBWBWWWB";
        assertEquals(210, artshift.maxShifts(sequence));
    }

    @Test
    public void case177() {
        String sequence = "BWBBWBWBWWWWBWBWB";
        assertEquals(210, artshift.maxShifts(sequence));
    }

    @Test
    public void case178() {
        String sequence = "BBBBBBBBBBBBBBBWWWWWWWWWW";
        assertEquals(1260, artshift.maxShifts(sequence));
    }

    @Test
    public void case179() {
        String sequence = "WWWWWWWWWWWWBBBBBBBBBBBBBBBBB";
        assertEquals(2520, artshift.maxShifts(sequence));
    }

    @Test
    public void case180() {
        String sequence = "BBBBBBBBBBBBBBBBBBBBBBBBBBBBWW";
        assertEquals(221, artshift.maxShifts(sequence));
    }

    @Test
    public void case181() {
        String sequence = "WWWWWB";
        assertEquals(6, artshift.maxShifts(sequence));
    }

    @Test
    public void case182() {
        String sequence = "WWWWWWWWWWWWWWWWWWWWWWWWWWBBBB";
        assertEquals(2520, artshift.maxShifts(sequence));
    }

    @Test
    public void case183() {
        String sequence = "WWWWWWWWWWWWWWWBBBBBBBBBBBBBBB";
        assertEquals(4620, artshift.maxShifts(sequence));
    }

    @Test
    public void case184() {
        String sequence = "WWWWWWWWWWWWWWWWWWWWWWWWWWBWWW";
        assertEquals(30, artshift.maxShifts(sequence));
    }

    @Test
    public void case185() {
        String sequence = "WBWBWBWBWBWBWBWBWBWBWBWBWBWBBB";
        assertEquals(4620, artshift.maxShifts(sequence));
    }

    @Test
    public void case186() {
        String sequence = "BBBBBBBBBBBBBBBBBBBBBBBBBBBBW";
        assertEquals(29, artshift.maxShifts(sequence));
    }

    @Test
    public void case187() {
        String sequence = "BBWWWWWWWWWWW";
        assertEquals(42, artshift.maxShifts(sequence));
    }

    @Test
    public void case188() {
        String sequence = "WWBBBBBBBBBBBBBBBBBBBBBBBBBBBB";
        assertEquals(221, artshift.maxShifts(sequence));
    }

    @Test
    public void case189() {
        String sequence = "WWWWWBBBBB";
        assertEquals(30, artshift.maxShifts(sequence));
    }

    @Test
    public void case190() {
        String sequence = "BBBBBBBBBBBBBBBWWWWWWWWWWWWWWW";
        assertEquals(4620, artshift.maxShifts(sequence));
    }

    @Test
    public void case191() {
        String sequence = "BBBBBBBBBBBBBBBBBBBBBBBBBBBWW";
        assertEquals(210, artshift.maxShifts(sequence));
    }

    @Test
    public void case192() {
        String sequence = "WWBBBBBBBBBBBBBBBB";
        assertEquals(77, artshift.maxShifts(sequence));
    }

    @Test
    public void case193() {
        String sequence = "BBWW";
        assertEquals(4, artshift.maxShifts(sequence));
    }

    @Test
    public void case194() {
        String sequence = "WBWBBBBBBBWBWWWBBBWBBBWBWBW";
        assertEquals(1540, artshift.maxShifts(sequence));
    }

    @Test
    public void case195() {
        String sequence = "BBBBBBBBBBBBWWWWWWWWWWWWWWWWW";
        assertEquals(2520, artshift.maxShifts(sequence));
    }

    @Test
    public void case196() {
        String sequence = "BBBBBWWWWW";
        assertEquals(30, artshift.maxShifts(sequence));
    }

    @Test
    public void case197() {
        String sequence = "BBBBBBBBBBBWWWWWWWWWWWWW";
        assertEquals(840, artshift.maxShifts(sequence));
    }

    @Test
    public void case198() {
        String sequence = "WBWBWBWBWBWBWBWBWBWBWBWBWBWBWB";
        assertEquals(4620, artshift.maxShifts(sequence));
    }

    @Test
    public void case199() {
        String sequence = "WWWWWWWWWWWWWWWWWWWWWWWWWWWBB";
        assertEquals(210, artshift.maxShifts(sequence));
    }

    @Test
    public void case200() {
        String sequence = "BWBWBWBWBWBWBWBWBWBWBWBWBWBWBB";
        assertEquals(4620, artshift.maxShifts(sequence));
    }

    @Test
    public void case201() {
        String sequence = "BBBBBWBBBBBW";
        assertEquals(35, artshift.maxShifts(sequence));
    }

    @Test
    public void case202() {
        String sequence = "WWBBBBBBBBBBB";
        assertEquals(42, artshift.maxShifts(sequence));
    }

    @Test
    public void case203() {
        String sequence = "BWBW";
        assertEquals(4, artshift.maxShifts(sequence));
    }

    @Test
    public void case204() {
        String sequence = "WBWB";
        assertEquals(4, artshift.maxShifts(sequence));
    }

    @Test
    public void case205() {
        String sequence = "WWWWWWWWWWWWWWWWBBBBBBBBBBBBB";
        assertEquals(2520, artshift.maxShifts(sequence));
    }

    @Test
    public void case206() {
        String sequence = "WWWBBBBBBBBBBBBBBBBBBBBBBBBBBB";
        assertEquals(990, artshift.maxShifts(sequence));
    }

    @Test
    public void case207() {
        String sequence = "WWWWWWWBBBBW";
        assertEquals(60, artshift.maxShifts(sequence));
    }

    @Test
    public void case208() {
        String sequence = "BBWWWWWWWWWWWWWWWWWWWWWWWWWWW";
        assertEquals(210, artshift.maxShifts(sequence));
    }

    @Test
    public void case209() {
        String sequence = "BBBBBBBBBBBBBBBBBBBBBBBBBBWWWW";
        assertEquals(2520, artshift.maxShifts(sequence));
    }

    @Test
    public void case210() {
        String sequence = "WWBBBBBBBBB";
        assertEquals(30, artshift.maxShifts(sequence));
    }

    @Test
    public void case211() {
        String sequence = "WWWWWWBBBB";
        assertEquals(30, artshift.maxShifts(sequence));
    }

    @Test
    public void case212() {
        String sequence = "BBBBBBBBBBBBBBBBBWWWWWWWWWWWW";
        assertEquals(2520, artshift.maxShifts(sequence));
    }

    @Test
    public void case213() {
        String sequence = "BBBBBBBBBBBBBBBWWWWWWWWWWWWWW";
        assertEquals(2520, artshift.maxShifts(sequence));
    }

    @Test
    public void case214() {
        String sequence = "WWWWWWWWWWWWWBBBBBBBBBBBBBBBB";
        assertEquals(2520, artshift.maxShifts(sequence));
    }

}
