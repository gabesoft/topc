package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class PrisonCellsTest {
  PrisonCells prisoncells = new PrisonCells();

  @Test
  public void case1() {
    int m = 3;
    int n = 4;
    int nr = 2;
    assertEquals(5, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case2() {
    int m = 4;
    int n = 4;
    int nr = 3;
    assertEquals(4, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case3() {
    int m = 4;
    int n = 4;
    int nr = 4;
    assertEquals(3, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case4() {
    int m = 4;
    int n = 4;
    int nr = 16;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case5() {
    int m = 1;
    int n = 2;
    int nr = 2;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case6() {
    int m = 1;
    int n = 3;
    int nr = 2;
    assertEquals(2, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case7() {
    int m = 1;
    int n = 3;
    int nr = 3;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case8() {
    int m = 1;
    int n = 4;
    int nr = 2;
    assertEquals(3, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case9() {
    int m = 1;
    int n = 4;
    int nr = 3;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case10() {
    int m = 1;
    int n = 4;
    int nr = 4;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case11() {
    int m = 2;
    int n = 1;
    int nr = 2;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case12() {
    int m = 2;
    int n = 2;
    int nr = 2;
    assertEquals(2, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case13() {
    int m = 2;
    int n = 2;
    int nr = 3;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case14() {
    int m = 2;
    int n = 2;
    int nr = 4;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case15() {
    int m = 2;
    int n = 3;
    int nr = 2;
    assertEquals(3, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case16() {
    int m = 2;
    int n = 3;
    int nr = 3;
    assertEquals(2, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case17() {
    int m = 2;
    int n = 3;
    int nr = 4;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case18() {
    int m = 2;
    int n = 3;
    int nr = 5;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case19() {
    int m = 2;
    int n = 3;
    int nr = 6;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case20() {
    int m = 2;
    int n = 4;
    int nr = 2;
    assertEquals(4, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case21() {
    int m = 2;
    int n = 4;
    int nr = 3;
    assertEquals(2, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case22() {
    int m = 2;
    int n = 4;
    int nr = 4;
    assertEquals(2, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case23() {
    int m = 2;
    int n = 4;
    int nr = 5;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case24() {
    int m = 2;
    int n = 4;
    int nr = 6;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case25() {
    int m = 2;
    int n = 4;
    int nr = 7;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case26() {
    int m = 2;
    int n = 4;
    int nr = 8;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case27() {
    int m = 3;
    int n = 1;
    int nr = 2;
    assertEquals(2, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case28() {
    int m = 3;
    int n = 1;
    int nr = 3;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case29() {
    int m = 3;
    int n = 2;
    int nr = 2;
    assertEquals(3, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case30() {
    int m = 3;
    int n = 2;
    int nr = 3;
    assertEquals(2, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case31() {
    int m = 3;
    int n = 2;
    int nr = 4;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case32() {
    int m = 3;
    int n = 2;
    int nr = 5;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case33() {
    int m = 3;
    int n = 2;
    int nr = 6;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case34() {
    int m = 3;
    int n = 3;
    int nr = 3;
    assertEquals(2, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case35() {
    int m = 3;
    int n = 3;
    int nr = 4;
    assertEquals(2, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case36() {
    int m = 3;
    int n = 3;
    int nr = 5;
    assertEquals(2, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case37() {
    int m = 3;
    int n = 3;
    int nr = 6;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case38() {
    int m = 3;
    int n = 3;
    int nr = 7;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case39() {
    int m = 3;
    int n = 3;
    int nr = 8;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case40() {
    int m = 3;
    int n = 3;
    int nr = 9;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case41() {
    int m = 3;
    int n = 4;
    int nr = 2;
    assertEquals(5, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case42() {
    int m = 3;
    int n = 4;
    int nr = 4;
    assertEquals(2, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case43() {
    int m = 3;
    int n = 4;
    int nr = 5;
    assertEquals(2, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case44() {
    int m = 3;
    int n = 4;
    int nr = 6;
    assertEquals(2, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case45() {
    int m = 3;
    int n = 4;
    int nr = 7;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case46() {
    int m = 3;
    int n = 4;
    int nr = 8;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case47() {
    int m = 3;
    int n = 4;
    int nr = 9;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case48() {
    int m = 3;
    int n = 4;
    int nr = 10;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case49() {
    int m = 3;
    int n = 4;
    int nr = 11;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case50() {
    int m = 3;
    int n = 4;
    int nr = 12;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case51() {
    int m = 4;
    int n = 1;
    int nr = 2;
    assertEquals(3, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case52() {
    int m = 4;
    int n = 1;
    int nr = 3;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case53() {
    int m = 4;
    int n = 1;
    int nr = 4;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case54() {
    int m = 4;
    int n = 2;
    int nr = 2;
    assertEquals(4, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case55() {
    int m = 4;
    int n = 2;
    int nr = 3;
    assertEquals(2, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case56() {
    int m = 4;
    int n = 2;
    int nr = 4;
    assertEquals(2, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case57() {
    int m = 4;
    int n = 2;
    int nr = 5;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case58() {
    int m = 4;
    int n = 2;
    int nr = 6;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case59() {
    int m = 4;
    int n = 2;
    int nr = 7;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case60() {
    int m = 4;
    int n = 2;
    int nr = 8;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case61() {
    int m = 4;
    int n = 3;
    int nr = 2;
    assertEquals(5, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case62() {
    int m = 4;
    int n = 3;
    int nr = 3;
    assertEquals(3, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case63() {
    int m = 4;
    int n = 3;
    int nr = 4;
    assertEquals(2, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case64() {
    int m = 4;
    int n = 3;
    int nr = 5;
    assertEquals(2, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case65() {
    int m = 4;
    int n = 3;
    int nr = 6;
    assertEquals(2, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case66() {
    int m = 4;
    int n = 3;
    int nr = 7;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case67() {
    int m = 4;
    int n = 3;
    int nr = 8;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case68() {
    int m = 4;
    int n = 3;
    int nr = 9;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case69() {
    int m = 4;
    int n = 3;
    int nr = 10;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case70() {
    int m = 4;
    int n = 3;
    int nr = 11;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case71() {
    int m = 4;
    int n = 3;
    int nr = 12;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case72() {
    int m = 4;
    int n = 4;
    int nr = 2;
    assertEquals(6, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case73() {
    int m = 4;
    int n = 4;
    int nr = 3;
    assertEquals(4, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case74() {
    int m = 4;
    int n = 4;
    int nr = 5;
    assertEquals(2, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case75() {
    int m = 4;
    int n = 4;
    int nr = 6;
    assertEquals(2, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case76() {
    int m = 4;
    int n = 4;
    int nr = 7;
    assertEquals(2, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case77() {
    int m = 4;
    int n = 4;
    int nr = 8;
    assertEquals(2, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case78() {
    int m = 4;
    int n = 4;
    int nr = 9;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case79() {
    int m = 4;
    int n = 4;
    int nr = 11;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case80() {
    int m = 4;
    int n = 4;
    int nr = 12;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case81() {
    int m = 4;
    int n = 4;
    int nr = 13;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case82() {
    int m = 4;
    int n = 4;
    int nr = 14;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case83() {
    int m = 4;
    int n = 4;
    int nr = 15;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case84() {
    int m = 4;
    int n = 4;
    int nr = 10;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case85() {
    int m = 4;
    int n = 4;
    int nr = 4;
    assertEquals(3, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case86() {
    int m = 4;
    int n = 4;
    int nr = 16;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case87() {
    int m = 2;
    int n = 2;
    int nr = 2;
    assertEquals(2, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case88() {
    int m = 3;
    int n = 3;
    int nr = 2;
    assertEquals(4, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case89() {
    int m = 2;
    int n = 2;
    int nr = 3;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case90() {
    int m = 1;
    int n = 4;
    int nr = 2;
    assertEquals(3, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case91() {
    int m = 4;
    int n = 4;
    int nr = 3;
    assertEquals(4, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case92() {
    int m = 2;
    int n = 3;
    int nr = 4;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case93() {
    int m = 2;
    int n = 4;
    int nr = 3;
    assertEquals(2, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case94() {
    int m = 4;
    int n = 4;
    int nr = 11;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case95() {
    int m = 4;
    int n = 4;
    int nr = 8;
    assertEquals(2, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case96() {
    int m = 1;
    int n = 4;
    int nr = 3;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case97() {
    int m = 4;
    int n = 4;
    int nr = 7;
    assertEquals(2, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case98() {
    int m = 1;
    int n = 4;
    int nr = 4;
    assertEquals(1, prisoncells.scatter(m, n, nr));
  }

  @Test
  public void case99() {
    int m = 2;
    int n = 3;
    int nr = 2;
    assertEquals(3, prisoncells.scatter(m, n, nr));
  }

}
