package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class FloorIndicatorTest {
  double DELTA = 1.0e-09;
  FloorIndicator floorindicator = new FloorIndicator();

  @Test
  public void case1() {
    int N = 1;
    String[] indicator = { "###", "#.#", "#.#", "#.#", "###" };
    assertEquals(4.0, floorindicator.averageFloor(N, indicator), DELTA * 4.0);
  }

  @Test
  public void case2() {
    int N = 2;
    String[] indicator = { "###.###", "#.#.#.#", "#.#.#.#", "#.#.#.#", "###.###" };
    assertEquals(44.0, floorindicator.averageFloor(N, indicator), DELTA * 44.0);
  }

  @Test
  public void case3() {
    int N = 1;
    String[] indicator = { "...", "...", "...", "...", "..." };
    assertEquals(4.5, floorindicator.averageFloor(N, indicator), DELTA * 4.5);
  }

  @Test
  public void case4() {
    int N = 1;
    String[] indicator = { "###", "..#", "..#", "..#", "..#" };
    assertEquals(5.4, floorindicator.averageFloor(N, indicator), DELTA * 5.4);
  }

  @Test
  public void case5() {
    int N = 1;
    String[] indicator = { "###", "#.#", "#.#", "..#", "###" };
    assertEquals(5.666666666666667, floorindicator.averageFloor(N, indicator), DELTA * 5.666666666666667);
  }

  @Test
  public void case6() {
    int N = 1;
    String[] indicator = { "###", ".#.", "...", "...", "..." };
    assertEquals(-1.0, floorindicator.averageFloor(N, indicator), DELTA * -1.0);
  }

  @Test
  public void case7() {
    int N = 1;
    String[] indicator = { "###", "#.#", "###", "#.#", "###" };
    assertEquals(8.0, floorindicator.averageFloor(N, indicator), DELTA * 8.0);
  }

  @Test
  public void case8() {
    int N = 2;
    String[] indicator = { 
        "###.###", 
        "#.#.#.#", 
        "#.#.###", 
        "#.#...#", 
        "###.###" };
    assertEquals(48.5, floorindicator.averageFloor(N, indicator), DELTA * 48.5);
  }

  @Test
  public void case9() {
    int N = 2;
    String[] indicator = { ".......", ".......", ".......", ".......", "......." };
    assertEquals(49.5, floorindicator.averageFloor(N, indicator), DELTA * 49.5);
  }

  @Test
  public void case10() {
    int N = 1;
    String[] indicator = { "...", ".#.", "...", "...", "..." };
    assertEquals(-1.0, floorindicator.averageFloor(N, indicator), DELTA * -1.0);
  }

  @Test
  public void case11() {
    int N = 1;
    String[] indicator = { "###", "..#", "..#", "..#", "..#" };
    assertEquals(5.4, floorindicator.averageFloor(N, indicator), DELTA * 5.4);
  }

  @Test
  public void case12() {
    int N = 1;
    String[] indicator = { "###", "...", "#.#", "...", "..#" };
    assertEquals(4.714285714285714, floorindicator.averageFloor(N, indicator), DELTA * 4.714285714285714);
  }

  @Test
  public void case13() {
    int N = 9;
    String[] indicator = { "...................................", "...................................", "...................................", "...................................", "..................................." };
    assertEquals(499999999.5, floorindicator.averageFloor(N, indicator), DELTA * 499999999.5);
  }

  @Test
  public void case14() {
    int N = 1;
    String[] indicator = { "###", "###", "###", "###", "###" };
    assertEquals(-1.0, floorindicator.averageFloor(N, indicator), DELTA * -1.0);
  }

  @Test
  public void case15() {
    int N = 2;
    String[] indicator = { "###....", "#.#....", "###....", "#.#....", "#.#...#" };
    assertEquals(84.5, floorindicator.averageFloor(N, indicator), DELTA * 84.5);
  }

  @Test
  public void case16() {
    int N = 3;
    String[] indicator = { "...........", "...........", "...........", ".........#.", "..........." };
    assertEquals(-1.0, floorindicator.averageFloor(N, indicator), DELTA * -1.0);
  }

  @Test
  public void case17() {
    int N = 1;
    String[] indicator = { "###", "#.#", "###", "#.#", "###" };
    assertEquals(8.0, floorindicator.averageFloor(N, indicator), DELTA * 8.0);
  }

  @Test
  public void case18() {
    int N = 1;
    String[] indicator = { ".##", "..#", ".##", "..#", ".#." };
    assertEquals(6.666666666666667, floorindicator.averageFloor(N, indicator), DELTA * 6.666666666666667);
  }

  @Test
  public void case19() {
    int N = 1;
    String[] indicator = { "...", "...", "...", "...", "..." };
    assertEquals(4.5, floorindicator.averageFloor(N, indicator), DELTA * 4.5);
  }

  @Test
  public void case20() {
    int N = 1;
    String[] indicator = { ".#.", ".#.", "#.#", "#.#", "..." };
    assertEquals(-1.0, floorindicator.averageFloor(N, indicator), DELTA * -1.0);
  }

  @Test
  public void case21() {
    int N = 2;
    String[] indicator = { ".......", ".......", ".....#.", ".......", "..#...#" };
    assertEquals(50.285714285714285, floorindicator.averageFloor(N, indicator), DELTA * 50.285714285714285);
  }

  @Test
  public void case22() {
    int N = 2;
    String[] indicator = { "..#...#", "#.....#", "..#..#.", ".......", "..#..##" };
    assertEquals(58.83333333333333, floorindicator.averageFloor(N, indicator), DELTA * 58.83333333333333);
  }

  @Test
  public void case23() {
    int N = 2;
    String[] indicator = { ".#.....", "#.#....", ".#..##.", "#......", ".##...#" };
    assertEquals(85.28571428571429, floorindicator.averageFloor(N, indicator), DELTA * 85.28571428571429);
  }

  @Test
  public void case24() {
    int N = 2;
    String[] indicator = { "###.##.", "#...#.#", ".##...#", "#.#...#", "##..###" };
    assertEquals(75.66666666666667, floorindicator.averageFloor(N, indicator), DELTA * 75.66666666666667);
  }

  @Test
  public void case25() {
    int N = 2;
    String[] indicator = { "###.###", "#.#.#.#", "###.###", "#.#.#.#", "###.###" };
    assertEquals(88.0, floorindicator.averageFloor(N, indicator), DELTA * 88.0);
  }

  @Test
  public void case26() {
    int N = 2;
    String[] indicator = { "###.###", "#.#.#.#", "###.###", "###.#.#", "###.###" };
    assertEquals(-1.0, floorindicator.averageFloor(N, indicator), DELTA * -1.0);
  }

  @Test
  public void case27() {
    int N = 3;
    String[] indicator = { "...........", "...........", "....#...#..", "#.#........", "..........." };
    assertEquals(517.5416666666667, floorindicator.averageFloor(N, indicator), DELTA * 517.5416666666667);
  }

  @Test
  public void case28() {
    int N = 3;
    String[] indicator = { "...........", "...........", "...........", "...........", "..........." };
    assertEquals(499.5, floorindicator.averageFloor(N, indicator), DELTA * 499.5);
  }

  @Test
  public void case29() {
    int N = 3;
    String[] indicator = { "...........", "...........", "...........", ".........#.", "..........." };
    assertEquals(-1.0, floorindicator.averageFloor(N, indicator), DELTA * -1.0);
  }

  @Test
  public void case30() {
    int N = 3;
    String[] indicator = { "###.###.###", "#.....#...#", "###..#..###", "....#.#.#.#", "###...#.#.." };
    assertEquals(788.0, floorindicator.averageFloor(N, indicator), DELTA * 788.0);
  }

  @Test
  public void case31() {
    int N = 4;
    String[] indicator = { "....###...#..##", "....#...#...#..", "###..#..##...#.", "#.....#...#.#.#", "#.......##..#.." };
    assertEquals(6110.333333333333, floorindicator.averageFloor(N, indicator), DELTA * 6110.333333333333);
  }

  @Test
  public void case32() {
    int N = 4;
    String[] indicator = { ".##.#.#.###..##", "#.#.#.#.#...#..", "###..##.#.#.#.#", "#.#.#.#.#.#...#", ".##.###.###.##." };
    assertEquals(8852.266666666666, floorindicator.averageFloor(N, indicator), DELTA * 8852.266666666666);
  }

  @Test
  public void case33() {
    int N = 4;
    String[] indicator = { 
        "............#..", 
        "#...........#..", 
        "#.#..#...##....", 
        "#.#.#.........#", 
        "..#.#.......#.#" };
    assertEquals(5258.4571428571435, floorindicator.averageFloor(N, indicator), DELTA * 5258.4571428571435);
  }

  @Test
  public void case34() {
    int N = 5;
    String[] indicator = { "...................", "...................", "...................", "...................", "..................." };
    assertEquals(49999.5, floorindicator.averageFloor(N, indicator), DELTA * 49999.5);
  }

  @Test
  public void case35() {
    int N = 5;
    String[] indicator = { "#.#.###.##..###..##", "..#.#.#.#...#.#.#..", "###..#..##..###..##", "#.....#...#.#.#...#", "###.###.###.###.###" };
    assertEquals(59287.0, floorindicator.averageFloor(N, indicator), DELTA * 59287.0);
  }

  @Test
  public void case36() {
    int N = 5;
    String[] indicator = { "........#.....#...#", "#...#.#............", "........#....#.....", "..............#.#..", ".#..##..#...#.....#" };
    assertEquals(62204.09523809524, floorindicator.averageFloor(N, indicator), DELTA * 62204.09523809524);
  }

  @Test
  public void case37() {
    int N = 6;
    String[] indicator = { ".#..##..##....#.#.#.#..", "#.#..##.#...#..........", "###.#.#...#.#.#.##..#.#", "#.......#.#.#.....#.#.#", "###......#...#..#...#.." };
    assertEquals(-1.0, floorindicator.averageFloor(N, indicator), DELTA * -1.0);
  }

  @Test
  public void case38() {
    int N = 6;
    String[] indicator = { "###.###.###.###.###.###", "..#.#.#.#.#.#.#.#.#.#..", ".##.###.###.###.##..###", "#.#.#.#.#.#.#.#.#.#.#.#", "##..###.###.###.#.#.#.#" };
    assertEquals(888887.0, floorindicator.averageFloor(N, indicator), DELTA * 888887.0);
  }

  @Test
  public void case39() {
    int N = 6;
    String[] indicator = { "......#..#.............", "................#...#..", "..............#.......#", "......................#", ".....................#." };
    assertEquals(500508.93333333335, floorindicator.averageFloor(N, indicator), DELTA * 500508.93333333335);
  }

  @Test
  public void case40() {
    int N = 7;
    String[] indicator = { ".#...#....#.#...#.#.....##.", "....#...#...#.#.#.#.#.#....", "#.#.##.......##...#.##..##.", "#.......#.#.#.......#.#...#", "#....#...#..#....#..###...." };
    assertEquals(4755319.533333333, floorindicator.averageFloor(N, indicator), DELTA * 4755319.533333333);
  }

  @Test
  public void case41() {
    int N = 7;
    String[] indicator = { "##..##..###..#...##.#....##", "..#...#.#.#.#.....#.#.#.#.#", "#.#...#.##.......##..##.###", "#...#...#.#...#...#.#...#.#", "#...###...#.#.#.##...##.#.#" };
    assertEquals(3753021.3333333335, floorindicator.averageFloor(N, indicator), DELTA * 3753021.3333333335);
  }

  @Test
  public void case42() {
    int N = 7;
    String[] indicator = { "###.###.###.#.#.###.###.###", "#.#.#.#.#.#.#.#.#.#.#.#.#.#", "#.#.#....##.###.###.#.#.###", "#.#.#.#.#.#.#.#.#.#.#.#.#.#", ".##.###..##.###.###.###.###" };
    assertEquals(4488848.0, floorindicator.averageFloor(N, indicator), DELTA * 4488848.0);
  }

  @Test
  public void case43() {
    int N = 8;
    String[] indicator = { "...............................", ".................#.............", "...............................", "...............................", "..............................." };
    assertEquals(-1.0, floorindicator.averageFloor(N, indicator), DELTA * -1.0);
  }

  @Test
  public void case44() {
    int N = 8;
    String[] indicator = { "###.###.###.###.###.###.###.###", "#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#", "###.###.###.###.###.###.###.###", "#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#", "###.###.###.###.###.###.###.###" };
    assertEquals(88888888.0, floorindicator.averageFloor(N, indicator), DELTA * 88888888.0);
  }

  @Test
  public void case45() {
    int N = 8;
    String[] indicator = { "...............................", "......#.#...#...#.......#...#..", "....#...#.....#..........#.....", "#.....................#.#...#..", "##...#....#......#....#..#....#" };
    assertEquals(44992819.11111111, floorindicator.averageFloor(N, indicator), DELTA * 44992819.11111111);
  }

  @Test
  public void case46() {
    int N = 8;
    String[] indicator = { ".##.###.##..#.#...#...#..#..##.", "..#.#...#.#...#...#.#...#...#..", "#.#.###...#...#.#.#.##..##...#.", "..#.#.#.#.#.#.......#...#.#...#", "#...#.#.##...##.##..#.#.##....#" };
    assertEquals(57438510.333333336, floorindicator.averageFloor(N, indicator), DELTA * 57438510.333333336);
  }

  @Test
  public void case47() {
    int N = 9;
    String[] indicator = { "........#...#.....#......#...#.....", "...................................", ".#....#..#...#..........#........#.", "........#.......#...........#......", ".........................##........" };
    assertEquals(579478350.047619, floorindicator.averageFloor(N, indicator), DELTA * 579478350.047619);
  }

  @Test
  public void case48() {
    int N = 9;
    String[] indicator = { ".........#..............##.........", "........#.......#...........#.#.#..", "##......#.............#.#.#...#.#.#", "............#...............#......", "................................#.." };
    assertEquals(579629778.9333333, floorindicator.averageFloor(N, indicator), DELTA * 579629778.9333333);
  }

  @Test
  public void case49() {
    int N = 9;
    String[] indicator = { "....#...###.#....##..#........#.#..", "#.......#...#......................", ".#..#........#..#....##..##.#...#..", "....#...#.#.......#...#...#.#.#...#", ".#...#....#..#..#...#...#...#.#.#.." };
    assertEquals(745425205.1666666, floorindicator.averageFloor(N, indicator), DELTA * 745425205.1666666);
  }

  @Test
  public void case50() {
    int N = 9;
    String[] indicator = { "#.......###..#..#...#.#.#.#...#.#.#", "....#.#...#...#...#.#...#.#...#....", "##..#.#.##......##..#....#..#.....#", "....#.......#.............#...#.#.#", "#.#.###..#..#.....#.....#....#...##" };
    assertEquals(595891571.3333334, floorindicator.averageFloor(N, indicator), DELTA * 595891571.3333334);
  }

  @Test
  public void case51() {
    int N = 9;
    String[] indicator = { "#.#.##..###.##....#.....#...##...##", "#.#.#.....#.#.#.......#.......#...#", "###..##.#.........#.##...#..##.....", "..#...........#.#.............#.#..", "#.#..#....#...#..#.......#...##.#.." };
    assertEquals(925012486.6666666, floorindicator.averageFloor(N, indicator), DELTA * 925012486.6666666);
  }

  @Test
  public void case52() {
    int N = 9;
    String[] indicator = { "#.#.###..#...##.###.#.....#.#.#.#.#", "....#...#...#.#.......#...#..##.#.#", "###.###..#..##....#.###.#.#.#.....#", "#...#.#.#.#.#.#.....#.#.#.#.#.#...#", "#.#.....###..##.###.#....##...#.#.." };
    assertEquals(-1.0, floorindicator.averageFloor(N, indicator), DELTA * -1.0);
  }

  @Test
  public void case53() {
    int N = 9;
    String[] indicator = { "....###.#...###.##..###..##.###.###", "....#...#.#.....#.#.#.#.#.#.#...#..", "..#.###.###.......#..##...#...#.###", "#.#.#.#.#.#...#...#.#.#.#...#.#....", "##..##..###..#..##...#..###.###.###" };
    assertEquals(545248453.6666667, floorindicator.averageFloor(N, indicator), DELTA * 545248453.6666667);
  }

  @Test
  public void case54() {
    int N = 9;
    String[] indicator = { "###.###.#.#.###.##..#.#.#.#.#....#.", "#.#.#.#.....#.#...#.#.#.#.#.#.#.#.#", "###.###.##..###.##...#..###.#.#..##", "#.#.#...#.#.#.#.#...#.#.#.#.#.#...#", "##..#.#.###.##..#.#.##..##..###..##" };
    assertEquals(887858848.5, floorindicator.averageFloor(N, indicator), DELTA * 887858848.5);
  }

  @Test
  public void case55() {
    int N = 9;
    String[] indicator = { ".##..#..#.#.##..###.##....#.###.###", "..#.....#.......#.#.#.#.#.#...#.#.#", "###.#.#.###.###.###.###.#.#.##..###", "#.#.#.#.#.#.#.#.#.#.#.#.#...#.#.#.#", "###..##.###.###.###..##.##...##.###" };
    assertEquals(854455154.6666666, floorindicator.averageFloor(N, indicator), DELTA * 854455154.6666666);
  }

  @Test
  public void case56() {
    int N = 9;
    String[] indicator = { "##..###..##..##.###.#.#.###.##..###", "#.#.#.#...#.#.#.#.#.#.#.#.#.#.#...#", "###.###.#.#.###.###.###.###..##.###", "#.#.#.#.....#.#.#.#.#.#.#.#.#.#...#", "###.#.#.###..##.###.#.#..##.###.##." };
    assertEquals(885288886.6666666, floorindicator.averageFloor(N, indicator), DELTA * 885288886.6666666);
  }

  @Test
  public void case57() {
    int N = 9;
    String[] indicator = { "###.###.###.###.###.###.###.###.###", "#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#", "###.###.###.###.###.###.###.###.###", "#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#", "###.###.###.###.###.###.###.###.###" };
    assertEquals(888888888.0, floorindicator.averageFloor(N, indicator), DELTA * 888888888.0);
  }

  @Test
  public void case58() {
    int N = 2;
    String[] indicator = { ".......", ".......", ".......", ".......", "......." };
    assertEquals(49.5, floorindicator.averageFloor(N, indicator), DELTA * 49.5);
  }

  @Test
  public void case59() {
    int N = 2;
    String[] indicator = { "###.###", "#.#.#.#", "#.#.###", "#.#...#", "###.###" };
    assertEquals(48.5, floorindicator.averageFloor(N, indicator), DELTA * 48.5);
  }

  @Test
  public void case60() {
    int N = 9;
    String[] indicator = { "....#..............................", "...................................", "...................................", "...................................", "..................................." };
    assertEquals(503888888.3888889, floorindicator.averageFloor(N, indicator), DELTA * 503888888.3888889);
  }

  @Test
  public void case61() {
    int N = 1;
    String[] indicator = { "...", ".#.", "...", "...", "..." };
    assertEquals(-1.0, floorindicator.averageFloor(N, indicator), DELTA * -1.0);
  }

  @Test
  public void case62() {
    int N = 9;
    String[] indicator = { "...................................", "...................................", "...................................", "...................................", "..................................." };
    assertEquals(499999999.5, floorindicator.averageFloor(N, indicator), DELTA * 499999999.5);
  }

  @Test
  public void case63() {
    int N = 9;
    String[] indicator = { "...................................", "...................................", "..#...#...#...#...#...#...#...#...#", "...................................", "..................................." };
    assertEquals(499999999.5, floorindicator.averageFloor(N, indicator), DELTA * 499999999.5);
  }

  @Test
  public void case64() {
    int N = 9;
    String[] indicator = { "....###.###.###....................", "....#.#...#.................#......", "....#.#.###.........###............", "....#.#...#.............#..........", "....###.###.....###................" };
    assertEquals(497219553.0714286, floorindicator.averageFloor(N, indicator), DELTA * 497219553.0714286);
  }

  @Test
  public void case65() {
    int N = 9;
    String[] indicator = { ".#.................................", "...................................", "...................................", "...................................", "..................................." };
    assertEquals(549999999.5, floorindicator.averageFloor(N, indicator), DELTA * 549999999.5);
  }

}
