package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class LotteryCheatingTest {
    LotteryCheating lotterycheating = new LotteryCheating();

    @Test
    public void case1() {
        String ID = "1";
        assertEquals(0, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case2() {
        String ID = "1234";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case3() {
        String ID = "9000000000";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case4() {
        String ID = "4294967296";
        assertEquals(0, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case5() {
        String ID = "7654321";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case6() {
        String ID = "0";
        assertEquals(0, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case7() {
        String ID = "16";
        assertEquals(0, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case8() {
        String ID = "1024";
        assertEquals(0, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case9() {
        String ID = "1";
        assertEquals(0, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case10() {
        String ID = "7";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case11() {
        String ID = "9999999999";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case12() {
        String ID = "0";
        assertEquals(0, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case13() {
        String ID = "9";
        assertEquals(0, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case14() {
        String ID = "4";
        assertEquals(0, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case15() {
        String ID = "8";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case16() {
        String ID = "8";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case17() {
        String ID = "24";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case18() {
        String ID = "55";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case19() {
        String ID = "17";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case20() {
        String ID = "11";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case21() {
        String ID = "52";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case22() {
        String ID = "76";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case23() {
        String ID = "14";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case24() {
        String ID = "23";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case25() {
        String ID = "221";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case26() {
        String ID = "685";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case27() {
        String ID = "761";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case28() {
        String ID = "892";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case29() {
        String ID = "795";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case30() {
        String ID = "431";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case31() {
        String ID = "233";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case32() {
        String ID = "411";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case33() {
        String ID = "3874";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case34() {
        String ID = "2779";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case35() {
        String ID = "3198";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case36() {
        String ID = "6502";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case37() {
        String ID = "8602";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case38() {
        String ID = "4865";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case39() {
        String ID = "0900";
        assertEquals(0, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case40() {
        String ID = "6138";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case41() {
        String ID = "93446";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case42() {
        String ID = "06618";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case43() {
        String ID = "49637";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case44() {
        String ID = "88291";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case45() {
        String ID = "35984";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case46() {
        String ID = "07636";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case47() {
        String ID = "15420";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case48() {
        String ID = "97372";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case49() {
        String ID = "601657";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case50() {
        String ID = "541200";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case51() {
        String ID = "146071";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case52() {
        String ID = "777733";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case53() {
        String ID = "599818";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case54() {
        String ID = "266038";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case55() {
        String ID = "012509";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case56() {
        String ID = "478351";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case57() {
        String ID = "2016406";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case58() {
        String ID = "1898414";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case59() {
        String ID = "3988087";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case60() {
        String ID = "7838371";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case61() {
        String ID = "0734965";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case62() {
        String ID = "1099683";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case63() {
        String ID = "4849925";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case64() {
        String ID = "5333743";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case65() {
        String ID = "80880681";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case66() {
        String ID = "98972282";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case67() {
        String ID = "89078158";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case68() {
        String ID = "61242586";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case69() {
        String ID = "26539246";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case70() {
        String ID = "18211976";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case71() {
        String ID = "29520039";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case72() {
        String ID = "18195325";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case73() {
        String ID = "258677229";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case74() {
        String ID = "419698255";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case75() {
        String ID = "491250839";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case76() {
        String ID = "396799769";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case77() {
        String ID = "357665825";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case78() {
        String ID = "441616335";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case79() {
        String ID = "532825361";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case80() {
        String ID = "862146291";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case81() {
        String ID = "5036492934";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case82() {
        String ID = "4059634288";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case83() {
        String ID = "7581257444";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case84() {
        String ID = "4429307787";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case85() {
        String ID = "3038252037";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case86() {
        String ID = "2975343211";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case87() {
        String ID = "3253512226";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case88() {
        String ID = "4070340053";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case89() {
        String ID = "9000000009";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case90() {
        String ID = "52";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case91() {
        String ID = "3512";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case92() {
        String ID = "325592";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case93() {
        String ID = "7905938297";
        assertEquals(5, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case94() {
        String ID = "9068446613";
        assertEquals(5, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case95() {
        String ID = "6426159772";
        assertEquals(5, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case96() {
        String ID = "6475047173";
        assertEquals(5, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case97() {
        String ID = "2601086332";
        assertEquals(5, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case98() {
        String ID = "9682242498";
        assertEquals(5, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case99() {
        String ID = "7146915475";
        assertEquals(5, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case100() {
        String ID = "9339271832";
        assertEquals(5, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case101() {
        String ID = "7440088477";
        assertEquals(5, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case102() {
        String ID = "6511416737";
        assertEquals(5, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case103() {
        String ID = "2500013512";
        assertEquals(5, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case104() {
        String ID = "69411112";
        assertEquals(5, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case105() {
        String ID = "98351432";
        assertEquals(5, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case106() {
        String ID = "9888888844";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case107() {
        String ID = "7427793198";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case108() {
        String ID = "9111111111";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case109() {
        String ID = "9974836050";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case110() {
        String ID = "53776";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case111() {
        String ID = "872164";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case112() {
        String ID = "1073676287";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case113() {
        String ID = "9876543210";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case114() {
        String ID = "9987624531";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case115() {
        String ID = "99950884";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case116() {
        String ID = "9834675892";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case117() {
        String ID = "6666666666";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case118() {
        String ID = "1256";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case119() {
        String ID = "2321";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case120() {
        String ID = "000001023";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case121() {
        String ID = "3243545641";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case122() {
        String ID = "12345678";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case123() {
        String ID = "7654321999";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case124() {
        String ID = "9510295951";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case125() {
        String ID = "1234567890";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case126() {
        String ID = "9877654322";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case127() {
        String ID = "9455171152";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case128() {
        String ID = "0519934597";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case129() {
        String ID = "47602500";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case130() {
        String ID = "99634680";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case131() {
        String ID = "0001";
        assertEquals(0, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case132() {
        String ID = "6384795177";
        assertEquals(5, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case133() {
        String ID = "36849";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case134() {
        String ID = "5599008971";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case135() {
        String ID = "9399759793";
        assertEquals(5, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case136() {
        String ID = "1111111111";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case137() {
        String ID = "9999800001";
        assertEquals(0, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case138() {
        String ID = "1234567897";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case139() {
        String ID = "1010101010";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case140() {
        String ID = "05129";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case141() {
        String ID = "6298778321";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case142() {
        String ID = "9876542298";
        assertEquals(5, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case143() {
        String ID = "00001";
        assertEquals(0, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case144() {
        String ID = "165487";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case145() {
        String ID = "52399025";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case146() {
        String ID = "0000121";
        assertEquals(0, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case147() {
        String ID = "3124657493";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case148() {
        String ID = "7207653577";
        assertEquals(5, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case149() {
        String ID = "1225244683";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case150() {
        String ID = "9562748977";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case151() {
        String ID = "7889975444";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case152() {
        String ID = "512295961";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case153() {
        String ID = "36";
        assertEquals(0, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case154() {
        String ID = "7777777777";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case155() {
        String ID = "999800001";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case156() {
        String ID = "3221225473";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case157() {
        String ID = "7958803495";
        assertEquals(5, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case158() {
        String ID = "9998200081";
        assertEquals(0, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case159() {
        String ID = "9997733333";
        assertEquals(5, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case160() {
        String ID = "9999999998";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case161() {
        String ID = "7127361263";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case162() {
        String ID = "166";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case163() {
        String ID = "1111111112";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case164() {
        String ID = "1073938441";
        assertEquals(0, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case165() {
        String ID = "7427466391";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case166() {
        String ID = "4294967295";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case167() {
        String ID = "9111101001";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case168() {
        String ID = "396649";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case169() {
        String ID = "00000001";
        assertEquals(0, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case170() {
        String ID = "0009";
        assertEquals(0, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case171() {
        String ID = "9999807777";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case172() {
        String ID = "116";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case173() {
        String ID = "989898129";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case174() {
        String ID = "9999998798";
        assertEquals(5, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case175() {
        String ID = "48";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case176() {
        String ID = "3335889635";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case177() {
        String ID = "0121";
        assertEquals(0, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case178() {
        String ID = "22";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case179() {
        String ID = "9670031439";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case180() {
        String ID = "294967296";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case181() {
        String ID = "9019769";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case182() {
        String ID = "9888544447";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case183() {
        String ID = "148636929";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case184() {
        String ID = "9999999994";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case185() {
        String ID = "9090909090";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case186() {
        String ID = "3333333333";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case187() {
        String ID = "0048576";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case188() {
        String ID = "7654322";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case189() {
        String ID = "8888888888";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case190() {
        String ID = "15";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case191() {
        String ID = "001";
        assertEquals(0, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case192() {
        String ID = "010000";
        assertEquals(0, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case193() {
        String ID = "777333773";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case194() {
        String ID = "1000000009";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case195() {
        String ID = "9578843567";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case196() {
        String ID = "0999800001";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case197() {
        String ID = "248361997";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case198() {
        String ID = "8589934592";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case199() {
        String ID = "53941731";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case200() {
        String ID = "5345243543";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case201() {
        String ID = "06056049";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case202() {
        String ID = "7456384";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case203() {
        String ID = "8645973056";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case204() {
        String ID = "62";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case205() {
        String ID = "1366136613";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case206() {
        String ID = "96";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case207() {
        String ID = "7620591615";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case208() {
        String ID = "000000016";
        assertEquals(0, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case209() {
        String ID = "936";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case210() {
        String ID = "1269";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case211() {
        String ID = "9259582348";
        assertEquals(5, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case212() {
        String ID = "143";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case213() {
        String ID = "7175369";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case214() {
        String ID = "04060401";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case215() {
        String ID = "9999899999";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case216() {
        String ID = "9324735953";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case217() {
        String ID = "005536";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case218() {
        String ID = "7234";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case219() {
        String ID = "5074425224";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case220() {
        String ID = "1234567891";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case221() {
        String ID = "011";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case222() {
        String ID = "12";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case223() {
        String ID = "10203";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case224() {
        String ID = "8671041";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case225() {
        String ID = "720";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case226() {
        String ID = "916384";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case227() {
        String ID = "019718";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case228() {
        String ID = "8783904592";
        assertEquals(5, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case229() {
        String ID = "000100";
        assertEquals(0, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case230() {
        String ID = "4294967311";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case231() {
        String ID = "1553248479";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case232() {
        String ID = "9999999997";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case233() {
        String ID = "100";
        assertEquals(0, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case234() {
        String ID = "234321";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case235() {
        String ID = "23244441";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case236() {
        String ID = "30";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case237() {
        String ID = "35094404";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case238() {
        String ID = "8769";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case239() {
        String ID = "0396649";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case240() {
        String ID = "1549914753";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case241() {
        String ID = "912484";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case242() {
        String ID = "1423221685";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case243() {
        String ID = "10";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case244() {
        String ID = "6493828391";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case245() {
        String ID = "73741824";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case246() {
        String ID = "7986572262";
        assertEquals(5, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case247() {
        String ID = "9876543254";
        assertEquals(4, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case248() {
        String ID = "24670121";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case249() {
        String ID = "234587249";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case250() {
        String ID = "998002";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case251() {
        String ID = "0002748907";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case252() {
        String ID = "8276438714";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case253() {
        String ID = "2081169";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case254() {
        String ID = "9360289796";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case255() {
        String ID = "00000025";
        assertEquals(0, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case256() {
        String ID = "48762289";
        assertEquals(0, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case257() {
        String ID = "84389241";
        assertEquals(3, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case258() {
        String ID = "144";
        assertEquals(0, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case259() {
        String ID = "948089";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case260() {
        String ID = "224";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case261() {
        String ID = "5769";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case262() {
        String ID = "2";
        assertEquals(1, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case263() {
        String ID = "140035885";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case264() {
        String ID = "0004";
        assertEquals(0, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case265() {
        String ID = "1076";
        assertEquals(2, lotterycheating.minimalChange(ID));
    }

    @Test
    public void case266() {
        String ID = "9999799998";
        assertEquals(5, lotterycheating.minimalChange(ID));
    }

}
