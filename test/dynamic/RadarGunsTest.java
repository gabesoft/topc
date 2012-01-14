package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class RadarGunsTest {
  RadarGuns radarguns = new RadarGuns();

  @Test
  public void case1() {
    int[] enterTimes = { 1, 2 };
    int[] exitTimes = { 4, 5 };
    int speedTime = 3;
    int fineCap = 100;
    assertArrayEquals(new int[] { 0, 1 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case2() {
    int[] enterTimes = { 2, 1 };
    int[] exitTimes = { 60, 40 };
    int speedTime = 100;
    int fineCap = 100;
    assertArrayEquals(new int[] { 200, 200 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case3() {
    int[] enterTimes = { 1000, 584, 390, 392, 109 };
    int[] exitTimes = { 987, 724, 814, 597, 422 };
    int speedTime = 1;
    int fineCap = 30;
    assertArrayEquals(new int[] {  }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case4() {
    int[] enterTimes = { 3, 6, 4, 2, 9 };
    int[] exitTimes = { 4, 7, 5, 3, 9 };
    int speedTime = 10;
    int fineCap = 50;
    assertArrayEquals(new int[] {  }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case5() {
    int[] enterTimes = { 1, 2, 5, 6, 9, 10 };
    int[] exitTimes = { 3, 4, 7, 8, 11, 12 };
    int speedTime = 2;
    int fineCap = 99;
    assertArrayEquals(new int[] { 0, 3 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case6() {
    int[] enterTimes = { 1, 2, 5, 6, 9, 10 };
    int[] exitTimes = { 3, 4, 7, 8, 11, 12 };
    int speedTime = 5;
    int fineCap = 99;
    assertArrayEquals(new int[] { 54, 60 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case7() {
    int[] enterTimes = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    int[] exitTimes = { 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150 };
    int speedTime = 99;
    int fineCap = 125;
    assertArrayEquals(new int[] { 0, 4625 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case8() {
    int[] enterTimes = { 1, 2, 3, 4, 5 };
    int[] exitTimes = { 2, 3, 3, 5, 6 };
    int speedTime = 1;
    int fineCap = 3;
    assertArrayEquals(new int[] {  }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case9() {
    int[] enterTimes = { 1, 2, 5, 6, 9, 10, 13, 14, 17, 18, 21, 22, 25, 26, 29, 30, 33, 34, 37, 38, 41, 42, 45, 46, 49, 50, 53, 54, 57, 58, 61, 62, 65, 66, 69, 70, 73, 74, 77, 78, 81, 82, 85, 86, 89, 90, 93, 94, 97, 98 };
    int[] exitTimes = { 3, 4, 7, 8, 11, 12, 15, 16, 19, 20, 23, 24, 27, 28, 31, 32, 35, 36, 39, 40, 43, 44, 47, 48, 51, 52, 55, 56, 59, 60, 63, 64, 67, 68, 71, 72, 75, 76, 79, 80, 83, 84, 87, 88, 91, 92, 95, 96, 99, 100 };
    int speedTime = 2;
    int fineCap = 50;
    assertArrayEquals(new int[] { 0, 25 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case10() {
    int[] enterTimes = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99 };
    int[] exitTimes = { 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 100, 102, 104 };
    int speedTime = 4;
    int fineCap = 12;
    assertArrayEquals(new int[] { 0, 432 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case11() {
    int[] enterTimes = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int[] exitTimes = { 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
    int speedTime = 3;
    int fineCap = 13;
    assertArrayEquals(new int[] { 1, 1 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case12() {
    int[] enterTimes = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int[] exitTimes = { 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
    int speedTime = 45;
    int fineCap = 15;
    assertArrayEquals(new int[] { 44, 44 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case13() {
    int[] enterTimes = { 319, 999, 302, 589, 902, 950, 443 };
    int[] exitTimes = { 444, 320, 1000, 303, 590, 903, 951 };
    int speedTime = 1000;
    int fineCap = 0;
    assertArrayEquals(new int[] { 0, 0 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case14() {
    int[] enterTimes = { 1, 2, 3, 4, 5 };
    int[] exitTimes = { 6, 9, 12, 14, 15 };
    int speedTime = 10;
    int fineCap = 1000;
    assertArrayEquals(new int[] { 35, 107 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case15() {
    int[] enterTimes = { 1, 112, 115 };
    int[] exitTimes = { 122, 125, 300 };
    int speedTime = 20;
    int fineCap = 110;
    assertArrayEquals(new int[] { 49, 200 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case16() {
    int[] enterTimes = { 1, 112, 115 };
    int[] exitTimes = { 122, 125, 300 };
    int speedTime = 20;
    int fineCap = 1000;
    assertArrayEquals(new int[] { 49, 218 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case17() {
    int[] enterTimes = { 10, 30, 100, 130, 159, 133, 138, 109, 913 };
    int[] exitTimes = { 50, 60, 1000, 209, 239, 389, 129, 199, 201 };
    int speedTime = 55;
    int fineCap = 350;
    assertArrayEquals(new int[] { 725, 1150 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case18() {
    int[] enterTimes = { 449, 328, 474, 150, 709, 467, 329, 936, 440, 700, 117, 258, 811, 952, 491, 993, 931, 823, 431, 359, 590, 899, 153, 292, 370, 404, 698, 699, 876, 442, 705, 757, 527, 868, 893, 642, 273, 18, 885, 675, 788, 291 };
    int[] exitTimes = { 728, 934, 997, 404, 960, 870, 622, 211, 857, 798, 939, 965, 907, 734, 757, 964, 725, 996, 999, 273, 503, 735, 968, 878, 787, 888, 840, 997, 849, 738, 723, 804, 534, 490, 919, 949, 887, 994, 475, 378, 885, 894 };
    int speedTime = 32;
    int fineCap = 5573;
    assertArrayEquals(new int[] { 676, 11585 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case19() {
    int[] enterTimes = { 323, 149, 925 };
    int[] exitTimes = { 982, 749, 175 };
    int speedTime = 458;
    int fineCap = 1336;
    assertArrayEquals(new int[] { 3696, 3696 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case20() {
    int[] enterTimes = { 726, 373, 931, 901, 177, 749, 197, 570, 416, 922, 479, 17, 397, 139, 900, 559, 744, 654, 393, 353, 597, 517, 527, 477, 568, 37, 599, 326, 281, 806, 365, 9, 592, 998, 321, 176, 649, 460 };
    int[] exitTimes = { 977, 776, 872, 950, 615, 386, 985, 90, 877, 998, 784, 726, 898, 882, 984, 999, 185, 899, 959, 969, 426, 633, 961, 757, 822, 637, 853, 569, 802, 680, 883, 802, 428, 773, 578, 956, 921, 431 };
    int speedTime = 887;
    int fineCap = 6360;
    assertArrayEquals(new int[] { 222146, 241680 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case21() {
    int[] enterTimes = { 405, 840, 122, 821, 415, 860, 967, 312, 633, 11, 694, 554, 448, 865, 365, 70, 702, 598, 508, 983, 843, 844, 674, 388, 780, 240 };
    int[] exitTimes = { 923, 593, 909, 973, 820, 785, 598, 709, 857, 647, 980, 677, 720, 984, 777, 924, 943, 284, 777, 998, 865, 885, 926, 903, 656, 748 };
    int speedTime = 787;
    int fineCap = 669;
    assertArrayEquals(new int[] { 15387, 17394 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case22() {
    int[] enterTimes = { 309, 331, 154, 33, 912, 798, 831, 925, 309, 729, 293, 539, 623, 955 };
    int[] exitTimes = { 961, 672, 998, 998, 973, 832, 393, 410, 742, 781, 849, 879, 918, 554 };
    int speedTime = 392;
    int fineCap = 7957;
    assertArrayEquals(new int[] { 56382, 90128 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case23() {
    int[] enterTimes = { 1, 451, 452, 453, 454, 455, 456, 457, 458, 459, 460, 461, 462, 463, 464, 465, 466, 467, 468, 469, 470, 471, 472, 473, 474, 475, 476, 477, 478, 479, 480, 481, 482, 483, 484, 485, 486, 487, 488, 489, 491, 492, 493, 494, 495, 496, 497, 498, 499 };
    int[] exitTimes = { 551, 552, 553, 554, 555, 556, 557, 558, 559, 560, 561, 562, 563, 564, 565, 566, 567, 568, 569, 570, 571, 572, 573, 574, 575, 576, 577, 578, 579, 580, 581, 582, 583, 584, 585, 586, 587, 588, 589, 591, 592, 593, 594, 595, 596, 597, 598, 599, 1000 };
    int speedTime = 111;
    int fineCap = 1832;
    assertArrayEquals(new int[] { 4681, 33200 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case24() {
    int[] enterTimes = { 269, 511, 169, 756, 238, 762, 666, 175, 972, 99, 472, 184, 620, 798, 95, 497, 623, 542, 923, 12, 943, 48, 167, 973, 405, 488, 566, 703, 18, 484, 142, 205, 255, 51, 893, 168, 352, 391 };
    int[] exitTimes = { 650, 770, 618, 822, 515, 770, 809, 655, 994, 858, 626, 808, 609, 610, 952, 612, 932, 845, 986, 899, 765, 943, 802, 456, 964, 717, 368, 884, 716, 830, 936, 710, 79, 915, 977, 818, 404, 680 };
    int speedTime = 791;
    int fineCap = 1518;
    assertArrayEquals(new int[] { 44251, 57684 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case25() {
    int[] enterTimes = { 158, 742, 936, 831, 644, 816, 870, 696, 940, 561, 357, 995, 466, 199, 32, 433, 301, 748, 338, 322, 471, 103, 92, 873, 782 };
    int[] exitTimes = { 353, 937, 781, 825, 642, 837, 599, 304, 260, 995, 969, 920, 266, 911, 916, 995, 824, 982, 897, 797, 529, 713, 816, 870, 949 };
    int speedTime = 608;
    int fineCap = 2963;
    assertArrayEquals(new int[] {  }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case26() {
    int[] enterTimes = { 911, 624, 57, 826, 671, 926, 221, 120, 731, 505, 719, 155, 438, 808, 218, 853, 625, 903, 190, 752, 827, 381, 257, 679, 181, 722, 636, 508, 551, 992, 166, 680, 956, 538 };
    int[] exitTimes = { 897, 938, 918, 864, 379, 634, 942, 822, 977, 807, 777, 779, 868, 922, 845, 217, 993, 451, 801, 656, 329, 573, 997, 880, 825, 897, 970, 667, 908, 997, 905, 749, 851, 944 };
    int speedTime = 993;
    int fineCap = 8213;
    assertArrayEquals(new int[] { 273838, 279242 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case27() {
    int[] enterTimes = { 596, 369, 744, 668, 402, 1000, 80, 65, 768, 483, 946, 281, 824, 572, 503, 200, 641, 701, 361, 1, 149, 462, 222, 152, 517 };
    int[] exitTimes = { 978, 837, 946, 652, 988, 979, 660, 668, 740, 174, 0, 792, 830, 691, 918, 924, 419, 87, 388, 960, 664, 909, 905, 871, 248 };
    int speedTime = 16;
    int fineCap = 6967;
    assertArrayEquals(new int[] {  }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case28() {
    int[] enterTimes = { 28, 522, 322, 86, 941, 625, 387, 437, 44, 677, 587, 331, 608, 28, 200, 757 };
    int[] exitTimes = { 633, 680, 838, 720, 890, 723, 690, 806, 972, 622, 874, 691, 504, 343, 981, 334 };
    int speedTime = 497;
    int fineCap = 2346;
    assertArrayEquals(new int[] { 21555, 35190 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case29() {
    int[] enterTimes = { 506, 947, 319, 67, 896, 126, 165, 927, 47, 406, 592, 147, 405, 372, 699, 606, 783, 356, 63, 549, 20, 722, 112, 784, 989, 248, 646, 913, 808, 462, 354, 995, 130, 212, 824 };
    int[] exitTimes = { 295, 925, 807, 527, 986, 893, 164, 993, 988, 697, 924, 773, 872, 507, 962, 980, 943, 735, 438, 625, 364, 607, 604, 996, 899, 989, 870, 264, 544, 541, 916, 840, 419, 840, 755 };
    int speedTime = 962;
    int fineCap = 2507;
    assertArrayEquals(new int[] { 81219, 87745 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case30() {
    int[] enterTimes = { 487, 514, 244, 913, 841, 58, 686, 958, 238, 102 };
    int[] exitTimes = { 843, 980, 822, 144, 994, 430, 158, 931, 321, 553 };
    int speedTime = 74;
    int fineCap = 5896;
    assertArrayEquals(new int[] { 1881, 13273 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case31() {
    int[] enterTimes = { 954, 114, 927, 661, 87, 999, 929, 775, 722, 342, 28, 159, 754, 193, 66, 884, 953, 70, 322, 845, 127, 281, 136, 805, 667, 614, 622, 596, 306, 689, 682, 50, 106, 237, 641, 527, 653, 857, 392 };
    int[] exitTimes = { 522, 999, 848, 608, 764, 916, 841, 217, 496, 939, 911, 421, 680, 997, 950, 868, 925, 949, 407, 961, 995, 888, 999, 702, 961, 928, 811, 916, 183, 946, 738, 571, 450, 994, 991, 112, 983, 920, 728 };
    int speedTime = 99;
    int fineCap = 804;
    assertArrayEquals(new int[] {  }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case32() {
    int[] enterTimes = { 263, 586, 271, 779, 334, 428, 869, 540, 287, 571, 754, 558, 314, 379, 387, 878, 803, 838, 790, 206, 445, 909, 658, 229, 496, 930, 531, 132, 137, 654, 655 };
    int[] exitTimes = { 339, 723, 382, 123, 706, 920, 167, 550, 630, 636, 60, 491, 510, 475, 600, 508, 221, 558, 905, 455, 538, 934, 147, 494, 537, 452, 330, 892, 322, 319, 903 };
    int speedTime = 738;
    int fineCap = 909;
    assertArrayEquals(new int[] {  }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case33() {
    int[] enterTimes = { 319, 277, 381, 629, 684, 136, 560, 930, 116, 503, 324, 995, 321, 621, 636, 961, 583, 538, 262, 78, 143, 355, 624, 186, 867, 803, 368, 565, 243, 626, 145, 801, 943, 579, 940, 269, 411 };
    int[] exitTimes = { 250, 914, 719, 503, 673, 937, 719, 934, 153, 840, 996, 942, 897, 989, 213, 627, 293, 632, 431, 950, 701, 959, 979, 915, 746, 748, 719, 993, 624, 325, 314, 640, 680, 918, 962, 995, 962 };
    int speedTime = 788;
    int fineCap = 7691;
    assertArrayEquals(new int[] { 249137, 284567 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case34() {
    int[] enterTimes = { 526, 944, 444, 16, 265, 196, 302, 374, 555, 922, 711, 965, 997, 762, 211, 80, 150, 833, 471, 917, 320, 480, 658, 954, 632, 527, 662, 646, 37, 970, 164, 776, 812 };
    int[] exitTimes = { 972, 799, 795, 900, 893, 771, 593, 931, 982, 620, 564, 967, 940, 577, 991, 650, 542, 911, 894, 845, 236, 998, 929, 865, 897, 632, 928, 374, 628, 718, 982, 969, 893 };
    int speedTime = 435;
    int fineCap = 7128;
    assertArrayEquals(new int[] { 133085, 213920 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case35() {
    int[] enterTimes = { 698, 500, 853, 841, 928, 880, 248, 728, 586, 580, 430, 659, 37, 724, 787, 258, 470, 416, 359, 43, 579, 385, 826, 352, 317, 22, 920, 463, 421, 817, 760, 734, 791, 588, 826, 871, 951, 321, 323, 358, 213, 773 };
    int[] exitTimes = { 634, 890, 848, 835, 734, 481, 737, 898, 198, 962, 940, 904, 267, 541, 729, 877, 936, 788, 851, 863, 455, 831, 797, 881, 777, 995, 835, 970, 939, 938, 755, 506, 307, 647, 946, 953, 559, 807, 976, 911, 970, 711 };
    int speedTime = 762;
    int fineCap = 9018;
    assertArrayEquals(new int[] { 349740, 378756 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case36() {
    int[] enterTimes = { 878, 132, 667, 703, 913, 427, 739 };
    int[] exitTimes = { 996, 390, 444, 719, 989, 740, 981 };
    int speedTime = 518;
    int fineCap = 7240;
    assertArrayEquals(new int[] { 50680, 50680 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case37() {
    int[] enterTimes = { 662, 241, 864, 224, 520, 727, 93 };
    int[] exitTimes = { 618, 706, 857, 988, 382, 662, 929 };
    int speedTime = 677;
    int fineCap = 2678;
    assertArrayEquals(new int[] { 16068, 18746 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case38() {
    int[] enterTimes = { 879, 773, 550, 90 };
    int[] exitTimes = { 166, 232, 900, 507 };
    int speedTime = 56;
    int fineCap = 167;
    assertArrayEquals(new int[] {  }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case39() {
    int[] enterTimes = { 968, 914, 742, 646, 976, 142, 430, 546, 491, 615, 887, 869, 776, 454, 890, 138, 663, 82, 806, 923, 831, 620, 26, 236, 543, 478, 195, 134, 939, 160, 386, 150, 81, 62, 38, 511, 252, 566, 57, 862, 126, 607 };
    int[] exitTimes = { 611, 285, 982, 281, 254, 503, 887, 818, 177, 998, 710, 77, 719, 957, 945, 818, 489, 927, 639, 909, 922, 607, 913, 652, 936, 795, 583, 987, 789, 822, 694, 253, 791, 922, 950, 106, 683, 884, 859, 662, 981, 954 };
    int speedTime = 474;
    int fineCap = 3243;
    assertArrayEquals(new int[] { 88188, 129367 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case40() {
    int[] enterTimes = { 549, 329, 180, 283, 697, 92, 625, 448, 165, 527, 972, 110, 463, 377, 239, 864, 655, 797, 340, 2, 986, 311, 142, 416, 649 };
    int[] exitTimes = { 874, 290, 658, 917, 571, 98, 646, 738, 728, 882, 998, 992, 955, 687, 585, 330, 833, 692, 793, 901, 617, 500, 466, 989, 338 };
    int speedTime = 269;
    int fineCap = 268;
    assertArrayEquals(new int[] { 1886, 5896 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case41() {
    int[] enterTimes = { 866, 337, 280, 587, 665, 406, 761, 994, 394, 996, 542, 520, 8, 367, 348, 276, 616, 178, 80, 568, 977, 751, 473, 209, 492, 465, 418, 650, 743, 82, 69, 76, 512, 191, 961, 760, 868, 98, 653, 340, 571, 53, 64, 854 };
    int[] exitTimes = { 424, 752, 928, 235, 500, 983, 602, 832, 842, 643, 973, 662, 972, 779, 651, 844, 983, 988, 958, 760, 780, 487, 268, 911, 749, 916, 970, 451, 649, 652, 869, 684, 784, 966, 601, 999, 325, 995, 658, 860, 948, 595, 908, 960 };
    int speedTime = 200;
    int fineCap = 1977;
    assertArrayEquals(new int[] { 13839, 61816 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case42() {
    int[] enterTimes = { 767, 643, 673, 649, 745, 9 };
    int[] exitTimes = { 910, 958, 902, 766, 945, 725 };
    int speedTime = 770;
    int fineCap = 8863;
    assertArrayEquals(new int[] { 44315, 47231 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case43() {
    int[] enterTimes = { 991, 26, 593, 466, 302, 273, 302, 534, 672, 967, 556, 686, 242, 928, 192, 442, 163, 566, 932, 974, 755 };
    int[] exitTimes = { 662, 963, 921, 962, 741, 996, 975, 717, 973, 654, 457, 811, 768, 687, 953, 321, 681, 631, 907, 881, 673 };
    int speedTime = 722;
    int fineCap = 2361;
    assertArrayEquals(new int[] { 40138, 49581 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case44() {
    int[] enterTimes = { 404, 422, 592, 495, 725, 7, 781, 122, 993, 47, 390, 730, 264, 863, 607, 642 };
    int[] exitTimes = { 675, 221, 337, 144, 268, 308, 131, 580, 619, 203, 58, 703, 950, 328, 704, 195 };
    int speedTime = 131;
    int fineCap = 592;
    assertArrayEquals(new int[] {  }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case45() {
    int[] enterTimes = { 983, 416, 787, 608, 745, 469, 311, 942, 107, 683, 177, 609, 201, 907, 711, 450, 889, 345, 283, 852, 728, 552, 25, 579, 176, 68, 354, 105, 735, 402, 660, 767, 267, 265, 647, 806, 101, 94, 725, 10, 87, 557, 727, 77, 536, 773, 44 };
    int[] exitTimes = { 848, 903, 916, 928, 659, 951, 655, 941, 298, 283, 848, 417, 807, 483, 944, 874, 759, 986, 825, 497, 356, 876, 817, 260, 685, 938, 288, 995, 934, 796, 535, 661, 293, 830, 898, 535, 789, 985, 959, 971, 743, 984, 901, 845, 987, 463, 793 };
    int speedTime = 227;
    int fineCap = 5021;
    assertArrayEquals(new int[] { 28002, 180756 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case46() {
    int[] enterTimes = { 18, 30, 569, 628 };
    int[] exitTimes = { 923, 999, 726, 453 };
    int speedTime = 532;
    int fineCap = 555;
    assertArrayEquals(new int[] { 1665, 1665 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case47() {
    int[] enterTimes = { 36, 561, 777, 385, 897, 443, 307, 266, 766, 354, 123, 774, 618, 546, 282, 937, 66, 582, 255, 308, 893, 480, 93, 746, 216, 712, 247, 592, 972, 308, 620, 235, 28, 350, 649, 479, 277, 651, 972, 993, 553, 418, 879, 129, 991, 349 };
    int[] exitTimes = { 993, 58, 922, 639, 832, 549, 525, 818, 976, 686, 896, 650, 765, 996, 957, 999, 408, 916, 883, 996, 487, 645, 629, 992, 712, 981, 608, 672, 973, 777, 571, 995, 264, 749, 961, 821, 684, 993, 611, 597, 848, 583, 717, 772, 971, 713 };
    int speedTime = 4;
    int fineCap = 6080;
    assertArrayEquals(new int[] { 0, 53 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case48() {
    int[] enterTimes = { 1, 2, 3, 31, 34 };
    int[] exitTimes = { 21, 22, 23, 42, 45 };
    int speedTime = 21;
    int fineCap = 130;
    assertArrayEquals(new int[] { 182, 210 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case49() {
    int[] enterTimes = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    int[] exitTimes = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int speedTime = 1000;
    int fineCap = 10000;
    assertArrayEquals(new int[] { 500000, 500000 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case50() {
    int[] enterTimes = { 1, 2, 3 };
    int[] exitTimes = { 4, 5, 6 };
    int speedTime = 7;
    int fineCap = 42;
    assertArrayEquals(new int[] { 48, 56 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case51() {
    int[] enterTimes = { 1, 2, 4, 5, 6, 4, 400, 500, 600, 700, 54, 65, 76, 87, 98, 9, 43, 23, 54, 21, 500, 542, 546, 542, 512, 453, 124, 521, 511, 502, 0, 12, 13, 14, 15, 16, 17, 18, 19, 20, 0, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
    int[] exitTimes = { 2, 5, 5, 7, 43, 7, 405, 670, 630, 800, 50, 50, 50, 110, 100, 100, 95, 98, 54, 930, 505, 550, 502, 570, 570, 605, 760, 678, 939, 1000, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 35, 36, 37, 38, 39, 40, 41, 42, 43, 15 };
    int speedTime = 23;
    int fineCap = 37;
    assertArrayEquals(new int[] { 247, 805 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case52() {
    int[] enterTimes = { 16, 9, 44, 19, 15, 31, 50, 42, 13, 47, 15, 48, 18, 19, 17, 14, 30, 24, 22, 28, 30, 15, 29, 42, 20 };
    int[] exitTimes = { 35, 37, 91, 33, 53, 32, 85, 56, 51, 49, 63, 87, 37, 23, 39, 37, 65, 63, 45, 49, 38, 52, 67, 48, 52 };
    int speedTime = 53;
    int fineCap = 788;
    assertArrayEquals(new int[] { 11143, 17593 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case53() {
    int[] enterTimes = { 100, 200, 300 };
    int[] exitTimes = { 150, 250, 350 };
    int speedTime = 30;
    int fineCap = 10000;
    assertArrayEquals(new int[] { 0, 0 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case54() {
    int[] enterTimes = { 204, 142, 273, 260, 182, 309, 223, 329, 217, 392, 158, 200, 110, 256, 343, 4, 44, 283, 207, 137, 107, 378, 64, 79, 315, 315, 222, 381, 229, 370, 3, 132, 286, 327, 54, 168, 370, 397, 254, 332, 338, 251, 307, 280, 26, 5, 337, 304, 108, 98 };
    int[] exitTimes = { 210, 235, 281, 357, 236, 348, 237, 407, 275, 413, 160, 251, 202, 344, 400, 51, 73, 291, 291, 232, 135, 385, 90, 105, 337, 374, 275, 393, 266, 372, 95, 207, 330, 418, 151, 224, 388, 429, 288, 392, 417, 285, 314, 303, 66, 83, 381, 358, 162, 157 };
    int speedTime = 50;
    int fineCap = 1000;
    assertArrayEquals(new int[] { 4317, 38603 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case55() {
    int[] enterTimes = { 250, 279, 306, 966, 329, 256, 116, 117, 103, 58, 301, 313, 937, 300, 663, 68, 102, 6, 249, 667, 237, 582, 167, 22, 91, 221, 103, 165, 648, 310, 263, 554, 82, 177, 717, 386, 96, 652, 37, 232, 114, 6, 58, 160, 409, 275, 277, 227, 439, 41 };
    int[] exitTimes = { 824, 722, 893, 982, 392, 566, 251, 835, 862, 872, 171, 354, 971, 298, 485, 481, 759, 350, 520, 459, 802, 576, 539, 223, 754, 113, 443, 769, 349, 310, 909, 28, 667, 910, 877, 174, 347, 997, 528, 160, 674, 482, 465, 332, 205, 346, 465, 502, 646, 630 };
    int speedTime = 333;
    int fineCap = 10000;
    assertArrayEquals(new int[] { 159766, 411253 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case56() {
    int[] enterTimes = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int[] exitTimes = { 5, 6, 7, 8, 10, 9, 11, 12, 13, 14 };
    int speedTime = 4;
    int fineCap = 10000;
    assertArrayEquals(new int[] { 0, 63 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case57() {
    int[] enterTimes = { 0, 1, 2, 3, 4, 5, 6 };
    int[] exitTimes = { 10, 11, 12, 13, 14, 15, 16 };
    int speedTime = 11;
    int fineCap = 3;
    assertArrayEquals(new int[] { 3, 18 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case58() {
    int[] enterTimes = { 71, 41, 36, 93, 40, 26, 37, 79, 31, 14, 77, 59, 41, 50, 37, 38, 32, 25, 38, 33, 73, 55, 35, 81, 62, 42, 26, 56, 32, 41, 49, 50, 37, 61, 65, 74, 10, 51, 60, 70, 74, 41, 80, 61, 66, 65, 67, 22, 59, 37 };
    int[] exitTimes = { 117, 101, 69, 56, 102, 122, 73, 107, 106, 84, 67, 96, 158, 145, 114, 88, 64, 134, 88, 79, 62, 80, 85, 82, 93, 151, 96, 82, 106, 136, 109, 81, 80, 140, 65, 104, 111, 56, 122, 103, 94, 88, 121, 124, 104, 98, 80, 85, 132, 110 };
    int speedTime = 20;
    int fineCap = 10000;
    assertArrayEquals(new int[] { 0, 4853 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case59() {
    int[] enterTimes = { 0, 500 };
    int[] exitTimes = { 500, 1000 };
    int speedTime = 1;
    int fineCap = 10000;
    assertArrayEquals(new int[] { 0, 0 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case60() {
    int[] enterTimes = { 0, 500 };
    int[] exitTimes = { 502, 1000 };
    int speedTime = 1000;
    int fineCap = 10000;
    assertArrayEquals(new int[] { 10000, 20000 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case61() {
    int[] enterTimes = { 0, 1, 2, 3, 4, 5 };
    int[] exitTimes = { 1, 2, 3, 4, 5, 6 };
    int speedTime = 10;
    int fineCap = 10000;
    assertArrayEquals(new int[] { 486, 486 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case62() {
    int[] enterTimes = { 5 };
    int[] exitTimes = { 5 };
    int speedTime = 2;
    int fineCap = 100;
    assertArrayEquals(new int[] {  }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case63() {
    int[] enterTimes = { 1, 2 };
    int[] exitTimes = { 9, 10 };
    int speedTime = 10;
    int fineCap = 4;
    assertArrayEquals(new int[] { 5, 8 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case64() {
    int[] enterTimes = { 1, 2, 3 };
    int[] exitTimes = { 1, 1, 4 };
    int speedTime = 30;
    int fineCap = 10000;
    assertArrayEquals(new int[] {  }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case65() {
    int[] enterTimes = { 93, 96, 87, 25, 103, 45, 96, 102, 59, 31, 72, 37, 100, 69, 73, 36, 50, 36, 82, 46, 21, 78, 77, 39, 92, 40, 72, 33, 77, 45, 39, 12, 32, 68, 79, 77, 103, 66, 21, 52, 39, 83, 31, 29, 94, 47, 108, 34, 25, 80 };
    int[] exitTimes = { 43, 56, 121, 110, 86, 103, 92, 100, 126, 111, 35, 55, 114, 57, 66, 35, 76, 59, 43, 87, 54, 125, 112, 75, 44, 97, 64, 94, 73, 80, 117, 38, 106, 108, 118, 114, 33, 81, 84, 129, 62, 90, 106, 98, 69, 42, 56, 116, 124, 69 };
    int speedTime = 10;
    int fineCap = 1000;
    assertArrayEquals(new int[] { 0, 1736 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case66() {
    int[] enterTimes = { 100 };
    int[] exitTimes = { 100 };
    int speedTime = 100;
    int fineCap = 100;
    assertArrayEquals(new int[] {  }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

  @Test
  public void case67() {
    int[] enterTimes = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    int[] exitTimes = { 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 };
    int speedTime = 75;
    int fineCap = 1000;
    assertArrayEquals(new int[] { 18328, 43000 }, radarguns.getRange(enterTimes, exitTimes, speedTime, fineCap));
  }

}
