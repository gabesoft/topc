package topc.test.easy;

import junit.framework.*;
import static org.junit.Assert.*;
import org.junit.Test;

import topc.easy.*;

public class MedalTableTest {
  MedalTable _calc = new MedalTable();

  @Test public void testCase1() {
    String[] data = {"ITA JPN AUS", "KOR TPE UKR", "KOR KOR GBR", "KOR CHN TPE"};
    String[] expected = { 
      "KOR 3 1 0",
      "ITA 1 0 0",
      "TPE 0 1 1",
      "CHN 0 1 0",
      "JPN 0 1 0",
      "AUS 0 0 1",
      "GBR 0 0 1",
      "UKR 0 0 1" 
    };
    assertArrayEquals(expected, _calc.generate(data));
  }

  @Test
  public void testCase2() {
    String[] data = {"USA AUT ROM"};
    String[] expected = { "USA 1 0 0",  "AUT 0 1 0",  "ROM 0 0 1" };
    assertArrayEquals(expected, _calc.generate(data));
  }

  @Test
  public void testCase3() {
    String[] data = {"GER AUT SUI", "AUT SUI GER", "SUI GER AUT"};
    String[] expected = { "AUT 1 1 1",  "GER 1 1 1",  "SUI 1 1 1" };
    assertArrayEquals(expected, _calc.generate(data));
  }
}
