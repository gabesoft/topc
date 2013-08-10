package topc.test.geometry;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.geometry.*;

public class BrickByBrickTest {
  BrickByBrick brickbybrick = new BrickByBrick();

  @Test
  public void case1() {
    String[] map = { ".B", "BB" };
    assertEquals(6, brickbybrick.timeToClear(map));
  }

  @Test
  public void case2() {
    String[] map = { ".BB", "BBB", "BBB" };
    assertEquals(-1, brickbybrick.timeToClear(map));
  }

  @Test
  public void case3() {
    String[] map = { ".BB", "BBB", "BB." };
    assertEquals(25, brickbybrick.timeToClear(map));
  }

  @Test
  public void case4() {
    String[] map = { "......B", "###.###", "B.....B" };
    assertEquals(35, brickbybrick.timeToClear(map));
  }

  @Test
  public void case5() {
    String[] map = { ".B" };
    assertEquals(1, brickbybrick.timeToClear(map));
  }

  @Test
  public void case6() {
    String[] map = { ".#B" };
    assertEquals(-1, brickbybrick.timeToClear(map));
  }

  @Test
  public void case7() {
    String[] map = { ".BBB", "BB##", "BB#B" };
    assertEquals(-1, brickbybrick.timeToClear(map));
  }

  @Test
  public void case8() {
    String[] map = { "....##", "..##.#", "B..B#B", ".B.##.", "B##...", "B.BBB#" };
    assertEquals(314, brickbybrick.timeToClear(map));
  }

  @Test
  public void case9() {
    String[] map = { ".B#.BBB.BBB", "#.B..#.B#B#", "B.#B.B.B#BB", "###BBB.#..#", ".BB..BB.#B#", "B.B#.B#B.B." };
    assertEquals(-1, brickbybrick.timeToClear(map));
  }

  @Test
  public void case10() {
    String[] map = { ".B.#.", ".B.BB", ".#.#.", ".#B#.", "....#", "B#.BB" };
    assertEquals(-1, brickbybrick.timeToClear(map));
  }

  @Test
  public void case11() {
    String[] map = { ".#BB...", "B.#BBB#", ".B.B..#", "BB.B.B.", "...B.#B", ".BB.B..", "B.B#BBB", "..B..BB" };
    assertEquals(470, brickbybrick.timeToClear(map));
  }

  @Test
  public void case12() {
    String[] map = { "..BBB...", ".#BB..#.", "B.#B.B..", "B.B.....", "##.B.B#.", "#BB.#.B.", "B..B.BB.", "#..BB..B", ".B....#." };
    assertEquals(-1, brickbybrick.timeToClear(map));
  }

  @Test
  public void case13() {
    String[] map = { ".BB..BBB.B...", "B.B...B..BB..", "#B...B#B.....", "B#B.B##...##B", "BB.B#.B##B.B#", "B.B#.BBB.BB#B", "B#BBB##.#B#B.", "B#BB.BBB#BB.#" };
    assertEquals(3912, brickbybrick.timeToClear(map));
  }

  @Test
  public void case14() {
    String[] map = { ".............", ".##.....##.#.", ".##...#......", "....#.#......", "..##...#.....", "#........##..", "....#........", ".........#.#B" };
    assertEquals(294, brickbybrick.timeToClear(map));
  }

  @Test
  public void case15() {
    String[] map = { "..B.#.B......B.", "...B.BBB.#B...#", "...BB..B.#BB..#", ".#B.#B..#....#B", "#...#...B.B.B#.", "B#B.#.B..#BB.##", "..B..#...#B#B#B", "B#.#....#..B#..", "B#B.#B.B.#B...#", "B.....#B##.#...", "B.#...B.BBBB##.", "..B..##.#B..BBB" };
    assertEquals(-1, brickbybrick.timeToClear(map));
  }

  @Test
  public void case16() {
    String[] map = { "....B..", "..B.#.#", ".#.B...", "..B.B.B", "#...B..", "B#.#B..", "..#BB.B", "BBBB..B" };
    assertEquals(-1, brickbybrick.timeToClear(map));
  }

  @Test
  public void case17() {
    String[] map = { ".B.....", ".......", "......#" };
    assertEquals(1, brickbybrick.timeToClear(map));
  }

  @Test
  public void case18() {
    String[] map = { ".......", "B......", "......#" };
    assertEquals(26, brickbybrick.timeToClear(map));
  }

  @Test
  public void case19() {
    String[] map = { "...B", "....", "....", "#..." };
    assertEquals(-1, brickbybrick.timeToClear(map));
  }

  @Test
  public void case20() {
    String[] map = { "...#....B", ".BBBB.B..", "....##B##", "B..B..BBB", "...B...#.", ".B.BB..#.", ".......##", "..B##...B", "B....B..." };
    assertEquals(1431, brickbybrick.timeToClear(map));
  }

  @Test
  public void case21() {
    String[] map = { "....#....", "B.#B#..B#", ".B.......", "#.#......", ".....#BB.", ".#...B.B.", "...B.....", "......#B.", "..#.B...." };
    assertEquals(56, brickbybrick.timeToClear(map));
  }

  @Test
  public void case22() {
    String[] map = { "....B...#.....", "B.......BB.#..", ".BB..#.B...#.#", "#..#....#....#", ".#.#.#.B...###", "#...B#..B.....", "#.B...#.....#.", "B....B...#....", "..B........#..", "..B.........B." };
    assertEquals(146, brickbybrick.timeToClear(map));
  }

