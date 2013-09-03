package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class ColorfulChocolatesTest {
    ColorfulChocolates colorfulchocolates = new ColorfulChocolates();

    @Test
    public void case1() {
        String chocolates = "ABCDCBC";
        int maxSwaps = 1;
        assertEquals(2, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case2() {
        String chocolates = "ABCDCBC";
        int maxSwaps = 2;
        assertEquals(3, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case3() {
        String chocolates = "ABBABABBA";
        int maxSwaps = 3;
        assertEquals(4, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case4() {
        String chocolates = "ABBABABBA";
        int maxSwaps = 4;
        assertEquals(5, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case5() {
        String chocolates = "QASOKZNHWNFODOQNHGQKGLIHTPJUVGKLHFZTGPDCEKSJYIWFOO";
        int maxSwaps = 77;
        assertEquals(5, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case6() {
        String chocolates = "ZWYZ";
        int maxSwaps = 2;
        assertEquals(2, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case7() {
        String chocolates = "STDCJAHMSUXMPVNGGSCGXLFCFBJ";
        int maxSwaps = 2;
        assertEquals(3, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case8() {
        String chocolates = "RQNKVRWVAKQVIEKDRQLJUS";
        int maxSwaps = 5;
        assertEquals(3, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case9() {
        String chocolates = "HWEZHPUZYAYMNZGUSWRBWJCUZCCJZTWIPCKWTEYUGWGTVON";
        int maxSwaps = 59;
        assertEquals(6, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case10() {
        String chocolates = "ETIPVERAHABCWMTAWPUAPOIOUBJIOBVUU";
        int maxSwaps = 14;
        assertEquals(4, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case11() {
        String chocolates = "SKAURDVVZH";
        int maxSwaps = 32;
        assertEquals(2, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case12() {
        String chocolates = "FFUHVKPJEQUOGYLCURMMBOGUREPTNFVTKRAFB";
        int maxSwaps = 23;
        assertEquals(4, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case13() {
        String chocolates = "HKNVRLJVFAHSDYAZRGQKUVHPFYRNZJDIUQGNB";
        int maxSwaps = 16;
        assertEquals(3, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case14() {
        String chocolates = "HRSBUSDTJKLWGGDVLEOYFYEOUUUHYJRHAJIWDNRPZ";
        int maxSwaps = 19;
        assertEquals(4, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case15() {
        String chocolates = "FIQCVURWAPAQJWKSUVJBXVLT";
        int maxSwaps = 15;
        assertEquals(3, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case16() {
        String chocolates = "MPYOAEYTIVPZRRQTHBQTTKOFMLCXGEYSUXIWDIPL";
        int maxSwaps = 13;
        assertEquals(4, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case17() {
        String chocolates = "NXYDRGHHBA";
        int maxSwaps = 28;
        assertEquals(2, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case18() {
        String chocolates = "HFDLFMQDGMAPIFZATDHGBFLUNSBPVUFEAKSFYKKFWNW";
        int maxSwaps = 74;
        assertEquals(7, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case19() {
        String chocolates = "VGLZNTCTFWGZXXUREBTPTANDLUZYQFSMMELZZPUGLDGKACD";
        int maxSwaps = 51;
        assertEquals(5, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case20() {
        String chocolates = "KGCKWIDKWJVXKMSRZXZJZBPEHOCFPQJCYLMUVRHRACPLRJEQ";
        int maxSwaps = 12;
        assertEquals(4, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case21() {
        String chocolates = "CFGRMPHQVWGGYERLBP";
        int maxSwaps = 7;
        assertEquals(3, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case22() {
        String chocolates = "GFMVSDGWWMBYUHPGXWW";
        int maxSwaps = 16;
        assertEquals(4, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case23() {
        String chocolates = "FCT";
        int maxSwaps = 2;
        assertEquals(1, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case24() {
        String chocolates = "GMKKWRPJOJ";
        int maxSwaps = 56;
        assertEquals(2, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case25() {
        String chocolates = "ECDFFABAFEAEBBFABAABEDAFFBCCDABBAEEACFEFBFEAEBBDBB";
        int maxSwaps = 126;
        assertEquals(13, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case26() {
        String chocolates = "BAAABBCCDDDDCDDAACADBCCBDDDCCDDDADABACADCDDADCADAA";
        int maxSwaps = 113;
        assertEquals(19, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case27() {
        String chocolates = "CBDBACDCBCCBCCDCADCCCBCBDDBADABCBADBCDDABBBDDACADA";
        int maxSwaps = 80;
        assertEquals(15, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case28() {
        String chocolates = "BBACCABACACAACAACBCCCCAABAAABBCCCABCBAACBACBAACABB";
        int maxSwaps = 143;
        assertEquals(20, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case29() {
        String chocolates = "EEEAADADABCECDCEDCEGDFEGDAGGCCDEEBCEECFCBAABCAGFCB";
        int maxSwaps = 91;
        assertEquals(11, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case30() {
        String chocolates = "FFECCEADDDCEDEAFACCDCFFABDDACDDAAACCCDEFAEBDDAADCA";
        int maxSwaps = 108;
        assertEquals(13, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case31() {
        String chocolates = "CBABBBCBCACCBBCABBACAAABABBACCCABCBABBCACBCAAABCCB";
        int maxSwaps = 158;
        assertEquals(19, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case32() {
        String chocolates = "HCAGGAHFBHFFFDHCAFDHHEEHCFAFCFDBHDAGEHDFGACEDBGEGB";
        int maxSwaps = 60;
        assertEquals(9, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case33() {
        String chocolates = "ECGDAFBBDEFEDCDAFEACBAACBBCAGCEEEEAECGEEBABFACDFEE";
        int maxSwaps = 102;
        assertEquals(13, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case34() {
        String chocolates = "EFFDEGCEGGGBBEDCEAGDFFGFADECACFCGBEDAEFGDCADAEFCCE";
        int maxSwaps = 126;
        assertEquals(10, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case35() {
        String chocolates = "HKJIKDSZLRXKNSPPNAMTPXDLOVUEGLBOVLYGQS";
        int maxSwaps = 27;
        assertEquals(4, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case36() {
        String chocolates = "CTDNLTDFGIBMFFCHLCJFRYTOILKCPRLTKQJXMODUWGHDNLLYNU";
        int maxSwaps = 67;
        assertEquals(6, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case37() {
        String chocolates = "MXKEPAVPQUENHXVWTCPLTQZOWQBOKTXWQJCHLXXCUDRBCMZVOQ";
        int maxSwaps = 46;
        assertEquals(5, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case38() {
        String chocolates = "JJHZFXATIVSGMBJTNISPCXGFZUEULVCUEMULJWETSXAGAJZNRU";
        int maxSwaps = 25;
        assertEquals(5, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case39() {
        String chocolates = "WRMDRHINUFSOLEKYPJCJBBJHCUIRNCYLWMPNTZCNGUERAQPQZT";
        int maxSwaps = 21;
        assertEquals(4, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case40() {
        String chocolates = "CXKLBGWUTASFWFWLAVOQBIWUJMLBOECSDOEEUAZPARWZYSKBNY";
        int maxSwaps = 40;
        assertEquals(5, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case41() {
        String chocolates = "OJPKSBVVRCXKFLOKHQLWSETRDLCEBAXRJMCDPXYJZXTFKJRRZC";
        int maxSwaps = 56;
        assertEquals(5, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case42() {
        String chocolates = "TIJLNWNRXPQPBETEWQFFSEYZPJSIIWYDEHOSEDLDTEUUINAGGH";
        int maxSwaps = 19;
        assertEquals(3, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case43() {
        String chocolates = "AMLZDUTLEPMITTWLZCZDVDZRNPTUVBFXPTYUNRHUGTCZPANOCM";
        int maxSwaps = 60;
        assertEquals(6, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case44() {
        String chocolates = "ZRVSEKMYHPGEGZCAMVJGBFKCUNRKRFGRWBJBLXBUMHASGCUVXG";
        int maxSwaps = 45;
        assertEquals(4, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case45() {
        String chocolates = "ALOCHDURUBZNYAXBNWCJJKJDQNALKGPMTFRAKLTEMTSMVRNLNQ";
        int maxSwaps = 61;
        assertEquals(5, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case46() {
        String chocolates = "WCECURCGEKXSDEJFOWYULTMXRDNERFYPHETBYVJEFIWKOGPCEQ";
        int maxSwaps = 85;
        assertEquals(7, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case47() {
        String chocolates = "AAAABBABAABABBAABBAABAABBAABAAABAABBAABAAAAABAABBA";
        int maxSwaps = 156;
        assertEquals(31, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case48() {
        String chocolates = "BAABBABBBAABAABAABAAAAAABAAABBBABBBABBAABAABABBABB";
        int maxSwaps = 110;
        assertEquals(26, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case49() {
        String chocolates = "CBDBDBADADAACCBBAADACCBAABDDDACBCCCBDCAACAAADBBDCA";
        int maxSwaps = 131;
        assertEquals(16, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case50() {
        String chocolates = "BABAAABBAAAABABAABBAAABABAABBBABBBBBBABAABAAABAAAA";
        int maxSwaps = 188;
        assertEquals(28, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case51() {
        String chocolates = "NXIASZWQAGIX";
        int maxSwaps = 4;
        assertEquals(2, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case52() {
        String chocolates = "CACBBCCDCCCEBCCCCCJJJCBBCKLBCBBCBSCSBWWWCWWCWCCCC";
        int maxSwaps = 33;
        assertEquals(14, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case53() {
        String chocolates = "CBABBACBABABCCCCCAABBAACBBBBCBCAAA";
        int maxSwaps = 8;
        assertEquals(7, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case54() {
        String chocolates = "AAABCD";
        int maxSwaps = 1;
        assertEquals(3, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case55() {
        String chocolates = "ZZZZZZZ";
        int maxSwaps = 3;
        assertEquals(7, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case56() {
        String chocolates = "QASOKZNHWNFODOQNHGQKGLIHTPJUVGKLHFZTGPDCEKSJY";
        int maxSwaps = 1234;
        assertEquals(4, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case57() {
        String chocolates = "AAABBBBBBBBBBBBBAABB";
        int maxSwaps = 1000;
        assertEquals(15, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case58() {
        String chocolates = "ZAZAZ";
        int maxSwaps = 2;
        assertEquals(3, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case59() {
        String chocolates = "QASOKZNHWNFODOQNHGQKGLIHTPJUVGKLHFZTGPDCEKSJYIWFOO";
        int maxSwaps = 2500;
        assertEquals(5, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case60() {
        String chocolates = "ABCDEFGABCDEFGABCDEFGABCDEFGABCDEFGABCDEFGABCDEFG";
        int maxSwaps = 2500;
        assertEquals(7, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case61() {
        String chocolates = "AAAAA";
        int maxSwaps = 1;
        assertEquals(5, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case62() {
        String chocolates = "AAABBBAAABBBAAABBBAAABBBAAABBBAAABBBAAABBBAABBBBB";
        int maxSwaps = 50;
        assertEquals(15, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case63() {
        String chocolates = "A";
        int maxSwaps = 2;
        assertEquals(1, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case64() {
        String chocolates = "ABCDBBVNBBB";
        int maxSwaps = 6;
        assertEquals(5, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case65() {
        String chocolates = "AABBCCCCCFGFGFGFGSCDCDCDCDCDFGFGFGFYYYYSESEWWSESEG";
        int maxSwaps = 2500;
        assertEquals(10, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case66() {
        String chocolates = "ABCDEFGHJIB";
        int maxSwaps = 4;
        assertEquals(1, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case67() {
        String chocolates = "Z";
        int maxSwaps = 2500;
        assertEquals(1, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case68() {
        String chocolates = "JWSMEADGLXDIUKWZGNXWSILWDJBWMGCFVLSHJUUKKTHDEEWBHW";
        int maxSwaps = 1;
        assertEquals(2, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case69() {
        String chocolates = "CDUCACBC";
        int maxSwaps = 2;
        assertEquals(3, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case70() {
        String chocolates = "ASDSDRGRGGEAAARRQWYUAAHAAUTNFAA";
        int maxSwaps = 55;
        assertEquals(10, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case71() {
        String chocolates = "AACAAA";
        int maxSwaps = 1;
        assertEquals(4, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case72() {
        String chocolates = "AABBCCDEFFGDTHBDBAADSBDDBSUSIDAPQZAIDTTYYAAZYYDBD";
        int maxSwaps = 37;
        assertEquals(7, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case73() {
        String chocolates = "ABBACCADDAEE";
        int maxSwaps = 2;
        assertEquals(2, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case74() {
        String chocolates = "ABACADAEAFAGADAFAGAVBABABBBBBBACADADAFA";
        int maxSwaps = 50;
        assertEquals(13, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case75() {
        String chocolates = "DACDDBEDEEBCCECCCADDAEDBBAAEABEDBEEABDCCABEACECCCC";
        int maxSwaps = 95;
        assertEquals(10, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case76() {
        String chocolates = "ABDDSCBSDXSFGFSSSDCVDSCSSXXASSSWCAXA";
        int maxSwaps = 20;
        assertEquals(8, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case77() {
        String chocolates = "AABABABABABABCCCBBCBABCBACBACBBCBCCBCCCBACABCBCBC";
        int maxSwaps = 6;
        assertEquals(7, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case78() {
        String chocolates = "A";
        int maxSwaps = 1;
        assertEquals(1, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case79() {
        String chocolates = "Z";
        int maxSwaps = 10;
        assertEquals(1, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case80() {
        String chocolates = "AABCBACAA";
        int maxSwaps = 5;
        assertEquals(4, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case81() {
        String chocolates = "AAAAAAAAXA";
        int maxSwaps = 1;
        assertEquals(9, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case82() {
        String chocolates = "ABBBBBBABBCABCBCBCAA";
        int maxSwaps = 1;
        assertEquals(7, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case83() {
        String chocolates = "ZZZZZ";
        int maxSwaps = 1;
        assertEquals(5, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case84() {
        String chocolates = "ABCDEFGHIJKLMNOPQRSTUVWXYZQBCDEFGHIJKLMNOPQRSTUV";
        int maxSwaps = 2500;
        assertEquals(3, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case85() {
        String chocolates = "QASOKZNHWNFODOQNHGQKGLIHTPJUVGKLHFZTGPDCEKSWFOOWEE";
        int maxSwaps = 2500;
        assertEquals(5, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case86() {
        String chocolates = "ABCDEFGABCDEFGABCDEFGAZZ";
        int maxSwaps = 11;
        assertEquals(2, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case87() {
        String chocolates = "CCBBCBAABCCCBABCBCAA";
        int maxSwaps = 91;
        assertEquals(8, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case88() {
        String chocolates = "ABCADAEA";
        int maxSwaps = 2;
        assertEquals(3, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case89() {
        String chocolates = "ABCDEFAAAHIJAA";
        int maxSwaps = 6;
        assertEquals(5, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case90() {
        String chocolates = "BABCDB";
        int maxSwaps = 3;
        assertEquals(3, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case91() {
        String chocolates = "ABCDA";
        int maxSwaps = 1;
        assertEquals(1, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case92() {
        String chocolates = "EDADGECCBDFAGGHIBDJFIFEHBFFJBICHGFDACCDJBAIBEJGAJ";
        int maxSwaps = 5;
        assertEquals(3, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case93() {
        String chocolates = "ABABCAABBABBBBAAAABBBBAAAAABACADADDDADDDDAACCACADD";
        int maxSwaps = 67;
        assertEquals(17, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case94() {
        String chocolates = "A";
        int maxSwaps = 2500;
        assertEquals(1, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case95() {
        String chocolates = "ABCDASAFA";
        int maxSwaps = 2;
        assertEquals(3, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case96() {
        String chocolates = "AABBBAAAABBBAAACCAA";
        int maxSwaps = 14;
        assertEquals(8, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case97() {
        String chocolates = "ABCDEFA";
        int maxSwaps = 2;
        assertEquals(1, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case98() {
        String chocolates = "AAAAA";
        int maxSwaps = 5;
        assertEquals(5, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case99() {
        String chocolates = "YEHXIDONKPSZLVCNGMPKYTDAOP";
        int maxSwaps = 50;
        assertEquals(3, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

    @Test
    public void case100() {
        String chocolates = "CAAACCCCA";
        int maxSwaps = 3;
        assertEquals(5, colorfulchocolates.maximumSpread(chocolates, maxSwaps));
    }

}
