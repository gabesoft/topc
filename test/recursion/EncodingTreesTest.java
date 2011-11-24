package topc.test.recursion;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.recursion.*;

public class EncodingTreesTest {
  EncodingTrees encodingtrees = new EncodingTrees();

  @Test
  public void case1() {
    int N = 2;
    int index = 1;
    assertEquals("ab", encodingtrees.getCode(N, index));
  }

  @Test
  public void case2() {
    int N = 2;
    int index = 2;
    assertEquals("ba", encodingtrees.getCode(N, index));
  }

  @Test
  public void case3() {
    int N = 2;
    int index = 3;
    assertEquals("", encodingtrees.getCode(N, index));
  }

  @Test
  public void case4() {
    int N = 4;
    int index = 9;
    assertEquals("cbad", encodingtrees.getCode(N, index));
  }

  @Test
  public void case5() {
    int N = 15;
    int index = 14023;
    assertEquals("abcdeohgfniljkm", encodingtrees.getCode(N, index));
  }

  @Test
  public void case6() {
    int N = 1;
    int index = 1;
    assertEquals("a", encodingtrees.getCode(N, index));
  }

  @Test
  public void case7() {
    int N = 1;
    int index = 2;
    assertEquals("", encodingtrees.getCode(N, index));
  }

  @Test
  public void case8() {
    int N = 1;
    int index = 2000000000;
    assertEquals("", encodingtrees.getCode(N, index));
  }

  @Test
  public void case9() {
    int N = 1;
    int index = 1999999999;
    assertEquals("", encodingtrees.getCode(N, index));
  }

  @Test
  public void case10() {
    int N = 3;
    int index = 1;
    assertEquals("abc", encodingtrees.getCode(N, index));
  }

  @Test
  public void case11() {
    int N = 3;
    int index = 2;
    assertEquals("acb", encodingtrees.getCode(N, index));
  }

  @Test
  public void case12() {
    int N = 3;
    int index = 3;
    assertEquals("bac", encodingtrees.getCode(N, index));
  }

  @Test
  public void case13() {
    int N = 3;
    int index = 4;
    assertEquals("cab", encodingtrees.getCode(N, index));
  }

  @Test
  public void case14() {
    int N = 3;
    int index = 5;
    assertEquals("cba", encodingtrees.getCode(N, index));
  }

  @Test
  public void case15() {
    int N = 3;
    int index = 6;
    assertEquals("", encodingtrees.getCode(N, index));
  }

  @Test
  public void case16() {
    int N = 4;
    int index = 1;
    assertEquals("abcd", encodingtrees.getCode(N, index));
  }

  @Test
  public void case17() {
    int N = 4;
    int index = 2;
    assertEquals("abdc", encodingtrees.getCode(N, index));
  }

  @Test
  public void case18() {
    int N = 4;
    int index = 3;
    assertEquals("acbd", encodingtrees.getCode(N, index));
  }

  @Test
  public void case19() {
    int N = 4;
    int index = 4;
    assertEquals("adbc", encodingtrees.getCode(N, index));
  }

  @Test
  public void case20() {
    int N = 4;
    int index = 5;
    assertEquals("adcb", encodingtrees.getCode(N, index));
  }

  @Test
  public void case21() {
    int N = 4;
    int index = 6;
    assertEquals("bacd", encodingtrees.getCode(N, index));
  }

  @Test
  public void case22() {
    int N = 4;
    int index = 7;
    assertEquals("badc", encodingtrees.getCode(N, index));
  }

  @Test
  public void case23() {
    int N = 4;
    int index = 8;
    assertEquals("cabd", encodingtrees.getCode(N, index));
  }

  @Test
  public void case24() {
    int N = 4;
    int index = 9;
    assertEquals("cbad", encodingtrees.getCode(N, index));
  }

  @Test
  public void case25() {
    int N = 4;
    int index = 10;
    assertEquals("dabc", encodingtrees.getCode(N, index));
  }

  @Test
  public void case26() {
    int N = 4;
    int index = 11;
    assertEquals("dacb", encodingtrees.getCode(N, index));
  }

  @Test
  public void case27() {
    int N = 4;
    int index = 12;
    assertEquals("dbac", encodingtrees.getCode(N, index));
  }

  @Test
  public void case28() {
    int N = 4;
    int index = 13;
    assertEquals("dcab", encodingtrees.getCode(N, index));
  }

  @Test
  public void case29() {
    int N = 4;
    int index = 14;
    assertEquals("dcba", encodingtrees.getCode(N, index));
  }

  @Test
  public void case30() {
    int N = 4;
    int index = 15;
    assertEquals("", encodingtrees.getCode(N, index));
  }

  @Test
  public void case31() {
    int N = 6;
    int index = 66;
    assertEquals("cbafed", encodingtrees.getCode(N, index));
  }

  @Test
  public void case32() {
    int N = 11;
    int index = 111;
    assertEquals("abcdekhfgji", encodingtrees.getCode(N, index));
  }

  @Test
  public void case33() {
    int N = 12;
    int index = 121212;
    assertEquals("ihagfedbcjkl", encodingtrees.getCode(N, index));
  }

  @Test
  public void case34() {
    int N = 12;
    int index = 200012;
    assertEquals("lkfeabcdhgij", encodingtrees.getCode(N, index));
  }

  @Test
  public void case35() {
    int N = 15;
    int index = 8555555;
    assertEquals("okagdcbefhijnlm", encodingtrees.getCode(N, index));
  }

