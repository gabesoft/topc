package topc.test.geometry;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.geometry.*;

public class SurveyorTest {
  Surveyor surveyor = new Surveyor();

  @Test
  public void case1() {
    String direction = "NWWSE";
    int[] length = { 10, 3, 7, 10, 10 };
    assertEquals(100, surveyor.area(direction, length));
  }

  @Test
  public void case2() {
    String direction = "NESWNWSW";
    int[] length = { 20, 200, 30, 100, 20, 30, 10, 70 };
    assertEquals(4700, surveyor.area(direction, length));
  }

  @Test
  public void case3() {
    String direction = "NWSESWNESWNE";
    int[] length = { 4, 4, 2, 1, 1, 2, 4, 6, 7, 7, 2, 6 };
    assertEquals(28, surveyor.area(direction, length));
  }

  @Test
  public void case4() {
    String direction = "NENESSSW";
    int[] length = { 2, 1, 2, 1, 1, 1, 2, 2 };
    assertEquals(6, surveyor.area(direction, length));
  }

  @Test
  public void case5() {
    String direction = "EEEEEEEEEEEESSSSSSSSSSSSSWWWWWWWWWWWWNNNNNNNNNNNNN";
    int[] length = { 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000 };
    assertEquals(156000000, surveyor.area(direction, length));
  }

  @Test
  public void case6() {
    String direction = "NNNNWSSSSE";
    int[] length = { 100, 200, 200, 200, 921, 100, 200, 200, 200, 921 };
    assertEquals(644700, surveyor.area(direction, length));
  }

  @Test
  public void case7() {
    String direction = "SSSSWNNNNE";
    int[] length = { 100, 200, 200, 200, 921, 100, 200, 200, 200, 921 };
    assertEquals(644700, surveyor.area(direction, length));
  }

  @Test
  public void case8() {
    String direction = "NWSENWSWNESE";
    int[] length = { 1000, 995, 990, 985, 975, 965, 955, 10, 969, 984, 999, 1 };
    assertEquals(952959, surveyor.area(direction, length));
  }

  @Test
  public void case9() {
    String direction = "NWSENWSWNESSE";
    int[] length = { 1000, 995, 990, 985, 975, 965, 955, 10, 969, 984, 400, 599, 1 };
    assertEquals(952959, surveyor.area(direction, length));
  }

  @Test
  public void case10() {
    String direction = "NWSENWSWNESSWNNEESSW";
    int[] length = { 1000, 995, 990, 985, 975, 965, 955, 10, 969, 984, 400, 599, 999, 1, 1000, 1, 1000, 500, 501, 1 };
    assertEquals(49042, surveyor.area(direction, length));
  }

  @Test
  public void case11() {
    String direction = "NESWNE";
    int[] length = { 3, 3, 5, 5, 2, 2 };
    assertEquals(19, surveyor.area(direction, length));
  }

  @Test
  public void case12() {
    String direction = "WNWSENWSWNESSWNNEESS";
    int[] length = { 1, 1000, 995, 990, 985, 975, 965, 955, 10, 969, 984, 400, 599, 999, 1, 1000, 1, 1000, 500, 501 };
    assertEquals(49042, surveyor.area(direction, length));
  }

  @Test
  public void case13() {
    String direction = "ENWSWNESWNES";
    int[] length = { 4, 4, 2, 1, 1, 2, 4, 6, 7, 7, 2, 6 };
    assertEquals(28, surveyor.area(direction, length));
  }

  @Test
  public void case14() {
    String direction = "SENWNESWNESW";
    int[] length = { 4, 4, 2, 1, 1, 2, 4, 6, 7, 7, 2, 6 };
    assertEquals(28, surveyor.area(direction, length));
  }

  @Test
  public void case15() {
    String direction = "WSENESWNESWN";
    int[] length = { 4, 4, 2, 1, 1, 2, 4, 6, 7, 7, 2, 6 };
    assertEquals(28, surveyor.area(direction, length));
  }

  @Test
  public void case16() {
    String direction = "WSWNNEEEEESSSWNWSWNN";
    int[] length = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    assertEquals(11, surveyor.area(direction, length));
  }

}
