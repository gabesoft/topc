package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class PolygonColorsTest {
  PolygonColors polygoncolors = new PolygonColors();

  @Test 
  public void case1() {
      int N = 16;
      int colors[] = new int[] {0,1,2,6,4,5,6,7,1,9,10,11,12,13,14,10};
      assertEquals(96791474, polygoncolors.getWays(N, colors));
  }
}
