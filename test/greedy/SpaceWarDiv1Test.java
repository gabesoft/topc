package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class SpaceWarDiv1Test {
  SpaceWarDiv1 spacewardiv1 = new SpaceWarDiv1();

  @Test
  public void case1() {
    int[] magicalGirlStrength = { 2, 3, 5 };
    int[] enemyStrength = { 1, 3, 4 };
    long[] enemyCount = { 2L, 9L, 4L };
    assertEquals(7L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case2() {
    int[] magicalGirlStrength = { 2, 3, 5 };
    int[] enemyStrength = { 1, 1, 2 };
    long[] enemyCount = { 2L, 9L, 4L };
    assertEquals(5L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case3() {
    int[] magicalGirlStrength = { 14, 6, 22 };
    int[] enemyStrength = { 8, 33 };
    long[] enemyCount = { 9L, 1L };
    assertEquals(-1L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case4() {
    int[] magicalGirlStrength = { 869, 249, 599, 144, 929, 748, 665, 37, 313, 99, 33, 437, 308, 137, 665, 834, 955, 958, 613, 417 };
    int[] enemyStrength = { 789, 57, 684, 741, 128, 794, 542, 367, 937, 739, 568, 872, 127, 261, 103, 763, 864, 360, 618, 307 };
    long[] enemyCount = { 20626770196420L, 45538527263992L, 52807114957507L, 17931716090785L, 65032910980630L, 88711853198687L, 26353250637092L, 61272534748707L, 89294362230771L, 52058590967576L, 60568594469453L, 23772707032338L, 43019142889727L, 39566072849912L, 78870845257173L, 68135668032761L, 36844201017584L, 10133804676521L, 6275847412927L, 37492167783296L };
    assertEquals(75030497287405L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case5() {
    int[] magicalGirlStrength = { 674, 527, 829, 824, 365, 6, 826, 726, 302, 155, 187, 162, 880, 857, 417, 738, 239, 41, 987, 674, 847, 493, 224, 540, 597, 195, 689, 218, 200, 571, 509, 683, 389, 229, 230, 101, 120, 862, 105, 387, 117, 602, 441, 499, 872, 273, 770, 179, 951, 476 };
    int[] enemyStrength = { 675, 374, 681, 771, 164, 381, 270, 389, 219, 334, 646, 24, 625, 755, 807, 822, 932, 803, 59, 163, 895, 634, 472, 768, 845, 33, 518, 304, 546, 292, 144, 791, 739, 126, 334, 954, 470, 522, 461, 583, 430, 914, 944, 904, 848, 341, 406, 111, 301, 54 };
    long[] enemyCount = { 539L, 2461L, 8289L, 254L, 9151L, 2104L, 6425L, 2694L, 531L, 4440L, 975L, 7840L, 5117L, 3242L, 676L, 6743L, 2670L, 6163L, 8060L, 965L, 4979L, 2025L, 7266L, 8803L, 6297L, 6777L, 798L, 2765L, 4351L, 5602L, 3205L, 419L, 9241L, 785L, 9050L, 1911L, 4811L, 2243L, 3596L, 3197L, 1442L, 2120L, 1141L, 8917L, 3487L, 5775L, 3612L, 5341L, 5942L, 8307L };
    assertEquals(10869L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case6() {
    int[] magicalGirlStrength = { 5, 8, 1, 1, 7 };
    int[] enemyStrength = { 5, 3, 7, 7, 6 };
    long[] enemyCount = { 14L, 13L, 11L, 4L, 17L };
    assertEquals(20L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case7() {
    int[] magicalGirlStrength = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 10000 };
    int[] enemyStrength = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
    long[] enemyCount = { 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L };
    assertEquals(5000000000000000L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case8() {
    int[] magicalGirlStrength = { 6 };
    int[] enemyStrength = { 5 };
    long[] enemyCount = { 20L };
    assertEquals(20L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case9() {
    int[] magicalGirlStrength = { 6, 5, 7 };
    int[] enemyStrength = { 10, 2, 2 };
    long[] enemyCount = { 20L, 20L, 20L };
    assertEquals(-1L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case10() {
    int[] magicalGirlStrength = { 1, 10, 7, 3, 2 };
    int[] enemyStrength = { 4, 1, 4, 10, 4 };
    long[] enemyCount = { 20L, 20L, 20L, 20L, 20L };
    assertEquals(40L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case11() {
    int[] magicalGirlStrength = { 10, 5, 9, 8, 6, 3, 7 };
    int[] enemyStrength = { 7, 9, 2, 3, 10, 3, 7 };
    long[] enemyCount = { 20L, 20L, 20L, 20L, 20L, 20L, 20L };
    assertEquals(20L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case12() {
    int[] magicalGirlStrength = { 9, 2, 8, 3, 4, 3, 7, 5, 5 };
    int[] enemyStrength = { 4, 1, 5, 6, 4, 2, 9, 7, 4 };
    long[] enemyCount = { 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L };
    assertEquals(24L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case13() {
    int[] magicalGirlStrength = { 2 };
    int[] enemyStrength = { 6, 1, 10, 4, 9, 2, 8, 10, 9, 8, 4, 2, 10, 8, 5 };
    long[] enemyCount = { 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L };
    assertEquals(-1L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case14() {
    int[] magicalGirlStrength = { 9, 4, 2 };
    int[] enemyStrength = { 1, 2, 1, 6, 7, 6, 2, 5, 2, 10, 10, 8, 6, 3, 1, 4 };
    long[] enemyCount = { 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L };
    assertEquals(-1L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case15() {
    int[] magicalGirlStrength = { 8, 8, 10, 10, 2 };
    int[] enemyStrength = { 5, 4, 4, 1, 3, 1, 4, 10, 5, 3, 7, 4, 7, 6, 9, 4, 3 };
    long[] enemyCount = { 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L };
    assertEquals(75L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case16() {
    int[] magicalGirlStrength = { 3, 7, 5, 2, 3, 10, 7 };
    int[] enemyStrength = { 6, 2, 6, 1, 6, 10, 3, 4, 6, 2, 9, 4, 4, 8, 5, 9, 10, 4 };
    long[] enemyCount = { 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L };
    assertEquals(100L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case17() {
    int[] magicalGirlStrength = { 10, 6, 5, 3, 6, 4, 10, 4, 4 };
    int[] enemyStrength = { 6, 6, 2, 2, 9, 10, 9, 7, 7, 9, 5, 6, 10, 9, 10, 5, 9, 2, 1 };
    long[] enemyCount = { 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L };
    assertEquals(100L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case18() {
    int[] magicalGirlStrength = { 5, 6, 10, 1, 1, 2, 2, 1, 10, 4, 9, 5, 6, 7, 3 };
    int[] enemyStrength = { 6 };
    long[] enemyCount = { 20L };
    assertEquals(4L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case19() {
    int[] magicalGirlStrength = { 6, 6, 10, 9, 4, 7, 3, 5, 3, 6, 8, 4, 8, 2, 9, 2 };
    int[] enemyStrength = { 8, 1, 4 };
    long[] enemyCount = { 20L, 20L, 20L };
    assertEquals(4L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case20() {
    int[] magicalGirlStrength = { 7, 7, 9, 5, 6, 5, 3, 8, 2, 7, 7, 2, 6, 1, 2, 5, 1 };
    int[] enemyStrength = { 3, 9, 1, 1, 4 };
    long[] enemyCount = { 20L, 20L, 20L, 20L, 20L };
    assertEquals(20L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case21() {
    int[] magicalGirlStrength = { 1, 7, 10, 9, 4, 7, 1, 5, 1, 9, 8, 4, 4, 10, 2, 9, 1, 8 };
    int[] enemyStrength = { 2, 8, 7, 9, 5, 8, 3 };
    long[] enemyCount = { 20L, 20L, 20L, 20L, 20L, 20L, 20L };
    assertEquals(10L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case22() {
    int[] magicalGirlStrength = { 8, 8, 9, 2, 7, 6, 2, 5, 7, 5, 7, 10, 7, 3, 8, 9, 3, 1, 4 };
    int[] enemyStrength = { 8, 10, 5, 7, 9, 8, 6, 2, 3 };
    long[] enemyCount = { 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L, 20L };
    assertEquals(20L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case23() {
    int[] magicalGirlStrength = { 8202, 2088, 7751, 866, 9854 };
    int[] enemyStrength = { 1173, 5543, 9824, 4636, 1924 };
    long[] enemyCount = { 49841900165518L, 94569312080957L, 86449226553219L, 28373124988554L, 29200079189109L };
    assertEquals(86449226553219L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case24() {
    int[] magicalGirlStrength = { 404, 7793, 461, 8753, 8289 };
    int[] enemyStrength = { 413, 220, 5210, 3357, 4206 };
    long[] enemyCount = { 64800353609168L, 55674104256184L, 29813821745908L, 33753884273838L, 91000208177862L };
    assertEquals(55008474412592L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case25() {
    int[] magicalGirlStrength = { 8264, 907, 5171, 461, 1833 };
    int[] enemyStrength = { 1404, 9070, 5115, 2891, 3067 };
    long[] enemyCount = { 5296046234787L, 50311972645353L, 67535486756520L, 49287504361399L, 95741477074214L };
    assertEquals(-1L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case26() {
    int[] magicalGirlStrength = { 5982, 6750, 9371, 7427, 6422 };
    int[] enemyStrength = { 3838, 8636, 4088, 6763, 3793 };
    long[] enemyCount = { 37795983236823L, 31610283242914L, 56418133741683L, 78442191307682L, 43073439641712L };
    assertEquals(55026237275298L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case27() {
    int[] magicalGirlStrength = { 2306, 3297, 6460, 1912, 9497 };
    int[] enemyStrength = { 5828, 2887, 6737, 7150, 3488 };
    long[] enemyCount = { 48118913782258L, 14525038584039L, 75248034316293L, 99143565503080L, 19526159674498L };
    assertEquals(174391599819373L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case28() {
    int[] magicalGirlStrength = { 3, 1, 1, 5, 5, 5, 3, 3, 1, 1, 4, 1, 3, 4, 2, 4, 1, 5, 4, 1 };
    int[] enemyStrength = { 5, 1, 3, 5, 5, 1, 1, 1, 3, 1, 5, 2, 5, 2, 3, 5, 5, 4, 2, 1 };
    long[] enemyCount = { 8L, 10L, 5L, 1L, 1L, 5L, 2L, 10L, 1L, 5L, 8L, 8L, 5L, 4L, 6L, 7L, 8L, 4L, 10L, 7L };
    assertEquals(10L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case29() {
    int[] magicalGirlStrength = { 4, 5, 2, 5, 3, 5, 2, 3, 1, 3, 2, 4, 4, 2, 4, 2, 2, 2, 3, 5 };
    int[] enemyStrength = { 5, 3, 2, 4, 2, 4, 4, 5, 5, 2, 2, 2, 2, 4, 1, 5, 4, 1, 2, 2 };
    long[] enemyCount = { 5L, 1L, 9L, 9L, 10L, 7L, 6L, 6L, 10L, 4L, 10L, 2L, 10L, 4L, 7L, 4L, 6L, 1L, 8L, 6L };
    assertEquals(8L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case30() {
    int[] magicalGirlStrength = { 4, 1, 1, 3, 5, 1, 3, 2, 5, 5, 5, 1, 4, 3, 4, 4, 3, 4, 1, 5 };
    int[] enemyStrength = { 3, 3, 1, 2, 5, 5, 4, 4, 4, 5, 1, 5, 3, 2, 5, 5, 1, 1, 4, 3 };
    long[] enemyCount = { 7L, 4L, 2L, 4L, 6L, 9L, 8L, 5L, 2L, 10L, 7L, 10L, 4L, 9L, 4L, 4L, 1L, 10L, 9L, 8L };
    assertEquals(9L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case31() {
    int[] magicalGirlStrength = { 4, 2, 1, 4, 5, 3, 4, 3, 2, 4, 1, 5, 5, 5, 5, 3, 3, 3, 1, 2 };
    int[] enemyStrength = { 3, 5, 3, 3, 2, 5, 2, 4, 4, 3, 4, 1, 2, 4, 3, 3, 5, 1, 5, 2 };
    long[] enemyCount = { 8L, 1L, 5L, 6L, 3L, 9L, 2L, 4L, 9L, 5L, 9L, 10L, 10L, 8L, 5L, 1L, 8L, 6L, 8L, 5L };
    assertEquals(7L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case32() {
    int[] magicalGirlStrength = { 3, 4, 5, 5, 5, 1, 2, 5, 2, 2, 2, 5, 2, 1, 4, 3, 5, 3, 2, 3 };
    int[] enemyStrength = { 5, 2, 5, 1, 3, 1, 3, 1, 2, 1, 1, 5, 3, 2, 2, 3, 2, 4, 4, 5 };
    long[] enemyCount = { 3L, 1L, 2L, 2L, 3L, 1L, 8L, 4L, 6L, 10L, 6L, 5L, 1L, 5L, 3L, 5L, 8L, 5L, 10L, 9L };
    assertEquals(5L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case33() {
    int[] magicalGirlStrength = { 5, 8, 7, 9, 5, 3, 2, 3, 7, 6, 3, 6, 1, 9, 3, 6, 1, 9, 8, 10, 5, 4, 5, 4, 10, 2, 3, 3, 1, 5, 1, 2, 1, 1, 6, 10, 10, 1, 5, 10, 9, 2, 5, 4, 4, 5, 5, 4, 7, 1 };
    int[] enemyStrength = { 2, 10, 8, 2, 5, 9, 5, 9, 4, 2, 4, 2, 4, 5, 4, 6, 4, 7, 8, 2, 4, 4, 8, 7, 10, 6, 10, 1, 8, 7, 9, 8, 9, 3, 4, 5, 4, 7, 7, 2, 1, 9, 3, 3, 6, 4, 1, 5, 2, 1 };
    long[] enemyCount = { 10L, 8L, 10L, 1L, 9L, 6L, 2L, 7L, 9L, 7L, 2L, 9L, 2L, 3L, 10L, 5L, 6L, 10L, 9L, 2L, 5L, 6L, 3L, 2L, 2L, 8L, 2L, 3L, 3L, 8L, 9L, 10L, 3L, 4L, 8L, 10L, 7L, 4L, 6L, 2L, 6L, 1L, 1L, 4L, 8L, 6L, 3L, 4L, 1L, 1L };
    assertEquals(8L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case34() {
    int[] magicalGirlStrength = { 5, 8, 2, 7, 2, 6, 7, 8, 10, 1, 1, 4, 2, 9, 7, 1, 10, 8, 10, 3, 6, 7, 5, 7, 1, 2, 2, 6, 3, 5, 4, 8, 3, 1, 8, 5, 1, 2, 8, 3, 10, 8, 6, 1, 7, 10, 4, 8, 7, 6 };
    int[] enemyStrength = { 5, 1, 4, 7, 6, 1, 2, 9, 10, 9, 4, 8, 7, 1, 5, 5, 10, 4, 4, 10, 2, 10, 7, 2, 5, 8, 7, 3, 7, 10, 5, 1, 7, 3, 8, 8, 5, 1, 1, 3, 7, 8, 6, 2, 4, 5, 2, 3, 6, 6 };
    long[] enemyCount = { 10L, 5L, 1L, 9L, 10L, 7L, 7L, 7L, 10L, 4L, 2L, 9L, 10L, 9L, 5L, 9L, 9L, 8L, 8L, 3L, 6L, 4L, 8L, 7L, 7L, 5L, 10L, 6L, 2L, 7L, 1L, 8L, 3L, 6L, 1L, 3L, 9L, 4L, 9L, 6L, 2L, 2L, 2L, 3L, 3L, 10L, 3L, 8L, 4L, 4L };
    assertEquals(8L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case35() {
    int[] magicalGirlStrength = { 1, 4, 6, 8, 9, 1, 2, 8, 10, 10, 2, 10, 6, 3, 4, 9, 6, 1, 5, 4, 5, 4, 10, 7, 8, 7, 3, 5, 2, 7, 3, 9, 7, 1, 7, 5, 7, 5, 6, 3, 9, 6, 10, 5, 9, 5, 5, 2, 2, 4 };
    int[] enemyStrength = { 7, 8, 1, 5, 8, 3, 7, 6, 9, 6, 8, 2, 7, 4, 2, 8, 8, 6, 10, 5, 7, 3, 4, 1, 6, 4, 3, 6, 6, 5, 2, 4, 3, 8, 1, 7, 10, 8, 8, 2, 9, 1, 3, 6, 1, 1, 9, 6, 2, 8 };
    long[] enemyCount = { 5L, 3L, 6L, 1L, 2L, 4L, 10L, 4L, 7L, 5L, 7L, 1L, 9L, 9L, 8L, 5L, 10L, 8L, 5L, 9L, 1L, 6L, 6L, 9L, 1L, 7L, 3L, 7L, 3L, 6L, 8L, 5L, 10L, 9L, 3L, 10L, 3L, 8L, 9L, 2L, 6L, 2L, 10L, 5L, 10L, 8L, 9L, 8L, 1L, 9L };
    assertEquals(8L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case36() {
    int[] magicalGirlStrength = { 5, 10, 6, 9, 8, 9, 5, 3, 2, 4, 4, 1, 1, 4, 4, 4, 4, 1, 5, 3, 6, 6, 5, 4, 3, 2, 7, 6, 4, 2, 9, 7, 3, 4, 8, 5, 1, 3, 3, 4, 1, 3, 7, 7, 10, 7, 2, 6, 9, 2 };
    int[] enemyStrength = { 3, 6, 8, 3, 9, 10, 5, 6, 4, 5, 1, 10, 7, 5, 6, 10, 5, 4, 10, 9, 2, 10, 3, 1, 3, 1, 3, 10, 7, 1, 3, 4, 2, 9, 3, 1, 4, 4, 7, 7, 7, 2, 7, 8, 7, 4, 1, 4, 2, 2 };
    long[] enemyCount = { 9L, 3L, 6L, 2L, 4L, 9L, 10L, 1L, 5L, 7L, 10L, 7L, 3L, 2L, 2L, 6L, 7L, 10L, 8L, 3L, 1L, 5L, 4L, 5L, 4L, 7L, 6L, 6L, 6L, 8L, 2L, 7L, 7L, 4L, 4L, 4L, 10L, 10L, 7L, 4L, 10L, 3L, 7L, 3L, 7L, 2L, 7L, 1L, 1L, 4L };
    assertEquals(21L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case37() {
    int[] magicalGirlStrength = { 4, 9, 10, 10, 3, 2, 10, 6, 6, 7, 6, 6, 10, 9, 7, 5, 4, 7, 9, 1, 7, 6, 8, 9, 9, 8, 6, 3, 10, 10, 7, 6, 3, 2, 5, 4, 10, 5, 1, 9, 7, 1, 6, 1, 10, 2, 4, 10, 6, 5 };
    int[] enemyStrength = { 7, 10, 4, 1, 8, 1, 5, 6, 1, 7, 2, 2, 6, 7, 1, 3, 3, 7, 10, 4, 9, 4, 9, 4, 1, 5, 3, 9, 7, 3, 5, 5, 7, 9, 9, 8, 6, 4, 8, 1, 1, 9, 5, 5, 10, 1, 2, 7, 7, 5 };
    long[] enemyCount = { 3L, 8L, 3L, 3L, 5L, 5L, 6L, 1L, 3L, 7L, 8L, 7L, 5L, 6L, 3L, 4L, 2L, 5L, 3L, 1L, 6L, 6L, 8L, 8L, 1L, 9L, 3L, 4L, 3L, 10L, 10L, 6L, 2L, 8L, 8L, 6L, 2L, 3L, 10L, 1L, 10L, 6L, 2L, 9L, 10L, 10L, 2L, 2L, 2L, 10L };
    assertEquals(6L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case38() {
    int[] magicalGirlStrength = { 7937, 1082, 4635, 9556, 9812, 2618, 8948, 5427, 4954, 1304, 9212, 9070, 1903, 8210, 7004, 9313, 2439, 5083, 8796, 6561 };
    int[] enemyStrength = { 3267, 7535, 7120, 74, 9269, 5824, 5624, 9438, 1177, 321, 2024, 8397, 7171, 9360, 4679, 2973, 216, 8878, 7352, 1142 };
    long[] enemyCount = { 94614989245311L, 98400325648447L, 79616376119896L, 23643831245926L, 53606483738458L, 49089749060050L, 28140725927532L, 39658536217201L, 1305880782950L, 55829014723907L, 80802005838549L, 29671188830983L, 80515515067400L, 30086907706192L, 47858667939340L, 80506448307040L, 27836376317389L, 89080301006754L, 83667589973191L, 63000415418572L };
    assertEquals(64922580478725L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case39() {
    int[] magicalGirlStrength = { 5466, 6333, 1899, 9877, 7173, 438, 2914, 1654, 2360, 6582, 1693, 2969, 4642, 6010, 3081, 5876, 1410, 8835, 8174, 3538 };
    int[] enemyStrength = { 6190, 1114, 9459, 3872, 2858, 1801, 5046, 8341, 5865, 6619, 2819, 9360, 2492, 4368, 3827, 7393, 9762, 9638, 1353, 3817 };
    long[] enemyCount = { 94152604247317L, 58367335996082L, 52069965289534L, 64857122860788L, 37859249221218L, 80853990697759L, 89942548426062L, 83423124803754L, 2456162910495L, 52379939661891L, 9227408527059L, 47096571284531L, 70329358556670L, 868394349223L, 54001703378395L, 81123462943931L, 81588859581215L, 14252131959342L, 71453388576904L, 38582024396292L };
    assertEquals(195007528114622L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case40() {
    int[] magicalGirlStrength = { 1256, 3723, 3910, 7978, 6542, 5368, 7689, 5306, 5474, 972, 6596, 2375, 8823, 1366, 5073, 8575, 7622, 1019, 5315, 8519 };
    int[] enemyStrength = { 865, 5270, 4921, 1314, 1495, 9935, 2448, 1367, 4133, 1042, 1488, 852, 5010, 8328, 1771, 8986, 1629, 1412, 8805, 4377 };
    long[] enemyCount = { 35502561105708L, 67897187486449L, 47086715185298L, 49450112361423L, 32794476058266L, 27915807072357L, 15405974746608L, 3170613898311L, 29688115554529L, 22687507226104L, 76070135135119L, 56548561269835L, 12394994282341L, 15312809072260L, 78733960853615L, 737075224825L, 67301680370335L, 77712163263990L, 94711610665642L, 8783882412272L };
    assertEquals(-1L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case41() {
    int[] magicalGirlStrength = { 5871, 7080, 9948, 8063, 7236, 587, 1949, 2071, 1386, 2853, 4686, 620, 8240, 5063, 8960, 3725, 9978, 4050, 6674, 7128 };
    int[] enemyStrength = { 5432, 9290, 6100, 1040, 5730, 8310, 7460, 7548, 1120, 5702, 1837, 555, 1466, 8234, 1181, 4840, 9415, 1749, 4876, 6709 };
    long[] enemyCount = { 20537385696757L, 84509431641569L, 45337732800287L, 36168585396285L, 87070191107337L, 88317166439597L, 96951690400288L, 39535110698021L, 92569865825899L, 15954137165445L, 75388555735760L, 25624526648029L, 46331411948764L, 44748811602475L, 78933649481264L, 32410460275849L, 50341268376560L, 3984723441908L, 9612790426633L, 9995579829653L };
    assertEquals(80880695831702L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case42() {
    int[] magicalGirlStrength = { 5060, 5617, 7317, 7062, 8226, 8260, 7037, 5232, 4491, 5724, 300, 7559, 3634, 7337, 4135, 9839, 2823, 9489, 1679, 5336 };
    int[] enemyStrength = { 4983, 3995, 3899, 9770, 7096, 5880, 1094, 476, 7219, 2436, 5471, 8769, 9036, 4134, 637, 3180, 2681, 267, 1052, 9364 };
    long[] enemyCount = { 33237871085200L, 42081198947504L, 36011728861602L, 46067560849208L, 42541942345614L, 19440548566572L, 29468053131877L, 22845851992079L, 51843247931883L, 88537137645908L, 7429860506180L, 37777523526819L, 71006400674496L, 4682680194510L, 31077757500383L, 69710306647266L, 88972961844962L, 48924725144732L, 395006809640L, 46930433508968L };
    assertEquals(100890959279746L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case43() {
    int[] magicalGirlStrength = { 3725, 9997, 4713, 107, 8419, 3230, 6231, 4892, 2183, 4829, 5963, 1314, 5315, 5427, 6091, 1543, 5949, 8588, 5706, 8113 };
    int[] enemyStrength = { 849, 3639, 8144, 7916, 6433, 2854, 8649, 8257, 4655, 7084, 2393, 3832, 3124, 5914, 8188, 726, 103, 3324, 5078, 8024 };
    long[] enemyCount = { 45294441137935L, 20815203681056L, 78830611076572L, 95105338318836L, 64247469568548L, 60246679846063L, 95544240218475L, 82682231343386L, 47720290011233L, 16910135356267L, 71398586231595L, 90806146397360L, 84033633216919L, 76063131511765L, 99350137667856L, 94146474341079L, 4415287823811L, 28522754424062L, 62045522636539L, 42905929789356L };
    assertEquals(143894023334824L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case44() {
    int[] magicalGirlStrength = { 5531, 5289, 1006, 8642, 5790, 1517, 2843, 4414, 8870, 2392, 1829, 9927, 2347, 493, 9297, 5232, 3301, 9161, 7283, 1578 };
    int[] enemyStrength = { 8794, 5949, 9543, 5224, 8102, 3741, 7739, 2969, 6909, 5006, 6084, 5963, 3352, 1702, 5825, 6139, 3224, 5573, 9121, 6692 };
    long[] enemyCount = { 87403432801133L, 97651247079888L, 67195079115873L, 83255532018919L, 66691126908736L, 4443751965239L, 1380865389518L, 27811497492045L, 46107741343275L, 58223992586984L, 36167039399436L, 82801212870306L, 84180743003281L, 89020321339169L, 76808488243807L, 94431662832010L, 23944786577271L, 23761869258082L, 62304709023331L, 95203314070779L };
    assertEquals(135690986513016L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case45() {
    int[] magicalGirlStrength = { 2795, 9025, 9610, 5459, 9777, 728, 9883, 5525, 5524, 4266, 2031, 6939, 2233, 8459, 1281, 1977, 4596, 8955, 5022, 2292 };
    int[] enemyStrength = { 6612, 9750, 4706, 7691, 6267, 7518, 4904, 3922, 914, 6839, 5437, 5121, 9521, 8973, 4303, 7549, 700, 6456, 5478, 2286 };
    long[] enemyCount = { 23344102397365L, 55988208304273L, 46741592600895L, 8370001602054L, 43104363974044L, 37189362581825L, 53767554289526L, 69058660184574L, 41227650843752L, 30557271181775L, 10061837129332L, 68419202305701L, 88812974071437L, 47962911370495L, 80107119283817L, 47905691718792L, 26711720788958L, 10578447221970L, 86532969391604L, 25667446101500L };
    assertEquals(62192482277653L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case46() {
    int[] magicalGirlStrength = { 3233, 8582, 3734, 4394, 1521, 8998, 9477, 7948, 6714, 7939, 4075, 973, 3972, 840, 135, 2953, 3734, 9530, 2572, 4802 };
    int[] enemyStrength = { 1637, 9602, 64, 7398, 4575, 8082, 133, 4911, 6044, 214, 4319, 3615, 8226, 3457, 7539, 3251, 9175, 2561, 8947, 2080 };
    long[] enemyCount = { 82978173878368L, 32506749797330L, 77234677395761L, 66560539923845L, 62636482053014L, 22928764291082L, 2053501579361L, 18780333777226L, 43822872980383L, 33108677270080L, 59194107166783L, 20017214797522L, 99292624110761L, 22825108782049L, 99643584443099L, 92910545721362L, 44447710210092L, 50655270894488L, 63649621225709L, 93009494725440L };
    assertEquals(-1L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case47() {
    int[] magicalGirlStrength = { 9381, 5081, 3156, 6351, 5048, 3314, 5407, 8223, 3740, 3916, 2792, 3965, 3035, 7434, 2188, 8978, 2522, 80, 9043, 4992 };
    int[] enemyStrength = { 361, 3405, 2565, 9878, 38, 9961, 7315, 3052, 7892, 351, 5589, 9841, 44, 9556, 5561, 1841, 6722, 164, 6861, 7318 };
    long[] enemyCount = { 78667740424920L, 19796370483L, 96660495934726L, 95656952921667L, 61620054530965L, 95303131614546L, 73552109401380L, 14076218462829L, 43160710808107L, 95419057967145L, 59007344838528L, 50853306093087L, 13347651769481L, 37610495062552L, 20804875914256L, 62506981933163L, 73539490339372L, 37573084213460L, 58161564011951L, 96274203820406L };
    assertEquals(-1L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case48() {
    int[] magicalGirlStrength = { 36, 24, 26, 50, 50, 13, 10, 46, 43, 47, 5, 13, 14, 22, 15, 36, 49, 13, 48, 48, 24, 20, 39, 40, 46, 39, 18, 12, 33, 42, 25, 24, 47, 48, 1, 6, 47, 24, 6, 16, 29, 39, 2, 42, 26, 41, 7, 31, 40, 42 };
    int[] enemyStrength = { 8, 30, 33, 16, 31, 28, 43, 8, 19, 43, 20, 34, 23, 5, 4, 33, 31, 39, 4, 6, 49, 50, 47, 37, 1, 3, 12, 48, 31, 10, 2, 14, 26, 28, 23, 42, 10, 25, 22, 41, 6, 32, 2, 9, 28, 5, 18, 19, 28, 50 };
    long[] enemyCount = { 50L, 29L, 8L, 11L, 4L, 2L, 35L, 11L, 31L, 9L, 21L, 25L, 31L, 3L, 4L, 31L, 35L, 2L, 23L, 13L, 44L, 46L, 50L, 32L, 14L, 42L, 15L, 24L, 35L, 33L, 46L, 47L, 4L, 10L, 20L, 2L, 27L, 42L, 27L, 41L, 26L, 21L, 10L, 18L, 36L, 4L, 1L, 13L, 16L, 16L };
    assertEquals(36L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case49() {
    int[] magicalGirlStrength = { 38, 48, 13, 23, 46, 38, 7, 22, 32, 45, 28, 47, 43, 46, 8, 16, 25, 5, 47, 23, 37, 46, 26, 8, 37, 7, 42, 6, 18, 7, 18, 14, 2, 1, 3, 7, 37, 7, 20, 17, 3, 18, 41, 37, 13, 42, 28, 12, 30, 43 };
    int[] enemyStrength = { 5, 31, 17, 37, 24, 27, 8, 29, 7, 3, 47, 9, 30, 13, 25, 24, 11, 48, 11, 5, 42, 47, 43, 42, 10, 34, 40, 32, 18, 37, 42, 38, 43, 31, 6, 49, 15, 44, 13, 40, 22, 13, 50, 26, 44, 18, 24, 14, 27, 28 };
    long[] enemyCount = { 47L, 50L, 11L, 23L, 22L, 33L, 2L, 17L, 11L, 43L, 5L, 11L, 18L, 28L, 6L, 32L, 6L, 19L, 50L, 50L, 25L, 19L, 8L, 1L, 9L, 18L, 13L, 20L, 38L, 18L, 42L, 14L, 38L, 37L, 40L, 49L, 8L, 21L, 15L, 30L, 15L, 23L, 21L, 40L, 11L, 16L, 30L, 33L, 22L, 20L };
    assertEquals(-1L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case50() {
    int[] magicalGirlStrength = { 15, 17, 25, 39, 50, 22, 44, 6, 22, 44, 13, 11, 32, 21, 18, 50, 35, 8, 49, 37, 29, 14, 27, 45, 19, 9, 1, 26, 37, 32, 49, 43, 7, 44, 35, 50, 33, 19, 19, 20, 24, 8, 1, 42, 40, 21, 40, 6, 25, 19 };
    int[] enemyStrength = { 32, 1, 30, 42, 22, 45, 36, 1, 44, 37, 42, 26, 19, 28, 46, 21, 3, 23, 26, 39, 42, 24, 16, 34, 20, 30, 21, 25, 10, 35, 4, 26, 40, 38, 9, 45, 27, 25, 38, 49, 29, 41, 22, 24, 8, 41, 16, 7, 33, 34 };
    long[] enemyCount = { 35L, 41L, 5L, 48L, 8L, 27L, 6L, 13L, 20L, 22L, 44L, 20L, 15L, 9L, 35L, 3L, 35L, 32L, 7L, 34L, 42L, 22L, 49L, 45L, 21L, 46L, 4L, 5L, 23L, 12L, 27L, 5L, 22L, 26L, 27L, 9L, 46L, 12L, 19L, 39L, 50L, 39L, 32L, 45L, 18L, 30L, 38L, 44L, 34L, 2L };
    assertEquals(34L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case51() {
    int[] magicalGirlStrength = { 8, 10, 25, 8, 26, 28, 38, 1, 44, 36, 27, 20, 19, 49, 41, 36, 36, 5, 47, 46, 49, 48, 7, 46, 15, 19, 29, 45, 10, 4, 5, 21, 19, 38, 26, 20, 2, 3, 13, 16, 10, 3, 44, 9, 6, 48, 34, 50, 41, 11 };
    int[] enemyStrength = { 34, 13, 4, 11, 17, 48, 17, 8, 49, 39, 27, 18, 35, 24, 9, 40, 47, 6, 21, 6, 33, 34, 28, 36, 4, 25, 48, 15, 15, 49, 18, 6, 20, 34, 46, 22, 12, 17, 29, 36, 24, 30, 25, 5, 33, 15, 41, 13, 31, 50 };
    long[] enemyCount = { 28L, 30L, 31L, 31L, 19L, 30L, 20L, 17L, 38L, 31L, 36L, 45L, 19L, 2L, 48L, 26L, 37L, 26L, 31L, 19L, 12L, 28L, 14L, 10L, 14L, 28L, 9L, 24L, 39L, 37L, 30L, 7L, 21L, 50L, 28L, 1L, 6L, 12L, 36L, 7L, 47L, 19L, 45L, 10L, 7L, 12L, 36L, 50L, 19L, 9L };
    assertEquals(31L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case52() {
    int[] magicalGirlStrength = { 12, 40, 11, 35, 35, 22, 12, 47, 11, 49, 23, 44, 32, 8, 9, 7, 16, 25, 14, 26, 11, 47, 45, 31, 17, 10, 42, 49, 11, 6, 40, 26, 3, 36, 32, 21, 9, 38, 38, 29, 26, 28, 36, 15, 50, 26, 41, 25, 28, 11 };
    int[] enemyStrength = { 9, 39, 5, 14, 12, 50, 11, 44, 34, 16, 26, 10, 26, 35, 20, 44, 46, 21, 41, 13, 29, 34, 13, 16, 43, 47, 25, 39, 37, 36, 26, 2, 18, 47, 18, 48, 18, 42, 16, 26, 17, 28, 5, 49, 33, 46, 39, 23, 11, 2 };
    long[] enemyCount = { 5L, 26L, 43L, 38L, 31L, 35L, 34L, 47L, 34L, 21L, 41L, 14L, 32L, 4L, 16L, 38L, 28L, 31L, 47L, 9L, 26L, 5L, 50L, 42L, 9L, 35L, 4L, 44L, 24L, 27L, 36L, 24L, 16L, 13L, 5L, 27L, 41L, 37L, 26L, 31L, 42L, 8L, 14L, 27L, 38L, 25L, 27L, 41L, 17L, 4L };
    assertEquals(43L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case53() {
    int[] magicalGirlStrength = { 15, 14, 8, 11, 6, 46, 27, 10, 27, 17, 50, 49, 11, 20, 8, 43, 4, 31, 41, 23, 4, 49, 16, 31, 3, 33, 39, 13, 26, 4, 26, 21, 36, 40, 40, 45, 25, 12, 38, 4, 10, 14, 15, 46, 17, 18, 47, 17, 41, 17 };
    int[] enemyStrength = { 48, 40, 25, 47, 48, 40, 1, 6, 35, 12, 9, 24, 39, 39, 34, 20, 37, 24, 44, 9, 28, 19, 27, 47, 48, 31, 2, 37, 13, 2, 37, 24, 34, 47, 33, 35, 46, 14, 4, 41, 28, 36, 15, 21, 13, 39, 30, 15, 8, 44 };
    long[] enemyCount = { 37L, 12L, 42L, 49L, 45L, 45L, 21L, 15L, 27L, 47L, 4L, 42L, 20L, 2L, 1L, 22L, 32L, 31L, 17L, 15L, 3L, 13L, 42L, 1L, 42L, 8L, 19L, 14L, 28L, 34L, 5L, 42L, 45L, 17L, 5L, 11L, 4L, 32L, 41L, 13L, 43L, 39L, 8L, 35L, 2L, 17L, 11L, 43L, 33L, 49L };
    assertEquals(48L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case54() {
    int[] magicalGirlStrength = { 2, 44, 33, 15, 29, 27, 28, 17, 20, 22, 48, 8, 32, 47, 26, 28, 41, 32, 23, 6, 31, 8, 2, 35, 47, 42, 6, 37, 42, 27, 18, 16, 37, 11, 3, 21, 38, 28, 20, 13, 40, 38, 6, 12, 29, 7, 2, 11, 43, 17 };
    int[] enemyStrength = { 1, 2, 16, 49, 33, 13, 47, 5, 19, 5, 36, 48, 22, 14, 13, 41, 39, 37, 3, 46, 42, 27, 41, 42, 42, 28, 8, 22, 6, 19, 42, 12, 19, 2, 50, 5, 32, 46, 31, 7, 25, 3, 13, 25, 47, 32, 5, 47, 18, 4 };
    long[] enemyCount = { 34L, 31L, 30L, 7L, 24L, 25L, 38L, 2L, 33L, 21L, 22L, 41L, 39L, 42L, 1L, 31L, 48L, 23L, 20L, 27L, 6L, 10L, 11L, 41L, 24L, 22L, 39L, 40L, 48L, 50L, 28L, 36L, 27L, 37L, 8L, 34L, 24L, 26L, 13L, 33L, 42L, 8L, 39L, 46L, 15L, 42L, 15L, 7L, 41L, 17L };
    assertEquals(-1L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case55() {
    int[] magicalGirlStrength = { 42, 10, 22, 5, 49, 10, 32, 13, 29, 21, 42, 47, 8, 21, 25, 37, 11, 7, 3, 13, 46, 50, 5, 33, 25, 2, 41, 26, 15, 8, 35, 18, 44, 27, 36, 43, 1, 5, 32, 42, 18, 6, 50, 36, 36, 33, 6, 25, 4, 37 };
    int[] enemyStrength = { 16, 43, 12, 28, 14, 9, 44, 24, 47, 46, 12, 38, 38, 33, 5, 32, 13, 41, 7, 42, 21, 15, 29, 43, 4, 40, 9, 3, 32, 16, 25, 29, 5, 20, 28, 11, 4, 1, 48, 3, 16, 26, 38, 18, 8, 6, 35, 49, 39, 27 };
    long[] enemyCount = { 40L, 22L, 26L, 28L, 47L, 20L, 42L, 18L, 45L, 29L, 23L, 35L, 7L, 49L, 50L, 7L, 27L, 38L, 38L, 16L, 2L, 45L, 38L, 7L, 23L, 1L, 43L, 42L, 7L, 29L, 39L, 10L, 16L, 45L, 6L, 28L, 42L, 43L, 36L, 5L, 29L, 28L, 3L, 18L, 5L, 28L, 43L, 45L, 14L, 22L };
    assertEquals(33L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case56() {
    int[] magicalGirlStrength = { 1, 45, 22, 15, 18, 8, 1, 44, 46, 15, 34, 34, 9, 40, 18, 16, 32, 42, 36, 14, 5, 1, 37, 49, 37, 43, 23, 38, 46, 20, 28, 16, 32, 32, 14, 30, 48, 2, 47, 43, 12, 39, 11, 2, 29, 6, 45, 46, 39, 15 };
    int[] enemyStrength = { 25, 42, 3, 22, 36, 15, 2, 12, 10, 33, 37, 46, 25, 30, 11, 9, 29, 11, 32, 29, 17, 37, 14, 1, 27, 30, 23, 37, 50, 27, 13, 3, 21, 5, 39, 47, 1, 39, 22, 2, 3, 23, 45, 5, 14, 44, 9, 14, 20, 34 };
    long[] enemyCount = { 34L, 38L, 8L, 43L, 20L, 8L, 17L, 9L, 26L, 13L, 49L, 33L, 46L, 1L, 29L, 10L, 19L, 14L, 44L, 27L, 40L, 33L, 23L, 24L, 8L, 44L, 24L, 18L, 10L, 15L, 20L, 10L, 32L, 26L, 10L, 50L, 42L, 27L, 29L, 41L, 34L, 25L, 6L, 20L, 5L, 29L, 41L, 21L, 43L, 47L };
    assertEquals(-1L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case57() {
    int[] magicalGirlStrength = { 7, 3, 46, 40, 15, 22, 15, 48, 35, 5, 18, 8, 33, 47, 32, 32, 23, 35, 43, 30, 10, 5, 14, 36, 19, 1, 16, 17, 6, 39, 6, 31, 12, 39, 32, 17, 23, 39, 18, 11, 28, 6, 40, 41, 4, 45, 6, 1, 43, 47 };
    int[] enemyStrength = { 27, 45, 42, 25, 20, 17, 17, 9, 47, 24, 39, 47, 10, 6, 30, 16, 9, 9, 37, 30, 44, 31, 4, 17, 2, 50, 38, 37, 17, 24, 17, 47, 24, 15, 45, 37, 42, 15, 34, 4, 21, 37, 39, 11, 20, 44, 12, 42, 38, 38 };
    long[] enemyCount = { 13L, 50L, 34L, 49L, 44L, 17L, 35L, 27L, 8L, 41L, 23L, 9L, 18L, 5L, 42L, 10L, 22L, 39L, 11L, 41L, 17L, 49L, 23L, 9L, 4L, 2L, 45L, 14L, 17L, 23L, 36L, 14L, 17L, 47L, 6L, 49L, 19L, 30L, 46L, 37L, 3L, 6L, 34L, 31L, 39L, 29L, 36L, 21L, 17L, 25L };
    assertEquals(-1L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case58() {
    int[] magicalGirlStrength = { 4121, 2599, 5723, 8579, 3504, 5563, 490, 7720, 6015, 7250, 4042, 3437, 9887, 622, 2904, 7716, 6757, 2305, 6694, 7394, 3449, 9369, 7120, 4675, 7519, 9701, 5719, 9841, 4114, 7790, 8383, 6729, 9460, 7149, 191, 6572, 1270, 905, 5755, 2992, 4121, 2395, 300, 4790, 4490, 149, 1677, 8611, 2482, 8964 };
    int[] enemyStrength = { 636, 7657, 4083, 1703, 3179, 3556, 3692, 9738, 2428, 4865, 510, 8700, 2569, 8901, 854, 921, 2737, 7975, 8505, 1738, 6925, 4893, 1081, 271, 4198, 8364, 9081, 8808, 2134, 6024, 8455, 6982, 9742, 2806, 2007, 3039, 4590, 2731, 8508, 9294, 5351, 1958, 828, 4559, 1599, 956, 7725, 8623, 2161, 7471 };
    long[] enemyCount = { 93382231496659L, 18183392827494L, 24764938553199L, 83642773201689L, 54306200131557L, 79950492445136L, 53664137267539L, 67341088360212L, 61224607632016L, 83406624705904L, 37093770934072L, 60262915790619L, 32261447429765L, 48513899216949L, 47276210787098L, 98080715969538L, 85738314258758L, 89431623402764L, 64728099855553L, 10775937601177L, 89542887587895L, 55281428538619L, 29463072673561L, 47472715981460L, 1395395147262L, 60568046839656L, 53712714285524L, 83537427217141L, 46982191684266L, 17775924181082L, 50215494048096L, 25311774974395L, 11236022120814L, 74222437931435L, 4999207341268L, 13657301401144L, 61788827424817L, 67963107497144L, 26576138392015L, 81544239217715L, 28243854038843L, 78797654441693L, 81753283205573L, 38279547808028L, 34317701545348L, 64950901657872L, 72156946543507L, 53553017555163L, 65417234465774L, 67617320047829L };
    assertEquals(83468969589136L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case59() {
    int[] magicalGirlStrength = { 9122, 4310, 2124, 8903, 7808, 6732, 3353, 5251, 9939, 7389, 7226, 1712, 9350, 3493, 3714, 6512, 8026, 924, 7252, 2330, 9651, 6598, 94, 6573, 4400, 4726, 2460, 5675, 3546, 2661, 2076, 665, 4748, 7867, 5582, 3011, 5125, 1596, 1239, 4497, 3492, 4715, 9320, 6159, 1565, 4736, 6465, 4863, 314, 992 };
    int[] enemyStrength = { 8463, 7386, 3855, 3362, 3617, 4140, 211, 6657, 9597, 7635, 7017, 4144, 7136, 3755, 3854, 8507, 8714, 4625, 1313, 6059, 4622, 2031, 3487, 3948, 6707, 8554, 720, 7108, 3341, 1349, 6671, 1344, 4889, 6934, 8429, 296, 2903, 5913, 5729, 556, 6172, 4715, 4043, 4577, 587, 808, 275, 3537, 2131, 5224 };
    long[] enemyCount = { 88545531639741L, 71734841224030L, 66605606843624L, 44442874001397L, 26119998522716L, 83300886793418L, 84056064425154L, 8374739059752L, 32096344542990L, 33199632320358L, 87293363414236L, 63803026228896L, 18060606441660L, 39040864608065L, 31060113108864L, 71451539562952L, 48110595148293L, 91837417314792L, 12914263975542L, 1157715481652L, 77676909564558L, 80945932052380L, 26724376676805L, 45955793033452L, 56205802873051L, 18256902492466L, 84359199857478L, 53208618761836L, 70191496450807L, 56447302408762L, 27040898293900L, 14161170789562L, 54009200799660L, 90771663543955L, 50240706940156L, 89844597190596L, 71632456992885L, 17919265172011L, 49113731163831L, 76302032376321L, 21942929557291L, 27981346079904L, 58669991738620L, 86114338567157L, 959429277106L, 93927193010217L, 20850600613890L, 58811166773649L, 5422290999182L, 43144818853320L };
    assertEquals(58045522019952L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case60() {
    int[] magicalGirlStrength = { 14, 7370, 18, 5143, 1158, 4227, 1769, 6936, 7093, 3611, 8641, 7739, 399, 6992, 5275, 8584, 1617, 885, 1960, 5668, 3469, 1734, 5209, 8043, 3280, 287, 6677, 669, 1368, 2067, 9825, 9983, 3635, 3438, 5383, 2574, 9953, 2732, 8663, 8165, 4059, 3089, 6185, 138, 8090, 4451, 5026, 3205, 3261, 8898 };
    int[] enemyStrength = { 6920, 5505, 4140, 5928, 4228, 4939, 7372, 1509, 4303, 2256, 139, 645, 9775, 9679, 8977, 1853, 8274, 5925, 306, 4574, 7127, 1367, 7899, 4614, 6735, 8652, 9813, 9089, 9543, 8499, 7127, 6292, 1080, 244, 3724, 4610, 5031, 6508, 5620, 8976, 1163, 678, 1655, 1708, 9821, 7918, 7201, 7503, 9829, 8991 };
    long[] enemyCount = { 72889352943659L, 93406592037024L, 2397399414672L, 24535511401903L, 48471865795276L, 8713439346586L, 21544448263050L, 38026939967879L, 64863290644104L, 80409924922458L, 79975045836048L, 27208387984798L, 56247785002345L, 74165907190692L, 64028422238306L, 67853457418906L, 10120854239279L, 99448637783855L, 15270984810196L, 20721140077944L, 52513147793220L, 78672839083023L, 70690602469956L, 27863462972893L, 60381909640803L, 43308396443400L, 80466209848150L, 81604806123994L, 79641867811252L, 79964402128563L, 37282770162112L, 43304544029762L, 51279623951367L, 55398176315130L, 4779738778353L, 26558342390019L, 42056275560814L, 77129219203849L, 54854910100038L, 71561682948773L, 99660702306128L, 63816409062350L, 26652603954460L, 32386789332099L, 17309061927352L, 74993160841148L, 59805085454110L, 32709722610138L, 89481796425940L, 41416624039251L };
    assertEquals(218641387852019L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case61() {
    int[] magicalGirlStrength = { 9084, 9122, 9005, 6309, 3077, 4755, 8175, 5397, 4100, 597, 799, 211, 7304, 5622, 2011, 5370, 69, 2142, 3198, 8977, 308, 6559, 8003, 9095, 8246, 47, 1247, 691, 8715, 5297, 3926, 4358, 4605, 9705, 637, 6937, 3342, 9693, 796, 5483, 7908, 7970, 9230, 4302, 6521, 9164, 2990, 5476, 9879, 9814 };
    int[] enemyStrength = { 3220, 8093, 2342, 5873, 4539, 9011, 4034, 1079, 6724, 7835, 4643, 7633, 3846, 8970, 7232, 4516, 6904, 3962, 2958, 1212, 5339, 6084, 5497, 3013, 2101, 1753, 6535, 548, 9499, 6995, 8915, 7494, 8464, 2286, 566, 8339, 8488, 7434, 9331, 1975, 6727, 8496, 3009, 9129, 9076, 2568, 9761, 1816, 7015, 6363 };
    long[] enemyCount = { 95663125318909L, 38588772995790L, 60139993072596L, 67421057817819L, 75368913170760L, 16167278633498L, 11281256681224L, 98596676317695L, 4832405193987L, 54737624963556L, 49134014434426L, 92983824331123L, 24717019298806L, 57526087820776L, 96630844483518L, 42377466767595L, 32174502714676L, 92964067788204L, 54589185316820L, 7695710321484L, 38051198340931L, 83871715842302L, 93877735301915L, 52629535532542L, 94584798506933L, 3580372592971L, 74577936795788L, 91900707096572L, 88633233616096L, 2540282259162L, 84778796332408L, 97149942076719L, 86224652197288L, 45135167437076L, 60997333295760L, 51617688774872L, 83876045355945L, 83880168442962L, 5791797464487L, 47447865010331L, 52989923123093L, 35571337875429L, 69788980440407L, 75229281679694L, 87093822978276L, 1210611269957L, 52465586852754L, 79948646372699L, 17574458171882L, 77156981359767L };
    assertEquals(73737555889374L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case62() {
    int[] magicalGirlStrength = { 1025, 6725, 9757, 1799, 9399, 5395, 5273, 9252, 8377, 6076, 1247, 3828, 1380, 2899, 3543, 4931, 1723, 1253, 232, 8137, 1273, 4860, 173, 4194, 6952, 9356, 3615, 7672, 7116, 5586, 4656, 7203, 4905, 4036, 5110, 9229, 2675, 577, 7438, 7998, 8052, 3971, 1244, 5501, 1959, 4019, 1361, 340, 5221, 9984 };
    int[] enemyStrength = { 3402, 3984, 1376, 7101, 8807, 7619, 2542, 8459, 6019, 4736, 4178, 6188, 7168, 1935, 8623, 4592, 561, 8640, 8652, 486, 5601, 3834, 2960, 6194, 9789, 6314, 9914, 7146, 3294, 4121, 8149, 4697, 119, 3585, 9937, 9794, 6026, 2599, 3039, 4236, 551, 8642, 1253, 2498, 8106, 6006, 3534, 2472, 3503, 3958 };
    long[] enemyCount = { 36070222119110L, 83296306787486L, 31227918133103L, 16199607593455L, 97845104903721L, 20891184584527L, 25092372316173L, 63079925468734L, 27540795916692L, 15978964683084L, 42011053062615L, 41099099092973L, 69113452067822L, 84678458559067L, 80114181718707L, 37833850583929L, 6652681193681L, 54389862055877L, 95298617365337L, 54208015167693L, 60323073819850L, 7544192867822L, 36929738874164L, 78473463434828L, 10913433689793L, 39558018681670L, 22551798769019L, 31941752103753L, 17625051428040L, 92261331249945L, 33377090217343L, 2208739258199L, 15713421159093L, 97732111875924L, 29924852423008L, 17426903863844L, 79442220176461L, 2544085486940L, 71941146013612L, 84091777356846L, 44743541368797L, 77169908077427L, 10387447736417L, 82853754239860L, 95175469534459L, 29812164898516L, 30023782778189L, 10935571296619L, 55802683319393L, 30518484865934L };
    assertEquals(91452431389245L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case63() {
    int[] magicalGirlStrength = { 6302, 3330, 5473, 6807, 5586, 4144, 6314, 9870, 8115, 261, 2669, 8434, 6539, 8242, 3497, 2711, 313, 7544, 3360, 1235, 5982, 8211, 1427, 7475, 7673, 6437, 2606, 6380, 2154, 1521, 9876, 4780, 9497, 2417, 6714, 6379, 7167, 6146, 5754, 704, 9988, 2182, 2730, 9416, 5088, 8511, 7055, 6884, 3778, 1216 };
    int[] enemyStrength = { 1593, 8441, 836, 7815, 7335, 7330, 2958, 6721, 3785, 2347, 4464, 5635, 1802, 3940, 4824, 4865, 8283, 158, 5001, 3630, 2318, 8643, 9664, 1997, 9443, 7630, 7962, 3488, 4895, 2327, 6670, 3155, 5364, 4925, 847, 5003, 3404, 2109, 5354, 7204, 8292, 9052, 6734, 4997, 6493, 9037, 5916, 2817, 5534, 705 };
    long[] enemyCount = { 74185184899087L, 73996685121939L, 58550513824797L, 71126158098183L, 30613667743196L, 78340018231130L, 66111689606365L, 17287121343027L, 64521761651666L, 19152999539568L, 68086900396663L, 75892431602387L, 40108184217074L, 4496963125547L, 42159080181587L, 97023687129478L, 8182025720064L, 85670184842960L, 84568681861302L, 64175228855707L, 23772052339566L, 15146689293476L, 73945297761503L, 91734003925972L, 69944144144537L, 48097427114523L, 19341726909449L, 12851369066389L, 95754296924187L, 2427327389024L, 9824480892398L, 72345341922493L, 9982580473227L, 94571889970937L, 10450855408789L, 69775806806227L, 30921366529281L, 13579833237724L, 58089687650038L, 15412419585065L, 24562831462095L, 75117930870142L, 73895521701566L, 96625723583149L, 94353999434537L, 60680558154024L, 7566467280270L, 91427170397641L, 36996652199445L, 62923084495292L };
    assertEquals(61471884224271L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case64() {
    int[] magicalGirlStrength = { 7704, 9717, 6944, 2633, 4002, 5850, 2687, 1249, 38, 6587, 6385, 7515, 5436, 4379, 4819, 2137, 8136, 8839, 7473, 884, 4678, 1413, 8634, 4772, 8913, 9516, 1217, 6773, 1643, 6061, 9540, 7432, 848, 6451, 2788, 5319, 2065, 9225, 7607, 3877, 2547, 6548, 3597, 4347, 151, 2147, 2003, 9669, 3665, 1060 };
    int[] enemyStrength = { 7262, 6623, 8738, 5966, 8466, 7612, 6516, 1911, 6951, 6525, 783, 3843, 2637, 958, 5357, 6114, 6130, 9343, 6628, 1584, 7321, 8551, 2107, 2191, 2824, 7762, 4209, 7144, 8853, 1550, 2400, 1008, 4995, 9045, 3521, 6505, 7899, 3694, 5481, 7010, 7874, 3435, 4778, 560, 3546, 4024, 641, 1285, 415, 6118 };
    long[] enemyCount = { 88456351877713L, 81473273373475L, 18637360069794L, 4421943022368L, 6009833373734L, 69937239013824L, 10288624224448L, 95962571268715L, 95501287490983L, 60286564979049L, 97091937193876L, 73546113690545L, 14178907231759L, 79756670961005L, 99599790476117L, 18659233720063L, 29296934057287L, 22106696449293L, 37289397913302L, 94348966630053L, 97484365949854L, 15143587797992L, 42191046225704L, 17503021174976L, 33480519068370L, 66104142915778L, 75932897383289L, 15395217009465L, 56126173894404L, 66771842079245L, 59069149318087L, 81995400655954L, 31547611344481L, 67859016448972L, 69060545954118L, 42541823896077L, 55403147789722L, 17854516466932L, 78394899480031L, 13078422236286L, 1539278627969L, 61703905266990L, 50016944413171L, 11909903360873L, 90116587713903L, 33015077846774L, 37884842197071L, 53660519929298L, 67875088243065L, 89280136089933L };
    assertEquals(54099777662421L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case65() {
    int[] magicalGirlStrength = { 8034, 1332, 7975, 6086, 8261, 9596, 9430, 6527, 647, 502, 8334, 6287, 6051, 1299, 802, 9137, 6319, 434, 6779, 8164, 9211, 9494, 4841, 9, 1466, 831, 81, 1978, 6356, 2252, 19, 4531, 1903, 884, 2873, 8905, 4741, 9405, 6939, 7474, 7605, 8237, 4950, 7431, 4198, 1264, 9659, 9322, 2119, 1451 };
    int[] enemyStrength = { 8883, 1167, 1842, 1592, 1189, 5223, 9250, 1902, 7319, 598, 3450, 3573, 2997, 289, 9208, 1216, 1481, 1799, 2409, 3115, 6085, 3042, 7880, 2201, 1000, 2495, 3036, 1090, 3673, 6702, 2092, 4089, 4317, 9618, 6427, 7332, 8105, 8561, 482, 8485, 8202, 8345, 7462, 4493, 2626, 416, 6544, 5090, 7146, 366 };
    long[] enemyCount = { 82323223245820L, 57085069924557L, 32708794638327L, 51174784177643L, 87557675038498L, 12648594192414L, 23274078765255L, 42113090654769L, 3828511648985L, 15570610652068L, 44856858558630L, 31153855412591L, 17279438630771L, 71492203762552L, 74233666001331L, 3306381243544L, 67444417758141L, 76260065847449L, 55471356417290L, 75205189010760L, 9725253854174L, 80180859243783L, 42853137838527L, 95652857350113L, 57793293545404L, 24111537704733L, 13883241455076L, 63066236933266L, 60380805921011L, 56014776219349L, 76765852866044L, 38041013073895L, 98804096568169L, 47902738144112L, 97775627885437L, 34770756870474L, 40214210912866L, 65219862803158L, 84909252041437L, 90563948281285L, 6583389148785L, 35672675849735L, 80121824317100L, 12138753887858L, 73951066242062L, 28670283578955L, 29066930682028L, 59287907690976L, 11813025760378L, 73058325004851L };
    assertEquals(54763113209203L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case66() {
    int[] magicalGirlStrength = { 5913, 3227, 8096, 6624, 2288, 42, 6707, 171, 9665, 5304, 60, 6203, 8337, 758, 9800, 175, 1273, 1153, 7794, 5142, 8118, 4915, 2230, 5826, 6289, 3061, 3108, 9995, 2011, 8225, 2861, 9195, 7755, 5103, 2997, 8038, 8151, 5520, 6410, 5330, 9206, 5541, 3135, 1847, 4155, 5338, 8091, 5311, 2983, 977 };
    int[] enemyStrength = { 3475, 4098, 5712, 5781, 4898, 7337, 8443, 6784, 5545, 9136, 9507, 4477, 2882, 5360, 8235, 2056, 3466, 550, 6010, 511, 2679, 6314, 303, 8450, 704, 8967, 2526, 5940, 3816, 286, 3401, 7328, 7874, 2396, 5756, 227, 5925, 861, 1120, 8377, 9163, 8902, 2496, 2581, 3099, 2558, 7720, 681, 6485, 8863 };
    long[] enemyCount = { 84049317696481L, 51220537553897L, 78507172796946L, 53699292355200L, 53655842622994L, 38161882922781L, 82529627307648L, 26579992887556L, 53150816952628L, 33227609157600L, 68186998976410L, 79610760281596L, 77466781137045L, 1313987527964L, 81620056965129L, 45935117280239L, 56735673629615L, 82539566085981L, 50838554443551L, 62740124900011L, 30249909081979L, 97249060303749L, 58000860621254L, 72708897921833L, 54936454416154L, 96706882737419L, 34501911159756L, 60213184001306L, 34284076634645L, 20643154486106L, 74946976965121L, 30017382481170L, 79263375044937L, 65943262818485L, 6402565350389L, 76627890494371L, 65656747857199L, 22980274121921L, 58009957873796L, 24848441692923L, 92658810354659L, 26584279986990L, 7683110642199L, 90533053112471L, 3227709995108L, 31242938216567L, 49739919296439L, 93907598336349L, 32797760581606L, 98930378307671L };
    assertEquals(119276385288631L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case67() {
    int[] magicalGirlStrength = { 8675, 2512, 7248, 1044, 1459, 206, 9804, 1894, 7452, 1985, 7185, 7042, 7236, 7346, 5002, 5399, 3308, 6259, 4685, 8615, 373, 1337, 7135, 9043, 3444, 1883, 9018, 552, 1602, 979, 8516, 8398, 536, 9938, 2676, 8934, 6047, 2372, 8635, 9242, 7371, 6487, 7716, 2748, 562, 6801, 5255, 4361, 3544, 6471 };
    int[] enemyStrength = { 4831, 9891, 8472, 9244, 7016, 1448, 3587, 5550, 7837, 292, 8995, 2833, 1705, 6975, 7557, 8975, 2889, 5428, 2429, 6959, 118, 3544, 1724, 4397, 659, 7317, 5108, 9496, 4841, 724, 1350, 8674, 8182, 2888, 4698, 2552, 7791, 4172, 2853, 1826, 546, 8229, 5515, 9887, 2677, 4669, 4256, 5457, 6701, 6921 };
    long[] enemyCount = { 22974653099986L, 56163528686146L, 31581532636211L, 953968470720L, 46959890768435L, 99831269412526L, 27560402517950L, 16157196686388L, 65844028912714L, 83944597410147L, 57433957225542L, 53051078638057L, 51251209011988L, 12268110088032L, 44639987495801L, 38649766825959L, 23518307476597L, 42717824364316L, 3119564146034L, 14147700791142L, 42539618878080L, 45923719491042L, 60293195006224L, 68521164143163L, 78554660598721L, 55182373296196L, 33484166302407L, 16862837427005L, 2555532544235L, 7025109224024L, 96870925139940L, 71723895614169L, 14122770180333L, 32017652473879L, 85407743887187L, 75444868082694L, 92438700166089L, 6289610620664L, 30286382590246L, 80412586944902L, 43279296231803L, 75280262744410L, 74575625710952L, 79066150074227L, 58402204265518L, 68737728854558L, 44168990701892L, 27832343744004L, 72334084147361L, 33183660158378L };
    assertEquals(135229678760373L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case68() {
    int[] magicalGirlStrength = { 6218, 9805, 8980, 7006, 8917, 115, 6644, 3963, 5128, 7596, 7103, 5764, 1307, 9539, 6645, 3887, 6227, 2625, 2007, 2311, 8657, 7231, 3309, 3304, 309, 5294, 2217, 6528, 9104, 7911, 2324, 6871, 4878, 2684, 2491, 6869, 5200, 2703, 4505, 5547, 740, 2525, 2361, 5847, 7382, 7383, 4322, 331, 3136, 217 };
    int[] enemyStrength = { 7914, 5931, 5083, 3408, 9535, 7298, 9531, 5468, 7446, 7976, 3768, 3835, 3756, 672, 2044, 1252, 4417, 4754, 9355, 3103, 2247, 622, 413, 5896, 7231, 6510, 7776, 3368, 8401, 3501, 7141, 2906, 7440, 51, 5762, 2521, 5019, 7074, 630, 2650, 4975, 4311, 5368, 1875, 2542, 5690, 2394, 2965, 1045, 6138 };
    long[] enemyCount = { 25440162676336L, 89552379199895L, 95070455297522L, 29954142702093L, 21403671458466L, 42411017065511L, 7838038142469L, 38486397031298L, 3851747787899L, 40829193435074L, 16527426330048L, 52027185097263L, 6344571943359L, 55352361534158L, 53581965019144L, 85389776970522L, 55702550565638L, 12257547992042L, 43501421630648L, 17435774514940L, 94852735154682L, 9004221682606L, 1311343917553L, 98390948581563L, 4595908134940L, 65954221250045L, 84302628338928L, 57672514927238L, 87429953141094L, 6116883559822L, 97559108877041L, 42669446186108L, 83454295287149L, 90190831627196L, 59727239440728L, 98902126335211L, 19435503514866L, 37498622254852L, 76694000913491L, 25945365505940L, 76867225942080L, 14462123535102L, 79556129997599L, 50121127203382L, 96129744768012L, 75603571218274L, 50290603495000L, 63162428491199L, 78125482968238L, 6550216245281L };
    assertEquals(52942250157878L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case69() {
    int[] magicalGirlStrength = { 1857, 3228, 1044, 5877, 7860, 6084, 250, 3981, 4554, 3703, 8320, 4410, 3294, 7159, 2068, 4154, 3533, 3578, 7482, 4902, 4570, 7208, 4115, 3527, 6402, 2142, 8429, 2248, 8835, 2932, 4272, 4912, 3511, 7524, 8223, 6505, 6553, 1366, 3004, 3309, 9025, 2704, 1044, 8736, 948, 7515, 8961, 3761, 6416, 163 };
    int[] enemyStrength = { 1206, 1052, 1303, 2375, 307, 9862, 2736, 7093, 5064, 7525, 3739, 7426, 6055, 3862, 2494, 7354, 7880, 5166, 1938, 9224, 9823, 5954, 3096, 6666, 3255, 3270, 7472, 8027, 3730, 2892, 5651, 8376, 9106, 8589, 1426, 8187, 7737, 8346, 3926, 1229, 8241, 5352, 8365, 5991, 5685, 1498, 4638, 6582, 5047, 2095 };
    long[] enemyCount = { 25687648579633L, 56844470225549L, 72466410829380L, 9866860318498L, 11601464632731L, 84149280905355L, 98109581599565L, 87906890236100L, 58097912272770L, 64187056074165L, 17133169250832L, 95299848906712L, 62799469052348L, 60057344745773L, 41175232270752L, 25596602341268L, 48424328052593L, 35293204420071L, 53031389773824L, 25267942893352L, 45946900735836L, 1463518181600L, 17714181424615L, 59416063459023L, 82705217153910L, 68688596118498L, 33355783289793L, 63036174814272L, 48690273891317L, 37841156141526L, 77935088907278L, 41133515644292L, 20373908485938L, 630275378445L, 98556058111457L, 96875305325486L, 61387374213587L, 34069554212210L, 49241686000430L, 82009084644514L, 51430269188769L, 67148134853173L, 60116749330123L, 23207724182398L, 35594092619727L, 21344787888800L, 29372191670523L, 53268173180687L, 47715373502707L, 59941042233593L };
    assertEquals(-1L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case70() {
    int[] magicalGirlStrength = { 9619, 2704, 5384, 4616, 2002, 2259, 468, 932, 8906, 3065, 5370, 9487, 8764, 5588, 7966, 8109, 3728, 2086, 9058, 3864, 8959, 6107, 905, 3716, 4720, 5574, 9924, 5904, 2213, 7017, 4057, 5915, 7738, 2759, 557, 7507, 2838, 1225, 1669, 4955, 8124, 9872, 6719, 8193, 6706, 9903, 3128, 7595, 4540, 3884 };
    int[] enemyStrength = { 1820, 1604, 414, 2641, 4565, 7406, 8405, 5756, 6926, 8948, 1753, 4748, 1226, 7613, 1445, 341, 4263, 6706, 904, 3754, 7412, 6018, 2307, 5510, 3392, 6585, 6921, 4704, 3589, 7292, 778, 2741, 1273, 3477, 3506, 8663, 3389, 2494, 703, 8086, 351, 2387, 6202, 6760, 445, 7162, 461, 5843, 7983, 4592 };
    long[] enemyCount = { 95609598198957L, 97791460542462L, 66972460358238L, 93655341942982L, 98297144978779L, 77955195870946L, 91127605923108L, 74345954457709L, 61009785612636L, 12547405699414L, 47628025627812L, 96024623212983L, 25610839936985L, 84001947877932L, 46221912431936L, 55258197702943L, 47866196941795L, 12137399157636L, 25794239441047L, 97730193113592L, 39433646144092L, 4662979267924L, 1170809767103L, 2913500488279L, 37175726003956L, 16768061882044L, 4212300431948L, 50740789773447L, 85736189078167L, 61811429758237L, 48539366199760L, 79144829672717L, 6323188464005L, 77473539196520L, 60106907076201L, 13087482408745L, 4864905060563L, 32997059092498L, 28724522102531L, 87752307311303L, 24799455966535L, 29285597825087L, 83911864811592L, 87361204484258L, 72833635123941L, 38642176841114L, 85371721404638L, 67191843054361L, 71807076426702L, 32397180424490L };
    assertEquals(52896536491453L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case71() {
    int[] magicalGirlStrength = { 7398, 8361, 9054, 9216, 5445, 4201, 4303, 1323, 1580, 108, 5157, 4770, 6362, 2618, 2153, 8365, 6046, 7467, 8413, 5426, 5277, 6334, 3028, 5736, 404, 792, 3134, 848, 9354, 4746, 6005, 5530, 1209, 3208, 7181, 9938, 3354, 6892, 1615, 3115, 7864, 5494, 4365, 8213, 4289, 2139, 6827, 3216, 826, 932 };
    int[] enemyStrength = { 9269, 1967, 1229, 1867, 6676, 232, 1784, 8559, 1881, 6677, 620, 9206, 3855, 869, 2171, 7510, 7770, 6982, 6441, 5399, 1129, 6888, 8997, 8379, 807, 7151, 6807, 1774, 8193, 4480, 8213, 500, 4843, 3338, 7750, 817, 6, 1970, 4881, 3758, 9982, 6586, 6120, 8998, 6533, 2668, 3040, 9348, 1195, 758 };
    long[] enemyCount = { 98198699907903L, 21177973354710L, 3379073517332L, 93972004738290L, 83602139009010L, 29601062994546L, 17617010933912L, 6617991921101L, 78245872776171L, 87763298645488L, 70224209986640L, 88912780715393L, 38947640150127L, 88003170431469L, 67138033659680L, 22968315240282L, 16554151669334L, 42832002595477L, 3038168943367L, 86181516825117L, 98418968296927L, 74988347994716L, 41021597969423L, 24560574441845L, 56112032938561L, 30417392496341L, 57727994801283L, 48497155353279L, 38300375704629L, 60410397533699L, 39394145443701L, 78045889972000L, 97686590063727L, 57432714828288L, 39396328507685L, 78900121954995L, 80804655337356L, 92301919725675L, 10356135142089L, 71802221903789L, 60990336836988L, 38968613633415L, 86602287805521L, 76022273508957L, 9541441686184L, 34878968224416L, 65118521278955L, 58033832456917L, 3229521183120L, 71857423283395L };
    assertEquals(-1L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case72() {
    int[] magicalGirlStrength = { 973, 5087, 7012, 5561, 9735, 6147, 412, 4374, 806, 4408, 338, 9291, 1913, 7575, 4610, 6046, 8324, 3625, 7675, 6497, 540, 4746, 6544, 7583, 7777, 9712, 8317, 9383, 2805, 9033, 7148, 91, 9406, 9836, 2849, 957, 7467, 9111, 3258, 9255, 4896, 8777, 2867, 4967, 1392, 4714, 964, 8440, 9382, 779 };
    int[] enemyStrength = { 4801, 2307, 976, 901, 9807, 4859, 1304, 8367, 7361, 8004, 7085, 6842, 4766, 6758, 1950, 6789, 224, 1433, 1458, 9238, 8881, 666, 7875, 3312, 493, 2917, 1888, 8500, 7546, 9126, 2887, 5359, 4156, 8921, 2382, 9414, 1198, 8417, 1809, 1224, 2248, 9855, 6986, 9384, 7485, 7091, 9471, 9083, 7450, 9357 };
    long[] enemyCount = { 29093921617588L, 45248304343416L, 38918295108731L, 90971916600226L, 90630251477905L, 42446732900590L, 64174990372702L, 96708684879364L, 73157395488483L, 89148684121985L, 85025866270104L, 16480816266420L, 60708639555852L, 7873488598820L, 73525203302683L, 91194708350741L, 98595868182802L, 99418921667892L, 11031269290469L, 90260772731716L, 45097751496204L, 1227987635300L, 3955790014427L, 83835164328728L, 61393970580518L, 54751794389145L, 90484153885504L, 40872359510955L, 36284152672363L, 68040774491143L, 89634843975143L, 63697131728288L, 22962884330171L, 39178835450286L, 46238235277667L, 4262729386034L, 67878542460878L, 18673632059429L, 83544165689125L, 25450314176549L, 4473171652915L, 33196972482596L, 80223360325087L, 97342714873511L, 7302387740215L, 56168172815982L, 37508153923066L, 71464246228626L, 17700397892766L, 31369326278253L };
    assertEquals(-1L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case73() {
    int[] magicalGirlStrength = { 2554, 9873, 4503, 7893, 6954, 7715, 8388, 8543, 4889, 9337, 9912, 3063, 8018, 6573, 792, 4392, 7315, 2917, 8798, 9434, 3903, 2918, 6147, 3600, 4112, 8416, 1814, 4652, 2897, 364, 8846, 3326, 4698, 8660, 8717, 4295, 6587, 5113, 7786, 8868, 762, 2969, 3742, 2161, 3832, 885, 2955, 9861, 4005, 7458 };
    int[] enemyStrength = { 1262, 6754, 6536, 7230, 3481, 2654, 271, 6273, 3532, 625, 6809, 404, 8361, 1676, 3713, 7738, 6231, 2298, 6497, 1697, 3954, 9059, 8972, 4684, 451, 3558, 4248, 9497, 7133, 5320, 8478, 8754, 8101, 689, 1762, 369, 6410, 5276, 1868, 269, 1838, 6384, 2583, 7626, 5889, 7023, 776, 3536, 2351, 4713 };
    long[] enemyCount = { 85612175440519L, 46035157810193L, 6910187066983L, 11449647930245L, 57424686605971L, 23670158797204L, 81816079823879L, 98384667480185L, 30316439954196L, 73571451635983L, 94090922852025L, 16030843557817L, 33251048136927L, 62786794952183L, 17969158602736L, 91819796681956L, 21783320239978L, 18254532497213L, 4618849033034L, 55394074741752L, 84783826178849L, 12181278282398L, 30944064937504L, 52147959469574L, 9664820921300L, 71183102007320L, 82659787902113L, 38198841194740L, 59667625645061L, 95468803214398L, 1161568337635L, 58183999540998L, 54136761494084L, 92400863110353L, 90517263633935L, 85670152311194L, 92456642161549L, 71467718926644L, 4765828766641L, 89149239733997L, 2826654750628L, 41861189108285L, 4397259817555L, 62591065499341L, 58477508027311L, 35202151569190L, 64083139515724L, 36097534850218L, 60212850258367L, 73508150170722L };
    assertEquals(50945152903573L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case74() {
    int[] magicalGirlStrength = { 7580, 3205, 9113, 9866, 1968, 8807, 6395, 2941, 4370, 9826, 3074, 3284, 3515, 1090, 9687, 5726, 7598, 2237, 3867, 6652, 4387, 3172, 993, 4879, 2751, 8693, 1206, 6699, 3225, 3074, 4183, 1177, 5123, 7706, 3885, 922, 1355, 833, 5622, 5424, 1263, 5948, 1010, 4519, 3825, 6562, 9977, 7907, 6342, 5071 };
    int[] enemyStrength = { 9578, 5112, 806, 2032, 5672, 5325, 9493, 6010, 5646, 7335, 3542, 6743, 5148, 618, 3139, 6960, 915, 587, 1784, 523, 44, 9907, 9606, 6692, 7497, 4747, 9394, 7452, 2515, 5972, 7300, 6874, 5657, 2244, 9733, 8211, 5101, 3439, 6530, 614, 4921, 9695, 6197, 8651, 8847, 7154, 9737, 1430, 4591, 5148 };
    long[] enemyCount = { 2051440413647L, 13702282395660L, 42343782583537L, 99559286331717L, 99808402283717L, 79320182108168L, 24790681550666L, 63124243808249L, 64432902256149L, 3354852472642L, 74235736791354L, 90998599279204L, 52250826122165L, 97286800806758L, 62364007775854L, 46692258838022L, 96105555438406L, 90440326944582L, 81689744602433L, 52018528764324L, 14427211371844L, 40225531716538L, 43389846365207L, 39105136147400L, 81015267271772L, 4809602514491L, 20690009939771L, 71410934510747L, 3060258091967L, 69667898037985L, 95403488139339L, 63193448927324L, 11863878962673L, 18354525875008L, 32297553288262L, 98783086085381L, 98686255652038L, 4153400583319L, 76552379415612L, 89787490011753L, 23227091941888L, 51484649318221L, 15178766530190L, 57267677870950L, 28874263696755L, 48478523778335L, 10702626649530L, 6599894852399L, 13797719642581L, 65130577499967L };
    assertEquals(82827703646574L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case75() {
    int[] magicalGirlStrength = { 2540, 6281, 9631, 7585, 1849, 8456, 4789, 353, 5561, 8043, 2508, 2645, 5062, 2374, 9493, 6200, 5577, 9615, 4124, 8592, 1856, 5566, 337, 2889, 3608, 6980, 5122, 2609, 1841, 6554, 6642, 7883, 5117, 4092, 9142, 807, 4398, 7115, 467, 4888, 9793, 4175, 4125, 3362, 8763, 6976, 4187, 1117, 8917, 6700 };
    int[] enemyStrength = { 6992, 5372, 135, 5560, 2294, 9417, 7382, 4184, 5036, 3625, 2963, 2081, 9944, 1698, 7045, 3023, 7722, 6862, 4862, 856, 4509, 5691, 264, 8064, 3270, 8151, 8067, 9515, 5332, 5770, 8990, 7901, 6407, 6842, 683, 6302, 6836, 5193, 289, 9711, 9684, 4414, 5999, 2105, 5827, 8138, 5991, 9315, 4101, 3345 };
    long[] enemyCount = { 93185441479879L, 24721029787982L, 16494292006228L, 74805163398063L, 50223149261853L, 70217833264163L, 8151617782272L, 27000185020414L, 58844485040967L, 60861579835506L, 46621706774655L, 21693286528451L, 35553621696789L, 75764097092755L, 62039516913363L, 10236862017633L, 93690055199136L, 38659025535405L, 92067637966734L, 89869195441387L, 26539313287372L, 34945852114494L, 96397953752676L, 50280962803244L, 3125992123618L, 65544370999811L, 16778594325860L, 53595212582275L, 12904178748260L, 38512977346927L, 15299840377299L, 56255598557615L, 30997858975596L, 42615891148914L, 54955513995042L, 33785659152920L, 75701913446194L, 68678827167492L, 20597584844916L, 67654662216321L, 82416797840281L, 74927727597595L, 12849545347289L, 33566926109487L, 7083226994205L, 49342632045280L, 63303481437408L, 16773240725430L, 4160613982081L, 30841911307702L };
    assertEquals(-1L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case76() {
    int[] magicalGirlStrength = { 4885, 7084, 354, 8693, 2923, 5406, 372, 7909, 1967, 5444, 5226, 488, 8220, 4839, 8779, 9806, 8465, 3539, 5084, 9881, 1926, 4890, 3334, 2106, 2233, 9676, 1157, 8354, 1604, 4123, 6964, 3864, 6162, 9044, 5458, 4871, 8139, 9460, 7401, 5290, 2210, 6050, 424, 2383, 2563, 7616, 6190, 5690, 4923, 98 };
    int[] enemyStrength = { 3809, 2713, 7339, 5294, 9077, 6253, 4002, 3617, 4770, 701, 1040, 2324, 5585, 5130, 3989, 5288, 3330, 264, 6281, 2634, 3103, 7561, 8533, 2042, 5675, 6917, 6171, 9909, 5355, 1502, 5348, 5770, 3053, 8933, 9045, 4170, 8443, 1359, 96, 8712, 5240, 2239, 1453, 5855, 5794, 1490, 7891, 9755, 5711, 8497 };
    long[] enemyCount = { 11761034700298L, 66805428316835L, 91804149871504L, 15467483886980L, 97831881021209L, 60469978149166L, 32351320448677L, 16157363906189L, 3502310816568L, 19243166667182L, 43491263600167L, 40101028574389L, 8170597655696L, 40869053343507L, 76057063571774L, 14728510693801L, 27022010471312L, 74761237522347L, 69469552973474L, 83255538859234L, 8126860748357L, 80259159794470L, 75670991234807L, 93080640305866L, 4733755329770L, 75118566756714L, 97068915089970L, 35424718343221L, 75771613266273L, 60431523929218L, 4894707844794L, 18425773016323L, 43473980859673L, 11712153149998L, 424947607357L, 45735914924L, 22509198283352L, 70058758364236L, 56811455203512L, 75299057436991L, 67981230406276L, 20617122284343L, 68543866949381L, 50842641784908L, 70801776788614L, 56468886649307L, 82013991304904L, 14756609752926L, 26257461498688L, 86283190804029L };
    assertEquals(-1L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case77() {
    int[] magicalGirlStrength = { 8781, 1474, 1695, 1631, 2155, 5772, 1799, 4112, 9179, 6319, 3881, 4490, 4032, 6795, 1790, 4219, 6330, 2603, 3552, 6821, 2703, 3455, 5743, 6985, 4170, 7857, 1212, 1434, 202, 8226, 3590, 8379, 7146, 2260, 1710, 7369, 5386, 957, 5610, 4938, 3156, 6059, 6185, 25, 216, 8867, 3050, 8764, 7246, 4117 };
    int[] enemyStrength = { 9354, 8944, 4377, 3259, 5463, 8965, 7628, 8907, 1411, 798, 9263, 1979, 2656, 3261, 9232, 5923, 2935, 1273, 738, 2422, 8653, 9297, 7746, 4334, 2874, 6547, 2254, 932, 5365, 3969, 2437, 4865, 4011, 8298, 821, 9287, 7956, 4994, 4728, 8371, 7553, 1309, 7869, 322, 9394, 8365, 126, 6303, 7955, 3346 };
    long[] enemyCount = { 7056151240443L, 92820978320026L, 1926255471976L, 91119739544984L, 68621538289901L, 70246505885846L, 24065074487088L, 13163899352220L, 83591655019166L, 50958632307464L, 97632488482942L, 59942768688610L, 76702981582601L, 86942861213561L, 66161434989997L, 4034883771388L, 56435161154165L, 17956388919553L, 79032265021780L, 77295184754193L, 6944764080970L, 35745344397943L, 15542672479303L, 9137140435608L, 46448355313318L, 55159039304229L, 97770933941880L, 35111074524325L, 56857173028235L, 96735661061445L, 68057448762985L, 14643438122585L, 2408306842841L, 4618369746676L, 23567330949609L, 61354691602531L, 63334401742970L, 87713134736225L, 16137576843880L, 9377711364566L, 69281686764715L, 92664701452184L, 85777666653580L, 40691062303604L, 43731972072041L, 19072818254558L, 3145852999066L, 73149611087795L, 38248505330703L, 65301887436436L };
    assertEquals(-1L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case78() {
    int[] magicalGirlStrength = { 5403, 1366, 5542, 9670, 4746, 9399, 4245, 2310, 2602, 7235, 6163, 8150, 5207, 7135, 9969, 3726, 797, 1161, 9002, 3289, 1714, 9092, 3596, 8560, 8160, 5344, 1665, 1425, 5169, 901, 2961, 396, 3411, 7132, 195, 8521, 443, 5658, 9392, 4793, 8437, 778, 969, 6567, 7209, 5158, 8035, 4603, 4330, 8178 };
    int[] enemyStrength = { 8256, 3691, 5561, 3573, 6314, 8686, 7894, 8188, 6729, 2991, 3366, 4189, 1108, 8650, 6224, 9965, 4116, 1046, 4497, 8926, 6035, 8839, 3711, 1089, 9460, 2334, 2795, 2372, 7932, 2328, 4031, 6560, 797, 2064, 4727, 4017, 9060, 8298, 2077, 8339, 8, 8109, 6284, 6005, 5139, 8699, 6614, 3789, 3134, 8112 };
    long[] enemyCount = { 84715962603216L, 871451487770L, 33725616257720L, 83863515075552L, 6713420745240L, 66320054895156L, 90211258258445L, 78638348451961L, 33983054680379L, 9675261355790L, 12327934799102L, 50540745010590L, 81099490930148L, 13840529787573L, 44861394481503L, 40653586413719L, 64071755017910L, 30710021616461L, 45124253611325L, 71599607038975L, 85640367217093L, 31706336587145L, 470760867669L, 39953073868359L, 21749645158169L, 5446359288627L, 40481057018778L, 79575859320882L, 52148752255791L, 66851849007530L, 10277859890611L, 31243064695639L, 30478967083383L, 16659077937247L, 56738760137594L, 48549697540259L, 18222682130135L, 24057565632343L, 84383642687358L, 80512600721108L, 47545358365734L, 67334283584940L, 9791119328130L, 3091770558719L, 29674517489842L, 56816130091020L, 54063946191612L, 59170145735946L, 74662886872251L, 54619456991032L };
    assertEquals(65626676969287L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case79() {
    int[] magicalGirlStrength = { 1 };
    int[] enemyStrength = { 1 };
    long[] enemyCount = { 1L };
    assertEquals(1L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case80() {
    int[] magicalGirlStrength = { 869, 249, 599, 144, 929, 748, 665, 37, 313, 99, 33, 437, 308, 137, 665, 834, 955, 958, 613, 417 };
    int[] enemyStrength = { 789, 57, 684, 741, 128, 794, 542, 367, 937, 739, 568, 872, 127, 261, 103, 763, 864, 360, 618, 307 };
    long[] enemyCount = { 20626770196420L, 45538527263992L, 52807114957507L, 17931716090785L, 65032910980630L, 88711853198687L, 26353250637092L, 61272534748707L, 89294362230771L, 52058590967576L, 60568594469453L, 23772707032338L, 43019142889727L, 39566072849912L, 78870845257173L, 68135668032761L, 36844201017584L, 10133804676521L, 6275847412927L, 37492167783296L };
    assertEquals(75030497287405L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case81() {
    int[] magicalGirlStrength = { 1, 1, 1, 1, 1000 };
    int[] enemyStrength = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
    long[] enemyCount = { 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L };
    assertEquals(5000000000000000L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case82() {
    int[] magicalGirlStrength = { 2, 3, 5, 7, 8, 9, 10, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7 };
    int[] enemyStrength = { 1, 3, 4 };
    long[] enemyCount = { 2L, 9L, 4L };
    assertEquals(1L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case83() {
    int[] magicalGirlStrength = { 1 };
    int[] enemyStrength = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    long[] enemyCount = { 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L };
    assertEquals(5000000000000000L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case84() {
    int[] magicalGirlStrength = { 2, 3, 4 };
    int[] enemyStrength = { 4 };
    long[] enemyCount = { 4L };
    assertEquals(4L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case85() {
    int[] magicalGirlStrength = { 90, 1, 1 };
    int[] enemyStrength = { 89, 1, 10 };
    long[] enemyCount = { 100L, 100L, 100L };
    assertEquals(200L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case86() {
    int[] magicalGirlStrength = { 10000 };
    int[] enemyStrength = { 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000 };
    long[] enemyCount = { 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L };
    assertEquals(5000000000000000L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case87() {
    int[] magicalGirlStrength = { 1 };
    int[] enemyStrength = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    long[] enemyCount = { 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L };
    assertEquals(2000000000000000L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case88() {
    int[] magicalGirlStrength = { 51 };
    int[] enemyStrength = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
    long[] enemyCount = { 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L };
    assertEquals(5000000000000000L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case89() {
    int[] magicalGirlStrength = { 280, 539, 944, 925, 951, 33, 730, 842, 750, 66, 136, 64, 940, 991, 277, 936, 254, 269, 869, 755, 237, 743, 913, 398, 803, 763, 8, 6, 454, 21, 711, 761, 772, 154, 616, 921, 724, 68, 596 };
    int[] enemyStrength = { 209, 118, 689, 44, 347, 195, 782, 119, 797, 501, 612, 681, 17, 819, 929, 484, 241, 426, 129, 964, 44, 488, 612, 112, 245, 751, 623, 598, 963, 326, 576, 570, 183, 687, 766, 71, 11, 662, 770 };
    long[] enemyCount = { 8L, 70L, 84L, 70L, 82L, 4L, 65L, 41L, 38L, 74L, 81L, 96L, 30L, 49L, 12L, 16L, 16L, 19L, 80L, 11L, 26L, 51L, 19L, 67L, 71L, 92L, 35L, 29L, 21L, 74L, 34L, 48L, 64L, 3L, 17L, 59L, 95L, 59L, 36L };
    assertEquals(51L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case90() {
    int[] magicalGirlStrength = { 7358, 1712, 7879, 615, 4820, 5738, 3134, 592, 3721, 8763, 6634, 6198, 6032, 8589, 590, 4874, 8878 };
    int[] enemyStrength = { 7143, 6209, 8421, 2108, 7188, 5993, 6637, 1386, 6949 };
    long[] enemyCount = { 72076782012394L, 94475282307004L, 46069733819957L, 94016312013388L, 32156009009181L, 46043417298256L, 51714531775432L, 66135549669217L, 40183290531945L };
    assertEquals(56112604909319L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case91() {
    int[] magicalGirlStrength = { 3 };
    int[] enemyStrength = { 1, 4 };
    long[] enemyCount = { 1L, 1L };
    assertEquals(-1L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case92() {
    int[] magicalGirlStrength = { 2, 3 };
    int[] enemyStrength = { 3 };
    long[] enemyCount = { 10L };
    assertEquals(10L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case93() {
    int[] magicalGirlStrength = { 1, 1 };
    int[] enemyStrength = { 1 };
    long[] enemyCount = { 5L };
    assertEquals(3L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case94() {
    int[] magicalGirlStrength = { 958 };
    int[] enemyStrength = { 789, 57, 684, 741, 128, 794, 542, 367, 937, 739, 568, 872, 127, 261, 103, 763, 864, 360, 618, 307 };
    long[] enemyCount = { 20626770196420L, 45538527263992L, 52807114957507L, 17931716090785L, 65032910980630L, 88711853198687L, 26353250637092L, 61272534748707L, 89294362230771L, 52058590967576L, 60568594469453L, 23772707032338L, 43019142889727L, 39566072849912L, 78870845257173L, 68135668032761L, 36844201017584L, 10133804676521L, 6275847412927L, 37492167783296L };
    assertEquals(924306682693859L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case95() {
    int[] magicalGirlStrength = { 5, 5 };
    int[] enemyStrength = { 2, 3 };
    long[] enemyCount = { 5L, 6L };
    assertEquals(6L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case96() {
    int[] magicalGirlStrength = { 32, 33, 39, 42, 48, 28, 44, 23, 46, 19, 12, 15, 5, 32, 4, 21, 14, 11, 20 };
    int[] enemyStrength = { 33, 11, 11, 23, 9, 38 };
    long[] enemyCount = { 68708864L, 194681808L, 207689050L, 94702632L, 269596766L, 159540298L };
    assertEquals(58524672L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case97() {
    int[] magicalGirlStrength = { 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int[] enemyStrength = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
    long[] enemyCount = { 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L };
    assertEquals(5000000000000000L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case98() {
    int[] magicalGirlStrength = { 1000 };
    int[] enemyStrength = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    long[] enemyCount = { 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L, 100000000000000L };
    assertEquals(2100000000000000L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case99() {
    int[] magicalGirlStrength = { 8355, 8419, 5358, 2586, 3730, 1016, 6564, 6103, 918, 6644, 9420 };
    int[] enemyStrength = { 2850, 8656, 5884, 334, 9364, 1249, 4106, 339, 8000, 5947, 7131, 8745, 7993, 4174, 4124, 4498, 5561, 7291, 7252, 221, 6644, 6561, 1601, 1954, 8859, 2364, 6777, 3071, 8195, 7401, 2060, 3093, 9155, 1070, 23, 7770, 1092, 9151, 6140, 5624, 4691, 421, 3944, 9051, 6932, 5770, 8979, 6967 };
    long[] enemyCount = { 5527879067478L, 7063487082285L, 16027391942232L, 72376373071399L, 29702210998956L, 5060259441408L, 47780431736159L, 45716189614366L, 51998848631978L, 44648957645823L, 15031153343168L, 28594238603765L, 83368213467006L, 69563739965467L, 57777599598178L, 68116446569617L, 33117495539188L, 5747527119587L, 98688298882306L, 54239314912930L, 165741611350L, 85619261947283L, 2935547988367L, 37755040469466L, 48965170303810L, 57617296119043L, 73895872744683L, 67933219889148L, 53626676906658L, 3558770196308L, 12250689329697L, 97335564204182L, 18827579691461L, 35131874370916L, 61412551981124L, 60761146741343L, 12593281740600L, 55286214247014L, 95402849556600L, 35692497778541L, 83810163933696L, 97425233618089L, 25901419215790L, 25152759777920L, 42433587481470L, 81304801060495L, 89791423729524L, 24458622105634L };
    assertEquals(303383084434735L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case100() {
    int[] magicalGirlStrength = { 39, 27, 14, 61, 34, 8, 8, 92, 8, 22, 81, 2, 31, 54, 43, 73, 89, 11, 28, 43, 66, 17, 79, 35, 55, 86, 56, 42, 79, 40, 53, 73, 11, 13, 95, 11, 55, 9, 24, 89, 35, 41, 63, 74 };
    int[] enemyStrength = { 8 };
    long[] enemyCount = { 39441706735005L };
    assertEquals(917248993838L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case101() {
    int[] magicalGirlStrength = { 2, 1 };
    int[] enemyStrength = { 2 };
    long[] enemyCount = { 1L };
    assertEquals(1L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case102() {
    int[] magicalGirlStrength = { 1, 3 };
    int[] enemyStrength = { 1, 3 };
    long[] enemyCount = { 2L, 4L };
    assertEquals(4L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case103() {
    int[] magicalGirlStrength = { 100 };
    int[] enemyStrength = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    long[] enemyCount = { 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L };
    assertEquals(50L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case104() {
    int[] magicalGirlStrength = { 29, 94, 49, 84, 8, 22, 11, 18 };
    int[] enemyStrength = { 15, 17, 52, 50 };
    long[] enemyCount = { 10L, 36L, 1L, 20L };
    assertEquals(12L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case105() {
    int[] magicalGirlStrength = { 3 };
    int[] enemyStrength = { 3 };
    long[] enemyCount = { 1L };
    assertEquals(1L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case106() {
    int[] magicalGirlStrength = { 1 };
    int[] enemyStrength = { 1, 1 };
    long[] enemyCount = { 1L, 1L };
    assertEquals(2L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

  @Test
  public void case107() {
    int[] magicalGirlStrength = { 2, 3, 4 };
    int[] enemyStrength = { 2, 1 };
    long[] enemyCount = { 16L, 2L };
    assertEquals(6L, spacewardiv1.minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
  }

}
