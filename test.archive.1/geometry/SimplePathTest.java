package topc.test.geometry;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.geometry.*;

public class SimplePathTest {
  SimplePath simplepath = new SimplePath();

  @Test
  public void case1() {
    String direction = "NWSEEN";
    int[] length = { 5, 5, 3, 2, 5, 2 };
    assertEquals(0, simplepath.trouble(direction, length));
  }

  @Test
  public void case2() {
    String direction = "NWWS";
    int[] length = { 10, 3, 7, 10 };
    assertEquals(-1, simplepath.trouble(direction, length));
  }

  @Test
  public void case3() {
    String direction = "NWES";
    int[] length = { 2, 2, 1, 2 };
    assertEquals(1, simplepath.trouble(direction, length));
  }

  @Test
  public void case4() {
    String direction = "NWSE";
    int[] length = { 100, 100, 100, 100 };
    assertEquals(0, simplepath.trouble(direction, length));
  }

  @Test
  public void case5() {
    String direction = "NNNNNNNNNNNNNNNNNNNN";
    int[] length = { 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1 };
    assertEquals(-1, simplepath.trouble(direction, length));
  }

  @Test
  public void case6() {
    String direction = "NNNNNNNNNNNNNNNNNNSN";
    int[] length = { 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1 };
    assertEquals(17, simplepath.trouble(direction, length));
  }

  @Test
  public void case7() {
    String direction = "ENWSE";
    int[] length = { 5, 2, 19, 2, 19 };
    assertEquals(0, simplepath.trouble(direction, length));
  }

  @Test
  public void case8() {
    String direction = "EN";
    int[] length = { 5, 2 };
    assertEquals(-1, simplepath.trouble(direction, length));
  }

  @Test
  public void case9() {
    String direction = "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW";
    int[] length = { 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000 };
    assertEquals(-1, simplepath.trouble(direction, length));
  }

  @Test
  public void case10() {
    String direction = "ESWNESWNESWNESWNESWNESWNESWNESWNESWNESWNESWNESWN";
    int[] length = { 9950, 9950, 9951, 9951, 9952, 9952, 9953, 9953, 9954, 9954, 9955, 9955, 9956, 9956, 9957, 9957, 9958, 9958, 9959, 9959, 9960, 9960, 9961, 9961, 9962, 9962, 9963, 9963, 9964, 9964, 9965, 9965, 9966, 9966, 9967, 9967, 9968, 9968, 9969, 9969, 9970, 9970, 9971, 9971, 9972, 9972, 9973, 9973 };
    assertEquals(-1, simplepath.trouble(direction, length));
  }

  @Test
  public void case11() {
    String direction = "ESWNESWNESWNESWNESWNESWNESWNESWNESWNESWNESWNESWN";
    int[] length = { 9950, 9950, 9951, 9951, 9952, 9952, 9953, 9953, 9954, 9954, 9955, 9955, 9956, 9956, 9957, 9957, 9958, 9958, 9959, 9959, 9960, 9960, 9961, 9961, 9962, 9962, 9963, 9963, 9964, 9964, 9965, 9965, 9966, 9966, 9967, 9967, 9968, 9968, 9969, 9969, 9970, 9970, 9971, 9970, 9972, 9972, 9973, 9973 };
    assertEquals(39, simplepath.trouble(direction, length));
  }

  @Test
  public void case12() {
    String direction = "ENWNESW";
    int[] length = { 20, 20, 20, 20, 5000, 30, 5000 };
    assertEquals(1, simplepath.trouble(direction, length));
  }

  @Test
  public void case13() {
    String direction = "ENWNESWS";
    int[] length = { 20, 20, 20, 20, 5000, 30, 5000, 10 };
    assertEquals(0, simplepath.trouble(direction, length));
  }

  @Test
  public void case14() {
    String direction = "ENWNESWS";
    int[] length = { 20, 20, 20, 20, 5000, 30, 5000, 5000 };
    assertEquals(0, simplepath.trouble(direction, length));
  }

  @Test
  public void case15() {
    String direction = "NNWSENW";
    int[] length = { 10, 10, 10, 20, 20, 20, 10 };
    assertEquals(0, simplepath.trouble(direction, length));
  }

  @Test
  public void case16() {
    String direction = "NNWSENW";
    int[] length = { 10, 10, 10, 21, 20, 21, 10 };
    assertEquals(1, simplepath.trouble(direction, length));
  }

  @Test
  public void case17() {
    String direction = "NNWSENWE";
    int[] length = { 10, 10, 10, 21, 20, 21, 10, 20 };
    assertEquals(1, simplepath.trouble(direction, length));
  }

  @Test
  public void case18() {
    String direction = "NNWSENW";
    int[] length = { 10, 10, 10, 21, 20, 21, 30 };
    assertEquals(1, simplepath.trouble(direction, length));
  }

  @Test
  public void case19() {
    String direction = "EEEEEW";
    int[] length = { 1, 1, 1, 1, 1, 10 };
    assertEquals(0, simplepath.trouble(direction, length));
  }

  @Test
  public void case20() {
    String direction = "NENENWS";
    int[] length = { 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(2, simplepath.trouble(direction, length));
  }

  @Test
  public void case21() {
    String direction = "NWSE";
    int[] length = { 100, 100, 100, 100 };
    assertEquals(0, simplepath.trouble(direction, length));
  }

  @Test
  public void case22() {
    String direction = "NWES";
    int[] length = { 2, 2, 1, 2 };
    assertEquals(1, simplepath.trouble(direction, length));
  }

  @Test
  public void case23() {
    String direction = "EEEEEW";
    int[] length = { 1, 1, 1, 1, 1, 10 };
    assertEquals(0, simplepath.trouble(direction, length));
  }

  @Test
  public void case24() {
    String direction = "NWSENW";
    int[] length = { 4, 4, 2, 2, 1, 5 };
    assertEquals(2, simplepath.trouble(direction, length));
  }

  @Test
  public void case25() {
    String direction = "NWSEEN";
    int[] length = { 5, 5, 3, 2, 5, 2 };
    assertEquals(0, simplepath.trouble(direction, length));
  }

  @Test
  public void case26() {
    String direction = "EEW";
    int[] length = { 1, 1, 2 };
    assertEquals(0, simplepath.trouble(direction, length));
  }

  @Test
  public void case27() {
    String direction = "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN";
    int[] length = { 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000 };
    assertEquals(-1, simplepath.trouble(direction, length));
  }

  @Test
  public void case28() {
    String direction = "SESWNW";
    int[] length = { 5, 5, 5, 3, 8, 8 };
    assertEquals(0, simplepath.trouble(direction, length));
  }

  @Test
  public void case29() {
    String direction = "NS";
    int[] length = { 1, 1 };
    assertEquals(0, simplepath.trouble(direction, length));
  }

  @Test
  public void case30() {
    String direction = "NENENENENENENENENENENENENENENENENENENENENENENENENE";
    int[] length = { 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000 };
    assertEquals(-1, simplepath.trouble(direction, length));
  }

  @Test
  public void case31() {
    String direction = "EW";
    int[] length = { 2, 1 };
    assertEquals(0, simplepath.trouble(direction, length));
  }

  @Test
  public void case32() {
    String direction = "EW";
    int[] length = { 1, 2 };
    assertEquals(0, simplepath.trouble(direction, length));
  }

}
