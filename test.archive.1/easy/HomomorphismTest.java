package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class HomomorphismTest {
  Homomorphism homomorphism = new Homomorphism();

  @Test
  public void case1() {
    String u = "10";
    String v = "11001";
    assertEquals(4, homomorphism.count(u, v));
  }

  @Test
  public void case2() {
    String u = "00";
    String v = "11111";
    assertEquals(0, homomorphism.count(u, v));
  }

  @Test
  public void case3() {
    String u = "11";
    String v = "00";
    assertEquals(-1, homomorphism.count(u, v));
  }

  @Test
  public void case4() {
    String u = "001";
    String v = "1010001";
    assertEquals(1, homomorphism.count(u, v));
  }

  @Test
  public void case5() {
    String u = "101";
    String v = "11111111111111111111111111111111111111111111111111";
    assertEquals(24, homomorphism.count(u, v));
  }

  @Test
  public void case6() {
    String u = "1";
    String v = "1100111011";
    assertEquals(-1, homomorphism.count(u, v));
  }

  @Test
  public void case7() {
    String u = "000000";
    String v = "00000111101000111101111100010111110001000100100111";
    assertEquals(0, homomorphism.count(u, v));
  }

  @Test
  public void case8() {
    String u = "00100110";
    String v = "011100001111001001101011000110";
    assertEquals(0, homomorphism.count(u, v));
  }

  @Test
  public void case9() {
    String u = "110010011";
    String v = "011110001011001110001";
    assertEquals(0, homomorphism.count(u, v));
  }

  @Test
  public void case10() {
    String u = "0010";
    String v = "1011011011010111010010100011111000011";
    assertEquals(0, homomorphism.count(u, v));
  }

  @Test
  public void case11() {
    String u = "010";
    String v = "011100";
    assertEquals(1, homomorphism.count(u, v));
  }

  @Test
  public void case12() {
    String u = "100";
    String v = "111011110001";
    assertEquals(0, homomorphism.count(u, v));
  }

  @Test
  public void case13() {
    String u = "10100";
    String v = "01001001100111111100111001110001111101111101101";
    assertEquals(0, homomorphism.count(u, v));
  }

  @Test
  public void case14() {
    String u = "0011";
    String v = "00001110000100101111010011110110010011";
    assertEquals(0, homomorphism.count(u, v));
  }

  @Test
  public void case15() {
    String u = "0000110";
    String v = "11001011010011011000111000101111100";
    assertEquals(0, homomorphism.count(u, v));
  }

  @Test
  public void case16() {
    String u = "100010001111111010001001010001001111";
    String v = "0101001100100010001000010011111";
    assertEquals(0, homomorphism.count(u, v));
  }

  @Test
  public void case17() {
    String u = "00110010110101111000";
    String v = "0";
    assertEquals(0, homomorphism.count(u, v));
  }

  @Test
  public void case18() {
    String u = "11011";
    String v = "11101110111011000110101000110100101";
    assertEquals(0, homomorphism.count(u, v));
  }

  @Test
  public void case19() {
    String u = "100010001000001110111101101101111000010";
    String v = "0100";
    assertEquals(0, homomorphism.count(u, v));
  }

  @Test
  public void case20() {
    String u = "10110101";
    String v = "011010110110000111100100101111";
    assertEquals(0, homomorphism.count(u, v));
  }

  @Test
  public void case21() {
    String u = "0011010";
    String v = "0110100000010001101111010101111100010001000001";
    assertEquals(0, homomorphism.count(u, v));
  }

  @Test
  public void case22() {
    String u = "1001111011000010000110111111010";
    String v = "111100000101011101111011111101";
    assertEquals(0, homomorphism.count(u, v));
  }

  @Test
  public void case23() {
    String u = "01101001100101";
    String v = "1101100011";
    assertEquals(0, homomorphism.count(u, v));
  }

  @Test
  public void case24() {
    String u = "0101001001000010000110111100";
    String v = "0100111110111";
    assertEquals(0, homomorphism.count(u, v));
  }

  @Test
  public void case25() {
    String u = "111110001000110001100000110110000110101110";
    String v = "01001011001";
    assertEquals(0, homomorphism.count(u, v));
  }

  @Test
  public void case26() {
    String u = "111011101111";
    String v = "10110110111111010111011011011111101011101101101101";
    assertEquals(1, homomorphism.count(u, v));
  }

  @Test
  public void case27() {
    String u = "010110010100";
    String v = "01100111011001111110110001100111011001110110001100";
    assertEquals(1, homomorphism.count(u, v));
  }

  @Test
  public void case28() {
    String u = "110000011111111";
    String v = "10010001000100010001000100100100100100100100100100";
    assertEquals(1, homomorphism.count(u, v));
  }

  @Test
  public void case29() {
    String u = "00100001011111";
    String v = "0011000110110011000110001100011011001101111111111";
    assertEquals(1, homomorphism.count(u, v));
  }

  @Test
  public void case30() {
    String u = "00000111000";
    String v = "101101101101101000010100000101000001010101101101";
    assertEquals(1, homomorphism.count(u, v));
  }

  @Test
  public void case31() {
    String u = "010111";
    String v = "01010110011101101010110011101111001110111100111011";
    assertEquals(1, homomorphism.count(u, v));
  }

  @Test
  public void case32() {
    String u = "001101";
    String v = "111100001111000001100010110001111100000110001";
    assertEquals(1, homomorphism.count(u, v));
  }

  @Test
  public void case33() {
    String u = "1001010100001111100";
    String v = "000100100001000010000100100100100000000000010010";
    assertEquals(1, homomorphism.count(u, v));
  }

  @Test
  public void case34() {
    String u = "1000011101";
    String v = "11111100110011001100111111111111111111110011111111";
    assertEquals(1, homomorphism.count(u, v));
  }

  @Test
  public void case35() {
    String u = "110010";
    String v = "000001100000011010101110101011100000011010101110";
    assertEquals(1, homomorphism.count(u, v));
  }

  @Test
  public void case36() {
    String u = "0101011";
    String v = "1011110100100101111010010010111101001000100";
    assertEquals(1, homomorphism.count(u, v));
  }

  @Test
  public void case37() {
    String u = "11111011010";
    String v = "0100001000010000100001000111010000100011101000111";
    assertEquals(1, homomorphism.count(u, v));
  }

  @Test
  public void case38() {
    String u = "000100";
    String v = "01010101010101010101010111011101010101010101010101";
    assertEquals(4, homomorphism.count(u, v));
  }

  @Test
  public void case39() {
    String u = "1000111";
    String v = "0101101010110110110010110101001011010100101101010";
    assertEquals(1, homomorphism.count(u, v));
  }

  @Test
  public void case40() {
    String u = "011001100";
    String v = "0000011110111000000100000111101110000001000001";
    assertEquals(1, homomorphism.count(u, v));
  }

  @Test
  public void case41() {
    String u = "100110";
    String v = "100001010100001010100001000010000101010000";
    assertEquals(1, homomorphism.count(u, v));
  }

  @Test
  public void case42() {
    String u = "010000010";
    String v = "11111101011111111111111111111111111110101111111";
    assertEquals(1, homomorphism.count(u, v));
  }

  @Test
  public void case43() {
    String u = "000100001001";
    String v = "111111111011100011111111111101110001111110111000";
    assertEquals(1, homomorphism.count(u, v));
  }

  @Test
  public void case44() {
    String u = "1110110";
    String v = "111100111100111100010001010111100111100010001010";
    assertEquals(1, homomorphism.count(u, v));
  }

  @Test
  public void case45() {
    String u = "0000111101";
    String v = "001111000111100011110001111001010101001111001";
    assertEquals(1, homomorphism.count(u, v));
  }

  @Test
  public void case46() {
    String u = "00011";
    String v = "00110000000110000000110000011110101101111010110";
    assertEquals(1, homomorphism.count(u, v));
  }

  @Test
  public void case47() {
    String u = "00011100";
    String v = "11111101111110111111010001100011000111111101111110";
    assertEquals(1, homomorphism.count(u, v));
  }

  @Test
  public void case48() {
    String u = "00100";
    String v = "00001000000001000010000101000010000000010000";
    assertEquals(3, homomorphism.count(u, v));
  }

  @Test
  public void case49() {
    String u = "0010101";
    String v = "1110111111011111010001110111110100011101111101000";
    assertEquals(1, homomorphism.count(u, v));
  }

  @Test
  public void case50() {
    String u = "10110001000011110011";
    String v = "01101011001101110110111101100110011001101101100110";
    assertEquals(1, homomorphism.count(u, v));
  }

  @Test
  public void case51() {
    String u = "01000100";
    String v = "1111101111111101111110111111011111111011111101";
    assertEquals(1, homomorphism.count(u, v));
  }

  @Test
  public void case52() {
    String u = "010111100011100101011000110000011";
    String v = "11011000011111100011110110110011111100111111111100";
    assertEquals(1, homomorphism.count(u, v));
  }

  @Test
  public void case53() {
    String u = "011000000100";
    String v = "100000110011000011001110101010101000001100111010";
    assertEquals(1, homomorphism.count(u, v));
  }

  @Test
  public void case54() {
    String u = "01101011000001";
    String v = "0110010100100110010011001010010010101010110010";
    assertEquals(1, homomorphism.count(u, v));
  }

  @Test
  public void case55() {
    String u = "11000000100000";
    String v = "11011001100110011001100110101100110011001100110";
    assertEquals(1, homomorphism.count(u, v));
  }

  @Test
  public void case56() {
    String u = "01";
    String v = "0001110100001001111000111101001000110010010100";
    assertEquals(45, homomorphism.count(u, v));
  }

  @Test
  public void case57() {
    String u = "1";
    String v = "01100011000001000111001011001101010001";
    assertEquals(-1, homomorphism.count(u, v));
  }

  @Test
  public void case58() {
    String u = "101101";
    String v = "01000110000001101101000110100011000000110110100011";
    assertEquals(1, homomorphism.count(u, v));
  }

  @Test
  public void case59() {
    String u = "0";
    String v = "0011011010011011000101101000000010011";
    assertEquals(-1, homomorphism.count(u, v));
  }

  @Test
  public void case60() {
    String u = "1";
    String v = "01011101101101001101001000100011";
    assertEquals(-1, homomorphism.count(u, v));
  }

  @Test
  public void case61() {
    String u = "0101";
    String v = "01000010011101010110100001001110101011";
    assertEquals(18, homomorphism.count(u, v));
  }

  @Test
  public void case62() {
    String u = "10";
    String v = "011001001101100110111010000101111110";
    assertEquals(35, homomorphism.count(u, v));
  }

  @Test
  public void case63() {
    String u = "111";
    String v = "000000000000000000";
    assertEquals(-1, homomorphism.count(u, v));
  }

  @Test
  public void case64() {
    String u = "110";
    String v = "001000001000011011111001110101110";
    assertEquals(2, homomorphism.count(u, v));
  }

  @Test
  public void case65() {
    String u = "10";
    String v = "11001001100111111101111011111011001111011101111000";
    assertEquals(49, homomorphism.count(u, v));
  }

  @Test
  public void case66() {
    String u = "0";
    String v = "10011010000001101110001100010001011110010111110011";
    assertEquals(-1, homomorphism.count(u, v));
  }

  @Test
  public void case67() {
    String u = "1";
    String v = "10100011001111000100001011111110001110001010111";
    assertEquals(-1, homomorphism.count(u, v));
  }

  @Test
  public void case68() {
    String u = "11";
    String v = "1111101100011100000111111111011000111000001111";
    assertEquals(-1, homomorphism.count(u, v));
  }

  @Test
  public void case69() {
    String u = "100";
    String v = "1010010111001111000011100101000011100101";
    assertEquals(2, homomorphism.count(u, v));
  }

  @Test
  public void case70() {
    String u = "11";
    String v = "1110111110101001111111101111101010011111";
    assertEquals(-1, homomorphism.count(u, v));
  }

  @Test
  public void case71() {
    String u = "010101010101";
    String v = "111111111111111111111111111111111111111111111111";
    assertEquals(7, homomorphism.count(u, v));
  }

  @Test
  public void case72() {
    String u = "1110";
    String v = "1111111111110";
    assertEquals(4, homomorphism.count(u, v));
  }

  @Test
  public void case73() {
    String u = "110011";
    String v = "000000111100000";
    assertEquals(0, homomorphism.count(u, v));
  }

  @Test
  public void case74() {
    String u = "11";
    String v = "00";
    assertEquals(-1, homomorphism.count(u, v));
  }

  @Test
  public void case75() {
    String u = "111";
    String v = "000000000";
    assertEquals(-1, homomorphism.count(u, v));
  }

}
