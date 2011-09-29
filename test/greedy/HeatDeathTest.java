package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class HeatDeathTest {
  HeatDeath heatdeath = new HeatDeath();

  //@Test
  public void case1() {
    int[] energy = { 1, 5, 9 };
    assertEquals(7, heatdeath.maxTime(energy));
  }

  //@Test
  public void case2() {
    int[] energy = { 5, 5, 5, 5 };
    assertEquals(0, heatdeath.maxTime(energy));
  }

  //@Test
  public void case3() {
    int[] energy = { 2, 2, 3, 3, 3, 4, 4, 5, 5 };
    assertEquals(4, heatdeath.maxTime(energy));
  }

  //@Test
  public void case4() {
    int[] energy = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    assertEquals(30, heatdeath.maxTime(energy));
  }

  //@Test
  public void case5() {
    int[] energy = { 5, 7, 9 };
    assertEquals(3, heatdeath.maxTime(energy));
  }

  //@Test
  public void case6() {
    int[] energy = { 5, 6, 5, 6 };
    assertEquals(0, heatdeath.maxTime(energy));
  }

  //@Test
  public void case7() {
    int[] energy = { 1, 1, 1, 1, 1, 999, 999, 999, 999, 999 };
    assertEquals(12435, heatdeath.maxTime(energy));
  }

  //@Test
  public void case8() {
    int[] energy = { 354, 903, 100, 951, 669, 311, 339, 500, 942, 72, 712, 54, 64, 572, 7, 977, 74, 524, 314, 160, 526, 729, 114, 691, 771, 704, 288, 47, 735, 85, 694, 124, 349, 905, 611, 371, 885, 738, 165, 442, 138, 348, 605, 239, 535, 33, 142, 946, 4, 231 };
    assertEquals(214090, heatdeath.maxTime(energy));
  }

  //@Test
  public void case9() {
    int[] energy = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999 };
    assertEquals(306675, heatdeath.maxTime(energy));
  }

  @Test
  public void case10() {
    int[] energy = { 1, 2, 3, 20 };
    assertEquals(26, heatdeath.maxTime(energy));
  }

  //@Test
  public void case11() {
    int[] energy = { 10, 50 };
    assertEquals(20, heatdeath.maxTime(energy));
  }

  //@Test
  public void case12() {
    int[] energy = { 51, 10 };
    assertEquals(20, heatdeath.maxTime(energy));
  }

  //@Test
  public void case13() {
    int[] energy = { 3, 4, 3 };
    assertEquals(0, heatdeath.maxTime(energy));
  }

  //@Test
  public void case14() {
    int[] energy = { 1, 3, 4, 7 };
    assertEquals(7, heatdeath.maxTime(energy));
  }

  //@Test
  public void case15() {
    int[] energy = { 9, 4, 7, 1, 4 };
    assertEquals(14, heatdeath.maxTime(energy));
  }

  //@Test
  public void case16() {
    int[] energy = { 2, 3, 4, 6, 7, 3 };
    assertEquals(9, heatdeath.maxTime(energy));
  }

  //@Test
  public void case17() {
    int[] energy = { 6, 7, 3, 2, 1, 5, 2 };
    assertEquals(15, heatdeath.maxTime(energy));
  }

  //@Test
  public void case18() {
    int[] energy = { 5, 6, 4, 8, 8, 3, 5, 9 };
    assertEquals(16, heatdeath.maxTime(energy));
  }

  //@Test
  public void case19() {
    int[] energy = { 2, 5, 7, 6, 5, 3, 6, 4, 1 };
    assertEquals(15, heatdeath.maxTime(energy));
  }

  //@Test
  public void case20() {
    int[] energy = { 5, 1, 9, 5, 4, 6, 1, 6, 2, 8 };
    assertEquals(33, heatdeath.maxTime(energy));
  }

  //@Test
  public void case21() {
    int[] energy = { 7, 5, 4, 8, 5, 2, 8, 4, 4, 2, 7 };
    assertEquals(23, heatdeath.maxTime(energy));
  }

  //@Test
  public void case22() {
    int[] energy = { 5, 2, 2, 9, 7, 6, 7, 7, 1, 6, 2, 6 };
    assertEquals(36, heatdeath.maxTime(energy));
  }

  //@Test
  public void case23() {
    int[] energy = { 7, 8, 4, 1, 7, 2, 8, 4, 3, 3, 9, 4, 4 };
    assertEquals(38, heatdeath.maxTime(energy));
  }

  //@Test
  public void case24() {
    int[] energy = { 5, 3, 6, 5, 8, 6, 2, 1, 3, 9, 4, 9, 3, 9 };
    assertEquals(47, heatdeath.maxTime(energy));
  }

  //@Test
  public void case25() {
    int[] energy = { 9, 6, 6, 3, 9, 6, 1, 5, 6, 2, 6, 7, 7, 5, 3 };
    assertEquals(36, heatdeath.maxTime(energy));
  }

  //@Test
  public void case26() {
    int[] energy = { 6, 5, 6, 9, 8, 8, 2, 5, 9, 9, 6, 8, 3, 4, 9, 2 };
    assertEquals(46, heatdeath.maxTime(energy));
  }

  //@Test
  public void case27() {
    int[] energy = { 8, 1, 8, 5, 2, 3, 9, 9, 3, 3, 5, 1, 7, 8, 8, 1, 7 };
    assertEquals(71, heatdeath.maxTime(energy));
  }

  //@Test
  public void case28() {
    int[] energy = { 5, 4, 5, 8, 4, 3, 3, 7, 8, 1, 2, 8, 4, 6, 6, 2, 2, 5 };
    assertEquals(40, heatdeath.maxTime(energy));
  }

  //@Test
  public void case29() {
    int[] energy = { 2, 5, 1, 7, 5, 3, 9, 7, 3, 7, 9, 8, 4, 3, 5, 8, 2, 5, 4 };
    assertEquals(54, heatdeath.maxTime(energy));
  }

  //@Test
  public void case30() {
    int[] energy = { 2, 9, 7, 2, 9, 7, 7, 1, 9, 7, 5, 1, 3, 4, 4, 8, 1, 5, 1, 9 };
    assertEquals(88, heatdeath.maxTime(energy));
  }

  //@Test
  public void case31() {
    int[] energy = { 5, 1, 8, 8, 2, 2, 1, 5, 4, 8, 4, 8, 5, 8, 9, 9, 1, 1, 5, 2, 3 };
    assertEquals(83, heatdeath.maxTime(energy));
  }

  //@Test
  public void case32() {
    int[] energy = { 6, 3, 2, 1, 9, 6, 9, 8, 2, 4, 7, 7, 1, 5, 6, 1, 6, 6, 8, 6, 5, 8 };
    assertEquals(69, heatdeath.maxTime(energy));
  }

  //@Test
  public void case33() {
    int[] energy = { 3, 2, 5, 7, 8, 7, 5, 6, 4, 6, 5, 9, 2, 6, 9, 8, 2, 3, 5, 7, 9, 6, 2 };
    assertEquals(58, heatdeath.maxTime(energy));
  }

  //@Test
  public void case34() {
    int[] energy = { 9, 8, 8, 5, 6, 4, 1, 1, 4, 6, 2, 2, 6, 1, 3, 1, 5, 3, 2, 8, 6, 1, 4, 4 };
    assertEquals(73, heatdeath.maxTime(energy));
  }

  //@Test
  public void case35() {
    int[] energy = { 7, 7, 6, 4, 4, 8, 4, 3, 9, 2, 2, 5, 6, 5, 1, 9, 6, 9, 3, 4, 7, 4, 9, 6, 6 };
    assertEquals(63, heatdeath.maxTime(energy));
  }

  //@Test
  public void case36() {
    int[] energy = { 8, 3, 1, 6, 5, 2, 3, 1, 6, 7, 2, 2, 8, 9, 3, 8, 9, 7, 9, 5, 8, 1, 1, 8, 4, 6 };
    assertEquals(103, heatdeath.maxTime(energy));
  }

  //@Test
  public void case37() {
    int[] energy = { 3, 8, 4, 3, 9, 7, 3, 6, 2, 5, 6, 8, 6, 7, 7, 2, 1, 9, 7, 3, 5, 3, 8, 2, 4, 2, 4 };
    assertEquals(76, heatdeath.maxTime(energy));
  }

  //@Test
  public void case38() {
    int[] energy = { 8, 1, 7, 9, 6, 1, 8, 6, 1, 4, 4, 4, 5, 6, 3, 1, 6, 5, 3, 7, 2, 5, 9, 3, 3, 2, 8, 6 };
    assertEquals(83, heatdeath.maxTime(energy));
  }

  //@Test
  public void case39() {
    int[] energy = { 2, 9, 6, 1, 9, 9, 6, 1, 4, 3, 3, 1, 4, 7, 7, 5, 1, 5, 2, 1, 6, 5, 4, 5, 2, 1, 9, 9, 8 };
    assertEquals(112, heatdeath.maxTime(energy));
  }

  //@Test
  public void case40() {
    int[] energy = { 7, 6, 1, 9, 5, 2, 3, 3, 5, 6, 3, 7, 7, 5, 4, 1, 3, 8, 2, 1, 4, 8, 6, 5, 5, 9, 2, 6, 1, 6 };
    assertEquals(83, heatdeath.maxTime(energy));
  }

  //@Test
  public void case41() {
    int[] energy = { 3, 5, 7, 2, 8, 9, 5, 9, 1, 7, 1, 9, 6, 8, 6, 5, 5, 2, 1, 8, 1, 1, 5, 8, 3, 2, 8, 1, 9, 4, 9 };
    assertEquals(132, heatdeath.maxTime(energy));
  }

  //@Test
  public void case42() {
    int[] energy = { 7, 1, 2, 5, 1, 7, 2, 4, 8, 1, 2, 6, 9, 4, 6, 9, 6, 1, 9, 6, 4, 1, 3, 3, 3, 8, 4, 1, 4, 7, 6, 8 };
    assertEquals(110, heatdeath.maxTime(energy));
  }

  //@Test
  public void case43() {
    int[] energy = { 9, 9, 3, 6, 4, 3, 6, 4, 5, 8, 1, 6, 1, 8, 5, 7, 9, 3, 3, 4, 9, 1, 9, 8, 3, 1, 6, 8, 8, 9, 7, 2, 9 };
    assertEquals(123, heatdeath.maxTime(energy));
  }

  //@Test
  public void case44() {
    int[] energy = { 5, 5, 3, 2, 5, 2, 9, 3, 1, 6, 4, 8, 1, 9, 5, 8, 7, 4, 4, 3, 6, 7, 5, 4, 7, 5, 5, 7, 8, 2, 4, 4, 3, 9 };
    assertEquals(87, heatdeath.maxTime(energy));
  }

  //@Test
  public void case45() {
    int[] energy = { 7, 9, 7, 4, 2, 9, 6, 4, 4, 8, 7, 4, 5, 1, 5, 9, 9, 1, 4, 9, 4, 9, 3, 1, 7, 2, 8, 4, 8, 5, 6, 4, 4, 7, 4 };
    assertEquals(105, heatdeath.maxTime(energy));
  }

  //@Test
  public void case46() {
    int[] energy = { 6, 3, 1, 7, 9, 5, 2, 3, 5, 7, 2, 1, 7, 7, 5, 3, 6, 4, 1, 5, 3, 3, 6, 5, 1, 2, 8, 4, 4, 4, 3, 9, 2, 7, 7, 5 };
    assertEquals(89, heatdeath.maxTime(energy));
  }

  //@Test
  public void case47() {
    int[] energy = { 9, 2, 5, 4, 8, 5, 8, 6, 1, 2, 1, 4, 1, 4, 1, 8, 3, 2, 3, 2, 3, 9, 2, 7, 1, 4, 6, 8, 1, 5, 9, 4, 9, 7, 3, 8, 1 };
    assertEquals(139, heatdeath.maxTime(energy));
  }

  //@Test
  public void case48() {
    int[] energy = { 7, 5, 6, 7, 7, 6, 5, 2, 8, 6, 2, 3, 4, 9, 3, 5, 5, 5, 8, 4, 6, 4, 8, 7, 9, 9, 4, 6, 8, 4, 4, 4, 1, 1, 2, 9, 4, 7 };
    assertEquals(93, heatdeath.maxTime(energy));
  }

  //@Test
  public void case49() {
    int[] energy = { 7, 9, 5, 1, 1, 4, 7, 4, 1, 4, 4, 2, 1, 3, 8, 5, 7, 1, 2, 4, 9, 9, 2, 9, 2, 8, 2, 7, 3, 9, 9, 1, 2, 5, 2, 3, 9, 9, 6 };
    assertEquals(165, heatdeath.maxTime(energy));
  }

  //@Test
  public void case50() {
    int[] energy = { 4, 9, 7, 7, 7, 8, 6, 4, 4, 5, 9, 9, 1, 5, 9, 4, 1, 2, 2, 2, 2, 4, 5, 8, 7, 6, 8, 2, 9, 6, 5, 4, 1, 5, 4, 6, 3, 7, 1, 9 };
    assertEquals(130, heatdeath.maxTime(energy));
  }

  //@Test
  public void case51() {
    int[] energy = { 4, 6, 6, 1, 8, 3, 9, 8, 3, 6, 9, 8, 2, 1, 8, 3, 6, 3, 9, 6, 9, 3, 1, 5, 7, 1, 6, 6, 1, 7, 4, 4, 6, 2, 2, 7, 1, 1, 7, 4, 2 };
    assertEquals(143, heatdeath.maxTime(energy));
  }

  //@Test
  public void case52() {
    int[] energy = { 5, 1, 1, 9, 5, 6, 7, 3, 8, 4, 5, 7, 2, 7, 4, 9, 5, 7, 7, 3, 6, 1, 2, 7, 2, 8, 9, 7, 3, 2, 6, 8, 7, 5, 8, 3, 2, 6, 2, 5, 4, 9 };
    assertEquals(125, heatdeath.maxTime(energy));
  }

  //@Test
  public void case53() {
    int[] energy = { 2, 6, 4, 9, 7, 5, 6, 1, 4, 9, 2, 2, 9, 3, 1, 5, 8, 4, 7, 2, 6, 2, 2, 2, 3, 6, 3, 8, 2, 6, 4, 6, 8, 9, 8, 8, 6, 1, 7, 5, 1, 5, 7 };
    assertEquals(140, heatdeath.maxTime(energy));
  }

  //@Test
  public void case54() {
    int[] energy = { 5, 2, 9, 6, 9, 7, 8, 1, 4, 6, 9, 9, 4, 9, 7, 6, 1, 9, 2, 8, 4, 9, 2, 6, 9, 8, 9, 8, 7, 5, 1, 5, 8, 9, 7, 7, 7, 4, 5, 7, 8, 8, 5, 2 };
    assertEquals(139, heatdeath.maxTime(energy));
  }

  //@Test
  public void case55() {
    int[] energy = { 8, 4, 7, 3, 3, 3, 1, 7, 7, 3, 1, 7, 5, 5, 8, 4, 2, 9, 3, 7, 4, 9, 9, 8, 4, 9, 8, 1, 3, 9, 4, 4, 1, 2, 8, 9, 7, 7, 7, 8, 9, 1, 3, 5, 9 };
    assertEquals(163, heatdeath.maxTime(energy));
  }

  //@Test
  public void case56() {
    int[] energy = { 9, 4, 7, 8, 4, 5, 4, 8, 5, 8, 4, 8, 9, 2, 1, 3, 5, 4, 5, 6, 6, 9, 3, 7, 9, 7, 9, 3, 5, 6, 1, 8, 8, 3, 1, 7, 2, 1, 1, 3, 9, 4, 6, 3, 6, 9 };
    assertEquals(150, heatdeath.maxTime(energy));
  }

  //@Test
  public void case57() {
    int[] energy = { 5, 9, 6, 6, 6, 9, 4, 3, 6, 5, 8, 9, 3, 3, 5, 3, 3, 5, 6, 9, 6, 8, 5, 6, 4, 8, 7, 6, 7, 3, 8, 2, 3, 4, 2, 6, 7, 2, 1, 1, 3, 3, 2, 7, 1, 8, 4 };
    assertEquals(128, heatdeath.maxTime(energy));
  }

  //@Test
  public void case58() {
    int[] energy = { 7, 5, 9, 9, 4, 6, 4, 8, 2, 6, 7, 6, 1, 6, 5, 5, 6, 7, 3, 7, 2, 9, 7, 7, 3, 1, 6, 8, 9, 6, 2, 2, 3, 4, 6, 8, 2, 2, 5, 9, 9, 9, 6, 8, 3, 4, 8, 8 };
    assertEquals(138, heatdeath.maxTime(energy));
  }

  //@Test
  public void case59() {
    int[] energy = { 1, 4, 7, 5, 5, 6, 3, 4, 9, 3, 4, 5, 8, 1, 9, 7, 8, 9, 7, 7, 4, 8, 7, 6, 8, 2, 3, 7, 4, 8, 8, 1, 5, 4, 2, 6, 3, 3, 8, 9, 7, 9, 8, 4, 5, 3, 2, 1, 5 };
    assertEquals(144, heatdeath.maxTime(energy));
  }

  //@Test
  public void case60() {
    int[] energy = { 985, 814, 992 };
    assertEquals(177, heatdeath.maxTime(energy));
  }

  //@Test
  public void case61() {
    int[] energy = { 591, 914, 292, 266 };
    assertEquals(1119, heatdeath.maxTime(energy));
  }

  //@Test
  public void case62() {
    int[] energy = { 200, 623, 973, 315, 496 };
    assertEquals(1849, heatdeath.maxTime(energy));
  }

  //@Test
  public void case63() {
    int[] energy = { 806, 893, 258, 895, 684, 539 };
    assertEquals(2176, heatdeath.maxTime(energy));
  }

  //@Test
  public void case64() {
    int[] energy = { 630, 772, 921, 21, 382, 575, 423 };
    assertEquals(3673, heatdeath.maxTime(energy));
  }

  //@Test
  public void case65() {
    int[] energy = { 523, 538, 430, 392, 516, 673, 390, 92 };
    assertEquals(2622, heatdeath.maxTime(energy));
  }

  //@Test
  public void case66() {
    int[] energy = { 520, 967, 480, 91, 301, 51, 999, 621, 13 };
    assertEquals(7941, heatdeath.maxTime(energy));
  }

  //@Test
  public void case67() {
    int[] energy = { 232, 861, 845, 175, 7, 342, 474, 347, 908, 298 };
    assertEquals(8214, heatdeath.maxTime(energy));
  }

  //@Test
  public void case68() {
    int[] energy = { 184, 36, 887, 744, 709, 675, 393, 740, 310, 462, 250 };
    assertEquals(8990, heatdeath.maxTime(energy));
  }

  //@Test
  public void case69() {
    int[] energy = { 660, 584, 490, 244, 275, 203, 881, 37, 542, 216, 540, 687 };
    assertEquals(9577, heatdeath.maxTime(energy));
  }

  //@Test
  public void case70() {
    int[] energy = { 648, 47, 773, 563, 621, 121, 241, 890, 811, 395, 614, 538, 616 };
    assertEquals(11523, heatdeath.maxTime(energy));
  }

  //@Test
  public void case71() {
    int[] energy = { 678, 894, 860, 111, 758, 521, 626, 639, 820, 315, 95, 33, 531, 805 };
    assertEquals(15417, heatdeath.maxTime(energy));
  }

  //@Test
  public void case72() {
    int[] energy = { 280, 813, 494, 672, 344, 651, 443, 889, 822, 390, 705, 652, 85, 148, 949 };
    assertEquals(16501, heatdeath.maxTime(energy));
  }

  //@Test
  public void case73() {
    int[] energy = { 294, 40, 351, 181, 264, 588, 86, 255, 650, 748, 809, 969, 869, 683, 298, 869 };
    assertEquals(21478, heatdeath.maxTime(energy));
  }

  //@Test
  public void case74() {
    int[] energy = { 956, 96, 682, 516, 264, 582, 554, 896, 518, 564, 446, 13, 908, 378, 397, 473, 288 };
    assertEquals(20364, heatdeath.maxTime(energy));
  }

  //@Test
  public void case75() {
    int[] energy = { 930, 966, 86, 625, 91, 787, 22, 569, 667, 683, 113, 349, 350, 457, 264, 272, 511, 665 };
    assertEquals(26007, heatdeath.maxTime(energy));
  }

  //@Test
  public void case76() {
    int[] energy = { 717, 760, 104, 115, 159, 201, 208, 318, 251, 897, 953, 897, 186, 58, 653, 737, 309, 51, 977 };
    assertEquals(33166, heatdeath.maxTime(energy));
  }

  //@Test
  public void case77() {
    int[] energy = { 711, 663, 144, 927, 10, 575, 557, 162, 356, 17, 937, 965, 954, 559, 294, 796, 583, 177, 33, 834 };
    assertEquals(37329, heatdeath.maxTime(energy));
  }

  //@Test
  public void case78() {
    int[] energy = { 90, 13, 973, 459, 473, 531, 125, 880, 835, 87, 568, 436, 785, 111, 14, 210, 233, 523, 444, 702, 170 };
    assertEquals(36505, heatdeath.maxTime(energy));
  }

  //@Test
  public void case79() {
    int[] energy = { 929, 828, 260, 682, 439, 32, 832, 385, 655, 917, 443, 491, 497, 124, 428, 920, 44, 138, 92, 234, 510, 135 };
    assertEquals(40263, heatdeath.maxTime(energy));
  }

  //@Test
  public void case80() {
    int[] energy = { 962, 663, 798, 472, 210, 199, 801, 886, 122, 506, 801, 200, 758, 442, 836, 774, 28, 47, 869, 72, 465, 227, 967 };
    assertEquals(47352, heatdeath.maxTime(energy));
  }

  //@Test
  public void case81() {
    int[] energy = { 377, 946, 756, 473, 197, 398, 844, 301, 858, 346, 285, 102, 596, 785, 115, 25, 729, 423, 781, 177, 632, 836, 64, 720 };
    assertEquals(46672, heatdeath.maxTime(energy));
  }

  //@Test
  public void case82() {
    int[] energy = { 808, 451, 369, 716, 778, 528, 558, 475, 465, 572, 195, 158, 412, 614, 915, 836, 476, 896, 673, 22, 626, 338, 758, 918, 69 };
    assertEquals(44186, heatdeath.maxTime(energy));
  }

  //@Test
  public void case83() {
    int[] energy = { 12, 823, 340, 225, 583, 629, 199, 999, 275, 857, 33, 393, 468, 141, 819, 733, 506, 399, 642, 727, 591, 680, 436, 72, 929, 985 };
    assertEquals(56069, heatdeath.maxTime(energy));
  }

  //@Test
  public void case84() {
    int[] energy = { 118, 597, 451, 932, 913, 789, 486, 746, 566, 32, 750, 743, 429, 144, 887, 398, 151, 599, 589, 104, 768, 303, 8, 958, 554, 985, 782 };
    assertEquals(61093, heatdeath.maxTime(energy));
  }

  //@Test
  public void case85() {
    int[] energy = { 249, 879, 53, 492, 816, 696, 219, 781, 175, 980, 352, 684, 57, 616, 761, 951, 60, 764, 569, 245, 185, 706, 913, 182, 384, 520, 481, 67 };
    assertEquals(66594, heatdeath.maxTime(energy));
  }

  //@Test
  public void case86() {
    int[] energy = { 640, 723, 244, 74, 756, 194, 376, 353, 752, 241, 2, 192, 717, 722, 826, 977, 24, 481, 715, 115, 42, 160, 976, 482, 893, 702, 438, 282, 308 };
    assertEquals(71427, heatdeath.maxTime(energy));
  }

  //@Test
  public void case87() {
    int[] energy = { 420, 422, 319, 367, 555, 345, 861, 754, 677, 17, 224, 167, 98, 641, 144, 691, 720, 179, 812, 288, 384, 980, 183, 993, 824, 546, 763, 111, 813, 868 };
    assertEquals(73734, heatdeath.maxTime(energy));
  }

  //@Test
  public void case88() {
    int[] energy = { 682, 428, 928, 41, 220, 465, 651, 733, 370, 862, 177, 695, 252, 280, 413, 645, 331, 589, 118, 811, 504, 730, 27, 873, 59, 322, 128, 282, 394, 14, 951 };
    assertEquals(77193, heatdeath.maxTime(energy));
  }

  //@Test
  public void case89() {
    int[] energy = { 745, 201, 602, 835, 168, 459, 148, 683, 519, 234, 658, 619, 848, 738, 453, 314, 216, 568, 967, 466, 341, 285, 584, 81, 629, 812, 63, 749, 613, 175, 288, 70 };
    assertEquals(74160, heatdeath.maxTime(energy));
  }

  //@Test
  public void case90() {
    int[] energy = { 962, 186, 328, 725, 970, 632, 260, 515, 799, 319, 826, 789, 857, 134, 745, 347, 377, 931, 410, 812, 644, 593, 798, 942, 351, 127, 647, 85, 238, 7, 315, 227, 521 };
    assertEquals(88123, heatdeath.maxTime(energy));
  }

  //@Test
  public void case91() {
    int[] energy = { 285, 325, 693, 603, 158, 260, 572, 227, 799, 552, 357, 516, 258, 714, 158, 357, 142, 732, 42, 135, 621, 656, 725, 192, 998, 926, 896, 227, 752, 592, 891, 532, 455, 370 };
    assertEquals(85463, heatdeath.maxTime(energy));
  }

  //@Test
  public void case92() {
    int[] energy = { 312, 127, 449, 467, 467, 821, 483, 168, 154, 758, 787, 467, 430, 214, 208, 442, 468, 308, 105, 633, 507, 805, 689, 439, 220, 371, 336, 410, 506, 474, 224, 377, 847, 663, 328 };
    assertEquals(68533, heatdeath.maxTime(energy));
  }

  //@Test
  public void case93() {
    int[] energy = { 545, 868, 43, 386, 48, 705, 630, 986, 960, 69, 722, 306, 444, 675, 520, 372, 515, 828, 39, 924, 930, 513, 776, 105, 781, 297, 696, 206, 732, 722, 813, 699, 244, 626, 106, 557 };
    assertEquals(104206, heatdeath.maxTime(energy));
  }

  //@Test
  public void case94() {
    int[] energy = { 754, 6, 513, 686, 556, 632, 497, 927, 1, 605, 28, 633, 764, 441, 865, 346, 129, 66, 719, 433, 618, 328, 176, 862, 878, 235, 312, 467, 388, 142, 547, 153, 433, 550, 598, 519, 821 };
    assertEquals(100537, heatdeath.maxTime(energy));
  }

  //@Test
  public void case95() {
    int[] energy = { 21, 375, 258, 941, 904, 273, 529, 129, 302, 590, 209, 758, 646, 738, 579, 154, 817, 518, 515, 144, 524, 943, 704, 118, 988, 46, 766, 459, 609, 611, 396, 578, 408, 47, 820, 117, 507, 422 };
    assertEquals(111827, heatdeath.maxTime(energy));
  }

  //@Test
  public void case96() {
    int[] energy = { 918, 509, 819, 281, 335, 817, 409, 987, 794, 625, 691, 216, 609, 828, 784, 699, 71, 373, 787, 485, 997, 330, 758, 783, 244, 210, 428, 933, 361, 108, 482, 147, 929, 74, 357, 469, 310, 93, 46 };
    assertEquals(124328, heatdeath.maxTime(energy));
  }

  //@Test
  public void case97() {
    int[] energy = { 832, 673, 198, 400, 154, 225, 534, 731, 192, 483, 640, 328, 276, 282, 814, 657, 79, 980, 206, 608, 321, 984, 186, 124, 664, 248, 622, 971, 85, 937, 932, 192, 701, 765, 141, 969, 361, 842, 752, 318 };
    assertEquals(133046, heatdeath.maxTime(energy));
  }

  //@Test
  public void case98() {
    int[] energy = { 316, 34, 936, 936, 920, 963, 348, 78, 662, 752, 972, 54, 733, 547, 518, 286, 22, 664, 200, 418, 656, 933, 268, 75, 180, 432, 255, 318, 19, 350, 694, 703, 156, 159, 50, 106, 829, 620, 673, 181, 628 };
    assertEquals(146418, heatdeath.maxTime(energy));
  }

  //@Test
  public void case99() {
    int[] energy = { 409, 876, 383, 569, 290, 628, 982, 634, 865, 957, 392, 747, 883, 881, 421, 364, 949, 551, 810, 709, 313, 370, 462, 151, 58, 27, 359, 394, 643, 742, 47, 974, 243, 551, 911, 978, 727, 102, 221, 69, 480, 276 };
    assertEquals(145892, heatdeath.maxTime(energy));
  }

  //@Test
  public void case100() {
    int[] energy = { 27, 649, 437, 929, 610, 457, 866, 174, 72, 932, 482, 930, 56, 505, 362, 917, 377, 296, 55, 857, 453, 820, 961, 448, 89, 992, 786, 546, 94, 80, 375, 120, 643, 330, 759, 709, 75, 616, 610, 579, 44, 846, 556 };
    assertEquals(158980, heatdeath.maxTime(energy));
  }

  //@Test
  public void case101() {
    int[] energy = { 242, 548, 847, 57, 758, 369, 81, 588, 71, 901, 887, 926, 635, 178, 902, 194, 797, 125, 899, 192, 657, 744, 617, 236, 685, 954, 54, 347, 963, 298, 285, 199, 724, 568, 145, 643, 814, 695, 971, 16, 822, 898, 216, 633 };
    assertEquals(169123, heatdeath.maxTime(energy));
  }

  //@Test
  public void case102() {
    int[] energy = { 854, 196, 893, 113, 378, 854, 768, 149, 123, 264, 648, 414, 754, 4, 386, 82, 937, 591, 4, 295, 431, 527, 860, 566, 69, 737, 941, 714, 846, 482, 146, 438, 819, 93, 920, 30, 207, 680, 725, 82, 931, 64, 557, 212, 768 };
    assertEquals(178985, heatdeath.maxTime(energy));
  }

  //@Test
  public void case103() {
    int[] energy = { 738, 229, 20, 455, 677, 188, 468, 384, 85, 367, 873, 960, 22, 24, 502, 308, 998, 533, 545, 765, 191, 839, 896, 554, 954, 644, 734, 46, 676, 420, 363, 306, 843, 51, 171, 986, 368, 210, 843, 156, 865, 608, 146, 375, 591, 885 };
    assertEquals(181292, heatdeath.maxTime(energy));
  }

  //@Test
  public void case104() {
    int[] energy = { 705, 201, 135, 231, 235, 258, 867, 788, 513, 254, 315, 515, 311, 583, 311, 448, 119, 689, 827, 267, 207, 951, 838, 630, 57, 702, 424, 9, 653, 883, 626, 641, 487, 995, 193, 806, 347, 238, 488, 815, 168, 156, 286, 986, 260, 689, 91 };
    assertEquals(172056, heatdeath.maxTime(energy));
  }

  //@Test
  public void case105() {
    int[] energy = { 427, 198, 259, 920, 591, 567, 390, 191, 455, 519, 449, 461, 635, 787, 230, 321, 920, 422, 531, 622, 518, 10, 327, 594, 758, 524, 839, 111, 148, 325, 645, 556, 412, 986, 891, 232, 632, 816, 891, 263, 638, 932, 617, 287, 608, 718, 75, 998 };
    assertEquals(164778, heatdeath.maxTime(energy));
  }

  //@Test
  public void case106() {
    int[] energy = { 191, 321, 166, 794, 539, 623, 376, 333, 377, 759, 568, 848, 564, 837, 234, 411, 669, 989, 771, 153, 745, 248, 771, 685, 838, 46, 813, 541, 763, 321, 977, 491, 315, 307, 165, 31, 429, 92, 271, 147, 732, 950, 499, 709, 569, 259, 355, 516, 868 };
    assertEquals(179615, heatdeath.maxTime(energy));
  }

}
