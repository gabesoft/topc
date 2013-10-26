package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class ColorfulCupcakesDivTwoTest {
  ColorfulCupcakesDivTwo colorfulcupcakesdivtwo = new ColorfulCupcakesDivTwo();

  @Test
  public void case1() {
    String cupcakes = "ABAB";
    assertEquals(2, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case2() {
    String cupcakes = "ABABA";
    assertEquals(0, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case3() {
    String cupcakes = "ABC";
    assertEquals(6, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case4() {
    String cupcakes = "ABABABABABABABABABABABABABABABABABABABABABABABABAB";
    assertEquals(2, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case5() {
    String cupcakes = "BCBABBACBABABCCCCCAABBAACBBBBCBCAAA";
    assertEquals(741380640, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case6() {
    String cupcakes = "ABCCCACCCBCCC";
    assertEquals(0, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case7() {
    String cupcakes = "ABBBBAABAAACCBABAAACACCACABCABBAABCCCBAABCCBABA";
    assertEquals(188207837, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case8() {
    String cupcakes = "CAAABBAAB";
    assertEquals(0, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case9() {
    String cupcakes = "ACCACABACABABACBBCCCBAACABABA";
    assertEquals(10664808, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case10() {
    String cupcakes = "AABCACACAAABBBBBAABAACABCBAACABA";
    assertEquals(16016, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case11() {
    String cupcakes = "ABCABCABCC";
    assertEquals(180, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case12() {
    String cupcakes = "BBBBCACAAABABCB";
    assertEquals(450, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case13() {
    String cupcakes = "AACBAACBBCBBCBCACBCCCA";
    assertEquals(174020, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case14() {
    String cupcakes = "CBCAACCCACBCCBBBBABACCCACBBAAC";
    assertEquals(8011080, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case15() {
    String cupcakes = "BAACBABBABCC";
    assertEquals(408, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case16() {
    String cupcakes = "CCABABBBBBBAAAABCBCACBBCAAABBAAACBCACBBACABACACBB";
    assertEquals(323466116, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case17() {
    String cupcakes = "CBBCBCCBCACCBCBBAACCBCAACAACBACCBBCBAB";
    assertEquals(19722697, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case18() {
    String cupcakes = "CAACCAABBBABAACBBCBBBBAA";
    assertEquals(185184, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case19() {
    String cupcakes = "BCAACAAABACCBBABABBBACCCCBBBCCABAACABCACAABCAC";
    assertEquals(198638319, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case20() {
    String cupcakes = "ABABCBCCABBCABACCABCBCCBCBAC";
    assertEquals(6825840, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case21() {
    String cupcakes = "AABCBABCCBABACAAACCBCCABCABAABB";
    assertEquals(85228176, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case22() {
    String cupcakes = "BCBABAAACBAABAACACAACBCCCBCCCBC";
    assertEquals(55045584, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case23() {
    String cupcakes = "BAACBABBABBCCCBCCCACBCCABBAAAAACBACCBBBB";
    assertEquals(680898127, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case24() {
    String cupcakes = "AACCCAACBABBCBABCACAACCBCCABBC";
    assertEquals(27054720, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case25() {
    String cupcakes = "CCAABBACBBBBACBCCAABBABCBBBBBCCAAABBCBCCBABBAABAAB";
    assertEquals(838553334, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case26() {
    String cupcakes = "BCBABCCCCBABCACACAACABCBAABCBCACCAABAABCCBCCCCCCCA";
    assertEquals(838553334, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case27() {
    String cupcakes = "BACCCAABCCCABBAACCACCCABBACCACACAACCACBCBAABCCCCBA";
    assertEquals(534612302, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case28() {
    String cupcakes = "BABCAAAACACBAABACCACBACCCBBBBCBCBCCCACCAACCCAACACA";
    assertEquals(451311121, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case29() {
    String cupcakes = "CBACBCBCBCAAACAABBAAABACAABABBBBACACCACBACCABBCACC";
    assertEquals(969866300, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case30() {
    String cupcakes = "BABCAAACBCAABBACAACABAABBACAACAABACCBCBCCBABABABBA";
    assertEquals(359261006, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case31() {
    String cupcakes = "CABBCABCCCCCCAACABABBCACABABABCACABCCABBABBACCACBA";
    assertEquals(807732686, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case32() {
    String cupcakes = "ACACCBACCBBACBBAAABCCCBBAABABCBBACBCBCABABBAACBABA";
    assertEquals(829127786, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case33() {
    String cupcakes = "BAACBAAACBABBBCCAABBCAABAACCCAAAABAAAAACCBBBCAABCA";
    assertEquals(612092993, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case34() {
    String cupcakes = "CBAAABBCBBACCABCBBCABCCAAACCBBCBCACABBAAAAACBBBAAB";
    assertEquals(823779011, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case35() {
    String cupcakes = "ABCABAABCCCCBACBACABCABAAACBCCBCBAABABCBBCAAABCBAA";
    assertEquals(969866300, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case36() {
    String cupcakes = "AABCBCAABCBCACABACBBBAABBBABCBBACAABCBCBCABCBABCCA";
    assertEquals(618020015, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case37() {
    String cupcakes = "ABBBACCBACCCACAABCBBBBCBBBBABBABCCACCABAACAABBBABB";
    assertEquals(439564296, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case38() {
    String cupcakes = "CACCCBBACCCABCACBAABABAAABBBCAACBBCBCBBCABACAACCAA";
    assertEquals(807732686, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case39() {
    String cupcakes = "ABBACBACBCABACCCACACCBAAABACACCCBCCBACABABBAAAAABB";
    assertEquals(618020015, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case40() {
    String cupcakes = "CAAAAABCBACBCABCCCCABACCBAABBCACCAAABCAAACACABBCBB";
    assertEquals(991666600, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case41() {
    String cupcakes = "AABACCBABACBCCCAABABBAACAABCACBBCABABAACAACBABCBCC";
    assertEquals(395853981, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case42() {
    String cupcakes = "CCAACBAAABBCCBABBBBABABBBBAAAAACABAACBBCCCCCBABCBA";
    assertEquals(270820324, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case43() {
    String cupcakes = "CABACACAAAABCCCACBBABBAAACABCCCABBBABCBCCBAABAAACC";
    assertEquals(618020015, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case44() {
    String cupcakes = "CBAABBCAABCACACBBBAAACCCCACACCABAABCBBCCAACABACBBC";
    assertEquals(823779011, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case45() {
    String cupcakes = "ABCBCABBCABBACBABBCABAAABCCCABCCACBCABBCCCBAABC";
    assertEquals(423411909, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case46() {
    String cupcakes = "CBABBACBABABCCCCCAABBAACBBBBCBC";
    assertEquals(24862992, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case47() {
    String cupcakes = "AAAAAAAAAAAAAAABBBBBBBBBBBBBBBCCCCCCCCCCCCCCC";
    assertEquals(730747455, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case48() {
    String cupcakes = "AAAAAAAAAAAAAAAABBBBBBBBBBBBBBBBACCCCCCCCCCCCCCCCB";
    assertEquals(139077442, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case49() {
    String cupcakes = "ABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCCC";
    assertEquals(726665879, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case50() {
    String cupcakes = "AAAAAAAAAAAAAAABBBBBBBBBBBBBBBCCCCCCCCCCCCCCCABCAB";
    assertEquals(139077442, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case51() {
    String cupcakes = "ABCA";
    assertEquals(4, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case52() {
    String cupcakes = "ABCCCAAABBBCCCAAABBBCBCBACBACACACACBCACBCBAC";
    assertEquals(280387198, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case53() {
    String cupcakes = "BCBABBACBABABCCCCCAABBAACBBBBCBCAAABBC";
    assertEquals(886239205, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case54() {
    String cupcakes = "AAAAAAAAAAAAAAABBBBBBBBBBBBBBBCCCCCCCCCCCCCCCCCCCC";
    assertEquals(395853981, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case55() {
    String cupcakes = "AABABABABABABCCCBBCBABCBACBACBBCBCCBCCCBACABCBCBC";
    assertEquals(521301082, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case56() {
    String cupcakes = "AAAAAAAAAAAAAAAABBBBBBBBBBBBBBBBCCCCCCCCCCCCCCCC";
    assertEquals(853062226, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

  @Test
  public void case57() {
    String cupcakes = "ACBACBABBCABCBABABACACABCBACBACBABCAC";
    assertEquals(746183318, colorfulcupcakesdivtwo.countArrangements(cupcakes));
  }

}
