package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class EllysCandyGameTest {
  EllysCandyGame ellyscandygame = new EllysCandyGame();

  @Test
  public void case1() {
    int[] sweets = { 20, 50, 70, 0, 30 };
    assertEquals("Kris", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case2() {
    int[] sweets = { 42, 13, 7 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case3() {
    int[] sweets = { 10, 20 };
    assertEquals("Draw", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case4() {
    int[] sweets = { 3, 1, 7, 11, 1, 1 };
    assertEquals("Kris", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case5() {
    int[] sweets = { 41, 449, 328, 474, 150, 501, 467, 329, 536, 440 };
    assertEquals("Kris", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case6() {
    int[] sweets = { 177, 131, 142, 171, 411, 391, 17, 222, 100, 298 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case7() {
    int[] sweets = { 0, 2, 4 };
    assertEquals("Draw", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case8() {
    int[] sweets = { 0, 2, 4, 0, 2, 4, 0, 2, 4 };
    assertEquals("Draw", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case9() {
    int[] sweets = { 1000, 1, 1000 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case10() {
    int[] sweets = { 1, 1000, 1000 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case11() {
    int[] sweets = { 1, 1000, 1000, 1, 1000, 1000, 1, 1000, 1000 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case12() {
    int[] sweets = { 0 };
    assertEquals("Draw", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case13() {
    int[] sweets = { 666 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case14() {
    int[] sweets = { 1000, 1, 1000, 0, 1000, 1, 1000 };
    assertEquals("Draw", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case15() {
    int[] sweets = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case16() {
    int[] sweets = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
    assertEquals("Kris", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case17() {
    int[] sweets = { 0, 0, 0, 0, 0, 0 };
    assertEquals("Draw", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case18() {
    int[] sweets = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    assertEquals("Draw", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case19() {
    int[] sweets = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    assertEquals("Draw", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case20() {
    int[] sweets = { 1, 2, 4, 8, 16, 8, 4, 2, 1 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case21() {
    int[] sweets = { 1, 2, 4, 8, 16, 16, 8, 4, 2, 1 };
    assertEquals("Kris", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case22() {
    int[] sweets = { 0, 1, 2, 4, 8, 8, 4, 2, 1, 0 };
    assertEquals("Kris", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case23() {
    int[] sweets = { 16, 8, 4, 2, 1, 2, 4, 8, 16 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case24() {
    int[] sweets = { 16, 8, 4, 2, 1, 1, 2, 4, 8, 16 };
    assertEquals("Kris", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case25() {
    int[] sweets = { 8, 4, 2, 1, 0, 0, 1, 2, 4, 8 };
    assertEquals("Draw", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case26() {
    int[] sweets = { 511, 256, 257, 258, 259, 260, 261, 262, 263 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case27() {
    int[] sweets = { 511, 256, 257, 258, 259, 260, 261, 262, 263, 264 };
    assertEquals("Kris", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case28() {
    int[] sweets = { 263, 262, 261, 260, 259, 258, 257, 256, 511 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case29() {
    int[] sweets = { 264, 263, 262, 261, 260, 259, 258, 257, 256, 511 };
    assertEquals("Kris", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case30() {
    int[] sweets = { 449, 328 };
    assertEquals("Kris", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case31() {
    int[] sweets = { 150 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case32() {
    int[] sweets = { 467, 329, 936, 440, 700 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case33() {
    int[] sweets = { 258, 811, 952, 491, 993, 931 };
    assertEquals("Kris", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case34() {
    int[] sweets = { 431, 359, 590, 899, 153, 292, 370, 404 };
    assertEquals("Kris", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case35() {
    int[] sweets = { 699, 876, 442, 705, 757, 527, 868 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case36() {
    int[] sweets = { 642, 273, 18 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case37() {
    int[] sweets = { 675, 788, 291, 303, 656 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case38() {
    int[] sweets = { 126, 704, 225, 862, 522 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case39() {
    int[] sweets = { 630, 725, 17, 847, 715 };
    assertEquals("Kris", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case40() {
    int[] sweets = { 502, 778 };
    assertEquals("Kris", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case41() {
    int[] sweets = { 32, 168, 841, 288, 76, 31, 934 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case42() {
    int[] sweets = { 626, 419, 782, 875, 723 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case43() {
    int[] sweets = { 335 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case44() {
    int[] sweets = { 70, 369, 545, 610, 611, 60, 935 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case45() {
    int[] sweets = { 829, 962, 369, 918, 282, 928, 407 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case46() {
    int[] sweets = { 312, 532, 517, 102, 80, 907, 525 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case47() {
    int[] sweets = { 84, 635, 629, 682 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case48() {
    int[] sweets = { 964 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case49() {
    int[] sweets = { 642, 364, 16, 717, 898, 53, 264 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case50() {
    int[] sweets = { 751, 558, 92, 496, 963, 277, 152, 618, 333, 743 };
    assertEquals("Kris", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case51() {
    int[] sweets = { 559, 27, 40, 323, 149, 925 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case52() {
    int[] sweets = { 953, 427, 76, 161, 990 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case53() {
    int[] sweets = { 442, 275, 726, 373, 931, 901, 177, 749 };
    assertEquals("Kris", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case54() {
    int[] sweets = { 570, 416 };
    assertEquals("Kris", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case55() {
    int[] sweets = { 479, 17, 397, 139, 900, 559, 744 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case56() {
    int[] sweets = { 393, 353, 597, 517, 527, 477 };
    assertEquals("Kris", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case57() {
    int[] sweets = { 37, 599, 326, 281, 806, 365 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case58() {
    int[] sweets = { 592 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case59() {
    int[] sweets = { 321, 176 };
    assertEquals("Kris", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case60() {
    int[] sweets = { 460, 273, 730, 53, 998, 392, 911, 894, 785 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case61() {
    int[] sweets = { 467, 725, 879, 624, 461, 790, 419, 296 };
    assertEquals("Kris", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case62() {
    int[] sweets = { 791, 505, 295, 609, 917, 434, 580, 244 };
    assertEquals("Kris", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case63() {
    int[] sweets = { 525, 776, 273, 218, 998, 839, 577, 975, 670, 192 };
    assertEquals("Kris", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case64() {
    int[] sweets = { 90, 329, 493, 586, 285, 494 };
    assertEquals("Kris", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case65() {
    int[] sweets = { 175, 445, 612, 560, 777, 784, 266, 570, 778 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case66() {
    int[] sweets = { 130, 452, 599, 520, 280, 32, 155, 172, 628, 951 };
    assertEquals("Kris", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case67() {
    int[] sweets = { 796, 866 };
    assertEquals("Kris", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case68() {
    int[] sweets = { 500, 186, 632, 248, 35, 308, 624 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case69() {
    int[] sweets = { 882, 857, 405 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case70() {
    int[] sweets = { 122, 821, 415, 860, 967, 312, 633, 11, 694, 554 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case71() {
    int[] sweets = { 865, 365, 70, 702, 598, 508, 983 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case72() {
    int[] sweets = { 844, 674, 388, 780, 240, 407, 998, 575, 158, 275 };
    assertEquals("Kris", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case73() {
    int[] sweets = { 395, 589, 734, 823, 902, 165, 152, 696, 172 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case74() {
    int[] sweets = { 298, 366, 664, 404, 545, 431, 533 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case75() {
    int[] sweets = { 503, 115 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case76() {
    int[] sweets = { 697 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case77() {
    int[] sweets = { 123, 411, 263, 971 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case78() {
    int[] sweets = { 517, 527, 420, 847, 937, 193, 172, 294 };
    assertEquals("Kris", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case79() {
    int[] sweets = { 258, 89, 464, 266, 443, 709, 96 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case80() {
    int[] sweets = { 359, 718 };
    assertEquals("Draw", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case81() {
    int[] sweets = { 261, 115, 437, 318 };
    assertEquals("Draw", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case82() {
    int[] sweets = { 43, 542, 180, 362, 451, 704, 415 };
    assertEquals("Draw", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case83() {
    int[] sweets = { 184, 140, 84, 192, 370, 71 };
    assertEquals("Draw", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case84() {
    int[] sweets = { 42, 260, 172 };
    assertEquals("Draw", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case85() {
    int[] sweets = { 56, 373, 236, 528, 597 };
    assertEquals("Draw", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case86() {
    int[] sweets = { 663, 836, 59, 503, 211, 961, 765 };
    assertEquals("Draw", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case87() {
    int[] sweets = { 156, 375, 94, 569, 490, 296, 586, 407, 214, 97 };
    assertEquals("Draw", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case88() {
    int[] sweets = { 338, 415, 689, 379, 513, 133, 631, 541, 680, 60 };
    assertEquals("Draw", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case89() {
    int[] sweets = { 168, 398, 9, 296, 642, 556, 111 };
    assertEquals("Draw", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case90() {
    int[] sweets = { 42, 13, 7 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case91() {
    int[] sweets = { 3, 1, 7, 11, 1, 1 };
    assertEquals("Kris", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case92() {
    int[] sweets = { 10, 20 };
    assertEquals("Draw", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case93() {
    int[] sweets = { 0 };
    assertEquals("Draw", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case94() {
    int[] sweets = { 177, 131, 142, 171, 411, 391, 17, 222, 100, 298 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case95() {
    int[] sweets = { 5 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case96() {
    int[] sweets = { 0, 0, 0, 0, 0 };
    assertEquals("Draw", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case97() {
    int[] sweets = { 100, 90, 0, 1 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case98() {
    int[] sweets = { 0, 0 };
    assertEquals("Draw", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case99() {
    int[] sweets = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
    assertEquals("Kris", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case100() {
    int[] sweets = { 2, 1 };
    assertEquals("Draw", ellyscandygame.getWinner(sweets));
  }

  @Test
  public void case101() {
    int[] sweets = { 5, 0, 10, 9 };
    assertEquals("Elly", ellyscandygame.getWinner(sweets));
  }

}