  @Test
  public void case36() {
    int N = 16;
    int index = 29999999;
    assertEquals("pedcabjihfgkonml", encodingtrees.getCode(N, index));
  }

  @Test
  public void case37() {
    int N = 19;
    int index = 883631595;
    assertEquals("jebadcihgfsrqponmlk", encodingtrees.getCode(N, index));
  }

  @Test
  public void case38() {
    int N = 19;
    int index = 883631594;
    assertEquals("jebadcihgfsrqponmkl", encodingtrees.getCode(N, index));
  }

  @Test
  public void case39() {
    int N = 19;
    int index = 883631596;
    assertEquals("jecabdfghiklmnopqrs", encodingtrees.getCode(N, index));
  }

  @Test
  public void case40() {
    int N = 19;
    int index = 1767263190;
    assertEquals("srqponmlkjihgfedcba", encodingtrees.getCode(N, index));
  }

  @Test
  public void case41() {
    int N = 19;
    int index = 1;
    assertEquals("abcdefghijklmnopqrs", encodingtrees.getCode(N, index));
  }

  @Test
  public void case42() {
    int N = 19;
    int index = 2;
    assertEquals("abcdefghijklmnopqsr", encodingtrees.getCode(N, index));
  }

  @Test
  public void case43() {
    int N = 19;
    int index = 1767263191;
    assertEquals("", encodingtrees.getCode(N, index));
  }

  @Test
  public void case44() {
    int N = 19;
    int index = 1767263189;
    assertEquals("srqponmlkjihgfedcab", encodingtrees.getCode(N, index));
  }

  @Test
  public void case45() {
    int N = 18;
    int index = 1000000000;
    assertEquals("", encodingtrees.getCode(N, index));
  }

  @Test
  public void case46() {
    int N = 18;
    int index = 100000000;
    assertEquals("arbnhcgfedilkjmqop", encodingtrees.getCode(N, index));
  }

  @Test
  public void case47() {
    int N = 16;
    int index = 14567242;
    assertEquals("dcabhegfpomlikjn", encodingtrees.getCode(N, index));
  }

  @Test
  public void case48() {
    int N = 19;
    int index = 2000000000;
    assertEquals("", encodingtrees.getCode(N, index));
  }

  @Test
  public void case49() {
    int N = 13;
    int index = 1987654321;
    assertEquals("", encodingtrees.getCode(N, index));
  }

  @Test
  public void case50() {
    int N = 19;
    int index = 1423434232;
    assertEquals("sbachdfegirlkjqmonp", encodingtrees.getCode(N, index));
  }

  @Test
  public void case51() {
    int N = 19;
    int index = 100000;
    assertEquals("abcdefgmhljikrqnops", encodingtrees.getCode(N, index));
  }

  @Test
  public void case52() {
    int N = 19;
    int index = 2000000000;
    assertEquals("", encodingtrees.getCode(N, index));
  }

  @Test
  public void case53() {
    int N = 19;
    int index = 1712345678;
    assertEquals("srmlabdcekfighjponq", encodingtrees.getCode(N, index));
  }

  @Test
  public void case54() {
    int N = 1;
    int index = 300;
    assertEquals("", encodingtrees.getCode(N, index));
  }

  @Test
  public void case55() {
    int N = 1;
    int index = 4;
    assertEquals("", encodingtrees.getCode(N, index));
  }

  @Test
  public void case56() {
    int N = 19;
    int index = 1000000000;
    assertEquals("nmjgafbcdeihklosrpq", encodingtrees.getCode(N, index));
  }

  @Test
  public void case57() {
    int N = 13;
    int index = 142347;
    assertEquals("alicbdehfgjkm", encodingtrees.getCode(N, index));
  }

  @Test
  public void case58() {
    int N = 19;
    int index = 5000000;
    assertEquals("abcdmfeglhikjsnroqp", encodingtrees.getCode(N, index));
  }

  @Test
  public void case59() {
    int N = 19;
    int index = 1423434232;
    assertEquals("sbachdfegirlkjqmonp", encodingtrees.getCode(N, index));
  }

  @Test
  public void case60() {
    int N = 19;
    int index = 100000;
    assertEquals("abcdefgmhljikrqnops", encodingtrees.getCode(N, index));
  }

  @Test
  public void case61() {
    int N = 19;
    int index = 2000000000;
    assertEquals("", encodingtrees.getCode(N, index));
  }

  @Test
  public void case62() {
    int N = 19;
    int index = 1712345678;
    assertEquals("srmlabdcekfighjponq", encodingtrees.getCode(N, index));
  }

  @Test
  public void case63() {
    int N = 1;
    int index = 300;
    assertEquals("", encodingtrees.getCode(N, index));
  }

  @Test
  public void case64() {
    int N = 1;
    int index = 4;
    assertEquals("", encodingtrees.getCode(N, index));
  }

  @Test
  public void case65() {
    int N = 19;
    int index = 1000000000;
    assertEquals("nmjgafbcdeihklosrpq", encodingtrees.getCode(N, index));
  }

  @Test
  public void case66() {
    int N = 13;
    int index = 142347;
    assertEquals("alicbdehfgjkm", encodingtrees.getCode(N, index));
  }

  @Test
  public void case67() {
    int N = 19;
    int index = 5000000;
    assertEquals("abcdmfeglhikjsnroqp", encodingtrees.getCode(N, index));
  }

}
