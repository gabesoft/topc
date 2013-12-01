package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class EqualizeStringsTest {
    EqualizeStrings equalizestrings = new EqualizeStrings();

    @Test
    public void case1() {
        String s = "cat";
        String t = "dog";
        assertEquals("caa", equalizestrings.getEq(s, t));
    }

    @Test
    public void case2() {
        String s = "abcdefghijklmnopqrstuvwxyz";
        String t = "bcdefghijklmnopqrstuvwxyza";
        assertEquals("abcdefghijklmnopqrstuvwxya", equalizestrings.getEq(s, t));
    }

    @Test
    public void case3() {
        String s = "programmingcompetitionsrule";
        String t = "programmingcompetitionsrule";
        assertEquals("programmingcompetitionsrule", equalizestrings.getEq(s, t));
    }

    @Test
    public void case4() {
        String s = "topcoderopen";
        String t = "onlinerounds";
        assertEquals("onlcndaoondn", equalizestrings.getEq(s, t));
    }

    @Test
    public void case5() {
        String s = "aazanamaobnbmbobpxxxyyyzzz";
        String t = "azanamaobnbmbobpbzyxzyxzyx";
        assertEquals("aaaaaaaaabbbbaaaaxxxyyxzyx", equalizestrings.getEq(s, t));
    }

    @Test
    public void case6() {
        String s = "oxj";
        String t = "imo";
        assertEquals("imj", equalizestrings.getEq(s, t));
    }

    @Test
    public void case7() {
        String s = "tdnzvghl";
        String t = "nvhhjmzs";
        assertEquals("nahajgal", equalizestrings.getEq(s, t));
    }

    @Test
    public void case8() {
        String s = "gskstxncxwploxjebv";
        String t = "yzjaiksblsjeeomhpx";
        assertEquals("asjaianblsjeeojeav", equalizestrings.getEq(s, t));
    }

    @Test
    public void case9() {
        String s = "zzsjzcrhulejffoajqlxyfwqevdqkhudcizcmxxfshomk";
        String t = "ksmjzoujccnbcazakzlhsmtfboteseqkninwqeviegumc";
        assertEquals("asmjzcrhacebcaoajqlasftfboaekeqdcinamavfagomc", equalizestrings.getEq(s, t));
    }

    @Test
    public void case10() {
        String s = "ylygvkabtioalcsdwuotigpugjnmbkcmvbxoipwhavuvnbpke";
        String t = "tfwpzlgxdqkwgpfjdyxqbhfbicwlbrzsqzxmfrxqjsnhbkmtl";
        assertEquals("tfwgvkaaaikagaadauoqbgfagcnlbkamqaxmfpwhasnabbmke", equalizestrings.getEq(s, t));
    }

    @Test
    public void case11() {
        String s = "ocfmfrgrphpuqpvubnugufprdrwqssolndeveuhjtinztffgrc";
        String t = "pxonbiolxlzjppbonivgllbherjsvbczglatewduemrmtxdftk";
        assertEquals("oafmbiglphpjppaobiuglfahdraqsacagdateudjainatadfrc", equalizestrings.getEq(s, t));
    }

    @Test
    public void case12() {
        String s = "mltmv";
        String t = "rukyd";
        assertEquals("mlkma", equalizestrings.getEq(s, t));
    }

    @Test
    public void case13() {
        String s = "norkqfb";
        String t = "pdpqvsi";
        assertEquals("ndpkqab", equalizestrings.getEq(s, t));
    }

    @Test
    public void case14() {
        String s = "rdlaokqchxbocbmzhjtxp";
        String t = "oqwvqvogifvnerkaxxojs";
        assertEquals("oalaokochaancakaaaoap", equalizestrings.getEq(s, t));
    }

    @Test
    public void case15() {
        String s = "qqyuhokxrunltnvnekbbrjtzxmuyxqwwgimkoqkcxzz";
        String t = "ngzpwjwajatycdmosbfqgyxlqprxidkitsaarcmrbfv";
        assertEquals("ngypajkajanaadmnabbagataqmrxaakaaiaaoakaaav", equalizestrings.getEq(s, t));
    }

    @Test
    public void case16() {
        String s = "eolnscassggpwauarbydbfynejltrnzbgxglqdoaordsytfb";
        String t = "xlaxnunkssqaabzrmdvzcninvpjmclcmnrdhhybchdfxrjra";
        assertEquals("alannaaksggaaauambvabfanajjmalabgrdhhaaahadsrjfa", equalizestrings.getEq(s, t));
    }

    @Test
    public void case17() {
        String s = "eltemmzycsgscdiqcvsyumnqktzadmvjhaznpcwffilzyakyim";
        String t = "wrydxbjbmtedhakjsfwafevlpvyunwklaxikdyuhvvvrdedqpi";
        assertEquals("altdmbaacseacaijaasaaenlktyadmkjaaakdaufaalraadqii", equalizestrings.getEq(s, t));
    }

    @Test
    public void case18() {
        String s = "rzbvbk";
        String t = "qqwutu";
        assertEquals("qqauak", equalizestrings.getEq(s, t));
    }

    @Test
    public void case19() {
        String s = "qsfhrjtbi";
        String t = "biyfknllt";
        assertEquals("aiafkjlbi", equalizestrings.getEq(s, t));
    }

    @Test
    public void case20() {
        String s = "uhkwwiggjrbstk";
        String t = "tygrowkcrygrfo";
        assertEquals("tagroagcjrbrak", equalizestrings.getEq(s, t));
    }

    @Test
    public void case21() {
        String s = "ivwoltddkdypqeyezibbjdpwfyddkacreuiphnkvnwelqy";
        String t = "onygtbgpxwkokycjexhsqslvwjhbyzasgihcoqfpcqrmme";
        assertEquals("inwgladdaaaokaaeaabajalvaadbaaareihahnfpcqalma", equalizestrings.getEq(s, t));
    }

    @Test
    public void case22() {
        String s = "ftdijyhitvwpscpmarwsgtuexrxtmvlbzadqexjmagwmxful";
        String t = "pwdcdonjulftqjitkancxasosxcgjgkegorwcwzhpvmogqmn";
        assertEquals("ftdcdohitlapqcimaanaaasesraajakbaaaqcwahaammafml", equalizestrings.getEq(s, t));
    }

    @Test
    public void case23() {
        String s = "qgqfcgwspdojlsieixbyimduphsovejaiwkzsngkhmvanuyrvy";
        String t = "xwqkizppkmaixgguyzylzcuduvosrztfrbipjjazsdiyzkpfwm";
        assertEquals("qaqfcappkdailggaaxaaacaapaoorajaiaipjjaahdaankpfvm", equalizestrings.getEq(s, t));
    }

    @Test
    public void case24() {
        String s = "locgy";
        String t = "oolbn";
        assertEquals("locbn", equalizestrings.getEq(s, t));
    }

    @Test
    public void case25() {
        String s = "qwppatznd";
        String t = "aghymptmc";
        assertEquals("aahpaptmc", equalizestrings.getEq(s, t));
    }

    @Test
    public void case26() {
        String s = "tilgbbxsfrmorazhalkoquf";
        String t = "hubjoupujbftzibklqnwugz";
        assertEquals("hibgaapsfaforaahalkoqaa", equalizestrings.getEq(s, t));
    }

    @Test
    public void case27() {
        String s = "edjocwejlnhifmcvchvpknwptogtfjnc";
        String t = "kxfffetsdaunugqcttavkucwzvlrfgec";
        assertEquals("eaffcaajdaaiagaaahapknaptogrfgec", equalizestrings.getEq(s, t));
    }

    @Test
    public void case28() {
        String s = "cflzgaifhmyrzxqowhwvpevqerqaweesrhaxyrxpycxiujhn";
        String t = "vgpwrtaebzgnxdtylmweeiyrmvyqzfqyehhuhwnqfdydhvpy";
        assertEquals("aflwgaaebaanxaqolhwaeevqerqaweesahauarnpacxdajhn", equalizestrings.getEq(s, t));
    }

    @Test
    public void case29() {
        String s = "vmetkijzbisfkhpsyapaljmzdjgjdhwuyunxquz";
        String t = "vvpseeaujlhthrnlysgdihudiwueochxueftiuo";
        assertEquals("vmeseeaubihahhnlyagaihmadaaedcauuaftiuo", equalizestrings.getEq(s, t));
    }

    @Test
    public void case30() {
        String s = "a";
        String t = "a";
        assertEquals("a", equalizestrings.getEq(s, t));
    }

    @Test
    public void case31() {
        String s = "a";
        String t = "z";
        assertEquals("a", equalizestrings.getEq(s, t));
    }

    @Test
    public void case32() {
        String s = "b";
        String t = "n";
        assertEquals("b", equalizestrings.getEq(s, t));
    }

    @Test
    public void case33() {
        String s = "o";
        String t = "b";
        assertEquals("a", equalizestrings.getEq(s, t));
    }

    @Test
    public void case34() {
        String s = "b";
        String t = "n";
        assertEquals("b", equalizestrings.getEq(s, t));
    }

    @Test
    public void case35() {
        String s = "jinmys";
        String t = "ysosru";
        assertEquals("ainmrs", equalizestrings.getEq(s, t));
    }

    @Test
    public void case36() {
        String s = "bpanyo";
        String t = "zonman";
        assertEquals("aoaman", equalizestrings.getEq(s, t));
    }

    @Test
    public void case37() {
        String s = "wzxjrusb";
        String t = "ihacfusz";
        assertEquals("aaacfusa", equalizestrings.getEq(s, t));
    }

    @Test
    public void case38() {
        String s = "zyyoyann";
        String t = "zzpnzzzm";
        assertEquals("zypnyanm", equalizestrings.getEq(s, t));
    }

    @Test
    public void case39() {
        String s = "uqbpjfzshdzbxyoj";
        String t = "azznxcwyzdhiaosw";
        assertEquals("aqanacwsadabaooa", equalizestrings.getEq(s, t));
    }

    @Test
    public void case40() {
        String s = "zomybaaozmznmbmb";
        String t = "amanpznoannaoynm";
        assertEquals("amanaaaoamnamamb", equalizestrings.getEq(s, t));
    }

    @Test
    public void case41() {
        String s = "krzyzhqiqgpqgzohvkkqhoolaohgnj";
        String t = "hxaixcqpkiwaaezplwbxninbvpsdvf";
        assertEquals("hraaxcqikgpaaaohlkbqhinbaohdnf", equalizestrings.getEq(s, t));
    }

    @Test
    public void case42() {
        String s = "ynyybpazmzmbpamopooobpbyzopbmo";
        String t = "ybzoaabazoznponaazopopnpmbbanp";
        assertEquals("ybyoaaaaaoabpamaaoooapbpaaaamo", equalizestrings.getEq(s, t));
    }

    @Test
    public void case43() {
        String s = "wosqiomtnygzcvcynjbixipeimyqvjbrzviijwdwwjyygaxwj";
        String t = "yejgtpqinhdwkwwiggrcjqzuozdowzzwfkdzatjncomnkivtq";
        assertEquals("wejgiominadwcvaaggacaipaiaaovaarakdaatdnajmngavtj", equalizestrings.getEq(s, t));
    }

    @Test
    public void case44() {
        String s = "omznoponanomobzonyoppynmamzaaynonbzyymazypnnybyaz";
        String t = "mpobzzbnzbnpmzzoyynbybzmobbpabpmzboybpbaympbnppam";
        assertEquals("mmobopanabnmmazonynapanmabaaaanmnboyamaaymnbnapaa", equalizestrings.getEq(s, t));
    }

    @Test
    public void case45() {
        String s = "apvphrdiqnudqbtebqzeonovwcudzpczfzqmqtwhismavfexvd";
        String t = "dlsthqydtxtywyxmmqikzsdltyrxxoddaxwjowmjtfhrfhetxo";
        assertEquals("alsphqadqntaqatebqaeondltaraxocaaxqjotmhiahaafetvd", equalizestrings.getEq(s, t));
    }

    @Test
    public void case46() {
        String s = "nnapbbmobmpynppnopbybnonyppobnamoaaynmnmyzbaoymaoo";
        String t = "zpymzoapabzaoobonmaoyyozzapnbbyayomybmmbpnnbymyayy";
        assertEquals("nnamaaaoabpanoannmaoanonyapnbbaaoaaybmmbpnbaommaoo", equalizestrings.getEq(s, t));
    }

    @Test
    public void case47() {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String t = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", equalizestrings.getEq(s, t));
    }

    @Test
    public void case48() {
        String s = "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn";
        String t = "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn";
        assertEquals("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", equalizestrings.getEq(s, t));
    }

    @Test
    public void case49() {
        String s = "b";
        String t = "m";
        assertEquals("b", equalizestrings.getEq(s, t));
    }

    @Test
    public void case50() {
        String s = "b";
        String t = "o";
        assertEquals("a", equalizestrings.getEq(s, t));
    }

    @Test
    public void case51() {
        String s = "abcdefghijklmnopqrstuvwxyznopqrstuvwxyzabcdefghijk";
        String t = "nopqrstuvwxyzabcdefghijklmabcdefghijklmnopqrstuvwx";
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", equalizestrings.getEq(s, t));
    }

    @Test
    public void case52() {
        String s = "abcdefghijklmnopqrstuvwxyzcdefghijklmnopqrstuvwxyz";
        String t = "zyxwwwwwwwwbbbbbcccccccccczyxwwwwwwwwbbbbbcccccccc";
        assertEquals("aaaaaaaaaakbbbaaaaaaaaaaaaaaaaaaaaklmbaaaaaaaaaaaa", equalizestrings.getEq(s, t));
    }

    @Test
    public void case53() {
        String s = "bcde";
        String t = "zxvd";
        assertEquals("aaad", equalizestrings.getEq(s, t));
    }

    @Test
    public void case54() {
        String s = "b";
        String t = "y";
        assertEquals("a", equalizestrings.getEq(s, t));
    }

    @Test
    public void case55() {
        String s = "b";
        String t = "z";
        assertEquals("a", equalizestrings.getEq(s, t));
    }

    @Test
    public void case56() {
        String s = "jaksdfhsdf";
        String t = "jhgfdljksd";
        assertEquals("jagadfhkad", equalizestrings.getEq(s, t));
    }

    @Test
    public void case57() {
        String s = "z";
        String t = "c";
        assertEquals("a", equalizestrings.getEq(s, t));
    }

    @Test
    public void case58() {
        String s = "bbbbb";
        String t = "nopzy";
        assertEquals("baaaa", equalizestrings.getEq(s, t));
    }

    @Test
    public void case59() {
        String s = "c";
        String t = "o";
        assertEquals("c", equalizestrings.getEq(s, t));
    }

    @Test
    public void case60() {
        String s = "z";
        String t = "b";
        assertEquals("a", equalizestrings.getEq(s, t));
    }

    @Test
    public void case61() {
        String s = "ab";
        String t = "ac";
        assertEquals("ab", equalizestrings.getEq(s, t));
    }

    @Test
    public void case62() {
        String s = "b";
        String t = "p";
        assertEquals("a", equalizestrings.getEq(s, t));
    }

    @Test
    public void case63() {
        String s = "bboo";
        String t = "otch";
        assertEquals("aach", equalizestrings.getEq(s, t));
    }

    @Test
    public void case64() {
        String s = "j";
        String t = "z";
        assertEquals("a", equalizestrings.getEq(s, t));
    }

    @Test
    public void case65() {
        String s = "x";
        String t = "b";
        assertEquals("a", equalizestrings.getEq(s, t));
    }

    @Test
    public void case66() {
        String s = "zzz";
        String t = "bbb";
        assertEquals("aaa", equalizestrings.getEq(s, t));
    }

    @Test
    public void case67() {
        String s = "c";
        String t = "n";
        assertEquals("c", equalizestrings.getEq(s, t));
    }

    @Test
    public void case68() {
        String s = "m";
        String t = "z";
        assertEquals("a", equalizestrings.getEq(s, t));
    }

    @Test
    public void case69() {
        String s = "j";
        String t = "u";
        assertEquals("j", equalizestrings.getEq(s, t));
    }

    @Test
    public void case70() {
        String s = "z";
        String t = "z";
        assertEquals("z", equalizestrings.getEq(s, t));
    }

}
