package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class KingOfTheCourtTest {
  double DELTA = 1.0e-09;
  KingOfTheCourt kingofthecourt = new KingOfTheCourt();

  @Test
  public void case1() {
    int[] ability = { 1, 1 };
    assertEquals(0.8, kingofthecourt.chancesOfWinning(ability), DELTA * 0.8);
  }

  @Test
  public void case2() {
    int[] ability = { 2, 1 };
    assertEquals(0.9350649350649349, kingofthecourt.chancesOfWinning(ability), DELTA * 0.9350649350649349);
  }

  @Test
  public void case3() {
    int[] ability = { 1, 2 };
    assertEquals(0.5844155844155844, kingofthecourt.chancesOfWinning(ability), DELTA * 0.5844155844155844);
  }

  @Test
  public void case4() {
    int[] ability = { 1, 1, 1, 1 };
    assertEquals(0.5065812082824602, kingofthecourt.chancesOfWinning(ability), DELTA * 0.5065812082824602);
  }

  @Test
  public void case5() {
    int[] ability = { 47, 82, 65, 99, 2, 14, 9 };
    assertEquals(0.22734781036506918, kingofthecourt.chancesOfWinning(ability), DELTA * 0.22734781036506918);
  }

  @Test
  public void case6() {
    int[] ability = { 39, 13, 54 };
    assertEquals(0.6762153623688765, kingofthecourt.chancesOfWinning(ability), DELTA * 0.6762153623688765);
  }

  @Test
  public void case7() {
    int[] ability = { 86, 2 };
    assertEquals(0.9999767767581795, kingofthecourt.chancesOfWinning(ability), DELTA * 0.9999767767581795);
  }

  @Test
  public void case8() {
    int[] ability = { 89, 46, 1, 91, 18, 36, 12 };
    assertEquals(0.6868719469373123, kingofthecourt.chancesOfWinning(ability), DELTA * 0.6868719469373123);
  }

  @Test
  public void case9() {
    int[] ability = { 39, 41, 59, 32, 97, 42 };
    assertEquals(0.16379671009097374, kingofthecourt.chancesOfWinning(ability), DELTA * 0.16379671009097374);
  }

  @Test
  public void case10() {
    int[] ability = { 35, 69 };
    assertEquals(0.5891924484230299, kingofthecourt.chancesOfWinning(ability), DELTA * 0.5891924484230299);
  }

  @Test
  public void case11() {
    int[] ability = { 8, 71, 70 };
    assertEquals(0.037826189197781315, kingofthecourt.chancesOfWinning(ability), DELTA * 0.037826189197781315);
  }

  @Test
  public void case12() {
    int[] ability = { 60, 29, 55 };
    assertEquals(0.7692771265722392, kingofthecourt.chancesOfWinning(ability), DELTA * 0.7692771265722392);
  }

  @Test
  public void case13() {
    int[] ability = { 65, 96, 55, 79, 97 };
    assertEquals(0.28015674257401985, kingofthecourt.chancesOfWinning(ability), DELTA * 0.28015674257401985);
  }

  @Test
  public void case14() {
    int[] ability = { 94, 3, 60, 33, 19, 22, 22 };
    assertEquals(0.8428053892425473, kingofthecourt.chancesOfWinning(ability), DELTA * 0.8428053892425473);
  }

  @Test
  public void case15() {
    int[] ability = { 14, 85 };
    assertEquals(0.2667629127540412, kingofthecourt.chancesOfWinning(ability), DELTA * 0.2667629127540412);
  }

  @Test
  public void case16() {
    int[] ability = { 71, 42, 91, 40, 20, 50 };
    assertEquals(0.511518638371499, kingofthecourt.chancesOfWinning(ability), DELTA * 0.511518638371499);
  }

  @Test
  public void case17() {
    int[] ability = { 18, 50, 53, 57 };
    assertEquals(0.0925390880924591, kingofthecourt.chancesOfWinning(ability), DELTA * 0.0925390880924591);
  }

  @Test
  public void case18() {
    int[] ability = { 99, 40, 94 };
    assertEquals(0.7747150192386446, kingofthecourt.chancesOfWinning(ability), DELTA * 0.7747150192386446);
  }

  @Test
  public void case19() {
    int[] ability = { 16, 74 };
    assertEquals(0.3310234290528628, kingofthecourt.chancesOfWinning(ability), DELTA * 0.3310234290528628);
  }

  @Test
  public void case20() {
    int[] ability = { 99, 62 };
    assertEquals(0.902297361097626, kingofthecourt.chancesOfWinning(ability), DELTA * 0.902297361097626);
  }

  @Test
  public void case21() {
    int[] ability = { 16, 71, 58, 73 };
    assertEquals(0.04401935785171435, kingofthecourt.chancesOfWinning(ability), DELTA * 0.04401935785171435);
  }

  @Test
  public void case22() {
    int[] ability = { 65, 49, 85, 99, 82, 75 };
    assertEquals(0.2258693317308275, kingofthecourt.chancesOfWinning(ability), DELTA * 0.2258693317308275);
  }

  @Test
  public void case23() {
    int[] ability = { 15, 57 };
    assertEquals(0.3837013673079247, kingofthecourt.chancesOfWinning(ability), DELTA * 0.3837013673079247);
  }

  @Test
  public void case24() {
    int[] ability = { 24, 10, 19, 14, 6, 69 };
    assertEquals(0.30833921892246624, kingofthecourt.chancesOfWinning(ability), DELTA * 0.30833921892246624);
  }

  @Test
  public void case25() {
    int[] ability = { 72, 89, 91, 93, 94, 96, 99 };
    assertEquals(0.1403814777824161, kingofthecourt.chancesOfWinning(ability), DELTA * 0.1403814777824161);
  }

  @Test
  public void case26() {
    int[] ability = { 47, 82, 65, 99, 2, 14, 9 };
    assertEquals(0.22734781036506918, kingofthecourt.chancesOfWinning(ability), DELTA * 0.22734781036506918);
  }

  @Test
  public void case27() {
    int[] ability = { 50, 2, 30, 4, 5, 6, 7 };
    assertEquals(0.8971810034837033, kingofthecourt.chancesOfWinning(ability), DELTA * 0.8971810034837033);
  }

}
