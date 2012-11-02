package topc.test.graph;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.graph.*;

public class ActivateGameTest {
  ActivateGame activategame = new ActivateGame();

  @Test
  public void case1() {
    String[] grid = { "05", "aB" };
    assertEquals(69, activategame.findMaxScore(grid));
  }

  @Test
  public void case2() {
    String[] grid = { "03", "21" };
    assertEquals(7, activategame.findMaxScore(grid));
  }

  @Test
  public void case3() {
    String[] grid = { "John", "Brus", "Gogo" };
    assertEquals(118, activategame.findMaxScore(grid));
  }

  @Test
  public void case4() {
    String[] grid = { "AAA", "AAA", "AAA" };
    assertEquals(0, activategame.findMaxScore(grid));
  }

  @Test
  public void case5() {
    String[] grid = { "0", "Z" };
    assertEquals(61, activategame.findMaxScore(grid));
  }

  @Test
  public void case6() {
    String[] grid = { "abcdefghij", "klmnopqrst", "uvwxyzzzzz", "ABCDEFGHIJ", "KLMNOPQRST", "UVWXYZZZZZ", "0123456789" };
    assertEquals(1009, activategame.findMaxScore(grid));
  }

  @Test
  public void case7() {
    String[] grid = { "53" };
    assertEquals(2, activategame.findMaxScore(grid));
  }

  @Test
  public void case8() {
    String[] grid = { "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn" };
    assertEquals(0, activategame.findMaxScore(grid));
  }

  @Test
  public void case9() {
    String[] grid = { "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM", "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM" };
    assertEquals(0, activategame.findMaxScore(grid));
  }

  @Test
  public void case10() {
    String[] grid = { "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0", "Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0" };
    assertEquals(149450, activategame.findMaxScore(grid));
  }

  @Test
  public void case11() {
    String[] grid = { "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z", "0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z0Z" };
    assertEquals(149450, activategame.findMaxScore(grid));
  }

  @Test
  public void case12() {
    String[] grid = { "mD" };
    assertEquals(17, activategame.findMaxScore(grid));
  }

  @Test
  public void case13() {
    String[] grid = { "5P" };
    assertEquals(46, activategame.findMaxScore(grid));
  }

  @Test
  public void case14() {
    String[] grid = { "5435" };
    assertEquals(4, activategame.findMaxScore(grid));
  }

  @Test
  public void case15() {
    String[] grid = { "do44" };
    assertEquals(31, activategame.findMaxScore(grid));
  }

  @Test
  public void case16() {
    String[] grid = { "96466p71" };
    assertEquals(50, activategame.findMaxScore(grid));
  }

  @Test
  public void case17() {
    String[] grid = { "nCznFB4y" };
    assertEquals(115, activategame.findMaxScore(grid));
  }

  @Test
  public void case18() {
    String[] grid = { "bYZRUTbDnQDWKFUW" };
    assertEquals(245, activategame.findMaxScore(grid));
  }

  @Test
  public void case19() {
    String[] grid = { "czJZZboJbRZI4Gno" };
    assertEquals(332, activategame.findMaxScore(grid));
  }

  @Test
  public void case20() {
    String[] grid = { "3166573f07Xj87462n27572325427762" };
    assertEquals(235, activategame.findMaxScore(grid));
  }

  @Test
  public void case21() {
    String[] grid = { "K68nfsn3RMxcySoAp409NkCgDi6cyIqz" };
    assertEquals(553, activategame.findMaxScore(grid));
  }

  @Test
  public void case22() {
    String[] grid = { "UlgcvrktpgtnwPaghaxvbkjgjgrpbznelrzsatjlyyurgiKvbz" };
    assertEquals(531, activategame.findMaxScore(grid));
  }

  @Test
  public void case23() {
    String[] grid = { "2RwoMtfbe4V2QBzccuWSaKFVqmmLwdxkAwOomoR0AB96wwXEfc" };
    assertEquals(948, activategame.findMaxScore(grid));
  }

  @Test
  public void case24() {
    String[] grid = { "N", "o" };
    assertEquals(25, activategame.findMaxScore(grid));
  }

  @Test
  public void case25() {
    String[] grid = { "R", "g" };
    assertEquals(37, activategame.findMaxScore(grid));
  }

  @Test
  public void case26() {
    String[] grid = { "Us", "QO" };
    assertEquals(54, activategame.findMaxScore(grid));
  }

  @Test
  public void case27() {
    String[] grid = { "kq", "xD" };
    assertEquals(32, activategame.findMaxScore(grid));
  }

  @Test
  public void case28() {
    String[] grid = { "mggd", "fdnr" };
    assertEquals(51, activategame.findMaxScore(grid));
  }

  @Test
  public void case29() {
    String[] grid = { "E3X9", "c0Q7" };
    assertEquals(280, activategame.findMaxScore(grid));
  }

  @Test
  public void case30() {
    String[] grid = { "Qifw4bLx", "KiIi0byi" };
    assertEquals(327, activategame.findMaxScore(grid));
  }

  @Test
  public void case31() {
    String[] grid = { "ZNVz3lWP", "bwvDoEl1" };
    assertEquals(393, activategame.findMaxScore(grid));
  }

  @Test
  public void case32() {
    String[] grid = { "AI0dukhhvslr7yzZ", "sAb8wzeUozcxRbon" };
    assertEquals(645, activategame.findMaxScore(grid));
  }

  @Test
  public void case33() {
    String[] grid = { "ShyH8ACoTewLuqRM", "MA0P173JRoiCFtmz" };
    assertEquals(751, activategame.findMaxScore(grid));
  }

  @Test
  public void case34() {
    String[] grid = { "433s9M909RX1f45A017G2959F881c2Dn", "51H9N1331489699j1zs033r363N03486" };
    assertEquals(1460, activategame.findMaxScore(grid));
  }

  @Test
  public void case35() {
    String[] grid = { "imLEgrU9m2EbBKixSs0S6uXzPVqSaeTU", "WUYmbN7nMfoLrJI0DdpBBJfKTTda9KPA" };
    assertEquals(1746, activategame.findMaxScore(grid));
  }

  @Test
  public void case36() {
    String[] grid = { "JRYJQWIVEGGRUEMGlOVXQOjUegjQQDSUZVFZ1TVUAQsKGCSU5Z", "X8IVV1MWERkgUONsVXZNEVQKIUGZwWGuAAEyGITWERHZA19NQD" };
    assertEquals(2204, activategame.findMaxScore(grid));
  }

  @Test
  public void case37() {
    String[] grid = { "waqnJDpJDYkobYrTYHrtvmbD7X8BeCl5j0bP4V5FYyOAFl4mrQ", "GWTba02o2rJaKEZVhYanrv67Ohb6yrjFaWPorvYLxwjv86A30D" };
    assertEquals(2714, activategame.findMaxScore(grid));
  }

  @Test
  public void case38() {
    String[] grid = { "5", "4", "1", "2" };
    assertEquals(5, activategame.findMaxScore(grid));
  }

  @Test
  public void case39() {
    String[] grid = { "g", "e", "p", "O" };
    assertEquals(38, activategame.findMaxScore(grid));
  }

  @Test
  public void case40() {
    String[] grid = { "44", "59", "x6", "N9" };
    assertEquals(121, activategame.findMaxScore(grid));
  }

  @Test
  public void case41() {
    String[] grid = { "KU", "R5", "Rg", "iH" };
    assertEquals(219, activategame.findMaxScore(grid));
  }

  @Test
  public void case42() {
    String[] grid = { "8LXV", "EN0E", "UHJA", "CRIA" };
    assertEquals(381, activategame.findMaxScore(grid));
  }

  @Test
  public void case43() {
    String[] grid = { "a4KC", "642w", "3LYU", "l2uI" };
    assertEquals(439, activategame.findMaxScore(grid));
  }

  @Test
  public void case44() {
    String[] grid = { "oigpsjFu", "HlCf53un", "cghhymhx", "wbspprj0" };
    assertEquals(536, activategame.findMaxScore(grid));
  }

  @Test
  public void case45() {
    String[] grid = { "tJwYjaIu", "ovpwL8QT", "wjYh0vtY", "VK3R5t5H" };
    assertEquals(938, activategame.findMaxScore(grid));
  }

  @Test
  public void case46() {
    String[] grid = { "ACWQIUTZaERDBNOu", "CEtGSYCASRWQPSDI", "zOHVXJOCQgHOpc1Z", "LaESD8FPcXLNQZMF" };
    assertEquals(1438, activategame.findMaxScore(grid));
  }

  @Test
  public void case47() {
    String[] grid = { "JxoJIDzYQIO4NmQE", "DsRT2jpaUcsb0mYR", "dUOMDODwFCy69Nrm", "Fr7roRlzh9y90Fyo" };
    assertEquals(1645, activategame.findMaxScore(grid));
  }

  @Test
  public void case48() {
    String[] grid = { "9Li947T98P796y164156759323158562", "68902605xLc0654631Czt62ym73QI288", "7YR479960127834G9130683945S38A23", "k54Z16G00603g2514l119585CY612h82" };
    assertEquals(2766, activategame.findMaxScore(grid));
  }

  @Test
  public void case49() {
    String[] grid = { "gB8SpzQCaiDlsQy04LvnrapE8BPgQoOQ", "5eqE4voKIZb9V32jo0vLVauYJORy3c0H", "FSHj3H4NQkjSMMJBe7ihjjjTartjhIxI", "7n3N8nJUNBFFz567EvduW3GkWAl6q0zB" };
    assertEquals(3679, activategame.findMaxScore(grid));
  }

  @Test
  public void case50() {
    String[] grid = { "A25672v23075e288620A062cD0950n60b2nH12699o47v78715", "27S95G37644w31851f9604A413067297742T73o6C4v88rpy23", "c48f5b4037039eP074uZ65326681D22r345O94X2236375169w", "9752q95AK7eK373514C1559251374G299987281889960q1392" };
    assertEquals(3952, activategame.findMaxScore(grid));
  }

  @Test
  public void case51() {
    String[] grid = { "GK4apkbSkXKcXo7L0Yyn2aOGlfCDmP3V4h0atA2W5NfseUlBsO", "mngCpcG3yrkKERa5U2GpXEGNaK2AXC3fufqFH2ChsdMZvuztrX", "1TeoyL9iLPjzFcdltcHU98PbiuSGY1pxja0HJkvK79DkMqqZ8B", "NGjBiReb1m8CThJpuMLlNCGXBUqpjRvkoQKVhgPB58To6xJOeq" };
    assertEquals(5989, activategame.findMaxScore(grid));
  }

  @Test
  public void case52() {
    String[] grid = { "d", "7", "T", "H", "5", "4", "h", "8" };
    assertEquals(127, activategame.findMaxScore(grid));
  }

  @Test
  public void case53() {
    String[] grid = { "m", "I", "7", "I", "d", "K", "7", "c" };
    assertEquals(204, activategame.findMaxScore(grid));
  }

  @Test
  public void case54() {
    String[] grid = { "jr", "bu", "yA", "dd", "ny", "yy", "Xw", "eO" };
    assertEquals(290, activategame.findMaxScore(grid));
  }

  @Test
  public void case55() {
    String[] grid = { "7M", "eq", "Ff", "vr", "Ty", "LB", "9h", "VA" };
    assertEquals(349, activategame.findMaxScore(grid));
  }

