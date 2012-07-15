package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class CrazyComponentsTest {
    double DELTA = 1.0e-09;
    CrazyComponents crazycomponents = new CrazyComponents();

    @Test
    public void case1() {
        int k = 1;
        String[] components = { "", "" };
        int[] income = { 1, 2 };
        int[] expense = { 0, 0 };
        assertEquals(1.5, crazycomponents.expectedProfit(k, components, income, expense), DELTA * 1.5);
    }

    @Test
    public void case2() {
        int k = 50;
        String[] components = { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" };
        int[] income = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
        int[] expense = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        assertEquals(50000.0, crazycomponents.expectedProfit(k, components, income, expense), DELTA * 50000.0);
    }

    @Test
    public void case3() {
        int k = 17;
        String[] components = { "1 2 3 4 5", "", "", "", "", "" };
        int[] income = { 1000, 0, 0, 0, 0, 0 };
        int[] expense = { 0, 100, 100, 100, 100, 100 };
        assertEquals(301.23489487382017, crazycomponents.expectedProfit(k, components, income, expense), DELTA * 301.23489487382017);
    }

    @Test
    public void case4() {
        int k = 23;
        String[] components = { "1 2 3", "2 3", "3", "" };
        int[] income = { 987654, 12345, 12345, 12345 };
        int[] expense = { 123456, 98765, 98765, 98765 };
        assertEquals(2178721.482113228, crazycomponents.expectedProfit(k, components, income, expense), DELTA * 2178721.482113228);
    }

    @Test
    public void case5() {
        int k = 50;
        String[] components = { "1 2 3", "", "", "" };
        int[] income = { 1000, 0, 0, 0 };
        int[] expense = { 0, 333, 333, 333 };
        assertEquals(9667.669182645035, crazycomponents.expectedProfit(k, components, income, expense), DELTA * 9667.669182645035);
    }

    @Test
    public void case6() {
        int k = 50;
        String[] components = { "3 5 8 1", "3 5 8", "9 6 3", "1 2", "", "9 8", "", "", "", "", "", "", "", "", "" };
        int[] income = { 1423, 23423, 234523, 234234, 64575, 65578, 756865, 756856, 568679, 346457, 4564, 97895, 867864, 4786, 457586 };
        int[] expense = { 83, 635745, 3454, 346435, 345645, 3468, 35765, 34647, 64589, 7536, 8563, 546, 74645, 87635, 3657 };
        assertEquals(12220512.264046831, crazycomponents.expectedProfit(k, components, income, expense), DELTA * 12220512.264046831);
    }

    @Test
    public void case7() {
        int k = 12;
        String[] components = { "1", "0" };
        int[] income = { 345774, 965234 };
        int[] expense = { 123, 654 };
        assertEquals(0.0, crazycomponents.expectedProfit(k, components, income, expense), DELTA);
    }

    @Test
    public void case8() {
        int k = 50;
        String[] components = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "0" };
        int[] income = { 999999, 999999, 999999, 999999, 999999, 999999, 999999, 999999, 999999, 999999, 999999, 999999, 999999, 999999, 999999 };
        int[] expense = { 123, 23423, 3453, 234534, 234534, 34534, 234534, 234534, 345, 74567, 575, 3457, 4754, 7543, 8564 };
        assertEquals(0.0, crazycomponents.expectedProfit(k, components, income, expense), DELTA);
    }

    @Test
    public void case9() {
        int k = 42;
        String[] components = { "10", "2 14 12", "", "1 10 7 4 2", "13", "4", "1 12", "9 10 11 12 8", "9", "", "11 13", "7 1 12 2", "0 14", "0 14 7", "2 11" };
        int[] income = { 229256, 395321, 430193, 896648, 943156, 748288, 376108, 286526, 619176, 292469, 801614, 372602, 612005, 464916, 114101 };
        int[] expense = { 184265, 514178, 761731, 254337, 840235, 446818, 418671, 946273, 305527, 744361, 875794, 412824, 275437, 975798, 357870 };
        assertEquals(189550.05923618007, crazycomponents.expectedProfit(k, components, income, expense), DELTA * 189550.05923618007);
    }

    @Test
    public void case10() {
        int k = 43;
        String[] components = { "12", "2", "7 0 14 13", "", "14 0 9 5 13", "13 6", "10 12 3", "3", "", "4", "14", "4 3 2 0", "9", "3 5 4 2", "4 5 6" };
        int[] income = { 448113, 547049, 662039, 77755, 381337, 391766, 72517, 473840, 255847, 328965, 44416, 410482, 172106, 421985, 197300 };
        int[] expense = { 671539, 806844, 396175, 718543, 992876, 801451, 252173, 696007, 975537, 443593, 833995, 53418, 390350, 719127, 148916 };
        assertEquals(0.0, crazycomponents.expectedProfit(k, components, income, expense), DELTA);
    }

    @Test
    public void case11() {
        int k = 44;
        String[] components = { "3", "8 6", "0", "7 1 5 12 10", "5", "2 6 14", "", "", "14 7 13 9", "0 4 7 10 5", "", "10 8 0", "13 1 3", "3 8 4 7 5", "6 11 2 10 8" };
        int[] income = { 974739, 797734, 963559, 674092, 87484, 220574, 277282, 232154, 863107, 790110, 376332, 495049, 476990, 790863, 160069 };
        int[] expense = { 189007, 515008, 999909, 192599, 668654, 153381, 521205, 425561, 649337, 785547, 697987, 156402, 623509, 835575, 633660 };
        assertEquals(0.0, crazycomponents.expectedProfit(k, components, income, expense), DELTA);
    }

    @Test
    public void case12() {
        int k = 42;
        String[] components = { "", "3 14 4 6 5", "8 9 10 4", "", "", "", "9 11", "", "4 9 1 10 13", "10 11", "5", "9 5 10", "6 11", "3 11 4", "8" };
        int[] income = { 15858, 47122, 825040, 820399, 342310, 398546, 672039, 152315, 843510, 64092, 443629, 344869, 93030, 11182, 481422 };
        int[] expense = { 934753, 459759, 324240, 384639, 140971, 46286, 293139, 679853, 363758, 53438, 239673, 515841, 60976, 695786, 976655 };
        assertEquals(3148574.1501256498, crazycomponents.expectedProfit(k, components, income, expense), DELTA * 3148574.1501256498);
    }

    @Test
    public void case13() {
        int k = 45;
        String[] components = { "11", "9 5 2 11", "8 4 9 6", "0 11 1 14 7", "", "3 8 9 14 1", "10 7 9", "", "10 5", "0 7 2 1", "", "13 8 7", "3", "3 1", "4 9 0" };
        int[] income = { 978629, 468727, 983860, 882188, 427243, 550963, 497412, 973377, 837744, 184125, 143647, 129151, 793970, 474056, 566361 };
        int[] expense = { 196384, 879062, 258861, 160049, 585377, 884323, 202211, 264308, 222208, 129988, 28369, 432749, 64353, 565239, 424228 };
        assertEquals(2473041.000000001, crazycomponents.expectedProfit(k, components, income, expense), DELTA * 2473041.000000001);
    }

    @Test
    public void case14() {
        int k = 44;
        String[] components = { "11 8", "2 8", "3 7 11 9 4", "8", "5 11", "11", "12 5 9", "10 4 9 8", "5 9", "4 7 1 14 2", "3", "", "", "4 10 6", "3" };
        int[] income = { 457806, 643689, 230778, 649545, 832009, 145582, 356133, 743012, 324548, 247901, 395226, 21056, 693215, 919796, 642196 };
        int[] expense = { 679770, 85591, 996412, 762579, 120881, 755966, 637006, 37121, 211895, 883047, 480282, 217935, 587615, 151504, 970783 };
        assertEquals(560969.7690987464, crazycomponents.expectedProfit(k, components, income, expense), DELTA * 560969.7690987464);
    }

    @Test
    public void case15() {
        int k = 40;
        String[] components = { "5", "0 5", "", "0 11", "13 11", "14 7 9 10 13", "3 7 2 8", "14", "11 0 12 4 10", "3 2", "8 3", "", "9 1 8 5", "12 2 4 5 14", "1 4 8" };
        int[] income = { 333974, 792520, 633052, 655732, 93238, 950068, 906626, 605091, 750577, 906671, 777716, 904297, 497551, 307029, 753767 };
        int[] expense = { 314365, 324719, 362602, 956819, 701733, 680363, 105543, 390901, 119974, 721763, 762997, 852333, 181805, 667116, 860119 };
        assertEquals(859770.6666666653, crazycomponents.expectedProfit(k, components, income, expense), DELTA * 859770.6666666653);
    }

    @Test
    public void case16() {
        int k = 41;
        String[] components = { "3 14", "5", "", "", "3", "1 6", "", "10 1 4 14", "9", "11", "11 1", "3 12 13", "", "", "5 1 0 13 3" };
        int[] income = { 784459, 647755, 142184, 512514, 215087, 685416, 171277, 136220, 484289, 452533, 125968, 256495, 350133, 667271, 658304 };
        int[] expense = { 522567, 459520, 34887, 933290, 516830, 437602, 207983, 553095, 579234, 851522, 945435, 607842, 12715, 58371, 604170 };
        assertEquals(2879881.0, crazycomponents.expectedProfit(k, components, income, expense), DELTA * 2879881.0);
    }

    @Test
    public void case17() {
        int k = 48;
        String[] components = { "6 8 3 9 4", "3 6 10", "", "13", "11 0", "9 10", "7", "5 1 4", "10 11", "4", "7 4 3 12", "", "13", "7", "" };
        int[] income = { 685103, 112714, 401575, 328364, 316344, 392949, 335869, 71572, 293075, 959491, 855489, 367342, 963132, 454769, 897440 };
        int[] expense = { 408595, 636222, 3893, 904271, 691761, 686725, 183632, 600716, 101905, 971909, 384766, 749855, 981846, 507652, 493100 };
        assertEquals(2566470.3999999906, crazycomponents.expectedProfit(k, components, income, expense), DELTA * 2566470.3999999906);
    }

    @Test
    public void case18() {
        int k = 45;
        String[] components = { "11", "2 6", "1 3 4 5 13", "", "", "11 10 6 1", "", "8 9", "10 2", "8 2", "5", "13 6 14 5 0", "9 1", "9 1 3 10 2", "12 9 1 4 6" };
        int[] income = { 768391, 744893, 917614, 267958, 162632, 632549, 629706, 829291, 178119, 67739, 710900, 482784, 7813, 597084, 790990 };
        int[] expense = { 55138, 244264, 459419, 72460, 553365, 942461, 177804, 164954, 214499, 720479, 382078, 948966, 818032, 345270, 493519 };
        assertEquals(1942200.0, crazycomponents.expectedProfit(k, components, income, expense), DELTA * 1942200.0);
    }

    @Test
    public void case19() {
        int k = 46;
        String[] components = { "7", "3 8", "4", "6 4 14 5", "12 9 7 3 14", "10", "", "4 0 12 5", "", "13 12 2 0", "12 2", "", "4 5 6 1", "", "3 4 5 6 7" };
        int[] income = { 391551, 899880, 509987, 586564, 804714, 732105, 465647, 344003, 904993, 430473, 765989, 51655, 261052, 627489, 469915 };
        int[] expense = { 534219, 843149, 275183, 641196, 74280, 141023, 983507, 575980, 459798, 907674, 742294, 521973, 410499, 576481, 189118 };
        assertEquals(1521689.1999999997, crazycomponents.expectedProfit(k, components, income, expense), DELTA * 1521689.1999999997);
    }

    @Test
    public void case20() {
        int k = 43;
        String[] components = { "9 10 11 12 6", "", "1", "1 0", "13 14 1", "1 2 8", "", "10 3 11 1 2", "9 3", "12 7 4 0 3", "9 12 13 14 0", "12 1 13", "0", "10 4", "12" };
        int[] income = { 367716, 214576, 644708, 494246, 533212, 713121, 389058, 645093, 262305, 355812, 461853, 92651, 137505, 577176, 63023 };
        int[] expense = { 249554, 418314, 353333, 98339, 282238, 22880, 447448, 432137, 423600, 704676, 102782, 799059, 621464, 361022, 779526 };
        assertEquals(371104.79839974205, crazycomponents.expectedProfit(k, components, income, expense), DELTA * 371104.79839974205);
    }

    @Test
    public void case21() {
        int k = 48;
        String[] components = { "7 1 13 2", "4 6 2", "0 12 8 14 11", "11", "", "", "14 5 4 12", "6 8 10", "", "2", "12 11 5 8 7", "10 5", "0 1", "2 14 0 5 7", "3 4 2 5" };
        int[] income = { 576119, 289454, 121592, 790183, 403584, 144293, 158792, 549603, 432905, 600, 652274, 918172, 889173, 272519, 241213 };
        int[] expense = { 191379, 740866, 300069, 28947, 464557, 879732, 677402, 765927, 721992, 306535, 436028, 7291, 953405, 602682, 288650 };
        assertEquals(0.0, crazycomponents.expectedProfit(k, components, income, expense), DELTA);
    }

    @Test
    public void case22() {
        int k = 47;
        String[] components = { "5 6 12 9 1", "", "12 13 11 3", "5 6", "1", "", "5", "13", "9 2 7", "1 0 4 2", "3 9 7 8", "2 3 12", "14", "1", "13 0 9" };
        int[] income = { 140555, 738064, 611419, 379003, 572763, 556377, 837971, 705199, 42892, 757185, 356088, 150012, 812396, 440048, 859029 };
        int[] expense = { 715460, 350029, 62008, 182808, 163652, 760220, 290486, 875023, 83049, 268110, 201113, 165668, 55811, 162737, 168705 };
        assertEquals(3965947.200349608, crazycomponents.expectedProfit(k, components, income, expense), DELTA * 3965947.200349608);
    }

    @Test
    public void case23() {
        int k = 42;
        String[] components = { "", "4 14 3 2", "10 1 3 7 4", "", "12 3", "4 9 8 10 6", "3", "2 8 3", "14 2 7 10", "6 7 4 11 3", "2", "7 3 13 0 5", "14 3 2", "3 7 0 8", "1 10 8 2" };
        int[] income = { 33753, 652505, 662782, 517530, 959609, 903624, 112150, 244441, 536895, 850111, 382780, 889248, 855875, 498595, 936192 };
        int[] expense = { 496809, 757028, 148328, 984774, 807823, 356909, 169905, 388632, 559436, 694171, 220856, 568537, 528221, 217483, 960127 };
        assertEquals(0.0, crazycomponents.expectedProfit(k, components, income, expense), DELTA);
    }

    @Test
    public void case24() {
        int k = 40;
        String[] components = { "1", "3", "5", "4 5", "10 3", "6 4 10", "", "6 8 2", "5 4 11 13 14", "0 3 10 11", "8", "9 7 4", "11 1 13 0 3", "6 8 7 0 10", "0 13 10 12 1" };
        int[] income = { 239361, 701576, 986280, 78932, 931163, 265235, 991764, 263475, 429419, 109471, 554583, 802197, 671180, 266089, 513922 };
        int[] expense = { 302321, 376874, 339214, 633537, 465991, 831086, 320310, 411689, 938982, 169210, 367286, 790637, 845023, 25609, 851254 };
        assertEquals(1790543.9999999974, crazycomponents.expectedProfit(k, components, income, expense), DELTA * 1790543.9999999974);
    }

    @Test
    public void case25() {
        int k = 47;
        String[] components = { "5 2 3 13 1", "10", "3 4 6", "6 8", "0 12 1 2", "8 10 7 6", "5 3", "8", "11 7 12", "0", "11", "7 8 1 4", "", "12 8 3 7 14", "0 2 10" };
        int[] income = { 272198, 173990, 291227, 4575, 149839, 332847, 121923, 5234, 285582, 350797, 840164, 200765, 849714, 329891, 436943 };
        int[] expense = { 19157, 635424, 985709, 828218, 866418, 362129, 714470, 642584, 804240, 349810, 932663, 224305, 439658, 620847, 863281 };
        assertEquals(1284842.133333329, crazycomponents.expectedProfit(k, components, income, expense), DELTA * 1284842.133333329);
    }

    @Test
    public void case26() {
        int k = 41;
        String[] components = { "13 2 7 8", "0 2", "0", "", "8 0 3 9", "3", "13 9 4 14 12", "", "1 14 2", "", "5 3 7 8 9", "", "", "", "" };
        int[] income = { 692413, 385179, 918448, 362237, 442176, 438196, 595499, 25597, 509248, 231245, 438059, 847772, 176721, 499619, 987003 };
        int[] expense = { 653684, 151884, 638419, 923752, 909768, 273694, 362293, 553329, 904942, 257372, 684118, 217697, 712148, 893489, 732730 };
        assertEquals(2417217.866666665, crazycomponents.expectedProfit(k, components, income, expense), DELTA * 2417217.866666665);
    }

    @Test
    public void case27() {
        int k = 49;
        String[] components = { "9 10", "6 7", "13", "9 12", "3 11 13 12", "9 10 11", "13 8 1", "", "1 14 11", "0 1", "11 3 0", "5 7 12", "1 5", "1 14 6 12", "1 3 0 9 10" };
        int[] income = { 474093, 52963, 35289, 427393, 755486, 202916, 747816, 638405, 708590, 664629, 901437, 773701, 987500, 792059, 967961 };
        int[] expense = { 709156, 406977, 768848, 267832, 627805, 554419, 256187, 281214, 383572, 337250, 971759, 967705, 712088, 816625, 216735 };
        assertEquals(1166823.9333333345, crazycomponents.expectedProfit(k, components, income, expense), DELTA * 1166823.9333333345);
    }

    @Test
    public void case28() {
        int k = 50;
        String[] components = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "" };
        int[] income = { 2000, 1900, 1800, 1700, 1600, 1500, 1400, 1300, 1200, 1100, 1000, 900, 800, 700, 600 };
        int[] expense = { 123, 123, 123, 123, 123, 123, 123, 123, 123, 123, 123, 123, 123, 123, 123 };
        assertEquals(5312.184960911477, crazycomponents.expectedProfit(k, components, income, expense), DELTA * 5312.184960911477);
    }

    @Test
    public void case29() {
        int k = 50;
        String[] components = { "1 2 3 4 5 6 7 8 9 10 11 12 13 14", "2 3 4 5 6 7 8 9 10 11 12 13 14", "3 4 5 6 7 8 9 10 11 12 13 14", "4 5 6 7 8 9 10 11 12 13 14", "5 6 7 8 9 10 11 12 13 14", "6 7 8 9 10 11 12 13 14", "7 8 9 10 11 12 13 14", "8 9 10 11 12 13 14", "9 10 11 12 13 14", "10 11 12 13 14", "11 12 13 14", "12 13 14", "13 14", "14", "" };
        int[] income = { 2000, 1900, 1800, 1700, 1600, 1500, 1400, 1300, 1200, 1100, 1000, 900, 800, 700, 600 };
        int[] expense = { 123, 123, 123, 123, 123, 123, 123, 123, 123, 123, 123, 123, 123, 123, 123 };
        assertEquals(5312.184960911477, crazycomponents.expectedProfit(k, components, income, expense), DELTA * 5312.184960911477);
    }

    @Test
    public void case30() {
        int k = 50;
        String[] components = { "1 2 5 13 14", "2 3 4 8 12 13 14", "3 4 5 6 7 8 13 14", "4 5 6 7 8 9 10 14", "5 6 9 10 11 12 13 14", "6 7 8 12 13 14", "7 8 9 10 13 14", "", "9 10 11 12 13 14", "10 11 12 13 14", "11 14", "12 13", "", "14", "" };
        int[] income = { 576119, 289454, 121592, 790183, 403584, 144293, 158792, 549603, 432905, 600, 652274, 918172, 889173, 272519, 241213 };
        int[] expense = { 55138, 244264, 459419, 72460, 553365, 942461, 177804, 164954, 214499, 720479, 382078, 948966, 818032, 345270, 493519 };
        assertEquals(1519653.651185118, crazycomponents.expectedProfit(k, components, income, expense), DELTA * 1519653.651185118);
    }

    @Test
    public void case31() {
        int k = 2;
        String[] components = { "1", "" };
        int[] income = { 10, 0 };
        int[] expense = { 0, 2 };
        assertEquals(1.5, crazycomponents.expectedProfit(k, components, income, expense), DELTA * 1.5);
    }

    @Test
    public void case32() {
        int k = 3;
        String[] components = { "1 2", "", "" };
        int[] income = { 100, 0, 0 };
        int[] expense = { 0, 0, 0 };
        assertEquals(7.407407407407408, crazycomponents.expectedProfit(k, components, income, expense), DELTA * 7.407407407407408);
    }

    @Test
    public void case33() {
        int k = 5;
        String[] components = { "1", "2", "0", "" };
        int[] income = { 4, 5, 6, 7 };
        int[] expense = { 0, 0, 0, 8 };
        assertEquals(0.0, crazycomponents.expectedProfit(k, components, income, expense), DELTA);
    }

    @Test
    public void case34() {
        int k = 10;
        String[] components = { "", "", "", "", "", "", "", "", "", "" };
        int[] income = { 142352, 2342, 34534, 2344, 12346, 7589, 79872, 973453, 96233, 34567 };
        int[] expense = { 12432, 2345, 3678, 456, 345, 457, 56758, 4564, 774, 34567 };
        assertEquals(1269258.9999999998, crazycomponents.expectedProfit(k, components, income, expense), DELTA * 1269258.9999999998);
    }

    @Test
    public void case35() {
        int k = 1;
        String[] components = { "", "" };
        int[] income = { 1, 2 };
        int[] expense = { 0, 0 };
        assertEquals(1.5, crazycomponents.expectedProfit(k, components, income, expense), DELTA * 1.5);
    }

    @Test
    public void case36() {
        int k = 10;
        String[] components = { "", "", "", "", "", "", "", "", "", "" };
        int[] income = { 142352, 2342, 34534, 2344, 12346, 7589, 79872, 973453, 96233, 34567 };
        int[] expense = { 12432, 2345, 3678, 456, 345, 457, 56758, 4564, 774, 34567 };
        assertEquals(1269258.9999999998, crazycomponents.expectedProfit(k, components, income, expense), DELTA * 1269258.9999999998);
    }

    @Test
    public void case37() {
        int k = 49;
        String[] components = { "1 2 5 9", "2 3 4", "", "0", "", "", "", "", "", "8" };
        int[] income = { 8, 10, 1, 2, 3, 12, 23, 21, 4, 0 };
        int[] expense = { 0, 2, 0, 9, 2, 3, 9, 213, 3, 2 };
        assertEquals(127.40000000000039, crazycomponents.expectedProfit(k, components, income, expense), DELTA * 127.40000000000039);
    }

    @Test
    public void case38() {
        int k = 5;
        String[] components = { "3", "", "", "", "1" };
        int[] income = { 4, 0, 3, 2, 7 };
        int[] expense = { 9, 123, 0, 5, 2 };
        assertEquals(2.999999999999999, crazycomponents.expectedProfit(k, components, income, expense), DELTA * 2.999999999999999);
    }

    @Test
    public void case39() {
        int k = 3;
        String[] components = { "1 2", "", "" };
        int[] income = { 100, 0, 0 };
        int[] expense = { 0, 0, 0 };
        assertEquals(7.407407407407408, crazycomponents.expectedProfit(k, components, income, expense), DELTA * 7.407407407407408);
    }

    @Test
    public void case40() {
        int k = 6;
        String[] components = { "1 2 3 4", "4", "1 3 4", "1 4", "", "1 3 4" };
        int[] income = { 20, 25, 12, 7, 10, 11 };
        int[] expense = { 8, 10, 14, 18, 5, 10 };
        assertEquals(10.023469650205762, crazycomponents.expectedProfit(k, components, income, expense), DELTA * 10.023469650205762);
    }

    @Test
    public void case41() {
        int k = 10;
        String[] components = { "", "", "1", "2", "8", "7", "1", "9", "3", "" };
        int[] income = { 0, 0, 0, 9, 1, 1, 1, 1, 2, 3 };
        int[] expense = { 3, 2, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(2.0000000000000004, crazycomponents.expectedProfit(k, components, income, expense), DELTA * 2.0000000000000004);
    }

}
