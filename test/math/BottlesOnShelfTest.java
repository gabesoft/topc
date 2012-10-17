package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class BottlesOnShelfTest {
  BottlesOnShelf bottlesonshelf = new BottlesOnShelf();

  @Test 
  public void case1() {
      int N        = 7;
      int left[]   = { 1, 1, 1 };
      int right[]  = { 7, 7, 7, };
      int damage[] = { 2, 3, 6 };
      assertEquals(4, bottlesonshelf.getNumBroken(N, left, right, damage));
  }

  @Test 
  public void case2() {
      int N        = 10;
      int left[]   = { 1, 6 };
      int right[]  = { 5, 10, };
      int damage[] = { 1, 7 };
      assertEquals(6, bottlesonshelf.getNumBroken(N, left, right, damage));
  }
}
