package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class BunnyConverterTest {
  BunnyConverter bunnyconverter = new BunnyConverter();

  @Test 
  public void case1() {
      assertEquals(1, bunnyconverter.getMinimum(5, 1, 5, 3));
  }

  @Test 
  public void case2() {
      assertEquals(2, bunnyconverter.getMinimum(5, 1, 5, 1));
  }

  @Test 
  public void case3() {
      assertEquals(249988, bunnyconverter.getMinimum(499979, 499979, 499976, 3));
  }
}
