package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class UnrepeatableWordsTest {
  UnrepeatableWords unrepeatablewords = new UnrepeatableWords();

  @Test
  public void case1() {
    int k = 3;
    int n = 5;
    int allowed = 2;
    assertEquals("AABAA", unrepeatablewords.getWord(k, n, allowed));
  }

  @Test
  public void case2() {
    int k = 3;
    int n = 5;
    int allowed = 1;
    assertEquals("", unrepeatablewords.getWord(k, n, allowed));
  }

  @Test
  public void case3() {
    int k = 3;
    int n = 10;
    int allowed = 2;
    assertEquals("AABAABABAA", unrepeatablewords.getWord(k, n, allowed));
  }

  @Test
  public void case4() {
    int k = 3;
    int n = 50;
    int allowed = 2;
    assertEquals("AABAABABAABAABBAABAABABAABAABBAABAABABAABABBAABAAB", unrepeatablewords.getWord(k, n, allowed));
  }

  @Test
  public void case5() {
    int k = 4;
    int n = 50;
    int allowed = 3;
    assertEquals("AAABAAABAAABAAACAAABAAABAAABAAACAAABAAABAAABAAACAA", unrepeatablewords.getWord(k, n, allowed));
  }

  @Test
  public void case6() {
    int k = 4;
    int n = 50;
    int allowed = 26;
    assertEquals("AAABAAABAAABAAACAAABAAABAAABAAACAAABAAABAAABAAACAA", unrepeatablewords.getWord(k, n, allowed));
  }

  @Test
  public void case7() {
    int k = 2;
    int n = 1;
    int allowed = 1;
    assertEquals("A", unrepeatablewords.getWord(k, n, allowed));
  }

  @Test
  public void case8() {
    int k = 2;
    int n = 1;
    int allowed = 2;
    assertEquals("A", unrepeatablewords.getWord(k, n, allowed));
  }

  @Test
  public void case9() {
    int k = 10;
    int n = 40;
    int allowed = 26;
    assertEquals("AAAAAAAAABAAAAAAAAABAAAAAAAAABAAAAAAAAAB", unrepeatablewords.getWord(k, n, allowed));
  }

  @Test
  public void case10() {
    int k = 10;
    int n = 40;
    int allowed = 2;
    assertEquals("AAAAAAAAABAAAAAAAAABAAAAAAAAABAAAAAAAAAB", unrepeatablewords.getWord(k, n, allowed));
  }

  @Test
  public void case11() {
    int k = 10;
    int n = 40;
    int allowed = 3;
    assertEquals("AAAAAAAAABAAAAAAAAABAAAAAAAAABAAAAAAAAAB", unrepeatablewords.getWord(k, n, allowed));
  }

  @Test
  public void case12() {
    int k = 3;
    int n = 49;
    int allowed = 26;
    assertEquals("AABAABAACAABAABAACAABAABAADAABAABAACAABAABAACAABA", unrepeatablewords.getWord(k, n, allowed));
  }

  @Test
  public void case13() {
    int k = 10;
    int n = 1;
    int allowed = 26;
    assertEquals("A", unrepeatablewords.getWord(k, n, allowed));
  }

  @Test
  public void case14() {
    int k = 7;
    int n = 48;
    int allowed = 26;
    assertEquals("AAAAAABAAAAAABAAAAAABAAAAAABAAAAAABAAAAAABAAAAAA", unrepeatablewords.getWord(k, n, allowed));
  }

  @Test
  public void case15() {
    int k = 7;
    int n = 49;
    int allowed = 1;
    assertEquals("", unrepeatablewords.getWord(k, n, allowed));
  }

  @Test
  public void case16() {
    int k = 7;
    int n = 50;
    int allowed = 2;
    assertEquals("AAAAAABAAAAAABAAAAAABAAAAAABAAAAAABAAAAAABAAAAABAA", unrepeatablewords.getWord(k, n, allowed));
  }

  @Test
  public void case17() {
    int k = 7;
    int n = 50;
    int allowed = 3;
    assertEquals("AAAAAABAAAAAABAAAAAABAAAAAABAAAAAABAAAAAABAAAAAACA", unrepeatablewords.getWord(k, n, allowed));
  }

  @Test
  public void case18() {
    int k = 7;
    int n = 49;
    int allowed = 5;
    assertEquals("AAAAAABAAAAAABAAAAAABAAAAAABAAAAAABAAAAAABAAAAAAC", unrepeatablewords.getWord(k, n, allowed));
  }

  @Test
  public void case19() {
    int k = 7;
    int n = 49;
    int allowed = 6;
    assertEquals("AAAAAABAAAAAABAAAAAABAAAAAABAAAAAABAAAAAABAAAAAAC", unrepeatablewords.getWord(k, n, allowed));
  }

  @Test
  public void case20() {
    int k = 3;
    int n = 2;
    int allowed = 1;
    assertEquals("AA", unrepeatablewords.getWord(k, n, allowed));
  }

  @Test
  public void case21() {
    int k = 8;
    int n = 49;
    int allowed = 26;
    assertEquals("AAAAAAABAAAAAAABAAAAAAABAAAAAAABAAAAAAABAAAAAAABA", unrepeatablewords.getWord(k, n, allowed));
  }

  @Test
  public void case22() {
    int k = 8;
    int n = 49;
    int allowed = 13;
    assertEquals("AAAAAAABAAAAAAABAAAAAAABAAAAAAABAAAAAAABAAAAAAABA", unrepeatablewords.getWord(k, n, allowed));
  }

  @Test
  public void case23() {
    int k = 8;
    int n = 50;
    int allowed = 8;
    assertEquals("AAAAAAABAAAAAAABAAAAAAABAAAAAAABAAAAAAABAAAAAAABAA", unrepeatablewords.getWord(k, n, allowed));
  }

  @Test
  public void case24() {
    int k = 2;
    int n = 10;
    int allowed = 10;
    assertEquals("ABACABADAB", unrepeatablewords.getWord(k, n, allowed));
  }

  @Test
  public void case25() {
    int k = 2;
    int n = 3;
    int allowed = 2;
    assertEquals("ABA", unrepeatablewords.getWord(k, n, allowed));
  }

  @Test
  public void case26() {
    int k = 2;
    int n = 4;
    int allowed = 2;
    assertEquals("", unrepeatablewords.getWord(k, n, allowed));
  }

  @Test
  public void case27() {
    int k = 2;
    int n = 50;
    int allowed = 9;
    assertEquals("ABACABADABACABAEABACABADABACABAFABACABADABACABAEAB", unrepeatablewords.getWord(k, n, allowed));
  }

  @Test
  public void case28() {
    int k = 8;
    int n = 50;
    int allowed = 7;
    assertEquals("AAAAAAABAAAAAAABAAAAAAABAAAAAAABAAAAAAABAAAAAAABAA", unrepeatablewords.getWord(k, n, allowed));
  }

  @Test
  public void case29() {
    int k = 3;
    int n = 50;
    int allowed = 20;
    assertEquals("AABAABAACAABAABAACAABAABAADAABAABAACAABAABAACAABAA", unrepeatablewords.getWord(k, n, allowed));
  }

  @Test
  public void case30() {
    int k = 5;
    int n = 40;
    int allowed = 20;
    assertEquals("AAAABAAAABAAAABAAAABAAAACAAAABAAAABAAAAB", unrepeatablewords.getWord(k, n, allowed));
  }

  @Test
  public void case31() {
    int k = 10;
    int n = 50;
    int allowed = 26;
    assertEquals("AAAAAAAAABAAAAAAAAABAAAAAAAAABAAAAAAAAABAAAAAAAAAB", unrepeatablewords.getWord(k, n, allowed));
  }

}
