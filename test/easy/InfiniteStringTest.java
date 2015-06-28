package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class InfiniteStringTest {
    InfiniteString infinitestring = new InfiniteString();

    @Test
    public void case1() {
        String s = "ab";
        String t = "abab";
        assertEquals("Equal", infinitestring.equal(s, t));
    }

    @Test
    public void case2() {
        String s = "abab";
        String t = "aba";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case3() {
        String s = "aaaaa";
        String t = "aaaaaa";
        assertEquals("Equal", infinitestring.equal(s, t));
    }

    @Test
    public void case4() {
        String s = "ababab";
        String t = "abab";
        assertEquals("Equal", infinitestring.equal(s, t));
    }

    @Test
    public void case5() {
        String s = "a";
        String t = "z";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case6() {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String t = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        assertEquals("Equal", infinitestring.equal(s, t));
    }

    @Test
    public void case7() {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String t = "a";
        assertEquals("Equal", infinitestring.equal(s, t));
    }

    @Test
    public void case8() {
        String s = "abc";
        String t = "bca";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case9() {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
        String t = "a";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case10() {
        String s = "afasfasfaaafsafasfaasdafasfafsaf";
        String t = "afasfasfaaafsafasfaasdafasfafsaf";
        assertEquals("Equal", infinitestring.equal(s, t));
    }

    @Test
    public void case11() {
        String s = "fjskflaksfjskflaksfjskflaksfjskflaksfjskflaks";
        String t = "fjskflaksfjskflaksfjskflaks";
        assertEquals("Equal", infinitestring.equal(s, t));
    }

    @Test
    public void case12() {
        String s = "ffjskflaksfjskflaksfjskflaksjskflaks";
        String t = "fjskflaksfjfjskflaksskflaks";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case13() {
        String s = "abababababababababababababababababababab";
        String t = "ababababababababababab";
        assertEquals("Equal", infinitestring.equal(s, t));
    }

    @Test
    public void case14() {
        String s = "ababababababababababababababababa";
        String t = "abababababababababababababab";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case15() {
        String s = "a";
        String t = "aa";
        assertEquals("Equal", infinitestring.equal(s, t));
    }

    @Test
    public void case16() {
        String s = "aba";
        String t = "bab";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case17() {
        String s = "aaaaa";
        String t = "aaa";
        assertEquals("Equal", infinitestring.equal(s, t));
    }

    @Test
    public void case18() {
        String s = "abcabcabcabcabcabcabcabcabcabcabcabcabcabcabc";
        String t = "abcabcabcabcabcabcabcabcabc";
        assertEquals("Equal", infinitestring.equal(s, t));
    }

    @Test
    public void case19() {
        String s = "abc";
        String t = "abcabcabcabcabcabcabcabcabc";
        assertEquals("Equal", infinitestring.equal(s, t));
    }

    @Test
    public void case20() {
        String s = "aba";
        String t = "ab";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case21() {
        String s = "aaa";
        String t = "aaaab";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case22() {
        String s = "abcab";
        String t = "abc";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case23() {
        String s = "abcd";
        String t = "zzzz";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case24() {
        String s = "abc";
        String t = "abca";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case25() {
        String s = "abba";
        String t = "abbaabb";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case26() {
        String s = "aabba";
        String t = "a";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case27() {
        String s = "abcdabc";
        String t = "abcd";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case28() {
        String s = "abc";
        String t = "abcab";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case29() {
        String s = "a";
        String t = "a";
        assertEquals("Equal", infinitestring.equal(s, t));
    }

    @Test
    public void case30() {
        String s = "abcabcabcabcabcd";
        String t = "abc";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case31() {
        String s = "ababa";
        String t = "ab";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case32() {
        String s = "aab";
        String t = "aa";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case33() {
        String s = "abc";
        String t = "abcabca";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case34() {
        String s = "ababaaaa";
        String t = "ab";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case35() {
        String s = "ab";
        String t = "ababcb";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case36() {
        String s = "bbbbbbd";
        String t = "b";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case37() {
        String s = "aaaaaab";
        String t = "aa";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case38() {
        String s = "abaa";
        String t = "aba";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case39() {
        String s = "bcabc";
        String t = "bca";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case40() {
        String s = "a";
        String t = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case41() {
        String s = "aaaaab";
        String t = "aa";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case42() {
        String s = "abcaba";
        String t = "abc";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case43() {
        String s = "abcabcd";
        String t = "abc";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case44() {
        String s = "abca";
        String t = "abc";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case45() {
        String s = "ab";
        String t = "ababf";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case46() {
        String s = "ab";
        String t = "ababababc";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case47() {
        String s = "abcdef";
        String t = "abcdee";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case48() {
        String s = "aaabbbaaa";
        String t = "aaabbb";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case49() {
        String s = "abab";
        String t = "abababa";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case50() {
        String s = "a";
        String t = "aaaaa";
        assertEquals("Equal", infinitestring.equal(s, t));
    }

    @Test
    public void case51() {
        String s = "a";
        String t = "aaaaaaab";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case52() {
        String s = "aaa";
        String t = "aaaaaac";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case53() {
        String s = "aab";
        String t = "aabaaab";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case54() {
        String s = "abcd";
        String t = "abcdab";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case55() {
        String s = "ababcd";
        String t = "ab";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case56() {
        String s = "a";
        String t = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case57() {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
        String t = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaba";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case58() {
        String s = "ab";
        String t = "ababa";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case59() {
        String s = "abcabcab";
        String t = "abcabc";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case60() {
        String s = "abcabcabcd";
        String t = "abc";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case61() {
        String s = "abcdab";
        String t = "abcd";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case62() {
        String s = "a";
        String t = "aaa";
        assertEquals("Equal", infinitestring.equal(s, t));
    }

    @Test
    public void case63() {
        String s = "aac";
        String t = "aaca";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case64() {
        String s = "aa";
        String t = "aaaaaaaa";
        assertEquals("Equal", infinitestring.equal(s, t));
    }

    @Test
    public void case65() {
        String s = "dbdbbbbbd";
        String t = "db";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case66() {
        String s = "aba";
        String t = "aba";
        assertEquals("Equal", infinitestring.equal(s, t));
    }

    @Test
    public void case67() {
        String s = "abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabc";
        String t = "abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcab";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case68() {
        String s = "ababababa";
        String t = "abab";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case69() {
        String s = "aabb";
        String t = "aabba";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case70() {
        String s = "vedvv";
        String t = "vedv";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case71() {
        String s = "a";
        String t = "aaaaaaaaaaaaaaaaaaaab";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case72() {
        String s = "abcdabcdab";
        String t = "abcd";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case73() {
        String s = "caacaaa";
        String t = "caacaaac";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case74() {
        String s = "aba";
        String t = "abaabaab";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case75() {
        String s = "aabba";
        String t = "aabb";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case76() {
        String s = "abab";
        String t = "bab";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case77() {
        String s = "abcdddda";
        String t = "aabbba";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case78() {
        String s = "a";
        String t = "ab";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

    @Test
    public void case79() {
        String s = "abacaba";
        String t = "abac";
        assertEquals("Not equal", infinitestring.equal(s, t));
    }

}
