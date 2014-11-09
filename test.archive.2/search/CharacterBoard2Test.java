package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class CharacterBoard2Test {
    CharacterBoard2 characterboard2 = new CharacterBoard2();

    @Test
    public void case1() {
        String[] fragment = { "dea", "abc" };
        int W = 7;
        int i0 = 1;
        int j0 = 1;
        assertEquals(1, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case2() {
        String[] fragment = { "xyxxy" };
        int W = 6;
        int i0 = 1;
        int j0 = 0;
        assertEquals(28, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case3() {
        String[] fragment = { "gogogo", "jijiji", "rarara" };
        int W = 6;
        int i0 = 0;
        int j0 = 0;
        assertEquals(0, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case4() {
        String[] fragment = { "abababacac", "aaacacacbb", "ccabababab" };
        int W = 882;
        int i0 = 10;
        int j0 = 62;
        assertEquals(361706985, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case5() {
        String[] fragment = { "asjkffqw", "basjkffq", "qbasjkff", "qqbasjkf" };
        int W = 9031;
        int i0 = 9024;
        int j0 = 1959;
        assertEquals(173947456, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case6() {
        String[] fragment = { "aaaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaa" };
        int W = 10000;
        int i0 = 0;
        int j0 = 0;
        assertEquals(253373800, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case7() {
        String[] fragment = { "aaaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaab" };
        int W = 10000;
        int i0 = 0;
        int j0 = 0;
        assertEquals(481162973, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case8() {
        String[] fragment = { "a", "a" };
        int W = 1;
        int i0 = 125;
        int j0 = 0;
        assertEquals(1, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case9() {
        String[] fragment = { "a", "a" };
        int W = 2;
        int i0 = 145;
        int j0 = 0;
        assertEquals(27, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case10() {
        String[] fragment = { "a", "b" };
        int W = 1;
        int i0 = 125;
        int j0 = 0;
        assertEquals(0, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case11() {
        String[] fragment = { "aaaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaab" };
        int W = 10000;
        int i0 = 8159;
        int j0 = 1230;
        assertEquals(481162973, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case12() {
        String[] fragment = { "bbbbbbaaaa", "abbbaabbaa", "aabbbbabba", "aabbbbbaaa", "aabbaabaaa", "bbaabaabaa", "bbaaaaaaaa", "babaaabbbb", "aaabbbaaab", "bababbaabb" };
        int W = 10000;
        int i0 = 1275;
        int j0 = 92;
        assertEquals(954403309, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case13() {
        String[] fragment = { "dqjzzwkax", "enrupfqzx", "roxyelnno" };
        int W = 5029;
        int i0 = 6425;
        int j0 = 413;
        assertEquals(533708449, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case14() {
        String[] fragment = { "eenrd", "xyofp", "vxxok" };
        int W = 4510;
        int i0 = 5340;
        int j0 = 3953;
        assertEquals(844044003, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case15() {
        String[] fragment = { "qd", "kc", "zc", "nt", "np" };
        int W = 8593;
        int i0 = 7103;
        int j0 = 3960;
        assertEquals(651086495, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case16() {
        String[] fragment = { "czfrvlvpp" };
        int W = 7634;
        int i0 = 5529;
        int j0 = 4058;
        assertEquals(490663457, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case17() {
        String[] fragment = { "ubtqsargxu", "jrhaxcdwmd", "tpqrqhxgbe", "pezkuvvotx", "mxveehtyov", "qpvvtxdzmd", "dftswtdcln", "pbchlocqmu", "exipytuxpv" };
        int W = 3897;
        int i0 = 9186;
        int j0 = 3785;
        assertEquals(714044871, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case18() {
        String[] fragment = { "tytj", "eajj", "gyyi", "wldm", "gdwv", "ljte", "jzle", "lshh", "tuag", "ujyf" };
        int W = 5480;
        int i0 = 3992;
        int j0 = 3192;
        assertEquals(369980528, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case19() {
        String[] fragment = { "sgjp", "dcnk", "feqv", "wbfh", "nzpa", "cvob", "ipix", "odfx", "ndri" };
        int W = 5703;
        int i0 = 5089;
        int j0 = 3753;
        assertEquals(517784911, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case20() {
        String[] fragment = { "zvsnnazg", "vgxueslx", "rlbxazqe", "pocouael", "gfealvaz" };
        int W = 9375;
        int i0 = 877;
        int j0 = 729;
        assertEquals(816068458, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case21() {
        String[] fragment = { "paxtpex", "rwjsmel", "notosgd", "eytogfr", "kzupfjr", "rseoehg", "qirryik", "osjwzrq", "qzzhvei" };
        int W = 7216;
        int i0 = 6421;
        int j0 = 1038;
        assertEquals(931120584, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case22() {
        String[] fragment = { "m", "e", "z", "z", "b", "a", "m" };
        int W = 5304;
        int i0 = 8738;
        int j0 = 5072;
        assertEquals(681802875, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case23() {
        String[] fragment = { "xrdjb" };
        int W = 2193;
        int i0 = 6710;
        int j0 = 1856;
        assertEquals(253662504, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case24() {
        String[] fragment = { "dgew", "mhrp", "dixm", "xvpk", "mewp", "kvdj", "issi", "tmlr", "ewpu", "bpae" };
        int W = 7036;
        int i0 = 1401;
        int j0 = 390;
        assertEquals(12329671, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case25() {
        String[] fragment = { "srpomdt", "zjemhhv", "ycqusbg", "dblhmho", "fhcfsfg" };
        int W = 4645;
        int i0 = 4081;
        int j0 = 3788;
        assertEquals(444526770, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case26() {
        String[] fragment = { "ip", "pv", "gi" };
        int W = 8299;
        int i0 = 636;
        int j0 = 6371;
        assertEquals(689579247, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case27() {
        String[] fragment = { "jwgyskv", "azraxkh", "eapvmrt", "fnuglpp", "hismjwr", "zfhcwre" };
        int W = 3253;
        int i0 = 7363;
        int j0 = 2190;
        assertEquals(820308701, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case28() {
        String[] fragment = { "cbgbfv", "zeyrzl", "okbmrv", "uqbyhp" };
        int W = 4052;
        int i0 = 733;
        int j0 = 419;
        assertEquals(382516384, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case29() {
        String[] fragment = { "su", "lh", "vd", "se", "cf", "ro", "sd", "km" };
        int W = 1172;
        int i0 = 2216;
        int j0 = 351;
        assertEquals(954950596, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case30() {
        String[] fragment = { "tekgwa", "bzfuwl", "wjbltm" };
        int W = 9286;
        int i0 = 4366;
        int j0 = 4600;
        assertEquals(651904760, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case31() {
        String[] fragment = { "vwks", "izam", "amvp", "xphi", "ycne" };
        int W = 4148;
        int i0 = 6902;
        int j0 = 2313;
        assertEquals(204930400, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case32() {
        String[] fragment = { "s", "x", "i", "j", "q", "i", "e" };
        int W = 3879;
        int i0 = 4604;
        int j0 = 2123;
        assertEquals(710328089, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case33() {
        String[] fragment = { "aimhbgpxn", "xlbijvpcl", "hbzfzgsap", "wpzpuulpt", "gjakjbfce", "pqmpibtqv", "eveeutuny", "gjbfkdnnh", "vuhzofnmj" };
        int W = 9668;
        int i0 = 4651;
        int j0 = 5697;
        assertEquals(167662266, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case34() {
        String[] fragment = { "nkasdzkj", "tkyjghdm", "xjfpiskm", "ukffcbxm", "thdeunic", "cxocksob", "waahtxzd", "onrmfsmk", "idhvnpfg" };
        int W = 6838;
        int i0 = 938;
        int j0 = 66;
        assertEquals(656602208, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case35() {
        String[] fragment = { "krtrtgxuo", "yglhaielr", "ppoguroyf", "whxlozbrd", "nipotsswq", "mauwewqcn", "rxgjsbuls", "oqmgpcsof", "dzavfluhc" };
        int W = 584;
        int i0 = 501;
        int j0 = 404;
        assertEquals(44297560, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case36() {
        String[] fragment = { "aspafgarp", "jcmbpqfbj", "czuazqmvy", "usinbwhul", "xpagogwsz", "vyptiuvlk", "gjkrwerpu", "ffxfmekih", "rzrlpuvrd", "rsdthprjx" };
        int W = 4289;
        int i0 = 2367;
        int j0 = 3403;
        assertEquals(147231832, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case37() {
        String[] fragment = { "zkzazeyj", "uaipnnaq", "monbzdtn", "igbddzaj", "mwxaucnf", "zljnqyht", "wixtfoga", "vzpajias", "lyqgwfjb" };
        int W = 7380;
        int i0 = 1115;
        int j0 = 1685;
        assertEquals(605258212, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case38() {
        String[] fragment = { "levtgaytu", "rjlqxrntp", "pigyswcgu", "szetuqfzc", "lvpdkziot", "strhuiepp", "fchbmyfia", "dhbrucicd", "yzygzxczl" };
        int W = 9225;
        int i0 = 113;
        int j0 = 6684;
        assertEquals(712311637, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case39() {
        String[] fragment = { "lqdkmyup", "ufetjqkl", "uwkxvnak", "mswlbwrt", "bhfhvqvd", "lijcmcyr", "lfwkeoaa", "oobdajgu", "oitaqizl", "xytgmyoa" };
        int W = 7628;
        int i0 = 5476;
        int j0 = 5708;
        assertEquals(349208890, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case40() {
        String[] fragment = { "zanlmjkqg", "cwcnvhxws", "dqtjhykxw", "hfdvshdhj", "hwcmtkmdb", "iqhhmerrx", "pjumvpovr", "nabgvwpdi", "ztrlahjmo" };
        int W = 7702;
        int i0 = 1985;
        int j0 = 4046;
        assertEquals(991831630, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case41() {
        String[] fragment = { "ekebgtpdok", "pjtefofxny", "igecbdkmkn", "uzmclskuum", "jhqdxfowfx", "wuoqdydrtd", "vgytdejvcn", "hxmwwlgxcx", "oltuefwdib", "cdjwxqxdqq" };
        int W = 2431;
        int i0 = 5069;
        int j0 = 1199;
        assertEquals(400344995, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case42() {
        String[] fragment = { "pmpucylvb", "ufyipkbeo", "fnyohjgfl", "rqzinqqep", "ezfossytt", "dwctzclbh", "fszmkhggt", "jfmueggyj", "qbkyqldtu" };
        int W = 1643;
        int i0 = 3623;
        int j0 = 86;
        assertEquals(802976187, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case43() {
        String[] fragment = { "vyjfrbyrhi", "rhikjtvvyj", "vyjfrbyrhi", "rhikjtvvyj", "vyjfrbyrhi", "rhikjtvvyj", "vyjfrbyrhi", "rhikjtvvyj", "vyjfrbyrhi", "rhikjtvvyj" };
        int W = 8015;
        int i0 = 650;
        int j0 = 3386;
        assertEquals(791546177, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case44() {
        String[] fragment = { "xknntimzx", "nxknntimz", "hnxknntim", "uhnxknnti", "buhnxknnt", "tbuhnxknn", "ltbuhnxkn", "xltbuhnxk" };
        int W = 9843;
        int i0 = 7762;
        int j0 = 6739;
        assertEquals(850014162, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case45() {
        String[] fragment = { "zcfarxan", "hizcfarx", "nbhizcfa", "annbhizc", "rxannbhi", "farxannb", "zcfarxan", "hizcfarx", "nbhizcfa", "annbhizc" };
        int W = 7126;
        int i0 = 1779;
        int j0 = 294;
        assertEquals(221359024, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case46() {
        String[] fragment = { "iwipaqtb", "ipaqtbxi", "aqtbxiph", "tbxiphbu", "xiphbuzo", "phbuzoby", "buzobyui", "zobyuiwi", "byuiwipa" };
        int W = 9616;
        int i0 = 9680;
        int j0 = 6880;
        assertEquals(620616321, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case47() {
        String[] fragment = { "jsxhdbgcdp", "qbjsxhdbgc", "dpqbjsxhdb", "gcdpqbjsxh", "dbgcdpqbjs", "xhdbgcdpqb", "jsxhdbgcdp", "qbjsxhdbgc", "dpqbjsxhdb", "gcdpqbjsxh" };
        int W = 7978;
        int i0 = 6222;
        int j0 = 923;
        assertEquals(223531031, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case48() {
        String[] fragment = { "rrxlhribr", "enmrrxlhr", "zavenmrrx", "ticzavenm", "cyfticzav", "pavcyftic", "kbdpavcyf", "ibrkbdpav", "lhribrkbd" };
        int W = 8907;
        int i0 = 1000;
        int j0 = 5913;
        assertEquals(694325584, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case49() {
        String[] fragment = { "junpoysvn", "uyrorzjun", "oysvnpuyr", "rzjunpoys", "npuyrorzj", "npoysvnpu", "rorzjunpo", "svnpuyror", "junpoysvn", "uyrorzjun" };
        int W = 9754;
        int i0 = 8266;
        int j0 = 9423;
        assertEquals(726038998, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case50() {
        String[] fragment = { "ugywscfuy", "hhymdeyug", "ljcqlklhh", "fuyjcgalj", "yugywscfu", "lhhymdeyu", "aljcqlklh", "cfuyjcgal", "eyugywscf", "klhhymdey" };
        int W = 9146;
        int i0 = 7991;
        int j0 = 6911;
        assertEquals(428363515, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case51() {
        String[] fragment = { "mdxbftrn", "tmdxbftr", "atmdxbft", "batmdxbf", "bbatmdxb", "lbbatmdx", "nlbbatmd", "jnlbbatm", "jjnlbbat" };
        int W = 8672;
        int i0 = 9140;
        int j0 = 4880;
        assertEquals(580961481, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case52() {
        String[] fragment = { "sdbrpeba", "dbrpebae", "brpebaeg", "rpebaegp", "pebaegpy", "ebaegpyi", "baegpyiz", "aegpyizq", "egpyizqx" };
        int W = 9145;
        int i0 = 3841;
        int j0 = 4217;
        assertEquals(771829921, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case53() {
        String[] fragment = { "pvqozfsdgr", "ejmtoxrqlm", "mugldcsdrm", "pvqozfsdgr", "ejmtoxrqlm", "mugldcsdrm", "pvqozfsdgr", "ejmtoxrqlm", "mugldcsdrm", "pvqozfsdgr" };
        int W = 10000;
        int i0 = 3521;
        int j0 = 4530;
        assertEquals(276277834, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case54() {
        String[] fragment = { "apwixecsho", "rhlbriedgk", "imweoonrrr", "apwixecsho", "rhlbriedgk", "imweoonrrr", "apwixecsho", "rhlbriedgk" };
        int W = 10000;
        int i0 = 9605;
        int j0 = 438;
        assertEquals(338817711, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case55() {
        String[] fragment = { "sfsrxumc", "sfsrxumc", "sfsrxumc", "sfsrxumc", "sfsrxumc", "sfsrxumc", "sfsrxumc", "sfsrxumc", "sfsrxumc" };
        int W = 10000;
        int i0 = 4052;
        int j0 = 4414;
        assertEquals(573834803, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case56() {
        String[] fragment = { "skyngepa", "gepaqzlw", "qzlwrhdm", "rhdmcsky", "cskyngep", "ngepaqzl", "aqzlwrhd", "wrhdmcsk" };
        int W = 10000;
        int i0 = 7262;
        int j0 = 6046;
        assertEquals(584970502, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case57() {
        String[] fragment = { "goranzhjik", "sqnqnyisbr", "jefvvmpyul", "fnfkkzakcn", "qpylbicbnn", "myuxsbvizq", "ygqurwzvnh", "qhirgocmzk", "pqllccjhct" };
        int W = 9512;
        int i0 = 4854;
        int j0 = 5511;
        assertEquals(591699156, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case58() {
        String[] fragment = { "qhriqrglx", "ymnhsvkgl", "uixvzhfqo", "mrbxwoxze", "inmhzyqif", "hdupuqfib", "ewowfogvv", "ojsebirme", "tdvzjquvy" };
        int W = 9562;
        int i0 = 1239;
        int j0 = 329;
        assertEquals(195920929, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case59() {
        String[] fragment = { "pmiweaalc", "pmiweaalc", "pmiweaalc", "pmiweaalc", "pmiweaalc", "pmiweaalc", "pmiweaalc", "pmiweaalc", "pmiweaalc" };
        int W = 10;
        int i0 = 8604;
        int j0 = 0;
        assertEquals(26, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case60() {
        String[] fragment = { "fxsytflugb", "fxsytflugb", "fxsytflugb", "fxsytflugb", "fxsytflugb", "fxsytflugb", "fxsytflugb", "fxsytflugb", "fxsytflugb", "fxsytflugb" };
        int W = 10000;
        int i0 = 5819;
        int j0 = 5629;
        assertEquals(569107362, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case61() {
        String[] fragment = { "vbtwromqv", "omqvbtwro", "twromqvbt", "qvbtwromq", "romqvbtwr", "btwromqvb", "mqvbtwrom", "wromqvbtw", "vbtwromqv" };
        int W = 333;
        int i0 = 1650;
        int j0 = 113;
        assertEquals(444363246, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case62() {
        String[] fragment = { "taotaota", "aotaotao", "otaotaot", "taotaota", "aotaotao", "otaotaot", "taotaota", "aotaotao", "otaotaot" };
        int W = 334;
        int i0 = 4827;
        int j0 = 11;
        assertEquals(451137862, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case63() {
        String[] fragment = { "dea", "abc" };
        int W = 7;
        int i0 = 1;
        int j0 = 1;
        assertEquals(1, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case64() {
        String[] fragment = { "asjkffqw", "basjkffq", "qbasjkff", "qqbasjkf" };
        int W = 9031;
        int i0 = 9024;
        int j0 = 1959;
        assertEquals(173947456, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case65() {
        String[] fragment = { "xyxxy" };
        int W = 6;
        int i0 = 1;
        int j0 = 0;
        assertEquals(28, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case66() {
        String[] fragment = { "aaaa", "aaaa" };
        int W = 5000;
        int i0 = 4888;
        int j0 = 4888;
        assertEquals(362932625, characterboard2.countGenerators(fragment, W, i0, j0));
    }

    @Test
    public void case67() {
        String[] fragment = { "asjkffww", "basjkffq", "qbasjkff", "qqbasjkf" };
        int W = 9031;
        int i0 = 9024;
        int j0 = 1959;
        assertEquals(668576860, characterboard2.countGenerators(fragment, W, i0, j0));
    }

}
