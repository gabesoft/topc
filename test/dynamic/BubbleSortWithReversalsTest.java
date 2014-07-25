package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class BubbleSortWithReversalsTest {
  BubbleSortWithReversals bubblesortwithreversals = new BubbleSortWithReversals();

  @Test
  public void case1() {
    int[] A = { 6, 8, 8, 7, 7 };
    int K = 1;
    assertEquals(0, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case2() {
    int[] A = { 7, 2, 2, 13, 5, 5, 2 };
    int K = 2;
    assertEquals(3, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case3() {
    int[] A = { 12, 5, 1, 10, 12, 6, 6, 10, 6, 8 };
    int K = 2;
    assertEquals(12, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case4() {
    int[] A = { 2, 3, 1 };
    int K = 2;
    assertEquals(1, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case5() {
    int[] A = { 482, 619, 619, 601, 660, 660, 691, 691, 77, 77, 96, 77 };
    int K = 9;
    assertEquals(22, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case6() {
    int[] A = { 599, 375, 620, 893, 100, 375, 853, 330, 733, 599, 733, 776, 599 };
    int K = 18;
    assertEquals(25, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case7() {
    int[] A = { 432, 562, 432, 132, 506, 506, 273, 506, 952, 994, 134, 132, 793, 994 };
    int K = 27;
    assertEquals(24, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case8() {
    int[] A = { 469, 149, 406, 406, 676, 469, 924, 778, 594, 329, 329, 406, 329, 778, 924 };
    int K = 36;
    assertEquals(20, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case9() {
    int[] A = { 301, 199, 999, 192, 439, 253, 453, 453, 907, 907, 131, 680, 599, 580, 599, 999 };
    int K = 45;
    assertEquals(26, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case10() {
    int[] A = { 63, 589, 63, 589, 907, 872, 888, 888, 888, 978, 38, 1, 752, 752, 972, 578, 888 };
    int K = 4;
    assertEquals(34, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case11() {
    int[] A = { 33, 550, 602, 859, 216, 109, 884, 550, 494, 213, 109, 494, 550, 216, 965, 884, 422, 859 };
    int K = 13;
    assertEquals(36, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case12() {
    int[] A = { 389, 634, 233, 73, 357, 51, 348, 330, 601, 233, 601, 138, 580, 357, 73, 73, 357, 357, 73 };
    int K = 22;
    assertEquals(60, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case13() {
    int[] A = { 795, 715, 539, 200, 501, 989, 695, 564, 795, 564, 564, 463, 200, 989, 463, 992, 681, 992, 539, 688 };
    int K = 31;
    assertEquals(53, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case14() {
    int[] A = { 627, 204, 692, 429, 418, 744, 323, 82, 418, 418, 213, 204, 847, 744, 213, 203, 847, 389, 213, 916, 916 };
    int K = 40;
    assertEquals(56, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case15() {
    int[] A = { 833, 275, 314, 22, 22, 268, 742, 742, 168, 735, 946, 314, 168, 893, 231, 231, 166, 5, 589, 38, 275, 314 };
    int K = 49;
    assertEquals(78, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case16() {
    int[] A = { 392, 65, 65, 141, 438, 999, 392, 224, 836, 772, 438, 233, 438, 501, 836, 141, 557, 557, 224, 940, 233, 270, 836 };
    int K = 8;
    assertEquals(72, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case17() {
    int[] A = { 915, 211, 953, 915, 908, 492, 314, 455, 455, 424, 648, 938, 953, 437, 331, 882, 915, 712, 406, 442, 908, 455, 133, 211 };
    int K = 17;
    assertEquals(98, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case18() {
    int[] A = { 390, 358, 333, 648, 747, 712, 92, 190, 838, 190, 668, 935, 935, 496, 358, 668, 92, 169, 838, 927, 231, 558, 316, 875, 648 };
    int K = 26;
    assertEquals(106, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case19() {
    int[] A = { 349, 844, 103, 382, 680, 766, 416, 326, 844, 349, 960, 826, 1, 112, 680, 266, 326, 191, 615, 266, 680, 118, 201, 382, 734, 201 };
    int K = 35;
    assertEquals(128, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case20() {
    int[] A = { 836, 776, 836, 245, 900, 849, 406, 406, 118, 118, 794, 849, 966, 813, 900, 813, 969, 7, 579, 531, 579, 776, 16, 579, 933, 946, 579 };
    int K = 44;
    assertEquals(112, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case21() {
    int[] A = { 671, 410, 513, 57, 57, 388, 43, 705, 153, 584, 153, 199, 821, 938, 77, 156, 156, 706, 429, 429, 671, 410, 27, 938, 584, 153, 199, 938 };
    int K = 3;
    assertEquals(125, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case22() {
    int[] A = { 881, 486, 785, 753, 638, 738, 639, 515, 172, 86, 413, 129, 738, 172, 999, 684, 403, 403, 128, 403, 738, 499, 413, 638, 587, 668, 875, 684, 172 };
    int K = 12;
    assertEquals(140, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case23() {
    int[] A = { 417, 842, 842, 417, 121, 940, 940, 18, 18, 970, 692, 692, 692, 940, 434, 785, 77, 417, 308, 914, 417, 764, 741, 944, 613, 43, 43, 853, 785, 18 };
    int K = 21;
    assertEquals(172, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case24() {
    int[] A = { 672, 956, 506, 651, 816, 322, 690, 99, 816, 417, 516, 816, 649, 649, 311, 956, 311, 311, 624, 453, 322, 321, 433, 433, 465, 624, 417, 315, 321, 651, 833 };
    int K = 30;
    assertEquals(144, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case25() {
    int[] A = { 154, 75, 709, 355, 675, 706, 884, 576, 176, 245, 245, 825, 75, 815, 355, 367, 143, 884, 699, 143, 433, 884, 367, 884, 576, 189, 355, 75, 709, 825, 154, 291 };
    int K = 39;
    assertEquals(179, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case26() {
    int[] A = { 59, 988, 777, 59, 224, 84, 516, 728, 438, 294, 526, 940, 813, 506, 405, 121, 294, 294, 778, 245, 906, 1, 368, 516, 640, 669, 640, 940, 389, 669, 728, 669, 516 };
    int K = 48;
    assertEquals(168, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case27() {
    int[] A = { 819, 391, 1, 445, 983, 244, 675, 906, 486, 983, 819, 675, 486, 990, 906, 706, 983, 300, 983, 1, 367, 868, 819, 512, 990, 868, 300, 181, 21, 579, 892, 300, 675, 906 };
    int K = 7;
    assertEquals(197, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case28() {
    int[] A = { 990, 190, 261, 106, 617, 815, 978, 801, 109, 396, 801, 185, 363, 899, 185, 899, 971, 190, 384, 18, 153, 64, 554, 923, 608, 805, 554, 427, 41, 899, 427, 801, 554, 497, 899 };
    int K = 16;
    assertEquals(213, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case29() {
    int[] A = { 896, 654, 149, 243, 954, 791, 954, 122, 465, 621, 331, 718, 718, 541, 122, 57, 269, 269, 685, 954, 425, 322, 495, 503, 578, 411, 467, 322, 896, 957, 957, 950, 950, 152, 926, 926 };
    int K = 25;
    assertEquals(189, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case30() {
    int[] A = { 122, 451, 837, 837, 122, 430, 837, 312, 489, 184, 227, 227, 688, 242, 378, 122, 378, 184, 339, 886, 227, 617, 617, 282, 870, 870, 891, 198, 176, 489, 339, 339, 256, 837, 312, 570, 617 };
    int K = 34;
    assertEquals(221, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case31() {
    int[] A = { 503, 786, 153, 284, 581, 467, 503, 312, 503, 786, 433, 503, 503, 971, 287, 127, 584, 235, 680, 534, 244, 391, 153, 686, 43, 493, 391, 416, 924, 851, 43, 786, 135, 518, 489, 244, 416, 153 };
    int K = 43;
    assertEquals(298, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case32() {
    int[] A = { 765, 490, 719, 785, 188, 18, 843, 118, 765, 144, 12, 476, 642, 104, 559, 245, 188, 116, 495, 118, 307, 245, 118, 245, 509, 326, 120, 719, 12, 167, 118, 969, 117, 117, 969, 307, 913, 167, 239 };
    int K = 2;
    assertEquals(273, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case33() {
    int[] A = { 253, 20, 322, 668, 93, 430, 898, 11, 361, 322, 262, 898, 637, 637, 971, 756, 93, 984, 552, 722, 898, 971, 294, 637, 984, 398, 971, 984, 920, 388, 376, 547, 253, 615, 615, 376, 376, 637, 39, 398 };
    int K = 11;
    assertEquals(218, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case34() {
    int[] A = { 952, 980, 952, 314, 534, 946, 251, 360, 194, 686, 534, 52, 749, 459, 16, 251, 19, 633, 609, 19, 127, 251, 925, 590, 740, 952, 19, 686, 899, 530, 52, 749, 901, 323, 899, 917, 530, 548, 127, 984, 19 };
    int K = 20;
    assertEquals(294, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case35() {
    int[] A = { 797, 486, 343, 486, 221, 387, 288, 903, 349, 508, 69, 349, 69, 219, 733, 69, 633, 927, 499, 772, 880, 772, 387, 938, 499, 499, 221, 891, 512, 512, 512, 996, 996, 130, 474, 474, 907, 367, 931, 108, 108, 860 };
    int K = 29;
    assertEquals(267, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case36() {
    int[] A = { 20, 599, 6, 58, 151, 39, 899, 65, 839, 82, 99, 436, 839, 781, 82, 200, 99, 20, 791, 72, 599, 605, 599, 605, 2, 599, 793, 237, 496, 839, 2, 42, 605, 163, 510, 839, 898, 72, 899, 151, 791, 58, 39 };
    int K = 38;
    assertEquals(330, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case37() {
    int[] A = { 360, 581, 54, 874, 491, 375, 874, 184, 54, 623, 934, 427, 711, 337, 184, 987, 380, 777, 222, 8, 459, 375, 934, 359, 359, 777, 777, 915, 222, 522, 164, 269, 491, 777, 905, 158, 468, 577, 303, 360, 577, 468, 427, 522 };
    int K = 47;
    assertEquals(395, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case38() {
    int[] A = { 919, 919, 917, 855, 855, 855, 263, 925, 604, 604, 328, 13, 770, 267, 704, 411, 856, 770, 202, 856, 165, 328, 22, 206, 34, 916, 34, 738, 165, 671, 411, 328, 807, 13, 206, 206, 143, 916, 34, 380, 72, 72, 171, 773, 165 };
    int K = 6;
    assertEquals(313, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case39() {
    int[] A = { 397, 754, 261, 536, 816, 580, 330, 63, 345, 583, 879, 321, 243, 583, 399, 330, 754, 409, 879, 689, 397, 901, 165, 204, 253, 852, 861, 695, 754, 409, 253, 901, 825, 689, 397, 133, 816, 261, 695, 133, 132, 220, 575, 717, 575, 165 };
    int K = 15;
    assertEquals(424, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case40() {
    int[] A = { 65, 935, 388, 910, 825, 39, 157, 39, 581, 593, 983, 825, 539, 415, 914, 157, 595, 39, 175, 65, 914, 449, 60, 581, 60, 457, 566, 914, 62, 409, 566, 935, 388, 539, 86, 86, 817, 910, 990, 581, 157, 269, 714, 539, 914, 302, 714 };
    int K = 24;
    assertEquals(398, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case41() {
    int[] A = { 212, 667, 541, 932, 932, 835, 899, 195, 956, 336, 932, 749, 962, 956, 940, 667, 195, 519, 749, 956, 139, 885, 885, 710, 956, 212, 14, 978, 749, 883, 707, 281, 3, 707, 945, 899, 86, 629, 629, 629, 199, 519, 181, 683, 93, 970, 970, 419 };
    int K = 33;
    assertEquals(365, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case42() {
    int[] A = { 707, 707, 819, 207, 164, 821, 466, 209, 585, 585, 322, 913, 76, 724, 940, 753, 100, 988, 418, 332, 901, 58, 207, 490, 466, 318, 821, 382, 76, 546, 874, 524, 100, 821, 875, 58, 58, 524, 964, 297, 382, 532, 331, 331, 798, 940, 455, 332, 332 };
    int K = 42;
    assertEquals(520, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case43() {
    int[] A = { 156, 842, 772, 740, 598, 198, 139, 332, 554, 108, 69, 331, 826, 530, 657, 76, 332, 794, 598, 14, 331, 926, 221, 87, 156, 252, 832, 772, 530, 252, 574, 139, 332, 832, 967, 252, 929, 740, 765, 740, 206, 563, 254, 826, 23, 332, 765, 425, 530, 530 };
    int K = 1;
    assertEquals(491, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case44() {
    int[] A = { 401, 483, 422, 311, 355, 679, 675, 525, 666, 821, 624, 927, 927, 927, 319, 483, 483, 887, 976, 976, 679, 590, 699, 482, 821, 887, 221, 30, 978, 978, 978, 978, 737, 298, 997, 77, 594, 377, 933, 699, 624, 624, 624, 355, 730, 30, 221, 588, 533, 355 };
    int K = 1;
    assertEquals(448, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case45() {
    int[] A = { 377, 527, 561, 912, 627, 749, 107, 67, 313, 178, 288, 800, 671, 852, 167, 912, 177, 946, 167, 288, 37, 134, 946, 997, 776, 561, 175, 802, 178, 738, 360, 561, 175, 470, 167, 709, 377, 744, 627, 37, 636, 946, 197, 4, 527, 490, 313, 134, 718, 15 };
    int K = 2;
    assertEquals(513, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case46() {
    int[] A = { 661, 457, 806, 256, 675, 563, 563, 911, 125, 92, 910, 125, 277, 457, 875, 399, 911, 156, 495, 11, 6, 124, 270, 988, 277, 270, 393, 325, 230, 255, 904, 256, 277, 768, 517, 92, 124, 255, 11, 952, 911, 911, 478, 590, 11, 11, 223, 409, 623, 806 };
    int K = 3;
    assertEquals(454, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case47() {
    int[] A = { 762, 762, 762, 163, 122, 122, 122, 734, 734, 734, 523, 730, 730, 395, 395, 395, 395, 747, 747, 259, 576, 528, 528, 528, 420, 75, 75, 592, 33, 604, 795, 244, 244, 230, 795, 54, 54, 54, 793, 504, 127, 100, 934, 489, 622, 793, 171, 808, 287, 287 };
    int K = 4;
    assertEquals(443, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case48() {
    int[] A = { 460, 280, 369, 300, 293, 460, 108, 300, 791, 877, 108, 466, 812, 922, 602, 557, 54, 955, 74, 74, 470, 470, 974, 470, 333, 411, 411, 411, 201, 201, 407, 773, 697, 651, 293, 389, 655, 470, 241, 241, 634, 582, 582, 651, 651, 924, 924, 924, 208, 208 };
    int K = 5;
    assertEquals(412, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case49() {
    int[] A = { 143, 648, 663, 392, 989, 293, 289, 860, 663, 510, 472, 114, 616, 143, 471, 397, 442, 569, 471, 989, 663, 143, 777, 636, 194, 576, 666, 402, 640, 777, 393, 616, 510, 640, 471, 640, 640, 349, 402, 648, 338, 616, 349, 422, 471, 640, 393, 452, 536, 923 };
    int K = 6;
    assertEquals(461, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case50() {
    int[] A = { 915, 915, 307, 915, 915, 176, 594, 295, 874, 321, 321, 176, 311, 89, 594, 311, 614, 423, 423, 400, 400, 984, 825, 825, 592, 992, 281, 369, 369, 419, 419, 710, 24, 24, 24, 266, 710, 419, 755, 366, 94, 171, 665, 410, 622, 953, 508, 508, 508, 669 };
    int K = 7;
    assertEquals(458, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case51() {
    int[] A = { 532, 188, 374, 720, 79, 946, 948, 708, 724, 948, 533, 720, 383, 391, 429, 298, 298, 396, 511, 845, 29, 396, 56, 525, 964, 658, 724, 615, 708, 790, 383, 752, 756, 43, 964, 160, 754, 511, 429, 724, 340, 724, 720, 790, 790, 79, 719, 754, 754, 154 };
    int K = 8;
    assertEquals(433, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case52() {
    int[] A = { 520, 526, 179, 326, 326, 49, 481, 617, 750, 854, 331, 331, 880, 833, 709, 332, 617, 51, 13, 13, 179, 340, 182, 326, 470, 531, 520, 179, 308, 308, 426, 646, 650, 429, 429, 854, 988, 988, 470, 340, 340, 126, 432, 432, 632, 8, 669, 880, 773, 13 };
    int K = 9;
    assertEquals(424, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case53() {
    int[] A = { 103, 97, 399, 580, 103, 694, 103, 725, 103, 206, 303, 103, 591, 536, 484, 161, 30, 111, 111, 814, 984, 30, 581, 451, 30, 111, 111, 645, 725, 4, 179, 179, 30, 591, 853, 612, 725, 353, 484, 580, 845, 788, 612, 649, 788, 214, 103, 303, 381, 353 };
    int K = 10;
    assertEquals(390, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case54() {
    int[] A = { 207, 747, 926, 559, 953, 944, 656, 841, 722, 605, 656, 190, 190, 656, 298, 77, 293, 518, 272, 953, 326, 309, 430, 430, 309, 298, 427, 559, 478, 953, 559, 297, 297, 297, 232, 584, 90, 272, 841, 272, 605, 430, 328, 927, 337, 478, 927, 761, 77, 953 };
    int K = 11;
    assertEquals(410, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case55() {
    int[] A = { 412, 517, 270, 847, 8, 73, 73, 73, 531, 295, 434, 396, 830, 166, 395, 422, 474, 777, 894, 124, 434, 456, 124, 721, 480, 587, 474, 880, 991, 434, 523, 691, 531, 73, 474, 166, 872, 212, 166, 777, 603, 456, 880, 21, 295, 302, 302, 212, 212, 124 };
    int K = 12;
    assertEquals(437, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case56() {
    int[] A = { 906, 213, 906, 273, 381, 618, 597, 370, 31, 490, 490, 652, 710, 906, 391, 391, 477, 477, 318, 440, 202, 904, 904, 202, 202, 110, 110, 23, 210, 375, 375, 528, 234, 729, 729, 950, 950, 735, 627, 353, 31, 31, 370, 155, 437, 437, 437, 505, 505, 256 };
    int K = 13;
    assertEquals(477, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case57() {
    int[] A = { 570, 628, 515, 758, 137, 972, 751, 873, 446, 189, 857, 982, 508, 534, 508, 304, 258, 374, 811, 148, 508, 582, 873, 71, 78, 311, 534, 459, 515, 559, 650, 499, 636, 628, 570, 857, 873, 857, 374, 258, 137, 904, 716, 925, 594, 628, 515, 559, 459, 277 };
    int K = 14;
    assertEquals(469, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case58() {
    int[] A = { 551, 19, 634, 362, 671, 838, 57, 594, 125, 594, 141, 216, 715, 141, 464, 216, 964, 975, 173, 56, 749, 20, 145, 306, 57, 57, 226, 220, 464, 125, 173, 671, 306, 362, 704, 145, 220, 125, 20, 913, 995, 637, 964, 594, 216, 715, 639, 388, 464, 851 };
    int K = 15;
    assertEquals(395, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case59() {
    int[] A = { 971, 30, 223, 619, 330, 331, 694, 83, 382, 842, 28, 416, 842, 176, 503, 475, 314, 223, 52, 313, 301, 708, 314, 839, 694, 14, 467, 471, 929, 929, 510, 314, 510, 8, 314, 842, 513, 134, 971, 331, 733, 467, 971, 733, 619, 916, 619, 601, 28, 52 };
    int K = 16;
    assertEquals(440, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case60() {
    int[] A = { 41, 916, 891, 429, 240, 270, 523, 881, 606, 395, 691, 659, 606, 606, 606, 576, 669, 689, 689, 79, 834, 197, 35, 192, 669, 111, 954, 954, 270, 424, 197, 197, 197, 424, 537, 891, 523, 564, 564, 564, 319, 395, 41, 116, 749, 503, 342, 342, 342, 342 };
    int K = 17;
    assertEquals(461, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case61() {
    int[] A = { 705, 387, 741, 762, 967, 414, 289, 400, 270, 357, 414, 895, 930, 400, 752, 387, 870, 752, 970, 414, 255, 555, 531, 555, 238, 357, 498, 255, 784, 91, 784, 171, 926, 929, 666, 5, 240, 752, 151, 836, 111, 339, 91, 289, 929, 701, 531, 151, 908, 908 };
    int K = 18;
    assertEquals(462, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case62() {
    int[] A = { 759, 758, 759, 99, 830, 249, 714, 830, 772, 636, 719, 77, 250, 276, 370, 636, 210, 407, 898, 719, 396, 99, 920, 355, 759, 171, 370, 636, 77, 827, 772, 772, 772, 48, 250, 268, 370, 686, 48, 830, 920, 759, 249, 310, 310, 310, 636, 777, 610, 13 };
    int K = 19;
    assertEquals(528, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case63() {
    int[] A = { 502, 417, 669, 376, 858, 98, 607, 356, 945, 945, 327, 689, 98, 657, 218, 42, 218, 76, 502, 858, 230, 141, 240, 218, 35, 42, 903, 909, 417, 240, 141, 361, 410, 68, 153, 459, 594, 230, 410, 561, 561, 408, 35, 361, 202, 602, 153, 992, 153, 266 };
    int K = 20;
    assertEquals(506, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case64() {
    int[] A = { 898, 956, 99, 607, 170, 607, 491, 357, 324, 525, 992, 549, 761, 839, 21, 453, 210, 386, 861, 21, 21, 522, 374, 233, 947, 947, 374, 357, 111, 22, 454, 324, 324, 992, 324, 561, 324, 270, 861, 361, 284, 275, 849, 703, 166, 607, 607, 454, 430, 549 };
    int K = 21;
    assertEquals(488, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case65() {
    int[] A = { 41, 349, 329, 784, 425, 394, 254, 137, 515, 356, 856, 579, 349, 401, 115, 62, 761, 976, 479, 720, 57, 479, 329, 545, 545, 515, 485, 986, 784, 891, 485, 115, 641, 424, 579, 641, 80, 115, 730, 79, 741, 300, 485, 62, 57, 747, 425, 719, 356, 784 };
    int K = 22;
    assertEquals(423, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case66() {
    int[] A = { 568, 50, 351, 615, 717, 151, 345, 812, 572, 572, 878, 503, 270, 785, 1, 270, 365, 500, 365, 113, 878, 365, 50, 15, 270, 403, 778, 423, 763, 185, 610, 881, 792, 792, 503, 15, 22, 185, 838, 423, 615, 391, 151, 500, 615, 717, 50, 270, 607, 763 };
    int K = 23;
    assertEquals(466, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case67() {
    int[] A = { 227, 830, 452, 830, 343, 966, 124, 627, 53, 628, 61, 979, 750, 269, 403, 453, 489, 193, 830, 986, 460, 739, 260, 188, 675, 336, 403, 914, 489, 750, 140, 460, 460, 457, 489, 628, 457, 403, 183, 827, 655, 124, 260, 986, 108, 953, 227, 739, 140, 61 };
    int K = 24;
    assertEquals(509, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case68() {
    int[] A = { 847, 927, 951, 811, 778, 58, 768, 451, 475, 435, 102, 247, 176, 741, 464, 661, 644, 661, 121, 450, 524, 661, 176, 176, 644, 475, 743, 743, 653, 927, 924, 927, 927, 58, 58, 619, 259, 971, 497, 818, 285, 637, 637, 100, 681, 778, 475, 380, 982, 741 };
    int K = 25;
    assertEquals(449, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case69() {
    int[] A = { 776, 546, 519, 453, 868, 120, 519, 501, 501, 501, 868, 868, 453, 453, 96, 198, 726, 4, 442, 868, 604, 776, 519, 829, 829, 829, 892, 892, 7, 351, 519, 776, 249, 589, 589, 589, 934, 565, 702, 108, 654, 810, 810, 38, 38, 862, 946, 842, 406, 406 };
    int K = 26;
    assertEquals(428, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case70() {
    int[] A = { 330, 72, 335, 689, 922, 138, 138, 225, 830, 55, 143, 225, 232, 186, 110, 653, 830, 28, 270, 28, 89, 997, 327, 785, 55, 943, 706, 49, 49, 49, 431, 673, 308, 653, 653, 110, 882, 106, 106, 924, 330, 349, 431, 881, 431, 431, 882, 882, 882, 147 };
    int K = 27;
    assertEquals(415, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case71() {
    int[] A = { 648, 680, 177, 177, 177, 106, 628, 714, 714, 478, 613, 361, 962, 962, 962, 962, 167, 213, 843, 832, 848, 666, 843, 843, 98, 832, 714, 714, 949, 949, 818, 843, 966, 966, 504, 361, 361, 361, 326, 414, 249, 249, 342, 722, 666, 326, 504, 326, 326, 531 };
    int K = 28;
    assertEquals(365, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case72() {
    int[] A = { 662, 109, 103, 613, 889, 971, 109, 605, 103, 827, 353, 613, 180, 674, 999, 322, 938, 725, 827, 869, 145, 889, 715, 13, 139, 163, 280, 322, 945, 145, 945, 139, 252, 110, 285, 322, 165, 34, 180, 795, 353, 219, 544, 139, 13, 249, 103, 800, 715, 795 };
    int K = 29;
    assertEquals(415, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case73() {
    int[] A = { 955, 355, 702, 845, 355, 899, 675, 55, 144, 371, 27, 497, 740, 702, 955, 144, 845, 624, 624, 608, 266, 6, 672, 371, 371, 533, 781, 985, 985, 266, 371, 899, 6, 741, 968, 654, 89, 649, 432, 355, 675, 89, 386, 226, 299, 371, 740, 869, 355, 755 };
    int K = 30;
    assertEquals(487, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case74() {
    int[] A = { 934, 301, 967, 880, 494, 50, 292, 292, 499, 352, 292, 452, 317, 398, 430, 292, 651, 519, 697, 481, 523, 247, 640, 273, 590, 453, 651, 543, 586, 497, 239, 481, 301, 979, 499, 497, 497, 693, 295, 651, 292, 292, 286, 967, 301, 118, 499, 499, 640, 366 };
    int K = 31;
    assertEquals(475, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case75() {
    int[] A = { 513, 599, 746, 146, 513, 408, 599, 149, 826, 203, 904, 443, 362, 760, 443, 83, 83, 433, 83, 433, 763, 947, 649, 112, 763, 644, 236, 701, 701, 788, 862, 112, 227, 29, 763, 13, 388, 644, 13, 778, 998, 970, 649, 747, 408, 649, 362, 13, 213, 649 };
    int K = 32;
    assertEquals(458, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case76() {
    int[] A = { 897, 936, 26, 749, 749, 89, 453, 693, 135, 296, 33, 35, 761, 276, 148, 123, 560, 320, 761, 897, 137, 371, 371, 780, 76, 560, 780, 123, 560, 653, 897, 300, 921, 123, 804, 804, 148, 560, 795, 320, 921, 994, 780, 780, 449, 514, 276, 936, 76, 506 };
    int K = 33;
    assertEquals(430, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case77() {
    int[] A = { 422, 369, 95, 532, 364, 47, 612, 137, 422, 532, 911, 137, 575, 448, 60, 606, 913, 17, 364, 537, 537, 837, 369, 37, 37, 137, 401, 778, 6, 37, 999, 537, 781, 913, 666, 532, 47, 364, 364, 17, 781, 781, 150, 448, 858, 606, 480, 95, 840, 532 };
    int K = 34;
    assertEquals(425, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case78() {
    int[] A = { 43, 605, 849, 551, 779, 449, 88, 849, 321, 321, 117, 450, 397, 450, 846, 865, 52, 304, 88, 400, 666, 468, 602, 450, 569, 321, 2, 116, 865, 602, 375, 602, 602, 2, 674, 196, 551, 55, 116, 388, 92, 865, 877, 627, 375, 127, 764, 835, 117, 877 };
    int K = 35;
    assertEquals(429, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case79() {
    int[] A = { 751, 789, 823, 937, 543, 543, 602, 306, 171, 300, 570, 312, 570, 318, 222, 667, 284, 751, 191, 353, 357, 35, 306, 582, 841, 395, 306, 797, 812, 15, 570, 191, 353, 652, 570, 823, 789, 137, 977, 147, 937, 284, 357, 191, 789, 312, 458, 357, 147, 699 };
    int K = 36;
    assertEquals(498, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case80() {
    int[] A = { 246, 790, 769, 992, 349, 448, 349, 16, 325, 257, 371, 877, 513, 349, 534, 218, 877, 483, 778, 478, 458, 889, 780, 769, 425, 35, 876, 876, 589, 122, 86, 562, 778, 478, 534, 86, 184, 665, 122, 371, 838, 134, 285, 285, 72, 349, 811, 959, 122, 16 };
    int K = 37;
    assertEquals(481, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case81() {
    int[] A = { 609, 571, 448, 646, 57, 401, 437, 248, 841, 841, 235, 448, 448, 448, 167, 792, 64, 969, 752, 290, 64, 919, 571, 370, 433, 618, 618, 969, 429, 416, 565, 792, 433, 282, 288, 792, 290, 370, 433, 384, 962, 235, 480, 609, 250, 687, 646, 282, 69, 291 };
    int K = 38;
    assertEquals(513, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case82() {
    int[] A = { 165, 550, 508, 31, 985, 949, 461, 164, 640, 985, 193, 201, 242, 29, 640, 985, 654, 640, 949, 597, 514, 681, 164, 508, 273, 978, 805, 54, 236, 193, 514, 264, 201, 273, 295, 157, 654, 306, 29, 29, 774, 737, 145, 959, 295, 508, 737, 461, 201, 654 };
    int K = 39;
    assertEquals(445, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case83() {
    int[] A = { 659, 172, 172, 172, 1000, 1000, 832, 553, 934, 950, 842, 813, 607, 868, 553, 659, 291, 842, 514, 266, 754, 609, 229, 485, 1000, 203, 553, 813, 6, 50, 50, 524, 41, 294, 98, 485, 485, 41, 952, 935, 163, 659, 291, 172, 659, 273, 941, 941, 87, 754 };
    int K = 40;
    assertEquals(375, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case84() {
    int[] A = { 428, 428, 743, 80, 750, 867, 224, 246, 910, 66, 874, 743, 89, 718, 718, 66, 216, 272, 272, 764, 128, 547, 107, 513, 915, 837, 764, 958, 604, 107, 910, 420, 502, 502, 448, 11, 897, 562, 958, 604, 41, 41, 493, 562, 915, 915, 170, 915, 814, 96 };
    int K = 41;
    assertEquals(457, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case85() {
    int[] A = { 946, 1000, 162, 880, 162, 880, 552, 377, 1000, 122, 813, 918, 946, 13, 42, 768, 918, 42, 13, 1000, 432, 432, 889, 603, 122, 565, 432, 970, 718, 92, 92, 25, 946, 750, 718, 122, 591, 553, 718, 27, 27, 549, 324, 730, 334, 634, 42, 813, 713, 794 };
    int K = 42;
    assertEquals(473, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case86() {
    int[] A = { 670, 112, 112, 120, 643, 985, 728, 650, 571, 480, 399, 71, 687, 728, 538, 587, 491, 399, 13, 571, 383, 96, 112, 897, 977, 571, 491, 4, 977, 977, 328, 909, 328, 538, 328, 909, 977, 977, 638, 881, 65, 250, 112, 889, 544, 889, 544, 250, 651, 950 };
    int K = 43;
    assertEquals(412, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case87() {
    int[] A = { 115, 115, 462, 143, 812, 437, 990, 990, 180, 769, 135, 303, 938, 861, 337, 7, 901, 303, 580, 337, 260, 808, 861, 988, 428, 690, 303, 243, 372, 808, 329, 861, 616, 719, 938, 260, 842, 135, 428, 243, 504, 462, 616, 54, 842, 422, 422, 337, 513, 376 };
    int K = 44;
    assertEquals(480, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case88() {
    int[] A = { 713, 796, 922, 299, 299, 299, 454, 713, 211, 439, 524, 514, 838, 142, 713, 396, 502, 838, 208, 208, 337, 669, 420, 743, 669, 439, 652, 309, 400, 750, 337, 582, 185, 374, 303, 303, 669, 502, 304, 818, 818, 818, 818, 5, 922, 299, 304, 524, 396, 54 };
    int K = 45;
    assertEquals(514, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case89() {
    int[] A = { 428, 355, 740, 420, 866, 649, 916, 870, 7, 738, 924, 193, 676, 984, 164, 888, 740, 740, 972, 870, 314, 290, 355, 972, 924, 330, 286, 286, 60, 459, 649, 459, 521, 521, 286, 420, 975, 870, 140, 676, 459, 972, 7, 3, 888, 550, 693, 943, 288, 738 };
    int K = 46;
    assertEquals(489, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case90() {
    int[] A = { 396, 437, 198, 212, 666, 443, 437, 826, 439, 882, 198, 171, 171, 423, 591, 828, 171, 865, 341, 138, 452, 149, 285, 763, 64, 826, 147, 246, 794, 666, 666, 198, 347, 38, 591, 860, 860, 347, 38, 901, 319, 111, 393, 186, 285, 149, 149, 329, 329, 443 };
    int K = 47;
    assertEquals(506, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case91() {
    int[] A = { 312, 600, 635, 431, 63, 112, 293, 112, 600, 89, 112, 312, 553, 641, 670, 778, 312, 495, 378, 278, 37, 89, 793, 495, 312, 964, 432, 991, 997, 933, 730, 730, 378, 553, 278, 991, 793, 436, 991, 14, 274, 357, 784, 343, 191, 389, 389, 241, 144, 431 };
    int K = 48;
    assertEquals(384, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case92() {
    int[] A = { 770, 779, 184, 81, 868, 81, 36, 122, 843, 935, 405, 868, 137, 416, 935, 36, 416, 123, 607, 321, 574, 574, 259, 936, 194, 571, 888, 888, 888, 888, 122, 416, 828, 619, 36, 935, 321, 184, 539, 611, 828, 122, 122, 416, 590, 590, 69, 843, 395, 590 };
    int K = 49;
    assertEquals(464, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case93() {
    int[] A = { 990, 675, 921, 231, 791, 802, 39, 12, 934, 126, 314, 105, 673, 994, 12, 819, 400, 858, 990, 934, 934, 934, 231, 673, 190, 297, 733, 588, 858, 602, 12, 231, 29, 733, 685, 733, 685, 33, 240, 231, 503, 588, 983, 983, 791, 297, 976, 976, 518, 675 };
    int K = 50;
    assertEquals(443, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case94() {
    int[] A = { 11, 13, 12, 11, 6 };
    int K = 1;
    assertEquals(1, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case95() {
    int[] A = { 2, 11, 11, 11, 7, 2, 11 };
    int K = 2;
    assertEquals(0, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case96() {
    int[] A = { 7, 11, 7, 4, 7, 7, 4, 4, 8, 13 };
    int K = 3;
    assertEquals(4, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case97() {
    int[] A = { 893, 893 };
    int K = 1;
    assertEquals(0, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case98() {
    int[] A = { 250, 674 };
    int K = 2;
    assertEquals(0, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case99() {
    int[] A = { 124, 262 };
    int K = 3;
    assertEquals(0, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case100() {
    int[] A = { 281, 281 };
    int K = 4;
    assertEquals(0, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case101() {
    int[] A = { 336, 106, 106 };
    int K = 1;
    assertEquals(0, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case102() {
    int[] A = { 418, 418, 418 };
    int K = 2;
    assertEquals(0, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case103() {
    int[] A = { 702, 702, 918 };
    int K = 3;
    assertEquals(0, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case104() {
    int[] A = { 550, 258, 550 };
    int K = 4;
    assertEquals(0, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case105() {
    int[] A = { 109, 109, 34, 881 };
    int K = 1;
    assertEquals(0, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case106() {
    int[] A = { 835, 300, 835, 261 };
    int K = 2;
    assertEquals(1, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case107() {
    int[] A = { 654, 311, 209, 835 };
    int K = 3;
    assertEquals(0, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case108() {
    int[] A = { 488, 434, 299, 299 };
    int K = 4;
    assertEquals(0, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case109() {
    int[] A = { 875, 875, 355, 952, 952 };
    int K = 1;
    assertEquals(0, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case110() {
    int[] A = { 300, 315, 315, 902, 933 };
    int K = 2;
    assertEquals(0, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case111() {
    int[] A = { 361, 784, 784, 361, 361 };
    int K = 3;
    assertEquals(0, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case112() {
    int[] A = { 942, 499, 499, 924, 604 };
    int K = 4;
    assertEquals(2, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case113() {
    int[] A = { 925, 353, 135, 135, 135, 685 };
    int K = 1;
    assertEquals(1, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case114() {
    int[] A = { 972, 105, 988, 776, 821, 972 };
    int K = 2;
    assertEquals(4, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case115() {
    int[] A = { 613, 34, 34, 977, 613, 353 };
    int K = 3;
    assertEquals(1, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case116() {
    int[] A = { 119, 371, 717, 371, 717, 3 };
    int K = 4;
    assertEquals(3, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case117() {
    int[] A = { 452, 452, 974, 974, 403, 969, 403 };
    int K = 1;
    assertEquals(5, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case118() {
    int[] A = { 827, 827, 827, 195, 827, 195, 827 };
    int K = 2;
    assertEquals(1, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case119() {
    int[] A = { 29, 29, 716, 87, 87, 630, 460 };
    int K = 3;
    assertEquals(2, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case120() {
    int[] A = { 871, 295, 295, 65, 507, 295, 733 };
    int K = 4;
    assertEquals(3, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case121() {
    int[] A = { 6, 8, 8, 7, 7 };
    int K = 1;
    assertEquals(0, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case122() {
    int[] A = { 12, 5, 1, 10, 12, 6, 6, 10, 6, 8 };
    int K = 2;
    assertEquals(12, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case123() {
    int[] A = { 228, 178, 150, 814, 602, 724, 857, 873, 36, 344, 870, 945, 908, 642, 183, 20, 509, 170, 365, 345, 838, 94, 697, 400, 529, 498, 660, 73, 918, 873, 306, 464, 489, 738, 159, 686, 624, 686, 243, 695, 991, 2, 354, 494, 267, 683, 9, 148, 6, 487 };
    int K = 17;
    assertEquals(467, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case124() {
    int[] A = { 482, 619, 619, 601, 660, 660, 691, 691, 77, 77, 96, 77 };
    int K = 9;
    assertEquals(22, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case125() {
    int[] A = { 2, 12, 5, 1, 10, 12, 7, 2, 2, 13, 5, 5, 2, 12, 5, 1, 10, 12, 6, 6, 10, 6, 8, 482, 619, 32, 619, 601, 660, 44, 660, 691, 691, 77, 77, 96, 77 };
    int K = 15;
    assertEquals(103, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case126() {
    int[] A = { 549, 548, 547, 546, 545, 544, 543, 542, 541, 540, 539, 538, 537, 536, 535, 534, 533, 532, 531, 530, 529, 528, 527, 526, 525, 524, 523, 522, 521, 520, 519, 518, 517, 516, 515, 514, 513, 512, 511, 510, 509, 508, 507, 506, 505, 504, 503, 502, 501, 500 };
    int K = 50;
    assertEquals(0, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case127() {
    int[] A = { 384, 887, 778, 916, 794, 336, 387, 493, 650, 422, 363, 28, 691, 60, 764, 927, 541, 427, 173, 737, 212, 369, 568, 430, 783, 531, 863, 124, 68, 136, 930, 803, 23, 59, 70, 168, 394, 457, 12, 43, 230, 374, 422, 920, 785, 538, 199, 325, 316, 371 };
    int K = 50;
    assertEquals(479, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case128() {
    int[] A = { 232, 141, 553, 209, 198, 997, 436, 359, 534, 725, 22, 879, 168, 301, 105, 867, 348, 663, 689, 660, 647, 235, 439, 974, 429, 145, 502, 325, 243, 103, 720, 88, 539, 260, 826, 247, 689, 398, 535, 505, 795, 801, 248, 782, 547, 127, 655, 490, 646, 590 };
    int K = 22;
    assertEquals(444, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case129() {
    int[] A = { 6, 8, 8, 7, 7, 5, 4, 5, 35, 654, 64, 5 };
    int K = 5;
    assertEquals(10, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case130() {
    int[] A = { 482, 619, 619, 601, 660, 660, 691, 691, 77, 77, 96, 77, 666, 555, 444, 333, 332, 256, 751, 129, 900, 975, 765, 113, 540, 652, 190, 90, 323, 374, 426, 84, 95, 567, 589 };
    int K = 9;
    assertEquals(246, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case131() {
    int[] A = { 551, 54, 6, 654, 564, 21, 312, 2, 12, 3, 4, 54, 3, 54, 35, 8, 54, 351, 54, 6, 24, 654, 65, 657, 354, 545, 655, 10, 2, 6, 4, 8, 354, 83, 3, 2, 56, 85, 22, 5, 3, 232, 434, 43, 2, 32, 54, 55, 546, 12 };
    int K = 20;
    assertEquals(491, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case132() {
    int[] A = { 11, 619, 1, 601, 660, 660, 999, 691, 77, 999, 96, 77 };
    int K = 9;
    assertEquals(17, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case133() {
    int[] A = { 12, 5, 1, 10, 12, 6, 6, 10, 6, 8, 12, 34, 23, 12, 11, 14, 18, 40, 39, 34, 45, 78, 76, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 44, 78, 76, 45, 23 };
    int K = 10;
    assertEquals(203, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case134() {
    int[] A = { 1, 2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1, 2, 1, 2, 1, 2, 1, 2, 2, 1, 1, 1, 1, 2, 2, 1, 2, 2, 1, 2, 2, 1, 3, 3, 1, 2, 3, 1, 3, 2, 2, 1, 1, 2, 1, 1, 2, 1, 1 };
    int K = 7;
    assertEquals(238, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case135() {
    int[] A = { 42, 18, 35, 1, 20, 25, 29, 9, 13, 15, 6, 46, 32, 28, 12, 42, 46, 43, 28, 37, 42, 5, 3, 4, 43, 33, 22, 17, 19, 46, 48, 27, 22, 39, 20, 13, 18, 50, 36, 45, 4, 12, 23, 34, 24, 15, 42, 12, 4, 19 };
    int K = 50;
    assertEquals(458, bubblesortwithreversals.getMinSwaps(A, K));
  }

  @Test
  public void case136() {
    int[] A = { 10, 12, 8, 34, 56, 23, 12, 44, 67, 78, 91, 34, 12, 77, 89, 90, 34, 12, 34, 56, 22, 34, 45, 67, 89, 123, 55, 23, 12, 56, 78, 99, 89, 34, 22, 10, 444, 56, 789, 23, 45, 67, 89, 12 };
    int K = 47;
    assertEquals(297, bubblesortwithreversals.getMinSwaps(A, K));
  }

}
