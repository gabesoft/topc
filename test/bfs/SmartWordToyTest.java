package topc.test.bfs;

import junit.framework.*;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

import topc.bfs.*;

public class SmartWordToyTest {
  SmartWordToy _calc = new SmartWordToy();

  @Test 
  public void testCase1() {
    String[] forbid = {"a a a z", "a a z a", "a z a a", "z a a a", "a z z z", "z a z z", "z z a z", "z z z a"};
    assertEquals(8, _calc.minPresses("aaaa", "zzzz", forbid));
  }

  @Test 
  public void testCase2() {
    String[] forbid = {};
    assertEquals(4, _calc.minPresses("aaaa", "bbbb", forbid));
  }

  @Test 
  public void testCase3() {
    String[] forbid = {};
    assertEquals(50, _calc.minPresses("aaaa", "mmnn", forbid));
  }

  @Test 
  public void testCase4() {
    String[] forbid = {"bz a a a", "a bz a a", "a a bz a", "a a a bz"};
    assertEquals(-1, _calc.minPresses("aaaa", "zzzz", forbid));
  }


  @Test 
  public void testCase5() {
    String[] forbid = 
    {"cdefghijklmnopqrstuvwxyz a a a", 
      "a cdefghijklmnopqrstuvwxyz a a", 
      "a a cdefghijklmnopqrstuvwxyz a", 
      "a a a cdefghijklmnopqrstuvwxyz"};
    assertEquals(6, _calc.minPresses("aaaa", "zzzz", forbid));
  }

  @Test 
  public void testCase6() {
    String[] forbid = 
    {"abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk",
      "abcdefghijkl abcdefghijkl abcdefghijkl abcdefghijk"};
    assertEquals(-1, _calc.minPresses("zzzz", "aaaa", forbid));
  }

  @Test 
  public void testShouldGetForbidden() {
    String[] forbid = { "lf a tc e", "bz a a a" };
    HashSet<String> set = _calc.getForbidden(forbid);
    assertEquals(6, set.size());
    assertTrue(set.contains("late"));
    assertTrue(set.contains("fate"));
    assertTrue(set.contains("lace"));
    assertTrue(set.contains("face"));
    assertTrue(set.contains("baaa"));
    assertTrue(set.contains("zaaa"));
  }
}
