package topc.test.parsing;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.parsing.*;

public class DerivationDisplayTest {
  DerivationDisplay derivationdisplay = new DerivationDisplay();

  @Test
  public void case1() {
    String input = "baabba";
    assertArrayEquals(new String[] { "S", "bUa", "baUa", "baaUa", "baabUa", "baabba" }, derivationdisplay.getDerivation(input));
  }

  @Test
  public void case2() {
    String input = "aaabb";
    assertArrayEquals(new String[] { "S", "T", "aTb", "aaTbb", "aaAbb", "aaabb" }, derivationdisplay.getDerivation(input));
  }

  @Test
  public void case3() {
    String input = "bbba";
    assertArrayEquals(new String[] { "S", "bUa", "bbUa", "bbba" }, derivationdisplay.getDerivation(input));
  }

  @Test
  public void case4() {
    String input = "baabba";
    assertArrayEquals(new String[] { "S", "bUa", "baUa", "baaUa", "baabUa", "baabba" }, derivationdisplay.getDerivation(input));
  }

  @Test
  public void case5() {
    String input = "a";
    assertArrayEquals(new String[] { "S", "T", "A", "a" }, derivationdisplay.getDerivation(input));
  }

  @Test
  public void case6() {
    String input = "b";
    assertArrayEquals(new String[] { "S", "T", "B", "b" }, derivationdisplay.getDerivation(input));
  }

  @Test
  public void case7() {
    String input = "aabbbbbbbb";
    assertArrayEquals(new String[] { "S", "T", "aTb", "aaTbb", "aaBbb", "aabBbb", "aabbBbb", "aabbbBbb", "aabbbbBbb", "aabbbbbBbb", "aabbbbbbbb" }, derivationdisplay.getDerivation(input));
  }

  @Test
  public void case8() {
    String input = "aaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbb";
    assertArrayEquals(new String[] { "S", "T", "aTb", "aaTbb", "aaaTbbb", "aaaaTbbbb", "aaaaaTbbbbb", "aaaaaaTbbbbbb", "aaaaaaaTbbbbbbb", "aaaaaaaaTbbbbbbbb", "aaaaaaaaaTbbbbbbbbb", "aaaaaaaaaaTbbbbbbbbbb", "aaaaaaaaaaaTbbbbbbbbbbb", "aaaaaaaaaaaaTbbbbbbbbbbbb", "aaaaaaaaaaaaaTbbbbbbbbbbbbb", "aaaaaaaaaaaaaaTbbbbbbbbbbbbbb", "aaaaaaaaaaaaaaaTbbbbbbbbbbbbbbb", "aaaaaaaaaaaaaaaaTbbbbbbbbbbbbbbbb", "aaaaaaaaaaaaaaaaaTbbbbbbbbbbbbbbbbb", "aaaaaaaaaaaaaaaaaaTbbbbbbbbbbbbbbbbbb", "aaaaaaaaaaaaaaaaaaaTbbbbbbbbbbbbbbbbbbb", "aaaaaaaaaaaaaaaaaaaaTbbbbbbbbbbbbbbbbbbbb", "aaaaaaaaaaaaaaaaaaaaBbbbbbbbbbbbbbbbbbbbb", "aaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbb" }, derivationdisplay.getDerivation(input));
  }

  @Test
  public void case9() {
    String input = "aaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbb";
    assertArrayEquals(new String[] { "S", "T", "aTb", "aaTbb", "aaaTbbb", "aaaaTbbbb", "aaaaaTbbbbb", "aaaaaaTbbbbbb", "aaaaaaaTbbbbbbb", "aaaaaaaaTbbbbbbbb", "aaaaaaaaaTbbbbbbbbb", "aaaaaaaaaaTbbbbbbbbbb", "aaaaaaaaaaaTbbbbbbbbbbb", "aaaaaaaaaaaaTbbbbbbbbbbbb", "aaaaaaaaaaaaaTbbbbbbbbbbbbb", "aaaaaaaaaaaaaaTbbbbbbbbbbbbbb", "aaaaaaaaaaaaaaaTbbbbbbbbbbbbbbb", "aaaaaaaaaaaaaaaaTbbbbbbbbbbbbbbbb", "aaaaaaaaaaaaaaaaaTbbbbbbbbbbbbbbbbb", "aaaaaaaaaaaaaaaaaaTbbbbbbbbbbbbbbbbbb", "aaaaaaaaaaaaaaaaaaaTbbbbbbbbbbbbbbbbbbb", "aaaaaaaaaaaaaaaaaaaaTbbbbbbbbbbbbbbbbbbbb", "aaaaaaaaaaaaaaaaaaaaAbbbbbbbbbbbbbbbbbbbb", "aaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbb" }, derivationdisplay.getDerivation(input));
  }

