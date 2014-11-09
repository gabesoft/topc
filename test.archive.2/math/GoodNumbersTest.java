package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class GoodNumbersTest {
    GoodNumbers goodnumbers = new GoodNumbers();

    @Test
    public void case1() {
        int[] a = { 4 };
        int[] b = { 3 };
        int N = 20;
        assertEquals(4, goodnumbers.count(a, b, N));
    }

    @Test
    public void case2() {
        int[] a = { 3, 2 };
        int[] b = { 2, 3 };
        int N = 9;
        assertEquals(5, goodnumbers.count(a, b, N));
    }

    @Test
    public void case3() {
        int[] a = { 5, 15, 5, 15 };
        int[] b = { 4, 4, 2, 2 };
        int N = 50;
        assertEquals(8, goodnumbers.count(a, b, N));
    }

    @Test
    public void case4() {
        int[] a = { 1 };
        int[] b = { 1 };
        int N = 1000;
        assertEquals(0, goodnumbers.count(a, b, N));
    }

    @Test
    public void case5() {
        int[] a = { 74 };
        int[] b = { 931 };
        int N = 999999808;
        assertEquals(13498995, goodnumbers.count(a, b, N));
    }

    @Test
    public void case6() {
        int[] a = { 879, 710 };
        int[] b = { 115438893, 43 };
        int N = 999999273;
        assertEquals(2511785, goodnumbers.count(a, b, N));
    }

    @Test
    public void case7() {
        int[] a = { 328, 841, 304 };
        int[] b = { 710, 561, 100 };
        int N = 999999988;
        assertEquals(7300921, goodnumbers.count(a, b, N));
    }

    @Test
    public void case8() {
        int[] a = { 336, 827, 268, 704877634 };
        int[] b = { 150, 822, 673, 337 };
        int N = 999999279;
        assertEquals(7740201, goodnumbers.count(a, b, N));
    }

    @Test
    public void case9() {
        int[] a = { 229, 195, 2, 709, 669 };
        int[] b = { 44788639, 531, 723, 550, 802 };
        int N = 999999486;
        assertEquals(505477863, goodnumbers.count(a, b, N));
    }

    @Test
    public void case10() {
        int[] a = { 409, 934, 982, 14, 815, 537 };
        int[] b = { 670, 95, 502, 196, 405, 299 };
        int N = 999999854;
        assertEquals(73248392, goodnumbers.count(a, b, N));
    }

    @Test
    public void case11() {
        int[] a = { 506, 753, 717, 439, 502, 872, 138 };
        int[] b = { 178, 295, 610, 746, 636, 143, 969 };
        int N = 999999189;
        assertEquals(15862809, goodnumbers.count(a, b, N));
    }

    @Test
    public void case12() {
        int[] a = { 589673558, 9, 969, 531, 963, 366, 853, 822 };
        int[] b = { 713, 902, 51726006, 58, 791, 213111267, 7, 99 };
        int N = 999999413;
        assertEquals(115182465, goodnumbers.count(a, b, N));
    }

    @Test
    public void case13() {
        int[] a = { 455, 290, 334949810, 124, 814, 60935239, 221, 367, 227 };
        int[] b = { 364, 845, 543436551, 624, 386, 273, 248, 497, 624 };
        int N = 999999096;
        assertEquals(25556484, goodnumbers.count(a, b, N));
    }

    @Test
    public void case14() {
        int[] a = { 969, 916, 535, 12, 153, 296, 397, 816, 34, 398 };
        int[] b = { 548, 211, 212, 378, 626, 869, 777, 440, 332, 302 };
        int N = 999999421;
        assertEquals(118728494, goodnumbers.count(a, b, N));
    }

    @Test
    public void case15() {
        int[] a = { 168120222, 756, 408, 194, 681, 856, 964, 677, 250, 845 };
        int[] b = { 809, 652, 204, 532, 420, 10, 640688057, 55, 174076738, 318 };
        int N = 1000000000;
        assertEquals(16328141, goodnumbers.count(a, b, N));
    }

    @Test
    public void case16() {
        int[] a = { 578134257, 598, 705, 605925151, 413, 798, 382, 66, 700, 130 };
        int[] b = { 484, 608, 323, 177, 225, 360280841, 284660919, 684570286, 899, 134 };
        int N = 999999526;
        assertEquals(32247821, goodnumbers.count(a, b, N));
    }

    @Test
    public void case17() {
        int[] a = { 179, 358, 879, 820, 134, 721, 634, 32, 590, 878 };
        int[] b = { 359, 599777255, 794014916, 481, 103670398, 108, 1, 36, 114, 594 };
        int N = 999999558;
        assertEquals(46244104, goodnumbers.count(a, b, N));
    }

    @Test
    public void case18() {
        int[] a = { 419, 586, 16, 103, 644, 968, 270, 304, 104, 386 };
        int[] b = { 460, 931, 133, 604, 921, 9135232, 171620204, 939825160, 259, 677 };
        int N = 999999361;
        assertEquals(86899142, goodnumbers.count(a, b, N));
    }

    @Test
    public void case19() {
        int[] a = { 781, 833, 550, 250, 311, 984, 473392090, 651, 230, 747 };
        int[] b = { 231, 777, 245, 697, 65, 614056599, 941, 552, 206, 164780468 };
        int N = 999999951;
        assertEquals(18786727, goodnumbers.count(a, b, N));
    }

    @Test
    public void case20() {
        int[] a = { 414, 51519751, 784, 118, 551, 196, 512, 270438667, 48762044, 566 };
        int[] b = { 556228743, 353, 142, 633413926, 128, 788, 626, 518, 843, 975 };
        int N = 999999275;
        assertEquals(21159223, goodnumbers.count(a, b, N));
    }

    @Test
    public void case21() {
        int[] a = { 221, 240, 306, 254, 167, 305, 73646453, 721, 581, 353 };
        int[] b = { 699, 812, 892, 729, 662, 121, 268317159, 628, 962854266, 595 };
        int N = 999999446;
        assertEquals(30222964, goodnumbers.count(a, b, N));
    }

    @Test
    public void case22() {
        int[] a = { 828, 532, 517, 516, 602, 662, 325, 937, 16, 265963217 };
        int[] b = { 974, 721, 170, 828, 729, 385, 950, 47, 667, 521 };
        int N = 999999534;
        assertEquals(74215995, goodnumbers.count(a, b, N));
    }

    @Test
    public void case23() {
        int[] a = { 211, 212, 519, 935, 768, 819, 826, 29, 35, 241 };
        int[] b = { 541, 936, 49, 12, 65, 238, 246, 773471031, 711, 38 };
        int N = 999999385;
        assertEquals(80126118, goodnumbers.count(a, b, N));
    }

    @Test
    public void case24() {
        int[] a = { 716, 580, 165, 502, 290, 34, 562165090, 812535218, 39, 339 };
        int[] b = { 322, 497, 789, 988, 236, 685, 785, 668, 616, 977 };
        int N = 999999300;
        assertEquals(68339355, goodnumbers.count(a, b, N));
    }

    @Test
    public void case25() {
        int[] a = { 97, 89, 23, 13, 83, 71, 7, 89, 29, 53 };
        int[] b = { 53, 61, 61, 41, 7, 5, 11, 53, 41, 7 };
        int N = 16808;
        assertEquals(5053, goodnumbers.count(a, b, N));
    }

    @Test
    public void case26() {
        int[] a = { 29, 19, 31, 23, 97, 7, 59, 31, 83, 3 };
        int[] b = { 41, 61, 31, 23, 11, 97, 11, 79, 61, 83 };
        int N = 474833170;
        assertEquals(242765855, goodnumbers.count(a, b, N));
    }

    @Test
    public void case27() {
        int[] a = { 37, 31, 73, 7, 59, 71, 19, 3, 7, 23 };
        int[] b = { 71, 67, 53, 97, 79, 13, 7, 83, 59, 97 };
        int N = 551901394;
        assertEquals(292453863, goodnumbers.count(a, b, N));
    }

    @Test
    public void case28() {
        int[] a = { 3, 7, 5, 23, 7, 23, 89, 17, 31, 43 };
        int[] b = { 53, 47, 43, 37, 2, 71, 53, 71, 11, 3 };
        int N = 685118025;
        assertEquals(417430463, goodnumbers.count(a, b, N));
    }

    @Test
    public void case29() {
        int[] a = { 73, 13, 11, 3, 89, 43, 89, 13, 19, 5 };
        int[] b = { 59, 59, 41, 43, 71, 3, 83, 79, 7, 41 };
        int N = 864546518;
        assertEquals(505068578, goodnumbers.count(a, b, N));
    }

    @Test
    public void case30() {
        int[] a = { 156818623, 253751015, 225716029, 257071437, 243548886, 229234434, 212225039, 214073095, 259618806, 205868303 };
        int[] b = { 159111530, 192035333, 179549086, 168299310, 241111833, 206614473, 231582262, 251714606, 259697372, 251998956 };
        int N = 999996808;
        assertEquals(39, goodnumbers.count(a, b, N));
    }

    @Test
    public void case31() {
        int[] a = { 292029114, 253509971, 312129948, 358442994, 473861102, 348473092, 455121976, 429857362, 389715450, 244005246 };
        int[] b = { 379183686, 304884938, 301373083, 442630584, 468471703, 253574684, 377530978, 341238638, 386445575, 358173558 };
        int N = 999990445;
        assertEquals(25, goodnumbers.count(a, b, N));
    }

    @Test
    public void case32() {
        int[] a = { 66784354, 122137114, 103476140, 77759463, 79928408, 98125505, 74464572, 127245591, 91852628, 86549142 };
        int[] b = { 71842628, 67687279, 118649236, 91478954, 127773020, 95168298, 71011626, 107510487, 102420460, 121261290 };
        int N = 999998246;
        assertEquals(106, goodnumbers.count(a, b, N));
    }

    @Test
    public void case33() {
        int[] a = { 261867738, 351980076, 320626273, 294599603, 244288660, 379842203, 247550810, 348995396, 347712505, 223131090 };
        int[] b = { 370785714, 204881654, 289209283, 274919842, 333328819, 250022311, 322228676, 286697645, 399790462, 230496735 };
        int N = 999999528;
        assertEquals(29, goodnumbers.count(a, b, N));
    }

    @Test
    public void case34() {
        int[] a = { 363942150, 417959484, 261242501, 342105621, 447159407, 319966570, 452645864, 387813844, 330074172, 330089721 };
        int[] b = { 491783769, 416035425, 410025225, 300325740, 381095330, 419175315, 435339880, 424511556, 461580514, 364362530 };
        int N = 999991516;
        assertEquals(24, goodnumbers.count(a, b, N));
    }

    @Test
    public void case35() {
        int[] a = { 665932572, 558116436, 901164338, 608764520, 716937234, 743926950, 744945916, 463548394, 707376033, 673060674 };
        int[] b = { 897477768, 465354299, 664099310, 765197169, 752176840, 699154563, 893345019, 669171947, 630097741, 531853910 };
        int N = 999990471;
        assertEquals(11, goodnumbers.count(a, b, N));
    }

    @Test
    public void case36() {
        int[] a = { 428330100, 270958791, 260771890, 387797564, 417919525, 338319786, 294706606, 316531041, 346304491, 399409431 };
        int[] b = { 421748719, 357689915, 373488434, 251287673, 226894239, 266886285, 385989370, 423832867, 394722826, 314597734 };
        int N = 999999493;
        assertEquals(24, goodnumbers.count(a, b, N));
    }

    @Test
    public void case37() {
        int[] a = { 226029206, 127590981, 180598440, 166458747, 135342814, 141566604, 223220482, 189169900, 170195946, 119885581 };
        int[] b = { 178062987, 204958540, 157426970, 233700760, 167711689, 156236311, 157770294, 220341594, 200349135, 204479132 };
        int N = 999990970;
        assertEquals(58, goodnumbers.count(a, b, N));
    }

    @Test
    public void case38() {
        int[] a = { 66676660, 110986572, 61186678, 83778706, 73991869, 114930795, 72289929, 72379363, 92155870, 64966605 };
        int[] b = { 86834351, 82187027, 104826759, 91744470, 107977988, 84001661, 76696996, 95766802, 79094974, 91402210 };
        int N = 999991987;
        assertEquals(122, goodnumbers.count(a, b, N));
    }

    @Test
    public void case39() {
        int[] a = { 356728, 466718, 301622, 523412, 372198, 506869, 298129, 457098, 386105, 428655 };
        int[] b = { 393530, 425537, 296476, 283556, 266377, 310245, 312825, 362378, 473290, 480194 };
        int N = 999994508;
        assertEquals(25095, goodnumbers.count(a, b, N));
    }

    @Test
    public void case40() {
        int[] a = { 7, 4, 6, 10, 8, 10, 10, 3, 2, 10 };
        int[] b = { 8, 10, 2, 4, 9, 9, 9, 3, 8, 3 };
        int N = 999916808;
        assertEquals(568603487, goodnumbers.count(a, b, N));
    }

    @Test
    public void case41() {
        int[] a = { 6, 8, 8, 2, 10, 9, 9, 4, 7, 3 };
        int[] b = { 10, 2, 3, 3, 2, 5, 3, 4, 3, 2 };
        int N = 999917710;
        assertEquals(680896346, goodnumbers.count(a, b, N));
    }

    @Test
    public void case42() {
        int[] a = { 4, 6, 8, 6, 10, 4, 9, 3, 3, 7 };
        int[] b = { 5, 10, 5, 6, 9, 9, 2, 10, 10, 3 };
        int N = 999925486;
        assertEquals(588845008, goodnumbers.count(a, b, N));
    }

    @Test
    public void case43() {
        int[] a = { 8, 9, 6, 9, 9, 9, 8, 6, 7, 2 };
        int[] b = { 7, 4, 8, 9, 2, 6, 4, 7, 8, 10 };
        int N = 999940978;
        assertEquals(572585252, goodnumbers.count(a, b, N));
    }

    @Test
    public void case44() {
        int[] a = { 5, 10, 7, 9, 8, 10, 9, 8, 4, 2 };
        int[] b = { 5, 2, 4, 7, 4, 10, 3, 2, 5, 5 };
        int N = 999919452;
        assertEquals(535671136, goodnumbers.count(a, b, N));
    }

    @Test
    public void case45() {
        int[] a = { 7, 8, 5, 7, 9, 9, 10, 10, 2, 3 };
        int[] b = { 8, 3, 9, 2, 7, 9, 3, 8, 9, 9 };
        int N = 999921610;
        assertEquals(769384129, goodnumbers.count(a, b, N));
    }

    @Test
    public void case46() {
        int[] a = { 3, 2, 2, 9, 8, 4, 10, 8, 7, 8 };
        int[] b = { 3, 4, 7, 6, 10, 9, 10, 3, 8, 5 };
        int N = 999942083;
        assertEquals(618614964, goodnumbers.count(a, b, N));
    }

    @Test
    public void case47() {
        int[] a = { 9, 7, 3, 8, 2, 4, 4, 10, 2, 3 };
        int[] b = { 8, 4, 9, 9, 10, 8, 9, 2, 3, 9 };
        int N = 999983455;
        assertEquals(711496165, goodnumbers.count(a, b, N));
    }

    @Test
    public void case48() {
        int[] a = { 9, 8, 6, 3, 10, 2, 4, 2, 3, 6 };
        int[] b = { 6, 9, 7, 4, 3, 5, 8, 4, 9, 7 };
        int N = 999936551;
        assertEquals(666227567, goodnumbers.count(a, b, N));
    }

    @Test
    public void case49() {
        int[] a = { 5, 9, 10, 4, 8, 2, 9, 7, 7, 3 };
        int[] b = { 5, 6, 10, 10, 10, 5, 2, 9, 9, 2 };
        int N = 999954680;
        assertEquals(626955711, goodnumbers.count(a, b, N));
    }

    @Test
    public void case50() {
        int[] a = { 26611, 41251, 136793, 197213, 1435, 23903, 14413, 13547, 40061, 7719 };
        int[] b = { 77531, 24541, 53009, 205757, 15841, 79591, 483, 252121, 99619, 34279 };
        int N = 999016808;
        assertEquals(1104388, goodnumbers.count(a, b, N));
    }

    @Test
    public void case51() {
        int[] a = { 105, 3703, 46903, 107113, 3182, 267173, 2013, 10439, 11481, 21983 };
        int[] b = { 17405, 125173, 19671, 6601, 29465, 5423, 4526, 526613, 85157, 31027 };
        int N = 999728550;
        assertEquals(10819451, goodnumbers.count(a, b, N));
    }

    @Test
    public void case52() {
        int[] a = { 9503, 132553, 5795, 236447, 12561, 13889, 165731, 5797, 539251, 69509 };
        int[] b = { 18941, 4539, 134977, 367993, 5133, 131279, 7526, 214223, 156953, 120931 };
        int N = 999716396;
        assertEquals(629053, goodnumbers.count(a, b, N));
    }

    @Test
    public void case53() {
        int[] a = { 461287, 110081, 3538, 2035, 347261, 255407, 96347, 48223, 2542, 4255 };
        int[] b = { 2294, 14673, 278099, 867, 182683, 17719, 67469, 11999, 9503, 345 };
        int N = 999413497;
        assertEquals(1356575, goodnumbers.count(a, b, N));
    }

    @Test
    public void case54() {
        int[] a = { 70219, 24153, 2023, 6674, 4147, 30349, 182573, 68, 347189, 44 };
        int[] b = { 1353, 15521, 33019, 30943, 13363, 140353, 273, 74399, 10366, 162781 };
        int N = 999963250;
        assertEquals(36870990, goodnumbers.count(a, b, N));
    }

    @Test
    public void case55() {
        int[] a = { 349, 589, 186, 955, 674, 190, 163, 957, 830, 721 };
        int[] b = { 764, 361, 911, 166, 54, 279, 45, 300, 746, 480 };
        int N = 990016808;
        assertEquals(26137672, goodnumbers.count(a, b, N));
    }

    @Test
    public void case56() {
        int[] a = { 510, 638, 791, 965, 64, 639, 954, 274, 691, 300 };
        int[] b = { 118, 218, 921, 156, 947, 167, 12, 796, 849, 776 };
        int N = 994817710;
        assertEquals(30836894, goodnumbers.count(a, b, N));
    }

    @Test
    public void case57() {
        int[] a = { 13, 888, 422, 483, 685, 103, 837, 894, 957, 421 };
        int[] b = { 959, 829, 995, 96, 396, 207, 389, 829, 721, 723 };
        int N = 999125486;
        assertEquals(97193221, goodnumbers.count(a, b, N));
    }

    @Test
    public void case58() {
        int[] a = { 575, 468, 636, 747, 261, 387, 629, 204, 826, 200 };
        int[] b = { 403, 328, 620, 585, 740, 429, 931, 484, 719, 775 };
        int N = 991540978;
        assertEquals(24116776, goodnumbers.count(a, b, N));
    }

    @Test
    public void case59() {
        int[] a = { 473, 604, 61, 234, 431, 118, 540, 278, 373, 92 };
        int[] b = { 509, 749, 274, 169, 580, 208, 57, 452, 167, 455 };
        int N = 996319452;
        assertEquals(51744356, goodnumbers.count(a, b, N));
    }

    @Test
    public void case60() {
        int[] a = { 898, 935, 833, 376, 585, 738, 334, 784, 857, 822 };
        int[] b = { 44, 588, 171, 821, 250, 252, 867, 557, 648, 54 };
        int N = 991621610;
        assertEquals(15020575, goodnumbers.count(a, b, N));
    }

    @Test
    public void case61() {
        int[] a = { 129, 290, 956, 855, 908, 580, 109, 611, 250, 530 };
        int[] b = { 363, 490, 502, 6, 316, 135, 469, 102, 17, 725 };
        int N = 992842083;
        assertEquals(29408087, goodnumbers.count(a, b, N));
    }

    @Test
    public void case62() {
        int[] a = { 675, 718, 192, 440, 893, 661, 697, 685, 236, 363 };
        int[] b = { 35, 139, 117, 558, 235, 215, 504, 407, 606, 936 };
        int N = 995583455;
        assertEquals(21639181, goodnumbers.count(a, b, N));
    }

    @Test
    public void case63() {
        int[] a = { 117, 692, 735, 498, 208, 299, 49, 92, 372, 735 };
        int[] b = { 303, 954, 187, 589, 363, 374, 413, 193, 135, 169 };
        int N = 993436551;
        assertEquals(50244312, goodnumbers.count(a, b, N));
    }

    @Test
    public void case64() {
        int[] a = { 302, 783, 820, 40, 611, 740, 261, 880, 16, 408 };
        int[] b = { 284, 843, 748, 901, 262, 581, 65, 171, 180, 668 };
        int N = 993454680;
        assertEquals(84436448, goodnumbers.count(a, b, N));
    }

    @Test
    public void case65() {
        int[] a = { 970, 920, 365, 489, 141, 488, 527, 729, 204, 775 };
        int[] b = { 385, 204, 838, 557, 723, 803, 903, 100, 592, 705 };
        int N = 992737336;
        assertEquals(24476371, goodnumbers.count(a, b, N));
    }

    @Test
    public void case66() {
        int[] a = { 920, 192, 412, 303, 569, 260, 125, 529, 233, 502 };
        int[] b = { 767, 803, 317, 691, 770, 12, 340, 195, 256, 887 };
        int N = 994016856;
        assertEquals(31395290, goodnumbers.count(a, b, N));
    }

    @Test
    public void case67() {
        int[] a = { 759, 309, 989, 374, 113, 401, 244, 970, 475, 170 };
        int[] b = { 626, 728, 685, 683, 936, 739, 906, 395, 133, 493 };
        int N = 990687930;
        assertEquals(30746329, goodnumbers.count(a, b, N));
    }

    @Test
    public void case68() {
        int[] a = { 331, 928, 869, 195, 257, 303, 601, 92, 427, 733 };
        int[] b = { 467, 641, 721, 771, 855, 10, 728, 392, 355, 542 };
        int N = 993034749;
        assertEquals(32616799, goodnumbers.count(a, b, N));
    }

    @Test
    public void case69() {
        int[] a = { 404, 107, 265, 538, 841, 437, 853, 282, 151, 785 };
        int[] b = { 44, 731, 706, 892, 636, 948, 609, 439, 722, 754 };
        int N = 992883017;
        assertEquals(32542041, goodnumbers.count(a, b, N));
    }

    @Test
    public void case70() {
        int[] a = { 66301, 53509, 20373, 15976, 28556, 65458, 92512, 57783, 72677, 49321 };
        int[] b = { 2339, 43786, 9137, 33880, 96741, 31896, 87075, 44049, 53270, 47919 };
        int N = 900016808;
        assertEquals(231971, goodnumbers.count(a, b, N));
    }

    @Test
    public void case71() {
        int[] a = { 47733, 82250, 95075, 94322, 60751, 10395, 18648, 24196, 19150, 30288 };
        int[] b = { 39619, 84683, 94566, 95394, 57863, 66668, 17274, 31774, 16914, 35516 };
        int N = 964817710;
        assertEquals(334246, goodnumbers.count(a, b, N));
    }

    @Test
    public void case72() {
        int[] a = { 38794, 13092, 46052, 95730, 51463, 31414, 21816, 63849, 23385, 75067 };
        int[] b = { 98573, 21475, 29057, 62205, 47151, 65502, 39638, 24877, 18991, 17463 };
        int N = 999125486;
        assertEquals(302788, goodnumbers.count(a, b, N));
    }

    @Test
    public void case73() {
        int[] a = { 28583, 76518, 71052, 47232, 34587, 27639, 35243, 99789, 59272, 55613 };
        int[] b = { 55780, 18211, 41894, 22788, 75971, 61287, 65164, 47716, 45917, 25984 };
        int N = 971540978;
        assertEquals(215160, goodnumbers.count(a, b, N));
    }

    @Test
    public void case74() {
        int[] a = { 87197, 27703, 7045, 57906, 19448, 49735, 45567, 48410, 60223, 62066 };
        int[] b = { 63041, 54947, 90040, 59659, 14440, 31636, 70410, 83108, 33773, 88610 };
        int N = 946319452;
        assertEquals(334520, goodnumbers.count(a, b, N));
    }

    @Test
    public void case75() {
        int[] a = { 71656, 63305, 67055, 84382, 1575, 84969, 43318, 93214, 2216, 79455 };
        int[] b = { 41660, 96906, 16974, 41213, 39256, 9684, 74892, 17783, 16992, 99369 };
        int N = 951621610;
        assertEquals(1141756, goodnumbers.count(a, b, N));
    }

    @Test
    public void case76() {
        int[] a = { 39054, 42149, 96428, 27882, 86282, 78061, 61264, 45350, 26683, 56240 };
        int[] b = { 52734, 28570, 58687, 22812, 42751, 87498, 7939, 56739, 51803, 79610 };
        int N = 922842083;
        assertEquals(197044, goodnumbers.count(a, b, N));
    }

    @Test
    public void case77() {
        int[] a = { 15012, 70747, 62256, 3374, 41447, 39739, 54175, 81136, 35849, 48459 };
        int[] b = { 5381, 90895, 32715, 49347, 28045, 34415, 43344, 22223, 9372, 67437 };
        int N = 985583455;
        assertEquals(514008, goodnumbers.count(a, b, N));
    }

    @Test
    public void case78() {
        int[] a = { 25443, 74726, 4893, 16932, 12646, 75548, 13243, 47009, 28092, 14406 };
        int[] b = { 45996, 909, 38266, 42835, 48630, 17474, 77858, 73462, 66474, 9601 };
        int N = 943436551;
        assertEquals(575015, goodnumbers.count(a, b, N));
    }

    @Test
    public void case79() {
        int[] a = { 90041, 92376, 19, 10894, 5975, 8030, 24534, 51082, 24892, 28290 };
        int[] b = { 1940, 29373, 85276, 36883, 48331, 45581, 51005, 88551, 38691, 1037 };
        int N = 943454680;
        assertEquals(50128657, goodnumbers.count(a, b, N));
    }

    @Test
    public void case80() {
        int[] a = { 87946, 4178, 78089, 7941, 44214, 3980, 44843, 75987, 87468, 19675 };
        int[] b = { 31777, 21975, 23428, 61037, 56037, 37595, 36975, 33823, 34612, 12900 };
        int N = 902737336;
        assertEquals(686576, goodnumbers.count(a, b, N));
    }

    @Test
    public void case81() {
        int[] a = { 78806, 38046, 8134, 66408, 76790, 15569, 77858, 87658, 77417, 55618 };
        int[] b = { 35507, 63821, 59861, 10348, 941, 15978, 10645, 54573, 44041, 31937 };
        int N = 904016856;
        assertEquals(279586, goodnumbers.count(a, b, N));
    }

    @Test
    public void case82() {
        int[] a = { 48648, 92847, 78479, 99896, 67766, 57875, 12574, 40039, 36430, 66698 };
        int[] b = { 23333, 54539, 34624, 31211, 46143, 1657, 42675, 3914, 7747, 65986 };
        int N = 940687930;
        assertEquals(219196, goodnumbers.count(a, b, N));
    }

    @Test
    public void case83() {
        int[] a = { 72286, 51499, 95999, 28518, 99770, 71007, 55465, 66791, 85486, 58954 };
        int[] b = { 79253, 72245, 85006, 43395, 99009, 93970, 6614, 73292, 247, 77132 };
        int N = 993034749;
        assertEquals(163257, goodnumbers.count(a, b, N));
    }

    @Test
    public void case84() {
        int[] a = { 24533, 52433, 27454, 9205, 60259, 73364, 90430, 25185, 38302, 39089 };
        int[] b = { 92285, 7697, 99004, 27379, 26628, 60114, 13308, 88828, 87158, 47842 };
        int N = 902883017;
        assertEquals(304682, goodnumbers.count(a, b, N));
    }

    @Test
    public void case85() {
        int[] a = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] b = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        int N = 1000000000;
        assertEquals(999963925, goodnumbers.count(a, b, N));
    }

    @Test
    public void case86() {
        int[] a = { 2, 3, 5, 2, 3, 5, 2, 3, 5, 2 };
        int[] b = { 3, 5, 2, 5, 2, 3, 2, 3, 5, 3 };
        int N = 987654321;
        assertEquals(691358025, goodnumbers.count(a, b, N));
    }

    @Test
    public void case87() {
        int[] a = { 2, 3, 5, 7, 2, 3, 5, 7, 2, 3 };
        int[] b = { 3, 5, 7, 2, 5, 2, 2, 3, 7, 7 };
        int N = 987654321;
        assertEquals(757201647, goodnumbers.count(a, b, N));
    }

    @Test
    public void case88() {
        int[] a = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] b = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int N = 1000000000;
        assertEquals(0, goodnumbers.count(a, b, N));
    }

}
