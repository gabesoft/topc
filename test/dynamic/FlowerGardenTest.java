package topc.test.dynamic;

import junit.framework.*;
import static org.junit.Assert.*;
import org.junit.Test;

import topc.dynamic.*;

public class FlowerGardenTest {
  FlowerGarden _calc = new FlowerGarden();

  @Test 
  public void case1() {
    int[] h = {5,4,3,2,1};
    int[] b = {1,1,1,1,1};
    int[] w = {365,365,365,365,365};
    assertArrayEquals(new int[] { 1,  2,  3,  4,  5 }, _calc.getOrdering(h, b, w));
  }

  @Test 
  public void case2() {
    int[] h = {5,4,3,2,1};
    int[] b = {1,5,10,15,20};
    int[] w = {4,9,14,19,24};
    assertArrayEquals(new int[] { 5,  4,  3,  2,  1 }, _calc.getOrdering(h, b, w));
  }

  @Test 
  public void case3() {
    int[] h = {5,4,3,2,1};
    int[] b = {1,5,10,15,20};
    int[] w = {5,10,15,20,25};
    assertArrayEquals(new int[] { 1,  2,  3,  4,  5 }, _calc.getOrdering(h, b, w));
  }

  @Test 
  public void case4() {
    int[] h = {5,4,3,2,1};
    int[] b = {1,5,10,15,20};
    int[] w = {5,10,14,20,25};
    assertArrayEquals(new int[] { 3,  4,  5,  1,  2 }, _calc.getOrdering(h, b, w));
  }

  @Test 
  public void case5() {
    int[] h = {1,2,3,4,5,6};
    int[] b = {1,3,1,3,1,3};
    int[] w = {2,4,2,4,2,4};
    assertArrayEquals(new int[] { 2,  4,  6,  1,  3,  5 }, _calc.getOrdering(h, b, w));
  }

  @Test 
  public void case6() {
    int[] h = {3,2,5,4};
    int[] b = {1,2,11,10};
    int[] w = {4,3,12,13};
    assertArrayEquals(new int[] { 4,  5,  2,  3 }, _calc.getOrdering(h, b, w));
  }
}
