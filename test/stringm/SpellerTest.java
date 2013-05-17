package topc.test.stringm;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.stringm.*;

public class SpellerTest {
  Speller speller = new Speller();

  @Test
  public void case1() {
    String number = "forty-two";
    assertEquals(42, speller.value(number));
  }

  @Test
  public void case2() {
    String number = "FORTY-TWO";
    assertEquals(-1, speller.value(number));
  }

  @Test
  public void case3() {
    String number = "eightene";
    assertEquals(18, speller.value(number));
  }

  @Test
  public void case4() {
    String number = "one-hundred";
    assertEquals(-1, speller.value(number));
  }

  @Test
  public void case5() {
    String number = "fifty-fifty";
    assertEquals(58, speller.value(number));
  }

  @Test
  public void case6() {
    String number = "fi";
    assertEquals(-1, speller.value(number));
  }

  @Test
  public void case7() {
    String number = "thirty";
    assertEquals(30, speller.value(number));
  }

  @Test
  public void case8() {
    String number = "fortytwo";
    assertEquals(14, speller.value(number));
  }

  @Test
  public void case9() {
    String number = "@-x";
    assertEquals(6, speller.value(number));
  }

  @Test
  public void case10() {
    String number = "f#$!";
    assertEquals(-1, speller.value(number));
  }

  @Test
  public void case11() {
    String number = "f()e";
    assertEquals(5, speller.value(number));
  }

  @Test
  public void case12() {
    String number = "abcdefghejklm";
    assertEquals(78, speller.value(number));
  }

  @Test
  public void case13() {
    String number = "abcdefghijkl";
    assertEquals(-1, speller.value(number));
  }

  @Test
  public void case14() {
    String number = "abcdefeeeee";
    assertEquals(-1, speller.value(number));
  }

  @Test
  public void case15() {
    String number = "a-cndefgwi";
    assertEquals(22, speller.value(number));
  }

  @Test
  public void case16() {
    String number = "42";
    assertEquals(-1, speller.value(number));
  }

  @Test
  public void case17() {
    String number = "thirty-fiur";
    assertEquals(34, speller.value(number));
  }

  @Test
  public void case18() {
    String number = "ninety-fine";
    assertEquals(-1, speller.value(number));
  }

  @Test
  public void case19() {
    String number = "nin***-nine";
    assertEquals(99, speller.value(number));
  }

  @Test
  public void case20() {
    String number = "two-twenty";
    assertEquals(-1, speller.value(number));
  }

  @Test
  public void case21() {
    String number = "four-fourty";
    assertEquals(43, speller.value(number));
  }

  @Test
  public void case22() {
    String number = "six-ninety";
    assertEquals(69, speller.value(number));
  }

  @Test
  public void case23() {
    String number = "six-seven";
    assertEquals(-1, speller.value(number));
  }

  @Test
  public void case24() {
    String number = "four-eleven";
    assertEquals(47, speller.value(number));
  }

  @Test
  public void case25() {
    String number = "forty-two";
    assertEquals(42, speller.value(number));
  }

  @Test
  public void case26() {
    String number = "eighty-one";
    assertEquals(81, speller.value(number));
  }

  @Test
  public void case27() {
    String number = "seven-een";
    assertEquals(17, speller.value(number));
  }

  @Test
  public void case28() {
    String number = "zero";
    assertEquals(-1, speller.value(number));
  }

  @Test
  public void case29() {
    String number = "twentyxsix";
    assertEquals(26, speller.value(number));
  }

  @Test
  public void case30() {
    String number = "th-rty-four";
    assertEquals(34, speller.value(number));
  }

  @Test
  public void case31() {
    String number = "fortyatwo";
    assertEquals(42, speller.value(number));
  }

  @Test
  public void case32() {
    String number = "twenty";
    assertEquals(20, speller.value(number));
  }

  @Test
  public void case33() {
    String number = "FORTY-TWO";
    assertEquals(-1, speller.value(number));
  }

  @Test
  public void case34() {
    String number = "ninete";
    assertEquals(90, speller.value(number));
  }

  @Test
  public void case35() {
    String number = "three";
    assertEquals(3, speller.value(number));
  }

  @Test
  public void case36() {
    String number = "sev-nty";
    assertEquals(70, speller.value(number));
  }

  @Test
  public void case37() {
    String number = "o";
    assertEquals(-1, speller.value(number));
  }

  @Test
  public void case38() {
    String number = "fiver";
    assertEquals(-1, speller.value(number));
  }

}
