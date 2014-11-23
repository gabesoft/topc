package topc.test.stringm;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.stringm.*;

public class AkariDaisukiDiv2Test {
    AkariDaisukiDiv2 akaridaisukidiv2 = new AkariDaisukiDiv2();

    @Test
    public void case1() {
        String S = "topcoderdivtwo";
        assertEquals(2, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case2() {
        String S = "foxciel";
        assertEquals(0, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case3() {
        String S = "magicalgirl";
        assertEquals(4, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case4() {
        String S = "waaiusushioakariusushiodaisuki";
        assertEquals(75, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case5() {
        String S = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        assertEquals(8924, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case6() {
        String S = "u";
        assertEquals(0, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case7() {
        String S = "yw";
        assertEquals(0, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case8() {
        String S = "nzr";
        assertEquals(0, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case9() {
        String S = "fsxv";
        assertEquals(0, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case10() {
        String S = "uwqhu";
        assertEquals(0, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case11() {
        String S = "tltmcx";
        assertEquals(0, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case12() {
        String S = "bzldnxo";
        assertEquals(0, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case13() {
        String S = "ooqrmpet";
        assertEquals(0, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case14() {
        String S = "fwbxebdgm";
        assertEquals(1, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case15() {
        String S = "fwdgsydlvu";
        assertEquals(1, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case16() {
        String S = "evltriolgyh";
        assertEquals(1, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case17() {
        String S = "nlpioqqhkspm";
        assertEquals(1, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case18() {
        String S = "bazxynexxvoye";
        assertEquals(3, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case19() {
        String S = "fatetestarossa";
        assertEquals(7, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case20() {
        String S = "iofykguzyfsnaq";
        assertEquals(2, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case21() {
        String S = "takamachinanoha";
        assertEquals(8, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case22() {
        String S = "mvolskdbxkdvmlw";
        assertEquals(5, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case23() {
        String S = "otxsuyptitvmqykg";
        assertEquals(4, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case24() {
        String S = "okegqzziwigjotjlf";
        assertEquals(3, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case25() {
        String S = "kmcximgxuhnmcazmqu";
        assertEquals(9, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case26() {
        String S = "wjkxocolguqujfseyrw";
        assertEquals(3, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case27() {
        String S = "nuweayqeastbwympybmz";
        assertEquals(9, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case28() {
        String S = "ltklaenkrmuzepywydcaa";
        assertEquals(4, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case29() {
        String S = "rtvfzawkbvvukzwjmqtooj";
        assertEquals(6, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case30() {
        String S = "hkkceevwvjbrrvdtwyfgfot";
        assertEquals(5, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case31() {
        String S = "jrqtatlpnaehwkqaikvkvkpw";
        assertEquals(13, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case32() {
        String S = "enhobodlrlfdyehdamacxdkcm";
        assertEquals(11, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case33() {
        String S = "pglnifelvsfbrwwnuzhjcrazsi";
        assertEquals(6, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case34() {
        String S = "vsskojjilcdqphbzvxmxxhzllex";
        assertEquals(6, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case35() {
        String S = "qjawyoflptghsirrmjhtncwvcfxl";
        assertEquals(6, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case36() {
        String S = "nkmjeqnevggizvtzasprvihvqllud";
        assertEquals(10, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case37() {
        String S = "fktakyzsuivcezclqxfmoatnnecirn";
        assertEquals(9, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case38() {
        String S = "ytojfjfcxbhskzdfxjbsxemzkdmidjw";
        assertEquals(20, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case39() {
        String S = "cvagfhomxrqoddwljrryytkksinjsbue";
        assertEquals(5, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case40() {
        String S = "ywplemqhiduojnplmzwdhxdkibzauctux";
        assertEquals(14, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case41() {
        String S = "oxcufgnwdnhbwgmucoxyxcuuysmeulgkzw";
        assertEquals(25, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case42() {
        String S = "dihsujudptutpgkgvxiuoqbnycscvlgahti";
        assertEquals(18, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case43() {
        String S = "llbxmezsvwjnckrhsbridhmvqbjmelllslca";
        assertEquals(24, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case44() {
        String S = "sukhdkpikgzqagrgzunponemsyfhcqmokkprs";
        assertEquals(25, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case45() {
        String S = "rbmqvoawnlnetdcnbjftansxsrbjxubbzltlwa";
        assertEquals(27, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case46() {
        String S = "tclkeqaphnisqucgbblwmlaesssfmuatgljaewr";
        assertEquals(26, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case47() {
        String S = "spqmvnkwovpoimjqzffsdcuyxtpugemkfuonxvuk";
        assertEquals(24, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case48() {
        String S = "vdzjkcyadthoszgyhieekrufkbjwvphtxbnfwfeig";
        assertEquals(19, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case49() {
        String S = "ojsbqrgofcrymwnfsekzdayhpjwavzkumryxvzzjpn";
        assertEquals(24, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case50() {
        String S = "zdkqhybiduhzuoccfogzhbuwzlmrhkmoxmqmupfeajb";
        assertEquals(29, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case51() {
        String S = "omcqgqwnshmnsopdsjcmcyaigaqbwifvkpemzaplprco";
        assertEquals(33, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case52() {
        String S = "wjwpqfpcqpdhqyiyflnfnogbwhmqciayudvylbmiykcfh";
        assertEquals(39, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case53() {
        String S = "qsvnakcrszbxjbygktllpxvilolnwadcarsifzwqnkzuwr";
        assertEquals(30, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case54() {
        String S = "zzkvumocbpfxsynhfbxhmlnqfawadnpejlihovegzvcdfcr";
        assertEquals(28, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case55() {
        String S = "wcegboouyuxktcrhloetgpwcsukaoxaklwkhpllmuarmrjzg";
        assertEquals(39, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case56() {
        String S = "qfyrrmqphtgfezabljtoovvyfbiulvvtpplqyfhdyziugmlob";
        assertEquals(40, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case57() {
        String S = "lbnxqjzpmhwammtpxoptapcazbcobxdbqfuznxguadnpetmhxz";
        assertEquals(54, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case58() {
        String S = "ulegzlotqoyaquaytdonomdvruvdyslgykgxssbxksbzkuoeui";
        assertEquals(48, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case59() {
        String S = "rowhaexhudrdtovfinkwjmborzgexqflyrkzxnpnslvbnttnxe";
        assertEquals(35, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case60() {
        String S = "zhdylwsczegqtyzdanyggcdcrqllsijpimrclcffviloibltdy";
        assertEquals(46, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case61() {
        String S = "xavrzgkvmuhcvzsudwkveaweaalukokpgozbqgnwnkfsshpmel";
        assertEquals(45, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case62() {
        String S = "btenrrrkiwrzaltccejrehcbmyumdvhyqprqjuhljmdvhvxevw";
        assertEquals(51, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case63() {
        String S = "ihyrbteilmrbcttlwlrjiplveprdstsnnwrhffhjxnilwekyts";
        assertEquals(51, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case64() {
        String S = "bvcmzjgbnxoabkbcpuppwlfhqrhrcsnhnelrgneqpqlyzpnhpl";
        assertEquals(50, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case65() {
        String S = "kpvbmltwpxcnakjfzgejanqytrjtodyajzrisipocoopcuzpnj";
        assertEquals(39, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case66() {
        String S = "pqukgltnxtybnuwqcwypiqolhutifrocedhhrahxyfawoltnup";
        assertEquals(46, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case67() {
        String S = "xcgvjskyefshwsgnuigygxaodssmurlyzjmpatktkcpydcjslg";
        assertEquals(43, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case68() {
        String S = "ejxlibbfwxigqqvmcyruzkbhmkgetggdvgqfjaezwxcdyanzqd";
        assertEquals(36, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case69() {
        String S = "etzugvbgvuksadzimugmvdrvopvewyqecijlrttmrxhomvjyig";
        assertEquals(44, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case70() {
        String S = "whdhhyanovnvmpiqflvorqguqgupwyzpfuzyuynklnogiqehso";
        assertEquals(49, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case71() {
        String S = "elzhhthdpjxkndtkqgehyxtneugfgjrnjqkchrntwrbapooblp";
        assertEquals(41, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case72() {
        String S = "lfgamabzsfbwakufjpfjmxginfcaoflpuxmckxhnafdgawqjnh";
        assertEquals(59, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case73() {
        String S = "fznjewvjgdhwkgjsprdkicfdecpwkvtweukkmhwqgjjkkwrgtl";
        assertEquals(65, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case74() {
        String S = "xdpknvfsyqlvkobjuucpcexowztctvpscbthupshbuciyjwlwj";
        assertEquals(44, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case75() {
        String S = "lnyplxvbdejtwsguizsuoqlakosqzwxxawnemkdovfctayulbb";
        assertEquals(30, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case76() {
        String S = "jnhyjbhfcrlclkllngrlamulqgxdihqjpncxtcmcelqvbbyxln";
        assertEquals(58, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case77() {
        String S = "oqdrwkuijltyutxfvjnojmjvmnpgbzkrqybuypopfwpckjffbb";
        assertEquals(41, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case78() {
        String S = "aaaabaaaaaaabaaaaaabaaaaaaaaababbaaaaaaaaaabbaaaaa";
        assertEquals(2077, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case79() {
        String S = "topcoderdivtwoopp";
        assertEquals(8, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case80() {
        String S = "aaaa";
        assertEquals(0, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case81() {
        String S = "hooopooopppooosss";
        assertEquals(54, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case82() {
        String S = "abbabba";
        assertEquals(5, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case83() {
        String S = "a";
        assertEquals(0, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case84() {
        String S = "zabzabz";
        assertEquals(3, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case85() {
        String S = "abcjkfjgkjjabcjkdjfkabcdejjiie";
        assertEquals(52, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case86() {
        String S = "abaabba";
        assertEquals(2, akaridaisukidiv2.countTuples(S));
    }

    @Test
    public void case87() {
        String S = "abaaaaaxxaaaaabbaaaaaaaaaxxaabaaaaxxaaaxaaaaxx";
        assertEquals(1082, akaridaisukidiv2.countTuples(S));
    }

}