  @Test
  public void case56() {
    String[] grid = { "61G5", "8403", "19QL", "883J", "p76t", "9811", "7A69", "27Y4" };
    assertEquals(785, activategame.findMaxScore(grid));
  }

  @Test
  public void case57() {
    String[] grid = { "ov8a", "1b0H", "ICub", "ks9w", "qlzO", "9YBY", "2PgJ", "L2pe" };
    assertEquals(875, activategame.findMaxScore(grid));
  }

  @Test
  public void case58() {
    String[] grid = { "zwSeyzhd", "syzMzrux", "upvmkfbl", "rswnhbvu", "ThWsbtcc", "ivadrdbm", "fppizzzt", "uythidvl" };
    assertEquals(1071, activategame.findMaxScore(grid));
  }

  @Test
  public void case59() {
    String[] grid = { "m8x4Ilwm", "CcejHRn0", "vpH7Y5qg", "sWk5Ti4F", "O983qQ0g", "729JyLuP", "LV1hDriH", "RDvkTiEM" };
    assertEquals(1842, activategame.findMaxScore(grid));
  }

  @Test
  public void case60() {
    String[] grid = { "CWQNYGGNRuWZSARQ", "KOWELKeUJWJMuENX", "LY0ANoDOWJBYEFLT", "ZQQANMEPPCXHUVGM", "RaZAOJQGALBNFBJL", "ZOOMKQRVYAOGS8RG", "CIQBHTFOUSRPNSGS", "LVrTDMFXEJWHQLAd" };
    assertEquals(2272, activategame.findMaxScore(grid));
  }

  @Test
  public void case61() {
    String[] grid = { "leiiPqkuJvJfaflN", "ML5akAdzOOPyyy5a", "a0AexD99H66xeXft", "NZ3RR4R0qGzTNwfq", "mEfsaaaXLpKKskBL", "2wqhIl7lDSaWdb7x", "ZExNRmYEPO8URYnW", "WMClsLSXYU4YzrJC" };
    assertEquals(3667, activategame.findMaxScore(grid));
  }

  @Test
  public void case62() {
    String[] grid = { "dcjyglzqTebppqtikptygraozkvybcif", "bobVrcjaQYmqtvlhgvbvdeSf9ewevmqt", "jqjjywbklefsb9zfoj0gfeinc6bhUmox", "DyerevjvexgyijqeMzj21wbpHoytwhmp", "vxudth7TAgpvwkyJabiJqxhkwlf5uhkc", "zohvVur6bapdxbgvacjlod0ab3ufpdjx", "zdzoFnmjqkfghljcikltdyzlXrcJbdij", "s2riSf2faj11jvreevvipjjuByjbuxxx" };
    assertEquals(4649, activategame.findMaxScore(grid));
  }

  @Test
  public void case63() {
    String[] grid = { "yrIhEX0dugWuf0AFNzaUzIjBue5FkVB6", "qVQyQdMvJSbaMz904pyv6qtehGpGc2e0", "J0YsDj9xbzDlQvdm5ZjDWQM48EZBaU4n", "jkKHKJ61qGoosnLuPt50BbLw4e9CMsrR", "MBMvWjjYoAvjI0XsDvZY9nKkY1azcUSw", "asDm58ESOCXKiXFM7QyyGDIEW9fT8bCi", "IEmhzyg5ifGZt50OfEKPuWmwYOzLRyA1", "7QotVaoPIj4Y52dmRG3Dhy4oq8KmMYUT" };
    assertEquals(7762, activategame.findMaxScore(grid));
  }

  @Test
  public void case64() {
    String[] grid = { "b57j4403St702l062569355546834872409927110XF337441S", "27n41o19H49B36396962O57Vk810309860197429506a510788", "6v27731Y641247b9Nw31540246610G80y850795339165a1878", "9S1b0878eIk6430764T665142370q900466628q31342884R76", "DR42U726m59cDA5133399647670C120362690U7PP25924053C", "J1456259037O77X993K7505504729Pw333r7ZJ3603326A217W", "7256401KP0386s44284Z7497333975u17Fi840235672088I7u", "7q02826v37U9h82940127642N09575728O07905rw81L397842" };
    assertEquals(8163, activategame.findMaxScore(grid));
  }

  @Test
  public void case65() {
    String[] grid = { "gCrGR7z4H5nwNHKF5NQa708KYyFA08Fup64cIUkgp8Syp7ExKm", "UQU05OvhhqJ1dhAhpQj2AHX1YoiRCK4iVXlL8AmjP5yPMHUofo", "SBihPMeTEttv8pvXI439Q2tMv6krrSWtM1HQx3R7Rvn0sLKxwx", "xE8nSYOiaccPoTBGmMyCDVthMWBXUGqM4eqYqSqJVdaqChFiGw", "fTQTOD01sLJ7Q9t4PzpvWD5Gf1IvsvVuYYrsPIExX75nT2TlW3", "kCf6WSQCQJFPDByzqef3bHryYKm8PgLWdePE6xLiHOIbckewlC", "rCqiJipdJx3wOpaFYa0uPUFtbRPEIjQjvKqCAbXDfLImvMSs8q", "rZJhA8V45ybBaKeFaXIFl3Ncfwew6VqC1lH0ttVTQvJ8C88ZVE" };
    assertEquals(12367, activategame.findMaxScore(grid));
  }

  @Test
  public void case66() {
    String[] grid = { "3", "9", "8", "7", "c", "I", "0", "m", "8", "T", "i", "9", "0", "8", "8", "6" };
    assertEquals(237, activategame.findMaxScore(grid));
  }

  @Test
  public void case67() {
    String[] grid = { "d", "v", "b", "F", "v", "S", "a", "x", "6", "4", "y", "q", "E", "w", "k", "o" };
    assertEquals(273, activategame.findMaxScore(grid));
  }

  @Test
  public void case68() {
    String[] grid = { "CL", "AM", "ZM", "aA", "CL", "TQ", "IX", "SN", "VQ", "AO", "DD", "VO", "TA", "YK", "LA", "LL" };
    assertEquals(429, activategame.findMaxScore(grid));
  }

  @Test
  public void case69() {
    String[] grid = { "Uy", "Le", "CJ", "v7", "Do", "Ji", "cw", "5g", "kO", "Wm", "VC", "r6", "zl", "AK", "fX", "Bv" };
    assertEquals(745, activategame.findMaxScore(grid));
  }

  @Test
  public void case70() {
    String[] grid = { "AL29", "1mG6", "8666", "5571", "0376", "9Z40", "15f8", "7856", "4841", "1q77", "HZE0", "9QI2", "Q39o", "OY35", "6X37", "x803" };
    assertEquals(1504, activategame.findMaxScore(grid));
  }

  @Test
  public void case71() {
    String[] grid = { "wi78", "UCYF", "MgRD", "6s6S", "4qML", "lWJh", "p4pX", "VnAy", "tBLG", "6mU2", "sSii", "6yVS", "DLkr", "NUbi", "e1bx", "kRtg" };
    assertEquals(1875, activategame.findMaxScore(grid));
  }

  @Test
  public void case72() {
    String[] grid = { "GgwyeKhw", "tzyaxsrs", "suxmjxD0", "qjcnvjbe", "v8yfhhx5", "uhoourCK", "ofB3bsal", "loiqbrkn", "mbe7mPbg", "oc9hwdbl", "lsGh9wSr", "olidcpjq", "wrkr2jfz", "bazgXTui", "gebwvFpl", "wcrumsks" };
    assertEquals(2305, activategame.findMaxScore(grid));
  }

  @Test
  public void case73() {
    String[] grid = { "JfyfSlOi", "urG3posQ", "8Pxn10MC", "26kjXIYD", "CO1OZiLr", "yiqRkz7Z", "t4fhTYZP", "PNTTTn8X", "el5yKpFJ", "fVkWKPjj", "6GDHBZ9c", "yv6RMi3n", "9ehuCmtk", "d1RXf31S", "iTfB0fUU", "iyc1PzCe" };
    assertEquals(3954, activategame.findMaxScore(grid));
  }

  @Test
  public void case74() {
    String[] grid = { "tgcyBfCprkvlzp7x", "heuPwcemppq2daaX", "glh0eiTdudfippsr", "civxxtewzRdllzzf", "jzhsajprx3kltidm", "kxcguskvjsvrerga", "QnUCbtmisbcqkelm", "hrjpnBhevszjXAT5", "lnbBxHskxodzqmbr", "oynudpjznkaefewJ", "ilzxtfwjruoehply", "tfdbwyyfbhaswonu", "bkyiAjnycswrqnbe", "zlxlvpvonzQtSbqP", "stovwafoNjtxwz8J", "7StmisfgQblGcnhb" };
    assertEquals(4709, activategame.findMaxScore(grid));
  }

  @Test
  public void case75() {
    String[] grid = { "gQtkWz1nxxTFLHVr", "EjX4rsc8tgTw2H85", "lTSGPY3WVgpYo9MR", "HLBb3KgpfnOoAP2F", "P6WaIL2LYQIvvOL7", "vVafZ6BDUCv7aeDX", "PlGhdodSGKWYeBJJ", "euvIY0RTN6HzI62h", "wfQqEmdXGJrspXxl", "2xHY2pcrNImwy9M5", "7cmVhcEhFRLoOjre", "Ki2K2RdFWD8Fm2ot", "ZnnZAn4QXTbGt9HO", "HP2cITp3MKp0y2OI", "ZbLGsu0IQSExKWZ8", "lrTPy3NhXgcuYksa" };
    assertEquals(8137, activategame.findMaxScore(grid));
  }

  @Test
  public void case76() {
    String[] grid = { "wupjjruatvottcwpeYwiecGjs1ieifSq", "quj5pbdmsyForkufhdmrtsclhpIpvxyg", "ldbopafbfkatcyagoqquyiXgSxnCgCol", "Kjdugefkc5udjvbvHwantkxohqUtcrM5", "mhNjt9cawrbuodyskjksObjpwtuecbnu", "qetEcWbxhbywcxvtfncnjaawk5B8qovA", "DufupkqfQwVuBeItqhvUmpoovdRlwyho", "ov3HVdljqmmjLeedsiTrfmgtzldYxghn", "bciPxujlvtPhnfkt84dvdOu9zomotfib", "XnevtphnzsckkjWRyakyunuhs6Czhtp3", "wqhyfWdlrvzxy7ccyyetlapqwc5zaspp", "zTwikptdhx5dg2ukvkzcoawOXoudqhxj", "mwuHxOuFfzwwouswyzyBdx4yqskohnih", "z7xiataqPBppaeavfkesixlwGiraauct", "wfvcj7w0vxCUA9cvivtttvdslgjxmgal", "bkjtzsjsranDmjL6asfgu2ylngpongjk" };
    assertEquals(9898, activategame.findMaxScore(grid));
  }

