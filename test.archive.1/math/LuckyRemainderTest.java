package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class LuckyRemainderTest {
    LuckyRemainder luckyremainder = new LuckyRemainder();

    @Test
    public void case1() {
        String X = "123";
        assertEquals(6, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case2() {
        String X = "24816";
        assertEquals(3, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case3() {
        String X = "8";
        assertEquals(8, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case4() {
        String X = "11235813213455";
        assertEquals(7, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case5() {
        String X = "9";
        assertEquals(0, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case6() {
        String X = "99999999999999999999999999999999999999999999999999";
        assertEquals(0, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case7() {
        String X = "1";
        assertEquals(1, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case8() {
        String X = "2";
        assertEquals(2, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case9() {
        String X = "3";
        assertEquals(3, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case10() {
        String X = "4";
        assertEquals(4, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case11() {
        String X = "5";
        assertEquals(5, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case12() {
        String X = "6";
        assertEquals(6, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case13() {
        String X = "7";
        assertEquals(7, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case14() {
        String X = "11";
        assertEquals(4, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case15() {
        String X = "9999999999999999999999999999999999999991";
        assertEquals(8, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case16() {
        String X = "9999929999999999999999999999999999999999";
        assertEquals(7, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case17() {
        String X = "9999999999999999999399999999999999999999";
        assertEquals(6, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case18() {
        String X = "9999999994999999999999999999999999999999";
        assertEquals(5, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case19() {
        String X = "9999999999999999999999999995999999999999";
        assertEquals(4, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case20() {
        String X = "6999999999999999999999999999999999999999";
        assertEquals(3, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case21() {
        String X = "9999999999979999999999999999999999999999";
        assertEquals(2, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case22() {
        String X = "9899999999999999999999999999999999999999";
        assertEquals(1, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case23() {
        String X = "999999999999999999999999999999999999999";
        assertEquals(0, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case24() {
        String X = "98888989888988998987989879899988988";
        assertEquals(1, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case25() {
        String X = "11111111111111111111111111333333333333";
        assertEquals(7, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case26() {
        String X = "1123581321345589144233377";
        assertEquals(5, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case27() {
        String X = "999897969594939291898887868584838281";
        assertEquals(0, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case28() {
        String X = "65666618966677342548732851572773434138187554434768";
        assertEquals(2, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case29() {
        String X = "48185527832945364931651138578613131358858995384721";
        assertEquals(5, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case30() {
        String X = "11575127558417264466259919653661748693365469259413";
        assertEquals(0, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case31() {
        String X = "99274656623859953846722247153412613467552731944193";
        assertEquals(4, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case32() {
        String X = "77136112127235921648558112237776897142248271488163";
        assertEquals(2, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case33() {
        String X = "97323888492537212225247967411715613647753761637543";
        assertEquals(1, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case34() {
        String X = "13813612135199437938117169828289374929124759661548";
        assertEquals(5, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case35() {
        String X = "65451981174647141752359334541782993573259224241924";
        assertEquals(7, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case36() {
        String X = "62618252422488287228616168816713425551749893634399";
        assertEquals(1, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case37() {
        String X = "26223355936593279766461978894118137596196238295883";
        assertEquals(0, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case38() {
        String X = "766499475156864773264843737646436243253761418";
        assertEquals(1, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case39() {
        String X = "3261775314426215543683637521964254236596623648661";
        assertEquals(8, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case40() {
        String X = "2754446176633784378123818337721327135944324348";
        assertEquals(4, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case41() {
        String X = "21127878882183392137415774248156751585291";
        assertEquals(2, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case42() {
        String X = "5557595556821759778549689419961925812145661334484";
        assertEquals(6, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case43() {
        String X = "83641848281652286353698374548982946371592173332259";
        assertEquals(8, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case44() {
        String X = "8552168648945771964868162178742453651397";
        assertEquals(8, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case45() {
        String X = "537599433214998822972883678539148485441316763";
        assertEquals(5, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case46() {
        String X = "9375132931216952933732193429449377453875757671526";
        assertEquals(1, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case47() {
        String X = "319233411427166848324456267252955617185225549";
        assertEquals(6, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case48() {
        String X = "3476245768781176948432366133474886131627";
        assertEquals(7, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case49() {
        String X = "287815239958516622732799852162466";
        assertEquals(7, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case50() {
        String X = "18622792224793116752348482189448572521";
        assertEquals(0, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case51() {
        String X = "76348959879927448615167648";
        assertEquals(0, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case52() {
        String X = "9378421267681244947995179853797";
        assertEquals(2, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case53() {
        String X = "156439785458933177328886528848292439679465596";
        assertEquals(5, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case54() {
        String X = "958945193682947154114125937597128184";
        assertEquals(3, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case55() {
        String X = "26688553682267978331513527563815391717";
        assertEquals(8, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case56() {
        String X = "965558779234943426531626756";
        assertEquals(7, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case57() {
        String X = "83815559717182398782621861245554685";
        assertEquals(1, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case58() {
        String X = "238374411896269687141";
        assertEquals(4, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case59() {
        String X = "9524132949699645447832367282773934166144";
        assertEquals(0, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case60() {
        String X = "695798178381498947596959441152";
        assertEquals(1, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case61() {
        String X = "72141619721";
        assertEquals(8, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case62() {
        String X = "8156591298724581264429451315946565";
        assertEquals(0, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case63() {
        String X = "5245915686464797558335413391191998";
        assertEquals(5, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case64() {
        String X = "5327419211151225541898";
        assertEquals(4, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case65() {
        String X = "73441158977919588981";
        assertEquals(3, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case66() {
        String X = "393969852216313";
        assertEquals(1, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case67() {
        String X = "52538669";
        assertEquals(7, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case68() {
        String X = "111111111";
        assertEquals(0, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case69() {
        String X = "99999999999999999999999999999999999999999999";
        assertEquals(0, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case70() {
        String X = "28374982789173741723572198759817287289347598229549";
        assertEquals(8, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case71() {
        String X = "2222222222222222222222222222222222222";
        assertEquals(2, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case72() {
        String X = "123456789123456789123456789123456789123456789";
        assertEquals(0, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case73() {
        String X = "33333456783433345678333334567233333456783333345678";
        assertEquals(8, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case74() {
        String X = "99888888889988888888998888888899888888887988888888";
        assertEquals(6, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case75() {
        String X = "98978959112358132134551123581321345511235813213455";
        assertEquals(5, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case76() {
        String X = "123345676543276543543";
        assertEquals(1, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case77() {
        String X = "444444444444444444444444444444444444444444443";
        assertEquals(5, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case78() {
        String X = "11111198789111119878911111987891111198789111198789";
        assertEquals(1, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case79() {
        String X = "6721354326476231463278146173264732164";
        assertEquals(5, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case80() {
        String X = "46513246527465132465274651324652746513246527465132";
        assertEquals(6, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case81() {
        String X = "11111111111111111111111111111111111111111111111111";
        assertEquals(1, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case82() {
        String X = "654651651616516165165161616";
        assertEquals(4, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case83() {
        String X = "1234567891123456789112345678911234567891";
        assertEquals(5, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case84() {
        String X = "12345678911234567891123456789112345678911234567892";
        assertEquals(3, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case85() {
        String X = "12345678765432123456789876543234567877654321567896";
        assertEquals(0, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case86() {
        String X = "77777777777777777777777777777777777777777777777777";
        assertEquals(7, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case87() {
        String X = "92345678911234567891123456789112345678911234567891";
        assertEquals(8, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case88() {
        String X = "5252656585555655554545782457245755462474894684954";
        assertEquals(1, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case89() {
        String X = "9999999999999999999999";
        assertEquals(0, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case90() {
        String X = "46723467234672346723467234672346723467234672346723";
        assertEquals(8, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case91() {
        String X = "12315467486768465468494984946546478676965454";
        assertEquals(2, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case92() {
        String X = "78978978967897897896789789789678978978967897897896";
        assertEquals(6, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case93() {
        String X = "123456789912345678991234567899123456789811";
        assertEquals(5, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case94() {
        String X = "5415563216541653154653151656151";
        assertEquals(0, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case95() {
        String X = "88888888888888888888888888888888888888888888888";
        assertEquals(4, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case96() {
        String X = "12345678913415646165169416511546616165413215467896";
        assertEquals(2, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case97() {
        String X = "4444444444444444444444444444444444444444444444444";
        assertEquals(7, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case98() {
        String X = "999999999988888888754321777765432359981235678564";
        assertEquals(4, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case99() {
        String X = "1111111111111111111111111111111111111111111111111";
        assertEquals(4, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case100() {
        String X = "11111111111111111111111111111111111111111111113";
        assertEquals(1, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case101() {
        String X = "13432423425455464564564574546545645645643534334344";
        assertEquals(1, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case102() {
        String X = "11235813213455112358132134551123581321345511235813";
        assertEquals(6, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case103() {
        String X = "89875755232171557615673158677717673837742186949589";
        assertEquals(0, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case104() {
        String X = "15145415641541641658415145634151213";
        assertEquals(6, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case105() {
        String X = "12345678912345678912345678912345678912345678912345";
        assertEquals(3, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case106() {
        String X = "1234567891234567891234567891234567891";
        assertEquals(1, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case107() {
        String X = "89794564649879845613231549887945646131231489462";
        assertEquals(1, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case108() {
        String X = "88888888888888888888888888888888888888888888888888";
        assertEquals(8, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case109() {
        String X = "97847837845845687623587462387648723648726348762348";
        assertEquals(5, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case110() {
        String X = "1231231231231231231231213231231231232";
        assertEquals(2, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case111() {
        String X = "123123433245434534245345345345234234114567889";
        assertEquals(5, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case112() {
        String X = "12325283749123252637491232586374912325263749";
        assertEquals(8, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case113() {
        String X = "234567123363636371823123712312312312312388585";
        assertEquals(5, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case114() {
        String X = "5555555555555555555555555555555555555555555552";
        assertEquals(7, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case115() {
        String X = "69182342666918234266691823426669182342666918234266";
        assertEquals(2, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case116() {
        String X = "11111111154545454545454545454554545445454545454545";
        assertEquals(1, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case117() {
        String X = "94831572846453897392515394792275764345922852815538";
        assertEquals(2, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case118() {
        String X = "123456789123456789123456789123456789123456789123";
        assertEquals(3, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case119() {
        String X = "1123581321345511111";
        assertEquals(4, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case120() {
        String X = "12345678911234567891123456789112345678911234567891";
        assertEquals(1, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case121() {
        String X = "123456789123456789123456789123456789123456";
        assertEquals(6, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case122() {
        String X = "24816121545878975786798794988979794233211212231686";
        assertEquals(0, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case123() {
        String X = "9999999999999999999999999999999999999999999999999";
        assertEquals(0, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case124() {
        String X = "12345678912345678912345678912345678912345678955555";
        assertEquals(5, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case125() {
        String X = "11111111111111111111111111111111";
        assertEquals(1, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case126() {
        String X = "123456789123456789123456789123456789";
        assertEquals(0, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case127() {
        String X = "1111111111111111111111111111111111111111";
        assertEquals(5, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case128() {
        String X = "1234876152384761253487612354817623541872365418723";
        assertEquals(4, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case129() {
        String X = "313";
        assertEquals(1, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case130() {
        String X = "123451234512345123451234512345123451234512345";
        assertEquals(0, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case131() {
        String X = "12311234654846847847644769748545463415415416415415";
        assertEquals(1, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case132() {
        String X = "99999999999999999999999999999999999999999999999977";
        assertEquals(1, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case133() {
        String X = "541556321654165315465315165615154512";
        assertEquals(4, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case134() {
        String X = "11235813213455654654654654";
        assertEquals(1, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case135() {
        String X = "1234567891234567891234567891234567891234567";
        assertEquals(1, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case136() {
        String X = "9876543219876543219876543211234567891234567891234";
        assertEquals(1, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case137() {
        String X = "2345671233636363718231237123123123123123885853838";
        assertEquals(3, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case138() {
        String X = "45456567567567456453453435346456576574564353453425";
        assertEquals(3, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case139() {
        String X = "55555555555555555555555555555555555555";
        assertEquals(2, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case140() {
        String X = "12345678991234567899123456789912345678991234567899";
        assertEquals(0, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case141() {
        String X = "45";
        assertEquals(0, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case142() {
        String X = "9999999999999999999999999999999999999995";
        assertEquals(4, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case143() {
        String X = "123456789112345678911234567891123456789112345";
        assertEquals(4, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case144() {
        String X = "9999999999999999999999998875699";
        assertEquals(7, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case145() {
        String X = "9999999999999999999999999999999999999999999999991";
        assertEquals(1, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case146() {
        String X = "999999999949997999999199999699993999999999999";
        assertEquals(3, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case147() {
        String X = "2224322342354343887879879743294742938429842398466";
        assertEquals(3, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case148() {
        String X = "1222";
        assertEquals(2, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case149() {
        String X = "98765412345464841826168418643115841834189899951684";
        assertEquals(5, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case150() {
        String X = "98639481349863948134986394813498639481349863948134";
        assertEquals(1, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case151() {
        String X = "77777757777797777778777777777777777377777177777777";
        assertEquals(7, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case152() {
        String X = "1111";
        assertEquals(5, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case153() {
        String X = "9999999999999999999999999999999999999999";
        assertEquals(0, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case154() {
        String X = "123456789987654343532532524688712288";
        assertEquals(2, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case155() {
        String X = "4354373534534535345344543543543";
        assertEquals(8, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case156() {
        String X = "11111";
        assertEquals(8, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case157() {
        String X = "123456";
        assertEquals(6, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case158() {
        String X = "111";
        assertEquals(3, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case159() {
        String X = "19999999999999999999999999999999999999999999999999";
        assertEquals(2, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case160() {
        String X = "23";
        assertEquals(1, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case161() {
        String X = "11111222223333344444555556666677777888889999912345";
        assertEquals(3, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case162() {
        String X = "123647382626273847463636464637285948372737473727";
        assertEquals(0, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case163() {
        String X = "123512315124124";
        assertEquals(4, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case164() {
        String X = "31";
        assertEquals(8, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case165() {
        String X = "98765412345464841826168418643115841836189899951684";
        assertEquals(0, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case166() {
        String X = "99999999999999999999999988756999999999999665";
        assertEquals(3, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case167() {
        String X = "66274834855367125655616786474316121686927432329479";
        assertEquals(7, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case168() {
        String X = "987654321123456789987654321123456789987654321";
        assertEquals(0, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case169() {
        String X = "1111111111111111111111111111111111";
        assertEquals(2, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case170() {
        String X = "55555555555555555555555555555555555555555";
        assertEquals(4, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case171() {
        String X = "81238534363528825383492253329832796131335973541574";
        assertEquals(0, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case172() {
        String X = "12345678923456723456123889566231235667734";
        assertEquals(0, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case173() {
        String X = "12345123451234512345123451234512345123451234512345";
        assertEquals(3, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case174() {
        String X = "12124";
        assertEquals(7, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case175() {
        String X = "9999999999999999999999999999999999999999999999213";
        assertEquals(6, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case176() {
        String X = "1234567891234567891234567891234567891234";
        assertEquals(8, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case177() {
        String X = "98795412345464841826168418643115841836189899951684";
        assertEquals(6, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case178() {
        String X = "1234567891234567891234567891234567891234567891234";
        assertEquals(1, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case179() {
        String X = "51116111711411111111111145112111314118141181191111";
        assertEquals(5, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case180() {
        String X = "1234567891234567891234567891234567";
        assertEquals(8, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case181() {
        String X = "98712349867132497861234987612349876123497861234976";
        assertEquals(8, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case182() {
        String X = "98546712856382853974329439842766319873164383724499";
        assertEquals(6, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case183() {
        String X = "78983279842342842342342442342";
        assertEquals(7, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case184() {
        String X = "12345678912345678712345678912345678912345678912345";
        assertEquals(8, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case185() {
        String X = "999999999999999999999999999999999999999999999923";
        assertEquals(7, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case186() {
        String X = "733";
        assertEquals(7, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case187() {
        String X = "12345678912345678912345678912345678912345689123456";
        assertEquals(1, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case188() {
        String X = "56789567895678956789567895678956789567895678956789";
        assertEquals(7, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case189() {
        String X = "8888888888888888888888888888888888888888888888888";
        assertEquals(5, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case190() {
        String X = "12345678988812345678911111111144455522333";
        assertEquals(7, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case191() {
        String X = "12941848234892475813718374891374891347894789327289";
        assertEquals(4, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case192() {
        String X = "7894";
        assertEquals(8, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case193() {
        String X = "123456789612345678961234444";
        assertEquals(1, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case194() {
        String X = "99999999999999999999499992999999979999999999999999";
        assertEquals(8, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case195() {
        String X = "47563874657623487562937846597826347562783647856728";
        assertEquals(5, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case196() {
        String X = "5765487329698746387254962748936579843265876432986";
        assertEquals(2, luckyremainder.getLuckyRemainder(X));
    }

    @Test
    public void case197() {
        String X = "123456789123456789123456789123456789123456788";
        assertEquals(5, luckyremainder.getLuckyRemainder(X));
    }

}
