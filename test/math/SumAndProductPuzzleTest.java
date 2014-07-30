package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class SumAndProductPuzzleTest {
    SumAndProductPuzzle sumandproductpuzzle = new SumAndProductPuzzle();

    @Test
    public void case1() {
        int A = 30;
        int B = 33;
        assertEquals(33L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case2() {
        int A = 8;
        int B = 11;
        assertEquals(19L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case3() {
        int A = 40;
        int B = 43;
        assertEquals(0L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case4() {
        int A = 47;
        int B = 74;
        assertEquals(168L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case5() {
        int A = 4980000;
        int B = 5000000;
        assertEquals(2874227618L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case6() {
        int A = 1;
        int B = 5000000;
        assertEquals(392026464258L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case7() {
        int A = 15;
        int B = 17;
        assertEquals(16L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case8() {
        int A = 5;
        int B = 13;
        assertEquals(24L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case9() {
        int A = 5;
        int B = 17;
        assertEquals(40L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case10() {
        int A = 6;
        int B = 10;
        assertEquals(19L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case11() {
        int A = 11;
        int B = 24;
        assertEquals(16L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case12() {
        int A = 22;
        int B = 23;
        assertEquals(0L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case13() {
        int A = 13;
        int B = 21;
        assertEquals(16L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case14() {
        int A = 13;
        int B = 21;
        assertEquals(16L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case15() {
        int A = 3;
        int B = 18;
        assertEquals(40L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case16() {
        int A = 12;
        int B = 15;
        assertEquals(0L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case17() {
        int A = 22;
        int B = 23;
        assertEquals(0L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case18() {
        int A = 1;
        int B = 20;
        assertEquals(40L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case19() {
        int A = 25;
        int B = 26;
        assertEquals(0L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case20() {
        int A = 20;
        int B = 28;
        assertEquals(28L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case21() {
        int A = 4;
        int B = 8;
        assertEquals(5L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case22() {
        int A = 12;
        int B = 29;
        assertEquals(44L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case23() {
        int A = 12;
        int B = 27;
        assertEquals(16L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case24() {
        int A = 1;
        int B = 18;
        assertEquals(40L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case25() {
        int A = 2;
        int B = 29;
        assertEquals(68L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case26() {
        int A = 7;
        int B = 18;
        assertEquals(35L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case27() {
        int A = 1347866;
        int B = 4245274;
        assertEquals(254951623100L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case28() {
        int A = 78647;
        int B = 3866303;
        assertEquals(240482270682L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case29() {
        int A = 626694;
        int B = 4200990;
        assertEquals(274286187172L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case30() {
        int A = 501858;
        int B = 4855606;
        assertEquals(366114754286L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case31() {
        int A = 2558519;
        int B = 2618585;
        assertEquals(4866755098L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case32() {
        int A = 1041268;
        int B = 4275773;
        assertEquals(271654676094L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case33() {
        int A = 590189;
        int B = 1663440;
        assertEquals(41894087002L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case34() {
        int A = 128262;
        int B = 4752069;
        assertEquals(355859819064L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case35() {
        int A = 1213400;
        int B = 4604548;
        assertEquals(308916063788L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case36() {
        int A = 171253;
        int B = 673440;
        assertEquals(8221024922L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case37() {
        int A = 2180911;
        int B = 2447952;
        assertEquals(19805432274L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case38() {
        int A = 1747735;
        int B = 4742564;
        assertEquals(301190276756L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case39() {
        int A = 90090;
        int B = 4939854;
        assertEquals(382998880466L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case40() {
        int A = 308211;
        int B = 4268526;
        assertEquals(288842106980L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case41() {
        int A = 250598;
        int B = 2171107;
        assertEquals(79502941394L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case42() {
        int A = 259068;
        int B = 1011368;
        assertEquals(17606373208L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case43() {
        int A = 3332594;
        int B = 3758415;
        assertEquals(46531557844L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case44() {
        int A = 1569173;
        int B = 4642734;
        assertEquals(297136496444L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case45() {
        int A = 401656;
        int B = 2547531;
        assertEquals(105892099896L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case46() {
        int A = 151690;
        int B = 4846636;
        assertEquals(369408454970L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case47() {
        int A = 1325612;
        int B = 3414096;
        assertEquals(158049133594L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case48() {
        int A = 975190;
        int B = 3676706;
        assertEquals(200908517284L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case49() {
        int A = 425569;
        int B = 3666311;
        assertEquals(213756358198L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case50() {
        int A = 4753151;
        int B = 4774294;
        assertEquals(3034569684L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case51() {
        int A = 2406120;
        int B = 4518476;
        assertEquals(225774917766L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case52() {
        int A = 2105869;
        int B = 4621606;
        assertEquals(261698106156L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case53() {
        int A = 913974;
        int B = 2468151;
        assertEquals(87205286804L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case54() {
        int A = 264082;
        int B = 4825867;
        assertEquals(365533145218L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case55() {
        int A = 3701335;
        int B = 4535374;
        assertEquals(105004456396L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case56() {
        int A = 459629;
        int B = 4788598;
        assertEquals(357314020636L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case57() {
        int A = 2452205;
        int B = 4418972;
        assertEquals(209096793338L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case58() {
        int A = 3692128;
        int B = 4599480;
        assertEquals(114801190330L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case59() {
        int A = 81633;
        int B = 1196094;
        assertEquals(25961040798L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case60() {
        int A = 2500605;
        int B = 2620114;
        assertEquals(9655063314L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case61() {
        int A = 907944;
        int B = 4950312;
        assertEquals(369202414974L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case62() {
        int A = 791984;
        int B = 4828506;
        assertEquals(355459409212L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case63() {
        int A = 1964561;
        int B = 3683117;
        assertEquals(152387901286L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case64() {
        int A = 2115028;
        int B = 3167912;
        assertEquals(88076238156L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case65() {
        int A = 251170;
        int B = 941934;
        assertEquals(15252708160L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case66() {
        int A = 3359895;
        int B = 4351447;
        assertEquals(117422622974L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case67() {
        int A = 60909;
        int B = 4938122;
        assertEquals(382895840476L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case68() {
        int A = 494255;
        int B = 4760556;
        assertEquals(352600447656L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case69() {
        int A = 71002;
        int B = 3687118;
        assertEquals(219700255080L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case70() {
        int A = 1390829;
        int B = 4628259;
        assertEquals(304127711348L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case71() {
        int A = 790626;
        int B = 2694221;
        assertEquals(109456726296L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case72() {
        int A = 203626;
        int B = 2146445;
        assertEquals(78237772558L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case73() {
        int A = 576063;
        int B = 4190821;
        assertEquals(273988126066L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case74() {
        int A = 1830233;
        int B = 4491013;
        assertEquals(261518848160L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case75() {
        int A = 105621;
        int B = 4294866;
        assertEquals(294159829916L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case76() {
        int A = 3585153;
        int B = 3697722;
        assertEquals(12173089064L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case77() {
        int A = 12;
        int B = 4999983;
        assertEquals(392026464234L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case78() {
        int A = 10;
        int B = 4999989;
        assertEquals(392026464244L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case79() {
        int A = 7;
        int B = 4999974;
        assertEquals(392021464273L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case80() {
        int A = 18;
        int B = 4999977;
        assertEquals(392021464238L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case81() {
        int A = 3;
        int B = 4999979;
        assertEquals(392021464278L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case82() {
        int A = 6;
        int B = 4999988;
        assertEquals(392026464253L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case83() {
        int A = 12;
        int B = 4999973;
        assertEquals(392021464254L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case84() {
        int A = 2;
        int B = 4999999;
        assertEquals(392026464258L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case85() {
        int A = 14;
        int B = 4999977;
        assertEquals(392021464254L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case86() {
        int A = 15;
        int B = 4999979;
        assertEquals(392021464254L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case87() {
        int A = 5;
        int B = 4999978;
        assertEquals(392021464278L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case88() {
        int A = 13;
        int B = 4999976;
        assertEquals(392021464254L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case89() {
        int A = 22;
        int B = 4999973;
        assertEquals(392021464238L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case90() {
        int A = 23;
        int B = 4999977;
        assertEquals(392021464238L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case91() {
        int A = 3;
        int B = 4999971;
        assertEquals(392021464278L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case92() {
        int A = 3;
        int B = 4999992;
        assertEquals(392026464258L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case93() {
        int A = 15;
        int B = 4999980;
        assertEquals(392026464234L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case94() {
        int A = 27;
        int B = 4999971;
        assertEquals(392021464238L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case95() {
        int A = 9;
        int B = 4999981;
        assertEquals(392026464253L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case96() {
        int A = 2;
        int B = 4999990;
        assertEquals(392026464258L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case97() {
        int A = 1;
        int B = 2;
        assertEquals(0L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case98() {
        int A = 1;
        int B = 4999900;
        assertEquals(391996464642L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case99() {
        int A = 2;
        int B = 5000000;
        assertEquals(392026464258L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case100() {
        int A = 123;
        int B = 5000000;
        assertEquals(392026463317L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case101() {
        int A = 11;
        int B = 4999987;
        assertEquals(392026464234L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case102() {
        int A = 10000;
        int B = 4990000;
        assertEquals(390524699790L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case103() {
        int A = 3435;
        int B = 5000000;
        assertEquals(392026002752L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case104() {
        int A = 1;
        int B = 4888888;
        assertEquals(375946584324L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case105() {
        int A = 15;
        int B = 5000000;
        assertEquals(392026464234L, sumandproductpuzzle.getSum(A, B));
    }

    @Test
    public void case106() {
        int A = 1;
        int B = 4985799;
        assertEquals(390019194838L, sumandproductpuzzle.getSum(A, B));
    }

}
