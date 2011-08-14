package topc.test.graph;

import junit.framework.*;
import static org.junit.Assert.*;
import org.junit.Test;

import topc.graph.*;

public class MarketingTest {
  Marketing _calc = new Marketing();

  //@Test 
  public void case1() {
    String[] data = {"1 4","2","3","0",""};
    assertEquals(2, _calc.howMany(data));
  }

  //@Test 
  public void case2() {
    String[] data = {"1","2","0"};
    assertEquals(-1, _calc.howMany(data));
  }

  //@Test 
  public void case3() {
    String[] data = {"1","2","3","0","0 5","1"};
    assertEquals(2, _calc.howMany(data));
  }

  //@Test 
  public void case4() {
    String[] data = {
      "","","","","","","","","","",
      "","","","","","","","","","",
      "","","","","","","","","",""};
    assertEquals(1073741824, _calc.howMany(data));
  }

  //@Test 
  public void case5() {
    String[] data = {"1","2","3","0","5","6","4"};
    assertEquals(-1, _calc.howMany(data));
  }

  //@Test
  public void case6() {
    String[] data = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", ""};
    assertEquals(2, _calc.howMany(data));
  }

  //@Test
  public void case7() {
    String[] data = {"1", "2", "3", "0", "5", "6", "4"};
    assertEquals(-1, _calc.howMany(data));
  }

  //@Test
  public void case8() {
    String[] data = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "0"};
    assertEquals(2, _calc.howMany(data));
  }

  //@Test
  public void case9() {
    String[] data = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "5"};
    assertEquals(-1, _calc.howMany(data));
  }

  //@Test
  public void case10() {
    String[] data = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "6"};
    assertEquals(2, _calc.howMany(data));
  }

  //@Test
  public void case11() {
    String[] data = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "6 8 10 12 14 16 18 20"};
    assertEquals(2, _calc.howMany(data));
  }

  //@Test
  public void case12() {
    String[] data = {"1 2 3 4", "", "", "", "", "1 7", "2 8", "3", "4", "10", "11", "12", "13", "14", "9"};
    assertEquals(-1, _calc.howMany(data));
  }

  //@Test
  public void case13() {
    String[] data = {"1 2 3 4", "", "", "", "", "1 15", "2 15", "3 15", "4 15", "10", "11", "12", "13", "14", "9", ""};
    assertEquals(4, _calc.howMany(data));
  }

  //@Test
  public void case14() {
    String[] data = {"1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20", "2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20", "3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20", "4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20", "5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20", "6 7 8 9 10 11 12 13 14 15 16 17 18 19 20", "7 8 9 10 11 12 13 14 15 16 17 18 19 20", "8 9 10 11 12 13 14 15 16 17 18 19 20", "9 10 11 12 13 14 15 16 17 18 19 20", "10 11 12 13 14 15 16 17 18 19 20", "11 12 13 14 15 16 17 18 19 20", "12 13 14 15 16 17 18 19 20", "13 14 15 16 17 18 19 20", "14 15 16 17 18 19 20", "15 16 17 18 19 20", "16 17 18 19 20", "17 18 19 20", "18 19 20", "19 20", "20", "", "", "", "", ""};
    assertEquals(-1, _calc.howMany(data));
  }

  //@Test
  public void case15() {
    String[] data = {"1 2", "3 4", "5 6", "7 8", "9 10", "11 12", "13 14", "15 16", "17 18", "19 20", "21 22", "23 24", "24 25", "25 26", "27 28", "29", "29", "29", "29", "29", "29", "29", "29", "29", "29", "29", "29", "29", "29", ""};
    assertEquals(2, _calc.howMany(data));
  }

  //@Test
  public void case16() {
    String[] data = {"1 2", "3 4", "5 6", "7 8", "9 10", "11 12", "13 14", "15 16", "17 18", "19 20", "21 22", "23 24", "24 25", "25 26", "27 28", "29", "29", "29", "29", "29", "29", "29", "29", "29", "29", "29", "29", "29", "29", "0 3 4 5 6"};
    assertEquals(2, _calc.howMany(data));
  }

  //@Test
  public void case17() {
    String[] data = {"1 2 4", "5 3", "3 6", "7", "5 6", "7", "7", ""};
    assertEquals(2, _calc.howMany(data));
  }

  //@Test
  public void case18() {
    String[] data = {"1 2 4", "5 3", "3 6", "7", "5 6", "7", "7", "", "", "", "11 12 14", "15 13", "13 16", "17", "15 16", "17", "17", "", "", "", "", "", "", "", ""};
    assertEquals(2048, _calc.howMany(data));
  }

  //@Test
  public void case19() {
    String[] data = {"11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27", "11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27", "11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27", "11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27", "11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27", "11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27", "11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27", "11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27", "11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27", "11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27", "11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    assertEquals(8, _calc.howMany(data));
  }

  //@Test
  public void case20() {
    String[] data = {"1 6 7", "7 2", "8 3", "9 4", "10 5", "11", "7 12", "13 8", "14 9", "15 10", "16 11", "17", "13 18", "14 19", "20 15", "16 21", "17 22", "23", "24 19", "25 20", "26 21", "27 22", "28 23", "29", "25", "26", "27", "28", "29", ""};
    assertEquals(-1, _calc.howMany(data));
  }

  //@Test
  public void case21() {
    String[] data = {"1 6", "7 2", "8 3", "9 4", "10 5", "11", "7 12", "13 8", "14 9", "15 10", "16 11", "17", "13 18", "14 19", "20 15", "16 21", "17 22", "23", "24 19", "25 20", "26 21", "27 22", "28 23", "29", "25", "26", "27", "28", "29", ""};
    assertEquals(2, _calc.howMany(data));
  }

  //@Test
  public void case22() {
    String[] data = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "5", "", "", "10", "", "", "", "", "", "", "", "", "", ""};
    assertEquals(67108864, _calc.howMany(data));
  }

  //@Test
  public void case23() {
    String[] data = {"", "7", "9", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    assertEquals(268435456, _calc.howMany(data));
  }

  @Test
  public void case24() {
    String[] data = {"", "", "0 1"};
    assertEquals(2, _calc.howMany(data));
  }

  //@Test
  public void case25() {
    String[] data = {"1", "2", "3", "1"};
    assertEquals(-1, _calc.howMany(data));
  }

  //@Test
  public void case26() {
    String[] data = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    assertEquals(1073741824, _calc.howMany(data));
  }

  //@Test
  public void case27() {
    String[] data = {"1", "2", "3", "4", "0"};
    assertEquals(-1, _calc.howMany(data));
  }

  //@Test
  public void case28() {
    String[] data = {"29", "29", "29", "29", "29", "29", "29", "29", "29", "29", "29", "29", "29", "29", "29", "29", "29", "29", "29", "29", "29", "29", "29", "29", "29", "29", "29", "29", "29", ""};
    assertEquals(2, _calc.howMany(data));
  }

  //@Test
  public void case29() {
    String[] data = {"1", "2", ""};
    assertEquals(2, _calc.howMany(data));
  }

  //@Test
  public void case30() {
    String[] data = {"1", "", "1"};
    assertEquals(2, _calc.howMany(data));
  }
}
