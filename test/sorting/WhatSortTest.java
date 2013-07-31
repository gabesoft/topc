package topc.test.sorting;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.sorting.*;

public class WhatSortTest {
  WhatSort whatsort = new WhatSort();

  @Test
  public void case1() {
    String[] name = { "BOB", "BOB", "DAVE", "JOE" };
    int[] age = { 22, 35, 35, 30 };
    int[] wt = { 122, 122, 195, 200 };
    assertEquals("IND", whatsort.sortType(name, age, wt));
  }

  @Test
  public void case2() {
    String[] name = { "BOB", "BOB", "DAVE", "DAVE" };
    int[] age = { 22, 35, 35, 30 };
    int[] wt = { 122, 122, 195, 200 };
    assertEquals("NOT", whatsort.sortType(name, age, wt));
  }

  @Test
  public void case3() {
    String[] name = { "BOB", "BOB", "DAVE", "DAVE" };
    int[] age = { 22, 35, 35, 30 };
    int[] wt = { 122, 122, 195, 190 };
    assertEquals("NWA", whatsort.sortType(name, age, wt));
  }

  @Test
  public void case4() {
    String[] name = { "A", "A", "A", "AA", "A" };
    int[] age = { 3, 8, 2, 4, 9 };
    int[] wt = { 175, 173, 160, 160, 122 };
    assertEquals("IND", whatsort.sortType(name, age, wt));
  }

  @Test
  public void case5() {
    String[] name = { "A", "A", "AAA", "AA", "A" };
    int[] age = { 3, 8, 2, 4, 9 };
    int[] wt = { 175, 173, 160, 160, 122 };
    assertEquals("WAN", whatsort.sortType(name, age, wt));
  }

  @Test
  public void case6() {
    String[] name = { "A", "A", "A", "B", "B", "C" };
    int[] age = { 48, 48, 72, 70, 71, 75 };
    int[] wt = { 10, 10, 9, 9, 8, 8 };
    assertEquals("IND", whatsort.sortType(name, age, wt));
  }

  @Test
  public void case7() {
    String[] name = { "A", "B", "A", "B", "B", "C" };
    int[] age = { 48, 48, 72, 70, 71, 75 };
    int[] wt = { 10, 10, 9, 9, 8, 8 };
    assertEquals("WNA", whatsort.sortType(name, age, wt));
  }

  @Test
  public void case8() {
    String[] name = { "D", "D", "D", "D", "D", "D" };
    int[] age = { 1, 2, 3, 4, 5, 6 };
    int[] wt = { 6, 5, 4, 1, 3, 2 };
    assertEquals("IND", whatsort.sortType(name, age, wt));
  }

  @Test
  public void case9() {
    String[] name = { "JEREMIAH", "BOB", "BOB" };
    int[] age = { 7, 2, 3 };
    int[] wt = { 200, 180, 180 };
    assertEquals("IND", whatsort.sortType(name, age, wt));
  }

  @Test
  public void case10() {
    String[] name = { "JEREMIAH", "JEREMIAH", "YAHOUDI" };
    int[] age = { 7, 12, 3 };
    int[] wt = { 200, 220, 220 };
    assertEquals("NAW", whatsort.sortType(name, age, wt));
  }

  @Test
  public void case11() {
    String[] name = { "A", "B", "C", "C", "A", "A", "A" };
    int[] age = { 1, 1, 1, 1, 2, 2, 2 };
    int[] wt = { 200, 230, 240, 230, 300, 300, 198 };
    assertEquals("ANW", whatsort.sortType(name, age, wt));
  }

  @Test
  public void case12() {
    String[] name = { "DAVE", "EDGAR", "AL", "AL", "BILL", "BILL", "ABLE", "AL", "JIM", "JIM" };
    int[] age = { 20, 21, 22, 23, 23, 23, 23, 24, 25, 25 };
    int[] wt = { 150, 180, 200, 212, 212, 200, 100, 223, 229, 229 };
    assertEquals("AWN", whatsort.sortType(name, age, wt));
  }

  @Test
  public void case13() {
    String[] name = { "DAVE", "EDGAR", "ALL", "AL", "BILL", "BILL", "ABLE", "AL", "JIM", "JIM" };
    int[] age = { 20, 21, 22, 23, 23, 23, 23, 25, 25, 25 };
    int[] wt = { 150, 180, 200, 212, 212, 200, 100, 223, 229, 229 };
    assertEquals("NOT", whatsort.sortType(name, age, wt));
  }

