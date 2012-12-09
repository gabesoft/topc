package topc.test.graph;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.graph.*;

public class IngredientProportionsTest {
  IngredientProportions ingredientproportions = new IngredientProportions();

  @Test
  public void case1() {
    String[] proportions = { "#0 and #1 as 6:4" };
    assertArrayEquals(new int[] { 3, 2 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case2() {
    String[] proportions = { "#0 and #1 as 9:8", "#1 and #2 as 9:8" };
    assertArrayEquals(new int[] { 81, 72, 64 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case3() {
    String[] proportions = { "#4 and #0 as 1:1", "#4 and #1 as 3:1", "#4 and #2 as 5:1", "#4 and #3 as 7:1" };
    assertArrayEquals(new int[] { 105, 35, 21, 15, 105 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case4() {
    String[] proportions = { "#2 and #3 as 6:8", "#0 and #1 as 9:3", "#3 and #0 as 7:5" };
    assertArrayEquals(new int[] { 60, 20, 63, 84 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case5() {
    String[] proportions = { "#0 and #1 as 9:9" };
    assertArrayEquals(new int[] { 1, 1 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case6() {
    String[] proportions = { "#1 and #0 as 9:1" };
    assertArrayEquals(new int[] { 1, 9 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case7() {
    String[] proportions = { "#0 and #1 as 6:9", "#1 and #2 as 8:6" };
    assertArrayEquals(new int[] { 8, 12, 9 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case8() {
    String[] proportions = { "#0 and #1 as 1:5", "#5 and #4 as 4:2", "#2 and #1 as 3:3", "#3 and #4 as 4:2", "#1 and #4 as 5:1" };
    assertArrayEquals(new int[] { 1, 5, 5, 2, 1, 2 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case9() {
    String[] proportions = { "#0 and #2 as 5:6", "#2 and #4 as 6:7", "#1 and #3 as 6:8", "#3 and #5 as 8:9", "#3 and #2 as 8:9" };
    assertArrayEquals(new int[] { 15, 12, 18, 16, 21, 18 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case10() {
    String[] proportions = { "#1 and #4 as 1:9", "#0 and #1 as 1:9", "#9 and #6 as 8:3", "#2 and #6 as 2:8", "#5 and #8 as 5:1", "#8 and #7 as 5:1", "#3 and #4 as 1:6", "#9 and #3 as 6:1", "#3 and #5 as 1:7" };
    assertArrayEquals(new int[] { 800, 7200, 6075, 10800, 64800, 75600, 24300, 3024, 15120, 64800 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case11() {
    String[] proportions = { "#3 and #5 as 1:7", "#9 and #6 as 8:3", "#9 and #3 as 6:1", "#1 and #4 as 1:9", "#8 and #7 as 5:1", "#5 and #8 as 5:1", "#0 and #1 as 1:9", "#2 and #6 as 2:8", "#3 and #4 as 1:6" };
    assertArrayEquals(new int[] { 800, 7200, 6075, 10800, 64800, 75600, 24300, 3024, 15120, 64800 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case12() {
    String[] proportions = { "#7 and #1 as 9:1", "#1 and #8 as 9:1", "#7 and #5 as 1:9", "#4 and #2 as 9:1", "#3 and #9 as 9:1", "#6 and #4 as 9:1", "#6 and #0 as 1:9", "#3 and #2 as 1:9", "#9 and #5 as 9:1" };
    assertArrayEquals(new int[] { 387420489, 9, 531441, 59049, 4782969, 729, 43046721, 81, 1, 6561 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case13() {
    String[] proportions = { "#7 and #3 as 7:1", "#1 and #4 as 1:1", "#9 and #5 as 1:8", "#7 and #8 as 1:5", "#5 and #6 as 1:8", "#2 and #9 as 1:7", "#2 and #1 as 5:1", "#8 and #4 as 1:8", "#6 and #0 as 1:5" };
    assertArrayEquals(new int[] { 3136000, 280, 1400, 1, 280, 78400, 627200, 7, 35, 9800 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case14() {
    String[] proportions = { "#1 and #9 as 6:6", "#0 and #7 as 2:1", "#8 and #4 as 7:6", "#3 and #7 as 2:5", "#9 and #0 as 5:5", "#1 and #2 as 6:2", "#5 and #6 as 4:5", "#8 and #3 as 3:6", "#4 and #5 as 3:4" };
    assertArrayEquals(new int[] { 210, 210, 70, 42, 18, 24, 30, 105, 21, 210 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case15() {
    String[] proportions = { "#0 and #1 as 9:1", "#1 and #2 as 9:1", "#3 and #2 as 1:9", "#4 and #3 as 1:9", "#4 and #5 as 9:1", "#5 and #6 as 9:1", "#7 and #6 as 1:9", "#7 and #8 as 9:1", "#9 and #8 as 1:9" };
    assertArrayEquals(new int[] { 387420489, 43046721, 4782969, 531441, 59049, 6561, 729, 81, 9, 1 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case16() {
    String[] proportions = { "#1 and #0 as 1:4", "#0 and #2 as 4:2", "#0 and #3 as 4:3", "#0 and #4 as 4:4", "#5 and #0 as 5:4", "#6 and #0 as 6:4", "#0 and #7 as 4:7", "#0 and #8 as 4:8", "#0 and #9 as 4:9" };
    assertArrayEquals(new int[] { 4, 1, 2, 3, 4, 5, 6, 7, 8, 9 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case17() {
    String[] proportions = { "#1 and #0 as 1:1", "#0 and #2 as 2:1", "#3 and #0 as 1:3", "#4 and #0 as 1:4", "#0 and #5 as 5:1", "#0 and #6 as 6:1", "#7 and #0 as 1:7", "#0 and #8 as 8:1", "#9 and #0 as 1:9" };
    assertArrayEquals(new int[] { 2520, 2520, 1260, 840, 630, 504, 420, 360, 315, 280 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case18() {
    String[] proportions = { "#5 and #9 as 8:5", "#6 and #9 as 9:6", "#3 and #9 as 8:4", "#9 and #4 as 7:7", "#0 and #7 as 4:6", "#1 and #0 as 7:5", "#8 and #0 as 4:8", "#2 and #0 as 8:4", "#2 and #3 as 7:9" };
    assertArrayEquals(new int[] { 70, 98, 140, 180, 90, 144, 135, 105, 35, 90 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case19() {
    String[] proportions = { "#8 and #0 as 4:8", "#1 and #0 as 7:5", "#5 and #9 as 8:5", "#3 and #9 as 8:4", "#2 and #0 as 8:4", "#6 and #9 as 9:6", "#9 and #4 as 7:7", "#2 and #3 as 7:9", "#0 and #7 as 4:6" };
    assertArrayEquals(new int[] { 70, 98, 140, 180, 90, 144, 135, 105, 35, 90 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case20() {
    String[] proportions = { "#9 and #3 as 9:1", "#9 and #1 as 1:8", "#1 and #0 as 1:7", "#0 and #2 as 1:8", "#2 and #4 as 1:9", "#9 and #8 as 1:5", "#6 and #1 as 7:8", "#0 and #5 as 9:4", "#2 and #7 as 5:3" };
    assertArrayEquals(new int[] { 2520, 360, 20160, 5, 181440, 1120, 315, 12096, 225, 45 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case21() {
    String[] proportions = { "#6 and #1 as 7:8", "#2 and #4 as 1:9", "#0 and #2 as 1:8", "#0 and #5 as 9:4", "#9 and #8 as 1:5", "#1 and #0 as 1:7", "#9 and #1 as 1:8", "#2 and #7 as 5:3", "#9 and #3 as 9:1" };
    assertArrayEquals(new int[] { 2520, 360, 20160, 5, 181440, 1120, 315, 12096, 225, 45 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case22() {
    String[] proportions = { "#1 and #0 as 7:5", "#3 and #2 as 4:9", "#6 and #1 as 7:8", "#3 and #5 as 6:5", "#8 and #9 as 9:7", "#3 and #0 as 5:8", "#7 and #4 as 2:9", "#4 and #9 as 8:3", "#1 and #8 as 5:7" };
    assertArrayEquals(new int[] { 194400, 272160, 273375, 121500, 790272, 101250, 238140, 175616, 381024, 296352 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case23() {
    String[] proportions = { "#3 and #6 as 3:6", "#5 and #3 as 7:5", "#4 and #2 as 4:7", "#1 and #5 as 3:8", "#1 and #7 as 8:9", "#2 and #3 as 8:9", "#8 and #4 as 5:9", "#9 and #3 as 4:1", "#0 and #7 as 1:2" };
    assertArrayEquals(new int[] { 107163, 190512, 322560, 362880, 184320, 508032, 725760, 214326, 102400, 1451520 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case24() {
    String[] proportions = { "#5 and #4 as 8:7", "#1 and #3 as 3:5", "#5 and #6 as 7:1", "#7 and #6 as 8:9", "#4 and #2 as 2:9", "#7 and #0 as 7:2", "#2 and #3 as 4:9" };
    assertArrayEquals(new int[] { 5120, 750141, 555660, 1250235, 123480, 141120, 20160, 17920 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case25() {
    String[] proportions = { "#2 and #3 as 6:8", "#0 and #1 as 9:3", "#3 and #0 as 7:5" };
    assertArrayEquals(new int[] { 60, 20, 63, 84 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case26() {
    String[] proportions = { "#0 and #1 as 9:8", "#1 and #2 as 9:8", "#2 and #3 as 9:8", "#3 and #4 as 9:8", "#4 and #5 as 9:8", "#5 and #6 as 9:8", "#6 and #7 as 9:8", "#7 and #8 as 9:8", "#8 and #9 as 9:8" };
    assertArrayEquals(new int[] { 387420489, 344373768, 306110016, 272097792, 241864704, 214990848, 191102976, 169869312, 150994944, 134217728 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case27() {
    String[] proportions = { "#4 and #0 as 1:1", "#4 and #1 as 3:1", "#4 and #2 as 5:1", "#4 and #3 as 7:1" };
    assertArrayEquals(new int[] { 105, 35, 21, 15, 105 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case28() {
    String[] proportions = { "#0 and #1 as 1:2", "#1 and #2 as 2:3", "#2 and #3 as 3:4", "#3 and #4 as 4:5", "#3 and #5 as 5:6", "#5 and #6 as 6:7", "#6 and #7 as 7:8", "#7 and #8 as 8:9", "#9 and #8 as 8:9" };
    assertArrayEquals(new int[] { 5, 10, 15, 20, 25, 24, 28, 32, 36, 32 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case29() {
    String[] proportions = { "#0 and #1 as 9:8", "#1 and #2 as 9:9", "#0 and #3 as 9:9", "#3 and #4 as 7:8", "#0 and #5 as 8:9", "#6 and #5 as 5:7", "#5 and #7 as 8:3", "#7 and #8 as 9:9", "#7 and #9 as 8:9" };
    assertArrayEquals(new int[] { 32256, 28672, 28672, 32256, 36864, 36288, 25920, 13608, 13608, 15309 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case30() {
    String[] proportions = { "#0 and #1 as 2:3", "#1 and #2 as 3:2" };
    assertArrayEquals(new int[] { 2, 3, 2 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case31() {
    String[] proportions = { "#0 and #1 as 7:9", "#1 and #2 as 2:9", "#2 and #3 as 3:9", "#3 and #4 as 4:9", "#4 and #5 as 5:9", "#4 and #6 as 7:8", "#4 and #7 as 7:9", "#7 and #8 as 8:9", "#9 and #8 as 9:4" };
    assertArrayEquals(new int[] { 62720, 80640, 362880, 1088640, 2449440, 4408992, 2799360, 3149280, 3542940, 7971615 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case32() {
    String[] proportions = { "#0 and #1 as 9:8", "#1 and #2 as 9:8", "#2 and #3 as 9:8", "#3 and #4 as 9:8", "#5 and #6 as 9:8", "#6 and #7 as 9:8", "#7 and #8 as 9:8", "#8 and #9 as 9:8", "#4 and #5 as 9:8" };
    assertArrayEquals(new int[] { 387420489, 344373768, 306110016, 272097792, 241864704, 214990848, 191102976, 169869312, 150994944, 134217728 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case33() {
    String[] proportions = { "#0 and #1 as 8:9", "#1 and #2 as 8:9", "#2 and #3 as 8:9", "#3 and #4 as 8:9", "#4 and #5 as 8:9", "#5 and #6 as 8:9", "#6 and #7 as 8:9", "#7 and #8 as 8:9", "#8 and #9 as 8:9" };
    assertArrayEquals(new int[] { 134217728, 150994944, 169869312, 191102976, 214990848, 241864704, 272097792, 306110016, 344373768, 387420489 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case34() {
    String[] proportions = { "#0 and #2 as 6:8", "#1 and #3 as 9:3", "#2 and #3 as 7:5" };
    assertArrayEquals(new int[] { 21, 60, 28, 20 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case35() {
    String[] proportions = { "#0 and #1 as 8:9", "#1 and #2 as 8:9", "#2 and #3 as 8:9", "#3 and #4 as 8:9", "#4 and #5 as 8:9", "#5 and #6 as 8:9", "#6 and #7 as 8:9", "#7 and #8 as 8:9", "#8 and #9 as 7:9" };
    assertArrayEquals(new int[] { 117440512, 132120576, 148635648, 167215104, 188116992, 211631616, 238085568, 267846264, 301327047, 387420489 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case36() {
    String[] proportions = { "#1 and #2 as 7:9", "#0 and #1 as 1:3" };
    assertArrayEquals(new int[] { 7, 21, 27 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case37() {
    String[] proportions = { "#6 and #3 as 9:7", "#2 and #8 as 6:8", "#1 and #0 as 5:2", "#1 and #5 as 9:1", "#3 and #5 as 9:1", "#2 and #7 as 9:2", "#7 and #4 as 9:2", "#4 and #0 as 9:3" };
    assertArrayEquals(new int[] { 252, 630, 15309, 630, 756, 70, 810, 3402, 20412 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case38() {
    String[] proportions = { "#0 and #1 as 1:9", "#1 and #2 as 1:9", "#2 and #3 as 1:9", "#3 and #4 as 1:9", "#4 and #5 as 1:9", "#5 and #6 as 1:9", "#6 and #7 as 1:9", "#7 and #8 as 1:9", "#8 and #9 as 1:9" };
    assertArrayEquals(new int[] { 1, 9, 81, 729, 6561, 59049, 531441, 4782969, 43046721, 387420489 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case39() {
    String[] proportions = { "#0 and #3 as 1:2", "#1 and #2 as 2:1", "#2 and #3 as 2:1" };
    assertArrayEquals(new int[] { 1, 8, 4, 2 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case40() {
    String[] proportions = { "#0 and #1 as 8:9", "#1 and #2 as 8:9", "#2 and #3 as 8:9", "#3 and #4 as 8:9", "#5 and #6 as 8:9", "#6 and #7 as 8:9", "#7 and #8 as 8:9", "#8 and #9 as 8:9", "#4 and #5 as 8:9" };
    assertArrayEquals(new int[] { 134217728, 150994944, 169869312, 191102976, 214990848, 241864704, 272097792, 306110016, 344373768, 387420489 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case41() {
    String[] proportions = { "#8 and #9 as 2:1", "#0 and #1 as 3:7", "#7 and #6 as 5:2", "#4 and #3 as 7:9", "#5 and #4 as 9:8", "#0 and #8 as 8:3", "#2 and #3 as 6:5", "#9 and #2 as 4:7", "#5 and #6 as 3:9" };
    assertArrayEquals(new int[] { 18432, 43008, 6048, 5040, 3920, 4410, 13230, 33075, 6912, 3456 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case42() {
    String[] proportions = { "#0 and #1 as 9:1", "#1 and #2 as 9:1", "#2 and #3 as 9:1", "#3 and #4 as 9:1", "#4 and #5 as 9:1", "#5 and #6 as 9:1", "#6 and #7 as 9:1", "#7 and #8 as 9:1", "#8 and #9 as 9:1" };
    assertArrayEquals(new int[] { 387420489, 43046721, 4782969, 531441, 59049, 6561, 729, 81, 9, 1 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case43() {
    String[] proportions = { "#0 and #2 as 1:2", "#2 and #1 as 2:3", "#1 and #3 as 2:7", "#3 and #4 as 1:2", "#4 and #5 as 2:9" };
    assertArrayEquals(new int[] { 2, 6, 4, 21, 42, 189 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case44() {
    String[] proportions = { "#0 and #1 as 9:3", "#9 and #8 as 9:5", "#2 and #3 as 9:7", "#5 and #4 as 9:1", "#6 and #7 as 9:8", "#1 and #8 as 9:8", "#3 and #4 as 9:7", "#1 and #3 as 5:8", "#5 and #7 as 7:8" };
    assertArrayEquals(new int[] { 945, 315, 648, 504, 392, 3528, 4536, 4032, 280, 504 }, ingredientproportions.getMasses(proportions));
  }

  @Test
  public void case45() {
    String[] proportions = { "#0 and #1 as 3:2", "#2 and #1 as 9:7" };
    assertArrayEquals(new int[] { 21, 14, 18 }, ingredientproportions.getMasses(proportions));
  }

}
