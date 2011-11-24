package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class IncompleteBSTTest {
  IncompleteBST incompletebst = new IncompleteBST();

  @Test
  public void case1() {
    String[] tree = { "A 1", "? 2" };
    assertEquals("A", incompletebst.missingValues(tree));
  }

  @Test
  public void case2() {
    String[] tree = { "B 1", "? 2" };
    assertEquals("AB", incompletebst.missingValues(tree));
  }

  @Test
  public void case3() {
    String[] tree = { "V 1", "? 3" };
    assertEquals("WXYZ", incompletebst.missingValues(tree));
  }

  @Test
  public void case4() {
    String[] tree = { "Z 1", "? 2" };
    assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ", incompletebst.missingValues(tree));
  }

  @Test
  public void case5() {
    String[] tree = { "A 1", "? 3" };
    assertEquals("BCDEFGHIJKLMNOPQRSTUVWXYZ", incompletebst.missingValues(tree));
  }

  @Test
  public void case6() {
    String[] tree = { "K 1", "K 2", "A 6", "? 12", "Y 3" };
    assertEquals("", incompletebst.missingValues(tree));
  }

  @Test
  public void case7() {
    String[] tree = { "D 1", "F 3", "A 2", "X 7", "? 14" };
    assertEquals("GHIJKLMNOPQRSTUVWX", incompletebst.missingValues(tree));
  }

  @Test
  public void case8() {
    String[] tree = { "A 1", "A 2", "? 3" };
    assertEquals("BCDEFGHIJKLMNOPQRSTUVWXYZ", incompletebst.missingValues(tree));
  }

  @Test
  public void case9() {
    String[] tree = { "K 1", "K 2", "K 3", "? 7" };
    assertEquals("", incompletebst.missingValues(tree));
  }

  @Test
  public void case10() {
    String[] tree = { "? 3", "K 1", "K 2", "K 4", "K 8", "K 16", "K 32", "K 64", "K 128" };
    assertEquals("LMNOPQRSTUVWXYZ", incompletebst.missingValues(tree));
  }

  @Test
  public void case11() {
    String[] tree = { "? 9", "K 1", "K 2", "K 4", "K 8", "K 16", "K 32", "K 64", "K 128" };
    assertEquals("", incompletebst.missingValues(tree));
  }

  @Test
  public void case12() {
    String[] tree = { "? 17", "K 1", "K 2", "K 4", "K 8", "K 16", "K 32", "K 64", "K 128" };
    assertEquals("", incompletebst.missingValues(tree));
  }

  @Test
  public void case13() {
    String[] tree = { "? 33", "K 1", "K 2", "K 4", "K 8", "K 16", "K 32", "K 64", "K 128" };
    assertEquals("", incompletebst.missingValues(tree));
  }

  @Test
  public void case14() {
    String[] tree = { "? 65", "K 1", "K 2", "K 4", "K 8", "K 16", "K 32", "K 64", "K 128" };
    assertEquals("", incompletebst.missingValues(tree));
  }

  @Test
  public void case15() {
    String[] tree = { "A 1", "B 3", "? 31", "D 15", "C 7" };
    assertEquals("EFGHIJKLMNOPQRSTUVWXYZ", incompletebst.missingValues(tree));
  }

  @Test
  public void case16() {
    String[] tree = { "Y 3", "C 4", "E 2", "H 1", "? 9", "G 5" };
    assertEquals("DE", incompletebst.missingValues(tree));
  }

  @Test
  public void case17() {
    String[] tree = { "Y 3", "C 4", "E 2", "H 1", "Y 9", "G 5", "? 8" };
    assertEquals("", incompletebst.missingValues(tree));
  }

  @Test
  public void case18() {
    String[] tree = { "E 1", "G 3", "H 7", "? 6", "C 2", "V 15" };
    assertEquals("FG", incompletebst.missingValues(tree));
  }

  @Test
  public void case19() {
    String[] tree = { "E 1", "G 3", "H 7", "? 5", "C 2", "V 15" };
    assertEquals("DE", incompletebst.missingValues(tree));
  }

  @Test
  public void case20() {
    String[] tree = { "E 1", "G 3", "H 7", "C 2", "V 15", "? 14" };
    assertEquals("H", incompletebst.missingValues(tree));
  }

  @Test
  public void case21() {
    String[] tree = { "K 1", "R 3", "J 5", "? 4", "Y 7", "H 2" };
    assertEquals("ABCDEFGH", incompletebst.missingValues(tree));
  }

  @Test
  public void case22() {
    String[] tree = { "K 1", "R 3", "J 5", "? 14", "Y 7", "H 2" };
    assertEquals("STUVWXY", incompletebst.missingValues(tree));
  }

  @Test
  public void case23() {
    String[] tree = { "K 1", "R 3", "J 5", "? 6", "Y 7", "H 2" };
    assertEquals("LMNOPQR", incompletebst.missingValues(tree));
  }

  @Test
  public void case24() {
    String[] tree = { "K 1", "R 3", "J 5", "? 21", "Y 7", "H 2", "I 10" };
    assertEquals("J", incompletebst.missingValues(tree));
  }

  @Test
  public void case25() {
    String[] tree = { "H 2", "U 15", "S 14", "A 8", "N 3", "N 6", "K 5", "A 4", "R 28", "T 7", "? 9", "M 1" };
    assertEquals("BCDEFGH", incompletebst.missingValues(tree));
  }

  @Test
  public void case26() {
    String[] tree = { "H 2", "U 15", "S 14", "M 1", "? 11", "A 8", "N 3", "N 6", "K 5", "A 4", "R 28", "T 7" };
    assertEquals("LM", incompletebst.missingValues(tree));
  }

  @Test
  public void case27() {
    String[] tree = { "? 56", "H 2", "U 15", "S 14", "A 8", "N 3", "N 6", "M 1", "K 5", "A 4", "R 28", "T 7" };
    assertEquals("OPQR", incompletebst.missingValues(tree));
  }

  @Test
  public void case28() {
    String[] tree = { "? 57", "M 1", "H 2", "U 15", "S 14", "A 8", "N 3", "N 6", "K 5", "A 4", "R 28", "T 7" };
    assertEquals("S", incompletebst.missingValues(tree));
  }

  @Test
  public void case29() {
    String[] tree = { "? 57", "M 1", "Z 2", "U 15", "S 14", "A 8", "N 3", "N 6", "K 5", "A 4", "R 28", "T 7" };
    assertEquals("", incompletebst.missingValues(tree));
  }

  @Test
  public void case30() {
    String[] tree = { "? 57", "M 1", "H 2", "U 15", "L 14", "A 8", "N 3", "N 6", "K 5", "A 4", "R 28", "T 7" };
    assertEquals("", incompletebst.missingValues(tree));
  }

  @Test
  public void case31() {
    String[] tree = { "Z 1", "Y 2", "X 4", "W 8", "V 16", "U 32", "T 64", "S 128", "R 256", "Q 512", "P 1024", "O 2048", "N 4096", "M 8192", "L 16384", "K 32768", "J 65536", "? 65537" };
    assertEquals("L", incompletebst.missingValues(tree));
  }

  @Test
  public void case32() {
    String[] tree = { "Z 1", "Y 2", "X 4", "W 8", "V 16", "U 32", "T 64", "S 128", "R 256", "Q 512", "P 1024", "O 2048", "N 4096", "M 8192", "L 16384", "K 32768", "J 65536", "? 131072" };
    assertEquals("ABCDEFGHIJ", incompletebst.missingValues(tree));
  }

  @Test
  public void case33() {
    String[] tree = { "Z 1", "Y 2", "X 4", "W 8", "V 16", "U 32", "T 64", "S 128", "R 256", "Q 512", "P 1024", "O 2048", "N 4096", "M 8192", "L 16384", "K 32768", "J 65536", "? 33" };
    assertEquals("W", incompletebst.missingValues(tree));
  }

  @Test
  public void case34() {
    String[] tree = { "Z 1", "Y 2", "X 4", "W 8", "V 16", "U 32", "T 64", "S 128", "R 256", "Q 512", "P 1024", "O 2048", "N 4096", "M 8192", "L 16384", "K 32768", "J 65536", "? 3" };
    assertEquals("", incompletebst.missingValues(tree));
  }

  @Test
  public void case35() {
    String[] tree = { "Z 1", "Y 2", "X 4", "W 8", "V 16", "U 32", "T 64", "S 128", "R 256", "Q 512", "P 1024", "O 2048", "N 4096", "M 8192", "L 16384", "K 32768", "J 65536", "? 17" };
    assertEquals("X", incompletebst.missingValues(tree));
  }

  @Test
  public void case36() {
    String[] tree = { "R 2", "R 1", "X 3", "R 6", "Z 5", "? 4" };
    assertEquals("", incompletebst.missingValues(tree));
  }

  @Test
  public void case37() {
    String[] tree = { "R 2", "R 1", "X 3", "R 6", "Z 5", "? 13" };
    assertEquals("", incompletebst.missingValues(tree));
  }

  @Test
  public void case38() {
    String[] tree = { "X 3", "V 6", "A 2", "R 1", "J 21", "N 23", "K 11", "C 10", "? 4", "H 5" };
    assertEquals("", incompletebst.missingValues(tree));
  }

  @Test
  public void case39() {
    String[] tree = { "X 3", "V 6", "A 2", "R 1", "J 21", "N 23", "H 5", "K 11", "? 10" };
    assertEquals("", incompletebst.missingValues(tree));
  }

  @Test
  public void case40() {
    String[] tree = { "X 3", "V 6", "H 5", "A 2", "R 1", "J 21", "N 23", "K 11", "C 10", "? 43" };
    assertEquals("", incompletebst.missingValues(tree));
  }

  @Test
  public void case41() {
    String[] tree = { "X 3", "H 5", "V 6", "A 2", "R 1", "J 21", "N 23", "K 11", "C 10", "? 46" };
    assertEquals("", incompletebst.missingValues(tree));
  }

  @Test
  public void case42() {
    String[] tree = { "X 28", "D 152", "H 77", "E 76", "M 79", "L 39", "G 38", "Y 29", "X 14", "K 19", "B 9", "A 8", "Y 7", "R 5", "R 1", "Q 2", "T 3", "A 4", "? 16" };
    assertEquals("A", incompletebst.missingValues(tree));
  }

  @Test
  public void case43() {
    String[] tree = { "X 28", "D 152", "H 77", "E 76", "M 79", "L 39", "G 38", "Y 29", "X 14", "K 19", "B 9", "A 8", "Y 7", "R 5", "R 1", "Q 2", "T 3", "A 4", "? 17" };
    assertEquals("", incompletebst.missingValues(tree));
  }

  @Test
  public void case44() {
    String[] tree = { "X 28", "D 152", "H 77", "E 76", "M 79", "L 39", "G 38", "Y 29", "X 14", "K 19", "B 9", "A 8", "Y 7", "R 5", "R 1", "Q 2", "T 3", "A 4", "? 10" };
    assertEquals("R", incompletebst.missingValues(tree));
  }

  @Test
  public void case45() {
    String[] tree = { "X 28", "D 152", "H 77", "E 76", "M 79", "L 39", "G 38", "Y 29", "X 14", "K 19", "B 9", "A 8", "Y 7", "R 5", "R 1", "Q 2", "T 3", "A 4", "? 11" };
    assertEquals("", incompletebst.missingValues(tree));
  }

  @Test
  public void case46() {
    String[] tree = { "X 28", "D 152", "H 77", "E 76", "M 79", "L 39", "G 38", "Y 29", "X 14", "K 19", "B 9", "A 8", "Y 7", "R 5", "R 1", "Q 2", "T 3", "A 4", "? 153" };
    assertEquals("FG", incompletebst.missingValues(tree));
  }

  @Test
  public void case47() {
    String[] tree = { "X 28", "D 152", "H 77", "E 76", "M 79", "L 39", "G 38", "Y 29", "X 14", "K 19", "B 9", "A 8", "Y 7", "R 5", "R 1", "Q 2", "T 3", "A 4", "? 305" };
    assertEquals("E", incompletebst.missingValues(tree));
  }

  @Test
  public void case48() {
    String[] tree = { "X 28", "D 152", "H 77", "E 76", "M 79", "L 39", "G 38", "Y 29", "X 14", "K 19", "B 9", "A 8", "Y 7", "R 5", "R 1", "Q 2", "T 3", "A 4", "? 58" };
    assertEquals("Y", incompletebst.missingValues(tree));
  }

  @Test
  public void case49() {
    String[] tree = { "X 28", "D 152", "H 77", "E 76", "M 79", "L 39", "G 38", "Y 29", "X 14", "K 19", "? 9", "A 8", "Y 7", "R 5", "R 1", "Q 2", "T 3", "A 4" };
    assertEquals("BC", incompletebst.missingValues(tree));
  }

  @Test
  public void case50() {
    String[] tree = { "? 1", "A 2" };
    assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ", incompletebst.missingValues(tree));
  }

  @Test
  public void case51() {
    String[] tree = { "X 28", "D 152", "H 77", "E 76", "M 79", "L 39", "G 38", "Y 29", "X 14", "K 19", "C 9", "A 8", "Y 7", "R 5", "? 1", "Q 2", "T 3", "A 4" };
    assertEquals("RS", incompletebst.missingValues(tree));
  }

  @Test
  public void case52() {
    String[] tree = { "V 6", "A 2", "? 1", "H 5", "X 3", "J 21", "N 23", "K 11", "C 10", "A 4" };
    assertEquals("", incompletebst.missingValues(tree));
  }

  @Test
  public void case53() {
    String[] tree = { "H 2", "U 15", "S 14", "? 1", "L 11", "A 8", "N 3", "N 6", "K 5", "A 4", "R 28", "T 7" };
    assertEquals("LM", incompletebst.missingValues(tree));
  }

  @Test
  public void case54() {
    String[] tree = { "Z 65", "? 1", "K 2", "K 4", "K 8", "K 16", "K 32", "K 64", "K 128" };
    assertEquals("", incompletebst.missingValues(tree));
  }

  @Test
  public void case55() {
    String[] tree = { "? 1", "G 3", "H 7", "D 5", "C 2", "V 15" };
    assertEquals("DEF", incompletebst.missingValues(tree));
  }

  @Test
  public void case56() {
    String[] tree = { "? 1", "Y 2", "X 4", "W 8", "V 16", "U 32", "T 64", "S 128", "R 256", "Q 512", "P 1024", "O 2048", "N 4096", "M 8192", "L 16384", "K 32768", "J 65536", "L 65537" };
    assertEquals("YZ", incompletebst.missingValues(tree));
  }

  @Test
  public void case57() {
    String[] tree = { "? 1", "Y 2", "X 4", "W 8", "V 16", "U 32", "T 64", "S 128", "R 256", "Q 512", "P 1024", "O 2048", "N 4096", "M 8192", "L 16384", "K 32768", "J 65536", "K 65537" };
    assertEquals("", incompletebst.missingValues(tree));
  }

  @Test
  public void case58() {
    String[] tree = { "? 1" };
    assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ", incompletebst.missingValues(tree));
  }

  @Test
  public void case59() {
    String[] tree = { "Z 1", "Y 2", "X 4", "W 8", "V 16", "U 32", "T 64", "S 128", "R 256", "Q 512", "P 1024", "O 2048", "N 4096", "M 8192", "L 16384", "K 32768", "J 65536", "? 131072" };
    assertEquals("ABCDEFGHIJ", incompletebst.missingValues(tree));
  }

  @Test
  public void case60() {
    String[] tree = { "A 1", "? 2" };
    assertEquals("A", incompletebst.missingValues(tree));
  }

  @Test
  public void case61() {
    String[] tree = { "? 1", "A 2" };
    assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ", incompletebst.missingValues(tree));
  }

  @Test
  public void case62() {
    String[] tree = { "D 1", "A 2", "? 5", "C 10" };
    assertEquals("CD", incompletebst.missingValues(tree));
  }

  @Test
  public void case63() {
    String[] tree = { "D 1", "A 2", "? 3", "F 7", "B 6" };
    assertEquals("", incompletebst.missingValues(tree));
  }

  @Test
  public void case64() {
    String[] tree = { "C 2", "? 1", "X 3" };
    assertEquals("CDEFGHIJKLMNOPQRSTUVW", incompletebst.missingValues(tree));
  }

  @Test
  public void case65() {
    String[] tree = { "B 1", "B 2", "A 4", "? 9", "A 3" };
    assertEquals("", incompletebst.missingValues(tree));
  }

  @Test
  public void case66() {
    String[] tree = { "A 1", "? 2", "A 5", "A 3", "A 4" };
    assertEquals("", incompletebst.missingValues(tree));
  }

  @Test
  public void case67() {
    String[] tree = { "? 5", "K 2", "W 3", "A 4", "N 1" };
    assertEquals("LMN", incompletebst.missingValues(tree));
  }

  @Test
  public void case68() {
    String[] tree = { "F 1", "? 2", "G 3", "F 6" };
    assertEquals("", incompletebst.missingValues(tree));
  }

  @Test
  public void case69() {
    String[] tree = { "D 1", "? 3", "A 6", "B 7" };
    assertEquals("", incompletebst.missingValues(tree));
  }

  @Test
  public void case70() {
    String[] tree = { "B 1", "A 2", "? 3" };
    assertEquals("CDEFGHIJKLMNOPQRSTUVWXYZ", incompletebst.missingValues(tree));
  }

  @Test
  public void case71() {
    String[] tree = { "K 1", "K 2", "A 6", "? 12", "Y 3" };
    assertEquals("", incompletebst.missingValues(tree));
  }

  @Test
  public void case72() {
    String[] tree = { "A 1", "? 2", "C 4", "D 5" };
    assertEquals("", incompletebst.missingValues(tree));
  }

  @Test
  public void case73() {
    String[] tree = { "A 1", "B 2", "? 3" };
    assertEquals("", incompletebst.missingValues(tree));
  }

  @Test
  public void case74() {
    String[] tree = { "M 1", "Z 2", "? 3" };
    assertEquals("", incompletebst.missingValues(tree));
  }

  @Test
  public void case75() {
    String[] tree = { "? 2", "V 1", "E 4", "H 5" };
    assertEquals("EFG", incompletebst.missingValues(tree));
  }

  @Test
  public void case76() {
    String[] tree = { "A 1", "? 2", "C 3", "A 6" };
    assertEquals("", incompletebst.missingValues(tree));
  }

}