  @Test
  public void case10() {
    String input = "abbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb";
    assertArrayEquals(new String[] { "S", "T", "aTb", "aBb", "abBb", "abbBb", "abbbBb", "abbbbBb", "abbbbbBb", "abbbbbbBb", "abbbbbbbBb", "abbbbbbbbBb", "abbbbbbbbbBb", "abbbbbbbbbbBb", "abbbbbbbbbbbBb", "abbbbbbbbbbbbBb", "abbbbbbbbbbbbbBb", "abbbbbbbbbbbbbbBb", "abbbbbbbbbbbbbbbBb", "abbbbbbbbbbbbbbbbBb", "abbbbbbbbbbbbbbbbbBb", "abbbbbbbbbbbbbbbbbbBb", "abbbbbbbbbbbbbbbbbbbBb", "abbbbbbbbbbbbbbbbbbbbBb", "abbbbbbbbbbbbbbbbbbbbbBb", "abbbbbbbbbbbbbbbbbbbbbbBb", "abbbbbbbbbbbbbbbbbbbbbbbBb", "abbbbbbbbbbbbbbbbbbbbbbbbBb", "abbbbbbbbbbbbbbbbbbbbbbbbbBb", "abbbbbbbbbbbbbbbbbbbbbbbbbbBb", "abbbbbbbbbbbbbbbbbbbbbbbbbbbBb", "abbbbbbbbbbbbbbbbbbbbbbbbbbbbBb", "abbbbbbbbbbbbbbbbbbbbbbbbbbbbbBb", "abbbbbbbbbbbbbbbbbbbbbbbbbbbbbbBb", "abbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbBb", "abbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbBb", "abbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbBb", "abbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbBb", "abbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbBb", "abbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbBb", "abbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbBb", "abbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbBb", "abbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb" }, derivationdisplay.getDerivation(input));
  }

