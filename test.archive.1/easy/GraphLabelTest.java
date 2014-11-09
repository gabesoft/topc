package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class GraphLabelTest {
  GraphLabel graphlabel = new GraphLabel();

  @Test
  public void case1() {
    String[] graph = { "010000", "101111", "010111", "011010", "011101", "011010" };
    assertEquals(3, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case2() {
    String[] graph = { "01111001", "10101000", "11000101", "10000111", "11000111", "00111000", "00011000", "10111000" };
    assertEquals(4, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case3() {
    String[] graph = { "011110101", "100111000", "100000111", "110011011", "110101001", "010110110", "101001010", "001101101", "101110010" };
    assertEquals(4, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case4() {
    String[] graph = { "011111111", "101111111", "110111111", "111011111", "111101111", "111110111", "111111011", "111111101", "111111110" };
    assertEquals(8, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case5() {
    String[] graph = { "01", "10" };
    assertEquals(1, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case6() {
    String[] graph = { "0000000", "0001011", "0001001", "0110101", "0001000", "0100001", "0111010" };
    assertEquals(2, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case7() {
    String[] graph = { "00001001", "00111111", "01001011", "01000011", "11100000", "01000011", "01110100", "11110100" };
    assertEquals(4, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case8() {
    String[] graph = { "0000111", "0011001", "0100101", "0100001", "1010010", "1000100", "1111000" };
    assertEquals(2, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case9() {
    String[] graph = { "011011110", "101111011", "110111011", "011001010", "111001011", "111110110", "100001000", "111111001", "011010010" };
    assertEquals(5, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case10() {
    String[] graph = { "01110010", "10010101", "10000011", "11000100", "00000000", "01010010", "10100100", "01100000" };
    assertEquals(3, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case11() {
    String[] graph = { "01110011", "10001101", "10001001", "10000010", "01100110", "01001001", "10011001", "11100110" };
    assertEquals(4, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case12() {
    String[] graph = { "01", "10" };
    assertEquals(1, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case13() {
    String[] graph = { "0110", "1000", "1000", "0000" };
    assertEquals(1, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case14() {
    String[] graph = { "01100", "10010", "10001", "01000", "00100" };
    assertEquals(1, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case15() {
    String[] graph = { "0011000", "0011010", "1100101", "1100010", "0010000", "0101000", "0010000" };
    assertEquals(2, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case16() {
    String[] graph = { "011011110", "100000110", "100100100", "001011111", "100101101", "100110000", "111110011", "110100100", "000110100" };
    assertEquals(4, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case17() {
    String[] graph = { "001011010", "000111010", "100101100", "011010100", "110101001", "111010001", "001100011", "110000100", "000011100" };
    assertEquals(5, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case18() {
    String[] graph = { "01", "10" };
    assertEquals(1, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case19() {
    String[] graph = { "001", "001", "110" };
    assertEquals(1, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case20() {
    String[] graph = { "001110100", "001001111", "110111001", "101011100", "101101100", "011110001", "110110010", "010000101", "011001010" };
    assertEquals(4, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case21() {
    String[] graph = { "0011010", "0001101", "1001011", "1110111", "0101001", "1011001", "0111110" };
    assertEquals(3, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case22() {
    String[] graph = { "000010", "001001", "010011", "000011", "101100", "011100" };
    assertEquals(2, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case23() {
    String[] graph = { "01011101", "10100000", "01000111", "10001100", "10010000", "10110000", "00100001", "10100010" };
    assertEquals(3, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case24() {
    String[] graph = { "0010000", "0010101", "1101001", "0010001", "0100000", "0000000", "0111000" };
    assertEquals(2, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case25() {
    String[] graph = { "01", "10" };
    assertEquals(1, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case26() {
    String[] graph = { "0100", "1001", "0001", "0110" };
    assertEquals(1, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case27() {
    String[] graph = { "001001111", "000100010", "100111000", "011000000", "001000010", "101000001", "100000000", "110010000", "100001000" };
    assertEquals(3, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case28() {
    String[] graph = { "01101011", "10011111", "10001110", "01001011", "11110001", "01100011", "11110101", "11011110" };
    assertEquals(5, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case29() {
    String[] graph = { "000", "001", "010" };
    assertEquals(1, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case30() {
    String[] graph = { "0110100", "1010100", "1100011", "0000010", "1100010", "0011101", "0010010" };
    assertEquals(3, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case31() {
    String[] graph = { "00001011", "00000100", "00010101", "00101111", "10010011", "01110011", "10011100", "10111100" };
    assertEquals(3, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case32() {
    String[] graph = { "000010011", "001011100", "010001101", "000011111", "110101100", "011110100", "011111010", "100100101", "101100010" };
    assertEquals(4, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case33() {
    String[] graph = { "00111111", "00011011", "10000010", "11000110", "11000001", "10010000", "11110000", "11001000" };
    assertEquals(4, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case34() {
    String[] graph = { "01010011", "10101000", "01001100", "10001111", "01110011", "00110001", "10011000", "10011100" };
    assertEquals(4, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case35() {
    String[] graph = { "00111100", "00010001", "10011011", "11100101", "10100110", "10011000", "00101000", "01110000" };
    assertEquals(3, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case36() {
    String[] graph = { "01010111", "10110011", "01010110", "11100011", "00000101", "10101000", "11110000", "11011000" };
    assertEquals(4, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case37() {
    String[] graph = { "01000", "10011", "00001", "01000", "01100" };
    assertEquals(2, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case38() {
    String[] graph = { "01100", "10011", "10001", "01001", "01110" };
    assertEquals(2, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case39() {
    String[] graph = { "010011", "101101", "010000", "010000", "100000", "110000" };
    assertEquals(2, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case40() {
    String[] graph = { "00011110", "00001111", "00011111", "10101100", "11110101", "11111001", "11100001", "01101110" };
    assertEquals(4, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case41() {
    String[] graph = { "000011100", "000010001", "000000100", "000000100", "110000100", "100000111", "101111001", "000001001", "010001110" };
    assertEquals(3, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case42() {
    String[] graph = { "000010101", "001110001", "010001011", "010000010", "110000111", "001000100", "100011001", "001110001", "111010110" };
    assertEquals(4, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case43() {
    String[] graph = { "011100101", "100101100", "100110011", "111011111", "001100111", "010100101", "110111001", "001110001", "101111110" };
    assertEquals(4, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case44() {
    String[] graph = { "00011010", "00001100", "00000110", "10001001", "11010000", "01100010", "10100100", "00010000" };
    assertEquals(2, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case45() {
    String[] graph = { "01", "10" };
    assertEquals(1, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case46() {
    String[] graph = { "0001110", "0000001", "0001011", "1010001", "1000000", "1010001", "0111010" };
    assertEquals(3, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case47() {
    String[] graph = { "010", "101", "010" };
    assertEquals(1, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case48() {
    String[] graph = { "001100101", "000000001", "100000011", "100000011", "000000110", "000000101", "100011000", "001110000", "111101000" };
    assertEquals(4, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case49() {
    String[] graph = { "000111000", "000110011", "000010100", "110000111", "111000100", "100000011", "001110011", "010101101", "010101110" };
    assertEquals(5, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case50() {
    String[] graph = { "00011101", "00100001", "01011010", "10100111", "10100001", "10010010", "00110101", "11011010" };
    assertEquals(4, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case51() {
    String[] graph = { "010011000", "101010111", "010001101", "000001011", "110001101", "101110100", "011011011", "010100100", "011110100" };
    assertEquals(5, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case52() {
    String[] graph = { "010111110", "101001100", "010001110", "100001111", "100001110", "111110010", "111110001", "101111001", "000100110" };
    assertEquals(5, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case53() {
    String[] graph = { "000100110", "001001010", "010111011", "101011100", "001100000", "011100101", "100101011", "111000101", "001001110" };
    assertEquals(4, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case54() {
    String[] graph = { "001", "000", "100" };
    assertEquals(1, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case55() {
    String[] graph = { "01", "10" };
    assertEquals(1, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case56() {
    String[] graph = { "011111111", "101111111", "110111111", "111011111", "111101111", "111110111", "111111010", "111111101", "111111010" };
    assertEquals(7, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case57() {
    String[] graph = { "011111111", "101111111", "110111111", "111011111", "111101111", "111110111", "111111010", "111111101", "111111010" };
    assertEquals(7, graphlabel.adjacentDifference(graph));
  }

  @Test
  public void case58() {
    String[] graph = { "011111111", "101111111", "110111111", "111011111", "111101111", "111110111", "111111010", "111111101", "111111010" };
    assertEquals(7, graphlabel.adjacentDifference(graph));
  }

}
