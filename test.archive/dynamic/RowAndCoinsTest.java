package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class RowAndCoinsTest {
    RowAndCoins rowandcoins = new RowAndCoins();

    @Test
    public void case1() {
        String cells = "ABBB";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case2() {
        String cells = "BBBB";
        assertEquals("Bob", rowandcoins.getWinner(cells));
    }

    @Test
    public void case3() {
        String cells = "BA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case4() {
        String cells = "BABBABBB";
        assertEquals("Bob", rowandcoins.getWinner(cells));
    }

    @Test
    public void case5() {
        String cells = "ABABBBABAABBAA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case6() {
        String cells = "BBBAAABBAAABBB";
        assertEquals("Bob", rowandcoins.getWinner(cells));
    }

    @Test
    public void case7() {
        String cells = "AA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case8() {
        String cells = "BA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case9() {
        String cells = "AB";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case10() {
        String cells = "BB";
        assertEquals("Bob", rowandcoins.getWinner(cells));
    }

    @Test
    public void case11() {
        String cells = "AAA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case12() {
        String cells = "BAA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case13() {
        String cells = "ABA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case14() {
        String cells = "BBA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case15() {
        String cells = "AAB";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case16() {
        String cells = "BAB";
        assertEquals("Bob", rowandcoins.getWinner(cells));
    }

    @Test
    public void case17() {
        String cells = "ABB";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case18() {
        String cells = "BBB";
        assertEquals("Bob", rowandcoins.getWinner(cells));
    }

    @Test
    public void case19() {
        String cells = "AAAA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case20() {
        String cells = "BAAA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case21() {
        String cells = "ABAA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case22() {
        String cells = "BBAA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case23() {
        String cells = "AABA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case24() {
        String cells = "BABA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case25() {
        String cells = "ABBA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case26() {
        String cells = "BBBA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case27() {
        String cells = "AAAB";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case28() {
        String cells = "BAAB";
        assertEquals("Bob", rowandcoins.getWinner(cells));
    }

    @Test
    public void case29() {
        String cells = "ABAB";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case30() {
        String cells = "BBAB";
        assertEquals("Bob", rowandcoins.getWinner(cells));
    }

    @Test
    public void case31() {
        String cells = "AABB";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case32() {
        String cells = "BABB";
        assertEquals("Bob", rowandcoins.getWinner(cells));
    }

    @Test
    public void case33() {
        String cells = "ABBB";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case34() {
        String cells = "BBBB";
        assertEquals("Bob", rowandcoins.getWinner(cells));
    }

    @Test
    public void case35() {
        String cells = "ABBBA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case36() {
        String cells = "ABBBB";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case37() {
        String cells = "BBBBA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case38() {
        String cells = "BBBBB";
        assertEquals("Bob", rowandcoins.getWinner(cells));
    }

    @Test
    public void case39() {
        String cells = "AAAABA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case40() {
        String cells = "AAAABB";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case41() {
        String cells = "BAAABA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case42() {
        String cells = "BAAABB";
        assertEquals("Bob", rowandcoins.getWinner(cells));
    }

    @Test
    public void case43() {
        String cells = "ABBBABA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case44() {
        String cells = "ABBBABB";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case45() {
        String cells = "BBBBABA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case46() {
        String cells = "BBBBABB";
        assertEquals("Bob", rowandcoins.getWinner(cells));
    }

    @Test
    public void case47() {
        String cells = "ABABAAAA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case48() {
        String cells = "ABABAAAB";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case49() {
        String cells = "BBABAAAA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case50() {
        String cells = "BBABAAAB";
        assertEquals("Bob", rowandcoins.getWinner(cells));
    }

    @Test
    public void case51() {
        String cells = "AAABBBBAA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case52() {
        String cells = "AAABBBBAB";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case53() {
        String cells = "BAABBBBAA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case54() {
        String cells = "BAABBBBAB";
        assertEquals("Bob", rowandcoins.getWinner(cells));
    }

    @Test
    public void case55() {
        String cells = "AABAAABABA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case56() {
        String cells = "AABAAABABB";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case57() {
        String cells = "BABAAABABA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case58() {
        String cells = "BABAAABABB";
        assertEquals("Bob", rowandcoins.getWinner(cells));
    }

    @Test
    public void case59() {
        String cells = "ABABBBBBAAA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case60() {
        String cells = "ABABBBBBAAB";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case61() {
        String cells = "BBABBBBBAAA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case62() {
        String cells = "BBABBBBBAAB";
        assertEquals("Bob", rowandcoins.getWinner(cells));
    }

    @Test
    public void case63() {
        String cells = "ABBABABAABAA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case64() {
        String cells = "ABBABABAABAB";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case65() {
        String cells = "BBBABABAABAA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case66() {
        String cells = "BBBABABAABAB";
        assertEquals("Bob", rowandcoins.getWinner(cells));
    }

    @Test
    public void case67() {
        String cells = "ABBBBAAAAAAAA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case68() {
        String cells = "ABBBBAAAAAAAB";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case69() {
        String cells = "BBBBBAAAAAAAA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case70() {
        String cells = "BBBBBAAAAAAAB";
        assertEquals("Bob", rowandcoins.getWinner(cells));
    }

    @Test
    public void case71() {
        String cells = "AABBBAAAAAABBA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case72() {
        String cells = "AABBBAAAAAABBB";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case73() {
        String cells = "BABBBAAAAAABBA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case74() {
        String cells = "BABBBAAAAAABBB";
        assertEquals("Bob", rowandcoins.getWinner(cells));
    }

    @Test
    public void case75() {
        String cells = "AAAAAAAAAAAAA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case76() {
        String cells = "AAAAAAAAAAAAB";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case77() {
        String cells = "BAAAAAAAAAAAA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case78() {
        String cells = "BAAAAAAAAAAAB";
        assertEquals("Bob", rowandcoins.getWinner(cells));
    }

    @Test
    public void case79() {
        String cells = "ABBBBBBBBBBBA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case80() {
        String cells = "ABBBBBBBBBBBB";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case81() {
        String cells = "BBBBBBBBBBBBA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case82() {
        String cells = "BBBBBBBBBBBBB";
        assertEquals("Bob", rowandcoins.getWinner(cells));
    }

    @Test
    public void case83() {
        String cells = "ABABABABABABA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case84() {
        String cells = "ABABABABABABB";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case85() {
        String cells = "BBABABABABABA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case86() {
        String cells = "BBABABABABABB";
        assertEquals("Bob", rowandcoins.getWinner(cells));
    }

    @Test
    public void case87() {
        String cells = "AABABABABABAA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case88() {
        String cells = "AABABABABABAB";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case89() {
        String cells = "BABABABABABAA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case90() {
        String cells = "BABABABABABAB";
        assertEquals("Bob", rowandcoins.getWinner(cells));
    }

    @Test
    public void case91() {
        String cells = "AAAAAAAAAAAAAA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case92() {
        String cells = "AAAAAAAAAAAAAB";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case93() {
        String cells = "BAAAAAAAAAAAAA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case94() {
        String cells = "BAAAAAAAAAAAAB";
        assertEquals("Bob", rowandcoins.getWinner(cells));
    }

    @Test
    public void case95() {
        String cells = "AAAAAAABAAAAAA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case96() {
        String cells = "AAAAAAABAAAAAB";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case97() {
        String cells = "BAAAAAABAAAAAA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case98() {
        String cells = "BAAAAAABAAAAAB";
        assertEquals("Bob", rowandcoins.getWinner(cells));
    }

    @Test
    public void case99() {
        String cells = "ABBBBBBBBBBBBA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case100() {
        String cells = "ABBBBBBBBBBBBB";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case101() {
        String cells = "BBBBBBBBBBBBBA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case102() {
        String cells = "BBBBBBBBBBBBBB";
        assertEquals("Bob", rowandcoins.getWinner(cells));
    }

    @Test
    public void case103() {
        String cells = "ABBBBBBBABBBBA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case104() {
        String cells = "ABBBBBBBABBBBB";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case105() {
        String cells = "BBBBBBBBABBBBA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case106() {
        String cells = "BBBBBBBBABBBBB";
        assertEquals("Bob", rowandcoins.getWinner(cells));
    }

    @Test
    public void case107() {
        String cells = "ABABABABABABAA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case108() {
        String cells = "ABABABABABABAB";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case109() {
        String cells = "BBABABABABABAA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case110() {
        String cells = "BBABABABABABAB";
        assertEquals("Bob", rowandcoins.getWinner(cells));
    }

    @Test
    public void case111() {
        String cells = "AABABABABABABA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case112() {
        String cells = "AABABABABABABB";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case113() {
        String cells = "BABABABABABABA";
        assertEquals("Alice", rowandcoins.getWinner(cells));
    }

    @Test
    public void case114() {
        String cells = "BABABABABABABB";
        assertEquals("Bob", rowandcoins.getWinner(cells));
    }

}
