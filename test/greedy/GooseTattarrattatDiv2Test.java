package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class GooseTattarrattatDiv2Test {
    GooseTattarrattatDiv2 goosetattarrattatdiv2 = new GooseTattarrattatDiv2();

    @Test
    public void case1() {
        String S = "geese";
        assertEquals(2, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case2() {
        String S = "tattarrattat";
        assertEquals(6, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case3() {
        String S = "www";
        assertEquals(0, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case4() {
        String S = "topcoder";
        assertEquals(6, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case5() {
        String S = "abcdefghijklmnopqrstuvwxyz";
        assertEquals(25, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case6() {
        String S = "e";
        assertEquals(0, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case7() {
        String S = "ve";
        assertEquals(1, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case8() {
        String S = "nxj";
        assertEquals(2, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case9() {
        String S = "onwg";
        assertEquals(3, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case10() {
        String S = "jdwwl";
        assertEquals(3, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case11() {
        String S = "smsozy";
        assertEquals(4, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case12() {
        String S = "bjgymyq";
        assertEquals(5, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case13() {
        String S = "actznkbr";
        assertEquals(7, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case14() {
        String S = "ccqovzihl";
        assertEquals(7, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case15() {
        String S = "glecqmnffv";
        assertEquals(8, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case16() {
        String S = "kopnxmgtoec";
        assertEquals(9, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case17() {
        String S = "fcbfphevqxzo";
        assertEquals(10, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case18() {
        String S = "ikvzriypjijjl";
        assertEquals(10, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case19() {
        String S = "ufgqmebfdhtjsp";
        assertEquals(12, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case20() {
        String S = "bzhlhizfzdvxlmw";
        assertEquals(12, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case21() {
        String S = "tpqmmgezyfbplfpi";
        assertEquals(13, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case22() {
        String S = "kgjykqrenxmgvwfge";
        assertEquals(14, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case23() {
        String S = "clqnblvnxhbiprzcrd";
        assertEquals(16, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case24() {
        String S = "mgscdkdqviibwzqncon";
        assertEquals(17, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case25() {
        String S = "gwyfavhghvflggjsnzoz";
        assertEquals(16, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case26() {
        String S = "trairhswhnrrbinzulyst";
        assertEquals(17, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case27() {
        String S = "zekgxycoeiarkvytuazofh";
        assertEquals(20, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case28() {
        String S = "iyaijhiunfasnlbdtqepgbs";
        assertEquals(20, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case29() {
        String S = "nabrsskjymoigfycqgwceswf";
        assertEquals(21, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case30() {
        String S = "bethgemtepnknzovzvfyrpesq";
        assertEquals(21, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case31() {
        String S = "mmtuyooeiwrvepyntnhruwumou";
        assertEquals(22, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case32() {
        String S = "mdwfonfrarzwvhcsookkrmylbts";
        assertEquals(24, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case33() {
        String S = "lbwbihuvzeislszjtigzmjvwdwkw";
        assertEquals(24, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case34() {
        String S = "zxgawyhsqelcattbaokunmgknlsta";
        assertEquals(25, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case35() {
        String S = "vnsmrirkhqrkjgqjmiswsdjzqywbpd";
        assertEquals(27, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case36() {
        String S = "oxfqqlfdtwbxmxnmqboqjonxmowvzvx";
        assertEquals(26, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case37() {
        String S = "jibmizhufhpcdwzogczhhzwgptrzljud";
        assertEquals(27, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case38() {
        String S = "gqujiykoeqdypqctuhhwtmobtxkrmgtwe";
        assertEquals(29, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case39() {
        String S = "iiywojzdymowmfmvwkpdcvdrcmbgowrueu";
        assertEquals(30, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case40() {
        String S = "ejhonyduovxvwnisznznmedjzzrqgaqqbiu";
        assertEquals(31, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case41() {
        String S = "kecawgtxfuwmbgelpdjwrewqnxkztbbhyjnp";
        assertEquals(32, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case42() {
        String S = "xebehwtklyprdqsroqxcvmpmnqkeblarooshd";
        assertEquals(34, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case43() {
        String S = "tlhkxiihsildsolrifgtpnyyfbcyhgytsgibdx";
        assertEquals(33, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case44() {
        String S = "gyamaduuvevmzgclbufazgkoiutlzsdsgocxlyk";
        assertEquals(35, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case45() {
        String S = "vfwgbyozohyxupjjsmufcbsbtgrklmtknwjfsrtu";
        assertEquals(37, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case46() {
        String S = "fjmkxxtapezfdzduwxseomnfiuobhljfpquyuvblk";
        assertEquals(37, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case47() {
        String S = "sdwyzxeewvxytrgdhnpygjzgpgfsyorciqjnoromdu";
        assertEquals(38, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case48() {
        String S = "oqcwaiywhovohaqjjatylvndjvxplyuawoyekcmkrjw";
        assertEquals(39, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case49() {
        String S = "xbevabhcyfwtybuaxfqluvnrnprzohfnhsacyzyxftdr";
        assertEquals(40, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case50() {
        String S = "zxgqxaznqojjlwxafkgxzuzlcgrlhxhxrnfxhiigyzvgt";
        assertEquals(38, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case51() {
        String S = "brzvjmxsarukftzpbynsdbzcimvijwvzfbahlpmlzasves";
        assertEquals(41, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case52() {
        String S = "efgteztyxlxdfmufenlhoqvfklnzrcktiqkipfgtrfuirsi";
        assertEquals(41, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case53() {
        String S = "vdnwkrhxzuztlcnsmzpoltjpsztqmqhwfjoohlczsbeaqwmq";
        assertEquals(43, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case54() {
        String S = "ffllmxowxvwvtdjtdaeclrunyodthzxphfptccmgsspzhseoa";
        assertEquals(45, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case55() {
        String S = "esvinzhzrodrhkzfuorlwtxwbxwefuhklyhvzyiqaycfuuqhja";
        assertEquals(45, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case56() {
        String S = "pfdpzvhamtrmwxlxpxgwuiqcspmqzsedcsummwivduanvmnqjl";
        assertEquals(44, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case57() {
        String S = "ueubyfvnialatabyxptbhvabtpwtvkbatxdottpmtjgcwcjkex";
        assertEquals(42, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case58() {
        String S = "envfbrqbvvcynhhnvvfkkavvgcevakuzevqkudogmebcybkvjv";
        assertEquals(39, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case59() {
        String S = "szivqlcbqvhbvdraqrindmbnrnumzitmzavqvchvylguzeado";
        assertEquals(43, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case60() {
        String S = "qgofmmuosoksikxrnhghqbkjkospcxghgjuciknvpjoryzwigq";
        assertEquals(45, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case61() {
        String S = "auinlrymrchsntpqcppfwrsnwuwpvgrxodrynillrmkpcusua";
        assertEquals(43, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case62() {
        String S = "imdfoyudyhkckrvduillnuoeiyeounlliudbqlmkhyruifzscy";
        assertEquals(44, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case63() {
        String S = "xrepayuyubctwtykrauccnquqfuqvccuaakylwlcjuyhyammag";
        assertEquals(43, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case64() {
        String S = "ozppevgxnmiedpmcvayhiwwlevhwbwgascepdmbmnqrlmpjko";
        assertEquals(44, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case65() {
        String S = "pxcjmksjarnxnmwdkomndkukmmkwkxnmokeumnenqdjskmwfxp";
        assertEquals(42, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case66() {
        String S = "tmjgnvgeyhgkiwmeextjgkafdyakgptxeejzilgoyegvwgpjt";
        assertEquals(41, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case67() {
        String S = "xpegbfbspqpztvbfmkrsrpkbppbkpqwrkmfbjuzpqpsbfbgcps";
        assertEquals(40, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case68() {
        String S = "rgrodfsgcqbeysgcxeetcwunggnuwzneexcgslebuzgsfiorgr";
        assertEquals(42, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case69() {
        String S = "zcvaavomgutkxegjnvidkvvrcrvvjdxvnkgexktugmovaavrb";
        assertEquals(39, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case70() {
        String S = "eclkjqypfgtfindsftmhdlkwumkldhwtfocnqftgfjyqjkldb";
        assertEquals(43, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case71() {
        String S = "hdynujaalhqtecaemwmsslsdccdslssmwmdacdtlhqvajunaeh";
        assertEquals(44, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case72() {
        String S = "sepggadcsdpfsmdpwhbodscfeexcsdabhwpdusxpdsldatgpes";
        assertEquals(42, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case73() {
        String S = "prwpmyprfutdqtnhqbmadwasaasawdambqhntqxtmfrpympwrp";
        assertEquals(44, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case74() {
        String S = "legzuvvdyjsjkzqksnpndsbapabsdnpnsxqzkjsjydvvuzgel";
        assertEquals(43, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case75() {
        String S = "xjkmtjwvrpkutmpcutkzaphsjjohpaaktucpmtrkpuvwjtmkjx";
        assertEquals(44, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case76() {
        String S = "ab";
        assertEquals(1, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case77() {
        String S = "aaza";
        assertEquals(1, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case78() {
        String S = "zzzzzaa";
        assertEquals(2, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case79() {
        String S = "a";
        assertEquals(0, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case80() {
        String S = "xyz";
        assertEquals(2, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case81() {
        String S = "yz";
        assertEquals(1, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case82() {
        String S = "zzaaaa";
        assertEquals(2, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case83() {
        String S = "aaabbb";
        assertEquals(3, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case84() {
        String S = "aaabbbccc";
        assertEquals(6, goosetattarrattatdiv2.getmin(S));
    }

    @Test
    public void case85() {
        String S = "abzzzz";
        assertEquals(2, goosetattarrattatdiv2.getmin(S));
    }

}
