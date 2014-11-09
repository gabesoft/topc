package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class RollingDiceDivOneTest {
    RollingDiceDivOne rollingdicedivone = new RollingDiceDivOne();

    @Test
    public void case1() {
        int[] dice = { 6, 6, 8 };
        assertEquals(11L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case2() {
        int[] dice = { 10 };
        assertEquals(1L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case3() {
        int[] dice = { 2, 3, 4, 5 };
        assertEquals(9L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case4() {
        int[] dice = { 1, 10, 1 };
        assertEquals(3L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case5() {
        int[] dice = { 382828264, 942663792, 291832707, 887961277, 546603677, 545185615, 146267547, 6938117, 167567032, 84232402, 700781193, 452172304, 816532384, 951089120, 448136091, 280899512, 256093435, 39595226, 631504901, 154772240 };
        assertEquals(4366828428L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case6() {
        int[] dice = { 3, 1, 8, 1, 1, 3 };
        assertEquals(10L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case7() {
        int[] dice = { 8434477, 3643302, 7333514, 1881060, 8496626, 7162470, 1991420, 109224, 9112133, 2730336, 737834, 1980326, 9325661, 660889, 5497958, 7237794, 5801384, 568748, 1292605, 3072591, 4579712, 1695225, 3920841, 7703497, 7585676, 3293817, 3236499, 9695036, 1388854, 3415474, 6167458, 862242, 7883204, 2092229, 8034980, 158625062 };
        assertEquals(158625097L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case8() {
        int[] dice = { 7035704, 8492338, 7943035, 6968290, 3149526, 8777974, 1630767, 5627683, 9158620, 51011, 3796725, 6403123, 8681654, 5230820, 8771917, 8459186, 2384424, 4548511, 2795347, 1391980, 8647611, 8826584, 1401780, 427718, 3156546, 133758850 };
        assertEquals(133758875L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case9() {
        int[] dice = { 10, 16, 8, 5, 2, 1, 6, 2, 2, 1, 9, 13, 13, 10, 14, 9, 9, 1, 7, 15, 3, 2, 2, 14, 2, 12, 4, 10, 9, 13, 5, 16, 10, 11, 10, 7, 5, 8, 7 };
        assertEquals(171L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case10() {
        int[] dice = { 1507343, 631083, 7538859, 98296, 9892695, 4103193, 6825281, 8611108, 9569651, 1345594, 6090929, 6748442, 1903974, 5747325, 5280508, 4742705, 9306346, 2896264, 8739346, 6457664, 5735812, 8686801, 4161782, 903422, 8756675, 1105868, 9723277, 8194313, 5579668, 3543486, 6634249, 3105922, 6346949, 7593393, 8003308, 6640085, 202751580 };
        assertEquals(202751616L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case11() {
        int[] dice = { 9591318, 2177523, 2742162, 2696002, 1480455, 4762843, 7628323, 6529534, 3523766, 237642, 1798974, 850218, 9772483, 9951579, 4943559, 9612649, 9887424, 2601088, 1110580, 9181324, 37937, 192734, 9917020, 9949313, 5621298, 9257796, 916328, 6296793, 2985144, 9936841, 5146854, 4108532, 914927, 6935682, 594044, 9262028, 3688515, 1277789, 1525945, 3307482, 3139963, 2487966, 330503, 5455912, 3681023, 208047770 };
        assertEquals(208047815L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case12() {
        int[] dice = { 1, 1, 3, 7, 8, 5, 8, 8, 3, 8, 5, 4, 5, 7, 1, 7, 2, 1, 6, 1, 1, 1, 3, 3, 1 };
        assertEquals(62L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case13() {
        int[] dice = { 600023, 2364769, 5021623, 4544332, 3092497, 1135927, 16759166 };
        assertEquals(16759172L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case14() {
        int[] dice = { 762681672, 279100644, 354373797, 112997939 };
        assertEquals(746472381L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case15() {
        int[] dice = { 3197, 3243, 1465, 2394, 1564, 3573, 1709, 3974, 172, 2779, 2265, 1501, 2775, 3653, 2840, 2928, 532, 3106, 594, 974, 389, 1510, 957, 3542, 3594, 331, 1812, 1901, 2368, 3539, 209, 3976, 2837, 1885, 308, 3035 };
        assertEquals(38733L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case16() {
        int[] dice = { 4, 15, 5, 6, 13, 1, 10, 2 };
        assertEquals(32L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case17() {
        int[] dice = { 163350384, 45915387, 40766987, 16787655, 728703, 696857, 69988, 75435, 8556, 3956, 4985, 325, 206, 374, 62, 36, 22, 1, 2, 2, 1, 1, 268409904, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(268409947L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case18() {
        int[] dice = { 851857, 619043, 83936, 320044, 997291, 622725, 583397, 340654, 846748, 465214, 690687, 916962, 885808, 674853, 463622, 559267603, 173556, 192097, 709003, 722812, 346890, 840492, 648817, 994842, 207245, 502458, 659942, 947485 };
        assertEquals(16308481L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case19() {
        int[] dice = { 25797199, 17802965, 1164027, 79371, 41209, 14343, 6476, 745, 30, 222, 899, 85, 18, 5, 1, 1, 1, 44907581, 1, 1, 1, 1, 1 };
        assertEquals(44907603L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case20() {
        int[] dice = { 4816509, 4292316, 8859095, 8870045, 3551529, 2132211, 6048361, 3543614, 1569375, 8066805, 3887117, 4437682, 5190355, 5014635, 9575653, 9704382, 6538219, 2258732, 7666198, 463091, 7312714, 7106848, 4957795, 497600, 3174521, 2045599, 8617447, 1500705, 141699127 };
        assertEquals(141699154L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case21() {
        int[] dice = { 154223884, 548163314, 7381068, 161805, 158022, 710193397, 103384, 1852, 25 };
        assertEquals(710193355L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case22() {
        int[] dice = { 7235518, 2730738, 838580, 7453598, 4701657, 4775792, 1362049, 6260693, 7597158, 6526021, 7937072, 3227867, 9403716, 359062, 8579441, 5359536, 8988272, 5468299, 6628605, 9630422, 226522, 6833590, 122124186 };
        assertEquals(122124208L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case23() {
        int[] dice = { 622671180, 105054, 233447, 625958, 885091, 562228, 288384, 62942, 907920, 151449, 277000, 625957, 329242, 643003, 877137, 739002, 120764, 31176, 409900, 177695, 491905, 65317, 142871, 520361, 479176, 300936, 997076, 434598, 813671, 786867, 503509, 564138, 648748, 300238, 141842, 228024, 477887, 464351 };
        assertEquals(16414865L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case24() {
        int[] dice = { 796072, 26512845, 308030, 417115, 402781, 622391, 332061, 534505, 952768, 913532, 37064, 69105, 618203, 451803, 520641, 364733, 795737, 110630, 451027, 99546, 190018, 844274, 557599, 420575, 32338, 394664, 164229, 972493, 800564, 282872, 494443, 862226, 803616, 287022, 422445, 775784, 491150, 793180, 208481, 115483, 847765, 15095, 425989, 652007, 172581, 650110, 820936 };
        assertEquals(22295684L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case25() {
        int[] dice = { 536213, 2499697, 8246442, 1851530, 7771440, 8257456, 7777672, 8151357, 4701354, 3603456, 6689331, 4066184, 5017654, 6350453, 143233, 3682005, 1075628, 6857319, 4708709, 7660450, 3055109, 613243, 9853237, 3850909, 3025890, 5215051, 9437446, 9039191, 2027078, 8306097, 154070804 };
        assertEquals(154070834L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case26() {
        int[] dice = { 706477088, 202587452, 41434996, 36696012, 9337, 101641, 13120, 19898, 28, 5, 5, 2, 1, 1, 1, 1, 1, 1, 1, 1, 987339573, 1 };
        assertEquals(987339594L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case27() {
        int[] dice = { 123270, 615763767, 877873, 659964, 244110, 641561, 182546, 65717, 451223, 185889, 691764, 831887, 276381 };
        assertEquals(5232186L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case28() {
        int[] dice = { 608, 872, 945, 153, 476, 225, 164, 129, 676, 965, 197, 883, 778, 923, 596, 862, 926, 228, 280, 604, 852, 828, 50, 599, 171, 96, 799, 41, 947, 779, 407, 819, 902, 370, 741, 184, 570, 470, 555, 369, 230, 401, 328, 654, 852 };
        assertEquals(12274L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case29() {
        int[] dice = { 388329, 957024, 792902, 415072, 405142074, 166273, 915559, 601449, 349113, 715206, 397335, 508127, 427276, 597648, 907848, 442688, 583511, 63378, 897602, 970886, 578202, 513964, 217233, 694346, 672870, 134616, 718540 };
        assertEquals(14626998L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case30() {
        int[] dice = { 43976, 72924, 9750, 235735, 228447, 109317, 70170, 204435, 90339, 192947, 124998, 218758, 117518, 259897, 44302, 130226, 190989, 124556, 140152, 230881, 68069, 8603, 9964, 52134 };
        assertEquals(1489555L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case31() {
        int[] dice = { 756358086, 3349876, 14266538, 32842585, 1791640, 4057731, 1071472, 73964, 814609048, 10613, 461713, 9330, 274410, 30396, 9868, 817, 9, 7, 5, 4, 3 };
        assertEquals(814609068L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case32() {
        int[] dice = { 8, 110, 443, 518, 479, 970, 199, 526, 450, 146, 608, 177 };
        assertEquals(2323L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case33() {
        int[] dice = { 453745503, 57268701, 10468709, 529155003, 3337401, 1698269, 1402834, 415559, 381343, 317121, 26351, 69666, 19748, 3226, 381 };
        assertEquals(529154813L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case34() {
        int[] dice = { 373671830, 145718657, 847123763, 195886231, 58105329, 38998721, 20517833, 388781, 3454699, 2156040 };
        assertEquals(838898122L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case35() {
        int[] dice = { 30, 46, 32, 61, 20, 56, 10, 45, 36, 60, 24 };
        assertEquals(215L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case36() {
        int[] dice = { 356526993 };
        assertEquals(1L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case37() {
        int[] dice = { 1948, 90, 319, 263, 1113, 691, 613, 1798, 735, 1037, 1840, 1315, 1671, 2023 };
        assertEquals(7735L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case38() {
        int[] dice = { 332989, 457513, 931032, 507231, 338347, 55418, 105808, 939772879, 74343, 860358, 427568, 429412, 825074, 515206, 46742, 957784, 867574, 965123, 141706, 566624, 535472, 625328, 115896, 328218, 314616, 1203, 322376, 358754, 138734, 795396, 175836, 823427, 441475, 316846, 608357, 7818, 769377, 644659, 776546, 967991 };
        assertEquals(18474178L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case39() {
        int[] dice = { 302861, 50982, 719886, 63078, 295497, 59074, 120616, 822636, 971119, 468102, 848265, 938938, 799551, 269718, 509279, 169166, 803207, 777905, 17337, 430702, 282002, 602739, 250903310, 800321 };
        assertEquals(11122982L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case40() {
        int[] dice = { 6800278, 6448778, 8634603, 9804385, 9125398, 2834433, 1991823, 9619525, 3416313, 8556048, 9427495, 8674547, 7064538, 8243239, 5824648, 6369955, 4849695, 7203644, 5555028, 2913222, 5377727, 4320866, 4024583, 1700408, 560931, 2372741, 1891505, 5475202, 1853098, 9569088, 7305534, 3706952, 7766855, 189283053 };
        assertEquals(189283086L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case41() {
        int[] dice = { 775204, 133679, 483777, 681499435, 208296, 398520, 889917, 950459, 420047, 180336, 543611, 95316, 931345, 3163, 116476 };
        assertEquals(6130147L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case42() {
        int[] dice = { 648573014, 15169618, 16440902, 21652537, 152432, 128526, 312, 808, 978, 4965, 12, 533, 353, 60, 49, 12, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 702125096, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(702125142L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case43() {
        int[] dice = { 278772524, 106387404, 646959, 13975719, 416100725, 16007587, 128779 };
        assertEquals(415918973L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case44() {
        int[] dice = { 11414395, 691176, 14828624, 3858065, 11160209, 97841, 526486, 348740, 5392595, 12865376, 3151752, 5781446, 13591661, 10030765, 14198212, 4370183, 8657902, 7263124, 11511853, 15607334, 8181704, 3246948, 16181062, 1998391, 1612312, 4067342, 10039234, 15012127, 11751285, 5762178, 2976084, 14901377, 10073338 };
        assertEquals(130575577L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case45() {
        int[] dice = { 431630, 913198, 182109, 304352, 756863, 583316, 155048, 345616, 850165, 646119, 363085, 182341, 350764, 213525, 229102, 344426, 830194, 890250, 530987, 593089, 325802, 131434, 848703, 656053, 699132220, 959418, 377849, 973964 };
        assertEquals(13969403L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case46() {
        int[] dice = { 5432340, 3481963, 4635686, 5848349, 6658664, 23669, 2770327, 6319467, 7428337, 5925419, 2923326, 2464489, 6785589, 3781353, 2769149, 8005505, 3586749, 1786477, 341218, 411379 };
        assertEquals(40689737L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case47() {
        int[] dice = { 959603, 228324, 102856, 824811, 857627, 720592, 433019, 632941, 546400, 997492, 227930, 395289, 787083, 607393, 84414, 834, 292086, 349549, 157178, 520307, 837063, 129566, 131430, 365997, 183221834, 8834, 351047, 704011, 447338, 987356, 784156, 151751, 318988, 720761 };
        assertEquals(15664027L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case48() {
        int[] dice = { 1074057, 4169760, 9594646, 121133, 8524294, 3787303, 6318510, 6538406, 1781553, 2894114, 1161747, 3138046, 1501721, 768759, 1439382, 5215862, 8520490, 4325197, 70874964 };
        assertEquals(70874981L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case49() {
        int[] dice = { 194, 90, 116, 87, 114, 252, 220, 79, 165, 32 };
        assertEquals(679L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case50() {
        int[] dice = { 304486692, 113925193 };
        assertEquals(113925194L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case51() {
        int[] dice = { 2001, 710, 669, 1454, 973, 39, 1371, 1952, 1301, 1821, 1942, 1957, 625, 433, 1612, 1761, 1343, 441, 712, 429, 839, 1541, 1564, 595, 2000, 48, 1551, 1252, 488, 153, 171, 648, 686, 438, 1927, 1915, 2008, 1148, 1151, 1554, 1222, 463, 735, 750, 403, 1592, 134, 664, 121, 1839 };
        assertEquals(26598L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case52() {
        int[] dice = { 7579326, 1097992, 8039808, 2733066, 9320030, 5916346, 6883172, 1905335, 4940250, 8445752, 5599700, 5320284, 8215564, 9796887, 227099, 7347825, 292516, 5546609, 3518658, 2449956, 3424795, 6219345, 42900, 1951641, 8893906, 5374024, 7582667, 1460306, 4000583, 6960412, 4109017, 5718186, 1337842, 4761760, 4021460, 7201148, 8912834, 6260767, 9047038, 2041185, 204497952 };
        assertEquals(204497992L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case53() {
        int[] dice = { 1, 3, 2, 3, 3, 2, 1, 2, 1, 1 };
        assertEquals(14L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case54() {
        int[] dice = { 4468644, 4684344, 8607611, 9911514, 8516230, 534494, 2241626, 8511326, 9386864, 4387891, 6378783, 9501466, 6649493, 6686051, 1614298, 5818223, 5824002, 8624056, 6188225, 3070452, 5259615, 7900492, 7675898, 5447410, 7258565, 2208984, 2323334, 5175048, 8595894, 9826986, 183277791 };
        assertEquals(183277820L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case55() {
        int[] dice = { 37, 168, 61, 77, 168, 129, 1, 66, 79, 139, 119, 107, 121, 63, 43, 120, 176, 181, 117, 244, 46, 84, 193, 193, 60, 128, 208, 184, 144, 101, 253, 208, 57, 32, 55, 169, 114, 22, 225, 255, 67, 8, 102, 219, 48 };
        assertEquals(2718L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case56() {
        int[] dice = { 144888112, 86703353, 541930872, 198408782, 71228343, 14338780, 23158865, 2880163, 51174, 265877, 1606, 4416, 777, 451, 74, 18, 81, 7, 9 };
        assertEquals(541930889L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case57() {
        int[] dice = { 1 };
        assertEquals(1L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case58() {
        int[] dice = { 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000 };
        assertEquals(25000000025L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case59() {
        int[] dice = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1000000000 };
        assertEquals(50L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case60() {
        int[] dice = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(50L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case61() {
        int[] dice = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 1000000000 };
        assertEquals(1226L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case62() {
        int[] dice = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1000000000, 1000000000 };
        assertEquals(1000000049L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case63() {
        int[] dice = { 1, 1, 1, 65293, 90522, 37892, 1, 18705, 812833957, 1, 90151, 11757, 24098, 16011, 89242, 79490, 63239, 1, 13767, 73858, 8315, 773998465, 26574, 1, 7141, 65376, 13116, 7997, 53510, 83628, 73837, 1, 1, 45603, 1159, 96112, 62744, 66258, 55594, 37627, 66599, 14667, 61381, 1, 45059, 1, 1, 27147, 87426, 29433 };
        assertEquals(775708806L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case64() {
        int[] dice = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1000000000 };
        assertEquals(13L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case65() {
        int[] dice = { 888, 3, 4, 5, 6 };
        assertEquals(19L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case66() {
        int[] dice = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456, 536870912 };
        assertEquals(536870912L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case67() {
        int[] dice = { 1, 1, 2, 2, 2, 2, 8, 10, 12, 80 };
        assertEquals(41L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case68() {
        int[] dice = { 1, 1, 2, 2, 6, 6, 6, 1000000000 };
        assertEquals(25L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case69() {
        int[] dice = { 1, 1, 3, 6, 4, 3, 4, 3, 20 };
        assertEquals(26L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case70() {
        int[] dice = { 3, 10, 23 };
        assertEquals(14L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case71() {
        int[] dice = { 2, 4 };
        assertEquals(3L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case72() {
        int[] dice = { 100000000, 90000000, 10000 };
        assertEquals(90010001L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case73() {
        int[] dice = { 6, 6, 8 };
        assertEquals(11L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case74() {
        int[] dice = { 2, 10, 100 };
        assertEquals(13L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case75() {
        int[] dice = { 3, 10, 1, 4, 2 };
        assertEquals(11L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case76() {
        int[] dice = { 1, 2, 100, 3 };
        assertEquals(7L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case77() {
        int[] dice = { 2, 2, 10 };
        assertEquals(5L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case78() {
        int[] dice = { 1, 1, 2, 100, 1000000 };
        assertEquals(105L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case79() {
        int[] dice = { 2, 10, 2 };
        assertEquals(5L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case80() {
        int[] dice = { 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 100000000 };
        assertEquals(49000001L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case81() {
        int[] dice = { 1000, 1000000, 1000000000 };
        assertEquals(1001001L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case82() {
        int[] dice = { 123, 1234, 2345 };
        assertEquals(1358L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case83() {
        int[] dice = { 2, 3, 4, 5, 6, 7, 8, 33 };
        assertEquals(36L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case84() {
        int[] dice = { 50, 2, 2, 2, 2, 2 };
        assertEquals(11L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case85() {
        int[] dice = { 2, 8, 32 };
        assertEquals(11L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case86() {
        int[] dice = { 2, 8 };
        assertEquals(3L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case87() {
        int[] dice = { 382828264, 942663792, 291832707, 887961277, 546603677, 545185615, 146267547, 6938117, 167567032, 84232402, 700781193, 452172304, 816532384, 951089120, 448136091, 280899512, 256093435, 39595226, 631504901, 154772240 };
        assertEquals(4366828428L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case88() {
        int[] dice = { 1, 2, 7 };
        assertEquals(4L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case89() {
        int[] dice = { 12, 1, 3, 3, 5, 6, 7, 8, 21, 22, 23, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 25, 23, 21, 1000000000 };
        assertEquals(216L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case90() {
        int[] dice = { 1, 1, 1, 2, 10, 100, 1000000000 };
        assertEquals(116L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case91() {
        int[] dice = { 1, 2, 3, 4, 9 };
        assertEquals(11L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case92() {
        int[] dice = { 5, 2, 2 };
        assertEquals(5L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case93() {
        int[] dice = { 2, 2, 100 };
        assertEquals(5L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case94() {
        int[] dice = { 2, 100, 2 };
        assertEquals(5L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case95() {
        int[] dice = { 2, 2, 5 };
        assertEquals(5L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case96() {
        int[] dice = { 4, 2 };
        assertEquals(3L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case97() {
        int[] dice = { 10, 100 };
        assertEquals(11L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case98() {
        int[] dice = { 2, 5, 8 };
        assertEquals(8L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case99() {
        int[] dice = { 2, 10 };
        assertEquals(3L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case100() {
        int[] dice = { 2, 3, 9 };
        assertEquals(6L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case101() {
        int[] dice = { 1, 1, 2, 2, 5, 5, 100 };
        assertEquals(17L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case102() {
        int[] dice = { 10, 2, 1 };
        assertEquals(4L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case103() {
        int[] dice = { 5, 1, 9, 1, 1 };
        assertEquals(9L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case104() {
        int[] dice = { 2, 5 };
        assertEquals(3L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case105() {
        int[] dice = { 2, 9 };
        assertEquals(3L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case106() {
        int[] dice = { 2, 100 };
        assertEquals(3L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case107() {
        int[] dice = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 1000000000 };
        assertEquals(1226L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case108() {
        int[] dice = { 2, 2, 2, 2, 10 };
        assertEquals(9L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case109() {
        int[] dice = { 4, 100 };
        assertEquals(5L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case110() {
        int[] dice = { 2, 2, 3, 10 };
        assertEquals(8L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case111() {
        int[] dice = { 10000, 3, 1, 4, 2 };
        assertEquals(11L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case112() {
        int[] dice = { 1, 2, 100 };
        assertEquals(4L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case113() {
        int[] dice = { 2, 2, 1000000000 };
        assertEquals(5L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case114() {
        int[] dice = { 2, 2, 2, 100 };
        assertEquals(7L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case115() {
        int[] dice = { 2, 3, 7 };
        assertEquals(6L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case116() {
        int[] dice = { 2, 4, 47, 2, 3, 4, 5, 8, 4, 5, 8, 5, 4 };
        assertEquals(55L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case117() {
        int[] dice = { 10, 4, 4 };
        assertEquals(9L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case118() {
        int[] dice = { 1, 1, 1, 2, 2, 10000000 };
        assertEquals(8L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case119() {
        int[] dice = { 10, 2, 2 };
        assertEquals(5L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case120() {
        int[] dice = { 9, 5 };
        assertEquals(6L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case121() {
        int[] dice = { 100, 10, 2 };
        assertEquals(13L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case122() {
        int[] dice = { 6, 3 };
        assertEquals(4L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case123() {
        int[] dice = { 1, 1, 1, 1, 1, 1, 1, 1, 2, 2 };
        assertEquals(11L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case124() {
        int[] dice = { 10, 5 };
        assertEquals(6L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case125() {
        int[] dice = { 2, 11, 23 };
        assertEquals(14L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case126() {
        int[] dice = { 3, 3, 100 };
        assertEquals(7L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case127() {
        int[] dice = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 13, 19 };
        assertEquals(62L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case128() {
        int[] dice = { 21, 21, 21, 10000000 };
        assertEquals(64L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case129() {
        int[] dice = { 2, 7 };
        assertEquals(3L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case130() {
        int[] dice = { 3, 5 };
        assertEquals(4L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case131() {
        int[] dice = { 6, 6, 100000 };
        assertEquals(13L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case132() {
        int[] dice = { 1, 1, 2, 10 };
        assertEquals(5L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case133() {
        int[] dice = { 1000000000, 99999, 99993, 99996, 100000, 99991, 99996, 99992, 99992, 99998, 99996, 99995, 99995, 99999, 99993, 99999, 99999, 99995, 99998, 99993, 99994, 99999, 99996, 99998, 99997, 99998, 99998, 99999, 99994, 99992, 99995, 99993, 99994, 99999, 99992, 99991, 99998, 99993, 99991, 99995, 99996, 99997, 99999, 99998, 99997, 99997, 99996, 99999, 99999, 99997 };
        assertEquals(4899801L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case134() {
        int[] dice = { 1000, 30, 30 };
        assertEquals(61L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case135() {
        int[] dice = { 2, 2 };
        assertEquals(3L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case136() {
        int[] dice = { 6, 2 };
        assertEquals(3L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case137() {
        int[] dice = { 2, 2, 2, 8 };
        assertEquals(7L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case138() {
        int[] dice = { 3, 6, 15, 1, 1 };
        assertEquals(12L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case139() {
        int[] dice = { 2, 2, 2, 2, 2, 2, 2, 1000 };
        assertEquals(15L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case140() {
        int[] dice = { 1, 1 };
        assertEquals(2L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case141() {
        int[] dice = { 2, 6, 1, 3, 1 };
        assertEquals(8L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case142() {
        int[] dice = { 2, 2, 1, 2, 2, 8, 2 };
        assertEquals(12L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case143() {
        int[] dice = { 1, 1, 4, 4 };
        assertEquals(7L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case144() {
        int[] dice = { 3, 15 };
        assertEquals(4L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case145() {
        int[] dice = { 3, 5, 100 };
        assertEquals(9L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case146() {
        int[] dice = { 1, 2, 10 };
        assertEquals(4L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case147() {
        int[] dice = { 1, 2, 9, 2 };
        assertEquals(6L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case148() {
        int[] dice = { 2, 2, 2, 2, 2, 2, 2, 1000, 1 };
        assertEquals(16L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case149() {
        int[] dice = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 1, 1, 1, 1, 1000000000, 1000000000, 1000000000, 1000000000 };
        assertEquals(2000000063L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case150() {
        int[] dice = { 1 };
        assertEquals(1L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case151() {
        int[] dice = { 10, 10, 10, 10, 10 };
        assertEquals(27L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case152() {
        int[] dice = { 10, 2 };
        assertEquals(3L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case153() {
        int[] dice = { 6, 9, 1 };
        assertEquals(8L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case154() {
        int[] dice = { 1, 1, 1, 1, 1, 1, 5 };
        assertEquals(7L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case155() {
        int[] dice = { 2, 2, 2, 2, 2, 9 };
        assertEquals(11L, rollingdicedivone.mostLikely(dice));
    }

    @Test
    public void case156() {
        int[] dice = { 4, 1000000000 };
        assertEquals(5L, rollingdicedivone.mostLikely(dice));
    }

}
