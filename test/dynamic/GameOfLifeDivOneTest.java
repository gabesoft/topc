package topc.test.dynamic;

import junit.framework.*;
import static org.junit.Assert.*;
import org.junit.Test;

import topc.dynamic.*;

public class GameOfLifeDivOneTest {
  GameOfLifeDivOne _calc = new GameOfLifeDivOne();

  @Test 
  public void case1() {
    assertEquals(1, _calc.theCount("0?1", 1, 1));
  }

  @Test 
  public void case2() {
    assertEquals(511, _calc.theCount("?????????", 0, 1));
  }

  @Test 
  public void case3() {
    assertEquals(151, _calc.theCount("??0???????", 58, 6));
  }

  @Test 
  public void case4() {
    assertEquals(453, _calc.theCount("?????????1", 47, 3));
  }

  @Test 
  public void case5() {
    assertEquals(31577324313L, _calc.theCount("?????????1???0???1??1??????0??????0??0????1???????", 12, 40));
  }
}
