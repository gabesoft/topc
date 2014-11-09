package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class OrchardTest {
  Orchard sut = new Orchard();

  @Test
  public void case1() {
    String[] orchard = { "----", "T---", "----", "----" };
    assertArrayEquals(new int[] { 2, 3 }, sut.nextTree(orchard));
  }

  @Test
  public void case2() {
    String[] orchard = { "---T--", "------", "------", "----T-", "------", "------" };
    assertArrayEquals(new int[] { 3, 3 }, sut.nextTree(orchard));
  }

  @Test
  public void case3() {
    String[] orchard = { "------------", "------------", "------------", "------------", "------------", "------------", "------------", "------------", "------------", "------------", "------------", "------------" };
    assertArrayEquals(new int[] { 6, 6 }, sut.nextTree(orchard));
  }

  @Test
  public void case4() {
    String[] orchard = { "-" };
    assertArrayEquals(new int[] { 1, 1 }, sut.nextTree(orchard));
  }

  @Test
  public void case5() {
    String[] orchard = { "-T----T", "T---T--", "-----TT", "---TT--", "T-----T", "-------", "T-T--T-" };
    assertArrayEquals(new int[] { 2, 3 }, sut.nextTree(orchard));
  }

  @Test
  public void case6() {
    String[] orchard = { "---TT-", "--TT-T", "--TT-T", "---T-T", "--TT-T", "--TT-T" };
    assertArrayEquals(new int[] { 4, 2 }, sut.nextTree(orchard));
  }

  @Test
  public void case7() {
    String[] orchard = { "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT", "---TT-TT----------------------TTTTTTT------TTTTTTT" };
    assertArrayEquals(new int[] { 11, 19 }, sut.nextTree(orchard));
  }

  @Test
  public void case8() {
    String[] orchard = { "-----T-T", "--T---T-", "T-T--T-T", "--------", "--------", "---T----", "--------", "--------" };
    assertArrayEquals(new int[] { 2, 5 }, sut.nextTree(orchard));
  }

  @Test
  public void case9() {
    String[] orchard = { "-----T-T", "--T---T-", "T-T----T", "--------", "--------", "---T----", "--------", "--------" };
    assertArrayEquals(new int[] { 4, 5 }, sut.nextTree(orchard));
  }

  @Test
  public void case10() {
    String[] orchard = { "-----T-T", "--T---T-", "T-T----T", "--------", "--------", "--------", "--------", "--------" };
    assertArrayEquals(new int[] { 5, 5 }, sut.nextTree(orchard));
  }

  @Test
  public void case11() {
    String[] orchard = { "-" };
    assertArrayEquals(new int[] { 1, 1 }, sut.nextTree(orchard));
  }

  @Test
  public void case12() {
    String[] orchard = { "TTT", "T-T", "TTT" };
    assertArrayEquals(new int[] { 2, 2 }, sut.nextTree(orchard));
  }

  @Test
  public void case13() {
    String[] orchard = { "---", "---", "---" };
    assertArrayEquals(new int[] { 2, 2 }, sut.nextTree(orchard));
  }

  @Test
  public void case14() {
    String[] orchard = { "T--", "---", "---" };
    assertArrayEquals(new int[] { 2, 2 }, sut.nextTree(orchard));
  }

  @Test
  public void case15() {
    String[] orchard = { "TT-", "---", "---" };
    assertArrayEquals(new int[] { 1, 3 }, sut.nextTree(orchard));
  }

  @Test
  public void case16() {
    String[] orchard = { "TT-", "---", "--T" };
    assertArrayEquals(new int[] { 1, 3 }, sut.nextTree(orchard));
  }

  @Test
  public void case17() {
    String[] orchard = { "----", "--T-", "----", "----" };
    assertArrayEquals(new int[] { 3, 2 }, sut.nextTree(orchard));
  }

  @Test
  public void case18() {
    String[] orchard = { "-----", "--T--", "-----", "-----", "T----" };
    assertArrayEquals(new int[] { 3, 2 }, sut.nextTree(orchard));
  }

  @Test
  public void case19() {
    String[] orchard = { "TT-TT", "T---T", "-----", "T---T", "TT-TT" };
    assertArrayEquals(new int[] { 3, 3 }, sut.nextTree(orchard));
  }

  @Test
  public void case20() {
    String[] orchard = { "TT-TT", "T---T", "-----", "T---T", "T-TTT" };
    assertArrayEquals(new int[] { 2, 3 }, sut.nextTree(orchard));
  }

  @Test
  public void case21() {
    String[] orchard = { "TT-TT", "T---T", "--T--", "T---T", "T-TTT" };
    assertArrayEquals(new int[] { 1, 3 }, sut.nextTree(orchard));
  }

  @Test
  public void case22() {
    String[] orchard = { "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", "--------------------------------------------------", "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", "--------------------------------------------------", "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", "--------------------------------------------------", "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", "--------------------------------------------------", "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", "--------------------------------------------------", "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", "--------------------------------------------------", "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", "--------------------------------------------------", "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", "--------------------------------------------------", "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", "--------------------------------------------------", "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", "--------------------------------------------------", "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", "--------------------------------------------------", "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", "--------------------------------------------------", "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", "--------------------------------------------------", "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", "--------------------------------------------------", "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", "--------------------------------------------------", "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", "--------------------------------------------------", "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", "--------------------------------------------------", "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", "--------------------------------------------------", "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", "--------------------------------------------------", "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", "--------------------------------------------------", "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", "--------------------------------------------------", "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", "--------------------------------------------------", "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", "--------------------------------------------------", "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", "--------------------------------------------------", "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT", "--------------------------------------------------" };
    assertArrayEquals(new int[] { 2, 1 }, sut.nextTree(orchard));
  }

  @Test
  public void case23() {
    String[] orchard = { "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------", "--------------------------------------------------" };
    assertArrayEquals(new int[] { 25, 25 }, sut.nextTree(orchard));
  }

  @Test
  public void case24() {
    String[] orchard = { "-T----T", "T---T--", "-----TT", "---TT--", "T-----T", "-------", "T-T--T-" };
    assertArrayEquals(new int[] { 2, 3 }, sut.nextTree(orchard));
  }

  @Test
  public void case25() {
    String[] orchard = { "TT-T---", "TT-T---", "TT-T---", "TT-TTTT", "-------", "TT-TTTT", "TT-TTTT" };
    assertArrayEquals(new int[] { 2, 6 }, sut.nextTree(orchard));
  }

  @Test
  public void case26() {
    String[] orchard = { "-" };
    assertArrayEquals(new int[] { 1, 1 }, sut.nextTree(orchard));
  }

}
