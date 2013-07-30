package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class WindowWasherTest {
  WindowWasher windowwasher = new WindowWasher();

  @Test
  public void case1() {
    int width = 10;
    int height = 10;
    int[] washTimes = { 60 };
    assertEquals(6000, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case2() {
    int width = 10;
    int height = 10;
    int[] washTimes = { 60, 60 };
    assertEquals(3000, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case3() {
    int width = 10;
    int height = 10;
    int[] washTimes = { 60, 30 };
    assertEquals(2100, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case4() {
    int width = 1000;
    int height = 1000;
    int[] washTimes = { 1000 };
    assertEquals(1000000000, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case5() {
    int width = 421;
    int height = 936;
    int[] washTimes = { 111, 56, 931, 22, 445, 90, 14, 222 };
    assertEquals(2450448, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case6() {
    int width = 25;
    int height = 25;
    int[] washTimes = { 1, 625 };
    assertEquals(625, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case7() {
    int width = 526;
    int height = 239;
    int[] washTimes = { 75, 773, 812, 535, 985 };
    assertEquals(6739800, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case8() {
    int width = 703;
    int height = 648;
    int[] washTimes = { 510, 992, 957, 825, 276, 480, 871, 874, 476, 585, 589, 958, 917, 500, 433, 386, 652, 521, 669, 416, 465, 431, 627, 221, 346, 695, 580, 261, 177, 688, 212, 581 };
    assertEquals(6755400, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case9() {
    int width = 454;
    int height = 801;
    int[] washTimes = { 705, 446, 393, 176, 403, 733, 950, 181, 755 };
    assertEquals(15507360, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case10() {
    int width = 529;
    int height = 427;
    int[] washTimes = { 579, 75, 730, 299, 582, 296, 229, 382, 870, 730, 493, 341, 769, 114, 280, 568, 497, 173 };
    assertEquals(3682875, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case11() {
    int width = 815;
    int height = 937;
    int[] washTimes = { 842, 58, 822, 825, 294, 167, 986, 590, 184, 673, 716, 311, 669, 665, 311, 229, 687, 267, 566, 378, 291, 790, 26 };
    assertEquals(7173672, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case12() {
    int width = 724;
    int height = 5;
    int[] washTimes = { 842, 405, 598, 845, 813, 85, 146, 887, 612, 818, 760, 204, 350, 982, 273, 737, 889, 562, 572, 390 };
    assertEquals(69615, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case13() {
    int width = 779;
    int height = 359;
    int[] washTimes = { 117, 88, 29, 264, 463, 566, 755, 528, 630, 4, 850, 570, 625, 471, 936, 926, 5, 138, 464, 295, 768, 166, 749, 758, 362, 797, 517, 889, 943, 774, 462, 702, 554, 67, 723, 622 };
    assertEquals(495420, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case14() {
    int width = 427;
    int height = 137;
    int[] washTimes = { 953, 373, 987, 918, 838, 395, 925, 5, 69, 971, 113, 836, 807, 340, 681, 905, 776, 973 };
    assertEquals(244545, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case15() {
    int width = 526;
    int height = 885;
    int[] washTimes = { 283, 965, 820, 893, 538, 97, 835, 226, 550, 130, 625, 913, 990, 110, 47, 527, 846, 122, 376, 112, 1, 384, 487, 191, 236 };
    assertEquals(430995, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case16() {
    int width = 735;
    int height = 408;
    int[] washTimes = { 896, 140, 602, 120, 159, 827, 999, 397, 631 };
    assertEquals(9783024, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case17() {
    int width = 491;
    int height = 85;
    int[] washTimes = { 181, 626, 330, 990, 634, 232, 87, 610, 172, 999, 721, 619, 28, 531, 815, 217, 778, 235, 88, 899, 50, 761, 594, 348, 293, 98, 581, 253, 964, 217, 98, 822 };
    assertEquals(261800, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case18() {
    int width = 867;
    int height = 129;
    int[] washTimes = { 82, 40, 379, 380, 728, 360, 131, 697, 528, 944, 575 };
    assertEquals(1861728, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case19() {
    int width = 989;
    int height = 387;
    int[] washTimes = { 943, 48, 831, 74, 267, 6, 915, 549, 860, 461, 477 };
    assertEquals(1784070, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case20() {
    int width = 426;
    int height = 446;
    int[] washTimes = { 794, 469, 627, 317, 916, 144, 165, 288, 823, 831, 924, 408, 769, 724, 451, 177, 446, 129, 488, 376, 853, 481, 531, 223, 838, 968, 792, 649, 542, 577, 683, 32, 654, 342, 235, 704 };
    assertEquals(1676960, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case21() {
    int width = 820;
    int height = 155;
    int[] washTimes = { 45, 293, 426, 642, 871, 100, 160, 139, 431, 142, 481, 841, 311, 917 };
    assertEquals(1803735, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case22() {
    int width = 12;
    int height = 754;
    int[] washTimes = { 728, 734, 147, 464, 6, 703, 254 };
    assertEquals(54288, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case23() {
    int width = 264;
    int height = 729;
    int[] washTimes = { 406, 84, 279, 49, 884, 426, 50, 452, 534, 806, 464, 541, 551, 831, 924, 330, 982, 10, 456, 954, 815, 39, 351, 950, 758, 177, 271, 369, 396, 349, 825, 248, 671, 561, 215, 128, 125, 223, 205, 246, 903, 978, 374, 832, 810, 505 };
    assertEquals(729000, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case24() {
    int width = 418;
    int height = 191;
    int[] washTimes = { 767, 221, 436, 468, 687, 753, 618, 114, 302, 760, 135, 882, 683, 126, 652, 59, 207, 336, 875, 61, 140, 488, 727, 270, 3, 864, 488, 49, 220, 610, 221, 448, 872, 31, 748, 347, 727, 972, 582, 281, 149, 865, 898, 666 };
    assertEquals(159103, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case25() {
    int width = 591;
    int height = 642;
    int[] washTimes = { 406, 582, 467, 714, 864, 241, 481, 57, 391, 189, 542, 452, 299, 756, 469, 691, 46, 859, 596, 807, 555, 899, 597, 301, 449, 520, 839, 242, 279, 677, 724, 639, 326, 84, 146, 815, 612, 942, 393 };
    assertEquals(2964114, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case26() {
    int width = 173;
    int height = 822;
    int[] washTimes = { 873, 710, 486, 782, 609, 738, 891, 248, 912, 129, 321, 399, 280 };
    assertEquals(4559634, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case27() {
    int width = 112;
    int height = 625;
    int[] washTimes = { 364, 317, 130, 144, 336, 149, 826, 243, 208, 434, 714, 687, 423, 55, 821, 645, 655, 143, 310, 195, 109, 436, 654, 536, 885, 788, 569 };
    assertEquals(756250, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case28() {
    int width = 823;
    int height = 941;
    int[] washTimes = { 826, 21, 174, 692, 933, 412, 336, 510, 247, 665, 539, 486, 409, 234, 413, 761, 542, 836, 808, 419, 113, 767, 955, 872, 883, 114, 501, 791, 910, 807, 573, 494, 724, 184, 346, 184, 227, 821, 587, 904, 332, 486, 341 };
    assertEquals(5134096, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case29() {
    int width = 423;
    int height = 978;
    int[] washTimes = { 561, 346 };
    assertEquals(88657656, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case30() {
    int width = 243;
    int height = 538;
    int[] washTimes = { 43, 283, 560, 721, 975, 349, 28, 567, 643, 721, 896, 699, 750, 164, 7, 690, 619, 502, 159, 82, 872, 45, 715, 205, 604 };
    assertEquals(484200, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case31() {
    int width = 501;
    int height = 467;
    int[] washTimes = { 999, 380, 166, 574, 667, 774, 32, 704, 692, 878, 699, 418, 359, 360, 224, 989, 387, 82, 146, 92, 729, 819, 800, 135, 876, 246, 94, 91 };
    assertEquals(1783006, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case32() {
    int width = 275;
    int height = 738;
    int[] washTimes = { 556, 918, 207, 282 };
    assertEquals(18106092, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case33() {
    int width = 878;
    int height = 182;
    int[] washTimes = { 829, 656, 434, 185, 533, 393, 660, 898 };
    assertEquals(9162608, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case34() {
    int width = 94;
    int height = 877;
    int[] washTimes = { 829, 316, 923, 955 };
    assertEquals(12951536, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case35() {
    int width = 629;
    int height = 658;
    int[] washTimes = { 397, 545, 697, 783, 981, 106, 484, 759, 543, 902, 710, 535, 429, 77, 18, 697 };
    assertEquals(4204620, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case36() {
    int width = 962;
    int height = 615;
    int[] washTimes = { 985, 914, 124, 781, 416, 534, 624, 671, 609, 329, 458, 719, 336, 615, 212, 1000, 648, 773, 296, 255, 111, 561, 32, 694, 779, 214, 849, 186, 703, 611, 256, 722, 702, 995, 500, 338, 764, 672, 559, 301 };
    assertEquals(4753950, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case37() {
    int width = 412;
    int height = 212;
    int[] washTimes = { 512, 615, 181, 289, 235, 850, 200, 81, 57, 725, 784, 390, 950, 675, 232, 372, 369, 805, 884, 799, 317, 226, 847, 453, 944, 999, 667, 285, 393, 391, 419, 920, 699, 177, 924, 903, 475, 657, 589, 276, 916, 224, 905, 535, 197, 455, 887 };
    assertEquals(676704, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case38() {
    int width = 258;
    int height = 462;
    int[] washTimes = { 980, 297, 276, 775, 259, 42, 803, 335, 322, 283, 201, 578, 447, 258, 24, 315, 175, 819, 209, 158, 260, 129, 206, 604, 199, 599, 470, 16, 462, 575, 449, 710, 379, 26, 333, 474, 177, 45 };
    assertEquals(434280, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case39() {
    int width = 618;
    int height = 545;
    int[] washTimes = { 544, 436, 990, 519, 54, 635 };
    assertEquals(12448890, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case40() {
    int width = 623;
    int height = 671;
    int[] washTimes = { 515, 425, 636, 264, 632, 49, 223, 514, 649, 376, 553, 100, 488, 529, 160, 710, 857, 294, 13, 636, 198, 751, 387, 674, 353, 49, 239, 796 };
    assertEquals(2268651, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case41() {
    int width = 586;
    int height = 167;
    int[] washTimes = { 154, 502, 951, 827, 402, 186, 39, 644, 533, 653, 389, 845, 170, 217, 444, 496, 534, 833, 969, 323, 628, 749, 711, 500, 679 };
    assertEquals(1208412, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case42() {
    int width = 24;
    int height = 373;
    int[] washTimes = { 583, 179, 8, 709, 820, 8, 832, 786, 456, 628, 411, 15, 707, 880, 830, 721, 767, 980, 789, 182, 789, 395, 193, 96, 496, 568, 797, 922, 22, 980, 361, 920, 822, 464, 368, 800, 730, 251, 58, 239, 198, 164, 912, 871, 596, 360, 287, 180 };
    assertEquals(24618, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case43() {
    int width = 294;
    int height = 224;
    int[] washTimes = { 527, 874 };
    assertEquals(21720832, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case44() {
    int width = 505;
    int height = 283;
    int[] washTimes = { 937, 379, 867, 916, 710, 476, 93, 228, 745, 903, 130, 484, 833, 565, 228, 331, 894, 280, 881, 694, 561, 727, 324, 439, 382, 49, 782, 447, 654, 17, 375, 238, 704, 394, 284, 923, 793, 341, 368, 400 };
    assertEquals(845887, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case45() {
    int width = 655;
    int height = 651;
    int[] washTimes = { 779, 178, 238, 204, 157, 931, 440, 397, 27, 425, 655, 809, 322, 603, 338, 53, 964, 71, 181, 309, 658, 565, 537, 127, 250, 326 };
    assertEquals(3080532, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case46() {
    int width = 122;
    int height = 260;
    int[] washTimes = { 953, 872, 318, 412, 817 };
    assertEquals(3611140, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case47() {
    int width = 580;
    int height = 36;
    int[] washTimes = { 983 };
    assertEquals(20525040, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case48() {
    int width = 230;
    int height = 465;
    int[] washTimes = { 461, 113, 611, 348, 120, 790, 443, 855, 415, 500 };
    assertEquals(3295920, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case49() {
    int width = 501;
    int height = 685;
    int[] washTimes = { 182, 501, 74, 688, 321, 587, 894, 347, 750, 1, 190, 327, 700, 53, 408, 150, 52, 356, 409, 23, 975, 81, 981, 505, 675, 897, 42, 89, 942, 618, 636, 610, 768, 576 };
    assertEquals(295235, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case50() {
    int width = 977;
    int height = 677;
    int[] washTimes = { 314, 923, 826, 925, 459, 344, 716, 60, 408, 590, 104, 112, 973, 521, 157, 652, 711, 835, 713, 683, 524, 276, 570, 18, 437, 972, 372, 101, 872 };
    assertEquals(4508820, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case51() {
    int width = 412;
    int height = 298;
    int[] washTimes = { 485, 672, 516, 549, 426, 859, 991, 769, 477, 252, 560, 593, 717, 657, 946, 819, 65, 255, 257, 148, 720, 620, 270, 994, 100, 420 };
    assertEquals(1627080, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case52() {
    int width = 464;
    int height = 220;
    int[] washTimes = { 609, 882, 866, 608, 268, 646, 488, 189, 401, 689, 582, 428 };
    assertEquals(3950320, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case53() {
    int width = 794;
    int height = 579;
    int[] washTimes = { 420 };
    assertEquals(193084920, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case54() {
    int width = 783;
    int height = 771;
    int[] washTimes = { 979, 586, 257, 888, 853, 179, 804, 437, 477, 497, 815, 790, 928, 904, 811, 455, 274, 61, 179, 86, 380, 679, 512, 193, 925, 277, 825, 445, 304, 991, 475, 411, 938, 19, 824, 365, 895, 602, 765, 79, 562, 574, 656, 173, 888, 228, 534, 289, 493, 994 };
    assertEquals(3174207, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case55() {
    int width = 915;
    int height = 624;
    int[] washTimes = { 858, 913, 460, 842, 926, 555, 342, 220, 292, 190, 38 };
    assertEquals(11263200, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case56() {
    int width = 901;
    int height = 71;
    int[] washTimes = { 845, 474, 546, 897, 406, 996, 93, 915, 423, 861, 778, 3, 912, 327, 452, 627, 391, 909, 133, 679, 756, 596, 750, 130, 963, 978, 554, 137, 639, 6, 86, 494, 603, 129, 991, 79, 441, 286, 405, 105, 996, 187, 96, 991, 644, 169, 312, 231, 749 };
    assertEquals(99258, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case57() {
    int width = 12;
    int height = 754;
    int[] washTimes = { 728, 734, 147, 464, 6, 703, 254 };
    assertEquals(54288, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case58() {
    int width = 22;
    int height = 22;
    int[] washTimes = { 728, 34, 147, 464, 66, 703, 254 };
    assertEquals(9702, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case59() {
    int width = 421;
    int height = 936;
    int[] washTimes = { 111, 56, 931, 22, 445, 90, 14, 222 };
    assertEquals(2450448, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case60() {
    int width = 332;
    int height = 323;
    int[] washTimes = { 728, 34, 147, 464, 66, 703, 254 };
    assertEquals(1801048, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case61() {
    int width = 10;
    int height = 10;
    int[] washTimes = { 1, 1000 };
    assertEquals(100, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case62() {
    int width = 2;
    int height = 754;
    int[] washTimes = { 728, 734, 147, 464, 6, 703, 254 };
    assertEquals(9048, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case63() {
    int width = 12;
    int height = 754;
    int[] washTimes = { 728, 734, 147, 464, 6, 703, 254 };
    assertEquals(54288, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case64() {
    int width = 22;
    int height = 22;
    int[] washTimes = { 728, 34, 147, 464, 66, 703, 254 };
    assertEquals(9702, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case65() {
    int width = 421;
    int height = 936;
    int[] washTimes = { 111, 56, 931, 22, 445, 90, 14, 222 };
    assertEquals(2450448, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case66() {
    int width = 332;
    int height = 323;
    int[] washTimes = { 728, 34, 147, 464, 66, 703, 254 };
    assertEquals(1801048, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case67() {
    int width = 10;
    int height = 10;
    int[] washTimes = { 1, 1000 };
    assertEquals(100, windowwasher.fastest(width, height, washTimes));
  }

  @Test
  public void case68() {
    int width = 2;
    int height = 754;
    int[] washTimes = { 728, 734, 147, 464, 6, 703, 254 };
    assertEquals(9048, windowwasher.fastest(width, height, washTimes));
  }

}
