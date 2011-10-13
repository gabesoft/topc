package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class ChipRaceTest {
  double DELTA = 1.0e-09;
  ChipRace chiprace = new ChipRace();

  //@Test
  public void case1() {
    int[] chips = { 1, 1 };
    assertArrayEquals(new double[] { 0.0, 0.0 }, chiprace.chances(chips), DELTA);
  }

  //@Test
  public void case2() {
    int[] chips = { 1, 2 };
    assertArrayEquals(new double[] { 0.3333333333333333, 0.6666666666666666 }, chiprace.chances(chips), DELTA);
  }

  @Test
  public void case3() {
    int[] chips = { 3, 2, 3 };
    assertArrayEquals(new double[] { 0.725, 0.55, 0.725 }, chiprace.chances(chips), DELTA);
  }

  @Test
  public void case4() {
    int[] chips = { 0, 1, 2, 3, 4 };
    assertArrayEquals(new double[] { 0.0, 0.23452380952380952, 0.4412698412698413, 0.6083333333333334, 0.7158730158730159 }, chiprace.chances(chips), DELTA);
  }

  //@Test
  public void case5() {
    int[] chips = { 0, 1, 1, 0, 0, 0, 0, 1, 1, 0 };
    assertArrayEquals(new double[] { 0.0, 0.25, 0.25, 0.0, 0.0, 0.0, 0.0, 0.25, 0.25, 0.0 }, chiprace.chances(chips), DELTA);
  }

  //@Test
  public void case6() {
    int[] chips = { 0 };
    assertArrayEquals(new double[] { 0.0 }, chiprace.chances(chips), DELTA);
  }

  //@Test
  public void case7() {
    int[] chips = { 1 };
    assertArrayEquals(new double[] { 0.0 }, chiprace.chances(chips), DELTA);
  }

  //@Test
  public void case8() {
    int[] chips = { 2 };
    assertArrayEquals(new double[] { 0.0 }, chiprace.chances(chips), DELTA);
  }

  //@Test
  public void case9() {
    int[] chips = { 3 };
    assertArrayEquals(new double[] { 1.0 }, chiprace.chances(chips), DELTA);
  }

  //@Test
  public void case10() {
    int[] chips = { 4 };
    assertArrayEquals(new double[] { 1.0 }, chiprace.chances(chips), DELTA);
  }

  //@Test
  public void case11() {
    int[] chips = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    assertArrayEquals(new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 }, chiprace.chances(chips), DELTA);
  }

  //@Test
  public void case12() {
    int[] chips = { 4, 4, 4, 4, 4, 4, 4, 4, 4, 4 };
    assertArrayEquals(new double[] { 0.7999999999999999, 0.7999999999999999, 0.7999999999999999, 0.7999999999999999, 0.7999999999999999, 0.7999999999999999, 0.7999999999999999, 0.7999999999999999, 0.7999999999999999, 0.7999999999999999 }, chiprace.chances(chips), DELTA);
  }

  //@Test
  public void case13() {
    int[] chips = { 4, 4, 4, 4, 4, 4, 4, 4, 4, 3 };
    assertArrayEquals(new double[] { 0.8098535383838402, 0.8098535383838402, 0.8098535383838402, 0.8098535383838402, 0.8098535383838402, 0.8098535383838402, 0.8098535383838402, 0.8098535383838402, 0.8098535383838402, 0.7113181545454373 }, chiprace.chances(chips), DELTA);
  }

  //@Test
  public void case14() {
    int[] chips = { 3, 4, 4, 4, 4, 4, 4, 4, 4, 4 };
    assertArrayEquals(new double[] { 0.7113181545454373, 0.8098535383838402, 0.8098535383838402, 0.8098535383838402, 0.8098535383838402, 0.8098535383838402, 0.8098535383838402, 0.8098535383838402, 0.8098535383838402, 0.8098535383838402 }, chiprace.chances(chips), DELTA);
  }

  //@Test
  public void case15() {
    int[] chips = { 2, 0, 1, 4, 3, 2, 3, 4, 1, 2 };
    assertArrayEquals(new double[] { 0.3975378165006648, 0.0, 0.2174042503763866, 0.6467565114623939, 0.5395325134102223, 0.3975378165006648, 0.5395325134102223, 0.6467565114623939, 0.2174042503763866, 0.3975378165006648 }, chiprace.chances(chips), DELTA);
  }

  //@Test
  public void case16() {
    int[] chips = { 4, 0, 2, 4, 1, 2, 4, 2, 3, 4 };
    assertArrayEquals(new double[] { 0.7030558798226049, 0.0, 0.44743931678916204, 0.7030558798226049, 0.24918667055563, 0.44743931678916204, 0.7030558798226049, 0.44743931678916204, 0.5962718597864648, 0.7030558798226049 }, chiprace.chances(chips), DELTA);
  }

  //@Test
  public void case17() {
    int[] chips = { 0, 1, 0, 0, 0, 0, 0, 0, 0 };
    assertArrayEquals(new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 }, chiprace.chances(chips), DELTA);
  }

  //@Test
  public void case18() {
    int[] chips = { 0, 0, 1, 0, 0, 1, 0, 0, 0 };
    assertArrayEquals(new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 }, chiprace.chances(chips), DELTA);
  }

  //@Test
  public void case19() {
    int[] chips = { 0, 0, 0, 1, 1, 0, 1, 0, 0 };
    assertArrayEquals(new double[] { 0.0, 0.0, 0.0, 0.3333333333333333, 0.3333333333333333, 0.0, 0.3333333333333333, 0.0, 0.0 }, chiprace.chances(chips), DELTA);
  }

  //@Test
  public void case20() {
    int[] chips = { 0, 0, 0, 0, 0, 0, 0, 2, 0 };
    assertArrayEquals(new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 }, chiprace.chances(chips), DELTA);
  }

  //@Test
  public void case21() {
    int[] chips = { 0, 0, 0, 0, 0, 1, 0, 1, 1 };
    assertArrayEquals(new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.3333333333333333, 0.0, 0.3333333333333333, 0.3333333333333333 }, chiprace.chances(chips), DELTA);
  }

  //@Test
  public void case22() {
    int[] chips = { 2, 2, 2, 2, 2, 2, 2, 3, 2, 2 };
    assertArrayEquals(new double[] { 0.3861713106295151, 0.3861713106295151, 0.3861713106295151, 0.3861713106295151, 0.3861713106295151, 0.3861713106295151, 0.3861713106295151, 0.5244582043343653, 0.3861713106295151, 0.3861713106295151 }, chiprace.chances(chips), DELTA);
  }

  //@Test
  public void case23() {
    int[] chips = { 2, 3, 4, 4, 4, 4, 4, 4, 4, 4 };
    assertArrayEquals(new double[] { 0.47856455442662343, 0.630282831995987, 0.7363940766971738, 0.7363940766971738, 0.7363940766971738, 0.7363940766971738, 0.7363940766971738, 0.7363940766971738, 0.7363940766971738, 0.7363940766971738 }, chiprace.chances(chips), DELTA);
  }

  //@Test
  public void case24() {
    int[] chips = { 4, 4, 4, 4, 4, 4, 4, 4, 4, 4 };
    assertArrayEquals(new double[] { 0.7999999999999999, 0.7999999999999999, 0.7999999999999999, 0.7999999999999999, 0.7999999999999999, 0.7999999999999999, 0.7999999999999999, 0.7999999999999999, 0.7999999999999999, 0.7999999999999999 }, chiprace.chances(chips), DELTA);
  }

  //@Test
  public void case25() {
    int[] chips = { 3, 4, 4, 2 };
    assertArrayEquals(new double[] { 0.7485181485181485, 0.8377067377067378, 0.8377067377067378, 0.576068376068376 }, chiprace.chances(chips), DELTA);
  }

  //@Test
  public void case26() {
    int[] chips = { 1, 1 };
    assertArrayEquals(new double[] { 0.0, 0.0 }, chiprace.chances(chips), DELTA);
  }

  //@Test
  public void case27() {
    int[] chips = { 4, 4, 4, 4, 4, 4, 4, 4 };
    assertArrayEquals(new double[] { 0.7500000000000001, 0.7500000000000001, 0.7500000000000001, 0.7500000000000001, 0.7500000000000001, 0.7500000000000001, 0.7500000000000001, 0.7500000000000001 }, chiprace.chances(chips), DELTA);
  }

  //@Test
  public void case28() {
    int[] chips = { 4, 4, 4, 4, 4, 4, 3, 3, 4, 4 };
    assertArrayEquals(new double[] { 0.819316754203792, 0.819316754203792, 0.819316754203792, 0.819316754203792, 0.819316754203792, 0.819316754203792, 0.7227329831848304, 0.7227329831848304, 0.819316754203792, 0.819316754203792 }, chiprace.chances(chips), DELTA);
  }

  //@Test
  public void case29() {
    int[] chips = { 4, 3, 2, 1, 0, 1, 2, 3, 4, 4 };
    assertArrayEquals(new double[] { 0.739294914116559, 0.6351605813309945, 0.4833672168306709, 0.272529830663496, 0.0, 0.272529830663496, 0.4833672168306709, 0.6351605813309945, 0.739294914116559, 0.739294914116559 }, chiprace.chances(chips), DELTA);
  }

  //@Test
  public void case30() {
    int[] chips = { 4, 3, 4, 2 };
    assertArrayEquals(new double[] { 0.8377067377067378, 0.7485181485181485, 0.8377067377067378, 0.576068376068376 }, chiprace.chances(chips), DELTA);
  }

}