  @Test
  public void case77() {
    String[] grid = { "YZJoKGxrnPO5xobCMUHPYOWyqQciUDLk", "IWDmaJS7MislPtUZDvFImg5fRZv4H0y9", "ScvUYOx1f6kEazp7IysavepgVT4NH4pT", "6T0DZAHOB37A5OTR28TMcWknvx3MCh5M", "hzE8wj8jLRRb1teSOeFGGNU39RmlDI0l", "sah4JtCJW6ovSri2WKhvFJfDD8gjSAAm", "p1wym64svNTFxiA23rwpksy8u2l1YNQT", "BipL3qt9wgnfhHGgYrz5KdynR7xQUOUg", "dDeoQNpNNiHSouItdkpH1VFW9R6FIjq1", "BwCDPJu5lyZG47U70wjWGGL9r65mj4b3", "olzbXRsujzJlwcxpinsxaHRExApQC11r", "PQQLJV5f7ghulvumIzMKTizMVrixsKk6", "ofD6wTKTlvLk8oKdBg5ihs1IObQo9VBE", "OzQvGgSGQtExTVi1tVZVDPWP7eonXrW0", "WLgb2Mx9ALglFLhA6srsKHcQrpcVBgsR", "UFxtONPDLVJtjcoVW8JbnW9D4mMxe1UC" };
    assertEquals(14821, activategame.findMaxScore(grid));
  }

  @Test
  public void case78() {
    String[] grid = { "667P3hmB3HM8189194z7764t0k71701dm5545W80765zE99081", "wm1G4K488239KAJ427o75R916179u4Jf7957911989g27441y9", "04u685aP66257809D9F244S931Vk3393551814903045M5B2e9", "050252160n468548B1c62708897628t6H5335189t386I5M754", "3451hDdEw117K8164h673A45n01850g69763734630089882G7", "566R5905Xn26195113eY4131I29qC2H08457L3851O9e959724", "37s23O17420598D876355144wc8178D085P2L4821M11832955", "6955o78273Y8393849ZeFS783s3879190147998559994M2315", "a22p22451Y4874181w63968961ak3245h6394h3FC96QA47697", "8091057109298297284x12535479715y9UY8897sB2e5i03193", "N88oq321Q008L9736C06329Vl983617597A4390e36c8901281", "645E888764t4I02965I213je2B0LU036eI799N2V590833709R", "739874680603708563585aDZ234945n546no7O8o843791E318", "0x37151898907Zs303P96177S11772k811W0o5910849J53588", "I3Q1314013r7388231231254561C4516990C2310807a591M37", "32E166436933030715D03P5027034265a5668WO2188X179935" };
    assertEquals(17447, activategame.findMaxScore(grid));
  }

  @Test
  public void case79() {
    String[] grid = { "mZCdl72HJRRb6ukibxvHxM9O3IvskuJb9bjiBUS0w8MIiq7e9X", "SJAi1mR1zzSBknhzJAWZUwGfeCppvN7zMCCXlsXyJRJaz7Ah9v", "avOPAf7ljlnmC2rOJ2qlzED6jXJbIZI9GSvqqfNUxTSHsZy1C4", "dHk9TD9AeiEPAcXLyFGlzv7tjXN7GZ2Tq6DXZsRiOzd0Q2B7Jk", "H8frdkII65pan4pwKotfBeju3a1EcFxxDNZI1oiSHCLB1rjhJS", "Kg8INrE4DF0SbS0rvVmoZhcVdZv7nDwOfrQQAciWDnhtxf5Lol", "6lX96JHcT0EcjEMmzvar6tUHqZI04UKOb0wBFN3JRHMwGNbJmn", "HH3YOFQc1Qp7CnDoJDxTFGCDH0xIeULl5WpG9vDDWnpzXe6jO8", "DgMl2uxWySASV4V0iUc3lBH7I1ecLkHTgeb6Xbz1lgrLA12Aas", "ahH9dpfdNbRJB40DuxoUPmITpQyTTQK7KOVaB5QowifEjLjepP", "RavnnMz2cacMGJ0UpHaNBldiRqpSrWwivbxuUsqTuznMSFys09", "r5XR4yHGGNtzSpyW4W8ZY7t63DzNqxMDEqGJRxON3JPZtjMeUQ", "Ko8xLyvxRY5hL4H8ojIXUWGjf7Le24zgfhMDyXM297t3C6Lu0U", "JBb1t5kRbAgLjDvgLu764DGEsO4GDyiSYnYcZWW6xRwmxLGqSq", "O4lExsoFXZRROCYS9ZvaOjehlcqQfqlMzbHR4vAP9ucQvuckHx", "uX2VX9tTN0ASn8n2Wm1MMICU5LAp3AamDTsVuVCgcdNX78lZEH" };
    assertEquals(24519, activategame.findMaxScore(grid));
  }

  @Test
  public void case80() {
    String[] grid = { "0", "o", "0", "7", "5", "0", "6", "9", "8", "1", "9", "3", "a", "2", "2", "1", "2", "6", "8", "4", "4", "4", "7", "5", "6", "7", "1", "7", "2", "4", "3", "6" };
    assertEquals(150, activategame.findMaxScore(grid));
  }

  @Test
  public void case81() {
    String[] grid = { "x", "F", "V", "r", "Y", "z", "B", "C", "X", "T", "G", "g", "l", "K", "l", "4", "N", "M", "u", "9", "z", "X", "N", "d", "R", "3", "f", "D", "Q", "j", "Z", "6" };
    assertEquals(701, activategame.findMaxScore(grid));
  }

  @Test
  public void case82() {
    String[] grid = { "32", "67", "PZ", "97", "85", "76", "Nf", "7U", "e6", "t2", "PJ", "38", "96", "76", "27", "33", "3d", "q7", "46", "67", "l7", "57", "14", "3F", "68", "4x", "3T", "81", "U2", "06", "85", "J1" };
    assertEquals(1380, activategame.findMaxScore(grid));
  }

  @Test
  public void case83() {
    String[] grid = { "Hj", "YC", "2p", "47", "O3", "cE", "PG", "bF", "oF", "oC", "dB", "SZ", "ZT", "tM", "6m", "Ym", "ry", "eO", "fO", "rX", "3h", "Ws", "IG", "3N", "bl", "6P", "Eu", "re", "ay", "eG", "En", "i7" };
    assertEquals(1615, activategame.findMaxScore(grid));
  }

  @Test
  public void case84() {
    String[] grid = { "AF5T", "MFJR", "UXCO", "rXKW", "Q5SS", "EEXU", "FDyX", "SKtE", "NPDC", "TWzX", "sgXP", "YZNL", "2RLY", "KBFL", "XCLZ", "WUBH", "JWQs", "bUTO", "OOTE", "OWOU", "fSYV", "SXPg", "WkKU", "VRSE", "ZXST", "GMJO", "OKhT", "UQKJ", "VZdC", "CIQW", "JTTA", "VVJK" };
    assertEquals(2587, activategame.findMaxScore(grid));
  }

  @Test
  public void case85() {
    String[] grid = { "iwXM", "kgDV", "d9BC", "vtcG", "wVrw", "OCjY", "H6o0", "LsQq", "rtWV", "a3ux", "ZxSl", "pEkY", "HiBR", "SNGV", "p3aq", "Mon1", "EO4q", "fm9P", "eIv6", "eTZr", "YzHL", "ignx", "nnNi", "99vE", "EwtY", "ZZfQ", "SXe9", "aD6Z", "8UJf", "Hazh", "VMLr", "zHpr" };
    assertEquals(3435, activategame.findMaxScore(grid));
  }

  @Test
  public void case86() {
    String[] grid = { "BjPZAYHA", "KNRWBVZQ", "DAIVXb4U", "KrPFUbJS", "QsPaDAFF", "GCZXZBQL", "TUnGnFH6", "YEFBITYM", "XTpPZOrX", "MAIPFRFD", "DfCYVVXs", "Zr1BEJ6V", "KLJ6OEHG", "HDVKXPLF", "THYKLTBM", "MTNVVVNR", "TCZIKMSV", "FL0GWLSY", "iBEHZLUE", "GoJAIRAB", "GEMNCQJn", "HFLIXVIC", "OKMAVMmU", "HSR0ENCW", "YAAMNAO0", "KoL5UCBW", "OAWKFxDA", "XLTSCFPE", "XKA2ZJFL", "uGGZBMGZ", "FwvCNUYB", "lESKGQx3" };
    assertEquals(5394, activategame.findMaxScore(grid));
  }

  @Test
  public void case87() {
    String[] grid = { "LLKQ9kdU", "oKjvcjY7", "DRCpNHc4", "01mJicpa", "BA14wr0O", "45v9PHu9", "kB8F2jGY", "ybYu1BAu", "3hSNhnNQ", "ZNtNLYnF", "c6oAtT11", "7kPTRWo9", "kViBbvB8", "WvZEWU3E", "Qd6ATbyf", "dBFeCzin", "q1gi4YBF", "6OPyWxzZ", "HIULGLl7", "cBLW4HsL", "deGfkGJM", "0Tbxj6Iu", "3sYmMmGV", "b1gzEcNL", "m4ovZiBL", "WoddiGXO", "Ygndc32m", "GYkRkhQg", "p9Ii2eyN", "yYxU85u1", "U1alyDyz", "1b29DRVx" };
    assertEquals(7660, activategame.findMaxScore(grid));
  }

  @Test
  public void case88() {
    String[] grid = { "fwBspnm5qq8xtjzs", "egtmjpHghlnklovg", "wtjolzdixhixfxdq", "zfjsijoZbkbobssg", "tmtqfhLbwlfz8eha", "lomCbVkjnsepnn4m", "czfcagtdyCpectsa", "qeSsunn3thvnchnq", "ekisoyrqgvueljCe", "zooHrHjwpdznUfqy", "OyCmsiydothpKgNy", "rsrnhqrwrqwcsGoj", "ixqiSkyoceiisvzu", "upDmbibsrrn5ughH", "okdfmcNxpeEeo1nq", "ppApvimghdlswdck", "lgpsaxc8wqaDkuyx", "dkrtlLvAgaazjYpv", "dlsLuUmnygjiemse", "ynNkufzrefudqgcr", "rdugEFhkuzupnBml", "clcfzGryeylScfqq", "mooopmkytuawjibc", "nynnelsfnVotabQd", "wjRwllhxaXaqtujE", "ysmq1EdiheuppNog", "fb8mhomsfgeiylol", "ycxqjbkowjLukwwb", "yiRq9rwkznwuIaqw", "nrtvjyjyusyopqtk", "kzkrvdov6qvydkYg", "iffqBzvaoyxedfen" };
    assertEquals(8994, activategame.findMaxScore(grid));
  }

  @Test
  public void case89() {
    String[] grid = { "hprawCCvWjM1n7jJ", "4d3sCnGFMqznR0bx", "hkm3XEaozWWyAQum", "jit28ea3MJyIV0E8", "PpckJlpbVCaI5X8q", "i18tTyMLx5vvyAf7", "woLsXqlBqH2njyXR", "ksrCpYA2Ynihi3aJ", "XF2gYXKTtGIa0ax6", "JOq7iA4DqbmOv9l6", "CKzIltKPnHWwzdg9", "Lp7W0PwjIbLBarBu", "xQWCMmgGWuv46wPp", "9gGGC3xnBdzuuZA6", "EJQxJV6foZkhUJNp", "yvQmXsyDhhv3oCJI", "QSyPnimlWKnRws29", "yrqCYaRSq0N5YEQ3", "Vorx3zXNdWIfCFg8", "MUMspd2Wb6Nf4fxU", "JXS2jGaqNpXIbKvo", "d2o7EtwIBwqRbrfy", "vvoXWv5DhCPJMp6u", "PuOBkKz2fMcz4JKQ", "Wx4FQL6f8I55LQL0", "557bgIfh159M8Vax", "cGxlK40blT7N94ut", "QP2nWsXmrJYavKS2", "ng4SZrPRMBnaHvC2", "Wjmx7UtHRIT81lb9", "ycXuFiZaPkRfjZkM", "FPoFGXPHB7bTKIah" };
    assertEquals(15196, activategame.findMaxScore(grid));
  }

