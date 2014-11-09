package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class MiddleCodeTest {
    MiddleCode middlecode = new MiddleCode();

    @Test
    public void case1() {
        String s = "word";
        assertEquals("ordw", middlecode.encode(s));
    }

    @Test
    public void case2() {
        String s = "aaaaa";
        assertEquals("aaaaa", middlecode.encode(s));
    }

    @Test
    public void case3() {
        String s = "abacaba";
        assertEquals("caabbaa", middlecode.encode(s));
    }

    @Test
    public void case4() {
        String s = "shjegr";
        assertEquals("ejghrs", middlecode.encode(s));
    }

    @Test
    public void case5() {
        String s = "adafaaaadafawafwfasdaa";
        assertEquals("afawadafawafaafsadadaa", middlecode.encode(s));
    }

    @Test
    public void case6() {
        String s = "bbaab";
        assertEquals("aabbb", middlecode.encode(s));
    }

    @Test
    public void case7() {
        String s = "bbaabaaaaa";
        assertEquals("abaaaaabab", middlecode.encode(s));
    }

    @Test
    public void case8() {
        String s = "bbaabaaaaabbbbbbbaba";
        assertEquals("abababababbbabaabbab", middlecode.encode(s));
    }

    @Test
    public void case9() {
        String s = "bbaabaaaaabbbbbbbababaabaabaabbabab";
        assertEquals("abbabbbababbbabaaabaaaaabbbaaababbb", middlecode.encode(s));
    }

    @Test
    public void case10() {
        String s = "bbaabaaaaabbbbbbbababaabaabaabbabababbbabbabbabbba";
        assertEquals("aabbaaaabbababababbbabbbbbbbabababaaabababababbbab", middlecode.encode(s));
    }

    @Test
    public void case11() {
        String s = "ggffgfffffgggggggfgfgffgffgffggfgfgfgggfggfggfgggf";
        assertEquals("ffggffffggfgfgfgfgggfgggggggfgfgfgfffgfgfgfgfgggfg", middlecode.encode(s));
    }

    @Test
    public void case12() {
        String s = "ghjfjjiihjffghggfhhggjhihhggifhggijhhjfjighiijggii";
        assertEquals("hhgighijfgghghghfigjghhhgjfffjijghhiiiijjjfggjhigi", middlecode.encode(s));
    }

    @Test
    public void case13() {
        String s = "ghjfjjiihjffghggfhhggjhihhggifhggijhhjfj";
        assertEquals("gghjhhfighghghggfiffhjghgiiijjhjfhjjfhgj", middlecode.encode(s));
    }

    @Test
    public void case14() {
        String s = "gmjfojnnhjkkgmggkhmlgjhihhglnkmlgnohmokj";
        assertEquals("gljmhhikghghgmglknkkjmhlgnnnjohofmjokmgj", middlecode.encode(s));
    }

    @Test
    public void case15() {
        String s = "phqghumeaylnlfdxfircvscxggbwkfnqduxwfnfozvsrtkjpre";
        assertEquals("ggbxcwksfvcnqrdifuxxdwfflnfnloyzavesmrtuhkgjpqhrep", middlecode.encode(s));
    }

    @Test
    public void case16() {
        String s = "phqghumeaylnlfdxfircvscxggbwkfnqduxwfnfoz";
        assertEquals("vcscrixfggxbdfwklfnlnqyadeumxuwfhgnfqhopz", middlecode.encode(s));
    }

    @Test
    public void case17() {
        String s = "phqghumeaylnlfdxfircvscxg";
        assertEquals("lfndlxyafeimrcuhvgscqhxgp", middlecode.encode(s));
    }

    @Test
    public void case18() {
        String s = "phqghumeay";
        assertEquals("hugmeqahpy", middlecode.encode(s));
    }

    @Test
    public void case19() {
        String s = "phqghu";
        assertEquals("gqhhpu", middlecode.encode(s));
    }

    @Test
    public void case20() {
        String s = "kfkjhgjejkejkkefkeiigghkjkjjkffjfgeijeihhiigjgeiff";
        assertEquals("jkjkhjgkfgfiijefgkefeijkekijehhkijeigjgjghejikfffk", middlecode.encode(s));
    }

    @Test
    public void case21() {
        String s = "fhkifikkgefffhfhhkhilikfikjikllkhgjehhhklhgjfejlji";
        assertEquals("ikfjikikllilhkhkghhjefhhfhfhfkelghgkjkfiefijklhjfi", middlecode.encode(s));
    }

    @Test
    public void case22() {
        String s = "jmlimfhelgmglkljlmheekjeilkjmjgegekimflhgkghkghlgf";
        assertEquals("ilekjjkmejegehgmeljkilkmflglhmggkleghhfkgmhillgmfj", middlecode.encode(s));
    }

    @Test
    public void case23() {
        String s = "mnnfljjofelljmklhlngllmoklmjklgfnooginljiljklejeji";
        assertEquals("klmojmklllggfnlnhologkimjnlljleifljojkjlelfjenjnim", middlecode.encode(s));
    }

    @Test
    public void case24() {
        String s = "pgiosihhlsjjfqfpogqkknghllkpmjgkphnlgionmkghhskfmr";
        assertEquals("llhkgpmnjkgkkqgphonpflgqfijojnmsklghhhhisskofigmpr", middlecode.encode(s));
    }

    @Test
    public void case25() {
        String s = "ljosouhuefoomsuthmurkfnehkrutjletqujsefelpmjokpoue";
        assertEquals("hkernuftjklreumthqtujussemfoeoflepmuhjoukopsoojuel", middlecode.encode(s));
    }

    @Test
    public void case26() {
        String s = "abba";
        assertEquals("bbaa", middlecode.encode(s));
    }

    @Test
    public void case27() {
        String s = "x";
        assertEquals("x", middlecode.encode(s));
    }

    @Test
    public void case28() {
        String s = "worde";
        assertEquals("rdoew", middlecode.encode(s));
    }

    @Test
    public void case29() {
        String s = "ab";
        assertEquals("ab", middlecode.encode(s));
    }

    @Test
    public void case30() {
        String s = "abc";
        assertEquals("bac", middlecode.encode(s));
    }

}
