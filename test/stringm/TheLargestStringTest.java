package topc.test.stringm;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.stringm.*;

public class TheLargestStringTest {
    TheLargestString thelargeststring = new TheLargestString();

    @Test
    public void case1() {
        String s = "abacaba";
        String t = "zzzaaaa";
        assertEquals("cbaaaa", thelargeststring.find(s, t));
    }

    @Test
    public void case2() {
        String s = "x";
        String t = "x";
        assertEquals("xx", thelargeststring.find(s, t));
    }

    @Test
    public void case3() {
        String s = "abbabbabbababaaaabbababab";
        String t = "bababbaabbbababbbbababaab";
        assertEquals("bbbbbbbbbbbbbbbbbbaaab", thelargeststring.find(s, t));
    }

    @Test
    public void case4() {
        String s = "bo";
        String t = "yg";
        assertEquals("og", thelargeststring.find(s, t));
    }

    @Test
    public void case5() {
        String s = "pyamyeh";
        String t = "wqnqrqp";
        assertEquals("yyqr", thelargeststring.find(s, t));
    }

    @Test
    public void case6() {
        String s = "msncbx";
        String t = "coksfz";
        assertEquals("xz", thelargeststring.find(s, t));
    }

    @Test
    public void case7() {
        String s = "fircvscxggbwkfnqduxwfnfozvsrtkjprep";
        String t = "ggxrpnrvystmwcysyycqpevikeffmznimkk";
        assertEquals("zvtrpkemmk", thelargeststring.find(s, t));
    }

    @Test
    public void case8() {
        String s = "ls";
        String t = "gy";
        assertEquals("sy", thelargeststring.find(s, t));
    }

    @Test
    public void case9() {
        String s = "juvpvaboygpoeylfpb";
        String t = "npljvrvipyamyehwqn";
        assertEquals("yyppeq", thelargeststring.find(s, t));
    }

    @Test
    public void case10() {
        String s = "uxwhmsncbxcoksfzkvatxdknlyjyhfi";
        String t = "xjswnkkufnuxxzrzbmnmgqooketlyhn";
        assertEquals("zz", thelargeststring.find(s, t));
    }

    @Test
    public void case11() {
        String s = "ojwayyzpvscmpsajlfvgubfaaovl";
        String t = "zylntrkdcpwsrtesjwhdizcobzcn";
        assertEquals("zvvvlkchcn", thelargeststring.find(s, t));
    }

    @Test
    public void case12() {
        String s = "ldvgylwgbusbmborxtlh";
        String t = "csmpxohgmgnkeufdxoto";
        assertEquals("yxxx", thelargeststring.find(s, t));
    }

    @Test
    public void case13() {
        String s = "pzshkljugggekjdqzjenpevqgxiepjsrdzj";
        String t = "azujllchhbfqmkimwzobiwybxduunfsksrs";
        assertEquals("zzzzwr", thelargeststring.find(s, t));
    }

    @Test
    public void case14() {
        String s = "srqcozijipfioneed";
        String t = "dpszrnavymmtatbdz";
        assertEquals("zponnmat", thelargeststring.find(s, t));
    }

    @Test
    public void case15() {
        String s = "azuxmhecthlegrpunkdmbppweqtgjoparmowzdqyoxytjbb";
        String t = "hawdydcprjbxphoohpkwqyuhrqzhnbnfuvqnqqlrzjpxiog";
        assertEquals("zzyytjbbaqrpxiog", thelargeststring.find(s, t));
    }

    @Test
    public void case16() {
        String s = "vojbrzmwz";
        String t = "powkjilef";
        assertEquals("zzif", thelargeststring.find(s, t));
    }

    @Test
    public void case17() {
        String s = "qnjwjmwaxxmnsnhhlqqrzudlt";
        String t = "fzotcjtnzxuglsdsmzcnockvf";
        assertEquals("zutocf", thelargeststring.find(s, t));
    }

    @Test
    public void case18() {
        String s = "ucwl";
        String t = "jfri";
        assertEquals("wr", thelargeststring.find(s, t));
    }

    @Test
    public void case19() {
        String s = "bgfcbceyhjugixwtbvtrehbbcpxifbxvfbcgkcfq";
        String t = "ckcotzgkubmjrmbsztsshfroefwsjrxjhguzyupz";
        assertEquals("yxxxvqkmwxjz", thelargeststring.find(s, t));
    }

    @Test
    public void case20() {
        String s = "yxyxyxxyxxyxxyyxyxyxyyyxyyxyyxyyyxyxxyyyyyyxxyx";
        String t = "xxxxxxxxyxyxxxyyxyyxxxxxxyxxyxyyxxxyyyyyxxxyxyx";
        assertEquals("yyyyyyyyyyyyyyyyyyyyyyyyyyyxxxxyxyxyxxxxyxyyyxxyyyxxxy", thelargeststring.find(s, t));
    }

    @Test
    public void case21() {
        String s = "yxyxxxyxxxyyyyyyyyyyyxyxxxxxyxxyxyxyxyxyyyxxyxx";
        String t = "xxyxyxxyxyyxxxxyyxyxyyyxyyxyxyyxyyxxyxxxyyxyyyy";
        assertEquals("yyyyyyyyyyyyyyyyyyyyyyyyxyxyxxxxyyxyxyyxxyxxxyyy", thelargeststring.find(s, t));
    }

    @Test
    public void case22() {
        String s = "xxxxxyxyxyyxxyxxxyxxxxyyyxxxyxxyyyyxxyyxxxyyyxy";
        String t = "yyyxyxyxxyyxxyxyyxyxxyyxyyxyxxyyyyxyyyyxyyyyxxy";
        assertEquals("yyyyyyyyyyyyyyyyyyyyyyyyyyxy", thelargeststring.find(s, t));
    }

    @Test
    public void case23() {
        String s = "xyyxyxxxyxxxyyyxyxxyxyyxxxyyxyxxxxyyxyxyyxxx";
        String t = "xxxyyxyyxyyxyxxyxxyyxyyyyxyxyyyxyyyyxxxxxxyx";
        assertEquals("yyyyyyyyyyyyyyyyyyyyyxxx", thelargeststring.find(s, t));
    }

    @Test
    public void case24() {
        String s = "yyxxxxyxxyyxxxyxxyxxxyxyxyyxxyxxyyyxyyyxyxxxyx";
        String t = "yyyyxxxxxxyyyyyxxxxyxyxyxyxxyyyxxyyxyxyxyyyxxx";
        assertEquals("yyyyyyyyyyyyyyyyyyyyyyyyyyyx", thelargeststring.find(s, t));
    }

    @Test
    public void case25() {
        String s = "xyyyyyxxyxyxyyyyyyyxxyyxxxxxyyxyyyyyyxyxyxxyyyy";
        String t = "yyxxxyyxxyyyxyxxyxyxxyxyyyyxxyyxxxyxyxyyxxxyxxy";
        assertEquals("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyxxxyxyxyxxyxyyxxyxxxyxyyxyxxy", thelargeststring.find(s, t));
    }

    @Test
    public void case26() {
        String s = "yyxyxyyyyxxyyxyyyyyxyxyyyyyxxyxyxxyxyxxxyyxyyy";
        String t = "xyxyyxxxyyyxxxxyyyyxxyxxyxyyyxxxyxyyyxyxyxxxyy";
        assertEquals("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyxxxyxxxyyyyxxxyxyxxyyyxxyy", thelargeststring.find(s, t));
    }