  @Test
  public void case14() {
    String[] name = { "DAVE", "EDGAR", "AL", "AL", "AL", "AL", "ABLE", "AL", "JIM", "JIM" };
    int[] age = { 20, 21, 22, 23, 23, 23, 23, 24, 25, 25 };
    int[] wt = { 150, 180, 212, 212, 212, 212, 201, 223, 229, 229 };
    assertEquals("AWN", whatsort.sortType(name, age, wt));
  }

  @Test
  public void case15() {
    String[] name = { "A", "B", "C", "C", "A", "A", "A" };
    int[] age = { 1, 1, 1, 1, 2, 2, 2 };
    int[] wt = { 260, 250, 240, 240, 300, 300, 198 };
    assertEquals("IND", whatsort.sortType(name, age, wt));
  }

  @Test
  public void case16() {
    String[] name = { "A", "B", "C", "C", "A", "A", "A" };
    int[] age = { 1, 1, 1, 1, 1, 1, 1 };
    int[] wt = { 200, 230, 240, 230, 300, 300, 198 };
    assertEquals("NOT", whatsort.sortType(name, age, wt));
  }

  @Test
  public void case17() {
    String[] name = { "JEREMIAHJONES", "JEREMIAH", "YAHOUDI" };
    int[] age = { 7, 12, 3 };
    int[] wt = { 200, 220, 220 };
    assertEquals("NOT", whatsort.sortType(name, age, wt));
  }

  @Test
  public void case18() {
    String[] name = { "JEREMIAH", "JEREMIAH", "YAHOUDI" };
    int[] age = { 7, 12, 3 };
    int[] wt = { 220, 220, 220 };
    assertEquals("IND", whatsort.sortType(name, age, wt));
  }

  @Test
  public void case19() {
    String[] name = { "A", "B", "A", "A", "B", "C" };
    int[] age = { 48, 48, 72, 70, 71, 75 };
    int[] wt = { 10, 10, 9, 9, 8, 8 };
    assertEquals("NOT", whatsort.sortType(name, age, wt));
  }

  @Test
  public void case20() {
    String[] name = { "A", "B", "A", "B", "B", "C", "C" };
    int[] age = { 48, 48, 72, 70, 71, 75, 75 };
    int[] wt = { 10, 10, 9, 9, 8, 8, 8 };
    assertEquals("WNA", whatsort.sortType(name, age, wt));
  }

  @Test
  public void case21() {
    String[] name = { "BOB", "BOB", "DAVE", "DAVE" };
    int[] age = { 22, 35, 35, 30 };
    int[] wt = { 122, 122, 195, 200 };
    assertEquals("NOT", whatsort.sortType(name, age, wt));
  }

  @Test
  public void case22() {
    String[] name = { "BOB", "BOB", "DAVE", "JOE" };
    int[] age = { 22, 35, 35, 30 };
    int[] wt = { 122, 122, 195, 200 };
    assertEquals("IND", whatsort.sortType(name, age, wt));
  }

  @Test
  public void case23() {
    String[] name = { "BOB", "BOB", "DAVE", "DAVE" };
    int[] age = { 22, 35, 35, 30 };
    int[] wt = { 122, 122, 195, 190 };
    assertEquals("NWA", whatsort.sortType(name, age, wt));
  }

  @Test
  public void case24() {
    String[] name = { "DAVE", "DAVE", "BOB", "DAVE" };
    int[] age = { 25, 30, 30, 25 };
    int[] wt = { 200, 200, 180, 180 };
    assertEquals("WNA", whatsort.sortType(name, age, wt));
  }

  @Test
  public void case25() {
    String[] name = { "BOB", "BOB" };
    int[] age = { 20, 20 };
    int[] wt = { 100, 100 };
    assertEquals("IND", whatsort.sortType(name, age, wt));
  }

  @Test
  public void case26() {
    String[] name = { "ZZZ", "AAA", "AAA" };
    int[] age = { 1, 2, 3 };
    int[] wt = { 66, 55, 44 };
    assertEquals("IND", whatsort.sortType(name, age, wt));
  }

  @Test
  public void case27() {
    String[] name = { "BOB", "BOB" };
    int[] age = { 200, 40 };
    int[] wt = { 2, 2 };
    assertEquals("NOT", whatsort.sortType(name, age, wt));
  }

}
