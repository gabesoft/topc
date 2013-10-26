package topc.test.graph;

import junit.framework.*;
import static org.junit.Assert.*;
import org.junit.Test;

import topc.graph.*;

public class PathFindingTest {
  PathFinding _calc = new PathFinding();

  @Test 
  public void case1() {
    String[] data = {
      "....",
      ".A..",
      "..B.",
      "...."};
    assertEquals(2, _calc.minTurns(data));
  }

  @Test 
  public void case2() {
    String[] data = {
      "XXXXXXXXX",
      "A.......B",
      "XXXXXXXXX"};
    assertEquals(-1, _calc.minTurns(data));
  }

  @Test 
  public void case3() {
    String[] data = {
      "XXXXXXXXX",
      "A...X...B",
      "XXXXXXXXX"};
    assertEquals(-1, _calc.minTurns(data));
  }

  @Test 
  public void case4() {
    String[] data = {
      "XXXXXXXXX",
      "A.......B",
      "XXXX.XXXX"};
    assertEquals(8, _calc.minTurns(data));
  }

  @Test 
  public void case5() {
    String[] data = {
      "...A.XXXXX.....",
      ".....XXXXX.....",
      "...............",
      ".....XXXXX.B...",
      ".....XXXXX....."};
    assertEquals(13, _calc.minTurns(data));
  }

  @Test 
  public void case6() {
    String[] data = {
      "AB.................X",
      "XXXXXXXXXXXXXXXXXXX.",
      "X..................X",
      ".XXXXXXXXXXXXXXXXXXX",
      "X..................X",
      "XXXXXXXXXXXXXXXXXXX.",
      "X..................X",
      ".XXXXXXXXXXXXXXXXXXX",
      "X..................X",
      "XXXXXXXXXXXXXXXXXXX.",
      "X..................X",
      ".XXXXXXXXXXXXXXXXXXX",
      "X..................X",
      "XXXXXXXXXXXXXXXXXXX.",
      "X..................X",
      ".XXXXXXXXXXXXXXXXXXX",
      "X..................X",
      "XXXXXXXXXXXXXXXXXXX.",
      "...................X",
      ".XXXXXXXXXXXXXXXXXXX"};
    assertEquals(379, _calc.minTurns(data));
  }
}
