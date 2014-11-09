package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class IdentifyingWoodTest {
    IdentifyingWood identifyingwood = new IdentifyingWood();

    @Test
    public void case1() {
        String s = "absdefgh";
        String t = "asdf";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case2() {
        String s = "oxoxoxox";
        String t = "ooxxoo";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case3() {
        String s = "oxoxoxox";
        String t = "xxx";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case4() {
        String s = "qwerty";
        String t = "qwerty";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case5() {
        String s = "string";
        String t = "longstring";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case6() {
        String s = "oxoxoxoxo";
        String t = "ooxxoo";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case7() {
        String s = "oxoxoxoxo";
        String t = "ooooo";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case8() {
        String s = "oxoxoxoxo";
        String t = "oooooo";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case9() {
        String s = "z";
        String t = "z";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case10() {
        String s = "z";
        String t = "x";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case11() {
        String s = "q";
        String t = "qq";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case12() {
        String s = "abcdefgh";
        String t = "hgfedcba";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case13() {
        String s = "uti";
        String t = "i";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case14() {
        String s = "uti";
        String t = "u";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case15() {
        String s = "uti";
        String t = "t";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case16() {
        String s = "uti";
        String t = "ut";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case17() {
        String s = "uti";
        String t = "ui";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case18() {
        String s = "uti";
        String t = "ti";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case19() {
        String s = "uti";
        String t = "it";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case20() {
        String s = "uti";
        String t = "ttttt";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case21() {
        String s = "isnsduupn";
        String t = "isnuupn";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case22() {
        String s = "atkown";
        String t = "ao";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case23() {
        String s = "qaytakqzp";
        String t = "qaaqp";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case24() {
        String s = "gmgajgebqv";
        String t = "gmagqv";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case25() {
        String s = "vhhegznh";
        String t = "vhhegzph";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case26() {
        String s = "qmvotko";
        String t = "qempvotko";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case27() {
        String s = "zpkpsaus";
        String t = "zs";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case28() {
        String s = "ukaovhzydz";
        String t = "uhzdz";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case29() {
        String s = "ukaovhzydz";
        String t = "ukaovhzydz";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case30() {
        String s = "ukaovhzydz";
        String t = "u";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case31() {
        String s = "ukaovhzydz";
        String t = "z";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case32() {
        String s = "ukaovhzydz";
        String t = "a";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case33() {
        String s = "ukaovhzydz";
        String t = "ukaovhyd";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case34() {
        String s = "ukaovhzydz";
        String t = "kaovhzydz";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case35() {
        String s = "aaaaaaaaaa";
        String t = "aaaaaaaaaa";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case36() {
        String s = "bbbbbbbbb";
        String t = "bbbbbbbbbb";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case37() {
        String s = "cccccccccc";
        String t = "ccccccccc";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case38() {
        String s = "dmlefgxway";
        String t = "mlgway";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case39() {
        String s = "amaafaaway";
        String t = "mfwy";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case40() {
        String s = "kgvfonbjj";
        String t = "phucvaxwrr";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case41() {
        String s = "okezehtnop";
        String t = "lnapspchuy";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case42() {
        String s = "aaba";
        String t = "baa";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case43() {
        String s = "yhspp";
        String t = "hpy";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case44() {
        String s = "zpkpzaus";
        String t = "zpzp";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case45() {
        String s = "zpkpzaus";
        String t = "zppzs";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case46() {
        String s = "zpkpzaus";
        String t = "zppzk";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case47() {
        String s = "zpkpzaus";
        String t = "zpkszaup";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case48() {
        String s = "zabycxdwev";
        String t = "zabycxdwve";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case49() {
        String s = "zabycxdwev";
        String t = "abycxdwev";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case50() {
        String s = "zabycxdwev";
        String t = "azbycxdwev";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case51() {
        String s = "a";
        String t = "b";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case52() {
        String s = "aab";
        String t = "ba";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case53() {
        String s = "abcdefgh";
        String t = "fed";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case54() {
        String s = "axb";
        String t = "ab";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case55() {
        String s = "oxoxo";
        String t = "oox";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case56() {
        String s = "qsdqsd";
        String t = "dqq";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case57() {
        String s = "bac";
        String t = "abc";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case58() {
        String s = "abcdabcd";
        String t = "accd";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case59() {
        String s = "ab";
        String t = "b";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case60() {
        String s = "badtoed";
        String t = "bbbbbbb";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case61() {
        String s = "abcd";
        String t = "w";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case62() {
        String s = "abcd";
        String t = "ab";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case63() {
        String s = "asdfghjkl";
        String t = "adgj";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case64() {
        String s = "yyxx";
        String t = "xxyy";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case65() {
        String s = "aaa";
        String t = "ab";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case66() {
        String s = "string";
        String t = "sidg";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case67() {
        String s = "tesat";
        String t = "test";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case68() {
        String s = "oxoxoxoxab";
        String t = "xxax";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case69() {
        String s = "abcdef";
        String t = "aac";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case70() {
        String s = "badc";
        String t = "bcd";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case71() {
        String s = "asdf";
        String t = "wqre";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case72() {
        String s = "abcdef";
        String t = "adce";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case73() {
        String s = "aaa";
        String t = "aa";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case74() {
        String s = "abcd";
        String t = "t";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case75() {
        String s = "abba";
        String t = "aab";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case76() {
        String s = "aab";
        String t = "aba";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case77() {
        String s = "abc";
        String t = "abc";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case78() {
        String s = "sop";
        String t = "ss";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

    @Test
    public void case79() {
        String s = "abcdefgh";
        String t = "bdfh";
        assertEquals("Yep, it's wood.", identifyingwood.check(s, t));
    }

    @Test
    public void case80() {
        String s = "oo";
        String t = "ox";
        assertEquals("Nope.", identifyingwood.check(s, t));
    }

}