  @Test
  public void case11() {
    String input = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
    assertArrayEquals(new String[] { "S", "T", "aTb", "aAb", "aaAb", "aaaAb", "aaaaAb", "aaaaaAb", "aaaaaaAb", "aaaaaaaAb", "aaaaaaaaAb", "aaaaaaaaaAb", "aaaaaaaaaaAb", "aaaaaaaaaaaAb", "aaaaaaaaaaaaAb", "aaaaaaaaaaaaaAb", "aaaaaaaaaaaaaaAb", "aaaaaaaaaaaaaaaAb", "aaaaaaaaaaaaaaaaAb", "aaaaaaaaaaaaaaaaaAb", "aaaaaaaaaaaaaaaaaaAb", "aaaaaaaaaaaaaaaaaaaAb", "aaaaaaaaaaaaaaaaaaaaAb", "aaaaaaaaaaaaaaaaaaaaaAb", "aaaaaaaaaaaaaaaaaaaaaaAb", "aaaaaaaaaaaaaaaaaaaaaaaAb", "aaaaaaaaaaaaaaaaaaaaaaaaAb", "aaaaaaaaaaaaaaaaaaaaaaaaaAb", "aaaaaaaaaaaaaaaaaaaaaaaaaaAb", "aaaaaaaaaaaaaaaaaaaaaaaaaaaAb", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaAb", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaAb", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAb", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAb", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAb", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAb", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAb", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAb", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAb", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAb", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAb", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAb", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAb", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAb", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAb", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAb", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab" }, derivationdisplay.getDerivation(input));
  }

  @Test
  public void case12() {
    String input = "aaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    assertArrayEquals(new String[] { "S", "T", "A", "aA", "aaA", "aaaA", "aaaaA", "aaaaaA", "aaaaaaA", "aaaaaaaA", "aaaaaaaaA", "aaaaaaaaaA", "aaaaaaaaaaA", "aaaaaaaaaaaA", "aaaaaaaaaaaaA", "aaaaaaaaaaaaaA", "aaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa" }, derivationdisplay.getDerivation(input));
  }

  @Test
  public void case13() {
    String input = "bbbbbbbbbbbbbbbbbbbbbbbbbbbb";
    assertArrayEquals(new String[] { "S", "T", "B", "bB", "bbB", "bbbB", "bbbbB", "bbbbbB", "bbbbbbB", "bbbbbbbB", "bbbbbbbbB", "bbbbbbbbbB", "bbbbbbbbbbB", "bbbbbbbbbbbB", "bbbbbbbbbbbbB", "bbbbbbbbbbbbbB", "bbbbbbbbbbbbbbB", "bbbbbbbbbbbbbbbB", "bbbbbbbbbbbbbbbbB", "bbbbbbbbbbbbbbbbbB", "bbbbbbbbbbbbbbbbbbB", "bbbbbbbbbbbbbbbbbbbB", "bbbbbbbbbbbbbbbbbbbbB", "bbbbbbbbbbbbbbbbbbbbbB", "bbbbbbbbbbbbbbbbbbbbbbB", "bbbbbbbbbbbbbbbbbbbbbbbB", "bbbbbbbbbbbbbbbbbbbbbbbbB", "bbbbbbbbbbbbbbbbbbbbbbbbbB", "bbbbbbbbbbbbbbbbbbbbbbbbbbB", "bbbbbbbbbbbbbbbbbbbbbbbbbbbB", "bbbbbbbbbbbbbbbbbbbbbbbbbbbb" }, derivationdisplay.getDerivation(input));
  }

  @Test
  public void case14() {
    String input = "babababababababaabababababa";
    assertArrayEquals(new String[] { "S", "bUa", "baUa", "babUa", "babaUa", "bababUa", "bababaUa", "babababUa", "babababaUa", "bababababUa", "bababababaUa", "babababababUa", "babababababaUa", "bababababababUa", "bababababababaUa", "babababababababUa", "babababababababaUa", "babababababababaaUa", "babababababababaabUa", "babababababababaabaUa", "babababababababaababUa", "babababababababaababaUa", "babababababababaabababUa", "babababababababaabababaUa", "babababababababaababababUa", "babababababababaababababaUa", "babababababababaabababababa" }, derivationdisplay.getDerivation(input));
  }

  @Test
  public void case15() {
    String input = "baaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    assertArrayEquals(new String[] { "S", "bUa", "baUa", "baaUa", "baaaUa", "baaaaUa", "baaaaaUa", "baaaaaaUa", "baaaaaaaUa", "baaaaaaaaUa", "baaaaaaaaaUa", "baaaaaaaaaaUa", "baaaaaaaaaaaUa", "baaaaaaaaaaaaUa", "baaaaaaaaaaaaaUa", "baaaaaaaaaaaaaaUa", "baaaaaaaaaaaaaaaUa", "baaaaaaaaaaaaaaaaUa", "baaaaaaaaaaaaaaaaaUa", "baaaaaaaaaaaaaaaaaaUa", "baaaaaaaaaaaaaaaaaaaUa", "baaaaaaaaaaaaaaaaaaaaUa", "baaaaaaaaaaaaaaaaaaaaaUa", "baaaaaaaaaaaaaaaaaaaaaaUa", "baaaaaaaaaaaaaaaaaaaaaaaUa", "baaaaaaaaaaaaaaaaaaaaaaaaUa", "baaaaaaaaaaaaaaaaaaaaaaaaaUa", "baaaaaaaaaaaaaaaaaaaaaaaaaaUa", "baaaaaaaaaaaaaaaaaaaaaaaaaaaUa", "baaaaaaaaaaaaaaaaaaaaaaaaaaaaUa", "baaaaaaaaaaaaaaaaaaaaaaaaaaaaaUa", "baaaaaaaaaaaaaaaaaaaaaaaaaaaaaaUa", "baaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaUa", "baaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaUa", "baaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaUa", "baaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaUa", "baaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaUa", "baaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaUa", "baaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaUa", "baaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaUa", "baaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" }, derivationdisplay.getDerivation(input));
  }

  @Test
  public void case16() {
    String input = "baaaaaaaaaabbbbbbbbbbbbbbbbbbba";
    assertArrayEquals(new String[] { "S", "bUa", "baUa", "baaUa", "baaaUa", "baaaaUa", "baaaaaUa", "baaaaaaUa", "baaaaaaaUa", "baaaaaaaaUa", "baaaaaaaaaUa", "baaaaaaaaaaUa", "baaaaaaaaaabUa", "baaaaaaaaaabbUa", "baaaaaaaaaabbbUa", "baaaaaaaaaabbbbUa", "baaaaaaaaaabbbbbUa", "baaaaaaaaaabbbbbbUa", "baaaaaaaaaabbbbbbbUa", "baaaaaaaaaabbbbbbbbUa", "baaaaaaaaaabbbbbbbbbUa", "baaaaaaaaaabbbbbbbbbbUa", "baaaaaaaaaabbbbbbbbbbbUa", "baaaaaaaaaabbbbbbbbbbbbUa", "baaaaaaaaaabbbbbbbbbbbbbUa", "baaaaaaaaaabbbbbbbbbbbbbbUa", "baaaaaaaaaabbbbbbbbbbbbbbbUa", "baaaaaaaaaabbbbbbbbbbbbbbbbUa", "baaaaaaaaaabbbbbbbbbbbbbbbbbUa", "baaaaaaaaaabbbbbbbbbbbbbbbbbbUa", "baaaaaaaaaabbbbbbbbbbbbbbbbbbba" }, derivationdisplay.getDerivation(input));
  }

  @Test
  public void case17() {
    String input = "bababababababbabbaaababaabaaaababababababa";
    assertArrayEquals(new String[] { "S", "bUa", "baUa", "babUa", "babaUa", "bababUa", "bababaUa", "babababUa", "babababaUa", "bababababUa", "bababababaUa", "babababababUa", "babababababaUa", "bababababababUa", "bababababababbUa", "bababababababbaUa", "bababababababbabUa", "bababababababbabbUa", "bababababababbabbaUa", "bababababababbabbaaUa", "bababababababbabbaaaUa", "bababababababbabbaaabUa", "bababababababbabbaaabaUa", "bababababababbabbaaababUa", "bababababababbabbaaababaUa", "bababababababbabbaaababaaUa", "bababababababbabbaaababaabUa", "bababababababbabbaaababaabaUa", "bababababababbabbaaababaabaaUa", "bababababababbabbaaababaabaaaUa", "bababababababbabbaaababaabaaaaUa", "bababababababbabbaaababaabaaaabUa", "bababababababbabbaaababaabaaaabaUa", "bababababababbabbaaababaabaaaababUa", "bababababababbabbaaababaabaaaababaUa", "bababababababbabbaaababaabaaaabababUa", "bababababababbabbaaababaabaaaabababaUa", "bababababababbabbaaababaabaaaababababUa", "bababababababbabbaaababaabaaaababababaUa", "bababababababbabbaaababaabaaaabababababUa", "bababababababbabbaaababaabaaaabababababaUa", "bababababababbabbaaababaabaaaababababababa" }, derivationdisplay.getDerivation(input));
  }

  @Test
  public void case18() {
    String input = "aaaaaaaaaaabbbbbbbbbbbbbbbbbbb";
    assertArrayEquals(new String[] { "S", "T", "aTb", "aaTbb", "aaaTbbb", "aaaaTbbbb", "aaaaaTbbbbb", "aaaaaaTbbbbbb", "aaaaaaaTbbbbbbb", "aaaaaaaaTbbbbbbbb", "aaaaaaaaaTbbbbbbbbb", "aaaaaaaaaaTbbbbbbbbbb", "aaaaaaaaaaaTbbbbbbbbbbb", "aaaaaaaaaaaBbbbbbbbbbbb", "aaaaaaaaaaabBbbbbbbbbbbb", "aaaaaaaaaaabbBbbbbbbbbbbb", "aaaaaaaaaaabbbBbbbbbbbbbbb", "aaaaaaaaaaabbbbBbbbbbbbbbbb", "aaaaaaaaaaabbbbbBbbbbbbbbbbb", "aaaaaaaaaaabbbbbbBbbbbbbbbbbb", "aaaaaaaaaaabbbbbbbBbbbbbbbbbbb", "aaaaaaaaaaabbbbbbbbbbbbbbbbbbb" }, derivationdisplay.getDerivation(input));
  }

  @Test
  public void case19() {
    String input = "baa";
    assertArrayEquals(new String[] { "S", "bUa", "baa" }, derivationdisplay.getDerivation(input));
  }

  @Test
  public void case20() {
    String input = "bba";
    assertArrayEquals(new String[] { "S", "bUa", "bba" }, derivationdisplay.getDerivation(input));
  }

  @Test
  public void case21() {
    String input = "aab";
    assertArrayEquals(new String[] { "S", "T", "aTb", "aAb", "aab" }, derivationdisplay.getDerivation(input));
  }

  @Test
  public void case22() {
    String input = "abb";
    assertArrayEquals(new String[] { "S", "T", "aTb", "aBb", "abb" }, derivationdisplay.getDerivation(input));
  }

  @Test
  public void case23() {
    String input = "aabbbbbbbb";
    assertArrayEquals(new String[] { "S", "T", "aTb", "aaTbb", "aaBbb", "aabBbb", "aabbBbb", "aabbbBbb", "aabbbbBbb", "aabbbbbBbb", "aabbbbbbbb" }, derivationdisplay.getDerivation(input));
  }

  @Test
  public void case24() {
    String input = "aaaa";
    assertArrayEquals(new String[] { "S", "T", "A", "aA", "aaA", "aaaA", "aaaa" }, derivationdisplay.getDerivation(input));
  }

  @Test
  public void case25() {
    String input = "baabba";
    assertArrayEquals(new String[] { "S", "bUa", "baUa", "baaUa", "baabUa", "baabba" }, derivationdisplay.getDerivation(input));
  }

  @Test
  public void case26() {
    String input = "aab";
    assertArrayEquals(new String[] { "S", "T", "aTb", "aAb", "aab" }, derivationdisplay.getDerivation(input));
  }

  @Test
  public void case27() {
    String input = "b";
    assertArrayEquals(new String[] { "S", "T", "B", "b" }, derivationdisplay.getDerivation(input));
  }

  @Test
  public void case28() {
    String input = "bb";
    assertArrayEquals(new String[] { "S", "T", "B", "bB", "bb" }, derivationdisplay.getDerivation(input));
  }

  @Test
  public void case29() {
    String input = "aaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbb";
    assertArrayEquals(new String[] { "S", "T", "aTb", "aaTbb", "aaaTbbb", "aaaaTbbbb", "aaaaaTbbbbb", "aaaaaaTbbbbbb", "aaaaaaaTbbbbbbb", "aaaaaaaaTbbbbbbbb", "aaaaaaaaaTbbbbbbbbb", "aaaaaaaaaBbbbbbbbbb", "aaaaaaaaabBbbbbbbbbb", "aaaaaaaaabbBbbbbbbbbb", "aaaaaaaaabbbBbbbbbbbbb", "aaaaaaaaabbbbBbbbbbbbbb", "aaaaaaaaabbbbbBbbbbbbbbb", "aaaaaaaaabbbbbbBbbbbbbbbb", "aaaaaaaaabbbbbbbBbbbbbbbbb", "aaaaaaaaabbbbbbbbBbbbbbbbbb", "aaaaaaaaabbbbbbbbbBbbbbbbbbb", "aaaaaaaaabbbbbbbbbbBbbbbbbbbb", "aaaaaaaaabbbbbbbbbbbBbbbbbbbbb", "aaaaaaaaabbbbbbbbbbbbBbbbbbbbbb", "aaaaaaaaabbbbbbbbbbbbbBbbbbbbbbb", "aaaaaaaaabbbbbbbbbbbbbbBbbbbbbbbb", "aaaaaaaaabbbbbbbbbbbbbbbBbbbbbbbbb", "aaaaaaaaabbbbbbbbbbbbbbbbBbbbbbbbbb", "aaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbb" }, derivationdisplay.getDerivation(input));
  }

  @Test
  public void case30() {
    String input = "baa";
    assertArrayEquals(new String[] { "S", "bUa", "baa" }, derivationdisplay.getDerivation(input));
  }

  @Test
  public void case31() {
    String input = "babbbbbbbbaaaaabbbbbbaaababbbbbbbbbaaaaabbbbbababa";
    assertArrayEquals(new String[] { "S", "bUa", "baUa", "babUa", "babbUa", "babbbUa", "babbbbUa", "babbbbbUa", "babbbbbbUa", "babbbbbbbUa", "babbbbbbbbUa", "babbbbbbbbaUa", "babbbbbbbbaaUa", "babbbbbbbbaaaUa", "babbbbbbbbaaaaUa", "babbbbbbbbaaaaaUa", "babbbbbbbbaaaaabUa", "babbbbbbbbaaaaabbUa", "babbbbbbbbaaaaabbbUa", "babbbbbbbbaaaaabbbbUa", "babbbbbbbbaaaaabbbbbUa", "babbbbbbbbaaaaabbbbbbUa", "babbbbbbbbaaaaabbbbbbaUa", "babbbbbbbbaaaaabbbbbbaaUa", "babbbbbbbbaaaaabbbbbbaaaUa", "babbbbbbbbaaaaabbbbbbaaabUa", "babbbbbbbbaaaaabbbbbbaaabaUa", "babbbbbbbbaaaaabbbbbbaaababUa", "babbbbbbbbaaaaabbbbbbaaababbUa", "babbbbbbbbaaaaabbbbbbaaababbbUa", "babbbbbbbbaaaaabbbbbbaaababbbbUa", "babbbbbbbbaaaaabbbbbbaaababbbbbUa", "babbbbbbbbaaaaabbbbbbaaababbbbbbUa", "babbbbbbbbaaaaabbbbbbaaababbbbbbbUa", "babbbbbbbbaaaaabbbbbbaaababbbbbbbbUa", "babbbbbbbbaaaaabbbbbbaaababbbbbbbbbUa", "babbbbbbbbaaaaabbbbbbaaababbbbbbbbbaUa", "babbbbbbbbaaaaabbbbbbaaababbbbbbbbbaaUa", "babbbbbbbbaaaaabbbbbbaaababbbbbbbbbaaaUa", "babbbbbbbbaaaaabbbbbbaaababbbbbbbbbaaaaUa", "babbbbbbbbaaaaabbbbbbaaababbbbbbbbbaaaaaUa", "babbbbbbbbaaaaabbbbbbaaababbbbbbbbbaaaaabUa", "babbbbbbbbaaaaabbbbbbaaababbbbbbbbbaaaaabbUa", "babbbbbbbbaaaaabbbbbbaaababbbbbbbbbaaaaabbbUa", "babbbbbbbbaaaaabbbbbbaaababbbbbbbbbaaaaabbbbUa", "babbbbbbbbaaaaabbbbbbaaababbbbbbbbbaaaaabbbbbUa", "babbbbbbbbaaaaabbbbbbaaababbbbbbbbbaaaaabbbbbaUa", "babbbbbbbbaaaaabbbbbbaaababbbbbbbbbaaaaabbbbbabUa", "babbbbbbbbaaaaabbbbbbaaababbbbbbbbbaaaaabbbbbabaUa", "babbbbbbbbaaaaabbbbbbaaababbbbbbbbbaaaaabbbbbababa" }, derivationdisplay.getDerivation(input));
  }

  @Test
  public void case32() {
    String input = "aaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbb";
    assertArrayEquals(new String[] { "S", "T", "aTb", "aaTbb", "aaaTbbb", "aaaaTbbbb", "aaaaaTbbbbb", "aaaaaaTbbbbbb", "aaaaaaaTbbbbbbb", "aaaaaaaaTbbbbbbbb", "aaaaaaaaaTbbbbbbbbb", "aaaaaaaaaaTbbbbbbbbbb", "aaaaaaaaaaaTbbbbbbbbbbb", "aaaaaaaaaaaaTbbbbbbbbbbbb", "aaaaaaaaaaaaaTbbbbbbbbbbbbb", "aaaaaaaaaaaaaaTbbbbbbbbbbbbbb", "aaaaaaaaaaaaaaaTbbbbbbbbbbbbbbb", "aaaaaaaaaaaaaaaaTbbbbbbbbbbbbbbbb", "aaaaaaaaaaaaaaaaaTbbbbbbbbbbbbbbbbb", "aaaaaaaaaaaaaaaaaaTbbbbbbbbbbbbbbbbbb", "aaaaaaaaaaaaaaaaaaaTbbbbbbbbbbbbbbbbbbb", "aaaaaaaaaaaaaaaaaaaaTbbbbbbbbbbbbbbbbbbbb", "aaaaaaaaaaaaaaaaaaaaaTbbbbbbbbbbbbbbbbbbbbb", "aaaaaaaaaaaaaaaaaaaaaaTbbbbbbbbbbbbbbbbbbbbbb", "aaaaaaaaaaaaaaaaaaaaaaaTbbbbbbbbbbbbbbbbbbbbbbb", "aaaaaaaaaaaaaaaaaaaaaaaaTbbbbbbbbbbbbbbbbbbbbbbbb", "aaaaaaaaaaaaaaaaaaaaaaaaAbbbbbbbbbbbbbbbbbbbbbbbb", "aaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbb" }, derivationdisplay.getDerivation(input));
  }

  @Test
  public void case33() {
    String input = "babababababababababababababababababababababababaa";
    assertArrayEquals(new String[] { "S", "bUa", "baUa", "babUa", "babaUa", "bababUa", "bababaUa", "babababUa", "babababaUa", "bababababUa", "bababababaUa", "babababababUa", "babababababaUa", "bababababababUa", "bababababababaUa", "babababababababUa", "babababababababaUa", "bababababababababUa", "bababababababababaUa", "babababababababababUa", "babababababababababaUa", "bababababababababababUa", "bababababababababababaUa", "babababababababababababUa", "babababababababababababaUa", "bababababababababababababUa", "bababababababababababababaUa", "babababababababababababababUa", "babababababababababababababaUa", "bababababababababababababababUa", "bababababababababababababababaUa", "babababababababababababababababUa", "babababababababababababababababaUa", "bababababababababababababababababUa", "bababababababababababababababababaUa", "babababababababababababababababababUa", "babababababababababababababababababaUa", "bababababababababababababababababababUa", "bababababababababababababababababababaUa", "babababababababababababababababababababUa", "babababababababababababababababababababaUa", "bababababababababababababababababababababUa", "bababababababababababababababababababababaUa", "babababababababababababababababababababababUa", "babababababababababababababababababababababaUa", "bababababababababababababababababababababababUa", "bababababababababababababababababababababababaUa", "babababababababababababababababababababababababUa", "babababababababababababababababababababababababaa" }, derivationdisplay.getDerivation(input));
  }

  @Test
  public void case34() {
    String input = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    assertArrayEquals(new String[] { "S", "T", "A", "aA", "aaA", "aaaA", "aaaaA", "aaaaaA", "aaaaaaA", "aaaaaaaA", "aaaaaaaaA", "aaaaaaaaaA", "aaaaaaaaaaA", "aaaaaaaaaaaA", "aaaaaaaaaaaaA", "aaaaaaaaaaaaaA", "aaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" }, derivationdisplay.getDerivation(input));
  }

  @Test
  public void case35() {
    String input = "bbbbbbbbbb";
    assertArrayEquals(new String[] { "S", "T", "B", "bB", "bbB", "bbbB", "bbbbB", "bbbbbB", "bbbbbbB", "bbbbbbbB", "bbbbbbbbB", "bbbbbbbbbB", "bbbbbbbbbb" }, derivationdisplay.getDerivation(input));
  }

  @Test
  public void case36() {
    String input = "bbbaaba";
    assertArrayEquals(new String[] { "S", "bUa", "bbUa", "bbbUa", "bbbaUa", "bbbaaUa", "bbbaaba" }, derivationdisplay.getDerivation(input));
  }

}
