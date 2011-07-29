package topc.test.dp;

import junit.framework.*;
import static org.junit.Assert.*;
import org.junit.Test;

import topc.dp.*;

public class JewelryTest {
  Jewelry _calc = new Jewelry();

  @Test 
  public void case1() {
    int[] data = {1,2,5,3,4,5};
    assertEquals(9, _calc.howMany(data));
  }

  @Test 
  public void case2() {
    int[] data = {1,2,5,3,5,4,5};
    assertEquals(23, _calc.howMany(data));
  }

  @Test 
  public void case3() {
    int[] data = {
      1000,1000,1000,1000,1000,
      1000,1000,1000,1000,1000,
      1000,1000,1000,1000,1000,
      1000,1000,1000,1000,1000,
      1000,1000,1000,1000,1000,
      1000,1000,1000,1000,1000};
    assertEquals(18252025766940L, _calc.howMany(data));
  }


  @Test 
  public void case4() {
    int[] data = {1,1,1,1,1};
    assertEquals(50, _calc.howMany(data));
  }

  @Test 
  public void case5() {
    int[] data = {1,2,3,4,5};
    assertEquals(4, _calc.howMany(data));
  }

  @Test 
  public void case6() {
    int[] data = {7,7,8,9,10,11,1,2,2,3,4,5,6};
    assertEquals(607, _calc.howMany(data));
  }

  @Test 
  public void case7() {
    int[] data = {123,217,661,678,796,964,54,111,417,526,917,923};
    assertEquals(0, _calc.howMany(data));
  }
}
