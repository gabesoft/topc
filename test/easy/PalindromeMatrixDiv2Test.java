package topc.test.easy;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.easy.*;

public class PalindromeMatrixDiv2Test {
    PalindromeMatrixDiv2 palindromematrixdiv2 = new PalindromeMatrixDiv2();

    @Test
    public void case1() {
        String[] A = { "0000", "1000", "1100", "1110" };
        int rowCount = 2;
        int columnCount = 2;
        assertEquals(1, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case2() {
        String[] A = { "0000", "1000", "1100", "1110" };
        int rowCount = 3;
        int columnCount = 2;
        assertEquals(3, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case3() {
        String[] A = { "01", "10" };
        int rowCount = 1;
        int columnCount = 1;
        assertEquals(1, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case4() {
        String[] A = { "1110", "0001" };
        int rowCount = 0;
        int columnCount = 0;
        assertEquals(0, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case5() {
        String[] A = { "01010101", "01010101", "01010101", "01010101", "01010101", "01010101", "01010101", "01010101" };
        int rowCount = 2;
        int columnCount = 2;
        assertEquals(8, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case6() {
        String[] A = { "00", "10" };
        int rowCount = 2;
        int columnCount = 1;
        assertEquals(1, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case7() {
        String[] A = { "1000", "0001" };
        int rowCount = 2;
        int columnCount = 4;
        assertEquals(2, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case8() {
        String[] A = { "011011", "001111" };
        int rowCount = 1;
        int columnCount = 3;
        assertEquals(2, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case9() {
        String[] A = { "11", "01", "01", "00" };
        int rowCount = 3;
        int columnCount = 2;
        assertEquals(4, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case10() {
        String[] A = { "0010", "0111", "0111", "1000" };
        int rowCount = 2;
        int columnCount = 1;
        assertEquals(2, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case11() {
        String[] A = { "001101", "101111", "100111", "100111" };
        int rowCount = 4;
        int columnCount = 4;
        assertEquals(6, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case12() {
        String[] A = { "11", "11", "00", "10", "00", "10" };
        int rowCount = 2;
        int columnCount = 1;
        assertEquals(2, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case13() {
        String[] A = { "0111", "0111", "0100", "0101", "1111", "0000" };
        int rowCount = 1;
        int columnCount = 3;
        assertEquals(3, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case14() {
        String[] A = { "100100", "111110", "000001", "100100", "100010", "011110" };
        int rowCount = 3;
        int columnCount = 3;
        assertEquals(5, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case15() {
        String[] A = { "11111011", "10111101" };
        int rowCount = 1;
        int columnCount = 4;
        assertEquals(0, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case16() {
        String[] A = { "00", "10", "11", "00", "00", "10", "00", "00" };
        int rowCount = 2;
        int columnCount = 2;
        assertEquals(2, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case17() {
        String[] A = { "11111001", "11111111", "11111010", "01101110" };
        int rowCount = 3;
        int columnCount = 3;
        assertEquals(3, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case18() {
        String[] A = { "1101", "0000", "0100", "0101", "0101", "0101", "1001", "0001" };
        int rowCount = 2;
        int columnCount = 3;
        assertEquals(3, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case19() {
        String[] A = { "11111111", "11111111", "10110111", "10111111", "00110100", "01111011" };
        int rowCount = 2;
        int columnCount = 5;
        assertEquals(3, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case20() {
        String[] A = { "101010", "100000", "000100", "010000", "001001", "100000", "111111", "110000" };
        int rowCount = 3;
        int columnCount = 6;
        assertEquals(13, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case21() {
        String[] A = { "00010001", "00000100", "00000011", "00100000", "11110001", "10110100", "11101100", "01100101" };
        int rowCount = 0;
        int columnCount = 0;
        assertEquals(0, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case22() {
        String[] A = { "11001110", "11101010", "10010110", "00111010", "00111100", "00110101", "01101100", "01110101" };
        int rowCount = 8;
        int columnCount = 0;
        assertEquals(19, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case23() {
        String[] A = { "10010111", "01011000", "10011111", "11110011", "01010101", "11011111", "00011101", "10010111" };
        int rowCount = 0;
        int columnCount = 8;
        assertEquals(8, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case24() {
        String[] A = { "00110111", "11110111", "11011101", "11001000", "01110100", "01101001", "00110100", "11101001" };
        int rowCount = 8;
        int columnCount = 8;
        assertEquals(25, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case25() {
        String[] A = { "00000000", "00000000", "00000000", "00000000", "00000000", "00000000", "00000000", "00000000" };
        int rowCount = 2;
        int columnCount = 6;
        assertEquals(0, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case26() {
        String[] A = { "00000000", "00000000", "00000000", "00000000", "00000000", "00000000", "00000000", "00000000" };
        int rowCount = 3;
        int columnCount = 6;
        assertEquals(0, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case27() {
        String[] A = { "11111111", "11111111", "11111111", "11111111", "11111111", "11111111", "11111111", "11111111" };
        int rowCount = 6;
        int columnCount = 5;
        assertEquals(0, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case28() {
        String[] A = { "11111111", "11111111", "11111111", "11111111", "11111111", "11111111", "11111111", "11111111" };
        int rowCount = 3;
        int columnCount = 5;
        assertEquals(0, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case29() {
        String[] A = { "10001110", "11100110", "11001111", "01100100", "00100000", "01110110", "10001101", "11111111" };
        int rowCount = 5;
        int columnCount = 7;
        assertEquals(13, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case30() {
        String[] A = { "11101101", "10000100", "11100101", "01000111", "00101010", "10000110", "10110110", "01000011" };
        int rowCount = 6;
        int columnCount = 8;
        assertEquals(17, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case31() {
        String[] A = { "00000011", "00001001", "11100111", "00010101", "01010100", "11001001", "00101011", "10101111" };
        int rowCount = 8;
        int columnCount = 8;
        assertEquals(22, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case32() {
        String[] A = { "11110100", "00001000", "11100010", "10011011", "11001000", "01100011", "10011101", "11111001" };
        int rowCount = 5;
        int columnCount = 6;
        assertEquals(10, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case33() {
        String[] A = { "10111100", "00101100", "00110110", "00110101", "01100011", "01011110", "11000101", "00100000" };
        int rowCount = 3;
        int columnCount = 5;
        assertEquals(8, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case34() {
        String[] A = { "01000001", "10001111", "11000100", "11101110", "00111101", "10101110", "10101101", "11011011" };
        int rowCount = 5;
        int columnCount = 5;
        assertEquals(10, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case35() {
        String[] A = { "11011101", "11000001", "10101100", "10110110", "01111110", "11100100", "10010110", "01111100" };
        int rowCount = 6;
        int columnCount = 6;
        assertEquals(13, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case36() {
        String[] A = { "10111011", "01010101", "10100110", "00001111", "01100110", "01111011", "10111101", "01010001" };
        int rowCount = 6;
        int columnCount = 8;
        assertEquals(19, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case37() {
        String[] A = { "00110001", "10011011", "00010000", "11000011", "10111000", "11001000", "10001110", "01001101" };
        int rowCount = 3;
        int columnCount = 8;
        assertEquals(18, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case38() {
        String[] A = { "10111100", "01110001", "11100001", "00011101", "10100010", "00011001", "01001100", "01111110" };
        int rowCount = 6;
        int columnCount = 5;
        assertEquals(13, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case39() {
        String[] A = { "10011101", "00001111", "01000110", "00111101", "10100010", "00001110", "11100010", "01100011" };
        int rowCount = 8;
        int columnCount = 7;
        assertEquals(23, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case40() {
        String[] A = { "11010101", "00000100", "00101111", "01000010", "11110110", "10111001", "01111000", "10011010" };
        int rowCount = 7;
        int columnCount = 6;
        assertEquals(15, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case41() {
        String[] A = { "10010111", "10001100", "11100111", "00001001", "00101011", "00011111", "10011001", "11010011" };
        int rowCount = 8;
        int columnCount = 8;
        assertEquals(18, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case42() {
        String[] A = { "00101001", "00011111", "00011010", "10111101", "01111110", "00001101", "10011111", "01100101" };
        int rowCount = 8;
        int columnCount = 7;
        assertEquals(18, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case43() {
        String[] A = { "00000111", "10100001", "00100101", "10100010", "10001110", "01100110", "01100010", "00111010" };
        int rowCount = 6;
        int columnCount = 7;
        assertEquals(18, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case44() {
        String[] A = { "10000010", "10110101", "01110000", "10100100", "11110110", "01001001", "11010000", "10110100" };
        int rowCount = 6;
        int columnCount = 6;
        assertEquals(16, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case45() {
        String[] A = { "01000011", "01000100", "11111111", "01101010", "01001111", "10100111", "01111011", "10110000" };
        int rowCount = 7;
        int columnCount = 6;
        assertEquals(15, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case46() {
        String[] A = { "00000111", "11000011", "10100100", "11010011", "01001000", "00101101", "01011010", "10011000" };
        int rowCount = 7;
        int columnCount = 7;
        assertEquals(17, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case47() {
        String[] A = { "11011011", "00100111", "10110000", "11001001", "11011000", "10101100", "01001110", "01011110" };
        int rowCount = 6;
        int columnCount = 7;
        assertEquals(13, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case48() {
        String[] A = { "11110101", "00110100", "11110000", "10101001", "11111110", "11111111", "00011100", "00111000" };
        int rowCount = 8;
        int columnCount = 8;
        assertEquals(16, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case49() {
        String[] A = { "00100100", "01111110", "00111100", "00111100", "00111100", "00111100", "01111110", "00100100" };
        int rowCount = 4;
        int columnCount = 4;
        assertEquals(0, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case50() {
        String[] A = { "00000000", "11000111", "11111111", "00100100", "11100100", "11111111", "11100111", "00000000" };
        int rowCount = 4;
        int columnCount = 4;
        assertEquals(0, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case51() {
        String[] A = { "01100010", "10111101", "11011001", "11010101", "10111101", "10011000", "10111101", "01100110" };
        int rowCount = 4;
        int columnCount = 4;
        assertEquals(1, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case52() {
        String[] A = { "00000001", "01010111", "11110101", "11011011", "11011011", "11011101", "11000001", "10000001" };
        int rowCount = 4;
        int columnCount = 4;
        assertEquals(2, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case53() {
        String[] A = { "11001001", "11000100", "01111111", "11111111", "11111110", "01111110", "00000100", "00001001" };
        int rowCount = 4;
        int columnCount = 4;
        assertEquals(2, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case54() {
        String[] A = { "11110110", "01010010", "10111101", "01011110", "01000010", "11011001", "01011010", "01001011" };
        int rowCount = 4;
        int columnCount = 4;
        assertEquals(3, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case55() {
        String[] A = { "00011001", "01000011", "11000011", "01101001", "10010000", "01110010", "11000010", "10100001" };
        int rowCount = 4;
        int columnCount = 4;
        assertEquals(6, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case56() {
        String[] A = { "01100100", "10000110", "01001011", "01010011", "11000000", "11000011", "01000110", "00111001" };
        int rowCount = 4;
        int columnCount = 4;
        assertEquals(5, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case57() {
        String[] A = { "01001011", "00001100", "01100000", "10101000", "00111000", "01011111", "00101000", "11000011" };
        int rowCount = 4;
        int columnCount = 4;
        assertEquals(6, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case58() {
        String[] A = { "01111111", "10000000", "11101000", "01001011", "01011100", "00101110", "01000011", "01111110" };
        int rowCount = 4;
        int columnCount = 4;
        assertEquals(4, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case59() {
        String[] A = { "00001111", "01010101", "10010110", "01110001", "10001110", "01101001", "10101010", "11110000" };
        int rowCount = 6;
        int columnCount = 6;
        assertEquals(28, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case60() {
        String[] A = { "01101001", "00001111", "11110000", "11101000", "00010111", "00001111", "11110000", "10010110" };
        int rowCount = 6;
        int columnCount = 6;
        assertEquals(28, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case61() {
        String[] A = { "10010110", "11110000", "00110011", "11110000", "00001111", "11001100", "00001111", "01101001" };
        int rowCount = 6;
        int columnCount = 7;
        assertEquals(30, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case62() {
        String[] A = { "01001101", "11110000", "01010101", "00010111", "11101000", "10101010", "00001111", "10110010" };
        int rowCount = 6;
        int columnCount = 7;
        assertEquals(30, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case63() {
        String[] A = { "11110000", "10001110", "01110001", "00001111", "11110000", "10001110", "01110001", "00001111" };
        int rowCount = 7;
        int columnCount = 6;
        assertEquals(30, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case64() {
        String[] A = { "10110010", "01001101", "11101000", "11001100", "00110011", "00010111", "10110010", "01001101" };
        int rowCount = 7;
        int columnCount = 6;
        assertEquals(30, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case65() {
        String[] A = { "01010101", "01010101", "01010101", "01010101", "01010101", "01010101", "01010101", "01010101" };
        int rowCount = 2;
        int columnCount = 2;
        assertEquals(8, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case66() {
        String[] A = { "0000", "1000", "1100", "1110" };
        int rowCount = 2;
        int columnCount = 2;
        assertEquals(1, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case67() {
        String[] A = { "1010", "0000", "0110", "1100" };
        int rowCount = 4;
        int columnCount = 4;
        assertEquals(6, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case68() {
        String[] A = { "10100110", "11111111", "00000000", "10101010", "01010101", "11110000" };
        int rowCount = 6;
        int columnCount = 8;
        assertEquals(14, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case69() {
        String[] A = { "111111", "111111", "111111", "111111", "111111", "111111" };
        int rowCount = 0;
        int columnCount = 0;
        assertEquals(0, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case70() {
        String[] A = { "10", "01", "10", "11" };
        int rowCount = 2;
        int columnCount = 2;
        assertEquals(3, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case71() {
        String[] A = { "11", "01", "00", "10" };
        int rowCount = 4;
        int columnCount = 2;
        assertEquals(2, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

    @Test
    public void case72() {
        String[] A = { "01010101", "01010101", "01010101", "01010101", "01010101", "01010101", "01010101", "11111111" };
        int rowCount = 3;
        int columnCount = 8;
        assertEquals(12, palindromematrixdiv2.minChange(A, rowCount, columnCount));
    }

}
