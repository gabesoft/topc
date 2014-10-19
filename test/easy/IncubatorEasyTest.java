package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class IncubatorEasyTest {
    IncubatorEasy incubatoreasy = new IncubatorEasy();

    @Test
    public void case1() {
        String[] love = { "NY", "NN" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case2() {
        String[] love = { "NYN", "NNY", "NNN" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case3() {
        String[] love = { "NNYNN", "NNYNN", "NNNYY", "NNNNN", "NNNNN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case4() {
        String[] love = { "NNNNN", "NYNNN", "NYNYN", "YNYNN", "NNNNN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case5() {
        String[] love = { "NNNNN", "NNNNN", "NNNNN", "NNNNN", "NNNNN" };
        assertEquals(5, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case6() {
        String[] love = { "Y" };
        assertEquals(0, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case7() {
        String[] love = { "YNNNN", "NNNYN", "NNNNN", "YNNNN", "NYNNN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case8() {
        String[] love = { "NNNNNNYY", "YNNYNNNN", "NYYYYNYN", "NYNYNNNN", "NNNNNNNN", "YNYYYNNY", "NNYYNYNN", "NNNYNNNN" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case9() {
        String[] love = { "NNN", "YNN", "NNN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case10() {
        String[] love = { "NN", "NN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case11() {
        String[] love = { "NYNNNNNN", "NNNYNNNY", "NNNNNNNN", "YNNNNNYN", "NNYYYNNN", "NNNNNNNN", "YNNNYYYY", "NYNNYYNY" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case12() {
        String[] love = { "NYNNYNNNNN", "YYNNYNNNYN", "YNNNYNNYNN", "NNNNNNNNNN", "YYNYNYYYNN", "YYYYYYYNNY", "NNNNYNNNNY", "NNYYNNNYYY", "NNYNNNNNNN", "NNNNYNYNNN" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case13() {
        String[] love = { "NNNNNNN", "NNNNNNY", "NNYNNNN", "YNNYNNN", "NYNNNNN", "NNNNNNN", "NYNYNNN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case14() {
        String[] love = { "NYNNNNNNN", "YNYNNYYYN", "NNNNNNYNY", "NNNNNNNNN", "NNYNYNNNY", "YNNNNNNNN", "NNNNYNNYY", "NNNNNYNYN", "NNNNYNYNN" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case15() {
        String[] love = { "NYNYYY", "NNNNNN", "NYNNNN", "NNNNNN", "NNNYNN", "NNNNNY" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case16() {
        String[] love = { "NN", "NY" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case17() {
        String[] love = { "NN", "NN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case18() {
        String[] love = { "N" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case19() {
        String[] love = { "N" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case20() {
        String[] love = { "YNNYYYNN", "NYNNYNNN", "YNYYNNNN", "NNYNNYYN", "NYYNYNYY", "NNNNYYNN", "YNNYYYYY", "YYNNNNYY" };
        assertEquals(0, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case21() {
        String[] love = { "NNN", "NNN", "NNY" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case22() {
        String[] love = { "N" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case23() {
        String[] love = { "NNN", "YNN", "NNN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case24() {
        String[] love = { "NNN", "NNN", "NNN" };
        assertEquals(3, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case25() {
        String[] love = { "NNNNNYN", "YNNNNNN", "NNNNNYY", "YNNNNNN", "NNNNNYN", "YYNYNNN", "NNNNNNN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case26() {
        String[] love = { "NNY", "NYN", "YYN" };
        assertEquals(0, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case27() {
        String[] love = { "NNN", "YNN", "NYN" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case28() {
        String[] love = { "NNYY", "NNNN", "NYNN", "YNYY" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case29() {
        String[] love = { "NNYNYNYYNN", "YNYNNYNNYY", "NNNNNNYNNN", "NNNNNYNNNY", "YNNNYYNYNN", "NNNNNYNNNN", "NNNNYNNNNY", "NNNNYNNNNN", "NNYNNNNNNN", "NNNYNYNNNY" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case30() {
        String[] love = { "YNNY", "NNYN", "NNNN", "YNNN" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case31() {
        String[] love = { "NYNNYNN", "NNNYNNN", "NNNNNNN", "NNNYNNN", "NNNNNNN", "YNNYNNN", "NNNNYNN" };
        assertEquals(3, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case32() {
        String[] love = { "NNNN", "YNNN", "NNYN", "NYYN" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case33() {
        String[] love = { "NNNNNNN", "NNNNNNN", "NNNNNNN", "NNNNNNN", "NNYNNNN", "NNNNNNN", "NNNNNNN" };
        assertEquals(6, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case34() {
        String[] love = { "NNN", "NNN", "NNN" };
        assertEquals(3, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case35() {
        String[] love = { "NNNNNNNNNY", "NNNNNYNNNN", "NNNNNNNNYN", "YNNYNNYNNN", "NNNNNNNYNN", "NNNNNYNYNY", "NNNNNNNNNN", "NNYNNYNYNN", "NYNNNYNYNN", "NYYYNNNYNY" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case36() {
        String[] love = { "YN", "NN" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case37() {
        String[] love = { "NNNNNN", "NNNNNN", "NYNNNN", "NNNNNN", "YNNNNY", "NNNNNN" };
        assertEquals(4, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case38() {
        String[] love = { "YNNNNYN", "NNNNYNN", "NNNNYNN", "NNNNNNN", "NNNNNNN", "NNNNNNN", "NNNNNNN" };
        assertEquals(5, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case39() {
        String[] love = { "NNNNNN", "NNNNNN", "NNNNNN", "NNNNNN", "NNNNNN", "NNNYNY" };
        assertEquals(5, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case40() {
        String[] love = { "NNNNNNNYN", "NNNNNNNNN", "NNNNNNNNN", "NNNNNNNNN", "NNNNNNNNN", "NNNNNNNNN", "NNNNNNNNN", "NNNNNNNNN", "NNNYNNNNN" };
        assertEquals(7, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case41() {
        String[] love = { "NNNNNYNNYY", "NNYNNYNNNY", "NNNYNNNNNY", "NYNNNNNNYY", "YNYNNYNNYN", "NNNNNNNNNN", "YNNYNNYNNN", "NNNYNNNYYY", "NNYNNYYYNN", "NNYNNNYNNY" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case42() {
        String[] love = { "NYNNNYNNN", "NNYYNNNNN", "NNNNYNNNN", "NNNNNNNNN", "NNNNNNNNN", "NNNYYYNNN", "NNNYNNNNN", "NNNNNNNNN", "NNNNNNNNN" };
        assertEquals(4, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case43() {
        String[] love = { "YNNNNN", "NNNNNY", "NNYNNN", "YNNNNN", "NNNNYN", "NNNNNN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case44() {
        String[] love = { "NNNNNNNNNY", "NNYNYNNNNY", "YNNNYNNNNN", "NNNNNNNNNN", "NNNNNNNNNN", "NYYNNNNNYN", "NNNNNNNNNN", "NNNNNNNNNN", "NNNNNNYNYN", "NNNNNNNNNN" };
        assertEquals(5, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case45() {
        String[] love = { "NNNN", "NNNN", "NNNY", "NNNN" };
        assertEquals(3, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case46() {
        String[] love = { "NNNNNNNNNN", "NNYNNNNNNN", "NNNNNNNNNN", "NNNNNNNNNN", "NNNNNNNNNN", "NNNYNNNNNN", "NNNNNNNNNN", "NNNNNNNNNN", "NNNNNNNNNN", "NNNNNNNNYY" };
        assertEquals(7, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case47() {
        String[] love = { "N" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case48() {
        String[] love = { "YNNNNYN", "NYNNNYN", "NNNNYNY", "NYNNNNN", "NYYYNNN", "NNNNNNN", "NNNNNYN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case49() {
        String[] love = { "NY", "NN" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case50() {
        String[] love = { "NNNN", "YNNN", "NNNN", "NNNN" };
        assertEquals(3, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case51() {
        String[] love = { "NYYYYN", "NNYYYY", "NNYYYY", "YNYYNY", "YYYYYY", "YYYNYN" };
        assertEquals(0, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case52() {
        String[] love = { "NNNNNNN", "NNNNNNY", "YYNYYNY", "YNNNYNN", "NNNNNNN", "NNYNNNN", "NNYNNYN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case53() {
        String[] love = { "NNNNNN", "NNNNNN", "NNNNNN", "NNNNYN", "NNNNNN", "NNNNNN" };
        assertEquals(5, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case54() {
        String[] love = { "NYN", "YYY", "NNN" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case55() {
        String[] love = { "NN", "YN" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case56() {
        String[] love = { "YY", "NY" };
        assertEquals(0, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case57() {
        String[] love = { "NNNNNNN", "NNNNNNN", "NNNYNYN", "NNNNNNN", "YNNNNNN", "NNNNNNN", "NNNNNNN" };
        assertEquals(5, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case58() {
        String[] love = { "YNNNNNNNY", "NNYNYYNNN", "YNYNNYNNY", "NYYYYNYYY", "YNNNNNYNN", "YNYNYYNNN", "NYNYYYYYY", "NNYNNNNYY", "NYNNYNYYN" };
        assertEquals(0, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case59() {
        String[] love = { "N" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case60() {
        String[] love = { "NN", "NN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case61() {
        String[] love = { "N" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case62() {
        String[] love = { "NNN", "NNN", "NNN" };
        assertEquals(3, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case63() {
        String[] love = { "NNYNNNNY", "NYNYNNYN", "NNYNNNNN", "YNNNNNNN", "YYYNNYNN", "NNNNNNNY", "NYNNYNYN", "NYNNNNYY" };
        assertEquals(0, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case64() {
        String[] love = { "NNN", "NYN", "YNN" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case65() {
        String[] love = { "NNNNN", "NNNYN", "NNNNN", "NNNNN", "NNNNY" };
        assertEquals(3, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case66() {
        String[] love = { "NN", "NN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case67() {
        String[] love = { "NYNNNNN", "NNNNNNN", "NNNNNNN", "NNNNNNN", "NNNNNNN", "NNNNNNN", "NNNNNNN" };
        assertEquals(6, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case68() {
        String[] love = { "NNNNNNN", "YNYNNNN", "NNNNNNN", "NNNYNNY", "NNNNYNN", "NNNNYYY", "YYNYNNY" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case69() {
        String[] love = { "NNNNNNN", "NNNNNNN", "NNNNYNN", "NNNNNYN", "YNNNYNN", "NYNNNYN", "NNNNNNY" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case70() {
        String[] love = { "NNNNNNNNN", "NYNNNNYNN", "YYYYNNYYY", "YYYNNNYNN", "NNNYNNYNN", "NNYNNYNNN", "NNNNNNNNY", "NNNNYNNYY", "NNNYYNYNN" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case71() {
        String[] love = { "NNNYNNN", "NNNNNNN", "NNNYNNN", "NNNNNNY", "NNNNNNN", "NNNNNNN", "NNNNNNN" };
        assertEquals(5, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case72() {
        String[] love = { "NNNNNNN", "NNNNYNN", "NNNNNNN", "NNNNNNN", "NYNNNNN", "NNNNNNN", "NNNNNNN" };
        assertEquals(5, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case73() {
        String[] love = { "NNNNNNN", "NYNNNNN", "NNNNNNN", "NNNNNNN", "NNNNNNY", "NYNNNNN", "NNYNNNY" };
        assertEquals(4, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case74() {
        String[] love = { "N" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case75() {
        String[] love = { "NNNNY", "NNNYY", "YNYNN", "NNYNN", "YYYNY" };
        assertEquals(0, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case76() {
        String[] love = { "NYNYNNNYY", "NYNNYNNYN", "YYNNNYNNN", "YNYYYYYYN", "NNYYNNYNY", "NYYNYNNYN", "NYYNYYYYN", "YNYYNNYYY", "NNNNYYYYY" };
        assertEquals(0, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case77() {
        String[] love = { "NNNYNNNNN", "NYNNNNNYN", "YYNNNNNNY", "YNNNNNNNY", "NNNNYYYNY", "YNNYNNNNN", "YYNYNNNYN", "NYNNNNYNN", "NYYNNNNNN" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case78() {
        String[] love = { "N" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case79() {
        String[] love = { "NNY", "YNY", "NNN" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case80() {
        String[] love = { "NNNNNY", "NNNNNN", "NNNNYN", "NNNNNN", "YNNNNN", "NNNNNN" };
        assertEquals(3, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case81() {
        String[] love = { "NNYNN", "NNNNN", "NNNYY", "NNNYN", "NNNNY" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case82() {
        String[] love = { "NNNNNYNNNN", "NNNYNNNNNN", "NNNNNNNNNN", "NNNNNNNYNN", "NNNNNNNNYN", "YNNNYYNNNN", "NNNNNNNNNN", "NNNYYNNNNY", "NNNNYNNNNN", "NNYNYNNNNN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case83() {
        String[] love = { "NNNNNN", "NNNNNN", "NNNNNN", "NNNNNN", "NNNNNN", "NNNNNN" };
        assertEquals(6, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case84() {
        String[] love = { "NYYNNNN", "NNYNYYN", "YNNNNNY", "YNNNNYY", "NYNYNYN", "YYYNNYY", "NYNNNNN" };
        assertEquals(0, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case85() {
        String[] love = { "NNN", "NNN", "NNN" };
        assertEquals(3, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case86() {
        String[] love = { "NY", "NY" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case87() {
        String[] love = { "NNNNNNNN", "NNNNNNNN", "NNNNNNNN", "NNNNNNNN", "NNNNNNNN", "NNNNYNNN", "NNNNNNNN", "NNNNNNNN" };
        assertEquals(7, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case88() {
        String[] love = { "YNYNNNNN", "NNYNYNNY", "NNNNNYNN", "NNNNNNNN", "NNNNNNNN", "YNNNNNYN", "NNNNNYNN", "NNNNNNNN" };
        assertEquals(3, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case89() {
        String[] love = { "NNNNNNNNN", "NNNNNNNNN", "NNNNNNNNN", "NNNNNNNNN", "NNNNNNNNN", "NNNNNNNNN", "NNNNNNNNN", "NNNNNNNNN", "NNNNNNNNN" };
        assertEquals(9, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case90() {
        String[] love = { "NNNN", "NNNY", "NNNN", "NNNN" };
        assertEquals(3, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case91() {
        String[] love = { "YNY", "NYN", "NNN" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case92() {
        String[] love = { "NYNN", "YNNN", "NNNN", "NNNN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case93() {
        String[] love = { "NYNNYNY", "NYNYYYN", "NNNNNYY", "YYNNYNY", "NYNNYYY", "YNNNYNN", "NYNNYYY" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case94() {
        String[] love = { "NNN", "YYN", "YYY" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case95() {
        String[] love = { "NNNNNYNNNN", "NNYNNNNNNN", "NNNNNNNNNN", "NNNNNNNNYN", "YNNNYNNNNN", "NNNYNNNNNN", "NNNNNNNNNN", "NNYYNNNNNN", "NNNNNNNNNY", "NNNNNNNNNN" };
        assertEquals(4, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case96() {
        String[] love = { "NNNNYN", "NYYYYN", "NNNNNN", "NNYNNN", "NNNNNN", "NNNYNN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case97() {
        String[] love = { "NNNNY", "NNYNN", "NNNNN", "NNNYN", "NNNNN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case98() {
        String[] love = { "YNNNNYN", "YNNNNNY", "NNYNNNY", "NYNYNNN", "YNNNNNN", "NNNNNYN", "NYYYNNN" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case99() {
        String[] love = { "NNNNNNNYNN", "NYNNNNNNNN", "NNNNNNNNNN", "NYNNNNNNNN", "NNNNNNNNNN", "NNNNYNNNNY", "NNNNNNNNNN", "YNNNNNYNNN", "YNNNYNNNNN", "NNNNNNNNNN" };
        assertEquals(5, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case100() {
        String[] love = { "YYNNYYYN", "YNNNNYYY", "NYYYNNNY", "YYNYYYYN", "YYNYYYNN", "NYNYYYYY", "YNNYYNNN", "NNYNNNYY" };
        assertEquals(0, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case101() {
        String[] love = { "NYN", "YNN", "NNN" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case102() {
        String[] love = { "YNNNYNNYN", "NYYNNNNNN", "YNYYNNYNY", "NNYNNNNNN", "NYYNYNNNN", "YNNNYNNNN", "YNYNNYNNN", "NNYNNNNNN", "NNNNNYNNN" };
        assertEquals(0, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case103() {
        String[] love = { "N" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case104() {
        String[] love = { "NYNYYNYNYY", "NYYNNYYYNY", "YYNNYYNNNN", "NYNYNNYNYN", "YNYYYNYYYN", "YNYYYNNYNY", "NYNYYNNYYN", "YNNNNNNYNN", "YNYYYNYNNY", "YNYYNNYYYN" };
        assertEquals(0, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case105() {
        String[] love = { "NNNNNNN", "NNNNNNN", "NNNNNNN", "NNNNNNN", "NNNNNYN", "NNNNNNN", "NNNNNNN" };
        assertEquals(6, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case106() {
        String[] love = { "YYY", "YYN", "YYY" };
        assertEquals(0, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case107() {
        String[] love = { "NNNNNNNNNN", "NNNNNNNNNN", "NNNNNNNNNN", "NNNNNNNNNN", "NNNNNNNNNN", "NNNNNNNNNN", "NNNNNNNNNN", "NNNNNNNNNN", "NNNNNNNNNN", "NNNNNNNNNN" };
        assertEquals(10, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case108() {
        String[] love = { "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY" };
        assertEquals(0, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case109() {
        String[] love = { "NY", "NN" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case110() {
        String[] love = { "Y" };
        assertEquals(0, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case111() {
        String[] love = { "NNNNN", "NYNNN", "NYNYN", "YNYNN", "NNNNN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case112() {
        String[] love = { "NYNN", "NNNN", "NYNN", "NYYY" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case113() {
        String[] love = { "NYN", "NNY", "NYN" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case114() {
        String[] love = { "YYYYY", "NNNNY", "NNNNY", "NNNNY", "NNNNN" };
        assertEquals(3, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case115() {
        String[] love = { "NNY", "NNY", "NNN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case116() {
        String[] love = { "NYN", "NNN", "NYN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case117() {
        String[] love = { "NYYN", "NNNY", "NNNY", "NNNN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case118() {
        String[] love = { "NYNNNN", "NNYNNN", "NNYNNN", "NNNNYN", "NNNNNY", "NNNYNN" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case119() {
        String[] love = { "NY", "NY" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case120() {
        String[] love = { "YN", "YN" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case121() {
        String[] love = { "NYNN", "NNYN", "NNNY", "NNYN" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case122() {
        String[] love = { "NYNNNNNN", "NNNYNNNN", "NYNYNNNN", "NNNNYNNN", "NNNNNYNN", "NNNNNNYN", "NNNNNNNY", "YYNYYYYY" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case123() {
        String[] love = { "NNNNN", "NNNNN", "NYNYN", "YNYNN", "NNNNN" };
        assertEquals(3, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case124() {
        String[] love = { "NYN", "NYN", "NYN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case125() {
        String[] love = { "YNNNY", "NNNNY", "NNNNY", "NYNNN", "YNNNN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case126() {
        String[] love = { "YNYNYNYNNY", "YNYNYNYNNY", "YNYNYNYNNY", "YNYNYNYNNY", "YNYNYNYNNY", "YNYNYNYNNY", "YNYNYNYNNY", "YNYNYNYNNY", "YNYNYNYNNY", "YNYNYNYNNY" };
        assertEquals(5, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case127() {
        String[] love = { "NYY", "NNY", "NYN" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case128() {
        String[] love = { "NYYY", "YNYN", "YYYN", "NNNN" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case129() {
        String[] love = { "NNNNNNNNNN", "NNNNNNNNNN", "NNNNNNNNNN", "NNNNNNNNNN", "NNNNNNNNNN", "YYYYYNNNNN", "NNNNNYNNNN", "NNNNNNYNNN", "NNNNNNYNNN", "NNNNNNYNNN" };
        assertEquals(5, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case130() {
        String[] love = { "NNNNY", "NNNNN", "NNNNN", "NNNNN", "NNNNY" };
        assertEquals(4, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case131() {
        String[] love = { "YYN", "NNY", "NNY" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case132() {
        String[] love = { "NYN", "NYN", "NNN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case133() {
        String[] love = { "NYNN", "NNYN", "NNNY", "NNNY" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case134() {
        String[] love = { "NNNN", "NNNY", "NNNY", "NNYN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case135() {
        String[] love = { "NNNNN", "NNNNN", "NNNYN", "NNNNN", "NNNYN" };
        assertEquals(4, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case136() {
        String[] love = { "NNNNN", "NNNNN", "NNNNN", "NNNNN", "NNNNN" };
        assertEquals(5, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case137() {
        String[] love = { "NNN", "NYN", "NYN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case138() {
        String[] love = { "NYYNN", "NNNYN", "NNNNY", "NNNYN", "NNNNY" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case139() {
        String[] love = { "NNY", "NNY", "YNN" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case140() {
        String[] love = { "NYNYNYNYNY", "NYNYNYNYNY", "NYNYNYNYNY", "NYNYNYNYNY", "NYNYNYNYNY", "NYNYNYNYNY", "NYNYNYNYNY", "NYNYNYNYNY", "NYNYNYNYNY", "NYNYNYNYNY" };
        assertEquals(5, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case141() {
        String[] love = { "NNY", "YNN", "NYN" };
        assertEquals(0, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case142() {
        String[] love = { "NNNNNN", "NNNNNY", "NYNNNN", "NNYNNN", "NNNYNN", "NNNNNY" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case143() {
        String[] love = { "NNYN", "NNYN", "NNYN", "NNYN" };
        assertEquals(3, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case144() {
        String[] love = { "NNNNN", "NNNNN", "NNNNN", "NNYNN", "NNYNN" };
        assertEquals(4, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case145() {
        String[] love = { "NYYYN", "NNNNY", "NNNNY", "NNNNY", "NNNNN" };
        assertEquals(3, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case146() {
        String[] love = { "NNNYN", "NNYNN", "NNNNY", "NYNNN", "YNNNN" };
        assertEquals(0, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case147() {
        String[] love = { "N" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case148() {
        String[] love = { "NNNYN", "NNNYY", "NNNYY", "NNNNN", "NNNNN" };
        assertEquals(3, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case149() {
        String[] love = { "YNN", "YNN", "YNN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case150() {
        String[] love = { "YNNNN", "YNNNN", "YNNNN", "YNNNN", "YNNNN" };
        assertEquals(4, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case151() {
        String[] love = { "NNNNNYYNNN", "NNNNNNYYYY", "NNNNNNYYYY", "NNNNNNNNNY", "NNNNNNNNNY", "NNNNNNNNNN", "NNNNNNNNNN", "NNNNNNNNNN", "NNNNNNNNNN", "NNNNNNNNNN" };
        assertEquals(6, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case152() {
        String[] love = { "YYYNNNNNNN", "NNNNNNNNNN", "NNNNNNNNNN", "NNNNYNNNNN", "NNNYNNNNNN", "NNNNNNYNNN", "NNNNNNNYNN", "NNNNNNYNNN", "NYYNNNNNNN", "NNNNNNNNNN" };
        assertEquals(4, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case153() {
        String[] love = { "NYYN", "NNNY", "NNNY", "NNNY" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case154() {
        String[] love = { "NNY", "NYN", "NYN" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case155() {
        String[] love = { "NYNYNYNYNY", "NYNYNYNYNY", "NYNYNYNYNY", "YYNNNYNYNY", "YYNNNYNYNY", "YYNNNYNYNY", "YYNNNYNYNY", "YYNNNYNYNY", "YYNNNYNYNY", "YYNNNYNYNY" };
        assertEquals(4, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case156() {
        String[] love = { "NNN", "YYN", "NNN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case157() {
        String[] love = { "NYNN", "NNYN", "NNNY", "NNNN" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case158() {
        String[] love = { "NNNNNNNYNN", "NNNNNNNNNN", "NNNNNYNNNN", "NNNNNNNNNN", "NNNNNNNYNN", "NNNNNNNNNN", "NNNYNNNNNN", "NNNNNNNNNN", "NNYNNNNNNN", "NNNNNYNNNN" };
        assertEquals(6, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case159() {
        String[] love = { "NNYYNNYYYY", "NNYYNNYYYY", "NNYYNNYYYY", "NNYYNNYYYY", "NNYYNNYYYY", "NNYYNNYYYY", "NNYYNNYYYY", "NNYYNNYYYY", "NNYYNNYYYY", "NNYYNNYYYY" };
        assertEquals(4, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case160() {
        String[] love = { "NYN", "NNY", "YNN" };
        assertEquals(0, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case161() {
        String[] love = { "NNNN", "NYNN", "NYNN", "NNNN" };
        assertEquals(3, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case162() {
        String[] love = { "YNN", "NNN", "YNN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case163() {
        String[] love = { "YY", "YY" };
        assertEquals(0, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case164() {
        String[] love = { "NYNNN", "NYNNN", "NYNYN", "YNYNN", "NNNNN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case165() {
        String[] love = { "NYYNNN", "NNNNNN", "NNNNNN", "NNNNNN", "NNNYNN", "NNNYNN" };
        assertEquals(4, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case166() {
        String[] love = { "NYN", "NNY", "NNY" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case167() {
        String[] love = { "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY", "YYYYYYYYYY" };
        assertEquals(0, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case168() {
        String[] love = { "NNYN", "NNYN", "NNNY", "NNNN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case169() {
        String[] love = { "YYY", "NNN", "NNN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case170() {
        String[] love = { "NYNN", "NNYY", "NNNN", "NNNN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case171() {
        String[] love = { "NNNNNNNNNN", "NNNNNNNNNN", "NNNNNNNNNN", "NNNNNNNNNN", "NNNNNNNNNN", "NNNNNNNNNN", "NNNNNNNNNN", "NNNNNNNNNN", "NNNNNNNNNN", "NNNNNNNNNN" };
        assertEquals(10, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case172() {
        String[] love = { "NYYNN", "NNNYN", "NNNYN", "NNNNY", "NNNYN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case173() {
        String[] love = { "NYNY", "NNYN", "NNYN", "YNNN" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case174() {
        String[] love = { "NYY", "NNN", "NNN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case175() {
        String[] love = { "NNN", "NNY", "NNY" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case176() {
        String[] love = { "NN", "YN" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case177() {
        String[] love = { "NNNNY", "NYNNN", "NYNYN", "NYNNN", "NNNNN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case178() {
        String[] love = { "NYYYY", "NYYYY", "NYYYY", "NYYYY", "NYYYY" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case179() {
        String[] love = { "NYNNNN", "NNYNNN", "NNNYNN", "NNNNYN", "NNNNNY", "NNNNNN" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case180() {
        String[] love = { "NYNN", "NYNN", "NNNY", "YNYN" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case181() {
        String[] love = { "YNYNNYYNYN", "YNYNNYYNYN", "YNYNNYYNYN", "YNNYNNNYNY", "YNYNNYYNYN", "YNYNNYYNYN", "YNYNNYYNYN", "YNYNNYYNYN", "YNYNNYYNYN", "YNNYNYNNYN" };
        assertEquals(3, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case182() {
        String[] love = { "YYNNN", "NNNNN", "NNNYY", "YYNNN", "NNNNN" };
        assertEquals(2, incubatoreasy.maxMagicalGirls(love));
    }

    @Test
    public void case183() {
        String[] love = { "NYYN", "NYNN", "NYNY", "NNNY" };
        assertEquals(1, incubatoreasy.maxMagicalGirls(love));
    }

}
