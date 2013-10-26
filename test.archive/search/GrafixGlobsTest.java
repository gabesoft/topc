package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class GrafixGlobsTest {
  GrafixGlobs grafixglobs = new GrafixGlobs();

  @Test
  public void case1() {
    String[] commands = { "make arc", "make arc", "make circle", "merge 1 0", "merge 2 1", "split 2" };
    int sel = 0;
    assertArrayEquals(new int[] { 1, 0, 0 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case2() {
    String[] commands = { "make arc", "make arc", "make circle", "merge 1 0", "merge 2 1", "split 2" };
    int sel = 1;
    assertArrayEquals(new int[] { 1, 0, 0 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case3() {
    String[] commands = { "make arc", "make arc", "make circle", "merge 1 0", "merge 2 1", "split 2" };
    int sel = 2;
    assertArrayEquals(new int[] { 0, 1, 0 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case4() {
    String[] commands = { "make arc", "make arc", "make circle", "merge 1 0", "merge 2 1", "split 2" };
    int sel = 4;
    assertArrayEquals(new int[] {  }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case5() {
    String[] commands = { "make polygon", "make polygon", "make arc", "make circle", "make circle", "delete 3", "make polygon", "make arc", "make arc", "merge 1 3", "merge 1 4", "merge 2 1", "make arc", "make arc", "make circle", "make circle", "merge 6 5", "split 6", "merge 2 1" };
    int sel = 2;
    assertArrayEquals(new int[] { 2, 1, 2 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case6() {
    String[] commands = { "make arc", "delete 0", "make polygon", "make polygon", "merge 0 1", "make arc", "make circle", "make arc", "merge 2 1", "make polygon", "merge 1 3", "make polygon", "make polygon", "make circle", "merge 4 5", "make circle", "make arc", "make circle", "merge 6 7", "make circle", "make circle", "make polygon", "merge 3 9", "merge 8 7", "make polygon", "make arc", "merge 9 5", "make circle", "make circle", "split 7", "merge 7 10", "make circle", "merge 5 10", "make polygon", "make polygon", "merge 10 11", "make circle", "make circle", "make arc", "make polygon", "merge 11 13", "make polygon", "make polygon", "make circle", "make arc", "make polygon", "make arc", "make polygon", "merge 18 16", "make circle" };
    int sel = 19;
    assertArrayEquals(new int[] { 1, 0, 0 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case7() {
    String[] commands = { "make circle", "make polygon", "delete 1", "make polygon", "make polygon", "split 1", "make polygon", "make circle", "merge 0 3", "make circle", "split 2", "merge 3 2", "make polygon", "merge 2 1", "make arc", "make polygon", "merge 1 5", "make circle", "merge 5 4", "make arc", "make arc", "merge 6 4", "make arc", "make polygon", "merge 7 4", "make arc", "make arc", "merge 8 4", "make arc", "make polygon", "merge 9 4", "make circle", "make arc", "make polygon", "merge 4 10", "make polygon", "make polygon", "merge 11 10", "make arc", "merge 10 12", "make polygon", "make polygon", "make circle", "make arc", "delete 15", "make polygon", "delete 12", "merge 13 14", "make circle", "merge 12 15" };
    int sel = 102;
    assertArrayEquals(new int[] {  }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case8() {
    String[] commands = { "make arc", "make polygon", "merge 0 1", "make polygon", "make polygon", "make arc", "make polygon", "make polygon", "merge 4 5", "make polygon", "merge 3 2", "merge 1 5", "make polygon", "make circle", "merge 2 5", "make circle", "make circle", "make polygon", "merge 7 6", "split 5", "make circle", "merge 5 6", "make polygon", "make arc", "merge 6 8", "make circle", "make arc", "merge 8 9", "make circle", "make arc", "merge 9 10", "make arc", "make circle", "delete 11", "delete 10", "make polygon", "make arc", "merge 11 10", "make circle", "make circle", "make arc", "merge 10 13", "make polygon", "merge 13 12", "make circle", "make circle", "make circle", "delete 14", "make arc", "make arc" };
    int sel = 15;
    assertArrayEquals(new int[] { 0, 1, 0 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case9() {
    String[] commands = { "make arc", "make polygon", "make arc", "make polygon", "merge 2 0", "make arc", "merge 3 1", "make arc", "merge 0 1", "make arc", "make arc", "merge 4 1", "make polygon", "make arc", "make polygon", "make circle", "make polygon", "merge 6 8", "merge 1 7", "make arc", "make arc", "make polygon", "make circle", "merge 9 5", "make circle", "merge 5 10", "make arc", "merge 7 8", "make circle", "split 10", "split 10", "merge 8 10", "make arc", "make polygon", "merge 10 11", "make circle", "make circle", "merge 12 11", "make circle", "make polygon", "make polygon", "merge 13 11", "make circle", "make arc", "make polygon", "make polygon", "merge 11 15", "make circle", "make circle", "make arc" };
    int sel = 17;
    assertArrayEquals(new int[] { 0, 0, 1 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case10() {
    String[] commands = { "make arc", "make polygon", "make circle", "merge 0 1", "make polygon", "make circle", "merge 2 3", "make arc", "make circle", "merge 3 1", "make circle", "merge 1 4", "make polygon", "make circle", "merge 4 5", "make circle", "make circle", "make arc", "merge 6 5", "make polygon", "merge 7 5", "make arc", "make polygon", "split 8", "merge 8 5", "make polygon", "make arc", "make arc", "merge 9 5", "make polygon", "make circle", "make circle", "merge 11 12", "make circle", "make arc", "make arc", "merge 5 14", "merge 13 12", "make arc", "delete 10", "make arc", "make arc", "make circle", "make arc", "merge 14 12", "merge 10 16", "make polygon", "make polygon", "make arc", "merge 16 15" };
    int sel = 12;
    assertArrayEquals(new int[] { 0, 0, 1 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case11() {
    String[] commands = { "make circle", "make arc", "make arc", "merge 2 1", "make arc", "merge 1 0", "make polygon", "make arc", "merge 3 0", "make polygon", "make arc", "make circle", "merge 5 4", "make arc", "merge 4 0", "make circle", "make arc", "merge 6 0", "make polygon", "make polygon", "merge 0 7", "make arc", "make circle", "delete 8", "make arc", "merge 8 7", "make circle", "make arc", "merge 7 9", "make arc", "make polygon", "merge 10 9", "make polygon", "make circle", "make arc", "make polygon", "make circle", "make circle", "make circle", "delete 9", "merge 13 11", "merge 15 16", "make arc", "merge 12 9", "make circle", "merge 14 9", "make polygon", "make circle", "merge 11 9", "make polygon" };
    int sel = 9;
    assertArrayEquals(new int[] { 0, 0, 1 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case12() {
    String[] commands = { "make circle", "make polygon", "merge 0 1", "make arc", "make circle", "split 2", "make arc", "merge 3 1", "make arc", "make arc", "make circle", "make arc", "make circle", "merge 5 1", "delete 2", "merge 7 4", "delete 6", "make polygon", "make circle", "make circle", "make circle", "merge 1 2", "split 4", "merge 2 6", "make circle", "make circle", "make polygon", "make polygon", "merge 4 9", "merge 6 8", "make polygon", "split 8", "make arc", "merge 9 8", "make polygon", "make arc", "make arc", "merge 11 10", "make circle", "make arc", "make circle", "make arc", "split 13", "merge 14 12", "make arc", "make arc", "make circle", "make circle", "make circle", "merge 13 18" };
    int sel = 12;
    assertArrayEquals(new int[] { 1, 0, 0 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case13() {
    String[] commands = { "make polygon", "make polygon", "make circle", "merge 1 0", "make circle", "merge 0 2", "make polygon", "make arc", "make arc", "make circle", "make polygon", "make polygon", "merge 2 4", "make circle", "merge 6 5", "make circle", "merge 7 4", "make arc", "make polygon", "make arc", "make arc", "merge 5 10", "make circle", "merge 9 10", "merge 4 8", "make polygon", "merge 3 8", "make arc", "make arc", "merge 8 10", "make circle", "make arc", "make polygon", "make arc", "make polygon", "merge 11 12", "make circle", "merge 12 13", "merge 10 14", "make polygon", "make circle", "make circle", "make circle", "split 15", "merge 13 14", "make polygon", "merge 14 15", "make circle", "merge 16 15", "make circle" };
    int sel = 15;
    assertArrayEquals(new int[] { 0, 1, 0 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case14() {
    String[] commands = { "make polygon", "make circle", "make circle", "make circle", "merge 0 2", "make arc", "merge 3 2", "make polygon", "make circle", "make arc", "merge 5 2", "merge 4 1", "make polygon", "make polygon", "make circle", "merge 1 2", "make circle", "merge 6 2", "make polygon", "make circle", "delete 2", "make arc", "make circle", "merge 2 8", "make polygon", "merge 8 7", "make arc", "make polygon", "merge 7 9", "make polygon", "make arc", "make arc", "merge 11 10", "make polygon", "make circle", "merge 10 12", "make polygon", "make arc", "merge 13 12", "make polygon", "merge 12 9", "make arc", "make polygon", "make circle", "merge 14 9", "make arc", "merge 9 15", "make arc", "make circle", "merge 16 15" };
    int sel = 162;
    assertArrayEquals(new int[] {  }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case15() {
    String[] commands = { "make circle", "make circle", "merge 0 1", "make circle", "make arc", "merge 2 1", "make polygon", "make circle", "merge 3 1", "make arc", "make polygon", "merge 1 4", "make polygon", "delete 4", "make polygon", "make circle", "delete 5", "make circle", "make arc", "merge 6 4", "delete 5", "make arc", "make arc", "make arc", "make arc", "make arc", "make circle", "split 7", "merge 7 5", "make circle", "merge 4 5", "make circle", "make arc", "merge 10 9", "merge 5 8", "make arc", "make circle", "merge 8 11", "make polygon", "make arc", "merge 9 12", "make polygon", "make arc", "make polygon", "merge 12 11", "make circle", "make polygon", "merge 13 14", "merge 15 11", "make circle" };
    int sel = 11;
    assertArrayEquals(new int[] { 0, 1, 0 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case16() {
    String[] commands = { "make polygon", "make circle", "make circle", "make arc", "split 0", "make polygon", "merge 2 3", "merge 4 1", "make polygon", "make polygon", "make polygon", "make arc", "merge 1 6", "merge 5 3", "make circle", "merge 3 0", "make arc", "make circle", "make arc", "merge 6 7", "make circle", "make circle", "make polygon", "merge 8 7", "merge 0 9", "make circle", "make polygon", "make arc", "merge 9 10", "make arc", "merge 10 7", "make arc", "make circle", "make arc", "make arc", "make polygon", "merge 12 14", "merge 11 13", "make arc", "split 7", "merge 7 13", "make circle", "make arc", "split 14", "make circle", "merge 14 15", "make arc", "merge 15 13", "make circle", "make arc" };
    int sel = 16;
    assertArrayEquals(new int[] { 1, 0, 0 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case17() {
    String[] commands = { "make arc", "make circle", "split 0", "make circle", "merge 1 2", "make arc", "make polygon", "make circle", "merge 0 4", "merge 3 2", "make polygon", "make arc", "make arc", "make polygon", "make polygon", "merge 7 6", "merge 4 2", "make polygon", "merge 2 5", "make polygon", "make arc", "merge 6 5", "make arc", "make circle", "make polygon", "merge 5 9", "make arc", "merge 8 9", "make arc", "make arc", "make polygon", "merge 10 9", "make circle", "merge 11 9", "make arc", "make arc", "make circle", "make polygon", "merge 13 14", "merge 12 9", "make arc", "make arc", "merge 9 14", "make polygon", "make circle", "make polygon", "make circle", "make arc", "delete 17", "make circle" };
    int sel = 17;
    assertArrayEquals(new int[] { 0, 1, 0 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case18() {
    String[] commands = { "make arc", "make polygon", "make polygon", "make arc", "merge 3 0", "merge 1 2", "make polygon", "make polygon", "make circle", "delete 0", "merge 4 2", "make arc", "make arc", "make arc", "merge 2 0", "make circle", "merge 0 5", "make polygon", "make arc", "make polygon", "merge 6 7", "make circle", "merge 7 5", "make arc", "make arc", "make polygon", "merge 8 9", "make arc", "make arc", "delete 9", "make circle", "merge 10 9", "make circle", "merge 9 5", "make polygon", "make polygon", "merge 11 5", "make polygon", "delete 5", "make polygon", "make circle", "merge 5 12", "make circle", "make circle", "merge 12 13", "make polygon", "make arc", "merge 13 14", "make circle", "make polygon" };
    int sel = 15;
    assertArrayEquals(new int[] { 0, 0, 1 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case19() {
    String[] commands = { "make arc", "make circle", "merge 0 1", "make circle", "make arc", "merge 2 1", "make polygon", "make arc", "make circle", "make arc", "merge 3 5", "make circle", "delete 5", "merge 1 4", "make circle", "make circle", "merge 5 4", "make polygon", "split 4", "make circle", "merge 4 6", "make circle", "make circle", "make polygon", "make arc", "merge 7 9", "merge 6 8", "make polygon", "make polygon", "merge 9 8", "make circle", "make polygon", "make arc", "make polygon", "merge 8 12", "merge 11 10", "make polygon", "make circle", "merge 10 12", "make polygon", "make polygon", "make circle", "make circle", "merge 13 14", "merge 15 12", "make polygon", "make circle", "merge 14 12", "make polygon", "make polygon" };
    int sel = 12;
    assertArrayEquals(new int[] { 0, 0, 1 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case20() {
    String[] commands = { "make polygon", "make polygon", "make polygon", "merge 0 2", "make circle", "merge 2 1", "make arc", "make arc", "merge 3 1", "make polygon", "make polygon", "make circle", "merge 4 1", "make circle", "make arc", "split 6", "make circle", "merge 5 6", "make arc", "merge 1 6", "make polygon", "merge 7 6", "make circle", "make polygon", "delete 6", "make arc", "split 6", "merge 8 6", "make polygon", "make circle", "merge 6 9", "make circle", "make arc", "merge 9 10", "make polygon", "make arc", "merge 11 10", "make arc", "make circle", "make circle", "merge 12 10", "make arc", "make circle", "merge 13 14", "delete 10", "make circle", "make arc", "make polygon", "make polygon", "make circle" };
    int sel = 15;
    assertArrayEquals(new int[] { 0, 0, 1 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case21() {
    String[] commands = { "make circle", "make polygon", "make circle", "merge 1 2", "make arc", "make polygon", "make polygon", "merge 2 3", "merge 0 4", "make circle", "make circle", "make circle", "make arc", "merge 6 3", "merge 5 4", "make polygon", "make polygon", "make circle", "merge 7 3", "make polygon", "merge 4 3", "make circle", "make arc", "merge 3 8", "make arc", "make arc", "merge 8 9", "make polygon", "make circle", "merge 9 10", "make arc", "make polygon", "merge 11 10", "make polygon", "make polygon", "merge 10 12", "make polygon", "make polygon", "merge 12 13", "make polygon", "make circle", "make circle", "merge 14 13", "make polygon", "make polygon", "merge 16 13", "make polygon", "split 15", "merge 15 13", "make polygon" };
    int sel = 13;
    assertArrayEquals(new int[] { 0, 0, 1 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case22() {
    String[] commands = { "make arc", "make polygon", "make circle", "merge 0 2", "make circle", "merge 2 1", "make polygon", "make polygon", "merge 3 1", "make circle", "make polygon", "merge 4 1", "make arc", "make polygon", "make circle", "split 6", "make polygon", "make polygon", "make polygon", "merge 6 8", "merge 7 5", "make circle", "merge 1 5", "make polygon", "merge 9 5", "make polygon", "make polygon", "make circle", "merge 8 5", "make circle", "merge 10 5", "make arc", "make arc", "make circle", "merge 11 12", "make polygon", "merge 12 5", "make circle", "make polygon", "make circle", "make circle", "merge 13 14", "make polygon", "make polygon", "merge 5 16", "make circle", "merge 15 14", "make arc", "merge 14 16", "make polygon" };
    int sel = 16;
    assertArrayEquals(new int[] { 0, 0, 1 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case23() {
    String[] commands = { "make polygon", "make polygon", "merge 0 1", "make arc", "make arc", "merge 1 2", "make polygon", "make arc", "make arc", "merge 3 4", "delete 2", "make arc", "make circle", "make arc", "make circle", "split 5", "merge 2 6", "make circle", "merge 4 5", "make arc", "make polygon", "make arc", "make polygon", "make circle", "merge 9 8", "merge 6 7", "make circle", "merge 10 7", "make circle", "merge 7 5", "make polygon", "make polygon", "make circle", "merge 8 11", "make polygon", "make polygon", "make arc", "make polygon", "make arc", "make polygon", "merge 13 15", "make polygon", "split 5", "make circle", "make polygon", "merge 5 16", "merge 15 14", "make polygon", "merge 17 11", "make polygon" };
    int sel = 18;
    assertArrayEquals(new int[] { 0, 0, 1 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case24() {
    String[] commands = { "make polygon", "make polygon", "make circle", "delete 2", "merge 0 1", "make polygon", "make circle", "split 2", "merge 1 2", "make circle", "make polygon", "make circle", "merge 4 3", "make circle", "merge 3 2", "make arc", "make circle", "merge 2 5", "make polygon", "make polygon", "merge 6 5", "make circle", "make polygon", "merge 5 7", "make circle", "make polygon", "merge 7 8", "make polygon", "make circle", "merge 9 8", "make arc", "make polygon", "merge 8 10", "make polygon", "make arc", "merge 10 11", "make polygon", "make arc", "make polygon", "delete 12", "make circle", "merge 11 12", "make arc", "split 13", "delete 13", "make circle", "merge 13 12", "make polygon", "make polygon", "merge 12 14" };
    int sel = 116;
    assertArrayEquals(new int[] {  }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case25() {
    String[] commands = { "make circle", "make circle", "merge 1 0", "make circle", "make circle", "merge 0 2", "make circle", "make circle", "merge 3 2", "make arc", "make arc", "merge 4 2", "make circle", "split 2", "make circle", "merge 2 5", "make circle", "make polygon", "merge 5 6", "make arc", "make polygon", "merge 7 6", "make circle", "make polygon", "merge 8 6", "make polygon", "make polygon", "merge 9 6", "make polygon", "make arc", "make arc", "merge 11 6", "make polygon", "merge 10 6", "make arc", "make polygon", "make circle", "make polygon", "make circle", "make arc", "merge 6 15", "delete 13", "make polygon", "merge 16 14", "split 12", "make circle", "make polygon", "merge 13 15", "make circle", "make arc" };
    int sel = 15;
    assertArrayEquals(new int[] { 0, 1, 0 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case26() {
    String[] commands = { "make arc", "make polygon", "merge 0 1", "make arc", "make arc", "merge 1 2", "make polygon", "make polygon", "merge 2 3", "make circle", "make circle", "make circle", "merge 3 4", "make arc", "merge 5 4", "make polygon", "make circle", "merge 4 6", "make polygon", "make circle", "merge 6 7", "make arc", "make polygon", "delete 8", "make circle", "merge 7 8", "make circle", "make arc", "merge 9 8", "make arc", "make arc", "make arc", "merge 10 8", "make circle", "make polygon", "merge 12 11", "make arc", "merge 11 8", "make polygon", "make arc", "make arc", "merge 13 8", "delete 14", "make arc", "make polygon", "merge 14 8", "make polygon", "make polygon", "make arc", "merge 8 15" };
    int sel = 16;
    assertArrayEquals(new int[] { 1, 0, 0 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case27() {
    String[] commands = { "make arc", "make polygon", "merge 0 1", "make polygon", "make polygon", "make arc", "merge 1 3", "make arc", "merge 3 2", "make polygon", "make arc", "merge 4 2", "make arc", "split 2", "make polygon", "make polygon", "make polygon", "merge 5 7", "merge 6 2", "make circle", "make polygon", "make arc", "merge 8 2", "make circle", "make circle", "make arc", "merge 2 9", "make circle", "make arc", "merge 7 9", "make circle", "make arc", "make polygon", "merge 13 9", "split 12", "make circle", "delete 10", "merge 12 9", "split 11", "delete 9", "make circle", "make arc", "merge 10 9", "make circle", "make circle", "merge 9 11", "make arc", "make arc", "merge 14 11", "make polygon" };
    int sel = 11;
    assertArrayEquals(new int[] { 0, 0, 1 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case28() {
    String[] commands = { "make circle", "make arc", "merge 0 1", "make polygon", "make circle", "merge 2 1", "make circle", "split 1", "make polygon", "merge 1 3", "make circle", "make polygon", "merge 4 3", "make circle", "make polygon", "make circle", "merge 5 6", "make polygon", "merge 3 6", "make circle", "make circle", "make arc", "make polygon", "make circle", "split 7", "merge 7 6", "make polygon", "merge 8 9", "merge 10 6", "make arc", "make polygon", "delete 9", "make circle", "merge 6 9", "make polygon", "split 9", "make circle", "merge 11 9", "make polygon", "make circle", "make polygon", "make polygon", "merge 13 14", "split 9", "make arc", "make circle", "make polygon", "merge 15 12", "make arc", "merge 9 14" };
    int sel = 12;
    assertArrayEquals(new int[] { 1, 0, 0 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case29() {
    String[] commands = { "make circle", "make polygon", "merge 0 1", "make polygon", "make arc", "make arc", "make arc", "merge 2 1", "merge 3 4", "make circle", "make arc", "make polygon", "make polygon", "merge 6 4", "merge 1 5", "make circle", "make circle", "make circle", "merge 7 5", "make circle", "merge 5 4", "make circle", "make arc", "make arc", "make arc", "merge 10 9", "merge 4 8", "make polygon", "make polygon", "delete 9", "make circle", "make circle", "make polygon", "merge 9 8", "make arc", "make polygon", "make circle", "make arc", "make circle", "delete 14", "merge 13 8", "merge 15 16", "merge 11 12", "make circle", "make circle", "merge 12 8", "make arc", "make circle", "merge 14 8", "make polygon" };
    int sel = 8;
    assertArrayEquals(new int[] { 0, 0, 1 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case30() {
    String[] commands = { "make circle", "make arc", "make circle", "merge 0 2", "make circle", "make arc", "merge 1 3", "make arc", "merge 2 3", "make circle", "make circle", "split 4", "merge 3 4", "make arc", "make polygon", "delete 4", "delete 5", "make polygon", "make circle", "delete 5", "make circle", "merge 4 5", "make arc", "make circle", "merge 5 6", "make arc", "make polygon", "make circle", "make arc", "merge 6 7", "delete 9", "make circle", "make circle", "merge 9 8", "make polygon", "make circle", "make circle", "make polygon", "merge 7 11", "merge 10 12", "make arc", "merge 11 8", "make polygon", "make circle", "make arc", "merge 8 13", "make polygon", "make circle", "merge 13 14", "make polygon" };
    int sel = 12;
    assertArrayEquals(new int[] { 0, 1, 0 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case31() {
    String[] commands = { "make circle", "make polygon", "merge 1 0", "make arc", "make polygon", "make polygon", "merge 0 2", "make polygon", "make circle", "make arc", "delete 5", "merge 4 2", "make polygon", "make polygon", "split 2", "make circle", "make polygon", "merge 3 6", "merge 2 5", "make circle", "merge 7 5", "make polygon", "make arc", "merge 5 6", "make circle", "make polygon", "split 8", "make circle", "make polygon", "merge 9 6", "make arc", "make circle", "merge 10 8", "make polygon", "make arc", "make circle", "merge 8 13", "make arc", "merge 12 11", "merge 13 6", "make arc", "make circle", "make arc", "merge 14 6", "split 11", "make polygon", "make polygon", "merge 11 15", "make polygon", "make circle" };
    int sel = 16;
    assertArrayEquals(new int[] { 0, 1, 0 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case32() {
    String[] commands = { "make polygon", "make circle", "make arc", "make arc", "merge 3 2", "make arc", "make polygon", "make polygon", "merge 0 5", "merge 2 1", "make polygon", "merge 1 4", "make polygon", "make circle", "delete 4", "make polygon", "make circle", "split 4", "merge 5 6", "make arc", "make polygon", "merge 6 4", "make polygon", "make polygon", "merge 8 7", "make arc", "make polygon", "delete 4", "merge 7 9", "make arc", "make polygon", "merge 9 4", "make polygon", "make arc", "merge 10 4", "make circle", "make polygon", "merge 11 4", "make polygon", "make circle", "make arc", "make polygon", "make arc", "merge 4 13", "delete 15", "make arc", "split 14", "merge 13 14", "make arc", "make arc" };
    int sel = 14;
    assertArrayEquals(new int[] { 1, 0, 0 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case33() {
    String[] commands = { "make arc", "make arc", "make arc", "merge 0 1", "make polygon", "make arc", "delete 3", "delete 1", "delete 2", "make arc", "delete 1", "make circle", "make arc", "merge 2 1", "make polygon", "make arc", "make polygon", "merge 1 3", "make polygon", "merge 4 3", "make circle", "make polygon", "split 3", "make circle", "make polygon", "merge 6 3", "make circle", "merge 3 7", "delete 5", "make circle", "make polygon", "split 5", "split 5", "delete 7", "make polygon", "merge 5 7", "make circle", "make polygon", "split 7", "make arc", "make arc", "merge 9 7", "make polygon", "make arc", "merge 11 7", "make polygon", "merge 7 8", "make polygon", "make circle", "merge 10 12" };
    int sel = 8;
    assertArrayEquals(new int[] { 0, 0, 1 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case34() {
    String[] commands = { "make circle", "make circle", "merge 1 0", "make circle", "make polygon", "merge 2 0", "make circle", "make arc", "make arc", "merge 4 3", "delete 0", "make circle", "make polygon", "make circle", "delete 0", "make polygon", "make circle", "make polygon", "merge 5 7", "merge 0 3", "make arc", "merge 6 3", "make arc", "make arc", "make polygon", "split 8", "delete 7", "merge 3 8", "make arc", "make polygon", "merge 8 7", "make polygon", "make polygon", "merge 9 7", "make arc", "make circle", "merge 10 7", "make arc", "make circle", "merge 7 11", "make arc", "make arc", "merge 12 11", "make arc", "make arc", "merge 11 13", "make arc", "make polygon", "delete 13", "make circle" };
    int sel = 13;
    assertArrayEquals(new int[] { 0, 1, 0 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case35() {
    String[] commands = { "make arc", "make circle", "make polygon", "merge 2 0", "make polygon", "merge 1 0", "make polygon", "make polygon", "merge 3 0", "make polygon", "make circle", "merge 4 0", "make arc", "make polygon", "merge 0 5", "make polygon", "make polygon", "merge 5 6", "make arc", "make circle", "make circle", "merge 7 6", "make circle", "merge 8 6", "make circle", "make polygon", "merge 9 6", "make polygon", "make circle", "make circle", "make circle", "merge 12 10", "merge 11 6", "make polygon", "make polygon", "make arc", "merge 10 6", "make arc", "merge 13 6", "make circle", "make arc", "make polygon", "make circle", "merge 14 6", "make circle", "merge 6 16", "make polygon", "make arc", "delete 16", "merge 15 17" };
    int sel = 43;
    assertArrayEquals(new int[] {  }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case36() {
    String[] commands = { "make circle", "make polygon", "merge 0 1", "make arc", "make circle", "merge 2 1", "make polygon", "make circle", "make arc", "merge 3 4", "make polygon", "merge 1 4", "make polygon", "split 4", "make circle", "merge 5 4", "make circle", "delete 4", "make polygon", "delete 4", "make circle", "make circle", "merge 6 4", "make arc", "make polygon", "merge 4 7", "make arc", "make circle", "merge 8 7", "make circle", "make polygon", "merge 9 7", "make circle", "make circle", "split 10", "merge 7 10", "make arc", "make polygon", "merge 10 11", "make polygon", "make polygon", "make arc", "make circle", "merge 11 12", "merge 13 14", "make arc", "make polygon", "make arc", "merge 12 15", "make polygon" };
    int sel = 15;
    assertArrayEquals(new int[] { 0, 0, 1 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case37() {
    String[] commands = { "make arc", "make circle", "make polygon", "make arc", "make polygon", "merge 0 2", "delete 4", "merge 1 3", "make polygon", "make circle", "merge 2 3", "make circle", "make polygon", "make arc", "delete 3", "merge 4 5", "make arc", "split 3", "make arc", "merge 3 5", "make arc", "make polygon", "merge 6 5", "make polygon", "make arc", "merge 7 5", "make arc", "make circle", "merge 8 5", "make arc", "make circle", "merge 5 9", "make arc", "make circle", "make circle", "make polygon", "merge 11 9", "merge 10 12", "make arc", "make arc", "merge 12 9", "make polygon", "make arc", "merge 9 13", "make circle", "make polygon", "merge 14 13", "make circle", "make circle", "merge 15 13" };
    int sel = 19;
    assertArrayEquals(new int[] {  }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case38() {
    String[] commands = { "make circle", "make arc", "split 1", "make polygon", "merge 0 2", "make circle", "make circle", "make circle", "make circle", "merge 3 5", "make circle", "delete 2", "merge 4 1", "make circle", "delete 5", "make arc", "make circle", "merge 2 1", "make circle", "make arc", "make circle", "make circle", "merge 7 6", "merge 8 1", "make arc", "delete 5", "make polygon", "split 5", "merge 1 5", "make arc", "make arc", "merge 5 6", "make arc", "make circle", "make arc", "split 6", "make circle", "make polygon", "merge 11 9", "merge 10 12", "make circle", "delete 9", "make polygon", "merge 9 6", "make arc", "make polygon", "merge 6 12", "make circle", "make polygon", "merge 12 13" };
    int sel = 123;
    assertArrayEquals(new int[] {  }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case39() {
    String[] commands = { "make polygon", "make circle", "make polygon", "merge 2 0", "make arc", "make circle", "merge 0 3", "make polygon", "make arc", "merge 3 1", "make arc", "make arc", "split 1", "merge 5 4", "make circle", "merge 1 4", "make polygon", "make circle", "merge 6 4", "make circle", "make polygon", "merge 4 7", "make circle", "make polygon", "merge 7 8", "make circle", "make polygon", "make polygon", "make arc", "merge 8 9", "merge 10 11", "make arc", "make circle", "merge 9 11", "make circle", "make circle", "make arc", "merge 13 12", "make circle", "merge 12 11", "make circle", "make polygon", "make circle", "merge 11 14", "make circle", "merge 14 15", "make arc", "make arc", "make polygon", "make arc" };
    int sel = 17;
    assertArrayEquals(new int[] { 0, 0, 1 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case40() {
    String[] commands = { "make circle", "make circle", "make circle", "make polygon", "merge 3 1", "make circle", "merge 2 0", "make polygon", "make circle", "make circle", "make arc", "split 1", "merge 6 5", "merge 4 1", "make arc", "make arc", "merge 1 5", "make polygon", "make circle", "merge 5 0", "make circle", "merge 0 7", "make arc", "make arc", "merge 8 7", "make arc", "make polygon", "merge 9 7", "make arc", "make polygon", "make circle", "make polygon", "make polygon", "merge 13 11", "merge 7 12", "make polygon", "make circle", "merge 11 10", "make polygon", "split 12", "merge 12 10", "make arc", "make arc", "make arc", "merge 15 10", "make polygon", "merge 10 14", "make arc", "make polygon", "split 16" };
    int sel = 16;
    assertArrayEquals(new int[] { 0, 0, 1 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case41() {
    String[] commands = { "make arc", "make arc", "merge 1 0", "make polygon", "make arc", "make polygon", "make circle", "merge 4 0", "merge 2 3", "make polygon", "make circle", "make arc", "make arc", "merge 6 3", "merge 5 0", "make arc", "make circle", "make arc", "merge 0 7", "make polygon", "merge 7 3", "make polygon", "make polygon", "make circle", "merge 8 3", "make circle", "merge 9 3", "make arc", "make circle", "make circle", "merge 11 3", "delete 10", "make polygon", "make polygon", "merge 3 10", "make polygon", "make arc", "merge 10 12", "make arc", "make arc", "merge 12 13", "make polygon", "make circle", "make polygon", "merge 15 14", "make arc", "merge 13 14", "make arc", "make arc", "merge 16 14" };
    int sel = 82;
    assertArrayEquals(new int[] {  }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case42() {
    String[] commands = { "make arc", "make polygon", "merge 0 1", "make circle", "make arc", "merge 2 1", "make arc", "make circle", "merge 3 1", "make circle", "make circle", "merge 4 1", "make circle", "make circle", "make arc", "make polygon", "make circle", "make polygon", "merge 8 5", "split 7", "make polygon", "make arc", "merge 1 10", "make arc", "merge 5 10", "merge 7 6", "make circle", "split 9", "delete 9", "make polygon", "make circle", "merge 6 9", "make polygon", "merge 9 10", "make polygon", "make circle", "merge 11 10", "make arc", "make circle", "merge 10 12", "make arc", "make arc", "make polygon", "make polygon", "merge 13 12", "delete 15", "make circle", "make circle", "merge 12 15", "make arc" };
    int sel = 15;
    assertArrayEquals(new int[] { 1, 0, 0 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case43() {
    String[] commands = { "make circle", "make polygon", "merge 1 0", "make polygon", "make polygon", "merge 0 2", "make polygon", "make circle", "make polygon", "merge 3 4", "make circle", "merge 2 4", "make polygon", "make arc", "make arc", "make polygon", "merge 7 5", "make arc", "merge 4 5", "make circle", "make polygon", "make circle", "merge 8 6", "make polygon", "merge 6 9", "make polygon", "merge 9 5", "make circle", "delete 5", "make circle", "make polygon", "split 5", "merge 5 10", "make circle", "make circle", "make circle", "merge 12 10", "make circle", "split 10", "merge 11 10", "make polygon", "make polygon", "make circle", "merge 10 13", "make arc", "merge 14 13", "make circle", "make polygon", "merge 15 13", "make arc" };
    int sel = 13;
    assertArrayEquals(new int[] { 1, 0, 0 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case44() {
    String[] commands = { "make arc", "delete 0", "make polygon", "make circle", "make polygon", "make arc", "make circle", "make polygon", "make polygon", "merge 2 1", "merge 5 4", "merge 3 6", "make polygon", "merge 1 0", "make circle", "make arc", "merge 0 4", "make polygon", "make circle", "merge 6 4", "make arc", "make circle", "merge 4 7", "make circle", "make circle", "make polygon", "make circle", "make arc", "make polygon", "merge 11 7", "make polygon", "merge 10 8", "make polygon", "merge 7 12", "make circle", "merge 9 12", "make circle", "merge 8 12", "make circle", "make circle", "make circle", "merge 13 14", "make polygon", "merge 14 12", "make arc", "make polygon", "make polygon", "make arc", "make circle", "merge 17 18" };
    int sel = 12;
    assertArrayEquals(new int[] { 1, 0, 0 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case45() {
    String[] commands = { "make circle", "make arc", "make polygon", "make arc", "make polygon", "merge 3 2", "make polygon", "merge 0 1", "merge 4 2", "make circle", "make arc", "make polygon", "make arc", "merge 1 2", "merge 6 5", "make arc", "make arc", "merge 5 2", "make arc", "make polygon", "merge 7 2", "make polygon", "make arc", "make polygon", "merge 8 2", "make polygon", "merge 9 2", "make circle", "make arc", "merge 2 10", "make arc", "make arc", "make polygon", "make polygon", "merge 13 11", "make circle", "make polygon", "make polygon", "make arc", "make circle", "make polygon", "make circle", "make circle", "merge 19 16", "merge 15 14", "split 18", "merge 11 10", "make polygon", "merge 10 20", "make arc" };
    int sel = 14;
    assertArrayEquals(new int[] { 0, 0, 1 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case46() {
    String[] commands = { "make polygon", "make polygon", "merge 0 1", "make circle", "make circle", "split 1", "make circle", "make circle", "merge 2 4", "merge 1 3", "make arc", "make polygon", "merge 3 4", "make polygon", "make arc", "split 4", "merge 5 4", "make polygon", "make polygon", "make circle", "merge 6 7", "make polygon", "make arc", "merge 8 4", "make circle", "make polygon", "merge 9 7", "make circle", "merge 4 7", "make arc", "make circle", "make polygon", "merge 11 10", "make circle", "merge 10 7", "make arc", "make arc", "merge 12 7", "make circle", "make circle", "merge 7 13", "make arc", "make circle", "make circle", "make polygon", "merge 14 13", "make arc", "merge 13 15", "make polygon", "merge 15 16" };
    int sel = 15;
    assertArrayEquals(new int[] { 0, 0, 2 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case47() {
    String[] commands = { "make circle", "split 0", "make arc", "merge 0 1", "make polygon", "split 1", "make circle", "merge 1 2", "make polygon", "make polygon", "delete 3", "make polygon", "merge 3 2", "make circle", "make arc", "merge 4 2", "make circle", "make circle", "make polygon", "merge 2 5", "make arc", "merge 6 5", "make arc", "make circle", "merge 5 7", "make circle", "make arc", "merge 7 8", "make arc", "make circle", "make polygon", "merge 8 9", "make polygon", "merge 10 9", "make polygon", "make polygon", "merge 9 11", "make circle", "make circle", "merge 11 12", "make polygon", "make polygon", "make polygon", "merge 14 12", "make arc", "make polygon", "merge 13 12", "make arc", "merge 15 12", "make polygon" };
    int sel = 12;
    assertArrayEquals(new int[] { 0, 0, 1 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case48() {
    String[] commands = { "make polygon", "make circle", "make circle", "make polygon", "merge 2 1", "make circle", "make circle", "make polygon", "make arc", "make polygon", "merge 7 5", "make arc", "merge 4 6", "merge 5 0", "make polygon", "delete 0", "merge 1 3", "make circle", "make circle", "make circle", "merge 6 0", "make circle", "merge 0 3", "make arc", "make arc", "make arc", "split 3", "merge 3 9", "make polygon", "make circle", "make arc", "make arc", "make polygon", "merge 8 10", "merge 12 9", "split 13", "merge 9 11", "make arc", "make circle", "make circle", "merge 10 13", "make arc", "make circle", "merge 11 13", "split 14", "make circle", "merge 13 14", "make arc", "make circle", "make arc" };
    int sel = 15;
    assertArrayEquals(new int[] { 0, 1, 0 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case49() {
    String[] commands = { "make circle", "make circle", "make arc", "merge 0 2", "make arc", "merge 1 2", "make polygon", "make polygon", "make arc", "make circle", "make circle", "merge 2 5", "merge 3 6", "make circle", "merge 5 4", "make arc", "make polygon", "merge 4 6", "make polygon", "make circle", "merge 6 7", "make circle", "make circle", "make arc", "make circle", "merge 8 9", "merge 7 10", "make polygon", "make arc", "make arc", "merge 11 9", "make arc", "make circle", "split 9", "merge 12 9", "make arc", "merge 9 10", "make polygon", "make arc", "make circle", "merge 10 14", "make circle", "split 13", "merge 14 13", "make polygon", "make polygon", "merge 15 13", "make polygon", "make circle", "merge 13 16" };
    int sel = 6;
    assertArrayEquals(new int[] { 0, 1, 1 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case50() {
    String[] commands = { "make polygon", "make circle", "merge 1 0", "make circle", "make circle", "merge 0 2", "make circle", "make polygon", "merge 2 3", "make arc", "make polygon", "split 3", "merge 4 3", "make polygon", "make polygon", "merge 3 5", "make circle", "make circle", "merge 6 5", "make arc", "make arc", "merge 7 5", "make polygon", "make circle", "split 8", "make arc", "split 8", "merge 8 9", "make circle", "make polygon", "merge 10 5", "make arc", "merge 9 5", "make polygon", "make arc", "merge 11 5", "make circle", "make circle", "merge 5 12", "make polygon", "make polygon", "merge 12 13", "make arc", "split 13", "make arc", "make circle", "make circle", "merge 14 13", "make arc", "make circle" };
    int sel = 16;
    assertArrayEquals(new int[] { 0, 1, 0 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case51() {
    String[] commands = { "make polygon", "make circle", "make polygon", "merge 0 1", "merge 2 0", "split 2" };
    int sel = 0;
    assertArrayEquals(new int[] { 0, 1, 0 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case52() {
    String[] commands = { "make circle", "make circle", "make arc", "merge 2 1", "delete 0", "split 2", "delete 0", "make polygon" };
    int sel = 0;
    assertArrayEquals(new int[] { 0, 0, 1 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case53() {
    String[] commands = { "make circle", "make circle", "make arc", "merge 2 1", "delete 0", "split 2", "delete 0", "make polygon" };
    int sel = 2;
    assertArrayEquals(new int[] {  }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case54() {
    String[] commands = { "make arc" };
    int sel = 999;
    assertArrayEquals(new int[] {  }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case55() {
    String[] commands = { "make polygon", "make polygon", "make arc", "make circle", "make circle", "delete 3", "make polygon", "make arc", "make arc", "merge 1 3", "merge 1 4", "merge 2 1", "make arc", "make arc", "make circle", "make circle", "merge 6 5", "split 6", "merge 2 1" };
    int sel = 2;
    assertArrayEquals(new int[] { 2, 1, 2 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case56() {
    String[] commands = { "make polygon", "make polygon", "make arc", "make circle", "make circle", "delete 3", "make polygon", "make arc", "make arc", "merge 1 3", "merge 1 4", "merge 2 1", "make arc", "make arc", "make circle", "make circle", "merge 6 5", "split 6", "merge 2 1" };
    int sel = 2;
    assertArrayEquals(new int[] { 2, 1, 2 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case57() {
    String[] commands = { "make polygon", "make circle", "make polygon", "merge 0 1", "merge 2 0", "split 2" };
    int sel = 0;
    assertArrayEquals(new int[] { 0, 1, 0 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case58() {
    String[] commands = { "make circle", "make circle", "make arc", "merge 2 1", "delete 0", "split 2", "delete 0", "make polygon" };
    int sel = 2;
    assertArrayEquals(new int[] {  }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case59() {
    String[] commands = { "make polygon", "make circle", "make polygon", "merge 0 1", "merge 2 0", "split 2" };
    int sel = 2;
    assertArrayEquals(new int[] { 0, 0, 1 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case60() {
    String[] commands = { "make arc", "split 0" };
    int sel = 0;
    assertArrayEquals(new int[] { 1, 0, 0 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case61() {
    String[] commands = { "make polygon", "make circle", "make polygon", "split 0" };
    int sel = 3;
    assertArrayEquals(new int[] {  }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case62() {
    String[] commands = { "make arc", "make arc", "split 0" };
    int sel = 2;
    assertArrayEquals(new int[] {  }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case63() {
    String[] commands = { "make arc", "make circle", "make polygon", "merge 0 1", "split 0" };
    int sel = 0;
    assertArrayEquals(new int[] { 1, 0, 0 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case64() {
    String[] commands = { "make polygon", "make circle", "make arc", "merge 1 2", "split 1" };
    int sel = 1;
    assertArrayEquals(new int[] { 1, 0, 0 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case65() {
    String[] commands = { "make polygon", "make circle", "make polygon", "make arc", "make arc", "make polygon", "make circle", "merge 2 5", "merge 2 6", "split 2" };
    int sel = 2;
    assertArrayEquals(new int[] { 0, 1, 0 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case66() {
    String[] commands = { "make circle", "split 0" };
    int sel = 0;
    assertArrayEquals(new int[] { 0, 1, 0 }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case67() {
    String[] commands = { "make arc" };
    int sel = 999;
    assertArrayEquals(new int[] {  }, grafixglobs.execute(commands, sel));
  }

  @Test
  public void case68() {
    String[] commands = { "make arc", "make polygon", "make circle", "merge 0 2", "split 0" };
    int sel = 0;
    assertArrayEquals(new int[] { 1, 0, 0 }, grafixglobs.execute(commands, sel));
  }

}
