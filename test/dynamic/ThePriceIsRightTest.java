package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class ThePriceIsRightTest {
  ThePriceIsRight thepriceisright = new ThePriceIsRight();

  @Test
  public void case1() {
    int[] prices = { 30, 10, 20, 40, 50 };
    assertArrayEquals(new int[] { 4, 1 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case2() {
    int[] prices = { 39, 88, 67, 5, 69, 87, 82, 64, 58, 61 };
    assertArrayEquals(new int[] { 4, 2 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case3() {
    int[] prices = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    assertArrayEquals(new int[] { 10, 1 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case4() {
    int[] prices = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
    assertArrayEquals(new int[] { 1, 10 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case5() {
    int[] prices = { 29, 31, 73, 70, 14, 5, 6, 34, 53, 30, 15, 86 };
    assertArrayEquals(new int[] { 5, 2 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case6() {
    int[] prices = { 100, 99, 1, 2, 3 };
    assertArrayEquals(new int[] { 3, 1 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case7() {
    int[] prices = { 10, 20, 11, 12 };
    assertArrayEquals(new int[] { 3, 1 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case8() {
    int[] prices = { 26597, 343877, 773019, 639695, 822169, 92976, 63947, 335012, 887670, 499927, 175191, 874410, 181985, 64698, 710890, 659379, 21496, 526456, 850172, 528781, 773480, 457447, 229212, 142181, 627959, 916500, 723043, 198821, 352554, 845298, 684531, 972740, 560924, 118077, 589495, 262686, 432525, 414230, 709852, 4919, 9980, 373313, 390732, 477630, 170002 };
    assertArrayEquals(new int[] { 10, 4 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case9() {
    int[] prices = { 742884, 237645, 114856, 145035, 78268, 673216, 763513, 501158, 214612, 331153, 735177, 509732, 853789, 982180, 712549, 92956, 599238, 725329, 848206, 145788, 819234, 300361, 534670, 459639, 485687, 176577, 297237, 795906, 322242, 917107, 788349, 585442, 80794, 779611, 863289, 332610, 532141, 507554, 499179, 436352, 804368 };
    assertArrayEquals(new int[] { 9, 44 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case10() {
    int[] prices = { 882758, 805748, 31612, 928187, 337135, 343821, 886260, 817902, 883689, 100896, 459199, 507098, 142520, 657587, 125599, 197312, 963317, 87565, 487819, 770332, 648263, 671497, 222362, 617367, 879535, 386129, 674427, 795742, 496226, 76255, 341426, 311972, 78951, 132359, 965988, 635747, 895169, 442989, 819252, 386246 };
    assertArrayEquals(new int[] { 10, 15 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case11() {
    int[] prices = { 368500, 896923, 500411, 518039, 491544, 173371 };
    assertArrayEquals(new int[] { 3, 1 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case12() {
    int[] prices = { 313040, 939766, 763170, 642238 };
    assertArrayEquals(new int[] { 2, 3 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case13() {
    int[] prices = { 1000 };
    assertArrayEquals(new int[] { 1, 1 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case14() {
    int[] prices = { 147419, 824824, 120330, 252292, 25183, 308033, 134100, 538473, 641234, 193697, 224440, 958597, 681668, 704960, 981688, 732025, 154657, 77940, 744589, 609339, 30269, 872421, 261918, 273784 };
    assertArrayEquals(new int[] { 10, 2 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case15() {
    int[] prices = { 475587, 846077, 875963, 963451, 406027, 228672, 329019, 704119, 260563, 539968, 742499, 502356, 663057, 577293, 905348, 150395, 372225, 801872, 41914, 182923, 784549, 309244, 159632, 116225, 428786, 355325, 182960, 99791, 690102, 888327, 725440, 126420, 924790, 936200, 790166, 486884, 330556, 629873, 908731 };
    assertArrayEquals(new int[] { 8, 70 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case16() {
    int[] prices = { 422782, 104533, 229634, 963577, 733702, 514313, 849427, 63184, 399347, 920186, 243292, 825364, 628173, 866531, 996517, 42400, 655649, 48740, 164272, 7925, 680687, 592406, 494359, 819135, 452653, 114040, 436043, 603499, 631777, 913949, 327828, 622619, 781165, 363780, 407994, 58471, 865184 };
    assertArrayEquals(new int[] { 8, 37 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case17() {
    int[] prices = { 323973, 170993, 426862, 964550, 630077, 431080, 196056, 495019, 357839, 179292, 740452, 492743, 119216, 338149, 913120, 953961, 360100, 714655, 273141, 437727, 320091, 469751, 359973, 930355, 974177, 402669, 687541, 783699, 732990, 800712, 590652, 103270, 960478, 738760, 604191, 986611, 431362, 877859, 884643, 568013 };
    assertArrayEquals(new int[] { 11, 25 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case18() {
    int[] prices = { 8523, 293845, 912585, 941744, 811919, 156483, 420815, 362970, 570914, 375674, 554229, 208696, 852972, 545107, 373366, 686089, 508199, 931545, 591239, 617434, 678372, 718100, 588597, 296196, 896567, 696543, 111716, 296777, 772038, 676018, 179129, 87846, 201321, 235869, 60594 };
    assertArrayEquals(new int[] { 10, 27 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case19() {
    int[] prices = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    assertArrayEquals(new int[] { 50, 1 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case20() {
    int[] prices = { 2, 1, 4, 3, 6, 5, 8, 7, 10, 9, 12, 11, 14, 13, 16, 15, 18, 17, 20, 19, 22, 21, 24, 23, 26, 25, 28, 27, 30, 29, 32, 31, 34, 33, 36, 35, 38, 37, 40, 39, 42, 41, 44, 43, 46, 45, 48, 47, 50, 49 };
    assertArrayEquals(new int[] { 25, 33554432 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case21() {
    int[] prices = { 3, 2, 1, 6, 5, 4, 9, 8, 7, 12, 11, 10, 15, 14, 13, 18, 17, 16, 21, 20, 19, 24, 23, 22, 27, 26, 25, 30, 29, 28, 33, 32, 31, 36, 35, 34, 39, 38, 37, 42, 41, 40, 45, 44, 43, 48, 47, 46, 50, 49 };
    assertArrayEquals(new int[] { 17, 86093442 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case22() {
    int[] prices = { 48198, 39829, 955696, 449976, 240927, 172213, 127055, 190066, 401694, 807115, 3407, 18972, 521202, 533809, 282627, 342492, 879131, 90286, 71705, 860569, 446467, 16113, 688087, 577196 };
    assertArrayEquals(new int[] { 7, 24 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case23() {
    int[] prices = { 73381, 431697, 665536, 719380, 577997, 403706, 942295, 83106, 171241, 656160, 46250, 833768 };
    assertArrayEquals(new int[] { 5, 4 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case24() {
    int[] prices = { 570789, 412862, 140477, 818162, 385868, 790263 };
    assertArrayEquals(new int[] { 3, 1 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case25() {
    int[] prices = { 424450, 216729, 351437, 412008, 771993, 748560, 423270, 704460, 869725, 19344, 475196, 736735, 828206, 356349, 288486, 731233, 930269, 581290, 161806, 874460, 88471, 57331, 599482, 484561, 739798, 15323, 175989, 807520, 178265, 867197, 173490, 73, 432493, 891196, 148834, 112198, 58052, 756610, 802231, 43238, 633287, 844972, 391896 };
    assertArrayEquals(new int[] { 11, 2 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case26() {
    int[] prices = { 424450, 216729, 351437, 412008, 771993, 748560, 423270, 704460, 869725, 19344, 475196, 736735, 828206, 356349, 288486, 731233, 930269, 581290, 161806, 874460, 88471, 57331, 599482, 484561, 739798, 15323, 175989, 807520, 178265, 867197, 173490, 73, 432493, 891196, 148834, 112198, 58052, 756610, 802231, 43238, 633287, 844972, 391896 };
    assertArrayEquals(new int[] { 11, 2 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case27() {
    int[] prices = { 322558, 220146, 467283, 63263, 602258, 401527, 878088, 983471, 132670, 802560, 857021, 843591, 802676, 811039, 471429, 5664, 174512, 8185, 892164, 87269, 912227, 950224, 737652, 853481, 290191, 269214 };
    assertArrayEquals(new int[] { 9, 2 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case28() {
    int[] prices = { 425474, 546931, 589124, 917723, 11230, 674787, 898675, 863054, 587480, 217318, 574206 };
    assertArrayEquals(new int[] { 5, 2 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case29() {
    int[] prices = { 91849, 784082, 203856, 543009, 720342, 286358, 728568, 247087, 867674, 347582, 185985, 280624, 96577, 948700, 520024, 687373, 277112, 131354, 501925, 334962, 698136, 500744, 797863, 523340, 520470, 345215, 613674, 625194, 414926, 421073, 149039, 918631, 608254, 838792, 301458, 113268, 846191, 30781, 674606, 67921, 975189, 481001, 966187, 851420, 943006 };
    assertArrayEquals(new int[] { 13, 6 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case30() {
    int[] prices = { 237140, 607629, 23266, 367460, 397060, 651593, 980184, 242769, 479974, 845784, 707077, 750388, 930100, 583755, 595871, 901916, 168983, 643066, 524738, 835492, 173405, 760178, 887105, 556600, 657736, 27075, 527662, 840400, 724883, 112697, 799637, 308923, 526771, 871837, 212484, 959160, 558272, 119975 };
    assertArrayEquals(new int[] { 12, 2 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case31() {
    int[] prices = { 837021, 697792, 224591, 408394, 127336, 3201, 691819, 70007, 661526, 573558, 111885, 523192, 732231, 495106, 667566, 706337 };
    assertArrayEquals(new int[] { 6, 2 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case32() {
    int[] prices = { 4249, 907014, 761312, 662773, 520744, 635575, 672823, 266155 };
    assertArrayEquals(new int[] { 4, 1 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case33() {
    int[] prices = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 1000000, 35, 36, 37, 38, 39, 40, 35434, 35321, 7575, 4545, 25677, 70999, 3422, 11111, 22222 };
    assertArrayEquals(new int[] { 42, 5 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case34() {
    int[] prices = { 39, 88, 67, 5, 69, 87, 82, 64, 58, 61 };
    assertArrayEquals(new int[] { 4, 2 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case35() {
    int[] prices = { 100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90, 89, 88, 87, 86, 85, 84, 83, 82, 81, 80, 79, 78, 76, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
    assertArrayEquals(new int[] { 25, 1 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case36() {
    int[] prices = { 1, 45, 2, 44, 3, 43, 4, 42, 5, 41, 6, 40, 7, 39, 8, 38, 9, 37, 10, 36, 11, 35, 12, 34, 13, 33, 14, 32, 100, 200, 300, 400, 500, 600, 700, 900, 10000, 2000, 601, 602 };
    assertArrayEquals(new int[] { 24, 2 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case37() {
    int[] prices = { 1000000, 999999, 999998, 999997, 999996, 999995, 999994, 999993, 999992, 999991, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
    assertArrayEquals(new int[] { 1, 50 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case38() {
    int[] prices = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49 };
    assertArrayEquals(new int[] { 49, 1 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case39() {
    int[] prices = { 29, 31, 73, 70, 14, 5, 6, 34, 53, 30, 15, 86 };
    assertArrayEquals(new int[] { 5, 2 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case40() {
    int[] prices = { 1, 2 };
    assertArrayEquals(new int[] { 2, 1 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case41() {
    int[] prices = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    assertArrayEquals(new int[] { 50, 1 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case42() {
    int[] prices = { 2, 1, 4, 3, 6, 5, 8, 7, 10, 9, 12, 11, 14, 13, 16, 15, 18, 17, 20, 19, 22, 21, 24, 23, 26, 25, 28, 27, 30, 29, 32, 31, 34, 33, 36, 35, 38, 37, 40, 39, 42, 41, 44, 43, 46, 45, 48, 47, 50, 49 };
    assertArrayEquals(new int[] { 25, 33554432 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case43() {
    int[] prices = { 100, 98, 96, 97, 94, 93, 92, 91, 90, 89, 88, 87, 86, 85, 84, 80, 81, 79, 76, 75, 74, 73, 72, 71, 70, 69, 68, 67, 66, 65, 64, 63, 62, 61, 60, 59, 58, 57, 56, 55, 54, 53, 52, 51, 50, 49, 48, 47 };
    assertArrayEquals(new int[] { 2, 2 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case44() {
    int[] prices = { 3, 2, 1, 6, 5, 4, 9, 8, 7, 12, 11, 10, 15, 14, 13, 18, 17, 16, 21, 20, 19, 24, 23, 22, 27, 26, 25, 30, 29, 28, 33, 32, 31, 36, 35, 34, 39, 38, 37, 42, 41, 40, 45, 44, 43, 48, 47, 46, 50, 49 };
    assertArrayEquals(new int[] { 17, 86093442 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case45() {
    int[] prices = { 2, 1, 4, 3, 5 };
    assertArrayEquals(new int[] { 3, 4 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case46() {
    int[] prices = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50 };
    assertArrayEquals(new int[] { 26, 25 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case47() {
    int[] prices = { 1, 2, 3, 50, 4, 5, 6, 7, 89, 8, 9, 10, 11, 12, 13, 15, 500, 501, 535, 75, 76, 802, 803, 804, 805, 806, 807, 808, 809, 8010, 212, 213, 214, 208, 205, 206, 235, 10024, 1025, 1026, 1027, 1035, 1034, 1033, 1032, 1031, 1030, 900 };
    assertArrayEquals(new int[] { 29, 6 }, thepriceisright.howManyReveals(prices));
  }

  @Test
  public void case48() {
    int[] prices = { 1, 10, 9, 8, 7, 6, 20, 19, 18, 17, 16, 30, 29, 28, 27, 26, 40, 39, 38, 37, 36, 50, 49, 48, 47, 46, 60, 100, 99, 98, 97, 96, 120, 119, 118, 117, 300 };
    assertArrayEquals(new int[] { 10, 62500 }, thepriceisright.howManyReveals(prices));
  }

}
