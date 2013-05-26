package topc.test.graph;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.graph.*;

public class LoopyTest {
  Loopy loopy = new Loopy();

  @Test
  public void case1() {
    String[] code = { "RETURN", "IF 0 ELSE 1" };
    assertEquals(0, loopy.minLoop(code));
  }

  @Test
  public void case2() {
    String[] code = { "IF 1 ELSE 2", "IF 1 ELSE 2", "RETURN" };
    assertEquals(1, loopy.minLoop(code));
  }

  @Test
  public void case3() {
    String[] code = { "IF 1 ELSE 2", "RETURN", "IF 3 ELSE 2", "IF 2 ELSE 3" };
    assertEquals(0, loopy.minLoop(code));
  }

  @Test
  public void case4() {
    String[] code = { "IF 1 ELSE 2", "IF 3 ELSE 3", "IF 4 ELSE 1", "IF 4 ELSE 5", "RETURN", "IF 0 ELSE 6", "IF 6 ELSE 6", "IF 7 ELSE 2" };
    assertEquals(5, loopy.minLoop(code));
  }

  @Test
  public void case5() {
    String[] code = { "IF 1 ELSE 2", "IF 0 ELSE 2", "RETURN" };
    assertEquals(2, loopy.minLoop(code));
  }

  @Test
  public void case6() {
    String[] code = { "IF 1 ELSE 2", "IF 2 ELSE 8", "IF 3 ELSE 3", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "IF 9 ELSE 10", "IF 11 ELSE 11", "IF 9 ELSE 11", "IF 14 ELSE 12", "IF 13 ELSE 13", "IF 1 ELSE 1", "IF 0 ELSE 0" };
    assertEquals(7, loopy.minLoop(code));
  }

  @Test
  public void case7() {
    String[] code = { 
        "IF 1 ELSE 2", 
        "IF 2 ELSE 8", 
        "IF 14 ELSE 3", 
        "RETURN", 
        "RETURN", 
        "RETURN", 
        "IF 1 ELSE 1", 
        "RETURN", 
        "IF 9 ELSE 10", 
        "IF 11 ELSE 11", 
        "IF 9 ELSE 11", 
        "IF 14 ELSE 12", 
        "IF 13 ELSE 13", 
        "IF 1 ELSE 1", 
        "IF 0 ELSE 0" };
    assertEquals(7, loopy.minLoop(code));
  }

  @Test
  public void case8() {
    String[] code = { "IF 1 ELSE 2", "IF 2 ELSE 8", "IF 12 ELSE 3", "RETURN", "RETURN", "RETURN", "RETURN", "RETURN", "IF 9 ELSE 10", "IF 11 ELSE 11", "IF 9 ELSE 11", "IF 14 ELSE 12", "IF 13 ELSE 13", "IF 1 ELSE 1", "IF 0 ELSE 0" };
    assertEquals(10, loopy.minLoop(code));
  }

  @Test
  public void case9() {
    String[] code = { "IF 7 ELSE 6", "IF 2 ELSE 2", "IF 3 ELSE 6", "RETURN", "IF 5 ELSE 5", "IF 4 ELSE 3", "IF 2 ELSE 1", "IF 6 ELSE 8", "IF 10 ELSE 10", "RETURN", "IF 8 ELSE 8" };
    assertEquals(3, loopy.minLoop(code));
  }

  @Test
  public void case10() {
    String[] code = { "IF 7 ELSE 6", "IF 2 ELSE 2", "IF 3 ELSE 6", "RETURN", "IF 5 ELSE 5", "IF 4 ELSE 3", "IF 2 ELSE 1", "IF 6 ELSE 8", "IF 10 ELSE 10", "RETURN", "IF 1 ELSE 8" };
    assertEquals(2, loopy.minLoop(code));
  }

  @Test
  public void case11() {
    String[] code = { 
        "IF 7 ELSE 6", 
        "IF 10 ELSE 2", 
        "IF 3 ELSE 6", 
        "RETURN", 
        "IF 5 ELSE 5", 
        "IF 4 ELSE 3", 
        "IF 2 ELSE 1", 
        "IF 6 ELSE 8", 
        "IF 10 ELSE 10", 
        "RETURN", 
        "IF 1 ELSE 8" };
    assertEquals(0, loopy.minLoop(code));
  }

  @Test
  public void case12() {
    String[] code = { "IF 1 ELSE 2", "IF 1 ELSE 1", "IF 5 ELSE 3", "IF 2 ELSE 2", "IF 5 ELSE 2", "RETURN" };
    assertEquals(2, loopy.minLoop(code));
  }

