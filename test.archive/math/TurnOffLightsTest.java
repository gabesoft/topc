package topc.test.math;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.math.*;

public class TurnOffLightsTest {
  TurnOffLights turnofflights = new TurnOffLights();

  @Test
  public void case1() {
    String[] board = { "1100", "1000", "0000", "0000" };
    assertEquals(1, turnofflights.fewestMoves(board));
  }

  @Test
  public void case2() {
    String[] board = { "0100", "1110", "0100", "0000" };
    assertEquals(1, turnofflights.fewestMoves(board));
  }

  @Test
  public void case3() {
    String[] board = { "1000", "0000", "0000", "0000" };
    assertEquals(2, turnofflights.fewestMoves(board));
  }

  @Test
  public void case4() {
    String[] board = { "1100", "1000", "0000", "0001" };
    assertEquals(3, turnofflights.fewestMoves(board));
  }

  @Test
  public void case5() {
    String[] board = { "1011", "1010", "0000", "0000" };
    assertEquals(2, turnofflights.fewestMoves(board));
  }

  @Test
  public void case6() {
    String[] board = { "0010", "0111", "0110", "0111" };
    assertEquals(6, turnofflights.fewestMoves(board));
  }

  @Test
  public void case7() {
    String[] board = { "1111", "0010", "0001", "0100" };
    assertEquals(5, turnofflights.fewestMoves(board));
  }

  @Test
  public void case8() {
    String[] board = { "1001", "0110", "0110", "1001" };
    assertEquals(4, turnofflights.fewestMoves(board));
  }

  @Test
  public void case9() {
    String[] board = { "1010", "0111", "1010", "0110" };
    assertEquals(6, turnofflights.fewestMoves(board));
  }

  @Test
  public void case10() {
    String[] board = { "1101", "1101", "0100", "0100" };
    assertEquals(4, turnofflights.fewestMoves(board));
  }

  @Test
  public void case11() {
    String[] board = { "0110", "1100", "0001", "0111" };
    assertEquals(7, turnofflights.fewestMoves(board));
  }

  @Test
  public void case12() {
    String[] board = { "0011", "1001", "0110", "0011" };
    assertEquals(4, turnofflights.fewestMoves(board));
  }

  @Test
  public void case13() {
    String[] board = { "1000", "1111", "0010", "0011" };
    assertEquals(7, turnofflights.fewestMoves(board));
  }

  @Test
  public void case14() {
    String[] board = { "1100", "0001", "0111", "0101" };
    assertEquals(4, turnofflights.fewestMoves(board));
  }

  @Test
  public void case15() {
    String[] board = { "0100", "1111", "1110", "0101" };
    assertEquals(7, turnofflights.fewestMoves(board));
  }

  @Test
  public void case16() {
    String[] board = { "0110", "0000", "1100", "0100" };
    assertEquals(4, turnofflights.fewestMoves(board));
  }

  @Test
  public void case17() {
    String[] board = { "0110", "1100", "0100", "0001" };
    assertEquals(6, turnofflights.fewestMoves(board));
  }

  @Test
  public void case18() {
    String[] board = { "1110", "0001", "0000", "0100" };
    assertEquals(4, turnofflights.fewestMoves(board));
  }

  @Test
  public void case19() {
    String[] board = { "0001", "1010", "0101", "1101" };
    assertEquals(7, turnofflights.fewestMoves(board));
  }

  @Test
  public void case20() {
    String[] board = { "0101", "0101", "1001", "0100" };
    assertEquals(6, turnofflights.fewestMoves(board));
  }

  @Test
  public void case21() {
    String[] board = { "0110", "1001", "1001", "0110" };
    assertEquals(4, turnofflights.fewestMoves(board));
  }

  @Test
  public void case22() {
    String[] board = { "0000", "0110", "0110", "0000" };
    assertEquals(6, turnofflights.fewestMoves(board));
  }

  @Test
  public void case23() {
    String[] board = { "0110", "1111", "1111", "0110" };
    assertEquals(4, turnofflights.fewestMoves(board));
  }

  @Test
  public void case24() {
    String[] board = { "0110", "0111", "1111", "1100" };
    assertEquals(7, turnofflights.fewestMoves(board));
  }

  @Test
  public void case25() {
    String[] board = { "1110", "0011", "1101", "1101" };
    assertEquals(7, turnofflights.fewestMoves(board));
  }

  @Test
  public void case26() {
    String[] board = { "1010", "1101", "0110", "1101" };
    assertEquals(9, turnofflights.fewestMoves(board));
  }

  @Test
  public void case27() {
    String[] board = { "0000", "1111", "1001", "1111" };
    assertEquals(9, turnofflights.fewestMoves(board));
  }

  @Test
  public void case28() {
    String[] board = { "1011", "1101", "0100", "1010" };
    assertEquals(6, turnofflights.fewestMoves(board));
  }

  @Test
  public void case29() {
    String[] board = { "0101", "1101", "1011", "1001" };
    assertEquals(6, turnofflights.fewestMoves(board));
  }

  @Test
  public void case30() {
    String[] board = { "1111", "1111", "1111", "1111" };
    assertEquals(4, turnofflights.fewestMoves(board));
  }

  @Test
  public void case31() {
    String[] board = { "1011", "0100", "0101", "1010" };
    assertEquals(7, turnofflights.fewestMoves(board));
  }

  @Test
  public void case32() {
    String[] board = { "1111", "1100", "0011", "1111" };
    assertEquals(8, turnofflights.fewestMoves(board));
  }

  @Test
  public void case33() {
    String[] board = { "1010", "0101", "1010", "0101" };
    assertEquals(8, turnofflights.fewestMoves(board));
  }

  @Test
  public void case34() {
    String[] board = { "0101", "1010", "0101", "1010" };
    assertEquals(8, turnofflights.fewestMoves(board));
  }

  @Test
  public void case35() {
    String[] board = { "0100", "1000", "1101", "0110" };
    assertEquals(3, turnofflights.fewestMoves(board));
  }

  @Test
  public void case36() {
    String[] board = { "1001", "0000", "0000", "1001" };
    assertEquals(6, turnofflights.fewestMoves(board));
  }

  @Test
  public void case37() {
    String[] board = { "1011", "1010", "0000", "0000" };
    assertEquals(2, turnofflights.fewestMoves(board));
  }

  @Test
  public void case38() {
    String[] board = { "0001", "0101", "1111", "1011" };
    assertEquals(7, turnofflights.fewestMoves(board));
  }

  @Test
  public void case39() {
    String[] board = { "1111", "1011", "0110", "1101" };
    assertEquals(7, turnofflights.fewestMoves(board));
  }

  @Test
  public void case40() {
    String[] board = { "1010", "1100", "0101", "0011" };
    assertEquals(7, turnofflights.fewestMoves(board));
  }

  @Test
  public void case41() {
    String[] board = { "0100", "1010", "0100", "0000" };
    assertEquals(3, turnofflights.fewestMoves(board));
  }

  @Test
  public void case42() {
    String[] board = { "1111", "1011", "1101", "1111" };
    assertEquals(8, turnofflights.fewestMoves(board));
  }

  @Test
  public void case43() {
    String[] board = { "0110", "1001", "0110", "0000" };
    assertEquals(2, turnofflights.fewestMoves(board));
  }

  @Test
  public void case44() {
    String[] board = { "1111", "1101", "1011", "1111" };
    assertEquals(8, turnofflights.fewestMoves(board));
  }

  @Test
  public void case45() {
    String[] board = { "0100", "1000", "0100", "0000" };
    assertEquals(5, turnofflights.fewestMoves(board));
  }

}