    @Test
    public void case27() {
        String s = "yxyyyyyyxxxxyxxxxxyyxxxyxyyxyxyyxxyyyxxyxxyyy";
        String t = "yyxxyxxyyxxxxxxyyxyxxyyyxxyxxxxxxxyyyxyyyyxxx";
        assertEquals("yyyyyyyyyyyyyyyyyyyyyyyyxxyxxyxyxyxyxxxyyyyxxx", thelargeststring.find(s, t));
    }

    @Test
    public void case28() {
        String s = "yyyxxxxxxyyxyxyyxyyxxyxxxyyyxyxyyyyyxxyyxyxx";
        String t = "yxyxxyyyyyyyxxyxyyyyxyxxxxyxxxxyyyyyxxyxyxxy";
        assertEquals("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyxx", thelargeststring.find(s, t));
    }

    @Test
    public void case29() {
        String s = "yyxyxyxxyyxxxyyxyxyyxxxxxyyxxxyxyxyyxyxyyxyyx";
        String t = "xxxyyyxxxxyxxxyxxxyxxyxyxyxxxyxyyxyxxyxxxxyxx";
        assertEquals("yyyyyyyyyyyyyyyyyyyyyyxxyyxxxyxyxyxxyyxyxxyx", thelargeststring.find(s, t));
    }

    @Test
    public void case30() {
        String s = "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn";
        String t = "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn";
        assertEquals("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", thelargeststring.find(s, t));
    }

    @Test
    public void case31() {
        String s = "nn";
        String t = "nn";
        assertEquals("nnnn", thelargeststring.find(s, t));
    }

    @Test
    public void case32() {
        String s = "nnnnnnnnnnnnnnnnnn";
        String t = "nnnnnnnnnnnnnnnnnn";
        assertEquals("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", thelargeststring.find(s, t));
    }

    @Test
    public void case33() {
        String s = "sssssssssssssssssssssssssssssssssssssssssssssss";
        String t = "wcysyycqpevikeffmznimkkasvwsrenzkycxfxtlsgypsfa";
        assertEquals("sz", thelargeststring.find(s, t));
    }

    @Test
    public void case34() {
        String s = "sssssssssssssssssssssssssssssssssssssssss";
        String t = "loovaowuxwhmsncbxcoksfzkvatxdknlyjyhfixjs";
        assertEquals("sz", thelargeststring.find(s, t));
    }

    @Test
    public void case35() {
        String s = "ztxxvvwzyzyyzuuyuvtxytxwwxxvyvtxuuxutxwtuxyu";
        String t = "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee";
        assertEquals("zzzzyyyyueeeeeeeee", thelargeststring.find(s, t));
    }

    @Test
    public void case36() {
        String s = "xxyvxuvzzyuvuwutztwxuvyvtyvtuwwywwyzxzv";
        String t = "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee";
        assertEquals("zzzzzveeeeee", thelargeststring.find(s, t));
    }

    @Test
    public void case37() {
        String s = "yzxxxxzxyyxzzzzxzxxyzyyxzxzxxzxyzyzzyxxyzxyyyzz";
        String t = "aaaaaaaababaaabbabbaaaaaabaababbaaabbbbbaaababa";
        assertEquals("zzzzzzzzzzzzzzzzzaaaaabaaaaaaababa", thelargeststring.find(s, t));
    }

    @Test
    public void case38() {
        String s = "xyzyzyxyyyxzyxyzxxzzyzzxzyzyxzxzxzyzxzzxyxzzyzz";
        String t = "aababaababbaaaabbababbbabbababbabbaabaaabbabbbb";
        assertEquals("zzzzzzzzzzzzzzzzzzzzbbabbabbbababaaaabbb", thelargeststring.find(s, t));
    }

    @Test
    public void case39() {
        String s = "xxyyzzyzzzxyyxzxzxxzyzzzyxxxzxzxyzzxyzzzzzxyzxx";
        String t = "bbbababaabbaababbabaabbabbabaabbbbabbbbabbbbaab";
        assertEquals("zzzzzzzzzzzzzzzzzzzzzxxbaaabababbaabbabbabbaab", thelargeststring.find(s, t));
    }

    @Test
    public void case40() {
        String s = "bababaabaabaabbabababbbabbabbabbbabaabbbbbbaaba";
        String t = "aaaaaaaababaaabbabbaaaaaabaababbaaabbbbbaaababa";
        assertEquals("bbbbbbbbbbbbbbbbbbbbbbbbbbbaaaabababaaaababbbaabbbaaab", thelargeststring.find(s, t));
    }

    @Test
    public void case41() {
        String s = "babaaabaaabbbbbbbbbbbabaaaaabaabababababbbaabaa";
        String t = "aababaababbaaaabbababbbabbababbabbaabaaabbabbbb";
        assertEquals("bbbbbbbbbbbbbbbbbbbbbbbbababaaaabbababbaabaaabbb", thelargeststring.find(s, t));
    }

    @Test
    public void case42() {
        String s = "aaaaabababbaabaaabaaaabbbaaabaabbbbaabbaaabbbab";
        String t = "bbbababaabbaababbabaabbabbabaabbbbabbbbabbbbaab";
        assertEquals("bbbbbbbbbbbbbbbbbbbbbbbbbbab", thelargeststring.find(s, t));
    }

    @Test
    public void case43() {
        String s = "abbabaaabaaabbbabaababbaaabbabaaaabbababbaaaaaa";
        String t = "bbabbabbabaabaabbabbbbababbbabbbbaaaaaababaaabb";
        assertEquals("bbbbbbbbbbbbbbbbbbbbbbbaaaba", thelargeststring.find(s, t));
    }

    @Test
    public void case44() {
        String s = "nmnknkmlkmlkmnnmnmlknnnmnnmllklnlknkmllnnllmknm";
        String t = "llllllllmlmlllmmlmmllllllmllmlmmlllmmmmmlllmlml";
        assertEquals("nnnnnnnnnnnnnnnnmllllmlllllmmlmlml", thelargeststring.find(s, t));
    }

    @Test
    public void case45() {
        String s = "nmnkmmlkmmnnnllnlnlllmlkmmmmlkknmnmnklknnlmmnkm";
        String t = "llmlmllmlmmllllmmlmlmmmlmmlmlmmlmmllmlllmmlmmmm";
        assertEquals("nnnnnnnnnnnnnmlmmllmllmllmmm", thelargeststring.find(s, t));
    }

    @Test
    public void case46() {
        String s = "kmmkmnmlmnnkknmmknkmmmnllmkklmmnlnlkklnkkmnllkl";
        String t = "mmmlmlmllmmllmlmmlmllmmlmmlmllmmmmlmmmmlmmmmllm";
        assertEquals("nnnnnnnnnnlmmmlmmmmm", thelargeststring.find(s, t));
    }

    @Test
    public void case47() {
        String s = "ab";
        String t = "zy";
        assertEquals("by", thelargeststring.find(s, t));
    }

    @Test
    public void case48() {
        String s = "acabcbabccbaaabbaaacbbaccabaccababcaccbccbcbacc";
        String t = "cccbbccaacbcccabbbcccabbbbacbacbaacababccccacca";
        assertEquals("ccccccccccccccccccbbbacbacccca", thelargeststring.find(s, t));
    }

    @Test
    public void case49() {
        String s = "cdaccbcacdbbbcdddadabbabacaacadcabcbbadddcbdcdc";
        String t = "cdadbccddacaadbcccaabbbacacbdbcdddcdccaabaadaab";
        assertEquals("dddddddddddddabccacaabda", thelargeststring.find(s, t));
    }

    @Test
    public void case50() {
        String s = "abaababbcacbccbbaabaacabbcbbbcacbbcbbbaabcbbaba";
        String t = "cacacccaacacccaacaccbbcbacbccbccabcbbbabbbcbbba";
        assertEquals("cccccccccccb", thelargeststring.find(s, t));
    }

