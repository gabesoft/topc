package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class BishopMoveTest {
  BishopMove bishopmove = new BishopMove();

  @Test
  public void case1() {
    int r1 = 4;
    int c1 = 6;
    int r2 = 7;
    int c2 = 3;
    assertEquals(1, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case2() {
    int r1 = 2;
    int c1 = 5;
    int r2 = 2;
    int c2 = 5;
    assertEquals(0, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case3() {
    int r1 = 1;
    int c1 = 3;
    int r2 = 5;
    int c2 = 5;
    assertEquals(2, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case4() {
    int r1 = 4;
    int c1 = 6;
    int r2 = 7;
    int c2 = 4;
    assertEquals(-1, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case5() {
    int r1 = 2;
    int c1 = 1;
    int r2 = 7;
    int c2 = 6;
    assertEquals(1, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case6() {
    int r1 = 1;
    int c1 = 2;
    int r2 = 1;
    int c2 = 4;
    assertEquals(2, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case7() {
    int r1 = 7;
    int c1 = 0;
    int r2 = 1;
    int c2 = 6;
    assertEquals(1, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case8() {
    int r1 = 0;
    int c1 = 0;
    int r2 = 1;
    int c2 = 6;
    assertEquals(-1, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case9() {
    int r1 = 0;
    int c1 = 7;
    int r2 = 2;
    int c2 = 5;
    assertEquals(1, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case10() {
    int r1 = 7;
    int c1 = 0;
    int r2 = 2;
    int c2 = 7;
    assertEquals(2, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case11() {
    int r1 = 3;
    int c1 = 3;
    int r2 = 2;
    int c2 = 6;
    assertEquals(2, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case12() {
    int r1 = 0;
    int c1 = 3;
    int r2 = 1;
    int c2 = 5;
    assertEquals(-1, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case13() {
    int r1 = 5;
    int c1 = 1;
    int r2 = 4;
    int c2 = 0;
    assertEquals(1, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case14() {
    int r1 = 0;
    int c1 = 0;
    int r2 = 0;
    int c2 = 6;
    assertEquals(2, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case15() {
    int r1 = 2;
    int c1 = 6;
    int r2 = 5;
    int c2 = 3;
    assertEquals(1, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case16() {
    int r1 = 1;
    int c1 = 3;
    int r2 = 1;
    int c2 = 5;
    assertEquals(2, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case17() {
    int r1 = 1;
    int c1 = 1;
    int r2 = 1;
    int c2 = 1;
    assertEquals(0, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case18() {
    int r1 = 1;
    int c1 = 2;
    int r2 = 1;
    int c2 = 2;
    assertEquals(0, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case19() {
    int r1 = 0;
    int c1 = 0;
    int r2 = 1;
    int c2 = 1;
    assertEquals(1, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case20() {
    int r1 = 1;
    int c1 = 1;
    int r2 = 0;
    int c2 = 2;
    assertEquals(1, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case21() {
    int r1 = 7;
    int c1 = 6;
    int r2 = 4;
    int c2 = 3;
    assertEquals(1, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case22() {
    int r1 = 1;
    int c1 = 1;
    int r2 = 1;
    int c2 = 4;
    assertEquals(-1, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case23() {
    int r1 = 2;
    int c1 = 6;
    int r2 = 1;
    int c2 = 3;
    assertEquals(2, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case24() {
    int r1 = 1;
    int c1 = 3;
    int r2 = 5;
    int c2 = 3;
    assertEquals(2, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case25() {
    int r1 = 0;
    int c1 = 1;
    int r2 = 0;
    int c2 = 3;
    assertEquals(2, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case26() {
    int r1 = 5;
    int c1 = 4;
    int r2 = 6;
    int c2 = 5;
    assertEquals(1, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case27() {
    int r1 = 6;
    int c1 = 0;
    int r2 = 0;
    int c2 = 0;
    assertEquals(2, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case28() {
    int r1 = 1;
    int c1 = 1;
    int r2 = 2;
    int c2 = 2;
    assertEquals(1, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case29() {
    int r1 = 1;
    int c1 = 7;
    int r2 = 2;
    int c2 = 5;
    assertEquals(-1, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case30() {
    int r1 = 1;
    int c1 = 1;
    int r2 = 1;
    int c2 = 7;
    assertEquals(2, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case31() {
    int r1 = 0;
    int c1 = 0;
    int r2 = 6;
    int c2 = 6;
    assertEquals(1, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case32() {
    int r1 = 0;
    int c1 = 2;
    int r2 = 4;
    int c2 = 1;
    assertEquals(-1, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case33() {
    int r1 = 0;
    int c1 = 0;
    int r2 = 3;
    int c2 = 1;
    assertEquals(2, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case34() {
    int r1 = 0;
    int c1 = 0;
    int r2 = 2;
    int c2 = 0;
    assertEquals(2, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case35() {
    int r1 = 3;
    int c1 = 5;
    int r2 = 4;
    int c2 = 7;
    assertEquals(-1, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case36() {
    int r1 = 1;
    int c1 = 2;
    int r2 = 0;
    int c2 = 5;
    assertEquals(2, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case37() {
    int r1 = 1;
    int c1 = 1;
    int r2 = 7;
    int c2 = 3;
    assertEquals(2, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case38() {
    int r1 = 2;
    int c1 = 1;
    int r2 = 1;
    int c2 = 2;
    assertEquals(1, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case39() {
    int r1 = 2;
    int c1 = 2;
    int r2 = 3;
    int c2 = 4;
    assertEquals(-1, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case40() {
    int r1 = 6;
    int c1 = 6;
    int r2 = 1;
    int c2 = 6;
    assertEquals(-1, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case41() {
    int r1 = 3;
    int c1 = 4;
    int r2 = 5;
    int c2 = 6;
    assertEquals(1, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case42() {
    int r1 = 1;
    int c1 = 2;
    int r2 = 4;
    int c2 = 3;
    assertEquals(2, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case43() {
    int r1 = 2;
    int c1 = 2;
    int r2 = 2;
    int c2 = 2;
    assertEquals(0, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case44() {
    int r1 = 1;
    int c1 = 2;
    int r2 = 3;
    int c2 = 2;
    assertEquals(2, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case45() {
    int r1 = 7;
    int c1 = 7;
    int r2 = 0;
    int c2 = 0;
    assertEquals(1, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case46() {
    int r1 = 3;
    int c1 = 5;
    int r2 = 7;
    int c2 = 3;
    assertEquals(2, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case47() {
    int r1 = 2;
    int c1 = 2;
    int r2 = 4;
    int c2 = 2;
    assertEquals(2, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case48() {
    int r1 = 0;
    int c1 = 0;
    int r2 = 7;
    int c2 = 7;
    assertEquals(1, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case49() {
    int r1 = 0;
    int c1 = 0;
    int r2 = 0;
    int c2 = 1;
    assertEquals(-1, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case50() {
    int r1 = 1;
    int c1 = 4;
    int r2 = 4;
    int c2 = 5;
    assertEquals(2, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case51() {
    int r1 = 0;
    int c1 = 2;
    int r2 = 2;
    int c2 = 2;
    assertEquals(2, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case52() {
    int r1 = 1;
    int c1 = 2;
    int r2 = 7;
    int c2 = 6;
    assertEquals(2, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case53() {
    int r1 = 0;
    int c1 = 0;
    int r2 = 0;
    int c2 = 2;
    assertEquals(2, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case54() {
    int r1 = 3;
    int c1 = 1;
    int r2 = 0;
    int c2 = 2;
    assertEquals(2, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case55() {
    int r1 = 2;
    int c1 = 1;
    int r2 = 3;
    int c2 = 2;
    assertEquals(1, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case56() {
    int r1 = 3;
    int c1 = 3;
    int r2 = 4;
    int c2 = 3;
    assertEquals(-1, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case57() {
    int r1 = 3;
    int c1 = 1;
    int r2 = 1;
    int c2 = 1;
    assertEquals(2, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case58() {
    int r1 = 0;
    int c1 = 0;
    int r2 = 4;
    int c2 = 6;
    assertEquals(2, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case59() {
    int r1 = 2;
    int c1 = 1;
    int r2 = 5;
    int c2 = 6;
    assertEquals(2, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case60() {
    int r1 = 1;
    int c1 = 1;
    int r2 = 7;
    int c2 = 7;
    assertEquals(1, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case61() {
    int r1 = 2;
    int c1 = 5;
    int r2 = 3;
    int c2 = 2;
    assertEquals(2, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

  @Test
  public void case62() {
    int r1 = 0;
    int c1 = 1;
    int r2 = 0;
    int c2 = 7;
    assertEquals(2, bishopmove.howManyMoves(r1, c1, r2, c2));
  }

}
