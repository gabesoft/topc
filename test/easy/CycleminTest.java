package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class CycleminTest {
    Cyclemin cyclemin = new Cyclemin();

    @Test
    public void case1() {
        String s = "aba";
        int k = 1;
        assertEquals("aaa", cyclemin.bestmod(s, k));
    }

    @Test
    public void case2() {
        String s = "bbb";
        int k = 2;
        assertEquals("aab", cyclemin.bestmod(s, k));
    }

    @Test
    public void case3() {
        String s = "sgsgaw";
        int k = 1;
        assertEquals("aasgsg", cyclemin.bestmod(s, k));
    }

    @Test
    public void case4() {
        String s = "abacaba";
        int k = 1;
        assertEquals("aaaabac", cyclemin.bestmod(s, k));
    }

    @Test
    public void case5() {
        String s = "isgbiao";
        int k = 2;
        assertEquals("aaaisgb", cyclemin.bestmod(s, k));
    }

    @Test
    public void case6() {
        String s = "aba";
        int k = 0;
        assertEquals("aab", cyclemin.bestmod(s, k));
    }

    @Test
    public void case7() {
        String s = "bzjpvdrsmfeirvconzumjpmtuikrelshsygfbcyyfq";
        int k = 21;
        assertEquals("aaaaaaaaaaaaaaaaaaaaabcyyfqbzjpvdrsmfeirvc", cyclemin.bestmod(s, k));
    }

    @Test
    public void case8() {
        String s = "pyoirqjghmvxfynqmszdbzgrnnjkjowg";
        int k = 3;
        assertEquals("aaabzgrnnjkjowgpyoirqjghmvxfynqm", cyclemin.bestmod(s, k));
    }

    @Test
    public void case9() {
        String s = "g";
        int k = 0;
        assertEquals("g", cyclemin.bestmod(s, k));
    }

    @Test
    public void case10() {
        String s = "vdrzwythetbdeyiloklbuyzupaltnebtwhyixs";
        int k = 4;
        assertEquals("aaaaabtwhyixsvdrzwythetbdeyiloklbuyzup", cyclemin.bestmod(s, k));
    }

    @Test
    public void case11() {
        String s = "romaxenbuuhxwisbbemcgdiosiuwctbkrvtpfnzrt";
        int k = 6;
        assertEquals("aaaaaaabuuhxwisbbemcgdiosiuwctbkrvtpfnzrt", cyclemin.bestmod(s, k));
    }

    @Test
    public void case12() {
        String s = "ikcwogejvhjiuxmbrkpzlzoxtgradpkxjntyo";
        int k = 2;
        assertEquals("aaadpkxjntyoikcwogejvhjiuxmbrkpzlzoxt", cyclemin.bestmod(s, k));
    }

    @Test
    public void case13() {
        String s = "dadtymegbsxpalzvjlsbuzbudrtkpdallvctpiqdbfydynvpdg";
        int k = 1;
        assertEquals("aadtymegbsxpalzvjlsbuzbudrtkpdallvctpiqdbfydynvpdg", cyclemin.bestmod(s, k));
    }

    @Test
    public void case14() {
        String s = "vzocfajqdapa";
        int k = 2;
        assertEquals("aaaavzocfajq", cyclemin.bestmod(s, k));
    }

    @Test
    public void case15() {
        String s = "naltgmahblriiwmxnwrfqignkxuoamsbyfrkwcgbfakktgybrg";
        int k = 35;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaablriiwmxnwr", cyclemin.bestmod(s, k));
    }

    @Test
    public void case16() {
        String s = "etyoxlivhoqp";
        int k = 0;
        assertEquals("etyoxlivhoqp", cyclemin.bestmod(s, k));
    }

    @Test
    public void case17() {
        String s = "ulsahabaxhdrqzaqozakekmvxaaoalppuraigpaykwovwuu";
        int k = 4;
        assertEquals("aaaaaaadrqzaqozakekmvxaaoalppuraigpaykwovwuuuls", cyclemin.bestmod(s, k));
    }

    @Test
    public void case18() {
        String s = "avaidvcadaqextkzojwfwzgymllezyiutmgawqsowxhfaantm";
        int k = 1;
        assertEquals("aaaidvcadaqextkzojwfwzgymllezyiutmgawqsowxhfaantm", cyclemin.bestmod(s, k));
    }

    @Test
    public void case19() {
        String s = "miqgbambkedajeeyskbtbmetaapizdhejwahalyxnakakqnjap";
        int k = 5;
        assertEquals("aaaaaaaakakqnjapmiqgbambkedajeeyskbtbmetaapizdhejw", cyclemin.bestmod(s, k));
    }

    @Test
    public void case20() {
        String s = "ailazqrfaydhoaqokblwsvbfyamrsfwarcnpmnpadzvyhta";
        int k = 2;
        assertEquals("aaaaazqrfaydhoaqokblwsvbfyamrsfwarcnpmnpadzvyht", cyclemin.bestmod(s, k));
    }

    @Test
    public void case21() {
        String s = "gkhtdvarapjfdfyrywjxsbjaagbzyqbs";
        int k = 8;
        assertEquals("aaaaaaaaaabsgkhtdvarapjfdfyrywjx", cyclemin.bestmod(s, k));
    }

    @Test
    public void case22() {
        String s = "rzjvlnbmypoobwqkgimzgbbamemarlafyvahddcwzztapqar";
        int k = 0;
        assertEquals("afyvahddcwzztapqarrzjvlnbmypoobwqkgimzgbbamemarl", cyclemin.bestmod(s, k));
    }

    @Test
    public void case23() {
        String s = "zaaymthcazlivzdlxxdguthapnsaaakfuvabsizwxcyicmhb";
        int k = 12;
        assertEquals("aaaaaaaaaaaaaaaaabsizwxcyicmhbzaaymthcazlivzdlxx", cyclemin.bestmod(s, k));
    }

    @Test
    public void case24() {
        String s = "dtwecxaajjotaaeazfhsakxcdvahyyvdljnejajsaereqhb";
        int k = 3;
        assertEquals("aaaaaafhsakxcdvahyyvdljnejajsaereqhbdtwecxaajjo", cyclemin.bestmod(s, k));
    }

    @Test
    public void case25() {
        String s = "ipqmjgejrlnidujxlaxzapaayzraqueunbotmkxfgsaewyv";
        int k = 41;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", cyclemin.bestmod(s, k));
    }

    @Test
    public void case26() {
        String s = "etkzgajeizmmqjadfawqamynqaa";
        int k = 1;
        assertEquals("aaaetkzgajeizmmqjadfawqamyn", cyclemin.bestmod(s, k));
    }

    @Test
    public void case27() {
        String s = "javrejbaheektatpgyymwsrrntqidccgu";
        int k = 5;
        assertEquals("aaaaaaaheektatpgyymwsrrntqidccguj", cyclemin.bestmod(s, k));
    }

    @Test
    public void case28() {
        String s = "eemvbbjpiwxlhgwc";
        int k = 3;
        assertEquals("aaabbjpiwxlhgwce", cyclemin.bestmod(s, k));
    }

    @Test
    public void case29() {
        String s = "prgpeyahghwhaxtckzxtexcbazoamybhzaqfnhqgivhtaya";
        int k = 3;
        assertEquals("aaaaagpeyahghwhaxtckzxtexcbazoamybhzaqfnhqgivht", cyclemin.bestmod(s, k));
    }

    @Test
    public void case30() {
        String s = "afkusakhxazmvaoathnmadhwtnaahxaanophkmsaxeavwhh";
        int k = 3;
        assertEquals("aaaaaaanophkmsaxeavwhhafkusakhxazmvaoathnmadhwt", cyclemin.bestmod(s, k));
    }

    @Test
    public void case31() {
        String s = "taacathfkmqvggwahagblgxaaqjqzxlbarotabaagtwa";
        int k = 32;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", cyclemin.bestmod(s, k));
    }

    @Test
    public void case32() {
        String s = "aaqkvafgmdjnevaaodu";
        int k = 0;
        assertEquals("aaoduaaqkvafgmdjnev", cyclemin.bestmod(s, k));
    }

    @Test
    public void case33() {
        String s = "cyfoavajgfalwofqqaaauwyxauopaafaxwcwwlraaqtfjxao";
        int k = 46;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", cyclemin.bestmod(s, k));
    }

    @Test
    public void case34() {
        String s = "aazgygngapoxazazatkhabuifjmaaeanhlaigizaccqxpqtoea";
        int k = 2;
        assertEquals("aaaaagygngapoxazazatkhabuifjmaaeanhlaigizaccqxpqto", cyclemin.bestmod(s, k));
    }

    @Test
    public void case35() {
        String s = "ypaacaezrakzaaanroaancaipaoaromsapodayaacmsgna";
        int k = 32;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", cyclemin.bestmod(s, k));
    }

    @Test
    public void case36() {
        String s = "raqurjsbeitejamojdfaqaxlaszeixvo";
        int k = 0;
        assertEquals("amojdfaqaxlaszeixvoraqurjsbeitej", cyclemin.bestmod(s, k));
    }

    @Test
    public void case37() {
        String s = "feafazgutoyh";
        int k = 0;
        assertEquals("afazgutoyhfe", cyclemin.bestmod(s, k));
    }

    @Test
    public void case38() {
        String s = "aftaobamcdaeaayljdvxroaayzpueaapgpaeqawkqngteqica";
        int k = 2;
        assertEquals("aaaaaljdvxroaayzpueaapgpaeqawkqngteqicaaftaobamcd", cyclemin.bestmod(s, k));
    }

    @Test
    public void case39() {
        String s = "jkmqakjjahwzaoaataexllptmoogaljgcakysjemt";
        int k = 35;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", cyclemin.bestmod(s, k));
    }

    @Test
    public void case40() {
        String s = "xhbzzahmlrfeaasygaadfzhpkxtbaenvvmkjqmha";
        int k = 0;
        assertEquals("aadfzhpkxtbaenvvmkjqmhaxhbzzahmlrfeaasyg", cyclemin.bestmod(s, k));
    }

    @Test
    public void case41() {
        String s = "iepjaleavakbkalqwliaanyaspwaaajauvbxgxjabcimpwadz";
        int k = 31;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcimp", cyclemin.bestmod(s, k));
    }

    @Test
    public void case42() {
        String s = "avrikkatdarp";
        int k = 0;
        assertEquals("arpavrikkatd", cyclemin.bestmod(s, k));
    }

    @Test
    public void case43() {
        String s = "qaibtfdzajonakybagasaka";
        int k = 6;
        assertEquals("aaaaaaaaaaabtfdzajonaky", cyclemin.bestmod(s, k));
    }

    @Test
    public void case44() {
        String s = "asmaaacuaatdbaakhaappvaoydaahaaajfslveoraamaacvaa";
        int k = 4;
        assertEquals("aaaaaaaaaaaacuaatdbaakhaappvaoydaahaaajfslveoraam", cyclemin.bestmod(s, k));
    }

    @Test
    public void case45() {
        String s = "jq";
        int k = 0;
        assertEquals("jq", cyclemin.bestmod(s, k));
    }

    @Test
    public void case46() {
        String s = "dtrbaauaaacsuigjkaawfpaarhapxlgknashdrauaacpairai";
        int k = 0;
        assertEquals("aaacsuigjkaawfpaarhapxlgknashdrauaacpairaidtrbaau", cyclemin.bestmod(s, k));
    }

    @Test
    public void case47() {
        String s = "aacaaaaasftbaaactplkmfoagazntaraargubsaaraekhars";
        int k = 44;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", cyclemin.bestmod(s, k));
    }

    @Test
    public void case48() {
        String s = "lndpaxamgwqavdmahoaaadaaraeghflfaferaravalanafnaj";
        int k = 0;
        assertEquals("aaadaaraeghflfaferaravalanafnajlndpaxamgwqavdmaho", cyclemin.bestmod(s, k));
    }

    @Test
    public void case49() {
        String s = "salttcanncssaaaleauauaspaagaaapanwataalaaadsabacl";
        int k = 5;
        assertEquals("aaaaaaaaaaaaaaadsabaclsalttcanncssaaaleauauaspaag", cyclemin.bestmod(s, k));
    }

    @Test
    public void case50() {
        String s = "aaaaagtaebwdhaaakpwadapyviazahfcoaarva";
        int k = 3;
        assertEquals("aaaaaaaaaaagtaebwdhaaakpwadapyviazahfc", cyclemin.bestmod(s, k));
    }

    @Test
    public void case51() {
        String s = "faufnaayyayxaaaqdaagyqgeqabua";
        int k = 25;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", cyclemin.bestmod(s, k));
    }

    @Test
    public void case52() {
        String s = "liaaawaaajwaaakagkcatdazlaidamqa";
        int k = 4;
        assertEquals("aaaaaaaaaaaaaagkcatdazlaidamqali", cyclemin.bestmod(s, k));
    }

    @Test
    public void case53() {
        String s = "aaaaaaraaarabaaaawautaagxqdawbaabaaaetnaraabaataa";
        int k = 3;
        assertEquals("aaaaaaaaaaaaaaaaaaawautaagxqdawbaabaaaetnaraabaat", cyclemin.bestmod(s, k));
    }

    @Test
    public void case54() {
        String s = "aaysaymwafamahacaraanaazacaaatanaaaaazkp";
        int k = 3;
        assertEquals("aaaaaaaaaaaaazkpaaysaymwafamahacaraanaaz", cyclemin.bestmod(s, k));
    }

    @Test
    public void case55() {
        String s = "acastdunzdtwtpatmsqqzzauajaaoaoaaaataiaoaaaahayax";
        int k = 6;
        assertEquals("aaaaaaaaaaaaaaaaaaaahayaxacastdunzdtwtpatmsqqzzau", cyclemin.bestmod(s, k));
    }

    @Test
    public void case56() {
        String s = "gaaaazaadaa";
        int k = 0;
        assertEquals("aaaazaadaag", cyclemin.bestmod(s, k));
    }

    @Test
    public void case57() {
        String s = "tfajbaawnaamevdxcaxaaaaaapacaoajexavacarahafkwar";
        int k = 5;
        assertEquals("aaaaaaaaaaaaaaaexavacarahafkwartfajbaawnaamevdxc", cyclemin.bestmod(s, k));
    }

    @Test
    public void case58() {
        String s = "aaotggeapqaaaxafazoajfaaajtajaaazajsanaaa";
        int k = 0;
        assertEquals("aaaaaotggeapqaaaxafazoajfaaajtajaaazajsan", cyclemin.bestmod(s, k));
    }

    @Test
    public void case59() {
        String s = "kjmaazazfaoylaxaaaaaagazyxsagaaaasaaegaaaqaaazmx";
        int k = 7;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaegaaaqaaazmxkjmaazazfaoylax", cyclemin.bestmod(s, k));
    }

    @Test
    public void case60() {
        String s = "aaakayuaaazul";
        int k = 0;
        assertEquals("aaakayuaaazul", cyclemin.bestmod(s, k));
    }

    @Test
    public void case61() {
        String s = "ahaaaaarkaaaaaamaaaravahaizgqawasaaa";
        int k = 29;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", cyclemin.bestmod(s, k));
    }

    @Test
    public void case62() {
        String s = "aaafxcapvaaagaamaaadtaaxbaasaaaaaamxadaaarfaaoq";
        int k = 0;
        assertEquals("aaaaaamxadaaarfaaoqaaafxcapvaaagaamaaadtaaxbaas", cyclemin.bestmod(s, k));
    }

    @Test
    public void case63() {
        String s = "cjoakajpaxaadraagzaaaaaartcaaaaaadazhaaacaaarrkaa";
        int k = 4;
        assertEquals("aaaaaaaaaaaaaaaaarrkaacjoakajpaxaadraagzaaaaaartc", cyclemin.bestmod(s, k));
    }

    @Test
    public void case64() {
        String s = "dbaawaaaaaazaaa";
        int k = 0;
        assertEquals("aaaaaazaaadbaaw", cyclemin.bestmod(s, k));
    }

    @Test
    public void case65() {
        String s = "yaalsavaaaalfaahaqarabaaawoavovaqjips";
        int k = 9;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaawoavovaqjipsy", cyclemin.bestmod(s, k));
    }

    @Test
    public void case66() {
        String s = "aacaoaasaaraax";
        int k = 0;
        assertEquals("aacaoaasaaraax", cyclemin.bestmod(s, k));
    }

    @Test
    public void case67() {
        String s = "naagwasu";
        int k = 2;
        assertEquals("aaaaasun", cyclemin.bestmod(s, k));
    }

    @Test
    public void case68() {
        String s = "aaajaqafaaoaxkaj";
        int k = 4;
        assertEquals("aaaaaaaaaaaaoaxk", cyclemin.bestmod(s, k));
    }

    @Test
    public void case69() {
        String s = "vaanaarsaahjaaaacaakaaapaoafasaaaafaaaaaaaofcaah";
        int k = 0;
        assertEquals("aaaaaaaofcaahvaanaarsaahjaaaacaakaaapaoafasaaaaf", cyclemin.bestmod(s, k));
    }

    @Test
    public void case70() {
        String s = "aoxaahaaqaoaaaa";
        int k = 2;
        assertEquals("aaaaaaaaaaoxaah", cyclemin.bestmod(s, k));
    }

    @Test
    public void case71() {
        String s = "auuxapaaagajaaaaahaynamaoaayyvnaaariaoarpgwbav";
        int k = 14;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaoarpgwbavauux", cyclemin.bestmod(s, k));
    }

    @Test
    public void case72() {
        String s = "gdhxalaaamydaamuaqymaxaaaaaaivaaylas";
        int k = 0;
        assertEquals("aaaaaaivaaylasgdhxalaaamydaamuaqymax", cyclemin.bestmod(s, k));
    }

    @Test
    public void case73() {
        String s = "qhesaarancaqaaaaaaaaaaaafaaaaauaaaahx";
        int k = 35;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", cyclemin.bestmod(s, k));
    }

    @Test
    public void case74() {
        String s = "aaoraapav";
        int k = 4;
        assertEquals("aaaaaaaaa", cyclemin.bestmod(s, k));
    }

    @Test
    public void case75() {
        String s = "aahaaa";
        int k = 3;
        assertEquals("aaaaaa", cyclemin.bestmod(s, k));
    }

    @Test
    public void case76() {
        String s = "aasaaavaakaj";
        int k = 2;
        assertEquals("aaaaaaaaakaj", cyclemin.bestmod(s, k));
    }

    @Test
    public void case77() {
        String s = "lauanuqaeakakauaaaaaaaaaztraaxizajxhaaagaaaaaaaa";
        int k = 30;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", cyclemin.bestmod(s, k));
    }

    @Test
    public void case78() {
        String s = "iaaanjaaaabaaa";
        int k = 1;
        assertEquals("aaaaaaaaiaaanj", cyclemin.bestmod(s, k));
    }

    @Test
    public void case79() {
        String s = "aaarajaaaaaaaaaaaaaauzupuaaaaaaaaraaapaaaacaaaaa";
        int k = 7;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaupu", cyclemin.bestmod(s, k));
    }

    @Test
    public void case80() {
        String s = "aaaaaaaaaxacdraaaaaaaaaxaaaayazcaacaoaataaanaane";
        int k = 4;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaxaaaayazcaacaoaataaanaane", cyclemin.bestmod(s, k));
    }

    @Test
    public void case81() {
        String s = "aaaaacaaaaaaaaaafaaaaaxaxamaaaaaaaaazaaavroaaeaa";
        int k = 47;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", cyclemin.bestmod(s, k));
    }

    @Test
    public void case82() {
        String s = "aaaawaaaaafasaamaauaaaawqa";
        int k = 4;
        assertEquals("aaaaaaaaaaaaaaaaaaaafasaam", cyclemin.bestmod(s, k));
    }

    @Test
    public void case83() {
        String s = "rqaaatgaaaiaaaaiaooaaaaaaaaaaaaamaaaaaaaraaaaaat";
        int k = 4;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrqaaatgaaaiaaaai", cyclemin.bestmod(s, k));
    }

    @Test
    public void case84() {
        String s = "aaaaaaaaaaamaaaaaasaayanugaaa";
        int k = 1;
        assertEquals("aaaaaaaaaaaaaaaaaaaaasaayanug", cyclemin.bestmod(s, k));
    }

    @Test
    public void case85() {
        String s = "akamaaaaaaasaaaaaaaaaanaaaaaavaaaaaaapaaaaaavas";
        int k = 28;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", cyclemin.bestmod(s, k));
    }

    @Test
    public void case86() {
        String s = "aazaaaaadamaaaaeaaaaacaaaawata";
        int k = 4;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaawataaaz", cyclemin.bestmod(s, k));
    }

    @Test
    public void case87() {
        String s = "aayhaaaaqaasbaaaaaaayahaajuabaaavaaaraaaaaaaala";
        int k = 4;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaqaasbaaaaaaayahaajuabaaav", cyclemin.bestmod(s, k));
    }

    @Test
    public void case88() {
        String s = "aavaaalaaaaaaaaaaaaaaaaaiayaaaaboaaa";
        int k = 3;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaayaaaabo", cyclemin.bestmod(s, k));
    }

    @Test
    public void case89() {
        String s = "avasdaaaaaaaaaaaaaaaaaaaazaanaaaiaaaaaaa";
        int k = 30;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", cyclemin.bestmod(s, k));
    }

    @Test
    public void case90() {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        int k = 2;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", cyclemin.bestmod(s, k));
    }

    @Test
    public void case91() {
        String s = "auaaaakaajaaaaaaaaaaaaabaaaaqaaagaaaiaaadajalaaaa";
        int k = 7;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadajal", cyclemin.bestmod(s, k));
    }

    @Test
    public void case92() {
        String s = "aaaavataalaaaaaaaaaaaearaaaadaaaaaaaaoacaaaraaaa";
        int k = 3;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaoacaaaraaaaaaaavataal", cyclemin.bestmod(s, k));
    }

    @Test
    public void case93() {
        String s = "aaaaaxaqaaaagaaaaataatyaaaaaaaaaaaaaaayaapaaaaaa";
        int k = 7;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaag", cyclemin.bestmod(s, k));
    }

    @Test
    public void case94() {
        String s = "raaaaaaaaaaaaaamaaaaaaaaaraaaaaaaaaaaaafalaaaaaa";
        int k = 1;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaraaaaaaaaaaaaafalaaaaaar", cyclemin.bestmod(s, k));
    }

    @Test
    public void case95() {
        String s = "aaaaahaaaaaaaabaaaaabaaaaaaaaazaaaaaaaaaaaaaaa";
        int k = 0;
        assertEquals("aaaaaaaaaaaaaaaaaaaahaaaaaaaabaaaaabaaaaaaaaaz", cyclemin.bestmod(s, k));
    }

    @Test
    public void case96() {
        String s = "aaaaaaaaaaaaaaaaaaaazaaaaaaaaaaaaaaaaaaaaaaaaaa";
        int k = 1;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", cyclemin.bestmod(s, k));
    }

    @Test
    public void case97() {
        String s = "aaaaa";
        int k = 4;
        assertEquals("aaaaa", cyclemin.bestmod(s, k));
    }

    @Test
    public void case98() {
        String s = "aaaaaaaaaaaaajaaaawcaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        int k = 2;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaac", cyclemin.bestmod(s, k));
    }

    @Test
    public void case99() {
        String s = "aacaaaaaaaaaaaaaaataaaaaaagaaawakaaaaaaaaaaaaau";
        int k = 1;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaagaaawakaaaaaaaaaaaaauaac", cyclemin.bestmod(s, k));
    }

    @Test
    public void case100() {
        String s = "aa";
        int k = 0;
        assertEquals("aa", cyclemin.bestmod(s, k));
    }

    @Test
    public void case101() {
        String s = "aaaanaaaaaaaacaaaaaaaadaasaaaaaaaaaaaaaaaaaaaaaama";
        int k = 17;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", cyclemin.bestmod(s, k));
    }

    @Test
    public void case102() {
        String s = "aaaaaaaaaa";
        int k = 4;
        assertEquals("aaaaaaaaaa", cyclemin.bestmod(s, k));
    }

    @Test
    public void case103() {
        String s = "aoaaaaaaaaafaaaaaaaa";
        int k = 6;
        assertEquals("aaaaaaaaaaaaaaaaaaaa", cyclemin.bestmod(s, k));
    }

    @Test
    public void case104() {
        String s = "aaaaaaaaaaaaaaaafaaaaaaaaaaaaaaalaaabaaaaaaaaaaa";
        int k = 1;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaalaaab", cyclemin.bestmod(s, k));
    }

    @Test
    public void case105() {
        String s = "aaaaaaaaaaaaaaaaaaaaaaa";
        int k = 6;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaa", cyclemin.bestmod(s, k));
    }

    @Test
    public void case106() {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        int k = 0;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", cyclemin.bestmod(s, k));
    }

    @Test
    public void case107() {
        String s = "abbzzzzc";
        int k = 4;
        assertEquals("aaaaabbz", cyclemin.bestmod(s, k));
    }

    @Test
    public void case108() {
        String s = "paai";
        int k = 1;
        assertEquals("aaai", cyclemin.bestmod(s, k));
    }

    @Test
    public void case109() {
        String s = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
        int k = 25;
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaazzzzzzzzzzzzzzzzzzzzzzzzz", cyclemin.bestmod(s, k));
    }

    @Test
    public void case110() {
        String s = "bbcbc";
        int k = 1;
        assertEquals("abbcb", cyclemin.bestmod(s, k));
    }

    @Test
    public void case111() {
        String s = "fdasfsadfdsfsfdsfsdfsdfsdddsfsdfsd";
        int k = 11;
        assertEquals("aaaaaaaaaaaaadfdsfsfdsfsdfsdfsddds", cyclemin.bestmod(s, k));
    }

    @Test
    public void case112() {
        String s = "s";
        int k = 1;
        assertEquals("a", cyclemin.bestmod(s, k));
    }

    @Test
    public void case113() {
        String s = "aab";
        int k = 2;
        assertEquals("aaa", cyclemin.bestmod(s, k));
    }

    @Test
    public void case114() {
        String s = "bac";
        int k = 0;
        assertEquals("acb", cyclemin.bestmod(s, k));
    }

    @Test
    public void case115() {
        String s = "aacaabbaa";
        int k = 1;
        assertEquals("aaaaaaabb", cyclemin.bestmod(s, k));
    }

    @Test
    public void case116() {
        String s = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
        int k = 0;
        assertEquals("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", cyclemin.bestmod(s, k));
    }

    @Test
    public void case117() {
        String s = "bavddeegfdsegaaaccvv";
        int k = 0;
        assertEquals("aaaccvvbavddeegfdseg", cyclemin.bestmod(s, k));
    }

    @Test
    public void case118() {
        String s = "aabbaba";
        int k = 1;
        assertEquals("aaaaabb", cyclemin.bestmod(s, k));
    }

    @Test
    public void case119() {
        String s = "z";
        int k = 0;
        assertEquals("z", cyclemin.bestmod(s, k));
    }

    @Test
    public void case120() {
        String s = "b";
        int k = 1;
        assertEquals("a", cyclemin.bestmod(s, k));
    }

    @Test
    public void case121() {
        String s = "a";
        int k = 1;
        assertEquals("a", cyclemin.bestmod(s, k));
    }

    @Test
    public void case122() {
        String s = "bac";
        int k = 1;
        assertEquals("aab", cyclemin.bestmod(s, k));
    }

    @Test
    public void case123() {
        String s = "zzbb";
        int k = 2;
        assertEquals("aabb", cyclemin.bestmod(s, k));
    }

    @Test
    public void case124() {
        String s = "azazazzzzzzzzzza";
        int k = 5;
        assertEquals("aaaaaaaaazzzzzzz", cyclemin.bestmod(s, k));
    }

    @Test
    public void case125() {
        String s = "zzaxazzzzzzz";
        int k = 1;
        assertEquals("aaazzzzzzzzz", cyclemin.bestmod(s, k));
    }

    @Test
    public void case126() {
        String s = "adcb";
        int k = 1;
        assertEquals("aacb", cyclemin.bestmod(s, k));
    }

    @Test
    public void case127() {
        String s = "zazbc";
        int k = 2;
        assertEquals("aaabc", cyclemin.bestmod(s, k));
    }

    @Test
    public void case128() {
        String s = "bwbbcc";
        int k = 1;
        assertEquals("abbccb", cyclemin.bestmod(s, k));
    }

}
