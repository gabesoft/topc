package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class LeftAndRightHandedDiv2Test {
  LeftAndRightHandedDiv2 leftandrighthandeddiv2 = new LeftAndRightHandedDiv2();

  @Test
  public void case1() {
    String S = "L";
    assertEquals(0, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case2() {
    String S = "RRR";
    assertEquals(0, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case3() {
    String S = "LLLRRR";
    assertEquals(0, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case4() {
    String S = "LRLRLR";
    assertEquals(2, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case5() {
    String S = "RLRLRL";
    assertEquals(3, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case6() {
    String S = "R";
    assertEquals(0, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case7() {
    String S = "LRRRRLLRRLRLRRLLLLLRLRRLLLRRRRLLLR";
    assertEquals(7, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case8() {
    String S = "RLRLRRRRLRLLRLRLRL";
    assertEquals(7, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case9() {
    String S = "RLLLRRR";
    assertEquals(1, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case10() {
    String S = "RLRLRRRLRLRLRLLRLRLLLLLRRLRLLLLRLLL";
    assertEquals(11, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case11() {
    String S = "RRLLLRRRLRLLLRLLRRRLRLRRRRRRRRRRLRRLRLRRLLRLR";
    assertEquals(11, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case12() {
    String S = "RLLL";
    assertEquals(1, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case13() {
    String S = "LRLRLRLRRRRLLLRL";
    assertEquals(5, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case14() {
    String S = "LLLLLRLRRRRRLLRRLRRLRLRRRRRLLRRLRLLRRRLLLLLL";
    assertEquals(9, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case15() {
    String S = "RRRLLRLRLRLRLLRRLLRLLLRRRLLRLLRRLLLLRLR";
    assertEquals(11, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case16() {
    String S = "RL";
    assertEquals(1, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case17() {
    String S = "RLLLLLRLLLLLRLLLLLRRLLRRRRLRL";
    assertEquals(6, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case18() {
    String S = "RRRRLRRRLLR";
    assertEquals(2, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case19() {
    String S = "LLLLLLLLRRLRLRLLLRRLLLRLRRL";
    assertEquals(6, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case20() {
    String S = "RRRRLRRLRRLRLLLLLLRLRL";
    assertEquals(6, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case21() {
    String S = "LLLLRRLRLLLRLLLLRRRLLRLLRRRLLRLLRLR";
    assertEquals(8, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case22() {
    String S = "RRLRRL";
    assertEquals(2, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case23() {
    String S = "RLLLLLRLLLRLLLLLLRLRRRLLLRL";
    assertEquals(6, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case24() {
    String S = "RLLLRRLRRRRRLLRLLRL";
    assertEquals(5, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case25() {
    String S = "RLLLRLLL";
    assertEquals(2, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case26() {
    String S = "LLLLLRRRRLLRLRRLRRRLRLRRLRRL";
    assertEquals(7, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case27() {
    String S = "RRRRLLRRRRLLRRLRLLLRRLLRLLRRRRRLRLRR";
    assertEquals(8, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case28() {
    String S = "LLLRLLRLLLLLLLLLLRLLRLRLRRRRLLLRLLL";
    assertEquals(7, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case29() {
    String S = "LRRLRRLRRLLLLLLRLLRRRRRLRRRLRR";
    assertEquals(6, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case30() {
    String S = "RRLRLRRLRLLRLLRRRRLLRRRRRLLRRRLLLLRRRRRL";
    assertEquals(9, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case31() {
    String S = "RRRRRLLLLRRLLLRRLLLLLRLLLRRRLLLRRRRLRRRLLL";
    assertEquals(7, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case32() {
    String S = "RRRLRRLRRRLRLRLRLLL";
    assertEquals(6, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case33() {
    String S = "LRLLRLRRLLRRRLRLRLLLRLRRRRRRLRRLLRLRRLLLLRRRRRRLRR";
    assertEquals(12, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case34() {
    String S = "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL";
    assertEquals(0, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case35() {
    String S = "RLRLRLRLRLRLRLRLRLRLRLRLRLRLRLRLRLRLRLRLRLRLRLRLRL";
    assertEquals(25, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case36() {
    String S = "LLLLLLLLLLLLLLLLLLLLLLLLLRRRRRRRRRRRRRRRRRRRRRRRRR";
    assertEquals(0, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case37() {
    String S = "RRRLRLLRLLLLR";
    assertEquals(3, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case38() {
    String S = "LRLRLRRLRLLLLLL";
    assertEquals(4, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case39() {
    String S = "RRRL";
    assertEquals(1, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case40() {
    String S = "RRL";
    assertEquals(1, leftandrighthandeddiv2.count(S));
  }

  @Test
  public void case41() {
    String S = "RRLL";
    assertEquals(1, leftandrighthandeddiv2.count(S));
  }

}
