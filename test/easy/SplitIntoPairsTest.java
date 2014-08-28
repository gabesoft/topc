package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class SplitIntoPairsTest {
    SplitIntoPairs splitintopairs = new SplitIntoPairs();

    @Test
    public void case1() {
        int[] A = { 2, -1 };
        int X = -1;
        assertEquals(0, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case2() {
        int[] A = { 1, -1 };
        int X = -1;
        assertEquals(1, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case3() {
        int[] A = { -5, -4, 2, 3 };
        int X = -1;
        assertEquals(2, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case4() {
        int[] A = { 5, -7, 8, -2, -5, 3 };
        int X = -7;
        assertEquals(3, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case5() {
        int[] A = { 3, 4, 5, 6, 6, -6, -4, -10, -1, -9 };
        int X = -2;
        assertEquals(4, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case6() {
        int[] A = { 1000000, 1000000 };
        int X = -5;
        assertEquals(1, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case7() {
        int[] A = { 905, 944, -352, -74, -222, -674, -862, 421, -394, -836, 204, -686, -673, -931, -750, -986, -798, -854, -271, 256, -959, 823, 924, -912, -892, 675, 577, 83, -16, 942, -890, -36, 135, -844, 159, -583, 788, -692, -936, 453, -891, 310, 545, 874, 827, -311, 528, -116, 775, -266 };
        int X = -1000000000;
        assertEquals(25, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case8() {
        int[] A = { 905, 944, -352, -74, -222, -674, -862, 421, -394, -836, 204, -686, -673, -931, -750, -986, -798, -854, -271, 256, -959, 823, 924, -912, -892, 675, 577, 83, -16, 942, -890, -36, 135, -844, 159, -583, 788, -692, -936, 453, -891, 310, 545, 874, 827, -311, 528, -116, 775, -266 };
        int X = -1;
        assertEquals(24, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case9() {
        int[] A = { 905, 944, -352, -74, -222, -674, -862, 421, -394, -836, 204, -686, -673, -931, -750, -986, -798, -854, -271, 256, -959, 823, 924, -912, -892, 675, 577, 83, -16, 942, -890, -36, 135, -844, 159, -583, 788, -692, -936, 453, -891, 310, 545, 874, 827, -311, 528, -116, 775, -266 };
        int X = -1000;
        assertEquals(24, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case10() {
        int[] A = { 905, 944, -352, -74, -222, -674, -862, 421, -394, -836, 204, -686, -673, -931, -750, -986, -798, -854, -271, 256, -959, 823, 924, -912, -892, 675, 577, 83, -16, 942, -890, -36, 135, -844, 159, -583, 788, -692, -936, 453, -891, 310, 545, 874, 827, -311, 528, -116, 775, -266 };
        int X = -5000;
        assertEquals(25, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case11() {
        int[] A = { -2, -4, -4, 3, 0, -4, 0, -3, -4, 2 };
        int X = -1;
        assertEquals(5, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case12() {
        int[] A = { -2, -4, -4, 3, 0, -4, 0, -3, -4, 2 };
        int X = -11;
        assertEquals(5, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case13() {
        int[] A = { -2, -4, -4, 13, -20, -24, -10, -23, -14, 22, 19, 5 };
        int X = -1;
        assertEquals(6, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case14() {
        int[] A = { -2, -4, -4, 13, -20, -24, -10, -23, 14, 22, 19, 5 };
        int X = -1;
        assertEquals(5, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case15() {
        int[] A = { -2, -4, -4, 13, -20, -24, -10, -23, 14, 22, 19, 5 };
        int X = -10;
        assertEquals(6, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case16() {
        int[] A = { -2, -4, -4, 13, -20, -24, -10, -23, 14, 22, 19, 5 };
        int X = -7;
        assertEquals(5, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case17() {
        int[] A = { -2, -4, -4, 13, -20, -24, -10, -23, -14, 22, 19, 5, -14, 12 };
        int X = -10;
        assertEquals(7, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case18() {
        int[] A = { -2, -4, -4, 13, -20, -24, -10, -23, -14, 22, 19, 5, -14, 12 };
        int X = -9;
        assertEquals(6, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case19() {
        int[] A = { -32, -34, -24, 3, -10, -4, -20, -43, -44, 22, 99, 75, -64, -22, -20, 90, 69, 60 };
        int X = -1;
        assertEquals(8, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case20() {
        int[] A = { -32, -34, -24, 3, -10, -4, -20, -43, -44, 22, 99, 75, -64, -22, -20, 90, 69, 60 };
        int X = -12;
        assertEquals(9, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case21() {
        int[] A = { -32, -34, -24, 3, -10, -4, -20, -43, -44, 22, 99, 75, -64, -22, -20, 90, 69, 60 };
        int X = -11;
        assertEquals(8, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case22() {
        int[] A = { -5, -140, 94, -45, -136, -139, 193, 125, -117, 97, -87, -111, 199, 0, 43, 135, -37, 32, -62, 170, -50, -71 };
        int X = -1;
        assertEquals(11, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case23() {
        int[] A = { -5, 140, 94, -45, -136, -139, 193, 125, -117, 97, -87, -111, 199, 0, 43, 135, -37, 32, -62, 170, -50, -71 };
        int X = -1;
        assertEquals(11, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case24() {
        int[] A = { -5, 140, 94, -45, -136, -139, 193, 125, -117, 97, -87, -111, 199, 1, 43, 135, -37, 32, -62, 170, -50, -71 };
        int X = -1;
        assertEquals(10, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case25() {
        int[] A = { -5, 140, 94, -45, -136, -139, 193, 125, -117, 97, -87, -111, 199, 1, 43, 135, -37, 32, -62, 170, -50, -71 };
        int X = -5;
        assertEquals(11, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case26() {
        int[] A = { 10818, -18246, -19725, 16148, -3747, 5706, 7572, 11962, -9647, 17307, -19662, 11369, -8048, 4235, -8840, 1990, 13255, 9267, -1834, 6047, 364, -6426, -18250, -4013, 14223, 14201, 4108, -17517, 12645, -15571 };
        int X = -1;
        assertEquals(14, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case27() {
        int[] A = { 10818, -18246, -19725, 16148, -3747, 5706, 7572, 11962, -9647, 17307, -19662, 11369, -8048, 4235, -8840, 1990, 13255, 9267, -1834, 6047, 364, -6426, -18250, -4013, 14223, 14201, 4108, -17517, 12645, -15571 };
        int X = -1000;
        assertEquals(14, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case28() {
        int[] A = { 10818, -18246, -19725, 16148, -3747, 5706, 7572, 11962, -9647, 17307, -19662, 11369, -8048, 4235, -8840, 1990, 13255, 9267, -1834, 6047, 364, -6426, -18250, -4013, 14223, 14201, 4108, -17517, 12645, -15571 };
        int X = -667576;
        assertEquals(15, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case29() {
        int[] A = { 10818, -18246, -19725, 16148, -3747, 5706, 7572, 11962, -9647, 17307, -19662, 11369, -8048, 4235, -8840, 1990, 13255, 9267, -1834, 6047, 364, -6426, -18250, -4013, 14223, 14201, 4108, -17517, 12645, -15571 };
        int X = -667575;
        assertEquals(14, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case30() {
        int[] A = { -90122, -98566, -79800, 65132, 28130, -48626, 62512, -3265, -58006, 65017, 1742, -15971, 91502, 85961, -7838, -82539, 61065, -25210, -67751, 64007, 34100, -92851, -80892, 25607, 61762, 68730, 81961, 98653, -75609, 7825, -16698, -18369, -641, -77434, -90764, 69934, 41205, -9213, 35087, -81955 };
        int X = -1116622;
        assertEquals(20, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case31() {
        int[] A = { -90122, -98566, -79800, 65132, 28130, -48626, 62512, -3265, -58006, 65017, 1742, -15971, 91502, 85961, -7838, -82539, 61065, -25210, -67751, 64007, 34100, -92851, -80892, 25607, 61762, 68730, 81961, 98653, -75609, 7825, -16698, -18369, -641, -77434, -90764, 69934, 41205, -9213, 35087, -81955 };
        int X = -1116621;
        assertEquals(19, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case32() {
        int[] A = { -7726273, -198566, 9681506, -6792315, -540917, -4861632, -4982458, -1383709, -6158006, 4166470, -6812236, -624690, 5158649, -9032251, -8845697, 4151603, 6274931, -8029271, -5157899, 6663477, -1398145, -4257609, 145272, -5237570, 861762, -4839969, -2853810, 577517, -941855, 707825, -9448768, -438974, -2454848, 9216156, 5254895, -923375, 440146, 3309157, -9364361, 8771003 };
        int X = -2352133;
        assertEquals(19, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case33() {
        int[] A = { -872113403, 614732258, 852780564, -364762495, -766020713, -223899463, -809975595, -171841343, -804547660, 932729055, 698760645, 399517073, 874914195, -851687809, 620595203, -557170078, 85869576, -137114380, -323991217, 210123325, -128394235, 754027517, 548178290, -491028249, 620518046, 963832152, -935735869, 272572641, 480306795, 995021233, -124979841, -286205860, 486682805, -975116828, 220156082, 343182640, 183009133, 406271598, 674094533, -7665256 };
        int X = -1;
        assertEquals(20, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case34() {
        int[] A = { 686014, -140413, 38898, 453373, -2183, 456054, -2401, -5669, 916678, 3197, -9268, 711369, 485555, -2143, -3396, 761990, 514108, -7341, -167232, -138103, -2230, -7733, -673572, -8397, 3714, -8765, 4878, 518458, -139757, 3789, 2291, -333872, -68453, -408540, 6262, 684380, 303765, 2080, -188915, 567204, -270568, -608555, -50681, 865635, 145118, 254393, 2027, 9236, 6614, 749600 };
        int X = -1;
        assertEquals(24, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case35() {
        int[] A = { 686014, -140413, 38898, 453373, -2183, 456054, -2401, -5669, 916678, 3197, -9268, 711369, 485555, -2143, -3396, 761990, 514108, -7341, -167232, -138103, -2230, -7733, -673572, -8397, 3714, -8765, 4878, 518458, -139757, 3789, 2291, -333872, -68453, -408540, 6262, 684380, 303765, 2080, -188915, 567204, -270568, -608555, -50681, 865635, 145118, 254393, 2027, 9236, 6614, 749600 };
        int X = -4343861;
        assertEquals(25, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case36() {
        int[] A = { 686014, -140413, 38898, 453373, -2183, 456054, -2401, -5669, 916678, 3197, -9268, 711369, 485555, -2143, -3396, 761990, 514108, -7341, -167232, -138103, -2230, -7733, -673572, -8397, 3714, -8765, 4878, 518458, -139757, 3789, 2291, -333872, -68453, -408540, 6262, 684380, 303765, 2080, -188915, 567204, -270568, -608555, -50681, 865635, 145118, 254393, 2027, 9236, 6614, 749600 };
        int X = -4343860;
        assertEquals(24, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case37() {
        int[] A = { 686014, -140413, 38898, 453373, -38, 56, 23, -27727, 543192, 40, -90, 668783, -749599, -933398, -54, -52, -508107, -60, -21, -733259, 91, -383323, -726497, 66, 794192, 92, -798387, 514663, -265743, 479453, -231752, 45, -277329, -508343, -185031, 77, 541431, -38, 506315, 49, -330584, -58, 25, 23, 11, 27, 934481, 975269, -899517, 739542 };
        int X = -1;
        assertEquals(25, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case38() {
        int[] A = { 686014, -140413, 38898, 453373, 12, -325555, -117123, -107, 633208, -181, 171, 39, 407808, -770671, 401056, 218102, -170, -893786, -94, 952651, 872501, 17270, -8, -210819, 745846, -60, 568424, 94, -336277, -197, 715750, -35, 991206, -25, 50, 64, 47, 185, -83700, 899759, 772864, 740070, -808846, -195437, -167236, 62, 209115, -975701, -143, -522051 };
        int X = -1;
        assertEquals(24, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case39() {
        int[] A = { 686014, -140413, 38898, 453373, 12, -325555, -117123, -107, 633208, -181, 171, 39, 407808, -770671, 401056, 218102, -170, -893786, -94, 952651, 872501, 17270, -8, -210819, 745846, -60, 568424, 94, -336277, -197, 715750, -35, 991206, -25, 50, 64, 47, 185, -83700, 899759, 772864, 740070, -808846, -195437, -167236, 62, 209115, -975701, -143, -522051 };
        int X = -96;
        assertEquals(25, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case40() {
        int[] A = { 686014, -140413, 38898, 453373, 12, -325555, -117123, -107, 633208, -181, 171, 39, 407808, -770671, 401056, 218102, -170, -893786, -94, 952651, 872501, 17270, -8, -210819, 745846, -60, 568424, 94, -336277, -197, 715750, -35, 991206, -25, 50, 64, 47, 185, -83700, 899759, 772864, 740070, -808846, -195437, -167236, 62, 209115, -975701, -143, -522051 };
        int X = -95;
        assertEquals(24, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case41() {
        int[] A = { -872113403, 614732258, 185, 103478667, -60289383, -89, -151, -107, -144398419, 46, 423704813, 179, 776887394, 40, 327617513, 266244600, -281619614, -134, 850198886, -66, 78, -73479329, -151822892, -35, -21, 147, -684760088, -157, -194, -552331073, -206234363, 398164123, 52, -337961681, -603910935, 776189072, -795765385, 144, 109, 910709347, 494010347, 553900800, 195, -225114223, 532182291, -826578151, -196, -133, -391688045, -107 };
        int X = -1;
        assertEquals(24, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case42() {
        int[] A = { -872113403, 614732258, 185, 103478667, -60289383, -89, -151, -107, -144398419, 46, 423704813, 179, 776887394, 40, 327617513, 266244600, -281619614, -134, 850198886, -66, 78, -73479329, -151822892, -35, -21, 147, -684760088, -157, -194, -552331073, -206234363, 398164123, 52, -337961681, -603910935, 776189072, -795765385, 144, 109, 910709347, 494010347, 553900800, 195, -225114223, 532182291, -826578151, -196, -133, -391688045, -107 };
        int X = -840;
        assertEquals(25, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case43() {
        int[] A = { -872113403, 614732258, 852780564, -364762495, -766020713, -223899463, -809975595, -171841343, -804547660, 932729055, 698760645, 399517073, 874914195, -851687809, 620595203, -557170078, 85869576, -137114380, -323991217, 210123325, -128394235, 754027517, 548178290, -491028249, 620518046, 963832152, -935735869, 272572641, 480306795, 995021233, -124979841, -286205860, 486682805, -975116828, 220156082, 343182640, 183009133, 406271598, 674094533, -7665256, -858260613, -634182631, 99794083, -717654287, -181472121, 219444548, 411507309, 658776668, 495481341, 551580701 };
        int X = -1;
        assertEquals(25, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case44() {
        int[] A = { -872113403, 614732258, 852780564, -364762495, -766020713, -223899463, -809975595, -171841343, -804547660, 932729055, 698760645, 399517073, 874914195, -851687809, 620595203, -557170078, 85869576, -137114380, -323991217, 210123325, -128394235, 754027517, 548178290, -491028249, 620518046, 963832152, -935735869, 272572641, 480306795, 995021233, -124979841, -286205860, 486682805, -975116828, 220156082, 343182640, 183009133, 406271598, -674094533, -7665256, -858260613, -634182631, 99794083, -717654287, -181472121, 219444548, 411507309, 658776668, 495481341, 551580701 };
        int X = -1;
        assertEquals(24, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case45() {
        int[] A = { 872113405, 614732258, 852780564, 364762497, 766020715, 223899465, 809975597, 171841345, 804547662, 932729055, 698760645, 399517073, 874914195, 851687811, 620595203, 557170080, 85869576, 137114382, 323991219, 210123325, 128394237, 754027517, 548178290, 491028251, 620518046, 963832152, 935735871, 272572641, 480306795, 995021233, 124979843, 286205862, 486682805, 975116830, 220156082, 343182640, 183009133, 406271598, 674094533, 7665258, 858260615, 634182633, 99794083, 717654289, 181472123, 219444548, 411507309, 658776668, 495481341, 551580701 };
        int X = -1;
        assertEquals(25, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case46() {
        int[] A = { -872113403, -614732256, -852780562, -364762495, -766020713, -223899463, -809975595, -171841343, -804547660, -932729053, -698760643, -399517071, -874914193, -851687809, -620595201, -557170078, -85869574, -137114380, -323991217, -210123323, -128394235, -754027515, -548178288, -491028249, -620518044, -963832150, -935735869, -272572639, -480306793, -995021231, -124979841, -286205860, -486682803, -975116828, -220156080, -343182638, -183009131, -406271596, -674094531, -7665256, -858260613, -634182631, -99794081, -717654287, -181472121, -219444546, -411507307, -658776666, -495481339, -551580699 };
        int X = -1;
        assertEquals(25, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case47() {
        int[] A = { -32, -34, -4135, -24, -3704, -92, -12, -4871, -9105, -90 };
        int X = -10;
        assertEquals(5, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case48() {
        int[] A = { 34, 36, 4137, 26, 3706, 94, 14, 4873, 9107, 92 };
        int X = -10;
        assertEquals(5, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case49() {
        int[] A = { -2, -4, -4, 3, 0, -4, 0, -3, -4, 2 };
        int X = -5;
        assertEquals(5, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case50() {
        int[] A = { -2, -4, -4, 3, 0, -4, 0, -3, -4, 2 };
        int X = -4;
        assertEquals(5, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case51() {
        int[] A = { -2, -4, -4, 3, 0, -4, 0, -3, -4, 2 };
        int X = -3;
        assertEquals(5, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case52() {
        int[] A = { -2, -4, -4, 1, 7, -4 };
        int X = -2;
        assertEquals(3, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case53() {
        int[] A = { -2, -4, -4, 1, 7, -4 };
        int X = -1;
        assertEquals(3, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case54() {
        int[] A = { -2, -4, -4, 1 };
        int X = -3;
        assertEquals(2, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case55() {
        int[] A = { -2, -4, -4, 1 };
        int X = -2;
        assertEquals(2, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case56() {
        int[] A = { -2, -4, -4, 1 };
        int X = -1;
        assertEquals(1, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case57() {
        int[] A = { -2, -4, -4, -1 };
        int X = -1;
        assertEquals(2, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case58() {
        int[] A = { -2, -4, -4, -1 };
        int X = -2;
        assertEquals(2, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case59() {
        int[] A = { -1000000000, 1000000000 };
        int X = -1;
        assertEquals(0, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case60() {
        int[] A = { 1000000, 1000000 };
        int X = -5;
        assertEquals(1, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case61() {
        int[] A = { 935079839, -92769986, -8306102, -932447057, 638383088, 195430486, 958789404, -200192420, -675779976, -725013656, 487537753, -364506139, -230743714, -244096319, 368979792, 852765943, -65001679, 472328325, -216011660, -898510362, -169670032, -441020563, 973226413, 379801829, 502688843, -824803519, 26035776, 800950205, 701328047, -721376925, -467093076, 169748305, -815788157, 30984110, -852342833, -630393844, -538584544, -620330733, -311495956, -117251797, -962936339, -463922646, -512528244, 533042035, -868756910, 697644624, 199179204, -314796386, 386284667, -942608797 };
        int X = -712510151;
        assertEquals(25, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case62() {
        int[] A = { 1000000000, -1000000000 };
        int X = -5;
        assertEquals(0, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case63() {
        int[] A = { 10000000, -10000000 };
        int X = -1000000000;
        assertEquals(0, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case64() {
        int[] A = { -999999999, 999999999 };
        int X = -999999999;
        assertEquals(0, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case65() {
        int[] A = { 1000000000, 1000000000, 1000000000, -1000000000 };
        int X = -1000000000;
        assertEquals(1, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case66() {
        int[] A = { 1, -1 };
        int X = -2;
        assertEquals(1, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case67() {
        int[] A = { -1000000, 1000000 };
        int X = -5;
        assertEquals(0, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case68() {
        int[] A = { 1000000000, -1000000000 };
        int X = -1;
        assertEquals(0, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case69() {
        int[] A = { -1000000000, 1000000000 };
        int X = -100000000;
        assertEquals(0, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case70() {
        int[] A = { -1000000000, -1000000000, -1000000000, 1000000000, 1000000000, 1000000000, -1000000000, -1000000000, -1000000000, 1000000000, 1000000000, 1000000000, -1000000000, -1000000000, -1000000000, 1000000000, 1000000000, 1000000000, -1000000000, -1000000000, -1000000000, 1000000000, 1000000000, 1000000000, -1000000000, -1000000000, -1000000000, 1000000000, 1000000000, 1000000000, -1000000000, -1000000000, -1000000000, 1000000000, 1000000000, 1000000000, -1000000000, -1000000000, -1000000000, 1000000000, 1000000000, 1000000000, -1000000000, -1000000000, -1000000000, 1000000000, 1000000000, 1000000000, -1000000000, 1000000000 };
        int X = -1;
        assertEquals(24, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case71() {
        int[] A = { 1000000000, -1000000000 };
        int X = -1000000000;
        assertEquals(0, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case72() {
        int[] A = { 1000000000, -1000000000 };
        int X = -10000;
        assertEquals(0, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case73() {
        int[] A = { -1000000000, -1000000000, -1000000000, 1000000000, 1000000000, 1000000000 };
        int X = -10000;
        assertEquals(2, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case74() {
        int[] A = { 1000000000, -1000000000 };
        int X = -2;
        assertEquals(0, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case75() {
        int[] A = { 1330467, -20271450 };
        int X = -1;
        assertEquals(0, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case76() {
        int[] A = { -1000000000, 1000000000 };
        int X = -1000000000;
        assertEquals(0, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case77() {
        int[] A = { 1000000, -1000000 };
        int X = -1;
        assertEquals(0, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case78() {
        int[] A = { -1000000000, -1000000000, 1, 2 };
        int X = -2;
        assertEquals(2, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case79() {
        int[] A = { -1000000000, -1000000000, -1000000000, 240, 360, 480 };
        int X = -1;
        assertEquals(2, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case80() {
        int[] A = { 10, -10 };
        int X = -100;
        assertEquals(1, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case81() {
        int[] A = { -1, -1, 1, 1, 0, 0 };
        int X = -10;
        assertEquals(3, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case82() {
        int[] A = { -66666666, 123 };
        int X = -2;
        assertEquals(0, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case83() {
        int[] A = { 1000000000, 1000000000 };
        int X = -5;
        assertEquals(1, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case84() {
        int[] A = { -1000000000, 1000000000 };
        int X = -500;
        assertEquals(0, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case85() {
        int[] A = { -1000000000, 1000000000 };
        int X = -18;
        assertEquals(0, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case86() {
        int[] A = { 1, 1, -1, -1 };
        int X = -1;
        assertEquals(2, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case87() {
        int[] A = { 1000000000, -1000000000, 999999999, -999999999, 999999998, -999999998 };
        int X = -1;
        assertEquals(2, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case88() {
        int[] A = { 536870912, -40000000 };
        int X = -1;
        assertEquals(0, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case89() {
        int[] A = { 0, -1 };
        int X = -1;
        assertEquals(1, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case90() {
        int[] A = { 0, 0, 0, 0 };
        int X = -1;
        assertEquals(2, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case91() {
        int[] A = { 10000, -300000 };
        int X = -1000000000;
        assertEquals(0, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case92() {
        int[] A = { 0, 0, 0, 0, 0, 0 };
        int X = -10;
        assertEquals(3, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case93() {
        int[] A = { -1000000, 1000000 };
        int X = -1;
        assertEquals(0, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case94() {
        int[] A = { -1000000000, 1000000000 };
        int X = -999999999;
        assertEquals(0, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case95() {
        int[] A = { -1000000000, -1000000000, -1000000000, 1000000000, 1000000000, 1000000000 };
        int X = -1;
        assertEquals(2, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case96() {
        int[] A = { 3, 3, 3, 3, 3, 3, 3, 3 };
        int X = -2;
        assertEquals(4, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case97() {
        int[] A = { 1, -1 };
        int X = -1;
        assertEquals(1, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case98() {
        int[] A = { -10000, 0 };
        int X = -1;
        assertEquals(1, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case99() {
        int[] A = { -10, 8, -4, -1 };
        int X = -20;
        assertEquals(2, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case100() {
        int[] A = { -10000000, 10000000 };
        int X = -1000000000;
        assertEquals(0, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case101() {
        int[] A = { -3, 8 };
        int X = -14;
        assertEquals(0, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case102() {
        int[] A = { -1000000000, 1000000000, 3, 4 };
        int X = -1;
        assertEquals(1, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case103() {
        int[] A = { 1000000000, -1000000000 };
        int X = -99999999;
        assertEquals(0, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case104() {
        int[] A = { -2, -1, 1, 2 };
        int X = -100;
        assertEquals(2, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case105() {
        int[] A = { -2, 0, 3, 1 };
        int X = -1;
        assertEquals(2, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case106() {
        int[] A = { 0, -2, 5, -9, 9, -77 };
        int X = -1;
        assertEquals(3, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case107() {
        int[] A = { -1000000000, 1000000000 };
        int X = -2;
        assertEquals(0, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case108() {
        int[] A = { -10, 501520000 };
        int X = -720232704;
        assertEquals(0, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case109() {
        int[] A = { -3, 4 };
        int X = -7;
        assertEquals(0, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case110() {
        int[] A = { -3, -2, -1, 0, 1, 2, 3, 4 };
        int X = -1;
        assertEquals(4, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case111() {
        int[] A = { 0, 0, 0, -1 };
        int X = -1000;
        assertEquals(2, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case112() {
        int[] A = { -1000000000, -1000000000, -1000000000, 1000000000, 1000000000, 1000000000 };
        int X = -1000000000;
        assertEquals(2, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case113() {
        int[] A = { -1000000000, -1000000000, 1000000000, -1000000000, 1000000000, 1000000000 };
        int X = -1000000000;
        assertEquals(2, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case114() {
        int[] A = { 0, 0 };
        int X = -100;
        assertEquals(1, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case115() {
        int[] A = { -5000000, -2, -1, 5000000, 5000000, 5000000 };
        int X = -10;
        assertEquals(2, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case116() {
        int[] A = { -1000000000, -1000000000 };
        int X = -2;
        assertEquals(1, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case117() {
        int[] A = { -10, -20, 0, 0 };
        int X = -10;
        assertEquals(2, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case118() {
        int[] A = { -1000000000, -1000000000 };
        int X = -1;
        assertEquals(1, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case119() {
        int[] A = { -1000000000, 3 };
        int X = -1;
        assertEquals(0, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case120() {
        int[] A = { 30000, -100000 };
        int X = -1;
        assertEquals(0, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case121() {
        int[] A = { 1000000000, 1000000000, 1000000000, -1000000000 };
        int X = -4;
        assertEquals(1, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case122() {
        int[] A = { -4, -1, 0, 2 };
        int X = -4;
        assertEquals(2, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case123() {
        int[] A = { -1000000000, 3 };
        int X = -10000;
        assertEquals(0, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case124() {
        int[] A = { 0, 0, 0, 1 };
        int X = -1;
        assertEquals(2, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case125() {
        int[] A = { 0, 0, -2, -2 };
        int X = -1;
        assertEquals(2, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case126() {
        int[] A = { 999999999, -999999999 };
        int X = -999999999;
        assertEquals(0, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case127() {
        int[] A = { 100000000, -100000000 };
        int X = -187491942;
        assertEquals(0, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case128() {
        int[] A = { -1, -2, 3, 4 };
        int X = -3;
        assertEquals(2, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case129() {
        int[] A = { 1000000000, -1000000000, -1000000000, -1000000000 };
        int X = -5;
        assertEquals(1, splitintopairs.makepairs(A, X));
    }

    @Test
    public void case130() {
        int[] A = { -5, -5, -5, -5, -2, -1, 1, 2, 5, 5, 5, 5 };
        int X = -4;
        assertEquals(6, splitintopairs.makepairs(A, X));
    }

}
