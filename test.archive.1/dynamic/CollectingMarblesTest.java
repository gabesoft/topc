package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class CollectingMarblesTest {
  CollectingMarbles collectingmarbles = new CollectingMarbles();

  @Test
  public void case1() {
    int[] marblesWeights = { 2, 2, 2, 2, 2 };
    int bagCapacity = 5;
    int numberOfBags = 2;
    assertEquals(4, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case2() {
    int[] marblesWeights = { 1, 3, 5, 2, 4 };
    int bagCapacity = 5;
    int numberOfBags = 2;
    assertEquals(4, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case3() {
    int[] marblesWeights = { 7, 6, 6, 5 };
    int bagCapacity = 12;
    int numberOfBags = 2;
    assertEquals(4, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case4() {
    int[] marblesWeights = { 2, 2, 2 };
    int bagCapacity = 1;
    int numberOfBags = 10;
    assertEquals(0, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case5() {
    int[] marblesWeights = { 9, 10, 2, 8, 9 };
    int bagCapacity = 10;
    int numberOfBags = 5;
    assertEquals(5, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case6() {
    int[] marblesWeights = { 9, 6, 7, 1, 10 };
    int bagCapacity = 5;
    int numberOfBags = 3;
    assertEquals(1, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case7() {
    int[] marblesWeights = { 6, 2, 7, 8, 6 };
    int bagCapacity = 19;
    int numberOfBags = 1;
    assertEquals(3, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case8() {
    int[] marblesWeights = { 1, 2, 2, 2, 10 };
    int bagCapacity = 7;
    int numberOfBags = 1;
    assertEquals(4, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case9() {
    int[] marblesWeights = { 8, 3, 3, 4, 7 };
    int bagCapacity = 10;
    int numberOfBags = 2;
    assertEquals(4, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case10() {
    int[] marblesWeights = { 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6 };
    int bagCapacity = 9;
    int numberOfBags = 3;
    assertEquals(7, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case11() {
    int[] marblesWeights = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
    int bagCapacity = 20;
    int numberOfBags = 3;
    assertEquals(3, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case12() {
    int[] marblesWeights = { 7, 11, 7, 7, 11, 13, 14, 7, 11 };
    int bagCapacity = 18;
    int numberOfBags = 3;
    assertEquals(6, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case13() {
    int[] marblesWeights = { 2, 9, 4, 9, 2, 2, 1, 5, 2, 8, 5, 3 };
    int bagCapacity = 8;
    int numberOfBags = 3;
    assertEquals(8, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case14() {
    int[] marblesWeights = { 7, 15, 15, 15, 3, 15, 9, 4, 3, 7, 12, 3 };
    int bagCapacity = 15;
    int numberOfBags = 2;
    assertEquals(6, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case15() {
    int[] marblesWeights = { 11, 8, 9, 12, 4, 12, 2, 14, 2, 5, 12, 15 };
    int bagCapacity = 13;
    int numberOfBags = 8;
    assertEquals(10, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case16() {
    int[] marblesWeights = { 15, 12, 14, 9, 3, 8, 12, 12, 4, 1, 15, 6 };
    int bagCapacity = 15;
    int numberOfBags = 5;
    assertEquals(9, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case17() {
    int[] marblesWeights = { 2, 10, 3, 15, 6, 14, 13, 7, 14, 10, 6, 5 };
    int bagCapacity = 19;
    int numberOfBags = 4;
    assertEquals(10, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case18() {
    int[] marblesWeights = { 5, 15, 3, 1, 12, 4, 2, 11, 4, 8, 11, 6, 1 };
    int bagCapacity = 3;
    int numberOfBags = 7;
    assertEquals(4, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case19() {
    int[] marblesWeights = { 12, 7, 1, 1, 8, 6, 2, 13, 2, 14, 8, 6 };
    int bagCapacity = 13;
    int numberOfBags = 9;
    assertEquals(11, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case20() {
    int[] marblesWeights = { 13, 10, 13, 14, 6, 11, 11, 14, 11, 11, 15, 1, 7 };
    int bagCapacity = 18;
    int numberOfBags = 6;
    assertEquals(9, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case21() {
    int[] marblesWeights = { 3, 14, 10, 10, 6, 8, 1, 10, 10, 7, 15, 12, 11 };
    int bagCapacity = 10;
    int numberOfBags = 4;
    assertEquals(6, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case22() {
    int[] marblesWeights = { 10, 6, 11, 1, 2, 12, 6, 9, 10, 4, 3, 12 };
    int bagCapacity = 18;
    int numberOfBags = 2;
    assertEquals(7, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case23() {
    int[] marblesWeights = { 4, 6, 10, 9, 2, 13, 4, 15, 5, 4, 5, 11 };
    int bagCapacity = 11;
    int numberOfBags = 3;
    assertEquals(7, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case24() {
    int[] marblesWeights = { 13, 14, 5, 7, 6, 12, 12, 2, 7, 5, 1, 11 };
    int bagCapacity = 5;
    int numberOfBags = 6;
    assertEquals(4, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case25() {
    int[] marblesWeights = { 4, 3, 8, 3, 14, 12, 2, 3, 5, 3, 8 };
    int bagCapacity = 4;
    int numberOfBags = 6;
    assertEquals(6, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case26() {
    int[] marblesWeights = { 14, 1, 3, 2, 11, 3, 4, 5, 5, 14, 6, 15 };
    int bagCapacity = 13;
    int numberOfBags = 2;
    assertEquals(7, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case27() {
    int[] marblesWeights = { 2, 6, 1, 6, 11, 3, 10, 6, 10, 5, 12, 15 };
    int bagCapacity = 14;
    int numberOfBags = 5;
    assertEquals(10, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case28() {
    int[] marblesWeights = { 8, 8, 9, 15, 11, 19, 14, 1, 6, 14, 8, 10, 7 };
    int bagCapacity = 11;
    int numberOfBags = 1;
    assertEquals(2, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case29() {
    int[] marblesWeights = { 13, 1, 10, 3, 4, 4, 9, 13, 4, 13, 11, 11, 11 };
    int bagCapacity = 6;
    int numberOfBags = 10;
    assertEquals(5, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case30() {
    int[] marblesWeights = { 3, 8, 6, 13, 7, 4, 13, 5, 1, 10, 1, 5 };
    int bagCapacity = 15;
    int numberOfBags = 5;
    assertEquals(11, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case31() {
    int[] marblesWeights = { 14, 6, 3, 3, 4, 7, 8, 14, 9, 4, 1, 11 };
    int bagCapacity = 18;
    int numberOfBags = 2;
    assertEquals(8, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case32() {
    int[] marblesWeights = { 8, 10, 9, 2, 3, 9, 3, 3, 5, 5, 5, 3 };
    int bagCapacity = 10;
    int numberOfBags = 5;
    assertEquals(10, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case33() {
    int[] marblesWeights = { 9, 12, 8, 16, 11, 7, 15, 16, 8, 1, 7, 19 };
    int bagCapacity = 10;
    int numberOfBags = 9;
    assertEquals(6, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case34() {
    int[] marblesWeights = { 8, 15, 15, 7, 19, 5, 11, 17, 12, 4, 16, 13 };
    int bagCapacity = 14;
    int numberOfBags = 4;
    assertEquals(6, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case35() {
    int[] marblesWeights = { 8, 17, 9, 2, 13, 17, 14, 20, 4, 15, 4, 2 };
    int bagCapacity = 17;
    int numberOfBags = 5;
    assertEquals(9, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case36() {
    int[] marblesWeights = { 20, 20, 16, 12, 19, 12, 14, 7, 16, 17, 2, 8 };
    int bagCapacity = 10;
    int numberOfBags = 8;
    assertEquals(3, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case37() {
    int[] marblesWeights = { 9, 12, 13, 14, 11, 9, 20, 8, 15, 14, 4, 8 };
    int bagCapacity = 12;
    int numberOfBags = 4;
    assertEquals(5, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case38() {
    int[] marblesWeights = { 11, 4, 4, 5, 2, 19, 13, 3, 18, 4, 11, 5 };
    int bagCapacity = 13;
    int numberOfBags = 6;
    assertEquals(10, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case39() {
    int[] marblesWeights = { 18, 16, 12, 18, 15, 6, 11, 10, 14, 17, 15, 13 };
    int bagCapacity = 13;
    int numberOfBags = 5;
    assertEquals(5, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case40() {
    int[] marblesWeights = { 19, 6, 1, 12, 1, 11, 7, 11, 15, 9, 10, 19 };
    int bagCapacity = 16;
    int numberOfBags = 1;
    assertEquals(4, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case41() {
    int[] marblesWeights = { 13, 7, 19, 16, 17, 4, 12, 11, 16, 14, 18, 10 };
    int bagCapacity = 13;
    int numberOfBags = 4;
    assertEquals(5, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case42() {
    int[] marblesWeights = { 12, 20, 2, 18, 10, 8, 18, 12, 6, 3, 13, 14 };
    int bagCapacity = 12;
    int numberOfBags = 4;
    assertEquals(6, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case43() {
    int[] marblesWeights = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2 };
    int bagCapacity = 20;
    int numberOfBags = 10;
    assertEquals(12, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case44() {
    int[] marblesWeights = { 4, 4, 5, 5, 10, 12 };
    int bagCapacity = 20;
    int numberOfBags = 2;
    assertEquals(6, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case45() {
    int[] marblesWeights = { 4, 4, 5, 5, 10, 12, 4, 4, 5, 5, 10, 12, 13 };
    int bagCapacity = 20;
    int numberOfBags = 4;
    assertEquals(12, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case46() {
    int[] marblesWeights = { 9, 11, 10, 10, 8, 12, 20, 20, 20, 20, 20, 20, 20 };
    int bagCapacity = 20;
    int numberOfBags = 10;
    assertEquals(13, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case47() {
    int[] marblesWeights = { 1 };
    int bagCapacity = 1;
    int numberOfBags = 1;
    assertEquals(1, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case48() {
    int[] marblesWeights = { 20 };
    int bagCapacity = 1;
    int numberOfBags = 1;
    assertEquals(0, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case49() {
    int[] marblesWeights = { 1 };
    int bagCapacity = 20;
    int numberOfBags = 1;
    assertEquals(1, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case50() {
    int[] marblesWeights = { 1, 2, 4, 1, 2, 2, 3, 1, 4, 4, 2, 5, 3 };
    int bagCapacity = 20;
    int numberOfBags = 10;
    assertEquals(13, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case51() {
    int[] marblesWeights = { 11, 11, 8, 13, 7, 10, 12, 9, 14, 6, 6, 10, 6 };
    int bagCapacity = 20;
    int numberOfBags = 10;
    assertEquals(13, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case52() {
    int[] marblesWeights = { 5, 7, 3, 6, 3, 5, 8, 5 };
    int bagCapacity = 17;
    int numberOfBags = 2;
    assertEquals(7, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case53() {
    int[] marblesWeights = { 4, 7, 7, 7, 4, 4, 4, 6, 4, 4, 7 };
    int bagCapacity = 15;
    int numberOfBags = 4;
    assertEquals(11, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case54() {
    int[] marblesWeights = { 12, 12, 2, 17, 9, 10, 17, 13, 3, 7, 11, 5, 7 };
    int bagCapacity = 18;
    int numberOfBags = 3;
    assertEquals(8, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case55() {
    int[] marblesWeights = { 4, 9, 8, 5, 6, 6, 4, 4, 9, 8, 6, 5 };
    int bagCapacity = 14;
    int numberOfBags = 4;
    assertEquals(10, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case56() {
    int[] marblesWeights = { 3, 2, 2, 3, 3, 2, 2, 3, 2, 3, 2, 3 };
    int bagCapacity = 9;
    int numberOfBags = 2;
    assertEquals(8, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case57() {
    int[] marblesWeights = { 6, 9, 5, 7, 9, 7, 11, 3, 3, 8, 7, 11, 5 };
    int bagCapacity = 16;
    int numberOfBags = 5;
    assertEquals(12, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case58() {
    int[] marblesWeights = { 12, 11, 8, 4, 3, 3, 3, 15, 9, 9, 15, 4 };
    int bagCapacity = 17;
    int numberOfBags = 6;
    assertEquals(12, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case59() {
    int[] marblesWeights = { 2, 2, 2, 2, 3, 6, 5, 6, 6, 2, 5, 3, 2 };
    int bagCapacity = 7;
    int numberOfBags = 7;
    assertEquals(13, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case60() {
    int[] marblesWeights = { 17, 4, 15, 8, 5, 14, 11, 5, 6, 17, 4, 14, 7 };
    int bagCapacity = 17;
    int numberOfBags = 8;
    assertEquals(13, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case61() {
    int[] marblesWeights = { 2, 9, 3, 12, 7, 11, 6, 10, 4, 10, 3, 5 };
    int bagCapacity = 10;
    int numberOfBags = 3;
    assertEquals(7, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case62() {
    int[] marblesWeights = { 6, 11, 13, 19, 11, 5, 2, 14, 7, 10, 15, 15 };
    int bagCapacity = 20;
    int numberOfBags = 4;
    assertEquals(8, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case63() {
    int[] marblesWeights = { 4, 10, 3, 10, 10, 4, 7, 5, 9, 5, 10 };
    int bagCapacity = 18;
    int numberOfBags = 5;
    assertEquals(11, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case64() {
    int[] marblesWeights = { 8, 4, 7, 12, 4, 12, 3, 12, 11, 13 };
    int bagCapacity = 16;
    int numberOfBags = 6;
    assertEquals(10, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case65() {
    int[] marblesWeights = { 4, 4, 1, 1, 3, 2, 2, 3, 4, 4, 4, 4, 1 };
    int bagCapacity = 6;
    int numberOfBags = 7;
    assertEquals(13, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case66() {
    int[] marblesWeights = { 4, 9, 8, 9, 8, 5, 5, 4, 9, 7, 7, 9 };
    int bagCapacity = 13;
    int numberOfBags = 8;
    assertEquals(12, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case67() {
    int[] marblesWeights = { 17, 13, 9, 14, 10, 6, 5, 14, 4, 14, 9, 11, 12 };
    int bagCapacity = 18;
    int numberOfBags = 9;
    assertEquals(13, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case68() {
    int[] marblesWeights = { 13, 10, 5, 13, 11, 10, 9, 11, 5, 12, 5, 7, 11 };
    int bagCapacity = 15;
    int numberOfBags = 10;
    assertEquals(13, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case69() {
    int[] marblesWeights = { 8, 3, 3, 10, 5, 9, 7, 5, 3, 5 };
    int bagCapacity = 9;
    int numberOfBags = 3;
    assertEquals(6, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case70() {
    int[] marblesWeights = { 8, 7, 6, 8, 5, 5, 7, 6, 7, 8 };
    int bagCapacity = 18;
    int numberOfBags = 4;
    assertEquals(10, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case71() {
    int[] marblesWeights = { 8, 6, 8, 7, 5, 5, 6, 6, 5, 6, 4, 7, 6 };
    int bagCapacity = 17;
    int numberOfBags = 5;
    assertEquals(13, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case72() {
    int[] marblesWeights = { 6, 7, 4, 8, 7, 9, 9, 11, 4, 7, 3, 6 };
    int bagCapacity = 14;
    int numberOfBags = 6;
    assertEquals(12, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case73() {
    int[] marblesWeights = { 7, 8, 8, 12, 5, 14, 14, 5, 14, 11, 11 };
    int bagCapacity = 18;
    int numberOfBags = 7;
    assertEquals(11, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case74() {
    int[] marblesWeights = { 9, 4, 5, 5, 15, 9, 7, 15, 9, 11, 16, 16 };
    int bagCapacity = 17;
    int numberOfBags = 8;
    assertEquals(12, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case75() {
    int[] marblesWeights = { 8, 17, 14, 11, 5, 14, 16, 6, 17, 11, 7, 10, 14 };
    int bagCapacity = 20;
    int numberOfBags = 9;
    assertEquals(13, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case76() {
    int[] marblesWeights = { 14, 13, 5, 9, 13, 9, 14, 7, 5, 5, 12, 11, 13 };
    int bagCapacity = 15;
    int numberOfBags = 10;
    assertEquals(13, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case77() {
    int[] marblesWeights = { 14, 13, 12, 14, 14, 14, 13, 12, 14, 14, 14, 13, 14 };
    int bagCapacity = 20;
    int numberOfBags = 10;
    assertEquals(10, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case78() {
    int[] marblesWeights = { 1, 1, 1, 1, 1, 1, 1, 19, 19, 19, 19, 19, 19 };
    int bagCapacity = 20;
    int numberOfBags = 10;
    assertEquals(13, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case79() {
    int[] marblesWeights = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
    int bagCapacity = 4;
    int numberOfBags = 10;
    assertEquals(13, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case80() {
    int[] marblesWeights = { 1, 3, 5, 2, 4 };
    int bagCapacity = 5;
    int numberOfBags = 2;
    assertEquals(4, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case81() {
    int[] marblesWeights = { 2, 2, 2 };
    int bagCapacity = 1;
    int numberOfBags = 10;
    assertEquals(0, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case82() {
    int[] marblesWeights = { 1, 4, 8, 10, 9, 6, 5, 4, 3, 8, 6, 7 };
    int bagCapacity = 10;
    int numberOfBags = 6;
    assertEquals(10, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case83() {
    int[] marblesWeights = { 4, 7, 19, 16, 14, 16, 7, 13, 10, 2, 3, 8, 11 };
    int bagCapacity = 20;
    int numberOfBags = 8;
    assertEquals(13, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case84() {
    int[] marblesWeights = { 1, 2, 3, 4, 4 };
    int bagCapacity = 7;
    int numberOfBags = 2;
    assertEquals(5, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case85() {
    int[] marblesWeights = { 1, 2, 3, 4, 6, 1, 10, 10, 9, 10, 14, 15, 16 };
    int bagCapacity = 20;
    int numberOfBags = 6;
    assertEquals(13, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case86() {
    int[] marblesWeights = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
    int bagCapacity = 20;
    int numberOfBags = 10;
    assertEquals(13, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case87() {
    int[] marblesWeights = { 3, 1, 7, 4, 8, 2, 1, 4, 4, 11, 5, 11, 8 };
    int bagCapacity = 12;
    int numberOfBags = 3;
    assertEquals(9, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case88() {
    int[] marblesWeights = { 2, 6, 7, 7, 8, 9, 10, 2, 1, 11 };
    int bagCapacity = 11;
    int numberOfBags = 5;
    assertEquals(8, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case89() {
    int[] marblesWeights = { 1, 3, 5, 2, 7, 9, 11, 13, 15, 17 };
    int bagCapacity = 16;
    int numberOfBags = 3;
    assertEquals(7, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case90() {
    int[] marblesWeights = { 1, 11, 12, 4, 7, 5, 13, 1 };
    int bagCapacity = 10;
    int numberOfBags = 1;
    assertEquals(3, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case91() {
    int[] marblesWeights = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
    int bagCapacity = 15;
    int numberOfBags = 3;
    assertEquals(9, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case92() {
    int[] marblesWeights = { 3, 5, 6, 7, 4, 1, 8, 7, 2, 17, 10, 11, 10 };
    int bagCapacity = 8;
    int numberOfBags = 5;
    assertEquals(8, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case93() {
    int[] marblesWeights = { 5, 3, 2, 2, 1 };
    int bagCapacity = 3;
    int numberOfBags = 10;
    assertEquals(4, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case94() {
    int[] marblesWeights = { 7, 4, 9, 2, 3, 6 };
    int bagCapacity = 5;
    int numberOfBags = 4;
    assertEquals(3, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case95() {
    int[] marblesWeights = { 1, 2, 3, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
    int bagCapacity = 6;
    int numberOfBags = 3;
    assertEquals(3, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case96() {
    int[] marblesWeights = { 1, 2, 3, 4, 5, 6, 7, 9, 11, 13, 14, 15, 20 };
    int bagCapacity = 7;
    int numberOfBags = 3;
    assertEquals(6, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case97() {
    int[] marblesWeights = { 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2 };
    int bagCapacity = 3;
    int numberOfBags = 6;
    assertEquals(12, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case98() {
    int[] marblesWeights = { 1, 1, 2, 3 };
    int bagCapacity = 3;
    int numberOfBags = 2;
    assertEquals(3, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case99() {
    int[] marblesWeights = { 8, 2, 2, 2 };
    int bagCapacity = 10;
    int numberOfBags = 1;
    assertEquals(3, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case100() {
    int[] marblesWeights = { 1, 1, 1, 2, 2, 2 };
    int bagCapacity = 3;
    int numberOfBags = 3;
    assertEquals(6, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case101() {
    int[] marblesWeights = { 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20 };
    int bagCapacity = 20;
    int numberOfBags = 10;
    assertEquals(10, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case102() {
    int[] marblesWeights = { 6, 4, 3 };
    int bagCapacity = 8;
    int numberOfBags = 1;
    assertEquals(2, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case103() {
    int[] marblesWeights = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
    int bagCapacity = 20;
    int numberOfBags = 10;
    assertEquals(13, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case104() {
    int[] marblesWeights = { 18, 10, 4, 7, 2, 9, 4, 7, 14, 19, 16, 13, 11 };
    int bagCapacity = 15;
    int numberOfBags = 10;
    assertEquals(10, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case105() {
    int[] marblesWeights = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
    int bagCapacity = 13;
    int numberOfBags = 6;
    assertEquals(12, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case106() {
    int[] marblesWeights = { 4, 11, 15, 8, 9, 17, 20, 14, 7, 6, 5, 19, 16 };
    int bagCapacity = 19;
    int numberOfBags = 6;
    assertEquals(10, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case107() {
    int[] marblesWeights = { 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1 };
    int bagCapacity = 20;
    int numberOfBags = 1;
    assertEquals(12, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case108() {
    int[] marblesWeights = { 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
    int bagCapacity = 20;
    int numberOfBags = 10;
    assertEquals(12, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case109() {
    int[] marblesWeights = { 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8 };
    int bagCapacity = 18;
    int numberOfBags = 10;
    assertEquals(11, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case110() {
    int[] marblesWeights = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 3, 5 };
    int bagCapacity = 20;
    int numberOfBags = 10;
    assertEquals(13, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case111() {
    int[] marblesWeights = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
    int bagCapacity = 7;
    int numberOfBags = 3;
    assertEquals(6, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case112() {
    int[] marblesWeights = { 1, 2, 3, 4, 5, 4, 4, 6, 5, 4, 5, 5, 6 };
    int bagCapacity = 8;
    int numberOfBags = 3;
    assertEquals(7, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case113() {
    int[] marblesWeights = { 1, 1, 1, 1, 1, 5, 5 };
    int bagCapacity = 5;
    int numberOfBags = 2;
    assertEquals(6, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case114() {
    int[] marblesWeights = { 5, 3, 2, 4, 4, 2 };
    int bagCapacity = 10;
    int numberOfBags = 2;
    assertEquals(6, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case115() {
    int[] marblesWeights = { 2, 2, 2, 2, 2, 2, 2, 1, 2, 3, 2, 4, 2 };
    int bagCapacity = 4;
    int numberOfBags = 7;
    assertEquals(13, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case116() {
    int[] marblesWeights = { 5, 3, 2, 2, 1, 4, 1, 2, 3, 4, 1, 3, 2 };
    int bagCapacity = 20;
    int numberOfBags = 10;
    assertEquals(13, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case117() {
    int[] marblesWeights = { 20, 19, 18, 17, 16, 15, 15, 14, 13, 12, 13, 1, 5 };
    int bagCapacity = 20;
    int numberOfBags = 10;
    assertEquals(12, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case118() {
    int[] marblesWeights = { 1, 4, 5, 5, 7 };
    int bagCapacity = 11;
    int numberOfBags = 2;
    assertEquals(5, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case119() {
    int[] marblesWeights = { 5, 3, 2, 2, 2, 2, 2 };
    int bagCapacity = 9;
    int numberOfBags = 2;
    assertEquals(7, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case120() {
    int[] marblesWeights = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    int bagCapacity = 20;
    int numberOfBags = 10;
    assertEquals(13, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

  @Test
  public void case121() {
    int[] marblesWeights = { 1, 2, 3, 4, 1, 3, 4, 2, 3, 1, 4, 2, 3 };
    int bagCapacity = 20;
    int numberOfBags = 10;
    assertEquals(13, collectingmarbles.mostMarbles(marblesWeights, bagCapacity, numberOfBags));
  }

}