  @Test
  public void case13() {
    String[] code = { "IF 1 ELSE 2", "IF 4 ELSE 1", "IF 5 ELSE 3", "IF 2 ELSE 2", "IF 5 ELSE 2", "RETURN" };
    assertEquals(1, loopy.minLoop(code));
  }

  @Test
  public void case14() {
    String[] code = { "IF 1 ELSE 1", "IF 2 ELSE 2", "IF 3 ELSE 48", "IF 4 ELSE 4", "IF 5 ELSE 5", "IF 6 ELSE 6", "IF 7 ELSE 7", "IF 8 ELSE 8", "IF 9 ELSE 9", "IF 10 ELSE 10", "IF 11 ELSE 11", "IF 12 ELSE 12", "IF 13 ELSE 13", "IF 14 ELSE 14", "IF 15 ELSE 15", "IF 16 ELSE 16", "IF 17 ELSE 17", "IF 18 ELSE 18", "IF 19 ELSE 19", "IF 20 ELSE 20", "IF 21 ELSE 21", "IF 22 ELSE 22", "IF 23 ELSE 23", "IF 24 ELSE 24", "IF 25 ELSE 25", "IF 26 ELSE 26", "IF 27 ELSE 27", "IF 28 ELSE 28", "IF 29 ELSE 29", "IF 30 ELSE 30", "IF 31 ELSE 31", "IF 32 ELSE 32", "IF 33 ELSE 33", "IF 34 ELSE 34", "IF 35 ELSE 35", "IF 36 ELSE 36", "IF 37 ELSE 37", "IF 38 ELSE 38", "IF 39 ELSE 39", "IF 40 ELSE 49", "IF 41 ELSE 41", "IF 42 ELSE 42", "IF 43 ELSE 43", "IF 44 ELSE 44", "IF 45 ELSE 45", "IF 46 ELSE 46", "IF 47 ELSE 47", "IF 0 ELSE 0", "IF 35 ELSE 35", "RETURN" };
    assertEquals(49, loopy.minLoop(code));
  }

  @Test
  public void case15() {
    String[] code = { "IF 1 ELSE 1", "IF 2 ELSE 2", "IF 3 ELSE 48", "IF 4 ELSE 4", "IF 5 ELSE 5", "IF 6 ELSE 6", "IF 7 ELSE 7", "IF 8 ELSE 8", "IF 9 ELSE 9", "IF 10 ELSE 10", "IF 11 ELSE 11", "IF 12 ELSE 12", "IF 13 ELSE 13", "IF 14 ELSE 14", "IF 15 ELSE 15", "IF 16 ELSE 16", "IF 17 ELSE 17", "IF 18 ELSE 18", "IF 19 ELSE 19", "IF 20 ELSE 20", "IF 21 ELSE 21", "IF 22 ELSE 22", "IF 23 ELSE 23", "IF 24 ELSE 24", "IF 25 ELSE 25", "IF 26 ELSE 26", "IF 27 ELSE 27", "IF 28 ELSE 28", "IF 29 ELSE 29", "IF 30 ELSE 30", "IF 31 ELSE 31", "IF 32 ELSE 32", "IF 33 ELSE 33", "IF 34 ELSE 34", "IF 35 ELSE 35", "IF 36 ELSE 36", "IF 37 ELSE 37", "IF 38 ELSE 38", "IF 39 ELSE 39", "IF 40 ELSE 49", "IF 41 ELSE 41", "IF 42 ELSE 42", "IF 43 ELSE 43", "IF 44 ELSE 44", "IF 45 ELSE 45", "IF 46 ELSE 46", "IF 47 ELSE 47", "IF 1 ELSE 0", "IF 35 ELSE 35", "RETURN" };
    assertEquals(48, loopy.minLoop(code));
  }