    @Test
    public void case51() {
        String s = "pxxxt";
        String t = "zyxyz";
        assertEquals("xy", thelargeststring.find(s, t));
    }

    @Test
    public void case52() {
        String s = "tttttttttttttttttttttttttttttttttttttdaa";
        String t = "atttttttttttttttttttttttttttttttttttbyyy";
        assertEquals("tttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttb", thelargeststring.find(s, t));
    }

    @Test
    public void case53() {
        String s = "bbabbbbbabaabaaab";
        String t = "abaaaaaaabaabaaab";
        assertEquals("bbbbbbbbbbabaaaaabbb", thelargeststring.find(s, t));
    }

    @Test
    public void case54() {
        String s = "dcba";
        String t = "cbcd";
        assertEquals("dccb", thelargeststring.find(s, t));
    }

    @Test
    public void case55() {
        String s = "cqmcirgbmqxrnvaynmxnoltgcoomypqxcaapftrrbgegbes";
        String t = "onvczzppgtiyxeutpuydqrhlwuxmzfypgkrldgamysdngrk";
        assertEquals("yz", thelargeststring.find(s, t));
    }

    @Test
    public void case56() {
        String s = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
        String t = "zzaazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
        assertEquals("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", thelargeststring.find(s, t));
    }

    @Test
    public void case57() {
        String s = "ebeda";
        String t = "azefa";
        assertEquals("eedaef", thelargeststring.find(s, t));
    }

    @Test
    public void case58() {
        String s = "bbbbb";
        String t = "aabbb";
        assertEquals("bbbbbb", thelargeststring.find(s, t));
    }

    @Test
    public void case59() {
        String s = "beedcabbacbccbdcbecadcdbdcccdebadaebaabdeebbbeb";
        String t = "caedeacbcbedcbabdceebdebdecebdacbcdaeabddeabded";
        assertEquals("eeeeeeeecdddee", thelargeststring.find(s, t));
    }

    @Test
    public void case60() {
        String s = "dcdba";
        String t = "aaecb";
        assertEquals("de", thelargeststring.find(s, t));
    }

    @Test
    public void case61() {
        String s = "abcdefghijklmnopqrstuvwxyzaaaaaaaaaaaaaaaaaaaaa";
        String t = "zyxwvutsrqponmlkjihgfedcbazzzzzzzzzzzzzzzzzzzzz";
        assertEquals("zaaz", thelargeststring.find(s, t));
    }

    @Test
    public void case62() {
        String s = "bacbacccabcaccbcacbbaaccccbccbaccbbaaccabacacac";
        String t = "bbbabbbbabcacbbaaabbacbcabcacbaacacaaaccacacbaa";
        assertEquals("ccccccccccccccccccccccbbbbccbaabcabacacacaba", thelargeststring.find(s, t));
    }

    @Test
    public void case63() {
        String s = "ccbb";
        String t = "axzz";
        assertEquals("cx", thelargeststring.find(s, t));
    }

    @Test
    public void case64() {
        String s = "bcbdcbbbabdbbbacdbbaaaddcdbcdabbaddaaabccdbdac";
        String t = "daaaabadccdbaccccdaadbcacdadaaccaaacdacbbcbacd";
        assertEquals("dddddddddddccadaaaca", thelargeststring.find(s, t));
    }

    @Test
    public void case65() {
        String s = "cbccbb";
        String t = "acbccb";
        assertEquals("cccbbabccb", thelargeststring.find(s, t));
    }

    @Test
    public void case66() {
        String s = "ccb";
        String t = "cab";
        assertEquals("ccca", thelargeststring.find(s, t));
    }

    @Test
    public void case67() {
        String s = "zzzyyyxxxwwwvvvuuutttksssrrrqqqpppooonnnmmmlllk";
        String t = "lzlkgkggjziwerojerjrjjflslzddghowfjeqwlfdhsoiqr";
        assertEquals("zzzyyyxxxwwwvvvuuutttsssrrrqqqpppooonnnmmmlzlkgkggjziwerojerjrjflslzddghowfjeqwlfdhs", thelargeststring.find(s, t));
    }

    @Test
    public void case68() {
        String s = "bdddeeefffggghhhgggfffaaaeeedddccccccccbbbaaa";
        String t = "xxxxxxxxxxxxxcccccccccxxxcccccccddedfeccccccc";
        assertEquals("hhhgggfffeeedddccccccccccccccccf", thelargeststring.find(s, t));
    }

    @Test
    public void case69() {
        String s = "baaaaa";
        String t = "ajfsdk";
        assertEquals("baas", thelargeststring.find(s, t));
    }

    @Test
    public void case70() {
        String s = "lmllaaffkkklkkkkkkkkkkkkkkkkkkkkkkkkkkkkgf";
        String t = "zfzxyyyzzabzooppppppppppppnpppppppppppppzp";
        assertEquals("mlllkkkkkkkkkkkkkkkkkkkkkkkkkkkkgfzxzooppppppppppppnpppppppppppppz", thelargeststring.find(s, t));
    }

    @Test
    public void case71() {
        String s = "prrrtpstppqqsrtpssrrtttrptspsqtqrpqrrqtpsqrtqrs";
        String t = "qtpqqtqsqprrtqsrqtrpststpsppqsqtprttrtrpqtsttrs";
        assertEquals("ttttttttttsqssstssqrts", thelargeststring.find(s, t));
    }

    @Test
    public void case72() {
        String s = "baabbbbaacacbcbcaccbccaacaccabacbbccbcccbaabbbb";
        String t = "bacaaacbaabccbccbacabaccaacbbababbaaacbaccccabb";
        assertEquals("cccccccccccccccccbcacbaacbaaacba", thelargeststring.find(s, t));
    }

    @Test
    public void case73() {
        String s = "abazardfgb";
        String t = "acabbzaezz";
        assertEquals("zrgbzz", thelargeststring.find(s, t));
    }

    @Test
    public void case74() {
        String s = "xukaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String t = "dupaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        assertEquals("xukdup", thelargeststring.find(s, t));
    }

    @Test
    public void case75() {
        String s = "aaaaaaaaaaaaaaazzzzzaaaaaaaaaaaaaabbccccc";
        String t = "aaaaaaaaaaaaaaazzxzyaaaaaaaaaaaaaabbccccc";
        assertEquals("zzzzzzzy", thelargeststring.find(s, t));
    }

    @Test
    public void case76() {
        String s = "qweriouylkjhlakjsdfhljkhqwerlkqwjehrlkjqwhelrkj";
        String t = "lkzqwheroiuysalkdjhlkqjwehrlkjhqwlkejrhlqkwjehr";
        assertEquals("ywwwrrhqqe", thelargeststring.find(s, t));
    }

    @Test
    public void case77() {
        String s = "cccccccccccccccccccccccc";
        String t = "cbcbaccccccccccccccccccc";
        assertEquals("cccccccccccccccccccccccccccccccccccccccccc", thelargeststring.find(s, t));
    }

    @Test
    public void case78() {
        String s = "edcc";
        String t = "ccaz";
        assertEquals("edcccz", thelargeststring.find(s, t));
    }

    @Test
    public void case79() {
        String s = "cccc";
        String t = "cbac";
        assertEquals("cccccbac", thelargeststring.find(s, t));
    }

    @Test
    public void case80() {
        String s = "dddc";
        String t = "cdaa";
        assertEquals("dddcda", thelargeststring.find(s, t));
    }

    @Test
    public void case81() {
        String s = "bb";
        String t = "cb";
        assertEquals("bc", thelargeststring.find(s, t));
    }

    @Test
    public void case82() {
        String s = "babbababbbbaaaba";
        String t = "abbabaababbbbaba";
        assertEquals("bbbbbbbbbb", thelargeststring.find(s, t));
    }

