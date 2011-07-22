package topc.test.bfs;

import junit.framework.*;
import static org.junit.Assert.*;
import org.junit.Test;

import topc.bfs.*;

public class RevolvingDoorsTest {
  RevolvingDoors _calc = new RevolvingDoors();

  @Test 
  public void testCase1() {
    String[] data = 
    { "    ### ",
      "    #E# ",
      "   ## # ",
      "####  ##",
      "# S -O-#",
      "# ###  #",
      "#      #",
      "########" };
    assertEquals(2, _calc.turns(data));
  }

  @Test 
  public void testCase2() {
    String[] data = 
    { "#### ",
      "#S|##",
      "# O #",
      "##|E#",
      " ####" };
    assertEquals(-1, _calc.turns(data));
  }

  @Test 
  public void testCase3() {
    String[] data = 
    { " |  |  |     |  |  |  |  |  | ",
      " O  O EO -O- O  O  O  O  OS O ",
      " |  |  |     |  |  |  |  |  | " };
    assertEquals(7, _calc.turns(data));
  }

  @Test 
  public void testCase4() {
    String[] data =
    { "###########",
      "#    #    #",
      "#  S | E  #",
      "#    O    #",
      "#    |    #",
      "#         #",
      "###########" };
    assertEquals(0, _calc.turns(data));
  }

  @Test 
  public void testCase5() {
    String[] data =
    { "        E",
      "    |    ",
      "    O    ",
      "    |    ",
      " -O-S-O- ",
      "    |    ",
      "    O    ",
      "    |    ",
      "         " };
    assertEquals(-1, _calc.turns(data));
  }

  @Test 
  public void testCase6() {
    String[] data =
    { "##E#   ",
      "#  ##  ",
      " -O-## ",
      " #  ## ",
      " ##  ##",
      "  -O-  ",
      "##  ## ",
      " # ### ",
      " #  S  " };
    assertEquals(5, _calc.turns(data));
  }

  @Test 
  public void testCase7() {
    String[] data =
    { "#############",
      "#  #|##|#   #",
      "#   O  O    #",
      "# E || || S #",
      "#    O  O   #",
      "#   #|##|#  #",
      "#############" };
    assertEquals(4, _calc.turns(data));
  }

  @Test 
  public void testShouldEncodeDecode() {
    for (int i = 0; i < 50; i++) {
      for (int j = 0; j < 50; j++) {
        int v = _calc.encode(i, j);
        int[] r = _calc.decode(v);
        assertEquals(i, r[0]);
        assertEquals(j, r[1]);
      }
    }
  }
}
