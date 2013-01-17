package topc.test.recursion;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.recursion.*;

public class HanoiStateTest {
  HanoiState hanoistate = new HanoiState();

  @Test
  public void case1() {
    String target = "CCC";
    int moves = 4;
    assertEquals("BBC", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case2() {
    String target = "AAC";
    int moves = 7;
    assertEquals("AAC", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case3() {
    String target = "AAAAAAAAAAAAAAAAAAAAAAAAAAAA";
    int moves = 0;
    assertEquals("AAAAAAAAAAAAAAAAAAAAAAAAAAAA", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case4() {
    String target = "ABCABCABCABCABCABCABCABCABCABC";
    int moves = 100000000;
    assertEquals("CCCCCCCCBAAAABBBBACBAAAAACBAAA", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case5() {
    String target = "A";
    int moves = 0;
    assertEquals("A", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case6() {
    String target = "B";
    int moves = 0;
    assertEquals("A", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case7() {
    String target = "B";
    int moves = 1;
    assertEquals("B", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case8() {
    String target = "C";
    int moves = 0;
    assertEquals("A", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case9() {
    String target = "C";
    int moves = 1;
    assertEquals("C", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case10() {
    String target = "CCCC";
    int moves = 0;
    assertEquals("AAAA", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case11() {
    String target = "CCCC";
    int moves = 1;
    assertEquals("BAAA", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case12() {
    String target = "CCCC";
    int moves = 2;
    assertEquals("BCAA", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case13() {
    String target = "CCCC";
    int moves = 3;
    assertEquals("CCAA", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case14() {
    String target = "CCCC";
    int moves = 4;
    assertEquals("CCBA", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case15() {
    String target = "CCCC";
    int moves = 5;
    assertEquals("ACBA", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case16() {
    String target = "CCCC";
    int moves = 6;
    assertEquals("ABBA", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case17() {
    String target = "CCCC";
    int moves = 7;
    assertEquals("BBBA", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case18() {
    String target = "CCCC";
    int moves = 8;
    assertEquals("BBBC", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case19() {
    String target = "CCCC";
    int moves = 9;
    assertEquals("CBBC", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case20() {
    String target = "CCCC";
    int moves = 10;
    assertEquals("CABC", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case21() {
    String target = "CCCC";
    int moves = 11;
    assertEquals("AABC", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case22() {
    String target = "CCCC";
    int moves = 12;
    assertEquals("AACC", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case23() {
    String target = "CCCC";
    int moves = 13;
    assertEquals("BACC", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case24() {
    String target = "CCCC";
    int moves = 14;
    assertEquals("BCCC", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case25() {
    String target = "CCCC";
    int moves = 15;
    assertEquals("CCCC", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case26() {
    String target = "CBAC";
    int moves = 0;
    assertEquals("AAAA", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case27() {
    String target = "CBAC";
    int moves = 1;
    assertEquals("BAAA", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case28() {
    String target = "CBAC";
    int moves = 2;
    assertEquals("BCAA", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case29() {
    String target = "CBAC";
    int moves = 3;
    assertEquals("CCAA", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case30() {
    String target = "CBAC";
    int moves = 4;
    assertEquals("CCBA", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case31() {
    String target = "CBAC";
    int moves = 5;
    assertEquals("ACBA", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case32() {
    String target = "CBAC";
    int moves = 6;
    assertEquals("ABBA", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case33() {
    String target = "CBAC";
    int moves = 7;
    assertEquals("BBBA", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case34() {
    String target = "CBAC";
    int moves = 8;
    assertEquals("BBBC", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case35() {
    String target = "CBAC";
    int moves = 9;
    assertEquals("ABBC", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case36() {
    String target = "CBAC";
    int moves = 10;
    assertEquals("ACBC", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case37() {
    String target = "CBAC";
    int moves = 11;
    assertEquals("CCBC", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case38() {
    String target = "CBAC";
    int moves = 12;
    assertEquals("CCAC", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case39() {
    String target = "CBAC";
    int moves = 13;
    assertEquals("ACAC", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case40() {
    String target = "CBAC";
    int moves = 14;
    assertEquals("ABAC", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case41() {
    String target = "CBAC";
    int moves = 15;
    assertEquals("CBAC", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case42() {
    String target = "CABBCCBACCBACCABAACCCCACABABAB";
    int moves = 0;
    assertEquals("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case43() {
    String target = "BAACCBACBBBBACAACCAACCAABAACCA";
    int moves = 432853159;
    assertEquals("BAACCBACBBBBACAACCAACCAABAACCA", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case44() {
    String target = "ABCCBCACCBCABABBAABCCBAABACBAC";
    int moves = 536870911;
    assertEquals("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBA", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case45() {
    String target = "ABCCBCACCBCABABBAABCCBAABACBAC";
    int moves = 536870912;
    assertEquals("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBC", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case46() {
    String target = "ABCCBCACCBCABABBAABCCBAABACBAC";
    int moves = 536870913;
    assertEquals("ABBBBBBBBBBBBBBBBBBBBBBBBBBBBC", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case47() {
    String target = "ABCCBCACCBCABABBAABCCBAABACBAC";
    int moves = 268435456;
    assertEquals("CCCCCCCCCCCCCCCCCCCCCCCCCCCCBA", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case48() {
    String target = "ABCCBCACCBCABABBAABCCBAABACBAC";
    int moves = 268435455;
    assertEquals("CCCCCCCCCCCCCCCCCCCCCCCCCCCCAA", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case49() {
    String target = "CAAAABAACBCACCACCAACACCBABAAAB";
    int moves = 1000000000;
    assertEquals("AAAAAAAAABCABBAABCABBAABBBCAAB", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case50() {
    String target = "CAAAABAACBCACCACCAACACCBABAAAB";
    int moves = 100000000;
    assertEquals("BBBBBBBBCAAAACCCCABCAAAAABCAAA", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case51() {
    String target = "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCC";
    int moves = 1073741823;
    assertEquals("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case52() {
    String target = "CCBAABBCBBABBCBBABABCBABAAABAB";
    int moves = 395488233;
    assertEquals("BCCBACCCCCBACBACBACCABBAAAABCA", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case53() {
    String target = "ABCABCABCABCABCABCABCABCABCCAB";
    int moves = 900909000;
    assertEquals("BBBACCAAAAABBBCCBACCAACBBCABAB", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case54() {
    String target = "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCC";
    int moves = 1000000000;
    assertEquals("CCCCCCCCCABCAACCABCAACCAAABCCC", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case55() {
    String target = "BCBC";
    int moves = 9;
    assertEquals("ABBC", hanoistate.partwayState(target, moves));
  }

  @Test
  public void case56() {
    String target = "BACBAACC";
    int moves = 201;
    assertEquals("BCCBAACC", hanoistate.partwayState(target, moves));
  }

}
