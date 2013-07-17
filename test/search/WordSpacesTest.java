package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class WordSpacesTest {
  WordSpaces wordspaces = new WordSpaces();

  @Test
  public void case1() {
    String sentence = "zoidal wrote this problem";
    String[] words = { "ilreh", "problem", "woe", "zar", "ot" };
    assertArrayEquals(new int[] { 2, 18, 7, 0, 1 }, wordspaces.find(sentence, words));
  }

  @Test
  public void case2() {
    String sentence = "test case number seven";
    String[] words = { "ts", "etc", "nees", "ten" };
    assertArrayEquals(new int[] { 0, 1, -1, -1 }, wordspaces.find(sentence, words));
  }

  @Test
  public void case3() {
    String sentence = "the job of     writing testcases  is not  much fun";
    String[] words = { "tow", "wit", "ten", "eat" };
    assertArrayEquals(new int[] { -1, 15, 23, -1 }, wordspaces.find(sentence, words));
  }

  @Test
  public void case4() {
    String sentence = "sometimes  testcases  are randomly  generated";
    String[] words = { "set", "ate", "tea", "dome" };
    assertArrayEquals(new int[] { 0, 41, 14, -1 }, wordspaces.find(sentence, words));
  }

  @Test
  public void case5() {
    String sentence = "xtywzoapbicndkefflgahmiijnkgloms";
    String[] words = { "two", "pink", "flamingos", "are", "in", "this", "sentence" };
    assertArrayEquals(new int[] { 1, 7, 15, -1, 9, -1, -1 }, wordspaces.find(sentence, words));
  }

  @Test
  public void case6() {
    String sentence = "abcdefgabcdefgabcdefgabcdefgabcdefgabcdefgabcdefg";
    String[] words = { "gfedcba", "acegbdfacegbdfacegbdfaceg", "bfcgdaebfcgd", "fdbgecafd", "cdefgabcdefgabcdefgabcdefgabcdefgabcdefgabcdefg", "dgcfbeadgcfbeadg", "ebfcgdaebfcg" };
    assertArrayEquals(new int[] { 6, 0, 1, 5, 2, 3, 4 }, wordspaces.find(sentence, words));
  }

  @Test
  public void case7() {
    String sentence = "only four more testcases to go";
    String[] words = { "yu", "ot", "cs", "x", "n", "m" };
    assertArrayEquals(new int[] { 3, 0, 19, -1, 1, 10 }, wordspaces.find(sentence, words));
  }

  @Test
  public void case8() {
    String sentence = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwx";
    String[] words = { "aa", "bb", "cc", "dd", "ee", "ff", "gg", "hh", "ii", "jj", "kk", "ll", "mm", "nn", "oo", "pp", "qq", "rr", "ss", "tt", "uu", "vv", "ww", "xx", "yy", "zz", "aw", "kj", "oi", "ew", "sr", "ew", "zs", "en", "bq", "zy", "kw", "lw", "ox", "asd", "rew", "oiu", "the", "hak", "ewj", "sid", "jwe", "sjd" };
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, -1, -1, 0, 10, 14, 4, 18, 4, 25, 4, 1, -1, 10, 11, 14, -1, -1, -1, -1, -1, -1, -1, -1, -1 }, wordspaces.find(sentence, words));
  }

  @Test
  public void case9() {
    String sentence = "the square root of pi is irrational";
    String[] words = { "pii", "tesur", "oo", "qaer", "ooo", "pit", "pir", "qeof" };
    assertArrayEquals(new int[] { 19, 0, 12, 5, -1, -1, -1, 5 }, wordspaces.find(sentence, words));
  }

  @Test
  public void case10() {
    String sentence = "       too            many          spaces       ";
    String[] words = { "tms", "tmp", "tma", "tmc", "tme", "tas", "tap", "taa", "tac", "tns", "one" };
    assertArrayEquals(new int[] { -1, 7, -1, -1, -1, -1, -1, -1, 7, 7, 8 }, wordspaces.find(sentence, words));
  }

  @Test
  public void case11() {
    String sentence = "at bah ate";
    String[] words = { "the", "aa", "hae" };
    assertArrayEquals(new int[] { 1, 0, 5 }, wordspaces.find(sentence, words));
  }

  @Test
  public void case12() {
    String sentence = "test this one out";
    String[] words = { "test", "tst", "hoe", "not" };
    assertArrayEquals(new int[] { 0, 0, -1, -1 }, wordspaces.find(sentence, words));
  }

  @Test
  public void case13() {
    String sentence = "t ah mi as this";
    String[] words = { "this", "mat", "zebra", "hh" };
    assertArrayEquals(new int[] { 0, 5, -1, 3 }, wordspaces.find(sentence, words));
  }

  @Test
  public void case14() {
    String sentence = "abcdefghijklmnoqrstuvwxyz zywvutsrponmlkjighfedcba";
    String[] words = { "foy", "foz", "fox", "ace", "rom" };
    assertArrayEquals(new int[] { 5, -1, -1, 0, 33 }, wordspaces.find(sentence, words));
  }

  @Test
  public void case15() {
    String sentence = "ridikulus ridiculous";
    String[] words = { "kuri", "ks", "cs", "z", "i", "rsl" };
    assertArrayEquals(new int[] { 4, 4, 14, -1, 1, 0 }, wordspaces.find(sentence, words));
  }

  @Test
  public void case16() {
    String sentence = "a";
    String[] words = { "a" };
    assertArrayEquals(new int[] { 0 }, wordspaces.find(sentence, words));
  }

  @Test
  public void case17() {
    String sentence = "abcdefghijklmnoqrstuvwxyz zywvutsrponmlkjighfedcba";
    String[] words = { "foy", "foz", "fox", "ace", "rom" };
    assertArrayEquals(new int[] { 5, -1, -1, 0, 33 }, wordspaces.find(sentence, words));
  }

  @Test
  public void case18() {
    String sentence = "tdhebtuhgfe bugthe frthe etth th ss hh ther ttther";
    String[] words = { "the", "ther", "bug", "e", "er", "ug", "bg", "tt", "tr" };
    assertArrayEquals(new int[] { 15, 39, 4, 3, 3, 6, 4, 0, 0 }, wordspaces.find(sentence, words));
  }

  @Test
  public void case19() {
    String sentence = "abcdef";
    String[] words = { "bb" };
    assertArrayEquals(new int[] { -1 }, wordspaces.find(sentence, words));
  }

}
