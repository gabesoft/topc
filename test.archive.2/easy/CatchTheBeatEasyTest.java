package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class CatchTheBeatEasyTest {
  CatchTheBeatEasy catchthebeateasy = new CatchTheBeatEasy();

  @Test
  public void case1() {
    int[] x = { -1, 1, 0 };
    int[] y = { 1, 3, 4 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case2() {
    int[] x = { -3 };
    int[] y = { 2 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case3() {
    int[] x = { -1, 1, 0 };
    int[] y = { 1, 2, 4 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case4() {
    int[] x = { 0, -1, 1 };
    int[] y = { 9, 1, 3 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case5() {
    int[] x = { 70, -108, 52, -70, 84, -29, 66, -33 };
    int[] y = { 141, 299, 402, 280, 28, 363, 427, 232 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case6() {
    int[] x = { -175, -28, -207, -29, -43, -183, -175, -112, -183, -31, -25, -66, -114, -116, -66 };
    int[] y = { 320, 107, 379, 72, 126, 445, 318, 255, 445, 62, 52, 184, 247, 245, 185 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case7() {
    int[] x = { 0, 0, 0, 0 };
    int[] y = { 0, 0, 0, 0 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case8() {
    int[] x = { 0, 0, 68, 24, -40, 45, -1, 10, 53, -8, 61, 71, -32 };
    int[] y = { 242, 210, 346, 26, 147, 296, 456, 61, 370, 96, 381, 342, 174 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case9() {
    int[] x = { -13, -16, 32, 18, 44, 22, 73, 26, -16, -16, 78, -10, -14, 70 };
    int[] y = { 66, 95, 398, 436, 350, 151, 244, 293, 101, 109, 239, 118, 107, 204 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case10() {
    int[] x = { 13, 68 };
    int[] y = { 766, 406 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case11() {
    int[] x = { 19, 6, 16, 4, -9, -10, -1, -11, -17, 5, 2, 4, 25, 36, 10, 12, -8, 13, 19, 15, 12, 22, 20, 7, 0, -8, 6, -11, 4, 24, 12, 10, 14, 17, 11, -8, 22, 5, -8, 7, 5, -3, 9 };
    int[] y = { 132, 471, 126, 455, 395, 422, 538, 433, 409, 226, 358, 254, 305, 152, 234, 58, 377, 208, 299, 340, 39, 175, 180, 88, 17, 510, 49, 549, 496, 317, 63, 37, 105, 293, 233, 377, 313, 493, 531, 71, 200, 270, 213 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case12() {
    int[] x = { -31, -33, 3, -10, -17, -27, -13, 4, -5, -34, -25, -30, -14, -32, -35, -11, -12, -28, -10, -8, -4, -28, -29, -26, 0, -28, -8, -11, -35, -9, -10, -28, 5, -7, -27, -30, -36, -24, 1, -5, -29, -14, -22, -13, -19, -25, -7 };
    int[] y = { 372, 147, 10, 444, 176, 238, 102, 69, 81, 366, 242, 298, 264, 371, 158, 41, 440, 290, 98, 108, 454, 375, 235, 249, 417, 375, 399, 44, 158, 52, 98, 354, 6, 119, 283, 197, 216, 381, 29, 81, 297, 437, 272, 127, 319, 339, 408 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case13() {
    int[] x = { 141, 20, 52, 121, 18, 78, 124, 17 };
    int[] y = { 192, 584, 340, 441, 557, 118, 234, 559 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case14() {
    int[] x = { 373 };
    int[] y = { 887 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case15() {
    int[] x = { -40, -42, -60, -79, -91, -40, -66, -67, -45, -19, -12 };
    int[] y = { 349, 452, 419, 589, 268, 352, 503, 153, 179, 45, 80 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case16() {
    int[] x = { -91, -60, -92, -90, -75, -69, -76, -96, -81, -76, -74, -80, -93, -59, -106, -2, -45, -79, -83 };
    int[] y = { 204, 165, 246, 425, 504, 553, 268, 375, 519, 526, 500, 346, 298, 137, 444, 46, 97, 328, 473 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case17() {
    int[] x = { -286, 0, -231 };
    int[] y = { 731, 179, 431 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case18() {
    int[] x = { -7, 16, -41, 2, 22, -28, 45, 27, 5, -67, 21, -85, -61, -20, -7, -90, -39, -60, -51, -33, -81, 23, -41, 18, 11, 4, -44, 0, -19, -12, -40 };
    int[] y = { 344, 265, 187, 217, 271, 356, 275, 306, 54, 450, 101, 481, 489, 362, 80, 456, 156, 412, 390, 388, 514, 27, 174, 241, 317, 121, 193, 340, 213, 138, 421 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case19() {
    int[] x = { 50, 41, 24, 31, 26, 12, 50, 22, 28, 43, 55, 43, 49, 1, 35, 31, 9, 18, 30, 22, 37, 29, 35, -5, 11, 0, 27, 25, 29, 22, 26, -9, 12, 10, 74, 32, -9, 62, 22, 30, 46, 33 };
    int[] y = { 266, 140, 384, 286, 119, 64, 272, 150, 282, 255, 416, 326, 157, 186, 298, 227, 219, 11, 145, 29, 108, 314, 272, 194, 203, 51, 164, 67, 153, 40, 88, 186, 41, 172, 417, 354, 60, 421, 332, 246, 407, 376 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case20() {
    int[] x = { 81, 3, 29, -16, 104, 111, -13, 38, 155, 62, 117, 21, 179, 56, 50, 39, 35, 38, 56, -13, 172, 61, 29, 131, -23, 112, 65, 123, 179, -31, -6, 54, 33, 77, 167, 79 };
    int[] y = { 256, 68, 245, 56, 326, 337, 43, 111, 399, 263, 364, 153, 414, 228, 178, 205, 131, 163, 255, 39, 433, 168, 89, 395, 47, 378, 290, 371, 447, 51, 20, 129, 242, 290, 400, 304 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case21() {
    int[] x = { -112, -102, -23, -10, -65, -2, -15, -21, -19, -9, -33, -81, -73, -43, -57, -12, -15, -49, -8, -109, -31, -52, -30, -123, -111, -121, -130, -86, -72, -35, -22, -105, -15, -14, -55, -81, 2, -67, -30, -24, -21, -93, -75, -93, -72, -5 };
    int[] y = { 252, 164, 462, 404, 148, 466, 29, 329, 424, 447, 331, 136, 276, 58, 295, 391, 20, 298, 373, 193, 350, 333, 318, 218, 173, 182, 212, 162, 72, 344, 357, 238, 358, 10, 66, 90, 377, 280, 303, 44, 443, 275, 104, 263, 122, 424 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case22() {
    int[] x = { -87, 49, 24, 55, -55, -59, 44, -52 };
    int[] y = { 18, 356, 548, 263, 487, 368, 573, 141 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case23() {
    int[] x = { 287, 195, 307 };
    int[] y = { 404, 271, 510 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case24() {
    int[] x = { -198, -89, -190, -42, -139, -103, -75, -229, -69, -60, -101, -158, -171 };
    int[] y = { 152, 305, 218, 454, 355, 69, 439, 184, 528, 16, 365, 293, 82 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case25() {
    int[] x = { -323, -255, -91, -244, -96, -194, -107, -267, -76, -96, -361, -360, -147, -140, -31, -256, -121, -311, -273 };
    int[] y = { 359, 275, 36, 179, 73, 157, 26, 304, 23, 107, 398, 450, 133, 133, 18, 229, 55, 325, 359 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case26() {
    int[] x = { -23, -21, 21, 68, 75, 52, 14, 72, 21, 67, 28, -10, -28, -23, 32, 44, 5, 17, 22, 56, 56, 25, 1, 47, 16, 80, -8, 35, 54, 43, 18, -46, 32, 22 };
    int[] y = { 41, 60, 350, 255, 311, 443, 205, 275, 343, 300, 383, 161, 98, 104, 470, 237, 180, 27, 131, 410, 477, 459, 104, 315, 147, 427, 40, 345, 461, 219, 338, 82, 373, 339 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case27() {
    int[] x = { -61, 28, -20, -20, 1, -89, 1, -34, -65, -10, 42, -43, -139, -103, -97, 1 };
    int[] y = { 368, 173, 67, 168, 110, 426, 37, 155, 419, 337, 232, 100, 494, 522, 469, 277 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case28() {
    int[] x = { 9, 1, -22, -49, -17, -38, -49, 33, -36, -3, -10, -26, -20, -14, 41, -32, -46, -27, -5, -17, 18, 9, 3, -8, -9, -61, -14, -16, 18, -21, -34, -57, 4, -19, 12, -24, 22, -30, -17, -31, 13 };
    int[] y = { 30, 245, 172, 468, 283, 450, 515, 95, 579, 194, 132, 644, 269, 330, 77, 432, 471, 231, 232, 357, 8, 38, 377, 419, 156, 538, 213, 644, 50, 610, 354, 559, 233, 306, 119, 625, 66, 663, 596, 492, 400 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case29() {
    int[] x = { 58, 20, 10, 13, -16, -23, 42, 12, -32, 6, 53, 43, -2, 35, -5, 56, 22, 31, 48 };
    int[] y = { 592, 6, 351, 282, 305, 236, 509, 194, 146, 561, 542, 410, 104, 543, 459, 390, 52, 29, 606 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case30() {
    int[] x = { 10, -117, -125, -186, 10, -177, -145, -211, -105, -54, -13, -28, -198, 38, 24, -150, -82, -172, -106 };
    int[] y = { 91, 238, 272, 305, 96, 417, 379, 442, 207, 140, 54, 124, 305, 37, 22, 341, 263, 304, 191 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case31() {
    int[] x = { -56, 98, -31, -86, 56 };
    int[] y = { 412, 115, 560, 282, 150 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case32() {
    int[] x = { -25, -63, 1, 22, -43, -39, -9, -33, -69, -51, -50, -37, -34, -40, -67, -45, -61, -50, -61, -63, -42, -73, -37, -13, -33, -35, -57, -47, -24, -31, -27, -20 };
    int[] y = { 427, 249, 6, 22, 351, 45, 35, 253, 122, 73, 383, 411, 209, 353, 150, 307, 99, 218, 108, 224, 283, 218, 181, 446, 463, 448, 114, 466, 333, 206, 439, 290 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case33() {
    int[] x = { 0, 33, 34, 4, -33, 8, -9, 15, -62, 5, -1, 20, 15, -43, 15, -32, -25, -5, 46, -58, 59, 39, 32, 48, 53, -20, -5, -17, -19, 71, 34, -58, -3, -58 };
    int[] y = { 323, 88, 378, 64, 215, 133, 151, 93, 246, 182, 116, 359, 115, 257, 334, 48, 285, 331, 462, 256, 501, 421, 390, 450, 473, 61, 24, 210, 177, 493, 413, 241, 306, 227 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case34() {
    int[] x = { -214, -181, -210, -68, -127, -192, -162, -115, -113, -102 };
    int[] y = { 220, 478, 435, 80, 281, 190, 237, 362, 169, 180 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case35() {
    int[] x = { 21, 29, 100, 78, 99, 68, 52, 3, 96, 77, 99, 121, 85, 97, 113, 67, 107, 94, -7, 65, 92, 95, 80, 99, 76, 84, 93, 105, 110, 111, 80, 45, 107, 90, 34, 62, 92, 97, 42, 79, 86, 96, 94 };
    int[] y = { 48, 110, 323, 259, 405, 173, 91, 33, 269, 184, 406, 377, 456, 272, 360, 126, 294, 304, 10, 157, 257, 449, 243, 383, 210, 135, 248, 350, 399, 445, 127, 121, 424, 190, 105, 464, 342, 347, 68, 160, 210, 281, 227 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case36() {
    int[] x = { 40, 46, 170, 24, 132, -26, -12, 160, 185, 54, 212, -3, 92, 23, 161, 187, 195, 137, -8 };
    int[] y = { 140, 194, 469, 164, 256, 89, 24, 266, 301, 219, 435, 134, 239, 157, 407, 361, 518, 318, 73 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case37() {
    int[] x = { -961 };
    int[] y = { 966 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case38() {
    int[] x = { 24, -91, 1 };
    int[] y = { 668, 567, 307 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case39() {
    int[] x = { -35, 42, 16, 17, 29, -39, -16, 29, 1, -15, -14, 6, -34, -17, 21, 5, -13, 50, 11, 7, 20, -23, -12, -2, 33, -3, -38, -32, -33 };
    int[] y = { 395, 193, 63, 171, 142, 486, 417, 212, 252, 387, 360, 85, 415, 94, 273, 243, 66, 176, 106, 53, 328, 397, 336, 126, 296, 24, 393, 467, 441 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case40() {
    int[] x = { 20, 2, 64, 24, 30, -36, -3, 22, 21, -4, -12, 37, 15, 39, 9, 50, 39, -21, 33, -32, 50, -39, -5, -6, -11, 32, 16, 20, -13, 17 };
    int[] y = { 194, 217, 296, 224, 22, 448, 166, 107, 50, 135, 384, 41, 336, 329, 359, 59, 276, 209, 78, 411, 249, 417, 400, 480, 200, 253, 216, 181, 214, 504 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case41() {
    int[] x = { -25, -32, -37, -65, -77, 9, -59, -66, -42, -5, -20, -75, 6, -30, 9, -53, -24, -18, -72, -91, 3, -59, -49, -38, -84, -66, -17, -52, -57 };
    int[] y = { 398, 304, 150, 240, 88, 353, 167, 107, 148, 422, 43, 217, 376, 433, 338, 453, 336, 409, 272, 185, 29, 76, 132, 154, 240, 211, 142, 60, 295 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case42() {
    int[] x = { 67, 13, 96, 66, 64, 27, -41, 54, 56, -64, 101, -25, 90, 63, 31, 98, 53, 88, 72, 5, 88, 72, 97, -29, 117, 41, -53, 108, -21, 20, 93, -22, 116, -5 };
    int[] y = { 366, 129, 403, 224, 243, 188, 13, 157, 179, 32, 250, 7, 337, 388, 149, 404, 218, 261, 275, 141, 247, 391, 288, 57, 308, 208, 45, 431, 74, 126, 427, 101, 460, 109 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case43() {
    int[] x = { 44, 79, 44, 34, -12, 84, 71, 60, 69, 57, 62, 67, 11, 58, 50, -20, 53, 55, 79, 36, 46, 82, -36, 72, 56, -33, 38, 70, 74, 27, 61, 48, 52, 43 };
    int[] y = { 122, 256, 187, 422, 455, 140, 319, 127, 122, 180, 55, 82, 427, 143, 391, 476, 370, 310, 129, 171, 47, 344, 483, 102, 222, 487, 74, 250, 283, 1, 210, 28, 76, 413 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case44() {
    int[] x = { 39, 154, 27, 113, 131, 104, 36, 97, 124, 3, 125, 131, 67, 16, 64, 110, 32, -4, 23, 88, 89, 79, 122 };
    int[] y = { 61, 237, 340, 290, 244, 199, 8, 267, 297, 389, 170, 235, 328, 342, 25, 265, 53, 360, 42, 326, 127, 90, 125 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case45() {
    int[] x = { 93, 61, 37, 18, 121, 125, 94, 61, 26, 120, -17, 102, -10, 23, 52, 19, -8, 46, -25, 80, 75, 33, 8, 108, 66, 84, 126, 39, -1, 46, 51, 110, 132, 92, -28, 95, 92, 45, 33, 115, 37, 76, 115, -42, 108, -33, 125, 80, -3 };
    int[] y = { 201, 169, 279, 111, 474, 482, 421, 237, 96, 386, 67, 429, 49, 123, 333, 130, 3, 255, 5, 182, 357, 151, 82, 454, 353, 210, 530, 314, 74, 260, 299, 389, 513, 399, 32, 446, 362, 165, 136, 550, 300, 227, 507, 24, 372, 9, 487, 412, 54 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case46() {
    int[] x = { 60, -24, 12, 40, 15, 116, -23, 49, 60, 11, 6, -35, 91, 27, 22, -44, -10, 94, 27, 7, -39, 119, 52, -37, 46, 9, 77, 3 };
    int[] y = { 39, 374, 199, 15, 234, 110, 249, 176, 148, 397, 212, 374, 122, 412, 411, 295, 341, 68, 165, 9, 267, 77, 153, 320, 183, 396, 51, 247 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case47() {
    int[] x = { 110, 157, 48, -105, -14, 167, 76, -25 };
    int[] y = { 79, 120, 359, 523, 456, 234, 359, 458 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case48() {
    int[] x = { -48, -9, -39, -32, -56, -62, -70, -65, -19, -39, -51, -42, -73, -69, -39, -21, -52, 9, 1, -34, -39, -18, -51, -33, -40, -62, -26, -37, -38, 8, -41, -58, -69, -72, -84, -57, -51, 4, -34, -43, -52, -21, -14, -13, -6, -24, -49, -37, -4 };
    int[] y = { 352, 77, 180, 117, 435, 244, 222, 441, 120, 289, 405, 99, 443, 439, 334, 127, 284, 6, 35, 379, 170, 145, 410, 315, 108, 250, 88, 422, 331, 15, 197, 272, 420, 229, 443, 205, 389, 68, 308, 316, 259, 132, 310, 134, 55, 155, 421, 360, 147 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case49() {
    int[] x = { -22, 7, 6, -34, -40, -17, -71, 3, 13, -44, 0, -47, -15, -74, -23, 4, -3, -57, -10, -25, 8, -82, -74, 17, -39, 7, -4, 9, 0, -8, 26, -12 };
    int[] y = { 148, 341, 259, 89, 122, 212, 463, 284, 351, 503, 177, 118, 80, 475, 311, 381, 23, 419, 383, 80, 335, 436, 442, 40, 411, 235, 69, 204, 269, 60, 266, 347 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case50() {
    int[] x = { 39, 22, 2, -30, -68, 26, -58, -47, -12, 17, -28, -5, 54, -42, -34, -13, -43, -20, 42, -30, -11, 12, -23, -34, -25, -14, -4, -30, -12, 28, -18, -31, -38, 13, 56, -2, -55, 16, -68, 6, -48, -27, 44, -3, 34 };
    int[] y = { 419, 477, 528, 218, 128, 478, 182, 179, 259, 494, 234, 332, 457, 120, 26, 4, 204, 317, 459, 119, 323, 382, 324, 249, 54, 299, 324, 25, 268, 412, 46, 89, 101, 360, 417, 506, 169, 399, 148, 347, 124, 72, 439, 279, 416 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case51() {
    int[] x = { -49, -65, -36, -26, -20, -26, -52, -61, -49, -73, -37, -50, -30, -27, -12, -36, -48, -76, -34, -41, -31, -48, -47, -2, -31, -45, -24, -41, -33, -33, -13, -39, -38, -55, -26, -62, -42, -44, -29, -30, -44, -45, -28, -23, -19, -43, -37, -35 };
    int[] y = { 512, 511, 405, 439, 296, 324, 384, 197, 154, 484, 405, 243, 225, 109, 314, 70, 79, 498, 389, 428, 432, 420, 205, 10, 270, 516, 280, 454, 369, 151, 44, 349, 259, 473, 529, 170, 337, 88, 280, 124, 469, 186, 429, 63, 24, 97, 144, 463 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case52() {
    int[] x = { 36, 48, 21, 68, -7, -15, 31, 8, 37, -2, 24, -13, -49, 45, -10, 41, 6, 23, -18, -7, 6, -71, 44, -1, 14, 25, 20, 49, -32, 22, 25, 11 };
    int[] y = { 109, 297, 243, 276, 395, 11, 117, 14, 86, 224, 235, 377, 446, 116, 215, 311, 148, 259, 400, 237, 358, 460, 57, 150, 41, 18, 335, 275, 423, 173, 338, 204 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case53() {
    int[] x = { -116, -182, -38, -12, -21, -70, -57, -85, -102, -11, -56, -34, -150, -57, -131, -31, -44, -92 };
    int[] y = { 297, 460, 24, 101, 59, 154, 151, 244, 259, 140, 45, 205, 448, 186, 401, 228, 180, 347 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case54() {
    int[] x = { 16, -37, -38, 36, 24, -27, -58, 24, 20, -36, 19, -7, -8, -10, 17, -43, 24, -25, -37, -55, -30, 30, 12, 38, 38, -48, 10, -43, -69, -22, -22, -55, -38, -16, -54, -10, -18, 10, -67, -24, -18, -1, -30, 11, 11, 39, -46 };
    int[] y = { 194, 346, 450, 527, 492, 372, 323, 231, 17, 261, 210, 250, 153, 469, 62, 106, 53, 119, 344, 271, 96, 522, 238, 227, 44, 305, 518, 404, 282, 384, 147, 404, 443, 378, 422, 94, 132, 485, 300, 254, 354, 174, 456, 499, 83, 26, 341 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case55() {
    int[] x = { 30, -28, 8, -108, 25, 22, 50, 30, -80, 48, -83, -13, -8, -30, -50, 26, -57, 22, -28, 22, -24, 38, -17, 3, -99, 20, -11, 20, -6, 22, -13, 0, 1, 22, -77, 5 };
    int[] y = { 153, 350, 171, 492, 109, 201, 93, 133, 534, 75, 470, 393, 12, 331, 431, 261, 452, 178, 372, 51, 405, 55, 332, 31, 514, 286, 400, 215, 305, 172, 316, 234, 397, 41, 454, 35 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case56() {
    int[] x = { 9, -5, 20, -6, 22, 14, 30, 14, -13, -13, 14, -8, 10, 25, -13, 19, 19, 8, 14, 14, -6, -10, 9, 26, 14, 25 };
    int[] y = { 228, 24, 88, 313, 98, 72, 107, 363, 273, 266, 67, 307, 229, 347, 264, 53, 95, 376, 68, 78, 313, 280, 143, 161, 71, 196 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case57() {
    int[] x = { 2, 21, 21, 16, 32, 27, 8, 16, -3, 76, 55, 11, 29, 13, 21, 48, 17, 21, 43, 8, 32 };
    int[] y = { 317, 142, 130, 222, 441, 366, 170, 109, 333, 505, 470, 22, 63, 271, 234, 389, 134, 129, 406, 203, 441 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case58() {
    int[] x = { -66, 33, 45, -51, -2, -30, 39, 0, -64, -53, -65, 25, -26, -21, 49, 12 };
    int[] y = { 383, 112, 124, 500, 3, 467, 173, 0, 385, 355, 417, 228, 284, 295, 72, 35 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case59() {
    int[] x = { -65, -90, -58, -18, -70, -82, -130, -65, -58, -49, -109, -102, -5, -28, -66 };
    int[] y = { 370, 409, 225, 89, 332, 523, 454, 541, 223, 586, 485, 283, 38, 144, 209 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case60() {
    int[] x = { 66, 25, 30, 69, 26, 69, 67, 68, 72, 25, 5, 18, 54, 48, 25, -6, 56, -24, 44, 45, 44, -9, -13, 63, 22, 31, 69, 68, 21, 52 };
    int[] y = { 342, 170, 175, 420, 211, 301, 299, 318, 354, 163, 132, 104, 285, 394, 164, 72, 433, 42, 266, 238, 262, 69, 23, 460, 154, 202, 305, 371, 148, 275 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case61() {
    int[] x = { -67, -178, -129, -51 };
    int[] y = { 125, 329, 724, 575 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case62() {
    int[] x = { -248, -255 };
    int[] y = { 299, 316 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case63() {
    int[] x = { 13, -48, -83, -40, -66, -62, -1, 12, -78, -53, -16, -47, -42, -15, -55, 3, 13, 15, -88, -76, -31, -12, -10, -63, -73, -84, 8, -39, -53 };
    int[] y = { 32, 332, 246, 347, 393, 445, 139, 58, 257, 379, 162, 466, 487, 116, 320, 134, 45, 26, 416, 428, 182, 112, 81, 215, 296, 269, 51, 492, 367 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case64() {
    int[] x = { 52, -18, 45, 21, 15, -48, 0, -9, -3, 8, 16, 33, -1, 81, 19, 48, -50 };
    int[] y = { 467, 245, 158, 99, 32, 282, 3, 339, 61, 216, 113, 186, 413, 513, 383, 169, 280 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case65() {
    int[] x = { -12, 59, -1, 50 };
    int[] y = { 55, 134, 73, 309 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case66() {
    int[] x = { 74, 72, 47, 58, 35, 67, 45, 44, 51, 41, 44, 67, 52, 19, 28, 55, 59, 41, 51, 19, 81, 22, 25, 47, 58, 78 };
    int[] y = { 455, 369, 188, 323, 113, 256, 489, 216, 205, 558, 194, 254, 159, 520, 33, 298, 405, 555, 79, 520, 442, 580, 128, 288, 64, 346 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case67() {
    int[] x = { 19, 105, 82, 55, -2, 6, 94, 97, 97, 81, 76, 0, 19, 30, 31 };
    int[] y = { 461, 342, 164, 392, 36, 67, 258, 312, 255, 146, 195, 20, 439, 480, 92 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case68() {
    int[] x = { 30, -159, -120, -102 };
    int[] y = { 606, 191, 350, 448 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case69() {
    int[] x = { 4, 58, 138, 51, 5, 138, 114, 116, 87, 56, 113, 46, 81, 49, 104 };
    int[] y = { 16, 169, 397, 129, 42, 397, 339, 362, 223, 188, 249, 108, 304, 160, 451 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case70() {
    int[] x = { 45, -36, 44, -47, 36, 32, -8, -77, -29, -20, 84, 13, 84, -41, -21 };
    int[] y = { 214, 399, 99, 458, 54, 44, 357, 617, 500, 336, 155, 246, 146, 564, 310 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case71() {
    int[] x = { -51, -120, -129, -120, -120, -150, -118, -80, -45 };
    int[] y = { 65, 340, 237, 213, 220, 172, 224, 286, 55 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case72() {
    int[] x = { 46, 34, 66, 43, 18, 78, 75, 38, 43, 47, -2, 30, 37, 57, 42, 90, 46, 67, 67, 65, 32, 46, 43, 43, 38, 55, 49, 49, 48, 38, 72, 83, 65, 79, 51, 78, -2, 58, 37, 42, 60, 43, 29, 38, 90, 46 };
    int[] y = { 556, 224, 520, 208, 34, 400, 338, 176, 282, 94, 13, 76, 61, 123, 249, 381, 268, 422, 431, 424, 230, 96, 578, 566, 468, 301, 162, 451, 98, 189, 416, 353, 317, 342, 499, 401, 13, 538, 59, 586, 143, 196, 48, 486, 362, 111 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case73() {
    int[] x = { 26, 30, 18, -1, 30, -15, -5, 5, 32, 23, 22, 8, 11, 21, 30, 26, 1, 19, 26, 11, 7, 20, 35, 26, 20, 30, 7, 30, 3, 25, 23, 8, 39, 8, 2, 35, 6, 31, 6, -6, 39, 4, 6, 8, 8, 15 };
    int[] y = { 94, 163, 266, 13, 164, 469, 452, 305, 135, 109, 257, 37, 65, 283, 205, 82, 341, 74, 81, 293, 327, 272, 236, 217, 263, 155, 56, 127, 393, 114, 258, 379, 240, 382, 346, 147, 314, 121, 406, 453, 185, 307, 425, 22, 432, 362 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case74() {
    int[] x = { -74, -16, -35, -28, -25, -12, -35, -39, -46, -38, -52, -2, 2, -48, -7, -14, -83, -31, -11, -60, -45, -52, -44, -22, -27, -34, -73, -65, -25, -52, -62, -41, -61, -30, -26, -26, -75, -26, -18, -11, -25, -47, -24, -2 };
    int[] y = { 462, 93, 283, 224, 133, 67, 289, 259, 242, 292, 330, 29, 9, 352, 78, 41, 405, 220, 62, 478, 498, 330, 271, 147, 194, 254, 395, 441, 118, 337, 427, 303, 372, 214, 156, 158, 392, 158, 179, 73, 107, 311, 519, 29 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case75() {
    int[] x = { 74, 40, 120, 91, 33, -16, 104, 103, 46, 74, 49, 71, 49, -3 };
    int[] y = { 279, 215, 465, 618, 174, 108, 449, 561, 322, 515, 370, 406, 366, 50 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case76() {
    int[] x = { -207, -212, -212, -235, -133, -226, -199, -138, -203, -93, -45, -138, -37, -37, -74 };
    int[] y = { 511, 439, 415, 469, 235, 372, 314, 249, 521, 188, 55, 249, 70, 101, 144 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case77() {
    int[] x = { -87, -73, -79, -20, -91, -83, -17, -14, 6, -10, -42, -10, -9, -58, -82, -63, -1, 6, -9, 0, -73, -10, 7, -83, -2, -80, -8, -29, -62, 7, -93, -63, 16, -85, -88, -88, -61, -89 };
    int[] y = { 492, 373, 565, 291, 436, 526, 242, 166, 108, 170, 316, 126, 142, 333, 550, 345, 194, 85, 147, 216, 417, 174, 12, 502, 56, 405, 70, 267, 340, 109, 457, 344, 34, 398, 448, 493, 350, 468 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case78() {
    int[] x = { 18, 18, 40, 37, 1, 56, 46, 7, 18, 41, 63, 25, 15, 9, 45, 0, 9, 39, 45, 4, 44, 0, 22, 20, 55, 56 };
    int[] y = { 365, 141, 390, 206, 5, 302, 229, 114, 161, 317, 272, 44, 32, 112, 327, 6, 94, 248, 236, 72, 191, 6, 361, 26, 292, 301 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case79() {
    int[] x = { 3, 51, 1, -12, 42, 0, 19, 13, 25, 15, 6, 0, 25, -2, 20, -15, -15, 15, 12, 22, 2 };
    int[] y = { 151, 323, 198, 485, 335, 167, 252, 232, 109, 375, 27, 21, 361, 430, 281, 478, 454, 243, 86, 396, 54 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case80() {
    int[] x = { -30, 0, -21, -10, -9, -4, -25, 2, -4, -4, -11, -7, -11, -7, 14, 23, -17, -3, 4, -3, -2, 2, 2, -9, -4, -7, 18, 20, -22, -2, -22, -4, -28, -7, 5, -4, -2, 6, -13 };
    int[] y = { 226, 353, 199, 315, 309, 138, 34, 390, 103, 72, 273, 150, 283, 172, 445, 413, 19, 91, 334, 102, 119, 127, 374, 64, 138, 174, 429, 416, 250, 159, 258, 74, 206, 293, 370, 326, 114, 344, 49 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case81() {
    int[] x = { -36, -44, 7, -26, -71, -50, -14, -36, -15 };
    int[] y = { 91, 111, 247, 205, 149, 105, 29, 91, 32 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case82() {
    int[] x = { -8, -63, 1, -69, -35, -36, -6, -65, -37, -63, -48, -60, -53, -62, -36, -29, -42, -53, -69, -45, -63, -47, -7, 1, -51, -53, -35, -7, -35, -53, -36, -35, -47, -35, -63, -35, -45, -34, -60, -63, -13, -36, -32, -44, -35, -44, -32, -33 };
    int[] y = { 33, 284, 6, 358, 231, 170, 28, 363, 176, 296, 125, 369, 383, 337, 170, 80, 118, 383, 355, 314, 282, 206, 47, 13, 323, 149, 169, 22, 92, 266, 170, 86, 137, 169, 285, 92, 317, 101, 340, 296, 62, 229, 245, 214, 86, 189, 243, 246 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case83() {
    int[] x = { -8, 2, 111, 98, 98, 41, 46, -41, 49, 69, -9, 86, 77, 41 };
    int[] y = { 111, 5, 391, 362, 270, 160, 496, 62, 205, 316, 109, 336, 429, 169 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case84() {
    int[] x = { 43, -13, 7, 62, 26, 39, 37, 36, 37, -4, 7, 23, 46, 56, 54, -7, 49, 33, 29, -4, 50, 0, -4, -13, 1 };
    int[] y = { 213, 116, 477, 409, 502, 367, 439, 282, 286, 62, 173, 508, 333, 245, 343, 35, 393, 294, 529, 98, 313, 162, 49, 138, 71 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case85() {
    int[] x = { 113, 109, 131, 56, 82, 90, 71, 90 };
    int[] y = { 182, 175, 225, 65, 422, 270, 378, 342 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case86() {
    int[] x = { -3 };
    int[] y = { 2 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case87() {
    int[] x = { 0, 0, 0, -1, 1, -2, -2, 0, 400, 0, -1, -1, 0, 4 };
    int[] y = { 0, 0, 1, 2, 4, 7, 8, 10, 430, 830, 840, 990, 999, 996 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case88() {
    int[] x = { -1, 1, 0 };
    int[] y = { 1, 2, 4 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case89() {
    int[] x = { 1, 2 };
    int[] y = { 8, 8 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case90() {
    int[] x = { 0 };
    int[] y = { 0 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case91() {
    int[] x = { -175, -28, -207, -29, -43, -183, -175, -112, -183, -31, -25, -66, -114, -116, -66 };
    int[] y = { 320, 107, 379, 72, 126, 445, 318, 255, 445, 62, 52, 184, 247, 245, 185 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case92() {
    int[] x = { 70, -108, 52, -70, 84, -29, 66, -33 };
    int[] y = { 141, 299, 402, 280, 28, 363, 427, 232 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case93() {
    int[] x = { -1, 0, 1 };
    int[] y = { 100, 200, 300 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case94() {
    int[] x = { 0, 2 };
    int[] y = { 3, 4 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case95() {
    int[] x = { 100, 99 };
    int[] y = { 100, 100 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case96() {
    int[] x = { -1, -1 };
    int[] y = { 1, 0 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case97() {
    int[] x = { 5, -10 };
    int[] y = { 10, 2 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case98() {
    int[] x = { 1, 100, 1 };
    int[] y = { 1, 105, 1 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case99() {
    int[] x = { 5, 7 };
    int[] y = { 5, 6 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case100() {
    int[] x = { 1, 2, 3 };
    int[] y = { 1, 2, 2 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case101() {
    int[] x = { 1, 10 };
    int[] y = { 10, 11 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case102() {
    int[] x = { -175, -28, -207, -29, -43, -183, -175, -112, -183, -31, -25, -66, -114, -116, -66 };
    int[] y = { 320, 106, 379, 72, 126, 445, 318, 255, 445, 62, 52, 184, 247, 245, 185 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case103() {
    int[] x = { 1 };
    int[] y = { 100 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case104() {
    int[] x = { -1, 1, 2 };
    int[] y = { 1, 3, 3 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case105() {
    int[] x = { -1 };
    int[] y = { 2 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case106() {
    int[] x = { -1, 1 };
    int[] y = { 1, 2 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case107() {
    int[] x = { 100 };
    int[] y = { 1 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case108() {
    int[] x = { 2, 1 };
    int[] y = { 2, 1 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case109() {
    int[] x = { 0, 1, 5, 1 };
    int[] y = { 0, 1, 1, 1 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case110() {
    int[] x = { 20, 21 };
    int[] y = { 20, 1 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case111() {
    int[] x = { 1 };
    int[] y = { 4 };
    assertEquals("Able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case112() {
    int[] x = { 10, 9 };
    int[] y = { 10, 1 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case113() {
    int[] x = { 1, 2 };
    int[] y = { 2, 2 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

  @Test
  public void case114() {
    int[] x = { 0, 3, 0 };
    int[] y = { 4, 3, 0 };
    assertEquals("Not able to catch", catchthebeateasy.ableToCatchAll(x, y));
  }

}
