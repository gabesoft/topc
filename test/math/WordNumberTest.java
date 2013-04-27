package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class WordNumberTest {
  WordNumber wordnumber = new WordNumber();

  @Test
  public void case1() {
    int alpha = 3;
    int n = 5;
    assertEquals("ab", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case2() {
    int alpha = 3;
    int n = 13;
    assertEquals("aaa", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case3() {
    int alpha = 26;
    int n = 2000000000;
    assertEquals("flhomvx", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case4() {
    int alpha = 15;
    int n = 1;
    assertEquals("a", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case5() {
    int alpha = 26;
    int n = 456;
    assertEquals("qn", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case6() {
    int alpha = 2;
    int n = 13;
    assertEquals("bba", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case7() {
    int alpha = 2;
    int n = 14;
    assertEquals("bbb", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case8() {
    int alpha = 2;
    int n = 15;
    assertEquals("aaaa", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case9() {
    int alpha = 2;
    int n = 9;
    assertEquals("aba", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case10() {
    int alpha = 25;
    int n = 15625;
    assertEquals("xxy", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case11() {
    int alpha = 25;
    int n = 15626;
    assertEquals("xya", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case12() {
    int alpha = 17;
    int n = 1999999999;
    assertEquals("dnnjadcm", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case13() {
    int alpha = 4;
    int n = 13652;
    assertEquals("bdddddd", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case14() {
    int alpha = 4;
    int n = 13651;
    assertEquals("bdddddc", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case15() {
    int alpha = 20;
    int n = 20;
    assertEquals("t", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case16() {
    int alpha = 20;
    int n = 21;
    assertEquals("aa", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case17() {
    int alpha = 20;
    int n = 22;
    assertEquals("ab", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case18() {
    int alpha = 20;
    int n = 40;
    assertEquals("at", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case19() {
    int alpha = 20;
    int n = 41;
    assertEquals("ba", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case20() {
    int alpha = 26;
    int n = 1987654321;
    assertEquals("fkgocac", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case21() {
    int alpha = 2;
    int n = 7;
    assertEquals("aaa", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case22() {
    int alpha = 18;
    int n = 1700430165;
    assertEquals("bmqpdqdi", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case23() {
    int alpha = 6;
    int n = 1879066806;
    assertEquals("dffbdbecaaff", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case24() {
    int alpha = 19;
    int n = 1833149783;
    assertEquals("asrfgrdj", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case25() {
    int alpha = 17;
    int n = 1674669406;
    assertEquals("dafgnona", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case26() {
    int alpha = 17;
    int n = 462567884;
    assertEquals("abbmemoi", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case27() {
    int alpha = 5;
    int n = 816519128;
    assertEquals("cacbeaaeebdec", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case28() {
    int alpha = 24;
    int n = 1660558457;
    assertEquals("hpmaiwq", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case29() {
    int alpha = 15;
    int n = 14662179;
    assertEquals("addieci", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case30() {
    int alpha = 22;
    int n = 40352794;
    assertEquals("greokt", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case31() {
    int alpha = 20;
    int n = 1999886706;
    assertEquals("akdsepof", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case32() {
    int alpha = 7;
    int n = 1681133903;
    assertEquals("efddbbedgaa", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case33() {
    int alpha = 2;
    int n = 586596412;
    assertEquals("aaababbbbabbabbaaaaaaaabbbbab", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case34() {
    int alpha = 10;
    int n = 1999927401;
    assertEquals("aiiiibgcja", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case35() {
    int alpha = 20;
    int n = 1304372648;
    assertEquals("tglfklh", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case36() {
    int alpha = 14;
    int n = 1558323530;
    assertEquals("njmffbch", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case37() {
    int alpha = 2;
    int n = 2000000000;
    assertEquals("bbabbbaabbababbaababaaaaaaaaab", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case38() {
    int alpha = 25;
    int n = 2000000000;
    assertEquals("hdsxxxy", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case39() {
    int alpha = 26;
    int n = 1;
    assertEquals("a", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case40() {
    int alpha = 2;
    int n = 1999999999;
    assertEquals("bbabbbaabbababbaababaaaaaaaaaa", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case41() {
    int alpha = 22;
    int n = 1999999973;
    assertEquals("qnanogo", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case42() {
    int alpha = 26;
    int n = 2000000000;
    assertEquals("flhomvx", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case43() {
    int alpha = 26;
    int n = 1234000000;
    assertEquals("cyviitl", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case44() {
    int alpha = 3;
    int n = 82;
    assertEquals("bbca", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case45() {
    int alpha = 2;
    int n = 5;
    assertEquals("ba", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case46() {
    int alpha = 2;
    int n = 25;
    assertEquals("baba", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case47() {
    int alpha = 3;
    int n = 6;
    assertEquals("ac", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case48() {
    int alpha = 3;
    int n = 3;
    assertEquals("c", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case49() {
    int alpha = 3;
    int n = 565645454;
    assertEquals("ccbccacbcacbabcabb", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case50() {
    int alpha = 2;
    int n = 26;
    assertEquals("babb", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case51() {
    int alpha = 26;
    int n = 26;
    assertEquals("z", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case52() {
    int alpha = 2;
    int n = 2000000000;
    assertEquals("bbabbbaabbababbaababaaaaaaaaab", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case53() {
    int alpha = 2;
    int n = 20000000;
    assertEquals("aabbaaabaababbabaaaaaaab", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case54() {
    int alpha = 2;
    int n = 8;
    assertEquals("aab", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case55() {
    int alpha = 2;
    int n = 2000000;
    assertEquals("bbbabaaaabaabaaaaaab", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case56() {
    int alpha = 2;
    int n = 1073741822;
    assertEquals("bbbbbbbbbbbbbbbbbbbbbbbbbbbbb", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case57() {
    int alpha = 2;
    int n = 16;
    assertEquals("aaab", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case58() {
    int alpha = 3;
    int n = 9;
    assertEquals("bc", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case59() {
    int alpha = 25;
    int n = 24;
    assertEquals("x", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case60() {
    int alpha = 22;
    int n = 113379904;
    assertEquals("uuuuuv", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case61() {
    int alpha = 23;
    int n = 2000000000;
    assertEquals("mkpuagq", wordnumber.theWord(alpha, n));
  }

  @Test
  public void case62() {
    int alpha = 26;
    int n = 700;
    assertEquals("zx", wordnumber.theWord(alpha, n));
  }

}
