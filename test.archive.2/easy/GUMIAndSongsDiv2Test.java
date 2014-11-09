package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class GUMIAndSongsDiv2Test {
    GUMIAndSongsDiv2 gumiandsongsdiv2 = new GUMIAndSongsDiv2();

    @Test
    public void case1() {
        int[] duration = { 3, 5, 4, 11 };
        int[] tone = { 2, 1, 3, 1 };
        int T = 17;
        assertEquals(3, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case2() {
        int[] duration = { 100, 200, 300 };
        int[] tone = { 1, 2, 3 };
        int T = 10;
        assertEquals(0, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case3() {
        int[] duration = { 1, 2, 3, 4 };
        int[] tone = { 1, 1, 1, 1 };
        int T = 100;
        assertEquals(4, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case4() {
        int[] duration = { 8, 11, 7, 15, 9, 16, 7, 9 };
        int[] tone = { 3, 8, 5, 4, 2, 7, 4, 1 };
        int T = 14;
        assertEquals(1, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case5() {
        int[] duration = { 5611, 39996, 20200, 56574, 81643, 90131, 33486, 99568, 48112, 97168, 5600, 49145, 73590, 3979, 94614 };
        int[] tone = { 2916, 53353, 64924, 86481, 44803, 61254, 99393, 5993, 40781, 2174, 67458, 74263, 69710, 40044, 80853 };
        int T = 302606;
        assertEquals(8, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case6() {
        int[] duration = { 7, 3, 8, 10, 5 };
        int[] tone = { 10, 3, 7, 4, 4 };
        int T = 21;
        assertEquals(3, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case7() {
        int[] duration = { 180, 64, 194, 182, 126 };
        int[] tone = { 6, 10, 4, 2, 10 };
        int T = 377;
        assertEquals(3, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case8() {
        int[] duration = { 15511, 96784, 49559, 79364, 1194 };
        int[] tone = { 82806, 36122, 1632, 72191, 83263 };
        int T = 161860;
        assertEquals(3, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case9() {
        int[] duration = { 585, 46693, 87507, 18983, 857 };
        int[] tone = { 72110, 67267, 46054, 13813, 79447 };
        int T = 87515;
        assertEquals(3, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case10() {
        int[] duration = { 7757, 94260, 5990, 78040, 6218 };
        int[] tone = { 50368, 89875, 37140, 80371, 54114 };
        int T = 6226;
        assertEquals(1, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case11() {
        int[] duration = { 92065, 74560, 27400, 74298, 10134 };
        int[] tone = { 87992, 7123, 48859, 64136, 40707 };
        int T = 268332;
        assertEquals(4, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case12() {
        int[] duration = { 5, 9, 10, 9, 5 };
        int[] tone = { 3, 6, 2, 8, 1 };
        int T = 5;
        assertEquals(1, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case13() {
        int[] duration = { 184, 719, 2, 642, 508 };
        int[] tone = { 5, 4, 3, 4, 3 };
        int T = 696;
        assertEquals(3, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case14() {
        int[] duration = { 2, 2, 8, 9, 4 };
        int[] tone = { 705, 571, 94, 154, 506 };
        int T = 207;
        assertEquals(3, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case15() {
        int[] duration = { 849, 229, 862, 537, 525 };
        int[] tone = { 408, 876, 228, 626, 455 };
        int T = 1712;
        assertEquals(3, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case16() {
        int[] duration = { 761, 710, 428, 647, 351 };
        int[] tone = { 970, 34, 829, 866, 725 };
        int T = 883;
        assertEquals(2, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case17() {
        int[] duration = { 641, 387, 590, 576, 983 };
        int[] tone = { 83, 965, 535, 850, 252 };
        int T = 3076;
        assertEquals(4, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case18() {
        int[] duration = { 521, 474, 779, 826, 759 };
        int[] tone = { 394, 498, 466, 692, 713 };
        int T = 2852;
        assertEquals(4, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case19() {
        int[] duration = { 268, 766, 317, 549, 140 };
        int[] tone = { 831, 495, 876, 972, 789 };
        int T = 1457;
        assertEquals(4, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case20() {
        int[] duration = { 88423, 56358, 2188, 87875, 47626 };
        int[] tone = { 468, 264, 781, 207, 502 };
        int T = 283044;
        assertEquals(5, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case21() {
        int[] duration = { 3581, 30441, 17632, 54201, 60887 };
        int[] tone = { 895, 62, 428, 686, 736 };
        int T = 167575;
        assertEquals(5, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case22() {
        int[] duration = { 946, 792, 533, 740, 988 };
        int[] tone = { 62829, 42080, 83198, 97424, 52996 };
        int T = 11767;
        assertEquals(2, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case23() {
        int[] duration = { 701, 569, 396, 921, 272 };
        int[] tone = { 73252, 26923, 75391, 14995, 43937 };
        int T = 50406;
        assertEquals(4, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case24() {
        int[] duration = { 44150, 37390, 62368, 87796, 26023 };
        int[] tone = { 70403, 92580, 82501, 12396, 85115 };
        int T = 70878;
        assertEquals(2, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case25() {
        int[] duration = { 72938, 41967, 35939, 84908, 10104 };
        int[] tone = { 32917, 77148, 56632, 92604, 50558 };
        int T = 10104;
        assertEquals(1, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case26() {
        int[] duration = { 25933, 90960, 7487, 98543, 45080 };
        int[] tone = { 43593, 51674, 51420, 18156, 35526 };
        int T = 7487;
        assertEquals(1, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case27() {
        int[] duration = { 89010, 6011, 25730, 59281, 11476 };
        int[] tone = { 35554, 69388, 73079, 17894, 54235 };
        int T = 62061;
        assertEquals(3, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case28() {
        int[] duration = { 55216, 45038, 93986, 17154, 2780 };
        int[] tone = { 57182, 54843, 89172, 39356, 93335 };
        int T = 2780;
        assertEquals(1, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case29() {
        int[] duration = { 563, 873, 261, 971, 729 };
        int[] tone = { 233, 518, 301, 493, 823 };
        int T = 261;
        assertEquals(1, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case30() {
        int[] duration = { 306, 197, 604, 598, 161 };
        int[] tone = { 958, 35, 48, 350, 252 };
        int T = 2789;
        assertEquals(5, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case31() {
        int[] duration = { 5, 5, 4, 5, 2, 8, 9, 1, 2, 10 };
        int[] tone = { 2, 1, 10, 9, 4, 6, 10, 10, 7, 3 };
        int T = 3;
        assertEquals(1, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case32() {
        int[] duration = { 168, 64, 146, 118, 93, 11, 47, 151, 148, 71 };
        int[] tone = { 7, 7, 4, 2, 5, 1, 5, 4, 8, 6 };
        int T = 295;
        assertEquals(5, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case33() {
        int[] duration = { 43392, 35462, 52410, 32002, 759, 17428, 62349, 69300, 28924, 5941 };
        int[] tone = { 34823, 72319, 25970, 52995, 46267, 1867, 20737, 70020, 77561, 77096 };
        int T = 28934;
        assertEquals(1, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case34() {
        int[] duration = { 26115, 24549, 45521, 72597, 21211, 89925, 36664, 14655, 94519, 57861 };
        int[] tone = { 64369, 70143, 12700, 38643, 62609, 15454, 13808, 42854, 5408, 93574 };
        int T = 292988;
        assertEquals(6, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case35() {
        int[] duration = { 57154, 88527, 47503, 88875, 98402, 4643, 32704, 59689, 69196, 83063 };
        int[] tone = { 73221, 37211, 59496, 55984, 84110, 93406, 15212, 40922, 5340, 9327 };
        int T = 466493;
        assertEquals(7, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case36() {
        int[] duration = { 73202, 66211, 65562, 76014, 18674, 55766, 63736, 4807, 10942, 63595 };
        int[] tone = { 55078, 90572, 94129, 80465, 46774, 12139, 93706, 33819, 65826, 53831 };
        int T = 498516;
        assertEquals(8, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case37() {
        int[] duration = { 4, 2, 9, 3, 3, 8, 5, 8, 3, 10 };
        int[] tone = { 10, 10, 7, 10, 8, 4, 5, 6, 1, 10 };
        int T = 5;
        assertEquals(2, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case38() {
        int[] duration = { 761, 470, 634, 777, 858, 530, 737, 257, 567, 633 };
        int[] tone = { 5, 3, 5, 10, 4, 9, 4, 6, 2, 7 };
        int T = 2464;
        assertEquals(5, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case39() {
        int[] duration = { 1, 1, 6, 5, 4, 2, 9, 2, 5, 1 };
        int[] tone = { 583, 428, 971, 662, 879, 573, 121, 275, 105, 946 };
        int T = 97;
        assertEquals(3, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case40() {
        int[] duration = { 895, 587, 641, 493, 790, 861, 290, 879, 11, 958 };
        int[] tone = { 899, 789, 467, 694, 216, 661, 111, 392, 848, 460 };
        int T = 11;
        assertEquals(1, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case41() {
        int[] duration = { 173, 947, 99, 151, 565, 973, 72, 79, 677, 972 };
        int[] tone = { 264, 935, 154, 33, 462, 835, 436, 162, 343, 32 };
        int T = 5611;
        assertEquals(10, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case42() {
        int[] duration = { 383, 85, 353, 664, 603, 681, 600, 485, 263, 467 };
        int[] tone = { 688, 201, 853, 665, 750, 525, 514, 888, 103, 191 };
        int T = 2821;
        assertEquals(6, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case43() {
        int[] duration = { 848, 138, 975, 52, 453, 96, 749, 218, 186, 478 };
        int[] tone = { 623, 41, 442, 495, 51, 958, 28, 118, 349, 880 };
        int T = 5123;
        assertEquals(10, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case44() {
        int[] duration = { 22, 595, 709, 457, 887, 189, 666, 248, 671, 793 };
        int[] tone = { 793, 674, 238, 267, 52, 902, 540, 376, 594, 770 };
        int T = 2812;
        assertEquals(6, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case45() {
        int[] duration = { 81303, 59661, 78826, 43408, 39012, 54304, 58373, 53291, 86129, 86024 };
        int[] tone = { 688, 42, 398, 783, 421, 475, 116, 777, 531, 558 };
        int T = 468919;
        assertEquals(8, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case46() {
        int[] duration = { 83377, 34232, 87158, 73718, 93477, 1267, 14362, 51755, 70354, 5815 };
        int[] tone = { 613, 852, 830, 86, 724, 479, 773, 843, 318, 832 };
        int T = 252269;
        assertEquals(7, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case47() {
        int[] duration = { 388, 1, 427, 721, 785, 165, 293, 695, 761, 800 };
        int[] tone = { 43534, 18442, 72557, 6497, 78201, 12448, 49140, 78916, 4077, 60369 };
        int T = 2195;
        assertEquals(2, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case48() {
        int[] duration = { 308, 174, 117, 884, 463, 950, 677, 104, 325, 856 };
        int[] tone = { 17691, 7663, 25861, 97630, 87897, 40478, 80615, 8238, 65896, 65518 };
        int T = 76463;
        assertEquals(8, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case49() {
        int[] duration = { 10603, 72513, 19524, 31042, 88525, 81939, 47358, 90434, 34495, 26206 };
        int[] tone = { 73876, 81248, 9111, 67530, 81399, 62736, 85585, 30617, 64605, 8188 };
        int T = 187558;
        assertEquals(5, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case50() {
        int[] duration = { 11130, 3887, 95320, 89935, 8923, 14716, 98299, 29924, 73018, 88056 };
        int[] tone = { 95072, 84532, 79153, 27889, 35838, 99600, 58255, 31255, 97830, 71485 };
        int T = 391300;
        assertEquals(8, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case51() {
        int[] duration = { 1262, 52469, 22586, 62064, 12331, 13265, 27160, 367, 72656, 80040 };
        int[] tone = { 28504, 39350, 99221, 73410, 79910, 1380, 82702, 52652, 79439, 8209 };
        int T = 134423;
        assertEquals(5, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case52() {
        int[] duration = { 10285, 35081, 44274, 6375, 19265, 14928, 81629, 54324, 12764, 9838 };
        int[] tone = { 10727, 47400, 40162, 43699, 97501, 4253, 342, 75977, 30873, 56839 };
        int T = 29353;
        assertEquals(2, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case53() {
        int[] duration = { 74519, 14382, 54174, 48003, 40550, 1836, 28082, 18861, 67614, 37706 };
        int[] tone = { 56685, 40702, 21164, 19565, 94560, 20053, 14563, 96324, 72346, 45371 };
        int T = 160817;
        assertEquals(5, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case54() {
        int[] duration = { 180, 573, 459, 312, 705, 743, 167, 628, 699, 129 };
        int[] tone = { 220, 263, 835, 233, 744, 871, 994, 89, 186, 105 };
        int T = 129;
        assertEquals(1, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case55() {
        int[] duration = { 895, 178, 641, 4, 852, 663, 598, 18, 617, 373 };
        int[] tone = { 799, 777, 447, 261, 995, 356, 855, 71, 331, 936 };
        int T = 5763;
        assertEquals(10, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case56() {
        int[] duration = { 10, 3, 4, 7, 1, 1, 10, 10, 3, 1, 7, 6, 7, 10, 8 };
        int[] tone = { 5, 5, 2, 3, 7, 3, 10, 7, 8, 2, 5, 7, 8, 1, 1 };
        int T = 6;
        assertEquals(2, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case57() {
        int[] duration = { 26, 169, 79, 181, 120, 11, 162, 105, 122, 67, 69, 174, 194, 136, 30 };
        int[] tone = { 5, 10, 2, 5, 6, 3, 9, 6, 4, 10, 7, 9, 5, 8, 5 };
        int T = 868;
        assertEquals(10, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case58() {
        int[] duration = { 29809, 83687, 50861, 70763, 75248, 65912, 40710, 81772, 52083, 89619, 50262, 82469, 54744, 51072, 96282 };
        int[] tone = { 45937, 20655, 36291, 12050, 59829, 66359, 34886, 30829, 3748, 96378, 84712, 31907, 31509, 99448, 25481 };
        int T = 394792;
        assertEquals(6, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case59() {
        int[] duration = { 18300, 53426, 47581, 70408, 31813, 36062, 78947, 62886, 33333, 3176, 9705, 91495, 18902, 59098, 96366 };
        int[] tone = { 63241, 2790, 87470, 81055, 36539, 6637, 74223, 77725, 38789, 56483, 80139, 5402, 31543, 7328, 75128 };
        int T = 341665;
        assertEquals(9, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case60() {
        int[] duration = { 23487, 6388, 44951, 51490, 24119, 98470, 70115, 51656, 10311, 51426, 57159, 80810, 44355, 56124, 34516 };
        int[] tone = { 68463, 56408, 34518, 35775, 13446, 99535, 32165, 34132, 58993, 49762, 76731, 62769, 57157, 11170, 91789 };
        int T = 280370;
        assertEquals(7, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case61() {
        int[] duration = { 5760, 77464, 92736, 72114, 51641, 24684, 40492, 61651, 35095, 2841, 66742, 11794, 39431, 47046, 91649 };
        int[] tone = { 95093, 63365, 9002, 98815, 2560, 93467, 46793, 68403, 57930, 78011, 4450, 64546, 44785, 83219, 58014 };
        int T = 610142;
        assertEquals(12, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case62() {
        int[] duration = { 1, 3, 9, 5, 3, 9, 7, 3, 2, 7, 4, 8, 5, 9, 6 };
        int[] tone = { 3, 5, 9, 8, 10, 2, 2, 7, 2, 5, 4, 9, 9, 1, 5 };
        int T = 9;
        assertEquals(3, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case63() {
        int[] duration = { 556, 96, 378, 660, 673, 470, 738, 968, 300, 15, 922, 389, 67, 168, 385 };
        int[] tone = { 7, 2, 2, 7, 3, 6, 8, 4, 2, 10, 6, 6, 4, 2, 7 };
        int T = 654;
        assertEquals(5, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case64() {
        int[] duration = { 5, 7, 1, 9, 8, 2, 3, 6, 7, 3, 1, 7, 5, 7, 3 };
        int[] tone = { 550, 297, 339, 411, 279, 94, 649, 436, 735, 360, 351, 656, 956, 762, 999 };
        int T = 547;
        assertEquals(12, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case65() {
        int[] duration = { 626, 684, 261, 95, 608, 965, 907, 814, 89, 549, 587, 665, 233, 508, 469 };
        int[] tone = { 661, 638, 843, 670, 369, 626, 51, 969, 802, 615, 409, 118, 826, 494, 33 };
        int T = 1455;
        assertEquals(5, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case66() {
        int[] duration = { 90, 364, 464, 182, 483, 776, 160, 113, 582, 15, 229, 970, 1000, 852, 249 };
        int[] tone = { 974, 354, 626, 40, 124, 689, 192, 13, 356, 263, 600, 815, 437, 136, 647 };
        int T = 4668;
        assertEquals(12, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case67() {
        int[] duration = { 558, 773, 875, 95, 805, 472, 926, 740, 155, 3, 133, 463, 916, 494, 825 };
        int[] tone = { 455, 251, 574, 736, 559, 1, 458, 444, 743, 163, 675, 176, 495, 491, 23 };
        int T = 3115;
        assertEquals(8, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case68() {
        int[] duration = { 518, 605, 587, 70, 116, 483, 329, 225, 741, 218, 972, 924, 134, 41, 373 };
        int[] tone = { 755, 858, 774, 673, 886, 774, 536, 347, 24, 175, 319, 682, 864, 195, 495 };
        int T = 6226;
        assertEquals(14, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case69() {
        int[] duration = { 567, 395, 978, 825, 642, 401, 110, 221, 686, 388, 732, 410, 922, 1, 505 };
        int[] tone = { 290, 819, 80, 859, 549, 646, 433, 548, 213, 521, 256, 477, 395, 261, 641 };
        int T = 1417;
        assertEquals(5, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case70() {
        int[] duration = { 69410, 36530, 40417, 82610, 90369, 2500, 20011, 29608, 78343, 19974, 5236, 38696, 22962, 10717, 91625 };
        int[] tone = { 478, 642, 144, 412, 610, 463, 810, 336, 57, 36, 983, 765, 456, 986, 360 };
        int T = 111958;
        assertEquals(7, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case71() {
        int[] duration = { 20421, 411, 5982, 99689, 16833, 94930, 53587, 29372, 48736, 99408, 6166, 36718, 84768, 10618, 31558 };
        int[] tone = { 249, 40, 416, 623, 53, 381, 586, 993, 824, 486, 528, 841, 93, 843, 307 };
        int T = 640150;
        assertEquals(15, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case72() {
        int[] duration = { 690, 665, 868, 619, 387, 685, 185, 731, 947, 314, 118, 608, 652, 994, 122 };
        int[] tone = { 82420, 76187, 771, 36486, 18946, 18624, 85683, 28854, 28162, 62309, 88220, 4986, 80223, 48301, 67309 };
        int T = 63440;
        assertEquals(10, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case73() {
        int[] duration = { 148, 32, 381, 840, 170, 281, 334, 957, 536, 410, 247, 753, 626, 600, 632 };
        int[] tone = { 45976, 79740, 66433, 16320, 96148, 8058, 96586, 83478, 22238, 94589, 39178, 87570, 20813, 93753, 24566 };
        int T = 32;
        assertEquals(1, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case74() {
        int[] duration = { 49053, 33514, 92624, 46727, 68484, 36757, 3469, 43236, 23720, 31539, 43180, 64335, 91106, 12247, 27961 };
        int[] tone = { 20994, 95554, 32632, 73299, 61311, 72127, 59173, 17420, 94121, 24676, 12708, 7253, 7817, 11629, 28153 };
        int T = 572523;
        assertEquals(13, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case75() {
        int[] duration = { 60822, 65787, 55950, 43637, 19482, 30777, 51151, 62941, 20502, 93993, 98110, 27672, 83742, 87230, 80007 };
        int[] tone = { 14502, 74727, 40927, 18612, 3673, 48512, 10396, 16360, 27365, 26439, 5455, 241, 96415, 37358, 12 };
        int T = 189568;
        assertEquals(5, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case76() {
        int[] duration = { 81740, 44864, 43822, 43548, 81328, 40980, 62529, 13204, 48795, 38294, 28941, 47228, 85927, 49535, 82093 };
        int[] tone = { 79035, 98335, 55964, 12652, 87157, 57574, 45021, 64485, 13362, 31742, 11711, 63765, 87607, 94058, 85018 };
        int T = 153755;
        assertEquals(4, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case77() {
        int[] duration = { 85997, 48645, 72993, 50549, 84808, 97184, 1994, 41086, 98492, 50489, 90143, 68881, 74496, 39169, 91025 };
        int[] tone = { 18232, 82356, 23696, 16858, 67843, 5754, 37515, 64777, 18999, 79742, 41940, 65548, 14834, 4303, 70635 };
        int T = 878328;
        assertEquals(13, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case78() {
        int[] duration = { 21334, 20309, 97619, 9586, 15720, 67079, 16380, 80612, 94151, 27814, 89711, 25731, 32828, 26388, 97631 };
        int[] tone = { 85713, 74873, 7692, 98331, 35481, 33176, 77840, 59156, 98234, 64563, 50465, 5450, 77344, 4216, 68314 };
        int T = 290205;
        assertEquals(9, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case79() {
        int[] duration = { 44, 234, 939, 183, 812, 111, 752, 361, 503, 406, 780, 586, 657, 316, 291 };
        int[] tone = { 758, 179, 531, 573, 41, 766, 745, 383, 946, 374, 855, 323, 894, 86, 491 };
        int T = 44;
        assertEquals(1, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case80() {
        int[] duration = { 969, 417, 600, 449, 730, 697, 872, 738, 675, 416, 209, 712, 5, 714, 208 };
        int[] tone = { 844, 866, 134, 60, 968, 664, 879, 469, 71, 37, 174, 181, 107, 324, 477 };
        int T = 9342;
        assertEquals(15, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case81() {
        int[] duration = { 91207 };
        int[] tone = { 30187 };
        int T = 9;
        assertEquals(0, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case82() {
        int[] duration = { 88784 };
        int[] tone = { 62949 };
        int T = 88784;
        assertEquals(1, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case83() {
        int[] duration = { 12353, 98042 };
        int[] tone = { 49758, 57752 };
        int T = 98051;
        assertEquals(1, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case84() {
        int[] duration = { 1655, 48636 };
        int[] tone = { 83937, 50605 };
        int T = 1655;
        assertEquals(1, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case85() {
        int[] duration = { 34620, 10714, 88515 };
        int[] tone = { 91555, 57414, 35535 };
        int T = 88520;
        assertEquals(2, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case86() {
        int[] duration = { 33326, 32681, 86287 };
        int[] tone = { 47540, 91631, 76301 };
        int T = 110098;
        assertEquals(2, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case87() {
        int[] duration = { 99685, 84467, 965, 89894 };
        int[] tone = { 1314, 17472, 81261, 13663 };
        int T = 1;
        assertEquals(0, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case88() {
        int[] duration = { 95770, 56679, 12707, 93447 };
        int[] tone = { 76996, 58666, 69912, 69617 };
        int T = 80632;
        assertEquals(2, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case89() {
        int[] duration = { 32016, 27261, 48809, 97892, 19523 };
        int[] tone = { 18134, 24384, 39751, 86451, 71199 };
        int T = 144683;
        assertEquals(3, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case90() {
        int[] duration = { 63815, 51904, 30245, 86456, 57689 };
        int[] tone = { 38008, 80078, 16251, 43221, 73387 };
        int T = 353936;
        assertEquals(5, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case91() {
        int[] duration = { 25222, 68986, 63875, 73062, 46907, 21544 };
        int[] tone = { 31171, 8448, 26712, 6074, 89293, 26098 };
        int T = 68990;
        assertEquals(2, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case92() {
        int[] duration = { 92756, 84168, 39690, 16526, 26960, 87493 };
        int[] tone = { 1082, 75604, 87289, 76762, 36545, 86098 };
        int T = 305581;
        assertEquals(5, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case93() {
        int[] duration = { 85844, 88081, 96838, 15845, 3679, 11840, 33041 };
        int[] tone = { 31497, 33789, 6376, 99035, 81912, 58219, 89943 };
        int T = 85845;
        assertEquals(3, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case94() {
        int[] duration = { 27865, 54216, 9521, 46348, 50535, 86304, 95672 };
        int[] tone = { 97168, 84891, 14252, 62188, 4544, 92777, 97263 };
        int T = 69764;
        assertEquals(2, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case95() {
        int[] duration = { 28827, 69184, 13324, 59201, 19013, 79459, 48713, 14688 };
        int[] tone = { 31926, 45129, 60561, 5302, 40071, 58293, 13670, 75 };
        int T = 6;
        assertEquals(0, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case96() {
        int[] duration = { 45692, 58674, 82156, 41972, 4130, 19566, 45266, 62702 };
        int[] tone = { 46851, 24504, 12258, 97160, 39792, 77412, 61035, 94660 };
        int T = 276696;
        assertEquals(6, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case97() {
        int[] duration = { 52924, 65025, 97462, 90923, 89818, 71667, 68899, 18501, 80078 };
        int[] tone = { 62498, 12415, 32985, 10061, 30101, 42539, 6233, 21791, 61436 };
        int T = 154849;
        assertEquals(2, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case98() {
        int[] duration = { 98718, 53781, 52671, 36036, 76575, 96069, 2328, 17251, 92915 };
        int[] tone = { 91019, 9678, 33097, 64910, 73690, 24082, 46166, 69378, 15897 };
        int T = 144567;
        assertEquals(4, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case99() {
        int[] duration = { 68697, 51701, 18879, 96981, 4027, 6978, 28891, 2478, 57296, 23733 };
        int[] tone = { 97030, 29132, 46428, 66941, 91642, 10373, 18369, 28836, 63096, 14521 };
        int T = 184559;
        assertEquals(6, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case100() {
        int[] duration = { 43659, 43831, 97312, 74423, 67238, 25886, 23298, 24087, 21645, 52511 };
        int[] tone = { 71551, 73450, 40123, 68992, 58403, 28353, 26522, 64564, 15624, 78700 };
        int T = 365231;
        assertEquals(8, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case101() {
        int[] duration = { 19670, 38399, 35277, 48805, 7498, 23627, 45351, 38641, 22904, 45963, 71330 };
        int[] tone = { 83745, 38075, 69055, 76321, 60153, 80340, 92138, 17173, 52426, 51611, 20292 };
        int T = 35279;
        assertEquals(1, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case102() {
        int[] duration = { 84684, 83910, 19003, 89574, 45216, 43145, 20790, 9381, 28177, 57216, 32784 };
        int[] tone = { 6992, 83770, 70633, 39317, 74550, 26457, 7525, 13689, 76188, 95423, 88410 };
        int T = 189159;
        assertEquals(5, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case103() {
        int[] duration = { 82219, 3460, 27171, 33263, 36336, 73819, 63165, 67155, 17884, 8499, 30029, 10709 };
        int[] tone = { 26368, 6021, 30009, 72084, 64597, 87466, 31206, 74389, 54356, 41387, 29299, 5188 };
        int T = 27179;
        assertEquals(2, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case104() {
        int[] duration = { 41400, 82598, 58954, 2041, 4264, 37028, 45651, 52739, 1349, 29475, 79413, 82529 };
        int[] tone = { 83329, 9477, 56547, 52210, 23285, 49464, 29543, 26866, 30258, 72471, 79486, 95608 };
        int T = 412358;
        assertEquals(10, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case105() {
        int[] duration = { 61047, 46331, 91182, 49920, 18237, 11274, 844, 9826, 40205, 2891, 60474, 37257, 38513 };
        int[] tone = { 1055, 47343, 7874, 1977, 30929, 42728, 13679, 89742, 36119, 5285, 40666, 81217, 35163 };
        int T = 61051;
        assertEquals(3, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case106() {
        int[] duration = { 30757, 85053, 39120, 52732, 34072, 84163, 58331, 38006, 30655, 35950, 774, 14926, 52922 };
        int[] tone = { 77786, 95235, 22265, 97837, 56582, 51753, 52283, 93251, 62003, 99422, 20912, 78840, 59574 };
        int T = 302770;
        assertEquals(8, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case107() {
        int[] duration = { 45786, 50570, 23378, 28567, 40549, 256, 14536, 13740, 48656, 13348, 34349, 21050, 41583, 53281 };
        int[] tone = { 23425, 96600, 73398, 8147, 90197, 35173, 87685, 4681, 68527, 9402, 91060, 34123, 61270, 86900 };
        int T = 34354;
        assertEquals(2, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case108() {
        int[] duration = { 74974, 66968, 65777, 61167, 64418, 18852, 25509, 64149, 82072, 14497, 85248, 26585, 37977, 85927 };
        int[] tone = { 55003, 11037, 70404, 96914, 45697, 99029, 15002, 57329, 6153, 40332, 66053, 48559, 42477, 95489 };
        int T = 780040;
        assertEquals(13, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case109() {
        int[] duration = { 7625, 96331, 2149, 45115, 20266, 49418, 26973, 33421, 53168, 77107, 36990, 30623, 53187, 29801, 41213 };
        int[] tone = { 82466, 70708, 50013, 38715, 92695, 42094, 25763, 43493, 39306, 59783, 32128, 47709, 39350, 44957, 87118 };
        int T = 145547;
        assertEquals(5, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case110() {
        int[] duration = { 82545, 70169, 63288, 58, 6598, 53012, 52125, 62527, 71120, 74260, 3856, 6929, 67862, 40789, 13240 };
        int[] tone = { 39166, 84860, 37734, 13196, 94606, 73681, 70658, 23350, 76663, 38214, 59581, 27639, 90549, 50630, 52638 };
        int T = 58;
        assertEquals(1, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case111() {
        int[] duration = { 10, 10, 10 };
        int[] tone = { 58, 58, 58 };
        int T = 30;
        assertEquals(3, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case112() {
        int[] duration = { 5611, 39996, 20200, 56574, 81643, 90131, 33486, 99568, 48112, 97168, 5600, 49145, 73590, 3979, 94614 };
        int[] tone = { 2916, 53353, 64924, 86481, 44803, 61254, 99393, 5993, 40781, 2174, 67458, 74263, 69710, 40044, 80853 };
        int T = 302606;
        assertEquals(8, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case113() {
        int[] duration = { 1, 3, 2, 4, 2, 4, 5, 2, 4, 2, 3, 1, 4, 2, 3 };
        int[] tone = { 4, 5, 2, 3, 3, 1, 2, 4, 5, 2, 1, 4, 2, 3, 2 };
        int T = 1000000;
        assertEquals(15, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case114() {
        int[] duration = { 30456, 36190, 43739, 7390, 13970, 98364, 35552, 79176, 30475, 13050, 48600, 13772, 24, 36867, 62611 };
        int[] tone = { 79700, 61055, 39136, 30780, 90591, 48417, 42126, 48410, 70323, 97320, 57520, 84276, 21064, 25450, 80088 };
        int T = 591941;
        assertEquals(14, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case115() {
        int[] duration = { 5611, 39996, 20200, 56574, 81643, 90131, 33486, 99568, 48112, 97168, 5600, 49145, 73590, 3979, 94614 };
        int[] tone = { 2916, 53353, 64924, 86481, 44803, 61254, 99393, 5993, 40781, 2174, 67458, 74263, 69710, 40044, 80853 };
        int T = 3026060;
        assertEquals(15, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case116() {
        int[] duration = { 1, 2, 3, 4 };
        int[] tone = { 100, 1, 1, 1 };
        int T = 10;
        assertEquals(3, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case117() {
        int[] duration = { 5611, 1, 20200, 56574, 81643, 90131, 2, 99568, 48112, 97168, 5600, 3, 73590, 3979, 4 };
        int[] tone = { 2916, 1, 64924, 86481, 44803, 61254, 99393, 2, 40781, 2174, 67458, 74263, 69710, 40044, 80853 };
        int T = 302606;
        assertEquals(10, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case118() {
        int[] duration = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 100000 };
        int[] tone = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int T = 100000;
        assertEquals(14, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case119() {
        int[] duration = { 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000 };
        int[] tone = { 100000, 1, 100000, 1, 100000, 1, 100000, 1, 100000, 1, 100000, 1, 100000, 1, 100000 };
        int T = 10000000;
        assertEquals(15, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case120() {
        int[] duration = { 1, 3, 7, 4, 1, 10, 3, 4, 4, 7, 7, 4, 1 };
        int[] tone = { 1, 3, 1, 2, 2, 4, 3, 2, 3, 1, 1, 2, 2 };
        int T = 15;
        assertEquals(6, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case121() {
        int[] duration = { 5611, 39996, 20200, 56574, 81643, 90131, 33486, 99568, 48112, 97168, 5600, 49145, 73590, 3979, 94614 };
        int[] tone = { 1, 53353, 64924, 86481, 44803, 61254, 99393, 5993, 40781, 2174, 67458, 74263, 69710, 40044, 80853 };
        int T = 302606;
        assertEquals(7, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case122() {
        int[] duration = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] tone = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int T = 10000;
        assertEquals(15, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case123() {
        int[] duration = { 5611, 39996, 20200, 56574, 81643, 90131, 33486, 99568, 48112, 97168, 5600, 49145, 73590, 3979, 94614 };
        int[] tone = { 2916, 53353, 64924, 86481, 44803, 61254, 99393, 5993, 40781, 2174, 67458, 74263, 69710, 40044, 80853 };
        int T = 9026060;
        assertEquals(15, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case124() {
        int[] duration = { 100, 200, 300 };
        int[] tone = { 1, 2, 3 };
        int T = 10;
        assertEquals(0, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case125() {
        int[] duration = { 1, 10, 10, 10 };
        int[] tone = { 1, 1000, 1000, 1000 };
        int T = 30;
        assertEquals(3, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case126() {
        int[] duration = { 1, 25, 1, 25, 1 };
        int[] tone = { 1, 1, 1, 1, 1 };
        int T = 15;
        assertEquals(3, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case127() {
        int[] duration = { 200, 200, 200, 200, 1, 1, 1, 1 };
        int[] tone = { 50, 50, 50, 50, 50, 50, 50, 50 };
        int T = 250;
        assertEquals(5, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case128() {
        int[] duration = { 3, 5 };
        int[] tone = { 6, 7 };
        int T = 2;
        assertEquals(0, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case129() {
        int[] duration = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] tone = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int T = 10000000;
        assertEquals(15, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case130() {
        int[] duration = { 1000, 1000, 1, 1, 1 };
        int[] tone = { 1, 1, 2, 3, 4 };
        int T = 100;
        assertEquals(3, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case131() {
        int[] duration = { 1000, 1, 1, 1, 1 };
        int[] tone = { 1, 1, 1, 1, 1 };
        int T = 50;
        assertEquals(4, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case132() {
        int[] duration = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5 };
        int[] tone = { 1, 2, 3, 5, 6, 7, 66, 55, 44, 33, 22, 55, 666, 22 };
        int T = 100;
        assertEquals(11, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case133() {
        int[] duration = { 83607, 37500, 31253, 44589, 13988, 84792, 34549, 48875, 15610, 15579, 99864, 36287, 34438, 99934, 7782 };
        int[] tone = { 95588, 91314, 33591, 84790, 60931, 26670, 50612, 60395, 44363, 81573, 80894, 34811, 57503, 95869, 58857 };
        int T = 10000000;
        assertEquals(15, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case134() {
        int[] duration = { 100, 1, 1, 1, 1, 100 };
        int[] tone = { 1, 900, 901, 902, 903, 2000 };
        int T = 10;
        assertEquals(4, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case135() {
        int[] duration = { 5, 6, 4 };
        int[] tone = { 10, 2, 2 };
        int T = 10;
        assertEquals(2, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case136() {
        int[] duration = { 1, 5, 9, 11, 17, 20 };
        int[] tone = { 1, 10000, 3, 10000, 5, 10000 };
        int T = 100000;
        assertEquals(6, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case137() {
        int[] duration = { 23, 23, 23, 32, 32, 46, 1, 1 };
        int[] tone = { 6, 6, 5, 5, 8, 8, 9, 1 };
        int T = 39;
        assertEquals(3, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case138() {
        int[] duration = { 3, 3, 3 };
        int[] tone = { 3, 10, 4 };
        int T = 18;
        assertEquals(3, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case139() {
        int[] duration = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] tone = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int T = 10000000;
        assertEquals(15, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case140() {
        int[] duration = { 2, 4, 4 };
        int[] tone = { 100, 1, 1 };
        int T = 20;
        assertEquals(2, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case141() {
        int[] duration = { 2, 2, 5, 11 };
        int[] tone = { 3, 3, 1, 1 };
        int T = 9;
        assertEquals(2, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case142() {
        int[] duration = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] tone = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int T = 12;
        assertEquals(12, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case143() {
        int[] duration = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 100000 };
        int[] tone = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int T = 50;
        assertEquals(14, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case144() {
        int[] duration = { 1, 1, 1, 1, 1 };
        int[] tone = { 1, 10, 10, 10, 10 };
        int T = 6;
        assertEquals(4, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case145() {
        int[] duration = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] tone = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int T = 1000000;
        assertEquals(15, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case146() {
        int[] duration = { 5611, 39996, 20200, 56574, 81643, 90131, 33486, 99568, 48112, 97168, 5600, 49145, 73590, 3979, 94614 };
        int[] tone = { 2916, 53353, 64924, 86481, 44803, 61254, 99393, 5993, 40781, 2174, 67458, 74263, 69710, 40044, 80853 };
        int T = 10000000;
        assertEquals(15, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case147() {
        int[] duration = { 10, 2, 5, 1 };
        int[] tone = { 8, 1, 1, 1 };
        int T = 3;
        assertEquals(2, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case148() {
        int[] duration = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] tone = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int T = 302606;
        assertEquals(15, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case149() {
        int[] duration = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
        int[] tone = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int T = 9999;
        assertEquals(15, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case150() {
        int[] duration = { 1, 2, 2 };
        int[] tone = { 10, 1, 1 };
        int T = 6;
        assertEquals(2, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case151() {
        int[] duration = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] tone = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int T = 15;
        assertEquals(15, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case152() {
        int[] duration = { 1, 100, 1 };
        int[] tone = { 1, 2, 3 };
        int T = 104;
        assertEquals(3, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case153() {
        int[] duration = { 1, 2, 3 };
        int[] tone = { 10, 2, 2 };
        int T = 10;
        assertEquals(2, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case154() {
        int[] duration = { 4, 2, 3 };
        int[] tone = { 13, 1, 6 };
        int T = 10;
        assertEquals(2, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case155() {
        int[] duration = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] tone = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int T = 18;
        assertEquals(15, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case156() {
        int[] duration = { 1, 2, 3, 4, 5 };
        int[] tone = { 1, 99995, 99998, 99997, 99998 };
        int T = 30;
        assertEquals(4, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case157() {
        int[] duration = { 1, 2, 3 };
        int[] tone = { 1, 15, 2 };
        int T = 5;
        assertEquals(2, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case158() {
        int[] duration = { 100, 5, 5, 5, 5 };
        int[] tone = { 1, 1, 1, 1, 1 };
        int T = 20;
        assertEquals(4, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case159() {
        int[] duration = { 393, 202, 565, 816, 901, 334, 995, 481, 971, 560, 491, 735, 946, 322, 555 };
        int[] tone = { 291, 533, 649, 864, 448, 612, 993, 407, 674, 742, 697, 400, 808, 777, 104 };
        int T = 10000000;
        assertEquals(15, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case160() {
        int[] duration = { 1, 2, 3 };
        int[] tone = { 1, 100, 2 };
        int T = 5;
        assertEquals(2, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case161() {
        int[] duration = { 3, 5, 4, 11 };
        int[] tone = { 2, 1, 3, 1 };
        int T = 17;
        assertEquals(3, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case162() {
        int[] duration = { 1, 1, 100 };
        int[] tone = { 1, 2, 1 };
        int T = 103;
        assertEquals(3, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

    @Test
    public void case163() {
        int[] duration = { 4, 4, 4, 4, 4, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2 };
        int[] tone = { 1, 1, 1, 1, 1, 4, 4, 4, 4, 4, 7, 7, 7, 7, 7 };
        int T = 30;
        assertEquals(10, gumiandsongsdiv2.maxSongs(duration, tone, T));
    }

}
