package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class SetMetricTest {
  SetMetric setmetric = new SetMetric();

  @Test
  public void case1() {
    int[] target = { 4, 9, 2, 1 };
    int[] candidate = { 9, 1, 2, 3, 5, 6 };
    assertEquals(1, setmetric.nearness(target, candidate));
  }

  @Test
  public void case2() {
    int[] target = { 0 };
    int[] candidate = { 1000, -1000, 0 };
    assertEquals(0, setmetric.nearness(target, candidate));
  }

  @Test
  public void case3() {
    int[] target = { 1000, -1000, 0, 5, 289, -40 };
    int[] candidate = { 30, 821, -777, -52, 91, 444, -134, 85 };
    assertEquals(679, setmetric.nearness(target, candidate));
  }

  @Test
  public void case4() {
    int[] target = { 572, 555 };
    int[] candidate = { 877, 173, -394 };
    assertEquals(687, setmetric.nearness(target, candidate));
  }

  @Test
  public void case5() {
    int[] target = { 291 };
    int[] candidate = { -619, -303, 860 };
    assertEquals(569, setmetric.nearness(target, candidate));
  }

  @Test
  public void case6() {
    int[] target = { 436, -857, 757, 437 };
    int[] candidate = { 149, -981, -140, -476, -286 };
    assertEquals(2031, setmetric.nearness(target, candidate));
  }

  @Test
  public void case7() {
    int[] target = { -909, 462, 176, -974, -486, 867 };
    int[] candidate = { -639, 102, -982, -255, -150, -383 };
    assertEquals(2189, setmetric.nearness(target, candidate));
  }

  @Test
  public void case8() {
    int[] target = { 911 };
    int[] candidate = { 726, 521, 425, -806, 599, 985, -324, -71 };
    assertEquals(74, setmetric.nearness(target, candidate));
  }

  @Test
  public void case9() {
    int[] target = { 96, -53, 371, -855, 910, 310 };
    int[] candidate = { -594, -465, -28, -193, 195, 370 };
    assertEquals(2016, setmetric.nearness(target, candidate));
  }

  @Test
  public void case10() {
    int[] target = { -90, -700, 918, 391, -586 };
    int[] candidate = { -819, 205, -309, 254, -545, -12, -998, 285 };
    assertEquals(1008, setmetric.nearness(target, candidate));
  }

  @Test
  public void case11() {
    int[] target = { -675 };
    int[] candidate = { 327 };
    assertEquals(1002, setmetric.nearness(target, candidate));
  }

  @Test
  public void case12() {
    int[] target = { -883 };
    int[] candidate = { 810, 852, -147, -238 };
    assertEquals(645, setmetric.nearness(target, candidate));
  }

  @Test
  public void case13() {
    int[] target = { -968, 471, 525, -334, -188 };
    int[] candidate = { -315, -476, -471, 144, -554, -47 };
    assertEquals(1577, setmetric.nearness(target, candidate));
  }

  @Test
  public void case14() {
    int[] target = { -744 };
    int[] candidate = { -601 };
    assertEquals(143, setmetric.nearness(target, candidate));
  }

  @Test
  public void case15() {
    int[] target = { 777, -352 };
    int[] candidate = { 812, 796, -115 };
    assertEquals(256, setmetric.nearness(target, candidate));
  }

  @Test
  public void case16() {
    int[] target = { -31, 83, 420, -248, 896, -38, -976 };
    int[] candidate = { 436, -774, 970, 588, 100, 555, 616, -685, 649, -633 };
    assertEquals(1906, setmetric.nearness(target, candidate));
  }

  @Test
  public void case17() {
    int[] target = { 620 };
    int[] candidate = { -349, 748, -651, -55, -152 };
    assertEquals(128, setmetric.nearness(target, candidate));
  }

  @Test
  public void case18() {
    int[] target = { -274 };
    int[] candidate = { -758 };
    assertEquals(484, setmetric.nearness(target, candidate));
  }

  @Test
  public void case19() {
    int[] target = { 704, 36, -646 };
    int[] candidate = { -677, 372, -989, 609 };
    assertEquals(462, setmetric.nearness(target, candidate));
  }

  @Test
  public void case20() {
    int[] target = { 878, 20, 214, 98, 226, -653, 958, 581, 312, 338 };
    int[] candidate = { 962, -14, 827, -281, 913, -119, -712, -341, -951, 789 };
    assertEquals(3371, setmetric.nearness(target, candidate));
  }

  @Test
  public void case21() {
    int[] target = { -11 };
    int[] candidate = { -33, -338, -833, 24 };
    assertEquals(22, setmetric.nearness(target, candidate));
  }

  @Test
  public void case22() {
    int[] target = { -198 };
    int[] candidate = { -539 };
    assertEquals(341, setmetric.nearness(target, candidate));
  }

  @Test
  public void case23() {
    int[] target = { 895 };
    int[] candidate = { 321 };
    assertEquals(574, setmetric.nearness(target, candidate));
  }

  @Test
  public void case24() {
    int[] target = { -427, -942, 962, 441, -420, 792 };
    int[] candidate = { 909, 17, 836, 39, -652, 845 };
    assertEquals(1694, setmetric.nearness(target, candidate));
  }

  @Test
  public void case25() {
    int[] target = { -95 };
    int[] candidate = { 835 };
    assertEquals(930, setmetric.nearness(target, candidate));
  }

  @Test
  public void case26() {
    int[] target = { 818 };
    int[] candidate = { -937, -340, -556, 677, 968 };
    assertEquals(141, setmetric.nearness(target, candidate));
  }

  @Test
  public void case27() {
    int[] target = { 5, 4, 7, 2, 8, 2, 9, 3, 4, 4 };
    int[] candidate = { 1, 5, 6, 8, 2, 4, 6, 9, 0, 0 };
    assertEquals(11, setmetric.nearness(target, candidate));
  }

  @Test
  public void case28() {
    int[] target = { 506, 180, 978, -135, 343 };
    int[] candidate = { -182, -412, -987, 819, -827, -484, 460, -580, 531, -564, 761, 570, 38, 351, 664, 773, 854, -132 };
    assertEquals(302, setmetric.nearness(target, candidate));
  }

  @Test
  public void case29() {
    int[] target = { -279, 530, -281, 408, -762, -372, 382, -832, 498, 26, 267 };
    int[] candidate = { 209, -14, -678, -427, -189, -884, -335, 671, -549, 840, -23, 157, 628, -834, 819, 828, -576, -500 };
    assertEquals(1290, setmetric.nearness(target, candidate));
  }

  @Test
  public void case30() {
    int[] target = { -471, -835, 614, 720, 347, 141, 465, -501, -706, 566, -113, -266, 464, -338, -943, 234 };
    int[] candidate = { -655, -699, -49, 295, -688, 115, -83, -21, 88, 839, 842, 28, 513, -305, 99, 417, 18, -837, 282 };
    assertEquals(1987, setmetric.nearness(target, candidate));
  }

  @Test
  public void case31() {
    int[] target = { -167, -760, -702, 828, -317, 183, 517, -746, -948, -320, -757, 15, -101, -994, 139 };
    int[] candidate = { -618, 356, -721, -836, 128, 429, 469, 453, 688, -709, 635, 236, 254, -342, 221 };
    assertEquals(5053, setmetric.nearness(target, candidate));
  }

  @Test
  public void case32() {
    int[] target = { -698, -970, -400, -745, 695, 992, 501, 354 };
    int[] candidate = { 940, 224, 52, -975, -281, -964, 881, 469, 786, 509, 850, 39, 725, -924, -243 };
    assertEquals(774, setmetric.nearness(target, candidate));
  }

  @Test
  public void case33() {
    int[] target = { 127, -723, -61, 987, 91, 218, 518, -200, -348, -850, 365, 3, 820, -244, 412, 681 };
    int[] candidate = { -564, 922, -208, -774, 308, -553, -713, 601, 735, 554, 546, 359, -626, -77, -859, 490 };
    assertEquals(2889, setmetric.nearness(target, candidate));
  }

  @Test
  public void case34() {
    int[] target = { 787, 522, -680, -964, -831, -167, -892 };
    int[] candidate = { -870, 626, -951, 767, 629, -281, 629, 151, 799, 157, -763, -59, 343, -68, -633, -805 };
    assertEquals(323, setmetric.nearness(target, candidate));
  }

  @Test
  public void case35() {
    int[] target = { 813, 272, 849, 551, 59, 281, -101, 207, -578, -328, -554, -115, -122, 796, -329, -537 };
    int[] candidate = { -89, 305, -583, -635, -585, -896, 176, -228, 718, 250, -927, -272, 138, 675, 403, -598, -868, 866 };
    assertEquals(1755, setmetric.nearness(target, candidate));
  }

  @Test
  public void case36() {
    int[] target = { 39, -208, 575, 82, -267, 233, -360, 51, -951, 436, 674, 593, 784, -478, 994, 889, 245, 469 };
    int[] candidate = { -461, 53, -113, -375, 391, -495, -616, -309, -317, -854, 657, -75, 719, -92, -190, 894, -482, -18, 744 };
    assertEquals(4317, setmetric.nearness(target, candidate));
  }

  @Test
  public void case37() {
    int[] target = { 633, 270, -492, -865, -133, -39, -131, -48, 433, -314, -67, 309, 654 };
    int[] candidate = { -184, -112, -930, 369, -604, -835, -108, -47, 248, -111, -246, -205, -53, 826, 256, 878 };
    assertEquals(861, setmetric.nearness(target, candidate));
  }

  @Test
  public void case38() {
    int[] target = { -735, 198, -66, -824, 964, -396, 303, -601, 231, -613, 954, -761 };
    int[] candidate = { 299, 419, 537, 171, -842, 980, -794, -385, -135, 537, 17, -635, -999, 704, 759, -896, -128 };
    assertEquals(1127, setmetric.nearness(target, candidate));
  }

  @Test
  public void case39() {
    int[] target = { -115, 728, -557, 64, 727, -690, -567, 229, 519, -738, -459 };
    int[] candidate = { -285, -748, -345, 853, -356, -716, -265, -671, 4, 828, -728, -724, -444, 117, 464 };
    assertEquals(925, setmetric.nearness(target, candidate));
  }

  @Test
  public void case40() {
    int[] target = { -170, 185, 331, 905, -733, -437, 217, 998, 497, -618, -373, -814, 227, 589 };
    int[] candidate = { 738, 365, -490, -697, 79, -604, 578, -824, -993, -943, 49, 691, 798, 660, 564 };
    assertEquals(2272, setmetric.nearness(target, candidate));
  }

  @Test
  public void case41() {
    int[] target = { -917, 492, -535, 253, 797, -209, 168, -946, 531 };
    int[] candidate = { -692, -228, 945, -372, 860, -983, -976, 830, 283, -101, -692, 323, -680, -86, -10 };
    assertEquals(999, setmetric.nearness(target, candidate));
  }

  @Test
  public void case42() {
    int[] target = { 183, -925, 566, -228, 803, -911, -234, -719, 616 };
    int[] candidate = { 829, -180, 477, -180, -812, -398, 393, 276, 966, -501, -665, 236, -705, -151, -868, -726, -206 };
    assertEquals(630, setmetric.nearness(target, candidate));
  }

  @Test
  public void case43() {
    int[] target = { -310, -93, 341, -648, 361, -997, -329, -53 };
    int[] candidate = { 96, 778, 47, 889, -115, -770, 132, -999, -829, -915, 445, -163, 219, 928, -790 };
    assertEquals(980, setmetric.nearness(target, candidate));
  }

  @Test
  public void case44() {
    int[] target = { 449, 772, -43, 383, 301, 287, -490, -677, -183, -289 };
    int[] candidate = { -171, -34, 498, -235, -568, 709, -342, 535, 819, 45, 804, -390, -688, -732, -531, -736, -505, -728, -933 };
    assertEquals(983, setmetric.nearness(target, candidate));
  }

  @Test
  public void case45() {
    int[] target = { -425, -961, -153, 564, -247, -931, -839, 385, 964, 485, 942, 968, -67, -924 };
    int[] candidate = { 761, 199, -134, 506, -683, 192, 111, 292, 194, -246, -943, 841, -606, 437, 781 };
    assertEquals(3122, setmetric.nearness(target, candidate));
  }

  @Test
  public void case46() {
    int[] target = { -730, -868, -402, 379, -28, -832, -551, 308, -363, -986, -731, 700, -144, -770, 527 };
    int[] candidate = { -618, 933, 983, -667, 30, 457, 963, -346, -39, -438, 637, 988, -367, -449, -600, 515, 885, 498, 854, -721 };
    assertEquals(3237, setmetric.nearness(target, candidate));
  }

  @Test
  public void case47() {
    int[] target = { -867, -46, 843, -490, -34, 347, -394, 328, 994, -24, -194, 403, -238, 715, 722, -500 };
    int[] candidate = { -257, 889, -267, 501, 796, 923, -516, -485, 507, 155, 432, 48, -968, 352, 788, -380, 250, -3, 959, -271 };
    assertEquals(872, setmetric.nearness(target, candidate));
  }

  @Test
  public void case48() {
    int[] target = { -412, 253, -989, -633, -577, -995, -298, 761, -597, 460, 176, 322, 611 };
    int[] candidate = { 461, -888, 396, 14, 93, -447, -617, -710, -143, -624, 549, 466, 764, -523, 948, -433, 74, -884, 602, 23 };
    assertEquals(814, setmetric.nearness(target, candidate));
  }

  @Test
  public void case49() {
    int[] target = { 336, -782, -326, -477, -702, 198, -652, -391, 524, 335, -778, 501 };
    int[] candidate = { 763, -500, 539, -432, -859, 196, -875, 217, 257, -986, 522, 289, 813, 731, -869, 528, 986, -521, 954, 326 };
    assertEquals(1017, setmetric.nearness(target, candidate));
  }

  @Test
  public void case50() {
    int[] target = { 215, -668, -202, 956, 402, 954, -769, -642, 37, -677, 69, 751, 949, 852, 848, -687, -339, -832 };
    int[] candidate = { 622, -290, -914, -94, -589, -80, -254, -384, -29, -475, -635, 869, 264, -874, 891, -463, -265, 181, -264, 165 };
    assertEquals(4304, setmetric.nearness(target, candidate));
  }

  @Test
  public void case51() {
    int[] target = { 1000, -1000, 0, 5, 289, -40 };
    int[] candidate = { 30, 821, -777, -52, 91, 444, -134, 85 };
    assertEquals(679, setmetric.nearness(target, candidate));
  }

  @Test
  public void case52() {
    int[] target = { -1000, -1000, -999, -666, -1, 0, 1, -999, -666, 666, 555, 555, -1000, -999, 999, 200, -1000 };
    int[] candidate = { 99, -10, -1000, -999, -10, -1, 0, 1, -999, -666, 666, 555, 175, -1000, -999, 999, 200, -99, 0, -10 };
    assertEquals(2927, setmetric.nearness(target, candidate));
  }

  @Test
  public void case53() {
    int[] target = { 153, 158, 160, 152, 161, 166, 160, 924, -1000, 900, 915, -1000, 736 };
    int[] candidate = { -1000, 976, -325, 160, 1000, 42, 150, 153, 416, 159, -715, 924, 163, 321, 157, 895, 911, 999 };
    assertEquals(642, setmetric.nearness(target, candidate));
  }

  @Test
  public void case54() {
    int[] target = { 1, 5, 6, 8, 17, 35, 21, 49, 654, 999 };
    int[] candidate = { 1000, -1000, 53, 68, 942, 15, 24, 1, 3, 6, 5, 7, 954, 641, 233, 658, 951, 258, 147, 236 };
    assertEquals(41, setmetric.nearness(target, candidate));
  }

  @Test
  public void case55() {
    int[] target = { 1000, -1000, 0, 5, 289, -40, 3, 999, -30 };
    int[] candidate = { 30, 821, -777, -52, 91, 444, -134, 85, 293, 273, -20, 0, 39, 333, 28, 993, 23, -30, -2, 221 };
    assertEquals(447, setmetric.nearness(target, candidate));
  }

  @Test
  public void case56() {
    int[] target = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200 };
    int[] candidate = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 156, 17, 18, 19, 20 };
    assertEquals(1750, setmetric.nearness(target, candidate));
  }

  @Test
  public void case57() {
    int[] target = { 4, 4, 2, 1 };
    int[] candidate = { 6, 1, 2, 3, 6, 6 };
    assertEquals(3, setmetric.nearness(target, candidate));
  }

  @Test
  public void case58() {
    int[] target = { 1000, -1000, 3, 4, 4, 4, 4, 4, 4, 444, 55, 555, 5, 5, 5, 5, 5, 5, 5, 5 };
    int[] candidate = { 30, 821, -777, -52, 91, 444, -134, 85, 123, 3, 3, 3, 5, 5, 6, 7, 8, 89, 9, 0 };
    assertEquals(1270, setmetric.nearness(target, candidate));
  }

  @Test
  public void case59() {
    int[] target = { 1000, -1000, 0, 5, 289, -40, 827, 999, -39, -2 };
    int[] candidate = { 30, 821, -777, -52, 91, 444, -134, 85, 332, 0, -20, -300, 292, 878, -392, 30, 222, 203, 921, -652 };
    assertEquals(520, setmetric.nearness(target, candidate));
  }

  @Test
  public void case60() {
    int[] target = { -999, -900, -888, -777, -666, -555, -444, -333, -222, -111, 111, 222, 333, 444 };
    int[] candidate = { -500, -400, -300, 0, 1, 2, 3, 4, 5, 6, 7, 8, 8, 100, 300, 400, 500, 600, 700, 800 };
    assertEquals(4928, setmetric.nearness(target, candidate));
  }

  @Test
  public void case61() {
    int[] target = { -1000 };
    int[] candidate = { 1000 };
    assertEquals(2000, setmetric.nearness(target, candidate));
  }

  @Test
  public void case62() {
    int[] target = { 100, 100, 100, 100 };
    int[] candidate = { 100, 1, 1, 20 };
    assertEquals(278, setmetric.nearness(target, candidate));
  }

  @Test
  public void case63() {
    int[] target = { 10, 10 };
    int[] candidate = { 10, 20 };
    assertEquals(10, setmetric.nearness(target, candidate));
  }

  @Test
  public void case64() {
    int[] target = { 1000, -1000, 0, 5, 289, -40, 1, 999 };
    int[] candidate = { 30, 821, -777, -52, 91, 444, -134, 85, -1, -99, -1, -1, -2 };
    assertEquals(1176, setmetric.nearness(target, candidate));
  }

  @Test
  public void case65() {
    int[] target = { 1000, -1000, 0, 5, 289, -40, 999, 1000 };
    int[] candidate = { 30, 821, -777, -52, 91, 444, -134, 85, 85, -444, 85 };
    assertEquals(2192, setmetric.nearness(target, candidate));
  }

  @Test
  public void case66() {
    int[] target = { 5, 5, 5 };
    int[] candidate = { 1, 2, 3, 1000, 1000, 1000 };
    assertEquals(9, setmetric.nearness(target, candidate));
  }

  @Test
  public void case67() {
    int[] target = { 1000, 900, 800, 700, 600, 500, 400, 300, 200, 100, 0, -100, -200, -300, -400, -500, -600, -700, -800, -900 };
    int[] candidate = { 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
    assertEquals(9900, setmetric.nearness(target, candidate));
  }

  @Test
  public void case68() {
    int[] target = { 0, 100 };
    int[] candidate = { -111, 1 };
    assertEquals(210, setmetric.nearness(target, candidate));
  }

  @Test
  public void case69() {
    int[] target = { 0, 1, 2, 3, 19, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18 };
    int[] candidate = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 50, 80, 17, 10, 80 };
    assertEquals(162, setmetric.nearness(target, candidate));
  }

  @Test
  public void case70() {
    int[] target = { 1, 4 };
    int[] candidate = { 8, -1, 2 };
    assertEquals(4, setmetric.nearness(target, candidate));
  }

  @Test
  public void case71() {
    int[] target = { 4, 10 };
    int[] candidate = { 1, 5 };
    assertEquals(8, setmetric.nearness(target, candidate));
  }

  @Test
  public void case72() {
    int[] target = { 4, 2 };
    int[] candidate = { 3, -6 };
    assertEquals(9, setmetric.nearness(target, candidate));
  }

  @Test
  public void case73() {
    int[] target = { 200, 999 };
    int[] candidate = { 600, -500 };
    assertEquals(1099, setmetric.nearness(target, candidate));
  }

  @Test
  public void case74() {
    int[] target = { 15, 25 };
    int[] candidate = { 9, 20, 32 };
    assertEquals(11, setmetric.nearness(target, candidate));
  }

  @Test
  public void case75() {
    int[] target = { 2, 5 };
    int[] candidate = { -2, -1, 4 };
    assertEquals(4, setmetric.nearness(target, candidate));
  }

  @Test
  public void case76() {
    int[] target = { -1000, 0, 1000 };
    int[] candidate = { -1000, -10, 1 };
    assertEquals(1009, setmetric.nearness(target, candidate));
  }

  @Test
  public void case77() {
    int[] target = { 10, 20 };
    int[] candidate = { 11, 0 };
    assertEquals(19, setmetric.nearness(target, candidate));
  }

  @Test
  public void case78() {
    int[] target = { 0, 11, 21 };
    int[] candidate = { 10, 20, 100 };
    assertEquals(98, setmetric.nearness(target, candidate));
  }

  @Test
  public void case79() {
    int[] target = { 4, 2 };
    int[] candidate = { 3, -6 };
    assertEquals(9, setmetric.nearness(target, candidate));
  }

  @Test
  public void case80() {
    int[] target = { 200, 999 };
    int[] candidate = { 600, -500 };
    assertEquals(1099, setmetric.nearness(target, candidate));
  }

  @Test
  public void case81() {
    int[] target = { 15, 25 };
    int[] candidate = { 9, 20, 32 };
    assertEquals(11, setmetric.nearness(target, candidate));
  }

  @Test
  public void case82() {
    int[] target = { 2, 5 };
    int[] candidate = { -2, -1, 4 };
    assertEquals(4, setmetric.nearness(target, candidate));
  }

  @Test
  public void case83() {
    int[] target = { -1000, 0, 1000 };
    int[] candidate = { -1000, -10, 1 };
    assertEquals(1009, setmetric.nearness(target, candidate));
  }

  @Test
  public void case84() {
    int[] target = { 10, 20 };
    int[] candidate = { 11, 0 };
    assertEquals(19, setmetric.nearness(target, candidate));
  }

  @Test
  public void case85() {
    int[] target = { 0, 11, 21 };
    int[] candidate = { 10, 20, 100 };
    assertEquals(98, setmetric.nearness(target, candidate));
  }

}
