package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class EasyConversionMachineTest {
  EasyConversionMachine easyconversionmachine = new EasyConversionMachine();

  @Test
  public void case1() {
    String originalWord = "aababba";
    String finalWord = "bbbbbbb";
    int k = 2;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case2() {
    String originalWord = "aabb";
    String finalWord = "aabb";
    int k = 1;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case3() {
    String originalWord = "aaaaabaa";
    String finalWord = "bbbbbabb";
    int k = 8;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case4() {
    String originalWord = "aaa";
    String finalWord = "bab";
    int k = 4;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case5() {
    String originalWord = "aaa";
    String finalWord = "bab";
    int k = 5;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case6() {
    String originalWord = "aba";
    String finalWord = "bab";
    int k = 5;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case7() {
    String originalWord = "aababbabaa";
    String finalWord = "abbbbaabab";
    int k = 9;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case8() {
    String originalWord = "ababbababab";
    String finalWord = "bababaabaaa";
    int k = 36;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case9() {
    String originalWord = "aabaababaaaabbaaaaaabbaabba";
    String finalWord = "bbbbabbabaabaabaabaaabbbabb";
    int k = 20;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case10() {
    String originalWord = "aababbabaabbbbbbaab";
    String finalWord = "abbbabaabbbbbaaaaaa";
    int k = 31;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case11() {
    String originalWord = "abbbaaabbaaababbaabbbaaabbbaabbbaabbaaaabb";
    String finalWord = "aaabbaaabbaabbababbbbbbbbbabbbbabbaaaabbba";
    int k = 15;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case12() {
    String originalWord = "ababbabbaaabbaabaabbabbbaaaaaaaba";
    String finalWord = "bbbabbabababbaaaaaabababaababaaaa";
    int k = 19;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case13() {
    String originalWord = "aaaaabaabaa";
    String finalWord = "aabaababaab";
    int k = 17;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case14() {
    String originalWord = "baabbaaabbbaaabbabbbbaaab";
    String finalWord = "baaabaaaaabbaabbbaaaaabab";
    int k = 47;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case15() {
    String originalWord = "babbabbababaabbaabbaaabaabba";
    String finalWord = "bbbaaabababbaaaababbaabbbbab";
    int k = 7;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case16() {
    String originalWord = "bababbabababaaababbabababbabbaaabaa";
    String finalWord = "bbbbbaaaaaababbabbbabaabbbbabbbbbbb";
    int k = 6;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case17() {
    String originalWord = "abaabbbababbbbbabbaabaaabbbaabbbabbbaba";
    String finalWord = "babaaaaaababbbbaabbbaabbaabbaaaaabbbbaa";
    int k = 5;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case18() {
    String originalWord = "bbbbababaaaaabbbaabbabaaabaabbbbb";
    String finalWord = "babbbbaabbabaaabbaaabbbaaaaabaaab";
    int k = 46;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case19() {
    String originalWord = "baabbaabbabbbaababaabbbaabaabbaaabbbabbabbba";
    String finalWord = "abbbbabbababbbaaabbbbaababaaabaabbbaabaaabba";
    int k = 14;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case20() {
    String originalWord = "aabababbabbaaaab";
    String finalWord = "aababababbababaa";
    int k = 27;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case21() {
    String originalWord = "bbabbbabbba";
    String finalWord = "ababaabaaba";
    int k = 16;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case22() {
    String originalWord = "aaababaaabaababbabbabaaaa";
    String finalWord = "baabbabbaabaaabababaaaaaa";
    int k = 10;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case23() {
    String originalWord = "abbabaabbbbbababbabbbbbbbaaaabbbabbababbbaaaaa";
    String finalWord = "aaaaaaaaababbaabbaabbababbbbbaabaabbbaabbabbba";
    int k = 20;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case24() {
    String originalWord = "abaabbaaaaabbaabbbbabbbaba";
    String finalWord = "abababbabbbaaaaabaabbaaaab";
    int k = 19;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case25() {
    String originalWord = "aababbaaabbaaaaabbabaabaaabbaabbb";
    String finalWord = "aabbabbababababbababbbbbaabaabaaa";
    int k = 5;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case26() {
    String originalWord = "babaaaaabaabbaaaaaa";
    String finalWord = "baaaabbabaabbbbabab";
    int k = 45;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case27() {
    String originalWord = "abbaabbbbaabbbbabbaabbbaab";
    String finalWord = "baabbabbbbbbbaaabbaaabbabb";
    int k = 11;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case28() {
    String originalWord = "abaababbaabbbbbabbbb";
    String finalWord = "bbaaaabbaababbaaaaba";
    int k = 1;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case29() {
    String originalWord = "aabaaabaaaaaabbbaaabbbabbbbabbaaaaabaabbbabababb";
    String finalWord = "aabaabbababaabaabbbbbbabbabbabaaababbaababaabbaa";
    int k = 30;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case30() {
    String originalWord = "b";
    String finalWord = "a";
    int k = 46;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case31() {
    String originalWord = "babbaababaaabaabaaaaabbbaaab";
    String finalWord = "baababaaabababbaabbbaaaabbaa";
    int k = 32;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case32() {
    String originalWord = "aaaababaaaaabbbbaaab";
    String finalWord = "aaabbbababbbaaaaabab";
    int k = 41;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case33() {
    String originalWord = "baabbabbbbabaab";
    String finalWord = "baaaabbbbaaabba";
    int k = 50;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case34() {
    String originalWord = "ababababaabaabbbabbbbbbbbaabaabaababaabbbb";
    String finalWord = "baaaabbaabbbbabaaaababaaabbbabbababaababaa";
    int k = 20;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case35() {
    String originalWord = "abbbaaabbaaaaaabbbbbababaab";
    String finalWord = "bbaabaaabbbbabbbbbbbabaabaa";
    int k = 4;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case36() {
    String originalWord = "bab";
    String finalWord = "abb";
    int k = 49;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case37() {
    String originalWord = "abbbaaabbbabbbabbbbabaaabbabbb";
    String finalWord = "aaabbabbabbabbabaababbaaaaabba";
    int k = 10;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case38() {
    String originalWord = "bbabaabbabaabbbabbabbaabbbaababaabbbbabb";
    String finalWord = "baabbabbabbaabaaabaabaaabababbababbbbbba";
    int k = 1;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case39() {
    String originalWord = "aaababbbbaaababababbaabaabbaaabaaaaabababaaababbab";
    String finalWord = "abbababbabbbabbbbbababaabbaaaaaabbbbbaaaaaabbbaaab";
    int k = 24;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case40() {
    String originalWord = "abbbbaabababaaabbabbbabbaaabba";
    String finalWord = "babbaaaaabbabababbbbbbaabbaaab";
    int k = 31;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case41() {
    String originalWord = "a";
    String finalWord = "b";
    int k = 28;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case42() {
    String originalWord = "babaabababbaaabaabbaaababbaaaaaaabaabbabbabaaaaa";
    String finalWord = "aabbbaaabababbabbabbbbbbbaababbababbabaababbabab";
    int k = 37;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case43() {
    String originalWord = "bbbbbbbaaaaabbbabababa";
    String finalWord = "abbabbaabbaabababbbaba";
    int k = 43;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case44() {
    String originalWord = "bbababababbbbbbbaaaaabbbaaabbaaaa";
    String finalWord = "abaaaaabbbbbaabaaabbaabaaababbaaa";
    int k = 11;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case45() {
    String originalWord = "abababbaaabbaaabba";
    String finalWord = "baabaaaaabbbababba";
    int k = 43;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case46() {
    String originalWord = "aa";
    String finalWord = "aa";
    int k = 1;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case47() {
    String originalWord = "bbabbbaabbbbbabbbabbaaabababbb";
    String finalWord = "bbaabbaaaaabaaababbbbbbababbbb";
    int k = 12;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case48() {
    String originalWord = "bbbaabab";
    String finalWord = "aaaabbaa";
    int k = 29;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case49() {
    String originalWord = "bbbabbabababbaaaaababbbababbabba";
    String finalWord = "bbbabaababbaaaaaaababbababbbabab";
    int k = 21;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case50() {
    String originalWord = "aabbbaabbbaaabbababbabbaabbaaababbbba";
    String finalWord = "aaabbbabbaaaaaaababbaaabaabbbaabaaaaa";
    int k = 23;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case51() {
    String originalWord = "bbbbbaaabab";
    String finalWord = "ababbaaabbb";
    int k = 27;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case52() {
    String originalWord = "abbaaabbaababbababbabaababaababbbabbbaa";
    String finalWord = "baabaaaaabbbbbbbbabaabbbbaaaaaaababbbab";
    int k = 16;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case53() {
    String originalWord = "abbaaabbaababaaabbbbabbabbaaaabababaabaabbb";
    String finalWord = "ababbaaababbaaaaaabbbabaababbbaabbaababbaba";
    int k = 46;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case54() {
    String originalWord = "bbbbaaabbabbbaabbaaabbbbabbaababaabbabaaabaa";
    String finalWord = "abbababaabaaabaaaababababbaabaabaabaaabbaaaa";
    int k = 13;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case55() {
    String originalWord = "bbabbbbbaababababb";
    String finalWord = "baabababbbaaababab";
    int k = 10;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case56() {
    String originalWord = "aabaaababaabbaaaaaaaaa";
    String finalWord = "aabaabbbaaaaaaabaabbab";
    int k = 21;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case57() {
    String originalWord = "abbaaababaabbabbabbaabaabaababaabaaaaaaaaabbbbbb";
    String finalWord = "abbbaaababbbaaabbbbbaaaaaaaaababbbaabaabababaabb";
    int k = 37;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case58() {
    String originalWord = "bbbbabaabaabaaababbbbbabaaabbbb";
    String finalWord = "bbabbbabbaabbbbbbababbbbbaababa";
    int k = 37;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case59() {
    String originalWord = "baaaabbbaaa";
    String finalWord = "bbaababbbaa";
    int k = 25;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case60() {
    String originalWord = "abaaaaabbbbaaababaaaabbabbaaabaabaabbb";
    String finalWord = "aabbabaabbaabbbbaababbaaaaabbabababbaa";
    int k = 5;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case61() {
    String originalWord = "abbaaaaabbbbbbbabaaabbabab";
    String finalWord = "bbbaabaaaabaabaabbaababaab";
    int k = 29;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case62() {
    String originalWord = "baab";
    String finalWord = "aabb";
    int k = 6;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case63() {
    String originalWord = "abbab";
    String finalWord = "aabba";
    int k = 4;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case64() {
    String originalWord = "baaaaabababbbbbaabbaba";
    String finalWord = "bababbbbabbaaaabaabbbb";
    int k = 12;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case65() {
    String originalWord = "baaaaaabbaabbaababbaa";
    String finalWord = "abbbbabbbbbaaabaababa";
    int k = 21;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case66() {
    String originalWord = "bbaaabbbbbaabbbaaababbbbbaab";
    String finalWord = "aaaaaaababbbabbabaaabababbba";
    int k = 25;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case67() {
    String originalWord = "abbabbbbaababbaabbaaaabababaabbabbbabbabbabb";
    String finalWord = "aaaabbababaaaabbabaabbaaaabaabbbbaabbbababba";
    int k = 29;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case68() {
    String originalWord = "abaabbabababbbbaabaab";
    String finalWord = "baabbababbabaabbbbbbb";
    int k = 44;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case69() {
    String originalWord = "bbaaaaabbababababaaabaababbabaaabbbabb";
    String finalWord = "abaabbbbabbababababaaabbaaaaababaababb";
    int k = 45;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case70() {
    String originalWord = "abaaabbbbabbbbbbbbabbbabbbbaaaaba";
    String finalWord = "aababbbaaabbabbaaabaababaaaaabbbb";
    int k = 44;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case71() {
    String originalWord = "bab";
    String finalWord = "bbb";
    int k = 19;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case72() {
    String originalWord = "bbababaaababbabbabababb";
    String finalWord = "aabaabaaaaabaaabbbbbaab";
    int k = 18;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case73() {
    String originalWord = "aaabbabaabbbabbaaaaabbaaabbabaabbababbab";
    String finalWord = "bbbaabbabaababbaaaaaaaaaabbabaabbabbaaab";
    int k = 29;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case74() {
    String originalWord = "baabbaabba";
    String finalWord = "aaaaababab";
    int k = 93;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case75() {
    String originalWord = "abab";
    String finalWord = "abba";
    int k = 47;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case76() {
    String originalWord = "bbaaabaabaabaababaabaaababaaabbabbbaab";
    String finalWord = "baaabbbbababaababbbaaababaaabaabbbbabb";
    int k = 10;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case77() {
    String originalWord = "babbabb";
    String finalWord = "aaabbab";
    int k = 39;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case78() {
    String originalWord = "bababaaababb";
    String finalWord = "bbabababbaab";
    int k = 28;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case79() {
    String originalWord = "abaabbbbbabbbabbbabbbaabaabba";
    String finalWord = "abbaaaaaabbaaaaaaabbbabbaaaab";
    int k = 3;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case80() {
    String originalWord = "bbabababbaababbabbbababbb";
    String finalWord = "abaaaababaaabaaababbbaaab";
    int k = 3;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case81() {
    String originalWord = "bbaabbababbabbbabbabbbbaabbbbabbbab";
    String finalWord = "baaabaabbaabbaabababbabaabbbaaaaaaa";
    int k = 33;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case82() {
    String originalWord = "baaaaabbababaaaaaabaaaaabaabbbaaabaaabbabbbabaaba";
    String finalWord = "ababbaabbabbaaabaababbaabbaababbabbbbabbaaaabbbba";
    int k = 30;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case83() {
    String originalWord = "bbabbbbaaaaabbbaabbbabbbabbaaabbaa";
    String finalWord = "baaaabbbabaabbaababbabababaabaaaab";
    int k = 47;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case84() {
    String originalWord = "babbaabaaabaabbbabaaabbbababaaabbaabbaaabbaaab";
    String finalWord = "baaabaabaaaaabababbabbbaaaababaababaaabaabbaab";
    int k = 11;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case85() {
    String originalWord = "abbbbababbbbaaabaaaba";
    String finalWord = "aabbbbabbabbbbbabaaba";
    int k = 29;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case86() {
    String originalWord = "aaabaababbaaaabbababa";
    String finalWord = "abbabaaabaabbbbabaaba";
    int k = 97;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case87() {
    String originalWord = "ababaaabaabababbbbabbbb";
    String finalWord = "abaabbaaaabaabbbbbbabab";
    int k = 100;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case88() {
    String originalWord = "bbbaabbabbbabababbabbbbabbabbbaaabab";
    String finalWord = "babaaaaaaaaabababaabbbaaaababbbabbaa";
    int k = 35;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case89() {
    String originalWord = "aabbbbbbab";
    String finalWord = "baaabaabba";
    int k = 32;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case90() {
    String originalWord = "babbbbaabaabbaaaaaaaaaaabbbbabababaabbaaabaabbb";
    String finalWord = "aaaababbabbbbabaaababbbabbbbaaaabbaaaababbbbbbb";
    int k = 1;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case91() {
    String originalWord = "bbbbbbaaabbababaabbaabbaaaabaababaaaa";
    String finalWord = "aaaaaaabbbaabaaabbaabbaaabaaabaabaabb";
    int k = 92;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case92() {
    String originalWord = "bbbabaaabababaaaaaababbaaaba";
    String finalWord = "bbabbbbabbbbaaaabaaabbbabaaa";
    int k = 37;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case93() {
    String originalWord = "bbbabaabababbbabbbabaaaba";
    String finalWord = "aabaababaaaaabbbaaaaaaabb";
    int k = 11;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case94() {
    String originalWord = "babaabbaabaabbba";
    String finalWord = "aabbbabbababbaab";
    int k = 29;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case95() {
    String originalWord = "aabaabbabbbababbbbb";
    String finalWord = "babbbbbbbaababbbbab";
    int k = 7;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case96() {
    String originalWord = "aabaabaaababaabbbbabbabbbabba";
    String finalWord = "abbbbaabbaababaaabbbbbaaabbba";
    int k = 26;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case97() {
    String originalWord = "a";
    String finalWord = "b";
    int k = 34;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case98() {
    String originalWord = "aabbabbababaabaaaaaababaaab";
    String finalWord = "aabaabbabababbbbbbaaaababab";
    int k = 43;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case99() {
    String originalWord = "aaaaaabbabaaaababbababbaababbaaab";
    String finalWord = "baaaaabababbbbabaaabbabbbbabbbbbb";
    int k = 14;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case100() {
    String originalWord = "ababbbabaababbbaaabbabbabba";
    String finalWord = "bbbabaaaabbbaaabbbbbababbaa";
    int k = 33;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case101() {
    String originalWord = "bbaabbabaabbabaabbaaababbbaaaaaabbbbbbaaaaaaabba";
    String finalWord = "ababbaabaaabaabbbaaabbbbbaabbbabbbbbbbbabbabaaba";
    int k = 36;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case102() {
    String originalWord = "bbabbababaaabaabbbababaabaabbbbbaaaaabababbab";
    String finalWord = "aaaaabababbbbbabaaabbbabbbaababbbbaaaabbabbbb";
    int k = 93;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case103() {
    String originalWord = "bababbaaabbaaabababbbabbbbbbaababaaababaaaabaaa";
    String finalWord = "aabbabbabbbbbabbbaabaabaabaababbbaaaaaabbabbabb";
    int k = 14;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case104() {
    String originalWord = "abababaaabb";
    String finalWord = "bbbbbbbbbba";
    int k = 19;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case105() {
    String originalWord = "bbbabbbaabaaaabbbbbbbbaababbaaabaaaababaabbb";
    String finalWord = "aaaabaabaababaabbaaaabbabbbbbbaabaaabbaaabab";
    int k = 30;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case106() {
    String originalWord = "aaaaabaababaabbabbbaaabbbaabaaabaabbaaaaabbbbbb";
    String finalWord = "baaababbbabbabbbabaaababaaababbaaabbbabbbbbbbbb";
    int k = 93;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case107() {
    String originalWord = "bbbbaabaaabbbbbbaabbaabbbbabaababaabbaaabaaaba";
    String finalWord = "babbabbaaababbaaabbaabbbbaabababaabbbaabbbaaaa";
    int k = 24;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case108() {
    String originalWord = "a";
    String finalWord = "b";
    int k = 1;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case109() {
    String originalWord = "aaaaa";
    String finalWord = "bbbbb";
    int k = 3;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case110() {
    String originalWord = "aabbb";
    String finalWord = "bbbbb";
    int k = 3;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case111() {
    String originalWord = "aa";
    String finalWord = "aa";
    int k = 2;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case112() {
    String originalWord = "aaabb";
    String finalWord = "bbbbb";
    int k = 5;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case113() {
    String originalWord = "aaaa";
    String finalWord = "aaaa";
    int k = 10;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case114() {
    String originalWord = "abab";
    String finalWord = "baba";
    int k = 5;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case115() {
    String originalWord = "a";
    String finalWord = "a";
    int k = 2;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case116() {
    String originalWord = "aaaa";
    String finalWord = "babb";
    int k = 5;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case117() {
    String originalWord = "aaa";
    String finalWord = "bbb";
    int k = 5;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case118() {
    String originalWord = "a";
    String finalWord = "b";
    int k = 90;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case119() {
    String originalWord = "aabb";
    String finalWord = "bbaa";
    int k = 2;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case120() {
    String originalWord = "aaaaa";
    String finalWord = "bbbaa";
    int k = 5;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case121() {
    String originalWord = "bab";
    String finalWord = "aaa";
    int k = 10;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case122() {
    String originalWord = "abab";
    String finalWord = "abab";
    int k = 4;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case123() {
    String originalWord = "ab";
    String finalWord = "ba";
    int k = 10;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case124() {
    String originalWord = "a";
    String finalWord = "a";
    int k = 1;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case125() {
    String originalWord = "aab";
    String finalWord = "aab";
    int k = 2;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case126() {
    String originalWord = "aa";
    String finalWord = "aa";
    int k = 4;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case127() {
    String originalWord = "aaab";
    String finalWord = "bbbb";
    int k = 5;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case128() {
    String originalWord = "aaa";
    String finalWord = "aaa";
    int k = 2;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case129() {
    String originalWord = "aa";
    String finalWord = "aa";
    int k = 3;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case130() {
    String originalWord = "abbba";
    String finalWord = "aaaaa";
    int k = 5;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case131() {
    String originalWord = "aaa";
    String finalWord = "aaa";
    int k = 100;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case132() {
    String originalWord = "ab";
    String finalWord = "aa";
    int k = 2;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case133() {
    String originalWord = "aaab";
    String finalWord = "abba";
    int k = 5;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case134() {
    String originalWord = "abbba";
    String finalWord = "abbba";
    int k = 2;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case135() {
    String originalWord = "a";
    String finalWord = "b";
    int k = 2;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case136() {
    String originalWord = "aaaa";
    String finalWord = "bbbb";
    int k = 2;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case137() {
    String originalWord = "ab";
    String finalWord = "ab";
    int k = 2;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case138() {
    String originalWord = "abbab";
    String finalWord = "babaa";
    int k = 1;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case139() {
    String originalWord = "aaaaa";
    String finalWord = "bbbbb";
    int k = 7;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case140() {
    String originalWord = "aaa";
    String finalWord = "aaa";
    int k = 3;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case141() {
    String originalWord = "aaab";
    String finalWord = "bbaa";
    int k = 5;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case142() {
    String originalWord = "aa";
    String finalWord = "aa";
    int k = 100;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case143() {
    String originalWord = "aaa";
    String finalWord = "bbb";
    int k = 6;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case144() {
    String originalWord = "aab";
    String finalWord = "abb";
    int k = 10;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case145() {
    String originalWord = "ab";
    String finalWord = "ab";
    int k = 1;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case146() {
    String originalWord = "aba";
    String finalWord = "abb";
    int k = 1;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case147() {
    String originalWord = "aabb";
    String finalWord = "aabb";
    int k = 2;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case148() {
    String originalWord = "abb";
    String finalWord = "aab";
    int k = 11;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case149() {
    String originalWord = "aaaaa";
    String finalWord = "bbbbb";
    int k = 20;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case150() {
    String originalWord = "aaaaaa";
    String finalWord = "aabbbb";
    int k = 6;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case151() {
    String originalWord = "aaaaa";
    String finalWord = "aabbb";
    int k = 5;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case152() {
    String originalWord = "aababbabaa";
    String finalWord = "abbbbaabab";
    int k = 8;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case153() {
    String originalWord = "aba";
    String finalWord = "bbb";
    int k = 3;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case154() {
    String originalWord = "aaaaaaaaaaaaa";
    String finalWord = "bbbbbbbbbbbbb";
    int k = 13;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case155() {
    String originalWord = "a";
    String finalWord = "a";
    int k = 6;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case156() {
    String originalWord = "ab";
    String finalWord = "ba";
    int k = 4;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case157() {
    String originalWord = "ababab";
    String finalWord = "ababab";
    int k = 2;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case158() {
    String originalWord = "ab";
    String finalWord = "aa";
    int k = 3;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case159() {
    String originalWord = "aaaaaaa";
    String finalWord = "aaaaaab";
    int k = 3;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case160() {
    String originalWord = "aaa";
    String finalWord = "bbb";
    int k = 1;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case161() {
    String originalWord = "aaab";
    String finalWord = "aaaa";
    int k = 2;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case162() {
    String originalWord = "abab";
    String finalWord = "bbaa";
    int k = 2;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case163() {
    String originalWord = "aab";
    String finalWord = "aaa";
    int k = 4;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case164() {
    String originalWord = "aaaa";
    String finalWord = "aaaa";
    int k = 2;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case165() {
    String originalWord = "aba";
    String finalWord = "bba";
    int k = 1;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case166() {
    String originalWord = "aaaaaa";
    String finalWord = "bbbaaa";
    int k = 5;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case167() {
    String originalWord = "aaaabbb";
    String finalWord = "aabaaab";
    int k = 7;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case168() {
    String originalWord = "abb";
    String finalWord = "baa";
    int k = 5;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case169() {
    String originalWord = "aaaaa";
    String finalWord = "bbbbb";
    int k = 1;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case170() {
    String originalWord = "bbbbb";
    String finalWord = "aaaaa";
    int k = 3;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case171() {
    String originalWord = "aabbb";
    String finalWord = "aaaaa";
    int k = 5;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case172() {
    String originalWord = "abab";
    String finalWord = "baba";
    int k = 2;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case173() {
    String originalWord = "aaaaaaa";
    String finalWord = "aaaaaab";
    int k = 2;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case174() {
    String originalWord = "aa";
    String finalWord = "ab";
    int k = 4;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case175() {
    String originalWord = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    String finalWord = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    int k = 100;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case176() {
    String originalWord = "aaaab";
    String finalWord = "bbbab";
    int k = 7;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case177() {
    String originalWord = "aaa";
    String finalWord = "aab";
    int k = 4;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case178() {
    String originalWord = "aaaaaa";
    String finalWord = "bbbbba";
    int k = 6;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case179() {
    String originalWord = "aaa";
    String finalWord = "bbb";
    int k = 7;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case180() {
    String originalWord = "abab";
    String finalWord = "abba";
    int k = 4;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case181() {
    String originalWord = "aaaaaaaaaaaaa";
    String finalWord = "bbbbbbbbbbbbb";
    int k = 26;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case182() {
    String originalWord = "aaaa";
    String finalWord = "bbbb";
    int k = 1;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case183() {
    String originalWord = "aaaa";
    String finalWord = "aaab";
    int k = 2;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case184() {
    String originalWord = "baab";
    String finalWord = "bbbb";
    int k = 2;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case185() {
    String originalWord = "aab";
    String finalWord = "bba";
    int k = 5;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case186() {
    String originalWord = "abbba";
    String finalWord = "aaaaa";
    int k = 4;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case187() {
    String originalWord = "aaaa";
    String finalWord = "aaaa";
    int k = 4;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case188() {
    String originalWord = "abababab";
    String finalWord = "aaaaaaaa";
    int k = 2;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case189() {
    String originalWord = "aabbaa";
    String finalWord = "bbaaaa";
    int k = 6;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case190() {
    String originalWord = "aaabb";
    String finalWord = "bbbbb";
    int k = 6;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case191() {
    String originalWord = "aabb";
    String finalWord = "babb";
    int k = 2;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case192() {
    String originalWord = "aaa";
    String finalWord = "aab";
    int k = 1;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case193() {
    String originalWord = "abaababa";
    String finalWord = "baaaabba";
    int k = 6;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case194() {
    String originalWord = "aa";
    String finalWord = "bb";
    int k = 4;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case195() {
    String originalWord = "aaaa";
    String finalWord = "aaaa";
    int k = 3;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case196() {
    String originalWord = "aabb";
    String finalWord = "bbaa";
    int k = 8;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case197() {
    String originalWord = "aaa";
    String finalWord = "bbb";
    int k = 3;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case198() {
    String originalWord = "abababab";
    String finalWord = "aaaaaaaa";
    int k = 14;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case199() {
    String originalWord = "aaa";
    String finalWord = "aaa";
    int k = 6;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case200() {
    String originalWord = "aaaa";
    String finalWord = "babb";
    int k = 4;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case201() {
    String originalWord = "aaa";
    String finalWord = "bbb";
    int k = 9;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case202() {
    String originalWord = "aaaaabbb";
    String finalWord = "bbbbbbbb";
    int k = 6;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case203() {
    String originalWord = "aba";
    String finalWord = "bab";
    int k = 3;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case204() {
    String originalWord = "ab";
    String finalWord = "bb";
    int k = 1;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case205() {
    String originalWord = "aba";
    String finalWord = "aaa";
    int k = 1;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case206() {
    String originalWord = "aaaaaaaaaa";
    String finalWord = "bbbbbaaaaa";
    int k = 3;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case207() {
    String originalWord = "a";
    String finalWord = "a";
    int k = 100;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case208() {
    String originalWord = "abbbab";
    String finalWord = "aaaaaa";
    int k = 6;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case209() {
    String originalWord = "aaaaa";
    String finalWord = "bbbbb";
    int k = 14;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case210() {
    String originalWord = "aba";
    String finalWord = "bab";
    int k = 6;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case211() {
    String originalWord = "aabba";
    String finalWord = "bbbaa";
    int k = 5;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case212() {
    String originalWord = "aaaaa";
    String finalWord = "bbbba";
    int k = 10;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case213() {
    String originalWord = "aa";
    String finalWord = "ba";
    int k = 2;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case214() {
    String originalWord = "aaa";
    String finalWord = "bba";
    int k = 3;
    assertEquals("IMPOSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

  @Test
  public void case215() {
    String originalWord = "ababa";
    String finalWord = "babab";
    int k = 7;
    assertEquals("POSSIBLE", easyconversionmachine.isItPossible(originalWord, finalWord, k));
  }

}
