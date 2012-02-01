package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class CoinReversingTest {
  double DELTA = 1.0e-09;
  CoinReversing coinreversing = new CoinReversing();

  @Test
  public void case1() {
    int N = 3;
    int[] a = { 2, 2 };
    assertEquals(1.6666666666666667, coinreversing.expectedHeads(N, a), DELTA * 1.6666666666666667);
  }

  @Test
  public void case2() {
    int N = 10;
    int[] a = { 10, 10, 10 };
    assertEquals(0.0, coinreversing.expectedHeads(N, a), DELTA);
  }

  @Test
  public void case3() {
    int N = 10;
    int[] a = { 2, 7, 1, 8, 2, 8 };
    assertEquals(4.792639999999999, coinreversing.expectedHeads(N, a), DELTA * 4.792639999999999);
  }

  @Test
  public void case4() {
    int N = 1000;
    int[] a = { 916, 153, 357, 729, 183, 848, 61, 672, 295, 936 };
    assertEquals(498.1980774932278, coinreversing.expectedHeads(N, a), DELTA * 498.1980774932278);
  }

  @Test
  public void case5() {
    int N = 50;
    int[] a = { 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
    assertEquals(50.0, coinreversing.expectedHeads(N, a), DELTA * 50.0);
  }

  @Test
  public void case6() {
    int N = 50;
    int[] a = { 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
    assertEquals(0.0, coinreversing.expectedHeads(N, a), DELTA);
  }

  @Test
  public void case7() {
    int N = 50;
    int[] a = { 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 49, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
    assertEquals(49.0, coinreversing.expectedHeads(N, a), DELTA * 49.0);
  }

  @Test
  public void case8() {
    int N = 1000;
    int[] a = { 1, 999 };
    assertEquals(1.998000000000002, coinreversing.expectedHeads(N, a), DELTA * 1.998000000000002);
  }

  @Test
  public void case9() {
    int N = 999;
    int[] a = { 333, 333, 333 };
    assertEquals(518.0000000000001, coinreversing.expectedHeads(N, a), DELTA * 518.0000000000001);
  }

  @Test
  public void case10() {
    int N = 1000;
    int[] a = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
    assertEquals(1000.0, coinreversing.expectedHeads(N, a), DELTA * 1000.0);
  }

  @Test
  public void case11() {
    int N = 1000;
    int[] a = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
    assertEquals(0.0, coinreversing.expectedHeads(N, a), DELTA);
  }

  @Test
  public void case12() {
    int N = 1000;
    int[] a = { 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999, 999 };
    assertEquals(952.3734090020178, coinreversing.expectedHeads(N, a), DELTA * 952.3734090020178);
  }

  @Test
  public void case13() {
    int N = 1000;
    int[] a = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(952.3734090020166, coinreversing.expectedHeads(N, a), DELTA * 952.3734090020166);
  }

  @Test
  public void case14() {
    int N = 1;
    int[] a = { 1 };
    assertEquals(0.0, coinreversing.expectedHeads(N, a), DELTA);
  }

  @Test
  public void case15() {
    int N = 1;
    int[] a = { 1, 1 };
    assertEquals(1.0, coinreversing.expectedHeads(N, a), DELTA * 1.0);
  }

  @Test
  public void case16() {
    int N = 997;
    int[] a = { 997, 996, 996, 996, 505, 635, 899, 747, 830, 506, 243, 69, 789, 389, 567, 316, 11, 511, 630, 299, 241, 320, 982, 705, 657, 534, 181, 27, 659, 658, 196, 674, 307, 843, 318, 798, 466, 350, 577, 294, 859, 333, 476, 520, 664, 828, 691, 291, 131, 331 };
    assertEquals(498.5, coinreversing.expectedHeads(N, a), DELTA * 498.5);
  }

  @Test
  public void case17() {
    int N = 1000;
    int[] a = { 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500 };
    assertEquals(500.0, coinreversing.expectedHeads(N, a), DELTA * 500.0);
  }

  @Test
  public void case18() {
    int N = 61;
    int[] a = { 37, 38, 41, 20, 53, 9, 17, 22, 33, 8, 51, 43, 22, 13, 14, 2, 43 };
    assertEquals(30.500006705198714, coinreversing.expectedHeads(N, a), DELTA * 30.500006705198714);
  }

  @Test
  public void case19() {
    int N = 841;
    int[] a = { 241, 107, 81, 747, 171, 673, 40, 203 };
    assertEquals(434.48971336022606, coinreversing.expectedHeads(N, a), DELTA * 434.48971336022606);
  }

  @Test
  public void case20() {
    int N = 780;
    int[] a = { 438, 697, 191, 671, 171, 362, 52, 3, 286, 445, 723, 332, 753, 510, 101, 200, 400, 78, 104, 327, 270, 561, 734, 544, 301, 493, 268, 705, 279, 236, 569, 347, 117, 325, 735, 386, 472, 180 };
    assertEquals(390.0, coinreversing.expectedHeads(N, a), DELTA * 390.0);
  }

  @Test
  public void case21() {
    int N = 293;
    int[] a = { 167, 125, 4, 106, 123, 68, 233, 244, 185, 272, 279, 279, 277, 26, 25, 40, 278, 123, 82, 254, 26, 287, 163, 202, 195, 89, 251 };
    assertEquals(146.49999967742565, coinreversing.expectedHeads(N, a), DELTA * 146.49999967742565);
  }

  @Test
  public void case22() {
    int N = 872;
    int[] a = { 237, 132, 247, 382, 582, 54, 19, 450, 551, 794, 704, 423, 689, 202, 724, 12, 613, 160, 366, 396, 38, 603, 109 };
    assertEquals(435.99999994709447, coinreversing.expectedHeads(N, a), DELTA * 435.99999994709447);
  }

  @Test
  public void case23() {
    int N = 700;
    int[] a = { 372, 188, 103, 579, 546, 434, 566, 495, 513, 270, 168, 149, 409, 625, 604, 446, 614, 111, 474, 494, 257, 499, 420, 606, 161, 351, 538, 6, 217, 635, 414, 73, 506, 274, 215 };
    assertEquals(350.0000000000002, coinreversing.expectedHeads(N, a), DELTA * 350.0000000000002);
  }

  @Test
  public void case24() {
    int N = 569;
    int[] a = { 502, 233, 188, 234, 483, 370, 190, 367, 533, 19, 52, 511, 153, 111, 59, 472, 285, 205, 465, 437, 278, 448, 32, 374, 456, 237, 19, 55, 210 };
    assertEquals(284.4999999999546, coinreversing.expectedHeads(N, a), DELTA * 284.4999999999546);
  }

  @Test
  public void case25() {
    int N = 811;
    int[] a = { 121, 364, 551, 234, 755, 291, 599, 519, 595, 747, 73, 569, 758, 315, 40, 106, 781, 809, 17, 638, 431, 60, 327, 549, 91, 72, 794, 504, 414, 481, 547, 568, 21, 81, 300, 515, 183, 116, 224, 775, 640, 295, 411, 532, 125, 64, 751, 141, 311 };
    assertEquals(405.5, coinreversing.expectedHeads(N, a), DELTA * 405.5);
  }

  @Test
  public void case26() {
    int N = 484;
    int[] a = { 187, 212, 268, 224, 340, 132, 390, 105, 33, 327, 265, 363, 36, 26, 254 };
    assertEquals(241.99999811419684, coinreversing.expectedHeads(N, a), DELTA * 241.99999811419684);
  }

  @Test
  public void case27() {
    int N = 215;
    int[] a = { 193, 144, 160, 59, 75, 163, 74, 199, 24 };
    assertEquals(107.29430628220605, coinreversing.expectedHeads(N, a), DELTA * 107.29430628220605);
  }

  @Test
  public void case28() {
    int N = 917;
    int[] a = { 632, 857, 396, 799, 915, 388, 882, 564, 441, 484, 528, 595, 42, 835, 475, 773, 23, 354, 542, 589, 646, 656, 279, 776, 817, 755, 231, 533, 47, 914 };
    assertEquals(458.49999999998283, coinreversing.expectedHeads(N, a), DELTA * 458.49999999998283);
  }

  @Test
  public void case29() {
    int N = 323;
    int[] a = { 265, 285, 26, 244, 174, 57, 54, 25, 67, 170, 229, 96, 19, 262, 269, 235, 299, 39, 165 };
    assertEquals(161.4999883843944, coinreversing.expectedHeads(N, a), DELTA * 161.4999883843944);
  }

  @Test
  public void case30() {
    int N = 549;
    int[] a = { 104, 182, 508, 301, 106, 277, 396, 70, 14, 514, 408 };
    assertEquals(274.50350251014817, coinreversing.expectedHeads(N, a), DELTA * 274.50350251014817);
  }

  @Test
  public void case31() {
    int N = 900;
    int[] a = { 423, 251, 299, 153, 636, 374, 535, 717, 118, 768, 393, 41, 399, 243, 243, 697, 433, 153, 249, 25, 174, 855, 848, 845, 857, 600, 409, 697, 874, 410, 120, 250, 299, 883, 31, 391, 864, 767, 346, 256, 2, 652, 256, 72, 812 };
    assertEquals(450.0, coinreversing.expectedHeads(N, a), DELTA * 450.0);
  }

  @Test
  public void case32() {
    int N = 982;
    int[] a = { 357, 454, 173, 513, 403, 234, 410, 563, 265, 91, 428, 307 };
    assertEquals(491.0000119900232, coinreversing.expectedHeads(N, a), DELTA * 491.0000119900232);
  }

  @Test
  public void case33() {
    int N = 891;
    int[] a = { 806, 225, 882 };
    assertEquals(620.324660748903, coinreversing.expectedHeads(N, a), DELTA * 620.324660748903);
  }

  @Test
  public void case34() {
    int N = 489;
    int[] a = { 324, 371, 316, 294, 29, 421, 218, 337, 455, 197, 106, 180, 198, 431, 234, 259, 206, 170, 77, 154, 10, 77, 298, 280, 442, 420, 308, 198, 216, 371, 451, 37, 233, 112, 471, 456, 288, 85, 448, 178, 20, 147, 259, 385, 81, 103, 3 };
    assertEquals(244.5, coinreversing.expectedHeads(N, a), DELTA * 244.5);
  }

  @Test
  public void case35() {
    int N = 285;
    int[] a = { 261, 255, 151, 2, 25, 73, 233, 89, 268, 243, 62, 116, 197, 230, 267, 207, 280, 101, 165, 152, 151, 94, 267, 62, 195, 25, 248, 203, 155, 1, 85, 54, 65, 92, 137, 244 };
    assertEquals(142.50000000000105, coinreversing.expectedHeads(N, a), DELTA * 142.50000000000105);
  }

  @Test
  public void case36() {
    int N = 738;
    int[] a = { 616, 51, 380, 418, 711, 44, 302, 733, 451, 314, 458, 366, 101, 485, 678, 734, 573, 296, 613, 595, 2, 170, 137, 288, 225, 575 };
    assertEquals(369.00000000108105, coinreversing.expectedHeads(N, a), DELTA * 369.00000000108105);
  }

  @Test
  public void case37() {
    int N = 758;
    int[] a = { 152, 10, 644, 54, 593, 586, 13, 698, 472, 469, 460, 741, 659, 269, 118, 641, 5, 144, 54, 501, 448, 450, 687, 675, 414, 267, 136, 521, 397, 414, 129, 324, 61, 27, 468, 298, 715, 546, 289, 543, 79, 566, 404 };
    assertEquals(379.0, coinreversing.expectedHeads(N, a), DELTA * 379.0);
  }

  @Test
  public void case38() {
    int N = 651;
    int[] a = { 539, 211, 214, 228, 552, 490, 558, 570 };
    assertEquals(324.0460086323926, coinreversing.expectedHeads(N, a), DELTA * 324.0460086323926);
  }

  @Test
  public void case39() {
    int N = 281;
    int[] a = { 86, 51, 81, 149, 141, 244, 265, 31, 100, 229, 182, 217, 90, 239, 173, 280, 110, 199, 152, 60, 224, 56, 40, 216, 106, 102, 233, 82, 173, 230, 74, 89, 81, 43, 50 };
    assertEquals(140.49999999999986, coinreversing.expectedHeads(N, a), DELTA * 140.49999999999986);
  }

  @Test
  public void case40() {
    int N = 278;
    int[] a = { 96, 72, 166, 107, 156, 34, 186, 27, 106 };
    assertEquals(138.99446131534035, coinreversing.expectedHeads(N, a), DELTA * 138.99446131534035);
  }

  @Test
  public void case41() {
    int N = 515;
    int[] a = { 439, 375, 270, 493, 296, 255, 162, 194, 263, 187, 379, 409, 137, 424, 304, 330, 87, 76, 513, 56, 16, 173, 168, 181, 157, 515, 233, 261, 169, 170, 357, 256, 409, 188, 4, 509, 493, 9, 88 };
    assertEquals(257.5, coinreversing.expectedHeads(N, a), DELTA * 257.5);
  }

  @Test
  public void case42() {
    int N = 896;
    int[] a = { 5, 367, 719, 238, 681, 346, 668, 507, 418, 565, 61, 411, 508, 864, 631, 294, 738, 505, 566, 515, 197, 347, 755, 405, 373, 475, 642, 316 };
    assertEquals(447.9999999999999, coinreversing.expectedHeads(N, a), DELTA * 447.9999999999999);
  }

  @Test
  public void case43() {
    int N = 540;
    int[] a = { 487, 289, 76, 366, 432, 295, 128, 386, 286, 161, 392, 336, 405, 31, 115, 492, 150, 163, 364, 401, 204, 382, 127, 82, 173, 207, 504, 121, 131, 103, 152, 273, 205 };
    assertEquals(270.0000000000004, coinreversing.expectedHeads(N, a), DELTA * 270.0000000000004);
  }

  @Test
  public void case44() {
    int N = 737;
    int[] a = { 154, 308, 43, 67, 602, 71, 553, 722, 75, 14, 377, 570, 550, 673, 604, 506, 572, 534, 470, 580, 325, 445, 60, 261, 172, 292, 304, 132, 108, 62, 172, 183, 336, 272, 33, 83, 526, 457, 32, 32, 137, 490, 505, 332, 710, 134, 107, 326, 42 };
    assertEquals(368.5, coinreversing.expectedHeads(N, a), DELTA * 368.5);
  }

  @Test
  public void case45() {
    int N = 760;
    int[] a = { 284, 489, 39, 56, 29, 238, 230, 716, 31, 244 };
    assertEquals(380.83432466596696, coinreversing.expectedHeads(N, a), DELTA * 380.83432466596696);
  }

  @Test
  public void case46() {
    int N = 701;
    int[] a = { 368, 255, 260, 18, 677, 487, 477 };
    assertEquals(350.6529184466516, coinreversing.expectedHeads(N, a), DELTA * 350.6529184466516);
  }

  @Test
  public void case47() {
    int N = 851;
    int[] a = { 677, 111, 606, 488, 149, 200, 646, 464, 510, 231, 600, 453, 513, 43, 650, 695, 815, 158, 471, 273, 457, 735, 441, 357, 410, 178, 669, 168, 732, 244, 428, 711, 512, 675 };
    assertEquals(425.5, coinreversing.expectedHeads(N, a), DELTA * 425.5);
  }

  @Test
  public void case48() {
    int N = 990;
    int[] a = { 892, 937, 23, 537, 412, 951, 315, 634, 501, 725, 620, 908, 908, 603, 964, 903, 405, 349, 836, 318, 474, 407, 938, 350, 54, 882, 465, 830, 50, 84, 866, 240, 28, 490, 665, 104, 471, 769, 979, 309, 210, 478, 210, 844, 666, 362, 910, 701, 917, 210 };
    assertEquals(495.0, coinreversing.expectedHeads(N, a), DELTA * 495.0);
  }

  @Test
  public void case49() {
    int N = 921;
    int[] a = { 82, 146, 779, 529, 273, 859, 160, 181, 390, 799, 19, 867, 455, 385, 905, 621, 459, 714, 76, 148, 382, 556, 715, 74, 762, 553, 836, 588, 300, 768, 743, 103, 35, 612, 182, 897, 137, 238, 565, 691, 244, 901, 779, 882, 296, 156, 681, 898 };
    assertEquals(460.5, coinreversing.expectedHeads(N, a), DELTA * 460.5);
  }

  @Test
  public void case50() {
    int N = 972;
    int[] a = { 72, 322, 775, 829, 803, 668, 179, 903, 202, 897, 822, 965, 635, 635, 192, 773, 129, 812, 693, 163, 530, 425, 665, 682, 938, 878, 628, 717, 964, 287, 247, 443, 179, 775, 892, 848, 58, 580, 750, 339, 529, 947, 268, 291, 323, 643, 232, 912 };
    assertEquals(486.0000000000002, coinreversing.expectedHeads(N, a), DELTA * 486.0000000000002);
  }

  @Test
  public void case51() {
    int N = 941;
    int[] a = { 251, 337, 21, 388, 403, 381, 243, 407, 478, 265, 172, 529, 915, 409, 449, 105, 837, 305, 186, 366, 914, 104, 886, 580, 405, 829, 11, 712, 470, 848, 210, 857, 927, 334, 310, 557, 2, 477, 859, 509, 90, 179, 634, 222, 114, 275, 276, 593, 508, 555 };
    assertEquals(470.5, coinreversing.expectedHeads(N, a), DELTA * 470.5);
  }

  @Test
  public void case52() {
    int N = 934;
    int[] a = { 619, 771, 868, 389, 301, 721, 130, 891, 81, 38, 693, 76, 554, 738, 79, 445, 230, 484, 52, 65, 199, 762, 444, 322, 263, 72, 317, 223, 851, 283, 520, 664, 157, 860, 72, 453, 797, 450, 634, 923, 315, 51, 822, 155, 644, 796, 693, 782, 410, 781 };
    assertEquals(467.0, coinreversing.expectedHeads(N, a), DELTA * 467.0);
  }

  @Test
  public void case53() {
    int N = 965;
    int[] a = { 126, 2, 398, 807, 42, 947, 356, 465, 73, 138, 623, 264, 8, 773, 72, 721, 566, 287, 122, 381, 562, 30, 332, 6, 642, 952, 961, 19, 174, 742, 672, 706, 954, 769, 115, 592, 726, 792, 745, 956, 746, 783, 393, 78, 867, 748, 488, 910, 347, 155 };
    assertEquals(482.5, coinreversing.expectedHeads(N, a), DELTA * 482.5);
  }

  @Test
  public void case54() {
    int N = 930;
    int[] a = { 4, 80, 65, 249, 85, 808, 803, 835, 809, 405, 480, 810, 917, 343, 148, 115, 63, 733, 330, 508, 752, 49, 871, 514, 679, 28, 442, 237, 518, 106, 872, 822, 193, 206, 326, 331, 610, 603, 571, 599, 350, 496, 740, 197, 833, 571, 133, 644, 834 };
    assertEquals(465.0, coinreversing.expectedHeads(N, a), DELTA * 465.0);
  }

  @Test
  public void case55() {
    int N = 914;
    int[] a = { 232, 896, 797, 702, 809, 527, 102, 535, 469, 252, 509, 172, 548, 784, 630, 627, 592, 582, 624, 628, 67, 737, 835, 495, 395, 323, 862, 775, 839, 733, 560, 537, 246, 262, 782, 717, 113, 704, 562, 611, 296, 743, 724, 21, 855, 260, 272, 694 };
    assertEquals(457.0, coinreversing.expectedHeads(N, a), DELTA * 457.0);
  }

  @Test
  public void case56() {
    int N = 993;
    int[] a = { 298, 255, 256, 720, 272, 8, 641, 772, 804, 382, 659, 602, 61, 781, 186, 314, 28, 801, 986, 674, 71, 896, 570, 586, 12, 514, 670, 47, 427, 897, 835, 615, 640, 775, 34, 48, 733, 430, 839, 486, 214, 318, 613, 179, 1, 890, 543, 466, 390, 47 };
    assertEquals(496.5, coinreversing.expectedHeads(N, a), DELTA * 496.5);
  }

  @Test
  public void case57() {
    int N = 968;
    int[] a = { 186, 181, 212, 13, 565, 70, 451, 206, 659, 859, 11, 871, 284, 358, 41, 196, 151, 408, 845, 314, 943, 39, 103, 187, 26, 910, 515, 273, 687, 500, 791, 860, 332, 334, 694, 467, 884, 963, 937, 527, 625, 816, 583, 650, 444, 307, 26, 495 };
    assertEquals(484.0, coinreversing.expectedHeads(N, a), DELTA * 484.0);
  }

  @Test
  public void case58() {
    int N = 994;
    int[] a = { 274, 544, 147, 299, 708, 163, 2, 943, 796, 163, 577, 743, 808, 337, 245, 512, 650, 92, 549, 39, 132, 315, 459, 436, 666, 717, 203, 375, 155, 927, 941, 467, 333, 222, 584, 589, 423, 278, 620, 363, 932, 33, 964, 391, 895, 482, 991 };
    assertEquals(497.0, coinreversing.expectedHeads(N, a), DELTA * 497.0);
  }

  @Test
  public void case59() {
    int N = 992;
    int[] a = { 984, 678, 39, 467, 357, 5, 202, 6, 763, 288, 339, 69, 42, 497, 161, 659, 817, 436, 340, 717, 225, 129, 507, 4, 243, 858, 661, 849, 113, 300, 393, 974, 448, 646, 961, 880, 235, 540, 288, 84, 911, 665, 302, 182, 237, 795, 51, 350, 411 };
    assertEquals(496.0, coinreversing.expectedHeads(N, a), DELTA * 496.0);
  }

  @Test
  public void case60() {
    int N = 908;
    int[] a = { 217, 758, 26, 652, 258, 4, 438, 369, 378, 551, 688, 181, 843, 274, 418, 437, 150, 341, 435, 606, 108, 213, 202, 150, 677, 293, 562, 199, 582, 695, 678, 799, 830, 494, 755, 556, 598, 97, 219, 529, 623, 102, 562, 580, 824, 454, 841, 27, 127, 116 };
    assertEquals(454.0, coinreversing.expectedHeads(N, a), DELTA * 454.0);
  }

  @Test
  public void case61() {
    int N = 916;
    int[] a = { 260, 330, 524, 114, 370, 815, 222, 315, 851, 596, 122, 206, 462, 317, 727, 861, 5, 703, 717, 488, 295, 131, 639, 591, 305, 402, 624, 518, 37, 394, 55, 713, 347, 911, 57, 746, 567, 150, 906, 128, 548, 96, 687, 642, 676, 274, 737 };
    assertEquals(458.0, coinreversing.expectedHeads(N, a), DELTA * 458.0);
  }

  @Test
  public void case62() {
    int N = 978;
    int[] a = { 917, 263, 464, 383, 316, 964, 351, 45, 626, 701, 335, 302, 8, 911, 797, 97, 648, 9, 903, 694, 571, 154, 513, 709, 140, 21, 87, 224, 549, 513, 850, 59, 530, 149, 589, 972, 348, 174, 657, 637, 359, 884, 175, 250, 909, 178, 599, 281, 83 };
    assertEquals(489.0, coinreversing.expectedHeads(N, a), DELTA * 489.0);
  }

  @Test
  public void case63() {
    int N = 997;
    int[] a = { 809, 138, 860, 6, 105, 636, 990, 881, 66, 606, 892, 18, 825, 213, 283, 250, 371, 674, 116, 94, 547, 392, 172, 302, 45, 824, 517, 217, 600, 143, 311, 43, 174, 491, 348, 476, 579, 415, 72, 593, 452, 681, 450, 35, 607, 505, 851, 354, 878 };
    assertEquals(498.5, coinreversing.expectedHeads(N, a), DELTA * 498.5);
  }

  @Test
  public void case64() {
    int N = 935;
    int[] a = { 467, 819, 872, 477, 900, 477, 48, 892, 169, 857, 57, 656, 236, 871, 196, 812, 383, 893, 857, 103, 892, 782, 120, 205, 240, 662, 896, 430, 236, 375, 841, 235, 192, 64, 645, 760, 625, 144, 888, 141, 266, 694, 319, 606, 162, 493, 619 };
    assertEquals(467.5, coinreversing.expectedHeads(N, a), DELTA * 467.5);
  }

  @Test
  public void case65() {
    int N = 911;
    int[] a = { 350, 367, 99, 322, 414, 155, 157, 301, 691, 579, 656, 456, 906, 409, 716, 650, 666, 670, 828, 886, 643, 745, 618, 255, 834, 392, 173, 102, 548, 694, 734, 777, 399, 650, 894, 858, 11, 606, 288, 824, 555, 83, 790, 29, 451, 814, 598 };
    assertEquals(455.5, coinreversing.expectedHeads(N, a), DELTA * 455.5);
  }

  @Test
  public void case66() {
    int N = 958;
    int[] a = { 490, 812, 123, 256, 587, 828, 436, 210, 716, 776, 173, 544, 293, 746, 341, 887, 69, 749, 546, 577, 380, 328, 611, 917, 731, 294, 224, 679, 389, 175, 461, 454, 344, 107, 500, 236, 324, 756, 64, 540, 812, 71, 376, 550, 452, 622, 757 };
    assertEquals(479.0, coinreversing.expectedHeads(N, a), DELTA * 479.0);
  }

  @Test
  public void case67() {
    int N = 974;
    int[] a = { 324, 887, 183, 832, 394, 170, 855, 428, 379, 379, 430, 571, 943, 181, 596, 915, 52, 931, 849, 658, 103, 845, 599, 807, 278, 936, 505, 799, 792, 499, 92, 168, 786, 659, 633, 394, 636, 757, 489, 182, 232, 208, 93, 903, 956, 36, 71 };
    assertEquals(487.0, coinreversing.expectedHeads(N, a), DELTA * 487.0);
  }

  @Test
  public void case68() {
    int N = 909;
    int[] a = { 762, 402, 493, 797, 381, 342, 237, 166, 27, 87, 819, 611, 539, 883, 432, 112, 67, 489, 608, 142, 400, 144, 902, 195, 5, 483, 829, 230, 411, 504, 634, 744, 101, 655, 269, 666, 511, 730, 646, 624, 198, 231, 853, 22, 48, 889, 413, 345, 118 };
    assertEquals(454.5, coinreversing.expectedHeads(N, a), DELTA * 454.5);
  }

  @Test
  public void case69() {
    int N = 920;
    int[] a = { 573, 91, 823, 632, 196, 289, 650, 548, 645, 776, 731, 209, 909, 496, 137, 828, 699, 577, 235, 244, 822, 345, 312, 789, 233, 19, 687, 341, 581, 771, 889, 324, 312, 548, 158, 139, 699, 333, 609, 733, 373, 395, 793, 118, 882, 249, 541, 133 };
    assertEquals(460.0, coinreversing.expectedHeads(N, a), DELTA * 460.0);
  }

  @Test
  public void case70() {
    int N = 904;
    int[] a = { 887, 575, 697, 564, 802, 517, 627, 286, 243, 786, 9, 496, 33, 699, 182, 86, 847, 720, 815, 614, 629, 765, 797, 400, 338, 199, 615, 632, 205, 753, 892, 18, 788, 708, 735, 218, 839, 625, 235, 776, 465, 153, 894, 822, 76, 444, 79 };
    assertEquals(452.0000000000002, coinreversing.expectedHeads(N, a), DELTA * 452.0000000000002);
  }

  @Test
  public void case71() {
    int N = 911;
    int[] a = { 428, 510, 484, 459, 335, 119, 332, 127, 566, 388, 454, 267, 232, 590, 679, 730, 638, 277, 783, 870, 882, 631, 889, 857, 148, 475, 145, 180, 182, 650, 182, 560, 805, 482, 247, 122, 483, 552, 88, 566, 545, 802, 474, 351, 857, 355, 275, 583, 726 };
    assertEquals(455.5, coinreversing.expectedHeads(N, a), DELTA * 455.5);
  }

  @Test
  public void case72() {
    int N = 907;
    int[] a = { 763, 717, 838, 217, 182, 849, 150, 651, 362, 706, 889, 368, 236, 727, 16, 895, 159, 729, 850, 692, 9, 646, 581, 19, 426, 642, 545, 244, 721, 37, 268, 18, 836, 723, 837, 474, 723, 242, 680, 754, 499, 228, 808, 571, 359, 743, 447 };
    assertEquals(453.5, coinreversing.expectedHeads(N, a), DELTA * 453.5);
  }

  @Test
  public void case73() {
    int N = 993;
    int[] a = { 651, 590, 479, 92, 608, 921, 524, 772, 28, 820, 343, 639, 55, 961, 985, 653, 421, 652, 502, 402, 978, 87, 441, 181, 140, 573, 795, 70, 963, 128, 917, 126, 64, 980, 196, 748, 610, 881, 835, 462, 88, 504, 875, 163, 397, 68, 960, 59, 509, 62 };
    assertEquals(496.5, coinreversing.expectedHeads(N, a), DELTA * 496.5);
  }

  @Test
  public void case74() {
    int N = 957;
    int[] a = { 14, 442, 815, 952, 549, 537, 268, 333, 650, 504, 417, 756, 277, 620, 602, 623, 750, 607, 810, 275, 144, 458, 477, 234, 854, 409, 253, 32, 822, 421, 850, 197, 911, 280, 399, 221, 620, 705, 530, 399, 250, 167, 457, 377, 459, 40, 606, 98, 323 };
    assertEquals(478.5, coinreversing.expectedHeads(N, a), DELTA * 478.5);
  }

  @Test
  public void case75() {
    int N = 964;
    int[] a = { 933, 385, 391, 97, 335, 382, 210, 711, 360, 490, 54, 118, 62, 855, 77, 331, 447, 95, 494, 323, 319, 531, 876, 92, 126, 283, 892, 1, 809, 97, 45, 689, 712, 28, 893, 622, 409, 854, 610, 203, 274, 252, 586, 94, 76, 940, 615, 708 };
    assertEquals(482.0, coinreversing.expectedHeads(N, a), DELTA * 482.0);
  }

  @Test
  public void case76() {
    int N = 952;
    int[] a = { 890, 607, 329, 275, 596, 687, 881, 63, 839, 895, 720, 806, 734, 767, 487, 230, 491, 19, 66, 330, 347, 231, 283, 505, 912, 600, 570, 493, 202, 276, 66, 755, 128, 764, 387, 707, 504, 450, 856, 186, 89, 114, 357, 903, 25, 686, 657 };
    assertEquals(476.0, coinreversing.expectedHeads(N, a), DELTA * 476.0);
  }

  @Test
  public void case77() {
    int N = 914;
    int[] a = { 95, 639, 819, 901, 735, 306, 43, 207, 776, 726, 1, 150, 778, 224, 524, 696, 206, 326, 511, 39, 601, 908, 869, 749, 300, 359, 547, 9, 271, 545, 55, 342, 677, 257, 59, 483, 834, 487, 608, 665, 691, 428, 782, 321, 789, 362, 272 };
    assertEquals(457.0, coinreversing.expectedHeads(N, a), DELTA * 457.0);
  }

  @Test
  public void case78() {
    int N = 6;
    int[] a = { 2, 3, 1, 5, 3, 4, 2, 1, 1, 3, 5, 6, 4, 1, 1, 4, 5 };
    assertEquals(3.0, coinreversing.expectedHeads(N, a), DELTA * 3.0);
  }

  @Test
  public void case79() {
    int N = 2;
    int[] a = { 1, 2, 2, 2, 2, 1, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 2, 1, 2, 1, 2, 2, 1, 1, 1, 1, 1, 2, 2, 1, 2, 1, 1, 2, 1, 2, 1, 2, 2 };
    assertEquals(1.0, coinreversing.expectedHeads(N, a), DELTA * 1.0);
  }

  @Test
  public void case80() {
    int N = 9;
    int[] a = { 7, 1, 1, 8, 4, 3, 2, 9, 2, 1, 1, 1, 8 };
    assertEquals(4.504920621369195, coinreversing.expectedHeads(N, a), DELTA * 4.504920621369195);
  }

  @Test
  public void case81() {
    int N = 6;
    int[] a = { 1, 5, 1, 6, 2, 5, 1, 5, 5, 3, 4, 6, 1, 3, 5, 4, 2, 1, 3, 4, 4, 2, 5, 5, 6, 5 };
    assertEquals(3.0, coinreversing.expectedHeads(N, a), DELTA * 3.0);
  }

  @Test
  public void case82() {
    int N = 3;
    int[] a = { 1, 3, 1, 3, 3, 1, 1, 1, 1, 2, 3 };
    assertEquals(1.4993141289437584, coinreversing.expectedHeads(N, a), DELTA * 1.4993141289437584);
  }

  @Test
  public void case83() {
    int N = 81;
    int[] a = { 29, 10, 45, 30, 65, 27, 59, 75, 22, 76, 69, 21, 35, 43, 22, 7, 39, 46, 8, 12, 58, 80, 52, 42, 40, 80, 72, 39, 72, 79, 19, 16, 55, 51, 15, 45, 80, 27, 35, 13, 73, 40, 5, 76, 69 };
    assertEquals(40.5, coinreversing.expectedHeads(N, a), DELTA * 40.5);
  }

  @Test
  public void case84() {
    int N = 37;
    int[] a = { 36, 5, 21, 14, 11, 35, 8, 36, 32, 31, 37, 31, 31, 26, 19, 3, 3, 7, 15, 36, 20, 13, 37, 27, 22, 4, 17, 18, 12, 25, 28, 16, 28, 27, 37, 11, 19, 8, 2, 26, 7, 1, 36, 9, 9, 3 };
    assertEquals(18.5, coinreversing.expectedHeads(N, a), DELTA * 18.5);
  }

  @Test
  public void case85() {
    int N = 50;
    int[] a = { 24, 44, 11 };
    assertEquals(24.5744, coinreversing.expectedHeads(N, a), DELTA * 24.5744);
  }

  @Test
  public void case86() {
    int N = 52;
    int[] a = { 15, 41, 52, 5, 40, 50, 10, 18, 23, 21, 14, 12, 22, 12, 10, 32, 46, 21, 48, 37, 19, 29, 2, 46, 4, 5, 49 };
    assertEquals(25.99999997789837, coinreversing.expectedHeads(N, a), DELTA * 25.99999997789837);
  }

  @Test
  public void case87() {
    int N = 53;
    int[] a = { 23, 42, 6, 16, 5 };
    assertEquals(25.990906131071103, coinreversing.expectedHeads(N, a), DELTA * 25.990906131071103);
  }

  @Test
  public void case88() {
    int N = 492;
    int[] a = { 329, 333, 62, 344, 412, 50, 470, 75, 372, 47, 31, 428, 472, 96, 225, 239, 300, 409, 135, 273, 219, 438, 276, 315, 98, 382, 270, 347, 43, 29, 179, 47, 105, 233, 164, 372, 203, 167, 95, 70 };
    assertEquals(246.0, coinreversing.expectedHeads(N, a), DELTA * 246.0);
  }

  @Test
  public void case89() {
    int N = 813;
    int[] a = { 591, 710, 520 };
    assertEquals(368.0381803080023, coinreversing.expectedHeads(N, a), DELTA * 368.0381803080023);
  }

  @Test
  public void case90() {
    int N = 491;
    int[] a = { 471, 55, 52, 182, 231, 203, 157, 225, 392, 54 };
    assertEquals(245.50511085099893, coinreversing.expectedHeads(N, a), DELTA * 245.50511085099893);
  }

  @Test
  public void case91() {
    int N = 761;
    int[] a = { 667 };
    assertEquals(94.00000000000001, coinreversing.expectedHeads(N, a), DELTA * 94.00000000000001);
  }

  @Test
  public void case92() {
    int N = 126;
    int[] a = { 60, 9, 101, 81, 66, 112, 29, 111, 65, 97, 104, 27, 112, 120, 54, 72, 51, 73, 6, 114, 61, 121, 111, 40, 63, 103, 6, 49, 92, 90, 125, 30, 93, 5, 117, 55, 105, 1, 8, 26, 55, 104, 50, 94, 11, 1, 70, 118, 107, 43 };
    assertEquals(63.0, coinreversing.expectedHeads(N, a), DELTA * 63.0);
  }

  @Test
  public void case93() {
    int N = 945;
    int[] a = { 459, 803, 892, 264 };
    assertEquals(476.19945559034903, coinreversing.expectedHeads(N, a), DELTA * 476.19945559034903);
  }

  @Test
  public void case94() {
    int N = 951;
    int[] a = { 279, 594 };
    assertEquals(426.52996845425866, coinreversing.expectedHeads(N, a), DELTA * 426.52996845425866);
  }

  @Test
  public void case95() {
    int N = 955;
    int[] a = { 437, 673, 61 };
    assertEquals(463.0366119349799, coinreversing.expectedHeads(N, a), DELTA * 463.0366119349799);
  }

  @Test
  public void case96() {
    int N = 978;
    int[] a = { 769, 526 };
    assertEquals(510.18609406952964, coinreversing.expectedHeads(N, a), DELTA * 510.18609406952964);
  }

  @Test
  public void case97() {
    int N = 901;
    int[] a = { 73, 264, 889, 747 };
    assertEquals(550.6165099090914, coinreversing.expectedHeads(N, a), DELTA * 550.6165099090914);
  }

  @Test
  public void case98() {
    int N = 1000;
    int[] a = { 364, 461, 114, 650, 418 };
    assertEquals(499.59708270080006, coinreversing.expectedHeads(N, a), DELTA * 499.59708270080006);
  }

  @Test
  public void case99() {
    int N = 962;
    int[] a = { 102, 219 };
    assertEquals(687.4407484407484, coinreversing.expectedHeads(N, a), DELTA * 687.4407484407484);
  }

  @Test
  public void case100() {
    int N = 967;
    int[] a = { 556 };
    assertEquals(411.0, coinreversing.expectedHeads(N, a), DELTA * 411.0);
  }

  @Test
  public void case101() {
    int N = 936;
    int[] a = { 503, 858, 904, 556 };
    assertEquals(473.1093335281369, coinreversing.expectedHeads(N, a), DELTA * 473.1093335281369);
  }

  @Test
  public void case102() {
    int N = 1000;
    int[] a = { 684, 339, 960, 699 };
    assertEquals(478.3057523200001, coinreversing.expectedHeads(N, a), DELTA * 478.3057523200001);
  }

  @Test
  public void case103() {
    int N = 1000;
    int[] a = { 39, 122, 943, 144, 136, 187, 870, 868, 117, 812, 898, 927, 120, 976, 843, 845, 60, 25, 974, 913, 915, 984, 116, 837, 220, 781, 963, 869, 768, 947, 120, 828, 903, 150, 756, 84, 85, 759, 985, 973, 940, 52, 12, 184, 95, 77, 18, 944, 969, 55 };
    assertEquals(500.0019183740174, coinreversing.expectedHeads(N, a), DELTA * 500.0019183740174);
  }

  @Test
  public void case104() {
    int N = 999;
    int[] a = { 958, 885, 64, 939, 198, 132, 132, 137, 867, 42, 128, 74, 837, 2, 86, 979, 928, 925, 975, 170, 956, 129, 186, 182, 996, 86, 855, 62, 145, 832, 84, 90, 28, 866, 75, 910, 136, 994, 152, 846, 130, 62, 200, 57, 891, 130, 885, 856, 57, 115 };
    assertEquals(499.50379969679045, coinreversing.expectedHeads(N, a), DELTA * 499.50379969679045);
  }

  @Test
  public void case105() {
    int N = 1000;
    int[] a = { 36, 13, 56, 62, 963, 932, 987, 951, 945, 100, 981, 39, 63, 89, 79, 7, 94, 977, 954, 57, 978, 938, 24, 933, 57, 25, 36, 986, 86, 17, 953, 10, 968, 29, 909, 19, 97, 42, 982, 82, 40, 946, 945, 977, 919, 45, 23, 1000, 66, 21 };
    assertEquals(496.242529051689, coinreversing.expectedHeads(N, a), DELTA * 496.242529051689);
  }

  @Test
  public void case106() {
    int N = 1000;
    int[] a = { 916, 153, 357, 729, 183, 848, 61, 672, 295, 936 };
    assertEquals(498.1980774932278, coinreversing.expectedHeads(N, a), DELTA * 498.1980774932278);
  }

  @Test
  public void case107() {
    int N = 1000;
    int[] a = { 500, 100, 1000, 20, 1, 25, 35, 36, 258, 569, 365, 145, 654, 258, 13, 35, 475, 145, 145, 258, 369, 654, 687, 486, 256, 354, 159, 357, 753, 687, 123, 321, 258, 951, 159, 357, 369, 444, 777, 412, 142 };
    assertEquals(500.0, coinreversing.expectedHeads(N, a), DELTA * 500.0);
  }

  @Test
  public void case108() {
    int N = 10;
    int[] a = { 10, 10, 9, 8, 6, 1, 1, 10, 10 };
    assertEquals(4.6928, coinreversing.expectedHeads(N, a), DELTA * 4.6928);
  }

  @Test
  public void case109() {
    int N = 1000;
    int[] a = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(954.1883456311589, coinreversing.expectedHeads(N, a), DELTA * 954.1883456311589);
  }

  @Test
  public void case110() {
    int N = 10;
    int[] a = { 2, 7, 1, 8, 2, 8 };
    assertEquals(4.792639999999999, coinreversing.expectedHeads(N, a), DELTA * 4.792639999999999);
  }

}