    @Test
    public void case83() {
        String s = "qjtdmfglucqcrvswvtrkdwxqdwmmxeqpnpovpugsejgqgtb";
        String t = "leegifdlcaajkilggehgdjiheijhjklgkcejjcjilkiiedh";
        assertEquals("xxvutijjcd", thelargeststring.find(s, t));
    }

    @Test
    public void case84() {
        String s = "bbbbaabbbbbbababbaabbabbabbabbbbbbbbaaabababbba";
        String t = "babaaabbbabbaabaabbbbabbbbaabbbaaabbbabbbbbaaaa";
        assertEquals("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbaaa", thelargeststring.find(s, t));
    }

    @Test
    public void case85() {
        String s = "yy";
        String t = "az";
        assertEquals("yz", thelargeststring.find(s, t));
    }

    @Test
    public void case86() {
        String s = "eeb";
        String t = "acd";
        assertEquals("eebacd", thelargeststring.find(s, t));
    }

    @Test
    public void case87() {
        String s = "zyxwvutsrqponmlkjihgfedcbazzzzzzzzzzzzzzzzzzzzz";
        String t = "abcdefghijklmnopqrstuvwxyzaaaaaaaaaaaaaaaaaaaaa";
        assertEquals("zzzzzzzzzzzzzzzzzzzzzzaaaaaaaaaaaaaaaaaaaaaa", thelargeststring.find(s, t));
    }

    @Test
    public void case88() {
        String s = "ccbcacbcbccccaabbcabacaccabcababccacccabacccacc";
        String t = "bccacbaaaacabacccaacccbbbcbcbcccbacacccabcbbcaa";
        assertEquals("ccccccccccccccccccccccccbcabaacabacbbcbaacccbbaa", thelargeststring.find(s, t));
    }

    @Test
    public void case89() {
        String s = "daba";
        String t = "baad";
        assertEquals("dbba", thelargeststring.find(s, t));
    }

    @Test
    public void case90() {
        String s = "nlbmbcazwkhdqcxjofxjbdesrbncygxkoelmaqwhpmohwke";
        String t = "wrbqhdrokyidsdrmwrsylbfacyedgxplrlnppfkokcqnnuw";
        assertEquals("zyxwwogpkn", thelargeststring.find(s, t));
    }

    @Test
    public void case91() {
        String s = "bbbb";
        String t = "baac";
        assertEquals("bc", thelargeststring.find(s, t));
    }

    @Test
    public void case92() {
        String s = "aaa";
        String t = "zzb";
        assertEquals("az", thelargeststring.find(s, t));
    }

    @Test
    public void case93() {
        String s = "zyq";
        String t = "jxc";
        assertEquals("zyqjxc", thelargeststring.find(s, t));
    }

    @Test
    public void case94() {
        String s = "eeb";
        String t = "adb";
        assertEquals("eebadb", thelargeststring.find(s, t));
    }

    @Test
    public void case95() {
        String s = "zbbbb";
        String t = "babzz";
        assertEquals("zbbz", thelargeststring.find(s, t));
    }

    @Test
    public void case96() {
        String s = "twcyrazmsoxceysvsuxaewojwyndreionmzjeibqoxeuber";
        String t = "vfiznrrghzpcypfwsvuexfopovgakoigtwizfzkizsuthws";
        assertEquals("zzxurrists", thelargeststring.find(s, t));
    }

    @Test
    public void case97() {
        String s = "bbabbabababbbbbbababbbaabbaaabbaaabbbbaabbaabba";
        String t = "baaaaabbbabaabaababaababaaaaabaabaabababbbababb";
        assertEquals("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbaabaaaaabaabaababbbab", thelargeststring.find(s, t));
    }

    @Test
    public void case98() {
        String s = "ccb";
        String t = "bdd";
        assertEquals("cd", thelargeststring.find(s, t));
    }

    @Test
    public void case99() {
        String s = "bb";
        String t = "aa";
        assertEquals("bbaa", thelargeststring.find(s, t));
    }

    @Test
    public void case100() {
        String s = "ffffffffff";
        String t = "fffabcffff";
        assertEquals("ffffffffffffff", thelargeststring.find(s, t));
    }

    @Test
    public void case101() {
        String s = "guuauusup";
        String t = "xnuqrrsuf";
        assertEquals("uuuuurru", thelargeststring.find(s, t));
    }

    @Test
    public void case102() {
        String s = "bheajeiiceffbhbbfchgbecdccbabdceebdebdecebdacbc";
        String t = "eigfajaagbdijdeegaggbiejgdhiicjbdfjieahgdgbfeca";
        assertEquals("jiihhgeeeeeedccaaadggibdihdbea", thelargeststring.find(s, t));
    }

    @Test
    public void case103() {
        String s = "ccbbcbaabcccbabcbcaaaacabbaccccacaabcbbacacaaca";
        String t = "bcbccbaabcabbbccaabbcbbcacabcaaacacabacbccbaacb";
        assertEquals("ccccccccccccccccccccabcabbcaacbcbc", thelargeststring.find(s, t));
    }

    @Test
    public void case104() {
        String s = "dddbdcaddb";
        String t = "cbacacdabd";
        assertEquals("ddddddcbaaab", thelargeststring.find(s, t));
    }

    @Test
    public void case105() {
        String s = "aa";
        String t = "bb";
        assertEquals("ab", thelargeststring.find(s, t));
    }

    @Test
    public void case106() {
        String s = "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbaabaa";
        String t = "babaabababbbabbbabaaabbaaabbbbbbbbaaaaacbbcb";
        assertEquals("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbaaaaab", thelargeststring.find(s, t));
    }

    @Test
    public void case107() {
        String s = "ba";
        String t = "bb";
        assertEquals("bb", thelargeststring.find(s, t));
    }

    @Test
    public void case108() {
        String s = "bbbbb";
        String t = "bzbaz";
        assertEquals("bz", thelargeststring.find(s, t));
    }

    @Test
    public void case109() {
        String s = "cccbbb";
        String t = "aadddd";
        assertEquals("cd", thelargeststring.find(s, t));
    }

    @Test
    public void case110() {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String t = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", thelargeststring.find(s, t));
    }

    @Test
    public void case111() {
        String s = "yyyyyyyyyyyyyyy";
        String t = "abcdwxyzyxwdcba";
        assertEquals("yz", thelargeststring.find(s, t));
    }

    @Test
    public void case112() {
        String s = "bbbbbaa";
        String t = "abbabaa";
        assertEquals("bbbbbbab", thelargeststring.find(s, t));
    }

    @Test
    public void case113() {
        String s = "bbbbbbbbbbbbbbbbbbbbbbababaaabaababbaabaabbaa";
        String t = "baaaaababbbbbbbbbbbbabbbababbaabababbabababba";
        assertEquals("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbaaabbab", thelargeststring.find(s, t));
    }

    @Test
    public void case114() {
        String s = "badfncncbagnhgmhhhgcamiii";
        String t = "cacambmgbbgmacohhghacozzz";
        assertEquals("nnnmmmmo", thelargeststring.find(s, t));
    }

    @Test
    public void case115() {
        String s = "bbbbbbb";
        String t = "zxcyzcx";
        assertEquals("bz", thelargeststring.find(s, t));
    }

    @Test
    public void case116() {
        String s = "za";
        String t = "za";
        assertEquals("zz", thelargeststring.find(s, t));
    }

    @Test
    public void case117() {
        String s = "abbbbaabab";
        String t = "aaabbabbba";
        assertEquals("bbbbbbba", thelargeststring.find(s, t));
    }

