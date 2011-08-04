package topc.test.dp;

import junit.framework.*;
import static org.junit.Assert.*;
import org.junit.Test;

import topc.dp.*;

public class WeightedIntervalSchedulingTest {
  WeightedIntervalScheduling _calc = new WeightedIntervalScheduling();

  @Test 
  public void case0() {
    String[] data = { "0:4:2" };
    assertEquals(2, _calc.maxWeight(data));
  }

  @Test 
  public void case1() {
    String[] data = { "0:4:2", "1:7:4", "5:9:4", "2:12:7", "10:13:2", "11:14:1" };
    assertEquals(8, _calc.maxWeight(data));
  }

  @Test 
  public void case2() {
    String[] data = { "1:4:1", "3:5:2", "0:6:3", "4:7:4", "3:8:5", "5:9:6", "6:10:7", "8:11:8" };
    assertEquals(12, _calc.maxWeight(data));
  }
}
