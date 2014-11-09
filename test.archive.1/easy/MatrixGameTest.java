package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class MatrixGameTest {
  MatrixGame matrixgame = new MatrixGame();

  @Test
  public void case1() {
    String[] matrix = { "000", "000", "000" };
    assertArrayEquals(new String[] { "000", "000", "000" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case2() {
    String[] matrix = { "010", "000", "110" };
    assertArrayEquals(new String[] { "000", "001", "011" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case3() {
    String[] matrix = { "111", "111", "111" };
    assertArrayEquals(new String[] { "111", "111", "111" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case4() {
    String[] matrix = { "01010", "10101", "01010", "10101" };
    assertArrayEquals(new String[] { "00011", "00011", "11100", "11100" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case5() {
    String[] matrix = { "11010100", "11110001", "00011101", "11111111", "01110100", "10000110", "00001001", "11010111" };
    assertArrayEquals(new String[] { "00000011", "00001111", "00110100", "01011100", "01111101", "11001100", "11011001", "11111111" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case6() {
    String[] matrix = { "0" };
    assertArrayEquals(new String[] { "0" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case7() {
    String[] matrix = { "11" };
    assertArrayEquals(new String[] { "11" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case8() {
    String[] matrix = { "111" };
    assertArrayEquals(new String[] { "111" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case9() {
    String[] matrix = { "0110" };
    assertArrayEquals(new String[] { "0011" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case10() {
    String[] matrix = { "11011" };
    assertArrayEquals(new String[] { "01111" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case11() {
    String[] matrix = { "000010" };
    assertArrayEquals(new String[] { "000001" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case12() {
    String[] matrix = { "0000011" };
    assertArrayEquals(new String[] { "0000011" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case13() {
    String[] matrix = { "11100001" };
    assertArrayEquals(new String[] { "00001111" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case14() {
    String[] matrix = { "1", "1" };
    assertArrayEquals(new String[] { "1", "1" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case15() {
    String[] matrix = { "11", "10" };
    assertArrayEquals(new String[] { "01", "11" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case16() {
    String[] matrix = { "001", "011" };
    assertArrayEquals(new String[] { "001", "011" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case17() {
    String[] matrix = { "1111", "0000" };
    assertArrayEquals(new String[] { "0000", "1111" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case18() {
    String[] matrix = { "11100", "00000" };
    assertArrayEquals(new String[] { "00000", "00111" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case19() {
    String[] matrix = { "111010", "110110" };
    assertArrayEquals(new String[] { "001111", "010111" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case20() {
    String[] matrix = { "0010011", "0010110" };
    assertArrayEquals(new String[] { "0000111", "0001011" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case21() {
    String[] matrix = { "00101001", "00010100" };
    assertArrayEquals(new String[] { "00000011", "00011100" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case22() {
    String[] matrix = { "0", "0", "1" };
    assertArrayEquals(new String[] { "0", "0", "1" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case23() {
    String[] matrix = { "11", "11", "11" };
    assertArrayEquals(new String[] { "11", "11", "11" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case24() {
    String[] matrix = { "111", "001", "100" };
    assertArrayEquals(new String[] { "001", "010", "111" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case25() {
    String[] matrix = { "0100", "1010", "0000" };
    assertArrayEquals(new String[] { "0000", "0001", "0110" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case26() {
    String[] matrix = { "10101", "00101", "01101" };
    assertArrayEquals(new String[] { "00011", "00111", "01011" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case27() {
    String[] matrix = { "011001", "011100", "110000" };
    assertArrayEquals(new String[] { "000011", "001101", "010101" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case28() {
    String[] matrix = { "0100010", "1010001", "1101000" };
    assertArrayEquals(new String[] { "0000011", "0001101", "0110100" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case29() {
    String[] matrix = { "00100101", "01110110", "00101000" };
    assertArrayEquals(new String[] { "00000011", "00001101", "01110101" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case30() {
    String[] matrix = { "0", "0", "0", "0" };
    assertArrayEquals(new String[] { "0", "0", "0", "0" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case31() {
    String[] matrix = { "00", "11", "11", "01" };
    assertArrayEquals(new String[] { "00", "01", "11", "11" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case32() {
    String[] matrix = { "010", "110", "110", "010" };
    assertArrayEquals(new String[] { "001", "001", "011", "011" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case33() {
    String[] matrix = { "1011", "1110", "1010", "0000" };
    assertArrayEquals(new String[] { "0000", "0011", "0111", "1011" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case34() {
    String[] matrix = { "10111", "00000", "01010", "11010" };
    assertArrayEquals(new String[] { "00000", "00011", "00111", "11101" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case35() {
    String[] matrix = { "000110", "011110", "001010", "100011" };
    assertArrayEquals(new String[] { "000011", "000101", "001111", "110001" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case36() {
    String[] matrix = { "1001000", "1110100", "1011100", "1100000" };
    assertArrayEquals(new String[] { "0000011", "0000101", "0011011", "0011101" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case37() {
    String[] matrix = { "11010110", "00100000", "00000111", "01000010" };
    assertArrayEquals(new String[] { "00000001", "00000110", "00011010", "01101110" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case38() {
    String[] matrix = { "1", "0", "0", "0", "0" };
    assertArrayEquals(new String[] { "0", "0", "0", "0", "1" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case39() {
    String[] matrix = { "01", "11", "01", "10", "00" };
    assertArrayEquals(new String[] { "00", "01", "01", "10", "11" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case40() {
    String[] matrix = { "101", "001", "111", "001", "011" };
    assertArrayEquals(new String[] { "001", "001", "011", "101", "111" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case41() {
    String[] matrix = { "1100", "0111", "1110", "0010", "0111" };
    assertArrayEquals(new String[] { "0001", "0110", "0111", "1011", "1011" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case42() {
    String[] matrix = { "00000", "00100", "01110", "01010", "01110" };
    assertArrayEquals(new String[] { "00000", "00001", "00110", "00111", "00111" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case43() {
    String[] matrix = { "001001", "110100", "000101", "001100", "001010" };
    assertArrayEquals(new String[] { "000011", "000101", "000110", "001001", "110010" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case44() {
    String[] matrix = { "0010010", "0010001", "1111010", "0110111", "0000000" };
    assertArrayEquals(new String[] { "0000000", "0000011", "0000101", "0011111", "1101011" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case45() {
    String[] matrix = { "01111010", "11001000", "00100111", "10001100", "10110010" };
    assertArrayEquals(new String[] { "00000111", "00001011", "01110001", "01110110", "10111000" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case46() {
    String[] matrix = { "0", "0", "0", "1", "1", "1" };
    assertArrayEquals(new String[] { "0", "0", "0", "1", "1", "1" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case47() {
    String[] matrix = { "01", "00", "11", "10", "00", "01" };
    assertArrayEquals(new String[] { "00", "00", "01", "01", "10", "11" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case48() {
    String[] matrix = { "101", "001", "001", "001", "000", "000" };
    assertArrayEquals(new String[] { "000", "000", "001", "001", "001", "011" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case49() {
    String[] matrix = { "1101", "0101", "1100", "0000", "0000", "0000" };
    assertArrayEquals(new String[] { "0000", "0000", "0000", "0011", "0101", "0111" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case50() {
    String[] matrix = { "01000", "10100", "10010", "00001", "10011", "01001" };
    assertArrayEquals(new String[] { "00001", "00010", "00011", "01100", "01101", "10100" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case51() {
    String[] matrix = { "100010", "000110", "010000", "001000", "011110", "111111" };
    assertArrayEquals(new String[] { "000001", "000010", "001100", "001111", "010100", "111111" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case52() {
    String[] matrix = { "0001011", "0100011", "1110111", "0110101", "1011010", "1100110" };
    assertArrayEquals(new String[] { "0000111", "0001011", "0110101", "1010110", "1101001", "1110111" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case53() {
    String[] matrix = { "10000010", "10110110", "11010100", "00000001", "00011101", "10110101" };
    assertArrayEquals(new String[] { "00000001", "00000110", "00111001", "01011010", "10011011", "10011110" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case54() {
    String[] matrix = { "1", "1", "1", "1", "0", "0", "1" };
    assertArrayEquals(new String[] { "0", "0", "1", "1", "1", "1", "1" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case55() {
    String[] matrix = { "11", "11", "10", "00", "10", "10", "01" };
    assertArrayEquals(new String[] { "00", "01", "01", "01", "10", "11", "11" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case56() {
    String[] matrix = { "000", "011", "000", "000", "010", "001", "001" };
    assertArrayEquals(new String[] { "000", "000", "000", "001", "001", "010", "011" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case57() {
    String[] matrix = { "0100", "1011", "1101", "1000", "0000", "1000", "0111" };
    assertArrayEquals(new String[] { "0000", "0001", "0001", "0010", "0111", "1101", "1110" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case58() {
    String[] matrix = { "10111", "00100", "10010", "11011", "01011", "10000", "00110" };
    assertArrayEquals(new String[] { "00001", "00010", "00101", "00110", "01111", "11100", "11101" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case59() {
    String[] matrix = { "000101", "000000", "101111", "000001", "010010", "001001", "100100" };
    assertArrayEquals(new String[] { "000000", "000001", "000011", "000101", "001010", "011111", "110000" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case60() {
    String[] matrix = { "0001101", "0010000", "1100111", "0111010", "1010101", "0001110", "1100110" };
    assertArrayEquals(new String[] { "0000001", "0001110", "0010110", "0101011", "1010101", "1101100", "1111100" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case61() {
    String[] matrix = { "10001111", "10110001", "11100100", "01011000", "00100011", "10000000", "10111111" };
    assertArrayEquals(new String[] { "00000001", "00001110", "00010111", "01100011", "10101101", "10111111", "11010000" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case62() {
    String[] matrix = { "1", "1", "1", "1", "1", "1", "0", "1" };
    assertArrayEquals(new String[] { "0", "1", "1", "1", "1", "1", "1", "1" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case63() {
    String[] matrix = { "10", "01", "10", "11", "10", "00", "11", "00" };
    assertArrayEquals(new String[] { "00", "00", "01", "01", "01", "10", "11", "11" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case64() {
    String[] matrix = { "110", "000", "010", "100", "001", "101", "001", "010" };
    assertArrayEquals(new String[] { "000", "001", "001", "010", "010", "100", "101", "110" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case65() {
    String[] matrix = { "1101", "1011", "1110", "1010", "1100", "0100", "0110", "0110" };
    assertArrayEquals(new String[] { "0001", "0011", "0011", "0101", "0110", "0111", "1101", "1110" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case66() {
    String[] matrix = { "10100", "01011", "01011", "01001", "00001", "11000", "00101", "10111" };
    assertArrayEquals(new String[] { "00001", "00011", "00101", "01010", "01100", "10011", "10011", "11101" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case67() {
    String[] matrix = { "100010", "000111", "000100", "100011", "100101", "011000", "101110", "111111" };
    assertArrayEquals(new String[] { "000001", "000110", "001011", "001101", "001110", "010111", "110000", "111111" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case68() {
    String[] matrix = { "1011101", "1000011", "0110000", "1110011", "1001111", "1100100", "0111000", "1001111" };
    assertArrayEquals(new String[] { "0000011", "0000111", "0011001", "0111110", "1101000", "1101011", "1111100", "1111100" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case69() {
    String[] matrix = { "01101110", "00000111", "00010111", "00111101", "01000111", "10110100", "10001101", "11011000" };
    assertArrayEquals(new String[] { "00000111", "00001111", "00010111", "01100011", "01111000", "10101001", "11001011", "11010101" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case70() {
    String[] matrix = { "11111111", "11111111", "11111111", "11111111", "11111111", "11111111", "11111111", "11111111" };
    assertArrayEquals(new String[] { "11111111", "11111111", "11111111", "11111111", "11111111", "11111111", "11111111", "11111111" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case71() {
    String[] matrix = { "11111111", "01110111", "11111100", "11111111", "11111111", "11111111", "11111111", "11111101" };
    assertArrayEquals(new String[] { "00111111", "01111111", "11001111", "11111111", "11111111", "11111111", "11111111", "11111111" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case72() {
    String[] matrix = { "10111111", "11111111", "11011111", "11010011", "01111101", "01000010", "11100101", "11011011" };
    assertArrayEquals(new String[] { "00000011", "00011111", "00111111", "01111111", "11001101", "11110101", "11111110", "11111111" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case73() {
    String[] matrix = { "10101011", "00011110", "11001000", "01111011", "11011100", "11111011", "10111001", "10011110" };
    assertArrayEquals(new String[] { "00000111", "00011111", "00111001", "00111011", "11001011", "11100011", "11101101", "11101111" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case74() {
    String[] matrix = { "11010111", "10010111", "11101011", "11010110", "11010101", "01001110", "00101100", "01111111" };
    assertArrayEquals(new String[] { "00000111", "00011011", "01111001", "10111110", "11011111", "11101001", "11110001", "11111001" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case75() {
    String[] matrix = { "01101111", "01010100", "11001010", "00001000", "11111011", "11001001", "10011001", "11100001" };
    assertArrayEquals(new String[] { "00000001", "00001110", "00110011", "00110101", "01010011", "10110010", "11101011", "11110111" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case76() {
    String[] matrix = { "00001100", "00011110", "10001111", "00010010", "11101101", "00000101", "00101100", "10000100" };
    assertArrayEquals(new String[] { "00000011", "00000101", "00001001", "00010011", "00101111", "01011111", "10100000", "10100011" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case77() {
    String[] matrix = { "10100001", "10000110", "10001001", "00111001", "00100000", "00011110", "00010000", "01000100" };
    assertArrayEquals(new String[] { "00000001", "00000010", "00001100", "00110001", "01010011", "01110000", "10100100", "11000110" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case78() {
    String[] matrix = { "00000010", "00000000", "00000110", "00010000", "00000000", "00001001", "00110000", "00000011" };
    assertArrayEquals(new String[] { "00000000", "00000000", "00000001", "00000010", "00000101", "00001001", "00010010", "00100100" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case79() {
    String[] matrix = { "00000000", "00010001", "00000000", "00100000", "00000000", "00000000", "00000000", "00001010" };
    assertArrayEquals(new String[] { "00000000", "00000000", "00000000", "00000000", "00000000", "00000001", "00000110", "00011000" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case80() {
    String[] matrix = { "00000000", "00000000", "00000000", "00000000", "00000000", "00000000", "00000000", "00000000" };
    assertArrayEquals(new String[] { "00000000", "00000000", "00000000", "00000000", "00000000", "00000000", "00000000", "00000000" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case81() {
    String[] matrix = { "00000000", "00000000", "01101101", "11101010", "00001001", "00110111", "10100001", "00000100" };
    assertArrayEquals(new String[] { "00000000", "00000000", "00000001", "00000110", "00011010", "00101111", "01111100", "11001011" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case82() {
    String[] matrix = { "00001010", "00010111", "00011000", "01000010", "11010100", "00111110", "00010010", "01010101" };
    assertArrayEquals(new String[] { "00000011", "00000101", "00000110", "00001001", "00110011", "00111010", "01010111", "10011010" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case83() {
    String[] matrix = { "10100001", "11101110", "00001111", "11010000", "01111000", "01111101", "11010101", "01101110" };
    assertArrayEquals(new String[] { "00000111", "00011001", "00101110", "01010111", "01111110", "11101010", "11101011", "11110000" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case84() {
    String[] matrix = { "00011000", "10000100", "11000101", "01010101", "11010000", "00001100", "01010110", "10100010" };
    assertArrayEquals(new String[] { "00000011", "00000101", "00001010", "00011100", "00110101", "00111001", "01011001", "11000100" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case85() {
    String[] matrix = { "00000111", "11111001", "11100001", "11101111", "11110010", "01001111", "11101000", "00000111" };
    assertArrayEquals(new String[] { "00000111", "00000111", "00011111", "01101001", "01111000", "01111111", "11101010", "11111001" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case86() {
    String[] matrix = { "01010011", "11011111", "01101110", "00010111", "00011111", "10001000", "11101111", "00100100" };
    assertArrayEquals(new String[] { "00000011", "00001100", "00110111", "01111111", "11010001", "11010101", "11110000", "11111101" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case87() {
    String[] matrix = { "00000011", "00001000", "11111010", "00011101", "01000000", "11100101", "00010100", "00001110" };
    assertArrayEquals(new String[] { "00000001", "00000010", "00001100", "00010101", "00101101", "00110000", "11011011", "11100110" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case88() {
    String[] matrix = { "00010010", "00110011", "00000011", "10001101", "11110001", "10100110", "01111010", "00010011" };
    assertArrayEquals(new String[] { "00000011", "00000101", "00000111", "00001111", "00111001", "01011110", "10110010", "11001101" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case89() {
    String[] matrix = { "00100000", "10100001", "01000011", "00100111", "00000101", "00001101", "11010001", "00011000" };
    assertArrayEquals(new String[] { "00000001", "00000110", "00001011", "00010110", "00100111", "01010000", "10100010", "11001010" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case90() {
    String[] matrix = { "00001011", "01001100", "11010000", "11111111", "00110000", "01010010", "11011100", "10010010" };
    assertArrayEquals(new String[] { "00000011", "00001101", "00010101", "00011001", "01100100", "01101101", "10110000", "11111111" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case91() {
    String[] matrix = { "00101001", "01010100", "11100011", "11000010", "01110100", "10000110", "01110000", "00101001" };
    assertArrayEquals(new String[] { "00000111", "00000111", "00011001", "00111000", "00111001", "11001000", "11001011", "11100000" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case92() {
    String[] matrix = { "11010100", "11110001", "00011101", "11111111", "01110100", "10000110", "00001001", "11010111" };
    assertArrayEquals(new String[] { "00000011", "00001111", "00110100", "01011100", "01111101", "11001100", "11011001", "11111111" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case93() {
    String[] matrix = { "1100", "1110", "0111", "1001" };
    assertArrayEquals(new String[] { "0011", "0101", "1011", "1110" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case94() {
    String[] matrix = { "11001010", "11110000", "00000001", "10101111", "01010110", "00000011", "10101110", "10001111" };
    assertArrayEquals(new String[] { "00000001", "00000011", "00011110", "00101111", "01101110", "01101111", "10110010", "11010100" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case95() {
    String[] matrix = { "11110001", "10110101", "10001101", "11111111", "00000000", "10000111", "01010111", "00011111" };
    assertArrayEquals(new String[] { "00000000", "00001111", "00010111", "00111011", "01100111", "10101011", "11100101", "11111111" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case96() {
    String[] matrix = { "10010011", "10001111", "00110100", "01011101", "01101101", "11001100", "11110100", "11110100" };
    assertArrayEquals(new String[] { "00000111", "00011111", "00011111", "00111001", "01101011", "01101101", "11010010", "11110001" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case97() {
    String[] matrix = { "01011110", "10101111", "11010111", "10101101", "10101011", "10001111", "10101110", "10101011" };
    assertArrayEquals(new String[] { "00011111", "00011111", "00101111", "00110111", "00111011", "00111111", "11100101", "11101110" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case98() {
    String[] matrix = { "11100000", "00111011", "00110000" };
    assertArrayEquals(new String[] { "00000011", "00001101", "01110011" }, matrixgame.getMinimal(matrix));
  }

  @Test
  public void case99() {
    String[] matrix = { "10101010", "00110011", "11111110", "10101111", "11001100", "11001100", "10101010" };
    assertArrayEquals(new String[] { "00001111", "00001111", "00110011", "00110011", "01011111", "10111111", "11001100" }, matrixgame.getMinimal(matrix));
  }

}
