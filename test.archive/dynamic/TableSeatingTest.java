package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class TableSeatingTest {
  double DELTA = 1.0e-09;
  TableSeating tableseating = new TableSeating();

  @Test
  public void case1() {
    int numTables = 4;
    int[] probs = { 100 };
    assertEquals(4.0, tableseating.getExpected(numTables, probs), DELTA * 4.0);
  }

  @Test
  public void case2() {
    int numTables = 4;
    int[] probs = { 0, 100 };
    assertEquals(3.3333333333333335, tableseating.getExpected(numTables, probs), DELTA * 3.3333333333333335);
  }

  @Test
  public void case3() {
    int numTables = 5;
    int[] probs = { 0, 0, 0, 0, 0, 50, 50 };
    assertEquals(0.0, tableseating.getExpected(numTables, probs), DELTA);
  }

  @Test
  public void case4() {
    int numTables = 12;
    int[] probs = { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10 };
    assertEquals(7.871087929710551, tableseating.getExpected(numTables, probs), DELTA * 7.871087929710551);
  }

  @Test
  public void case5() {
    int numTables = 12;
    int[] probs = { 50, 50 };
    assertEquals(10.481925778559631, tableseating.getExpected(numTables, probs), DELTA * 10.481925778559631);
  }

  @Test
  public void case6() {
    int numTables = 12;
    int[] probs = { 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 15 };
    assertEquals(7.808255233597771, tableseating.getExpected(numTables, probs), DELTA * 7.808255233597771);
  }

  @Test
  public void case7() {
    int numTables = 12;
    int[] probs = { 9, 13, 12, 11, 10, 9, 8, 7, 6, 5, 10 };
    assertEquals(7.845338058149987, tableseating.getExpected(numTables, probs), DELTA * 7.845338058149987);
  }

  @Test
  public void case8() {
    int numTables = 1;
    int[] probs = { 50, 50 };
    assertEquals(0.5, tableseating.getExpected(numTables, probs), DELTA * 0.5);
  }

  @Test
  public void case9() {
    int numTables = 12;
    int[] probs = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 5, 5 };
    assertEquals(7.791471890555719, tableseating.getExpected(numTables, probs), DELTA * 7.791471890555719);
  }

  @Test
  public void case10() {
    int numTables = 12;
    int[] probs = { 0, 0, 0, 0, 0, 0, 0, 100 };
    assertEquals(8.0, tableseating.getExpected(numTables, probs), DELTA * 8.0);
  }

  @Test
  public void case11() {
    int numTables = 12;
    int[] probs = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100 };
    assertEquals(11.0, tableseating.getExpected(numTables, probs), DELTA * 11.0);
  }

  @Test
  public void case12() {
    int numTables = 11;
    int[] probs = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100 };
    assertEquals(11.0, tableseating.getExpected(numTables, probs), DELTA * 11.0);
  }

  @Test
  public void case13() {
    int numTables = 12;
    int[] probs = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100 };
    assertEquals(12.0, tableseating.getExpected(numTables, probs), DELTA * 12.0);
  }

  @Test
  public void case14() {
    int numTables = 11;
    int[] probs = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100 };
    assertEquals(0.0, tableseating.getExpected(numTables, probs), DELTA);
  }

  @Test
  public void case15() {
    int numTables = 11;
    int[] probs = { 0, 0, 0, 100, 0, 0, 0, 0 };
    assertEquals(8.0, tableseating.getExpected(numTables, probs), DELTA * 8.0);
  }

  @Test
  public void case16() {
    int numTables = 12;
    int[] probs = { 5, 11, 9, 8, 14, 9, 13, 8, 7, 5, 7, 4 };
    assertEquals(7.936797412852827, tableseating.getExpected(numTables, probs), DELTA * 7.936797412852827);
  }

  @Test
  public void case17() {
    int numTables = 12;
    int[] probs = { 7, 11, 3, 10, 7, 8, 10, 6, 10, 9, 9, 10 };
    assertEquals(8.126028036598123, tableseating.getExpected(numTables, probs), DELTA * 8.126028036598123);
  }

  @Test
  public void case18() {
    int numTables = 12;
    int[] probs = { 7, 8, 10, 6, 11, 3, 11, 8, 12, 4, 9, 11 };
    assertEquals(8.118801968504272, tableseating.getExpected(numTables, probs), DELTA * 8.118801968504272);
  }

  @Test
  public void case19() {
    int numTables = 12;
    int[] probs = { 5, 7, 8, 5, 9, 12, 10, 10, 11, 6, 10, 7 };
    assertEquals(8.11048707258796, tableseating.getExpected(numTables, probs), DELTA * 8.11048707258796);
  }

  @Test
  public void case20() {
    int numTables = 12;
    int[] probs = { 10, 8, 6, 6, 13, 9, 7, 9, 7, 6, 8, 11 };
    assertEquals(8.049878648612912, tableseating.getExpected(numTables, probs), DELTA * 8.049878648612912);
  }

  @Test
  public void case21() {
    int numTables = 12;
    int[] probs = { 8, 8, 8, 5, 8, 15, 13, 10, 2, 5, 12, 6 };
    assertEquals(7.986177114965399, tableseating.getExpected(numTables, probs), DELTA * 7.986177114965399);
  }

  @Test
  public void case22() {
    int numTables = 12;
    int[] probs = { 5, 10, 6, 6, 7, 10, 9, 4, 8, 7, 12, 16 };
    assertEquals(8.348414551784307, tableseating.getExpected(numTables, probs), DELTA * 8.348414551784307);
  }

  @Test
  public void case23() {
    int numTables = 12;
    int[] probs = { 7, 8, 12, 9, 12, 7, 6, 8, 10, 3, 7, 11 };
    assertEquals(8.052738612235387, tableseating.getExpected(numTables, probs), DELTA * 8.052738612235387);
  }

  @Test
  public void case24() {
    int numTables = 12;
    int[] probs = { 9, 6, 16, 9, 11, 9, 3, 7, 8, 9, 8, 5 };
    assertEquals(7.943718551056782, tableseating.getExpected(numTables, probs), DELTA * 7.943718551056782);
  }

  @Test
  public void case25() {
    int numTables = 12;
    int[] probs = { 2, 9, 9, 13, 6, 7, 6, 11, 10, 11, 8, 8 };
    assertEquals(8.161556462174529, tableseating.getExpected(numTables, probs), DELTA * 8.161556462174529);
  }

  @Test
  public void case26() {
    int numTables = 12;
    int[] probs = { 6, 13, 6, 11, 4, 7, 14, 8, 5, 8, 9, 9 };
    assertEquals(8.047133841306092, tableseating.getExpected(numTables, probs), DELTA * 8.047133841306092);
  }

  @Test
  public void case27() {
    int numTables = 12;
    int[] probs = { 9, 4, 11, 5, 9, 8, 6, 7, 11, 13, 10, 7 };
    assertEquals(8.125227737892228, tableseating.getExpected(numTables, probs), DELTA * 8.125227737892228);
  }

  @Test
  public void case28() {
    int numTables = 12;
    int[] probs = { 10, 8, 10, 4, 4, 9, 6, 12, 12, 6, 7, 12 };
    assertEquals(8.097772321164507, tableseating.getExpected(numTables, probs), DELTA * 8.097772321164507);
  }

  @Test
  public void case29() {
    int numTables = 12;
    int[] probs = { 9, 9, 6, 7, 10, 5, 3, 14, 4, 10, 8, 15 };
    assertEquals(8.186352110757422, tableseating.getExpected(numTables, probs), DELTA * 8.186352110757422);
  }

  @Test
  public void case30() {
    int numTables = 12;
    int[] probs = { 10, 8, 5, 8, 11, 7, 5, 9, 8, 8, 8, 13 };
    assertEquals(8.12341030346038, tableseating.getExpected(numTables, probs), DELTA * 8.12341030346038);
  }

  @Test
  public void case31() {
    int numTables = 12;
    int[] probs = { 10, 4, 11, 10, 4, 5, 9, 10, 9, 10, 7, 11 };
    assertEquals(8.105897639599036, tableseating.getExpected(numTables, probs), DELTA * 8.105897639599036);
  }

  @Test
  public void case32() {
    int numTables = 10;
    int[] probs = { 7, 8, 7, 7, 11, 7, 13, 9, 8, 7, 9, 7 };
    assertEquals(5.548077404403071, tableseating.getExpected(numTables, probs), DELTA * 5.548077404403071);
  }

  @Test
  public void case33() {
    int numTables = 11;
    int[] probs = { 8, 13, 8, 6, 9, 7, 14, 11, 4, 9, 7, 4 };
    assertEquals(6.984070937897883, tableseating.getExpected(numTables, probs), DELTA * 6.984070937897883);
  }

  @Test
  public void case34() {
    int numTables = 8;
    int[] probs = { 8, 7, 13, 10, 5, 5, 7, 8, 9, 15, 4, 9 };
    assertEquals(3.170253495666273, tableseating.getExpected(numTables, probs), DELTA * 3.170253495666273);
  }

  @Test
  public void case35() {
    int numTables = 12;
    int[] probs = { 3, 12, 8, 6, 10, 8, 7, 12, 11, 11, 6, 6 };
    assertEquals(8.060610638818153, tableseating.getExpected(numTables, probs), DELTA * 8.060610638818153);
  }

  @Test
  public void case36() {
    int numTables = 10;
    int[] probs = { 9, 10, 9, 6, 8, 11, 9, 9, 8, 7, 8, 6 };
    assertEquals(5.613740874240573, tableseating.getExpected(numTables, probs), DELTA * 5.613740874240573);
  }

  @Test
  public void case37() {
    int numTables = 12;
    int[] probs = { 7, 9, 10, 10, 10, 13, 7, 10, 7, 6, 5, 6 };
    assertEquals(7.943149442547289, tableseating.getExpected(numTables, probs), DELTA * 7.943149442547289);
  }

  @Test
  public void case38() {
    int numTables = 8;
    int[] probs = { 6, 10, 6, 10, 5, 10, 8, 13, 5, 5, 11, 11 };
    assertEquals(3.66637571605075, tableseating.getExpected(numTables, probs), DELTA * 3.66637571605075);
  }

  @Test
  public void case39() {
    int numTables = 7;
    int[] probs = { 7, 10, 9, 9, 8, 5, 7, 7, 9, 12, 9, 8 };
    assertEquals(2.4022283271035416, tableseating.getExpected(numTables, probs), DELTA * 2.4022283271035416);
  }

  @Test
  public void case40() {
    int numTables = 11;
    int[] probs = { 9, 6, 8, 9, 9, 11, 13, 8, 4, 5, 11, 7 };
    assertEquals(6.7768584160555685, tableseating.getExpected(numTables, probs), DELTA * 6.7768584160555685);
  }

  @Test
  public void case41() {
    int numTables = 5;
    int[] probs = { 8, 7, 12, 11, 11, 8, 9, 9, 10, 5, 7, 3 };
    assertEquals(1.6879347114666667, tableseating.getExpected(numTables, probs), DELTA * 1.6879347114666667);
  }

  @Test
  public void case42() {
    int numTables = 10;
    int[] probs = { 9, 9, 9, 12, 14, 8, 6, 7, 9, 5, 4, 8 };
    assertEquals(5.721093711587419, tableseating.getExpected(numTables, probs), DELTA * 5.721093711587419);
  }

  @Test
  public void case43() {
    int numTables = 11;
    int[] probs = { 8, 8, 6, 7, 10, 7, 10, 14, 5, 14, 9, 2 };
    assertEquals(7.358124714950001, tableseating.getExpected(numTables, probs), DELTA * 7.358124714950001);
  }

  @Test
  public void case44() {
    int numTables = 7;
    int[] probs = { 6, 7, 8, 7, 6, 7, 7, 12, 6, 8, 10, 16 };
    assertEquals(2.128593734551208, tableseating.getExpected(numTables, probs), DELTA * 2.128593734551208);
  }

  @Test
  public void case45() {
    int numTables = 5;
    int[] probs = { 3, 6, 12, 14, 5, 7, 6, 9, 7, 11, 7, 13 };
    assertEquals(1.3779074283, tableseating.getExpected(numTables, probs), DELTA * 1.3779074283);
  }

  @Test
  public void case46() {
    int numTables = 7;
    int[] probs = { 8, 5, 3, 10, 10, 9, 10, 8, 12, 10, 8, 7 };
    assertEquals(2.5979698571289807, tableseating.getExpected(numTables, probs), DELTA * 2.5979698571289807);
  }

  @Test
  public void case47() {
    int numTables = 5;
    int[] probs = { 13, 6, 9, 12, 13, 9, 7, 7, 5, 4, 8, 7 };
    assertEquals(1.8054801732999999, tableseating.getExpected(numTables, probs), DELTA * 1.8054801732999999);
  }

  @Test
  public void case48() {
    int numTables = 5;
    int[] probs = { 8, 10, 6, 9, 7, 13, 6, 10, 7, 5, 8, 11 };
    assertEquals(1.2790011434666668, tableseating.getExpected(numTables, probs), DELTA * 1.2790011434666668);
  }

  @Test
  public void case49() {
    int numTables = 6;
    int[] probs = { 10, 14, 7, 5, 8, 8, 4, 11, 16, 4, 7, 6 };
    assertEquals(1.9294564666666671, tableseating.getExpected(numTables, probs), DELTA * 1.9294564666666671);
  }

  @Test
  public void case50() {
    int numTables = 12;
    int[] probs = { 9, 8, 9, 9, 6, 3, 13, 7, 8, 8, 7, 13 };
    assertEquals(8.108452413294861, tableseating.getExpected(numTables, probs), DELTA * 8.108452413294861);
  }

  @Test
  public void case51() {
    int numTables = 11;
    int[] probs = { 4, 6, 9, 3, 11, 16, 10, 8, 7, 11, 5, 10 };
    assertEquals(6.598011997184336, tableseating.getExpected(numTables, probs), DELTA * 6.598011997184336);
  }

  @Test
  public void case52() {
    int numTables = 7;
    int[] probs = { 10, 5, 8, 10, 7, 8, 4, 10, 6, 6, 11, 15 };
    assertEquals(2.2223947250000005, tableseating.getExpected(numTables, probs), DELTA * 2.2223947250000005);
  }

  @Test
  public void case53() {
    int numTables = 8;
    int[] probs = { 11, 14, 9, 10, 7, 6, 12, 3, 9, 10, 4, 5 };
    assertEquals(3.5731237470027617, tableseating.getExpected(numTables, probs), DELTA * 3.5731237470027617);
  }

  @Test
  public void case54() {
    int numTables = 10;
    int[] probs = { 9, 5, 9, 8, 10, 4, 4, 12, 8, 10, 9, 12 };
    assertEquals(5.202158770327831, tableseating.getExpected(numTables, probs), DELTA * 5.202158770327831);
  }

  @Test
  public void case55() {
    int numTables = 6;
    int[] probs = { 9, 8, 9, 5, 6, 12, 4, 12, 11, 6, 9, 9 };
    assertEquals(1.9160604429810002, tableseating.getExpected(numTables, probs), DELTA * 1.9160604429810002);
  }

  @Test
  public void case56() {
    int numTables = 12;
    int[] probs = { 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 12 };
    assertEquals(8.1265900083746, tableseating.getExpected(numTables, probs), DELTA * 8.1265900083746);
  }

  @Test
  public void case57() {
    int numTables = 4;
    int[] probs = { 100 };
    assertEquals(4.0, tableseating.getExpected(numTables, probs), DELTA * 4.0);
  }

  @Test
  public void case58() {
    int numTables = 12;
    int[] probs = { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10 };
    assertEquals(7.871087929710551, tableseating.getExpected(numTables, probs), DELTA * 7.871087929710551);
  }

  @Test
  public void case59() {
    int numTables = 3;
    int[] probs = { 50, 50, 0 };
    assertEquals(2.458333333333333, tableseating.getExpected(numTables, probs), DELTA * 2.458333333333333);
  }

  @Test
  public void case60() {
    int numTables = 12;
    int[] probs = { 7, 10, 11, 31, 0, 12, 13, 3, 5, 5, 2, 1 };
    assertEquals(7.953231954425785, tableseating.getExpected(numTables, probs), DELTA * 7.953231954425785);
  }

  @Test
  public void case61() {
    int numTables = 12;
    int[] probs = { 9, 7, 9, 11, 9, 9, 9, 9, 9, 9, 10 };
    assertEquals(7.884999908970048, tableseating.getExpected(numTables, probs), DELTA * 7.884999908970048);
  }

  @Test
  public void case62() {
    int numTables = 11;
    int[] probs = { 12, 38, 40, 1, 2, 3, 4 };
    assertEquals(8.294557818072061, tableseating.getExpected(numTables, probs), DELTA * 8.294557818072061);
  }

  @Test
  public void case63() {
    int numTables = 4;
    int[] probs = { 40, 10, 0, 30, 20 };
    assertEquals(2.2309333333333337, tableseating.getExpected(numTables, probs), DELTA * 2.2309333333333337);
  }

  @Test
  public void case64() {
    int numTables = 1;
    int[] probs = { 14, 69, 1, 15, 1 };
    assertEquals(0.14, tableseating.getExpected(numTables, probs), DELTA * 0.14);
  }

  @Test
  public void case65() {
    int numTables = 11;
    int[] probs = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 45 };
    assertEquals(4.487326183089735, tableseating.getExpected(numTables, probs), DELTA * 4.487326183089735);
  }

  @Test
  public void case66() {
    int numTables = 12;
    int[] probs = { 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 5 };
    assertEquals(7.9400870030448685, tableseating.getExpected(numTables, probs), DELTA * 7.9400870030448685);
  }

  @Test
  public void case67() {
    int numTables = 12;
    int[] probs = { 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 12 };
    assertEquals(8.1265900083746, tableseating.getExpected(numTables, probs), DELTA * 8.1265900083746);
  }

  @Test
  public void case68() {
    int numTables = 12;
    int[] probs = { 10, 10, 10, 10, 10, 10, 10, 10, 5, 5, 5, 5 };
    assertEquals(7.867716233990063, tableseating.getExpected(numTables, probs), DELTA * 7.867716233990063);
  }

  @Test
  public void case69() {
    int numTables = 12;
    int[] probs = { 9, 9, 9, 9, 9, 9, 9, 9, 9, 11, 8 };
    assertEquals(7.859750293346915, tableseating.getExpected(numTables, probs), DELTA * 7.859750293346915);
  }

  @Test
  public void case70() {
    int numTables = 10;
    int[] probs = { 5, 10, 15, 5, 10, 15, 5, 10, 15, 10 };
    assertEquals(6.904985901014728, tableseating.getExpected(numTables, probs), DELTA * 6.904985901014728);
  }

  @Test
  public void case71() {
    int numTables = 12;
    int[] probs = { 5, 25, 50, 15, 5 };
    assertEquals(9.220460327135862, tableseating.getExpected(numTables, probs), DELTA * 9.220460327135862);
  }

}
