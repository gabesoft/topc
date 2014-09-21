package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class SwappingDigitsTest {
    SwappingDigits swappingdigits = new SwappingDigits();

    @Test
    public void case1() {
        String num = "596";
        assertEquals("569", swappingdigits.minNumber(num));
    }

    @Test
    public void case2() {
        String num = "93561";
        assertEquals("13569", swappingdigits.minNumber(num));
    }

    @Test
    public void case3() {
        String num = "5491727514";
        assertEquals("1491727554", swappingdigits.minNumber(num));
    }

    @Test
    public void case4() {
        String num = "78326141480732117541253865198971";
        assertEquals("18326141480732117541253865198977", swappingdigits.minNumber(num));
    }

    @Test
    public void case5() {
        String num = "539613437590740162597117122494746412";
        assertEquals("139613437590740162597117122494746452", swappingdigits.minNumber(num));
    }

    @Test
    public void case6() {
        String num = "36854862076732652850188638348854194974";
        assertEquals("16854862076732652850188638348854394974", swappingdigits.minNumber(num));
    }

    @Test
    public void case7() {
        String num = "994942081261163258228432722866534327414995";
        assertEquals("194942081261163258228432722866534327494995", swappingdigits.minNumber(num));
    }

    @Test
    public void case8() {
        String num = "7150583813462791777247915861685";
        assertEquals("1150583813462791777247915867685", swappingdigits.minNumber(num));
    }

    @Test
    public void case9() {
        String num = "36391617694992986009017818594972540252895687092";
        assertEquals("16391617694992986009017838594972540252895687092", swappingdigits.minNumber(num));
    }

    @Test
    public void case10() {
        String num = "954236034166845974118864218179215850485036393405";
        assertEquals("154236034166845974118864218179295850485036393405", swappingdigits.minNumber(num));
    }

    @Test
    public void case11() {
        String num = "45555042365433402465122354810934569";
        assertEquals("15555042365433402465122354840934569", swappingdigits.minNumber(num));
    }

    @Test
    public void case12() {
        String num = "6483181299987229153917934607933902016";
        assertEquals("1483181299987229153917934607933902066", swappingdigits.minNumber(num));
    }

    @Test
    public void case13() {
        String num = "462862390464985240311821348406097468";
        assertEquals("162862390464985240311824348406097468", swappingdigits.minNumber(num));
    }

    @Test
    public void case14() {
        String num = "893492715348101644796813175643932778";
        assertEquals("193492715348101644796813875643932778", swappingdigits.minNumber(num));
    }

    @Test
    public void case15() {
        String num = "11720376171328422763213753122612211005355347503";
        assertEquals("10720376171328422763213753122612211005355347513", swappingdigits.minNumber(num));
    }

    @Test
    public void case16() {
        String num = "1297866953311623818166341429500";
        assertEquals("1097866953311623818166341429502", swappingdigits.minNumber(num));
    }

    @Test
    public void case17() {
        String num = "598451791559881800463605525442188610";
        assertEquals("198451791559881800463605525442188650", swappingdigits.minNumber(num));
    }

    @Test
    public void case18() {
        String num = "459549922864227144939025468310380476785261";
        assertEquals("159549922864227144939025468310380476785264", swappingdigits.minNumber(num));
    }

    @Test
    public void case19() {
        String num = "316751704763505536943105571098965";
        assertEquals("116751704763505536943105573098965", swappingdigits.minNumber(num));
    }

    @Test
    public void case20() {
        String num = "3751871440781599237725612512526693451";
        assertEquals("1751871440781599237725612512526693453", swappingdigits.minNumber(num));
    }

    @Test
    public void case21() {
        String num = "942960713931942273394094015055851889";
        assertEquals("142960713931942273394094015055859889", swappingdigits.minNumber(num));
    }

    @Test
    public void case22() {
        String num = "432650343265067761784140107946470397";
        assertEquals("132650343265067761784140407946470397", swappingdigits.minNumber(num));
    }

    @Test
    public void case23() {
        String num = "46127663559955625889931346652686759562020";
        assertEquals("16127663559955625889934346652686759562020", swappingdigits.minNumber(num));
    }

    @Test
    public void case24() {
        String num = "838768742511426649075898057176729961960525577989";
        assertEquals("138768742511426649075898057176729968960525577989", swappingdigits.minNumber(num));
    }

    @Test
    public void case25() {
        String num = "532937600610387101104824918284920899993";
        assertEquals("132937600610387101104824958284920899993", swappingdigits.minNumber(num));
    }

    @Test
    public void case26() {
        String num = "55009163422707646424166083122005";
        assertEquals("15009163422707646424166083522005", swappingdigits.minNumber(num));
    }

    @Test
    public void case27() {
        String num = "813568794934025880007557363803364017";
        assertEquals("113568794934025880007557363803364087", swappingdigits.minNumber(num));
    }

    @Test
    public void case28() {
        String num = "63833913450710484842946353940486700773885276487222";
        assertEquals("13833913450760484842946353940486700773885276487222", swappingdigits.minNumber(num));
    }

    @Test
    public void case29() {
        String num = "77320125235249335515647334121079293975424046205871";
        assertEquals("17320125235249335515647334121079293975424046205877", swappingdigits.minNumber(num));
    }

    @Test
    public void case30() {
        String num = "76290819591822658282453103067111489252225189743736";
        assertEquals("16290819591822658282453103067111489252225789743736", swappingdigits.minNumber(num));
    }

    @Test
    public void case31() {
        String num = "40529018529032856171469378738078974758";
        assertEquals("10529018529032856174469378738078974758", swappingdigits.minNumber(num));
    }

    @Test
    public void case32() {
        String num = "50764734468352471155877281952502862915";
        assertEquals("10764734468352471155877281952502862955", swappingdigits.minNumber(num));
    }

    @Test
    public void case33() {
        String num = "6625120826766928550986378221475954046770714594000";
        assertEquals("1625120826766928550986378221475954046770764594000", swappingdigits.minNumber(num));
    }

    @Test
    public void case34() {
        String num = "110000000000000000000000000000000000000000000000";
        assertEquals("100000000000000000000000000000000000000000000001", swappingdigits.minNumber(num));
    }

    @Test
    public void case35() {
        String num = "1100000000000000000000000000000000000000000000002";
        assertEquals("1000000000000000000000000000000000000000000000012", swappingdigits.minNumber(num));
    }

    @Test
    public void case36() {
        String num = "10234";
        assertEquals("10234", swappingdigits.minNumber(num));
    }

    @Test
    public void case37() {
        String num = "93218910471211292416";
        assertEquals("13218910471211292496", swappingdigits.minNumber(num));
    }

    @Test
    public void case38() {
        String num = "33333333333333333333478477835743436664644";
        assertEquals("33333333333333333333378477835743446664644", swappingdigits.minNumber(num));
    }

    @Test
    public void case39() {
        String num = "33333333333333333333444759965754547464896";
        assertEquals("33333333333333333333444459965754547467896", swappingdigits.minNumber(num));
    }

    @Test
    public void case40() {
        String num = "3333333333333333333339565585969979334859739";
        assertEquals("3333333333333333333333565585969979334859799", swappingdigits.minNumber(num));
    }

    @Test
    public void case41() {
        String num = "22222222222222222222222225566478683928657877384675";
        assertEquals("22222222222222222222222222566478683958657877384675", swappingdigits.minNumber(num));
    }

    @Test
    public void case42() {
        String num = "1111111111111111111111638222155878694189493";
        assertEquals("1111111111111111111111138222155878694689493", swappingdigits.minNumber(num));
    }

    @Test
    public void case43() {
        String num = "11111111111111111111111112387951169272176189485768";
        assertEquals("11111111111111111111111111387951169272176289485768", swappingdigits.minNumber(num));
    }

    @Test
    public void case44() {
        String num = "333333333333333333333576858996655667763499";
        assertEquals("333333333333333333333376858996655667765499", swappingdigits.minNumber(num));
    }

    @Test
    public void case45() {
        String num = "111111111111111111111282968942251896891157";
        assertEquals("111111111111111111111182968942251896891257", swappingdigits.minNumber(num));
    }

    @Test
    public void case46() {
        String num = "33333333333333333333978863799385684344676";
        assertEquals("33333333333333333333378863799385684944676", swappingdigits.minNumber(num));
    }

    @Test
    public void case47() {
        String num = "1111111111111111111111111551121583579914617455348";
        assertEquals("1111111111111111111111111151121583579914657455348", swappingdigits.minNumber(num));
    }

    @Test
    public void case48() {
        String num = "222222222222222222222222297873593235779839744389";
        assertEquals("222222222222222222222222227873593935779839744389", swappingdigits.minNumber(num));
    }

    @Test
    public void case49() {
        String num = "2222222222222222222222224799568743885552894993442";
        assertEquals("2222222222222222222222222799568743885552894993444", swappingdigits.minNumber(num));
    }

    @Test
    public void case50() {
        String num = "2222222222222222222222228685334629627663642248";
        assertEquals("2222222222222222222222222685334629627663642848", swappingdigits.minNumber(num));
    }

    @Test
    public void case51() {
        String num = "1111111111111111111111159821798465418189176678";
        assertEquals("1111111111111111111111119821798465418189576678", swappingdigits.minNumber(num));
    }

    @Test
    public void case52() {
        String num = "111111111111111111111143752377853946629846695";
        assertEquals("111111111111111111111123752377853946649846695", swappingdigits.minNumber(num));
    }

    @Test
    public void case53() {
        String num = "222222222222222222222222443839763396659933997327";
        assertEquals("222222222222222222222222243839763396659933997347", swappingdigits.minNumber(num));
    }

    @Test
    public void case54() {
        String num = "33333333333333333333333339678754795693989646484984";
        assertEquals("33333333333333333333333333678754795699989646484984", swappingdigits.minNumber(num));
    }

    @Test
    public void case55() {
        String num = "3333333333333333333333347733863895848476454449";
        assertEquals("3333333333333333333333337733864895848476454449", swappingdigits.minNumber(num));
    }

    @Test
    public void case56() {
        String num = "2222222222222222222222226867882774696898476264944";
        assertEquals("2222222222222222222222222867882774696898476664944", swappingdigits.minNumber(num));
    }

    @Test
    public void case57() {
        String num = "11111111111111111111111113978423362722165426178932";
        assertEquals("11111111111111111111111111978423362722165426378932", swappingdigits.minNumber(num));
    }

    @Test
    public void case58() {
        String num = "12345678921";
        assertEquals("11345678922", swappingdigits.minNumber(num));
    }

    @Test
    public void case59() {
        String num = "12364895";
        assertEquals("12346895", swappingdigits.minNumber(num));
    }

    @Test
    public void case60() {
        String num = "1234325475686798678976867867";
        assertEquals("1224335475686798678976867867", swappingdigits.minNumber(num));
    }

    @Test
    public void case61() {
        String num = "110";
        assertEquals("101", swappingdigits.minNumber(num));
    }

    @Test
    public void case62() {
        String num = "1203";
        assertEquals("1023", swappingdigits.minNumber(num));
    }

    @Test
    public void case63() {
        String num = "1403";
        assertEquals("1043", swappingdigits.minNumber(num));
    }

    @Test
    public void case64() {
        String num = "1040667";
        assertEquals("1004667", swappingdigits.minNumber(num));
    }

    @Test
    public void case65() {
        String num = "1023450";
        assertEquals("1003452", swappingdigits.minNumber(num));
    }

    @Test
    public void case66() {
        String num = "190";
        assertEquals("109", swappingdigits.minNumber(num));
    }

    @Test
    public void case67() {
        String num = "1101";
        assertEquals("1011", swappingdigits.minNumber(num));
    }

    @Test
    public void case68() {
        String num = "9199009911";
        assertEquals("1199009919", swappingdigits.minNumber(num));
    }

    @Test
    public void case69() {
        String num = "1090";
        assertEquals("1009", swappingdigits.minNumber(num));
    }

    @Test
    public void case70() {
        String num = "120111";
        assertEquals("102111", swappingdigits.minNumber(num));
    }

    @Test
    public void case71() {
        String num = "110234";
        assertEquals("101234", swappingdigits.minNumber(num));
    }

    @Test
    public void case72() {
        String num = "1520";
        assertEquals("1025", swappingdigits.minNumber(num));
    }

    @Test
    public void case73() {
        String num = "120";
        assertEquals("102", swappingdigits.minNumber(num));
    }

    @Test
    public void case74() {
        String num = "101";
        assertEquals("101", swappingdigits.minNumber(num));
    }

    @Test
    public void case75() {
        String num = "390";
        assertEquals("309", swappingdigits.minNumber(num));
    }

    @Test
    public void case76() {
        String num = "10";
        assertEquals("10", swappingdigits.minNumber(num));
    }

    @Test
    public void case77() {
        String num = "990";
        assertEquals("909", swappingdigits.minNumber(num));
    }

    @Test
    public void case78() {
        String num = "1205";
        assertEquals("1025", swappingdigits.minNumber(num));
    }

    @Test
    public void case79() {
        String num = "150";
        assertEquals("105", swappingdigits.minNumber(num));
    }

    @Test
    public void case80() {
        String num = "21051";
        assertEquals("11052", swappingdigits.minNumber(num));
    }

    @Test
    public void case81() {
        String num = "12810384765827364534537650";
        assertEquals("10810384765827364534537652", swappingdigits.minNumber(num));
    }

    @Test
    public void case82() {
        String num = "4321";
        assertEquals("1324", swappingdigits.minNumber(num));
    }

    @Test
    public void case83() {
        String num = "10234132454134512";
        assertEquals("10134132454134522", swappingdigits.minNumber(num));
    }

    @Test
    public void case84() {
        String num = "2940";
        assertEquals("2049", swappingdigits.minNumber(num));
    }

    @Test
    public void case85() {
        String num = "13";
        assertEquals("13", swappingdigits.minNumber(num));
    }

    @Test
    public void case86() {
        String num = "12304";
        assertEquals("10324", swappingdigits.minNumber(num));
    }

    @Test
    public void case87() {
        String num = "12210000";
        assertEquals("10210002", swappingdigits.minNumber(num));
    }

    @Test
    public void case88() {
        String num = "5986";
        assertEquals("5689", swappingdigits.minNumber(num));
    }

    @Test
    public void case89() {
        String num = "12340";
        assertEquals("10342", swappingdigits.minNumber(num));
    }

    @Test
    public void case90() {
        String num = "140";
        assertEquals("104", swappingdigits.minNumber(num));
    }

    @Test
    public void case91() {
        String num = "2304";
        assertEquals("2034", swappingdigits.minNumber(num));
    }

    @Test
    public void case92() {
        String num = "576";
        assertEquals("567", swappingdigits.minNumber(num));
    }

    @Test
    public void case93() {
        String num = "11023";
        assertEquals("10123", swappingdigits.minNumber(num));
    }

    @Test
    public void case94() {
        String num = "10111";
        assertEquals("10111", swappingdigits.minNumber(num));
    }

    @Test
    public void case95() {
        String num = "10321";
        assertEquals("10123", swappingdigits.minNumber(num));
    }

    @Test
    public void case96() {
        String num = "5968";
        assertEquals("5698", swappingdigits.minNumber(num));
    }

    @Test
    public void case97() {
        String num = "1990";
        assertEquals("1099", swappingdigits.minNumber(num));
    }

    @Test
    public void case98() {
        String num = "330";
        assertEquals("303", swappingdigits.minNumber(num));
    }

    @Test
    public void case99() {
        String num = "11111132";
        assertEquals("11111123", swappingdigits.minNumber(num));
    }

    @Test
    public void case100() {
        String num = "321";
        assertEquals("123", swappingdigits.minNumber(num));
    }

    @Test
    public void case101() {
        String num = "121";
        assertEquals("112", swappingdigits.minNumber(num));
    }

    @Test
    public void case102() {
        String num = "13218910471211292416";
        assertEquals("10218913471211292416", swappingdigits.minNumber(num));
    }

    @Test
    public void case103() {
        String num = "120000";
        assertEquals("100002", swappingdigits.minNumber(num));
    }

    @Test
    public void case104() {
        String num = "670";
        assertEquals("607", swappingdigits.minNumber(num));
    }

    @Test
    public void case105() {
        String num = "590";
        assertEquals("509", swappingdigits.minNumber(num));
    }

    @Test
    public void case106() {
        String num = "1230";
        assertEquals("1032", swappingdigits.minNumber(num));
    }

    @Test
    public void case107() {
        String num = "1404";
        assertEquals("1044", swappingdigits.minNumber(num));
    }

    @Test
    public void case108() {
        String num = "17000001";
        assertEquals("10000071", swappingdigits.minNumber(num));
    }

    @Test
    public void case109() {
        String num = "1243";
        assertEquals("1234", swappingdigits.minNumber(num));
    }

    @Test
    public void case110() {
        String num = "19320";
        assertEquals("10329", swappingdigits.minNumber(num));
    }

    @Test
    public void case111() {
        String num = "11300";
        assertEquals("10301", swappingdigits.minNumber(num));
    }

    @Test
    public void case112() {
        String num = "19201";
        assertEquals("10291", swappingdigits.minNumber(num));
    }

    @Test
    public void case113() {
        String num = "90000003218910471211292416000100100101010100011111";
        assertEquals("10000003218910471211292416000100100101010100011119", swappingdigits.minNumber(num));
    }

    @Test
    public void case114() {
        String num = "1132";
        assertEquals("1123", swappingdigits.minNumber(num));
    }

    @Test
    public void case115() {
        String num = "54321";
        assertEquals("14325", swappingdigits.minNumber(num));
    }

    @Test
    public void case116() {
        String num = "11001001";
        assertEquals("10001011", swappingdigits.minNumber(num));
    }

    @Test
    public void case117() {
        String num = "12345698";
        assertEquals("12345689", swappingdigits.minNumber(num));
    }

    @Test
    public void case118() {
        String num = "2220";
        assertEquals("2022", swappingdigits.minNumber(num));
    }

    @Test
    public void case119() {
        String num = "1210";
        assertEquals("1012", swappingdigits.minNumber(num));
    }

    @Test
    public void case120() {
        String num = "999999999999999999999999999999999999999999999999";
        assertEquals("999999999999999999999999999999999999999999999999", swappingdigits.minNumber(num));
    }

    @Test
    public void case121() {
        String num = "3412";
        assertEquals("1432", swappingdigits.minNumber(num));
    }

    @Test
    public void case122() {
        String num = "2200";
        assertEquals("2002", swappingdigits.minNumber(num));
    }

    @Test
    public void case123() {
        String num = "110001";
        assertEquals("100011", swappingdigits.minNumber(num));
    }

    @Test
    public void case124() {
        String num = "1111132";
        assertEquals("1111123", swappingdigits.minNumber(num));
    }

    @Test
    public void case125() {
        String num = "57906";
        assertEquals("50976", swappingdigits.minNumber(num));
    }

    @Test
    public void case126() {
        String num = "55596";
        assertEquals("55569", swappingdigits.minNumber(num));
    }

    @Test
    public void case127() {
        String num = "90000000000000000000000000001000000000000";
        assertEquals("10000000000000000000000000009000000000000", swappingdigits.minNumber(num));
    }

    @Test
    public void case128() {
        String num = "111110";
        assertEquals("101111", swappingdigits.minNumber(num));
    }

    @Test
    public void case129() {
        String num = "1191";
        assertEquals("1119", swappingdigits.minNumber(num));
    }

    @Test
    public void case130() {
        String num = "9990";
        assertEquals("9099", swappingdigits.minNumber(num));
    }

    @Test
    public void case131() {
        String num = "100";
        assertEquals("100", swappingdigits.minNumber(num));
    }

    @Test
    public void case132() {
        String num = "12306";
        assertEquals("10326", swappingdigits.minNumber(num));
    }

    @Test
    public void case133() {
        String num = "549";
        assertEquals("459", swappingdigits.minNumber(num));
    }

    @Test
    public void case134() {
        String num = "1002000300500";
        assertEquals("1000000300502", swappingdigits.minNumber(num));
    }

    @Test
    public void case135() {
        String num = "110101";
        assertEquals("100111", swappingdigits.minNumber(num));
    }

    @Test
    public void case136() {
        String num = "49084";
        assertEquals("40984", swappingdigits.minNumber(num));
    }

    @Test
    public void case137() {
        String num = "1231";
        assertEquals("1132", swappingdigits.minNumber(num));
    }

    @Test
    public void case138() {
        String num = "1534321";
        assertEquals("1134325", swappingdigits.minNumber(num));
    }

    @Test
    public void case139() {
        String num = "5598";
        assertEquals("5589", swappingdigits.minNumber(num));
    }

    @Test
    public void case140() {
        String num = "191";
        assertEquals("119", swappingdigits.minNumber(num));
    }

    @Test
    public void case141() {
        String num = "1111130";
        assertEquals("1011131", swappingdigits.minNumber(num));
    }

}
