package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class MinskyMysteryTest {
    MinskyMystery minskymystery = new MinskyMystery();

    @Test
    public void case1() {
        long N = 2L;
        assertEquals(9, minskymystery.computeAnswer(N));
    }

    @Test
    public void case2() {
        long N = 3L;
        assertEquals(27, minskymystery.computeAnswer(N));
    }

    @Test
    public void case3() {
        long N = 4L;
        assertEquals(16, minskymystery.computeAnswer(N));
    }

    @Test
    public void case4() {
        long N = 2401L;
        assertEquals(59058, minskymystery.computeAnswer(N));
    }

    @Test
    public void case5() {
        long N = 0L;
        assertEquals(-1, minskymystery.computeAnswer(N));
    }

    @Test
    public void case6() {
        long N = 1L;
        assertEquals(-1, minskymystery.computeAnswer(N));
    }

    @Test
    public void case7() {
        long N = 5L;
        assertEquals(88, minskymystery.computeAnswer(N));
    }

    @Test
    public void case8() {
        long N = 6L;
        assertEquals(23, minskymystery.computeAnswer(N));
    }

    @Test
    public void case9() {
        long N = 7L;
        assertEquals(182, minskymystery.computeAnswer(N));
    }

    @Test
    public void case10() {
        long N = 8L;
        assertEquals(30, minskymystery.computeAnswer(N));
    }

    @Test
    public void case11() {
        long N = 9L;
        assertEquals(74, minskymystery.computeAnswer(N));
    }

    @Test
    public void case12() {
        long N = 10L;
        assertEquals(37, minskymystery.computeAnswer(N));
    }

    @Test
    public void case13() {
        long N = 11L;
        assertEquals(467, minskymystery.computeAnswer(N));
    }

    @Test
    public void case14() {
        long N = 12L;
        assertEquals(44, minskymystery.computeAnswer(N));
    }

    @Test
    public void case15() {
        long N = 13L;
        assertEquals(659, minskymystery.computeAnswer(N));
    }

    @Test
    public void case16() {
        long N = 14L;
        assertEquals(51, minskymystery.computeAnswer(N));
    }

    @Test
    public void case17() {
        long N = 15L;
        assertEquals(121, minskymystery.computeAnswer(N));
    }

    @Test
    public void case18() {
        long N = 16L;
        assertEquals(58, minskymystery.computeAnswer(N));
    }

    @Test
    public void case19() {
        long N = 17L;
        assertEquals(1138, minskymystery.computeAnswer(N));
    }

    @Test
    public void case20() {
        long N = 18L;
        assertEquals(65, minskymystery.computeAnswer(N));
    }

    @Test
    public void case21() {
        long N = 19L;
        assertEquals(1426, minskymystery.computeAnswer(N));
    }

    @Test
    public void case22() {
        long N = 20L;
        assertEquals(72, minskymystery.computeAnswer(N));
    }

    @Test
    public void case23() {
        long N = 21L;
        assertEquals(168, minskymystery.computeAnswer(N));
    }

    @Test
    public void case24() {
        long N = 22L;
        assertEquals(79, minskymystery.computeAnswer(N));
    }

    @Test
    public void case25() {
        long N = 23L;
        assertEquals(2098, minskymystery.computeAnswer(N));
    }

    @Test
    public void case26() {
        long N = 24L;
        assertEquals(86, minskymystery.computeAnswer(N));
    }

    @Test
    public void case27() {
        long N = 25L;
        assertEquals(414, minskymystery.computeAnswer(N));
    }

    @Test
    public void case28() {
        long N = 26L;
        assertEquals(93, minskymystery.computeAnswer(N));
    }

    @Test
    public void case29() {
        long N = 27L;
        assertEquals(215, minskymystery.computeAnswer(N));
    }

    @Test
    public void case30() {
        long N = 28L;
        assertEquals(100, minskymystery.computeAnswer(N));
    }

    @Test
    public void case31() {
        long N = 29L;
        assertEquals(3349, minskymystery.computeAnswer(N));
    }

    @Test
    public void case32() {
        long N = 30L;
        assertEquals(107, minskymystery.computeAnswer(N));
    }

    @Test
    public void case33() {
        long N = 999999974243L;
        assertEquals(997345690, minskymystery.computeAnswer(N));
    }

    @Test
    public void case34() {
        long N = 999966000289L;
        assertEquals(895616073, minskymystery.computeAnswer(N));
    }

    @Test
    public void case35() {
        long N = 999932000987L;
        assertEquals(846407291, minskymystery.computeAnswer(N));
    }

    @Test
    public void case36() {
        long N = 549697684831L;
        assertEquals(240454710, minskymystery.computeAnswer(N));
    }

    @Test
    public void case37() {
        long N = 999992456923L;
        assertEquals(117902564, minskymystery.computeAnswer(N));
    }

    @Test
    public void case38() {
        long N = 999985999949L;
        assertEquals(342769624, minskymystery.computeAnswer(N));
    }

    @Test
    public void case39() {
        long N = 999663912463L;
        assertEquals(789183514, minskymystery.computeAnswer(N));
    }

    @Test
    public void case40() {
        long N = 549755813888L;
        assertEquals(145331294, minskymystery.computeAnswer(N));
    }

    @Test
    public void case41() {
        long N = 998295347921L;
        assertEquals(422523484, minskymystery.computeAnswer(N));
    }

    @Test
    public void case42() {
        long N = 990728680597L;
        assertEquals(897820809, minskymystery.computeAnswer(N));
    }

    @Test
    public void case43() {
        long N = 991325085943L;
        assertEquals(642918241, minskymystery.computeAnswer(N));
    }

    @Test
    public void case44() {
        long N = 990132634063L;
        assertEquals(459197756, minskymystery.computeAnswer(N));
    }

    @Test
    public void case45() {
        long N = 23899065817L;
        assertEquals(336739667, minskymystery.computeAnswer(N));
    }

    @Test
    public void case46() {
        long N = 501286585121L;
        assertEquals(69264569, minskymystery.computeAnswer(N));
    }

    @Test
    public void case47() {
        long N = 79418294653L;
        assertEquals(188092387, minskymystery.computeAnswer(N));
    }

    @Test
    public void case48() {
        long N = 857742881383L;
        assertEquals(714172553, minskymystery.computeAnswer(N));
    }

    @Test
    public void case49() {
        long N = 847288609443L;
        assertEquals(94047574, minskymystery.computeAnswer(N));
    }

    @Test
    public void case50() {
        long N = 961346991611L;
        assertEquals(515658070, minskymystery.computeAnswer(N));
    }

    @Test
    public void case51() {
        long N = 289721913119L;
        assertEquals(483988869, minskymystery.computeAnswer(N));
    }

    @Test
    public void case52() {
        long N = 1000000000000L;
        assertEquals(999968511, minskymystery.computeAnswer(N));
    }

    @Test
    public void case53() {
        long N = 56604L;
        assertEquals(198116, minskymystery.computeAnswer(N));
    }

    @Test
    public void case54() {
        long N = 639L;
        assertEquals(5009, minskymystery.computeAnswer(N));
    }

    @Test
    public void case55() {
        long N = 940489420L;
        assertEquals(291712945, minskymystery.computeAnswer(N));
    }

    @Test
    public void case56() {
        long N = 181681L;
        assertEquals(70339234, minskymystery.computeAnswer(N));
    }

    @Test
    public void case57() {
        long N = 2509315L;
        assertEquals(40860019, minskymystery.computeAnswer(N));
    }

    @Test
    public void case58() {
        long N = 61008809L;
        assertEquals(256153748, minskymystery.computeAnswer(N));
    }

    @Test
    public void case59() {
        long N = 307882L;
        assertEquals(1077589, minskymystery.computeAnswer(N));
    }

    @Test
    public void case60() {
        long N = 9657166375L;
        assertEquals(250857733, minskymystery.computeAnswer(N));
    }

    @Test
    public void case61() {
        long N = 632511669L;
        assertEquals(954674708, minskymystery.computeAnswer(N));
    }

    @Test
    public void case62() {
        long N = 1140L;
        assertEquals(3992, minskymystery.computeAnswer(N));
    }

    @Test
    public void case63() {
        long N = 473785794118L;
        assertEquals(250264493, minskymystery.computeAnswer(N));
    }

    @Test
    public void case64() {
        long N = 85426L;
        assertEquals(298993, minskymystery.computeAnswer(N));
    }

    @Test
    public void case65() {
        long N = 823L;
        assertEquals(2711674, minskymystery.computeAnswer(N));
    }

    @Test
    public void case66() {
        long N = 9691L;
        assertEquals(397540, minskymystery.computeAnswer(N));
    }

    @Test
    public void case67() {
        long N = 32677176439L;
        assertEquals(874505132, minskymystery.computeAnswer(N));
    }

    @Test
    public void case68() {
        long N = 66634240L;
        assertEquals(233219842, minskymystery.computeAnswer(N));
    }

    @Test
    public void case69() {
        long N = 8742164973L;
        assertEquals(480291680, minskymystery.computeAnswer(N));
    }

    @Test
    public void case70() {
        long N = 7740L;
        assertEquals(27092, minskymystery.computeAnswer(N));
    }

    @Test
    public void case71() {
        long N = 35679235033L;
        assertEquals(709535439, minskymystery.computeAnswer(N));
    }

    @Test
    public void case72() {
        long N = 912L;
        assertEquals(3194, minskymystery.computeAnswer(N));
    }

    @Test
    public void case73() {
        long N = 62058L;
        assertEquals(217205, minskymystery.computeAnswer(N));
    }

    @Test
    public void case74() {
        long N = 68313523682L;
        assertEquals(97330738, minskymystery.computeAnswer(N));
    }

    @Test
    public void case75() {
        long N = 167483122L;
        assertEquals(586190929, minskymystery.computeAnswer(N));
    }

    @Test
    public void case76() {
        long N = 73316810814L;
        assertEquals(608835547, minskymystery.computeAnswer(N));
    }

    @Test
    public void case77() {
        long N = 25780653L;
        assertEquals(201948452, minskymystery.computeAnswer(N));
    }

    @Test
    public void case78() {
        long N = 50123L;
        assertEquals(49610115, minskymystery.computeAnswer(N));
    }

    @Test
    public void case79() {
        long N = 95066L;
        assertEquals(332733, minskymystery.computeAnswer(N));
    }

    @Test
    public void case80() {
        long N = 1141118L;
        assertEquals(3993915, minskymystery.computeAnswer(N));
    }

    @Test
    public void case81() {
        long N = 641536L;
        assertEquals(2245378, minskymystery.computeAnswer(N));
    }

    @Test
    public void case82() {
        long N = 1303791137L;
        assertEquals(481352061, minskymystery.computeAnswer(N));
    }

    @Test
    public void case83() {
        long N = 934L;
        assertEquals(3271, minskymystery.computeAnswer(N));
    }

    @Test
    public void case84() {
        long N = 3979L;
        assertEquals(357087, minskymystery.computeAnswer(N));
    }

    @Test
    public void case85() {
        long N = 8544095L;
        assertEquals(139126353, minskymystery.computeAnswer(N));
    }

    @Test
    public void case86() {
        long N = 1716L;
        assertEquals(6008, minskymystery.computeAnswer(N));
    }

    @Test
    public void case87() {
        long N = 708L;
        assertEquals(2480, minskymystery.computeAnswer(N));
    }

    @Test
    public void case88() {
        long N = 37222940L;
        assertEquals(130280292, minskymystery.computeAnswer(N));
    }

    @Test
    public void case89() {
        long N = 255270L;
        assertEquals(893447, minskymystery.computeAnswer(N));
    }

    @Test
    public void case90() {
        long N = 194934L;
        assertEquals(682271, minskymystery.computeAnswer(N));
    }

    @Test
    public void case91() {
        long N = 35020L;
        assertEquals(122572, minskymystery.computeAnswer(N));
    }

    @Test
    public void case92() {
        long N = 4921L;
        assertEquals(121032, minskymystery.computeAnswer(N));
    }

    @Test
    public void case93() {
        long N = 22198161106L;
        assertEquals(693563180, minskymystery.computeAnswer(N));
    }

    @Test
    public void case94() {
        long N = 793869339907L;
        assertEquals(515090730, minskymystery.computeAnswer(N));
    }

    @Test
    public void case95() {
        long N = 455750691863L;
        assertEquals(915291204, minskymystery.computeAnswer(N));
    }

    @Test
    public void case96() {
        long N = 88458156143L;
        assertEquals(438777579, minskymystery.computeAnswer(N));
    }

    @Test
    public void case97() {
        long N = 743531953133L;
        assertEquals(489686193, minskymystery.computeAnswer(N));
    }

    @Test
    public void case98() {
        long N = 67336661975L;
        assertEquals(465302635, minskymystery.computeAnswer(N));
    }

    @Test
    public void case99() {
        long N = 55858966335L;
        assertEquals(561899028, minskymystery.computeAnswer(N));
    }

    @Test
    public void case100() {
        long N = 462398666113L;
        assertEquals(16325919, minskymystery.computeAnswer(N));
    }

    @Test
    public void case101() {
        long N = 414917635852L;
        assertEquals(211712416, minskymystery.computeAnswer(N));
    }

    @Test
    public void case102() {
        long N = 80399258354L;
        assertEquals(397401712, minskymystery.computeAnswer(N));
    }

    @Test
    public void case103() {
        long N = 804762276120L;
        assertEquals(667941078, minskymystery.computeAnswer(N));
    }

    @Test
    public void case104() {
        long N = 41071462606L;
        assertEquals(750117836, minskymystery.computeAnswer(N));
    }

    @Test
    public void case105() {
        long N = 411282164164L;
        assertEquals(487561625, minskymystery.computeAnswer(N));
    }

    @Test
    public void case106() {
        long N = 80052724013L;
        assertEquals(350513123, minskymystery.computeAnswer(N));
    }

    @Test
    public void case107() {
        long N = 657164428388L;
        assertEquals(75478660, minskymystery.computeAnswer(N));
    }

    @Test
    public void case108() {
        long N = 253690000746L;
        assertEquals(914994630, minskymystery.computeAnswer(N));
    }

    @Test
    public void case109() {
        long N = 63345060786L;
        assertEquals(707710764, minskymystery.computeAnswer(N));
    }

    @Test
    public void case110() {
        long N = 86775214293L;
        assertEquals(739172521, minskymystery.computeAnswer(N));
    }

    @Test
    public void case111() {
        long N = 703837870306L;
        assertEquals(432523906, minskymystery.computeAnswer(N));
    }

    @Test
    public void case112() {
        long N = 86567864778L;
        assertEquals(987524007, minskymystery.computeAnswer(N));
    }

    @Test
    public void case113() {
        long N = 84631031817L;
        assertEquals(943076612, minskymystery.computeAnswer(N));
    }

    @Test
    public void case114() {
        long N = 636455831109L;
        assertEquals(570632159, minskymystery.computeAnswer(N));
    }

    @Test
    public void case115() {
        long N = 132336486706L;
        assertEquals(177699306, minskymystery.computeAnswer(N));
    }

    @Test
    public void case116() {
        long N = 72724370282L;
        assertEquals(535293703, minskymystery.computeAnswer(N));
    }

    @Test
    public void case117() {
        long N = 661765556521L;
        assertEquals(896568724, minskymystery.computeAnswer(N));
    }

    @Test
    public void case118() {
        long N = 475808264703L;
        assertEquals(164706634, minskymystery.computeAnswer(N));
    }

    @Test
    public void case119() {
        long N = 45572770802L;
        assertEquals(504696378, minskymystery.computeAnswer(N));
    }

    @Test
    public void case120() {
        long N = 257935587385L;
        assertEquals(51110126, minskymystery.computeAnswer(N));
    }

    @Test
    public void case121() {
        long N = 29460618561L;
        assertEquals(774843328, minskymystery.computeAnswer(N));
    }

    @Test
    public void case122() {
        long N = 866070866297L;
        assertEquals(156898751, minskymystery.computeAnswer(N));
    }

    @Test
    public void case123() {
        long N = 47539168631L;
        assertEquals(105722591, minskymystery.computeAnswer(N));
    }

    @Test
    public void case124() {
        long N = 33346970931L;
        assertEquals(217936614, minskymystery.computeAnswer(N));
    }

    @Test
    public void case125() {
        long N = 234250059026L;
        assertEquals(875199222, minskymystery.computeAnswer(N));
    }

    @Test
    public void case126() {
        long N = 456203051683L;
        assertEquals(650221118, minskymystery.computeAnswer(N));
    }

    @Test
    public void case127() {
        long N = 655050458446L;
        assertEquals(676583935, minskymystery.computeAnswer(N));
    }

    @Test
    public void case128() {
        long N = 154332755733L;
        assertEquals(939909040, minskymystery.computeAnswer(N));
    }

    @Test
    public void case129() {
        long N = 97860137303L;
        assertEquals(438301685, minskymystery.computeAnswer(N));
    }

    @Test
    public void case130() {
        long N = 948237557684L;
        assertEquals(831422034, minskymystery.computeAnswer(N));
    }

    @Test
    public void case131() {
        long N = 72541902122L;
        assertEquals(896655152, minskymystery.computeAnswer(N));
    }

    @Test
    public void case132() {
        long N = 375775526335L;
        assertEquals(878098766, minskymystery.computeAnswer(N));
    }

    @Test
    public void case133() {
        long N = 999999999961L;
        assertEquals(779047676, minskymystery.computeAnswer(N));
    }

    @Test
    public void case134() {
        long N = 99999999977L;
        assertEquals(290123875, minskymystery.computeAnswer(N));
    }

    @Test
    public void case135() {
        long N = 999999999989L;
        assertEquals(777026814, minskymystery.computeAnswer(N));
    }

    @Test
    public void case136() {
        long N = 99999999999L;
        assertEquals(333326282, minskymystery.computeAnswer(N));
    }

    @Test
    public void case137() {
        long N = 999999989987L;
        assertEquals(897960007, minskymystery.computeAnswer(N));
    }

    @Test
    public void case138() {
        long N = 1000000009L;
        assertEquals(877697702, minskymystery.computeAnswer(N));
    }

    @Test
    public void case139() {
        long N = 68718952447L;
        assertEquals(91912188, minskymystery.computeAnswer(N));
    }

    @Test
    public void case140() {
        long N = 22801763489L;
        assertEquals(177598378, minskymystery.computeAnswer(N));
    }

    @Test
    public void case141() {
        long N = 947147262401L;
        assertEquals(458754656, minskymystery.computeAnswer(N));
    }

    @Test
    public void case142() {
        long N = 1000023281L;
        assertEquals(44457138, minskymystery.computeAnswer(N));
    }

    @Test
    public void case143() {
        long N = 982451653L;
        assertEquals(746253085, minskymystery.computeAnswer(N));
    }

    @Test
    public void case144() {
        long N = 999999999937L;
        assertEquals(780784928, minskymystery.computeAnswer(N));
    }

    @Test
    public void case145() {
        long N = 298850081953L;
        assertEquals(249982808, minskymystery.computeAnswer(N));
    }

    @Test
    public void case146() {
        long N = 100000099963L;
        assertEquals(542875400, minskymystery.computeAnswer(N));
    }

    @Test
    public void case147() {
        long N = 900092400000L;
        assertEquals(323371652, minskymystery.computeAnswer(N));
    }

    @Test
    public void case148() {
        long N = 999999999999L;
        assertEquals(333262832, minskymystery.computeAnswer(N));
    }

    @Test
    public void case149() {
        long N = 3367900313L;
        assertEquals(814911882, minskymystery.computeAnswer(N));
    }

    @Test
    public void case150() {
        long N = 274876858367L;
        assertEquals(880140535, minskymystery.computeAnswer(N));
    }

    @Test
    public void case151() {
        long N = 733925199079L;
        assertEquals(886314019, minskymystery.computeAnswer(N));
    }

    @Test
    public void case152() {
        long N = 1000000007L;
        assertEquals(877697580, minskymystery.computeAnswer(N));
    }

    @Test
    public void case153() {
        long N = 99988877612L;
        assertEquals(961068503, minskymystery.computeAnswer(N));
    }

    @Test
    public void case154() {
        long N = 999999937L;
        assertEquals(877717060, minskymystery.computeAnswer(N));
    }

    @Test
    public void case155() {
        long N = 4294967297L;
        assertEquals(767219451, minskymystery.computeAnswer(N));
    }

    @Test
    public void case156() {
        long N = 200000000041L;
        assertEquals(215245476, minskymystery.computeAnswer(N));
    }

    @Test
    public void case157() {
        long N = 200560490131L;
        assertEquals(632944746, minskymystery.computeAnswer(N));
    }

    @Test
    public void case158() {
        long N = 27644437L;
        assertEquals(928053176, minskymystery.computeAnswer(N));
    }

    @Test
    public void case159() {
        long N = 9997954969L;
        assertEquals(841019510, minskymystery.computeAnswer(N));
    }

    @Test
    public void case160() {
        long N = 896767806551L;
        assertEquals(652961229, minskymystery.computeAnswer(N));
    }

    @Test
    public void case161() {
        long N = 999999899533L;
        assertEquals(381838114, minskymystery.computeAnswer(N));
    }

    @Test
    public void case162() {
        long N = 999990000017L;
        assertEquals(163550762, minskymystery.computeAnswer(N));
    }

    @Test
    public void case163() {
        long N = 999999999091L;
        assertEquals(844964456, minskymystery.computeAnswer(N));
    }

    @Test
    public void case164() {
        long N = 32416190071L;
        assertEquals(534118777, minskymystery.computeAnswer(N));
    }

    @Test
    public void case165() {
        long N = 987014682601L;
        assertEquals(681966847, minskymystery.computeAnswer(N));
    }

    @Test
    public void case166() {
        long N = 999999999959L;
        assertEquals(779192194, minskymystery.computeAnswer(N));
    }

    @Test
    public void case167() {
        long N = 100000003591L;
        assertEquals(315762591, minskymystery.computeAnswer(N));
    }

    @Test
    public void case168() {
        long N = 7427466391L;
        assertEquals(968995645, minskymystery.computeAnswer(N));
    }

    @Test
    public void case169() {
        long N = 59999999999L;
        assertEquals(323663620, minskymystery.computeAnswer(N));
    }

    @Test
    public void case170() {
        long N = 3214745587L;
        assertEquals(510206106, minskymystery.computeAnswer(N));
    }

    @Test
    public void case171() {
        long N = 3214747044L;
        assertEquals(251614557, minskymystery.computeAnswer(N));
    }

    @Test
    public void case172() {
        long N = 199199199203L;
        assertEquals(6626450, minskymystery.computeAnswer(N));
    }

}
