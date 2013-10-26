package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class CrazyLineTest {
  CrazyLine crazyline = new CrazyLine();

  @Test
  public void case1() {
    int[] heights = { 5, 10, 25, 40, 25 };
    assertEquals(100, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case2() {
    int[] heights = { 2, 3, 5, 7, 11, 13, 17, 19 };
    assertEquals(82, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case3() {
    int[] heights = { 1, 1, 1, 1, 1, 1, 501 };
    assertEquals(1000, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case4() {
    int[] heights = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
    assertEquals(0, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case5() {
    int[] heights = { 1, 1, 1, 1, 1, 1, 1, 500, 500, 500, 500, 1000, 1000, 1000, 1000 };
    assertEquals(10986, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case6() {
    int[] heights = { 500 };
    assertEquals(0, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case7() {
    int[] heights = { 98, 246, 360, 514, 785, 883, 923 };
    assertEquals(3620, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case8() {
    int[] heights = { 143, 199, 203, 489, 528, 583, 585, 606, 608, 661 };
    assertEquals(2907, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case9() {
    int[] heights = { 44, 58, 108, 156, 159, 171, 190, 224, 227, 277, 286, 310, 361, 372, 398, 409, 411, 413, 428, 443, 456, 461, 510, 529, 532, 557, 561, 565, 639, 644, 673, 681, 731, 741, 759, 820, 837, 839, 918, 918, 949, 953, 956, 964, 972, 979, 981, 981, 986, 991 };
    assertEquals(25299, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case10() {
    int[] heights = { 928, 859, 785, 621, 619, 398, 254, 249 };
    assertEquals(3344, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case11() {
    int[] heights = { 547, 533, 448, 438, 391, 376, 366, 151, 40 };
    assertEquals(2051, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case12() {
    int[] heights = { 901, 870, 822, 813, 773, 769, 738, 722, 720, 711, 698, 695, 630, 622, 618, 613, 605, 603, 597, 583, 575, 574, 559, 548, 527, 511, 480, 449, 346, 322, 306, 301, 273, 243, 241, 221, 150, 133, 96, 87, 68, 58, 58, 53, 49, 49, 25, 22, 21, 6 };
    assertEquals(24620, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case13() {
    int[] heights = { 691, 277, 543, 36, 517, 632, 99, 642, 112, 609, 806, 741, 557, 574, 790, 914, 826, 364, 323, 751, 988, 344, 298, 707, 165, 447, 731, 386, 520, 313, 628, 563, 941, 522, 598, 810, 154, 48, 803, 265, 656, 960, 5, 564, 885, 794, 829, 710, 510, 151 };
    assertEquals(21856, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case14() {
    int[] heights = { 460, 849, 494, 110, 556, 10, 908, 638, 396, 428, 303, 375, 990, 243, 897, 939, 52, 50, 987, 206, 314, 994, 165, 670, 910, 49, 816, 738, 110, 677, 889, 922, 525, 734, 31, 432, 744, 938, 70, 491, 365, 372, 865, 706, 966, 113, 997, 370, 162, 983 };
    assertEquals(29303, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case15() {
    int[] heights = { 575, 827, 328, 740, 849, 237, 140, 664, 327, 250, 692, 215, 171, 216, 300, 201, 1000, 43, 490, 69, 885, 207, 792, 750, 912, 757, 862, 908, 126, 376, 242, 53, 554, 922, 792, 402, 510, 931, 417, 836, 532, 108, 402, 702, 676, 702, 254, 675, 96, 744 };
    assertEquals(26176, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case16() {
    int[] heights = { 95, 981, 950, 886, 82, 213, 994, 943, 473, 120, 670, 714, 172, 224, 987, 315, 625, 497, 597, 42, 332, 129, 501, 86, 182, 176, 787, 788, 850, 234, 883, 296, 214, 184, 181, 647, 396, 527, 942, 868, 646, 611, 934, 169, 834, 920, 835, 811, 768, 783 };
    assertEquals(28426, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case17() {
    int[] heights = { 204, 100, 911, 704, 537, 445, 880, 323, 232, 81, 908, 466, 377, 474, 649, 909, 120, 44, 435, 61, 264, 432, 672, 549, 952, 857, 468, 138, 19, 236, 921, 222, 687, 831, 278, 223, 627, 509, 897, 210, 589, 156, 675, 317, 629, 323, 226, 749, 719, 12 };
    assertEquals(24561, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case18() {
    int[] heights = { 809, 982, 444, 832, 530, 747, 41, 349, 885, 59, 936, 805, 633, 974, 987, 910, 548, 614, 418, 796, 823, 358, 952, 850, 27, 580, 172, 252, 328, 890, 615, 489, 223, 410, 672, 752, 157, 64, 453, 41, 123, 740, 197, 107, 714, 183, 368, 613, 148 };
    assertEquals(26322, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case19() {
    int[] heights = { 137, 409, 323, 494, 360, 172, 520, 291, 695, 123, 971, 585, 90, 811, 807, 499, 482, 911, 7, 546, 715, 399, 20, 454, 595, 478, 167, 130, 845, 132, 629, 333, 540, 303, 826, 251, 474, 698, 541, 521, 172, 511, 457, 261, 321, 263, 112, 155, 525 };
    assertEquals(19665, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case20() {
    int[] heights = { 118, 52, 239, 517, 423, 693, 463, 900, 211, 592, 96, 342, 573, 428, 233, 875, 605, 483, 701, 302, 24, 221, 826, 886, 677, 438, 559, 291, 549, 713, 168, 19, 764, 406, 887, 186, 450, 349, 437, 13, 293, 532, 354, 217, 959, 587, 91, 563, 421 };
    assertEquals(20589, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case21() {
    int[] heights = { 791, 217, 444, 11, 42, 682, 39, 831, 240, 330, 732, 304, 497, 750, 67, 254, 988, 604, 704, 688, 392, 716, 332, 923, 421, 548, 881, 359, 639, 795, 780, 781, 11, 575, 144, 404, 256, 182, 235, 847, 863, 966, 150, 711, 67, 568, 965, 406, 171 };
    assertEquals(25649, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case22() {
    int[] heights = { 20, 93, 562, 87, 425, 836, 507, 324, 68, 218, 962, 863, 349, 95, 225, 923, 238, 981, 531, 419, 215, 377, 282, 532, 527, 992, 950, 94, 308, 355, 617, 327, 447, 530, 765, 223, 366, 624, 547, 785, 841, 860, 647, 189, 954, 224, 463, 543, 204 };
    assertEquals(23218, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case23() {
    int[] heights = { 993, 962, 770, 370, 595, 301, 248, 938, 602, 693, 598, 956, 309, 276, 754, 191, 41, 977, 556, 664, 875, 340, 856, 86, 339, 44, 392, 914, 858, 934, 117, 851, 247, 886, 572, 193, 538, 171, 131, 139, 863, 80, 94, 524, 355, 199, 714, 395, 527 };
    assertEquals(26671, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case24() {
    int[] heights = { 269, 58, 753, 960, 265, 839, 650, 308, 582, 915, 518, 515, 31, 368, 114, 268, 291, 306, 157, 461, 788, 295, 675, 867, 740, 198, 222, 939, 911, 616, 817, 531, 26, 570, 843, 290, 408, 844, 950, 989, 759, 819, 855, 141, 538, 968, 409, 828, 274 };
    assertEquals(25501, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case25() {
    int[] heights = { 565, 640, 61, 212, 314, 280, 951, 864, 501, 241, 774, 468, 58, 657, 845, 627, 499, 487, 386, 342, 788, 726, 100, 606, 580, 593, 143, 900, 1, 322, 173, 917, 961, 585, 128, 626, 864, 431, 841, 716, 671, 615, 184, 80, 271, 28, 58, 121, 866 };
    assertEquals(24778, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case26() {
    int[] heights = { 795, 814, 653, 520, 266, 258, 452, 858, 400, 351, 858, 73, 875, 774, 385, 459, 254, 11, 675, 684, 203, 390, 706, 817, 925, 138, 439, 953, 195, 911, 170, 342, 725, 823, 213, 990, 80, 664, 847, 832, 366, 56, 256, 240, 181, 641, 51, 434, 651 };
    assertEquals(25389, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case27() {
    int[] heights = { 77, 117, 853, 466, 175, 22, 743, 312, 812, 47, 858, 723, 216, 199, 799, 38, 412, 788, 470, 427, 986, 653, 793, 41, 908, 384, 221, 548, 434, 655, 550, 862, 123, 755, 328, 297, 128, 70, 608, 939, 468, 466, 13, 683, 16, 163, 721, 427, 950 };
    assertEquals(25808, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case28() {
    int[] heights = { 190, 206, 287, 194, 998, 327, 101, 381, 900, 649, 167, 906, 198, 28, 28, 952, 707, 677, 79, 128, 636, 370, 595, 453, 734, 278, 469, 897, 350, 247, 198, 891, 452, 485, 84, 801, 163, 184, 534, 62, 832, 52, 319, 382, 431, 347, 685, 138, 375 };
    assertEquals(22929, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case29() {
    int[] heights = { 116, 617, 10, 837, 564, 815, 570, 193, 283, 818, 542, 881, 16, 432, 333, 852, 867, 485, 14, 50, 18, 428, 234, 69, 746, 967, 852, 444, 651, 989, 818, 766, 957, 180, 954, 520, 994, 524, 64, 628, 693, 605, 508, 708, 388, 192, 559, 254, 677 };
    assertEquals(25053, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case30() {
    int[] heights = { 925, 304, 46, 352, 889, 467, 97, 855, 318, 541, 505, 658, 710, 623, 966, 889, 928, 838, 234, 803, 901, 213, 496, 506, 721, 203, 245, 264, 114, 499, 292, 390, 154, 338, 741, 394, 156, 189, 248, 473, 729, 104, 482, 791, 78, 447, 31, 6, 284 };
    assertEquals(23744, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case31() {
    int[] heights = { 265, 808, 185, 477, 303, 42, 549, 858, 286, 813, 323, 136, 104, 712, 641, 793, 804, 34, 948, 992, 633, 772, 73, 737, 253, 863, 814, 52, 245, 171, 335, 509, 979, 871, 338, 633, 912, 238, 842, 550, 402, 164, 37, 858, 227, 678, 2, 30, 711 };
    assertEquals(28066, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case32() {
    int[] heights = { 950, 374, 344, 73, 446, 432, 678, 660, 597, 729, 904, 768, 415, 765, 98, 286, 454, 82, 549, 691, 924, 450, 445, 439, 487, 302, 666, 164, 303, 47, 226, 604, 420, 921, 677, 865, 352, 706, 876, 301, 434, 780, 420, 200, 896, 869, 837, 349, 950 };
    assertEquals(21890, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case33() {
    int[] heights = { 391, 873, 187, 835, 312, 673, 488, 329, 188, 143, 375, 414, 746, 795, 334 };
    assertEquals(5896, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case34() {
    int[] heights = { 11, 38, 831, 887, 690, 264, 18, 109, 816, 265, 977, 652, 613 };
    assertEquals(8257, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case35() {
    int[] heights = { 389, 355, 151, 576, 190, 814, 600, 29, 142, 788, 171, 868, 201, 269, 662, 886, 394 };
    assertEquals(8155, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case36() {
    int[] heights = { 275, 225, 263, 964, 840, 280, 424, 655, 544, 752, 307, 508, 30, 47 };
    assertEquals(6403, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case37() {
    int[] heights = { 532, 974, 403, 697, 574, 784, 190, 361, 954, 57, 913 };
    assertEquals(5516, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case38() {
    int[] heights = { 71, 798, 968, 95, 425, 192, 357, 740, 31, 988, 516, 38, 883 };
    assertEquals(8150, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case39() {
    int[] heights = { 696, 742, 648, 742, 955, 179, 716, 358, 875, 641, 141, 64, 1, 446, 473, 265 };
    assertEquals(8008, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case40() {
    int[] heights = { 543, 414, 987, 637, 838, 530, 345, 930, 912, 684, 445, 301, 566, 63, 996, 659, 711, 90, 613 };
    assertEquals(8090, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case41() {
    int[] heights = { 157, 322, 116, 797, 462, 531, 149, 260, 355, 413, 279, 897, 826, 617, 885, 16, 498, 581 };
    assertEquals(8005, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case42() {
    int[] heights = { 761, 264, 389, 62, 181, 451, 57, 839, 161, 146, 804, 402, 654, 125 };
    assertEquals(6483, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case43() {
    int[] heights = { 361, 398, 369, 382, 372, 398, 387, 375, 407, 396, 357, 378, 399, 397, 376, 404, 393, 380, 367, 387, 373, 387, 363, 384, 406, 401, 372, 365, 392, 408, 365, 398, 368, 359, 372, 372, 389, 391, 372, 378, 357, 371, 387, 395, 402, 383, 385, 359, 388, 400 };
    assertEquals(1265, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case44() {
    int[] heights = { 388, 393, 386, 402, 403, 409, 400, 386, 396, 396, 396, 416, 392, 382, 388, 411, 405, 408, 410, 416, 411, 386, 414, 389, 382, 410, 402, 410, 416, 398, 384, 416, 390, 390, 395, 406, 410, 418, 407, 414, 380, 405, 412, 410, 389, 386, 379, 396, 379, 408 };
    assertEquals(1044, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case45() {
    int[] heights = { 457, 450, 464, 470, 482, 439, 485, 460, 466, 443, 484, 477, 449, 453, 467, 449, 481, 449, 482, 468, 466, 439, 447, 451, 455, 467, 475, 450, 441, 460, 464, 459, 485, 447, 479, 474, 467, 467, 454, 460, 460, 464, 462, 445, 470, 486, 445, 472, 442, 483 };
    assertEquals(1156, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case46() {
    int[] heights = { 506, 530, 549, 545, 519, 551, 521, 539, 508, 535, 511, 547, 537, 501, 551, 551, 551, 510, 551, 535, 541, 530, 533, 546, 527, 549, 529, 497, 549, 543, 521, 499, 515, 517, 525, 505, 530, 507, 537, 544, 521, 495, 537, 549, 515, 523, 513, 516, 532, 503 };
    assertEquals(1456, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case47() {
    int[] heights = { 489, 486, 498, 519, 491, 491, 478, 508, 487, 493, 476, 482, 522, 506, 508, 486, 477, 515, 504, 495, 505, 517, 505, 524, 508, 522, 521, 498, 496, 481, 518, 480, 505, 521, 502, 511, 528, 475, 509, 484, 522, 489, 526, 519, 500, 486, 496, 513, 508, 489 };
    assertEquals(1316, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case48() {
    int[] heights = { 510, 506, 490, 502, 518, 526, 528, 519, 527, 516, 495, 521, 526, 491, 500, 509, 533, 527, 512, 490, 508, 511, 525, 493, 505, 502, 489, 493, 525, 526, 526, 504, 493, 497, 523, 529, 530, 532, 523, 510, 490, 507, 498, 493, 516, 500, 514, 504, 509 };
    assertEquals(1150, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case49() {
    int[] heights = { 391, 430, 437, 445, 394, 406, 413, 428, 411, 426, 432, 434, 442, 392, 428, 395, 422, 434, 444, 417, 415, 419, 402, 421, 441, 402, 427, 402, 425, 398, 400, 436, 407, 409, 414, 400, 398, 439, 424, 419, 397, 428, 409, 397, 429, 446, 417, 404, 392 };
    assertEquals(1382, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case50() {
    int[] heights = { 499, 460, 506, 474, 456, 489, 506, 474, 474, 472, 465, 498, 479, 477, 483, 467, 468, 503, 462, 477, 489, 500, 470, 505, 474, 499, 474, 510, 493, 491, 455, 463, 508, 468, 458, 479, 470, 474, 509, 484, 487, 501, 481, 510, 485, 496, 492, 495, 476 };
    assertEquals(1342, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case51() {
    int[] heights = { 506, 535, 505, 508, 514, 506, 529, 540, 519, 536, 499, 501, 535, 546, 516, 521, 533, 541, 509, 499, 530, 538, 531, 501, 543, 499, 499, 533, 539, 531, 523, 532, 527, 503, 514, 525, 544, 511, 531, 513, 539, 538, 501, 503, 534, 545, 508, 518, 514 };
    assertEquals(1334, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case52() {
    int[] heights = { 446, 424, 433, 437, 422, 431, 422, 435, 447, 408, 441, 433, 444, 403, 408, 406, 436, 411, 425, 428, 436, 420, 418, 403, 411, 439, 443, 447, 438, 405, 419, 426, 443, 403, 430, 406, 409, 444, 427, 435, 425, 442, 411, 416, 406, 413, 428, 424, 415 };
    assertEquals(1162, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case53() {
    int[] heights = { 502, 468, 497, 481, 481, 470, 472, 484, 498, 473, 470, 507, 502, 500, 495, 486, 468, 466, 477, 490, 505, 481, 488, 479, 486, 470, 464, 470, 502, 487, 483, 499, 494, 492, 470, 498, 490, 503, 471, 470, 473, 502, 474, 479, 490, 508, 475, 497, 473 };
    assertEquals(1119, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case54() {
    int[] heights = { 474, 475, 471, 507, 503, 485, 506, 499, 486, 474, 469, 495, 501, 500, 482, 468, 493, 492, 497, 502, 488, 503, 477, 485, 495, 504, 472, 490, 509, 466, 507, 484, 486, 510, 503, 482, 495, 511, 480, 486, 479, 493, 482, 465, 467, 510, 495, 490, 480 };
    assertEquals(1114, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case55() {
    int[] heights = { 540, 536, 491, 515, 495, 538, 532, 509, 515, 503, 503, 523, 489, 537, 495, 506, 488, 499, 530, 519, 517, 526, 488, 499, 517, 507, 526, 496, 526, 501, 498, 521, 530, 516, 515, 504, 528, 493, 501, 526, 534, 515, 524, 501, 503, 513, 517, 497, 511 };
    assertEquals(1236, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case56() {
    int[] heights = { 452, 439, 429, 442, 455, 433, 452, 422, 424, 462, 456, 423, 444, 458, 444, 434, 445, 433, 444, 460, 432, 437, 450, 427, 444, 463, 444, 444, 429, 459, 427, 447, 454, 435, 459, 448, 441, 448, 454, 433, 422, 447, 444, 422, 425, 435, 430, 458, 444 };
    assertEquals(970, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case57() {
    int[] heights = { 311, 342, 346, 348, 340, 346, 344, 324, 346, 335, 353, 339, 331, 328, 356, 322, 320, 347, 321, 317, 313, 337, 310, 325, 350, 341, 333, 310, 308, 354, 335, 314, 341, 320, 315, 336, 337, 320, 311, 331, 326, 315, 335, 318, 339, 324, 330, 347, 351 };
    assertEquals(1160, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case58() {
    int[] heights = { 400, 437, 438, 409, 413, 434, 418, 413, 409, 404, 429, 409, 420, 404, 400, 398, 410, 417, 421, 407, 410, 430, 442, 432, 399, 399, 401, 427, 407, 436, 439, 403, 425, 405, 420, 399, 399, 410, 440, 420, 423, 438, 399, 399, 432, 415, 401, 419, 411 };
    assertEquals(1146, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case59() {
    int[] heights = { 478, 443, 473, 462, 450, 448, 455, 466, 474, 487, 480, 449, 484, 465, 452, 475, 466, 476, 485, 470, 440, 466, 442, 444, 452, 441, 487, 460, 440, 485, 471, 474, 462, 454, 472, 449, 457, 465, 467, 458, 442, 466, 442, 446, 463, 470, 482, 452, 469 };
    assertEquals(1170, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case60() {
    int[] heights = { 363, 335, 307, 351, 317, 361, 309, 305, 342, 313, 344, 323, 321, 305, 337, 329, 336, 330, 337, 310, 355, 304, 319, 353, 331, 343, 348, 310, 349, 313, 364, 359, 315, 333, 329, 332, 327, 332, 339, 346, 325, 337, 357, 313, 312, 366, 308, 341, 346 };
    assertEquals(1470, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case61() {
    int[] heights = { 388, 386, 388, 388, 388, 381, 384, 388, 383, 381 };
    assertEquals(48, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case62() {
    int[] heights = { 396, 396, 394, 400, 395, 404, 398, 402, 390, 400, 392, 405, 407, 403, 400, 404, 404, 403 };
    assertEquals(142, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case63() {
    int[] heights = { 335, 340, 353, 351, 353, 348, 335, 337, 344, 346, 342, 340, 348, 339, 350, 350, 340, 348 };
    assertEquals(188, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case64() {
    int[] heights = { 312, 319, 320, 316, 323, 318, 309, 319, 313, 316, 320, 314, 312, 311, 313, 310, 312, 322 };
    assertEquals(132, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case65() {
    int[] heights = { 311, 314, 310, 314, 310, 307, 306, 307, 312, 315, 312, 307, 312, 314, 307, 308 };
    assertEquals(83, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case66() {
    int[] heights = { 384, 378, 384, 382, 378, 378, 380, 382, 378, 380, 380 };
    assertEquals(40, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case67() {
    int[] heights = { 549, 479, 549, 534, 529, 629, 629, 484, 494, 454, 659, 554, 619, 499, 549, 659, 534, 619, 539, 494, 604, 629, 474, 654, 514, 549, 589, 549, 644, 579, 524, 649, 494, 544, 464, 639, 569, 559, 574, 454, 464, 659, 609, 494, 494, 579, 509, 599, 669, 599 };
    assertEquals(5310, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case68() {
    int[] heights = { 423, 343, 538, 303, 473, 428, 343, 433, 368, 493, 538, 438, 393, 508, 503, 368, 488, 378, 463, 518, 533, 458, 328, 358, 478, 353, 388, 523, 433, 328, 353, 488, 323, 418, 418, 473, 428, 313, 548, 403, 453, 448, 328, 488, 328, 518, 338, 368, 408, 548 };
    assertEquals(6220, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case69() {
    int[] heights = { 426, 561, 566, 631, 486, 521, 531, 566, 591, 451, 421, 491, 601, 526, 646, 601, 601, 586, 401, 531, 446, 566, 411, 536, 626, 501, 436, 486, 566, 636, 556, 471, 451, 466, 471, 621, 631, 551, 436, 636, 436, 481, 571, 546, 521, 461, 576, 611, 511, 571 };
    assertEquals(5955, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case70() {
    int[] heights = { 506, 581, 626, 656, 536, 516, 686, 426, 456, 701, 466, 436, 626, 586, 666, 446, 701, 671, 651, 646, 631, 656, 546, 476, 641, 471, 681, 666, 561, 701, 681, 656, 696, 651, 526, 536, 571, 446, 616, 556, 496, 446, 596, 656, 471, 486, 606, 596, 436, 466 };
    assertEquals(7820, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case71() {
    int[] heights = { 589, 699, 734, 664, 654, 474, 619, 684, 699, 529, 609, 709, 624, 574, 479, 729, 509, 499, 699, 724, 564, 644, 724, 674, 509, 639, 534, 474, 684, 714, 584, 519, 749, 569, 694, 579, 544, 554, 489, 739, 629, 574, 474, 514, 509, 699, 484, 649, 674, 599 };
    assertEquals(7620, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case72() {
    int[] heights = { 571, 591, 461, 491, 676, 496, 461, 556, 651, 611, 526, 601, 666, 556, 661, 546, 611, 551, 581, 531, 621, 491, 536, 676, 636, 586, 516, 636, 526, 676, 551, 471, 551, 466, 481, 506, 506, 626, 566, 571, 626, 481, 626, 601, 526, 656, 566, 646, 511 };
    assertEquals(5350, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case73() {
    int[] heights = { 398, 433, 568, 478, 508, 453, 553, 458, 418, 478, 563, 398, 583, 533, 543, 378, 443, 398, 598, 563, 548, 458, 563, 468, 473, 528, 518, 388, 378, 553, 498, 473, 558, 548, 603, 423, 408, 593, 458, 588, 508, 583, 438, 458, 483, 408, 578, 488, 458 };
    assertEquals(5685, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case74() {
    int[] heights = { 525, 570, 495, 655, 505, 570, 660, 600, 560, 715, 500, 710, 715, 550, 570, 740, 650, 655, 570, 630, 680, 605, 690, 640, 735, 525, 595, 585, 705, 555, 610, 535, 620, 570, 540, 725, 575, 700, 705, 650, 505, 675, 740, 515, 670, 595, 595, 585, 570 };
    assertEquals(6035, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case75() {
    int[] heights = { 551, 661, 506, 656, 496, 701, 571, 641, 506, 651, 551, 601, 606, 671, 571, 681, 611, 646, 536, 701, 516, 651, 526, 561, 696, 591, 546, 576, 571, 491, 551, 606, 641, 571, 571, 636, 666, 586, 686, 621, 576, 546, 681, 696, 531, 701, 586, 481, 626 };
    assertEquals(5315, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case76() {
    int[] heights = { 600, 745, 620, 515, 695, 610, 565, 615, 560, 550, 585, 535, 680, 725, 635, 590, 625, 625, 495, 610, 615, 670, 515, 715, 485, 505, 670, 550, 725, 750, 675, 575, 725, 515, 660, 525, 730, 655, 685, 710, 645, 540, 755, 560, 570, 740, 725, 705, 680 };
    assertEquals(6640, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case77() {
    int[] heights = { 624, 444, 444, 504, 519, 584, 474, 539, 444, 424, 429, 494, 409, 634, 549, 524, 619, 574, 594, 519, 474, 569, 574, 419, 629, 589, 499, 624, 559, 614, 449, 509, 604, 519, 439, 459, 464, 579, 574, 519, 409, 544, 444, 529, 399, 629, 564, 444, 484 };
    assertEquals(5890, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case78() {
    int[] heights = { 530, 460, 445, 470, 480, 400, 510, 455, 460, 560, 570, 560, 505, 420, 530, 525, 560, 560, 535, 420, 410, 410, 550, 505, 425, 520, 520, 515, 425, 575, 550, 530, 580, 430, 460, 390, 530, 440, 490, 430, 535, 495, 390, 530, 410, 540, 410, 460, 490 };
    assertEquals(4885, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case79() {
    int[] heights = { 539, 494, 564, 604, 659, 449, 669, 544, 579, 469, 669, 639, 489, 514, 579, 489, 654, 494, 654, 594, 574, 439, 479, 509, 529, 579, 629, 499, 454, 544, 574, 544, 674, 489, 649, 619, 584, 579, 519, 554, 544, 564, 564, 479, 594, 664, 469, 614, 459 };
    assertEquals(5540, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case80() {
    int[] heights = { 671, 586, 551, 621, 656, 486, 611, 561, 566, 606, 726, 676, 736, 561, 671, 741, 631, 541, 621, 516, 496, 586, 536, 561, 506, 656, 671, 576, 661, 641, 491, 686, 726, 741, 721, 696, 706, 611, 576, 656, 651, 736, 521, 511, 531, 671, 576, 596, 716 };
    assertEquals(6410, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case81() {
    int[] heights = { 481, 396, 561, 421, 561, 386, 501, 441, 406, 441, 381, 381, 471, 396, 476, 526, 536, 396, 376, 331, 366, 511, 561, 431, 566, 566, 476, 561, 351, 381, 546, 466, 341, 521, 546, 451, 456, 481, 556, 556, 396, 511, 461, 491, 431, 451, 356, 486, 416 };
    assertEquals(5865, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case82() {
    int[] heights = { 418, 403, 443, 428, 443, 448, 403, 433, 403, 413, 393, 418 };
    assertEquals(360, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case83() {
    int[] heights = { 504, 554, 529, 544, 489, 504, 564, 589, 579, 494, 514, 569, 549, 514, 539, 559, 559, 524, 559 };
    assertEquals(935, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case84() {
    int[] heights = { 536, 491, 506, 536, 521, 496, 526, 496, 486, 526, 511, 496 };
    assertEquals(365, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case85() {
    int[] heights = { 361, 331, 336, 351, 346, 321, 316, 316, 381, 371, 351, 361, 331, 361 };
    assertEquals(475, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case86() {
    int[] heights = { 305, 315, 320, 370, 380, 355, 350, 340, 320, 330, 305, 380, 305, 330, 360 };
    assertEquals(670, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case87() {
    int[] heights = { 415, 330, 360, 345, 380, 390, 340, 415, 415, 410, 355, 380, 400, 370, 415, 340 };
    assertEquals(840, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case88() {
    int[] heights = { 551, 551, 546, 501, 561, 566, 486, 561, 476, 466, 551, 571, 511, 521, 491, 541, 531, 556, 571 };
    assertEquals(1025, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case89() {
    int[] heights = { 346, 346, 401, 356, 401, 381, 401, 381, 401, 366, 366, 376, 381, 401, 371, 391 };
    assertEquals(500, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case90() {
    int[] heights = { 539, 459, 529, 524, 509, 489, 469, 499, 514, 489, 524, 489, 499, 499, 479, 459, 514, 514 };
    assertEquals(670, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case91() {
    int[] heights = { 1, 1, 1, 1, 1, 1, 501 };
    assertEquals(1000, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case92() {
    int[] heights = { 1, 12, 15, 19, 901, 45, 932, 65, 77, 89, 48, 762, 281, 444, 333, 1, 12, 15, 19, 901, 45, 932, 65, 77, 89, 48, 762, 281, 444, 333, 1, 12, 15, 19, 901, 45, 932, 65, 77, 89, 48, 762, 281, 444, 333, 3, 77, 83, 99 };
    assertEquals(21426, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case93() {
    int[] heights = { 2, 3, 5, 7, 11, 13, 17, 19 };
    assertEquals(82, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case94() {
    int[] heights = { 123, 484, 42, 134, 454, 283, 374, 172, 173, 37, 19, 383, 182, 999, 828, 732, 38, 393, 337, 899, 19, 383, 182, 999, 828, 732, 38, 393, 337, 998, 19, 383, 182, 999, 828, 732, 38, 393, 337, 999, 123, 484, 42, 134, 454, 283, 374, 172, 173, 1000 };
    assertEquals(25775, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case95() {
    int[] heights = { 345, 404, 775, 753, 915, 139, 858, 931, 452, 517, 537, 1, 272, 939, 467, 243, 175, 8, 616, 962, 750, 883, 786, 147, 809, 546, 638, 880, 477, 350, 741, 631, 423, 963, 179, 857, 951, 997, 928, 697, 184, 353, 831, 947, 361, 600, 223, 896, 383, 527 };
    assertEquals(25226, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case96() {
    int[] heights = { 1 };
    assertEquals(0, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case97() {
    int[] heights = { 5, 10, 25, 40, 25, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 151, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(920, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case98() {
    int[] heights = { 5, 10, 25, 40, 25 };
    assertEquals(100, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case99() {
    int[] heights = { 5, 10, 25, 40, 25, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(200, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case100() {
    int[] heights = { 888, 666, 55, 33, 55, 653, 435, 36, 36, 345, 756, 234, 345, 345, 346, 8, 5, 345, 456, 457, 478, 346, 346, 346, 56, 6, 5, 5, 34, 34, 45, 45, 78, 24, 234, 457, 57, 54, 745, 445, 457, 457, 47, 447 };
    assertEquals(18639, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case101() {
    int[] heights = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 222, 423, 434, 123, 434, 123, 456, 143 };
    assertEquals(22304, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case102() {
    int[] heights = { 56, 234, 456, 1, 656, 234, 351, 166, 2, 452, 124, 1, 2, 3, 4, 5, 6, 7, 8, 9, 235, 999, 100, 235, 245, 876, 875, 874, 784, 235, 24, 11, 12, 13, 14, 15, 346, 542, 24, 678, 45, 46, 47, 48, 463, 214, 346, 234, 1, 5 };
    assertEquals(21046, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case103() {
    int[] heights = { 42, 54, 41, 877, 96, 47, 49, 38, 72, 456, 125, 144, 75, 75, 85, 321, 75, 14, 54, 758, 45, 685, 213, 745, 145, 457, 112, 458, 14, 754, 758, 468, 111, 441, 458, 652, 325, 394, 784, 458, 654, 321, 987, 475, 145, 564, 785, 457, 145, 652 };
    assertEquals(24972, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case104() {
    int[] heights = { 32, 34, 5, 3, 23, 53, 243, 35, 423, 34, 53, 4, 23, 345, 234, 5, 6, 34, 3, 4, 5, 65, 6, 7, 5, 43, 23, 45, 4, 34, 54, 234, 354, 34, 5, 67, 8, 7, 6, 999, 75, 34, 23, 234, 34, 34, 34, 54, 65, 56 };
    assertEquals(7116, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case105() {
    int[] heights = { 97, 34, 984, 567, 456, 999, 999, 1000, 23, 789, 1000, 1000, 99, 1000, 987, 999, 998, 890, 234, 564, 1000, 234, 456, 999, 1000, 12, 2, 3, 1000, 54, 67, 435, 67, 56, 181, 213, 333, 111, 222, 444, 678, 1000, 653, 4, 99, 881, 56, 1000, 1000 };
    assertEquals(36902, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case106() {
    int[] heights = { 1, 2, 2 };
    assertEquals(2, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case107() {
    int[] heights = { 34, 42, 666, 353, 345, 46, 35, 353, 577, 245, 464, 353, 463, 356, 325, 353, 24, 24, 57, 27, 54, 24, 557, 456, 242, 586, 245, 325, 23, 13, 79, 24, 467, 335, 184, 34, 22, 24, 586, 23 };
    assertEquals(14747, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case108() {
    int[] heights = { 2, 3, 5, 7, 11, 13, 17, 19, 21, 4, 3 };
    assertEquals(126, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case109() {
    int[] heights = { 5, 10, 25, 40, 25, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 123, 213, 12, 12, 12, 12, 21, 12 };
    assertEquals(994, crazyline.maxCrazyness(heights));
  }

  @Test
  public void case110() {
    int[] heights = { 1, 2, 3, 4, 5, 6, 10, 11, 12, 13, 14 };
    assertEquals(89, crazyline.maxCrazyness(heights));
  }

}
