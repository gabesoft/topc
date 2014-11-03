package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class SuffixArrayDiv2Test {
    SuffixArrayDiv2 suffixarraydiv2 = new SuffixArrayDiv2();

    @Test
    public void case1() {
        String s = "bbbb";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case2() {
        String s = "aaaa";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case3() {
        String s = "examplesareveryweakthinktwicebeforesubmit";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case4() {
        String s = "b";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case5() {
        String s = "abca";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case6() {
        String s = "atgctubcwlroomkowbvlbleofqujtykqa";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case7() {
        String s = "beefgdgaadficdgchfehcfaaifbafb";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case8() {
        String s = "fgqllpllcahbdjoqkmhoagdhmokjibfdcmhclkfpqkhc";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case9() {
        String s = "bbbaaaccacacccbbabccaacbbcbbbaccbacabacacbccbbccab";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case10() {
        String s = "cababacacbcaccbccccabcbccacccccbbbab";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case11() {
        String s = "ekdcipkgojljqcnnjkmrejnbellnircpejanmhpac";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case12() {
        String s = "bccebcklandbdkjeeakdhgligmngfaiiamnacbbdi";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case13() {
        String s = "bcdcddeafdaeecafcaddccefccbaabccbce";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case14() {
        String s = "acbnihbfgoolgjedggk";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case15() {
        String s = "caacbaa";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case16() {
        String s = "bbccebdebebbcaacdeed";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case17() {
        String s = "thdddapjpnrcuddxuylsqipnfwdeppmepzea";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case18() {
        String s = "bbbccacaaccbbccaababcacccbcaacaaccbbabccacacbab";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case19() {
        String s = "aaaaaaaaaaaaaaaaaaaaaa";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case20() {
        String s = "mmfkbfkhijlljbkcbmbleheckmelbiicjdllmf";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case21() {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case22() {
        String s = "gvaribicppg";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case23() {
        String s = "ccbbccbdabdacaabaccbcccbbadbdba";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case24() {
        String s = "daddcecdbbcbeadcaebaaeccedbddcdadbdacdebdbdd";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case25() {
        String s = "lkjdpp";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case26() {
        String s = "onglrrrmimqoejgmjcdnjrspcaafijmkjsmkngd";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case27() {
        String s = "bonpnidbmeqctoekgatrsqhmltislfgbfcdh";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case28() {
        String s = "dtui";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case29() {
        String s = "wwrchtepph";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case30() {
        String s = "abbaabbaaabababaabbbbbabbbbbababbabbabaabababbaabb";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case31() {
        String s = "igiijmgjhbmfh";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case32() {
        String s = "cmffckalghmgcjkjfimiglaekbab";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case33() {
        String s = "qfhbjqsdnnoehpaeamlhsocjqjrrlapuelaknejtmmaks";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case34() {
        String s = "fbljlkdnnaeaptkjlzmv";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case35() {
        String s = "ebfbdgiiciebbicabgfdeac";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case36() {
        String s = "ccdbaebeaacbbaccdcaeaecbcdddcdacecabb";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case37() {
        String s = "xaplcmeeiunobkwnehhdgnsowmlfnn";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case38() {
        String s = "jhbjkkjdkjbijfe";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case39() {
        String s = "dcggegfgebafddfbcdagafca";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case40() {
        String s = "pbhjedr";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case41() {
        String s = "mfbnlfhfcigncmbjedabed";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case42() {
        String s = "qlensmrwsnlkpvtdectownnutg";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case43() {
        String s = "bd";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case44() {
        String s = "skirjrbobmiscnjqetetdfmn";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case45() {
        String s = "agfcbkajdaebfmbdhcfkbhbmbj";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case46() {
        String s = "pppfgmgguequrtecfbnqkjopbha";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case47() {
        String s = "bcbdeaedceedabaebedbdcacedced";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case48() {
        String s = "mlkilehfaljaibmabhabkjal";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case49() {
        String s = "bbnelcjqcigsdajojgerfegafcvjffcrblpfbtmbodn";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case50() {
        String s = "ighbbfifbgabhebcfhijdajcdihbfjfgaigjed";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case51() {
        String s = "inmforrpdambgb";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case52() {
        String s = "defcnlkcaabecdjabegfcalgaldccencekgmkmmcmmhg";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case53() {
        String s = "cdddfefdaebgbgacadbebfdeebfaecgacacdfedaffebeebc";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case54() {
        String s = "onpmnjldjbkdbljpqpficfo";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case55() {
        String s = "odeikjbigipjnj";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case56() {
        String s = "aleclmbcngkiihfinbmgbgdidjmelofja";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case57() {
        String s = "beefgdgaadficdgchfehcfaaifbafb";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case58() {
        String s = "efnjjmjjcagbdhlnikglafdgklihhbedckgcjiemnigc";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case59() {
        String s = "bbbaaaccacacccbbabccaacbbcbbbaccbacabacacbccbbccab";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case60() {
        String s = "cababacacbcaccbccccabcbccacccccbbbab";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case61() {
        String s = "dfdcdkfdjegelciiefhldeibdggidlckdeaihdkac";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case62() {
        String s = "bccebcjkaldbdjieeajdgfkhfklffahhaklacbbdh";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case63() {
        String s = "bcdcddeafdaeecafcaddccefccbaabccbce";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case64() {
        String s = "abageeacdgggdfcbddg";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case65() {
        String s = "baabbaa";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case66() {
        String s = "bbccebdebebbcaacdeed";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case67() {
        String s = "idbbbafdfehajbbkjldhgdfeckbcffecfmca";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case68() {
        String s = "bbbccacaaccbbccaababcacccbcaacaaccbbabccacacbab";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case69() {
        String s = "aaaaaaaaaaaaaaaaaaaaaa";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case70() {
        String s = "jjdhadhefgiigahbajaicecbhjciaffbgbiijd";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case71() {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case72() {
        String s = "cfaedbdbddc";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case73() {
        String s = "ccbbccbdabdacaabaccbcccbbadbdba";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case74() {
        String s = "daddcecdbbcbeadcaebaaeccedbddcdadbdacdebdbdd";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case75() {
        String s = "bbbacc";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case76() {
        String s = "lkfinnnjgjmldhfjhbckhnombaaeghjihojikfc";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case77() {
        String s = "bmlnlhdbkdocqmdifaqopogkjqhpjefbecdg";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case78() {
        String s = "abcb";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case79() {
        String s = "dddabdaccb";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case80() {
        String s = "abbaabbaaabababaabbbbbabbbbbababbabbabaabababbaabb";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case81() {
        String s = "cbccdebdcaebc";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case82() {
        String s = "bjddbhaieejebghgdfjfeiachbab";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case83() {
        String s = "nefbgnpckkldfmadajifplcgngooiamrdiahkdgqjjahp";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case84() {
        String s = "cbecedbggacaghdceifi";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case85() {
        String s = "ebfbdfggcgebbgcabffdeac";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case86() {
        String s = "ccdbaebeaacbbaccdcaeaecbcdddcdacecabb";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case87() {
        String s = "majfbgddekhibelhdeecdhjilgfdhh";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case88() {
        String s = "dcadeedaedacdbb";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case89() {
        String s = "dcggegfgebafddfbcdagafca";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case90() {
        String s = "dabcbae";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case91() {
        String s = "gdahfdedbedhbgafccaacc";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case92() {
        String s = "hecfiehlifedgkjbcajflffjjd";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case93() {
        String s = "ab";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case94() {
        String s = "jfdieiahafdjbgehckckcdfg";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case95() {
        String s = "afecbiahdaebejbdgceibgbjbh";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case96() {
        String s = "iiiddgddlcjlklcbdagjfehiaea";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case97() {
        String s = "bcbdeaedceedabaebedbdcacedced";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case98() {
        String s = "ihgfhcedahgafbiabeabggah";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case99() {
        String s = "bblejciochgqdaimigepfegafcriffcpbjnfbqkbmdl";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case100() {
        String s = "ighbbfifbgabhebcfhijdajcdihbfjfgaigjed";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case101() {
        String s = "deecefffcaebdb";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case102() {
        String s = "defcljicaabecdiabegfcajgajdccelceigkikkckkhg";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case103() {
        String s = "cdddfefdaebgbgacadbebfdeebfaecgacacdfedaffebeebc";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case104() {
        String s = "ihjghfgcfagcagfjkjdebdi";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case105() {
        String s = "gbbcedacbcgdfd";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case106() {
        String s = "aba";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case107() {
        String s = "aaab";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case108() {
        String s = "abaa";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case109() {
        String s = "aaba";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case110() {
        String s = "aab";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case111() {
        String s = "bb";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case112() {
        String s = "acbca";
        assertEquals("Does not exist", suffixarraydiv2.smallerOne(s));
    }

    @Test
    public void case113() {
        String s = "aaac";
        assertEquals("Exists", suffixarraydiv2.smallerOne(s));
    }

}
