package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class EllysScrabbleTest {
    EllysScrabble ellysscrabble = new EllysScrabble();

    @Test
    public void case1() {
        String letters = "ABRACADABRA";
        int maxDistance = 2;
        assertEquals("AABARACBDAR", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case2() {
        String letters = "ESPRIT";
        int maxDistance = 3;
        assertEquals("EIPRST", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case3() {
        String letters = "BAZINGA";
        int maxDistance = 8;
        assertEquals("AABGINZ", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case4() {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int maxDistance = 9;
        assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case5() {
        String letters = "GOODLUCKANDHAVEFUN";
        int maxDistance = 7;
        assertEquals("CADDGAHEOOFLUKNNUV", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case6() {
        String letters = "AAAWDIUAOIWDESBEAIWODJAWDBPOAWDUISAWDOOPAWD";
        int maxDistance = 6;
        assertEquals("AAAADDEIBWAEUIODWADSBIAJWODIAWDOPOAWDUOSPWW", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case7() {
        String letters = "TOPCODER";
        int maxDistance = 3;
        assertEquals("CODTEPOR", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case8() {
        String letters = "A";
        int maxDistance = 1;
        assertEquals("A", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case9() {
        String letters = "A";
        int maxDistance = 9;
        assertEquals("A", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case10() {
        String letters = "Z";
        int maxDistance = 1;
        assertEquals("Z", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case11() {
        String letters = "Z";
        int maxDistance = 9;
        assertEquals("Z", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case12() {
        String letters = "AAAAAAAAAAAAAAAAAACB";
        int maxDistance = 5;
        assertEquals("AAAAAAAAAAAAAAAAAABC", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case13() {
        String letters = "CABAAAAAAAAAAAAAAAACB";
        int maxDistance = 2;
        assertEquals("AACABAAAAAAAAAAAAAABC", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case14() {
        String letters = "WITHOUTITIMJUSTESPRIT";
        int maxDistance = 9;
        assertEquals("HIIIJMEOPWITRSUTSTTTU", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case15() {
        String letters = "RIGHTNOWYOUSHOULDBELAUGHING";
        int maxDistance = 7;
        assertEquals("GHINOHORLDBTEAWYGUSGOUHILNU", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case16() {
        String letters = "GOGOKEFAKEFAISNOTBLUEYET";
        int maxDistance = 8;
        assertEquals("AEEAFFGGIOBOKEEKLNOSTTUY", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case17() {
        String letters = "ZZAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        int maxDistance = 9;
        assertEquals("AAAAAAAAAZZAAAAAAAAAAAAAAAAAAAAA", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case18() {
        String letters = "ZZZZZZZZZZZZZZZZZZZZZAAAAAAAAAAAAAAAAAAAA";
        int maxDistance = 9;
        assertEquals("ZZZZZZZZZZZZAAAAAAAAAZZZZZZZZZAAAAAAAAAAA", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case19() {
        String letters = "GOOGLE";
        int maxDistance = 3;
        assertEquals("GGELOO", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case20() {
        String letters = "GGNORE";
        int maxDistance = 5;
        assertEquals("EGGNOR", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case21() {
        String letters = "AZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZ";
        int maxDistance = 9;
        assertEquals("AAAAAAAAAAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZAZZZZZZZZZZ", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case22() {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int maxDistance = 8;
        assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case23() {
        String letters = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
        int maxDistance = 8;
        assertEquals("RQPONMLKZYXWVUTSBACDEFGHJI", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case24() {
        String letters = "TOPCODER";
        int maxDistance = 1;
        assertEquals("OTCPDOER", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case25() {
        String letters = "TOPCODER";
        int maxDistance = 3;
        assertEquals("CODTEPOR", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case26() {
        String letters = "TOPCODER";
        int maxDistance = 4;
        assertEquals("CDEOTOPR", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case27() {
        String letters = "TOPCODER";
        int maxDistance = 5;
        assertEquals("CDEOOTPR", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case28() {
        String letters = "TOPCODER";
        int maxDistance = 6;
        assertEquals("CDEOOPTR", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case29() {
        String letters = "TOPCODER";
        int maxDistance = 7;
        assertEquals("CDEOOPRT", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case30() {
        String letters = "TOPCODER";
        int maxDistance = 8;
        assertEquals("CDEOOPRT", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case31() {
        String letters = "AAAAAABCDEFKYDETREZAZZYYYRRZ";
        int maxDistance = 5;
        assertEquals("AAAAAABCDDEEEFAKRYTYRRYZYZZZ", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case32() {
        String letters = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAZYX";
        int maxDistance = 9;
        assertEquals("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAXYZ", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case33() {
        String letters = "ZYXAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        int maxDistance = 9;
        assertEquals("AAAAAAAAAZYXAAAAAAAAAAAAAAAAAAAAAAA", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case34() {
        String letters = "MOMSEEIAMWRITINGTESTSFORTOPCODERTCOROUNDONE";
        int maxDistance = 9;
        assertEquals("AEEIIIGMEMOMSFNOOPWRCTDECTOSTSDNRTENOOORRTU", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case35() {
        String letters = "DDDDDDDDCCCCCCCCCCCCCCCCCCCCCCCC";
        int maxDistance = 5;
        assertEquals("DDDCCCCCDDDDDCCCCCCCCCCCCCCCCCCC", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case36() {
        String letters = "DDDDDDDDCCCCCCCCCCCCCCCCCCCCCCCC";
        int maxDistance = 9;
        assertEquals("CCCCCCCCCDDDDDDDDCCCCCCCCCCCCCCC", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case37() {
        String letters = "ZZZYYYGGGGXXXCBAABCFFFFFFTRRAWD";
        int maxDistance = 1;
        assertEquals("ZZYZYGYGGGXXCXABABCFFFFFFRTARDW", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case38() {
        String letters = "ZZZYYYGGGGXXXCBAABCFFFFFFTRRAWD";
        int maxDistance = 2;
        assertEquals("ZYYZZGGYGGXCBXXAABCFFFFFFRATDRW", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case39() {
        String letters = "ZZZYYYGGGGXXXCBAABCFFFFFFTRRAWD";
        int maxDistance = 3;
        assertEquals("YYYZZZGGGGCBAXXXABCFFFFFFARDTRW", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case40() {
        String letters = "ZZZYYYGGGGXXXCBAABCFFFFFFTRRAWD";
        int maxDistance = 4;
        assertEquals("YYGGZZZGGYBAABXXXCCFFFFFAFDRRTW", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case41() {
        String letters = "ZZZYYYGGGGXXXCBAABCFFFFFFTRRAWD";
        int maxDistance = 5;
        assertEquals("YGGGGZZZCYYAABBXXXCFFFFAFDFRRTW", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case42() {
        String letters = "ZZZYYYGGGGXXXCBAABCFFFFFFTRRAWD";
        int maxDistance = 6;
        assertEquals("GGGGXXZZZYYYAABBCCXFFFAFDFFRRTW", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case43() {
        String letters = "ZZZYYYGGGGXXXCBAABCFFFFFFTRRAWD";
        int maxDistance = 7;
        assertEquals("GGGGXXCZZZYYYAABBCFXFAFDFFFRRTW", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case44() {
        String letters = "ZZZYYYGGGGXXXCBAABCFFFFFFTRRAWD";
        int maxDistance = 8;
        assertEquals("GGGGXCBAZZZYYYABCFFXXADFFFFRRTW", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case45() {
        String letters = "ZZZYYYGGGGXXXCBAABCFFFFFFTRRAWD";
        int maxDistance = 9;
        assertEquals("GGGGCBAABZZZYYYCFFFXXXADFFFRRTW", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case46() {
        String letters = "QZZYYYGGGGXXXCBAABCFFFFFFTRRAWD";
        int maxDistance = 7;
        assertEquals("GGGGQXCBZZYYYAABCFXXFAFDFFFRRTW", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case47() {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYYXWVUTSRQPONMLKJIHGFEDCBA";
        int maxDistance = 1;
        assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYXYVWTURSPQNOLMJKHIFGDEBCA", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case48() {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYYXWVUTSRQPONMLKJIHGFEDCBA";
        int maxDistance = 3;
        assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXWVUYYXQPOTSRKJINMLEDCHGFAB", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case49() {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYYXWVUTSRQPONMLKJIHGFEDCBA";
        int maxDistance = 5;
        assertEquals("ABCDEFGHIJKLMNOPQRSTUVWVUTSRXYYXWLKJIHQPONMBACDEGF", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case50() {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYYXWVUTSRQPONMLKJIHGFEDCBA";
        int maxDistance = 7;
        assertEquals("ABCDEFGHIJKLMNOPQRSTUVUTSRQPOWXYYXWVGFEDCBANMLKJIH", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case51() {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYYXWVUTSRQPONMLKJIHGFEDCBA";
        int maxDistance = 9;
        assertEquals("ABCDEFGHIJKLMNOPQRSTUTSRQPONMLVWXYYXWVUBACDEFGHIKJ", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case52() {
        String letters = "YXWVUTSRQPONMLKJIHGFEDCBAABCDEFGHIJKLMNOPQRSTUVWXY";
        int maxDistance = 2;
        assertEquals("WVYXSRUTONQPKJMLGFIHCBEDAABCDEFGHIJKLMNOPQRSTUVWXY", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case53() {
        String letters = "YXWVUTSRQPONMLKJIHGFEDCBAABCDEFGHIJKLMNOPQRSTUVWXY";
        int maxDistance = 4;
        assertEquals("UTSRYXWVMLKJQPONEDCBIHGFAABCDEFGHIJKLMNOPQRSTUVWXY", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case54() {
        String letters = "YXWVUTSRQPONMLKJIHGFEDCBAABCDEFGHIJKLMNOPQRSTUVWXY";
        int maxDistance = 6;
        assertEquals("SRQPONYXWVUTGFEDCBMLKJIHAABCDEFGHIJKLMNOPQRSTUVWXY", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case55() {
        String letters = "YXWVUTSRQPONMLKJIHGFEDCBAABCDEFGHIJKLMNOPQRSTUVWXY";
        int maxDistance = 8;
        assertEquals("QPONMLKJYXWVUTSRAABBCCDDIHGFEEFGHIJKLMNOPQRSTUVWXY", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case56() {
        String letters = "YXWVUTSRQPONMLKJIHGFEDCBAABCDEFGHIJKLMNOPQRSTUVWXY";
        int maxDistance = 9;
        assertEquals("PONMLKJIHYXWVUTSRQAABBCCDDEGFEFGHIJKLMNOPQRSTUVWXY", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case57() {
        String letters = "ZAZBZCZDZEZFZGZHZIZJZKZLZMZNZOZPZQZRZSZTZUZVZWZXZY";
        int maxDistance = 7;
        assertEquals("ABCDEFGZHZIZJZKZLZMZNZOZPZQZRZSZTZUZVZWZXZYZZZZZZZ", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case58() {
        String letters = "ZAZBZCZDZEZFZGZHZIZJZKZLZMZNZOZPZQZRZSZTZUZVZWZXZY";
        int maxDistance = 8;
        assertEquals("ABCDEFGHZIZJZKZLZMZNZOZPZQZRZSZTZUZVZWZXZYZZZZZZZZ", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case59() {
        String letters = "ZAZBZCZDZEZFZGZHZIZJZKZLZMZNZOZPZQZRZSZTZUZVZWZXZY";
        int maxDistance = 9;
        assertEquals("ABCDEFGHIZJZKZLZMZNZOZPZQZRZSZTZUZVZWZXZYZZZZZZZZZ", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case60() {
        String letters = "AZAYAXAWAVAUATASARAQAPAOANAMALAKAJAIAHAGAFAEADACAB";
        int maxDistance = 7;
        assertEquals("AAAAAAAAZAYAXAWAVAUATASARAQAPAOANAMALAKAJAIBHCGDFE", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case61() {
        String letters = "AZAYAXAWAVAUATASARAQAPAOANAMALAKAJAIAHAGAFAEADACAB";
        int maxDistance = 8;
        assertEquals("AAAAAAAAAZAYAXAWAVAUATASARAQAPAOANAMALAKAJBICHDGEF", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case62() {
        String letters = "AZAYAXAWAVAUATASARAQAPAOANAMALAKAJAIAHAGAFAEADACAB";
        int maxDistance = 9;
        assertEquals("AAAAAAAAAAZAYAXAWAVAUATASARAQAPAOANAMALAKBJCIDHEGF", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case63() {
        String letters = "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD";
        int maxDistance = 1;
        assertEquals("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case64() {
        String letters = "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD";
        int maxDistance = 9;
        assertEquals("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case65() {
        String letters = "H";
        int maxDistance = 5;
        assertEquals("H", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case66() {
        String letters = "JIABBNYDBWHYKZUPCUXMUSHNXWJCZCZBMD";
        int maxDistance = 6;
        assertEquals("ABBBDHJIKNCPYMUWHYNZJCSUXBUCDMXWZZ", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case67() {
        String letters = "XROMTVTPUGPDKBKTQDTG";
        int maxDistance = 8;
        assertEquals("MGODKBKPXRDGTVTPUQTT", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case68() {
        String letters = "JCUTPFFMSLDRDFTODEBLEEALCAPOVMDNQLWGMCY";
        int maxDistance = 3;
        assertEquals("CJFFMUTPDDFSLDRBETOAECLAELMDNPOVGLCQMWY", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case69() {
        String letters = "IKTSXRLBOYUWLNSPYVOPUUFKSXDPYOVINY";
        int maxDistance = 9;
        assertEquals("BIKLLNOPROPTSXFKSDYUWOINPYVSUUVXYY", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case70() {
        String letters = "YUDMVZBMHXV";
        int maxDistance = 3;
        assertEquals("DMUYBHMVZVX", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case71() {
        String letters = "RTKBXYCBBJOKETEHEEZFSLIPRLZGUKFGGZGG";
        int maxDistance = 7;
        assertEquals("BBBCJEKRTEEXYEFHIOKLTGKFGZGSGGPRLZUZ", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case72() {
        String letters = "YBZYUXGPNTIDXFZTRLDOMJQKVBPQHBSIUJ";
        int maxDistance = 4;
        assertEquals("BUGPYNZYDXFIRTDLXJZTKBMOHBQIVJPQSU", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case73() {
        String letters = "AWZQSQEFRRZEHTXNGZNKVDFPKEQJRRSJ";
        int maxDistance = 7;
        assertEquals("AEFQEHQRWZGSKNDFRZEKTXJNZJPVQRRS", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case74() {
        String letters = "NAFDA";
        int maxDistance = 2;
        assertEquals("ADNAF", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case75() {
        String letters = "EHGBWWZAXTOSNCWPMPGBAKSHPLRCUHRZVGLJFMYQ";
        int maxDistance = 8;
        assertEquals("ABEGHCNOMPGBWWZAXTHSCHWKLPGJFLSMPQRRUVYZ", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case76() {
        String letters = "UJOMPFJHREEPWJMOJKEXJETMOXPKAYZENMLCTGMQNPKXN";
        int maxDistance = 4;
        assertEquals("JFJHUEOMPEJMRJEPWEJOKMOXAKTENXPCLYZGMMKNTNPQX", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case77() {
        String letters = "CZDIAUWTBHGHTUHHLETIVAMS";
        int maxDistance = 7;
        assertEquals("ABCDGHHHZHIEUWTAILMTUSTV", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case78() {
        String letters = "LOJRAPGVLNRAZKHRPUVT";
        int maxDistance = 9;
        assertEquals("AGAJKHLLNOPPRRRTVUVZ", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case79() {
        String letters = "FFBKJISK";
        int maxDistance = 7;
        assertEquals("BFFIJKKS", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case80() {
        String letters = "EPWHPIGAEYPLMINCKDMFYQQRQIJHIPRUSEMPAJBZHQWJ";
        int maxDistance = 6;
        assertEquals("EAEGHILPWCPDIFKYPMMINHIJPQYEQRQABJHMRUSJPQWZ", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case81() {
        String letters = "TPTAJXZEIGOBEDYKBATQDNLBWQXOHKDXTIFMRRREWOPHCCLYC";
        int maxDistance = 4;
        assertEquals("AJPETGTBEXZDIAOBDKYBLNTQHKDOWQXFIMRXTEOHCRRCWCPLY", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case82() {
        String letters = "EIMQWPJEOFXLIORCZDFMOXPGGOQJVOBDFYMWDPIKPWZS";
        int maxDistance = 2;
        assertEquals("EIMPJQWEFLOIXCODRFZMOGGXPJOOQBVDFMDYIWKPPSWZ", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case83() {
        String letters = "CELWZHWPPOIEYKWDYYIMXEMB";
        int maxDistance = 3;
        assertEquals("CEHLPPWZEWIKODWYIMEYYBMX", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case84() {
        String letters = "ROICIEFPRYZJJJUXJVKXMBOODNVBCHECYYZURLLYSPXNMKSDAA";
        int maxDistance = 9;
        assertEquals("CEFIIJJJJROKBMODPRYZBCCUXEVHXLLNOPNVKMDAAYYZURSSYX", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case85() {
        String letters = "GNFD";
        int maxDistance = 9;
        assertEquals("DFGN", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case86() {
        String letters = "ZHRQTGBRWVXFXGWGRFXKOMHZMSJVOFZGLOCJTR";
        int maxDistance = 6;
        assertEquals("BGHQRFZGRGTFRKWVXHXMWJMFXGOLCZJSOVORZT", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case87() {
        String letters = "ZXDOLZDUZKAAKPDBEIEFLDMLVYOUQBWCW";
        int maxDistance = 1;
        assertEquals("XZDLODZUKZAAKDPBEEIFDLLMVOYQUBCWW", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case88() {
        String letters = "EKRSQIM";
        int maxDistance = 1;
        assertEquals("EKRQSIM", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case89() {
        String letters = "RSQBCTQKMIXDGXSPUYQLL";
        int maxDistance = 5;
        assertEquals("BCKMIRSQDGTQPQLXLSXUY", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case90() {
        String letters = "ZEATAYVZZWFAHIPXPDIJMUAVVPVIDFITST";
        int maxDistance = 9;
        assertEquals("AAAEFHIPDZIJTAYVZZWDFIIMXPPSTTUVVV", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case91() {
        String letters = "CRAYSXNIKASI";
        int maxDistance = 6;
        assertEquals("ACIAKINRSYSX", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case92() {
        String letters = "BNXFJADDEIFIHROLLRMRLQBOPHHMKLIRHHPFQIOAZ";
        int maxDistance = 4;
        assertEquals("BADDENXFJFHIILLMLROBORHRHQIKPHHMFLIRAOPQZ", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case93() {
        String letters = "FTC";
        int maxDistance = 3;
        assertEquals("CFT", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case94() {
        String letters = "AMGSSULCRLYNZVWCJIWELRDONGTTSRCHSXCWSDFCHCIHF";
        int maxDistance = 5;
        assertEquals("AGCLLMNRSSUCIJEYLZVWDGNWOCRHRCSTTDCFCSXFWSHHI", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case95() {
        String letters = "GQSBTHMGRJWYMODEWHJWFJEBWMJTYQQHE";
        int maxDistance = 6;
        assertEquals("BGGHJMMQSDTEHJRFWYBOEJWJMWEHQQWTY", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case96() {
        String letters = "VKCPQZMBXCQJMYZCMJCTPISYGNRFGZCCCKSZXTJYZ";
        int maxDistance = 6;
        assertEquals("CBKCMJVMPCQZCJXIQMGYZFGNCTPCSYCKRJSZTXYZZ", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case97() {
        String letters = "QRRKFDXSDJGUXXCPBRMZJSVLKIGNBLNFKUYBMXKR";
        int maxDistance = 6;
        assertEquals("DFDJGKQRRCBPXSJMRUXXGIBKLZFSVBKLKNMNRUXY", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case98() {
        String letters = "TIIRSFKYTGDKTNAFKYABRGWVILOUTGPXUCQGKQLXMDZAICPR";
        int maxDistance = 1;
        assertEquals("ITIRFSKTYDGKNTAFKAYBGRVWILOTUGPUXCGQKLQMXDAZCIPR", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case99() {
        String letters = "GTWLPWUIQBJQYHZENAWZRMGYLZDPMQCBRJIMJFPVXZJGIRMK";
        int maxDistance = 3;
        assertEquals("GLPTIWBJWUHQENQYAZMGRWZDLMYCZBPIQJFRJMPJGIVXZKMR", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case100() {
        String letters = "GAGHBYMUXXFAMNMWNOTCCYBQLGPPUKRCWMBSQUIQZOPGAEQO";
        int maxDistance = 5;
        assertEquals("ABGGHFAMMMYNUXXCCBNLWGOTKPYCQBMPQUIROWGASEUOQZPQ", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case101() {
        String letters = "TLUKXZUVUZWGRPMBVXAXJXLMYHNMHWTYIIYVIZVMZRFEFOBH";
        int maxDistance = 7;
        assertEquals("KLTUGRPMBUUXZAVJZWHLMHMVXIXIXINYMTRFWEYBFYVHZVOZ", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case102() {
        String letters = "WOXONCPDPPXFOGEFMZMYXOAMDNSKOQQEWFJCLOZZZKEDS";
        int maxDistance = 2;
        assertEquals("OOWCXDNPPFOPXEFGMMXZAYDOMKNOSEQFQCWJLOZKEZZDS", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case103() {
        String letters = "GIVKGTFJJVTQXGEAFDINNOLSXEZORXQBGZTYPWYTIXLL";
        int maxDistance = 2;
        assertEquals("GIGKVFJTJQTVEAXGDFINLNOESOXRZBGXQTPZWYITYLLX", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case104() {
        String letters = "MIGHAEELTSBGXFYCGSSXPMUOSKPAXJRYLEJXWKZM";
        int maxDistance = 1;
        assertEquals("IMGAHEELSTBGFXCYGSSPXMOUKSAPJXRLYEJWXKMZ", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case105() {
        String letters = "MRZQGJNBOEOJJFXHBZMWMPFOERHXQNEGDBUXOHWDDFTADDP";
        int maxDistance = 8;
        assertEquals("BEGJJFJHMRZQBMNFOEOHMNXEDZBWGPHODRDXQADDFOUXPTW", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case106() {
        String letters = "LGDPRQGPWWVQFBVQGHHJPHLFDAJNQAJSGEQYWHQXYSIOV";
        int maxDistance = 8;
        assertEquals("DGGLFBPPGHHJRQHFWWVQAAVQDEGJPHLJNQIOQQSSVWXYY", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case107() {
        String letters = "OJCGJHMUHZTAYLRJGTNZPIKWVPQURSOCJNVMJEYRQ";
        int maxDistance = 3;
        assertEquals("CGHOJHJMATULZGJYNRIKTPZPQRWVCJUNSOEJMVQRY", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case108() {
        String letters = "IMPLUBYTMHWGKRFVVWRAVHGANOXWKJUZTZRTXVZZTOXZASJIA";
        int maxDistance = 6;
        assertEquals("BILHMGKMPFURYTAHWAGNOVVWRJVKRTTUXWTOVZAZJIXAZZSXZ", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case109() {
        String letters = "IBDFBBOUTKWMRRHDNHQUTRLSVDMOHKVJLHJEAZYIYGVL";
        int maxDistance = 5;
        assertEquals("BBBDFIKMOHDNUTHWQRRLDMOHUTRJSVEAHJKVGLILVYZY", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case110() {
        String letters = "KMVWCJQVDXGQGSXWEVPXIPMTQVMSHOTAWBZEAFYFPDDSLKMLCB";
        int maxDistance = 7;
        assertEquals("CDJGKGMQQVWEPIVMXPQMSXWHVAXBEATFVFSDOTDWKZBCLYLPMS", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case111() {
        String letters = "DNFZYICHQCHMTKSYHSTHYRTJKBRMWXVRGMWHNSHYYYPIFEWV";
        int maxDistance = 5;
        assertEquals("DCFHCHNIZYKHMQHSRTJKYBSTMYRTGMHNRWXVHPIWEFSVYYYW", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case112() {
        String letters = "YFQLBWZIBUVHLGOJJNKPPKOFTFGPVCVKXREAGOAYYHIGBFWFX";
        int maxDistance = 7;
        assertEquals("BBFIHLGYJQJKWZKLUVFFGOCNKOPPAEGTAOPVGVBXRFFHIWYYX", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case113() {
        String letters = "FRKGYVBNGTZBSGVZTHEVZQIIHRCGAJEIQAUYSXJCIHSQAKUUJM";
        int maxDistance = 6;
        assertEquals("BFGGKBNRGSYVEHTQZIHIVZTACVZAEGIRJCIHJQAKUYSXJMQSUU", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case114() {
        String letters = "GYNGKIMXTCFVLCNATYLYJKWNCXVJSPTHTLQUCWHDJLTK";
        int maxDistance = 1;
        assertEquals("GNYGIKMTXCFLVCANTLYJYKNWCVXJPSHTLTQCUHWDJLKT", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case115() {
        String letters = "VWRSAAAWDIUAOIWSADESBEAIWODJAWDBPOAWDUISAWDOOPAWDZ";
        int maxDistance = 9;
        assertEquals("AAAADIIADVWRSABEWDEUAOBWSADDSIIAJWODOAWDOPOPWSUWWZ", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case116() {
        String letters = "AWIBWEIFOJWEFIOJWEFIJWEOIFJIOEWJFIOWEJFIOEJAPQWSSQ";
        int maxDistance = 9;
        assertEquals("ABEEFFIIEFWIIWEIFOJWEIJOFWIEJFWIOEAJJOJWJOOPWQQSSW", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case117() {
        String letters = "AJFKLAJSLKDFJLAJFASFD";
        int maxDistance = 8;
        assertEquals("AADFFJAJFAJKLDFSLKJLS", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case118() {
        String letters = "ABASBDBDFFEWFWEBEF";
        int maxDistance = 5;
        assertEquals("AABBBDDESEBEFFFFWW", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case119() {
        String letters = "VKCRJXBYNSBCHJZBYXRTQRNVCAKCKDWSMJWOGNEEIWWHUSYKPB";
        int maxDistance = 9;
        assertEquals("BBCCHJBJKVNQRNXCYASCDKKZJYXRTEREVGHIMNKWSBOWPSUWWY", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case120() {
        String letters = "AAAWDIUAOIWDESBEAIWODJAWDBPOAWDUIUISAWDOOP";
        int maxDistance = 6;
        assertEquals("AAAADDEIBWAEUIODWADSBIAJWODIIWAOPDOWOUPUSW", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case121() {
        String letters = "MFLRRBGLVASOYXEKEJLKDTWXYGVREUOECPDOOOUFNSVXENAJMU";
        int maxDistance = 3;
        assertEquals("FLBMGLRRAOSVEEJYXDKKLTGVRWXYECEDUOOOPFNOSUEAJVXMNU", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case122() {
        String letters = "ZZYYXXRRACSSTTQQPPOONNMMLLZZKEEHHFFKJJHHEECCTTBBAA";
        int maxDistance = 9;
        assertEquals("ACRRSQQPPZZYYXXLLMMKSTTEEFFOONNEECCZZBBAHHAHKJJHTT", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case123() {
        String letters = "ZZZZZZA";
        int maxDistance = 5;
        assertEquals("ZAZZZZZ", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case124() {
        String letters = "ZYXWVUTSRQP";
        int maxDistance = 2;
        assertEquals("XWZYTSVUPQR", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case125() {
        String letters = "DAECECBDCACEBDECBECBCBADAAECDABDEDEACDBEEAABBDDCAB";
        int maxDistance = 7;
        assertEquals("ABACCBCDCEBEBCDABAEADEABECCCACDBDEAABBDEDEABDCEEDD", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case126() {
        String letters = "BCA";
        int maxDistance = 9;
        assertEquals("ABC", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case127() {
        String letters = "ZYXRQPONMLKJIGFEDBCA";
        int maxDistance = 9;
        assertEquals("LKJIGFEDBZYXRQPONMAC", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case128() {
        String letters = "CAB";
        int maxDistance = 3;
        assertEquals("ABC", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case129() {
        String letters = "ZBYDALKCBDAAAAAAAAAABBCBDBZKAAZZAAAAAAKKKKLAKZZKZM";
        int maxDistance = 7;
        assertEquals("ABBAAAAZAYDALKCADAAABAABBAAAACADBZKAAZZKKKKKKLMZZZ", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case130() {
        String letters = "ZZAZAZZZZ";
        int maxDistance = 2;
        assertEquals("AZAZZZZZZ", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case131() {
        String letters = "JJNHFKNCGFDGMBJHKLFIGJDDKBMNJHNFCEGNMDMFFAGIKMGBFA";
        int maxDistance = 5;
        assertEquals("FHCGFJJNBDKNGFHGIMDJBKLDHJFCEKGMNJDNAFFGNMBMAFGIKM", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case132() {
        String letters = "ZZZBCD";
        int maxDistance = 1;
        assertEquals("ZZBZCD", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case133() {
        String letters = "CAB";
        int maxDistance = 2;
        assertEquals("ABC", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case134() {
        String letters = "FASDFDASFDASHPHWEQUIRZCXVXCVJASNBAKFSADLFHQASDFOSD";
        int maxDistance = 5;
        assertEquals("AADDDFASFFHESHIPSCQRWCUJASZBXVXAVADFNFAKDSFHLDOQSS", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case135() {
        String letters = "AZZA";
        int maxDistance = 1;
        assertEquals("AZAZ", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case136() {
        String letters = "AZZZZZBZZZAZZZZZA";
        int maxDistance = 3;
        assertEquals("AZZBZZZAZZZZZAZZZ", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case137() {
        String letters = "IAFLODBS";
        int maxDistance = 3;
        assertEquals("AFDIBLOS", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case138() {
        String letters = "FFAXAX";
        int maxDistance = 2;
        assertEquals("AFAFXX", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case139() {
        String letters = "WRYVG";
        int maxDistance = 2;
        assertEquals("RVWGY", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case140() {
        String letters = "AEEAEDDCDDCDEFBCDFBFBDBCFCFDFFDFEEEEEEEEAFDEDADDBB";
        int maxDistance = 2;
        assertEquals("AAEDECEDCDDDBCEFBDBFBFCDCDFFDFEFEFEEEEAEDEDFAEBBDD", ellysscrabble.getMin(letters, maxDistance));
    }

    @Test
    public void case141() {
        String letters = "ADDDCDDCBB";
        int maxDistance = 3;
        assertEquals("ACDDCBDBDD", ellysscrabble.getMin(letters, maxDistance));
    }

}
