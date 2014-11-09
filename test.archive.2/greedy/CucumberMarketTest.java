package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class CucumberMarketTest {
  CucumberMarket cucumbermarket = new CucumberMarket();

  @Test
  public void case1() {
    int[] price = { 1000, 1, 10, 100 };
    int budget = 1110;
    int k = 3;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case2() {
    int[] price = { 1000, 1, 10, 100 };
    int budget = 1109;
    int k = 3;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case3() {
    int[] price = { 33, 4 };
    int budget = 33;
    int k = 1;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case4() {
    int[] price = { 1, 1, 1, 1, 1, 1 };
    int budget = 2;
    int k = 4;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case5() {
    int[] price = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
    int budget = 10000;
    int k = 9;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case6() {
    int[] price = { 744, 263, 530 };
    int budget = 9701;
    int k = 1;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case7() {
    int[] price = { 257, 257, 120, 712, 352, 844, 706, 109 };
    int budget = 6394;
    int k = 3;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case8() {
    int[] price = { 170, 933, 918, 848 };
    int budget = 7973;
    int k = 1;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case9() {
    int[] price = { 224, 550 };
    int budget = 7593;
    int k = 1;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case10() {
    int[] price = { 552, 428 };
    int budget = 6191;
    int k = 1;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case11() {
    int[] price = { 921, 945, 311, 863 };
    int budget = 8485;
    int k = 4;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case12() {
    int[] price = { 711, 237, 877, 432, 930, 398, 676 };
    int budget = 492;
    int k = 3;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case13() {
    int[] price = { 135 };
    int budget = 8426;
    int k = 1;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case14() {
    int[] price = { 728, 127, 744, 335 };
    int budget = 4105;
    int k = 1;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case15() {
    int[] price = { 621, 257, 933, 573, 614, 491 };
    int budget = 4510;
    int k = 6;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case16() {
    int[] price = { 696, 50, 328, 720 };
    int budget = 1797;
    int k = 1;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case17() {
    int[] price = { 650, 357, 185, 94 };
    int budget = 1306;
    int k = 4;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case18() {
    int[] price = { 510, 755, 353 };
    int budget = 1606;
    int k = 3;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case19() {
    int[] price = { 802, 691, 331, 338 };
    int budget = 2202;
    int k = 1;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case20() {
    int[] price = { 12, 428, 43, 107, 969, 213, 2, 511, 481 };
    int budget = 2776;
    int k = 4;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case21() {
    int[] price = { 815, 848, 565, 198, 626, 439, 932 };
    int budget = 4390;
    int k = 7;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case22() {
    int[] price = { 188, 914, 180, 996 };
    int budget = 2294;
    int k = 3;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case23() {
    int[] price = { 563, 135, 274, 548, 522, 831 };
    int budget = 2917;
    int k = 4;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case24() {
    int[] price = { 727, 504, 598, 409, 894, 989, 239, 86 };
    int budget = 4470;
    int k = 5;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case25() {
    int[] price = { 212, 747, 388, 711 };
    int budget = 2098;
    int k = 4;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case26() {
    int[] price = { 104, 474 };
    int budget = 578;
    int k = 1;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case27() {
    int[] price = { 106, 184, 953, 371, 788, 303 };
    int budget = 2705;
    int k = 5;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case28() {
    int[] price = { 111, 401, 997, 143, 586, 861, 48 };
    int budget = 3147;
    int k = 2;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case29() {
    int[] price = { 159, 387, 220, 401, 416, 56, 683, 875, 62 };
    int budget = 3259;
    int k = 9;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case30() {
    int[] price = { 269, 366, 471, 519, 724, 90, 107, 320 };
    int budget = 2866;
    int k = 3;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case31() {
    int[] price = { 733, 994, 975, 596, 811, 674, 56, 731 };
    int budget = 5570;
    int k = 8;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case32() {
    int[] price = { 706 };
    int budget = 706;
    int k = 1;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case33() {
    int[] price = { 874, 354, 475, 761 };
    int budget = 2464;
    int k = 2;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case34() {
    int[] price = { 645, 144, 641, 738, 680, 136, 150, 530 };
    int budget = 3664;
    int k = 3;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case35() {
    int[] price = { 418, 256, 788, 374 };
    int budget = 1836;
    int k = 3;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case36() {
    int[] price = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
    int budget = 9000;
    int k = 9;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case37() {
    int[] price = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
    int budget = 7000;
    int k = 7;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case38() {
    int[] price = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
    int budget = 9000;
    int k = 9;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case39() {
    int[] price = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
    int budget = 1000;
    int k = 1;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case40() {
    int[] price = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
    int budget = 7000;
    int k = 7;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case41() {
    int[] price = { 1, 1, 1, 1, 1, 1, 1, 1 };
    int budget = 4;
    int k = 6;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case42() {
    int[] price = { 1, 1, 1 };
    int budget = 8;
    int k = 1;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case43() {
    int[] price = { 1, 1, 1, 1, 1, 1 };
    int budget = 7;
    int k = 6;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case44() {
    int[] price = { 1, 1, 1 };
    int budget = 9;
    int k = 3;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case45() {
    int[] price = { 1, 1, 1, 1, 1, 1, 1, 1 };
    int budget = 6;
    int k = 7;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case46() {
    int[] price = { 1, 1, 1, 1, 1, 1, 1 };
    int budget = 5;
    int k = 3;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case47() {
    int[] price = { 1, 1, 1, 1 };
    int budget = 1;
    int k = 1;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case48() {
    int[] price = { 1 };
    int budget = 10;
    int k = 1;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case49() {
    int[] price = { 1, 1, 1, 1, 1 };
    int budget = 10;
    int k = 3;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case50() {
    int[] price = { 1, 1, 1, 1, 1, 1, 1 };
    int budget = 4;
    int k = 6;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case51() {
    int[] price = { 433, 564, 18, 108, 584, 911, 468, 117 };
    int budget = 1547;
    int k = 8;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case52() {
    int[] price = { 72, 108, 257, 521 };
    int budget = 2354;
    int k = 1;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case53() {
    int[] price = { 431, 478, 49, 521, 205, 415, 811 };
    int budget = 5720;
    int k = 4;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case54() {
    int[] price = { 132, 702, 710, 752, 23, 818, 653 };
    int budget = 3925;
    int k = 3;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case55() {
    int[] price = { 154, 626, 979, 617, 143 };
    int budget = 6598;
    int k = 4;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case56() {
    int[] price = { 918, 405, 744, 396, 750, 408, 937, 303 };
    int budget = 3768;
    int k = 6;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case57() {
    int[] price = { 341, 399, 897, 52, 808, 768 };
    int budget = 4998;
    int k = 1;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case58() {
    int[] price = { 810, 331, 361, 717 };
    int budget = 5162;
    int k = 2;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case59() {
    int[] price = { 754, 99 };
    int budget = 5131;
    int k = 1;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case60() {
    int[] price = { 890, 89, 32 };
    int budget = 693;
    int k = 3;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case61() {
    int[] price = { 295, 694, 166, 950 };
    int budget = 8766;
    int k = 2;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case62() {
    int[] price = { 842, 49, 944 };
    int budget = 6230;
    int k = 1;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case63() {
    int[] price = { 210, 389, 755, 244, 502, 272, 517 };
    int budget = 7565;
    int k = 1;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case64() {
    int[] price = { 6, 612, 213, 783 };
    int budget = 3093;
    int k = 4;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case65() {
    int[] price = { 325 };
    int budget = 4005;
    int k = 1;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case66() {
    int[] price = { 805, 364, 392, 274, 576 };
    int budget = 9907;
    int k = 5;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case67() {
    int[] price = { 897, 860, 764, 359, 578, 485 };
    int budget = 7748;
    int k = 5;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case68() {
    int[] price = { 606, 455, 195, 360 };
    int budget = 3431;
    int k = 4;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case69() {
    int[] price = { 25 };
    int budget = 1448;
    int k = 1;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case70() {
    int[] price = { 877, 50, 793, 589, 305, 134, 559, 843, 415 };
    int budget = 4568;
    int k = 8;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case71() {
    int[] price = { 392, 1, 993, 119, 399, 719, 869, 976 };
    int budget = 580;
    int k = 8;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case72() {
    int[] price = { 597, 380, 917, 467, 841, 233, 431 };
    int budget = 7415;
    int k = 6;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case73() {
    int[] price = { 312, 180, 797, 301, 217, 904, 994 };
    int budget = 1056;
    int k = 3;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case74() {
    int[] price = { 906, 30, 38, 898, 287, 658, 378, 683 };
    int budget = 9555;
    int k = 3;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case75() {
    int[] price = { 530, 581, 642, 867, 853, 934, 661 };
    int budget = 8491;
    int k = 4;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case76() {
    int[] price = { 607, 115, 186, 648, 228, 436 };
    int budget = 59;
    int k = 6;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case77() {
    int[] price = { 743, 375 };
    int budget = 605;
    int k = 2;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case78() {
    int[] price = { 606, 481 };
    int budget = 2672;
    int k = 2;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case79() {
    int[] price = { 482, 681, 792, 776, 1, 47 };
    int budget = 1833;
    int k = 5;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case80() {
    int[] price = { 227, 179, 667 };
    int budget = 9469;
    int k = 3;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case81() {
    int[] price = { 464, 923, 512, 894, 649, 958, 832, 920, 513 };
    int budget = 7093;
    int k = 7;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case82() {
    int[] price = { 224, 39, 610 };
    int budget = 7453;
    int k = 3;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case83() {
    int[] price = { 977, 153, 518, 424, 403, 705, 937, 351 };
    int budget = 1036;
    int k = 2;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case84() {
    int[] price = { 965, 427, 166, 776, 405, 165, 874, 259 };
    int budget = 3625;
    int k = 6;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case85() {
    int[] price = { 778, 225, 227, 605 };
    int budget = 8452;
    int k = 2;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case86() {
    int[] price = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int budget = 29;
    int k = 4;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case87() {
    int[] price = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
    int budget = 29;
    int k = 4;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case88() {
    int[] price = { 1, 2, 3, 9, 4, 8, 7, 6, 4, 5 };
    int budget = 29;
    int k = 4;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case89() {
    int[] price = { 19, 114, 514, 810, 334, 893 };
    int budget = 1234;
    int k = 2;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case90() {
    int[] price = { 1000, 1, 10, 100 };
    int budget = 1110;
    int k = 3;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case91() {
    int[] price = { 1000, 1, 10, 100 };
    int budget = 1109;
    int k = 3;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case92() {
    int[] price = { 1, 5, 6, 11, 2 };
    int budget = 10;
    int k = 3;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case93() {
    int[] price = { 1, 2, 3 };
    int budget = 3;
    int k = 2;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case94() {
    int[] price = { 50 };
    int budget = 40;
    int k = 1;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case95() {
    int[] price = { 1, 1, 1, 1 };
    int budget = 3;
    int k = 4;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case96() {
    int[] price = { 1, 2, 3, 4, 5, 6 };
    int budget = 7;
    int k = 3;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case97() {
    int[] price = { 1000, 1000, 1000, 1000 };
    int budget = 1110;
    int k = 3;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case98() {
    int[] price = { 1, 1, 1, 1, 1 };
    int budget = 4;
    int k = 5;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case99() {
    int[] price = { 1, 4 };
    int budget = 4;
    int k = 1;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case100() {
    int[] price = { 1, 1, 1, 1, 1, 1 };
    int budget = 2;
    int k = 4;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case101() {
    int[] price = { 100, 1, 101 };
    int budget = 110;
    int k = 2;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case102() {
    int[] price = { 10, 1, 10 };
    int budget = 11;
    int k = 2;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case103() {
    int[] price = { 1, 2, 3, 4 };
    int budget = 7;
    int k = 2;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case104() {
    int[] price = { 1, 1, 10 };
    int budget = 1;
    int k = 1;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case105() {
    int[] price = { 33, 34 };
    int budget = 33;
    int k = 1;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case106() {
    int[] price = { 1, 1, 1, 1, 1, 1 };
    int budget = 2;
    int k = 5;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case107() {
    int[] price = { 4, 4, 4 };
    int budget = 8;
    int k = 2;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case108() {
    int[] price = { 1, 1, 1, 1, 2, 2, 2, 2 };
    int budget = 7;
    int k = 4;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case109() {
    int[] price = { 1, 1, 1, 100 };
    int budget = 100;
    int k = 3;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case110() {
    int[] price = { 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int budget = 10;
    int k = 9;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case111() {
    int[] price = { 1, 1, 1, 1000 };
    int budget = 3;
    int k = 3;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case112() {
    int[] price = { 1, 10 };
    int budget = 1;
    int k = 1;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case113() {
    int[] price = { 1, 2, 4 };
    int budget = 5;
    int k = 2;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case114() {
    int[] price = { 1, 1, 1, 1, 1, 1, 1, 1 };
    int budget = 4;
    int k = 7;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case115() {
    int[] price = { 33, 4, 78, 40 };
    int budget = 110;
    int k = 2;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case116() {
    int[] price = { 1000, 1, 10, 100 };
    int budget = 1115;
    int k = 3;
    assertEquals("YES", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case117() {
    int[] price = { 1000, 10, 1, 100 };
    int budget = 999;
    int k = 2;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case118() {
    int[] price = { 1000 };
    int budget = 1;
    int k = 1;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case119() {
    int[] price = { 1, 2, 9, 10 };
    int budget = 15;
    int k = 2;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

  @Test
  public void case120() {
    int[] price = { 1000, 1, 10 };
    int budget = 100;
    int k = 1;
    assertEquals("NO", cucumbermarket.check(price, budget, k));
  }

}