  @Test
  public void case90() {
    String[] grid = { "CVENIDAILOYFMQdUJW5vYIGKGZSKUFYN", "DLrKPVROCDGNONPXRG2OgRJJGNUNSGYE", "VNEYAMMHWICMX4W9RHTJDWGGSNFmZWzF", "XVMPNxYLXmrQI9LTYDWMmPT7LQkNXySX", "C0UFUgMICPLK2JXNVNLVZWSTDEHEBUQT", "OGAMHVOnMEP3XWJFQOGHCBDUVJKTaINR", "RAKPSkYBXKDJKTDWDWrQHKABNhXCGVNX", "WBtNUFDSTFNMWQFHUHSVCALVPBGEDCQW", "XVXYZYNOHTQBHRKJLGKFBQAEIUfLEJLO", "EUPd7EhgWFXOLGIQOEBSBSKIXCFVQIN0", "FMMLPPpDSWUFUTKMJZgUlQIXFAMNJsAH", "QSYeGFDNNUDAvGVNBYLCNFYSCSLURkJP", "ZJNuWJTHOZnRLoLUTP6XJVRWwCJKBK8O", "dWODaUF5aOLGApSOdGLDIRLaXYKRWMNN", "YJGYIS1LFUASZIJVGUWIIKeWQEWCmLNH", "LKXOCY4ILLIFHZPOSCBJOWVkUKGYJYRM", "FMTJPAQpfDJOkQMVHWXZLlFLRxMlGFCG", "YZDWCUUKEJTOOLQUSSWCPWUNCTVWsQUQ", "MGOSGLvNGSHPDQELYeEGE4WLRPUFFENB", "DYCTWEXZJQKXGTPWhKQOLDcLOFOMzIDN", "U7DZLMULUTkFWJ5TXINVUrJJTRGQH6RE", "UD0OSVWDDW7ZHISPBFXDYJrDGEREUAUR", "OYAFDLUFAGMSOZBWIfLcGTWDXzMF6RAU", "YNZBVuJM5RCNMb8SWKEVFXFJRNHQzGns", "oLPCMNRJOFBfLKFQFLS3AHDGOaEASMGW", "ZLPFCZJR3HLLRG8DEHVUORaSSgOOYECT", "r9UBQUQBLNVEAVFPI4DQCLSOUNFUFXJU", "JLECLTEEDAyXLCY9BQvAEUMBRSQHNYCY", "PCZALKFXLPGmZISDSQYJIBHHR0CFBPKW", "NUOzDFHWDTQVkR4VTLQPLY1gPVZESQGC", "JUKSTTPAuVWDVUOHCBOCPRMONIXROEXy", "TVFILNOPBWSYDMK9WQBVVPPINNKHHSsD" };
    assertEquals(21405, activategame.findMaxScore(grid));
  }

  @Test
  public void case91() {
    String[] grid = { "z1fGjgH1Wlrbg6p6qSTCrCT0IKP2xRn8", "WDVEIRZ2caODRiDAt5sY1xuVgUSfTwoc", "EL6KllWix1FMsL7GlSyoOprEWANuz3cK", "O7FXSIKSM2fY2FpcdorQbgRkQxYkZnBW", "aJaFmZ10n91vrJ67Pvv5S3SjbhYcRXUy", "smWAGGoyfrDyg9bvvoqlRRy2fB10KfQu", "A3Wp2iQy1TrDx8C7CsxF2ao6m35X2I5l", "rDpCsTUaQFweurOQcqp57ylHvYOdqmiN", "5GHbh3ZcUJ7DMODcLJhW54SIaWBisIyb", "A1sSHjZ41MG6R0qQsBz0NkNbrjv8uiTw", "7hsVIOgT5kWdvNWBZ1ZqqpYetbg1J7mp", "VhdUbCDlx6IwjwpUafSIuVFG4tpGHMm7", "SIXPgRjQU9ASetwQOONPjy6VuN5FKPjy", "krBzrcwQlImA2ZoDqux5wSZzG6avxR6L", "jFKS3hX10mvQjT7EuQwdF5si6xLxCs0q", "ROfqffbDaVdHt4JTEFYh0m30j28xhhNm", "CzAfvlM8HWQBMpJwy5fjISSaZniFHWdz", "OVvN7Ihzvh2qhL4jXTpFLTppiuqrR4pE", "fztoL799Bxyopz9cJJM9q4y1xBUlBSwm", "N25gRfOKzCo8oLNfKYjqnHhVCfTa31D3", "ozcvHT8jzDhGigkGxMJZwwpFWH77JcLM", "Bdk9rNu0RvAV1xulE2TSaiLr5vDkT9od", "ZJgz0K73ITsbK12feXTmrOz77W8iF3sb", "iJp1b1MU3KFF2L5YxW4HLU6Df62T3Gm6", "Kurf3Xa7SMfVhILPlITvTRtadPWpOjrB", "ICbJARpRHWqXbpFfxKyMsvQUTdH03cZT", "CZJZw47WasABKUiKBNZqmegOE6NKf8hm", "sGjPqtRnsST9lIC2yRPfRRfoyFZ5Equw", "hCUvfp6LUpEeFp6s2blq3jkR7iaSRqM2", "NXcEKOOQQComJB5Xdk3vQrovw8ujkVMc", "cA1gW1q2eNmvmlVHo5IXVIlkZ8i3hN0p", "jHXLi0hl60YqLiVpT1JFpwwpPsABPpxN" };
    assertEquals(32341, activategame.findMaxScore(grid));
  }

  @Test
  public void case92() {
    String[] grid = { "NvHbdlzceGmermiQqyXptfgKkYriwmfvhkgwhypbopCqlrFzen", "OngwYfgA9snwlvtlnouhgtnaVllahvjcguinjygntnbrjgjtma", "kduezdfgtxtujkcrjiuhfmstsszpujlrcygFShagjtjefjrghf", "Uwue0p5xvfkVmipxustlvtd6lkadvgztptqzkQnIxrmhjjdbmu", "dfhkpbjbuyaiYtwyalwcgNBntwxvx0viatzk9fzRrxfNQtOgwn", "gxi8YplPswjgopqhxnUyl2odtmfnHhvnhyeJfa0ebwbn3awvzp", "cwonioySmatnvluuhlGkgleAoeOcxhokiscfHhmijrjhFzurvw", "F0sfzhhacgxswxytXiaZeC0sraplynmmridrufavYqua0tilgz", "haDk7bfarvrnviwtxdblfc6MbNPoqmiuyEnnyxxatgeijpvq3v", "wfyoahridtkftdchmhbntxhiZimbzowkivnbvmkywdolAbewlt", "hdvmxorlsvuccXlkOh6lajZyrouTwidylzeyypcgmbcFlwtBuZ", "Vygpmynwmn8fmmxlsqmfgKz1mxwpxTdbkeppdfnkntFoKvFXqy", "ZgsppzTdrpAhRdhJvsqkhcagurMqIPdTajhxoljwffyGXnyoo4", "Vwj03riunpmDrxkqLzhBscd969kh5izuqP7etjarjtukGtfmnc", "hefrkzfqSpqrgqQcxmSxzYqLttuhmUdKqcHwtufuaukrKocwni", "mKoxpanoulcrnXopgltpercqgbwtgvabgTvzHhuwxujyayuqIm", "muivYis0byqpUqlkpwald7rnfeZsfAgdfnKhlqdqGrfombNeeb", "ejnx5f6gehnd0shbvgimltoaxzginpkssPctsaHyjzywjluohk", "oyayadlpgmap6BjfoomihoizxnqvktrqputycaayeHwrPqromq", "tpkzr2pEmualoQXunLapivoSlstjuGuliepjCgMwWhEiAuqvwh", "pXx1e8zuemhskqbKafErostZdaxrrNcnuewuzlZxfywxiEexte", "dK2b6ccqdkxpmyPmzolBgyjdwxirpMcaForntuqxHigyF8wwsj", "xjiUggqewpOlvbpdfq2t6neznEnfwrhyccmpGjmjbt7ga3Wbqk", "4uhmqbwdyuqligsiwdeumxIwzBaxALbKasbTakvbdneklnfrmd", "rgdaVwwkhujezba4jvfzzfdVEtrongjuxsqQgppfxhauulmisa", "rhBmwrpfowTxguFhVbo2bbtuKjsdzguKyijCsymgdfk8gSj5ws", "pwsgerbIepfbfsouhaozJhhTgnnElomYgdcoshoSjxlpet6svf", "tFmSeAkadIwi0amLvikmfBreYhffvpzxlzKvEtlXCznuqGdpsr", "dbCVqtoqcyFltcjjfdudrfbyizuqx6wrfjwhbdlilrtBwtrdoh", "Yowfrjnx5bralvoqyebqyponqlguFaiNjharkCczmHjZikmejg", "ccq13o6drnelhxqfqpfqlqrdik6symErjvhrd8ryu4dgbjuIhs", "skmcimbatlpmugEsFGosrh2pqflxmkngfewbXcdjdbhsmqhspm" };
    assertEquals(31032, activategame.findMaxScore(grid));
  }

