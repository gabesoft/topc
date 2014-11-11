package topc.test.geometry;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.geometry.*;

public class MinimalTriangleTest {
  double DELTA = 1.0e-09;
  MinimalTriangle minimaltriangle = new MinimalTriangle();

  @Test
  public void case1() {
    int length = 5;
    assertEquals(10.825317547305485, minimaltriangle.maximalArea(length), DELTA * 10.825317547305485);
  }

  @Test
  public void case2() {
    int length = 10;
    assertEquals(43.30127018922194, minimaltriangle.maximalArea(length), DELTA * 43.30127018922194);
  }

  @Test
  public void case3() {
    int length = 100000;
    assertEquals(4330127018.922194, minimaltriangle.maximalArea(length), DELTA * 4330127018.922194);
  }

  @Test
  public void case4() {
    int length = 100;
    assertEquals(4330.127018922194, minimaltriangle.maximalArea(length), DELTA * 4330.127018922194);
  }

  @Test
  public void case5() {
    int length = 1000;
    assertEquals(433012.70189221937, minimaltriangle.maximalArea(length), DELTA * 433012.70189221937);
  }

  @Test
  public void case6() {
    int length = 1;
    assertEquals(0.43301270189221935, minimaltriangle.maximalArea(length), DELTA * 0.43301270189221935);
  }

  @Test
  public void case7() {
    int length = 2;
    assertEquals(1.7320508075688774, minimaltriangle.maximalArea(length), DELTA * 1.7320508075688774);
  }

  @Test
  public void case8() {
    int length = 3;
    assertEquals(3.897114317029974, minimaltriangle.maximalArea(length), DELTA * 3.897114317029974);
  }

  @Test
  public void case9() {
    int length = 1000000;
    assertEquals(433012701892.21936, minimaltriangle.maximalArea(length), DELTA * 433012701892.21936);
  }

  @Test
  public void case10() {
    int length = 999999;
    assertEquals(433011835867.2486, minimaltriangle.maximalArea(length), DELTA * 433011835867.2486);
  }

  @Test
  public void case11() {
    int length = 3242;
    assertEquals(4551207.716051092, minimaltriangle.maximalArea(length), DELTA * 4551207.716051092);
  }

  @Test
  public void case12() {
    int length = 1233;
    assertEquals(658304.4475470202, minimaltriangle.maximalArea(length), DELTA * 658304.4475470202);
  }

  @Test
  public void case13() {
    int length = 8768;
    assertEquals(33289074.285834506, minimaltriangle.maximalArea(length), DELTA * 33289074.285834506);
  }

  @Test
  public void case14() {
    int length = 3457;
    assertEquals(5174869.415395928, minimaltriangle.maximalArea(length), DELTA * 5174869.415395928);
  }

  @Test
  public void case15() {
    int length = 234234;
    assertEquals(23757487301.863487, minimaltriangle.maximalArea(length), DELTA * 23757487301.863487);
  }

  @Test
  public void case16() {
    int length = 34555;
    assertEquals(517037961.49431825, minimaltriangle.maximalArea(length), DELTA * 517037961.49431825);
  }

  @Test
  public void case17() {
    int length = 741;
    assertEquals(237759.04736768172, minimaltriangle.maximalArea(length), DELTA * 237759.04736768172);
  }

  @Test
  public void case18() {
    int length = 98283;
    assertEquals(4182707017.075714, minimaltriangle.maximalArea(length), DELTA * 4182707017.075714);
  }

  @Test
  public void case19() {
    int length = 97708;
    assertEquals(4133908726.413193, minimaltriangle.maximalArea(length), DELTA * 4133908726.413193);
  }

  @Test
  public void case20() {
    int length = 772;
    assertEquals(258068.64212453246, minimaltriangle.maximalArea(length), DELTA * 258068.64212453246);
  }

  @Test
  public void case21() {
    int length = 97431;
    assertEquals(4110502873.0324244, minimaltriangle.maximalArea(length), DELTA * 4110502873.0324244);
  }

  @Test
  public void case22() {
    int length = 92415;
    assertEquals(3698158934.3448176, minimaltriangle.maximalArea(length), DELTA * 3698158934.3448176);
  }

  @Test
  public void case23() {
    int length = 987;
    assertEquals(421827.55078964145, minimaltriangle.maximalArea(length), DELTA * 421827.55078964145);
  }

  @Test
  public void case24() {
    int length = 98228;
    assertEquals(4178026970.3273296, minimaltriangle.maximalArea(length), DELTA * 4178026970.3273296);
  }

  @Test
  public void case25() {
    int length = 96988;
    assertEquals(4073208520.887716, minimaltriangle.maximalArea(length), DELTA * 4073208520.887716);
  }

  @Test
  public void case26() {
    int length = 890;
    assertEquals(342989.361168827, minimaltriangle.maximalArea(length), DELTA * 342989.361168827);
  }

  @Test
  public void case27() {
    int length = 92714;
    assertEquals(3722127733.6829104, minimaltriangle.maximalArea(length), DELTA * 3722127733.6829104);
  }

  @Test
  public void case28() {
    int length = 96949;
    assertEquals(4069933410.6974077, minimaltriangle.maximalArea(length), DELTA * 4069933410.6974077);
  }

  @Test
  public void case29() {
    int length = 884;
    assertEquals(338380.37396988616, minimaltriangle.maximalArea(length), DELTA * 338380.37396988616);
  }

  @Test
  public void case30() {
    int length = 99111;
    assertEquals(4253479579.557329, minimaltriangle.maximalArea(length), DELTA * 4253479579.557329);
  }

  @Test
  public void case31() {
    int length = 94672;
    assertEquals(3881000868.2338767, minimaltriangle.maximalArea(length), DELTA * 3881000868.2338767);
  }

  @Test
  public void case32() {
    int length = 741;
    assertEquals(237759.04736768172, minimaltriangle.maximalArea(length), DELTA * 237759.04736768172);
  }

  @Test
  public void case33() {
    int length = 98835;
    assertEquals(4229822755.0456324, minimaltriangle.maximalArea(length), DELTA * 4229822755.0456324);
  }

  @Test
  public void case34() {
    int length = 90385;
    assertEquals(3537474848.8758454, minimaltriangle.maximalArea(length), DELTA * 3537474848.8758454);
  }

  @Test
  public void case35() {
    int length = 729;
    assertEquals(230120.70330630295, minimaltriangle.maximalArea(length), DELTA * 230120.70330630295);
  }

  @Test
  public void case36() {
    int length = 4;
    assertEquals(6.92820323027551, minimaltriangle.maximalArea(length), DELTA * 6.92820323027551);
  }

}
