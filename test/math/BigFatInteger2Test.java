package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class BigFatInteger2Test {
    BigFatInteger2 bigfatinteger2 = new BigFatInteger2();

    @Test
    public void case1() {
        int A = 6;
        int B = 1;
        int C = 2;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case2() {
        int A = 2;
        int B = 1;
        int C = 6;
        int D = 1;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case3() {
        int A = 1000000000;
        int B = 1000000000;
        int C = 1000000000;
        int D = 200000000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case4() {
        int A = 8;
        int B = 100;
        int C = 4;
        int D = 200;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case5() {
        int A = 999999937;
        int B = 1000000000;
        int C = 999999929;
        int D = 1;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case6() {
        int A = 2;
        int B = 2;
        int C = 4;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case7() {
        int A = 1;
        int B = 1;
        int C = 1;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case8() {
        int A = 1;
        int B = 1;
        int C = 1;
        int D = 1000000000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case9() {
        int A = 1;
        int B = 1000000000;
        int C = 1;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case10() {
        int A = 1;
        int B = 1000000000;
        int C = 1;
        int D = 1000000000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case11() {
        int A = 536870912;
        int B = 1;
        int C = 2;
        int D = 29;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case12() {
        int A = 2;
        int B = 29;
        int C = 536870912;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case13() {
        int A = 536870912;
        int B = 1;
        int C = 2;
        int D = 28;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case14() {
        int A = 2;
        int B = 28;
        int C = 1;
        int D = 536870912;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case15() {
        int A = 268435456;
        int B = 1;
        int C = 2;
        int D = 29;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case16() {
        int A = 2;
        int B = 29;
        int C = 268435456;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case17() {
        int A = 2;
        int B = 1000000000;
        int C = 2;
        int D = 999999999;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case18() {
        int A = 2;
        int B = 999999999;
        int C = 2;
        int D = 1000000000;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case19() {
        int A = 2;
        int B = 1000000000;
        int C = 2;
        int D = 1000000000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case20() {
        int A = 2;
        int B = 999999999;
        int C = 2;
        int D = 999999999;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case21() {
        int A = 1000000000;
        int B = 1000000000;
        int C = 3;
        int D = 1;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case22() {
        int A = 1000000000;
        int B = 1000000000;
        int C = 2;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case23() {
        int A = 1000000000;
        int B = 1000000000;
        int C = 536870912;
        int D = 1000000000;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case24() {
        int A = 1000000000;
        int B = 1000000000;
        int C = 536870912;
        int D = 310344827;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case25() {
        int A = 1000000000;
        int B = 1000000000;
        int C = 536870912;
        int D = 310344828;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case26() {
        int A = 536870912;
        int B = 310344827;
        int C = 1000000000;
        int D = 1000000000;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case27() {
        int A = 536870912;
        int B = 310344828;
        int C = 1000000000;
        int D = 1000000000;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case28() {
        int A = 735134400;
        int B = 1000000000;
        int C = 1;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case29() {
        int A = 1;
        int B = 1;
        int C = 735134400;
        int D = 1000000000;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case30() {
        int A = 1000000000;
        int B = 1000000000;
        int C = 5;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case31() {
        int A = 1000000000;
        int B = 1000000000;
        int C = 7;
        int D = 1;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case32() {
        int A = 1000000000;
        int B = 1000000000;
        int C = 499999999;
        int D = 1;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case33() {
        int A = 1000000000;
        int B = 1000000000;
        int C = 5;
        int D = 1000000000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case34() {
        int A = 1000000000;
        int B = 1000000000;
        int C = 7;
        int D = 1000000000;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case35() {
        int A = 1000000000;
        int B = 1000000000;
        int C = 499999993;
        int D = 1000000000;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case36() {
        int A = 735134400;
        int B = 1000000000;
        int C = 128;
        int D = 1000000000;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case37() {
        int A = 735134400;
        int B = 1000000000;
        int C = 64;
        int D = 1000000000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case38() {
        int A = 735134400;
        int B = 1000000000;
        int C = 1;
        int D = 1000000000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case39() {
        int A = 735134400;
        int B = 1;
        int C = 1;
        int D = 1000000000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case40() {
        int A = 1;
        int B = 1000000000;
        int C = 735134400;
        int D = 1;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case41() {
        int A = 1;
        int B = 1;
        int C = 735134400;
        int D = 1000000000;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case42() {
        int A = 735134400;
        int B = 1000000000;
        int C = 81;
        int D = 1000000000;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case43() {
        int A = 735134400;
        int B = 1000000000;
        int C = 27;
        int D = 1000000000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case44() {
        int A = 735134400;
        int B = 1000000000;
        int C = 125;
        int D = 1000000000;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case45() {
        int A = 735134400;
        int B = 1000000000;
        int C = 25;
        int D = 1000000000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case46() {
        int A = 735134400;
        int B = 1000000000;
        int C = 49;
        int D = 1000000000;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case47() {
        int A = 735134400;
        int B = 1000000000;
        int C = 7;
        int D = 1000000000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case48() {
        int A = 735134400;
        int B = 1000000000;
        int C = 289;
        int D = 1000000000;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case49() {
        int A = 735134400;
        int B = 1000000000;
        int C = 17;
        int D = 1000000000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case50() {
        int A = 735134400;
        int B = 735134400;
        int C = 735134400;
        int D = 735134400;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case51() {
        int A = 735134400;
        int B = 735134400;
        int C = 735134400;
        int D = 735134401;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case52() {
        int A = 735134400;
        int B = 735134401;
        int C = 735134400;
        int D = 735134400;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case53() {
        int A = 735134401;
        int B = 735134400;
        int C = 735134400;
        int D = 735134400;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case54() {
        int A = 735134400;
        int B = 735134400;
        int C = 735134399;
        int D = 735134400;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case55() {
        int A = 1;
        int B = 735134400;
        int C = 1;
        int D = 1000000000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case56() {
        int A = 1;
        int B = 1000000000;
        int C = 1;
        int D = 735134400;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case57() {
        int A = 735134400;
        int B = 1000000000;
        int C = 19;
        int D = 1;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case58() {
        int A = 735134400;
        int B = 19;
        int C = 19;
        int D = 1;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case59() {
        int A = 735134400;
        int B = 190000000;
        int C = 19;
        int D = 1;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case60() {
        int A = 19;
        int B = 1000000000;
        int C = 735134400;
        int D = 1;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case61() {
        int A = 893871739;
        int B = 1000000000;
        int C = 735134400;
        int D = 1;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case62() {
        int A = 735134400;
        int B = 1000000000;
        int C = 6;
        int D = 1000000000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case63() {
        int A = 735134400;
        int B = 333333333;
        int C = 6;
        int D = 1000000000;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case64() {
        int A = 735134400;
        int B = 333333334;
        int C = 6;
        int D = 1000000000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case65() {
        int A = 735134400;
        int B = 1000000000;
        int C = 38;
        int D = 1;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case66() {
        int A = 735134400;
        int B = 1000000000;
        int C = 499999993;
        int D = 1;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case67() {
        int A = 735134400;
        int B = 1000000000;
        int C = 999999986;
        int D = 1;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case68() {
        int A = 735134400;
        int B = 1000000000;
        int C = 1001;
        int D = 1000000000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case69() {
        int A = 735134400;
        int B = 1000000000;
        int C = 539;
        int D = 1000000000;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case70() {
        int A = 735134400;
        int B = 1000000000;
        int C = 17017;
        int D = 1000000000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case71() {
        int A = 735134400;
        int B = 1000000000;
        int C = 1089088;
        int D = 1000000000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case72() {
        int A = 735134400;
        int B = 1000000000;
        int C = 2178176;
        int D = 1000000000;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case73() {
        int A = 735134400;
        int B = 1000000000;
        int C = 119119;
        int D = 1000000000;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case74() {
        int A = 999999986;
        int B = 1000000000;
        int C = 499999993;
        int D = 1000000000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case75() {
        int A = 999999986;
        int B = 500000000;
        int C = 499999993;
        int D = 1000000000;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case76() {
        int A = 999999986;
        int B = 999999999;
        int C = 499999993;
        int D = 1000000000;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case77() {
        int A = 219942934;
        int B = 43269322;
        int C = 1;
        int D = 820993374;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case78() {
        int A = 561775197;
        int B = 149619151;
        int C = 1;
        int D = 929044644;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case79() {
        int A = 659685519;
        int B = 110147994;
        int C = 779463;
        int D = 13769428;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case80() {
        int A = 38472105;
        int B = 756972955;
        int C = 50575;
        int D = 530305282;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case81() {
        int A = 394687114;
        int B = 705849357;
        int C = 1;
        int D = 95629725;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case82() {
        int A = 241088416;
        int B = 50831540;
        int C = 2888;
        int D = 501917017;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case83() {
        int A = 879870294;
        int B = 895545761;
        int C = 4720614;
        int D = 768890488;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case84() {
        int A = 209605949;
        int B = 697961530;
        int C = 7;
        int D = 187286796;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case85() {
        int A = 859878656;
        int B = 54786088;
        int C = 448;
        int D = 147002405;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case86() {
        int A = 57044397;
        int B = 762893753;
        int C = 171133191;
        int D = 614797652;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case87() {
        int A = 261752654;
        int B = 945121959;
        int C = 151321;
        int D = 459718045;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case88() {
        int A = 469197874;
        int B = 929044313;
        int C = 18769;
        int D = 110614328;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case89() {
        int A = 108275182;
        int B = 139011618;
        int C = 417698;
        int D = 881972308;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case90() {
        int A = 896561917;
        int B = 501393560;
        int C = 1;
        int D = 223343009;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case91() {
        int A = 313755552;
        int B = 895797510;
        int C = 726;
        int D = 447721131;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case92() {
        int A = 783329207;
        int B = 487540990;
        int C = 152276659;
        int D = 541080736;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case93() {
        int A = 675411355;
        int B = 17135195;
        int C = 5;
        int D = 707924448;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case94() {
        int A = 356139952;
        int B = 936201658;
        int C = 204166438;
        int D = 261956397;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case95() {
        int A = 601961158;
        int B = 103354717;
        int C = 1;
        int D = 814751855;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case96() {
        int A = 834681413;
        int B = 978359937;
        int C = 505861;
        int D = 695969472;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case97() {
        int A = 967842375;
        int B = 702280293;
        int C = 32625;
        int D = 104881887;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case98() {
        int A = 357826511;
        int B = 71976306;
        int C = 49;
        int D = 35601126;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case99() {
        int A = 60260282;
        int B = 446091527;
        int C = 2;
        int D = 768992824;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case100() {
        int A = 702200768;
        int B = 27669875;
        int C = 856;
        int D = 57808042;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case101() {
        int A = 313223487;
        int B = 398288011;
        int C = 11785489;
        int D = 758305270;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case102() {
        int A = 886034260;
        int B = 66971049;
        int C = 50;
        int D = 946030584;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case103() {
        int A = 804882763;
        int B = 782033348;
        int C = 39601;
        int D = 86285273;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case104() {
        int A = 617551354;
        int B = 228730412;
        int C = 39242;
        int D = 816728268;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case105() {
        int A = 449251709;
        int B = 838908210;
        int C = 3708911;
        int D = 304763421;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case106() {
        int A = 792627070;
        int B = 714608989;
        int C = 71705;
        int D = 153004242;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case107() {
        int A = 562161600;
        int B = 542214426;
        int C = 109621512;
        int D = 600957211;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case108() {
        int A = 306028800;
        int B = 597685981;
        int C = 6125;
        int D = 458916177;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case109() {
        int A = 615384000;
        int B = 650319600;
        int C = 202392960;
        int D = 921692260;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case110() {
        int A = 544471200;
        int B = 111796199;
        int C = 228677904;
        int D = 162129201;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case111() {
        int A = 578340000;
        int B = 769471991;
        int C = 29767500;
        int D = 388262254;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case112() {
        int A = 228463200;
        int B = 71156505;
        int C = 7555;
        int D = 878923097;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case113() {
        int A = 634737600;
        int B = 824322099;
        int C = 10125;
        int D = 632936925;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case114() {
        int A = 93592800;
        int B = 599002587;
        int C = 43676640;
        int D = 709600140;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case115() {
        int A = 218937600;
        int B = 3970848;
        int C = 530728200;
        int D = 222588141;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case116() {
        int A = 451180800;
        int B = 486423640;
        int C = 567000;
        int D = 795546557;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case117() {
        int A = 516196800;
        int B = 149206859;
        int C = 50185800;
        int D = 997329401;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case118() {
        int A = 817840800;
        int B = 150566077;
        int C = 955737846;
        int D = 488691289;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case119() {
        int A = 641844000;
        int B = 136660747;
        int C = 59430;
        int D = 258517732;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case120() {
        int A = 894499200;
        int B = 823530997;
        int C = 3400;
        int D = 663422534;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case121() {
        int A = 224985600;
        int B = 230318015;
        int C = 813697920;
        int D = 402367158;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case122() {
        int A = 82252800;
        int B = 932006942;
        int C = 16660;
        int D = 383190157;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case123() {
        int A = 476582400;
        int B = 504473657;
        int C = 3546000;
        int D = 142291335;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case124() {
        int A = 558532800;
        int B = 117693136;
        int C = 2700;
        int D = 644194400;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case125() {
        int A = 282592800;
        int B = 303112399;
        int C = 14129640;
        int D = 823610008;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case126() {
        int A = 622036800;
        int B = 369985966;
        int C = 52272000;
        int D = 49668206;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case127() {
        int A = 347608800;
        int B = 70277528;
        int C = 1966272;
        int D = 570589006;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case128() {
        int A = 337327200;
        int B = 653836281;
        int C = 126000;
        int D = 544942811;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case129() {
        int A = 683726400;
        int B = 15677860;
        int C = 374544000;
        int D = 928062402;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case130() {
        int A = 226044000;
        int B = 84155;
        int C = 101430;
        int D = 443866337;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case131() {
        int A = 343072800;
        int B = 987557161;
        int C = 525;
        int D = 175189775;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case132() {
        int A = 647136000;
        int B = 525199041;
        int C = 378;
        int D = 582301806;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case133() {
        int A = 802267200;
        int B = 963258645;
        int C = 11113200;
        int D = 365488184;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case134() {
        int A = 497750400;
        int B = 123907683;
        int C = 74070;
        int D = 904778364;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case135() {
        int A = 871365600;
        int B = 653120524;
        int C = 285600;
        int D = 279187295;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case136() {
        int A = 776109600;
        int B = 288347633;
        int C = 451137600;
        int D = 225913046;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case137() {
        int A = 1001;
        int B = 100000;
        int C = 997;
        int D = 100000;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case138() {
        int A = 999999937;
        int B = 1000000000;
        int C = 999999929;
        int D = 999999999;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case139() {
        int A = 99999999;
        int B = 99999999;
        int C = 99999999;
        int D = 99999999;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case140() {
        int A = 2;
        int B = 4;
        int C = 4;
        int D = 2;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case141() {
        int A = 8;
        int B = 5;
        int C = 8;
        int D = 6;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case142() {
        int A = 18;
        int B = 50;
        int C = 12;
        int D = 20;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case143() {
        int A = 2;
        int B = 2;
        int C = 1;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case144() {
        int A = 4;
        int B = 1;
        int C = 2;
        int D = 4;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case145() {
        int A = 133333;
        int B = 133333;
        int C = 133333;
        int D = 133333;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case146() {
        int A = 2;
        int B = 1000000000;
        int C = 4;
        int D = 50000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case147() {
        int A = 2;
        int B = 4;
        int C = 1;
        int D = 5;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case148() {
        int A = 1000000000;
        int B = 1000000000;
        int C = 1000000000;
        int D = 1000000000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case149() {
        int A = 1000000000;
        int B = 1000000000;
        int C = 999999991;
        int D = 871826262;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case150() {
        int A = 999999999;
        int B = 999999999;
        int C = 333333333;
        int D = 333333333;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case151() {
        int A = 3;
        int B = 1;
        int C = 3;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case152() {
        int A = 10;
        int B = 1;
        int C = 1;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case153() {
        int A = 1;
        int B = 12;
        int C = 1;
        int D = 13;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case154() {
        int A = 1;
        int B = 2;
        int C = 1;
        int D = 5;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case155() {
        int A = 2342;
        int B = 123123;
        int C = 1231231;
        int D = 123123;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case156() {
        int A = 16;
        int B = 3;
        int C = 2;
        int D = 4;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case157() {
        int A = 1;
        int B = 2;
        int C = 1;
        int D = 2;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case158() {
        int A = 3;
        int B = 5;
        int C = 3;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case159() {
        int A = 1000000000;
        int B = 1000000000;
        int C = 999999929;
        int D = 999999999;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case160() {
        int A = 333333333;
        int B = 100;
        int C = 999999999;
        int D = 3;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case161() {
        int A = 6;
        int B = 2;
        int C = 4;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case162() {
        int A = 999999937;
        int B = 1000000000;
        int C = 999999929;
        int D = 99999999;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case163() {
        int A = 245;
        int B = 2;
        int C = 175;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case164() {
        int A = 1000000000;
        int B = 1000000000;
        int C = 1000000;
        int D = 100000000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case165() {
        int A = 3;
        int B = 4;
        int C = 9;
        int D = 2;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case166() {
        int A = 1000000000;
        int B = 1000000000;
        int C = 999999999;
        int D = 1000000000;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case167() {
        int A = 3;
        int B = 1000000;
        int C = 7;
        int D = 10000000;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case168() {
        int A = 900000000;
        int B = 1000000000;
        int C = 999999999;
        int D = 999999999;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case169() {
        int A = 12;
        int B = 100000000;
        int C = 9;
        int D = 1000000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case170() {
        int A = 1999966;
        int B = 1000000000;
        int C = 999983;
        int D = 5000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case171() {
        int A = 45;
        int B = 57;
        int C = 45;
        int D = 23;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case172() {
        int A = 1;
        int B = 1;
        int C = 1;
        int D = 11;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case173() {
        int A = 512;
        int B = 1000000000;
        int C = 2;
        int D = 1000000000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case174() {
        int A = 5;
        int B = 1;
        int C = 1;
        int D = 100;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case175() {
        int A = 7;
        int B = 1;
        int C = 1;
        int D = 1000000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case176() {
        int A = 2;
        int B = 2;
        int C = 3;
        int D = 1;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case177() {
        int A = 100000009;
        int B = 1000000000;
        int C = 100000009;
        int D = 1000000000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case178() {
        int A = 3;
        int B = 1;
        int C = 1;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case179() {
        int A = 4;
        int B = 300;
        int C = 8;
        int D = 200;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case180() {
        int A = 18;
        int B = 3;
        int C = 24;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case181() {
        int A = 12;
        int B = 2;
        int C = 2;
        int D = 3;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case182() {
        int A = 7;
        int B = 1;
        int C = 100000;
        int D = 1;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case183() {
        int A = 1000000000;
        int B = 10;
        int C = 1000000000;
        int D = 10;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case184() {
        int A = 3;
        int B = 4;
        int C = 3;
        int D = 3;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case185() {
        int A = 5;
        int B = 1000000000;
        int C = 2;
        int D = 1000000000;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case186() {
        int A = 32;
        int B = 6;
        int C = 8;
        int D = 9;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case187() {
        int A = 3;
        int B = 1;
        int C = 3;
        int D = 2;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case188() {
        int A = 39;
        int B = 29999999;
        int C = 4563;
        int D = 9999999;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case189() {
        int A = 1024;
        int B = 524288;
        int C = 1024;
        int D = 262144;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case190() {
        int A = 2;
        int B = 2;
        int C = 6;
        int D = 1;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case191() {
        int A = 100000000;
        int B = 100000;
        int C = 10000;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case192() {
        int A = 8;
        int B = 1;
        int C = 2;
        int D = 2;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case193() {
        int A = 1024;
        int B = 2048;
        int C = 512;
        int D = 128;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case194() {
        int A = 18;
        int B = 10;
        int C = 27;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case195() {
        int A = 10;
        int B = 3;
        int C = 100;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case196() {
        int A = 4;
        int B = 4;
        int C = 2;
        int D = 6;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case197() {
        int A = 1000000000;
        int B = 100000000;
        int C = 1000000000;
        int D = 1000000000;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case198() {
        int A = 4;
        int B = 1;
        int C = 2;
        int D = 2;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case199() {
        int A = 2;
        int B = 1;
        int C = 2;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case200() {
        int A = 4;
        int B = 1;
        int C = 1;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case201() {
        int A = 6;
        int B = 1;
        int C = 6;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case202() {
        int A = 6;
        int B = 1;
        int C = 4;
        int D = 1;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case203() {
        int A = 6;
        int B = 4;
        int C = 4;
        int D = 2;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case204() {
        int A = 6;
        int B = 4;
        int C = 9;
        int D = 2;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case205() {
        int A = 18;
        int B = 1;
        int C = 3;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case206() {
        int A = 10;
        int B = 1;
        int C = 10;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case207() {
        int A = 1;
        int B = 1;
        int C = 1;
        int D = 2;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case208() {
        int A = 100000000;
        int B = 100000000;
        int C = 2345677;
        int D = 23456;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case209() {
        int A = 24;
        int B = 3;
        int C = 54;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case210() {
        int A = 36;
        int B = 2;
        int C = 8;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case211() {
        int A = 536870912;
        int B = 1000000000;
        int C = 2;
        int D = 2;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case212() {
        int A = 472882027;
        int B = 452930459;
        int C = 433024223;
        int D = 413158511;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case213() {
        int A = 100;
        int B = 6;
        int C = 5;
        int D = 3;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case214() {
        int A = 4;
        int B = 4;
        int C = 8;
        int D = 2;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case215() {
        int A = 1;
        int B = 1;
        int C = 1;
        int D = 5;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case216() {
        int A = 1;
        int B = 23;
        int C = 3;
        int D = 4;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case217() {
        int A = 3;
        int B = 2;
        int C = 1;
        int D = 2;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case218() {
        int A = 9801;
        int B = 100000;
        int C = 96059601;
        int D = 999999999;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case219() {
        int A = 12;
        int B = 1000000000;
        int C = 8;
        int D = 100000000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case220() {
        int A = 999999937;
        int B = 999999937;
        int C = 999999929;
        int D = 999999929;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case221() {
        int A = 100000000;
        int B = 10000000;
        int C = 10000000;
        int D = 10000000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case222() {
        int A = 324;
        int B = 10;
        int C = 243;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case223() {
        int A = 3;
        int B = 3;
        int C = 9;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case224() {
        int A = 999999997;
        int B = 999999999;
        int C = 999999996;
        int D = 989938499;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case225() {
        int A = 3;
        int B = 2;
        int C = 7;
        int D = 1;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case226() {
        int A = 27;
        int B = 100;
        int C = 243;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case227() {
        int A = 60;
        int B = 1000000000;
        int C = 2;
        int D = 1000000000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case228() {
        int A = 1000000000;
        int B = 1000000000;
        int C = 1000000000;
        int D = 999999999;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case229() {
        int A = 1000000000;
        int B = 1000000000;
        int C = 2;
        int D = 1000000000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case230() {
        int A = 1;
        int B = 1000000000;
        int C = 1000000000;
        int D = 1000;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case231() {
        int A = 1000000000;
        int B = 999999999;
        int C = 999999999;
        int D = 999999999;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case232() {
        int A = 24;
        int B = 2;
        int C = 18;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case233() {
        int A = 100000000;
        int B = 1000000000;
        int C = 1000000000;
        int D = 1000000000;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case234() {
        int A = 2;
        int B = 4;
        int C = 3;
        int D = 2;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case235() {
        int A = 5;
        int B = 1;
        int C = 1;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case236() {
        int A = 2;
        int B = 1;
        int C = 2;
        int D = 4;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case237() {
        int A = 1;
        int B = 12;
        int C = 2;
        int D = 13;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case238() {
        int A = 6;
        int B = 1000000000;
        int C = 12;
        int D = 500000000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case239() {
        int A = 999999999;
        int B = 999999999;
        int C = 999999999;
        int D = 999999999;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case240() {
        int A = 30;
        int B = 1;
        int C = 10;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case241() {
        int A = 169;
        int B = 1;
        int C = 13;
        int D = 2;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case242() {
        int A = 10;
        int B = 3;
        int C = 20;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case243() {
        int A = 923456789;
        int B = 912312554;
        int C = 912312554;
        int D = 923456789;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case244() {
        int A = 3;
        int B = 2;
        int C = 9;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case245() {
        int A = 1000000000;
        int B = 1000;
        int C = 10000000;
        int D = 10;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case246() {
        int A = 6;
        int B = 2;
        int C = 2;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case247() {
        int A = 18;
        int B = 2;
        int C = 12;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case248() {
        int A = 3;
        int B = 6;
        int C = 2;
        int D = 2;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case249() {
        int A = 10;
        int B = 2;
        int C = 6;
        int D = 2;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case250() {
        int A = 10;
        int B = 20;
        int C = 20;
        int D = 2;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case251() {
        int A = 15;
        int B = 3;
        int C = 25;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case252() {
        int A = 12;
        int B = 1000;
        int C = 27;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case253() {
        int A = 1000000000;
        int B = 1000000000;
        int C = 1;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case254() {
        int A = 54;
        int B = 100;
        int C = 243;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case255() {
        int A = 8;
        int B = 2;
        int C = 4;
        int D = 3;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case256() {
        int A = 9;
        int B = 1;
        int C = 3;
        int D = 2;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case257() {
        int A = 1152;
        int B = 4;
        int C = 11664;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case258() {
        int A = 2;
        int B = 3;
        int C = 2;
        int D = 3;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case259() {
        int A = 10;
        int B = 2;
        int C = 2;
        int D = 3;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case260() {
        int A = 39916801;
        int B = 2;
        int C = 39916801;
        int D = 100;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case261() {
        int A = 1000000000;
        int B = 1000000000;
        int C = 1;
        int D = 1000000000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case262() {
        int A = 8;
        int B = 1;
        int C = 2;
        int D = 3;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case263() {
        int A = 256;
        int B = 1;
        int C = 8;
        int D = 5;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case264() {
        int A = 4;
        int B = 1000;
        int C = 2;
        int D = 2000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case265() {
        int A = 12;
        int B = 4;
        int C = 18;
        int D = 2;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case266() {
        int A = 7;
        int B = 1;
        int C = 1;
        int D = 10;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case267() {
        int A = 6;
        int B = 4;
        int C = 8;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case268() {
        int A = 120;
        int B = 3;
        int C = 10;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case269() {
        int A = 100;
        int B = 1;
        int C = 1000001;
        int D = 1;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case270() {
        int A = 20;
        int B = 4;
        int C = 2;
        int D = 3;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case271() {
        int A = 4;
        int B = 1;
        int C = 64;
        int D = 1;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case272() {
        int A = 16;
        int B = 100;
        int C = 4;
        int D = 200;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case273() {
        int A = 30;
        int B = 2;
        int C = 12;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case274() {
        int A = 6;
        int B = 8;
        int C = 12;
        int D = 4;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case275() {
        int A = 2;
        int B = 3;
        int C = 2;
        int D = 5;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case276() {
        int A = 536870912;
        int B = 999999998;
        int C = 268435456;
        int D = 999999999;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case277() {
        int A = 216;
        int B = 2;
        int C = 6;
        int D = 3;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case278() {
        int A = 9;
        int B = 1;
        int C = 3;
        int D = 200;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case279() {
        int A = 6;
        int B = 3;
        int C = 4;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case280() {
        int A = 536870912;
        int B = 1000000000;
        int C = 2;
        int D = 3;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case281() {
        int A = 100000001;
        int B = 1000000000;
        int C = 1000000000;
        int D = 200000000;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case282() {
        int A = 2;
        int B = 1;
        int C = 1;
        int D = 100;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case283() {
        int A = 1000;
        int B = 120;
        int C = 1;
        int D = 212;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case284() {
        int A = 999999937;
        int B = 999999929;
        int C = 999999893;
        int D = 999999937;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case285() {
        int A = 1000000000;
        int B = 999999999;
        int C = 1000000000;
        int D = 1000000000;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case286() {
        int A = 999900017;
        int B = 64743;
        int C = 999900017;
        int D = 7777777;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case287() {
        int A = 2;
        int B = 10000005;
        int C = 3;
        int D = 10000005;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case288() {
        int A = 18;
        int B = 5;
        int C = 12;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case289() {
        int A = 999999937;
        int B = 100000;
        int C = 999999929;
        int D = 100000;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case290() {
        int A = 2;
        int B = 2;
        int C = 3;
        int D = 2;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case291() {
        int A = 19;
        int B = 2;
        int C = 3;
        int D = 2;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case292() {
        int A = 33554432;
        int B = 1000000000;
        int C = 2;
        int D = 1000000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case293() {
        int A = 2;
        int B = 1;
        int C = 4;
        int D = 1;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case294() {
        int A = 39;
        int B = 29999999;
        int C = 4563;
        int D = 10000000;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case295() {
        int A = 1;
        int B = 1;
        int C = 1;
        int D = 1000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case296() {
        int A = 10;
        int B = 2;
        int C = 1;
        int D = 1000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case297() {
        int A = 200;
        int B = 4;
        int C = 400;
        int D = 3;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case298() {
        int A = 5;
        int B = 999999999;
        int C = 2;
        int D = 1000000000;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case299() {
        int A = 2;
        int B = 2;
        int C = 2;
        int D = 3;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case300() {
        int A = 12;
        int B = 100000000;
        int C = 9;
        int D = 100000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case301() {
        int A = 2;
        int B = 7;
        int C = 16;
        int D = 10;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case302() {
        int A = 200000014;
        int B = 1;
        int C = 20000038;
        int D = 1;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case303() {
        int A = 999999937;
        int B = 999999999;
        int C = 999999929;
        int D = 999999999;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case304() {
        int A = 1029;
        int B = 4;
        int C = 81;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case305() {
        int A = 100;
        int B = 100003;
        int C = 100003;
        int D = 100003;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case306() {
        int A = 13;
        int B = 100000000;
        int C = 9;
        int D = 100000;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case307() {
        int A = 1;
        int B = 100;
        int C = 1;
        int D = 200;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case308() {
        int A = 982451653;
        int B = 1000000000;
        int C = 982451707;
        int D = 1000000000;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case309() {
        int A = 10000000;
        int B = 1000000;
        int C = 1000000;
        int D = 1000000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case310() {
        int A = 24;
        int B = 2;
        int C = 16;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case311() {
        int A = 1;
        int B = 1000000000;
        int C = 1000000000;
        int D = 1;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case312() {
        int A = 1000000000;
        int B = 100000000;
        int C = 500000000;
        int D = 100000000;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case313() {
        int A = 12;
        int B = 3;
        int C = 9;
        int D = 1;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case314() {
        int A = 100;
        int B = 9;
        int C = 98;
        int D = 9;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case315() {
        int A = 1;
        int B = 2;
        int C = 1;
        int D = 3;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case316() {
        int A = 1;
        int B = 1;
        int C = 1;
        int D = 44;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case317() {
        int A = 6;
        int B = 2;
        int C = 3;
        int D = 4;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case318() {
        int A = 327305250;
        int B = 2;
        int C = 18;
        int D = 8;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case319() {
        int A = 4;
        int B = 16;
        int C = 2;
        int D = 29;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case320() {
        int A = 999983;
        int B = 999983;
        int C = 999979;
        int D = 999979;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case321() {
        int A = 1;
        int B = 1000000000;
        int C = 7;
        int D = 10;
        assertEquals("not divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case322() {
        int A = 2000000;
        int B = 10;
        int C = 10000000;
        int D = 2;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

    @Test
    public void case323() {
        int A = 3;
        int B = 5;
        int C = 1;
        int D = 3;
        assertEquals("divisible", bigfatinteger2.isDivisible(A, B, C, D));
    }

}