  @Test
  public void case93() {
    String[] grid = { "91XItn1IBG80DolT0FRm7BH2BBugTJiENXV0AlPpJkNApQVIHL", "YryILwhBTBM0ClXrlAiHajkHMx1u5kQEaSa5wJKsBsZ6PZjyHY", "B7G7qiPEVdkoZOCdpYVsFjilagXciHmJuqAhjp78vvHTpBSvHJ", "ukScvfUPAftc0si0GwtiAi1yQwxjKmXojatz7HLLTjGf9dUulk", "y2woNEtiy4Xos63BJaQeee8HqXC6A4zWqEuJ3fSXNqXau7Yv5e", "GpMtCAUh7MCDQpa2t8rWUwQNCnirm3LltjhRMRy7AnI9jY5ZKU", "7UwMX25634a7Cwq1B0BdsKS20OEc8FQqa5KMBjQ4nMQVJz19B3", "7yZO8qCm8oZEe1DWcltfdVpnXSVNCOuQu58RmKEfDDznFCZD2y", "VRPlEp9J8Rm91lsh8PkH423NWfGycW2Ky0az6t8VAhJhRahRWy", "IuSVTXrrIMENvzDX1PIRHJH14VCxRQ8KWQvgfuv8ZIcMoSEo2k", "pseDvowImoEX61P2k0h3SO5h95biOSFn1SEVS64nadFLnUsOEl", "J3XpSWg5qgYOFbmixChg07Zc1xcLltNwoDkKzaKKiXg6c5H2r4", "rSWGMGqQvRcLtWHMQXJsLd1Osranf75iLPShTz80XVa4T9AaYc", "IhVhnwBrkQF7JFnp5ccZYCpXbacQ9KsnKcjONAQCjQ5jHg3gad", "1EoxTttpZRuiJUlIsqHd8myK5BUsoZ4B4WomIM9EMFihovmpOf", "8X30KUb2Sp30Bb3n1wjBCgDSoZLQvijFexsGwbliFuZEOhaBZ8", "Q6FEYJ8sTsgvmDb0OtNuxdWRkFFIXrY7GiOIH9sWuh0CNhgFnm", "gf9JpuUcUQ2jPHq3XRcFS41BmemQP5yFwntYT0LdC4ohqhOdS2", "NUvCBESulKiBZGrOlbOW7aJKw5e6kWBGIK1GAwm2V0GOvZh1vJ", "4tsjthPzjDFO2iJ8E9vdXvLO547E4u7ag8omU6bfN7ejRjZ8LD", "D5FBVv9w539GnDu9hmrCUfR54jCMD0KxoWivwZD2l2h8SYryFi", "hiNRjiZ3dHe86uWVuVvpQN2MulbBV8P206BZvOZ9lzOwTsF4Gy", "SvId0RCmM8MXIj0ZYemqiaZtTkLA5QdbwEbwNhReahrQtLXt5g", "VcexyWomrk0AHwPml6FSKzeUqmuqUzvVgvt2G5I4JVSu4m6PMK", "zq7SSyPSPIeNid5XjTUXIwuRlc8X8jeqa5EjTRN1frEctKCnId", "AHaXInjds8DOvmiTkuzA69fN7PXibssXQVmdT0QU2Hims83g10", "9eyVuTygELH4V1HgukGvI5AZKdwXd3Q2ON4fkb6AXc9SdatSGU", "LrVrdl3eIscWOfG38lT4gp9h7OG2kqALT78wQChVGSexgiSlh6", "tjTk0QdBPHeCMNW6gMfdVW4mbQiTp8Fh0w91KlFHVBYEK6OMo5", "sZUzDeBfSfhA0NejwByUMPQ2dIYn2IiFon9eIAi0m5XY5X3zPf", "1hVuhKp5psGjYEjjZvLPgNlCjIif17eEgm4r1RmtUlUcFzLceA", "eB9Hg9KSyVYdFZi9JJEmcEiEsMKO81ClHjTBqpv8r2VqtwBQ28" };
    assertEquals(50288, activategame.findMaxScore(grid));
  }

  @Test
  public void case94() {
    String[] grid = { "K", "n", "D", "D", "B", "U", "C", "J", "F", "q", "R", "P", "E", "F", "A", "O", "y", "V", "Q", "H", "Z", "J", "O", "I", "K", "Y", "J", "V", "1", "R", "l", "K", "M", "D", "V", "V", "B", "P", "I", "7", "B", "R", "N", "H", "G", "S", "Z", "I", "X", "G" };
    assertEquals(702, activategame.findMaxScore(grid));
  }

  @Test
  public void case95() {
    String[] grid = { "o", "3", "F", "8", "y", "f", "T", "3", "O", "2", "c", "J", "E", "W", "M", "8", "b", "w", "L", "o", "n", "t", "6", "s", "t", "3", "S", "x", "u", "o", "B", "u", "T", "x", "o", "q", "R", "6", "Q", "n", "6", "T", "7", "I", "g", "4", "m", "R", "c", "K" };
    assertEquals(1204, activategame.findMaxScore(grid));
  }

  @Test
  public void case96() {
    String[] grid = { "BS", "Ir", "JE", "TF", "VA", "CX", "dE", "8T", "SV", "YG", "UH", "VA", "zE", "HP", "DA", "DH", "IP", "XJ", "WC", "TG", "Gf", "TE", "TO", "S8", "cC", "EC", "PT", "Pq", "0T", "QE", "xU", "FI", "AH", "PU", "PM", "dm", "HX", "DF", "LU", "HZ", "SI", "QG", "oB", "K2", "GT", "l1", "CI", "Uh", "BN", "NV" };
    assertEquals(1991, activategame.findMaxScore(grid));
  }

  @Test
  public void case97() {
    String[] grid = { "rz", "8A", "u3", "Pq", "sX", "EB", "SZ", "SK", "uL", "rx", "qT", "WN", "Sf", "yH", "bt", "sI", "Nh", "Da", "zC", "KO", "yU", "jx", "s7", "G1", "qC", "ci", "cI", "aF", "lo", "GF", "NX", "N3", "E6", "fe", "wu", "yO", "sP", "Qj", "eP", "F6", "ya", "cG", "aV", "fb", "mk", "Xd", "iA", "YF", "y5", "Dw" };
    assertEquals(2312, activategame.findMaxScore(grid));
  }

  @Test
  public void case98() {
    String[] grid = { "3uM0", "3255", "512r", "8T63", "O494", "4t41", "3427", "0k06", "M686", "X158", "u363", "4554", "F44Z", "v265", "56k6", "F626", "IOx2", "5X18", "8167", "0K44", "73c3", "f49N", "9648", "5c01", "5420", "3585", "BN69", "9G8v", "11Z9", "4386", "7745", "t442", "vC23", "P906", "g14J", "9d23", "3609", "C790", "0706", "81YU", "633Z", "4116", "858u", "d0i0", "9TI7", "2095", "329p", "0mM5", "X98D", "44A1" };
    assertEquals(4673, activategame.findMaxScore(grid));
  }

  @Test
  public void case99() {
    String[] grid = { "t04z", "WYvf", "Nz0W", "UdZ3", "rypV", "DEV7", "P03z", "03QL", "4L3d", "kpw4", "vmfV", "cZdT", "T8TB", "hJgG", "gHhA", "lzzp", "JEX1", "9pS2", "LI3U", "xWLG", "Px48", "1qzZ", "hYPO", "w3AH", "txT9", "Zkvs", "qMc8", "Qzjv", "sN0Z", "GVme", "3UbW", "SzOT", "EDSN", "nHWQ", "uwOl", "qY5j", "9P46", "14bj", "ZpDh", "INjy", "gwGc", "iIgu", "fPkQ", "zrUf", "yV0W", "Iobn", "FkL7", "j59u", "ZHt4", "abJX" };
    assertEquals(6462, activategame.findMaxScore(grid));
  }

  @Test
  public void case100() {
    String[] grid = { "59308100", "35319810", "81SmX826", "K41J1l12", "04x9192I", "19788935", "60819041", "35682731", "9W4U31h9", "63231682", "2985bir5", "2Vf73Q4f", "602pi149", "492F4695", "91032P32", "437n9569", "D6c57305", "89t73559", "DgF70818", "5d64209A", "94R2901W", "54294R64", "59412542", "59e46161", "6L912082", "77854RI3", "81675269", "94338Ycd", "92232456", "4852r627", "kI715831", "0A425595", "257665I8", "t7557684", "90v1Y28M", "2480x079", "921y911A", "823233c4", "ubQc21I9", "fN5564b2", "64WI1C42", "9929224Y", "26304015", "M3Y875Uq", "78224614", "e0054248", "501L5g1i", "6k060961", "68039012", "50752960" };
    assertEquals(8247, activategame.findMaxScore(grid));
  }

  @Test
  public void case101() {
    String[] grid = { "f27Co2a3", "1vsvNVOu", "b4dLJgZM", "AjzeYsgf", "W5yl4C8C", "vkn8oZdN", "c2NnEl7C", "OEbF12Su", "N6wgUugO", "FW4i5Pw2", "goW99Bdi", "qduSctA8", "jOVIuz4i", "edlxPQdV", "wnxuAvoD", "2H3hVsgg", "MuEbuYfw", "gE3y1GZv", "VgrYolok", "bMUnKAXS", "NmxkC8cr", "aFVJkKII", "hiZiDGi1", "7c3QhBSR", "QJnTdGyR", "Efb2ldxU", "aMoiTifH", "0aWvbAZw", "FonNE5zt", "gTY8jwdM", "y2UtRgHe", "iWpjgRXv", "T8hAV2jl", "n5WLxSgu", "GlFTjVfU", "gLRQkvBq", "WOar6wut", "HQ8RpLny", "G3klzSKp", "2WxmkUvF", "AfGchL0I", "gcBsnqZk", "s2Wfy0Eh", "4IIbfaqC", "SOSQFgZN", "pIhgvPa7", "L7x8MVgY", "Bs7Tb9Pw", "iSJZ3iKU", "Ps98ShMB" };
    assertEquals(12548, activategame.findMaxScore(grid));
  }

  @Test
  public void case102() {
    String[] grid = { "mpngiMakpvoyoihl", "wgRprbsxxvmucN0k", "xrtmggwfgpyflsff", "erxsazuFwjnxcew4", "qmkxegkbyEjlytyf", "dm1vtkzdjrvAmDgc", "mwuihqmcpusMrdkz", "uaoh4nwiLpalhbay", "djujr4bS5lqnWjdn", "vfwKv6dm4oedrbsv", "xouwwgiaFszkTskf", "qNdrlrkfwyyoq5gz", "dwgazczxkMtvfGop", "ypmklxlilhbpZnas", "izgdxiuhmdvzuati", "8ccvjecggitotgsx", "ww2iiHkVpnwDlskm", "r6jbllvxgguzkulJ", "zweuffsccpsplmzm", "wxvvqkvpfznecsm8", "bxxdxkrkq3rdoqyn", "yqhwsMsrsvhhur3O", "zxxlitgzvjsgWodd", "qswokQBakdyyxxWq", "uodzwbqvl3nlbqeS", "ebabdnzqdkNohmij", "jnrqtwurbtygwXjv", "lrxjfmyjXakxihct", "sdliOkgmu3B1wvji", "btiXmsggcgteVfQV", "fqvdkgnieqghjsSz", "qamyhJwmvwmkpgef", "nlhiRfnezqnxupsW", "pgfibgkjPizlqipp", "ghBlojukmgrF8psj", "nnxE6sStoygrJekw", "NueglqracPvjjahM", "eiBsqvalzsuygv7d", "dgibsdzcjHzqfjjk", "xekwEtkdQY5lbdaw", "ohuesliolebzdf1l", "sjyhcnkox5xfbQwJ", "Awqp2yyefF6yhryi", "rbroffhbGFlazfhs", "Ciwjnquxcrsjfmii", "f1sgiblCxswbpxqj", "ypatvKpviuonfprj", "rcgwmbvhszubdukm", "mkydqjPxryxxpOzf", "TgzBmxmrqxq8kalk" };
    assertEquals(14578, activategame.findMaxScore(grid));
  }

