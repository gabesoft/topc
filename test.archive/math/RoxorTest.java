package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class RoxorTest {
  Roxor roxor = new Roxor();

  @Test
  public void case1() {
    int[] piles = { 0, 0, 1, 0, 1, 100 };
    assertArrayEquals(new int[] { 2, 4, 5 }, roxor.play(piles));
  }

  @Test
  public void case2() {
    int[] piles = { 1000, 1000, 1000, 1000, 1000 };
    assertArrayEquals(new int[] {  }, roxor.play(piles));
  }

  @Test
  public void case3() {
    int[] piles = { 2, 1, 1, 1, 5 };
    assertArrayEquals(new int[] { 0, 1, 1 }, roxor.play(piles));
  }

  @Test
  public void case4() {
    int[] piles = { 14, 301, 391, 410, 511, 681, 58, 259, 981, 81, 5, 42, 251, 401, 120 };
    assertArrayEquals(new int[] { 2, 5, 14 }, roxor.play(piles));
  }

  @Test
  public void case5() {
    int[] piles = { 193, 584 };
    assertArrayEquals(new int[] { 0, 1, 1 }, roxor.play(piles));
  }

  @Test
  public void case6() {
    int[] piles = { 895, 746, 858, 513, 14, 364, 165, 445 };
    assertArrayEquals(new int[] { 0, 3, 6 }, roxor.play(piles));
  }

  @Test
  public void case7() {
    int[] piles = { 0, 1, 531 };
    assertArrayEquals(new int[] { 1, 2, 2 }, roxor.play(piles));
  }

  @Test
  public void case8() {
    int[] piles = { 607, 663, 352, 607, 802, 301, 726, 925, 142 };
    assertArrayEquals(new int[] { 0, 1, 1 }, roxor.play(piles));
  }

  @Test
  public void case9() {
    int[] piles = { 862, 779, 996, 611, 266, 840, 375, 677 };
    assertArrayEquals(new int[] { 0, 1, 1 }, roxor.play(piles));
  }

  @Test
  public void case10() {
    int[] piles = { 1, 275 };
    assertArrayEquals(new int[] { 0, 1, 1 }, roxor.play(piles));
  }

  @Test
  public void case11() {
    int[] piles = { 691, 726, 205, 468, 949 };
    assertArrayEquals(new int[] { 0, 2, 4 }, roxor.play(piles));
  }

  @Test
  public void case12() {
    int[] piles = { 599, 734, 572, 151, 425, 517, 751, 168, 491, 699, 147, 141 };
    assertArrayEquals(new int[] { 0, 7, 11 }, roxor.play(piles));
  }

  @Test
  public void case13() {
    int[] piles = { 303, 70, 683, 877, 582, 177, 475, 503, 405, 568, 755, 475, 367, 35 };
    assertArrayEquals(new int[] { 0, 12, 13 }, roxor.play(piles));
  }

  @Test
  public void case14() {
    int[] piles = { 426, 949, 549, 471, 846, 456, 982, 739, 195 };
    assertArrayEquals(new int[] { 0, 7, 8 }, roxor.play(piles));
  }

  @Test
  public void case15() {
    int[] piles = { 397, 890, 994, 50, 194, 626, 197, 123, 743, 941, 336, 733 };
    assertArrayEquals(new int[] { 0, 3, 7 }, roxor.play(piles));
  }

  @Test
  public void case16() {
    int[] piles = { 600, 252, 1, 806, 210, 553, 0, 454, 686, 73, 201, 290, 232 };
    assertArrayEquals(new int[] { 0, 4, 12 }, roxor.play(piles));
  }

  @Test
  public void case17() {
    int[] piles = { 628, 504, 695, 189, 178, 457, 97, 94, 931, 894 };
    assertArrayEquals(new int[] { 1, 2, 5 }, roxor.play(piles));
  }

  @Test
  public void case18() {
    int[] piles = { 769, 201, 604, 466, 634, 828 };
    assertArrayEquals(new int[] { 0, 1, 5 }, roxor.play(piles));
  }

  @Test
  public void case19() {
    int[] piles = { 565, 184, 555, 242, 604, 584, 494, 740, 620, 804 };
    assertArrayEquals(new int[] { 0, 2, 9 }, roxor.play(piles));
  }

  @Test
  public void case20() {
    int[] piles = { 867, 614, 43, 976 };
    assertArrayEquals(new int[] { 0, 2, 3 }, roxor.play(piles));
  }

  @Test
  public void case21() {
    int[] piles = { 305, 108, 851, 154, 79, 640 };
    assertArrayEquals(new int[] { 0, 1, 3 }, roxor.play(piles));
  }

  @Test
  public void case22() {
    int[] piles = { 448, 298, 501, 323, 313, 959, 725, 943, 65, 524, 956, 875, 322 };
    assertArrayEquals(new int[] { 0, 2, 12 }, roxor.play(piles));
  }

  @Test
  public void case23() {
    int[] piles = { 227, 919, 662 };
    assertArrayEquals(new int[] { 0, 1, 2 }, roxor.play(piles));
  }

  @Test
  public void case24() {
    int[] piles = { 379, 793, 382 };
    assertArrayEquals(new int[] { 0, 1, 2 }, roxor.play(piles));
  }

  @Test
  public void case25() {
    int[] piles = { 606, 5, 100, 863, 747, 380, 552, 955, 176, 131, 951 };
    assertArrayEquals(new int[] { 0, 1, 1 }, roxor.play(piles));
  }

  @Test
  public void case26() {
    int[] piles = { 329, 639, 847, 596, 853, 0, 707, 217, 168, 340 };
    assertArrayEquals(new int[] { 0, 2, 9 }, roxor.play(piles));
  }

  @Test
  public void case27() {
    int[] piles = { 660, 806, 611, 900, 630, 253 };
    assertArrayEquals(new int[] { 1, 3, 4 }, roxor.play(piles));
  }

  @Test
  public void case28() {
    int[] piles = { 66, 573, 548 };
    assertArrayEquals(new int[] { 1, 2, 2 }, roxor.play(piles));
  }

  @Test
  public void case29() {
    int[] piles = { 110, 134, 788, 789, 615 };
    assertArrayEquals(new int[] { 0, 1, 2 }, roxor.play(piles));
  }

  @Test
  public void case30() {
    int[] piles = { 228, 229, 542, 53, 524, 94, 891 };
    assertArrayEquals(new int[] { 0, 2, 6 }, roxor.play(piles));
  }

  @Test
  public void case31() {
    int[] piles = { 125, 80, 58, 914, 432 };
    assertArrayEquals(new int[] { 0, 1, 1 }, roxor.play(piles));
  }

  @Test
  public void case32() {
    int[] piles = { 534, 693, 259, 0, 954, 241, 255, 945, 890, 0, 601, 576, 222, 4, 82 };
    assertArrayEquals(new int[] { 0, 13, 14 }, roxor.play(piles));
  }

  @Test
  public void case33() {
    int[] piles = { 64, 662, 802, 685, 689, 777, 868, 706, 551, 58, 145 };
    assertArrayEquals(new int[] { 2, 8, 10 }, roxor.play(piles));
  }

  @Test
  public void case34() {
    int[] piles = { 292, 367, 218, 240, 902, 902, 80, 171, 775, 210, 3, 114, 311, 38, 189 };
    assertArrayEquals(new int[] { 0, 1, 1 }, roxor.play(piles));
  }

  @Test
  public void case35() {
    int[] piles = { 620, 939, 779, 656, 455 };
    assertArrayEquals(new int[] { 0, 3, 4 }, roxor.play(piles));
  }

  @Test
  public void case36() {
    int[] piles = { 150, 569, 942, 578, 255, 350, 795, 70, 590, 197, 644, 604, 441, 396 };
    assertArrayEquals(new int[] { 0, 1, 11 }, roxor.play(piles));
  }

  @Test
  public void case37() {
    int[] piles = { 199, 875, 987, 895, 442, 708, 285, 407, 710, 896, 397, 308, 570 };
    assertArrayEquals(new int[] { 0, 1, 10 }, roxor.play(piles));
  }

  @Test
  public void case38() {
    int[] piles = { 745, 739, 200, 680, 367, 109 };
    assertArrayEquals(new int[] { 0, 1, 4 }, roxor.play(piles));
  }

  @Test
  public void case39() {
    int[] piles = { 517, 438, 90, 75, 355, 697, 394, 675, 198, 615, 543, 545, 974, 969 };
    assertArrayEquals(new int[] { 0, 9, 13 }, roxor.play(piles));
  }

  @Test
  public void case40() {
    int[] piles = { 679, 372, 49, 169, 310, 212, 484, 0, 507, 758, 349, 942 };
    assertArrayEquals(new int[] { 0, 1, 6 }, roxor.play(piles));
  }

  @Test
  public void case41() {
    int[] piles = { 53, 863, 306, 26, 391, 0, 455, 936, 727, 808 };
    assertArrayEquals(new int[] { 0, 1, 2 }, roxor.play(piles));
  }

  @Test
  public void case42() {
    int[] piles = { 595, 793, 590, 569, 672, 10, 341, 770, 869, 725, 893, 535, 780, 197 };
    assertArrayEquals(new int[] { 0, 12, 13 }, roxor.play(piles));
  }

  @Test
  public void case43() {
    int[] piles = { 953, 890, 185, 264, 732, 170, 480, 806, 124, 573, 762, 727, 15, 691 };
    assertArrayEquals(new int[] { 0, 1, 9 }, roxor.play(piles));
  }

  @Test
  public void case44() {
    int[] piles = { 274, 838, 371, 232 };
    assertArrayEquals(new int[] { 2, 3, 3 }, roxor.play(piles));
  }

  @Test
  public void case45() {
    int[] piles = { 204, 281, 769, 46, 0, 643, 414, 90, 699, 657 };
    assertArrayEquals(new int[] { 1, 3, 9 }, roxor.play(piles));
  }

  @Test
  public void case46() {
    int[] piles = { 570, 465, 426, 486, 565, 778, 850, 864, 746, 765, 908, 521, 107, 823 };
    assertArrayEquals(new int[] { 0, 1, 6 }, roxor.play(piles));
  }

  @Test
  public void case47() {
    int[] piles = { 0, 773, 89, 683, 154, 48, 18 };
    assertArrayEquals(new int[] { 1, 2, 3 }, roxor.play(piles));
  }

  @Test
  public void case48() {
    int[] piles = { 53, 637, 21, 391, 781, 826, 634, 983, 214, 782, 480, 102, 755, 456, 998 };
    assertArrayEquals(new int[] { 0, 2, 5 }, roxor.play(piles));
  }

  @Test
  public void case49() {
    int[] piles = { 621, 688, 567, 548, 246, 492, 669, 623, 798, 988, 629, 591 };
    assertArrayEquals(new int[] { 0, 1, 4 }, roxor.play(piles));
  }

  @Test
  public void case50() {
    int[] piles = { 489, 889, 182, 203, 941, 41, 34, 544, 61, 127, 50, 660, 315, 410 };
    assertArrayEquals(new int[] { 0, 2, 13 }, roxor.play(piles));
  }

  @Test
  public void case51() {
    int[] piles = { 678, 497, 802, 4, 375, 827, 891 };
    assertArrayEquals(new int[] { 0, 1, 1 }, roxor.play(piles));
  }

  @Test
  public void case52() {
    int[] piles = { 514, 737, 465, 112, 821, 108, 761, 416, 67, 211, 591 };
    assertArrayEquals(new int[] { 0, 8, 10 }, roxor.play(piles));
  }

  @Test
  public void case53() {
    int[] piles = { 580, 731, 669 };
    assertArrayEquals(new int[] { 1, 2, 2 }, roxor.play(piles));
  }

  @Test
  public void case54() {
    int[] piles = { 378, 772, 170, 181, 195, 190 };
    assertArrayEquals(new int[] { 1, 2, 5 }, roxor.play(piles));
  }

  @Test
  public void case55() {
    int[] piles = { 120, 46, 761, 1, 426, 461, 749 };
    assertArrayEquals(new int[] { 0, 1, 5 }, roxor.play(piles));
  }

  @Test
  public void case56() {
    int[] piles = { 92, 893, 59, 632, 756 };
    assertArrayEquals(new int[] { 0, 3, 4 }, roxor.play(piles));
  }

  @Test
  public void case57() {
    int[] piles = { 791, 552, 522, 704, 731 };
    assertArrayEquals(new int[] { 0, 1, 1 }, roxor.play(piles));
  }

  @Test
  public void case58() {
    int[] piles = { 875, 305, 481, 651, 0, 756, 154, 670, 345 };
    assertArrayEquals(new int[] {  }, roxor.play(piles));
  }

  @Test
  public void case59() {
    int[] piles = { 436, 635, 476, 79, 143, 917, 373, 46, 239, 256, 208 };
    assertArrayEquals(new int[] { 0, 5, 10 }, roxor.play(piles));
  }

  @Test
  public void case60() {
    int[] piles = { 874, 844, 40, 183, 449 };
    assertArrayEquals(new int[] { 0, 1, 2 }, roxor.play(piles));
  }

  @Test
  public void case61() {
    int[] piles = { 623, 911, 730, 969 };
    assertArrayEquals(new int[] { 0, 1, 3 }, roxor.play(piles));
  }

  @Test
  public void case62() {
    int[] piles = { 146, 284, 973, 716, 645, 735, 124, 375, 915, 32, 448, 0, 418, 919 };
    assertArrayEquals(new int[] { 0, 1, 9 }, roxor.play(piles));
  }

  @Test
  public void case63() {
    int[] piles = { 754, 213, 771, 556, 851, 538, 869, 227, 371 };
    assertArrayEquals(new int[] { 0, 1, 7 }, roxor.play(piles));
  }

  @Test
  public void case64() {
    int[] piles = { 561, 119, 898, 940, 849, 445, 634 };
    assertArrayEquals(new int[] {  }, roxor.play(piles));
  }

  @Test
  public void case65() {
    int[] piles = { 423, 0, 139, 291, 561, 607, 422, 739, 516 };
    assertArrayEquals(new int[] { 0, 7, 8 }, roxor.play(piles));
  }

  @Test
  public void case66() {
    int[] piles = { 1, 333 };
    assertArrayEquals(new int[] { 0, 1, 1 }, roxor.play(piles));
  }

  @Test
  public void case67() {
    int[] piles = { 767, 630, 682, 500, 265, 646, 263, 460, 351, 0, 626, 383, 288, 883 };
    assertArrayEquals(new int[] { 0, 1, 12 }, roxor.play(piles));
  }

  @Test
  public void case68() {
    int[] piles = { 382, 10, 865, 699, 602, 559, 378, 937 };
    assertArrayEquals(new int[] { 0, 1, 1 }, roxor.play(piles));
  }

  @Test
  public void case69() {
    int[] piles = { 608, 76, 305, 80, 304, 932, 216, 560, 250, 727, 231, 446, 574, 995, 0 };
    assertArrayEquals(new int[] { 0, 12, 14 }, roxor.play(piles));
  }

  @Test
  public void case70() {
    int[] piles = { 256, 116 };
    assertArrayEquals(new int[] {  }, roxor.play(piles));
  }

  @Test
  public void case71() {
    int[] piles = { 959, 79, 279, 490, 924 };
    assertArrayEquals(new int[] { 0, 1, 2 }, roxor.play(piles));
  }

  @Test
  public void case72() {
    int[] piles = { 475, 951, 834, 801, 870, 939, 943, 127, 472, 26 };
    assertArrayEquals(new int[] { 0, 6, 9 }, roxor.play(piles));
  }

  @Test
  public void case73() {
    int[] piles = { 862, 14 };
    assertArrayEquals(new int[] {  }, roxor.play(piles));
  }

  @Test
  public void case74() {
    int[] piles = { 797, 658, 781, 842 };
    assertArrayEquals(new int[] { 0, 2, 3 }, roxor.play(piles));
  }

  @Test
  public void case75() {
    int[] piles = { 23, 30, 715, 180, 182 };
    assertArrayEquals(new int[] { 0, 2, 4 }, roxor.play(piles));
  }

  @Test
  public void case76() {
    int[] piles = { 58, 358, 158, 131, 181, 249, 346, 664, 932, 105, 557, 895 };
    assertArrayEquals(new int[] { 0, 1, 4 }, roxor.play(piles));
  }

  @Test
  public void case77() {
    int[] piles = { 822, 548, 450 };
    assertArrayEquals(new int[] {  }, roxor.play(piles));
  }

  @Test
  public void case78() {
    int[] piles = { 982, 594, 131, 600, 355 };
    assertArrayEquals(new int[] { 0, 1, 3 }, roxor.play(piles));
  }

  @Test
  public void case79() {
    int[] piles = { 691, 671, 237, 235, 484 };
    assertArrayEquals(new int[] {  }, roxor.play(piles));
  }

  @Test
  public void case80() {
    int[] piles = { 570, 348, 290, 922, 806, 686 };
    assertArrayEquals(new int[] {  }, roxor.play(piles));
  }

  @Test
  public void case81() {
    int[] piles = { 1000, 999, 1000, 999, 1000, 999, 1000, 999, 1000, 999, 1000, 999, 1000, 999, 1000 };
    assertArrayEquals(new int[] { 0, 2, 5 }, roxor.play(piles));
  }

}
