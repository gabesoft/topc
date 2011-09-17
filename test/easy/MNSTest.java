package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class MNSTest {
  MNS mns = new MNS();

  @Test
  public void case1() {
    int[] numbers = { 1, 2, 3, 3, 2, 1, 2, 2, 2 };
    assertEquals(18, mns.combos(numbers));
  }

  @Test
  public void case2() {
    int[] numbers = { 4, 4, 4, 4, 4, 4, 4, 4, 4 };
    assertEquals(1, mns.combos(numbers));
  }

  @Test
  public void case3() {
    int[] numbers = { 1, 5, 1, 2, 5, 6, 2, 3, 2 };
    assertEquals(36, mns.combos(numbers));
  }

  @Test
  public void case4() {
    int[] numbers = { 1, 2, 6, 6, 6, 4, 2, 6, 4 };
    assertEquals(0, mns.combos(numbers));
  }

  @Test
  public void case5() {
    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    assertEquals(72, mns.combos(numbers));
  }

  @Test
  public void case6() {
    int[] numbers = { 4, 4, 4, 4, 4, 4, 3, 3, 3 };
    assertEquals(6, mns.combos(numbers));
  }

  @Test
  public void case7() {
    int[] numbers = { 3, 2, 6, 2, 3, 5, 2, 6, 7 };
    assertEquals(0, mns.combos(numbers));
  }

  @Test
  public void case8() {
    int[] numbers = { 2, 6, 2, 8, 9, 9, 5, 7, 6 };
    assertEquals(0, mns.combos(numbers));
  }

  @Test
  public void case9() {
    int[] numbers = { 4, 6, 4, 3, 5, 6, 3, 5, 3 };
    assertEquals(0, mns.combos(numbers));
  }

  @Test
  public void case10() {
    int[] numbers = { 0, 0, 0, 0, 9, 0, 0, 0, 0 };
    assertEquals(0, mns.combos(numbers));
  }

  @Test
  public void case11() {
    int[] numbers = { 0, 0, 0, 3, 3, 3, 0, 0, 0 };
    assertEquals(6, mns.combos(numbers));
  }

  @Test
  public void case12() {
    int[] numbers = { 1, 2, 3, 1, 2, 3, 1, 2, 3 };
    assertEquals(12, mns.combos(numbers));
  }

  @Test
  public void case13() {
    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 0 };
    assertEquals(72, mns.combos(numbers));
  }

  @Test
  public void case14() {
    int[] numbers = { 3, 4, 3, 4, 3, 4, 5, 5, 5 };
    assertEquals(12, mns.combos(numbers));
  }

  @Test
  public void case15() {
    int[] numbers = { 0, 2, 4, 6, 8, 2, 4, 6, 8 };
    assertEquals(0, mns.combos(numbers));
  }

  @Test
  public void case16() {
    int[] numbers = { 4, 4, 5, 6, 7, 8, 9, 2, 3 };
    assertEquals(72, mns.combos(numbers));
  }

  @Test
  public void case17() {
    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    assertEquals(72, mns.combos(numbers));
  }

  @Test
  public void case18() {
    int[] numbers = { 1, 4, 2, 3, 1, 4, 5, 6, 7 };
    assertEquals(0, mns.combos(numbers));
  }

  @Test
  public void case19() {
    int[] numbers = { 1, 5, 1, 2, 5, 6, 2, 3, 2 };
    assertEquals(36, mns.combos(numbers));
  }

  @Test
  public void case20() {
    int[] numbers = { 4, 4, 4, 4, 6, 2, 4, 2, 6 };
    assertEquals(18, mns.combos(numbers));
  }

  @Test
  public void case21() {
    int[] numbers = { 4, 4, 4, 4, 4, 4, 4, 4, 5 };
    assertEquals(0, mns.combos(numbers));
  }

  @Test
  public void case22() {
    int[] numbers = { 1, 1, 1, 1, 1, 1, 1, 1, 4 };
    assertEquals(0, mns.combos(numbers));
  }

  @Test
  public void case23() {
    int[] numbers = { 2, 1, 1, 1, 2, 1, 1, 1, 2 };
    assertEquals(6, mns.combos(numbers));
  }

}
