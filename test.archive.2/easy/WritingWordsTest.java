package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class WritingWordsTest {
    WritingWords writingwords = new WritingWords();

    @Test
    public void case1() {
        String word = "A";
        assertEquals(1, writingwords.write(word));
    }

    @Test
    public void case2() {
        String word = "ABC";
        assertEquals(6, writingwords.write(word));
    }

    @Test
    public void case3() {
        String word = "TOPCODER";
        assertEquals(96, writingwords.write(word));
    }

    @Test
    public void case4() {
        String word = "SINGLEROUNDMATCH";
        assertEquals(183, writingwords.write(word));
    }

    @Test
    public void case5() {
        String word = "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ";
        assertEquals(1300, writingwords.write(word));
    }

    @Test
    public void case6() {
        String word = "VAMOSGIMNASIA";
        assertEquals(143, writingwords.write(word));
    }

    @Test
    public void case7() {
        String word = "WLRBBMQBHCDARZOWKKYHIDDQSCDXRJMOWF";
        assertEquals(411, writingwords.write(word));
    }

    @Test
    public void case8() {
        String word = "XSJYBLDBEFSARCBYNE";
        assertEquals(196, writingwords.write(word));
    }

    @Test
    public void case9() {
        String word = "DYGGXXP";
        assertEquals(107, writingwords.write(word));
    }

    @Test
    public void case10() {
        String word = "LORELLNMPAPQFWKHOPKMCOQHNWNKUEWHSQM";
        assertEquals(465, writingwords.write(word));
    }

    @Test
    public void case11() {
        String word = "BBUQCLJJIVSWMDKQTBXIXMVTRRBLJPTNSNFWZQFJMAFAD";
        assertEquals(585, writingwords.write(word));
    }

    @Test
    public void case12() {
        String word = "RWSO";
        assertEquals(75, writingwords.write(word));
    }

    @Test
    public void case13() {
        String word = "SBCNUVQHFFBSAQXW";
        assertEquals(204, writingwords.write(word));
    }

    @Test
    public void case14() {
        String word = "QCACEHCHZVFRKMLNOZJKPQPXRJXKITZYXACBHHKICQCO";
        assertEquals(552, writingwords.write(word));
    }

    @Test
    public void case15() {
        String word = "NDTOMFGDWDWFCGPXIQVKUYTDLCGDEWHTACIOHOR";
        assertEquals(469, writingwords.write(word));
    }

    @Test
    public void case16() {
        String word = "TQ";
        assertEquals(37, writingwords.write(word));
    }

    @Test
    public void case17() {
        String word = "VWCSGSPQOQMSBOAGUWNNYQXNZLGDG";
        assertEquals(423, writingwords.write(word));
    }

    @Test
    public void case18() {
        String word = "PBTRWBLNSAD";
        assertEquals(131, writingwords.write(word));
    }

    @Test
    public void case19() {
        String word = "UGUUMOQCDRUBETOKYXHOACHWDVM";
        assertEquals(360, writingwords.write(word));
    }

    @Test
    public void case20() {
        String word = "XRDRYXLMNDQTUKWAGMLEJU";
        assertEquals(317, writingwords.write(word));
    }

    @Test
    public void case21() {
        String word = "KWCIBXUBUMENMEYATDRMYDIAJXLOGHIQFMZ";
        assertEquals(433, writingwords.write(word));
    }

    @Test
    public void case22() {
        String word = "LVIHJO";
        assertEquals(76, writingwords.write(word));
    }

    @Test
    public void case23() {
        String word = "VSUYOYPAYULYEIMUOTEHZRIICFS";
        assertEquals(413, writingwords.write(word));
    }

    @Test
    public void case24() {
        String word = "PGGKBBIPZZRZUCXAMLU";
        assertEquals(261, writingwords.write(word));
    }

    @Test
    public void case25() {
        String word = "FYKGRUOW";
        assertEquals(126, writingwords.write(word));
    }

    @Test
    public void case26() {
        String word = "GIOOOBPPLEQLWPHAPJNADQHDCNVW";
        assertEquals(325, writingwords.write(word));
    }

    @Test
    public void case27() {
        String word = "TXJBMYPPPHAUXNSPUSGDHIIXQMBFJXJCVUDJ";
        assertEquals(488, writingwords.write(word));
    }

    @Test
    public void case28() {
        String word = "UYIBYEBMWSIQYOYGYXYMZEVYPZVJEGEBEOC";
        assertEquals(523, writingwords.write(word));
    }

    @Test
    public void case29() {
        String word = "UFTSXDIXTIGSIEEHKCHZDFLILRJQFN";
        assertEquals(365, writingwords.write(word));
    }

    @Test
    public void case30() {
        String word = "ZTQRSVBSPKYHSENBPPKQTPDDBUOTBBQCWIVRFXJU";
        assertEquals(562, writingwords.write(word));
    }

    @Test
    public void case31() {
        String word = "JDDNTGEIQVDGAIJVWCYAUBWEWPJVYGEHLJXEPBPIWU";
        assertEquals(522, writingwords.write(word));
    }

    @Test
    public void case32() {
        String word = "ZDZUBDUBZVAFSPQPQWU";
        assertEquals(290, writingwords.write(word));
    }

    @Test
    public void case33() {
        String word = "IFWOVYDDWYVVBURCZM";
        assertEquals(283, writingwords.write(word));
    }

    @Test
    public void case34() {
        String word = "YJGFDXVTNUNNESLSPLWUIUPFXLZBKNHKW";
        assertEquals(491, writingwords.write(word));
    }

    @Test
    public void case35() {
        String word = "PANL";
        assertEquals(43, writingwords.write(word));
    }

    @Test
    public void case36() {
        String word = "CFIRJCDDSOZOYVEGURFWCSFMOXEQMRJOWRGHWLKOBMEAHKGCCN";
        assertEquals(601, writingwords.write(word));
    }

    @Test
    public void case37() {
        String word = "ZZZZZAAAAA";
        assertEquals(135, writingwords.write(word));
    }

    @Test
    public void case38() {
        String word = "KKKK";
        assertEquals(44, writingwords.write(word));
    }

    @Test
    public void case39() {
        String word = "WWW";
        assertEquals(69, writingwords.write(word));
    }

}
