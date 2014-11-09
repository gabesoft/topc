package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class TreeUnionDiv2Test {
  TreeUnionDiv2 treeuniondiv2 = new TreeUnionDiv2();

  @Test
  public void case1() {
    String[] tree1 = { "-X", "X-" };
    String[] tree2 = { "-X", "X-" };
    int K = 4;
    assertEquals(1, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case2() {
    String[] tree1 = { "-X-", "X-X", "-X-" };
    String[] tree2 = { "-X-", "X-X", "-X-" };
    int K = 5;
    assertEquals(2, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case3() {
    String[] tree1 = { "-X---", "X-XXX", "-X---", "-X---", "-X---" };
    String[] tree2 = { "-X-X-", "X-X-X", "-X---", "X----", "-X---" };
    int K = 6;
    assertEquals(5, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case4() {
    String[] tree1 = { "-X--", "X-X-", "-X-X", "--X-" };
    String[] tree2 = { "---X", "--X-", "-X-X", "X-X-" };
    int K = 6;
    assertEquals(4, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case5() {
    String[] tree1 = { "--X-X", "--X--", "XX-X-", "--X--", "X----" };
    String[] tree2 = { "---X-", "----X", "---X-", "X-X-X", "-X-X-" };
    int K = 6;
    assertEquals(8, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case6() {
    String[] tree1 = { "-XX---", "X-----", "X--XXX", "--X---", "--X---", "--X---" };
    String[] tree2 = { "-----X", "-----X", "---X-X", "--X---", "-----X", "XXX-X-" };
    int K = 6;
    assertEquals(13, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case7() {
    String[] tree1 = { "-XXXX--", "X------", "X------", "X-----X", "X----X-", "----X--", "---X---" };
    String[] tree2 = { "----XXX", "---X---", "-----X-", "-X---X-", "X------", "X-XX---", "X------" };
    int K = 6;
    assertEquals(16, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case8() {
    String[] tree1 = { "-XXXXXXXX", "X--------", "X--------", "X--------", "X--------", "X--------", "X--------", "X--------", "X--------" };
    String[] tree2 = { "-XXXXXXXX", "X--------", "X--------", "X--------", "X--------", "X--------", "X--------", "X--------", "X--------" };
    int K = 6;
    assertEquals(28, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case9() {
    String[] tree1 = { "-XX------", "X------X-", "X--XX-X--", "--X--X---", "--X------", "---X----X", "--X------", "-X-------", "-----X---" };
    String[] tree2 = { "-X-------", "X-X------", "-X-XX----", "--X---X--", "--X--X---", "----X--XX", "---X-----", "-----X---", "-----X---" };
    int K = 7;
    assertEquals(17, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case10() {
    String[] tree1 = { "-X-XX", "X-X--", "-X---", "X----", "X----" };
    String[] tree2 = { "-XX-X", "X----", "X--X-", "--X--", "X----" };
    int K = 3;
    assertEquals(0, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case11() {
    String[] tree1 = { "-X", "X-" };
    String[] tree2 = { "-X", "X-" };
    int K = 3;
    assertEquals(0, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case12() {
    String[] tree1 = { "-X-", "X-X", "-X-" };
    String[] tree2 = { "-X-", "X-X", "-X-" };
    int K = 3;
    assertEquals(0, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case13() {
    String[] tree1 = { "-X-", "X-X", "-X-" };
    String[] tree2 = { "-X-", "X-X", "-X-" };
    int K = 3;
    assertEquals(0, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case14() {
    String[] tree1 = { "-XXX--", "X-----", "X---XX", "X-----", "--X---", "--X---" };
    String[] tree2 = { "-XXX-X", "X---X-", "X-----", "X-----", "-X----", "X-----" };
    int K = 3;
    assertEquals(0, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case15() {
    String[] tree1 = { "-X-X--", "X-X--X", "-X--X-", "X-----", "--X---", "-X----" };
    String[] tree2 = { "-X-X--", "X-X--X", "-X----", "X---X-", "---X--", "-X----" };
    int K = 3;
    assertEquals(0, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case16() {
    String[] tree1 = { "-X--", "X-X-", "-X-X", "--X-" };
    String[] tree2 = { "-XX-", "X---", "X--X", "--X-" };
    int K = 3;
    assertEquals(0, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case17() {
    String[] tree1 = { "-X-XX", "X-X--", "-X---", "X----", "X----" };
    String[] tree2 = { "-XX-X", "X----", "X--X-", "--X--", "X----" };
    int K = 3;
    assertEquals(0, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case18() {
    String[] tree1 = { "-X", "X-" };
    String[] tree2 = { "-X", "X-" };
    int K = 3;
    assertEquals(0, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case19() {
    String[] tree1 = { "-X--", "X-X-", "-X-X", "--X-" };
    String[] tree2 = { "-XX-", "X--X", "X---", "-X--" };
    int K = 3;
    assertEquals(0, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case20() {
    String[] tree1 = { "-X-X", "X-X-", "-X--", "X---" };
    String[] tree2 = { "-X-X", "X-X-", "-X--", "X---" };
    int K = 4;
    assertEquals(3, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case21() {
    String[] tree1 = { "-X", "X-" };
    String[] tree2 = { "-X", "X-" };
    int K = 4;
    assertEquals(1, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case22() {
    String[] tree1 = { "-XXX-X--", "X-----X-", "X-------", "X---X---", "---X---X", "X-------", "-X------", "----X---" };
    String[] tree2 = { "-XXX--X-", "X-------", "X------X", "X---XX--", "---X----", "---X----", "X-------", "--X-----" };
    int K = 4;
    assertEquals(6, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case23() {
    String[] tree1 = { "-XXXX-X--", "X--------", "X----X---", "X------X-", "X--------", "--X-----X", "X--------", "---X-----", "-----X---" };
    String[] tree2 = { "-XX------", "X--------", "X--X-XXX-", "--X-X----", "---X-----", "--X-----X", "--X------", "--X------", "-----X---" };
    int K = 4;
    assertEquals(7, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case24() {
    String[] tree1 = { "-XXXXX", "X-----", "X-----", "X-----", "X-----", "X-----" };
    String[] tree2 = { "-XX---", "X--XX-", "X----X", "-X----", "-X----", "--X---" };
    int K = 4;
    assertEquals(3, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case25() {
    String[] tree1 = { "-X---", "X-XX-", "-X---", "-X--X", "---X-" };
    String[] tree2 = { "-X---", "X-XX-", "-X--X", "-X---", "--X--" };
    int K = 4;
    assertEquals(4, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case26() {
    String[] tree1 = { "-X-X---", "X-X----", "-X--X-X", "X----X-", "--X----", "---X---", "--X----" };
    String[] tree2 = { "-XX-X--", "X------", "X--X---", "--X--XX", "X------", "---X---", "---X---" };
    int K = 4;
    assertEquals(5, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case27() {
    String[] tree1 = { "-X------", "X-X----X", "-X-X-X--", "--X-X-X-", "---X----", "--X-----", "---X----", "-X------" };
    String[] tree2 = { "-XXX----", "X---XX--", "X-------", "X------X", "-X----X-", "-X------", "----X---", "---X----" };
    int K = 4;
    assertEquals(6, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case28() {
    String[] tree1 = { "-XXX-----", "X----X-X-", "X--------", "X---X-X-X", "---X-----", "-X-------", "---X-----", "-X-------", "---X-----" };
    String[] tree2 = { "-X-------", "X-XXXX---", "-X----X-X", "-X-------", "-X-------", "-X-----X-", "--X------", "-----X---", "--X------" };
    int K = 4;
    assertEquals(7, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case29() {
    String[] tree1 = { "-X-------", "X-X------", "-X-XXX---", "--X------", "--X---X--", "--X----X-", "----X----", "-----X--X", "-------X-" };
    String[] tree2 = { "-X-XXX---", "X-X------", "-X-------", "X-----X--", "X--------", "X--------", "---X---XX", "------X--", "------X--" };
    int K = 4;
    assertEquals(7, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case30() {
    String[] tree1 = { "-X", "X-" };
    String[] tree2 = { "-X", "X-" };
    int K = 5;
    assertEquals(0, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case31() {
    String[] tree1 = { "-XX", "X--", "X--" };
    String[] tree2 = { "-X-", "X-X", "-X-" };
    int K = 5;
    assertEquals(2, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case32() {
    String[] tree1 = { "-X", "X-" };
    String[] tree2 = { "-X", "X-" };
    int K = 5;
    assertEquals(0, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case33() {
    String[] tree1 = { "-XXX", "X---", "X---", "X---" };
    String[] tree2 = { "-XX-", "X---", "X--X", "--X-" };
    int K = 5;
    assertEquals(3, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case34() {
    String[] tree1 = { "-X------", "X-XX-X--", "-X------", "-X--X---", "---X--X-", "-X-----X", "----X---", "-----X--" };
    String[] tree2 = { "-X--X---", "X-X--X-X", "-X-X----", "--X-----", "X-----X-", "-X------", "----X---", "-X------" };
    int K = 5;
    assertEquals(10, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case35() {
    String[] tree1 = { "-X", "X-" };
    String[] tree2 = { "-X", "X-" };
    int K = 5;
    assertEquals(0, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case36() {
    String[] tree1 = { "-XX----", "X--XX--", "X----X-", "-X-----", "-X-----", "--X---X", "-----X-" };
    String[] tree2 = { "-X-----", "X-X----", "-X-X-X-", "--X-X--", "---X---", "--X---X", "-----X-" };
    int K = 5;
    assertEquals(7, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case37() {
    String[] tree1 = { "-X-----", "X-XXX--", "-X---X-", "-X-----", "-X----X", "--X----", "----X--" };
    String[] tree2 = { "-X-X---", "X-X-XX-", "-X-----", "X------", "-X----X", "-X-----", "----X--" };
    int K = 5;
    assertEquals(8, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case38() {
    String[] tree1 = { "-X-X--X", "X-X----", "-X--XX-", "X------", "--X----", "--X----", "X------" };
    String[] tree2 = { "-X----X", "X-XX---", "-X-----", "-X--XX-", "---X---", "---X---", "X------" };
    int K = 5;
    assertEquals(8, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case39() {
    String[] tree1 = { "-X", "X-" };
    String[] tree2 = { "-X", "X-" };
    int K = 5;
    assertEquals(0, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case40() {
    String[] tree1 = { "-XX-----", "X--X-X-X", "X-------", "-X--X-X-", "---X----", "-X------", "---X----", "-X------" };
    String[] tree2 = { "-X--X---", "X-XX----", "-X------", "-X---X--", "X-----XX", "---X----", "----X---", "----X---" };
    int K = 6;
    assertEquals(14, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case41() {
    String[] tree1 = { "-XX", "X--", "X--" };
    String[] tree2 = { "-XX", "X--", "X--" };
    int K = 6;
    assertEquals(1, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case42() {
    String[] tree1 = { "-X---", "X-XXX", "-X---", "-X---", "-X---" };
    String[] tree2 = { "-X-X-", "X-X--", "-X---", "X---X", "---X-" };
    int K = 6;
    assertEquals(3, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case43() {
    String[] tree1 = { "-X", "X-" };
    String[] tree2 = { "-X", "X-" };
    int K = 6;
    assertEquals(0, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case44() {
    String[] tree1 = { "-XX-X----", "X--X-----", "X----X---", "-X----XX-", "X--------", "--X------", "---X----X", "---X-----", "------X--" };
    String[] tree2 = { "-XXXXX---", "X--------", "X--------", "X--------", "X------X-", "X-----X-X", "-----X---", "----X----", "-----X---" };
    int K = 6;
    assertEquals(19, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case45() {
    String[] tree1 = { "-X--", "X-X-", "-X-X", "--X-" };
    String[] tree2 = { "-X--", "X-X-", "-X-X", "--X-" };
    int K = 6;
    assertEquals(4, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case46() {
    String[] tree1 = { "-X--X---", "X-XX-X--", "-X------", "-X-----X", "X-----X-", "-X------", "----X---", "---X----" };
    String[] tree2 = { "-XX----X", "X--X--X-", "X---X---", "-X------", "--X--X--", "----X---", "-X------", "X-------" };
    int K = 6;
    assertEquals(16, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case47() {
    String[] tree1 = { "-XX-XX-", "X------", "X--X---", "--X----", "X-----X", "X------", "----X--" };
    String[] tree2 = { "-X-----", "X-XX---", "-X-----", "-X--XX-", "---X---", "---X--X", "-----X-" };
    int K = 6;
    assertEquals(16, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case48() {
    String[] tree1 = { "-X", "X-" };
    String[] tree2 = { "-X", "X-" };
    int K = 6;
    assertEquals(0, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case49() {
    String[] tree1 = { "-X-XX", "X-X--", "-X---", "X----", "X----" };
    String[] tree2 = { "-XX-X", "X--X-", "X----", "-X---", "X----" };
    int K = 6;
    assertEquals(8, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case50() {
    String[] tree1 = { "-XX---X--", "X--------", "X--X-----", "--X-XX---", "---X-----", "---X---XX", "X--------", "-----X---", "-----X---" };
    String[] tree2 = { "-X-------", "X-XX-----", "-X--X----", "-X----XX-", "--X--X---", "----X----", "---X----X", "---X-----", "------X--" };
    int K = 7;
    assertEquals(16, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case51() {
    String[] tree1 = { "-X", "X-" };
    String[] tree2 = { "-X", "X-" };
    int K = 7;
    assertEquals(0, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case52() {
    String[] tree1 = { "-X", "X-" };
    String[] tree2 = { "-X", "X-" };
    int K = 7;
    assertEquals(0, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case53() {
    String[] tree1 = { "-XX------", "X--XX----", "X----X---", "-X-------", "-X----X--", "--X-----X", "----X--X-", "------X--", "-----X---" };
    String[] tree2 = { "-X-------", "X-XX-----", "-X--XX---", "-X------X", "--X------", "--X---XX-", "-----X---", "-----X---", "---X-----" };
    int K = 7;
    assertEquals(17, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case54() {
    String[] tree1 = { "-XX-XX---", "X--X-----", "X--------", "-X------X", "X-----X--", "X--------", "----X--X-", "------X--", "---X-----" };
    String[] tree2 = { "-XX------", "X-------X", "X--X-----", "--X-X----", "---X-XX--", "----X--X-", "----X----", "-----X---", "-X-------" };
    int K = 7;
    assertEquals(17, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case55() {
    String[] tree1 = { "-X-------", "X-X-X--XX", "-X-X-XX--", "--X------", "-X-------", "--X------", "--X------", "-X-------", "-X-------" };
    String[] tree2 = { "-XXX---X-", "X---X-X--", "X--------", "X----X---", "-X-------", "---X----X", "-X-------", "X--------", "-----X---" };
    int K = 7;
    assertEquals(16, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case56() {
    String[] tree1 = { "-X--XX", "X-XX--", "-X----", "-X----", "X-----", "X-----" };
    String[] tree2 = { "-X-X--", "X-X--X", "-X----", "X---X-", "---X--", "-X----" };
    int K = 7;
    assertEquals(7, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case57() {
    String[] tree1 = { "-X---", "X-X--", "-X-XX", "--X--", "--X--" };
    String[] tree2 = { "-X-X-", "X-X-X", "-X---", "X----", "-X---" };
    int K = 7;
    assertEquals(4, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case58() {
    String[] tree1 = { "-XX", "X--", "X--" };
    String[] tree2 = { "-XX", "X--", "X--" };
    int K = 7;
    assertEquals(0, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case59() {
    String[] tree1 = { "-XXX", "X---", "X---", "X---" };
    String[] tree2 = { "-XX-", "X---", "X--X", "--X-" };
    int K = 7;
    assertEquals(1, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case60() {
    String[] tree1 = { "-" };
    String[] tree2 = { "-" };
    int K = 3;
    assertEquals(0, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case61() {
    String[] tree1 = { "-XX-X---X", "X--X-----", "X--------", "-X---X---", "X-----X--", "---X-----", "----X--X-", "------X--", "X--------" };
    String[] tree2 = { "-XX---X--", "X--X-----", "X---XX---", "-X------X", "--X------", "--X------", "X------X-", "------X--", "---X-----" };
    int K = 7;
    assertEquals(17, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case62() {
    String[] tree1 = { "-XXXX---X", "X------X-", "X--------", "X----XX--", "X--------", "---X-----", "---X-----", "-X-------", "X--------" };
    String[] tree2 = { "-X-X-----", "X-X------", "-X-----X-", "X---X-X--", "---X-X--X", "----X----", "---X-----", "--X------", "----X----" };
    int K = 6;
    assertEquals(21, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case63() {
    String[] tree1 = { "-XXX--X-X", "X---X----", "X--------", "X----X---", "-X-------", "---X-----", "X------X-", "------X--", "X--------" };
    String[] tree2 = { "-X-X-----", "X-X-X----", "-X-----X-", "X--------", "-X---X---", "----X-X--", "-----X--X", "--X------", "------X--" };
    int K = 5;
    assertEquals(10, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case64() {
    String[] tree1 = { "-X-X--X--", "X-X------", "-X--X--X-", "X----X---", "--X------", "---X----X", "X--------", "--X------", "-----X---" };
    String[] tree2 = { "-X--X----", "X-XX-----", "-X-------", "-X-------", "X----X---", "----X-XX-", "-----X---", "-----X--X", "-------X-" };
    int K = 4;
    assertEquals(7, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case65() {
    String[] tree1 = { "-XX------", "X---X---X", "X--X-X---", "--X------", "-X-----X-", "--X---X--", "-----X---", "----X----", "-X-------" };
    String[] tree2 = { "-X-------", "X-X-X--X-", "-X-X-----", "--X---X--", "-X---X---", "----X----", "---X----X", "-X-------", "------X--" };
    int K = 5;
    assertEquals(11, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case66() {
    String[] tree1 = { "-X-X-----", "X-X--X---", "-X--X-X-X", "X--------", "--X------", "-X-----X-", "--X------", "-----X---", "--X------" };
    String[] tree2 = { "-X-X--XX-", "X-X------", "-X-------", "X---X----", "---X-X---", "----X---X", "X--------", "X--------", "-----X---" };
    int K = 6;
    assertEquals(19, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case67() {
    String[] tree1 = { "-XX------", "X-----X--", "X--X-----", "--X-X--X-", "---X-X---", "----X---X", "-X-------", "---X-----", "-----X---" };
    String[] tree2 = { "-XXXX--XX", "X----X---", "X--------", "X-----X--", "X--------", "-X-------", "---X-----", "X--------", "X--------" };
    int K = 6;
    assertEquals(15, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case68() {
    String[] tree1 = { "-X-------", "X-XX-----", "-X-------", "-X--XX-XX", "---X--X--", "---X-----", "----X----", "---X-----", "---X-----" };
    String[] tree2 = { "-X-X-XX--", "X-X------", "-X--X--X-", "X--------", "--X------", "X-------X", "X--------", "--X------", "-----X---" };
    int K = 6;
    assertEquals(19, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case69() {
    String[] tree1 = { "-XXXX----", "X--------", "X-----X--", "X------X-", "X----X---", "----X---X", "--X------", "---X-----", "-----X---" };
    String[] tree2 = { "-XX-X----", "X--X-----", "X----X--X", "-X-------", "X-----X--", "--X----X-", "----X----", "-----X---", "--X------" };
    int K = 5;
    assertEquals(10, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case70() {
    String[] tree1 = { "-XX-----X", "X--XX----", "X-----XX-", "-X---X---", "-X-------", "---X-----", "--X------", "--X------", "X--------" };
    String[] tree2 = { "-X-------", "X-X-X---X", "-X-X-----", "--X--X---", "-X-------", "---X--X--", "-----X-X-", "------X--", "-X-------" };
    int K = 6;
    assertEquals(16, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case71() {
    String[] tree1 = { "-XXX----X", "X---X----", "X--------", "X----XXX-", "-X-------", "---X-----", "---X-----", "---X-----", "X--------" };
    String[] tree2 = { "-XX-X-X--", "X----X---", "X--X-----", "--X------", "X------X-", "-X-------", "X--------", "----X---X", "-------X-" };
    int K = 7;
    assertEquals(18, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case72() {
    String[] tree1 = { "-X-------", "X-X------", "-X-XX-X--", "--X--X---", "--X------", "---X---XX", "--X------", "-----X---", "-----X---" };
    String[] tree2 = { "-XX--X---", "X--X--X--", "X--------", "-X--X---X", "---X---X-", "X--------", "-X-------", "----X----", "---X-----" };
    int K = 5;
    assertEquals(11, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case73() {
    String[] tree1 = { "-X-X-----", "X-X--XX--", "-X-----X-", "X---X----", "---X-----", "-X-------", "-X------X", "--X------", "------X--" };
    String[] tree2 = { "-XX--X---", "X---X-X--", "X--X-----", "--X----X-", "-X-------", "X--------", "-X------X", "---X-----", "------X--" };
    int K = 4;
    assertEquals(7, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case74() {
    String[] tree1 = { "-XX--X---", "X-----X--", "X--X-----", "--X-X----", "---X-----", "X--------", "-X-----XX", "------X--", "------X--" };
    String[] tree2 = { "-XX---X--", "X---X----", "X--X-----", "--X------", "-X---X--X", "----X----", "X------X-", "------X--", "----X----" };
    int K = 4;
    assertEquals(7, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case75() {
    String[] tree1 = { "-X------X", "X-X-X----", "-X-X-----", "--X--X---", "-X-----X-", "---X--X--", "-----X---", "----X----", "X--------" };
    String[] tree2 = { "-XX-X----", "X------XX", "X--X--X--", "--X------", "X----X---", "----X----", "--X------", "-X-------", "-X-------" };
    int K = 7;
    assertEquals(17, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case76() {
    String[] tree1 = { "-X-XX----", "X-X-----X", "-X----X--", "X--------", "X----X-X-", "----X----", "--X------", "----X----", "-X-------" };
    String[] tree2 = { "-X-------", "X-X---XX-", "-X-XX----", "--X------", "--X--X--X", "----X----", "-X-------", "-X-------", "----X----" };
    int K = 4;
    assertEquals(7, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case77() {
    String[] tree1 = { "-XX-X----", "X-----XX-", "X--X-----", "--X--X---", "X--------", "---X-----", "-X-------", "-X------X", "-------X-" };
    String[] tree2 = { "-X-----X-", "X-XXXX---", "-X----X-X", "-X-------", "-X-------", "-X-------", "--X------", "X--------", "--X------" };
    int K = 5;
    assertEquals(11, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case78() {
    String[] tree1 = { "-X--XX-X-", "X-XX----X", "-X-------", "-X----X--", "X--------", "X--------", "---X-----", "X--------", "-X-------" };
    String[] tree2 = { "-X-------", "X-XXX----", "-X-------", "-X-------", "-X---X-X-", "----X-X--", "-----X---", "----X---X", "-------X-" };
    int K = 6;
    assertEquals(19, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case79() {
    String[] tree1 = { "-X-X--X--", "X-X-----X", "-X--X----", "X--------", "--X--X-X-", "----X----", "X--------", "----X----", "-X-------" };
    String[] tree2 = { "-X---X-XX", "X-XXX----", "-X----X--", "-X-------", "-X-------", "X--------", "--X------", "X--------", "X--------" };
    int K = 6;
    assertEquals(21, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case80() {
    String[] tree1 = { "-XXX---X-", "X--------", "X--------", "X---XX--X", "---X-----", "---X--X--", "-----X---", "X--------", "---X-----" };
    String[] tree2 = { "-X--X----", "X-X------", "-X-X-XX--", "--X----X-", "X--------", "--X------", "--X------", "---X----X", "-------X-" };
    int K = 6;
    assertEquals(19, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case81() {
    String[] tree1 = { "-X-XX", "X-X--", "-X---", "X----", "X----" };
    String[] tree2 = { "-XX-X", "X--X-", "X----", "-X---", "X----" };
    int K = 5;
    assertEquals(6, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case82() {
    String[] tree1 = { "-XX-X", "X--X-", "X----", "-X---", "X----" };
    String[] tree2 = { "-X---", "X-X-X", "-X-X-", "--X--", "-X---" };
    int K = 4;
    assertEquals(4, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case83() {
    String[] tree1 = { "-X---", "X-X--", "-X-X-", "--X-X", "---X-" };
    String[] tree2 = { "-X-X-", "X-X--", "-X---", "X---X", "---X-" };
    int K = 6;
    assertEquals(7, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case84() {
    String[] tree1 = { "-XXX--", "X----X", "X---X-", "X-----", "--X---", "-X----" };
    String[] tree2 = { "-X--X-", "X-XX--", "-X---X", "-X----", "X-----", "--X---" };
    int K = 6;
    assertEquals(12, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case85() {
    String[] tree1 = { "-X----", "X-XX--", "-X---X", "-X--X-", "---X--", "--X---" };
    String[] tree2 = { "-X-X--", "X-X-X-", "-X----", "X-----", "-X---X", "----X-" };
    int K = 6;
    assertEquals(12, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case86() {
    String[] tree1 = { "-X--X-", "X-X---", "-X-X--", "--X---", "X----X", "----X-" };
    String[] tree2 = { "-X-X--", "X-X---", "-X--X-", "X-----", "--X--X", "----X-" };
    int K = 7;
    assertEquals(8, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case87() {
    String[] tree1 = { "-X-----", "X-X--X-", "-X-XX--", "--X----", "--X---X", "-X-----", "----X--" };
    String[] tree2 = { "-X-----", "X-X----", "-X-X--X", "--X-XX-", "---X---", "---X---", "--X----" };
    int K = 4;
    assertEquals(6, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case88() {
    String[] tree1 = { "-X----X", "X-X----", "-X-X---", "--X-XX-", "---X---", "---X---", "X------" };
    String[] tree2 = { "-XX----", "X--X---", "X---X-X", "-X---X-", "--X----", "---X---", "--X----" };
    int K = 7;
    assertEquals(12, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case89() {
    String[] tree1 = { "-X-X---", "X-X-X--", "-X---X-", "X-----X", "-X-----", "--X----", "---X---" };
    String[] tree2 = { "-X---X-", "X-X----", "-X-X---", "--X-X--", "---X---", "X-----X", "-----X-" };
    int K = 7;
    assertEquals(11, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case90() {
    String[] tree1 = { "-X---X--", "X-X-----", "-X-XX---", "--X---XX", "--X-----", "X-------", "---X----", "---X----" };
    String[] tree2 = { "-X-X----", "X-X-X-X-", "-X------", "X----X--", "-X------", "---X----", "-X-----X", "------X-" };
    int K = 5;
    assertEquals(10, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case91() {
    String[] tree1 = { "-XX-X---", "X-------", "X--X----", "--X--X--", "X------X", "---X--X-", "-----X--", "----X---" };
    String[] tree2 = { "-X---X--", "X-X-X---", "-X-X---X", "--X---X-", "-X------", "X-------", "---X----", "--X-----" };
    int K = 5;
    assertEquals(10, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case92() {
    String[] tree1 = { "-X--X---", "X-X-----", "-X-X--X-", "--X-----", "X----X--", "----X--X", "--X-----", "-----X--" };
    String[] tree2 = { "-XX-X-X-", "X--X----", "X-------", "-X------", "X----X--", "----X--X", "X-------", "-----X--" };
    int K = 6;
    assertEquals(16, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case93() {
    String[] tree1 = { "-XX-----X", "X------X-", "X--X-----", "--X-XX---", "---X--X--", "---X-----", "----X----", "-X-------", "X--------" };
    String[] tree2 = { "-XX-X----", "X--X-----", "X--------", "-X---XX--", "X------X-", "---X----X", "---X-----", "----X----", "-----X---" };
    int K = 4;
    assertEquals(8, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case94() {
    String[] tree1 = { "-X-------", "X-XX--X--", "-X--X--X-", "-X---X---", "--X-----X", "---X-----", "-X-------", "--X------", "----X----" };
    String[] tree2 = { "-X---XXX-", "X-XX-----", "-X-------", "-X--X----", "---X-----", "X--------", "X-------X", "X--------", "------X--" };
    int K = 5;
    assertEquals(12, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

  @Test
  public void case95() {
    String[] tree1 = { "-XXX---X-", "X-----X--", "X--------", "X---X---X", "---X-X---", "----X----", "-X-------", "X--------", "---X-----" };
    String[] tree2 = { "-XX-X----", "X--X-----", "X------X-", "-X---X---", "X--------", "---X--X-X", "-----X---", "--X------", "-----X---" };
    int K = 7;
    assertEquals(16, treeuniondiv2.maximumCycles(tree1, tree2, K));
  }

}