  @Test
  public void case103() {
    String[] grid = { "aUGMKzjIUqjeo0tl", "k8sTxaZrBKqYXlXl", "f6duB1mZRPxhSTPL", "VzsC4g0M5PKM5Ipm", "cM9adHWQeCfJvHrm", "kIW6oBJ8WYT2sTOq", "1xajLB1qEVgNhMqP", "0Moqgq6WyBcmn9Xj", "8Hz9FHqUh0rYNPLU", "TBqYbRjCii69O7wf", "t9eb0OjXFdgvqYJm", "RGGqlpq5XL53snpt", "nZAH5D8Mn6fXEctp", "J9U8H0nOiRbXIori", "FnHeqOI7mS0ChppS", "kgTMitQK1464EYIY", "z99AHOb95hIvJol3", "RryPYWTUjvwj6R9N", "QPDQR1YEqiFYENRJ", "vInsKzSNLZMT3b4C", "DZpP1JVnJybCoeoL", "WkUEkgvUXoKhcqvh", "4Wj8YCC6iJbNxBHs", "KxhFDVkMqOoIuur5", "e2gaLIuCRfG6jiUb", "YSFsiicZCogeubAr", "7QM16wleE5MscwnQ", "DqTO73MyZZrywbyc", "K3pCpOLMiU5vRpTi", "FrNgaHBBq5bLCzfh", "2XO5PnF5WwSEbY0r", "vlR7Ea1ILjcCvhS5", "RyJpHOlZ7Sr5HDEf", "0CzV0MGuKTnIAaw3", "ArXKx7lnlwGfdb15", "Y01vnf54bfDmZ15D", "YlUzCK697G5obkGs", "cgUX6F66dT0bzqNK", "NawBRVlGjI9Xk6wO", "TnZaJ2PdxxyxPrGo", "KrmmUUEpm84dv2L7", "Jr4K0IhBHZWx1XD5", "XkwzCdpJx4Y9jWro", "kbB4ovftOHq66ili", "z7JgyQS9EOH415W9", "hZ1jw2pvlhkRbDS4", "BiLKWEz5qh5w97Vp", "DTsSgnHWgt2hC44r", "BVs3hnS2z15Mn5YI", "n1wYbtrv0axvX67V" };
    assertEquals(25096, activategame.findMaxScore(grid));
  }

  @Test
  public void case104() {
    String[] grid = { "DVHMEWBKC2PBAP2CcFJIFJnESGwUHJRC", "BSLPAIrZDZBSIIWHPGMUBEVINRCPTSGI", "2QAMNFVEQPXIzSSPA40NIYQVREX6HPSq", "CZWYGQKMYBMDJ3AHAAYECLZSDYER3XFU", "RZ3PeC1XXNOZH1RRnVPJNKDKHPAKVQUF", "IBYPvkOQbTILWFCRpBWCKGWFDCdF9IEK", "KSUHbSRHFRVAITMeYxLBGRLN9ABQTJKE", "RAHMeWZYMPPUbQkaHUEYNDGZNXzDAaOK", "VNOUPdJJAdAVYZFGXgYBNHRYLLS9UE6J", "JIJBHZDWOIYQSSET0ZYfZMKIovIMVDVG", "GYWYABNLOOUwXRBDJZaYMUJnKvPpMYBX", "MBHXFCWLCDTbFSF8FBiyCL6IOIOIWKNX", "VZ2rHWlOKS9TXVEJyCZOTEAYRP2y7GM0", "AjHFYJIJOWPFYISUKGRHYKJRJL9YEBKK", "MELKIFZUSXCGAHKQTEXhWVKRCNTVOCZ2", "DACDWVZJREoABLXQOXUPPGV5DAJK1R4L", "5GGH8KELDVFFSLVREVYhMZIQPtAuRLTP", "FUIHSBhNYSTSWNSINATXjGZKK4IPWYKT", "UYVRQINYNoFWXVHYSUA5QQIJAZHCBNTH", "kTZBYZM8J2SFLQjQgAOVQCFWEPQSB2EP", "fMTSYPsF8PBCDLoUHPBXUSvOQSA5MFHC", "CB9LPO6PLDc9XSX2ZJTWUoSTAVPHDILL", "OEZWBVBJuQBWKDGJLRTKQWTVSHfJYPGS", "BMJNBLHQTOZYHpFTFGLDJKILOGFRLA3X", "FOLhSKOSrEWaDHHDBKRM0GLYCC0BXWZE", "XCZO2MXWFFXOZ7ZIRZJYTFNYhAMLfTAB", "EAwTXtDRJHUWKLK6LQPHCXjNCZJNUHSU", "WzUTZkoJpELDLOPXPTBCSWMYXNqRYLYY", "HKPWzIUCZDWMYWVOCGC3WrAPEQEYXWQh", "mXQOYIGWDXPfRYZNErJaZJPVEXVYVKYV", "WKAOJEPAVUAQDHNOQEWZGexPHOCMJEOx", "LADPIaHVUNAkl9WPaPFEOYPPGFXUUHOE", "XWUJBRMVSAPMTqYWWTJNYCgDKOKJGDgS", "VYvsFHXXf1A0DDTTKmQNoz8YJRWOSmFP", "UEezuLJA4IAMMFYDYPJGHbO3HIUKYAZI", "YPAH1EOCMTXINEWKUEPiJOV2tIKQUcTE", "HEUKLUanPKHAKYJJRBCSANVTPw6FOVMP", "GVTIAHILmQWEPKXLJAKBTDIFJWDvQTIY", "OWXS0PPLLjLCPTJIZ7IBBUYtXCALKVNF", "NAkQrjPICPH9MLUUJWTnKPUDTZTCZVSE", "9MOWKWGCETUADUKOHqTNQODZBhMS9NKW", "HQGyOVZIKSTNPPuXJDkDCNBakFWRMVLI", "OSDCJWFPeGhPKpQFDSPZLLNVRKWUPxDH", "YJJYWf6LIEmKQUWQFnEDb3X4AmUH1RYA", "nSHHOFKEQIIQSOFOAIIFYBFJHFUASMX6", "WjRIJCMICwVOJYKCiNSKhXXlB6FFxQDS", "EOPHZxBGUPEJ1NHhWEZCRADRUEuATVPA", "FCWKP1XBXKCFUJ2GEDUXQ7TSDHnVEuTR", "HKVG1YGFDSmGZMBBQJAm93ATVRuTSUPT", "PEZFTiDRITMNBZEMMICGCFAZMONEXBQG" };
    assertEquals(36377, activategame.findMaxScore(grid));
  }

  @Test
  public void case105() {
    String[] grid = { "usoAydUxxcRMK8oClfNTY6j5svE9nwUx", "oEDVYRdsrnk4cZJgILr2WXRmy1Alaoj8", "8zvoO3EK3VaPQgbPFkWKfukH4jozp5ti", "cmFPyp05tMdfO8TxsPZ5R8e6CIgpSiXT", "7wOwxw3kN7YmEOpmqMt1tf4eSj4RIHQp", "5Iu7r31phVcA6XJl03ZoIbNTBXpjpvAv", "MXRGeDzsGpiNQkRcJMjsZpOv8M2xgWar", "ZsmBdrQJpAUFOCcgCiXjuPsCo7rcTgt6", "CKyg6EpAUdSQiC9xUM81Nm1XR9klgclC", "5BLQNXh6dPLisy1EiBdZksNSBLAWEzC8", "Vyvt95sTqdMsdJCn5YQtf9tROEOOFB3u", "fUW7MLoOeqn4kWEDINOIaQI3EfjHK8Rd", "fewbEfsOVOJQquQq7M8NTC8IZL4HHZHn", "bRmXwgZtPqFOrcPtSU2EarQgFFjQ4ubf", "Toh7x7N1R9LsCpIC7Vrb1Rjf8cUwOuVJ", "NILb959Qw6M45u1k1OWDNVxTuow1FlVU", "SWA8CZIsqa9sIPMHTQT9HHXvNYq2JXDo", "JZaO2Cawbv4dghruC2PLIgW2NvFDUI3z", "016sQRCj3voRjgUC5dXUIJQaIgrfp01R", "VrKaO2ChmTHiLd36nUJURbW6rQchPiTU", "NuEXu2d1sBMOmycB3YhtELtgTyyryvXr", "wzxgjIkdRk477J5XMvsFVDDcA1jTO7tj", "4tml1vpfz5NhXIY7RQhwiq4y6BxBDzB6", "sDfUFOP7MBOMA00FA83UiiTa6TuzUT3t", "QQywa2rXCndY25QnngbAcYF0kj22QzSc", "U8m9LGXypIjBHX35JnjeGaSaC3nIZ8bf", "pMp8YbbOvE5QKF9PIoPRdzvpSYQdbBqc", "ePDLcwhORueFJhEhYwiY2WrzxPuY848N", "j6e98HoLsiE4uOZdeHXRk05eGyyTP4GU", "aIxkQH6tVVrNcn35MEMgvydutl0eabsy", "RY9cG5XYUZVCSydZZRsNmS9HAJYDLxhR", "AxOBPSuQblA3orJ8n6Qsxf5hjWR7Fdp8", "4gwePD5T38aambTSUQ0EqwdQxvIEbo7O", "EkX9wrJusM4ijUpJJUeFiY9BbIiwZFyX", "e7YRzRJcmqVd3hTP2j1ELu0Tk7zY3fmj", "ikbLvxVHku2zKrvY5UzHJVPMZwJAJMEH", "TUQzayykudrqSBP4JJIhXEznVvaSBsrC", "byYtc3n35xQcesjHpEAe1ycYnrUcb0Je", "QfKZBH1YVHIJXJZ48hsMj46ZEVLmhaZi", "He45H98lQcaL19K1rtQAA6awFQKvtDzI", "Cw347AM4jhzSeXv2xoXEo59isQ0GNcUA", "3ptDmdw9ovTAarzf9WGR60QB3OYRXCf4", "1onqIejNE8WiimIWAN84YMrs7Xcn6cmw", "7OUWjoCgjfagqucZLoBrwsC2UI1WFeuq", "zc2xDph4BEcG6HIu8T73DZZ3aMpGq1LS", "Brmvr4cLptSAjhp5LPqpvq6WQD77tpQG", "zAd2QD9ADvgYgySFMUoQFi1MQwuDdLMd", "pyzalpmWNrCaBVD8mDb7v9cegpGwWrC1", "4WHlDb3OXDrocde9QL6o9w39F70ZIkOi", "F90WnjTRgdRjkR7tzPGGaxuvMasyWNOk" };
    assertEquals(49889, activategame.findMaxScore(grid));
  }

