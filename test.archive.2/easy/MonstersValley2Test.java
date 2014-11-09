package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class MonstersValley2Test {
    MonstersValley2 monstersvalley2 = new MonstersValley2();

    @Test
    public void case1() {
        int[] dread = { 8, 5, 10 };
        int[] price = { 1, 1, 2 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case2() {
        int[] dread = { 1, 2, 4, 1000000000 };
        int[] price = { 1, 1, 1, 2 };
        assertEquals(5, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case3() {
        int[] dread = { 200, 107, 105, 206, 307, 400 };
        int[] price = { 1, 2, 1, 1, 1, 2 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case4() {
        int[] dread = { 5216, 12512, 613, 1256, 66, 17202, 30000, 23512, 2125, 33333 };
        int[] price = { 2, 2, 1, 1, 1, 1, 2, 1, 2, 1 };
        assertEquals(5, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case5() {
        int[] dread = { 606 };
        int[] price = { 2 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case6() {
        int[] dread = { 524657775 };
        int[] price = { 2 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case7() {
        int[] dread = { 3, 2, 5, 7 };
        int[] price = { 1, 1, 2, 2 };
        assertEquals(3, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case8() {
        int[] dread = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288 };
        int[] price = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
        assertEquals(40, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case9() {
        int[] dread = { 1, 2, 4, 6, 16, 19, 64, 105, 256, 464, 1024, 1463, 4096, 4515, 16384, 21445, 65536, 68543, 262144, 479277 };
        int[] price = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
        assertEquals(28, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case10() {
        int[] dread = { 1999999991, 1999999992, 1999999993, 1999999994, 1999999995, 1999999996, 1999999997, 1999999998, 1999999999, 2000000000 };
        int[] price = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case11() {
        int[] dread = { 276378, 939933, 574877, 888702, 683628 };
        int[] price = { 1, 1, 2, 1, 1 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case12() {
        int[] dread = { 492214, 378290, 162083, 858555 };
        int[] price = { 2, 2, 2, 1 };
        assertEquals(3, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case13() {
        int[] dread = { 138742, 878514, 852494, 542526, 953090, 618335, 834947, 451187, 818761, 498817, 701160, 996792, 845435, 145660, 183611, 150459, 635733, 718307 };
        int[] price = { 2, 1, 1, 1, 2, 1, 1, 1, 2, 2, 1, 2, 1, 1, 2, 2, 2, 2 };
        assertEquals(3, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case14() {
        int[] dread = { 406711, 813026, 985429, 693445, 653459, 851295, 299367, 676132, 770750, 363356, 658504 };
        int[] price = { 2, 2, 2, 1, 2, 2, 1, 1, 1, 2, 2 };
        assertEquals(4, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case15() {
        int[] dread = { 278033, 630470, 39142, 604719, 36490, 400221, 576007, 298209, 202048, 406921 };
        int[] price = { 1, 2, 1, 2, 1, 1, 2, 2, 2, 1 };
        assertEquals(3, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case16() {
        int[] dread = { 549037, 846063, 786688, 666614, 592108 };
        int[] price = { 1, 2, 1, 1, 2 };
        assertEquals(3, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case17() {
        int[] dread = { 229505, 433280, 915022 };
        int[] price = { 1, 1, 2 };
        assertEquals(4, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case18() {
        int[] dread = { 773105 };
        int[] price = { 2 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case19() {
        int[] dread = { 633301, 301906, 445427, 509043, 673939 };
        int[] price = { 2, 1, 1, 2, 2 };
        assertEquals(3, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case20() {
        int[] dread = { 274987, 988110, 468154, 354593 };
        int[] price = { 2, 2, 2, 1 };
        assertEquals(4, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case21() {
        int[] dread = { 597625, 249122, 838726, 402201, 933860, 658620 };
        int[] price = { 2, 2, 2, 2, 1, 1 };
        assertEquals(4, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case22() {
        int[] dread = { 202840, 843337, 326007, 731681, 931244, 610300, 140830, 347449, 178713, 160244, 772831, 243548, 350741, 445070, 943259, 85348 };
        int[] price = { 1, 2, 1, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 2, 1 };
        assertEquals(3, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case23() {
        int[] dread = { 78341, 111924, 510644, 87408, 619644, 910888, 695650, 66650, 223357 };
        int[] price = { 1, 1, 2, 1, 1, 1, 1, 2, 2 };
        assertEquals(5, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case24() {
        int[] dread = { 854876, 611886, 818411, 568380, 109228, 412632, 148292, 177354, 806246, 831430, 643369, 671409, 374510, 97982 };
        int[] price = { 2, 1, 2, 1, 1, 2, 2, 1, 1, 2, 1, 2, 2, 2 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case25() {
        int[] dread = { 333735, 907985, 13361, 107282, 879340, 825598, 497004, 35801, 451639, 541320, 859429, 587990, 989163 };
        int[] price = { 1, 2, 1, 2, 1, 1, 2, 1, 1, 1, 2, 1, 2 };
        assertEquals(3, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case26() {
        int[] dread = { 730354301, 612652745, 231201198, 1785940683, 1573792486, 1862050299, 55215265, 1482185079, 580169303, 745811023, 116284213, 1674085202, 243582700, 1259989441, 459631588, 1113164735, 549938993, 1675101506, 144384566, 1897340738 };
        int[] price = { 2, 1, 2, 2, 2, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 1, 2, 2, 2, 2 };
        assertEquals(4, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case27() {
        int[] dread = { 1415229038, 834285838, 1214442017, 1217534876 };
        int[] price = { 2, 1, 2, 1 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case28() {
        int[] dread = { 368805779, 1818947888, 1788720857, 1788391727, 659610167, 1757059785, 1951203365, 1365448488, 1291565579, 212981422 };
        int[] price = { 1, 2, 1, 1, 1, 2, 1, 2, 1, 1 };
        assertEquals(3, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case29() {
        int[] dread = { 953379700, 1963120299, 648003103, 1545329216, 248966873, 997656371, 1408722762, 640985409, 150299963, 651226125, 1983428467 };
        int[] price = { 2, 1, 1, 1, 2, 1, 2, 2, 1, 1, 2 };
        assertEquals(3, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case30() {
        int[] dread = { 1547217503, 1787964172, 281041017, 127192884, 686068400, 1518709677, 75143338, 877524025, 1830002240, 95142533, 1229301205 };
        int[] price = { 2, 1, 2, 1, 1, 2, 1, 1, 1, 1, 2 };
        assertEquals(3, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case31() {
        int[] dread = { 131144893, 1253402892, 327490895, 758530919, 575176500, 1048213981, 636183295, 306142540, 475491284, 117815209, 894552824, 1065451684 };
        int[] price = { 2, 2, 2, 1, 1, 2, 2, 1, 2, 1, 2, 1 };
        assertEquals(4, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case32() {
        int[] dread = { 1691715165, 1069375201, 110077378, 367162390, 1055161432, 232475527 };
        int[] price = { 2, 1, 2, 1, 1, 1 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case33() {
        int[] dread = { 559787380, 111124697, 211951612, 26295899, 989297246, 813172925 };
        int[] price = { 1, 2, 1, 2, 1, 2 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case34() {
        int[] dread = { 86780821, 1140185415, 85548635, 347237270, 1167764408, 1604033858, 1993911067, 1875463689, 1361486142, 675528710, 1858647747, 1826530257, 1355912372, 1314505700, 194376352, 1067180132 };
        int[] price = { 1, 2, 1, 1, 1, 2, 2, 1, 2, 1, 2, 1, 1, 2, 2, 2 };
        assertEquals(4, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case35() {
        int[] dread = { 853744211, 1559615791, 866431564, 1860458362, 1080823152, 973755754, 926899774 };
        int[] price = { 1, 1, 1, 1, 2, 1, 1 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case36() {
        int[] dread = { 637463334, 492295149, 644830292, 569798827, 43394064, 1651455355, 898690609, 1248694777, 1949378803, 931930223 };
        int[] price = { 2, 2, 1, 1, 2, 1, 1, 2, 1, 2 };
        assertEquals(4, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case37() {
        int[] dread = { 1992350787, 1204067578, 1971977184, 1986727084, 550738791, 958698508 };
        int[] price = { 2, 1, 1, 1, 2, 1 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case38() {
        int[] dread = { 1383678529, 138906144, 940996497, 619586457 };
        int[] price = { 1, 2, 2, 1 };
        assertEquals(1, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case39() {
        int[] dread = { 1782688262, 895047095, 1625373870, 1009836949, 985560038, 1470346827, 296839142, 34727454, 413009041, 1114435639, 1692481802, 422406335, 795130000, 1455087504, 410389760, 961349143, 1693064512, 621415696, 98442513 };
        int[] price = { 2, 2, 1, 2, 2, 2, 2, 2, 2, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case40() {
        int[] dread = { 992388416, 198261504, 772412033, 1889458810 };
        int[] price = { 1, 2, 2, 2 };
        assertEquals(3, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case41() {
        int[] dread = { 55812, 129413, 3369997, 2698415, 50526015, 32026198, 5355511, 100092466, 265746384, 156194334, 99374300, 635472617, 180646818, 91608661, 417850817, 1022057911, 1729513937 };
        int[] price = { 1, 1, 2, 1, 1, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 2, 1 };
        assertEquals(10, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case42() {
        int[] dread = { 2589192, 23314744, 97814, 245124401, 390282178, 758765331, 159041187, 1912259796 };
        int[] price = { 1, 2, 1, 2, 2, 2, 1, 1 };
        assertEquals(10, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case43() {
        int[] dread = { 1661394, 73478485, 124895705, 402068495, 507240373, 1961191628 };
        int[] price = { 1, 1, 2, 2, 2, 2 };
        assertEquals(8, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case44() {
        int[] dread = { 1252017, 3776329, 21140492, 5357875, 59227052, 88302560, 344236822, 52938928, 256182128, 321584565, 22692247 };
        int[] price = { 2, 2, 1, 1, 1, 2, 2, 1, 2, 2, 1 };
        assertEquals(9, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case45() {
        int[] dread = { 174927, 10654989, 55924062, 70457525, 52549382, 393666222, 773214540, 1177429024, 1280559141 };
        int[] price = { 2, 1, 1, 2, 2, 1, 1, 2, 2 };
        assertEquals(8, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case46() {
        int[] dread = { 335520, 7166533, 19084297, 44364675, 66301712, 243376382, 369091309, 441177770, 553345446, 768799475, 1459642711, 854126713 };
        int[] price = { 2, 1, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1 };
        assertEquals(13, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case47() {
        int[] dread = { 178041, 241271, 3554145, 15146146, 29336857, 41372319, 78867753, 27414201, 108212503, 69279302, 312855571, 110338295, 82908093, 467516892, 125004100, 434086364, 172491586, 1039740703, 590277, 1754775248 };
        int[] price = { 1, 2, 2, 2, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 2, 1, 2, 1 };
        assertEquals(14, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case48() {
        int[] dread = { 149235, 2702103, 9621991, 16444946, 24895184, 48928723, 127681201, 45700795, 234008969, 114105628, 350087054, 311983334, 652890170, 347935195, 390614530, 893201743, 1889846895 };
        int[] price = { 1, 2, 1, 2, 1, 2, 2, 2, 1, 1, 1, 2, 1, 2, 1, 1, 1 };
        assertEquals(12, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case49() {
        int[] dread = { 590449, 4731049, 1584478, 100420763, 86249282, 194454422, 808571587, 534818108, 1742459894 };
        int[] price = { 1, 2, 1, 2, 2, 2, 2, 2, 2 };
        assertEquals(11, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case50() {
        int[] dread = { 758992, 6901301, 80078202, 103054334, 331245983, 851301800, 209431393 };
        int[] price = { 2, 2, 2, 1, 1, 1, 2 };
        assertEquals(9, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case51() {
        int[] dread = { 375459, 617787, 10425424, 12611536, 12212171, 75005736, 8846978, 9301694, 142058581, 72615651, 60574288, 592619153, 459336400, 430567015, 1287700983, 1045283211, 269698502 };
        int[] price = { 1, 1, 1, 2, 2, 1, 1, 1, 2, 1, 2, 1, 2, 2, 2, 1, 1 };
        assertEquals(11, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case52() {
        int[] dread = { 197538, 2088936, 3509470, 20939186, 50206421, 22604497, 133400415, 187910255, 11826249, 388209892, 6886617, 588380619, 240052207, 63701601, 551901468, 209580949, 1758858199 };
        int[] price = { 2, 2, 2, 1, 2, 1, 2, 2, 1, 1, 2, 1, 1, 1, 2, 2, 1 };
        assertEquals(13, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case53() {
        int[] dread = { 3843, 437808, 4088636, 21920545, 17728351, 17282550, 111536526, 20625035, 71882430, 129029409, 39581290, 535389768, 749333266, 558761224, 687500849, 1309193142, 1247523583, 1385101352 };
        int[] price = { 2, 2, 2, 1, 2, 1, 2, 2, 1, 1, 1, 2, 2, 1, 2, 2, 1, 1 };
        assertEquals(13, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case54() {
        int[] dread = { 7290252, 124728206, 425327327, 980140755, 1694076474 };
        int[] price = { 2, 1, 2, 1, 2 };
        assertEquals(8, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case55() {
        int[] dread = { 849513, 6100784, 12751708, 26051050, 84524432, 275567165, 512229310, 936185513, 539883036, 315995883 };
        int[] price = { 1, 2, 1, 2, 2, 2, 1, 2, 2, 2 };
        assertEquals(13, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case56() {
        int[] dread = { 443857, 5975205, 24095251, 43860354, 49925895, 60205760, 294428884, 207406340, 463155265, 813378725, 757188699, 1390259091, 1674862744 };
        int[] price = { 1, 1, 1, 1, 1, 2, 2, 1, 2, 1, 2, 2, 1 };
        assertEquals(10, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case57() {
        int[] dread = { 250438, 568979, 18796848, 31305606, 81014756, 98204282, 141687369, 97810698, 220060650, 631383745, 777312423, 156798369, 1845437234 };
        int[] price = { 1, 1, 2, 2, 1, 1, 2, 2, 1, 1, 1, 1, 1 };
        assertEquals(10, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case58() {
        int[] dread = { 672107, 2643074, 529850, 35636615, 81113168, 96575175, 104125968, 39236967, 165081715, 60078595, 914507263, 175347362, 679297708, 1718078629 };
        int[] price = { 1, 1, 2, 1, 1, 2, 2, 2, 2, 2, 2, 1, 1, 1 };
        assertEquals(9, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case59() {
        int[] dread = { 167878, 3169023, 3526829, 15558338, 8689814, 15469622, 70341228, 161912435, 270279010, 191495798, 471391453, 336129399, 667939157, 772487373, 1109149871, 296224343, 35789463 };
        int[] price = { 2, 2, 1, 2, 2, 1, 1, 1, 2, 2, 1, 1, 1, 2, 2, 2, 1 };
        assertEquals(12, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case60() {
        int[] dread = { 122173, 2071445, 898765, 753106, 29143508, 54727654, 32025475, 142197187, 207263662, 350616206, 282479798, 567189003, 251941626, 357631619, 2918998, 697433033 };
        int[] price = { 2, 1, 1, 1, 2, 2, 2, 1, 2, 1, 2, 2, 1, 1, 2, 1 };
        assertEquals(10, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case61() {
        int[] dread = { 48219, 920898, 2179240, 9993589, 29116629, 59158375, 61577353, 39926727, 79239592, 92299665, 38869806, 114951159, 224003787, 252096248, 953956706, 626496202, 397656017, 434784538, 1407497740 };
        int[] price = { 1, 2, 2, 2, 1, 1, 2, 1, 2, 2, 2, 2, 1, 1, 2, 1, 1, 2, 1 };
        assertEquals(14, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case62() {
        int[] dread = { 117426, 417423, 6529466, 13572907, 20582830, 3355360, 56555551, 6642336, 186172523, 186804224, 15277581, 59444651, 254457068, 310528342, 423416841, 782884539, 743464702, 369610019, 643257039 };
        int[] price = { 1, 1, 1, 1, 1, 2, 2, 2, 1, 1, 1, 2, 2, 1, 2, 2, 2, 2, 1 };
        assertEquals(10, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case63() {
        int[] dread = { 874437, 6826273, 39807214, 18556188, 38704414, 282109373, 314755786, 213092538, 134585833, 1119684013, 918295190 };
        int[] price = { 2, 1, 2, 1, 2, 1, 2, 1, 1, 1, 2 };
        assertEquals(7, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case64() {
        int[] dread = { 265556, 2061422, 1500718, 17959647, 28180125, 82100102, 134639402, 206809129, 187309364, 128555403, 439962828, 102933635, 669498463, 769511250, 1169307215, 196661619, 1182466435 };
        int[] price = { 2, 1, 2, 1, 1, 1, 2, 1, 2, 1, 2, 1, 1, 2, 1, 2, 1 };
        assertEquals(11, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case65() {
        int[] dread = { 3257543, 372916, 73752274, 95265442, 170354021, 300856091, 141810509, 1488011678 };
        int[] price = { 2, 1, 1, 1, 2, 2, 1, 2 };
        assertEquals(8, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case66() {
        int[] dread = { 678548, 1356065, 3601825, 12822103, 103809657, 193401443, 234096960, 74135382, 579744808, 141624669, 731841174, 446013106, 465189490 };
        int[] price = { 2, 2, 1, 1, 1, 1, 2, 2, 2, 1, 2, 2, 1 };
        assertEquals(10, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case67() {
        int[] dread = { 319437, 1878550, 3190318, 20409721, 14727941, 43516041, 93601628, 163005037, 136571399, 254741226, 109779898, 201373153, 316232079, 24567749, 400406805, 1018098274, 1550461119, 36029233 };
        int[] price = { 2, 1, 1, 1, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 2, 2, 1, 2 };
        assertEquals(14, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case68() {
        int[] dread = { 1191368, 44420765, 64593392, 244992255, 147789565, 557199513, 1613458523 };
        int[] price = { 1, 1, 2, 1, 1, 2, 1 };
        assertEquals(8, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case69() {
        int[] dread = { 6928298, 51309118, 152835695, 208537301, 692935143, 1301925202 };
        int[] price = { 2, 1, 2, 1, 1, 2 };
        assertEquals(8, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case70() {
        int[] dread = { 45990, 1720448, 2902020, 21294374, 51616526, 33583070, 69583419, 220564857, 59475757, 253250147, 542046018, 475926079, 435733089, 333071866, 119591805, 49108731 };
        int[] price = { 2, 2, 2, 2, 1, 1, 2, 1, 1, 2, 2, 1, 2, 1, 1, 1 };
        assertEquals(12, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case71() {
        int[] dread = { 1, 2, 4, 1000000000 };
        int[] price = { 1, 1, 1, 2 };
        assertEquals(5, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case72() {
        int[] dread = { 1999999999, 2000000000, 2000000000 };
        int[] price = { 1, 1, 1 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case73() {
        int[] dread = { 1200000000, 1200000001, 1200000002 };
        int[] price = { 1, 1, 1 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case74() {
        int[] dread = { 1999999997, 1999999998, 1999999999 };
        int[] price = { 1, 1, 1 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case75() {
        int[] dread = { 1900000000, 1900000001, 2000000000 };
        int[] price = { 1, 1, 2 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case76() {
        int[] dread = { 1000000000, 2000000000, 1 };
        int[] price = { 1, 1, 2 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case77() {
        int[] dread = { 1999999998, 1999999999, 1 };
        int[] price = { 1, 1, 2 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case78() {
        int[] dread = { 1999999998, 1999999999, 2000000000 };
        int[] price = { 1, 1, 1 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case79() {
        int[] dread = { 99999990, 99999991, 2000000000, 2000000000, 2000000000, 2000000000 };
        int[] price = { 1, 1, 1, 1, 1, 1 };
        assertEquals(3, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case80() {
        int[] dread = { 2000000000, 2000000000, 2000000000, 2000000000 };
        int[] price = { 1, 2, 1, 2 };
        assertEquals(1, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case81() {
        int[] dread = { 1000000000, 1500000000, 2000000000 };
        int[] price = { 1, 1, 1 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case82() {
        int[] dread = { 294967296, 1999999999, 100, 2000000000, 2000000000 };
        int[] price = { 1, 1, 1, 1, 1 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case83() {
        int[] dread = { 1500000000, 2000000000, 1 };
        int[] price = { 1, 1, 1 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case84() {
        int[] dread = { 1500000000, 1700000000, 10 };
        int[] price = { 1, 1, 2 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case85() {
        int[] dread = { 1000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000 };
        int[] price = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case86() {
        int[] dread = { 8, 5, 10 };
        int[] price = { 1, 1, 2 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case87() {
        int[] dread = { 1999999999, 1999999999, 2000000000, 2000000000 };
        int[] price = { 1, 1, 1, 1 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case88() {
        int[] dread = { 1999999999, 2000000000, 1 };
        int[] price = { 1, 1, 1 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case89() {
        int[] dread = { 1999999996, 1999999997, 1999999998, 1999999999, 2000000000 };
        int[] price = { 2, 2, 2, 2, 2 };
        assertEquals(4, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case90() {
        int[] dread = { 1999999999, 2000000000, 2000000000, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int[] price = { 1, 1, 2, 2, 2, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case91() {
        int[] dread = { 1919427963, 1963318973, 1906880669, 1906607128, 1952278976, 1915114853, 1907778220, 1900673962, 1921459521, 1935440793, 1950828766, 1981945119, 1946884274, 1923084047, 1900916467, 1957256737, 1951034149, 1999287908, 1925102935, 1904125040 };
        int[] price = { 2, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 2 };
        assertEquals(4, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case92() {
        int[] dread = { 1999999999, 1999999999, 2000000000 };
        int[] price = { 1, 2, 1 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case93() {
        int[] dread = { 1500000000, 1600000000, 2000000000, 2000000000, 2000000000 };
        int[] price = { 1, 1, 1, 1, 1 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case94() {
        int[] dread = { 1999999999, 2000000000, 2000000000, 2000000000 };
        int[] price = { 1, 1, 1, 1 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case95() {
        int[] dread = { 1557383327, 1495758780, 1698059636, 1153294385, 1510891668, 767210130, 395854773, 1466735568, 1425178914, 1292334654, 1537286368, 401889856, 685507531, 1171817724, 1234482542, 1429944859, 569683690, 1627876535, 1997329960, 2000000000 };
        int[] price = { 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 2, 2, 1, 2, 2, 2, 2, 2, 1, 2 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case96() {
        int[] dread = { 2, 2 };
        int[] price = { 2, 2 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case97() {
        int[] dread = { 1999999999, 2000000000, 2000000000 };
        int[] price = { 1, 1, 2 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case98() {
        int[] dread = { 50, 10, 60, 110 };
        int[] price = { 1, 1, 2, 2 };
        assertEquals(3, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case99() {
        int[] dread = { 1000000000, 2000000000, 100, 200 };
        int[] price = { 1, 1, 2, 2 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case100() {
        int[] dread = { 1000000000, 2000000000, 10 };
        int[] price = { 2, 1, 2 };
        assertEquals(3, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case101() {
        int[] dread = { 1500000000, 1500000000, 2000000000 };
        int[] price = { 1, 1, 2 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case102() {
        int[] dread = { 1999999999, 2000000000, 2000000000, 2000000000 };
        int[] price = { 1, 1, 2, 1 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case103() {
        int[] dread = { 1000000001, 1000000002, 1000000003, 1000000004 };
        int[] price = { 1, 1, 1, 1 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case104() {
        int[] dread = { 999999999, 999999999, 1999999999, 2000000000 };
        int[] price = { 1, 2, 1, 2 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case105() {
        int[] dread = { 500000000, 2000000000, 2000000000 };
        int[] price = { 1, 1, 2 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case106() {
        int[] dread = { 200000000, 500000000, 1000000000, 2000000000, 2000000000, 2000000000 };
        int[] price = { 2, 2, 2, 2, 2, 2 };
        assertEquals(8, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case107() {
        int[] dread = { 500000000, 1000000000, 2000000000, 2000000000 };
        int[] price = { 1, 1, 1, 2 };
        assertEquals(3, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case108() {
        int[] dread = { 999999999, 999999999, 1999999999, 1999999999 };
        int[] price = { 1, 1, 1, 1 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case109() {
        int[] dread = { 1999999999, 2000000000, 2000000000 };
        int[] price = { 2, 1, 1 };
        assertEquals(3, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case110() {
        int[] dread = { 1900000000, 1900000000, 1900000001, 1, 1, 1900000000, 1900000005, 1, 1 };
        int[] price = { 1, 2, 1, 2, 1, 2, 1, 2, 1 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case111() {
        int[] dread = { 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000 };
        int[] price = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(1, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case112() {
        int[] dread = { 888888888, 1000000000, 2000000000, 2000000000 };
        int[] price = { 1, 2, 2, 1 };
        assertEquals(5, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case113() {
        int[] dread = { 1, 1999999997, 1999999999, 1000000000 };
        int[] price = { 1, 1, 2, 1 };
        assertEquals(4, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case114() {
        int[] dread = { 1000, 50000, 156478949, 2000000000, 2000000000, 2000000000, 1000000000 };
        int[] price = { 1, 1, 2, 1, 1, 1, 1 };
        assertEquals(5, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case115() {
        int[] dread = { 1999999999, 2000000000, 2000000000 };
        int[] price = { 2, 2, 2 };
        assertEquals(4, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case116() {
        int[] dread = { 1900000000, 2000000000, 2000000000 };
        int[] price = { 1, 1, 1 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case117() {
        int[] dread = { 1999999999, 1999999999, 1999999999, 1999999999, 2000000000 };
        int[] price = { 1, 1, 1, 2, 2 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case118() {
        int[] dread = { 1999999995, 1999999996, 1999999997, 1999999998, 1999999999 };
        int[] price = { 1, 2, 1, 2, 1 };
        assertEquals(3, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case119() {
        int[] dread = { 1900000000, 1900000000, 2000000000 };
        int[] price = { 1, 1, 2 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case120() {
        int[] dread = { 1999999999, 2000000000, 999999999, 333333333, 222222222 };
        int[] price = { 1, 2, 1, 2, 1 };
        assertEquals(3, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case121() {
        int[] dread = { 10, 1, 11 };
        int[] price = { 1, 1, 2 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case122() {
        int[] dread = { 1, 1 };
        int[] price = { 1, 2 };
        assertEquals(1, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case123() {
        int[] dread = { 50, 50, 50, 60, 150 };
        int[] price = { 1, 1, 1, 2, 2 };
        assertEquals(3, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case124() {
        int[] dread = { 1202024340, 1044415051, 1528948584, 249531286, 1984244858, 929774143, 1623005829, 521683809, 1911530809, 742947743, 1252792943, 1761317813, 1553892843, 728381134, 1244931238, 626144345, 938136115, 428748531, 1168924832, 939248668 };
        int[] price = { 2, 2, 1, 1, 1, 1, 1, 2, 1, 2, 2, 1, 2, 2, 1, 1, 1, 2, 2, 2 };
        assertEquals(3, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case125() {
        int[] dread = { 100, 99, 99, 150 };
        int[] price = { 1, 2, 1, 2 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case126() {
        int[] dread = { 2000000000, 2000000000, 2000000000, 2000000000 };
        int[] price = { 2, 2, 2, 2 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case127() {
        int[] dread = { 2000000000, 2000000000, 2000000000, 2000000000, 999999999, 999999999, 1999999999, 2000000000 };
        int[] price = { 2, 2, 2, 2, 2, 2, 2, 2 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case128() {
        int[] dread = { 5, 5, 4, 9 };
        int[] price = { 2, 1, 2, 2 };
        assertEquals(3, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case129() {
        int[] dread = { 1000000000, 2000000000, 2000000000, 1 };
        int[] price = { 1, 1, 1, 1 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case130() {
        int[] dread = { 1999999970, 1999999971, 1999999972, 1999999973, 1999999974, 1999999975, 1999999976, 1999999977, 1999999978, 1999999979, 1999999980, 1999999981, 1999999982, 1999999983, 1999999984, 1999999985, 1999999986, 1999999987, 1999999988, 1999999989 };
        int[] price = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case131() {
        int[] dread = { 4, 2, 1, 6, 15 };
        int[] price = { 1, 1, 1, 2, 1 };
        assertEquals(3, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case132() {
        int[] dread = { 10, 10, 20 };
        int[] price = { 2, 2, 1 };
        assertEquals(3, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case133() {
        int[] dread = { 2, 3, 5 };
        int[] price = { 2, 1, 1 };
        assertEquals(3, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case134() {
        int[] dread = { 8, 5, 2 };
        int[] price = { 1, 1, 1 };
        assertEquals(1, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case135() {
        int[] dread = { 1, 1, 1, 2 };
        int[] price = { 1, 2, 1, 2 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case136() {
        int[] dread = { 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000 };
        int[] price = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case137() {
        int[] dread = { 99, 99 };
        int[] price = { 2, 2 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case138() {
        int[] dread = { 1, 1, 2, 3 };
        int[] price = { 1, 1, 2, 2 };
        assertEquals(3, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case139() {
        int[] dread = { 2000000000, 2000000000, 2000000000 };
        int[] price = { 1, 1, 1 };
        assertEquals(1, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case140() {
        int[] dread = { 10, 9, 1, 1, 1, 18 };
        int[] price = { 1, 1, 2, 2, 2, 2 };
        assertEquals(2, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case141() {
        int[] dread = { 888888888, 999999999, 1000000000, 1999999999 };
        int[] price = { 1, 1, 1, 2 };
        assertEquals(3, monstersvalley2.minimumPrice(dread, price));
    }

    @Test
    public void case142() {
        int[] dread = { 1999999998, 1999999999, 1999999999 };
        int[] price = { 1, 2, 1 };
        assertEquals(3, monstersvalley2.minimumPrice(dread, price));
    }

}
