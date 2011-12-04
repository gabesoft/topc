package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class ChristmasTreeTest {
  ChristmasTree christmastree = new ChristmasTree();

  @Test
  public void case1() {
    int N = 1;
    int red = 1;
    int green = 2;
    int blue = 0;
    assertEquals(2L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case2() {
    int N = 1;
    int red = 0;
    int green = 0;
    int blue = 0;
    assertEquals(0L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case3() {
    int N = 2;
    int red = 1;
    int green = 1;
    int blue = 1;
    assertEquals(6L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case4() {
    int N = 2;
    int red = 2;
    int green = 1;
    int blue = 0;
    assertEquals(3L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case5() {
    int N = 2;
    int red = 3;
    int green = 0;
    int blue = 0;
    assertEquals(1L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case6() {
    int N = 2;
    int red = 0;
    int green = 3;
    int blue = 0;
    assertEquals(1L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case7() {
    int N = 2;
    int red = 0;
    int green = 0;
    int blue = 3;
    assertEquals(1L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case8() {
    int N = 2;
    int red = 3;
    int green = 3;
    int blue = 3;
    assertEquals(27L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case9() {
    int N = 2;
    int red = 7;
    int green = 1;
    int blue = 0;
    assertEquals(4L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case10() {
    int N = 3;
    int red = 7;
    int green = 1;
    int blue = 0;
    assertEquals(4L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case11() {
    int N = 3;
    int red = 7;
    int green = 1;
    int blue = 1;
    assertEquals(19L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case12() {
    int N = 3;
    int red = 7;
    int green = 4;
    int blue = 3;
    assertEquals(211L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case13() {
    int N = 3;
    int red = 7;
    int green = 7;
    int blue = 7;
    assertEquals(243L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case14() {
    int N = 3;
    int red = 2;
    int green = 2;
    int blue = 1;
    assertEquals(0L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case15() {
    int N = 3;
    int red = 2;
    int green = 2;
    int blue = 2;
    assertEquals(36L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case16() {
    int N = 4;
    int red = 0;
    int green = 10;
    int blue = 0;
    assertEquals(1L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case17() {
    int N = 4;
    int red = 1;
    int green = 10;
    int blue = 1;
    assertEquals(19L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case18() {
    int N = 4;
    int red = 1;
    int green = 8;
    int blue = 1;
    assertEquals(12L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case19() {
    int N = 4;
    int red = 5;
    int green = 8;
    int blue = 0;
    assertEquals(69L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case20() {
    int N = 4;
    int red = 5;
    int green = 8;
    int blue = 5;
    assertEquals(4170L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case21() {
    int N = 4;
    int red = 10;
    int green = 10;
    int blue = 10;
    assertEquals(5103L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case22() {
    int N = 4;
    int red = 5;
    int green = 0;
    int blue = 5;
    assertEquals(18L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case23() {
    int N = 4;
    int red = 5;
    int green = 1;
    int blue = 3;
    assertEquals(0L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case24() {
    int N = 5;
    int red = 7;
    int green = 4;
    int blue = 4;
    assertEquals(258L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case25() {
    int N = 5;
    int red = 15;
    int green = 0;
    int blue = 0;
    assertEquals(1L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case26() {
    int N = 5;
    int red = 14;
    int green = 1;
    int blue = 0;
    assertEquals(3L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case27() {
    int N = 5;
    int red = 14;
    int green = 1;
    int blue = 1;
    assertEquals(18L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case28() {
    int N = 5;
    int red = 4;
    int green = 10;
    int blue = 1;
    assertEquals(141L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case29() {
    int N = 5;
    int red = 4;
    int green = 10;
    int blue = 10;
    assertEquals(7010L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case30() {
    int N = 6;
    int red = 20;
    int green = 20;
    int blue = 20;
    assertEquals(2342274L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case31() {
    int N = 6;
    int red = 20;
    int green = 0;
    int blue = 20;
    assertEquals(5630L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case32() {
    int N = 7;
    int red = 24;
    int green = 3;
    int blue = 1;
    assertEquals(153L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case33() {
    int N = 7;
    int red = 20;
    int green = 3;
    int blue = 5;
    assertEquals(12667L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case34() {
    int N = 8;
    int red = 1;
    int green = 15;
    int blue = 20;
    assertEquals(197121L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case35() {
    int N = 8;
    int red = 13;
    int green = 15;
    int blue = 20;
    assertEquals(519710536L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case36() {
    int N = 9;
    int red = 13;
    int green = 15;
    int blue = 20;
    assertEquals(145192863537L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case37() {
    int N = 9;
    int red = 23;
    int green = 0;
    int blue = 22;
    assertEquals(87463L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case38() {
    int N = 9;
    int red = 23;
    int green = 1;
    int blue = 22;
    assertEquals(795052L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case39() {
    int N = 9;
    int red = 1;
    int green = 43;
    int blue = 1;
    assertEquals(12L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case40() {
    int N = 9;
    int red = 50;
    int green = 50;
    int blue = 50;
    assertEquals(2518971350049L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case41() {
    int N = 10;
    int red = 50;
    int green = 50;
    int blue = 50;
    assertEquals(1911899254684272L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case42() {
    int N = 10;
    int red = 50;
    int green = 5;
    int blue = 0;
    assertEquals(661L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case43() {
    int N = 10;
    int red = 2;
    int green = 3;
    int blue = 50;
    assertEquals(627L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case44() {
    int N = 10;
    int red = 3;
    int green = 3;
    int blue = 49;
    assertEquals(3906L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case45() {
    int N = 10;
    int red = 0;
    int green = 0;
    int blue = 50;
    assertEquals(0L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case46() {
    int N = 10;
    int red = 25;
    int green = 15;
    int blue = 15;
    assertEquals(6125137522902L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case47() {
    int N = 3;
    int red = 4;
    int green = 1;
    int blue = 1;
    assertEquals(12L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case48() {
    int N = 1;
    int red = 12;
    int green = 12;
    int blue = 12;
    assertEquals(3L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case49() {
    int N = 10;
    int red = 50;
    int green = 50;
    int blue = 50;
    assertEquals(1911899254684272L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case50() {
    int N = 6;
    int red = 50;
    int green = 50;
    int blue = 50;
    assertEquals(2342277L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case51() {
    int N = 10;
    int red = 1;
    int green = 1;
    int blue = 1;
    assertEquals(0L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case52() {
    int N = 9;
    int red = 49;
    int green = 49;
    int blue = 49;
    assertEquals(2518971350049L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case53() {
    int N = 2;
    int red = 1;
    int green = 1;
    int blue = 1;
    assertEquals(6L, christmastree.decorationWays(N, red, green, blue));
  }

  @Test
  public void case54() {
    int N = 1;
    int red = 1;
    int green = 1;
    int blue = 1;
    assertEquals(3L, christmastree.decorationWays(N, red, green, blue));
  }

}
