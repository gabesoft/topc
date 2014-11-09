package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class MonstersValleyTest {
    MonstersValley monstersvalley = new MonstersValley();

    @Test
    public void case1() {
        long[] dread = { 8L, 5L, 10L };
        int[] price = { 1, 1, 2 };
        assertEquals(2, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case2() {
        long[] dread = { 1L, 2L, 4L, 1000000000L };
        int[] price = { 1, 1, 1, 2 };
        assertEquals(5, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case3() {
        long[] dread = { 200L, 107L, 105L, 206L, 307L, 400L };
        int[] price = { 1, 2, 1, 1, 1, 2 };
        assertEquals(2, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case4() {
        long[] dread = { 5216L, 12512L, 613L, 1256L, 66L, 17202L, 30000L, 23512L, 2125L, 33333L };
        int[] price = { 2, 2, 1, 1, 1, 1, 2, 1, 2, 1 };
        assertEquals(5, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case5() {
        long[] dread = { 606L };
        int[] price = { 2 };
        assertEquals(2, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case6() {
        long[] dread = { 524657775L };
        int[] price = { 2 };
        assertEquals(2, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case7() {
        long[] dread = { 3L, 2L, 5L, 7L };
        int[] price = { 1, 1, 2, 2 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case8() {
        long[] dread = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L };
        int[] price = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
        assertEquals(40, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case9() {
        long[] dread = { 1L, 2L, 4L, 6L, 16L, 19L, 64L, 105L, 256L, 464L, 1024L, 1463L, 4096L, 4515L, 16384L, 21445L, 65536L, 68543L, 262144L, 479277L };
        int[] price = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
        assertEquals(28, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case10() {
        long[] dread = { 1999999991L, 1999999992L, 1999999993L, 1999999994L, 1999999995L, 1999999996L, 1999999997L, 1999999998L, 1999999999L, 2000000000L };
        int[] price = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(2, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case11() {
        long[] dread = { 276378L, 939933L, 574877L, 888702L, 683628L };
        int[] price = { 1, 1, 2, 1, 1 };
        assertEquals(2, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case12() {
        long[] dread = { 492214L, 378290L, 162083L, 858555L };
        int[] price = { 2, 2, 2, 1 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case13() {
        long[] dread = { 138742L, 878514L, 852494L, 542526L, 953090L, 618335L, 834947L, 451187L, 818761L, 498817L, 701160L, 996792L, 845435L, 145660L, 183611L, 150459L, 635733L, 718307L };
        int[] price = { 2, 1, 1, 1, 2, 1, 1, 1, 2, 2, 1, 2, 1, 1, 2, 2, 2, 2 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case14() {
        long[] dread = { 406711L, 813026L, 985429L, 693445L, 653459L, 851295L, 299367L, 676132L, 770750L, 363356L, 658504L };
        int[] price = { 2, 2, 2, 1, 2, 2, 1, 1, 1, 2, 2 };
        assertEquals(4, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case15() {
        long[] dread = { 278033L, 630470L, 39142L, 604719L, 36490L, 400221L, 576007L, 298209L, 202048L, 406921L };
        int[] price = { 1, 2, 1, 2, 1, 1, 2, 2, 2, 1 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case16() {
        long[] dread = { 549037L, 846063L, 786688L, 666614L, 592108L };
        int[] price = { 1, 2, 1, 1, 2 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case17() {
        long[] dread = { 229505L, 433280L, 915022L };
        int[] price = { 1, 1, 2 };
        assertEquals(4, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case18() {
        long[] dread = { 773105L };
        int[] price = { 2 };
        assertEquals(2, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case19() {
        long[] dread = { 633301L, 301906L, 445427L, 509043L, 673939L };
        int[] price = { 2, 1, 1, 2, 2 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case20() {
        long[] dread = { 274987L, 988110L, 468154L, 354593L };
        int[] price = { 2, 2, 2, 1 };
        assertEquals(4, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case21() {
        long[] dread = { 597625L, 249122L, 838726L, 402201L, 933860L, 658620L };
        int[] price = { 2, 2, 2, 2, 1, 1 };
        assertEquals(4, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case22() {
        long[] dread = { 202840L, 843337L, 326007L, 731681L, 931244L, 610300L, 140830L, 347449L, 178713L, 160244L, 772831L, 243548L, 350741L, 445070L, 943259L, 85348L };
        int[] price = { 1, 2, 1, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 2, 1 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case23() {
        long[] dread = { 78341L, 111924L, 510644L, 87408L, 619644L, 910888L, 695650L, 66650L, 223357L };
        int[] price = { 1, 1, 2, 1, 1, 1, 1, 2, 2 };
        assertEquals(5, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case24() {
        long[] dread = { 854876L, 611886L, 818411L, 568380L, 109228L, 412632L, 148292L, 177354L, 806246L, 831430L, 643369L, 671409L, 374510L, 97982L };
        int[] price = { 2, 1, 2, 1, 1, 2, 2, 1, 1, 2, 1, 2, 2, 2 };
        assertEquals(2, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case25() {
        long[] dread = { 333735L, 907985L, 13361L, 107282L, 879340L, 825598L, 497004L, 35801L, 451639L, 541320L, 859429L, 587990L, 989163L };
        int[] price = { 1, 2, 1, 2, 1, 1, 2, 1, 1, 1, 2, 1, 2 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case26() {
        long[] dread = { 730354301L, 612652745L, 231201198L, 1785940683L, 1573792486L, 1862050299L, 55215265L, 1482185079L, 580169303L, 745811023L, 116284213L, 1674085202L, 243582700L, 1259989441L, 459631588L, 1113164735L, 549938993L, 1675101506L, 144384566L, 1897340738L };
        int[] price = { 2, 1, 2, 2, 2, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 1, 2, 2, 2, 2 };
        assertEquals(4, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case27() {
        long[] dread = { 1415229038L, 834285838L, 1214442017L, 1217534876L };
        int[] price = { 2, 1, 2, 1 };
        assertEquals(2, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case28() {
        long[] dread = { 368805779L, 1818947888L, 1788720857L, 1788391727L, 659610167L, 1757059785L, 1951203365L, 1365448488L, 1291565579L, 212981422L };
        int[] price = { 1, 2, 1, 1, 1, 2, 1, 2, 1, 1 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case29() {
        long[] dread = { 953379700L, 1963120299L, 648003103L, 1545329216L, 248966873L, 997656371L, 1408722762L, 640985409L, 150299963L, 651226125L, 1983428467L };
        int[] price = { 2, 1, 1, 1, 2, 1, 2, 2, 1, 1, 2 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case30() {
        long[] dread = { 1547217503L, 1787964172L, 281041017L, 127192884L, 686068400L, 1518709677L, 75143338L, 877524025L, 1830002240L, 95142533L, 1229301205L };
        int[] price = { 2, 1, 2, 1, 1, 2, 1, 1, 1, 1, 2 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case31() {
        long[] dread = { 131144893L, 1253402892L, 327490895L, 758530919L, 575176500L, 1048213981L, 636183295L, 306142540L, 475491284L, 117815209L, 894552824L, 1065451684L };
        int[] price = { 2, 2, 2, 1, 1, 2, 2, 1, 2, 1, 2, 1 };
        assertEquals(4, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case32() {
        long[] dread = { 1691715165L, 1069375201L, 110077378L, 367162390L, 1055161432L, 232475527L };
        int[] price = { 2, 1, 2, 1, 1, 1 };
        assertEquals(2, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case33() {
        long[] dread = { 559787380L, 111124697L, 211951612L, 26295899L, 989297246L, 813172925L };
        int[] price = { 1, 2, 1, 2, 1, 2 };
        assertEquals(2, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case34() {
        long[] dread = { 86780821L, 1140185415L, 85548635L, 347237270L, 1167764408L, 1604033858L, 1993911067L, 1875463689L, 1361486142L, 675528710L, 1858647747L, 1826530257L, 1355912372L, 1314505700L, 194376352L, 1067180132L };
        int[] price = { 1, 2, 1, 1, 1, 2, 2, 1, 2, 1, 2, 1, 1, 2, 2, 2 };
        assertEquals(4, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case35() {
        long[] dread = { 853744211L, 1559615791L, 866431564L, 1860458362L, 1080823152L, 973755754L, 926899774L };
        int[] price = { 1, 1, 1, 1, 2, 1, 1 };
        assertEquals(2, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case36() {
        long[] dread = { 637463334L, 492295149L, 644830292L, 569798827L, 43394064L, 1651455355L, 898690609L, 1248694777L, 1949378803L, 931930223L };
        int[] price = { 2, 2, 1, 1, 2, 1, 1, 2, 1, 2 };
        assertEquals(4, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case37() {
        long[] dread = { 1992350787L, 1204067578L, 1971977184L, 1986727084L, 550738791L, 958698508L };
        int[] price = { 2, 1, 1, 1, 2, 1 };
        assertEquals(2, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case38() {
        long[] dread = { 1383678529L, 138906144L, 940996497L, 619586457L };
        int[] price = { 1, 2, 2, 1 };
        assertEquals(1, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case39() {
        long[] dread = { 1782688262L, 895047095L, 1625373870L, 1009836949L, 985560038L, 1470346827L, 296839142L, 34727454L, 413009041L, 1114435639L, 1692481802L, 422406335L, 795130000L, 1455087504L, 410389760L, 961349143L, 1693064512L, 621415696L, 98442513L };
        int[] price = { 2, 2, 1, 2, 2, 2, 2, 2, 2, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1 };
        assertEquals(2, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case40() {
        long[] dread = { 992388416L, 198261504L, 772412033L, 1889458810L };
        int[] price = { 1, 2, 2, 2 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case41() {
        long[] dread = { 55812L, 129413L, 3369997L, 2698415L, 50526015L, 32026198L, 5355511L, 100092466L, 265746384L, 156194334L, 99374300L, 635472617L, 180646818L, 91608661L, 417850817L, 1022057911L, 1729513937L };
        int[] price = { 1, 1, 2, 1, 1, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 2, 1 };
        assertEquals(10, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case42() {
        long[] dread = { 2589192L, 23314744L, 97814L, 245124401L, 390282178L, 758765331L, 159041187L, 1912259796L };
        int[] price = { 1, 2, 1, 2, 2, 2, 1, 1 };
        assertEquals(10, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case43() {
        long[] dread = { 1661394L, 73478485L, 124895705L, 402068495L, 507240373L, 1961191628L };
        int[] price = { 1, 1, 2, 2, 2, 2 };
        assertEquals(8, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case44() {
        long[] dread = { 1252017L, 3776329L, 21140492L, 5357875L, 59227052L, 88302560L, 344236822L, 52938928L, 256182128L, 321584565L, 22692247L };
        int[] price = { 2, 2, 1, 1, 1, 2, 2, 1, 2, 2, 1 };
        assertEquals(9, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case45() {
        long[] dread = { 174927L, 10654989L, 55924062L, 70457525L, 52549382L, 393666222L, 773214540L, 1177429024L, 1280559141L };
        int[] price = { 2, 1, 1, 2, 2, 1, 1, 2, 2 };
        assertEquals(8, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case46() {
        long[] dread = { 335520L, 7166533L, 19084297L, 44364675L, 66301712L, 243376382L, 369091309L, 441177770L, 553345446L, 768799475L, 1459642711L, 854126713L };
        int[] price = { 2, 1, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1 };
        assertEquals(13, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case47() {
        long[] dread = { 178041L, 241271L, 3554145L, 15146146L, 29336857L, 41372319L, 78867753L, 27414201L, 108212503L, 69279302L, 312855571L, 110338295L, 82908093L, 467516892L, 125004100L, 434086364L, 172491586L, 1039740703L, 590277L, 1754775248L };
        int[] price = { 1, 2, 2, 2, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 2, 1, 2, 1 };
        assertEquals(14, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case48() {
        long[] dread = { 149235L, 2702103L, 9621991L, 16444946L, 24895184L, 48928723L, 127681201L, 45700795L, 234008969L, 114105628L, 350087054L, 311983334L, 652890170L, 347935195L, 390614530L, 893201743L, 1889846895L };
        int[] price = { 1, 2, 1, 2, 1, 2, 2, 2, 1, 1, 1, 2, 1, 2, 1, 1, 1 };
        assertEquals(12, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case49() {
        long[] dread = { 590449L, 4731049L, 1584478L, 100420763L, 86249282L, 194454422L, 808571587L, 534818108L, 1742459894L };
        int[] price = { 1, 2, 1, 2, 2, 2, 2, 2, 2 };
        assertEquals(11, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case50() {
        long[] dread = { 758992L, 6901301L, 80078202L, 103054334L, 331245983L, 851301800L, 209431393L };
        int[] price = { 2, 2, 2, 1, 1, 1, 2 };
        assertEquals(9, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case51() {
        long[] dread = { 375459L, 617787L, 10425424L, 12611536L, 12212171L, 75005736L, 8846978L, 9301694L, 142058581L, 72615651L, 60574288L, 592619153L, 459336400L, 430567015L, 1287700983L, 1045283211L, 269698502L };
        int[] price = { 1, 1, 1, 2, 2, 1, 1, 1, 2, 1, 2, 1, 2, 2, 2, 1, 1 };
        assertEquals(11, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case52() {
        long[] dread = { 197538L, 2088936L, 3509470L, 20939186L, 50206421L, 22604497L, 133400415L, 187910255L, 11826249L, 388209892L, 6886617L, 588380619L, 240052207L, 63701601L, 551901468L, 209580949L, 1758858199L };
        int[] price = { 2, 2, 2, 1, 2, 1, 2, 2, 1, 1, 2, 1, 1, 1, 2, 2, 1 };
        assertEquals(13, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case53() {
        long[] dread = { 3843L, 437808L, 4088636L, 21920545L, 17728351L, 17282550L, 111536526L, 20625035L, 71882430L, 129029409L, 39581290L, 535389768L, 749333266L, 558761224L, 687500849L, 1309193142L, 1247523583L, 1385101352L };
        int[] price = { 2, 2, 2, 1, 2, 1, 2, 2, 1, 1, 1, 2, 2, 1, 2, 2, 1, 1 };
        assertEquals(13, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case54() {
        long[] dread = { 7290252L, 124728206L, 425327327L, 980140755L, 1694076474L };
        int[] price = { 2, 1, 2, 1, 2 };
        assertEquals(8, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case55() {
        long[] dread = { 849513L, 6100784L, 12751708L, 26051050L, 84524432L, 275567165L, 512229310L, 936185513L, 539883036L, 315995883L };
        int[] price = { 1, 2, 1, 2, 2, 2, 1, 2, 2, 2 };
        assertEquals(13, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case56() {
        long[] dread = { 443857L, 5975205L, 24095251L, 43860354L, 49925895L, 60205760L, 294428884L, 207406340L, 463155265L, 813378725L, 757188699L, 1390259091L, 1674862744L };
        int[] price = { 1, 1, 1, 1, 1, 2, 2, 1, 2, 1, 2, 2, 1 };
        assertEquals(10, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case57() {
        long[] dread = { 250438L, 568979L, 18796848L, 31305606L, 81014756L, 98204282L, 141687369L, 97810698L, 220060650L, 631383745L, 777312423L, 156798369L, 1845437234L };
        int[] price = { 1, 1, 2, 2, 1, 1, 2, 2, 1, 1, 1, 1, 1 };
        assertEquals(10, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case58() {
        long[] dread = { 672107L, 2643074L, 529850L, 35636615L, 81113168L, 96575175L, 104125968L, 39236967L, 165081715L, 60078595L, 914507263L, 175347362L, 679297708L, 1718078629L };
        int[] price = { 1, 1, 2, 1, 1, 2, 2, 2, 2, 2, 2, 1, 1, 1 };
        assertEquals(9, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case59() {
        long[] dread = { 167878L, 3169023L, 3526829L, 15558338L, 8689814L, 15469622L, 70341228L, 161912435L, 270279010L, 191495798L, 471391453L, 336129399L, 667939157L, 772487373L, 1109149871L, 296224343L, 35789463L };
        int[] price = { 2, 2, 1, 2, 2, 1, 1, 1, 2, 2, 1, 1, 1, 2, 2, 2, 1 };
        assertEquals(12, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case60() {
        long[] dread = { 122173L, 2071445L, 898765L, 753106L, 29143508L, 54727654L, 32025475L, 142197187L, 207263662L, 350616206L, 282479798L, 567189003L, 251941626L, 357631619L, 2918998L, 697433033L };
        int[] price = { 2, 1, 1, 1, 2, 2, 2, 1, 2, 1, 2, 2, 1, 1, 2, 1 };
        assertEquals(10, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case61() {
        long[] dread = { 48219L, 920898L, 2179240L, 9993589L, 29116629L, 59158375L, 61577353L, 39926727L, 79239592L, 92299665L, 38869806L, 114951159L, 224003787L, 252096248L, 953956706L, 626496202L, 397656017L, 434784538L, 1407497740L };
        int[] price = { 1, 2, 2, 2, 1, 1, 2, 1, 2, 2, 2, 2, 1, 1, 2, 1, 1, 2, 1 };
        assertEquals(14, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case62() {
        long[] dread = { 117426L, 417423L, 6529466L, 13572907L, 20582830L, 3355360L, 56555551L, 6642336L, 186172523L, 186804224L, 15277581L, 59444651L, 254457068L, 310528342L, 423416841L, 782884539L, 743464702L, 369610019L, 643257039L };
        int[] price = { 1, 1, 1, 1, 1, 2, 2, 2, 1, 1, 1, 2, 2, 1, 2, 2, 2, 2, 1 };
        assertEquals(10, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case63() {
        long[] dread = { 874437L, 6826273L, 39807214L, 18556188L, 38704414L, 282109373L, 314755786L, 213092538L, 134585833L, 1119684013L, 918295190L };
        int[] price = { 2, 1, 2, 1, 2, 1, 2, 1, 1, 1, 2 };
        assertEquals(7, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case64() {
        long[] dread = { 265556L, 2061422L, 1500718L, 17959647L, 28180125L, 82100102L, 134639402L, 206809129L, 187309364L, 128555403L, 439962828L, 102933635L, 669498463L, 769511250L, 1169307215L, 196661619L, 1182466435L };
        int[] price = { 2, 1, 2, 1, 1, 1, 2, 1, 2, 1, 2, 1, 1, 2, 1, 2, 1 };
        assertEquals(11, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case65() {
        long[] dread = { 3257543L, 372916L, 73752274L, 95265442L, 170354021L, 300856091L, 141810509L, 1488011678L };
        int[] price = { 2, 1, 1, 1, 2, 2, 1, 2 };
        assertEquals(8, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case66() {
        long[] dread = { 678548L, 1356065L, 3601825L, 12822103L, 103809657L, 193401443L, 234096960L, 74135382L, 579744808L, 141624669L, 731841174L, 446013106L, 465189490L };
        int[] price = { 2, 2, 1, 1, 1, 1, 2, 2, 2, 1, 2, 2, 1 };
        assertEquals(10, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case67() {
        long[] dread = { 319437L, 1878550L, 3190318L, 20409721L, 14727941L, 43516041L, 93601628L, 163005037L, 136571399L, 254741226L, 109779898L, 201373153L, 316232079L, 24567749L, 400406805L, 1018098274L, 1550461119L, 36029233L };
        int[] price = { 2, 1, 1, 1, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 2, 2, 1, 2 };
        assertEquals(14, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case68() {
        long[] dread = { 1191368L, 44420765L, 64593392L, 244992255L, 147789565L, 557199513L, 1613458523L };
        int[] price = { 1, 1, 2, 1, 1, 2, 1 };
        assertEquals(8, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case69() {
        long[] dread = { 6928298L, 51309118L, 152835695L, 208537301L, 692935143L, 1301925202L };
        int[] price = { 2, 1, 2, 1, 1, 2 };
        assertEquals(8, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case70() {
        long[] dread = { 45990L, 1720448L, 2902020L, 21294374L, 51616526L, 33583070L, 69583419L, 220564857L, 59475757L, 253250147L, 542046018L, 475926079L, 435733089L, 333071866L, 119591805L, 49108731L };
        int[] price = { 2, 2, 2, 2, 1, 1, 2, 1, 1, 2, 2, 1, 2, 1, 1, 1 };
        assertEquals(12, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case71() {
        long[] dread = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 1073741824L, 2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L };
        int[] price = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
        assertEquals(78, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case72() {
        long[] dread = { 1L, 2L, 4L, 6L, 16L, 21L, 64L, 68L, 256L, 433L, 1024L, 1801L, 4096L, 5004L, 16384L, 24009L, 65536L, 106642L, 262144L, 488701L, 1048576L, 1327726L, 4194304L, 7403789L, 16777216L, 30404973L, 67108864L, 109293997L, 268435456L, 321343466L, 1073741824L, 1434004360L, 4294967296L, 7511438982L, 17179869184L, 19716354953L, 68719476736L, 99016802775L, 274877906944L };
        int[] price = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
        assertEquals(56, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case73() {
        long[] dread = { 8589934592L, 4294967296L, 2147483648L, 1073741824L, 536870912L, 268435456L, 134217728L, 67108864L, 33554432L, 16777216L, 8388608L, 4194304L, 2097152L, 1048576L, 524288L, 262144L, 131072L, 65536L, 32768L, 16384L, 8192L, 4096L, 2048L, 1024L, 512L, 256L, 128L, 64L, 32L, 16L, 8L, 4L, 2L, 1L, 89011169278L, 900913592218L, 573105180887L, 579137087003L, 149698905839L, 832047692813L, 558111502004L, 253561629925L, 876887316333L, 235624898040L, 155336388121L, 197770970131L, 463071223829L, 345224747632L, 921657583888L, 881486688024L };
        int[] price = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 1, 2, 2, 2, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2 };
        assertEquals(5, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case74() {
        long[] dread = { 8589934592L, 4294967296L, 2147483648L, 1073741824L, 536870912L, 268435456L, 134217728L, 67108864L, 33554432L, 16777216L, 8388608L, 4194304L, 2097152L, 1048576L, 524288L, 262144L, 131072L, 65536L, 32768L, 16384L, 8192L, 4096L, 2048L, 1024L, 512L, 256L, 128L, 64L, 32L, 16L, 8L, 4L, 2L, 1L, 170191697543L, 442151420049L, 760562175049L, 13784873423L, 178349965388L, 755005234214L, 541764950940L, 946482302586L, 543713207966L, 762391189316L, 871034340034L, 677925419895L, 160143387182L, 105796128936L, 529757177900L, 289213265278L };
        int[] price = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1 };
        assertEquals(7, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case75() {
        long[] dread = { 8589934592L, 4294967296L, 2147483648L, 1073741824L, 536870912L, 268435456L, 134217728L, 67108864L, 33554432L, 16777216L, 8388608L, 4194304L, 2097152L, 1048576L, 524288L, 262144L, 131072L, 65536L, 32768L, 16384L, 8192L, 4096L, 2048L, 1024L, 512L, 256L, 128L, 64L, 32L, 16L, 8L, 4L, 2L, 1L, 869080653842L, 569665478747L, 353773362067L, 894885954138L, 112212256473L, 835711002487L, 571011899026L, 440109545402L, 771458413756L, 968480786216L, 867459345691L, 926388852285L, 90806199472L, 839222560283L, 700992187828L, 897839277276L };
        int[] price = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 2, 2, 1, 1, 2, 2, 1, 2, 2, 1, 1, 2, 2 };
        assertEquals(4, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case76() {
        long[] dread = { 999999999951L, 999999999952L, 999999999953L, 999999999954L, 999999999955L, 999999999956L, 999999999957L, 999999999958L, 999999999959L, 999999999960L, 999999999961L, 999999999962L, 999999999963L, 999999999964L, 999999999965L, 999999999966L, 999999999967L, 999999999968L, 999999999969L, 999999999970L, 999999999971L, 999999999972L, 999999999973L, 999999999974L, 999999999975L, 999999999976L, 999999999977L, 999999999978L, 999999999979L, 999999999980L, 999999999981L, 999999999982L, 999999999983L, 999999999984L, 999999999985L, 999999999986L, 999999999987L, 999999999988L, 999999999989L, 999999999990L, 999999999991L, 999999999992L, 999999999993L, 999999999994L, 999999999995L, 999999999996L, 999999999997L, 999999999998L, 999999999999L, 1000000000000L };
        int[] price = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(2, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case77() {
        long[] dread = { 430088673536L };
        int[] price = { 2 };
        assertEquals(2, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case78() {
        long[] dread = { 945071963911L, 427713947465L, 632604075810L };
        int[] price = { 2, 1, 1 };
        assertEquals(2, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case79() {
        long[] dread = { 217695411785L, 330596466919L };
        int[] price = { 1, 2 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case80() {
        long[] dread = { 833562810014L, 164391651176L, 983721773781L };
        int[] price = { 1, 2, 1 };
        assertEquals(2, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case81() {
        long[] dread = { 935242062960L, 14018634144L };
        int[] price = { 1, 2 };
        assertEquals(1, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case82() {
        long[] dread = { 8106477037L, 440383185355L, 568567155843L, 369956985841L, 720968244385L, 115462422353L, 757811111320L, 104967579548L, 743891563945L };
        int[] price = { 1, 2, 2, 1, 1, 1, 1, 1, 2 };
        assertEquals(5, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case83() {
        long[] dread = { 285270005452L, 392087883053L, 770639476564L, 618678083706L, 158190690937L, 13058221496L, 39169217061L, 414874032937L };
        int[] price = { 2, 2, 1, 1, 2, 1, 2, 1 };
        assertEquals(5, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case84() {
        long[] dread = { 18896331820L, 63269255425L, 149441647239L, 36377447580L, 910432425779L, 547129089518L, 927380260080L };
        int[] price = { 2, 2, 1, 1, 1, 1, 2 };
        assertEquals(6, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case85() {
        long[] dread = { 31958842913L, 520689558948L, 38141979320L, 430835928022L, 954453972297L, 366383014140L, 336230934451L, 607091596070L, 103894961427L, 50574283304L, 154272138621L };
        int[] price = { 1, 1, 2, 2, 1, 1, 2, 2, 1, 1, 2 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case86() {
        long[] dread = { 562874645601L, 568917503496L, 760752010667L, 128993647788L, 764458324323L, 882712856708L, 363008449503L, 484540162436L, 790450982138L, 749260945238L };
        int[] price = { 2, 2, 1, 1, 1, 1, 1, 1, 2, 1 };
        assertEquals(4, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case87() {
        long[] dread = { 686137700047L, 413512243389L, 272102555442L, 726310393798L, 993299637295L };
        int[] price = { 1, 2, 2, 1, 1 };
        assertEquals(2, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case88() {
        long[] dread = { 1193302L, 603926607L, 859139548L, 29240659939L, 31199554547L, 20384201685L, 24837298200L, 231796449456L };
        int[] price = { 1, 1, 1, 1, 2, 1, 1, 1 };
        assertEquals(7, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case89() {
        long[] dread = { 23854L, 463248L, 373687L, 12080611L, 86000040L, 269942726L, 484629864L, 784030646L, 1607186809L, 1588945461L, 5542915279L, 4908462295L, 6577150842L, 20888983351L, 18149208591L, 19150115308L, 8367513679L, 68714042583L, 98033095434L, 31527978694L, 24062379472L, 78873379914L, 208630865221L, 47028664979L, 54009700555L, 449669233694L, 60761987835L, 394862052123L, 563126428214L, 231615433015L };
        int[] price = { 1, 1, 1, 1, 1, 2, 2, 2, 1, 2, 1, 1, 2, 1, 1, 1, 2, 2, 2, 2, 1, 1, 2, 2, 2, 2, 1, 1, 2, 2 };
        assertEquals(18, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case90() {
        long[] dread = { 236396L, 1375154L, 6367461L, 43589284L, 683863919L, 1492255615L, 1277887577L, 3975423488L, 3755744867L, 12761274088L, 19103175652L, 10501759698L, 39738368730L, 26163383363L, 133119395812L, 98647817968L, 257295091054L, 289458321898L, 470152965068L, 285431370877L, 745936619917L };
        int[] price = { 1, 2, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 2, 1, 1, 2, 1, 2, 2, 1 };
        assertEquals(16, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case91() {
        long[] dread = { 486579L, 33399101L, 116769795L, 991170195L, 471022819L, 1134156444L, 11434572152L, 22134259139L, 70975822680L, 38066490264L, 63974050206L, 198559672046L, 346400680064L, 121990180292L, 148163512478L };
        int[] price = { 1, 2, 1, 1, 2, 1, 2, 1, 1, 2, 1, 2, 2, 1, 2 };
        assertEquals(12, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case92() {
        long[] dread = { 591384L, 22352546L, 62109767L, 90583161L, 1053560862L, 1707302962L, 27984535164L, 57653559162L, 23697834402L, 59957181347L, 213970803153L, 445442014609L, 651236641757L, 321932704437L };
        int[] price = { 2, 1, 2, 1, 2, 1, 1, 1, 1, 1, 2, 2, 1, 1 };
        assertEquals(15, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case93() {
        long[] dread = { 167519L, 2579351L, 25926850L, 33672924L, 503621546L, 623043001L, 1177804022L, 9955787577L, 14402224345L, 11397580386L, 23577979662L, 66481516427L, 25528432616L, 21222424348L, 30043861002L, 155841351823L, 402682129668L, 56942404116L, 570412761978L, 35306710681L };
        int[] price = { 2, 2, 1, 1, 1, 2, 1, 2, 1, 2, 2, 2, 1, 1, 2, 1, 1, 2, 2, 1 };
        assertEquals(16, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case94() {
        long[] dread = { 13056906L, 287417745L, 11772468149L, 39598042128L, 269252864430L, 184046044469L };
        int[] price = { 2, 1, 2, 1, 1, 1 };
        assertEquals(7, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case95() {
        long[] dread = { 17420346L, 884531633L, 917097871L, 22952639687L, 5271396009L, 182275093855L, 262165406445L, 917822611873L };
        int[] price = { 1, 1, 2, 1, 1, 2, 1, 2 };
        assertEquals(10, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case96() {
        long[] dread = { 95697L, 1698128L, 18828265L, 97754793L, 91582600L, 35266825L, 334632523L, 3349818666L, 5145868409L, 3082373333L, 5391428665L, 9610512134L, 8012724719L, 12548017559L, 50746158637L, 57470773666L, 121864401997L, 37402782419L, 167146872522L, 196574494415L, 251298633055L, 61308031254L, 122298821473L, 365182758796L, 771503924273L };
        int[] price = { 2, 1, 1, 1, 2, 2, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 2 };
        assertEquals(15, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case97() {
        long[] dread = { 1554L, 2288542L, 39690600L, 80873370L, 473158079L, 1459006625L, 27274168L, 2114600218L, 3375934953L, 11429824419L, 3320179833L, 45374969570L, 32092015623L, 93231483516L, 84717654388L, 8594067502L, 129692438104L, 120933852113L, 195449196316L, 504342938227L, 773050821925L, 908156604276L };
        int[] price = { 1, 2, 1, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 1, 1, 2, 2, 1, 1, 2 };
        assertEquals(19, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case98() {
        long[] dread = { 516L, 76962L, 715143L, 4233449L, 218939L, 32096865L, 46368459L, 158595111L, 46918028L, 151723364L, 277050296L, 1095407144L, 1367250788L, 1604311035L, 2020393301L, 3839096555L, 2898212066L, 4936093512L, 2251843090L, 7205942741L, 10378594858L, 22314762689L, 19656860592L, 10619628123L, 18538763871L, 17359783920L, 60061570949L, 64433683696L, 49575833223L, 104812566815L, 3352944657L, 154812076164L, 38959320264L, 28869236952L, 54872805114L, 52328045398L, 34880941693L, 302781869195L, 307732887247L, 39783982279L, 416046105978L, 519292177113L, 185134353884L, 406685459040L, 315653902838L, 646603757540L };
        int[] price = { 2, 2, 1, 2, 2, 2, 2, 1, 2, 2, 2, 2, 1, 1, 1, 2, 1, 2, 1, 2, 2, 2, 1, 1, 1, 2, 2, 2, 2, 1, 1, 2, 1, 1, 2, 2, 2, 1, 1, 2, 1, 2, 1, 1, 1, 2 };
        assertEquals(27, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case99() {
        long[] dread = { 1157L, 16310L, 780193L, 3504656L, 2271819L, 18267639L, 5170811L, 113216942L, 6114721L, 52540295L, 400928591L, 9935620L, 871124804L, 667322944L, 1403753741L, 3489896629L, 379449350L, 3357370437L, 5130448463L, 8683845064L, 348819359L, 17667456990L, 12438211081L, 25851315669L, 13598289504L, 5964776930L, 44268095359L, 3482200273L, 60791165036L, 16799313554L, 34578864324L, 996000500L, 126680540745L, 122234396941L, 73803517177L, 102190919221L, 213139591397L, 188707209190L, 301524711559L, 217185683466L, 232889554668L, 320115663168L, 71871515255L, 436993805335L, 584771730161L, 350077886559L, 442274877401L, 614363441610L, 42335304852L };
        int[] price = { 1, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 2, 2, 1, 2, 1, 1, 1, 1, 2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1, 2, 2, 2, 1, 1, 1, 2, 2, 2, 2, 1, 2 };
        assertEquals(27, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case100() {
        long[] dread = { 2640L, 68365L, 121533L, 2409352L, 13119233L, 2740807L, 56991607L, 6675584L, 266605171L, 307439920L, 245975819L, 109673829L, 614057337L, 1968561791L, 159039458L, 2482065729L, 5905502239L, 1752859673L, 10366762774L, 8767947881L, 5023578536L, 13539391753L, 18213373058L, 24638508005L, 32600133793L, 32007217505L, 26648420775L, 37472208466L, 57341096552L, 42655240477L, 40856099822L, 14986958926L, 165765066370L, 136966880036L, 216377604548L, 223904249340L, 229706081128L, 283108473000L, 253652100205L, 176885586759L, 191606591782L, 494704705173L, 167293086604L, 437661101965L, 403462639691L, 715780763856L };
        int[] price = { 1, 1, 2, 2, 1, 2, 1, 2, 2, 2, 1, 2, 2, 1, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 1, 2, 1, 2, 2, 1, 2, 2, 1, 2, 2, 1, 1, 2, 1, 2, 1, 2, 1, 2, 2 };
        assertEquals(22, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case101() {
        long[] dread = { 4256L, 187417L, 488405L, 6442091L, 8436249L, 43981123L, 120796136L, 103646625L, 392032349L, 258770431L, 827182588L, 954626649L, 407950625L, 229715097L, 2428871026L, 1183951394L, 5480996259L, 4736335773L, 3924777673L, 165167216L, 25666760414L, 6366478475L, 31701441977L, 53201795912L, 8327045683L, 60195015506L, 97806912078L, 3859724169L, 133104179331L, 34212476852L, 7559035298L, 212307407345L, 122454363909L, 270871598569L, 150978142942L, 265276397004L, 289814642819L, 122125271422L, 504333951114L, 455571327987L, 560212973244L, 970387591839L };
        int[] price = { 1, 1, 2, 2, 2, 2, 2, 1, 1, 1, 2, 2, 1, 1, 1, 1, 1, 2, 2, 1, 2, 2, 1, 1, 2, 1, 1, 2, 2, 1, 1, 2, 2, 2, 2, 2, 1, 1, 2, 1, 2, 1 };
        assertEquals(25, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case102() {
        long[] dread = { 1242L, 385822L, 1245478L, 5463878L, 38117148L, 58893058L, 257275018L, 604360713L, 345275594L, 1133633961L, 273395947L, 939178166L, 5760976646L, 2905046282L, 2873533632L, 8671987514L, 26078113240L, 8247043473L, 26641868078L, 8706795772L, 54373690564L, 77201180603L, 29737489231L, 100784631481L, 105532910641L, 4596003382L, 207610261077L, 90487233183L, 285537297757L, 240219532008L, 106738028194L, 505424598771L, 299504884889L, 21563125767L, 33652302181L };
        int[] price = { 1, 2, 2, 1, 1, 1, 1, 2, 1, 2, 2, 1, 2, 2, 2, 2, 1, 2, 1, 1, 2, 1, 2, 2, 1, 2, 2, 1, 1, 1, 2, 1, 2, 1, 2 };
        assertEquals(21, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case103() {
        long[] dread = { 8714L, 26727L, 603451L, 3651335L, 28691086L, 62367796L, 65483612L, 102015490L, 221078916L, 897737608L, 822974603L, 2389434686L, 1533212235L, 1195069162L, 2271940187L, 9160540149L, 3167287263L, 11684829895L, 20720900860L, 29365053713L, 10200942947L, 19698710619L, 59352978096L, 32210472586L, 59942188608L, 109207507429L, 40341559821L, 34256247813L, 2284965050L, 159983201840L, 255958588853L, 56633662468L, 112606348975L, 285888050979L, 294662255739L, 339030370201L, 483741142023L, 307592989414L, 51512860925L, 182113687318L };
        int[] price = { 2, 2, 1, 2, 1, 1, 1, 2, 1, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 1, 2, 1, 1, 2, 1, 2, 2, 1, 2, 1, 2, 2 };
        assertEquals(22, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case104() {
        long[] dread = { 2469L, 114464L, 38679L, 2434517L, 7151733L, 2458120L, 61774826L, 118382249L, 67249871L, 263101698L, 591653708L, 507211249L, 158871181L, 668122693L, 1175342250L, 1226068930L, 4714421608L, 1264248543L, 3830170719L, 151025847L, 10301751714L, 19344837500L, 22161737199L, 24622382588L, 4480791484L, 18882258523L, 36841749104L, 497189311L, 38397210632L, 69841272095L, 77337115491L, 14245812740L, 150258362147L, 167421005729L, 188489386130L, 65393119144L, 109114850127L, 216239720227L, 303256780298L, 330873424279L, 88652570222L, 259128669543L, 278238052983L, 201178522620L, 407060990826L, 520916300402L, 53109735402L, 82048521750L };
        int[] price = { 1, 1, 1, 2, 2, 1, 1, 1, 1, 2, 1, 2, 1, 2, 1, 2, 2, 1, 1, 1, 2, 1, 2, 2, 2, 1, 2, 1, 2, 2, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 2, 2 };
        assertEquals(21, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case105() {
        long[] dread = { 2445L, 14960L, 266622L, 2722436L, 2687580L, 13187135L, 47843845L, 11671979L, 196238928L, 165984797L, 375980718L, 458611701L, 276026784L, 1417256372L, 748223834L, 789497144L, 2362767264L, 3871111886L, 554363374L, 5997072428L, 9730309394L, 17673519041L, 13003836858L, 14621101767L, 27990142750L, 34187717259L, 6430081748L, 1089985117L, 36587679304L, 21644791263L, 82452416871L, 26415250233L, 99735339966L, 137823779295L, 170905193659L, 152777879363L, 85032408572L, 32719975313L, 164412253770L, 234640275332L, 34883663916L, 269777258144L, 429431552386L, 100218065879L, 416583674634L, 91676167406L, 361851966730L, 163459451648L, 660463567716L };
        int[] price = { 2, 1, 1, 1, 2, 1, 1, 2, 2, 1, 1, 2, 1, 1, 1, 2, 1, 2, 1, 2, 2, 2, 2, 1, 1, 2, 1, 1, 1, 2, 1, 1, 2, 2, 1, 2, 2, 1, 1, 1, 1, 1, 2, 2, 2, 1, 1, 1, 2 };
        assertEquals(21, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case106() {
        long[] dread = { 1698L, 23420L, 552564L, 3682167L, 1525842L, 30636637L, 90092147L, 16063532L, 321687358L, 64826850L, 381588423L, 145190423L, 1553874111L, 1751281614L, 3546208773L, 318398669L, 6168684212L, 2096209018L, 5863943246L, 1069058351L, 11200881383L, 4622813900L, 12827849665L, 25675963776L, 55421977878L, 1708530185L, 82443143171L, 47415190279L, 4865208762L, 108500026783L, 165102547252L, 89691255287L, 224089678518L, 101677254062L, 172815978142L, 83042453593L, 247441456147L, 62297079104L, 538939365582L, 494766901302L, 664105330977L, 754154669487L, 609584356752L, 603795201512L };
        int[] price = { 2, 1, 2, 2, 1, 2, 1, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 2, 2, 2, 2, 1, 2, 1, 2, 1, 2, 1, 1, 1, 2, 1, 1, 1 };
        assertEquals(24, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case107() {
        long[] dread = { 1957L, 100568L, 919667L, 1596452L, 2569746L, 4664658L, 17162069L, 59097188L, 195874938L, 188211725L, 321616536L, 196175582L, 772389137L, 1742611367L, 549278412L, 468262113L, 3244407481L, 626215294L, 3823259864L, 7785297701L, 10594670307L, 4814723815L, 11609379215L, 9245670056L, 26980497208L, 25412036176L, 11524352913L, 41200209665L, 29008185311L, 15519082335L, 34304653214L, 39999732739L, 10164893969L, 114738814157L, 76170510128L, 106528152484L, 70141664742L, 263975591242L, 19131448784L, 312322797435L, 215201968254L, 45792696128L, 362806212751L, 58384054259L, 184205488213L, 577159216294L, 795661214597L, 432032377113L };
        int[] price = { 2, 2, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 1, 2, 2, 1, 2, 2, 2, 2, 1, 2, 1, 2, 1, 2, 1, 2, 2, 2, 2, 1, 2, 1, 2, 2, 1, 2, 1, 2, 2, 2, 1, 2, 1 };
        assertEquals(30, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case108() {
        long[] dread = { 10269L, 170177L, 3687042L, 18257286L, 40020723L, 58467106L, 200873827L, 330816543L, 437368903L, 132703934L, 14662467L, 4148600367L, 3048579620L, 2549352827L, 10798925326L, 15225625324L, 6713319470L, 35217453149L, 20180938504L, 41724098915L, 11886776809L, 55619681504L, 83681545123L, 99017561803L, 119038934104L, 78827979687L, 200845605645L, 164630935130L, 112279586952L, 25295183088L, 46307342232L, 211206813327L, 260549786444L, 683481821555L, 942479033352L };
        int[] price = { 2, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 1, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 1, 1, 1, 1, 1 };
        assertEquals(18, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case109() {
        long[] dread = { 2427L, 246828L, 1716850L, 6520681L, 10305030L, 20759024L, 251774050L, 502027856L, 274855219L, 20860610L, 1747859736L, 187349572L, 1709739528L, 4919970363L, 7310676527L, 2950279847L, 20704777688L, 24035520148L, 21661415089L, 26493251974L, 43662532829L, 47251834981L, 2574163214L, 94927414070L, 11397379630L, 93196983894L, 28420696037L, 66113612288L, 88795674778L, 308000526095L, 404898948637L, 7134752203L, 169536130745L, 13357877615L, 165676204849L, 668741290987L };
        int[] price = { 2, 2, 1, 1, 1, 2, 2, 1, 2, 1, 2, 1, 2, 1, 1, 2, 2, 2, 1, 1, 1, 1, 2, 2, 2, 1, 1, 2, 1, 1, 2, 2, 2, 1, 2, 1 };
        assertEquals(21, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case110() {
        long[] dread = { 1556L, 43203L, 397796L, 2834574L, 5226118L, 13369101L, 34240887L, 115714550L, 205018102L, 166159498L, 532930575L, 229139040L, 1042130148L, 979872471L, 1756879825L, 2905665196L, 212617151L, 5303721623L, 5570820880L, 5056533449L, 8170912186L, 1585653489L, 11429701700L, 24767617134L, 8365827972L, 11818900796L, 32585555130L, 48550812165L, 25183344813L, 33223077421L, 28638143243L, 88028709141L, 40244474774L, 66692336116L, 138966972588L, 10515915948L, 153918159131L, 131164439228L, 1701670160L, 200984829698L, 340298447643L, 398377796984L, 111495772567L, 13621779699L, 89734742309L, 711250450948L, 159864873857L, 713684384282L, 720869285637L };
        int[] price = { 2, 2, 1, 2, 2, 2, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 2, 1, 2, 2, 2, 2, 1, 1, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 2, 2, 1, 2, 2, 1 };
        assertEquals(26, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case111() {
        long[] dread = { 2685L, 204221L, 475212L, 3416091L, 22526636L, 59610839L, 140356360L, 97385175L, 399479644L, 277435606L, 504773486L, 339134596L, 1694988314L, 2659203558L, 5427164841L, 5401774322L, 503271494L, 1811563222L, 9721199379L, 10808314112L, 31179712131L, 23025915471L, 23314706255L, 54580394292L, 42541788276L, 10013278435L, 121320665048L, 67924950093L, 75715548680L, 207558769357L, 183535944346L, 100650533283L, 157008347925L, 28963215998L, 314156273147L, 59016008557L, 236856280421L, 249289739869L, 513830120352L, 574961537191L, 888591966357L };
        int[] price = { 1, 2, 2, 2, 2, 2, 1, 2, 1, 2, 2, 2, 2, 1, 2, 1, 2, 2, 1, 1, 2, 2, 2, 1, 2, 1, 2, 1, 2, 2, 2, 1, 2, 1, 2, 2, 1, 2, 1, 2, 2 };
        assertEquals(27, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case112() {
        long[] dread = { 3019L, 159046L, 196315L, 2101534L, 19403197L, 29833438L, 12130520L, 216369224L, 354049590L, 59403793L, 452010476L, 845284692L, 476309907L, 2996610262L, 2661441809L, 6077702956L, 1259831218L, 1916991184L, 4920638585L, 20562224231L, 3765576052L, 14578754033L, 14946839508L, 7766068503L, 30659074456L, 5041468019L, 54299259921L, 38604986000L, 2641928206L, 123718218287L, 135768332654L, 82340785170L, 62753653838L, 248110669673L, 75669627023L, 35950258536L, 161959381330L, 435790500216L, 139189508344L, 581116055368L, 461449965718L, 387079891309L, 456013449929L };
        int[] price = { 1, 2, 2, 2, 1, 2, 1, 1, 2, 2, 2, 2, 1, 1, 2, 1, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 2, 1, 1 };
        assertEquals(24, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case113() {
        long[] dread = { 5833L, 424091L, 6063360L, 8350367L, 40082355L, 192623430L, 405568189L, 47914742L, 1074755080L, 2500083971L, 2450427489L, 1352681303L, 3519744646L, 12811207394L, 8969895190L, 18546268893L, 32617425555L, 23518152691L, 46554677911L, 46205947147L, 63222184426L, 14646728816L, 114135421868L, 93962355971L, 226443725374L, 178297759047L, 287610808069L, 247743314567L, 482342141481L, 610963334397L, 505498944827L, 253692798293L, 429283133234L };
        int[] price = { 2, 1, 2, 2, 1, 2, 1, 2, 1, 1, 2, 2, 2, 1, 2, 1, 2, 2, 1, 2, 1, 2, 1, 2, 2, 2, 2, 2, 1, 1, 2, 1, 1 };
        assertEquals(20, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case114() {
        long[] dread = { 8915L, 149176L, 1959633L, 6370913L, 13168317L, 66916518L, 124036593L, 345959159L, 313837594L, 132371539L, 140906110L, 2081595132L, 327494451L, 5809641929L, 3951480345L, 3314409171L, 12863200446L, 572450883L, 10601310039L, 20847148338L, 40555460593L, 10860858142L, 27601158649L, 43357470743L, 98735457561L, 673641685L, 73855375359L, 64225786008L, 153269120447L, 123348539662L, 284495685747L, 176639239038L, 226602836997L, 27109067867L, 512742213084L, 323617683750L, 214531555024L, 156969831568L, 375724731752L };
        int[] price = { 2, 2, 1, 1, 1, 1, 2, 2, 2, 1, 2, 1, 1, 2, 1, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 2, 2, 2, 1, 1, 2, 1, 1, 1, 2, 1, 1, 2 };
        assertEquals(22, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case115() {
        long[] dread = { 5439L, 105083L, 188067L, 2311686L, 16453638L, 1396544L, 77308583L, 2866196L, 318943875L, 221417508L, 974433165L, 1119925872L, 2077183026L, 2033559135L, 4539745813L, 5434719512L, 3146398417L, 10769723628L, 7444590805L, 1053717321L, 22261165509L, 20986064416L, 6902751974L, 11354179641L, 9408242292L, 33550444157L, 18746073210L, 70435698107L, 55875046749L, 146100275152L, 15323450251L, 69298235608L, 178160596103L, 184081995717L, 311641871748L, 202010556768L, 108367659001L, 217148597624L, 399221976354L, 262543965075L, 391728690901L, 504880026060L, 815855748096L, 365328150786L };
        int[] price = { 1, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2, 1, 1, 2, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 1, 2, 1, 1, 1, 1, 2, 1, 2, 2, 1, 2, 1, 1, 1, 1, 2, 1, 2, 1 };
        assertEquals(22, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case116() {
        long[] dread = { 9479L, 250064L, 1494909L, 6516148L, 27723408L, 67842745L, 161539114L, 57958377L, 65575557L, 90766585L, 994201597L, 1489810764L, 235007404L, 5177937578L, 6627781238L, 8927248287L, 12533398396L, 14738122331L, 4913014654L, 4555693921L, 11061646760L, 34855580806L, 34056476677L, 3826334828L, 22989397274L, 96110746331L, 88055278002L, 12875692815L, 147815010089L, 99945082203L, 222094882610L, 122506022331L, 62733425651L, 371946935503L, 226514951499L, 449409532420L, 481765470814L, 25888948123L, 527844028209L, 759546748985L };
        int[] price = { 1, 1, 1, 1, 2, 1, 1, 2, 2, 2, 1, 2, 2, 2, 2, 1, 1, 2, 1, 1, 1, 2, 2, 2, 2, 1, 1, 1, 1, 2, 2, 1, 1, 2, 2, 1, 2, 2, 2, 2 };
        assertEquals(20, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case117() {
        long[] dread = { 5761L, 51178L, 1051061L, 2849104L, 10839715L, 27264748L, 111534746L, 265919819L, 117581811L, 780662515L, 550662510L, 1880382265L, 1888032483L, 559330488L, 756785005L, 7886158183L, 6394656266L, 14267348632L, 19535702599L, 16886035839L, 6605842473L, 7195951680L, 3043368195L, 9501468561L, 79357086708L, 95055376093L, 13130559530L, 64195934517L, 11569704574L, 159875528685L, 102912056819L, 212611747325L, 56407459848L, 213143698892L, 228063073833L, 257008155769L, 386319971523L, 534263313119L, 596287036662L, 231021690109L, 378883314543L };
        int[] price = { 2, 2, 1, 2, 1, 1, 2, 2, 2, 1, 2, 2, 2, 1, 2, 1, 2, 2, 1, 2, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 1, 2, 1, 2, 1, 1, 2, 1, 1, 1, 2 };
        assertEquals(23, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case118() {
        long[] dread = { 484L, 163860L, 161526L, 5305710L, 19231767L, 56064427L, 158717820L, 232149811L, 118774176L, 1495211917L, 766946689L, 2922820703L, 5702099991L, 3020718804L, 1884541913L, 1374361578L, 7248577848L, 5702005295L, 10199669774L, 50202827532L, 31758955357L, 18727785082L, 84971224459L, 72711203611L, 156566771585L, 122583874395L, 142058268388L, 84204314189L, 116695646468L, 400064745111L, 301078208494L, 354515234534L, 190696485279L, 299898811298L, 289920861340L, 76432061882L };
        int[] price = { 2, 1, 2, 2, 1, 1, 1, 1, 1, 2, 1, 1, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 2, 1, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 2, 1 };
        assertEquals(18, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case119() {
        long[] dread = { 3434L, 37060L, 1046267L, 879028L, 3639575L, 33133385L, 20629436L, 172177298L, 332852421L, 605840813L, 366711906L, 1324730794L, 413200394L, 889452452L, 3751522366L, 4683314267L, 6102361753L, 5702005836L, 5033051973L, 21757535816L, 21911000613L, 978315930L, 21293816814L, 25814925072L, 30655435704L, 62250154477L, 31114541328L, 59648804831L, 31623592692L, 11553319039L, 161686943855L, 124700767383L, 121255968433L, 217058600673L, 187696470040L, 49654449644L, 188403361493L, 387145603865L, 578444870434L, 322091316652L, 316000638679L, 239757012759L, 548406309480L };
        int[] price = { 1, 1, 2, 1, 2, 2, 1, 1, 2, 2, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 2, 1, 2, 2, 1, 2, 1, 2, 2, 1, 1, 2, 1, 2, 1, 2, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(22, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case120() {
        long[] dread = { 2174L, 109690L, 995187L, 2439569L, 6533906L, 1357357L, 12006947L, 111773439L, 231450705L, 70755419L, 548655225L, 840863954L, 834722770L, 148105673L, 3346885879L, 3422421725L, 5803196028L, 7003005119L, 8681670478L, 2863225883L, 10599221457L, 5311375523L, 5929766590L, 18268169954L, 12452285564L, 6646256583L, 38809247375L, 28774471645L, 4151568080L, 63748614804L, 52531811921L, 109604089100L, 185688088574L, 212916509801L, 36889984707L, 266488519495L, 327037199425L, 238688884327L, 331583407586L, 107493503790L, 336663510304L, 320505044718L, 409860789938L, 798798498028L, 491791278501L, 412025861404L };
        int[] price = { 2, 2, 1, 2, 1, 2, 1, 1, 2, 2, 1, 2, 2, 2, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 1, 2, 1, 2, 1, 1, 2, 2, 2, 2, 1, 1, 2, 1, 1, 1, 2, 2, 1, 2 };
        assertEquals(24, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case121() {
        long[] dread = { 2869L, 366807L, 76642L, 4481469L, 14361768L, 32058241L, 134123882L, 27836630L, 419626864L, 98609363L, 556783763L, 885281115L, 954094634L, 148103826L, 3871246424L, 3967933707L, 7992998318L, 7143254797L, 25938977040L, 12443166186L, 44102121232L, 36947290372L, 49526905086L, 5793328977L, 9726707236L, 56152648938L, 89659150031L, 138240257662L, 77979539355L, 283659594247L, 211046081191L, 124258229540L, 146639665576L, 408751925000L, 659171131742L, 530197524650L, 325637973890L, 343973773362L };
        int[] price = { 1, 2, 1, 1, 2, 1, 1, 2, 2, 1, 1, 1, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 1, 2, 1, 2, 2, 1, 2 };
        assertEquals(19, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case122() {
        long[] dread = { 29513L, 172084L, 3026147L, 6140475L, 13284231L, 100087909L, 7834883L, 937560304L, 1420527071L, 1695363038L, 30058372L, 1322040531L, 2063661109L, 2831492109L, 11593598365L, 23983942089L, 19167907405L, 45982186152L, 60010532489L, 92197564029L, 28320550116L, 61795447595L, 5966003645L, 78055291463L, 231703139888L, 110485850394L, 109463289648L, 115150626941L, 321892826171L, 667445944199L, 643096237417L, 439361120796L };
        int[] price = { 2, 2, 1, 2, 2, 2, 1, 1, 2, 2, 2, 1, 2, 1, 1, 2, 1, 2, 2, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 2 };
        assertEquals(22, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case123() {
        long[] dread = { 3815L, 98751L, 1052932L, 1036534L, 13434530L, 33559405L, 77079609L, 65336961L, 113533900L, 229191145L, 158010695L, 370455558L, 371387404L, 664088992L, 1128428889L, 3857601112L, 6862277618L, 7234467439L, 9533635694L, 7015395541L, 18160342422L, 14760281505L, 10966986568L, 9569864459L, 3902901832L, 8844314144L, 18898087335L, 22010465325L, 39100272584L, 36136514491L, 104383706225L, 25898037809L, 13001256775L, 83605415093L, 103740633928L, 268807281822L, 33291102428L, 276659674910L, 209437551869L, 450868995141L, 259425532391L, 177018309905L, 510511763095L, 166055260550L, 528008421011L, 357428832205L };
        int[] price = { 2, 2, 1, 1, 1, 2, 2, 2, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 2, 2, 2, 1, 2 };
        assertEquals(21, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case124() {
        long[] dread = { 25L, 11474L, 199723L, 3287002L, 67106L, 15367416L, 6129267L, 97711333L, 100439782L, 166696220L, 20488087L, 899002492L, 926012475L, 205842286L, 975901986L, 1088374562L, 3790970306L, 7396798488L, 6670209830L, 3712557228L, 15579477072L, 6724472387L, 11537851598L, 2269051891L, 23031143984L, 17598009993L, 3234267153L, 33258521737L, 78562732308L, 35073664383L, 49483856814L, 79435805873L, 117466135352L, 128418528686L, 70922738119L, 78673411976L, 218478726633L, 252248679467L, 244024455865L, 220102899533L, 195293827538L, 208767354119L, 415185579702L, 540914339320L, 476276303986L, 88068628334L, 350389077703L, 680920205015L };
        int[] price = { 2, 2, 1, 1, 2, 2, 2, 1, 1, 2, 1, 2, 2, 1, 2, 1, 1, 2, 1, 1, 2, 2, 1, 1, 2, 1, 1, 2, 2, 2, 1, 2, 2, 1, 1, 2, 2, 1, 2, 2, 1, 2, 1, 2, 2, 1, 1, 1 };
        assertEquals(23, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case125() {
        long[] dread = { 2318L, 107496L, 786986L, 5393980L, 1323780L, 40015710L, 16784060L, 122716157L, 238335845L, 247071505L, 175719682L, 1006562472L, 272187379L, 1647008752L, 3059956910L, 7594290476L, 1954893331L, 736019820L, 17914052225L, 14208139280L, 770622500L, 33638642056L, 42300591946L, 338722856L, 9321038288L, 32850484142L, 29207029291L, 94233099131L, 59754026165L, 52332286362L, 216788952767L, 229140072038L, 261587062006L, 119109524837L, 354241720577L, 283313322057L, 188297407837L, 166203796328L, 422768554287L, 682935411146L, 144944637516L, 291106684192L };
        int[] price = { 2, 2, 1, 1, 1, 1, 2, 1, 2, 1, 2, 1, 2, 1, 1, 2, 2, 2, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 1, 2, 2, 1, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2 };
        assertEquals(20, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case126() {
        long[] dread = { 14599L, 493438L, 1927705L, 1719828L, 31930503L, 48396893L, 11039403L, 148609685L, 234725237L, 109156869L, 768642704L, 2436014146L, 4024909344L, 118977877L, 11307937292L, 3977693358L, 12986077636L, 29760537792L, 26165880187L, 1466692194L, 18674767264L, 80799203105L, 60499071820L, 120859386074L, 86316217880L, 122521910083L, 42488637452L, 207135741555L, 178204169492L, 118232056902L, 396802268891L, 524341704144L, 331004939086L, 532695288497L, 556999388891L, 739903768197L };
        int[] price = { 1, 1, 2, 2, 1, 1, 2, 1, 1, 2, 1, 1, 1, 2, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 2, 1, 2, 2, 1, 1, 1, 1, 1, 2, 1, 1 };
        assertEquals(17, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case127() {
        long[] dread = { 3368L, 63873L, 605967L, 2000528L, 9988572L, 17877846L, 29525891L, 76851190L, 141703104L, 324452634L, 280564069L, 175419264L, 559798321L, 33854481L, 79247767L, 479188508L, 2485542655L, 5850046089L, 8576875759L, 11094078622L, 750335177L, 16441648945L, 12407551439L, 7608254741L, 32526828694L, 14827132876L, 15674667206L, 11585122664L, 8002130100L, 12949922169L, 54422658705L, 18763524296L, 95981647708L, 4534586799L, 157168213660L, 178963010499L, 105761256119L, 130416408926L, 241915099258L, 279393133609L, 280097686779L, 316375247939L, 294720525886L, 37966782638L, 452147528616L, 677352646502L, 140854459818L, 362881375497L, 141063300767L };
        int[] price = { 1, 1, 1, 1, 1, 1, 2, 1, 2, 2, 2, 2, 1, 1, 1, 2, 2, 1, 1, 1, 1, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 1, 1, 1, 1, 2, 1, 2, 1, 1, 1, 2, 2, 1, 2 };
        assertEquals(21, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case128() {
        long[] dread = { 10L, 7L, 8L, 17L, 37L, 25L, 29L, 62L, 136L, 92L, 107L, 229L, 503L, 340L, 395L, 847L, 1861L, 1258L, 1461L, 3133L, 6885L, 4654L, 5405L, 11592L, 25474L, 17219L, 19998L, 42890L, 94253L, 63710L, 73992L, 158693L, 348736L, 235727L, 273770L, 587164L, 1290323L, 872189L, 1012949L, 2172506L, 4774195L, 3227099L };
        int[] price = { 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1 };
        assertEquals(21, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case129() {
        long[] dread = { 10L, 7L, 8L, 17L, 37L, 25L, 29L, 62L, 136L, 92L, 107L, 229L, 503L, 340L, 395L, 847L, 1861L, 1258L, 1461L, 3133L, 6885L, 4654L, 5405L, 11592L, 25474L, 17219L, 19998L, 42890L, 94253L, 63710L, 73992L, 158693L, 348736L, 235727L, 273770L, 587164L, 1290323L, 872189L, 1012949L, 2172506L, 4774195L, 3227099L, 3747911L, 8038272L, 17664521L, 11940266L, 13867270L, 29741606L, 65358727L, 44178984L };
        int[] price = { 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1 };
        assertEquals(25, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case130() {
        long[] dread = { 9L, 8L, 16L, 14L, 12L, 25L, 22L, 19L, 40L, 35L, 30L, 64L, 56L, 48L, 102L, 89L, 76L, 163L, 142L, 121L, 260L, 227L, 193L, 416L, 363L, 308L, 665L, 580L, 492L, 1064L, 928L, 787L, 1702L, 1484L, 1259L, 2723L, 2374L, 2014L, 4356L, 3798L, 3222L, 6969L, 6076L, 5155L, 11150L, 9721L, 8248L, 17840L, 15553L, 13196L };
        int[] price = { 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1 };
        assertEquals(17, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case131() {
        long[] dread = { 9L, 8L, 18L, 21L, 19L, 43L, 50L, 45L, 103L, 120L, 108L, 247L, 288L, 259L, 592L, 691L, 621L, 1420L, 1658L, 1490L, 3408L, 3979L, 3576L, 8179L, 9549L, 8582L, 19629L, 22917L, 20596L, 47109L, 55000L, 49430L, 113061L, 132000L, 118632L, 271346L, 316800L, 284716L, 651230L, 760320L, 683318L, 1562952L, 1824768L, 1639963L, 3751084L, 4379443L, 3935911L, 9002601L, 10510663L, 9446186L };
        int[] price = { 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1 };
        assertEquals(26, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case132() {
        long[] dread = { 9L, 8L, 18L, 20L, 18L, 41L, 46L, 41L, 94L, 105L, 94L, 216L, 241L, 216L, 496L, 554L, 496L, 1140L, 1274L, 1140L, 2622L, 2930L, 2622L, 6030L, 6738L, 6030L, 13868L, 15497L, 13868L, 31896L, 35643L, 31896L, 73360L, 81978L, 73360L, 168728L, 188549L, 168728L, 388074L, 433662L, 388074L, 892570L, 997422L, 892570L, 2052910L, 2294070L, 2052910L, 4721693L, 5276361L, 4721693L };
        int[] price = { 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1 };
        assertEquals(25, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case133() {
        long[] dread = { 9L, 8L, 18L, 20L, 18L, 41L, 46L, 41L, 94L, 105L, 94L, 216L, 241L, 216L, 496L, 554L, 496L, 1140L, 1274L, 1140L, 2622L, 2930L, 2622L, 6030L, 6738L, 6030L, 13868L, 15497L, 13868L, 31896L, 35643L, 31896L, 73360L, 81978L, 73360L, 168728L, 188549L, 168728L, 388074L, 433662L, 388074L, 892570L, 997422L, 892570L, 2052910L, 2294070L, 2052910L, 100000000000L, 10000000000L, 110000000000L };
        int[] price = { 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 2 };
        assertEquals(27, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case134() {
        long[] dread = { 11L, 5L, 19L, 24L, 12L, 50L, 55L, 28L, 116L, 141L, 70L, 270L, 320L, 165L, 672L, 722L, 380L, 1524L, 1632L, 983L, 3710L, 4216L, 2542L, 9486L, 10558L, 6213L, 25048L, 27883L, 15812L, 65717L, 72884L, 41590L, 155929L, 178948L, 102929L, 372124L, 434720L, 273099L, 997440L, 1056816L, 614759L, 2348201L, 2581688L, 1561387L, 5540109L, 6229270L, 3611890L, 14012911L, 14834268L, 8672658L };
        int[] price = { 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1 };
        assertEquals(28, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case135() {
        long[] dread = { 100L, 49L, 131L, 94L, 265L, 183L, 499L, 387L, 1015L, 821L, 1952L, 1710L, 3688L, 3623L, 7597L, 6787L, 15745L, 13750L, 33464L, 28168L, 70449L, 53211L, 141654L, 100470L, 279847L, 189913L, 529862L, 359623L, 1006491L, 725048L, 1897710L, 1397243L, 3611921L, 3020201L, 7180098L, 6260339L, 14601220L, 12372044L, 31380700L, 26657977L, 62367377L, 52154892L, 127981379L, 112908790L, 242515190L, 215742101L, 457185483L, 445857177L, 863094261L, 844403244L };
        int[] price = { 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1 };
        assertEquals(35, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case136() {
        long[] dread = { 100L, 49L, 131L, 98L, 249L, 205L, 536L, 411L, 1161L, 770L, 2310L, 1625L, 4790L, 3388L, 9022L, 6697L, 18506L, 14129L, 35006L, 30148L, 68696L, 62148L, 142805L, 132341L, 284384L, 257463L, 587054L, 515132L, 1228191L, 980620L, 2343501L, 1966237L, 4889519L, 3864065L, 9399639L, 7893615L, 19773643L, 14837179L, 37626840L, 28362118L, 77022309L, 54946217L, 156433965L, 118500600L, 338753259L, 247100920L, 678686271L, 478165414L, 1357753480L, 965079330L };
        int[] price = { 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1 };
        assertEquals(37, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case137() {
        long[] dread = { 5L, 2L, 6L, 11L, 13L };
        int[] price = { 1, 1, 2, 1, 2 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case138() {
        long[] dread = { 1L, 1L };
        int[] price = { 1, 1 };
        assertEquals(1, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case139() {
        long[] dread = { 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L };
        int[] price = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(1, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case140() {
        long[] dread = { 53392657L, 817786459L, 196704966L, 52380391L, 988303163L, 961975823L, 104887915L, 906311626L, 559835837L, 205674786L, 754941275L, 965586531L, 209405232L, 269574331L, 859992978L, 983400066L, 350905317L, 459968354L, 186590923L, 862826868L, 104026178L, 53040009L, 536641357L, 511462598L, 557887629L, 684891079L, 293360225L, 144390275L, 40972842L, 797543348L, 267803821L, 118184381L, 806837788L, 713494571L, 486109403L, 738075948L, 218440139L, 798402498L, 130486770L, 924491153L, 150564122L, 302486929L, 158862339L, 703891030L, 416159580L, 92773215L, 487422094L, 412221929L, 115678561L, 883857001L };
        int[] price = { 1, 1, 2, 1, 2, 1, 2, 2, 1, 1, 1, 2, 1, 2, 2, 2, 2, 2, 1, 2, 2, 1, 2, 2, 1, 2, 1, 1, 1, 2, 2, 2, 1, 2, 2, 1, 2, 2, 2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1, 1 };
        assertEquals(4, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case141() {
        long[] dread = { 2705443L, 1736723169L, 752251566L, 1603278409L, 1525760443L, 32181171L, 316347708L, 957091646L, 19148894L, 1226591494L, 356996318L, 756156237L, 1682138811L, 648441887L, 2052748925L, 305675045L, 1851595476L, 1811709846L, 1313157691L, 638413705L, 807144411L, 120717600L, 592454382L, 1484286774L, 1041373769L, 1005992606L, 1598623196L, 827285012L, 1229205056L, 483407467L, 1110474423L, 742069665L, 1056311330L, 1084035809L, 304051162L, 650786457L, 2075744114L, 1883859244L, 410916549L, 1020597225L, 1571959786L, 1221351251L, 1550269654L, 789867222L, 1110267100L, 224819587L, 1180118089L, 805268585L, 979444429L, 639524509L };
        int[] price = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
        assertEquals(6, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case142() {
        long[] dread = { 1L, 1L, 2L };
        int[] price = { 1, 1, 2 };
        assertEquals(2, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case143() {
        long[] dread = { 10L, 10L, 5L, 15L, 20L };
        int[] price = { 1, 2, 1, 2, 2 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case144() {
        long[] dread = { 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L };
        int[] price = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(1, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case145() {
        long[] dread = { 44170L, 22233L, 11066L, 43002L, 34432L, 17035L, 9175L, 58548L, 13935L, 97583L, 95777L, 4828L, 58219L, 76131L, 81601L, 52493L, 98753L, 83032L, 83423L, 62422L, 43456L, 17882L, 80527L, 66468L, 99775L, 42300L };
        int[] price = { 1, 2, 1, 1, 2, 2, 1, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 1, 1, 2, 2, 2, 2, 1, 2, 1 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case146() {
        long[] dread = { 1L, 2L, 3L, 6L, 7L };
        int[] price = { 1, 1, 1, 2, 2 };
        assertEquals(4, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case147() {
        long[] dread = { 10L, 2L, 11L, 20L };
        int[] price = { 2, 1, 2, 2 };
        assertEquals(4, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case148() {
        long[] dread = { 8L, 5L, 13L };
        int[] price = { 1, 1, 2 };
        assertEquals(2, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case149() {
        long[] dread = { 17567L, 13322L, 24110L, 50353L, 73202L, 64261L, 58857L, 67991L, 28526L, 53047L, 76713L, 63044L };
        int[] price = { 2, 1, 1, 2, 2, 2, 2, 1, 2, 2, 2, 1 };
        assertEquals(5, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case150() {
        long[] dread = { 5L, 5L, 9L, 13L };
        int[] price = { 1, 1, 2, 2 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case151() {
        long[] dread = { 3L, 2L, 1L, 4L, 5L };
        int[] price = { 1, 2, 1, 2, 2 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case152() {
        long[] dread = { 1L, 1L, 1L, 2L, 22L, 2L, 2L, 2L, 2L, 2L, 2L, 2L, 2L, 2L, 2L, 2L, 2L, 2L, 2L, 2L, 2L, 2L, 2L, 1L, 1L, 11L, 1L, 1L, 1L, 1L, 11L, 1L, 1L, 1L, 1L, 1L };
        int[] price = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case153() {
        long[] dread = { 1L, 2147483647L, 2147483647L, 100L, 400L };
        int[] price = { 1, 1, 1, 2, 2 };
        assertEquals(2, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case154() {
        long[] dread = { 8L };
        int[] price = { 2 };
        assertEquals(2, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case155() {
        long[] dread = { 2L, 2L };
        int[] price = { 2, 2 };
        assertEquals(2, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case156() {
        long[] dread = { 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L };
        int[] price = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(1, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case157() {
        long[] dread = { 1L, 3L, 7L, 15L, 31L, 100L, 201L, 500L, 1500L, 5000L, 15000L };
        int[] price = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
        assertEquals(22, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case158() {
        long[] dread = { 60L, 60L, 10L, 100L, 150L };
        int[] price = { 1, 1, 1, 2, 2 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case159() {
        long[] dread = { 34359738368L, 17179869184L, 8589934592L, 4294967296L, 2147483648L, 1073741824L, 536870912L, 268435456L, 134217728L, 67108864L, 33554432L, 16777216L, 8388608L, 4194304L, 2097152L, 1048576L, 524288L, 262144L, 131072L, 65536L, 32768L, 16384L, 8192L, 4096L, 2048L, 1024L, 512L, 256L, 128L, 64L, 32L, 16L, 8L, 4L };
        int[] price = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(1, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case160() {
        long[] dread = { 10L, 10L, 15L, 24L };
        int[] price = { 1, 1, 2, 2 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case161() {
        long[] dread = { 1L, 2L, 4L };
        int[] price = { 2, 2, 2 };
        assertEquals(6, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case162() {
        long[] dread = { 1L, 2L, 3L };
        int[] price = { 1, 1, 1 };
        assertEquals(2, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case163() {
        long[] dread = { 41L, 18467L, 6334L, 53000L, 76676L, 94344L, 91824L, 293580L, 350506L, 415888L, 119805L, 703625L, 675149L, 572118L, 398440L, 22586L, 155740L, 692636L, 313755L, 396828L, 2623671L, 1299756L, 378494L, 16218L, 33872L, 1560132L, 2369256L, 2732536L, 3095726L, 3362255L, 985907L, 4193118L, 3028055L, 2515284L, 433608L, 4898352L, 6673420L, 7205926L, 4923115L, 3017670L, 9213663L, 8024307L, 11056666L, 11223210L, 6857124L, 1893584L, 6419784L, 3408262L, 13024633L, 3303508L };
        int[] price = { 2, 1, 1, 2, 2, 2, 2, 2, 2, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 2, 1, 1, 1, 2, 2, 1, 2, 2, 1, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 2, 2, 1, 1, 1, 2, 2 };
        assertEquals(13, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case164() {
        long[] dread = { 1L };
        int[] price = { 2 };
        assertEquals(2, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case165() {
        long[] dread = { 6L, 2L, 7L, 9L, 6L };
        int[] price = { 2, 1, 2, 2, 1 };
        assertEquals(4, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case166() {
        long[] dread = { 5L, 5L, 10L };
        int[] price = { 1, 1, 2 };
        assertEquals(2, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case167() {
        long[] dread = { 5L, 5L };
        int[] price = { 1, 2 };
        assertEquals(1, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case168() {
        long[] dread = { 2L, 2L, 3L, 5L };
        int[] price = { 1, 1, 2, 2 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case169() {
        long[] dread = { 1073741824L, 536870912L, 268435456L, 134217728L, 67108864L, 33554432L, 16777216L, 8388608L, 4194304L, 2097152L, 1048576L, 524288L, 262144L, 131072L, 65536L, 32768L, 16384L, 8192L, 4096L, 2048L, 1024L, 512L, 256L, 128L, 64L, 32L, 16L, 8L, 4L, 2L };
        int[] price = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(1, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case170() {
        long[] dread = { 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L };
        int[] price = { 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 1 };
        assertEquals(5, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case171() {
        long[] dread = { 549755813888L, 274877906944L, 137438953472L, 68719476736L, 34359738368L, 17179869184L, 8589934592L, 4294967296L, 2147483648L, 1073741824L, 536870912L, 268435456L, 134217728L, 67108864L, 33554432L, 16777216L, 8388608L, 4194304L, 2097152L, 1048576L, 524288L, 262144L, 131072L, 65536L, 32768L, 16384L, 8192L, 4096L, 2048L, 1024L, 512L, 256L, 128L, 64L, 32L, 16L, 8L, 4L, 2L, 1L };
        int[] price = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(1, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case172() {
        long[] dread = { 1000L };
        int[] price = { 2 };
        assertEquals(2, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case173() {
        long[] dread = { 2L, 3L, 5L };
        int[] price = { 1, 1, 1 };
        assertEquals(2, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case174() {
        long[] dread = { 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L, 100L };
        int[] price = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
        assertEquals(2, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case175() {
        long[] dread = { 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L };
        int[] price = { 2, 2, 2, 2, 2 };
        assertEquals(2, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case176() {
        long[] dread = { 100L, 99L, 100L, 150L, 200L };
        int[] price = { 1, 1, 2, 2, 2 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case177() {
        long[] dread = { 1000000000000L, 1000000000000L, 999999999999L, 111111111111L, 111654362456L };
        int[] price = { 2, 2, 2, 2, 1 };
        assertEquals(2, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case178() {
        long[] dread = { 8L, 5L, 10L, 13L, 2L, 1234L, 9876L, 5467L };
        int[] price = { 1, 1, 2, 1, 2, 2, 1, 1 };
        assertEquals(5, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case179() {
        long[] dread = { 4L, 2L, 2L, 100L };
        int[] price = { 1, 1, 1, 2 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case180() {
        long[] dread = { 1L, 1L, 1L, 1L };
        int[] price = { 1, 1, 1, 1 };
        assertEquals(1, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case181() {
        long[] dread = { 2L, 2L };
        int[] price = { 1, 1 };
        assertEquals(1, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case182() {
        long[] dread = { 4L, 8L, 7L, 9L, 5L, 4L, 47L, 58L, 74L, 8L, 8L, 5L, 5L, 4L, 8L, 7L, 5L, 4L, 9L, 88L, 4L, 5L, 4L, 8L, 7L, 5L, 4L, 99L, 8L, 454L, 75L, 84L, 8L, 75L, 4L, 8L, 4L, 5L, 787L, 54L, 8L, 4L, 5L, 4L, 7L, 85L, 4L, 5L, 8L, 4L };
        int[] price = { 1, 1, 1, 1, 1, 2, 1, 2, 1, 1, 1, 2, 2, 2, 1, 1, 2, 1, 1, 1, 1, 1, 2, 2, 1, 1, 2, 1, 2, 1, 1, 1, 2, 2, 2, 2, 2, 1, 1, 1, 1, 2, 1, 2, 1, 1, 1, 2, 1, 2 };
        assertEquals(6, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case183() {
        long[] dread = { 10L, 10L };
        int[] price = { 1, 1 };
        assertEquals(1, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case184() {
        long[] dread = { 15L, 9L, 24L, 39L };
        int[] price = { 1, 1, 2, 2 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case185() {
        long[] dread = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 1073741824L, 2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L };
        int[] price = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(40, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case186() {
        long[] dread = { 17179869184L, 4294967296L, 8589934592L };
        int[] price = { 1, 1, 1 };
        assertEquals(1, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case187() {
        long[] dread = { 757147L, 507978500L, 336971124L, 139567120L, 391749387L, 1470545L, 26239572L, 56984808L, 3615544L, 369042088L, 118341522L, 21564522L, 675016433L, 283987482L, 950090226L, 70617624L, 194041604L, 902908328L, 257655783L, 268159989L, 37379060L, 530496L, 80835680L, 621597008L, 106923810L, 230342100L, 86546364L, 304012332L, 222071040L, 102755056L, 549646416L, 62695451L, 33557676L, 79942653L, 137583462L, 138791610L, 709031778L, 773930380L, 36547830L, 79375581L, 318773940L, 416607780L, 368402970L, 329622200L, 368026284L, 106697010L, 204145359L, 341001111L, 133145005L, 236348518L };
        int[] price = { 1, 1, 1, 2, 2, 1, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 2, 1, 2, 2, 1, 1, 1, 1, 1, 2, 2, 1, 1, 2, 1, 2, 1, 2, 2, 2, 1, 1, 2, 2, 2, 2, 1 };
        assertEquals(4, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case188() {
        long[] dread = { 10L, 1L, 5L, 14L };
        int[] price = { 1, 1, 2, 2 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case189() {
        long[] dread = { 1L, 1L };
        int[] price = { 1, 2 };
        assertEquals(1, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case190() {
        long[] dread = { 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 100000L };
        int[] price = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(2, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case191() {
        long[] dread = { 9L, 3L, 11L, 5L, 16L };
        int[] price = { 2, 1, 2, 2, 2 };
        assertEquals(4, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case192() {
        long[] dread = { 1L };
        int[] price = { 1 };
        assertEquals(1, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case193() {
        long[] dread = { 10L, 1L, 15L };
        int[] price = { 1, 1, 2 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case194() {
        long[] dread = { 123456789L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L };
        int[] price = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1 };
        assertEquals(1, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case195() {
        long[] dread = { 42L, 18468L, 6335L, 26501L, 19170L, 15725L, 11479L, 29359L, 26963L, 24465L, 5706L, 28146L, 23282L, 16828L, 9962L, 492L, 2996L, 11943L, 4828L, 5437L, 32392L, 14605L, 3903L, 154L, 293L, 12383L, 17422L, 18717L, 19719L, 19896L, 5448L, 21727L, 14772L, 11539L, 1870L, 19913L, 25668L, 26300L, 17036L, 9895L, 28704L, 23812L, 31323L, 30334L, 17674L, 4665L, 15142L, 7712L, 28254L, 6869L };
        int[] price = { 2, 1, 1, 2, 2, 2, 2, 2, 2, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 2, 1, 1, 1, 2, 2, 1, 2, 2, 1, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 2, 2, 1, 1, 1, 2, 2 };
        assertEquals(5, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case196() {
        long[] dread = { 223749065263L, 183495924928L, 634053362427L, 526890433895L, 614634499795L, 441472427762L, 273656089175L, 335489826264L, 383103618444L, 613084517057L, 71893285415L, 261445154990L, 691744721745L, 212226605593L, 996493862984L, 845270378388L, 635737465808L, 155679313605L, 544163391311L, 388304951744L, 119257055331L, 504861846705L, 703084466973L, 948235222163L, 28650783143L, 230323228609L, 372066302649L, 779340911136L, 555661435594L, 706955395223L, 657833503230L, 671365335922L, 507488131100L, 568174508160L, 596688095140L, 15663093637L, 141841841640L, 585160032529L, 218663371140L, 540568628266L, 264404687391L, 586706637057L, 120182566887L, 771394058297L, 882617388902L, 223012645643L, 274144447570L, 433224750976L, 42291210851L, 555346385804L };
        int[] price = { 2, 1, 1, 2, 1, 1, 1, 2, 2, 1, 2, 1, 1, 1, 1, 1, 2, 1, 2, 1, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 2, 1, 1, 1, 1, 2, 2, 1, 1, 2, 1, 2, 2, 2, 2 };
        assertEquals(4, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case197() {
        long[] dread = { 6728450049L, 18468L, 313345L, 325959681L, 244973569L, 8931246081L, 1489985L, 62897L, 50716673L, 391425L, 33168385L, 5187305473L, 127011913729L, 711917569L, 178487297L, 1076929L, 766721L, 19562233857L, 24967643137L, 3057153L, 234865L, 2471425L, 62849L, 76677L, 474006683649L, 182561L, 6894125057L, 30097276929L, 74125934593L, 115225919489L, 63612911617L, 323059713L, 900641L, 14954497L, 1196033L, 7991297L, 2609905665L, 153321473L, 64684556289L, 53001L, 42L, 1275009L, 968032257L, 142712833L, 91825L, 65686994945L, 756154369L, 12669L, 2783233L, 431393L };
        int[] price = { 2, 2, 2, 2, 1, 1, 1, 2, 1, 2, 1, 2, 2, 1, 1, 1, 2, 2, 2, 2, 1, 1, 1, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2 };
        assertEquals(6, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case198() {
        long[] dread = { 1L, 2L, 4L, 1000000000L };
        int[] price = { 2, 2, 2, 2 };
        assertEquals(8, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case199() {
        long[] dread = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L };
        int[] price = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
        assertEquals(60, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case200() {
        long[] dread = { 2000000000L, 3000000000L };
        int[] price = { 2, 2 };
        assertEquals(4, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case201() {
        long[] dread = { 4L, 4L };
        int[] price = { 1, 1 };
        assertEquals(1, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case202() {
        long[] dread = { 899906841499L, 949953420750L, 474976710375L, 737488355188L, 368744177594L, 184372088797L, 592186044399L, 796093022200L, 398046511100L, 199023255550L, 99511627775L, 549755813888L, 274877906944L, 137438953472L, 68719476736L, 34359738368L, 17179869184L, 8589934592L, 4294967296L, 2147483648L, 1073741824L, 536870912L, 268435456L, 134217728L, 67108864L, 33554432L, 16777216L, 8388608L, 4194304L, 2097152L, 1048576L, 524288L, 262144L, 131072L, 65536L, 32768L, 16384L, 8192L, 4096L, 2048L, 1024L, 512L, 256L, 128L, 64L, 32L, 16L, 8L, 4L, 2L };
        int[] price = { 2, 2, 1, 1, 2, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 1, 2, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 2, 2, 1, 2, 1, 2, 1, 2, 2, 2, 1, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1 };
        assertEquals(4, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case203() {
        long[] dread = { 5L, 5L };
        int[] price = { 1, 1 };
        assertEquals(1, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case204() {
        long[] dread = { 3L, 2L, 4L, 8L };
        int[] price = { 1, 1, 1, 2 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case205() {
        long[] dread = { 5000L, 4999L, 1000L, 1000L, 1000L, 6000L, 7000L, 8000L };
        int[] price = { 1, 2, 1, 1, 1, 2, 2, 2 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case206() {
        long[] dread = { 1L, 549755813888L, 274877906944L, 137438953472L, 68719476736L, 34359738368L, 17179869184L, 8589934592L, 4294967296L, 2147483648L, 1073741824L, 536870912L, 268435456L, 134217728L, 67108864L, 33554432L, 16777216L, 8388608L, 4194304L, 2097152L, 1048576L, 524288L, 262144L, 131072L, 65536L, 32768L, 16384L, 8192L, 4096L, 2048L, 1024L, 512L, 256L, 128L, 64L, 32L, 16L, 8L, 4L, 2L };
        int[] price = { 1, 2, 1, 1, 2, 1, 2, 2, 1, 1, 2, 1, 2, 2, 2, 1, 1, 2, 2, 2, 2, 1, 1, 1, 1, 2, 1, 2, 2, 2, 1, 1, 1, 2, 1, 2, 2, 2, 2, 2 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case207() {
        long[] dread = { 3L, 1L, 5L };
        int[] price = { 1, 1, 2 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case208() {
        long[] dread = { 10L, 5L, 15L, 25L };
        int[] price = { 1, 1, 2, 2 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case209() {
        long[] dread = { 10L, 9L, 11L, 20L, 20L, 20L };
        int[] price = { 1, 1, 2, 2, 2, 2 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case210() {
        long[] dread = { 100L, 80L, 90L, 180L, 190L };
        int[] price = { 1, 1, 2, 2, 2 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case211() {
        long[] dread = { 1L, 4L, 2L, 3L, 5L, 6L };
        int[] price = { 1, 1, 1, 2, 2, 2 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case212() {
        long[] dread = { 34359738368L, 17179869184L, 8589934592L, 4294967296L, 2147483648L, 1073741824L, 536870912L, 268435456L, 134217728L, 67108864L, 33554432L, 16777216L, 8388608L, 4194304L, 2097152L, 1048576L, 524288L, 262144L, 131072L, 65536L, 32768L, 16384L, 8192L, 4096L, 2048L, 1024L, 512L, 256L, 128L, 64L, 32L, 16L, 8L, 4L, 2L, 1L, 34359738368L, 34359738368L, 34359738368L, 34359738368L, 34359738368L, 34359738368L, 34359738368L, 34359738368L, 34359738368L, 34359738368L };
        int[] price = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(1, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case213() {
        long[] dread = { 3640551741L, 196156243L, 2181876476L };
        int[] price = { 1, 1, 2 };
        assertEquals(1, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case214() {
        long[] dread = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 1073741824L, 2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 270000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L, 1000000000000L };
        int[] price = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
        assertEquals(76, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case215() {
        long[] dread = { 1L, 2L, 3L, 5L, 8L, 13L, 21L, 34L, 55L, 89L, 144L, 233L, 377L, 610L, 987L, 1597L, 2584L, 4181L, 6765L, 10946L, 17711L, 28657L, 46368L, 75025L, 121393L, 196418L, 317811L, 514229L, 832040L, 1346269L, 2178309L, 3524578L, 5702887L, 9227465L, 14930352L, 24157817L, 39088169L, 63245986L, 102334155L, 165580141L, 267914296L, 433494437L, 701408733L, 1134903170L, 1836311903L, 2971215073L, 4807526976L, 7778742049L, 12586269025L, 20365011074L };
        int[] price = { 1, 2, 1, 2, 2, 1, 1, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 1, 1, 1, 2, 1 };
        assertEquals(38, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case216() {
        long[] dread = { 2L, 2L, 4L, 1L, 5L };
        int[] price = { 1, 1, 2, 2, 2 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case217() {
        long[] dread = { 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 3L, 9L, 27L, 81L, 243L, 729L, 2187L, 6561L, 19683L, 59049L, 177147L, 531441L, 1594323L, 4782969L, 14348907L, 43046721L, 129140163L, 387420489L, 1162261467L, 3486784401L, 10460353203L, 31381059609L, 94143178827L, 282429536481L, 847288609443L };
        int[] price = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
        assertEquals(51, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case218() {
        long[] dread = { 10L, 9L, 100L, 111L };
        int[] price = { 1, 1, 1, 2 };
        assertEquals(3, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case219() {
        long[] dread = { 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 1073741824L, 2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L };
        int[] price = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
        assertEquals(80, monstersvalley.minimumPrice(dread, price));
    }

    @Test
    public void case220() {
        long[] dread = { 8589934591L, 4294967295L, 2147483647L, 1073741823L, 536870911L, 268435455L, 134217727L, 67108863L, 33554431L, 16777215L, 8388607L, 4194303L, 2097151L, 1048575L, 524287L, 262143L, 131071L, 65535L, 32767L, 16383L, 8191L, 4095L, 2047L, 1023L, 511L, 255L, 127L, 63L, 31L, 15L, 7L, 3L, 1L };
        int[] price = { 2, 1, 1, 1, 1, 1, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 2, 1, 1, 2, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1 };
        assertEquals(2, monstersvalley.minimumPrice(dread, price));
    }

}
