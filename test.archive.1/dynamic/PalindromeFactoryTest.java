package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class PalindromeFactoryTest {
    PalindromeFactory palindromefactory = new PalindromeFactory();

    @Test
    public void case1() {
        String initial = "abba";
        assertEquals(0, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case2() {
        String initial = "dabba";
        assertEquals(1, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case3() {
        String initial = "babacvabba";
        assertEquals(2, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case4() {
        String initial = "abc";
        assertEquals(1, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case5() {
        String initial = "acxcba";
        assertEquals(1, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case6() {
        String initial = "abcacbd";
        assertEquals(1, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case7() {
        String initial = "aaacaacbcabaaaabbabacacabbabacaacabbabcbabbaaacbaa";
        assertEquals(8, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case8() {
        String initial = "idbifahfhalihlcfbdlabldkdefajaafdlkdbaigbbbeklfcbi";
        assertEquals(18, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case9() {
        String initial = "gwucaltwaaliqgyamiubwmtyragjbyytuiacdeorlaabbkaynr";
        assertEquals(18, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case10() {
        String initial = "jicaejceicfhhejaebab";
        assertEquals(7, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case11() {
        String initial = "topcoder";
        assertEquals(4, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case12() {
        String initial = "jajaaadafgfhajjjceah";
        assertEquals(6, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case13() {
        String initial = "accbabb";
        assertEquals(3, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case14() {
        String initial = "abcgefdgfecdba";
        assertEquals(3, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case15() {
        String initial = "zyz";
        assertEquals(0, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case16() {
        String initial = "xyz";
        assertEquals(1, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case17() {
        String initial = "aaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbb";
        assertEquals(24, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case18() {
        String initial = "gugugugugugugugugugugugugu";
        assertEquals(1, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case19() {
        String initial = "ppppppppppppsssssssssssssssuuuuuuuuuuu";
        assertEquals(11, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case20() {
        String initial = "abcdefgrijklmnopqrstuvwxxwvutshqponmlkgjihgfedcba";
        assertEquals(2, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case21() {
        String initial = "a";
        assertEquals(0, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case22() {
        String initial = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
        assertEquals(0, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case23() {
        String initial = "abcdefggfedcbazx";
        assertEquals(2, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case24() {
        String initial = "flagihjkbbfkjakeacfakgcdaadafeafbblbgefgbdjhhbhabj";
        assertEquals(16, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case25() {
        String initial = "aablgbghieeehfaclijhajbcabfdibadjaclgffhehacldbcaa";
        assertEquals(15, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case26() {
        String initial = "lfaggcdkheldafcagcflabahkfaiajaaigacdheccfdhdfhafl";
        assertEquals(15, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case27() {
        String initial = "biliflakbackcagaeaialdclcidbclbicegfchifggbjaafleb";
        assertEquals(15, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case28() {
        String initial = "aecagabaaebgbdefaeaaaaaggbcecaaeabedbggfbeaabadec";
        assertEquals(10, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case29() {
        String initial = "aagagacgdgadgbecgdbaacadbadgcaedggadddagbgeaaagaa";
        assertEquals(10, palindromefactory.getEditDistance(initial));
    }


    @Test
    public void case30() {
        String initial = "ccgcaaaddcafcdcdacgafacaeacggddgcagdadfgbddaagegc";
        assertEquals(11, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case31() {
        String initial = "cceaabaccdaeaabdccbdcabbbaacdbbcdeaaadeadcabaacba";
        assertEquals(8, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case32() {
        String initial = "aebcaeabbadcabeabacedaaadeaaaeecaeabacdeaebcaacbe";
        assertEquals(8, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case33() {
        String initial = "dashklasdlkansclkjncsdjhflkasjdskajdsalkcalksask";
        assertEquals(14, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case34() {
        String initial = "cuandolascosasfeasteatacannopuedesconetucodigofeo";
        assertEquals(20, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case35() {
        String initial = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwx";
        assertEquals(23, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case36() {
        String initial = "abkanodfanogoandgaongoawenaohnoahnoaonho";
        assertEquals(12, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case37() {
        String initial = "abcdefghijklmnopqrstuvwxyzabcdefg";
        assertEquals(14, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case38() {
        String initial = "abcdefghijklmnopqrstuvwxyzabcdefghijklmpqrstuvwxyz";
        assertEquals(23, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case39() {
        String initial = "abcdefghijklmnoprstuyvwxyzqw";
        assertEquals(14, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case40() {
        String initial = "ecbbacad";
        assertEquals(3, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case41() {
        String initial = "abcdefghijklmnopqrstuv";
        assertEquals(11, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case42() {
        String initial = "abcdefghijklmnopqrstuvwxyz";
        assertEquals(13, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case43() {
        String initial = "jghfffuiklllllllllllasdfghuwwwwwiasdjklllllljhgyub";
        assertEquals(18, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case44() {
        String initial = "lfhajdheiwuqyrjsadhf";
        assertEquals(7, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case45() {
        String initial = "bbcdefghijklmqopqrstuvwxyzyxwvutsrnponmlkjihgfedca";
        assertEquals(3, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case46() {
        String initial = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvw";
        assertEquals(22, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case47() {
        String initial = "abcdefghijklmoqwertyuabcdefghijklmoqertycccvdcbak";
        assertEquals(19, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case48() {
        String initial = "abcdeedcab";
        assertEquals(1, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case49() {
        String initial = "ab";
        assertEquals(1, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case50() {
        String initial = "iadoakjbfadlkjhfadiuksjdfbkadfkbvaadfkjadf";
        assertEquals(15, palindromefactory.getEditDistance(initial));
    }

    @Test
    public void case51() {
        String initial = "amsdofozjzejfabmqsdjfazeopaozefjaqsdfmjsdqomfsdmsa";
        assertEquals(16, palindromefactory.getEditDistance(initial));
    }

}
