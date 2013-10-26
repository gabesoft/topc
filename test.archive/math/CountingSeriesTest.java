package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class CountingSeriesTest {
    CountingSeries countingseries = new CountingSeries();

    @Test
    public void case1() {
        long a = 1L;
        long b = 1L;
        long c = 1L;
        long d = 2L;
        long upperBound = 1000L;
        assertEquals(1000L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case2() {
        long a = 3L;
        long b = 3L;
        long c = 1L;
        long d = 2L;
        long upperBound = 1000L;
        assertEquals(343L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case3() {
        long a = 40L;
        long b = 77L;
        long c = 40L;
        long d = 100000L;
        long upperBound = 40L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case4() {
        long a = 452L;
        long b = 24L;
        long c = 4L;
        long d = 5L;
        long upperBound = 600L;
        assertEquals(10L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case5() {
        long a = 1000000000000L;
        long b = 1000000000000L;
        long c = 1000000000000L;
        long d = 100000L;
        long upperBound = 1000000000000L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case6() {
        long a = 234L;
        long b = 24L;
        long c = 377L;
        long d = 1L;
        long upperBound = 10000L;
        assertEquals(408L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case7() {
        long a = 371658585308L;
        long b = 274808924218L;
        long c = 611329026706L;
        long d = 75085L;
        long upperBound = 848787675931L;
        assertEquals(3L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case8() {
        long a = 867388102154L;
        long b = 369340281620L;
        long c = 588218623027L;
        long d = 20738L;
        long upperBound = 595665623712L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case9() {
        long a = 720176314585L;
        long b = 488693376359L;
        long c = 514776939786L;
        long d = 38245L;
        long upperBound = 382227406106L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case10() {
        long a = 478928595791L;
        long b = 927825107205L;
        long c = 691955627786L;
        long d = 8732L;
        long upperBound = 527228917412L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case11() {
        long a = 639578760203L;
        long b = 756584032851L;
        long c = 768951637486L;
        long d = 13026L;
        long upperBound = 249617460760L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case12() {
        long a = 294660282608L;
        long b = 919869934522L;
        long c = 111958739667L;
        long d = 42568L;
        long upperBound = 76329210161L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case13() {
        long a = 428171448558L;
        long b = 486759454458L;
        long c = 241431311633L;
        long d = 95084L;
        long upperBound = 484913386618L;
        assertEquals(2L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case14() {
        long a = 829322015914L;
        long b = 305771561762L;
        long c = 934247930302L;
        long d = 23495L;
        long upperBound = 189410317101L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case15() {
        long a = 496623788408L;
        long b = 167046026998L;
        long c = 672185860465L;
        long d = 32418L;
        long upperBound = 96124753045L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case16() {
        long a = 71662204468L;
        long b = 807601812789L;
        long c = 635911143908L;
        long d = 85558L;
        long upperBound = 943389347742L;
        assertEquals(3L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case17() {
        long a = 942731255767L;
        long b = 584910857047L;
        long c = 104048818207L;
        long d = 73381L;
        long upperBound = 712119963690L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case18() {
        long a = 233876905874L;
        long b = 151430463683L;
        long c = 789804879302L;
        long d = 56137L;
        long upperBound = 523032618537L;
        assertEquals(2L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case19() {
        long a = 460963441574L;
        long b = 589697270381L;
        long c = 796248895674L;
        long d = 84739L;
        long upperBound = 881165733710L;
        assertEquals(2L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case20() {
        long a = 801992493102L;
        long b = 165925373974L;
        long c = 292778598713L;
        long d = 58875L;
        long upperBound = 438429892615L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case21() {
        long a = 833015985283L;
        long b = 448265436297L;
        long c = 783187882729L;
        long d = 79923L;
        long upperBound = 951223756976L;
        assertEquals(2L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case22() {
        long a = 237407359835L;
        long b = 188972488073L;
        long c = 830920010831L;
        long d = 97989L;
        long upperBound = 117025361579L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case23() {
        long a = 765604912886L;
        long b = 343072271013L;
        long c = 64676545504L;
        long d = 59376L;
        long upperBound = 505005951932L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case24() {
        long a = 563903306155L;
        long b = 541064862087L;
        long c = 656495759997L;
        long d = 72055L;
        long upperBound = 976935175915L;
        assertEquals(2L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case25() {
        long a = 336429740255L;
        long b = 800725590901L;
        long c = 184558208830L;
        long d = 96920L;
        long upperBound = 189313950525L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case26() {
        long a = 85161031713L;
        long b = 421587728632L;
        long c = 146039974864L;
        long d = 76620L;
        long upperBound = 672420275606L;
        assertEquals(3L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case27() {
        long a = 1L;
        long b = 1L;
        long c = 1L;
        long d = 2L;
        long upperBound = 1000000000000L;
        assertEquals(1000000000000L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case28() {
        long a = 3L;
        long b = 1L;
        long c = 3L;
        long d = 4L;
        long upperBound = 948926270240L;
        assertEquals(948926270238L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case29() {
        long a = 1L;
        long b = 1L;
        long c = 1L;
        long d = 9L;
        long upperBound = 996142450594L;
        assertEquals(996142450594L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case30() {
        long a = 1L;
        long b = 2L;
        long c = 2L;
        long d = 4L;
        long upperBound = 928060483512L;
        assertEquals(464030241776L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case31() {
        long a = 3L;
        long b = 3L;
        long c = 3L;
        long d = 3L;
        long upperBound = 970328929867L;
        assertEquals(323442976622L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case32() {
        long a = 2L;
        long b = 1L;
        long c = 1L;
        long d = 8L;
        long upperBound = 964239644830L;
        assertEquals(964239644830L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case33() {
        long a = 3L;
        long b = 2L;
        long c = 1L;
        long d = 7L;
        long upperBound = 948306929651L;
        assertEquals(474153464826L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case34() {
        long a = 1L;
        long b = 2L;
        long c = 2L;
        long d = 5L;
        long upperBound = 963919138837L;
        assertEquals(481959569436L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case35() {
        long a = 3L;
        long b = 2L;
        long c = 1L;
        long d = 9L;
        long upperBound = 980268424985L;
        assertEquals(490134212493L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case36() {
        long a = 2L;
        long b = 2L;
        long c = 2L;
        long d = 5L;
        long upperBound = 930564458280L;
        assertEquals(465282229140L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case37() {
        long a = 1L;
        long b = 2L;
        long c = 2L;
        long d = 2L;
        long upperBound = 960084849436L;
        assertEquals(480042424757L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case38() {
        long a = 1L;
        long b = 1L;
        long c = 3L;
        long d = 5L;
        long upperBound = 916758881378L;
        assertEquals(916758881378L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case39() {
        long a = 1L;
        long b = 1L;
        long c = 3L;
        long d = 6L;
        long upperBound = 913632832357L;
        assertEquals(913632832357L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case40() {
        long a = 3L;
        long b = 2L;
        long c = 3L;
        long d = 3L;
        long upperBound = 957935528651L;
        assertEquals(478967764325L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case41() {
        long a = 1L;
        long b = 2L;
        long c = 3L;
        long d = 3L;
        long upperBound = 928252524401L;
        assertEquals(464126262201L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case42() {
        long a = 1L;
        long b = 2L;
        long c = 3L;
        long d = 8L;
        long upperBound = 964130534211L;
        assertEquals(482065267118L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case43() {
        long a = 3L;
        long b = 2L;
        long c = 3L;
        long d = 2L;
        long upperBound = 929911384896L;
        assertEquals(464955692485L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case44() {
        long a = 3L;
        long b = 3L;
        long c = 1L;
        long d = 6L;
        long upperBound = 999127555255L;
        assertEquals(333042518419L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case45() {
        long a = 3L;
        long b = 3L;
        long c = 2L;
        long d = 9L;
        long upperBound = 993642632817L;
        assertEquals(331214210940L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case46() {
        long a = 1L;
        long b = 2L;
        long c = 3L;
        long d = 6L;
        long upperBound = 956754020260L;
        assertEquals(478377010144L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case47() {
        long a = 2L;
        long b = 3L;
        long c = 3L;
        long d = 5L;
        long upperBound = 965285486728L;
        assertEquals(321761828926L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case48() {
        long a = 376303384920L;
        long b = 736356L;
        long c = 1432L;
        long d = 173L;
        long upperBound = 987814005729L;
        assertEquals(830460L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case49() {
        long a = 732961462973L;
        long b = 941601L;
        long c = 2681L;
        long d = 681L;
        long upperBound = 998853609733L;
        assertEquals(282388L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case50() {
        long a = 224020918844L;
        long b = 250213L;
        long c = 1373L;
        long d = 215L;
        long upperBound = 957836995544L;
        assertEquals(2932770L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case51() {
        long a = 699844231271L;
        long b = 591542L;
        long c = 8254L;
        long d = 245L;
        long upperBound = 952589914538L;
        assertEquals(427270L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case52() {
        long a = 559688158031L;
        long b = 620546L;
        long c = 9761L;
        long d = 601L;
        long upperBound = 930385180047L;
        assertEquals(597376L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case53() {
        long a = 138496014408L;
        long b = 788102L;
        long c = 9530L;
        long d = 159L;
        long upperBound = 955369882363L;
        assertEquals(1036512L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case54() {
        long a = 699585500785L;
        long b = 600252L;
        long c = 2755L;
        long d = 742L;
        long upperBound = 960150731325L;
        assertEquals(434097L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case55() {
        long a = 912966478293L;
        long b = 540931L;
        long c = 4694L;
        long d = 252L;
        long upperBound = 984538225716L;
        assertEquals(132317L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case56() {
        long a = 370762489993L;
        long b = 883058L;
        long c = 1054L;
        long d = 818L;
        long upperBound = 959115721111L;
        assertEquals(666272L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case57() {
        long a = 533215344776L;
        long b = 998854L;
        long c = 5715L;
        long d = 875L;
        long upperBound = 933337736018L;
        assertEquals(400585L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case58() {
        long a = 158711978588L;
        long b = 662444L;
        long c = 944L;
        long d = 377L;
        long upperBound = 977348100441L;
        assertEquals(1235786L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case59() {
        long a = 671291997116L;
        long b = 784622L;
        long c = 5230L;
        long d = 754L;
        long upperBound = 973695776773L;
        assertEquals(385417L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case60() {
        long a = 672877199421L;
        long b = 519605L;
        long c = 8688L;
        long d = 792L;
        long upperBound = 992294461378L;
        assertEquals(614734L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case61() {
        long a = 211970627965L;
        long b = 465323L;
        long c = 1446L;
        long d = 873L;
        long upperBound = 933490121149L;
        assertEquals(1550581L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case62() {
        long a = 913829666089L;
        long b = 627485L;
        long c = 1491L;
        long d = 344L;
        long upperBound = 939734068618L;
        assertEquals(41287L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case63() {
        long a = 247339894881L;
        long b = 744276L;
        long c = 3875L;
        long d = 889L;
        long upperBound = 957529730754L;
        assertEquals(954206L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case64() {
        long a = 60855883069L;
        long b = 870173L;
        long c = 7120L;
        long d = 575L;
        long upperBound = 939264155148L;
        assertEquals(1009467L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case65() {
        long a = 862233030209L;
        long b = 514179L;
        long c = 6216L;
        long d = 544L;
        long upperBound = 952735638809L;
        assertEquals(176017L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case66() {
        long a = 862996696717L;
        long b = 342637L;
        long c = 9445L;
        long d = 99L;
        long upperBound = 991425583612L;
        assertEquals(374830L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case67() {
        long a = 689210813348L;
        long b = 803705L;
        long c = 7574L;
        long d = 957L;
        long upperBound = 998454499160L;
        assertEquals(384776L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case68() {
        long a = 617621421628L;
        long b = 900642L;
        long c = 4762L;
        long d = 7L;
        long upperBound = 560244538L;
        assertEquals(7L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case69() {
        long a = 762680069332L;
        long b = 898536L;
        long c = 7089L;
        long d = 10L;
        long upperBound = 708900000L;
        assertEquals(6L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case70() {
        long a = 144402958845L;
        long b = 609080L;
        long c = 5360L;
        long d = 10L;
        long upperBound = 536000000L;
        assertEquals(6L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case71() {
        long a = 954429631397L;
        long b = 114649L;
        long c = 259L;
        long d = 8L;
        long upperBound = 4345298944L;
        assertEquals(9L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case72() {
        long a = 210718650139L;
        long b = 209059L;
        long c = 9419L;
        long d = 10L;
        long upperBound = 941900000L;
        assertEquals(6L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case73() {
        long a = 747547304912L;
        long b = 309607L;
        long c = 1313L;
        long d = 6L;
        long upperBound = 2205335808L;
        assertEquals(9L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case74() {
        long a = 24870819017L;
        long b = 347339L;
        long c = 2929L;
        long d = 6L;
        long upperBound = 819932544L;
        assertEquals(8L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case75() {
        long a = 791381396077L;
        long b = 10455L;
        long c = 4384L;
        long d = 6L;
        long upperBound = 1227239424L;
        assertEquals(8L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case76() {
        long a = 98904846545L;
        long b = 65222L;
        long c = 7271L;
        long d = 5L;
        long upperBound = 568046875L;
        assertEquals(8L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case77() {
        long a = 973003709061L;
        long b = 434931L;
        long c = 5616L;
        long d = 6L;
        long upperBound = 262020096L;
        assertEquals(7L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case78() {
        long a = 640198515416L;
        long b = 287842L;
        long c = 9557L;
        long d = 4L;
        long upperBound = 156581888L;
        assertEquals(8L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case79() {
        long a = 677344970999L;
        long b = 581336L;
        long c = 1396L;
        long d = 4L;
        long upperBound = 1463812096L;
        assertEquals(11L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case80() {
        long a = 322571760636L;
        long b = 770602L;
        long c = 6206L;
        long d = 10L;
        long upperBound = 620600000L;
        assertEquals(6L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case81() {
        long a = 601605433174L;
        long b = 568544L;
        long c = 6122L;
        long d = 7L;
        long upperBound = 720247178L;
        assertEquals(7L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case82() {
        long a = 981037539735L;
        long b = 604741L;
        long c = 1640L;
        long d = 10L;
        long upperBound = 1640000000L;
        assertEquals(7L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case83() {
        long a = 545090382832L;
        long b = 937893L;
        long c = 5863L;
        long d = 7L;
        long upperBound = 689776087L;
        assertEquals(7L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case84() {
        long a = 497113296820L;
        long b = 504429L;
        long c = 9675L;
        long d = 7L;
        long upperBound = 162607725L;
        assertEquals(6L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case85() {
        long a = 927862375912L;
        long b = 265135L;
        long c = 1522L;
        long d = 5L;
        long upperBound = 2972656250L;
        assertEquals(10L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case86() {
        long a = 466159578425L;
        long b = 163729L;
        long c = 3346L;
        long d = 5L;
        long upperBound = 1307031250L;
        assertEquals(9L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case87() {
        long a = 717793611911L;
        long b = 574060L;
        long c = 1740L;
        long d = 8L;
        long upperBound = 3649044480L;
        assertEquals(8L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case88() {
        long a = 782666701792L;
        long b = 653287L;
        long c = 7626L;
        long d = 2L;
        long upperBound = 124944385L;
        assertEquals(15L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case89() {
        long a = 19245862700L;
        long b = 775963L;
        long c = 7744L;
        long d = 3L;
        long upperBound = 152425153L;
        assertEquals(10L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case90() {
        long a = 138373392075L;
        long b = 475041L;
        long c = 4716L;
        long d = 10L;
        long upperBound = 471600001L;
        assertEquals(6L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case91() {
        long a = 784894160424L;
        long b = 564215L;
        long c = 9945L;
        long d = 9L;
        long upperBound = 587242306L;
        assertEquals(6L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case92() {
        long a = 321885308513L;
        long b = 536202L;
        long c = 2412L;
        long d = 7L;
        long upperBound = 1986385717L;
        assertEquals(8L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case93() {
        long a = 54621216416L;
        long b = 639678L;
        long c = 3788L;
        long d = 9L;
        long upperBound = 2013098509L;
        assertEquals(7L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case94() {
        long a = 733514101918L;
        long b = 691128L;
        long c = 7885L;
        long d = 7L;
        long upperBound = 132523196L;
        assertEquals(6L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case95() {
        long a = 199390837630L;
        long b = 692289L;
        long c = 7997L;
        long d = 3L;
        long upperBound = 157404952L;
        assertEquals(10L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case96() {
        long a = 94290565690L;
        long b = 876609L;
        long c = 2536L;
        long d = 2L;
        long upperBound = 664797185L;
        assertEquals(19L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case97() {
        long a = 719270751894L;
        long b = 53171L;
        long c = 7196L;
        long d = 8L;
        long upperBound = 235798529L;
        assertEquals(6L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case98() {
        long a = 725999593735L;
        long b = 40917L;
        long c = 8474L;
        long d = 7L;
        long upperBound = 142422517L;
        assertEquals(5L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case99() {
        long a = 111343227748L;
        long b = 476197L;
        long c = 2884L;
        long d = 7L;
        long upperBound = 339299715L;
        assertEquals(6L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case100() {
        long a = 469139508618L;
        long b = 435152L;
        long c = 4526L;
        long d = 3L;
        long upperBound = 267255773L;
        assertEquals(10L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case101() {
        long a = 390406387913L;
        long b = 576578L;
        long c = 2803L;
        long d = 4L;
        long upperBound = 734789631L;
        assertEquals(9L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case102() {
        long a = 858843894325L;
        long b = 114797L;
        long c = 2595L;
        long d = 6L;
        long upperBound = 726433919L;
        assertEquals(7L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case103() {
        long a = 331027318096L;
        long b = 721020L;
        long c = 9301L;
        long d = 3L;
        long upperBound = 183071582L;
        assertEquals(9L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case104() {
        long a = 767270902908L;
        long b = 60589L;
        long c = 6206L;
        long d = 10L;
        long upperBound = 620599999L;
        assertEquals(5L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case105() {
        long a = 463024975992L;
        long b = 861355L;
        long c = 1282L;
        long d = 3L;
        long upperBound = 2043922085L;
        assertEquals(13L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case106() {
        long a = 168578159443L;
        long b = 804749L;
        long c = 8677L;
        long d = 5L;
        long upperBound = 135578124L;
        assertEquals(6L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case107() {
        long a = 976539781927L;
        long b = 279655L;
        long c = 8784L;
        long d = 8L;
        long upperBound = 287834111L;
        assertEquals(5L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case108() {
        long a = 3794L;
        long b = 75020L;
        long c = 9041L;
        long d = 4L;
        long upperBound = 950208050054L;
        assertEquals(12666078L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case109() {
        long a = 77115L;
        long b = 83015L;
        long c = 5774L;
        long d = 4L;
        long upperBound = 949749787615L;
        assertEquals(11440715L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case110() {
        long a = 67376L;
        long b = 49943L;
        long c = 9347L;
        long d = 5L;
        long upperBound = 971727433880L;
        assertEquals(19456741L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case111() {
        long a = 32806L;
        long b = 79954L;
        long c = 2247L;
        long d = 4L;
        long upperBound = 980426683142L;
        assertEquals(12262400L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case112() {
        long a = 73653L;
        long b = 15386L;
        long c = 3837L;
        long d = 3L;
        long upperBound = 927016897659L;
        assertEquals(60250690L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case113() {
        long a = 97277L;
        long b = 26678L;
        long c = 5723L;
        long d = 3L;
        long upperBound = 953014716425L;
        assertEquals(35722885L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case114() {
        long a = 77530L;
        long b = 62843L;
        long c = 6169L;
        long d = 5L;
        long upperBound = 906552143125L;
        assertEquals(14425678L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case115() {
        long a = 10813L;
        long b = 75086L;
        long c = 9069L;
        long d = 5L;
        long upperBound = 992378109371L;
        assertEquals(13216566L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case116() {
        long a = 64245L;
        long b = 63759L;
        long c = 8847L;
        long d = 4L;
        long upperBound = 945998850663L;
        assertEquals(14837117L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case117() {
        long a = 34831L;
        long b = 37951L;
        long c = 8645L;
        long d = 3L;
        long upperBound = 913525007501L;
        assertEquals(24071188L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case118() {
        long a = 78208L;
        long b = 59284L;
        long c = 5014L;
        long d = 5L;
        long upperBound = 910607120213L;
        assertEquals(15360094L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case119() {
        long a = 41316L;
        long b = 59505L;
        long c = 9188L;
        long d = 4L;
        long upperBound = 962290623277L;
        assertEquals(16171607L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case120() {
        long a = 29411L;
        long b = 2176L;
        long c = 4905L;
        long d = 5L;
        long upperBound = 958736263908L;
        assertEquals(440595709L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case121() {
        long a = 95L;
        long b = 64022L;
        long c = 2399L;
        long d = 3L;
        long upperBound = 971935396080L;
        assertEquals(15181292L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case122() {
        long a = 78441L;
        long b = 10944L;
        long c = 3936L;
        long d = 4L;
        long upperBound = 975665777002L;
        assertEquals(89150755L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case123() {
        long a = 68665L;
        long b = 92077L;
        long c = 967L;
        long d = 4L;
        long upperBound = 964677722732L;
        assertEquals(10476874L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case124() {
        long a = 5050L;
        long b = 39328L;
        long c = 1049L;
        long d = 5L;
        long upperBound = 921897327739L;
        assertEquals(23441260L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case125() {
        long a = 88598L;
        long b = 18328L;
        long c = 8582L;
        long d = 4L;
        long upperBound = 966775183095L;
        assertEquals(52748547L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case126() {
        long a = 80738L;
        long b = 51693L;
        long c = 8410L;
        long d = 5L;
        long upperBound = 999997702308L;
        assertEquals(19344946L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case127() {
        long a = 44152L;
        long b = 16688L;
        long c = 1937L;
        long d = 2L;
        long upperBound = 948585047449L;
        assertEquals(56842372L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case128() {
        long a = 56766L;
        long b = 44866L;
        long c = 310L;
        long d = 5L;
        long upperBound = 946843147565L;
        assertEquals(21103814L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case129() {
        long a = 43145L;
        long b = 45043L;
        long c = 6446L;
        long d = 4L;
        long upperBound = 943793229024L;
        assertEquals(20953174L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case130() {
        long a = 72428L;
        long b = 20651L;
        long c = 9462L;
        long d = 4L;
        long upperBound = 912240010406L;
        assertEquals(44174143L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case131() {
        long a = 45628L;
        long b = 71610L;
        long c = 9390L;
        long d = 4L;
        long upperBound = 910763595477L;
        assertEquals(12718399L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case132() {
        long a = 87926L;
        long b = 56936L;
        long c = 8712L;
        long d = 2L;
        long upperBound = 963917401229L;
        assertEquals(16929866L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case133() {
        long a = 17753L;
        long b = 30721L;
        long c = 1385L;
        long d = 2L;
        long upperBound = 906447638110L;
        assertEquals(29505828L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case134() {
        long a = 74328L;
        long b = 95873L;
        long c = 119L;
        long d = 4L;
        long upperBound = 993076001339L;
        assertEquals(10358261L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case135() {
        long a = 93863L;
        long b = 63334L;
        long c = 7964L;
        long d = 3L;
        long upperBound = 948329652840L;
        assertEquals(14973484L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case136() {
        long a = 30130L;
        long b = 28163L;
        long c = 9415L;
        long d = 5L;
        long upperBound = 959578834615L;
        assertEquals(34072334L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case137() {
        long a = 3017L;
        long b = 68514L;
        long c = 4107L;
        long d = 2L;
        long upperBound = 949948257352L;
        assertEquals(13865052L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case138() {
        long a = 75717L;
        long b = 33649L;
        long c = 6281L;
        long d = 1L;
        long upperBound = 944490962902L;
        assertEquals(28068915L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case139() {
        long a = 27700L;
        long b = 39576L;
        long c = 408L;
        long d = 1L;
        long upperBound = 965579114571L;
        assertEquals(24398098L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case140() {
        long a = 34585L;
        long b = 48798L;
        long c = 479L;
        long d = 1L;
        long upperBound = 935420510508L;
        assertEquals(19169239L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case141() {
        long a = 99402L;
        long b = 30414L;
        long c = 6564L;
        long d = 1L;
        long upperBound = 924737647747L;
        assertEquals(30404998L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case142() {
        long a = 93812L;
        long b = 63820L;
        long c = 4938L;
        long d = 1L;
        long upperBound = 925567704873L;
        assertEquals(14502785L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case143() {
        long a = 24264L;
        long b = 9262L;
        long c = 9079L;
        long d = 1L;
        long upperBound = 948488684571L;
        assertEquals(102406465L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case144() {
        long a = 91796L;
        long b = 78228L;
        long c = 6065L;
        long d = 1L;
        long upperBound = 980056903676L;
        assertEquals(12528212L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case145() {
        long a = 76447L;
        long b = 12788L;
        long c = 7333L;
        long d = 1L;
        long upperBound = 977696974295L;
        assertEquals(76454248L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case146() {
        long a = 33937L;
        long b = 3207L;
        long c = 8809L;
        long d = 1L;
        long upperBound = 976503806215L;
        assertEquals(304491356L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case147() {
        long a = 87951L;
        long b = 91493L;
        long c = 6017L;
        long d = 3L;
        long upperBound = 20899L;
        assertEquals(2L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case148() {
        long a = 65767L;
        long b = 68958L;
        long c = 8240L;
        long d = 1L;
        long upperBound = 18262L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case149() {
        long a = 73629L;
        long b = 69162L;
        long c = 3343L;
        long d = 3L;
        long upperBound = 48110L;
        assertEquals(3L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case150() {
        long a = 1379L;
        long b = 86978L;
        long c = 4008L;
        long d = 3L;
        long upperBound = 1114L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case151() {
        long a = 96821L;
        long b = 15431L;
        long c = 9981L;
        long d = 3L;
        long upperBound = 78957L;
        assertEquals(2L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case152() {
        long a = 11860L;
        long b = 88234L;
        long c = 5513L;
        long d = 2L;
        long upperBound = 3747L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case153() {
        long a = 85931L;
        long b = 89559L;
        long c = 2758L;
        long d = 2L;
        long upperBound = 3291L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case154() {
        long a = 84954L;
        long b = 75205L;
        long c = 6737L;
        long d = 5L;
        long upperBound = 51643L;
        assertEquals(2L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case155() {
        long a = 84699L;
        long b = 92065L;
        long c = 7597L;
        long d = 2L;
        long upperBound = 73244L;
        assertEquals(4L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case156() {
        long a = 48383L;
        long b = 34907L;
        long c = 4563L;
        long d = 3L;
        long upperBound = 31941L;
        assertEquals(2L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case157() {
        long a = 17340L;
        long b = 40451L;
        long c = 7763L;
        long d = 1L;
        long upperBound = 3462L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case158() {
        long a = 42864L;
        long b = 90089L;
        long c = 311L;
        long d = 3L;
        long upperBound = 10L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case159() {
        long a = 5529L;
        long b = 15243L;
        long c = 2336L;
        long d = 2L;
        long upperBound = 2034L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case160() {
        long a = 64202L;
        long b = 81863L;
        long c = 6922L;
        long d = 2L;
        long upperBound = 1692L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case161() {
        long a = 66210L;
        long b = 80780L;
        long c = 4722L;
        long d = 1L;
        long upperBound = 4199L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case162() {
        long a = 46195L;
        long b = 27542L;
        long c = 4227L;
        long d = 5L;
        long upperBound = 1488L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case163() {
        long a = 53944L;
        long b = 47250L;
        long c = 373L;
        long d = 5L;
        long upperBound = 4L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case164() {
        long a = 87899L;
        long b = 36747L;
        long c = 6092L;
        long d = 3L;
        long upperBound = 1813L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case165() {
        long a = 20120L;
        long b = 33341L;
        long c = 5813L;
        long d = 5L;
        long upperBound = 4188L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case166() {
        long a = 6227L;
        long b = 74175L;
        long c = 5402L;
        long d = 1L;
        long upperBound = 4168L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case167() {
        long a = 48872L;
        long b = 46109L;
        long c = 1214L;
        long d = 2L;
        long upperBound = 372L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case168() {
        long a = 4544L;
        long b = 52341L;
        long c = 2444L;
        long d = 2L;
        long upperBound = 1178L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case169() {
        long a = 32866L;
        long b = 16394L;
        long c = 6813L;
        long d = 4L;
        long upperBound = 3225L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case170() {
        long a = 81394L;
        long b = 2660L;
        long c = 897L;
        long d = 4L;
        long upperBound = 693L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case171() {
        long a = 64272L;
        long b = 43652L;
        long c = 7234L;
        long d = 3L;
        long upperBound = 3531L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case172() {
        long a = 59845L;
        long b = 32166L;
        long c = 5779L;
        long d = 4L;
        long upperBound = 5506L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case173() {
        long a = 86404L;
        long b = 90398L;
        long c = 5518L;
        long d = 4L;
        long upperBound = 3988L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case174() {
        long a = 94232L;
        long b = 30831L;
        long c = 1473L;
        long d = 3L;
        long upperBound = 1264L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case175() {
        long a = 67879L;
        long b = 42466L;
        long c = 4156L;
        long d = 3L;
        long upperBound = 1103L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case176() {
        long a = 44851L;
        long b = 94780L;
        long c = 5875L;
        long d = 4L;
        long upperBound = 5140L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case177() {
        long a = 100000100000L;
        long b = 100000L;
        long c = 100000L;
        long d = 100000L;
        long upperBound = 100000L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case178() {
        long a = 452L;
        long b = 24L;
        long c = 4L;
        long d = 5L;
        long upperBound = 1000000000000L;
        assertEquals(41666666658L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case179() {
        long a = 100L;
        long b = 1L;
        long c = 10L;
        long d = 2L;
        long upperBound = 90L;
        assertEquals(4L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case180() {
        long a = 100L;
        long b = 1L;
        long c = 100L;
        long d = 1L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case181() {
        long a = 30L;
        long b = 10L;
        long c = 30L;
        long d = 1L;
        long upperBound = 10L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case182() {
        long a = 1L;
        long b = 1L;
        long c = 1L;
        long d = 2L;
        long upperBound = 999999999999L;
        assertEquals(999999999999L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case183() {
        long a = 6L;
        long b = 4L;
        long c = 1L;
        long d = 2L;
        long upperBound = 1000000000000L;
        assertEquals(250000000039L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case184() {
        long a = 1L;
        long b = 1L;
        long c = 1L;
        long d = 2L;
        long upperBound = 100000000000L;
        assertEquals(100000000000L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case185() {
        long a = 1000L;
        long b = 1L;
        long c = 1L;
        long d = 100000L;
        long upperBound = 990L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case186() {
        long a = 100L;
        long b = 1L;
        long c = 100L;
        long d = 100L;
        long upperBound = 10L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case187() {
        long a = 1L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        long upperBound = 1L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case188() {
        long a = 1233123L;
        long b = 3121L;
        long c = 213L;
        long d = 123L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case189() {
        long a = 1L;
        long b = 2L;
        long c = 2L;
        long d = 3L;
        long upperBound = 123L;
        assertEquals(66L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case190() {
        long a = 100L;
        long b = 10L;
        long c = 100L;
        long d = 1L;
        long upperBound = 50L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case191() {
        long a = 474747L;
        long b = 47L;
        long c = 47L;
        long d = 47L;
        long upperBound = 47L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case192() {
        long a = 1000L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        long upperBound = 10L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case193() {
        long a = 8L;
        long b = 2L;
        long c = 9L;
        long d = 2L;
        long upperBound = 2L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case194() {
        long a = 10L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        long upperBound = 1L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case195() {
        long a = 1L;
        long b = 1L;
        long c = 1L;
        long d = 100000L;
        long upperBound = 1000000000000L;
        assertEquals(1000000000000L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case196() {
        long a = 100000L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        long upperBound = 10L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case197() {
        long a = 40L;
        long b = 10L;
        long c = 40L;
        long d = 1L;
        long upperBound = 10L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case198() {
        long a = 1000000L;
        long b = 2L;
        long c = 10001L;
        long d = 1L;
        long upperBound = 10000L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case199() {
        long a = 25L;
        long b = 1L;
        long c = 3L;
        long d = 1L;
        long upperBound = 5L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case200() {
        long a = 3L;
        long b = 2L;
        long c = 3L;
        long d = 1L;
        long upperBound = 2L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case201() {
        long a = 10L;
        long b = 1L;
        long c = 10L;
        long d = 2L;
        long upperBound = 5L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case202() {
        long a = 100L;
        long b = 1L;
        long c = 1L;
        long d = 2L;
        long upperBound = 1L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case203() {
        long a = 1000000L;
        long b = 1L;
        long c = 1L;
        long d = 2L;
        long upperBound = 10L;
        assertEquals(4L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case204() {
        long a = 1L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        long upperBound = 1000000000000L;
        assertEquals(1000000000000L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case205() {
        long a = 100L;
        long b = 2L;
        long c = 1L;
        long d = 1L;
        long upperBound = 2L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case206() {
        long a = 1L;
        long b = 1L;
        long c = 1L;
        long d = 1000L;
        long upperBound = 1000000000000L;
        assertEquals(1000000000000L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case207() {
        long a = 40L;
        long b = 7L;
        long c = 2L;
        long d = 3L;
        long upperBound = 7L;
        assertEquals(2L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case208() {
        long a = 100L;
        long b = 2L;
        long c = 3L;
        long d = 2L;
        long upperBound = 6L;
        assertEquals(2L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case209() {
        long a = 10L;
        long b = 2L;
        long c = 15L;
        long d = 1L;
        long upperBound = 14L;
        assertEquals(3L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case210() {
        long a = 1000L;
        long b = 1000L;
        long c = 1000L;
        long d = 1000L;
        long upperBound = 999L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case211() {
        long a = 10L;
        long b = 10L;
        long c = 105L;
        long d = 1L;
        long upperBound = 100L;
        assertEquals(10L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case212() {
        long a = 100L;
        long b = 1L;
        long c = 100L;
        long d = 1L;
        long upperBound = 20L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case213() {
        long a = 1L;
        long b = 3L;
        long c = 5L;
        long d = 1L;
        long upperBound = 4L;
        assertEquals(2L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case214() {
        long a = 100000000L;
        long b = 10L;
        long c = 1L;
        long d = 10L;
        long upperBound = 1000L;
        assertEquals(4L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case215() {
        long a = 1000L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        long upperBound = 100L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case216() {
        long a = 200L;
        long b = 2L;
        long c = 10L;
        long d = 2L;
        long upperBound = 100L;
        assertEquals(4L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case217() {
        long a = 10L;
        long b = 1L;
        long c = 10L;
        long d = 1L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case218() {
        long a = 2L;
        long b = 2L;
        long c = 1L;
        long d = 1L;
        long upperBound = 999999999999L;
        assertEquals(500000000000L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case219() {
        long a = 99999L;
        long b = 24L;
        long c = 377L;
        long d = 1L;
        long upperBound = 10000L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case220() {
        long a = 1000L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        long upperBound = 1L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case221() {
        long a = 10000000L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        long upperBound = 2L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case222() {
        long a = 1000L;
        long b = 10L;
        long c = 100L;
        long d = 20L;
        long upperBound = 10L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case223() {
        long a = 3L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        long upperBound = 1L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case224() {
        long a = 100000L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        long upperBound = 100L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case225() {
        long a = 2L;
        long b = 2L;
        long c = 51L;
        long d = 1L;
        long upperBound = 50L;
        assertEquals(25L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case226() {
        long a = 1L;
        long b = 1L;
        long c = 2L;
        long d = 2L;
        long upperBound = 10000000000L;
        assertEquals(10000000000L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case227() {
        long a = 40L;
        long b = 2L;
        long c = 40L;
        long d = 100000L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case228() {
        long a = 100L;
        long b = 1L;
        long c = 10L;
        long d = 10L;
        long upperBound = 2L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case229() {
        long a = 10L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        long upperBound = 1000L;
        assertEquals(992L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case230() {
        long a = 1L;
        long b = 1L;
        long c = 101L;
        long d = 1L;
        long upperBound = 100L;
        assertEquals(100L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case231() {
        long a = 1L;
        long b = 1L;
        long c = 500000000000L;
        long d = 100000L;
        long upperBound = 1000000000000L;
        assertEquals(1000000000000L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case232() {
        long a = 235L;
        long b = 2L;
        long c = 323L;
        long d = 232L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case233() {
        long a = 100000L;
        long b = 1L;
        long c = 1L;
        long d = 2L;
        long upperBound = 1L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case234() {
        long a = 10000000L;
        long b = 2L;
        long c = 2L;
        long d = 1L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case235() {
        long a = 3446L;
        long b = 34L;
        long c = 3L;
        long d = 4L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case236() {
        long a = 234L;
        long b = 24L;
        long c = 377L;
        long d = 1L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case237() {
        long a = 1L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        long upperBound = 100000000000L;
        assertEquals(100000000000L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case238() {
        long a = 12L;
        long b = 3L;
        long c = 13L;
        long d = 4L;
        long upperBound = 10L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case239() {
        long a = 10000L;
        long b = 100L;
        long c = 300L;
        long d = 2L;
        long upperBound = 9000L;
        assertEquals(5L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case240() {
        long a = 100000L;
        long b = 100L;
        long c = 1L;
        long d = 2L;
        long upperBound = 500L;
        assertEquals(9L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case241() {
        long a = 10000L;
        long b = 1L;
        long c = 1L;
        long d = 2L;
        long upperBound = 1000L;
        assertEquals(10L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case242() {
        long a = 10L;
        long b = 2L;
        long c = 2L;
        long d = 2L;
        long upperBound = 1000000000000L;
        assertEquals(499999999999L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case243() {
        long a = 234L;
        long b = 24L;
        long c = 10001L;
        long d = 1L;
        long upperBound = 10000L;
        assertEquals(407L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case244() {
        long a = 1000000000000L;
        long b = 2L;
        long c = 1L;
        long d = 1L;
        long upperBound = 100L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case245() {
        long a = 1000L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        long upperBound = 5L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case246() {
        long a = 2L;
        long b = 2L;
        long c = 2L;
        long d = 2L;
        long upperBound = 1000000000000L;
        assertEquals(500000000000L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case247() {
        long a = 1233123L;
        long b = 3121L;
        long c = 213L;
        long d = 1L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case248() {
        long a = 1000000L;
        long b = 1L;
        long c = 100L;
        long d = 1L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case249() {
        long a = 10L;
        long b = 10L;
        long c = 11L;
        long d = 1L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case250() {
        long a = 1L;
        long b = 3L;
        long c = 3L;
        long d = 2L;
        long upperBound = 930000000000L;
        assertEquals(310000000039L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case251() {
        long a = 11L;
        long b = 1L;
        long c = 11L;
        long d = 1L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case252() {
        long a = 5000L;
        long b = 2L;
        long c = 3L;
        long d = 2L;
        long upperBound = 50L;
        assertEquals(5L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case253() {
        long a = 3000L;
        long b = 1L;
        long c = 2000L;
        long d = 1L;
        long upperBound = 1000L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case254() {
        long a = 11L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        long upperBound = 1L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case255() {
        long a = 100L;
        long b = 1L;
        long c = 100L;
        long d = 1L;
        long upperBound = 10L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case256() {
        long a = 1000L;
        long b = 1L;
        long c = 1000L;
        long d = 1L;
        long upperBound = 10L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case257() {
        long a = 3000L;
        long b = 4L;
        long c = 2L;
        long d = 10L;
        long upperBound = 3L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case258() {
        long a = 2L;
        long b = 3L;
        long c = 4L;
        long d = 2L;
        long upperBound = 100000000000L;
        assertEquals(33333333351L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case259() {
        long a = 2L;
        long b = 2L;
        long c = 2L;
        long d = 2L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case260() {
        long a = 2L;
        long b = 1L;
        long c = 2L;
        long d = 1L;
        long upperBound = 1000000000000L;
        assertEquals(999999999999L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case261() {
        long a = 500000000L;
        long b = 500000000L;
        long c = 10000000000L;
        long d = 1L;
        long upperBound = 8000000000L;
        assertEquals(16L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case262() {
        long a = 234L;
        long b = 24L;
        long c = 377L;
        long d = 1L;
        long upperBound = 100L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case263() {
        long a = 123L;
        long b = 456L;
        long c = 24L;
        long d = 1L;
        long upperBound = 100000000000L;
        assertEquals(219298247L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case264() {
        long a = 4L;
        long b = 5L;
        long c = 3L;
        long d = 2L;
        long upperBound = 999999999999L;
        assertEquals(200000000030L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case265() {
        long a = 7L;
        long b = 2L;
        long c = 5L;
        long d = 6L;
        long upperBound = 3L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case266() {
        long a = 1L;
        long b = 2L;
        long c = 2L;
        long d = 1L;
        long upperBound = 1000000000000L;
        assertEquals(500000000001L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case267() {
        long a = 10L;
        long b = 1L;
        long c = 10L;
        long d = 2L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case268() {
        long a = 10000L;
        long b = 1L;
        long c = 21L;
        long d = 2L;
        long upperBound = 1000L;
        assertEquals(6L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case269() {
        long a = 1000L;
        long b = 2L;
        long c = 2L;
        long d = 3L;
        long upperBound = 2L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case270() {
        long a = 2L;
        long b = 2L;
        long c = 9L;
        long d = 1L;
        long upperBound = 5L;
        assertEquals(2L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case271() {
        long a = 2L;
        long b = 3L;
        long c = 7L;
        long d = 3L;
        long upperBound = 1000000000000L;
        assertEquals(333333333357L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case272() {
        long a = 1111111L;
        long b = 11L;
        long c = 1L;
        long d = 1L;
        long upperBound = 2500L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case273() {
        long a = 1000L;
        long b = 1L;
        long c = 100000L;
        long d = 1L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case274() {
        long a = 150L;
        long b = 1L;
        long c = 20L;
        long d = 1L;
        long upperBound = 100L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case275() {
        long a = 1000000L;
        long b = 10L;
        long c = 4000000L;
        long d = 100000L;
        long upperBound = 999999999999L;
        assertEquals(99999900000L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case276() {
        long a = 999999999999L;
        long b = 1L;
        long c = 1L;
        long d = 2L;
        long upperBound = 99999999999L;
        assertEquals(37L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case277() {
        long a = 1000L;
        long b = 24L;
        long c = 100L;
        long d = 1L;
        long upperBound = 10L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case278() {
        long a = 2L;
        long b = 3L;
        long c = 5L;
        long d = 1L;
        long upperBound = 10000L;
        assertEquals(3333L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case279() {
        long a = 22L;
        long b = 4L;
        long c = 18L;
        long d = 1L;
        long upperBound = 20L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case280() {
        long a = 103L;
        long b = 3L;
        long c = 5L;
        long d = 1L;
        long upperBound = 5L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case281() {
        long a = 100L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        long upperBound = 1L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case282() {
        long a = 500L;
        long b = 5L;
        long c = 1000L;
        long d = 2L;
        long upperBound = 499L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case283() {
        long a = 1L;
        long b = 2L;
        long c = 4L;
        long d = 1L;
        long upperBound = 2L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case284() {
        long a = 10L;
        long b = 3L;
        long c = 8L;
        long d = 1L;
        long upperBound = 8L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case285() {
        long a = 5L;
        long b = 2L;
        long c = 3L;
        long d = 1L;
        long upperBound = 10L;
        assertEquals(4L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case286() {
        long a = 5L;
        long b = 2L;
        long c = 10L;
        long d = 1L;
        long upperBound = 9L;
        assertEquals(3L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case287() {
        long a = 1L;
        long b = 1000000000L;
        long c = 5L;
        long d = 1L;
        long upperBound = 1000000000L;
        assertEquals(2L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case288() {
        long a = 1001L;
        long b = 5L;
        long c = 1001L;
        long d = 1L;
        long upperBound = 1000L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case289() {
        long a = 1000L;
        long b = 1L;
        long c = 1000L;
        long d = 1L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case290() {
        long a = 100L;
        long b = 1L;
        long c = 1000L;
        long d = 1L;
        long upperBound = 10L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case291() {
        long a = 100L;
        long b = 2L;
        long c = 2L;
        long d = 2L;
        long upperBound = 10L;
        assertEquals(3L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case292() {
        long a = 4L;
        long b = 2L;
        long c = 25L;
        long d = 1L;
        long upperBound = 20L;
        assertEquals(9L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case293() {
        long a = 1000L;
        long b = 2L;
        long c = 3L;
        long d = 3L;
        long upperBound = 100L;
        assertEquals(4L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case294() {
        long a = 1L;
        long b = 2L;
        long c = 100000000002L;
        long d = 1L;
        long upperBound = 100000000000L;
        assertEquals(50000000000L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case295() {
        long a = 10000L;
        long b = 1000L;
        long c = 20000L;
        long d = 1L;
        long upperBound = 100L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case296() {
        long a = 100L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        long upperBound = 4L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case297() {
        long a = 213L;
        long b = 3121L;
        long c = 213L;
        long d = 1L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case298() {
        long a = 1L;
        long b = 2L;
        long c = 12L;
        long d = 1L;
        long upperBound = 10L;
        assertEquals(5L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case299() {
        long a = 1L;
        long b = 1L;
        long c = 2L;
        long d = 2L;
        long upperBound = 1000000000000L;
        assertEquals(1000000000000L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case300() {
        long a = 1L;
        long b = 2L;
        long c = 6L;
        long d = 1L;
        long upperBound = 3L;
        assertEquals(2L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case301() {
        long a = 1L;
        long b = 2L;
        long c = 1L;
        long d = 2L;
        long upperBound = 1000000000000L;
        assertEquals(500000000039L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case302() {
        long a = 10L;
        long b = 2L;
        long c = 5L;
        long d = 1L;
        long upperBound = 3L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case303() {
        long a = 1000000000L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        long upperBound = 1L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case304() {
        long a = 10000L;
        long b = 200L;
        long c = 1000000L;
        long d = 100L;
        long upperBound = 9999L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case305() {
        long a = 10L;
        long b = 1L;
        long c = 100L;
        long d = 1L;
        long upperBound = 100000000000L;
        assertEquals(99999999991L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case306() {
        long a = 601L;
        long b = 24L;
        long c = 4L;
        long d = 5L;
        long upperBound = 600L;
        assertEquals(4L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case307() {
        long a = 1L;
        long b = 2L;
        long c = 1L;
        long d = 1L;
        long upperBound = 1000000000000L;
        assertEquals(500000000000L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case308() {
        long a = 2L;
        long b = 2L;
        long c = 3L;
        long d = 3L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case309() {
        long a = 1L;
        long b = 1L;
        long c = 2L;
        long d = 1L;
        long upperBound = 1000000000000L;
        assertEquals(1000000000000L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case310() {
        long a = 100L;
        long b = 1L;
        long c = 5L;
        long d = 1L;
        long upperBound = 2L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case311() {
        long a = 100L;
        long b = 100L;
        long c = 100L;
        long d = 100L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case312() {
        long a = 2L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        long upperBound = 100L;
        assertEquals(100L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case313() {
        long a = 1L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        long upperBound = 10L;
        assertEquals(10L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case314() {
        long a = 20L;
        long b = 10L;
        long c = 10L;
        long d = 1L;
        long upperBound = 1000L;
        assertEquals(100L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case315() {
        long a = 1L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        long upperBound = 10000000000L;
        assertEquals(10000000000L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case316() {
        long a = 1L;
        long b = 2L;
        long c = 1L;
        long d = 1L;
        long upperBound = 100000000000L;
        assertEquals(50000000000L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case317() {
        long a = 1000000000L;
        long b = 77L;
        long c = 40L;
        long d = 100000L;
        long upperBound = 40L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case318() {
        long a = 100000L;
        long b = 1L;
        long c = 100000L;
        long d = 1L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case319() {
        long a = 1L;
        long b = 1L;
        long c = 3L;
        long d = 2L;
        long upperBound = 100000000000L;
        assertEquals(100000000000L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case320() {
        long a = 100L;
        long b = 1L;
        long c = 12L;
        long d = 12L;
        long upperBound = 10L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case321() {
        long a = 544L;
        long b = 1L;
        long c = 5315354L;
        long d = 22221L;
        long upperBound = 1000000000000L;
        assertEquals(999999999457L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case322() {
        long a = 4L;
        long b = 1L;
        long c = 3L;
        long d = 2L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case323() {
        long a = 2L;
        long b = 2L;
        long c = 2L;
        long d = 1L;
        long upperBound = 1365434643L;
        assertEquals(682717321L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case324() {
        long a = 100L;
        long b = 1L;
        long c = 100L;
        long d = 1L;
        long upperBound = 1000000000000L;
        assertEquals(999999999901L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case325() {
        long a = 1000000L;
        long b = 1000000L;
        long c = 1000000L;
        long d = 1000L;
        long upperBound = 1000000000L;
        assertEquals(1000L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case326() {
        long a = 100L;
        long b = 100L;
        long c = 1L;
        long d = 1L;
        long upperBound = 10L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case327() {
        long a = 10L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        long upperBound = 5L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case328() {
        long a = 100L;
        long b = 100L;
        long c = 100L;
        long d = 100L;
        long upperBound = 100000000L;
        assertEquals(1000000L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case329() {
        long a = 10L;
        long b = 5L;
        long c = 100L;
        long d = 100L;
        long upperBound = 9L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case330() {
        long a = 5000L;
        long b = 3L;
        long c = 1L;
        long d = 2L;
        long upperBound = 1000L;
        assertEquals(10L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case331() {
        long a = 5L;
        long b = 4L;
        long c = 100L;
        long d = 2L;
        long upperBound = 4L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case332() {
        long a = 10000L;
        long b = 1L;
        long c = 1L;
        long d = 1000L;
        long upperBound = 10000000000L;
        assertEquals(9999990003L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case333() {
        long a = 200L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        long upperBound = 1L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case334() {
        long a = 10000L;
        long b = 10000L;
        long c = 10000L;
        long d = 10000L;
        long upperBound = 10L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case335() {
        long a = 100500L;
        long b = 1L;
        long c = 3L;
        long d = 10L;
        long upperBound = 1000L;
        assertEquals(3L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case336() {
        long a = 10L;
        long b = 3L;
        long c = 4L;
        long d = 4L;
        long upperBound = 9L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case337() {
        long a = 1000221L;
        long b = 23L;
        long c = 2L;
        long d = 323L;
        long upperBound = 212L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case338() {
        long a = 1L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        long upperBound = 2L;
        assertEquals(2L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case339() {
        long a = 1L;
        long b = 100L;
        long c = 3L;
        long d = 1L;
        long upperBound = 2L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case340() {
        long a = 8L;
        long b = 2L;
        long c = 10L;
        long d = 1L;
        long upperBound = 3L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case341() {
        long a = 100L;
        long b = 1L;
        long c = 1L;
        long d = 2L;
        long upperBound = 10L;
        assertEquals(4L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case342() {
        long a = 10L;
        long b = 10L;
        long c = 10L;
        long d = 10L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case343() {
        long a = 234L;
        long b = 24L;
        long c = 377L;
        long d = 1L;
        long upperBound = 1000000000000L;
        assertEquals(41666666658L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case344() {
        long a = 1999L;
        long b = 1L;
        long c = 1L;
        long d = 3L;
        long upperBound = 55L;
        assertEquals(4L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case345() {
        long a = 3L;
        long b = 3L;
        long c = 3L;
        long d = 1L;
        long upperBound = 7L;
        assertEquals(2L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case346() {
        long a = 2L;
        long b = 2L;
        long c = 3L;
        long d = 2L;
        long upperBound = 1000000000000L;
        assertEquals(500000000001L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case347() {
        long a = 1000000L;
        long b = 1L;
        long c = 1L;
        long d = 2L;
        long upperBound = 1000L;
        assertEquals(10L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case348() {
        long a = 1000000000L;
        long b = 1L;
        long c = 3L;
        long d = 3L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case349() {
        long a = 999999999999L;
        long b = 1L;
        long c = 1L;
        long d = 2L;
        long upperBound = 1L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case350() {
        long a = 1000000L;
        long b = 1000000L;
        long c = 100000L;
        long d = 100000L;
        long upperBound = 10L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case351() {
        long a = 234L;
        long b = 24L;
        long c = 377L;
        long d = 1L;
        long upperBound = 100000000000L;
        assertEquals(4166666658L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case352() {
        long a = 30L;
        long b = 1L;
        long c = 30L;
        long d = 30L;
        long upperBound = 5L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case353() {
        long a = 1L;
        long b = 3L;
        long c = 20L;
        long d = 1L;
        long upperBound = 10L;
        assertEquals(4L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case354() {
        long a = 2L;
        long b = 2L;
        long c = 5L;
        long d = 1L;
        long upperBound = 4L;
        assertEquals(2L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case355() {
        long a = 1000L;
        long b = 10L;
        long c = 10L;
        long d = 10L;
        long upperBound = 10L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case356() {
        long a = 1L;
        long b = 10L;
        long c = 100L;
        long d = 1L;
        long upperBound = 20L;
        assertEquals(2L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case357() {
        long a = 10L;
        long b = 1L;
        long c = 5L;
        long d = 1L;
        long upperBound = 10L;
        assertEquals(2L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case358() {
        long a = 100L;
        long b = 2L;
        long c = 100L;
        long d = 1L;
        long upperBound = 7L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case359() {
        long a = 100000000L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        long upperBound = 10L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case360() {
        long a = 100000L;
        long b = 2L;
        long c = 10000L;
        long d = 2L;
        long upperBound = 100L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case361() {
        long a = 9L;
        long b = 3L;
        long c = 10L;
        long d = 1L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case362() {
        long a = 100L;
        long b = 10L;
        long c = 8L;
        long d = 1L;
        long upperBound = 10L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case363() {
        long a = 2L;
        long b = 2L;
        long c = 1000001L;
        long d = 1L;
        long upperBound = 1000L;
        assertEquals(500L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case364() {
        long a = 100L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        long upperBound = 10L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case365() {
        long a = 100L;
        long b = 10L;
        long c = 10L;
        long d = 1L;
        long upperBound = 2L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case366() {
        long a = 100000000000L;
        long b = 100000000000L;
        long c = 100000000000L;
        long d = 100000L;
        long upperBound = 100000000000L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case367() {
        long a = 3L;
        long b = 3L;
        long c = 3L;
        long d = 3L;
        long upperBound = 2L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case368() {
        long a = 1000000L;
        long b = 1L;
        long c = 1L;
        long d = 2L;
        long upperBound = 1024L;
        assertEquals(11L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case369() {
        long a = 100L;
        long b = 100L;
        long c = 3L;
        long d = 1L;
        long upperBound = 99L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case370() {
        long a = 1231231L;
        long b = 2L;
        long c = 167883835L;
        long d = 2L;
        long upperBound = 2L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case371() {
        long a = 1L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        long upperBound = 1000000000L;
        assertEquals(1000000000L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case372() {
        long a = 10000000L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        long upperBound = 100L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case373() {
        long a = 500L;
        long b = 1L;
        long c = 10L;
        long d = 10L;
        long upperBound = 20L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case374() {
        long a = 100000L;
        long b = 10L;
        long c = 50L;
        long d = 1000L;
        long upperBound = 50L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case375() {
        long a = 100L;
        long b = 10L;
        long c = 10L;
        long d = 10L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case376() {
        long a = 20L;
        long b = 1L;
        long c = 11L;
        long d = 1L;
        long upperBound = 10L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case377() {
        long a = 1L;
        long b = 2L;
        long c = 1L;
        long d = 2L;
        long upperBound = 10000000000L;
        assertEquals(5000000033L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case378() {
        long a = 10000000L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        long upperBound = 100000L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case379() {
        long a = 100L;
        long b = 1L;
        long c = 999999L;
        long d = 1000L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case380() {
        long a = 10L;
        long b = 1L;
        long c = 8L;
        long d = 1L;
        long upperBound = 7L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case381() {
        long a = 1L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        long upperBound = 4294967299L;
        assertEquals(4294967299L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case382() {
        long a = 1L;
        long b = 1L;
        long c = 1L;
        long d = 2L;
        long upperBound = 10000000000L;
        assertEquals(10000000000L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case383() {
        long a = 500L;
        long b = 1L;
        long c = 1L;
        long d = 3L;
        long upperBound = 10L;
        assertEquals(3L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case384() {
        long a = 4L;
        long b = 2L;
        long c = 5L;
        long d = 1L;
        long upperBound = 2L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case385() {
        long a = 100L;
        long b = 1L;
        long c = 5L;
        long d = 5L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case386() {
        long a = 100L;
        long b = 1L;
        long c = 10L;
        long d = 2L;
        long upperBound = 50L;
        assertEquals(3L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case387() {
        long a = 2L;
        long b = 3L;
        long c = 12L;
        long d = 1L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case388() {
        long a = 11L;
        long b = 7L;
        long c = 1L;
        long d = 100000L;
        long upperBound = 1000000000000L;
        assertEquals(142857142858L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case389() {
        long a = 1000L;
        long b = 1L;
        long c = 1000L;
        long d = 2L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case390() {
        long a = 10L;
        long b = 10L;
        long c = 10L;
        long d = 1L;
        long upperBound = 2L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case391() {
        long a = 4L;
        long b = 5L;
        long c = 10L;
        long d = 10L;
        long upperBound = 5L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case392() {
        long a = 50L;
        long b = 5L;
        long c = 1L;
        long d = 1L;
        long upperBound = 5L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case393() {
        long a = 1000000000000L;
        long b = 4L;
        long c = 1L;
        long d = 2L;
        long upperBound = 10L;
        assertEquals(4L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case394() {
        long a = 10L;
        long b = 2L;
        long c = 2L;
        long d = 1L;
        long upperBound = 100000L;
        assertEquals(49997L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case395() {
        long a = 20L;
        long b = 10L;
        long c = 10L;
        long d = 1L;
        long upperBound = 100L;
        assertEquals(10L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case396() {
        long a = 2L;
        long b = 3L;
        long c = 8L;
        long d = 2L;
        long upperBound = 100000000L;
        assertEquals(33333345L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case397() {
        long a = 1000000L;
        long b = 10L;
        long c = 4000000L;
        long d = 100000L;
        long upperBound = 100L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case398() {
        long a = 100L;
        long b = 1L;
        long c = 2L;
        long d = 2L;
        long upperBound = 10L;
        assertEquals(3L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case399() {
        long a = 11L;
        long b = 11L;
        long c = 12L;
        long d = 12L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case400() {
        long a = 10L;
        long b = 10L;
        long c = 1L;
        long d = 2L;
        long upperBound = 5L;
        assertEquals(3L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case401() {
        long a = 15L;
        long b = 5L;
        long c = 10L;
        long d = 1L;
        long upperBound = 20L;
        assertEquals(3L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case402() {
        long a = 100L;
        long b = 100L;
        long c = 200L;
        long d = 1L;
        long upperBound = 1000L;
        assertEquals(10L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case403() {
        long a = 2L;
        long b = 1000L;
        long c = 1L;
        long d = 1L;
        long upperBound = 1L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case404() {
        long a = 100000000L;
        long b = 1L;
        long c = 3456L;
        long d = 1L;
        long upperBound = 1000000L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case405() {
        long a = 23545634646L;
        long b = 34656757543L;
        long c = 32534253456L;
        long d = 23523L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case406() {
        long a = 10000000L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        long upperBound = 1L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case407() {
        long a = 1000L;
        long b = 10000L;
        long c = 10000L;
        long d = 10000L;
        long upperBound = 11L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case408() {
        long a = 100L;
        long b = 1L;
        long c = 100L;
        long d = 1L;
        long upperBound = 2L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case409() {
        long a = 1000000L;
        long b = 1L;
        long c = 1L;
        long d = 2L;
        long upperBound = 1000000000000L;
        assertEquals(999999000021L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case410() {
        long a = 1L;
        long b = 2L;
        long c = 10L;
        long d = 1L;
        long upperBound = 2L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case411() {
        long a = 2L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        long upperBound = 2L;
        assertEquals(2L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case412() {
        long a = 4L;
        long b = 2L;
        long c = 7L;
        long d = 1L;
        long upperBound = 6L;
        assertEquals(2L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case413() {
        long a = 20L;
        long b = 10L;
        long c = 101L;
        long d = 1L;
        long upperBound = 100L;
        assertEquals(9L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case414() {
        long a = 432424L;
        long b = 56L;
        long c = 42L;
        long d = 54L;
        long upperBound = 23L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case415() {
        long a = 1L;
        long b = 4L;
        long c = 1L;
        long d = 1L;
        long upperBound = 2L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case416() {
        long a = 1L;
        long b = 2L;
        long c = 2L;
        long d = 1L;
        long upperBound = 1L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case417() {
        long a = 100000L;
        long b = 100000L;
        long c = 100000L;
        long d = 100000L;
        long upperBound = 4L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case418() {
        long a = 1000000000000L;
        long b = 1L;
        long c = 1000000000000L;
        long d = 1L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case419() {
        long a = 4L;
        long b = 1L;
        long c = 1L;
        long d = 2L;
        long upperBound = 3L;
        assertEquals(2L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case420() {
        long a = 234L;
        long b = 24L;
        long c = 24234L;
        long d = 1L;
        long upperBound = 10000L;
        assertEquals(407L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case421() {
        long a = 372723L;
        long b = 2L;
        long c = 2L;
        long d = 2L;
        long upperBound = 33L;
        assertEquals(5L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case422() {
        long a = 1L;
        long b = 4L;
        long c = 3L;
        long d = 1L;
        long upperBound = 2L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case423() {
        long a = 100L;
        long b = 1L;
        long c = 100L;
        long d = 1L;
        long upperBound = 10000000000L;
        assertEquals(9999999901L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case424() {
        long a = 1000000000000L;
        long b = 10L;
        long c = 10L;
        long d = 10L;
        long upperBound = 999999999999L;
        assertEquals(11L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case425() {
        long a = 2L;
        long b = 3L;
        long c = 1L;
        long d = 2L;
        long upperBound = 1000000000000L;
        assertEquals(333333333353L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case426() {
        long a = 1000L;
        long b = 1000L;
        long c = 999L;
        long d = 1L;
        long upperBound = 20L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case427() {
        long a = 3L;
        long b = 2L;
        long c = 4L;
        long d = 5L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case428() {
        long a = 55L;
        long b = 55L;
        long c = 50L;
        long d = 1L;
        long upperBound = 60L;
        assertEquals(2L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case429() {
        long a = 100000L;
        long b = 2L;
        long c = 2L;
        long d = 2L;
        long upperBound = 2L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case430() {
        long a = 1000L;
        long b = 1L;
        long c = 1000L;
        long d = 1L;
        long upperBound = 100000L;
        assertEquals(99001L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case431() {
        long a = 123L;
        long b = 456L;
        long c = 24L;
        long d = 1L;
        long upperBound = 100000000001L;
        assertEquals(219298247L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case432() {
        long a = 100L;
        long b = 100L;
        long c = 100L;
        long d = 100L;
        long upperBound = 2L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case433() {
        long a = 500L;
        long b = 5L;
        long c = 399L;
        long d = 2L;
        long upperBound = 399L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case434() {
        long a = 1000L;
        long b = 2L;
        long c = 100000L;
        long d = 100000L;
        long upperBound = 10L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case435() {
        long a = 3L;
        long b = 2L;
        long c = 12L;
        long d = 1L;
        long upperBound = 10L;
        assertEquals(4L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case436() {
        long a = 199L;
        long b = 100L;
        long c = 10000L;
        long d = 1L;
        long upperBound = 100L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case437() {
        long a = 10L;
        long b = 2L;
        long c = 10L;
        long d = 2L;
        long upperBound = 5L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case438() {
        long a = 12345L;
        long b = 1L;
        long c = 12345L;
        long d = 1L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case439() {
        long a = 1000L;
        long b = 1000L;
        long c = 1000L;
        long d = 1000L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case440() {
        long a = 4L;
        long b = 2L;
        long c = 3L;
        long d = 1L;
        long upperBound = 2L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case441() {
        long a = 1L;
        long b = 1L;
        long c = 3L;
        long d = 1L;
        long upperBound = 2L;
        assertEquals(2L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case442() {
        long a = 10L;
        long b = 1L;
        long c = 2L;
        long d = 1L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case443() {
        long a = 100000000000L;
        long b = 3L;
        long c = 4L;
        long d = 2L;
        long upperBound = 100L;
        assertEquals(5L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case444() {
        long a = 100L;
        long b = 100L;
        long c = 100L;
        long d = 1L;
        long upperBound = 12L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case445() {
        long a = 1000L;
        long b = 999L;
        long c = 1L;
        long d = 25L;
        long upperBound = 125L;
        assertEquals(2L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case446() {
        long a = 2L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        long upperBound = 1000000000000L;
        assertEquals(1000000000000L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case447() {
        long a = 20L;
        long b = 1L;
        long c = 1L;
        long d = 2L;
        long upperBound = 1000L;
        assertEquals(986L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case448() {
        long a = 34L;
        long b = 1L;
        long c = 2L;
        long d = 3L;
        long upperBound = 1000000000000L;
        assertEquals(999999999970L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case449() {
        long a = 15L;
        long b = 2L;
        long c = 1L;
        long d = 2L;
        long upperBound = 8L;
        assertEquals(4L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case450() {
        long a = 3L;
        long b = 1L;
        long c = 4L;
        long d = 1L;
        long upperBound = 1000L;
        assertEquals(998L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case451() {
        long a = 239999L;
        long b = 565555L;
        long c = 3L;
        long d = 7L;
        long upperBound = 549L;
        assertEquals(3L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case452() {
        long a = 1000L;
        long b = 3L;
        long c = 3L;
        long d = 2L;
        long upperBound = 93L;
        assertEquals(5L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case453() {
        long a = 45L;
        long b = 1L;
        long c = 1L;
        long d = 2L;
        long upperBound = 2L;
        assertEquals(2L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case454() {
        long a = 10L;
        long b = 5L;
        long c = 5L;
        long d = 1L;
        long upperBound = 1000L;
        assertEquals(200L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case455() {
        long a = 10000000L;
        long b = 2L;
        long c = 1L;
        long d = 2L;
        long upperBound = 100000000000L;
        assertEquals(49995000025L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case456() {
        long a = 100000L;
        long b = 5L;
        long c = 100000L;
        long d = 2L;
        long upperBound = 1000L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case457() {
        long a = 100000L;
        long b = 7L;
        long c = 51L;
        long d = 1L;
        long upperBound = 50L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case458() {
        long a = 10L;
        long b = 1L;
        long c = 10L;
        long d = 1L;
        long upperBound = 2L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case459() {
        long a = 1L;
        long b = 1L;
        long c = 2L;
        long d = 1L;
        long upperBound = 5L;
        assertEquals(5L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case460() {
        long a = 1000000000L;
        long b = 1L;
        long c = 1000000000L;
        long d = 2L;
        long upperBound = 2L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case461() {
        long a = 100L;
        long b = 1L;
        long c = 2L;
        long d = 1L;
        long upperBound = 5L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case462() {
        long a = 1L;
        long b = 1L;
        long c = 10L;
        long d = 10L;
        long upperBound = 1000000000000L;
        assertEquals(1000000000000L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case463() {
        long a = 5L;
        long b = 1L;
        long c = 5L;
        long d = 1L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case464() {
        long a = 8L;
        long b = 4L;
        long c = 4L;
        long d = 1L;
        long upperBound = 10L;
        assertEquals(2L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case465() {
        long a = 100000L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        long upperBound = 1L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case466() {
        long a = 100L;
        long b = 2L;
        long c = 10L;
        long d = 1L;
        long upperBound = 5L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case467() {
        long a = 10L;
        long b = 2L;
        long c = 9L;
        long d = 1L;
        long upperBound = 8L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case468() {
        long a = 1L;
        long b = 3L;
        long c = 1000001L;
        long d = 1L;
        long upperBound = 10L;
        assertEquals(4L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case469() {
        long a = 200000L;
        long b = 1L;
        long c = 10L;
        long d = 1L;
        long upperBound = 10L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case470() {
        long a = 100003L;
        long b = 2L;
        long c = 4L;
        long d = 5L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case471() {
        long a = 2L;
        long b = 2L;
        long c = 2L;
        long d = 1L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case472() {
        long a = 1L;
        long b = 10L;
        long c = 100L;
        long d = 1L;
        long upperBound = 50L;
        assertEquals(5L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case473() {
        long a = 30L;
        long b = 1L;
        long c = 2L;
        long d = 2L;
        long upperBound = 5L;
        assertEquals(2L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case474() {
        long a = 432424L;
        long b = 56L;
        long c = 42L;
        long d = 54L;
        long upperBound = 432400L;
        assertEquals(3L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case475() {
        long a = 17L;
        long b = 1L;
        long c = 1L;
        long d = 2L;
        long upperBound = 16L;
        assertEquals(5L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case476() {
        long a = 544L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        long upperBound = 1L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case477() {
        long a = 1000L;
        long b = 1L;
        long c = 10L;
        long d = 2L;
        long upperBound = 10L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case478() {
        long a = 10L;
        long b = 10L;
        long c = 1L;
        long d = 1L;
        long upperBound = 9L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case479() {
        long a = 1000L;
        long b = 1L;
        long c = 999L;
        long d = 1L;
        long upperBound = 100000L;
        assertEquals(99002L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case480() {
        long a = 20L;
        long b = 10L;
        long c = 100L;
        long d = 100L;
        long upperBound = 19L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case481() {
        long a = 5L;
        long b = 3L;
        long c = 1L;
        long d = 1L;
        long upperBound = 3L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case482() {
        long a = 10000L;
        long b = 1L;
        long c = 10000L;
        long d = 1L;
        long upperBound = 100L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case483() {
        long a = 2L;
        long b = 2L;
        long c = 9L;
        long d = 1L;
        long upperBound = 8L;
        assertEquals(4L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case484() {
        long a = 100L;
        long b = 100L;
        long c = 100L;
        long d = 100L;
        long upperBound = 99L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case485() {
        long a = 4L;
        long b = 1L;
        long c = 16L;
        long d = 20L;
        long upperBound = 2L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case486() {
        long a = 11L;
        long b = 20L;
        long c = 100L;
        long d = 2L;
        long upperBound = 10L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case487() {
        long a = 2L;
        long b = 2L;
        long c = 1L;
        long d = 2L;
        long upperBound = 1000000000000L;
        assertEquals(500000000001L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case488() {
        long a = 41L;
        long b = 51L;
        long c = 34L;
        long d = 1L;
        long upperBound = 5L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case489() {
        long a = 10L;
        long b = 1L;
        long c = 9L;
        long d = 1L;
        long upperBound = 15L;
        assertEquals(7L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case490() {
        long a = 100L;
        long b = 10L;
        long c = 10L;
        long d = 2L;
        long upperBound = 1000L;
        assertEquals(95L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case491() {
        long a = 1L;
        long b = 3L;
        long c = 1L;
        long d = 3L;
        long upperBound = 1000000000000L;
        assertEquals(333333333359L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case492() {
        long a = 100L;
        long b = 37L;
        long c = 150L;
        long d = 1L;
        long upperBound = 10L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case493() {
        long a = 10L;
        long b = 3L;
        long c = 1000L;
        long d = 1L;
        long upperBound = 100L;
        assertEquals(31L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case494() {
        long a = 11L;
        long b = 5L;
        long c = 15L;
        long d = 1L;
        long upperBound = 10L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case495() {
        long a = 100000L;
        long b = 2L;
        long c = 20000L;
        long d = 1L;
        long upperBound = 10000L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case496() {
        long a = 10L;
        long b = 20L;
        long c = 100000L;
        long d = 1L;
        long upperBound = 9999L;
        assertEquals(500L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case497() {
        long a = 6L;
        long b = 4L;
        long c = 3L;
        long d = 1L;
        long upperBound = 2L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case498() {
        long a = 505L;
        long b = 5L;
        long c = 1L;
        long d = 1L;
        long upperBound = 5L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case499() {
        long a = 10L;
        long b = 13L;
        long c = 200L;
        long d = 1L;
        long upperBound = 100L;
        assertEquals(7L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case500() {
        long a = 4L;
        long b = 5L;
        long c = 1L;
        long d = 1L;
        long upperBound = 2L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case501() {
        long a = 11L;
        long b = 11L;
        long c = 11L;
        long d = 11L;
        long upperBound = 10L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case502() {
        long a = 100L;
        long b = 100L;
        long c = 200L;
        long d = 1L;
        long upperBound = 100L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case503() {
        long a = 100L;
        long b = 7L;
        long c = 52L;
        long d = 1L;
        long upperBound = 50L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case504() {
        long a = 544L;
        long b = 1L;
        long c = 544L;
        long d = 1L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case505() {
        long a = 1000000000000L;
        long b = 1L;
        long c = 10000L;
        long d = 10000L;
        long upperBound = 100L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case506() {
        long a = 14605L;
        long b = 3903L;
        long c = 154L;
        long d = 100000L;
        long upperBound = 1000000000000L;
        assertEquals(256213168L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case507() {
        long a = 2L;
        long b = 3L;
        long c = 3L;
        long d = 1L;
        long upperBound = 3L;
        assertEquals(2L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case508() {
        long a = 10L;
        long b = 10L;
        long c = 1000000000000L;
        long d = 1L;
        long upperBound = 1000L;
        assertEquals(100L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case509() {
        long a = 200L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        long upperBound = 100L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case510() {
        long a = 12L;
        long b = 1L;
        long c = 10L;
        long d = 1L;
        long upperBound = 9L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case511() {
        long a = 10L;
        long b = 1L;
        long c = 6L;
        long d = 1L;
        long upperBound = 5L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case512() {
        long a = 10000L;
        long b = 10000L;
        long c = 100000L;
        long d = 1L;
        long upperBound = 10000000L;
        assertEquals(1000L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case513() {
        long a = 40L;
        long b = 40L;
        long c = 999L;
        long d = 1L;
        long upperBound = 60L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case514() {
        long a = 5L;
        long b = 1L;
        long c = 5L;
        long d = 1L;
        long upperBound = 7L;
        assertEquals(3L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case515() {
        long a = 20L;
        long b = 1L;
        long c = 2L;
        long d = 100L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case516() {
        long a = 4L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        long upperBound = 4L;
        assertEquals(2L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case517() {
        long a = 2L;
        long b = 2L;
        long c = 3L;
        long d = 5L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case518() {
        long a = 900000000000L;
        long b = 1L;
        long c = 1L;
        long d = 2L;
        long upperBound = 800000000000L;
        assertEquals(40L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case519() {
        long a = 150L;
        long b = 37L;
        long c = 100L;
        long d = 1L;
        long upperBound = 10L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case520() {
        long a = 1L;
        long b = 2L;
        long c = 2L;
        long d = 1L;
        long upperBound = 2L;
        assertEquals(2L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case521() {
        long a = 100L;
        long b = 100L;
        long c = 100L;
        long d = 200L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case522() {
        long a = 757147L;
        long b = 167851000L;
        long c = 301413356L;
        long d = 9L;
        long upperBound = 791550396L;
        assertEquals(6L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case523() {
        long a = 1L;
        long b = 1L;
        long c = 2L;
        long d = 3L;
        long upperBound = 1000000000000L;
        assertEquals(1000000000000L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case524() {
        long a = 7L;
        long b = 1L;
        long c = 3L;
        long d = 1L;
        long upperBound = 2L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case525() {
        long a = 1000L;
        long b = 1L;
        long c = 5L;
        long d = 1L;
        long upperBound = 2L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case526() {
        long a = 1000L;
        long b = 5L;
        long c = 2L;
        long d = 1L;
        long upperBound = 2L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case527() {
        long a = 100L;
        long b = 3L;
        long c = 150L;
        long d = 1L;
        long upperBound = 50L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case528() {
        long a = 10L;
        long b = 10L;
        long c = 15L;
        long d = 1L;
        long upperBound = 10L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case529() {
        long a = 10L;
        long b = 10L;
        long c = 10L;
        long d = 1L;
        long upperBound = 9L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case530() {
        long a = 10L;
        long b = 1L;
        long c = 2L;
        long d = 2L;
        long upperBound = 1L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case531() {
        long a = 1000L;
        long b = 1L;
        long c = 1000L;
        long d = 1L;
        long upperBound = 5L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case532() {
        long a = 10L;
        long b = 10L;
        long c = 1L;
        long d = 1L;
        long upperBound = 2L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case533() {
        long a = 1L;
        long b = 2L;
        long c = 4L;
        long d = 1L;
        long upperBound = 3L;
        assertEquals(2L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case534() {
        long a = 1000L;
        long b = 1000L;
        long c = 1L;
        long d = 1L;
        long upperBound = 1000L;
        assertEquals(2L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case535() {
        long a = 1000000000000L;
        long b = 1L;
        long c = 1L;
        long d = 1L;
        long upperBound = 4L;
        assertEquals(1L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case536() {
        long a = 100L;
        long b = 2L;
        long c = 101L;
        long d = 1L;
        long upperBound = 5L;
        assertEquals(0L, countingseries.countThem(a, b, c, d, upperBound));
    }

    @Test
    public void case537() {
        long a = 1000000000000L;
        long b = 1L;
        long c = 100000000000L;
        long d = 2L;
        long upperBound = 1000000000000L;
        assertEquals(5L, countingseries.countThem(a, b, c, d, upperBound));
    }

}
