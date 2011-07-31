package topc.test.dp;

import junit.framework.*;
import static org.junit.Assert.*;
import org.junit.Test;

import topc.dp.*;

public class StripePainterTest {
  StripePainter _calc = new StripePainter();

  //@Test 
  public void case1() {
    assertEquals(3, _calc.minStrokes("RGBGR"));
  }

  //@Test
  public void case2() {
    assertEquals(3, _calc.minStrokes("RGRG"));
  }

  //@Test
  public void case3() {
    assertEquals(4, _calc.minStrokes("ABACADA"));
  }

  //@Test
  public void case4() {
    assertEquals(7, _calc.minStrokes("AABBCCDDCCBBAABBCCDD"));
  }

  //@Test
  public void case5() {
    assertEquals(24, _calc.minStrokes("ABCDEFGHIJKLMNOPQRSTUVWQQQWVUTSRQPONMLKJIHGFEDCBA"));
  }

  //@Test
  public void case6() {
    assertEquals(45, _calc.minStrokes("ABCDEFGHIJKLMNOPQRSTUVWABCDEFGHIJKLMNOPQRSTUVW"));
  }

  //@Test
  public void case7() {
    assertEquals(2, _calc.minStrokes("JJJJJJJJJJJJKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK"));
  }

  //@Test
  public void case8() {
    assertEquals(13, _calc.minStrokes("ABCDEFGGFEDCBAABCDEFG"));
  }

  //@Test
  public void case9() {
    assertEquals(10, _calc.minStrokes("ABCDCBAABCDCBAAAAABCDCBA"));
  }

  //@Test
  public void case10() {
    assertEquals(1, _calc.minStrokes("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB"));
  }

  //@Test
  public void case11() {
    assertEquals(1, _calc.minStrokes("X"));
  }

  //@Test
  public void case12() {
    assertEquals(4, _calc.minStrokes("RGBGRB"));
  }

  //@Test
  public void case13() {
    assertEquals(5, _calc.minStrokes("ABCDE"));
  }

  //@Test
  public void case14() {
    assertEquals(25, _calc.minStrokes("ABCDEFGHIJKLMNOPQRSTUVWXYYXWVUTSRQPONMLKJIHGFEDCBA"));
  }

  //@Test
  public void case15() {
    assertEquals(26, _calc.minStrokes("JGXJFGDKGTCVGHJVGHJGDJGHVGHJFDGHJGFGHJ"));
  }

  //@Test
  public void case16() {
    assertEquals(26, _calc.minStrokes("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
  }

  @Test
  public void case17() {
    assertEquals(8, _calc.minStrokes("AEBEACABDABDB"));
  }

  //@Test
  public void case18() {
    assertEquals(19, _calc.minStrokes("CGBBCDCGEAGCEEIAABHFCIKEHFBHG"));
  }

  //@Test
  public void case19() {
    assertEquals(21, _calc.minStrokes("DBBFKDHEIGKJHGBJFEDCEHJHIGBEB"));
  }

  //@Test
  public void case20() {
    assertEquals(21, _calc.minStrokes("DEJJEDAIJHBFCEGHFEADCJAIIGKBF"));
  }

  //@Test
  public void case21() {
    assertEquals(30, _calc.minStrokes("DACHIGFHECADGCDFEIEHIDFCEGIIGFCDGDCFIIGCIIDCGFIGHG"));
  }

  //@Test
  public void case22() {
    assertEquals(30, _calc.minStrokes("CIBIGBFBCGAEHFHGCFEEGGIGFIBIIAGFHEGBAHIIFIHDGEGIDF"));
  }

  //@Test
  public void case23() {
    assertEquals(23, _calc.minStrokes("CAACEBBABCBEBBCACAAEEBBAAEBAAEDCEEEBECAAEAECBCCDEB"));
  }

  //@Test
  public void case24() {
    assertEquals(24, _calc.minStrokes("ADAEBCBCACBDEAACAEAEABCDABAABCEEBDDCDDDCBEBABDDDBC"));
  }

  //@Test
  public void case25() {
    assertEquals(26, _calc.minStrokes("BECBBDDEEBABDCADEAAEABCACBDBEECDEDEACACCBEDABEDADD"));
  }

  //@Test
  public void case26() {
    assertEquals(24, _calc.minStrokes("EBEDBDEAAECDBEAECDBCCDCBCCECACAEDDAAEBCDCCDAAAAEDE"));
  }

  //@Test
  public void case27() {
    assertEquals(30, _calc.minStrokes("HAEBDFDFEEFEFBHIGGGBACFEIAFHFABAECBIFFDEAEFHACHCDF"));
  }

  //@Test
  public void case28() {
    assertEquals(18, _calc.minStrokes("GDBBKCKABKHJDDJEJHKAIGEKCKGAC"));
  }

  //@Test
  public void case29() {
    assertEquals(6, _calc.minStrokes("ABCBADEFED"));
  }

  //@Test
  public void case30() {
    assertEquals(24, _calc.minStrokes("EACBDEBCEDFAFACFABAFEACDFCBEDECFEFADAEFE"));
  }

  //@Test
  public void case31() {
    assertEquals(26, _calc.minStrokes("BECBBDDEEBABDCADEAAEABCACBDBEECDEDEACACCBEDABEDADD"));
  }

  //@Test
  public void case32() {
    assertEquals(26, _calc.minStrokes("BECBBDDEEBABDCADEAAEABCACBDBEECDEDEACACCBEDABEDABB"));
  }

  //@Test
  public void case33() {
    assertEquals(26, _calc.minStrokes("ABABABABCDEFGHIJKJHIGFEDABABABABCABABCAAAAABCABAAA"));
  }

  //@Test
  public void case34() {
    assertEquals(26, _calc.minStrokes("BECBBDDEEBABDCADEAAEABCACBDBEECDEDEACACCBEDABEBACC"));
  }

  //@Test
  public void case35() {
    assertEquals(26, _calc.minStrokes("ABABABABABABABABABABABABABABABABABABABABABABABABAB"));
  }

  //@Test
  public void case36() {
    assertEquals(1, _calc.minStrokes("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"));
  }

  //@Test
  public void case37() {
    assertEquals(6, _calc.minStrokes("RGRBGBGCG"));
  }
}
