package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class Fragile2Test {
    Fragile2 fragile2 = new Fragile2();

    @Test
    public void case1() {
        String[] graph = { "NYNN", "YNYN", "NYNY", "NNYN" };
        assertEquals(3, fragile2.countPairs(graph));
    }

    @Test
    public void case2() {
        String[] graph = { "NNN", "NNN", "NNN" };
        assertEquals(0, fragile2.countPairs(graph));
    }

    @Test
    public void case3() {
        String[] graph = { "NYNYNNYYNN", "YNNNYNYYNN", "NNNNYNNNYN", "YNNNYYNNNN", "NYYYNNNNYN", "NNNYNNNNYN", "YYNNNNNNNN", "YYNNNNNNYN", "NNYNYYNYNY", "NNNNNNNNYN" };
        assertEquals(9, fragile2.countPairs(graph));
    }

    @Test
    public void case4() {
        String[] graph = { "NNNYNNYNNNNNNNYYNNNY", "NNNNNNNNYNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNN", "YNNNNNNNNNYNNNNNNNNN", "NNNNNNNYNNNNNYNNNNYN", "NNNNNNNNNNNNNNNNYNNY", "YNNNNNNNNNNNNYYYNYNN", "NNNNYNNNNNNNNYYNNNNN", "NYNNNNNNNYNNNNNNNNNN", "NNNNNNNNYNNNYNNNNNYN", "NNNYNNNNNNNNNNYNNNNN", "NNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNYNNNNNNNYNN", "NNNNYNYYNNNNNNNNNNNN", "YNNNNNYYNNYNNNNNNNNN", "YNNNNNYNNNNNNNNNYNNN", "NNNNNYNNNNNNNNNYNYNN", "NNNNNNYNNNNNYNNNYNNN", "NNNNYNNNNYNNNNNNNNNN", "YNNNNYNNNNNNNNNNNNNN" };
        assertEquals(42, fragile2.countPairs(graph));
    }

    @Test
    public void case5() {
        String[] graph = { "NYNNNN", "YNYNNN", "NYNNNN", "NNNNYN", "NNNYNY", "NNNNYN" };
        assertEquals(5, fragile2.countPairs(graph));
    }

    @Test
    public void case6() {
        String[] graph = { "NNY", "NNN", "YNN" };
        assertEquals(0, fragile2.countPairs(graph));
    }

    @Test
    public void case7() {
        String[] graph = { "NYN", "YNY", "NYN" };
        assertEquals(0, fragile2.countPairs(graph));
    }

    @Test
    public void case8() {
        String[] graph = { "NYY", "YNY", "YYN" };
        assertEquals(0, fragile2.countPairs(graph));
    }

    @Test
    public void case9() {
        String[] graph = { "NYYY", "YNYN", "YYNY", "YNYN" };
        assertEquals(1, fragile2.countPairs(graph));
    }

    @Test
    public void case10() {
        String[] graph = { "NNNY", "NNNN", "NNNN", "YNNN" };
        assertEquals(0, fragile2.countPairs(graph));
    }

    @Test
    public void case11() {
        String[] graph = { "NNNN", "NNNN", "NNNN", "NNNN" };
        assertEquals(0, fragile2.countPairs(graph));
    }

    @Test
    public void case12() {
        String[] graph = { "NNNYN", "NNNNN", "NNNYN", "YNYNN", "NNNNN" };
        assertEquals(0, fragile2.countPairs(graph));
    }

    @Test
    public void case13() {
        String[] graph = { "NNNNN", "NNNNN", "NNNNN", "NNNNN", "NNNNN" };
        assertEquals(0, fragile2.countPairs(graph));
    }

    @Test
    public void case14() {
        String[] graph = { "NNNNN", "NNNNN", "NNNYN", "NNYNN", "NNNNN" };
        assertEquals(0, fragile2.countPairs(graph));
    }

    @Test
    public void case15() {
        String[] graph = { "NNNNYN", "NNYYNN", "NYNYNY", "NYYNYN", "YNNYNN", "NNYNNN" };
        assertEquals(10, fragile2.countPairs(graph));
    }

    @Test
    public void case16() {
        String[] graph = { "NNNNNN", "NNNNYN", "NNNNNN", "NNNNNN", "NYNNNY", "NNNNYN" };
        assertEquals(0, fragile2.countPairs(graph));
    }

    @Test
    public void case17() {
        String[] graph = { "NNNYYY", "NNYYYY", "NYNYYN", "YYYNYY", "YYYYNY", "YYNYYN" };
        assertEquals(0, fragile2.countPairs(graph));
    }

    @Test
    public void case18() {
        String[] graph = { "NYNYYYY", "YNYNNYY", "NYNYNYY", "YNYNYYY", "YNNYNYN", "YYYYYNN", "YYYYNNN" };
        assertEquals(0, fragile2.countPairs(graph));
    }

    @Test
    public void case19() {
        String[] graph = { "NNNYNNN", "NNNYNNN", "NNNYYYN", "YYYNYYN", "NNYYNNY", "NNYYNNY", "NNNNYYN" };
        assertEquals(7, fragile2.countPairs(graph));
    }

    @Test
    public void case20() {
        String[] graph = { "NNNYYYY", "NNYNYYY", "NYNNYYY", "YNNNYYY", "YYYYNYY", "YYYYYNN", "YYYYYNN" };
        assertEquals(0, fragile2.countPairs(graph));
    }

    @Test
    public void case21() {
        String[] graph = { "NNNNNNNN", "NNNNNNNN", "NNNNNNNN", "NNNNNNNN", "NNNNNNNN", "NNNNNNNN", "NNNNNNNN", "NNNNNNNN" };
        assertEquals(0, fragile2.countPairs(graph));
    }

    @Test
    public void case22() {
        String[] graph = { "NNNNNYNY", "NNNYNNNN", "NNNNNNNN", "NYNNNNNN", "NNNNNNNN", "YNNNNNNN", "NNNNNNNN", "YNNNNNNN" };
        assertEquals(2, fragile2.countPairs(graph));
    }

    @Test
    public void case23() {
        String[] graph = { "NYYNYNYN", "YNYYYYNN", "YYNYNYYY", "NYYNNYYY", "YYNNNYNN", "NYYYYNYY", "YNYYNYNN", "NNYYNYNN" };
        assertEquals(0, fragile2.countPairs(graph));
    }

    @Test
    public void case24() {
        String[] graph = { "NNYNNNYNN", "NNNNNNNYN", "YNNNNNYYN", "NNNNNNNYY", "NNNNNNYYY", "NNNNNNNNN", "YNYNYNNNN", "NYYYYNNNN", "NNNYYNNNN" };
        assertEquals(9, fragile2.countPairs(graph));
    }

    @Test
    public void case25() {
        String[] graph = { "NYNNYNNYN", "YNYYYNNYN", "NYNYYYYNN", "NYYNNYYYY", "YYYNNYYNN", "NNYYYNYYY", "NNYYYYNYN", "YYNYNYYNN", "NNNYNYNNN" };
        assertEquals(1, fragile2.countPairs(graph));
    }

    @Test
    public void case26() {
        String[] graph = { "NYNNYNNNN", "YNNNYYNNN", "NNNNNNNNN", "NNNNNNNNY", "YYNNNNNNN", "NYNNNNNNY", "NNNNNNNNN", "NNNNNNNNN", "NNNYNYNNN" };
        assertEquals(11, fragile2.countPairs(graph));
    }

    @Test
    public void case27() {
        String[] graph = { "NYYNNYYNYY", "YNYNNNYYYY", "YYNNYNYYYY", "NNNNYYNYNY", "NNYYNYYNYN", "YNNYYNNNYN", "YYYNYNNYYY", "NYYYNNYNNN", "YYYNYYYNNN", "YYYYNNYNNN" };
        assertEquals(0, fragile2.countPairs(graph));
    }

    @Test
    public void case28() {
        String[] graph = { "NNNNYNNNNN", "NNNNNNNNNY", "NNNYYNNNNN", "NNYNNYNNNN", "YNYNNNNNNN", "NNNYNNNNNN", "NNNNNNNNNN", "NNNNNNNNNN", "NNNNNNNNNN", "NYNNNNNNNN" };
        assertEquals(13, fragile2.countPairs(graph));
    }

    @Test
    public void case29() {
        String[] graph = { "NNYNNNNNNN", "NNNNNNNYNN", "YNNNNNNNNN", "NNNNNNYNNN", "NNNNNNNNNN", "NNNNNNNNYN", "NNNYNNNYNN", "NYNNNNYNNN", "NNNNNYNNNN", "NNNNNNNNNN" };
        assertEquals(11, fragile2.countPairs(graph));
    }

    @Test
    public void case30() {
        String[] graph = { "NNNNNNNYYNN", "NNNNNNNNNNN", "NNNNNYYYNYN", "NNNNNYNNNNN", "NNNNNYNNNYY", "NNYYYNNNNNN", "NNYNNNNNNYN", "YNYNNNNNNYN", "YNNNNNNNNYN", "NNYNYNYYYNY", "NNNNYNNNNYN" };
        assertEquals(14, fragile2.countPairs(graph));
    }

    @Test
    public void case31() {
        String[] graph = { "NNNNYNNNNNN", "NNNNNNNNNNN", "NNNNNNNNNNN", "NNNNNNNNNNN", "YNNNNNNNNNN", "NNNNNNNNNNN", "NNNNNNNNNNN", "NNNNNNNNNNN", "NNNNNNNNNNN", "NNNNNNNNNNN", "NNNNNNNNNNN" };
        assertEquals(0, fragile2.countPairs(graph));
    }

    @Test
    public void case32() {
        String[] graph = { "NNNNYNNNNNY", "NNYNYNNYYNN", "NYNNNYNYNYN", "NNNNNNNNNYY", "YYNNNYNNNNN", "NNYNYNNNNYY", "NNNNNNNNNYN", "NYYNNNNNNNN", "NYNNNNNNNNN", "NNYYNYYNNNY", "YNNYNYNNNYN" };
        assertEquals(19, fragile2.countPairs(graph));
    }

    @Test
    public void case33() {
        String[] graph = { "NNYYNNYYYYYY", "NNNYNNNNYYYN", "YNNNYYNYYNYY", "YYNNYNNYNNYN", "NNYYNNNYYNNY", "NNYNNNNYYYYN", "YNNNNNNNYYYN", "YNYYYYNNYNYY", "YYYNYYYYNYYN", "YYNNNYYNYNYY", "YYYYNYYYYYNN", "YNYNYNNYNYNN" };
        assertEquals(0, fragile2.countPairs(graph));
    }

    @Test
    public void case34() {
        String[] graph = { "NNNYYNNYYYYY", "NNYNNYYYNYNN", "NYNNNNNNYYNN", "YNNNNNNNYNYN", "YNNNNYNNNNNN", "NYNNYNNYNNNY", "NYNNNNNNNYYN", "YYNNNYNNYNNN", "YNYYNNNYNYNN", "YYYNNNYNYNNY", "YNNYNNYNNNNY", "YNNNNYNNNYYN" };
        assertEquals(1, fragile2.countPairs(graph));
    }

    @Test
    public void case35() {
        String[] graph = { "NNNNNNNNNYNN", "NNNNNNNNNNNN", "NNNNNNNNNNNN", "NNNNNNNNNNNN", "NNNNNNNNNNNN", "NNNNNNNNNNNN", "NNNNNNNNNNNN", "NNNNNNNNNNNN", "NNNNNNNNNNNN", "YNNNNNNNNNNN", "NNNNNNNNNNNN", "NNNNNNNNNNNN" };
        assertEquals(0, fragile2.countPairs(graph));
    }

    @Test
    public void case36() {
        String[] graph = { "NYYYYYYYYYYYY", "YNYYYYYYYYYYY", "YYNYYYYYNYYYY", "YYYNYYYNYYYYY", "YYYYNYYYYYYNY", "YYYYYNNYYYYYY", "YYYYYNNYNNYYY", "YYYNYYYNYYYYY", "YYNYYYNYNYYYY", "YYYYYYNYYNYYY", "YYYYYYYYYYNYY", "YYYYNYYYYYYNY", "YYYYYYYYYYYYN" };
        assertEquals(0, fragile2.countPairs(graph));
    }

    @Test
    public void case37() {
        String[] graph = { "NNYYYYYYNYYYY", "NNYNYYYYNYNYY", "YYNYYYYYYYYYY", "YNYNYNYNYYYYY", "YYYYNYNNYYYYY", "YYYNYNYYYYYYY", "YYYYNYNYNYYNY", "YYYNNYYNYYYYY", "NNYYYYNYNYYNY", "YYYYYYYYYNYNY", "YNYYYYYYYYNYN", "YYYYYYNYNNYNY", "YYYYYYYYYYNYN" };
        assertEquals(0, fragile2.countPairs(graph));
    }

    @Test
    public void case38() {
        String[] graph = { "NNYYYNYNYNYNN", "NNYYYNNNNYYNY", "YYNNNYNNNNNYY", "YYNNYYNYNNNNY", "YYNYNNYNYYNYN", "NNYYNNYNYNYNN", "YNNNYYNNYNNNY", "NNNYNNNNNNYYY", "YNNNYYYNNYNYN", "NYNNYNNNYNYNN", "YYNNNYNYNYNNN", "NNYNYNNYYNNNY", "NYYYNNYYNNNYN" };
        assertEquals(0, fragile2.countPairs(graph));
    }

    @Test
    public void case39() {
        String[] graph = { "NYNNYNNYNNNYNY", "YNNNNNNNYYNNNN", "NNNNNYNNYNNNYN", "NNNNYNYNNNNYNN", "YNNYNYNYYNNNNN", "NNYNYNNNNNNYNN", "NNNYNNNNNNNYNN", "YNNNYNNNNNNNNN", "NYYNYNNNNNNNNN", "NYNNNNNNNNNNNN", "NNNNNNNNNNNNNN", "YNNYNYYNNNNNNN", "NNYNNNNNNNNNNN", "YNNNNNNNNNNNNN" };
        assertEquals(33, fragile2.countPairs(graph));
    }

    @Test
    public void case40() {
        String[] graph = { "NYYYYYYNYYYYNY", "YNNYYYYYYNYYYY", "YNNNNNYNYYYYYY", "YYNNYYNNYNYYNY", "YYNYNYNYYYNNYY", "YYNYYNYYNYNYYN", "YYYNNYNNYNYYYY", "NYNNYYNNNYYNYN", "YYYYYNYNNNYNYN", "YNYNYYNYNNYNYY", "YYYYNNYYYYNYYN", "YYYYNYYNNNYNYY", "NYYNYYYYYYYYNY", "YYYYYNYNNYNYYN" };
        assertEquals(0, fragile2.countPairs(graph));
    }

    @Test
    public void case41() {
        String[] graph = { "NNNNNNNNNNNNNN", "NNNNNNNNNNNYNN", "NNNNNNNNNNNNNN", "NNNNNNYNNNNNNN", "NNNNNNNNNNNNNN", "NNNNNNNNNNNNNN", "NNNYNNNNYNNNNY", "NNNNNNNNNNNNNN", "NNNNNNYNNNYNYN", "NNNNNNNNNNNNNN", "NNNNNNNNYNNNNN", "NYNNNNNNNNNNNN", "NNNNNNNNYNNNNN", "NNNNNNYNNNNNNN" };
        assertEquals(25, fragile2.countPairs(graph));
    }

    @Test
    public void case42() {
        String[] graph = { "NNNYYYNNNNNNNYN", "NNNNNYNNNNYNYNN", "NNNNNNNYNNNNNNN", "YNNNYNNNNNNNNYN", "YNNYNYNNNNNNNNY", "YYNNYNNNNNNNNNN", "NNNNNNNNNNNNNNN", "NNYNNNNNNNNNYNN", "NNNNNNNNNNNNYNN", "NNNNNNNNNNYNYYN", "NYNNNNNNNYNNNNY", "NNNNNNNNNNNNNNN", "NYNNNNNYYYNNNNN", "YNNYNNNNNYNNNNN", "NNNNYNNNNNYNNNN" };
        assertEquals(26, fragile2.countPairs(graph));
    }

    @Test
    public void case43() {
        String[] graph = { "NNNYNNYNNNNNNNN", "NNNNNYYNNYNNYNN", "NNNNNNNNNNNNNNN", "YNNNNNNNYNYNNYN", "NNNNNNYNYYNYYYN", "NYNNNNYNNNYYNNN", "YYNNYYNNNNNNNNN", "NNNNNNNNNYNNNNY", "NNNYYNNNNNNNNNY", "NYNNYNNYNNNYNNN", "NNNYNYNNNNNNYNN", "NNNNYYNNNYNNYNN", "NYNNYNNNNNYYNNN", "NNNYYNNNNNNNNNN", "NNNNNNNYYNNNNNN" };
        assertEquals(5, fragile2.countPairs(graph));
    }

    @Test
    public void case44() {
        String[] graph = { "NNYYYNNYYYYYNNN", "NNNYNYYNYYYYYYN", "YNNYYNNYNNYNNNY", "YYYNYNNYYYNYYYN", "YNYYNYNNNYYNYYY", "NYNNYNNYYYYNNYN", "NYNNNNNNYNNNNYY", "YNYYNYNNNNNYYYN", "YYNYNYYNNNYNNNY", "YYNYYYNNNNNYNYN", "YYYNYYNNYNNYNYY", "YYNYNNNYNYYNYNN", "NYNYYNNYNNNYNYN", "NYNYYYYYNYYNYNN", "NNYNYNYNYNYNNNN" };
        assertEquals(0, fragile2.countPairs(graph));
    }

    @Test
    public void case45() {
        String[] graph = { "NYYYNNNYNNYYNNYN", "YNNNNNNYYNNNNNNY", "YNNNNNNNYYNNNNYN", "YNNNNNYYNYNYNNNY", "NNNNNNNNNNNNNNNY", "NNNNNNYNYNNNNNYY", "NNNYNYNNYYNNNYNY", "YYNYNNNNNNNYNYYN", "NYYNNYYNNNNYNYYY", "NNYYNNYNNNYNYYYN", "YNNNNNNNNYNNNNNY", "YNNYNNNYYNNNYNNN", "NNNNNNNNNYNYNNYN", "NNNNNNYYYYNNNNNN", "YNYNNYNYYYNNYNNN", "NYNYYYYNYNYNNNNN" };
        assertEquals(14, fragile2.countPairs(graph));
    }

    @Test
    public void case46() {
        String[] graph = { "NNNNNNNNNNNNNNNN", "NNNNNYNNNNNYNNNY", "NNNNNNNNNNNNNNNN", "NNNNNNNNYNNYNYYN", "NNNNNNNNNNNNNNNN", "NYNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNN", "NNNNNNNNNNNYNNNN", "NNNYNNNNNNNYNYYN", "NNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNY", "NYNYNNNYYNNNNNNN", "NNNNNNNNNNNNNNNN", "NNNYNNNNYNNNNNNN", "NNNYNNNNYNNNNNNN", "NYNNNNNNNNYNNNNN" };
        assertEquals(36, fragile2.countPairs(graph));
    }

    @Test
    public void case47() {
        String[] graph = { "NNNNNNNNNYNNNNNN", "NNNNNNNNYNNNYNNN", "NNNNNNNNNYNNNNNY", "NNNNNNNNNNNNYNNY", "NNNNNNNNYNNNNNNN", "NNNNNNNNNYNNNYNN", "NNNNNNNNNNNNNNNY", "NNNNNNNNNNNNNNNN", "NYNNYNNNNYNNNNNY", "YNYNNYNNYNNNNNNN", "NNNNNNNNNNNNYYNY", "NNNNNNNNNNNNNNNN", "NYNYNNNNNNYNNNNN", "NNNNNYNNNNYNNNNN", "NNNNNNNNNNNNNNNN", "NNYYNNYNYNYNNNNN" };
        assertEquals(31, fragile2.countPairs(graph));
    }

    @Test
    public void case48() {
        String[] graph = { "NNNYNNNNYNYNNNYNN", "NNNNNNNNYYNNNNYNN", "NNNYNNNNNNNNNNNNN", "YNYNNNNNNNNNNNYNN", "NNNNNNNNNNNNNNNNY", "NNNNNNNNNYNNNYNNN", "NNNNNNNNNYNNNYNNY", "NNNNNNNNNYNNNNNNY", "YYNNNNNNNNNNNYYNN", "NYNNNYYYNNNNNNNNN", "YNNNNNNNNNNYNNNNN", "NNNNNNNNNNYNNNNNN", "NNNNNNNNNNNNNNNNN", "NNNNNYYNYNNNNNNNN", "YYNYNNNNYNNNNNNNN", "NNNNNNNNNNNNNNNNN", "NNNNYNYYNNNNNNNNN" };
        assertEquals(54, fragile2.countPairs(graph));
    }

    @Test
    public void case49() {
        String[] graph = { "NNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNN", "NNNNNNNNNYNNNNNNN", "NNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNN", "NNNNNNNNNYNNNNNNN", "NNNNNNNNNNNNNNNNN", "NNNYNNNYNNNNNNNNN", "NNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNY", "NNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNYNN" };
        assertEquals(2, fragile2.countPairs(graph));
    }

    @Test
    public void case50() {
        String[] graph = { "NNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNN", "NNNNNNYNNNYNNNNNN", "NNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNN", "NNNNNNNYNNNNNNNNN", "NNYNNNNNNNNNNNNNN", "NNNNNYNNNNNNNNNNN", "NNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNN", "NNYNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNN" };
        assertEquals(2, fragile2.countPairs(graph));
    }

    @Test
    public void case51() {
        String[] graph = { "NNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNN", "NNNNNNNYNNNNNNNNNN", "NNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNN", "NNYNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNN" };
        assertEquals(0, fragile2.countPairs(graph));
    }

    @Test
    public void case52() {
        String[] graph = { "NNNNNYNNNNNNNNNNYN", "NNNNNNNNNNNNYNNNNN", "NNNNNYNYYNYNNNNNNN", "NNNNYNNNNNYNNNNNNN", "NNNYNNNYYNNNNNNNNY", "YNYNNNNNNNNNNYNYNN", "NNNNNNNNNYNNNNNNNN", "NNYNYNNNNNNNNYNNNN", "NNYNYNNNNNNNNNYNNN", "NNNNNNYNNNYNYNYNYN", "NNYYNNNNNYNYNNNNNN", "NNNNNNNNNNYNNNNNNY", "NYNNNNNNNYNNNNNNNN", "NNNNNYNYNNNNNNNNNN", "NNNNNNNNYYNNNNNNNN", "NNNNNYNNNNNNNNNNNN", "YNNNNNNNNYNNNNNNNN", "NNNNYNNNNNNYNNNNNN" };
        assertEquals(49, fragile2.countPairs(graph));
    }

    @Test
    public void case53() {
        String[] graph = { "NYYYYYYYYYYYYYYYNY", "YNNYYYYYYYYYYYYYYY", "YNNYYYYYYYYYYYYNYY", "YYYNYYYYYYYYYYYYYY", "YYYYNYYYYYYYNYYYYY", "YYYYYNYYYYYYYYYYYY", "YYYYYYNYYYYYYYYYYY", "YYYYYYYNYYYYYYNYYY", "YYYYYYYYNYYYYYYYYY", "YYYYYYYYYNYYYNYYYY", "YYYYYYYYYYNYYYYYYY", "YYYYYYYYYYYNYYYYYY", "YYYYNYYYYYYYNYYNYY", "YYYYYYYYYNYYYNYYYY", "YYYYYYYNYYYYYYNYYY", "YYNYYYYYYYYYNYYNYY", "NYYYYYYYYYYYYYYYNY", "YYYYYYYYYYYYYYYYYN" };
        assertEquals(0, fragile2.countPairs(graph));
    }

    @Test
    public void case54() {
        String[] graph = { "NNNNNNYNNNNNNYNNNNN", "NNNNNNNNYNYYYNNNNYN", "NNNNNNNYNNNNYNNNNNN", "NNNNNNNNNNNYNNNNYNN", "NNNNNNYYNNNNYNYYNNY", "NNNNNNYNYNNNYNYNNNN", "YNNNYYNNNNNYNNNYNNN", "NNYNYNNNNNNNNYNNNNN", "NYNNNYNNNNNNYNNNNNY", "NNNNNNNNNNNNYNYYNNN", "NYNNNNNNNNNYNYNNNNN", "NYNYNNYNNNYNNNNNNNN", "NYYNYYNNYYNNNNNNYNN", "YNNNNNNYNNYNNNYNNNN", "NNNNYYNNNYNNNYNNNNN", "NNNNYNYNNYNNNNNNNNN", "NNNYNNNNNNNNYNNNNNY", "NYNNNNNNNNNNNNNNNNN", "NNNNYNNNYNNNNNNNYNN" };
        assertEquals(20, fragile2.countPairs(graph));
    }

    @Test
    public void case55() {
        String[] graph = { "NNYNNNYNNNNNNYYNNNN", "NNNNNYNNNNYNNNNYYNN", "YNNNNNNNNNNNNNNNNYN", "NNNNNNNYYNNNYYNNNNN", "NNNNNYNNNNNNNNNNNNN", "NYNNYNYNNNNYYNNNNYN", "YNNNNYNNNNNNNYNNNNY", "NNNYNNNNNYNNNNYNNNN", "NNNYNNNNNNNNNNNNYNY", "NNNNNNNYNNYNNNNNNNN", "NYNNNNNNNYNNYNNNNNN", "NNNNNYNNNNNNNYNYNNY", "NNNYNYNNNNYNNNNNNNY", "YNNYNNYNNNNYNNNYYNN", "YNNNNNNYNNNNNNNNNNN", "NYNNNNNNNNNYNYNNNNN", "NYNNNNNNYNNNNYNNNNN", "NNYNNYNNNNNNNNNNNNN", "NNNNNNYNYNNYYNNNNNN" };
        assertEquals(20, fragile2.countPairs(graph));
    }

    @Test
    public void case56() {
        String[] graph = { "NNYNNYNYNNNNNNNYNYN", "NNNNNNNNNNYYYNNNNNN", "YNNNYNNNNNNNNNNYNNN", "NNNNNYNNNNNNNNNNNNN", "NNYNNNNNNNNYNNYNYNN", "YNNYNNNNNNYYNNNNNNY", "NNNNNNNNYYNNNYYNNYN", "YNNNNNNNNYNYNNNNNNN", "NNNNNNYNNNNNNNNNNNY", "NNNNNNYYNNYYYYYNNNN", "NYNNNYNNNYNYNYYNNNN", "NYNNYYNYNYYNNNNNNYN", "NYNNNNNNNYNNNNYNYYN", "NNNNNNYNNYYNNNNYNNY", "NNNNYNYNNYYNYNNNYNN", "YNYNNNNNNNNNNYNNNNY", "NNNNYNNNNNNNYNYNNNN", "YNNNNNYNNNNYYNNNNNN", "NNNNNYNNYNNNNYNYNNN" };
        assertEquals(18, fragile2.countPairs(graph));
    }

    @Test
    public void case57() {
        String[] graph = { "NYNYYNNNNNNNYNYYNNNN", "YNNNNNYYNNNYNYNNYNNN", "NNNNNYNNNNNNNNNNNNNN", "YNNNYNNYYNNNNNNNNYNN", "YNNYNNNNNNNNYNNNNNNN", "NNYNNNNNNNNNNYNNNNNN", "NYNNNNNNNNNNYYYNYNNY", "NYNYNNNNNYNYNNNNNNNN", "NNNYNNNNNNYNNNNNNYNN", "NNNNNNNYNNNNNNYNYYNN", "NNNNNNNNYNNNNYYNNNNY", "NYNNNNNYNNNNNYNNYNNN", "YNNNYNYNNNNNNNNNNYNY", "NYNNNYYNNNYYNNNNNYNN", "YNNNNNYNNYYNNNNNNNNY", "YNNNNNNNNNNNNNNNNNNN", "NYNNNNYNNYNYNNNNNNNN", "NNNYNNNNYYNNYYNNNNNN", "NNNNNNNNNNNNNNNNNNNN", "NNNNNNYNNNYNYNYNNNNN" };
        assertEquals(49, fragile2.countPairs(graph));
    }

    @Test
    public void case58() {
        String[] graph = { "NYNNNYNYYYYNYNYNYNYN", "YNYNYYYNNYNYYYNYYYYY", "NYNYNYNYNNYYYYYYYYYY", "NNYNYNNNYYNYYYYNYYYY", "NYNYNNYNNYNNNYYNYYYY", "YYYNNNYYNYNNYNYNNNYY", "NYNNYYNNYYNYNYNYYNYN", "YNYNNYNNNNYYYYYYYYNY", "YNNYNNYNNYNNNYNYNYYY", "YYNYYYYNYNYNNNYYYNYY", "YNYNNNNYNYNNNNYNNNYN", "NYYYNNYYNNNNNNYNYNYY", "YYYYNYNYNNNNNYNNYYYY", "NYYYYNYYYNNNYNYNYYYN", "YNYYYYNYNYYYNYNYNNNY", "NYYNNNYYYYNNNNYNNNYY", "YYYYYNYYNYNYYYNNNNYN", "NYYYYNNYYNNNYYNNNNNY", "YYYYYYYNYYYYYYNYYNNY", "NYYYYYNYYYNYYNYYNYYN" };
        assertEquals(0, fragile2.countPairs(graph));
    }

    @Test
    public void case59() {
        String[] graph = { "NYYYYYYYYYYYYYYYYYYY", "YNYYYYYYYYYYYYYYYYYY", "YYNYYYYYYYYYYYYYNYYY", "YYYNYYYYNYYNYYNYNYYY", "YYYYNYYYYYNYYYYYNYYY", "YYYYYNYYYYYYYYYYYYYY", "YYYYYYNYYYYYYYYYYNYY", "YYYYYYYNYYYNYYYYYYYY", "YYYNYYYYNYYYYYYYYYYY", "YYYYYYYYYNYYNYYYNYYY", "YYYYNYYYYYNYYYYYYYYY", "YYYNYYYNYYYNYYYYYYYY", "YYYYYYYYYNYYNNYYYYYY", "YYYYYYYYYYYYNNYYYYYY", "YYYNYYYYYYYYYYNYYYYY", "YYYYYYYYYYYYYYYNYNYY", "YYNNNYYYYNYYYYYYNYYY", "YYYYYYNYYYYYYYYNYNYN", "YYYYYYYYYYYYYYYYYYNY", "YYYYYYYYYYYYYYYYYNYN" };
        assertEquals(0, fragile2.countPairs(graph));
    }

    @Test
    public void case60() {
        String[] graph = { "NNNNNNNYNNNNNNNNNNYN", "NNNNNNNNNNYNNNNNYNNN", "NNNNNNYNNNNNNNNNNNNY", "NNNNNNNNYNNNYNNNNNNN", "NNNNNNNNNNNYNNNNNNNN", "NNNNNNNNNNNNNNYYNNNN", "NNYNNNNNNNNNNYNNNNNN", "YNNNNNNNNNNNNYNNNNNN", "NNNYNNNNNYNNNNNNNNNN", "NNNNNNNNYNNNNNNNYNNN", "NYNNNNNNNNNNNNNYNNNN", "NNNNYNNNNNNNNNNNNYNN", "NNNYNNNNNNNNNNNNNNNY", "NNNNNNYYNNNNNNNNNNNN", "NNNNNYNNNNNNNNNNNNNN", "NNNNNYNNNNYNNNNNNNNN", "NYNNNNNNNYNNNNNNNNNN", "NNNNNNNNNNNYNNNNNNYN", "YNNNNNNNNNNNNNNNNYNN", "NNYNNNNNNNNNYNNNNNNN" };
        assertEquals(187, fragile2.countPairs(graph));
    }

    @Test
    public void case61() {
        String[] graph = { "NYNYNNYYNN", "YNNNYNYYNN", "NNNNYNNNYN", "YNNNYYNNNN", "NYYYNNNNYN", "NNNYNNNNYN", "YYNNNNNNNN", "YYNNNNNNYN", "NNYNYYNYNY", "NNNNNNNNYN" };
        assertEquals(9, fragile2.countPairs(graph));
    }

    @Test
    public void case62() {
        String[] graph = { "NNNYNNYNNNNNNNYYNNNY", "NNNNNNNNYNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNN", "YNNNNNNNNNYNNNNNNNNN", "NNNNNNNYNNNNNYNNNNYN", "NNNNNNNNNNNNNNNNYNNY", "YNNNNNNNNNNNNYYYNYNN", "NNNNYNNNNNNNNYYNNNNN", "NYNNNNNNNYNNNNNNNNNN", "NNNNNNNNYNNNYNNNNNYN", "NNNYNNNNNNNNNNYNNNNN", "NNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNYNNNNNNNYNN", "NNNNYNYYNNNNNNNNNNNN", "YNNNNNYYNNYNNNNNNNNN", "YNNNNNYNNNNNNNNNYNNN", "NNNNNYNNNNNNNNNYNYNN", "NNNNNNYNNNNNYNNNYNNN", "NNNNYNNNNYNNNNNNNNNN", "YNNNNYNNNNNNNNNNNNNN" };
        assertEquals(42, fragile2.countPairs(graph));
    }

    @Test
    public void case63() {
        String[] graph = { "NNNN", "NNYN", "NYNY", "NNYN" };
        assertEquals(0, fragile2.countPairs(graph));
    }

    @Test
    public void case64() {
        String[] graph = { "NYNN", "YNYN", "NYNY", "NNYN" };
        assertEquals(3, fragile2.countPairs(graph));
    }

    @Test
    public void case65() {
        String[] graph = { "NYY", "YNY", "YYN" };
        assertEquals(0, fragile2.countPairs(graph));
    }

    @Test
    public void case66() {
        String[] graph = { "NYYY", "YNYY", "YYNY", "YYYN" };
        assertEquals(0, fragile2.countPairs(graph));
    }

}
