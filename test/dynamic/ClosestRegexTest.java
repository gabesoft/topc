package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class ClosestRegexTest {
  ClosestRegex closestregex = new ClosestRegex();

  @Test
  public void case1() {
    String text = "abcd";
    String regex = "bcdd";
    assertEquals("bcdd", closestregex.closestString(text, regex));
  }

  @Test
  public void case2() {
    String text = "topcoder";
    String regex = "t*px*coa*de*";
    assertEquals("ttpcodee", closestregex.closestString(text, regex));
  }

  @Test
  public void case3() {
    String text = "cmu";
    String regex = "c*m*fm*u*";
    assertEquals("cfu", closestregex.closestString(text, regex));
  }

  @Test
  public void case4() {
    String text = "aaaaacccc";
    String regex = "a*abc*";
    assertEquals("aaaaabccc", closestregex.closestString(text, regex));
  }

  @Test
  public void case5() {
    String text = "short";
    String regex = "lo*ts*of*let*ter*s";
    assertEquals("", closestregex.closestString(text, regex));
  }

  @Test
  public void case6() {
    String text = "abc";
    String regex = "def";
    assertEquals("def", closestregex.closestString(text, regex));
  }

  @Test
  public void case7() {
    String text = "abc";
    String regex = "ab";
    assertEquals("", closestregex.closestString(text, regex));
  }

  @Test
  public void case8() {
    String text = "abc";
    String regex = "ab*cd";
    assertEquals("acd", closestregex.closestString(text, regex));
  }

  @Test
  public void case9() {
    String text = "cbc";
    String regex = "a*b*";
    assertEquals("abb", closestregex.closestString(text, regex));
  }

  @Test
  public void case10() {
    String text = "acde";
    String regex = "a*bcde*";
    assertEquals("bcde", closestregex.closestString(text, regex));
  }

  @Test
  public void case11() {
    String text = "z";
    String regex = "a*";
    assertEquals("a", closestregex.closestString(text, regex));
  }

  @Test
  public void case12() {
    String text = "a";
    String regex = "z*";
    assertEquals("z", closestregex.closestString(text, regex));
  }

  @Test
  public void case13() {
    String text = "p";
    String regex = "p*";
    assertEquals("p", closestregex.closestString(text, regex));
  }

  @Test
  public void case14() {
    String text = "x";
    String regex = "x";
    assertEquals("x", closestregex.closestString(text, regex));
  }

  @Test
  public void case15() {
    String text = "x";
    String regex = "y";
    assertEquals("y", closestregex.closestString(text, regex));
  }

  @Test
  public void case16() {
    String text = "ababababababababababababababababababababababababab";
    String regex = "a*b*a*b*a*b*a*b*a*b*a*b*a*b*a*b*a*b*a*b*a*b*a*b*a*";
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaabababababababababababab", closestregex.closestString(text, regex));
  }

  @Test
  public void case17() {
    String text = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    String regex = "a*b*a*b*a*b*a*b*a*b*a*b*a*b*a*b*a*b*a*b*a*b*a*b*a*";
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", closestregex.closestString(text, regex));
  }

  @Test
  public void case18() {
    String text = "ababababababababababababababababababababababababab";
    String regex = "a*a*a*a*a*a*a*a*a*a*a*a*a*a*a*a*a*a*a*a*a*a*a*a*a*";
    assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", closestregex.closestString(text, regex));
  }

  @Test
  public void case19() {
    String text = "bcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxa";
    String regex = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwx";
    assertEquals("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwx", closestregex.closestString(text, regex));
  }

  @Test
  public void case20() {
    String text = "cb";
    String regex = "c*ca*";
    assertEquals("ca", closestregex.closestString(text, regex));
  }

  @Test
  public void case21() {
    String text = "qq";
    String regex = "o*ot*a*a*p*a*n*";
    assertEquals("oa", closestregex.closestString(text, regex));
  }

  @Test
  public void case22() {
    String text = "bbbcaabcbc";
    String regex = "c*cba*a";
    assertEquals("cbaaaaaaaa", closestregex.closestString(text, regex));
  }

  @Test
  public void case23() {
    String text = "cbdaaeed";
    String regex = "e*e*ec*ee*";
    assertEquals("ecccceee", closestregex.closestString(text, regex));
  }

  @Test
  public void case24() {
    String text = "deeia";
    String regex = "g*gf*ha*f*";
    assertEquals("gffha", closestregex.closestString(text, regex));
  }

  @Test
  public void case25() {
    String text = "bdadddca";
    String regex = "b*bc*a*d*adc*c";
    assertEquals("baadadcc", closestregex.closestString(text, regex));
  }

  @Test
  public void case26() {
    String text = "ggooglegooglegooglegoogleoogle";
    String regex = "o*df*l*o*df*l*p*o*df*l*o*df*l*podfl*p*p*p";
    assertEquals("oooodllloodllloodllloodlpodflp", closestregex.closestString(text, regex));
  }

  @Test
  public void case27() {
    String text = "adadfbbasdfasdbfadfasdfqadfadfbadsfbadfadfd";
    String regex = "a*b*c*d*e*f*g*h*i*j*k*l*m*n*o*p*r*s*t*u*v*";
    assertEquals("aaaaabbbbdddddddddddddddddddddddddddddddddd", closestregex.closestString(text, regex));
  }

  @Test
  public void case28() {
    String text = "shortestotnakraj";
    String regex = "lo*ts*of*let*ter*s*ealsr*asra*a*";
    assertEquals("ltoleteealsasraa", closestregex.closestString(text, regex));
  }

  @Test
  public void case29() {
    String text = "abfjdsjdhfsjfksdkjfywekjdssgkjkjjksjk";
    String regex = "j*h*f*z*d*g*d*d*d*s*f*fsg*f*fg*s*s*d*a*z*a*h*z*t*e";
    assertEquals("jjjjjjjhhfsfffsffffffffffssssssssssae", closestregex.closestString(text, regex));
  }

}