    @Test
    public void case118() {
        String s = "zzzzz";
        String t = "aazzz";
        assertEquals("zzzzzz", thelargeststring.find(s, t));
    }

    @Test
    public void case119() {
        String s = "xbbb";
        String t = "bbcb";
        assertEquals("xbbc", thelargeststring.find(s, t));
    }

    @Test
    public void case120() {
        String s = "ccc";
        String t = "aax";
        assertEquals("cx", thelargeststring.find(s, t));
    }

    @Test
    public void case121() {
        String s = "syqeie";
        String t = "ycpvkf";
        assertEquals("yqiecpkf", thelargeststring.find(s, t));
    }

    @Test
    public void case122() {
        String s = "cbbbab";
        String t = "bacbda";
        assertEquals("cbbc", thelargeststring.find(s, t));
    }

    @Test
    public void case123() {
        String s = "ssp";
        String t = "ezr";
        assertEquals("sz", thelargeststring.find(s, t));
    }

    @Test
    public void case124() {
        String s = "aaa";
        String t = "xzy";
        assertEquals("az", thelargeststring.find(s, t));
    }

    @Test
    public void case125() {
        String s = "cba";
        String t = "zyx";
        assertEquals("cz", thelargeststring.find(s, t));
    }

    @Test
    public void case126() {
        String s = "bb";
        String t = "dc";
        assertEquals("bd", thelargeststring.find(s, t));
    }

    @Test
    public void case127() {
        String s = "dddccc";
        String t = "azaaza";
        assertEquals("dz", thelargeststring.find(s, t));
    }

    @Test
    public void case128() {
        String s = "cccbba";
        String t = "abaaaa";
        assertEquals("cccbbabaaa", thelargeststring.find(s, t));
    }

    @Test
    public void case129() {
        String s = "eecee";
        String t = "ddcfa";
        assertEquals("ef", thelargeststring.find(s, t));
    }

    @Test
    public void case130() {
        String s = "zca";
        String t = "zab";
        assertEquals("zz", thelargeststring.find(s, t));
    }

    @Test
    public void case131() {
        String s = "yyyyxxxx";
        String t = "ayxyaaaa";
        assertEquals("yyyyxy", thelargeststring.find(s, t));
    }

    @Test
    public void case132() {
        String s = "zzc";
        String t = "zab";
        assertEquals("zzza", thelargeststring.find(s, t));
    }

    @Test
    public void case133() {
        String s = "zzzzzzzzzzbbzzzzzzzzzzbbzzzzzzzzzzbbzzzzzzzzzzb";
        String t = "hsrthefwjtyktuqfrkuafhjtyyuoqvhkyuzzeyiyiqewgfd";
        assertEquals("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzhsrthefwjttuqfrkuafhyyuoqvhkyueyiyiqewgf", thelargeststring.find(s, t));
    }

    @Test
    public void case134() {
        String s = "bbaabaaaaabbbbbbbababaabaabaabbabababbbabbabbab";
        String t = "bbabaabbbbbbaabaaaaaaaaababaaabbabbaaaaaabaabab";
        assertEquals("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbaabaaaaabababaaaababb", thelargeststring.find(s, t));
    }

    @Test
    public void case135() {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String t = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", thelargeststring.find(s, t));
    }

    @Test
    public void case136() {
        String s = "aaaaaaaaaaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String t = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaawaaaaaaaaaaxaaa";
        assertEquals("baax", thelargeststring.find(s, t));
    }

    @Test
    public void case137() {
        String s = "bb";
        String t = "bc";
        assertEquals("bc", thelargeststring.find(s, t));
    }

    @Test
    public void case138() {
        String s = "zza";
        String t = "zza";
        assertEquals("zzzz", thelargeststring.find(s, t));
    }

    @Test
    public void case139() {
        String s = "bbaa";
        String t = "baaa";
        assertEquals("bbba", thelargeststring.find(s, t));
    }

    @Test
    public void case140() {
        String s = "mmzkblriqzvukrhxfjxtlfszxaazvwmhdgrcobciwktxlyl";
        String t = "attvlwloyzsbtzabdtfrlajuofdylbhgpkplkkfrnwuyach";
        assertEquals("zzzzytzuyc", thelargeststring.find(s, t));
    }

    @Test
    public void case141() {
        String s = "tgayur";
        String t = "ypveyi";
        assertEquals("yureyi", thelargeststring.find(s, t));
    }

    @Test
    public void case142() {
        String s = "azxb";
        String t = "anax";
        assertEquals("zxna", thelargeststring.find(s, t));
    }

    @Test
    public void case143() {
        String s = "aabadeec";
        String t = "dcacdabe";
        assertEquals("eecabe", thelargeststring.find(s, t));
    }

    @Test
    public void case144() {
        String s = "aaaaaaaa";
        String t = "bcdefghi";
        assertEquals("ai", thelargeststring.find(s, t));
    }

    @Test
    public void case145() {
        String s = "yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy";
        String t = "abcdefbhijklmnopqrstuvwxyzyxwvutsrqponmlkjidcba";
        assertEquals("yz", thelargeststring.find(s, t));
    }

    @Test
    public void case146() {
        String s = "zxzxzxzzzzzzzzxxxxxxxzzxxxxxxxxxzxxxxx";
        String t = "xxxxzxxxxxxxzxxzxzzzzzxzxzxzzzzzzzxzxz";
        assertEquals("zzzzzzzzzzzzzzxxzxxxxxxzxzxz", thelargeststring.find(s, t));
    }

    @Test
    public void case147() {
        String s = "cccccbbbbbbbbbbbbbbbbbbbbbbbbbaaaaaaaaaaaaaaaaa";
        String t = "aaabbbacaabbbabbaabbcaaababcbcbaaabcbbacabbaaba";
        assertEquals("cccccbbbbbbbbbbbbbbbbbbbbbbbbbaaabbbacaabbbabbaabbcaaababcbc", thelargeststring.find(s, t));
    }

    @Test
    public void case148() {
        String s = "bdnlpphfmcnfcbpblkgj";
        String t = "mcahcpnhlhjijilecjmn";
        assertEquals("ppplkjcplcjn", thelargeststring.find(s, t));
    }

    @Test
    public void case149() {
        String s = "sdfnqkwjefhuidhfsjndfsjdkfskdjfnksjdffsdffd";
        String t = "asdfdsaasdhfaskjcnbisadfuhsdaninfirweuhffsd";
        assertEquals("wusssssffdafcasihfsd", thelargeststring.find(s, t));
    }

    @Test
    public void case150() {
        String s = "kkoetbyuqg";
        String t = "ttnvobgtkt";
        assertEquals("yuqgtk", thelargeststring.find(s, t));
    }

    @Test
    public void case151() {
        String s = "gadeb";
        String t = "cfcaf";
        assertEquals("geca", thelargeststring.find(s, t));
    }

    @Test
    public void case152() {
        String s = "bbbaaa";
        String t = "bbczzz";
        assertEquals("bc", thelargeststring.find(s, t));
    }

    @Test
    public void case153() {
        String s = "dueowyzvcpal";
        String t = "itijaypsmsjf";
        assertEquals("zvps", thelargeststring.find(s, t));
    }

    @Test
    public void case154() {
        String s = "ppkk";
        String t = "kkml";
        assertEquals("ppkkkm", thelargeststring.find(s, t));
    }

    @Test
    public void case155() {
        String s = "zwc";
        String t = "cdx";
        assertEquals("zwcd", thelargeststring.find(s, t));
    }

    @Test
    public void case156() {
        String s = "bbababbbba";
        String t = "baabababaa";
        assertEquals("bbbbbbbbbaba", thelargeststring.find(s, t));
    }

