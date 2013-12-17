package topc.test.graph;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.graph.*;

public class GooseTattarrattatDiv1Test {
    GooseTattarrattatDiv1 goosetattarrattatdiv1 = new GooseTattarrattatDiv1();

    @Test
    public void case1() {
        String S = "geese";
        assertEquals(2, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case2() {
        String S = "tattarrattat";
        assertEquals(0, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case3() {
        String S = "palindrome";
        assertEquals(5, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case4() {
        String S = "dogeeseseegod";
        assertEquals(0, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case5() {
        String S = "abcdefghijklmnopqrstuvwxyzyxwvutsrqponmlkjihgfedcb";
        assertEquals(48, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case6() {
        String S = "aaabbbcxyyopqrorrqoxyxcbaaddd";
        assertEquals(13, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case7() {
        String S = "e";
        assertEquals(0, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case8() {
        String S = "ve";
        assertEquals(1, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case9() {
        String S = "nxj";
        assertEquals(1, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case10() {
        String S = "onwg";
        assertEquals(2, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case11() {
        String S = "jdwwl";
        assertEquals(2, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case12() {
        String S = "smsozy";
        assertEquals(3, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case13() {
        String S = "bjgymyq";
        assertEquals(3, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case14() {
        String S = "actznkbr";
        assertEquals(4, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case15() {
        String S = "ccqovzihl";
        assertEquals(4, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case16() {
        String S = "glecqmnffv";
        assertEquals(5, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case17() {
        String S = "kopnxmgtoec";
        assertEquals(5, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case18() {
        String S = "fcbfphevqxzo";
        assertEquals(6, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case19() {
        String S = "ikvzriypjijjl";
        assertEquals(6, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case20() {
        String S = "ufgqmebfdhtjsp";
        assertEquals(7, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case21() {
        String S = "bzhlhizfzdvxlmw";
        assertEquals(7, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case22() {
        String S = "tpqmmgezyfbplfpi";
        assertEquals(8, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case23() {
        String S = "kgjykqrenxmgvwfge";
        assertEquals(8, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case24() {
        String S = "clqnblvnxhbiprzcrd";
        assertEquals(12, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case25() {
        String S = "mgscdkdqviibwzqncon";
        assertEquals(11, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case26() {
        String S = "gwyfavhghvflggjsnzoz";
        assertEquals(12, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case27() {
        String S = "trairhswhnrrbinzulyst";
        assertEquals(10, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case28() {
        String S = "zekgxycoeiarkvytuazofh";
        assertEquals(13, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case29() {
        String S = "iyaijhiunfasnlbdtqepgbs";
        assertEquals(14, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case30() {
        String S = "nabrsskjymoigfycqgwceswf";
        assertEquals(15, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case31() {
        String S = "bethgemtepnknzovzvfyrpesq";
        assertEquals(16, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case32() {
        String S = "mmtuyooeiwrvepyntnhruwumou";
        assertEquals(20, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case33() {
        String S = "mdwfonfrarzwvhcsookkrmylbts";
        assertEquals(19, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case34() {
        String S = "lbwbihuvzeislszjtigzmjvwdwkw";
        assertEquals(16, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case35() {
        String S = "zxgawyhsqelcattbaokunmgknlsta";
        assertEquals(16, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case36() {
        String S = "vnsmrirkhqrkjgqjmiswsdjzqywbpd";
        assertEquals(21, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case37() {
        String S = "oxfqqlfdtwbxmxnmqboqjonxmowvzvx";
        assertEquals(26, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case38() {
        String S = "jibmizhufhpcdwzogczhhzwgptrzljud";
        assertEquals(24, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case39() {
        String S = "gqujiykoeqdypqctuhhwtmobtxkrmgtwe";
        assertEquals(20, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case40() {
        String S = "iiywojzdymowmfmvwkpdcvdrcmbgowrueu";
        assertEquals(29, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case41() {
        String S = "ejhonyduovxvwnisznznmedjzzrqgaqqbiu";
        assertEquals(23, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case42() {
        String S = "kecawgtxfuwmbgelpdjwrewqnxkztbbhyjnp";
        assertEquals(24, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case43() {
        String S = "xebehwtklyprdqsroqxcvmpmnqkeblarooshd";
        assertEquals(26, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case44() {
        String S = "tlhkxiihsildsolrifgtpnyyfbcyhgytsgibdx";
        assertEquals(31, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case45() {
        String S = "gyamaduuvevmzgclbufazgkoiutlzsdsgocxlyk";
        assertEquals(30, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case46() {
        String S = "vfwgbyozohyxupjjsmufcbsbtgrklmtknwjfsrtu";
        assertEquals(35, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case47() {
        String S = "fjmkxxtapezfdzduwxseomnfiuobhljfpquyuvblk";
        assertEquals(30, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case48() {
        String S = "sdwyzxeewvxytrgdhnpygjzgpgfsyorciqjnoromdu";
        assertEquals(28, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case49() {
        String S = "oqcwaiywhovohaqjjatylvndjvxplyuawoyekcmkrjw";
        assertEquals(33, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case50() {
        String S = "xbevabhcyfwtybuaxfqluvnrnprzohfnhsacyzyxftdr";
        assertEquals(38, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case51() {
        String S = "zxgqxaznqojjlwxafkgxzuzlcgrlhxhxrnfxhiigyzvgt";
        assertEquals(38, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case52() {
        String S = "brzvjmxsarukftzpbynsdbzcimvijwvzfbahlpmlzasves";
        assertEquals(38, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case53() {
        String S = "efgteztyxlxdfmufenlhoqvfklnzrcktiqkipfgtrfuirsi";
        assertEquals(39, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case54() {
        String S = "vdnwkrhxzuztlcnsmzpoltjpsztqmqhwfjoohlczsbeaqwmq";
        assertEquals(41, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case55() {
        String S = "ffllmxowxvwvtdjtdaeclrunyodthzxphfptccmgsspzhseoa";
        assertEquals(44, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case56() {
        String S = "esvinzhzrodrhkzfuorlwtxwbxwefuhklyhvzyiqaycfuuqhja";
        assertEquals(44, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case57() {
        String S = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        assertEquals(0, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case58() {
        String S = "ffggfggffgggggggffgffggggffggffgffggggfgffgfgfggf";
        assertEquals(21, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case59() {
        String S = "pfdpzvhamtrmwxlxpxgwuiqcspmqzsedcsummwivduanvmnqjl";
        assertEquals(32, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case60() {
        String S = "ueubyfvnialatabyxptbhvabtpwtvkbatxdottpmtjgcwcjkex";
        assertEquals(27, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case61() {
        String S = "envfbrqbvvcynhhnvvfkkavvgcevakuzevqkudogmebcybkvjv";
        assertEquals(23, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case62() {
        String S = "szivqlcbqvhbvdraqrindmbnrnumzitmzavqvchvylguzeado";
        assertEquals(30, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case63() {
        String S = "qgofmmuosoksikxrnhghqbkjkospcxghgjuciknvpjoryzwigq";
        assertEquals(29, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case64() {
        String S = "auinlrymrchsntpqcppfwrsnwuwpvgrxodrynillrmkpcusua";
        assertEquals(25, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case65() {
        String S = "imdfoyudyhkckrvduillnuoeiyeounlliudbqlmkhyruifzscy";
        assertEquals(18, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case66() {
        String S = "xrepayuyubctwtykrauccnquqfuqvccuaakylwlcjuyhyammag";
        assertEquals(11, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case67() {
        String S = "ozppevgxnmiedpmcvayhiwwlevhwbwgascepdmbmnqrlmpjko";
        assertEquals(16, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case68() {
        String S = "pxcjmksjarnxnmwdkomndkukmmkwkxnmokeumnenqdjskmwfxp";
        assertEquals(13, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case69() {
        String S = "tmjgnvgeyhgkiwmeextjgkafdyakgptxeejzilgoyegvwgpjt";
        assertEquals(9, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case70() {
        String S = "xpegbfbspqpztvbfmkrsrpkbppbkpqwrkmfbjuzpqpsbfbgcps";
        assertEquals(8, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case71() {
        String S = "rgrodfsgcqbeysgcxeetcwunggnuwzneexcgslebuzgsfiorgr";
        assertEquals(6, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case72() {
        String S = "zcvaavomgutkxegjnvidkvvrcrvvjdxvnkgexktugmovaavrb";
        assertEquals(6, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case73() {
        String S = "eclkjqypfgtfindsftmhdlkwumkldhwtfocnqftgfjyqjkldb";
        assertEquals(8, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case74() {
        String S = "hdynujaalhqtecaemwmsslsdccdslssmwmdacdtlhqvajunaeh";
        assertEquals(7, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case75() {
        String S = "sepggadcsdpfsmdpwhbodscfeexcsdabhwpdusxpdsldatgpes";
        assertEquals(6, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case76() {
        String S = "prwpmyprfutdqtnhqbmadwasaasawdambqhntqxtmfrpympwrp";
        assertEquals(2, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case77() {
        String S = "legzuvvdyjsjkzqksnpndsbapabsdnpnsxqzkjsjydvvuzgel";
        assertEquals(1, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case78() {
        String S = "xjkmtjwvrpkutmpcutkzaphsjjohpaaktucpmtrkpuvwjtmkjx";
        assertEquals(4, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case79() {
        String S = "xyyzzzxxx";
        assertEquals(2, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case80() {
        String S = "abaabb";
        assertEquals(3, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case81() {
        String S = "abbbbbbbbbbbbccccc";
        assertEquals(6, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case82() {
        String S = "aaaeeeeeeeeeebb";
        assertEquals(5, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case83() {
        String S = "abccacb";
        assertEquals(4, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case84() {
        String S = "blwejugosajrblrdlwdmxeoreoveoxhotcnqdltgptcnranxfm";
        assertEquals(41, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case85() {
        String S = "aaaaabbbbccccedddddeeeeeeeeeeefffggghhhh";
        assertEquals(28, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case86() {
        String S = "abcdaeeeeeeeeeeeeaaab";
        assertEquals(9, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case87() {
        String S = "aaccccbbb";
        assertEquals(5, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case88() {
        String S = "aabccccb";
        assertEquals(4, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case89() {
        String S = "abbbbcc";
        assertEquals(3, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case90() {
        String S = "gaaaaaaaaabb";
        assertEquals(3, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case91() {
        String S = "abyzyz";
        assertEquals(4, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case92() {
        String S = "aayyyyyz";
        assertEquals(3, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case93() {
        String S = "baccca";
        assertEquals(3, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case94() {
        String S = "abbbcc";
        assertEquals(3, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case95() {
        String S = "caaaaabb";
        assertEquals(3, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case96() {
        String S = "baaaakkk";
        assertEquals(4, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case97() {
        String S = "aacccbccb";
        assertEquals(4, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case98() {
        String S = "tkweazqgmplohyxrutojvbzllqgjaidbtqibygdzcxkujvwghw";
        assertEquals(43, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case99() {
        String S = "abccccccccccb";
        assertEquals(3, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case100() {
        String S = "slkjfdaqefsakjdfh";
        assertEquals(11, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case101() {
        String S = "ccccaaaaacbbab";
        assertEquals(8, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case102() {
        String S = "abcccccb";
        assertEquals(3, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case103() {
        String S = "aaaabbbbbbbccccc";
        assertEquals(9, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case104() {
        String S = "aacccb";
        assertEquals(3, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case105() {
        String S = "aabcccccb";
        assertEquals(4, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case106() {
        String S = "ccccaabdccbcccc";
        assertEquals(4, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case107() {
        String S = "aaacccccbddb";
        assertEquals(7, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case108() {
        String S = "abcabcabc";
        assertEquals(3, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case109() {
        String S = "accccbb";
        assertEquals(3, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case110() {
        String S = "tsvhsvohygungszjrziksodnurcfxngammyaopbvjijqanberc";
        assertEquals(45, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case111() {
        String S = "abcdaeeeeefgfeggfeeeeeeaaab";
        assertEquals(12, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case112() {
        String S = "abcdeghijklmnopqrstuvwxyzazyxwvutsrqponmlkjihfedcb";
        assertEquals(48, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case113() {
        String S = "aaeeeeeb";
        assertEquals(3, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case114() {
        String S = "wlrbbmqbhcdarzowkkyhiddqscdxrjmowf";
        assertEquals(24, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case115() {
        String S = "zaazbbbbbaaa";
        assertEquals(7, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case116() {
        String S = "abcddedcb";
        assertEquals(6, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case117() {
        String S = "aabbcccddddeeeefffffffffgggddddggggg";
        assertEquals(27, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case118() {
        String S = "acccccbb";
        assertEquals(3, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case119() {
        String S = "aabbbcccbbbbc";
        assertEquals(6, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case120() {
        String S = "acccbb";
        assertEquals(3, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case121() {
        String S = "acaaaccccb";
        assertEquals(5, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case122() {
        String S = "acccab";
        assertEquals(3, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case123() {
        String S = "yyaaaaaaaaaaaz";
        assertEquals(3, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case124() {
        String S = "heebdbbacdhfhahaecgeffhch";
        assertEquals(19, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case125() {
        String S = "dbaddbbdcaabbadaaeaeceeeeeedbbdeddebbabbcccecdbcec";
        assertEquals(38, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case126() {
        String S = "abcdefghijklmnopqrstuvwxyxwvutsrqponmlkjihgfedcbay";
        assertEquals(48, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case127() {
        String S = "aaabbbcccdefgcccbbbaaa";
        assertEquals(2, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case128() {
        String S = "caaabcbaac";
        assertEquals(5, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case129() {
        String S = "aaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbb";
        assertEquals(25, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case130() {
        String S = "aaaccbdddbbb";
        assertEquals(8, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case131() {
        String S = "aeaeeeeebb";
        assertEquals(4, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case132() {
        String S = "baaaaacc";
        assertEquals(3, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case133() {
        String S = "zzuhvrkprsipcjbjvvxjvgvvfcgsjnwlpqfestwcapnbdmzz";
        assertEquals(33, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case134() {
        String S = "aaaaacccccccabbb";
        assertEquals(9, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case135() {
        String S = "aaabebcd";
        assertEquals(5, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case136() {
        String S = "abbbbbcc";
        assertEquals(3, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case137() {
        String S = "aadefgbbbc";
        assertEquals(6, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case138() {
        String S = "deegabddgeebgehgcadgdfaheefdfcdccgafbgfehcaaehdccf";
        assertEquals(41, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case139() {
        String S = "ababababbbabababbbababbbbababbba";
        assertEquals(12, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case140() {
        String S = "abbcccccb";
        assertEquals(4, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case141() {
        String S = "asbdshjhjidsdsghavabsdc";
        assertEquals(15, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case142() {
        String S = "gseees";
        assertEquals(3, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case143() {
        String S = "ababbbbbbacc";
        assertEquals(5, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case144() {
        String S = "aabbcb";
        assertEquals(3, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case145() {
        String S = "qwertyuioplkjhgfdsazxcvbnmlkjhgfrtyewqaindhsjausid";
        assertEquals(39, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case146() {
        String S = "abbbcddac";
        assertEquals(6, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case147() {
        String S = "aabccb";
        assertEquals(4, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case148() {
        String S = "accccccccbb";
        assertEquals(3, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case149() {
        String S = "aabbbbc";
        assertEquals(3, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case150() {
        String S = "acddddc";
        assertEquals(3, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case151() {
        String S = "qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvb";
        assertEquals(25, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case152() {
        String S = "accccccab";
        assertEquals(3, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case153() {
        String S = "aaccccb";
        assertEquals(3, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case154() {
        String S = "xxxyyrzzzzzzzzzttttzy";
        assertEquals(11, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case155() {
        String S = "aaccddcb";
        assertEquals(5, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case156() {
        String S = "adfglkregccnquqfuqvccuaakylwlcjuyhyammag";
        assertEquals(29, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case157() {
        String S = "accceeeeeddddbb";
        assertEquals(10, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case158() {
        String S = "dddbabdbbddd";
        assertEquals(5, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case159() {
        String S = "aaaaaacbbbbcdefgh";
        assertEquals(11, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case160() {
        String S = "aabccccccccbcb";
        assertEquals(5, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case161() {
        String S = "lwqsokphdwuuoeamwkswxhjvojnmtifggvzuhodllxhzb";
        assertEquals(40, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case162() {
        String S = "abacccccccbb";
        assertEquals(5, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case163() {
        String S = "nwlrbbmqbhcdarzowkkyhiddqscdxrjmowfrxsjybldbefsarc";
        assertEquals(45, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case164() {
        String S = "aaaaffffffffffffffffffffbbbbbcccccdddddeeeeebcde";
        assertEquals(28, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case165() {
        String S = "adbcbccb";
        assertEquals(5, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case166() {
        String S = "aaaccccbb";
        assertEquals(5, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case167() {
        String S = "aaaeeeeeffffbbbb";
        assertEquals(11, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case168() {
        String S = "aaaaabbbbbabccbbbbbaaaaa";
        assertEquals(13, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case169() {
        String S = "sssscccbbbabba";
        assertEquals(9, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case170() {
        String S = "bbbaaaacc";
        assertEquals(5, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case171() {
        String S = "aaccccccccccccccccccccccccccccccccccccccccbcb";
        assertEquals(4, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case172() {
        String S = "slkjfdaqefsakjdfhsdjfskdfskdjfhsk";
        assertEquals(27, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case173() {
        String S = "abbbcac";
        assertEquals(4, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case174() {
        String S = "acccedbb";
        assertEquals(5, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case175() {
        String S = "accccbbcccbb";
        assertEquals(5, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case176() {
        String S = "cccaabcccc";
        assertEquals(3, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case177() {
        String S = "ccbbbba";
        assertEquals(3, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case178() {
        String S = "abcbac";
        assertEquals(4, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case179() {
        String S = "kkkkkaaaakkkkkk";
        assertEquals(4, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case180() {
        String S = "aabccccxxxxxxxxxxxxxxxxccccbcb";
        assertEquals(5, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case181() {
        String S = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwx";
        assertEquals(25, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case182() {
        String S = "abcdefghijklmnopqrstuvwxyzabcdefghiklmnopqrstuvwz";
        assertEquals(42, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case183() {
        String S = "abbbbbabbbbbb";
        assertEquals(2, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case184() {
        String S = "vmgxepcrtmjsrevoxipeqwzeqzvbcefwdrpybwnfmrdzboucyj";
        assertEquals(44, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case185() {
        String S = "acbccb";
        assertEquals(3, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case186() {
        String S = "abeeeeb";
        assertEquals(3, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case187() {
        String S = "agggggggff";
        assertEquals(3, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case188() {
        String S = "rahjmyuwwkrxnfmqgeebeoapezsdzspmqcxjtgdyxkrpvmwmmp";
        assertEquals(41, goosetattarrattatdiv1.getmin(S));
    }

    @Test
    public void case189() {
        String S = "aabbbbbbc";
        assertEquals(3, goosetattarrattatdiv1.getmin(S));
    }

}
