package topc.test.simulation;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.simulation.*;

public class QuiltingTest {
  Quilting quilting = new Quilting();

  @Test
  public void case1() {
    int length = 3;
    int width = 2;
    String[] colorList = { "RED", "BLUE", "TAN" };
    assertEquals("TAN", quilting.lastPatch(length, width, colorList));
  }

  @Test
  public void case2() {
    int length = 4;
    int width = 3;
    String[] colorList = { "E", "D", "C", "B", "A" };
    assertEquals("E", quilting.lastPatch(length, width, colorList));
  }

  @Test
  public void case3() {
    int length = 5;
    int width = 4;
    String[] colorList = { "RED", "BLUE", "YELLOW", "GREEN", "ORANGE", "PURPLE", "BROWN" };
    assertEquals("ORANGE", quilting.lastPatch(length, width, colorList));
  }

  @Test
  public void case4() {
    int length = 100;
    int width = 100;
    String[] colorList = { "A", "B", "C", "D", "E" };
    assertEquals("E", quilting.lastPatch(length, width, colorList));
  }

  @Test
  public void case5() {
    int length = 3;
    int width = 3;
    String[] colorList = { "A", "B", "C", "D" };
    assertEquals("C", quilting.lastPatch(length, width, colorList));
  }

  @Test
  public void case6() {
    int length = 1;
    int width = 1;
    String[] colorList = { "RED", "BLUE", "YELLOW" };
    assertEquals("RED", quilting.lastPatch(length, width, colorList));
  }

  @Test
  public void case7() {
    int length = 10;
    int width = 10;
    String[] colorList = { "X", "Y", "Z" };
    assertEquals("Z", quilting.lastPatch(length, width, colorList));
  }

  @Test
  public void case8() {
    int length = 100;
    int width = 99;
    String[] colorList = { "ORGANDY", "ORGANZA", "A", "B", "C", "D", "O", "X", "Y", "Z" };
    assertEquals("Z", quilting.lastPatch(length, width, colorList));
  }

  @Test
  public void case9() {
    int length = 40;
    int width = 40;
    String[] colorList = { "A", "B" };
    assertEquals("B", quilting.lastPatch(length, width, colorList));
  }

  @Test
  public void case10() {
    int length = 39;
    int width = 39;
    String[] colorList = { "X", "D" };
    assertEquals("X", quilting.lastPatch(length, width, colorList));
  }

  @Test
  public void case11() {
    int length = 17;
    int width = 17;
    String[] colorList = { "G", "H" };
    assertEquals("G", quilting.lastPatch(length, width, colorList));
  }

  @Test
  public void case12() {
    int length = 2;
    int width = 1;
    String[] colorList = { "A", "B", "C", "D", "E", "F" };
    assertEquals("B", quilting.lastPatch(length, width, colorList));
  }

  @Test
  public void case13() {
    int length = 9;
    int width = 9;
    String[] colorList = { "A", "B", "C", "D", "E", "F" };
    assertEquals("D", quilting.lastPatch(length, width, colorList));
  }

  @Test
  public void case14() {
    int length = 9;
    int width = 8;
    String[] colorList = { "A", "B", "C", "D", "E", "F" };
    assertEquals("B", quilting.lastPatch(length, width, colorList));
  }

  @Test
  public void case15() {
    int length = 8;
    int width = 8;
    String[] colorList = { "A", "B", "C", "D", "E", "F" };
    assertEquals("B", quilting.lastPatch(length, width, colorList));
  }

  @Test
  public void case16() {
    int length = 8;
    int width = 7;
    String[] colorList = { "A", "B", "C", "D", "E", "F" };
    assertEquals("C", quilting.lastPatch(length, width, colorList));
  }

  @Test
  public void case17() {
    int length = 44;
    int width = 44;
    String[] colorList = { "A", "B", "C", "D", "E", "F" };
    assertEquals("D", quilting.lastPatch(length, width, colorList));
  }

  @Test
  public void case18() {
    int length = 57;
    int width = 56;
    String[] colorList = { "A", "B", "C", "D", "E", "F" };
    assertEquals("E", quilting.lastPatch(length, width, colorList));
  }

  @Test
  public void case19() {
    int length = 89;
    int width = 88;
    String[] colorList = { "A", "B", "C", "D", "E", "F" };
    assertEquals("C", quilting.lastPatch(length, width, colorList));
  }

  @Test
  public void case20() {
    int length = 89;
    int width = 89;
    String[] colorList = { "A" };
    assertEquals("A", quilting.lastPatch(length, width, colorList));
  }

  @Test
  public void case21() {
    int length = 45;
    int width = 44;
    String[] colorList = { "ORGANDY", "ORGANZA", "A", "B", "C", "D", "O", "X", "Y", "Z" };
    assertEquals("Z", quilting.lastPatch(length, width, colorList));
  }

  @Test
  public void case22() {
    int length = 32;
    int width = 32;
    String[] colorList = { "ORGANDY", "ORGANZA", "A", "B", "C", "D", "O", "X", "Y", "Z" };
    assertEquals("B", quilting.lastPatch(length, width, colorList));
  }

  @Test
  public void case23() {
    int length = 97;
    int width = 96;
    String[] colorList = { "A", "B", "C", "D", "E", "F", "G", "H", "I" };
    assertEquals("F", quilting.lastPatch(length, width, colorList));
  }

  @Test
  public void case24() {
    int length = 5;
    int width = 5;
    String[] colorList = { "A", "B", "C", "D", "E", "F", "G" };
    assertEquals("C", quilting.lastPatch(length, width, colorList));
  }

  @Test
  public void case25() {
    int length = 99;
    int width = 99;
    String[] colorList = { "A", "B", "C", "D", "E", "F", "G", "W", "Z" };
    assertEquals("Z", quilting.lastPatch(length, width, colorList));
  }

  @Test
  public void case26() {
    int length = 3;
    int width = 3;
    String[] colorList = { "A", "B", "C", "D" };
    assertEquals("C", quilting.lastPatch(length, width, colorList));
  }

  @Test
  public void case27() {
    int length = 3;
    int width = 3;
    String[] colorList = { "A", "B", "C" };
    assertEquals("C", quilting.lastPatch(length, width, colorList));
  }

}
