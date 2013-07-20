package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class WaterLevelTest {
  double DELTA = 1.0e-09;
  WaterLevel waterlevel = new WaterLevel();

  @Test
  public void case1() {
    int evapNormal = 20;
    int evapFlood = 40;
    int[] rain = { 0, 60, 0, 0 };
    assertEquals(-35.0, waterlevel.netAmt(evapNormal, evapFlood, rain), DELTA * -35.0);
  }

  @Test
  public void case2() {
    int evapNormal = 20;
    int evapFlood = 39;
    int[] rain = { 0, 60 };
    assertEquals(10.5, waterlevel.netAmt(evapNormal, evapFlood, rain), DELTA * 10.5);
  }

  @Test
  public void case3() {
    int evapNormal = 20;
    int evapFlood = 40;
    int[] rain = { 0 };
    assertEquals(-20.0, waterlevel.netAmt(evapNormal, evapFlood, rain), DELTA * -20.0);
  }

  @Test
  public void case4() {
    int evapNormal = 20;
    int evapFlood = 40;
    int[] rain = { 1 };
    assertEquals(-19.0, waterlevel.netAmt(evapNormal, evapFlood, rain), DELTA * -19.0);
  }

  @Test
  public void case5() {
    int evapNormal = 287;
    int evapFlood = 912;
    int[] rain = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
    assertEquals(-14125.0, waterlevel.netAmt(evapNormal, evapFlood, rain), DELTA * -14125.0);
  }

  @Test
  public void case6() {
    int evapNormal = 20;
    int evapFlood = 40;
    int[] rain = { 30, 40, 20, 0 };
    assertEquals(-20.0, waterlevel.netAmt(evapNormal, evapFlood, rain), DELTA * -20.0);
  }

  @Test
  public void case7() {
    int evapNormal = 200;
    int evapFlood = 800;
    int[] rain = { 0, 600 };
    assertEquals(0.0, waterlevel.netAmt(evapNormal, evapFlood, rain), DELTA);
  }

  @Test
  public void case8() {
    int evapNormal = 100;
    int evapFlood = 212;
    int[] rain = { 0, 230, 0, 0, 0, 0, 0, 0 };
    assertEquals(-598.0406386066763, waterlevel.netAmt(evapNormal, evapFlood, rain), DELTA * -598.0406386066763);
  }

  @Test
  public void case9() {
    int evapNormal = 100;
    int evapFlood = 212;
    int[] rain = { 0, 200, 200, 200, 200, 213 };
    assertEquals(1.0, waterlevel.netAmt(evapNormal, evapFlood, rain), DELTA * 1.0);
  }

  @Test
  public void case10() {
    int evapNormal = 150;
    int evapFlood = 150;
    int[] rain = { 150, 150, 150, 150, 140, 162, 0 };
    assertEquals(-148.0, waterlevel.netAmt(evapNormal, evapFlood, rain), DELTA * -148.0);
  }

  @Test
  public void case11() {
    int evapNormal = 100;
    int evapFlood = 900;
    int[] rain = { 0, 800, 3, 1000 };
    assertEquals(89.22222222222223, waterlevel.netAmt(evapNormal, evapFlood, rain), DELTA * 89.22222222222223);
  }

  @Test
  public void case12() {
    int evapNormal = 300;
    int evapFlood = 379;
    int[] rain = { 0, 800, 0, 800, 512, 555, 1000 };
    assertEquals(1210.6370448548812, waterlevel.netAmt(evapNormal, evapFlood, rain), DELTA * 1210.6370448548812);
  }

  @Test
  public void case13() {
    int evapNormal = 200;
    int evapFlood = 300;
    int[] rain = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
    assertEquals(-2880.0, waterlevel.netAmt(evapNormal, evapFlood, rain), DELTA * -2880.0);
  }

  @Test
  public void case14() {
    int evapNormal = 300;
    int evapFlood = 400;
    int[] rain = { 322, 389, 400, 400 };
    assertEquals(0.0, waterlevel.netAmt(evapNormal, evapFlood, rain), DELTA);
  }

  @Test
  public void case15() {
    int evapNormal = 0;
    int evapFlood = 3;
    int[] rain = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    assertEquals(0.0, waterlevel.netAmt(evapNormal, evapFlood, rain), DELTA);
  }

  @Test
  public void case16() {
    int evapNormal = 0;
    int evapFlood = 37;
    int[] rain = { 0, 0, 0, 50, 0, 0, 0, 0 };
    assertEquals(0.0, waterlevel.netAmt(evapNormal, evapFlood, rain), DELTA);
  }

  @Test
  public void case17() {
    int evapNormal = 200;
    int evapFlood = 800;
    int[] rain = { 0, 600 };
    assertEquals(0.0, waterlevel.netAmt(evapNormal, evapFlood, rain), DELTA);
  }

  @Test
  public void case18() {
    int evapNormal = 17;
    int evapFlood = 35;
    int[] rain = { 0, 40, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 861 };
    assertEquals(577.0584174737277, waterlevel.netAmt(evapNormal, evapFlood, rain), DELTA * 577.0584174737277);
  }

  @Test
  public void case19() {
    int evapNormal = 1;
    int evapFlood = 2;
    int[] rain = { 3 };
    assertEquals(1.0, waterlevel.netAmt(evapNormal, evapFlood, rain), DELTA * 1.0);
  }

  @Test
  public void case20() {
    int evapNormal = 20;
    int evapFlood = 40;
    int[] rain = { 30, 0, 60, 0, 0, 13, 43, 21, 19 };
    assertEquals(-19.0, waterlevel.netAmt(evapNormal, evapFlood, rain), DELTA * -19.0);
  }

  @Test
  public void case21() {
    int evapNormal = 0;
    int evapFlood = 10;
    int[] rain = { 5 };
    assertEquals(0.0, waterlevel.netAmt(evapNormal, evapFlood, rain), DELTA);
  }

  @Test
  public void case22() {
    int evapNormal = 0;
    int evapFlood = 200;
    int[] rain = { 1 };
    assertEquals(0.0, waterlevel.netAmt(evapNormal, evapFlood, rain), DELTA);
  }

  @Test
  public void case23() {
    int evapNormal = 100;
    int evapFlood = 200;
    int[] rain = { 1, 2, 3, 4 };
    assertEquals(-390.0, waterlevel.netAmt(evapNormal, evapFlood, rain), DELTA * -390.0);
  }

  @Test
  public void case24() {
    int evapNormal = 123;
    int evapFlood = 689;
    int[] rain = { 0, 600, 600, 0, 0, 0, 0, 687, 364, 357, 0, 0, 0, 0, 453, 876, 754, 243, 159, 955, 466, 955, 955, 957, 0, 0, 0, 0, 0, 0, 0, 345, 786, 921, 783 };
    assertEquals(351.5289980232352, waterlevel.netAmt(evapNormal, evapFlood, rain), DELTA * 351.5289980232352);
  }

  @Test
  public void case25() {
    int evapNormal = 10;
    int evapFlood = 100;
    int[] rain = { 10, 100, 100, 100, 1000, 10, 1, 0, 1, 1, 21, 100, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 10, 100, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
    assertEquals(32644.0, waterlevel.netAmt(evapNormal, evapFlood, rain), DELTA * 32644.0);
  }

  @Test
  public void case26() {
    int evapNormal = 10;
    int evapFlood = 100;
    int[] rain = { 10, 100, 100, 10, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1, 1000, 1000, 1, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1, 1, 1, 1, 1, 1, 1, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
    assertEquals(32409.0, waterlevel.netAmt(evapNormal, evapFlood, rain), DELTA * 32409.0);
  }

  @Test
  public void case27() {
    int evapNormal = 20;
    int evapFlood = 40;
    int[] rain = { 0 };
    assertEquals(-20.0, waterlevel.netAmt(evapNormal, evapFlood, rain), DELTA * -20.0);
  }

}
