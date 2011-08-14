package topc.test.graph;

import junit.framework.*;
import static org.junit.Assert.*;
import org.junit.Test;

import topc.graph.*;

public class CircuitsTest {
  Circuits _calc = new Circuits();

  @Test 
  public void case1() {
    String[] connects = {"1 2", "2", ""};
    String[] costs = {"5 3", "7", ""};
    assertEquals(12, _calc.howLong(connects, costs));
  }

  @Test 
  public void case2() {
    String[] connects = {"1 2 3 4 5","2 3 4 5","3 4 5","4 5","5",""};
    String[] costs = {"2 2 2 2 2","2 2 2 2","2 2 2","2 2","2",""};
    assertEquals(10, _calc.howLong(connects, costs));
  }

  @Test 
  public void case3() {
    String[] connects = {"1","2","3","","5","6","7",""};
    String[] costs = {"2","2","2","","3","3","3",""};
    assertEquals(9, _calc.howLong(connects, costs));
  }

  @Test 
  public void case4() {
    String[] connects = {"","2 3 5","4 5","5 6","7","7 8","8 9","10","10 11 12","11","12","12",""};
    String[] costs = {"","3 2 9","2 4","6 9","3","1 2","1 2","5","5 6 9","2","5","3",""};
    assertEquals(22, _calc.howLong(connects, costs));
  }

  @Test 
  public void case5() {
    String[] connects = {"","2 3","3 4 5","4 6","5 6","7","5 7",""};
    String[] costs = {"","30 50","19 6 40","12 10","35 23","8","11 20",""};
    assertEquals(105, _calc.howLong(connects, costs));
  }

  @Test 
  public void case6() {
	String[] connects = {"9 22 1 45 6 2", "", "", "", "45 33 16 47 1 38 18 43 24", "", "16 15 9 48 1 30", "37 4 34 13 19 42 17 22 8", "25 42", "", "", "", "", "", "", "29 18 16 17 23 48 2 46", "20", "1", "", "", "", "", "", "42 11 3", "30 0 40 39", "", "", "", "", "", "39", "", "", "", "21 25 49 31 4 37 13", "19 41 28 32 47 6", "", "44 29 49", "", "29 23 28", "", "", "", "1 17 26 35 32 45", "", "", "", "", "", ""};
  String[] costs = {"15 66 51 13 79 4", "", "", "", "26 54 68 50 26 36 8 46 8", "", "73 31 100 83 33 30", "5 87 76 36 18 32 10 79 60", "74 39", "", "", "", "", "", "", "51 61 100 96 88 24 82 77", "14", "85", "", "", "", "", "", "76 15 45", "26 40 2 70", "", "", "", "", "", "56", "", "", "", "38 47 42 63 56 11 82", "73 7 81 29 91 69", "", "86 71 78", "", "50 24 52", "", "", "", "10 4 99 77 73 60", "", "", "", "", "", ""};
  assertEquals(536, _calc.howLong(connects, costs));
  }
}
