package topc.test.geometry;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.geometry.*;

public class ParachuterTest {
  Parachuter parachuter = new Parachuter();

  @Test
  public void case1() {
    String[] param0 = { "(0,0)", "(0,2)", "(2,2)", "(2,0)" };
    int param1 = 1;
    int param2 = 1;
    assertEquals(1, parachuter.overArea(param0, param1, param2));
  }

  @Test
  public void case2() {
    String[] param0 = { "(0,0)", "(0,2)", "(2,2)", "(2,0)" };
    int param1 = 2;
    int param2 = 2;
    assertEquals(1, parachuter.overArea(param0, param1, param2));
  }

  @Test
  public void case3() {
    String[] param0 = { "(0,0)", "(0,2)", "(2,2)", "(2,0)" };
    int param1 = 2;
    int param2 = 3;
    assertEquals(2, parachuter.overArea(param0, param1, param2));
  }

  @Test
  public void case4() {
    String[] param0 = { "(10,10)", "(10,20)", "(20,10)", "(10,15)", "(20,10)" };
    int param1 = 1;
    int param2 = 1;
    assertEquals(0, parachuter.overArea(param0, param1, param2));
  }

  @Test
  public void case5() {
    String[] param0 = { "(5,5)", "(10,10)", "(7,7)" };
    int param1 = 2;
    int param2 = 2;
    assertEquals(0, parachuter.overArea(param0, param1, param2));
  }

  @Test
  public void case6() {
    String[] param0 = { "(0,0)", "(4,4)", "(0,4)", "(4,0)" };
    int param1 = 2;
    int param2 = 2;
    assertEquals(0, parachuter.overArea(param0, param1, param2));
  }

  @Test
  public void case7() {
    String[] param0 = { "(0,0)", "(0,1)", "(1,1)", "(1,0)", "(0,0)" };
    int param1 = 90;
    int param2 = 90;
    assertEquals(0, parachuter.overArea(param0, param1, param2));
  }

  @Test
  public void case8() {
    String[] param0 = { "(1,1)", "(1,5)", "(1,3)", "(2,4)" };
    int param1 = 0;
    int param2 = 0;
    assertEquals(0, parachuter.overArea(param0, param1, param2));
  }

  @Test
  public void case9() {
    String[] param0 = { "(0,0)", "(0,100)", "(100,100)", "(1,50)", "(100,0)" };
    int param1 = 50;
    int param2 = 10;
    assertEquals(1, parachuter.overArea(param0, param1, param2));
  }

  @Test
  public void case10() {
    String[] param0 = { "(1,1)", "(2,100)", "(3,2)", "(4,100)", "(5,2)", "(6,100)", "(7,2)", "(8,100)", "(100,0)" };
    int param1 = 3;
    int param2 = 70;
    assertEquals(2, parachuter.overArea(param0, param1, param2));
  }

  @Test
  public void case11() {
    String[] param0 = { "(1,1)", "(2,100)", "(3,2)", "(4,100)", "(5,2)", "(6,100)", "(7,2)", "(8,100)", "(100,0)" };
    int param1 = 2;
    int param2 = 70;
    assertEquals(1, parachuter.overArea(param0, param1, param2));
  }

  @Test
  public void case12() {
    String[] param0 = { "(0,0)", "(4,4)", "(0,4)", "(2,2)", "(0,2)" };
    int param1 = 10;
    int param2 = 10;
    assertEquals(0, parachuter.overArea(param0, param1, param2));
  }

  @Test
  public void case13() {
    String[] param0 = { "(0,0)", "(4,4)", "(0,4)", "(3,1)", "(4,0)" };
    int param1 = 10;
    int param2 = 10;
    assertEquals(0, parachuter.overArea(param0, param1, param2));
  }

  @Test
  public void case14() {
    String[] param0 = { "(0,0)", "(2,0)", "(2,2)", "(0,2)" };
    int param1 = 2;
    int param2 = 2;
    assertEquals(1, parachuter.overArea(param0, param1, param2));
  }

  @Test
  public void case15() {
    String[] param0 = { "(0,0)", "(0,100)", "(1,100)" };
    int param1 = 0;
    int param2 = 0;
    assertEquals(1, parachuter.overArea(param0, param1, param2));
  }

  @Test
  public void case16() {
    String[] param0 = { "(4,4)", "(0,0)", "(8,0)" };
    int param1 = 1;
    int param2 = 1;
    assertEquals(1, parachuter.overArea(param0, param1, param2));
  }

  @Test
  public void case17() {
    String[] param0 = { "(0,0)", "(10,0)", "(10,10)" };
    int param1 = 5;
    int param2 = 6;
    assertEquals(2, parachuter.overArea(param0, param1, param2));
  }

  @Test
  public void case18() {
    String[] param0 = { "(0,0)", "(1,0)", "(1,2)", "(0,2)", "(0,1)" };
    int param1 = 0;
    int param2 = 0;
    assertEquals(1, parachuter.overArea(param0, param1, param2));
  }

  @Test
  public void case19() {
    String[] param0 = { "(1,0)", "(2,0)", "(0,0)" };
    int param1 = 1;
    int param2 = 1;
    assertEquals(0, parachuter.overArea(param0, param1, param2));
  }

  @Test
  public void case20() {
    String[] param0 = { "(2,3)", "(3,4)", "(4,3)", "(3,1)" };
    int param1 = 3;
    int param2 = 1;
    assertEquals(1, parachuter.overArea(param0, param1, param2));
  }

  @Test
  public void case21() {
    String[] param0 = { "(0,1)", "(2,3)", "(4,1)", "(6,3)", "(8,1)" };
    int param1 = 1;
    int param2 = 1;
    assertEquals(0, parachuter.overArea(param0, param1, param2));
  }

}
