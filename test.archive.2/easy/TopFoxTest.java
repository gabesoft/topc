package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class TopFoxTest {
  TopFox topfox = new TopFox();

  @Test
  public void case1() {
    String familyName = "ab";
    String givenName = "cd";
    assertEquals(4, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case2() {
    String familyName = "abb";
    String givenName = "bbc";
    assertEquals(7, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case3() {
    String familyName = "fox";
    String givenName = "ciel";
    assertEquals(12, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case4() {
    String familyName = "abbbb";
    String givenName = "bbbbbbbc";
    assertEquals(16, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case5() {
    String familyName = "abxy";
    String givenName = "xyxyxc";
    assertEquals(21, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case6() {
    String familyName = "ababababab";
    String givenName = "bababababa";
    assertEquals(68, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case7() {
    String familyName = "bba";
    String givenName = "bbaabbbbba";
    assertEquals(29, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case8() {
    String familyName = "cecebdceea";
    String givenName = "dbbaccef";
    assertEquals(80, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case9() {
    String familyName = "bcadbadaa";
    String givenName = "aacd";
    assertEquals(32, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case10() {
    String familyName = "ndanlhbaf";
    String givenName = "hifbnml";
    assertEquals(63, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case11() {
    String familyName = "ababacb";
    String givenName = "ccccb";
    assertEquals(32, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case12() {
    String familyName = "cbcbac";
    String givenName = "bacbaba";
    assertEquals(40, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case13() {
    String familyName = "mtskwilg";
    String givenName = "ruabtek";
    assertEquals(56, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case14() {
    String familyName = "abbaabb";
    String givenName = "baaaaa";
    assertEquals(42, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case15() {
    String familyName = "fjj";
    String givenName = "njjhcak";
    assertEquals(21, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case16() {
    String familyName = "ccca";
    String givenName = "ade";
    assertEquals(12, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case17() {
    String familyName = "qbrrlgmih";
    String givenName = "ccm";
    assertEquals(27, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case18() {
    String familyName = "dbbdbdbbbd";
    String givenName = "dab";
    assertEquals(30, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case19() {
    String familyName = "cbddbbcabc";
    String givenName = "ab";
    assertEquals(20, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case20() {
    String familyName = "ba";
    String givenName = "cbbbbb";
    assertEquals(12, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case21() {
    String familyName = "baabccaacc";
    String givenName = "bb";
    assertEquals(19, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case22() {
    String familyName = "adddc";
    String givenName = "cabcbadcdd";
    assertEquals(50, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case23() {
    String familyName = "ee";
    String givenName = "mdfi";
    assertEquals(8, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case24() {
    String familyName = "daacbc";
    String givenName = "db";
    assertEquals(12, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case25() {
    String familyName = "aaaaca";
    String givenName = "bcbbbcb";
    assertEquals(42, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case26() {
    String familyName = "aa";
    String givenName = "cbcbcba";
    assertEquals(14, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case27() {
    String familyName = "aaadbbe";
    String givenName = "bbebbebebd";
    assertEquals(64, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case28() {
    String familyName = "cabccbcc";
    String givenName = "bccbccbaa";
    assertEquals(64, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case29() {
    String familyName = "ldjemg";
    String givenName = "emgemgeml";
    assertEquals(49, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case30() {
    String familyName = "ddcbbbcaba";
    String givenName = "bababa";
    assertEquals(56, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case31() {
    String familyName = "fmbgeoana";
    String givenName = "nananqgqad";
    assertEquals(87, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case32() {
    String familyName = "cacabcb";
    String givenName = "abcbabcbac";
    assertEquals(65, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case33() {
    String familyName = "bfackmgh";
    String givenName = "kmghkmghkj";
    assertEquals(75, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case34() {
    String familyName = "fknprnkfil";
    String givenName = "ililikfr";
    assertEquals(77, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case35() {
    String familyName = "cjkmjsmgh";
    String givenName = "mghmghmhc";
    assertEquals(77, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case36() {
    String familyName = "ababbaaba";
    String givenName = "abaabaabbb";
    assertEquals(83, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case37() {
    String familyName = "baaabaacc";
    String givenName = "accaccaca";
    assertEquals(76, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case38() {
    String familyName = "aababbabbb";
    String givenName = "bbbbbbbbba";
    assertEquals(52, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case39() {
    String familyName = "bbabbabaa";
    String givenName = "aaaaababab";
    assertEquals(74, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case40() {
    String familyName = "leeckkkcbc";
    String givenName = "bcbcbl";
    assertEquals(57, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case41() {
    String familyName = "ccccccbcca";
    String givenName = "cacacb";
    assertEquals(57, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case42() {
    String familyName = "dkafiooln";
    String givenName = "lnlnlfhgco";
    assertEquals(87, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case43() {
    String familyName = "bcababaccb";
    String givenName = "ccbccbcc";
    assertEquals(72, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case44() {
    String familyName = "ebeaaaaf";
    String givenName = "afafagee";
    assertEquals(61, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case45() {
    String familyName = "bggeeb";
    String givenName = "eebeebeeaf";
    assertEquals(53, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case46() {
    String familyName = "aaaaaaaaaa";
    String givenName = "aaaaaaaaaa";
    assertEquals(19, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case47() {
    String familyName = "aaaaaaaa";
    String givenName = "aaaaaaaa";
    assertEquals(15, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case48() {
    String familyName = "aadcabbc";
    String givenName = "bbcbbcbdbc";
    assertEquals(74, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case49() {
    String familyName = "babb";
    String givenName = "bbbbbaba";
    assertEquals(24, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case50() {
    String familyName = "linktim";
    String givenName = "imimitllqr";
    assertEquals(67, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case51() {
    String familyName = "aaaaaaaaa";
    String givenName = "aaaaaaacb";
    assertEquals(33, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case52() {
    String familyName = "bcgnmhgk";
    String givenName = "gkgkgfn";
    assertEquals(53, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case53() {
    String familyName = "abbaaaaab";
    String givenName = "aabaabaa";
    assertEquals(62, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case54() {
    String familyName = "ccbddc";
    String givenName = "ddcddcddcd";
    assertEquals(51, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case55() {
    String familyName = "eeecdbad";
    String givenName = "adadaaceca";
    assertEquals(77, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case56() {
    String familyName = "ghkhdfk";
    String givenName = "fkfkfjbckd";
    assertEquals(67, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case57() {
    String familyName = "aaa";
    String givenName = "aaa";
    assertEquals(5, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case58() {
    String familyName = "aaaaaaaaaa";
    String givenName = "bb";
    assertEquals(20, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case59() {
    String familyName = "faohfuae";
    String givenName = "eeafa";
    assertEquals(39, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case60() {
    String familyName = "ji";
    String givenName = "ro";
    assertEquals(4, topfox.possibleHandles(familyName, givenName));
  }

  @Test
  public void case61() {
    String familyName = "aaa";
    String givenName = "aab";
    assertEquals(7, topfox.possibleHandles(familyName, givenName));
  }

}