    @Test
    public void case157() {
        String s = "pmkd";
        String t = "kdca";
        assertEquals("pmkkdc", thelargeststring.find(s, t));
    }

    @Test
    public void case158() {
        String s = "ccccccccccccccccccccccccccccccccccccccccccccccb";
        String t = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadd";
        assertEquals("cd", thelargeststring.find(s, t));
    }

    @Test
    public void case159() {
        String s = "zccccccccccccccc";
        String t = "caaccccccccccccc";
        assertEquals("zccccccccccccccccccccccccccc", thelargeststring.find(s, t));
    }

    @Test
    public void case160() {
        String s = "apapppppab";
        String t = "aaznppbaaa";
        assertEquals("ppppppbanppbaa", thelargeststring.find(s, t));
    }

    @Test
    public void case161() {
        String s = "zzy";
        String t = "aza";
        assertEquals("zzyaza", thelargeststring.find(s, t));
    }

    @Test
    public void case162() {
        String s = "baababbabb";
        String t = "abaaabbaba";
        assertEquals("bbbbbbba", thelargeststring.find(s, t));
    }

    @Test
    public void case163() {
        String s = "aaaaaa";
        String t = "xyzzwq";
        assertEquals("az", thelargeststring.find(s, t));
    }

    @Test
    public void case164() {
        String s = "zsn";
        String t = "yjv";
        assertEquals("zy", thelargeststring.find(s, t));
    }

    @Test
    public void case165() {
        String s = "baa";
        String t = "baa";
        assertEquals("bb", thelargeststring.find(s, t));
    }

    @Test
    public void case166() {
        String s = "mmm";
        String t = "baz";
        assertEquals("mz", thelargeststring.find(s, t));
    }

    @Test
    public void case167() {
        String s = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        String t = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", thelargeststring.find(s, t));
    }

    @Test
    public void case168() {
        String s = "fbccafea";
        String t = "dedcbggb";
        assertEquals("fg", thelargeststring.find(s, t));
    }

    @Test
    public void case169() {
        String s = "ccbc";
        String t = "abcb";
        assertEquals("cccabb", thelargeststring.find(s, t));
    }

    @Test
    public void case170() {
        String s = "caabcbaccbccaccaccbbbbcacbcabcacb";
        String t = "aaccbabbcacaccccacaaacccbababccac";
        assertEquals("ccccccccccccccccbbca", thelargeststring.find(s, t));
    }

    @Test
    public void case171() {
        String s = "jhabdjhcgd";
        String t = "gchdfjaicb";
        assertEquals("jjhgja", thelargeststring.find(s, t));
    }

    @Test
    public void case172() {
        String s = "bbbb";
        String t = "aaaf";
        assertEquals("bf", thelargeststring.find(s, t));
    }

    @Test
    public void case173() {
        String s = "bbbbbb";
        String t = "zyxfkr";
        assertEquals("bz", thelargeststring.find(s, t));
    }

    @Test
    public void case174() {
        String s = "zddd";
        String t = "dzxy";
        assertEquals("zddz", thelargeststring.find(s, t));
    }

    @Test
    public void case175() {
        String s = "ddd";
        String t = "aac";
        assertEquals("dddaac", thelargeststring.find(s, t));
    }

    @Test
    public void case176() {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String t = "dbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb";
        assertEquals("ad", thelargeststring.find(s, t));
    }

    @Test
    public void case177() {
        String s = "yhf";
        String t = "gdc";
        assertEquals("yhgd", thelargeststring.find(s, t));
    }

    @Test
    public void case178() {
        String s = "xxxxx";
        String t = "aaxxx";
        assertEquals("xxxxxx", thelargeststring.find(s, t));
    }

    @Test
    public void case179() {
        String s = "dddddddddccccccbbbbbbbbaaaaaaaaaaaaaaaaaaaaa";
        String t = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        assertEquals("dddddddddccccccbbbbbbbbaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", thelargeststring.find(s, t));
    }

    @Test
    public void case180() {
        String s = "cabcb";
        String t = "adbdc";
        assertEquals("cd", thelargeststring.find(s, t));
    }

    @Test
    public void case181() {
        String s = "qqqqqq";
        String t = "aaaqqb";
        assertEquals("qqqqqqaaaqqb", thelargeststring.find(s, t));
    }

    @Test
    public void case182() {
        String s = "ca";
        String t = "bd";
        assertEquals("cb", thelargeststring.find(s, t));
    }

    @Test
    public void case183() {
        String s = "bbbbbb";
        String t = "aabbbb";
        assertEquals("bbbbbbbb", thelargeststring.find(s, t));
    }

    @Test
    public void case184() {
        String s = "uki";
        String t = "bqw";
        assertEquals("ukibqw", thelargeststring.find(s, t));
    }

    @Test
    public void case185() {
        String s = "qaozmixrpifeffeclhbvfukbyeqfqojwtwosileeztxwjlk";
        String t = "ngbqqmbxqcqptkhhqrqdwfcayssyoqcjomwufbdfxudzhif";
        assertEquals("zzxwqxdz", thelargeststring.find(s, t));
    }

    @Test
    public void case186() {
        String s = "cb";
        String t = "ca";
        assertEquals("cc", thelargeststring.find(s, t));
    }

    @Test
    public void case187() {
        String s = "cbb";
        String t = "aac";
        assertEquals("cbbaac", thelargeststring.find(s, t));
    }

    @Test
    public void case188() {
        String s = "ccccc";
        String t = "baccc";
        assertEquals("cccccc", thelargeststring.find(s, t));
    }

    @Test
    public void case189() {
        String s = "ccccccc";
        String t = "aaaacca";
        assertEquals("cccccccaaaacca", thelargeststring.find(s, t));
    }

    @Test
    public void case190() {
        String s = "zbbb";
        String t = "bbbz";
        assertEquals("zbbz", thelargeststring.find(s, t));
    }

    @Test
    public void case191() {
        String s = "ccc";
        String t = "bbd";
        assertEquals("cd", thelargeststring.find(s, t));
    }

    @Test
    public void case192() {
        String s = "aaaaa";
        String t = "aaaaa";
        assertEquals("aaaaaaaaaa", thelargeststring.find(s, t));
    }

    @Test
    public void case193() {
        String s = "zzzfe";
        String t = "fgezz";
        assertEquals("zzzfge", thelargeststring.find(s, t));
    }

    @Test
    public void case194() {
        String s = "xmwbqewowqrudqfsshhtrhqgjdnytrotgwxlymbe";
        String t = "iunwktyxrnnvpfosjbcjsennkbzoqmvxhtxtxqxu";
        assertEquals("yyox", thelargeststring.find(s, t));
    }

    @Test
    public void case195() {
        String s = "bababbaabaaaababbbaabbaaababbbabababbbbaabbbbbb";
        String t = "abaaababbaaabbbababbbbbbabbabbabaabbabbabaaaabb";
        assertEquals("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbaaaabb", thelargeststring.find(s, t));
    }

    @Test
    public void case196() {
        String s = "zzyyxxwwvvuuttssrrqqppoonnmmllkkjjiihhggffeedd";
        String t = "ycycycycycycycycycycycycycycycycycycycycycycyc";
        assertEquals("zzyyycyc", thelargeststring.find(s, t));
    }

    @Test
    public void case197() {
        String s = "phqghumeaylnlfdxfircvscxggbwkfnqduxwfnfozvsrtkj";
        String t = "pggxrpnrvystmwcysyycqpevikeffmznimkkasvwsrenzky";
        assertEquals("zvtsrz", thelargeststring.find(s, t));
    }

