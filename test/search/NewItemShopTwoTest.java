package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class NewItemShopTwoTest {
  double DELTA = 1.0e-09;
  NewItemShopTwo newitemshoptwo = new NewItemShopTwo();

  @Test
  public void case1() {
    String[] customers = { "8,1,80 16,100,11", "12,10,100" };
    assertEquals(19.0, newitemshoptwo.getMaximum(customers), DELTA * 19.0);
  }

  @Test
  public void case2() {
    String[] customers = { "8,1,80 16,100,11", "12,10,90 13,30,5" };
    assertEquals(19.4, newitemshoptwo.getMaximum(customers), DELTA * 19.4);
  }

  @Test
  public void case3() {
    String[] customers = { "0,90,25 2,90,25 4,90,25 6,90,25", "7,100,80" };
    assertEquals(90.0, newitemshoptwo.getMaximum(customers), DELTA * 90.0);
  }

  @Test
  public void case4() {
    String[] customers = { "0,90,25 2,90,25 4,90,25 6,90,25", "7,100,95" };
    assertEquals(95.0, newitemshoptwo.getMaximum(customers), DELTA * 95.0);
  }

  @Test
  public void case5() {
    String[] customers = { "0,3,1 2,4,1 4,5,9 6,2,6 8,5,3 10,5,8 12,9,7 14,9,3", "1,2,3 3,8,4 5,6,2 7,6,4 9,3,3 11,8,3 13,2,7 15,9,5" };
    assertEquals(3.0692999999999997, newitemshoptwo.getMaximum(customers), DELTA * 3.0692999999999997);
  }

  @Test
  public void case6() {
    String[] customers = { "9,19,42 18,91,57", "6,69,12 12,86,5 13,5,17 14,13,23 15,75,22 22,54,18" };
    assertEquals(68.45399999999997, newitemshoptwo.getMaximum(customers), DELTA * 68.45399999999997);
  }

  @Test
  public void case7() {
    String[] customers = { "0,19,20 1,79,7 2,7,10 3,8,9 7,8,9 9,83,22 16,4,19", "5,95,5 6,97,20 8,64,11 10,61,24 14,73,26 19,68,11" };
    assertEquals(75.4041, newitemshoptwo.getMaximum(customers), DELTA * 75.4041);
  }

  @Test
  public void case8() {
    String[] customers = { "0,49,8 2,69,26 4,8,21 5,56,20 7,17,4 11,21,17", "1,48,25 3,46,3 6,81,1 8,39,36 10,43,10 16,50,22" };
    assertEquals(51.258800000000015, newitemshoptwo.getMaximum(customers), DELTA * 51.258800000000015);
  }

  @Test
  public void case9() {
    String[] customers = { "2,93,9 9,44,21 18,31,11 20,62,20 22,68,17 23,25,19", "0,65,9 1,93,4 4,6,4 6,34,4 7,43,47 16,4,4 19,68,25" };
    assertEquals(57.24960000000001, newitemshoptwo.getMaximum(customers), DELTA * 57.24960000000001);
  }

  @Test
  public void case10() {
    String[] customers = { "21,9,55 22,36,12", "2,20,74 19,36,14" };
    assertEquals(20.9524, newitemshoptwo.getMaximum(customers), DELTA * 20.9524);
  }

  @Test
  public void case11() {
    String[] customers = { "5,7,68 18,21,16", "6,39,51 13,23,32" };
    assertEquals(27.8212, newitemshoptwo.getMaximum(customers), DELTA * 27.8212);
  }

  @Test
  public void case12() {
    String[] customers = { "8,7,68 18,52,9", "10,14,70 19,37,16" };
    assertEquals(16.7312, newitemshoptwo.getMaximum(customers), DELTA * 16.7312);
  }

  @Test
  public void case13() {
    String[] customers = { "2,9,58 6,34,19", "3,52,38 12,14,45" };
    assertEquals(28.8682, newitemshoptwo.getMaximum(customers), DELTA * 28.8682);
  }

  @Test
  public void case14() {
    String[] customers = { "8,9,58 16,33,26", "10,32,31 20,38,27" };
    assertEquals(23.4326, newitemshoptwo.getMaximum(customers), DELTA * 23.4326);
  }

  @Test
  public void case15() {
    String[] customers = { "12,15,34 14,30,44", "4,40,37 23,32,20" };
    assertEquals(27.737000000000002, newitemshoptwo.getMaximum(customers), DELTA * 27.737000000000002);
  }

  @Test
  public void case16() {
    String[] customers = { "4,14,73 15,9,15", "0,22,67 10,33,20" };
    assertEquals(21.5155, newitemshoptwo.getMaximum(customers), DELTA * 21.5155);
  }

  @Test
  public void case17() {
    String[] customers = { "9,21,48 16,8,32", "5,51,39 22,26,36" };
    assertEquals(30.906, newitemshoptwo.getMaximum(customers), DELTA * 30.906);
  }

  @Test
  public void case18() {
    String[] customers = { "12,14,70 20,29,16", "5,13,37 18,59,21" };
    assertEquals(19.681599999999996, newitemshoptwo.getMaximum(customers), DELTA * 19.681599999999996);
  }

  @Test
  public void case19() {
    String[] customers = { "17,18,56 19,26,25", "12,41,49 15,16,16" };
    assertEquals(28.5458, newitemshoptwo.getMaximum(customers), DELTA * 28.5458);
  }

  @Test
  public void case20() {
    String[] customers = { "17,29,34 21,35,38", "4,15,33 22,38,27" };
    assertEquals(26.032799999999998, newitemshoptwo.getMaximum(customers), DELTA * 26.032799999999998);
  }

  @Test
  public void case21() {
    String[] customers = { "17,30,33 23,37,36", "4,33,45 6,10,28" };
    assertEquals(27.621000000000002, newitemshoptwo.getMaximum(customers), DELTA * 27.621000000000002);
  }

  @Test
  public void case22() {
    String[] customers = { "1,42,36 20,8,39", "5,15,68 15,63,10" };
    assertEquals(26.3664, newitemshoptwo.getMaximum(customers), DELTA * 26.3664);
  }

  @Test
  public void case23() {
    String[] customers = { "1,27,56 19,14,15", "7,77,26 11,20,37" };
    assertEquals(28.197000000000003, newitemshoptwo.getMaximum(customers), DELTA * 28.197000000000003);
  }

  @Test
  public void case24() {
    String[] customers = { "21,54,28 22,38,19", "2,7,67 23,63,11" };
    assertEquals(26.012900000000002, newitemshoptwo.getMaximum(customers), DELTA * 26.012900000000002);
  }

  @Test
  public void case25() {
    String[] customers = { "5,26,57 22,20,21", "12,43,47 15,14,19" };
    assertEquals(26.082099999999997, newitemshoptwo.getMaximum(customers), DELTA * 26.082099999999997);
  }

  @Test
  public void case26() {
    String[] customers = { "3,30,51 4,30,32", "18,16,31 21,29,24" };
    assertEquals(26.9264, newitemshoptwo.getMaximum(customers), DELTA * 26.9264);
  }

  @Test
  public void case27() {
    String[] customers = { "12,43,35 21,58,22", "8,22,46 11,9,32" };
    assertEquals(27.81, newitemshoptwo.getMaximum(customers), DELTA * 27.81);
  }

  @Test
  public void case28() {
    String[] customers = { "14,40,49 23,10,26", "2,15,67 7,35,14" };
    assertEquals(23.992000000000004, newitemshoptwo.getMaximum(customers), DELTA * 23.992000000000004);
  }

  @Test
  public void case29() {
    String[] customers = { "7,28,72 20,13,11", "3,51,30 21,34,20" };
    assertEquals(31.568999999999996, newitemshoptwo.getMaximum(customers), DELTA * 31.568999999999996);
  }

  @Test
  public void case30() {
    String[] customers = { "11,40,50 12,14,36", "7,19,26 16,25,44" };
    assertEquals(26.8104, newitemshoptwo.getMaximum(customers), DELTA * 26.8104);
  }

  @Test
  public void case31() {
    String[] customers = { "12,30,68 17,15,21", "5,31,48 22,10,25" };
    assertEquals(27.401000000000003, newitemshoptwo.getMaximum(customers), DELTA * 27.401000000000003);
  }

  @Test
  public void case32() {
    String[] customers = { "4,33,60 5,28,21", "14,12,42 20,16,36" };
    assertEquals(27.732, newitemshoptwo.getMaximum(customers), DELTA * 27.732);
  }

  @Test
  public void case33() {
    String[] customers = { "18,59,34 20,28,36", "12,16,64 13,10,18" };
    assertEquals(30.14, newitemshoptwo.getMaximum(customers), DELTA * 30.14);
  }

  @Test
  public void case34() {
    String[] customers = { "0,2,9 2,5,3 4,1,6 5,2,8 8,2,6 11,5,1 13,8,4 14,8,5", "1,6,1 3,2,7 6,6,2 7,4,8 9,4,2 12,1,4 17,9,7 18,3,8" };
    assertEquals(2.338300000000001, newitemshoptwo.getMaximum(customers), DELTA * 2.338300000000001);
  }

  @Test
  public void case35() {
    String[] customers = { "1,4,1 2,8,6 4,8,5 5,5,2 6,7,5 11,3,2 12,1,8 18,9,9", "0,1,1 3,4,8 7,9,6 8,9,3 9,4,4 10,2,6 19,9,6 20,6,1" };
    assertEquals(3.548000000000001, newitemshoptwo.getMaximum(customers), DELTA * 3.548000000000001);
  }

  @Test
  public void case36() {
    String[] customers = { "1,8,6 2,2,6 3,5,4 7,3,4 9,9,1 12,2,6 14,2,6 19,9,3", "0,7,1 4,8,3 5,8,4 6,8,7 8,2,2 13,1,5 18,8,9 20,5,6" };
    assertEquals(3.1169000000000002, newitemshoptwo.getMaximum(customers), DELTA * 3.1169000000000002);
  }

  @Test
  public void case37() {
    String[] customers = { "3,7,7 5,4,7 6,7,5 7,2,5 8,5,4 10,3,2 15,7,9 18,6,7", "0,5,6 1,1,1 2,3,6 4,4,8 9,3,8 14,3,6 17,5,6 21,3,3" };
    assertEquals(3.194200000000001, newitemshoptwo.getMaximum(customers), DELTA * 3.194200000000001);
  }

  @Test
  public void case38() {
    String[] customers = { "0,7,7 2,5,7 5,5,5 6,3,3 8,7,1 12,5,9 13,2,9 16,2,3", "1,6,9 3,6,5 4,2,2 7,9,6 9,6,7 11,3,8 17,1,3 19,4,1" };
    assertEquals(3.3465999999999996, newitemshoptwo.getMaximum(customers), DELTA * 3.3465999999999996);
  }

  @Test
  public void case39() {
    String[] customers = { "0,9,2 1,9,6 2,3,2 3,1,7 9,8,7 12,7,3 21,3,2 23,7,2", "4,4,8 5,1,4 6,8,7 7,8,7 8,5,3 15,8,7 18,7,8" };
    assertEquals(3.8073, newitemshoptwo.getMaximum(customers), DELTA * 3.8073);
  }

  @Test
  public void case40() {
    String[] customers = { "0,9,2 2,6,3 3,3,7 4,9,6 9,1,1 14,8,9 17,2,7 18,8,5", "1,7,5 5,8,3 6,1,5 7,1,5 8,2,4 16,1,6 19,1,3" };
    assertEquals(2.8153, newitemshoptwo.getMaximum(customers), DELTA * 2.8153);
  }

  @Test
  public void case41() {
    String[] customers = { "0,8,6 3,9,4 6,6,8 7,8,1 9,1,7 14,7,7 22,6,1 23,4,2", "1,5,8 2,7,3 4,1,4 5,9,4 8,6,2 15,8,2 16,4,3" };
    assertEquals(3.0325999999999995, newitemshoptwo.getMaximum(customers), DELTA * 3.0325999999999995);
  }

  @Test
  public void case42() {
    String[] customers = { "1,4,6 5,8,6 6,3,7 7,2,2 8,8,6 13,4,3 14,7,8", "0,8,4 2,1,4 3,1,1 4,4,4 9,1,8 16,8,8 19,3,9 20,3,8" };
    assertEquals(3.156599999999999, newitemshoptwo.getMaximum(customers), DELTA * 3.156599999999999);
  }

  @Test
  public void case43() {
    String[] customers = { "3,6,8 5,8,8 7,3,6 8,8,5 9,4,2 14,8,5 15,5,4 20,9,7", "0,5,8 1,3,8 2,5,8 4,1,9 6,2,8 17,3,3 22,2,2" };
    assertEquals(3.387300000000001, newitemshoptwo.getMaximum(customers), DELTA * 3.387300000000001);
  }

  @Test
  public void case44() {
    String[] customers = { "2,7,3 4,4,9 9,3,2 15,1,4 16,4,8 18,8,5 23,2,4", "1,2,4 3,6,5 11,2,4 12,9,1 13,1,4 21,9,8 22,8,3" };
    assertEquals(2.4834000000000005, newitemshoptwo.getMaximum(customers), DELTA * 2.4834000000000005);
  }

  @Test
  public void case45() {
    String[] customers = { "3,1,3 5,5,1 7,7,6 11,7,4 13,1,6 14,8,9 19,1,8", "8,1,8 10,6,7 15,1,3 16,1,7 20,6,8 22,9,9 23,6,6" };
    assertEquals(3.2041999999999997, newitemshoptwo.getMaximum(customers), DELTA * 3.2041999999999997);
  }

  @Test
  public void case46() {
    String[] customers = { "5,52,43 13,40,25", "2,30,61 7,82,7" };
    assertEquals(34.9318, newitemshoptwo.getMaximum(customers), DELTA * 34.9318);
  }

  @Test
  public void case47() {
    String[] customers = { "19,33,63 22,46,8", "0,46,24 4,54,18 5,59,16 6,44,9 21,44,1" };
    assertEquals(42.3611, newitemshoptwo.getMaximum(customers), DELTA * 42.3611);
  }

  @Test
  public void case48() {
    String[] customers = { "2,10,48 4,82,7 13,51,24 14,57,12 16,71,2 19,46,4", "1,70,40 10,92,17 12,32,9 17,58,17 23,47,1" };
    assertEquals(62.32770000000001, newitemshoptwo.getMaximum(customers), DELTA * 62.32770000000001);
  }

  @Test
  public void case49() {
    String[] customers = { "12,75,41", "17,31,62" };
    assertEquals(42.0898, newitemshoptwo.getMaximum(customers), DELTA * 42.0898);
  }

  @Test
  public void case50() {
    String[] customers = { "9,19,49 11,93,8 12,92,23 14,22,9 18,78,7", "4,42,3 17,31,45" };
    assertEquals(45.35000000000001, newitemshoptwo.getMaximum(customers), DELTA * 45.35000000000001);
  }

  @Test
  public void case51() {
    String[] customers = { "0,68,73 1,96,4 9,84,15 15,88,1 19,87,1", "4,1,12 12,73,52 13,76,17 17,12,14 20,97,1" };
    assertEquals(70.75110000000001, newitemshoptwo.getMaximum(customers), DELTA * 70.75110000000001);
  }

  @Test
  public void case52() {
    String[] customers = { "6,88,42 13,62,3 20,36,26", "21,52,59" };
    assertEquals(57.077200000000005, newitemshoptwo.getMaximum(customers), DELTA * 57.077200000000005);
  }

  @Test
  public void case53() {
    String[] customers = { "15,64,52", "3,50,72 6,33,2 20,8,14" };
    assertEquals(45.856, newitemshoptwo.getMaximum(customers), DELTA * 45.856);
  }

  @Test
  public void case54() {
    String[] customers = { "1,2,4 5,97,46 9,69,36 15,33,9 20,69,1", "0,79,32 8,43,47 12,32,15 17,26,2 19,28,1" };
    assertEquals(76.1763, newitemshoptwo.getMaximum(customers), DELTA * 76.1763);
  }

  @Test
  public void case55() {
    String[] customers = { "19,97,74 21,61,1", "9,83,45 10,73,2 15,22,36 23,63,5" };
    assertEquals(77.9642, newitemshoptwo.getMaximum(customers), DELTA * 77.9642);
  }

  @Test
  public void case56() {
    String[] customers = { "17,40,54 20,76,29", "15,94,49" };
    assertEquals(68.3164, newitemshoptwo.getMaximum(customers), DELTA * 68.3164);
  }

  @Test
  public void case57() {
    String[] customers = { "23,80,72", "8,69,11 17,74,23 21,13,46 22,9,7" };
    assertEquals(62.62599999999999, newitemshoptwo.getMaximum(customers), DELTA * 62.62599999999999);
  }

  @Test
  public void case58() {
    String[] customers = { "7,6,20 22,51,42", "5,51,44 10,93,10 21,73,9" };
    assertEquals(46.2354, newitemshoptwo.getMaximum(customers), DELTA * 46.2354);
  }

  @Test
  public void case59() {
    String[] customers = { "0,57,47 6,50,36 7,51,8 13,56,4 18,82,1 21,38,1", "11,1,68" };
    assertEquals(52.31, newitemshoptwo.getMaximum(customers), DELTA * 52.31);
  }

  @Test
  public void case60() {
    String[] customers = { "2,4,69 6,18,7 10,89,1 14,41,3 19,31,15 21,75,1", "3,15,57 13,40,11" };
    assertEquals(17.998199999999997, newitemshoptwo.getMaximum(customers), DELTA * 17.998199999999997);
  }

  @Test
  public void case61() {
    String[] customers = { "8,8,1 13,70,39 14,42,44 18,94,6", "3,49,50" };
    assertEquals(51.49999999999999, newitemshoptwo.getMaximum(customers), DELTA * 51.49999999999999);
  }

  @Test
  public void case62() {
    String[] customers = { "6,74,14", "2,28,72 3,79,7 5,37,1" };
    assertEquals(28.132, newitemshoptwo.getMaximum(customers), DELTA * 28.132);
  }

  @Test
  public void case63() {
    String[] customers = { "1,68,66 14,19,11 19,44,3 23,52,9", "2,97,2 22,71,70" };
    assertEquals(63.748000000000005, newitemshoptwo.getMaximum(customers), DELTA * 63.748000000000005);
  }

  @Test
  public void case64() {
    String[] customers = { "3,86,39 5,81,37 8,89,4 11,97,4 19,92,5", "1,40,49 4,89,33 6,32,10" };
    assertEquals(79.6024, newitemshoptwo.getMaximum(customers), DELTA * 79.6024);
  }

  @Test
  public void case65() {
    String[] customers = { "0,84,16 1,90,24 5,64,34 6,17,15 16,37,3 21,38,4", "2,4,10 19,27,48 20,85,21 22,55,12" };
    assertEquals(67.0998, newitemshoptwo.getMaximum(customers), DELTA * 67.0998);
  }

  @Test
  public void case66() {
    String[] customers = { "0,1,1", "1,1,1" };
    assertEquals(0.0199, newitemshoptwo.getMaximum(customers), DELTA * 0.0199);
  }

  @Test
  public void case67() {
    String[] customers = { "0,100,100", "23,1,1" };
    assertEquals(100.0, newitemshoptwo.getMaximum(customers), DELTA * 100.0);
  }

  @Test
  public void case68() {
    String[] customers = { "0,1,1", "23,100,100" };
    assertEquals(100.0, newitemshoptwo.getMaximum(customers), DELTA * 100.0);
  }

  @Test
  public void case69() {
    String[] customers = { "8,1,80 16,100,11", "12,10,90 13,30,5" };
    assertEquals(19.4, newitemshoptwo.getMaximum(customers), DELTA * 19.4);
  }

  @Test
  public void case70() {
    String[] customers = { "1,1,1", "2,2,2" };
    assertEquals(0.049600000000000005, newitemshoptwo.getMaximum(customers), DELTA * 0.049600000000000005);
  }

  @Test
  public void case71() {
    String[] customers = { "0,3,1 2,4,1 4,5,9 6,2,6 8,5,3 10,5,8 12,9,6 14,9,4", "1,2,3 3,8,4 5,6,2 7,6,4 9,3,3 11,8,3 13,2,7 15,9,5" };
    assertEquals(3.064400000000001, newitemshoptwo.getMaximum(customers), DELTA * 3.064400000000001);
  }

  @Test
  public void case72() {
    String[] customers = { "0,3,1 2,4,1 4,5,9 6,2,6 8,5,3 10,5,8 12,9,7 14,9,3", "1,2,3 3,8,4 5,6,2 7,6,4 9,3,3 11,8,3 13,2,7 15,9,5" };
    assertEquals(3.0692999999999997, newitemshoptwo.getMaximum(customers), DELTA * 3.0692999999999997);
  }

}