  @Test
  public void case23() {
    String[] map = { ".BBBBBBBBBBBBBB", "##############B", "BBBBBBBBBBBBBBB", "B##############", "BBBBBBBBBBBBBBB", "##############B", "BBBBBBBBBBBBBBB", "B##############", "BBBBBBBBBBBBBBB", "##############B", "BBBBBBBBBBBBBBB", "B##############", "BBBBBBBBBBBBBBB", "##############B", "BBBBBBBBBBBBBBB" };
    assertEquals(31753, brickbybrick.timeToClear(map));
  }

  @Test
  public void case24() {
    String[] map = { ".BBBBBBBBBBBBBB" };
    assertEquals(391, brickbybrick.timeToClear(map));
  }

  @Test
  public void case25() {
    String[] map = { ".", "B", "B", "B", "B", "B", "B", "B", "B", "B", "B", "B", "B", "B", "B" };
    assertEquals(392, brickbybrick.timeToClear(map));
  }

  @Test
  public void case26() {
    String[] map = { ".BBBBBBBBBBBBBB", "BBBBBBBBBBBBBBB", "BBBBBBBBBBBBBBB", "BBBBBBBBBBBBBBB", "BBBBBBBBBBBBBBB", "BBBBBBBBBBBBBBB", "BBBBBBBBBBBBBBB", "BBBBBBBBBBBBBBB", "BBBBBBBBBBBBBBB", "BBBBBBBBBBBBBBB", "BBBBBBBBBBBBBBB", "BBBBBBBBBBBBBBB", "BBBBBBBBBBBBBBB", "BBBBBBBBBBBBBBB", "BBBBBBBBBBBBBBB" };
    assertEquals(-1, brickbybrick.timeToClear(map));
  }

  @Test
  public void case27() {
    String[] map = { ".BBBBBBB#BBBBBB", "B#BB#BBB#BBBBBB", "BBBBBBBBBBBBB##", "BBBBBBBBBBBBBB#", "BBBBBBBBBBB#BBB", "BBBBBBBBB#BBBBB", "B#B#BBBBBBBBBBB", "B##BBBBBBBB#BBB", "BB#BBB#B###BBBB", "##B#BBB#BBBBBBB", "BBB#BB#BBB#BBBB", "B#BBBBBBBBBBBBB", "B#BBB#BBB#BB#BB", "BB##BBBB##BBBBB", "BB#BBBBBBBBBBBB" };
    assertEquals(11341, brickbybrick.timeToClear(map));
  }

  @Test
  public void case28() {
    String[] map = { ".BBBB##BBB#BBBB", "BBB#BB##BB#B##B", "BB####BBBBBBB#B", "BBBBBB#BBB#BB#B", "BBBBBBBB#BBB##B", "BBBBBBB#BB#B##B", "BBBBBBBBB#BB#BB", "BBB##BB#B###BB#", "##BBBBBBBBBB#BB", "BBBB#B#B#B###BB", "BBB#B#BBBB#BBB#", "#BB#BBBBB#BBBB#", "BBBB#BB#B#BB#BB", "BB###BBB#B#BBBB", "#BBBBB#BB#BB#BB" };
    assertEquals(-1, brickbybrick.timeToClear(map));
  }

  @Test
  public void case29() {
    String[] map = { ".BBBBBBBBBBBBBB", "##############B", "BBBBBBBBBBBBB#B", "B###########B#B", "B#BBBBBBBBB#B#B", "B#B#######B#B#B", "B#B#BBBBB#B#B#B", "B#B#B###B#B#B#B", "B#B#B#BBB#B#B#B", "B#B#B#####B#B#B", "B#B#BBBBBBB#B#B", "B#B#########B#B", "B#BBBBBBBBBBB#B", "B#############B", "BBBBBBBBBBBBBBB" };
    assertEquals(31765, brickbybrick.timeToClear(map));
  }

  @Test
  public void case30() {
    String[] map = { ".B", "BB" };
    assertEquals(6, brickbybrick.timeToClear(map));
  }

  @Test
  public void case31() {
    String[] map = { "......B", "###.###", "B.....B" };
    assertEquals(35, brickbybrick.timeToClear(map));
  }

  @Test
  public void case32() {
    String[] map = { ".BBBBBBBBBBBBBB", "##############B", "BBBBBBBBBBBBBBB", "B##############", "BBBBBBBBBBBBBBB", "##############B", "BBBBBBBBBBBBBBB", "B##############", "BBBBBBBBBBBBBBB", "##############B", "BBBBBBBBBBBBBBB", "B##############", "BBBBBBBBBBBBBBB", "##############B", "BBBBBBBBBBBBBBB" };
    assertEquals(31753, brickbybrick.timeToClear(map));
  }

  @Test
  public void case33() {
    String[] map = { ".BB", "BBB", "BBB" };
    assertEquals(-1, brickbybrick.timeToClear(map));
  }

  @Test
  public void case34() {
    String[] map = { ".BB..BBB.B...", "B.B...B..BB..", "#B...B#B.....", "B#B.B##...##B", "BB.B#.B..B.B#", "B.B#.BBB.BB#B", "B#BBB##.#B#B.", "B.BB.BBB#BB.#" };
    assertEquals(-1, brickbybrick.timeToClear(map));
  }

  @Test
  public void case35() {
    String[] map = { ".BBBBBBBBB", "..BBB##BBB", ".#BBBB###B", "##BBBB...B" };
    assertEquals(362, brickbybrick.timeToClear(map));
  }

}