    @Test
    public void case198() {
        String s = "bbbcabbbbacabccaacbcaabbbcaccbaccacacbcbcaaabbc";
        String t = "ccaacbcccbbbbccacaccaabcaabccaccaccbbcacbaabbcc";
        assertEquals("ccccccccccccccccccbabc", thelargeststring.find(s, t));
    }

    @Test
    public void case199() {
        String s = "ggggbefb";
        String t = "aggdegdc";
        assertEquals("gggggd", thelargeststring.find(s, t));
    }

    @Test
    public void case200() {
        String s = "xxaaaa";
        String t = "aayyyy";
        assertEquals("xxaaay", thelargeststring.find(s, t));
    }

    @Test
    public void case201() {
        String s = "hgfafegdahfhefadbgaaccgeecbebhceacc";
        String t = "cfadcchhgbebhchhghcghgbhcgeefchcgdf";
        assertEquals("hhhhecccbbccdf", thelargeststring.find(s, t));
    }

    @Test
    public void case202() {
        String s = "bb";
        String t = "ab";
        assertEquals("bbab", thelargeststring.find(s, t));
    }

    @Test
    public void case203() {
        String s = "ihqznazgdmzqcpiuudjucvyjimlivqpdzhfnhevksudvjlr";
        String t = "grcavxzehlrqgjhmjqtyzztjsnopyagetjfqiexqroiayro";
        assertEquals("zzzzvvrazrtxao", thelargeststring.find(s, t));
    }

    @Test
    public void case204() {
        String s = "aa";
        String t = "cb";
        assertEquals("ac", thelargeststring.find(s, t));
    }

    @Test
    public void case205() {
        String s = "cabbcabcabcab";
        String t = "bcabcabcabcab";
        assertEquals("cccccc", thelargeststring.find(s, t));
    }

    @Test
    public void case206() {
        String s = "cccbb";
        String t = "abddd";
        assertEquals("cd", thelargeststring.find(s, t));
    }

    @Test
    public void case207() {
        String s = "edcba";
        String t = "abcde";
        assertEquals("edcbabcd", thelargeststring.find(s, t));
    }

    @Test
    public void case208() {
        String s = "zzzzyyyyzbzbsserdxerdfesderzzzzzzzz";
        String t = "abbbcccxafddzzzzzzzzzzzzzzzzzzzzzzz";
        assertEquals("zzzzzzzzzzzzzzzz", thelargeststring.find(s, t));
    }

    @Test
    public void case209() {
        String s = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
        String t = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
        assertEquals("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", thelargeststring.find(s, t));
    }

    @Test
    public void case210() {
        String s = "babaaabbba";
        String t = "abaababbba";
        assertEquals("bbbbbb", thelargeststring.find(s, t));
    }

    @Test
    public void case211() {
        String s = "crmizixkoaodcvitxpkj";
        String t = "ygqrnaahlwyvhegtwuzf";
        assertEquals("zxxpnawu", thelargeststring.find(s, t));
    }

    @Test
    public void case212() {
        String s = "oll";
        String t = "joj";
        assertEquals("olljoj", thelargeststring.find(s, t));
    }

    @Test
    public void case213() {
        String s = "ebdbdaceceacccab";
        String t = "bbeeeebeecacdbde";
        assertEquals("eeecccbeccdb", thelargeststring.find(s, t));
    }

    @Test
    public void case214() {
        String s = "zmmmmmmmmm";
        String t = "mmmmpmmmmq";
        assertEquals("zmmq", thelargeststring.find(s, t));
    }

    @Test
    public void case215() {
        String s = "ddbaddadcdebdd";
        String t = "baeedebbdbddee";
        assertEquals("edde", thelargeststring.find(s, t));
    }

    @Test
    public void case216() {
        String s = "aaaaa";
        String t = "baacc";
        assertEquals("ac", thelargeststring.find(s, t));
    }

    @Test
    public void case217() {
        String s = "zz";
        String t = "az";
        assertEquals("zzaz", thelargeststring.find(s, t));
    }

    @Test
    public void case218() {
        String s = "eee";
        String t = "hbf";
        assertEquals("eh", thelargeststring.find(s, t));
    }

    @Test
    public void case219() {
        String s = "abababcabcbcabcbab";
        String t = "ababbcbcbcbabcbcbc";
        assertEquals("ccccbcab", thelargeststring.find(s, t));
    }

    @Test
    public void case220() {
        String s = "cccc";
        String t = "acbb";
        assertEquals("ccccbb", thelargeststring.find(s, t));
    }

    @Test
    public void case221() {
        String s = "truijvyllsibobjltusrypanvybsfrxtlfmpdidtyo";
        String t = "zoolzslgdgowijatklvjzscizrkupmsoxftumyxify";
        assertEquals("yz", thelargeststring.find(s, t));
    }

    @Test
    public void case222() {
        String s = "dbda";
        String t = "ccab";
        assertEquals("ddca", thelargeststring.find(s, t));
    }

    @Test
    public void case223() {
        String s = "gifzlijusyyauyiuthrifkgkbpzzcaldyguwgooplqwhpnd";
        String t = "hqmhvhovuopylemoezicspgbizruxmufkroziobpelpajaq";
        assertEquals("zzzywwpnhrukzpja", thelargeststring.find(s, t));
    }

    @Test
    public void case224() {
        String s = "zbb";
        String t = "ade";
        assertEquals("zbbade", thelargeststring.find(s, t));
    }

    @Test
    public void case225() {
        String s = "lktvoo";
        String t = "cgwbuq";
        assertEquals("voobuq", thelargeststring.find(s, t));
    }

    @Test
    public void case226() {
        String s = "xjdxjexjbinodnmi";
        String t = "myayncsjhqvceqwl";
        assertEquals("xy", thelargeststring.find(s, t));
    }

    @Test
    public void case227() {
        String s = "edcbb";
        String t = "bbfaa";
        assertEquals("edcbbf", thelargeststring.find(s, t));
    }

    @Test
    public void case228() {
        String s = "pdknjifpnelmgffldnjk";
        String t = "mlocakaoaigncjcgonjm";
        assertEquals("ppnnmoan", thelargeststring.find(s, t));
    }

    @Test
    public void case229() {
        String s = "bbbbbbbbbb";
        String t = "aaaabbbbbb";
        assertEquals("bbbbbbbbbbbb", thelargeststring.find(s, t));
    }

    @Test
    public void case230() {
        String s = "zza";
        String t = "pqa";
        assertEquals("zzpq", thelargeststring.find(s, t));
    }

    @Test
    public void case231() {
        String s = "ccccbbbbaaaa";
        String t = "bbbbabbbcccc";
        assertEquals("ccccbbbbbbbbbb", thelargeststring.find(s, t));
    }

    @Test
    public void case232() {
        String s = "jabjeiacbdbcdbcbfbfdahgcebjdjajiaibegjabiehehfh";
        String t = "dibibbaiffhafgebjegghijfgijbjgjhdcfabddiggegcef";
        assertEquals("jjjjjjjd", thelargeststring.find(s, t));
    }

    @Test
    public void case233() {
        String s = "zb";
        String t = "za";
        assertEquals("zz", thelargeststring.find(s, t));
    }

    @Test
    public void case234() {
        String s = "la";
        String t = "lp";
        assertEquals("ll", thelargeststring.find(s, t));
    }

    @Test
    public void case235() {
        String s = "bac";
        String t = "def";
        assertEquals("cf", thelargeststring.find(s, t));
    }

    @Test
    public void case236() {
        String s = "capsaloxekrlbkuqewhnxqlzcjjnimyxovkusoxhnbosutn";
        String t = "jexgafkdulxbqdqevlvljoldzwexqyfnpfdegvqfmybiyhc";
        assertEquals("zyxxutndfnqyhc", thelargeststring.find(s, t));
    }

