package topc.test.recursion;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.recursion.*;

public class DeadCodeTest {
  DeadCode deadcode = new DeadCode();

  @Test
  public void case1() {
    String[] code = { "RETURN", "IF 0 ELSE 1" };
    assertEquals(1, deadcode.deadCount(code));
  }

  @Test
  public void case2() {
    String[] code = { "IF 1 ELSE 2", "IF 1 ELSE 2", "RETURN" };
    assertEquals(0, deadcode.deadCount(code));
  }

  @Test
  public void case3() {
    String[] code = { "IF 1 ELSE 2", "RETURN", "IF 3 ELSE 2", "IF 2 ELSE 3" };
    assertEquals(2, deadcode.deadCount(code));
  }

  @Test
  public void case4() {
    String[] code = { "IF 1 ELSE 2", "IF 1 ELSE 1", "RETURN", "IF 3 ELSE 4", "IF 0 ELSE 1" };
    assertEquals(3, deadcode.deadCount(code));
  }

  @Test
  public void case5() {
    String[] code = { "IF 1 ELSE 2", "IF 1 ELSE 1", "RETURN", "IF 3 ELSE 4", "IF 0 ELSE 1", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN" };
    assertEquals(46, deadcode.deadCount(code));
  }

  @Test
  public void case6() {
    String[] code = { "IF 1 ELSE 2", "RETURN", "IF 5 ELSE 5", "IF 2 ELSE 1", "IF 2 ELSE 2", "IF 4 ELSE 4" };
    assertEquals(4, deadcode.deadCount(code));
  }

  @Test
  public void case7() {
    String[] code = { "IF 1 ELSE 1", "IF 2 ELSE 2", "IF 3 ELSE 48", "IF 4 ELSE 4", "IF 5 ELSE 5", "IF 6 ELSE 6", "IF 7 ELSE 7", "IF 8 ELSE 8", "IF 9 ELSE 9", "IF 10 ELSE 10", "IF 11 ELSE 11", "IF 12 ELSE 12", "IF 13 ELSE 13", "IF 14 ELSE 14", "IF 15 ELSE 15", "IF 16 ELSE 16", "IF 17 ELSE 17", "IF 18 ELSE 18", "IF 19 ELSE 19", "IF 20 ELSE 20", "IF 21 ELSE 21", "IF 22 ELSE 22", "IF 23 ELSE 23", "IF 24 ELSE 24", "IF 25 ELSE 25", "IF 26 ELSE 26", "IF 27 ELSE 27", "IF 28 ELSE 28", "IF 29 ELSE 29", "IF 30 ELSE 30", "IF 31 ELSE 31", "IF 32 ELSE 32", "IF 33 ELSE 33", "IF 34 ELSE 34", "IF 35 ELSE 35", "IF 36 ELSE 36", "IF 37 ELSE 37", "IF 38 ELSE 38", "IF 39 ELSE 39", "IF 40 ELSE 49", "IF 41 ELSE 41", "IF 42 ELSE 42", "IF 43 ELSE 43", "IF 44 ELSE 44", "IF 45 ELSE 45", "IF 46 ELSE 46", "IF 47 ELSE 47", "IF 0 ELSE 0", "IF 35 ELSE 35", "RETURN" };
    assertEquals(0, deadcode.deadCount(code));
  }

  @Test
  public void case8() {
    String[] code = { "IF 1 ELSE 1", "IF 2 ELSE 2", "IF 3 ELSE 48", "IF 4 ELSE 4", "IF 5 ELSE 5", "IF 6 ELSE 6", "IF 7 ELSE 7", "IF 8 ELSE 8", "IF 9 ELSE 9", "IF 10 ELSE 10", "IF 11 ELSE 11", "IF 12 ELSE 12", "IF 13 ELSE 13", "IF 14 ELSE 14", "IF 15 ELSE 15", "IF 16 ELSE 16", "IF 17 ELSE 17", "IF 18 ELSE 18", "IF 19 ELSE 19", "IF 20 ELSE 20", "IF 21 ELSE 21", "IF 22 ELSE 22", "IF 23 ELSE 23", "IF 24 ELSE 24", "IF 25 ELSE 25", "IF 26 ELSE 26", "IF 27 ELSE 27", "IF 28 ELSE 28", "IF 29 ELSE 29", "IF 30 ELSE 30", "IF 31 ELSE 31", "IF 32 ELSE 32", "IF 33 ELSE 33", "IF 34 ELSE 34", "IF 35 ELSE 35", "IF 36 ELSE 36", "IF 37 ELSE 37", "IF 38 ELSE 38", "IF 39 ELSE 39", "IF 40 ELSE 49", "IF 41 ELSE 41", "IF 42 ELSE 42", "IF 43 ELSE 43", "IF 44 ELSE 44", "IF 45 ELSE 45", "IF 46 ELSE 46", "IF 47 ELSE 47", "IF 45 ELSE 46", "IF 35 ELSE 35", "RETURN" };
    assertEquals(8, deadcode.deadCount(code));
  }

  @Test
  public void case9() {
    String[] code = { "IF 1 ELSE 4", "RETURN", "IF 5 ELSE 5", "IF 2 ELSE 1", "IF 2 ELSE 2", "IF 4 ELSE 4" };
    assertEquals(4, deadcode.deadCount(code));
  }

  @Test
  public void case10() {
    String[] code = { "IF 2 ELSE 4", "RETURN", "IF 5 ELSE 5", "IF 2 ELSE 1", "IF 2 ELSE 2", "IF 4 ELSE 4" };
    assertEquals(6, deadcode.deadCount(code));
  }

  @Test
  public void case11() {
    String[] code = { "IF 2 ELSE 3", "RETURN", "IF 5 ELSE 5", "IF 2 ELSE 1", "IF 2 ELSE 2", "IF 4 ELSE 4" };
    assertEquals(3, deadcode.deadCount(code));
  }

  @Test
  public void case12() {
    String[] code = { 
        "IF 3 ELSE 5", 
        "IF 1 ELSE 1", 
        "RETURN", 
        "IF 4 ELSE 1", 
        "IF 3 ELSE 0", 
        "IF 1 ELSE 6", 
        "IF 2 ELSE 4" };
    assertEquals(1, deadcode.deadCount(code));
  }

  @Test
  public void case13() {
    String[] code = { "RETURN" };
    assertEquals(0, deadcode.deadCount(code));
  }

  @Test
  public void case14() {
    String[] code = { "IF 0 ELSE 0" };
    assertEquals(1, deadcode.deadCount(code));
  }

  @Test
  public void case15() {
    String[] code = { "IF 1 ELSE 2", "RETURN", "RETURN" };
    assertEquals(0, deadcode.deadCount(code));
  }

  @Test
  public void case16() {
    String[] code = { "IF 5 ELSE 5", "IF 6 ELSE 6", "IF 1 ELSE 1", "IF 2 ELSE 2", "IF 3 ELSE 3", "IF 4 ELSE 4", "RETURN" };
    assertEquals(0, deadcode.deadCount(code));
  }

  @Test
  public void case17() {
    String[] code = { "IF 48 ELSE 48", "IF 49 ELSE 2", "IF 1 ELSE 1", "IF 2 ELSE 2", "IF 3 ELSE 3", "IF 4 ELSE 4", "IF 5 ELSE 5", "IF 6 ELSE 6", "IF 7 ELSE 7", "IF 8 ELSE 8", "IF 9 ELSE 9", "IF 10 ELSE 10", "IF 11 ELSE 11", "IF 12 ELSE 12", "IF 13 ELSE 13", "IF 14 ELSE 14", "IF 15 ELSE 15", "IF 16 ELSE 16", "IF 17 ELSE 17", "IF 18 ELSE 18", "IF 19 ELSE 19", "IF 20 ELSE 20", "IF 21 ELSE 21", "IF 22 ELSE 22", "IF 23 ELSE 23", "IF 24 ELSE 24", "IF 25 ELSE 25", "IF 26 ELSE 26", "IF 27 ELSE 27", "IF 28 ELSE 28", "IF 29 ELSE 29", "IF 30 ELSE 30", "IF 31 ELSE 31", "IF 32 ELSE 32", "IF 33 ELSE 33", "IF 34 ELSE 34", "IF 35 ELSE 35", "IF 36 ELSE 36", "IF 37 ELSE 37", "IF 38 ELSE 38", "IF 39 ELSE 39", "IF 40 ELSE 40", "IF 41 ELSE 41", "IF 42 ELSE 42", "IF 43 ELSE 43", "IF 44 ELSE 44", "IF 45 ELSE 45", "IF 46 ELSE 46", "IF 47 ELSE 47", "RETURN" };
    assertEquals(0, deadcode.deadCount(code));
  }

  @Test
  public void case18() {
    String[] code = { "IF 48 ELSE 48", "IF 49 ELSE 47", "IF 1 ELSE 1", "IF 2 ELSE 2", "IF 3 ELSE 3", "IF 4 ELSE 4", "IF 5 ELSE 5", "IF 6 ELSE 6", "IF 7 ELSE 7", "IF 8 ELSE 8", "IF 9 ELSE 9", "IF 10 ELSE 10", "IF 11 ELSE 11", "IF 12 ELSE 12", "IF 13 ELSE 13", "IF 14 ELSE 14", "IF 15 ELSE 15", "IF 16 ELSE 16", "IF 17 ELSE 17", "IF 18 ELSE 18", "IF 19 ELSE 19", "IF 20 ELSE 20", "IF 21 ELSE 21", "IF 22 ELSE 22", "IF 23 ELSE 23", "IF 24 ELSE 24", "IF 25 ELSE 25", "IF 26 ELSE 26", "IF 27 ELSE 27", "IF 28 ELSE 28", "IF 29 ELSE 29", "IF 30 ELSE 30", "IF 31 ELSE 31", "IF 32 ELSE 32", "IF 33 ELSE 33", "IF 34 ELSE 34", "IF 35 ELSE 35", "IF 36 ELSE 36", "IF 37 ELSE 37", "IF 38 ELSE 38", "IF 39 ELSE 39", "IF 40 ELSE 40", "IF 41 ELSE 41", "IF 42 ELSE 42", "IF 43 ELSE 43", "IF 44 ELSE 44", "IF 45 ELSE 45", "IF 46 ELSE 46", "IF 47 ELSE 47", "RETURN" };
    assertEquals(0, deadcode.deadCount(code));
  }

  @Test
  public void case19() {
    String[] code = { "IF 1 ELSE 2", "RETURN", "IF 3 ELSE 2", "IF 2 ELSE 3" };
    assertEquals(2, deadcode.deadCount(code));
  }

  @Test
  public void case20() {
    String[] code = { "IF 2 ELSE 2", "IF 0 ELSE 0", "RETURN" };
    assertEquals(1, deadcode.deadCount(code));
  }

  @Test
  public void case21() {
    String[] code = { "IF 1 ELSE 2", "RETURN", "IF 3 ELSE 2", "IF 2 ELSE 3", "RETURN", "RETURN", "IF 5 ELSE 8", "IF 8 ELSE 5", "RETURN" };
    assertEquals(7, deadcode.deadCount(code));
  }

  @Test
  public void case22() {
    String[] code = { "IF 1 ELSE 2", "RETURN", "IF 3 ELSE 2", "IF 2 ELSE 3", "RETURN", "IF 2 ELSE 3" };
    assertEquals(4, deadcode.deadCount(code));
  }

  @Test
  public void case23() {
    String[] code = { "IF 0 ELSE 2", "RETURN", "IF 0 ELSE 2" };
    assertEquals(3, deadcode.deadCount(code));
  }

  @Test
  public void case24() {
    String[] code = { "IF 1 ELSE 4", "IF 1 ELSE 2", "RETURN", "IF 4 ELSE 2", "IF 3 ELSE 2" };
    assertEquals(0, deadcode.deadCount(code));
  }

  @Test
  public void case25() {
    String[] code = { "IF 1 ELSE 2", "RETURN", "IF 1 ELSE 2" };
    assertEquals(0, deadcode.deadCount(code));
  }

  @Test
  public void case26() {
    String[] code = { "IF 2 ELSE 1", "RETURN", "IF 3 ELSE 1", "RETURN" };
    assertEquals(0, deadcode.deadCount(code));
  }

  @Test
  public void case27() {
    String[] code = { "IF 0 ELSE 0", "RETURN" };
    assertEquals(2, deadcode.deadCount(code));
  }

  @Test
  public void case28() {
    String[] code = { "IF 1 ELSE 2", "IF 2 ELSE 3", "RETURN", "IF 3 ELSE 2" };
    assertEquals(0, deadcode.deadCount(code));
  }

  @Test
  public void case29() {
    String[] code = { "RETURN", "RETURN", "RETURN", "RETURN", "RETURN" };
    assertEquals(4, deadcode.deadCount(code));
  }

  @Test
  public void case30() {
    String[] code = { "IF 1 ELSE 1", "IF 0 ELSE 0", "RETURN", "RETURN" };
    assertEquals(4, deadcode.deadCount(code));
  }

  @Test
  public void case31() {
    String[] code = { "IF 1 ELSE 2", "IF 2 ELSE 3", "IF 3 ELSE 4", "IF 4 ELSE 5", "IF 5 ELSE 6", "IF 6 ELSE 7", "IF 7 ELSE 8", "IF 8 ELSE 9", "IF 9 ELSE 10", "IF 10 ELSE 11", "IF 11 ELSE 12", "IF 12 ELSE 13", "IF 13 ELSE 14", "IF 14 ELSE 15", "IF 15 ELSE 16", "IF 16 ELSE 17", "IF 17 ELSE 18", "IF 18 ELSE 19", "IF 19 ELSE 20", "IF 20 ELSE 21", "IF 21 ELSE 22", "IF 22 ELSE 23", "IF 23 ELSE 24", "IF 24 ELSE 25", "IF 25 ELSE 26", "IF 26 ELSE 27", "IF 27 ELSE 28", "IF 28 ELSE 29", "IF 29 ELSE 30", "IF 30 ELSE 31", "IF 31 ELSE 33", "IF 33 ELSE 34", "RETURN", "IF 34 ELSE 35", "IF 35 ELSE 36", "IF 36 ELSE 37", "IF 37 ELSE 0", "RETURN", "RETURN" };
    assertEquals(2, deadcode.deadCount(code));
  }

  @Test
  public void case32() {
    String[] code = { "IF 2 ELSE 1", "IF 2 ELSE 3", "RETURN", "RETURN" };
    assertEquals(0, deadcode.deadCount(code));
  }

}
