package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class FoxAndSortingTest {
  FoxAndSorting foxandsorting = new FoxAndSorting();

  @Test 
  public void Test1() {
      long actual = foxandsorting.get(58);
      assertEquals(100000000100L, actual);
  }

  @Test 
  public void Test2() {
      long actual = foxandsorting.get(314159265358979L);
      assertEquals(646003042230121105L, actual);
  }
}
