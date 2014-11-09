package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class WordPartsTest {
  WordParts wordparts = new WordParts();

  @Test
  public void case1() {
    String original = "ANTIDISESTABLISHMENTARIANISM";
    String compound = "ANTIDISIANISMISM";
    assertEquals(3, wordparts.partCount(original, compound));
  }

  @Test
  public void case2() {
    String original = "ANTIDISESTABLISHMENTARIANISM";
    String compound = "ESTABLISHMENT";
    assertEquals(-1, wordparts.partCount(original, compound));
  }

  @Test
  public void case3() {
    String original = "TOPCODERDOTCOM";
    String compound = "TOMTMODERDOTCOM";
    assertEquals(5, wordparts.partCount(original, compound));
  }

  @Test
  public void case4() {
    String original = "HELLO";
    String compound = "HELLOHEHELLOLOHELLO";
    assertEquals(5, wordparts.partCount(original, compound));
  }

  @Test
  public void case5() {
    String original = "DONTFORGETTHEEMPTYCASE";
    String compound = "";
    assertEquals(0, wordparts.partCount(original, compound));
  }

  @Test
  public void case6() {
    String original = "BAAABA";
    String compound = "BAAABAAA";
    assertEquals(2, wordparts.partCount(original, compound));
  }

  @Test
  public void case7() {
    String original = "ABCXABCYABC";
    String compound = "ABCYABCA";
    assertEquals(2, wordparts.partCount(original, compound));
  }

  @Test
  public void case8() {
    String original = "MHHMHMHMHHMHHMMHHMHMMMMMHMMHHMMMMMMMMHMMMHMMMHHHMH";
    String compound = "HMHHMHHHMHMHHMHHHMHMHHMHMHMMHHMHHMHHMHMHMHHMHMHHMH";
    assertEquals(10, wordparts.partCount(original, compound));
  }

  @Test
  public void case9() {
    String original = "AAAAAAPPPPAPPPAAAPAAAAAPPAPAAAAPAAAAPPAAAPPAPPPPAP";
    String compound = "PAPPPPAPAPPPAPPAPPPPAPAAAPPPPAPAPPPPAPAAAAAAAAAPAP";
    assertEquals(10, wordparts.partCount(original, compound));
  }

  @Test
  public void case10() {
    String original = "YJYYYJJJJYYYJJYJYJJYJJJYJYJYJJYYYYJJJJYJYYJYYJJJJJ";
    String compound = "YJYYYJJJJJJYJYYYYJJJJJYYJJJJJYJYYYJYYYJJYJJJJJJYJY";
    assertEquals(10, wordparts.partCount(original, compound));
  }

  @Test
  public void case11() {
    String original = "PHPPPPPHPHHHHHPPPHHHPPHHPPPHPPPPPPPHHHPHHHPHHPPPPH";
    String compound = "PPPPPHHHHPPPPHPPPPHHHPPPPHPHPHPPHHPPPPHPPPPPHPHPPP";
    assertEquals(12, wordparts.partCount(original, compound));
  }

  @Test
  public void case12() {
    String original = "UUNUNNUNNUNUUUNUNUNUNUNNUUUNUUNNUUNUUUNUUUNNNNUUUN";
    String compound = "UUNUNUUNUNNUNUNNNUUUNNNNNUUUNUUNUNNUNNNNUUUNNNUUUN";
    assertEquals(8, wordparts.partCount(original, compound));
  }

  @Test
  public void case13() {
    String original = "ABCDA";
    String compound = "ABCDAB";
    assertEquals(2, wordparts.partCount(original, compound));
  }

  @Test
  public void case14() {
    String original = "WEERWRRWWRRWRWRWRWWWWRRRWWWRRRWWRRWRWRRWRWWRRWWEER";
    String compound = "REWWRWWRREEWWW";
    assertEquals(-1, wordparts.partCount(original, compound));
  }

  @Test
  public void case15() {
    String original = "AYYAEAEEEAAAEAEAAEAEAAAEAAEAAEAAAEAEEEEAAAAAAAAYYE";
    String compound = "EEEAAAEYEYYYAA";
    assertEquals(-1, wordparts.partCount(original, compound));
  }

  @Test
  public void case16() {
    String original = "VQQVTTTVTTVTTTTVTTVVVTVVTVTVVTTVVTVTTTTVVTTVTTTQQT";
    String compound = "TTVVVVVQVQTQVV";
    assertEquals(-1, wordparts.partCount(original, compound));
  }

  @Test
  public void case17() {
    String original = "JZZJJMJMMMJMMJMMMMJMMJJMJJMMMMMMMMJJMJJJJMJJMJMZZM";
    String compound = "MJJMZMZMZZJJZJ";
    assertEquals(-1, wordparts.partCount(original, compound));
  }

  @Test
  public void case18() {
    String original = "IRRNNIININNINNIIIIIINNININIIINIIIINNNNIININNIIIRRN";
    String compound = "NNRRNNIRRIIRII";
    assertEquals(9, wordparts.partCount(original, compound));
  }

  @Test
  public void case19() {
    String original = "A";
    String compound = "";
    assertEquals(0, wordparts.partCount(original, compound));
  }

  @Test
  public void case20() {
    String original = "A";
    String compound = "B";
    assertEquals(-1, wordparts.partCount(original, compound));
  }

  @Test
  public void case21() {
    String original = "A";
    String compound = "A";
    assertEquals(1, wordparts.partCount(original, compound));
  }

  @Test
  public void case22() {
    String original = "CDEABC";
    String compound = "ABCDE";
    assertEquals(-1, wordparts.partCount(original, compound));
  }

  @Test
  public void case23() {
    String original = "AB";
    String compound = "AB";
    assertEquals(1, wordparts.partCount(original, compound));
  }

  @Test
  public void case24() {
    String original = "AB";
    String compound = "AA";
    assertEquals(2, wordparts.partCount(original, compound));
  }

  @Test
  public void case25() {
    String original = "AB";
    String compound = "BB";
    assertEquals(2, wordparts.partCount(original, compound));
  }

  @Test
  public void case26() {
    String original = "AB";
    String compound = "BA";
    assertEquals(2, wordparts.partCount(original, compound));
  }

  @Test
  public void case27() {
    String original = "ABBBAABABBBAABBABBABABBABAABBAABBBBBABBABABBABAABB";
    String compound = "BBBAABABBBAABBABBABABBABAABBAABBBBBABBABABBABAABAA";
    assertEquals(17, wordparts.partCount(original, compound));
  }

  @Test
  public void case28() {
    String original = "ANTIDISESTABLISHMENTARIANISM";
    String compound = "ANTIDISIANISMISM";
    assertEquals(3, wordparts.partCount(original, compound));
  }

  @Test
  public void case29() {
    String original = "ABBBAABABBBAABBABBABABBABAABBAABBBBBABBABABBABAABB";
    String compound = "BBBAABABBBAABBABBABABBABAABBAABBBBBABBABABBABAABAA";
    assertEquals(17, wordparts.partCount(original, compound));
  }

  @Test
  public void case30() {
    String original = "AAA";
    String compound = "AAA";
    assertEquals(1, wordparts.partCount(original, compound));
  }

  @Test
  public void case31() {
    String original = "ABBBAABABBBAABBABBABABBABAABBAABAAABABBABABBABAABB";
    String compound = "BBBAAAABABAABBABBABABBABAABBAABABABABBABABBABAABAA";
    assertEquals(20, wordparts.partCount(original, compound));
  }

  @Test
  public void case32() {
    String original = "BAAABA";
    String compound = "BAAABAAA";
    assertEquals(2, wordparts.partCount(original, compound));
  }

  @Test
  public void case33() {
    String original = "GTI";
    String compound = "GTI";
    assertEquals(1, wordparts.partCount(original, compound));
  }

  @Test
  public void case34() {
    String original = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
    String compound = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
    assertEquals(1, wordparts.partCount(original, compound));
  }

  @Test
  public void case35() {
    String original = "ABBEBCC";
    String compound = "ABBCC";
    assertEquals(2, wordparts.partCount(original, compound));
  }

}