  @Test
  public void case16() {
    String[] code = { "IF 8 ELSE 6", "IF 2 ELSE 2", "IF 3 ELSE 48", "IF 4 ELSE 4", "IF 5 ELSE 5", "IF 6 ELSE 6", "IF 7 ELSE 7", "IF 8 ELSE 8", "IF 9 ELSE 9", "IF 10 ELSE 10", "IF 11 ELSE 11", "IF 12 ELSE 12", "IF 13 ELSE 13", "IF 14 ELSE 14", "IF 15 ELSE 15", "IF 16 ELSE 16", "IF 17 ELSE 17", "IF 18 ELSE 18", "IF 19 ELSE 19", "IF 20 ELSE 20", "IF 21 ELSE 21", "IF 22 ELSE 22", "IF 23 ELSE 23", "IF 24 ELSE 24", "IF 25 ELSE 25", "IF 26 ELSE 26", "IF 27 ELSE 27", "IF 28 ELSE 28", "IF 29 ELSE 29", "IF 30 ELSE 30", "IF 31 ELSE 31", "IF 32 ELSE 32", "IF 33 ELSE 33", "IF 34 ELSE 34", "IF 35 ELSE 35", "IF 36 ELSE 36", "IF 37 ELSE 37", "IF 38 ELSE 38", "IF 39 ELSE 39", "IF 40 ELSE 49", "IF 41 ELSE 41", "IF 42 ELSE 42", "IF 43 ELSE 43", "IF 44 ELSE 44", "IF 45 ELSE 45", "IF 46 ELSE 46", "IF 47 ELSE 47", "IF 1 ELSE 0", "IF 35 ELSE 35", "RETURN" };
    assertEquals(16, loopy.minLoop(code));
  }

  @Test
  public void case17() {
    String[] code = { "IF 48 ELSE 48", "IF 49 ELSE 2", "IF 1 ELSE 1", "IF 2 ELSE 2", "IF 3 ELSE 3", "IF 4 ELSE 4", "IF 5 ELSE 5", "IF 6 ELSE 6", "IF 7 ELSE 7", "IF 8 ELSE 8", "IF 9 ELSE 9", "IF 10 ELSE 10", "IF 11 ELSE 11", "IF 12 ELSE 12", "IF 13 ELSE 13", "IF 14 ELSE 14", "IF 15 ELSE 15", "IF 16 ELSE 16", "IF 17 ELSE 17", "IF 18 ELSE 18", "IF 19 ELSE 19", "IF 20 ELSE 20", "IF 21 ELSE 21", "IF 22 ELSE 22", "IF 23 ELSE 23", "IF 24 ELSE 24", "IF 25 ELSE 25", "IF 26 ELSE 26", "IF 27 ELSE 27", "IF 28 ELSE 28", "IF 29 ELSE 29", "IF 30 ELSE 30", "IF 31 ELSE 31", "IF 32 ELSE 32", "IF 33 ELSE 33", "IF 34 ELSE 34", "IF 35 ELSE 35", "IF 36 ELSE 36", "IF 37 ELSE 37", "IF 38 ELSE 38", "IF 39 ELSE 39", "IF 40 ELSE 40", "IF 41 ELSE 41", "IF 42 ELSE 42", "IF 43 ELSE 43", "IF 44 ELSE 44", "IF 45 ELSE 45", "IF 46 ELSE 46", "IF 47 ELSE 47", "RETURN" };
    assertEquals(2, loopy.minLoop(code));
  }

  @Test
  public void case18() {
    String[] code = { "IF 48 ELSE 48", "IF 49 ELSE 47", "IF 1 ELSE 1", "IF 2 ELSE 2", "IF 3 ELSE 3", "IF 4 ELSE 4", "IF 5 ELSE 5", "IF 6 ELSE 6", "IF 7 ELSE 7", "IF 8 ELSE 8", "IF 9 ELSE 9", "IF 10 ELSE 10", "IF 11 ELSE 11", "IF 12 ELSE 12", "IF 13 ELSE 13", "IF 14 ELSE 14", "IF 15 ELSE 15", "IF 16 ELSE 16", "IF 17 ELSE 17", "IF 18 ELSE 18", "IF 19 ELSE 19", "IF 20 ELSE 20", "IF 21 ELSE 21", "IF 22 ELSE 22", "IF 23 ELSE 23", "IF 24 ELSE 24", "IF 25 ELSE 25", "IF 26 ELSE 26", "IF 27 ELSE 27", "IF 28 ELSE 28", "IF 29 ELSE 29", "IF 30 ELSE 30", "IF 31 ELSE 31", "IF 32 ELSE 32", "IF 33 ELSE 33", "IF 34 ELSE 34", "IF 35 ELSE 35", "IF 36 ELSE 36", "IF 37 ELSE 37", "IF 38 ELSE 38", "IF 39 ELSE 39", "IF 40 ELSE 40", "IF 41 ELSE 41", "IF 42 ELSE 42", "IF 43 ELSE 43", "IF 44 ELSE 44", "IF 45 ELSE 45", "IF 46 ELSE 46", "IF 47 ELSE 47", "RETURN" };
    assertEquals(47, loopy.minLoop(code));
  }

}
