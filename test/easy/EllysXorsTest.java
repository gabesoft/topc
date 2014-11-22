package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class EllysXorsTest {
    EllysXors ellysxors = new EllysXors();

    @Test
    public void case1() {
        long L = 3L;
        long R = 10L;
        assertEquals(8L, ellysxors.getXor(L, R));
    }

    @Test
    public void case2() {
        long L = 5L;
        long R = 5L;
        assertEquals(5L, ellysxors.getXor(L, R));
    }

    @Test
    public void case3() {
        long L = 13L;
        long R = 42L;
        assertEquals(39L, ellysxors.getXor(L, R));
    }

    @Test
    public void case4() {
        long L = 666L;
        long R = 1337L;
        assertEquals(0L, ellysxors.getXor(L, R));
    }

    @Test
    public void case5() {
        long L = 1234567L;
        long R = 89101112L;
        assertEquals(89998783L, ellysxors.getXor(L, R));
    }

    @Test
    public void case6() {
        long L = 19L;
        long R = 113L;
        assertEquals(18L, ellysxors.getXor(L, R));
    }

    @Test
    public void case7() {
        long L = 42L;
        long R = 666L;
        assertEquals(666L, ellysxors.getXor(L, R));
    }

    @Test
    public void case8() {
        long L = 42L;
        long R = 1337L;
        assertEquals(0L, ellysxors.getXor(L, R));
    }

    @Test
    public void case9() {
        long L = 123456L;
        long R = 7891011L;
        assertEquals(0L, ellysxors.getXor(L, R));
    }

    @Test
    public void case10() {
        long L = 1000001L;
        long R = 10000001L;
        assertEquals(1000001L, ellysxors.getXor(L, R));
    }

    @Test
    public void case11() {
        long L = 12345678L;
        long R = 910111213L;
        assertEquals(0L, ellysxors.getXor(L, R));
    }

    @Test
    public void case12() {
        long L = 1000000000L;
        long R = 1000000000L;
        assertEquals(1000000000L, ellysxors.getXor(L, R));
    }

    @Test
    public void case13() {
        long L = 1L;
        long R = 2000000000L;
        assertEquals(2000000000L, ellysxors.getXor(L, R));
    }

    @Test
    public void case14() {
        long L = 1L;
        long R = 1L;
        assertEquals(1L, ellysxors.getXor(L, R));
    }

    @Test
    public void case15() {
        long L = 1L;
        long R = 2L;
        assertEquals(3L, ellysxors.getXor(L, R));
    }

    @Test
    public void case16() {
        long L = 1L;
        long R = 3L;
        assertEquals(0L, ellysxors.getXor(L, R));
    }

    @Test
    public void case17() {
        long L = 1L;
        long R = 4L;
        assertEquals(4L, ellysxors.getXor(L, R));
    }

    @Test
    public void case18() {
        long L = 2L;
        long R = 3L;
        assertEquals(1L, ellysxors.getXor(L, R));
    }

    @Test
    public void case19() {
        long L = 3L;
        long R = 4L;
        assertEquals(7L, ellysxors.getXor(L, R));
    }

    @Test
    public void case20() {
        long L = 2L;
        long R = 4L;
        assertEquals(5L, ellysxors.getXor(L, R));
    }

    @Test
    public void case21() {
        long L = 4L;
        long R = 8L;
        assertEquals(8L, ellysxors.getXor(L, R));
    }

    @Test
    public void case22() {
        long L = 2L;
        long R = 536879812L;
        assertEquals(536879813L, ellysxors.getXor(L, R));
    }

    @Test
    public void case23() {
        long L = 536879912L;
        long R = 999999999L;
        assertEquals(0L, ellysxors.getXor(L, R));
    }

    @Test
    public void case24() {
        long L = 2L;
        long R = 999999999L;
        assertEquals(1L, ellysxors.getXor(L, R));
    }

    @Test
    public void case25() {
        long L = 32L;
        long R = 32768L;
        assertEquals(32768L, ellysxors.getXor(L, R));
    }

    @Test
    public void case26() {
        long L = 31L;
        long R = 32768L;
        assertEquals(32799L, ellysxors.getXor(L, R));
    }

    @Test
    public void case27() {
        long L = 31L;
        long R = 32769L;
        assertEquals(30L, ellysxors.getXor(L, R));
    }

    @Test
    public void case28() {
        long L = 32L;
        long R = 32767L;
        assertEquals(0L, ellysxors.getXor(L, R));
    }

    @Test
    public void case29() {
        long L = 131071L;
        long R = 536870911L;
        assertEquals(131071L, ellysxors.getXor(L, R));
    }

    @Test
    public void case30() {
        long L = 131071L;
        long R = 536870912L;
        assertEquals(537001983L, ellysxors.getXor(L, R));
    }

    @Test
    public void case31() {
        long L = 131071L;
        long R = 536870913L;
        assertEquals(131070L, ellysxors.getXor(L, R));
    }

    @Test
    public void case32() {
        long L = 131072L;
        long R = 536870911L;
        assertEquals(0L, ellysxors.getXor(L, R));
    }

    @Test
    public void case33() {
        long L = 131072L;
        long R = 536870912L;
        assertEquals(536870912L, ellysxors.getXor(L, R));
    }

    @Test
    public void case34() {
        long L = 131072L;
        long R = 536870913L;
        assertEquals(1L, ellysxors.getXor(L, R));
    }

    @Test
    public void case35() {
        long L = 131073L;
        long R = 536870911L;
        assertEquals(131072L, ellysxors.getXor(L, R));
    }

    @Test
    public void case36() {
        long L = 131073L;
        long R = 536870912L;
        assertEquals(537001984L, ellysxors.getXor(L, R));
    }

    @Test
    public void case37() {
        long L = 131073L;
        long R = 536870913L;
        assertEquals(131073L, ellysxors.getXor(L, R));
    }

    @Test
    public void case38() {
        long L = 1048575L;
        long R = 1048575L;
        assertEquals(1048575L, ellysxors.getXor(L, R));
    }

    @Test
    public void case39() {
        long L = 1048576L;
        long R = 1048576L;
        assertEquals(1048576L, ellysxors.getXor(L, R));
    }

    @Test
    public void case40() {
        long L = 1048577L;
        long R = 1048577L;
        assertEquals(1048577L, ellysxors.getXor(L, R));
    }

    @Test
    public void case41() {
        long L = 32768L;
        long R = 131072L;
        assertEquals(131072L, ellysxors.getXor(L, R));
    }

    @Test
    public void case42() {
        long L = 1L;
        long R = 4000000000L;
        assertEquals(4000000000L, ellysxors.getXor(L, R));
    }

    @Test
    public void case43() {
        long L = 2L;
        long R = 4000000000L;
        assertEquals(4000000001L, ellysxors.getXor(L, R));
    }

    @Test
    public void case44() {
        long L = 3L;
        long R = 4000000000L;
        assertEquals(4000000003L, ellysxors.getXor(L, R));
    }

    @Test
    public void case45() {
        long L = 4L;
        long R = 4000000000L;
        assertEquals(4000000000L, ellysxors.getXor(L, R));
    }

    @Test
    public void case46() {
        long L = 1L;
        long R = 3500000000L;
        assertEquals(3500000000L, ellysxors.getXor(L, R));
    }

    @Test
    public void case47() {
        long L = 2L;
        long R = 3500000000L;
        assertEquals(3500000001L, ellysxors.getXor(L, R));
    }

    @Test
    public void case48() {
        long L = 3L;
        long R = 3500000000L;
        assertEquals(3500000003L, ellysxors.getXor(L, R));
    }

    @Test
    public void case49() {
        long L = 4L;
        long R = 3500000000L;
        assertEquals(3500000000L, ellysxors.getXor(L, R));
    }

    @Test
    public void case50() {
        long L = 1L;
        long R = 3200000000L;
        assertEquals(3200000000L, ellysxors.getXor(L, R));
    }

    @Test
    public void case51() {
        long L = 2L;
        long R = 3200000000L;
        assertEquals(3200000001L, ellysxors.getXor(L, R));
    }

    @Test
    public void case52() {
        long L = 3L;
        long R = 3200000000L;
        assertEquals(3200000003L, ellysxors.getXor(L, R));
    }

    @Test
    public void case53() {
        long L = 4L;
        long R = 3200000000L;
        assertEquals(3200000000L, ellysxors.getXor(L, R));
    }

    @Test
    public void case54() {
        long L = 666666666L;
        long R = 4000000000L;
        assertEquals(4000000001L, ellysxors.getXor(L, R));
    }

    @Test
    public void case55() {
        long L = 424242L;
        long R = 3333333333L;
        assertEquals(0L, ellysxors.getXor(L, R));
    }

    @Test
    public void case56() {
        long L = 3450000000L;
        long R = 3550000000L;
        assertEquals(3550000000L, ellysxors.getXor(L, R));
    }

    @Test
    public void case57() {
        long L = 3499999999L;
        long R = 3500000001L;
        assertEquals(3499999998L, ellysxors.getXor(L, R));
    }

    @Test
    public void case58() {
        long L = 3199999999L;
        long R = 3200000001L;
        assertEquals(3199999998L, ellysxors.getXor(L, R));
    }

    @Test
    public void case59() {
        long L = 1500000000L;
        long R = 3200000000L;
        assertEquals(3200000000L, ellysxors.getXor(L, R));
    }

    @Test
    public void case60() {
        long L = 1424242424L;
        long R = 3666666666L;
        assertEquals(3666666667L, ellysxors.getXor(L, R));
    }

    @Test
    public void case61() {
        long L = 130263043L;
        long R = 1177443348L;
        assertEquals(1106113559L, ellysxors.getXor(L, R));
    }

    @Test
    public void case62() {
        long L = 2810981134L;
        long R = 3499790709L;
        assertEquals(0L, ellysxors.getXor(L, R));
    }

    @Test
    public void case63() {
        long L = 2527172019L;
        long R = 3461657195L;
        assertEquals(2527172019L, ellysxors.getXor(L, R));
    }

    @Test
    public void case64() {
        long L = 354992550L;
        long R = 1606742078L;
        assertEquals(1606742078L, ellysxors.getXor(L, R));
    }

    @Test
    public void case65() {
        long L = 1472309589L;
        long R = 2224059869L;
        assertEquals(1472309589L, ellysxors.getXor(L, R));
    }

    @Test
    public void case66() {
        long L = 867820671L;
        long R = 3985937175L;
        assertEquals(867820671L, ellysxors.getXor(L, R));
    }

    @Test
    public void case67() {
        long L = 1897956893L;
        long R = 3035443472L;
        assertEquals(3318593292L, ellysxors.getXor(L, R));
    }

    @Test
    public void case68() {
        long L = 283975837L;
        long R = 933770122L;
        assertEquals(658838295L, ellysxors.getXor(L, R));
    }

    @Test
    public void case69() {
        long L = 3476788076L;
        long R = 3989990996L;
        assertEquals(3989990996L, ellysxors.getXor(L, R));
    }

    @Test
    public void case70() {
        long L = 2595773870L;
        long R = 3624559114L;
        assertEquals(3624559114L, ellysxors.getXor(L, R));
    }

    @Test
    public void case71() {
        long L = 2418495253L;
        long R = 2699053630L;
        assertEquals(818349355L, ellysxors.getXor(L, R));
    }

    @Test
    public void case72() {
        long L = 42960118L;
        long R = 1195813117L;
        assertEquals(0L, ellysxors.getXor(L, R));
    }

    @Test
    public void case73() {
        long L = 842199711L;
        long R = 1659595305L;
        assertEquals(842199710L, ellysxors.getXor(L, R));
    }

    @Test
    public void case74() {
        long L = 1332287090L;
        long R = 1496579640L;
        assertEquals(1496579641L, ellysxors.getXor(L, R));
    }

    @Test
    public void case75() {
        long L = 818324723L;
        long R = 2890422175L;
        assertEquals(818324723L, ellysxors.getXor(L, R));
    }

    @Test
    public void case76() {
        long L = 687152474L;
        long R = 1522117401L;
        assertEquals(0L, ellysxors.getXor(L, R));
    }

    @Test
    public void case77() {
        long L = 566218496L;
        long R = 1053716812L;
        assertEquals(1053716812L, ellysxors.getXor(L, R));
    }

    @Test
    public void case78() {
        long L = 449420940L;
        long R = 1946669556L;
        assertEquals(1946669556L, ellysxors.getXor(L, R));
    }

    @Test
    public void case79() {
        long L = 1864309337L;
        long R = 2771931311L;
        assertEquals(1864309336L, ellysxors.getXor(L, R));
    }

    @Test
    public void case80() {
        long L = 3094639439L;
        long R = 3984867497L;
        assertEquals(3094639438L, ellysxors.getXor(L, R));
    }

    @Test
    public void case81() {
        long L = 314517004L;
        long R = 2425746086L;
        assertEquals(2425746087L, ellysxors.getXor(L, R));
    }

    @Test
    public void case82() {
        long L = 1470596795L;
        long R = 1996872890L;
        assertEquals(547510784L, ellysxors.getXor(L, R));
    }

    @Test
    public void case83() {
        long L = 218065286L;
        long R = 2019768625L;
        assertEquals(0L, ellysxors.getXor(L, R));
    }

    @Test
    public void case84() {
        long L = 1948518086L;
        long R = 3594405127L;
        assertEquals(1L, ellysxors.getXor(L, R));
    }

    @Test
    public void case85() {
        long L = 504951108L;
        long R = 2187256312L;
        assertEquals(2187256312L, ellysxors.getXor(L, R));
    }

    @Test
    public void case86() {
        long L = 2844596960L;
        long R = 3124633025L;
        assertEquals(1L, ellysxors.getXor(L, R));
    }

    @Test
    public void case87() {
        long L = 1146426417L;
        long R = 3222714612L;
        assertEquals(2219027652L, ellysxors.getXor(L, R));
    }

    @Test
    public void case88() {
        long L = 34113053L;
        long R = 2366099053L;
        assertEquals(34113053L, ellysxors.getXor(L, R));
    }

    @Test
    public void case89() {
        long L = 852398326L;
        long R = 2876863866L;
        assertEquals(2876863866L, ellysxors.getXor(L, R));
    }

    @Test
    public void case90() {
        long L = 16232468L;
        long R = 3892549222L;
        assertEquals(3892549223L, ellysxors.getXor(L, R));
    }

    @Test
    public void case91() {
        long L = 1016421603L;
        long R = 3857091265L;
        assertEquals(1016421602L, ellysxors.getXor(L, R));
    }

    @Test
    public void case92() {
        long L = 76576982L;
        long R = 3185129678L;
        assertEquals(3185129678L, ellysxors.getXor(L, R));
    }

    @Test
    public void case93() {
        long L = 1501742132L;
        long R = 3477813612L;
        assertEquals(3477813612L, ellysxors.getXor(L, R));
    }

    @Test
    public void case94() {
        long L = 730722278L;
        long R = 2708003158L;
        assertEquals(2708003158L, ellysxors.getXor(L, R));
    }

    @Test
    public void case95() {
        long L = 75611648L;
        long R = 3307123408L;
        assertEquals(3307123408L, ellysxors.getXor(L, R));
    }

    @Test
    public void case96() {
        long L = 1275177872L;
        long R = 1591680236L;
        assertEquals(1591680236L, ellysxors.getXor(L, R));
    }

    @Test
    public void case97() {
        long L = 3394542013L;
        long R = 3526959612L;
        assertEquals(409843776L, ellysxors.getXor(L, R));
    }

    @Test
    public void case98() {
        long L = 3214926694L;
        long R = 3349611794L;
        assertEquals(3349611794L, ellysxors.getXor(L, R));
    }

    @Test
    public void case99() {
        long L = 2500973784L;
        long R = 3499081632L;
        assertEquals(3499081632L, ellysxors.getXor(L, R));
    }

    @Test
    public void case100() {
        long L = 1017144259L;
        long R = 3881433164L;
        assertEquals(3690568591L, ellysxors.getXor(L, R));
    }

    @Test
    public void case101() {
        long L = 13L;
        long R = 3452523424L;
        assertEquals(3452523436L, ellysxors.getXor(L, R));
    }

    @Test
    public void case102() {
        long L = 123L;
        long R = 4000000000L;
        assertEquals(4000000123L, ellysxors.getXor(L, R));
    }

    @Test
    public void case103() {
        long L = 123L;
        long R = 3999999996L;
        assertEquals(3999999879L, ellysxors.getXor(L, R));
    }

    @Test
    public void case104() {
        long L = 1L;
        long R = 1000000000L;
        assertEquals(1000000000L, ellysxors.getXor(L, R));
    }

    @Test
    public void case105() {
        long L = 40L;
        long R = 4000000000L;
        assertEquals(4000000000L, ellysxors.getXor(L, R));
    }

    @Test
    public void case106() {
        long L = 1L;
        long R = 3009710000L;
        assertEquals(3009710000L, ellysxors.getXor(L, R));
    }

    @Test
    public void case107() {
        long L = 3L;
        long R = 3999999997L;
        assertEquals(2L, ellysxors.getXor(L, R));
    }

    @Test
    public void case108() {
        long L = 1L;
        long R = 3999999999L;
        assertEquals(0L, ellysxors.getXor(L, R));
    }

    @Test
    public void case109() {
        long L = 1L;
        long R = 3999999998L;
        assertEquals(3999999999L, ellysxors.getXor(L, R));
    }

    @Test
    public void case110() {
        long L = 8L;
        long R = 3998899879L;
        assertEquals(0L, ellysxors.getXor(L, R));
    }

    @Test
    public void case111() {
        long L = 4325L;
        long R = 3906300000L;
        assertEquals(3906304132L, ellysxors.getXor(L, R));
    }

    @Test
    public void case112() {
        long L = 1L;
        long R = 2147483648L;
        assertEquals(2147483648L, ellysxors.getXor(L, R));
    }

    @Test
    public void case113() {
        long L = 2L;
        long R = 3000000000L;
        assertEquals(3000000001L, ellysxors.getXor(L, R));
    }

    @Test
    public void case114() {
        long L = 1L;
        long R = 3333333333L;
        assertEquals(1L, ellysxors.getXor(L, R));
    }

    @Test
    public void case115() {
        long L = 2L;
        long R = 3999999988L;
        assertEquals(3999999989L, ellysxors.getXor(L, R));
    }

    @Test
    public void case116() {
        long L = 268435456L;
        long R = 400000000L;
        assertEquals(400000000L, ellysxors.getXor(L, R));
    }

    @Test
    public void case117() {
        long L = 2147483647L;
        long R = 2147483648L;
        assertEquals(4294967295L, ellysxors.getXor(L, R));
    }

    @Test
    public void case118() {
        long L = 4000000000L;
        long R = 4000000000L;
        assertEquals(4000000000L, ellysxors.getXor(L, R));
    }

    @Test
    public void case119() {
        long L = 1L;
        long R = 3000000000L;
        assertEquals(3000000000L, ellysxors.getXor(L, R));
    }

    @Test
    public void case120() {
        long L = 9L;
        long R = 2147483647L;
        assertEquals(8L, ellysxors.getXor(L, R));
    }

    @Test
    public void case121() {
        long L = 17L;
        long R = 3654879452L;
        assertEquals(3654879436L, ellysxors.getXor(L, R));
    }

    @Test
    public void case122() {
        long L = 12325L;
        long R = 3987654236L;
        assertEquals(3987666552L, ellysxors.getXor(L, R));
    }

    @Test
    public void case123() {
        long L = 2L;
        long R = 3999999999L;
        assertEquals(1L, ellysxors.getXor(L, R));
    }

    @Test
    public void case124() {
        long L = 2900000000L;
        long R = 3989929292L;
        assertEquals(3989929292L, ellysxors.getXor(L, R));
    }

    @Test
    public void case125() {
        long L = 2L;
        long R = 3242432545L;
        assertEquals(0L, ellysxors.getXor(L, R));
    }

    @Test
    public void case126() {
        long L = 3221225470L;
        long R = 3221225472L;
        assertEquals(3221225473L, ellysxors.getXor(L, R));
    }

    @Test
    public void case127() {
        long L = 3999999987L;
        long R = 3999999999L;
        assertEquals(3999999987L, ellysxors.getXor(L, R));
    }

    @Test
    public void case128() {
        long L = 5L;
        long R = 3999999997L;
        assertEquals(5L, ellysxors.getXor(L, R));
    }

    @Test
    public void case129() {
        long L = 199L;
        long R = 3456789054L;
        assertEquals(3456789240L, ellysxors.getXor(L, R));
    }

    @Test
    public void case130() {
        long L = 1234567890L;
        long R = 2345678912L;
        assertEquals(2345678913L, ellysxors.getXor(L, R));
    }

    @Test
    public void case131() {
        long L = 3000000000L;
        long R = 4000000000L;
        assertEquals(4000000000L, ellysxors.getXor(L, R));
    }

    @Test
    public void case132() {
        long L = 10000000L;
        long R = 4000000000L;
        assertEquals(4000000000L, ellysxors.getXor(L, R));
    }

    @Test
    public void case133() {
        long L = 1L;
        long R = 999999999L;
        assertEquals(0L, ellysxors.getXor(L, R));
    }

    @Test
    public void case134() {
        long L = 1L;
        long R = 3348991222L;
        assertEquals(3348991223L, ellysxors.getXor(L, R));
    }

    @Test
    public void case135() {
        long L = 1287226651L;
        long R = 1779211297L;
        assertEquals(1287226650L, ellysxors.getXor(L, R));
    }

    @Test
    public void case136() {
        long L = 3723L;
        long R = 3999999999L;
        assertEquals(3723L, ellysxors.getXor(L, R));
    }

    @Test
    public void case137() {
        long L = 3990000000L;
        long R = 4000000000L;
        assertEquals(4000000000L, ellysxors.getXor(L, R));
    }

    @Test
    public void case138() {
        long L = 1253834751L;
        long R = 1253900287L;
        assertEquals(1253834751L, ellysxors.getXor(L, R));
    }

    @Test
    public void case139() {
        long L = 5L;
        long R = 999999999L;
        assertEquals(4L, ellysxors.getXor(L, R));
    }

    @Test
    public void case140() {
        long L = 1073741234L;
        long R = 3023435619L;
        assertEquals(1L, ellysxors.getXor(L, R));
    }

    @Test
    public void case141() {
        long L = 1L;
        long R = 400000000L;
        assertEquals(400000000L, ellysxors.getXor(L, R));
    }

    @Test
    public void case142() {
        long L = 1234567891L;
        long R = 2345678914L;
        assertEquals(3259382416L, ellysxors.getXor(L, R));
    }

    @Test
    public void case143() {
        long L = 3999999999L;
        long R = 3999999999L;
        assertEquals(3999999999L, ellysxors.getXor(L, R));
    }

    @Test
    public void case144() {
        long L = 3376367013L;
        long R = 3814610059L;
        assertEquals(3376367012L, ellysxors.getXor(L, R));
    }

    @Test
    public void case145() {
        long L = 1234567L;
        long R = 3912345678L;
        assertEquals(3911417544L, ellysxors.getXor(L, R));
    }

    @Test
    public void case146() {
        long L = 3800000L;
        long R = 4000000L;
        assertEquals(4000000L, ellysxors.getXor(L, R));
    }

    @Test
    public void case147() {
        long L = 2147483648L;
        long R = 2147483648L;
        assertEquals(2147483648L, ellysxors.getXor(L, R));
    }

    @Test
    public void case148() {
        long L = 9L;
        long R = 3999999998L;
        assertEquals(3999999991L, ellysxors.getXor(L, R));
    }

    @Test
    public void case149() {
        long L = 1L;
        long R = 11L;
        assertEquals(0L, ellysxors.getXor(L, R));
    }

    @Test
    public void case150() {
        long L = 2147483648L;
        long R = 4000000000L;
        assertEquals(4000000000L, ellysxors.getXor(L, R));
    }

    @Test
    public void case151() {
        long L = 1999999999L;
        long R = 3999999998L;
        assertEquals(2573120512L, ellysxors.getXor(L, R));
    }

    @Test
    public void case152() {
        long L = 1L;
        long R = 1999999999L;
        assertEquals(0L, ellysxors.getXor(L, R));
    }

    @Test
    public void case153() {
        long L = 3999000999L;
        long R = 3999000999L;
        assertEquals(3999000999L, ellysxors.getXor(L, R));
    }

    @Test
    public void case154() {
        long L = 3123456789L;
        long R = 3123456791L;
        assertEquals(3123456788L, ellysxors.getXor(L, R));
    }

    @Test
    public void case155() {
        long L = 3900000000L;
        long R = 3932753940L;
        assertEquals(3932753940L, ellysxors.getXor(L, R));
    }

    @Test
    public void case156() {
        long L = 4L;
        long R = 300234003L;
        assertEquals(0L, ellysxors.getXor(L, R));
    }

    @Test
    public void case157() {
        long L = 2L;
        long R = 2L;
        assertEquals(2L, ellysxors.getXor(L, R));
    }

    @Test
    public void case158() {
        long L = 3999999992L;
        long R = 4000000000L;
        assertEquals(4000000000L, ellysxors.getXor(L, R));
    }

    @Test
    public void case159() {
        long L = 1531682046L;
        long R = 2905690008L;
        assertEquals(2905690009L, ellysxors.getXor(L, R));
    }

    @Test
    public void case160() {
        long L = 3994584896L;
        long R = 4000000000L;
        assertEquals(4000000000L, ellysxors.getXor(L, R));
    }

    @Test
    public void case161() {
        long L = 362124L;
        long R = 455288L;
        assertEquals(455288L, ellysxors.getXor(L, R));
    }

    @Test
    public void case162() {
        long L = 4L;
        long R = 5L;
        assertEquals(1L, ellysxors.getXor(L, R));
    }

    @Test
    public void case163() {
        long L = 2000000000L;
        long R = 4000000000L;
        assertEquals(4000000000L, ellysxors.getXor(L, R));
    }

    @Test
    public void case164() {
        long L = 19288744L;
        long R = 1998894898L;
        assertEquals(1998894899L, ellysxors.getXor(L, R));
    }

    @Test
    public void case165() {
        long L = 512L;
        long R = 1024L;
        assertEquals(1024L, ellysxors.getXor(L, R));
    }

}
