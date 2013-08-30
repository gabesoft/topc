package topc.test.search;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.search.*;

public class XorGameTest {
    XorGame xorgame = new XorGame();

    @Test
    public void case1() {
        String S = "10101";
        String E = "11011";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case2() {
        String S = "001100";
        String E = "001100";
        assertEquals(0, xorgame.play(S, E));
    }

    @Test
    public void case3() {
        String S = "110";
        String E = "011";
        assertEquals(2, xorgame.play(S, E));
    }

    @Test
    public void case4() {
        String S = "10101010";
        String E = "11111111";
        assertEquals(-1, xorgame.play(S, E));
    }

    @Test
    public void case5() {
        String S = "001011010101101";
        String E = "001000101101101";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case6() {
        String S = "0";
        String E = "0";
        assertEquals(0, xorgame.play(S, E));
    }

    @Test
    public void case7() {
        String S = "0";
        String E = "1";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case8() {
        String S = "1";
        String E = "0";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case9() {
        String S = "1";
        String E = "1";
        assertEquals(0, xorgame.play(S, E));
    }

    @Test
    public void case10() {
        String S = "00";
        String E = "01";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case11() {
        String S = "10";
        String E = "11";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case12() {
        String S = "11";
        String E = "00";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case13() {
        String S = "000";
        String E = "111";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case14() {
        String S = "101";
        String E = "010";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case15() {
        String S = "101";
        String E = "111";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case16() {
        String S = "000";
        String E = "101";
        assertEquals(2, xorgame.play(S, E));
    }

    @Test
    public void case17() {
        String S = "0000";
        String E = "1010";
        assertEquals(2, xorgame.play(S, E));
    }

    @Test
    public void case18() {
        String S = "0000";
        String E = "0101";
        assertEquals(2, xorgame.play(S, E));
    }

    @Test
    public void case19() {
        String S = "0000";
        String E = "1001";
        assertEquals(2, xorgame.play(S, E));
    }

    @Test
    public void case20() {
        String S = "1010";
        String E = "0101";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case21() {
        String S = "1101";
        String E = "1000";
        assertEquals(2, xorgame.play(S, E));
    }

    @Test
    public void case22() {
        String S = "1111";
        String E = "0110";
        assertEquals(2, xorgame.play(S, E));
    }

    @Test
    public void case23() {
        String S = "1010";
        String E = "0101";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case24() {
        String S = "1010";
        String E = "1110";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case25() {
        String S = "0110";
        String E = "1110";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case26() {
        String S = "0010";
        String E = "1001";
        assertEquals(3, xorgame.play(S, E));
    }

    @Test
    public void case27() {
        String S = "0111";
        String E = "0000";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case28() {
        String S = "1001011010101";
        String E = "1000011010101";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case29() {
        String S = "001010101001001";
        String E = "110101010110110";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case30() {
        String S = "0000000000";
        String E = "1111111111";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case31() {
        String S = "0000000000000000000000000000000000000000";
        String E = "1111111111111111111111111111111111111111";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case32() {
        String S = "0000000000000000000000000000000000000000";
        String E = "1000000000000000000000000000000000000001";
        assertEquals(-1, xorgame.play(S, E));
    }

    @Test
    public void case33() {
        String S = "0000000000000000000000000000000000000000";
        String E = "1000000000000000000000000000000000000000";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case34() {
        String S = "0000000000000000000000000000000000000000";
        String E = "0000000000001000000000000000000000000000";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case35() {
        String S = "0000000000000000000000000000000000000000";
        String E = "0000000000000000000001111111111000000000";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case36() {
        String S = "1101001010101000000011010010000100111001";
        String E = "0101001010101000000011010010000100111000";
        assertEquals(-1, xorgame.play(S, E));
    }

    @Test
    public void case37() {
        String S = "1100001101000011110100111011010101001110";
        String E = "1100001101000011110100111011010101001110";
        assertEquals(0, xorgame.play(S, E));
    }

    @Test
    public void case38() {
        String S = "1011101001010100100101010101011110100011";
        String E = "1011101001010100100100010101011110100011";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case39() {
        String S = "10100111010010";
        String E = "10100110101100";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case40() {
        String S = "11110011111100111011";
        String E = "11001100000011011011";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case41() {
        String S = "1111000111101100001100000000101001110000100010";
        String E = "1111000110010011110011111100101001110000100010";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case42() {
        String S = "1011011000011010011111101001011111110101111";
        String E = "1011011000000101100000010110111111110101111";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case43() {
        String S = "0111101110011111000000011100111010110110100011101";
        String E = "0111101110011111000000011100100100110110100011101";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case44() {
        String S = "1001001010111010";
        String E = "1111001010111010";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case45() {
        String S = "011111111";
        String E = "011100001";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case46() {
        String S = "101011100011010001011000001010101111";
        String E = "010100011100101110100110001010101111";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case47() {
        String S = "0011010011010100110001010";
        String E = "1100110011010100110001010";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case48() {
        String S = "101001";
        String E = "110110";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case49() {
        String S = "1111010100011011010001001101";
        String E = "1111010100011000100001001101";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case50() {
        String S = "1010101011001011000011000101001110010011111111010";
        String E = "1010101011001011000011000101000001101100000000100";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case51() {
        String S = "1";
        String E = "0";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case52() {
        String S = "11101010101011101100111110";
        String E = "11101010100100010100111110";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case53() {
        String S = "1100100101111101001111001100000001000000001010111";
        String E = "1100011010000010110000110100000001000000001010111";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case54() {
        String S = "0010011100000011";
        String E = "0010011100001101";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case55() {
        String S = "01111110111100101010001101";
        String E = "01111110100011010101111101";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case56() {
        String S = "11111001110010001111001001011100110101010110000";
        String E = "11000110001101110111001001011100110101010110000";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case57() {
        String S = "011011001011001010101111010000011";
        String E = "011011001011000101011111010000011";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case58() {
        String S = "0001100010111100100001111011001";
        String E = "0001100101000011011110000100110";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case59() {
        String S = "010101001111011010010";
        String E = "011101001111011010010";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case60() {
        String S = "11011010010101010100000000000010110";
        String E = "11011010011101010100000000000010110";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case61() {
        String S = "1100110100010111110";
        String E = "1100110110010111110";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case62() {
        String S = "0001101010000010111111100111000001000001010011110";
        String E = "0001101010000010111111100111000001000101010011110";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case63() {
        String S = "011100111011110011111100011011";
        String E = "011101111011110011111100011011";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case64() {
        String S = "00001011";
        String E = "01001011";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case65() {
        String S = "010110010101111101111001";
        String E = "010110010111111101111001";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case66() {
        String S = "0101101101110010001000010011";
        String E = "0101101101100010001000010011";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case67() {
        String S = "1001000000010111110000111010001";
        String E = "1001000000010111110000101010001";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case68() {
        String S = "001110000011011001101";
        String E = "001111000011011001101";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case69() {
        String S = "00111110010010000001010001010010111";
        String E = "01000011111001000001111110110100001";
        assertEquals(-1, xorgame.play(S, E));
    }

    @Test
    public void case70() {
        String S = "11101100000011011011000";
        String E = "10001010000111101010010";
        assertEquals(-1, xorgame.play(S, E));
    }

    @Test
    public void case71() {
        String S = "11011111111110110110110111101000101000";
        String E = "11100110111111100100110000001110011010";
        assertEquals(-1, xorgame.play(S, E));
    }

    @Test
    public void case72() {
        String S = "1000000011011000101011011100111000";
        String E = "0001111001001100111000000000111010";
        assertEquals(-1, xorgame.play(S, E));
    }

    @Test
    public void case73() {
        String S = "0000101100111100110";
        String E = "0011110101011110101";
        assertEquals(-1, xorgame.play(S, E));
    }

    @Test
    public void case74() {
        String S = "1001010100011010101";
        String E = "0000110011110001101";
        assertEquals(-1, xorgame.play(S, E));
    }

    @Test
    public void case75() {
        String S = "000000000111001011000110111010110001101100";
        String E = "111001011010110100011000101000100001101100";
        assertEquals(-1, xorgame.play(S, E));
    }

    @Test
    public void case76() {
        String S = "00000";
        String E = "11000";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case77() {
        String S = "1010111011011110001100";
        String E = "0011101001110100011010";
        assertEquals(-1, xorgame.play(S, E));
    }

    @Test
    public void case78() {
        String S = "11010111110011011001001110000101110111001";
        String E = "11101000101011010100000110101100110110101";
        assertEquals(-1, xorgame.play(S, E));
    }

    @Test
    public void case79() {
        String S = "1110010011100101100001000101";
        String E = "1110010011100101100110111001";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case80() {
        String S = "101100";
        String E = "111011";
        assertEquals(-1, xorgame.play(S, E));
    }

    @Test
    public void case81() {
        String S = "001011011100111011101101100111000010110";
        String E = "000100100000111011101101111000111101110";
        assertEquals(-1, xorgame.play(S, E));
    }

    @Test
    public void case82() {
        String S = "10011010000101011110000000110110";
        String E = "10011010000100100001100000100110";
        assertEquals(-1, xorgame.play(S, E));
    }

    @Test
    public void case83() {
        String S = "0000111101000000001011111111110010001101000100101";
        String E = "0000111110111110001100000000001110001101000100101";
        assertEquals(-1, xorgame.play(S, E));
    }

    @Test
    public void case84() {
        String S = "0111";
        String E = "1100";
        assertEquals(3, xorgame.play(S, E));
    }

    @Test
    public void case85() {
        String S = "111";
        String E = "010";
        assertEquals(2, xorgame.play(S, E));
    }

    @Test
    public void case86() {
        String S = "1111100011001100110001";
        String E = "1111101100110011001001";
        assertEquals(1, xorgame.play(S, E));
    }

    @Test
    public void case87() {
        String S = "101010101";
        String E = "110010110";
        assertEquals(-1, xorgame.play(S, E));
    }

    @Test
    public void case88() {
        String S = "00000101001001000011001100011100110010";
        String E = "00000100110110101100110011011100110010";
        assertEquals(-1, xorgame.play(S, E));
    }

    @Test
    public void case89() {
        String S = "0000";
        String E = "1011";
        assertEquals(3, xorgame.play(S, E));
    }

    @Test
    public void case90() {
        String S = "0000";
        String E = "1101";
        assertEquals(3, xorgame.play(S, E));
    }

    @Test
    public void case91() {
        String S = "0101";
        String E = "0000";
        assertEquals(2, xorgame.play(S, E));
    }

    @Test
    public void case92() {
        String S = "0000";
        String E = "1001";
        assertEquals(2, xorgame.play(S, E));
    }

    @Test
    public void case93() {
        String S = "0000";
        String E = "1010";
        assertEquals(2, xorgame.play(S, E));
    }

    @Test
    public void case94() {
        String S = "1101";
        String E = "0000";
        assertEquals(3, xorgame.play(S, E));
    }

}
