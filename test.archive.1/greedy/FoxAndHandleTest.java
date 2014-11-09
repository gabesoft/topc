package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class FoxAndHandleTest {
    FoxAndHandle foxandhandle = new FoxAndHandle();

    @Test
    public void case1() {
        String S = "foxfox";
        assertEquals("fox", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case2() {
        String S = "ccieliel";
        assertEquals("ceil", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case3() {
        String S = "abaabbab";
        assertEquals("aabb", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case4() {
        String S = "bbbbaaaa";
        assertEquals("bbaa", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case5() {
        String S = "fedcbafedcba";
        assertEquals("afedcb", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case6() {
        String S = "nodevillivedon";
        assertEquals("deilvon", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case7() {
        String S = "bkbkaajaajkkmfmfliffajaelhihlihajaeohggholihoggo";
        assertEquals("baaaajkkfmfehhlihjgglioo", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case8() {
        String S = "kcbbdikcbbdi";
        assertEquals("bbdikc", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case9() {
        String S = "aaaaaaaaaaaaaaaaaa";
        assertEquals("aaaaaaaaa", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case10() {
        String S = "hhhh";
        assertEquals("hh", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case11() {
        String S = "adadaddebecbaedeebbadadaddebecbaedeebb";
        assertEquals("aaaabbddddebecbedee", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case12() {
        String S = "liahkaliahka";
        assertEquals("aalihk", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case13() {
        String S = "ghdhahcfegahcgafhfhabghdhahcfegahcgafhfhab";
        assertEquals("aaaabghdhhcfeghcgfhfh", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case14() {
        String S = "lbdlbd";
        assertEquals("bdl", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case15() {
        String S = "nssnlatrvxqgdcatobphpnssnlatrvxqgdcatobphp";
        assertEquals("aabhnssnltrvxqgdctopp", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case16() {
        String S = "nstnst";
        assertEquals("nst", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case17() {
        String S = "kkjolfghvkkjolfghv";
        assertEquals("fghkkjolv", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case18() {
        String S = "jbofhjljgjbofhjljg";
        assertEquals("bfgjohjlj", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case19() {
        String S = "nfilggcacgnfilggcacg";
        assertEquals("acgnfilgcg", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case20() {
        String S = "abhnaccicabhnaccic";
        assertEquals("aabhnccic", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case21() {
        String S = "efbaebadacafecabcefaefbaebadacafecabcefa";
        assertEquals("aaaaaaefbebdcfecbcef", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case22() {
        String S = "idfbieidfbie";
        assertEquals("beidfi", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case23() {
        String S = "cbjfidccahfhjeabcbjfidccahfhjeab";
        assertEquals("aabcbjfidcchfhje", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case24() {
        String S = "umnlhebpumbronkquumnlhebpumbronkqu";
        assertEquals("bbkqumnlhepumronu", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case25() {
        String S = "uliwgjuuliwgju";
        assertEquals("gjuliwu", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case26() {
        String S = "bncmhohshdabncmhohshda";
        assertEquals("abncmhohshd", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case27() {
        String S = "cbbbabbaaacabcccaacabcbbbabbaaacabcccaacab";
        assertEquals("aaaaaaaabcbbbbbcbcccc", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case28() {
        String S = "pngilmanqiodjmjqlapngilmanqiodjmjqla";
        assertEquals("aapngilmnqiodjmjql", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case29() {
        String S = "aaabbbaaaaaabbaaabbbaaaaaabb";
        assertEquals("aaaaaaaaabbbbb", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case30() {
        String S = "feekcffkfeekcffk";
        assertEquals("cfeekffk", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case31() {
        String S = "bfebaabfebaa";
        assertEquals("aabfeb", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case32() {
        String S = "hoiphoip";
        assertEquals("hiop", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case33() {
        String S = "dfcqqdfhjenirnllhbmdfcqqdfhjenirnllhbm";
        assertEquals("bdfcqqdfhjenirnllhm", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case34() {
        String S = "aa";
        assertEquals("a", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case35() {
        String S = "caefdedcdecaefdedcde";
        assertEquals("accefdedde", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case36() {
        String S = "kmmllclfimjaidgkmmllclfimjaidg";
        assertEquals("adgkmmllclfimji", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case37() {
        String S = "aaaaaabaababbabaaaaaabaababbab";
        assertEquals("aaaaaaaaaabbbbb", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case38() {
        String S = "kbsouijvfaabvkbsouijvfaabv";
        assertEquals("aabkbsouijvfv", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case39() {
        String S = "smweaamsmweaam";
        assertEquals("aamsmwe", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case40() {
        String S = "chch";
        assertEquals("ch", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case41() {
        String S = "ff";
        assertEquals("f", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case42() {
        String S = "bbababbaba";
        assertEquals("aabbb", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case43() {
        String S = "cbdifojmjbndocbdifojmjbndo";
        assertEquals("bbcdifojmjndo", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case44() {
        String S = "fkcbejiafcfjcjimmjjghmdeafkcbejiafcfjcjimmjjghmdea";
        assertEquals("aafkcbejifcfjcjimmjjghmde", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case45() {
        String S = "hgdifclibebibgjglkjnhkbhgdifclibebibgjglkjnhkb";
        assertEquals("bbbbhgdifclieigjglkjnhk", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case46() {
        String S = "aaaaaaaaaaaaaaaa";
        assertEquals("aaaaaaaa", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case47() {
        String S = "bhigdikmkgdipbkibjbhigdikmkgdipbkibj";
        assertEquals("bbbhigdikmkgdipkij", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case48() {
        String S = "acabacab";
        assertEquals("aabc", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case49() {
        String S = "ee";
        assertEquals("e", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case50() {
        String S = "bgbg";
        assertEquals("bg", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case51() {
        String S = "hnpbafrebbhnpbafrebb";
        assertEquals("abbhnpbfre", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case52() {
        String S = "thcgupthcgup";
        assertEquals("cgpthu", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case53() {
        String S = "accbabadeeaccbabadee";
        assertEquals("aaaccbbdee", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case54() {
        String S = "fokgpenjjlrefajhepfokgpenjjlrefajhep";
        assertEquals("aefokgpenjjlrefjhp", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case55() {
        String S = "ljombhhosdhcpmnolibgdkiljombhhosdhcpmnolibgdki";
        assertEquals("bbdiljomhhosdhcpmnolgki", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case56() {
        String S = "jlpomfbglenmdqcjlpomfbglenmdqc";
        assertEquals("bcjlpomfglenmdq", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case57() {
        String S = "hshs";
        assertEquals("hs", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case58() {
        String S = "cohvhooorsffjrmmontivbjcohvhooorsffjrmmontivbj";
        assertEquals("bcohvhooorsffjrmmontivj", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case59() {
        String S = "icejddraacdpliiefpegrospicejddraacdpliiefpegrosp";
        assertEquals("aacdeegicejddrpliifprosp", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case60() {
        String S = "oo";
        assertEquals("o", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case61() {
        String S = "koseomlnmohajlbnbphghkoseomlnmohajlbnbphgh";
        assertEquals("abbghkoseomlnmohjlnph", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case62() {
        String S = "dsds";
        assertEquals("ds", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case63() {
        String S = "kefcfgicdjbbahikefcfgicdjbbahi";
        assertEquals("ahikefcfgcdjbbi", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case64() {
        String S = "ghgh";
        assertEquals("gh", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case65() {
        String S = "khhejxlkxmpjmsfitdgkeqkhhejxlkxmpjmsfitdgkeq";
        assertEquals("dekhhejxlkxmpjmsfitgkq", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case66() {
        String S = "jobgncfidoaanmomnhcbhakjobgncfidoaanmomnhcbhak";
        assertEquals("aaajobgncfidonmomnhcbhk", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case67() {
        String S = "gvhfhkuivvufuhpbgvhfhkuivvufuhpb";
        assertEquals("bgvhfhkuivvufuhp", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case68() {
        String S = "nidbednljlkcnmdmljlfbhbnidbednljlkcnmdmljlfbhb";
        assertEquals("bbbnidednljlkcnmdmljlfh", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case69() {
        String S = "fbeiibfbeiib";
        assertEquals("bbfeii", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case70() {
        String S = "qtptpsdtgcekqtptpsdtgcek";
        assertEquals("cekqtptpsdtg", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case71() {
        String S = "qrnjnqorrgkakenlcrlllqrnjnqorrgkakenlcrlll";
        assertEquals("aclllqrnjnqorrgkkenlr", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case72() {
        String S = "nrdbqiinjaqomibodlilsbnrdbqiinjaqomibodlilsb";
        assertEquals("abbnrdbqiinjqomiodlils", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case73() {
        String S = "qieppnjcskjplupeamgqpqtqieppnjcskjplupeamgqpqt";
        assertEquals("agpqiepnjcskjplupemqpqt", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case74() {
        String S = "ffjaibhcglhkiffjaibhcglhki";
        assertEquals("abcffjihglhki", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case75() {
        String S = "hqchbpqghmvpgcepdnvblhqchbpqghmvpgcepdnvbl";
        assertEquals("bbhqchpqghmvpgcepdnvl", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case76() {
        String S = "ccfcccdcfdeddcaebfbccfcccdcfdeddcaebfb";
        assertEquals("abbccfcccdcfdeddcef", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case77() {
        String S = "opoepcibabfpbjdickiopoepcibabfpbjdicki";
        assertEquals("abbciopoepbfpjdicki", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case78() {
        String S = "wqgrftamjcgtammulqabmrwipwqgrftamjcgtammulqabmrwip";
        assertEquals("aaabipwqgrftmjcgtmmulqmrw", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case79() {
        String S = "mftoncoadnibksdfmftoncoadnibksdf";
        assertEquals("abdfmftoncodniks", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case80() {
        String S = "greqceanereokwhvptuaiqgreqceanereokwhvptuaiq";
        assertEquals("aagreqcenereokwhvptuiq", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case81() {
        String S = "dd";
        assertEquals("d", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case82() {
        String S = "kihmilalfmkihmilalfm";
        assertEquals("afkihmillm", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case83() {
        String S = "eobkhpceobkhpc";
        assertEquals("bceokhp", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case84() {
        String S = "unlgmoxnomsinlunlgmoxnomsinl";
        assertEquals("gilunlmoxnomsn", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case85() {
        String S = "kdqqrjdejoqlinkdqqrjdejoqlin";
        assertEquals("ddeikqqrjjoqln", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case86() {
        String S = "fgacafhffcaceebfgedafafgacafhffcaceebfgedafa";
        assertEquals("aaaaafgcfhffcceebfgedf", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case87() {
        String S = "efdeefde";
        assertEquals("deef", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case88() {
        String S = "ebacaeebacae";
        assertEquals("aaebce", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case89() {
        String S = "aohjpioefipaohjpioefip";
        assertEquals("aefiohjpiop", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case90() {
        String S = "ccbabbaaccbabbaa";
        assertEquals("aaaccbbb", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case91() {
        String S = "alcfickgoajhfcihalcfickgoajhfcih";
        assertEquals("aachlcfickgojfih", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case92() {
        String S = "bealcdbhbjefcfcbealcdbhbjefcfc";
        assertEquals("abbbelcdhjefcfc", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case93() {
        String S = "phddddanqnhqqrkamihkaphddddanqnhqqrkamihka";
        assertEquals("aaaphddddnqnhqqrkmihk", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case94() {
        String S = "hmlhicfnihlonninecfoohmlhicfnihlonninecfoo";
        assertEquals("ccfhmlhifnihlonnineoo", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case95() {
        String S = "jcjlnkkcamahcacjcjlnkkcamahcac";
        assertEquals("aaacjcjlnkkcmhc", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case96() {
        String S = "bcbecfdicbfgchccfaefecbcbecfdicbfgchccfaefec";
        assertEquals("abcbecfdicbfgchccfefec", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case97() {
        String S = "cjaffaknjkcjaffaknjk";
        assertEquals("aacjffknjk", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case98() {
        String S = "jgbbbiaaeafacggcbcjgbbbiaaeafacggcbc";
        assertEquals("aaaabcjgbbbiefcggc", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case99() {
        String S = "ccbdccebheihcbefcdbhhbgccbdccebheihcbefcdbhhbg";
        assertEquals("bbbbbccdcceheihcefcdhhg", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case100() {
        String S = "nbnknbnk";
        assertEquals("bknn", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case101() {
        String S = "afbacdbeafbacdbe";
        assertEquals("aabefbcd", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case102() {
        String S = "ldmeqhgnrrfocfhfoldmeqhgnrrfocfhfo";
        assertEquals("cffldmeqhgnrrfoho", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case103() {
        String S = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaa", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case104() {
        String S = "hfcchijgdajffcdcchfcchijgdajffcdcc";
        assertEquals("accchfcchijgdjffd", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case105() {
        String S = "fqatwhboemrpxauxmxlfqatwhboemrpxauxmxl";
        assertEquals("aafqtwhboemrpxuxmxl", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case106() {
        String S = "dgdeafheiiebdfhkdhdgdeafheiiebdfhkdh";
        assertEquals("abdddgdefheiiefhkh", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case107() {
        String S = "dqbqfrchfombkgdqbqfrchfombkg";
        assertEquals("bbdqqfrchfomkg", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case108() {
        String S = "bbbaab";
        assertEquals("bab", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case109() {
        String S = "foxfoxfoxfoxfoxfox";
        assertEquals("fffooxoxx", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case110() {
        String S = "zzyyxxaabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvv";
        assertEquals("zyxabcdefghijklmnopqrstuv", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case111() {
        String S = "fkhtbqsnuegusptebdgbhbfolnqpbdltrohkbmbsrnlbhsltmn";
        assertEquals("begubbbflnqpdltohkmsrhstn", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case112() {
        String S = "baba";
        assertEquals("ab", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case113() {
        String S = "mqxmhlvqczcaqzlyezvkqnkkcxenukqjjqeazcvueswvhwsqqy";
        assertEquals("malezkcxenkqjqzcvusvhwqqy", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case114() {
        String S = "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy";
        assertEquals("abcdefghijklmnopqrstuvwxy", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case115() {
        String S = "ccaacc";
        assertEquals("acc", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case116() {
        String S = "adefghadefghciklomciklomprtyuprtyulooppoolyurttruy";
        assertEquals("adefghcikllmooppoyurttruy", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case117() {
        String S = "zyxzyxzyxzyxzyxzyxzyxzyxzyxzyxzyxzyxzyxzyxzyxzyxaa";
        assertEquals("xxxxxxxxzyzyzyzyzyzyzyzya", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case118() {
        String S = "zzyyxxwwvvuuttssrrqqppoonnmmllkkjjiihhggffeeddccbb";
        assertEquals("zyxwvutsrqponmlkjihgfedcb", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case119() {
        String S = "zyxwvutsrqponmlkjihgfedcbzyxwvutsrqponmlkjihgfedcb";
        assertEquals("bzyxwvutsrqponmlkjihgfedc", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case120() {
        String S = "abba";
        assertEquals("ab", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case121() {
        String S = "abbbacaabc";
        assertEquals("ababc", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case122() {
        String S = "azzzzaaa";
        assertEquals("azza", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case123() {
        String S = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaa", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case124() {
        String S = "yxwvutsrqponmlkjihgfedcbayxwvutsrqponmlkjihgfedcba";
        assertEquals("ayxwvutsrqponmlkjihgfedcb", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case125() {
        String S = "ppaappbbllaallbbllvv";
        assertEquals("aappbblllv", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case126() {
        String S = "jjhsrrthqbteqytyrwrsxmnoeegtrgaxbmkwepkazpinlizolr";
        assertEquals("jhbeqtyrrsegtaxmkwpinlzor", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case127() {
        String S = "zzbccbaa";
        assertEquals("zbca", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case128() {
        String S = "aaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeee";
        assertEquals("aaaaabbbbbcccccdddddeeeee", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case129() {
        String S = "bbbbbbbbbbbbbbbbbbbbbbaaaaaaaaaaaaaaaaaaaaaa";
        assertEquals("bbbbbbbbbbbaaaaaaaaaaa", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case130() {
        String S = "bccbaa";
        assertEquals("bca", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case131() {
        String S = "zlnyznttyl";
        assertEquals("lnyzt", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case132() {
        String S = "bccaab";
        assertEquals("bca", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case133() {
        String S = "hnyhbxibuamwukxaymuncubdakwbatptihydkhkpjbzcpbpjyz";
        assertEquals("akxamuncubdkwbptihyhbpjyz", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case134() {
        String S = "hebhajejba";
        assertEquals("bhaej", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case135() {
        String S = "jihtsiigtisajsgojthuqtorrfnmntnrfnnnqagtmusourgjou";
        assertEquals("higiajsgjqtfmntnrntsourou", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case136() {
        String S = "bbbbbbaabb";
        assertEquals("bbabb", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case137() {
        String S = "nacnbacb";
        assertEquals("acnb", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case138() {
        String S = "aayyxxwwvvuuttssrrqqppoonnmmllkkjjiihhggffeeddccbb";
        assertEquals("ayxwvutsrqponmlkjihgfedcb", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case139() {
        String S = "afgzgfgaffgyyggafayafgayayafffzfgzyyzzyzgzyyzzagza";
        assertEquals("aaffgaaafgffgyyyzgzyyzzgz", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case140() {
        String S = "babccbaaba";
        assertEquals("abcab", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case141() {
        String S = "baab";
        assertEquals("ab", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case142() {
        String S = "nazmysmosnmfjlnxjcgoraopzpnnxjpbmflnagpfbyajocfryy";
        assertEquals("ammosaopznnxjbflngpfjcryy", foxandhandle.lexSmallestName(S));
    }

    @Test
    public void case143() {
        String S = "abzjubzuwebdehbwzwqkhfbjptkfkbwbfdbjbkzfpzfjzbtfqa";
        assertEquals("abbubdebwhbfkwfjkzfpzjztq", foxandhandle.lexSmallestName(S));
    }

}
