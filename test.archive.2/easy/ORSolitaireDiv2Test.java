package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class ORSolitaireDiv2Test {
    ORSolitaireDiv2 orsolitairediv2 = new ORSolitaireDiv2();

    @Test
    public void case1() {
        int[] numbers = { 1, 2, 4 };
        int goal = 7;
        assertEquals(1, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case2() {
        int[] numbers = { 1, 2, 4, 7, 8 };
        int goal = 7;
        assertEquals(2, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case3() {
        int[] numbers = { 12571295, 2174218, 2015120 };
        int goal = 1;
        assertEquals(0, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case4() {
        int[] numbers = { 5, 2, 4, 52, 62, 9, 8, 3, 1, 11, 6 };
        int goal = 11;
        assertEquals(3, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case5() {
        int[] numbers = { 109127425, 391193886, 77568450, 481751837, 411889236, 488364804, 480598915, 7490879, 95057181, 16530444, 55580676, 92339390, 273649157, 5737290, 144995698, 480240667, 402927632, 95353526, 170311435, 485081164 };
        int goal = 536870911;
        assertEquals(4, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case6() {
        int[] numbers = { 27, 2, 26, 7, 21, 29, 28, 31, 5, 6, 18, 12, 15, 30, 14, 17, 24, 16, 9, 10 };
        int goal = 31;
        assertEquals(9, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case7() {
        int[] numbers = { 55, 691, 650, 432, 160, 720, 290, 732, 903, 723, 785, 79, 294, 345, 453, 964, 897, 253, 690, 113 };
        int goal = 1023;
        assertEquals(5, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case8() {
        int[] numbers = { 22528, 20912, 22320, 16401, 22784, 23955, 18352, 1315, 23569, 20250, 2363, 19608, 6584, 5411, 1467, 2601, 4499, 21792, 6170, 1680 };
        int goal = 24507;
        assertEquals(5, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case9() {
        int[] numbers = { 823447732, 593423634, 809515236, 555028692, 861241348, 307814628, 51914944, 592246884, 826888400, 716806243, 33560704, 559253716, 313595780, 489421707, 860106944, 382793666 };
        int goal = 861796596;
        assertEquals(4, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case10() {
        int[] numbers = { 172034615, 172296301, 134293593, 888499515, 155460170, 337462, 46305587, 139101223, 488570356, 151333909, 172230716, 229655861, 933046747, 441405556, 267718708, 493313234, 151259174, 16787519, 138413121, 54788182 };
        int goal = 189083263;
        assertEquals(3, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case11() {
        int[] numbers = { 744207802, 459506930, 96031044, 94305333, 71623564, 401261714, 143654920, 180838023, 426804418, 292454963, 396375937, 783935062, 983980901, 302100998 };
        int goal = 751841480;
        assertEquals(0, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case12() {
        int[] numbers = { 335643795, 18915408, 335545345, 38248827, 67215425, 270540866, 276958948, 335610067, 388882431, 285245507, 667758452, 352396432, 270540930, 2203715, 337682562, 268443840, 9808608 };
        int goal = 354526419;
        assertEquals(3, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case13() {
        int[] numbers = { 828679106, 142753985, 468167304, 136484418, 424919616, 325098545, 12669632, 29376579, 151062080, 6427202, 25416387, 29425667 };
        int goal = 165926595;
        assertEquals(2, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case14() {
        int[] numbers = { 14696720, 564142160, 12623892, 153215056, 683712604, 559980552, 679510340, 123160, 10485840, 29417556, 16793624, 673243408, 689995776, 702636316, 18964496, 153124864, 562044948 };
        int goal = 702669148;
        assertEquals(4, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case15() {
        int[] numbers = { 532700295, 225353158, 352321581, 83887104, 335544361, 1033, 279970861, 278921221, 231758666, 276824065, 287309832, 295699493, 286261252, 196315035 };
        int goal = 363856941;
        assertEquals(2, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case16() {
        int[] numbers = { 899600840, 656757270, 755007825, 686528173, 268726219, 559245235, 611788458, 368346758, 17334298, 549641380, 83919197, 389157370, 605061982, 813127881 };
        int goal = 756581215;
        assertEquals(1, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case17() {
        int[] numbers = { 76185604, 90374409, 299926793, 299892748, 13141252, 50463749, 34111501, 62948621, 96503053, 20972548, 344621325, 321487884, 384401417, 35717381, 281182217, 102760452, 348225793 };
        int goal = 401310989;
        assertEquals(5, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case18() {
        int[] numbers = { 442637816, 365993835, 833768101, 224044145, 27693200, 53501952, 736425935, 498092463, 17969284, 329547920, 301994112 };
        int goal = 330756244;
        assertEquals(1, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case19() {
        int[] numbers = { 157548768, 809931613, 134482024, 89129000, 154403976, 220202152, 202376288, 90178592, 896745400, 67372192, 151259176, 136580160, 136577120 };
        int goal = 225709288;
        assertEquals(3, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case20() {
        int[] numbers = { 270937159, 976111677, 307477007, 942809093, 177199459, 940703749, 1321286, 1179907, 538976325, 270540804, 406192130, 1179666, 806489093, 482799521, 8514 };
        int goal = 943074647;
        assertEquals(1, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case21() {
        int[] numbers = { 331620352, 468879139, 558315151, 332793348, 270686573, 545367314, 222433724, 16908804, 26092552, 37757964, 8521224, 123346056 };
        int goal = 333325836;
        assertEquals(1, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case22() {
        int[] numbers = { 282901120, 545260432, 609183355, 480548122, 805306513, 16793873, 295699345, 396053269, 553648768, 824771288, 276840465 };
        int goal = 832594833;
        assertEquals(0, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case23() {
        int[] numbers = { 273359450, 289947800, 273170536, 80220416, 25187170, 92500880, 281244176, 71659778, 352539266, 29696920, 289746968, 336204706, 352522848, 72221170, 83981112 };
        int goal = 365917178;
        assertEquals(4, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case24() {
        int[] numbers = { 138575997, 13140277, 2359423, 134774887, 614668282, 376463334, 145359177, 6291735, 2359644, 112698510, 524315, 11272501 };
        int goal = 149848447;
        assertEquals(2, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case25() {
        int[] numbers = { 706800612, 539625532, 641828790, 911986104, 782645710, 651888112, 567875154, 296932750, 150522789, 784806895, 861099181, 793599418, 583494227 };
        int goal = 568022875;
        assertEquals(0, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case26() {
        int[] numbers = { 873489428, 183416836, 933225247, 605773996, 339951784, 537673864, 864546674, 878190600, 622414902, 289669712, 507675130, 273440940, 71600834, 218965105, 717092117, 459351570, 863958917, 907127289 };
        int goal = 878666940;
        assertEquals(1, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case27() {
        int[] numbers = { 787106, 794824393, 432498940, 4524672, 327714, 880834007, 1903234, 134745250, 135531552, 135857314, 289655489, 355873959, 293353013, 515665780, 1116192, 265218, 5573120, 810183189 };
        int goal = 140316322;
        assertEquals(2, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case28() {
        int[] numbers = { 201523612, 255746029, 37142548, 303185926, 9437188, 36700208, 268582944, 304529458, 278265856, 36077600, 304496662, 303169574, 3424262, 42074132, 43434020, 896243228, 41959440 };
        int goal = 313966646;
        assertEquals(4, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case29() {
        int[] numbers = { 999211135, 433773221, 482044170, 820097540, 184977891, 730109131, 815883022, 106991648, 309415701, 617840716, 70343733, 775278463 };
        int goal = 376296895;
        assertEquals(0, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case30() {
        int[] numbers = { 551021845, 833724846, 708342593, 13216, 413501017, 281113001, 431828254, 110335187, 884874972, 404005282 };
        int goal = 420983730;
        assertEquals(0, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case31() {
        int[] numbers = { 1851520, 5899553, 80888865, 13649313, 9831456, 9700481, 77070496, 80495616, 77480353, 10230580, 79708161, 13894912, 76038145, 68943905, 13107360, 845424063 };
        int goal = 81675681;
        assertEquals(4, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case32() {
        int[] numbers = { 99738153, 384603625, 267324929, 888225076, 536872220, 10519752, 438956745, 536906896, 10488388, 806389765, 996931469 };
        int goal = 547393500;
        assertEquals(1, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case33() {
        int[] numbers = { 148505097, 9968138, 279901165, 21364808, 420616778, 242240217, 237647409, 553785931, 286923275, 510683631, 262666, 403177473 };
        int goal = 970857035;
        assertEquals(1, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case34() {
        int[] numbers = { 1728546, 134217768, 2443272, 145306112, 30524285, 108088394, 146604098, 378376805, 3424362, 701741823, 143022144, 3549698, 136124928, 482492234, 476880904 };
        int goal = 146766442;
        assertEquals(3, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case35() {
        int[] numbers = { 55834219, 39338052, 35246144, 138530884, 172756992, 768842501, 5247040, 169660484, 685826797, 36737092 };
        int goal = 176017476;
        assertEquals(1, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case36() {
        int[] numbers = { 356816896, 88134401, 332422313, 81017006, 153022226, 530665286, 244120130, 109906088, 942432034, 612434039, 352595712, 23072768 };
        int goal = 358940417;
        assertEquals(1, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case37() {
        int[] numbers = { 788296620, 417303771, 176231689, 333819356, 610016834, 544990723, 234120575, 922284117, 151878394, 153616523, 42587531, 649437857, 53072898, 112218950, 911426102, 709761536, 841559829, 779556521, 143152138 };
        int goal = 195679627;
        assertEquals(2, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case38() {
        int[] numbers = { 276846850, 347218560, 524174827, 746238065, 57897412, 586709014, 338846722, 755319712, 91358243, 757001330 };
        int goal = 347242379;
        assertEquals(0, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case39() {
        int[] numbers = { 503, 505, 152, 435, 491, 512, 1023, 355, 510, 500, 502, 255, 63, 508, 509, 511, 60, 250, 254, 346 };
        int goal = 510;
        assertEquals(5, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case40() {
        int[] numbers = { 503, 505, 152, 435, 491, 512, 1023, 355, 510, 500, 502, 255, 63, 508, 509, 511, 60, 250, 254, 346 };
        int goal = 510;
        assertEquals(5, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case41() {
        int[] numbers = { 1, 2, 4 };
        int goal = 7;
        assertEquals(1, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case42() {
        int[] numbers = { 1000, 1, 2, 4 };
        int goal = 7;
        assertEquals(1, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case43() {
        int[] numbers = { 7 };
        int goal = 7;
        assertEquals(1, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case44() {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int goal = 7;
        assertEquals(2, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case45() {
        int[] numbers = { 5, 2, 4, 52, 62, 9, 8, 3, 1, 11, 6 };
        int goal = 11;
        assertEquals(3, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case46() {
        int[] numbers = { 12, 14 };
        int goal = 15;
        assertEquals(0, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case47() {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 25, 26, 27, 28 };
        int goal = 28;
        assertEquals(1, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case48() {
        int[] numbers = { 501, 505, 152, 435, 491, 510, 15, 502, 63, 509, 511, 60, 250, 254, 1, 7, 62, 255 };
        int goal = 510;
        assertEquals(2, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case49() {
        int[] numbers = { 5, 2, 1, 3, 6, 4 };
        int goal = 8;
        assertEquals(0, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case50() {
        int[] numbers = { 12345678, 2345678, 987654, 66666666, 66666660, 66666669, 66660666, 60666666, 66666866, 62666666, 63666666, 66666966, 66666996, 66666688, 66666600, 66666000, 66666888, 66666999, 66666222, 66667777 };
        int goal = 45345565;
        assertEquals(0, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case51() {
        int[] numbers = { 8 };
        int goal = 14;
        assertEquals(0, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case52() {
        int[] numbers = { 1 };
        int goal = 7;
        assertEquals(0, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case53() {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int goal = 21;
        assertEquals(3, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case54() {
        int[] numbers = { 9, 5, 1 };
        int goal = 14;
        assertEquals(0, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case55() {
        int[] numbers = { 3, 7 };
        int goal = 1;
        assertEquals(0, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case56() {
        int[] numbers = { 1, 2, 4, 7, 13 };
        int goal = 7;
        assertEquals(2, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case57() {
        int[] numbers = { 1546, 5465461, 4565461, 456451, 1546456, 1456546, 1456, 1676, 154664, 15446, 1455676, 154645, 1, 145646, 7671, 1556746, 5465, 15464565, 1546546, 1000000 };
        int goal = 1;
        assertEquals(1, orsolitairediv2.getMinimum(numbers, goal));
    }

    @Test
    public void case58() {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int goal = 1000000000;
        assertEquals(0, orsolitairediv2.getMinimum(numbers, goal));
    }

}