    @Test
    public void case237() {
        String s = "prytwyycpv";
        String t = "nvsmcsyqei";
        assertEquals("yyyvssyi", thelargeststring.find(s, t));
    }

    @Test
    public void case238() {
        String s = "beedcabbac";
        String t = "caedeacbcb";
        assertEquals("eedccaedeb", thelargeststring.find(s, t));
    }

    @Test
    public void case239() {
        String s = "aaabaa";
        String t = "aaaaab";
        assertEquals("baab", thelargeststring.find(s, t));
    }

    @Test
    public void case240() {
        String s = "aza";
        String t = "aza";
        assertEquals("zz", thelargeststring.find(s, t));
    }

    @Test
    public void case241() {
        String s = "rrr";
        String t = "liu";
        assertEquals("ru", thelargeststring.find(s, t));
    }

    @Test
    public void case242() {
        String s = "ulo";
        String t = "ikr";
        assertEquals("uoir", thelargeststring.find(s, t));
    }

    @Test
    public void case243() {
        String s = "cc";
        String t = "de";
        assertEquals("ce", thelargeststring.find(s, t));
    }

    @Test
    public void case244() {
        String s = "cccabbbaccabbcacbcaccccaaaaacabcaabacabbbaabaab";
        String t = "acabaacbcacabbbabbaabbcbaaabbbccccbbbbacbcbaccb";
        assertEquals("cccccccccccccccbbbbbacacabababbcbcbacbab", thelargeststring.find(s, t));
    }

    @Test
    public void case245() {
        String s = "aaabaabbbabbaba";
        String t = "baaabbaaabbabba";
        assertEquals("bbbbbbbaaaabab", thelargeststring.find(s, t));
    }

    @Test
    public void case246() {
        String s = "rdtttiixlhpikbvjgoblttgvmndkqggypgwsibcqahmyyea";
        String t = "gklprtvojuwlcblwidhjpugkbuspeynaoocgkzrpcnbqajo";
        assertEquals("yyyeaqaj", thelargeststring.find(s, t));
    }

    @Test
    public void case247() {
        String s = "yyyyy";
        String t = "xvxzx";
        assertEquals("yz", thelargeststring.find(s, t));
    }

    @Test
    public void case248() {
        String s = "abeeecdbbabaaabaa";
        String t = "aaadabaadabacabda";
        assertEquals("eeedbbbbadaaadbb", thelargeststring.find(s, t));
    }

    @Test
    public void case249() {
        String s = "ddb";
        String t = "bca";
        assertEquals("ddbc", thelargeststring.find(s, t));
    }

    @Test
    public void case250() {
        String s = "zzy";
        String t = "zab";
        assertEquals("zzza", thelargeststring.find(s, t));
    }

    @Test
    public void case251() {
        String s = "zzzzzzz";
        String t = "yyyazzz";
        assertEquals("zzzzzzzyyyazzz", thelargeststring.find(s, t));
    }

    @Test
    public void case252() {
        String s = "zzzzcc";
        String t = "zzzacc";
        assertEquals("zzzzzzza", thelargeststring.find(s, t));
    }

    @Test
    public void case253() {
        String s = "ccc";
        String t = "yxa";
        assertEquals("cy", thelargeststring.find(s, t));
    }

    @Test
    public void case254() {
        String s = "zyyy";
        String t = "yyyz";
        assertEquals("zyyz", thelargeststring.find(s, t));
    }

    @Test
    public void case255() {
        String s = "zzzy";
        String t = "xzzy";
        assertEquals("zzzz", thelargeststring.find(s, t));
    }

    @Test
    public void case256() {
        String s = "cccccccc";
        String t = "aaacccca";
        assertEquals("ccccccccca", thelargeststring.find(s, t));
    }

    @Test
    public void case257() {
        String s = "aaabbbbbabba";
        String t = "abbaabbbaaaa";
        assertEquals("bbbbbbbbaa", thelargeststring.find(s, t));
    }

    @Test
    public void case258() {
        String s = "zzyyxxwwvvuuttssrrqqppoonnmmllkkjjiihhggffeeddc";
        String t = "babaaabbbabbaabaabbbbabbbbaabbbaaabbbabbbbbaaaa";
        assertEquals("zzyyxxwwvvuuttssrrqqppoonnmmllkkjjiihhggffeeddcbabaaabbbabbaabaabbbbabbbbaabbbaaabbbabbbbbaaaa", thelargeststring.find(s, t));
    }

    @Test
    public void case259() {
        String s = "iiaihhidid";
        String t = "hbahdejgfb";
        assertEquals("ij", thelargeststring.find(s, t));
    }

    @Test
    public void case260() {
        String s = "ba";
        String t = "ba";
        assertEquals("bb", thelargeststring.find(s, t));
    }

    @Test
    public void case261() {
        String s = "bba";
        String t = "aba";
        assertEquals("bbab", thelargeststring.find(s, t));
    }

    @Test
    public void case262() {
        String s = "zzzzzzzzzz";
        String t = "aaaaaaaazz";
        assertEquals("zzzzzzzzzzaaaaaaaazz", thelargeststring.find(s, t));
    }

    @Test
    public void case263() {
        String s = "acedacb";
        String t = "bebeaab";
        assertEquals("edcbea", thelargeststring.find(s, t));
    }

    @Test
    public void case264() {
        String s = "bbbbb";
        String t = "bbbbb";
        assertEquals("bbbbbbbbbb", thelargeststring.find(s, t));
    }

    @Test
    public void case265() {
        String s = "ikiabccdhfejlcbchffdlgahcnmhollnfobknoeh";
        String t = "oclngjallimgdgogocfedjnkkbmcjojmkecaddbe";
        assertEquals("ooojed", thelargeststring.find(s, t));
    }

    @Test
    public void case266() {
        String s = "bdcdabbabbabbababaaaabbababab";
        String t = "bbwbbababbaabbbababbbbababaab";
        assertEquals("ddbbbbbbbbbbbbbbbbbbbbaaab", thelargeststring.find(s, t));
    }

    @Test
    public void case267() {
        String s = "zkkkkk";
        String t = "kaakkb";
        assertEquals("zkkkkkkb", thelargeststring.find(s, t));
    }

    @Test
    public void case268() {
        String s = "asjkfghsdfskghsdljk";
        String t = "aghsfdgjkhysadfkjhf";
        assertEquals("sy", thelargeststring.find(s, t));
    }

    @Test
    public void case269() {
        String s = "eeee";
        String t = "bazz";
        assertEquals("ez", thelargeststring.find(s, t));
    }

    @Test
    public void case270() {
        String s = "ccccccccccccccccccccccccccccccccccccccccccccccc";
        String t = "ccccccccccccccccccccccccccccccccccccccccccccccc";
        assertEquals("cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc", thelargeststring.find(s, t));
    }

    @Test
    public void case271() {
        String s = "xxxxxxxxx";
        String t = "aaxaxxxxx";
        assertEquals("xxxxxxxxxxxx", thelargeststring.find(s, t));
    }

    @Test
    public void case272() {
        String s = "pacrazaneewndecbuzbrgffs";
        String t = "jczznieckitkhwynawcgdfjz";
        assertEquals("zzsiwz", thelargeststring.find(s, t));
    }

    @Test
    public void case273() {
        String s = "abaabba";
        String t = "deaaddc";
        assertEquals("be", thelargeststring.find(s, t));
    }

    @Test
    public void case274() {
        String s = "xxx";
        String t = "baz";
        assertEquals("xz", thelargeststring.find(s, t));
    }

    @Test
    public void case275() {
        String s = "bbbbb";
        String t = "aadaa";
        assertEquals("bd", thelargeststring.find(s, t));
    }

}
