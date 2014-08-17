package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class MergeStringsTest {
    MergeStrings mergestrings = new MergeStrings();

    @Test
    public void case1() {
        String S = "??CC??";
        String A = "ABC";
        String B = "BCC";
        assertEquals("ABCCBC", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case2() {
        String S = "WHAT?";
        String A = "THE";
        String B = "WA";
        assertEquals("", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case3() {
        String S = "PARROT";
        String A = "PARROT";
        String B = "";
        assertEquals("PARROT", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case4() {
        String S = "???????????";
        String A = "AZZAA";
        String B = "AZAZZA";
        assertEquals("AAZAZZAAZZA", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case5() {
        String S = "?";
        String A = "";
        String B = "X";
        assertEquals("X", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case6() {
        String S = "??????????????????????????????????????????????????";
        String A = "AAAAAAAAAAAAAAAAAAAAAAAAA";
        String B = "AAAAAAAAAAAAAAAAAAAAAAAAA";
        assertEquals("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case7() {
        String S = "Q";
        String A = "Q";
        String B = "";
        assertEquals("Q", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case8() {
        String S = "???";
        String A = "ZZX";
        String B = "";
        assertEquals("ZZX", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case9() {
        String S = "??S?A";
        String A = "A";
        String B = "WSLA";
        assertEquals("AWSLA", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case10() {
        String S = "?L???T?";
        String A = "TLTERTC";
        String B = "";
        assertEquals("TLTERTC", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case11() {
        String S = "W????WVU?";
        String A = "WKXAWVUX";
        String B = "O";
        assertEquals("WKOXAWVUX", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case12() {
        String S = "???????????";
        String A = "JIVTEXSV";
        String B = "LZL";
        assertEquals("JILVTEXSVZL", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case13() {
        String S = "?????????????";
        String A = "AEQIPD";
        String B = "UIVDSRM";
        assertEquals("AEQIPDUIVDSRM", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case14() {
        String S = "????Q???J???B?X";
        String A = "PIQJBQ";
        String B = "CPVJVXBLX";
        assertEquals("CPIPQJBVJQVXBLX", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case15() {
        String S = "?????????????????";
        String A = "XEDTTEQZWTJ";
        String B = "BOIWTV";
        assertEquals("BOIWTVXEDTTEQZWTJ", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case16() {
        String S = "?????????X???????I?";
        String A = "OOIIQWFDKSOD";
        String B = "OXXQLIV";
        assertEquals("OOIIOQWFDXKSODXQLIV", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case17() {
        String S = "?????????P????????A??";
        String A = "M";
        String B = "VQDVMTPFPCQXNXXLRANL";
        assertEquals("MVQDVMTPFPCQXNXXLRANL", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case18() {
        String S = "???????V?WV?O?W???V?W??";
        String A = "OWOVOOOVOWVWOWWVWWVW";
        String B = "OOW";
        assertEquals("OWOVOOOVOWVOOWWOWWVWWVW", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case19() {
        String S = "WYTDYPFYWTBTCBWQIDFZLLWFW";
        String A = "WYTDYPFYWTBTCBWQIDFZLL";
        String B = "WFW";
        assertEquals("WYTDYPFYWTBTCBWQIDFZLLWFW", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case20() {
        String S = "BSBREXDEXBVXWVBXVBEDWCWSZWX";
        String A = "BSREEXVWVB";
        String B = "BXDBXXVBEDWCWSZWX";
        assertEquals("BSBREXDEXBVXWVBXVBEDWCWSZWX", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case21() {
        String S = "????V?V???????????V?V??????V?";
        String A = "VVVVVVVVVVVVVVVVVV";
        String B = "VVVVVVVVVVV";
        assertEquals("VVVVVVVVVVVVVVVVVVVVVVVVVVVVV", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case22() {
        String S = "????????VX?????????????????T???";
        String A = "FPP";
        String B = "TKDYGVXTPPBCBYTNGGPGPPFMTPAG";
        assertEquals("FPPTKDYGVXTPPBCBYTNGGPGPPFMTPAG", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case23() {
        String S = "???O?A???D???F??????????X?R?UU???";
        String A = "GF";
        String B = "NOUANURDQUFFNUJFXXTGHEXYROUUOMG";
        assertEquals("GFNOUANURDQUFFNUJFXXTGHEXYROUUOMG", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case24() {
        String S = "USXMBWUBGPUGFVSXUXUUGMMPFBSWMSGXUVG";
        String A = "USXMBWUBGPUGFVSXUXUUGMMPFBSWMSGXU";
        String B = "VG";
        assertEquals("USXMBWUBGPUGFVSXUXUUGMMPFBSWMSGXUVG", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case25() {
        String S = "?L???????????C?D??????????????Y??????";
        String A = "ELQTAOBAATCCADKDZWI";
        String B = "ASJZBSOVIHFYMQKEWH";
        assertEquals("ELAQSTAOBAATCCADJKDZBSOVIHFZWIYMQKEWH", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case26() {
        String S = "?RZZ??T?WVSB?????BNY???A?YY??B?NRT?BSR?";
        String A = "RZZRG";
        String B = "TTFWVSBPZBWIBNYICGAYYYSWBVNRTCBSRC";
        assertEquals("TRZZRGTFWVSBPZBWIBNYICGAYYYSWBVNRTCBSRC", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case27() {
        String S = "T?????????TRE????????R??R??R????RH?????LE";
        String A = "RZRNN";
        String B = "TEHLTTREHNELELNTRTRRTLRNEELRHLLZLTLE";
        assertEquals("TEHLRTZRNNTREHNELELNTRTRRTLRNEELRHLLZLTLE", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case28() {
        String S = "VSZWAYUFJYIEUUJCFHQQQJQYBYPEHHTSEBNMUKHXHCP";
        String A = "VSZWAYUF";
        String B = "JYIEUUJCFHQQQJQYBYPEHHTSEBNMUKHXHCP";
        assertEquals("VSZWAYUFJYIEUUJCFHQQQJQYBYPEHHTSEBNMUKHXHCP", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case29() {
        String S = "C??C?C??C?CCC?????CCC???CC???C?CCCCCC?CC??CC?";
        String A = "CCCCCCCCCCCCC";
        String B = "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC";
        assertEquals("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case30() {
        String S = "??R????LL??G???S??GG??G?R??????????R???G??????G";
        String A = "LRRSLLSGLGRSSLG";
        String B = "LLSLGRRGURSGGSRUULLURUUUGLUSLLSG";
        assertEquals("LLRLRSSLLLSGLGRSSLGGRRGURSGGSRUULLURUUUGLUSLLSG", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case31() {
        String S = "I?????FL????????????????A????X???????????????????";
        String A = "IEFKKFLPITHVHKWTGIPWKAGVPFXZQVAVGQZZGAEGXKAZTH";
        String B = "XXV";
        assertEquals("IEFKKXFLPITHVHKWTGIPWKXVAGVPFXZQVAVGQZZGAEGXKAZTH", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case32() {
        String S = "?????????????????G???H???UC??PU?N?C???????????????";
        String A = "NYPXCXCXUPHHGHUUHGUPUCYPPUNNPCHCGXNCHHPPYYPNU";
        String B = "CXGXY";
        assertEquals("CNXGXYPXCXCXUPHHYGHUUHGUPUCYPPUNNPCHCGXNCHHPPYYPNU", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case33() {
        String S = "?QZ??????????????????????C????????W???U????E???AY?";
        String A = "QZQXLUALBARDUOHQZLMHXUOXCELXWLYONWRFLULZGIEAGIAYW";
        String B = "I";
        assertEquals("IQZQXLUALBARDUOHQZLMHXUOXCELXWLYONWRFLULZGIEAGIAYW", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case34() {
        String S = "CHFKTCHHNCFNLKBNFCLFLKTFNFBLHKKBCLNFKTCNTOBNHCCKLT";
        String A = "CHFK";
        String B = "TCHHNCFNLKBNFCLFLKTFNFBLHKKBCLNFKTCNTOBNHCCKLT";
        assertEquals("CHFKTCHHNCFNLKBNFCLFLKTFNFBLHKKBCLNFKTCNTOBNHCCKLT", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case35() {
        String S = "??L?B????L???V?Z?K?????LB??N????B???????L?B????L?E";
        String A = "LEBVNLL";
        String B = "NBBBEEVLZLKVKBLZLBVZNNZNZBVKVKEBZLKBLLBNLZE";
        assertEquals("NBLBBEBVNLEELVLZLKVKBLZLBVZNNZNZBVKVKEBZLKBLLBNLZE", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case36() {
        String S = "?L??L?????IH??????????????M??????????T?????????QE?";
        String A = "DOORVEHLJRHD";
        String B = "LALKICYSPXOPUQMLPWVAKDYRHTECYATXNNLQEI";
        assertEquals("DLAOLKORVEIHCLJRHDYSPXOPUQMLPWVAKDYRHTECYATXNNLQEI", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case37() {
        String S = "WWLB???ZHG?HMPI??P??OY?Q??CT?WZEVJ??????WBF?C?GJJ?";
        String A = "WWLBZSGZGNHMPIEXPCOYQWJCTSWEVJPNGNGWBOCBGJJ";
        String B = "HUMZTFI";
        assertEquals("WWLBZSGZHGNHMPIEXPCUOYMQWJCTSWZEVJPNGNGTWBFOCBGJJI", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case38() {
        String S = "?????????????????????K?????????D?????????????????V";
        String A = "USIPJJFHHUADEEZCXMTFKTEYHTLIDLMIHYYZLQSVIKX";
        String B = "FFDTLKV";
        assertEquals("FUSIPJJFHHUADEEZCXMTFKFDTEYHTLIDLMIHTLKYYZLQSVIKXV", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case39() {
        String S = "L???????S??O???????????L?D????????S?J?N???????????";
        String A = "LHTHBINJIDVNXNJIVLD";
        String B = "LSBOXZKTBJZBOHLSNJNNLVHPOHVOLID";
        assertEquals("LHLTHBINSBJOIDVNXNJIVXZLKDTBJZBOHLSNJNNLVHPOHVOLID", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case40() {
        String S = "W?WW??????P??CC?????????????????????P?W????P?C???W";
        String A = "WWWCWWCPCWC";
        String B = "WPCCWWWCCCPWPWPWPWWWWCCPCPPWWWWPPCCWWWW";
        assertEquals("WPWWCWCWWCPCWCCWWWCCCPWPWPWPWWWWCCPCPPWWWWPPCCWWWW", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case41() {
        String S = "?????S????????????????????S?S?S?????S???????S?????";
        String A = "SSSSSSSS";
        String B = "SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS";
        assertEquals("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case42() {
        String S = "??K?????I??Q?ZM?DPM??????V?N??????H?P??V?E????????";
        String A = "ZKQVAIRNRMKPMCMSRPUVRNPPCYEYHHPCSVJEUZOILCEA";
        String B = "DMXQZD";
        assertEquals("DZKMQVAXIRNQRZMKDPMCMSRPUVRNPPCYEYHHPCSVJEUZOILCEA", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case43() {
        String S = "EFGJFFKFO?K?EVKK?M?MJE???O?M????VO???E?OU?EMK?M???";
        String A = "EFGJFFKFEKUEKKOMOMJEVMUOMMMVG";
        String B = "OVVVOUEGEFOUOEMKGMGOK";
        assertEquals("EFGJFFKFOEKUEVKKOMOMJEVMUOMMMVGVVOUEGEFOUOEMKGMGOK", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case44() {
        String S = "?????????????????????T?????X??J??H???????????B??R?";
        String A = "IOJTOXRRGRUJZOKITJYTSOTRLXIKJWIHHROSRXO";
        String B = "WJIGBKBXZRW";
        assertEquals("IOJTOWJXRRGRUJZOKITJYTSOTRLXIKJWIHHIGBKROSRXOBXZRW", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case45() {
        String S = "FVVKGHDZDGEQOOLDDPLLTTFUHCPLVUTFHKZCPZCCVGUZDLKZNN";
        String A = "VVGHDZDGEQOOLDPLLTTFUHCPLVUTFHKZCPZCCVGUZDLKZNN";
        String B = "FKD";
        assertEquals("FVVKGHDZDGEQOOLDDPLLTTFUHCPLVUTFHKZCPZCCVGUZDLKZNN", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case46() {
        String S = "?G???EU?O?Z???????GN????E?M??H?????E?????B?B?Q??JU";
        String A = "GOYOMOZLUWNSGNYJYECMEUDYHMZBCBVQUVJU";
        String B = "AEUVGAAZHZEUGQ";
        assertEquals("AGOYOEUMOVZGALUWNSGNAYJYECMEZHUDYHZEMUGQZBCBVQUVJU", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case47() {
        String S = "???????H???T????????????????????????????????U?????";
        String A = "TVPETH";
        String B = "ZNGPUTXQKXHQZTWQUKNHHUTNNVUPZPNHXKNTVVUNWUZW";
        assertEquals("TVPETZNHGPUTXQKXHQZTWQUKNHHUTNNVUPZPNHXKNTVVUNWUZW", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case48() {
        String S = "????K??????????????D???K???K????????K?????K???????";
        String A = "KKKKKDKKKDKKDDKDDDKDKK";
        String B = "KDKDDKKKDDKDDKKKDKDKKDDDDDDD";
        assertEquals("KDKDKDKKKDDKDDKKKDKDKKDKDDDKDDDKKDKKKDKKDDKDDDKDKK", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case49() {
        String S = "KZRKRZZRRRKBRKKRKZKKBZBRRKBBZRKBKZRRRRRBKRBZRBBKKB";
        String A = "ZKRZRRKBKKRKKBZBRRBBZRK";
        String B = "KRZRRZKKBKZRRRRRBKRBZRBBKKB";
        assertEquals("KZRKRZZRRRKBRKKRKZKKBZBRRKBBZRKBKZRRRRRBKRBZRBBKKB", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case50() {
        String S = "?P??W???????????E???R???????????????E?????????????";
        String A = "WPOEWWPEEEEROREEWORRPEROEOOROREREPWW";
        String B = "EPRPOWRPEEOPEO";
        assertEquals("EPRPWOPOEWRPEWWPEEEEREOOPREEWORRPEROEEOOOROREREPWW", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case51() {
        String S = "??????????????????????????????????????????????????";
        String A = "BBCBJEBCCCJCEECCBCEEEJBEBJCJEEJEJJEJEJE";
        String B = "JBCJCCBEJJB";
        assertEquals("BBCBJBCJCCBEJEBCCCJCEECCBCEEEJBEBJCJEEJEJJBJJEJEJE", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case52() {
        String S = "???VV??LXM?S????L?OXG?B?HHB?BBGL??B??B??V?B??Y????";
        String A = "OVVPOLXM";
        String B = "SYGSOVMBLGOXGEBYHHBGBBGLHGBGYBVEVLBOEYLGPX";
        assertEquals("OSYVVPOLXMGSOVMBLGOXGEBYHHBGBBGLHGBGYBVEVLBOEYLGPX", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case53() {
        String S = "YQ????????????????S?S?S????????D??????????????Z?TU";
        String A = "QQEMTTNOL";
        String B = "YYLZSZMIYSNSNSYLYUZDINDMIOSLMNQZADODEZITU";
        assertEquals("YQQEMTTNOLYLZSZMIYSNSNSYLYUZDINDMIOSLMNQZADODEZITU", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case54() {
        String S = "VPSXPXKKLXXNQNQRASNQAASRXXPQLARAXALRVAXRKRVPVALPSX";
        String A = "VPS";
        String B = "XPXKKLXXNQNQRASNQAASRXXPQLARAXALRVAXRKRVPVALPSX";
        assertEquals("VPSXPXKKLXXNQNQRASNQAASRXXPQLARAXALRVAXRKRVPVALPSX", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case55() {
        String S = "H?HVZ?WW???T??H??V??????G?W?D?????D????G?T????V??G";
        String A = "HXHVZHWWDWTJX";
        String B = "GHJQVTQXGTQGZWVDDZHGDDHGQQGVTZXZTVGJG";
        assertEquals("HXHVZHWWDGWTJXHJQVTQXGTQGZWVDDZHGDDHGQQGVTZXZTVGJG", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case56() {
        String S = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        String A = "AAAAAAAAAAAAAAAAAAAAAAAAA";
        String B = "AAAAAAAAAAAAAAAAAAAAAAAAA";
        assertEquals("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case57() {
        String S = "AB";
        String A = "A";
        String B = "B";
        assertEquals("AB", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case58() {
        String S = "??????????????????????????????????????????????????";
        String A = "AAAAAAAAAAAAABPBBBBBFBCCC";
        String B = "AAAAAAAAAAAABBABBZBBBBCCC";
        assertEquals("AAAAAAAAAAAAAAAAAAAAAAAAABBABBBPBBBBBFBCCCZBBBBCCC", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case59() {
        String S = "WHATT?";
        String A = "THET";
        String B = "WA";
        assertEquals("", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case60() {
        String S = "AA??";
        String A = "AZ";
        String B = "AX";
        assertEquals("AAXZ", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case61() {
        String S = "??????????????????????????????????????????????W???";
        String A = "FEWFKFEWFKFEWFKFEWFKFEWFK";
        String B = "BABCDBABCDBABCDBABCDBABCD";
        assertEquals("BABCDBABCDBABCDBABCDBABCFEWFKFEWFKFEWFKFEWFKFEWDFK", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case62() {
        String S = "??????????????????????????????????K???????????????";
        String A = "KKKKKKKKKKKKKKKKKKKKKK";
        String B = "KKKKKKKKKKKKKKKKKKKKKKKKKKKK";
        assertEquals("KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case63() {
        String S = "???B?????A???B?????A???B?????A???B?????A???B?????A";
        String A = "AAABAABAAAAABAABAAAABAA";
        String B = "BBBABBABBBBBABBABBBBABBAAAA";
        assertEquals("AAABAABAAAAABBAABAAABBABBABBBABBABBABBBABBABABAAAA", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case64() {
        String S = "???B????F????????N???????????????????Q??????X???";
        String A = "ABCDEFGHIJKLNOPQITUVWXYZ";
        String B = "ABCDEFGHIJKLMNPQSTUVWXYZ";
        assertEquals("AABBCCDEFDEGHIJKLNFGHIJKLMNOPPQITUVWXQSTUVWYXYZZ", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case65() {
        String S = "Q";
        String A = "A";
        String B = "";
        assertEquals("", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case66() {
        String S = "AB";
        String A = "";
        String B = "BA";
        assertEquals("", mergestrings.getmin(S, A, B));
    }

    @Test
    public void case67() {
        String S = "????K??????????????D???K???K????????K?????K??????D";
        String A = "KKKKKDKKKDKKDDKDDDKDKK";
        String B = "KDKDDKKKDDKDDKKKDKDKKDDDDDDD";
        assertEquals("KDKDKDKKKDDKDDKKKDKDKKKKDKKKDKKDDKDDKDKDDDKDDDDKKD", mergestrings.getmin(S, A, B));
    }

}
