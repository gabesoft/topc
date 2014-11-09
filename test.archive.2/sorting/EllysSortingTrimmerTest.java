package topc.test.sorting;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.sorting.*;

public class EllysSortingTrimmerTest {
    EllysSortingTrimmer ellyssortingtrimmer = new EllysSortingTrimmer();

    @Test
    public void case1() {
        String S = "ABRACADABRA";
        int L = 5;
        assertEquals("AAAAA", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case2() {
        String S = "ESPRIT";
        int L = 3;
        assertEquals("EIP", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case3() {
        String S = "BAZINGA";
        int L = 7;
        assertEquals("AABGINZ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case4() {
        String S = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int L = 13;
        assertEquals("ABCDEFGHIJKLM", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case5() {
        String S = "GOODLUCKANDHAVEFUN";
        int L = 10;
        assertEquals("AACDDEFGHK", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case6() {
        String S = "AAAWDIUAOIWDESBEAIWODJAWDBPOAWDUISAWDOOPAWD";
        int L = 21;
        assertEquals("AAAAAAAAABBDDDDDDDEEI", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case7() {
        String S = "TOPCODER";
        int L = 3;
        assertEquals("CDT", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case8() {
        String S = "AAAAAAAAAAAAAAAAAACB";
        int L = 13;
        assertEquals("AAAAAAAAAAAAA", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case9() {
        String S = "WITHOUTITIMJUSTESPRIT";
        int L = 21;
        assertEquals("EHIIIIJMOPRSSTTTTTUUW", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case10() {
        String S = "RIGHTNOWYOUSHOULDBELAUGHING";
        int L = 5;
        assertEquals("ABDER", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case11() {
        String S = "GOGOKEFAKEFAISNOTBLUEYET";
        int L = 8;
        assertEquals("AABEEEEG", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case12() {
        String S = "ZZAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        int L = 2;
        assertEquals("AZ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case13() {
        String S = "ZZZZZZZZZZZZZZAAAAAAAAAAAAAAA";
        int L = 7;
        assertEquals("AAAAAAZ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case14() {
        String S = "GOOGLE";
        int L = 3;
        assertEquals("EGG", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case15() {
        String S = "GGNORE";
        int L = 5;
        assertEquals("EGGNO", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case16() {
        String S = "AZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZ";
        int L = 25;
        assertEquals("AAAAAAAAAAAAAAAAAAAAAAAAA", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case17() {
        String S = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int L = 13;
        assertEquals("ABCDEFGHIJKLM", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case18() {
        String S = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
        int L = 13;
        assertEquals("ABCDEFGHIJKLZ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case19() {
        String S = "TOPCODER";
        int L = 2;
        assertEquals("CT", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case20() {
        String S = "TOPCODER";
        int L = 3;
        assertEquals("CDT", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case21() {
        String S = "TOPCODER";
        int L = 5;
        assertEquals("CDEOT", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case22() {
        String S = "TOPCODER";
        int L = 6;
        assertEquals("CDEOOT", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case23() {
        String S = "TOPCODER";
        int L = 7;
        assertEquals("CDEOOPT", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case24() {
        String S = "TOPCODER";
        int L = 8;
        assertEquals("CDEOOPRT", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case25() {
        String S = "AAAAAABCDEFKYDETREZAZZYYYRRZ";
        int L = 5;
        assertEquals("AAAAA", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case26() {
        String S = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAZYX";
        int L = 20;
        assertEquals("AAAAAAAAAAAAAAAAAAAA", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case27() {
        String S = "MOMSEEIAMWRITINGTESTSFORTOPCODERTCOROUNDONE";
        int L = 13;
        assertEquals("ACCDDEEEEEFGM", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case28() {
        String S = "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCDD";
        int L = 3;
        assertEquals("CCC", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case29() {
        String S = "ZZZYYYGGGGXXXCBAABCFFFFFFTRRAWD";
        int L = 2;
        assertEquals("AZ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case30() {
        String S = "ZZZYYYGGGGXXXCBAABCFFFFFFTRRAWD";
        int L = 3;
        assertEquals("AAZ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case31() {
        String S = "ZZZYYYGGGGXXXCBAABCFFFFFFTRRAWD";
        int L = 4;
        assertEquals("AAAZ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case32() {
        String S = "ZZZYYYGGGGXXXCBAABCFFFFFFTRRAWD";
        int L = 5;
        assertEquals("AAABZ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case33() {
        String S = "ZZZYYYGGGGXXXCBAABCFFFFFFTRRAWD";
        int L = 6;
        assertEquals("AAABBZ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case34() {
        String S = "ZZZYYYGGGGXXXCBAABCFFFFFFTRRAWD";
        int L = 7;
        assertEquals("AAABBCZ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case35() {
        String S = "ZZZYYYGGGGXXXCBAABCFFFFFFTRRAWD";
        int L = 8;
        assertEquals("AAABBCCZ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case36() {
        String S = "ZZZYYYGGGGXXXCBAABCFFFFFFTRRAWD";
        int L = 9;
        assertEquals("AAABBCCDZ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case37() {
        String S = "ZZZYYYGGGGXXXCBAABCFFFFFFTRRAWD";
        int L = 10;
        assertEquals("AAABBCCDFZ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case38() {
        String S = "ZZZYYYGGGGXXXCBAABCFFFFFFTRRAWD";
        int L = 11;
        assertEquals("AAABBCCDFFZ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case39() {
        String S = "ZZZYYYGGGGXXXCBAABCFFFFFFTRRAWD";
        int L = 12;
        assertEquals("AAABBCCDFFFZ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case40() {
        String S = "ZZZYYYGGGGXXXCBAABCFFFFFFTRRAWD";
        int L = 13;
        assertEquals("AAABBCCDFFFFZ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case41() {
        String S = "QZZYYYGGGGXXXCBAABCFFFFFFTRRAWD";
        int L = 7;
        assertEquals("AAABBCQ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case42() {
        String S = "HAPJIABBNYDBWHYKZUPCUXMUSHNXWJC";
        int L = 30;
        assertEquals("AABBBCCDHHHIJJKMNNPPSUUUWWXXYY", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case43() {
        String S = "ZBMDDNXROMTVTPUGPDKBKTQDTGFUJCUTPFFMS";
        int L = 3;
        assertEquals("BBZ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case44() {
        String S = "RDFTODEBLEEALCAPOV";
        int L = 16;
        assertEquals("AABCDDEEEFLLOOPR", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case45() {
        String S = "NQLWGMCYVDIKTSXRLBOYUWLNSPYVOPUUFKSXDPYOVINYGUYU";
        int L = 41;
        assertEquals("BCDDFGGIIKKLLLMNNNOOOPPPQRSSSTUUUUUVVVWWX", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case46() {
        String S = "VZBMHXVJBRTKBXYCBBJOKETEHEE";
        int L = 27;
        assertEquals("BBBBBCEEEEHHJJKKMORTTVVXXYZ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case47() {
        String S = "SLIPRLZGUKFGGZGGZFYBZYUX";
        int L = 11;
        assertEquals("BFFGGGGGIKS", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case48() {
        String S = "NTIDXFZTRLDOMJQKVBPQHBSIUJWDAWZQSQEFRRZE";
        int L = 25;
        assertEquals("ABBDDDEEFFHIIJJKLMNOPQQQQ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case49() {
        String S = "XNGZNKVDFPKEQJRRSJJCNAFDAJNEHGBWWZ";
        int L = 28;
        assertEquals("AABCDDEEFFGGHJJJJKKNNNNPQRRX", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case50() {
        String S = "TOSNCWPMPGBAKSHPLRCUH";
        int L = 14;
        assertEquals("ABCCGHHKLMNOPT", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case51() {
        String S = "VGLJFMYQXUUJOMPFJHREEPWJMOJKEX";
        int L = 27;
        assertEquals("EEEFFGHJJJJJKLMMMOOPPQRUUVW", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case52() {
        String S = "TMOXPKAYZENMLCTGMQNPKXNADCZDIAUWTBHGHTUHHLETIVAM";
        int L = 32;
        assertEquals("AAAABCCDDEEGGHHHHIIKKLLMMMMNNNOT", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case53() {
        String S = "RLOJRAPGVLNRAZKHRPUVTLVFFBKJISKZBEPWHPIGA";
        int L = 24;
        assertEquals("AAABBEFFGGHHIIJJKKKLLLNR", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case54() {
        String S = "PLMINCKDMFYQQRQIJHIPRUSEMPAJBZHQWJMUTPT";
        int L = 39;
        assertEquals("ABCDEFHHIIIJJJKLMMMMNPPPPQQQQRRSTTUUWYZ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case55() {
        String S = "XZEIGOBEDYKBATQDNLBWQXOHKDXTIFMRRR";
        int L = 32;
        assertEquals("ABBBDDDEEFGHIIKKLMNOOQQRRRTTWXXX", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case56() {
        String S = "OPHCCLYCFBEIMQWPJEOFXLIORCZDFMOXPGGOQJVOBDFYM";
        int L = 45;
        assertEquals("BBCCCCDDEEFFFFGGHIIJJLLMMMOOOOOOPPPQQRVWXXYYZ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case57() {
        String S = "PIKPWZSIXCELWZHWPPOIEYKWDYYIMXEMBXXROICIEFPRYZJJJU";
        int L = 50;
        assertEquals("BCCDEEEEFHIIIIIIJJJKKLMMOOPPPPPRRSUWWWWXXXXYYYYZZZ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case58() {
        String S = "VKXMBOODNVBCHECYYZURLLYSPXNMKSDAAMVGNFDFFZHRQTGBRW";
        int L = 49;
        assertEquals("AABBBCCDDDEFFFGGHHKKLLMMMNNNOOPQRRRSSTUVVVWXXYYYZ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case59() {
        String S = "FXGWGRFXKOMHZMSJVOFZGLOCJTRZSZXDOLZDUZKAAKPDBEIEFL";
        int L = 50;
        assertEquals("AABCDDDEEFFFFGGGHIJJKKKLLLMMOOOOPRRSSTUVWXXXZZZZZZ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case60() {
        String S = "LVYOUQBWCWOAEKRSQIMCERSQBCTQKMIXDGXSPUYQLLRTZEAT";
        int L = 42;
        assertEquals("AABBCCCDEEEGIIKKLLLMMOOPQQQQQRRRSSSTTTUUVW", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case61() {
        String S = "VZZWFAHIPXPDIJMUAVVPVIDFITSTZBCRAYSXNIKASIUQBNXFJ";
        int L = 49;
        assertEquals("AAAABBCDDFFFHIIIIIIJJKMNNPPPQRSSSTTUUVVVVWXXXYZZZ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case62() {
        String S = "DEIFIHROLLRMRLQBOPHHMKLIRHHPFQIOAZRCFTCPWAMGSS";
        int L = 44;
        assertEquals("AABCCDEFFFGHHHHHIIIIKLLLLMMMOOOPPPQQRRRRRSST", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case63() {
        String S = "CRLYNZVWCJIWELRDONGTTSRCHSXCWSDFCHCIHFMK";
        int L = 40;
        assertEquals("CCCCCCDDEFFGHHHIIJKLLMNNORRRSSSTTVWWWXYZ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case64() {
        String S = "SBTHMGRJWYMODEWHJWFJEBWMJTYQQHEBHVVK";
        int L = 30;
        assertEquals("BBBDEEEFGHHHHJJJJKMMMOQQRSTTVV", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case65() {
        String S = "QZMBXCQJMYZCMJCTPISYGNRFGZCCCKSZXTJYZPFWQRRKFDXS";
        int L = 31;
        assertEquals("BCCCCCCDFFFGGIJJJKKMMMNPPQQQRRR", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case66() {
        String S = "GUXXCPBRMZJSVLKIGNBLNFKUYBMXKRIXGT";
        int L = 25;
        assertEquals("BBBCFGGGIIJKKKLLMMNNPRRST", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case67() {
        String S = "RSFKYTGDKTNAFKYAB";
        int L = 10;
        assertEquals("AABDFFGKKR", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case68() {
        String S = "WVILO";
        int L = 3;
        assertEquals("ILW", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case69() {
        String S = "GPXUCQGKQLXMDZAICPRGSGGTWLPWUIQBJQYHZENAWZRMGYLZDP";
        int L = 49;
        assertEquals("AABCCDDEGGGGGGHIIJKLLLMMNPPPPQQQQRRSTUUWWWXXYYZZZ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case70() {
        String S = "CBRJIMJFPVXZJGIRMKHYTGAGHBYMUXXFAMNMWNOTC";
        int L = 25;
        assertEquals("AABBCCFFGGGHHIIJJJKMMMMMN", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case71() {
        String S = "BQLGPPUKRCWMBSQUIQZOPGAEQOITLTLUKXZUVUZWGRPMB";
        int L = 39;
        assertEquals("ABBBCEGGGIIKKLLLMMOOPPPPQQQQRRSTTUUUUUV", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case72() {
        String S = "AXJXLMYHNMHWTYIIYVIZVM";
        int L = 12;
        assertEquals("AHHIIIJLMMMN", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case73() {
        String S = "FEFOBHTIZWOXONCPDPPXFOGEFMZMYXOAMDNSKOQQEWFJC";
        int L = 42;
        assertEquals("ABCCDDEEEFFFFFGHIJKMMMNNOOOOOOPPPQQSTWWXXX", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case74() {
        String S = "ZZZKEDSFKN";
        int L = 4;
        assertEquals("DEFZ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case75() {
        String S = "VKGTFJJVTQXGEAFDINNOLSXEZORXQBGZTYPWYTIXLLMJWMIGH";
        int L = 47;
        assertEquals("ABDEEFFGGGGHIIIJJJKLLLMMNNOOPQQRSTTTTVVWWXXXXYY", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case76() {
        String S = "ELTSBGXFYCGSSXPMUOSKPAXJRYLEJXWKZMNIVMRZQGJNBOE";
        int L = 45;
        assertEquals("ABBCEEEFGGGIJJJKKLLMMMNNOOPPQRRSSSSTUVWXXXXYY", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case77() {
        String S = "JFXHBZMWMPFOERHXQNEGDBUXOHWDDFTADDPMSV";
        int L = 37;
        assertEquals("ABBDDDDDEEFFFGHHHJMMMNOOPPQRSTUVWWXXX", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case78() {
        String S = "DPRQGPWWVQFBVQGHHJPHLFDAJNQAJSGEQYWHQXYS";
        int L = 4;
        assertEquals("AABD", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case79() {
        String S = "VWPTOJCGJHMUHZTAYLRJGTNZPIKWVPQURSOCJNVMJ";
        int L = 33;
        assertEquals("ACCGGHHIJJJJJKLMMNNOOPPPQRRSTTTUV", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case80() {
        String S = "RQDHVIMPLUBYTMHWGKRFVVWRAVHGANO";
        int L = 5;
        assertEquals("AABDR", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case81() {
        String S = "KJUZTZRTXVZZTOXZASJIAOVKIBD";
        int L = 5;
        assertEquals("AABDK", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case82() {
        String S = "BOUTKWMRRHDNHQUTRLSVDMOHKVJLHJEAZYIYGVLDHEKMVWCJ";
        int L = 33;
        assertEquals("ABCDDDEEGHHHHHIJJJKKKLLLMMMNOOQRR", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case83() {
        String S = "DXGQGSXWEVPXIPMTQVMSHOTAWBZEAFYFPDDSLKMLCBBXWDNFZY";
        int L = 38;
        assertEquals("AABBBCDDDDEEFFFGGHIKLLMMMNOPPPQQSSSTTV", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case84() {
        String S = "HQCHMTKSYHSTHYRTJKBRMWXVRGMWHNSHYYYPIFEWVGOUYFQLBW";
        int L = 30;
        assertEquals("BBCEFFGGHHHHHHIJKKLMMMNOPQQRRR", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case85() {
        String S = "BUVHLGOJJNKPPKOFTFGPVCVKXREAGOAYYHIGBFWFXVIWFRKGYV";
        int L = 20;
        assertEquals("AABBCEFFFFFGGGGGHHII", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case86() {
        String S = "GTZBSGVZTHEVZQIIHRCGAJEIQAUYSXJCIHSQAKUUJMVAZGYNGK";
        int L = 40;
        assertEquals("AAAABCCEEGGGGGHHHIIIIJJJKKMNQQQRSSSTTUUU", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case87() {
        String S = "XTCFVLCNATYLYJKWNCXVJSPTHTLQUCWHDJLTKPOBMZMOSJBFTT";
        int L = 18;
        assertEquals("ABBCCCCDFFHHJJJJKX", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case88() {
        String S = "ISCWEYMYKTKDJIPQODMZBHRSXIPVJRAQHIGKBUWLTTFXPCWQPJ";
        int L = 38;
        assertEquals("ABBCCDDEFGHHIIIIJJJKKKLMMOPPPPQQQRRSST", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case89() {
        String S = "WNNFYHRAJBVCPCXMHTZFTVUIEFOPUSNDILYBVJLWHWDECFQIBV";
        int L = 50;
        assertEquals("ABBBCCCDDEEFFFFHHHIIIJJLLMNNNOPPQRSTTUUVVVVWWWXYYZ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case90() {
        String S = "DCLMPUPUOVHKXJPTWEMUDOMFVWNWXXDBPFRPZSNQRSIFPPYFKG";
        int L = 47;
        assertEquals("BCDDDEFFFFGHIJKKLMMMNNOOPPPPPPPQRRSSTUUUVVWWWXX", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case91() {
        String S = "WWIVDXKVARTTAIYOXTGHGLWWGVPTERSTGHMELPZBLFIBOEKVQV";
        int L = 6;
        assertEquals("AABBDW", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case92() {
        String S = "CBA";
        int L = 2;
        assertEquals("AC", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case93() {
        String S = "DDDAA";
        int L = 2;
        assertEquals("AD", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case94() {
        String S = "ZAAB";
        int L = 3;
        assertEquals("AAZ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case95() {
        String S = "GAAA";
        int L = 3;
        assertEquals("AAG", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case96() {
        String S = "BAAA";
        int L = 3;
        assertEquals("AAB", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case97() {
        String S = "RAA";
        int L = 2;
        assertEquals("AR", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case98() {
        String S = "BBBAAA";
        int L = 3;
        assertEquals("AAB", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case99() {
        String S = "KJIHGFEDCBA";
        int L = 5;
        assertEquals("ABCDK", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case100() {
        String S = "ZAAA";
        int L = 3;
        assertEquals("AAZ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case101() {
        String S = "SAA";
        int L = 2;
        assertEquals("AS", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case102() {
        String S = "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ";
        int L = 20;
        assertEquals("ZZZZZZZZZZZZZZZZZZZZ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case103() {
        String S = "LLLLLLLAAAAAAAA";
        int L = 2;
        assertEquals("AL", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case104() {
        String S = "EFAAAA";
        int L = 2;
        assertEquals("AE", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case105() {
        String S = "TAA";
        int L = 2;
        assertEquals("AT", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case106() {
        String S = "EDCBA";
        int L = 2;
        assertEquals("AE", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case107() {
        String S = "ZZZA";
        int L = 3;
        assertEquals("AZZ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case108() {
        String S = "BBAA";
        int L = 2;
        assertEquals("AB", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case109() {
        String S = "AXC";
        int L = 3;
        assertEquals("ACX", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case110() {
        String S = "ZBCDEFGHIJKLMNOPQRSTUVWXYA";
        int L = 2;
        assertEquals("AZ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case111() {
        String S = "ZYXWVUTSRQPONMLKJIHGFEDCBAZYXWVUTSRQPONMLKJIHGFEDC";
        int L = 7;
        assertEquals("ABCCDDZ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case112() {
        String S = "ZZZBYOSWXUMIJFCEXWUOJFEBFUROKQJRGCGSIMGYNOYDFAPFDT";
        int L = 8;
        assertEquals("ABBCCDDZ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case113() {
        String S = "ABDCB";
        int L = 4;
        assertEquals("ABBC", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case114() {
        String S = "ZZZAAA";
        int L = 3;
        assertEquals("AAZ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case115() {
        String S = "CBAA";
        int L = 2;
        assertEquals("AC", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case116() {
        String S = "SOPCODER";
        int L = 3;
        assertEquals("CDS", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case117() {
        String S = "RABCDE";
        int L = 5;
        assertEquals("ABCDR", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case118() {
        String S = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        int L = 2;
        assertEquals("AA", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case119() {
        String S = "CCBA";
        int L = 3;
        assertEquals("ABC", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case120() {
        String S = "DBCA";
        int L = 2;
        assertEquals("AD", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case121() {
        String S = "ZAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        int L = 2;
        assertEquals("AZ", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case122() {
        String S = "YYXXWWVVUUTTSSRRQQPPOONNMMLLKKJJIIHHGGFFEEDDCCBBAA";
        int L = 2;
        assertEquals("AY", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case123() {
        String S = "BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBA";
        int L = 2;
        assertEquals("AB", ellyssortingtrimmer.getMin(S, L));
    }

    @Test
    public void case124() {
        String S = "CCC";
        int L = 2;
        assertEquals("CC", ellyssortingtrimmer.getMin(S, L));
    }

}
