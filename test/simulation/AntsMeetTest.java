package topc.test.simulation;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.simulation.*;

public class AntsMeetTest {
    AntsMeet antsmeet = new AntsMeet();

    @Test
    public void case1() {
        int[] x = { 0, 10, 20, 30 };
        int[] y = { 0, 10, 20, 30 };
        String direction = "NWNE";
        assertEquals(2, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case2() {
        int[] x = { -10, 0, 0, 10 };
        int[] y = { 0, -10, 10, 0 };
        String direction = "NEWS";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case3() {
        int[] x = { 0, 9, 0, 0 };
        int[] y = { 0, 0, 4, 5 };
        String direction = "EWSS";
        assertEquals(2, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case4() {
        int[] x = { -1, 1, 0, -1, 1, 0, 0, -1, 1 };
        int[] y = { 0, 0, 0, -1, -1, 1, -1, 1, 1 };
        String direction = "EENWWSWSE";
        assertEquals(5, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case5() {
        int[] x = { -2, -3, -2, 1, -3 };
        int[] y = { -1, -1, -3, 3, -2 };
        String direction = "SWNSE";
        assertEquals(2, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case6() {
        int[] x = { -1, -1, -1, 0, 0, 0, 1, 1, 1 };
        int[] y = { -1, 0, 1, -1, 0, 1, -1, 0, 1 };
        String direction = "ESEWNNEWW";
        assertEquals(4, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case7() {
        int[] x = { 4, 7, 6, 2, 6, 5, 7, 7, 8, 4, 7, 8, 8, 8, 5, 4, 8, 9, 1, 5, 9, 3, 4, 0, 0, 1, 0, 7, 2, 6, 9, 6, 3, 0, 5, 5, 1, 2, 0, 4, 9, 7, 7, 1, 8, 1, 9, 2, 7, 3 };
        int[] y = { 2, 3, 0, 6, 8, 4, 9, 0, 5, 0, 2, 4, 3, 8, 1, 5, 0, 7, 3, 7, 0, 9, 8, 1, 9, 4, 7, 8, 1, 1, 6, 6, 6, 2, 8, 5, 1, 9, 0, 1, 1, 1, 7, 0, 2, 5, 4, 7, 5, 3 };
        String direction = "SSNWSWSENSWSESWEWSWSENWNNNESWSWSWWSSWEEWWNWWWNWENN";
        assertEquals(25, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case8() {
        int[] x = { 0 };
        int[] y = { 0 };
        String direction = "N";
        assertEquals(1, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case9() {
        int[] x = { -1000, 1000 };
        int[] y = { -1000, 1000 };
        String direction = "NW";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case10() {
        int[] x = { 412, 412, 734, 734 };
        int[] y = { 597, 275, 597, 275 };
        String direction = "SEEE";
        assertEquals(4, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case11() {
        int[] x = { -328, 312, 616, 632, 632, -328, 616, 535, 431, 312, 431, 535 };
        int[] y = { 707, 386, 123, -253, 707, -253, 308, 609, 308, 609, 123, 386 };
        String direction = "NNWWEWNWSESE";
        assertEquals(8, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case12() {
        int[] x = { 70, -126, 816, -479, 557, 918, -406, -126, -394, -394, 764, 816, 70, -479, 388, 557, -406, 764, 918, 388 };
        int[] y = { 7, 481, -246, 821, -604, 7, 821, 749, 481, 749, -397, -674, 855, 748, -246, -397, 748, -604, 855, -674 };
        String direction = "WEEEESSSNNSSSESNEWEN";
        assertEquals(14, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case13() {
        int[] x = { -531, 406, 232, 648, 547, 470, 648, 406, -168, 814, 503, 322, 434, 828, 503, 648, -443, 828, -220, 470, 502, 404, -592, 322, 547, -531, 457, 648, 502, 729, -443, -168, 404, 729, 457, -220, 232, 814, 434, -592 };
        int[] y = { 625, -692, -73, 605, 179, 102, 585, -595, 585, 207, -692, -73, 387, -7, -595, -231, -218, 387, 991, 179, 459, 207, 564, 17, 102, 564, 991, 459, 605, 954, 954, -231, 617, -218, 314, 314, 17, 617, -7, 625 };
        String direction = "ESNEWWSWNSWWNENNESNWSNSWWNNNSWNNWEEWESNN";
        assertEquals(36, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case14() {
        int[] x = { 499, 497, 968, 601, -487, 234, -59, -59, 228, -297, 898, 497, 602, 224, 499, 228, 602, -487, 115, -256, 341, 573, 417, -331, 341, -465, 869, -297, 670, 716, 224, 23, 467, 670, 383, 756, 898, 115, 23, -331, 261, 261, 573, 417, -219, 869, 467, -219, 328, 601 };
        int[] y = { 604, 729, 324, 335, 862, 335, 434, 862, 211, 962, 163, 699, -129, 560, 433, -348, 138, 434, 119, 519, 324, 766, 606, -348, 962, -238, 138, 324, 163, 905, 359, 560, 729, 391, 119, 536, 391, -149, 359, 211, 766, 454, 454, 905, 519, -129, 699, 482, 433, -32 };
        String direction = "WSNEWWNESESSWENSWSNWSSSESWENWSWNSNEWWSSNNNNWNNWSWW";
        assertEquals(46, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case15() {
        int[] x = { 45, -16, -400, -271, -301, 883, -350, -214, -25, -641, -271, -697, -156, -301, 950, 552, 742, -670, -16, 883, -506, 314, -214, 542, 81, 45, 264, 81, 613, 348, 799, -25, 683, 552, -350, 542, -670, 692, 683, 742, 264, -697, 613, 950, -132, -641, 799, -506, -156, 862 };
        int[] y = { 591, -464, 525, 814, 259, 136, 599, -464, 744, 138, 675, 599, -119, 908, -137, -195, 437, 807, -266, -195, 631, 807, -266, 437, -119, 372, 372, -356, -381, 259, -381, 36, 36, 136, 946, 237, -177, -558, 744, 237, 591, 946, -195, 531, 675, 165, -195, 525, -356, -558 };
        String direction = "NNSNSSSWNNNSNSENSNEWESWSWWWWSWEEWESEEWWSSEWSNNENEN";
        assertEquals(38, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case16() {
        int[] x = { -205, 454, -176, 667, 846, 51, 785, 846, 7, -160, 929, 87, -160, 503, -253, 881, -166, 830, 334, -533, 619, 486, -205, 63, 503, 486, -498, 667, 929, 51, 63, 583, 87, 830, 388, 7, 388, -54, -582, -257, 583, -371, -367, -176, -253, 454, -54, -180, -166, -498 };
        int[] y = { -193, -193, 531, -185, 902, 695, 639, 542, 714, -280, -486, -151, 710, -51, 757, -180, -51, 710, -533, 469, -185, 902, 466, 695, 618, 542, -644, -137, 810, 707, 707, 118, 469, -280, 41, 531, 686, -686, -686, 41, -180, 875, -486, 714, 875, 466, -158, -533, 618, 639 };
        String direction = "SWESEWENNSNNESWNSSESSWSENNWSWEWWWNEESWNENNWENNWWNS";
        assertEquals(40, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case17() {
        int[] x = { -173, -678, -129, 100, 965, -341, -388, -388, 694, 44, 152, -509, -193, -407, -407, 485, 44, 986, -97, 559, -97, -202, 986, -678, 379, -105, 888, -341, 270, 912, 559, 888, 18, 291, 270, 291, -193, -129, 485, 773, 912, -491, -665, 965, -598, -491, 694, -105, -202, -598 };
        int[] y = { 691, 691, -20, 668, 936, 668, -471, 69, 665, 796, 69, 226, 865, -235, 657, -235, 655, -622, 655, 385, 796, -322, 469, 186, 493, 469, 385, 227, 602, -240, 56, 56, 231, 999, 493, 110, -240, -382, 657, 231, 865, -382, 141, 665, 110, -20, 936, -622, 141, 999 };
        String direction = "NESEENNSWWWWNSESSWENNNWNNSEWWESNNWNNSSNSSWWWEWWNNS";
        assertEquals(46, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case18() {
        int[] x = { 545, 449, 683, 144, -584, 858, -237, -153, 538, 771, 339, 819, 631, 631, -544, 995, -193, -12, 84, 771, 84, 545, 764, -137, 819, -193, 538, -471, -237, 858, -12, 697, 144, 449, 289, -471, 72, 72, -137, 888, 289, -274, 888, 226, 120, 697, 683, 339, -274, 120 };
        int[] y = { -325, 259, -320, 286, 35, -12, 975, 750, 462, -223, 559, -81, 773, 286, 359, -320, 503, 503, -216, 428, -228, -12, 462, 259, 975, 684, 236, 60, -81, -325, 684, 367, 773, 845, 654, 257, -228, -216, 845, 367, 336, 60, 176, 446, 428, 176, -8, 446, 257, -223 };
        String direction = "NSESWENSWWNNSSWENNENSSESSSSENENSWSNEESWWNSSSEWSWWE";
        assertEquals(40, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case19() {
        int[] x = { -66, 903, 498, -394, 389, -381, 462, 184, -29, 231, 415, -469, -394, -388, 636, 636, 415, 498, -577, 288, -469, 4, 14, 462, -324, 0, 744, 402, -341, -341, 389, 903, -482, -324, -625, -625, -195, 231, -486, 582, 288, -490, -490, -577, 0, -388, -22, 4, 744, -482 };
        int[] y = { 820, -34, 57, 492, -306, 303, -45, -34, 571, 752, -306, 750, 820, 296, -94, 571, -332, 577, 750, -119, 858, -6, 535, -105, 924, -119, 558, -105, 558, -527, -332, 685, 674, 18, 817, 674, 39, 535, -6, 18, -407, 39, 334, 858, -407, 303, 57, 484, -527, 817 };
        String direction = "SSNNSESSSEEWSNWSNEEWSEWWWNSSSSNSEEENESSWWEWWNEWWWW";
        assertEquals(34, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case20() {
        int[] x = { 478, -664, 759, 434, -405, 513, 565, -396, 311, -174, 56, 993, 251, -341, 993, -112, 242, 129, 383, 513, -78, -341, -148, 129, 423, 493, 434, -405, 478, -148, 929, 251, 56, 242, 929, -78, 423, -664, 802, 251, 759, 383, -112, -591, -591, -248, 660, 660, 735, 493 };
        int[] y = { -186, 98, 948, 795, 289, -678, 948, -170, -195, 290, -354, -424, 289, -157, -166, 150, 706, -678, 684, -294, -234, 36, 36, -294, -216, -234, 427, 945, 265, -157, 265, 715, 275, 715, -186, 337, 798, -170, 427, 706, 754, 961, 286, -216, 798, 286, 961, 684, -424, 337 };
        String direction = "WNSNNSSWWWEENWESNSWSWSEWWEWEWWWNWESNSSNNSNNWWWNESE";
        assertEquals(44, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case21() {
        int[] x = { -12, 133, 648, 597, 231, 841, 455, 81, 257, -541, 589, -541, -142, -471, 359, 55, 55, -78, -12, -78, -220, 841, -220, 133, -691, -531, 111, -297, 771, 575, -471, -188, 597, 359, 575, 910, 81, 455, -277, -12, -277, 771, -490, 111, 231, 257, 648, -490, 910, -188 };
        int[] y = { -197, -342, -84, -26, 384, 603, 603, -507, -507, 388, 402, 439, 76, -111, 512, -400, -267, -267, -342, -400, 626, 989, 594, -197, 731, 65, -111, 65, -84, 388, 471, 626, 287, 384, 402, 287, -331, 989, 612, 52, 489, -207, 439, 471, 512, -331, -207, 388, -26, 594 };
        String direction = "SWSSNENWNNSWENSWESEEEESENNNSNWNSSWSSWEWWSSNNESSWSN";
        assertEquals(42, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case22() {
        int[] x = { -326, 275, 96, 528, -247, 584, 275, 511, 603, 436, 857, 857, -1, -247, 226, -470, 22, 625, -115, -117, 88, -388, 528, 511, 302, -326, 22, -59, 854, -1, -310, 722, 722, -117, 781, -59, 508, 697, 235, 235, 625, 864, -208, 508, 854, 781, 302, 584, -115, 603 };
        int[] y = { 398, 701, -24, -656, -208, 758, 254, 646, 609, -8, 270, -79, 728, -76, 202, 342, 67, -376, -76, 260, 728, 521, 342, 293, 308, -24, -692, 308, 830, 639, 260, 701, 254, 453, -692, -376, 270, 758, -209, -8, 308, 293, 701, -79, 202, 67, 609, 871, -208, 308 };
        String direction = "SSWSWENSEWESWWNWWSWWESSSSWNNWNWNESWSEWWEWSWEWSEEWE";
        assertEquals(38, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case23() {
        int[] x = { 532, -557, 662, 4, -624, -160, 460, 591, -557, -21, -201, -338, -474, 910, -338, 932, 29, 805, 459, 906, 821, 805, -160, 662, 906, -624, 932, 522, -311, 460, 4, -494, 459, -474, -494, 579, 454, 821, 591, 579, 910, 482, -177, 454, 29, 32, 532, -338, 482, -21 };
        int[] y = { 651, 895, 129, 334, 738, -438, 938, 687, 334, -576, 416, -259, -200, 700, -481, 789, 451, -241, 129, -438, 940, -564, 628, -74, 628, 82, -481, 312, 528, 301, 895, 528, -74, 853, 345, -200, 824, 651, 824, 853, 312, -241, 938, 687, 322, 82, 940, 789, -564, -259 };
        String direction = "ESNWSNEWNSSSESSWENWSSSNNWNSENWWWSESSSNEWEEEEWEEWSS";
        assertEquals(36, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case24() {
        int[] x = { 744, 193, -284, 582, -141, 193, 635, 75, -617, -125, -372, 258, 495, 71, 899, -141, 10, 816, -175, 497, 487, 582, 82, -617, 487, 899, 253, 744, 816, -478, 82, -536, -125, 161, -245, 253, 71, 342, 75, 792, -536, 296, 258, 10, 792, 161, 344, 497, -478, 635 };
        int[] y = { -408, 786, 982, -365, 539, 344, 344, 854, 854, 342, 371, 723, 405, 417, 564, 573, 158, -408, 573, 645, 723, 342, 493, 162, 494, 671, 632, -480, -480, 371, 631, 127, -365, 127, 101, 543, 101, 543, 162, 564, 824, 402, 494, 645, 671, 824, 405, 158, 265, 786 };
        String direction = "NNNWWSESSENNSWSEENNNNESWSSESSSNENSWEESNEESENSNNWWS";
        assertEquals(44, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case25() {
        int[] x = { 255, -201, 617, 236, -572, -365, 236, 346, -497, -494, 303, -494, -572, 549, 878, -199, -676, 549, 16, 285, 245, 105, -658, -242, -450, 883, -201, -694, -269, -269, -676, -450, -694, 617, 896, 33, 910, 883, 896, -157, -365, 255, -86, 105, 878, -370, 285, 346, -497, -157 };
        int[] y = { 901, 670, -364, -394, 889, 682, 280, 757, -214, 96, 685, 52, 785, 931, -58, 300, 785, 685, 729, -58, 300, 757, 234, 670, 52, -364, 711, -214, 840, 739, 889, 96, -411, -98, -151, 901, -394, -98, 729, -267, 961, 679, 682, 516, 535, 840, 535, 516, -411, 234 };
        String direction = "WWESWSNEEWWEESWWNEEESESNSSWSNWWWWSSSNNEWNNEWNESNWE";
        assertEquals(38, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case26() {
        int[] x = { -212, -154, 956, 653, 176, 72, -653, -157, -34, -653, -538, 200, 278, 5, -45, 397, 574, 571, 72, 534, 219, 397, 391, 239, -538, -212, 574, 160, 5, 457, -45, -60, 414, 150, -534, 150, 278, 653, 414, 939, 168, -60, 200, 956, -154, 219, 571, 457, -534, -157 };
        int[] y = { -538, 259, 774, 397, 859, 797, -538, 825, 980, -97, 476, 763, 283, 663, 914, 859, 765, 479, 914, 262, 49, 638, 774, 802, 980, -97, 605, 183, 825, 104, 797, 259, 605, 11, 802, 281, 104, 479, 765, -143, 175, 353, 802, 209, 353, 802, 397, 283, 49, 663 };
        String direction = "SNNWEEEWWSSNENSEWWNSNENESNWNNSEWWESESNWEESESSEWWNE";
        assertEquals(44, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case27() {
        int[] x = { -254, 230, 548, 701, -656, 450, 230, 333, -74, -495, 631, 631, -250, 830, 665, -74, 884, -45, -552, -224, 413, 429, 49, 418, 473, -656, -254, 830, 858, 858, 413, 665, 49, -552, 473, 478, 579, 579, 450, 884, 701, -224, 655, -417, -250, -237, 181, 655, 429, -495 };
        int[] y = { 665, 912, 912, 133, 691, 158, 594, 462, -12, -243, -596, 691, -540, -128, 373, -267, -130, 705, 625, 297, -243, 133, 826, 826, 281, -596, 648, -379, 705, -198, 665, 158, 457, 297, -130, -540, -379, -128, 373, 281, 405, 625, 541, -288, 188, 665, -267, 269, 405, 665 };
        String direction = "NENWSWWESWSNSWSNNNNEENESWWSSSWESSEWSESNEEEWEWWSENN";
        assertEquals(48, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case28() {
        int[] x = { 735, 226, 401, -248, -418, 226, 351, -168, 40, 246, 312, 401, 689, 299, -168, 606, 759, 241, 281, 606, 196, 533, 241, 485, 735, 281, 407, 437, 639, 485, -441, 533, 312, -441, -254, 842, -418, 196, 385, 689, -248, 437, 493, 246, 273, 493, 273, 385, 407, 368 };
        int[] y = { 995, 927, 995, 701, -93, 785, -18, 872, -477, -545, -479, 661, -111, 353, 463, 660, -18, 463, 485, 353, 752, -593, 872, 698, 661, 127, 264, 264, 127, -41, -116, -553, -545, -93, -41, 42, -116, 675, -477, 42, -28, 234, -593, -479, 752, -553, 675, -132, 234, 785 };
        String direction = "ENEEWENWEWEEEESWWNSENWSESWNWWWNENESEWEEESNESSWSWEE";
        assertEquals(40, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case29() {
        int[] x = { -310, 899, 609, 733, 413, 733, -148, -545, 897, -257, -311, -480, -495, -429, 116, 897, 116, 938, 980, 938, 948, 444, 861, 109, 586, 586, 444, 980, 308, 184, -480, -310, 491, 254, 774, -257, 899, 641, 254, 413, 641, 609, 308, -495, -192, -582, -545, -429, 22, 861 };
        int[] y = { -46, 728, -280, 47, 242, 6, 388, 381, 210, 696, -33, 754, 696, 754, 0, -503, 94, -655, -651, -25, -224, -7, -86, -46, 864, -33, 40, -280, -655, -503, 805, 373, 40, -86, 47, 934, 242, -224, -693, 728, 83, -651, -25, 934, 381, -46, 734, 805, 94, -693 };
        String direction = "WNENEWSWSNSNSNSENNSEWSWNSNEEEESSNEENSNNWWESESNNNES";
        assertEquals(40, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case30() {
        int[] x = { 817, -543, 66, 823, 922, -234, -270, -453, 682, 322, -221, -299, 922, -184, -103, 66, -427, -184, -109, -128, 49, 1000, -218, -543, -573, -573, 49, -199, 823, 548, -270, 685, 682, 586, 690, -109, 578, -103, -199, 288, 900, -234, -299, -326, 817, 578, 322, 1000, -326, 548 };
        int[] y = { -253, 868, -93, 772, -634, -550, 718, 172, -447, 955, 718, 634, -397, -600, -13, -268, 146, -550, -268, 12, 478, 261, 745, 524, 360, 634, 745, 524, -377, -186, 767, -397, -229, 261, -186, -93, 699, 12, 868, 276, -229, -600, 360, 772, 276, 955, 699, 675, -377, -44 };
        String direction = "SWNWNESWENSENESNWESWNNESSWENNWSNSEENNWENNSNWNNSWES";
        assertEquals(48, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case31() {
        int[] x = { -387, 447, -689, -689, 936, -150, 256, 0, 845, 993, 866, -460, 149, -382, -460, -660, 103, -617, 845, 798, 500, -353, 617, -472, -483, -270, -483, 993, 291, -628, -660, -617, 617, -353, 256, -214, 149, -472, -270, 936, 866, -150, 798, 447, 120, -628, -387, 120, 291, 459 };
        int[] y = { -165, 84, -467, -165, -381, 0, -112, 714, -448, 794, -554, 239, 163, -171, 227, -555, 452, -555, 880, 794, 31, -112, 97, 227, -448, 482, 880, 599, 0, -422, -598, -598, 714, 497, 497, -8, -554, 239, 236, 452, 163, -441, 599, 31, -171, -8, -467, 331, -441, -214 };
        String direction = "NNEESWEEWENSNEENSNNEWSWEEWWENWSWNNEWNSSEESSNWNEESS";
        assertEquals(44, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case32() {
        int[] x = { 764, -214, -383, -49, 453, -52, 156, 617, -402, 599, 599, 810, 727, 462, 192, 357, -214, -204, 617, 59, 453, -237, 393, 712, 712, 764, 568, 810, 632, -49, -383, 357, 444, -535, 462, 576, -145, -52, -145, 140, -402, -204, 632, 568, 365, -247, -237, 727, 192, 576 };
        int[] y = { -388, 716, 955, 621, 827, 322, 569, 239, 198, 133, 877, 588, 239, 221, -30, 116, 706, 706, 129, 666, 322, -431, 573, 870, 298, -584, -584, -30, 739, 955, 621, 221, 927, 198, 116, 600, 133, 827, 877, 870, 65, 716, 927, -388, 811, -67, -660, 129, 588, 811 };
        String direction = "NSNNWWNEWWENNWSSSWSWWEWEWEWSNNNSEENSSSESSNESNEWEWW";
        assertEquals(40, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case33() {
        int[] x = { 219, 4, -42, 120, -342, 142, -79, -69, 598, -79, -657, 430, 491, 433, 142, 618, 737, -317, 310, 565, 433, 219, 208, 709, -35, 430, 417, -342, 68, -2, 709, -42, 266, 84, 737, 618, 565, -516, -516, -657, 18, 266, 120, -2, 417, 598, 310, -69, -35, 869 };
        int[] y = { 288, 848, -44, 655, 782, 567, 74, 66, 847, 652, 652, -161, 567, 247, 218, -491, -263, 497, -130, 247, 115, 67, 847, -491, 655, 201, 415, 914, 201, 288, -582, 415, 401, 848, -395, -582, 115, 85, 619, 74, 85, 66, 500, 67, -44, 457, 497, 401, 500, -395 };
        String direction = "NEENENEWEESESWSWWNNSNSNEWENEWEWENEEWNSSWSEEEWWESEW";
        assertEquals(44, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case34() {
        int[] x = { -2, -1, 0, 2, -3, 3, -3, 4, -1, -1, -4, 2, 4, 4, 0, -4, 4, 1, 1, -4, 0, 2, -3, -2, -3, 3, 3, 1, 4, -2, 2, 2, -1, 0, -4, -1, 2, -2, 2, 4, 1, 3, -2, 0, -4, 3, -1, 1, 1, -3 };
        int[] y = { 0, 3, -4, -2, -2, 1, -1, 2, 0, -2, 0, -3, -4, 1, 3, 1, 4, -3, 0, 3, 4, 0, 0, -4, 1, -2, -4, 3, -2, 2, 4, 1, -4, 2, 4, 2, 3, -3, -1, -3, 1, -3, 1, -2, 2, -1, 1, -1, -4, -4 };
        String direction = "SNNNSNESNNNWNNWNWSSEEWWSSSWSSNWNNEESWEENSSWEWNESES";
        assertEquals(24, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case35() {
        int[] x = { 2, -2, 0, 3, 3, 1, 3, 2, 3, 2, 4, 3, 4, 0, 4, -2, -1, 1, 3, -3, -2, 0, -3, 4, 1, -1, 4, -1, 2, -2, -4, -4, 3, 4, -4, -3, -4, -2, -3, 4, 1, 2, -2, -1, 4, -4, -1, 2, -4, 1 };
        int[] y = { -3, -2, 3, 0, 4, 2, -2, -4, 2, 2, 3, -3, 4, -2, 2, -1, 3, 3, -4, 1, -4, 2, -3, -4, -1, 4, -3, 0, -2, 0, 4, -3, 3, -1, -2, -1, 1, 3, 4, 1, 4, 4, -3, -3, -2, 2, 2, 0, 3, -2 };
        String direction = "SENENWWNNSEWNENWEEWNEWWESWNWWENESSWSWSNSESEESSSEEE";
        assertEquals(26, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case36() {
        int[] x = { -3, 0, 4, -3, -2, 4, 1, 0, 4, -2, 0, -2, 3, 2, 0, -4, 2, 2, -1, -3, 4, 4, -4, 2, 0, 2, 4, -4, -4, 0, 0, -1, 2, -4, 1, -2, 1, -2, 1, 3, -3, -3, -4, 4, -3, -1, 2, 2, -1, -3 };
        int[] y = { -4, 3, 3, 2, 3, -3, 2, -2, 2, 4, 0, 1, 2, -2, 1, -2, 3, -4, 1, -2, 0, -2, -4, -1, -4, 1, -1, 2, 4, 2, -1, 4, 2, 3, -1, 2, 3, -1, -4, 3, -1, 1, -1, 4, 4, -4, 4, 0, -3, 0 };
        String direction = "EENESESNSNSEWSSWSEEEWSSNNSNEESNNNEESSSNESNNWWEEWWS";
        assertEquals(20, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case37() {
        int[] x = { -3, -4, 0, 4, -3, 3, -1, 3, -2, -1, 4, 4, 4, 2, 0, 2, -1, 2, 3, -2, 3, 0, 3, 4, -4, -3, -3, 1, -2, 1, 1, 0, -2, 2, 0, -3, -4, -1, -2, 3, 0, -1, -4, -3, -4, 2, -1, 2, -4, 2 };
        int[] y = { 3, -3, 1, -1, -3, -4, 1, 2, 2, -2, -2, 2, 3, 3, 0, 2, 4, 0, 3, -4, 0, 3, 1, 4, 3, 0, 1, -1, 3, 1, -3, 4, -3, -2, -3, -1, 1, -3, 0, -1, 2, -1, -1, 2, 4, -3, 3, -4, -4, 4 };
        String direction = "SEWNESWSSNNEEESWNWNNNEWNEWSNSEESWWENSWSNWWNWWNSNWN";
        assertEquals(17, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case38() {
        int[] x = { 3, -2, 1, 2, 1, 0, -1, 0, -4, -4, 4, -4, 0, -4, 0, 1, 4, -1, 0, 1, -4, 1, 4, -3, 4, 0, 3, 2, -1, 4, -4, 3, -1, -3, -2, -1, -2, 2, 3, -4, -4, 2, -3, 2, 3, -2, -1, 4, -3, 3 };
        int[] y = { 3, -1, -2, -1, 0, -4, 4, 2, 1, -4, -4, 3, -2, 4, 4, 3, 1, 3, -1, 1, 0, 4, 4, -4, -2, 3, -3, 2, 2, -3, -3, -2, 0, 1, 0, -2, -3, 1, -1, 2, -2, 0, -2, -2, 0, -2, -3, 0, 4, -4 };
        String direction = "NSWWNNEWWWWNWEWSWNSSEEWNSSSSESSNEWEWWEWEWENWEWWESE";
        assertEquals(26, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case39() {
        int[] x = { 0, -1, -4, -3, -4, 1, 0, 4, 3, -1, -2, -1, 1, -3, -4, -2, -2, 2, 1, 2, 0, 0, -4, -2, 3, 1, -1, -4, 4, 4, -2, 3, 3, 1, 3, -3, -4, -3, 0, 2, -2, -1, -1, 0, 0, 2, -1, 4, 0, 4 };
        int[] y = { 3, -2, 0, -2, -1, 4, 1, -1, 3, 1, -3, -3, 1, -3, -3, 4, -2, 3, -4, 0, -3, -2, -2, 3, -2, 0, 3, 3, -2, 3, 0, -1, -3, -2, 1, 3, 4, 1, 0, -1, 1, 4, -1, 2, -4, 4, 2, -3, 4, 2 };
        String direction = "NSWEENNSWEWEENENNNSNEESNWWNESSNEEWEWSEWEENNWSNWWWW";
        assertEquals(30, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case40() {
        int[] x = { 0, -3, 2, 2, 0, 1, 4, -3, 1, 4, 1, 2, 2, -2, -3, -4, -4, 4, 1, -2, 3, 0, 1, -2, 2, 1, 3, -1, 2, -4, -1, 3, -3, 4, -3, -3, 2, -3, -4, -1, -2, 0, 4, 3, 2, -2, 1, 1, -3, -1 };
        int[] y = { -3, 2, -3, 3, 2, 0, 0, -4, 4, -2, -1, 4, -2, -2, 3, 3, 1, -3, 2, 3, 2, -1, 1, 0, 2, -2, -4, -4, -1, 0, -2, 4, 0, -4, -2, -1, 0, 4, -2, -1, 1, 0, 4, -1, -4, -4, 3, -4, -3, 2 };
        String direction = "EWWESWESWWESWEEWWNSSENWSWESSSEEWNEWSESWWNESWESSNWE";
        assertEquals(27, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case41() {
        int[] x = { -3, 4, -4, -2, 1, 4, -4, 1, -2, -1, 2, -1, 1, 0, 1, 0, 4, -2, -3, 1, 0, -1, -2, -4, -2, 0, -2, -4, -4, -2, 3, -4, 2, 2, -3, 2, 2, 0, 3, -3, 3, 1, 3, -4, -3, 2, 2, -1, 0, -1 };
        int[] y = { 2, -1, 2, -3, 3, 2, -2, -3, -2, -1, 1, 3, -4, 4, 0, 2, 4, 3, -4, -1, 1, -3, 1, -1, 2, -4, -4, 0, -3, 4, -2, 4, 3, -2, -1, -4, -1, 3, -3, 1, -1, 2, -4, -4, -3, 4, -3, -2, 0, 2 };
        String direction = "NEEWNNWSEWWEEENSSWNNSWSWEWSWNSNNNNWWNNSESSWSSSNEEN";
        assertEquals(25, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case42() {
        int[] x = { -4, 4, 3, 0, -4, 1, 3, -3, 1, -3, 4, 4, 1, -4, 3, 1, -1, -4, -1, -3, 2, 2, 2, 1, -3, -3, 0, 4, 2, 3, -2, 2, -2, 3, 0, 0, 0, 4, 1, -3, 4, 0, 2, -1, -3, 3, -4, 0, 0, -4 };
        int[] y = { 3, 1, 3, -1, 0, 0, -2, 2, 4, -4, -2, 3, -1, 4, 2, 3, 0, -2, -3, 4, -3, -2, -1, 2, 1, -2, 4, 2, -4, -4, 1, 2, -4, -3, 0, 2, 1, 0, -3, -3, -3, -2, 0, 3, 0, 1, -3, -4, -3, -4 };
        String direction = "ESENNWNSNNNSNNNNNNESNEENNEWESEWEWSWNENENSSSWESWESE";
        assertEquals(26, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case43() {
        int[] x = { 1, 0, 3, -4, -3, 2, 2, 0, -2, 2, 4, -3, 0, -3, -3, 1, 2, -1, -2, -1, 3, 4, 4, -3, -4, 3, -3, 1, -2, -4, -4, 4, -1, 2, 3, 0, 1, -3, -1, 3, -1, 4, 1, 2, -4, 3, -3, -4, -2, -4 };
        int[] y = { 1, 1, 1, 4, -3, 4, -4, 2, 2, 3, 2, -1, -2, 4, 0, -3, 0, 4, 1, -4, 3, -4, 3, -2, -3, 4, 1, 4, 3, -4, -2, 1, -1, 1, -1, -4, -4, 2, 2, 0, -2, 0, 3, -3, 1, 2, 3, 3, 0, 0 };
        String direction = "NWENSWNNNNEWNEENSSEWSNWWEESSEEWWENWNNWESNSNWWNNEWS";
        assertEquals(22, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case44() {
        int[] x = { -796, 305, 835, -388, 713, -225, -633, -103, 632, 999, -592, 264, -756, -62, 101, 468, -348, 19, 142, -715, -429, -307, 428, -837, 672, 958, 387, -21, -511, -1000, -878, 876, 346, -552, 754, -470, 591, -266, -919, 509, -960, 550, 224, 60, 795, -674, -184, 183, 917, -144 };
        int[] y = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        String direction = "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN";
        assertEquals(50, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case45() {
        int[] x = { 330, 410, -978, 963, -978, 27, 314, 423, 110, -93, -868, -854, 313, -621, 830, 548, 420, 464, 911, 283, 498, 674, 953, 567, 949, 131, 651, -486, 513, 816, 940, 697, -119, 202, -597, -42, -792, -593, 844, 815, -861, -793, -355, 511, -901, 158, 605, 763, 298, 367 };
        int[] y = { 729, -327, -119, -920, -329, 913, 643, -37, 690, 103, -250, 491, 63, -10, 61, 330, -762, 271, 125, 543, 81, -612, 952, -923, -997, 299, 996, -639, 423, -461, 641, -545, 934, -415, 440, -113, -395, -712, -496, -247, 896, 980, 688, -849, 602, -466, 500, 578, -249, 394 };
        String direction = "EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE";
        assertEquals(50, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case46() {
        int[] x = { 872, -862, -390, -94, -133, -681, -290, -458, 735, -554, 610, -679, 666, -114, 251, -858, -933, 626, 662, -784, -962, -957, 153, -268, 268, 56, 416, 235, 794, -347, 867, -544, 51, -977, 667, 168, -733, -64, 477, -670, 448, -150, 192, 786, 90, -397, 932, -372, -738, -551 };
        int[] y = { -314, -347, 68, 421, -378, 466, 908, -674, 192, 395, 832, -896, -601, -305, -288, -833, 308, -64, 84, 87, 140, 536, -185, 309, -113, -156, -928, 360, -140, 85, -789, 745, -241, 373, 784, 642, 86, 243, -724, -618, -389, 984, 942, -847, -691, -176, -794, -635, -715, 675 };
        String direction = "ENWNWSSWWESWWESNNNESSEWNNSESWWEWNENEWSWEWSWSSESWNW";
        assertEquals(50, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case47() {
        int[] x = { 726, -494, 2, 558, -430, 28, 210, 51, -949, -274, -985, -981, 563, 319, 403, 144, 641, 720, -32, -231, 138, 790, 287, 667, 805, 969, -604, 977, 652, 331, 600, -637, -445, -518, 750, -93, -170, 488, 739, -828, -394, -45, -527, 529, -326, 701, 985, 972, -120, 274 };
        int[] y = { -500, -708, 144, -97, -907, -915, 244, 132, -50, -889, -644, -311, 481, 592, 437, 641, 605, 637, 661, 680, 458, -440, -688, 891, 645, -89, -815, 326, 718, -498, 887, -145, 380, 417, 560, 901, -210, 738, -283, -626, -682, 730, -672, 700, -115, 302, 251, 431, -480, -357 };
        String direction = "NNWNNSSWESEWWEWWSESEENSWSWWSEWSWWEEENESWSWWENENSSW";
        assertEquals(50, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case48() {
        int[] x = { -531, 220, 126, -47, 966, 146, 910, 791, -373, -302, 644, 246, 350, 503, 156, 405, -145, -446, -807, 133, 621, 586, 365, 531, -946, 617, -792, -607, -584, -926, 623, 680, 654, 592, 751, -54, -718, -867, -648, 146, 519, -607, -108, 624, 429, 828, -480, 521, 292, -828 };
        int[] y = { -604, -815, 75, 15, 551, 816, 185, 797, -310, 444, 286, 983, -771, 558, 758, 251, 665, 915, 440, 820, -537, -995, -911, 779, 139, -324, 577, 277, -251, 18, -540, -950, -224, -365, -864, -338, -855, 691, -582, -536, 495, 300, -3, -125, -851, 301, 742, 800, 151, 840 };
        String direction = "SEESSNENSWSSSSENENEEWWWWNEWWESSNNEESNNNWEWNSNNWEWN";
        assertEquals(50, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case49() {
        int[] x = { 520, 640, -400, -760, -280, 120, -560, -640, 0, 280, -840, -200, 840, 440, -240, -920, 680, 920, -160, 40, 800, -520, -880, 960, 240, -40, 320, 80, 480, -720, -680, 880, -480, -800, 360, -360, 400, 720, -1000, 760, -440, 560, -960, 600, -120, -80, 200, -320, 160, -600 };
        int[] y = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        String direction = "WWWWWEEWWEEEWWEEWEEEEWWWWEWEWWWWWEWWEEEEEWWWWWEWWW";
        assertEquals(12, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case50() {
        int[] x = { 560, 520, 480, -920, -680, -600, -160, -120, -40, -320, -1000, -640, -720, 400, 640, -200, 120, -280, 720, 160, 920, 800, -400, 240, -960, -480, -760, -440, 680, 840, 280, -560, 960, -880, -840, 440, -80, -240, 320, 40, 880, 0, -360, 600, 80, 200, 360, -520, -800, 760 };
        int[] y = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        String direction = "EEWEEEEWWEEEEEWWWEEWEEWWWEWEWEWWEEWEEWEWEEWWWWEEWW";
        assertEquals(10, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case51() {
        int[] x = { 0, 280, -360, -800, -960, -80, 360, -200, 40, 400, 920, 80, 680, 880, 960, 800, -40, -680, -760, 240, -160, -1000, 760, -640, 480, 560, -560, 520, -920, -240, -480, 720, -880, 600, 440, 320, 640, 200, -320, -520, -720, -400, -440, -280, -120, 120, -600, 840, 160, -840 };
        int[] y = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        String direction = "WEWWEWEEWEWEWWEEEWEEWWEEWWWWEWWEWWWWEEEWEWWWEWWWEW";
        assertEquals(10, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case52() {
        int[] x = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int[] y = { 680, 0, -880, -360, -680, -560, -200, 640, 920, 520, -920, 880, 800, 280, -640, 480, 600, -480, 720, 40, 360, 80, 760, -120, -320, -440, -840, 320, -520, 240, 160, -760, -400, 200, -240, -1000, -720, -160, 400, -960, -600, 560, 960, 440, 840, -280, -80, 120, -40, -800 };
        String direction = "SSNNSSSSNNSSSSNSNNNNNSSSSNNSSNNNSSSNSNSSSNSNSSNNNS";
        assertEquals(6, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case53() {
        int[] x = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int[] y = { 320, -200, -520, -480, -160, -840, 880, -120, 920, 560, 400, 680, 80, 0, 480, 800, 640, -240, -880, -320, -680, 960, 40, -560, 360, 200, -440, -280, -800, 280, -720, 520, -960, -80, 440, 160, -400, -760, 120, -40, 760, -1000, 600, 240, -920, 720, -640, 840, -600, -360 };
        String direction = "NSSSNSNSNSSSNSSSSNSNNSSNNSSNNNSNSNNNNSNNNSSSSNSNSS";
        assertEquals(14, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case54() {
        int[] x = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int[] y = { -920, -80, -320, 360, -40, -560, 80, 720, 960, 640, -280, -720, -440, 920, -760, 320, -240, 480, -1000, 40, -360, -480, -880, 880, 200, 160, -400, -520, 400, -120, 760, 280, 520, 120, 240, -680, 560, -600, 840, 680, 600, -800, 440, -960, -160, -200, -840, -640, 800, 0 };
        String direction = "SSNNNSNNNNSNNSNNNSSNSSNSNSNNNNNSNNSNSNSNNNNSSNNNNN";
        assertEquals(22, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case55() {
        int[] x = { 720, 200, -200, 0, 800, -840, -960, 160, -680, 320, 360, -160, -480, -240, -1000, -800, -360, -880, -280, 560, 960, -560, 480, 40, 240, -400, 440, 920, 400, 600, -640, 280, 640, -120, -40, 120, 520, -440, 760, -80, 840, -920, 880, -720, 680, 80, -520, -320, -600, -760 };
        int[] y = { 720, 200, -200, 0, 800, -840, -960, 160, -680, 320, 360, -160, -480, -240, -1000, -800, -360, -880, -280, 560, 960, -560, 480, 40, 240, -400, 440, 920, 400, 600, -640, 280, 640, -120, -40, 120, 520, -440, 760, -80, 840, -920, 880, -720, 680, 80, -520, -320, -600, -760 };
        String direction = "ESSNESEWNWWWWSSSWESWWSESWSWEEWNNEWWNNSWENWWWNWNEEW";
        assertEquals(22, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case56() {
        int[] x = { 960, 560, -400, 760, -600, -680, 0, -960, 840, -200, 360, 160, -280, -640, -760, -840, 600, 720, 320, -520, 240, -880, -40, 440, 880, -440, -720, -480, -120, -240, 280, 80, 480, 800, 680, 120, 40, 920, 200, -320, -80, 520, 400, -920, -800, -1000, -560, -360, -160, 640 };
        int[] y = { 960, 560, -400, 760, -600, -680, 0, -960, 840, -200, 360, 160, -280, -640, -760, -840, 600, 720, 320, -520, 240, -880, -40, 440, 880, -440, -720, -480, -120, -240, 280, 80, 480, 800, 680, 120, 40, 920, 200, -320, -80, 520, 400, -920, -800, -1000, -560, -360, -160, 640 };
        String direction = "WWNSWWNNWEENENENSEEWEWENSEESENWWSSWSNEWSWWWNEEWSWN";
        assertEquals(10, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case57() {
        int[] x = { 520, 40, 200, -360, -840, -920, 560, 840, 720, -80, 960, 160, 880, -160, -1000, 680, 360, 640, -240, -120, -40, 280, -320, 120, 480, -760, -520, 440, -560, -880, -200, -480, -440, -400, 0, 920, 80, -800, 320, -720, 600, -280, 760, -680, -960, 800, 400, 240, -600, -640 };
        int[] y = { 520, 40, 200, -360, -840, -920, 560, 840, 720, -80, 960, 160, 880, -160, -1000, 680, 360, 640, -240, -120, -40, 280, -320, 120, 480, -760, -520, 440, -560, -880, -200, -480, -440, -400, 0, 920, 80, -800, 320, -720, 600, -280, 760, -680, -960, 800, 400, 240, -600, -640 };
        String direction = "SNNWWNSNSENWWENEWNSWESNNSNNSEWNNENWSWESNWNESSESNWE";
        assertEquals(10, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case58() {
        int[] x = { 0, 10, 20, 30 };
        int[] y = { 0, 10, 20, 30 };
        String direction = "NWNE";
        assertEquals(2, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case59() {
        int[] x = { 0, 0, 0 };
        int[] y = { 0, 1, -1 };
        String direction = "SSN";
        assertEquals(1, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case60() {
        int[] x = { 375, 307, 377, 361, 204, 310, 280, 398, 345, 261, 232, 359, 392, 258, 207, 263, 216, 319, 260, 348, 358, 211, 243, 292, 343, 327, 219, 285, 342, 300, 242, 212, 250, 224, 400, 325, 389, 275, 344, -1000, 1000, 42, 42, 41, 43, -999, 999, -999, -100, -100 };
        int[] y = { 399, 203, 206, 248, 264, 283, 379, 339, 205, 228, 380, 267, 222, 333, 287, 361, 263, 328, 355, 207, 202, 257, 206, 204, 249, 380, 276, 250, 205, 381, 235, 332, 231, 377, 362, 396, 233, 393, 262, -1000, 1000, 43, 41, 42, 43, -999, 999, 999, -104, -101 };
        String direction = "WEWSNNEENENEEENWNSWWSSWNWWSNEWSSSSNSWSWNWWENSESNNS";
        assertEquals(42, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case61() {
        int[] x = { 0, 0 };
        int[] y = { 0, 1 };
        String direction = "NS";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case62() {
        int[] x = { 0, 1 };
        int[] y = { 0, 0 };
        String direction = "EW";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case63() {
        int[] x = { 0, 1 };
        int[] y = { 12, 12 };
        String direction = "EW";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case64() {
        int[] x = { 1, 0 };
        int[] y = { 0, 0 };
        String direction = "WE";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case65() {
        int[] x = { -1, -1, -1, 0, 0, 0, 1, 1, 1 };
        int[] y = { -1, 0, 1, -1, 0, 1, -1, 0, 1 };
        String direction = "EEEWWWEEE";
        assertEquals(3, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case66() {
        int[] x = { 0, 0, 0, 1 };
        int[] y = { 0, 1, 2, 1 };
        String direction = "NNSW";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case67() {
        int[] x = { 0, 0 };
        int[] y = { 1, 0 };
        String direction = "SN";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case68() {
        int[] x = { 0, 1, 2, 1, 3, 3, 4, 4 };
        int[] y = { 0, 0, 1, 1, 1, 0, 0, 1 };
        String direction = "EWWESNNS";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case69() {
        int[] x = { 29, 30 };
        int[] y = { 30, 30 };
        String direction = "EW";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case70() {
        int[] x = { 0, 1, 1000, 999, -1000, -999 };
        int[] y = { 0, 0, 999, 1000, -999, -1000 };
        String direction = "EWNESW";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case71() {
        int[] x = { 0, 0 };
        int[] y = { 1, 2 };
        String direction = "NS";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case72() {
        int[] x = { -1, -1, -2, -2, -3, -3, -4, -4, 0, 1, 1, 0, 0, 2, 2, 0 };
        int[] y = { 0, 1, 1, 0, 0, 2, 2, 0, 11, 11, 12, 12, 13, 13, 14, 14 };
        String direction = "NSSNNSSNEWWEEWWE";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case73() {
        int[] x = { 0, 0 };
        int[] y = { 0, -1 };
        String direction = "SN";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case74() {
        int[] x = { -1000, 1000 };
        int[] y = { -1000, 1000 };
        String direction = "NW";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case75() {
        int[] x = { -1, 0 };
        int[] y = { -1, -1 };
        String direction = "EW";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case76() {
        int[] x = { 1, 1 };
        int[] y = { 0, 1 };
        String direction = "NS";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case77() {
        int[] x = { -9, -3, 0, -9, -6, -3, -2, -10, 8, -5, 6, 1, 9, -2, -9, -2, 0, 5, -8, -7, 3, 0, -1, 7, 8, -6, 9, -10, -4, 2, 5, 5, -8, -1, -3, -6, 5, 3, -4, 8, -5, -5, -4, -4, 2, 7, 9, -3, 6, -8 };
        int[] y = { -1, -8, -8, -3, 8, -6, 1, 1, 6, 6, 3, -7, 0, 6, 6, -3, -7, 3, 1, -8, 6, 5, -3, -6, 4, 4, -9, 2, 3, -4, 7, -3, 7, -4, 4, -2, -6, -1, -10, -8, -5, -8, -4, -7, 9, 3, 4, -1, 2, -1 };
        String direction = "WEWWNNNESENSNNSWNWWWEWNNWENWWSESWEEWESNWWNENNWWESS";
        assertEquals(36, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case78() {
        int[] x = { 0, 0, 0, 2 };
        int[] y = { 0, -1, -2, 0 };
        String direction = "SNNW";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case79() {
        int[] x = { 478, -664, 759, 434, -405, 513, 565, -396, 311, -174, 56, 993, 251, -341, 993, -112, 242, 129, 383, 513, -78, -341, -148, 129, 423, 493, 434, -405, 478, -148, 929, 251, 56, 242, 929, -78, 423, -664, 802, 251, 759, 383, -112, -591, -591, -248, 660, 660, 735, 493 };
        int[] y = { -186, 98, 948, 795, 289, -678, 948, -170, -195, 290, -354, -424, 289, -157, -166, 150, 706, -678, 684, -294, -234, 36, 36, -294, -216, -234, 427, 945, 265, -157, 265, 715, 275, 715, -186, 337, 798, -170, 427, 706, 754, 961, 286, -216, 798, 286, 961, 684, -424, 337 };
        String direction = "WNSNNSSWWWEENWESNSWSWSEWWEWEWWWNWESNSSNNSNNWWWNESE";
        assertEquals(44, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case80() {
        int[] x = { 7, 7, 0, 1, 2, 3, 3, 4 };
        int[] y = { 0, 1, 5, 4, 3, 1, 0, 1 };
        String direction = "NSSSSSNW";
        assertEquals(2, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case81() {
        int[] x = { 0, 1, -1, 2, -2, 3, -3, 0, 0, 0, 8, 13, 15, 9, 11, 11 };
        int[] y = { 0, 1, 1, 2, 2, 3, 3, 3, 4, 2, 2, 2, 2, 2, 0, 4 };
        String direction = "NWEWEWESSNEWWENS";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case82() {
        int[] x = { 0, 1, 10, 9, 11, 10, -1000, 1000 };
        int[] y = { 330, 330, 9, 10, 10, 11, -1000, 1000 };
        String direction = "EWNEWSNW";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case83() {
        int[] x = { -1000, 1000 };
        int[] y = { -1000, 1000 };
        String direction = "ES";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case84() {
        int[] x = { -1, 0 };
        int[] y = { 0, 0 };
        String direction = "EW";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case85() {
        int[] x = { 0, 0 };
        int[] y = { 0, 3 };
        String direction = "NS";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case86() {
        int[] x = { -1000, 1000, 120, 100, 110, 120, 130, 140, 200, 201, 200, 201, 300, 300, 300, 400, 411, 500, 501, 600, 600, 700, 700 };
        int[] y = { 1000, -1000, 110, 110, 140, 130, 120, 130, 200, 200, 201, 201, 300, 301, 302, 400, 400, 500, 500, 600, 601, 700, 717 };
        String direction = "SWNESSWWEWSSNSSEWEWNSNS";
        assertEquals(6, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case87() {
        int[] x = { 1, 1 };
        int[] y = { 1, 0 };
        String direction = "SN";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case88() {
        int[] x = { 4, 7, 6, 2, 6, 5, 7, 7, 8, 4, 7, 8, 8, 8, 5, 4, 8, 9, 1, 5, 9, 3, 4, 0, 0, 1, 0, 7, 2, 6, 9, 6, 3, 0, 5, 5, 1, 2, 0, 4, 9, 7, 7, 1, 8, 1, 9, 2, 7, 3 };
        int[] y = { 2, 3, 0, 6, 8, 4, 9, 0, 5, 0, 2, 4, 3, 8, 1, 5, 0, 7, 3, 7, 0, 9, 8, 1, 9, 4, 7, 8, 1, 1, 6, 6, 6, 2, 8, 5, 1, 9, 0, 1, 1, 1, 7, 0, 2, 5, 4, 7, 5, 3 };
        String direction = "SEENNEEESSSNSNSSWENEWNWNSESWSNESNESWWNNNWEWWWSWNEW";
        assertEquals(20, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case89() {
        int[] x = { 0, 1, 49, 50, 51, 50 };
        int[] y = { 77, 77, 50, 49, 50, 51 };
        String direction = "EWENWS";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case90() {
        int[] x = { -1, -1 };
        int[] y = { -1, 0 };
        String direction = "NS";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case91() {
        int[] x = { 1, 1 };
        int[] y = { 1, 2 };
        String direction = "NS";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case92() {
        int[] x = { -71, -69, -62, -88, -95, -53, -53, -76, -61, -100, -58, -56, -91, -60, -53, -91, -61, -71, -91, -78, -92, -82, -72, -76, -75, -63, -52, -94, -80, -75, -65, -100, -92, -74, -86, -87, -77, -89, -61, -85, -86, -69, -91, -75, -77, -94, -66, -88, -63, -54 };
        int[] y = { -84, -82, -86, -82, -64, -87, -97, -73, -87, -87, -74, -55, -52, -79, -100, -70, -93, -54, -84, -93, -91, -80, -62, -53, -86, -82, -81, -94, -87, -97, -94, -69, -77, -80, -100, -91, -67, -95, -61, -52, -81, -85, -57, -81, -64, -55, -99, -56, -58, -83 };
        String direction = "EEEENSEEWESSWSWSNSWEEESEWENNNNNWEWSWSNSSEWWENWWSSW";
        assertEquals(34, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case93() {
        int[] x = { -926, 648, 136, -11, -989, -777, 834, -915, -762, -481, -774, -415, 294, -550, -493, -968, 31, -646, 134, 307, 474, 573, -22, -237, 250, -335, 131, 633, 344, 138, -312, 718, 10, -415, 330, -332, 457, -961, -943, 861, -590, 298, 553, -1000, 1000, 1000, 1000, -1, 0, 0 };
        int[] y = { -878, -955, 119, -336, 296, -40, 438, -370, 364, -478, -370, 94, 577, 239, -976, 750, 913, -589, -146, 407, 862, 417, 656, 290, 174, 430, -475, -179, -617, -172, -579, 31, 663, 219, 311, -152, -409, 149, -297, -804, 816, 825, -613, -1000, 1000, -999, 0, 0, 0, 1 };
        String direction = "ENWWWNEENEWSSNSSENSNSNNESENEWEESNSNSSENWNENESNSEWS";
        assertEquals(42, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case94() {
        int[] x = { 0, 0 };
        int[] y = { 5, 6 };
        String direction = "NS";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case95() {
        int[] x = { 0, 3 };
        int[] y = { 0, 0 };
        String direction = "EW";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case96() {
        int[] x = { 0, 1 };
        int[] y = { 1000, -1000 };
        String direction = "NS";
        assertEquals(2, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case97() {
        int[] x = { -1, -1, -1, 0, 0, 0, 1, 1, 1 };
        int[] y = { -1, 0, 1, -1, 0, 1, -1, 0, 1 };
        String direction = "ESEWNNEWW";
        assertEquals(4, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case98() {
        int[] x = { 1, 2 };
        int[] y = { 0, 0 };
        String direction = "EW";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case99() {
        int[] x = { 2, 2, 4, 7 };
        int[] y = { 2, 5, 3, 3 };
        String direction = "NSEW";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case100() {
        int[] x = { 1000, -999 };
        int[] y = { 1000, 1000 };
        String direction = "WE";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case101() {
        int[] x = { 0, 1 };
        int[] y = { 1, 1 };
        String direction = "EW";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case102() {
        int[] x = { 1000, -1000 };
        int[] y = { 1000, -1000 };
        String direction = "WN";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case103() {
        int[] x = { 10, 10 };
        int[] y = { 10, 9 };
        String direction = "SN";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case104() {
        int[] x = { -1000, 1000, 0, 0 };
        int[] y = { 0, 0, -1000, 1000 };
        String direction = "EWNS";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case105() {
        int[] x = { 0, 0 };
        int[] y = { 3, 0 };
        String direction = "SN";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case106() {
        int[] x = { 0, 0, 0 };
        int[] y = { 0, 3, 7 };
        String direction = "NSS";
        assertEquals(1, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case107() {
        int[] x = { 0, 0, 1, 7 };
        int[] y = { 0, 2, 1, 7 };
        String direction = "EWSN";
        assertEquals(2, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case108() {
        int[] x = { 4, 7, 6, 2, 6, 5, 7, 7, 8, 4, 7, 8, 8, 8, 5, 4, 8, 9, 1, 5, 9, 3, 4, 0, 0, 1, 0, 7, 2, 6, 9, 6, 3, 0, 5, 5, 1, 2, 0, 4, 9, 7, 7, 1, 8, 1, 9, 2, 7, 3 };
        int[] y = { 2, 3, 0, 6, 8, 4, 9, 0, 5, 0, 2, 4, 3, 8, 1, 5, 0, 7, 3, 7, 0, 9, 8, 1, 9, 4, 7, 8, 1, 1, 6, 6, 6, 2, 8, 5, 1, 9, 0, 1, 1, 1, 7, 0, 2, 5, 4, 7, 5, 3 };
        String direction = "SSNWSWSENSWSESWEWSWSENWNNNESWSWSWWSSWEEWWNWWWNWENN";
        assertEquals(25, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case109() {
        int[] x = { -1000, 1000 };
        int[] y = { 1000, -1000 };
        String direction = "EN";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case110() {
        int[] x = { -1, 0, 0, 1 };
        int[] y = { 0, -1, 0, 0 };
        String direction = "NNSN";
        assertEquals(2, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case111() {
        int[] x = { -5, -6 };
        int[] y = { -6, -5 };
        String direction = "EN";
        assertEquals(2, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case112() {
        int[] x = { 0, 2, 2, 4, 4, 4, 5, 6, 7, 11, 12, 13, 14, 15, 16, 16, 18, 18, 19 };
        int[] y = { 14, 12, 15, 2, 9, 11, 5, 7, 1, 1, 9, 2, 15, 18, 1, 7, 11, 18, 7 };
        String direction = "EESWWNWEWNENSWWEEWW";
        assertEquals(13, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case113() {
        int[] x = { 478, -664, 433, 759, -405, 513, 565, -396, 311, -174, 56, 993, 251, -341, 993, -112, 242, 129, 383, 513, -78, -341, -148, 129, 423, 493, 434, -405, 478, -148, 929, 251, 56, 242, 929, -78, 423, -664, 802, 251, 759, 383, -112, -591, -591, -248, 660, 660, 735, 493 };
        int[] y = { -186, 98, 948, 75, 289, -678, 948, -170, -195, 290, -354, -424, 289, -157, -166, 150, 706, -678, 684, -294, -234, 36, 36, -294, -216, -234, 427, 945, 265, -157, 265, 715, 275, 715, -186, 337, 798, -170, 427, 706, 754, 961, 286, -216, 798, 286, 961, 684, -424, 337 };
        String direction = "WNSNNSSWWWEENWESNSWSWSEWWEWEWWWNWESNSSNNSNNWWWNESE";
        assertEquals(42, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case114() {
        int[] x = { -1000, 1000 };
        int[] y = { 0, 0 };
        String direction = "EW";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case115() {
        int[] x = { 2, 10, 0, 0 };
        int[] y = { 2, 2, 2, 0 };
        String direction = "EWEN";
        assertEquals(2, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case116() {
        int[] x = { 2, 0, 1 };
        int[] y = { 0, 2, 1 };
        String direction = "NEN";
        assertEquals(1, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case117() {
        int[] x = { -1000, 1000 };
        int[] y = { 1000, -1000 };
        String direction = "SW";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case118() {
        int[] x = { 0, 0, 2, 3, 4 };
        int[] y = { 0, -1, 2, 3, 4 };
        String direction = "SNSSS";
        assertEquals(3, antsmeet.countAnts(x, y, direction));
    }

    @Test
    public void case119() {
        int[] x = { 0, 0 };
        int[] y = { 10, 0 };
        String direction = "SN";
        assertEquals(0, antsmeet.countAnts(x, y, direction));
    }

}