  @Test
  public void case106() {
    String[] grid = { "EYFXY3aIISZRJIEPqDYScBVGQXYASEQRCFWFYGKIhUXHFJGKFG", "SVBXTRHNBrFDNCA0GGFNGKLwrgTVgYTCJC1IAFKAfULH4UZCCQ", "KAAAMJZKKxpyEEZWwVBQGABqVwEXNNVAOKDHeBKTMWPUJFCJSG", "KPTWABFHYJO7TElG3PSYLWFARKXHNkQPNNtPSRJWT1XRkELMPM", "XXWUMOCIZILTHIZADXJEDXWSRG7WXSLRdOwTAkOGV9OQPZz8GE", "t1VSTSICDWNXJVMzNLBiHCZFNGCkDISLHPBBDHSOSKKXJMFWBD", "PjSPKAYODSnEjt6OMUUSGCGDV7JJXJzMDmHvEW7GNVGpWERTQW", "0QVKKFJKXGKMQKODNnS2dIWQBELAGAYTU5LIZBVAWTXS4PQOD5", "AIHVTFQsASNLMgVBS6XCCFsFGTPQJXGREHS8EWHYTHpSKQLZJK", "yAOA7XPEKRWIPVYYKBPJZTSJUXgJLQPTNRMYEYOZOWCFJTYOBU", "JMNWHV5KYR7UoPWCHNWBVKZBTVFFSqRNDTLBZVYQuJRfMEPjNZ", "PZSNZOFuvSDxJQRRBQNHrFTBMCuJEIGRQdQ2DVPEJAjOARVMAU", "HOSHBQpKFDVVLOWHVHIBLOC2FHIZYMRZLBJFWHYVVSCWKQNMTX", "SJQHUUFGEAvGGEC6CoBPZJEXQHZTXiJIxVBXcGVIUQUbbUGvOU", "HVSFJUOtKIODoLYPEEPU3TOWRBrLMLVGAUNSFTsOHUDSUHKWPR", "jQXCXREDDrJXEJHtOEMAEPMFDGYSZfVLUODCoJdOVNXXOGPSqB", "SLzPQTObECRIBALnMFWEIGJHYZ3QILBOIIZYFhHCORJ5UMETUJ", "XXMp4wNwTOAVJGVGzCOWPPZUKPZCVFCJBLXBSVBHUAHUBZZBYL", "IGMEWIQIDFOJYYQOZPYjGOBVaHaBYTYYTNMYARUVdBLtGMTYDU", "ZJ4TPPIVYZFb3OHAvMHAQRZLUTCZPCM2LKBLTBNOLCXASWNYAT", "RCsyPBYNqYONIOoHWTFTOEuUOKQwL3WOYBjCEtLDKYP3NDVs8H", "HPNDiNCAPGhXNEBxEQdOA4TJACgh1FONUGWCTS6IT7LVUW9BPB", "QvOQPVDXUSUVGVYp1EQQRSLJTYSAGZG9XLBONSATHSCYENOVeK", "BXFrUNVETLU9YOhDTAGZVMNASFRHEMJWoZSCUZEDXNEVCHPIBU", "CzSvBDFJNFImF6UHXQFIWMAUFpMBJZUEPLMUuFFQNSMZKHYYRN", "UFOSDfDTEE5KACZXPJUNSYCTAIAJZkKPXJPNHNTUrGYKZELvPH", "GnBM2UQYGtvtQW5JFTIEPEUYTVRJGSPVGRPIPZVLLSuGMFLUSX", "NZVGEPOLRPWJKJKPGNKZVAVKIATPsWrTPUZWUBTN8LAKWFVDUK", "Wt7F3RqHXMHYYUUfHOJY3SnBfVMUEJiIVDEG6AHBCPDNTHMRXS", "mDK2MXBZ4RXQzSH2UvOBTDLGRXOIDpkUVCRHrLK0OZCQLNVWRC", "ZIYqVNDwNJEKOGDUBQJJCTmFBQSWRNZJTLPAWNTBEPSPlPCGSS", "0HQRsIMONDMCHtLkxHQBCQoHJFWpCVOBBSvAIPPENSTAKWA1Yy", "UQTLjYoHEXA6CCLWDALWHIAQFFXI0TBYBWGIMTVZXUNEzRWEVQ", "7OEWCNbVKYGYCDR5VNCRKKMSDULOWYCFkVEcAIOVJXUBzBNNTQ", "NHFQLJWsIIqYSJFDuJNWJIPbSBTPNDW2XXQVYZFMJuIC3EvPRL", "VZkGAROQVWJCVTLBDSGHBFVNA6JdOCPUYPZLTOKSZOSOTQFKRM", "MCAMMEEOXGFKALNXBEQAg8TXVYUKDFAVdEOBmI6NIjEDZRvZUS", "NVXSlMAEYDHCPQLAgKSY2LUUTSPkCOTNeVDmDkPMGPZNWPOJPS", "JELT0LISWJGHXXDZUYf3XHBWDPJCGBNBJzTZRKTFYFGNCFGeLA", "UvNYPjUNCW8MIIQFBXDCMVEAFNSGCKB2MLLYEHYXVWLMPMRKGD", "WUAz32JKWG1MOxNYZXDRGRIHtERX9TKN7EVYNTUVXDQEZDCSKJ", "P5B6ACSXEVsLNJOWTUDC7sPO0AVNMzDmWZZVPALMAFOkGKXH1U", "VEJPYYFZMETCUPCM0SYCXZIKCQA8MRSQVZ0FHfNOCWXOJNQUFB", "ZMYQNQCyFWDLOAKGGAOdAULDTNXYGIMN6TTQr7LNR0CECjLRGP", "J5BLSOOJNMYXFHVPGRLGIXEMEQAMWO3HSyRVGZMXXSGVCRESZI", "ROWF3YNbANFBxgJ0N4zLUIZXKYZXLR6hRLKPXYUMEMLQEEC9HH", "UDYMUjGuAIJVDAGHJZZKN8GAntXCAYRLhYYHXvzSCDWIMJD7Kq", "TTKZCMaXPtwOKKQNJUIYEJHkVL2SUkPtNNPnXWJG6JUPU7PZSO", "RtJhWhKUVVZGYSSDQLTENzCUqIG2EZ8TZVQXETDvVLVBAP4D3L", "kDjCYMTFAPPbVJVNOQzOSXZILQKMEZFC7ANTLGZOYIXHVXNNCM" };
    assertEquals(54902, activategame.findMaxScore(grid));
  }

  @Test
  public void case107() {
    String[] grid = { "z49HlcZx2CRhLQ1zEPTkhDN8Oi5s3xInaTKOhspO5qgT2iB1a2", "OsE4KaRvYwizxv1L5pWzgPIRDcvDRJS40z3wr9j09QstYLkNXR", "gMUEYrsNAnuJPto4TP0fgZyJ8weAVxUBc0iz4C6MABhndeemyV", "blA7V3nc78pSQ23gVCYFIgO5AasbySVsLajpnFJy1S36uAbdVa", "MQOmvdOZIALAfFGF9diZ9Oq1kpULRHshnfIIlxZqh35pMTmzAT", "WUxQS2VTuXMbLkMkzvvJHjd8zPIIQng6TjNCvGewrc8JcVg0TR", "x77jJeBmehimZTuFLiZYN9jtxB90J1s23DtOiERtqoSwRMwpcb", "9bt0Yi6EDFU3Wb3pBXxAqJkvREBA1vk9iQHgBcQXIm4FgyYcTH", "MDC80I8ic3RWlhqidsfdgB0MlLLnKQkHCh8gRf7OjRgaUi15oY", "grNrMmYJxUdTrsMSwalskfMufK60ayRaOTjTilTfyoeZoaIG6s", "loluboHctrzkoIreGxrdPX6DyYpO4l3HEFmDjRPxwFYgwKWwdC", "dH6PgWTKKEfVT2zAAy7B6QGuavYd1T9s6kPju7srgdMRq4M6Sq", "iIrHTj7WCuauc7JnLEyZRKXNVVQuxf89Ibt909LKDnGZ1bOpU2", "1pd2jVHS6VWhkUXmdkOeHnivfvJYBeV3ke1PXWJNx4zxvEPx0R", "5n309WihUorpJDflNgwUVGhAu0l4ikwS32wCU6Hu3xiiT8k7YD", "kGmrOLGQ2F4Pf0Tjsq2l2RC6CudiYvtmbmNiWeCiRa3UYseubr", "8ROB6VwpHLVTDx0letghbOI6jXTnDVGUzhNZiu9821LKKRhNSZ", "LadW3daFsYCEZSlBAN6rLC9xmvAE6z6idFymR4D8stbScDKcHg", "Lwa0Czp7mrBo0KK2rWNXrSz5inuIcTQd2bLLiOZ7JRZbT2MC7E", "vYXLcyO6EtlkaXBq0zEnZuNaB9fkAHJ6hUN5Fa5G2Zzz5jDZZp", "qc4JbLPhi8M7oyXUkuAaTjy8U4RCbaO0xHhqmfBiWiKgcrXk04", "on1Tcv6HzfPYaR65Y4OhZIi9hrFLeM7LnyDV4v9bFA4XTervRJ", "uG4OaRq5MdpbzTDAWyhMcBlYSrNbB1qxhY5BA0D3sE8dtf3hZ6", "CL83Il8Mluj2wxteMoL3CiBv7hbnXto0n60oa8JwydvoPSUKxK", "CQXI4nb5dkT38OWM6qqLXkybNhkajogwh9wfC2eBQ1gVIMNvTl", "4b71t04NQxRItN5y1SvncxZJPs1eXg3JsRnzA1PsAGfUJrzD4z", "rRETi7azXG5i0yPhu3fmn6YfwgJzthZjzecqBj9dOMn6OHHs1J", "QXBykVggd6Ih07uh4avg2PpiBtgmXmAXmTHqOUZuvbXn90NqZU", "KNlntFDXQeNycLT9vhSYEdYe2ChvXhQaKGsQbVoRgkJ6Sj3T6A", "miENEXZ05Gsz5jH4DcFNWJr4E1wT53J9kFRLxOBp76caIVYtmZ", "x8jtWMcqyXNoSIel8Mi1N3FlAzjmCjxclSeC58pSk62ocnUAcE", "Dzg8s0pWyHVpkqzHoBpM60D0Og4arJNPPIPasdXAGQlXMFHQbv", "BFtqd4Bz4seA8oMtAA1BtpwWA2Ix6IZhzE0hih4yY3AsO2oDhI", "iN8vur18QB9Rh3r30IxhnihA5IpHeJTLNvyA4YI8aYbYDhyvCU", "xSO5FHFd0kSCBQiQm0hZXivMqTHbpySxmtIw0Nxkx50lLrs25g", "PKLM187yHGL82l2D1pUKjX1Mnh0WfOHtmbj6eIU5o2x5guy4dT", "EMnvNjRw37YSbrd2ZeWGYKHJRD0ekDpmKyYSJMktq8LXqzKQTt", "MIQTy33n3kckIVpyD38RNek44QgVpQm2fY46vZGjw24fWZwHOY", "gXPK5lGgxHd8S39fDw8RZQT7FaRfcOcAQ0AdoNHy0JjrD16HtX", "FIqLUng1S8J3Oq19gxsa5umvmTzO47tmPoCcGa1QtQFxxrUHJq", "l45Ti9BkhckeumZYsh9JCQGQeJBG5wjnI1OBUUpk6n1OODzjsU", "5vDjFSM0ZbAIY6wTbXjcHJwnzHG7z2pX3M7K5sZ57ZmVi7P0rl", "Y2WekbgFPh4wgFYs4MMjG8D9mxmIZ2HCV9JHT7cwnMdqb77UsD", "4wSIygtvno04Qd5PeNRoj7XWLFzT24cJqlOdeVvrCuBw5wk29X", "5FkQ8GwXrm7PDylQUtlJhBr1Gh3svpkRzqm0UAQH7k8EBQXSPc", "SlwSgST6AXU9CvABP1fmLDxZBsQSo1nuFmqk67zzWwiG0B3sXP", "AShLqpWe77X8Fjmt7DyCIg9Bkv278dNLi8yM9ylXAFslm5WQgB", "hw7AAHIOkQGUNkIggfNPkCRLj4YyfamH0HFOsjvTAhdxDWAycU", "8WPLyhZU8SmEWv4k2GjWOczgyro3HqHjc2vTaf6Qc8jvsNoQ3f", "1F6jEM6SWacXLNFaRzINKwJKmYkWTUhvKvRuibxYYhfjQqVeik" };
    assertEquals(79039, activategame.findMaxScore(grid));
  }

