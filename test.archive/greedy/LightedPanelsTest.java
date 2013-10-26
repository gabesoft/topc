package topc.test.greedy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.greedy.*;

public class LightedPanelsTest {
  LightedPanels lightedpanels = new LightedPanels();

  @Test
  public void case1() {
    String[] board = { "*****", "*...*", "*...*", "*...*", "*****" };
    assertEquals(1, lightedpanels.minTouch(board));
  }

  @Test
  public void case2() {
    String[] board = { ".*" };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case3() {
    String[] board = { "**.", "**.", "..." };
    assertEquals(2, lightedpanels.minTouch(board));
  }

  @Test
  public void case4() {
    String[] board = { 
        "*.*.*", 
        "*.*.*", 
        "....." };
    assertEquals(5, lightedpanels.minTouch(board));
  }

  @Test
  public void case5() {
    String[] board = { "..", ".*", "**", "*." };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case6() {
    String[] board = { "........", "........", "........", "........", "........", "........", "........", "........" };
    assertEquals(9, lightedpanels.minTouch(board));
  }

  @Test
  public void case7() {
    String[] board = { "*.*.*.*.", ".*.*.*.*", "*.*.*.*.", ".*.*.*.*", "*.*.*.*.", ".*.*.*.*", "*.*.*.*.", ".*.*.*.*" };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case8() {
    String[] board = { "****", "*..*", ".***", "...*" };
    assertEquals(15, lightedpanels.minTouch(board));
  }

  @Test
  public void case9() {
    String[] board = { "......*", ".*.....", ".......", ".......", "..**...", "......*", "*.....*" };
    assertEquals(32, lightedpanels.minTouch(board));
  }

  @Test
  public void case10() {
    String[] board = { "*******", "*.....*", "*.....*", "*.....*", "*.....*", "*.....*", "*******" };
    assertEquals(49, lightedpanels.minTouch(board));
  }

  @Test
  public void case11() {
    String[] board = { ".*.*.*", "******", "....**", ".*.*.*" };
    assertEquals(10, lightedpanels.minTouch(board));
  }

  @Test
  public void case12() {
    String[] board = { ".*.*.*.*", "********", "*.*.*.**", "**..**..", "****..**", "..**..**", "*..*****" };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case13() {
    String[] board = { "....**", "****..", "****..", "..****", "******", ".****.", "....**", "******" };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case14() {
    String[] board = { "**..**", "**..**", "******", "......" };
    assertEquals(6, lightedpanels.minTouch(board));
  }

  @Test
  public void case15() {
    String[] board = { "........", "********", "........", "********" };
    assertEquals(9, lightedpanels.minTouch(board));
  }

  @Test
  public void case16() {
    String[] board = { "." };
    assertEquals(1, lightedpanels.minTouch(board));
  }

  @Test
  public void case17() {
    String[] board = { "*" };
    assertEquals(0, lightedpanels.minTouch(board));
  }

  @Test
  public void case18() {
    String[] board = { "*.", "*.", "**", "**", "..", "*." };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case19() {
    String[] board = { "....*.", "*..*..", "..***." };
    assertEquals(12, lightedpanels.minTouch(board));
  }

  @Test
  public void case20() {
    String[] board = { "**", "..", "**" };
    assertEquals(3, lightedpanels.minTouch(board));
  }

  @Test
  public void case21() {
    String[] board = { "*...*", ".*...", "..*.*", "*...*", ".....", "*.*.*" };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case22() {
    String[] board = { ".*....", "......", "**...*", "*..***", "*..**.", "****..", "*.*.**" };
    assertEquals(27, lightedpanels.minTouch(board));
  }

  @Test
  public void case23() {
    String[] board = { "**..*.*", "*...*.*", ".**.***", "*.**..." };
    assertEquals(12, lightedpanels.minTouch(board));
  }

  @Test
  public void case24() {
    String[] board = { "*", "*", "*", "*" };
    assertEquals(0, lightedpanels.minTouch(board));
  }

  @Test
  public void case25() {
    String[] board = { "*...." };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case26() {
    String[] board = { "*..*" };
    assertEquals(4, lightedpanels.minTouch(board));
  }

  @Test
  public void case27() {
    String[] board = { ".*.", "...", "***", ".**" };
    assertEquals(8, lightedpanels.minTouch(board));
  }

  @Test
  public void case28() {
    String[] board = { ".***", ".*..", "*..*", "**.*" };
    assertEquals(7, lightedpanels.minTouch(board));
  }

  @Test
  public void case29() {
    String[] board = { ".*....", "..*.*.", "...*.*", "..*.*." };
    assertEquals(14, lightedpanels.minTouch(board));
  }

  @Test
  public void case30() {
    String[] board = { "..", ".*", ".*", "..", "**" };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case31() {
    String[] board = { "**...*", "..*..*", "*...**", "*.***.", "**.*.*", "**..*.", "*...**" };
    assertEquals(13, lightedpanels.minTouch(board));
  }

  @Test
  public void case32() {
    String[] board = { "*.**", "...*", "*..*", ".*..", ".*..", "..**" };
    assertEquals(15, lightedpanels.minTouch(board));
  }

  @Test
  public void case33() {
    String[] board = { ".*.." };
    assertEquals(2, lightedpanels.minTouch(board));
  }

  @Test
  public void case34() {
    String[] board = { ".**....", "..*****" };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case35() {
    String[] board = { "..*", "*.." };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case36() {
    String[] board = { ".***.*.", "....*.*", "...*...", "**...**", "****.**" };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case37() {
    String[] board = { ".***", "**.*", "*..*", "..*.", "*..." };
    assertEquals(7, lightedpanels.minTouch(board));
  }

  @Test
  public void case38() {
    String[] board = { "*...", "**..", "..**", "...*" };
    assertEquals(10, lightedpanels.minTouch(board));
  }

  @Test
  public void case39() {
    String[] board = { "....*" };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case40() {
    String[] board = { "**", ".*" };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case41() {
    String[] board = { ".*" };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case42() {
    String[] board = { "***.**" };
    assertEquals(2, lightedpanels.minTouch(board));
  }

  @Test
  public void case43() {
    String[] board = { "*....*" };
    assertEquals(6, lightedpanels.minTouch(board));
  }

  @Test
  public void case44() {
    String[] board = { "..*", "*.*" };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case45() {
    String[] board = { ".****" };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case46() {
    String[] board = { ".**.", "*.*." };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case47() {
    String[] board = { "*", ".", "*", ".", ".", "*" };
    assertEquals(4, lightedpanels.minTouch(board));
  }

  @Test
  public void case48() {
    String[] board = { ".**.*.", ".*****", "*.**.*", "******" };
    assertEquals(12, lightedpanels.minTouch(board));
  }

  @Test
  public void case49() {
    String[] board = { "..*", ".*.", ".*.", "**.", "*.." };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case50() {
    String[] board = { ".**..", "...**" };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case51() {
    String[] board = { "**", "**" };
    assertEquals(0, lightedpanels.minTouch(board));
  }

  @Test
  public void case52() {
    String[] board = { ".*", "*.", "*.", "*.", "*.", ".." };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case53() {
    String[] board = { "..**..", "*...**" };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case54() {
    String[] board = { "*****", "**...", "*..*.", "**.**", "*.*.." };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case55() {
    String[] board = { "*..*..", "..*...", "**..*." };
    assertEquals(10, lightedpanels.minTouch(board));
  }

  @Test
  public void case56() {
    String[] board = { ".", ".", "*", ".", "*", "*", "." };
    assertEquals(3, lightedpanels.minTouch(board));
  }

  @Test
  public void case57() {
    String[] board = { ".**", "..*", "**." };
    assertEquals(5, lightedpanels.minTouch(board));
  }

  @Test
  public void case58() {
    String[] board = { ".*..*..", "*.*****", "*..*..*", "...*.*.", "*.*****", "*.***.*", ".**..*." };
    assertEquals(24, lightedpanels.minTouch(board));
  }

  @Test
  public void case59() {
    String[] board = { ".*.", ".**", ".**", "*.*", "***", ".**" };
    assertEquals(10, lightedpanels.minTouch(board));
  }

  @Test
  public void case60() {
    String[] board = { "*.", "*." };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case61() {
    String[] board = { "....", "**.*", "***.", "*..*", ".*.*", ".**." };
    assertEquals(11, lightedpanels.minTouch(board));
  }

  @Test
  public void case62() {
    String[] board = { "***.*..", ".*****.", "...*..*", "*....*.", ".*.*.*.", "...*...", ".*.*..." };
    assertEquals(26, lightedpanels.minTouch(board));
  }

  @Test
  public void case63() {
    String[] board = { "*", "*", "*", "*", "*", ".", "." };
    assertEquals(1, lightedpanels.minTouch(board));
  }

  @Test
  public void case64() {
    String[] board = { ".***.", "**..*", "**..*", "..*..", "*...*", ".*.*." };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case65() {
    String[] board = { "..*.*.*" };
    assertEquals(4, lightedpanels.minTouch(board));
  }

  @Test
  public void case66() {
    String[] board = { "*.", "*.", "..", "*.", "*.", "**" };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case67() {
    String[] board = { ".*" };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case68() {
    String[] board = { ".", ".", "*", "*" };
    assertEquals(1, lightedpanels.minTouch(board));
  }

  @Test
  public void case69() {
    String[] board = { "*****." };
    assertEquals(4, lightedpanels.minTouch(board));
  }

  @Test
  public void case70() {
    String[] board = { "*...", "****", "***.", "...." };
    assertEquals(7, lightedpanels.minTouch(board));
  }

  @Test
  public void case71() {
    String[] board = { ".*.*.." };
    assertEquals(3, lightedpanels.minTouch(board));
  }

  @Test
  public void case72() {
    String[] board = { ".*.", "*.*", ".**", "*..", "..*", "*.*", "*.*" };
    assertEquals(10, lightedpanels.minTouch(board));
  }

  @Test
  public void case73() {
    String[] board = { "..**.", "..*..", "*****" };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case74() {
    String[] board = { ".", "*", "*", "*", ".", "." };
    assertEquals(3, lightedpanels.minTouch(board));
  }

  @Test
  public void case75() {
    String[] board = { "***", "*..", "**.", "**.", "***", "*..", "..." };
    assertEquals(13, lightedpanels.minTouch(board));
  }

  @Test
  public void case76() {
    String[] board = { ".....*", "***.**", ".***..", "....**" };
    assertEquals(13, lightedpanels.minTouch(board));
  }

  @Test
  public void case77() {
    String[] board = { "***.." };
    assertEquals(1, lightedpanels.minTouch(board));
  }

  @Test
  public void case78() {
    String[] board = { ".**.**..", "*****...", "..*.***.", "..****..", ".**...*.", "*...**..", ".**.*...", "*.*...*." };
    assertEquals(24, lightedpanels.minTouch(board));
  }

  @Test
  public void case79() {
    String[] board = { "*..**..", "***..*.", "*.*****", ".*..***", "*.*.***", "..*.***", ".*...**", "**.**.*" };
    assertEquals(31, lightedpanels.minTouch(board));
  }

  @Test
  public void case80() {
    String[] board = { ".*...**.", "********", "***.***.", "*..****.", "*.*...*.", "..*..***" };
    assertEquals(27, lightedpanels.minTouch(board));
  }

  @Test
  public void case81() {
    String[] board = { "**.**", "*...*", "...**", ".***.", "*.*.*", "***..", "**...", ".*..*" };
    assertEquals(16, lightedpanels.minTouch(board));
  }

  @Test
  public void case82() {
    String[] board = { "**...***", "*.*....*", "*.*..**.", "..*...**" };
    assertEquals(19, lightedpanels.minTouch(board));
  }

  @Test
  public void case83() {
    String[] board = { "***", "*.*", "***", "...", "...", "***", ".*.", "..." };
    assertEquals(15, lightedpanels.minTouch(board));
  }

  @Test
  public void case84() {
    String[] board = { ".*.****.", ".*.****." };
    assertEquals(5, lightedpanels.minTouch(board));
  }

  @Test
  public void case85() {
    String[] board = { "*", ".", "*", ".", ".", ".", "*", "." };
    assertEquals(5, lightedpanels.minTouch(board));
  }

  @Test
  public void case86() {
    String[] board = { "..*..", "*.*.*", "*.*.*", "*..*.", "*..*.", "*..*.", "*****" };
    assertEquals(20, lightedpanels.minTouch(board));
  }

  @Test
  public void case87() {
    String[] board = { "*.....*", "*.....*" };
    assertEquals(7, lightedpanels.minTouch(board));
  }

  @Test
  public void case88() {
    String[] board = { "*", ".", ".", ".", ".", ".", "*" };
    assertEquals(7, lightedpanels.minTouch(board));
  }

  @Test
  public void case89() {
    String[] board = { ".....", "*.*.*", "*.*.*", ".*.*.", "*.*.*", "*****" };
    assertEquals(18, lightedpanels.minTouch(board));
  }

  @Test
  public void case90() {
    String[] board = { "*.*.*", ".....", "*.*.*", ".....", "*.*.*" };
    assertEquals(9, lightedpanels.minTouch(board));
  }

  @Test
  public void case91() {
    String[] board = { "*****", ".***.", "*...*", "..*.." };
    assertEquals(12, lightedpanels.minTouch(board));
  }

  @Test
  public void case92() {
    String[] board = { ".*.", "...", ".*.", "...", ".*." };
    assertEquals(9, lightedpanels.minTouch(board));
  }

  @Test
  public void case93() {
    String[] board = { "**", "..", "**", "..", "**" };
    assertEquals(3, lightedpanels.minTouch(board));
  }

  @Test
  public void case94() {
    String[] board = { ".*.*." };
    assertEquals(3, lightedpanels.minTouch(board));
  }

  @Test
  public void case95() {
    String[] board = { "..", ".." };
    assertEquals(1, lightedpanels.minTouch(board));
  }

  @Test
  public void case96() {
    String[] board = { "*****", "*...*", "*...*", "*...*", "*****" };
    assertEquals(1, lightedpanels.minTouch(board));
  }

  @Test
  public void case97() {
    String[] board = { "*...", "**..", "..**", "...*" };
    assertEquals(10, lightedpanels.minTouch(board));
  }

  @Test
  public void case98() {
    String[] board = { "*...**.*", "**....**", "..*..***", "..**...*", "*...**.*", "**....**", "..*..***", "..**...*" };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case99() {
    String[] board = { "**.*.*.*", ".*.*..*.", "..**.**.", "*..*.*.*", ".*.**..*", "***.*..*", "..**..**", "..**.**." };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case100() {
    String[] board = { ".*" };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case101() {
    String[] board = { "........", "........", "........", "........", "........", "........", "........", "........" };
    assertEquals(9, lightedpanels.minTouch(board));
  }

  @Test
  public void case102() {
    String[] board = { ".*******", "********", "********", "********", "********", "********", "********", "********" };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case103() {
    String[] board = { "*..*.*.*", ".*.*.*.*", "..*.*.*.", "*..**.**", "*...****", ".*.*.*.*", "*.*.*.*.", "****..**" };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case104() {
    String[] board = { ".*.*.*.*", "*.*.*.*.", ".*.*.*.*", "*.*.*.*.", ".*.*.*.*", "*.*.*.*.", ".*.*.*.*", "*.*.*.*." };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case105() {
    String[] board = { "***...*.", ".***...*", "********", ".......*", "****....", "********", "........", "***...**" };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case106() {
    String[] board = { "**.*****", ".****.**", "**.*...*", "**.***.*", "****.***", "**..**.*", "..**.*.*", "***.****" };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case107() {
    String[] board = { "**.**...", "*..**..*", "......**", "**.**...", "...*..**", "**.***.*", "*****...", "...***.." };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case108() {
    String[] board = { "*..***.*", ".**...*.", "*.*.*.*.", "....****", "**..*..*", "****.**.", "********", "..**..*." };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case109() {
    String[] board = { "*...*", "**...", "..**.", "...*.", "*...*", "**...", "..**." };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

  @Test
  public void case110() {
    String[] board = { "*.*.*.*.", "*.*.*.*.", "*.*.*.*.", "*.*.*.*.", "*.*.*.*.", "*.*.*.*.", "*.*.*.*." };
    assertEquals(-1, lightedpanels.minTouch(board));
  }

}
