package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class BankLotteryTest {
    double DELTA = 1.0e-09;
    BankLottery banklottery = new BankLottery();

    @Test
    public void case1() {
        int[] accountBalance = { 100, 100 };
        int weeklyJackpot = 100;
        int weekCount = 2;
        assertEquals(200.0, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 200.0);
    }

    @Test
    public void case2() {
        int[] accountBalance = { 2, 2, 2 };
        int weeklyJackpot = 1;
        int weekCount = 2;
        assertEquals(2.6666666666666665, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 2.6666666666666665);
    }

    @Test
    public void case3() {
        int[] accountBalance = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int weeklyJackpot = 100;
        int weekCount = 20;
        assertEquals(37.36363636363636, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 37.36363636363636);
    }

    @Test
    public void case4() {
        int[] accountBalance = { 0, 200, 200, 0, 300, 300, 600 };
        int weeklyJackpot = 3;
        int weekCount = 776;
        assertEquals(0.0, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA);
    }

    @Test
    public void case5() {
        int[] accountBalance = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int weeklyJackpot = 1;
        int weekCount = 1000;
        assertEquals(63.5, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 63.5);
    }

    @Test
    public void case6() {
        int[] accountBalance = { 1, 100 };
        int weeklyJackpot = 100;
        int weekCount = 1000;
        assertEquals(991.09900990099, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 991.09900990099);
    }

    @Test
    public void case7() {
        int[] accountBalance = { 1, 0 };
        int weeklyJackpot = 3;
        int weekCount = 789;
        assertEquals(2368.0, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 2368.0);
    }

    @Test
    public void case8() {
        int[] accountBalance = { 91609, 99034, 57486, 66963, 20912, 22937, 70238, 77187 };
        int weeklyJackpot = 283;
        int weekCount = 813;
        assertEquals(133233.64918853162, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 133233.64918853162);
    }

    @Test
    public void case9() {
        int[] accountBalance = { 86073, 769 };
        int weeklyJackpot = 574;
        int weekCount = 1;
        assertEquals(86641.91713686926, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 86641.91713686926);
    }

    @Test
    public void case10() {
        int[] accountBalance = { 72744, 20973, 10106, 22274, 79560, 92181 };
        int weeklyJackpot = 399;
        int weekCount = 812;
        assertEquals(151874.88011603622, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 151874.88011603622);
    }

    @Test
    public void case11() {
        int[] accountBalance = { 40832, 73970, 55327, 42687, 3328, 87546, 72037, 15960, 6732, 9680, 95387, 61281, 59718, 56342, 58328, 94553, 86113, 91198, 80611, 95908, 80529, 81116, 64574, 37448, 78082, 89648, 26608, 58791, 26686, 46577, 88187, 36873, 89793, 28930 };
        int weeklyJackpot = 998;
        int weekCount = 767;
        assertEquals(56294.4601569225, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 56294.4601569225);
    }

    @Test
    public void case12() {
        int[] accountBalance = { 52003, 97545, 73128, 64331, 21393, 72606, 50113, 94943, 38974, 50632, 25344, 25015, 17425, 32203, 75740, 88258, 76730, 40345, 35172, 22229, 63998, 50240, 97267, 71923, 29574, 7261, 71838 };
        int weeklyJackpot = 918;
        int weekCount = 149;
        assertEquals(56921.3562407086, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 56921.3562407086);
    }

    @Test
    public void case13() {
        int[] accountBalance = { 38723, 87300, 32586 };
        int weeklyJackpot = 98;
        int weekCount = 779;
        assertEquals(57361.23153793291, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 57361.23153793291);
    }

    @Test
    public void case14() {
        int[] accountBalance = { 31077, 912, 5813, 48038, 17249, 6404, 69510, 87374, 72576 };
        int weeklyJackpot = 35;
        int weekCount = 457;
        assertEquals(32543.506020008674, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 32543.506020008674);
    }

    @Test
    public void case15() {
        int[] accountBalance = { 73072, 12100, 79712, 80138, 89491, 87638, 52059, 54127, 79247, 70755, 56373, 49755, 1985, 77329, 40203, 7194, 14116, 8863, 36911, 64287, 35166 };
        int weeklyJackpot = 495;
        int weekCount = 246;
        assertEquals(81383.81960933041, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 81383.81960933041);
    }

    @Test
    public void case16() {
        int[] accountBalance = { 22646, 48493, 20099, 10904, 8370, 94540, 51677, 46577, 21712, 66136, 25736, 25336, 1626, 21758, 83031, 5827, 84794, 32464, 82517, 56977, 12743, 15328, 37319, 8012, 8440, 80690, 27843, 74326, 16821, 1191, 49346, 29021, 61953, 39414, 80009, 29810, 78533, 62828, 69732, 77445, 99518, 74934, 16983, 47279, 40409, 81797, 17705 };
        int weeklyJackpot = 270;
        int weekCount = 425;
        assertEquals(23913.222474445894, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 23913.222474445894);
    }

    @Test
    public void case17() {
        int[] accountBalance = { 4791, 6075 };
        int weeklyJackpot = 928;
        int weekCount = 180;
        assertEquals(78441.71231363887, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 78441.71231363887);
    }

    @Test
    public void case18() {
        int[] accountBalance = { 92491, 52918, 35418, 11114, 72933, 77677, 88336, 87811, 32872, 91832, 28849, 44429, 64746 };
        int weeklyJackpot = 33;
        int weekCount = 351;
        assertEquals(93861.98490835984, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 93861.98490835984);
    }

    @Test
    public void case19() {
        int[] accountBalance = { 91702, 18158, 23665, 34677, 10804, 69996, 32487, 11702, 34358, 12463, 5890, 6881, 2432, 31533, 94283, 36567, 81863, 77475, 67990, 95628, 20022, 3581, 23964, 73496, 55489, 79181, 50335, 63969, 57378, 9266, 69665, 20622, 42729, 44419, 53908, 43114, 6747, 12904, 2956, 24983, 54588, 56468, 65607 };
        int weeklyJackpot = 698;
        int weekCount = 833;
        assertEquals(121724.69815112518, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 121724.69815112518);
    }

    @Test
    public void case20() {
        int[] accountBalance = { 24607, 12611, 97953, 28424, 61372, 85382, 62236, 55855, 48642, 20223, 28836, 40037, 59734, 87041, 9478, 7482, 31725, 87806 };
        int weeklyJackpot = 244;
        int weekCount = 749;
        assertEquals(29901.141687974723, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 29901.141687974723);
    }

    @Test
    public void case21() {
        int[] accountBalance = { 7040, 22912, 14988, 61123, 31791, 84134, 95831, 45126, 64687, 81169, 39352, 45983, 81827, 69665, 67481, 84564, 86170, 62310, 53710, 23914, 13123, 72659, 64803, 38511, 22244, 83745, 72218, 34586, 4734, 81975, 45493, 61878, 8209, 4532, 56958 };
        int weeklyJackpot = 849;
        int weekCount = 786;
        assertEquals(9665.33386608697, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 9665.33386608697);
    }

    @Test
    public void case22() {
        int[] accountBalance = { 28551, 30838, 52972, 73156, 22323, 2734, 4952, 14929, 32918, 55695, 28936, 76977, 7958, 88027, 65289, 91899, 59301, 97118, 32291, 30705, 56618, 33288, 66910, 93132, 4904, 7079, 82278, 28463, 82087, 91952, 37226, 59584, 43653, 40219, 13888, 78603, 71382, 28058, 64189 };
        int weeklyJackpot = 300;
        int weekCount = 729;
        assertEquals(31870.421322409125, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 31870.421322409125);
    }

    @Test
    public void case23() {
        int[] accountBalance = { 93914, 96921, 62998, 75625, 3042, 86251, 21817 };
        int weeklyJackpot = 796;
        int weekCount = 944;
        assertEquals(254091.84663434475, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 254091.84663434475);
    }

    @Test
    public void case24() {
        int[] accountBalance = { 80434, 67623, 36027, 47068, 5610, 57280, 17484, 49648, 7523, 55507 };
        int weeklyJackpot = 857;
        int weekCount = 429;
        assertEquals(150145.27429727206, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 150145.27429727206);
    }

    @Test
    public void case25() {
        int[] accountBalance = { 53025, 91484, 93306, 54497, 4533, 32972 };
        int weeklyJackpot = 948;
        int weekCount = 841;
        assertEquals(181202.552097072, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 181202.552097072);
    }

    @Test
    public void case26() {
        int[] accountBalance = { 51301, 22272, 33511, 75581, 9901, 57339, 17617, 89750, 56114, 6335, 16188, 84365, 25627, 72784, 28026, 61579, 30900, 34874, 88663, 61351, 70008, 85579, 18168, 79019, 14595, 99171, 37274, 92708, 70910, 95782, 88153, 22944, 2603 };
        int weeklyJackpot = 321;
        int weekCount = 761;
        assertEquals(58668.38302178964, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 58668.38302178964);
    }

    @Test
    public void case27() {
        int[] accountBalance = { 91300, 29536, 22129, 95818, 54688, 52269, 48316, 15024, 43011 };
        int weeklyJackpot = 495;
        int weekCount = 402;
        assertEquals(131486.1284564391, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 131486.1284564391);
    }

    @Test
    public void case28() {
        int[] accountBalance = { 48596, 292 };
        int weeklyJackpot = 769;
        int weekCount = 906;
        assertEquals(741148.6416298478, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 741148.6416298478);
    }

    @Test
    public void case29() {
        int[] accountBalance = { 3488, 275 };
        int weeklyJackpot = 253;
        int weekCount = 866;
        assertEquals(206574.32048897157, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 206574.32048897157);
    }

    @Test
    public void case30() {
        int[] accountBalance = { 19702, 189 };
        int weeklyJackpot = 8;
        int weekCount = 556;
        assertEquals(24107.73606153537, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 24107.73606153537);
    }

    @Test
    public void case31() {
        int[] accountBalance = { 5215, 436 };
        int weeklyJackpot = 934;
        int weekCount = 895;
        assertEquals(776649.2505751194, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 776649.2505751194);
    }

    @Test
    public void case32() {
        int[] accountBalance = { 15961, 486 };
        int weeklyJackpot = 471;
        int weekCount = 326;
        assertEquals(164969.7983218824, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 164969.7983218824);
    }

    @Test
    public void case33() {
        int[] accountBalance = { 36036, 309 };
        int weeklyJackpot = 263;
        int weekCount = 220;
        assertEquals(93404.08254230293, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 93404.08254230293);
    }

    @Test
    public void case34() {
        int[] accountBalance = { 45937, 68 };
        int weeklyJackpot = 566;
        int weekCount = 281;
        assertEquals(204747.9140745571, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 204747.9140745571);
    }

    @Test
    public void case35() {
        int[] accountBalance = { 51051, 44 };
        int weeklyJackpot = 983;
        int weekCount = 677;
        assertEquals(715968.9184068892, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 715968.9184068892);
    }

    @Test
    public void case36() {
        int[] accountBalance = { 99637, 90 };
        int weeklyJackpot = 646;
        int weekCount = 470;
        assertEquals(402982.9939635204, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 402982.9939635204);
    }

    @Test
    public void case37() {
        int[] accountBalance = { 98755, 390 };
        int weeklyJackpot = 280;
        int weekCount = 318;
        assertEquals(187444.74935700238, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 187444.74935700238);
    }

    @Test
    public void case38() {
        int[] accountBalance = { 42461, 486 };
        int weeklyJackpot = 699;
        int weekCount = 58;
        assertEquals(82544.21563787924, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 82544.21563787924);
    }

    @Test
    public void case39() {
        int[] accountBalance = { 75416, 165 };
        int weeklyJackpot = 437;
        int weekCount = 760;
        assertEquals(406810.9526997526, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 406810.9526997526);
    }

    @Test
    public void case40() {
        int[] accountBalance = { 84981, 455 };
        int weeklyJackpot = 464;
        int weekCount = 176;
        assertEquals(166210.08825319537, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 166210.08825319537);
    }

    @Test
    public void case41() {
        int[] accountBalance = { 17369, 401 };
        int weeklyJackpot = 375;
        int weekCount = 451;
        assertEquals(182677.5045019696, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 182677.5045019696);
    }

    @Test
    public void case42() {
        int[] accountBalance = { 66992, 376 };
        int weeklyJackpot = 290;
        int weekCount = 116;
        assertEquals(100444.24557653486, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 100444.24557653486);
    }

    @Test
    public void case43() {
        int[] accountBalance = { 97255, 212 };
        int weeklyJackpot = 438;
        int weekCount = 845;
        assertEquals(466559.97553017945, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 466559.97553017945);
    }

    @Test
    public void case44() {
        int[] accountBalance = { 91255, 217 };
        int weeklyJackpot = 483;
        int weekCount = 834;
        assertEquals(493121.38107836276, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 493121.38107836276);
    }

    @Test
    public void case45() {
        int[] accountBalance = { 20870, 360 };
        int weeklyJackpot = 282;
        int weekCount = 586;
        assertEquals(183319.7993405558, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 183319.7993405558);
    }

    @Test
    public void case46() {
        int[] accountBalance = { 40696, 242 };
        int weeklyJackpot = 131;
        int weekCount = 577;
        assertEquals(115836.17665738435, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 115836.17665738435);
    }

    @Test
    public void case47() {
        int[] accountBalance = { 13647, 138 };
        int weeklyJackpot = 382;
        int weekCount = 911;
        assertEquals(358165.1932535364, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 358165.1932535364);
    }

    @Test
    public void case48() {
        int[] accountBalance = { 53568, 0, 0, 0, 0 };
        int weeklyJackpot = 559;
        int weekCount = 882;
        assertEquals(546606.0, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 546606.0);
    }

    @Test
    public void case49() {
        int[] accountBalance = { 28716, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int weeklyJackpot = 919;
        int weekCount = 594;
        assertEquals(574602.0, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 574602.0);
    }

    @Test
    public void case50() {
        int[] accountBalance = { 37183, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int weeklyJackpot = 296;
        int weekCount = 293;
        assertEquals(123911.0, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 123911.0);
    }

    @Test
    public void case51() {
        int[] accountBalance = { 54287, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int weeklyJackpot = 469;
        int weekCount = 297;
        assertEquals(193580.0, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 193580.0);
    }

    @Test
    public void case52() {
        int[] accountBalance = { 24769, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int weeklyJackpot = 671;
        int weekCount = 475;
        assertEquals(343494.0, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 343494.0);
    }

    @Test
    public void case53() {
        int[] accountBalance = { 53004, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int weeklyJackpot = 555;
        int weekCount = 763;
        assertEquals(476469.0, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 476469.0);
    }

    @Test
    public void case54() {
        int[] accountBalance = { 81060, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int weeklyJackpot = 555;
        int weekCount = 593;
        assertEquals(410175.0, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 410175.0);
    }

    @Test
    public void case55() {
        int[] accountBalance = { 39045, 0, 0, 0, 0, 0, 0, 0, 0 };
        int weeklyJackpot = 895;
        int weekCount = 956;
        assertEquals(894665.0, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 894665.0);
    }

    @Test
    public void case56() {
        int[] accountBalance = { 10675, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int weeklyJackpot = 214;
        int weekCount = 685;
        assertEquals(157265.0, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 157265.0);
    }

    @Test
    public void case57() {
        int[] accountBalance = { 57676, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int weeklyJackpot = 614;
        int weekCount = 463;
        assertEquals(341958.0, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 341958.0);
    }

    @Test
    public void case58() {
        int[] accountBalance = { 0, 280, 693, 807, 779, 736, 829, 797, 583, 848, 303, 948, 385, 998, 686, 200, 103, 601, 390, 526, 118, 409, 629, 888, 750, 857, 528, 920, 654, 916, 253, 880, 436, 432, 650, 588, 439, 293, 296, 955, 354, 91, 900, 412 };
        int weeklyJackpot = 326;
        int weekCount = 97;
        assertEquals(0.0, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA);
    }

    @Test
    public void case59() {
        int[] accountBalance = { 0, 935, 746, 125, 793, 235, 581, 559, 121, 606, 931, 695, 362, 938, 829, 310, 777, 121, 712, 474, 719, 619, 542, 754, 55, 921, 893, 74, 983, 169, 478, 526, 427, 844, 470, 711, 215, 281, 46, 363, 99, 571, 256, 201 };
        int weeklyJackpot = 542;
        int weekCount = 955;
        assertEquals(0.0, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA);
    }

    @Test
    public void case60() {
        int[] accountBalance = { 0, 433, 474, 872, 532, 808, 833, 379, 191, 358, 173, 381, 13, 228, 141 };
        int weeklyJackpot = 442;
        int weekCount = 180;
        assertEquals(0.0, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA);
    }

    @Test
    public void case61() {
        int[] accountBalance = { 0, 31, 881 };
        int weeklyJackpot = 511;
        int weekCount = 239;
        assertEquals(0.0, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA);
    }

    @Test
    public void case62() {
        int[] accountBalance = { 0, 1000, 348, 750, 217, 969, 126, 366, 479, 543, 337, 738, 728, 204, 840, 209, 366, 454, 997, 369, 609, 542, 482, 552, 908, 272, 521, 75, 81, 601, 744, 552, 338, 204, 927, 840, 125, 248, 258, 491, 98, 893, 540, 36, 77, 840, 307, 408, 241, 205 };
        int weeklyJackpot = 549;
        int weekCount = 488;
        assertEquals(0.0, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA);
    }

    @Test
    public void case63() {
        int[] accountBalance = { 0, 994, 391, 198, 89, 323, 670, 471, 151, 248, 908, 429, 798, 59, 613, 375, 107, 197, 588, 124, 601, 555, 876, 810, 520, 901, 469, 393, 690, 164, 234, 589, 307, 542, 685, 836, 465, 260, 431, 929, 603, 624, 985, 622, 723, 655, 34, 554, 174, 317 };
        int weeklyJackpot = 425;
        int weekCount = 95;
        assertEquals(0.0, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA);
    }

    @Test
    public void case64() {
        int[] accountBalance = { 0, 129, 586, 453, 456, 295, 919, 399, 13 };
        int weeklyJackpot = 599;
        int weekCount = 419;
        assertEquals(0.0, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA);
    }

    @Test
    public void case65() {
        int[] accountBalance = { 0, 156, 603, 833, 434, 722, 406, 843, 680, 941, 738, 958, 147, 688, 203, 521, 392, 295, 552, 798, 663, 377, 497, 322, 697, 962, 110, 54, 710, 940, 368, 542, 140, 821, 901, 57, 762, 327, 842, 587, 539, 447, 998, 376, 47, 392, 265 };
        int weeklyJackpot = 972;
        int weekCount = 996;
        assertEquals(0.0, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA);
    }

    @Test
    public void case66() {
        int[] accountBalance = { 0, 587, 416, 571, 42, 294, 581, 391, 31, 85, 76, 142, 68, 497, 822, 715, 266, 8, 173, 114, 367, 712, 31, 393, 844, 777, 114, 928, 49, 305, 459, 231, 67, 354, 233, 6, 400 };
        int weeklyJackpot = 306;
        int weekCount = 356;
        assertEquals(0.0, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA);
    }

    @Test
    public void case67() {
        int[] accountBalance = { 0, 790, 809, 328, 166, 661, 900, 478, 521, 615, 122, 199, 121, 78, 628, 421, 557, 121, 161, 31, 626, 86, 584, 638, 458, 247, 524, 18, 682, 513, 255, 850, 166, 599, 834, 747, 337 };
        int weeklyJackpot = 400;
        int weekCount = 572;
        assertEquals(0.0, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA);
    }

    @Test
    public void case68() {
        int[] accountBalance = { 98272, 98572, 99578, 99528, 98224, 99355, 99076, 97884, 98157, 99336, 99365, 98561, 98848, 99302, 98197, 98577, 99452, 98016, 99352, 99219, 98683, 99609, 98593, 99747, 98136, 99799, 99199, 99365, 98770, 98029, 99322, 99199, 98463, 98060, 99929, 99076, 99017, 99314, 98449, 99057, 97796, 97857, 98229, 98511, 99334, 99960, 98041, 98098, 98369, 99218 };
        int weeklyJackpot = 243;
        int weekCount = 265;
        assertEquals(99552.47296493393, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 99552.47296493393);
    }

    @Test
    public void case69() {
        int[] accountBalance = { 99691, 98990, 98013, 98879, 98815, 98995, 99778, 98064, 98435, 99867, 98883, 98432, 99785, 98946, 98276, 99103, 99096, 98566, 98391, 99260, 99489, 99742, 98080, 98699, 98090, 99517, 99002, 98346, 98402, 97841, 98924, 99901, 99655, 99450, 99954, 99333, 97847, 98063, 99484, 98805, 99342, 98240, 98074, 98042, 98093, 99457, 99269, 98895, 98083, 98145 };
        int weeklyJackpot = 797;
        int weekCount = 24;
        assertEquals(100076.81249558677, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 100076.81249558677);
    }

    @Test
    public void case70() {
        int[] accountBalance = { 99786, 99789, 98174, 99109, 98807, 99470, 99423, 98080, 97970, 99713, 99763, 98063, 97941, 98687, 98340, 99163, 99259, 98038, 98966, 97833, 98946, 99180, 99754, 99705, 99756, 99372, 97853, 98987, 99603, 99810, 99191, 99872, 98508, 99603, 98170, 99390, 98124, 98576, 97786, 99496, 99784, 99314, 97926, 97974, 98854, 98217, 99299, 99634, 98759, 99541 };
        int weeklyJackpot = 983;
        int weekCount = 422;
        assertEquals(108152.8550438436, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 108152.8550438436);
    }

    @Test
    public void case71() {
        int[] accountBalance = { 97972, 97909, 99191, 99304, 98751, 98078, 99257, 98925, 98331, 98514, 99846, 99281, 98896, 98993, 98965, 97949, 98126, 98762, 99571, 98205, 98361, 99019, 97826, 98626, 99524, 98951, 99524, 99528, 99851, 99003, 98446, 98923, 98845, 99582, 99616, 98271, 99628, 98357, 98988, 98070, 98073, 99462, 99364, 97850, 99931, 99175, 98531, 99572, 99731, 98997 };
        int weeklyJackpot = 204;
        int weekCount = 585;
        assertEquals(100336.66666976779, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 100336.66666976779);
    }

    @Test
    public void case72() {
        int[] accountBalance = { 98755, 99017, 97896, 98136, 98117, 99445, 99269, 99424, 99776, 98239, 99403, 98661, 98813, 99457, 98285, 98088, 98227, 99777, 99589, 98875, 98826, 98895, 98774, 99213, 98536, 98600, 99810, 98376, 98622, 98888, 98029, 99992, 99263, 99016, 97827, 99689, 99464, 97866, 99167, 98290, 98423, 99539, 98844, 99167, 99607, 99553, 99241, 99268, 98253 };
        int weeklyJackpot = 233;
        int weekCount = 803;
        assertEquals(102567.60163605663, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 102567.60163605663);
    }

    @Test
    public void case73() {
        int[] accountBalance = { 99911, 98118, 99134, 98686, 98058, 97911, 99802, 99155, 97928, 98564, 99237, 98139, 99122, 98309, 99112, 98602, 98374, 97856, 99611, 98509, 98045, 97851, 99079, 97887, 98459, 98608, 99028, 99675, 98405, 99762, 97875, 97827, 98471, 99717, 98604, 98826, 98337, 99062, 99009, 98864, 99079, 98685, 99891, 97930, 98113, 98195, 98571, 99347, 99464, 98439 };
        int weeklyJackpot = 895;
        int weekCount = 965;
        assertEquals(117395.57632683942, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 117395.57632683942);
    }

    @Test
    public void case74() {
        int[] accountBalance = { 98200, 98534, 99535, 98010, 99329, 99109, 97872, 98884, 98769, 98016, 99184, 98994, 98329, 99004, 99396, 98663, 98222, 99863, 99033, 98512, 99013, 98794, 98314, 99742, 99023, 98789, 97935, 97834, 99103, 99765, 99253, 97787, 99551, 98133, 98326, 99442, 98182, 98246, 99072, 98039, 97809, 99466, 98749, 98009, 98461, 99140, 97937, 99996, 98205, 99316 };
        int weeklyJackpot = 651;
        int weekCount = 689;
        assertEquals(107121.9202214188, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 107121.9202214188);
    }

    @Test
    public void case75() {
        int[] accountBalance = { 99763, 99928, 98184, 99652, 97871, 99347, 98425, 99533, 98838, 99806, 99638, 98382, 97931, 99293, 98133, 98210, 97997, 99409, 98942, 98906, 98393, 98589, 97811, 99782, 99712, 98550, 98512, 99864, 99096, 98415, 97954, 98952, 99545, 98599, 98546, 98094, 97883, 98391, 98924, 99968, 98222, 98767, 99891, 99570, 99806, 99779, 97814, 98516, 99744 };
        int weeklyJackpot = 814;
        int weekCount = 98;
        assertEquals(101405.28147681008, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 101405.28147681008);
    }

    @Test
    public void case76() {
        int[] accountBalance = { 99207, 98121, 98972, 99150, 99764, 98133, 99279, 98089, 97885, 98278, 98565, 97887, 99099, 98625, 99808, 98809, 99232, 99784, 99300, 99623, 98920, 98908, 99326, 99569, 99506, 99368, 99957, 99699, 99072, 99819, 99455, 98711, 99265, 97991, 98713, 98398, 98481, 98988, 99810, 99134, 99275, 99211, 99030, 98270, 98153, 98816, 99485, 97882, 99014 };
        int weeklyJackpot = 110;
        int weekCount = 192;
        assertEquals(99639.02529735026, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 99639.02529735026);
    }

    @Test
    public void case77() {
        int[] accountBalance = { 99239, 98361, 97880, 99931, 98402, 98813, 99532, 99714, 99141, 98027, 98578, 98109, 98432, 99677, 98398, 98195, 98931, 99585, 98845, 98265, 98265, 98721, 99471, 99827, 98283, 98274, 99788, 98602, 99768, 99195, 99102, 99581, 98294, 98660, 97853, 99986, 98550, 99592, 98526, 97852, 98300, 98821, 98964, 98289, 98959, 98148, 98211, 98453, 98627, 98167 };
        int weeklyJackpot = 418;
        int weekCount = 688;
        assertEquals(105017.19100806935, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 105017.19100806935);
    }

    @Test
    public void case78() {
        int[] accountBalance = { 99827, 98396, 98222, 98695, 99461, 98072, 99991, 99629, 99693, 98447, 98974, 98751, 98259, 99781, 99953, 99212, 99064, 99779, 99523, 98988, 98536, 97863, 98437, 99158, 99333, 98152, 98732, 98354, 99491, 98600, 99076, 98710, 99311, 98469, 99311, 99818, 99627, 99186, 98795, 99273, 100000, 99189, 99301, 98307, 98091, 98774, 99552, 98212, 98393, 98234 };
        int weeklyJackpot = 213;
        int weekCount = 969;
        assertEquals(103990.26227368669, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 103990.26227368669);
    }

    @Test
    public void case79() {
        int[] accountBalance = { 99675, 99332, 98869, 98353, 98131, 99128, 98493, 98990, 99774, 98676, 98021, 99015, 98613, 98476, 98923, 99228, 99747, 98232, 99670, 99688, 98625, 98500, 99442, 98989, 99718, 99902, 99316, 97991, 98188, 98731, 98251, 98276, 98340, 99463, 98513, 98624, 98562, 98917, 98526, 98613, 98149, 99290, 99646, 98627, 99355, 99955, 98165, 97928, 99305, 99894 };
        int weeklyJackpot = 553;
        int weekCount = 135;
        assertEquals(101179.85043990346, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 101179.85043990346);
    }

    @Test
    public void case80() {
        int[] accountBalance = { 99718, 99506, 98361, 98096, 97945, 97795, 98326, 99059, 98859, 98302, 99051, 98783, 99327, 98129, 99276, 98431, 99944, 98512, 98401, 98293, 98364, 98246, 98893, 98283, 99006, 98983, 99201, 98091, 97900, 98303, 97793, 99317, 98089, 99923, 98520, 97818, 99357, 98236, 98014, 98506, 98324, 99425, 99082, 98559, 99248, 97996, 99615, 99705, 98848, 98886 };
        int weeklyJackpot = 7;
        int weekCount = 433;
        assertEquals(99779.2496457192, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 99779.2496457192);
    }

    @Test
    public void case81() {
        int[] accountBalance = { 98245, 99931, 99656, 98154, 98672, 98450, 98291, 99875, 99524, 98421, 99179, 99090, 98984, 97795, 99350, 98056, 98623, 97947, 98953, 98937, 98052, 98486, 98913, 98698, 98779, 98780, 97807, 97928, 99614, 98297, 99619, 99172, 99924, 98344, 99169, 98272, 99569, 98602, 98757, 99431, 98352, 98838, 99178, 98420, 99813, 98871, 99432, 99164, 98244, 99260 };
        int weeklyJackpot = 147;
        int weekCount = 273;
        assertEquals(99042.80160152394, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 99042.80160152394);
    }

    @Test
    public void case82() {
        int[] accountBalance = { 98102, 98533, 97891, 98347, 98210, 98609, 99611, 99495, 98202, 98285, 98480, 98517, 99734, 97797, 98527, 98826, 98852, 98373, 99979, 98202, 99025, 98758, 98884, 99500, 99143, 99963, 98018, 99463, 99049, 99996, 99150, 99457, 98728, 99934, 99407, 98380, 98270, 98157, 99164, 98824, 99297, 98196, 98819, 99376, 99766, 99562, 98174, 98117, 99426 };
        int weeklyJackpot = 206;
        int weekCount = 306;
        assertEquals(99378.47062373892, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 99378.47062373892);
    }

    @Test
    public void case83() {
        int[] accountBalance = { 98357, 99920, 99928, 99481, 99097, 99190, 99704, 98098, 98651, 98572, 99950, 99281, 98401, 98232, 98741, 99268, 98513, 99902, 98055, 99575, 98152, 99564, 99280, 99768, 99245, 98777, 97806, 98509, 99108, 99284, 99552, 98723, 99483, 99572, 99888, 98210, 98834, 98327, 98790, 99985, 99077, 99952, 98642, 98240, 98967, 98413, 99605, 98746, 99018 };
        int weeklyJackpot = 306;
        int weekCount = 606;
        assertEquals(102115.71828668217, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 102115.71828668217);
    }

    @Test
    public void case84() {
        int[] accountBalance = { 99539, 97941, 97803, 99226, 99285, 99887, 98941, 99778, 99392, 98311, 99377, 99090, 99813, 99861, 99816, 98614, 99850, 97986, 98716, 97997, 98872, 99944, 98407, 99128, 98614, 99549, 98251, 99534, 97952, 98038, 99210, 99257, 99586, 97896, 98720, 98903, 97825, 97980, 98933, 98234, 99593, 98077, 98182, 98342, 98480, 98106, 98626, 98980, 99204, 98612 };
        int weeklyJackpot = 888;
        int weekCount = 253;
        assertEquals(104063.82041528386, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 104063.82041528386);
    }

    @Test
    public void case85() {
        int[] accountBalance = { 98902, 99881, 99539, 99750, 99566, 99117, 99244, 98445, 97839, 99149, 98046, 98856, 98445, 99017, 98818, 98820, 98591, 98737, 98168, 98527, 98737, 99978, 98382, 98541, 99120, 98092, 98629, 99608, 97911, 97972, 99124, 98097, 98222, 99260, 99381, 99401, 98748, 99755, 99029, 99442, 98589, 98771, 98412, 98262, 98515, 99667, 98713, 98744, 97862, 98470 };
        int weeklyJackpot = 826;
        int weekCount = 862;
        assertEquals(113154.37084242498, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 113154.37084242498);
    }

    @Test
    public void case86() {
        int[] accountBalance = { 98368, 99872, 98641, 98811, 98487, 99777, 99889, 97972, 99459, 97880, 99375, 99349, 99681, 99992, 98753, 99637, 99505, 98193, 98334, 99660, 99136, 98301, 99370, 98798, 98661, 99513, 99658, 98772, 99034, 99405, 97977, 99623, 98344, 99345, 98031, 98928, 98417, 98601, 98712, 97941, 98273, 98211, 98420, 97854, 99704, 99787, 99701, 98657, 98406 };
        int weeklyJackpot = 986;
        int weekCount = 88;
        assertEquals(100128.84506752847, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 100128.84506752847);
    }

    @Test
    public void case87() {
        int[] accountBalance = { 98871, 98585, 97901, 98856, 98701, 98970, 98735, 98307, 99061, 99807, 99612, 98923, 98169, 97847, 99654, 99204, 99536, 99929, 97809, 99496, 98018, 98766, 98274, 99190, 99192, 98619, 98601, 98222, 98173, 98506, 99084, 99648, 97953, 99701, 99648, 98386, 98903, 99366, 98220, 98273, 99175, 98761, 97851, 98763, 98015, 99843, 98985, 98800, 99626, 97912 };
        int weeklyJackpot = 867;
        int weekCount = 86;
        assertEquals(100363.17661924113, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 100363.17661924113);
    }

    @Test
    public void case88() {
        int[] accountBalance = { 3, 4, 1, 4, 3 };
        int weeklyJackpot = 350;
        int weekCount = 457;
        assertEquals(31993.0, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 31993.0);
    }

    @Test
    public void case89() {
        int[] accountBalance = { 3, 1 };
        int weeklyJackpot = 5;
        int weekCount = 809;
        assertEquals(3036.75, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 3036.75);
    }

    @Test
    public void case90() {
        int[] accountBalance = { 3, 4, 3, 2, 4 };
        int weeklyJackpot = 866;
        int weekCount = 360;
        assertEquals(58458.0, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 58458.0);
    }

    @Test
    public void case91() {
        int[] accountBalance = { 1, 4, 4, 3, 1 };
        int weeklyJackpot = 292;
        int weekCount = 722;
        assertEquals(16218.230769230771, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 16218.230769230771);
    }

    @Test
    public void case92() {
        int[] accountBalance = { 2, 5 };
        int weeklyJackpot = 596;
        int weekCount = 692;
        assertEquals(117839.71428571428, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 117839.71428571428);
    }

    @Test
    public void case93() {
        int[] accountBalance = { 1, 2, 2, 2, 4 };
        int weeklyJackpot = 288;
        int weekCount = 859;
        assertEquals(22491.18181818182, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 22491.18181818182);
    }

    @Test
    public void case94() {
        int[] accountBalance = { 2, 2, 1 };
        int weeklyJackpot = 429;
        int weekCount = 292;
        assertEquals(50109.200000000004, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 50109.200000000004);
    }

    @Test
    public void case95() {
        int[] accountBalance = { 2, 1, 3 };
        int weeklyJackpot = 500;
        int weekCount = 396;
        assertEquals(66002.0, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 66002.0);
    }

    @Test
    public void case96() {
        int[] accountBalance = { 5, 5, 5, 2, 4, 5 };
        int weeklyJackpot = 484;
        int weekCount = 601;
        assertEquals(55944.23076923077, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 55944.23076923077);
    }

    @Test
    public void case97() {
        int[] accountBalance = { 5, 4 };
        int weeklyJackpot = 719;
        int weekCount = 666;
        assertEquals(266035.0, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 266035.0);
    }

    @Test
    public void case98() {
        int[] accountBalance = { 4, 3 };
        int weeklyJackpot = 668;
        int weekCount = 923;
        assertEquals(352326.2857142857, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 352326.2857142857);
    }

    @Test
    public void case99() {
        int[] accountBalance = { 1, 1, 2 };
        int weeklyJackpot = 424;
        int weekCount = 777;
        assertEquals(82363.0, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 82363.0);
    }

    @Test
    public void case100() {
        int[] accountBalance = { 5, 5, 3, 4, 2, 4 };
        int weeklyJackpot = 999;
        int weekCount = 47;
        assertEquals(10212.173913043478, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 10212.173913043478);
    }

    @Test
    public void case101() {
        int[] accountBalance = { 1, 2, 1, 1, 5 };
        int weeklyJackpot = 888;
        int weekCount = 669;
        assertEquals(59408.200000000004, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 59408.200000000004);
    }

    @Test
    public void case102() {
        int[] accountBalance = { 1, 4, 1, 1 };
        int weeklyJackpot = 824;
        int weekCount = 896;
        assertEquals(105473.0, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 105473.0);
    }

    @Test
    public void case103() {
        int[] accountBalance = { 5, 2, 4, 3 };
        int weeklyJackpot = 523;
        int weekCount = 272;
        assertEquals(50810.71428571428, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 50810.71428571428);
    }

    @Test
    public void case104() {
        int[] accountBalance = { 3, 5, 3 };
        int weeklyJackpot = 690;
        int weekCount = 671;
        assertEquals(126272.99999999999, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 126272.99999999999);
    }

    @Test
    public void case105() {
        int[] accountBalance = { 5, 2, 2 };
        int weeklyJackpot = 730;
        int weekCount = 266;
        assertEquals(107882.7777777778, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 107882.7777777778);
    }

    @Test
    public void case106() {
        int[] accountBalance = { 4, 1, 2, 1 };
        int weeklyJackpot = 562;
        int weekCount = 880;
        assertEquals(247284.0, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 247284.0);
    }

    @Test
    public void case107() {
        int[] accountBalance = { 4, 1, 1, 2, 5 };
        int weeklyJackpot = 163;
        int weekCount = 17;
        assertEquals(856.6153846153846, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 856.6153846153846);
    }

    @Test
    public void case108() {
        int[] accountBalance = { 4, 2, 2 };
        int weeklyJackpot = 1;
        int weekCount = 4;
        assertEquals(6.0, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 6.0);
    }

    @Test
    public void case109() {
        int[] accountBalance = { 1, 5, 4, 3, 3 };
        int weeklyJackpot = 3;
        int weekCount = 1;
        assertEquals(1.1875, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 1.1875);
    }

    @Test
    public void case110() {
        int[] accountBalance = { 1, 4, 1 };
        int weeklyJackpot = 2;
        int weekCount = 5;
        assertEquals(2.6666666666666665, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 2.6666666666666665);
    }

    @Test
    public void case111() {
        int[] accountBalance = { 4, 2, 5 };
        int weeklyJackpot = 5;
        int weekCount = 1;
        assertEquals(5.818181818181818, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 5.818181818181818);
    }

    @Test
    public void case112() {
        int[] accountBalance = { 2, 3, 1, 2, 4 };
        int weeklyJackpot = 4;
        int weekCount = 4;
        assertEquals(4.666666666666666, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 4.666666666666666);
    }

    @Test
    public void case113() {
        int[] accountBalance = { 2, 1, 3, 1, 1, 4 };
        int weeklyJackpot = 1;
        int weekCount = 1;
        assertEquals(2.1666666666666665, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 2.1666666666666665);
    }

    @Test
    public void case114() {
        int[] accountBalance = { 1, 3, 4, 1, 1 };
        int weeklyJackpot = 5;
        int weekCount = 5;
        assertEquals(3.5, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 3.5);
    }

    @Test
    public void case115() {
        int[] accountBalance = { 1, 5, 2, 2, 4, 2 };
        int weeklyJackpot = 1;
        int weekCount = 2;
        assertEquals(1.125, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 1.125);
    }

    @Test
    public void case116() {
        int[] accountBalance = { 5, 5, 4, 3, 2, 2 };
        int weeklyJackpot = 4;
        int weekCount = 1;
        assertEquals(5.9523809523809526, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 5.9523809523809526);
    }

    @Test
    public void case117() {
        int[] accountBalance = { 2, 4, 2, 3, 2 };
        int weeklyJackpot = 1;
        int weekCount = 4;
        assertEquals(2.6153846153846154, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 2.6153846153846154);
    }

    @Test
    public void case118() {
        int[] accountBalance = { 4, 3 };
        int weeklyJackpot = 5;
        int weekCount = 2;
        assertEquals(9.714285714285714, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 9.714285714285714);
    }

    @Test
    public void case119() {
        int[] accountBalance = { 2, 4, 3, 5 };
        int weeklyJackpot = 4;
        int weekCount = 2;
        assertEquals(3.142857142857143, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 3.142857142857143);
    }

    @Test
    public void case120() {
        int[] accountBalance = { 2, 2, 5, 2 };
        int weeklyJackpot = 1;
        int weekCount = 4;
        assertEquals(2.7272727272727275, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 2.7272727272727275);
    }

    @Test
    public void case121() {
        int[] accountBalance = { 5, 2, 5 };
        int weeklyJackpot = 3;
        int weekCount = 4;
        assertEquals(10.0, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 10.0);
    }

    @Test
    public void case122() {
        int[] accountBalance = { 5, 5, 3, 3, 1 };
        int weeklyJackpot = 2;
        int weekCount = 3;
        assertEquals(6.764705882352941, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 6.764705882352941);
    }

    @Test
    public void case123() {
        int[] accountBalance = { 2, 1, 3 };
        int weeklyJackpot = 4;
        int weekCount = 5;
        assertEquals(8.666666666666666, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 8.666666666666666);
    }

    @Test
    public void case124() {
        int[] accountBalance = { 2, 4 };
        int weeklyJackpot = 4;
        int weekCount = 4;
        assertEquals(7.333333333333333, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 7.333333333333333);
    }

    @Test
    public void case125() {
        int[] accountBalance = { 5, 5, 1, 3, 2, 3 };
        int weeklyJackpot = 2;
        int weekCount = 1;
        assertEquals(5.526315789473684, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 5.526315789473684);
    }

    @Test
    public void case126() {
        int[] accountBalance = { 5, 3, 3, 1 };
        int weeklyJackpot = 3;
        int weekCount = 4;
        assertEquals(10.0, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 10.0);
    }

    @Test
    public void case127() {
        int[] accountBalance = { 2, 4, 3, 1, 4 };
        int weeklyJackpot = 5;
        int weekCount = 4;
        assertEquals(4.857142857142857, banklottery.expectedAmount(accountBalance, weeklyJackpot, weekCount), DELTA * 4.857142857142857);
    }

}
