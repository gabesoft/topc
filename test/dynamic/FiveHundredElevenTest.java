package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class FiveHundredElevenTest {
  FiveHundredEleven fivehundredeleven = new FiveHundredEleven();

  @Test
  public void case1() {
    int[] cards = { 3, 5, 7, 9, 510 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case2() {
    int[] cards = { 0, 0, 0, 0 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case3() {
    int[] cards = { 511 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case4() {
    int[] cards = { 0, 0, 0, 0, 0 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case5() {
    int[] cards = { 7, 56, 448 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case6() {
    int[] cards = { 511, 0 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case7() {
    int[] cards = { 511, 1 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case8() {
    int[] cards = { 1, 2, 4, 8, 16, 32, 64, 128, 256 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case9() {
    int[] cards = { 5, 58, 192, 256 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case10() {
    int[] cards = { 141, 248, 387, 366, 145, 54, 339, 246, 246, 273, 119, 484, 301, 423, 294, 81, 441, 150, 45, 396, 127, 169, 414, 397, 161, 413, 412, 106, 397, 407, 330, 380, 425, 482, 356, 37, 291, 24, 334, 456, 69, 13, 351, 279, 141, 64, 152, 449, 347, 179 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case11() {
    int[] cards = { 363, 6, 332, 264, 500, 471, 16, 59, 337, 72, 402, 61, 223, 489, 2, 84, 401, 128, 122, 285, 310, 337, 234, 207, 179, 379, 314, 490, 142, 53, 38, 361, 493, 464, 142, 57, 199, 150, 90, 444, 360, 287, 272, 293, 343, 429, 455, 277, 226, 71 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case12() {
    int[] cards = { 305, 183, 352, 175, 220, 212, 27, 421, 241, 221, 221, 244, 136, 487, 350, 132, 253, 46, 197, 241, 351, 403, 230, 404, 246, 176, 195, 15, 127, 96, 263, 199, 188, 308, 121, 219, 93, 318, 460, 73, 475, 62, 91, 141, 411, 328, 221, 310, 470, 265 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case13() {
    int[] cards = { 77, 389, 61, 361, 289, 255, 195, 13, 485, 476, 239, 317, 234, 310, 372, 426, 478, 29, 356, 30, 60, 439, 349, 261, 440, 117, 459, 253, 289, 495, 350, 167, 115, 492, 338, 394, 429, 243, 177, 368, 11, 282, 393, 227, 405, 372, 364, 56, 276, 160 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case14() {
    int[] cards = { 73, 400, 385, 275, 132, 9, 372, 111, 352, 386, 249, 301, 464, 250, 144, 1, 445, 76, 355, 184, 90, 410, 270, 301, 346, 264, 295, 22, 202, 254, 199, 403, 256, 479, 455, 65, 2, 208, 206, 409, 161, 107, 293, 314, 96, 450, 186, 373, 317, 318 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case15() {
    int[] cards = { 495, 255, 511, 510, 511, 507, 511, 495, 239, 407, 511, 223, 351, 255, 511, 511, 511, 221, 511, 347, 383, 479, 383, 511, 507, 247, 511, 247, 475, 383, 511, 495, 511, 479, 255, 510, 447, 503, 511, 427, 255, 383, 503, 159, 379, 510, 509, 125, 473, 509 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case16() {
    int[] cards = { 511, 255, 511, 255, 511, 511, 511, 511, 447, 509, 479, 319, 495, 511, 511, 511, 511, 247, 511, 479, 479, 511, 503, 478, 479, 511, 511, 509, 511, 511, 253, 511, 468, 479, 511, 507, 255, 511, 511, 503, 495, 382, 491, 511, 447, 510, 507, 511, 511, 511 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case17() {
    int[] cards = { 443, 503, 511, 479, 239, 383, 238, 455, 383, 191, 446, 431, 437, 249, 475, 495, 494, 479, 511, 319, 479, 511, 319, 495, 347, 511, 107, 367, 509, 447, 494, 495, 459, 511, 115, 382, 447, 509, 511, 511, 239, 463, 511, 378, 495, 447, 443, 220, 503, 479 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case18() {
    int[] cards = { 2, 0, 0, 0, 32, 0, 0, 0, 0, 64, 0, 32, 0, 0, 128, 8, 128, 0, 4, 0, 0, 1, 0, 0, 64, 0, 0, 128, 0, 16, 0, 8, 0, 18, 260, 257, 2, 0, 64, 0, 0, 0, 40, 0, 0, 1, 0, 0, 1, 0 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case19() {
    int[] cards = { 479, 511, 511, 511, 510, 511, 243, 511, 511, 511, 511, 487, 495, 511, 341, 509, 511, 479, 495, 443, 491, 511, 511, 507, 447, 375, 511, 479, 507, 479, 511, 479, 495, 479, 383, 367, 511, 511, 406, 511, 507, 507, 319, 511, 511, 510, 511, 447, 511, 509 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case20() {
    int[] cards = { 511, 509, 511, 511, 511, 511, 447, 510, 383, 511, 511, 127, 511, 351, 495, 506, 511, 187, 503, 255, 509, 255, 511, 511, 479, 511, 479, 383, 511, 187, 383, 383, 475, 511, 511, 447, 511, 507, 507, 509, 254, 479, 503, 511, 279, 507, 511, 509, 441, 495 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case21() {
    int[] cards = { 367, 14, 411, 32, 132, 82, 413, 367, 139, 380, 209, 296, 268, 152, 66, 286, 272, 22, 56, 353, 269, 323, 368, 481, 8, 342, 434, 389, 294, 462, 143, 238, 348, 454, 312, 120, 61, 230, 471, 162, 29, 475, 7, 359, 6, 105, 78, 482, 494, 276 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case22() {
    int[] cards = { 511, 510, 191, 507, 510, 511, 447, 503, 495, 511, 509, 499, 503, 511, 511, 511, 431, 379, 511, 503, 507, 511, 431, 511, 511, 495, 509, 511, 511, 510, 511, 507, 511, 494, 511, 375, 509, 509, 479, 382, 379, 511, 511, 247, 511, 511, 479, 510, 511, 511 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case23() {
    int[] cards = { 505, 215, 501, 254, 255, 186, 505, 88, 475, 414, 440, 504, 511, 439, 351, 503, 55, 250, 340, 187, 241, 95, 285, 374, 350, 370, 495, 225, 498, 408, 216, 474, 381, 46, 125, 403, 285, 504, 207, 153, 262, 225, 215, 495, 467, 497, 223, 311, 412, 303 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case24() {
    int[] cards = { 0, 6, 0, 256, 192, 2, 33, 320, 0, 288, 0, 32, 0, 64, 26, 4, 0, 256, 0, 0, 1, 0, 8, 64, 0, 16, 0, 4, 0, 32, 192, 64, 0, 384, 4, 0, 130, 128, 1, 1, 0, 0, 8, 257, 0, 256, 0, 0, 16, 32 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case25() {
    int[] cards = { 170, 256, 478, 508, 347, 137, 218, 478, 42, 69, 96, 420, 48, 0, 110, 178, 29, 449, 101, 161, 16, 250, 364, 276, 261, 23, 144, 321, 103, 474, 202, 128, 431, 149, 145, 146, 318, 264 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case26() {
    int[] cards = { 471, 40, 419, 88, 18, 60, 232, 229, 402, 397, 391, 221, 320, 464, 10, 284, 84, 64, 123, 436, 509 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case27() {
    int[] cards = { 16, 128, 178, 16, 0, 21, 48, 34, 0, 29, 193, 0, 272, 16, 4, 2, 140, 40, 65, 3, 171, 280, 19, 73, 129, 225, 68, 50, 2, 42, 0, 64, 128, 28, 18, 78, 136, 272, 75, 1 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case28() {
    int[] cards = { 461, 443, 177, 366, 499, 384, 125, 499, 372, 374, 39, 285, 203, 33, 429, 469, 458, 163, 154, 438, 508 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case29() {
    int[] cards = { 156, 65, 473, 94, 57, 262 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case30() {
    int[] cards = { 217, 42, 4, 397, 281, 451, 245, 234, 353, 467, 35, 65, 412, 287, 247, 196, 419, 188, 28, 501, 105, 245, 194, 345, 421, 302, 87 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case31() {
    int[] cards = { 159, 16, 176, 141, 132, 1, 132, 264, 74, 50, 199, 287, 337, 386, 313, 26, 495, 281, 206, 481, 136, 185, 96, 479, 430, 1, 18, 128, 343, 483, 19, 70, 14, 401, 115, 19, 64, 326, 382, 74, 227, 50, 509 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case32() {
    int[] cards = { 438, 477, 381, 503, 399, 106, 501, 509, 494, 495, 383, 502, 241, 475, 493, 186, 505, 246, 414, 205 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case33() {
    int[] cards = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case34() {
    int[] cards = { 399, 351, 286, 155, 41, 214, 18, 415, 267, 503, 293, 369, 394, 118, 297, 406, 73, 227, 397, 342, 394, 490 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case35() {
    int[] cards = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case36() {
    int[] cards = { 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511, 511 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case37() {
    int[] cards = { 0 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case38() {
    int[] cards = { 1, 193, 0, 37, 272, 134, 264, 396, 64 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case39() {
    int[] cards = { 132, 0, 4, 5, 0, 2, 80, 256, 256, 1, 0, 6, 130, 130, 96, 33, 0, 32, 160, 128, 8, 452, 0, 16, 192, 216, 40, 128, 0, 136, 81, 18, 148 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case40() {
    int[] cards = { 181, 225, 80, 450, 352, 399, 126, 63, 260, 409, 63, 484, 339, 383, 98, 300, 125, 158, 204, 267 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case41() {
    int[] cards = { 5, 144, 256, 0, 0, 224, 36, 0, 0, 1, 2, 64, 64, 0, 49, 0, 4, 256, 0, 33, 0, 0, 4, 4 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case42() {
    int[] cards = { 483, 239, 481, 241, 453, 226, 510, 511, 482, 244, 481 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case43() {
    int[] cards = { 237, 479, 398, 374, 413, 263, 494, 411, 423, 437, 317, 489, 92, 283, 488, 430, 479, 287, 474 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case44() {
    int[] cards = { 163, 404, 132, 283, 2, 416, 265, 344, 283, 9, 176, 368 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case45() {
    int[] cards = { 141, 128, 9, 16, 8, 8, 268, 4, 384, 128, 32, 128, 34, 20, 1, 256, 336, 130, 3, 132, 68, 8 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case46() {
    int[] cards = { 0, 2, 256, 6, 256, 92, 256, 264, 1, 64, 0, 8, 64, 4, 256, 0, 64, 1, 0, 0, 3, 260, 0, 48, 2, 80, 256, 0, 2, 256, 257, 16, 0, 32, 32, 130, 0, 64, 80, 0, 266, 80, 80, 1, 273 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case47() {
    int[] cards = { 141, 235, 461, 118, 57, 152, 478, 398, 440, 350, 185, 302, 383, 230, 253, 511, 113 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case48() {
    int[] cards = { 38, 32, 9, 10, 212, 162, 256, 281, 64, 326, 97, 85, 16, 9, 0, 32, 0, 0, 356, 108, 65, 132, 8, 31, 4, 264, 168, 256, 32, 5, 32, 385, 16, 4, 1, 48, 69, 164, 133, 0, 1, 136, 129, 283, 240, 168, 32, 133, 420, 128 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case49() {
    int[] cards = { 423, 167, 93, 113, 115, 160, 111, 419, 56, 298, 181, 393, 254, 206, 8, 501, 140, 140, 151, 179, 501, 386, 172, 241, 46, 275, 45, 92, 122, 457, 139, 345, 485, 1, 377, 31, 187, 317, 382, 349, 191, 370, 172, 70, 406, 473, 429, 255, 433, 87 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case50() {
    int[] cards = { 484, 484, 16, 168, 186, 288, 52, 322, 0, 2, 49, 200, 8, 40, 168, 144, 128, 116, 1, 140, 4, 40, 386, 256, 256, 16, 88, 0, 113, 34, 32, 12, 260, 65, 256, 32, 16, 32, 5, 0, 321, 64, 144, 67, 112, 464, 68, 48, 141, 132 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case51() {
    int[] cards = { 34, 97, 0, 2, 32, 8, 129, 17, 0, 322, 0, 24, 16, 32, 18, 288, 260, 4, 2, 192, 0, 68, 0, 96, 8, 0, 64, 64, 272, 4, 272, 0, 268, 2, 128, 112, 2, 448, 128, 4, 128, 64, 6, 32, 96, 8, 4, 0, 8, 256 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case52() {
    int[] cards = { 40, 97, 218, 333, 370, 266, 55, 450, 260, 209, 377, 228, 97, 0, 32, 146, 324, 96, 141, 1, 348, 52, 328, 336, 65, 209, 48, 244, 8, 292, 34, 58, 16, 211, 433, 28, 4, 389, 74, 97, 86, 436, 164, 362, 418, 2, 8, 0, 50, 467 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case53() {
    int[] cards = { 128, 207, 40, 36, 296, 4, 17, 82, 258, 129, 266, 8, 32, 2, 132, 224, 0, 178, 12, 0, 1, 96, 1, 12, 64, 32, 65, 96, 256, 18, 80, 22, 128, 128, 9, 263, 384, 164, 420, 0, 288, 0, 304, 471, 1, 1, 0, 64, 70, 42 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case54() {
    int[] cards = { 68, 0, 256, 16, 448, 28, 160, 0, 402, 267, 4, 40, 8, 137, 322, 0, 33, 16, 48, 1, 2, 0, 32, 32, 276, 130, 136, 10, 1, 16, 128, 2, 325, 4, 8, 0, 128, 18, 16, 258, 36, 146, 2, 0, 130, 16, 24, 2, 0, 260 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case55() {
    int[] cards = { 3, 170, 387, 48, 368, 194, 388, 120, 432, 46, 72, 47, 78, 12, 110, 341, 161, 177, 320, 4, 312, 80, 295, 304, 283, 148, 8, 353, 413, 165, 70, 166, 374, 226, 316, 123, 120, 71, 35, 192, 441, 303, 77, 81, 275, 404, 17, 14, 132, 337 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case56() {
    int[] cards = { 0, 0, 0, 0, 4, 0, 1, 2, 18, 144, 96, 160, 65, 0, 4, 8, 16, 8, 12, 16, 64, 64, 100, 0, 64, 128, 2, 0, 4, 72, 0, 1, 16, 48, 6, 64, 384, 256, 32, 133, 20, 7, 0, 1, 0, 40, 64, 392, 65, 18 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case57() {
    int[] cards = { 152, 24, 131, 64, 338, 9, 168, 32, 0, 12, 130, 12, 16, 68, 133, 0, 32, 40, 0, 40, 0, 0, 64, 32, 8, 0, 0, 2, 234, 8, 264, 2, 304, 0, 256, 16, 9, 64, 256, 386, 8, 73, 0, 41, 17, 224, 16, 9, 91, 3 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case58() {
    int[] cards = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case59() {
    int[] cards = { 256, 8, 8, 1, 8, 1, 4, 32, 32, 32, 256, 128, 0, 1, 8, 1, 16, 1, 8, 0, 2, 16, 0, 32, 256, 256, 64, 16, 2, 16, 16, 1, 8, 64, 256, 256, 32, 64, 1, 2, 32, 256, 1, 0, 128, 64, 128, 2, 1, 16 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case60() {
    int[] cards = { 32, 256, 256, 2, 4, 4, 8, 4, 2, 1, 2, 128, 16, 4, 32, 16, 256, 256, 32, 8, 2, 1, 32, 0, 128, 8, 32, 8, 4, 32, 128, 16, 16, 2, 2, 32, 4, 32, 4, 1, 64, 128, 8, 1, 64, 256, 2, 256, 16, 128 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case61() {
    int[] cards = { 127, 511, 7, 1, 3, 127, 1, 1, 511, 7, 31, 3, 15, 31, 7, 127, 1, 3, 31, 255, 3, 511, 1, 31, 15, 1, 63, 255, 255, 15, 15, 63, 255, 7, 31, 7, 511, 31, 63, 15, 255, 15, 63, 63, 1, 127, 1, 127, 127, 15 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case62() {
    int[] cards = { 255, 1, 127, 511, 0, 511, 0, 31, 7, 127, 0, 511, 63, 511, 127, 511, 0, 7, 3, 7, 7, 511, 0, 1, 0, 511, 31, 255, 0, 127, 255, 255, 31, 1, 63, 15, 255, 3, 127, 127, 15, 15, 255, 127, 127, 31, 1, 63, 3, 31 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case63() {
    int[] cards = { 128, 256, 0, 0, 64, 4, 2, 4, 32, 1, 4, 32, 128, 64, 128, 128, 128, 2, 32, 16, 256, 128, 256, 16, 4, 16, 16, 256, 8, 1, 16, 128, 1, 8, 256, 32, 32, 8, 32, 128, 32, 4, 16, 2, 1, 1, 128, 256, 4, 2 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case64() {
    int[] cards = { 0, 128, 2, 64, 2, 64, 0, 4, 32, 64, 16, 1, 32, 256, 16, 128, 256, 32, 256, 0, 0, 1, 32, 0, 2, 2, 64, 2, 64, 0, 64, 0, 0, 4, 32, 32, 32, 64, 0, 2, 1, 0, 64, 4, 8, 0, 16, 128, 4, 8 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case65() {
    int[] cards = { 0, 0, 0, 0, 0, 127, 511, 0, 0, 0, 0, 1, 511, 255, 255, 0, 255, 127, 0, 0, 0, 0, 31, 15, 0, 0, 255, 31, 3, 0, 0, 0, 0, 31, 0, 0, 0, 0, 0, 0, 63, 0, 0, 127, 0, 0, 3, 7, 0, 63 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case66() {
    int[] cards = { 0, 15, 0, 127, 3, 63, 0, 127, 63, 0, 511, 3, 0, 31, 63, 0, 15, 511, 7, 255, 127, 0, 63, 7, 127, 1, 511, 511, 0, 511, 255, 7, 1, 511, 1, 3, 0, 127, 511, 511, 63, 0, 0, 63, 15, 511, 255, 1, 31, 31 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case67() {
    int[] cards = { 4, 32, 0, 64, 2, 1, 64, 32, 0, 1, 4, 2, 32, 4, 0, 16, 2, 32, 128, 0, 16, 128, 128, 0, 0, 0, 64, 0, 32, 8, 0, 0, 2, 16, 1, 64, 8, 4, 1, 4, 0, 0, 256, 0, 16, 2, 2, 1, 128, 1 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case68() {
    int[] cards = { 16, 2, 32, 2, 1, 8, 4, 1, 16, 32, 16, 8, 16, 256, 64, 32, 8, 8, 128, 256, 64, 1, 8, 8, 8, 1, 2, 1, 16, 4, 128, 4, 1, 8, 64, 2, 32, 32, 256, 64, 128, 8, 1, 32, 8, 2, 8, 128, 64, 2 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case69() {
    int[] cards = { 15, 31, 63, 0, 31, 15, 3, 15, 0, 3, 3, 0, 255, 15, 0, 63, 0, 0, 7, 255, 0, 0, 31, 0, 7, 0, 31, 7, 1, 127, 7, 0, 0, 1, 511, 1, 255, 0, 63, 1, 0, 0, 255, 255, 1, 0, 31, 0, 511, 0 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case70() {
    int[] cards = { 1, 255, 511, 255, 1, 31, 7, 511, 3, 511, 255, 31, 1, 255, 255, 63, 7, 255, 1, 511, 1, 255, 255, 63, 127, 63, 15, 3, 1, 15, 31, 31, 127, 63, 127, 255, 511, 127, 127, 31, 31, 127, 255, 63, 511, 3, 3, 3, 63, 511 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case71() {
    int[] cards = { 16, 128, 4, 4, 8, 2, 8, 256, 8, 32, 16, 8, 2, 64, 0, 0, 2, 4, 16, 8, 1, 0, 64, 8, 8, 64, 128, 1, 8, 2, 4, 1, 1, 32, 256, 0, 64, 2, 0, 256, 64, 64, 16, 8, 32, 0, 8, 128, 2, 16 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case72() {
    int[] cards = { 8, 0, 0, 16, 128, 256, 4, 32, 8, 1, 0, 2, 2, 0, 16, 0, 64, 4, 0, 0, 4, 0, 0, 8, 0, 4, 2, 0, 16, 32, 32, 0, 0, 128, 1, 32, 32, 64, 1, 0, 16, 0, 64, 16, 64, 256, 16, 128, 0, 0 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case73() {
    int[] cards = { 31, 511, 63, 3, 3, 511, 127, 511, 7, 63, 63, 1, 0, 3, 3, 7, 0, 127, 7, 511, 127, 3, 0, 127, 511, 15, 127, 0, 7, 511, 7, 127, 1, 7, 511, 15, 31, 255, 1, 15, 3, 31, 15, 0, 127, 511, 7, 255, 31, 31 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case74() {
    int[] cards = { 63, 0, 7, 31, 0, 0, 0, 0, 0, 31, 511, 63, 0, 31, 511, 255, 1, 31, 1, 0, 0, 0, 1, 511, 1, 0, 0, 0, 1, 0, 0, 0, 15, 31, 7, 63, 511, 0, 0, 0, 255, 127, 3, 63, 511, 511, 7, 511, 7, 127 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case75() {
    int[] cards = { 1, 128, 4, 1, 32, 128, 4, 8, 8, 0, 32, 4, 128, 8, 0, 0, 8, 32, 0, 8, 0, 0, 4, 256, 8, 0, 16, 0, 1, 64, 1, 128, 0, 256, 32, 16, 2, 2, 2, 64, 8, 16, 2, 2, 0, 64, 128, 2, 128, 64 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case76() {
    int[] cards = { 8, 1, 256, 64, 1, 1, 8, 4, 0, 8, 4, 2, 4, 8, 256, 32, 8, 2, 0, 128, 16, 64, 16, 64, 128, 0, 8, 1, 4, 64, 1, 128, 1, 1, 4, 2, 128, 16, 2, 4, 16, 2, 64, 16, 1, 256, 128, 256, 1, 8 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case77() {
    int[] cards = { 0, 31, 511, 511, 1, 0, 7, 0, 127, 511, 3, 7, 31, 7, 511, 15, 15, 1, 15, 31, 15, 0, 15, 511, 15, 3, 127, 3, 1, 255, 0, 63, 255, 0, 63, 127, 1, 511, 7, 3, 3, 511, 511, 63, 1, 63, 0, 0, 0, 255 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case78() {
    int[] cards = { 7, 3, 3, 7, 15, 31, 0, 1, 127, 1, 255, 255, 31, 31, 3, 511, 7, 31, 31, 7, 0, 511, 255, 255, 63, 15, 7, 3, 15, 15, 15, 63, 127, 127, 31, 255, 255, 3, 255, 255, 7, 1, 63, 3, 127, 1, 63, 3, 31, 511 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case79() {
    int[] cards = { 1, 16, 256, 1, 64, 16, 1, 32, 8, 2, 128, 128, 16, 16, 16, 64, 16, 8, 16, 1, 32, 2, 16, 0 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case80() {
    int[] cards = { 1, 0, 16 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case81() {
    int[] cards = { 63, 1, 31, 7, 3, 127, 7, 511, 127, 1, 1, 127, 1, 63, 127, 3, 0, 3, 0 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case82() {
    int[] cards = { 3, 1, 1, 63, 1, 511, 0, 1 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case83() {
    int[] cards = { 1, 256, 16, 256, 1, 128, 4, 256, 128, 16, 256, 1, 4, 128, 64, 16, 8, 1, 16, 16, 32, 16, 16, 8, 16, 16, 32, 32, 16, 2, 16, 64 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case84() {
    int[] cards = { 0, 128, 8, 64, 8, 1, 8, 4, 32, 256, 8, 2, 1, 128, 8, 2, 64, 4, 1, 32, 256, 8, 4, 256, 128 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case85() {
    int[] cards = { 511, 3, 511, 255, 0, 255, 3, 1, 31, 1, 63, 31, 63, 15, 0, 1 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case86() {
    int[] cards = { 3, 511, 127, 255, 31, 1, 3, 31, 1, 127, 31, 7, 3, 511, 7, 511, 511 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case87() {
    int[] cards = { 8, 4, 16, 256, 32, 0, 4, 0, 0, 4, 64, 2, 0, 32, 256, 256, 4, 16, 256, 4 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case88() {
    int[] cards = { 0, 16, 0, 0, 0, 0, 16, 128, 0, 0, 0, 0, 2, 0, 0, 128, 0, 0, 0 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case89() {
    int[] cards = { 1, 7, 63, 31, 1, 7, 7, 1, 127, 15, 1, 3, 1, 255, 7, 3, 1, 7, 15, 127, 1, 15, 511, 1, 127 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case90() {
    int[] cards = { 0, 7, 1, 15, 0, 0, 127, 0, 7, 0, 31, 0, 1, 63, 0, 0, 255, 0, 0, 127, 0, 511, 0, 127, 63, 1, 0, 15, 31, 1, 0, 31, 127, 3, 511, 1, 0, 0, 63, 7, 127, 1, 7, 511, 511, 7, 31, 3, 1 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case91() {
    int[] cards = { 256, 0, 8, 0, 0, 8, 0, 0, 0, 128, 16, 0, 0, 2, 4, 0, 4, 0 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case92() {
    int[] cards = { 0, 0, 8 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case93() {
    int[] cards = { 7, 7, 127, 31, 1, 0, 31, 63, 1, 0, 63, 3, 63, 15, 0, 7, 3, 15 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case94() {
    int[] cards = { 31, 0, 15, 7, 0, 0, 127, 255, 63, 0, 7, 0, 0, 0, 0, 0, 0, 0, 31 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case95() {
    int[] cards = { 128, 32, 0, 8, 64, 128, 2, 0 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case96() {
    int[] cards = { 0, 0, 0, 0, 128, 0, 0, 0, 0, 0, 0, 0, 4, 64, 64, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 128, 0, 0, 0, 0, 0, 0, 128, 128, 32, 16, 0, 256, 128, 0, 0 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case97() {
    int[] cards = { 1, 511, 1, 511, 127, 31, 63, 127, 255, 15, 127, 1, 127, 255, 1, 7, 3, 3, 31, 31, 1, 15, 127, 127, 63, 127, 1, 511, 3, 255, 3, 15, 63, 3, 255 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case98() {
    int[] cards = { 255, 0, 0, 1, 0, 0, 0, 7, 0, 63, 0, 1, 0, 0, 127 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case99() {
    int[] cards = { 196, 22, 265, 68, 371, 155, 250, 408, 224, 452, 222, 510, 400, 511, 78, 189, 155, 467, 140, 0, 213, 141, 41, 35, 459, 287, 164, 38, 184, 119, 500, 380, 142, 254, 448, 1, 409, 186, 409, 122, 126, 119, 120, 14, 275, 199, 204, 430, 154, 344 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case100() {
    int[] cards = { 1, 1, 510, 510 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case101() {
    int[] cards = { 511 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case102() {
    int[] cards = { 3, 5, 7, 9, 510 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case103() {
    int[] cards = { 1, 2, 4, 8, 16, 32, 64, 128, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, 210, 220, 230, 240, 250, 260, 270, 280, 290, 300, 310, 320, 330, 340, 350, 360, 370, 380, 390, 400, 410, 420, 430, 440, 450, 460, 470, 480, 490, 500 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case104() {
    int[] cards = { 0, 0, 0, 0 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case105() {
    int[] cards = { 510 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case106() {
    int[] cards = { 0, 1, 2, 64, 4, 128, 6, 256, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case107() {
    int[] cards = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 201, 202, 203, 204, 205, 192, 193, 64, 88, 500, 501, 502, 68, 68, 64, 64, 499, 511, 393, 423, 431, 54, 31, 456, 67, 44, 13 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case108() {
    int[] cards = { 128, 1, 2, 3, 4, 5, 6, 129, 8, 9, 10, 12, 258, 256, 16, 17, 18, 20, 24, 132, 260, 32, 33, 34, 36, 40, 257, 48, 136, 192, 64, 65, 66, 68, 130, 72, 160, 288, 80, 320, 384, 96, 144, 272, 264, 0, 0, 0, 0, 0 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case109() {
    int[] cards = { 2, 4, 8, 16, 32, 64, 128, 256, 1, 1, 2, 4, 298, 154, 35, 267, 324, 233, 169, 243, 433, 159, 124, 486, 296, 493, 455, 350, 478, 292, 63, 350, 390, 160, 373, 99, 205, 165, 348, 475, 406, 330, 29, 192, 484, 65, 460, 296, 298, 117 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case110() {
    int[] cards = { 256, 128, 64, 32, 16, 8, 4, 1, 2, 33, 34, 36, 144, 80, 40, 288, 160, 272, 48, 264, 72, 260, 258, 257, 192, 68, 66, 65, 3, 18, 17, 129, 5, 20, 130, 384, 12, 24, 96, 132, 10, 9, 136, 6, 320, 104, 112, 176, 193, 0 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case111() {
    int[] cards = { 269, 171, 303, 86, 338, 219, 335, 393, 418, 359, 457 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case112() {
    int[] cards = { 29, 29, 23, 43, 45, 65, 453, 432, 234, 211, 123, 29, 29, 23, 43, 45, 65, 453, 432, 234, 211, 123, 29, 29, 23, 43, 45, 65, 453, 432, 234, 211, 123, 29, 29, 23, 43, 45, 65, 453 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case113() {
    int[] cards = { 511, 12, 324, 5, 7, 8 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case114() {
    int[] cards = { 0, 0, 0 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case115() {
    int[] cards = { 81, 504, 0, 348, 64, 348, 155, 343, 365, 383, 378, 33, 148, 375, 267, 132, 235, 117, 140, 468, 385, 151, 304, 328, 392, 159, 196, 328, 338, 356, 466, 391, 152, 135, 70, 403, 128, 41, 271, 491, 287, 155, 392, 464, 125, 470, 88, 286, 345 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case116() {
    int[] cards = { 23, 40, 462, 2, 7 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case117() {
    int[] cards = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 23, 24, 25, 26, 71, 72, 73, 74, 110, 111, 112, 113, 200, 210, 220, 300, 400, 401, 402, 403, 510, 450, 480, 300, 400, 1, 2, 119, 118, 117, 250, 280, 281, 283, 285, 289 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case118() {
    int[] cards = { 2, 2, 511 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case119() {
    int[] cards = { 511, 12, 2, 1 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case120() {
    int[] cards = { 511, 511 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case121() {
    int[] cards = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case122() {
    int[] cards = { 511, 12, 324, 5, 7, 8, 34, 67, 89 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case123() {
    int[] cards = { 0, 511 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case124() {
    int[] cards = { 510, 510, 1, 1 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case125() {
    int[] cards = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 0 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case126() {
    int[] cards = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 40, 307, 11, 233, 173, 77, 107, 57, 270, 321, 319, 296, 28, 266, 25, 267, 218, 15, 146, 5, 4, 140, 246, 252, 115, 217, 59, 82, 273, 128, 164, 85, 299, 274, 276, 10, 20, 72, 50, 119 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case127() {
    int[] cards = { 511, 2 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case128() {
    int[] cards = { 3, 3, 510, 510 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case129() {
    int[] cards = { 510, 510 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case130() {
    int[] cards = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 3, 5, 6, 9, 10, 12, 17, 18, 20, 24, 33, 34, 36, 40, 48, 65, 66, 68, 72, 80, 96, 129, 130, 132, 136, 144, 160, 192, 257, 258, 260, 264, 272, 288, 320, 384, 7, 11, 13, 14, 19 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case131() {
    int[] cards = { 511, 1 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case132() {
    int[] cards = { 0, 1, 2, 4, 8, 16, 32, 64, 128, 256, 0, 1, 2, 4, 8, 16, 32, 64, 128, 256, 0, 1, 2, 4, 8, 16, 32, 64, 128, 256, 0, 1, 2, 4, 8, 16, 32, 64, 128, 256, 0, 1, 2, 4, 8, 16, 32, 64, 128, 256 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case133() {
    int[] cards = { 1, 2, 2, 2, 2, 2, 2, 4, 4, 4, 4, 4, 4, 8, 8, 8, 8, 8, 8, 16, 16, 16, 16, 16, 16, 32, 32, 32, 32, 32, 32, 64, 64, 64, 64, 64, 64, 128, 128, 128, 128, 128, 128, 256, 256, 2, 2, 2, 2, 2 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case134() {
    int[] cards = { 500, 10, 1 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case135() {
    int[] cards = { 510, 2, 1 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case136() {
    int[] cards = { 511, 0, 0 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case137() {
    int[] cards = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case138() {
    int[] cards = { 1, 2, 6, 89, 434, 432, 213, 243, 64, 82, 21, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 13, 16, 18, 12, 56, 51, 111, 511, 23, 321, 435, 64, 78, 88, 2, 4, 3, 7, 13, 31, 63, 127, 255, 511, 2 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case139() {
    int[] cards = { 1 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case140() {
    int[] cards = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 4, 8, 16, 32, 64, 128, 256, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case141() {
    int[] cards = { 41, 35, 190, 388, 225, 364, 214, 174, 338, 400, 73, 497, 241, 443, 233, 491, 435, 166, 219, 316, 135, 268, 318, 153, 292, 94, 13, 284, 262, 439, 327, 222, 435, 274, 333, 456, 67, 187, 139, 166, 31, 259, 90, 125, 265, 56, 293, 31, 93, 212 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case142() {
    int[] cards = { 2, 510, 3 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case143() {
    int[] cards = { 0, 0, 0, 0, 511 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case144() {
    int[] cards = { 79, 13, 32, 208, 296, 496, 46, 360, 315, 3, 355, 163, 86, 442, 35, 100, 279, 281, 421, 493, 41, 382, 178, 78, 432, 185, 182, 461, 158, 49, 150, 220, 508, 486, 283, 108, 220, 501, 461, 65, 484, 168, 396, 60, 56, 234, 382, 412, 14, 394 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case145() {
    int[] cards = { 2, 0, 1, 2, 4, 0, 1, 8, 10, 256, 1, 64, 32, 1, 8, 8, 8, 12, 15, 500, 6, 120, 1, 3, 7, 16, 15, 3, 8, 19, 480, 2, 3, 1, 35, 22, 33, 18, 22, 111, 100, 99, 80, 5, 355, 455, 400, 8 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case146() {
    int[] cards = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 1, 2, 4, 8, 16, 32, 64, 128, 256, 1, 2, 4, 8, 16, 32, 64, 128, 256, 1, 2, 4, 8, 16, 32, 64, 128, 256, 1, 2, 4, 8, 16, 32, 64, 128, 256, 1, 2, 4, 8, 16 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case147() {
    int[] cards = { 135, 112, 489, 62, 161, 65, 225, 508, 359, 62, 257, 126, 151, 490, 220 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case148() {
    int[] cards = { 3, 5, 6, 7, 14, 17, 21, 22, 26, 34, 35, 38, 40, 48, 50, 52, 56, 65, 66, 72, 76, 81, 84, 88, 97, 130, 131, 134, 136, 144, 146, 148, 162, 168, 194, 208, 260, 261, 268, 274, 276, 280, 292, 296, 304, 321, 328, 352, 388, 392 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case149() {
    int[] cards = { 5, 7, 9, 510 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case150() {
    int[] cards = { 0, 0, 0, 511, 1 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case151() {
    int[] cards = { 511, 510, 509, 508, 123, 124, 134, 35, 54, 12, 1, 34, 54, 77, 85, 78, 12, 11, 10, 9, 8, 7, 8, 4, 5, 33, 44, 55, 66, 77, 88, 99, 14, 88 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case152() {
    int[] cards = { 510, 508, 506, 504, 507 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case153() {
    int[] cards = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 448 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case154() {
    int[] cards = { 5, 58, 192, 256 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case155() {
    int[] cards = { 229, 102, 196, 62, 75, 228, 42, 253, 69, 58, 126, 157, 33, 37, 72, 238, 50, 45, 223, 135, 254, 42, 194, 208, 86, 148, 34, 213, 54, 225, 123, 91, 235, 201, 75, 205, 201, 141, 19, 61, 144, 84, 240, 147, 63, 183, 90, 246, 430, 256 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case156() {
    int[] cards = { 0, 0, 511 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case157() {
    int[] cards = { 511, 1, 1 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case158() {
    int[] cards = { 7 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case159() {
    int[] cards = { 1, 23, 511, 245, 89, 67, 234, 345, 321, 501, 23, 456, 34, 35, 38, 53, 56, 212, 222, 267 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case160() {
    int[] cards = { 511, 1, 510 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case161() {
    int[] cards = { 127, 128, 256 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case162() {
    int[] cards = { 511, 0 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case163() {
    int[] cards = { 336, 114, 85, 454, 347, 339, 499, 111, 23 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case164() {
    int[] cards = { 1, 7, 510 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case165() {
    int[] cards = { 1, 2, 510 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case166() {
    int[] cards = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 511 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case167() {
    int[] cards = { 3, 60, 60, 60, 448, 60 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case168() {
    int[] cards = { 448, 56, 7 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case169() {
    int[] cards = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 64, 128, 256, 65, 66, 257, 300 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case170() {
    int[] cards = { 256, 128, 64, 32, 16, 8, 4, 2, 1, 256, 128, 64, 32, 16, 8, 4, 2, 1, 256, 128, 64, 32, 16, 8, 4, 2, 1, 256, 128, 64, 32, 16, 8, 4, 2, 1, 256, 128, 64, 32, 16, 8, 4, 2, 1, 0, 0, 0, 0, 0 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case171() {
    int[] cards = { 504, 283, 488, 487, 397, 374, 346, 302 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case172() {
    int[] cards = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 511 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case173() {
    int[] cards = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case174() {
    int[] cards = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 511 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case175() {
    int[] cards = { 255, 256, 1 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case176() {
    int[] cards = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 1, 1, 5 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case177() {
    int[] cards = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 0, 1, 2, 4, 8, 16, 32, 64, 128, 256, 0, 1, 2, 4, 8, 16, 32, 64, 128, 256, 0, 1, 2, 4, 8, 16, 32, 64, 128, 256, 0, 1, 2, 4, 8, 16, 32, 64, 128, 256, 0 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case178() {
    int[] cards = { 0, 1, 2, 4, 8, 16, 32, 64, 128, 256 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case179() {
    int[] cards = { 3, 5, 7, 9, 510, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case180() {
    int[] cards = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 3, 5, 9, 17, 33, 65, 129, 257, 6, 10, 18, 34, 66, 130, 258, 12, 20, 36, 68, 132, 260, 24, 40, 72, 136, 264, 48, 80, 144, 272, 96, 160, 288, 192, 320, 384 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case181() {
    int[] cards = { 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 4, 4, 4, 4, 4, 8, 8, 8, 8, 8, 8, 16, 16, 16, 16, 16, 32, 32, 32, 32, 32, 32, 64, 64, 64, 64, 64, 128, 128, 128, 128, 128, 128, 256, 256, 256, 256, 256 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case182() {
    int[] cards = { 3, 5, 7, 9, 510, 1, 2, 3, 4, 5, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 5, 5, 5, 5, 5, 5, 5, 5 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case183() {
    int[] cards = { 336, 263, 318, 468, 58, 389, 318, 217, 43, 306, 325, 374, 98, 416, 248, 377, 483, 161, 222, 144, 289, 189, 491 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case184() {
    int[] cards = { 0 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case185() {
    int[] cards = { 65, 34, 98, 45, 1, 32, 45, 90, 123, 32, 345, 268, 188 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case186() {
    int[] cards = { 1, 255, 256 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case187() {
    int[] cards = { 1, 2, 508, 1 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case188() {
    int[] cards = { 510, 127, 120 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case189() {
    int[] cards = { 142, 466, 338, 450, 414, 366, 56, 341 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case190() {
    int[] cards = { 3, 5, 7, 9, 510, 0 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case191() {
    int[] cards = { 5, 58, 192, 256, 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 23, 34, 56, 35, 123, 34, 87, 125, 167, 134, 345, 124, 153, 34, 87, 67, 90, 78, 65, 43, 12, 45, 67, 345, 65 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case192() {
    int[] cards = { 127, 256, 128, 63, 64, 62 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case193() {
    int[] cards = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 480 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case194() {
    int[] cards = { 1, 3, 5, 7, 9, 510, 412, 89, 13 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case195() {
    int[] cards = { 10, 5, 1, 10, 12, 4, 5, 9, 1, 6, 2, 5, 15, 10, 5, 11, 7, 7, 10, 8, 4, 6, 7, 10, 0, 3, 5, 8, 0, 13, 4, 11, 3, 12, 9, 0, 2, 0, 3, 14, 12, 0, 1, 13, 6, 16, 32, 64, 128, 256 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case196() {
    int[] cards = { 1, 2, 511 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case197() {
    int[] cards = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 510 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case198() {
    int[] cards = { 4, 510, 3 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case199() {
    int[] cards = { 0, 1, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 55, 5, 6, 7, 8, 8, 7, 8, 7, 6, 5, 4 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case200() {
    int[] cards = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 5, 15, 25, 35, 45, 55, 65, 75, 85, 95, 105, 11, 12, 14, 18, 116, 132, 164, 228, 356, 87, 415, 425, 435, 445, 455, 465, 475, 485, 495, 505, 401, 402, 403, 404, 405, 406, 407, 408, 409, 410 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case201() {
    int[] cards = { 434, 418, 213, 230, 420, 198, 188, 119, 351, 397, 195, 143, 214, 298, 33, 276, 425, 212, 260, 17, 1, 280, 141, 430, 187, 371, 28, 96, 202, 32, 463, 349, 470, 47, 69, 339, 41, 471, 424, 345, 460, 269, 490, 38, 237, 85, 78, 384, 388, 473 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case202() {
    int[] cards = { 511, 0, 0, 0 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case203() {
    int[] cards = { 41, 35, 190, 388, 225, 364, 214, 174, 338, 400, 73, 497, 241, 443, 233, 491, 435, 166, 219, 316, 135, 268, 318, 153, 292, 94, 13, 284, 262, 439, 327, 222, 274, 333, 456, 67, 187, 139, 31, 259, 90, 125, 265, 56, 293, 93, 212, 459, 508, 406 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case204() {
    int[] cards = { 15, 240, 256 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case205() {
    int[] cards = { 1, 10, 100, 200, 511, 124, 111, 123, 345, 231, 213, 456, 345, 12, 35, 65, 145, 136, 198, 178, 165, 354, 355, 356, 357, 358, 359, 360, 425, 426, 427, 428, 429, 430 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case206() {
    int[] cards = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 3, 5, 9, 17, 33, 65, 129, 257, 6, 10, 18, 34, 66, 130, 258, 12, 20, 36, 68, 132, 260, 24, 40, 72, 136, 264, 48, 80, 144, 272, 96, 160, 288, 192, 320, 384, 0, 0, 0, 0, 0 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case207() {
    int[] cards = { 1, 1, 1, 2, 2, 508, 508 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case208() {
    int[] cards = { 198, 155, 180, 84, 17, 14, 386, 116, 65 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case209() {
    int[] cards = { 1, 324, 23, 3, 376, 50, 100, 200, 399, 12, 123, 55, 46, 66, 55, 77, 44, 10 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case210() {
    int[] cards = { 510, 1, 0 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case211() {
    int[] cards = { 128, 291, 285, 506, 24, 416, 155, 219, 46, 190, 289, 24, 70, 486, 52, 101, 247, 493, 292, 158, 419, 283, 33, 188, 309, 335, 491, 297, 250, 286, 63, 220, 137, 379, 183, 41, 376, 144, 305, 55, 79, 59, 145, 500, 205, 10, 289, 195, 304, 107 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case212() {
    int[] cards = { 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510, 510 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case213() {
    int[] cards = { 0, 1, 2, 4, 6, 8, 16, 32, 64, 128, 256, 511, 0, 1, 2, 3, 2, 2, 2, 2, 2, 2, 2, 3, 2, 1, 2, 3, 4, 5, 6, 4, 3, 3, 2, 2, 3, 3, 4, 4, 45, 5, 5, 5, 5, 5, 2, 2, 0 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case214() {
    int[] cards = { 510, 510, 1 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case215() {
    int[] cards = { 1, 1, 1, 2, 2, 508 };
    assertEquals("Fox Ciel", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case216() {
    int[] cards = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 1, 2, 4, 8, 16, 32, 64, 128, 256 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

  @Test
  public void case217() {
    int[] cards = { 0, 1, 511 };
    assertEquals("Toastman", fivehundredeleven.theWinner(cards));
  }

}
