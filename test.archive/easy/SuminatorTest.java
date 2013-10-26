package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class SuminatorTest {
    Suminator suminator = new Suminator();

    @Test
    public void case1() {
        int[] program = { 7, -1, 0 };
        int wantedResult = 10;
        assertEquals(3, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case2() {
        int[] program = { 100, 200, 300, 0, 100, -1 };
        int wantedResult = 600;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case3() {
        int[] program = { -1, 7, 3, 0, 1, 2, 0, 0 };
        int wantedResult = 13;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case4() {
        int[] program = { -1, 8, 4, 0, 1, 2, 0, 0 };
        int wantedResult = 16;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case5() {
        int[] program = { 7, -1, 3, 0 };
        int wantedResult = 3;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case6() {
        int[] program = { 315291978, -1, 0, 55598902, 0 };
        int wantedResult = 703034801;
        assertEquals(332143921, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case7() {
        int[] program = { 242118690, 483584629, -1 };
        int wantedResult = 725703319;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case8() {
        int[] program = { 360518734, -1, 0 };
        int wantedResult = 628719390;
        assertEquals(268200656, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case9() {
        int[] program = { 28107371, 157214073, 116123103, 430918710, 0, 0, 0, -1, 0 };
        int wantedResult = 736756081;
        assertEquals(4392824, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case10() {
        int[] program = { 17389086, 971075642, -1 };
        int wantedResult = 988464728;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case11() {
        int[] program = { 585983170, -1, 0 };
        int wantedResult = 981293046;
        assertEquals(395309876, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case12() {
        int[] program = { 808312155, 85035091, -1 };
        int wantedResult = 893347246;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case13() {
        int[] program = { -1, 749942586, 0 };
        int wantedResult = 775380477;
        assertEquals(25437891, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case14() {
        int[] program = { 429184190, 108889203, -1 };
        int wantedResult = 538073393;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case15() {
        int[] program = { 19368652, 131711616, 347313404, 0, -1 };
        int wantedResult = 498393672;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case16() {
        int[] program = { 27554278, 17337966, 0, 56877584, 27250977, 24654333, 0, 95244498, 0, 0, 80572612, 0, 0, 48429664, 86916536, 0, 87348885, 29024272, 0, 0, 0, 58309589, 67899872, 31402538, 0, 57195876, 0, 65223972, 0, 32519795, 380796, 0, 26527035, 0, 0, 0, -1, 6819708, 7681057, 0, 12061011, 0, 0 };
        int wantedResult = 947232854;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case17() {
        int[] program = { 6121784, 37579799, 42054671, 0, 0, 21650056, 42465117, 0, 19699029, -1, 0, 62475162, 82954834, 60533217, 0, 60906322, 27490398, 0, 0, 0, 0, 17457492, 62465630, 7676347, 0, 0, 66209524, 0, 78811351, 34979933, 0, 0, 0 };
        int wantedResult = 731530666;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case18() {
        int[] program = { 22203450, 82299496, 0, 7038659, 60308119, 81529514, 0, 48346978, -1, 0, 0, 25143746, 0, 0, 82495369, 0, 0, 79657184, 15611548, 0, 0, 7384260, 58361068, 53937964, 0, 0, 40839007, 42257011, 0, 9251722, 0, 49696141, 0, 58916453, 0, 0, 65659131, 0, 0 };
        int wantedResult = 948785511;
        assertEquals(57848691, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case19() {
        int[] program = { 2393490, 56408385, 73433210, 33640283, 70413538, 0, 0, 2651077, 75556057, 0, 0, 81458762, 66135028, 0, 53468221, 0, 0, 82463513, 70665058, 51438458, 0, 0, 50153796, 55047141, 0, 0, 0, -1, 0 };
        int wantedResult = 825326017;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case20() {
        int[] program = { 8968086, 71183583, 21372385, 0, 0, 45663719, 91377290, 41206862, 0, 0, 52648830, 0, 76870920, 0, 32435288, 56551108, 0, 0, 0, 68210949, 9317952, 0, 32366429, 11070050, 69173085, 0, 13258192, 0, 0, 29679029, -1, 0, 0 };
        int wantedResult = 731353757;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case21() {
        int[] program = { 16869820, 51221912, 94011778, 0, 17074086, 0, 0, 13997877, 0, 32307577, 76801615, 36596734, 0, 0, 0, 85763579, 88547759, 0, 55025034, -1, 52024955, 0, 9695889, 0, 75309749, 44536073, 0, 55465839, 0, 0, 0, 0, 0 };
        int wantedResult = 900729282;
        assertEquals(95479006, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case22() {
        int[] program = { 1906618, 73193354, 0, 5183734, 72381, 0, -1, 0, 44586187, 7897709, 0, 36571227, 92972392, 0, 0, 0, 61692364, 59280198, 70327032, 0, 34037300, 0, 9948593, 0, 0, 55500096, 0, 0, 16628763, 56926570, 3158331, 0, 13038238, 0, 62028644, 91031966, 0, 0, 0, 41275821, 0, 0, 0, 56235962, 15363972, 0, 0 };
        int wantedResult = 933314801;
        assertEquals(24457349, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case23() {
        int[] program = { 21300835, 7893779, 0, 69177473, 3281250, 5303217, 0, 60276620, 0, 0, 43725318, 35171555, 0, 69839608, 28652498, 94146503, 0, 108850, 0, 74423631, 20449449, 0, 0, 1776066, 42250851, 0, 0, 31465253, 0, 0, 0, 99078543, 22476310, 89104559, 33143272, 0, 10693493, 0, 0, 0, 0, 0, -1 };
        int wantedResult = 863738933;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case24() {
        int[] program = { 60170971, 87285249, 0, 74360457, 24322550, 0, 77970602, 75256921, 554413, 0, -1, 0, 27187444, 63945021, 0, 50080571, 23513604, 97407919, 0, 0, 71388131, 0, 0, 48208912, 0, 0, 0, 55781581, 61460360, 0, 0 };
        int wantedResult = 898894706;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case25() {
        int[] program = { 59944435, 3875246, 79043002, 25796131, 0, 37020529, 0, 0, 35488475, 0, 83060151, 169344, 0, 66849600, 14319108, 0, 0, 0, 55515921, 43969692, 0, -1, 0, 77356161, 91104921, 0, 0, 0, 0, 45174426, 62189700, 0, 0 };
        int wantedResult = 814454357;
        assertEquals(33577515, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case26() {
        int[] program = { 98423334, 40389105, 77840151, 34702292, 40769476, 2026722, 0, 63164352, 0, 53095687, 82052748, 41232966, 74759175, 57505634, 0, 0, 0, 16933623, -1, 0, 20533073, 0, 0, 62312725, 49491340, 80813023, 11761410, 0, 0, 0, 30028143, 56269325, 0, 77231511, 29781155, 0, 0, 0, 0 };
        int wantedResult = 849762088;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case27() {
        int[] program = { 90456225, 85312801, -1, 93541849, 90015805, 0, 0, 79829127, 55845796, 0, 0, 14659918, 18832075, 7515373, 0, 60031859, 0, 0, 0, 93327133, 0, 50620889, 66619994, 66426447, 0, 0, 88287780, 13169100, 0, 0, 0, 12158979, 0 };
        int wantedResult = 849835476;
        assertEquals(38953352, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case28() {
        int[] program = { 14938044, 46246998, 85902525, 2416658, 27232359, 0, 0, 27246177, 46222391, 0, 8475680, 31761455, 63084522, 0, 0, 2702197, 0, 64118410, 64013290, 0, 65506550, 98935847, 0, 5076046, 80102234, 49465450, 0, -1, 0, 99070854, 89669472, 0, 0, 0, 0, 0, 0 };
        int wantedResult = 911002117;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case29() {
        int[] program = { 45743656, 29111629, 29808213, 8037071, 71283894, 0, 75917069, 0, 59844809, 0, 24035971, 67204919, 0, 30570008, 42088729, 0, 0, 69669113, -1, 0, 41567270, 37250545, 0, 0, 0, 56111537, 0, 26799697, 62773021, 0, 0, 0 };
        int wantedResult = 683827216;
        assertEquals(10673563, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case30() {
        int[] program = { 79243676, 95900435, 95363426, 0, 53929344, 18108136, 0, 11020340, 0, 72950603, 52748967, 59770766, 0, 31059099, 98175993, 0, 43868893, 0, 0, 0, -1, 36781007, 0, 53727860, 83280877, 0, 0, 0, 0, 0 };
        int wantedResult = 858785097;
        assertEquals(52099351, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case31() {
        int[] program = { 48113759, 6699772, 17036353, 39342250, 78863665, 5611809, 92220838, 0, 93728808, 0, 19795792, 22264008, 0, 48569202, 0, 0, 0, 77108548, 0, 74525174, 74904464, 0, 32764045, 0, 81117315, 0, 74565894, 24098381, 0, 6408936, 25943227, -1, 0, 26269372, 78878026, 13679000, 0, 0, 0, 0, 0 };
        int wantedResult = 951316504;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case32() {
        int[] program = { 85062112, 18746825, 57233685, 59543708, 0, 28864697, 0, 80448723, 0, 0, 62684571, 44579929, -1, 16611469, 25587465, 0, 90265906, 0, 0, 99382320, 91339916, 57656571, 0, 0, 0, 20202118, 0, 0, 14851696, 67271105, 0, 67553630, 13796062, 0, 0, 0 };
        int wantedResult = 916620396;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case33() {
        int[] program = { 83191762, 51967785, 29386946, 49982786, -1, 0, 40039437, 5735068, 0, 0, 44049021, 49149340, 0, 0, 27869343, 10451002, 0, 20708423, 0, 70588499, 0, 73201533, 9816665, 0, 0, 74990186, 92961936, 0, 2735492, 0, 46747896, 0, 0, 0 };
        int wantedResult = 694354117;
        assertEquals(75327490, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case34() {
        int[] program = { 90890752, 52886353, 39874533, 86620279, 60675504, 41113674, 0, 77749103, 47677476, 0, 15738275, 71457403, 15584516, 0, 29283919, 41965110, 0, 0, 0, 0, 0, 9603159, 0, 84668136, 46882061, 0, 0, 13156925, 56568327, 55601319, -1, 0, 78422544, 46925617, 9639952, 0, 0, 0, 0 };
        int wantedResult = 802713020;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case35() {
        int[] program = { 49715430, 5526199, 87281548, 0, 36463972, 21245176, 46179840, 0, 0, 0, 29836599, 15418748, 0, 43943801, 27877246, 66693517, 22809386, 0, 52321737, 0, 0, 0, 0, 0, 56578810, 48758945, 63321081, 96648320, 0, -1, 0, 0, 0, 0 };
        int wantedResult = 784529097;
        assertEquals(63624172, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case36() {
        int[] program = { 54935281, 68594537, -1, 30167972, 6251648, 30104310, 55589738, 0, 8634584, 60608308, 65445346, 0, 0, 0, 47557432, 34644269, 0, 6555666, 0, 21897301, 73294612, 57761996, 0, 0, 0, 44758725, 40299341, 0, 55950654, 0, 42940566, 0, 0, 53744745, 85569015, 0, 0, 0 };
        int wantedResult = 785356608;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case37() {
        int[] program = { -1, 4157188, 20144091, 34028992, 0, 0, 58285104, 46054299, 60039873, 0, 0, 56665373, 0, 71181655, 8120218, 0, 0, 28485199, 21600051, 94165749, 85272877, 0, 0, 0, 0, 0, 24266805, 48090490, 50435958, 0, 0, 2035946, 91560907, 8456936, 0, 35942693, 85304843, 62280523, 0, 0, 0, 0, 0, 0 };
        int wantedResult = 996575770;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case38() {
        int[] program = { 8709400, 9166572, 94585811, 81226439, -1, 66640251, 68697334, 0, 87915046, 77265579, 90477471, 0, 36675609, 0, 0, 72337658, 67974877, 0, 71659436, 0, 0, 0, 86618732, 15702153, 0, 57793274, 38368034, 35294672, 0, 0, 69085366, 0, 0, 0 };
        int wantedResult = 942505492;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case39() {
        int[] program = { 35880404, -1, 40944277, 38334477, 84675446, 86719767, 8569974, 0, 0, 0, 37464173, 2485920, 33060234, 75739762, 0, 0, 0, 64824343, 0, 0, 44406595, 40668925, 29023893, 0, 0, 87729953, 0, 0, 42202011, 16418266, 0, 77322234, 0, 49625137, 0, 0 };
        int wantedResult = 819271110;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case40() {
        int[] program = { 46496316, -1, 40244435, 57054136, 82504991, 84752051, 0, 22163114, 0, 40078641, 18135857, 91067969, 0, 0, 0, 0, 0, 99625812, 40726852, 0, 25547835, 57479783, 31264082, 0, 57716052, 0, 0, 6114861, 0, 0, 0 };
        int wantedResult = 754476471;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case41() {
        int[] program = { -1, 9830727, 88031936, 87169296, 0, 0, 92678444, 53357920, 0, 0, 97396811, 47600544, 0, 5008467, 56646835, 0, 0, 58936643, 0, 0, 21665011, 48348970, 0, 98139588, 0, 76022724, 70367407, 0, 0, 18214786, 0, 37200731, 0, 0 };
        int wantedResult = 966616840;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case42() {
        int[] program = { 34412299, -1, 54752466, 1426673, 0, 58447631, 14847682, 21713679, 56247078, 83833685, 0, 0, 55563755, 0, 0, 0, 0, 43151512, 6067172, 0, 63206457, 25322989, 0, 14019712, 0, 0, 57184614, 28776201, 0, 937026, 61811064, 0, 0, 0, 24825650, 49201691, 0, 0, 14036421, 68806402, 15463303, 0, 0, 0, 0 };
        int wantedResult = 819642863;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case43() {
        int[] program = { -1, 58431741, 94439105, 96665047, 69617029, 0, 73394230, 0, 0, 79513756, 95163740, 0, 23586389, 0, 0, 18106551, 66764824, 0, 7185148, 0, 29656654, 0, 4721788, 70639377, 0, 0, 78454355, 2847959, 57657308, 0, 0, 0, 0 };
        int wantedResult = 868413260;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case44() {
        int[] program = { 65313989, 29224385, 47350053, 1646938, -1, 47886094, 90383913, 5461838, 56942461, 0, 55749776, 0, 0, 0, 98810333, 57788195, 0, 60802583, 10072319, 25604929, 0, 0, 19126863, 0, 54149019, 10957755, 40228468, 0, 10888062, 0, 0, 0, 0, 0, 30764764, 5310015, 83796410, 0, 0, 0 };
        int wantedResult = 764723797;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case45() {
        int[] program = { -1, 68149726, 18957574, 0, 54496335, 0, 52778519, 45633253, 84931199, 0, 0, 67877059, 63951830, 98291967, 11146302, 0, 0, 0, 0, 90327581, 82532071, 0, 0, 34381598, 0, 0, 7415297, 0, 87837557, 0, 22703326, 21049749, 0, 15857940, 0, 8083428, 0, 0 };
        int wantedResult = 936402311;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case46() {
        int[] program = { 582754528, 494887055, 591828883, 144176393, 119650471, 0, 739891773, 0, 589412237, 616162214, 382470605, 0, 0, -1, 354633409, 142155495, 690477455, 0, 380431293, 546406944, 218510074, 0, 0, 0, 0, 0, 335579968, 949638819, 803304197, 0, 561578075, 0, 0, 412439300, 833824263, 0, 0, 0 };
        int wantedResult = 882074298;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case47() {
        int[] program = { 845151429, 60888921, 349419441, 452722179, 698157266, 589688000, 0, 0, 614020210, 917738413, 0, 0, 984300555, 785675697, 623438381, 865773912, -1, 0, 0, 202538864, 576905676, 0, 320406658, 0, 634482942, 379832022, 241814338, 0, 0, 0, 0, 0, 815856524, 588150990, 672632541, 704357226, 0, 0, 205398249, 0, 0, 0, 0 };
        int wantedResult = 122233108;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case48() {
        int[] program = { 279808452, 620805437, 83635404, 838871679, 857178021, 691041863, 84348544, 575676690, 0, 910430492, 0, 215400751, 238179932, 0, 525142367, 0, 0, 0, 11990241, 957341740, 0, 0, 934141887, 418006881, 0, 267811800, 555461679, 0, 432168824, 835612860, 0, 0, 0, 568807639, 201562867, 0, 47484219, 0, 0, 934223454, 110523480, 0, -1, 0 };
        int wantedResult = 925423618;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case49() {
        int[] program = { 605408652, 230633679, 179958601, 282903749, 0, 223697969, 245883197, 0, 0, 771536505, 0, 0, 266036721, 0, 742945916, 651004715, 0, 712341879, 0, 58528233, 0, 104776063, 699406000, 0, 0, 103374037, 811802165, 0, 577168694, 668961064, 675998885, 0, 258195776, 0, 0, 272701409, 0, -1, 0, 0 };
        int wantedResult = 853785525;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case50() {
        int[] program = { 357238094, 130331731, 747170763, 360259568, 28651631, 262180699, 510844152, 0, 32695546, 0, 473721555, 894547214, 0, 0, 694755401, 629958322, 0, 324999126, 586928525, 0, 484829140, 509725543, 0, 0, 0, 0, 87370995, 434980501, 0, 374686812, 0, 433091693, 338728248, -1, 0, 0, 0, 450777857, 160856759, 695081255, 710246554, 0, 0, 0, 0, 0 };
        int wantedResult = 598941299;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case51() {
        int[] program = { 61839030, 430305560, 293919480, 852410070, 729929915, 0, 877601219, 662380493, 324369743, -1, 0, 0, 0, 997831150, 777002476, 0, 51468784, 259336732, 835531355, 538188462, 0, 0, 0, 0, 0, 0, 974504720, 644046695, 222184467, 0, 764704646, 0, 0, 0, 383678630, 526245602, 553840716, 0, 0, 0 };
        int wantedResult = 111816257;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case52() {
        int[] program = { 551199873, 712588991, 834935381, 291061285, 10564320, 975108071, 593114393, 0, 474890090, 654018463, 0, -1, 0, 271647513, 274431195, 250660747, 0, 163935318, 648116283, 0, 0, 824868970, 777625223, 0, 252665572, 937252197, 793175882, 0, 0, 0, 0, 374375300, 296261313, 0, 644355911, 302841151, 0, 0, 0, 0, 0 };
        int wantedResult = 929973320;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case53() {
        int[] program = { 789654684, 566364589, 132807813, 954342599, 35537713, 167014159, 0, 0, 527502165, 863260323, 0, 62519272, 0, 109943112, 515518880, 438991295, 0, 0, 0, 388935264, 172607760, 489587296, 486148885, 485583952, 0, 0, 0, 0, 0, 0, 0, 43897666, -1, 0, 686446611, 0, 610840718, 45645333, 0, 0, 0, 913613509, 612042210, 0, 0 };
        int wantedResult = 238208598;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case54() {
        int[] program = { 882928983, 484511801, 277557010, 936093524, 345945601, 163322780, 502092255, 61844818, 0, 0, 768651124, 740375801, 0, 0, 125802453, 711152557, 0, 713283832, 763971211, 0, 0, 251782937, 0, 85343659, 217269316, 0, 868727608, -1, 719504744, 0, 142872132, 751395802, 0, 279682500, 348539127, 0, 0, 234720762, 0, 0, 0, 467439019, 0, 0 };
        int wantedResult = 327839845;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case55() {
        int[] program = { 636752772, 570097146, 542987086, 333070396, 598017840, 166886122, 56087870, 0, 404381561, 0, 515108199, 302263989, 0, 691864340, 0, 0, 765471580, 117113339, 775001859, 406695768, -1, 0, 346614879, 822838605, 0, 42191846, 213272479, 0, 380799912, 0, 0, 0, 0, 368656183, 22664848, 0, 0, 590866005, 109393731, 0, 537892273, 0, 221828339, 253253843, 0, 0, 0, 0 };
        int wantedResult = 811114757;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case56() {
        int[] program = { 19131545, 85268859, 33001208, 0, 29983140, 97917399, 49247737, 14086271, 0, 2185239, 0, 0, 0, -1, 8931147, 0, 11229782, 28945949, 2238603, 0, 71704020, 46480929, 0, 0, 0, 0, 65128034, 0, 51892068, 48599014, 83333940, 0, 26603693, 70382155, 0, 0, 0, 0, 0, 0 };
        int wantedResult = 859960311;
        assertEquals(32801124, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case57() {
        int[] program = { 99695872, 66155921, 24299051, 35949126, 76544886, 30362054, 0, 0, 44591431, 0, 63428127, 26510939, 5480247, 14060401, -1, 0, 0, 46048334, 0, 0, 0, 0, 24924352, 97240994, 0, 22291066, 44036112, 0, 14337533, 0, 0, 0, 11095091, 27803079, 0, 66037805, 0, 0, 0, 0, 44554281, 0 };
        int wantedResult = 800031701;
        assertEquals(14280871, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case58() {
        int[] program = { 82391954, 10400084, 92247077, 60007666, 57322244, 0, 0, -1, 3373274, 38863286, 0, 0, 0, 16390235, 0, 0, 67268376, 6531820, 71012161, 0, 56430180, 0, 0, 23703630, 69736201, 0, 0, 46759468, 0, 40187867, 26039833, 0, 85457307, 0, 45245474, 0, 29609600, 0, 0, 0 };
        int wantedResult = 904959838;
        assertEquals(58374055, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case59() {
        int[] program = { 68247897, 49287772, 10572649, 86863478, 14666187, 0, 0, 68266695, 7474313, 0, 17306033, 0, 0, 21619285, 64353467, 89665922, 0, 61298184, 0, 1028086, 57375104, 0, 0, 0, 0, 86018538, 11043517, 30158469, 0, 0, 0, -1, 56449860, 0, 29193381, 0, 64001822, 56576912, 0, 0, 0 };
        int wantedResult = 932677219;
        assertEquals(98745317, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case60() {
        int[] program = { 16272577, 30273166, 77316801, 70628577, 0, 4101760, 37893993, 0, 0, 58090962, 0, 33154385, 68520270, 63769491, 0, 79212934, 0, 0, 27171237, 0, 0, 52303370, 96162546, 23110277, 37005114, 0, 0, -1, 0, 37219951, 18158636, 0, 0, 36510303, 56478151, 60714245, 22950728, 0, 0, 0, 0, 0, 0 };
        int wantedResult = 989911080;
        assertEquals(29437349, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case61() {
        int[] program = { 43913989, 67364946, 87902954, 0, 20891448, 0, 65989383, 34904322, 0, 30949411, 0, -1, 7773816, 0, 0, 29370199, 0, 95561039, 27491404, 70754139, 0, 65523689, 0, 0, 0, 0, 15152079, 98468232, 0, 45979533, 0, 13887985, 25850246, 87874780, 0, 52786826, 0, 0, 0, 0 };
        int wantedResult = 946547828;
        assertEquals(2071397, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case62() {
        int[] program = { 92815231, 67583132, 30481888, 45535974, 0, 49136747, 18931635, 0, 29580054, 12538637, 0, 31375171, 0, 0, 90370711, 0, 0, 39261806, 77945892, 0, 71553248, 22308530, 59208691, 0, 31085687, 0, 85036012, 0, 0, 0, 63302613, 298108, 0, 62351614, -1, 0, 18916716, 55959335, 0, 0, 34748974, 0, 0, 0, 0 };
        int wantedResult = 950992003;
        assertEquals(21063960, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case63() {
        int[] program = { 27058474, 16722355, 36561517, 79508329, 0, 42492098, 0, -1, 0, 19370814, 36965519, 0, 19149836, 0, 44202294, 33260787, 0, 19765702, 0, 0, 0, 13912838, 27953332, 57136287, 0, 91984852, 0, 36889382, 0, 68421542, 66276672, 0, 92610780, 0, 99678411, 0, 0, 60122284, 0, 0, 0 };
        int wantedResult = 969429368;
        assertEquals(23166092, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case64() {
        int[] program = { 72350534, 85809165, 19840937, 5351128, 39700567, 0, 38739611, 65341718, 0, 58992212, 40737835, 63497995, 0, 0, 5186661, 47796098, 0, 33923050, 0, 0, 0, 0, 79467913, 68362497, 0, 0, 0, 33382896, 55790532, 0, 2523312, -1, 74966375, 0, 0, 89182011, 63253397, 0, 0, 0, 0 };
        int wantedResult = 939405737;
        assertEquals(53368992, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case65() {
        int[] program = { 29094678, 24507371, 13695287, 0, 38106846, 59517030, 0, 63930879, 44169284, 0, 16169976, 0, 0, 14021954, 6697649, 89651613, 0, 0, 0, 0, 1319858, 18396546, 9005948, 95521177, 0, 0, 0, 26090599, 58325190, 76262307, 12457609, 0, 74495673, 0, 0, 0, -1, 0, 38449202, 0, 0, 0 };
        int wantedResult = 803043208;
        assertEquals(22251210, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case66() {
        int[] program = { -1 };
        int wantedResult = 1;
        assertEquals(1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case67() {
        int[] program = { 1, 1, -1, 1, 0 };
        int wantedResult = 1;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case68() {
        int[] program = { -1, 444, 921, 0, 764, 0, 455, 625, 0, 0, 15, 908, 0, 618, 864, 0, 0, 0, 731, 686, 0, 0, 751, 20, 0, 75, 116, 0, 0, 0, 212, 884, 0, 58, 146, 0, 655, 631, 0, 0, 0, 59, 0, 387, 0, 0 };
        int wantedResult = 11025;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case69() {
        int[] program = { -1, 442, 730, 609, 0, 7, 0, 0, 201, 763, 0, 620, 613, 0, 0, 399, 676, 250, 0, 260, 0, 0, 955, 926, 238, 0, 812, 0, 0, 0, 0, 554, 990, 0, 227, 117, 0, 0, 0, 0 };
        int wantedResult = 10389;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case70() {
        int[] program = { 893, -1, 457, 460, 169, 0, 504, 0, 0, 384, 116, 0, 28, 885, 0, 652, 515, 0, 0, 938, 143, 0, 0, 330, 0, 789, 326, 319, 0, 0, 745, 113, 0, 0, 859, 0, 342, 15, 658, 0, 0, 0, 0, 0, 0 };
        int wantedResult = 9747;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case71() {
        int[] program = { 168, 191, 927, 0, 164, 785, 0, 616, 0, 92, 0, 217, 563, 0, 986, 334, 0, 0, 0, 976, 644, 0, 25, 376, 0, 0, 331, 668, 0, 5, 0, 330, -1, 0, 0, 0, 0, 229, 254, 0, 0, 0 };
        int wantedResult = 9441;
        assertEquals(728, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case72() {
        int[] program = { 430, 222, 389, 0, 235, 132, 128, 795, 0, 0, 0, 623, 437, 0, 724, 883, 0, 654, 549, 831, 0, 0, 0, 35, 550, 280, 956, 194, 167, 0, 0, 0, 0, -1, 0, 0, 601, 374, 0, 0, 787, 0, 0, 0, 0, 0 };
        int wantedResult = 10551;
        assertEquals(5, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case73() {
        int[] program = { 914, 558, 421, 4, 0, 5, 108, 0, 0, 23, 885, 0, 972, 722, 0, 298, 0, 0, 181, 167, 0, 338, 0, 527, 75, 488, 698, 0, 0, 919, 312, 0, 971, 0, 265, 0, 0, 0, 0, 0, 111, -1, 0, 0, 0 };
        int wantedResult = 9144;
        assertEquals(654, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case74() {
        int[] program = { 191, 134, 619, 450, 685, 11, 0, 0, 0, 402, 68, 0, 30, 909, 0, 131, 384, 416, 707, 422, 0, 0, 0, 130, 137, 63, 0, 0, -1, 662, 0, 0, 0, 0, 0, 486, 41, 0, 0, 0, 0 };
        int wantedResult = 6896;
        assertEquals(143, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case75() {
        int[] program = { 1, 3, 288, 460, 52, 0, 79, 0, 0, 677, 839, 382, 678, 0, 0, 574, 123, 0, 0, -1, 0, 0, 299, 704, 0, 831, 0, 737, 0, 0, 0, 494, 709, 79, 0, 0, 287, 468, 0, 833, 0, 0, 0 };
        int wantedResult = 10489;
        assertEquals(896, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case76() {
        int[] program = { 973, 850, 282, 0, 375, 256, 0, 796, 841, 512, 693, 0, 0, 642, 582, 0, 0, 0, 544, 531, 40, 0, 0, 738, 0, -1, 793, 0, 0, 976, 0, 0, 0, 766, 823, 961, 601, 0, 0, 0, 0, 919, 0, 0 };
        int wantedResult = 14001;
        assertEquals(480, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case77() {
        int[] program = { 785, 522, 57, 768, 113, 912, 323, 0, 0, 316, 0, 0, 794, 585, 491, 658, 67, 0, 722, 0, 779, 0, 752, 0, 0, 0, 0, -1, 0, 922, 0, 340, 922, 0, 908, 288, 18, 0, 0, 0, 0, 0, 0, 0 };
        int wantedResult = 11927;
        assertEquals(670, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case78() {
        int[] program = { 1, -1, 0 };
        int wantedResult = 1000000000;
        assertEquals(999999999, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case79() {
        int[] program = { -1 };
        int wantedResult = 1000000000;
        assertEquals(1000000000, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case80() {
        int[] program = { -1, 3, 1, 0, 0, 2, 0, 3, 1, 3, 0, 0, 3, 0, 1, 4, 0, 5, 0, 5, 0, 0, 2, 4, 0, 4, 5, 0, 0, 5, 1, 3, 0, 5, 0, 0, 0, 4, 1, 2, 0, 4, 0, 0, 0, 0, 0 };
        int wantedResult = 999999924;
        assertEquals(999999853, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case81() {
        int[] program = { 3, 2, 0, 4, 0, 2, 1, 0, 5, 5, 0, 4, 2, 5, -1, 0, 2, 1, 0, 0, 0, 0, 0, 5, 0, 0, 1, 1, 0, 3, 5, 0, 0, 1, 3, 3, 0, 0, 2, 0, 4, 0, 0, 0, 5, 0, 0 };
        int wantedResult = 999999964;
        assertEquals(999999895, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case82() {
        int[] program = { 5, 2, 4, 0, 0, 2, 5, 0, 0, 1, 5, 0, 2, 3, 0, 0, 0, 1, 3, 5, 0, 1, 0, 0, 1, 5, 0, 0, 5, 0, 5, 0, 0, 2, 2, 0, 1, 3, 0, 0, -1, 2, 1, 0, 2, 0, 0, 0, 0 };
        int wantedResult = 999999946;
        assertEquals(999999878, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case83() {
        int[] program = { 2, 5, 3, 2, 0, 0, 0, 1, 2, 0, 0, 2, 4, 4, 0, 0, 0, 1, 4, 5, 0, 1, 4, 0, 1, 0, 0, 0, 2, 0, 5, 3, 0, 3, 4, 0, 0, 3, 0, 3, 0, 4, 1, 0, 0, 0, 0, -1, 0 };
        int wantedResult = 999999831;
        assertEquals(999999762, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case84() {
        int[] program = { 5, 3, 2, 4, 0, 0, 0, 1, 3, 0, 1, 0, 0, 5, -1, 0, 1, 0, 3, 3, 2, 0, 2, 0, 0, 5, 1, 0, 0, 0, 0, 2, 5, 0, 5, 0, 5, 5, 0, 4, 0, 0, 0, 4, 1, 0, 0 };
        int wantedResult = 999999927;
        assertEquals(999999855, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case85() {
        int[] program = { 5, 2, 0, 2, 5, 0, 1, 0, 0, 4, 2, 0, 5, 5, 1, 2, 0, 0, 0, 0, 2, 2, 0, 4, 2, 5, 2, 0, 5, 2, 0, 0, 3, 0, 0, 3, 4, 0, -1, 2, 0, 0, 0, 0, 0, 0, 0 };
        int wantedResult = 999999943;
        assertEquals(999999873, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case86() {
        int[] program = { 2, 5, 0, 1, 0, 5, 5, 0, 4, 4, 0, 5, 4, 0, 2, 0, 0, 4, 5, 0, 4, 3, 5, 0, 0, 0, 5, 1, -1, 0, 2, 2, 0, 0, 0, 0, 0, 1, 1, 0, 4, 0, 4, 0, 0, 0, 0 };
        int wantedResult = 999999945;
        assertEquals(999999867, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case87() {
        int[] program = { 1, 5, 0, 4, 3, 0, 0, 1, 0, 3, 3, 1, 0, 1, 0, 5, 2, 0, 0, 0, 0, 1, 5, 3, 0, 0, 3, -1, 4, 0, 4, 0, 0, 0, 1, 0, 0, 1, 3, 0, 5, 3, 4, 0, 0, 0, 0 };
        int wantedResult = 999999967;
        assertEquals(999999901, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case88() {
        int[] program = { 1, 3, 5, 0, 0, 3, 0, 5, 5, 0, 4, 3, 0, 2, 1, 0, 5, 0, 2, 5, 0, 0, 0, 0, 0, -1, 3, 3, 0, 0, 3, 0, 4, 5, 0, 4, 1, 0, 0, 0, 3, 4, 0, 0, 0, 3, 1, 0, 0 };
        int wantedResult = 999999979;
        assertEquals(999999901, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case89() {
        int[] program = { 1, 1, 0, 1, 0, -1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0 };
        int wantedResult = 1000000000;
        assertEquals(999999976, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case90() {
        int[] program = { 999998012, 0, 0, 0, 995917172, 0, 991821848, -1, 0, 0 };
        int wantedResult = 999998046;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case91() {
        int[] program = { 1, -1 };
        int wantedResult = 1;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case92() {
        int[] program = { -1, 0, 0, 6786143, 124597551 };
        int wantedResult = 196;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case93() {
        int[] program = { 7169462, 0, 0, 3097757, 0, -1, 0, 0 };
        int wantedResult = 629;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case94() {
        int[] program = { 0, 1, 0, -1, 1, 0 };
        int wantedResult = 1;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case95() {
        int[] program = { 1000000000, 1000000000, 1000000000, 1000000000, -1, 0, 0, 0, 0 };
        int wantedResult = 1000000000;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case96() {
        int[] program = { 7, -1, 3, 0 };
        int wantedResult = 3;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case97() {
        int[] program = { 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, -1, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0 };
        int wantedResult = 1;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case98() {
        int[] program = { 0, -1 };
        int wantedResult = 5;
        assertEquals(5, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case99() {
        int[] program = { 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 0, 0, -1, 0 };
        int wantedResult = 705032704;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case100() {
        int[] program = { 1000000000, 1000000000, 1000000000, 1000000000, -1, 0, 0, 0, 0 };
        int wantedResult = 1000000000;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case101() {
        int[] program = { 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0 };
        int wantedResult = 410065409;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case102() {
        int[] program = { 100, 200, 300, 0, 100, -1 };
        int wantedResult = 600;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case103() {
        int[] program = { -1, 1000000000, 1000000000, 0, 1000000000, 0, 1000000000, 0, 294967297, 0 };
        int wantedResult = 1;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case104() {
        int[] program = { 7, -1, 3, 0 };
        int wantedResult = 3;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case105() {
        int[] program = { -1 };
        int wantedResult = 4;
        assertEquals(4, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case106() {
        int[] program = { 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 0, 0, 0, -1 };
        int wantedResult = 705032704;
        assertEquals(705032704, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case107() {
        int[] program = { 656040131, 420053325, 672058175, 459357954, 883462951, 306319514, 304726974, 323327257, 650507305, 673693686, 428860088, 378453150, 403214389, 548120973, 664004604, 358390117, 489552867, 401695990, 485725869, 559877273, 345093980, 650059157, 341491920, 302227266, 361070511, 621228845, 365577767, 368340082, 339692219, 346158939, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0 };
        int wantedResult = 842595100;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case108() {
        int[] program = { 578784, 20592, 102977, 713261, 295626, 913091, 472225, 896382, 570818, 913193, 989993, 330530, 425048, 818064, 196098, 130996, 304861, 838890, 831389, 949547, 586741, 726338, 864290, 785801, 589221, 77539, 659822, 874504, 61983, 608661, 246250, 241010, 341291, 208903, 510409, 721168, 6196, 221768, 194846, 319674, 614829, 806127, 8343, 62030, 348638, -1, 0 };
        int wantedResult = 348938;
        assertEquals(300, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case109() {
        int[] program = { 536870912, 536870912, 536870912, 536870912, 536870912, 536870912, 536870912, 536870912, -1, 0, 0, 0, 0, 0, 0, 0, 0 };
        int wantedResult = 1;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case110() {
        int[] program = { -1, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 0, 0, 0, 0, 0 };
        int wantedResult = 705032704;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case111() {
        int[] program = { -1, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0 };
        int wantedResult = 500000000;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case112() {
        int[] program = { 1000000000, 1000000000, 1000000000, 1000000000, 0, 0, 0, 0, 0, 0, -1 };
        int wantedResult = 5;
        assertEquals(5, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case113() {
        int[] program = { 3, 4, -1 };
        int wantedResult = 4;
        assertEquals(4, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case114() {
        int[] program = { 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 0, 0, 0, 0, 0, -1 };
        int wantedResult = 1111;
        assertEquals(1111, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case115() {
        int[] program = { -1, 1 };
        int wantedResult = 2;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case116() {
        int[] program = { 0, 1, -1, 0, 0 };
        int wantedResult = 1;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case117() {
        int[] program = { 1000000000, 1000000000, 1000000000, 1000000000, 0, 0, 0, 0, -1 };
        int wantedResult = 1000000000;
        assertEquals(1000000000, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case118() {
        int[] program = { 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, -1, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0 };
        int wantedResult = 1000000000;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case119() {
        int[] program = { 0, -1, 2, 3, 0 };
        int wantedResult = 5;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case120() {
        int[] program = { 1, -1 };
        int wantedResult = 100;
        assertEquals(100, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case121() {
        int[] program = { -1, 2, 0, 2, 3, 4 };
        int wantedResult = 10;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case122() {
        int[] program = { 1, 1, 1, 1, -1, 0, 0, 10, 10, 10 };
        int wantedResult = 100;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case123() {
        int[] program = { 0, 0, -1, 0 };
        int wantedResult = 1000000000;
        assertEquals(1000000000, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case124() {
        int[] program = { 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1 };
        int wantedResult = 1000000000;
        assertEquals(1000000000, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case125() {
        int[] program = { 1000000000, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, -1 };
        int wantedResult = 705032704;
        assertEquals(705032704, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case126() {
        int[] program = { 1, 2, -1, 4, 0 };
        int wantedResult = 55;
        assertEquals(51, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case127() {
        int[] program = { -1, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 0, 0, 0, 0 };
        int wantedResult = 705032704;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case128() {
        int[] program = { 7, 0, -1, 0, 0, 0 };
        int wantedResult = 7;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case129() {
        int[] program = { -1 };
        int wantedResult = 3;
        assertEquals(3, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case130() {
        int[] program = { 2, 3, 2, -1, 5, 0 };
        int wantedResult = 5;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case131() {
        int[] program = { 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 0, 0, 0, 0, 1, -1 };
        int wantedResult = 705032705;
        assertEquals(705032705, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case132() {
        int[] program = { -1 };
        int wantedResult = 100;
        assertEquals(100, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case133() {
        int[] program = { -1, 5, 0, 5, 5, 5, 0 };
        int wantedResult = 20;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case134() {
        int[] program = { 0, 0, 0, 0, -1, 1, 0 };
        int wantedResult = 999999999;
        assertEquals(999999998, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case135() {
        int[] program = { 1, -1 };
        int wantedResult = 2;
        assertEquals(2, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case136() {
        int[] program = { 1000, 1000, 0, -1, 0 };
        int wantedResult = 1000;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case137() {
        int[] program = { 7, -1, 0 };
        int wantedResult = 10;
        assertEquals(3, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case138() {
        int[] program = { 1, -1, 0, 3, 7, 0 };
        int wantedResult = 10;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case139() {
        int[] program = { -1, 2, 2, 0 };
        int wantedResult = 14;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case140() {
        int[] program = { 2, 2, -1 };
        int wantedResult = 1;
        assertEquals(1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case141() {
        int[] program = { 3, 0, -1, 0 };
        int wantedResult = 4;
        assertEquals(1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case142() {
        int[] program = { 2, 3, -1, 0 };
        int wantedResult = 1000;
        assertEquals(997, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case143() {
        int[] program = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1 };
        int wantedResult = 1000;
        assertEquals(1000, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case144() {
        int[] program = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 1000000000, 0, 0, -1, 1, 2, 3, 4, 10 };
        int wantedResult = 1000000000;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case145() {
        int[] program = { 1, 7, -1, 0 };
        int wantedResult = 10;
        assertEquals(3, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case146() {
        int[] program = { 1000000000, 1000000000, 1000000000, 1000000000, 294967297, 0, 0, 0, -1 };
        int wantedResult = 1;
        assertEquals(1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case147() {
        int[] program = { -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int wantedResult = 1000000000;
        assertEquals(1000000000, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case148() {
        int[] program = { 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 0, 0, 0, 0, -1 };
        int wantedResult = 705032704;
        assertEquals(705032704, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case149() {
        int[] program = { 2, -1, 0, 3 };
        int wantedResult = 1000;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case150() {
        int[] program = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1 };
        int wantedResult = 10;
        assertEquals(10, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case151() {
        int[] program = { 1, 1, -1 };
        int wantedResult = 1;
        assertEquals(1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case152() {
        int[] program = { 0, 0, 0, 0, 0, -1 };
        int wantedResult = 1;
        assertEquals(1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case153() {
        int[] program = { -1, 0 };
        int wantedResult = 1000000000;
        assertEquals(1000000000, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case154() {
        int[] program = { 1000000000, 1000000000, 0, 1000000000, 0, 1000000000, 0, 294967297, -1 };
        int wantedResult = 1;
        assertEquals(1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case155() {
        int[] program = { -1, 0, 0 };
        int wantedResult = 1;
        assertEquals(1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case156() {
        int[] program = { 1000000000, 1000000000, 1000000000, 1000000000, 0, 0, 0, -1, 0 };
        int wantedResult = 1234567;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case157() {
        int[] program = { 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, -1, 0 };
        int wantedResult = 3;
        assertEquals(2, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case158() {
        int[] program = { 0, -1, 0 };
        int wantedResult = 10;
        assertEquals(10, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case159() {
        int[] program = { 1000000000, 1000000000, 0, 1000000000, -1, 1000000000, 0, 1000000000, 0 };
        int wantedResult = 705032704;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case160() {
        int[] program = { 1, 2, 3, 4, -1 };
        int wantedResult = 5;
        assertEquals(5, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case161() {
        int[] program = { 1000000000, 100, 0, -1, 0 };
        int wantedResult = 1000000000;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case162() {
        int[] program = { 1000, 1, -1, 0, 0, 0 };
        int wantedResult = 1001;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case163() {
        int[] program = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1 };
        int wantedResult = 1000;
        assertEquals(1000, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case164() {
        int[] program = { -1 };
        int wantedResult = 10;
        assertEquals(10, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case165() {
        int[] program = { 1000000000, 1000000000, 0, 1000000000, 0, 1000000000, 0, 1000000000, 0, -1, 0 };
        int wantedResult = 1000000000;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case166() {
        int[] program = { 1, 2, -1 };
        int wantedResult = 2;
        assertEquals(2, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case167() {
        int[] program = { 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, -1, 0, 0, 0, 0, 0 };
        int wantedResult = 1000000000;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case168() {
        int[] program = { -1, 10, 5 };
        int wantedResult = 5;
        assertEquals(0, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case169() {
        int[] program = { -1 };
        int wantedResult = 74;
        assertEquals(74, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case170() {
        int[] program = { 1000000000, 1000000000, 200000000, 1000000000, 1000000000, 94967299, 0, 0, 0, 0, 0, 0, 0, -1 };
        int wantedResult = 3;
        assertEquals(3, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case171() {
        int[] program = { 4, 2, 1, -1, 1, 1, 0, 0, 0, 3 };
        int wantedResult = 4;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case172() {
        int[] program = { 1000000000, 1000000000, 1000000000, 1000000000, -1, 0, 0, 0, 0 };
        int wantedResult = 705032704;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case173() {
        int[] program = { 1, 1, 0, 2382, 0, 7232, 0, 2321, 0, 0, 32321, 1, 2, 3, 0, 8, 0, 9989893, 0, 1230, 0, 123, 0, 34, 29, 0, 0, 0, 823, 232, 222, 982, 9, 10, 10, 1034, 231, 0, 100, 30, 98, 0, 20, 230, -1, 2332, 8, 30, 0 };
        int wantedResult = 1000000000;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case174() {
        int[] program = { 1000000000, 1000000000, 0, 1000000000, 0, 1000000000, -1, 294967297, 0 };
        int wantedResult = 1;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case175() {
        int[] program = { 42, -1, 0, 5, 5, 5 };
        int wantedResult = 42;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case176() {
        int[] program = { 1, -1, 0, 3 };
        int wantedResult = 4;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case177() {
        int[] program = { 1, -1, 0 };
        int wantedResult = 2;
        assertEquals(1, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case178() {
        int[] program = { -1 };
        int wantedResult = 1000;
        assertEquals(1000, suminator.findMissing(program, wantedResult));
    }

    @Test
    public void case179() {
        int[] program = { 1, -1, 2, 0 };
        int wantedResult = 2;
        assertEquals(-1, suminator.findMissing(program, wantedResult));
    }

}
