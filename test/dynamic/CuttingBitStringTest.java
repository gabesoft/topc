package topc.test.dynamic;

import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
import topc.dynamic.*;

public class CuttingBitStringTest {
    CuttingBitString cuttingbitstring = new CuttingBitString();

    @Test
    public void case1() {
        String S = "101101101";
        assertEquals(3, cuttingbitstring.getmin(S));
    }

    @Test
    public void case2() {
        String S = "1111101";
        assertEquals(1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case3() {
        String S = "00000";
        assertEquals(-1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case4() {
        String S = "110011011";
        assertEquals(3, cuttingbitstring.getmin(S));
    }

    @Test
    public void case5() {
        String S = "1000101011";
        assertEquals(-1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case6() {
        String S = "111011100110101100101110111";
        assertEquals(5, cuttingbitstring.getmin(S));
    }

    @Test
    public void case7() {
        String S = "1101100011010111001001101011011100010111011110101";
        assertEquals(1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case8() {
        String S = "0101";
        assertEquals(-1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case9() {
        String S = "1001";
        assertEquals(-1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case10() {
        String S = "11111111111111111111111111111111111111111111111111";
        assertEquals(50, cuttingbitstring.getmin(S));
    }

    @Test
    public void case11() {
        String S = "10111001110011";
        assertEquals(4, cuttingbitstring.getmin(S));
    }

    @Test
    public void case12() {
        String S = "10011100011110011100111110100001001110011";
        assertEquals(7, cuttingbitstring.getmin(S));
    }

    @Test
    public void case13() {
        String S = "10111110101111000011111010000100111110100001001101";
        assertEquals(4, cuttingbitstring.getmin(S));
    }

    @Test
    public void case14() {
        String S = "11101111011011111101110011101101101111011101101111";
        assertEquals(22, cuttingbitstring.getmin(S));
    }

    @Test
    public void case15() {
        String S = "11111101111111011111011101";
        assertEquals(10, cuttingbitstring.getmin(S));
    }

    @Test
    public void case16() {
        String S = "1011111110111111011111101111111111101111110111";
        assertEquals(14, cuttingbitstring.getmin(S));
    }

    @Test
    public void case17() {
        String S = "11111011111101111110111111011111101111110111111011";
        assertEquals(8, cuttingbitstring.getmin(S));
    }

    @Test
    public void case18() {
        String S = "11111011111111101111111101111111101111110111111111";
        assertEquals(20, cuttingbitstring.getmin(S));
    }

    @Test
    public void case19() {
        String S = "11111011111101111111011111101111111111111101111111";
        assertEquals(20, cuttingbitstring.getmin(S));
    }

    @Test
    public void case20() {
        String S = "11001110001";
        assertEquals(2, cuttingbitstring.getmin(S));
    }

    @Test
    public void case21() {
        String S = "110011000100101101";
        assertEquals(2, cuttingbitstring.getmin(S));
    }

    @Test
    public void case22() {
        String S = "111110100001001";
        assertEquals(2, cuttingbitstring.getmin(S));
    }

    @Test
    public void case23() {
        String S = "101111101";
        assertEquals(5, cuttingbitstring.getmin(S));
    }

    @Test
    public void case24() {
        String S = "11001110001111101";
        assertEquals(6, cuttingbitstring.getmin(S));
    }

    @Test
    public void case25() {
        String S = "0";
        assertEquals(-1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case26() {
        String S = "1";
        assertEquals(1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case27() {
        String S = "00";
        assertEquals(-1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case28() {
        String S = "10";
        assertEquals(-1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case29() {
        String S = "01";
        assertEquals(-1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case30() {
        String S = "11";
        assertEquals(2, cuttingbitstring.getmin(S));
    }

    @Test
    public void case31() {
        String S = "000";
        assertEquals(-1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case32() {
        String S = "100";
        assertEquals(-1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case33() {
        String S = "010";
        assertEquals(-1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case34() {
        String S = "110";
        assertEquals(-1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case35() {
        String S = "001";
        assertEquals(-1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case36() {
        String S = "101";
        assertEquals(1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case37() {
        String S = "011";
        assertEquals(-1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case38() {
        String S = "111";
        assertEquals(3, cuttingbitstring.getmin(S));
    }

    @Test
    public void case39() {
        String S = "00000000000000000000000000000000000000000000000000";
        assertEquals(-1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case40() {
        String S = "101101101101101101101101101101101101101101101101";
        assertEquals(16, cuttingbitstring.getmin(S));
    }

    @Test
    public void case41() {
        String S = "00010111001110100000101101001100010011111111100110";
        assertEquals(-1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case42() {
        String S = "11101001011110011100110111100111000111000100001010";
        assertEquals(-1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case43() {
        String S = "01010101001001100110001101101110111100111111001100";
        assertEquals(-1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case44() {
        String S = "01000000100101011000001001011111111100100100100111";
        assertEquals(-1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case45() {
        String S = "10001110000011011101010011010001011111010100000001";
        assertEquals(-1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case46() {
        String S = "11110101100011101001011001110010110000";
        assertEquals(-1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case47() {
        String S = "0101011001101011010111000100010";
        assertEquals(-1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case48() {
        String S = "001001011000000011001011100001000111000";
        assertEquals(-1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case49() {
        String S = "11001111010110010000110011100110011111001101";
        assertEquals(-1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case50() {
        String S = "0011100";
        assertEquals(-1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case51() {
        String S = "1";
        assertEquals(1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case52() {
        String S = "101";
        assertEquals(1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case53() {
        String S = "11001";
        assertEquals(1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case54() {
        String S = "1111101";
        assertEquals(1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case55() {
        String S = "1001110001";
        assertEquals(1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case56() {
        String S = "110000110101";
        assertEquals(1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case57() {
        String S = "11110100001001";
        assertEquals(1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case58() {
        String S = "10011000100101101";
        assertEquals(1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case59() {
        String S = "1011111010111100001";
        assertEquals(1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case60() {
        String S = "111011100110101100101";
        assertEquals(1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case61() {
        String S = "100101010000001011111001";
        assertEquals(1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case62() {
        String S = "10111010010000111011011101";
        assertEquals(1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case63() {
        String S = "1110100011010100101001010001";
        assertEquals(1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case64() {
        String S = "1001000110000100111001110010101";
        assertEquals(1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case65() {
        String S = "101101011110011000100000111101001";
        assertEquals(1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case66() {
        String S = "11100011010111111010100100110001101";
        assertEquals(1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case67() {
        String S = "10001110000110111100100110111111000001";
        assertEquals(1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case68() {
        String S = "1011000110100010101111000010111011000101";
        assertEquals(1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case69() {
        String S = "110111100000101101101011001110100111011001";
        assertEquals(1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case70() {
        String S = "100010101100011100100011000001001000100111101";
        assertEquals(1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case71() {
        String S = "10101101011110001110101111000101101011000110001";
        assertEquals(1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case72() {
        String S = "1101100011010111001001101011011100010111011110101";
        assertEquals(1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case73() {
        String S = "11110011100111011100111100110110110111100110111001";
        assertEquals(16, cuttingbitstring.getmin(S));
    }

    @Test
    public void case74() {
        String S = "101110011100011001110001111110110011100011111101";
        assertEquals(7, cuttingbitstring.getmin(S));
    }

    @Test
    public void case75() {
        String S = "11001110011111010000100110110111100111110100001001";
        assertEquals(8, cuttingbitstring.getmin(S));
    }

    @Test
    public void case76() {
        String S = "1111010000100111110100001001110000110101";
        assertEquals(3, cuttingbitstring.getmin(S));
    }

    @Test
    public void case77() {
        String S = "101111011100110101100101110011011111010111100001";
        assertEquals(4, cuttingbitstring.getmin(S));
    }

    @Test
    public void case78() {
        String S = "111010001101010010100101000110011100011";
        assertEquals(3, cuttingbitstring.getmin(S));
    }

    @Test
    public void case79() {
        String S = "11110100001001111011100110101100101";
        assertEquals(2, cuttingbitstring.getmin(S));
    }

    @Test
    public void case80() {
        String S = "111101000010011001010100000010111110011";
        assertEquals(3, cuttingbitstring.getmin(S));
    }

    @Test
    public void case81() {
        String S = "1111101101110100100001110110111011100110011100011";
        assertEquals(5, cuttingbitstring.getmin(S));
    }

    @Test
    public void case82() {
        String S = "1001110001";
        assertEquals(1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case83() {
        String S = "11011110000010110110101100111010011101100111001";
        assertEquals(2, cuttingbitstring.getmin(S));
    }

    @Test
    public void case84() {
        String S = "101110011100110110110110111001110011100110111001";
        assertEquals(12, cuttingbitstring.getmin(S));
    }

    @Test
    public void case85() {
        String S = "11111011100111001100111000110011100011011001110001";
        assertEquals(7, cuttingbitstring.getmin(S));
    }

    @Test
    public void case86() {
        String S = "1100110011100011111010000100110111110100001001";
        assertEquals(5, cuttingbitstring.getmin(S));
    }

    @Test
    public void case87() {
        String S = "111110110111110101111000011001110001";
        assertEquals(3, cuttingbitstring.getmin(S));
    }

    @Test
    public void case88() {
        String S = "101111011100110101100101100101010000001011111001";
        assertEquals(3, cuttingbitstring.getmin(S));
    }

    @Test
    public void case89() {
        String S = "100110001001011011110100011010100101001010001";
        assertEquals(2, cuttingbitstring.getmin(S));
    }

    @Test
    public void case90() {
        String S = "101101011110011000100000111101001101";
        assertEquals(2, cuttingbitstring.getmin(S));
    }

    @Test
    public void case91() {
        String S = "111011100110101100101101101";
        assertEquals(3, cuttingbitstring.getmin(S));
    }

    @Test
    public void case92() {
        String S = "1011111010111100001";
        assertEquals(1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case93() {
        String S = "10111001110111100000101101101011001110100111011001";
        assertEquals(3, cuttingbitstring.getmin(S));
    }

    @Test
    public void case94() {
        String S = "10111010010000111011011101100101010000001011111001";
        assertEquals(2, cuttingbitstring.getmin(S));
    }

    @Test
    public void case95() {
        String S = "11111111111111111111111111110";
        assertEquals(-1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case96() {
        String S = "1011111011011111011011111011011111011011111011111";
        assertEquals(29, cuttingbitstring.getmin(S));
    }

    @Test
    public void case97() {
        String S = "0011";
        assertEquals(-1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case98() {
        String S = "00000000000000000000000001111111111111111111111111";
        assertEquals(-1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case99() {
        String S = "11001000110000100111001110010101";
        assertEquals(2, cuttingbitstring.getmin(S));
    }

    @Test
    public void case100() {
        String S = "10101101011110001110101111000101101011000110001101";
        assertEquals(2, cuttingbitstring.getmin(S));
    }

    @Test
    public void case101() {
        String S = "1000111000011011110010011011111100000110111001";
        assertEquals(3, cuttingbitstring.getmin(S));
    }

    @Test
    public void case102() {
        String S = "1010101";
        assertEquals(-1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case103() {
        String S = "111110111111011111101101";
        assertEquals(4, cuttingbitstring.getmin(S));
    }

    @Test
    public void case104() {
        String S = "1000000000000000000000000000000000000000000000000";
        assertEquals(-1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case105() {
        String S = "000001111101";
        assertEquals(-1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case106() {
        String S = "11010110101111000111010111100010110101100011000111";
        assertEquals(4, cuttingbitstring.getmin(S));
    }

    @Test
    public void case107() {
        String S = "110111110101";
        assertEquals(-1, cuttingbitstring.getmin(S));
    }

    @Test
    public void case108() {
        String S = "11111011111010111100001";
        assertEquals(5, cuttingbitstring.getmin(S));
    }

    @Test
    public void case109() {
        String S = "11011000110101110010011010110111000101110111101011";
        assertEquals(2, cuttingbitstring.getmin(S));
    }

}
