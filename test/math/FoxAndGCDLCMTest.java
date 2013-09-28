package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class FoxAndGCDLCMTest {
    FoxAndGCDLCM foxandgcdlcm = new FoxAndGCDLCM();

    @Test
    public void case1() {
        long G = 2L;
        long L = 20L;
        assertEquals(14L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case2() {
        long G = 5L;
        long L = 8L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case3() {
        long G = 1000L;
        long L = 100L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case4() {
        long G = 100L;
        long L = 1000L;
        assertEquals(700L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case5() {
        long G = 10L;
        long L = 950863963000L;
        assertEquals(6298430L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case6() {
        long G = 1L;
        long L = 1L;
        assertEquals(2L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case7() {
        long G = 1L;
        long L = 2L;
        assertEquals(3L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case8() {
        long G = 1L;
        long L = 3L;
        assertEquals(4L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case9() {
        long G = 1L;
        long L = 4L;
        assertEquals(5L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case10() {
        long G = 10L;
        long L = 100L;
        assertEquals(70L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case11() {
        long G = 100L;
        long L = 100L;
        assertEquals(200L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case12() {
        long G = 1000000000000L;
        long L = 1000000000000L;
        assertEquals(2000000000000L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case13() {
        long G = 1L;
        long L = 1000000000000L;
        assertEquals(244144721L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case14() {
        long G = 1L;
        long L = 999999999989L;
        assertEquals(999999999990L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case15() {
        long G = 999999999989L;
        long L = 999999999989L;
        assertEquals(1999999999978L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case16() {
        long G = 999999999999L;
        long L = 999999999999L;
        assertEquals(1999999999998L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case17() {
        long G = 2L;
        long L = 999999999999L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case18() {
        long G = 3L;
        long L = 999999999999L;
        assertEquals(3474462L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case19() {
        long G = 4L;
        long L = 1000000000000L;
        assertEquals(976566596L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case20() {
        long G = 5L;
        long L = 999999999999L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case21() {
        long G = 6L;
        long L = 999999999996L;
        assertEquals(4999998L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case22() {
        long G = 7L;
        long L = 1000000000000L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case23() {
        long G = 100000L;
        long L = 100L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case24() {
        long G = 2L;
        long L = 1L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case25() {
        long G = 123456789L;
        long L = 1234567890L;
        assertEquals(864197523L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case26() {
        long G = 19690L;
        long L = 85411282000L;
        assertEquals(103510330L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case27() {
        long G = 91L;
        long L = 974879385662L;
        assertEquals(19173063L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case28() {
        long G = 369L;
        long L = 641851989165L;
        assertEquals(248299362L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case29() {
        long G = 3L;
        long L = 122110961292L;
        assertEquals(41884935L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case30() {
        long G = 182L;
        long L = 863259682740L;
        assertEquals(25069954L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case31() {
        long G = 3281L;
        long L = 717632203782L;
        assertEquals(97193063L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case32() {
        long G = 72350L;
        long L = 925524930800L;
        assertEquals(652524650L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case33() {
        long G = 2L;
        long L = 397120903970L;
        assertEquals(23721028L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case34() {
        long G = 27L;
        long L = 953698097898L;
        assertEquals(10151703L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case35() {
        long G = 31L;
        long L = 449521949054L;
        assertEquals(19611561L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case36() {
        long G = 69L;
        long L = 841048183521L;
        assertEquals(15249414L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case37() {
        long G = 32578L;
        long L = 622426993188L;
        assertEquals(284959766L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case38() {
        long G = 247531L;
        long L = 28163582118L;
        assertEquals(311641529L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case39() {
        long G = 1090L;
        long L = 698178988380L;
        assertEquals(55680470L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case40() {
        long G = 222L;
        long L = 871431576786L;
        assertEquals(292015248L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case41() {
        long G = 6L;
        long L = 762083046L;
        assertEquals(152652L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case42() {
        long G = 2125L;
        long L = 563403387750L;
        assertEquals(79353875L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case43() {
        long G = 4909L;
        long L = 385994876178L;
        assertEquals(87738557L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case44() {
        long G = 6L;
        long L = 102991956030L;
        assertEquals(1864572L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case45() {
        long G = 28L;
        long L = 511253791776L;
        assertEquals(8518804L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case46() {
        long G = 14L;
        long L = 646803209150L;
        assertEquals(13589996L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case47() {
        long G = 1L;
        long L = 108371180946L;
        assertEquals(685553L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case48() {
        long G = 170L;
        long L = 638273737150L;
        assertEquals(20989560L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case49() {
        long G = 1619L;
        long L = 942870265325L;
        assertEquals(178323136L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case50() {
        long G = 3L;
        long L = 736626285213L;
        assertEquals(13372560L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case51() {
        long G = 18780L;
        long L = 860762595120L;
        assertEquals(623214300L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case52() {
        long G = 2L;
        long L = 222499279704L;
        assertEquals(1335994L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case53() {
        long G = 17L;
        long L = 92945485908L;
        assertEquals(78257137L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case54() {
        long G = 1481L;
        long L = 7850792848L;
        assertEquals(29266041L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case55() {
        long G = 17L;
        long L = 69582930095L;
        assertEquals(2176408L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case56() {
        long G = 12764L;
        long L = 625037188820L;
        assertEquals(178644944L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case57() {
        long G = 3L;
        long L = 587347286976L;
        assertEquals(4214901L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case58() {
        long G = 186L;
        long L = 227988011070L;
        assertEquals(13051992L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case59() {
        long G = 5L;
        long L = 198567696250L;
        assertEquals(1992885L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case60() {
        long G = 19L;
        long L = 282175860786L;
        assertEquals(4901905L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case61() {
        long G = 2L;
        long L = 663725951812L;
        assertEquals(87972414L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case62() {
        long G = 10L;
        long L = 827402333520L;
        assertEquals(6407830L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case63() {
        long G = 1L;
        long L = 198856990744L;
        assertEquals(4051801L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case64() {
        long G = 15L;
        long L = 987671321910L;
        assertEquals(7732875L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case65() {
        long G = 83L;
        long L = 943705089305L;
        assertEquals(17933644L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case66() {
        long G = 2226L;
        long L = 749365445216L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case67() {
        long G = 7751L;
        long L = 96333565096L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case68() {
        long G = 4652L;
        long L = 288500735569L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case69() {
        long G = 8227L;
        long L = 857477448634L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case70() {
        long G = 255L;
        long L = 777831771063L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case71() {
        long G = 9812L;
        long L = 432810069345L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case72() {
        long G = 6562L;
        long L = 128303313570L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case73() {
        long G = 8749L;
        long L = 161734062610L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case74() {
        long G = 7403L;
        long L = 989921186969L;
        assertEquals(171483092L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case75() {
        long G = 7910L;
        long L = 954118069709L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case76() {
        long G = 163751967973L;
        long L = 904315130722L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case77() {
        long G = 735535648965L;
        long L = 772186675910L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case78() {
        long G = 987509887063L;
        long L = 994467244792L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case79() {
        long G = 710875448198L;
        long L = 774452058479L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case80() {
        long G = 106095868877L;
        long L = 386899551256L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case81() {
        long G = 463982085303L;
        long L = 618570719610L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case82() {
        long G = 679081528294L;
        long L = 845480558019L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case83() {
        long G = 235677577222L;
        long L = 478865972561L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case84() {
        long G = 519414588838L;
        long L = 853840888864L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case85() {
        long G = 127799255701L;
        long L = 568145978603L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case86() {
        long G = 8271781382L;
        long L = 306055911134L;
        assertEquals(314327692516L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case87() {
        long G = 15424328614L;
        long L = 215940600596L;
        assertEquals(138818957526L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case88() {
        long G = 55899795662L;
        long L = 167699386986L;
        assertEquals(223599182648L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case89() {
        long G = 43733415291L;
        long L = 87466830582L;
        assertEquals(131200245873L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case90() {
        long G = 79278881041L;
        long L = 554952167287L;
        assertEquals(634231048328L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case91() {
        long G = 91687851397L;
        long L = 825190662573L;
        assertEquals(916878513970L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case92() {
        long G = 91686164344L;
        long L = 916861643440L;
        assertEquals(641803150408L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case93() {
        long G = 75299138487L;
        long L = 451794830922L;
        assertEquals(376495692435L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case94() {
        long G = 9546805544L;
        long L = 57280833264L;
        assertEquals(47734027720L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case95() {
        long G = 13218893807L;
        long L = 541974646087L;
        assertEquals(555193539894L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case96() {
        long G = 499999999979L;
        long L = 999999999958L;
        assertEquals(1499999999937L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case97() {
        long G = 499999999979L;
        long L = 499999999979L;
        assertEquals(999999999958L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case98() {
        long G = 772797527L;
        long L = 499999999969L;
        assertEquals(500772797496L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case99() {
        long G = 499999999943L;
        long L = 999999999886L;
        assertEquals(1499999999829L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case100() {
        long G = 499999999943L;
        long L = 499999999943L;
        assertEquals(999999999886L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case101() {
        long G = 999999999961L;
        long L = 999999999961L;
        assertEquals(1999999999922L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case102() {
        long G = 999999999959L;
        long L = 999999999959L;
        assertEquals(1999999999918L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case103() {
        long G = 499999999901L;
        long L = 999999999802L;
        assertEquals(1499999999703L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case104() {
        long G = 333333333323L;
        long L = 333333333323L;
        assertEquals(666666666646L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case105() {
        long G = 333333333323L;
        long L = 999999999969L;
        assertEquals(1333333333292L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case106() {
        long G = 10L;
        long L = 998862962000L;
        assertEquals(4994316810L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case107() {
        long G = 2L;
        long L = 1000000000000L;
        assertEquals(488285346L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case108() {
        long G = 2L;
        long L = 16L;
        assertEquals(18L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case109() {
        long G = 963761198400L;
        long L = 963761198400L;
        assertEquals(1927522396800L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case110() {
        long G = 68719476736L;
        long L = 412316860416L;
        assertEquals(343597383680L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case111() {
        long G = 1L;
        long L = 99999999977L;
        assertEquals(99999999978L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case112() {
        long G = 1L;
        long L = 187473L;
        assertEquals(866L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case113() {
        long G = 99999999977L;
        long L = 99999999977L;
        assertEquals(199999999954L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case114() {
        long G = 1L;
        long L = 10000000000L;
        assertEquals(9766649L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case115() {
        long G = 1L;
        long L = 100L;
        assertEquals(29L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case116() {
        long G = 1000000000L;
        long L = 1000000000000L;
        assertEquals(133000000000L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case117() {
        long G = 500000000000L;
        long L = 1000000000000L;
        assertEquals(1500000000000L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case118() {
        long G = 10000000000L;
        long L = 100000000000L;
        assertEquals(70000000000L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case119() {
        long G = 999999999989L;
        long L = 1000000000000L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case120() {
        long G = 100000000000L;
        long L = 1000000000000L;
        assertEquals(700000000000L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case121() {
        long G = 10000000000L;
        long L = 1000000000000L;
        assertEquals(290000000000L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case122() {
        long G = 89876476576L;
        long L = 84787483738L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case123() {
        long G = 1L;
        long L = 5L;
        assertEquals(6L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case124() {
        long G = 5L;
        long L = 5L;
        assertEquals(10L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case125() {
        long G = 2L;
        long L = 549753716734L;
        assertEquals(549753716736L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case126() {
        long G = 2000000000L;
        long L = 2000000000L;
        assertEquals(4000000000L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case127() {
        long G = 2L;
        long L = 2L;
        assertEquals(4L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case128() {
        long G = 1L;
        long L = 29L;
        assertEquals(30L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case129() {
        long G = 4L;
        long L = 4L;
        assertEquals(8L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case130() {
        long G = 35309L;
        long L = 10723661081L;
        assertEquals(46254790L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case131() {
        long G = 6L;
        long L = 216L;
        assertEquals(78L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case132() {
        long G = 1L;
        long L = 12L;
        assertEquals(7L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case133() {
        long G = 10L;
        long L = 950863664450L;
        assertEquals(6167220L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case134() {
        long G = 2L;
        long L = 4L;
        assertEquals(6L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case135() {
        long G = 2L;
        long L = 100000000000L;
        assertEquals(97658298L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case136() {
        long G = 1000000000L;
        long L = 1000000000L;
        assertEquals(2000000000L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case137() {
        long G = 2L;
        long L = 19153781534L;
        assertEquals(19153781536L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case138() {
        long G = 107913405600L;
        long L = 971220650400L;
        assertEquals(1079134056000L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case139() {
        long G = 250000000000L;
        long L = 1000000000000L;
        assertEquals(1250000000000L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case140() {
        long G = 8L;
        long L = 16L;
        assertEquals(24L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case141() {
        long G = 999999999997L;
        long L = 1000000000000L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case142() {
        long G = 2L;
        long L = 18L;
        assertEquals(20L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case143() {
        long G = 1000000000000L;
        long L = 99999999999L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case144() {
        long G = 200000L;
        long L = 100000000000L;
        assertEquals(3131400000L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case145() {
        long G = 2L;
        long L = 200000014L;
        assertEquals(200000016L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case146() {
        long G = 1L;
        long L = 549755813888L;
        assertEquals(549755813889L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case147() {
        long G = 100000000000L;
        long L = 500000000000L;
        assertEquals(600000000000L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case148() {
        long G = 10000000000L;
        long L = 50000000000L;
        assertEquals(60000000000L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case149() {
        long G = 1L;
        long L = 100233665123L;
        assertEquals(100233665124L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case150() {
        long G = 1L;
        long L = 20L;
        assertEquals(9L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case151() {
        long G = 200560490130L;
        long L = 200560490130L;
        assertEquals(401120980260L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case152() {
        long G = 10L;
        long L = 240L;
        assertEquals(110L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case153() {
        long G = 2L;
        long L = 14L;
        assertEquals(16L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case154() {
        long G = 1L;
        long L = 521240920200L;
        assertEquals(1470457L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case155() {
        long G = 87178291199L;
        long L = 87178291199L;
        assertEquals(174356582398L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case156() {
        long G = 10L;
        long L = 10L;
        assertEquals(20L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case157() {
        long G = 100000000L;
        long L = 1000000000L;
        assertEquals(700000000L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case158() {
        long G = 30L;
        long L = 30000000210L;
        assertEquals(30000000240L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case159() {
        long G = 5L;
        long L = 5040L;
        assertEquals(395L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case160() {
        long G = 2L;
        long L = 549755813888L;
        assertEquals(549755813890L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case161() {
        long G = 1L;
        long L = 14100827177L;
        assertEquals(14100827178L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case162() {
        long G = 10000000000L;
        long L = 90000000000L;
        assertEquals(100000000000L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case163() {
        long G = 2L;
        long L = 94385732726L;
        assertEquals(71561192L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case164() {
        long G = 1000000000L;
        long L = 10000000000L;
        assertEquals(7000000000L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case165() {
        long G = 10L;
        long L = 9003500059L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case166() {
        long G = 1L;
        long L = 95L;
        assertEquals(24L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case167() {
        long G = 5L;
        long L = 210L;
        assertEquals(65L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case168() {
        long G = 1000000007L;
        long L = 34000000238L;
        assertEquals(19000000133L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case169() {
        long G = 1L;
        long L = 2310L;
        assertEquals(97L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case170() {
        long G = 17179869184L;
        long L = 34359738368L;
        assertEquals(51539607552L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case171() {
        long G = 999999999961L;
        long L = 999999999989L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case172() {
        long G = 2L;
        long L = 5L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case173() {
        long G = 900000000025L;
        long L = 999999999999L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case174() {
        long G = 123211123L;
        long L = 150863961L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case175() {
        long G = 2L;
        long L = 6L;
        assertEquals(8L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case176() {
        long G = 11111111111L;
        long L = 22222222222L;
        assertEquals(33333333333L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case177() {
        long G = 10000000L;
        long L = 1000000000L;
        assertEquals(290000000L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case178() {
        long G = 1L;
        long L = 16L;
        assertEquals(17L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case179() {
        long G = 1000000L;
        long L = 950863963000L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case180() {
        long G = 999999999999L;
        long L = 1000000000000L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case181() {
        long G = 1L;
        long L = 87178291200L;
        assertEquals(590539L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case182() {
        long G = 100000000L;
        long L = 1000000000000L;
        assertEquals(64100000000L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case183() {
        long G = 1L;
        long L = 1000000007L;
        assertEquals(1000000008L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case184() {
        long G = 1L;
        long L = 1000000L;
        assertEquals(15689L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case185() {
        long G = 1L;
        long L = 100000000003L;
        assertEquals(100000000004L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case186() {
        long G = 1L;
        long L = 999999999091L;
        assertEquals(999999999092L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case187() {
        long G = 1L;
        long L = 963761198400L;
        assertEquals(1963583L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case188() {
        long G = 1L;
        long L = 455L;
        assertEquals(48L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case189() {
        long G = 44628547775L;
        long L = 454786481517L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case190() {
        long G = 500000000000L;
        long L = 500000000000L;
        assertEquals(1000000000000L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case191() {
        long G = 1L;
        long L = 999962000357L;
        assertEquals(1999962L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case192() {
        long G = 1L;
        long L = 21L;
        assertEquals(10L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case193() {
        long G = 601681470393L;
        long L = 601681470393L;
        assertEquals(1203362940786L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case194() {
        long G = 999999999999L;
        long L = 888888888888L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case195() {
        long G = 1000000000L;
        long L = 2000000000L;
        assertEquals(3000000000L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case196() {
        long G = 1000000L;
        long L = 1000000000000L;
        assertEquals(15689000000L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case197() {
        long G = 2L;
        long L = 99999999999L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case198() {
        long G = 145L;
        long L = 145L;
        assertEquals(290L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case199() {
        long G = 1L;
        long L = 15L;
        assertEquals(8L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case200() {
        long G = 871782912000L;
        long L = 871782912000L;
        assertEquals(1743565824000L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case201() {
        long G = 1L;
        long L = 900000000013L;
        assertEquals(900000000014L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case202() {
        long G = 34359738368L;
        long L = 68719476736L;
        assertEquals(103079215104L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case203() {
        long G = 1000000007L;
        long L = 221000001547L;
        assertEquals(30000000210L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case204() {
        long G = 500L;
        long L = 100000000000L;
        assertEquals(195568500L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case205() {
        long G = 4L;
        long L = 100L;
        assertEquals(104L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case206() {
        long G = 185285839890L;
        long L = 185285839890L;
        assertEquals(370571679780L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case207() {
        long G = 10L;
        long L = 6061000L;
        assertEquals(15610L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case208() {
        long G = 5456L;
        long L = 654L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case209() {
        long G = 5L;
        long L = 125L;
        assertEquals(130L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case210() {
        long G = 1L;
        long L = 30030L;
        assertEquals(347L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case211() {
        long G = 4294967296L;
        long L = 4294967296L;
        assertEquals(8589934592L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case212() {
        long G = 1L;
        long L = 999999999958L;
        assertEquals(499999999981L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case213() {
        long G = 1L;
        long L = 7L;
        assertEquals(8L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case214() {
        long G = 1L;
        long L = 32416190071L;
        assertEquals(32416190072L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case215() {
        long G = 3763L;
        long L = 94997732756L;
        assertEquals(23749448241L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case216() {
        long G = 1L;
        long L = 100000000000L;
        assertEquals(48830173L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case217() {
        long G = 1L;
        long L = 30L;
        assertEquals(11L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case218() {
        long G = 2L;
        long L = 318821883888L;
        assertEquals(1623130L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case219() {
        long G = 1L;
        long L = 4032L;
        assertEquals(127L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case220() {
        long G = 2L;
        long L = 13L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case221() {
        long G = 1L;
        long L = 180L;
        assertEquals(29L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case222() {
        long G = 9326317000L;
        long L = 699473775000L;
        assertEquals(261136876000L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case223() {
        long G = 9999999999L;
        long L = 9999999999L;
        assertEquals(19999999998L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case224() {
        long G = 2L;
        long L = 21L;
        assertEquals(-1L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case225() {
        long G = 2L;
        long L = 999999999958L;
        assertEquals(999999999960L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case226() {
        long G = 87178291199L;
        long L = 174356582398L;
        assertEquals(261534873597L, foxandgcdlcm.get(G, L));
    }

    @Test
    public void case227() {
        long G = 1L;
        long L = 87178291199L;
        assertEquals(87178291200L, foxandgcdlcm.get(G, L));
    }

}
