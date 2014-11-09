package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class KnightCircuitTest {
  KnightCircuit knightcircuit = new KnightCircuit();


  @Test
  public void case1() {
    assertEquals(136, knightcircuit.maxSize(32, 34, 6, 2));
  }

  @Test
  public void case2() {
    assertEquals(64, knightcircuit.maxSize(30, 30, 8, 4));
  }
}