  @Test
  public void case108() {
    String[] grid = { "00000000000000000000000000000000000000000000000000", "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ", "00000000000000000000000000000000000000000000000000", "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ", "00000000000000000000000000000000000000000000000000", "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ", "00000000000000000000000000000000000000000000000000", "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ", "00000000000000000000000000000000000000000000000000", "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ", "00000000000000000000000000000000000000000000000000", "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ", "00000000000000000000000000000000000000000000000000", "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ", "00000000000000000000000000000000000000000000000000", "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ", "00000000000000000000000000000000000000000000000000", "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ", "00000000000000000000000000000000000000000000000000", "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ", "00000000000000000000000000000000000000000000000000", "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ", "00000000000000000000000000000000000000000000000000", "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ", "00000000000000000000000000000000000000000000000000", "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ", "00000000000000000000000000000000000000000000000000", "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ", "00000000000000000000000000000000000000000000000000", "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ", "00000000000000000000000000000000000000000000000000", "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ", "00000000000000000000000000000000000000000000000000", "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ", "00000000000000000000000000000000000000000000000000", "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ", "00000000000000000000000000000000000000000000000000", "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ", "00000000000000000000000000000000000000000000000000", "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ", "00000000000000000000000000000000000000000000000000", "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ", "00000000000000000000000000000000000000000000000000", "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ", "00000000000000000000000000000000000000000000000000", "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ", "00000000000000000000000000000000000000000000000000", "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ", "00000000000000000000000000000000000000000000000000", "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ" };
    assertEquals(149450, activategame.findMaxScore(grid));
  }

  @Test
  public void case109() {
    String[] grid = { "05", "aB" };
    assertEquals(69, activategame.findMaxScore(grid));
  }

  @Test
  public void case110() {
    String[] grid = { "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "11111111111111111111111111111111111111111111111111", "11111111111111111111111111111111111111111111111111", "11111111111111111111111111111111111111111111111111", "11111111111111111111111111111111111111111111111111", "11111111111111111111111111111111111111111111111111", "11111111111111111111111111111111111111111111111111" };
    assertEquals(1750, activategame.findMaxScore(grid));
  }

  @Test
  public void case111() {
    String[] grid = { "05adrgGFFSGRadffdf999Radffd45fG5adffdfdfGRadffdDFR", "05adrgGFFFGHJdff3f999Radffd45fAAadffdfdfGRaFRRdDFR" };
    assertEquals(1198, activategame.findMaxScore(grid));
  }

  @Test
  public void case112() {
    String[] grid = { "05aBgBgG8ttiTu787lhof", "051sf2a3t4awWHSHKlTSb", "05aBgBgG8ttiTu78STRo8", "05aBgBgG8wetysw4KlTo6", "05aBgBgG8t3y434yKlTo5", "05a8TRSWG12h2tAS5g22y", "0saBgBgG8ttiTu78KlTog", "d25BgBgG8aYTTuYeE6Toe", "gh12s44y1sh1fhw4srTTT", "qwerty456xcfvgbhn10fg", "051sf2a3t4awWHSHKlTSb" };
    assertEquals(6122, activategame.findMaxScore(grid));
  }

  @Test
  public void case113() {
    String[] grid = { "123", "456", "789", "ABC" };
    assertEquals(107, activategame.findMaxScore(grid));
  }

  @Test
  public void case114() {
    String[] grid = { "John", "Brus", "Gogo" };
    assertEquals(118, activategame.findMaxScore(grid));
  }

  @Test
  public void case115() {
    String[] grid = { "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a", "123456789a123456789a123456789a123456789a123456789a" };
    assertEquals(4050, activategame.findMaxScore(grid));
  }

  @Test
  public void case116() {
    String[] grid = { "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM", "0123456789abcdefghijklmnoprstqvzyABCDEFGHIJKLM" };
    assertEquals(2632, activategame.findMaxScore(grid));
  }

  @Test
  public void case117() {
    String[] grid = { "dantu", "posua", "letit" };
    assertEquals(168, activategame.findMaxScore(grid));
  }

  @Test
  public void case118() {
    String[] grid = { "093", "929", "A97", "919" };
    assertEquals(137, activategame.findMaxScore(grid));
  }

  @Test
  public void case119() {
    String[] grid = { "John", "0000", "aaaa" };
    assertEquals(183, activategame.findMaxScore(grid));
  }

  @Test
  public void case120() {
    String[] grid = { "0A1a1E5Tae", "0A1a1E5Tae", "0A1a1E5Tae", "0A1a1E5Tae", "0A1a1E5Tae", "0A1a1E5Tae", "0A1a1E5Tae", "0A1a1E5Tae", "0A1a1E5Tae", "0A1a1E5Tae" };
    assertEquals(2620, activategame.findMaxScore(grid));
  }

  @Test
  public void case121() {
    String[] grid = { "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" };
    assertEquals(0, activategame.findMaxScore(grid));
  }

  @Test
  public void case122() {
    String[] grid = { "JoHn", "bRuS", "Go0o" };
    assertEquals(324, activategame.findMaxScore(grid));
  }

  @Test
  public void case123() {
    String[] grid = { "CDEFGHIiJKLMNOPPNIJLKABDCFGHPD", "CDEFGHIiJKLMNOPPNIJLKABDCFGHPD", "abEFGHIiJKLMNOPPNIJLKABDCFGHPd", "CDEFGHIiJKLMNOPPNIJLKABDCFGHPD", "xyEFGHIiJKLMNOPPNIJLKABDCFGHPD", "CDEFGHIiJKLMNOPPNIJLKABDCFGHPD", "CDEFGHIiJKLMNOPPNIJLKABDCFGHPD", "abEFGHIiJKLMNOPPNIJLKABDCFGHPd", "CDEFGHIiJKLMNOPPNIJLKAB01FGHPD", "xyEFGHIiJKLMNOPPNIJLKABDCFGHPD", "CDEFGHIiJKLMNOPPNIJLKABDCFGHPD", "CDEFGHIiJKLMNOPPNIJLKABDCFGHPD", "abEFGHIiJKLMNOPPNIJLKABDCFGHPd", "CDEFGHIiJKLMNOPPNIJLKABDCFGHPD", "xyEFGHIiJKLMNOPPNIJLKABDCFGHPD", "CDEFGHIiJKLMNOPPNIJLKABDCFGHPD", "CDEFGHIiJKLMNOPPNIJLKABDCFGHPD", "abEFGHIiJKLMNOPPNIJLKABDCFGHPd", "CDEFGHIiJKLMNOPPNIJLKABDCFGHPD", "xyEFGHIiJKLMNOPPNIJLKABDCFGHPD", "CDEFGHIiJKLMNOPPNIJLKABDCFGHPD", "CDEFGHIiJKLMNOPPNIJLKABDCFGHPD", "abEFGHIiJKLMNOPPNIJLKABDCFGHPd", "CDEFGHIiJKLMNOPPNIJLKABDCFGHPD", "xyEFGHIiJKLMNOPPNIJLKABDCFGHPD", "CDEFGHIiJKLMNOPPNIJLKABDCFGHPD", "CDEFGHIiJKLMNOPPNIJLKABDCFGHPD", "abEFGHIiJKLMNOPPNIJLKABDCFGHPd", "CDEFGHIiJKLMNOPPNIJLKABDCFGHPD", "xyEFGHIiJKLMNOPPNIJLKABDCFGHPD", "CDEFGHIiJKLMNOPPNIJLKABDCFGHPD", "CDEFGHIiJKLMNOPPNIJLKABDCFGHPD", "abEFGHIiJKLMNOPPNIJLKABDCFGHPd", "CDEFGHIiJKLMNOPPNIJLKABDCFGHPD", "xyEFGHIiJKLMNOPPNIJLKABDCFGHPD", "CDEFGHIiJKLMNOPPNIJLKABDCFGHPD", "CDEFGHIiJKLMNOPPNIJLKABDCFGHxD", "abEFGHIiJKLMNOPPNIJLKABDCFGHPd", "CDEFGHIiJKLMNOPPNIJLKABDCFGHPD", "xyEFGHIiJKLMNOPPNIJLKABDCFGHPD", "CDEFGHIiJKLMNOPPNIJLKABDCFGHPD", "CDEFGHIiJKLMNOPPNIJLKABDCFGHPD", "abEFGHIiJKLMNOPPNIJLKABDCFGHPd", "CDEFGHIiJKLMNOPPNIJLKABDCFGHPD", "xyEFGHIiJKLMNOPPNIJLKABDCFGHPD" };
    assertEquals(7564, activategame.findMaxScore(grid));
  }

  @Test
  public void case124() {
    String[] grid = { "10101010101010101010101010101010101010101010101010", "01010101010101010101010101010101010101010101010101", "10101010101010101010101010101010101010101010101010", "01010101010101010101010101010101010101010101010101", "10101010101010101010101010101010101010101010101010", "01010101010101010101010101010101010101010101010101", "10101010101010101010101010101010101010101010101010", "01010101010101010101010101010101010101010101010101", "10101010101010101010101010101010101010101010101010", "01010101010101010101010101010101010101010101010101", "10101010101010101010101010101010101010101010101010", "01010101010101010101010101010101010101010101010101", "10101010101010101010101010101010101010101010101010", "01010101010101010101010101010101010101010101010101", "10101010101010101010101010101010101010101010101010", "01010101010101010101010101010101010101010101010101", "10101010101010101010101010101010101010101010101010", "01010101010101010101010101010101010101010101010101", "10101010101010101010101010101010101010101010101010", "01010101010101010101010101010101010101010101010101", "10101010101010101010101010101010101010101010101010", "01010101010101010101010101010101010101010101010101", "10101010101010101010101010101010101010101010101010", "01010101010101010101010101010101010101010101010101", "10101010101010101010101010101010101010101010101010", "01010101010101010101010101010101010101010101010101", "10101010101010101010101010101010101010101010101010", "01010101010101010101010101010101010101010101010101", "10101010101010101010101010101010101010101010101010", "01010101010101010101010101010101010101010101010101", "10101010101010101010101010101010101010101010101010", "01010101010101010101010101010101010101010101010101", "10101010101010101010101010101010101010101010101010", "01010101010101010101010101010101010101010101010101", "10101010101010101010101010101010101010101010101010", "01010101010101010101010101010101010101010101010101", "10101010101010101010101010101010101010101010101010", "01010101010101010101010101010101010101010101010101", "10101010101010101010101010101010101010101010101010", "01010101010101010101010101010101010101010101010101", "10101010101010101010101010101010101010101010101010", "01010101010101010101010101010101010101010101010101", "10101010101010101010101010101010101010101010101010", "01010101010101010101010101010101010101010101010101", "10101010101010101010101010101010101010101010101010", "01010101010101010101010101010101010101010101010101", "10101010101010101010101010101010101010101010101010", "01010101010101010101010101010101010101010101010101", "10101010101010101010101010101010101010101010101010", "01010101010101010101010101010101010101010101010101" };
    assertEquals(2499, activategame.findMaxScore(grid));
  }

  @Test
  public void case125() {
    String[] grid = { "AA3", "AAB", "cAZ" };
    assertEquals(165, activategame.findMaxScore(grid));
  }

}
