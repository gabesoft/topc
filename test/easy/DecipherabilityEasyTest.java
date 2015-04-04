package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class DecipherabilityEasyTest {
    DecipherabilityEasy decipherabilityeasy = new DecipherabilityEasy();

    @Test
    public void case1() {
        String s = "sunuke";
        String t = "snuke";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case2() {
        String s = "snuke";
        String t = "skue";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case3() {
        String s = "snuke";
        String t = "snuke";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case4() {
        String s = "snukent";
        String t = "snuke";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case5() {
        String s = "aaaaa";
        String t = "aaaa";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case6() {
        String s = "aaaaa";
        String t = "aaa";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case7() {
        String s = "topcoder";
        String t = "tpcoder";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case8() {
        String s = "singleroundmatch";
        String t = "singeroundmatc";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case9() {
        String s = "aa";
        String t = "a";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case10() {
        String s = "ab";
        String t = "a";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case11() {
        String s = "ab";
        String t = "b";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case12() {
        String s = "abc";
        String t = "ab";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case13() {
        String s = "ab";
        String t = "c";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case14() {
        String s = "abc";
        String t = "ac";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case15() {
        String s = "abc";
        String t = "b";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case16() {
        String s = "abc";
        String t = "aac";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case17() {
        String s = "ildzzupqqopaizfrwzmebdkuhjjmagwitsbmmrzbgrifpxyk";
        String t = "ildzzupqqopaifrwzmebdkuhjjmagwitsbmmrzbgrifpxyk";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case18() {
        String s = "ligjjcdifqrfdamwmlqyzfdxylcaeahgcfzdyexdhxbccalpg";
        String t = "ligjjcdifqrfdamwmlqyzfdxylcaeahgcfzdyexhxbccalpg";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case19() {
        String s = "dvyqkcuowtszmmarlhzmgmnqqnxrqkn";
        String t = "dvqkcuowtszmmarlhzmgmnqqnxrqkn";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case20() {
        String s = "feipwxwoghejqcmaxvavqtwfgejhohyuyvufvdnl";
        String t = "feipxwoghejqcmaxvavqtwfgejhohyuyvufvdnl";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case21() {
        String s = "jjvmjfcqlklwycceifpolickmabpujypdddkiksgowhduvf";
        String t = "jjvmjcqlklwycceifpolickmabpujypdddkiksgowhduvf";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case22() {
        String s = "gtlaozuyoasojsvtxijopwxaeyfchxszmg";
        String t = "gtlaozuyoaojsvtxijopwxaeyfchxszmg";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case23() {
        String s = "tsxjarccqzjveufxeaydzlwimsygniooihykmcsbwbtdprj";
        String t = "tsxjarccqzjveufxeaydzlwimsygnioohykmcsbwbtdprj";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case24() {
        String s = "oeomnyundnxvqnpjbsddvslharvdmltqpmkilki";
        String t = "oeomnyundnxvqnpjbsddvslhavdmltqpmkilki";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case25() {
        String s = "rdqhdmvzfjzlojmakdijvobgqdjkuffthkuohffzcpurkso";
        String t = "rdqhdmvzfjzlojmakdijvobgqdjkuffthkohffzcpurkso";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case26() {
        String s = "yqtikjgerlfninryzowihtjzrgofrgaggtymhrxcczzclsw";
        String t = "yqtikjgerlfninryzowihtjzrgofrgggtymhrxcczzclsw";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case27() {
        String s = "ydxzlcnhnhpjatmkgnhqbeecsdctepnxsa";
        String t = "ydxzlcnhnhpjatmkgnhqbeecsdctenxsa";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case28() {
        String s = "rqxvzargeewzkuupotpsmedcirebocvsb";
        String t = "rqxvzargeewzkuuotpsmedcirebocvsb";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case29() {
        String s = "tzwvuvipfxggtufhhcyrtvbbogdeomdngdvvmkchct";
        String t = "tzwvuvipfxggtufhcyrtvbbogdeomdngdvvmkchct";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case30() {
        String s = "iuxpfdqlerypakpmavlejtfecsmnyersikytwucoddu";
        String t = "iuxpfdqlerypakpmavlejtfecsmnyersikytwuoddu";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case31() {
        String s = "gjwoodxzmgnwrzjrkuspvzqzqfekzmnfjzof";
        String t = "gjwoodxzmgnwrzjrkuspvzqzqekzmnfjzof";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case32() {
        String s = "qfpmqegpfjjtbxyfpzwmnavxpinffpccyqlpvjqxikcjphlbg";
        String t = "qpmqegpfjjtbxyfpzwmnavxpinffpccyqlpvjqxikcjphlbg";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case33() {
        String s = "exqbugsgoydmkeetjlpjppebocwtshmfhrwuyyofwraykeb";
        String t = "exqbugsgoydmkeetjlpjppebcwtshmfhrwuyyofwraykeb";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case34() {
        String s = "kpfbcumoyohhphyxobjxszmvaqhnycgwdwlztljxi";
        String t = "kpfbcumoyohhphyxobjxszmvaqnycgwdwlztljxi";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case35() {
        String s = "hunrnueavcgknzdnxynllqaceveymjarezosbdqrwl";
        String t = "hunrnueavcgnzdnxynllqaceveymjarezosbdqrwl";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case36() {
        String s = "oebybdgxrnezovpokxygqaidnqnuqbqpqayjco";
        String t = "oebybdgxrnezovpokxygaidnqnuqbqpqayjco";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case37() {
        String s = "xtbxwjvnsueklslwaqdwlaknavvohwszkqjmtubhu";
        String t = "xtbxwjvnsuekllwaqdwlaknavvohwszkqjmtubhu";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case38() {
        String s = "bbxhfyfhvcohnikfidtmlsdvmhkkyfokaewxopdjjilgf";
        String t = "bbxhfyfhvcohnikfidtmlsdvmhkkyfkaewxopdjjilgf";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case39() {
        String s = "subedzqbrlfffroikjvxebvbrdfheucxgbptmrccdmnpoxpd";
        String t = "subedzqbrlfffroikjvxebvbrdfheucgbptmrccdmnpoxpd";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case40() {
        String s = "smtzzvvvyzvdsntpzciwwzgulsjnserwiycinchcyeyoqd";
        String t = "smtzzvvvyzvdsntpzciwwzguljnserwiycinchcyeyoqd";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case41() {
        String s = "bjxpmdkexyjqdjsqvvdnhygzddmvmerzgum";
        String t = "bjxpmdkeyjqdjsqvvdnhygzddmvmerzgum";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case42() {
        String s = "bjusjvvvmmqvrifxuslxcyfkpgzeagrhz";
        String t = "bjusjvvvmmqvrifxuslxcyfkpgzeaghz";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case43() {
        String s = "scwdsfiifsgxooxhalbrpfhkkvcokpbwuvztbndfpw";
        String t = "scwdsiifsgxooxhalbrpfhkkvcokpbwuvztbndfpw";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case44() {
        String s = "ijzuunzjsjbrclauzzfszranpvyaudcqdhmpntacbwsy";
        String t = "ijzuunzjsjbrclauzzfszranpvyadcqdhmpntacbwsy";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case45() {
        String s = "svfgfqftrygfeklvutbntlpedjrvdhgsib";
        String t = "svfgfftrygfeklvutbntlpedjrvdhgsib";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case46() {
        String s = "dbhevbgilatmzjvdmmvvahdcgzobwwhupvzsaygv";
        String t = "dbhevbglatmzjvdmmvvahdcgzobwwhupvzsaygv";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case47() {
        String s = "iiyokoiyo";
        String t = "iyokoiyo";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case48() {
        String s = "iiyokoiyo";
        String t = "iiyokoiy";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case49() {
        String s = "ccacbacaaaacca";
        String t = "cccbacaaaacca";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case50() {
        String s = "caaabbbacbaababaccccabacabacabbbbbab";
        String t = "caaabbbacbaababaccccbbacaaacabbbbab";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case51() {
        String s = "abaaabcaabccac";
        String t = "abaaaacaabccb";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case52() {
        String s = "cccccaacabaacaacbbcbaaabaacabaacbbbbbabcaaa";
        String t = "cccaaaccbaacaacbbcbaaabaacabaacbbbbbabcaaa";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case53() {
        String s = "cacbababaaaccacbccbbcbacb";
        String t = "cacbababaaccbcbccbbcbaca";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case54() {
        String s = "aabcacbacbbbbbbcccbcccacbcaaababcbabcbbabbbbb";
        String t = "aabcacbacbbcbbbcccbcbcacbcaaababcbabbbabbbbb";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case55() {
        String s = "cacbbaacaaccaacbacababbbbbabccccaaabba";
        String t = "cacbbaacaaccaacbacababbbbabcbccaaabca";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case56() {
        String s = "bcccccbaabcccacbbaabcaccacacaaaabacccaa";
        String t = "accccbaabcccacbbaabcaccacacaababacccaa";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case57() {
        String s = "aabccccbabaabacaab";
        String t = "aabccccbabaaacaab";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case58() {
        String s = "baabcbcab";
        String t = "aabcbcbb";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case59() {
        String s = "cbacbccb";
        String t = "cbacccb";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case60() {
        String s = "cbaabccc";
        String t = "abcabcc";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case61() {
        String s = "bcbacbcbccbbbabccabcbaab";
        String t = "bcbbbcbccbbcabccabcbaab";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case62() {
        String s = "acaacbbccab";
        String t = "aaccbbccab";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case63() {
        String s = "aabbbacbcacabbbbccbbabababc";
        String t = "baabbcbcacabbbbccbbabababc";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case64() {
        String s = "cccaabcaccbbcccacaaaacbcabc";
        String t = "cacaabcaccbbcccacaaaccbcbc";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case65() {
        String s = "bccbabbbbacacaabccbbbabacaabbc";
        String t = "bcbbabbbacacaabccbbcabacaabbc";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case66() {
        String s = "bcccacccbabbaaaccacacbcbaaaacbcaccbaababbbcbcbcb";
        String t = "bcccacccbabbaaaccacacbcbaaaabcaccbaababbbcbcbcb";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case67() {
        String s = "babccaccbbbbacaacaabaccbacacbacbc";
        String t = "babccaccbbbbacaacaabacccaacbacbb";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case68() {
        String s = "babbabbacbccbabaacacbbaccacbcbbaaccaccbcccbb";
        String t = "babbabbacbccbabaacacbbaccacbcbbaaccaccbccbb";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case69() {
        String s = "bcacbbacc";
        String t = "bcacbbac";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case70() {
        String s = "ccbabbaaacbbaaaaabaaaba";
        String t = "ccbabbaaacbbaaaaaaaaba";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case71() {
        String s = "caaaaaabcbcbcabcbabbabacaacbcbabcababbbabacbcbbba";
        String t = "caaaaaabcbcacabcbabbabacaacbcbbbcababbbababcbbba";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case72() {
        String s = "ccbbbcaacaacbaaaaccccbabaccacccbacccc";
        String t = "ccbbbcaaccaabaaaaccccbabaccacccacccc";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case73() {
        String s = "bbaaccbcaccbbbcababbcaaccaabcbbabacababab";
        String t = "bbaaccbcacbbbcababbcaaccaabcbbabacababab";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case74() {
        String s = "cacaabbaaacbbc";
        String t = "cacaabbaaabbc";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case75() {
        String s = "cabcbabacbcaabbcbbbaababaaabaabbbabbaabcbccacccb";
        String t = "ccbcabacbcaabbcbbbaababaaabaabbbabbaabcbcaacccb";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case76() {
        String s = "cbcbbcaabcbcabbbccccacbcbaacccbbc";
        String t = "cbcbccaabcbabbbcbccacbcbaacccbbc";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case77() {
        String s = "baabbacbcabcaacaaaba";
        String t = "baabbabcabcaacaacba";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case78() {
        String s = "bcbbaccbcbccacbbbbbccccbbaa";
        String t = "bcbbaccbcbccbcbabbbccccbba";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case79() {
        String s = "bbabaaabbbabbabbaaabaabbbaaabaabbb";
        String t = "abaaabaabbbbaaaaa";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case80() {
        String s = "bbbabbabbbabaabbaabaaabbbbba";
        String t = "ababaaabaaaaabbaabbabbbaa";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case81() {
        String s = "bbbbbabaabaabbbabaaabbabbabbabbbbabaababaa";
        String t = "baaaabbabbaabbaabaaabbbbaab";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case82() {
        String s = "bbbabaaaababaaaaaaaa";
        String t = "bababababbbaababbbbbabbaaaabbabbbbbaabbabbbabbaa";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case83() {
        String s = "abaababbaaabaabaaaaaaabaabbbaababaaaabbaaaaab";
        String t = "bababbbaabbbababbbbbabbbababbbbaaaaabbbbababb";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case84() {
        String s = "abaabaaaabbaabaabaaaaabbbbabbbaabbbbaaabbbaa";
        String t = "bbabbabaabaaaabaaabaabbabaabbaababaabababaabab";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case85() {
        String s = "aabbaabbbbabbaaaabbaaaababbb";
        String t = "aaaaaaabbabbbabbbabbaabbbabbbababababbaaab";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case86() {
        String s = "bbbbaabbababbbbbbbbbbbbabaaabbbb";
        String t = "bbbabbabababba";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case87() {
        String s = "abbaababbbaabaaababbbaabbbaabbabbbbbbbbaba";
        String t = "aabbbaaaababbaabbbbab";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case88() {
        String s = "bbabbbbabbaaaabbaaabaaabbaaababa";
        String t = "aaabaaababaabaaaaab";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case89() {
        String s = "a";
        String t = "a";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case90() {
        String s = "a";
        String t = "b";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case91() {
        String s = "a";
        String t = "ac";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case92() {
        String s = "a";
        String t = "ca";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case93() {
        String s = "a";
        String t = "bc";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case94() {
        String s = "sunuke";
        String t = "sunuke";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case95() {
        String s = "ss";
        String t = "ss";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case96() {
        String s = "abcd";
        String t = "adc";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case97() {
        String s = "ab";
        String t = "aaba";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case98() {
        String s = "nnnn";
        String t = "nnnn";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case99() {
        String s = "abcddddd";
        String t = "abcd";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case100() {
        String s = "aa";
        String t = "aaa";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case101() {
        String s = "pera";
        String t = "pea";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case102() {
        String s = "abc";
        String t = "abcabcababcabcababcabcababcabcababcabcababcabcab";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case103() {
        String s = "abcde";
        String t = "bcde";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case104() {
        String s = "abc";
        String t = "aabc";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case105() {
        String s = "ab";
        String t = "d";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case106() {
        String s = "abcr";
        String t = "abcde";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case107() {
        String s = "abc";
        String t = "dcba";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case108() {
        String s = "aabc";
        String t = "acb";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case109() {
        String s = "qwerty";
        String t = "qwery";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case110() {
        String s = "asdfafghh";
        String t = "asdaafgh";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case111() {
        String s = "aaa";
        String t = "aa";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case112() {
        String s = "aaab";
        String t = "aaaa";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case113() {
        String s = "abcdef";
        String t = "abc";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case114() {
        String s = "abc";
        String t = "ae";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case115() {
        String s = "abcd";
        String t = "gcd";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case116() {
        String s = "cabc";
        String t = "acb";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case117() {
        String s = "aaaaa";
        String t = "aaaab";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case118() {
        String s = "aaa";
        String t = "aaaaa";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case119() {
        String s = "ac";
        String t = "b";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case120() {
        String s = "abc";
        String t = "abcd";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case121() {
        String s = "accb";
        String t = "adb";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case122() {
        String s = "abcd";
        String t = "abd";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case123() {
        String s = "hello";
        String t = "heoo";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case124() {
        String s = "abecd";
        String t = "bcde";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case125() {
        String s = "abc";
        String t = "bc";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case126() {
        String s = "aaaaaaa";
        String t = "aaaaaaa";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case127() {
        String s = "adsfefef";
        String t = "asdfefef";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case128() {
        String s = "abc";
        String t = "acdef";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case129() {
        String s = "snuke";
        String t = "snuk";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case130() {
        String s = "abcd";
        String t = "abc";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case131() {
        String s = "snnke";
        String t = "suke";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case132() {
        String s = "abaa";
        String t = "ab";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case133() {
        String s = "aab";
        String t = "aaaa";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case134() {
        String s = "abc";
        String t = "abdck";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case135() {
        String s = "abcd";
        String t = "cab";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case136() {
        String s = "aaaabxaaaa";
        String t = "aaaacaaaa";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case137() {
        String s = "ahmad";
        String t = "amsd";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case138() {
        String s = "bcato";
        String t = "bceo";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case139() {
        String s = "aaa";
        String t = "aaaa";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case140() {
        String s = "aabaa";
        String t = "aaa";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case141() {
        String s = "ababa";
        String t = "aaaa";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case142() {
        String s = "perap";
        String t = "peap";
        assertEquals("Possible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case143() {
        String s = "ash";
        String t = "ashwin";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case144() {
        String s = "hhh";
        String t = "h";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case145() {
        String s = "aaa";
        String t = "ab";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case146() {
        String s = "howa";
        String t = "howw";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case147() {
        String s = "abcde";
        String t = "abc";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case148() {
        String s = "aabaa";
        String t = "aaaaa";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case149() {
        String s = "aaaa";
        String t = "aa";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case150() {
        String s = "bab";
        String t = "aa";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case151() {
        String s = "asua";
        String t = "usa";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case152() {
        String s = "pqrs";
        String t = "prstt";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

    @Test
    public void case153() {
        String s = "abcde";
        String t = "abke";
        assertEquals("Impossible", decipherabilityeasy.check(s, t));
    }

}
