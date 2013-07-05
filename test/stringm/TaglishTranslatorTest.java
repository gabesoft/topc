package topc.test.stringm;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.stringm.*;

public class TaglishTranslatorTest {
  TaglishTranslator taglishtranslator = new TaglishTranslator();

  @Test
  public void case1() {
    String sentence = "The fox jumps to the dog";
    assertEquals("nagjujumps ang fox sa dog", taglishtranslator.translate(sentence));
  }

  @Test
  public void case2() {
    String sentence = "tomek codes";
    assertEquals("nagcocodes si tomek", taglishtranslator.translate(sentence));
  }

  @Test
  public void case3() {
    String sentence = "tHe mAn plAyEd ThE pIAnO";
    assertEquals("nagplAy ang mAn ng pIAnO", taglishtranslator.translate(sentence));
  }

  @Test
  public void case4() {
    String sentence = "Bob will Filed the taxes";
    assertEquals("magFiFiled si Bob ng taxes", taglishtranslator.translate(sentence));
  }

  @Test
  public void case5() {
    String sentence = "Matthew walked to Mathew";
    assertEquals("nagwalk si Matthew kay Mathew", taglishtranslator.translate(sentence));
  }

  @Test
  public void case6() {
    String sentence = "StrongBad kicked TheCheat";
    assertEquals("nagkick si StrongBad ni TheCheat", taglishtranslator.translate(sentence));
  }

  @Test
  public void case7() {
    String sentence = "The fire is the hot";
    assertEquals("nagiis ang fire ng hot", taglishtranslator.translate(sentence));
  }

  @Test
  public void case8() {
    String sentence = "a e";
    assertEquals("nagee si a", taglishtranslator.translate(sentence));
  }

  @Test
  public void case9() {
    String sentence = "the quickbrownfox jumpovered the lazydog";
    assertEquals("nagjumpover ang quickbrownfox ng lazydog", taglishtranslator.translate(sentence));
  }

  @Test
  public void case10() {
    String sentence = "the quickbrownfox jumpedover the lazydog";
    assertEquals("nagjujumpedover ang quickbrownfox ng lazydog", taglishtranslator.translate(sentence));
  }

  @Test
  public void case11() {
    String sentence = "the a e to the i";
    assertEquals("nagee ang a sa i", taglishtranslator.translate(sentence));
  }

  @Test
  public void case12() {
    String sentence = "Sid wiLl shDLJhdlHLHkldDfLHDlHDfLhLDdkfKLDFlDFLked";
    assertEquals("magshDLJhdlHLHkldDfLHDlHDfLhLDdkfKLDFlDFLkeshDLJhdlHLHkldDfLHDlHDfLhLDdkfKLDFlDFLked si Sid", taglishtranslator.translate(sentence));
  }

  @Test
  public void case13() {
    String sentence = "Bob sed";
    assertEquals("nags si Bob", taglishtranslator.translate(sentence));
  }

  @Test
  public void case14() {
    String sentence = "skatou dddAd the kkkaaf";
    assertEquals("nagdddAdddAd si skatou ng kkkaaf", taglishtranslator.translate(sentence));
  }

  @Test
  public void case15() {
    String sentence = "StrongBad kicked TheCheat";
    assertEquals("nagkick si StrongBad ni TheCheat", taglishtranslator.translate(sentence));
  }

  @Test
  public void case16() {
    String sentence = "tomek cOdes";
    assertEquals("nagcOcOdes si tomek", taglishtranslator.translate(sentence));
  }

  @Test
  public void case17() {
    String sentence = "will walked";
    assertEquals("nagwalk si will", taglishtranslator.translate(sentence));
  }

  @Test
  public void case18() {
    String sentence = "tHe mAn will plyta ThE pIAnO";
    assertEquals("magplytaplyta ang mAn ng pIAnO", taglishtranslator.translate(sentence));
  }

  @Test
  public void case19() {
    String sentence = "tomek codes";
    assertEquals("nagcocodes si tomek", taglishtranslator.translate(sentence));
  }

}
