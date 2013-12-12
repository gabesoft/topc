package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class LargestSubsequenceTest {
    LargestSubsequence largestsubsequence = new LargestSubsequence();

    @Test
    public void case1() {
        String s = "test";
        assertEquals("tt", largestsubsequence.getLargest(s));
    }

    @Test
    public void case2() {
        String s = "a";
        assertEquals("a", largestsubsequence.getLargest(s));
    }

    @Test
    public void case3() {
        String s = "example";
        assertEquals("xple", largestsubsequence.getLargest(s));
    }

    @Test
    public void case4() {
        String s = "aquickbrownfoxjumpsoverthelazydog";
        assertEquals("zyog", largestsubsequence.getLargest(s));
    }

    @Test
    public void case5() {
        String s = "zzyyxxwwvvuuttssrrqqppoonnmmllkkjjiihhggffeeddccaa";
        assertEquals("zzyyxxwwvvuuttssrrqqppoonnmmllkkjjiihhggffeeddccaa", largestsubsequence.getLargest(s));
    }

    @Test
    public void case6() {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", largestsubsequence.getLargest(s));
    }

    @Test
    public void case7() {
        String s = "dtbsthudhqvqxxmqxusna";
        assertEquals("xxxusna", largestsubsequence.getLargest(s));
    }

    @Test
    public void case8() {
        String s = "ddifmyqoojkeyiee";
        assertEquals("yyiee", largestsubsequence.getLargest(s));
    }

    @Test
    public void case9() {
        String s = "mhdsrshovdancelcihqcrsfdfvsrgstsxvzh";
        assertEquals("zh", largestsubsequence.getLargest(s));
    }

    @Test
    public void case10() {
        String s = "vslheaxwhc";
        assertEquals("xwhc", largestsubsequence.getLargest(s));
    }

    @Test
    public void case11() {
        String s = "lumguibrvvnvwnwhzail";
        assertEquals("zl", largestsubsequence.getLargest(s));
    }

    @Test
    public void case12() {
        String s = "hctiodxvzmllfgri";
        assertEquals("zri", largestsubsequence.getLargest(s));
    }

    @Test
    public void case13() {
        String s = "zjxhngujgnhlqpkfwuseqzcrxzjsltdekwoiklfgkywdpj";
        assertEquals("zzzywpj", largestsubsequence.getLargest(s));
    }

    @Test
    public void case14() {
        String s = "sw";
        assertEquals("w", largestsubsequence.getLargest(s));
    }

    @Test
    public void case15() {
        String s = "xpmjapuoeqouquzjnuyxzajdrn";
        assertEquals("zzrn", largestsubsequence.getLargest(s));
    }

    @Test
    public void case16() {
        String s = "rkkpfgidl";
        assertEquals("rpl", largestsubsequence.getLargest(s));
    }

    @Test
    public void case17() {
        String s = "phqhlsucxtebkyemlykfmzlznmopuhgvdambgpiglo";
        assertEquals("zzvpo", largestsubsequence.getLargest(s));
    }

    @Test
    public void case18() {
        String s = "bzslcgclmgzulhxdrhkogsbuofrjrapcdutisprkrvosug";
        assertEquals("zzxvug", largestsubsequence.getLargest(s));
    }

    @Test
    public void case19() {
        String s = "puluqyrejeyurtkeaufs";
        assertEquals("yyuus", largestsubsequence.getLargest(s));
    }

    @Test
    public void case20() {
        String s = "znm";
        assertEquals("znm", largestsubsequence.getLargest(s));
    }

    @Test
    public void case21() {
        String s = "nxaiqgj";
        assertEquals("xqj", largestsubsequence.getLargest(s));
    }

    @Test
    public void case22() {
        String s = "rsng";
        assertEquals("sng", largestsubsequence.getLargest(s));
    }

    @Test
    public void case23() {
        String s = "sxcpfwwyjsjfkrxpycnvcwvcnghwphpxrlfmcccvyppfr";
        assertEquals("yyyr", largestsubsequence.getLargest(s));
    }

    @Test
    public void case24() {
        String s = "ubvbsmbdayynthasljdikieqdjbnmr";
        assertEquals("yytsr", largestsubsequence.getLargest(s));
    }

    @Test
    public void case25() {
        String s = "dvypuukxnjiqwavhfsypfghhqhumbfznmjn";
        assertEquals("znn", largestsubsequence.getLargest(s));
    }

    @Test
    public void case26() {
        String s = "t";
        assertEquals("t", largestsubsequence.getLargest(s));
    }

    @Test
    public void case27() {
        String s = "lohyungouxtdkoqncecbecamiglwxamgkyjoisgymbeynmpftc";
        assertEquals("yyyytc", largestsubsequence.getLargest(s));
    }

    @Test
    public void case28() {
        String s = "mvcjkcbtzdyet";
        assertEquals("zyt", largestsubsequence.getLargest(s));
    }

    @Test
    public void case29() {
        String s = "zjejurusuqdatseyswqghs";
        assertEquals("zyws", largestsubsequence.getLargest(s));
    }

    @Test
    public void case30() {
        String s = "rkjqiepcwkgoobtawithjybepylvvwm";
        assertEquals("yywm", largestsubsequence.getLargest(s));
    }

    @Test
    public void case31() {
        String s = "sggqrxlcadkjjxcomhqgqpzkyetpz";
        assertEquals("zz", largestsubsequence.getLargest(s));
    }

    @Test
    public void case32() {
        String s = "oizojobmoeyncmosopractypj";
        assertEquals("zyypj", largestsubsequence.getLargest(s));
    }

    @Test
    public void case33() {
        String s = "qxydejwry";
        assertEquals("yy", largestsubsequence.getLargest(s));
    }

    @Test
    public void case34() {
        String s = "rnlrwcsgegebmwweybg";
        assertEquals("yg", largestsubsequence.getLargest(s));
    }

    @Test
    public void case35() {
        String s = "xbulkgnapqrb";
        assertEquals("xurb", largestsubsequence.getLargest(s));
    }

    @Test
    public void case36() {
        String s = "fqgq";
        assertEquals("qq", largestsubsequence.getLargest(s));
    }

    @Test
    public void case37() {
        String s = "euthsnsugfxtmfkwtlldwenybjfafvecasosvnxbs";
        assertEquals("yxs", largestsubsequence.getLargest(s));
    }

    @Test
    public void case38() {
        String s = "oxedpvevehtmfsletplcpnndvlxduxxwieibnthkhfnkpvhj";
        assertEquals("xxxxwvj", largestsubsequence.getLargest(s));
    }

    @Test
    public void case39() {
        String s = "akvccoziowkmrzpdwsvybiszfccgowzlosn";
        assertEquals("zzzzsn", largestsubsequence.getLargest(s));
    }

    @Test
    public void case40() {
        String s = "ixnaxxjgbmisqsjxjxgc";
        assertEquals("xxxxxgc", largestsubsequence.getLargest(s));
    }

    @Test
    public void case41() {
        String s = "i";
        assertEquals("i", largestsubsequence.getLargest(s));
    }

    @Test
    public void case42() {
        String s = "djouowzmqzafubqqenotqmwzfgcmtpveanvmb";
        assertEquals("zzzvvmb", largestsubsequence.getLargest(s));
    }

    @Test
    public void case43() {
        String s = "qparcaihdnyk";
        assertEquals("yk", largestsubsequence.getLargest(s));
    }

    @Test
    public void case44() {
        String s = "frraeazgnzdmhtbtaymysglanvdqlbmqicqw";
        assertEquals("zzyyw", largestsubsequence.getLargest(s));
    }

    @Test
    public void case45() {
        String s = "jeottiolzlxcy";
        assertEquals("zy", largestsubsequence.getLargest(s));
    }

    @Test
    public void case46() {
        String s = "gubnawecsnsekp";
        assertEquals("wssp", largestsubsequence.getLargest(s));
    }

    @Test
    public void case47() {
        String s = "uiktpzkdxynlifewoqmmbilpddlpecxndkebucbghbjqan";
        assertEquals("zyxuqn", largestsubsequence.getLargest(s));
    }

    @Test
    public void case48() {
        String s = "cjpxagblsqilexcqzjngqhnc";
        assertEquals("zqnc", largestsubsequence.getLargest(s));
    }

    @Test
    public void case49() {
        String s = "jvgloimmvsdhfgdafmzhxbzwfhkntrjpaocnidhfzeooqp";
        assertEquals("zzzqp", largestsubsequence.getLargest(s));
    }

    @Test
    public void case50() {
        String s = "mdvmgsxmxnvxgjtsheoxvmgoryhnkswbznzvfrdrqjm";
        assertEquals("zzvrrqm", largestsubsequence.getLargest(s));
    }

    @Test
    public void case51() {
        String s = "aanhrzdsbbhdoezohvuhzoeaekxpwhnj";
        assertEquals("zzzxwnj", largestsubsequence.getLargest(s));
    }

    @Test
    public void case52() {
        String s = "hhf";
        assertEquals("hhf", largestsubsequence.getLargest(s));
    }

    @Test
    public void case53() {
        String s = "onltutgmnnpxiwue";
        assertEquals("xwue", largestsubsequence.getLargest(s));
    }

    @Test
    public void case54() {
        String s = "ygng";
        assertEquals("yng", largestsubsequence.getLargest(s));
    }

    @Test
    public void case55() {
        String s = "sgrmksiyzesherusczthyotrbtzvegbzkulsprvikhohlyg";
        assertEquals("zzzzyg", largestsubsequence.getLargest(s));
    }

    @Test
    public void case56() {
        String s = "rgzoaitknjjioypjiaevejqldjgtw";
        assertEquals("zyw", largestsubsequence.getLargest(s));
    }

    @Test
    public void case57() {
        String s = "iynwupnztulzbyk";
        assertEquals("zzyk", largestsubsequence.getLargest(s));
    }

    @Test
    public void case58() {
        String s = "mrtnnhfvaqtctfuipndaye";
        assertEquals("ye", largestsubsequence.getLargest(s));
    }

    @Test
    public void case59() {
        String s = "zegbcvvxxfqxo";
        assertEquals("zxxxo", largestsubsequence.getLargest(s));
    }

    @Test
    public void case60() {
        String s = "kwpxplhnattmiuhdq";
        assertEquals("xuq", largestsubsequence.getLargest(s));
    }

    @Test
    public void case61() {
        String s = "zkhpjjfztbnxs";
        assertEquals("zzxs", largestsubsequence.getLargest(s));
    }

    @Test
    public void case62() {
        String s = "wdxxiqzyhhxsp";
        assertEquals("zyxsp", largestsubsequence.getLargest(s));
    }

    @Test
    public void case63() {
        String s = "egdnuvamuhkucdfvssxavdjuymvzgfymr";
        assertEquals("zyr", largestsubsequence.getLargest(s));
    }

    @Test
    public void case64() {
        String s = "kwjuffpavnbkypmtfuxvabwj";
        assertEquals("yxwj", largestsubsequence.getLargest(s));
    }

    @Test
    public void case65() {
        String s = "jbxoquxgeettykaciacheofaqceidc";
        assertEquals("yqidc", largestsubsequence.getLargest(s));
    }

    @Test
    public void case66() {
        String s = "pnmqqmkogrhghpqwcpzdspbtvlvpotgdikgm";
        assertEquals("zvvtm", largestsubsequence.getLargest(s));
    }

    @Test
    public void case67() {
        String s = "vwqmytncvpxazwrjwroacwono";
        assertEquals("zwwwoo", largestsubsequence.getLargest(s));
    }

    @Test
    public void case68() {
        String s = "oehulzriqbdtawyytjskhlemqmdshspq";
        assertEquals("zyytsssq", largestsubsequence.getLargest(s));
    }

    @Test
    public void case69() {
        String s = "mlwlasmlxqriipmqglsvswhnxyirhaofgyhkiwpo";
        assertEquals("yywpo", largestsubsequence.getLargest(s));
    }

    @Test
    public void case70() {
        String s = "eszpgnfapcsbftxagmmdcqi";
        assertEquals("zxqi", largestsubsequence.getLargest(s));
    }

    @Test
    public void case71() {
        String s = "rbjopthedsdewdudlupyicpmdtpmqrf";
        assertEquals("ytrf", largestsubsequence.getLargest(s));
    }

    @Test
    public void case72() {
        String s = "renwjvqjfdzywfxpajvemksbdb";
        assertEquals("zyxvsdb", largestsubsequence.getLargest(s));
    }

    @Test
    public void case73() {
        String s = "hnrthrdkyalotlymzcumobmvzvstciqmnbxdlgftjgpfbm";
        assertEquals("zzxtpm", largestsubsequence.getLargest(s));
    }

    @Test
    public void case74() {
        String s = "uzkbkzmdozxqmvvmbbioyljyemntpldykxwjgnllqrdugrahe";
        assertEquals("zzzyyyxwurhe", largestsubsequence.getLargest(s));
    }

    @Test
    public void case75() {
        String s = "tfhsnjkvbndnnqjkwfd";
        assertEquals("wfd", largestsubsequence.getLargest(s));
    }

    @Test
    public void case76() {
        String s = "iy";
        assertEquals("y", largestsubsequence.getLargest(s));
    }

    @Test
    public void case77() {
        String s = "zyeqfuqghbnhhrboymupudbomtlql";
        assertEquals("zyyuutql", largestsubsequence.getLargest(s));
    }

    @Test
    public void case78() {
        String s = "yougpkmhhdmkorkkincpcnhxunainwqhbmmxkhwfarlahdmoak";
        assertEquals("yxxwrok", largestsubsequence.getLargest(s));
    }

    @Test
    public void case79() {
        String s = "ljmlijlnlfaaynvqyhtxck";
        assertEquals("yyxk", largestsubsequence.getLargest(s));
    }

    @Test
    public void case80() {
        String s = "ezhidvylyuyqluoxozyv";
        assertEquals("zzyv", largestsubsequence.getLargest(s));
    }

    @Test
    public void case81() {
        String s = "kjqhcdshyfeqiwrencjowhqksyqeyeutemfgmyxs";
        assertEquals("yyyyxs", largestsubsequence.getLargest(s));
    }

    @Test
    public void case82() {
        String s = "ydikqgggygevjdeyxpnzvmdvfkxralhnuvywensvwe";
        assertEquals("zywwe", largestsubsequence.getLargest(s));
    }

    @Test
    public void case83() {
        String s = "rdpwejzcdxxcimwm";
        assertEquals("zxxwm", largestsubsequence.getLargest(s));
    }

    @Test
    public void case84() {
        String s = "jtlgzwjtyaewnvgezxcyntlj";
        assertEquals("zzytlj", largestsubsequence.getLargest(s));
    }

    @Test
    public void case85() {
        String s = "hjypqtcafblpnlxeaavswvaijkflyrekr";
        assertEquals("yyrr", largestsubsequence.getLargest(s));
    }

    @Test
    public void case86() {
        String s = "drmtfhglfcmsobeqibtjcskngttvmzzpgkvxwctv";
        assertEquals("zzxwv", largestsubsequence.getLargest(s));
    }

    @Test
    public void case87() {
        String s = "wvttsspponkjjihfebaa";
        assertEquals("wvttsspponkjjihfebaa", largestsubsequence.getLargest(s));
    }

    @Test
    public void case88() {
        String s = "xwssrplkihgfc";
        assertEquals("xwssrplkihgfc", largestsubsequence.getLargest(s));
    }

    @Test
    public void case89() {
        String s = "zzzyyyxwwvtronnlllljiiigeddccbbaa";
        assertEquals("zzzyyyxwwvtronnlllljiiigeddccbbaa", largestsubsequence.getLargest(s));
    }

    @Test
    public void case90() {
        String s = "l";
        assertEquals("l", largestsubsequence.getLargest(s));
    }

    @Test
    public void case91() {
        String s = "zxrrmfda";
        assertEquals("zxrrmfda", largestsubsequence.getLargest(s));
    }

    @Test
    public void case92() {
        String s = "xwwvvutttssqqpppoonnnmllkkkkjjjihhffccccbbbba";
        assertEquals("xwwvvutttssqqpppoonnnmllkkkkjjjihhffccccbbbba", largestsubsequence.getLargest(s));
    }

    @Test
    public void case93() {
        String s = "zyxuuuttttssqpoommmlkkjihgeeddccaaa";
        assertEquals("zyxuuuttttssqpoommmlkkjihgeeddccaaa", largestsubsequence.getLargest(s));
    }

    @Test
    public void case94() {
        String s = "yxwsssrllkc";
        assertEquals("yxwsssrllkc", largestsubsequence.getLargest(s));
    }

    @Test
    public void case95() {
        String s = "yvqqoollkca";
        assertEquals("yvqqoollkca", largestsubsequence.getLargest(s));
    }

    @Test
    public void case96() {
        String s = "zyutttsqqppponnnnnmlllkkkjihhhggeeeddccbbb";
        assertEquals("zyutttsqqppponnnnnmlllkkkjihhhggeeeddccbbb", largestsubsequence.getLargest(s));
    }

    @Test
    public void case97() {
        String s = "zxxvsrponmmljiiihgba";
        assertEquals("zxxvsrponmmljiiihgba", largestsubsequence.getLargest(s));
    }

    @Test
    public void case98() {
        String s = "xwvssqoljjjiiigfccbaa";
        assertEquals("xwvssqoljjjiiigfccbaa", largestsubsequence.getLargest(s));
    }

    @Test
    public void case99() {
        String s = "zzywwutsssrrronmllljjiihhgggggfeeea";
        assertEquals("zzywwutsssrrronmllljjiihhgggggfeeea", largestsubsequence.getLargest(s));
    }

    @Test
    public void case100() {
        String s = "wvsqonkifecb";
        assertEquals("wvsqonkifecb", largestsubsequence.getLargest(s));
    }

    @Test
    public void case101() {
        String s = "zzyyyxxwvvutssrrrqqppponmllkjjiihgffdcbbbaa";
        assertEquals("zzyyyxxwvvutssrrrqqppponmllkjjiihgffdcbbbaa", largestsubsequence.getLargest(s));
    }

    @Test
    public void case102() {
        String s = "zzywuuusssrrrqponmlkkkiigfedccb";
        assertEquals("zzywuuusssrrrqponmlkkkiigfedccb", largestsubsequence.getLargest(s));
    }

    @Test
    public void case103() {
        String s = "yyyyyyxxwwwvutttssrqqppppoonnmkjihgggddddaa";
        assertEquals("yyyyyyxxwwwvutttssrqqppppoonnmkjihgggddddaa", largestsubsequence.getLargest(s));
    }

    @Test
    public void case104() {
        String s = "zxooc";
        assertEquals("zxooc", largestsubsequence.getLargest(s));
    }

    @Test
    public void case105() {
        String s = "utqp";
        assertEquals("utqp", largestsubsequence.getLargest(s));
    }

    @Test
    public void case106() {
        String s = "yxuttssrrnmjida";
        assertEquals("yxuttssrrnmjida", largestsubsequence.getLargest(s));
    }

    @Test
    public void case107() {
        String s = "ffffeeeeeddddccccccccccbbbbbbbbaaa";
        assertEquals("ffffeeeeeddddccccccccccbbbbbbbbaaa", largestsubsequence.getLargest(s));
    }

    @Test
    public void case108() {
        String s = "ffeeedcccca";
        assertEquals("ffeeedcccca", largestsubsequence.getLargest(s));
    }

    @Test
    public void case109() {
        String s = "fdda";
        assertEquals("fdda", largestsubsequence.getLargest(s));
    }

    @Test
    public void case110() {
        String s = "ffffeeeeeeddddcccccccbbbbbbbaaaaaaaaa";
        assertEquals("ffffeeeeeeddddcccccccbbbbbbbaaaaaaaaa", largestsubsequence.getLargest(s));
    }

    @Test
    public void case111() {
        String s = "fffeeeeeddddddddcccccccbbbbbbbbbaaaa";
        assertEquals("fffeeeeeddddddddcccccccbbbbbbbbbaaaa", largestsubsequence.getLargest(s));
    }

    @Test
    public void case112() {
        String s = "ffffeeeeeedddccccccbbbaaaa";
        assertEquals("ffffeeeeeedddccccccbbbaaaa", largestsubsequence.getLargest(s));
    }

    @Test
    public void case113() {
        String s = "ffffffeeeeedddddddcccccccbbbbbbbbaaaaaaaa";
        assertEquals("ffffffeeeeedddddddcccccccbbbbbbbbaaaaaaaa", largestsubsequence.getLargest(s));
    }

    @Test
    public void case114() {
        String s = "ddba";
        assertEquals("ddba", largestsubsequence.getLargest(s));
    }

    @Test
    public void case115() {
        String s = "fffbbaaa";
        assertEquals("fffbbaaa", largestsubsequence.getLargest(s));
    }

    @Test
    public void case116() {
        String s = "fedddccccbbbaa";
        assertEquals("fedddccccbbbaa", largestsubsequence.getLargest(s));
    }

    @Test
    public void case117() {
        String s = "ffffeeeeeddbaaa";
        assertEquals("ffffeeeeeddbaaa", largestsubsequence.getLargest(s));
    }

    @Test
    public void case118() {
        String s = "fffffeeeeeeeeeeedddddcccccccccccbbbbbbbbbbbaaaaa";
        assertEquals("fffffeeeeeeeeeeedddddcccccccccccbbbbbbbbbbbaaaaa", largestsubsequence.getLargest(s));
    }

    @Test
    public void case119() {
        String s = "ffebbb";
        assertEquals("ffebbb", largestsubsequence.getLargest(s));
    }

    @Test
    public void case120() {
        String s = "ffeedddcbbbbaa";
        assertEquals("ffeedddcbbbbaa", largestsubsequence.getLargest(s));
    }

    @Test
    public void case121() {
        String s = "fffeeeeddccccbbbbbbbbaaaaaa";
        assertEquals("fffeeeeddccccbbbbbbbbaaaaaa", largestsubsequence.getLargest(s));
    }

    @Test
    public void case122() {
        String s = "bbbb";
        assertEquals("bbbb", largestsubsequence.getLargest(s));
    }

    @Test
    public void case123() {
        String s = "fffedaaaa";
        assertEquals("fffedaaaa", largestsubsequence.getLargest(s));
    }

    @Test
    public void case124() {
        String s = "bbaaaabaabbaabbbaaabbaaabaaabababaaababaaaabbbbba";
        assertEquals("bbbbbbbbbbbbbbbbbbbbba", largestsubsequence.getLargest(s));
    }

    @Test
    public void case125() {
        String s = "bbabbabbabaababaababaaaaaabaabab";
        assertEquals("bbbbbbbbbbbbbb", largestsubsequence.getLargest(s));
    }

    @Test
    public void case126() {
        String s = "abbbbabbbbbbabbbbabbababbabbabbba";
        assertEquals("bbbbbbbbbbbbbbbbbbbbbbbba", largestsubsequence.getLargest(s));
    }

    @Test
    public void case127() {
        String s = "bbbbbaabbaaabaabbababaabbababaabba";
        assertEquals("bbbbbbbbbbbbbbbbbba", largestsubsequence.getLargest(s));
    }

    @Test
    public void case128() {
        String s = "bbbabababbaa";
        assertEquals("bbbbbbbaa", largestsubsequence.getLargest(s));
    }

    @Test
    public void case129() {
        String s = "abbbbabbabbbabaaaaabaabaabaaababbbbabbb";
        assertEquals("bbbbbbbbbbbbbbbbbbbbb", largestsubsequence.getLargest(s));
    }

    @Test
    public void case130() {
        String s = "babbaaaa";
        assertEquals("bbbaaaa", largestsubsequence.getLargest(s));
    }

    @Test
    public void case131() {
        String s = "abbaabbaaaaabbbbbabbaaaaa";
        assertEquals("bbbbbbbbbbbaaaaa", largestsubsequence.getLargest(s));
    }

    @Test
    public void case132() {
        String s = "baaababbaaabbbabbaaaaababaaabaaaaa";
        assertEquals("bbbbbbbbbbbbaaaaa", largestsubsequence.getLargest(s));
    }

    @Test
    public void case133() {
        String s = "baabbaba";
        assertEquals("bbbba", largestsubsequence.getLargest(s));
    }

    @Test
    public void case134() {
        String s = "aedcbacdeacdedbebbc";
        assertEquals("eeeec", largestsubsequence.getLargest(s));
    }

    @Test
    public void case135() {
        String s = "caefdadbeedbebdcbcdca";
        assertEquals("feeeddca", largestsubsequence.getLargest(s));
    }

    @Test
    public void case136() {
        String s = "fbbabcccbbbbfcabf";
        assertEquals("fff", largestsubsequence.getLargest(s));
    }

    @Test
    public void case137() {
        String s = "ceaeedacaffddcfcdaebacdeeeb";
        assertEquals("fffeeeeb", largestsubsequence.getLargest(s));
    }

    @Test
    public void case138() {
        String s = "dcbecaded";
        assertEquals("eed", largestsubsequence.getLargest(s));
    }

    @Test
    public void case139() {
        String s = "ccddabecdfcbdefeedbbdaacda";
        assertEquals("ffeeddda", largestsubsequence.getLargest(s));
    }

    @Test
    public void case140() {
        String s = "dcffbbbbcfefedbbbfcdafddebfcdfdeeccfe";
        assertEquals("fffffffffe", largestsubsequence.getLargest(s));
    }

    @Test
    public void case141() {
        String s = "ffebcdbfccedbfaeaedaaaeefebdcdfa";
        assertEquals("ffffffa", largestsubsequence.getLargest(s));
    }

    @Test
    public void case142() {
        String s = "addcfafeaeefcbefcbbcedfbcfcdffcaaeeafdadcfca";
        assertEquals("ffffffffffca", largestsubsequence.getLargest(s));
    }

    @Test
    public void case143() {
        String s = "fcb";
        assertEquals("fcb", largestsubsequence.getLargest(s));
    }

    @Test
    public void case144() {
        String s = "fgfdsdgaasfdghfgffggffgfgf";
        assertEquals("sshgggggf", largestsubsequence.getLargest(s));
    }

    @Test
    public void case145() {
        String s = "asxcsa";
        assertEquals("xsa", largestsubsequence.getLargest(s));
    }

    @Test
    public void case146() {
        String s = "fhjtgui";
        assertEquals("ui", largestsubsequence.getLargest(s));
    }

    @Test
    public void case147() {
        String s = "naa";
        assertEquals("naa", largestsubsequence.getLargest(s));
    }

    @Test
    public void case148() {
        String s = "ttt";
        assertEquals("ttt", largestsubsequence.getLargest(s));
    }

    @Test
    public void case149() {
        String s = "maxbm";
        assertEquals("xm", largestsubsequence.getLargest(s));
    }

    @Test
    public void case150() {
        String s = "baaaf";
        assertEquals("f", largestsubsequence.getLargest(s));
    }

    @Test
    public void case151() {
        String s = "zba";
        assertEquals("zba", largestsubsequence.getLargest(s));
    }

    @Test
    public void case152() {
        String s = "zzzzzzzzzzddddddddddccccccccccbbbbbbbbbbaaaaaaaaaa";
        assertEquals("zzzzzzzzzzddddddddddccccccccccbbbbbbbbbbaaaaaaaaaa", largestsubsequence.getLargest(s));
    }

    @Test
    public void case153() {
        String s = "hhhhhhh";
        assertEquals("hhhhhhh", largestsubsequence.getLargest(s));
    }

    @Test
    public void case154() {
        String s = "tatttatttt";
        assertEquals("tttttttt", largestsubsequence.getLargest(s));
    }

    @Test
    public void case155() {
        String s = "aaaaaaaaa";
        assertEquals("aaaaaaaaa", largestsubsequence.getLargest(s));
    }

    @Test
    public void case156() {
        String s = "abcdefghgiabcdefghgiabcdefghgiabcdefghgiabcdefghgi";
        assertEquals("iiiii", largestsubsequence.getLargest(s));
    }

    @Test
    public void case157() {
        String s = "zzzzz";
        assertEquals("zzzzz", largestsubsequence.getLargest(s));
    }

    @Test
    public void case158() {
        String s = "aa";
        assertEquals("aa", largestsubsequence.getLargest(s));
    }

    @Test
    public void case159() {
        String s = "bza";
        assertEquals("za", largestsubsequence.getLargest(s));
    }

}
