package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class IstrTest {
    Istr istr = new Istr();

    @Test
    public void case1() {
        String s = "aba";
        int k = 1;
        assertEquals(2, istr.count(s, k));
    }

    @Test
    public void case2() {
        String s = "abacaba";
        int k = 0;
        assertEquals(21, istr.count(s, k));
    }

    @Test
    public void case3() {
        String s = "abacaba";
        int k = 1;
        assertEquals(14, istr.count(s, k));
    }

    @Test
    public void case4() {
        String s = "abacaba";
        int k = 3;
        assertEquals(6, istr.count(s, k));
    }

    @Test
    public void case5() {
        String s = "abc";
        int k = 3;
        assertEquals(0, istr.count(s, k));
    }

    @Test
    public void case6() {
        String s = "wersrsresesrsesrawsdsw";
        int k = 11;
        assertEquals(23, istr.count(s, k));
    }

    @Test
    public void case7() {
        String s = "abababoabaobooobbbobabbaaobobooa";
        int k = 26;
        assertEquals(12, istr.count(s, k));
    }

    @Test
    public void case8() {
        String s = "ioaoeoqbkbhl";
        int k = 11;
        assertEquals(1, istr.count(s, k));
    }

    @Test
    public void case9() {
        String s = "oohlaefleecoookjkoippolm";
        int k = 13;
        assertEquals(11, istr.count(s, k));
    }

    @Test
    public void case10() {
        String s = "oarobokoi";
        int k = 4;
        assertEquals(5, istr.count(s, k));
    }

    @Test
    public void case11() {
        String s = "qpmhoiampnokkq";
        int k = 2;
        assertEquals(18, istr.count(s, k));
    }

    @Test
    public void case12() {
        String s = "bkkjlkiienhicedhoidjocbfgcoaajcaiojmknccoeogfnkc";
        int k = 18;
        assertEquals(64, istr.count(s, k));
    }

    @Test
    public void case13() {
        String s = "corbodtoktmgqopaqrotoqeqgcc";
        int k = 20;
        assertEquals(7, istr.count(s, k));
    }

    @Test
    public void case14() {
        String s = "aeefegaggcaffefogcbaeabbgcegebdfaaodgogacgeccaoaff";
        int k = 34;
        assertEquals(32, istr.count(s, k));
    }

    @Test
    public void case15() {
        String s = "fioooohdabgeceh";
        int k = 0;
        assertEquals(31, istr.count(s, k));
    }

    @Test
    public void case16() {
        String s = "oaaooaaaaooaoaaaoaaaoaaaaoaaaaoaaaoaaaaaoaaoaa";
        int k = 44;
        assertEquals(2, istr.count(s, k));
    }

    @Test
    public void case17() {
        String s = "jjhonkmdlofooiibnmlmeomjidljfgmdabcooflgiolaofdof";
        int k = 15;
        assertEquals(90, istr.count(s, k));
    }

    @Test
    public void case18() {
        String s = "caccbdbcbccooocobdoadaddboooddbaobdbobdccdcaadoca";
        int k = 14;
        assertEquals(245, istr.count(s, k));
    }

    @Test
    public void case19() {
        String s = "pldcn";
        int k = 3;
        assertEquals(2, istr.count(s, k));
    }

    @Test
    public void case20() {
        String s = "maoonescoqgalisojljkdookofjpelhmnhooqbodjio";
        int k = 0;
        assertEquals(191, istr.count(s, k));
    }

    @Test
    public void case21() {
        String s = "gossla";
        int k = 5;
        assertEquals(1, istr.count(s, k));
    }

    @Test
    public void case22() {
        String s = "occacdaadebofdaceabaoebeafodfocobb";
        int k = 27;
        assertEquals(7, istr.count(s, k));
    }

    @Test
    public void case23() {
        String s = "ofojoeumeosovav";
        int k = 5;
        assertEquals(12, istr.count(s, k));
    }

    @Test
    public void case24() {
        String s = "egfihiofckebebhofhogogjohieeoodco";
        int k = 27;
        assertEquals(6, istr.count(s, k));
    }

    @Test
    public void case25() {
        String s = "abbobobbbbbaaabbbbbaobaaabaabbaaaaaaboo";
        int k = 16;
        assertEquals(187, istr.count(s, k));
    }

    @Test
    public void case26() {
        String s = "horidknblooooreqkdgqrdlbdbf";
        int k = 19;
        assertEquals(8, istr.count(s, k));
    }

    @Test
    public void case27() {
        String s = "jeonkhmoibnkojlionoijlhdcgoooollnfomomlnojigjgmebo";
        int k = 21;
        assertEquals(67, istr.count(s, k));
    }

    @Test
    public void case28() {
        String s = "mrbjsorgedodhbrpngorrjigjbgpdspldinoohlgng";
        int k = 1;
        assertEquals(145, istr.count(s, k));
    }

    @Test
    public void case29() {
        String s = "oabboaobaaoaaaa";
        int k = 9;
        assertEquals(12, istr.count(s, k));
    }

    @Test
    public void case30() {
        String s = "aaoaaaaaaaaoaaaaaaaoaaooaaoo";
        int k = 1;
        assertEquals(449, istr.count(s, k));
    }

    @Test
    public void case31() {
        String s = "oddogcooojfkjoko";
        int k = 1;
        assertEquals(51, istr.count(s, k));
    }

    @Test
    public void case32() {
        String s = "kbbeoio";
        int k = 7;
        assertEquals(0, istr.count(s, k));
    }

    @Test
    public void case33() {
        String s = "ov";
        int k = 1;
        assertEquals(1, istr.count(s, k));
    }

    @Test
    public void case34() {
        String s = "aoadgbgoocbbfoabcoboffgbocebooooooedoabcohaghoff";
        int k = 34;
        assertEquals(24, istr.count(s, k));
    }

    @Test
    public void case35() {
        String s = "hbmgopcosfjmodcjnoamemorcoloiocbldbkkecobmhnoeio";
        int k = 12;
        assertEquals(86, istr.count(s, k));
    }

    @Test
    public void case36() {
        String s = "olfpogcnbqjleojqcoqmmoaoclbogfbjonhhlejooopleoncao";
        int k = 31;
        assertEquals(29, istr.count(s, k));
    }

    @Test
    public void case37() {
        String s = "bobbaacaobacabocccccb";
        int k = 16;
        assertEquals(7, istr.count(s, k));
    }

    @Test
    public void case38() {
        String s = "ofdaecabocffoccd";
        int k = 3;
        assertEquals(27, istr.count(s, k));
    }

    @Test
    public void case39() {
        String s = "odocohldmbegoogioglgbokoghiijkfgoh";
        int k = 4;
        assertEquals(100, istr.count(s, k));
    }

    @Test
    public void case40() {
        String s = "doofkcdjomobodcoldomooldokggoohonooojgllbohfi";
        int k = 33;
        assertEquals(12, istr.count(s, k));
    }

    @Test
    public void case41() {
        String s = "cdgkoo";
        int k = 4;
        assertEquals(2, istr.count(s, k));
    }

    @Test
    public void case42() {
        String s = "ad";
        int k = 0;
        assertEquals(2, istr.count(s, k));
    }

    @Test
    public void case43() {
        String s = "abbaaoababbaaabaaoaabbaaabbbobboaboabaoobaa";
        int k = 30;
        assertEquals(57, istr.count(s, k));
    }

    @Test
    public void case44() {
        String s = "oacflajhbjhaokdoiokeofoibohofaeokcio";
        int k = 1;
        assertEquals(151, istr.count(s, k));
    }

    @Test
    public void case45() {
        String s = "aaaaaaaaooaaoaaaaaaaaaaaaaaaaoaaoaaaaaoo";
        int k = 38;
        assertEquals(2, istr.count(s, k));
    }

    @Test
    public void case46() {
        String s = "gockhobobdfbjhifoffd";
        int k = 15;
        assertEquals(5, istr.count(s, k));
    }

    @Test
    public void case47() {
        String s = "oviooebliforooqtokjjnaecijmrotwroohcuoboolofxgmfeo";
        int k = 12;
        assertEquals(84, istr.count(s, k));
    }

    @Test
    public void case48() {
        String s = "adccccadacocdcoaddcbcacdodcdabcabbaodcb";
        int k = 2;
        assertEquals(307, istr.count(s, k));
    }

    @Test
    public void case49() {
        String s = "ogfoldjdlafofeogecgdkeodbdebkccohekkoogohbchc";
        int k = 22;
        assertEquals(47, istr.count(s, k));
    }

    @Test
    public void case50() {
        String s = "curnpqiaougmenowhoicjoomvukollpeuq";
        int k = 22;
        assertEquals(12, istr.count(s, k));
    }

    @Test
    public void case51() {
        String s = "eegabghdfbadgebdhcghgchaeohccefdchacfedofbgffc";
        int k = 1;
        assertEquals(241, istr.count(s, k));
    }

    @Test
    public void case52() {
        String s = "olblodnneflloaiodokocc";
        int k = 4;
        assertEquals(36, istr.count(s, k));
    }

    @Test
    public void case53() {
        String s = "aecaaaccacebbcoabcbocadodbeceb";
        int k = 22;
        assertEquals(12, istr.count(s, k));
    }

    @Test
    public void case54() {
        String s = "dftc";
        int k = 3;
        assertEquals(1, istr.count(s, k));
    }

    @Test
    public void case55() {
        String s = "ioeoigsoecltdmjppbefsoaapoobcnplooccsgoamoiqoafd";
        int k = 46;
        assertEquals(2, istr.count(s, k));
    }

    @Test
    public void case56() {
        String s = "bbdbbcabdoaaacoboobocdbcdccobaodaaoooaaaocbccc";
        int k = 35;
        assertEquals(25, istr.count(s, k));
    }

    @Test
    public void case57() {
        String s = "nvorjmjbdmhojbmtrltqialgaoervoobxopavroowfi";
        int k = 4;
        assertEquals(99, istr.count(s, k));
    }

    @Test
    public void case58() {
        String s = "cgdoodheacaafbaccgcbeohbebfaghdggcbefecg";
        int k = 36;
        assertEquals(4, istr.count(s, k));
    }

    @Test
    public void case59() {
        String s = "bbgdmcckmdcofgociookdohfjafoajlahfggfoglojiebcioi";
        int k = 25;
        assertEquals(44, istr.count(s, k));
    }

    @Test
    public void case60() {
        String s = "kolkbgodcjkaboogijaigojjaonioebmhcmnmljoaegkje";
        int k = 31;
        assertEquals(17, istr.count(s, k));
    }

    @Test
    public void case61() {
        String s = "afoiohjajokfeooibjfojjdhcjdeoeodfbiajoo";
        int k = 0;
        assertEquals(211, istr.count(s, k));
    }

    @Test
    public void case62() {
        String s = "oxnvfxwsjpoucnoaoocoaqwuioomjtmprpdopoowvopilso";
        int k = 13;
        assertEquals(68, istr.count(s, k));
    }

    @Test
    public void case63() {
        String s = "odakkcdbdifmoleldihloioajfhjbodioofacajddggjoioo";
        int k = 15;
        assertEquals(85, istr.count(s, k));
    }

    @Test
    public void case64() {
        String s = "dxltsjagbwciehqromko";
        int k = 7;
        assertEquals(13, istr.count(s, k));
    }

    @Test
    public void case65() {
        String s = "soxstirjudooogogkooe";
        int k = 10;
        assertEquals(10, istr.count(s, k));
    }

    @Test
    public void case66() {
        String s = "noapsleiophocoofooj";
        int k = 16;
        assertEquals(3, istr.count(s, k));
    }

    @Test
    public void case67() {
        String s = "ohmqooy";
        int k = 6;
        assertEquals(1, istr.count(s, k));
    }

    @Test
    public void case68() {
        String s = "oknonofqagisf";
        int k = 1;
        assertEquals(18, istr.count(s, k));
    }

    @Test
    public void case69() {
        String s = "fdijjibkioojojjakodjce";
        int k = 10;
        assertEquals(16, istr.count(s, k));
    }

    @Test
    public void case70() {
        String s = "ocfohchoefcfbgfocgbeo";
        int k = 13;
        assertEquals(10, istr.count(s, k));
    }

    @Test
    public void case71() {
        String s = "aqoqollodmjggokecklnoomopbc";
        int k = 25;
        assertEquals(2, istr.count(s, k));
    }

    @Test
    public void case72() {
        String s = "aeebjciioifobogoogiiicbadd";
        int k = 12;
        assertEquals(22, istr.count(s, k));
    }

    @Test
    public void case73() {
        String s = "diopg";
        int k = 0;
        assertEquals(5, istr.count(s, k));
    }

    @Test
    public void case74() {
        String s = "opjojolpdnoggneeajicmikcobonjcoojhnbonedlckhoooio";
        int k = 38;
        assertEquals(11, istr.count(s, k));
    }

    @Test
    public void case75() {
        String s = "daecedbhgbodabhoooobacfefbhgchfe";
        int k = 2;
        assertEquals(104, istr.count(s, k));
    }

    @Test
    public void case76() {
        String s = "qaooqououvogdpsajaoslnuobou";
        int k = 19;
        assertEquals(8, istr.count(s, k));
    }

    @Test
    public void case77() {
        String s = "cnkggdnhgoeb";
        int k = 11;
        assertEquals(1, istr.count(s, k));
    }

    @Test
    public void case78() {
        String s = "bofoaagdddoefbooadfodgooodobffebcgoeaae";
        int k = 36;
        assertEquals(3, istr.count(s, k));
    }

    @Test
    public void case79() {
        String s = "eyonwvbtkmdayeokiobpkpymomfgcnosfqooogopfymgrdlkot";
        int k = 47;
        assertEquals(3, istr.count(s, k));
    }

    @Test
    public void case80() {
        String s = "oefogejeoaofobffjcadaobdjiohcdfbcdobcfgbfcheejac";
        int k = 15;
        assertEquals(109, istr.count(s, k));
    }

    @Test
    public void case81() {
        String s = "ldbdhkhmlnjjomooed";
        int k = 6;
        assertEquals(16, istr.count(s, k));
    }

    @Test
    public void case82() {
        String s = "ooocdbadcadocabddoabacddaaacacdaobc";
        int k = 32;
        assertEquals(3, istr.count(s, k));
    }

    @Test
    public void case83() {
        String s = "ftpcopajodywgoobscaycucvlrqpfxjtopx";
        int k = 35;
        assertEquals(0, istr.count(s, k));
    }

    @Test
    public void case84() {
        String s = "bdlcignokifoooanomnocoipoepboiaacbhnojococfpmaakkj";
        int k = 19;
        assertEquals(69, istr.count(s, k));
    }

    @Test
    public void case85() {
        String s = "abc";
        int k = 2;
        assertEquals(1, istr.count(s, k));
    }

    @Test
    public void case86() {
        String s = "cbflabeeggogomeje";
        int k = 16;
        assertEquals(1, istr.count(s, k));
    }

    @Test
    public void case87() {
        String s = "baocbbaaobacb";
        int k = 2;
        assertEquals(33, istr.count(s, k));
    }

    @Test
    public void case88() {
        String s = "aaedddaaoebodadeedaecbdeadcdddd";
        int k = 5;
        assertEquals(146, istr.count(s, k));
    }

    @Test
    public void case89() {
        String s = "beneooalctmo";
        int k = 0;
        assertEquals(20, istr.count(s, k));
    }

    @Test
    public void case90() {
        String s = "efeooacboafodobcfdococcocfcfebefeo";
        int k = 23;
        assertEquals(19, istr.count(s, k));
    }

    @Test
    public void case91() {
        String s = "begdcggdccfcooehoocgoegfocbgfdoghcghgehchoeoofaoao";
        int k = 8;
        assertEquals(230, istr.count(s, k));
    }

    @Test
    public void case92() {
        String s = "lobghjgolkieodoiooicoinoceclidhjfoodk";
        int k = 21;
        assertEquals(22, istr.count(s, k));
    }

    @Test
    public void case93() {
        String s = "aibedfeieaohiiia";
        int k = 13;
        assertEquals(3, istr.count(s, k));
    }

    @Test
    public void case94() {
        String s = "bahoohfohgcdooeogebohgoeofooacdogogg";
        int k = 10;
        assertEquals(86, istr.count(s, k));
    }

    @Test
    public void case95() {
        String s = "fibdeoohgfdoojjfaoccfooifoojobcacfogbocjhicfg";
        int k = 19;
        assertEquals(66, istr.count(s, k));
    }

    @Test
    public void case96() {
        String s = "bobbboaabbaaaoaoabbooaabbb";
        int k = 15;
        assertEquals(41, istr.count(s, k));
    }

    @Test
    public void case97() {
        String s = "cobaccabaabaabbbababocbocb";
        int k = 7;
        assertEquals(95, istr.count(s, k));
    }

    @Test
    public void case98() {
        String s = "coofbcoccaghdaoaoeochoeaodooodeocdabifoaoeboo";
        int k = 40;
        assertEquals(5, istr.count(s, k));
    }

    @Test
    public void case99() {
        String s = "bbobabobbbobbbbaaabcocabbaabcccbccobacoo";
        int k = 9;
        assertEquals(241, istr.count(s, k));
    }

    @Test
    public void case100() {
        String s = "ooebloorooqnbrioodkdqroooblqgopofmplklbomooocrfdao";
        int k = 3;
        assertEquals(313, istr.count(s, k));
    }

    @Test
    public void case101() {
        String s = "kkohhldaefpkoosgkoooopces";
        int k = 23;
        assertEquals(2, istr.count(s, k));
    }

    @Test
    public void case102() {
        String s = "solocnsceijomomf";
        int k = 3;
        assertEquals(19, istr.count(s, k));
    }

    @Test
    public void case103() {
        String s = "agogceoffgbeoodaecaccbobodbbobbgoodcoofocggdofgga";
        int k = 45;
        assertEquals(4, istr.count(s, k));
    }

    @Test
    public void case104() {
        String s = "efhd";
        int k = 3;
        assertEquals(1, istr.count(s, k));
    }

    @Test
    public void case105() {
        String s = "shoqamtooi";
        int k = 3;
        assertEquals(7, istr.count(s, k));
    }

    @Test
    public void case106() {
        String s = "olhoologkfiommcnggfhdoeeno";
        int k = 9;
        assertEquals(27, istr.count(s, k));
    }

    @Test
    public void case107() {
        String s = "nlhfhhooblsauasioooolmpovooexhtoypjoueo";
        int k = 3;
        assertEquals(136, istr.count(s, k));
    }

    @Test
    public void case108() {
        String s = "cdbbabaacdbaeaeocbbbeb";
        int k = 13;
        assertEquals(15, istr.count(s, k));
    }

    @Test
    public void case109() {
        String s = "uurleoooemobhfhloorponh";
        int k = 14;
        assertEquals(9, istr.count(s, k));
    }

    @Test
    public void case110() {
        String s = "cgoffcedcdaeadgdfoafadagafoadofceadbgcecdcoobb";
        int k = 3;
        assertEquals(247, istr.count(s, k));
    }

    @Test
    public void case111() {
        String s = "klfohghoco";
        int k = 10;
        assertEquals(0, istr.count(s, k));
    }

    @Test
    public void case112() {
        String s = "diaoohbaojoedcfgacoejajcofaj";
        int k = 28;
        assertEquals(0, istr.count(s, k));
    }

    @Test
    public void case113() {
        String s = "qmfkqohonagpoqjo";
        int k = 4;
        assertEquals(14, istr.count(s, k));
    }

    @Test
    public void case114() {
        String s = "qqqqqnqqiqzqiqqqiqqqqzqkjpsqqjqqqy";
        int k = 20;
        assertEquals(26, istr.count(s, k));
    }

    @Test
    public void case115() {
        String s = "zpzqqqqqtpxqiqxu";
        int k = 12;
        assertEquals(4, istr.count(s, k));
    }

    @Test
    public void case116() {
        String s = "qiqffqqqqedquqqqfiqxqii";
        int k = 21;
        assertEquals(2, istr.count(s, k));
    }

    @Test
    public void case117() {
        String s = "kqpqqqqisqqhqqqiniq";
        int k = 19;
        assertEquals(0, istr.count(s, k));
    }

    @Test
    public void case118() {
        String s = "iqqqiqrqmiiqsiggqiqqqiqqsqq";
        int k = 6;
        assertEquals(123, istr.count(s, k));
    }

    @Test
    public void case119() {
        String s = "qyqdqzqqqqwqqqqqitqqqqiqwqiqqqipmiqbkhqvqiq";
        int k = 21;
        assertEquals(64, istr.count(s, k));
    }

    @Test
    public void case120() {
        String s = "qqxwyqixqwqzqxqqzqqyqiyxqyqqiqqqqiqqqqzwiy";
        int k = 28;
        assertEquals(34, istr.count(s, k));
    }

    @Test
    public void case121() {
        String s = "qiqtqqkqikxqs";
        int k = 8;
        assertEquals(5, istr.count(s, k));
    }

    @Test
    public void case122() {
        String s = "qqlniqdhdiqqiqq";
        int k = 2;
        assertEquals(41, istr.count(s, k));
    }

    @Test
    public void case123() {
        String s = "qzqiqqzzqqqqzqqqyqiyzqiz";
        int k = 3;
        assertEquals(149, istr.count(s, k));
    }

    @Test
    public void case124() {
        String s = "qqqzqizzqziqqqqqzqzz";
        int k = 8;
        assertEquals(54, istr.count(s, k));
    }

    @Test
    public void case125() {
        String s = "qiiqqzwywqqvqiqiqiiiqziqxiiqvqzzxyqviqqqwq";
        int k = 23;
        assertEquals(53, istr.count(s, k));
    }

    @Test
    public void case126() {
        String s = "qqquixqqqiqqqiq";
        int k = 3;
        assertEquals(60, istr.count(s, k));
    }

    @Test
    public void case127() {
        String s = "kqqnjqiqtwqhquqnqqqqqoqiiqqiqqqqqqmqdqqmiqiqvnu";
        int k = 3;
        assertEquals(590, istr.count(s, k));
    }

    @Test
    public void case128() {
        String s = "qr";
        int k = 2;
        assertEquals(0, istr.count(s, k));
    }

    @Test
    public void case129() {
        String s = "iq";
        int k = 1;
        assertEquals(1, istr.count(s, k));
    }

    @Test
    public void case130() {
        String s = "itqq";
        int k = 1;
        assertEquals(3, istr.count(s, k));
    }

    @Test
    public void case131() {
        String s = "qqqqiqtiwqqxqqqqqq";
        int k = 8;
        assertEquals(32, istr.count(s, k));
    }

    @Test
    public void case132() {
        String s = "qqiqspzqnixyqqsipiit";
        int k = 11;
        assertEquals(9, istr.count(s, k));
    }

    @Test
    public void case133() {
        String s = "qqxqwqqq";
        int k = 8;
        assertEquals(0, istr.count(s, k));
    }

    @Test
    public void case134() {
        String s = "xqqqqqyqtqqqe";
        int k = 12;
        assertEquals(1, istr.count(s, k));
    }

    @Test
    public void case135() {
        String s = "wqqqovqpqqoqqqhqwqqirqrqigqqlrqyi";
        int k = 33;
        assertEquals(0, istr.count(s, k));
    }

    @Test
    public void case136() {
        String s = "jmizlqqqqqqgqiiqiiqqqqqqqivqqijiqqiqqzqqiikku";
        int k = 27;
        assertEquals(42, istr.count(s, k));
    }

    @Test
    public void case137() {
        String s = "sqofqqqqqq";
        int k = 9;
        assertEquals(1, istr.count(s, k));
    }

    @Test
    public void case138() {
        String s = "iqtq";
        int k = 0;
        assertEquals(6, istr.count(s, k));
    }

    @Test
    public void case139() {
        String s = "xfqqmuqiaaqqqqiiqiqndtyiqeiqquiqqiqqimqqaiop";
        int k = 4;
        assertEquals(322, istr.count(s, k));
    }

    @Test
    public void case140() {
        String s = "qsitiiqt";
        int k = 1;
        assertEquals(13, istr.count(s, k));
    }

    @Test
    public void case141() {
        String s = "qqzqqiizqqiqzzzzziqziqqqqiq";
        int k = 12;
        assertEquals(75, istr.count(s, k));
    }

    @Test
    public void case142() {
        String s = "qqtsituqqqqiqiiiqsqvy";
        int k = 2;
        assertEquals(85, istr.count(s, k));
    }

    @Test
    public void case143() {
        String s = "rqqqyqqqivqzqqqqvqqpxqqqqqqpiqqqqqpsqtqqsqqrtqq";
        int k = 33;
        assertEquals(22, istr.count(s, k));
    }

    @Test
    public void case144() {
        String s = "qzyqqiqqqqiqiiqqqqqqqvyvqzviiqiyqyqziqqqvvqi";
        int k = 11;
        assertEquals(275, istr.count(s, k));
    }

    @Test
    public void case145() {
        String s = "qziqiqrqqsqiisvivqutqq";
        int k = 18;
        assertEquals(4, istr.count(s, k));
    }

    @Test
    public void case146() {
        String s = "qqqiqqwqqiqqqwqqqqi";
        int k = 18;
        assertEquals(1, istr.count(s, k));
    }

    @Test
    public void case147() {
        String s = "iqqyqiqqpiiqiqgqiquqvqiqqvqhqqqqz";
        int k = 4;
        assertEquals(255, istr.count(s, k));
    }

    @Test
    public void case148() {
        String s = "qmrqtqzqisqiiqqqiqqqzlqiqiqiqyqiqqqiqqilq";
        int k = 30;
        assertEquals(15, istr.count(s, k));
    }

    @Test
    public void case149() {
        String s = "qvqpqqqqqqxyqqrqqiqit";
        int k = 2;
        assertEquals(131, istr.count(s, k));
    }

    @Test
    public void case150() {
        String s = "eqqngomiqmmqjgqimqqqmqiqiqqqxitvqqiy";
        int k = 19;
        assertEquals(29, istr.count(s, k));
    }

    @Test
    public void case151() {
        String s = "qqqqqqqqyqq";
        int k = 3;
        assertEquals(50, istr.count(s, k));
    }

    @Test
    public void case152() {
        String s = "qiiqiehqqqqztqqqmgseqqqquqiqiiliqqkiqqquiq";
        int k = 13;
        assertEquals(161, istr.count(s, k));
    }

    @Test
    public void case153() {
        String s = "yqqqtqqqqqpuoqqqvqrrwziztqqrqqoiqzqqoqmqquqzuiqvni";
        int k = 44;
        assertEquals(6, istr.count(s, k));
    }

    @Test
    public void case154() {
        String s = "yzqqqxiqqyyzqqiqyqiyyxiqqxqzqqqyqqyqqqxqqiqqzqzz";
        int k = 32;
        assertEquals(52, istr.count(s, k));
    }

    @Test
    public void case155() {
        String s = "qqqpiiqiiqqgyiqsqqqqqqqjqvqxquiuq";
        int k = 17;
        assertEquals(36, istr.count(s, k));
    }

    @Test
    public void case156() {
        String s = "kqqqpqqjizpiqmqiiqqquqqwpm";
        int k = 25;
        assertEquals(1, istr.count(s, k));
    }

    @Test
    public void case157() {
        String s = "qqqqiiqiiqqvq";
        int k = 0;
        assertEquals(81, istr.count(s, k));
    }

    @Test
    public void case158() {
        String s = "uqwiqqqqqrzqqqqqrqiiiqqqqqqq";
        int k = 2;
        assertEquals(312, istr.count(s, k));
    }

    @Test
    public void case159() {
        String s = "sqisniirniqqiqpqjqzpqqqiqnqqqqqiqbsnkijqqiqqqqi";
        int k = 14;
        assertEquals(199, istr.count(s, k));
    }

    @Test
    public void case160() {
        String s = "qqixqqhiqtqqqnioqiiqqqjiqq";
        int k = 7;
        assertEquals(91, istr.count(s, k));
    }

    @Test
    public void case161() {
        String s = "uqqqwqqqjqiqlzqqqqqqi";
        int k = 14;
        assertEquals(7, istr.count(s, k));
    }

    @Test
    public void case162() {
        String s = "zqqqyiziqqqyiiqqzqyiyqqyz";
        int k = 3;
        assertEquals(130, istr.count(s, k));
    }

    @Test
    public void case163() {
        String s = "mqqtqqqqzqvqriqqqimqqippq";
        int k = 24;
        assertEquals(1, istr.count(s, k));
    }

    @Test
    public void case164() {
        String s = "sqiqqqqrmpqqeqqqqqgiqiqdqqdqqqqqqkqwqqt";
        int k = 31;
        assertEquals(8, istr.count(s, k));
    }

    @Test
    public void case165() {
        String s = "iqr";
        int k = 3;
        assertEquals(0, istr.count(s, k));
    }

    @Test
    public void case166() {
        String s = "wqxyxwqqxiyqqiqqiqqqqiq";
        int k = 19;
        assertEquals(4, istr.count(s, k));
    }

    @Test
    public void case167() {
        String s = "qqqmqjqqklkpq";
        int k = 9;
        assertEquals(4, istr.count(s, k));
    }

    @Test
    public void case168() {
        String s = "iuqqdqxmyiqqqqqqqiyjqinqimq";
        int k = 15;
        assertEquals(18, istr.count(s, k));
    }

    @Test
    public void case169() {
        String s = "qwziqqqiyqqiiq";
        int k = 12;
        assertEquals(2, istr.count(s, k));
    }

    @Test
    public void case170() {
        String s = "iqqqzxme";
        int k = 3;
        assertEquals(5, istr.count(s, k));
    }

    @Test
    public void case171() {
        String s = "yqpqssqszowzq";
        int k = 3;
        assertEquals(16, istr.count(s, k));
    }

    @Test
    public void case172() {
        String s = "qqqqiiqiqoqqnqqwqiqqiqqq";
        int k = 13;
        assertEquals(35, istr.count(s, k));
    }

    @Test
    public void case173() {
        String s = "isqqrioq";
        int k = 3;
        assertEquals(5, istr.count(s, k));
    }

    @Test
    public void case174() {
        String s = "iiiqqiqqqzqqzqi";
        int k = 10;
        assertEquals(9, istr.count(s, k));
    }

    @Test
    public void case175() {
        String s = "zzqqqiyzqqqzqzqqiyyzqyzqq";
        int k = 25;
        assertEquals(0, istr.count(s, k));
    }

    @Test
    public void case176() {
        String s = "qvwiiiqxwquixy";
        int k = 13;
        assertEquals(1, istr.count(s, k));
    }

    @Test
    public void case177() {
        String s = "qqqqqzzqiqqqziqzqiqqqqzq";
        int k = 22;
        assertEquals(2, istr.count(s, k));
    }

    @Test
    public void case178() {
        String s = "qqqqq";
        int k = 1;
        assertEquals(16, istr.count(s, k));
    }

    @Test
    public void case179() {
        String s = "qqiqiqqzqqqxiwqqqxxwwqqqqwziqqwxq";
        int k = 28;
        assertEquals(5, istr.count(s, k));
    }

    @Test
    public void case180() {
        String s = "qqqgiiqqvqqiimiaiqwiiq";
        int k = 21;
        assertEquals(1, istr.count(s, k));
    }

    @Test
    public void case181() {
        String s = "aaabbb";
        int k = 3;
        assertEquals(5, istr.count(s, k));
    }

    @Test
    public void case182() {
        String s = "aaabbb";
        int k = 6;
        assertEquals(0, istr.count(s, k));
    }

    @Test
    public void case183() {
        String s = "aaaaaaaaaa";
        int k = 3;
        assertEquals(49, istr.count(s, k));
    }

    @Test
    public void case184() {
        String s = "abbbccc";
        int k = 3;
        assertEquals(6, istr.count(s, k));
    }

    @Test
    public void case185() {
        String s = "aaaaabbbbbccccc";
        int k = 5;
        assertEquals(34, istr.count(s, k));
    }

    @Test
    public void case186() {
        String s = "waefawefdz";
        int k = 4;
        assertEquals(6, istr.count(s, k));
    }

    @Test
    public void case187() {
        String s = "aaaa";
        int k = 4;
        assertEquals(0, istr.count(s, k));
    }

    @Test
    public void case188() {
        String s = "aaaaaaabbv";
        int k = 3;
        assertEquals(21, istr.count(s, k));
    }

    @Test
    public void case189() {
        String s = "aaaabbbbccd";
        int k = 4;
        assertEquals(13, istr.count(s, k));
    }

    @Test
    public void case190() {
        String s = "abcdeabcdabcdeabcdabcdeabcdabcdeabcdeeeeabcdeabcde";
        int k = 50;
        assertEquals(0, istr.count(s, k));
    }

    @Test
    public void case191() {
        String s = "aaaabbbbcccc";
        int k = 4;
        assertEquals(22, istr.count(s, k));
    }

    @Test
    public void case192() {
        String s = "aaaaaaaaaaaaaaa";
        int k = 3;
        assertEquals(144, istr.count(s, k));
    }

    @Test
    public void case193() {
        String s = "aaaaabbbbb";
        int k = 2;
        assertEquals(32, istr.count(s, k));
    }

    @Test
    public void case194() {
        String s = "aabbbbcccccc";
        int k = 5;
        assertEquals(17, istr.count(s, k));
    }

    @Test
    public void case195() {
        String s = "aabbccddeeff";
        int k = 2;
        assertEquals(18, istr.count(s, k));
    }

    @Test
    public void case196() {
        String s = "zzzzzzzzzzza";
        int k = 3;
        assertEquals(65, istr.count(s, k));
    }

    @Test
    public void case197() {
        String s = "aaabbbb";
        int k = 4;
        assertEquals(5, istr.count(s, k));
    }

    @Test
    public void case198() {
        String s = "aaaaaaasssssssdddddddd";
        int k = 11;
        assertEquals(41, istr.count(s, k));
    }

    @Test
    public void case199() {
        String s = "aaabbb";
        int k = 2;
        assertEquals(8, istr.count(s, k));
    }

    @Test
    public void case200() {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        int k = 30;
        assertEquals(400, istr.count(s, k));
    }

    @Test
    public void case201() {
        String s = "ababababababababa";
        int k = 4;
        assertEquals(85, istr.count(s, k));
    }

    @Test
    public void case202() {
        String s = "aaaaaaaa";
        int k = 0;
        assertEquals(64, istr.count(s, k));
    }

    @Test
    public void case203() {
        String s = "aabb";
        int k = 2;
        assertEquals(2, istr.count(s, k));
    }

    @Test
    public void case204() {
        String s = "dhgahjdgjagdjagjdgajdgajhdgjhgdhjagdjhagdjhag";
        int k = 13;
        assertEquals(206, istr.count(s, k));
    }

    @Test
    public void case205() {
        String s = "abcdezzzzzzz";
        int k = 4;
        assertEquals(14, istr.count(s, k));
    }

}
